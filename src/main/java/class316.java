import java.awt.Canvas;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!at")
public abstract class class316 extends class176 {

    @OriginalMember(owner = "client!at", name = "o", descriptor = "I")
    public static int field4244 = 0;

    @OriginalMember(owner = "client!at", name = "n", descriptor = "I")
    public int field4243;

    @OriginalMember(owner = "client!at", name = "q", descriptor = "I")
    public static int field4246;

    @OriginalMember(owner = "client!at", name = "r", descriptor = "I")
    public static int field4247;

    @OriginalMember(owner = "client!at", name = "s", descriptor = "I")
    public int field4248;

    @OriginalMember(owner = "client!at", name = "t", descriptor = "I")
    public static int field4249;

    @OriginalMember(owner = "client!at", name = "u", descriptor = "I")
    public static int field4250;

    @OriginalMember(owner = "client!at", name = "p", descriptor = "Lre;")
    public static class517 field4245;

    @OriginalMember(owner = "client!at", name = "m", descriptor = "[I")
    public int[] field4242;

    @OriginalMember(owner = "client!at", name = "a", descriptor = "(IILjava/awt/Graphics;B)V")
    public abstract void method1010(int arg0, int arg1, Graphics arg2, byte arg3);

    @OriginalMember(owner = "client!at", name = "a", descriptor = "(IB)Lao;")
    public static final class240 method1966(int arg0, byte arg1) {
        if (arg1 < 72) {
            return null;
        }
        field4246++;
        if (arg0 == 0) {
            if ((double) class413.field5820 == 3.0D) {
                return class132.field2105;
            }
            if ((double) class413.field5820 == 4.0D) {
                return class183.field2588;
            }
            if ((double) class413.field5820 == 6.0D) {
                return class205.field2886;
            }
            if ((double) class413.field5820 >= 8.0D) {
                return class20.field252;
            }
        } else if (arg0 == 1) {
            if ((double) class413.field5820 == 3.0D) {
                return class205.field2886;
            }
            if ((double) class413.field5820 == 4.0D) {
                return class20.field252;
            }
            if ((double) class413.field5820 == 6.0D) {
                return class39.field793;
            }
            if ((double) class413.field5820 >= 8.0D) {
                return class473.field6655;
            }
        } else if (arg0 == 2) {
            if ((double) class413.field5820 == 3.0D) {
                return class39.field793;
            }
            if ((double) class413.field5820 == 4.0D) {
                return class473.field6655;
            }
            if ((double) class413.field5820 == 6.0D) {
                return class139.field2178;
            }
            if ((double) class413.field5820 >= 8.0D) {
                return class648.field9398;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!at", name = "a", descriptor = "(ILjava/awt/Canvas;)V")
    public abstract void method1008(int arg0, Canvas arg1);

    @OriginalMember(owner = "client!at", name = "a", descriptor = "(II)I")
    public static final int method1967(int arg0, int arg1) {
        field4247++;
        return arg1 == -20616 ? arg0 & 0x7F : -61;
    }

    @OriginalMember(owner = "client!at", name = "a", descriptor = "(I)V")
    public static void method1968(int arg0) {
        field4245 = null;
        if (arg0 != 1) {
            method1966(-91, (byte) 17);
        }
    }

    @OriginalMember(owner = "client!at", name = "a", descriptor = "(Ljava/awt/Graphics;IIZII)V")
    public abstract void method1009(Graphics arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5);
}
