import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!da")
public class class112 {

    @OriginalMember(owner = "client!da", name = "e", descriptor = "[Z")
    public static boolean[] field1889 = new boolean[] { true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false };

    @OriginalMember(owner = "client!da", name = "i", descriptor = "I")
    public static int field1893 = 0;

    @OriginalMember(owner = "client!da", name = "l", descriptor = "[I")
    public static int[] field1896 = new int[] { 0, 0, 0, 0, 0, 0, 0, 3, 10, -1, 0, 0, 0, 0, -1, 7, -2, 0, 3, 0, -1, -1, 0, -2, 9, 0, 0, 0, 0, 0, 7, 0, 0, 0, 0, 8, 0, 0, 0, 0, -1, 0, 0, 0, -1, -2, 0, 0, 0, 0, 1, 0, 0, 0, 10, 0, 0, -1, 0, 12, 6, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 8, 0, 20, 6, 3, 0, 0, 0, 0, 0, 0, 0, 0, 5, 0, 0, 0, 4, -1, 0, 0, -2, 0, 0, -2, 5, 8, 3, 0, 2, 0, 10, -2, 0, 15, 2, 0, -1, 0, 0, 0, 0, 0, 24, 2, 0, 14, 0, 0, -2, 0, -1, 0, -2, 0, 0, 0, 0, 0, -1, 0, 2, 0, 6, 7, 0, 0, 10, 0, 0, 5, 0, 3, 0, 8, 0, 0, 5, 0, 2, 0, 5, 0, 8, 0, 0, 0, 6, 15, 0, 4, 0, 0, -2, 0, 2, 14, 0, 0, 9, 0, 0, 0, 5, 0, 0, 0, 0, 4, 0, 1, 0, 0, 0, 0, 8, 0, -1, 0, 0, 0, 0, 0, 5, 4, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, -2, 0, 0, 0, 0, 0, 1, 1, 12, 0, -1, 0, 0, -2, 6, 6, 0, 0, 1, 0, 0, 0, 0, 4, 0, 0, -1, 6, 0, 0, 10, 0, 6, 0, 0, -2, 0, 6, 2, 0, 0, 0, 7, 0, 0, 0 };

    @OriginalMember(owner = "client!da", name = "a", descriptor = "Lbe;")
    private static class283 field1885 = class153.method941(125, "Cancel");

    @OriginalMember(owner = "client!da", name = "c", descriptor = "Lbe;")
    public static class283 field1887 = field1885;

    @OriginalMember(owner = "client!da", name = "b", descriptor = "Lj;")
    public static class269 field1886 = new class269();

    @OriginalMember(owner = "client!da", name = "d", descriptor = "I")
    public static int field1888;

    @OriginalMember(owner = "client!da", name = "f", descriptor = "I")
    public static int field1890;

    @OriginalMember(owner = "client!da", name = "g", descriptor = "I")
    public static int field1891;

    @OriginalMember(owner = "client!da", name = "j", descriptor = "I")
    public static int field1894;

    @OriginalMember(owner = "client!da", name = "k", descriptor = "I")
    public static int field1895;

    @OriginalMember(owner = "client!da", name = "m", descriptor = "I")
    public static int field1897;

    @OriginalMember(owner = "client!da", name = "h", descriptor = "Ljava/awt/Image;")
    public static Image field1892;

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(I)V", line = 50)
    public static final void method733(int arg0) {
        field1888++;
        if (!class298.field5049) {
            return;
        }
        class5.field47 = null;
        class298.field5049 = false;
        class61.field843 = null;
        if (arg0 >= -106) {
            field1886 = (class269) null;
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Z)V", line = 117)
    public static void method734(boolean arg0) {
        if (!arg0) {
            method737(-107, 44);
        }
        field1885 = null;
        field1889 = null;
        field1887 = null;
        field1886 = null;
        field1892 = null;
        field1896 = null;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(ILek;)V", line = 145)
    public static final void method735(int arg0, class172 arg1) {
        if (arg0 >= -4) {
            method736(-51, 8);
        }
        class110.field1861 = arg1.method1097(class256.field4321, 0);
        field1895++;
        class90.field1522 = arg1.method1097(class303.field5121, 0);
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(II)Ljm;", line = 210)
    public static final class223 method736(int arg0, int arg1) {
        field1891++;
        class223 var2 = (class223) class128.field2120.method77((long) arg1, 12);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class291.field4928.method1107(5, arg1, 123);
        class223 var4 = new class223();
        int var5 = -2 / ((63 - arg0) / 44);
        if (var3 != null) {
            var4.method1468(new class229(var3), (byte) -108);
        }
        class128.field2120.method85(var4, (long) arg1, (byte) 116);
        return var4;
    }

    @OriginalMember(owner = "client!da", name = "b", descriptor = "(II)Leg;", line = 303)
    public static final class286 method737(int arg0, int arg1) {
        if (arg1 != -10982) {
            field1886 = (class269) null;
        }
        field1894++;
        if (arg0 == 0) {
            return new class45();
        } else if (arg0 == 1) {
            return new class79();
        } else if (arg0 == 2) {
            return new class240();
        } else if (arg0 == 3) {
            return new class208();
        } else if (arg0 == 4) {
            return new class155();
        } else if (arg0 == 5) {
            return new class52();
        } else if (arg0 == 6) {
            return new class3();
        } else if (arg0 == 7) {
            return new class111();
        } else if (arg0 == 8) {
            return new class203();
        } else if (arg0 == 9) {
            return new class277();
        } else if (arg0 == 10) {
            return new class260();
        } else if (arg0 == 11) {
            return new class10();
        } else if (arg0 == 12) {
            return new class47();
        } else if (arg0 == 13) {
            return new class99();
        } else if (arg0 == 14) {
            return new class90();
        } else if (arg0 == 15) {
            return new class135();
        } else if (arg0 == 16) {
            return new class77();
        } else if (arg0 == 17) {
            return new class92();
        } else if (arg0 == 18) {
            return new class5();
        } else if (arg0 == 19) {
            return new class193();
        } else if (arg0 == 20) {
            return new class278();
        } else if (arg0 == 21) {
            return new class134();
        } else if (arg0 == 22) {
            return new class267();
        } else if (arg0 == 23) {
            return new class176();
        } else if (arg0 == 24) {
            return new class259();
        } else if (arg0 == 25) {
            return new class222();
        } else if (arg0 == 26) {
            return new class263();
        } else if (arg0 == 27) {
            return new class124();
        } else if (arg0 == 28) {
            return new class275();
        } else if (arg0 == 29) {
            return new class205();
        } else if (arg0 == 30) {
            return new class273();
        } else if (arg0 == 31) {
            return new class255();
        } else if (arg0 == 32) {
            return new class227();
        } else if (arg0 == 33) {
            return new class121();
        } else if (arg0 == 34) {
            return new class61();
        } else if (arg0 == 35) {
            return new class265();
        } else if (arg0 == 36) {
            return new class83();
        } else if (arg0 == 37) {
            return new class170();
        } else if (arg0 == 38) {
            return new class67();
        } else if (arg0 == 39) {
            return new class186();
        } else {
            return null;
        }
    }
}
