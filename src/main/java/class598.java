import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!im")
public class class598 {

    @OriginalMember(owner = "client!im", name = "C", descriptor = "[Ljava/lang/String;")
    private static final String[] field8680 = new String[] { method4394(method4393("P\u0013=_`\u0012R")), method4394(method4393("M\u0014|Pq@\tqN")), method4394(method4393("w\u0013yY5\u0003\u0015\u007f\u001c2@>tY=F\u0015u\u001c\"W\u0000dU2\u0003\u0000sH8U\u0004=_>N\u0011\u007fR4M\u00151")), method4394(method4393("w\u0013yY5\u0003\u0015\u007f\u001c\u007f@\u0002OX4O\u0004dYqP\u0015qH8@A>]2W\bfY|@\u000e}L>M\u0004~Hp")), method4394(method4393("`R$\ra\u000eS")), method4394(method4393("`R$\ra\u000eP")), method4394(method4393("j.B\rb\u0012S!\u000f`\u0010")), method4394(method4393("`R$\fi\u000eP0")), method4394(method4393("`R$\fh\u000eP")), method4394(method4393("\u001f\b}[l\u0013_")), method4394(method4393("\u00034D\u007f")), method4394(method4393("d\u0000`\u001c0W[")), method4394(method4393("`S)D)\u000eP")), method4394(method4393("\u001f\b}[l\u0012_")), method4394(method4393("`R$\fh\u000eS")), method4394(method4393("I\u0000wH9F\u000eb]")), method4394(method4393("A\u0000t\u001c2L\f}]?G")), method4394(method4393("B\u0002sS$M\u0015sN4B\u0015uX")), method4394(method4393("B\u0002sS$M\u0015sN4B\u0015uO%B\u0013dY5")), method4394(method4393("U\bq\u0006q")), method4394(method4393("`\u000e}Q0M\u0005*\u001c")), method4394(method4393("U[0")), method4394(method4393("L\u0011*\u001c")), method4394(method4393("l\u0011*\u001c")), method4394(method4393("\u0019A")), method4394(method4393("`2\"\u0006q")), method4394(method4393("n\u0004cO0D\u0004*\u001c")), method4394(method4393("`\ryY?W\u0012sN8S\u00150Y#Q\u000eb\u001c8M[0")), method4394(method4393("M\u0014|P")), method4394(method4393("P\r\u007fK")), method4394(method4393("P\u0013=_`\u0012S")), method4394(method4393("F\u0017uR%|\u000e`^0P\u0004")) };

    @OriginalMember(owner = "client!im", name = "G", descriptor = "I")
    private static int field8647 = 0;

    @OriginalMember(owner = "client!im", name = "c", descriptor = "[I")
    private static int[] field8654 = new int[1000];

    @OriginalMember(owner = "client!im", name = "z", descriptor = "I")
    private static int field8659 = 0;

    @OriginalMember(owner = "client!im", name = "i", descriptor = "[J")
    private static long[] field8665 = new long[1000];

    @OriginalMember(owner = "client!im", name = "o", descriptor = "[[I")
    private static int[][] field8668 = new int[5][5000];

    @OriginalMember(owner = "client!im", name = "a", descriptor = "[Lvi;")
    private static class567[] field8670 = new class567[50];

    @OriginalMember(owner = "client!im", name = "A", descriptor = "[Ljava/lang/String;")
    private static String[] field8674 = new String[1000];

    @OriginalMember(owner = "client!im", name = "E", descriptor = "[I")
    private static int[] field8676 = new int[3];

    @OriginalMember(owner = "client!im", name = "q", descriptor = "I")
    private static int field8663 = 0;

    @OriginalMember(owner = "client!im", name = "u", descriptor = "I")
    private static int field8661 = 0;

    @OriginalMember(owner = "client!im", name = "k", descriptor = "[I")
    private static int[] field8672 = new int[5];

    @OriginalMember(owner = "client!im", name = "p", descriptor = "Liha;")
    public static class29 field8667 = new class29(4);

    @OriginalMember(owner = "client!im", name = "e", descriptor = "Ljava/lang/String;")
    public static String field8678 = null;

    @OriginalMember(owner = "client!im", name = "s", descriptor = "Z")
    public static boolean field8679 = false;

    @OriginalMember(owner = "client!im", name = "y", descriptor = "I")
    private static int field8677 = 0;

    @OriginalMember(owner = "client!im", name = "D", descriptor = "I")
    public static int field8646;

    @OriginalMember(owner = "client!im", name = "x", descriptor = "I")
    public static int field8648;

    @OriginalMember(owner = "client!im", name = "w", descriptor = "I")
    public static int field8649;

    @OriginalMember(owner = "client!im", name = "t", descriptor = "I")
    public static int field8651;

    @OriginalMember(owner = "client!im", name = "n", descriptor = "I")
    public static int field8653;

    @OriginalMember(owner = "client!im", name = "h", descriptor = "I")
    public static int field8655;

    @OriginalMember(owner = "client!im", name = "d", descriptor = "I")
    public static int field8657;

    @OriginalMember(owner = "client!im", name = "m", descriptor = "I")
    public static int field8662;

    @OriginalMember(owner = "client!im", name = "l", descriptor = "I")
    public static int field8664;

    @OriginalMember(owner = "client!im", name = "j", descriptor = "I")
    public static int field8671;

    @OriginalMember(owner = "client!im", name = "v", descriptor = "I")
    public static int field8673;

    @OriginalMember(owner = "client!im", name = "I", descriptor = "Lwt;")
    private static class328 field8652;

    @OriginalMember(owner = "client!im", name = "r", descriptor = "Lsca;")
    private static class47 field8656;

    @OriginalMember(owner = "client!im", name = "b", descriptor = "Lmj;")
    private static class683 field8660;

    @OriginalMember(owner = "client!im", name = "g", descriptor = "Lmj;")
    private static class683 field8666;

    @OriginalMember(owner = "client!im", name = "H", descriptor = "Lfca;")
    private static class90 field8658;

    @OriginalMember(owner = "client!im", name = "f", descriptor = "[I")
    private static int[] field8669;

    @OriginalMember(owner = "client!im", name = "B", descriptor = "[J")
    private static long[] field8650;

    @OriginalMember(owner = "client!im", name = "F", descriptor = "[Ljava/lang/String;")
    private static String[] field8675;

