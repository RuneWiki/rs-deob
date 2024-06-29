import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!va")
public abstract class class135 {

    @OriginalMember(owner = "client!va", name = "e", descriptor = "Lrd;")
    public static class114 field3287 = class84.method656("(Y ", (byte) 124);

    @OriginalMember(owner = "client!va", name = "g", descriptor = "I")
    public static int field3289 = 0;

    @OriginalMember(owner = "client!va", name = "d", descriptor = "Ldd;")
    public static class26 field3286 = new class26(30);

    @OriginalMember(owner = "client!va", name = "i", descriptor = "Lrd;")
    public static class114 field3291 = class84.method656("Die Adresse dieses Computers wurde gesperrt)1", (byte) 119);

    @OriginalMember(owner = "client!va", name = "j", descriptor = "Z")
    public static boolean field3292 = false;

    @OriginalMember(owner = "client!va", name = "n", descriptor = "Lrd;")
    private static class114 field3296 = class84.method656("Accept challenge", (byte) 120);

    @OriginalMember(owner = "client!va", name = "m", descriptor = "Lrd;")
    public static class114 field3295 = field3296;

    @OriginalMember(owner = "client!va", name = "k", descriptor = "Lrd;")
    private static class114 field3293 = class84.method656("You have only just left another world)3", (byte) 126);

    @OriginalMember(owner = "client!va", name = "p", descriptor = "Lrd;")
    public static class114 field3298 = class84.method656("@whi@ )4 ", (byte) 119);

    @OriginalMember(owner = "client!va", name = "r", descriptor = "Lrd;")
    public static class114 field3300 = field3293;

    @OriginalMember(owner = "client!va", name = "h", descriptor = "Lrd;")
    private static class114 field3290 = class84.method656("Add ignore", (byte) 121);

    @OriginalMember(owner = "client!va", name = "o", descriptor = "Lrd;")
    public static class114 field3297 = field3290;

    @OriginalMember(owner = "client!va", name = "a", descriptor = "I")
    public static int field3283;

    @OriginalMember(owner = "client!va", name = "b", descriptor = "I")
    public static int field3284;

    @OriginalMember(owner = "client!va", name = "c", descriptor = "I")
    public static int field3285;

    @OriginalMember(owner = "client!va", name = "f", descriptor = "I")
    public static int field3288;

    @OriginalMember(owner = "client!va", name = "q", descriptor = "I")
    public static int field3299;

