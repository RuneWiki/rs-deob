import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qf")
public class class117 extends class16 {

    @OriginalMember(owner = "client!qf", name = "E", descriptor = "[I")
    public int[] field2638 = new int[] { -1 };

    @OriginalMember(owner = "client!qf", name = "D", descriptor = "[I")
    public int[] field2637 = new int[1];

    @OriginalMember(owner = "client!qf", name = "A", descriptor = "Lje;")
    public static class67 field2634 = class85.method592(255, ": ");

    @OriginalMember(owner = "client!qf", name = "L", descriptor = "Lje;")
    private static class67 field2644 = class85.method592(255, "RuneScape is loading )2 please wait)3)3)3");

    @OriginalMember(owner = "client!qf", name = "C", descriptor = "I")
    public static int field2636 = 0;

    @OriginalMember(owner = "client!qf", name = "N", descriptor = "Lje;")
    public static class67 field2646 = field2644;

    @OriginalMember(owner = "client!qf", name = "G", descriptor = "Lje;")
    public static class67 field2640 = class85.method592(255, "oder ung-Ultiges Passwort)3");

    @OriginalMember(owner = "client!qf", name = "P", descriptor = "I")
    public static int field2648 = 0;

    @OriginalMember(owner = "client!qf", name = "K", descriptor = "Lje;")
    private static class67 field2643 = class85.method592(255, "Error loading your profile)3");

    @OriginalMember(owner = "client!qf", name = "H", descriptor = "Lje;")
    public static class67 field2641 = class85.method592(255, "Update)2Liste geladen)3");

    @OriginalMember(owner = "client!qf", name = "R", descriptor = "Lje;")
    private static class67 field2650 = class85.method592(255, " ");

    @OriginalMember(owner = "client!qf", name = "M", descriptor = "Lje;")
    public static class67 field2645 = field2650;

    @OriginalMember(owner = "client!qf", name = "Q", descriptor = "Lje;")
    public static class67 field2649 = field2643;

    @OriginalMember(owner = "client!qf", name = "B", descriptor = "I")
    public static int field2635;

    @OriginalMember(owner = "client!qf", name = "F", descriptor = "I")
    public static int field2639;

    @OriginalMember(owner = "client!qf", name = "J", descriptor = "I")
    public static int field2642;

    @OriginalMember(owner = "client!qf", name = "O", descriptor = "I")
    public static int field2647;

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(II)Lwe;")
    public static final class158 method937(int arg0, int arg1) {
        class158 var2 = (class158) class81.field1785.method764((long) arg1, arg0 ^ 0x5E75);
        field2635++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class42.field794.method267((byte) -124, arg1, arg0);
        class158 var4 = new class158();
        if (var3 != null) {
            var4.method1228((byte) -97, new class91(var3));
        }
        class81.field1785.method765((long) arg1, var4, (byte) -128);
        return var4;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(Z)V")
    public static void method938(boolean arg0) {
        field2634 = null;
        if (!arg0) {
            return;
        }
        field2644 = null;
        field2649 = null;
        field2641 = null;
        field2650 = null;
        field2640 = null;
        field2646 = null;
        field2643 = null;
        field2645 = null;
    }

    @OriginalMember(owner = "client!qf", name = "c", descriptor = "(I)V")
    public static final void method939(int arg0) {
        try {
            if (class85.field1876 == null) {
                class85.field1876 = new class32(class154.field3519, class49.method314(new class67[] { class121.field2717, class52.field1040, class129.field2846 }, 0).method486(23854));
            } else {
                byte[] var1 = class85.field1876.method203(arg0 + 4);
                if (var1 != null) {
                    class91 var2 = new class91(var1);
                    class35.field656 = var2.method641(255);
                    class99.field2209 = new class127[class35.field656];
                    int var3 = 0;
                    while (true) {
                        if (class35.field656 <= var3) {
                            client.method144(class142.field3244, class99.field2209.length - 1, (byte) -114, class130.field2861, 0, class99.field2209);
                            class75.field1620 = true;
                            class85.field1876 = null;
                            break;
                        }
                        class127 var4 = class99.field2209[var3] = new class127();
                        int var5 = var2.method641(255);
                        var4.field2784 = var5 & 0x7FFF;
                        var4.field2778 = (var5 & 0x8000) != 0;
                        var4.field2785 = var2.method634(-1);
                        var4.field2782 = var2.method675((byte) -90);
                        var4.field2793 = var3;
                        var4.field2779 = class45.method292((byte) 113, var4.field2785);
                        var3++;
                    }
                }
            }
            if (arg0 != 0) {
                field2648 = 9;
            }
        } catch (Exception var7) {
            var7.printStackTrace();
            class85.field1876 = null;
        }
        field2639++;
    }

    @OriginalMember(owner = "client!qf", name = "d", descriptor = "(I)V")
    public static final void method940(int arg0) {
        System.out.println("Usage: worldid, [live/office/local], [live/rc/wip], [lowmem/highmem], [free/members], [english/german], [game0/game1]");
        System.exit(1);
        field2642++;
        if (arg0 != -19045) {
            method940(122);
        }
    }
}
