import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bca")
public class class615 extends class425 {

    @OriginalMember(owner = "client!bca", name = "j", descriptor = "I")
    public int field8934;

    @OriginalMember(owner = "client!bca", name = "q", descriptor = "I")
    public int field8941;

    @OriginalMember(owner = "client!bca", name = "k", descriptor = "I")
    public static int field8935;

    @OriginalMember(owner = "client!bca", name = "l", descriptor = "I")
    public static int field8936;

    @OriginalMember(owner = "client!bca", name = "m", descriptor = "I")
    public static int field8937;

    @OriginalMember(owner = "client!bca", name = "n", descriptor = "I")
    public static int field8938;

    @OriginalMember(owner = "client!bca", name = "o", descriptor = "I")
    public static int field8939;

    @OriginalMember(owner = "client!bca", name = "p", descriptor = "I")
    public static int field8940;

    @OriginalMember(owner = "client!bca", name = "a", descriptor = "(II)Z")
    public final boolean method3527(int arg0, int arg1) {
        if (arg1 != 1776287617) {
            this.field8941 = -28;
        }
        field8940++;
        return (this.field8941 >> arg0 + 1 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!bca", name = "a", descriptor = "(B)I")
    public final int method3528(byte arg0) {
        if (arg0 != 2) {
            this.method3529((byte) -94);
        }
        field8937++;
        return class590.method3367(this.field8941, 118);
    }

    @OriginalMember(owner = "client!bca", name = "b", descriptor = "(B)Z")
    public final boolean method3529(byte arg0) {
        field8938++;
        if (arg0 != 11) {
            this.field8934 = -126;
        }
        return (this.field8941 & 0x43A416) >> 22 != 0;
    }

    @OriginalMember(owner = "client!bca", name = "a", descriptor = "(Z)I")
    public final int method3530(boolean arg0) {
        if (arg0) {
            return -67;
        } else {
            field8939++;
            return (this.field8941 & 0x1F00E3) >> 18;
        }
    }

    @OriginalMember(owner = "client!bca", name = "c", descriptor = "(B)Z")
    public final boolean method3531(byte arg0) {
        if (arg0 != -99) {
            this.field8934 = -54;
        }
        field8935++;
        return (this.field8941 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!bca", name = "a", descriptor = "(I)Z")
    public final boolean method3532(int arg0) {
        field8936++;
        if (arg0 == 4222) {
            return ((this.field8941 & 0x3B2BF6) >> 21) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!bca", name = "<init>", descriptor = "(II)V")
    public class615(int arg0, int arg1) {
        this.field8934 = arg1;
        this.field8941 = arg0;
    }
}
