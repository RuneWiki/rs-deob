import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mk")
public class class59 extends class459 {

    @OriginalMember(owner = "client!mk", name = "I", descriptor = "Z")
    public boolean field763;

    @OriginalMember(owner = "client!mk", name = "F", descriptor = "I")
    public int field773;

    @OriginalMember(owner = "client!mk", name = "A", descriptor = "Z")
    public boolean field768;

    @OriginalMember(owner = "client!mk", name = "H", descriptor = "I")
    public int field766;

    @OriginalMember(owner = "client!mk", name = "J", descriptor = "I")
    public int field776;

    @OriginalMember(owner = "client!mk", name = "B", descriptor = "J")
    public long field762;

    @OriginalMember(owner = "client!mk", name = "C", descriptor = "I")
    public int field771;

    @OriginalMember(owner = "client!mk", name = "O", descriptor = "J")
    public long field767;

    @OriginalMember(owner = "client!mk", name = "y", descriptor = "Ljava/lang/String;")
    public String field764;

    @OriginalMember(owner = "client!mk", name = "N", descriptor = "I")
    public int field769;

    @OriginalMember(owner = "client!mk", name = "z", descriptor = "Ljava/lang/String;")
    public String field760;

    @OriginalMember(owner = "client!mk", name = "w", descriptor = "Z")
    public boolean field775;

    @OriginalMember(owner = "client!mk", name = "E", descriptor = "[Ljava/lang/String;")
    private static final String[] field777 = new String[] { method618(method617("k4\u0012yKh6H{\n")), method618(method617("h*P)")), method618(method617("}q\u0012k_")), method618(method617("k4\u0012\u0006\n")), method618(method617("&w")), method618(method617("k4\u0012\u0007\n")), method618(method617(":<S)\u001fe<_&Aea")), method618(method617("&r\u0002e\u001ee0PxD`9Z#D8")), method618(method617(":<S)\u001f`9Z#D`a")) };

    @OriginalMember(owner = "client!mk", name = "G", descriptor = "[S")
    private static short[] field772 = new short[] { 6798, 8741, 25238, 4626, 4550 };

    @OriginalMember(owner = "client!mk", name = "L", descriptor = "[S")
    private static short[] field774 = new short[] { -10304, 9104, 25485, 4620, 4540 };

