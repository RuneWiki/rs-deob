import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vg")
public class class71 {

    @OriginalMember(owner = "client!vg", name = "g", descriptor = "I")
    public static int field1389 = 0;

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "[I")
    public static int[] field1383 = new int[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };

    @OriginalMember(owner = "client!vg", name = "f", descriptor = "Lhj;")
    public static class69 field1388 = class181.method1318("overlay", (byte) -126);

    @OriginalMember(owner = "client!vg", name = "b", descriptor = "Lhj;")
    public static class69 field1384 = class181.method1318("scape main", (byte) -108);

    @OriginalMember(owner = "client!vg", name = "d", descriptor = "Lhj;")
    public static class69 field1386 = class181.method1318("Bitte warten Sie )2 es wird versucht)1 die Verbindung wiederherzustellen)3", (byte) -128);

    @OriginalMember(owner = "client!vg", name = "i", descriptor = "[I")
    public static int[] field1391 = new int[] { 1, 1, 0, 0, 0, 8, 0, 0, 8 };

    @OriginalMember(owner = "client!vg", name = "c", descriptor = "I")
    public static int field1385;

    @OriginalMember(owner = "client!vg", name = "e", descriptor = "I")
    public static int field1387;

    @OriginalMember(owner = "client!vg", name = "h", descriptor = "I")
    public static int field1390;

    @OriginalMember(owner = "client!vg", name = "j", descriptor = "I")
    public static int field1392;

    @OriginalMember(owner = "client!vg", name = "k", descriptor = "Lha;")
    public static class30 field1393;

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(B)V")
    public static void method503(byte arg0) {
        field1386 = null;
        field1391 = null;
        field1383 = null;
        field1393 = null;
        if (arg0 != -95) {
            field1385 = 92;
        }
        field1388 = null;
        field1384 = null;
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(II)I")
    public static final int method504(int arg0, int arg1) {
        if (arg0 >= -118) {
            method504(127, -21);
        }
        field1387++;
        return arg1 == 16711935 ? -1 : class112.method835(arg1, 2047);
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(ILhj;)V")
    public static final void method505(int arg0, class69 arg1) {
        if (arg0 <= 2) {
            field1383 = null;
        }
        field1392++;
        if (class245.field4487 >= 2) {
            if (arg1.method446(class207.field3779, 26)) {
                class135.method1006(-4635);
                for (int var2 = 0; var2 < 10; var2++) {
                    System.gc();
                }
                Runtime var3 = Runtime.getRuntime();
                int var4 = (int) ((var3.totalMemory() - var3.freeMemory()) / 1024L);
                class122.method881(0, (class69) null, class9.method42(62, new class69[] { class109.field2082, class98.method727(-229, var4), class263.field4699 }), false);
            }
            if (arg1.method446(class111.field2110, -128)) {
                class118.method862(false);
            }
            if (arg1.method446(class196.field3579, -128)) {
                class115.method851(78, 25);
            }
            if (arg1.method446(class17.field221, 102)) {
                class90.field1702 = true;
            }
            if (arg1.method446(class231.field4230, -122)) {
                class90.field1702 = false;
            }
            if (arg1.method446(class161.field2993, 93)) {
                for (int var5 = 0; var5 < 4; var5++) {
                    for (int var6 = 1; var6 < 103; var6++) {
                        for (int var7 = 1; var7 < 103; var7++) {
                            class79.field1518[var5].field4672[var6][var7] = 0;
                        }
                    }
                }
            }
            if (arg1.method489(true, class223.field4069) && class240.field4402 != 0) {
                class170.method1246(arg1.method478(-127, 6).method479((byte) -27), (byte) 68);
            }
            if (arg1.method446(class175.field3192, -125) && class240.field4402 == 2) {
                throw new RuntimeException();
            }
            if (arg1.method489(true, class91.field1714)) {
                class91.field1727 = arg1.method478(-90, 12).method442(-96).method479((byte) -27);
                class122.method881(0, (class69) null, class9.method42(63, new class69[] { class62.field1166, class98.method727(-229, class91.field1727) }), false);
            }
            if (arg1.method446(class239.field4385, 119)) {
                class88.field1684 = true;
            }
        }
        class47.field676++;
        class48.field692.method301(110, -104);
        class48.field692.method933(arg1.method441((byte) 73) - 1, -20946);
        class48.field692.method927(arg1.method478(-96, 2), (byte) 125);
    }
}
