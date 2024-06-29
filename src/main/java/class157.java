import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pe")
public class class157 {

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "Lco;")
    private class268 field2356 = new class268(null);

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "[B")
    private static byte[] field2357 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!pe", name = "c", descriptor = "I")
    private int field2358;

    @OriginalMember(owner = "client!pe", name = "f", descriptor = "I")
    public int field2361;

    @OriginalMember(owner = "client!pe", name = "e", descriptor = "J")
    private long field2360;

    @OriginalMember(owner = "client!pe", name = "d", descriptor = "[I")
    public int[] field2359;

    @OriginalMember(owner = "client!pe", name = "g", descriptor = "[I")
    private int[] field2362;

    @OriginalMember(owner = "client!pe", name = "h", descriptor = "[I")
    private int[] field2363;

    @OriginalMember(owner = "client!pe", name = "i", descriptor = "[I")
    private int[] field2364;

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(II)I")
    private final int method1104(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field2357[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field2356.method1738(255) << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field2356.method1738(255) << 16;
            }
            return var8;
        }
        int var3 = this.field2356.method1738(255);
        int var4 = this.field2356.method1741(23433);
        if (var3 == 47) {
            this.field2356.field3913 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field2356.method1700((byte) 44);
            var4 -= 3;
            int var6 = this.field2359[arg0];
            this.field2360 += (long) (this.field2358 - var5) * (long) var6;
            this.field2358 = var5;
            this.field2356.field3913 += var4;
            return 2;
        } else {
            this.field2356.field3913 += var4;
            return 3;
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "()Z")
    public final boolean method1105() {
        int var1 = this.field2363.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field2363[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(I)J")
    public final long method1106(int arg0) {
        return (long) this.field2358 * (long) arg0 + this.field2360;
    }

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "()V")
    public final void method1107() {
        this.field2356.field3952 = null;
        this.field2364 = null;
        this.field2363 = null;
        this.field2359 = null;
        this.field2362 = null;
    }

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "(I)V")
    public final void method1108(int arg0) {
        int var2 = this.field2356.method1741(23433);
        this.field2359[arg0] += var2;
    }

    @OriginalMember(owner = "client!pe", name = "c", descriptor = "()V")
    public final void method1109() {
        this.field2356.field3913 = -1;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "([B)V")
    public final void method1110(byte[] arg0) {
        this.field2356.field3952 = arg0;
        this.field2356.field3913 = 10;
        int var2 = this.field2356.method1745(32132);
        this.field2361 = this.field2356.method1745(32132);
        this.field2358 = 500000;
        this.field2364 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var5 = this.field2356.method1748(127);
            int var6 = this.field2356.method1748(103);
            if (var5 == 1297379947) {
                this.field2364[var3] = this.field2356.field3913;
                var3++;
            }
            this.field2356.field3913 += var6;
        }
        this.field2360 = 0L;
        this.field2363 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            this.field2363[var4] = this.field2364[var4];
        }
        this.field2359 = new int[var2];
        this.field2362 = new int[var2];
    }

    @OriginalMember(owner = "client!pe", name = "d", descriptor = "()V")
    public static void method1111() {
        field2357 = null;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(J)V")
    public final void method1112(long arg0) {
        this.field2360 = arg0;
        int var3 = this.field2363.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2359[var4] = 0;
            this.field2362[var4] = 0;
            this.field2356.field3913 = this.field2364[var4];
            this.method1108(var4);
            this.field2363[var4] = this.field2356.field3913;
        }
    }

    @OriginalMember(owner = "client!pe", name = "c", descriptor = "(I)V")
    public final void method1113(int arg0) {
        this.field2363[arg0] = this.field2356.field3913;
    }

    @OriginalMember(owner = "client!pe", name = "e", descriptor = "()I")
    public final int method1114() {
        return this.field2363.length;
    }

    @OriginalMember(owner = "client!pe", name = "d", descriptor = "(I)I")
    public final int method1115(int arg0) {
        return this.method1118(arg0);
    }

    @OriginalMember(owner = "client!pe", name = "f", descriptor = "()Z")
    public final boolean method1116() {
        return this.field2356.field3952 != null;
    }

    @OriginalMember(owner = "client!pe", name = "e", descriptor = "(I)V")
    public final void method1117(int arg0) {
        this.field2356.field3913 = this.field2363[arg0];
    }

    @OriginalMember(owner = "client!pe", name = "f", descriptor = "(I)I")
    private final int method1118(int arg0) {
        byte var2 = this.field2356.field3952[this.field2356.field3913];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field2362[arg0] = var3;
            this.field2356.field3913++;
        } else {
            var3 = this.field2362[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method1104(arg0, var3);
        }
        int var4 = this.field2356.method1741(23433);
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field2356.field3952[this.field2356.field3913] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field2356.field3913++;
                this.field2362[arg0] = var5;
                return this.method1104(arg0, var5);
            }
        }
        this.field2356.field3913 += var4;
        return 0;
    }

    @OriginalMember(owner = "client!pe", name = "g", descriptor = "()I")
    public final int method1119() {
        int var1 = this.field2363.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field2363[var4] >= 0 && this.field2359[var4] < var3) {
                var2 = var4;
                var3 = this.field2359[var4];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!pe", name = "<init>", descriptor = "()V")
    public class157() {
    }

    @OriginalMember(owner = "client!pe", name = "<init>", descriptor = "([B)V")
    public class157(byte[] arg0) {
        this.method1110(arg0);
    }
}
