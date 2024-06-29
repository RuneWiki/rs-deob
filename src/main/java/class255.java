import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pj")
public class class255 {

    @OriginalMember(owner = "client!pj", name = "g", descriptor = "I")
    public static int field3910 = -1;

    @OriginalMember(owner = "client!pj", name = "h", descriptor = "I")
    public static int field3911 = 0;

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "I")
    public static int field3904;

    @OriginalMember(owner = "client!pj", name = "b", descriptor = "I")
    public static int field3905;

    @OriginalMember(owner = "client!pj", name = "e", descriptor = "I")
    public static int field3908;

    @OriginalMember(owner = "client!pj", name = "l", descriptor = "I")
    public static int field3915;

    @OriginalMember(owner = "client!pj", name = "i", descriptor = "Ljb;")
    public static class276 field3912;

    @OriginalMember(owner = "client!pj", name = "j", descriptor = "S")
    public short field3913;

    @OriginalMember(owner = "client!pj", name = "c", descriptor = "Z")
    public boolean field3906;

    @OriginalMember(owner = "client!pj", name = "f", descriptor = "Z")
    public boolean field3909;

    @OriginalMember(owner = "client!pj", name = "k", descriptor = "Z")
    public boolean field3914;

    @OriginalMember(owner = "client!pj", name = "m", descriptor = "Z")
    public boolean field3916;

    @OriginalMember(owner = "client!pj", name = "d", descriptor = "[[[Lwd;")
    public static class23[][][] field3907;

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(Lf;B)Lmi;")
    public static final class266 method1694(class37 arg0, byte arg1) {
        field3905++;
        int var2 = -63 / ((2 - arg1) / 46);
        return new class266(arg0.method306(102), arg0.method306(112), arg0.method306(91), arg0.method306(74), arg0.method336(23362), arg0.method336(23362), arg0.method333((byte) -59));
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(ILag;)Z")
    public static final boolean method1695(int arg0, class188 arg1) {
        field3904++;
        if (~arg1.field2950 == arg0) {
            class155.field2373 = 250;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(B)V")
    public static final void method1696(byte arg0) {
        class188.field2952.method1783(0);
        class267.field4257.method1783(0);
        field3915++;
        if (arg0 > -33) {
            field3911 = -15;
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(I)V")
    public static void method1697(int arg0) {
        field3907 = null;
        if (arg0 != 0) {
            method1695(-98, (class188) null);
        }
        field3912 = null;
    }
}
