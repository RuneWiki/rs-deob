import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cd")
public class class69 extends class147 {

    @OriginalMember(owner = "client!cd", name = "C", descriptor = "I")
    public int field1077 = -1;

    @OriginalMember(owner = "client!cd", name = "E", descriptor = "I")
    public int field1079 = 0;

    @OriginalMember(owner = "client!cd", name = "y", descriptor = "Lna;")
    public static class26 field1073 = method505("Suche nach Updates )2 ", (byte) -126);

    @OriginalMember(owner = "client!cd", name = "D", descriptor = "Lna;")
    public static class26 field1078 = method505("Lade Wordpack )2 ", (byte) -117);

    @OriginalMember(owner = "client!cd", name = "v", descriptor = "Lna;")
    public static class26 field1070 = method505("Atteindre", (byte) -117);

    @OriginalMember(owner = "client!cd", name = "p", descriptor = "I")
    public static int field1064;

    @OriginalMember(owner = "client!cd", name = "q", descriptor = "I")
    public static int field1065;

    @OriginalMember(owner = "client!cd", name = "r", descriptor = "I")
    public int field1066;

    @OriginalMember(owner = "client!cd", name = "s", descriptor = "I")
    public static int field1067;

    @OriginalMember(owner = "client!cd", name = "t", descriptor = "I")
    public int field1068;

    @OriginalMember(owner = "client!cd", name = "u", descriptor = "I")
    public static int field1069;

    @OriginalMember(owner = "client!cd", name = "w", descriptor = "I")
    public int field1071;

    @OriginalMember(owner = "client!cd", name = "x", descriptor = "I")
    public int field1072;

    @OriginalMember(owner = "client!cd", name = "z", descriptor = "I")
    public int field1074;

    @OriginalMember(owner = "client!cd", name = "A", descriptor = "I")
    public int field1075;

    @OriginalMember(owner = "client!cd", name = "F", descriptor = "I")
    public int field1080;

    @OriginalMember(owner = "client!cd", name = "G", descriptor = "I")
    public int field1081;

    @OriginalMember(owner = "client!cd", name = "H", descriptor = "I")
    public int field1082;

    @OriginalMember(owner = "client!cd", name = "I", descriptor = "I")
    public int field1083;

    @OriginalMember(owner = "client!cd", name = "B", descriptor = "Lve;")
    public static class266 field1076;

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(Lve;B)I", line = 11)
    public static final int method504(class266 arg0, byte arg1) {
        field1065++;
        int var2 = 0;
        if (arg0.method1900(0, class89.field1484)) {
            var2++;
        }
        if (arg0.method1900(0, class76.field1163)) {
            var2++;
        }
        if (arg0.method1900(0, client.field4111)) {
            var2++;
        }
        if (arg0.method1900(0, class96.field1571)) {
            var2++;
        }
        if (arg0.method1900(0, class236.field3766)) {
            var2++;
        }
        if (arg0.method1900(0, class240.field3875)) {
            var2++;
        }
        if (arg0.method1900(0, class50.field786)) {
            var2++;
        }
        if (arg1 > -124) {
            method506(68);
        }
        if (arg0.method1900(0, class84.field1379)) {
            var2++;
        }
        if (arg0.method1900(0, class199.field3094)) {
            var2++;
        }
        if (arg0.method1900(0, class308.field5306)) {
            var2++;
        }
        if (arg0.method1900(0, class88.field1457)) {
            var2++;
        }
        if (arg0.method1900(0, class27.field444)) {
            var2++;
        }
        if (arg0.method1900(0, class7.field86)) {
            var2++;
        }
        if (arg0.method1900(0, class282.field4698)) {
            var2++;
        }
        if (arg0.method1900(0, class188.field2966)) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(Ljava/lang/String;B)Lna;", line = 84)
    public static final class26 method505(String arg0, byte arg1) {
        field1064++;
        byte[] var2 = arg0.getBytes();
        int var3 = var2.length;
        class26 var4 = new class26();
        int var5 = 0;
        var4.field418 = new byte[var3];
        while (var3 > var5) {
            int var6 = var2[var5++] & 0xFF;
            if (var6 <= 45 && var6 >= 40) {
                if (var5 >= var3) {
                    break;
                }
                int var7 = var2[var5++] & 0xFF;
                var4.field418[var4.field436++] = (byte) ((var6 - 40) * 43 + var7 - 48);
            } else if (var6 != 0) {
                var4.field418[var4.field436++] = (byte) var6;
            }
        }
        if (arg1 >= -116) {
            return (class26) null;
        } else {
            var4.method207((byte) 90);
            return var4.method202((byte) 32);
        }
    }

    @OriginalMember(owner = "client!cd", name = "c", descriptor = "(I)V", line = 128)
    public static void method506(int arg0) {
        field1073 = null;
        field1078 = null;
        field1070 = null;
        if (arg0 != 2) {
            method506(-22);
        }
        field1076 = null;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(IIIIZ)V", line = 153)
    public static final void method507(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        class285.field4778 = arg1;
        class303.field5221 = arg2;
        class261.field4272 = arg3;
        class103.field1653 = new class55[arg0][class285.field4778][class303.field5221];
        class258.field4209 = new int[arg0][class285.field4778 + 1][class303.field5221 + 1];
        if (class255.field4184) {
            client.field4125 = new class172[4][];
        }
        if (arg4) {
            class10.field124 = new class55[1][class285.field4778][class303.field5221];
            class245.field4028 = new int[class285.field4778][class303.field5221];
            class8.field96 = new int[1][class285.field4778 + 1][class303.field5221 + 1];
            if (class255.field4184) {
                class112.field1761 = new class172[1][];
            }
        } else {
            class10.field124 = (class55[][][]) null;
            class245.field4028 = (int[][]) null;
            class8.field96 = (int[][][]) null;
            class112.field1761 = (class172[][]) null;
        }
        class216.method1446(false);
        class173.field2715 = new class101[500];
        field1067 = 0;
        class21.field296 = new class101[500];
        class136.field2086 = 0;
        class138.field2117 = new int[arg0][class285.field4778 + 1][class303.field5221 + 1];
        class249.field4073 = new class39[5000];
        class310.field5328 = 0;
        class304.field5240 = new class39[100];
        class38.field626 = new boolean[class261.field4272 + class261.field4272 + 1][class261.field4272 + class261.field4272 + 1];
        class302.field5206 = new boolean[class261.field4272 + class261.field4272 + 2][class261.field4272 + class261.field4272 + 2];
        class157.field2449 = new byte[arg0][class285.field4778][class303.field5221];
    }
}
