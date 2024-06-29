import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fb")
public class class38 extends Canvas {

    @OriginalMember(owner = "client!fb", name = "n", descriptor = "Ljava/awt/Component;")
    private Component field801;

    @OriginalMember(owner = "client!fb", name = "c", descriptor = "Lrd;")
    public static class114 field790 = class84.method656("oder benutzen Sie eine andere Welt)3", (byte) 126);

    @OriginalMember(owner = "client!fb", name = "i", descriptor = "Lrd;")
    public static class114 field796 = class84.method656("Aus", (byte) 118);

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "Lrd;")
    public static class114 field788 = class84.method656("::", (byte) 117);

    @OriginalMember(owner = "client!fb", name = "j", descriptor = "Lrd;")
    public static class114 field797 = class84.method656("Fertigkeit)2", (byte) 125);

    @OriginalMember(owner = "client!fb", name = "m", descriptor = "I")
    public static int field800 = 0;

    @OriginalMember(owner = "client!fb", name = "o", descriptor = "I")
    public static int field802 = -1;

    @OriginalMember(owner = "client!fb", name = "g", descriptor = "Lrd;")
    private static class114 field794 = class84.method656("Ok", (byte) 114);

    @OriginalMember(owner = "client!fb", name = "p", descriptor = "Lrd;")
    public static class114 field803 = field794;

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "I")
    public static int field789;

    @OriginalMember(owner = "client!fb", name = "d", descriptor = "I")
    public static int field791;

    @OriginalMember(owner = "client!fb", name = "e", descriptor = "I")
    public static int field792;

    @OriginalMember(owner = "client!fb", name = "f", descriptor = "I")
    public static int field793;

    @OriginalMember(owner = "client!fb", name = "h", descriptor = "I")
    public static int field795;

    @OriginalMember(owner = "client!fb", name = "k", descriptor = "I")
    public static int field798;

    @OriginalMember(owner = "client!fb", name = "l", descriptor = "I")
    public static int field799;

    @OriginalMember(owner = "client!fb", name = "q", descriptor = "I")
    public static int field804;

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(II)Lle;")
    public static final class79 method270(int arg0, int arg1) {
        if (arg1 != 5) {
            method272(-78, null, false, true);
        }
        field798++;
        class79 var2 = (class79) class125.field2964.method194((byte) -77, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class103.field2409.method762(5, arg0, (byte) 66);
        class79 var4 = new class79();
        if (var3 != null) {
            var4.method630(new class60(var3), (byte) 81);
        }
        class125.field2964.method193(arg1 - 102, var4, (long) arg0);
        return var4;
    }

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "(II)I")
    public static int method271(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(ILg;ZZ)Z")
    public static final boolean method272(int arg0, class43 arg1, boolean arg2, boolean arg3) {
        field792++;
        if (class107.method820(arg1, true, arg2)) {
            if (arg0 > 0) {
                class46.field943 = new class26(arg0);
            }
            return arg3 ? true : true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(I)V")
    public static final void method273(int arg0) {
        class61.field1292 = new class84();
        field789++;
        if (arg0 != 20) {
            field797 = null;
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(ZI)I")
    public static final int method274(boolean arg0, int arg1) {
        if (!arg0) {
            method273(55);
        }
        field795++;
        return arg1 >> 17 & 0x7;
    }

    @OriginalMember(owner = "client!fb", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        field804++;
        this.field801.update(arg0);
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(Z)V")
    public static final void method275(boolean arg0) {
        field799++;
        if (class98.field2216 == null || !arg0) {
            return;
        }
        if (class36.field699 >= 0) {
            if (class110.field2575 > 0) {
                class125.field2973 += class127.field3023;
                class98.field2216.method176(class125.field2973, class36.field699, 14);
                class110.field2575--;
                if (class110.field2575 == 0) {
                    class98.field2216.method181((byte) -12);
                    class36.field699 = -1;
                    class110.field2575 = 20;
                }
            }
        } else if (class110.field2575 > 0) {
            class110.field2575--;
            if (class110.field2575 == 0) {
                if (class65.field1395 == null) {
                    class98.field2216.method167(65535, 256);
                } else {
                    class98.field2216.method167(65535, class20.field371);
                    class36.field699 = class20.field371;
                    class98.field2216.method178(client.field400, class20.field371, (byte) -28, class65.field1395);
                    class65.field1395 = null;
                }
                class125.field2973 = 0;
            }
        }
        class98.field2216.method169(15299);
    }

    @OriginalMember(owner = "client!fb", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final void paint(Graphics arg0) {
        field791++;
        this.field801.paint(arg0);
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(B)V")
    public static void method276(byte arg0) {
        field788 = null;
        field797 = null;
        field803 = null;
        if (arg0 >= -22) {
            method273(82);
        }
        field796 = null;
        field790 = null;
        field794 = null;
    }

    @OriginalMember(owner = "client!fb", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
    public class38(Component arg0) {
        this.field801 = arg0;
    }
}
