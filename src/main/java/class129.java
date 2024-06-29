import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wb")
public class class129 extends class69 {

    @OriginalMember(owner = "client!wb", name = "z", descriptor = "Lo;")
    public static class84 field3136 = new class84();

    @OriginalMember(owner = "client!wb", name = "G", descriptor = "Lmc;")
    public static class75 field3143 = class30.method234(true, "(U5");

    @OriginalMember(owner = "client!wb", name = "K", descriptor = "Lmc;")
    private static class75 field3147 = class30.method234(true, "Your account has been disabled)3");

    @OriginalMember(owner = "client!wb", name = "D", descriptor = "I")
    public static int field3140 = 0;

    @OriginalMember(owner = "client!wb", name = "O", descriptor = "Lmc;")
    public static class75 field3151 = class30.method234(true, "scrollen:");

    @OriginalMember(owner = "client!wb", name = "N", descriptor = "Lmc;")
    public static class75 field3150 = field3147;

    @OriginalMember(owner = "client!wb", name = "M", descriptor = "Lmc;")
    private static class75 field3149 = class30.method234(true, "Hidden");

    @OriginalMember(owner = "client!wb", name = "E", descriptor = "Lmc;")
    public static class75 field3141 = field3149;

    @OriginalMember(owner = "client!wb", name = "H", descriptor = "I")
    public static int field3144 = 0;

    @OriginalMember(owner = "client!wb", name = "P", descriptor = "Z")
    public static boolean field3152 = false;

    @OriginalMember(owner = "client!wb", name = "Q", descriptor = "Lmc;")
    public static class75 field3153 = class30.method234(true, "Verbindung mit Freunde)2Server)3)3)3");

    @OriginalMember(owner = "client!wb", name = "v", descriptor = "I")
    public static int field3132;

    @OriginalMember(owner = "client!wb", name = "x", descriptor = "I")
    public static int field3134;

    @OriginalMember(owner = "client!wb", name = "y", descriptor = "I")
    public static int field3135;

    @OriginalMember(owner = "client!wb", name = "B", descriptor = "I")
    public static int field3138;

    @OriginalMember(owner = "client!wb", name = "C", descriptor = "I")
    public static int field3139;

    @OriginalMember(owner = "client!wb", name = "I", descriptor = "I")
    public static int field3145;

    @OriginalMember(owner = "client!wb", name = "L", descriptor = "I")
    public static int field3148;

    @OriginalMember(owner = "client!wb", name = "w", descriptor = "Lwb;")
    public class129 field3133;

    @OriginalMember(owner = "client!wb", name = "A", descriptor = "Lwb;")
    public class129 field3137;

    @OriginalMember(owner = "client!wb", name = "F", descriptor = "Lpa;")
    public static class91 field3142;

    @OriginalMember(owner = "client!wb", name = "J", descriptor = "[Laa;")
    public static class2[] field3146;

