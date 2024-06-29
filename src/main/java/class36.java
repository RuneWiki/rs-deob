import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fk")
public class class36 extends class28 {

    @OriginalMember(owner = "client!fk", name = "V", descriptor = "Lvf;")
    private class265 field844 = class5.field69;

    @OriginalMember(owner = "client!fk", name = "I", descriptor = "[I")
    public static int[] field832 = new int[1000];

    @OriginalMember(owner = "client!fk", name = "N", descriptor = "Lvf;")
    private static class265 field837 = class87.method582(-46, "wave2:");

    @OriginalMember(owner = "client!fk", name = "K", descriptor = "[Lng;")
    public static class135[] field834 = new class135[2048];

    @OriginalMember(owner = "client!fk", name = "G", descriptor = "Lvf;")
    private static class265 field830 = class87.method582(-46, "wishes to trade with you)3");

    @OriginalMember(owner = "client!fk", name = "H", descriptor = "Lvf;")
    public static class265 field831 = field837;

    @OriginalMember(owner = "client!fk", name = "W", descriptor = "Lvf;")
    public static class265 field845 = field830;

    @OriginalMember(owner = "client!fk", name = "T", descriptor = "Z")
    public static boolean field843 = false;

    @OriginalMember(owner = "client!fk", name = "O", descriptor = "Z")
    public static boolean field838 = false;

    @OriginalMember(owner = "client!fk", name = "ab", descriptor = "Lvf;")
    public static class265 field849 = class87.method582(-46, "weiss:");

    @OriginalMember(owner = "client!fk", name = "S", descriptor = "I")
    public static int field842 = -1;

    @OriginalMember(owner = "client!fk", name = "Z", descriptor = "Lvf;")
    public static class265 field848 = field837;

    @OriginalMember(owner = "client!fk", name = "ib", descriptor = "I")
    public static int field857 = 0;

    @OriginalMember(owner = "client!fk", name = "J", descriptor = "I")
    private int field833;

    @OriginalMember(owner = "client!fk", name = "L", descriptor = "I")
    public static int field835;

    @OriginalMember(owner = "client!fk", name = "M", descriptor = "I")
    public static int field836;

    @OriginalMember(owner = "client!fk", name = "P", descriptor = "I")
    public static int field839;

    @OriginalMember(owner = "client!fk", name = "Q", descriptor = "I")
    public static int field840;

    @OriginalMember(owner = "client!fk", name = "R", descriptor = "I")
    public static int field841;

    @OriginalMember(owner = "client!fk", name = "X", descriptor = "I")
    public static int field846;

    @OriginalMember(owner = "client!fk", name = "Y", descriptor = "I")
    public int field847;

    @OriginalMember(owner = "client!fk", name = "bb", descriptor = "I")
    public static int field850;

    @OriginalMember(owner = "client!fk", name = "db", descriptor = "I")
    public static int field852;

    @OriginalMember(owner = "client!fk", name = "eb", descriptor = "I")
    public static int field853;

    @OriginalMember(owner = "client!fk", name = "gb", descriptor = "I")
    public static int field855;

    @OriginalMember(owner = "client!fk", name = "hb", descriptor = "I")
    public int field856;

    @OriginalMember(owner = "client!fk", name = "cb", descriptor = "Lak;")
    private class269 field851;

    @OriginalMember(owner = "client!fk", name = "fb", descriptor = "Lak;")
    public class269 field854;

    @OriginalMember(owner = "client!fk", name = "d", descriptor = "(I)V")
    private final void method302(int arg0) {
        if (arg0 != 2) {
            field831 = null;
        }
        this.field851 = new class269(this.field854.method1841(false));
        field835++;
        for (class93 var2 = (class93) this.field854.method1851(false); var2 != null; var2 = (class93) this.field854.method1847(false)) {
            class4 var3 = new class4(var2.field1654, (int) var2.field393);
            this.field851.method1838(var2.field1654.method1786((byte) 123), var3, (byte) 8);
        }
    }

