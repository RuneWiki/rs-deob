import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jl")
public class class263 extends class219 {

    @OriginalMember(owner = "client!jl", name = "L", descriptor = "Z")
    private boolean field4383 = true;

    @OriginalMember(owner = "client!jl", name = "N", descriptor = "Z")
    private boolean field4385 = true;

    @OriginalMember(owner = "client!jl", name = "J", descriptor = "I")
    public static int field4381 = 0;

    @OriginalMember(owner = "client!jl", name = "P", descriptor = "Lwc;")
    public static class53 field4387 = new class53();

    @OriginalMember(owner = "client!jl", name = "T", descriptor = "[J")
    public static long[] field4391 = new long[1000];

    @OriginalMember(owner = "client!jl", name = "S", descriptor = "I")
    public static int field4390 = -1;

    @OriginalMember(owner = "client!jl", name = "R", descriptor = "[I")
    public static int[] field4389 = new int[2000];

    @OriginalMember(owner = "client!jl", name = "V", descriptor = "I")
    public static int field4393 = -1;

    @OriginalMember(owner = "client!jl", name = "W", descriptor = "Lbd;")
    private static class162 field4394 = class17.method142(0, "Loading title screen )2 ");

    @OriginalMember(owner = "client!jl", name = "U", descriptor = "Lbd;")
    public static class162 field4392 = field4394;

    @OriginalMember(owner = "client!jl", name = "K", descriptor = "I")
    public static int field4382;

    @OriginalMember(owner = "client!jl", name = "M", descriptor = "I")
    public static int field4384;

    @OriginalMember(owner = "client!jl", name = "O", descriptor = "I")
    public static int field4386;

    @OriginalMember(owner = "client!jl", name = "Q", descriptor = "I")
    public static int field4388;

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(IILb;)V", line = 4)
    public final void method42(int arg0, int arg1, class94 arg2) {
        field4382++;
        if (arg0 == 0) {
            this.field4383 = arg2.method756(915905888) == 1;
        } else if (arg0 == 1) {
            this.field4385 = arg2.method756(915905888) == 1;
        } else if (arg0 == 2) {
            this.field3647 = arg2.method756(arg1 + 915905888) == 1;
        }
        if (arg1 != 0) {
            this.field4383 = true;
        }
    }

    @OriginalMember(owner = "client!jl", name = "<init>", descriptor = "()V", line = 48)
    public class263() {
        super(1, false);
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(IB)[[I", line = 53)
    public final int[][] method219(int arg0, byte arg1) {
        if (arg1 != 83) {
            this.field4385 = false;
        }
        field4388++;
        int[][] var3 = this.field3651.method406(false, arg0);
        if (this.field3651.field917) {
            int[][] var4 = this.method1583(this.field4385 ? class60.field927 - arg0 : arg0, true, 0);
            int[] var5 = var4[1];
            int[] var6 = var4[0];
            int[] var7 = var4[2];
            int[] var8 = var3[1];
            int[] var9 = var3[0];
            int[] var10 = var3[2];
            if (this.field4383) {
                for (int var11 = 0; var11 < class128.field2326; var11++) {
                    var9[var11] = var6[class252.field4208 - var11];
                    var8[var11] = var5[class252.field4208 - var11];
                    var10[var11] = var7[class252.field4208 - var11];
                }
            } else {
                for (int var12 = 0; var12 < class128.field2326; var12++) {
                    var9[var12] = var6[var12];
                    var8[var12] = var5[var12];
                    var10[var12] = var7[var12];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(ZI)[I", line = 132)
    public final int[] method41(boolean arg0, int arg1) {
        field4384++;
        if (!arg0) {
            return (int[]) null;
        }
        int[] var3 = this.field3654.method2032(3, arg1);
        if (this.field3654.field4967) {
            int[] var4 = this.method1585(0, this.field4385 ? class60.field927 - arg1 : arg1, -6606);
            if (this.field4383) {
                for (int var5 = 0; var5 < class128.field2326; var5++) {
                    var3[var5] = var4[class252.field4208 - var5];
                }
            } else {
                class161.method1237(var4, 0, var3, 0, class128.field2326);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!jl", name = "c", descriptor = "(I)V", line = 173)
    public static void method1807(int arg0) {
        if (arg0 != 6817) {
            return;
        }
        field4394 = null;
        field4391 = null;
        field4387 = null;
        field4389 = null;
        field4392 = null;
    }

    @OriginalMember(owner = "client!jl", name = "b", descriptor = "(III)Z", line = 202)
    public static final boolean method1808(int arg0, int arg1, int arg2) {
        int var3 = class248.field4104[arg0][arg1][arg2];
        if (-class142.field2519 == var3) {
            return false;
        } else if (class142.field2519 == var3) {
            return true;
        } else {
            int var4 = arg1 << 7;
            int var5 = arg2 << 7;
            if (class9.method54(var4 + 1, class206.field3473[arg0][arg1][arg2], var5 + 1) && class9.method54(var4 + 128 - 1, class206.field3473[arg0][arg1 + 1][arg2], var5 + 1) && class9.method54(var4 + 128 - 1, class206.field3473[arg0][arg1 + 1][arg2 + 1], var5 + 128 - 1) && class9.method54(var4 + 1, class206.field3473[arg0][arg1][arg2 + 1], var5 + 128 - 1)) {
                class248.field4104[arg0][arg1][arg2] = class142.field2519;
                return true;
            } else {
                class248.field4104[arg0][arg1][arg2] = -class142.field2519;
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(II)Z", line = 234)
    public static final boolean method1809(int arg0, int arg1) {
        if (arg1 != 1) {
            method1807(-29);
        }
        field4386++;
        class223 var2 = class31.method256((byte) -120, arg0);
        if (var2 == null) {
            return false;
        } else if (class28.field470 == 1 || class28.field470 == 2 || class8.field88 == 2) {
            byte[] var3 = var2.field3730.method1263(-84);
            class250.field4179 = new String(var3, 0, var3.length);
            class212.field3566 = var2.field3721;
            if (class8.field88 != 0) {
                class243.field4033 = class212.field3566 + 50000;
                class163.field2880 = class212.field3566 + 40000;
                class146.field2642 = class163.field2880;
            }
            return true;
        } else {
            class162 var4 = class61.field942;
            if (class8.field88 != 0) {
                var4 = class135.method1062(new class162[] { class250.field4175, class156.method1212(arg1 ^ 0xB, var2.field3721 + 7000) }, true);
            }
            class162 var5 = class61.field942;
            if (class35.field590 != null) {
                var5 = class135.method1062(new class162[] { class61.field940, class35.field590 }, true);
            }
            class162 var6 = class135.method1062(new class162[] { class288.field4854, var2.field3730, var4, class280.field4778, class156.method1212(10, class260.field4344), class242.field4021, class156.method1212(10, class262.field4377), var5, class89.field1594, class177.field3032 ? class255.field4227 : class252.field4212, class64.field1020, class187.field3232 ? class255.field4227 : class252.field4212, class179.field3072, class273.field4537 ? class255.field4227 : class252.field4212 }, true);
            try {
                class135.field2414.getAppletContext().showDocument(var6.method1288((byte) 105), "_self");
                return true;
            } catch (Exception var8) {
                return false;
            }
        }
    }
}
