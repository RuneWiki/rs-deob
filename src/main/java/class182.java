import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rd")
public class class182 {

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "Lp;")
    private class107 field2624 = new class107((byte[]) null);

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "[B")
    private static byte[] field2625 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!rd", name = "d", descriptor = "I")
    private int field2627;

    @OriginalMember(owner = "client!rd", name = "h", descriptor = "I")
    public int field2631;

    @OriginalMember(owner = "client!rd", name = "g", descriptor = "J")
    private long field2630;

    @OriginalMember(owner = "client!rd", name = "c", descriptor = "[I")
    private int[] field2626;

    @OriginalMember(owner = "client!rd", name = "e", descriptor = "[I")
    private int[] field2628;

    @OriginalMember(owner = "client!rd", name = "f", descriptor = "[I")
    public int[] field2629;

    @OriginalMember(owner = "client!rd", name = "i", descriptor = "[I")
    private int[] field2632;

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "()I", line = 5)
    public final int method1254() {
        int var1 = this.field2632.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field2632[var4] >= 0 && this.field2629[var4] < var3) {
                var2 = var4;
                var3 = this.field2629[var4];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "()Z", line = 31)
    public final boolean method1255() {
        int var1 = this.field2632.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field2632[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(I)J", line = 44)
    public final long method1256(int arg0) {
        return (long) this.field2627 * (long) arg0 + this.field2630;
    }

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "(I)V", line = 48)
    public final void method1257(int arg0) {
        int var2 = this.field2624.method672(32767);
        this.field2629[arg0] += var2;
    }

    @OriginalMember(owner = "client!rd", name = "c", descriptor = "(I)I", line = 54)
    public final int method1258(int arg0) {
        return this.method1259(arg0);
    }

    @OriginalMember(owner = "client!rd", name = "d", descriptor = "(I)I", line = 70)
    private final int method1259(int arg0) {
        byte var2 = this.field2624.field1388[this.field2624.field1400];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field2628[arg0] = var3;
            this.field2624.field1400++;
        } else {
            var3 = this.field2628[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method1261(arg0, var3);
        }
        int var4 = this.field2624.method672(32767);
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field2624.field1388[this.field2624.field1400] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field2624.field1400++;
                this.field2628[arg0] = var5;
                return this.method1261(arg0, var5);
            }
        }
        this.field2624.field1400 += var4;
        return 0;
    }

    @OriginalMember(owner = "client!rd", name = "c", descriptor = "()V", line = 108)
    public static void method1260() {
        field2625 = null;
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(II)I", line = 111)
    private final int method1261(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field2625[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field2624.method661(-1) << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field2624.method661(-1) << 16;
            }
            return var8;
        }
        int var3 = this.field2624.method661(-1);
        int var4 = this.field2624.method672(32767);
        if (var3 == 47) {
            this.field2624.field1400 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field2624.method622((byte) 14);
            var4 -= 3;
            int var6 = this.field2629[arg0];
            this.field2630 += (long) (this.field2627 - var5) * (long) var6;
            this.field2627 = var5;
            this.field2624.field1400 += var4;
            return 2;
        } else {
            this.field2624.field1400 += var4;
            return 3;
        }
    }

    @OriginalMember(owner = "client!rd", name = "e", descriptor = "(I)V", line = 154)
    public final void method1262(int arg0) {
        this.field2632[arg0] = this.field2624.field1400;
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(J)V", line = 158)
    public final void method1263(long arg0) {
        this.field2630 = arg0;
        int var3 = this.field2632.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2629[var4] = 0;
            this.field2628[var4] = 0;
            this.field2624.field1400 = this.field2626[var4];
            this.method1257(var4);
            this.field2632[var4] = this.field2624.field1400;
        }
    }

    @OriginalMember(owner = "client!rd", name = "d", descriptor = "()V", line = 176)
    public final void method1264() {
        this.field2624.field1400 = -1;
    }

    @OriginalMember(owner = "client!rd", name = "f", descriptor = "(I)V", line = 179)
    public final void method1265(int arg0) {
        this.field2624.field1400 = this.field2632[arg0];
    }

    @OriginalMember(owner = "client!rd", name = "e", descriptor = "()I", line = 182)
    public final int method1266() {
        return this.field2632.length;
    }

    @OriginalMember(owner = "client!rd", name = "f", descriptor = "()Z", line = 185)
    public final boolean method1267() {
        return this.field2624.field1388 != null;
    }

    @OriginalMember(owner = "client!rd", name = "<init>", descriptor = "()V", line = 264)
    public class182() {
    }

    @OriginalMember(owner = "client!rd", name = "<init>", descriptor = "([B)V", line = 266)
    public class182(byte[] arg0) {
        this.method1269(arg0);
    }

    @OriginalMember(owner = "client!rd", name = "g", descriptor = "()V", line = 203)
    public final void method1268() {
        this.field2624.field1388 = null;
        this.field2626 = null;
        this.field2632 = null;
        this.field2629 = null;
        this.field2628 = null;
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "([B)V", line = 212)
    public final void method1269(byte[] arg0) {
        this.field2624.field1388 = arg0;
        this.field2624.field1400 = 10;
        int var2 = this.field2624.method624(14612);
        this.field2631 = this.field2624.method624(14612);
        this.field2627 = 500000;
        this.field2626 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var4 = this.field2624.method676(true);
            int var5 = this.field2624.method676(true);
            if (var4 == 1297379947) {
                this.field2626[var3] = this.field2624.field1400;
                var3++;
            }
            this.field2624.field1400 += var5;
        }
        this.field2630 = 0L;
        this.field2632 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field2632[var6] = this.field2626[var6];
        }
        this.field2629 = new int[var2];
        this.field2628 = new int[var2];
    }
}
