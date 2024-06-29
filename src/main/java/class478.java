import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ea")
public class class478 extends class430 {

    @OriginalMember(owner = "client!ea", name = "o", descriptor = "I")
    public int field6793;

    @OriginalMember(owner = "client!ea", name = "l", descriptor = "I")
    public int field6790;

    @OriginalMember(owner = "client!ea", name = "g", descriptor = "I")
    public static int field6785;

    @OriginalMember(owner = "client!ea", name = "h", descriptor = "I")
    public static int field6786;

    @OriginalMember(owner = "client!ea", name = "i", descriptor = "I")
    public static int field6787;

    @OriginalMember(owner = "client!ea", name = "j", descriptor = "I")
    public static int field6788;

    @OriginalMember(owner = "client!ea", name = "k", descriptor = "I")
    public static int field6789;

    @OriginalMember(owner = "client!ea", name = "m", descriptor = "I")
    public static int field6791;

    @OriginalMember(owner = "client!ea", name = "n", descriptor = "I")
    public static int field6792;

    @OriginalMember(owner = "client!ea", name = "p", descriptor = "I")
    public static int field6794;

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(BLla;)V")
    public static final void method2853(byte arg0, class423 arg1) {
        class257.field3688 = arg1;
        field6786++;
        if (arg0 <= 99) {
            method2853((byte) -106, null);
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(I)I")
    public final int method2854(int arg0) {
        field6785++;
        if (arg0 != 21974) {
            method2853((byte) -107, null);
        }
        return (this.field6793 & 0x1F6626) >> 18;
    }

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "(I)Z")
    public final boolean method2855(int arg0) {
        if (arg0 != 0) {
            this.method2854(-53);
        }
        field6794++;
        return (this.field6793 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(BI)Z")
    public final boolean method2856(byte arg0, int arg1) {
        if (arg0 != 47) {
            this.field6790 = -76;
        }
        field6787++;
        return (this.field6793 >> arg1 + 1 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!ea", name = "<init>", descriptor = "(II)V")
    public class478(int arg0, int arg1) {
        this.field6793 = arg0;
        this.field6790 = arg1;
    }

    @OriginalMember(owner = "client!ea", name = "c", descriptor = "(I)Z")
    public final boolean method2857(int arg0) {
        field6788++;
        if (arg0 != 0) {
            method2853((byte) -60, null);
        }
        return (this.field6793 >> 22 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "(Z)Z")
    public final boolean method2858(boolean arg0) {
        field6791++;
        if (arg0) {
            this.field6793 = -10;
        }
        return (this.field6793 >> 21 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(BII)Z")
    public static final boolean method2859(byte arg0, int arg1, int arg2) {
        field6792++;
        return arg0 >= -72 ? false : class514.method3126(arg1, 0, arg2) & class192.method1350(arg1, arg2, 68);
    }

    @OriginalMember(owner = "client!ea", name = "c", descriptor = "(Z)I")
    public final int method2860(boolean arg0) {
        if (arg0) {
            return -62;
        } else {
            field6789++;
            return class428.method2651(this.field6793, (byte) -99);
        }
    }
}
