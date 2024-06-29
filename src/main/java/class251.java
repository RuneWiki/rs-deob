import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tk")
public class class251 extends class303 {

    @OriginalMember(owner = "client!tk", name = "G", descriptor = "I")
    private int field3862 = 0;

    @OriginalMember(owner = "client!tk", name = "J", descriptor = "I")
    private int field3865 = 20;

    @OriginalMember(owner = "client!tk", name = "R", descriptor = "I")
    private int field3873 = 0;

    @OriginalMember(owner = "client!tk", name = "S", descriptor = "I")
    private int field3874 = 1365;

    @OriginalMember(owner = "client!tk", name = "N", descriptor = "Lob;")
    public static class292 field3869 = null;

    @OriginalMember(owner = "client!tk", name = "H", descriptor = "I")
    public static int field3863;

    @OriginalMember(owner = "client!tk", name = "K", descriptor = "I")
    public static int field3866;

    @OriginalMember(owner = "client!tk", name = "L", descriptor = "I")
    public static int field3867;

    @OriginalMember(owner = "client!tk", name = "M", descriptor = "I")
    public static int field3868;

    @OriginalMember(owner = "client!tk", name = "O", descriptor = "I")
    public static int field3870;

    @OriginalMember(owner = "client!tk", name = "Q", descriptor = "I")
    public static int field3872;

    @OriginalMember(owner = "client!tk", name = "P", descriptor = "[I")
    public static int[] field3871;

    @OriginalMember(owner = "client!tk", name = "I", descriptor = "[[Ldb;")
    public static class186[][] field3864;

    @OriginalMember(owner = "client!tk", name = "f", descriptor = "(I)Lgk;", line = 6)
    public static final class7 method1773(int arg0) {
        field3863++;
        int var1 = class3.field14[0] * class108.field1797[0];
        if (arg0 != -1252899700) {
            return (class7) null;
        }
        byte[] var2 = class270.field4198[0];
        class7 var5;
        if (class33.field548[0]) {
            int[] var6 = new int[var1];
            byte[] var7 = class24.field408[0];
            for (int var8 = 0; var8 < var1; var8++) {
                var6[var8] = class94.method673(class280.method2001(-16777216, var7[var8] << 24), field3871[class280.method2001(255, var2[var8])]);
            }
            var5 = new class66(class326.field5064, class52.field820, class246.field3811[0], class62.field962[0], class108.field1797[0], class3.field14[0], var6);
        } else {
            int[] var3 = new int[var1];
            for (int var4 = 0; var4 < var1; var4++) {
                var3[var4] = field3871[class280.method2001(255, var2[var4])];
            }
            var5 = new class7(class326.field5064, class52.field820, class246.field3811[0], class62.field962[0], class108.field1797[0], class3.field14[0], var3);
        }
        class233.method1680((byte) -12);
        return var5;
    }

