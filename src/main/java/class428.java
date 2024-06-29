import java.awt.Canvas;
import java.awt.Frame;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lb")
public abstract class class428 {

    @OriginalMember(owner = "client!lb", name = "c", descriptor = "I")
    public static int field6221 = 10;

    @OriginalMember(owner = "client!lb", name = "h", descriptor = "Ljava/lang/String;")
    public static String field6226 = "";

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "I")
    public int field6219;

    @OriginalMember(owner = "client!lb", name = "e", descriptor = "I")
    public static int field6223;

    @OriginalMember(owner = "client!lb", name = "f", descriptor = "I")
    public int field6224;

    @OriginalMember(owner = "client!lb", name = "d", descriptor = "Ljava/awt/Frame;")
    public static Frame field6222;

    @OriginalMember(owner = "client!lb", name = "g", descriptor = "[I")
    public int[] field6225;

    @OriginalMember(owner = "client!lb", name = "i", descriptor = "[I")
    public static int[] field6227;

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "[[[B")
    public static byte[][][] field6220;

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(B)V")
    public static void method2675(byte arg0) {
        field6226 = null;
        field6227 = null;
        field6222 = null;
        field6220 = null;
        int var1 = -98 / ((arg0 - 52) / 39);
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(Ljava/awt/Canvas;I)V")
    public abstract void method799(Canvas arg0, int arg1);

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(Ljava/awt/Graphics;BII)V")
    public abstract void method798(Graphics arg0, byte arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(IIIILjava/awt/Graphics;I)V")
    public abstract void method797(int arg0, int arg1, int arg2, int arg3, Graphics arg4, int arg5);
}
