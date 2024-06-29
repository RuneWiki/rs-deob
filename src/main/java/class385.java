import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pp")
public class class385 {

    @OriginalMember(owner = "client!pp", name = "b", descriptor = "[I")
    public static int[] field5799 = new int[99];

    @OriginalMember(owner = "client!pp", name = "e", descriptor = "Laa;")
    public static class76 field5802;

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "I")
    public static int field5798;

    @OriginalMember(owner = "client!pp", name = "c", descriptor = "I")
    public static int field5800;

    @OriginalMember(owner = "client!pp", name = "d", descriptor = "I")
    public static int field5801;

    @OriginalMember(owner = "client!pp", name = "f", descriptor = "I")
    public static int field5803;

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(ILya;II)V")
    public static final void method2307(int arg0, class11 arg1, int arg2, int arg3) {
        field5798++;
        if (arg0 != 12) {
            return;
        }
        class164.field2446 = new class112[arg3][arg2];
        class27.field395 = arg1;
        if (class306.field4571 != null) {
            class303.field4521 = class357.method2143(class306.field4571[2], class306.field4571[0], class306.field4571[1], false, class306.field4571[4], class306.field4571[3], class306.field4571[5]);
        }
        class418.field6268 = new class112();
        class108.method809((byte) 100);
    }

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(B)V")
    public static void method2308(byte arg0) {
        if (arg0 == -91) {
            field5799 = null;
            field5802 = null;
        }
    }

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(Z)V")
    public static final void method2309(boolean arg0) {
        class187.field2744 = 0;
        if (arg0) {
            method2308((byte) -121);
        }
        class158.field2387 = new class425[50];
        field5801++;
    }

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 99; var1++) {
            int var2 = var1 + 1;
            int var3 = (int) ((double) var2 + Math.pow(2.0D, (double) var2 / 7.0D) * 300.0D);
            var0 += var3;
            field5799[var1] = var0 / 4;
        }
        field5802 = new class76(70, 8);
    }
}
