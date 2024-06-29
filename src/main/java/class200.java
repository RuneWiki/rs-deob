import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qk")
public class class200 {

    @OriginalMember(owner = "client!qk", name = "f", descriptor = "I")
    public static int field3557 = 0;

    @OriginalMember(owner = "client!qk", name = "h", descriptor = "I")
    public static int field3559 = 0;

    @OriginalMember(owner = "client!qk", name = "b", descriptor = "I")
    public static int field3553;

    @OriginalMember(owner = "client!qk", name = "c", descriptor = "I")
    public static int field3554;

    @OriginalMember(owner = "client!qk", name = "d", descriptor = "I")
    public static int field3555;

    @OriginalMember(owner = "client!qk", name = "e", descriptor = "I")
    public static int field3556;

    @OriginalMember(owner = "client!qk", name = "i", descriptor = "I")
    public static int field3560;

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "[I")
    public static int[] field3552;

    @OriginalMember(owner = "client!qk", name = "g", descriptor = "[I")
    public static int[] field3558;

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(Z)V")
    public static final void method1410(boolean arg0) {
        class182.field3167++;
        class153.field2747.method978(-128, 178);
        field3556++;
        for (class150 var1 = (class150) client.field2708.method392(0); var1 != null; var1 = (class150) client.field2708.method390(-1)) {
            if (var1.field2678 == 0) {
                class265.method1835(arg0, var1, true);
            }
        }
        if (class265.field4706 != null) {
            class92.method777((byte) -65, class265.field4706);
            class265.field4706 = null;
        }
        if (arg0) {
            field3557 = 71;
        }
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(I)V")
    public static final void method1411(int arg0) {
        class168.field2977 = null;
        class84.field1487 = null;
        class85.field1495 = 0;
        class151.field2682 = null;
        class243.field4164 = null;
        class229.field3949 = null;
        field3554++;
        class169.field2990 = null;
        class125.field2192 = null;
        class54.field940 = null;
        class6.field87 = null;
        class28.field519 = null;
        class114.field2041 = null;
        class141.field2534.method837(-26215);
        class249.field4412 = null;
        class153.field2740 = null;
        class246.field4379 = null;
        class5.field71 = null;
        if (arg0 > -56) {
            field3557 = -117;
        }
        class96.field1732 = null;
        class260.field4627 = null;
        class259.field4583 = null;
        class75.field1371 = null;
        class112.field2006 = null;
        class124.field2172 = null;
    }

    @OriginalMember(owner = "client!qk", name = "b", descriptor = "(I)V")
    public static final void method1412(int arg0) {
        int var1 = 88 / ((28 - arg0) / 42);
        for (int var2 = 0; var2 < 5; var2++) {
            class223.field3828[var2] = false;
        }
        class33.field616 = -1;
        field3560++;
        class229.field3948 = 1;
        class202.field3572 = -1;
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(Lfk;Z)V")
    public static final void method1413(class14 arg0, boolean arg1) {
        field3555++;
        if (arg0.field269.length - arg0.field318 < 1) {
            return;
        }
        int var2 = arg0.method200(255);
        if (var2 < 0 || var2 > 7) {
            return;
        }
        byte var3;
        if (var2 == 7) {
            var3 = 29;
        } else if (var2 == 6) {
            var3 = 28;
        } else if (var2 == 5) {
            var3 = 28;
        } else if (var2 == 4) {
            var3 = 24;
        } else if (var2 == 3) {
            var3 = 23;
        } else if (var2 == 2) {
            var3 = 22;
        } else if (var2 == 1) {
            var3 = 23;
        } else {
            var3 = 19;
        }
        if ((arg0.field269.length - arg0.field318) < var3) {
            return;
        }
        class196.field3510 = arg0.method200(255);
        if (class196.field3510 < 1) {
            class196.field3510 = 1;
        } else if (class196.field3510 > 4) {
            class196.field3510 = 4;
        }
        class123.method959(1, arg0.method200(255) == 1);
        class42.field774 = arg0.method200(255) == 1;
        class123.field2163 = arg0.method200(255) == 1;
        class191.field3372 = arg0.method200(255) == 1;
        if (arg1) {
            return;
        }
        class154.field2748 = arg0.method200(255) == 1;
        class249.field4425 = arg0.method200(255) == 1;
        class99.field1833 = arg0.method200(255) == 1;
        class263.field4672 = arg0.method200(255) == 1;
        class206.field3633 = arg0.method200(255);
        if (class206.field3633 > 2) {
            class206.field3633 = 2;
        }
        if (var2 < 2) {
            class8.field126 = arg0.method200(255) == 1;
            arg0.method200(255);
        } else {
            class8.field126 = arg0.method200(255) == 1;
        }
        class47.field837 = arg0.method200(255) == 1;
        class246.field4377 = arg0.method200(255) == 1;
        class23.field437 = arg0.method200(255);
        if (class23.field437 > 2) {
            class23.field437 = 2;
        }
        class127.field2228 = arg0.method200(255) == 1;
        class97.field1790 = arg0.method200(255);
        if (class97.field1790 > 127) {
            class97.field1790 = 127;
        }
        class16.field365 = arg0.method200(255);
        class231.field4020 = arg0.method200(255);
        if (class231.field4020 > 127) {
            class231.field4020 = 127;
        }
        if (var2 >= 1) {
            class154.field2749 = arg0.method161(4);
            class16.field371 = arg0.method161(4);
        }
        if (var2 >= 3 && var2 < 6) {
            arg0.method200(255);
        }
        if (var2 >= 4) {
            arg0.method200(255);
        }
        if (var2 >= 5) {
            class8.field129 = arg0.method187((byte) 61);
        }
        if (var2 >= 6) {
            class190.field3354 = arg0.method200(255);
        }
        if (var2 >= 7) {
            class18.field404 = arg0.method200(255) == 1;
        }
    }

    @OriginalMember(owner = "client!qk", name = "c", descriptor = "(I)V")
    public static void method1414(int arg0) {
        field3558 = null;
        field3552 = null;
        int var1 = -10 % ((-arg0 - 60) / 51);
    }
}
