import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kc")
public class class99 extends class12 {

    @OriginalMember(owner = "client!kc", name = "V", descriptor = "I")
    private int field1851;

    @OriginalMember(owner = "client!kc", name = "S", descriptor = "Ltg;")
    private static class184 field1848 = class135.method812("The server is being updated)3", 3);

    @OriginalMember(owner = "client!kc", name = "Q", descriptor = "Ltg;")
    public static class184 field1846 = field1848;

    @OriginalMember(owner = "client!kc", name = "P", descriptor = "Ltg;")
    private static class184 field1845 = class135.method812(" has logged in)3", 3);

    @OriginalMember(owner = "client!kc", name = "T", descriptor = "[Z")
    public static boolean[] field1849 = new boolean[100];

    @OriginalMember(owner = "client!kc", name = "Z", descriptor = "Ltg;")
    private static class184 field1855 = class135.method812("Press (Wrecover a locked account(W on front page)3", 3);

    @OriginalMember(owner = "client!kc", name = "O", descriptor = "[Ltd;")
    public static class181[] field1844 = new class181[4];

    @OriginalMember(owner = "client!kc", name = "W", descriptor = "Ltg;")
    public static class184 field1852 = field1855;

    @OriginalMember(owner = "client!kc", name = "X", descriptor = "Ltg;")
    private static class184 field1853 = class135.method812(" seconds)3", 3);

    @OriginalMember(owner = "client!kc", name = "U", descriptor = "Ltg;")
    public static class184 field1850 = field1853;

    @OriginalMember(owner = "client!kc", name = "cb", descriptor = "Ltg;")
    public static class184 field1858 = field1845;

    @OriginalMember(owner = "client!kc", name = "N", descriptor = "I")
    public static int field1843;

    @OriginalMember(owner = "client!kc", name = "R", descriptor = "I")
    public static int field1847;

    @OriginalMember(owner = "client!kc", name = "Y", descriptor = "I")
    public static int field1854;

    @OriginalMember(owner = "client!kc", name = "ab", descriptor = "I")
    public static int field1856;

    @OriginalMember(owner = "client!kc", name = "bb", descriptor = "I")
    public static int field1857;

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(Lka;IZ)V")
    public final void method59(class97 arg0, int arg1, boolean arg2) {
        if (arg2) {
            field1845 = null;
        }
        ++field1847;
        if (arg1 == 0) {
            this.field1851 = (arg0.method588((byte) -125) << 12) / 255;
        }
    }

    @OriginalMember(owner = "client!kc", name = "f", descriptor = "(I)V")
    public static void method618(int arg0) {
        field1845 = null;
        field1844 = null;
        field1849 = null;
        field1852 = null;
        field1848 = null;
        field1850 = null;
        field1858 = null;
        if (arg0 != 0) {
            method618(-76);
        }
        field1853 = null;
        field1855 = null;
        field1846 = null;
    }

    @OriginalMember(owner = "client!kc", name = "<init>", descriptor = "(I)V")
    private class99(int arg0) {
        super(0, true);
        this.field1851 = 4096;
        this.field1851 = arg0;
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(IB)[I")
    public final int[] method62(int arg0, byte arg1) {
        ++field1843;
        int[] var3 = super.field224.method7((byte) 96, arg0);
        if (super.field224.field53) {
            class93.method536(var3, 0, class201.field3889, this.field1851);
        }
        if (arg1 != 17) {
            method620(32, -117);
        }
        return var3;
    }

    @OriginalMember(owner = "client!kc", name = "e", descriptor = "(III)I")
    public static final int method619(int arg0, int arg1, int arg2) {
        int var3 = 92 % ((-46 - arg0) / 50);
        ++field1857;
        int var4 = arg1 + -1 & arg2 >> 31;
        return ((arg2 >>> 31) + arg2) % arg1 - -var4;
    }

    @OriginalMember(owner = "client!kc", name = "<init>", descriptor = "()V")
    public class99() {
        this(4096);
    }

    @OriginalMember(owner = "client!kc", name = "c", descriptor = "(II)V")
    public static final void method620(int arg0, int arg1) {
        class154.method936(arg0 ^ 65538);
        class194.method1232((byte) 26);
        int var2 = class58.method313(arg1, 84).field1984;
        ++field1854;
        if (var2 != 0) {
            int var3 = class94.field1710[arg1];
            if (arg0 != 2) {
                method619(-48, -100, 8);
            }
            if (~var2 == -2) {
                class172.field3262 = var3;
                if (class172.field3262 == 1) {
                    class23.method155(0.9F);
                }
                if (class172.field3262 == 2) {
                    class23.method155(0.8F);
                }
                if (class172.field3262 == 3) {
                    class23.method155(0.7F);
                }
                if (class172.field3262 == 4) {
                    class23.method155(0.6F);
                }
                class106.method662(11882);
            }
            if (~var2 == -4) {
                short var4 = 0;
                if (~var3 == -1) {
                    var4 = 255;
                }
                if (var3 == 1) {
                    var4 = 192;
                }
                if (var3 == 2) {
                    var4 = 128;
                }
                if (~var3 == -4) {
                    var4 = 64;
                }
                if (~var3 == -5) {
                    var4 = 0;
                }
                if (~class136.field2480 != ~var4) {
                    if (~class136.field2480 == -1 && class7.field131 != -1) {
                        class196.method1245(0, -123, false, class7.field131, class180.field3427, var4);
                        class159.field2856 = false;
                    } else if (var4 != 0) {
                        class60.method334(var4, -115);
                    } else {
                        class190.method1218((byte) 106);
                        class159.field2856 = false;
                    }
                    class136.field2480 = var4;
                }
            }
            if (var2 == 5) {
                class43.field822 = var3;
            }
            if (~var2 == -11) {
                if (~var3 == -1) {
                    class170.field3230 = 127;
                }
                if (~var3 == -2) {
                    class170.field3230 = 96;
                }
                if (var3 == 2) {
                    class170.field3230 = 64;
                }
                if (~var3 == -4) {
                    class170.field3230 = 32;
                }
                if (var3 == 4) {
                    class170.field3230 = 0;
                }
            }
            if (var2 == 9) {
                class162.field2915 = var3;
            }
            if (~var2 == -7) {
                class55.field979 = var3;
            }
            if (var2 == 4) {
                if (var3 == 0) {
                    class19.field353 = 127;
                }
                if (var3 == 1) {
                    class19.field353 = 96;
                }
                if (var3 == 2) {
                    class19.field353 = 64;
                }
                if (var3 == 3) {
                    class19.field353 = 32;
                }
                if (~var3 == -5) {
                    class19.field353 = 0;
                    return;
                }
            }
        }
    }
}
