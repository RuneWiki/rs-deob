import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!s")
public class class108 extends class107 {

    @OriginalMember(owner = "client!s", name = "bb", descriptor = "J")
    public static long field2469 = 0L;

    @OriginalMember(owner = "client!s", name = "ob", descriptor = "I")
    public static int field2482 = 0;

    @OriginalMember(owner = "client!s", name = "kb", descriptor = "Lrc;")
    private static class105 field2478 = class43.method374(" has logged out)3", 0);

    @OriginalMember(owner = "client!s", name = "db", descriptor = "Lrc;")
    private static class105 field2471 = class43.method374("Error connecting to server)3", 0);

    @OriginalMember(owner = "client!s", name = "eb", descriptor = "Lrc;")
    public static class105 field2472 = field2471;

    @OriginalMember(owner = "client!s", name = "lb", descriptor = "Lrc;")
    public static class105 field2479 = field2478;

    @OriginalMember(owner = "client!s", name = "qb", descriptor = "Lrc;")
    public static class105 field2484 = class43.method374("leuchten2:", 0);

    @OriginalMember(owner = "client!s", name = "rb", descriptor = "Lrc;")
    public static class105 field2485 = class43.method374("Sie haben gerade eine andere Welt verlassen)3", 0);

    @OriginalMember(owner = "client!s", name = "fb", descriptor = "Lrc;")
    private static class105 field2473 = class43.method374("Please wait 5 minutes before trying again)3", 0);

    @OriginalMember(owner = "client!s", name = "ab", descriptor = "Lrc;")
    public static class105 field2468 = field2473;

    @OriginalMember(owner = "client!s", name = "ib", descriptor = "Lrc;")
    public static class105 field2476 = class43.method374(" )2> @cya@", 0);

    @OriginalMember(owner = "client!s", name = "mb", descriptor = "Lab;")
    public static class3 field2480 = new class3();

    @OriginalMember(owner = "client!s", name = "pb", descriptor = "B")
    public byte field2483;

    @OriginalMember(owner = "client!s", name = "Z", descriptor = "I")
    public static int field2467;

    @OriginalMember(owner = "client!s", name = "gb", descriptor = "I")
    public static int field2474;

    @OriginalMember(owner = "client!s", name = "hb", descriptor = "I")
    public int field2475;

    @OriginalMember(owner = "client!s", name = "jb", descriptor = "I")
    public static int field2477;

    @OriginalMember(owner = "client!s", name = "nb", descriptor = "I")
    public static int field2481;

    @OriginalMember(owner = "client!s", name = "cb", descriptor = "Lmd;")
    public class76 field2470;

    @OriginalMember(owner = "client!s", name = "b", descriptor = "(III)Z", line = 9)
    public static final boolean method875(int arg0, int arg1, int arg2) {
        field2477++;
        if (arg0 == 0 && class120.field2889 == arg2) {
            return true;
        } else if (arg0 == arg1 && class18.field407 == arg2) {
            return true;
        } else {
            return (arg0 == 2 || arg0 == 3) && class37.field862 == arg2;
        }
    }

