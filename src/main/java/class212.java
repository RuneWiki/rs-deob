import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!t")
public abstract class class212 {

    @OriginalMember(owner = "client!t", name = "c", descriptor = "I")
    public static int field3388 = 0;

    @OriginalMember(owner = "client!t", name = "e", descriptor = "Lfa;")
    public static class273 field3390;

    @OriginalMember(owner = "client!t", name = "d", descriptor = "Lmg;")
    public static class288 field3389;

    @OriginalMember(owner = "client!t", name = "a", descriptor = "Lbe;")
    public static class30 field3386;

    @OriginalMember(owner = "client!t", name = "b", descriptor = "Z")
    public static boolean field3387;

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(BII)I")
    public abstract int method135(byte arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(B)V")
    public static void method1495(byte arg0) {
        field3386 = null;
        field3390 = null;
        field3389 = null;
        if (arg0 >= -93) {
            method1495((byte) -21);
        }
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(Z)V")
    public abstract void method136(boolean arg0);

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(I)J")
    public abstract long method137(int arg0);
}
