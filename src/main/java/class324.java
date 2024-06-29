import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bm")
public class class324 extends class436 {

    @OriginalMember(owner = "client!bm", name = "O", descriptor = "Ljava/lang/Object;")
    private Object field4654;

    @OriginalMember(owner = "client!bm", name = "M", descriptor = "I")
    public static int field4652 = 104;

    @OriginalMember(owner = "client!bm", name = "K", descriptor = "Ljava/lang/String;")
    public static String field4650 = "slide:";

    @OriginalMember(owner = "client!bm", name = "S", descriptor = "I")
    public static int field4658 = 0;

    @OriginalMember(owner = "client!bm", name = "V", descriptor = "Ljava/lang/String;")
    public static String field4661 = "Walk here";

    @OriginalMember(owner = "client!bm", name = "C", descriptor = "I")
    public static int field4649;

    @OriginalMember(owner = "client!bm", name = "L", descriptor = "I")
    public static int field4651;

    @OriginalMember(owner = "client!bm", name = "N", descriptor = "I")
    public static int field4653;

    @OriginalMember(owner = "client!bm", name = "Q", descriptor = "I")
    public static int field4656;

    @OriginalMember(owner = "client!bm", name = "R", descriptor = "I")
    public static int field4657;

    @OriginalMember(owner = "client!bm", name = "T", descriptor = "I")
    public static int field4659;

    @OriginalMember(owner = "client!bm", name = "U", descriptor = "I")
    public static int field4660;

    @OriginalMember(owner = "client!bm", name = "P", descriptor = "Lqj;")
    public static class238 field4655;

    @OriginalMember(owner = "client!bm", name = "e", descriptor = "(B)V", line = 4)
    public static void method2000(byte arg0) {
        field4650 = null;
        field4655 = null;
        if (arg0 <= 0) {
            field4661 = null;
        }
        field4661 = null;
    }

    @OriginalMember(owner = "client!bm", name = "d", descriptor = "(B)Ljava/lang/Object;", line = 19)
    public final Object method1622(byte arg0) {
        if (arg0 > -111) {
            return null;
        } else {
            field4657++;
            return this.field4654;
        }
    }

    @OriginalMember(owner = "client!bm", name = "e", descriptor = "(I)Z", line = 31)
    public final boolean method1621(int arg0) {
        if (arg0 <= 118) {
            return false;
        } else {
            field4656++;
            return false;
        }
    }

    @OriginalMember(owner = "client!bm", name = "<init>", descriptor = "(Lbp;Ljava/lang/Object;)V", line = 42)
    public class324(class46 arg0, Object arg1) {
        super(arg0);
        this.field4654 = arg1;
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(Lnr;[[BILgm;[[B[[BIBLgm;[[IZI[[B)V", line = 62)
    public static final void method2001(class437 arg0, byte[][] arg1, int arg2, class337 arg3, byte[][] arg4, byte[][] arg5, int arg6, byte arg7, class337 arg8, int[][] arg9, boolean arg10, int arg11, byte[][] arg12) {
        if (class265.field3854 == 0 && !class363.field5313) {
            class95.method583(arg8, arg3, arg9, arg6, arg12, arg11, arg2, arg4, arg1, arg0, arg5, arg10, (byte) 98);
        } else {
            class264.method1657(arg6, arg9, arg12, arg3, arg8, arg2, -108, arg5, arg1, arg0, arg11, arg4, arg10);
        }
        if (arg7 < 78) {
            method2003(53);
        }
        field4653++;
    }

    @OriginalMember(owner = "client!bm", name = "g", descriptor = "(I)Ljava/lang/String;", line = 79)
    public static final String method2002(int arg0) {
        field4651++;
        String var1 = "www";
        if (class59.field849 != 0) {
            var1 = "www-wtqa";
        }
        String var2 = "";
        if (class309.field4426 != null) {
            var2 = "/p=" + class309.field4426;
        }
        int var3 = -42 % ((arg0 + 35) / 63);
        return class126.field1679 == 1 ? "http://" + var1 + ".stellardawn.com/l=" + class58.field833 + "/a=" + class196.field2804 + var2 + "/" : "http://" + var1 + ".runescape.com/l=" + class58.field833 + "/a=" + class196.field2804 + var2 + "/";
    }

    @OriginalMember(owner = "client!bm", name = "h", descriptor = "(I)Lkn;", line = 108)
    public static final class16 method2003(int arg0) {
        field4659++;
        try {
            return new class299();
        } catch (Throwable var2) {
            if (arg0 != 0) {
                method2001((class437) null, (byte[][]) null, -40, (class337) null, (byte[][]) null, (byte[][]) null, 86, (byte) 22, (class337) null, (int[][]) null, true, -32, (byte[][]) null);
            }
            try {
                return (class16) Class.forName("vd").getDeclaredConstructor().newInstance();
            } catch (Throwable var1) {
                return new class406();
            }
        }
    }
}