    @OriginalMember(owner = "client!im", name = "b", descriptor = "(IZ)V")
    private static final void method4375(int arg0, boolean arg1) {
        if (arg0 < 300) {
            if (arg0 == 150) {
                field8661 -= 3;
                int var2 = field8654[field8661];
                int var3 = field8654[field8661 + 1];
                int var4 = field8654[field8661 + 2];
                if (var3 == 0) {
                    throw new RuntimeException();
                }
                class683 var5 = class200.method1826(true, var2);
                if (var5.field9743 == null) {
                    var5.field9743 = new class683[var4 + 1];
                    var5.field9825 = var5.field9743;
                }
                if (var5.field9743.length <= var4) {
                    if (var5.field9825 == var5.field9743) {
                        class683[] var6 = new class683[var4 + 1];
                        for (int var7 = 0; var7 < var5.field9743.length; var7++) {
                            var6[var7] = var5.field9743[var7];
                        }
                        var5.field9743 = var5.field9825 = var6;
                    } else {
                        class683[] var8 = new class683[var4 + 1];
                        class683[] var9 = new class683[var4 + 1];
                        for (int var10 = 0; var10 < var5.field9743.length; var10++) {
                            var8[var10] = var5.field9743[var10];
                            var9[var10] = var5.field9825[var10];
                        }
                        var5.field9743 = var8;
                        var5.field9825 = var9;
                    }
                }
                if (var4 > 0 && var5.field9743[var4 - 1] == null) {
                    throw new RuntimeException(field8680[11] + (var4 - 1));
                }
                class683 var11 = new class683();
                var11.field9782 = var3;
                var11.field9764 = var11.field9774 = var5.field9774;
                var11.field9799 = var4;
                var5.field9743[var4] = var11;
                if (var5.field9825 != var5.field9743) {
                    var5.field9825[var4] = var11;
                }
                if (arg1) {
                    field8660 = var11;
                } else {
                    field8666 = var11;
                }
                class454.method3525((byte) 27, var5);
                return;
            }
            if (arg0 == 151) {
                class683 var12 = arg1 ? field8660 : field8666;
                if (var12.field9799 == -1) {
                    if (arg1) {
                        throw new RuntimeException(field8680[3]);
                    }
                    throw new RuntimeException(field8680[2]);
                }
                class683 var13 = class200.method1826(true, var12.field9774);
                var13.field9743[var12.field9799] = null;
                class454.method3525((byte) 27, var13);
                return;
            }
            if (arg0 == 152) {
                class683 var14 = class200.method1826(true, field8654[--field8661]);
                var14.field9743 = null;
                var14.field9825 = null;
                class454.method3525((byte) 27, var14);
                return;
            }
            if (arg0 == 200) {
                field8661 -= 2;
                int var15 = field8654[field8661];
                int var16 = field8654[field8661 + 1];
                class683 var17 = class454.method3528(0, var16, var15);
                if (var17 != null && var16 != -1) {
                    field8654[field8661++] = 1;
                    if (arg1) {
                        field8660 = var17;
                        return;
                    }
                    field8666 = var17;
                    return;
                }
                field8654[field8661++] = 0;
                return;
            }
            if (arg0 == 201) {
                int var18 = field8654[--field8661];
                class683 var19 = class200.method1826(true, var18);
                if (var19 != null) {
                    field8654[field8661++] = 1;
                    if (arg1) {
                        field8660 = var19;
                        return;
                    }
                    field8666 = var19;
                    return;
                }
                field8654[field8661++] = 0;
                return;
            }
            if (arg0 == 202 || arg0 == 204) {
                class683 var23;
                if (arg0 == 202) {
                    int var22 = field8654[--field8661];
                    var23 = class200.method1826(true, var22);
                } else {
                    var23 = arg1 ? field8660 : field8666;
                }
                method4386(var23);
                return;
            }
            if (arg0 == 203 || arg0 == 205) {
                class683 var21;
                if (arg0 == 203) {
                    int var20 = field8654[--field8661];
                    var21 = class200.method1826(true, var20);
                } else {
                    var21 = arg1 ? field8660 : field8666;
                }
                method4387(var21);
                return;
            }
        } else if (arg0 < 500) {
            if (arg0 == 403) {
                field8661 -= 2;
                int var24 = field8654[field8661];
                int var25 = field8654[field8661 + 1];
                if (class438.field6846.field10798 == null) {
                    return;
                }
                for (int var26 = 0; var26 < class630.field9057.length; var26++) {
                    if (class630.field9057[var26] == var24) {
                        class438.field6846.field10798.method1202(-32452, var26, var25, class6.field55);
                        return;
                    }
                }
                for (int var27 = 0; var27 < class85.field1281.length; var27++) {
                    if (class85.field1281[var27] == var24) {
                        class438.field6846.field10798.method1202(-32452, var27, var25, class6.field55);
                        return;
                    }
                }
                return;
            }
            if (arg0 == 404) {
                field8661 -= 2;
                int var28 = field8654[field8661];
                int var29 = field8654[field8661 + 1];
                if (class438.field6846.field10798 == null) {
                    return;
                }
                class438.field6846.field10798.method1207(false, var28, var29);
                return;
            }
            if (arg0 == 410) {
                boolean var30 = field8654[--field8661] != 0;
                if (class438.field6846.field10798 == null) {
                    return;
                }
                class438.field6846.field10798.method1201((byte) -120, var30);
                return;
            }
            if (arg0 == 411) {
                field8661 -= 2;
                int var31 = field8654[field8661];
                int var32 = field8654[field8661 + 1];
                if (class438.field6846.field10798 == null) {
                    return;
                }
                class438.field6846.field10798.method1203(-1, var32, var31, class229.field3563);
                return;
            }
        } else if (!(arg0 < 1000 || arg0 >= 1100) || !(arg0 < 2000 || arg0 >= 2100)) {
            class683 var33;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var33 = class200.method1826(true, field8654[--field8661]);
            } else {
                var33 = arg1 ? field8660 : field8666;
            }
            if (arg0 == 1000) {
                field8661 -= 4;
                var33.field9796 = field8654[field8661];
                var33.field9814 = field8654[field8661 + 1];
                int var34 = field8654[field8661 + 2];
                if (var34 < 0) {
                    var34 = 0;
                } else if (var34 > 5) {
                    var34 = 5;
                }
                int var35 = field8654[field8661 + 3];
                if (var35 < 0) {
                    var35 = 0;
                } else if (var35 > 5) {
                    var35 = 5;
                }
                var33.field9820 = (byte) var34;
                var33.field9889 = (byte) var35;
                class454.method3525((byte) 27, var33);
                class115.method1142(false, var33);
                if (var33.field9799 == -1) {
                    class613.method4460(var33.field9774, true);
                }
                return;
            }
            if (arg0 == 1001) {
                field8661 -= 4;
                var33.field9788 = field8654[field8661];
                var33.field9891 = field8654[field8661 + 1];
                var33.field9812 = 0;
                var33.field9876 = 0;
                int var36 = field8654[field8661 + 2];
                if (var36 < 0) {
                    var36 = 0;
                } else if (var36 > 4) {
                    var36 = 4;
                }
                int var37 = field8654[field8661 + 3];
                if (var37 < 0) {
                    var37 = 0;
                } else if (var37 > 4) {
                    var37 = 4;
                }
                var33.field9832 = (byte) var36;
                var33.field9792 = (byte) var37;
                class454.method3525((byte) 27, var33);
                class115.method1142(false, var33);
                if (var33.field9782 == 0) {
                    class151.method1371(var33, (byte) -121, false);
                }
                return;
            }
            if (arg0 == 1003) {
                boolean var38 = field8654[--field8661] == 1;
                if (var33.field9784 != var38) {
                    var33.field9784 = var38;
                    class454.method3525((byte) 27, var33);
                }
                if (var33.field9799 == -1) {
                    class504.method3800(77, var33.field9774);
                }
                return;
            }
            if (arg0 == 1004) {
                field8661 -= 2;
                var33.field9762 = field8654[field8661];
                var33.field9745 = field8654[field8661 + 1];
                class454.method3525((byte) 27, var33);
                class115.method1142(false, var33);
                if (var33.field9782 == 0) {
                    class151.method1371(var33, (byte) -122, false);
                }
                return;
            }
            if (arg0 == 1005) {
                var33.field9732 = field8654[--field8661] == 1;
                return;
            }
        } else if (arg0 >= 1100 && arg0 < 1200 || arg0 >= 2100 && arg0 < 2200) {
            class683 var39;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var39 = class200.method1826(true, field8654[--field8661]);
            } else {
                var39 = arg1 ? field8660 : field8666;
            }
            if (arg0 == 1100) {
                field8661 -= 2;
                var39.field9739 = field8654[field8661];
                if (var39.field9739 > var39.field9716 - var39.field9797) {
                    var39.field9739 = var39.field9716 - var39.field9797;
                }
                if (var39.field9739 < 0) {
                    var39.field9739 = 0;
                }
                var39.field9744 = field8654[field8661 + 1];
                if (var39.field9744 > var39.field9821 - var39.field9777) {
                    var39.field9744 = var39.field9821 - var39.field9777;
                }
                if (var39.field9744 < 0) {
                    var39.field9744 = 0;
                }
                class454.method3525((byte) 27, var39);
                if (var39.field9799 == -1) {
                    class169.method1570((byte) -103, var39.field9774);
                }
                return;
            }
            if (arg0 == 1101) {
                var39.field9789 = field8654[--field8661];
                class454.method3525((byte) 27, var39);
                if (var39.field9799 == -1) {
                    class449.method3500(-13314, var39.field9774);
                }
                return;
            }
            if (arg0 == 1102) {
                var39.field9754 = field8654[--field8661] == 1;
                class454.method3525((byte) 27, var39);
                return;
            }
            if (arg0 == 1103) {
                var39.field9827 = field8654[--field8661];
                class454.method3525((byte) 27, var39);
                return;
            }
            if (arg0 == 1104) {
                var39.field9860 = field8654[--field8661];
                class454.method3525((byte) 27, var39);
                return;
            }
            if (arg0 == 1105) {
                int var40 = field8654[--field8661];
                if (var39.field9737 != var40) {
                    var39.field9737 = var40;
                    class454.method3525((byte) 27, var39);
                }
                if (var39.field9799 == -1) {
                    class337.method2845(var39.field9774, true);
                }
                return;
            }
            if (arg0 == 1106) {
                var39.field9771 = field8654[--field8661];
                class454.method3525((byte) 27, var39);
                return;
            }
            if (arg0 == 1107) {
                var39.field9770 = field8654[--field8661] == 1;
                class454.method3525((byte) 27, var39);
                return;
            }
            if (arg0 == 1108) {
                var39.field9768 = 1;
                var39.field9765 = field8654[--field8661];
                class454.method3525((byte) 27, var39);
                if (var39.field9799 == -1) {
                    class588.method4321(var39.field9774, (byte) 121);
                }
                return;
            }
            if (arg0 == 1109) {
                field8661 -= 6;
                var39.field9856 = field8654[field8661];
                var39.field9882 = field8654[field8661 + 1];
                var39.field9727 = field8654[field8661 + 2];
                var39.field9879 = field8654[field8661 + 3];
                var39.field9842 = field8654[field8661 + 4];
                var39.field9791 = field8654[field8661 + 5];
                class454.method3525((byte) 27, var39);
                if (var39.field9799 == -1) {
                    class536.method4003(103, var39.field9774);
                    class527.method3942(var39.field9774, -2);
                }
                return;
            }
            if (arg0 == 1110) {
                int var41 = field8654[--field8661];
                if (var39.field9824 != var41) {
                    var39.field9824 = var41;
                    var39.field9769 = 0;
                    var39.field9873 = 1;
                    var39.field9874 = 0;
                    class210 var42 = var39.field9824 == -1 ? null : class397.field6293.method2058(var39.field9824, (byte) -77);
                    if (var42 != null) {
                        class290.method2443((byte) 105, var39.field9769, var42);
                    }
                    class454.method3525((byte) 27, var39);
                }
                if (var39.field9799 == -1) {
                    class761.method5499(9705, var39.field9774);
                }
                return;
            }
            if (arg0 == 1111) {
                var39.field9804 = field8654[--field8661] == 1;
                class454.method3525((byte) 27, var39);
                return;
            }
            if (arg0 == 1112) {
                String var43 = field8674[--field8663];
                if (!var43.equals(var39.field9780)) {
                    var39.field9780 = var43;
                    class454.method3525((byte) 27, var39);
                }
                if (var39.field9799 == -1) {
                    class487.method3697(-22726, var39.field9774);
                }
                return;
            }
            if (arg0 == 1113) {
                var39.field9718 = field8654[--field8661];
                class454.method3525((byte) 27, var39);
                if (var39.field9799 == -1) {
                    class135.method1264(var39.field9774, (byte) -86);
                }
                return;
            }
            if (arg0 == 1114) {
                field8661 -= 3;
                var39.field9725 = field8654[field8661];
                var39.field9781 = field8654[field8661 + 1];
                var39.field9849 = field8654[field8661 + 2];
                class454.method3525((byte) 27, var39);
                return;
            }
            if (arg0 == 1115) {
                var39.field9748 = field8654[--field8661] == 1;
                class454.method3525((byte) 27, var39);
                return;
            }
            if (arg0 == 1116) {
                var39.field9888 = field8654[--field8661];
                class454.method3525((byte) 27, var39);
                return;
            }
            if (arg0 == 1117) {
                var39.field9826 = field8654[--field8661];
                class454.method3525((byte) 27, var39);
                return;
            }
            if (arg0 == 1118) {
                var39.field9854 = field8654[--field8661] == 1;
                class454.method3525((byte) 27, var39);
                return;
            }
            if (arg0 == 1119) {
                var39.field9810 = field8654[--field8661] == 1;
                class454.method3525((byte) 27, var39);
                return;
            }
            if (arg0 == 1120) {
                field8661 -= 2;
                var39.field9716 = field8654[field8661];
                var39.field9821 = field8654[field8661 + 1];
                class454.method3525((byte) 27, var39);
                if (var39.field9782 == 0) {
                    class151.method1371(var39, (byte) -62, false);
                }
                return;
            }
            if (arg0 == 1122) {
                var39.field9742 = field8654[--field8661] == 1;
                class454.method3525((byte) 27, var39);
                return;
            }
            if (arg0 == 1123) {
                var39.field9791 = field8654[--field8661];
                class454.method3525((byte) 27, var39);
                if (var39.field9799 == -1) {
                    class536.method4003(111, var39.field9774);
                }
                return;
            }
            if (arg0 == 1124) {
                int var44 = field8654[--field8661];
                var39.field9726 = var44 == 1;
                class454.method3525((byte) 27, var39);
                return;
            }
            if (arg0 == 1125) {
                field8661 -= 2;
                var39.field9758 = field8654[field8661];
                var39.field9712 = field8654[field8661 + 1];
                class454.method3525((byte) 27, var39);
                return;
            }
            if (arg0 == 1126) {
                var39.field9851 = field8654[--field8661];
                class454.method3525((byte) 27, var39);
                return;
            }
            if (arg0 == 1127) {
                field8661 -= 2;
                int var45 = field8654[field8661];
                int var46 = field8654[field8661 + 1];
                class668 var47 = class289.field4655.method97(var45, (byte) 38);
                if (var47.field9501 != var46) {
                    var39.method4973(var45, var46, 5);
                    return;
                }
                var39.method4978(11127, var45);
                return;
            }
            if (arg0 == 1128) {
                int var48 = field8654[--field8661];
                String var49 = field8674[--field8663];
                class668 var50 = class289.field4655.method97(var48, (byte) 38);
                if (!var50.field9494.equals(var49)) {
                    var39.method4967(var48, -122, var49);
                    return;
                }
                var39.method4978(11127, var48);
                return;
            }
            if (arg0 == 1129 || arg0 == 1130) {
                int var57 = field8654[--field8661];
                if ((var39.field9782 == 5 || arg0 != 1129) && (var39.field9782 == 4 || arg0 != 1130)) {
                    if (var39.field9778 != var57) {
                        var39.field9778 = var57;
                        class454.method3525((byte) 27, var39);
                    }
                    if (var39.field9799 == -1) {
                        class475.method3634(var39.field9774, (byte) 16);
                    }
                    return;
                }
                return;
            }
            if (arg0 == 1131) {
                field8661 -= 3;
                int var51 = field8654[field8661];
                short var52 = (short) field8654[field8661 + 1];
                short var53 = (short) field8654[field8661 + 2];
                if (var51 >= 0 && var51 < 5) {
                    var39.method4966((byte) -78, var52, var53, var51);
                    class454.method3525((byte) 27, var39);
                    if (var39.field9799 == -1) {
                        class342.method2878(18, var39.field9774, var51);
                    }
                    return;
                }
                return;
            }
            if (arg0 == 1132) {
                field8661 -= 3;
                int var54 = field8654[field8661];
                short var55 = (short) field8654[field8661 + 1];
                short var56 = (short) field8654[field8661 + 2];
                if (var54 >= 0 && var54 < 5) {
                    var39.method4981(var56, var55, 0, var54);
                    class454.method3525((byte) 27, var39);
                    if (var39.field9799 == -1) {
                        class796.method5714(var39.field9774, -23608, var54);
                    }
                    return;
                }
                return;
            }
        } else if (!(arg0 < 1200 || arg0 >= 1300) || !(arg0 < 2200 || arg0 >= 2300)) {
            class683 var58;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var58 = class200.method1826(true, field8654[--field8661]);
            } else {
                var58 = arg1 ? field8660 : field8666;
            }
            class454.method3525((byte) 27, var58);
            if (arg0 == 1200 || arg0 == 1205 || arg0 == 1208 || arg0 == 1209 || arg0 == 1212 || arg0 == 1213) {
                field8661 -= 2;
                int var59 = field8654[field8661];
                int var60 = field8654[field8661 + 1];
                if (var58.field9799 == -1) {
                    class274.method2352(var58.field9774, 32768);
                    class536.method4003(88, var58.field9774);
                    class527.method3942(var58.field9774, 122);
                }
                if (var59 == -1) {
                    var58.field9768 = 1;
                    var58.field9765 = -1;
                    var58.field9807 = -1;
                    return;
                }
                var58.field9807 = var59;
                var58.field9864 = var60;
                if (arg0 == 1208 || arg0 == 1209) {
                    var58.field9736 = true;
                } else {
                    var58.field9736 = false;
                }
                class584 var61 = class229.field3563.method531(var59, (byte) 49);
                var58.field9727 = var61.field8429;
                var58.field9879 = var61.field8455;
                var58.field9842 = var61.field8413;
                var58.field9856 = var61.field8473;
                var58.field9882 = var61.field8422;
                var58.field9791 = var61.field8415;
                if (arg0 == 1205 || arg0 == 1209) {
                    var58.field9740 = 0;
                } else if (arg0 == 1212 || arg0 == 1213) {
                    var58.field9740 = 1;
                } else {
                    var58.field9740 = 2;
                }
                if (var58.field9812 > 0) {
                    var58.field9791 = var58.field9791 * 32 / var58.field9812;
                    return;
                }
                if (var58.field9788 > 0) {
                    var58.field9791 = var58.field9791 * 32 / var58.field9788;
                }
                return;
            }
            if (arg0 == 1201) {
                var58.field9768 = 2;
                var58.field9765 = field8654[--field8661];
                if (var58.field9799 == -1) {
                    class588.method4321(var58.field9774, (byte) 121);
                }
                return;
            }
            if (arg0 == 1202) {
                var58.field9768 = 3;
                var58.field9765 = -1;
                if (var58.field9799 == -1) {
                    class588.method4321(var58.field9774, (byte) 121);
                }
                return;
            }
            if (arg0 == 1203) {
                var58.field9768 = 6;
                var58.field9765 = field8654[--field8661];
                if (var58.field9799 == -1) {
                    class588.method4321(var58.field9774, (byte) 121);
                }
                return;
            }
            if (arg0 == 1204) {
                var58.field9768 = 5;
                var58.field9765 = field8654[--field8661];
                if (var58.field9799 == -1) {
                    class588.method4321(var58.field9774, (byte) 121);
                }
                return;
            }
            if (arg0 == 1206) {
                field8661 -= 4;
                var58.field9871 = field8654[field8661];
                var58.field9881 = field8654[field8661 + 1];
                var58.field9847 = field8654[field8661 + 2];
                var58.field9733 = field8654[field8661 + 3];
                class454.method3525((byte) 27, var58);
                return;
            }
            if (arg0 == 1207) {
                field8661 -= 2;
                var58.field9869 = field8654[field8661];
                var58.field9850 = field8654[field8661 + 1];
                class454.method3525((byte) 27, var58);
                return;
            }
            if (arg0 == 1210) {
                field8661 -= 4;
                var58.field9765 = field8654[field8661];
                var58.field9863 = field8654[field8661 + 1];
                if (field8654[field8661 + 2] == 1) {
                    var58.field9768 = 9;
                } else {
                    var58.field9768 = 8;
                }
                if (field8654[field8661 + 3] == 1) {
                    var58.field9736 = true;
                } else {
                    var58.field9736 = false;
                }
                if (var58.field9799 == -1) {
                    class588.method4321(var58.field9774, (byte) 121);
                }
                return;
            }
            if (arg0 == 1211) {
                var58.field9768 = 5;
                var58.field9765 = class356.field5733;
                var58.field9863 = 0;
                if (var58.field9799 == -1) {
                    class588.method4321(var58.field9774, (byte) 121);
                }
                return;
            }
        } else if (arg0 >= 1300 && arg0 < 1400 || arg0 >= 2300 && arg0 < 2400) {
            class683 var62;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var62 = class200.method1826(true, field8654[--field8661]);
            } else {
                var62 = arg1 ? field8660 : field8666;
            }
            if (arg0 == 1300) {
                int var63 = field8654[--field8661] - 1;
                if (var63 >= 0 && var63 <= 9) {
                    var62.method4965(field8674[--field8663], (byte) 95, var63);
                    return;
                }
                field8663--;
                return;
            }
            if (arg0 == 1301) {
                field8661 -= 2;
                int var64 = field8654[field8661];
                int var65 = field8654[field8661 + 1];
                if (var64 == -1 && var65 == -1) {
                    var62.field9841 = null;
                    return;
                }
                var62.field9841 = class454.method3528(0, var65, var64);
                return;
            }
            if (arg0 == 1302) {
                int var66 = field8654[--field8661];
                if (class456.field7044 != var66 && class242.field3746 != var66 && class605.field8721 != var66) {
                    return;
                }
                var62.field9766 = var66;
                return;
            }
            if (arg0 == 1303) {
                var62.field9783 = field8654[--field8661];
                return;
            }
            if (arg0 == 1304) {
                var62.field9773 = field8654[--field8661];
                return;
            }
            if (arg0 == 1305) {
                var62.field9724 = field8674[--field8663];
                return;
            }
            if (arg0 == 1306) {
                var62.field9720 = field8674[--field8663];
                return;
            }
            if (arg0 == 1307) {
                var62.field9757 = null;
                return;
            }
            if (arg0 == 1308) {
                var62.field9785 = field8654[--field8661];
                var62.field9833 = field8654[--field8661];
                return;
            }
            if (arg0 == 1309) {
                int var67 = field8654[--field8661];
                int var68 = field8654[--field8661];
                if (var68 >= 1 && var68 <= 10) {
                    var62.method4982(var68 - 1, 20987, var67);
                }
                return;
            }
            if (arg0 == 1310) {
                var62.field9840 = field8674[--field8663];
                return;
            }
            if (arg0 == 1311) {
                var62.field9839 = field8654[--field8661];
                return;
            }
            if (arg0 == 1312 || arg0 == 1313) {
                int var69;
                int var70;
                int var71;
                if (arg0 == 1312) {
                    field8661 -= 3;
                    var69 = field8654[field8661] - 1;
                    var70 = field8654[field8661 + 1];
                    var71 = field8654[field8661 + 2];
                    if (var69 < 0 || var69 > 9) {
                        throw new RuntimeException(field8680[6]);
                    }
                } else {
                    field8661 -= 2;
                    var69 = 10;
                    var70 = field8654[field8661];
                    var71 = field8654[field8661 + 1];
                }
                if (var62.field9809 == null) {
                    if (var70 == 0) {
                        return;
                    }
                    var62.field9809 = new byte[11];
                    var62.field9811 = new byte[11];
                    var62.field9805 = new int[11];
                }
                var62.field9809[var69] = (byte) var70;
                if (var70 == 0) {
                    var62.field9877 = false;
                    for (int var72 = 0; var72 < var62.field9809.length; var72++) {
                        if (var62.field9809[var72] != 0) {
                            var62.field9877 = true;
                            break;
                        }
                    }
                } else {
                    var62.field9877 = true;
                }
                var62.field9811[var69] = (byte) var71;
                return;
            }
            if (arg0 == 1314) {
                var62.field9714 = field8654[--field8661];
                return;
            }
        } else if (arg0 >= 1400 && arg0 < 1500 || arg0 >= 2400 && arg0 < 2500) {
            class683 var73;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var73 = class200.method1826(true, field8654[--field8661]);
            } else {
                var73 = arg1 ? field8660 : field8666;
            }
            if (arg0 == 1499) {
                var73.method4983(-69);
                return;
            }
            String var74 = field8674[--field8663];
            int[] var75 = null;
            if (var74.length() > 0 && var74.charAt(var74.length() - 1) == 'Y') {
                int var76 = field8654[--field8661];
                if (var76 > 0) {
                    var75 = new int[var76];
                    while (var76-- > 0) {
                        var75[var76] = field8654[--field8661];
                    }
                }
                var74 = var74.substring(0, var74.length() - 1);
            }
            Object[] var77 = new Object[var74.length() + 1];
            for (int var78 = var77.length - 1; var78 >= 1; var78--) {
                if (var74.charAt(var78 - 1) == 's') {
                    var77[var78] = field8674[--field8663];
                } else if (var74.charAt(var78 - 1) == '§') {
                    var77[var78] = Long.valueOf(field8665[--field8659]);
                } else {
                    var77[var78] = Integer.valueOf(field8654[--field8661]);
                }
            }
            int var79 = field8654[--field8661];
            if (var79 == -1) {
                var77 = null;
            } else {
                var77[0] = Integer.valueOf(var79);
            }
            if (arg0 == 1400) {
                var73.field9734 = var77;
            } else if (arg0 == 1401) {
                var73.field9752 = var77;
            } else if (arg0 == 1402) {
                var73.field9750 = var77;
            } else if (arg0 == 1403) {
                var73.field9830 = var77;
            } else if (arg0 == 1404) {
                var73.field9837 = var77;
            } else if (arg0 == 1405) {
                var73.field9855 = var77;
            } else if (arg0 == 1406) {
                var73.field9790 = var77;
            } else if (arg0 == 1407) {
                var73.field9753 = var77;
                var73.field9822 = var75;
            } else if (arg0 == 1408) {
                var73.field9713 = var77;
            } else if (arg0 == 1409) {
                var73.field9859 = var77;
            } else if (arg0 == 1410) {
                var73.field9761 = var77;
            } else if (arg0 == 1411) {
                var73.field9735 = var77;
            } else if (arg0 == 1412) {
                var73.field9836 = var77;
            } else if (arg0 == 1414) {
                var73.field9828 = var77;
                var73.field9823 = var75;
            } else if (arg0 == 1415) {
                var73.field9787 = var77;
                var73.field9866 = var75;
            } else if (arg0 == 1416) {
                var73.field9852 = var77;
            } else if (arg0 == 1417) {
                var73.field9816 = var77;
            } else if (arg0 == 1418) {
                var73.field9715 = var77;
            } else if (arg0 == 1419) {
                var73.field9795 = var77;
            } else if (arg0 == 1420) {
                var73.field9886 = var77;
            } else if (arg0 == 1421) {
                var73.field9730 = var77;
            } else if (arg0 == 1422) {
                var73.field9722 = var77;
            } else if (arg0 == 1423) {
                var73.field9880 = var77;
            } else if (arg0 == 1424) {
                var73.field9729 = var77;
            } else if (arg0 == 1425) {
                var73.field9717 = var77;
            } else if (arg0 == 1426) {
                var73.field9741 = var77;
            } else if (arg0 == 1427) {
                var73.field9838 = var77;
            } else if (arg0 == 1428) {
                var73.field9843 = var77;
                var73.field9776 = var75;
            } else if (arg0 == 1429) {
                var73.field9834 = var77;
                var73.field9798 = var75;
            } else if (arg0 == 1430) {
                var73.field9818 = var77;
            } else if (arg0 == 1431) {
                var73.field9870 = var77;
            } else if (arg0 == 1432) {
                var73.field9738 = var77;
            } else if (arg0 == 1433) {
                var73.field9808 = var77;
            }
            var73.field9835 = true;
            return;
        } else if (arg0 < 1600) {
            class683 var80 = arg1 ? field8660 : field8666;
            if (arg0 == 1500) {
                field8654[field8661++] = var80.field9883;
                return;
            }
            if (arg0 == 1501) {
                field8654[field8661++] = var80.field9806;
                return;
            }
            if (arg0 == 1502) {
                field8654[field8661++] = var80.field9797;
                return;
            }
            if (arg0 == 1503) {
                field8654[field8661++] = var80.field9777;
                return;
            }
            if (arg0 == 1504) {
                field8654[field8661++] = var80.field9784 ? 1 : 0;
                return;
            }
            if (arg0 == 1505) {
                field8654[field8661++] = var80.field9764;
                return;
            }
            if (arg0 == 1506) {
                class683 var81 = class15.method109(0, var80);
                field8654[field8661++] = var81 == null ? -1 : var81.field9774;
                return;
            }
            if (arg0 == 1507) {
                field8654[field8661++] = var80.field9789;
                return;
            }
        } else if (arg0 < 1700) {
            class683 var82 = arg1 ? field8660 : field8666;
            if (arg0 == 1600) {
                field8654[field8661++] = var82.field9739;
                return;
            }
            if (arg0 == 1601) {
                field8654[field8661++] = var82.field9744;
                return;
            }
            if (arg0 == 1602) {
                field8674[field8663++] = var82.field9780;
                return;
            }
            if (arg0 == 1603) {
                field8654[field8661++] = var82.field9716;
                return;
            }
            if (arg0 == 1604) {
                field8654[field8661++] = var82.field9821;
                return;
            }
            if (arg0 == 1605) {
                field8654[field8661++] = var82.field9791;
                return;
            }
            if (arg0 == 1606) {
                field8654[field8661++] = var82.field9727;
                return;
            }
            if (arg0 == 1607) {
                field8654[field8661++] = var82.field9842;
                return;
            }
            if (arg0 == 1608) {
                field8654[field8661++] = var82.field9879;
                return;
            }
            if (arg0 == 1609) {
                field8654[field8661++] = var82.field9827;
                return;
            }
            if (arg0 == 1610) {
                field8654[field8661++] = var82.field9856;
                return;
            }
            if (arg0 == 1611) {
                field8654[field8661++] = var82.field9882;
                return;
            }
            if (arg0 == 1612) {
                field8654[field8661++] = var82.field9737;
                return;
            }
            if (arg0 == 1613) {
                int var83 = field8654[--field8661];
                class668 var84 = class289.field4655.method97(var83, (byte) 38);
                if (var84.method4844(1)) {
                    field8674[field8663++] = var82.method4972(false, var84.field9494, var83);
                    return;
                }
                field8654[field8661++] = var82.method4980(var84.field9501, var83, 122);
                return;
            }
            if (arg0 == 1614) {
                field8654[field8661++] = var82.field9771;
                return;
            }
            if (arg0 == 2614) {
                field8654[field8661++] = var82.field9768 == 1 ? var82.field9765 : -1;
                return;
            }
        } else if (arg0 < 1800) {
            class683 var85 = arg1 ? field8660 : field8666;
            if (arg0 == 1700) {
                field8654[field8661++] = var85.field9807;
                return;
            }
            if (arg0 == 1701) {
                if (var85.field9807 != -1) {
                    field8654[field8661++] = var85.field9864;
                    return;
                }
                field8654[field8661++] = 0;
                return;
            }
            if (arg0 == 1702) {
                field8654[field8661++] = var85.field9799;
                return;
            }
        } else if (arg0 < 1900) {
            class683 var86 = arg1 ? field8660 : field8666;
            if (arg0 == 1800) {
                field8654[field8661++] = client.method2695(var86).method3481(59);
                return;
            }
            if (arg0 == 1801) {
                int var87 = field8654[--field8661];
                int var388 = var87 - 1;
                if (var86.field9757 != null && var388 < var86.field9757.length && var86.field9757[var388] != null) {
                    field8674[field8663++] = var86.field9757[var388];
                    return;
                }
                field8674[field8663++] = "";
                return;
            }
            if (arg0 == 1802) {
                if (var86.field9724 == null) {
                    field8674[field8663++] = "";
                    return;
                }
                field8674[field8663++] = var86.field9724;
                return;
            }
        } else if (arg0 < 2000 || !(arg0 < 2900 || arg0 >= 3000)) {
            class683 var386;
            if (arg0 >= 2000) {
                var386 = class200.method1826(true, field8654[--field8661]);
                arg0 -= 1000;
            } else {
                var386 = arg1 ? field8660 : field8666;
            }
            if (field8677 >= 10) {
                throw new RuntimeException(field8680[12]);
            }
            if (arg0 == 1927) {
                if (var386.field9838 == null) {
                    return;
                }
                class730 var387 = new class730();
                var387.field10693 = var386;
                var387.field10692 = var386.field9838;
                var387.field10689 = field8677 + 1;
                class461.field7104.method3220(var387, 0);
                return;
            }
        } else if (arg0 < 2600) {
            class683 var88 = class200.method1826(true, field8654[--field8661]);
            if (arg0 == 2500) {
                field8654[field8661++] = var88.field9883;
                return;
            }
            if (arg0 == 2501) {
                field8654[field8661++] = var88.field9806;
                return;
            }
            if (arg0 == 2502) {
                field8654[field8661++] = var88.field9797;
                return;
            }
            if (arg0 == 2503) {
                field8654[field8661++] = var88.field9777;
                return;
            }
            if (arg0 == 2504) {
                field8654[field8661++] = var88.field9784 ? 1 : 0;
                return;
            }
            if (arg0 == 2505) {
                field8654[field8661++] = var88.field9764;
                return;
            }
            if (arg0 == 2506) {
                class683 var89 = class15.method109(0, var88);
                field8654[field8661++] = var89 == null ? -1 : var89.field9774;
                return;
            }
            if (arg0 == 2507) {
                field8654[field8661++] = var88.field9789;
                return;
            }
        } else if (arg0 < 2700) {
            class683 var90 = class200.method1826(true, field8654[--field8661]);
            if (arg0 == 2600) {
                field8654[field8661++] = var90.field9739;
                return;
            }
            if (arg0 == 2601) {
                field8654[field8661++] = var90.field9744;
                return;
            }
            if (arg0 == 2602) {
                field8674[field8663++] = var90.field9780;
                return;
            }
            if (arg0 == 2603) {
                field8654[field8661++] = var90.field9716;
                return;
            }
            if (arg0 == 2604) {
                field8654[field8661++] = var90.field9821;
                return;
            }
            if (arg0 == 2605) {
                field8654[field8661++] = var90.field9791;
                return;
            }
            if (arg0 == 2606) {
                field8654[field8661++] = var90.field9727;
                return;
            }
            if (arg0 == 2607) {
                field8654[field8661++] = var90.field9842;
                return;
            }
            if (arg0 == 2608) {
                field8654[field8661++] = var90.field9879;
                return;
            }
            if (arg0 == 2609) {
                field8654[field8661++] = var90.field9827;
                return;
            }
            if (arg0 == 2610) {
                field8654[field8661++] = var90.field9856;
                return;
            }
            if (arg0 == 2611) {
                field8654[field8661++] = var90.field9882;
                return;
            }
            if (arg0 == 2612) {
                field8654[field8661++] = var90.field9737;
                return;
            }
            if (arg0 == 2613) {
                field8654[field8661++] = var90.field9771;
                return;
            }
            if (arg0 == 2614) {
                field8654[field8661++] = var90.field9768 == 1 ? var90.field9765 : -1;
                return;
            }
        } else if (arg0 < 2800) {
            if (arg0 == 2700) {
                class683 var91 = class200.method1826(true, field8654[--field8661]);
                field8654[field8661++] = var91.field9807;
                return;
            }
            if (arg0 == 2701) {
                class683 var92 = class200.method1826(true, field8654[--field8661]);
                if (var92.field9807 != -1) {
                    field8654[field8661++] = var92.field9864;
                    return;
                }
                field8654[field8661++] = 0;
                return;
            }
            if (arg0 == 2702) {
                int var93 = field8654[--field8661];
                class23 var94 = (class23) class632.field9082.method737((byte) -39, (long) var93);
                if (var94 != null) {
                    field8654[field8661++] = 1;
                    return;
                }
                field8654[field8661++] = 0;
                return;
            }
            if (arg0 == 2703) {
                class683 var95 = class200.method1826(true, field8654[--field8661]);
                if (var95.field9743 == null) {
                    field8654[field8661++] = 0;
                    return;
                }
                int var96 = var95.field9743.length;
                for (int var97 = 0; var97 < var95.field9743.length; var97++) {
                    if (var95.field9743[var97] == null) {
                        var96 = var97;
                        break;
                    }
                }
                field8654[field8661++] = var96;
                return;
            }
            if (arg0 == 2704 || arg0 == 2705) {
                field8661 -= 2;
                int var98 = field8654[field8661];
                int var99 = field8654[field8661 + 1];
                class23 var100 = (class23) class632.field9082.method737((byte) -39, (long) var98);
                if (var100 != null && var100.field219 == var99) {
                    field8654[field8661++] = 1;
                    return;
                }
                field8654[field8661++] = 0;
                return;
            }
        } else if (arg0 < 2900) {
            class683 var101 = class200.method1826(true, field8654[--field8661]);
            if (arg0 == 2800) {
                field8654[field8661++] = client.method2695(var101).method3481(81);
                return;
            }
            if (arg0 == 2801) {
                int var102 = field8654[--field8661];
                int var389 = var102 - 1;
                if (var101.field9757 != null && var389 < var101.field9757.length && var101.field9757[var389] != null) {
                    field8674[field8663++] = var101.field9757[var389];
                    return;
                }
                field8674[field8663++] = "";
                return;
            }
            if (arg0 == 2802) {
                if (var101.field9724 == null) {
                    field8674[field8663++] = "";
                    return;
                }
                field8674[field8663++] = var101.field9724;
                return;
            }
        } else if (arg0 < 3200) {
            if (arg0 == 3100) {
                String var103 = field8674[--field8663];
                class559.method4117(-8988, var103);
                return;
            }
            if (arg0 == 3101) {
                field8661 -= 2;
                class16.method113(0, class438.field6846, field8654[field8661], field8654[field8661 + 1]);
                return;
            }
            if (arg0 == 3103) {
                class15.method110(true, 32);
                return;
            }
            if (arg0 == 3104) {
                String var104 = field8674[--field8663];
                int var105 = 0;
                if (class30.method316(10, var104)) {
                    var105 = class441.method3457(true, var104);
                }
                field8673++;
                class487 var106 = class618.method4519(113, class649.field9305, class185.field2948.field2659);
                var106.field7362.method1641((byte) -108, var105);
                class185.field2948.method1546(var106, 1);
                return;
            }
            if (arg0 == 3105) {
                String var107 = field8674[--field8663];
                field8662++;
                class487 var108 = class618.method4519(105, class342.field5583, class185.field2948.field2659);
                var108.field7362.method1678(var107.length() + 1, 65280);
                var108.field7362.method1681(var107, 23137);
                class185.field2948.method1546(var108, 1);
                return;
            }
            if (arg0 == 3106) {
                String var109 = field8674[--field8663];
                field8648++;
                class487 var110 = class618.method4519(15, class596.field8603, class185.field2948.field2659);
                var110.field7362.method1678(var109.length() + 1, 65280);
                var110.field7362.method1681(var109, 23137);
                class185.field2948.method1546(var110, 1);
                return;
            }
            if (arg0 == 3107) {
                int var111 = field8654[--field8661];
                String var112 = field8674[--field8663];
                class779.method5596(var111, 6211, var112);
                return;
            }
            if (arg0 == 3108) {
                field8661 -= 3;
                int var113 = field8654[field8661];
                int var114 = field8654[field8661 + 1];
                int var115 = field8654[field8661 + 2];
                class683 var116 = class200.method1826(true, var115);
                class343.method2882(var116, var114, (byte) 48, var113);
                return;
            }
            if (arg0 == 3109) {
                field8661 -= 2;
                int var117 = field8654[field8661];
                int var118 = field8654[field8661 + 1];
                class683 var119 = arg1 ? field8660 : field8666;
                class343.method2882(var119, var118, (byte) 104, var117);
                return;
            }
            if (arg0 == 3110) {
                int var120 = field8654[--field8661];
                field8653++;
                class487 var121 = class618.method4519(105, class196.field3115, class185.field2948.field2659);
                var121.field7362.method1650((byte) -95, var120);
                class185.field2948.method1546(var121, 1);
                return;
            }
            if (arg0 == 3111) {
                field8661 -= 2;
                int var122 = field8654[field8661];
                int var123 = field8654[field8661 + 1];
                class23 var124 = (class23) class632.field9082.method737((byte) -39, (long) var122);
                if (var124 != null) {
                    class52.method541(true, var124, var124.field219 != var123, (byte) -55);
                }
                class131.method1242((byte) 9, true, var122, var123, 3);
                return;
            }
            if (arg0 == 3112) {
                field8661--;
                int var125 = field8654[field8661];
                class23 var126 = (class23) class632.field9082.method737((byte) -39, (long) var125);
                if (var126 != null && var126.field220 == 3) {
                    class52.method541(true, var126, true, (byte) -55);
                }
                return;
            }
            if (arg0 == 3113) {
                class162.method1521(field8674[--field8663], (byte) 117);
                return;
            }
            if (arg0 == 3114) {
                field8661 -= 2;
                int var127 = field8654[field8661];
                int var128 = field8654[field8661 + 1];
                String var129 = field8674[--field8663];
                class585.method4297("", "", (byte) -120, var127, "", var129, var128);
                return;
            }
            if (arg0 == 3115) {
                field8661 -= 11;
                class662[] var130 = class268.method2315(false);
                class666[] var131 = class395.method3197(false);
                class785.method5648(field8654[field8661 + 10], field8654[field8661 + 8], field8654[field8661 + 6], var131[field8654[field8661 + 1]], field8654[field8661 + 5], field8654[field8661 + 2], 0, field8654[field8661 + 4], field8654[field8661 + 9], field8654[field8661 + 7], var130[field8654[field8661]], field8654[field8661 + 3]);
                return;
            }
            if (arg0 == 3116) {
                int var132 = field8654[--field8661];
                field8673++;
                class487 var133 = class618.method4519(120, class505.field7559, class185.field2948.field2659);
                var133.field7362.method1650((byte) -95, var132);
                class185.field2948.method1546(var133, 1);
                return;
            }
            if (arg0 == 3117) {
                String var134 = field8674[--field8663];
                class487 var135 = class618.method4519(53, class307.field4971, class185.field2948.field2659);
                var135.field7362.method1678(var134.length() + 1, 65280);
                var135.field7362.method1681(var134, 23137);
                class185.field2948.method1546(var135, 1);
                return;
            }
        } else if (arg0 < 3300) {
            if (arg0 == 3200) {
                field8661 -= 3;
                class356.method2948(255, (byte) 119, 256, field8654[field8661 + 1], field8654[field8661 + 2], field8654[field8661]);
                return;
            }
            if (arg0 == 3201) {
                class169.method1573(50, (byte) 109, field8654[--field8661], 255);
                return;
            }
            if (arg0 == 3202) {
                field8661 -= 2;
                class279.method2392(255, field8654[field8661], field8654[field8661 + 1], 255);
                return;
            }
            if (arg0 == 3203) {
                field8661 -= 4;
                class356.method2948(field8654[field8661 + 3], (byte) 2, 256, field8654[field8661 + 1], field8654[field8661 + 2], field8654[field8661]);
                return;
            }
            if (arg0 == 3204) {
                field8661 -= 3;
                class169.method1573(field8654[field8661 + 2], (byte) 60, field8654[field8661], field8654[field8661 + 1]);
                return;
            }
            if (arg0 == 3205) {
                field8661 -= 3;
                class279.method2392(field8654[field8661 + 2], field8654[field8661], field8654[field8661 + 1], 255);
                return;
            }
            if (arg0 == 3206) {
                field8661 -= 4;
                class136.method1271(field8654[field8661 + 1], 256, field8654[field8661], field8654[field8661 + 2], field8654[field8661 + 3], (byte) -45, false);
                return;
            }
            if (arg0 == 3207) {
                field8661 -= 4;
                class136.method1271(field8654[field8661 + 1], 256, field8654[field8661], field8654[field8661 + 2], field8654[field8661 + 3], (byte) 127, true);
                return;
            }
            if (arg0 == 3208) {
                field8661 -= 5;
                class356.method2948(field8654[field8661 + 3], (byte) -23, field8654[field8661 + 4], field8654[field8661 + 1], field8654[field8661 + 2], field8654[field8661]);
                return;
            }
            if (arg0 == 3209) {
                field8661 -= 5;
                class136.method1271(field8654[field8661 + 1], field8654[field8661 + 4], field8654[field8661], field8654[field8661 + 2], field8654[field8661 + 3], (byte) 123, false);
                return;
            }
        } else if (arg0 < 3400) {
            if (arg0 == 3300) {
                field8654[field8661++] = class431.field6776;
                return;
            }
            if (arg0 == 3301) {
                field8661 -= 2;
                int var136 = field8654[field8661];
                int var137 = field8654[field8661 + 1];
                field8654[field8661++] = class613.method4458(var137, 26874, var136, false);
                return;
            }
            if (arg0 == 3302) {
                field8661 -= 2;
                int var138 = field8654[field8661];
                int var139 = field8654[field8661 + 1];
                field8654[field8661++] = class208.method1879(true, var138, false, var139);
                return;
            }
            if (arg0 == 3303) {
                field8661 -= 2;
                int var140 = field8654[field8661];
                int var141 = field8654[field8661 + 1];
                field8654[field8661++] = class232.method2018(false, var141, 115, var140);
                return;
            }
            if (arg0 == 3304) {
                int var142 = field8654[--field8661];
                field8654[field8661++] = class374.field6073.method340(var142, 99).field8817;
                return;
            }
            if (arg0 == 3305) {
                int var143 = field8654[--field8661];
                field8654[field8661++] = class619.field8948[var143];
                return;
            }
            if (arg0 == 3306) {
                int var144 = field8654[--field8661];
                field8654[field8661++] = class483.field7333[var144];
                return;
            }
            if (arg0 == 3307) {
                int var145 = field8654[--field8661];
                field8654[field8661++] = class94.field1371[var145];
                return;
            }
            if (arg0 == 3308) {
                byte var146 = class438.field6846.field9975;
                int var147 = (class438.field6846.field9985 >> 9) + class397.field6289;
                int var148 = (class438.field6846.field9983 >> 9) + class141.field2011;
                field8654[field8661++] = (var146 << 28) + (var147 << 14) + var148;
                return;
            }
            if (arg0 == 3309) {
                int var149 = field8654[--field8661];
                field8654[field8661++] = var149 >> 14 & 0x3FFF;
                return;
            }
            if (arg0 == 3310) {
                int var150 = field8654[--field8661];
                field8654[field8661++] = var150 >> 28;
                return;
            }
            if (arg0 == 3311) {
                int var151 = field8654[--field8661];
                field8654[field8661++] = var151 & 0x3FFF;
                return;
            }
            if (arg0 == 3312) {
                field8654[field8661++] = class115.field1686 ? 1 : 0;
                return;
            }
            if (arg0 == 3313) {
                field8661 -= 2;
                int var152 = field8654[field8661];
                int var153 = field8654[field8661 + 1];
                field8654[field8661++] = class613.method4458(var153, 26874, var152, true);
                return;
            }
            if (arg0 == 3314) {
                field8661 -= 2;
                int var154 = field8654[field8661];
                int var155 = field8654[field8661 + 1];
                field8654[field8661++] = class208.method1879(true, var154, true, var155);
                return;
            }
            if (arg0 == 3315) {
                field8661 -= 2;
                int var156 = field8654[field8661];
                int var157 = field8654[field8661 + 1];
                field8654[field8661++] = class232.method2018(true, var157, 115, var156);
                return;
            }
            if (arg0 == 3316) {
                if (class264.field4283 >= 2) {
                    field8654[field8661++] = class264.field4283;
                    return;
                }
                field8654[field8661++] = 0;
                return;
            }
            if (arg0 == 3317) {
                field8654[field8661++] = class272.field4380;
                return;
            }
            if (arg0 == 3318) {
                field8654[field8661++] = class640.field9183.field7676;
                return;
            }
            if (arg0 == 3321) {
                field8654[field8661++] = class455.field7034;
                return;
            }
            if (arg0 == 3322) {
                field8654[field8661++] = class535.field7852;
                return;
            }
            if (arg0 == 3323) {
                if (class482.field7330 >= 5 && class482.field7330 <= 9) {
                    field8654[field8661++] = 1;
                    return;
                }
                field8654[field8661++] = 0;
                return;
            }
            if (arg0 == 3324) {
                if (class482.field7330 >= 5 && class482.field7330 <= 9) {
                    field8654[field8661++] = class482.field7330;
                    return;
                }
                field8654[field8661++] = 0;
                return;
            }
            if (arg0 == 3325) {
                field8654[field8661++] = class229.field3564 ? 1 : 0;
                return;
            }
            if (arg0 == 3326) {
                field8654[field8661++] = class438.field6846.field10845;
                return;
            }
            if (arg0 == 3327) {
                field8654[field8661++] = class438.field6846.field10798 != null && class438.field6846.field10798.field1813 ? 1 : 0;
                return;
            }
            if (arg0 == 3329) {
                field8654[field8661++] = class127.field1836 ? 1 : 0;
                return;
            }
            if (arg0 == 3330) {
                int var158 = field8654[--field8661];
                field8654[field8661++] = class173.method1599((byte) -53, false, var158);
                return;
            }
            if (arg0 == 3331) {
                field8661 -= 2;
                int var159 = field8654[field8661];
                int var160 = field8654[field8661 + 1];
                field8654[field8661++] = class201.method1830(var160, var159, false, false, false);
                return;
            }
            if (arg0 == 3332) {
                field8661 -= 2;
                int var161 = field8654[field8661];
                int var162 = field8654[field8661 + 1];
                field8654[field8661++] = class201.method1830(var162, var161, false, false, true);
                return;
            }
            if (arg0 == 3333) {
                field8654[field8661++] = class187.method1753((byte) 113);
                return;
            }
            if (arg0 == 3335) {
                field8654[field8661++] = class795.field11624;
                return;
            }
            if (arg0 == 3336) {
                field8661 -= 4;
                int var163 = field8654[field8661];
                int var164 = field8654[field8661 + 1];
                int var165 = field8654[field8661 + 2];
                int var166 = field8654[field8661 + 3];
                int var167 = (var164 << 14) + var163;
                int var168 = (var165 << 28) + var167;
                int var169 = var166 + var168;
                field8654[field8661++] = var169;
                return;
            }
            if (arg0 == 3337) {
                field8654[field8661++] = class734.field10757;
                return;
            }
            if (arg0 == 3338) {
                field8654[field8661++] = class428.method3393(75);
                return;
            }
            if (arg0 == 3339) {
                field8654[field8661++] = 0;
                return;
            }
            if (arg0 == 3340) {
                field8654[field8661++] = class198.field3143 ? 1 : 0;
                return;
            }
            if (arg0 == 3341) {
                field8654[field8661++] = class368.field5980 ? 1 : 0;
                return;
            }
            if (arg0 == 3342) {
                field8654[field8661++] = class15.field174.method5051(0);
                return;
            }
            if (arg0 == 3343) {
                field8654[field8661++] = class15.field174.method5048(true);
                return;
            }
            if (arg0 == 3344) {
                field8674[field8663++] = class443.method3472(-126);
                return;
            }
            if (arg0 == 3345) {
                field8674[field8663++] = class641.method4646(0);
                return;
            }
            if (arg0 == 3346) {
                field8654[field8661++] = class79.method824(-95);
                return;
            }
            if (arg0 == 3347) {
                field8654[field8661++] = class75.field1096;
                return;
            }
            if (arg0 == 3349) {
                field8654[field8661++] = class438.field6846.field1118.method4069(true) >> 3;
                return;
            }
        } else if (arg0 < 3500) {
            if (arg0 == 3400) {
                field8661 -= 2;
                int var170 = field8654[field8661];
                int var171 = field8654[field8661 + 1];
                class740 var172 = class793.field11596.method5400(var170, (byte) -113);
                field8674[field8663++] = var172.method5393(var171, -70);
                return;
            }
            if (arg0 == 3408) {
                field8661 -= 4;
                int var173 = field8654[field8661];
                int var174 = field8654[field8661 + 1];
                int var175 = field8654[field8661 + 2];
                int var176 = field8654[field8661 + 3];
                class740 var177 = class793.field11596.method5400(var175, (byte) -90);
                if (var177.field10904 == var173 && var177.field10888 == var174) {
                    if (var174 == 115) {
                        field8674[field8663++] = var177.method5393(var176, 120);
                        return;
                    }
                    field8654[field8661++] = var177.method5392(var176, (byte) 105);
                    return;
                }
                throw new RuntimeException(field8680[7] + var175 + "-" + var176);
            }
            if (arg0 == 3409) {
                field8661 -= 3;
                int var178 = field8654[field8661];
                int var179 = field8654[field8661 + 1];
                int var180 = field8654[field8661 + 2];
                if (var179 == -1) {
                    throw new RuntimeException(field8680[14]);
                }
                class740 var181 = class793.field11596.method5400(var179, (byte) -112);
                if (var181.field10888 != var178) {
                    throw new RuntimeException(field8680[8]);
                }
                field8654[field8661++] = var181.method5394(3, var180) ? 1 : 0;
                return;
            }
            if (arg0 == 3410) {
                int var182 = field8654[--field8661];
                String var183 = field8674[--field8663];
                if (var182 == -1) {
                    throw new RuntimeException(field8680[4]);
                }
                class740 var184 = class793.field11596.method5400(var182, (byte) -93);
                if (var184.field10888 != 's') {
                    throw new RuntimeException(field8680[5]);
                }
                field8654[field8661++] = var184.method5389(var183, 104) ? 1 : 0;
                return;
            }
            if (arg0 == 3411) {
                int var185 = field8654[--field8661];
                class740 var186 = class793.field11596.method5400(var185, (byte) -112);
                field8654[field8661++] = var186.method5396((byte) 18);
                return;
            }
        } else if (arg0 < 3700) {
            if (arg0 == 3600) {
                if (class413.field6573 == 0) {
                    field8654[field8661++] = -2;
                    return;
                }
                if (class413.field6573 == 1) {
                    field8654[field8661++] = -1;
                    return;
                }
                field8654[field8661++] = class198.field3145;
                return;
            }
            if (arg0 == 3601) {
                int var187 = field8654[--field8661];
                if (class413.field6573 == 2 && var187 < class198.field3145) {
                    field8674[field8663++] = class129.field1846[var187];
                    if (class449.field6963[var187] != null) {
                        field8674[field8663++] = class449.field6963[var187];
                        return;
                    }
                    field8674[field8663++] = "";
                    return;
                }
                field8674[field8663++] = "";
                field8674[field8663++] = "";
                return;
            }
            if (arg0 == 3602) {
                int var188 = field8654[--field8661];
                if (class413.field6573 == 2 && var188 < class198.field3145) {
                    field8654[field8661++] = class129.field1847[var188];
                    return;
                }
                field8654[field8661++] = 0;
                return;
            }
            if (arg0 == 3603) {
                int var189 = field8654[--field8661];
                if (class413.field6573 == 2 && var189 < class198.field3145) {
                    field8654[field8661++] = class142.field2020[var189];
                    return;
                }
                field8654[field8661++] = 0;
                return;
            }
            if (arg0 == 3604) {
                String var190 = field8674[--field8663];
                int var191 = field8654[--field8661];
                class290.method2445(var191, -28854, var190);
                return;
            }
            if (arg0 == 3605) {
                String var192 = field8674[--field8663];
                class186.method1745((byte) -117, var192);
                return;
            }
            if (arg0 == 3606) {
                String var193 = field8674[--field8663];
                class783.method5622(var193, true);
                return;
            }
            if (arg0 == 3607) {
                String var194 = field8674[--field8663];
                class590.method4335(115, var194, false);
                return;
            }
            if (arg0 == 3608) {
                String var195 = field8674[--field8663];
                class721.method5237(var195, 1);
                return;
            }
            if (arg0 == 3609) {
                String var196 = field8674[--field8663];
                if (var196.startsWith(field8680[9]) || var196.startsWith(field8680[13])) {
                    var196 = var196.substring(7);
                }
                field8654[field8661++] = class445.method3480(var196, -56) ? 1 : 0;
                return;
            }
            if (arg0 == 3610) {
                int var197 = field8654[--field8661];
                if (class413.field6573 == 2 && var197 < class198.field3145) {
                    field8674[field8663++] = class184.field2930[var197];
                    return;
                }
                field8674[field8663++] = "";
                return;
            }
            if (arg0 == 3611) {
                if (class133.field1890 != null) {
                    field8674[field8663++] = class376.method3096(-126, class133.field1890);
                    return;
                }
                field8674[field8663++] = "";
                return;
            }
            if (arg0 == 3612) {
                if (class133.field1890 != null) {
                    field8654[field8661++] = class712.field10299;
                    return;
                }
                field8654[field8661++] = 0;
                return;
            }
            if (arg0 == 3613) {
                int var198 = field8654[--field8661];
                if (class133.field1890 != null && var198 < class712.field10299) {
                    field8674[field8663++] = class566.field8232[var198].field6679;
                    return;
                }
                field8674[field8663++] = "";
                return;
            }
            if (arg0 == 3614) {
                int var199 = field8654[--field8661];
                if (class133.field1890 != null && var199 < class712.field10299) {
                    field8654[field8661++] = class566.field8232[var199].field6681;
                    return;
                }
                field8654[field8661++] = 0;
                return;
            }
            if (arg0 == 3615) {
                int var200 = field8654[--field8661];
                if (class133.field1890 != null && var200 < class712.field10299) {
                    field8654[field8661++] = class566.field8232[var200].field6680;
                    return;
                }
                field8654[field8661++] = 0;
                return;
            }
            if (arg0 == 3616) {
                field8654[field8661++] = class348.field5642;
                return;
            }
            if (arg0 == 3617) {
                String var201 = field8674[--field8663];
                class215.method1930(var201, 0);
                return;
            }
            if (arg0 == 3618) {
                field8654[field8661++] = class72.field1017;
                return;
            }
            if (arg0 == 3619) {
                String var202 = field8674[--field8663];
                class751.method5452((byte) 76, var202);
                return;
            }
            if (arg0 == 3620) {
                class654.method4772(-122);
                return;
            }
            if (arg0 == 3621) {
                if (class413.field6573 == 0) {
                    field8654[field8661++] = -1;
                    return;
                }
                field8654[field8661++] = class223.field3504;
                return;
            }
            if (arg0 == 3622) {
                int var203 = field8654[--field8661];
                if (class413.field6573 != 0 && var203 < class223.field3504) {
                    field8674[field8663++] = class140.field1959[var203];
                    if (class794.field11607[var203] != null) {
                        field8674[field8663++] = class794.field11607[var203];
                        return;
                    }
                    field8674[field8663++] = "";
                    return;
                }
                field8674[field8663++] = "";
                field8674[field8663++] = "";
                return;
            }
            if (arg0 == 3623) {
                String var204 = field8674[--field8663];
                if (var204.startsWith(field8680[9]) || var204.startsWith(field8680[13])) {
                    var204 = var204.substring(7);
                }
                field8654[field8661++] = class601.method4405(var204, 0) ? 1 : 0;
                return;
            }
            if (arg0 == 3624) {
                int var205 = field8654[--field8661];
                if (class566.field8232 != null && var205 < class712.field10299 && class566.field8232[var205].field6676.equalsIgnoreCase(class438.field6846.field10821)) {
                    field8654[field8661++] = 1;
                    return;
                }
                field8654[field8661++] = 0;
                return;
            }
            if (arg0 == 3625) {
                if (class434.field6813 != null) {
                    field8674[field8663++] = class434.field6813;
                    return;
                }
                field8674[field8663++] = "";
                return;
            }
            if (arg0 == 3626) {
                int var206 = field8654[--field8661];
                if (class133.field1890 != null && var206 < class712.field10299) {
                    field8674[field8663++] = class566.field8232[var206].field6678;
                    return;
                }
                field8674[field8663++] = "";
                return;
            }
            if (arg0 == 3627) {
                int var207 = field8654[--field8661];
                if (class413.field6573 == 2 && var207 >= 0 && var207 < class198.field3145) {
                    field8654[field8661++] = class409.field6533[var207] ? 1 : 0;
                    return;
                }
                field8654[field8661++] = 0;
                return;
            }
            if (arg0 == 3628) {
                String var208 = field8674[--field8663];
                if (var208.startsWith(field8680[9]) || var208.startsWith(field8680[13])) {
                    var208 = var208.substring(7);
                }
                field8654[field8661++] = class10.method77((byte) 100, var208);
                return;
            }
            if (arg0 == 3629) {
                field8654[field8661++] = class277.field4426;
                return;
            }
            if (arg0 == 3630) {
                String var209 = field8674[--field8663];
                class590.method4335(106, var209, true);
                return;
            }
            if (arg0 == 3631) {
                int var210 = field8654[--field8661];
                field8654[field8661++] = class230.field3573[var210] ? 1 : 0;
                return;
            }
            if (arg0 == 3632) {
                int var211 = field8654[--field8661];
                if (class133.field1890 != null && var211 < class712.field10299) {
                    field8674[field8663++] = class566.field8232[var211].field6676;
                    return;
                }
                field8674[field8663++] = "";
                return;
            }
            if (arg0 == 3633) {
                int var212 = field8654[--field8661];
                if (class413.field6573 != 0 && var212 < class223.field3504) {
                    field8674[field8663++] = class15.field175[var212];
                    return;
                }
                field8674[field8663++] = "";
                return;
            }
        } else if (arg0 < 3800) {
            if (arg0 == 3700) {
                if (class570.field8258 != null) {
                    field8654[field8661++] = 1;
                    field8656 = class570.field8258;
                    return;
                }
                field8654[field8661++] = 0;
                return;
            }
            if (arg0 == 3701) {
                if (class318.field5184 != null) {
                    field8654[field8661++] = 1;
                    field8656 = class318.field5184;
                    return;
                }
                field8654[field8661++] = 0;
                return;
            }
            if (arg0 == 3702) {
                field8674[field8663++] = field8656.field561;
                return;
            }
            if (arg0 == 3703) {
                field8654[field8661++] = field8656.field541 ? 1 : 0;
                return;
            }
            if (arg0 == 3704) {
                field8654[field8661++] = field8656.field533;
                return;
            }
            if (arg0 == 3705) {
                field8654[field8661++] = field8656.field543;
                return;
            }
            if (arg0 == 3706) {
                field8654[field8661++] = field8656.field555;
                return;
            }
            if (arg0 == 3707) {
                field8654[field8661++] = field8656.field570;
                return;
            }
            if (arg0 == 3709) {
                field8654[field8661++] = field8656.field531;
                return;
            }
            if (arg0 == 3710) {
                int var213 = field8654[--field8661];
                field8674[field8663++] = field8656.field537[var213];
                return;
            }
            if (arg0 == 3711) {
                int var214 = field8654[--field8661];
                field8654[field8661++] = field8656.field525[var214];
                return;
            }
            if (arg0 == 3712) {
                field8654[field8661++] = field8656.field547;
                return;
            }
            if (arg0 == 3713) {
                int var215 = field8654[--field8661];
                field8674[field8663++] = field8656.field569[var215];
                return;
            }
            if (arg0 == 3714) {
                field8661 -= 3;
                int var216 = field8654[field8661];
                int var217 = field8654[field8661 + 1];
                int var218 = field8654[field8661 + 2];
                field8654[field8661++] = field8656.method474(112, var217, var218, var216);
                return;
            }
            if (arg0 == 3715) {
                field8654[field8661++] = field8656.field532;
                return;
            }
            if (arg0 == 3716) {
                field8654[field8661++] = field8656.field527;
                return;
            }
            if (arg0 == 3717) {
                field8654[field8661++] = field8656.method479(field8674[--field8663], -36);
                return;
            }
            if (arg0 == 3718) {
                field8654[field8661 - 1] = field8656.method484(0)[field8654[field8661 - 1]];
                return;
            }
            if (arg0 == 3719) {
                class290.method2442(field8654[--field8661], -1912079896);
                return;
            }
            if (arg0 == 3750) {
                if (class201.field3181 != null) {
                    field8654[field8661++] = 1;
                    field8652 = class201.field3181;
                    return;
                }
                field8654[field8661++] = 0;
                return;
            }
            if (arg0 == 3751) {
                if (class239.field3682 != null) {
                    field8654[field8661++] = 1;
                    field8652 = class239.field3682;
                    return;
                }
                field8654[field8661++] = 0;
                return;
            }
            if (arg0 == 3752) {
                field8674[field8663++] = field8652.field5379;
                return;
            }
            if (arg0 == 3753) {
                field8654[field8661++] = field8652.field5380;
                return;
            }
            if (arg0 == 3754) {
                field8654[field8661++] = field8652.field5390;
                return;
            }
            if (arg0 == 3755) {
                field8654[field8661++] = field8652.field5381;
                return;
            }
            if (arg0 == 3756) {
                int var219 = field8654[--field8661];
                field8674[field8663++] = field8652.field5376[var219].field6783;
                return;
            }
            if (arg0 == 3757) {
                int var220 = field8654[--field8661];
                field8654[field8661++] = field8652.field5376[var220].field6785;
                return;
            }
            if (arg0 == 3758) {
                int var221 = field8654[--field8661];
                field8654[field8661++] = field8652.field5376[var221].field6784;
                return;
            }
            if (arg0 == 3759) {
                int var222 = field8654[--field8661];
                class691.method5025(3, field8652 == class239.field3682, var222);
                return;
            }
            if (arg0 == 3760) {
                field8654[field8661++] = field8652.method2789((byte) -72, field8674[--field8663]);
                return;
            }
            if (arg0 == 3761) {
                field8654[field8661 - 1] = field8652.method2790(0)[field8654[field8661 - 1]];
                return;
            }
            if (arg0 == 3790) {
                field8654[field8661++] = class99.field1456 == null ? 0 : 1;
                return;
            }
        } else if (arg0 < 4000) {
            if (arg0 == 3903) {
                int var223 = field8654[--field8661];
                field8654[field8661++] = class689.field9943[var223].method2373(0);
                return;
            }
            if (arg0 == 3904) {
                int var224 = field8654[--field8661];
                field8654[field8661++] = class689.field9943[var224].field4431;
                return;
            }
            if (arg0 == 3905) {
                int var225 = field8654[--field8661];
                field8654[field8661++] = class689.field9943[var225].field4427;
                return;
            }
            if (arg0 == 3906) {
                int var226 = field8654[--field8661];
                field8654[field8661++] = class689.field9943[var226].field4434;
                return;
            }
            if (arg0 == 3907) {
                int var227 = field8654[--field8661];
                field8654[field8661++] = class689.field9943[var227].field4424;
                return;
            }
            if (arg0 == 3908) {
                int var228 = field8654[--field8661];
                field8654[field8661++] = class689.field9943[var228].field4435;
                return;
            }
            if (arg0 == 3910) {
                int var229 = field8654[--field8661];
                int var230 = class689.field9943[var229].method2372(7);
                field8654[field8661++] = var230 == 0 ? 1 : 0;
                return;
            }
            if (arg0 == 3911) {
                int var231 = field8654[--field8661];
                int var232 = class689.field9943[var231].method2372(7);
                field8654[field8661++] = var232 == 2 ? 1 : 0;
                return;
            }
            if (arg0 == 3912) {
                int var233 = field8654[--field8661];
                int var234 = class689.field9943[var233].method2372(7);
                field8654[field8661++] = var234 == 5 ? 1 : 0;
                return;
            }
            if (arg0 == 3913) {
                int var235 = field8654[--field8661];
                int var236 = class689.field9943[var235].method2372(7);
                field8654[field8661++] = var236 == 1 ? 1 : 0;
                return;
            }
        } else if (arg0 < 4100) {
            if (arg0 == 4000) {
                field8661 -= 2;
                int var237 = field8654[field8661];
                int var238 = field8654[field8661 + 1];
                field8654[field8661++] = var237 + var238;
                return;
            }
            if (arg0 == 4001) {
                field8661 -= 2;
                int var239 = field8654[field8661];
                int var240 = field8654[field8661 + 1];
                field8654[field8661++] = var239 - var240;
                return;
            }
            if (arg0 == 4002) {
                field8661 -= 2;
                int var241 = field8654[field8661];
                int var242 = field8654[field8661 + 1];
                field8654[field8661++] = var241 * var242;
                return;
            }
            if (arg0 == 4003) {
                field8661 -= 2;
                int var243 = field8654[field8661];
                int var244 = field8654[field8661 + 1];
                field8654[field8661++] = var243 / var244;
                return;
            }
            if (arg0 == 4004) {
                int var245 = field8654[--field8661];
                field8654[field8661++] = (int) (Math.random() * (double) var245);
                return;
            }
            if (arg0 == 4005) {
                int var246 = field8654[--field8661];
                field8654[field8661++] = (int) (Math.random() * (double) (var246 + 1));
                return;
            }
            if (arg0 == 4006) {
                field8661 -= 5;
                int var247 = field8654[field8661];
                int var248 = field8654[field8661 + 1];
                int var249 = field8654[field8661 + 2];
                int var250 = field8654[field8661 + 3];
                int var251 = field8654[field8661 + 4];
                field8654[field8661++] = (var248 - var247) * (var251 - var249) / (var250 - var249) + var247;
                return;
            }
            if (arg0 == 4007) {
                field8661 -= 2;
                long var252 = (long) field8654[field8661];
                long var254 = (long) field8654[field8661 + 1];
                field8654[field8661++] = (int) (var252 * var254 / 100L + var252);
                return;
            }
            if (arg0 == 4008) {
                field8661 -= 2;
                int var256 = field8654[field8661];
                int var257 = field8654[field8661 + 1];
                field8654[field8661++] = var256 | 0x1 << var257;
                return;
            }
            if (arg0 == 4009) {
                field8661 -= 2;
                int var258 = field8654[field8661];
                int var259 = field8654[field8661 + 1];
                field8654[field8661++] = var258 & -(0x1 << var259) - 1;
                return;
            }
            if (arg0 == 4010) {
                field8661 -= 2;
                int var260 = field8654[field8661];
                int var261 = field8654[field8661 + 1];
                field8654[field8661++] = (var260 & 0x1 << var261) == 0 ? 0 : 1;
                return;
            }
            if (arg0 == 4011) {
                field8661 -= 2;
                int var262 = field8654[field8661];
                int var263 = field8654[field8661 + 1];
                field8654[field8661++] = var262 % var263;
                return;
            }
            if (arg0 == 4012) {
                field8661 -= 2;
                int var264 = field8654[field8661];
                int var265 = field8654[field8661 + 1];
                if (var264 == 0) {
                    field8654[field8661++] = 0;
                    return;
                }
                field8654[field8661++] = (int) Math.pow((double) var264, (double) var265);
                return;
            }
            if (arg0 == 4013) {
                field8661 -= 2;
                int var266 = field8654[field8661];
                int var267 = field8654[field8661 + 1];
                if (var266 == 0) {
                    field8654[field8661++] = 0;
                    return;
                }
                if (var267 == 0) {
                    field8654[field8661++] = Integer.MAX_VALUE;
                    return;
                }
                field8654[field8661++] = (int) Math.pow((double) var266, 1.0D / (double) var267);
                return;
            }
            if (arg0 == 4014) {
                field8661 -= 2;
                int var268 = field8654[field8661];
                int var269 = field8654[field8661 + 1];
                field8654[field8661++] = var268 & var269;
                return;
            }
            if (arg0 == 4015) {
                field8661 -= 2;
                int var270 = field8654[field8661];
                int var271 = field8654[field8661 + 1];
                field8654[field8661++] = var270 | var271;
                return;
            }
            if (arg0 == 4016) {
                field8661 -= 2;
                int var272 = field8654[field8661];
                int var273 = field8654[field8661 + 1];
                field8654[field8661++] = var272 < var273 ? var272 : var273;
                return;
            }
            if (arg0 == 4017) {
                field8661 -= 2;
                int var274 = field8654[field8661];
                int var275 = field8654[field8661 + 1];
                field8654[field8661++] = var274 > var275 ? var274 : var275;
                return;
            }
            if (arg0 == 4018) {
                field8661 -= 3;
                long var276 = (long) field8654[field8661];
                long var278 = (long) field8654[field8661 + 1];
                long var280 = (long) field8654[field8661 + 2];
                field8654[field8661++] = (int) (var276 * var280 / var278);
                return;
            }
            if (arg0 == 4019) {
                field8661 -= 2;
                int var282 = field8654[field8661];
                int var283 = field8654[field8661 + 1];
                if (var282 > 700 || var283 > 700) {
                    field8654[field8661++] = 256;
                }
                double var284 = (Math.random() * (double) (var282 + var283) + 800.0D - (double) var282) / 100.0D;
                field8654[field8661++] = (int) (Math.pow(2.0D, var284) + 0.5D);
                return;
            }
            if (arg0 == 4020) {
                int var286 = field8654[--field8661];
                field8654[field8661++] = class200.field3161[class545.method4049(var286, 59) & 0xFFFF];
                return;
            }
        } else if (arg0 < 4200) {
            if (arg0 == 4100) {
                String var287 = field8674[--field8663];
                int var288 = field8654[--field8661];
                field8674[field8663++] = var287 + var288;
                return;
            }
            if (arg0 == 4101) {
                field8663 -= 2;
                String var289 = field8674[field8663];
                String var290 = field8674[field8663 + 1];
                field8674[field8663++] = var289 + var290;
                return;
            }
            if (arg0 == 4102) {
                String var291 = field8674[--field8663];
                int var292 = field8654[--field8661];
                field8674[field8663++] = var291 + class99.method943(true, var292, (byte) 80);
                return;
            }
            if (arg0 == 4103) {
                String var293 = field8674[--field8663];
                field8674[field8663++] = var293.toLowerCase();
                return;
            }
            if (arg0 == 4104) {
                field8674[field8663++] = class731.method5301(class795.field11624, -115, class240.method2066(-1, field8654[--field8661]));
                return;
            }
            if (arg0 == 4105) {
                field8663 -= 2;
                String var294 = field8674[field8663];
                String var295 = field8674[field8663 + 1];
                if (class438.field6846.field10798 != null && class438.field6846.field10798.field1813) {
                    field8674[field8663++] = var295;
                    return;
                }
                field8674[field8663++] = var294;
                return;
            }
            if (arg0 == 4106) {
                int var296 = field8654[--field8661];
                field8674[field8663++] = Integer.toString(var296);
                return;
            }
            if (arg0 == 4107) {
                field8663 -= 2;
                field8654[field8661++] = class620.method4530(0, class795.field11624, field8674[field8663 + 1], field8674[field8663]);
                return;
            }
            if (arg0 == 4108) {
                String var297 = field8674[--field8663];
                field8661 -= 2;
                int var298 = field8654[field8661];
                int var299 = field8654[field8661 + 1];
                class49 var300 = class588.method4319(0, class242.field3745, 0, var299);
                field8654[field8661++] = var300.method508(var298, class513.field7596, -6901, var297);
                return;
            }
            if (arg0 == 4109) {
                String var301 = field8674[--field8663];
                field8661 -= 2;
                int var302 = field8654[field8661];
                int var303 = field8654[field8661 + 1];
                class49 var304 = class588.method4319(0, class242.field3745, 0, var303);
                field8654[field8661++] = var304.method504(var301, var302, -8055, class513.field7596);
                return;
            }
            if (arg0 == 4110) {
                field8663 -= 2;
                String var305 = field8674[field8663];
                String var306 = field8674[field8663 + 1];
                if (field8654[--field8661] == 1) {
                    field8674[field8663++] = var305;
                    return;
                }
                field8674[field8663++] = var306;
                return;
            }
            if (arg0 == 4111) {
                String var307 = field8674[--field8663];
                field8674[field8663++] = class689.method5016(-61, var307);
                return;
            }
            if (arg0 == 4112) {
                String var308 = field8674[--field8663];
                int var309 = field8654[--field8661];
                if (var309 == -1) {
                    throw new RuntimeException(field8680[1]);
                }
                field8674[field8663++] = var308 + (char) var309;
                return;
            }
            if (arg0 == 4113) {
                int var310 = field8654[--field8661];
                field8654[field8661++] = method4385((char) var310);
                return;
            }
            if (arg0 == 4114) {
                int var311 = field8654[--field8661];
                field8654[field8661++] = class789.method5668((byte) 126, (char) var311) ? 1 : 0;
                return;
            }
            if (arg0 == 4115) {
                int var312 = field8654[--field8661];
                field8654[field8661++] = class471.method3623(121, (char) var312) ? 1 : 0;
                return;
            }
            if (arg0 == 4116) {
                int var313 = field8654[--field8661];
                field8654[field8661++] = class185.method1736((byte) -50, (char) var313) ? 1 : 0;
                return;
            }
            if (arg0 == 4117) {
                String var314 = field8674[--field8663];
                if (var314 != null) {
                    field8654[field8661++] = var314.length();
                    return;
                }
                field8654[field8661++] = 0;
                return;
            }
            if (arg0 == 4118) {
                String var315 = field8674[--field8663];
                field8661 -= 2;
                int var316 = field8654[field8661];
                int var317 = field8654[field8661 + 1];
                field8674[field8663++] = var315.substring(var316, var317);
                return;
            }
            if (arg0 == 4119) {
                String var318 = field8674[--field8663];
                StringBuffer var319 = new StringBuffer(var318.length());
                boolean var320 = false;
                for (int var321 = 0; var321 < var318.length(); var321++) {
                    char var322 = var318.charAt(var321);
                    if (var322 == '<') {
                        var320 = true;
                    } else if (var322 == '>') {
                        var320 = false;
                    } else if (!var320) {
                        var319.append(var322);
                    }
                }
                field8674[field8663++] = var319.toString();
                return;
            }
            if (arg0 == 4120) {
                String var323 = field8674[--field8663];
                field8661 -= 2;
                int var324 = field8654[field8661];
                int var325 = field8654[field8661 + 1];
                field8654[field8661++] = var323.indexOf(var324, var325);
                return;
            }
            if (arg0 == 4121) {
                field8663 -= 2;
                String var326 = field8674[field8663];
                String var327 = field8674[field8663 + 1];
                int var328 = field8654[--field8661];
                field8654[field8661++] = var326.indexOf(var327, var328);
                return;
            }
            if (arg0 == 4122) {
                int var329 = field8654[--field8661];
                field8654[field8661++] = Character.toLowerCase((char) var329);
                return;
            }
            if (arg0 == 4123) {
                int var330 = field8654[--field8661];
                field8654[field8661++] = Character.toUpperCase((char) var330);
                return;
            }
            if (arg0 == 4124) {
                boolean var331 = field8654[--field8661] != 0;
                int var332 = field8654[--field8661];
                field8674[field8663++] = class759.method5485((long) var332, 0, var331, class795.field11624, (byte) -12);
                return;
            }
            if (arg0 == 4125) {
                String var333 = field8674[--field8663];
                int var334 = field8654[--field8661];
                class49 var335 = class588.method4319(0, class242.field3745, 0, var334);
                field8654[field8661++] = var335.method500(0, class513.field7596, var333);
                return;
            }
            if (arg0 == 4126) {
                field8674[field8663++] = class8.method65(true, class795.field11624, (long) field8654[--field8661] * 60000L, 10) + field8680[10];
                return;
            }
            if (arg0 == 4127) {
                long var336 = field8665[--field8659];
                field8674[field8663++] = var336 == -1L ? "" : Long.toString(var336, 36).toUpperCase();
                return;
            }
        } else if (arg0 < 4300) {
            if (arg0 == 4200) {
                int var338 = field8654[--field8661];
                field8674[field8663++] = class229.field3563.method531(var338, (byte) 112).field8423;
                return;
            }
            if (arg0 == 4201) {
                field8661 -= 2;
                int var339 = field8654[field8661];
                int var340 = field8654[field8661 + 1];
                class584 var341 = class229.field3563.method531(var339, (byte) 115);
                if (var340 >= 1 && var340 <= 5 && var341.field8424[var340 - 1] != null) {
                    field8674[field8663++] = var341.field8424[var340 - 1];
                    return;
                }
                field8674[field8663++] = "";
                return;
            }
            if (arg0 == 4202) {
                field8661 -= 2;
                int var342 = field8654[field8661];
                int var343 = field8654[field8661 + 1];
                class584 var344 = class229.field3563.method531(var342, (byte) 99);
                if (var343 >= 1 && var343 <= 5 && var344.field8396[var343 - 1] != null) {
                    field8674[field8663++] = var344.field8396[var343 - 1];
                    return;
                }
                field8674[field8663++] = "";
                return;
            }
            if (arg0 == 4203) {
                int var345 = field8654[--field8661];
                field8654[field8661++] = class229.field3563.method531(var345, (byte) 66).field8436;
                return;
            }
            if (arg0 == 4204) {
                int var346 = field8654[--field8661];
                field8654[field8661++] = class229.field3563.method531(var346, (byte) 37).field8421 == 1 ? 1 : 0;
                return;
            }
            if (arg0 == 4205) {
                int var347 = field8654[--field8661];
                class584 var348 = class229.field3563.method531(var347, (byte) 111);
                if (var348.field8442 == -1 && var348.field8464 >= 0) {
                    field8654[field8661++] = var348.field8464;
                    return;
                }
                field8654[field8661++] = var347;
                return;
            }
            if (arg0 == 4206) {
                int var349 = field8654[--field8661];
                class584 var350 = class229.field3563.method531(var349, (byte) 48);
                if (var350.field8442 >= 0 && var350.field8464 >= 0) {
                    field8654[field8661++] = var350.field8464;
                    return;
                }
                field8654[field8661++] = var349;
                return;
            }
            if (arg0 == 4207) {
                int var351 = field8654[--field8661];
                field8654[field8661++] = class229.field3563.method531(var351, (byte) 123).field8409 ? 1 : 0;
                return;
            }
            if (arg0 == 4208) {
                field8661 -= 2;
                int var352 = field8654[field8661];
                int var353 = field8654[field8661 + 1];
                class668 var354 = class289.field4655.method97(var353, (byte) 38);
                if (var354.method4844(1)) {
                    field8674[field8663++] = class229.field3563.method531(var352, (byte) 91).method4290(var354.field9494, var353, true);
                    return;
                }
                field8654[field8661++] = class229.field3563.method531(var352, (byte) 67).method4287(0, var354.field9501, var353);
                return;
            }
            if (arg0 == 4209) {
                field8661 -= 2;
                int var355 = field8654[field8661];
                int var356 = field8654[field8661 + 1] - 1;
                class584 var357 = class229.field3563.method531(var355, (byte) 95);
                if (var357.field8433 == var356) {
                    field8654[field8661++] = var357.field8463;
                    return;
                }
                if (var357.field8402 == var356) {
                    field8654[field8661++] = var357.field8456;
                    return;
                }
                field8654[field8661++] = -1;
                return;
            }
            if (arg0 == 4210) {
                String var358 = field8674[--field8663];
                int var359 = field8654[--field8661];
                class686.method4996(-86, var358, var359 == 1);
                field8654[field8661++] = class76.field1103;
                return;
            }
            if (arg0 == 4211) {
                if (class711.field10289 != null && class590.field8552 < class76.field1103) {
                    field8654[field8661++] = class711.field10289[class590.field8552++] & 0xFFFF;
                    return;
                }
                field8654[field8661++] = -1;
                return;
            }
            if (arg0 == 4212) {
                class590.field8552 = 0;
                return;
            }
            if (arg0 == 4213) {
                int var360 = field8654[--field8661];
                field8654[field8661++] = class229.field3563.method531(var360, (byte) 109).field8449;
                return;
            }
            if (arg0 == 4214) {
                String var361 = field8674[--field8663];
                field8661 -= 3;
                int var362 = field8654[field8661];
                int var363 = field8654[field8661 + 1];
                int var364 = field8654[field8661 + 2];
                class649.method4735(var363, var362 == 1, var364, var361, 5121);
                field8654[field8661++] = class76.field1103;
                return;
            }
            if (arg0 == 4215) {
                field8663 -= 2;
                field8661 -= 2;
                String var365 = field8674[field8663];
                int var366 = field8654[field8661];
                int var367 = field8654[field8661 + 1];
                String var368 = field8674[field8663 + 1];
                class200.method1827(var366 == 1, 112, var368, var365, var367);
                field8654[field8661++] = class76.field1103;
                return;
            }
        } else if (arg0 < 4400) {
            if (arg0 == 4300) {
                field8661 -= 2;
                int var369 = field8654[field8661];
                int var370 = field8654[field8661 + 1];
                class668 var371 = class289.field4655.method97(var370, (byte) 38);
                if (var371.method4844(1)) {
                    field8674[field8663++] = class395.field6267.method3142(var369, (byte) 80).method1522(0, var370, var371.field9494);
                    return;
                }
                field8654[field8661++] = class395.field6267.method3142(var369, (byte) 80).method1526(var371.field9501, var370, 78);
                return;
            }
        } else if (arg0 < 4500) {
            if (arg0 == 4400) {
                field8661 -= 2;
                int var372 = field8654[field8661];
                int var373 = field8654[field8661 + 1];
                class668 var374 = class289.field4655.method97(var373, (byte) 38);
                if (var374.method4844(1)) {
                    field8674[field8663++] = class370.field5999.method4002(-77, var372).method2993((byte) 66, var373, var374.field9494);
                    return;
                }
                field8654[field8661++] = class370.field5999.method4002(-110, var372).method3002(3842, var373, var374.field9501);
                return;
            }
        } else if (arg0 < 4600) {
            if (arg0 == 4500) {
                field8661 -= 2;
                int var375 = field8654[field8661];
                int var376 = field8654[field8661 + 1];
                class668 var377 = class289.field4655.method97(var376, (byte) 38);
                if (var377.method4844(1)) {
                    field8674[field8663++] = class539.field7911.method1361(var375, (byte) -23).method3538(var377.field9494, 14, var376);
                    return;
                }
                field8654[field8661++] = class539.field7911.method1361(var375, (byte) 21).method3541(var377.field9501, (byte) 12, var376);
                return;
            }
        } else if (arg0 < 4700) {
            if (arg0 == 4600) {
                int var378 = field8654[--field8661];
                class707 var379 = class78.field1216.method3182(var378, -94);
                if (var379.field10171 != null && var379.field10171.length > 0) {
                    int var380 = 0;
                    int var381 = var379.field10157[0];
                    for (int var382 = 1; var382 < var379.field10171.length; var382++) {
                        if (var379.field10157[var382] > var381) {
                            var380 = var382;
                            var381 = var379.field10157[var382];
                        }
                    }
                    field8654[field8661++] = var379.field10171[var380];
                    return;
                }
                field8654[field8661++] = var379.field10160;
                return;
            }
        } else if (arg0 < 4800) {
            if (arg0 == 4700) {
                field8654[field8661++] = class647.field9284 ? 1 : 0;
                return;
            }
            if (arg0 == 4701) {
                String var383 = field8674[--field8663];
                if (class315.field5127 == 7 && !class73.method764((byte) -15)) {
                    if (var383.length() > 20) {
                        class246.field3803 = -4;
                        return;
                    }
                    class246.field3803 = -1;
                    class487 var384 = class618.method4519(96, class87.field1303, class185.field2943.field2659);
                    var384.field7362.method1678(0, 65280);
                    int var385 = var384.field7362.field2799;
                    var384.field7362.method1681(var383, 23137);
                    var384.field7362.method1668(-17010, var384.field7362.field2799 - var385);
                    class185.field2943.method1546(var384, 1);
                    return;
                }
                class246.field3803 = -5;
                return;
            }
            if (arg0 == 4702) {
                field8654[field8661++] = class246.field3803;
                if (class246.field3803 != -1) {
                    class246.field3803 = -6;
                }
                return;
            }
        }
        throw new IllegalStateException(String.valueOf(arg0));
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "()V")
    public static final void method4376() {
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(Ljava/lang/String;I)V")
    private static final void method4377(String arg0, int arg1) {
        if (class264.field4283 == 0 && !(!class211.field3348 || class16.field181) || class127.field1836) {
            return;
        }
        String var2 = arg0.toLowerCase();
        byte var3 = 0;
        if (var2.startsWith(class709.field10249.method5154(0, (byte) 65))) {
            var3 = 0;
            arg0 = arg0.substring(class709.field10249.method5154(0, (byte) 65).length());
        } else if (var2.startsWith(class709.field10250.method5154(0, (byte) 65))) {
            var3 = 1;
            arg0 = arg0.substring(class709.field10250.method5154(0, (byte) 65).length());
        } else if (var2.startsWith(class709.field10251.method5154(0, (byte) 65))) {
            var3 = 2;
            arg0 = arg0.substring(class709.field10251.method5154(0, (byte) 65).length());
        } else if (var2.startsWith(class709.field10252.method5154(0, (byte) 65))) {
            var3 = 3;
            arg0 = arg0.substring(class709.field10252.method5154(0, (byte) 65).length());
        } else if (var2.startsWith(class709.field10253.method5154(0, (byte) 65))) {
            var3 = 4;
            arg0 = arg0.substring(class709.field10253.method5154(0, (byte) 65).length());
        } else if (var2.startsWith(class709.field10254.method5154(0, (byte) 65))) {
            var3 = 5;
            arg0 = arg0.substring(class709.field10254.method5154(0, (byte) 65).length());
        } else if (var2.startsWith(class709.field10255.method5154(0, (byte) 65))) {
            var3 = 6;
            arg0 = arg0.substring(class709.field10255.method5154(0, (byte) 65).length());
        } else if (var2.startsWith(class709.field10256.method5154(0, (byte) 65))) {
            var3 = 7;
            arg0 = arg0.substring(class709.field10256.method5154(0, (byte) 65).length());
        } else if (var2.startsWith(class709.field10257.method5154(0, (byte) 65))) {
            var3 = 8;
            arg0 = arg0.substring(class709.field10257.method5154(0, (byte) 65).length());
        } else if (var2.startsWith(class709.field10258.method5154(0, (byte) 65))) {
            var3 = 9;
            arg0 = arg0.substring(class709.field10258.method5154(0, (byte) 65).length());
        } else if (var2.startsWith(class709.field10259.method5154(0, (byte) 65))) {
            var3 = 10;
            arg0 = arg0.substring(class709.field10259.method5154(0, (byte) 65).length());
        } else if (var2.startsWith(class709.field10260.method5154(0, (byte) 65))) {
            var3 = 11;
            arg0 = arg0.substring(class709.field10260.method5154(0, (byte) 65).length());
        } else if (class795.field11624 != 0) {
            if (var2.startsWith(class709.field10249.method5154(class795.field11624, (byte) 65))) {
                var3 = 0;
                arg0 = arg0.substring(class709.field10249.method5154(class795.field11624, (byte) 65).length());
            } else if (var2.startsWith(class709.field10250.method5154(class795.field11624, (byte) 65))) {
                var3 = 1;
                arg0 = arg0.substring(class709.field10250.method5154(class795.field11624, (byte) 65).length());
            } else if (var2.startsWith(class709.field10251.method5154(class795.field11624, (byte) 65))) {
                var3 = 2;
                arg0 = arg0.substring(class709.field10251.method5154(class795.field11624, (byte) 65).length());
            } else if (var2.startsWith(class709.field10252.method5154(class795.field11624, (byte) 65))) {
                var3 = 3;
                arg0 = arg0.substring(class709.field10252.method5154(class795.field11624, (byte) 65).length());
            } else if (var2.startsWith(class709.field10253.method5154(class795.field11624, (byte) 65))) {
                var3 = 4;
                arg0 = arg0.substring(class709.field10253.method5154(class795.field11624, (byte) 65).length());
            } else if (var2.startsWith(class709.field10254.method5154(class795.field11624, (byte) 65))) {
                var3 = 5;
                arg0 = arg0.substring(class709.field10254.method5154(class795.field11624, (byte) 65).length());
            } else if (var2.startsWith(class709.field10255.method5154(class795.field11624, (byte) 65))) {
                var3 = 6;
                arg0 = arg0.substring(class709.field10255.method5154(class795.field11624, (byte) 65).length());
            } else if (var2.startsWith(class709.field10256.method5154(class795.field11624, (byte) 65))) {
                var3 = 7;
                arg0 = arg0.substring(class709.field10256.method5154(class795.field11624, (byte) 65).length());
            } else if (var2.startsWith(class709.field10257.method5154(class795.field11624, (byte) 65))) {
                var3 = 8;
                arg0 = arg0.substring(class709.field10257.method5154(class795.field11624, (byte) 65).length());
            } else if (var2.startsWith(class709.field10258.method5154(class795.field11624, (byte) 65))) {
                var3 = 9;
                arg0 = arg0.substring(class709.field10258.method5154(class795.field11624, (byte) 65).length());
            } else if (var2.startsWith(class709.field10259.method5154(class795.field11624, (byte) 65))) {
                var3 = 10;
                arg0 = arg0.substring(class709.field10259.method5154(class795.field11624, (byte) 65).length());
            } else if (var2.startsWith(class709.field10260.method5154(class795.field11624, (byte) 65))) {
                var3 = 11;
                arg0 = arg0.substring(class709.field10260.method5154(class795.field11624, (byte) 65).length());
            }
        }
        String var4 = arg0.toLowerCase();
        byte var5 = 0;
        if (var4.startsWith(class709.field10261.method5154(0, (byte) 65))) {
            var5 = 1;
            arg0 = arg0.substring(class709.field10261.method5154(0, (byte) 65).length());
        } else if (var4.startsWith(class709.field10262.method5154(0, (byte) 65))) {
            var5 = 2;
            arg0 = arg0.substring(class709.field10262.method5154(0, (byte) 65).length());
        } else if (var4.startsWith(class709.field10263.method5154(0, (byte) 65))) {
            var5 = 3;
            arg0 = arg0.substring(class709.field10263.method5154(0, (byte) 65).length());
        } else if (var4.startsWith(class709.field10264.method5154(0, (byte) 65))) {
            var5 = 4;
            arg0 = arg0.substring(class709.field10264.method5154(0, (byte) 65).length());
        } else if (var4.startsWith(class709.field10265.method5154(0, (byte) 65))) {
            var5 = 5;
            arg0 = arg0.substring(class709.field10265.method5154(0, (byte) 65).length());
        } else if (class795.field11624 != 0) {
            if (var4.startsWith(class709.field10261.method5154(class795.field11624, (byte) 65))) {
                var5 = 1;
                arg0 = arg0.substring(class709.field10261.method5154(class795.field11624, (byte) 65).length());
            } else if (var4.startsWith(class709.field10262.method5154(class795.field11624, (byte) 65))) {
                var5 = 2;
                arg0 = arg0.substring(class709.field10262.method5154(class795.field11624, (byte) 65).length());
            } else if (var4.startsWith(class709.field10263.method5154(class795.field11624, (byte) 65))) {
                var5 = 3;
                arg0 = arg0.substring(class709.field10263.method5154(class795.field11624, (byte) 65).length());
            } else if (var4.startsWith(class709.field10264.method5154(class795.field11624, (byte) 65))) {
                var5 = 4;
                arg0 = arg0.substring(class709.field10264.method5154(class795.field11624, (byte) 65).length());
            } else if (var4.startsWith(class709.field10265.method5154(class795.field11624, (byte) 65))) {
                var5 = 5;
                arg0 = arg0.substring(class709.field10265.method5154(class795.field11624, (byte) 65).length());
            }
        }
        field8651++;
        class164 var6 = class193.method1785(false);
        class487 var7 = class618.method4519(31, class456.field7045, var6.field2659);
        var7.field7362.method1678(0, 65280);
        int var8 = var7.field7362.field2799;
        var7.field7362.method1678(var3, 65280);
        var7.field7362.method1678(var5, 65280);
        class530.method3962((byte) 120, arg0, var7.field7362);
        var7.field7362.method1668(-17010, var7.field7362.field2799 - var8);
        var6.method1546(var7, 1);
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(Lic;)V")
    public static final void method4378(class730 arg0) {
        method4390(arg0, 200000);
    }

    @OriginalMember(owner = "client!im", name = "b", descriptor = "(I)I")
    private static final int method4379(int arg0) {
        class723 var1 = class46.field518.method3006(arg0, true);
        if (var1 == null) {
            throw new RuntimeException(field8680[0]);
        }
        Integer var2 = field8656.method493(var1.field10616, -28263, class305.field4924.field8482 << 16 | var1.field10620, var1.field10612);
        return var2 == null ? 0 : var2;
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(IZ)V")
    public static final void method4380(int arg0, boolean arg1) {
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(Lkca;I)V")
    private static final void method4381(class88 arg0, int arg1) {
        field8661 = 0;
        field8663 = 0;
        int var2 = -1;
        int[] var3 = arg0.field1308;
        int[] var4 = arg0.field1312;
        byte var5 = -1;
        field8647 = 0;
        try {
            int var6 = 0;
            label429: while (true) {
                var6++;
                if (var6 > arg1) {
                    throw new RuntimeException(field8680[29]);
                }
                var2++;
                int var56 = var3[var2];
                if (field8679 && (field8678 == null || arg0.field1317 != null && arg0.field1317.indexOf(field8678) != -1)) {
                    System.out.println(arg0.field1317 + field8680[24] + var56);
                }
                if (var56 >= 150) {
                    boolean var48;
                    if (var4[var2] == 1) {
                        var48 = true;
                    } else {
                        var48 = false;
                    }
                    if (var56 >= 150 && var56 < 5000) {
                        method4375(var56, var48);
                    } else if (var56 >= 5000 && var56 < 10000) {
                        method4389(var56, var48);
                    } else {
                        throw new IllegalStateException(field8680[20] + var56);
                    }
                } else if (var56 == 0) {
                    field8654[field8661++] = var4[var2];
                } else if (var56 == 1) {
                    int var7 = var4[var2];
                    field8654[field8661++] = class398.field6315.field5478[var7];
                } else if (var56 == 2) {
                    int var8 = var4[var2];
                    class398.field6315.method2831(var8, field8654[--field8661], (byte) 113);
                } else if (var56 == 3) {
                    field8674[field8663++] = arg0.field1307[var2];
                } else if (var56 == 6) {
                    var2 += var4[var2];
                } else if (var56 == 7) {
                    field8661 -= 2;
                    if (field8654[field8661 + 1] != field8654[field8661]) {
                        var2 += var4[var2];
                    }
                } else if (var56 == 8) {
                    field8661 -= 2;
                    if (field8654[field8661 + 1] == field8654[field8661]) {
                        var2 += var4[var2];
                    }
                } else if (var56 == 9) {
                    field8661 -= 2;
                    if (field8654[field8661] < field8654[field8661 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var56 == 10) {
                    field8661 -= 2;
                    if (field8654[field8661] > field8654[field8661 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var56 == 21) {
                    if (field8647 == 0) {
                        return;
                    }
                    class567 var9 = field8670[--field8647];
                    arg0 = var9.field8242;
                    var3 = arg0.field1308;
                    var4 = arg0.field1312;
                    var2 = var9.field8244;
                    field8669 = var9.field8243;
                    field8675 = var9.field8238;
                    field8650 = var9.field8237;
                } else if (var56 == 25) {
                    int var10 = var4[var2];
                    field8654[field8661++] = class398.field6315.method1583(var10, (byte) -51);
                } else if (var56 == 27) {
                    int var11 = var4[var2];
                    class398.field6315.method2828(field8654[--field8661], var11, (byte) -113);
                } else if (var56 == 31) {
                    field8661 -= 2;
                    if (field8654[field8661] <= field8654[field8661 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var56 == 32) {
                    field8661 -= 2;
                    if (field8654[field8661] >= field8654[field8661 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var56 == 33) {
                    field8654[field8661++] = field8669[var4[var2]];
                } else if (var56 == 34) {
                    field8669[var4[var2]] = field8654[--field8661];
                } else if (var56 == 35) {
                    field8674[field8663++] = field8675[var4[var2]];
                } else if (var56 == 36) {
                    field8675[var4[var2]] = field8674[--field8663];
                } else if (var56 == 37) {
                    int var12 = var4[var2];
                    field8663 -= var12;
                    String var13 = class12.method87((byte) 39, var12, field8663, field8674);
                    field8674[field8663++] = var13;
                } else if (var56 == 38) {
                    field8661--;
                } else if (var56 == 39) {
                    field8663--;
                } else if (var56 == 40) {
                    int var14 = var4[var2];
                    class88 var15 = class665.method4825(-61, var14);
                    if (var15 == null) {
                        throw new RuntimeException();
                    }
                    int[] var16 = new int[var15.field1314];
                    String[] var17 = new String[var15.field1318];
                    long[] var18 = new long[var15.field1315];
                    for (int var19 = 0; var19 < var15.field1306; var19++) {
                        var16[var19] = field8654[field8661 + var19 - var15.field1306];
                    }
                    for (int var20 = 0; var20 < var15.field1309; var20++) {
                        var17[var20] = field8674[field8663 + var20 - var15.field1309];
                    }
                    for (int var21 = 0; var21 < var15.field1313; var21++) {
                        var18[var21] = field8665[field8659 + var21 - var15.field1313];
                    }
                    field8661 -= var15.field1306;
                    field8663 -= var15.field1309;
                    field8659 -= var15.field1313;
                    class567 var22 = new class567();
                    var22.field8242 = arg0;
                    var22.field8244 = var2;
                    var22.field8243 = field8669;
                    var22.field8238 = field8675;
                    var22.field8237 = field8650;
                    if (field8647 >= field8670.length) {
                        throw new RuntimeException();
                    }
                    field8670[field8647++] = var22;
                    arg0 = var15;
                    var3 = var15.field1308;
                    var4 = var15.field1312;
                    var2 = -1;
                    field8669 = var16;
                    field8675 = var17;
                    field8650 = var18;
                } else if (var56 == 42) {
                    field8654[field8661++] = class380.field6121[var4[var2]];
                } else if (var56 == 43) {
                    int var23 = var4[var2];
                    class380.field6121[var23] = field8654[--field8661];
                    class570.method4204(1, var23);
                    class542.field7987 |= class335.field5467[var23];
                } else if (var56 == 44) {
                    int var24 = var4[var2] >> 16;
                    int var25 = var4[var2] & 0xFFFF;
                    int var26 = field8654[--field8661];
                    if (var26 >= 0 && var26 <= 5000) {
                        field8672[var24] = var26;
                        byte var27 = -1;
                        if (var25 == 105) {
                            var27 = 0;
                        }
                        int var28 = 0;
                        while (true) {
                            if (var28 >= var26) {
                                continue label429;
                            }
                            field8668[var24][var28] = var27;
                            var28++;
                        }
                    }
                    throw new RuntimeException();
                } else if (var56 == 45) {
                    int var29 = var4[var2];
                    int var30 = field8654[--field8661];
                    if (var30 < 0 || var30 >= field8672[var29]) {
                        throw new RuntimeException();
                    }
                    field8654[field8661++] = field8668[var29][var30];
                } else if (var56 == 46) {
                    int var31 = var4[var2];
                    field8661 -= 2;
                    int var32 = field8654[field8661];
                    if (var32 < 0 || var32 >= field8672[var31]) {
                        throw new RuntimeException();
                    }
                    field8668[var31][var32] = field8654[field8661 + 1];
                } else if (var56 == 47) {
                    String var33 = class723.field10611[var4[var2]];
                    if (var33 == null) {
                        var33 = field8680[28];
                    }
                    field8674[field8663++] = var33;
                } else if (var56 == 48) {
                    int var34 = var4[var2];
                    class723.field10611[var34] = field8674[--field8663];
                    class33.method339(var34, 64);
                } else if (var56 == 51) {
                    class69 var35 = arg0.field1305[var4[var2]];
                    class272 var36 = (class272) var35.method737((byte) -39, (long) field8654[--field8661]);
                    if (var36 != null) {
                        var2 += var36.field4377;
                    }
                } else if (var56 == 54) {
                    field8665[field8659++] = arg0.field1316[var2];
                } else if (var56 == 55) {
                    field8659--;
                } else if (var56 == 66) {
                    field8665[field8659++] = field8650[var4[var2]];
                } else if (var56 == 67) {
                    field8650[var4[var2]] = field8665[--field8659];
                } else if (var56 == 68) {
                    field8659 -= 2;
                    if (field8665[field8659 + 1] != field8665[field8659]) {
                        var2 += var4[var2];
                    }
                } else if (var56 == 69) {
                    field8659 -= 2;
                    if (field8665[field8659 + 1] == field8665[field8659]) {
                        var2 += var4[var2];
                    }
                } else if (var56 == 70) {
                    field8659 -= 2;
                    if (field8665[field8659] < field8665[field8659 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var56 == 71) {
                    field8659 -= 2;
                    if (field8665[field8659] > field8665[field8659 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var56 == 72) {
                    field8659 -= 2;
                    if (field8665[field8659] <= field8665[field8659 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var56 == 73) {
                    field8659 -= 2;
                    if (field8665[field8659] >= field8665[field8659 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var56 == 86) {
                    if (field8654[--field8661] == 1) {
                        var2 += var4[var2];
                    }
                } else if (var56 == 87) {
                    if (field8654[--field8661] == 0) {
                        var2 += var4[var2];
                    }
                } else if (var56 == 106) {
                    int var37 = var4[var2];
                    Integer var38 = (Integer) class99.field1456[var37];
                    if (var38 == null) {
                        class780 var39 = class519.field7687.method3207(var37, 17618);
                        if (var39.field11384 == 'i' || var39.field11384 == '1') {
                            field8654[field8661++] = 0;
                        } else {
                            field8654[field8661++] = -1;
                        }
                    } else {
                        field8654[field8661++] = var38;
                    }
                } else if (var56 == 107) {
                    int var40 = var4[var2];
                    class780 var41 = class519.field7687.method3207(var40, 17618);
                    if (var41.field11384 != '\u0001') {
                        field8654[field8661++] = 0;
                    }
                    Integer var42 = (Integer) class99.field1456[var41.field11386];
                    if (var42 == null) {
                        field8654[field8661++] = 0;
                    } else {
                        int var43 = var41.field11390 == 31 ? -1 : (0x1 << var41.field11390 + 1) - 1;
                        field8654[field8661++] = (var42 & var43) >>> var41.field11387;
                    }
                } else if (var56 == 108) {
                    int var44 = var4[var2];
                    Long var45 = (Long) class99.field1456[var44];
                    if (var45 == null) {
                        field8665[field8659++] = -1L;
                    } else {
                        field8665[field8659++] = var45;
                    }
                } else if (var56 == 109) {
                    int var46 = var4[var2];
                    String var47 = (String) class99.field1456[var46];
                    if (var47 == null) {
                        field8674[field8663++] = "";
                    } else {
                        field8674[field8663++] = var47;
                    }
                } else if (var56 == 112) {
                    field8654[field8661++] = method4392(var4[var2]);
                } else if (var56 == 113) {
                    field8654[field8661++] = method4379(var4[var2]);
                } else if (var56 == 114) {
                    field8665[field8659++] = method4383(var4[var2]);
                } else if (var56 == 115) {
                    field8674[field8663++] = method4391(var4[var2]);
                }
            }
        } catch (Exception var55) {
            if (arg0.field1317 == null) {
                StringBuffer var53 = new StringBuffer(30);
                var53.append(field8680[25]).append(arg0.field8252).append(" ");
                for (int var54 = field8647 - 1; var54 >= 0; var54--) {
                    var53.append(field8680[21]).append(field8670[var54].field8242.field8252).append(" ");
                }
                var53.append(field8680[22]).append(var5);
                class622.method4544(var55, var53.toString(), true);
            } else {
                class596.method4365(4, field8680[27] + arg0.field1317, 0);
                StringBuffer var50 = new StringBuffer(30);
                var50.append(field8680[27]).append(arg0.field1317).append("\n");
                for (int var51 = field8647 - 1; var51 >= 0; var51--) {
                    var50.append(field8680[19]).append(field8670[var51].field8242.field1317).append("\n");
                }
                var50.append(field8680[23]).append(var5).append("\n");
                String var52 = var55.getMessage();
                if (var52 != null && var52.length() > 0) {
                    var50.append(field8680[26]).append(var52).append("\n");
                }
                class622.method4544(var55, var50.toString(), true);
                class6.method42(true, var50.toString());
            }
        }
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(Lko;II)V")
    public static final void method4382(class532 arg0, int arg1, int arg2) {
        class88 var3 = class43.method444(arg0, -8287, arg1, arg2);
        if (var3 == null) {
            return;
        }
        field8669 = new int[var3.field1314];
        field8675 = new String[var3.field1318];
        if (class366.field5963 == var3.field1310 || class422.field6658 == var3.field1310 || class155.field2156 == var3.field1310) {
            int var4 = 0;
            int var5 = 0;
            if (class239.field3684 != null) {
                var4 = class239.field3684.field9883;
                var5 = class239.field3684.field9806;
            }
            field8669[0] = class15.field174.method5051(0) - var4;
            field8669[1] = class15.field174.method5048(true) - var5;
        }
        method4381(var3, 200000);
    }

    @OriginalMember(owner = "client!im", name = "e", descriptor = "(I)J")
    private static final long method4383(int arg0) {
        Long var1 = field8656.method491(class305.field4924.field8482 << 16 | arg0, (byte) -108);
        return var1 == null ? -1L : var1;
    }

    @OriginalMember(owner = "client!im", name = "d", descriptor = "(I)V")
    public static final void method4384(int arg0) {
        if (arg0 == -1 || !class504.method3798(127, arg0)) {
            return;
        }
        class683[] var1 = class309.field5028[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class683 var3 = var1[var2];
            if (var3.field9813 != null) {
                class730 var4 = new class730();
                var4.field10693 = var3;
                var4.field10692 = var3.field9813;
                method4390(var4, 2000000);
            }
        }
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(C)I")
    private static final int method4385(char arg0) {
        return class262.method2284(arg0, (byte) 80) ? 1 : 0;
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(Lmj;)V")
    private static final void method4386(class683 arg0) {
        if (arg0 == null) {
            return;
        }
        if (arg0.field9799 == -1) {
            int var4 = arg0.field9774 >>> 16;
            class683[] var5 = class97.field1434[var4];
            if (var5 == null) {
                class683[] var6 = class309.field5028[var4];
                int var7 = var6.length;
                var5 = class97.field1434[var4] = new class683[var7];
                class405.method3255(var6, 0, var5, 0, var6.length);
            }
            int var8;
            for (var8 = 0; var8 < var5.length && var5[var8] != arg0; var8++) {
            }
            if (var8 >= var5.length) {
                return;
            }
            class405.method3255(var5, var8 + 1, var5, var8, var5.length - var8 - 1);
            var5[var5.length - 1] = arg0;
            return;
        }
        class683 var1 = class200.method1826(true, arg0.field9764);
        if (var1 == null) {
            return;
        }
        if (var1.field9825 == var1.field9743) {
            var1.field9825 = new class683[var1.field9743.length];
            var1.field9825[var1.field9825.length - 1] = arg0;
            class405.method3255(var1.field9743, 0, var1.field9825, 0, arg0.field9799);
            class405.method3255(var1.field9743, arg0.field9799 + 1, var1.field9825, arg0.field9799, var1.field9743.length - arg0.field9799 - 1);
            return;
        }
        int var2 = 0;
        class683[] var3 = var1.field9825;
        while (var2 < var3.length && var3[var2] != arg0) {
            var2++;
        }
        if (var2 >= var3.length) {
            return;
        }
        class405.method3255(var3, var2 + 1, var3, var2, var3.length - var2 - 1);
        var3[var1.field9825.length - 1] = arg0;
        return;
    }

    @OriginalMember(owner = "client!im", name = "b", descriptor = "(Lmj;)V")
    private static final void method4387(class683 arg0) {
        if (arg0 == null) {
            return;
        }
        if (arg0.field9799 == -1) {
            int var4 = arg0.field9774 >>> 16;
            class683[] var5 = class97.field1434[var4];
            if (var5 == null) {
                class683[] var6 = class309.field5028[var4];
                int var7 = var6.length;
                var5 = class97.field1434[var4] = new class683[var7];
                class405.method3255(var6, 0, var5, 0, var6.length);
            }
            int var8;
            for (var8 = 0; var8 < var5.length && var5[var8] != arg0; var8++) {
            }
            if (var8 >= var5.length) {
                return;
            }
            class405.method3255(var5, 0, var5, 1, var8);
            var5[0] = arg0;
            return;
        }
        class683 var1 = class200.method1826(true, arg0.field9764);
        if (var1 == null) {
            return;
        }
        if (var1.field9825 == var1.field9743) {
            var1.field9825 = new class683[var1.field9743.length];
            var1.field9825[0] = arg0;
            class405.method3255(var1.field9743, 0, var1.field9825, 1, arg0.field9799);
            class405.method3255(var1.field9743, arg0.field9799 + 1, var1.field9825, arg0.field9799 + 1, var1.field9743.length - arg0.field9799 - 1);
            return;
        }
        int var2 = 0;
        class683[] var3 = var1.field9825;
        while (var2 < var3.length && var3[var2] != arg0) {
            var2++;
        }
        if (var2 >= var3.length) {
            return;
        }
        class405.method3255(var3, 0, var3, 1, var2);
        var3[0] = arg0;
        return;
    }

    @OriginalMember(owner = "client!im", name = "b", descriptor = "()V")
    public static void method4388() {
        field8669 = null;
        field8675 = null;
        field8650 = null;
        field8672 = null;
        field8668 = null;
        field8654 = null;
        field8674 = null;
        field8665 = null;
        field8670 = null;
        field8666 = null;
        field8660 = null;
        field8658 = null;
        field8656 = null;
        field8652 = null;
        field8676 = null;
        field8667 = null;
        field8678 = null;
    }

    @OriginalMember(owner = "client!im", name = "c", descriptor = "(IZ)V")
    private static final void method4389(int arg0, boolean arg1) {
        if (arg0 < 5100) {
            if (arg0 == 5000) {
                field8654[field8661++] = class748.field11041;
                return;
            }
            if (arg0 == 5001) {
                field8661 -= 3;
                class748.field11041 = field8654[field8661];
                class336.field5483 = class473.method3631(field8654[field8661 + 1], 91);
                if (class336.field5483 == null) {
                    class336.field5483 = class782.field11414;
                }
                class370.field5995 = field8654[field8661 + 2];
                field8657++;
                class164 var2 = class193.method1785(false);
                class487 var3 = class618.method4519(97, class549.field8060, var2.field2659);
                var3.field7362.method1678(class748.field11041, 65280);
                var3.field7362.method1678(class336.field5483.field10348, 65280);
                var3.field7362.method1678(class370.field5995, 65280);
                var2.method1546(var3, 1);
                return;
            }
            if (arg0 == 5002) {
                field8663 -= 2;
                String var4 = field8674[field8663];
                String var5 = field8674[field8663 + 1];
                field8661 -= 2;
                int var6 = field8654[field8661];
                int var7 = field8654[field8661 + 1];
                if (var5 == null) {
                    var5 = "";
                }
                if (var5.length() > 80) {
                    var5 = var5.substring(0, 80);
                }
                field8655++;
                class164 var8 = class193.method1785(false);
                class487 var9 = class618.method4519(34, class635.field9119, var8.field2659);
                var9.field7362.method1678(class126.method1216(-126, var4) + class126.method1216(-24, var5) + 2, 65280);
                var9.field7362.method1681(var4, 23137);
                var9.field7362.method1678(var6 - 1, 65280);
                var9.field7362.method1678(var7, 65280);
                var9.field7362.method1681(var5, 23137);
                var8.method1546(var9, 1);
                return;
            }
            if (arg0 == 5003) {
                int var10 = field8654[--field8661];
                class583 var11 = class654.method4769(var10, 75);
                String var12 = "";
                if (var11 != null && var11.field8385 != null) {
                    var12 = var11.field8385;
                }
                field8674[field8663++] = var12;
                return;
            }
            if (arg0 == 5004) {
                int var13 = field8654[--field8661];
                class583 var14 = class654.method4769(var13, 86);
                int var15 = -1;
                if (var14 != null) {
                    var15 = var14.field8390;
                }
                field8654[field8661++] = var15;
                return;
            }
            if (arg0 == 5005) {
                if (class336.field5483 == null) {
                    field8654[field8661++] = -1;
                    return;
                }
                field8654[field8661++] = class336.field5483.field10348;
                return;
            }
            if (arg0 == 5006) {
                int var16 = field8654[--field8661];
                class164 var17 = class193.method1785(false);
                class487 var18 = class618.method4519(93, class650.field9323, var17.field2659);
                var18.field7362.method1678(var16, 65280);
                var17.method1546(var18, 1);
                return;
            }
            if (arg0 == 5008) {
                String var19 = field8674[--field8663];
                method4377(var19, arg0);
                return;
            }
            if (arg0 == 5009) {
                field8663 -= 2;
                String var20 = field8674[field8663];
                String var21 = field8674[field8663 + 1];
                if (class264.field4283 != 0 || (!class211.field3348 || class16.field181) && !class127.field1836) {
                    field8646++;
                    class164 var22 = class193.method1785(false);
                    class487 var23 = class618.method4519(49, class608.field8759, var22.field2659);
                    var23.field7362.method1678(0, 65280);
                    int var24 = var23.field7362.field2799;
                    var23.field7362.method1681(var20, 23137);
                    class530.method3962((byte) 122, var21, var23.field7362);
                    var23.field7362.method1668(-17010, var23.field7362.field2799 - var24);
                    var22.method1546(var23, 1);
                    return;
                }
                return;
            }
            if (arg0 == 5010) {
                int var25 = field8654[--field8661];
                class583 var26 = class654.method4769(var25, 105);
                String var27 = "";
                if (var26 != null && var26.field8388 != null) {
                    var27 = var26.field8388;
                }
                field8674[field8663++] = var27;
                return;
            }
            if (arg0 == 5011) {
                int var28 = field8654[--field8661];
                class583 var29 = class654.method4769(var28, 85);
                String var30 = "";
                if (var29 != null && var29.field8389 != null) {
                    var30 = var29.field8389;
                }
                field8674[field8663++] = var30;
                return;
            }
            if (arg0 == 5012) {
                int var31 = field8654[--field8661];
                class583 var32 = class654.method4769(var31, 83);
                int var33 = -1;
                if (var32 != null) {
                    var33 = var32.field8387;
                }
                field8654[field8661++] = var33;
                return;
            }
            if (arg0 == 5015) {
                String var34;
                if (class438.field6846 == null || class438.field6846.field10813 == null) {
                    var34 = "";
                } else {
                    var34 = class438.field6846.method5361(true, -380246327);
                }
                field8674[field8663++] = var34;
                return;
            }
            if (arg0 == 5016) {
                field8654[field8661++] = class370.field5995;
                return;
            }
            if (arg0 == 5017) {
                field8654[field8661++] = class553.method4097(5510);
                return;
            }
            if (arg0 == 5018) {
                int var35 = field8654[--field8661];
                class583 var36 = class654.method4769(var35, 108);
                int var37 = 0;
                if (var36 != null) {
                    var37 = var36.field8391;
                }
                field8654[field8661++] = var37;
                return;
            }
            if (arg0 == 5019) {
                int var38 = field8654[--field8661];
                class583 var39 = class654.method4769(var38, 112);
                String var40 = "";
                if (var39 != null && var39.field8386 != null) {
                    var40 = var39.field8386;
                }
                field8674[field8663++] = var40;
                return;
            }
            if (arg0 == 5020) {
                String var41;
                if (class438.field6846 == null || class438.field6846.field10813 == null) {
                    var41 = "";
                } else {
                    var41 = class438.field6846.method5354(false, 0);
                }
                field8674[field8663++] = var41;
                return;
            }
            if (arg0 == 5023) {
                int var42 = field8654[--field8661];
                class583 var43 = class654.method4769(var42, 67);
                int var44 = -1;
                if (var43 != null) {
                    var44 = var43.field8384;
                }
                field8654[field8661++] = var44;
                return;
            }
            if (arg0 == 5024) {
                int var45 = field8654[--field8661];
                class583 var46 = class654.method4769(var45, 31);
                int var47 = -1;
                if (var46 != null) {
                    var47 = var46.field8394;
                }
                field8654[field8661++] = var47;
                return;
            }
            if (arg0 == 5025) {
                int var48 = field8654[--field8661];
                class583 var49 = class654.method4769(var48, 96);
                String var50 = "";
                if (var49 != null && var49.field8383 != null) {
                    var50 = var49.field8383;
                }
                field8674[field8663++] = var50;
                return;
            }
            if (arg0 == 5050) {
                int var51 = field8654[--field8661];
                field8674[field8663++] = class488.field7369.method2353(var51, 31611).field7820;
                return;
            }
            if (arg0 == 5051) {
                int var52 = field8654[--field8661];
                class533 var53 = class488.field7369.method2353(var52, 31611);
                if (var53.field7826 == null) {
                    field8654[field8661++] = 0;
                    return;
                }
                field8654[field8661++] = var53.field7826.length;
                return;
            }
            if (arg0 == 5052) {
                field8661 -= 2;
                int var54 = field8654[field8661];
                int var55 = field8654[field8661 + 1];
                class533 var56 = class488.field7369.method2353(var54, 31611);
                int var57 = var56.field7826[var55];
                field8654[field8661++] = var57;
                return;
            }
            if (arg0 == 5053) {
                int var58 = field8654[--field8661];
                class533 var59 = class488.field7369.method2353(var58, 31611);
                if (var59.field7818 == null) {
                    field8654[field8661++] = 0;
                    return;
                }
                field8654[field8661++] = var59.field7818.length;
                return;
            }
            if (arg0 == 5054) {
                field8661 -= 2;
                int var60 = field8654[field8661];
                int var61 = field8654[field8661 + 1];
                field8654[field8661++] = class488.field7369.method2353(var60, 31611).field7818[var61];
                return;
            }
            if (arg0 == 5055) {
                int var62 = field8654[--field8661];
                field8674[field8663++] = class321.field5228.method4826(var62, 1).method3565(3855);
                return;
            }
            if (arg0 == 5056) {
                int var63 = field8654[--field8661];
                class461 var64 = class321.field5228.method4826(var63, 1);
                if (var64.field7088 == null) {
                    field8654[field8661++] = 0;
                    return;
                }
                field8654[field8661++] = var64.field7088.length;
                return;
            }
            if (arg0 == 5057) {
                field8661 -= 2;
                int var65 = field8654[field8661];
                int var66 = field8654[field8661 + 1];
                field8654[field8661++] = class321.field5228.method4826(var65, 1).field7088[var66];
                return;
            }
            if (arg0 == 5058) {
                field8658 = new class90();
                field8658.field1340 = field8654[--field8661];
                field8658.field1338 = class321.field5228.method4826(field8658.field1340, 1);
                field8658.field1339 = new int[field8658.field1338.method3567((byte) -128)];
                return;
            }
            if (arg0 == 5059) {
                field8649++;
                class164 var67 = class193.method1785(false);
                class487 var68 = class618.method4519(119, class616.field8890, var67.field2659);
                var68.field7362.method1678(0, 65280);
                int var69 = var68.field7362.field2799;
                var68.field7362.method1678(0, 65280);
                var68.field7362.method1650((byte) -95, field8658.field1340);
                field8658.field1338.method3566((byte) -119, var68.field7362, field8658.field1339);
                var68.field7362.method1668(-17010, var68.field7362.field2799 - var69);
                var67.method1546(var68, 1);
                return;
            }
            if (arg0 == 5060) {
                String var70 = field8674[--field8663];
                field8664++;
                class164 var71 = class193.method1785(false);
                class487 var72 = class618.method4519(43, class535.field7851, var71.field2659);
                var72.field7362.method1678(0, 65280);
                int var73 = var72.field7362.field2799;
                var72.field7362.method1681(var70, 23137);
                var72.field7362.method1650((byte) -95, field8658.field1340);
                field8658.field1338.method3566((byte) -119, var72.field7362, field8658.field1339);
                var72.field7362.method1668(-17010, var72.field7362.field2799 - var73);
                var71.method1546(var72, 1);
                return;
            }
            if (arg0 == 5061) {
                field8649++;
                class164 var74 = class193.method1785(false);
                class487 var75 = class618.method4519(60, class616.field8890, var74.field2659);
                var75.field7362.method1678(0, 65280);
                int var76 = var75.field7362.field2799;
                var75.field7362.method1678(1, 65280);
                var75.field7362.method1650((byte) -95, field8658.field1340);
                field8658.field1338.method3566((byte) -119, var75.field7362, field8658.field1339);
                var75.field7362.method1668(-17010, var75.field7362.field2799 - var76);
                var74.method1546(var75, 1);
                return;
            }
            if (arg0 == 5062) {
                field8661 -= 2;
                int var77 = field8654[field8661];
                int var78 = field8654[field8661 + 1];
                field8654[field8661++] = class488.field7369.method2353(var77, 31611).field7824[var78];
                return;
            }
            if (arg0 == 5063) {
                field8661 -= 2;
                int var79 = field8654[field8661];
                int var80 = field8654[field8661 + 1];
                field8654[field8661++] = class488.field7369.method2353(var79, 31611).field7825[var80];
                return;
            }
            if (arg0 == 5064) {
                field8661 -= 2;
                int var81 = field8654[field8661];
                int var82 = field8654[field8661 + 1];
                if (var82 == -1) {
                    field8654[field8661++] = -1;
                    return;
                }
                field8654[field8661++] = class488.field7369.method2353(var81, 31611).method3977((char) var82, (byte) 56);
                return;
            }
            if (arg0 == 5065) {
                field8661 -= 2;
                int var83 = field8654[field8661];
                int var84 = field8654[field8661 + 1];
                if (var84 == -1) {
                    field8654[field8661++] = -1;
                    return;
                }
                field8654[field8661++] = class488.field7369.method2353(var83, 31611).method3973((char) var84, (byte) -118);
                return;
            }
            if (arg0 == 5066) {
                int var85 = field8654[--field8661];
                field8654[field8661++] = class321.field5228.method4826(var85, 1).method3567((byte) -128);
                return;
            }
            if (arg0 == 5067) {
                field8661 -= 2;
                int var86 = field8654[field8661];
                int var87 = field8654[field8661 + 1];
                int var88 = class321.field5228.method4826(var86, 1).method3574(true, var87).field9124;
                field8654[field8661++] = var88;
                return;
            }
            if (arg0 == 5068) {
                field8661 -= 2;
                int var89 = field8654[field8661];
                int var90 = field8654[field8661 + 1];
                field8658.field1339[var89] = var90;
                return;
            }
            if (arg0 == 5069) {
                field8661 -= 2;
                int var91 = field8654[field8661];
                int var92 = field8654[field8661 + 1];
                field8658.field1339[var91] = var92;
                return;
            }
            if (arg0 == 5070) {
                field8661 -= 3;
                int var93 = field8654[field8661];
                int var94 = field8654[field8661 + 1];
                int var95 = field8654[field8661 + 2];
                class461 var96 = class321.field5228.method4826(var93, 1);
                if (var96.method3574(true, var94).field9124 != 0) {
                    throw new RuntimeException(field8680[16]);
                }
                field8654[field8661++] = var96.method3568((byte) 20, var94, var95);
                return;
            }
            if (arg0 == 5071) {
                String var97 = field8674[--field8663];
                boolean var98 = field8654[--field8661] == 1;
                class293.method2494((byte) 88, var98, var97);
                field8654[field8661++] = class76.field1103;
                return;
            }
            if (arg0 == 5072) {
                if (class711.field10289 != null && class590.field8552 < class76.field1103) {
                    field8654[field8661++] = class711.field10289[class590.field8552++] & 0xFFFF;
                    return;
                }
                field8654[field8661++] = -1;
                return;
            }
            if (arg0 == 5073) {
                class590.field8552 = 0;
                return;
            }
            if (arg0 == 5074) {
                class164 var99 = class193.method1785(false);
                class487 var100 = class618.method4519(16, class616.field8890, var99.field2659);
                var100.field7362.method1678(0, 65280);
                int var101 = var100.field7362.field2799;
                var100.field7362.method1678(2, 65280);
                var100.field7362.method1650((byte) -95, field8658.field1340);
                field8658.field1338.method3566((byte) -119, var100.field7362, field8658.field1339);
                var100.field7362.method1668(-17010, var100.field7362.field2799 - var101);
                var99.method1546(var100, 1);
                return;
            }
            if (arg0 == 5075) {
                class164 var102 = class193.method1785(false);
                class487 var103 = class618.method4519(73, class616.field8890, var102.field2659);
                var103.field7362.method1678(0, 65280);
                int var104 = var103.field7362.field2799;
                var103.field7362.method1678(3, 65280);
                var103.field7362.method1650((byte) -95, field8658.field1340);
                field8658.field1338.method3566((byte) -119, var103.field7362, field8658.field1339);
                var103.field7362.method1668(-17010, var103.field7362.field2799 - var104);
                var102.method1546(var103, 1);
                return;
            }
        } else if (arg0 < 5200) {
            if (arg0 == 5100) {
                if (class196.field3117.method1189(86, 15708)) {
                    field8654[field8661++] = 1;
                    return;
                }
                field8654[field8661++] = 0;
                return;
            }
            if (arg0 == 5101) {
                if (class196.field3117.method1189(82, 15708)) {
                    field8654[field8661++] = 1;
                    return;
                }
                field8654[field8661++] = 0;
                return;
            }
            if (arg0 == 5102) {
                if (class196.field3117.method1189(81, 15708)) {
                    field8654[field8661++] = 1;
                    return;
                }
                field8654[field8661++] = 0;
                return;
            }
        } else if (arg0 < 5300) {
            if (arg0 == 5200) {
                class621.method4534(field8654[--field8661], (byte) -126);
                return;
            }
            if (arg0 == 5201) {
                field8654[field8661++] = class760.method5490(0);
                return;
            }
            if (arg0 == 5205) {
                class741.method5401(field8654[--field8661], false, -1, -1, false);
                return;
            }
            if (arg0 == 5206) {
                int var105 = field8654[--field8661];
                class40 var106 = class770.method5561(var105 >> 14 & 0x3FFF, var105 & 0x3FFF);
                if (var106 == null) {
                    field8654[field8661++] = -1;
                    return;
                }
                field8654[field8661++] = var106.field455;
                return;
            }
            if (arg0 == 5207) {
                class40 var107 = class770.method5552(field8654[--field8661]);
                if (var107 != null && var107.field456 != null) {
                    field8674[field8663++] = var107.field456;
                    return;
                }
                field8674[field8663++] = "";
                return;
            }
            if (arg0 == 5208) {
                field8654[field8661++] = class184.field2933;
                field8654[field8661++] = class361.field5824;
                return;
            }
            if (arg0 == 5209) {
                field8654[field8661++] = class95.field1383 + class770.field11276;
                field8654[field8661++] = class770.field11270 + class317.field5174;
                return;
            }
            if (arg0 == 5210) {
                int var108 = field8654[--field8661];
                class40 var109 = class770.method5552(var108);
                if (var109 == null) {
                    field8654[field8661++] = 0;
                    field8654[field8661++] = 0;
                    return;
                }
                field8654[field8661++] = var109.field457 >> 14 & 0x3FFF;
                field8654[field8661++] = var109.field457 & 0x3FFF;
                return;
            }
            if (arg0 == 5211) {
                int var110 = field8654[--field8661];
                class40 var111 = class770.method5552(var110);
                if (var111 == null) {
                    field8654[field8661++] = 0;
                    field8654[field8661++] = 0;
                    return;
                }
                field8654[field8661++] = var111.field464 - var111.field450;
                field8654[field8661++] = var111.field448 - var111.field453;
                return;
            }
            if (arg0 == 5212) {
                class420 var112 = class278.method2381((byte) -121);
                if (var112 == null) {
                    field8654[field8661++] = -1;
                    field8654[field8661++] = -1;
                    return;
                }
                field8654[field8661++] = var112.field6636;
                int var113 = var112.field6635 << 28 | class770.field11276 + var112.field6631 << 14 | class770.field11270 + var112.field6630;
                field8654[field8661++] = var113;
                return;
            }
            if (arg0 == 5213) {
                class420 var114 = class295.method2546(-1);
                if (var114 == null) {
                    field8654[field8661++] = -1;
                    field8654[field8661++] = -1;
                    return;
                }
                field8654[field8661++] = var114.field6636;
                int var115 = var114.field6635 << 28 | class770.field11276 + var114.field6631 << 14 | class770.field11270 + var114.field6630;
                field8654[field8661++] = var115;
                return;
            }
            if (arg0 == 5214) {
                int var116 = field8654[--field8661];
                class40 var117 = class760.method5494((byte) 89);
                if (var117 != null) {
                    boolean var118 = var117.method381(-1, var116 >> 14 & 0x3FFF, var116 >> 28 & 0x3, var116 & 0x3FFF, field8676);
                    if (var118) {
                        class368.method3035(field8676[2], field8676[1], (byte) 100);
                    }
                }
                return;
            }
            if (arg0 == 5215) {
                field8661 -= 2;
                int var119 = field8654[field8661];
                int var120 = field8654[field8661 + 1];
                class708 var121 = class770.method5540(var119 >> 14 & 0x3FFF, var119 & 0x3FFF);
                boolean var122 = false;
                for (class40 var123 = (class40) var121.method5147((byte) -85); var123 != null; var123 = (class40) var121.method5144(256)) {
                    if (var123.field455 == var120) {
                        var122 = true;
                        break;
                    }
                }
                if (var122) {
                    field8654[field8661++] = 1;
                    return;
                }
                field8654[field8661++] = 0;
                return;
            }
            if (arg0 == 5218) {
                int var124 = field8654[--field8661];
                class40 var125 = class770.method5552(var124);
                if (var125 == null) {
                    field8654[field8661++] = -1;
                    return;
                }
                field8654[field8661++] = var125.field465;
                return;
            }
            if (arg0 == 5220) {
                field8654[field8661++] = class672.field9539 == 100 ? 1 : 0;
                return;
            }
            if (arg0 == 5221) {
                int var126 = field8654[--field8661];
                class368.method3035(var126 & 0x3FFF, var126 >> 14 & 0x3FFF, (byte) 118);
                return;
            }
            if (arg0 == 5222) {
                class40 var127 = class760.method5494((byte) 89);
                if (var127 != null) {
                    boolean var128 = var127.method383(class95.field1383 + class770.field11276, field8676, 12800, class770.field11270 + class317.field5174);
                    if (var128) {
                        field8654[field8661++] = field8676[1];
                        field8654[field8661++] = field8676[2];
                        return;
                    }
                    field8654[field8661++] = -1;
                    field8654[field8661++] = -1;
                    return;
                }
                field8654[field8661++] = -1;
                field8654[field8661++] = -1;
                return;
            }
            if (arg0 == 5223) {
                field8661 -= 2;
                int var129 = field8654[field8661];
                int var130 = field8654[field8661 + 1];
                class741.method5401(var129, false, var130 & 0x3FFF, var130 >> 14 & 0x3FFF, false);
                return;
            }
            if (arg0 == 5224) {
                int var131 = field8654[--field8661];
                class40 var132 = class760.method5494((byte) 89);
                if (var132 != null) {
                    boolean var133 = var132.method381(-1, var131 >> 14 & 0x3FFF, var131 >> 28 & 0x3, var131 & 0x3FFF, field8676);
                    if (var133) {
                        field8654[field8661++] = field8676[1];
                        field8654[field8661++] = field8676[2];
                        return;
                    }
                    field8654[field8661++] = -1;
                    field8654[field8661++] = -1;
                    return;
                }
                field8654[field8661++] = -1;
                field8654[field8661++] = -1;
                return;
            }
            if (arg0 == 5225) {
                int var134 = field8654[--field8661];
                class40 var135 = class760.method5494((byte) 89);
                if (var135 != null) {
                    boolean var136 = var135.method383(var134 >> 14 & 0x3FFF, field8676, 12800, var134 & 0x3FFF);
                    if (var136) {
                        field8654[field8661++] = field8676[1];
                        field8654[field8661++] = field8676[2];
                        return;
                    }
                    field8654[field8661++] = -1;
                    field8654[field8661++] = -1;
                    return;
                }
                field8654[field8661++] = -1;
                field8654[field8661++] = -1;
                return;
            }
            if (arg0 == 5226) {
                class28.method284(100, field8654[--field8661]);
                return;
            }
            if (arg0 == 5227) {
                field8661 -= 2;
                int var137 = field8654[field8661];
                int var138 = field8654[field8661 + 1];
                class741.method5401(var137, false, var138 & 0x3FFF, var138 >> 14 & 0x3FFF, true);
                return;
            }
            if (arg0 == 5228) {
                class91.field1344 = field8654[--field8661] == 1;
                return;
            }
            if (arg0 == 5229) {
                field8654[field8661++] = class91.field1344 ? 1 : 0;
                return;
            }
            if (arg0 == 5230) {
                int var139 = field8654[--field8661];
                class30.method309((byte) 126, var139);
                return;
            }
            if (arg0 == 5231) {
                field8661 -= 2;
                int var140 = field8654[field8661];
                boolean var141 = field8654[field8661 + 1] == 1;
                if (class497.field7458 != null) {
                    class568 var142 = class497.field7458.method737((byte) -39, (long) var140);
                    if (var142 != null && !var141) {
                        var142.method4173(-1);
                        return;
                    }
                    if (var142 == null && var141) {
                        class568 var143 = new class568();
                        class497.field7458.method738(var143, (long) var140, -12002);
                    }
                }
                return;
            }
            if (arg0 == 5232) {
                int var144 = field8654[--field8661];
                if (class497.field7458 != null) {
                    class568 var145 = class497.field7458.method737((byte) -39, (long) var144);
                    field8654[field8661++] = var145 == null ? 0 : 1;
                    return;
                }
                field8654[field8661++] = 0;
                return;
            }
            if (arg0 == 5233) {
                field8661 -= 2;
                int var146 = field8654[field8661];
                boolean var147 = field8654[field8661 + 1] == 1;
                if (class285.field4613 != null) {
                    class568 var148 = class285.field4613.method737((byte) -39, (long) var146);
                    if (var148 != null && !var147) {
                        var148.method4173(-1);
                        return;
                    }
                    if (var148 == null && var147) {
                        class568 var149 = new class568();
                        class285.field4613.method738(var149, (long) var146, -12002);
                    }
                }
                return;
            }
            if (arg0 == 5234) {
                int var150 = field8654[--field8661];
                if (class285.field4613 != null) {
                    class568 var151 = class285.field4613.method737((byte) -39, (long) var150);
                    field8654[field8661++] = var151 == null ? 0 : 1;
                    return;
                }
                field8654[field8661++] = 0;
                return;
            }
            if (arg0 == 5235) {
                field8654[field8661++] = class770.field11258 == null ? -1 : class770.field11258.field455;
                return;
            }
            if (arg0 == 5236) {
                field8661 -= 2;
                int var152 = field8654[field8661];
                int var153 = field8654[field8661 + 1];
                int var154 = var153 >> 14 & 0x3FFF;
                int var155 = var153 & 0x3FFF;
                int var156 = class130.method1237(false, var155, var154, var152);
                if (var156 < 0) {
                    field8654[field8661++] = -1;
                    return;
                }
                field8654[field8661++] = var156;
                return;
            }
            if (arg0 == 5237) {
                class395.method3199(12);
                return;
            }
        } else if (arg0 < 5400) {
            if (arg0 == 5300) {
                field8661 -= 2;
                int var157 = field8654[field8661];
                int var158 = field8654[field8661 + 1];
                class453.method3520(3, (byte) 52, var158, var157, false);
                field8654[field8661++] = class82.field1247 == null ? 0 : 1;
                return;
            }
            if (arg0 == 5301) {
                if (class82.field1247 != null) {
                    class453.method3520(class623.field8996.field6353.method2132(true), (byte) 52, -1, -1, false);
                }
                return;
            }
            if (arg0 == 5302) {
                class609[] var159 = class190.method1766(-66);
                field8654[field8661++] = var159.length;
                return;
            }
            if (arg0 == 5303) {
                int var160 = field8654[--field8661];
                class609[] var161 = class190.method1766(-116);
                field8654[field8661++] = var161[var160].field8774;
                field8654[field8661++] = var161[var160].field8767;
                return;
            }
            if (arg0 == 5305) {
                int var162 = class714.field10317;
                int var163 = class732.field10729;
                int var164 = -1;
                class609[] var165 = class190.method1766(-100);
                for (int var166 = 0; var166 < var165.length; var166++) {
                    class609 var167 = var165[var166];
                    if (var167.field8774 == var162 && var167.field8767 == var163) {
                        var164 = var166;
                        break;
                    }
                }
                field8654[field8661++] = var164;
                return;
            }
            if (arg0 == 5306) {
                field8654[field8661++] = class466.method3598(1);
                return;
            }
            if (arg0 == 5307) {
                int var168 = field8654[--field8661];
                if (var168 >= 1 && var168 <= 2) {
                    class453.method3520(var168, (byte) 52, -1, -1, false);
                    return;
                }
                return;
            }
            if (arg0 == 5308) {
                field8654[field8661++] = class623.field8996.field6353.method2132(true);
                return;
            }
            if (arg0 == 5309) {
                int var169 = field8654[--field8661];
                if (var169 >= 1 && var169 <= 2) {
                    class623.field8996.method3244(22733, class623.field8996.field6353, var169);
                    class623.field8996.method3244(22733, class623.field8996.field6403, var169);
                    class574.method4222((byte) 105);
                    return;
                }
                return;
            }
        } else if (arg0 < 5500) {
            if (arg0 == 5400) {
                field8663 -= 2;
                String var170 = field8674[field8663];
                String var171 = field8674[field8663 + 1];
                int var172 = field8654[--field8661];
                field8671++;
                class164 var173 = class193.method1785(false);
                class487 var174 = class618.method4519(62, class55.field696, var173.field2659);
                var174.field7362.method1678(class126.method1216(-126, var170) + class126.method1216(-116, var171) + 1, 65280);
                var174.field7362.method1681(var170, 23137);
                var174.field7362.method1681(var171, 23137);
                var174.field7362.method1678(var172, 65280);
                var173.method1546(var174, 1);
                return;
            }
            if (arg0 == 5401) {
                field8661 -= 2;
                class374.field6067[field8654[field8661]] = (short) class209.method1886(true, field8654[field8661 + 1]);
                class229.field3563.method528(0);
                class229.field3563.method534((byte) -51);
                class395.field6267.method3136(1744);
                class30.method318(-113);
                return;
            }
            if (arg0 == 5405) {
                field8661 -= 2;
                int var175 = field8654[field8661];
                int var176 = field8654[field8661 + 1];
                if (var175 >= 0 && var175 < 2) {
                    class665.field9470[var175] = new int[var176 << 1][4];
                }
                return;
            }
            if (arg0 == 5406) {
                field8661 -= 7;
                int var177 = field8654[field8661];
                int var178 = field8654[field8661 + 1] << 1;
                int var179 = field8654[field8661 + 2];
                int var180 = field8654[field8661 + 3];
                int var181 = field8654[field8661 + 4];
                int var182 = field8654[field8661 + 5];
                int var183 = field8654[field8661 + 6];
                if (var177 >= 0 && var177 < 2 && class665.field9470[var177] != null && var178 >= 0 && var178 < class665.field9470[var177].length) {
                    class665.field9470[var177][var178] = new int[] { (var179 >> 14 & 0x3FFF) << 9, var180 << 2, (var179 & 0x3FFF) << 9, var183 };
                    class665.field9470[var177][var178 + 1] = new int[] { (var181 >> 14 & 0x3FFF) << 9, var182 << 2, (var181 & 0x3FFF) << 9 };
                }
                return;
            }
            if (arg0 == 5407) {
                int var184 = class665.field9470[field8654[--field8661]].length >> 1;
                field8654[field8661++] = var184;
                return;
            }
            if (arg0 == 5411) {
                if (class82.field1247 != null) {
                    class453.method3520(class623.field8996.field6353.method2132(true), (byte) 52, -1, -1, false);
                }
                if (class517.field7660 != null) {
                    class227.method1989(0);
                    System.exit(0);
                    return;
                }
                String var185 = class782.field11420 == null ? class101.method955((byte) 85) : class782.field11420;
                class87.method866(class393.field6256, var185, false, class623.field8996.field6379.method4132(true) == 1, (byte) -71);
                return;
            }
            if (arg0 == 5419) {
                String var186 = "";
                if (class757.field11118 != null) {
                    if (class757.field11118.field3407 == null) {
                        var186 = class641.method4645(class757.field11118.field3401, -27);
                    } else {
                        var186 = (String) class757.field11118.field3407;
                    }
                }
                field8674[field8663++] = var186;
                return;
            }
            if (arg0 == 5420) {
                field8654[field8661++] = class393.field6256.field806 ? 0 : 1;
                return;
            }
            if (arg0 == 5421) {
                if (class82.field1247 != null) {
                    class453.method3520(class623.field8996.field6353.method2132(true), (byte) 52, -1, -1, false);
                }
                String var187 = field8674[--field8663];
                boolean var188 = field8654[--field8661] == 1;
                String var189 = class101.method955((byte) 84) + var187;
                class87.method866(class393.field6256, var189, var188, class623.field8996.field6379.method4132(true) == 1, (byte) 105);
                return;
            }
            if (arg0 == 5422) {
                field8663 -= 2;
                String var190 = field8674[field8663];
                String var191 = field8674[field8663 + 1];
                int var192 = field8654[--field8661];
                if (var190.length() > 0) {
                    if (class461.field7106 == null) {
                        class461.field7106 = new String[class534.field7839[class305.field4924.field8482]];
                    }
                    class461.field7106[var192] = var190;
                }
                if (var191.length() > 0) {
                    if (class689.field9941 == null) {
                        class689.field9941 = new String[class534.field7839[class305.field4924.field8482]];
                    }
                    class689.field9941[var192] = var191;
                }
                return;
            }
            if (arg0 == 5423) {
                System.out.println(field8674[--field8663]);
                return;
            }
            if (arg0 == 5424) {
                field8661 -= 11;
                class582.field8378 = field8654[field8661];
                class152.field2132 = field8654[field8661 + 1];
                class776.field11330 = field8654[field8661 + 2];
                class482.field7331 = field8654[field8661 + 3];
                class287.field4629 = field8654[field8661 + 4];
                class658.field9410 = field8654[field8661 + 5];
                class578.field8316 = field8654[field8661 + 6];
                class173.field2763 = field8654[field8661 + 7];
                class227.field3551 = field8654[field8661 + 8];
                class785.field11472 = field8654[field8661 + 9];
                class293.field4696 = field8654[field8661 + 10];
                class550.field8065.method595(-2, class287.field4629);
                class550.field8065.method595(-2, class658.field9410);
                class550.field8065.method595(-2, class578.field8316);
                class550.field8065.method595(-2, class173.field2763);
                class550.field8065.method595(-2, class227.field3551);
                class486.field7354 = null;
                class461.field7107 = null;
                class789.field11531 = null;
                class794.field11608 = null;
                class739.field10873 = null;
                class334.field5452 = null;
                class433.field6804 = null;
                class338.field5513 = null;
                class793.field11597 = true;
                return;
            }
            if (arg0 == 5425) {
                class54.method556((byte) -128);
                class793.field11597 = false;
                return;
            }
            if (arg0 == 5426) {
                field8661 -= 2;
                class550.field8064 = field8654[field8661];
                class325.field5294 = field8654[field8661 + 1];
                return;
            }
            if (arg0 == 5427) {
                field8661 -= 2;
                class514.field7601 = field8654[field8661 + 1];
                return;
            }
            if (arg0 == 5428) {
                field8661 -= 2;
                int var193 = field8654[field8661];
                int var194 = field8654[field8661 + 1];
                field8654[field8661++] = class621.method4538(var194, var193, -114) ? 1 : 0;
                return;
            }
            if (arg0 == 5429) {
                class164.method1543(5, false, false, field8674[--field8663]);
                return;
            }
            if (arg0 == 5430) {
                try {
                    class470.method3617((byte) -110, class476.field7255, field8680[17]);
                    return;
                } catch (Throwable var346) {
                    return;
                }
            }
            if (arg0 == 5431) {
                try {
                    class470.method3617((byte) 5, class476.field7255, field8680[18]);
                    return;
                } catch (Throwable var347) {
                    return;
                }
            }
            if (arg0 == 5432) {
                String var195 = "";
                if (class494.field7432 != null) {
                    Transferable var196 = class494.field7432.getContents(null);
                    if (var196 != null) {
                        try {
                            var195 = (String) var196.getTransferData(DataFlavor.stringFlavor);
                            if (var195 == null) {
                                var195 = "";
                            }
                        } catch (Exception var348) {
                        }
                    }
                }
                field8674[field8663++] = var195;
                return;
            }
            if (arg0 == 5433) {
                class719.field10523 = field8654[--field8661];
                return;
            }
            if (arg0 == 5435) {
                field8654[field8661++] = class40.field466 ? 1 : 0;
                return;
            }
            if (arg0 == 5436) {
                if (class372.field6038.field11025 < 6) {
                    field8654[field8661++] = 0;
                    return;
                }
                if (class372.field6038.field11025 == 6 && class372.field6038.field11004 < 10) {
                    field8654[field8661++] = 0;
                    return;
                }
                field8654[field8661++] = 1;
                return;
            }
        } else if (arg0 < 5600) {
            if (arg0 == 5500) {
                field8661 -= 4;
                int var197 = field8654[field8661];
                int var198 = field8654[field8661 + 1];
                int var199 = field8654[field8661 + 2];
                int var200 = field8654[field8661 + 3];
                class302.method2600(var198 << 2, false, var200, var199, (byte) 72, (var197 & 0x3FFF) - class141.field2011, (var197 >> 14 & 0x3FFF) - class397.field6289);
                return;
            }
            if (arg0 == 5501) {
                field8661 -= 4;
                int var201 = field8654[field8661];
                int var202 = field8654[field8661 + 1];
                int var203 = field8654[field8661 + 2];
                int var204 = field8654[field8661 + 3];
                class581.method4266(var204, 115, var203, var202 << 2, (var201 & 0x3FFF) - class141.field2011, (var201 >> 14 & 0x3FFF) - class397.field6289);
                return;
            }
            if (arg0 == 5502) {
                field8661 -= 6;
                int var205 = field8654[field8661];
                if (var205 >= 2) {
                    throw new RuntimeException();
                }
                class497.field7466 = var205;
                int var206 = field8654[field8661 + 1];
                if (var206 + 1 >= class665.field9470[class497.field7466].length >> 1) {
                    throw new RuntimeException();
                }
                class612.field8802 = var206;
                class172.field2759 = 0;
                class26.field284 = field8654[field8661 + 2];
                class795.field11622 = field8654[field8661 + 3];
                int var207 = field8654[field8661 + 4];
                if (var207 >= 2) {
                    throw new RuntimeException();
                }
                class233.field3611 = var207;
                int var208 = field8654[field8661 + 5];
                if (var208 + 1 >= class665.field9470[class233.field3611].length >> 1) {
                    throw new RuntimeException();
                }
                class344.field5598 = var208;
                class401.field6334 = 3;
                class210.field3323 = -1;
                class344.field5593 = -1;
                return;
            }
            if (arg0 == 5503) {
                class161.method1513((byte) 50);
                return;
            }
            if (arg0 == 5504) {
                field8661 -= 2;
                class37.method366(3, field8654[field8661 + 1], field8654[field8661], 0);
                return;
            }
            if (arg0 == 5505) {
                field8654[field8661++] = (int) class418.field6612 >> 3;
                return;
            }
            if (arg0 == 5506) {
                field8654[field8661++] = (int) class29.field293 >> 3;
                return;
            }
            if (arg0 == 5507) {
                class248.method2122(93);
                return;
            }
            if (arg0 == 5508) {
                class615.method4477(45);
                return;
            }
            if (arg0 == 5509) {
                class653.method4756((byte) -40);
                return;
            }
            if (arg0 == 5510) {
                class495.method3740(true);
                return;
            }
            if (arg0 == 5511) {
                int var209 = field8654[--field8661];
                int var210 = var209 >> 14 & 0x3FFF;
                int var211 = var209 & 0x3FFF;
                int var212 = var210 - class397.field6289;
                if (var212 < 0) {
                    var212 = 0;
                } else if (var212 >= class126.field1823) {
                    var212 = class126.field1823;
                }
                int var213 = var211 - class141.field2011;
                if (var213 < 0) {
                    var213 = 0;
                } else if (var213 >= class169.field2725) {
                    var213 = class169.field2725;
                }
                class537.field7887 = (var212 << 9) + 256;
                class505.field7560 = (var213 << 9) + 256;
                class401.field6334 = 4;
                class210.field3323 = -1;
                class344.field5593 = -1;
                return;
            }
            if (arg0 == 5512) {
                class393.method3192((byte) 8);
                return;
            }
            if (arg0 == 5514) {
                class547.field8037 = field8654[--field8661];
                return;
            }
            if (arg0 == 5516) {
                field8654[field8661++] = class547.field8037;
                return;
            }
            if (arg0 == 5517) {
                int var214 = field8654[--field8661];
                if (var214 == -1) {
                    int var215 = var214 >> 14 & 0x3FFF;
                    int var216 = var214 & 0x3FFF;
                    int var217 = var215 - class397.field6289;
                    if (var217 < 0) {
                        var217 = 0;
                    } else if (var217 >= class126.field1823) {
                        var217 = class126.field1823;
                    }
                    int var218 = var216 - class141.field2011;
                    if (var218 < 0) {
                        var218 = 0;
                    } else if (var218 >= class169.field2725) {
                        var218 = class169.field2725;
                    }
                    class344.field5593 = (var217 << 9) + 256;
                    class210.field3323 = (var218 << 9) + 256;
                    return;
                }
                class344.field5593 = -1;
                class210.field3323 = -1;
                return;
            }
        } else if (arg0 < 5700) {
            if (arg0 == 5600) {
                field8663 -= 2;
                String var219 = field8674[field8663];
                String var220 = field8674[field8663 + 1];
                int var221 = field8654[--field8661];
                class615.method4472(-15354, var221, var220, var219);
                return;
            }
            if (arg0 == 5601) {
                class746.method5426(10);
                return;
            }
            if (arg0 == 5602) {
                if (!class73.method764((byte) -15)) {
                    class697.method5067(19653);
                }
                return;
            }
            if (arg0 == 5604) {
                field8663--;
                if (class315.field5127 != 3) {
                    return;
                }
                if (!class73.method764((byte) -15) && class494.field7431 == 0) {
                    class97.method932(field8674[field8663], 0);
                    return;
                }
                return;
            }
            if (arg0 == 5605) {
                field8663 -= 2;
                field8661 -= 2;
                if (class315.field5127 != 3) {
                    return;
                }
                if (!class73.method764((byte) -15) && class494.field7431 == 0) {
                    class352.method2926(field8654[field8661], field8674[field8663 + 1], field8674[field8663], field8654[field8661 + 1] == 1, (byte) 126);
                    return;
                }
                return;
            }
            if (arg0 == 5606) {
                if (class494.field7431 == 0) {
                    class268.field4323 = -2;
                }
                return;
            }
            if (arg0 == 5607) {
                field8654[field8661++] = class632.field9086;
                return;
            }
            if (arg0 == 5608) {
                field8654[field8661++] = class293.field4705;
                return;
            }
            if (arg0 == 5609) {
                field8654[field8661++] = class268.field4323;
                return;
            }
            if (arg0 == 5611) {
                field8654[field8661++] = class539.field7917;
                return;
            }
            if (arg0 == 5612) {
                int var222 = field8654[--field8661];
                class142.method1322(var222, 103);
                return;
            }
            if (arg0 == 5613) {
                field8654[field8661++] = class632.field9086;
                return;
            }
            if (arg0 == 5615) {
                field8663 -= 2;
                String var223 = field8674[field8663];
                String var224 = field8674[field8663 + 1];
                class597.method4369(var223, var224, false);
                return;
            }
            if (arg0 == 5616) {
                class311.method2673(false, false);
                return;
            }
            if (arg0 == 5617) {
                field8654[field8661++] = class223.field3502;
                return;
            }
            if (arg0 == 5618) {
                field8661--;
                return;
            }
            if (arg0 == 5619) {
                field8661--;
                return;
            }
            if (arg0 == 5620) {
                field8654[field8661++] = 0;
                return;
            }
            if (arg0 == 5621) {
                field8663 -= 2;
                field8661 -= 2;
                return;
            }
            if (arg0 == 5622) {
                return;
            }
            if (arg0 == 5623) {
                if (class210.field3329 != null) {
                    field8654[field8661++] = 1;
                    return;
                }
                field8654[field8661++] = 0;
                return;
            }
            if (arg0 == 5624) {
                field8654[field8661++] = (int) (class596.field8629 >> 32);
                field8654[field8661++] = (int) (class596.field8629 & 0xFFFFFFFFFFFFFFFFL);
                return;
            }
            if (arg0 == 5625) {
                field8654[field8661++] = class755.field11106 ? 1 : 0;
                return;
            }
            if (arg0 == 5626) {
                class755.field11106 = true;
                class338.method2849(false);
                return;
            }
            if (arg0 == 5627) {
                field8654[field8661++] = class653.field9353;
                field8654[field8661++] = class338.field5507;
                class653.field9353 = -2;
                class338.field5507 = -1;
                return;
            }
            if (arg0 == 5628) {
                field8654[field8661++] = class73.method764((byte) -15) ? 1 : 0;
                return;
            }
            if (arg0 == 5629) {
                field8654[field8661++] = class705.field10118;
                return;
            }
            if (arg0 == 5630) {
                class151.method1370((byte) -124);
                return;
            }
            if (arg0 == 5631) {
                field8661 -= 2;
                int var225 = field8654[field8661];
                int var226 = field8654[field8661 + 1];
                class685.method4992(var226, var225, (byte) 36);
                return;
            }
            if (arg0 == 5632) {
                int var227 = field8654[--field8661];
                class388.method3159((byte) -128, var227);
                return;
            }
        } else if (arg0 < 6100) {
            if (arg0 == 6001) {
                int var228 = field8654[--field8661];
                class623.field8996.method3244(22733, class623.field8996.field6368, var228);
                class191.method1776(-10464);
                class574.method4222((byte) -113);
                class746.field10999 = false;
                return;
            }
            if (arg0 == 6002) {
                boolean var229 = field8654[--field8661] == 1;
                class623.field8996.method3244(22733, class623.field8996.field6397, var229 ? 1 : 0);
                class623.field8996.method3244(22733, class623.field8996.field6356, var229 ? 1 : 0);
                class191.method1776(-10464);
                class716.method5186(2);
                class574.method4222((byte) -87);
                class746.field10999 = false;
                return;
            }
            if (arg0 == 6003) {
                boolean var230 = field8654[--field8661] == 1;
                class623.field8996.method3244(22733, class623.field8996.field6362, var230 ? 2 : 1);
                class623.field8996.method3244(22733, class623.field8996.field6384, var230 ? 2 : 1);
                class716.method5186(2);
                class574.method4222((byte) -72);
                class746.field10999 = false;
                return;
            }
            if (arg0 == 6005) {
                class623.field8996.method3244(22733, class623.field8996.field6371, field8654[--field8661] == 1 ? 1 : 0);
                class191.method1776(-10464);
                class574.method4222((byte) -72);
                class746.field10999 = false;
                return;
            }
            if (arg0 == 6007) {
                class623.field8996.method3244(22733, class623.field8996.field6365, field8654[--field8661]);
                class574.method4222((byte) -115);
                class746.field10999 = false;
                return;
            }
            if (arg0 == 6008) {
                class623.field8996.method3244(22733, class623.field8996.field6373, field8654[--field8661] == 1 ? 1 : 0);
                class574.method4222((byte) 49);
                class746.field10999 = false;
                return;
            }
            if (arg0 == 6010) {
                class623.field8996.method3244(22733, class623.field8996.field6394, field8654[--field8661] == 1 ? 1 : 0);
                class574.method4222((byte) -102);
                class746.field10999 = false;
                return;
            }
            if (arg0 == 6011) {
                class623.field8996.method3244(22733, class623.field8996.field6381, field8654[--field8661]);
                class191.method1776(-10464);
                class574.method4222((byte) -115);
                class746.field10999 = false;
                return;
            }
            if (arg0 == 6012) {
                class623.field8996.method3244(22733, class623.field8996.field6400, field8654[--field8661] == 1 ? 1 : 0);
                class181.method1710((byte) 62);
                class262.method2282(true);
                class574.method4222((byte) -114);
                class746.field10999 = false;
                return;
            }
            if (arg0 == 6014) {
                class623.field8996.method3244(22733, class623.field8996.field6374, field8654[--field8661] == 1 ? 2 : 0);
                class191.method1776(-10464);
                class574.method4222((byte) -124);
                class746.field10999 = false;
                return;
            }
            if (arg0 == 6015) {
                class623.field8996.method3244(22733, class623.field8996.field6375, field8654[--field8661] == 1 ? 1 : 0);
                class191.method1776(-10464);
                class574.method4222((byte) 58);
                class746.field10999 = false;
                return;
            }
            if (arg0 == 6016) {
                class623.field8996.method3244(22733, class623.field8996.field6352, field8654[--field8661]);
                class679.method4942(false, (byte) -97, class623.field8996.field6379.method4132(true));
                class574.method4222((byte) 96);
                return;
            }
            if (arg0 == 6017) {
                class623.field8996.method3244(22733, class623.field8996.field6389, field8654[--field8661] == 1 ? 1 : 0);
                class356.method2952(0);
                class574.method4222((byte) 64);
                class746.field10999 = false;
                return;
            }
            if (arg0 == 6018) {
                class623.field8996.method3244(22733, class623.field8996.field6358, field8654[--field8661]);
                class574.method4222((byte) 62);
                class746.field10999 = false;
                return;
            }
            if (arg0 == 6019) {
                int var231 = field8654[--field8661];
                int var232 = class623.field8996.field6395.method4796(true);
                if (var231 != var232) {
                    if (class796.method5717(class315.field5127, (byte) -124)) {
                        if (var232 == 0 && class588.field8526 != -1) {
                            class347.method2901(false, class747.field11028, (byte) -53, class588.field8526, 0, var231);
                            class201.method1831((byte) -72);
                            class127.field1835 = false;
                        } else if (var231 == 0) {
                            class290.method2444((byte) 96);
                            class127.field1835 = false;
                        } else {
                            class718.method5217(true, var231);
                        }
                    }
                    class623.field8996.method3244(22733, class623.field8996.field6395, var231);
                    class574.method4222((byte) 51);
                    class746.field10999 = false;
                }
                return;
            }
            if (arg0 == 6020) {
                class623.field8996.method3244(22733, class623.field8996.field6367, field8654[--field8661]);
                class574.method4222((byte) 103);
                class746.field10999 = false;
                return;
            }
            if (arg0 == 6021) {
                int var233 = class623.field8996.field6362.method5351(true);
                class623.field8996.method3244(22733, class623.field8996.field6384, field8654[--field8661] == 1 ? 0 : var233);
                class716.method5186(2);
                return;
            }
            if (arg0 == 6023) {
                int var234 = field8654[--field8661];
                class623.field8996.method3244(22733, class623.field8996.field6385, var234);
                class574.method4222((byte) 79);
                class746.field10999 = false;
                return;
            }
            if (arg0 == 6024) {
                class623.field8996.method3244(22733, class623.field8996.field6364, field8654[--field8661]);
                class574.method4222((byte) -96);
                return;
            }
            if (arg0 == 6025) {
                class623.field8996.method3244(22733, class623.field8996.field6404, field8654[--field8661]);
                class574.method4222((byte) 85);
                class746.field10999 = false;
                return;
            }
            if (arg0 == 6027) {
                int var235 = field8654[--field8661];
                if (var235 < 0 || var235 > 1) {
                    var235 = 0;
                }
                class410.method3288(var235 == 1, (byte) -55);
                return;
            }
            if (arg0 == 6028) {
                class623.field8996.method3244(22733, class623.field8996.field6377, field8654[--field8661] == 0 ? 0 : 1);
                class574.method4222((byte) -102);
                return;
            }
            if (arg0 == 6029) {
                class623.field8996.method3244(22733, class623.field8996.field6365, field8654[--field8661]);
                class574.method4222((byte) -91);
                return;
            }
            if (arg0 == 6030) {
                class623.field8996.method3244(22733, class623.field8996.field6357, field8654[--field8661] == 0 ? 0 : 1);
                class574.method4222((byte) -111);
                class191.method1776(-10464);
                return;
            }
            if (arg0 == 6031) {
                int var236 = field8654[--field8661];
                if (var236 < 0 || var236 > 5) {
                    var236 = 2;
                }
                class679.method4942(false, (byte) -119, var236);
                return;
            }
            if (arg0 == 6032) {
                field8661 -= 2;
                int var237 = field8654[field8661];
                boolean var238 = field8654[field8661 + 1] == 1;
                class623.field8996.method3244(22733, class623.field8996.field6378, var237);
                if (!var238) {
                    class623.field8996.method3244(22733, class623.field8996.field6388, 0);
                }
                class574.method4222((byte) -110);
                class746.field10999 = false;
                return;
            }
            if (arg0 == 6033) {
                class623.field8996.method3244(22733, class623.field8996.field6359, field8654[--field8661]);
                class574.method4222((byte) 68);
                return;
            }
            if (arg0 == 6034) {
                class623.field8996.method3244(22733, class623.field8996.field6363, field8654[--field8661] == 1 ? 1 : 0);
                class574.method4222((byte) -81);
                class181.method1710((byte) 36);
                class746.field10999 = false;
                return;
            }
            if (arg0 == 6035) {
                int var239 = class623.field8996.field6397.method4838(true);
                class623.field8996.method3244(22733, class623.field8996.field6356, field8654[--field8661] == 1 ? 1 : var239);
                class191.method1776(-10464);
                class716.method5186(2);
                return;
            }
            if (arg0 == 6036) {
                class623.field8996.method3244(22733, class623.field8996.field6383, field8654[--field8661]);
                class574.method4222((byte) 92);
                class550.field8069 = true;
                return;
            }
            if (arg0 == 6037) {
                class623.field8996.method3244(22733, class623.field8996.field6354, field8654[--field8661]);
                class574.method4222((byte) 53);
                class746.field10999 = false;
                return;
            }
            if (arg0 == 6038) {
                int var240 = field8654[--field8661];
                int var241 = class623.field8996.field6401.method4796(true);
                if (var240 != var241 && class588.field8526 == class10.field115) {
                    if (!class796.method5717(class315.field5127, (byte) -124)) {
                        if (var241 == 0) {
                            class347.method2901(false, class747.field11028, (byte) 123, class588.field8526, 0, var240);
                            class201.method1831((byte) -109);
                            class127.field1835 = false;
                        } else if (var240 == 0) {
                            class290.method2444((byte) 96);
                            class127.field1835 = false;
                        } else {
                            class718.method5217(true, var240);
                        }
                    }
                    class623.field8996.method3244(22733, class623.field8996.field6401, var240);
                    class574.method4222((byte) -121);
                    class746.field10999 = false;
                }
                return;
            }
            if (arg0 == 6039) {
                int var242 = field8654[--field8661];
                if (var242 > 255 || var242 < 0) {
                    var242 = 0;
                }
                if (var242 != class623.field8996.field6382.method2118(true)) {
                    class623.field8996.method3244(22733, class623.field8996.field6382, var242);
                    class574.method4222((byte) -82);
                    class746.field10999 = false;
                }
                return;
            }
            if (arg0 == 6040) {
                int var243 = field8654[--field8661];
                if (var243 != class623.field8996.field6366.method4750(true)) {
                    class623.field8996.method3244(22733, class623.field8996.field6366, var243);
                    class574.method4222((byte) 77);
                    class746.field10999 = false;
                    class44.method452(1);
                }
                return;
            }
        } else if (arg0 < 6200) {
            if (arg0 == 6101) {
                field8654[field8661++] = class623.field8996.field6368.method1690(true);
                return;
            }
            if (arg0 == 6102) {
                field8654[field8661++] = class623.field8996.field6397.method4838(true) == 1 ? 1 : 0;
                return;
            }
            if (arg0 == 6103) {
                field8654[field8661++] = class623.field8996.field6362.method5351(true) == 2 ? 1 : 0;
                return;
            }
            if (arg0 == 6105) {
                field8654[field8661++] = class623.field8996.field6371.method3911(true) == 1 ? 1 : 0;
                return;
            }
            if (arg0 == 6107) {
                field8654[field8661++] = class623.field8996.field6365.method3119(true);
                return;
            }
            if (arg0 == 6108) {
                field8654[field8661++] = class623.field8996.field6373.method5657(true) == 1 ? 1 : 0;
                return;
            }
            if (arg0 == 6110) {
                field8654[field8661++] = class623.field8996.field6394.method3019(true) == 1 ? 1 : 0;
                return;
            }
            if (arg0 == 6111) {
                field8654[field8661++] = class623.field8996.field6381.method2920(true);
                return;
            }
            if (arg0 == 6112) {
                field8654[field8661++] = class623.field8996.field6400.method4643(true) == 1 ? 1 : 0;
                return;
            }
            if (arg0 == 6114) {
                field8654[field8661++] = class623.field8996.field6374.method1345(true) == 2 ? 1 : 0;
                return;
            }
            if (arg0 == 6115) {
                field8654[field8661++] = class623.field8996.field6375.method3507(true) == 1 ? 1 : 0;
                return;
            }
            if (arg0 == 6116) {
                field8654[field8661++] = class623.field8996.field6352.method3687(true);
                return;
            }
            if (arg0 == 6117) {
                field8654[field8661++] = class623.field8996.field6389.method5170(true) == 1 ? 1 : 0;
                return;
            }
            if (arg0 == 6118) {
                field8654[field8661++] = class623.field8996.field6358.method4796(true);
                return;
            }
            if (arg0 == 6119) {
                field8654[field8661++] = class623.field8996.field6395.method4796(true);
                return;
            }
            if (arg0 == 6120) {
                field8654[field8661++] = class623.field8996.field6367.method4796(true);
                return;
            }
            if (arg0 == 6123) {
                field8654[field8661++] = class781.method5608(-19025);
                return;
            }
            if (arg0 == 6124) {
                field8654[field8661++] = class623.field8996.field6364.method3687(true);
                return;
            }
            if (arg0 == 6125) {
                field8654[field8661++] = class623.field8996.field6404.method3711(true);
                return;
            }
            if (arg0 == 6127) {
                field8654[field8661++] = class623.field8996.field6351.method2935(true) == 1 ? 1 : 0;
                return;
            }
            if (arg0 == 6128) {
                field8654[field8661++] = class623.field8996.field6377.method5503(true) == 1 ? 1 : 0;
                return;
            }
            if (arg0 == 6129) {
                field8654[field8661++] = class623.field8996.field6365.method3119(true);
                return;
            }
            if (arg0 == 6130) {
                field8654[field8661++] = class623.field8996.field6357.method4221(true) == 1 ? 1 : 0;
                return;
            }
            if (arg0 == 6131) {
                field8654[field8661++] = class623.field8996.field6379.method4132(true);
                return;
            }
            if (arg0 == 6132) {
                field8654[field8661++] = class623.field8996.field6378.method4132(true);
                return;
            }
            if (arg0 == 6133) {
                field8654[field8661++] = class393.field6256.field806 && !class393.field6256.field808 ? 1 : 0;
                return;
            }
            if (arg0 == 6135) {
                field8654[field8661++] = class623.field8996.field6359.method2045(true);
                return;
            }
            if (arg0 == 6136) {
                field8654[field8661++] = class623.field8996.field6363.method1140(true) == 1 ? 1 : 0;
                return;
            }
            if (arg0 == 6138) {
                field8654[field8661++] = class496.method3746(200, (byte) 89, class623.field8996.field6379.method4132(true));
                return;
            }
            if (arg0 == 6139) {
                field8654[field8661++] = class623.field8996.field6383.method1248(true);
                return;
            }
            if (arg0 == 6142) {
                field8654[field8661++] = class623.field8996.field6354.method4796(true);
                return;
            }
            if (arg0 == 6143) {
                field8654[field8661++] = class623.field8996.field6401.method4796(true);
                return;
            }
            if (arg0 == 6144) {
                field8654[field8661++] = class494.field7428 ? 1 : 0;
                return;
            }
            if (arg0 == 6145) {
                field8654[field8661++] = class623.field8996.field6382.method2118(true);
                return;
            }
            if (arg0 == 6146) {
                field8654[field8661++] = class623.field8996.field6366.method4750(true);
                return;
            }
            if (arg0 == 6147) {
                field8654[field8661++] = class372.field6038.field11008 < 512 || class494.field7428 || class554.field8108 ? 1 : 0;
                return;
            }
            if (arg0 == 6148) {
                field8654[field8661++] = class213.field3368 ? 1 : 0;
                return;
            }
        } else if (arg0 < 6300) {
            if (arg0 == 6200) {
                field8661 -= 2;
                class316.field5144 = (short) field8654[field8661];
                if (class316.field5144 <= 0) {
                    class316.field5144 = 256;
                }
                class172.field2752 = (short) field8654[field8661 + 1];
                if (class172.field2752 <= 0) {
                    class172.field2752 = 205;
                }
                return;
            }
            if (arg0 == 6201) {
                field8661 -= 2;
                class274.field4400 = (short) field8654[field8661];
                if (class274.field4400 <= 0) {
                    class274.field4400 = 256;
                }
                class112.field1572 = (short) field8654[field8661 + 1];
                if (class112.field1572 <= 0) {
                    class112.field1572 = 320;
                }
                return;
            }
            if (arg0 == 6202) {
                field8661 -= 4;
                class313.field5121 = (short) field8654[field8661];
                if (class313.field5121 <= 0) {
                    class313.field5121 = 1;
                }
                class761.field11183 = (short) field8654[field8661 + 1];
                if (class761.field11183 <= 0) {
                    class761.field11183 = 32767;
                } else if (class761.field11183 < class313.field5121) {
                    class761.field11183 = class313.field5121;
                }
                class400.field6322 = (short) field8654[field8661 + 2];
                if (class400.field6322 <= 0) {
                    class400.field6322 = 1;
                }
                class702.field10084 = (short) field8654[field8661 + 3];
                if (class702.field10084 <= 0) {
                    class702.field10084 = 32767;
                    return;
                }
                if (class702.field10084 < class400.field6322) {
                    class702.field10084 = class400.field6322;
                }
                return;
            }
            if (arg0 == 6203) {
                class625.method4560(class513.field7591.field9797, 100, false, 0, class513.field7591.field9777, 0);
                field8654[field8661++] = class361.field5823;
                field8654[field8661++] = class672.field9542;
                return;
            }
            if (arg0 == 6204) {
                field8654[field8661++] = class274.field4400;
                field8654[field8661++] = class112.field1572;
                return;
            }
            if (arg0 == 6205) {
                field8654[field8661++] = class316.field5144;
                field8654[field8661++] = class172.field2752;
                return;
            }
        } else if (arg0 < 6400) {
            if (arg0 == 6300) {
                field8654[field8661++] = (int) (class712.method5167(-2334) / 60000L);
                return;
            }
            if (arg0 == 6301) {
                field8654[field8661++] = (int) (class712.method5167(-2334) / 86400000L) - 11745;
                return;
            }
            if (arg0 == 6302) {
                field8661 -= 3;
                int var244 = field8654[field8661];
                int var245 = field8654[field8661 + 1];
                int var246 = field8654[field8661 + 2];
                long var247 = class477.method3647(0, var244, 12, var246, 0, var245, 4096);
                int var249 = class644.method4666(var247, 0);
                if (var246 < 1970) {
                    var249--;
                }
                field8654[field8661++] = var249;
                return;
            }
            if (arg0 == 6303) {
                field8654[field8661++] = class709.method5153((byte) 78, class712.method5167(-2334));
                return;
            }
            if (arg0 == 6304) {
                int var250 = field8654[--field8661];
                boolean var251 = true;
                if (var250 < 0) {
                    var251 = (var250 + 1) % 4 == 0;
                } else if (var250 < 1582) {
                    var251 = var250 % 4 == 0;
                } else if (var250 % 4 != 0) {
                    var251 = false;
                } else if (var250 % 100 != 0) {
                    var251 = true;
                } else if (var250 % 400 != 0) {
                    var251 = false;
                }
                field8654[field8661++] = var251 ? 1 : 0;
                return;
            }
            if (arg0 == 6305) {
                int var252 = field8654[--field8661];
                int[] var253 = class751.method5449(var252, 2);
                class405.method3262(var253, 0, field8654, field8661, 3);
                field8661 += 3;
                return;
            }
            if (arg0 == 6306) {
                int var254 = field8654[--field8661];
                field8654[field8661++] = (int) (class240.method2066(-1, var254) / 60000L);
                return;
            }
        } else if (arg0 < 6500) {
            if (arg0 == 6405) {
                field8654[field8661++] = class537.method4007(-21) ? 1 : 0;
                return;
            }
            if (arg0 == 6406) {
                field8654[field8661++] = class163.method1533(-2) ? 1 : 0;
                return;
            }
        } else if (arg0 < 6600) {
            if (arg0 == 6500) {
                if (class315.field5127 == 7 && !class73.method764((byte) -15) && class494.field7431 == 0) {
                    if (class401.field6333) {
                        field8654[field8661++] = 0;
                        return;
                    }
                    if (class369.field5988 > class712.method5167(-2334) - 1000L) {
                        field8654[field8661++] = 1;
                        return;
                    }
                    class401.field6333 = true;
                    class487 var255 = class618.method4519(55, class456.field7039, class185.field2943.field2659);
                    var255.field7362.method1641((byte) -108, class771.field11309);
                    class185.field2943.method1546(var255, 1);
                    field8654[field8661++] = 0;
                    return;
                }
                field8654[field8661++] = 1;
                return;
            }
            if (arg0 == 6501) {
                class139 var256 = class410.method3289(1);
                if (var256 != null) {
                    field8654[field8661++] = var256.field1949;
                    field8654[field8661++] = var256.field5435;
                    field8674[field8663++] = var256.field1945;
                    class180 var257 = var256.method1290((byte) -62);
                    field8654[field8661++] = var257.field2879;
                    field8674[field8663++] = var257.field2882;
                    field8654[field8661++] = var256.field5434;
                    field8654[field8661++] = var256.field1950;
                    field8674[field8663++] = var256.field1948;
                    return;
                }
                field8654[field8661++] = -1;
                field8654[field8661++] = 0;
                field8674[field8663++] = "";
                field8654[field8661++] = 0;
                field8674[field8663++] = "";
                field8654[field8661++] = 0;
                field8654[field8661++] = 0;
                field8674[field8663++] = "";
                return;
            }
            if (arg0 == 6502) {
                class139 var258 = class634.method4600((byte) 109);
                if (var258 != null) {
                    field8654[field8661++] = var258.field1949;
                    field8654[field8661++] = var258.field5435;
                    field8674[field8663++] = var258.field1945;
                    class180 var259 = var258.method1290((byte) -60);
                    field8654[field8661++] = var259.field2879;
                    field8674[field8663++] = var259.field2882;
                    field8654[field8661++] = var258.field5434;
                    field8654[field8661++] = var258.field1950;
                    field8674[field8663++] = var258.field1948;
                    return;
                }
                field8654[field8661++] = -1;
                field8654[field8661++] = 0;
                field8674[field8663++] = "";
                field8654[field8661++] = 0;
                field8674[field8663++] = "";
                field8654[field8661++] = 0;
                field8654[field8661++] = 0;
                field8674[field8663++] = "";
                return;
            }
            if (arg0 == 6503) {
                int var260 = field8654[--field8661];
                String var261 = field8674[--field8663];
                if (class315.field5127 == 7 && !class73.method764((byte) -15) && class494.field7431 == 0) {
                    field8654[field8661++] = class430.method3406(var261, 13, var260) ? 1 : 0;
                    return;
                }
                field8654[field8661++] = 0;
                return;
            }
            if (arg0 == 6506) {
                int var262 = field8654[--field8661];
                class139 var263 = class262.method2285(var262, 2);
                if (var263 != null) {
                    field8654[field8661++] = var263.field5435;
                    field8674[field8663++] = var263.field1945;
                    class180 var264 = var263.method1290((byte) -72);
                    field8654[field8661++] = var264.field2879;
                    field8674[field8663++] = var264.field2882;
                    field8654[field8661++] = var263.field5434;
                    field8654[field8661++] = var263.field1950;
                    field8674[field8663++] = var263.field1948;
                    return;
                }
                field8654[field8661++] = -1;
                field8674[field8663++] = "";
                field8654[field8661++] = 0;
                field8674[field8663++] = "";
                field8654[field8661++] = 0;
                field8654[field8661++] = 0;
                field8674[field8663++] = "";
                return;
            }
            if (arg0 == 6507) {
                field8661 -= 4;
                int var265 = field8654[field8661];
                boolean var266 = field8654[field8661 + 1] == 1;
                int var267 = field8654[field8661 + 2];
                boolean var268 = field8654[field8661 + 3] == 1;
                class693.method5033(var266, (byte) 93, var267, var268, var265);
                return;
            }
            if (arg0 == 6508) {
                class355.method2940(-30516);
                return;
            }
            if (arg0 == 6509) {
                if (class315.field5127 != 7) {
                    return;
                }
                class666.field9479 = field8654[--field8661] == 1;
                return;
            }
            if (arg0 == 6510) {
                field8654[field8661++] = class787.field11503;
                return;
            }
        } else if (arg0 >= 6700) {
            if (arg0 < 6800 && class464.field7127 == class262.field4272) {
                if (arg0 == 6700) {
                    int var269 = class632.field9082.method733((byte) 38);
                    if (class317.field5175 != -1) {
                        var269++;
                    }
                    field8654[field8661++] = var269;
                    return;
                }
                if (arg0 == 6701) {
                    int var270 = field8654[--field8661];
                    if (class317.field5175 != -1) {
                        if (var270 == 0) {
                            field8654[field8661++] = class317.field5175;
                            return;
                        }
                        var270--;
                    }
                    class23 var271 = (class23) class632.field9082.method735(0);
                    while (var270-- > 0) {
                        var271 = (class23) class632.field9082.method734((byte) -50);
                    }
                    field8654[field8661++] = var271.field219;
                    return;
                }
                if (arg0 == 6702) {
                    int var272 = field8654[--field8661];
                    if (class309.field5028[var272] == null) {
                        field8674[field8663++] = "";
                        return;
                    }
                    String var273 = class309.field5028[var272][0].field9760;
                    if (var273 == null) {
                        field8674[field8663++] = "";
                        return;
                    }
                    field8674[field8663++] = var273.substring(0, var273.indexOf(58));
                    return;
                }
                if (arg0 == 6703) {
                    int var274 = field8654[--field8661];
                    if (class309.field5028[var274] == null) {
                        field8654[field8661++] = 0;
                        return;
                    }
                    field8654[field8661++] = class309.field5028[var274].length;
                    return;
                }
                if (arg0 == 6704) {
                    field8661 -= 2;
                    int var275 = field8654[field8661];
                    int var276 = field8654[field8661 + 1];
                    if (class309.field5028[var275] == null) {
                        field8674[field8663++] = "";
                        return;
                    }
                    String var277 = class309.field5028[var275][var276].field9760;
                    if (var277 == null) {
                        field8674[field8663++] = "";
                        return;
                    }
                    field8674[field8663++] = var277;
                    return;
                }
                if (arg0 == 6705) {
                    field8661 -= 2;
                    int var278 = field8654[field8661];
                    int var279 = field8654[field8661 + 1];
                    if (class309.field5028[var278] == null) {
                        field8654[field8661++] = 0;
                        return;
                    }
                    field8654[field8661++] = class309.field5028[var278][var279].field9853;
                    return;
                }
                if (arg0 == 6706) {
                    return;
                }
                if (arg0 == 6707) {
                    field8661 -= 3;
                    int var280 = field8654[field8661];
                    int var281 = field8654[field8661 + 1];
                    int var282 = field8654[field8661 + 2];
                    class115.method1144(1, "", var280 << 16 | var281, -55, var282);
                    return;
                }
                if (arg0 == 6708) {
                    field8661 -= 3;
                    int var283 = field8654[field8661];
                    int var284 = field8654[field8661 + 1];
                    int var285 = field8654[field8661 + 2];
                    class115.method1144(2, "", var283 << 16 | var284, -27, var285);
                    return;
                }
                if (arg0 == 6709) {
                    field8661 -= 3;
                    int var286 = field8654[field8661];
                    int var287 = field8654[field8661 + 1];
                    int var288 = field8654[field8661 + 2];
                    class115.method1144(3, "", var286 << 16 | var287, -108, var288);
                    return;
                }
                if (arg0 == 6710) {
                    field8661 -= 3;
                    int var289 = field8654[field8661];
                    int var290 = field8654[field8661 + 1];
                    int var291 = field8654[field8661 + 2];
                    class115.method1144(4, "", var289 << 16 | var290, -127, var291);
                    return;
                }
                if (arg0 == 6711) {
                    field8661 -= 3;
                    int var292 = field8654[field8661];
                    int var293 = field8654[field8661 + 1];
                    int var294 = field8654[field8661 + 2];
                    class115.method1144(5, "", var292 << 16 | var293, -107, var294);
                    return;
                }
                if (arg0 == 6712) {
                    field8661 -= 3;
                    int var295 = field8654[field8661];
                    int var296 = field8654[field8661 + 1];
                    int var297 = field8654[field8661 + 2];
                    class115.method1144(6, "", var295 << 16 | var296, -33, var297);
                    return;
                }
                if (arg0 == 6713) {
                    field8661 -= 3;
                    int var298 = field8654[field8661];
                    int var299 = field8654[field8661 + 1];
                    int var300 = field8654[field8661 + 2];
                    class115.method1144(7, "", var298 << 16 | var299, -35, var300);
                    return;
                }
                if (arg0 == 6714) {
                    field8661 -= 3;
                    int var301 = field8654[field8661];
                    int var302 = field8654[field8661 + 1];
                    int var303 = field8654[field8661 + 2];
                    class115.method1144(8, "", var301 << 16 | var302, -27, var303);
                    return;
                }
                if (arg0 == 6715) {
                    field8661 -= 3;
                    int var304 = field8654[field8661];
                    int var305 = field8654[field8661 + 1];
                    int var306 = field8654[field8661 + 2];
                    class115.method1144(9, "", var304 << 16 | var305, -127, var306);
                    return;
                }
                if (arg0 == 6716) {
                    field8661 -= 3;
                    int var307 = field8654[field8661];
                    int var308 = field8654[field8661 + 1];
                    int var309 = field8654[field8661 + 2];
                    class115.method1144(10, "", var307 << 16 | var308, -86, var309);
                    return;
                }
                if (arg0 == 6717) {
                    field8661 -= 3;
                    int var310 = field8654[field8661];
                    int var311 = field8654[field8661 + 1];
                    int var312 = field8654[field8661 + 2];
                    class683 var313 = class454.method3528(0, var312, var310 << 16 | var311);
                    class318.method2729(22906);
                    class445 var314 = client.method2695(var313);
                    class404.method3242(var313, var314.field6920, 4913, var314.method3481(55));
                    return;
                }
            } else if (arg0 < 6900) {
                if (arg0 == 6800) {
                    int var315 = field8654[--field8661];
                    class209 var316 = class362.field5915.method2325(-2, var315);
                    if (var316.field3282 == null) {
                        field8674[field8663++] = "";
                        return;
                    }
                    field8674[field8663++] = var316.field3282;
                    return;
                }
                if (arg0 == 6801) {
                    int var317 = field8654[--field8661];
                    class209 var318 = class362.field5915.method2325(-2, var317);
                    field8654[field8661++] = var318.field3279;
                    return;
                }
                if (arg0 == 6802) {
                    int var319 = field8654[--field8661];
                    class209 var320 = class362.field5915.method2325(-2, var319);
                    field8654[field8661++] = var320.field3297;
                    return;
                }
                if (arg0 == 6803) {
                    int var321 = field8654[--field8661];
                    class209 var322 = class362.field5915.method2325(-2, var321);
                    field8654[field8661++] = var322.field3274;
                    return;
                }
                if (arg0 == 6804) {
                    field8661 -= 2;
                    int var323 = field8654[field8661];
                    int var324 = field8654[field8661 + 1];
                    class668 var325 = class289.field4655.method97(var324, (byte) 38);
                    if (var325.method4844(1)) {
                        field8674[field8663++] = class362.field5915.method2325(-2, var323).method1888(var324, var325.field9494, (byte) -114);
                        return;
                    }
                    field8654[field8661++] = class362.field5915.method2325(-2, var323).method1892(var324, var325.field9501, (byte) 61);
                    return;
                }
            } else if (arg0 < 7000) {
                if (arg0 == 6900) {
                    field8654[field8661++] = class211.field3348 && !class16.field181 ? 1 : 0;
                    return;
                }
                if (arg0 == 6901) {
                    field8654[field8661++] = (int) (class269.field4331 / 60000L);
                    field8654[field8661++] = (int) ((class269.field4331 - class712.method5167(-2334) - class131.field1861) / 60000L);
                    field8654[field8661++] = class361.field5827 ? 1 : 0;
                    return;
                }
                if (arg0 == 6902) {
                    field8654[field8661++] = class368.field5981;
                    return;
                }
                if (arg0 == 6903) {
                    field8654[field8661++] = class617.field8916;
                    return;
                }
                if (arg0 == 6904) {
                    field8654[field8661++] = class468.field7181;
                    return;
                }
                if (arg0 == 6905) {
                    String var326 = "";
                    if (class757.field11118 != null) {
                        if (class757.field11118.field3407 == null) {
                            var326 = class641.method4645(class757.field11118.field3401, -55);
                        } else {
                            var326 = (String) class757.field11118.field3407;
                        }
                    }
                    field8674[field8663++] = var326;
                    return;
                }
                if (arg0 == 6906) {
                    field8654[field8661++] = class108.field1538;
                    return;
                }
                if (arg0 == 6907) {
                    field8654[field8661++] = class684.field9899;
                    return;
                }
                if (arg0 == 6908) {
                    field8654[field8661++] = class124.field1810;
                    return;
                }
                if (arg0 == 6909) {
                    field8654[field8661++] = class157.field2170 ? 1 : 0;
                    return;
                }
                if (arg0 == 6910) {
                    field8654[field8661++] = class321.field5220;
                    return;
                }
                if (arg0 == 6911) {
                    field8654[field8661++] = class459.field7077;
                    return;
                }
                if (arg0 == 6912) {
                    field8654[field8661++] = class614.field8820;
                    return;
                }
                if (arg0 == 6913) {
                    field8654[field8661++] = class227.field3550;
                    return;
                }
                if (arg0 == 6914) {
                    field8654[field8661++] = class663.field9440 ? 1 : 0;
                    return;
                }
                if (arg0 == 6915) {
                    field8654[field8661++] = class731.field10703;
                    return;
                }
            } else if (arg0 < 7100) {
                if (arg0 == 7000) {
                    int var327 = class690.method5022(-513);
                    field8654[field8661++] = class587.field8510 = class623.field8996.field6379.method4132(true);
                    field8654[field8661++] = var327;
                    class191.method1776(-10464);
                    class574.method4222((byte) 65);
                    class746.field10999 = false;
                    return;
                }
                if (arg0 == 7001) {
                    class502.method3785(11);
                    class191.method1776(-10464);
                    class574.method4222((byte) 106);
                    class746.field10999 = false;
                    return;
                }
                if (arg0 == 7002) {
                    class190.method1764(-2137);
                    class191.method1776(-10464);
                    class574.method4222((byte) 71);
                    class746.field10999 = false;
                    return;
                }
                if (arg0 == 7003) {
                    class752.method5459((byte) -92);
                    class191.method1776(-10464);
                    class574.method4222((byte) 110);
                    class746.field10999 = false;
                    return;
                }
                if (arg0 == 7004) {
                    class360.method2979(true, -101);
                    class191.method1776(-10464);
                    class574.method4222((byte) 99);
                    class746.field10999 = false;
                    return;
                }
                if (arg0 == 7005) {
                    class623.field8996.method3244(22733, class623.field8996.field6388, 0);
                    class574.method4222((byte) -90);
                    class746.field10999 = false;
                    return;
                }
                if (arg0 == 7006) {
                    if (class587.field8510 == 2) {
                        class72.field1013 = true;
                        return;
                    }
                    if (class587.field8510 == 1) {
                        class281.field4574 = true;
                        return;
                    }
                    if (class587.field8510 == 3) {
                        class328.field5386 = true;
                    }
                    return;
                }
                if (arg0 == 7007) {
                    field8654[field8661++] = class623.field8996.field6388.method849(true);
                    return;
                }
            } else if (arg0 < 7200) {
                if (arg0 == 7100) {
                    field8661 -= 2;
                    int var328 = field8654[field8661];
                    int var329 = field8654[field8661 + 1];
                    if (var328 != -1) {
                        if (var329 > 255) {
                            var329 = 255;
                        } else if (var329 < 0) {
                            var329 = 0;
                        }
                        class504.method3801(var329, false, 4096, var328);
                    }
                    return;
                }
                if (arg0 == 7101) {
                    int var330 = field8654[--field8661];
                    if (var330 != -1) {
                        class650.method4741(var330, (byte) 36);
                    }
                    return;
                }
                if (arg0 == 7102) {
                    int var331 = field8654[--field8661];
                    if (var331 != -1) {
                        class366.method3030(-28014, var331);
                    }
                    return;
                }
                if (arg0 == 7103) {
                    field8654[field8661++] = class389.method3167(field8680[15], -109) ? 1 : 0;
                    return;
                }
            } else if (arg0 < 7300) {
                if (arg0 == 7201) {
                    field8654[field8661++] = class623.field8996.field6371.method3913(3) ? 1 : 0;
                    return;
                }
                if (arg0 == 7202) {
                    field8654[field8661++] = class623.field8996.field6394.method3016(3) ? 1 : 0;
                    return;
                }
                if (arg0 == 7203) {
                    field8654[field8661++] = class623.field8996.field6381.method2921(3) ? 1 : 0;
                    return;
                }
                if (arg0 == 7204) {
                    field8654[field8661++] = class623.field8996.field6374.method1349(3) ? 1 : 0;
                    return;
                }
                if (arg0 == 7205) {
                    field8654[field8661++] = class623.field8996.field6364.method3688(3) && class662.field9437.method176() ? 1 : 0;
                    return;
                }
                if (arg0 == 7206) {
                    field8654[field8661++] = class623.field8996.field6385.method3211(3) ? 1 : 0;
                    return;
                }
                if (arg0 == 7207) {
                    field8654[field8661++] = class623.field8996.field6404.method3712(3) ? 1 : 0;
                    return;
                }
                if (arg0 == 7208) {
                    field8654[field8661++] = class623.field8996.field6351.method2936(3) && class662.field9437.method241() ? 1 : 0;
                    return;
                }
                if (arg0 == 7209) {
                    field8654[field8661++] = class623.field8996.field6357.method4218(3) ? 1 : 0;
                    return;
                }
                if (arg0 == 7210) {
                    field8654[field8661++] = class623.field8996.field6363.method1141(3) ? 1 : 0;
                    return;
                }
                if (arg0 == 7211) {
                    field8654[field8661++] = class623.field8996.field6383.method1247(3) ? 1 : 0;
                    return;
                }
                if (arg0 == 7212) {
                    field8654[field8661++] = class623.field8996.field6375.method3505(3) ? 1 : 0;
                    return;
                }
                if (arg0 == 7213) {
                    field8654[field8661++] = class623.field8996.field6366.method4753(3) ? 1 : 0;
                    return;
                }
                if (arg0 == 7214) {
                    field8654[field8661++] = class623.field8996.field6378.method4137(3) ? 1 : 0;
                    return;
                }
            } else if (arg0 < 7400) {
                if (arg0 == 7301) {
                    int var332 = field8654[--field8661];
                    field8654[field8661++] = class623.field8996.field6371.method852(1, var332);
                    return;
                }
                if (arg0 == 7302) {
                    int var333 = field8654[--field8661];
                    field8654[field8661++] = class623.field8996.field6394.method852(1, var333);
                    return;
                }
                if (arg0 == 7303) {
                    int var334 = field8654[--field8661];
                    field8654[field8661++] = class623.field8996.field6381.method852(1, var334);
                    return;
                }
                if (arg0 == 7304) {
                    int var335 = field8654[--field8661];
                    field8654[field8661++] = class623.field8996.field6374.method852(1, var335);
                    return;
                }
                if (arg0 == 7305) {
                    int var336 = field8654[--field8661];
                    if (!class662.field9437.method176()) {
                        field8654[field8661++] = 3;
                        return;
                    }
                    field8654[field8661++] = class623.field8996.field6364.method852(1, var336);
                    return;
                }
                if (arg0 == 7306) {
                    int var337 = field8654[--field8661];
                    field8654[field8661++] = class623.field8996.field6385.method852(1, var337);
                    return;
                }
                if (arg0 == 7307) {
                    int var338 = field8654[--field8661];
                    field8654[field8661++] = class623.field8996.field6404.method852(1, var338);
                    return;
                }
                if (arg0 == 7308) {
                    int var339 = field8654[--field8661];
                    if (!class662.field9437.method241()) {
                        field8654[field8661++] = 3;
                        return;
                    }
                    field8654[field8661++] = class623.field8996.field6351.method852(1, var339);
                    return;
                }
                if (arg0 == 7309) {
                    int var340 = field8654[--field8661];
                    field8654[field8661++] = class623.field8996.field6357.method852(1, var340);
                    return;
                }
                if (arg0 == 7310) {
                    int var341 = field8654[--field8661];
                    field8654[field8661++] = class623.field8996.field6363.method852(1, var341);
                    return;
                }
                if (arg0 == 7311) {
                    int var342 = field8654[--field8661];
                    field8654[field8661++] = class623.field8996.field6383.method852(1, var342);
                    return;
                }
                if (arg0 == 7312) {
                    int var343 = field8654[--field8661];
                    field8654[field8661++] = class623.field8996.field6375.method852(1, var343);
                    return;
                }
                if (arg0 == 7313) {
                    int var344 = field8654[--field8661];
                    field8654[field8661++] = class623.field8996.field6366.method852(1, var344);
                    return;
                }
                if (arg0 == 7314) {
                    int var345 = field8654[--field8661];
                    field8654[field8661++] = class623.field8996.field6378.method852(1, var345);
                    return;
                }
            }
        }
        throw new IllegalStateException(String.valueOf(arg0));
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(Lic;I)V")
    private static final void method4390(class730 arg0, int arg1) {
        Object[] var2 = arg0.field10692;
        int var3 = (Integer) var2[0];
        class88 var4 = class665.method4825(18, var3);
        if (var4 == null) {
            return;
        }
        field8669 = new int[var4.field1314];
        int var5 = 0;
        field8675 = new String[var4.field1318];
        int var6 = 0;
        field8650 = new long[var4.field1315];
        int var7 = 0;
        for (int var8 = 1; var8 < var2.length; var8++) {
            if (var2[var8] instanceof Integer) {
                int var9 = (Integer) var2[var8];
                if (var9 == -2147483647) {
                    var9 = arg0.field10695;
                }
                if (var9 == -2147483646) {
                    var9 = arg0.field10694;
                }
                if (var9 == -2147483645) {
                    var9 = arg0.field10693 == null ? -1 : arg0.field10693.field9774;
                }
                if (var9 == -2147483644) {
                    var9 = arg0.field10696;
                }
                if (var9 == -2147483643) {
                    var9 = arg0.field10693 == null ? -1 : arg0.field10693.field9799;
                }
                if (var9 == -2147483642) {
                    var9 = arg0.field10690 == null ? -1 : arg0.field10690.field9774;
                }
                if (var9 == -2147483641) {
                    var9 = arg0.field10690 == null ? -1 : arg0.field10690.field9799;
                }
                if (var9 == -2147483640) {
                    var9 = arg0.field10685;
                }
                if (var9 == -2147483639) {
                    var9 = arg0.field10686;
                }
                field8669[var5++] = var9;
            } else if (var2[var8] instanceof String) {
                String var10 = (String) var2[var8];
                if (var10.equals(field8680[31])) {
                    var10 = arg0.field10688;
                }
                field8675[var6++] = var10;
            } else if (var2[var8] instanceof Long) {
                long var11 = (Long) var2[var8];
                field8650[var7++] = var11;
            }
        }
        field8677 = arg0.field10689;
        method4381(var4, arg1);
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(I)Ljava/lang/String;")
    private static final String method4391(int arg0) {
        String var1 = field8656.method485(16, class305.field4924.field8482 << 16 | arg0);
        return var1 == null ? "" : var1;
    }

    @OriginalMember(owner = "client!im", name = "c", descriptor = "(I)I")
    private static final int method4392(int arg0) {
        class723 var1 = class46.field518.method3006(arg0, true);
        if (var1 == null) {
            throw new RuntimeException(field8680[30]);
        }
        Integer var2 = field8656.method486(class305.field4924.field8482 << 16 | arg0, 14608);
        if (var2 == null) {
            return var1.field10617 == 'i' || var1.field10617 == '1' ? 0 : -1;
        } else {
            return var2;
        }
    }

    @OriginalMember(owner = "client!im", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4393(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x51);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!im", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4394(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 35;
                    break;
                case 1:
                    var10005 = 97;
                    break;
                case 2:
                    var10005 = 16;
                    break;
                case 3:
                    var10005 = 60;
                    break;
                default:
                    var10005 = 81;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
