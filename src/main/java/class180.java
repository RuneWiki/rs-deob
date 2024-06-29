import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nm")
public class class180 extends class232 {

    @OriginalMember(owner = "client!nm", name = "I", descriptor = "[B")
    public byte[] field3022;

    @OriginalMember(owner = "client!nm", name = "H", descriptor = "Lok;")
    public static class146 field3021 = class235.method1724(-12908, "k");

    @OriginalMember(owner = "client!nm", name = "N", descriptor = "I")
    public static int field3026 = 0;

    @OriginalMember(owner = "client!nm", name = "L", descriptor = "I")
    public static int field3024 = 0;

    @OriginalMember(owner = "client!nm", name = "S", descriptor = "Lok;")
    public static class146 field3031 = class235.method1724(-12908, "document)3cookie=(R");

    @OriginalMember(owner = "client!nm", name = "T", descriptor = "Lok;")
    public static class146 field3032 = class235.method1724(-12908, "Chargement des interfaces )2 ");

    @OriginalMember(owner = "client!nm", name = "G", descriptor = "I")
    public static int field3020;

    @OriginalMember(owner = "client!nm", name = "J", descriptor = "I")
    public static int field3023;

    @OriginalMember(owner = "client!nm", name = "M", descriptor = "I")
    public static int field3025;

    @OriginalMember(owner = "client!nm", name = "O", descriptor = "I")
    public static int field3027;

    @OriginalMember(owner = "client!nm", name = "P", descriptor = "I")
    public static int field3028;

    @OriginalMember(owner = "client!nm", name = "R", descriptor = "I")
    public static int field3030;

    @OriginalMember(owner = "client!nm", name = "Q", descriptor = "Loh;")
    public static class15 field3029;

    @OriginalMember(owner = "client!nm", name = "F", descriptor = "Ljava/lang/String;")
    public static String field3019;

    @OriginalMember(owner = "client!nm", name = "b", descriptor = "(II)V", line = 12)
    public static final void method1412(int arg0, int arg1) {
        field3028++;
        if (arg1 > -12) {
            method1412(-71, -50);
        }
        class202.field3373 = arg0;
        class147.method1137((byte) -67, 3);
        class147.method1137((byte) -49, 4);
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(III)I", line = 27)
    public static final int method1413(int arg0, int arg1, int arg2) {
        field3027++;
        int var3 = 4 % ((arg2 + 7) / 61);
        if (arg1 > arg0) {
            int var4 = arg0;
            arg0 = arg1;
            arg1 = var4;
        }
        while (arg1 != 0) {
            int var5 = arg0 % arg1;
            arg0 = arg1;
            arg1 = var5;
        }
        return arg0;
    }

    @OriginalMember(owner = "client!nm", name = "<init>", descriptor = "([B)V", line = 53)
    public class180(byte[] arg0) {
        this.field3022 = arg0;
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(ILoh;Loh;)V", line = 73)
    public static final void method1414(int arg0, class15 arg1, class15 arg2) {
        class183.field3067 = arg2;
        if (arg0 != -12888) {
            field3023 = 89;
        }
        field3025++;
        class229.field3825 = arg1;
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(Z)V", line = 89)
    public static void method1415(boolean arg0) {
        field3021 = null;
        field3029 = null;
        if (arg0) {
            field3032 = null;
            field3019 = null;
            field3031 = null;
        }
    }
}
