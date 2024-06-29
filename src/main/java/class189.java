import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uh")
public class class189 extends class67 {

    @OriginalMember(owner = "client!uh", name = "A", descriptor = "Led;")
    public static class43 field3700 = class191.method1219("compass", false);

    @OriginalMember(owner = "client!uh", name = "C", descriptor = "Led;")
    private static class43 field3702 = class191.method1219("Please wait 1 minute and try again)3", false);

    @OriginalMember(owner = "client!uh", name = "B", descriptor = "J")
    public static long field3701 = 0L;

    @OriginalMember(owner = "client!uh", name = "K", descriptor = "Led;")
    public static class43 field3708 = field3702;

    @OriginalMember(owner = "client!uh", name = "w", descriptor = "Led;")
    public static class43 field3696 = class191.method1219("::clientdrop", false);

    @OriginalMember(owner = "client!uh", name = "J", descriptor = "Led;")
    public static class43 field3707 = field3702;

    @OriginalMember(owner = "client!uh", name = "E", descriptor = "B")
    public byte field3703;

    @OriginalMember(owner = "client!uh", name = "u", descriptor = "I")
    public static int field3694;

    @OriginalMember(owner = "client!uh", name = "x", descriptor = "I")
    public static int field3697;

    @OriginalMember(owner = "client!uh", name = "y", descriptor = "I")
    public int field3698;

    @OriginalMember(owner = "client!uh", name = "F", descriptor = "I")
    public static int field3704;

    @OriginalMember(owner = "client!uh", name = "G", descriptor = "I")
    public static int field3705;

    @OriginalMember(owner = "client!uh", name = "H", descriptor = "I")
    public static int field3706;

    @OriginalMember(owner = "client!uh", name = "L", descriptor = "I")
    public static int field3709;

    @OriginalMember(owner = "client!uh", name = "z", descriptor = "Led;")
    public class43 field3699;

    @OriginalMember(owner = "client!uh", name = "v", descriptor = "Lig;")
    public static class80 field3695;

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(ZI)V")
    public static final void method1200(boolean arg0, int arg1) {
        if (!arg0) {
            field3701 = 91L;
        }
        class116.method737(!arg0);
        class83.method509(-1);
        field3705++;
        int var2 = class191.method1216(255, arg1).field1073;
        if (var2 == 0) {
            return;
        }
        int var3 = class30.field569[arg1];
        if (var2 == 1) {
            if (var3 == 1) {
                class135.method868(0.9F);
            }
            if (var3 == 2) {
                class135.method868(0.8F);
            }
            if (var3 == 3) {
                class135.method868(0.7F);
            }
            if (var3 == 4) {
                class135.method868(0.6F);
            }
            class187.method1197(1);
        }
        if (var2 == 3) {
            short var4 = 0;
            if (var3 == 0) {
                var4 = 255;
            }
            if (var3 == 1) {
                var4 = 192;
            }
            if (var3 == 2) {
                var4 = 128;
            }
            if (var3 == 3) {
                var4 = 64;
            }
            if (var3 == 4) {
                var4 = 0;
            }
            if (class41.field796 != var4) {
                if (class41.field796 == 0 && class85.field1658 != -1) {
                    class206.method1334(class85.field1658, true, var4, field3695, false, 0);
                    class40.field767 = false;
                } else if (var4 == 0) {
                    class33.method188((byte) 38);
                    class40.field767 = false;
                } else {
                    class205.method1323(var4, 0);
                }
                class41.field796 = var4;
            }
        }
        if (var2 == 4) {
            if (var3 == 0) {
                class14.field208 = 127;
            }
            if (var3 == 1) {
                class14.field208 = 96;
            }
            if (var3 == 2) {
                class14.field208 = 64;
            }
            if (var3 == 3) {
                class14.field208 = 32;
            }
            if (var3 == 4) {
                class14.field208 = 0;
            }
        }
        if (var2 == 9) {
            class121.field2399 = var3;
        }
        if (var2 == 5) {
            class99.field1904 = var3;
        }
        if (var2 == 10) {
            if (var3 == 0) {
                class116.field2277 = 127;
            }
            if (var3 == 1) {
                class116.field2277 = 96;
            }
            if (var3 == 2) {
                class116.field2277 = 64;
            }
            if (var3 == 3) {
                class116.field2277 = 32;
            }
            if (var3 == 4) {
                class116.field2277 = 0;
            }
        }
        if (var2 == 6) {
            class166.field3289 = var3;
        }
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(IIIB)V")
    public static final void method1201(int arg0, int arg1, int arg2, byte arg3) {
        if (arg3 < 46) {
            field3701 = 17L;
        }
        field3694++;
        if (class14.field208 == 0 || arg1 == 0 || class36.field650 >= 50) {
            return;
        }
        class20.field346[class36.field650] = arg2;
        class156.field3163[class36.field650] = arg1;
        class76.field1503[class36.field650] = arg0;
        class49.field995[class36.field650] = null;
        class9.field168[class36.field650] = 0;
        class36.field650++;
    }

    @OriginalMember(owner = "client!uh", name = "b", descriptor = "(BII)I")
    public static final int method1202(byte arg0, int arg1, int arg2) {
        field3697++;
        int var3 = arg1 >>> 31;
        if (arg0 > -80) {
            method1201(-15, -104, -111, (byte) 8);
        }
        return (arg1 + var3) / arg2 - var3;
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(Lga;B)V")
    public static final void method1203(class58 arg0, byte arg1) {
        if (arg1 != -42) {
            method1201(106, -114, -127, (byte) 58);
        }
        class166.field3288 = arg0;
        field3709++;
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(BLjg;)V")
    public static final void method1204(byte arg0, class89 arg1) {
        field3706++;
        if (arg0 <= 102) {
            method1201(101, -17, -103, (byte) -85);
        }
        if (class49.field996 != null) {
            try {
                class49.field996.method226(0L, (byte) -105);
                class49.field996.method216(24, arg1.field1769, (byte) 45, arg1.field1727);
            } catch (Exception var2) {
            }
        }
        arg1.field1727 += 24;
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(B)V")
    public static void method1205(byte arg0) {
        field3700 = null;
        field3702 = null;
        field3696 = null;
        field3695 = null;
        int var1 = -22 % ((-arg0 - 40) / 37);
        field3707 = null;
        field3708 = null;
    }
}