    @OriginalMember(owner = "client!fk", name = "e", descriptor = "(I)V")
    private final void method303(int arg0) {
        this.field851 = new class269(this.field854.method1841(false));
        if (arg0 != -1) {
            return;
        }
        for (class203 var2 = (class203) this.field854.method1851(false); var2 != null; var2 = (class203) this.field854.method1847(false)) {
            class203 var3 = new class203((int) var2.field393);
            this.field851.method1838((long) var2.field3640, var3, (byte) 8);
        }
        field853++;
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(IB)Lvf;")
    public final class265 method304(int arg0, byte arg1) {
        field850++;
        if (this.field854 == null) {
            return this.field844;
        }
        class93 var3 = (class93) this.field854.method1842(-1, (long) arg0);
        if (var3 == null) {
            return this.field844;
        } else {
            if (arg1 >= -56) {
                this.method302(20);
            }
            return var3.field1654;
        }
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(Lng;I)V")
    public final void method305(class135 arg0, int arg1) {
        if (arg1 != 2) {
            this.method308(-25, 41, (class135) null);
        }
        field840++;
        while (true) {
            int var3 = arg0.method920((byte) 46);
            if (var3 == 0) {
                return;
            }
            this.method308(arg1 ^ 0xFFFFFFEA, var3, arg0);
        }
    }

    @OriginalMember(owner = "client!fk", name = "d", descriptor = "(B)V")
    public static final void method306(byte arg0) {
        field841++;
        int var1 = class186.field3364 + class214.field3827.field2600;
        int var2 = class277.field4897 + class214.field3827.field2564;
        if ((class169.field3067 - var1) < -500 || (class169.field3067 - var1) > 500 || class230.field4060 - var2 < -500 || class230.field4060 - var2 > 500) {
            class169.field3067 = var1;
            class230.field4060 = var2;
        }
        if (class169.field3067 != var1) {
            class169.field3067 += (var1 - class169.field3067) / 16;
        }
        if (class230.field4060 != var2) {
            class230.field4060 += (var2 - class230.field4060) / 16;
        }
        if (class253.field4359) {
            for (int var3 = 0; var3 < class44.field966; var3++) {
                int var4 = class82.field1550[var3];
                if (var4 == 98) {
                    class118.field2087 = class118.field2087 + 47 & 0xFFFFFFF0;
                } else if (var4 == 99) {
                    class118.field2087 = class118.field2087 - 17 & 0xFFFFFFF0;
                } else if (var4 == 96) {
                    class79.field1500 = class79.field1500 - 65 & 0xFFFFFF80;
                } else if (var4 == 97) {
                    class79.field1500 = class79.field1500 + 191 & 0xFFFFFF80;
                }
            }
        } else {
            if (class69.field1311[98]) {
                class233.field4105 += (12 - class233.field4105) / 2;
            } else if (class69.field1311[99]) {
                class233.field4105 += (-class233.field4105 - 12) / 2;
            } else {
                class233.field4105 /= 2;
            }
            if (class69.field1311[96]) {
                class95.field1679 += (-class95.field1679 - 24) / 2;
            } else if (class69.field1311[97]) {
                class95.field1679 += (24 - class95.field1679) / 2;
            } else {
                class95.field1679 /= 2;
            }
            class79.field1500 += class95.field1679 / 2;
            class118.field2087 += class233.field4105 / 2;
        }
        class16.method118(-4);
        int var5 = 29 / ((arg0 + 78) / 34);
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(II)Z")
    public final boolean method307(int arg0, int arg1) {
        field846++;
        if (this.field854 == null) {
            return false;
        }
        if (this.field851 == null) {
            this.method303(-1);
        }
        class203 var3 = (class203) this.field851.method1842(-1, (long) arg0);
        if (arg1 != -27427) {
            this.method307(-114, 80);
        }
        return var3 != null;
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(IILng;)V")
    private final void method308(int arg0, int arg1, class135 arg2) {
        if (arg0 != -24) {
            field849 = null;
        }
        field836++;
        if (arg1 == 1) {
            this.field847 = arg2.method920((byte) 123);
        } else if (arg1 == 2) {
            this.field856 = arg2.method920((byte) 108);
        } else if (arg1 == 3) {
            this.field844 = arg2.method942(false);
        } else if (arg1 == 4) {
            this.field833 = arg2.method949(3933);
        } else if (arg1 == 5 || arg1 == 6) {
            int var4 = arg2.method927(127);
            this.field854 = new class269(class98.method651(var4, (byte) -117));
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg2.method949(arg0 + 3957);
                class12 var7;
                if (arg1 == 5) {
                    var7 = new class93(arg2.method942(false));
                } else {
                    var7 = new class203(arg2.method949(3933));
                }
                this.field854.method1838((long) var6, var7, (byte) 8);
            }
        }
    }

    @OriginalMember(owner = "client!fk", name = "b", descriptor = "(II)I")
    public final int method309(int arg0, int arg1) {
        field839++;
        if (this.field854 == null) {
            return this.field833;
        } else if (arg0 == -1240) {
            class203 var3 = (class203) this.field854.method1842(arg0 ^ 0x4D7, (long) arg1);
            return var3 == null ? this.field833 : var3.field3640;
        } else {
            return -128;
        }
    }

    @OriginalMember(owner = "client!fk", name = "e", descriptor = "(B)V")
    public static void method310(byte arg0) {
        field845 = null;
        field834 = null;
        field832 = null;
        field831 = null;
        if (arg0 < -51) {
            field830 = null;
            field849 = null;
            field837 = null;
            field848 = null;
        }
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(Lvf;I)Z")
    public final boolean method311(class265 arg0, int arg1) {
        if (arg1 != 7625) {
            field834 = null;
        }
        field855++;
        if (this.field854 == null) {
            return false;
        }
        if (this.field851 == null) {
            this.method302(2);
        }
        for (class4 var3 = (class4) this.field851.method1842(-1, arg0.method1786((byte) 107)); var3 != null; var3 = (class4) this.field851.method1850(157)) {
            if (var3.field59.method1776((byte) -127, arg0)) {
                return true;
            }
        }
        return false;
    }
}
