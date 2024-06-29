import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fg")
public class class295 {

    @OriginalMember(owner = "client!fg", name = "c", descriptor = "[I")
    public static int[] field4751 = new int[50];

    @OriginalMember(owner = "client!fg", name = "e", descriptor = "Llo;")
    public static class306 field4753 = new class306("Loaded interfaces", "Benutzeroberfläche geladen.", "Interfaces chargées", "Interfaces carregadas");

    @OriginalMember(owner = "client!fg", name = "d", descriptor = "F")
    public static float field4752;

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "I")
    public static int field4749;

    @OriginalMember(owner = "client!fg", name = "b", descriptor = "I")
    public static int field4750;

    @OriginalMember(owner = "client!fg", name = "g", descriptor = "I")
    public static int field4755;

    @OriginalMember(owner = "client!fg", name = "i", descriptor = "I")
    public static int field4757;

    @OriginalMember(owner = "client!fg", name = "h", descriptor = "Lo;")
    public static class138 field4756;

    @OriginalMember(owner = "client!fg", name = "f", descriptor = "Lqs;")
    public static class496 field4754;

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(ZIB)Lwu;", line = 3)
    public static final class112 method1888(boolean arg0, int arg1, byte arg2) {
        field4755++;
        long var3 = (long) ((arg0 ? Integer.MIN_VALUE : 0) | arg1);
        if (arg2 <= 66) {
            field4754 = null;
        }
        return (class112) class230.field3999.method2516(var3, -1);
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(ILl;Ljava/awt/Canvas;I)Lza;", line = 20)
    public static final class491 method1889(int arg0, class196 arg1, Canvas arg2, int arg3) {
        if (arg0 != -7830) {
            field4756 = null;
        }
        field4750++;
        return new class113(arg3, arg2, arg1);
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(Lqs;III)Luq;", line = 32)
    public static final class346 method1890(class496 arg0, int arg1, int arg2, int arg3) {
        field4757++;
        class23 var4 = new class23(arg0.method2926(arg2, -74, arg3));
        class346 var5 = new class346(arg2, var4.method156((byte) -77), var4.method156((byte) -100), var4.method143(-3230), var4.method143(arg1 ^ 0xFFFFF362), var4.method126((byte) -118) == 1, var4.method126((byte) -121), var4.method126((byte) -112));
        int var6 = var4.method126((byte) -92);
        for (int var7 = arg1; var7 < var6; var7++) {
            var5.field5441.method2541(0, new class116(var4.method126((byte) -73), var4.method132(103), var4.method132(26), var4.method132(arg1 ^ 0x7D), var4.method132(64), var4.method132(83), var4.method132(82), var4.method132(arg1 ^ 0x5A), var4.method132(arg1 ^ 0x71)));
        }
        var5.method2237(false);
        return var5;
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(I)V", line = 60)
    public static void method1891(int arg0) {
        field4756 = null;
        field4751 = null;
        if (arg0 != 50) {
            field4753 = null;
        }
        field4754 = null;
        field4753 = null;
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(III)I", line = 77)
    public static final int method1892(int arg0, int arg1, int arg2) {
        field4749++;
        if (arg2 != -16353) {
            method1891(73);
        }
        return arg1 == 4 || arg1 == 5 ? class340.field5338[arg0 & 0x3] : 256;
    }
}
