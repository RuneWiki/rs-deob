import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rh")
public class class170 extends class41 {

    @OriginalMember(owner = "client!rh", name = "F", descriptor = "I")
    public static int field2858 = 0;

    @OriginalMember(owner = "client!rh", name = "v", descriptor = "Ljd;")
    public static class265 field2848 = new class265(30);

    @OriginalMember(owner = "client!rh", name = "H", descriptor = "Lsc;")
    public static class181 field2860 = class149.method967(255, "<img=1>");

    @OriginalMember(owner = "client!rh", name = "G", descriptor = "Lid;")
    public static class173 field2859 = new class173();

    @OriginalMember(owner = "client!rh", name = "J", descriptor = "Lsc;")
    private static class181 field2862 = class149.method967(255, "Select");

    @OriginalMember(owner = "client!rh", name = "I", descriptor = "I")
    public static int field2861 = -1;

    @OriginalMember(owner = "client!rh", name = "K", descriptor = "Z")
    public static boolean field2863 = false;

    @OriginalMember(owner = "client!rh", name = "L", descriptor = "Lsc;")
    public static class181 field2864 = field2862;

    @OriginalMember(owner = "client!rh", name = "w", descriptor = "I")
    public static int field2849;

    @OriginalMember(owner = "client!rh", name = "y", descriptor = "I")
    public static int field2851;

    @OriginalMember(owner = "client!rh", name = "z", descriptor = "I")
    public static int field2852;

    @OriginalMember(owner = "client!rh", name = "C", descriptor = "I")
    public static int field2855;

    @OriginalMember(owner = "client!rh", name = "D", descriptor = "I")
    public static int field2856;

    @OriginalMember(owner = "client!rh", name = "E", descriptor = "I")
    public static int field2857;

    @OriginalMember(owner = "client!rh", name = "B", descriptor = "J")
    public long field2854;

    @OriginalMember(owner = "client!rh", name = "x", descriptor = "Lrh;")
    public class170 field2850;

    @OriginalMember(owner = "client!rh", name = "A", descriptor = "Lrh;")
    public class170 field2853;

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(IIB)V")
    public static final void method1124(int arg0, int arg1, byte arg2) {
        class77.field1242++;
        class141.field2275.method541(145, 71);
        field2852++;
        if (arg2 >= 71) {
            class141.field2275.method1505((byte) -88, arg0);
            class141.field2275.method1534(0, arg1);
        }
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(BZ)V")
    public static final void method1125(byte arg0, boolean arg1) {
        if (class174.field2919 == null) {
            class174.field2919 = new byte[4][104][104];
        }
        field2857++;
        int var2 = 0;
        if (arg1) {
            return;
        }
        while (var2 < 4) {
            for (int var3 = 0; var3 < 104; var3++) {
                for (int var4 = 0; var4 < 104; var4++) {
                    class174.field2919[var2][var3][var4] = arg0;
                }
            }
            var2++;
        }
    }

    @OriginalMember(owner = "client!rh", name = "c", descriptor = "(I)V")
    public static void method1126(int arg0) {
        field2860 = null;
        if (arg0 <= 78) {
            method1125((byte) -41, false);
        }
        field2862 = null;
        field2848 = null;
        field2864 = null;
        field2859 = null;
    }

    @OriginalMember(owner = "client!rh", name = "d", descriptor = "(I)V")
    public static final void method1127(int arg0) {
        field2849++;
        if (arg0 != 0) {
            return;
        }
        for (class121 var1 = (class121) class257.field4495.method1686((byte) -83); var1 != null; var1 = (class121) class257.field4495.method1683(140)) {
            if (var1.field1984 == -1) {
                var1.field1979 = 0;
                class164.method1096(arg0 + Integer.MAX_VALUE, var1);
            } else {
                var1.method290((byte) -48);
            }
        }
    }

    @OriginalMember(owner = "client!rh", name = "b", descriptor = "(B)V")
    public final void method1128(byte arg0) {
        field2855++;
        if (this.field2853 == null) {
            return;
        }
        if (arg0 != 20) {
            method1126(-111);
        }
        this.field2853.field2850 = this.field2850;
        this.field2850.field2853 = this.field2853;
        this.field2853 = null;
        this.field2850 = null;
    }

    @OriginalMember(owner = "client!rh", name = "c", descriptor = "(B)V")
    public static final void method1129(byte arg0) {
        class165.field2813++;
        if (arg0 != 58) {
            method1125((byte) 9, false);
        }
        field2856++;
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(Laf;III)V")
    public static final void method1130(class208 arg0, int arg1, int arg2, int arg3) {
        if (arg2 < class238.field4129) {
            class220 var4 = class221.field3820[arg1][arg2 + 1][arg3];
            if (var4 != null && var4.field3805 != null && var4.field3805.field2795.method365()) {
                arg0.method355(var4.field3805.field2795, 128, 0, 0, true);
            }
        }
        if (arg3 < class238.field4129) {
            class220 var5 = class221.field3820[arg1][arg2][arg3 + 1];
            if (var5 != null && var5.field3805 != null && var5.field3805.field2795.method365()) {
                arg0.method355(var5.field3805.field2795, 0, 0, 128, true);
            }
        }
        if (arg2 < class238.field4129 && arg3 < class2.field47) {
            class220 var6 = class221.field3820[arg1][arg2 + 1][arg3 + 1];
            if (var6 != null && var6.field3805 != null && var6.field3805.field2795.method365()) {
                arg0.method355(var6.field3805.field2795, 128, 0, 128, true);
            }
        }
        if (arg2 < class238.field4129 && arg3 > 0) {
            class220 var7 = class221.field3820[arg1][arg2 + 1][arg3 - 1];
            if (var7 != null && var7.field3805 != null && var7.field3805.field2795.method365()) {
                arg0.method355(var7.field3805.field2795, 128, 0, -128, true);
            }
        }
    }
}
