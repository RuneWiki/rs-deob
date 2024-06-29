import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eg")
public class class91 extends class11 {

    @OriginalMember(owner = "client!eg", name = "j", descriptor = "Lhb;")
    public static class629 field1041 = new class629(14, 16);

    @OriginalMember(owner = "client!eg", name = "u", descriptor = "Lig;")
    public static class206 field1052 = new class206(102, 8);

    @OriginalMember(owner = "client!eg", name = "v", descriptor = "[I")
    public static int[] field1053 = new int[1];

    @OriginalMember(owner = "client!eg", name = "k", descriptor = "I")
    public static int field1042;

    @OriginalMember(owner = "client!eg", name = "l", descriptor = "I")
    public static int field1043;

    @OriginalMember(owner = "client!eg", name = "m", descriptor = "I")
    public static int field1044;

    @OriginalMember(owner = "client!eg", name = "n", descriptor = "I")
    public static int field1045;

    @OriginalMember(owner = "client!eg", name = "o", descriptor = "I")
    public static int field1046;

    @OriginalMember(owner = "client!eg", name = "p", descriptor = "I")
    public static int field1047;

    @OriginalMember(owner = "client!eg", name = "q", descriptor = "I")
    public static int field1048;

    @OriginalMember(owner = "client!eg", name = "s", descriptor = "I")
    public static int field1050;

    @OriginalMember(owner = "client!eg", name = "t", descriptor = "I")
    public static int field1051;

    @OriginalMember(owner = "client!eg", name = "r", descriptor = "[[[B")
    public static byte[][][] field1049;

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(I)V")
    public final void method63(int arg0) {
        super.field95.method2308((byte) -46, false);
        int var2 = 84 / ((arg0 - -61) / 40);
        ++field1043;
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(IIB)V")
    public final void method62(int arg0, int arg1, byte arg2) {
        ++field1045;
        if (arg2 <= 124) {
            field1053 = null;
        }
    }

    @OriginalMember(owner = "client!eg", name = "b", descriptor = "(IZ)Z")
    public static final boolean method580(int arg0, boolean arg1) {
        ++field1044;
        if (arg1) {
            method581((byte) 83);
        }
        return ~arg0 <= -5 && ~arg0 >= -9;
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(B)Z")
    public final boolean method68(byte arg0) {
        if (arg0 != 95) {
            this.method68((byte) -46);
        }
        ++field1046;
        return true;
    }

    @OriginalMember(owner = "client!eg", name = "b", descriptor = "(B)V")
    public static void method581(byte arg0) {
        field1041 = null;
        field1053 = null;
        field1049 = null;
        field1052 = null;
        if (arg0 <= 34) {
            field1052 = null;
        }
    }

    @OriginalMember(owner = "client!eg", name = "<init>", descriptor = "(Lad;)V")
    public class91(class362 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(ZZ)V")
    public final void method64(boolean arg0, boolean arg1) {
        if (arg0) {
            ++field1050;
        }
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(IILpm;)V")
    public final void method65(int arg0, int arg1, class507 arg2) {
        super.field95.method2295(arg1 ^ 86, arg2);
        if (arg1 == -1) {
            ++field1042;
            super.field95.method2288(arg0, 7681);
        }
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(Ljava/lang/String;B)I")
    public static final int method582(String arg0, byte arg1) {
        ++field1051;
        for (int var2 = 0; class362.field5239.length > var2; ++var2) {
            if (class362.field5239[var2].equalsIgnoreCase(arg0)) {
                return var2;
            }
        }
        if (arg1 != -75) {
            field1047 = -125;
        }
        return -1;
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(IZ)V")
    public final void method67(int arg0, boolean arg1) {
        super.field95.method2308((byte) -46, true);
        if (arg0 >= 115) {
            ++field1048;
        }
    }
}
