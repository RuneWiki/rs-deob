import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!paa")
public class class580 extends class199 {

    @OriginalMember(owner = "client!paa", name = "H", descriptor = "I")
    public int field8507;

    @OriginalMember(owner = "client!paa", name = "B", descriptor = "I")
    public static int field8501 = 0;

    @OriginalMember(owner = "client!paa", name = "E", descriptor = "I")
    public static int field8504 = 104;

    @OriginalMember(owner = "client!paa", name = "K", descriptor = "Lvh;")
    public static class125 field8510 = new class125(45, 2);

    @OriginalMember(owner = "client!paa", name = "M", descriptor = "Ljn;")
    public static class117 field8512 = new class117(3000000, 200);

    @OriginalMember(owner = "client!paa", name = "A", descriptor = "I")
    public static int field8500;

    @OriginalMember(owner = "client!paa", name = "D", descriptor = "I")
    public static int field8503;

    @OriginalMember(owner = "client!paa", name = "F", descriptor = "I")
    public static int field8505;

    @OriginalMember(owner = "client!paa", name = "G", descriptor = "I")
    public static int field8506;

    @OriginalMember(owner = "client!paa", name = "I", descriptor = "I")
    public static int field8508;

    @OriginalMember(owner = "client!paa", name = "J", descriptor = "I")
    public static int field8509;

    @OriginalMember(owner = "client!paa", name = "L", descriptor = "I")
    public static int field8511;

    @OriginalMember(owner = "client!paa", name = "C", descriptor = "Lvo;")
    public static class345 field8502;

    @OriginalMember(owner = "client!paa", name = "a", descriptor = "(B[B)Ljava/lang/String;")
    public static final String method3357(byte arg0, byte[] arg1) {
        field8503++;
        if (arg0 != -12) {
            method3362(-108, -80, 55, -60, 75, -58);
        }
        return class433.method2543(arg1, 0, false, arg1.length);
    }

    @OriginalMember(owner = "client!paa", name = "a", descriptor = "(B[Lis;I)V")
    public static final void method3358(byte arg0, class101[] arg1, int arg2) {
        if (arg0 < 17) {
            return;
        }
        for (int var3 = 0; var3 < arg1.length; var3++) {
            class101 var4 = arg1[var3];
            if (var4 != null) {
                if (var4.field1584 == 0) {
                    if (var4.field1578 != null) {
                        method3358((byte) 56, var4.field1578, arg2);
                    }
                    class259 var5 = (class259) class199.field3098.method2818(-22803, (long) var4.field1577);
                    if (var5 != null) {
                        class611.method3461(arg2, var5.field3716, true);
                    }
                }
                if (arg2 == 0 && var4.field1553 != null) {
                    class400 var6 = new class400();
                    var6.field5783 = var4;
                    var6.field5790 = var4.field1553;
                    class362.method2171(var6);
                }
                if (arg2 == 1 && var4.field1533 != null) {
                    if (var4.field1528 >= 0) {
                        class101 var7 = class271.method1711(var4.field1577, 23727);
                        if (var7 == null || var7.field1578 == null || var7.field1578.length <= var4.field1528 || var7.field1578[var4.field1528] != var4) {
                            continue;
                        }
                    }
                    class400 var8 = new class400();
                    var8.field5783 = var4;
                    var8.field5790 = var4.field1533;
                    class362.method2171(var8);
                }
            }
        }
        field8508++;
    }

