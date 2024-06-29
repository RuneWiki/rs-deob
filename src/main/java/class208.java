import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!u")
public class class208 extends class132 {

    @OriginalMember(owner = "client!u", name = "u", descriptor = "[I")
    public int[] field3865 = new int[1];

    @OriginalMember(owner = "client!u", name = "x", descriptor = "[I")
    public int[] field3868 = new int[] { -1 };

    @OriginalMember(owner = "client!u", name = "y", descriptor = "Lvd;")
    public static class222 field3869 = class212.method1357("Benutzeroberfl-=che geladen)3", 10731);

    @OriginalMember(owner = "client!u", name = "s", descriptor = "Lwd;")
    public static class232 field3863 = new class232(8);

    @OriginalMember(owner = "client!u", name = "D", descriptor = "Lvd;")
    public static class222 field3873 = class212.method1357("Bitte starten Sie eine Mitgliedschaft", 10731);

    @OriginalMember(owner = "client!u", name = "F", descriptor = "I")
    public static int field3875 = 1;

    @OriginalMember(owner = "client!u", name = "E", descriptor = "Lvd;")
    public static class222 field3874 = class212.method1357("Gegenstand f-Ur Mitglieder", 10731);

    @OriginalMember(owner = "client!u", name = "G", descriptor = "I")
    public static int field3876 = 0;

    @OriginalMember(owner = "client!u", name = "B", descriptor = "Lvd;")
    public static class222 field3872 = class212.method1357("k", 10731);

    @OriginalMember(owner = "client!u", name = "t", descriptor = "I")
    public static int field3864;

    @OriginalMember(owner = "client!u", name = "v", descriptor = "I")
    public static int field3866;

    @OriginalMember(owner = "client!u", name = "w", descriptor = "I")
    public static int field3867;

    @OriginalMember(owner = "client!u", name = "z", descriptor = "I")
    public static int field3870;

    @OriginalMember(owner = "client!u", name = "A", descriptor = "[[[B")
    public static byte[][][] field3871;

    @OriginalMember(owner = "client!u", name = "b", descriptor = "(B)V")
    public static void method1333(byte arg0) {
        field3872 = null;
        if (arg0 != 80) {
            return;
        }
        field3863 = null;
        field3873 = null;
        field3871 = null;
        field3874 = null;
        field3869 = null;
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(Lve;IILs;)V")
    public static final void method1334(class223 arg0, int arg1, int arg2, class188 arg3) {
        class174 var4 = new class174();
        var4.field3264 = arg0;
        field3867++;
        var4.field3268 = arg3;
        var4.field2555 = arg1;
        if (arg2 < 58) {
            return;
        }
        var4.field3267 = 1;
        class28 var5 = class185.field3420;
        synchronized (class185.field3420) {
            class185.field3420.method235(var4, true);
        }
        class197.method1210((byte) 87);
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(Lab;III)[Lbg;")
    public static final class19[] method1335(class3 arg0, int arg1, int arg2, int arg3) {
        field3866++;
        if (class47.method344(arg0, arg2, 91, arg3)) {
            int var4 = 108 % ((arg1 - 29) / 44);
            return class151.method977(12502);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(II)V")
    public static final void method1336(int arg0, int arg1) {
        field3864++;
        class162.method1017(7951);
        if (arg1 != -135) {
            method1335(null, -27, -128, -89);
        }
        class9.method90(arg1 ^ 0x86);
        int var2 = class191.method1190((byte) 18, arg0).field990;
        if (var2 == 0) {
            return;
        }
        int var3 = class93.field1751[arg0];
        if (var2 == 1) {
            class201.field3679 = var3;
            if (class201.field3679 == 1) {
                class199.method1273(0.9F);
            }
            if (class201.field3679 == 2) {
                class199.method1273(0.8F);
            }
            if (class201.field3679 == 3) {
                class199.method1273(0.7F);
            }
            if (class201.field3679 == 4) {
                class199.method1273(0.6F);
            }
            class97.method611(-69);
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
            if (class25.field567 != var4) {
                if (class25.field567 == 0 && class192.field3537 != -1) {
                    class109.method713((byte) -124, var4, false, class192.field3537, 0, class187.field3466);
                    class176.field3293 = false;
                } else if (var4 == 0) {
                    class43.method323((byte) -51);
                    class176.field3293 = false;
                } else {
                    class153.method985((byte) -39, var4);
                }
                class25.field567 = var4;
            }
        }
        if (var2 == 9) {
            class67.field1265 = var3;
        }
        if (var2 == 5) {
            class155.field2952 = var3;
        }
        if (var2 == 10) {
            if (var3 == 0) {
                class210.field3904 = 127;
            }
            if (var3 == 1) {
                class210.field3904 = 96;
            }
            if (var3 == 2) {
                class210.field3904 = 64;
            }
            if (var3 == 3) {
                class210.field3904 = 32;
            }
            if (var3 == 4) {
                class210.field3904 = 0;
            }
        }
        if (var2 == 4) {
            if (var3 == 0) {
                class134.field2585 = 127;
            }
            if (var3 == 1) {
                class134.field2585 = 96;
            }
            if (var3 == 2) {
                class134.field2585 = 64;
            }
            if (var3 == 3) {
                class134.field2585 = 32;
            }
            if (var3 == 4) {
                class134.field2585 = 0;
            }
        }
        if (var2 == 6) {
            class128.field2469 = var3;
        }
    }
}
