import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ad")
public class class5 extends class114 {

    @OriginalMember(owner = "client!ad", name = "P", descriptor = "Ljava/lang/String;")
    public static String field42 = "Please remove ";

    @OriginalMember(owner = "client!ad", name = "R", descriptor = "[I")
    public static int[] field44 = new int[] { 8, 11, 4, 6, 9, 7, 10, 0 };

    @OriginalMember(owner = "client!ad", name = "V", descriptor = "[I")
    public static int[] field48 = new int[2];

    @OriginalMember(owner = "client!ad", name = "T", descriptor = "Ljava/lang/String;")
    public static String field46 = "K";

    @OriginalMember(owner = "client!ad", name = "N", descriptor = "I")
    public static int field40;

    @OriginalMember(owner = "client!ad", name = "O", descriptor = "I")
    public static int field41;

    @OriginalMember(owner = "client!ad", name = "Q", descriptor = "I")
    public static int field43;

    @OriginalMember(owner = "client!ad", name = "S", descriptor = "I")
    public static int field45;

    @OriginalMember(owner = "client!ad", name = "U", descriptor = "I")
    public static int field47;

    @OriginalMember(owner = "client!ad", name = "F", descriptor = "Lnh;")
    public static class305 field39;

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(IZ)[I")
    public final int[] method16(int arg0, boolean arg1) {
        if (arg1) {
            field39 = null;
        }
        field45++;
        return class99.field1434;
    }

    @OriginalMember(owner = "client!ad", name = "c", descriptor = "(II)I")
    public static final int method22(int arg0, int arg1) {
        field41++;
        if (arg1 != 255) {
            field39 = null;
        }
        return arg0 & 0xFF;
    }

    @OriginalMember(owner = "client!ad", name = "h", descriptor = "(I)V")
    public static void method23(int arg0) {
        field44 = null;
        field46 = null;
        field48 = null;
        if (arg0 != 2) {
            field48 = null;
        }
        field42 = null;
        field39 = null;
    }

    @OriginalMember(owner = "client!ad", name = "e", descriptor = "(III)Lni;")
    public static final class308 method24(int arg0, int arg1, int arg2) {
        class91 var3 = class246.field3856[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class308 var4 = var3.field1323;
            var3.field1323 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!ad", name = "i", descriptor = "(I)V")
    public static final void method25(int arg0) {
        if (arg0 != 15167) {
            method25(18);
        }
        class277.field4401.method948((byte) 58);
        field40++;
    }

    @OriginalMember(owner = "client!ad", name = "<init>", descriptor = "()V")
    public class5() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(ILnh;)V")
    public static final void method26(int arg0, class305 arg1) {
        class4.field28 = arg1.method2081(-128, "titlebg");
        if (arg0 != 255) {
            field42 = null;
        }
        field43++;
        class91.field1320 = arg1.method2081(-127, "logo");
    }

    @OriginalMember(owner = "client!ad", name = "f", descriptor = "(III)J")
    public static final long method27(int arg0, int arg1, int arg2) {
        class91 var3 = class246.field3856[arg0][arg1][arg2];
        return var3 == null || var3.field1329 == null ? 0L : var3.field1329.field1055;
    }
}
