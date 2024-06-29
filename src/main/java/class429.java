import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!va")
public abstract class class429 {

    @OriginalMember(owner = "client!va", name = "d", descriptor = "I")
    public static int field6362 = 0;

    @OriginalMember(owner = "client!va", name = "c", descriptor = "Lkca;")
    public static class73 field6361 = new class73(2, 4);

    @OriginalMember(owner = "client!va", name = "f", descriptor = "[I")
    public static int[] field6364 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @OriginalMember(owner = "client!va", name = "a", descriptor = "I")
    public static int field6359;

    @OriginalMember(owner = "client!va", name = "b", descriptor = "I")
    public static int field6360;

    @OriginalMember(owner = "client!va", name = "e", descriptor = "[I")
    public static int[] field6363;

    @OriginalMember(owner = "client!va", name = "f", descriptor = "(I)Z")
    public abstract boolean method84(int arg0);

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(IILoa;I)Z")
    public abstract boolean method91(int arg0, int arg1, class605 arg2, int arg3);

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(Loa;B)Laca;")
    public abstract class630 method88(class605 arg0, byte arg1);

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(Loa;I)V")
    public abstract void method90(class605 arg0, int arg1);

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(BII)Z")
    public static final boolean method2674(byte arg0, int arg1, int arg2) {
        if (arg0 != -4) {
            field6362 = -74;
        }
        field6360++;
        return (arg2 & 0x10) != 0;
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(B)V")
    public static void method2675(byte arg0) {
        field6361 = null;
        field6364 = null;
        if (arg0 != 79) {
            method2675((byte) -51);
        }
        field6363 = null;
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(IIILva;Loa;ZI)V")
    public abstract void method86(int arg0, int arg1, int arg2, class429 arg3, class605 arg4, boolean arg5, int arg6);

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(III)Z")
    public static final boolean method2676(int arg0, int arg1, int arg2) {
        field6359++;
        if (arg2 != -13555) {
            field6363 = null;
        }
        return (arg0 & 0x800) != 0;
    }

    @OriginalMember(owner = "client!va", name = "b", descriptor = "(Loa;I)Lew;")
    public abstract class425 method100(class605 arg0, int arg1);

    @OriginalMember(owner = "client!va", name = "b", descriptor = "(B)V")
    public abstract void method96(byte arg0);
}
