import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oc")
public class class205 {

    @OriginalMember(owner = "client!oc", name = "d", descriptor = "Lmu;")
    public static class303 field2955 = new class303(81, 6);

    @OriginalMember(owner = "client!oc", name = "f", descriptor = "Lej;")
    public static class124 field2957 = new class124(77, -1);

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "I")
    public static int field2952;

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "I")
    public static int field2953;

    @OriginalMember(owner = "client!oc", name = "c", descriptor = "I")
    public static int field2954;

    @OriginalMember(owner = "client!oc", name = "e", descriptor = "I")
    public static int field2956;

    @OriginalMember(owner = "client!oc", name = "g", descriptor = "I")
    public static int field2958;

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(II[Ljava/awt/Rectangle;)V", line = 3)
    public static final void method1421(int arg0, int arg1, Rectangle[] arg2) throws class721 {
        field2953++;
        if (class215.field3119 == 1) {
            class569.field7823.method344(arg2, arg0, class501.field7002, class512.field7129);
        } else {
            class569.field7823.method344(arg2, arg0, 0, 0);
        }
        if (arg1 != 0) {
            field2957 = null;
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(Z)V", line = 23)
    public static void method1422(boolean arg0) {
        field2957 = null;
        field2955 = null;
        if (arg0) {
            field2957 = null;
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(B)V", line = 34)
    public static final void method1423(byte arg0) {
        field2952++;
        if (class699.field9455 != null) {
            return;
        }
        int var1 = class688.field9288;
        int var2 = class14.field244;
        if (arg0 > -25) {
            method1425((byte) -22, -1);
        }
        int var3 = class288.field4004 - class467.field6559 - var1;
        int var4 = class751.field10508 - class582.field7968 - var2;
        if (var1 <= 0 && var3 <= 0 && var2 <= 0 && var4 <= 0) {
            return;
        }
        try {
            Container var5;
            if (class684.field9263 != null) {
                var5 = class684.field9263;
            } else if (class675.field9193 == null) {
                var5 = class566.field7798;
            } else {
                var5 = class675.field9193;
            }
            int var6 = 0;
            int var7 = 0;
            if (class684.field9263 == var5) {
                Insets var8 = class684.field9263.getInsets();
                var6 = var8.left;
                var7 = var8.top;
            }
            Graphics var9 = var5.getGraphics();
            var9.setColor(Color.black);
            if (var1 > 0) {
                var9.fillRect(var6, var7, var1, class751.field10508);
            }
            if (var2 > 0) {
                var9.fillRect(var6, var7, class288.field4004, var2);
            }
            if (var3 > 0) {
                var9.fillRect(class288.field4004 + var6 - var3, var7, var3, class751.field10508);
            }
            if (var4 > 0) {
                var9.fillRect(var6, var7 + class751.field10508 - var4, class288.field4004, var4);
                return;
            }
        } catch (Exception var10) {
            return;
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(IIZ)Ljava/lang/String;", line = 105)
    public static final String method1424(int arg0, int arg1, boolean arg2) {
        if (arg1 < 43) {
            return null;
        } else {
            field2954++;
            return arg2 && arg0 >= 0 ? class505.method2968(8320, 10, arg0, arg2) : Integer.toString(arg0);
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(BI)Z", line = 126)
    public static final boolean method1425(byte arg0, int arg1) {
        field2956++;
        int var2 = 35 / ((-arg0 - 45) / 38);
        return arg1 >= 0 && arg1 <= 3 || arg1 == 9;
    }
}
