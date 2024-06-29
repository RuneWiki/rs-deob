import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qc")
public class class160 {

    @OriginalMember(owner = "client!qc", name = "f", descriptor = "Ljava/lang/String;")
    public static String field2545 = null;

    @OriginalMember(owner = "client!qc", name = "j", descriptor = "I")
    public static int field2549 = 0;

    @OriginalMember(owner = "client!qc", name = "i", descriptor = "[S")
    public static short[] field2548 = new short[] { 960, 957, -21568, -21571, 22464 };

    @OriginalMember(owner = "client!qc", name = "e", descriptor = "[I")
    public static int[] field2544 = new int[] { 76, 8, 137, 4, 0, 1, 38, 2, 19 };

    @OriginalMember(owner = "client!qc", name = "h", descriptor = "Lqd;")
    public static class173 field2547 = new class173(100);

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "I")
    public static int field2540;

    @OriginalMember(owner = "client!qc", name = "d", descriptor = "I")
    public static int field2543;

    @OriginalMember(owner = "client!qc", name = "g", descriptor = "I")
    public static int field2546;

    @OriginalMember(owner = "client!qc", name = "k", descriptor = "I")
    public static int field2550;

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "Ldk;")
    public static class251 field2541;

    @OriginalMember(owner = "client!qc", name = "c", descriptor = "[Lsk;")
    public static class203[] field2542;

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(I[BZI[Lpk;I)V")
    public static final void method1099(int arg0, byte[] arg1, boolean arg2, int arg3, class44[] arg4, int arg5) {
        class162 var6 = new class162(arg1);
        int var7 = -1;
        if (arg3 != 4090) {
            field2547 = null;
        }
        field2543++;
        while (true) {
            int var8 = var6.method1139(-5705);
            if (var8 == 0) {
                return;
            }
            var7 += var8;
            int var9 = 0;
            while (true) {
                int var10 = var6.method1114((byte) -13);
                if (var10 == 0) {
                    break;
                }
                var9 += var10 - 1;
                int var11 = var9 & 0x3F;
                int var12 = (var9 & 0xFFA) >> 6;
                int var13 = var6.method1133((byte) 53);
                int var14 = var9 >> 12;
                int var15 = arg0 + var12;
                int var16 = var13 >> 2;
                int var17 = var11 + arg5;
                int var18 = var13 & 0x3;
                if (var15 > 0 && var17 > 0 && var15 < 103 && var17 < 103) {
                    class44 var19 = null;
                    if (!arg2) {
                        int var20 = var14;
                        if ((class301.field4818[1][var15][var17] & 0x2) == 2) {
                            var20 = var14 - 1;
                        }
                        if (var20 >= 0) {
                            var19 = arg4[var20];
                        }
                    }
                    class137.method957(var18, arg2, var15, var7, var16, !arg2, var14, (byte) 3, var17, var19, var14);
                }
            }
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(IIIII)V")
    public static final void method1100(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class314.field5061.field2568 = 0;
        field2546++;
        class314.field5061.method1108(20, true);
        class314.field5061.method1108(arg3, true);
        class314.field5061.method1108(arg0, true);
        class314.field5061.method1120(arg4, true);
        class314.field5061.method1120(arg1, true);
        class176.field2873 = 1;
        class9.field91 = -3;
        class225.field3653 = 0;
        class81.field1364 = 0;
        int var5 = -21 % ((arg2 + 46) / 49);
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(I)V")
    public static void method1101(int arg0) {
        field2547 = null;
        field2544 = null;
        field2541 = null;
        field2545 = null;
        field2548 = null;
        if (arg0 != -22950) {
            field2542 = null;
        }
        field2542 = null;
    }

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "(IIIII)V")
    public static final void method1102(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2550++;
        if (arg1 != 3) {
            method1103(100);
        }
        for (class107 var5 = (class107) class237.field3809.method1643((byte) -103); var5 != null; var5 = (class107) class237.field3809.method1642((byte) 67)) {
            class15.method70((byte) 65, arg2, arg4, arg3, arg0, var5);
        }
        for (class107 var6 = (class107) class267.field4298.method1643((byte) -88); var6 != null; var6 = (class107) class267.field4298.method1642((byte) 53)) {
            byte var11 = 1;
            class182 var12 = var6.field1720.method292(-121);
            if (var6.field1720.field682 == var12.field3006) {
                var11 = 0;
            } else if (var6.field1720.field682 == var12.field2985 || var6.field1720.field682 == var12.field2988 || var6.field1720.field682 == var12.field2986 || var6.field1720.field682 == var12.field2998) {
                var11 = 2;
            } else if (var6.field1720.field682 == var12.field2987 || var6.field1720.field682 == var12.field2981 || var6.field1720.field682 == var12.field2994 || var6.field1720.field682 == var12.field2996) {
                var11 = 3;
            }
            if (var6.field1710 != var11) {
                int var13 = class267.method1794(var6.field1720, (byte) 112);
                if (var6.field1707 != var13) {
                    if (var6.field1699 != null) {
                        class6.field68.method1594(var6.field1699);
                        var6.field1699 = null;
                    }
                    var6.field1707 = var13;
                }
                var6.field1710 = var11;
            }
            var6.field1718 = var6.field1720.field637;
            var6.field1704 = var6.field1720.field637 + (var6.field1720.method279(23397) * 64);
            var6.field1708 = var6.field1720.field710;
            var6.field1713 = var6.field1720.field710 + (var6.field1720.method279(23397) * 64);
            class15.method70((byte) -106, arg2, arg4, arg3, arg0, var6);
        }
        for (class107 var7 = (class107) class234.field3763.method1063(-124); var7 != null; var7 = (class107) class234.field3763.method1055(18178)) {
            byte var8 = 1;
            class182 var9 = var7.field1709.method292(121);
            if (var7.field1709.field682 == var9.field3006) {
                var8 = 0;
            } else if (var7.field1709.field682 == var9.field2985 || var7.field1709.field682 == var9.field2988 || var7.field1709.field682 == var9.field2986 || var7.field1709.field682 == var9.field2998) {
                var8 = 2;
            } else if (var7.field1709.field682 == var9.field2987 || var7.field1709.field682 == var9.field2981 || var7.field1709.field682 == var9.field2994 || var7.field1709.field682 == var9.field2996) {
                var8 = 3;
            }
            if (var7.field1710 != var8) {
                int var10 = class74.method502(var7.field1709, -44);
                if (var7.field1707 != var10) {
                    if (var7.field1699 != null) {
                        class6.field68.method1594(var7.field1699);
                        var7.field1699 = null;
                    }
                    var7.field1707 = var10;
                }
                var7.field1710 = var8;
            }
            var7.field1718 = var7.field1709.field637;
            var7.field1704 = var7.field1709.field637 + (var7.field1709.method279(23397) * 64);
            var7.field1708 = var7.field1709.field710;
            var7.field1713 = var7.field1709.field710 + var7.field1709.method279(arg1 + 23394) * 64;
            class15.method70((byte) -101, arg2, arg4, arg3, arg0, var7);
        }
    }

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "(I)Z")
    public static final boolean method1103(int arg0) {
        field2540++;
        try {
            return arg0 == 50 ? class296.method1962(false) : true;
        } catch (IOException var4) {
            class73.method499(-1);
            return true;
        } catch (Exception var5) {
            String var2 = "T2 - " + class71.field1208 + "," + class81.field1342 + "," + class89.field1454 + " - " + class47.field793 + "," + (class239.field3829.field709[0] + class276.field4438) + "," + (class108.field1732 + class239.field3829.field704[0]) + " - ";
            for (int var3 = 0; class47.field793 > var3 && var3 < 50; var3++) {
                var2 = var2 + class131.field2053.field2573[var3] + ",";
            }
            class19.method94(arg0 - 163, var5, var2);
            class216.method1500(0);
            return true;
        }
    }
}
