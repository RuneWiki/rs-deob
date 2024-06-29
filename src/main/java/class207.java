import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vk")
public class class207 extends class376 {

    @OriginalMember(owner = "client!vk", name = "q", descriptor = "Ljava/lang/String;")
    public String field2798;

    @OriginalMember(owner = "client!vk", name = "A", descriptor = "I")
    public int field2808;

    @OriginalMember(owner = "client!vk", name = "r", descriptor = "I")
    public int field2799;

    @OriginalMember(owner = "client!vk", name = "p", descriptor = "I")
    public int field2797;

    @OriginalMember(owner = "client!vk", name = "x", descriptor = "Ljava/lang/String;")
    public String field2805;

    @OriginalMember(owner = "client!vk", name = "w", descriptor = "I")
    public int field2804;

    @OriginalMember(owner = "client!vk", name = "z", descriptor = "J")
    public long field2807;

    @OriginalMember(owner = "client!vk", name = "n", descriptor = "I")
    public static int field2795 = 1;

    @OriginalMember(owner = "client!vk", name = "y", descriptor = "I")
    public static int field2806 = 0;

    @OriginalMember(owner = "client!vk", name = "s", descriptor = "I")
    public static int field2800;

    @OriginalMember(owner = "client!vk", name = "t", descriptor = "I")
    public static int field2801;

    @OriginalMember(owner = "client!vk", name = "u", descriptor = "I")
    public static int field2802;

    @OriginalMember(owner = "client!vk", name = "v", descriptor = "I")
    public static int field2803;

    @OriginalMember(owner = "client!vk", name = "o", descriptor = "Ljava/lang/String;")
    public static String field2796;

    @OriginalMember(owner = "client!vk", name = "m", descriptor = "[Lmp;")
    public static class452[] field2794;

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(III)Lue;")
    public static final class127 method1350(int arg0, int arg1, int arg2) {
        class142 var3 = class5.field79[arg0][arg1][arg2];
        return var3 == null || var3.field2047 == null ? null : var3.field2047;
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "([Lie;I[BZLaa;IIIIIII)V")
    public static final void method1351(class4[] arg0, int arg1, byte[] arg2, boolean arg3, class281 arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        field2802++;
        class371 var12 = new class371(arg2);
        if (arg10 != 1) {
            method1351((class4[]) null, 58, (byte[]) null, false, (class281) null, -11, 86, 17, -55, 89, 115, -102);
        }
        int var13 = -1;
        while (true) {
            int var14 = var12.method2398(arg10 + 113);
            if (var14 == 0) {
                return;
            }
            var13 += var14;
            int var15 = 0;
            while (true) {
                int var16 = var12.method2433(-75);
                if (var16 == 0) {
                    break;
                }
                var15 += var16 - 1;
                int var17 = var15 & 0x3F;
                int var18 = var15 >> 6 & 0x3F;
                int var19 = var15 >> 12;
                int var20 = var12.method2429(arg10 ^ 0x1);
                int var21 = var20 >> 2;
                int var22 = var20 & 0x3;
                if (arg8 == var19 && var18 >= arg6 && (arg6 + 8) > var18 && var17 >= arg7 && (arg7 + 8) > var17) {
                    class369 var23 = class310.method1961(var13, (byte) 35);
                    int var24 = arg9 + class115.method759(var17 & 0x7, var23.field5200, var23.field5215, var22, var18 & 0x7, arg10 - 4, arg1);
                    int var25 = arg11 + class301.method1937(var22, var23.field5200, var18 & 0x7, var23.field5215, arg1, var17 & 0x7, arg10 ^ 0x6A);
                    if (var24 > 0 && var25 > 0 && class432.field6220 - 1 > var24 && var25 < class267.field3646 - 1) {
                        class4 var26 = null;
                        if (!arg3) {
                            int var27 = arg5;
                            if ((class221.field2910[1][var24][var25] & 0x2) == 2) {
                                var27 = arg5 - 1;
                            }
                            if (var27 >= 0) {
                                var26 = arg0[var27];
                            }
                        }
                        class196.method1311(var26, arg1 + var22 & 0x3, -1, true, arg4, var25, arg5, var24, arg3, var21, -3, arg5, var13);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!vk", name = "c", descriptor = "(I)V")
    public static void method1352(int arg0) {
        field2794 = null;
        if (arg0 != 0) {
            method1352(-106);
        }
        field2796 = null;
    }

    @OriginalMember(owner = "client!vk", name = "c", descriptor = "(B)V")
    public static final void method1353(byte arg0) {
        if (arg0 >= -38) {
            return;
        }
        field2801++;
        try {
            if (class399.field5832 == 1) {
                int var1 = class225.field3024.method200((byte) 111);
                if (var1 > 0 && class225.field3024.method212((byte) -89)) {
                    int var2 = var1 - class227.field3031;
                    if (var2 < 0) {
                        var2 = 0;
                    }
                    class225.field3024.method194(128, var2);
                } else {
                    class225.field3024.method199((byte) 117);
                    class225.field3024.method201(16);
                    class208.field2813 = null;
                    if (class202.field2761 == null) {
                        class399.field5832 = 0;
                    } else {
                        class399.field5832 = 2;
                    }
                    class31.field483 = null;
                }
            }
        } catch (Exception var4) {
            var4.printStackTrace();
            class225.field3024.method199((byte) 117);
            class399.field5832 = 0;
            class208.field2813 = null;
            class31.field483 = null;
            class202.field2761 = null;
        }
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(BI)I")
    public static final int method1354(byte arg0, int arg1) {
        int var2 = 35 % ((-arg0 - 66) / 51);
        field2803++;
        return arg1 & 0xFF;
    }

    @OriginalMember(owner = "client!vk", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;IIJII)V")
    public class207(String arg0, String arg1, int arg2, int arg3, long arg4, int arg5, int arg6) {
        this.field2798 = arg1;
        this.field2808 = arg5;
        this.field2799 = arg6;
        this.field2797 = arg3;
        this.field2805 = arg0;
        this.field2804 = arg2;
        this.field2807 = arg4;
    }
}
