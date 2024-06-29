import java.awt.event.KeyEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lc")
public class class139 extends class28 {

    @OriginalMember(owner = "client!lc", name = "J", descriptor = "Lvh;")
    public class42 field2532;

    @OriginalMember(owner = "client!lc", name = "G", descriptor = "Lvf;")
    public static class265 field2529 = class87.method582(-46, "scrollbar");

    @OriginalMember(owner = "client!lc", name = "K", descriptor = "Ldg;")
    public static class276 field2533 = new class276(64);

    @OriginalMember(owner = "client!lc", name = "H", descriptor = "I")
    public static int field2530;

    @OriginalMember(owner = "client!lc", name = "I", descriptor = "I")
    public static int field2531;

    @OriginalMember(owner = "client!lc", name = "M", descriptor = "I")
    public static int field2535;

    @OriginalMember(owner = "client!lc", name = "L", descriptor = "Lka;")
    public static class160 field2534;

    @OriginalMember(owner = "client!lc", name = "<init>", descriptor = "(Lvh;)V")
    public class139(class42 arg0) {
        this.field2532 = arg0;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(ZLjava/lang/Object;I)[B")
    public static final byte[] method958(boolean arg0, Object arg1, int arg2) {
        if (arg2 > -65) {
            method958(true, (Object) null, -39);
        }
        field2531++;
        if (arg1 == null) {
            return null;
        } else if (arg1 instanceof byte[]) {
            byte[] var3 = (byte[]) arg1;
            return arg0 ? class75.method533(var3, 0) : var3;
        } else if (arg1 instanceof class225) {
            class225 var4 = (class225) arg1;
            return var4.method576(-71);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!lc", name = "d", descriptor = "(I)V")
    public static void method959(int arg0) {
        field2533 = null;
        field2529 = null;
        field2534 = null;
        if (arg0 != -17999) {
            method960((KeyEvent) null, (byte) 124);
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(Ljava/awt/event/KeyEvent;B)I")
    public static final int method960(KeyEvent arg0, byte arg1) {
        field2530++;
        if (arg1 != -30) {
            return 43;
        }
        int var2 = arg0.getKeyChar();
        if (var2 == 8364) {
            return 128;
        } else {
            if (var2 <= 0 || var2 >= 256) {
                var2 = -1;
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(IIIII)V")
    public static final void method961(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2535++;
        for (int var5 = 0; var5 < class119.field2104; var5++) {
            if (client.field3858[var5] + class124.field2229[var5] > arg4 && arg2 + arg4 > client.field3858[var5] && arg1 < class72.field1390[var5] + class102.field1811[var5] && class72.field1390[var5] < (arg1 + arg0)) {
                class80.field1516[var5] = true;
            }
        }
        if (arg3 != 6467) {
            field2534 = null;
        }
    }
}
