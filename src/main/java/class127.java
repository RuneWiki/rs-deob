import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!c")
public class class127 extends class197 {

    @OriginalMember(owner = "client!c", name = "W", descriptor = "I")
    private int field2256 = 8192;

    @OriginalMember(owner = "client!c", name = "cb", descriptor = "I")
    private int field2262 = 2048;

    @OriginalMember(owner = "client!c", name = "db", descriptor = "I")
    private int field2263 = 12288;

    @OriginalMember(owner = "client!c", name = "eb", descriptor = "I")
    private int field2264 = 4096;

    @OriginalMember(owner = "client!c", name = "bb", descriptor = "I")
    private int field2261 = 0;

    @OriginalMember(owner = "client!c", name = "Z", descriptor = "I")
    private int field2259 = 2048;

    @OriginalMember(owner = "client!c", name = "gb", descriptor = "I")
    private int field2266 = 0;

    @OriginalMember(owner = "client!c", name = "S", descriptor = "Loh;")
    public static class258 field2252 = class153.method1046("Bitte entfernen Sie ", 96);

    @OriginalMember(owner = "client!c", name = "Y", descriptor = "[I")
    public static int[] field2258 = new int[128];

    @OriginalMember(owner = "client!c", name = "fb", descriptor = "Loh;")
    public static class258 field2265 = class153.method1046("Bitte warten Sie)3)3)3", 121);

    @OriginalMember(owner = "client!c", name = "X", descriptor = "I")
    public static int field2257 = 0;

    @OriginalMember(owner = "client!c", name = "R", descriptor = "B")
    public static byte field2251;

    @OriginalMember(owner = "client!c", name = "M", descriptor = "I")
    public static int field2246;

    @OriginalMember(owner = "client!c", name = "N", descriptor = "I")
    public static int field2247;

    @OriginalMember(owner = "client!c", name = "O", descriptor = "I")
    public static int field2248;

    @OriginalMember(owner = "client!c", name = "P", descriptor = "I")
    public static int field2249;

    @OriginalMember(owner = "client!c", name = "Q", descriptor = "I")
    public static int field2250;

    @OriginalMember(owner = "client!c", name = "T", descriptor = "I")
    public static int field2253;

    @OriginalMember(owner = "client!c", name = "U", descriptor = "I")
    public static int field2254;

    @OriginalMember(owner = "client!c", name = "V", descriptor = "I")
    public static int field2255;

    @OriginalMember(owner = "client!c", name = "ab", descriptor = "Lgb;")
    public static class213 field2260;

    @OriginalMember(owner = "client!c", name = "b", descriptor = "(I)V", line = 12)
    public static void method917(int arg0) {
        field2265 = null;
        field2260 = null;
        field2252 = null;
        field2258 = null;
        if (arg0 > -44) {
            field2258 = (int[]) null;
        }
    }

