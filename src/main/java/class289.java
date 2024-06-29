import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sh")
public class class289 {

    @OriginalMember(owner = "client!sh", name = "b", descriptor = "Z")
    public static boolean field4541 = true;

    @OriginalMember(owner = "client!sh", name = "c", descriptor = "I")
    public static int field4542;

    @OriginalMember(owner = "client!sh", name = "d", descriptor = "I")
    public static int field4543;

    @OriginalMember(owner = "client!sh", name = "e", descriptor = "I")
    public static int field4544;

    @OriginalMember(owner = "client!sh", name = "f", descriptor = "I")
    public static int field4545;

    @OriginalMember(owner = "client!sh", name = "g", descriptor = "I")
    public static int field4546;

    @OriginalMember(owner = "client!sh", name = "h", descriptor = "I")
    public static int field4547;

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "[I")
    public static int[] field4540;

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(B)V", line = 9)
    public static final void method2042(byte arg0) {
        field4545++;
        if (class154.field2332 == null) {
            return;
        }
        if (class204.field3244 < 10) {
            if (!class87.field1281.method1524(127, class154.field2332.field3021)) {
                class204.field3244 = class220.field3451.method1499((byte) -67, class154.field2332.field3021) / 10;
                return;
            }
            class250.method1731(true);
            class204.field3244 = 10;
        }
        if (class204.field3244 == 10) {
            class69.field1018 = class154.field2332.field3037 >> 6 << 6;
            class318.field4932 = class154.field2332.field3036 >> 6 << 6;
            class193.field3089 = (class154.field2332.field3033 >> 6 << 6) + 64 - class318.field4932;
            class87.field1280 = (class154.field2332.field3025 >> 6 << 6) + 64 - class69.field1018;
            int var1 = (class235.field3602.field4507 >> 7) + class302.field4735 - class69.field1018;
            if (class154.field2332.field3018 == 37) {
                class79.field1111 = 3.0F;
                class175.field2588 = 3.0F;
            } else if (class154.field2332.field3018 == 50) {
                class79.field1111 = 4.0F;
                class175.field2588 = 4.0F;
            } else if (class154.field2332.field3018 == 75) {
                class79.field1111 = 6.0F;
                class175.field2588 = 6.0F;
            } else if (class154.field2332.field3018 == 100) {
                class79.field1111 = 8.0F;
                class175.field2588 = 8.0F;
            } else if (class154.field2332.field3018 == 200) {
                class79.field1111 = 16.0F;
                class175.field2588 = 16.0F;
            } else {
                class79.field1111 = 8.0F;
                class175.field2588 = 8.0F;
            }
            int var2 = class318.field4932 + class193.field3089 - (class235.field3602.field4496 >> 7) - class110.field1744 - 1;
            int var3 = var1 + ((int) (Math.random() * 10.0D) - 5);
            int var4 = var2 + ((int) (Math.random() * 10.0D) - 5);
            if (var3 >= 0 && class87.field1280 > var3 && var4 >= 0 && var4 < class193.field3089) {
                class241.field3631 = var4;
                class12.field136 = var3;
            } else {
                class241.field3631 = class318.field4932 + class193.field3089 - (class154.field2332.field3035 * 64) - 1;
                class12.field136 = class154.field2332.field3024 * 64 - class69.field1018;
            }
            class62.method546(-128);
            int var5 = class102.field1578 >> 2 << 10;
            int var6 = class209.field3293 >> 1;
            int var7 = class87.field1280 >> 6;
            int var8 = class193.field3089 >> 6;
            class207.field3268 = new byte[var7][var8][];
            class176.field2612 = new byte[var7][var8][];
            class152.field2294 = new int[var7][var8][];
            class62.field944 = new byte[var7][var8][];
            class279.field4294 = new int[class62.field934 + 1];
            class159.field2374 = new byte[var7][var8][];
            class64.field959 = new byte[var7][var8][];
            class124.field1961 = new int[var7][var8][];
            class30.field383 = new int[var7][var8][];
            class228.method1621((byte) -43, var5, var6);
            class204.field3244 = 20;
        } else if (class204.field3244 == 20) {
            class115.method897((byte) 76, new class35(class87.field1281.method1529("underlay", -1, class154.field2332.field3021)));
            class204.field3244 = 30;
            class97.method770(true, 120);
            class16.method121(false);
        } else if (class204.field3244 == 30) {
            class255.method1782(new class35(class87.field1281.method1529("overlay", -1, class154.field2332.field3021)), 15);
            class204.field3244 = 40;
            class16.method121(false);
        } else if (arg0 <= -61) {
            if (class204.field3244 == 40) {
                class178.method1290(new class35(class87.field1281.method1529("overlay2", -1, class154.field2332.field3021)), true);
                class204.field3244 = 50;
                class16.method121(false);
            } else if (class204.field3244 == 50) {
                class293.method2067(new class35(class87.field1281.method1529("loc", -1, class154.field2332.field3021)), 7510);
                class204.field3244 = 60;
                class97.method770(true, 92);
                class16.method121(false);
            } else if (class204.field3244 == 60) {
                if (class87.field1281.method1512(class154.field2332.field3021 + "_labels", 0)) {
                    if (!class87.field1281.method1524(124, class154.field2332.field3021 + "_labels")) {
                        return;
                    }
                    class213.field3390 = class133.method1006((byte) 103, class154.field2332.field3021 + "_labels", class87.field1281);
                } else {
                    class213.field3390 = new class11(0);
                }
                class204.field3244 = 70;
                class16.method121(false);
            } else if (class204.field3244 == 70) {
                class309.field4828 = new class283(11, true, class171.field2548);
                class204.field3244 = 73;
                class97.method770(true, 120);
                class16.method121(false);
            } else if (class204.field3244 == 73) {
                class152.field2283 = new class283(12, true, class171.field2548);
                class204.field3244 = 76;
                class97.method770(true, 117);
                class16.method121(false);
            } else if (class204.field3244 == 76) {
                class276.field4240 = new class283(14, true, class171.field2548);
                class204.field3244 = 79;
                class97.method770(true, 125);
                class16.method121(false);
            } else if (class204.field3244 == 79) {
                class200.field3181 = new class283(17, true, class171.field2548);
                class204.field3244 = 82;
                class97.method770(true, 110);
                class16.method121(false);
            } else if (class204.field3244 == 82) {
                class92.field1334 = new class283(19, true, class171.field2548);
                class204.field3244 = 85;
                class97.method770(true, 83);
                class16.method121(false);
            } else if (class204.field3244 == 85) {
                class43.field682 = new class283(22, true, class171.field2548);
                class204.field3244 = 88;
                class97.method770(true, 96);
                class16.method121(false);
            } else if (class204.field3244 == 88) {
                class138.field2158 = new class283(26, true, class171.field2548);
                class204.field3244 = 91;
                class97.method770(true, 85);
                class16.method121(false);
            } else {
                class200.field3179 = new class283(30, true, class171.field2548);
                class204.field3244 = 100;
                class97.method770(true, 121);
                class16.method121(false);
                System.gc();
            }
        }
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "([Ljava/lang/Object;[JI)V", line = 232)
    public static final void method2043(Object[] arg0, long[] arg1, int arg2) {
        field4542++;
        class244.method1691(arg2, arg0, (byte) 76, arg1.length - 1, arg1);
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(I)V", line = 241)
    public static void method2044(int arg0) {
        int var1 = 85 % ((arg0 + 29) / 53);
        field4540 = null;
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(II)V", line = 256)
    public static final void method2045(int arg0, int arg1) {
        class243.field3660.method1429((byte) 127, arg0);
        if (arg1 == 17) {
            field4543++;
        }
    }

    @OriginalMember(owner = "client!sh", name = "b", descriptor = "(I)V", line = 271)
    public static final void method2046(int arg0) {
        int var1 = -84 % ((26 - arg0) / 59);
        field4544++;
        if (!class252.method1753(-8090) && class50.field775 != class167.field2507) {
            class55.method485((byte) -90, false, class50.field775, class263.field3940, class235.field3602.field4470[0], class235.field3602.field4477[0], class290.field4569);
        } else if (class50.field775 != class222.field3471 && class83.method682(class50.field775, 14082)) {
            class222.field3471 = class50.field775;
            class294.method2079(3);
        }
    }
}
