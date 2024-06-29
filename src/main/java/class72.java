import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qr")
public class class72 {

    @OriginalMember(owner = "client!qr", name = "c", descriptor = "I")
    public int field1051;

    @OriginalMember(owner = "client!qr", name = "e", descriptor = "I")
    public int field1053;

    @OriginalMember(owner = "client!qr", name = "l", descriptor = "Lvl;")
    public static class15 field1060 = new class15(16, 8);

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "F")
    public static float field1049;

    @OriginalMember(owner = "client!qr", name = "b", descriptor = "I")
    public static int field1050;

    @OriginalMember(owner = "client!qr", name = "f", descriptor = "I")
    public int field1054;

    @OriginalMember(owner = "client!qr", name = "g", descriptor = "I")
    public static int field1055;

    @OriginalMember(owner = "client!qr", name = "h", descriptor = "I")
    public static int field1056;

    @OriginalMember(owner = "client!qr", name = "i", descriptor = "I")
    public static int field1057;

    @OriginalMember(owner = "client!qr", name = "k", descriptor = "I")
    public static int field1059;

    @OriginalMember(owner = "client!qr", name = "m", descriptor = "I")
    public int field1061;

    @OriginalMember(owner = "client!qr", name = "n", descriptor = "I")
    public int field1062;

    @OriginalMember(owner = "client!qr", name = "d", descriptor = "Lsk;")
    public class650 field1052;

    @OriginalMember(owner = "client!qr", name = "j", descriptor = "Lqr;")
    public class72 field1058;

    @OriginalMember(owner = "client!qr", name = "o", descriptor = "[I")
    public static int[] field1063;

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(I)V", line = 7)
    public static void method632(int arg0) {
        field1063 = null;
        if (arg0 > 69) {
            field1060 = null;
        }
    }

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(BI)V", line = 20)
    public static final void method633(byte arg0, int arg1) {
        field1059++;
        if (arg1 < 0 || arg1 > 2) {
            arg1 = 0;
        }
        class393.field5437 = arg1;
        class653.field9050 = new class788[class522.field7072[class393.field5437] + 1];
        class6.field116 = 0;
        if (arg0 == -6) {
            class193.field2951 = 0;
        }
    }

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(Lda;)V", line = 39)
    public static final void method634(class67 arg0) {
        class82.field1137 = arg0;
    }

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(IBI)I", line = 42)
    public static final int method635(int arg0, byte arg1, int arg2) {
        field1055++;
        if (arg1 > -40) {
            method635(-93, (byte) 111, 116);
        }
        return arg0 == 1 || arg0 == 3 ? class358.field4903[arg2 & 0x3] : class112.field2105[arg2 & 0x3];
    }

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(Z)Lom;", line = 61)
    public final class395 method636(boolean arg0) {
        field1050++;
        if (!arg0) {
            this.method636(false);
        }
        return class336.method2104(this.field1053, false);
    }

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(II)Lqr;", line = 79)
    public final class72 method637(int arg0, int arg1) {
        field1056++;
        return arg0 == -27004 ? new class72(this.field1053, arg1) : null;
    }

    @OriginalMember(owner = "client!qr", name = "<init>", descriptor = "(II)V", line = 89)
    public class72(int arg0, int arg1) {
        this.field1051 = arg1;
        this.field1053 = arg0;
    }
}
