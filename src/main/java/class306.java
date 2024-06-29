import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ha")
public class class306 extends class183 {

    @OriginalMember(owner = "client!ha", name = "X", descriptor = "I")
    private int field5174 = 0;

    @OriginalMember(owner = "client!ha", name = "ab", descriptor = "I")
    private int field5177 = 10;

    @OriginalMember(owner = "client!ha", name = "cb", descriptor = "I")
    private int field5179 = 2048;

    @OriginalMember(owner = "client!ha", name = "T", descriptor = "Ljf;")
    public static class229 field5170 = class212.method1457((byte) 78, ")3");

    @OriginalMember(owner = "client!ha", name = "W", descriptor = "Ljf;")
    public static class229 field5173 = class212.method1457((byte) 66, "http:)4)4");

    @OriginalMember(owner = "client!ha", name = "gb", descriptor = "Ljf;")
    public static class229 field5183 = class212.method1457((byte) 57, "Atteindre");

    @OriginalMember(owner = "client!ha", name = "V", descriptor = "Lni;")
    public static class24 field5172 = new class24(30);

    @OriginalMember(owner = "client!ha", name = "Y", descriptor = "I")
    public static int field5175;

    @OriginalMember(owner = "client!ha", name = "Z", descriptor = "I")
    public static int field5176;

    @OriginalMember(owner = "client!ha", name = "bb", descriptor = "I")
    public static int field5178;

    @OriginalMember(owner = "client!ha", name = "db", descriptor = "I")
    public static int field5180;

    @OriginalMember(owner = "client!ha", name = "eb", descriptor = "I")
    public static int field5181;

    @OriginalMember(owner = "client!ha", name = "fb", descriptor = "I")
    public static int field5182;

    @OriginalMember(owner = "client!ha", name = "ib", descriptor = "I")
    public static int field5185;

    @OriginalMember(owner = "client!ha", name = "hb", descriptor = "Lek;")
    public static class185 field5184;

    @OriginalMember(owner = "client!ha", name = "U", descriptor = "[I")
    private int[] field5171;

