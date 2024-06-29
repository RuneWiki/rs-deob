import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gi")
public abstract class class416 extends class179 {

    @OriginalMember(owner = "client!gi", name = "v", descriptor = "[I")
    public static int[] field5691 = new int[2];

    @OriginalMember(owner = "client!gi", name = "z", descriptor = "Lcq;")
    public static class72 field5695 = new class72("Loaded config", "Konfig geladen.", "Fichiers config chargés", "Config carregada");

    @OriginalMember(owner = "client!gi", name = "D", descriptor = "I")
    public static int field5698;

    @OriginalMember(owner = "client!gi", name = "C", descriptor = "[I")
    public static int[] field5697;

    @OriginalMember(owner = "client!gi", name = "G", descriptor = "I")
    public static int field5700;

    @OriginalMember(owner = "client!gi", name = "E", descriptor = "[I")
    public static int[] field5699;

    @OriginalMember(owner = "client!gi", name = "I", descriptor = "Lih;")
    public static class108 field5701;

    @OriginalMember(owner = "client!gi", name = "s", descriptor = "I")
    public static int field5688;

    @OriginalMember(owner = "client!gi", name = "t", descriptor = "I")
    public static int field5689;

    @OriginalMember(owner = "client!gi", name = "u", descriptor = "I")
    public static int field5690;

    @OriginalMember(owner = "client!gi", name = "w", descriptor = "I")
    public static int field5692;

    @OriginalMember(owner = "client!gi", name = "x", descriptor = "I")
    public static int field5693;

    @OriginalMember(owner = "client!gi", name = "y", descriptor = "I")
    public static int field5694;

    @OriginalMember(owner = "client!gi", name = "A", descriptor = "I")
    public static int field5696;

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(ZI)Lsb;")
    public static final class194 method2558(boolean arg0, int arg1) {
        field5690++;
        if (!arg0) {
            return null;
        } else if (arg1 == 0) {
            return new class308();
        } else if (arg1 == 1) {
            return new class98();
        } else if (arg1 == 2) {
            return new class97();
        } else if (arg1 == 3) {
            return new class180();
        } else if (arg1 == 4) {
            return new class378();
        } else if (arg1 == 5) {
            return new class223();
        } else if (arg1 == 6) {
            return new class361();
        } else if (arg1 == 7) {
            return new class79();
        } else if (arg1 == 8) {
            return new class106();
        } else if (arg1 == 9) {
            return new class126();
        } else if (arg1 == 10) {
            return new class261();
        } else if (arg1 == 11) {
            return new class374();
        } else if (arg1 == 12) {
            return new class310();
        } else if (arg1 == 13) {
            return new class217();
        } else if (arg1 == 14) {
            return new class181();
        } else if (arg1 == 15) {
            return new class68();
        } else if (arg1 == 16) {
            return new class39();
        } else if (arg1 == 17) {
            return new class301();
        } else if (arg1 == 18) {
            return new class387();
        } else if (arg1 == 19) {
            return new class449();
        } else if (arg1 == 20) {
            return new class170();
        } else if (arg1 == 21) {
            return new class53();
        } else if (arg1 == 22) {
            return new class350();
        } else if (arg1 == 23) {
            return new class11();
        } else if (arg1 == 24) {
            return new class383();
        } else if (arg1 == 25) {
            return new class178();
        } else if (arg1 == 26) {
            return new class183();
        } else if (arg1 == 27) {
            return new class363();
        } else if (arg1 == 28) {
            return new class96();
        } else if (arg1 == 29) {
            return new class75();
        } else if (arg1 == 30) {
            return new class395();
        } else if (arg1 == 31) {
            return new class424();
        } else if (arg1 == 32) {
            return new class50();
        } else if (arg1 == 33) {
            return new class321();
        } else if (arg1 == 34) {
            return new class421();
        } else if (arg1 == 35) {
            return new class102();
        } else if (arg1 == 36) {
            return new class314();
        } else if (arg1 == 37) {
            return new class403();
        } else if (arg1 == 38) {
            return new class87();
        } else if (arg1 == 39) {
            return new class286();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!gi", name = "b", descriptor = "(I)V")
    public static final void method2559(int arg0) {
        field5693++;
        if (arg0 != 5519) {
            return;
        }
        if (class384.field5257 && class261.field3359.method623(9, 81) && class57.field660 > 2) {
            class76.method452(0, (class266) class97.field1138.field3483.field507.field507);
        } else {
            class76.method452(arg0 - 5519, (class266) class97.field1138.field3483.field507);
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(BLaq;II)V")
    public static final void method2560(byte arg0, class453 arg1, int arg2, int arg3) {
        field5694++;
        if (class264.field3404 != null || class49.field574 || arg1 == null || class307.method1954(false, arg1) == null || arg0 > -41) {
            return;
        }
        class264.field3404 = arg1;
        class137.field1559 = class307.method1954(false, arg1);
        class11.field131 = false;
        class356.field4829 = arg3;
        class56.field644 = 0;
        class20.field214 = arg2;
    }

    @OriginalMember(owner = "client!gi", name = "d", descriptor = "(B)V")
    public static final void method2561(byte arg0) {
        field5688++;
        if (!class104.field1224) {
            return;
        }
        class453 var1 = class378.method2346(-23490, class62.field759, class357.field4844);
        if (var1 != null && var1.field6461 != null) {
            class221 var2 = new class221();
            var2.field2735 = var1.field6461;
            var2.field2732 = var1;
            class93.method578(var2);
        }
        class46.field530 = -1;
        field5698 = -1;
        if (arg0 > -19) {
            field5691 = null;
        }
        class104.field1224 = false;
        if (var1 != null) {
            class303.method1923(var1, 10240);
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(ILwo;)V")
    public static final void method2562(int arg0, class285 arg1) {
        if (arg0 < -9) {
            class234.field3081 = arg1;
            field5689++;
            class288.field3797 = class234.field3081.method1821(123, 4);
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(IB)V")
    public static final void method2563(int arg0, byte arg1) {
        if (arg1 != -66) {
            field5695 = null;
        }
        field5696++;
        class12 var2 = class390.method2422(341555040, arg0, 3);
        var2.method65(arg1 ^ 0x25);
    }

    @OriginalMember(owner = "client!gi", name = "c", descriptor = "(I)V")
    public static void method2564(int arg0) {
        field5691 = null;
        if (arg0 > -40) {
            method2558(false, 93);
        }
        field5697 = null;
        field5701 = null;
        field5699 = null;
        field5695 = null;
    }

    static {
        new class72("Select", "Auswählen", "Sélectionner", "Selecionar");
        field5698 = -1;
        field5697 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };
        field5700 = 1;
        field5699 = new int[] { 8, 11, 4, 6, 9, 7, 10, 0 };
        field5701 = new class108(128);
    }
}