    @OriginalMember(owner = "client!paa", name = "<init>", descriptor = "(Lvn;Lmf;IIIIIIIIIIIIII)V")
    public class580(class186 arg0, class409 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14);
        this.field8507 = arg15;
    }

    @OriginalMember(owner = "client!paa", name = "a", descriptor = "(IZIII)V")
    public static final void method3359(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
        field8509++;
        if (arg0 == 8 || arg0 == 16) {
            for (int var6 = 0; var6 < class203.field3148; var6++) {
                class302 var7 = class117.field1847[var6];
                if (var7.field4227 == arg0 && var7.field4233 == arg4 && var7.field4234 == arg3 || var7.field4228 == arg4 && var7.field4234 == arg3) {
                    if (class203.field3148 != var6) {
                        class553.method3243(class117.field1847, var6 + 1, class117.field1847, var6, class117.field1847.length - var6 - 1);
                    }
                    class203.field3148--;
                    return;
                }
            }
        } else {
            class293 var5 = class541.field7946[arg2][arg4][arg3];
            if (var5 != null) {
                if (arg0 == 1) {
                    var5.field4088 = 0;
                } else if (arg0 == 2) {
                    var5.field4096 = 0;
                }
            }
            class250.method1601(-1);
        }
        if (arg1) {
            field8504 = -89;
        }
    }

    @OriginalMember(owner = "client!paa", name = "a", descriptor = "(Lkfa;[III[II)Ldb;")
    public static final class91 method3360(class382 arg0, int[] arg1, int arg2, int arg3, int[] arg4, int arg5) {
        field8506++;
        if (arg3 != 1) {
            method3361(96);
        }
        byte[] var6 = new byte[arg2 * arg5];
        for (int var7 = 0; var7 < arg2; var7++) {
            int var8 = arg5 * var7 + arg1[var7];
            for (int var9 = 0; var9 < arg4[var7]; var9++) {
                var6[var8++] = -1;
            }
        }
        return new class91(arg0, arg5, arg2, var6);
    }

    @OriginalMember(owner = "client!paa", name = "a", descriptor = "(I)Lkq;")
    public final class696 method726(int arg0) {
        field8500++;
        if (arg0 != -17) {
            method3360(null, null, -60, -35, null, -78);
        }
        return class484.field6905;
    }

    @OriginalMember(owner = "client!paa", name = "d", descriptor = "(I)V")
    public static void method3361(int arg0) {
        field8510 = null;
        if (arg0 != 200) {
            field8501 = -26;
        }
        field8512 = null;
        field8502 = null;
    }

    @OriginalMember(owner = "client!paa", name = "a", descriptor = "(IIIIII)V")
    public static final void method3362(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field8511++;
        int var6 = arg1 - arg3;
        int var7 = arg4 - arg5;
        if (var7 == 0) {
            if (var6 != 0) {
                class64.method526(arg1, arg3, arg0, arg2 ^ 0xFFFFC9D7, arg5);
            }
        } else if (var6 == 0) {
            class525.method3095(arg0, arg4, (byte) 110, arg3, arg5);
        } else {
            if (var6 < 0) {
                var6 = -var6;
            }
            if (arg2 != -13865) {
                field8502 = null;
            }
            if (var7 < 0) {
                var7 = -var7;
            }
            boolean var8 = var7 < var6;
            if (var8) {
                int var9 = arg5;
                arg5 = arg3;
                int var10 = arg4;
                arg3 = var9;
                arg4 = arg1;
                arg1 = var10;
            }
            if (arg5 > arg4) {
                int var11 = arg5;
                arg5 = arg4;
                int var12 = arg3;
                arg4 = var11;
                arg3 = arg1;
                arg1 = var12;
            }
            int var13 = arg3;
            int var14 = arg4 - arg5;
            int var15 = arg1 - arg3;
            int var16 = -(var14 >> 1);
            int var17 = arg3 < arg1 ? 1 : -1;
            if (var15 < 0) {
                var15 = -var15;
            }
            if (var8) {
                for (int var18 = arg5; var18 <= arg4; var18++) {
                    var16 += var15;
                    class657.field9275[var18][var13] = arg0;
                    if (var16 > 0) {
                        var13 += var17;
                        var16 -= var14;
                    }
                }
            } else {
                for (int var19 = arg5; var19 <= arg4; var19++) {
                    var16 += var15;
                    class657.field9275[var13][var19] = arg0;
                    if (var16 > 0) {
                        var16 -= var14;
                        var13 += var17;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!paa", name = "a", descriptor = "(BLhi;III)V")
    public static final void method3363(byte arg0, class417 arg1, int arg2, int arg3, int arg4) {
        field8505++;
        long var5 = (long) (arg2 | arg4 << 28 | arg3 << 14);
        class430 var7 = (class430) class480.field6870.method2818(-22803, var5);
        if (var7 == null) {
            class430 var8 = new class430();
            class480.field6870.method2816(var8, var5, false);
            var8.field6133.method3904(arg1, 0);
            return;
        }
        class432 var9 = class430.field6132.method42(arg1.field5941, false);
        int var10 = var9.field6198;
        if (var9.field6211 == 1) {
            var10 = (arg1.field5939 + 1) * var10;
        }
        if (arg0 != -38) {
            method3359(-41, false, 41, 34, 127);
        }
        for (class417 var11 = (class417) var7.field6133.method3905(-117); var11 != null; var11 = (class417) var7.field6133.method3899(arg0 ^ 0xFFFFFFDA)) {
            class432 var12 = class430.field6132.method42(var11.field5941, false);
            int var13 = var12.field6198;
            if (var12.field6211 == 1) {
                var13 = (var11.field5939 + 1) * var13;
            }
            if (var10 > var13) {
                class701.method3943(arg1, -15818, var11);
                return;
            }
        }
        var7.field6133.method3904(arg1, 0);
    }
}
