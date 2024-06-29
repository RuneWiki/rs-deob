import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qr")
public class class468 extends class35 {

    @OriginalMember(owner = "client!qr", name = "o", descriptor = "[[Z")
    public static boolean[][] field6583 = new boolean[][] { new boolean[4], { false, true, true, false }, { true, false, true, false }, { true, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, { true, true, false, false }, new boolean[4], { false, true, false, true }, new boolean[4] };

    @OriginalMember(owner = "client!qr", name = "m", descriptor = "J")
    public static long field6581 = 0L;

    @OriginalMember(owner = "client!qr", name = "l", descriptor = "Lat;")
    public static class412 field6580 = new class412();

    @OriginalMember(owner = "client!qr", name = "q", descriptor = "Lo;")
    public static class332 field6585 = new class332("flash1:", "blinken1:", "clignotant1:", "flash1:");

    @OriginalMember(owner = "client!qr", name = "r", descriptor = "I")
    public static int field6586 = 0;

    @OriginalMember(owner = "client!qr", name = "n", descriptor = "I")
    public static int field6582;

    @OriginalMember(owner = "client!qr", name = "p", descriptor = "I")
    public int field6584;

    @OriginalMember(owner = "client!qr", name = "s", descriptor = "I")
    public int field6587;

    @OriginalMember(owner = "client!qr", name = "t", descriptor = "I")
    public static int field6588;

    @OriginalMember(owner = "client!qr", name = "u", descriptor = "I")
    public static int field6589;

    @OriginalMember(owner = "client!qr", name = "d", descriptor = "(I)Z", line = 3)
    public static final boolean method2745(int arg0) {
        field6589++;
        class146 var1 = (class146) class451.field6377.field5951.field435;
        if (arg0 < 78) {
            method2745(117);
        }
        if (var1 == null || class451.field6377.field5951 == var1) {
            return false;
        } else {
            if (var1.field2056 >= 2000) {
                var1.field2056 -= 2000;
            }
            return var1.field2056 == 1006;
        }
    }

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(B)V", line = 35)
    public static void method2746(byte arg0) {
        field6583 = null;
        field6585 = null;
        if (arg0 <= -37) {
            field6580 = null;
        }
    }

    @OriginalMember(owner = "client!qr", name = "e", descriptor = "(I)V", line = 47)
    public static final void method2747(int arg0) {
        class28.field375.method2388(34);
        field6582++;
        int var1 = 71 / ((-arg0 - 12) / 58);
        class327.field4893.method2388(-61);
        class169.field2409.method2388(-88);
        class138.field1986.method2388(-86);
        class273.field4114.method2388(-75);
    }
}
