import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sc")
public class class44 {

    @OriginalMember(owner = "client!sc", name = "e", descriptor = "Z")
    public static boolean field665 = true;

    @OriginalMember(owner = "client!sc", name = "d", descriptor = "Z")
    public static boolean field664 = false;

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "I")
    public static int field662;

    @OriginalMember(owner = "client!sc", name = "c", descriptor = "I")
    public static int field663;

    @OriginalMember(owner = "client!sc", name = "f", descriptor = "Lkha;")
    public static class687 field666;

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "[I")
    public static int[] field661;

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(B)V")
    public static void method365(byte arg0) {
        field666 = null;
        field661 = null;
        if (arg0 > -77) {
            field666 = null;
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(IZI)I")
    public static final int method366(int arg0, boolean arg1, int arg2) {
        field662++;
        int var3 = (arg0 & 0x7F) * arg2 >> 7;
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        if (arg1) {
            method367((byte) 108);
        }
        return (arg0 & 0xFF80) + var3;
    }

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "(B)Ljava/lang/String;")
    public static final String method367(byte arg0) {
        if (arg0 != 7) {
            field665 = true;
        }
        field663++;
        if (class322.field4113 || class750.field10502 == null) {
            return "";
        } else if ((class750.field10502.field10124 == null || class750.field10502.field10124.length() == 0) && class750.field10502.field10123 != null && class750.field10502.field10123.length() > 0) {
            return class750.field10502.field10123;
        } else {
            return class750.field10502.field10124;
        }
    }
}
