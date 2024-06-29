import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qea")
public class class137 extends class264 {

    @OriginalMember(owner = "client!qea", name = "m", descriptor = "Lks;")
    public static class460 field1786 = new class460("", 16);

    @OriginalMember(owner = "client!qea", name = "k", descriptor = "I")
    public static int field1784;

    @OriginalMember(owner = "client!qea", name = "l", descriptor = "I")
    public static int field1785;

    @OriginalMember(owner = "client!qea", name = "n", descriptor = "I")
    public static int field1787;

    @OriginalMember(owner = "client!qea", name = "o", descriptor = "I")
    public static int field1788;

    @OriginalMember(owner = "client!qea", name = "p", descriptor = "I")
    public static int field1789;

    @OriginalMember(owner = "client!qea", name = "r", descriptor = "I")
    public static int field1791;

    @OriginalMember(owner = "client!qea", name = "q", descriptor = "[Ltt;")
    public static class100[] field1790;

    @OriginalMember(owner = "client!qea", name = "b", descriptor = "(B)I", line = 3)
    public final int method968(byte arg0) {
        if (arg0 >= -31) {
            field1790 = null;
        }
        ++field1791;
        return super.field3733;
    }

    @OriginalMember(owner = "client!qea", name = "b", descriptor = "(II)I", line = 18)
    public static final int method969(int arg0, int arg1) {
        if (arg0 != 255) {
            return -17;
        } else {
            ++field1789;
            return 255 & arg1;
        }
    }

    @OriginalMember(owner = "client!qea", name = "b", descriptor = "(I)V", line = 29)
    public final void method660(int arg0) {
        if (~super.field3733 != -2 && ~super.field3733 != -1) {
            super.field3733 = this.method663((byte) -38);
        }
        ++field1788;
        int var2 = 102 % ((1 - arg0) / 41);
    }

    @OriginalMember(owner = "client!qea", name = "c", descriptor = "(B)V", line = 41)
    public static void method970(byte arg0) {
        field1790 = null;
        field1786 = null;
        if (arg0 < 123) {
            field1786 = null;
        }
    }

    @OriginalMember(owner = "client!qea", name = "b", descriptor = "(BI)V", line = 52)
    public final void method659(byte arg0, int arg1) {
        super.field3733 = arg1;
        if (arg0 < -114) {
            ++field1785;
        }
    }

    @OriginalMember(owner = "client!qea", name = "<init>", descriptor = "(ILmfa;)V", line = 63)
    public class137(int arg0, class640 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!qea", name = "a", descriptor = "(BI)I", line = 66)
    public final int method666(byte arg0, int arg1) {
        if (arg0 != 112) {
            method970((byte) -56);
        }
        ++field1784;
        return 1;
    }

    @OriginalMember(owner = "client!qea", name = "a", descriptor = "(B)I", line = 79)
    public final int method663(byte arg0) {
        if (arg0 != -38) {
            return -88;
        } else {
            ++field1787;
            return 1;
        }
    }

    @OriginalMember(owner = "client!qea", name = "<init>", descriptor = "(Lmfa;)V", line = 93)
    public class137(class640 arg0) {
        super(arg0);
    }
}
