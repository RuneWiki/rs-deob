import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vb")
public class class314 extends class339 {

    @OriginalMember(owner = "client!vb", name = "w", descriptor = "Lno;")
    public class523 field4210;

    @OriginalMember(owner = "client!vb", name = "z", descriptor = "Leba;")
    public static class550 field4213 = new class550(46, -1);

    @OriginalMember(owner = "client!vb", name = "A", descriptor = "I")
    public static int field4214 = 0;

    @OriginalMember(owner = "client!vb", name = "u", descriptor = "I")
    public static int field4208;

    @OriginalMember(owner = "client!vb", name = "v", descriptor = "I")
    public static int field4209;

    @OriginalMember(owner = "client!vb", name = "x", descriptor = "I")
    public static int field4211;

    @OriginalMember(owner = "client!vb", name = "y", descriptor = "I")
    public static int field4212;

    @OriginalMember(owner = "client!vb", name = "B", descriptor = "I")
    public static int field4215;

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(IZ)V", line = 3)
    public static final void method1836(int arg0, boolean arg1) {
        field4208++;
        if (class519.field7203.length() == 0) {
            return;
        }
        class592.method3278((byte) -59, "--> " + class519.field7203);
        class567.method3144(class519.field7203, 100, false, arg1);
        class519.field7203 = "";
        class104.field1243 = 0;
        class68.field829 = arg0;
    }

    @OriginalMember(owner = "client!vb", name = "b", descriptor = "(B)V", line = 19)
    public static final void method1837(byte arg0) {
        field4215++;
        if (arg0 != 62) {
            field4214 = -66;
        }
        if (class529.field7314 != null) {
            return;
        }
        int var1 = class646.field8936;
        int var2 = class628.field8692;
        int var3 = class455.field5994 - class399.field5301 - var1;
        int var4 = class246.field3213 - class60.field750 - var2;
        if (var1 <= 0 && var3 <= 0 && var2 <= 0 && var4 <= 0) {
            return;
        }
        try {
            Container var5;
            if (class190.field2630 != null) {
                var5 = class190.field2630;
            } else if (class516.field7178 == null) {
                var5 = class27.field400;
            } else {
                var5 = class516.field7178;
            }
            int var6 = 0;
            int var7 = 0;
            if (class190.field2630 == var5) {
                Insets var8 = class190.field2630.getInsets();
                var7 = var8.top;
                var6 = var8.left;
            }
            Graphics var9 = var5.getGraphics();
            var9.setColor(Color.black);
            if (var1 > 0) {
                var9.fillRect(var6, var7, var1, class246.field3213);
            }
            if (var2 > 0) {
                var9.fillRect(var6, var7, class455.field5994, var2);
            }
            if (var3 > 0) {
                var9.fillRect(class455.field5994 + var6 - var3, var7, var3, class246.field3213);
            }
            if (var4 > 0) {
                var9.fillRect(var6, var7 + class246.field3213 - var4, class455.field5994, var4);
                return;
            }
        } catch (Exception var10) {
            return;
        }
    }

    @OriginalMember(owner = "client!vb", name = "<init>", descriptor = "(Lno;)V", line = 92)
    public class314(class523 arg0) {
        this.field4210 = arg0;
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(Lio;I)V", line = 100)
    public static final void method1838(class157 arg0, int arg1) {
        field4212++;
        int var2 = arg0.method964(59);
        class65.field812 = new class665[var2];
        if (arg1 != -1879) {
            field4209 = -38;
        }
        for (int var3 = 0; var3 < var2; var3++) {
            class65.field812[var3] = new class665();
            class65.field812[var3].field9461 = arg0.method964(100);
            class65.field812[var3].field9460 = arg0.method932(0);
        }
        class16.field210 = arg0.method964(123);
        class663.field9446 = arg0.method964(106);
        class184.field2565 = arg0.method964(95);
        class233.field3103 = new class277[class663.field9446 + 1 - class16.field210];
        for (int var4 = 0; var4 < class184.field2565; var4++) {
            int var5 = arg0.method964(arg1 + 1965);
            class277 var6 = class233.field3103[var5] = new class277();
            var6.field5257 = arg0.method930(255);
            var6.field5256 = arg0.method908(false);
            var6.field3675 = var5 + class16.field210;
            var6.field3677 = arg0.method932(0);
            var6.field3678 = arg0.method932(arg1 ^ 0xFFFFF8A9);
        }
        class235.field3124 = arg0.method908(false);
        class367.field4833 = true;
    }

    @OriginalMember(owner = "client!vb", name = "c", descriptor = "(B)V", line = 147)
    public static void method1839(byte arg0) {
        field4213 = null;
        if (arg0 > -16) {
            method1836(34, false);
        }
    }
}
