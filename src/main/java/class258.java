import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ee")
public class class258 {

    @OriginalMember(owner = "client!ee", name = "c", descriptor = "Ldf;")
    public static class51 field4503 = class46.method233("Freie Welt", 100);

    @OriginalMember(owner = "client!ee", name = "g", descriptor = "I")
    public static int field4507 = 0;

    @OriginalMember(owner = "client!ee", name = "h", descriptor = "I")
    public static int field4508 = -1;

    @OriginalMember(owner = "client!ee", name = "e", descriptor = "Z")
    public static boolean field4505 = false;

    @OriginalMember(owner = "client!ee", name = "j", descriptor = "[I")
    public static int[] field4510 = new int[100];

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "I")
    public static int field4502;

    @OriginalMember(owner = "client!ee", name = "d", descriptor = "I")
    public static int field4504;

    @OriginalMember(owner = "client!ee", name = "f", descriptor = "I")
    public static int field4506;

    @OriginalMember(owner = "client!ee", name = "i", descriptor = "I")
    public static int field4509;

    @OriginalMember(owner = "client!ee", name = "k", descriptor = "I")
    public static int field4511;

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "Ldf;")
    public static class51 field4501;

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(B)V")
    public static void method1750(byte arg0) {
        field4501 = null;
        if (arg0 != 24) {
            field4503 = null;
        }
        field4510 = null;
        field4503 = null;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(Lu;Llc;ILu;Lu;)Z")
    public static final boolean method1751(class111 arg0, class80 arg1, int arg2, class111 arg3, class111 arg4) {
        class128.field2140 = arg4;
        class168.field2738 = arg3;
        if (arg2 != 20645) {
            field4510 = null;
        }
        field4511++;
        class162.field2656 = arg1;
        class189.field3162 = arg0;
        return true;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(ZJ)V")
    public static final void method1752(boolean arg0, long arg1) {
        class95.field1575.field2026 = 0;
        field4506++;
        class95.field1575.method919(-4742, 171);
        class95.field1575.method885(arg1, (byte) -126);
        class210.field3497 = 1;
        class144.field2403 = 0;
        class181.field2987 = -3;
        if (!arg0) {
            field4508 = 52;
        }
        class130.field2185 = 0;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(ZLkh;Z)V")
    public static final void method1753(boolean arg0, class42 arg1, boolean arg2) {
        field4509++;
        int var3 = (int) arg1.field1760;
        int var4 = arg1.field668;
        arg1.method764((byte) -16);
        if (arg0) {
            class223.method1543(var4, 28842);
        }
        class24.method133(-122, var4);
        class213 var5 = class198.method1392(11823, var3);
        if (var5 != null) {
            class25.method135(var5, -28014);
        }
        class39.field616 = 0;
        class90.field1498 = arg2;
        class2.method6(class255.field4458, class89.field1475, 0, class92.field1531, class87.field1455);
        if (class243.field4206 != -1) {
            class17.method88(class243.field4206, (byte) 7, 1);
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(BI)V")
    public static final void method1754(byte arg0, int arg1) {
        field4502++;
        class151.field2519.method1348(0, arg1);
        class38.field584.method1348(0, arg1);
        if (arg0 != 89) {
            method1750((byte) -124);
        }
    }
}
