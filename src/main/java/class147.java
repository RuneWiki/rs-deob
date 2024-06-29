import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qj")
public class class147 extends class64 {

    @OriginalMember(owner = "client!qj", name = "H", descriptor = "Lid;")
    public static class149 field2657 = class60.method382("<col=ffff00>", (byte) 52);

    @OriginalMember(owner = "client!qj", name = "r", descriptor = "[I")
    public static int[] field2641 = new int[14];

    @OriginalMember(owner = "client!qj", name = "C", descriptor = "I")
    public static int field2652 = -1;

    @OriginalMember(owner = "client!qj", name = "q", descriptor = "I")
    public static int field2640;

    @OriginalMember(owner = "client!qj", name = "v", descriptor = "I")
    public static int field2645;

    @OriginalMember(owner = "client!qj", name = "w", descriptor = "I")
    public static int field2646;

    @OriginalMember(owner = "client!qj", name = "A", descriptor = "I")
    public static int field2650;

    @OriginalMember(owner = "client!qj", name = "D", descriptor = "I")
    public static int field2653;

    @OriginalMember(owner = "client!qj", name = "E", descriptor = "I")
    public int field2654;

    @OriginalMember(owner = "client!qj", name = "G", descriptor = "I")
    public int field2656;

    @OriginalMember(owner = "client!qj", name = "I", descriptor = "I")
    public static int field2658;

    @OriginalMember(owner = "client!qj", name = "J", descriptor = "I")
    public static int field2659;

    @OriginalMember(owner = "client!qj", name = "F", descriptor = "Lng;")
    public static class76 field2655;

    @OriginalMember(owner = "client!qj", name = "t", descriptor = "[I")
    public int[] field2643;

    @OriginalMember(owner = "client!qj", name = "u", descriptor = "[I")
    public int[] field2644;

    @OriginalMember(owner = "client!qj", name = "z", descriptor = "[I")
    public int[] field2649;

    @OriginalMember(owner = "client!qj", name = "B", descriptor = "[I")
    public static int[] field2651;

    @OriginalMember(owner = "client!qj", name = "K", descriptor = "[I")
    public static int[] field2660;

    @OriginalMember(owner = "client!qj", name = "s", descriptor = "[Ldj;")
    public class187[] field2642;

    @OriginalMember(owner = "client!qj", name = "y", descriptor = "[Ldj;")
    public class187[] field2648;

    @OriginalMember(owner = "client!qj", name = "x", descriptor = "[[[B")
    public byte[][][] field2647;

    @OriginalMember(owner = "client!qj", name = "L", descriptor = "[[[I")
    public static int[][][] field2661;

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(I[[I)V")
    public static final void method1007(int arg0, int[][] arg1) {
        class15.field220 = arg1;
        if (arg0 != -3) {
            field2655 = null;
        }
        field2640++;
    }

    @OriginalMember(owner = "client!qj", name = "c", descriptor = "(B)V")
    public static final void method1008(byte arg0) {
        class2.field35++;
        int var1 = 94 % ((-arg0 - 38) / 49);
        field2659++;
        class208.field3720.method162(2, 243);
        class208.field3720.method494((byte) 4, class79.method600(113));
        class208.field3720.method518(16711680, class218.field3851);
        class208.field3720.method518(16711680, class240.field4197);
        class208.field3720.method494((byte) 4, class180.field3242);
    }

    @OriginalMember(owner = "client!qj", name = "d", descriptor = "(B)V")
    public static void method1009(byte arg0) {
        if (arg0 != 26) {
            return;
        }
        field2655 = null;
        field2651 = null;
        field2661 = null;
        field2657 = null;
        field2641 = null;
        field2660 = null;
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(ILal;Lal;)V")
    public static final void method1010(int arg0, class230 arg1, class230 arg2) {
        if (arg0 != -2) {
            method1009((byte) 92);
        }
        class95.field1675 = arg2;
        field2650++;
        class10.field142 = arg1;
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(BZ)V")
    public static final void method1011(byte arg0, boolean arg1) {
        field2658++;
        if (arg1 != class90.field1603 && arg0 == -112) {
            class90.field1603 = arg1;
            class63.method399((byte) 46);
        }
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(ILjava/lang/Object;Lfb;)V")
    public static final void method1012(int arg0, Object arg1, class29 arg2) {
        field2645++;
        if (arg2.field426 == null) {
            return;
        }
        for (int var3 = 0; var3 < 50 && arg2.field426.peekEvent() != null; var3++) {
            class151.method1074(-127, 1L);
        }
        if (arg0 == -3 && arg1 != null) {
            arg2.field426.postEvent(new ActionEvent(arg1, 1001, "dummy"));
        }
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(I)V")
    public static final void method1013(int arg0) {
        field2653++;
        if (class100.field1771 == 2) {
            if (class276.field4937 == class189.field3383 && class214.field3797 == class2.field32) {
                class100.field1771 = 0;
                if (class127.field2229 && class131.field2312[81] && class60.field1092 > 2) {
                    class186.method1281(2, class60.field1092 - 2);
                } else {
                    class186.method1281(2, class60.field1092 - 1);
                }
            }
        } else if (class260.field4582 == class189.field3383 && class2.field32 == class159.field2921) {
            class100.field1771 = 0;
            if (class127.field2229 && class131.field2312[81] && class60.field1092 > 2) {
                class186.method1281(2, class60.field1092 - 2);
            } else {
                class186.method1281(2, class60.field1092 - 1);
            }
        } else {
            class214.field3797 = class159.field2921;
            class276.field4937 = class260.field4582;
            class100.field1771 = 2;
        }
        if (arg0 < 112) {
            field2661 = null;
        }
    }
}
