import java.awt.event.KeyEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oe")
public class class102 {

    @OriginalMember(owner = "client!oe", name = "I", descriptor = "I")
    private int field2486 = 0;

    @OriginalMember(owner = "client!oe", name = "l", descriptor = "[Lfe;")
    private class41[] field2464;

    @OriginalMember(owner = "client!oe", name = "B", descriptor = "I")
    private int field2480;

    @OriginalMember(owner = "client!oe", name = "j", descriptor = "Lu;")
    public static class135 field2462 = class87.method676((byte) -114, "Freunde)2Server)3)3)3");

    @OriginalMember(owner = "client!oe", name = "x", descriptor = "Lu;")
    public static class135 field2476 = class87.method676((byte) -101, "@yel@*V");

    @OriginalMember(owner = "client!oe", name = "c", descriptor = "[I")
    public static int[] field2455 = new int[5];

    @OriginalMember(owner = "client!oe", name = "t", descriptor = "Lu;")
    private static class135 field2472 = class87.method676((byte) -121, "Malformed login packet)3");

    @OriginalMember(owner = "client!oe", name = "u", descriptor = "Lu;")
    private static class135 field2473 = class87.method676((byte) -64, "FULL");

    @OriginalMember(owner = "client!oe", name = "n", descriptor = "Lu;")
    private static class135 field2466 = class87.method676((byte) -127, "wishes to trade with you)3");

    @OriginalMember(owner = "client!oe", name = "q", descriptor = "Lu;")
    private static class135 field2469 = class87.method676((byte) -73, "Loaded sprites");

    @OriginalMember(owner = "client!oe", name = "w", descriptor = "Lu;")
    public static class135 field2475 = field2466;

    @OriginalMember(owner = "client!oe", name = "s", descriptor = "Lu;")
    private static class135 field2471 = class87.method676((byte) -120, "Checking for updates )2 ");

    @OriginalMember(owner = "client!oe", name = "m", descriptor = "I")
    public static int field2465 = 128;

    @OriginalMember(owner = "client!oe", name = "E", descriptor = "I")
    public static int field2483 = 7759444;

    @OriginalMember(owner = "client!oe", name = "e", descriptor = "Lu;")
    public static class135 field2457 = class87.method676((byte) -109, "");

    @OriginalMember(owner = "client!oe", name = "g", descriptor = "Lu;")
    public static class135 field2459 = field2471;

    @OriginalMember(owner = "client!oe", name = "G", descriptor = "I")
    public static int field2485 = 0;

    @OriginalMember(owner = "client!oe", name = "f", descriptor = "Lu;")
    public static class135 field2458 = field2473;

    @OriginalMember(owner = "client!oe", name = "z", descriptor = "Lu;")
    public static class135 field2478 = class87.method676((byte) -95, "An:");

    @OriginalMember(owner = "client!oe", name = "k", descriptor = "Lu;")
    public static class135 field2463 = field2469;

