import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sg")
public class class159 {

    @OriginalMember(owner = "client!sg", name = "g", descriptor = "Lda;")
    public static class275 field2783 = class255.method1672(104, "Fps:");

    @OriginalMember(owner = "client!sg", name = "k", descriptor = "Lda;")
    public static class275 field2787 = class255.method1672(111, "name_icons");

    @OriginalMember(owner = "client!sg", name = "f", descriptor = "Lda;")
    private static class275 field2782 = class255.method1672(93, "skill: ");

    @OriginalMember(owner = "client!sg", name = "i", descriptor = "Lda;")
    public static class275 field2785 = field2782;

    @OriginalMember(owner = "client!sg", name = "j", descriptor = "Lda;")
    public static class275 field2786 = class255.method1672(121, "(U2");

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "I")
    public static int field2777;

    @OriginalMember(owner = "client!sg", name = "b", descriptor = "I")
    public static int field2778;

    @OriginalMember(owner = "client!sg", name = "c", descriptor = "I")
    public static int field2779;

    @OriginalMember(owner = "client!sg", name = "d", descriptor = "I")
    public static int field2780;

    @OriginalMember(owner = "client!sg", name = "e", descriptor = "I")
    public static int field2781;

    @OriginalMember(owner = "client!sg", name = "h", descriptor = "I")
    public static int field2784;

    @OriginalMember(owner = "client!sg", name = "m", descriptor = "I")
    public static int field2789;

    @OriginalMember(owner = "client!sg", name = "n", descriptor = "I")
    public static int field2790;

    @OriginalMember(owner = "client!sg", name = "l", descriptor = "Lak;")
    public class234 field2788;

    @OriginalMember(owner = "client!sg", name = "o", descriptor = "[I")
    public static int[] field2791;

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(I)V")
    public static final void method1111(int arg0) {
        field2784++;
        boolean var1 = false;
        while (!var1) {
            var1 = true;
            for (int var2 = 0; var2 < class52.field863 - 1; var2++) {
                if (class137.field2400[var2] < 1000 && class137.field2400[var2 + 1] > 1000) {
                    var1 = false;
                    class275 var3 = class201.field3446[var2];
                    class201.field3446[var2] = class201.field3446[var2 + 1];
                    class201.field3446[var2 + 1] = var3;
                    class275 var4 = class174.field3015[var2];
                    class174.field3015[var2] = class174.field3015[var2 + 1];
                    class174.field3015[var2 + 1] = var4;
                    int var5 = class161.field2820[var2];
                    class161.field2820[var2] = class161.field2820[var2 + 1];
                    class161.field2820[var2 + 1] = var5;
                    int var6 = class13.field196[var2];
                    class13.field196[var2] = class13.field196[var2 + 1];
                    class13.field196[var2 + 1] = var6;
                    short var7 = class137.field2400[var2];
                    class137.field2400[var2] = class137.field2400[var2 + 1];
                    class137.field2400[var2 + 1] = var7;
                    long var8 = class13.field200[var2];
                    class13.field200[var2] = class13.field200[var2 + 1];
                    class13.field200[var2 + 1] = var8;
                }
            }
        }
        if (arg0 > -41) {
            field2791 = null;
        }
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(Lda;I)V")
    public static final void method1112(class275 arg0, int arg1) {
        if (arg1 != -1) {
            field2789 = -55;
        }
        field2777++;
        for (class225 var2 = (class225) class93.field1590.method550(-102); var2 != null; var2 = (class225) class93.field1590.method545(104)) {
            if (var2.field3814.method1828(true, arg0)) {
                class233.field4075 = var2;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(IIIZ)I")
    public static final int method1113(int arg0, int arg1, int arg2, boolean arg3) {
        if (!arg3) {
            method1114(121);
        }
        field2778++;
        if ((class72.field1168[arg2][arg1][arg0] & 0x8) == 0) {
            return arg2 <= 0 || (class72.field1168[1][arg1][arg0] & 0x2) == 0 ? arg2 : arg2 - 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!sg", name = "b", descriptor = "(I)V")
    public static void method1114(int arg0) {
        field2785 = null;
        field2783 = null;
        field2791 = null;
        int var1 = -113 % ((83 - arg0) / 43);
        field2786 = null;
        field2787 = null;
        field2782 = null;
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(Z[BZ)Ljava/lang/Object;")
    public static final Object method1115(boolean arg0, byte[] arg1, boolean arg2) {
        field2781++;
        if (arg2) {
            return null;
        } else if (arg1 == null) {
            return null;
        } else {
            if (arg1.length > 136 && !class137.field2399) {
                try {
                    class123 var3 = (class123) Class.forName("ph").getDeclaredConstructor().newInstance();
                    var3.method895(100, arg1);
                    return var3;
                } catch (Throwable var4) {
                    class137.field2399 = true;
                }
            }
            return arg0 ? class144.method1030(arg1, false) : arg1;
        }
    }
}
