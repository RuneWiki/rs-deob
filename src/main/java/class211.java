import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tg")
public class class211 {

    @OriginalMember(owner = "client!tg", name = "e", descriptor = "Lraa;")
    public class554 field2558 = new class554();

    @OriginalMember(owner = "client!tg", name = "i", descriptor = "Z")
    public boolean field2562 = false;

    @OriginalMember(owner = "client!tg", name = "b", descriptor = "I")
    public static int field2555;

    @OriginalMember(owner = "client!tg", name = "c", descriptor = "I")
    public static int field2556;

    @OriginalMember(owner = "client!tg", name = "d", descriptor = "I")
    public static int field2557;

    @OriginalMember(owner = "client!tg", name = "g", descriptor = "I")
    public int field2560;

    @OriginalMember(owner = "client!tg", name = "j", descriptor = "I")
    public int field2563;

    @OriginalMember(owner = "client!tg", name = "h", descriptor = "Lta;")
    public static class195 field2561;

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "Lpe;")
    public static class556 field2554;

    @OriginalMember(owner = "client!tg", name = "f", descriptor = "Ljava/lang/Object;")
    public static Object field2559;

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(I)V", line = 3)
    public static void method1267(int arg0) {
        field2554 = null;
        if (arg0 != 14) {
            field2561 = null;
        }
        field2559 = null;
        field2561 = null;
    }

    @OriginalMember(owner = "client!tg", name = "b", descriptor = "(I)V", line = 17)
    public static final void method1268(int arg0) {
        field2557++;
        if (class392.field5227) {
            return;
        }
        class392.field5227 = true;
        if (arg0 > -63) {
            return;
        }
        class356.field4671 = true;
        if (class601.field8530.field2880) {
            class89.field958 = ((int) class89.field958 + 47 & 0xFFFFFFF0);
        } else {
            class526.field7522 += (12.0F - class526.field7522) / 2.0F;
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(Liaa;I)Lfca;", line = 43)
    public static final class77 method1269(class452 arg0, int arg1) {
        field2555++;
        class352 var2 = class620.method3478(arg0, arg1 + 36089);
        int var3 = arg0.method2575((byte) -48);
        if (arg1 == -21) {
            int var4 = arg0.method2575((byte) -48);
            int var5 = arg0.method2574(-1758460248);
            return new class77(var2.field4605, var2.field4608, var2.field4610, var2.field4612, var2.field4617, var2.field4607, var2.field4609, var3, var4, var5);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(IZ)Lcc;", line = 70)
    public static final class666 method1270(int arg0, boolean arg1) {
        field2556++;
        if (arg0 == 0) {
            return new class507();
        } else if (arg0 == 1) {
            return new class682();
        } else if (arg0 == 2) {
            return new class191();
        } else if (arg0 == 3) {
            return new class329();
        } else if (arg0 == 4) {
            return new class585();
        } else if (arg0 == 5) {
            return new class334();
        } else if (arg0 == 6) {
            return new class374();
        } else if (arg0 == 7) {
            return new class685();
        } else if (arg0 == 8) {
            return new class24();
        } else if (arg0 == 9) {
            return new class227();
        } else if (arg0 == 10) {
            return new class330();
        } else if (arg0 == 11) {
            return new class464();
        } else if (arg0 == 12) {
            return new class186();
        } else if (arg0 == 13) {
            return new class98();
        } else if (arg0 == 14) {
            return new class380();
        } else if (arg0 == 15) {
            return new class226();
        } else if (arg0 == 16) {
            return new class366();
        } else if (arg0 == 17) {
            return new class257();
        } else if (arg0 == 18) {
            return new class548();
        } else if (arg0 == 19) {
            return new class205();
        } else if (arg0 == 20) {
            return new class369();
        } else if (arg0 == 21) {
            return new class384();
        } else if (arg0 == 22) {
            return new class279();
        } else if (arg0 == 23) {
            return new class398();
        } else if (arg0 == 24) {
            return new class61();
        } else if (arg0 == 25) {
            return new class644();
        } else if (arg0 == 26) {
            return new class485();
        } else if (arg0 == 27) {
            return new class423();
        } else if (arg0 == 28) {
            return new class403();
        } else if (arg0 == 29) {
            return new class521();
        } else if (arg0 == 30) {
            return new class386();
        } else if (arg0 == 31) {
            return new class235();
        } else if (arg0 == 32) {
            return new class86();
        } else if (arg0 == 33) {
            return new class253();
        } else if (arg0 == 34) {
            return new class273();
        } else if (arg0 == 35) {
            return new class308();
        } else if (arg0 == 36) {
            return new class467();
        } else if (arg0 == 37) {
            return new class689();
        } else if (arg0 == 38) {
            return new class133();
        } else if (arg0 == 39) {
            return new class381();
        } else {
            if (!arg1) {
                field2561 = null;
            }
            return null;
        }
    }
}
