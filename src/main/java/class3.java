import java.awt.Component;
import java.awt.event.KeyEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ac")
public class class3 {

    @OriginalMember(owner = "client!ac", name = "f", descriptor = "[I")
    private int[] field56;

    @OriginalMember(owner = "client!ac", name = "e", descriptor = "Lke;")
    public static class65 field55 = class1.method17("m", -112);

    @OriginalMember(owner = "client!ac", name = "d", descriptor = "Lke;")
    public static class65 field54 = class1.method17("Ung-Ultiger Benutzername oder Passwort)3", -118);

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "Lke;")
    private static class65 field52 = class1.method17("This world is full)3", -119);

    @OriginalMember(owner = "client!ac", name = "c", descriptor = "Lke;")
    public static class65 field53 = field52;

    @OriginalMember(owner = "client!ac", name = "i", descriptor = "I")
    public static int field59 = 0;

    @OriginalMember(owner = "client!ac", name = "m", descriptor = "Lke;")
    public static class65 field63 = class1.method17("leuchten3:", -111);

    @OriginalMember(owner = "client!ac", name = "p", descriptor = "Lke;")
    private static class65 field66 = class1.method17("Welcome to RuneScape", -128);

    @OriginalMember(owner = "client!ac", name = "o", descriptor = "Lke;")
    public static class65 field65 = field66;

    @OriginalMember(owner = "client!ac", name = "l", descriptor = "Lqd;")
    public static class100 field62 = new class100(20);

    @OriginalMember(owner = "client!ac", name = "s", descriptor = "Lke;")
    public static class65 field69 = class1.method17("Schrifts-=tze geladen)3", -127);

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "I")
    public static int field51;

    @OriginalMember(owner = "client!ac", name = "g", descriptor = "I")
    public static int field57;

    @OriginalMember(owner = "client!ac", name = "h", descriptor = "I")
    public static int field58;

    @OriginalMember(owner = "client!ac", name = "j", descriptor = "I")
    public static int field60;

    @OriginalMember(owner = "client!ac", name = "k", descriptor = "I")
    public static int field61;

    @OriginalMember(owner = "client!ac", name = "n", descriptor = "I")
    public static int field64;

    @OriginalMember(owner = "client!ac", name = "q", descriptor = "Luc;")
    public static class119 field67;

    @OriginalMember(owner = "client!ac", name = "r", descriptor = "Lpa;")
    public static class90 field68;

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(Ljava/awt/event/KeyEvent;I)I", line = 14)
    public static final int method24(KeyEvent arg0, int arg1) {
        field51++;
        int var2 = arg0.getKeyChar();
        if (var2 <= 0 || var2 >= 256) {
            var2 = -1;
        }
        int var3 = -47 % ((arg1 - 68) / 32);
        return var2;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(Ljava/awt/Component;I)V", line = 35)
    public static final void method25(Component arg0, int arg1) {
        if (arg1 != -6087) {
            field53 = null;
        }
        arg0.removeMouseListener(class130.field3157);
        arg0.removeMouseMotionListener(class130.field3157);
        field61++;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(Ljd;BZLjd;)V", line = 62)
    public static final void method26(class58 arg0, byte arg1, boolean arg2, class58 arg3) {
        class24.field604 = arg0;
        if (arg1 != 27) {
            method25(null, -70);
        }
        class129.field3115 = arg2;
        field58++;
        class19.field410 = arg3;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(II)I", line = 77)
    public final int method27(int arg0, int arg1) {
        field57++;
        int var3 = this.field56.length - 2;
        int var4 = arg1 << 1 & var3;
        if (arg0 != 1946) {
            method26(null, (byte) -45, false, null);
        }
        while (true) {
            int var5 = this.field56[var4];
            if (arg1 == var5) {
                return this.field56[var4 + 1];
            }
            if (var5 == -1) {
                return -1;
            }
            var4 = var3 & var4 + 2;
        }
    }

    @OriginalMember(owner = "client!ac", name = "<init>", descriptor = "([I)V", line = 105)
    public class3(int[] arg0) {
        int var2;
        for (var2 = 1; var2 <= (arg0.length >> 1) + arg0.length; var2 <<= 0x1) {
        }
        this.field56 = new int[var2 + var2];
        for (int var3 = 0; var3 < var2 + var2; var3++) {
            this.field56[var3] = -1;
        }
        int var4 = 0;
        while (arg0.length > var4) {
            int var5;
            for (var5 = arg0[var4] & var2 - 1; this.field56[var5 + var5 + 1] != -1; var5 = var2 - 1 & var5 + 1) {
            }
            this.field56[var5 + var5] = arg0[var4];
            this.field56[var5 + var5 + 1] = var4++;
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(I)V", line = 141)
    public static void method28(int arg0) {
        field55 = null;
        field62 = null;
        field67 = null;
        field54 = null;
        field65 = null;
        if (arg0 != -1) {
            return;
        }
        field63 = null;
        field69 = null;
        field68 = null;
        field53 = null;
        field52 = null;
        field66 = null;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(IIIIIIIIII)V", line = 182)
    public static final void method29(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field60++;
        class22 var10 = null;
        class22 var11 = (class22) class104.field2663.method421(1);
        int var12 = -31 / ((3 - arg2) / 36);
        while (var11 != null) {
            if (var11.field536 == arg7 && var11.field546 == arg3 && var11.field541 == arg0 && var11.field548 == arg9) {
                var10 = var11;
                break;
            }
            var11 = (class22) class104.field2663.method428(22743);
        }
        if (var10 == null) {
            var10 = new class22();
            var10.field536 = arg7;
            var10.field548 = arg9;
            var10.field546 = arg3;
            var10.field541 = arg0;
            class6.method47(122, var10);
            class104.field2663.method425(var10, 16);
        }
        var10.field530 = arg5;
        var10.field523 = arg6;
        var10.field544 = arg8;
        var10.field522 = arg1;
        var10.field534 = arg4;
    }
}