    @OriginalMember(owner = "client!va", name = "l", descriptor = "[Lhe;")
    public static class54[] field3294;

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(BI)V")
    public static final void method1105(byte arg0, int arg1) {
        field3285++;
        if (!class131.method1049(-62)) {
            return;
        }
        int var2 = -20 % ((arg0 - 60) / 54);
        if (class36.field726) {
            class13.field292 = arg1;
        } else {
            class49.method351((byte) 93, arg1);
        }
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(I)V")
    public static void method1106(int arg0) {
        field3298 = null;
        field3300 = null;
        field3297 = null;
        if (arg0 != 0) {
            field3294 = null;
        }
        field3287 = null;
        field3291 = null;
        field3290 = null;
        field3294 = null;
        field3293 = null;
        field3296 = null;
        field3295 = null;
        field3286 = null;
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(IIILtd;I)V")
    public static final void method1107(int arg0, int arg1, int arg2, class126 arg3, int arg4) {
        if (arg1 != 14) {
            return;
        }
        field3283++;
        if (class7.field103 == arg3 || class60.field1263 >= 400) {
            return;
        }
        class114 var5;
        if (arg3.field2992 == 0) {
            var5 = class101.method786((byte) 127, new class114[] { arg3.field3018, class26.method201(class7.field103.field3004, 7, arg3.field3004), class74.field1720, class107.field2477, class14.method113(arg3.field3004, -31766), class84.field1873 });
        } else {
            var5 = class101.method786((byte) 127, new class114[] { arg3.field3018, class74.field1720, class130.field3143, class14.method113(arg3.field2992, -31766), class84.field1873 });
        }
        if (class145.field3452 == 1) {
            class3.method10(arg2, class101.method786((byte) 126, new class114[] { class16.field319, class111.field2579, var5 }), arg0, (byte) 122, 14, class117.field2724, arg4);
            class145.field3461++;
        } else if (!class125.field2975) {
            for (int var6 = 4; var6 >= 0; var6--) {
                if (class116.field2716[var6] != null) {
                    short var8 = 0;
                    class48.field995++;
                    if (class116.field2716[var6].method886(class16.field326, true)) {
                        if (arg3.field3004 > class7.field103.field3004) {
                            var8 = 2000;
                        }
                        if (class7.field103.field2983 != 0 && arg3.field2983 != 0) {
                            if (class7.field103.field2983 == arg3.field2983) {
                                var8 = 2000;
                            } else {
                                var8 = 0;
                            }
                        }
                    } else if (class124.field2949[var6]) {
                        var8 = 2000;
                    }
                    int var9 = 0;
                    if (var6 == 0) {
                        var9 = var8 + 43;
                    }
                    if (var6 == 1) {
                        var9 = var8 + 26;
                    }
                    if (var6 == 2) {
                        var9 = var8 + 11;
                    }
                    if (var6 == 3) {
                        var9 = var8 + 34;
                    }
                    if (var6 == 4) {
                        var9 = var8 + 12;
                    }
                    class3.method10(arg2, class101.method786((byte) 126, new class114[] { class128.field3073, var5 }), arg0, (byte) 127, var9, class116.field2716[var6], arg4);
                }
            }
        } else if ((class22.field427 & 0x8) == 8) {
            class3.method10(arg2, class101.method786((byte) 125, new class114[] { class34.field683, class111.field2579, var5 }), arg0, (byte) 126, 16, class120.field2803, arg4);
            class107.field2466++;
        }
        for (int var7 = 0; var7 < class60.field1263; var7++) {
            if (class117.field2734[var7] == 19) {
                class123.field2878[var7] = class101.method786((byte) 125, new class114[] { class107.field2470, class64.field1374, class128.field3073, var5 });
                return;
            }
        }
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(ILjava/awt/Component;)V")
    public abstract void method730(int arg0, Component arg1);

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(Lmc;II)V")
    public static final void method1108(class83 arg0, int arg1, int arg2) {
        int var3 = arg1 >> 5;
        field3284++;
        class83 var4 = class132.field3183[var3];
        if (arg2 < 79) {
            field3287 = null;
        }
        if (var4 == null) {
            class104.field2416[var3] = arg0;
        } else {
            var4.field1857 = arg0;
        }
        class132.field3183[var3] = arg0;
        arg0.field1856 = arg1;
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(Z)I")
    public abstract int method728(boolean arg0);

    @OriginalMember(owner = "client!va", name = "b", descriptor = "(ILjava/awt/Component;)V")
    public abstract void method729(int arg0, Component arg1);

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(BLpb;)I")
    public static final int method1109(byte arg0, class100 arg1) {
        field3288++;
        int var2 = 0;
        if (arg1.method775((byte) -12, class77.field1761, class36.field760)) {
            var2++;
        }
        if (arg1.method775((byte) -99, class64.field1377, class36.field760)) {
            var2++;
        }
        if (arg1.method775((byte) -102, class72.field1596, class36.field760)) {
            var2++;
        }
        if (arg1.method775((byte) -47, class22.field432, class36.field760)) {
            var2++;
        }
        if (arg1.method775((byte) -25, class26.field524, class36.field760)) {
            var2++;
        }
        if (arg1.method775((byte) -15, class145.field3448, class36.field760)) {
            var2++;
        }
        if (arg1.method775((byte) -96, class32.field656, class36.field760)) {
            var2++;
        }
        if (arg1.method775((byte) -98, class140.field3340, class36.field760)) {
            var2++;
        }
        if (arg1.method775((byte) -96, class85.field1890, class36.field760)) {
            var2++;
        }
        if (arg1.method775((byte) -78, class103.field2402, class36.field760)) {
            var2++;
        }
        if (arg1.method775((byte) -101, class126.field2988, class36.field760)) {
            var2++;
        }
        if (arg1.method775((byte) -98, class100.field2297, class36.field760)) {
            var2++;
        }
        if (arg1.method775((byte) -24, class80.field1814, class36.field760)) {
            var2++;
        }
        if (arg1.method775((byte) -49, class66.field1433, class36.field760)) {
            var2++;
        }
        int var3 = -67 / ((-arg0 - 67) / 51);
        if (arg1.method775((byte) -53, class122.field2870, class36.field760)) {
            var2++;
        }
        if (arg1.method775((byte) -63, class18.field342, class36.field760)) {
            var2++;
        }
        if (arg1.method775((byte) -56, class143.field3408, class36.field760)) {
            var2++;
        }
        if (arg1.method775((byte) -103, class107.field2478, class36.field760)) {
            var2++;
        }
        if (arg1.method775((byte) -34, class78.field1779, class36.field760)) {
            var2++;
        }
        return var2;
    }
}