    @OriginalMember(owner = "client!ha", name = "jb", descriptor = "[I")
    private int[] field5186;

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "(II)[I", line = 16)
    public final int[] method10(int arg0, int arg1) {
        int[] var3 = this.field3161.method664(arg0, 0);
        if (this.field3161.field1736) {
            int var4 = class42.field746[arg0];
            if (this.field5174 == 0) {
                short var5 = 0;
                for (int var6 = 0; var6 < this.field5177; var6++) {
                    if (this.field5186[var6] <= var4 && var4 < this.field5186[var6 + 1]) {
                        if (this.field5171[var6] > var4) {
                            var5 = 4096;
                        }
                        break;
                    }
                }
                class36.method319(var3, 0, class22.field393, var5);
            } else {
                for (int var7 = 0; var7 < class22.field393; var7++) {
                    int var8 = 0;
                    int var9 = class97.field1737[var7];
                    short var10 = 0;
                    int var11 = this.field5174;
                    if (var11 == 1) {
                        var8 = var9;
                    } else if (var11 == 2) {
                        var8 = (var9 + var4 - 4096 >> 1) + 2048;
                    } else if (var11 == 3) {
                        var8 = (var9 - var4 >> 1) + 2048;
                    }
                    for (int var12 = 0; var12 < this.field5177; var12++) {
                        if (var8 >= this.field5186[var12] && var8 < this.field5186[var12 + 1]) {
                            if (var8 < this.field5171[var12]) {
                                var10 = 4096;
                            }
                            break;
                        }
                    }
                    var3[var7] = var10;
                }
            }
        }
        if (arg1 == -1) {
            field5178++;
            return var3;
        } else {
            return (int[]) null;
        }
    }

    @OriginalMember(owner = "client!ha", name = "d", descriptor = "(II)V", line = 127)
    public static final void method2087(int arg0, int arg1) {
        if (arg0 >= 124) {
            field5182++;
            class122 var2 = class323.method2175(5, arg1, -25873);
            var2.method865(-86);
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIII)V", line = 148)
    public static final void method2088(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field5181++;
        class122 var5 = class323.method2175(10, arg4, arg2 + 6544);
        var5.method862(arg2 ^ 0xFD3);
        var5.field2144 = arg3;
        if (arg2 != -32417) {
            method2090((byte) -59);
        }
        var5.field2143 = arg0;
        var5.field2154 = arg1;
    }

    @OriginalMember(owner = "client!ha", name = "<init>", descriptor = "()V", line = 169)
    public class306() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(III[[[BIBII)V", line = 172)
    public static final void method2089(int arg0, int arg1, int arg2, byte[][][] arg3, int arg4, byte arg5, int arg6, int arg7) {
        class31.field535++;
        class287.field4911 = 0;
        int var8 = arg6 - 16;
        int var9 = arg6 + 16;
        int var10 = arg7 - 16;
        int var11 = arg7 + 16;
        for (int var12 = class258.field4498; var12 < class45.field828; var12++) {
            class125[][] var13 = class312.field5246[var12];
            for (int var14 = class211.field3631; var14 < class167.field2867; var14++) {
                for (int var15 = class5.field49; var15 < class137.field2380; var15++) {
                    class125 var16 = var13[var14][var15];
                    if (var16 != null) {
                        if (class160.field2712[var14 + class281.field4799 - class325.field5481][var15 + class281.field4799 - class243.field4316] && (arg3 == null || var12 < arg4 || arg3[var12][var14][var15] != arg5)) {
                            var16.field2212 = true;
                            var16.field2199 = true;
                            if (var16.field2201 > 0) {
                                var16.field2197 = true;
                            } else {
                                var16.field2197 = false;
                            }
                            class287.field4911++;
                        } else {
                            var16.field2212 = false;
                            var16.field2199 = false;
                            var16.field2214 = 0;
                            if (var14 >= var8 && var14 <= var9 && var15 >= var10 && var15 <= var11) {
                                if (var16.field2198 != null) {
                                    class167 var17 = var16.field2198;
                                    var17.field2865.method199(0, var12, var17.field2857, var17.field2868, var17.field2870);
                                    if (var17.field2874 != null) {
                                        var17.field2874.method199(0, var12, var17.field2857, var17.field2868, var17.field2870);
                                    }
                                }
                                if (var16.field2192 != null) {
                                    class232 var18 = var16.field2192;
                                    var18.field4016.method199(var18.field4013, var12, var18.field4019, var18.field4036, var18.field4037);
                                    if (var18.field4028 != null) {
                                        var18.field4028.method199(var18.field4013, var12, var18.field4019, var18.field4036, var18.field4037);
                                    }
                                }
                                if (var16.field2190 != null) {
                                    class143 var19 = var16.field2190;
                                    var19.field2480.method199(0, var12, var19.field2477, var19.field2491, var19.field2495);
                                }
                                if (var16.field2204 != null) {
                                    for (int var20 = 0; var20 < var16.field2201; var20++) {
                                        class104 var21 = var16.field2204[var20];
                                        var21.field1806.method199(var21.field1798, var12, var21.field1795, var21.field1811, var21.field1793);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        boolean var22 = class242.field4270 == class132.field2328;
        if (class108.field1900) {
            GL var23 = class108.field1899;
            var23.glPushMatrix();
            var23.glTranslatef((float) (-arg0), (float) (-arg1), (float) (-arg2));
            if (var22) {
                class277.method1948();
                class257.method1832((byte) 49, 3, -1);
                class25.field460 = true;
                class154.method1036();
                class302.field5139 = -1;
                class48.field879 = -1;
                for (int var24 = 0; var24 < class3.field20[0].length; var24++) {
                    class37 var25 = class3.field20[0][var24];
                    float var26 = 251.5F - (var25.field694 ? 1.0F : 0.5F);
                    if (class302.field5139 != var25.field683) {
                        class302.field5139 = var25.field683;
                        class74.method538(-13487, var25.field683);
                        class276.method1938(class112.method790(-30));
                    }
                    var25.method327(class312.field5246, var26, false);
                }
                class154.method1034();
            } else {
                int var27 = class258.field4498;
                while (true) {
                    if (var27 >= class45.field828) {
                        class216.method1488(class325.field5481, class243.field4316, class312.field5246);
                        break;
                    }
                    for (int var28 = 0; var28 < class3.field20[var27].length; var28++) {
                        class37 var29 = class3.field20[var27][var28];
                        float var30 = 201.5F - (float) var27 * 50.0F - (var29.field694 ? 1.0F : 0.5F);
                        if (var29.field674 != -1 && class227.field3904.method1507(false, var29.field674) == 4 && class98.field1750) {
                            class74.method538(-13487, var29.field683);
                        }
                        var29.method327(class312.field5246, var30, false);
                    }
                    if (var27 == 0 && class243.field4293 > 0) {
                        class108.method756(101.5F);
                        class139.method980(class325.field5481, class243.field4316, class281.field4799, arg1, class160.field2712, class132.field2328[0]);
                    }
                    var27++;
                }
            }
            var23.glPopMatrix();
        }
        for (int var31 = class258.field4498; var31 < class45.field828; var31++) {
            class125[][] var32 = class312.field5246[var31];
            for (int var33 = -class281.field4799; var33 <= 0; var33++) {
                int var34 = class325.field5481 + var33;
                int var35 = class325.field5481 - var33;
                if (var34 >= class211.field3631 || var35 < class167.field2867) {
                    for (int var36 = -class281.field4799; var36 <= 0; var36++) {
                        int var37 = class243.field4316 + var36;
                        int var38 = class243.field4316 - var36;
                        if (var34 >= class211.field3631) {
                            if (var37 >= class5.field49) {
                                class125 var39 = var32[var34][var37];
                                if (var39 != null && var39.field2212) {
                                    class23.method218(var39, true);
                                }
                            }
                            if (var38 < class137.field2380) {
                                class125 var40 = var32[var34][var38];
                                if (var40 != null && var40.field2212) {
                                    class23.method218(var40, true);
                                }
                            }
                        }
                        if (var35 < class167.field2867) {
                            if (var37 >= class5.field49) {
                                class125 var41 = var32[var35][var37];
                                if (var41 != null && var41.field2212) {
                                    class23.method218(var41, true);
                                }
                            }
                            if (var38 < class137.field2380) {
                                class125 var42 = var32[var35][var38];
                                if (var42 != null && var42.field2212) {
                                    class23.method218(var42, true);
                                }
                            }
                        }
                        if (class287.field4911 == 0) {
                            if (!var22) {
                                class10.field115 = false;
                            }
                            return;
                        }
                    }
                }
            }
        }
        for (int var43 = class258.field4498; var43 < class45.field828; var43++) {
            class125[][] var44 = class312.field5246[var43];
            for (int var45 = -class281.field4799; var45 <= 0; var45++) {
                int var46 = class325.field5481 + var45;
                int var47 = class325.field5481 - var45;
                if (var46 >= class211.field3631 || var47 < class167.field2867) {
                    for (int var48 = -class281.field4799; var48 <= 0; var48++) {
                        int var49 = class243.field4316 + var48;
                        int var50 = class243.field4316 - var48;
                        if (var46 >= class211.field3631) {
                            if (var49 >= class5.field49) {
                                class125 var51 = var44[var46][var49];
                                if (var51 != null && var51.field2212) {
                                    class23.method218(var51, false);
                                }
                            }
                            if (var50 < class137.field2380) {
                                class125 var52 = var44[var46][var50];
                                if (var52 != null && var52.field2212) {
                                    class23.method218(var52, false);
                                }
                            }
                        }
                        if (var47 < class167.field2867) {
                            if (var49 >= class5.field49) {
                                class125 var53 = var44[var47][var49];
                                if (var53 != null && var53.field2212) {
                                    class23.method218(var53, false);
                                }
                            }
                            if (var50 < class137.field2380) {
                                class125 var54 = var44[var47][var50];
                                if (var54 != null && var54.field2212) {
                                    class23.method218(var54, false);
                                }
                            }
                        }
                        if (class287.field4911 == 0) {
                            if (!var22) {
                                class10.field115 = false;
                            }
                            return;
                        }
                    }
                }
            }
        }
        class10.field115 = false;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(ILkh;I)V", line = 554)
    public final void method14(int arg0, class14 arg1, int arg2) {
        if (arg2 == 0) {
            this.field5177 = arg1.method93(false);
        } else if (arg2 == 1) {
            this.field5179 = arg1.method116(-1);
        } else if (arg2 == 2) {
            this.field5174 = arg1.method93(false);
        }
        if (arg0 >= -43) {
            field5172 = (class24) null;
        }
        field5175++;
    }

    @OriginalMember(owner = "client!ha", name = "e", descriptor = "(B)V", line = 592)
    public static final void method2090(byte arg0) {
        class208.method1443((byte) 23, false);
        class214.field3686 = 0;
        boolean var1 = true;
        for (int var2 = 0; var2 < class117.field2089.length; var2++) {
            if (class220.field3749[var2] != -1 && class117.field2089[var2] == null) {
                class117.field2089[var2] = class20.field332.method1275(0, class220.field3749[var2], -5211);
                if (class117.field2089[var2] == null) {
                    class214.field3686++;
                    var1 = false;
                }
            }
            if (class175.field3053[var2] != -1 && class270.field4638[var2] == null) {
                class270.field4638[var2] = class20.field332.method1262(class175.field3053[var2], class321.field5435[var2], 0, 1);
                if (class270.field4638[var2] == null) {
                    var1 = false;
                    class214.field3686++;
                }
            }
            if (class108.field1900) {
                if (class282.field4841[var2] != -1 && class328.field5535[var2] == null) {
                    class328.field5535[var2] = class20.field332.method1275(0, class282.field4841[var2], arg0 - 5092);
                    if (class328.field5535[var2] == null) {
                        class214.field3686++;
                        var1 = false;
                    }
                }
                if (class270.field4631[var2] != -1 && class203.field3553[var2] == null) {
                    class203.field3553[var2] = class20.field332.method1275(0, class270.field4631[var2], -5211);
                    if (class203.field3553[var2] == null) {
                        class214.field3686++;
                        var1 = false;
                    }
                }
            }
            if (class267.field4583 != null && class89.field1627[var2] == null && class267.field4583[var2] != -1) {
                class89.field1627[var2] = class20.field332.method1262(class267.field4583[var2], class321.field5435[var2], 0, 1);
                if (class89.field1627[var2] == null) {
                    var1 = false;
                    class214.field3686++;
                }
            }
        }
        field5185++;
        if (class60.field1039 == null) {
            if (class123.field2172 == null || !class143.field2490.method1266(class142.method989(new class229[] { class123.field2172.field2723, class20.field340 }, -82), 256)) {
                class60.field1039 = new class330(0);
            } else if (class143.field2490.method1279(class142.method989(new class229[] { class123.field2172.field2723, class20.field340 }, -83), 106)) {
                class60.field1039 = class260.method1854((byte) -31, class142.method989(new class229[] { class123.field2172.field2723, class20.field340 }, -65), class143.field2490);
            } else {
                var1 = false;
                class214.field3686++;
            }
        }
        if (!var1) {
            class221.field3781 = 1;
            return;
        }
        class151.field2613 = 0;
        boolean var3 = true;
        for (int var4 = 0; var4 < class117.field2089.length; var4++) {
            byte[] var5 = class270.field4638[var4];
            if (var5 != null) {
                int var6 = (class29.field511[var4] & 0xFF) * 64 - class213.field3649;
                int var7 = (class29.field511[var4] >> 8) * 64 - class258.field4503;
                if (class68.field1301) {
                    var7 = 10;
                    var6 = 10;
                }
                var3 &= class269.method1897(var7, var6, var5, false);
            }
            if (class108.field1900) {
                byte[] var8 = class203.field3553[var4];
                if (var8 != null) {
                    int var9 = (class29.field511[var4] >> 8) * 64 - class258.field4503;
                    int var10 = (class29.field511[var4] & 0xFF) * 64 - class213.field3649;
                    if (class68.field1301) {
                        var9 = 10;
                        var10 = 10;
                    }
                    var3 &= class269.method1897(var9, var10, var8, false);
                }
            }
        }
        if (!var3) {
            class221.field3781 = 2;
            return;
        }
        if (class221.field3781 != 0) {
            class18.method178(true, (byte) -4, class142.method989(new class229[] { class47.field856, class89.field1630 }, arg0 ^ 0x12));
        }
        class18.method179((byte) 101);
        class254.method1808(1);
        boolean var11 = false;
        if (class108.field1900 && class98.field1750) {
            for (int var12 = 0; var12 < class117.field2089.length; var12++) {
                if (class203.field3553[var12] != null || class328.field5535[var12] != null) {
                    var11 = true;
                    break;
                }
            }
        }
        class106.method707(4, 104, 104, class108.field1900 ? 28 : 25, var11);
        for (int var13 = 0; var13 < 4; var13++) {
            class80.field1460[var13].method1767((byte) -113);
        }
        for (int var14 = 0; var14 < 4; var14++) {
            for (int var15 = 0; var15 < 104; var15++) {
                for (int var16 = 0; var16 < 104; var16++) {
                    class142.field2464[var14][var15][var16] = 0;
                }
            }
        }
        class254.method1806((byte) -35, false);
        if (class108.field1900) {
            class139.field2433.method1791();
            for (int var17 = 0; var17 < 13; var17++) {
                for (int var18 = 0; var18 < 13; var18++) {
                    class139.field2431[var17][var18].field2854 = true;
                }
            }
        }
        if (class108.field1900) {
            class216.method1495();
        }
        if (class108.field1900) {
            class318.method2146(true);
        }
        if (arg0 != -119) {
            method2092(-80);
        }
        class18.method179((byte) 101);
        System.gc();
        class208.method1443((byte) 23, true);
        class104.method698(false, 116);
        if (!class68.field1301) {
            class16.method165(false, -365448216);
            class208.method1443((byte) 23, true);
            if (class108.field1900) {
                int var19 = class301.field5124.field2018[0] >> 3;
                int var20 = class301.field5124.field2017[0] >> 3;
                class82.method584(arg0 ^ 0xFFFFFF8B, var20, var19);
            }
            class110.method782(false, 255);
            if (class89.field1627 != null) {
                class295.method2043((byte) -37);
            }
        }
        if (class68.field1301) {
            class66.method490(false, (byte) -11);
            class208.method1443((byte) 23, true);
            if (class108.field1900) {
                int var21 = class301.field5124.field2018[0] >> 3;
                int var22 = class301.field5124.field2017[0] >> 3;
                class82.method584(2, var22, var21);
            }
            class172.method1172(false, 48);
        }
        class254.method1808(arg0 ^ 0xFFFFFF88);
        class208.method1443((byte) 23, true);
        class226.method1567(class80.field1460, false, 90);
        if (class108.field1900) {
            class216.method1491();
        }
        class208.method1443((byte) 23, true);
        int var23 = class287.field4915;
        if (class16.field254 < var23) {
            var23 = class16.field254;
        }
        if ((class16.field254 - 1) > var23) {
            int var24 = class16.field254 - 1;
        }
        if (class110.method781((byte) 127)) {
            class22.method213(0);
        } else {
            class22.method213(class287.field4915);
        }
        class161.method1087(80);
        if (class108.field1900 && var11) {
            class293.method2034(true);
            class104.method698(true, 119);
            if (!class68.field1301) {
                class16.method165(true, -365448216);
                class208.method1443((byte) 23, true);
                class110.method782(true, 255);
            }
            if (class68.field1301) {
                class66.method490(true, (byte) -11);
                class208.method1443((byte) 23, true);
                class172.method1172(true, 89);
            }
            class254.method1808(1);
            class208.method1443((byte) 23, true);
            class226.method1567(class80.field1460, true, 68);
            class208.method1443((byte) 23, true);
            class161.method1087(arg0 + 161);
            class293.method2034(false);
        }
        if (class108.field1900) {
            for (int var25 = 0; var25 < 13; var25++) {
                for (int var26 = 0; var26 < 13; var26++) {
                    class139.field2431[var25][var26].method1135(class132.field2328[0], var25 * 8, var26 * 8);
                }
            }
        }
        for (int var27 = 0; var27 < 104; var27++) {
            for (int var28 = 0; var28 < 104; var28++) {
                class234.method1672((byte) 36, var27, var28);
            }
        }
        class122.method867(arg0 + 1223);
        class18.method179((byte) 101);
        class96.method661(-30334);
        class254.method1808(1);
        if (class112.field2031 != null && class160.field2720 != null && class325.field5482 == 25) {
            class91.field1658++;
            class84.field1608.method1397(45, 0);
            class84.field1608.method100(1057001181, 65280);
        }
        if (!class68.field1301) {
            int var29 = (class184.field3188 - 6) / 8;
            int var30 = (class70.field1339 - 6) / 8;
            int var31 = (class184.field3188 + 6) / 8;
            int var32 = (class70.field1339 + 6) / 8;
            for (int var33 = var29 - 1; var33 <= var31 + 1; var33++) {
                for (int var34 = var30 - 1; var34 <= (var32 + 1); var34++) {
                    if (var33 < var29 || var31 < var33 || var34 < var30 || var34 > var32) {
                        class20.field332.method1288(class142.method989(new class229[] { class95.field1693, class84.method607(arg0 ^ 0xFFFFFFF1, var33), class313.field5319, class84.method607(91, var34) }, -49), 0);
                        class20.field332.method1288(class142.method989(new class229[] { class270.field4643, class84.method607(arg0 ^ 0x34, var33), class313.field5319, class84.method607(-67, var34) }, -123), 0);
                    }
                }
            }
        }
        if (class325.field5482 == 28) {
            class186.method1295(10, (byte) 84);
        } else {
            class186.method1295(30, (byte) 84);
            if (class160.field2720 != null) {
                class84.field1608.method1397(8, arg0 ^ 0xFFFFFF89);
            }
        }
        class117.method836((byte) -91);
        class18.method179((byte) 101);
        class38.method334(0);
    }

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "(I)V", line = 1105)
    public final void method25(int arg0) {
        this.method2091(false);
        if (arg0 != -8) {
            this.field5177 = 41;
        }
        field5180++;
    }

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "(Z)V", line = 1125)
    private final void method2091(boolean arg0) {
        field5176++;
        int var2 = 0;
        this.field5186 = new int[this.field5177 + 1];
        this.field5171 = new int[this.field5177 + 1];
        int var3 = 4096 / this.field5177;
        int var4 = this.field5179 * var3 >> 12;
        for (int var5 = 0; var5 < this.field5177; var5++) {
            this.field5186[var5] = var2;
            this.field5171[var5] = var2 + var4;
            var2 += var3;
        }
        if (arg0) {
            this.field5174 = 70;
        }
        this.field5186[this.field5177] = 4096;
        this.field5171[this.field5177] = this.field5171[0] + 4096;
    }

    @OriginalMember(owner = "client!ha", name = "e", descriptor = "(I)V", line = 1155)
    public static void method2092(int arg0) {
        field5170 = null;
        if (arg0 != 6) {
            field5170 = (class229) null;
        }
        field5173 = null;
        field5172 = null;
        field5184 = null;
        field5183 = null;
    }
}
