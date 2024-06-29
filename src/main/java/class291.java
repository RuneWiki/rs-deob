import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fj")
public class class291 extends class141 {

    @OriginalMember(owner = "client!fj", name = "y", descriptor = "I")
    public static int field4893 = -1;

    @OriginalMember(owner = "client!fj", name = "p", descriptor = "I")
    public static int field4884 = 0;

    @OriginalMember(owner = "client!fj", name = "o", descriptor = "[I")
    public static int[] field4883 = new int[2];

    @OriginalMember(owner = "client!fj", name = "m", descriptor = "I")
    public static int field4881;

    @OriginalMember(owner = "client!fj", name = "n", descriptor = "I")
    public int field4882;

    @OriginalMember(owner = "client!fj", name = "t", descriptor = "I")
    public static int field4888;

    @OriginalMember(owner = "client!fj", name = "u", descriptor = "I")
    public static int field4889;

    @OriginalMember(owner = "client!fj", name = "v", descriptor = "I")
    public int field4890;

    @OriginalMember(owner = "client!fj", name = "x", descriptor = "I")
    public static int field4892;

    @OriginalMember(owner = "client!fj", name = "C", descriptor = "I")
    public static int field4896;

    @OriginalMember(owner = "client!fj", name = "q", descriptor = "[I")
    public int[] field4885;

    @OriginalMember(owner = "client!fj", name = "r", descriptor = "[I")
    public int[] field4886;

    @OriginalMember(owner = "client!fj", name = "z", descriptor = "[I")
    public int[] field4894;

    @OriginalMember(owner = "client!fj", name = "w", descriptor = "[Lag;")
    public class301[] field4891;

    @OriginalMember(owner = "client!fj", name = "A", descriptor = "[Lag;")
    public class301[] field4895;

    @OriginalMember(owner = "client!fj", name = "s", descriptor = "[[[B")
    public byte[][][] field4887;

    @OriginalMember(owner = "client!fj", name = "c", descriptor = "(I)V", line = 5)
    public static final void method2006(int arg0) {
        field4881++;
        class181 var1 = (class181) class68.field1055.method1936(arg0 ^ 0xFFFFA04D);
        if (arg0 != -24736) {
            return;
        }
        while (var1 != null) {
            if (var1.field3099 > 0) {
                var1.field3099--;
            }
            if (var1.field3099 != 0) {
                if (var1.field3082 > 0) {
                    var1.field3082--;
                }
                if (var1.field3082 == 0 && var1.field3085 >= 1 && var1.field3087 >= 1 && var1.field3085 <= 102 && var1.field3087 <= 102 && (var1.field3094 < 0 || class215.method1535(var1.field3092, false, var1.field3094))) {
                    class264.method1878(var1.field3093, var1.field3094, var1.field3090, var1.field3095, var1.field3085, var1.field3092, -106, var1.field3087);
                    var1.field3082 = -1;
                    if (var1.field3094 == var1.field3081 && var1.field3081 == -1) {
                        var1.method961((byte) 64);
                    } else if (var1.field3094 == var1.field3081 && var1.field3090 == var1.field3084 && var1.field3092 == var1.field3089) {
                        var1.method961((byte) 102);
                    }
                }
            } else if (var1.field3081 < 0 || class215.method1535(var1.field3089, false, var1.field3081)) {
                class264.method1878(var1.field3093, var1.field3081, var1.field3084, var1.field3095, var1.field3085, var1.field3089, -112, var1.field3087);
                var1.method961((byte) 67);
            }
            var1 = (class181) class68.field1055.method1926((byte) 90);
        }
    }

