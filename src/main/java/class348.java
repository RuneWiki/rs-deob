import java.awt.Canvas;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fc")
public abstract class class348 extends class45 {

    @OriginalMember(owner = "client!fc", name = "j", descriptor = "I")
    public static int field4634 = 0;

    @OriginalMember(owner = "client!fc", name = "n", descriptor = "Ljw;")
    public static class259 field4638 = new class259(7, 3);

    @OriginalMember(owner = "client!fc", name = "i", descriptor = "I")
    public static int field4633;

    @OriginalMember(owner = "client!fc", name = "k", descriptor = "I")
    public int field4635;

    @OriginalMember(owner = "client!fc", name = "m", descriptor = "I")
    public static int field4637;

    @OriginalMember(owner = "client!fc", name = "p", descriptor = "I")
    public int field4640;

    @OriginalMember(owner = "client!fc", name = "l", descriptor = "Lga;")
    public static class332 field4636;

    @OriginalMember(owner = "client!fc", name = "o", descriptor = "[I")
    public int[] field4639;

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(I)V", line = 8)
    public static void method2066(int arg0) {
        if (arg0 != 25923) {
            field4636 = null;
        }
        field4636 = null;
        field4638 = null;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(II)V", line = 25)
    public static final void method2067(int arg0, int arg1) {
        if (arg0 != 7) {
            field4636 = null;
        }
        field4633++;
        class256 var2 = class592.method3279((byte) -84, 9, arg1);
        var2.method1546((byte) -53);
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(Z)V", line = 42)
    public static final void method2068(boolean arg0) {
        if (arg0) {
            field4637++;
            class642.field8878.method2168((byte) -124);
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(IILjava/awt/Graphics;I)V")
    public abstract void method552(int arg0, int arg1, Graphics arg2, int arg3);

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(BLjava/awt/Canvas;)V")
    public abstract void method554(byte arg0, Canvas arg1);

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(ILjava/awt/Graphics;IIII)V")
    public abstract void method553(int arg0, Graphics arg1, int arg2, int arg3, int arg4, int arg5);
}
