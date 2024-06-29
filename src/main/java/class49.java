import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oi")
public class class49 {

    @OriginalMember(owner = "client!oi", name = "h", descriptor = "Lgd;")
    public static class206 field654 = new class206("Starting 3d Library", "Starte 3D-Softwarebibliothek.", "Démarrage de la librairie 3D", "Iniciando biblioteca 3D");

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "I")
    public static int field647;

    @OriginalMember(owner = "client!oi", name = "b", descriptor = "I")
    public int field648;

    @OriginalMember(owner = "client!oi", name = "c", descriptor = "I")
    public static int field649;

    @OriginalMember(owner = "client!oi", name = "d", descriptor = "I")
    public int field650;

    @OriginalMember(owner = "client!oi", name = "e", descriptor = "I")
    public int field651;

    @OriginalMember(owner = "client!oi", name = "f", descriptor = "I")
    public static int field652;

    @OriginalMember(owner = "client!oi", name = "g", descriptor = "I")
    public int field653;

    @OriginalMember(owner = "client!oi", name = "i", descriptor = "Ljd;")
    public static class139 field655;

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(B)V", line = 3)
    public static final void method348(byte arg0) {
        field647++;
        class63.field845.method1519(-16576);
        class351.field4877.method337((byte) 99);
        class11.field140.method337((byte) 100);
        if (arg0 != 125) {
            method350(true, 9, 100);
        }
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(I)V", line = 17)
    public static void method349(int arg0) {
        field655 = null;
        if (arg0 > 59) {
            field654 = null;
        }
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(ZII)V", line = 32)
    public static final void method350(boolean arg0, int arg1, int arg2) {
        if (arg2 == 0) {
            class98.field1432 = class364.method2216(arg1 ^ 0x960006D, class488.field6789.field6678 * 2, class251.field3359, class248.field3300, class28.field378, arg2);
        } else {
            if (arg0) {
                class98.field1432 = class364.method2216(-87, 0, class251.field3359, class248.field3300, class28.field378, 0);
                class98.field1432.method2064(0);
                class347 var3 = class330.method1836(arg1 - 157286400, 0, class31.field422, class172.field2358);
                class345 var4 = class98.field1432.method2084(var3, class325.method1823(class473.field6525, class31.field422, 0), true);
                class363.method2212(var4, true, class230.field3051.method1176(class110.field1676, (byte) -110), (byte) 84);
                class98.field1432.method1966();
                class112.method718(arg1 ^ 0xF69FFFA8);
                class98.field1432.method2217(16384);
            }
            try {
                class98.field1432 = class364.method2216(124, class488.field6789.field6678 * 2, class251.field3359, class248.field3300, class28.field378, arg2);
            } catch (Throwable var7) {
                class98.field1432 = class364.method2216(-59, 0, class251.field3359, class248.field3300, class28.field378, 0);
                arg2 = 0;
            }
        }
        field652++;
        if (class98.field1432.method2007()) {
            class163 var5 = class98.field1432.method1954(157286400);
            class98.field1432.method2100(var5);
        }
        class222.field2958 = arg2;
        class105.method642((byte) 88);
        if (!class98.field1432.method2080()) {
            class195.field2636 = 1;
        }
        class98.field1432.method2062(class195.field2636);
        class98.field1432.method2041(0);
        class62.field820 = class98.field1432.method2012();
        class208.field2814 = class98.field1432.method2012();
        int var6 = (int) ((double) class295.field3947 * 34.46D);
        if (class98.field1432.method1996()) {
            var6 += 128;
        }
        if (arg1 != 157286400) {
            field654 = null;
        }
        class98.field1432.method2022(50, var6);
        class98.field1432.method2093(!class488.field6789.field6668);
        if (class98.field1432.method1995()) {
            class367.method2242(class488.field6789.field6679, -5);
        }
        class98.method602(class39.field567 >> 3, -97, class295.field3947 >> 3, class98.field1432);
        class23.method138(-85);
        class464.field6399 = false;
    }
}
