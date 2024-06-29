import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gr")
public class class371 {

    @OriginalMember(owner = "client!gr", name = "f", descriptor = "B")
    public byte field5679;

    @OriginalMember(owner = "client!gr", name = "g", descriptor = "Lbo;")
    public class632 field5680;

    @OriginalMember(owner = "client!gr", name = "d", descriptor = "S")
    public short field5677;

    @OriginalMember(owner = "client!gr", name = "j", descriptor = "B")
    public byte field5683;

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "I")
    public static int field5674;

    @OriginalMember(owner = "client!gr", name = "b", descriptor = "I")
    public static int field5675;

    @OriginalMember(owner = "client!gr", name = "c", descriptor = "I")
    public static int field5676;

    @OriginalMember(owner = "client!gr", name = "e", descriptor = "I")
    public static int field5678;

    @OriginalMember(owner = "client!gr", name = "h", descriptor = "I")
    public static int field5681;

    @OriginalMember(owner = "client!gr", name = "i", descriptor = "[I")
    public static int[] field5682;

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(IIIIB[ILvi;[IZIIIIII)I")
    public static final int method2388(int arg0, int arg1, int arg2, int arg3, byte arg4, int[] arg5, class468 arg6, int[] arg7, boolean arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14) {
        for (int var15 = 0; var15 < 128; var15++) {
            for (int var36 = 0; var36 < 128; var36++) {
                class464.field6901[var15][var36] = 0;
                class223.field3137[var15][var36] = 99999999;
            }
        }
        field5676++;
        boolean var16;
        if (arg3 == 1) {
            var16 = class526.method3095(arg14, (byte) -101, arg13, arg1, arg11, arg9, arg10, arg6, arg12, arg2, arg0);
        } else if (arg3 == 2) {
            var16 = class203.method1300(arg2, (byte) 44, arg10, arg1, arg14, arg6, arg13, arg9, arg12, arg11, arg0);
        } else {
            var16 = class459.method2827(arg14, -31758, arg1, arg2, arg10, arg6, arg11, arg3, arg13, arg12, arg0, arg9);
        }
        int var17 = arg12 - 64;
        int var18 = 70 % ((arg4 + 30) / 38);
        int var19 = arg1 - 64;
        int var20 = class52.field545;
        int var21 = class327.field4721;
        if (!var16) {
            if (!arg8) {
                return -1;
            }
            int var22 = Integer.MAX_VALUE;
            int var23 = Integer.MAX_VALUE;
            byte var24 = 10;
            for (int var25 = arg14 - var24; var25 <= (arg14 + var24); var25++) {
                for (int var26 = arg13 - var24; var26 <= arg13 + var24; var26++) {
                    int var27 = var25 - var17;
                    int var28 = var26 - var19;
                    if (var27 >= 0 && var28 >= 0 && var27 < 128 && var28 < 128 && class223.field3137[var27][var28] < 100) {
                        int var29 = 0;
                        if (arg14 > var25) {
                            var29 = arg14 - var25;
                        } else if (arg9 + arg14 - 1 < var25) {
                            var29 = var25 + 1 - arg14 - arg9;
                        }
                        int var30 = 0;
                        if (arg13 > var26) {
                            var30 = arg13 - var26;
                        } else if ((arg2 + arg13 - 1) < var26) {
                            var30 = var26 - (arg2 + arg13 - 1);
                        }
                        int var31 = var29 * var29 + var30 * var30;
                        if (var22 > var31 || var22 == var31 && class223.field3137[var27][var28] < var23) {
                            var21 = var26;
                            var20 = var25;
                            var23 = class223.field3137[var27][var28];
                            var22 = var31;
                        }
                    }
                }
            }
            if (~var22 == Integer.MIN_VALUE) {
                return -1;
            }
        }
        if (arg12 == var20 && arg1 == var21) {
            return 0;
        }
        byte var32 = 0;
        class110.field1357[var32] = var20;
        int var38 = var32 + 1;
        class448.field6691[var32] = var21;
        int var33;
        int var34 = var33 = class464.field6901[var20 - var17][var21 - var19];
        while (arg12 != var20 || arg1 != var21) {
            if (var33 != var34) {
                var33 = var34;
                class110.field1357[var38] = var20;
                class448.field6691[var38++] = var21;
            }
            if ((var34 & 0x2) != 0) {
                var20++;
            } else if ((var34 & 0x8) != 0) {
                var20--;
            }
            if ((var34 & 0x1) != 0) {
                var21++;
            } else if ((var34 & 0x4) != 0) {
                var21--;
            }
            var34 = class464.field6901[var20 - var17][var21 - var19];
        }
        int var35 = 0;
        while ((var38--) > 0) {
            arg7[var35] = class110.field1357[var38];
            arg5[var35++] = class448.field6691[var38];
            if (var35 >= arg7.length) {
                break;
            }
        }
        return var35;
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(Lkea;ILkea;)I")
    public static final int method2389(class203 arg0, int arg1, class203 arg2) {
        field5675++;
        int var3 = arg1;
        if (arg0.method1311(class546.field7820, (byte) -93)) {
            var3 = arg1 + 1;
        }
        if (arg0.method1311(class201.field2692, (byte) -93)) {
            var3++;
        }
        if (arg0.method1311(class52.field548, (byte) -93)) {
            var3++;
        }
        if (arg2.method1311(class546.field7820, (byte) -93)) {
            var3++;
        }
        if (arg2.method1311(class201.field2692, (byte) -93)) {
            var3++;
        }
        if (arg2.method1311(class52.field548, (byte) -93)) {
            var3++;
        }
        return var3;
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(I)V")
    public static void method2390(int arg0) {
        if (arg0 != -15305) {
            method2388(-113, -28, -17, -92, (byte) -90, null, null, null, false, -71, 54, -19, -75, -85, 54);
        }
        field5682 = null;
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(ZLjava/lang/String;I)Z")
    public static final boolean method2391(boolean arg0, String arg1, int arg2) {
        field5681++;
        if (class20.field197.field7804) {
            class461.field6876 = new class129();
            class461.field6876.field1603 = arg2;
            class461.field6876.field1598 = arg1;
            if (class646.field9321 != class197.field2667) {
                class461.field6876.field1595 = class461.field6876.field1603 + 40000;
                class461.field6876.field1601 = class461.field6876.field1603 + 50000;
            }
            if (arg2 < class257.field3662.length && class257.field3662[arg2] != null) {
                class82.field911 = class257.field3662[arg2].field6346;
            }
            return true;
        }
        String var3 = "";
        if (class646.field9321 != class197.field2667) {
            var3 = ":" + (arg2 + 7000);
        }
        String var4 = "";
        if (class651.field9388 != null) {
            var4 = "/p=" + class651.field9388;
        }
        String var5 = "http://" + arg1 + var3 + "/l=" + class35.field396 + "/a=" + class448.field6686 + var4 + "/j" + (class436.field6484 ? "1" : "0") + ",o" + (class254.field3629 ? "1" : "0") + ",a2";
        try {
            if (arg0) {
                method2391(false, null, -121);
            }
            class254.field3624.getAppletContext().showDocument(new URL(var5), "_self");
            return true;
        } catch (Exception var6) {
            return false;
        }
    }

    @OriginalMember(owner = "client!gr", name = "<init>", descriptor = "(Lbo;III)V")
    public class371(class632 arg0, int arg1, int arg2, int arg3) {
        this.field5679 = (byte) arg2;
        this.field5680 = arg0;
        this.field5677 = (short) arg1;
        this.field5683 = (byte) arg3;
    }
}
