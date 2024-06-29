import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pf")
public class class213 extends class104 {

    @OriginalMember(owner = "client!pf", name = "y", descriptor = "I")
    public int field3756 = 0;

    @OriginalMember(owner = "client!pf", name = "R", descriptor = "I")
    public int field3775 = -1;

    @OriginalMember(owner = "client!pf", name = "x", descriptor = "Le;")
    public static class191 field3755 = class54.method368("<col=ffb000>", 2047);

    @OriginalMember(owner = "client!pf", name = "G", descriptor = "I")
    public static int field3764 = 0;

    @OriginalMember(owner = "client!pf", name = "L", descriptor = "Le;")
    public static class191 field3769 = class54.method368(" <col=00ff80>", 2047);

    @OriginalMember(owner = "client!pf", name = "O", descriptor = "Z")
    public static boolean field3772 = true;

    @OriginalMember(owner = "client!pf", name = "B", descriptor = "Le;")
    public static class191 field3759 = class54.method368("Schlie-8en", 2047);

    @OriginalMember(owner = "client!pf", name = "z", descriptor = "I")
    public int field3757;

    @OriginalMember(owner = "client!pf", name = "A", descriptor = "I")
    public int field3758;

    @OriginalMember(owner = "client!pf", name = "D", descriptor = "I")
    public int field3761;

    @OriginalMember(owner = "client!pf", name = "E", descriptor = "I")
    public static int field3762;

    @OriginalMember(owner = "client!pf", name = "F", descriptor = "I")
    public int field3763;

    @OriginalMember(owner = "client!pf", name = "H", descriptor = "I")
    public int field3765;

    @OriginalMember(owner = "client!pf", name = "I", descriptor = "I")
    public int field3766;

    @OriginalMember(owner = "client!pf", name = "J", descriptor = "I")
    public int field3767;

    @OriginalMember(owner = "client!pf", name = "K", descriptor = "I")
    public int field3768;

    @OriginalMember(owner = "client!pf", name = "M", descriptor = "I")
    public int field3770;

    @OriginalMember(owner = "client!pf", name = "N", descriptor = "I")
    public int field3771;

    @OriginalMember(owner = "client!pf", name = "P", descriptor = "I")
    public static int field3773;

    @OriginalMember(owner = "client!pf", name = "Q", descriptor = "I")
    public static int field3774;

    @OriginalMember(owner = "client!pf", name = "C", descriptor = "[[[B")
    public static byte[][][] field3760;

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(IZ)Z")
    public static final boolean method1457(int arg0, boolean arg1) {
        field3762++;
        if (arg1) {
            method1458((byte) 30);
        }
        return (arg0 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!pf", name = "b", descriptor = "(B)V")
    public static void method1458(byte arg0) {
        field3769 = null;
        field3755 = null;
        if (arg0 != -19) {
            method1459(94, (byte) -77, 101, -35);
        }
        field3759 = null;
        field3760 = null;
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(IBII)I")
    public static final int method1459(int arg0, byte arg1, int arg2, int arg3) {
        field3774++;
        if (arg1 > -3) {
            return -96;
        } else if (arg2 > arg0) {
            return arg2;
        } else if (arg0 <= arg3) {
            return arg0;
        } else {
            return arg3;
        }
    }
}
