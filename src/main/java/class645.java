import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fh")
public class class645 {

    @OriginalMember(owner = "client!fh", name = "g", descriptor = "Lgg;")
    public static class114 field8893 = new class114(4);

    @OriginalMember(owner = "client!fh", name = "i", descriptor = "Lmq;")
    public static class78 field8895 = new class78(117, 3);

    @OriginalMember(owner = "client!fh", name = "l", descriptor = "Lut;")
    public static class664 field8898 = new class664(16);

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "I")
    public int field8887;

    @OriginalMember(owner = "client!fh", name = "b", descriptor = "I")
    public int field8888;

    @OriginalMember(owner = "client!fh", name = "c", descriptor = "I")
    public int field8889;

    @OriginalMember(owner = "client!fh", name = "d", descriptor = "I")
    public int field8890;

    @OriginalMember(owner = "client!fh", name = "e", descriptor = "I")
    public static int field8891;

    @OriginalMember(owner = "client!fh", name = "f", descriptor = "I")
    public static int field8892;

    @OriginalMember(owner = "client!fh", name = "h", descriptor = "I")
    public int field8894;

    @OriginalMember(owner = "client!fh", name = "j", descriptor = "I")
    public int field8896;

    @OriginalMember(owner = "client!fh", name = "k", descriptor = "Lkha;")
    public static class687 field8897;

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(B)V")
    public static final void method3496(byte arg0) {
        field8891++;
        if (class86.field1104) {
            return;
        }
        class70.field945 = true;
        if (arg0 < -95) {
            class661.field9067 += (-24.0F - class661.field9067) / 2.0F;
            class86.field1104 = true;
        }
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(FFFZ)F")
    public static final float method3497(float arg0, float arg1, float arg2, boolean arg3) {
        field8892++;
        if (!arg3) {
            method3496((byte) 24);
        }
        return (arg0 - arg2) * arg1 + arg2;
    }

    @OriginalMember(owner = "client!fh", name = "b", descriptor = "(B)V")
    public static void method3498(byte arg0) {
        field8898 = null;
        field8897 = null;
        if (arg0 > -43) {
            field8895 = null;
        }
        field8893 = null;
        field8895 = null;
    }
}
