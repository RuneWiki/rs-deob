import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mn")
public class class197 extends class285 {

    @OriginalMember(owner = "client!mn", name = "Y", descriptor = "[I")
    public static int[] field3215 = new int[100];

    @OriginalMember(owner = "client!mn", name = "R", descriptor = "F")
    public static float field3208;

    @OriginalMember(owner = "client!mn", name = "O", descriptor = "I")
    public static int field3205;

    @OriginalMember(owner = "client!mn", name = "P", descriptor = "I")
    public static int field3206;

    @OriginalMember(owner = "client!mn", name = "Q", descriptor = "I")
    public static int field3207;

    @OriginalMember(owner = "client!mn", name = "S", descriptor = "I")
    public static int field3209;

    @OriginalMember(owner = "client!mn", name = "T", descriptor = "I")
    public static int field3210;

    @OriginalMember(owner = "client!mn", name = "U", descriptor = "I")
    public static int field3211;

    @OriginalMember(owner = "client!mn", name = "V", descriptor = "I")
    public static int field3212;

    @OriginalMember(owner = "client!mn", name = "W", descriptor = "I")
    public static int field3213;

    @OriginalMember(owner = "client!mn", name = "X", descriptor = "I")
    public static int field3214;

    @OriginalMember(owner = "client!mn", name = "Z", descriptor = "I")
    public static int field3216;

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(Ljj;IILjh;)V", line = 7)
    public static final void method1445(class44 arg0, int arg1, int arg2, class124 arg3) {
        field3212++;
        class152 var4 = new class152();
        var4.field2341 = arg0.method286((byte) -123);
        var4.field2351 = arg0.method238((byte) 82);
        var4.field2343 = new class161[var4.field2341];
        var4.field2342 = new class161[var4.field2341];
        var4.field2346 = new byte[var4.field2341][][];
        var4.field2345 = new int[var4.field2341];
        var4.field2347 = new int[var4.field2341];
        var4.field2354 = new int[var4.field2341];
        for (int var5 = arg2; var5 < var4.field2341; var5++) {
            try {
                int var6 = arg0.method286((byte) -116);
                if (var6 == 0 || var6 == 1 || var6 == 2) {
                    int var17 = 0;
                    String var18 = arg0.method265(0);
                    String var19 = arg0.method265(arg2);
                    if (var6 == 1) {
                        var17 = arg0.method238((byte) 82);
                    }
                    var4.field2354[var5] = var6;
                    var4.field2347[var5] = var17;
                    var4.field2342[var5] = arg3.method892(class27.method159(3, var18), 0, var19);
                } else if (var6 == 3 || var6 == 4) {
                    String var7 = arg0.method265(arg2 ^ 0x0);
                    String var8 = arg0.method265(0);
                    int var9 = arg0.method286((byte) -65);
                    String[] var10 = new String[var9];
                    for (int var11 = 0; var11 < var9; var11++) {
                        var10[var11] = arg0.method265(0);
                    }
                    byte[][] var12 = new byte[var9][];
                    if (var6 == 3) {
                        for (int var13 = 0; var13 < var9; var13++) {
                            int var14 = arg0.method238((byte) 82);
                            var12[var13] = new byte[var14];
                            arg0.method259(arg2 ^ 0x15236CA8, var12[var13], 0, var14);
                        }
                    }
                    Class[] var15 = new Class[var9];
                    var4.field2354[var5] = var6;
                    for (int var16 = 0; var16 < var9; var16++) {
                        var15[var16] = class27.method159(arg2 + 3, var10[var16]);
                    }
                    var4.field2343[var5] = arg3.method902(var15, class27.method159(3, var7), 0, var8);
                    var4.field2346[var5] = var12;
                }
            } catch (ClassNotFoundException var25) {
                var4.field2345[var5] = -1;
            } catch (SecurityException var26) {
                var4.field2345[var5] = -2;
            } catch (NullPointerException var27) {
                var4.field2345[var5] = -3;
            } catch (Exception var28) {
                var4.field2345[var5] = -4;
            } catch (Throwable var29) {
                var4.field2345[var5] = -5;
            }
        }
        class184.field3042.method1232(121, var4);
    }

