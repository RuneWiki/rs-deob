import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cea")
public class class195 {

    @OriginalMember(owner = "client!cea", name = "a", descriptor = "[I")
    public static int[] field2881 = new int[1];

    @OriginalMember(owner = "client!cea", name = "c", descriptor = "I")
    public static int field2883 = 0;

    @OriginalMember(owner = "client!cea", name = "h", descriptor = "Lcg;")
    public static class123 field2888;

    @OriginalMember(owner = "client!cea", name = "g", descriptor = "Lst;")
    public static class397 field2887;

    @OriginalMember(owner = "client!cea", name = "f", descriptor = "[B")
    public byte[] field2886;

    @OriginalMember(owner = "client!cea", name = "b", descriptor = "[S")
    public short[] field2882;

    @OriginalMember(owner = "client!cea", name = "d", descriptor = "[S")
    public short[] field2884;

    @OriginalMember(owner = "client!cea", name = "e", descriptor = "[S")
    public short[] field2885;

    @OriginalMember(owner = "client!cea", name = "a", descriptor = "(ILd;)V")
    public static final void method1317(int arg0, class136 arg1) {
        class144.field2149[arg0] = arg1;
    }

    @OriginalMember(owner = "client!cea", name = "a", descriptor = "(B)V")
    public static void method1318(byte arg0) {
        if (arg0 != -37) {
            method1317(77, null);
        }
        field2881 = null;
        field2887 = null;
        field2888 = null;
    }
}
