import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eca")
public class class759 extends RuntimeException {

    @OriginalMember(owner = "client!eca", name = "c", descriptor = "Ljava/lang/String;")
    public String field10595;

    @OriginalMember(owner = "client!eca", name = "f", descriptor = "Ljava/lang/Throwable;")
    public Throwable field10598;

    @OriginalMember(owner = "client!eca", name = "b", descriptor = "I")
    public static int field10594;

    @OriginalMember(owner = "client!eca", name = "d", descriptor = "I")
    public static int field10596;

    @OriginalMember(owner = "client!eca", name = "e", descriptor = "I")
    public static int field10597;

    @OriginalMember(owner = "client!eca", name = "g", descriptor = "I")
    public static int field10599;

    @OriginalMember(owner = "client!eca", name = "a", descriptor = "[I")
    public static int[] field10593;

    @OriginalMember(owner = "client!eca", name = "a", descriptor = "(IIILha;II)V")
    public static final void method4221(int arg0, int arg1, int arg2, class60 arg3, int arg4, int arg5) {
        class565.field7943 = arg3;
        if (arg2 < 102) {
            return;
        }
        field10597++;
        class277.field3474 = class565.field7943.method502();
        class584.field8164 = class565.field7943.method502();
        class705.field9776 = class565.field7943.method502();
        class178.field2492 = arg4;
        class313.field4093 = null;
        class259.field3281 = 0;
        class207.field2746 = arg1;
        class353.field4537 = null;
        class603.method3410(arg0, 33984, arg5);
        class542.field7499 = -1;
        class289.field3788 = -1;
        class713.field9903 = -1;
    }

    @OriginalMember(owner = "client!eca", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V")
    public class759(Throwable arg0, String arg1) {
        this.field10595 = arg1;
        this.field10598 = arg0;
    }

    @OriginalMember(owner = "client!eca", name = "a", descriptor = "(Z)V")
    public static void method4222(boolean arg0) {
        field10593 = null;
        if (!arg0) {
            field10593 = null;
        }
    }

    @OriginalMember(owner = "client!eca", name = "a", descriptor = "(III)I")
    public static final int method4223(int arg0, int arg1, int arg2) {
        field10599++;
        if (arg2 != -18845) {
            method4224(121);
        }
        int var3 = arg1 - 1 & arg0 >> 31;
        return ((arg0 >>> 31) + arg0) % arg1 + var3;
    }

    @OriginalMember(owner = "client!eca", name = "a", descriptor = "(I)V")
    public static final void method4224(int arg0) {
        field10594++;
        if (class353.field4533 != null) {
            return;
        }
        int var1 = class489.field6951;
        int var2 = class288.field3772;
        int var3 = class754.field10526 - class356.field4586 - var1;
        int var4 = class317.field4108 - var2 - class466.field6263;
        if (var1 <= arg0 && var3 <= 0 && var2 <= 0 && var4 <= 0) {
            return;
        }
        try {
            Container var5;
            if (class731.field10179 != null) {
                var5 = class731.field10179;
            } else if (class64.field900 == null) {
                var5 = class319.field4123;
            } else {
                var5 = class64.field900;
            }
            int var6 = 0;
            int var7 = 0;
            if (class731.field10179 == var5) {
                Insets var8 = class731.field10179.getInsets();
                var6 = var8.left;
                var7 = var8.top;
            }
            Graphics var9 = var5.getGraphics();
            var9.setColor(Color.black);
            if (var1 > 0) {
                var9.fillRect(var6, var7, var1, class317.field4108);
            }
            if (var2 > 0) {
                var9.fillRect(var6, var7, class754.field10526, var2);
            }
            if (var3 > 0) {
                var9.fillRect(class754.field10526 + var6 - var3, var7, var3, class317.field4108);
            }
            if (var4 > 0) {
                var9.fillRect(var6, class317.field4108 + var7 - var4, class754.field10526, var4);
                return;
            }
        } catch (Exception var10) {
            return;
        }
    }
}