    @OriginalMember(owner = "client!mn", name = "b", descriptor = "(Z)V", line = 112)
    public static void method1446(boolean arg0) {
        field3215 = null;
        if (!arg0) {
            field3208 = 0.43851566F;
        }
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(ZI)[I", line = 122)
    public final int[] method60(boolean arg0, int arg1) {
        field3211++;
        int[] var3 = this.field4573.method1116(113, arg1);
        if (arg0) {
            if (this.field4573.field2420) {
                class9.method49(var3, 0, class287.field4599, class27.field382[arg1]);
            }
            return var3;
        } else {
            return (int[]) null;
        }
    }

    @OriginalMember(owner = "client!mn", name = "j", descriptor = "(I)V", line = 151)
    public static final void method1447(int arg0) {
        field3213++;
        class256.field4110 = 0;
        class65.field937 = -1;
        class196.field3204 = false;
        class194.field3175.field586 = 0;
        class321.field4975 = 0;
        class343.field5331 = -1;
        class268.field4325 = -1;
        class247.field3898.field586 = 0;
        class44.field585 = 0;
        class101.field1470 = -1;
        client.field1658 = 0;
        class219.field3540 = arg0;
        class185.field3070 = 0;
        for (int var1 = 0; var1 < class74.field1049.length; var1++) {
            if (class74.field1049[var1] != null) {
                class74.field1049[var1].field4198 = -1;
            }
        }
        for (int var2 = 0; var2 < class99.field1445.length; var2++) {
            if (class99.field1445[var2] != null) {
                class99.field1445[var2].field4198 = -1;
            }
        }
        class52.method338(-115);
        class31.field423 = 1;
        class278.method2012(30, -53);
        for (int var3 = 0; var3 < 100; var3++) {
            class174.field2884[var3] = true;
        }
        class85.method577(-55);
    }

    @OriginalMember(owner = "client!mn", name = "b", descriptor = "(II)I", line = 206)
    public static final int method1448(int arg0, int arg1) {
        field3214++;
        if (arg1 != -606) {
            field3208 = 1.7367564F;
        }
        int var2 = 0;
        if (arg0 < 0 || arg0 >= 65536) {
            var2 += 16;
            arg0 >>>= 0x10;
        }
        if (arg0 >= 256) {
            arg0 >>>= 0x8;
            var2 += 8;
        }
        if (arg0 >= 16) {
            var2 += 4;
            arg0 >>>= 0x4;
        }
        if (arg0 >= 4) {
            arg0 >>>= 0x2;
            var2 += 2;
        }
        if (arg0 >= 1) {
            var2++;
            arg0 >>>= 0x1;
        }
        return arg0 + var2;
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(CI)C", line = 253)
    public static final char method1449(char arg0, int arg1) {
        field3210++;
        if (arg0 == 'µ' || arg0 == 'ƒ') {
            return arg0;
        } else {
            int var2 = -32 % ((arg1 + 49) / 37);
            return Character.toTitleCase(arg0);
        }
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(Ljava/lang/String;Z)Ljava/lang/String;", line = 270)
    public static final String method1450(String arg0, boolean arg1) {
        field3206++;
        if (arg1) {
            method1450((String) null, true);
        }
        int var2 = class172.method1274(-1, arg0);
        return var2 == -1 ? "" : class115.method791(-14, " ", "<br>", class20.field289.field3262[var2]);
    }

    @OriginalMember(owner = "client!mn", name = "<init>", descriptor = "()V", line = 287)
    public class197() {
        super(0, true);
    }

    @OriginalMember(owner = "client!mn", name = "d", descriptor = "(B)V", line = 291)
    public static final void method1451(byte arg0) {
        class263.field4182 = null;
        class100.field1463 = null;
        class320.field4970 = null;
        class146.field2271 = null;
        class147.field2288 = null;
        class121.field1846 = null;
        if (arg0 < 49) {
            field3208 = 1.7608668F;
        }
        class234.field3760 = null;
        class133.field2093 = null;
        class2.field30 = null;
        class296.field4688 = null;
        field3209++;
        class49.field688 = null;
        class282.field4538 = null;
        class99.field1416 = null;
        class279.field4499 = null;
        class42.field536 = null;
        class150.field2319 = null;
        class48.field675 = null;
        class204.field3358 = null;
        class60.field837 = null;
    }

    @OriginalMember(owner = "client!mn", name = "k", descriptor = "(I)V", line = 320)
    public static final void method1452(int arg0) {
        field3205++;
        class223.field3561.method702((byte) 121);
        class50.field705.method702((byte) 123);
        if (arg0 != 19050) {
            method1447(37);
        }
    }

    @OriginalMember(owner = "client!mn", name = "c", descriptor = "(Z)V", line = 338)
    public static final void method1453(boolean arg0) {
        field3216++;
        if (!arg0) {
            method1447(-87);
        }
        int var1 = class121.field1831;
        int var2 = class227.field3617;
        int var3 = class315.field4877;
        int var4 = class295.field4671;
        int var5 = 6116423;
        if (class232.field3690) {
            class75.method505(var1, var3, var2, var4, var5);
            class75.method505(var1 + 1, var3 + 1, var2 - 2, 16, 0);
            class75.method507(var1 + 1, var3 + 18, var2 - 2, var4 + -19, 0);
        } else {
            class59.method382(var1, var3, var2, var4, var5);
            class59.method382(var1 + 1, var3 + 1, var2 - 2, 16, 0);
            class59.method390(var1 + 1, var3 + 18, var2 - 2, var4 + -19, 0);
        }
        class282.field4538.method1808(class116.field1762, var1 + 3, var3 - -14, var5, -1);
        int var6 = class70.field995;
        int var7 = class233.field3738;
        for (int var8 = 0; var8 < class185.field3070; var8++) {
            int var9 = (class185.field3070 - var8 - 1) * 15 + var3 + 31;
            int var10 = 16777215;
            if (var1 < var6 && var6 < var1 + var2 && var9 - 13 < var7 && var7 < (var9 + 3)) {
                var10 = 16776960;
            }
            class282.field4538.method1808(class129.method935(var8, 2017), var1 + 3, var9, var10, 0);
        }
        class234.method1693(class121.field1831, class295.field4671, class315.field4877, class227.field3617, (byte) -14);
    }
}
