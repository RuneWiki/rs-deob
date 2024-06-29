import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ia")
public class class84 {

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "Lj;")
    private class153 field1265 = new class153((byte[]) null);

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "[B")
    private static byte[] field1266 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!ia", name = "e", descriptor = "I")
    private int field1269;

    @OriginalMember(owner = "client!ia", name = "h", descriptor = "I")
    public int field1272;

    @OriginalMember(owner = "client!ia", name = "g", descriptor = "J")
    private long field1271;

    @OriginalMember(owner = "client!ia", name = "c", descriptor = "[I")
    private int[] field1267;

    @OriginalMember(owner = "client!ia", name = "d", descriptor = "[I")
    public int[] field1268;

    @OriginalMember(owner = "client!ia", name = "f", descriptor = "[I")
    private int[] field1270;

    @OriginalMember(owner = "client!ia", name = "i", descriptor = "[I")
    private int[] field1273;

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(I)V", line = 4)
    public final void method562(int arg0) {
        this.field1265.field2367 = this.field1273[arg0];
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "()I", line = 9)
    public final int method563() {
        int var1 = this.field1273.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field1273[var4] >= 0 && this.field1268[var4] < var3) {
                var2 = var4;
                var3 = this.field1268[var4];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "([B)V", line = 34)
    public final void method564(byte[] arg0) {
        this.field1265.field2359 = arg0;
        this.field1265.field2367 = 10;
        int var2 = this.field1265.method1069(70);
        this.field1272 = this.field1265.method1069(100);
        this.field1269 = 500000;
        this.field1270 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var4 = this.field1265.method1089((byte) -14);
            int var5 = this.field1265.method1089((byte) -14);
            if (var4 == 1297379947) {
                this.field1270[var3] = this.field1265.field2367;
                var3++;
            }
            this.field1265.field2367 += var5;
        }
        this.field1271 = 0L;
        this.field1273 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field1273[var6] = this.field1270[var6];
        }
        this.field1268 = new int[var2];
        this.field1267 = new int[var2];
    }

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "(I)J", line = 89)
    public final long method565(int arg0) {
        return (long) this.field1269 * (long) arg0 + this.field1271;
    }

    @OriginalMember(owner = "client!ia", name = "c", descriptor = "(I)I", line = 94)
    private final int method566(int arg0) {
        byte var2 = this.field1265.field2359[this.field1265.field2367];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field1267[arg0] = var3;
            this.field1265.field2367++;
        } else {
            var3 = this.field1267[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method573(arg0, var3);
        }
        int var4 = this.field1265.method1082(-87);
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field1265.field2359[this.field1265.field2367] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field1265.field2367++;
                this.field1267[arg0] = var5;
                return this.method573(arg0, var5);
            }
        }
        this.field1265.field2367 += var4;
        return 0;
    }

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "()I", line = 134)
    public final int method567() {
        return this.field1273.length;
    }

    @OriginalMember(owner = "client!ia", name = "<init>", descriptor = "()V", line = 264)
    public class84() {
    }

    @OriginalMember(owner = "client!ia", name = "<init>", descriptor = "([B)V", line = 266)
    public class84(byte[] arg0) {
        this.method564(arg0);
    }

    @OriginalMember(owner = "client!ia", name = "c", descriptor = "()V", line = 145)
    public final void method568() {
        this.field1265.field2359 = null;
        this.field1270 = null;
        this.field1273 = null;
        this.field1268 = null;
        this.field1267 = null;
    }

    @OriginalMember(owner = "client!ia", name = "d", descriptor = "(I)V", line = 156)
    public final void method569(int arg0) {
        this.field1273[arg0] = this.field1265.field2367;
    }

    @OriginalMember(owner = "client!ia", name = "d", descriptor = "()V", line = 160)
    public static void method570() {
        field1266 = null;
    }

    @OriginalMember(owner = "client!ia", name = "e", descriptor = "()Z", line = 166)
    public final boolean method571() {
        return this.field1265.field2359 != null;
    }

    @OriginalMember(owner = "client!ia", name = "f", descriptor = "()Z", line = 170)
    public final boolean method572() {
        int var1 = this.field1273.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field1273[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(II)I", line = 184)
    private final int method573(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field1266[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field1265.method1042((byte) -115) << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field1265.method1042((byte) -42) << 16;
            }
            return var8;
        }
        int var3 = this.field1265.method1042((byte) -42);
        int var4 = this.field1265.method1082(-80);
        if (var3 == 47) {
            this.field1265.field2367 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field1265.method1088(-30917);
            var4 -= 3;
            int var6 = this.field1268[arg0];
            this.field1271 += (long) (this.field1269 - var5) * (long) var6;
            this.field1269 = var5;
            this.field1265.field2367 += var4;
            return 2;
        } else {
            this.field1265.field2367 += var4;
            return 3;
        }
    }

    @OriginalMember(owner = "client!ia", name = "e", descriptor = "(I)I", line = 227)
    public final int method574(int arg0) {
        return this.method566(arg0);
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(J)V", line = 234)
    public final void method575(long arg0) {
        this.field1271 = arg0;
        int var3 = this.field1273.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field1268[var4] = 0;
            this.field1267[var4] = 0;
            this.field1265.field2367 = this.field1270[var4];
            this.method577(var4);
            this.field1273[var4] = this.field1265.field2367;
        }
    }

    @OriginalMember(owner = "client!ia", name = "g", descriptor = "()V", line = 252)
    public final void method576() {
        this.field1265.field2367 = -1;
    }

    @OriginalMember(owner = "client!ia", name = "f", descriptor = "(I)V", line = 256)
    public final void method577(int arg0) {
        int var2 = this.field1265.method1082(-111);
        this.field1268[arg0] += var2;
    }
}
