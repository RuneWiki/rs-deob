import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dk")
public class class236 {

    @OriginalMember(owner = "client!dk", name = "h", descriptor = "I")
    private int field3403 = -1;

    @OriginalMember(owner = "client!dk", name = "l", descriptor = "I")
    private int field3407 = 0;

    @OriginalMember(owner = "client!dk", name = "g", descriptor = "Lbh;")
    private class234 field3402 = new class234();

    @OriginalMember(owner = "client!dk", name = "m", descriptor = "Z")
    public boolean field3408 = false;

    @OriginalMember(owner = "client!dk", name = "c", descriptor = "I")
    private int field3398;

    @OriginalMember(owner = "client!dk", name = "d", descriptor = "I")
    private int field3399;

    @OriginalMember(owner = "client!dk", name = "f", descriptor = "[Lg;")
    private class237[] field3401;

    @OriginalMember(owner = "client!dk", name = "i", descriptor = "[[[I")
    private int[][][] field3404;

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "I")
    public static int field3396;

    @OriginalMember(owner = "client!dk", name = "b", descriptor = "I")
    public static int field3397;

    @OriginalMember(owner = "client!dk", name = "e", descriptor = "I")
    public static int field3400;

    @OriginalMember(owner = "client!dk", name = "j", descriptor = "I")
    public static int field3405;

    @OriginalMember(owner = "client!dk", name = "k", descriptor = "I")
    public static int field3406;

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(I)[[[I")
    public final int[][][] method1540(int arg0) {
        field3405++;
        if (this.field3399 != this.field3398) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        for (int var2 = arg0; var2 < this.field3398; var2++) {
            this.field3401[var2] = class163.field2338;
        }
        return this.field3404;
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(B)V")
    public final void method1541(byte arg0) {
        for (int var2 = 0; var2 < this.field3398; var2++) {
            this.field3404[var2][0] = null;
            this.field3404[var2][1] = null;
            this.field3404[var2][2] = null;
            this.field3404[var2] = null;
        }
        if (arg0 < 76) {
            return;
        }
        this.field3404 = null;
        this.field3401 = null;
        this.field3402.method1528(false);
        this.field3402 = null;
        field3406++;
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(II)[[I")
    public final int[][] method1542(int arg0, int arg1) {
        if (arg0 < 83) {
            this.field3399 = 39;
        }
        field3396++;
        if (this.field3399 == this.field3398) {
            this.field3408 = this.field3401[arg1] == null;
            this.field3401[arg1] = class163.field2338;
            return this.field3404[arg1];
        } else if (this.field3398 == 1) {
            this.field3408 = this.field3403 != arg1;
            this.field3403 = arg1;
            return this.field3404[0];
        } else {
            class237 var3 = this.field3401[arg1];
            if (var3 == null) {
                this.field3408 = true;
                if (this.field3407 >= this.field3398) {
                    class237 var4 = (class237) this.field3402.method1531(-696136762);
                    var3 = new class237(arg1, var4.field3410);
                    this.field3401[var4.field3411] = null;
                    var4.method1935(119);
                } else {
                    var3 = new class237(arg1, this.field3407);
                    this.field3407++;
                }
                this.field3401[arg1] = var3;
            } else {
                this.field3408 = false;
            }
            this.field3402.method1527(var3, 73);
            return this.field3404[var3.field3410];
        }
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "([Lhl;BZII[B)V")
    public static final void method1543(class137[] arg0, byte arg1, boolean arg2, int arg3, int arg4, byte[] arg5) {
        if (arg1 != -127) {
            return;
        }
        field3400++;
        int var6 = -1;
        class216 var7 = new class216(arg5);
        while (true) {
            int var8 = var7.method1381((byte) 113);
            if (var8 == 0) {
                return;
            }
            var6 += var8;
            int var9 = 0;
            while (true) {
                int var10 = var7.method1378((byte) -127);
                if (var10 == 0) {
                    break;
                }
                var9 += var10 - 1;
                int var11 = var9 & 0x3F;
                int var12 = var9 >> 12;
                int var13 = (var9 & 0xFC9) >> 6;
                int var14 = var7.method1407(106);
                int var15 = arg4 + var13;
                int var16 = var14 >> 2;
                int var17 = arg3 + var11;
                int var18 = var14 & 0x3;
                if (var15 > 0 && var17 > 0 && var15 < 103 && var17 < 103) {
                    class137 var19 = null;
                    if (!arg2) {
                        int var20 = var12;
                        if ((class241.field3507[1][var15][var17] & 0x2) == 2) {
                            var20 = var12 - 1;
                        }
                        if (var20 >= 0) {
                            var19 = arg0[var20];
                        }
                    }
                    class204.method1314(!arg2, var12, var16, var18, arg2, var19, (byte) 118, var12, var17, var15, var6);
                }
            }
        }
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(IB)I")
    public static final int method1544(int arg0, byte arg1) {
        field3397++;
        if (arg1 < 58) {
            method1543((class137[]) null, (byte) -14, true, 17, 45, (byte[]) null);
        }
        return arg0 >>> 7;
    }

    @OriginalMember(owner = "client!dk", name = "<init>", descriptor = "(III)V")
    public class236(int arg0, int arg1, int arg2) {
        this.field3398 = arg0;
        this.field3399 = arg1;
        this.field3401 = new class237[this.field3399];
        this.field3404 = new int[this.field3398][3][arg2];
    }
}
