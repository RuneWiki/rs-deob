import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rn")
public class class168 {

    @OriginalMember(owner = "client!rn", name = "e", descriptor = "Lhi;")
    public static class131 field2600 = new class131(2, 4, 4, 0);

    @OriginalMember(owner = "client!rn", name = "r", descriptor = "Lbg;")
    public static class310 field2613 = new class310(77, 4);

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "I")
    public static int field2596;

    @OriginalMember(owner = "client!rn", name = "b", descriptor = "I")
    public static int field2597;

    @OriginalMember(owner = "client!rn", name = "c", descriptor = "I")
    public int field2598;

    @OriginalMember(owner = "client!rn", name = "d", descriptor = "I")
    public int field2599;

    @OriginalMember(owner = "client!rn", name = "f", descriptor = "I")
    public int field2601;

    @OriginalMember(owner = "client!rn", name = "g", descriptor = "I")
    public int field2602;

    @OriginalMember(owner = "client!rn", name = "h", descriptor = "I")
    public int field2603;

    @OriginalMember(owner = "client!rn", name = "i", descriptor = "I")
    public int field2604;

    @OriginalMember(owner = "client!rn", name = "j", descriptor = "I")
    public static int field2605;

    @OriginalMember(owner = "client!rn", name = "k", descriptor = "I")
    public int field2606;

    @OriginalMember(owner = "client!rn", name = "l", descriptor = "I")
    public int field2607;

    @OriginalMember(owner = "client!rn", name = "m", descriptor = "I")
    public int field2608;

    @OriginalMember(owner = "client!rn", name = "n", descriptor = "I")
    public int field2609;

    @OriginalMember(owner = "client!rn", name = "o", descriptor = "I")
    public int field2610;

    @OriginalMember(owner = "client!rn", name = "p", descriptor = "I")
    public int field2611;

    @OriginalMember(owner = "client!rn", name = "q", descriptor = "I")
    public int field2612;

    @OriginalMember(owner = "client!rn", name = "s", descriptor = "I")
    public int field2614;

    @OriginalMember(owner = "client!rn", name = "t", descriptor = "I")
    public int field2615;

    @OriginalMember(owner = "client!rn", name = "u", descriptor = "I")
    public int field2616;

    @OriginalMember(owner = "client!rn", name = "v", descriptor = "I")
    public int field2617;

    @OriginalMember(owner = "client!rn", name = "w", descriptor = "I")
    public static int field2618;

    @OriginalMember(owner = "client!rn", name = "x", descriptor = "I")
    public int field2619;

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(ILbl;)V")
    public static final void method1057(int arg0, class442 arg1) {
        if (arg0 != 29490) {
            method1057(-21, null);
        }
        if (class261.field3954 == null) {
            class287 var2 = new class287();
            byte[] var3 = var2.method1744(0, 128, 16, 128);
            class261.field3954 = class366.method2215(-1705415604, false, var3);
        }
        field2596++;
        if (class16.field229 == null) {
            class487 var4 = new class487();
            byte[] var5 = var4.method2924(128, 16, 128, (byte) -44);
            class16.field229 = class366.method2215(-1705415604, false, var5);
        }
        class153 var6 = arg1.field6687;
        if (var6.method984(5888) && class329.field4934 == null) {
            byte[] var7 = class244.method1466(0.6F, 16, 128, 16.0F, 128, 0.5F, 8, 4.0F, 4.0F, arg0 ^ 0xFFFF92FB, new class381(419684));
            class329.field4934 = class366.method2215(-1705415604, false, var7);
        }
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(B)V")
    public static void method1058(byte arg0) {
        int var1 = 15 / ((78 - arg0) / 39);
        field2613 = null;
        field2600 = null;
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(ZC)Z")
    public static final boolean method1059(boolean arg0, char arg1) {
        field2597++;
        if (arg0) {
            method1057(-63, null);
        }
        return arg1 == ' ' || arg1 == ' ' || arg1 == '_' || arg1 == '-';
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(Z)V")
    public static final void method1060(boolean arg0) {
        class50.field762.method2412(102);
        field2605++;
        class16.field224.method2257((byte) 80);
        if (arg0) {
            method1060(true);
        }
        class268.field4040.method2257((byte) 58);
    }
}
