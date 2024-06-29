import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!via")
public class class590 extends class688 {

    @OriginalMember(owner = "client!via", name = "o", descriptor = "B")
    public byte field8562 = 5;

    @OriginalMember(owner = "client!via", name = "D", descriptor = "[Ljava/lang/String;")
    private static final String[] field8567 = new String[] { method4338(method4337("\u0015E\u0007paK")), method4338(method4337("\u0018\u0002Hp^")), method4338(method4337("\u0015E\u0007pgK")), method4338(method4337("\rY\n2")), method4338(method4337("\u0015E\u0007pfK")), method4338(method4337("\u0015E\u0007pbK")) };

    @OriginalMember(owner = "client!via", name = "y", descriptor = "I")
    public static int field8552;

    @OriginalMember(owner = "client!via", name = "t", descriptor = "I")
    public static int field8553;

    @OriginalMember(owner = "client!via", name = "A", descriptor = "I")
    public int field8554;

    @OriginalMember(owner = "client!via", name = "u", descriptor = "I")
    public int field8556;

    @OriginalMember(owner = "client!via", name = "w", descriptor = "I")
    public static int field8557;

    @OriginalMember(owner = "client!via", name = "C", descriptor = "I")
    public static int field8558;

    @OriginalMember(owner = "client!via", name = "v", descriptor = "I")
    public int field8559;

    @OriginalMember(owner = "client!via", name = "B", descriptor = "I")
    public int field8560;

    @OriginalMember(owner = "client!via", name = "s", descriptor = "I")
    public static int field8561;

    @OriginalMember(owner = "client!via", name = "q", descriptor = "I")
    public static int field8563;

    @OriginalMember(owner = "client!via", name = "z", descriptor = "I")
    public int field8564;

    @OriginalMember(owner = "client!via", name = "p", descriptor = "I")
    public int field8566;

    @OriginalMember(owner = "client!via", name = "x", descriptor = "Z")
    public boolean field8565;

    @OriginalMember(owner = "client!via", name = "r", descriptor = "[[[Z")
    public static boolean[][][] field8555;

