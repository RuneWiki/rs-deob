import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iba")
public class class555 implements class396 {

    @OriginalMember(owner = "client!iba", name = "h", descriptor = "Luq;")
    private class172 field7653;

    @OriginalMember(owner = "client!iba", name = "c", descriptor = "Lvh;")
    public class379 field7648;

    @OriginalMember(owner = "client!iba", name = "e", descriptor = "Ljb;")
    public static class519 field7650 = new class519(5, 4);

    @OriginalMember(owner = "client!iba", name = "j", descriptor = "Lqw;")
    public static class84 field7655 = new class84();

    @OriginalMember(owner = "client!iba", name = "a", descriptor = "I")
    public static int field7646;

    @OriginalMember(owner = "client!iba", name = "b", descriptor = "I")
    public static int field7647;

    @OriginalMember(owner = "client!iba", name = "d", descriptor = "I")
    public static int field7649;

    @OriginalMember(owner = "client!iba", name = "g", descriptor = "I")
    public static int field7652;

    @OriginalMember(owner = "client!iba", name = "i", descriptor = "I")
    public static int field7654;

    @OriginalMember(owner = "client!iba", name = "f", descriptor = "Lhh;")
    public class140 field7651;

    @OriginalMember(owner = "client!iba", name = "a", descriptor = "(I)Z")
    public final boolean method210(int arg0) {
        if (arg0 != 16125) {
            method3186(1);
        }
        field7646++;
        return this.field7653.method1185(this.field7648.field5532, arg0 ^ 0x1A8F);
    }

    @OriginalMember(owner = "client!iba", name = "b", descriptor = "(I)V")
    public static final void method3186(int arg0) {
        field7652++;
        if (class123.field1701) {
            return;
        }
        class667.method3678(class611.field8264, (byte) 107);
        if (arg0 < -76) {
            if (class187.field2445 != null) {
                class667.method3678(class187.field2445, (byte) 103);
            }
            class123.field1701 = true;
        }
    }

    @OriginalMember(owner = "client!iba", name = "b", descriptor = "(B)V")
    public static void method3187(byte arg0) {
        field7650 = null;
        int var1 = -38 % ((arg0 + 67) / 58);
        field7655 = null;
    }

    @OriginalMember(owner = "client!iba", name = "a", descriptor = "(B)V")
    public final void method211(byte arg0) {
        if (arg0 <= -107) {
            this.field7651 = class570.method3243(this.field7653, this.field7648.field5532, true);
            field7649++;
        }
    }

    @OriginalMember(owner = "client!iba", name = "<init>", descriptor = "(Luq;Lvh;)V")
    public class555(class172 arg0, class379 arg1) {
        this.field7653 = arg0;
        this.field7648 = arg1;
    }

    @OriginalMember(owner = "client!iba", name = "a", descriptor = "(ZI)V")
    public void method209(boolean arg0, int arg1) {
        if (arg1 != 7582) {
            method3187((byte) -35);
        }
        field7654++;
        if (arg0) {
            int var3 = this.field7648.field5527.method3710(0, class67.field933, this.field7651.method343()) + this.field7648.field5533;
            int var4 = this.field7648.field5529.method3920(this.field7651.method340(), class187.field2450, -119) + this.field7648.field5531;
            this.field7651.method968(var3, var4);
        }
    }

    @OriginalMember(owner = "client!iba", name = "c", descriptor = "(I)V")
    public static final void method3188(int arg0) {
        field7647++;
        if (class393.field5661 != null) {
            return;
        }
        int var1 = class523.field7268;
        int var2 = class589.field8043;
        int var3 = class358.field5218 - class460.field6558 - var1;
        int var4 = class482.field6754 - class693.field9222 - var2;
        if (var1 > 0 || var3 > 0 || var2 > 0 || var4 > 0) {
            try {
                Container var5;
                if (class639.field8606 != null) {
                    var5 = class639.field8606;
                } else if (class552.field7624 == null) {
                    var5 = class468.field6609;
                } else {
                    var5 = class552.field7624;
                }
                int var6 = 0;
                int var7 = 0;
                if (class639.field8606 == var5) {
                    Insets var8 = class639.field8606.getInsets();
                    var6 = var8.left;
                    var7 = var8.top;
                }
                Graphics var9 = var5.getGraphics();
                var9.setColor(Color.black);
                if (var1 > 0) {
                    var9.fillRect(var6, var7, var1, class482.field6754);
                }
                if (var2 > 0) {
                    var9.fillRect(var6, var7, class358.field5218, var2);
                }
                if (var3 > 0) {
                    var9.fillRect(class358.field5218 + var6 - var3, var7, var3, class482.field6754);
                }
                if (var4 > 0) {
                    var9.fillRect(var6, var7 - (var4 - class482.field6754), class358.field5218, var4);
                }
            } catch (Exception var10) {
            }
        }
        if (arg0 != -32479) {
            field7655 = null;
        }
    }
}
