import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!an")
public abstract class class322 extends class86 {

    @OriginalMember(owner = "client!an", name = "A", descriptor = "Z")
    public volatile boolean field5004 = true;

    @OriginalMember(owner = "client!an", name = "D", descriptor = "I")
    public static int field5007 = -1;

    @OriginalMember(owner = "client!an", name = "w", descriptor = "[Ljava/lang/String;")
    public static String[] field5000 = new String[5];

    @OriginalMember(owner = "client!an", name = "G", descriptor = "Lta;")
    public static class197 field5010 = new class197(64);

    @OriginalMember(owner = "client!an", name = "v", descriptor = "I")
    public static int field4999;

    @OriginalMember(owner = "client!an", name = "y", descriptor = "I")
    public static int field5002;

    @OriginalMember(owner = "client!an", name = "z", descriptor = "I")
    public static int field5003;

    @OriginalMember(owner = "client!an", name = "B", descriptor = "I")
    public static int field5005;

    @OriginalMember(owner = "client!an", name = "C", descriptor = "I")
    public static int field5006;

    @OriginalMember(owner = "client!an", name = "F", descriptor = "I")
    public static int field5009;

    @OriginalMember(owner = "client!an", name = "I", descriptor = "Lek;")
    public static class184 field5012;

    @OriginalMember(owner = "client!an", name = "H", descriptor = "Llb;")
    public static class211 field5011;

    @OriginalMember(owner = "client!an", name = "u", descriptor = "Z")
    public boolean field4998;

    @OriginalMember(owner = "client!an", name = "E", descriptor = "Z")
    public boolean field5008;

    @OriginalMember(owner = "client!an", name = "x", descriptor = "[S")
    public static short[] field5001;

