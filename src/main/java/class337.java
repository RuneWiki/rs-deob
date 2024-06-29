import java.awt.Canvas;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qi")
public abstract class class337 {

    @OriginalMember(owner = "client!qi", name = "c", descriptor = "[S")
    public static short[] field5231 = new short[] { -4160, -4163, -8256, -8259, 22461 };

    @OriginalMember(owner = "client!qi", name = "b", descriptor = "I")
    public int field5230;

    @OriginalMember(owner = "client!qi", name = "d", descriptor = "I")
    public static int field5232;

    @OriginalMember(owner = "client!qi", name = "e", descriptor = "I")
    public int field5233;

    @OriginalMember(owner = "client!qi", name = "f", descriptor = "I")
    public static int field5234;

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "[I")
    public int[] field5229;

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(III)I")
    public static final int method2220(int arg0, int arg1, int arg2) {
        field5232++;
        class33 var3 = (class33) class126.field1937.method1770(-880, (long) arg2);
        if (arg1 < 17) {
            method2221((byte) -11);
        }
        if (var3 == null) {
            return -1;
        } else if (arg0 >= 0 && var3.field417.length > arg0) {
            return var3.field417[arg0];
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(IILjava/awt/Graphics;I)V")
    public abstract void method142(int arg0, int arg1, Graphics arg2, int arg3);

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(B)V")
    public static void method2221(byte arg0) {
        field5231 = null;
        if (arg0 > -127) {
            field5231 = null;
        }
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(Ljava/awt/Canvas;I)V")
    public abstract void method140(Canvas arg0, int arg1);

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(IIIIILjava/awt/Graphics;)V")
    public abstract void method141(int arg0, int arg1, int arg2, int arg3, int arg4, Graphics arg5);

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(ZLsd;)V")
    public static final void method2222(boolean arg0, class50 arg1) {
        if (arg0) {
            field5231 = null;
        }
        field5234++;
        for (class58 var2 = (class58) class3.field81.method253((byte) -6); var2 != null; var2 = (class58) class3.field81.method247((byte) -118)) {
            if (var2.field757 == arg1) {
                if (var2.field753 != null) {
                    class82.field1025.method2479(var2.field753);
                    var2.field753 = null;
                }
                var2.method1120(-114);
                return;
            }
        }
    }
}
