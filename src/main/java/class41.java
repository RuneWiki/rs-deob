import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eb")
public class class41 {

    @OriginalMember(owner = "client!eb", name = "f", descriptor = "I")
    public static int field954 = 0;

    @OriginalMember(owner = "client!eb", name = "b", descriptor = "Lgg;")
    public static class63 field950 = class116.method911(43, "Verbindung abgebrochen)3");

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "I")
    public int field949;

    @OriginalMember(owner = "client!eb", name = "c", descriptor = "I")
    public static int field951;

    @OriginalMember(owner = "client!eb", name = "g", descriptor = "I")
    public static int field955;

    @OriginalMember(owner = "client!eb", name = "h", descriptor = "I")
    public int field956;

    @OriginalMember(owner = "client!eb", name = "i", descriptor = "I")
    public int field957;

    @OriginalMember(owner = "client!eb", name = "j", descriptor = "I")
    public static int field958;

    @OriginalMember(owner = "client!eb", name = "k", descriptor = "I")
    public static int field959;

    @OriginalMember(owner = "client!eb", name = "l", descriptor = "I")
    public static int field960;

    @OriginalMember(owner = "client!eb", name = "m", descriptor = "J")
    public long field961;

    @OriginalMember(owner = "client!eb", name = "d", descriptor = "Lrc;")
    public static class156 field952;

    @OriginalMember(owner = "client!eb", name = "e", descriptor = "Ld;")
    public class30 field953;

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(I)V")
    public static void method367(int arg0) {
        field952 = null;
        field950 = null;
        if (arg0 != 24642) {
            method368(false, 109, true);
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(ZIZ)I")
    public static final int method368(boolean arg0, int arg1, boolean arg2) {
        field955++;
        int var3 = arg1;
        if (arg2) {
            var3 = class199.field3973 + class113.field2547 + arg1;
        }
        if (arg0) {
            var3 += class45.field1074 + class191.field3878;
        }
        return var3;
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(II)I")
    public static final int method369(int arg0, int arg1) {
        field960++;
        int var2 = arg1;
        if (arg0 < 0 || arg0 >= 65536) {
            var2 = arg1 + 16;
            arg0 >>>= 0x10;
        }
        if (arg0 >= 256) {
            arg0 >>>= 0x8;
            var2 += 8;
        }
        if (arg0 >= 16) {
            var2 += 4;
            arg0 >>>= 0x4;
        }
        if (arg0 >= 4) {
            arg0 >>>= 0x2;
            var2 += 2;
        }
        if (arg0 >= 1) {
            arg0 >>>= 0x1;
            var2++;
        }
        return arg0 + var2;
    }
}