    @OriginalMember(owner = "client!s", name = "f", descriptor = "(I)V", line = 50)
    public static final void method876(int arg0) {
        field2481++;
        if (arg0 != -1 || class96.field2224 == null) {
            return;
        }
        class119 var1 = class96.field2224;
        class119 var2 = class73.method618(arg0 + 10450, var1);
        if (var2 == null) {
            class96.field2224 = null;
            return;
        }
        class50.field1061++;
        int[] var3 = class1.method2(var2, -90);
        int[] var4 = class1.method2(var1, 77);
        int var5 = class35.field816 - class83.field1877;
        int var6 = class75.field1664 - class80.field1795;
        if (var6 <= var1.field2816 && -var1.field2816 <= var6 && var1.field2816 >= var5 && var5 >= -var1.field2816 && !class16.field340) {
            var5 = 0;
            var6 = 0;
        } else if (class50.field1061 > var1.field2781 || class16.field340) {
            class16.field340 = true;
        } else {
            var5 = 0;
            var6 = 0;
        }
        int var7 = var4[1] + var5 - var3[1];
        if (var7 < 0) {
            var7 = 0;
        }
        int var8 = var4[0] + var6 - var3[0];
        if (var8 < 0) {
            var8 = 0;
        }
        if (var2.field2855 < var1.field2855 + var8) {
            var8 = var2.field2855 - var1.field2855;
        }
        if (var1.field2787 + var7 > var2.field2787) {
            var7 = var2.field2787 - var1.field2787;
        }
        if (class96.field2224.field2818 != null && class16.field340) {
            class66.method558(var7, var1.field2818, var1, (byte) -77, 0, var8);
        }
        if (class9.field183 != 0) {
            return;
        }
        if (!class16.field340) {
            if (class96.field2224.field2836 != null) {
                class66.method558(var7, var1.field2836, var1, (byte) -94, 0, var8);
            }
            if ((class1.field9 == 1 || class66.method561(class113.field2652 - 1, 10024)) && class113.field2652 > 2) {
                class14.method158(arg0 + 9);
            } else if (class113.field2652 > 0) {
                class74.method626((byte) -91, class113.field2652 - 1);
            }
        } else if (class96.field2224.field2863 != null) {
            class66.method558(var7, var1.field2863, var1, (byte) -106, 0, var8);
        }
        class96.field2224 = null;
        return;
    }

    @OriginalMember(owner = "client!s", name = "g", descriptor = "(I)V", line = 157)
    public static void method877(int arg0) {
        field2476 = null;
        field2485 = null;
        field2478 = null;
        field2468 = null;
        field2473 = null;
        if (arg0 != 0) {
            method875(86, -88, -63);
        }
        field2471 = null;
        field2472 = null;
        field2484 = null;
        field2480 = null;
        field2479 = null;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "([Lrc;I)Lrc;", line = 188)
    public static final class105 method878(class105[] arg0, int arg1) {
        field2474++;
        if (arg0.length < 2) {
            throw new IllegalArgumentException();
        }
        if (arg1 != 2867) {
            method878(null, 70);
        }
        return class3.method36(0, 115, arg0, arg0.length);
    }

    @OriginalMember(owner = "client!s", name = "c", descriptor = "(B)V", line = 234)
    public static final void method879(byte arg0) {
        field2467++;
        for (class134 var1 = (class134) class58.field1234.method31(1280); var1 != null; var1 = (class134) class58.field1234.method26((byte) 108)) {
            if (class73.field1619 != var1.field3271 || class104.field2351 > var1.field3278) {
                var1.method551(82);
            } else if (class104.field2351 >= var1.field3282) {
                if (var1.field3261 > 0) {
                    class115 var2 = class19.field466[var1.field3261 - 1];
                    if (var2 != null && var2.field1229 >= 0 && var2.field1229 < 13312 && var2.field1274 >= 0 && var2.field1274 < 13312) {
                        var1.method1058(class104.field2351, var2.field1229, class134.method1061(11387, var1.field3271, var2.field1229, var2.field1274) - var1.field3280, var2.field1274, false);
                    }
                }
                if (var1.field3261 < 0) {
                    int var3 = -var1.field3261 - 1;
                    class15 var4;
                    if (class55.field1112 == var3) {
                        var4 = class119.field2842;
                    } else {
                        var4 = class58.field1303[var3];
                    }
                    if (var4 != null && var4.field1229 >= 0 && var4.field1229 < 13312 && var4.field1274 >= 0 && var4.field1274 < 13312) {
                        var1.method1058(class104.field2351, var4.field1229, class134.method1061(11387, var1.field3271, var4.field1229, var4.field1274) - var1.field3280, var4.field1274, false);
                    }
                }
                var1.method1060(class59.field1319, arg0 ^ 0x18CE);
                class130.field3161.method509(class73.field1619, (int) var1.field3286, (int) var1.field3268, (int) var1.field3288, 60, var1, var1.field3257, -1, false);
            }
        }
        if (arg0 != -26) {
            field2478 = null;
        }
    }
}
