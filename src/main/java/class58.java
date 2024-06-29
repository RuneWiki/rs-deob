import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pd")
public class class58 extends class86 {

    @OriginalMember(owner = "client!pd", name = "G", descriptor = "[Ljava/lang/String;")
    public static String[] field908 = new String[8];

    @OriginalMember(owner = "client!pd", name = "o", descriptor = "I")
    public int field891;

    @OriginalMember(owner = "client!pd", name = "p", descriptor = "I")
    public int field892;

    @OriginalMember(owner = "client!pd", name = "q", descriptor = "I")
    public static int field893;

    @OriginalMember(owner = "client!pd", name = "r", descriptor = "I")
    public static int field894;

    @OriginalMember(owner = "client!pd", name = "s", descriptor = "I")
    public int field895;

    @OriginalMember(owner = "client!pd", name = "t", descriptor = "I")
    public static int field896;

    @OriginalMember(owner = "client!pd", name = "v", descriptor = "I")
    public int field898;

    @OriginalMember(owner = "client!pd", name = "x", descriptor = "I")
    public int field900;

    @OriginalMember(owner = "client!pd", name = "y", descriptor = "I")
    public static int field901;

    @OriginalMember(owner = "client!pd", name = "z", descriptor = "I")
    public int field902;

    @OriginalMember(owner = "client!pd", name = "A", descriptor = "I")
    public static int field903;

    @OriginalMember(owner = "client!pd", name = "B", descriptor = "I")
    public static int field904;

    @OriginalMember(owner = "client!pd", name = "C", descriptor = "I")
    public int field905;

    @OriginalMember(owner = "client!pd", name = "D", descriptor = "I")
    public int field906;

    @OriginalMember(owner = "client!pd", name = "E", descriptor = "I")
    public int field907;

    @OriginalMember(owner = "client!pd", name = "H", descriptor = "I")
    public static int field909;

    @OriginalMember(owner = "client!pd", name = "I", descriptor = "I")
    public int field910;

    @OriginalMember(owner = "client!pd", name = "J", descriptor = "I")
    public int field911;

    @OriginalMember(owner = "client!pd", name = "K", descriptor = "I")
    public int field912;

    @OriginalMember(owner = "client!pd", name = "L", descriptor = "I")
    public int field913;

    @OriginalMember(owner = "client!pd", name = "M", descriptor = "I")
    public int field914;

    @OriginalMember(owner = "client!pd", name = "N", descriptor = "I")
    public int field915;

    @OriginalMember(owner = "client!pd", name = "O", descriptor = "I")
    public int field916;

    @OriginalMember(owner = "client!pd", name = "P", descriptor = "I")
    public static int field917;

    @OriginalMember(owner = "client!pd", name = "R", descriptor = "I")
    public int field919;

    @OriginalMember(owner = "client!pd", name = "S", descriptor = "I")
    public static int field920;

    @OriginalMember(owner = "client!pd", name = "Q", descriptor = "Lhh;")
    public class119 field918;

    @OriginalMember(owner = "client!pd", name = "T", descriptor = "Lul;")
    public class192 field921;

    @OriginalMember(owner = "client!pd", name = "u", descriptor = "Lji;")
    public class43 field897;

    @OriginalMember(owner = "client!pd", name = "w", descriptor = "Leh;")
    public class82 field899;

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(IB)Lt;")
    public static final class202 method461(int arg0, byte arg1) {
        field917++;
        class202 var2 = (class202) class5.field88.method1780((long) arg0, (byte) -122);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class25.field387.method1163(4, arg0, 48);
        class202 var4 = new class202();
        if (var3 != null) {
            var4.method1355(arg0, true, new class37(var3));
        }
        if (arg1 >= -94) {
            field909 = 97;
        }
        class5.field88.method1784(var4, false, (long) arg0);
        return var4;
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(II)V")
    public static final void method462(int arg0, int arg1) {
        class70.method553(86);
        class290.method1957(1);
        int var2 = class26.method212(false, arg1).field1015;
        field896++;
        if (var2 == 0) {
            return;
        }
        int var3 = class30.field482[arg1];
        if (var2 == 5) {
            class189.field3020 = var3;
        }
        if (var2 == 9) {
            class191.field3043 = var3;
        }
        if (var2 == 6) {
            class119.field1841 = var3;
        }
        if (arg0 != -2409) {
            method463((byte) 81);
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(B)V")
    public static final void method463(byte arg0) {
        field893++;
        if (arg0 != 68) {
            field903 = -15;
        }
        if (class59.field923.toLowerCase().indexOf("microsoft") != -1) {
            class291.field4580[192] = 58;
            class291.field4580[219] = 42;
            class291.field4580[187] = 27;
            class291.field4580[223] = 28;
            class291.field4580[188] = 71;
            class291.field4580[222] = 59;
            class291.field4580[191] = 73;
            class291.field4580[189] = 26;
            class291.field4580[220] = 74;
            class291.field4580[186] = 57;
            class291.field4580[190] = 72;
            class291.field4580[221] = 43;
            return;
        }
        class291.field4580[93] = 43;
        if (class59.field941 == null) {
            class291.field4580[192] = 58;
            class291.field4580[222] = 59;
        } else {
            class291.field4580[222] = 58;
            class291.field4580[520] = 59;
            class291.field4580[192] = 28;
        }
        class291.field4580[59] = 57;
        class291.field4580[61] = 27;
        class291.field4580[92] = 74;
        class291.field4580[47] = 73;
        class291.field4580[91] = 42;
        class291.field4580[45] = 26;
        class291.field4580[44] = 71;
        class291.field4580[46] = 72;
    }

    @OriginalMember(owner = "client!pd", name = "c", descriptor = "(I)V")
    public final void method464(int arg0) {
        this.field918 = null;
        this.field921 = null;
        if (arg0 != 74) {
            this.field891 = -53;
        }
        this.field897 = null;
        field901++;
        this.field899 = null;
    }

    @OriginalMember(owner = "client!pd", name = "d", descriptor = "(I)V")
    public static void method465(int arg0) {
        if (arg0 >= 55) {
            field908 = null;
        }
    }
}