    @OriginalMember(owner = "client!wb", name = "c", descriptor = "(I)V", line = 10)
    public final void method1010(int arg0) {
        field3135++;
        if (this.field3133 == null) {
            return;
        }
        this.field3133.field3137 = this.field3137;
        this.field3137.field3133 = this.field3133;
        this.field3133 = null;
        this.field3137 = null;
        if (arg0 != -22056) {
            method1012(-105);
        }
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(II)V", line = 30)
    public static final void method1011(int arg0, int arg1) {
        field3132++;
        if (arg1 != 0) {
            method1014(56);
        }
        class99.method829(arg1 ^ 0xFFFF8A05);
        int var2 = class69.method588((byte) -50, arg0).field2939;
        if (var2 == 0) {
            return;
        }
        int var3 = class62.field1613[arg0];
        if (var2 == 1) {
            if (var3 == 1) {
                class49.method375(0.9D);
                ((class16) class49.field1192).method111(arg1 + 124, 0.9D);
            }
            if (var3 == 2) {
                class49.method375(0.8D);
                ((class16) class49.field1192).method111(-118, 0.8D);
            }
            if (var3 == 3) {
                class49.method375(0.7D);
                ((class16) class49.field1192).method111(111, 0.7D);
            }
            if (var3 == 4) {
                class49.method375(0.6D);
                ((class16) class49.field1192).method111(23, 0.6D);
            }
            class61.method523(-128);
            class110.field2780 = true;
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
            if (class27.field574 != var4) {
                if (class27.field574 == 0 && class130.field3172 != -1) {
                    class117.method937(class130.field3172, 0, true, false, class10.field224, 0, var4);
                    class70.field1776 = 0;
                } else if (var4 == 0) {
                    class117.method934(arg1 + 19);
                    class70.field1776 = 0;
                } else {
                    class84.method700(1540, var4);
                }
                class27.field574 = var4;
            }
        }
        if (var2 == 8) {
            class35.field841 = true;
            class28.field595 = var3;
        }
        if (var2 == 9) {
            class24.field462 = var3;
        }
        if (var2 == 4) {
            if (var3 == 0) {
                class75.field1893 = 127;
            }
            if (var3 == 1) {
                class75.field1893 = 96;
            }
            if (var3 == 2) {
                class75.field1893 = 64;
            }
            if (var3 == 3) {
                class75.field1893 = 32;
            }
            if (var3 == 4) {
                class75.field1893 = 0;
            }
        }
        if (var2 == 5) {
            class78.field1966 = var3;
        }
        if (var2 == 6) {
            class31.field700 = var3;
        }
    }

    @OriginalMember(owner = "client!wb", name = "d", descriptor = "(I)V", line = 168)
    public static final void method1012(int arg0) {
        field3139++;
        if (arg0 != 0) {
            method1011(89, -92);
        }
        if (class90.field2208 != null) {
            class126 var1 = class90.field2208;
            synchronized (class90.field2208) {
                class90.field2208 = null;
            }
        }
    }

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "(II)Z", line = 185)
    public static final boolean method1013(int arg0, int arg1) {
        field3148++;
        if (class104.field2632[arg0]) {
            return true;
        } else if (class122.field3012.method446(arg0, 0)) {
            int var2 = class122.field3012.method430(arg1 + 24095, arg0);
            if (~var2 == arg1) {
                class104.field2632[arg0] = true;
                return true;
            }
            if (class74.field1854[arg0] == null) {
                class74.field1854[arg0] = new class99[var2];
            }
            for (int var3 = 0; var3 < var2; var3++) {
                if (class74.field1854[arg0][var3] == null) {
                    byte[] var4 = class122.field3012.method436(var3, arg1 + 6, arg0);
                    if (var4 != null) {
                        class74.field1854[arg0][var3] = new class99();
                        class74.field1854[arg0][var3].method826(arg1 ^ 0x4, new class61(var4));
                    }
                }
            }
            class104.field2632[arg0] = true;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!wb", name = "e", descriptor = "(I)V", line = 253)
    public static void method1014(int arg0) {
        field3149 = null;
        field3150 = null;
        field3136 = null;
        field3143 = null;
        field3141 = null;
        field3153 = null;
        field3147 = null;
        field3151 = null;
        field3146 = null;
        if (arg0 != 0) {
            field3141 = null;
        }
        field3142 = null;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(II[Lmc;Z)Lmc;", line = 298)
    public static final class75 method1015(int arg0, int arg1, class75[] arg2, boolean arg3) {
        field3134++;
        int var4 = 0;
        for (int var5 = 0; var5 < arg0; var5++) {
            if (arg2[arg1 + var5] == null) {
                arg2[arg1 + var5] = class17.field359;
            }
            var4 += arg2[arg1 + var5].field1869;
        }
        byte[] var6 = new byte[var4];
        int var7 = 0;
        for (int var8 = 0; var8 < arg0; var8++) {
            class75 var10 = arg2[arg1 + var8];
            class53.method407(var10.field1912, 0, var6, var7, var10.field1869);
            var7 += var10.field1869;
        }
        if (arg3) {
            return null;
        } else {
            class75 var9 = new class75();
            var9.field1912 = var6;
            var9.field1869 = var4;
            return var9;
        }
    }
}