    @OriginalMember(owner = "client!c", name = "d", descriptor = "(III)Z", line = 26)
    private final boolean method918(int arg0, int arg1, int arg2) {
        field2254++;
        int var4 = (arg2 - arg1) * this.field2263 >> 12;
        int var5 = class193.field3405[(var4 * 255 & 0xFF28F) >> 12];
        int var6 = (var5 << 12) / this.field2263;
        int var7 = (var6 << 12) / this.field2256;
        if (arg0 != 282485612) {
            method917(13);
        }
        int var8 = this.field2264 * var7 >> 12;
        return (arg1 + arg2) < var8 && -var8 < arg1 + arg2;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(ILva;I)V", line = 44)
    public final void method98(int arg0, class235 arg1, int arg2) {
        field2247++;
        if (arg2 == 0) {
            this.field2262 = arg1.method1615(-118);
        } else if (arg2 == 1) {
            this.field2266 = arg1.method1615(11);
        } else if (arg2 == 2) {
            this.field2261 = arg1.method1615(arg0 ^ 0xFFFFE095);
        } else if (arg2 == 3) {
            this.field2259 = arg1.method1615(-120);
        } else if (arg2 == 4) {
            this.field2263 = arg1.method1615(-24);
        } else if (arg2 == 5) {
            this.field2264 = arg1.method1615(122);
        } else if (arg2 == 6) {
            this.field2256 = arg1.method1615(-125);
        }
        if (arg0 != 7955) {
            this.method920(55, -6, (byte) 2);
        }
    }

    @OriginalMember(owner = "client!c", name = "<init>", descriptor = "()V", line = 202)
    public class127() {
        super(0, true);
    }

    @OriginalMember(owner = "client!c", name = "c", descriptor = "(I)Z", line = 150)
    public static final boolean method919(int arg0) {
        field2248++;
        try {
            if (class292.field5027 == 2) {
                if (class119.field2108 == null) {
                    class119.field2108 = class163.method1093(class272.field4706, class93.field1644, class70.field1208);
                    if (class119.field2108 == null) {
                        return false;
                    }
                }
                if (class236.field4127 == null) {
                    class236.field4127 = new class281(class99.field1762, class259.field4515);
                }
                if (class224.field3844.method844(class119.field2108, class56.field882, class236.field4127, 0, 22050)) {
                    class224.field3844.method848((byte) -102);
                    class224.field3844.method858((byte) -98, class284.field4895);
                    class224.field3844.method860(class119.field2108, 3727, class169.field2886);
                    class292.field5027 = 0;
                    class272.field4706 = null;
                    class119.field2108 = null;
                    class236.field4127 = null;
                    return true;
                }
            }
            int var1 = -86 % ((-arg0 - 50) / 53);
        } catch (Exception var3) {
            var3.printStackTrace();
            class224.field3844.method822((byte) -93);
            class236.field4127 = null;
            class292.field5027 = 0;
            class119.field2108 = null;
            class272.field4706 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(IIB)Z", line = 206)
    private final boolean method920(int arg0, int arg1, byte arg2) {
        field2249++;
        int var4 = (arg0 + arg1) * this.field2263 >> 12;
        int var5 = class193.field3405[(var4 * 255 & 0xFFD30) >> 12];
        int var6 = (var5 << 12) / this.field2263;
        int var7 = (var6 << 12) / this.field2256;
        if (arg2 == -94) {
            int var8 = this.field2264 * var7 >> 12;
            return var8 > (arg0 - arg1) && arg0 - arg1 > -var8;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(II)[I", line = 226)
    public final int[] method96(int arg0, int arg1) {
        int[] var3 = this.field3456.method2104(arg1, 0);
        if (this.field3456.field5115) {
            int var4 = class268.field4670[arg1] - 2048;
            for (int var5 = 0; var5 < class190.field3362; var5++) {
                int var6 = class166.field2822[var5] - 2048;
                int var7 = this.field2261 + var6;
                int var8 = var4 + this.field2266;
                int var9 = this.field2262 + var6;
                int var10 = this.field2259 + var4;
                int var11 = var9 < -2048 ? var9 + 4096 : var9;
                int var12 = var11 > 2048 ? var11 - 4096 : var11;
                int var13 = var8 < -2048 ? var8 + 4096 : var8;
                int var14 = var10 < -2048 ? var10 + 4096 : var10;
                int var15 = var7 >= -2048 ? var7 : var7 + 4096;
                int var16 = var15 > 2048 ? var15 - 4096 : var15;
                int var17 = var13 > 2048 ? var13 - 4096 : var13;
                int var18 = var14 > 2048 ? var14 - 4096 : var14;
                var3[var5] = this.method918(282485612, var12, var17) || this.method920(var18, var16, (byte) -94) ? 4096 : 0;
            }
        }
        field2250++;
        return arg0 == -16221 ? var3 : (int[]) null;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(I)V", line = 282)
    public final void method223(int arg0) {
        field2253++;
        class72.method540((byte) -125);
        if (arg0 != 11135) {
            this.method920(44, -49, (byte) -113);
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(IIIZII)V", line = 308)
    public static final void method921(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
        field2246++;
        class61.field1035++;
        if (!arg3) {
            class252.method1707(true, true);
            class149.method1024(true, 111);
            class252.method1707(true, false);
        }
        class149.method1024(false, arg2 ^ 0x6A);
        if (!arg3) {
            class4.method27((byte) 122);
        }
        class281.method1973(60);
        if (class257.field4390) {
            class72.method541(arg1, arg4, arg0, (byte) -121, arg5, true);
            arg4 = class113.field1954;
            arg5 = class261.field4540;
            arg0 = class86.field1468;
            arg1 = field2257;
        }
        if (class109.field1926 == 1) {
            int var6 = class101.field1815;
            if (class42.field582 / 256 > var6) {
                var6 = class42.field582 / 256;
            }
            if (class208.field3577[4] && (class145.field2454[4] + 128) > var6) {
                var6 = class145.field2454[4] + 128;
            }
            int var7 = class68.field1177 + class122.field2154 & 0x7FF;
            class96.method705(var7, class228.method1525(true, class272.field4704, class152.field2606.field934, class152.field2606.field912) - 50, arg5, class71.field1240, var6, (byte) -105, var6 * 3 + 600, class147.field2500);
        }
        if (arg2 != 4) {
            method917(119);
        }
        int var8 = class285.field4906;
        int var9 = class245.field4258;
        int var10 = class61.field1086;
        int var11 = class106.field1894;
        int var12 = class90.field1576;
        for (int var13 = 0; var13 < 5; var13++) {
            if (class208.field3577[var13]) {
                int var14 = (int) ((double) (-class83.field1400[var13]) + Math.random() * (double) (class83.field1400[var13] * 2 + 1) + Math.sin((double) class11.field133[var13] / 100.0D * (double) class280.field4813[var13]) * (double) class145.field2454[var13]);
                if (var13 == 3) {
                    class90.field1576 = class90.field1576 + var14 & 0x7FF;
                }
                if (var13 == 4) {
                    class106.field1894 += var14;
                    if (class106.field1894 < 128) {
                        class106.field1894 = 128;
                    }
                    if (class106.field1894 > 383) {
                        class106.field1894 = 383;
                    }
                }
                if (var13 == 1) {
                    class245.field4258 += var14;
                }
                if (var13 == 2) {
                    class61.field1086 += var14;
                }
                if (var13 == 0) {
                    class285.field4906 += var14;
                }
            }
        }
        class246.method1684((byte) 107);
        if (class257.field4390) {
            class296.method2085(arg0, arg1, arg0 + arg4, arg1 + arg5);
            float var15 = (float) class90.field1576 * 0.17578125F;
            float var16 = (float) class106.field1894 * 0.17578125F;
            if (class109.field1926 == 3) {
                var15 = class258.field4457 * 360.0F / 6.2831855F;
                var16 = class5.field74 * 360.0F / 6.2831855F;
            }
            class257.method1760(arg0, arg1, arg4, arg5, arg0 + (arg4 / 2), arg5 / 2 + arg1, var16, var15, class272.field4713, class272.field4713);
        } else {
            class211.method1414(arg0, arg1, arg0 + arg4, arg1 + arg5);
            class266.method1872();
        }
        if (class252.field4342 || arg0 > class84.field1415 || arg0 + arg4 <= class84.field1415 || class113.field1947 < arg1 || arg1 + arg5 <= class113.field1947) {
            class75.field1308 = false;
            class122.field2171 = 0;
        } else {
            class122.field2171 = 0;
            int var17 = class313.field5321;
            class75.field1308 = true;
            int var18 = class193.field3411;
            int var19 = class301.field5153;
            class164.field2774 = (var17 - var18) * (class84.field1415 - arg0) / arg4 + var18;
            int var20 = class280.field4815;
            class59.field988 = (var20 - var19) * (class113.field1947 - arg1) / arg5 + var19;
        }
        class172.method1164(97);
        byte var21 = class31.method229((byte) 0) == 2 ? (byte) class61.field1035 : 1;
        if (class257.field4390) {
            class257.method1734();
            class257.method1730(true);
            boolean var22 = false;
            class257.method1745(true);
            int var23;
            if (class280.field4818 == 10) {
                var23 = class23.method183(class285.field4906 >> 10, -99, class251.field4329, class151.field2557, class61.field1086 >> 10);
            } else {
                var23 = class23.method183(class152.field2606.field975[0] >> 3, arg2 ^ 0xFFFFFF9F, class251.field4329, class151.field2557, class152.field2606.field959[0] >> 3);
            }
            class267.method1883(class202.field3498, !class271.field4697);
            class257.method1765(var23);
            class145.method1003(class245.field4258, class61.field1086, -20587, class285.field4906, class106.field1894, class90.field1576);
            class257.field4407 = class202.field3498;
            class201.method1331(class285.field4906, class245.field4258, class61.field1086, class106.field1894, class90.field1576, class8.field101, class70.field1224, class227.field3904, class16.field210, class188.field3338, class176.field3162, class272.field4704 + 1, var21, class152.field2606.field912 >> 7, class152.field2606.field934 >> 7);
            class217.field3746 = true;
            class267.method1893();
            class145.method1003(0, 0, arg2 - 20591, 0, 0, 0);
            class172.method1164(32);
            class209.method1375();
            class271.method1914(arg4, arg0, class272.field4713, class272.field4713, arg5, false, arg1);
            class197.method1323((byte) 118, arg0, arg1, arg5, class272.field4713, class272.field4713, arg4);
        } else {
            class211.method1398(arg0, arg1, arg4, arg5, 0);
            class201.method1331(class285.field4906, class245.field4258, class61.field1086, class106.field1894, class90.field1576, class8.field101, class70.field1224, class227.field3904, class16.field210, class188.field3338, class176.field3162, class272.field4704 + 1, var21, class152.field2606.field912 >> 7, class152.field2606.field934 >> 7);
            class172.method1164(91);
            class209.method1375();
            class271.method1914(arg4, arg0, 256, 256, arg5, false, arg1);
            class197.method1323((byte) 77, arg0, arg1, arg5, 256, 256, arg4);
        }
        ((class272) class266.field4643).method1926(class251.field4329, false);
        class271.method1911(arg4, arg1, arg5, arg0, (byte) -56);
        class106.field1894 = var11;
        class90.field1576 = var12;
        class245.field4258 = var9;
        class285.field4906 = var8;
        class61.field1086 = var10;
        if (class50.field777 && class287.field4944.method1952((byte) -128) == 0) {
            class50.field777 = false;
        }
        if (class50.field777) {
            if (class257.field4390) {
                class296.method2096(arg0, arg1, arg4, arg5, 0);
            } else {
                class211.method1398(arg0, arg1, arg4, arg5, 0);
            }
            class251.method1704(class282.field4853, false, false);
        }
        if (!arg3 && !class50.field777 && !class252.field4342 && class84.field1415 >= arg0 && (arg0 + arg4) > class84.field1415 && class113.field1947 >= arg1 && arg1 + arg5 > class113.field1947) {
            class124.method904(1, arg4, arg5, arg0, class113.field1947, class84.field1415, arg1);
        }
    }
}
