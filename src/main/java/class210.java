import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jo")
public abstract class class210 extends class250 {

    @OriginalMember(owner = "client!jo", name = "u", descriptor = "S")
    public short field2972;

    @OriginalMember(owner = "client!jo", name = "w", descriptor = "B")
    public byte field2974;

    @OriginalMember(owner = "client!jo", name = "s", descriptor = "I")
    public int field2970;

    @OriginalMember(owner = "client!jo", name = "h", descriptor = "I")
    public int field2959;

    @OriginalMember(owner = "client!jo", name = "e", descriptor = "B")
    public byte field2956;

    @OriginalMember(owner = "client!jo", name = "k", descriptor = "S")
    public short field2962;

    @OriginalMember(owner = "client!jo", name = "x", descriptor = "S")
    public short field2975;

    @OriginalMember(owner = "client!jo", name = "o", descriptor = "I")
    public int field2966;

    @OriginalMember(owner = "client!jo", name = "f", descriptor = "S")
    public short field2957;

    @OriginalMember(owner = "client!jo", name = "p", descriptor = "Z")
    public boolean field2967;

    @OriginalMember(owner = "client!jo", name = "y", descriptor = "I")
    public static int field2976 = 0;

    @OriginalMember(owner = "client!jo", name = "i", descriptor = "Lak;")
    public static class222 field2960 = new class222(15, 0, 1, 0);

    @OriginalMember(owner = "client!jo", name = "q", descriptor = "F")
    public static float field2968;

    @OriginalMember(owner = "client!jo", name = "g", descriptor = "I")
    public static int field2958;

    @OriginalMember(owner = "client!jo", name = "j", descriptor = "I")
    public static int field2961;

    @OriginalMember(owner = "client!jo", name = "l", descriptor = "I")
    public static int field2963;

    @OriginalMember(owner = "client!jo", name = "m", descriptor = "I")
    public static int field2964;

    @OriginalMember(owner = "client!jo", name = "n", descriptor = "I")
    public static int field2965;

    @OriginalMember(owner = "client!jo", name = "t", descriptor = "I")
    public int field2971;

    @OriginalMember(owner = "client!jo", name = "v", descriptor = "I")
    public static int field2973;

    @OriginalMember(owner = "client!jo", name = "z", descriptor = "I")
    public static int field2977;

    @OriginalMember(owner = "client!jo", name = "r", descriptor = "J")
    public static long field2969;

    // $FF: synthetic field
    @OriginalMember(owner = "client!jo", name = "A", descriptor = "Ljava/lang/Class;")
    public static Class field2978;

