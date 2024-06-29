import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ps")
public class class63 {

    @OriginalMember(owner = "client!ps", name = "f", descriptor = "Ljk;")
    private class449 field823 = new class449(64);

    @OriginalMember(owner = "client!ps", name = "e", descriptor = "Lqn;")
    private class47 field822;

    @OriginalMember(owner = "client!ps", name = "c", descriptor = "I")
    public int field820;

    @OriginalMember(owner = "client!ps", name = "b", descriptor = "Ldq;")
    public static class493 field819 = new class493(7, 8);

    @OriginalMember(owner = "client!ps", name = "g", descriptor = "[Z")
    public static boolean[] field824 = new boolean[200];

    @OriginalMember(owner = "client!ps", name = "j", descriptor = "S")
    public static short field827;

    @OriginalMember(owner = "client!ps", name = "i", descriptor = "[I")
    public static int[] field826;

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "I")
    public static int field818;

    @OriginalMember(owner = "client!ps", name = "d", descriptor = "I")
    public static int field821;

    @OriginalMember(owner = "client!ps", name = "h", descriptor = "I")
    public static int field825;

    @OriginalMember(owner = "client!ps", name = "k", descriptor = "Lrp;")
    public static class302 field828;

    static {
        new class335("You have been permanently muted due to breaking a rule.", "Du wurdest permanent stumm geschaltet, da du gegen eine Regel verstoßen hast.", "L'accès à la messagerie instantanée vous a définitivement été retiré suite à une infraction.", "Você foi permanentemente vetado por ter violado uma regra.");
        field827 = 256;
        field826 = new int[25];
    }

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(I)V", line = 4)
    public static void method572(int arg0) {
        if (arg0 != -769) {
            method573(74, false, -99, 95, -29, -42);
        }
        field824 = null;
        field828 = null;
        field819 = null;
        field826 = null;
    }

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(IZIIII)V", line = 19)
    public static final void method573(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5) {
        if (class24.field347 != null && (arg5 != 3 || class407.field5817.field3643 != arg2 || class407.field5817.field3644 != arg3)) {
            class122.method868(class24.field347, class219.field2794, 0);
            class24.field347 = null;
        }
        field825++;
        if (arg5 == 3 && class24.field347 == null) {
            class24.field347 = class345.method1982(arg2, class219.field2794, 0, 0, 0, arg3);
            if (class24.field347 != null) {
                class407.field5817.field3643 = arg2;
                class407.field5817.field3644 = arg3;
                class407.field5817.method578((byte) 123, class219.field2794);
            }
        }
        if (~arg5 == arg4 && class24.field347 == null) {
            method573(arg0, true, -1, -1, -4, class407.field5817.field3635);
            return;
        }
        Container var6;
        if (class24.field347 != null) {
            class250.field3209 = arg2;
            var6 = class24.field347;
            class3.field33 = arg3;
        } else if (class123.field1656 == null) {
            var6 = class219.field2794.field6891;
            class250.field3209 = var6.getSize().width;
            class3.field33 = var6.getSize().height;
        } else {
            Insets var7 = class123.field1656.getInsets();
            class250.field3209 = class123.field1656.getSize().width - var7.left - var7.right;
            class3.field33 = class123.field1656.getSize().height - var7.bottom - var7.top;
            var6 = class123.field1656;
        }
        if (arg5 == 1) {
            class252.field3218 = 0;
            class468.field6762 = (class250.field3209 - class470.field6826) / 2;
            class174.field2262 = class470.field6826;
            class390.field5236 = class345.field4426;
        } else if (class105.field1333 < 96 && class377.field4959 == 0) {
            int var8 = class250.field3209 > 1024 ? 1024 : class250.field3209;
            class468.field6762 = (class250.field3209 - var8) / 2;
            class174.field2262 = var8;
            int var9 = class3.field33 > 768 ? 768 : class3.field33;
            class390.field5236 = var9;
            class252.field3218 = 0;
        } else {
            class174.field2262 = class250.field3209;
            class468.field6762 = 0;
            class252.field3218 = 0;
            class390.field5236 = class3.field33;
        }
        if (class324.field4107 != class218.field2784) {
            boolean var10000;
            if (class174.field2262 < 1024 && class390.field5236 < 768) {
                var10000 = true;
            } else {
                var10000 = false;
            }
        }
        if (arg1) {
            class53.method523(-7340);
        } else {
            class8.field71.setSize(class174.field2262, class390.field5236);
            class33.field416.method315(class8.field71);
            if (class123.field1656 == var6) {
                Insets var10 = class123.field1656.getInsets();
                class8.field71.setLocation(class468.field6762 + var10.left, var10.top - -class252.field3218);
            } else {
                class8.field71.setLocation(class468.field6762, class252.field3218);
            }
        }
        if (arg5 < 2) {
            class57.field751 = false;
        } else {
            class57.field751 = true;
        }
        if (class277.field3510 != -1) {
            class161.method1039(true, 47);
        }
        if (class64.field835 != null && class480.method2931(class483.field7059, (byte) -84)) {
            class498.method3002(arg4 + 4);
        }
        for (int var11 = 0; var11 < 100; var11++) {
            class229.field2928[var11] = true;
        }
        class140.field1805 = true;
    }

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(IB)Lfn;", line = 168)
    public final class92 method574(int arg0, byte arg1) {
        field818++;
        class449 var3 = this.field823;
        class92 var4;
        synchronized (this.field823) {
            var4 = (class92) this.field823.method2647(-100, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        class47 var5 = this.field822;
        byte[] var6;
        synchronized (this.field822) {
            var6 = this.field822.method481(19, arg0, -107);
        }
        class92 var7 = new class92();
        if (var6 != null) {
            var7.method716(new class463(var6), (byte) -69);
        }
        class449 var8 = this.field823;
        synchronized (this.field823) {
            this.field823.method2635((long) arg0, -26591, var7);
        }
        if (arg1 != 53) {
            method572(-83);
        }
        return var7;
    }

    @OriginalMember(owner = "client!ps", name = "<init>", descriptor = "(Lae;ILqn;)V", line = 226)
    public class63(class165 arg0, int arg1, class47 arg2) {
        this.field822 = arg2;
        this.field820 = this.field822.method469(30322, 19);
    }
}
