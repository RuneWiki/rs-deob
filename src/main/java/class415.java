import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ot")
public class class415 {

    @OriginalMember(owner = "client!ot", name = "b", descriptor = "Liv;")
    private class65 field6145 = new class65(null);

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "[B")
    private static byte[] field6144 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!ot", name = "e", descriptor = "I")
    private int field6148;

    @OriginalMember(owner = "client!ot", name = "h", descriptor = "I")
    public int field6151;

    @OriginalMember(owner = "client!ot", name = "d", descriptor = "J")
    private long field6147;

    @OriginalMember(owner = "client!ot", name = "c", descriptor = "[I")
    private int[] field6146;

    @OriginalMember(owner = "client!ot", name = "f", descriptor = "[I")
    private int[] field6149;

    @OriginalMember(owner = "client!ot", name = "g", descriptor = "[I")
    public int[] field6150;

    @OriginalMember(owner = "client!ot", name = "i", descriptor = "[I")
    private int[] field6152;

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "()V")
    public final void method2527() {
        this.field6145.field827 = -1;
    }

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "(I)I")
    private final int method2528(int arg0) {
        byte var2 = this.field6145.field783[this.field6145.field827];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field6152[arg0] = var3;
            this.field6145.field827++;
        } else {
            var3 = this.field6152[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method2533(arg0, var3);
        }
        int var4 = this.field6145.method615((byte) 37);
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field6145.field783[this.field6145.field827] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field6145.field827++;
                this.field6152[arg0] = var5;
                return this.method2533(arg0, var5);
            }
        }
        this.field6145.field827 += var4;
        return 0;
    }

    @OriginalMember(owner = "client!ot", name = "b", descriptor = "(I)V")
    public final void method2529(int arg0) {
        this.field6146[arg0] = this.field6145.field827;
    }

    @OriginalMember(owner = "client!ot", name = "c", descriptor = "(I)J")
    public final long method2530(int arg0) {
        return (long) this.field6148 * (long) arg0 + this.field6147;
    }

    @OriginalMember(owner = "client!ot", name = "b", descriptor = "()V")
    public final void method2531() {
        this.field6145.field783 = null;
        this.field6149 = null;
        this.field6146 = null;
        this.field6150 = null;
        this.field6152 = null;
    }

    @OriginalMember(owner = "client!ot", name = "d", descriptor = "(I)V")
    public final void method2532(int arg0) {
        int var2 = this.field6145.method615((byte) 37);
        this.field6150[arg0] += var2;
    }

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "(II)I")
    private final int method2533(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field6144[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field6145.method577(255) << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field6145.method577(255) << 16;
            }
            return var8;
        }
        int var3 = this.field6145.method577(255);
        int var4 = this.field6145.method615((byte) 37);
        if (var3 == 47) {
            this.field6145.field827 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field6145.method580((byte) 29);
            var4 -= 3;
            int var6 = this.field6150[arg0];
            this.field6147 += (long) (this.field6148 - var5) * (long) var6;
            this.field6148 = var5;
            this.field6145.field827 += var4;
            return 2;
        } else {
            this.field6145.field827 += var4;
            return 3;
        }
    }

    @OriginalMember(owner = "client!ot", name = "c", descriptor = "()Z")
    public final boolean method2534() {
        int var1 = this.field6146.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field6146[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "(J)V")
    public final void method2535(long arg0) {
        this.field6147 = arg0;
        int var3 = this.field6146.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field6150[var4] = 0;
            this.field6152[var4] = 0;
            this.field6145.field827 = this.field6149[var4];
            this.method2532(var4);
            this.field6146[var4] = this.field6145.field827;
        }
    }

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "([B)V")
    public final void method2536(byte[] arg0) {
        this.field6145.field783 = arg0;
        this.field6145.field827 = 10;
        int var2 = this.field6145.method623((byte) -95);
        this.field6151 = this.field6145.method623((byte) 93);
        this.field6148 = 500000;
        this.field6149 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var5 = this.field6145.method616((byte) 115);
            int var6 = this.field6145.method616((byte) 127);
            if (var5 == 1297379947) {
                this.field6149[var3] = this.field6145.field827;
                var3++;
            }
            this.field6145.field827 += var6;
        }
        this.field6147 = 0L;
        this.field6146 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            this.field6146[var4] = this.field6149[var4];
        }
        this.field6150 = new int[var2];
        this.field6152 = new int[var2];
    }

    @OriginalMember(owner = "client!ot", name = "d", descriptor = "()I")
    public final int method2537() {
        int var1 = this.field6146.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field6146[var4] >= 0 && this.field6150[var4] < var3) {
                var2 = var4;
                var3 = this.field6150[var4];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!ot", name = "e", descriptor = "(I)V")
    public final void method2538(int arg0) {
        this.field6145.field827 = this.field6146[arg0];
    }

    @OriginalMember(owner = "client!ot", name = "e", descriptor = "()Z")
    public final boolean method2539() {
        return this.field6145.field783 != null;
    }

    @OriginalMember(owner = "client!ot", name = "f", descriptor = "(I)I")
    public final int method2540(int arg0) {
        return this.method2528(arg0);
    }

    @OriginalMember(owner = "client!ot", name = "f", descriptor = "()V")
    public static void method2541() {
        field6144 = null;
    }

    @OriginalMember(owner = "client!ot", name = "g", descriptor = "()I")
    public final int method2542() {
        return this.field6146.length;
    }

    @OriginalMember(owner = "client!ot", name = "<init>", descriptor = "()V")
    public class415() {
    }

    @OriginalMember(owner = "client!ot", name = "<init>", descriptor = "([B)V")
    public class415(byte[] arg0) {
        this.method2536(arg0);
    }
}