    // $FF: synthetic method
    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method1302(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!jo", name = "f", descriptor = "(I)V", line = 3)
    public void method1295(int arg0) {
        field2963++;
        if (arg0 <= 6) {
            method1298(77);
        }
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(II[FIIII)V", line = 20)
    public static final void method1296(int arg0, int arg1, float[] arg2, int arg3, int arg4, int arg5, int arg6) {
        field2965++;
        if (arg3 > 0 && !class403.method2418(arg3, (byte) 121)) {
            throw new IllegalArgumentException("");
        } else if (arg0 <= 0 || class403.method2418(arg0, (byte) 105)) {
            int var7 = class90.method568(arg4, (byte) 97);
            int var8 = 0;
            int var9 = arg0 <= arg3 ? arg0 : arg3;
            if (arg6 != 6618) {
                field2977 = -110;
            }
            int var10 = arg3 >> 1;
            int var11 = arg0 >> 1;
            float[] var12 = arg2;
            float[] var13 = new float[var7 * var10 * var11];
            while (true) {
                OpenGL.glTexImage2Df(arg1, var8, arg5, arg3, arg0, 0, arg4, 5126, var12, 0);
                if (var9 <= 1) {
                    return;
                }
                int var14 = arg3 * var7;
                for (int var15 = 0; var15 < var7; var15++) {
                    int var17 = var15;
                    int var18 = var15;
                    int var19 = var14 + var15;
                    for (int var20 = 0; var20 < var11; var20++) {
                        for (int var21 = 0; var21 < var10; var21++) {
                            float var22 = var12[var18];
                            int var23 = var7 + var18;
                            float var24 = var12[var23] + var22;
                            float var25 = var12[var19] + var24;
                            var18 = var7 + var23;
                            int var26 = var7 + var19;
                            float var27 = var12[var26] + var25;
                            var19 = var7 + var26;
                            var13[var17] = var27 * 0.25F;
                            var17 += var7;
                        }
                        var18 += var14;
                        var19 += var14;
                    }
                }
                float[] var16 = var13;
                var13 = var12;
                arg3 = var10;
                arg0 = var11;
                var12 = var16;
                var8++;
                var11 >>= 0x1;
                var9 >>= 0x1;
                var10 >>= 0x1;
            }
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(BZILts;I)V", line = 122)
    public static final void method1297(byte arg0, boolean arg1, int arg2, class356 arg3, int arg4) {
        field2961++;
        int var5 = -11 / ((33 - arg0) / 59);
        int var6 = arg3.field5168;
        int var7 = arg3.field5169;
        if (arg3.field5163 == 0) {
            arg3.field5168 = arg3.field5162;
        } else if (arg3.field5163 == 1) {
            arg3.field5168 = arg2 - arg3.field5162;
        } else if (arg3.field5163 == 2) {
            arg3.field5168 = arg3.field5162 * arg2 >> 14;
        }
        if (arg3.field5148 == 0) {
            arg3.field5169 = arg3.field5232;
        } else if (arg3.field5148 == 1) {
            arg3.field5169 = arg4 - arg3.field5232;
        } else if (arg3.field5148 == 2) {
            arg3.field5169 = arg3.field5232 * arg4 >> 14;
        }
        if (arg3.field5163 == 4) {
            arg3.field5168 = arg3.field5238 * arg3.field5169 / arg3.field5276;
        }
        if (arg3.field5148 == 4) {
            arg3.field5169 = arg3.field5276 * arg3.field5168 / arg3.field5238;
        }
        if (class27.field438 && (client.method1188(arg3).field7487 != 0 || arg3.field5170 == 0)) {
            if (arg3.field5169 < 5 && arg3.field5168 < 5) {
                arg3.field5169 = 5;
                arg3.field5168 = 5;
            } else {
                if (arg3.field5169 <= 0) {
                    arg3.field5169 = 5;
                }
                if (arg3.field5168 <= 0) {
                    arg3.field5168 = 5;
                }
            }
        }
        if (class154.field1972 == arg3.field5192) {
            class186.field2642 = arg3;
        }
        if (arg1 && arg3.field5283 != null && arg3.field5168 != var6 || arg3.field5169 != var7) {
            class99 var8 = new class99();
            var8.field1343 = arg3;
            var8.field1346 = arg3.field5283;
            class300.field4355.method2086((byte) -118, var8);
        }
    }

    @OriginalMember(owner = "client!jo", name = "g", descriptor = "(I)V", line = 205)
    public static final void method1298(int arg0) {
        for (class167 var1 = (class167) class121.field1589.method2096(-21400); var1 != null; var1 = (class167) class121.field1589.method2084((byte) 19)) {
            if (class358.field5312 == null) {
                var1.method536(false);
            } else if (var1.field2187 <= class263.field3748) {
                int var2 = class327.field4772[var1.field2181];
                if (var2 == 0) {
                    class403 var3 = class478.method2795(var1.field2182, var1.field2180, var1.field2188);
                    if (var3 instanceof class349) {
                        class211.method1303(var1.field2182, var1.field2180, var1.field2188);
                        class349 var4 = (class349) var3;
                        if (var4.field5048 != null) {
                            class30.method249(var1.field2182, var1.field2180, var1.field2188, var4.field5048, null);
                        }
                    }
                } else if (var2 == 1) {
                    class455 var9 = class305.method1832(var1.field2182, var1.field2180, var1.field2188);
                    if (var9 instanceof class172) {
                        class364.method2228(var1.field2182, var1.field2180, var1.field2188);
                        class172 var10 = (class172) var9;
                        if (var10.field2348 != null) {
                            class378.method2286(var1.field2182, var1.field2180, var1.field2188, var10.field2348, null);
                        }
                    }
                } else if (var2 == 2) {
                    class210 var7 = class124.method701(var1.field2182, var1.field2180, var1.field2188, field2978 == null ? (field2978 = method1302("sq")) : field2978);
                    if (var7 instanceof class387) {
                        class434.method2564(var1.field2182, var1.field2180, var1.field2188, field2978 == null ? (field2978 = method1302("sq")) : field2978);
                        class387 var8 = (class387) var7;
                        if (var8.field5742 != null) {
                            class76.method503(var8.field5742, false);
                        }
                    }
                } else if (var2 == 3) {
                    class79 var5 = class79.method515(var1.field2182, var1.field2180, var1.field2188);
                    if (var5 instanceof class178) {
                        class174.method1092(var1.field2182, var1.field2180, var1.field2188);
                        class178 var6 = (class178) var5;
                        if (var6.field2548 != null) {
                            class110.method655(var1.field2182, var1.field2180, var1.field2188, var6.field2548);
                        }
                    }
                }
                var1.method536(false);
            } else if (class263.field3748 == var1.field2196) {
                int var11 = class327.field4772[var1.field2181];
                if (var11 == 0) {
                    class403 var21 = class478.method2795(var1.field2182, var1.field2180, var1.field2188);
                    if (var21 instanceof class349) {
                        var1.method536(false);
                    } else if (class452.method2630(var1.field2182, var1.field2180, var1.field2188) == null) {
                        class349 var22 = new class349(var1.field2181, var1.field2184, var1.field2185, var1.field2197, var1.field2183, var21);
                        class30.method249(var1.field2182, var1.field2180, var1.field2188, var22, null);
                    } else {
                        var1.method536(false);
                    }
                } else if (var11 == 1) {
                    class455 var19 = class305.method1832(var1.field2182, var1.field2180, var1.field2188);
                    if (var19 instanceof class172) {
                        var1.method536(false);
                    } else if (class133.method731(var1.field2182, var1.field2180, var1.field2188) == null) {
                        class172 var20 = new class172(var1.field2181, var1.field2184, var1.field2185, var1.field2197, var1.field2183, var19);
                        class378.method2286(var1.field2182, var1.field2180, var1.field2188, var20, null);
                    } else {
                        var1.method536(false);
                    }
                } else if (var11 == 2) {
                    class210 var14 = class124.method701(var1.field2182, var1.field2180, var1.field2188, field2978 == null ? (field2978 = method1302("sq")) : field2978);
                    if (var14 instanceof class387) {
                        var1.method536(false);
                    } else {
                        class434.method2564(var1.field2182, var1.field2180, var1.field2188, field2978 == null ? (field2978 = method1302("sq")) : field2978);
                        class486 var15 = class114.field1471.method2132((byte) 125, var1.field2186);
                        int var16;
                        int var17;
                        if (var1.field2184 == 1 || var1.field2184 == 3) {
                            var16 = var15.field7096;
                            var17 = var15.field7036;
                        } else {
                            var16 = var15.field7036;
                            var17 = var15.field7096;
                        }
                        class387 var18 = new class387(var1.field2181, var1.field2184, var1.field2182, var1.field2185, var1.field2197, var1.field2183, var1.field2180, var16 + var1.field2180 - 1, var1.field2188, var17 + var1.field2188 - 1, var14);
                        class76.method503(var18, false);
                    }
                } else if (var11 == 3) {
                    class79 var12 = class79.method515(var1.field2182, var1.field2180, var1.field2188);
                    if (var12 instanceof class178) {
                        var1.method536(false);
                    } else {
                        class178 var13 = new class178(var1.field2185, var1.field2197, var1.field2183, var12);
                        class110.method655(var1.field2182, var1.field2180, var1.field2188, var13);
                    }
                }
            }
        }
        field2973++;
        if (arg0 != -4560) {
            field2960 = null;
        }
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(I[[[BIBII)V", line = 416)
    public static final void method1299(int arg0, byte[][][] arg1, int arg2, byte arg3, int arg4, int arg5) {
        class130.field1655++;
        class444.field6481 = 0;
        for (int var6 = class206.field2864; var6 < class399.field5881; var6++) {
            class468[][] var17 = class358.field5312[var6];
            for (int var18 = class480.field6935; var18 < class30.field499; var18++) {
                for (int var19 = class120.field1556; var19 < class148.field1924; var19++) {
                    class468 var20 = var17[var18][var19];
                    if (var20 != null) {
                        if (class52.field777[var18 + field2977 - class463.field6724][var19 + field2977 - class284.field4053] && arg1 == null || var6 < arg2 || arg1[var6][var18][var19] != arg3) {
                            var20.field6757 = true;
                            var20.field6768 = true;
                            if (var20.field6769 == null) {
                                var20.field6756 = false;
                            } else {
                                var20.field6756 = true;
                            }
                            class444.field6481++;
                        } else {
                            var20.field6757 = false;
                            var20.field6768 = false;
                            var20.field6775 = 0;
                            if (var18 >= class463.field6724 - 16 && var18 <= class463.field6724 + 16 && var19 >= class284.field4053 - 16 && var19 <= class284.field4053 + 16 && (var20.field6778 != null || var20.field6766 != null || var20.field6772 != null || var20.field6777 != null || var20.field6761 != null || var20.field6769 != null)) {
                                class248.field3564.method150(var20, 97);
                            }
                        }
                    }
                }
            }
        }
        boolean var7 = class311.field4527 == class178.field2562;
        for (int var8 = class206.field2864; var8 < class399.field5881; var8++) {
            float var9 = var7 ? 251.5F : 201.5F - (float) var8 * 50.0F - 0.5F;
            if (class473.field6834.method831() && var8 >= arg2 && arg1 != null) {
                int var10 = class52.field777.length;
                if (class52.field777.length + class480.field6935 > class282.field4031) {
                    var10 -= class52.field777.length + class480.field6935 - class282.field4031;
                }
                int var11 = class52.field777[0].length;
                if (class52.field777[0].length + class120.field1556 > class98.field1339) {
                    var11 -= class52.field777[0].length + class120.field1556 - class98.field1339;
                }
                int var12 = class261.field3727;
                while (true) {
                    if (var12 >= var10) {
                        class248.field3564.method148(class311.field4527[var8], 0, var8, var9, true);
                        break;
                    }
                    int var13 = class480.field6935 + var12 - class261.field3727;
                    for (int var14 = class72.field1056; var14 < var11; var14++) {
                        class139.field1822[var12][var14] = false;
                        if (class52.field777[var12][var14]) {
                            int var15 = class120.field1556 + var14 - class72.field1056;
                            for (int var16 = var8; var16 >= 0; var16--) {
                                if (class358.field5312[var16][var13][var15] != null && class358.field5312[var16][var13][var15].field6773 == var8) {
                                    class139.field1822[var12][var14] = class358.field5312[var16][var13][var15].field6757;
                                    break;
                                }
                            }
                        }
                    }
                    var12++;
                }
            } else {
                class248.field3564.method148(class311.field4527[var8], 0, var8, var9, false);
            }
            class248.field3564.method156((byte) 97);
        }
        if (!class412.method2454(true)) {
            class412.method2454(false);
        }
    }

    @OriginalMember(owner = "client!jo", name = "<init>", descriptor = "(IIIIIIIIZB)V", line = 552)
    public class210(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8, byte arg9) {
        this.field2972 = (short) arg4;
        this.field2974 = arg9;
        this.field2970 = arg2;
        this.field2959 = arg1;
        this.field2956 = (byte) arg0;
        this.field2962 = (short) arg5;
        this.field2975 = (short) arg6;
        this.field2966 = arg3;
        this.field2957 = (short) arg7;
        this.field2967 = arg8;
    }

    @OriginalMember(owner = "client!jo", name = "h", descriptor = "(I)V", line = 570)
    public static void method1300(int arg0) {
        if (arg0 != 62) {
            method1300(-22);
        }
        field2960 = null;
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(BLjava/lang/String;)Ljava/lang/String;", line = 583)
    public static final String method1301(byte arg0, String arg1) {
        field2964++;
        int var2 = arg1.length();
        int var3 = 0;
        if (arg0 != -44) {
            return null;
        }
        for (int var4 = 0; var4 < var2; var4++) {
            char var8 = arg1.charAt(var4);
            if (var8 == '<' || var8 == '>') {
                var3 += 3;
            }
        }
        StringBuffer var5 = new StringBuffer(var2 + var3);
        for (int var6 = 0; var6 < var2; var6++) {
            char var7 = arg1.charAt(var6);
            if (var7 == '<') {
                var5.append("<lt>");
            } else if (var7 == '>') {
                var5.append("<gt>");
            } else {
                var5.append(var7);
            }
        }
        return var5.toString();
    }

    @OriginalMember(owner = "client!jo", name = "c", descriptor = "(B)I")
    public abstract int method724(byte arg0);
}
