import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rc")
public class class121 extends class12 {

    @OriginalMember(owner = "client!rc", name = "s", descriptor = "I")
    public static int field2672 = 0;

    @OriginalMember(owner = "client!rc", name = "z", descriptor = "Lwa;")
    public static class154 field2679 = null;

    @OriginalMember(owner = "client!rc", name = "x", descriptor = "[Lpe;")
    public static class109[] field2677 = new class109[100];

    @OriginalMember(owner = "client!rc", name = "D", descriptor = "Lpe;")
    private static class109 field2683 = class141.method1120("flash1:", 0);

    @OriginalMember(owner = "client!rc", name = "A", descriptor = "Lpe;")
    public static class109 field2680 = field2683;

    @OriginalMember(owner = "client!rc", name = "B", descriptor = "Lpe;")
    public static class109 field2681 = field2683;

    @OriginalMember(owner = "client!rc", name = "u", descriptor = "I")
    public static int field2674;

    @OriginalMember(owner = "client!rc", name = "v", descriptor = "I")
    public static int field2675;

    @OriginalMember(owner = "client!rc", name = "C", descriptor = "I")
    public static int field2682;

    @OriginalMember(owner = "client!rc", name = "y", descriptor = "Lpe;")
    public class109 field2678;

    @OriginalMember(owner = "client!rc", name = "t", descriptor = "Lc;")
    public static class15 field2673;

    @OriginalMember(owner = "client!rc", name = "w", descriptor = "Lna;")
    public static class91 field2676;

    @OriginalMember(owner = "client!rc", name = "F", descriptor = "Ljava/awt/Image;")
    public static Image field2684;

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(Lna;III)[Lk;")
    public static final class69[] method982(class91 arg0, int arg1, int arg2, int arg3) {
        if (arg2 > -126) {
            return null;
        } else {
            field2682++;
            return class12.method100(arg0, arg1, true, arg3) ? class41.method379((byte) 121) : null;
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(ILpe;IIIILpe;)V")
    public static final void method983(int arg0, class109 arg1, int arg2, int arg3, int arg4, int arg5, class109 arg6) {
        field2675++;
        if (arg4 != 48) {
            field2680 = null;
        }
        if (class3.field64 || class63.field1302 >= 500) {
            return;
        }
        class101.field2116[class63.field1302] = arg1;
        class101.field2135[class63.field1302] = arg6;
        class149.field3285[class63.field1302] = arg5;
        class57.field1149[class63.field1302] = arg3;
        class102.field2148[class63.field1302] = arg0;
        class135.field2947[class63.field1302] = arg2;
        class63.field1302++;
    }

    @OriginalMember(owner = "client!rc", name = "c", descriptor = "(B)V")
    public static void method984(byte arg0) {
        field2681 = null;
        field2683 = null;
        if (arg0 <= 54) {
            field2673 = null;
        }
        field2676 = null;
        field2684 = null;
        field2679 = null;
        field2677 = null;
        field2673 = null;
        field2680 = null;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(Lqb;IIII)V")
    public static final void method985(class113 arg0, int arg1, int arg2, int arg3, int arg4) {
        field2674++;
        if (class63.field1302 >= 400) {
            return;
        }
        if (arg0.field2470 != null) {
            arg0 = arg0.method932(true);
        }
        if (arg0 == null) {
            return;
        }
        if (arg1 > -44) {
            method985(null, -118, -128, -80, -63);
        }
        if (!arg0.field2465) {
            return;
        }
        class109 var5 = arg0.field2462;
        if (arg0.field2454 != 0) {
            var5 = class44.method405(new class109[] { var5, class125.method1012(arg0.field2454, class136.field2975.field1047, -10), class42.field895, class86.field1845, class143.method1132(arg0.field2454, 85), class24.field569 }, (byte) -74);
        }
        if (class135.field2936 == 1) {
            class109.field2285++;
            method983(arg4, class92.field1982, arg3, arg2, 48, 43, class44.method405(new class109[] { class20.field500, class115.field2567, var5 }, (byte) -74));
        } else if (!class139.field3031) {
            class109[] var6 = arg0.field2485;
            if (class119.field2651) {
                var6 = class61.method475((byte) 71, var6);
            }
            class55.field1116++;
            if (var6 != null) {
                for (int var7 = 4; var7 >= 0; var7--) {
                    if (var6[var7] != null && !var6[var7].method884(class25.field623, 119)) {
                        byte var8 = 0;
                        class27.field628++;
                        if (var7 == 0) {
                            var8 = 39;
                        }
                        if (var7 == 1) {
                            var8 = 48;
                        }
                        if (var7 == 2) {
                            var8 = 31;
                        }
                        if (var7 == 3) {
                            var8 = 38;
                        }
                        if (var7 == 4) {
                            var8 = 50;
                        }
                        method983(arg4, var6[var7], arg3, arg2, 48, var8, class44.method405(new class109[] { class8.field206, var5 }, (byte) -74));
                    }
                }
            }
            if (var6 != null) {
                for (int var9 = 4; var9 >= 0; var9--) {
                    if (var6[var9] != null && var6[var9].method884(class25.field623, 127)) {
                        int var10 = 0;
                        short var11 = 0;
                        class27.field634++;
                        if (class136.field2975.field1047 < arg0.field2454) {
                            var11 = 2000;
                        }
                        if (var9 == 0) {
                            var10 = var11 + 39;
                        }
                        if (var9 == 1) {
                            var10 = var11 + 48;
                        }
                        if (var9 == 2) {
                            var10 = var11 + 31;
                        }
                        if (var9 == 3) {
                            var10 = var11 + 38;
                        }
                        if (var9 == 4) {
                            var10 = var11 + 50;
                        }
                        method983(arg4, var6[var9], arg3, arg2, 48, var10, class44.method405(new class109[] { class8.field206, var5 }, (byte) -74));
                    }
                }
            }
            method983(arg4, class139.field3033, arg3, arg2, 48, 1007, class44.method405(new class109[] { class8.field206, var5 }, (byte) -74));
        } else if ((class18.field438 & 0x2) == 2) {
            method983(arg4, class123.field2698, arg3, arg2, 48, 36, class44.method405(new class109[] { class25.field621, class115.field2567, var5 }, (byte) -74));
            class78.field1641++;
        }
    }
}