    @OriginalMember(owner = "client!an", name = "t", descriptor = "[Z")
    public static boolean[] field4997;

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(Ljava/lang/String;IIZIZJLjava/lang/String;IIZ)V", line = 11)
    public static final void method2196(String arg0, int arg1, int arg2, boolean arg3, int arg4, boolean arg5, long arg6, String arg7, int arg8, int arg9, boolean arg10) {
        field5006++;
        int[] var12 = new int[4];
        for (int var13 = 0; var13 < 3; var13++) {
            var12[var13] = (int) (Math.random() * 9.9999999E7D);
        }
        class35 var14 = new class35(128);
        var14.method262((byte) 81, 10);
        var14.method263((arg10 ? 2 : 0) | (arg3 ? 1 : 0) | (arg5 ? 4 : 0), (byte) 103);
        var14.method261(1523335144, arg6);
        var14.method259(arg9 - 15227, var12[0]);
        var14.method277(arg0, 4773);
        var14.method259(-15195, var12[1]);
        var14.method263(class317.field4923, (byte) 125);
        var14.method262((byte) 81, arg4);
        var14.method262((byte) 81, arg2);
        var14.method259(-15195, var12[2]);
        var14.method263(arg8, (byte) 112);
        var14.method263(arg1, (byte) 95);
        var14.method259(arg9 ^ 0xFFFFC485, var12[3]);
        var14.method302((byte) 111, class77.field1078, class49.field764);
        class35 var15 = new class35(128);
        var15.method277(arg7, arg9 ^ 0x1285);
        int var16 = 8 - (class206.method1473((byte) -92, arg7) % 8);
        for (int var17 = 0; var17 < var16; var17++) {
            var15.method262((byte) 81, (int) (Math.random() * 255.0D));
        }
        var15.method287(6991, var12);
        class159.field2372.field455 = 0;
        if (arg9 != 32) {
            method2197(-11, -94, (String) null);
        }
        class159.field2372.method262((byte) 81, 22);
        class159.field2372.method262((byte) 81, 2 - (-var14.field455 - var15.field455));
        class159.field2372.method263(532, (byte) 98);
        class159.field2372.method278(0, var14.field455, (byte) 24, var14.field437);
        class159.field2372.method278(0, var15.field455, (byte) 24, var15.field437);
        class4.field26 = 0;
        class204.field3240 = 1;
        class179.field2685 = -3;
        class324.field5044 = 0;
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(IILjava/lang/String;)V", line = 73)
    public static final void method2197(int arg0, int arg1, String arg2) {
        if (arg0 <= 95) {
            method2201(true);
        }
        field5005++;
        class147 var3 = class92.method731(-29125, arg1, 3);
        var3.method1095(108);
        var3.field2244 = arg2;
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(ILri;)V", line = 87)
    public static final void method2198(int arg0, class68 arg1) {
        if (arg1.field1007 != null) {
            arg1.field1007.field1885 = 0;
        }
        if (arg0 != -14158) {
            field5007 = -49;
        }
        field5003++;
        arg1.field1005 = false;
        for (class68 var2 = arg1.method575(); var2 != null; var2 = arg1.method570()) {
            method2198(arg0 ^ 0x0, var2);
        }
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(IILek;II)V", line = 130)
    public static final void method2199(int arg0, int arg1, class184 arg2, int arg3, int arg4) {
        field4999++;
        client.method1774(-116);
        if (class36.field534) {
            class194.method1416(arg1, arg4, arg2.field2890 + arg1, arg2.field2904 + arg4);
        } else {
            class168.method1234(arg1, arg4, arg1 + arg2.field2890, arg2.field2904 + arg4);
        }
        if (class3.field14 != 2 && class3.field14 != 5 && class188.field3000 != null) {
            int var5 = class136.field2125 + class99.field1459 & 0x7FF;
            int var6 = class235.field3602.field4507 / 32 + 48;
            int var7 = 464 - (class235.field3602.field4496 / 32);
            if (class36.field534) {
                ((class221) class188.field3000).method1579(arg1, arg4, arg2.field2890, arg2.field2904, var6, var7, var5, class317.field4929 + 256, (class221) arg2.method1342(1, false));
            } else {
                ((class134) class188.field3000).method1022(arg1, arg4, arg2.field2890, arg2.field2904, var6, var7, var5, class317.field4929 + 256, arg2.field2929, arg2.field2836);
            }
            if (class12.field133 != null) {
                for (int var8 = 0; var8 < class12.field133.field112; var8++) {
                    if (class12.field133.method86((byte) 127, var8)) {
                        int var9 = (class12.field133.field125[var8] - class302.field4735) * 4 + 2 - (class235.field3602.field4507 / 32);
                        int var10 = (class12.field133.field109[var8] - class110.field1744) * 4 + 2 - (class235.field3602.field4496 / 32);
                        int var11 = class56.field838[var5];
                        int var12 = class56.field830[var5];
                        int var13 = var12 * 256 / (class317.field4929 + 256);
                        int var14 = var11 * 256 / (class317.field4929 + 256);
                        int var15 = var9 * var13 + var10 * var14 >> 16;
                        int var16 = var10 * var13 - var9 * var14 >> 16;
                        class48 var17 = class136.field2119;
                        if (class12.field133.method87(var8, false) == 1) {
                            var17 = class182.field2726;
                        }
                        if (class12.field133.method87(var8, false) == 2) {
                            var17 = class64.field956;
                        }
                        int var18 = var17.method438(class12.field133.field119[var8], 100);
                        int var19 = var15 - var18 / 2;
                        if (-arg2.field2890 <= var19 && arg2.field2890 >= var19 && (-arg2.field2904) <= var16 && arg2.field2904 >= var16) {
                            int var20 = 16777215;
                            if (class12.field133.field123[var8] != -1) {
                                var20 = class12.field133.field123[var8];
                            }
                            if (class36.field534) {
                                class194.method1410((class221) arg2.method1342(1, false));
                            } else {
                                class168.method1233(arg2.field2929, arg2.field2836);
                            }
                            var17.method446(class12.field133.field119[var8], arg2.field2890 / 2 + (var19 + arg1), arg2.field2904 / 2 + -var16 + arg4, var18, 50, var20, 0, 256, 1, 0, 0);
                            if (class36.field534) {
                                class194.method1411();
                            } else {
                                class168.method1227();
                            }
                        }
                    }
                }
            }
            for (int var21 = 0; var21 < class156.field2340; var21++) {
                int var22 = class147.field2246[var21] * 4 + 2 - class235.field3602.field4507 / 32;
                int var23 = class212.field3373[var21] * 4 + 2 - (class235.field3602.field4496 / 32);
                class101 var24 = class281.method1984(class160.field2381[var21], false);
                if (var24.field1542 != null) {
                    var24 = var24.method784(true);
                    if (var24 == null || var24.field1566 == -1) {
                        continue;
                    }
                }
                class81.method636(arg1, var22, -2067, arg4, arg2, var23, class126.field1998[var24.field1566]);
            }
            for (int var25 = 0; var25 < 104; var25++) {
                for (int var26 = 0; var26 < 104; var26++) {
                    class128 var27 = class281.field4336[class50.field775][var25][var26];
                    if (var27 != null) {
                        int var28 = var26 * 4 + 2 - (class235.field3602.field4496 / 32);
                        int var29 = var25 * 4 + 2 - (class235.field3602.field4507 / 32);
                        class81.method636(arg1, var29, -2067, arg4, arg2, var28, class121.field1888[0]);
                    }
                }
            }
            for (int var30 = 0; var30 < class122.field1923; var30++) {
                class45 var31 = class161.field2394[class126.field1995[var30]];
                if (var31 != null && var31.method409(1)) {
                    class183 var32 = var31.field698;
                    if (var32 != null && var32.field2738 != null) {
                        var32 = var32.method1329(118);
                    }
                    if (var32 != null && var32.field2753 && var32.field2785) {
                        int var33 = var31.field4496 / 32 - (class235.field3602.field4496 / 32);
                        int var34 = var31.field4507 / 32 - class235.field3602.field4507 / 32;
                        if (var32.field2740 == -1) {
                            class81.method636(arg1, var34, -2067, arg4, arg2, var33, class121.field1888[1]);
                        } else {
                            class81.method636(arg1, var34, -2067, arg4, arg2, var33, class126.field1998[var32.field2740]);
                        }
                    }
                }
            }
            for (int var35 = 0; var35 < class262.field3900; var35++) {
                class121 var36 = class319.field4964[class225.field3504[var35]];
                if (var36 != null && var36.method409(arg0 ^ 0x5)) {
                    int var37 = var36.field4507 / 32 - class235.field3602.field4507 / 32;
                    boolean var38 = false;
                    int var39 = var36.field4496 / 32 - (class235.field3602.field4496 / 32);
                    long var40 = class224.method1597(true, var36.field1895);
                    for (int var42 = 0; var42 < class314.field4873; var42++) {
                        if (class37.field549[var42] == var40 && class299.field4709[var42] != 0) {
                            var38 = true;
                            break;
                        }
                    }
                    boolean var43 = false;
                    for (int var44 = 0; var44 < class78.field1098; var44++) {
                        if (class317.field4927[var44].field3418 == var40) {
                            var43 = true;
                            break;
                        }
                    }
                    boolean var45 = false;
                    if (class235.field3602.field1912 != 0 && var36.field1912 != 0 && class235.field3602.field1912 == var36.field1912) {
                        var45 = true;
                    }
                    if (var38) {
                        class81.method636(arg1, var37, -2067, arg4, arg2, var39, class121.field1888[3]);
                    } else if (var43) {
                        class81.method636(arg1, var37, -2067, arg4, arg2, var39, class121.field1888[5]);
                    } else if (var45) {
                        class81.method636(arg1, var37, -2067, arg4, arg2, var39, class121.field1888[4]);
                    } else {
                        class81.method636(arg1, var37, arg0 ^ 0xFFFFF7E9, arg4, arg2, var39, class121.field1888[2]);
                    }
                }
            }
            class273[] var46 = class141.field2185;
            for (int var47 = 0; var47 < var46.length; var47++) {
                class273 var48 = var46[var47];
                if (var48 != null && var48.field4132 != 0 && class312.field4852 % 20 < 10) {
                    if (var48.field4132 == 1 && var48.field4136 >= 0 && class161.field2394.length > var48.field4136) {
                        class45 var49 = class161.field2394[var48.field4136];
                        if (var49 != null) {
                            int var50 = var49.field4507 / 32 - (class235.field3602.field4507 / 32);
                            int var51 = var49.field4496 / 32 - (class235.field3602.field4496 / 32);
                            class27.method188(var48.field4127, arg4, arg0 + 12, arg2, var50, var51, arg1);
                        }
                    }
                    if (var48.field4132 == 2) {
                        int var52 = (var48.field4140 - class110.field1744) * 4 + 2 - (class235.field3602.field4496 / 32);
                        int var53 = (var48.field4139 - class302.field4735) * 4 + 2 - (class235.field3602.field4507 / 32);
                        class27.method188(var48.field4127, arg4, 16, arg2, var53, var52, arg1);
                    }
                    if (var48.field4132 == 10 && var48.field4136 >= 0 && class319.field4964.length > var48.field4136) {
                        class121 var54 = class319.field4964[var48.field4136];
                        if (var54 != null) {
                            int var55 = var54.field4507 / 32 - class235.field3602.field4507 / 32;
                            int var56 = var54.field4496 / 32 - class235.field3602.field4496 / 32;
                            class27.method188(var48.field4127, arg4, 16, arg2, var55, var56, arg1);
                        }
                    }
                }
            }
            if (class327.field5075 != 0) {
                int var57 = class327.field5075 * 4 + 2 - (class235.field3602.field4507 / 32);
                int var58 = class261.field3868 * 4 + 2 - (class235.field3602.field4496 / 32);
                class81.method636(arg1, var57, -2067, arg4, arg2, var58, class200.field3172);
            }
            if (class36.field534) {
                class194.method1413(arg1 + (arg2.field2890 / 2) - 1, arg4 + -1 - -(arg2.field2904 / 2), 3, 3, 16777215);
            } else {
                class168.method1224(arg2.field2890 / 2 + arg1 - 1, arg4 + -1 - -(arg2.field2904 / 2), 3, 3, 16777215);
            }
        } else if (class36.field534) {
            class27 var59 = arg2.method1342(1, false);
            if (var59 != null) {
                var59.method186(arg1, arg4);
            }
        } else {
            class168.method1223(arg1, arg4, 0, arg2.field2929, arg2.field2836);
        }
        if (arg0 == 4) {
            class238.field3621[arg3] = true;
        }
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(ZI)I", line = 472)
    public static final int method2200(boolean arg0, int arg1) {
        field5009++;
        if (!arg0) {
            method2196((String) null, -112, -121, false, 116, false, -30L, (String) null, 68, -55, true);
        }
        return arg1 & 0xFF;
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(Z)V", line = 486)
    public static void method2201(boolean arg0) {
        field5001 = null;
        field5012 = null;
        field4997 = null;
        if (!arg0) {
            method2201(false);
        }
        field5000 = null;
        field5011 = null;
        field5010 = null;
    }

    @OriginalMember(owner = "client!an", name = "b", descriptor = "(I)I")
    public abstract int method56(int arg0);

    @OriginalMember(owner = "client!an", name = "d", descriptor = "(B)[B")
    public abstract byte[] method54(byte arg0);
}
