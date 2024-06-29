import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fs")
public class class331 extends class406 {

    @OriginalMember(owner = "client!fs", name = "s", descriptor = "I")
    public static int field4675 = 0;

    @OriginalMember(owner = "client!fs", name = "y", descriptor = "Z")
    public static boolean field4681 = false;

    @OriginalMember(owner = "client!fs", name = "p", descriptor = "Llg;")
    public static class237 field4672 = new class237(64);

    @OriginalMember(owner = "client!fs", name = "B", descriptor = "I")
    public static int field4684 = 0;

    @OriginalMember(owner = "client!fs", name = "D", descriptor = "Z")
    public static boolean field4686 = false;

    @OriginalMember(owner = "client!fs", name = "r", descriptor = "I")
    public static int field4674;

    @OriginalMember(owner = "client!fs", name = "u", descriptor = "I")
    public static int field4677;

    @OriginalMember(owner = "client!fs", name = "v", descriptor = "I")
    public static int field4678;

    @OriginalMember(owner = "client!fs", name = "w", descriptor = "I")
    public static int field4679;

    @OriginalMember(owner = "client!fs", name = "x", descriptor = "I")
    public static int field4680;

    @OriginalMember(owner = "client!fs", name = "z", descriptor = "I")
    public static int field4682;

    @OriginalMember(owner = "client!fs", name = "A", descriptor = "I")
    public static int field4683;

    @OriginalMember(owner = "client!fs", name = "C", descriptor = "J")
    public long field4685;

    @OriginalMember(owner = "client!fs", name = "q", descriptor = "Lfs;")
    public class331 field4673;