    @OriginalMember(owner = "client!via", name = "a", descriptor = "(II[IIIZILii;I[IIIIII)I")
    public static final int method4332(int arg0, int arg1, int[] arg2, int arg3, int arg4, boolean arg5, int arg6, class580 arg7, int arg8, int[] arg9, int arg10, int arg11, int arg12, int arg13, int arg14) {
        try {
            field8561++;
            for (int var15 = 0; var15 < 128; var15++) {
                for (int var16 = 0; var16 < 128; var16++) {
                    class246.field3801[var15][var16] = 0;
                    class384.field6161[var15][var16] = 99999999;
                }
            }
            if (arg11 <= 40) {
                method4335(14, null, true);
            }
            boolean var17;
            if (arg14 == 1) {
                var17 = class738.method5364(arg12, arg10, arg3, 256, arg4, arg13, arg8, arg0, arg7, arg1, arg6);
            } else if (arg14 == 2) {
                var17 = class1.method1(arg13, arg7, arg3, arg0, arg10, arg8, arg6, arg1, arg4, arg12, 16293);
            } else {
                var17 = class538.method4013(arg7, arg3, arg10, arg1, arg14, arg6, arg12, arg4, arg13, arg0, arg8, 28049);
            }
            int var18 = arg8 - 64;
            int var19 = arg10 - 64;
            int var20 = class100.field1462;
            int var21 = class360.field5812;
            if (!var17) {
                if (!arg5) {
                    return -1;
                }
                int var22 = Integer.MAX_VALUE;
                int var23 = Integer.MAX_VALUE;
                byte var24 = 10;
                for (int var25 = arg13 - var24; var25 <= arg13 + var24; var25++) {
                    for (int var26 = arg6 - var24; var26 <= (arg6 + var24); var26++) {
                        int var27 = var25 - var18;
                        int var28 = var26 - var19;
                        if (var27 >= 0 && var28 >= 0 && var27 < 128 && var28 < 128 && class384.field6161[var27][var28] < 100) {
                            int var29 = 0;
                            if (arg13 > var25) {
                                var29 = arg13 - var25;
                            } else if ((arg4 + arg13 - 1) < var25) {
                                var29 = var25 + 1 - arg4 - arg13;
                            }
                            int var30 = 0;
                            if (arg6 > var26) {
                                var30 = arg6 - var26;
                            } else if (arg6 + arg12 - 1 < var26) {
                                var30 = 1 - arg12 - (arg6 - var26);
                            }
                            int var31 = var29 * var29 + (var30 * var30);
                            if (var31 < var22 || var22 == var31 && class384.field6161[var27][var28] < var23) {
                                var22 = var31;
                                var23 = class384.field6161[var27][var28];
                                var20 = var25;
                                var21 = var26;
                            }
                        }
                    }
                }
                if (var22 == Integer.MAX_VALUE) {
                    return -1;
                }
            }
            if (arg8 == var20 && arg10 == var21) {
                return 0;
            }
            byte var32 = 0;
            class116.field1698[var32] = var20;
            int var39 = var32 + 1;
            class62.field849[var32] = var21;
            int var33;
            int var34 = var33 = class246.field3801[var20 - var18][var21 - var19];
            while (arg8 != var20 || arg10 != var21) {
                if (var33 != var34) {
                    var33 = var34;
                    class116.field1698[var39] = var20;
                    class62.field849[var39++] = var21;
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
                var34 = class246.field3801[var20 - var18][var21 - var19];
            }
            int var35 = 0;
            while ((var39--) > 0) {
                arg2[var35] = class116.field1698[var39];
                arg9[var35++] = class62.field849[var39];
                if (var35 >= arg2.length) {
                    break;
                }
            }
            return var35;
        } catch (RuntimeException var37) {
            throw method4333(var37, field8567[5] + arg0 + ',' + arg1 + ',' + (arg2 == null ? field8567[3] : field8567[1]) + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + (arg7 == null ? field8567[3] : field8567[1]) + ',' + arg8 + ',' + (arg9 == null ? field8567[3] : field8567[1]) + ',' + arg10 + ',' + arg11 + ',' + arg12 + ',' + arg13 + ',' + arg14 + ')');
        }
    }

    @OriginalMember(owner = "client!via", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lrs;")
    public static final class681 method4333(Throwable arg0, String arg1) {
        field8563++;
        class681 var2;
        if ((arg0 instanceof class681)) {
            var2 = (class681) arg0;
            var2.field9710 = var2.field9710 + ' ' + arg1;
        } else {
            var2 = new class681(arg0, arg1);
        }
        return var2;
    }

    @OriginalMember(owner = "client!via", name = "b", descriptor = "(Z)V")
    public static void method4334(boolean arg0) {
        try {
            field8555 = null;
            if (!arg0) {
                method4335(126, null, false);
            }
        } catch (RuntimeException var2) {
            throw method4333(var2, field8567[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!via", name = "a", descriptor = "(ILjava/lang/String;Z)V")
    public static final void method4335(int arg0, String arg1, boolean arg2) {
        try {
            field8557++;
            if (arg1 != null) {
                if (class223.field3504 >= 100) {
                    class596.method4365(4, class709.field10241.method5154(class795.field11624, (byte) 65), 0);
                } else {
                    String var3 = class788.method5662((byte) 113, arg1);
                    if (var3 != null && arg0 >= 71) {
                        for (int var4 = 0; var4 < class223.field3504; var4++) {
                            String var5 = class788.method5662((byte) 104, class140.field1959[var4]);
                            if (var5 != null && var5.equals(var3)) {
                                class596.method4365(4, arg1 + class709.field10242.method5154(class795.field11624, (byte) 65), 0);
                                return;
                            }
                            if (class794.field11607[var4] != null) {
                                String var6 = class788.method5662((byte) 93, class794.field11607[var4]);
                                if (var6 != null && var6.equals(var3)) {
                                    class596.method4365(4, arg1 + class709.field10242.method5154(class795.field11624, (byte) 65), 0);
                                    return;
                                }
                            }
                        }
                        for (int var7 = 0; var7 < class198.field3145; var7++) {
                            String var8 = class788.method5662((byte) 102, class129.field1846[var7]);
                            if (var8 != null && var8.equals(var3)) {
                                class596.method4365(4, class709.field10247.method5154(class795.field11624, (byte) 65) + arg1 + class709.field10248.method5154(class795.field11624, (byte) 65), 0);
                                return;
                            }
                            if (class449.field6963[var7] != null) {
                                String var9 = class788.method5662((byte) 97, class449.field6963[var7]);
                                if (var9 != null && var9.equals(var3)) {
                                    class596.method4365(4, class709.field10247.method5154(class795.field11624, (byte) 65) + arg1 + class709.field10248.method5154(class795.field11624, (byte) 65), 0);
                                    return;
                                }
                            }
                        }
                        if (class788.method5662((byte) 106, class438.field6846.field10821).equals(var3)) {
                            class596.method4365(4, class709.field10244.method5154(class795.field11624, (byte) 65), 0);
                        } else {
                            class163.field2638++;
                            class164 var10 = class193.method1785(false);
                            class487 var11 = class618.method4519(32, class556.field8117, var10.field2659);
                            var11.field7362.method1678(class126.method1216(-114, arg1) + 1, 65280);
                            var11.field7362.method1681(arg1, 23137);
                            var11.field7362.method1678(arg2 ? 1 : 0, 65280);
                            var10.method1546(var11, 1);
                        }
                    }
                }
            }
        } catch (RuntimeException var13) {
            throw method4333(var13, field8567[2] + arg0 + ',' + (arg1 == null ? field8567[3] : field8567[1]) + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!via", name = "a", descriptor = "(IJ)V")
    public static final void method4336(int arg0, long arg1) {
        try {
            field8558++;
            int var3 = class537.field7887;
            if (arg0 != 320) {
                method4333(null, null);
            }
            int var4 = class505.field7560;
            if (class524.field7735 != var3) {
                int var5 = var3 - class524.field7735;
                int var6 = (int) ((long) var5 * arg1 / 320L);
                if (var5 > 0) {
                    if (var6 == 0) {
                        var6 = 1;
                    } else if (var5 < var6) {
                        var6 = var5;
                    }
                } else if (var6 == 0) {
                    var6 = -1;
                } else if (var6 < var5) {
                    var6 = var5;
                }
                class524.field7735 += var6;
            }
            if (class147.field2059 != var4) {
                int var7 = var4 - class147.field2059;
                int var8 = (int) ((long) var7 * arg1 / 320L);
                if (var7 > 0) {
                    if (var8 == 0) {
                        var8 = 1;
                    } else if (var7 < var8) {
                        var8 = var7;
                    }
                } else if (var8 == 0) {
                    var8 = -1;
                } else if (var8 < var7) {
                    var8 = var7;
                }
                class147.field2059 += var8;
            }
            class418.field6612 += (float) arg1 * class260.field3920 / 40.0F * 8.0F;
            class29.field293 += (float) arg1 * class636.field9130 / 40.0F * 8.0F;
            class610.method4447(-18418);
        } catch (RuntimeException var10) {
            throw method4333(var10, field8567[4] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!via", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4337(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x23);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!via", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4338(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 99;
                    break;
                case 1:
                    var10005 = 44;
                    break;
                case 2:
                    var10005 = 102;
                    break;
                case 3:
                    var10005 = 94;
                    break;
                default:
                    var10005 = 35;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
