import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nl")
public class class29 extends class247 {

    @OriginalMember(owner = "client!nl", name = "u", descriptor = "I")
    public int field362;

    @OriginalMember(owner = "client!nl", name = "z", descriptor = "I")
    public int field367;

    @OriginalMember(owner = "client!nl", name = "m", descriptor = "[Ljava/lang/String;")
    public static String[] field354 = new String[100];

    @OriginalMember(owner = "client!nl", name = "y", descriptor = "I")
    public static int field366 = 0;

    @OriginalMember(owner = "client!nl", name = "E", descriptor = "I")
    public static int field372 = 2;

    @OriginalMember(owner = "client!nl", name = "l", descriptor = "I")
    public static int field353;

    @OriginalMember(owner = "client!nl", name = "n", descriptor = "I")
    public static int field355;

    @OriginalMember(owner = "client!nl", name = "o", descriptor = "I")
    public static int field356;

    @OriginalMember(owner = "client!nl", name = "p", descriptor = "I")
    public static int field357;

    @OriginalMember(owner = "client!nl", name = "q", descriptor = "I")
    public static int field358;

    @OriginalMember(owner = "client!nl", name = "r", descriptor = "I")
    public static int field359;

    @OriginalMember(owner = "client!nl", name = "s", descriptor = "I")
    public static int field360;

    @OriginalMember(owner = "client!nl", name = "t", descriptor = "I")
    public static int field361;

    @OriginalMember(owner = "client!nl", name = "v", descriptor = "I")
    public static int field363;

    @OriginalMember(owner = "client!nl", name = "w", descriptor = "I")
    public static int field364;

    @OriginalMember(owner = "client!nl", name = "x", descriptor = "I")
    public static int field365;

    @OriginalMember(owner = "client!nl", name = "A", descriptor = "I")
    public static int field368;

    @OriginalMember(owner = "client!nl", name = "B", descriptor = "I")
    public static int field369;

    @OriginalMember(owner = "client!nl", name = "C", descriptor = "I")
    public static int field370;

    @OriginalMember(owner = "client!nl", name = "D", descriptor = "I")
    public static int field371;

    @OriginalMember(owner = "client!nl", name = "F", descriptor = "I")
    public static int field373;

    @OriginalMember(owner = "client!nl", name = "G", descriptor = "I")
    public static int field374;

    @OriginalMember(owner = "client!nl", name = "H", descriptor = "I")
    public static int field375;

    @OriginalMember(owner = "client!nl", name = "I", descriptor = "I")
    public static int field376;

