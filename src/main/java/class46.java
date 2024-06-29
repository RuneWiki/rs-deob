import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gm")
public class class46 {

    @OriginalMember(owner = "client!gm", name = "c", descriptor = "Lce;")
    public static class126 field708 = class206.method1445(-7923, " est d-Bj-9 dans votre liste noire)3");

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "Lce;")
    private static class126 field706 = class206.method1445(-7923, "Please remove ");

    @OriginalMember(owner = "client!gm", name = "f", descriptor = "Lce;")
    public static class126 field711 = field706;

    @OriginalMember(owner = "client!gm", name = "b", descriptor = "Lce;")
    public static class126 field707 = class206.method1445(-7923, "Spielwelt erstellt)3");

    @OriginalMember(owner = "client!gm", name = "g", descriptor = "Z")
    public static boolean field712 = false;

    @OriginalMember(owner = "client!gm", name = "i", descriptor = "Lce;")
    public static class126 field714 = field706;

    @OriginalMember(owner = "client!gm", name = "k", descriptor = "Lce;")
    public static class126 field716 = class206.method1445(-7923, "sch-Utteln:");

    @OriginalMember(owner = "client!gm", name = "o", descriptor = "Lce;")
    public static class126 field720 = class206.method1445(-7923, "overlay2");

    @OriginalMember(owner = "client!gm", name = "l", descriptor = "Lwd;")
    public static class112 field717 = null;

    @OriginalMember(owner = "client!gm", name = "d", descriptor = "I")
    public static int field709;

    @OriginalMember(owner = "client!gm", name = "e", descriptor = "I")
    public static int field710;

    @OriginalMember(owner = "client!gm", name = "h", descriptor = "I")
    public static int field713;

    @OriginalMember(owner = "client!gm", name = "j", descriptor = "I")
    public static int field715;

    @OriginalMember(owner = "client!gm", name = "m", descriptor = "I")
    public static int field718;

    @OriginalMember(owner = "client!gm", name = "n", descriptor = "I")
    public static int field719;

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(BIIIZI)V", line = 11)
    public static final void method283(byte arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        if (arg2 < 1) {
            arg2 = 1;
        }
        field718++;
        if (arg3 < 1) {
            arg3 = 1;
        }
        if (class56.field846) {
            int var6 = arg2 - 334;
            if (var6 < 0) {
                var6 = 0;
            } else if (var6 > 100) {
                var6 = 100;
            }
            int var7 = (class11.field152 - class107.field1690) * var6 / 100 + class107.field1690;
            if (class192.field3282 > var7) {
                var7 = class192.field3282;
            } else if (class255.field4296 < var7) {
                var7 = class255.field4296;
            }
            int var8 = arg2 * 512 * var7 / (arg3 * 334);
            if (class50.field780 > var8) {
                short var12 = class50.field780;
                var7 = arg3 * var12 * 334 / (arg2 * 512);
                if (class255.field4296 < var7) {
                    var7 = class255.field4296;
                    int var13 = arg2 * var7 * 512 / (var12 * 334);
                    int var14 = (arg3 - var13) / 2;
                    if (arg4) {
                        class101.method682();
                        class101.method689(arg5, arg1, var14, arg2, 0);
                        class101.method689(arg5 - (var14 - arg3), arg1, var14, arg2, 0);
                    }
                    arg5 += var14;
                    arg3 -= var14 * 2;
                }
            } else if (var8 > class76.field1238) {
                short var9 = class76.field1238;
                var7 = var9 * 334 * arg3 / (arg2 * 512);
                if (var7 < class192.field3282) {
                    var7 = class192.field3282;
                    int var10 = arg3 * var9 * 334 / (var7 * 512);
                    int var11 = (arg2 - var10) / 2;
                    if (arg4) {
                        class101.method682();
                        class101.method689(arg5, arg1, arg3, var11, 0);
                        class101.method689(arg5, arg1 - (var11 - arg2), arg3, var11, 0);
                    }
                    arg2 -= var11 * 2;
                    arg1 += var11;
                }
            }
            class24.field350 = arg2 * var7 / 334;
        }
        class292.field4837 = arg1;
        class157.field2823 = (short) arg3;
        class255.field4291 = (short) arg2;
        class212.field3614 = arg5;
        if (arg0 <= 117) {
            method285(-56, 87, false);
        }
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(I)V", line = 110)
    public static final void method284(int arg0) {
        if (arg0 >= 59) {
            class51.method325(0, 0, 26604);
            field719++;
        }
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(IIZ)I", line = 134)
    public static final int method285(int arg0, int arg1, boolean arg2) {
        int var3 = 1;
        field713++;
        while (arg0 > 1) {
            if ((arg0 & 0x1) != 0) {
                var3 = arg1 * var3;
            }
            arg1 *= arg1;
            arg0 >>= 0x1;
        }
        if (!arg2) {
            field712 = true;
        }
        if (arg0 == 1) {
            return arg1 * var3;
        } else {
            return var3;
        }
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(B)V", line = 167)
    public static void method286(byte arg0) {
        field717 = null;
        field706 = null;
        field714 = null;
        if (arg0 != 21) {
            method284(-68);
        }
        field720 = null;
        field708 = null;
        field716 = null;
        field711 = null;
        field707 = null;
    }

    @OriginalMember(owner = "client!gm", name = "b", descriptor = "(B)I", line = 191)
    public static final int method287(byte arg0) {
        field709++;
        if (arg0 > -72) {
            method283((byte) 38, -17, 43, 28, true, 42);
        }
        return class224.field3787 == 0 ? 0 : class24.field351[class224.field3787].method19();
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(ZIZI)I", line = 217)
    public static final int method288(boolean arg0, int arg1, boolean arg2, int arg3) {
        field715++;
        class192 var4 = (class192) class95.field1496.method1631(arg0, (long) arg3);
        if (var4 == null) {
            return 0;
        }
        int var5 = 0;
        for (int var6 = 0; var6 < var4.field3281.length; var6++) {
            if (var4.field3281[var6] >= 0 && class68.field1118 > var4.field3281[var6]) {
                class137 var7 = class68.method498(111, var4.field3281[var6]);
                if (var7.field2408 != null) {
                    class27 var8 = (class27) var7.field2408.method1631(arg0, (long) arg1);
                    if (var8 != null) {
                        if (arg2) {
                            var5 += var4.field3278[var6] * var8.field383;
                        } else {
                            var5 += var8.field383;
                        }
                    }
                }
            }
        }
        return var5;
    }
}
