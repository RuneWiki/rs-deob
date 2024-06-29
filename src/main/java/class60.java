import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pm")
public class class60 extends class154 {

    @OriginalMember(owner = "client!pm", name = "p", descriptor = "Ljava/lang/String;")
    public static String field829 = " more options";

    @OriginalMember(owner = "client!pm", name = "q", descriptor = "I")
    public static int field830 = 0;

    @OriginalMember(owner = "client!pm", name = "s", descriptor = "Ljava/lang/String;")
    public static String field832 = " from your ignore list first.";

    @OriginalMember(owner = "client!pm", name = "v", descriptor = "I")
    public static int field835 = 0;

    @OriginalMember(owner = "client!pm", name = "o", descriptor = "I")
    public static int field828;

    @OriginalMember(owner = "client!pm", name = "r", descriptor = "I")
    public int field831;

    @OriginalMember(owner = "client!pm", name = "t", descriptor = "I")
    public static int field833;

    @OriginalMember(owner = "client!pm", name = "u", descriptor = "I")
    public int field834;

    @OriginalMember(owner = "client!pm", name = "w", descriptor = "I")
    public static int field836;

    @OriginalMember(owner = "client!pm", name = "d", descriptor = "(I)V")
    public static void method377(int arg0) {
        if (arg0 != -25561) {
            method379((byte) 40);
        }
        field832 = null;
        field829 = null;
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(ZLjava/lang/String;B)V")
    public static final void method378(boolean arg0, String arg1, byte arg2) {
        int var3 = -31 % ((arg2 - 78) / 36);
        if (arg0) {
            try {
                class154.field2132.getAppletContext().showDocument(new URL(class154.field2132.getCodeBase(), arg1), "_blank");
            } catch (Exception var6) {
            }
        } else {
            try {
                class172.method1097("loggedout", true, class45.field667.field744);
            } catch (Throwable var5) {
            }
            try {
                class154.field2132.getAppletContext().showDocument(new URL(class154.field2132.getCodeBase(), arg1), "_top");
            } catch (Exception var4) {
            }
        }
        field833++;
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(B)V")
    public static final void method379(byte arg0) {
        boolean var1 = true;
        class255.method1658(-26, false);
        class17.field295 = 0;
        for (int var2 = 0; var2 < class117.field1685.length; var2++) {
            if (class261.field4205[var2] != -1 && class117.field1685[var2] == null) {
                class117.field1685[var2] = class307.field4932.method2050(89, class261.field4205[var2], 0);
                if (class117.field1685[var2] == null) {
                    class17.field295++;
                    var1 = false;
                }
            }
            if (class267.field4285[var2] != -1 && class110.field1583[var2] == null) {
                class110.field1583[var2] = class307.field4932.method2072(class267.field4285[var2], false, 0, class275.field4364[var2]);
                if (class110.field1583[var2] == null) {
                    class17.field295++;
                    var1 = false;
                }
            }
            if (class225.field3525 != null && class240.field3705[var2] == null && class225.field3525[var2] != -1) {
                class240.field3705[var2] = class307.field4932.method2072(class225.field3525[var2], false, 0, class275.field4364[var2]);
                if (class240.field3705[var2] == null) {
                    class17.field295++;
                    var1 = false;
                }
            }
        }
        if (class139.field1925 == null) {
            if (class26.field411 == null || !class185.field2805.method2055(124, class26.field411.field4776 + "_labels")) {
                class139.field1925 = new class208(0);
            } else if (class185.field2805.method2057(0, class26.field411.field4776 + "_labels")) {
                class139.field1925 = class138.method866(arg0 - 222, class252.field3939, class185.field2805, class26.field411.field4776 + "_labels");
            } else {
                var1 = false;
                class17.field295++;
            }
        }
        field836++;
        if (!var1) {
            class14.field231 = 1;
        } else if (arg0 == 115) {
            class39.field586 = 0;
            boolean var3 = true;
            for (int var4 = 0; var4 < class117.field1685.length; var4++) {
                byte[] var20 = class110.field1583[var4];
                if (var20 != null) {
                    int var21 = (class213.field3218[var4] >> 8) * 64 - class228.field3570;
                    int var22 = (class213.field3218[var4] & 0xFF) * 64 - class170.field2421;
                    if (class195.field2997) {
                        var21 = 10;
                        var22 = 10;
                    }
                    var3 &= class138.method882(var22, -118, var20, var21);
                }
            }
            if (var3) {
                if (class14.field231 != 0) {
                    class188.method1188(true, (byte) -14, class294.field4694 + "<br>(100%)");
                }
                class8.method45(arg0 ^ 0xF84);
                class15.method110((byte) -101);
                boolean var5 = false;
                class57.method355(4, 104, 104, 25, var5);
                for (int var6 = 0; var6 < 4; var6++) {
                    class156.field2153[var6].method1326((byte) -94);
                }
                for (int var7 = 0; var7 < 4; var7++) {
                    for (int var18 = 0; var18 < 104; var18++) {
                        for (int var19 = 0; var19 < 104; var19++) {
                            class164.field2333[var7][var18][var19] = 0;
                        }
                    }
                }
                class206.method1289(false, (byte) 107);
                class8.method45(4087);
                System.gc();
                class255.method1658(-26, true);
                class284.method1867(false, arg0 - 228);
                if (!class195.field2997) {
                    class166.method1066(false, (byte) -86);
                    class255.method1658(-26, true);
                    class275.method1785(false, (byte) -87);
                    if (class240.field3705 != null) {
                        class9.method50((byte) -98);
                    }
                }
                if (class195.field2997) {
                    class157.method976(false, -1336169736);
                    class255.method1658(-26, true);
                    class252.method1639(false, -2872);
                }
                class15.method110((byte) -109);
                class255.method1658(-26, true);
                class90.method580(class156.field2153, 1, class195.field2997 ? class45.field665 : null, false);
                class255.method1658(arg0 ^ 0xFFFFFF95, true);
                int var8 = class137.field1873;
                if (class166.field2364 < var8) {
                    var8 = class166.field2364;
                }
                if ((class166.field2364 - 1) > var8) {
                    int var9 = class166.field2364 - 1;
                }
                if (class294.method1973(2)) {
                    class308.method2093(0);
                } else {
                    class308.method2093(class137.field1873);
                }
                class194.method1227(2);
                for (int var10 = 0; var10 < 104; var10++) {
                    for (int var17 = 0; var17 < 104; var17++) {
                        class51.method314((byte) -27, var17, var10);
                    }
                }
                class182.method1164((byte) 82);
                class8.method45(4087);
                class277.method1799(64);
                class15.method110((byte) -119);
                if (class31.field469 != null && class272.field4332 != null && class142.field1961 == 25) {
                    class231.field3614.method809(34, 0);
                    class272.field4336++;
                    class231.field3614.method1398(true, 1057001181);
                }
                if (!class195.field2997) {
                    int var11 = (class200.field3045 - 6) / 8;
                    int var12 = (class200.field3045 + 6) / 8;
                    int var13 = (class281.field4460 - 6) / 8;
                    int var14 = (class281.field4460 + 6) / 8;
                    for (int var15 = var11 - 1; var15 <= (var12 + 1); var15++) {
                        for (int var16 = var13 - 1; var16 <= (var14 + 1); var16++) {
                            if (var15 < var11 || var15 > var12 || var16 < var13 || var16 > var14) {
                                class307.field4932.method2066(arg0 + 12, "m" + var15 + "_" + var16);
                                class307.field4932.method2066(119, "l" + var15 + "_" + var16);
                            }
                        }
                    }
                }
                if (class142.field1961 == 28) {
                    class82.method519(-120, 10);
                } else {
                    class82.method519(-122, 30);
                    if (class272.field4332 != null) {
                        class231.field3614.method809(207, arg0 - 115);
                    }
                }
                class37.method256(false);
                class8.method45(4087);
                class251.method1632((byte) -86);
            } else {
                class14.field231 = 2;
            }
        }
    }

    @OriginalMember(owner = "client!pm", name = "e", descriptor = "(I)V")
    public static final void method380(int arg0) {
        field828++;
        if (arg0 != 1828574536) {
            field832 = null;
        }
        for (int var1 = 0; var1 < class102.field1466; var1++) {
            int var2 = class211.field3131[var1];
            class314 var3 = class48.field689[var2];
            int var4 = class131.field1830.method1374((byte) -60);
            if ((var4 & 0x20) != 0) {
                var4 += class131.field1830.method1374((byte) -60) << 8;
            }
            class14.method91(var3, false, var4, var2);
        }
    }
}
