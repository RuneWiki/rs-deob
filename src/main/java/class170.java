import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!di")
public class class170 {

    @OriginalMember(owner = "client!di", name = "j", descriptor = "Lqd;")
    public class53 field2813 = new class53();

    @OriginalMember(owner = "client!di", name = "d", descriptor = "Z")
    public static boolean field2807 = false;

    @OriginalMember(owner = "client!di", name = "f", descriptor = "I")
    public static int field2809 = -1;

    @OriginalMember(owner = "client!di", name = "l", descriptor = "Ljava/lang/String;")
    public static String field2815 = "Started 3d Library";

    @OriginalMember(owner = "client!di", name = "a", descriptor = "I")
    public static int field2804;

    @OriginalMember(owner = "client!di", name = "b", descriptor = "I")
    public static int field2805;

    @OriginalMember(owner = "client!di", name = "c", descriptor = "I")
    public static int field2806;

    @OriginalMember(owner = "client!di", name = "e", descriptor = "I")
    public static int field2808;

    @OriginalMember(owner = "client!di", name = "h", descriptor = "I")
    public static int field2811;

    @OriginalMember(owner = "client!di", name = "i", descriptor = "I")
    public static int field2812;

    @OriginalMember(owner = "client!di", name = "k", descriptor = "I")
    public static int field2814;

    @OriginalMember(owner = "client!di", name = "n", descriptor = "I")
    public static int field2817;

    @OriginalMember(owner = "client!di", name = "g", descriptor = "Lek;")
    public static class206 field2810;

    @OriginalMember(owner = "client!di", name = "m", descriptor = "Lqd;")
    private class53 field2816;

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(I)Lqd;", line = 11)
    public final class53 method1205(int arg0) {
        field2804++;
        class53 var2 = this.field2813.field1064;
        if (arg0 < 61) {
            return (class53) null;
        } else if (this.field2813 == var2) {
            this.field2816 = null;
            return null;
        } else {
            this.field2816 = var2.field1064;
            return var2;
        }
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(IIII)I", line = 31)
    public static final int method1206(int arg0, int arg1, int arg2, int arg3) {
        if (arg3 >= -84) {
            method1211(80);
        }
        field2805++;
        if ((class282.field4615[arg0][arg2][arg1] & 0x8) == 0) {
            return arg0 <= 0 || (class282.field4615[1][arg2][arg1] & 0x2) == 0 ? arg0 : arg0 - 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(Z)Lqd;", line = 50)
    public final class53 method1207(boolean arg0) {
        field2806++;
        if (!arg0) {
            field2809 = -114;
        }
        class53 var2 = this.field2816;
        if (this.field2813 == var2) {
            this.field2816 = null;
            return null;
        } else {
            this.field2816 = var2.field1064;
            return var2;
        }
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(ILqd;)V", line = 73)
    public final void method1208(int arg0, class53 arg1) {
        field2808++;
        if (arg0 < 31) {
            method1211(-52);
        }
        if (arg1.field1062 != null) {
            arg1.method460(false);
        }
        arg1.field1064 = this.field2813;
        arg1.field1062 = this.field2813.field1062;
        arg1.field1062.field1064 = arg1;
        arg1.field1064.field1062 = arg1;
    }

    @OriginalMember(owner = "client!di", name = "b", descriptor = "(I)I", line = 92)
    public final int method1209(int arg0) {
        field2817++;
        int var2 = arg0;
        for (class53 var3 = this.field2813.field1064; var3 != this.field2813; var3 = var3.field1064) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!di", name = "c", descriptor = "(I)Lcf;", line = 113)
    public static final class149 method1210(int arg0) {
        field2811++;
        if (arg0 != 3933) {
            return (class149) null;
        }
        try {
            return (class149) Class.forName("cn").getDeclaredConstructor().newInstance();
        } catch (Throwable var2) {
            return null;
        }
    }

    @OriginalMember(owner = "client!di", name = "d", descriptor = "(I)V", line = 139)
    public static final void method1211(int arg0) {
        int var1 = 0;
        field2812++;
        for (int var2 = arg0; var2 < 104; var2++) {
            for (int var3 = 0; var3 < 104; var3++) {
                if (class6.method46(var1, class353.field5644, var2, false, true, var3)) {
                    var1++;
                }
                if (var1 >= 512) {
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!di", name = "<init>", descriptor = "()V", line = 200)
    public class170() {
        this.field2813.field1064 = this.field2813;
        this.field2813.field1062 = this.field2813;
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(B)V", line = 188)
    public static void method1212(byte arg0) {
        field2810 = null;
        if (arg0 >= -116) {
            method1211(-37);
        }
        field2815 = null;
    }
}