    @OriginalMember(owner = "client!mk", name = "M", descriptor = "[S")
    private static short[] field770 = new short[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!mk", name = "x", descriptor = "[[S")
    public static short[][] field765 = new short[][] { field772, field774, field770 };

    @OriginalMember(owner = "client!mk", name = "P", descriptor = "D")
    public static double field761;

    @OriginalMember(owner = "client!mk", name = "v", descriptor = "I")
    public static int field759;

    @OriginalMember(owner = "client!mk", name = "D", descriptor = "Ljava/lang/String;")
    public String field758;

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(IIILjava/lang/Class;)Laba;")
    public static final class185 method614(int arg0, int arg1, int arg2, Class arg3) {
        class290 var4 = class85.field1280[arg0][arg1][arg2];
        if (var4 == null) {
            return null;
        }
        for (class135 var5 = var4.field4670; var5 != null; var5 = var5.field1912) {
            class185 var6 = var5.field1911;
            if (arg3.isAssignableFrom(var6.getClass()) && var6.field2945 == arg1 && var6.field2946 == arg2) {
                return var6;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!mk", name = "b", descriptor = "(Z)V")
    public static void method615(boolean arg0) {
        try {
            field765 = null;
            if (!arg0) {
                method616(null, 101, true);
            }
            field770 = null;
            field774 = null;
            field772 = null;
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field777[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(Lip;IZ)V")
    public static final void method616(class738 arg0, int arg1, boolean arg2) {
        try {
            field759++;
            if (class320.field5213 < 400) {
                if (arg1 <= 9) {
                    method615(true);
                }
                if (class438.field6846 != arg0) {
                    String var3;
                    if (arg0.field10801 == 0) {
                        boolean var4 = true;
                        if (class438.field6846.field10803 != -1 && arg0.field10803 != -1) {
                            int var5 = class438.field6846.field10803 >= arg0.field10803 ? arg0.field10803 : class438.field6846.field10803;
                            int var6 = class438.field6846.field10845 - arg0.field10845;
                            if (var6 < 0) {
                                var6 = -var6;
                            }
                            if (var6 > var5) {
                                var4 = false;
                            }
                        }
                        String var7 = class305.field4924 == class117.field1711 ? class709.field10232.method5154(class795.field11624, (byte) 65) : class709.field10230.method5154(class795.field11624, (byte) 65);
                        if (arg0.field10822 <= arg0.field10845) {
                            var3 = arg0.method5361(true, -380246327) + (var4 ? class20.method133(class438.field6846.field10845, arg0.field10845, (byte) -103) : field777[8]) + field777[4] + var7 + arg0.field10845 + ")";
                        } else {
                            var3 = arg0.method5361(true, -380246327) + (var4 ? class20.method133(class438.field6846.field10845, arg0.field10845, (byte) -124) : field777[8]) + field777[4] + var7 + arg0.field10845 + "+" + (arg0.field10822 - arg0.field10845) + ")";
                        }
                    } else if (arg0.field10801 == -1) {
                        var3 = arg0.method5361(true, -380246327);
                    } else {
                        var3 = arg0.method5361(true, -380246327) + field777[4] + class709.field10231.method5154(class795.field11624, (byte) 65) + arg0.field10801 + ")";
                    }
                    if (class501.field7499 && !arg2 && (class513.field7595 & 0x8) != 0) {
                        class101.method954(0, 13, -1, class679.field9662, class304.field4915 + field777[7] + var3, class480.field7309, (long) arg0.field1129, (long) arg0.field1129, (byte) -93, 0, false, false, true);
                        class50.field604++;
                    }
                    if (arg2) {
                        class101.method954(0, -1, 0, -1, "", field777[6] + var3, 0L, (long) arg0.field1129, (byte) -105, 0, false, true, false);
                    } else {
                        for (int var8 = 7; var8 >= 0; var8--) {
                            if (class338.field5506[var8] != null) {
                                short var9 = 0;
                                if (class305.field4924 == class229.field3561 && class338.field5506[var8].equalsIgnoreCase(class709.field10225.method5154(class795.field11624, (byte) 65))) {
                                    if (class737.field10793 && class438.field6846.field10845 < arg0.field10845) {
                                        var9 = 2000;
                                    }
                                    if (class438.field6846.field10824 == 0 || arg0.field10824 == 0) {
                                        if (arg0.field10853) {
                                            var9 = 2000;
                                        }
                                    } else if (class438.field6846.field10824 == arg0.field10824) {
                                        var9 = 2000;
                                    } else {
                                        var9 = 0;
                                    }
                                } else if (class79.field1225[var8]) {
                                    var9 = 2000;
                                }
                                short var10 = (short) (class150.field2105[var8] + var9);
                                int var11 = class567.field8240[var8] == -1 ? class325.field5294 : class567.field8240[var8];
                                class178.field2872++;
                                class101.method954(0, var10, -1, var11, field777[8] + var3, class338.field5506[var8], (long) arg0.field1129, (long) arg0.field1129, (byte) -74, 0, false, false, true);
                            }
                        }
                    }
                    if (!arg2) {
                        for (class59 var12 = (class59) class439.field6858.method3228(11); var12 != null; var12 = (class59) class439.field6858.method3216(true)) {
                            if (var12.field773 == 10) {
                                var12.field758 = field777[8] + var3;
                                return;
                            }
                        }
                    }
                } else if (class501.field7499 && (class513.field7595 & 0x10) != 0) {
                    class505.field7556++;
                    class101.method954(0, 5, -1, class679.field9662, class304.field4915 + field777[7] + class709.field10239.method5154(class795.field11624, (byte) 65), class480.field7309, 0L, (long) arg0.field1129, (byte) -64, 0, false, false, true);
                }
            }
        } catch (RuntimeException var14) {
            throw class590.method4333(var14, field777[5] + (arg0 == null ? field777[1] : field777[2]) + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!mk", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIJIIZZJZ)V")
    public class59(String arg0, String arg1, int arg2, int arg3, int arg4, long arg5, int arg6, int arg7, boolean arg8, boolean arg9, long arg10, boolean arg11) {
        try {
            this.field763 = arg9;
            this.field773 = arg3;
            this.field768 = arg11;
            this.field766 = arg2;
            this.field776 = arg7;
            this.field762 = arg5;
            this.field771 = arg4;
            this.field767 = arg10;
            this.field764 = arg0;
            this.field769 = arg6;
            this.field760 = arg1;
            this.field775 = arg8;
        } catch (RuntimeException var16) {
            throw class590.method4333(var16, field777[0] + (arg0 == null ? field777[1] : field777[2]) + ',' + (arg1 == null ? field777[1] : field777[2]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ',' + arg11 + ')');
        }
    }

    @OriginalMember(owner = "client!mk", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method617(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x22);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!mk", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method618(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 6;
                    break;
                case 1:
                    var10005 = 95;
                    break;
                case 2:
                    var10005 = 60;
                    break;
                case 3:
                    var10005 = 69;
                    break;
                default:
                    var10005 = 34;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
