import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!us")
public abstract class class428 extends class242 {

    @OriginalMember(owner = "client!us", name = "n", descriptor = "I")
    public static int field5866 = 0;

    @OriginalMember(owner = "client!us", name = "o", descriptor = "Z")
    public static boolean field5867 = true;

    @OriginalMember(owner = "client!us", name = "v", descriptor = "Z")
    public static boolean field5874 = false;

    @OriginalMember(owner = "client!us", name = "i", descriptor = "I")
    public int field5861;

    @OriginalMember(owner = "client!us", name = "j", descriptor = "I")
    public static int field5862;

    @OriginalMember(owner = "client!us", name = "k", descriptor = "I")
    public int field5863;

    @OriginalMember(owner = "client!us", name = "l", descriptor = "I")
    public int field5864;

    @OriginalMember(owner = "client!us", name = "p", descriptor = "I")
    public static int field5868;

    @OriginalMember(owner = "client!us", name = "q", descriptor = "I")
    public static int field5869;

    @OriginalMember(owner = "client!us", name = "r", descriptor = "I")
    public static int field5870;

    @OriginalMember(owner = "client!us", name = "s", descriptor = "I")
    public static int field5871;

    @OriginalMember(owner = "client!us", name = "t", descriptor = "I")
    public static int field5872;

    @OriginalMember(owner = "client!us", name = "u", descriptor = "I")
    public static int field5873;

    @OriginalMember(owner = "client!us", name = "m", descriptor = "Z")
    public boolean field5865;

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(B)V", line = 4)
    public final void method173(byte arg0) {
        if (arg0 == -32) {
            field5872++;
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(BLrn;ZIILqa;I)V", line = 19)
    public final void method174(byte arg0, class242 arg1, boolean arg2, int arg3, int arg4, class129 arg5, int arg6) {
        field5871++;
        if (arg0 != 91) {
            field5874 = false;
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(I)[Lum;", line = 32)
    public static final class82[] method2534(int arg0) {
        field5862++;
        if (arg0 != -1) {
            field5874 = false;
        }
        return new class82[] { class246.field3151, class282.field3603, class524.field7764, class203.field2656, class114.field1562, class89.field1237 };
    }

    @OriginalMember(owner = "client!us", name = "e", descriptor = "(I)Z", line = 47)
    public final boolean method177(int arg0) {
        field5873++;
        return arg0 == 5 ? false : false;
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(BII)Z", line = 64)
    public static final boolean method2535(byte arg0, int arg1, int arg2) {
        if (arg0 < 46) {
            field5869 = 26;
        }
        field5868++;
        return (arg1 & 0x800) != 0;
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(III)V", line = 83)
    public static final void method2536(int arg0, int arg1, int arg2) {
        class510 var3 = class470.field6877[arg0][arg1][arg2];
        if (var3 == null) {
            return;
        }
        if (var3.field7499 != null) {
            var3.field7499 = null;
        }
        if (var3.field7502 != null) {
            var3.field7502 = null;
        }
    }
}
