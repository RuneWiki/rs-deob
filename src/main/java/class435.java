import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!a")
public class class435 {

    @OriginalMember(owner = "client!a", name = "f", descriptor = "Lbg;")
    public static class324 field6373 = new class324(45, 2);

    @OriginalMember(owner = "client!a", name = "g", descriptor = "I")
    public static int field6374 = 0;

    @OriginalMember(owner = "client!a", name = "i", descriptor = "I")
    public static int field6376 = 0;

    @OriginalMember(owner = "client!a", name = "j", descriptor = "[[Z")
    public static boolean[][] field6377 = new boolean[][] { new boolean[4], { false, true, true, false }, { true, false, true, false }, { true, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, { true, true, false, false }, new boolean[4], { false, true, false, true }, new boolean[4] };

    @OriginalMember(owner = "client!a", name = "a", descriptor = "I")
    public static int field6368;

    @OriginalMember(owner = "client!a", name = "b", descriptor = "I")
    public static int field6369;

    @OriginalMember(owner = "client!a", name = "d", descriptor = "I")
    public static int field6371;

    @OriginalMember(owner = "client!a", name = "e", descriptor = "I")
    public static int field6372;

    @OriginalMember(owner = "client!a", name = "h", descriptor = "Llh;")
    public static class364 field6375;

    @OriginalMember(owner = "client!a", name = "c", descriptor = "[[Lmu;")
    public static class196[][] field6370;

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(I)V", line = 3)
    public static final void method2635(int arg0) {
        field6368++;
        if (arg0 != 0) {
            method2638(-95);
        }
        for (class199 var1 = (class199) class212.field3057.method1018(111); var1 != null; var1 = (class199) class212.field3057.method1022((byte) -112)) {
            if (var1.field2904 == -1) {
                var1.field2907 = 0;
                if (var1.field2901 >= 0 && var1.field2898 >= 0 && class397.field5828 > var1.field2901 && class457.field6713 > var1.field2898) {
                    class256.method1645(22, var1);
                }
            } else {
                var1.method1525((byte) -124);
            }
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(ZI)V", line = 32)
    public static final void method2636(boolean arg0, int arg1) {
        class153.field2171.method1116(arg1, -50);
        field6372++;
        if (!arg0) {
            method2635(122);
        }
    }

    @OriginalMember(owner = "client!a", name = "b", descriptor = "(I)V", line = 43)
    public static final void method2637(int arg0) {
        class120.method951(class134.field1943, (byte) -109);
        field6371++;
        class367.field5456++;
        if (class50.field555 && class442.field6559) {
            if (arg0 >= -75) {
                method2636(true, -33);
            }
            int var1 = class104.field1460.method1268((byte) 58);
            int var2 = class104.field1460.method1280(3045);
            int var3 = var1 - class432.field6353;
            int var4 = var2 - class203.field2948;
            if (var3 < class38.field433) {
                var3 = class38.field433;
            }
            if ((class38.field433 + class326.field4577.field2711) < (class134.field1943.field2711 + var3)) {
                var3 = class38.field433 + class326.field4577.field2711 - class134.field1943.field2711;
            }
            if (class297.field4267 > var4) {
                var4 = class297.field4267;
            }
            if ((var4 + class134.field1943.field2672) > (class297.field4267 + class326.field4577.field2672)) {
                var4 = class297.field4267 + class326.field4577.field2672 - class134.field1943.field2672;
            }
            int var5 = class326.field4577.field2700 + var3 - class38.field433;
            int var6 = var4 + class326.field4577.field2744 - class297.field4267;
            if (class104.field1460.method3010(114)) {
                if (class367.field5456 > class134.field1943.field2633) {
                    int var7 = var3 - class264.field3897;
                    int var8 = var4 - class140.field1988;
                    if (class134.field1943.field2647 < var7 || -class134.field1943.field2647 > var7 || class134.field1943.field2647 < var8 || var8 < (-class134.field1943.field2647)) {
                        class20.field234 = true;
                    }
                }
                if (class134.field1943.field2699 != null && class20.field234) {
                    class125 var9 = new class125();
                    var9.field1833 = class134.field1943.field2699;
                    var9.field1835 = var5;
                    var9.field1831 = var6;
                    var9.field1830 = class134.field1943;
                    class41.method409(var9);
                    return;
                }
            } else {
                if (class20.field234) {
                    class235.method1568((byte) 120);
                    if (class134.field1943.field2648 != null) {
                        class125 var10 = new class125();
                        var10.field1833 = class134.field1943.field2648;
                        var10.field1831 = var6;
                        var10.field1825 = class93.field1273;
                        var10.field1830 = class134.field1943;
                        var10.field1835 = var5;
                        class41.method409(var10);
                    }
                    if (class93.field1273 != null && client.method1386(class134.field1943) != null) {
                        class439.method2688(class134.field1943, true, class93.field1273);
                    }
                } else if ((class495.field7259 == 1 || class358.method2154((byte) -20)) && class291.field4175 > 2) {
                    class474.method2865(-119, class432.field6353 + class264.field3897, class203.field2948 + class140.field1988);
                } else if (class445.method2709(128)) {
                    class474.method2865(113, class432.field6353 + class264.field3897, class203.field2948 + class140.field1988);
                }
                class134.field1943 = null;
            }
        } else if (class367.field5456 > 1) {
            class134.field1943 = null;
        }
    }

    @OriginalMember(owner = "client!a", name = "c", descriptor = "(I)V", line = 164)
    public static void method2638(int arg0) {
        if (arg0 != -14407) {
            field6373 = null;
        }
        field6375 = null;
        field6373 = null;
        field6370 = null;
        field6377 = null;
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(B)V", line = 180)
    public static final void method2639(byte arg0) {
        class318.field4507++;
        field6369++;
        class32.method258(-122, class461.field6774);
        class472.field6970.method638(255, class114.method920((byte) -123));
        if (arg0 >= 48) {
            class472.field6970.method611((byte) 67, class94.field1278);
            class472.field6970.method611((byte) 67, class410.field6100);
            class472.field6970.method638(255, class478.field7044.field3335);
        }
    }
}
