import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mm")
public class class285 extends class182 {

    @OriginalMember(owner = "client!mm", name = "M", descriptor = "I")
    private int field4659;

    @OriginalMember(owner = "client!mm", name = "I", descriptor = "Z")
    public static boolean field4657 = false;

    @OriginalMember(owner = "client!mm", name = "N", descriptor = "I")
    public static int field4660 = 0;

    @OriginalMember(owner = "client!mm", name = "K", descriptor = "I")
    public static int field4658;

    @OriginalMember(owner = "client!mm", name = "Q", descriptor = "I")
    public static int field4663;

    @OriginalMember(owner = "client!mm", name = "R", descriptor = "I")
    public static int field4664;

    @OriginalMember(owner = "client!mm", name = "S", descriptor = "I")
    public static int field4665;

    @OriginalMember(owner = "client!mm", name = "U", descriptor = "I")
    public static int field4667;

    @OriginalMember(owner = "client!mm", name = "V", descriptor = "I")
    public static int field4668;

    @OriginalMember(owner = "client!mm", name = "O", descriptor = "Lek;")
    public static class206 field4661;

    @OriginalMember(owner = "client!mm", name = "P", descriptor = "Lae;")
    public static class310 field4662;

    @OriginalMember(owner = "client!mm", name = "T", descriptor = "Lv;")
    public static class83 field4666;

    @OriginalMember(owner = "client!mm", name = "g", descriptor = "(I)V", line = 9)
    public static final void method2022(int arg0) {
        if (arg0 != 29909) {
            method2025(-59, (class206) null, 41, 124);
        }
        class261.field4304.method889((byte) 117);
        field4664++;
    }

    @OriginalMember(owner = "client!mm", name = "h", descriptor = "(I)V", line = 23)
    public static void method2023(int arg0) {
        field4662 = null;
        field4661 = null;
        if (arg0 == 0) {
            field4666 = null;
        }
    }

    @OriginalMember(owner = "client!mm", name = "<init>", descriptor = "(I)V", line = 34)
    public class285(int arg0) {
        super(0, true);
        this.field4659 = 4096;
        this.field4659 = arg0;
    }

    @OriginalMember(owner = "client!mm", name = "b", descriptor = "(B)V", line = 43)
    public static final void method2024(byte arg0) {
        field4665++;
        class173.field2874.method889((byte) -128);
        class235.field3846.method889((byte) -122);
        if (arg0 > -10) {
            method2022(59);
        }
    }

    @OriginalMember(owner = "client!mm", name = "<init>", descriptor = "()V", line = 68)
    public class285() {
        this(4096);
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(ILek;II)[Lsc;", line = 72)
    public static final class288[] method2025(int arg0, class206 arg1, int arg2, int arg3) {
        if (arg0 == 4096) {
            field4668++;
            return class76.method581(arg1, 93, arg3, arg2) ? class166.method1187(0) : null;
        } else {
            return (class288[]) null;
        }
    }

    @OriginalMember(owner = "client!mm", name = "b", descriptor = "(II)[I", line = 89)
    public final int[] method125(int arg0, int arg1) {
        if (arg0 != 2) {
            this.method126((class146) null, 95, (byte) -58);
        }
        field4667++;
        int[] var3 = this.field3166.method775(arg1, arg0 + 125);
        if (this.field3166.field1903) {
            class89.method688(var3, 0, class26.field672, this.field4659);
        }
        return var3;
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(Loe;IB)V", line = 110)
    public final void method126(class146 arg0, int arg1, byte arg2) {
        field4663++;
        if (arg1 == 0) {
            this.field4659 = (arg0.method1005((byte) 122) << 12) / 255;
        }
        if (arg2 != 60) {
            this.method125(-104, -2);
        }
    }
}
