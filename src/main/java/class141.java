import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sa")
public abstract class class141 {

    @OriginalMember(owner = "client!sa", name = "d", descriptor = "Lbt;")
    public class33 field2178;

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "Lbd;")
    public static class44 field2175 = new class44("glow1:", "leuchten1:", "brillant1:", "brilho1:");

    @OriginalMember(owner = "client!sa", name = "c", descriptor = "I")
    public static int field2177 = 0;

    @OriginalMember(owner = "client!sa", name = "f", descriptor = "Z")
    public static boolean field2180 = false;

    @OriginalMember(owner = "client!sa", name = "g", descriptor = "Z")
    public static boolean field2181 = true;

    @OriginalMember(owner = "client!sa", name = "b", descriptor = "[F")
    public static float[] field2176 = new float[16];

    @OriginalMember(owner = "client!sa", name = "h", descriptor = "I")
    public static int field2182 = 1400;

    @OriginalMember(owner = "client!sa", name = "e", descriptor = "Lqa;")
    public static class167 field2179;

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(I)V")
    public abstract void method48(int arg0);

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(III)V")
    public abstract void method49(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(ZI)V")
    public abstract void method53(boolean arg0, int arg1);

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(Lei;II)V")
    public abstract void method57(class120 arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!sa", name = "b", descriptor = "(I)V")
    public static void method1025(int arg0) {
        field2179 = null;
        field2176 = null;
        field2175 = null;
        if (arg0 != 1400) {
            method1025(12);
        }
    }

    @OriginalMember(owner = "client!sa", name = "<init>", descriptor = "(Lbt;)V")
    public class141(class33 arg0) {
        this.field2178 = arg0;
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(IZ)V")
    public abstract void method51(int arg0, boolean arg1);

    @OriginalMember(owner = "client!sa", name = "c", descriptor = "(I)Z")
    public abstract boolean method55(int arg0);
}
