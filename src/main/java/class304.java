import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vw")
public abstract class class304 {

    @OriginalMember(owner = "client!vw", name = "a", descriptor = "I")
    public static int field3793 = 4;

    @OriginalMember(owner = "client!vw", name = "b", descriptor = "I")
    public static int field3794;

    @OriginalMember(owner = "client!vw", name = "c", descriptor = "I")
    public static int field3795;

    @OriginalMember(owner = "client!vw", name = "d", descriptor = "I")
    public static int field3796;

    @OriginalMember(owner = "client!vw", name = "e", descriptor = "Lg;")
    public static class155 field3797;

    @OriginalMember(owner = "client!vw", name = "a", descriptor = "(Z)V")
    public abstract void method1654(boolean arg0);

    @OriginalMember(owner = "client!vw", name = "a", descriptor = "(IB)Z")
    public abstract boolean method1657(int arg0, byte arg1);

    @OriginalMember(owner = "client!vw", name = "a", descriptor = "(I)V")
    public static void method1825(int arg0) {
        if (arg0 != 0) {
            method1827(-73, -43);
        }
        field3797 = null;
    }

    @OriginalMember(owner = "client!vw", name = "a", descriptor = "(III)Z")
    public static final boolean method1826(int arg0, int arg1, int arg2) {
        field3794++;
        if (arg1 > -67) {
            return true;
        } else {
            return class315.method1875(arg2, arg0, -13230) | (arg2 & 0x800) != 0 || class599.method3409(arg2, arg0, 55);
        }
    }

    @OriginalMember(owner = "client!vw", name = "a", descriptor = "(II)I")
    public static final int method1827(int arg0, int arg1) {
        return class703.field9910 == null ? 0 : class703.field9910[arg0][arg1] & 0xFF;
    }

    @OriginalMember(owner = "client!vw", name = "b", descriptor = "(I)Lq;")
    public abstract class426 method1658(int arg0);

    @OriginalMember(owner = "client!vw", name = "a", descriptor = "(B)V")
    public abstract void method1656(byte arg0);

    @OriginalMember(owner = "client!vw", name = "a", descriptor = "(IIIILkw;)V")
    public static final void method1828(int arg0, int arg1, int arg2, int arg3, class249 arg4) {
        field3796++;
        arg4.field3016.method1421(arg3, -20798);
        arg4.field3016.method1470((byte) -122, arg1);
        arg4.field3016.method1449(-1, arg0);
        if (arg2 != 0) {
            method1826(-66, -34, 29);
        }
    }
}
