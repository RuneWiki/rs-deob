import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ob")
public abstract class class521 {

    @OriginalMember(owner = "client!ob", name = "e", descriptor = "Lao;")
    public static class191 field7669 = new class191(107, -2);

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "I")
    public static int field7665;

    @OriginalMember(owner = "client!ob", name = "b", descriptor = "I")
    public static int field7666;

    @OriginalMember(owner = "client!ob", name = "d", descriptor = "I")
    public static int field7668;

    @OriginalMember(owner = "client!ob", name = "f", descriptor = "I")
    public static int field7670;

    @OriginalMember(owner = "client!ob", name = "c", descriptor = "Lc;")
    public static class124 field7667;

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(Ljk;I)V")
    public static final void method3106(class450 arg0, int arg1) {
        if (arg1 != 107) {
            method3106(null, 110);
        }
        if (arg0.field6686 == 5 && arg0.field6661 != -1) {
            class101.method616(arg0, -19845, class343.field4596);
        }
        field7666++;
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(B)V")
    public static void method3107(byte arg0) {
        field7669 = null;
        int var1 = -12 % ((arg0 - 44) / 56);
        field7667 = null;
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(III)Z")
    public static final boolean method3108(int arg0, int arg1, int arg2) {
        int var3 = -29 % ((34 - arg1) / 56);
        field7670++;
        return (arg0 & 0x70000) != 0 | class207.method1311((byte) -114, arg0, arg2) || class317.method1891(arg0, (byte) 68, arg2);
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(IJ)V")
    public static final void method3109(int arg0, long arg1) {
        field7665++;
        if (class186.field2421 != null) {
            if (class47.field491 == 1 || class47.field491 == 5) {
                class65.method383((byte) 102, arg1);
            } else if (class47.field491 == 4) {
                class291.method1751(115, arg1);
            }
        }
        class178.method1037(0, (long) class532.field7836, class343.field4596);
        if (class168.field2174 != -1) {
            class140.method865(class168.field2174, 6);
        }
        if (arg0 < 104) {
            field7667 = null;
        }
        for (int var3 = 0; var3 < class266.field3569; var3++) {
            if (class442.field6427[var3]) {
                class114.field1496[var3] = true;
            }
            class207.field2728[var3] = class442.field6427[var3];
            class442.field6427[var3] = false;
        }
        class319.field4257 = class532.field7836;
        if (class343.field4596.method1144()) {
            class98.field1295 = true;
        }
        if (class168.field2174 != -1) {
            class266.field3569 = 0;
            class195.method1119(0);
        }
        class343.field4596.method1206();
        class334.method1947((byte) -100, class343.field4596);
        int var4 = class214.method1368(-24880);
        if (var4 == -1) {
            var4 = class256.field3403;
        }
        if (var4 == -1) {
            var4 = class176.field2274;
        }
        class363.method2167(var4, -29608);
        class226.method1450(class96.field1170.field3694, true, class96.field1170.field3704, class123.field1594, class96.field1170.field3695);
        class123.field1594 = 0;
    }
}
