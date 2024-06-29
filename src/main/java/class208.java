import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sn")
public class class208 {

    @OriginalMember(owner = "client!sn", name = "d", descriptor = "Lsr;")
    public class354 field3169 = new class354();

    @OriginalMember(owner = "client!sn", name = "e", descriptor = "[I")
    public static int[] field3170 = new int[1];

    @OriginalMember(owner = "client!sn", name = "f", descriptor = "[S")
    public static short[] field3171 = new short[256];

    @OriginalMember(owner = "client!sn", name = "m", descriptor = "Lpn;")
    public static class49 field3178;

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "I")
    public static int field3166;

    @OriginalMember(owner = "client!sn", name = "b", descriptor = "I")
    public static int field3167;

    @OriginalMember(owner = "client!sn", name = "c", descriptor = "I")
    public static int field3168;

    @OriginalMember(owner = "client!sn", name = "g", descriptor = "I")
    public static int field3172;

    @OriginalMember(owner = "client!sn", name = "h", descriptor = "I")
    public static int field3173;

    @OriginalMember(owner = "client!sn", name = "i", descriptor = "I")
    public static int field3174;

    @OriginalMember(owner = "client!sn", name = "k", descriptor = "I")
    public static int field3176;

    @OriginalMember(owner = "client!sn", name = "l", descriptor = "I")
    public static int field3177;

    @OriginalMember(owner = "client!sn", name = "j", descriptor = "Lsr;")
    private class354 field3175;

    static {
        new class179("Invalid channel name entered!", "Ungültiger Chatraum-Name angegeben.", "Nom de canal incorrect !", "Nome de canal inválido!");
        field3178 = new class49(27, 2);
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(I)Lsr;", line = 3)
    public final class354 method1444(int arg0) {
        field3172++;
        class354 var2 = this.field3169.field5238;
        if (this.field3169 == var2) {
            this.field3175 = null;
            return null;
        }
        this.field3175 = var2.field5238;
        if (arg0 != 1) {
            this.field3169 = null;
        }
        return var2;
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(B)V", line = 25)
    public static final void method1445(byte arg0) {
        field3166++;
        if (class258.method1816(-29710)) {
            if (class86.field1415 == null) {
                class74.method687((byte) -72);
            }
            class71.field1130 = 0;
            class195.field3060 = true;
            try {
                class480.field7051 = class281.field4379.getToolkit().getSystemClipboard();
            } catch (Exception var1) {
            }
        }
        if (arg0 <= 38) {
            field3178 = null;
        }
    }

    @OriginalMember(owner = "client!sn", name = "b", descriptor = "(I)V", line = 55)
    public static void method1446(int arg0) {
        field3171 = null;
        field3170 = null;
        field3178 = null;
        if (arg0 <= 67) {
            method1445((byte) 17);
        }
    }

    @OriginalMember(owner = "client!sn", name = "c", descriptor = "(I)I", line = 68)
    public final int method1447(int arg0) {
        field3168++;
        int var2 = arg0;
        class354 var3 = this.field3169.field5238;
        while (this.field3169 != var3) {
            var3 = var3.field5238;
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!sn", name = "d", descriptor = "(I)V", line = 86)
    public static final void method1448(int arg0) {
        field3167++;
        class259.field4151.method33((byte) 75);
        int var1 = 97 / ((arg0 - 58) / 59);
        class377.field5570.method1481(-10462);
        class281.field4379.method1653(32);
        class342.field5114.setBackground(Color.black);
        class384.field5654 = -1;
        class259.field4151 = class291.method1951(class342.field5114, (byte) -55);
        class377.field5570 = class21.method130(class342.field5114, true, true);
    }

    @OriginalMember(owner = "client!sn", name = "b", descriptor = "(B)Lsr;", line = 107)
    public final class354 method1449(byte arg0) {
        if (arg0 != 111) {
            return null;
        }
        field3174++;
        class354 var2 = this.field3175;
        if (this.field3169 == var2) {
            this.field3175 = null;
            return null;
        } else {
            this.field3175 = var2.field5238;
            return var2;
        }
    }

    @OriginalMember(owner = "client!sn", name = "e", descriptor = "(I)V", line = 127)
    public final void method1450(int arg0) {
        if (arg0 != -25864) {
            field3177 = 114;
        }
        while (true) {
            class354 var2 = this.field3169.field5238;
            if (this.field3169 == var2) {
                field3176++;
                this.field3175 = null;
                return;
            }
            var2.method2260(0);
        }
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(Lsr;I)V", line = 150)
    public final void method1451(class354 arg0, int arg1) {
        if (arg0.field5241 != null) {
            arg0.method2260(0);
        }
        field3173++;
        arg0.field5241 = this.field3169.field5241;
        if (arg1 != -1) {
            method1448(-109);
        }
        arg0.field5238 = this.field3169;
        arg0.field5241.field5238 = arg0;
        arg0.field5238.field5241 = arg0;
    }

    @OriginalMember(owner = "client!sn", name = "<init>", descriptor = "()V", line = 182)
    public class208() {
        this.field3169.field5241 = this.field3169;
        this.field3169.field5238 = this.field3169;
    }
}
