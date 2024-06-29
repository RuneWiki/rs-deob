import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lf")
public class class220 extends class465 {

    @OriginalMember(owner = "client!lf", name = "m", descriptor = "Z")
    private boolean field3118 = false;

    @OriginalMember(owner = "client!lf", name = "j", descriptor = "Lu;")
    private class68 field3115;

    @OriginalMember(owner = "client!lf", name = "h", descriptor = "I")
    public static int field3113 = 0;

    @OriginalMember(owner = "client!lf", name = "g", descriptor = "I")
    public static int field3112;

    @OriginalMember(owner = "client!lf", name = "i", descriptor = "I")
    public static int field3114;

    @OriginalMember(owner = "client!lf", name = "k", descriptor = "I")
    public static int field3116;

    @OriginalMember(owner = "client!lf", name = "l", descriptor = "I")
    public static int field3117;

    @OriginalMember(owner = "client!lf", name = "n", descriptor = "I")
    public static int field3119;

    @OriginalMember(owner = "client!lf", name = "o", descriptor = "I")
    public static int field3120;

    @OriginalMember(owner = "client!lf", name = "p", descriptor = "I")
    public static int field3121;

    @OriginalMember(owner = "client!lf", name = "q", descriptor = "I")
    public static int field3122;

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(Z)V")
    public static final void method1391(boolean arg0) {
        class157.method1099(-48001, 22050, class344.field4718.field5424, 2);
        ++field3114;
        class143.field2316 = new class278();
        class143.field2316.method1726(9, 32559, 128);
        class394.field5189 = class481.method2683(class688.field9669, 0, 22050, class443.field6072, 16384);
        class394.field5189.method1459(arg0, class143.field2316);
        class109.method810(class576.field7609, class407.field5491, 47, class590.field7808, class143.field2316);
        class107.field1579 = class481.method2683(class688.field9669, 1, 2048, class443.field6072, 16384);
        class639.field8604 = new class14();
        class107.field1579.method1459(true, class639.field8604);
        class488.field6600 = new class386(22050, class443.field6071);
        class403.field5384 = class603.field8016.method2523("scape main", (byte) 117);
    }

    @OriginalMember(owner = "client!lf", name = "b", descriptor = "(I)V")
    public final void method213(int arg0) {
        ++field3112;
        if (!this.field3118) {
            super.field6268.method3672(770, 0, 5890, -6491);
        } else {
            this.field3115.method536((byte) 127, '\u0001');
            super.field6268.method3629((byte) 98, 1);
            super.field6268.method3630((class367) null, -2);
            super.field6268.method3629((byte) 61, 0);
        }
        super.field6268.method3644(8448, 23560, 8448);
        if (arg0 != 15495) {
            this.method215(1, 63, 106);
        }
        this.field3118 = false;
    }

    @OriginalMember(owner = "client!lf", name = "d", descriptor = "(I)Z")
    public static final boolean method1392(int arg0) {
        ++field3122;
        if (arg0 != 5888) {
            return true;
        } else {
            return ~class71.field1059 != -1 ? true : class568.field7553.method1710((byte) 125);
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(II)I")
    public static int method1393(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(III)V")
    public final void method215(int arg0, int arg1, int arg2) {
        ++field3116;
        if (arg1 != 0) {
            this.method210(-64, true);
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(BZ)V")
    public final void method214(byte arg0, boolean arg1) {
        if (arg0 != 99) {
            method1392(-69);
        }
        super.field6268.method3644(7681, 23560, 8448);
        ++field3117;
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(IZ)V")
    public final void method210(int arg0, boolean arg1) {
        ++field3121;
        class592 var3 = super.field6268.method3633(40);
        if (this.field3115 != null && var3 != null && arg1) {
            this.field3115.method536((byte) 114, '\u0000');
            super.field6268.method3629((byte) -113, 1);
            super.field6268.method3630(var3, -2);
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadMatrixf(super.field6268.field9226.method3877((byte) 107), 0);
            OpenGL.glRotatef(-180.0F, 1.0F, 0.0F, 0.0F);
            OpenGL.glMatrixMode(5888);
            super.field6268.method3629((byte) 69, 0);
            this.field3118 = true;
        } else {
            super.field6268.method3672(770, 0, 34168, -6491);
        }
        int var4 = -100 / ((arg0 - -30) / 38);
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(IILhf;)V")
    public final void method212(int arg0, int arg1, class367 arg2) {
        if (arg0 != 0) {
            this.method212(3, 7, (class367) null);
        }
        super.field6268.method3630(arg2, -2);
        ++field3120;
        super.field6268.method3603((byte) -34, arg1);
    }

    @OriginalMember(owner = "client!lf", name = "c", descriptor = "(I)Z")
    public final boolean method218(int arg0) {
        ++field3119;
        if (arg0 < 110) {
            method1392(31);
        }
        return true;
    }

    @OriginalMember(owner = "client!lf", name = "<init>", descriptor = "(Lno;)V")
    public class220(class658 arg0) {
        super(arg0);
        if (arg0.field9222) {
            this.field3115 = new class68(arg0, 2);
            this.field3115.method537(0, (byte) 3);
            super.field6268.method3629((byte) 116, 1);
            super.field6268.method3644(7681, 23560, 34165);
            super.field6268.method3609((byte) 27, 770, 2, 34168);
            super.field6268.method3672(770, 0, 34167, -6491);
            OpenGL.glTexGeni(8192, 9472, 34066);
            OpenGL.glTexGeni(8193, 9472, 34066);
            OpenGL.glTexGeni(8194, 9472, 34066);
            OpenGL.glEnable(3168);
            OpenGL.glEnable(3169);
            OpenGL.glEnable(3170);
            super.field6268.method3629((byte) -111, 0);
            this.field3115.method539(true);
            this.field3115.method537(1, (byte) 3);
            super.field6268.method3629((byte) -97, 1);
            super.field6268.method3644(8448, 23560, 8448);
            super.field6268.method3609((byte) 27, 770, 2, 34166);
            super.field6268.method3672(770, 0, 5890, -6491);
            OpenGL.glDisable(3168);
            OpenGL.glDisable(3169);
            OpenGL.glDisable(3170);
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadIdentity();
            OpenGL.glMatrixMode(5888);
            super.field6268.method3629((byte) 89, 0);
            this.field3115.method539(true);
        }
    }
}
