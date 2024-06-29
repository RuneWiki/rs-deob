import java.awt.Image;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kq")
public class class595 {

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "I")
    public static int field8304;

    @OriginalMember(owner = "client!kq", name = "b", descriptor = "I")
    public static int field8305;

    @OriginalMember(owner = "client!kq", name = "c", descriptor = "Ljava/awt/Image;")
    public static Image field8306;

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(I)V")
    public static void method3370(int arg0) {
        if (arg0 != 1) {
            field8306 = null;
        }
        field8306 = null;
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(IZLjava/lang/String;II)V")
    public static final void method3371(int arg0, boolean arg1, String arg2, int arg3, int arg4) {
        if (arg3 != -1) {
            field8306 = null;
        }
        field8305++;
        class667.method3753(arg2, false, arg4, arg0, null, arg1, true);
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(IIII[[[B[I[I[I[I[IIBIIZZIIZ)V")
    public static final void method3372(int arg0, int arg1, int arg2, int arg3, byte[][][] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, byte arg11, int arg12, int arg13, boolean arg14, boolean arg15, int arg16, int arg17, boolean arg18) {
        class15.field304 = true;
        class683.field9517 = class681.field9504.method436() > 0;
        class678.field9476 = arg15;
        class428.field5737 = arg1 >> class480.field6531;
        class216.field2924 = arg3 >> class480.field6531;
        class358.field4625 = arg1;
        class305.field4002 = arg3;
        class560.field7905 = arg2;
        class278.field3507 = class428.field5737 - class593.field8294;
        if (class278.field3507 < 0) {
            class264.field3338 = -class278.field3507;
            class278.field3507 = 0;
        } else {
            class264.field3338 = 0;
        }
        class412.field5239 = class216.field2924 - class593.field8294;
        if (class412.field5239 < 0) {
            class300.field3935 = -class412.field5239;
            class412.field5239 = 0;
        } else {
            class300.field3935 = 0;
        }
        class483.field6670 = class593.field8294 + class428.field5737;
        if (class483.field6670 > class289.field3784) {
            class483.field6670 = class289.field3784;
        }
        class193.field2649 = class593.field8294 + class216.field2924;
        if (class193.field2649 > class463.field6223) {
            class193.field2649 = class463.field6223;
        }
        boolean[][] var19 = class449.field5945;
        boolean[][] var20 = class214.field2824;
        if (class678.field9476) {
            for (int var21 = 0; var21 < class593.field8294 + class593.field8294 + 2; var21++) {
                int var22 = 0;
                int var23 = 0;
                for (int var24 = 0; var24 < class593.field8294 + class593.field8294 + 2; var24++) {
                    if (var24 > 1) {
                        class307.field4057[var24 - 2] = var22;
                    }
                    var22 = var23;
                    int var25 = class428.field5737 + var21 - class593.field8294;
                    int var26 = class216.field2924 + var24 - class593.field8294;
                    if (var25 >= 0 && var26 >= 0 && var25 < class289.field3784 && var26 < class463.field6223) {
                        int var27 = var25 << class480.field6531;
                        int var28 = var26 << class480.field6531;
                        int var29 = class707.field9826[class707.field9826.length - 1].method1677(var26, (byte) 110, var25) - (0x3E8 << class480.field6531 - 7);
                        int var30 = class395.field5009 == null ? class707.field9826[0].method1677(var26, (byte) 73, var25) + class699.field9729 : class395.field5009[0].method1677(var26, (byte) 34, var25) + class699.field9729;
                        var23 = arg16 >= 0 ? class681.field9504.method501(var27, var29, var28, var27, var30, var28, arg16) : class681.field9504.method529(var27, var29, var28, var27, var30, var28);
                        class214.field2824[var21][var24] = var23 == 0;
                    } else {
                        var23 = -1;
                        class214.field2824[var21][var24] = false;
                    }
                    if (var21 > 0 && var24 > 0) {
                        int var31 = class307.field4057[var24 - 1] & class307.field4057[var24] & var22 & var23;
                        class449.field5945[var21 - 1][var24 - 1] = var31 == 0;
                    }
                }
                class307.field4057[class593.field8294 + class593.field8294] = var22;
                class307.field4057[class593.field8294 + class593.field8294 + 1] = var23;
            }
            if (arg16 >= 0) {
                class15.field304 = false;
            } else {
                class409.field5188 = arg5;
                class39.field599 = arg6;
                class625.field8603 = arg7;
                class464.field6227 = arg8;
                class220.field2951 = arg9;
                class571.method3280(arg10, class681.field9504, -76);
            }
        } else {
            if (class550.field7690 == null) {
                class550.field7690 = new boolean[class289.field3784 + class289.field3784 + 1][class463.field6223 + class289.field3784 + 1];
            }
            for (int var32 = 0; var32 < class550.field7690.length; var32++) {
                for (int var42 = 0; var42 < class550.field7690[0].length; var42++) {
                    class550.field7690[var32][var42] = true;
                }
            }
            class214.field2824 = class550.field7690;
            class449.field5945 = class550.field7690;
            class278.field3507 = 0;
            class412.field5239 = 0;
            class483.field6670 = class289.field3784;
            class193.field2649 = class463.field6223;
            class15.field304 = false;
        }
        class445.method2521(0, class681.field9504);
        if (!class386.field4924.field8903) {
            class23 var33 = class386.field4924.field8902;
            for (class635 var34 = (class635) var33.method162(-22305); var34 != null; var34 = (class635) var33.method158(false)) {
                var34.method3835(0);
                class358.method2077((byte) -14, var34);
            }
        }
        if (class683.field9517) {
            for (int var35 = 0; var35 < class178.field2498; var35++) {
                class58.field808[var35].method3756(-127, arg0, arg14);
            }
        }
        if (class454.field6071) {
            class312.field4091 = class681.field9504.method509();
            class681.field9504.method483(class513.field7207);
            int var36 = (class513.field7207[2] - class513.field7207[0]) / class93.field1294;
            for (int var37 = 0; var37 < class93.field1294 - 1; var37++) {
                class629.field8674[var37] = (var37 + 1) * var36 + class437.field5812[var37];
            }
            for (int var38 = 0; var38 < class433.field5776.length; var38++) {
                class433.field5776[var38].method4175();
            }
        }
        if (class665.field9356 != null) {
            if (class454.field6071) {
                class295.method1774(0);
            }
            class629.method3537(true);
            class681.field9504.method503(-1, 1583160, 40, 127);
            class74.method671(true, arg4, arg10, arg11, arg16, arg17, arg18);
            if (class454.field6071) {
                class12.method75();
            }
            class681.field9504.method515();
            class629.method3537(false);
        }
        class74.method671(false, arg4, arg10, arg11, arg16, arg17, arg18);
        if (class454.field6071) {
            for (int var39 = 0; var39 < class29.field515; var39++) {
                class619.field8537[var39] = class499.field7027[var39];
            }
            class295.method1774(0);
            for (int var40 = 0; var40 < class433.field5776.length; var40++) {
                class433.field5776[var40].method4175();
            }
        }
        if (class454.field6071) {
            class12.method75();
            for (int var41 = 0; var41 < class29.field515; var41++) {
                class499.field7027[var41] = class619.field8537[var41];
            }
            if (class283.field3573 == 2) {
                int var10002;
                if (class87.field1215[0] < class87.field1215[1]) {
                    if (class629.field8674[0] + class437.field5812[0] > class513.field7207[0]) {
                        var10002 = class437.field5812[0]++;
                    }
                } else if (class87.field1215[0] > class87.field1215[1] && class629.field8674[0] + class437.field5812[0] < class513.field7207[2]) {
                    var10002 = class437.field5812[0]--;
                }
            }
        }
        if (!class678.field9476) {
            class449.field5945 = var19;
            class214.field2824 = var20;
        }
        class234.method1472();
    }

    @OriginalMember(owner = "client!kq", name = "b", descriptor = "(I)Z")
    public static final boolean method3373(int arg0) throws IOException {
        field8304++;
        if (class12.field143 == null) {
            return false;
        }
        if (class546.field7608 == null) {
            if (class319.field4126) {
                if (!class12.field143.method2304(1, arg0 ^ 0x2C08)) {
                    return false;
                }
                class12.field143.method2305(4993, 1, class609.field8448.field6180, 0);
                class319.field4124++;
                class319.field4126 = false;
                class661.field9200 = 0;
            }
            class609.field8448.field6193 = 0;
            if (class609.field8448.method1230(4156)) {
                if (!class12.field143.method2304(1, 121)) {
                    return false;
                }
                class12.field143.method2305(4993, 1, class609.field8448.field6180, 1);
                class319.field4124++;
                class661.field9200 = 0;
            }
            class319.field4126 = true;
            class275[] var1 = client.method1815(110);
            int var2 = class609.field8448.method1238((byte) -14);
            if (var2 < 0 || var2 >= var1.length) {
                throw new IOException("invo:" + var2 + " ip:" + class609.field8448.field6193);
            }
            class546.field7608 = var1[var2];
            class440.field5868 = class546.field7608.field3455;
        }
        if (class440.field5868 == -1) {
            if (!class12.field143.method2304(1, 95)) {
                return false;
            }
            class12.field143.method2305(arg0 ^ 0xFFFFC008, 1, class609.field8448.field6180, 0);
            class440.field5868 = class609.field8448.field6180[0] & 0xFF;
            class661.field9200 = 0;
            class319.field4124++;
        }
        if (class440.field5868 == -2) {
            if (!class12.field143.method2304(2, -124)) {
                return false;
            }
            class12.field143.method2305(4993, 2, class609.field8448.field6180, 0);
            class609.field8448.field6193 = 0;
            class440.field5868 = class609.field8448.method2566(-2);
            class319.field4124 += 2;
            class661.field9200 = 0;
        }
        if (class440.field5868 > 0) {
            if (!class12.field143.method2304(class440.field5868, 59)) {
                return false;
            }
            class609.field8448.field6193 = 0;
            class12.field143.method2305(4993, class440.field5868, class609.field8448.field6180, 0);
            class319.field4124 += class440.field5868;
            class661.field9200 = 0;
        }
        class255.field3248 = class154.field2099;
        class154.field2099 = class494.field6994;
        class494.field6994 = class546.field7608;
        if (class555.field7724 == class546.field7608) {
            byte var3 = class609.field8448.method2593((byte) 79);
            int var4 = class609.field8448.method2629(-93);
            class386.method2197(-75);
            class144.method1043(arg0 ^ 0x2C76, var4, var3);
            class546.field7608 = null;
            return true;
        } else if (class718.field9990 == class546.field7608) {
            int var5 = class609.field8448.method2571(21166);
            class386.method2197(-88);
            if (var5 == -1) {
                class35.field560 = -1;
                class746.field10437 = -1;
            } else {
                int var6 = var5 >> 14 & 0x3FFF;
                int var7 = var6 - class332.field4232;
                int var8 = var5 & 0x3FFF;
                if (var7 < 0) {
                    var7 = 0;
                } else if (var7 >= class409.field5183) {
                    var7 = class409.field5183;
                }
                int var9 = var8 - class447.field5936;
                class746.field10437 = (var7 << 9) + 256;
                if (var9 < 0) {
                    var9 = 0;
                } else if (var9 >= class543.field7597) {
                    var9 = class543.field7597;
                }
                class35.field560 = (var9 << 9) + 256;
            }
            class546.field7608 = null;
            return true;
        } else if (class653.field9080 == class546.field7608) {
            for (int var10 = 0; var10 < class5.field49.length; var10++) {
                if (class5.field49[var10] != null) {
                    class5.field49[var10].field165 = null;
                    class5.field49[var10].field153 = -1;
                }
            }
            for (int var11 = 0; var11 < class54.field752; var11++) {
                class638.field8801[var11].field8280.field165 = null;
                class638.field8801[var11].field8280.field153 = -1;
            }
            class546.field7608 = null;
            return true;
        } else if (class98.field1365 == class546.field7608) {
            int var12 = class609.field8448.method2566(-2);
            if (var12 == 65535) {
                var12 = -1;
            }
            int var13 = class609.field8448.method2600((byte) -123);
            int var14 = class609.field8448.method2566(arg0 + 11381);
            int var15 = class609.field8448.method2600((byte) -127);
            int var16 = class609.field8448.method2566(-2);
            class622.method3499(var12, var16, false, true, var13, var14, var15);
            class546.field7608 = null;
            return true;
        } else if (class697.field9706 == class546.field7608) {
            int var17 = class609.field8448.method2600((byte) -127);
            int var18 = class609.field8448.method2629(-84);
            if (var17 == 255) {
                var18 = -1;
                var17 = -1;
            }
            class429.method2459(var18, (byte) -124, var17);
            class546.field7608 = null;
            return true;
        } else if (class546.field7608 == class175.field2443) {
            int var19 = class609.field8448.method2604((byte) -127) << 2;
            int var20 = class609.field8448.method2606((byte) -103);
            int var21 = class609.field8448.method2606((byte) -103);
            int var22 = class609.field8448.method2583(false);
            int var23 = class609.field8448.method2629(-105);
            class386.method2197(-81);
            class422.method2349(var19, var20, -1025, var22, var21, var23);
            class546.field7608 = null;
            return true;
        } else if (class546.field7608 == class31.field529) {
            String var24 = class609.field8448.method2574(-1);
            String var25 = class417.method2338(3, class567.method3261(class609.field8448, 23440));
            class64.method588(1699767752, var25, 0, var24, var24, 6, var24);
            class546.field7608 = null;
            return true;
        } else if (class546.field7608 == class236.field3074) {
            class24.method168(class643.field8919, (byte) -85);
            class546.field7608 = null;
            return true;
        } else if (class546.field7608 == class239.field3103) {
            class24.method168(class83.field1135, (byte) -85);
            class546.field7608 = null;
            return true;
        } else if (class546.field7608 == class201.field2709) {
            int var26 = class609.field8448.method2566(-2);
            int var27 = class609.field8448.method2600((byte) -127);
            boolean var28 = (var27 & 0x1) == 1;
            class731.method4082(var28, 14094, var26);
            class735.field10222[class702.method3949(31, class501.field7093++)] = var26;
            class546.field7608 = null;
            return true;
        } else if (class681.field9505 == class546.field7608) {
            while (class609.field8448.field6193 < class440.field5868) {
                boolean var39 = class609.field8448.method2600((byte) -123) == 1;
                String var40 = class609.field8448.method2574(-1);
                String var41 = class609.field8448.method2574(-1);
                int var42 = class609.field8448.method2566(-2);
                int var43 = class609.field8448.method2600((byte) -125);
                String var44 = "";
                boolean var45 = false;
                if (var42 > 0) {
                    var44 = class609.field8448.method2574(-1);
                    var45 = class609.field8448.method2600((byte) -123) == 1;
                }
                for (int var46 = 0; var46 < class600.field8359; var46++) {
                    if (var39) {
                        if (var41.equals(class207.field2748[var46])) {
                            class207.field2748[var46] = var40;
                            class726.field10124[var46] = var41;
                            var40 = null;
                            break;
                        }
                    } else if (var40.equals(class207.field2748[var46])) {
                        if (class698.field9713[var46] != var42) {
                            boolean var47 = true;
                            for (class421 var48 = (class421) class372.field4776.method162(arg0 - 10922); var48 != null; var48 = (class421) class372.field4776.method158(false)) {
                                if (var48.field5353.equals(var40)) {
                                    if (var42 != 0 && var48.field5350 == 0) {
                                        var47 = false;
                                        var48.method3835(0);
                                    } else if (var42 == 0 && var48.field5350 != 0) {
                                        var47 = false;
                                        var48.method3835(0);
                                    }
                                }
                            }
                            if (var47) {
                                class372.field4776.method166(-8839, new class421(var40, var42));
                            }
                            class698.field9713[var46] = var42;
                        }
                        class726.field10124[var46] = var41;
                        class524.field7328[var46] = var44;
                        class61.field851[var46] = var43;
                        var40 = null;
                        class512.field7202[var46] = var45;
                        break;
                    }
                }
                if (var40 != null && class600.field8359 < 200) {
                    class207.field2748[class600.field8359] = var40;
                    class726.field10124[class600.field8359] = var41;
                    class698.field9713[class600.field8359] = var42;
                    class524.field7328[class600.field8359] = var44;
                    class61.field851[class600.field8359] = var43;
                    class512.field7202[class600.field8359] = var45;
                    class600.field8359++;
                }
            }
            class101.field1399 = 2;
            class42.field624 = class676.field9444;
            boolean var29 = false;
            int var30 = class600.field8359;
            while (var30 > 0) {
                boolean var31 = true;
                var30--;
                for (int var32 = 0; var32 < var30; var32++) {
                    if (class698.field9713[var32] != class292.field3842.field1929 && class698.field9713[var32 + 1] == class292.field3842.field1929 || class698.field9713[var32] == 0 && class698.field9713[var32 + 1] != 0) {
                        int var33 = class698.field9713[var32];
                        class698.field9713[var32] = class698.field9713[var32 + 1];
                        class698.field9713[var32 + 1] = var33;
                        String var34 = class524.field7328[var32];
                        class524.field7328[var32] = class524.field7328[var32 + 1];
                        class524.field7328[var32 + 1] = var34;
                        String var35 = class207.field2748[var32];
                        class207.field2748[var32] = class207.field2748[var32 + 1];
                        class207.field2748[var32 + 1] = var35;
                        String var36 = class726.field10124[var32];
                        class726.field10124[var32] = class726.field10124[var32 + 1];
                        class726.field10124[var32 + 1] = var36;
                        int var37 = class61.field851[var32];
                        class61.field851[var32] = class61.field851[var32 + 1];
                        class61.field851[var32 + 1] = var37;
                        boolean var38 = class512.field7202[var32];
                        class512.field7202[var32] = class512.field7202[var32 + 1];
                        class512.field7202[var32 + 1] = var38;
                        var31 = false;
                    }
                }
                if (var31) {
                    break;
                }
            }
            class546.field7608 = null;
            return true;
        } else if (class546.field7608 == class121.field1761) {
            class622.method3500(false);
            class546.field7608 = null;
            return true;
        } else if (class64.field894 == class546.field7608) {
            boolean var49 = class609.field8448.method2600((byte) -128) == 1;
            String var50 = class609.field8448.method2574(-1);
            String var51 = var50;
            if (var49) {
                var51 = class609.field8448.method2574(-1);
            }
            long var52 = (long) class609.field8448.method2566(arg0 ^ 0x2C77);
            long var54 = (long) class609.field8448.method2576((byte) 61);
            int var56 = class609.field8448.method2600((byte) -124);
            long var57 = (var52 << 32) + var54;
            boolean var59 = false;
            int var60 = 0;
            while (true) {
                if (var60 >= 100) {
                    if (var56 <= 1) {
                        if (!(!class81.field1113 || class172.field2381) || class165.field2314) {
                            var59 = true;
                        } else if (class176.method1211(80, var51)) {
                            var59 = true;
                        }
                    }
                    break;
                }
                if (class15.field294[var60] == var57) {
                    var59 = true;
                    break;
                }
                var60++;
            }
            if (!var59 && class511.field7195 == 0) {
                class15.field294[class709.field9848] = var57;
                class709.field9848 = (class709.field9848 + 1) % 100;
                String var61 = class417.method2338(arg0 + 11386, class567.method3261(class609.field8448, arg0 + 34823));
                if (var56 == 2) {
                    class694.method3888(false, var50, 7, -1, "<img=1>" + var51, "<img=1>" + var50, var61, null, 0);
                } else if (var56 == 1) {
                    class694.method3888(false, var50, 7, -1, "<img=0>" + var51, "<img=0>" + var50, var61, null, 0);
                } else {
                    class694.method3888(false, var50, 3, -1, var51, var50, var61, null, 0);
                }
            }
            class546.field7608 = null;
            return true;
        } else if (class546.field7608 == class479.field6522) {
            int var62 = class609.field8448.method2584((byte) -37);
            class386.method2197(-79);
            class281.method1667(87, -1, var62, 3, -1);
            class546.field7608 = null;
            return true;
        } else if (class546.field7608 == class244.field3160) {
            int var63 = class609.field8448.method2595((byte) 88);
            int var64 = class609.field8448.method2628(61);
            class386.method2197(-115);
            client.method1827(var64, 7910, var63);
            class546.field7608 = null;
            return true;
        } else if (class546.field7608 == class435.field5789) {
            class587.field8220 = class609.field8448.method2583(false);
            class356.field4574 = class609.field8448.method2629(-83);
            class546.field7608 = null;
            return true;
        } else if (class546.field7608 == class287.field3611) {
            String var65 = class609.field8448.method2574(-1);
            boolean var66 = class609.field8448.method2600((byte) -126) == 1;
            String var67;
            if (var66) {
                var67 = class609.field8448.method2574(-1);
            } else {
                var67 = var65;
            }
            int var68 = class609.field8448.method2566(-2);
            byte var69 = class609.field8448.method2601(0);
            boolean var70 = false;
            if (var69 == -128) {
                var70 = true;
            }
            if (var70) {
                if (class194.field2654 == 0) {
                    class546.field7608 = null;
                    return true;
                }
                boolean var76 = false;
                int var77;
                for (var77 = 0; class194.field2654 > var77 && (!class306.field4038[var77].field3072.equals(var67) || class306.field4038[var77].field3078 != var68); var77++) {
                }
                if (class194.field2654 > var77) {
                    while (class194.field2654 - 1 > var77) {
                        class306.field4038[var77] = class306.field4038[var77 + 1];
                        var77++;
                    }
                    class194.field2654--;
                    class306.field4038[class194.field2654] = null;
                }
            } else {
                String var71 = class609.field8448.method2574(-1);
                class236 var72 = new class236();
                var72.field3080 = var65;
                var72.field3072 = var67;
                var72.field3081 = class286.method1701(-1, var72.field3072);
                var72.field3082 = var71;
                var72.field3071 = var69;
                var72.field3078 = var68;
                int var73;
                for (var73 = class194.field2654 - 1; var73 >= 0; var73--) {
                    int var74 = class306.field4038[var73].field3081.compareTo(var72.field3081);
                    if (var74 == 0) {
                        class306.field4038[var73].field3078 = var68;
                        class306.field4038[var73].field3071 = var69;
                        class306.field4038[var73].field3082 = var71;
                        if (var67.equals(class380.field4847.field10062)) {
                            class33.field546 = var69;
                        }
                        class446.field5933 = class676.field9444;
                        class546.field7608 = null;
                        return true;
                    }
                    if (var74 < 0) {
                        break;
                    }
                }
                if (class306.field4038.length <= class194.field2654) {
                    class546.field7608 = null;
                    return true;
                }
                for (int var75 = class194.field2654 - 1; var75 > var73; var75--) {
                    class306.field4038[var75 + 1] = class306.field4038[var75];
                }
                if (class194.field2654 == 0) {
                    class306.field4038 = new class236[100];
                }
                class306.field4038[var73 + 1] = var72;
                class194.field2654++;
                if (var67.equals(class380.field4847.field10062)) {
                    class33.field546 = var69;
                }
            }
            class546.field7608 = null;
            class446.field5933 = class676.field9444;
            return true;
        } else if (class546.field7608 == class474.field6376) {
            class446.field5933 = class676.field9444;
            if (class440.field5868 == 0) {
                class66.field953 = null;
                class602.field8365 = null;
                class194.field2654 = 0;
                class306.field4038 = null;
                class546.field7608 = null;
                return true;
            }
            class66.field953 = class609.field8448.method2574(-1);
            boolean var78 = class609.field8448.method2600((byte) -126) == 1;
            if (var78) {
                class609.field8448.method2574(-1);
            }
            long var79 = class609.field8448.method2613((byte) -86);
            class602.field8365 = class532.method3056(3, var79);
            class244.field3155 = class609.field8448.method2601(0);
            int var81 = class609.field8448.method2600((byte) -128);
            if (var81 == 255) {
                class546.field7608 = null;
                return true;
            }
            class194.field2654 = var81;
            class236[] var82 = new class236[100];
            for (int var83 = 0; var83 < class194.field2654; var83++) {
                var82[var83] = new class236();
                var82[var83].field3080 = class609.field8448.method2574(arg0 + 11382);
                boolean var89 = class609.field8448.method2600((byte) -123) == 1;
                if (var89) {
                    var82[var83].field3072 = class609.field8448.method2574(arg0 + 11382);
                } else {
                    var82[var83].field3072 = var82[var83].field3080;
                }
                var82[var83].field3081 = class286.method1701(arg0 ^ 0x2C76, var82[var83].field3072);
                var82[var83].field3078 = class609.field8448.method2566(arg0 ^ 0x2C77);
                var82[var83].field3071 = class609.field8448.method2601(0);
                var82[var83].field3082 = class609.field8448.method2574(-1);
                if (var82[var83].field3072.equals(class380.field4847.field10062)) {
                    class33.field546 = var82[var83].field3071;
                }
            }
            boolean var84 = false;
            int var85 = class194.field2654;
            while (var85 > 0) {
                boolean var86 = true;
                var85--;
                for (int var87 = 0; var87 < var85; var87++) {
                    if (var82[var87].field3081.compareTo(var82[var87 + 1].field3081) > 0) {
                        class236 var88 = var82[var87];
                        var82[var87] = var82[var87 + 1];
                        var82[var87 + 1] = var88;
                        var86 = false;
                    }
                }
                if (var86) {
                    break;
                }
            }
            class306.field4038 = var82;
            class546.field7608 = null;
            return true;
        } else if (class546.field7608 == class263.field3318) {
            int var90 = class609.field8448.method2594(3340);
            int var91 = class609.field8448.method2622(-539564808);
            int var92 = class609.field8448.method2600((byte) -127);
            String var93 = "";
            String var94 = var93;
            if ((var92 & 0x1) != 0) {
                var93 = class609.field8448.method2574(-1);
                if ((var92 & 0x2) == 0) {
                    var94 = var93;
                } else {
                    var94 = class609.field8448.method2574(-1);
                }
            }
            String var95 = class609.field8448.method2574(arg0 + 11382);
            if (var90 == 99) {
                class320.method1883((byte) -60, var95);
            } else if (var94.equals("") || !class176.method1211(80, var94)) {
                class64.method588(1699767752, var95, var91, var93, var94, var90, var93);
            } else {
                class546.field7608 = null;
                return true;
            }
            class546.field7608 = null;
            return true;
        } else if (class93.field1304 == class546.field7608) {
            int var96 = class609.field8448.method2628(77);
            int var97 = class609.field8448.method2617((byte) 83);
            class386.method2197(-74);
            class201.method1310((byte) -80, var96, var97);
            class546.field7608 = null;
            return true;
        } else if (class725.field10111 == class546.field7608) {
            class546.field7608 = null;
            return false;
        } else if (class653.field9091 == class546.field7608) {
            class35.field556 = class609.field8448.method2606((byte) -103);
            class90.field1245 = class609.field8448.method2593((byte) 117) << 3;
            class118.field1732 = class609.field8448.method2593((byte) 81) << 3;
            for (class133 var98 = (class133) class342.field4322.method1156(0); var98 != null; var98 = (class133) class342.field4322.method1158(22706)) {
                int var101 = (int) (var98.field2333 >> 28 & 0x3L);
                int var102 = (int) (var98.field2333 & 0x3FFFL);
                int var103 = var102 - class332.field4232;
                int var104 = (int) (var98.field2333 >> 14 & 0x3FFFL);
                int var105 = var104 - class447.field5936;
                if (class35.field556 == var101 && class90.field1245 <= var103 && class90.field1245 + 8 > var103 && var105 >= class118.field1732 && class118.field1732 + 8 > var105) {
                    var98.method1175(-2);
                    if (var103 >= 0 && var105 >= 0 && class409.field5183 > var103 && class543.field7597 > var105) {
                        class220.method1429(var105, class35.field556, var103, (byte) -16);
                    }
                }
            }
            for (class729 var99 = (class729) class757.field10565.method3672(-1); var99 != null; var99 = (class729) class757.field10565.method3662(-1)) {
                if (class90.field1245 <= var99.field10154 && var99.field10154 < class90.field1245 + 8 && class118.field1732 <= var99.field10139 && (class118.field1732 + 8) > var99.field10139 && class35.field556 == var99.field10147) {
                    var99.field10149 = true;
                }
            }
            for (class729 var100 = (class729) class719.field10016.method3672(-1); var100 != null; var100 = (class729) class719.field10016.method3662(-1)) {
                if (var100.field10154 >= class90.field1245 && var100.field10154 < class90.field1245 + 8 && class118.field1732 <= var100.field10139 && class118.field1732 + 8 > var100.field10139 && class35.field556 == var100.field10147) {
                    var100.field10149 = true;
                }
            }
            class546.field7608 = null;
            return true;
        } else if (class631.field8713 == class546.field7608) {
            int var106 = class609.field8448.method2600((byte) -124);
            int var107 = class609.field8448.method2628(105);
            int var108 = class609.field8448.method2629(-91);
            class271.field3408[var106] = var107;
            class223.field2981[var106] = var108;
            class72.field1000[var106] = 1;
            int var109 = class605.field8415[var106] - 1;
            for (int var110 = 0; var110 < var109; var110++) {
                if (class394.field4998[var110] <= var107) {
                    class72.field1000[var106] = var110 + 2;
                }
            }
            class443.field5881[class702.method3949(class453.field5997++, 31)] = var106;
            class546.field7608 = null;
            return true;
        } else if (class9.field122 == class546.field7608) {
            int var111 = class609.field8448.method2566(-2);
            int var112 = class609.field8448.method2628(85);
            class386.method2197(-82);
            class446.method2524(30904, var112, var111);
            class546.field7608 = null;
            return true;
        } else if (class546.field7608 == class136.field1952) {
            int var113 = class609.field8448.method2604((byte) -127);
            int var114 = class609.field8448.method2622(-539564808);
            int var115 = class609.field8448.method2566(-2);
            int var116 = class609.field8448.method2566(arg0 + 11381);
            class386.method2197(-59);
            class281.method1667(119, var115 | var113 << 16, var114, 7, var116);
            class546.field7608 = null;
            return true;
        } else if (class648.field8971 == class546.field7608) {
            class24.method168(class299.field3932, (byte) -85);
            class546.field7608 = null;
            return true;
        } else if (class672.field9411 == class546.field7608) {
            int var117 = class609.field8448.method2595((byte) 29);
            if (var117 == 65535) {
                var117 = -1;
            }
            int var118 = class609.field8448.method2628(60);
            class386.method2197(arg0 ^ 0x2C1C);
            class281.method1667(49, var117, var118, 1, -1);
            class546.field7608 = null;
            return true;
        } else if (class546.field7608 == class114.field1638) {
            int var119 = class609.field8448.method2566(arg0 + 11381);
            class724 var120;
            if (class54.field755 == var119) {
                var120 = class380.field4847;
            } else {
                var120 = class5.field49[var119];
            }
            if (var120 == null) {
                class546.field7608 = null;
                return true;
            }
            int var121 = class609.field8448.method2566(-2);
            int var122 = class609.field8448.method2600((byte) -125);
            boolean var123 = (var121 & 0x8000) != 0;
            if (var120.field10062 != null && var120.field10081 != null) {
                boolean var124 = false;
                if (var122 <= 1) {
                    if (!var123 && !(!class81.field1113 || class172.field2381) || class165.field2314) {
                        var124 = true;
                    } else if (class176.method1211(80, var120.field10062)) {
                        var124 = true;
                    }
                }
                if (!var124 && class511.field7195 == 0) {
                    int var125 = -1;
                    String var126;
                    if (var123) {
                        var121 &= 0x7FFF;
                        class598 var127 = class6.method33(class609.field8448, -2);
                        var125 = var127.field8341;
                        var126 = var127.field8342.method1255(true, class609.field8448);
                    } else {
                        var126 = class417.method2338(3, class567.method3261(class609.field8448, arg0 + 34823));
                    }
                    var120.field214 = var126.trim();
                    var120.field247 = 150;
                    var120.field228 = var121 >> 8;
                    var120.field209 = var121 & 0xFF;
                    int var128;
                    if (var122 == 1 || var122 == 2) {
                        var128 = var123 ? 17 : 1;
                    } else {
                        var128 = var123 ? 17 : 2;
                    }
                    if (var122 == 2) {
                        class694.method3888(false, var120.field10064, var128, var125, "<img=1>" + var120.method4041(-1, false), "<img=1>" + var120.method4038(false, true), var126, null, 0);
                    } else if (var122 == 1) {
                        class694.method3888(false, var120.field10064, var128, var125, "<img=0>" + var120.method4041(arg0 ^ 0x2C76, false), "<img=0>" + var120.method4038(false, true), var126, null, 0);
                    } else {
                        class694.method3888(false, var120.field10064, var128, var125, var120.method4041(arg0 ^ 0x2C76, false), var120.method4038(false, true), var126, null, 0);
                    }
                }
            }
            class546.field7608 = null;
            return true;
        } else if (class550.field7682 == class546.field7608) {
            int var129 = class609.field8448.method2617((byte) 86);
            int var130 = class609.field8448.method2571(21166);
            class516.field7236.method2279(var129, var130, (byte) -127);
            class546.field7608 = null;
            return true;
        } else {
            if (arg0 != -11383) {
                method3370(-54);
            }
            if (class625.field8597 == class546.field7608) {
                String var131 = class609.field8448.method2574(-1);
                int var132 = class609.field8448.method2617((byte) 93);
                if (var132 == 65535) {
                    var132 = -1;
                }
                int var133 = class609.field8448.method2583(false);
                int var134 = class609.field8448.method2629(arg0 ^ 0x2C20);
                if (var134 >= 1 && var134 <= 8) {
                    if (var131.equalsIgnoreCase("null")) {
                        var131 = null;
                    }
                    class284.field3581[var134 - 1] = var131;
                    class459.field6097[var134 - 1] = var132;
                    class594.field8302[var134 - 1] = var133 == 0;
                }
                class546.field7608 = null;
                return true;
            } else if (class546.field7608 == class507.field7155) {
                class386.method2197(-127);
                class571.method3278((byte) 105);
                class546.field7608 = null;
                return true;
            } else if (class761.field10614 == class546.field7608) {
                class118.field1732 = class609.field8448.method2627(arg0 + 27185) << 3;
                class35.field556 = class609.field8448.method2600((byte) -123);
                class90.field1245 = class609.field8448.method2601(arg0 + 11383) << 3;
                while (class609.field8448.field6193 < class440.field5868) {
                    class220 var135 = class94.method764(arg0 ^ 0xFFFFF929)[class609.field8448.method2600((byte) -124)];
                    class24.method168(var135, (byte) -85);
                }
                class546.field7608 = null;
                return true;
            } else if (class546.field7608 == class242.field3130) {
                class404.method2247(-92);
                class546.field7608 = null;
                return true;
            } else if (class546.field7608 == class484.field6937) {
                int var136 = class609.field8448.method2600((byte) -128);
                boolean var137 = (var136 & 0x1) == 1;
                String var138 = class609.field8448.method2574(-1);
                String var139 = class609.field8448.method2574(-1);
                if (var139.equals("")) {
                    var139 = var138;
                }
                String var140 = class609.field8448.method2574(-1);
                String var141 = class609.field8448.method2574(-1);
                if (var141.equals("")) {
                    var141 = var140;
                }
                if (var137) {
                    for (int var142 = 0; var142 < class20.field370; var142++) {
                        if (class160.field2213[var142].equals(var141)) {
                            class469.field6287[var142] = var138;
                            class160.field2213[var142] = var139;
                            class636.field8768[var142] = var140;
                            class752.field10499[var142] = var141;
                            break;
                        }
                    }
                } else {
                    class469.field6287[class20.field370] = var138;
                    class160.field2213[class20.field370] = var139;
                    class636.field8768[class20.field370] = var140;
                    class752.field10499[class20.field370] = var141;
                    class216.field2921[class20.field370] = class702.method3949(var136, 2) == 2;
                    class20.field370++;
                }
                class42.field624 = class676.field9444;
                class546.field7608 = null;
                return true;
            } else if (class546.field7608 == class310.field4083) {
                int var143 = class609.field8448.method2566(-2);
                if (var143 == 65535) {
                    var143 = -1;
                }
                int var144 = class609.field8448.method2600((byte) -127);
                int var145 = class609.field8448.method2566(arg0 + 11381);
                int var146 = class609.field8448.method2600((byte) -128);
                int var147 = class609.field8448.method2566(arg0 + 11381);
                class75.method673(var144, var146, var143, var145, var147, 0);
                class546.field7608 = null;
                return true;
            } else if (class747.field10442 == class546.field7608) {
                class386.method2197(arg0 + 11291);
                class726.method4050((byte) 26);
                class546.field7608 = null;
                return true;
            } else if (class698.field9720 == class546.field7608) {
                String var148 = class609.field8448.method2574(-1);
                int var149 = class609.field8448.method2566(-2);
                String var150 = class609.field8450.method227(11041, var149).method1255(true, class609.field8448);
                class694.method3888(false, var148, 19, var149, var148, var148, var150, null, 0);
                class546.field7608 = null;
                return true;
            } else if (class692.field9623 == class546.field7608) {
                class272.method1608(arg0 ^ 0x249A036D);
                class546.field7608 = null;
                return false;
            } else if (class738.field10247 == class546.field7608) {
                boolean var151 = class609.field8448.method2600((byte) -123) == 1;
                String var152 = class609.field8448.method2574(-1);
                String var153 = var152;
                if (var151) {
                    var153 = class609.field8448.method2574(arg0 + 11382);
                }
                long var154 = class609.field8448.method2613((byte) -87);
                long var156 = (long) class609.field8448.method2566(-2);
                long var158 = (long) class609.field8448.method2576((byte) 42);
                int var160 = class609.field8448.method2600((byte) -125);
                int var161 = class609.field8448.method2566(-2);
                long var162 = (var156 << 32) + var158;
                boolean var164 = false;
                int var165 = 0;
                while (true) {
                    if (var165 >= 100) {
                        if (var160 <= 1 && class176.method1211(arg0 ^ 0xFFFFD3D9, var153)) {
                            var164 = true;
                        }
                        break;
                    }
                    if (class15.field294[var165] == var162) {
                        var164 = true;
                        break;
                    }
                    var165++;
                }
                if (!var164 && class511.field7195 == 0) {
                    class15.field294[class709.field9848] = var162;
                    class709.field9848 = (class709.field9848 + 1) % 100;
                    String var166 = class609.field8450.method227(11041, var161).method1255(true, class609.field8448);
                    if (var160 == 2) {
                        class694.method3888(false, var152, 20, var161, "<img=1>" + var153, "<img=1>" + var152, var166, class178.method1215((byte) 127, var154), 0);
                    } else if (var160 == 1) {
                        class694.method3888(false, var152, 20, var161, "<img=0>" + var153, "<img=0>" + var152, var166, class178.method1215((byte) -62, var154), 0);
                    } else {
                        class694.method3888(false, var152, 20, var161, var153, var152, var166, class178.method1215((byte) -9, var154), 0);
                    }
                }
                class546.field7608 = null;
                return true;
            } else if (class546.field7608 == class142.field2014) {
                int var167 = class609.field8448.method2595((byte) 72);
                if (var167 == 65535) {
                    var167 = -1;
                }
                int var168 = class609.field8448.method2628(109);
                int var169 = class609.field8448.method2584((byte) -37);
                class386.method2197(-111);
                class669.method3758(var168, var167, var169, 9);
                class639 var170 = class21.field381.method1583(arg0 + 11302, var167);
                class121.method929(var170.field8825, var170.field8884, var169, var170.field8828, false);
                class167.method1170(var170.field8865, 1335, var169, var170.field8829, var170.field8850);
                class546.field7608 = null;
                return true;
            } else if (class663.field9343 == class546.field7608) {
                class24.method168(class732.field10184, (byte) -85);
                class546.field7608 = null;
                return true;
            } else if (class701.field9753 == class546.field7608) {
                class546.field7608 = null;
                class42.field624 = class676.field9444;
                class101.field1399 = 1;
                return true;
            } else if (class546.field7608 == class141.field2006) {
                int var171 = class609.field8448.method2566(-2);
                int var172 = class609.field8448.method2566(arg0 ^ 0x2C77);
                int var173 = class609.field8448.method2571(arg0 ^ 0xFFFF8127);
                class386.method2197(-63);
                class169.method1178(var173, 82, (var172 << 16) + var171);
                class546.field7608 = null;
                return true;
            } else if (class555.field7730 == class546.field7608) {
                String var174 = class609.field8448.method2574(arg0 + 11382);
                int var175 = class609.field8448.method2604((byte) -126);
                class386.method2197(-74);
                class506.method2953(true, var174, var175);
                class546.field7608 = null;
                return true;
            } else if (class647.field8962 == class546.field7608) {
                int var176 = class609.field8448.method2584((byte) -37);
                int var177 = class609.field8448.method2628(arg0 ^ 0xFFFFD3C5);
                class386.method2197(-96);
                class491 var178 = (class491) class290.field3804.method1160((long) var176, 125);
                class491 var179 = (class491) class290.field3804.method1160((long) var177, 123);
                if (var179 != null) {
                    class178.method1218(256, false, var179, var178 == null || var178.field6978 != var179.field6978);
                }
                if (var178 != null) {
                    var178.method1175(-2);
                    class290.field3804.method1153(var178, (long) var177, -1);
                }
                class288 var180 = class501.method2936(-71, var176);
                if (var180 != null) {
                    class207.method1332((byte) -126, var180);
                }
                class288 var181 = class501.method2936(-121, var177);
                if (var181 != null) {
                    class207.method1332((byte) -122, var181);
                    class236.method1483(var181, -1, true);
                }
                if (class540.field7482 != -1) {
                    class1.method1(1, class540.field7482, (byte) 13);
                }
                class546.field7608 = null;
                return true;
            } else if (class546.field7608 == class285.field3594) {
                int var182 = class609.field8448.method2604((byte) -127);
                byte var183 = class609.field8448.method2601(0);
                class516.field7236.method2281(arg0 ^ 0xFFFFFDD7, var183, var182);
                class546.field7608 = null;
                return true;
            } else if (class69.field970 == class546.field7608) {
                int var184 = class609.field8448.method2600((byte) -125);
                int var185 = class609.field8448.method2628(125);
                class386.method2197(-62);
                class25.method177(var184, (byte) 120, var185);
                class546.field7608 = null;
                return true;
            } else if (class546.field7608 == class348.field4490) {
                boolean var186 = class609.field8448.method2600((byte) -124) == 1;
                byte[] var187 = new byte[class440.field5868 - 1];
                class609.field8448.method2573(var187, (byte) -77, class440.field5868 - 1, 0);
                class614.method3436(var187, var186, 95);
                class546.field7608 = null;
                return true;
            } else if (class717.field9974 == class546.field7608) {
                if (class575.method3299(class27.field484, true)) {
                    class705.field9777 = (int) ((float) class609.field8448.method2566(-2) * 2.5F);
                } else {
                    class705.field9777 = class609.field8448.method2566(-2) * 30;
                }
                class122.field1762 = class676.field9444;
                class546.field7608 = null;
                return true;
            } else if (class654.field9106 == class546.field7608) {
                int var188 = class609.field8448.method2584((byte) -37);
                class386.method2197(arg0 ^ 0x2C23);
                class281.method1667(arg0 + 11430, class54.field755, var188, 5, 0);
                class546.field7608 = null;
                return true;
            } else if (class555.field7729 == class546.field7608) {
                int var189 = class609.field8448.method2600((byte) -123);
                int var190 = var189 >> 5;
                int var191 = var189 & 0x1F;
                if (var191 == 0) {
                    class98.field1369[var190] = null;
                    class546.field7608 = null;
                    return true;
                }
                class323 var192 = new class323();
                var192.field4163 = var191;
                var192.field4155 = class609.field8448.method2600((byte) -124);
                if (var192.field4155 >= 0 && class537.field7461.length > var192.field4155) {
                    if (var192.field4163 == 1 || var192.field4163 == 10) {
                        var192.field4156 = class609.field8448.method2566(-2);
                        class609.field8448.field6193 += 6;
                    } else if (var192.field4163 >= 2 && var192.field4163 <= 6) {
                        if (var192.field4163 == 2) {
                            var192.field4159 = 256;
                            var192.field4164 = 256;
                        }
                        if (var192.field4163 == 3) {
                            var192.field4159 = 0;
                            var192.field4164 = 256;
                        }
                        if (var192.field4163 == 4) {
                            var192.field4164 = 256;
                            var192.field4159 = 512;
                        }
                        if (var192.field4163 == 5) {
                            var192.field4159 = 256;
                            var192.field4164 = 0;
                        }
                        if (var192.field4163 == 6) {
                            var192.field4164 = 512;
                            var192.field4159 = 256;
                        }
                        var192.field4163 = 2;
                        var192.field4165 = class609.field8448.method2600((byte) -125);
                        var192.field4159 += class609.field8448.method2566(-2) - class332.field4232 << 9;
                        var192.field4164 += class609.field8448.method2566(-2) - class447.field5936 << 9;
                        var192.field4157 = class609.field8448.method2600((byte) -127) << 2;
                        var192.field4166 = class609.field8448.method2566(-2);
                    }
                    var192.field4160 = class609.field8448.method2566(-2);
                    if (var192.field4160 == 65535) {
                        var192.field4160 = -1;
                    }
                    class98.field1369[var190] = var192;
                }
                class546.field7608 = null;
                return true;
            } else if (class692.field9625 == class546.field7608) {
                int var193 = class609.field8448.method2606((byte) -103);
                int var194 = class609.field8448.method2629(-108);
                int var195 = class609.field8448.method2595((byte) 93) << 2;
                int var196 = class609.field8448.method2583(false);
                int var197 = class609.field8448.method2629(arg0 ^ 0x2C29);
                class386.method2197(arg0 + 11315);
                class74.method670(var195, var193, arg0 ^ 0x2C00, true, var197, var194, var196);
                class546.field7608 = null;
                return true;
            } else if (class665.field9360 == class546.field7608) {
                class126.field1798 = class609.field8448.method2600((byte) -124);
                class546.field7608 = null;
                class122.field1762 = class676.field9444;
                return true;
            } else if (class546.field7608 == class253.field3225) {
                int var198 = class609.field8448.method2606((byte) -103);
                int var199 = class609.field8448.method2600((byte) -123);
                int var200 = class609.field8448.method2617((byte) 122);
                int var201 = class609.field8448.method2606((byte) -103);
                int var202 = class609.field8448.method2600((byte) -127);
                class386.method2197(arg0 ^ 0x2C32);
                class193.field2644[var198] = true;
                class70.field978[var198] = var201;
                class332.field4237[var198] = var202;
                class356.field4587[var198] = var199;
                class227.field3011[var198] = var200;
                class546.field7608 = null;
                return true;
            } else if (class745.field10381 == class546.field7608) {
                boolean var203 = class609.field8448.method2600((byte) -123) == 1;
                String var204 = class609.field8448.method2574(arg0 ^ 0x2C76);
                String var205 = var204;
                if (var203) {
                    var205 = class609.field8448.method2574(-1);
                }
                long var206 = class609.field8448.method2613((byte) -107);
                long var208 = (long) class609.field8448.method2566(-2);
                long var210 = (long) class609.field8448.method2576((byte) 48);
                int var212 = class609.field8448.method2600((byte) -123);
                long var213 = (var208 << 32) + var210;
                boolean var215 = false;
                int var216 = 0;
                while (true) {
                    if (var216 >= 100) {
                        if (var212 <= 1) {
                            if (!(!class81.field1113 || class172.field2381) || class165.field2314) {
                                var215 = true;
                            } else if (class176.method1211(80, var205)) {
                                var215 = true;
                            }
                        }
                        break;
                    }
                    if (class15.field294[var216] == var213) {
                        var215 = true;
                        break;
                    }
                    var216++;
                }
                if (!var215 && class511.field7195 == 0) {
                    class15.field294[class709.field9848] = var213;
                    class709.field9848 = (class709.field9848 + 1) % 100;
                    String var217 = class417.method2338(3, class567.method3261(class609.field8448, 23440));
                    if (var212 == 2 || var212 == 3) {
                        class694.method3888(false, var204, 9, -1, "<img=1>" + var205, "<img=1>" + var204, var217, class178.method1215((byte) -41, var206), 0);
                    } else if (var212 == 1) {
                        class694.method3888(false, var204, 9, -1, "<img=0>" + var205, "<img=0>" + var204, var217, class178.method1215((byte) 122, var206), 0);
                    } else {
                        class694.method3888(false, var204, 9, -1, var205, var204, var217, class178.method1215((byte) -127, var206), 0);
                    }
                }
                class546.field7608 = null;
                return true;
            } else if (class625.field8591 == class546.field7608) {
                int var218 = class609.field8448.method2600((byte) -128);
                if (class609.field8448.method2600((byte) -125) == 0) {
                    class258.field3275[var218] = new class116();
                } else {
                    class609.field8448.field6193--;
                    class258.field3275[var218] = new class116(class609.field8448);
                }
                class546.field7608 = null;
                class123.field1771 = class676.field9444;
                return true;
            } else if (class618.field8528 == class546.field7608) {
                class367.method2118(-102);
                class546.field7608 = null;
                return false;
            } else if (class546.field7608 == class526.field7344) {
                if (class353.field4533 != null) {
                    class318.method1876(-1, arg0 + 11383, false, class748.field10451.field10407.method3441((byte) 97), -1);
                }
                byte[] var219 = new byte[class440.field5868];
                class609.field8448.method1232((byte) 60, var219, 0, class440.field5868);
                String var220 = class190.method1277(0, class440.field5868, var219, 37);
                class741.method4132(true, var220, class162.field2227, false, class748.field10451.field10399.method1924((byte) 120) == 1);
                class546.field7608 = null;
                return true;
            } else if (class546.field7608 == class322.field4150) {
                byte var221 = class609.field8448.method2601(0);
                int var222 = class609.field8448.method2617((byte) 70);
                class386.method2197(arg0 + 11260);
                client.method1827(var221, arg0 ^ 0xFFFFCD6F, var222);
                class546.field7608 = null;
                return true;
            } else if (class80.field1106 == class546.field7608) {
                int var223 = class609.field8448.method2617((byte) 117);
                int var224 = class609.field8448.method2604((byte) -127);
                class386.method2197(-73);
                class177.method1214(0, arg0 + 6037, var223, var224);
                class546.field7608 = null;
                return true;
            } else if (class6.field61 == class546.field7608) {
                int var225 = class609.field8448.method2617((byte) 104);
                String var226 = class609.field8448.method2574(-1);
                class386.method2197(-65);
                class506.method2953(true, var226, var225);
                class546.field7608 = null;
                return true;
            } else if (class546.field7608 == class273.field3423) {
                int var227 = class609.field8448.method2617((byte) 86);
                int var228 = class609.field8448.method2566(-2);
                if (var228 == 65535) {
                    var228 = -1;
                }
                int var229 = class609.field8448.method2595((byte) 101);
                if (var229 == 65535) {
                    var229 = -1;
                }
                int var230 = class609.field8448.method2571(21166);
                class386.method2197(-68);
                for (int var231 = var228; var231 <= var229; var231++) {
                    long var232 = ((long) var230 << 32) + (long) var231;
                    class262 var234 = (class262) class16.field323.method1160(var232, 122);
                    class262 var235;
                    if (var234 != null) {
                        var235 = new class262(var234.field3291, var227);
                        var234.method1175(-2);
                    } else if (var231 == -1) {
                        var235 = new class262(class501.method2936(arg0 + 11291, var230).field3756.field3291, var227);
                    } else {
                        var235 = new class262(0, var227);
                    }
                    class16.field323.method1153(var235, var232, arg0 + 11382);
                }
                class546.field7608 = null;
                return true;
            } else if (class6.field62 == class546.field7608) {
                class136.method1002(class609.field8448.method2574(-1), true);
                class546.field7608 = null;
                return true;
            } else if (class631.field8714 == class546.field7608) {
                int var236 = class609.field8448.method2628(94);
                int var237 = class609.field8448.method2595((byte) 102);
                class386.method2197(-128);
                if (var237 == 65535) {
                    var237 = -1;
                }
                class281.method1667(121, var237, var236, 2, -1);
                class546.field7608 = null;
                return true;
            } else if (class546.field7608 == class48.field686) {
                int var238 = class609.field8448.method2617((byte) 105);
                int var239 = class609.field8448.method2606((byte) -103);
                int[] var240 = new int[4];
                for (int var241 = 0; var241 < 4; var241++) {
                    var240[var241] = class609.field8448.method2566(-2);
                }
                class592 var242 = (class592) class207.field2745.method1160((long) var238, 127);
                if (var242 != null) {
                    class353.method2061(var242.field8280, -2, var239, var240);
                }
                class546.field7608 = null;
                return true;
            } else if (class546.field7608 == class205.field2725) {
                class24.method168(class182.field2546, (byte) -85);
                class546.field7608 = null;
                return true;
            } else if (class556.field7737 == class546.field7608) {
                int var243 = class609.field8448.method2595((byte) 26);
                if (var243 == 65535) {
                    var243 = -1;
                }
                int var244 = class609.field8448.method2622(-539564808);
                int var245 = class609.field8448.method2566(-2);
                if (var245 == 65535) {
                    var245 = -1;
                }
                int var246 = class609.field8448.method2584((byte) -37);
                class386.method2197(-105);
                for (int var247 = var245; var247 <= var243; var247++) {
                    long var248 = ((long) var244 << 32) + (long) var247;
                    class262 var250 = (class262) class16.field323.method1160(var248, 125);
                    class262 var251;
                    if (var250 != null) {
                        var251 = new class262(var246, var250.field3297);
                        var250.method1175(-2);
                    } else if (var247 == -1) {
                        var251 = new class262(var246, class501.method2936(-53, var244).field3756.field3297);
                    } else {
                        var251 = new class262(var246, -1);
                    }
                    class16.field323.method1153(var251, var248, -1);
                }
                class546.field7608 = null;
                return true;
            } else if (class546.field7608 == class525.field7331) {
                int var252 = class609.field8448.method2583(false);
                int var253 = class609.field8448.method2595((byte) 90);
                if (var253 == 65535) {
                    var253 = -1;
                }
                int var254 = class609.field8448.method2583(false);
                class48.method367(var252, var254, var253, arg0 + 11473);
                class546.field7608 = null;
                return true;
            } else if (class546.field7608 == class286.field3597) {
                int var255 = class609.field8448.method2600((byte) -126);
                int var256 = class609.field8448.method2580(true);
                int var257 = class609.field8448.method2617((byte) 80);
                if (var257 == 65535) {
                    var257 = -1;
                }
                class621.method3496(var255, var257, (byte) -91, var256);
                class546.field7608 = null;
                return true;
            } else if (class546.field7608 == class257.field3261) {
                class24.method168(class602.field8366, (byte) -85);
                class546.field7608 = null;
                return true;
            } else if (class546.field7608 == class468.field6277) {
                int var258 = class609.field8448.method2604((byte) -128);
                int var259 = class609.field8448.method2604((byte) -126);
                int var260 = class609.field8448.method2595((byte) 46);
                int var261 = class609.field8448.method2628(arg0 + 11450);
                int var262 = class609.field8448.method2600((byte) -124);
                boolean var263 = (var262 & 0x80) != 0;
                int var264 = var262 & 0x7;
                int var265 = var262 >> 3 & 0xF;
                if (var265 == 15) {
                    var265 = -1;
                }
                if ((var261 >> 30) != 0) {
                    int var297 = var261 >> 28 & 0x3;
                    int var298 = (var261 >> 14 & 0x3FFF) - class332.field4232;
                    int var299 = (var261 & 0x3FFF) - class447.field5936;
                    if (var298 >= 0 && var299 >= 0 && class409.field5183 > var298 && class543.field7597 > var299) {
                        int var300 = var298 * 512 + 256;
                        int var301 = var299 * 512 + 256;
                        int var302 = var297;
                        if (var297 < 3 && class99.method797(var299, 1, var298)) {
                            var302 = var297 + 1;
                        }
                        class163 var303 = new class163(var259, var260, class463.field6224, var297, var302, var300, class225.method1448(var297, var300, var301, (byte) 28) - var258, var301, var298, var298, var299, var299, var264);
                        class368.field4759.method3671(new class360(var303), false);
                    }
                } else if (var261 >> 29 != 0) {
                    int var266 = var261 & 0xFFFF;
                    class592 var267 = (class592) class207.field2745.method1160((long) var266, 127);
                    if (var267 != null) {
                        if (var259 == 65535) {
                            var259 = -1;
                        }
                        class733 var268 = var267.field8280;
                        boolean var269 = true;
                        int var270 = var263 ? var268.field199 : var268.field160;
                        if (var259 != -1 && var270 != -1) {
                            if (var259 == var270) {
                                class164 var271 = class234.field3057.method2095(var259, (byte) -124);
                                if (var271.field2267 && var271.field2276 != -1) {
                                    class56 var272 = class66.field941.method1299((byte) -84, var271.field2276);
                                    int var273 = var272.field776;
                                    if (var273 == 0 || var273 == 2) {
                                        var269 = false;
                                    } else if (var273 == 1) {
                                        var269 = true;
                                    }
                                }
                            } else {
                                class164 var274 = class234.field3057.method2095(var259, (byte) 120);
                                class164 var275 = class234.field3057.method2095(var270, (byte) -121);
                                if (var274.field2276 != -1 && var275.field2276 != -1) {
                                    class56 var276 = class66.field941.method1299((byte) -76, var274.field2276);
                                    class56 var277 = class66.field941.method1299((byte) -117, var275.field2276);
                                    if (var277.field786 > var276.field786) {
                                        var269 = false;
                                    }
                                }
                            }
                        }
                        if (var269) {
                            if (var263) {
                                var268.field252 = 1;
                                var268.field193 = 0;
                                var268.field173 = var264;
                                var268.field199 = var259;
                                var268.field204 = class463.field6224 + var260;
                                var268.field167 = 0;
                                var268.field184 = var265;
                                var268.field212 = var258;
                                if (var268.field204 > class463.field6224) {
                                    var268.field167 = -1;
                                }
                                if (var268.field199 != -1 && class463.field6224 == var268.field204) {
                                    int var278 = class234.field3057.method2095(var268.field199, (byte) -123).field2276;
                                    if (var278 != -1) {
                                        class56 var279 = class66.field941.method1299((byte) -77, var278);
                                        if (var279 != null && var279.field771 != null && !var268.field206) {
                                            class758.method4218(0, var268, 0, var279);
                                        }
                                    }
                                }
                            } else {
                                var268.field175 = var265;
                                var268.field229 = class463.field6224 + var260;
                                var268.field163 = var258;
                                var268.field178 = 1;
                                var268.field158 = var264;
                                var268.field220 = 0;
                                var268.field160 = var259;
                                var268.field255 = 0;
                                if (class463.field6224 < var268.field229) {
                                    var268.field220 = -1;
                                }
                                if (var268.field160 != -1 && class463.field6224 == var268.field229) {
                                    int var280 = class234.field3057.method2095(var268.field160, (byte) 88).field2276;
                                    if (var280 != -1) {
                                        class56 var281 = class66.field941.method1299((byte) -128, var280);
                                        if (var281 != null && var281.field771 != null && !var268.field206) {
                                            class758.method4218(0, var268, 0, var281);
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else if (var261 >> 28 != 0) {
                    int var282 = var261 & 0xFFFF;
                    class724 var283;
                    if (class54.field755 == var282) {
                        var283 = class380.field4847;
                    } else {
                        var283 = class5.field49[var282];
                    }
                    if (var283 != null) {
                        if (var259 == 65535) {
                            var259 = -1;
                        }
                        boolean var284 = true;
                        int var285 = var263 ? var283.field199 : var283.field160;
                        if (var259 != -1 && var285 != -1) {
                            if (var259 == var285) {
                                class164 var286 = class234.field3057.method2095(var259, (byte) -123);
                                if (var286.field2267 && var286.field2276 != -1) {
                                    class56 var287 = class66.field941.method1299((byte) -111, var286.field2276);
                                    int var288 = var287.field776;
                                    if (var288 == 0 || var288 == 2) {
                                        var284 = false;
                                    } else if (var288 == 1) {
                                        var284 = true;
                                    }
                                }
                            } else {
                                class164 var289 = class234.field3057.method2095(var259, (byte) -125);
                                class164 var290 = class234.field3057.method2095(var285, (byte) -122);
                                if (var289.field2276 != -1 && var290.field2276 != -1) {
                                    class56 var291 = class66.field941.method1299((byte) -111, var289.field2276);
                                    class56 var292 = class66.field941.method1299((byte) -120, var290.field2276);
                                    if (var291.field786 < var292.field786) {
                                        var284 = false;
                                    }
                                }
                            }
                        }
                        if (var284) {
                            if (var263) {
                                var283.field173 = var264;
                                var283.field184 = var265;
                                var283.field252 = 1;
                                var283.field212 = var258;
                                var283.field199 = var259;
                                var283.field204 = class463.field6224 + var260;
                                var283.field193 = 0;
                                var283.field167 = 0;
                                if (var283.field199 == 65535) {
                                    var283.field199 = -1;
                                }
                                if (var283.field204 > class463.field6224) {
                                    var283.field167 = -1;
                                }
                                if (var283.field199 != -1 && class463.field6224 == var283.field204) {
                                    int var295 = class234.field3057.method2095(var283.field199, (byte) 43).field2276;
                                    if (var295 != -1) {
                                        class56 var296 = class66.field941.method1299((byte) -119, var295);
                                        if (var296 != null && var296.field771 != null && !var283.field206) {
                                            class758.method4218(0, var283, 0, var296);
                                        }
                                    }
                                }
                            } else {
                                var283.field220 = 0;
                                var283.field175 = var265;
                                var283.field229 = class463.field6224 + var260;
                                var283.field163 = var258;
                                var283.field178 = 1;
                                var283.field255 = 0;
                                var283.field158 = var264;
                                var283.field160 = var259;
                                if (var283.field160 == 65535) {
                                    var283.field160 = -1;
                                }
                                if (class463.field6224 < var283.field229) {
                                    var283.field220 = -1;
                                }
                                if (var283.field160 != -1 && class463.field6224 == var283.field229) {
                                    int var293 = class234.field3057.method2095(var283.field160, (byte) -8).field2276;
                                    if (var293 != -1) {
                                        class56 var294 = class66.field941.method1299((byte) -121, var293);
                                        if (var294 != null && var294.field771 != null && !var283.field206) {
                                            class758.method4218(0, var283, 0, var294);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                class546.field7608 = null;
                return true;
            } else if (class560.field7903 == class546.field7608) {
                class98.method785((byte) -120, false);
                class546.field7608 = null;
                return false;
            } else if (class546.field7608 == class126.field1800) {
                int var304 = class609.field8448.method2622(-539564808);
                int var305 = class609.field8448.method2567(8192);
                class386.method2197(arg0 + 11289);
                class711.method3975(var305, (byte) 110, var304);
                class546.field7608 = null;
                return true;
            } else if (class546.field7608 == class24.field448) {
                int var306 = class609.field8448.method2604((byte) -128);
                int var307 = class609.field8448.method2622(-539564808);
                class386.method2197(arg0 ^ 0x2C1F);
                class61.method558(var307, arg0 + 38529, var306);
                class546.field7608 = null;
                return true;
            } else if (class701.field9758 == class546.field7608) {
                class24.method168(class379.field4837, (byte) -85);
                class546.field7608 = null;
                return true;
            } else if (class546.field7608 == class36.field566) {
                class33.field547 = class609.field8448.method2600((byte) -123);
                class546.field7608 = null;
                return true;
            } else if (class546.field7608 == class373.field4788) {
                class597.field8318 = class609.field8448.method2577(2);
                class122.field1762 = class676.field9444;
                class546.field7608 = null;
                return true;
            } else if (class546.field7608 == class267.field3362) {
                boolean var308 = class609.field8448.method2600((byte) -123) == 1;
                String var309 = class609.field8448.method2574(arg0 + 11382);
                String var310 = var309;
                if (var308) {
                    var310 = class609.field8448.method2574(-1);
                }
                int var311 = class609.field8448.method2600((byte) -124);
                boolean var312 = false;
                if (var311 <= 1) {
                    if (!(!class81.field1113 || class172.field2381) || class165.field2314) {
                        var312 = true;
                    } else if (var311 <= 1 && class176.method1211(80, var310)) {
                        var312 = true;
                    }
                }
                if (!var312 && class511.field7195 == 0) {
                    String var313 = class417.method2338(3, class567.method3261(class609.field8448, 23440));
                    if (var311 == 2) {
                        class694.method3888(false, var309, 24, -1, "<img=1>" + var310, "<img=1>" + var309, var313, null, 0);
                    } else if (var311 == 1) {
                        class694.method3888(false, var309, 24, -1, "<img=0>" + var310, "<img=0>" + var309, var313, null, 0);
                    } else {
                        class694.method3888(false, var309, 24, -1, var310, var309, var313, null, 0);
                    }
                }
                class546.field7608 = null;
                return true;
            } else if (class564.field7934 == class546.field7608) {
                int var314 = class609.field8448.method2566(-2);
                int var315 = class609.field8448.method2566(-2);
                int var316 = class609.field8448.method2566(-2);
                class386.method2197(-121);
                if (class218.field2938[var314] != null) {
                    for (int var317 = var315; var317 < var316; var317++) {
                        int var318 = class609.field8448.method2576((byte) 57);
                        if (class218.field2938[var314].length > var317 && class218.field2938[var314][var317] != null) {
                            class218.field2938[var314][var317].field3745 = var318;
                        }
                    }
                }
                class546.field7608 = null;
                return true;
            } else if (class546.field7608 == class172.field2380) {
                class24.method168(class391.field4977, (byte) -85);
                class546.field7608 = null;
                return true;
            } else if (class706.field9782 == class546.field7608) {
                class516.field7236.method2284(207);
                class510.field7185 += 32;
                class546.field7608 = null;
                return true;
            } else if (class546.field7608 == class526.field7346) {
                class24.method168(class106.field1529, (byte) -85);
                class546.field7608 = null;
                return true;
            } else if (class733.field10200 == class546.field7608) {
                class24.method168(class543.field7503, (byte) -85);
                class546.field7608 = null;
                return true;
            } else if (class546.field7608 == class498.field7014) {
                class90.field1245 = class609.field8448.method2593((byte) 95) << 3;
                class118.field1732 = class609.field8448.method2579(arg0 + 11499) << 3;
                class35.field556 = class609.field8448.method2606((byte) -103);
                class546.field7608 = null;
                return true;
            } else if (class745.field10380 == class546.field7608) {
                int var319 = class609.field8448.method2595((byte) 112);
                int var320 = class609.field8448.method2571(21166);
                class386.method2197(-75);
                class546.method3150(var320, var319, arg0 + 11400);
                class546.field7608 = null;
                return true;
            } else if (class705.field9775 == class546.field7608) {
                int var321 = class609.field8448.method2566(arg0 ^ 0x2C77);
                int var322 = class609.field8448.method2600((byte) -126);
                boolean var323 = (var322 & 0x1) == 1;
                while (class609.field8448.field6193 < class440.field5868) {
                    int var324 = class609.field8448.method2594(arg0 + 14723);
                    int var325 = class609.field8448.method2566(-2);
                    int var326 = 0;
                    if (var325 != 0) {
                        var326 = class609.field8448.method2600((byte) -127);
                        if (var326 == 255) {
                            var326 = class609.field8448.method2622(arg0 - 539553425);
                        }
                    }
                    class437.method2491(var323, 2709, var325 - 1, var324, var321, var326);
                }
                class735.field10222[class702.method3949(31, class501.field7093++)] = var321;
                class546.field7608 = null;
                return true;
            } else if (class552.field7707 == class546.field7608) {
                int var327 = class609.field8448.method2628(88);
                class386.method2197(-88);
                class491 var328 = (class491) class290.field3804.method1160((long) var327, arg0 + 11507);
                if (var328 != null) {
                    class178.method1218(256, false, var328, true);
                }
                if (class345.field4361 != null) {
                    class207.method1332((byte) -101, class345.field4361);
                    class345.field4361 = null;
                }
                class546.field7608 = null;
                return true;
            } else if (class546.field7608 == class299.field3929) {
                int var329 = class609.field8448.method2566(-2);
                class386.method2197(arg0 + 11295);
                class257.method1562(var329, (byte) -40);
                class546.field7608 = null;
                return true;
            } else if (class762.field10626 == class546.field7608) {
                int var330 = class609.field8448.method2629(arg0 + 11282);
                int var331 = class609.field8448.method2584((byte) -37);
                int var332 = class609.field8448.method2604((byte) -128);
                class386.method2197(-74);
                class491 var333 = (class491) class290.field3804.method1160((long) var331, 125);
                if (var333 != null) {
                    class178.method1218(256, false, var333, var333.field6978 != var332);
                }
                class39.method240(var331, false, var332, var330, 109);
                class546.field7608 = null;
                return true;
            } else if (class546.field7608 == class368.field4744) {
                int var334 = class609.field8448.method2566(-2);
                int var335 = class609.field8448.method2600((byte) -123);
                class386.method2197(-81);
                if (var335 == 2) {
                    class429.method2458(arg0 ^ 0xFFFFD376);
                }
                class540.field7482 = var334;
                class423.method2354(var334, (byte) -58);
                class203.method1317(false, false);
                class188.method1270(class540.field7482);
                for (int var336 = 0; var336 < 100; var336++) {
                    class559.field7782[var336] = true;
                }
                class546.field7608 = null;
                return true;
            } else if (class658.field9157 == class546.field7608) {
                String var337 = class609.field8448.method2574(-1);
                int var338 = class609.field8448.method2628(arg0 ^ 0xFFFFD3C8);
                class386.method2197(-109);
                class146.method1047(var338, 3, var337);
                class546.field7608 = null;
                return true;
            } else if (class564.field7928 == class546.field7608) {
                int var339 = class609.field8448.method2577(2);
                int var340 = class609.field8448.method2567(8192);
                int var341 = class609.field8448.method2622(arg0 ^ 0x20293771);
                class386.method2197(-100);
                class753.method4184((byte) 95, var341, var340, var339);
                class546.field7608 = null;
                return true;
            } else if (class84.field1154 == class546.field7608) {
                class672.method3775(class609.field8448, class162.field2227, (byte) -82, class440.field5868);
                class546.field7608 = null;
                return true;
            } else if (class592.field8279 == class546.field7608) {
                int var342 = class609.field8448.method2617((byte) 104);
                int var343 = class609.field8448.method2628(arg0 + 11467);
                class516.field7236.method2281(11870, var343, var342);
                class546.field7608 = null;
                return true;
            } else if (class546.field7608 == class540.field7487) {
                class24.method168(class262.field3313, (byte) -85);
                class546.field7608 = null;
                return true;
            } else if (class56.field794 == class546.field7608) {
                int var344 = class609.field8448.method2583(false);
                class386.method2197(-68);
                class546.field7608 = null;
                class13.field213 = var344;
                return true;
            } else if (class546.field7608 == class139.field1986) {
                class193.field2639 = class440.field5868 <= 2 ? class454.field6029.method2547(-114, class243.field3143) : class609.field8448.method2574(-1);
                class593.field8290 = class440.field5868 > 0 ? class609.field8448.method2566(-2) : -1;
                class546.field7608 = null;
                if (class593.field8290 == 65535) {
                    class593.field8290 = -1;
                }
                return true;
            } else if (class603.field8374 == class546.field7608) {
                class24.method168(class232.field3049, (byte) -85);
                class546.field7608 = null;
                return true;
            } else if (class546.field7608 == class256.field3256) {
                int var345 = class609.field8448.method2583(false);
                int var346 = class609.field8448.method2566(-2);
                class386.method2197(-128);
                class636.method3566(-102, true, var345, var346);
                class546.field7608 = null;
                return true;
            } else if (class546.field7608 == class286.field3603) {
                class609.field8448.field6193 += 28;
                if (class609.field8448.method2587(true)) {
                    class754.method4188(24, class609.field8448.field6193 - 28, class609.field8448);
                }
                class546.field7608 = null;
                return true;
            } else if (class546.field7608 == class356.field4575) {
                class321.field4149 = class609.field8448.method2582(-1);
                class81.field1113 = class609.field8448.method2600((byte) -123) == 1;
                class546.field7608 = null;
                return true;
            } else if (class729.field10145 == class546.field7608) {
                int var347 = class609.field8448.method2584((byte) -37);
                int var348 = class609.field8448.method2617((byte) 124);
                class386.method2197(arg0 ^ 0x2C07);
                if (var348 == 65535) {
                    var348 = -1;
                }
                class101.method809(0, var347, var348);
                class546.field7608 = null;
                return true;
            } else if (class546.field7608 == class359.field4654) {
                class169.field2359 = class435.method2478(0, class609.field8448.method2600((byte) -124));
                class546.field7608 = null;
                return true;
            } else if (class725.field10112 == class546.field7608) {
                int var349 = class609.field8448.method2595((byte) 88);
                class386.method2197(-81);
                class386.method2194(var349, 114);
                class546.field7608 = null;
                return true;
            } else if (class577.field8099 == class546.field7608) {
                int var350 = class609.field8448.method2622(-539564808);
                class310.field4084 = class162.field2227.method2640(var350, (byte) -118);
                class546.field7608 = null;
                return true;
            } else if (class756.field10545 == class546.field7608) {
                boolean var351 = class609.field8448.method2600((byte) -123) == 1;
                String var352 = class609.field8448.method2574(arg0 ^ 0x2C76);
                String var353 = var352;
                if (var351) {
                    var353 = class609.field8448.method2574(arg0 + 11382);
                }
                long var354 = (long) class609.field8448.method2566(-2);
                long var356 = (long) class609.field8448.method2576((byte) 84);
                int var358 = class609.field8448.method2600((byte) -126);
                int var359 = class609.field8448.method2566(-2);
                long var360 = (var354 << 32) + var356;
                boolean var362 = false;
                int var363 = 0;
                while (true) {
                    if (var363 >= 100) {
                        if (var358 <= 1 && class176.method1211(80, var353)) {
                            var362 = true;
                        }
                        break;
                    }
                    if (class15.field294[var363] == var360) {
                        var362 = true;
                        break;
                    }
                    var363++;
                }
                if (!var362 && class511.field7195 == 0) {
                    class15.field294[class709.field9848] = var360;
                    class709.field9848 = (class709.field9848 + 1) % 100;
                    String var364 = class609.field8450.method227(11041, var359).method1255(true, class609.field8448);
                    if (var358 == 2) {
                        class694.method3888(false, var352, 18, var359, "<img=1>" + var353, "<img=1>" + var352, var364, null, 0);
                    } else if (var358 == 1) {
                        class694.method3888(false, var352, 18, var359, "<img=0>" + var353, "<img=0>" + var352, var364, null, 0);
                    } else {
                        class694.method3888(false, var352, 18, var359, var353, var352, var364, null, 0);
                    }
                }
                class546.field7608 = null;
                return true;
            } else if (class546.field7608 == class339.field4291) {
                String var365 = class609.field8448.method2574(-1);
                Object[] var366 = new Object[var365.length() + 1];
                for (int var367 = var365.length() - 1; var367 >= 0; var367--) {
                    if (var365.charAt(var367) == 's') {
                        var366[var367 + 1] = class609.field8448.method2574(arg0 + 11382);
                    } else {
                        var366[var367 + 1] = Integer.valueOf(class609.field8448.method2622(-539564808));
                    }
                }
                var366[0] = Integer.valueOf(class609.field8448.method2622(-539564808));
                class386.method2197(-96);
                class694 var368 = new class694();
                var368.field9645 = var366;
                class188.method1262(var368);
                class546.field7608 = null;
                return true;
            } else if (class546.field7608 == class378.field4830) {
                int var369 = class609.field8448.method2566(-2);
                if (var369 == 65535) {
                    var369 = -1;
                }
                int var370 = class609.field8448.method2600((byte) -125);
                int var371 = class609.field8448.method2566(-2);
                int var372 = class609.field8448.method2600((byte) -125);
                class622.method3499(var369, 256, true, true, var370, var371, var372);
                class546.field7608 = null;
                return true;
            } else if (class546.field7608 == class408.field5176) {
                class24.method168(class428.field5734, (byte) -85);
                class546.field7608 = null;
                return true;
            } else if (class587.field8201 == class546.field7608) {
                boolean var373 = class609.field8448.method2629(-70) == 1;
                class386.method2197(-82);
                class546.field7608 = null;
                class348.field4496 = var373;
                return true;
            } else if (class546.field7608 == class124.field1792) {
                class24.method168(class349.field4498, (byte) -85);
                class546.field7608 = null;
                return true;
            } else if (class680.field9493 == class546.field7608) {
                int var374 = class609.field8448.method2566(-2);
                if (var374 == 65535) {
                    var374 = -1;
                }
                int var375 = class609.field8448.method2583(false);
                int var376 = var375 >> 2;
                int var377 = var375 & 0x3;
                int var378 = class119.field1742[var376];
                int var379 = class609.field8448.method2584((byte) -37);
                int var380 = var379 >> 28 & 0x3;
                int var381 = var379 >> 14 & 0x3FFF;
                int var382 = var379 & 0x3FFF;
                int var383 = var381 - class332.field4232;
                int var384 = var382 - class447.field5936;
                class293.method1758(var384, var377, var374, -116, var378, var380, var376, var383);
                class546.field7608 = null;
                return true;
            } else if (class546.field7608 == class537.field7447) {
                if (class540.field7482 != -1) {
                    class1.method1(0, class540.field7482, (byte) 13);
                }
                class546.field7608 = null;
                return true;
            } else if (class757.field10549 == class546.field7608) {
                int var385 = class609.field8448.method2566(-2);
                int var386 = class609.field8448.method2600((byte) -124);
                boolean var387 = (var386 & 0x1) == 1;
                class391.method2213((byte) -43, var387, var385);
                int var388 = class609.field8448.method2566(-2);
                for (int var389 = 0; var389 < var388; var389++) {
                    int var390 = class609.field8448.method2629(-83);
                    if (var390 == 255) {
                        var390 = class609.field8448.method2622(-539564808);
                    }
                    int var391 = class609.field8448.method2566(-2);
                    class437.method2491(var387, 2709, var391 - 1, var389, var385, var390);
                }
                class735.field10222[class702.method3949(class501.field7093++, 31)] = var385;
                class546.field7608 = null;
                return true;
            } else if (class546.field7608 == class253.field3237) {
                class20.field370 = class609.field8448.method2600((byte) -126);
                for (int var392 = 0; var392 < class20.field370; var392++) {
                    class469.field6287[var392] = class609.field8448.method2574(arg0 + 11382);
                    class160.field2213[var392] = class609.field8448.method2574(-1);
                    if (class160.field2213[var392].equals("")) {
                        class160.field2213[var392] = class469.field6287[var392];
                    }
                    class636.field8768[var392] = class609.field8448.method2574(-1);
                    class752.field10499[var392] = class609.field8448.method2574(-1);
                    if (class752.field10499[var392].equals("")) {
                        class752.field10499[var392] = class636.field8768[var392];
                    }
                    class216.field2921[var392] = false;
                }
                class42.field624 = class676.field9444;
                class546.field7608 = null;
                return true;
            } else if (class6.field63 == class546.field7608) {
                int var393 = class609.field8448.method2628(113);
                int var394 = class609.field8448.method2571(21166);
                int var395 = class609.field8448.method2604((byte) -127);
                class386.method2197(arg0 + 11314);
                class281.method1667(88, var395, var393, 5, var394);
                class546.field7608 = null;
                return true;
            } else if (class92.field1266 == class546.field7608) {
                class300.method1793(class440.field5868, (byte) -49, class609.field8448);
                class546.field7608 = null;
                return true;
            } else if (class638.field8789 == class546.field7608) {
                boolean var396 = class609.field8448.method2600((byte) -126) == 1;
                String var397 = class609.field8448.method2574(-1);
                String var398 = var397;
                if (var396) {
                    var398 = class609.field8448.method2574(-1);
                }
                int var399 = class609.field8448.method2600((byte) -123);
                int var400 = class609.field8448.method2566(arg0 + 11381);
                boolean var401 = false;
                if (var399 <= 1 && class176.method1211(80, var398)) {
                    var401 = true;
                }
                if (!var401 && class511.field7195 == 0) {
                    String var402 = class609.field8450.method227(arg0 + 22424, var400).method1255(true, class609.field8448);
                    if (var399 == 2) {
                        class694.method3888(false, var397, 25, var400, "<img=1>" + var398, "<img=1>" + var397, var402, null, 0);
                    } else if (var399 == 1) {
                        class694.method3888(false, var397, 25, var400, "<img=0>" + var398, "<img=0>" + var397, var402, null, 0);
                    } else {
                        class694.method3888(false, var397, 25, var400, var398, var397, var402, null, 0);
                    }
                }
                class546.field7608 = null;
                return true;
            } else if (class546.field7608 == class507.field7156) {
                int var403 = class609.field8448.method2595((byte) 91);
                int var404 = class609.field8448.method2571(21166);
                int var405 = class609.field8448.method2595((byte) 48);
                int var406 = class609.field8448.method2566(-2);
                class386.method2197(-78);
                class121.method929(var405, var403, var404, var406, false);
                class546.field7608 = null;
                return true;
            } else if (class589.field8258 == class546.field7608) {
                int var407 = class609.field8448.method2566(-2);
                int var408 = class609.field8448.method2583(false);
                class516.field7236.method2279(var407, var408, (byte) -127);
                class546.field7608 = null;
                return true;
            } else if (class546.field7608 == class353.field4535) {
                class98.method785((byte) 34, class159.field2165);
                class546.field7608 = null;
                return false;
            } else if (class641.field8898 == class546.field7608) {
                class24.method168(class104.field1426, (byte) -85);
                class546.field7608 = null;
                return true;
            } else {
                class684.method3842(1, null, "T1 - " + (class546.field7608 == null ? -1 : class546.field7608.method1626(-1)) + "," + (class154.field2099 == null ? -1 : class154.field2099.method1626(arg0 ^ 0x2C76)) + "," + (class255.field3248 == null ? -1 : class255.field3248.method1626(arg0 + 11382)) + " - " + class440.field5868);
                class98.method785((byte) -118, false);
                return true;
            }
        }
    }
}
