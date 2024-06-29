import java.awt.Canvas;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fl")
public abstract class class386 {

    @OriginalMember(owner = "client!fl", name = "b", descriptor = "[S")
    public static short[] field5433 = new short[] { 960, 957, -21568, -21571, 22464 };

    @OriginalMember(owner = "client!fl", name = "f", descriptor = "Ljava/lang/String;")
    public static String field5437 = "wave:";

    @OriginalMember(owner = "client!fl", name = "g", descriptor = "I")
    public static int field5438 = 0;

    @OriginalMember(owner = "client!fl", name = "j", descriptor = "Ljava/lang/String;")
    public static String field5441 = "Loading wordpack - ";

    @OriginalMember(owner = "client!fl", name = "k", descriptor = "[I")
    public static int[] field5442 = new int[2];

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "I")
    public int field5432;

    @OriginalMember(owner = "client!fl", name = "c", descriptor = "I")
    public static int field5434;

    @OriginalMember(owner = "client!fl", name = "d", descriptor = "I")
    public int field5435;

    @OriginalMember(owner = "client!fl", name = "h", descriptor = "I")
    public static int field5439;

    @OriginalMember(owner = "client!fl", name = "i", descriptor = "I")
    public static int field5440;

    @OriginalMember(owner = "client!fl", name = "e", descriptor = "[I")
    public int[] field5436;

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(I)V", line = 10)
    public static final void method2391(int arg0) {
        if (class127.field1799 != null) {
            class243 var1 = class127.field1799;
            synchronized (class127.field1799) {
                class127.field1799 = null;
            }
        }
        int var2 = 4 % ((arg0 + 7) / 44);
        field5434++;
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(B)V", line = 38)
    public static void method2392(byte arg0) {
        field5437 = null;
        field5441 = null;
        field5442 = null;
        if (arg0 != -103) {
            method2391(-81);
        }
        field5433 = null;
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(IIILjava/awt/Graphics;)V")
    public abstract void method1607(int arg0, int arg1, int arg2, Graphics arg3);

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(ILjava/awt/Graphics;IIIB)V")
    public abstract void method1608(int arg0, Graphics arg1, int arg2, int arg3, int arg4, byte arg5);

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(Ljava/awt/Canvas;B)V")
    public abstract void method1606(Canvas arg0, byte arg1);
}
