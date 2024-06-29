import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jo")
public class class337 {

    @OriginalMember(owner = "client!jo", name = "i", descriptor = "Lft;")
    public static class285 field4361 = new class285(0, 19);

    @OriginalMember(owner = "client!jo", name = "c", descriptor = "I")
    public static int field4355;

    @OriginalMember(owner = "client!jo", name = "d", descriptor = "I")
    public static int field4356;

    @OriginalMember(owner = "client!jo", name = "e", descriptor = "I")
    public static int field4357;

    @OriginalMember(owner = "client!jo", name = "f", descriptor = "I")
    public static int field4358;

    @OriginalMember(owner = "client!jo", name = "g", descriptor = "I")
    public static int field4359;

    @OriginalMember(owner = "client!jo", name = "h", descriptor = "I")
    public static int field4360;

    @OriginalMember(owner = "client!jo", name = "k", descriptor = "I")
    public static int field4363;

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "Lxa;")
    public static class511 field4353;

    @OriginalMember(owner = "client!jo", name = "b", descriptor = "[I")
    public static int[] field4354;

    @OriginalMember(owner = "client!jo", name = "j", descriptor = "[Ljava/lang/String;")
    public static String[] field4362;

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(III)Z", line = 7)
    public static final boolean method1932(int arg0, int arg1, int arg2) {
        field4355++;
        if (arg0 != -1) {
            field4356 = 84;
        }
        if (class427.method2453(arg0 ^ 0xFFFFF7FF, arg1, arg2)) {
            return (arg1 & 0xB000) != 0 | class353.method2027(arg1, arg2, (byte) 88) | class484.method2667(arg1, -13967, arg2) ? true : (arg2 & 0x37) == 0 & (class247.method1555(arg2, arg1, (byte) 104) | class198.method1305(true, arg2, arg1));
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(B)V", line = 26)
    public static final void method1933(byte arg0) {
        field4359++;
        if (class114.field1483 != null) {
            return;
        }
        int var1 = class289.field3729;
        int var2 = class349.field4470;
        int var3 = class544.field7066 - class519.field6796 - var1;
        if (arg0 < 20) {
            field4356 = 41;
        }
        int var4 = class207.field2669 - class461.field6047 - var2;
        if (var1 <= 0 && var3 <= 0 && var2 <= 0 && var4 <= 0) {
            return;
        }
        try {
            Container var5;
            if (class425.field5520 != null) {
                var5 = class425.field5520;
            } else if (class348.field4462 == null) {
                var5 = class50.field706;
            } else {
                var5 = class348.field4462;
            }
            int var6 = 0;
            int var7 = 0;
            if (class425.field5520 == var5) {
                Insets var8 = class425.field5520.getInsets();
                var6 = var8.left;
                var7 = var8.top;
            }
            Graphics var9 = var5.getGraphics();
            var9.setColor(Color.black);
            if (var1 > 0) {
                var9.fillRect(var6, var7, var1, class207.field2669);
            }
            if (var2 > 0) {
                var9.fillRect(var6, var7, class544.field7066, var2);
            }
            if (var3 > 0) {
                var9.fillRect(class544.field7066 + var6 - var3, var7, var3, class207.field2669);
            }
            if (var4 > 0) {
                var9.fillRect(var6, var7 + class207.field2669 - var4, class544.field7066, var4);
                return;
            }
        } catch (Exception var10) {
            return;
        }
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(Z)V", line = 97)
    public static void method1934(boolean arg0) {
        field4361 = null;
        field4353 = null;
        if (!arg0) {
            method1933((byte) -55);
        }
        field4354 = null;
        field4362 = null;
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(Ljd;II)V", line = 117)
    public static final void method1935(class559 arg0, int arg1, int arg2) {
        field4358++;
        if (arg1 != 0) {
            field4362 = null;
        }
        if (class399.field5084) {
            arg2 = 0;
            class399.field5084 = false;
        }
        if (class597.field8080 != null && class597.field8080.method2994((byte) -55, arg0)) {
            return;
        }
        class597.field8080 = arg0;
        class514.field6728 = class584.method3191(arg1 + 1);
        class529.field6872 = arg2;
        class710.field9922 = arg2;
        if (class710.field9922 != 0) {
            class480.field6404 = class168.field2095;
            class531.field6906 = class407.field5182;
            class13.field150 = class705.field9822;
            class103.field1370 = class460.field6033;
            class603.field8120 = class7.field67;
            class107.field1397 = class80.field1105;
            class199.field2600 = class249.field3369;
            class352.field4526 = class196.field2561;
            class458.field6004 = class37.field536;
            class381.field4889 = class17.field193;
            return;
        }
        class629.method3489(16711680);
    }
}
