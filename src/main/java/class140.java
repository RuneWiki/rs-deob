import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eq")
public abstract class class140 {

    @OriginalMember(owner = "client!eq", name = "b", descriptor = "Ljm;")
    public static class484 field2037 = new class484(0, 0);

    @OriginalMember(owner = "client!eq", name = "e", descriptor = "[Z")
    public static boolean[] field2040 = new boolean[100];

    @OriginalMember(owner = "client!eq", name = "f", descriptor = "I")
    public static int field2041 = 0;

    @OriginalMember(owner = "client!eq", name = "d", descriptor = "Z")
    public static boolean field2039 = false;

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "I")
    public static int field2036;

    @OriginalMember(owner = "client!eq", name = "c", descriptor = "Ldf;")
    public static class274 field2038;

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(Z)V")
    public abstract void method125(boolean arg0);

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/Class;")
    public static final Class method992(String arg0, int arg1) throws ClassNotFoundException {
        field2036++;
        if (arg1 != 0) {
            return null;
        } else if (arg0.equals("B")) {
            return Byte.TYPE;
        } else if (arg0.equals("I")) {
            return Integer.TYPE;
        } else if (arg0.equals("S")) {
            return Short.TYPE;
        } else if (arg0.equals("J")) {
            return Long.TYPE;
        } else if (arg0.equals("Z")) {
            return Boolean.TYPE;
        } else if (arg0.equals("F")) {
            return Float.TYPE;
        } else if (arg0.equals("D")) {
            return Double.TYPE;
        } else if (arg0.equals("C")) {
            return Character.TYPE;
        } else {
            return Class.forName(arg0);
        }
    }

    @OriginalMember(owner = "client!eq", name = "b", descriptor = "(B)Z")
    public abstract boolean method126(byte arg0);

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(IILqa;Leq;IIZ)V")
    public abstract void method127(int arg0, int arg1, class162 arg2, class140 arg3, int arg4, int arg5, boolean arg6);

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(Lqa;Z)V")
    public abstract void method334(class162 arg0, boolean arg1);

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(IILqa;I)Z")
    public abstract boolean method343(int arg0, int arg1, class162 arg2, int arg3);

    @OriginalMember(owner = "client!eq", name = "e", descriptor = "(I)V")
    public static void method993(int arg0) {
        field2037 = null;
        field2040 = null;
        field2038 = null;
        if (arg0 != 100) {
            method993(124);
        }
    }

    @OriginalMember(owner = "client!eq", name = "b", descriptor = "(ILqa;)Lfm;")
    public abstract class514 method339(int arg0, class162 arg1);
}
