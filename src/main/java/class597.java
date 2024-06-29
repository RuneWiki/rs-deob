import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cm")
public abstract class class597 extends class321 {

    @OriginalMember(owner = "client!cm", name = "w", descriptor = "Z")
    public volatile boolean field8640 = true;

    @OriginalMember(owner = "client!cm", name = "u", descriptor = "Lmb;")
    public static class383 field8638 = new class383();

    @OriginalMember(owner = "client!cm", name = "C", descriptor = "[I")
    public static int[] field8646 = new int[2];

    @OriginalMember(owner = "client!cm", name = "A", descriptor = "Ldc;")
    public static class302 field8644 = new class302();

    @OriginalMember(owner = "client!cm", name = "D", descriptor = "F")
    public static float field8647;

    @OriginalMember(owner = "client!cm", name = "t", descriptor = "I")
    public static int field8637;

    @OriginalMember(owner = "client!cm", name = "v", descriptor = "I")
    public static int field8639;

    @OriginalMember(owner = "client!cm", name = "B", descriptor = "I")
    public static int field8645;

    @OriginalMember(owner = "client!cm", name = "y", descriptor = "Lla;")
    public static class393 field8642;

    @OriginalMember(owner = "client!cm", name = "x", descriptor = "Z")
    public boolean field8641;

    @OriginalMember(owner = "client!cm", name = "z", descriptor = "Z")
    public boolean field8643;

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(BLjava/lang/String;)Ljava/lang/Class;")
    public static final Class method3400(byte arg0, String arg1) throws ClassNotFoundException {
        field8639++;
        if (arg1.equals("B")) {
            return Byte.TYPE;
        } else if (arg1.equals("I")) {
            return Integer.TYPE;
        } else if (arg1.equals("S")) {
            return Short.TYPE;
        } else if (arg1.equals("J")) {
            return Long.TYPE;
        } else {
            if (arg0 != 100) {
                field8645 = 77;
            }
            if (arg1.equals("Z")) {
                return Boolean.TYPE;
            } else if (arg1.equals("F")) {
                return Float.TYPE;
            } else if (arg1.equals("D")) {
                return Double.TYPE;
            } else if (arg1.equals("C")) {
                return Character.TYPE;
            } else {
                return Class.forName(arg1);
            }
        }
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(B)Leda;")
    public static final class116 method3401(byte arg0) {
        field8637++;
        if (arg0 > -20) {
            method3401((byte) -13);
        }
        return class545.field8044 < class568.field8284.length ? class568.field8284[class545.field8044++] : null;
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(Z)V")
    public static void method3402(boolean arg0) {
        if (arg0) {
            method3402(true);
        }
        field8646 = null;
        field8642 = null;
        field8638 = null;
        field8644 = null;
    }

    @OriginalMember(owner = "client!cm", name = "e", descriptor = "(I)I")
    public abstract int method2646(int arg0);

    @OriginalMember(owner = "client!cm", name = "f", descriptor = "(I)[B")
    public abstract byte[] method2648(int arg0);
}
