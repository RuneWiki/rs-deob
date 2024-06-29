import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tf")
public class class175 {

    @OriginalMember(owner = "client!tf", name = "d", descriptor = "[S")
    public static short[] field2769 = new short[] { 6798, 8741, 25238, 4626, 4550 };

    @OriginalMember(owner = "client!tf", name = "g", descriptor = "Z")
    public static boolean field2772 = false;

    @OriginalMember(owner = "client!tf", name = "e", descriptor = "Ljava/lang/String;")
    public static String field2770 = "white:";

    @OriginalMember(owner = "client!tf", name = "b", descriptor = "I")
    public static int field2767;

    @OriginalMember(owner = "client!tf", name = "c", descriptor = "I")
    public static int field2768;

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "Lrn;")
    public static class18 field2766;

    @OriginalMember(owner = "client!tf", name = "f", descriptor = "Lrn;")
    public static class18 field2771;

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(I)V", line = 8)
    public static final void method1368(int arg0) {
        class83.method749();
        class154.method1266((byte) -63);
        field2768++;
        class190.method1451((byte) 64);
        class96.field1451.method1381(-101);
        class356.field5665 = new class118();
        ((class224) class107.field1619).method1680((byte) 97);
        class229.method1724();
        class299.field4639 = 0;
        class299.field4636 = new class186[255];
        class56.method548();
        class127.method1110();
        class4.method34(arg0 ^ 0x5A39);
        class62.method623(25821, false);
        class344.method2427(-9848);
        class133.method1134(-97);
        for (int var1 = 0; var1 < 2048; var1++) {
            class171 var2 = class177.field2795[var1];
            if (var2 != null) {
                var2.field1322 = null;
            }
        }
        if (class240.field3737) {
            class127.method1097(104, 104);
            class326.method2310(class33.field502, 3);
            class273.method1999();
        }
        class41.method428(arg0 + 31, class303.field4725, class271.field4184);
        class249.method1862((byte) 60, class303.field4725);
        class355.field5652 = null;
        class18.field295 = null;
        class83.field1206 = null;
        class262.field4021 = null;
        class67.field1026 = null;
        if (class295.field4578 == 5) {
            class157.method1277(class303.field4725, false);
        }
        if (class295.field4578 == 10) {
            class48.method470(false, -1);
        }
        if (~class295.field4578 == arg0) {
            method1370(25, (byte) -83);
        }
    }

    @OriginalMember(owner = "client!tf", name = "b", descriptor = "(I)V", line = 72)
    public static void method1369(int arg0) {
        field2771 = null;
        if (arg0 != 28213) {
            method1369(-34);
        }
        field2770 = null;
        field2769 = null;
        field2766 = null;
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(IB)V", line = 92)
    public static final void method1370(int arg0, byte arg1) {
        field2767++;
        if (class295.field4578 == arg0) {
            return;
        }
        if (class295.field4578 == 0) {
            class327.method2319(true);
        }
        if (arg1 != -83) {
            method1368(-80);
        }
        if (arg0 == 40) {
            class317.method2235((byte) -84);
        }
        if (arg0 != 40 && class238.field3689 != null) {
            class238.field3689.method2429(false);
            class238.field3689 = null;
        }
        if (arg0 == 25 || arg0 == 28) {
            class204.field3153 = 1;
            class106.field1600 = 0;
            class164.field2608 = 0;
            class148.field2432 = 0;
            class339.field5213 = 1;
            class62.method623(25821, true);
        }
        boolean var2 = arg0 == 5 || arg0 == 10 || arg0 == 28;
        if (arg0 == 25 || arg0 == 10) {
            class23.method239(2);
        }
        if (arg0 == 5) {
            class157.method1277(class303.field4725, false);
        } else {
            class344.method2427(-9848);
        }
        boolean var3 = class295.field4578 == 5 || class295.field4578 == 10 || class295.field4578 == 28;
        if (var2 != var3) {
            if (var2) {
                class327.field5039 = class144.field2358;
                if (class239.field3720 == 0) {
                    class217.method1626(2, 124);
                } else {
                    class345.method2431(2, (byte) 115, class155.field2504, class144.field2358, 255, false, 0);
                }
                class160.field2553.method1713(true, false);
            } else {
                class217.method1626(2, 119);
                class160.field2553.method1713(true, true);
            }
        }
        if (class240.field3737 && (arg0 == 25 || arg0 == 28 || arg0 == 40)) {
            class240.method1816();
        }
        class295.field4578 = arg0;
    }
}
