import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oe")
public class class89 {

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "Z")
    public static boolean field2363 = false;

    @OriginalMember(owner = "client!oe", name = "f", descriptor = "I")
    public static int field2368 = 3;

    @OriginalMember(owner = "client!oe", name = "c", descriptor = "Z")
    public static boolean field2365 = false;

    @OriginalMember(owner = "client!oe", name = "j", descriptor = "Lke;")
    private static class65 field2372 = class1.method17("Prepared sound engine", -120);

    @OriginalMember(owner = "client!oe", name = "i", descriptor = "I")
    public static int field2371 = 0;

    @OriginalMember(owner = "client!oe", name = "k", descriptor = "[I")
    public static int[] field2373 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!oe", name = "l", descriptor = "I")
    public static int field2374 = 0;

    @OriginalMember(owner = "client!oe", name = "m", descriptor = "Lke;")
    public static class65 field2375 = class1.method17("Lade Ignorieren)2Liste)3)3)3", -123);

    @OriginalMember(owner = "client!oe", name = "g", descriptor = "Lke;")
    public static class65 field2369 = field2372;

    @OriginalMember(owner = "client!oe", name = "p", descriptor = "I")
    public static int field2378 = -1;

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "I")
    public static int field2364;

    @OriginalMember(owner = "client!oe", name = "e", descriptor = "I")
    public static int field2367;

    @OriginalMember(owner = "client!oe", name = "h", descriptor = "I")
    public static int field2370;

    @OriginalMember(owner = "client!oe", name = "n", descriptor = "I")
    public static int field2376;

    @OriginalMember(owner = "client!oe", name = "d", descriptor = "Lg;")
    public static class39 field2366;

    @OriginalMember(owner = "client!oe", name = "o", descriptor = "Lle;")
    public static class71 field2377;

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(Lec;I)V", line = 3)
    public static final void method784(class27 arg0, int arg1) {
        int var2 = arg0.field705;
        field2367++;
        if (var2 >= 1 && var2 <= 100 || var2 >= 701 && var2 <= 800) {
            if (var2 == 1 && class19.field413 == 0) {
                arg0.field669 = 0;
                arg0.field715 = class125.field3045;
            } else if (var2 == 1 && class19.field413 == 1) {
                arg0.field669 = 0;
                arg0.field715 = class60.field1616;
            } else if (var2 == 2 && class19.field413 != 2) {
                arg0.field715 = class44.field1175;
                arg0.field669 = 0;
            } else {
                if (var2 <= 700) {
                    var2--;
                } else {
                    var2 -= 601;
                }
                int var3 = class87.field2317;
                if (class19.field413 != 2) {
                    var3 = 0;
                }
                if (var3 <= var2) {
                    arg0.field715 = class100.field2591;
                    arg0.field669 = 0;
                } else {
                    arg0.field715 = class86.field2286[var2];
                    arg0.field669 = 1;
                }
            }
        } else if (var2 >= 101 && var2 <= 200 || var2 >= 801 && var2 <= 900) {
            if (var2 <= 800) {
                var2 -= 101;
            } else {
                var2 -= 701;
            }
            int var4 = class87.field2317;
            if (class19.field413 != 2) {
                var4 = 0;
            }
            if (var2 >= var4) {
                arg0.field669 = 0;
                arg0.field715 = class100.field2591;
            } else {
                if (class52.field1325[var2] == 0) {
                    arg0.field715 = class21.method172(arg1 - 83, new class65[] { class83.field2189, client.field396 });
                } else if (class52.field1325[var2] < 5000) {
                    if (class52.field1325[var2] == class102.field2651) {
                        arg0.field715 = class21.method172(-94, new class65[] { class48.field1261, class111.field2734, class39.method320(class52.field1325[var2], (byte) -36) });
                    } else {
                        arg0.field715 = class21.method172(-121, new class65[] { class50.field1267, class111.field2734, class39.method320(class52.field1325[var2], (byte) -36) });
                    }
                } else if (class52.field1325[var2] == class102.field2651) {
                    arg0.field715 = class21.method172(-128, new class65[] { class48.field1261, class99.field2566, class39.method320(class52.field1325[var2] - 5000, (byte) -36) });
                } else {
                    arg0.field715 = class21.method172(-59, new class65[] { class50.field1267, class99.field2566, class39.method320(class52.field1325[var2] - 5000, (byte) -36) });
                }
                arg0.field669 = 1;
            }
        } else {
            if (arg1 != 0) {
                field2377 = null;
            }
            if (var2 == 203) {
                int var5 = class87.field2317;
                if (class19.field413 != 2) {
                    var5 = 0;
                }
                arg0.field673 = var5 * 15 + 20;
                if (arg0.field673 <= arg0.field708) {
                    arg0.field673 = arg0.field708 + 1;
                }
            } else if (var2 >= 401 && var2 <= 500) {
                var2 -= 401;
                if (var2 == 0 && class19.field413 == 0) {
                    arg0.field715 = class83.field2192;
                    arg0.field669 = 0;
                } else if (var2 == 1 && class19.field413 == 0) {
                    arg0.field669 = 0;
                    arg0.field715 = class44.field1175;
                } else {
                    int var6 = class51.field1311;
                    if (class19.field413 == 0) {
                        var6 = 0;
                    }
                    if (var6 <= var2) {
                        arg0.field669 = 0;
                        arg0.field715 = class100.field2591;
                    } else {
                        arg0.field715 = class26.method216(16972, class35.field885[var2]).method560(arg1 - 102);
                        arg0.field669 = 1;
                    }
                }
            } else if (var2 == 503) {
                arg0.field673 = class51.field1311 * 15 + 20;
                if (arg0.field708 >= arg0.field673) {
                    arg0.field673 = arg0.field708 + 1;
                }
            } else if (var2 == 327) {
                arg0.field663 = 150;
                arg0.field707 = (int) (Math.sin((double) class76.field2028 / 40.0D) * 256.0D) & 0x7FF;
                arg0.field699 = 0;
                arg0.field687 = 5;
            } else if (var2 == 324) {
                if (class77.field2046 == -1) {
                    class10.field190 = arg0.field683;
                    class77.field2046 = arg0.field732;
                }
                if (class32.field837.field1395) {
                    arg0.field732 = class77.field2046;
                } else {
                    arg0.field732 = class10.field190;
                }
            } else if (var2 == 325) {
                if (class77.field2046 == -1) {
                    class10.field190 = arg0.field683;
                    class77.field2046 = arg0.field732;
                }
                if (class32.field837.field1395) {
                    arg0.field732 = class10.field190;
                } else {
                    arg0.field732 = class77.field2046;
                }
            } else if (var2 == 600) {
                arg0.field715 = class21.method172(-59, new class65[] { class100.field2599, class10.field217 });
            } else if (var2 == 620) {
                if (field2374 < 1) {
                    arg0.field715 = class100.field2591;
                } else if (class78.field2088) {
                    arg0.field715 = class26.field635;
                    arg0.field693 = 16711680;
                } else {
                    arg0.field693 = 16777215;
                    arg0.field715 = class51.field1288;
                }
            }
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(IZ)Lua;", line = 289)
    public static final class117 method785(int arg0, boolean arg1) {
        field2376++;
        class117 var2 = (class117) class7.field138.method833((byte) -53, (long) arg0);
        if (arg1) {
            method785(116, false);
        }
        if (var2 != null) {
            return var2;
        }
        class117 var3 = class1.method2(arg0, false, class17.field366, class7.field145, true);
        if (var3 != null) {
            class7.field138.method836((long) arg0, var3, true);
        }
        return var3;
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(Z)V", line = 309)
    public static final void method786(boolean arg0) {
        if (!arg0) {
            method784(null, -21);
        }
        field2364++;
        try {
            Graphics var1 = class10.field210.getGraphics();
            class112.field2788.method790(553, 205, var1, -54);
        } catch (Exception var2) {
            class10.field210.repaint();
        }
    }

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "(Z)V", line = 342)
    public static void method787(boolean arg0) {
        field2375 = null;
        field2377 = null;
        field2373 = null;
        if (!arg0) {
            field2373 = null;
        }
        field2369 = null;
        field2372 = null;
        field2366 = null;
    }
}