    @OriginalMember(owner = "client!tk", name = "<init>", descriptor = "()V", line = 52)
    public class251() {
        super(0, true);
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(IIIIIIII)V", line = 60)
    public static final void method1774(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg3 >= arg4 && arg1 >= 0 && arg3 < 103 && arg1 < 103) {
            if (arg5 == 0) {
                class189 var8 = class277.method1982(arg7, arg3, arg1);
                if (var8 != null) {
                    int var9 = (int) (var8.field3008 >>> 32) & Integer.MAX_VALUE;
                    if (arg6 == 2) {
                        var8.field2996 = new class258(var9, 2, arg2 + 4, arg7, arg3, arg1, arg0, false, var8.field2996);
                        var8.field2998 = new class258(var9, 2, arg2 + 1 & 0x3, arg7, arg3, arg1, arg0, false, var8.field2998);
                    } else {
                        var8.field2996 = new class258(var9, arg6, arg2, arg7, arg3, arg1, arg0, false, var8.field2996);
                    }
                }
            }
            if (arg5 == 1) {
                class114 var10 = class89.method645(arg7, arg3, arg1);
                if (var10 != null) {
                    int var11 = Integer.MAX_VALUE & (int) (var10.field1865 >>> 32);
                    if (arg6 == 4 || arg6 == 5) {
                        var10.field1863 = new class258(var11, 4, arg2, arg7, arg3, arg1, arg0, false, var10.field1863);
                    } else if (arg6 == 6) {
                        var10.field1863 = new class258(var11, 4, arg2 + 4, arg7, arg3, arg1, arg0, false, var10.field1863);
                    } else if (arg6 == 7) {
                        var10.field1863 = new class258(var11, 4, (arg2 + 2 & 0x3) + 4, arg7, arg3, arg1, arg0, false, var10.field1863);
                    } else if (arg6 == 8) {
                        var10.field1863 = new class258(var11, 4, arg2 + 4, arg7, arg3, arg1, arg0, false, var10.field1863);
                        var10.field1860 = new class258(var11, 4, (arg2 + 2 & 0x3) + 4, arg7, arg3, arg1, arg0, false, var10.field1860);
                    }
                }
            }
            if (arg5 == 2) {
                class45 var12 = class207.method1509(arg7, arg3, arg1);
                if (arg6 == 11) {
                    arg6 = 10;
                }
                if (var12 != null) {
                    var12.field782 = new class258((int) (var12.field776 >>> 32) & Integer.MAX_VALUE, arg6, arg2, arg7, arg3, arg1, arg0, false, var12.field782);
                }
            }
            if (arg5 == 3) {
                class87 var13 = class99.method717(arg7, arg3, arg1);
                if (var13 != null) {
                    var13.field1325 = new class258(Integer.MAX_VALUE & (int) (var13.field1338 >>> 32), 22, arg2, arg7, arg3, arg1, arg0, false, var13.field1325);
                }
            }
        }
        field3872++;
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(BLl;)V", line = 149)
    public static final void method1775(byte arg0, class297 arg1) {
        field3868++;
        long var2 = 0L;
        if (arg1.field4692 == 0) {
            var2 = class70.method540(arg1.field4693, arg1.field4694, arg1.field4685);
        }
        if (arg1.field4692 == 1) {
            var2 = class191.method1415(arg1.field4693, arg1.field4694, arg1.field4685);
        }
        if (arg1.field4692 == 2) {
            var2 = class103.method799(arg1.field4693, arg1.field4694, arg1.field4685);
        }
        if (arg1.field4692 == 3) {
            var2 = class34.method239(arg1.field4693, arg1.field4694, arg1.field4685);
        }
        int var4 = -1;
        if (arg0 != -127) {
            field3864 = (class186[][]) ((class186[][]) null);
        }
        int var5 = 0;
        int var6 = 0;
        if (var2 != 0L) {
            var5 = ((int) var2 & 0x7EBF4) >> 14;
            var4 = Integer.MAX_VALUE & (int) (var2 >>> 32);
            var6 = (int) var2 >> 20 & 0x3;
        }
        arg1.field4687 = var4;
        arg1.field4691 = var6;
        arg1.field4683 = var5;
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(ILpe;I)V", line = 190)
    public final void method65(int arg0, class101 arg1, int arg2) {
        if (arg0 != -4004) {
            method1773(-46);
        }
        field3870++;
        if (arg2 == 0) {
            this.field3874 = arg1.method731(false);
        } else if (arg2 == 1) {
            this.field3865 = arg1.method731(false);
        } else if (arg2 == 2) {
            this.field3862 = arg1.method731(false);
        } else if (arg2 == 3) {
            this.field3873 = arg1.method731(false);
        }
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(Z)V", line = 270)
    public static void method1776(boolean arg0) {
        field3864 = (class186[][]) null;
        if (arg0) {
            field3864 = (class186[][]) ((class186[][]) null);
        }
        field3871 = null;
        field3869 = null;
    }

    @OriginalMember(owner = "client!tk", name = "b", descriptor = "(II)[I", line = 282)
    public final int[] method67(int arg0, int arg1) {
        field3866++;
        if (arg0 != -3) {
            method1775((byte) -82, (class297) null);
        }
        int[] var3 = this.field4763.method394(0, arg1);
        if (this.field4763.field863) {
            for (int var4 = 0; var4 < class70.field1108; var4++) {
                int var5 = (class291.field4427[var4] << 12) / this.field3874 + this.field3862;
                int var6 = (class36.field591[arg1] << 12) / this.field3874 + this.field3873;
                int var7 = var5;
                int var8 = var6;
                int var9 = var5;
                int var10 = var6;
                int var11 = var5 * var5 >> 12;
                int var12 = var6 * var6 >> 12;
                int var13 = 0;
                while ((var11 + var12) < 16384 && var13 < this.field3865) {
                    var10 = (var9 * var10 >> 12) * 2 + var8;
                    var9 = var7 + var11 - var12;
                    var13++;
                    var12 = var10 * var10 >> 12;
                    var11 = var9 * var9 >> 12;
                }
                var3[var4] = this.field3865 - 1 <= var13 ? 0 : (var13 << 12) / this.field3865;
            }
        }
        return var3;
    }
}