    @OriginalMember(owner = "client!nl", name = "b", descriptor = "(B)Z")
    public final boolean method145(byte arg0) {
        int var2 = -18 / ((arg0 + 2) / 42);
        field376++;
        return (this.field367 >> 22 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(IIILaj;)V")
    public static final void method146(int arg0, int arg1, int arg2, class1 arg3) {
        if ((arg0 & 0x8) != 0) {
            int var4 = class175.field2763.method1186((byte) -122);
            boolean var5 = (var4 & 0x8000) != 0;
            int var6 = class175.field2763.method1211(arg1 + 70);
            int var7 = class175.field2763.method1182((byte) -83);
            int var8 = class175.field2763.field2676;
            if (arg3.field31 != null && arg3.field33 != null) {
                long var9 = class176.method1256((byte) 127, arg3.field31);
                boolean var11 = false;
                if (var6 <= 1) {
                    if (!var5 && (class235.field3799 && !class83.field1280 || class211.field3283)) {
                        var11 = true;
                    } else {
                        for (int var12 = 0; var12 < class84.field1302; var12++) {
                            if (class58.field863[var12] == var9) {
                                var11 = true;
                                break;
                            }
                        }
                    }
                }
                if (!var11 && class104.field1515 == 0) {
                    class187.field2932.field2676 = 0;
                    class175.field2763.method1165(0, false, var7, class187.field2932.field2650);
                    class187.field2932.field2676 = 0;
                    int var13 = -1;
                    String var15;
                    if (var5) {
                        var4 &= 0x7FFF;
                        class233 var14 = class146.method997(226, class187.field2932);
                        var13 = var14.field3761;
                        var15 = var14.field3767.method466(-25161, class187.field2932);
                    } else {
                        var15 = class213.method1472(class128.method825(false, class277.method1920(class187.field2932, -112)));
                    }
                    arg3.field3954 = var15.trim();
                    arg3.field3982 = 150;
                    arg3.field3950 = var4 >> 8;
                    arg3.field3887 = var4 & 0xFF;
                    if (var6 == 2) {
                        class102.method686(var15, (String) null, (byte) -108, "<img=1>" + arg3.method6(113), var13, var5 ? 17 : 1);
                    } else if (var6 == 1) {
                        class102.method686(var15, (String) null, (byte) -108, "<img=0>" + arg3.method6(arg1 ^ 0x70), var13, var5 ? 17 : 1);
                    } else {
                        class102.method686(var15, (String) null, (byte) -89, arg3.method6(113), var13, var5 ? 17 : 2);
                    }
                }
            }
            class175.field2763.field2676 = var7 + var8;
        }
        if ((arg0 & 0x10) != 0) {
            int var16 = class175.field2763.method1182((byte) -101);
            byte[] var17 = new byte[var16];
            class170 var18 = new class170(var17);
            class175.field2763.method1217(0, var17, var16, 20435);
            class291.field4687[arg2] = var18;
            arg3.method11(false, var18);
        }
        field353++;
        if ((arg0 & 0x400) != 0) {
            int var19 = class175.field2763.method1186((byte) -82);
            if (var19 == 65535) {
                var19 = -1;
            }
            int var20 = class175.field2763.method1209(-1);
            boolean var21 = true;
            if (var19 != -1 && arg3.field3904 != -1 && class174.method1241(61, class92.method629(var19, 12288).field3338).field833 < class174.method1241(arg1 ^ 0xFFFFFF80, class92.method629(arg3.field3904, arg1 + 12287).field3338).field833) {
                var21 = false;
            }
            if (var21) {
                arg3.field3909 = 0;
                arg3.field3930 = 0;
                arg3.field3904 = var19;
                arg3.field3893 = 1;
                arg3.field3935 = class311.field4996 + (var20 & 0xFFFF);
                if (class311.field4996 < arg3.field3935) {
                    arg3.field3930 = -1;
                }
                arg3.field3963 = var20 >> 16;
                if (arg3.field3904 != -1 && class311.field4996 == arg3.field3935) {
                    int var22 = class92.method629(arg3.field3904, 12288).field3338;
                    if (var22 != -1) {
                        class57 var23 = class174.method1241(115, var22);
                        if (var23 != null && var23.field850 != null) {
                            class173.method1240(arg3.field3915, arg3.field3920, arg1 ^ 0xFFFFDC39, class214.field3347 == arg3, var23, 0);
                        }
                    }
                }
            }
        }
        if ((arg0 & 0x2) != 0) {
            int var24 = class175.field2763.method1162(-129);
            int var25 = class175.field2763.method1182((byte) -113);
            arg3.method1731(var24, class311.field4996, true, var25);
            arg3.field3944 = class311.field4996 + 300;
            arg3.field3890 = class175.field2763.method1196((byte) 17);
        }
        if ((arg0 & arg1) != 0) {
            arg3.field3954 = class175.field2763.method1195(-1);
            if (arg3.field3954.charAt(0) == '~') {
                arg3.field3954 = arg3.field3954.substring(1);
                class236.method1655(2, arg3.method6(113), 101, arg3.field3954);
            } else if (class214.field3347 == arg3) {
                class236.method1655(2, arg3.method6(113), 125, arg3.field3954);
            }
            arg3.field3887 = 0;
            arg3.field3950 = 0;
            arg3.field3982 = 150;
        }
        if ((arg0 & 0x800) != 0) {
            int var26 = class175.field2763.method1218(126);
            int[] var27 = new int[var26];
            int[] var28 = new int[var26];
            int[] var29 = new int[var26];
            for (int var30 = 0; var30 < var26; var30++) {
                int var31 = class175.field2763.method1186((byte) -90);
                if (var31 == 65535) {
                    var31 = -1;
                }
                var27[var30] = var31;
                var28[var30] = class175.field2763.method1218(arg1 - 28);
                var29[var30] = class175.field2763.method1186((byte) -42);
            }
            class83.method570((byte) 76, var27, var29, var28, arg3);
        }
        if ((arg0 & 0x20) != 0) {
            arg3.field3927 = class175.field2763.method1172(true);
            if (arg3.field3927 == 65535) {
                arg3.field3927 = -1;
            }
        }
        if ((arg0 & 0x200) != 0) {
            int var32 = class175.field2763.method1162(-129);
            int var33 = class175.field2763.method1196((byte) 60);
            arg3.method1731(var32, class311.field4996, true, var33);
        }
        if ((arg0 & 0x100) != 0) {
            arg3.field3916 = class175.field2763.method1196((byte) 14);
            arg3.field3895 = class175.field2763.method1218(arg1 ^ 0x4A);
            arg3.field3945 = class175.field2763.method1218(82);
            arg3.field3911 = class175.field2763.method1218(arg1 + 118);
            arg3.field3888 = class175.field2763.method1189(-91) + class311.field4996;
            arg3.field3975 = class175.field2763.method1189(-60) + class311.field4996;
            arg3.field3929 = class175.field2763.method1218(68);
            arg3.field3974 = 1;
            arg3.field3976 = 0;
        }
        if ((arg0 & 0x40) != 0) {
            int var34 = class175.field2763.method1200(128);
            int var35 = class175.field2763.method1182((byte) -93);
            if (var34 == 65535) {
                var34 = -1;
            }
            method150(-79, var35, arg3, var34);
        }
        if ((arg0 & 0x4) != 0) {
            arg3.field3905 = class175.field2763.method1186((byte) -88);
            arg3.field3897 = class175.field2763.method1200(128);
        }
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(II)Z")
    public final boolean method147(int arg0, int arg1) {
        field365++;
        if (arg1 != -15469) {
            field358 = 4;
        }
        return (this.field367 >> arg0 + 1 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(I[[[Lda;IIZI)Z")
    public static final boolean method148(int arg0, class113[][][] arg1, int arg2, int arg3, boolean arg4, int arg5) {
        field371++;
        byte var6 = arg4 ? 1 : (byte) (class1.field28 & 0xFF);
        if (arg2 != 9568256) {
            method146(42, -68, -69, (class1) null);
        }
        if (class19.field259[class148.field2204][arg3][arg5] == var6) {
            return false;
        } else if ((class74.field1121[class148.field2204][arg3][arg5] & 0x4) == 0) {
            return false;
        } else {
            byte var7 = 0;
            int var8 = 0;
            class261.field4248[var7] = arg3;
            int var31 = var7 + 1;
            class86.field1313[var7] = arg5;
            class19.field259[class148.field2204][arg3][arg5] = var6;
            while (var31 != var8) {
                int var9 = class261.field4248[var8] >> 16 & 0xFF;
                int var10 = class261.field4248[var8] >> 24 & 0xFF;
                int var11 = class261.field4248[var8] & 0xFFFF;
                int var12 = class86.field1313[var8] & 0xFFFF;
                int var13 = class86.field1313[var8] >> 16 & 0xFF;
                var8 = var8 + 1 & 0xFFF;
                boolean var14 = false;
                if ((class74.field1121[class148.field2204][var11][var12] & 0x4) == 0) {
                    var14 = true;
                }
                boolean var15 = false;
                label229: for (int var16 = class148.field2204 + 1; var16 <= 3; var16++) {
                    if ((class74.field1121[var16][var11][var12] & 0x8) == 0) {
                        if (var14 && arg1[var16][var11][var12] != null) {
                            if (arg1[var16][var11][var12].field1640 != null) {
                                int var19 = class284.method1947(var9, (byte) -39);
                                if (arg1[var16][var11][var12].field1640.field4276 == var19 || arg1[var16][var11][var12].field1640.field4278 == var19) {
                                    continue;
                                }
                                if (var10 != 0) {
                                    int var20 = class284.method1947(var10, (byte) -39);
                                    if (arg1[var16][var11][var12].field1640.field4276 == var20 || arg1[var16][var11][var12].field1640.field4278 == var20) {
                                        continue;
                                    }
                                }
                                if (var13 != 0) {
                                    int var21 = class284.method1947(var13, (byte) -39);
                                    if (arg1[var16][var11][var12].field1640.field4276 == var21 || arg1[var16][var11][var12].field1640.field4278 == var21) {
                                        continue;
                                    }
                                }
                            }
                            if (arg1[var16][var11][var12].field1634 != null) {
                                for (int var22 = 0; var22 < arg1[var16][var11][var12].field1646; var22++) {
                                    int var23 = (int) (arg1[var16][var11][var12].field1634[var22].field2354 >> 14 & 0x3FL);
                                    if (var23 == 21) {
                                        var23 = 19;
                                    }
                                    int var24 = (int) (arg1[var16][var11][var12].field1634[var22].field2354 >> 20 & 0x3L);
                                    int var25 = var24 << 6 | var23;
                                    if (var9 == var25 || var10 != 0 && var10 == var25 || var13 != 0 && var13 == var25) {
                                        continue label229;
                                    }
                                }
                            }
                        }
                        var15 = true;
                        class113 var26 = arg1[var16][var11][var12];
                        if (var26 != null && var26.field1646 > 0) {
                            for (int var27 = 0; var27 < var26.field1646; var27++) {
                                class158 var28 = var26.field1634[var27];
                                if (var28.field2368 != var28.field2352 || var28.field2363 != var28.field2359) {
                                    for (int var29 = var28.field2352; var29 <= var28.field2368; var29++) {
                                        for (int var30 = var28.field2359; var30 <= var28.field2363; var30++) {
                                            class19.field259[var16][var29][var30] = var6;
                                        }
                                    }
                                }
                            }
                        }
                        class19.field259[var16][var11][var12] = var6;
                    }
                }
                if (var15) {
                    if (class161.field2409[arg0] < class8.field114[class148.field2204 + 1][var11][var12]) {
                        class161.field2409[arg0] = class8.field114[class148.field2204 + 1][var11][var12];
                    }
                    int var17 = var11 << 7;
                    int var18 = var12 << 7;
                    if (class123.field1778[arg0] > var17) {
                        class123.field1778[arg0] = var17;
                    } else if (var17 > class31.field379[arg0]) {
                        class31.field379[arg0] = var17;
                    }
                    if (class10.field152[arg0] > var18) {
                        class10.field152[arg0] = var18;
                    } else if (class225.field3505[arg0] < var18) {
                        class225.field3505[arg0] = var18;
                    }
                }
                if (!var14) {
                    if (var11 >= 1 && class19.field259[class148.field2204][var11 - 1][var12] != var6) {
                        class261.field4248[var31] = class243.method1723(-754974720, class243.method1723(1179648, var11 - 1));
                        class86.field1313[var31] = class243.method1723(1245184, var12);
                        var31 = var31 + 1 & 0xFFF;
                        class19.field259[class148.field2204][var11 - 1][var12] = var6;
                    }
                    var12++;
                    if (var12 < 104) {
                        if (var11 - 1 >= 0 && class19.field259[class148.field2204][var11 - 1][var12] != var6 && (class74.field1121[class148.field2204][var11][var12] & 0x4) == 0 && (class74.field1121[class148.field2204][var11 - 1][var12 - 1] & 0x4) == 0) {
                            class261.field4248[var31] = class243.method1723(1375731712, class243.method1723(var11 - 1, 1179648));
                            class86.field1313[var31] = class243.method1723(1245184, var12);
                            var31 = var31 + 1 & 0xFFF;
                            class19.field259[class148.field2204][var11 - 1][var12] = var6;
                        }
                        if (class19.field259[class148.field2204][var11][var12] != var6) {
                            class261.field4248[var31] = class243.method1723(class243.method1723(5373952, var11), 318767104);
                            class86.field1313[var31] = class243.method1723(5439488, var12);
                            var31 = var31 + 1 & 0xFFF;
                            class19.field259[class148.field2204][var11][var12] = var6;
                        }
                        if ((var11 + 1) < 104 && class19.field259[class148.field2204][var11 + 1][var12] != var6 && (class74.field1121[class148.field2204][var11][var12] & 0x4) == 0 && (class74.field1121[class148.field2204][var11 + 1][var12 - 1] & 0x4) == 0) {
                            class261.field4248[var31] = class243.method1723(class243.method1723(5373952, var11 + 1), -1845493760);
                            class86.field1313[var31] = class243.method1723(5439488, var12);
                            class19.field259[class148.field2204][var11 + 1][var12] = var6;
                            var31 = var31 + 1 & 0xFFF;
                        }
                    }
                    var12--;
                    if (var11 + 1 < 104 && class19.field259[class148.field2204][var11 + 1][var12] != var6) {
                        class261.field4248[var31] = class243.method1723(1392508928, class243.method1723(var11 + 1, 9568256));
                        class86.field1313[var31] = class243.method1723(9633792, var12);
                        class19.field259[class148.field2204][var11 + 1][var12] = var6;
                        var31 = var31 + 1 & 0xFFF;
                    }
                    var12--;
                    if (var12 >= 0) {
                        if ((var11 - 1) >= 0 && class19.field259[class148.field2204][var11 - 1][var12] != var6 && (class74.field1121[class148.field2204][var11][var12] & 0x4) == 0 && (class74.field1121[class148.field2204][var11 - 1][var12 + 1] & 0x4) == 0) {
                            class261.field4248[var31] = class243.method1723(301989888, class243.method1723(13762560, var11 - 1));
                            class86.field1313[var31] = class243.method1723(var12, 13828096);
                            var31 = var31 + 1 & 0xFFF;
                            class19.field259[class148.field2204][var11 - 1][var12] = var6;
                        }
                        if (class19.field259[class148.field2204][var11][var12] != var6) {
                            class261.field4248[var31] = class243.method1723(-1828716544, class243.method1723(var11, 13762560));
                            class86.field1313[var31] = class243.method1723(13828096, var12);
                            class19.field259[class148.field2204][var11][var12] = var6;
                            var31 = var31 + 1 & 0xFFF;
                        }
                        if ((var11 + 1) < 104 && class19.field259[class148.field2204][var11 + 1][var12] != var6 && (class74.field1121[class148.field2204][var11][var12] & 0x4) == 0 && (class74.field1121[class148.field2204][var11 + 1][var12 + 1] & 0x4) == 0) {
                            class261.field4248[var31] = class243.method1723(class243.method1723(var11 + 1, 9568256), -771751936);
                            class86.field1313[var31] = class243.method1723(var12, 9633792);
                            var31 = var31 + 1 & 0xFFF;
                            class19.field259[class148.field2204][var11 + 1][var12] = var6;
                        }
                    }
                }
            }
            if (class161.field2409[arg0] != -1000000) {
                class161.field2409[arg0] += 10;
                class123.field1778[arg0] -= 50;
                class31.field379[arg0] += 50;
                class225.field3505[arg0] += 50;
                class10.field152[arg0] -= 50;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!nl", name = "c", descriptor = "(I)Z")
    public final boolean method149(int arg0) {
        if (arg0 == 13828096) {
            field363++;
            return (this.field367 >> 28 & 0x1) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(IILaj;I)V")
    public static final void method150(int arg0, int arg1, class1 arg2, int arg3) {
        if (arg2.field3987 == arg3 && arg3 != -1) {
            class57 var4 = class174.method1241(26, arg3);
            int var5 = var4.field839;
            if (var5 == 1) {
                arg2.field3932 = 0;
                arg2.field3973 = 1;
                arg2.field3977 = arg1;
                arg2.field3980 = 0;
                arg2.field3899 = 0;
                class173.method1240(arg2.field3915, arg2.field3920, -9160, class214.field3347 == arg2, var4, arg2.field3980);
            }
            if (var5 == 2) {
                arg2.field3899 = 0;
            }
        } else if (arg3 == -1 || arg2.field3987 == -1 || class174.method1241(58, arg3).field833 >= class174.method1241(-127, arg2.field3987).field833) {
            arg2.field3980 = 0;
            arg2.field3973 = 1;
            arg2.field3899 = 0;
            arg2.field3932 = 0;
            arg2.field3976 = arg2.field3974;
            arg2.field3987 = arg3;
            arg2.field3977 = arg1;
            if (arg2.field3987 != -1) {
                class173.method1240(arg2.field3915, arg2.field3920, -9160, class214.field3347 == arg2, class174.method1241(84, arg2.field3987), arg2.field3980);
            }
        }
        if (arg0 > -73) {
            field366 = 75;
        }
        field359++;
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(IZ[B)Ljava/lang/Object;")
    public static final Object method151(int arg0, boolean arg1, byte[] arg2) {
        field370++;
        if (arg2 == null) {
            return null;
        }
        if (arg0 < arg2.length && !class102.field1510) {
            try {
                class62 var3 = (class62) Class.forName("gm").getDeclaredConstructor().newInstance();
                var3.method401(arg2, -82);
                return var3;
            } catch (Throwable var4) {
                class102.field1510 = true;
            }
        }
        return arg1 ? class89.method604((byte) 97, arg2) : arg2;
    }

    @OriginalMember(owner = "client!nl", name = "d", descriptor = "(I)Z")
    public final boolean method152(int arg0) {
        int var2 = -126 % ((86 - arg0) / 39);
        field361++;
        return (this.field367 >> 31 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!nl", name = "c", descriptor = "(B)Z")
    public final boolean method153(byte arg0) {
        if (arg0 == -128) {
            field369++;
            return (this.field367 & 0x1) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!nl", name = "e", descriptor = "(I)Z")
    public final boolean method154(int arg0) {
        field356++;
        if (arg0 == 12029) {
            return (this.field367 & 0x49174487) >> 30 != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!nl", name = "<init>", descriptor = "(II)V")
    public class29(int arg0, int arg1) {
        this.field362 = arg1;
        this.field367 = arg0;
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(Z)Z")
    public final boolean method155(boolean arg0) {
        if (!arg0) {
            field358 = 54;
        }
        field357++;
        return (this.field367 >> 21 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!nl", name = "f", descriptor = "(I)V")
    public static void method156(int arg0) {
        if (arg0 != -29535) {
            field358 = 1;
        }
        field354 = null;
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(IIIIZIIII[Lji;[B)V")
    public static final void method157(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6, int arg7, int arg8, class99[] arg9, byte[] arg10) {
        field375++;
        class170 var11 = new class170(arg10);
        if (arg7 <= 72) {
            method148(-40, (class113[][][]) null, -32, 100, false, -81);
        }
        int var12 = -1;
        while (true) {
            int var13 = var11.method1201(523003696);
            if (var13 == 0) {
                return;
            }
            var12 += var13;
            int var14 = 0;
            while (true) {
                int var15 = var11.method1162(-129);
                if (var15 == 0) {
                    break;
                }
                int var16 = var11.method1218(77);
                int var17 = var16 & 0x3;
                int var18 = var16 >> 2;
                var14 += var15 - 1;
                int var19 = var14 >> 6 & 0x3F;
                int var20 = var14 >> 12;
                int var21 = var14 & 0x3F;
                if (arg0 == var20 && var19 >= arg1 && var19 < arg1 + 8 && var21 >= arg6 && var21 < (arg6 + 8)) {
                    class191 var22 = class128.method822(var12, (byte) 99);
                    int var23 = arg5 + class281.method1937(var22.field3039, -15874, var21 & 0x7, arg3, var17, var22.field2993, var19 & 0x7);
                    int var24 = class96.method653(var22.field3039, false, arg3, var17, var21 & 0x7, var19 & 0x7, var22.field2993) + arg2;
                    if (var23 > 0 && var24 > 0 && var23 < 103 && var24 < 103) {
                        class99 var25 = null;
                        if (!arg4) {
                            int var26 = arg8;
                            if ((class74.field1121[1][var23][var24] & 0x2) == 2) {
                                var26 = arg8 - 1;
                            }
                            if (var26 >= 0) {
                                var25 = arg9[var26];
                            }
                        }
                        class291.method1980(arg4, arg8, var24, !arg4, var12, arg8, var25, arg3 + var17 & 0x3, var18, var23, 17);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!nl", name = "g", descriptor = "(I)I")
    public final int method158(int arg0) {
        field364++;
        return arg0 == -239187182 ? (this.field367 & 0x1E3AE6) >> 18 : -63;
    }

    @OriginalMember(owner = "client!nl", name = "h", descriptor = "(I)I")
    public final int method159(int arg0) {
        field355++;
        if (arg0 <= 57) {
            this.method145((byte) -54);
        }
        return class295.method1993(this.field367, (byte) 119);
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(IB)Ltg;")
    public static final class299 method160(int arg0, byte arg1) {
        field360++;
        class299 var2 = (class299) class83.field1290.method1517((long) arg0, (byte) 76);
        if (var2 != null) {
            return var2;
        }
        if (arg1 != -52) {
            field372 = 53;
        }
        byte[] var3 = class140.field2002.method501(-2, arg0, 34);
        class299 var4 = new class299();
        if (var3 != null) {
            var4.method2015((byte) 44, arg0, new class170(var3));
        }
        class83.field1290.method1518(var4, (long) arg0, (byte) 75);
        return var4;
    }

    @OriginalMember(owner = "client!nl", name = "i", descriptor = "(I)Z")
    public final boolean method161(int arg0) {
        field373++;
        int var2 = -73 % ((arg0 - 33) / 54);
        return (this.field367 >> 29 & 0x1) != 0;
    }
}
