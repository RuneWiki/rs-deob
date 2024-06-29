import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hk")
public class class158 {

    @OriginalMember(owner = "client!hk", name = "g", descriptor = "Z")
    public static boolean field2637 = false;

    @OriginalMember(owner = "client!hk", name = "C", descriptor = "F")
    public static float field2659 = 0.0F;

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "I")
    public int field2631;

    @OriginalMember(owner = "client!hk", name = "b", descriptor = "I")
    public int field2632;

    @OriginalMember(owner = "client!hk", name = "c", descriptor = "I")
    public static int field2633;

    @OriginalMember(owner = "client!hk", name = "d", descriptor = "I")
    public static int field2634;

    @OriginalMember(owner = "client!hk", name = "e", descriptor = "I")
    public int field2635;

    @OriginalMember(owner = "client!hk", name = "h", descriptor = "I")
    public int field2638;

    @OriginalMember(owner = "client!hk", name = "i", descriptor = "I")
    public static int field2639;

    @OriginalMember(owner = "client!hk", name = "j", descriptor = "I")
    public static int field2640;

    @OriginalMember(owner = "client!hk", name = "k", descriptor = "I")
    public int field2641;

    @OriginalMember(owner = "client!hk", name = "m", descriptor = "I")
    public int field2643;

    @OriginalMember(owner = "client!hk", name = "n", descriptor = "I")
    public int field2644;

    @OriginalMember(owner = "client!hk", name = "o", descriptor = "I")
    public int field2645;

    @OriginalMember(owner = "client!hk", name = "p", descriptor = "I")
    public int field2646;

    @OriginalMember(owner = "client!hk", name = "q", descriptor = "I")
    public int field2647;

    @OriginalMember(owner = "client!hk", name = "s", descriptor = "I")
    public int field2649;

    @OriginalMember(owner = "client!hk", name = "t", descriptor = "I")
    public static int field2650;

    @OriginalMember(owner = "client!hk", name = "u", descriptor = "I")
    public int field2651;

    @OriginalMember(owner = "client!hk", name = "v", descriptor = "I")
    public int field2652;

    @OriginalMember(owner = "client!hk", name = "w", descriptor = "I")
    public static int field2653;

    @OriginalMember(owner = "client!hk", name = "x", descriptor = "I")
    public int field2654;

    @OriginalMember(owner = "client!hk", name = "y", descriptor = "I")
    public int field2655;

    @OriginalMember(owner = "client!hk", name = "z", descriptor = "I")
    public int field2656;

    @OriginalMember(owner = "client!hk", name = "A", descriptor = "I")
    public int field2657;

    @OriginalMember(owner = "client!hk", name = "B", descriptor = "I")
    public int field2658;

    @OriginalMember(owner = "client!hk", name = "f", descriptor = "Lbl;")
    public static class137 field2636;

    @OriginalMember(owner = "client!hk", name = "l", descriptor = "Lme;")
    public static class39 field2642;

    @OriginalMember(owner = "client!hk", name = "r", descriptor = "[[[B")
    public static byte[][][] field2648;

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(BLok;)V")
    public static final void method1083(byte arg0, class40 arg1) {
        arg1.field596 = false;
        field2633++;
        if (arg1.field597 != null) {
            arg1.field597.field4085 = 0;
        }
        for (class40 var2 = arg1.method251(); var2 != null; var2 = arg1.method252()) {
            method1083((byte) 71, var2);
        }
        if (arg0 <= 60) {
            field2637 = false;
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(IIZILba;II)Lba;")
    public static final class279 method1084(int arg0, int arg1, boolean arg2, int arg3, class279 arg4, int arg5, int arg6) {
        field2650++;
        long var7 = (long) arg5;
        class279 var9 = (class279) class100.field1714.method57(var7, -59);
        if (var9 == null) {
            class221 var10 = class221.method1487(class206.field3438, arg5, 0);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method1474(64, 768, -50, -10, -50);
            class100.field1714.method62(0, var9, var7);
        }
        int var11 = arg4.method114();
        int var12 = arg4.method113();
        int var13 = arg4.method109();
        int var14 = arg4.method104();
        class279 var15 = var9.method99(true, true, arg2);
        if (arg3 != 0) {
            var15.method115(arg3);
        }
        class18 var16 = (class18) var15;
        if (class10.method68(arg2, class176.field2886, arg6 + var13, arg1 + var11) != arg0 || arg0 != class10.method68(true, class176.field2886, arg6 + var14, arg1 - -var12)) {
            for (int var17 = 0; var17 < var16.field220; var17++) {
                var16.field219[var17] += class10.method68(true, class176.field2886, var16.field212[var17] + arg6, var16.field240[var17] + arg1) - arg0;
            }
            var16.field229 = false;
        }
        return var15;
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "([BII)I")
    public static final int method1085(byte[] arg0, int arg1, int arg2) {
        if (arg1 != 20484) {
            field2637 = true;
        }
        field2639++;
        return class255.method1685(255, arg0, arg2, 0);
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(III)V")
    public static final void method1086(int arg0, int arg1, int arg2) {
        class55 var3 = class62.method395(6, arg0, (byte) -66);
        field2653++;
        if (arg2 != -50) {
            field2642 = null;
        }
        var3.method340((byte) -110);
        var3.field947 = arg1;
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(IIIILte;)V")
    public static final void method1087(int arg0, int arg1, int arg2, int arg3, class206 arg4) {
        field2634++;
        for (class57 var5 = (class57) class254.field4154.method379(arg3 ^ 0x184B); var5 != null; var5 = (class57) class254.field4154.method378(-123)) {
            if (var5.field984 == arg2 && arg1 * 128 == var5.field991 && arg0 * 128 == var5.field1009 && var5.field989.field3384 == arg4.field3384) {
                if (var5.field1001 != null) {
                    class10.field149.method259(var5.field1001);
                    var5.field1001 = null;
                }
                if (var5.field1008 != null) {
                    class10.field149.method259(var5.field1008);
                    var5.field1008 = null;
                }
                var5.method547(arg3 + 9898);
                return;
            }
        }
        if (arg3 != 128) {
            field2648 = null;
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(I)V")
    public static void method1088(int arg0) {
        field2642 = null;
        if (arg0 > -123) {
            method1085((byte[]) null, 12, -125);
        }
        field2636 = null;
        field2648 = null;
    }
}