    @OriginalMember(owner = "client!fj", name = "b", descriptor = "(B)V", line = 67)
    public static final void method2007(byte arg0) {
        class61 var1 = (class61) class22.field300.method1936(16173);
        field4888++;
        if (arg0 <= 10) {
            return;
        }
        while (var1 != null) {
            class38 var2 = var1.field958;
            if (class297.field5058 != var2.field637 || class212.field3708 > var2.field666) {
                var1.method961((byte) 61);
            } else if (var2.field639 <= class212.field3708) {
                if (var2.field633 > 0) {
                    class275 var3 = class99.field1777[var2.field633 - 1];
                    if (var3 != null && var3.field1685 >= 0 && var3.field1685 < 13312 && var3.field1689 >= 0 && var3.field1689 < 13312) {
                        var2.method297(class21.method145(var3.field1685, var3.field1689, var2.field637, (byte) -94) - var2.field654, class212.field3708, var3.field1689, var3.field1685, -1);
                    }
                }
                if (var2.field633 < 0) {
                    int var4 = -var2.field633 - 1;
                    class81 var5;
                    if (class109.field1949 == var4) {
                        var5 = class168.field2932;
                    } else {
                        var5 = class29.field405[var4];
                    }
                    if (var5 != null && var5.field1685 >= 0 && var5.field1685 < 13312 && var5.field1689 >= 0 && var5.field1689 < 13312) {
                        var2.method297(class21.method145(var5.field1685, var5.field1689, var2.field637, (byte) 49) - var2.field654, class212.field3708, var5.field1689, var5.field1685, -1);
                    }
                }
                var2.method302(class243.field4229, 1024);
                class321.method2224(class297.field5058, (int) var2.field663, (int) var2.field653, (int) var2.field648, 60, var2, var2.field629, -1L, false);
            }
            var1 = (class61) class22.field300.method1926((byte) 90);
        }
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(IBI)I", line = 120)
    public static final int method2008(int arg0, byte arg1, int arg2) {
        field4892++;
        int var3 = class75.method477(arg2 + 91923, true, 4, arg0 + 45365) + (-(-(class75.method477(arg2 + 37821, true, 2, arg0 + 10294) - 128 >> 1) - (class75.method477(arg2, true, 1, arg0) - 128 >> 2)) - 128);
        int var4 = (int) ((double) var3 * 0.3D) + 35;
        if (arg1 >= -18) {
            return -67;
        }
        if (var4 < 10) {
            var4 = 10;
        } else if (var4 > 60) {
            var4 = 60;
        }
        return var4;
    }

    @OriginalMember(owner = "client!fj", name = "d", descriptor = "(I)Lhi;", line = 155)
    public static final class82 method2009(int arg0) {
        field4889++;
        class82 var1 = class129.field2247;
        if (arg0 != 23939) {
            method2006(-110);
        }
        class82 var2 = class288.field4845;
        if (class91.field1640 != 0) {
            var2 = class150.field2562;
        }
        if (class159.field2765 != null) {
            var1 = class29.method182(-6039, new class82[] { class262.field4489, class159.field2765 });
        }
        return class29.method182(-6039, new class82[] { class138.field2374, var2, class86.field1539, class327.method2240((byte) -74, class53.field856), class16.field143, class327.method2240((byte) -74, class80.field1361), var1, class194.field3291 });
    }

    @OriginalMember(owner = "client!fj", name = "c", descriptor = "(B)V", line = 183)
    public static void method2010(byte arg0) {
        field4883 = null;
        if (arg0 != 41) {
            method2010((byte) 25);
        }
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(IIZIZII)V", line = 214)
    public static final void method2011(int arg0, int arg1, boolean arg2, int arg3, boolean arg4, int arg5, int arg6) {
        if (arg4) {
            class147.method1005();
        }
        field4896++;
        if (class48.field795 != null && (arg3 != 3 || class93.field1660 != arg0 || class112.field2033 != arg5)) {
            class144.method978(arg1 - 2, class55.field881, class48.field795);
            class48.field795 = null;
        }
        if (arg3 == 3 && class48.field795 == null) {
            class48.field795 = class55.method383(0, 0, arg0, class55.field881, 2, arg5);
            if (class48.field795 != null) {
                class112.field2033 = arg5;
                class93.field1660 = arg0;
                class15.method82(true, class55.field881);
            }
        }
        if (arg3 == 3 && class48.field795 == null) {
            method2011(-1, 0, true, class261.field4470, true, -1, arg6);
            return;
        }
        Container var7;
        if (class48.field795 != null) {
            var7 = class48.field795;
        } else if (class261.field4468 == null) {
            var7 = class55.field881.field2109;
        } else {
            var7 = class261.field4468;
        }
        class196.field3337 = var7.getSize().width;
        class166.field2902 = var7.getSize().height;
        if (class261.field4468 == var7) {
            Insets var8 = class261.field4468.getInsets();
            class166.field2902 -= var8.top + var8.bottom;
            class196.field3337 -= var8.left + var8.right;
        }
        if (arg3 >= 2) {
            class180.field3078 = class166.field2902;
            class48.field798 = 0;
            class260.field4462 = class196.field3337;
            class179.field3066 = 0;
        } else {
            class179.field3066 = (class196.field3337 - 765) / 2;
            class260.field4462 = 765;
            class180.field3078 = 503;
            class48.field798 = 0;
        }
        if (arg2) {
            class113.method776(class122.field2134, 0);
            class42.method320(class122.field2134, arg1 + 101);
            if (class294.field4926 != null) {
                class294.field4926.method944((byte) 53, class122.field2134);
            }
            class280.field4704.method1173((byte) -107);
            class33.method257((byte) -38, class122.field2134);
            class199.method1387(class122.field2134, -17706);
            if (class294.field4926 != null) {
                class294.field4926.method946(class122.field2134, true);
            }
        } else {
            if (class147.field2485) {
                class147.method1017(class260.field4462, class180.field3078);
            }
            class122.field2134.setSize(class260.field4462, class180.field3078);
            if (class261.field4468 == var7) {
                Insets var9 = class261.field4468.getInsets();
                class122.field2134.setLocation(var9.left + class179.field3066, class48.field798 + var9.top);
            } else {
                class122.field2134.setLocation(class179.field3066, class48.field798);
            }
        }
        if (arg3 == 0 && arg6 > 0) {
            class147.method1024(class122.field2134);
        }
        if (arg4 && arg3 > 0) {
            class122.field2134.setIgnoreRepaint(true);
            if (!class38.field655) {
                class88.method616();
                class321.field5534 = null;
                class321.field5534 = class157.method1129(class260.field4462, class122.field2134, (byte) -87, class180.field3078);
                class320.method2214();
                if (class61.field959 == 5) {
                    class286.method1983(63, true, class253.field4354);
                } else {
                    class323.method2230(class289.field4847, (byte) 66, false);
                }
                try {
                    Graphics var10 = class122.field2134.getGraphics();
                    class321.field5534.method1215(0, var10, 0, false);
                } catch (Exception var14) {
                }
                class61.method399(-14358);
                if (arg6 == 0) {
                    class321.field5534 = class157.method1129(765, class122.field2134, (byte) -98, 503);
                } else {
                    class321.field5534 = null;
                }
                class301 var12 = class55.field881.method819((byte) 99, class280.field4704.getClass());
                while (var12.field5121 == 0) {
                    class290.method2001(100L, false);
                }
                if (var12.field5121 == 1) {
                    class38.field655 = true;
                }
            }
            if (class38.field655) {
                class147.method994(class122.field2134, class146.field2467 * 2);
            }
        }
        if (!class147.field2485 && arg3 > 0) {
            method2011(-1, 0, true, 0, true, -1, arg6);
            return;
        }
        if (arg3 > arg1 && arg6 == 0) {
            class269.field4550.setPriority(5);
            class321.field5534 = null;
            class318.method2181();
            ((class89) class102.field1821).method623((byte) -95, 200);
            if (class75.field1303) {
                class102.method706(0.7F);
            }
        } else if (arg3 == 0 && arg6 > 0) {
            class269.field4550.setPriority(1);
            class321.field5534 = class157.method1129(765, class122.field2134, (byte) -97, 503);
            class318.method2182();
            class295.method2026();
            ((class89) class102.field1821).method623((byte) -69, 20);
            if (class75.field1303) {
                if (class112.field2032 == 1) {
                    class102.method706(0.9F);
                }
                if (class112.field2032 == 2) {
                    class102.method706(0.8F);
                }
                if (class112.field2032 == 3) {
                    class102.method706(0.7F);
                }
                if (class112.field2032 == 4) {
                    class102.method706(0.6F);
                }
            }
            class108.method739();
        }
        class307.field5230 = !class123.method841(false);
        if (arg4) {
            class237.method1674((byte) -77);
        }
        if (arg3 < 2) {
            class182.field3112 = false;
        } else {
            class182.field3112 = true;
        }
        if (class255.field4382 != -1) {
            class81.method522(false, true);
        }
        if (class66.field1036 != null && (class61.field959 == 30 || class61.field959 == 25)) {
            class277.method1925(arg1 ^ 0x47);
        }
        for (int var13 = 0; var13 < 100; var13++) {
            class276.field4639[var13] = true;
        }
        class211.field3698 = true;
    }
}
