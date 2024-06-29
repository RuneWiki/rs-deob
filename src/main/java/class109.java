import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pe")
public class class109 {

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "Ltd;")
    public static class136 field2568 = class145.method1172("<col=00ffff>", 45);

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "Ltd;")
    public static class136 field2567 = class145.method1172("Bitte geben Sie Ihr Passwort ein)3", 45);

    @OriginalMember(owner = "client!pe", name = "f", descriptor = "I")
    public static int field2572 = 0;

    @OriginalMember(owner = "client!pe", name = "h", descriptor = "I")
    public static int field2574 = 0;

    @OriginalMember(owner = "client!pe", name = "g", descriptor = "Ltd;")
    public static class136 field2573 = class145.method1172("sich mit einer anderen Welt zu verbinden)3", 45);

    @OriginalMember(owner = "client!pe", name = "j", descriptor = "Ltd;")
    public static class136 field2576 = class145.method1172("Benutzername: ", 45);

    @OriginalMember(owner = "client!pe", name = "i", descriptor = "Ltd;")
    public static class136 field2575 = class145.method1172("welle2:", 45);

    @OriginalMember(owner = "client!pe", name = "e", descriptor = "I")
    public static int field2571;

    @OriginalMember(owner = "client!pe", name = "k", descriptor = "I")
    public static int field2577;

    @OriginalMember(owner = "client!pe", name = "c", descriptor = "Lmd;")
    public static class87 field2569;

    @OriginalMember(owner = "client!pe", name = "d", descriptor = "[I")
    public static int[] field2570;

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(B)V")
    public static final void method860(byte arg0) {
        class87.field2049 = new int[104];
        class74.field1567 = new int[105][105];
        class139.field3241 = new int[104];
        class76.field1714 = 99;
        class16.field322 = new int[4][105][105];
        class35.field832 = new byte[4][104][104];
        class15.field300 = new byte[4][104][104];
        class40.field941 = new byte[4][104][104];
        class4.field84 = new byte[4][104][104];
        class122.field2843 = new int[104];
        class101.field2421 = new int[104];
        class31.field685 = new int[104];
        class133.field3141 = new byte[4][105][105];
        field2571++;
        if (arg0 < 72) {
            field2570 = null;
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(I[BII)I")
    public static final int method861(int arg0, byte[] arg1, int arg2, int arg3) {
        if (arg2 != 15003) {
            return -86;
        }
        field2577++;
        int var4 = -1;
        for (int var5 = arg3; var5 < arg0; var5++) {
            var4 = class55.field1230[(var4 ^ arg1[var5]) & 0xFF] ^ var4 >>> 8;
        }
        return ~var4;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(Z)V")
    public static void method862(boolean arg0) {
        field2568 = null;
        field2573 = null;
        if (!arg0) {
            field2576 = null;
        }
        field2575 = null;
        field2569 = null;
        field2570 = null;
        field2576 = null;
        field2567 = null;
    }
}
