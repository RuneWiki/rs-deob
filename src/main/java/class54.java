import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("fc")
public class class54 extends class147 {

    @OriginalMember(owner = "fc", name = "U", descriptor = "I")
    public int field1095 = 0;

    @OriginalMember(owner = "fc", name = "P", descriptor = "I")
    public static int field1090 = 0;

    @OriginalMember(owner = "fc", name = "S", descriptor = "Llf;")
    public static class109 field1093 = class35.method275("W-=hlen Sie eine Welt", 2);

    @OriginalMember(owner = "fc", name = "L", descriptor = "I")
    public static int field1086 = 0;

    @OriginalMember(owner = "fc", name = "T", descriptor = "Llf;")
    public static class109 field1094 = class35.method275("Unerwartete Antwort vom Anmelde)2Server", 2);

    @OriginalMember(owner = "fc", name = "I", descriptor = "I")
    public static int field1084;

    @OriginalMember(owner = "fc", name = "K", descriptor = "I")
    public static int field1085;

    @OriginalMember(owner = "fc", name = "M", descriptor = "I")
    public static int field1087;

    @OriginalMember(owner = "fc", name = "N", descriptor = "I")
    public static int field1088;

    @OriginalMember(owner = "fc", name = "O", descriptor = "I")
    public static int field1089;

    @OriginalMember(owner = "fc", name = "Q", descriptor = "I")
    public static int field1091;

    @OriginalMember(owner = "fc", name = "R", descriptor = "I")
    public static int field1092;

    @OriginalMember(owner = "fc", name = "G", descriptor = "[I")
    public static int[] field1083;

    @OriginalMember(owner = "fc", name = "a", descriptor = "(Lbg;ILbg;)V")
    public static final void method350(class18 arg0, int arg1, class18 arg2) {
        class52.field1065 = arg2;
        field1087++;
        class117.field2318 = arg0;
        if (arg1 == 32413) {
            class75.field1441 = class52.field1065.method167((byte) 11, 3);
        }
    }

    @OriginalMember(owner = "fc", name = "a", descriptor = "(III)I")
    public static final int method351(int arg0, int arg1, int arg2) {
        class106 var3 = (class106) class76.field1466.method337((long) arg2, (byte) -78);
        field1089++;
        if (arg1 != -26917) {
            field1086 = 59;
        }
        if (var3 == null) {
            return -1;
        } else if (arg0 >= 0 && var3.field2103.length > arg0) {
            return var3.field2103[arg0];
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "fc", name = "a", descriptor = "(Lja;I)V")
    public final void method352(class86 arg0, int arg1) {
        field1091++;
        while (true) {
            int var3 = arg0.method598((byte) 77);
            if (var3 == 0) {
                if (arg1 == -26780) {
                    return;
                } else {
                    method353(false);
                    return;
                }
            }
            this.method356(arg0, var3, 13707);
        }
    }

    @OriginalMember(owner = "fc", name = "b", descriptor = "(Z)V")
    public static void method353(boolean arg0) {
        field1093 = null;
        if (arg0) {
            method350(null, 114, null);
        }
        field1094 = null;
        field1083 = null;
    }

    @OriginalMember(owner = "fc", name = "a", descriptor = "(JI)V")
    public static final void method354(long arg0, int arg1) {
        field1092++;
        if (arg0 <= 0L) {
            return;
        }
        int var3 = -71 / ((23 - arg1) / 38);
        if (arg0 % 10L == 0L) {
            class174.method1174(arg0 - 1L, -92);
            class174.method1174(1L, -124);
        } else {
            class174.method1174(arg0, -100);
        }
    }

    @OriginalMember(owner = "fc", name = "b", descriptor = "(I)V")
    public static final void method355(int arg0) {
        class9.field123 = new byte[4][104][arg0];
        class187.field3577 = new int[4][105][105];
        field1088++;
        class103.field2044 = new int[104];
        class185.field3522 = new int[104];
        class83.field1687 = 99;
        class35.field781 = new int[104];
        class142.field2745 = new byte[4][104][104];
        class204.field4018 = new byte[4][105][105];
        class106.field2110 = new byte[4][104][104];
        class40.field846 = new int[104];
        class88.field1836 = new byte[4][104][104];
        class59.field1173 = new int[104];
    }

    @OriginalMember(owner = "fc", name = "a", descriptor = "(Lja;II)V")
    private final void method356(class86 arg0, int arg1, int arg2) {
        if (arg1 == 2) {
            this.field1095 = arg0.method569(true);
        }
        field1084++;
        if (arg2 != 13707) {
            this.method352(null, -35);
        }
    }
}