    @OriginalMember(owner = "client!fs", name = "t", descriptor = "Lfs;")
    public class331 field4676;

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(III)Z", line = 5)
    public static final boolean method2131(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < class339.field4809; var3++) {
            class265 var4 = class392.field5534[var3];
            if (var4.field3770 == 1) {
                int var5 = var4.field3772 - arg0;
                if (var5 > 0) {
                    int var6 = (var4.field3778 * var5 >> 8) + var4.field3767;
                    int var7 = (var4.field3761 * var5 >> 8) + var4.field3764;
                    int var8 = (var4.field3776 * var5 >> 8) + var4.field3766;
                    int var9 = (var4.field3762 * var5 >> 8) + var4.field3763;
                    if (arg2 >= var6 && arg2 <= var7 && arg1 >= var8 && arg1 <= var9) {
                        return true;
                    }
                }
            } else if (var4.field3770 == 2) {
                int var10 = arg0 - var4.field3772;
                if (var10 > 0) {
                    int var11 = (var4.field3778 * var10 >> 8) + var4.field3767;
                    int var12 = (var4.field3761 * var10 >> 8) + var4.field3764;
                    int var13 = (var4.field3776 * var10 >> 8) + var4.field3766;
                    int var14 = (var4.field3762 * var10 >> 8) + var4.field3763;
                    if (arg2 >= var11 && arg2 <= var12 && arg1 >= var13 && arg1 <= var14) {
                        return true;
                    }
                }
            } else if (var4.field3770 == 3) {
                int var15 = var4.field3767 - arg2;
                if (var15 > 0) {
                    int var16 = (var4.field3777 * var15 >> 8) + var4.field3772;
                    int var17 = (var4.field3775 * var15 >> 8) + var4.field3771;
                    int var18 = (var4.field3776 * var15 >> 8) + var4.field3766;
                    int var19 = (var4.field3762 * var15 >> 8) + var4.field3763;
                    if (arg0 >= var16 && arg0 <= var17 && arg1 >= var18 && arg1 <= var19) {
                        return true;
                    }
                }
            } else if (var4.field3770 == 4) {
                int var20 = arg2 - var4.field3767;
                if (var20 > 0) {
                    int var21 = (var4.field3777 * var20 >> 8) + var4.field3772;
                    int var22 = (var4.field3775 * var20 >> 8) + var4.field3771;
                    int var23 = (var4.field3776 * var20 >> 8) + var4.field3766;
                    int var24 = (var4.field3762 * var20 >> 8) + var4.field3763;
                    if (arg0 >= var21 && arg0 <= var22 && arg1 >= var23 && arg1 <= var24) {
                        return true;
                    }
                }
            } else if (var4.field3770 == 5) {
                int var25 = arg1 - var4.field3766;
                if (var25 > 0) {
                    int var26 = (var4.field3777 * var25 >> 8) + var4.field3772;
                    int var27 = (var4.field3775 * var25 >> 8) + var4.field3771;
                    int var28 = (var4.field3778 * var25 >> 8) + var4.field3767;
                    int var29 = (var4.field3761 * var25 >> 8) + var4.field3764;
                    if (arg0 >= var26 && arg0 <= var27 && arg2 >= var28 && arg2 <= var29) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(IIZ)I", line = 127)
    public static final int method2132(int arg0, int arg1, boolean arg2) {
        if (arg2) {
            method2135((String) null, 115, -99, -110, (byte[]) null, 127);
        }
        field4677++;
        if (arg1 == -2) {
            return 12345678;
        } else if (arg1 == -1) {
            if (arg0 < 2) {
                arg0 = 2;
            } else if (arg0 > 126) {
                arg0 = 126;
            }
            return arg0;
        } else {
            int var3 = (arg1 & 0x7F) * arg0 >> 7;
            if (var3 < 2) {
                var3 = 2;
            } else if (var3 > 126) {
                var3 = 126;
            }
            return (arg1 & 0xFF80) + var3;
        }
    }

    @OriginalMember(owner = "client!fs", name = "b", descriptor = "(I)V", line = 164)
    public final void method2133(int arg0) {
        field4683++;
        if (this.field4673 == null) {
            return;
        }
        this.field4673.field4676 = this.field4676;
        this.field4676.field4673 = this.field4673;
        if (arg0 != -31493) {
            field4672 = null;
        }
        this.field4676 = null;
        this.field4673 = null;
    }

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(Ljava/lang/String;ZZ)V", line = 186)
    public static final void method2134(String arg0, boolean arg1, boolean arg2) {
        field4682++;
        if (arg0 == null) {
            return;
        }
        if (class97.field1170 >= 100) {
            class105.method578(class144.field1781.method2331(25, class271.field3836), (byte) -45);
            return;
        }
        String var3 = class255.method1720((byte) 74, arg0);
        if (var3 == null) {
            return;
        }
        for (int var4 = 0; var4 < class97.field1170; var4++) {
            String var8 = class255.method1720((byte) 74, class138.field1724[var4]);
            if (var8 != null && var8.equals(var3)) {
                class105.method578(arg0 + class443.field6352.method2331(25, class271.field3836), (byte) -45);
                return;
            }
            if (class56.field680[var4] != null) {
                String var9 = class255.method1720((byte) 74, class56.field680[var4]);
                if (var9 != null && var9.equals(var3)) {
                    class105.method578(arg0 + class443.field6352.method2331(25, class271.field3836), (byte) -45);
                    return;
                }
            }
        }
        for (int var5 = 0; var5 < class247.field3533; var5++) {
            String var6 = class255.method1720((byte) 74, class334.field4733[var5]);
            if (var6 != null && var6.equals(var3)) {
                class105.method578(class54.field656.method2331(25, class271.field3836) + arg0 + class294.field4102.method2331(25, class271.field3836), (byte) -45);
                return;
            }
            if (class300.field4216[var5] != null) {
                String var7 = class255.method1720((byte) 74, class300.field4216[var5]);
                if (var7 != null && var7.equals(var3)) {
                    class105.method578(class54.field656.method2331(25, class271.field3836) + arg0 + class294.field4102.method2331(25, class271.field3836), (byte) -45);
                    return;
                }
            }
        }
        if (class255.method1720((byte) 74, class384.field5422.field487).equals(var3)) {
            class105.method578(class434.field6239.method2331(25, class271.field3836), (byte) -45);
            return;
        }
        class62.field718.method2143(70, -2);
        class396.field5641++;
        class62.field718.method1583(class81.method457(arg0, (byte) -49) + 1, (byte) -118);
        class62.field718.method1596(arg0, arg1);
        class62.field718.method1583(arg2 ? 1 : 0, (byte) -112);
    }

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(Ljava/lang/String;III[BI)I", line = 281)
    public static final int method2135(String arg0, int arg1, int arg2, int arg3, byte[] arg4, int arg5) {
        field4679++;
        int var6 = arg5 - arg2;
        for (int var7 = 0; var7 < var6; var7++) {
            char var8 = arg0.charAt(arg2 + var7);
            if (var8 > '\u0000' && var8 < '\u0080' || var8 >= ' ' && var8 <= 'ÿ') {
                arg4[arg1 + var7] = (byte) var8;
            } else if (var8 == '€') {
                arg4[arg1 + var7] = -128;
            } else if (var8 == '‚') {
                arg4[arg1 + var7] = -126;
            } else if (var8 == 'ƒ') {
                arg4[arg1 + var7] = -125;
            } else if (var8 == '„') {
                arg4[arg1 + var7] = -124;
            } else if (var8 == '…') {
                arg4[arg1 + var7] = -123;
            } else if (var8 == '†') {
                arg4[arg1 + var7] = -122;
            } else if (var8 == '‡') {
                arg4[arg1 + var7] = -121;
            } else if (var8 == 'ˆ') {
                arg4[arg1 + var7] = -120;
            } else if (var8 == '‰') {
                arg4[arg1 + var7] = -119;
            } else if (var8 == 'Š') {
                arg4[arg1 + var7] = -118;
            } else if (var8 == '‹') {
                arg4[arg1 + var7] = -117;
            } else if (var8 == 'Œ') {
                arg4[arg1 + var7] = -116;
            } else if (var8 == 'Ž') {
                arg4[arg1 + var7] = -114;
            } else if (var8 == '‘') {
                arg4[arg1 + var7] = -111;
            } else if (var8 == '’') {
                arg4[arg1 + var7] = -110;
            } else if (var8 == '“') {
                arg4[arg1 + var7] = -109;
            } else if (var8 == '”') {
                arg4[arg1 + var7] = -108;
            } else if (var8 == '•') {
                arg4[arg1 + var7] = -107;
            } else if (var8 == '–') {
                arg4[arg1 + var7] = -106;
            } else if (var8 == '—') {
                arg4[arg1 + var7] = -105;
            } else if (var8 == '˜') {
                arg4[arg1 + var7] = -104;
            } else if (var8 == '™') {
                arg4[arg1 + var7] = -103;
            } else if (var8 == 'š') {
                arg4[arg1 + var7] = -102;
            } else if (var8 == '›') {
                arg4[arg1 + var7] = -101;
            } else if (var8 == 'œ') {
                arg4[arg1 + var7] = -100;
            } else if (var8 == 'ž') {
                arg4[arg1 + var7] = -98;
            } else if (var8 == 'Ÿ') {
                arg4[arg1 + var7] = -97;
            } else {
                arg4[arg1 + var7] = 63;
            }
        }
        if (arg3 >= -2) {
            method2139(98);
        }
        return var6;
    }

    @OriginalMember(owner = "client!fs", name = "c", descriptor = "(I)Z", line = 419)
    public final boolean method2136(int arg0) {
        field4674++;
        if (this.field4673 == null) {
            return false;
        } else if (arg0 == 8) {
            return true;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(IIILp;IIIIBII)Z", line = 441)
    public static final boolean method2137(int arg0, int arg1, int arg2, class119 arg3, int arg4, int arg5, int arg6, int arg7, byte arg8, int arg9, int arg10) {
        field4678++;
        int var11 = arg6;
        int var12 = arg1;
        byte var13 = 64;
        if (arg8 >= -54) {
            field4675 = 78;
        }
        byte var14 = 64;
        int var15 = arg6 - var13;
        int var16 = arg1 - var14;
        class75.field887[var13][var14] = 99;
        class352.field4970[var13][var14] = 0;
        byte var17 = 0;
        int var18 = 0;
        class297.field4155[var17] = arg6;
        byte var10001 = var17;
        int var26 = var17 + 1;
        class327.field4648[var10001] = arg1;
        int[][] var19 = arg3.field1468;
        while (var26 != var18) {
            var12 = class327.field4648[var18];
            var11 = class297.field4155[var18];
            int var20 = var11 - arg3.field1455;
            var18 = var18 + 1 & 0xFFF;
            int var21 = var12 - var16;
            int var22 = var11 - var15;
            int var23 = var12 - arg3.field1466;
            if (arg2 == -4) {
                if (arg0 == var11 && arg5 == var12) {
                    class452.field6462 = var11;
                    class260.field3712 = var12;
                    return true;
                }
            } else if (arg2 == -3) {
                if (class40.method240(arg4, var12, 1, arg0, 0, arg7, 1, var11, arg5)) {
                    class452.field6462 = var11;
                    class260.field3712 = var12;
                    return true;
                }
            } else if (arg2 == -2) {
                if (arg3.method738(arg7, arg9, arg4, 1, 1180666916, arg0, var12, 1, var11, arg5)) {
                    class260.field3712 = var12;
                    class452.field6462 = var11;
                    return true;
                }
            } else if (arg2 == -1) {
                if (arg3.method743(-95, arg9, arg0, arg4, arg7, 1, var11, var12, arg5)) {
                    class452.field6462 = var11;
                    class260.field3712 = var12;
                    return true;
                }
            } else if (arg2 == 0 || arg2 == 1 || arg2 == 2 || arg2 == 3 || arg2 == 9) {
                if (arg3.method745(var11, var12, arg5, 1, arg0, arg2, 421, arg10)) {
                    class452.field6462 = var11;
                    class260.field3712 = var12;
                    return true;
                }
            } else if (arg3.method740(arg5, var12, 8192, arg2, arg0, 1, var11, arg10)) {
                class452.field6462 = var11;
                class260.field3712 = var12;
                return true;
            }
            int var25 = class352.field4970[var22][var21] + 1;
            if (var22 > 0 && class75.field887[var22 - 1][var21] == 0 && (var19[var20 - 1][var23] & 0x42240000) == 0) {
                class297.field4155[var26] = var11 - 1;
                class327.field4648[var26] = var12;
                class75.field887[var22 - 1][var21] = 2;
                var26 = var26 + 1 & 0xFFF;
                class352.field4970[var22 - 1][var21] = var25;
            }
            if (var22 < 127 && class75.field887[var22 + 1][var21] == 0 && (var19[var20 + 1][var23] & 0x60240000) == 0) {
                class297.field4155[var26] = var11 + 1;
                class327.field4648[var26] = var12;
                var26 = var26 + 1 & 0xFFF;
                class75.field887[var22 + 1][var21] = 8;
                class352.field4970[var22 + 1][var21] = var25;
            }
            if (var21 > 0 && class75.field887[var22][var21 - 1] == 0 && (var19[var20][var23 - 1] & 0x40A40000) == 0) {
                class297.field4155[var26] = var11;
                class327.field4648[var26] = var12 - 1;
                class75.field887[var22][var21 - 1] = 1;
                var26 = var26 + 1 & 0xFFF;
                class352.field4970[var22][var21 - 1] = var25;
            }
            if (var21 < 127 && class75.field887[var22][var21 + 1] == 0 && (var19[var20][var23 + 1] & 0x48240000) == 0) {
                class297.field4155[var26] = var11;
                class327.field4648[var26] = var12 + 1;
                class75.field887[var22][var21 + 1] = 4;
                var26 = var26 + 1 & 0xFFF;
                class352.field4970[var22][var21 + 1] = var25;
            }
            if (var22 > 0 && var21 > 0 && class75.field887[var22 - 1][var21 - 1] == 0 && (var19[var20 - 1][var23 - 1] & 0x43A40000) == 0 && (var19[var20 - 1][var23] & 0x42240000) == 0 && (var19[var20][var23 - 1] & 0x40A40000) == 0) {
                class297.field4155[var26] = var11 - 1;
                class327.field4648[var26] = var12 - 1;
                var26 = var26 + 1 & 0xFFF;
                class75.field887[var22 - 1][var21 - 1] = 3;
                class352.field4970[var22 - 1][var21 - 1] = var25;
            }
            if (var22 < 127 && var21 > 0 && class75.field887[var22 + 1][var21 - 1] == 0 && (var19[var20 + 1][var23 - 1] & 0x60E40000) == 0 && (var19[var20 + 1][var23] & 0x60240000) == 0 && (var19[var20][var23 - 1] & 0x40A40000) == 0) {
                class297.field4155[var26] = var11 + 1;
                class327.field4648[var26] = var12 - 1;
                class75.field887[var22 + 1][var21 - 1] = 9;
                var26 = var26 + 1 & 0xFFF;
                class352.field4970[var22 + 1][var21 - 1] = var25;
            }
            if (var22 > 0 && var21 < 127 && class75.field887[var22 - 1][var21 + 1] == 0 && (var19[var20 - 1][var23 + 1] & 0x4E240000) == 0 && (var19[var20 - 1][var23] & 0x42240000) == 0 && (var19[var20][var23 + 1] & 0x48240000) == 0) {
                class297.field4155[var26] = var11 - 1;
                class327.field4648[var26] = var12 + 1;
                var26 = var26 + 1 & 0xFFF;
                class75.field887[var22 - 1][var21 + 1] = 6;
                class352.field4970[var22 - 1][var21 + 1] = var25;
            }
            if (var22 < 127 && var21 < 127 && class75.field887[var22 + 1][var21 + 1] == 0 && (var19[var20 + 1][var23 + 1] & 0x78240000) == 0 && (var19[var20 + 1][var23] & 0x60240000) == 0 && (var19[var20][var23 + 1] & 0x48240000) == 0) {
                class297.field4155[var26] = var11 + 1;
                class327.field4648[var26] = var12 + 1;
                var26 = var26 + 1 & 0xFFF;
                class75.field887[var22 + 1][var21 + 1] = 12;
                class352.field4970[var22 + 1][var21 + 1] = var25;
            }
        }
        class260.field3712 = var12;
        class452.field6462 = var11;
        return false;
    }

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(I[[[BIBII)V", line = 688)
    public static final void method2138(int arg0, byte[][][] arg1, int arg2, byte arg3, int arg4, int arg5) {
        class396.field5655++;
        class423.field6058 = 0;
        for (int var6 = class55.field668; var6 < class167.field2334; var6++) {
            class193[][] var17 = class250.field3570[var6];
            for (int var18 = class216.field3050; var18 < class50.field605; var18++) {
                for (int var19 = class380.field5349; var19 < class161.field2129; var19++) {
                    class193 var20 = var17[var18][var19];
                    if (var20 != null) {
                        if (class29.field357[var18 + class76.field898 - class444.field6379][var19 + class76.field898 - class137.field1706] && arg1 == null || var6 < arg2 || arg1[var6][var18][var19] != arg3) {
                            var20.field2795 = true;
                            var20.field2782 = true;
                            if (var20.field2779 == null) {
                                var20.field2796 = false;
                            } else {
                                var20.field2796 = true;
                            }
                            class423.field6058++;
                        } else {
                            var20.field2795 = false;
                            var20.field2782 = false;
                            var20.field2797 = 0;
                            if (var18 >= class444.field6379 - 16 && var18 <= class444.field6379 + 16 && var19 >= class137.field1706 - 16 && var19 <= class137.field1706 + 16 && (var20.field2784 != null || var20.field2771 != null || var20.field2788 != null || var20.field2786 != null || var20.field2790 != null || var20.field2779 != null)) {
                                class144.field1782.method200(-17986, var20);
                            }
                        }
                    }
                }
            }
        }
        boolean var7 = class399.field5693 == class161.field2122;
        for (int var8 = class55.field668; var8 < class167.field2334; var8++) {
            float var9 = var7 ? 251.5F : 201.5F - (float) var8 * 50.0F - 0.5F;
            if (class36.field422.method609() && var8 >= arg2 && arg1 != null) {
                int var10 = class29.field357.length;
                if (class29.field357.length + class216.field3050 > class415.field5953) {
                    var10 -= class29.field357.length + class216.field3050 - class415.field5953;
                }
                int var11 = class29.field357[0].length;
                if (class29.field357[0].length + class380.field5349 > class299.field4190) {
                    var11 -= class29.field357[0].length + class380.field5349 - class299.field4190;
                }
                int var12 = class123.field1502;
                while (true) {
                    if (var12 >= var10) {
                        class144.field1782.method204(var8, true, var9, (byte) -111, class161.field2122[var8]);
                        break;
                    }
                    int var13 = class216.field3050 + var12 - class123.field1502;
                    for (int var14 = class210.field2996; var14 < var11; var14++) {
                        class337.field4793[var12][var14] = false;
                        if (class29.field357[var12][var14]) {
                            int var15 = class380.field5349 + var14 - class210.field2996;
                            for (int var16 = var8; var16 >= 0; var16--) {
                                if (class250.field3570[var16][var13][var15] != null && class250.field3570[var16][var13][var15].field2789 == var8) {
                                    class337.field4793[var12][var14] = class250.field3570[var16][var13][var15].field2795;
                                    break;
                                }
                            }
                        }
                    }
                    var12++;
                }
            } else {
                class144.field1782.method204(var8, false, var9, (byte) -107, class161.field2122[var8]);
            }
            class144.field1782.method201(0);
        }
        if (!class258.method1732(true)) {
            class258.method1732(false);
        }
    }

    @OriginalMember(owner = "client!fs", name = "d", descriptor = "(I)V", line = 828)
    public static void method2139(int arg0) {
        field4672 = null;
        if (arg0 != 3) {
            method2132(-41, 44, true);
        }
    }
}