    @OriginalMember(owner = "client!oe", name = "h", descriptor = "Lu;")
    public static class135 field2460 = field2472;

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "I")
    public static int field2453;

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "I")
    public static int field2454;

    @OriginalMember(owner = "client!oe", name = "o", descriptor = "I")
    public static int field2467;

    @OriginalMember(owner = "client!oe", name = "p", descriptor = "I")
    public static int field2468;

    @OriginalMember(owner = "client!oe", name = "r", descriptor = "I")
    public static int field2470;

    @OriginalMember(owner = "client!oe", name = "v", descriptor = "I")
    public static int field2474;

    @OriginalMember(owner = "client!oe", name = "A", descriptor = "I")
    public static int field2479;

    @OriginalMember(owner = "client!oe", name = "C", descriptor = "I")
    public static int field2481;

    @OriginalMember(owner = "client!oe", name = "D", descriptor = "I")
    public static int field2482;

    @OriginalMember(owner = "client!oe", name = "y", descriptor = "J")
    private long field2477;

    @OriginalMember(owner = "client!oe", name = "d", descriptor = "Lfe;")
    private class41 field2456;

    @OriginalMember(owner = "client!oe", name = "F", descriptor = "Lfe;")
    private class41 field2484;

    @OriginalMember(owner = "client!oe", name = "i", descriptor = "Lg;")
    public static class43 field2461;

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(BLjava/awt/event/KeyEvent;)I")
    public static final int method835(byte arg0, KeyEvent arg1) {
        int var2 = arg1.getKeyChar();
        field2453++;
        if (var2 <= 0 || var2 >= 256) {
            var2 = -1;
        }
        int var3 = 92 % ((84 - arg0) / 39);
        return var2;
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(JBLfe;)V")
    public final void method836(long arg0, byte arg1, class41 arg2) {
        if (arg1 <= 50) {
            method838(64);
        }
        field2481++;
        if (arg2.field954 != null) {
            arg2.method302(4071);
        }
        class41 var5 = this.field2464[(int) (arg0 & (long) (this.field2480 - 1))];
        arg2.field954 = var5.field954;
        arg2.field952 = var5;
        arg2.field954.field952 = arg2;
        arg2.field951 = arg0;
        arg2.field952.field954 = arg2;
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(B)Lfe;")
    public final class41 method837(byte arg0) {
        if (arg0 >= -56) {
            this.method836(17L, (byte) 47, null);
        }
        field2482++;
        if (this.field2486 > 0 && this.field2464[this.field2486 - 1] != this.field2484) {
            class41 var2 = this.field2484;
            this.field2484 = var2.field952;
            return var2;
        }
        while (this.field2486 < this.field2480) {
            class41 var3 = this.field2464[this.field2486++].field952;
            if (this.field2464[this.field2486 - 1] != var3) {
                this.field2484 = var3.field952;
                return var3;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(I)V")
    public static void method838(int arg0) {
        field2478 = null;
        field2471 = null;
        field2457 = null;
        if (arg0 != 14096) {
            field2466 = null;
        }
        field2461 = null;
        field2460 = null;
        field2469 = null;
        field2463 = null;
        field2462 = null;
        field2476 = null;
        field2459 = null;
        field2466 = null;
        field2455 = null;
        field2472 = null;
        field2473 = null;
        field2458 = null;
        field2475 = null;
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(BLu;)I")
    public static final int method839(byte arg0, class135 arg1) {
        field2468++;
        if (class111.field2701 == 1) {
            return 7;
        } else if (arg1.method1087(class46.field1110, (byte) -52)) {
            return 1;
        } else {
            if (arg0 >= -44) {
                method835((byte) 111, null);
            }
            if (arg1.method1087(class77.field1829, (byte) -52)) {
                return 1;
            } else if (arg1.method1087(class12.field275, (byte) -52)) {
                return 2;
            } else if (arg1.method1087(class138.field3354, (byte) -52)) {
                return 2;
            } else if (arg1.method1087(class43.field1049, (byte) -52)) {
                return 3;
            } else if (arg1.method1087(class42.field999, (byte) -52)) {
                return 4;
            } else if (arg1.method1087(class53.field1244, (byte) -52)) {
                return 5;
            } else if (arg1.method1087(class52.field1222, (byte) -52)) {
                return 6;
            } else {
                return 0;
            }
        }
    }

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "(I)Lfe;")
    public final class41 method840(int arg0) {
        if (arg0 == -1) {
            field2467++;
            this.field2486 = 0;
            return this.method837((byte) -126);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "(B)Lfe;")
    public final class41 method841(byte arg0) {
        field2470++;
        if (this.field2456 == null) {
            return null;
        }
        class41 var2 = this.field2464[(int) ((long) (this.field2480 - 1) & this.field2477)];
        while (this.field2456 != var2) {
            if (this.field2456.field951 == this.field2477) {
                class41 var3 = this.field2456;
                this.field2456 = this.field2456.field952;
                return var3;
            }
            this.field2456 = this.field2456.field952;
        }
        if (arg0 != -26) {
            field2472 = null;
        }
        this.field2456 = null;
        return null;
    }

    @OriginalMember(owner = "client!oe", name = "<init>", descriptor = "(I)V")
    public class102(int arg0) {
        this.field2464 = new class41[arg0];
        this.field2480 = arg0;
        for (int var2 = 0; var2 < arg0; var2++) {
            class41 var3 = this.field2464[var2] = new class41();
            var3.field954 = var3;
            var3.field952 = var3;
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(JI)Lfe;")
    public final class41 method842(long arg0, int arg1) {
        this.field2477 = arg0;
        class41 var4 = this.field2464[(int) ((long) (this.field2480 - 1) & arg0)];
        this.field2456 = var4.field952;
        if (arg1 < 122) {
            return null;
        }
        field2474++;
        while (this.field2456 != var4) {
            if (this.field2456.field951 == arg0) {
                class41 var5 = this.field2456;
                this.field2456 = this.field2456.field952;
                return var5;
            }
            this.field2456 = this.field2456.field952;
        }
        this.field2456 = null;
        return null;
    }
}
