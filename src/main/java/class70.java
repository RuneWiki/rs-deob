import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dl")
public class class70 implements class721 {

    @OriginalMember(owner = "client!dl", name = "n", descriptor = "I")
    public int field1040;

    @OriginalMember(owner = "client!dl", name = "m", descriptor = "Lcq;")
    public class494 field1039;

    @OriginalMember(owner = "client!dl", name = "e", descriptor = "I")
    public int field1031;

    @OriginalMember(owner = "client!dl", name = "f", descriptor = "I")
    public int field1032;

    @OriginalMember(owner = "client!dl", name = "h", descriptor = "I")
    public int field1034;

    @OriginalMember(owner = "client!dl", name = "g", descriptor = "I")
    public int field1033;

    @OriginalMember(owner = "client!dl", name = "i", descriptor = "I")
    public int field1035;

    @OriginalMember(owner = "client!dl", name = "d", descriptor = "I")
    public int field1030;

    @OriginalMember(owner = "client!dl", name = "o", descriptor = "Leaa;")
    public class528 field1041;

    @OriginalMember(owner = "client!dl", name = "b", descriptor = "I")
    public static int field1028 = 0;

    @OriginalMember(owner = "client!dl", name = "l", descriptor = "[I")
    public static int[] field1038 = new int[1];

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "Lfja;")
    public static class783 field1027 = new class783(17, 6);

    @OriginalMember(owner = "client!dl", name = "p", descriptor = "Lfja;")
    public static class783 field1042 = new class783(57, 6);

    @OriginalMember(owner = "client!dl", name = "q", descriptor = "I")
    public static int field1043 = 0;

    @OriginalMember(owner = "client!dl", name = "c", descriptor = "I")
    public static int field1029;

    @OriginalMember(owner = "client!dl", name = "j", descriptor = "I")
    public static int field1036;

    @OriginalMember(owner = "client!dl", name = "r", descriptor = "I")
    public static int field1044;

    @OriginalMember(owner = "client!dl", name = "k", descriptor = "[Lnf;")
    public static class604[] field1037;

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(BIII)Z")
    public static final boolean method628(byte arg0, int arg1, int arg2, int arg3) {
        class228.field3326.method1878(arg3, arg2, arg1, class508.field6979);
        if (arg0 != -51) {
            field1038 = null;
        }
        field1036++;
        int var4 = class508.field6979[2];
        if (var4 < 50) {
            return false;
        } else {
            class508.field6979[2] = var4;
            class508.field6979[1] = class508.field6979[1] * class159.field2570 / var4 + class715.field9838;
            class508.field6979[0] = class508.field6979[0] * class129.field2256 / var4 + class45.field705;
            return true;
        }
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(I)Laca;")
    public class758 method228(int arg0) {
        field1029++;
        if (arg0 != 1) {
            method629(true);
        }
        return null;
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(Z)V")
    public static void method629(boolean arg0) {
        field1027 = null;
        field1042 = null;
        field1037 = null;
        field1038 = null;
        if (arg0) {
            method629(false);
        }
    }

    @OriginalMember(owner = "client!dl", name = "<init>", descriptor = "(Leaa;Lcq;IIIIIII)V")
    public class70(class528 arg0, class494 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        this.field1040 = arg8;
        this.field1039 = arg1;
        this.field1031 = arg4;
        this.field1032 = arg6;
        this.field1034 = arg7;
        this.field1033 = arg3;
        this.field1035 = arg2;
        this.field1030 = arg5;
        this.field1041 = arg0;
    }
}
