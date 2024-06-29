import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vl")
public abstract class class374 {

    @OriginalMember(owner = "client!vl", name = "c", descriptor = "I")
    public static int field5259 = 0;

    @OriginalMember(owner = "client!vl", name = "b", descriptor = "Lph;")
    public static class114 field5258 = new class114(64);

    @OriginalMember(owner = "client!vl", name = "h", descriptor = "Ljava/lang/String;")
    public static String field5264 = "You can't add yourself to your own ignore list.";

    @OriginalMember(owner = "client!vl", name = "f", descriptor = "Z")
    public static boolean field5262 = false;

    @OriginalMember(owner = "client!vl", name = "k", descriptor = "[I")
    public static int[] field5267 = new int[] { 28, 35, 40, 44 };

    @OriginalMember(owner = "client!vl", name = "g", descriptor = "I")
    public static int field5263 = -1;

    @OriginalMember(owner = "client!vl", name = "j", descriptor = "Ljava/lang/String;")
    public static String field5266 = "yellow:";

    @OriginalMember(owner = "client!vl", name = "l", descriptor = "Z")
    public static boolean field5268 = false;

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "I")
    public static int field5257;

    @OriginalMember(owner = "client!vl", name = "d", descriptor = "I")
    public static int field5260;

    @OriginalMember(owner = "client!vl", name = "e", descriptor = "I")
    public static int field5261;

    @OriginalMember(owner = "client!vl", name = "i", descriptor = "Lia;")
    public static class362 field5265;

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(B)V", line = 17)
    public static final void method2248(byte arg0) {
        class221.field2967 = null;
        field5260++;
        class36.field368 = null;
        if (arg0 < 39) {
            method2249(4);
        }
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(I)V", line = 37)
    public static void method2249(int arg0) {
        field5264 = null;
        field5265 = null;
        field5258 = null;
        if (arg0 == 28) {
            field5267 = null;
            field5266 = null;
        }
    }

    @OriginalMember(owner = "client!vl", name = "b", descriptor = "(I)Lnr;", line = 51)
    public static final class437 method2250(int arg0) {
        int var1 = -12 % ((-arg0 - 42) / 49);
        field5257++;
        try {
            return new class148();
        } catch (Throwable var3) {
            try {
                return (class437) Class.forName("sl").getDeclaredConstructor().newInstance();
            } catch (Throwable var2) {
                return new class408();
            }
        }
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(ZLbp;)Lbp;")
    public abstract class46 method2207(boolean arg0, class46 arg1);
}
