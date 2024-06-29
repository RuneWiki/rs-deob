import java.awt.Canvas;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ih")
public abstract class class649 extends class513 {

    @OriginalMember(owner = "client!ih", name = "j", descriptor = "Z")
    public static boolean field9205 = false;

    @OriginalMember(owner = "client!ih", name = "m", descriptor = "I")
    public static int field9208 = 0;

    @OriginalMember(owner = "client!ih", name = "k", descriptor = "I")
    public int field9206;

    @OriginalMember(owner = "client!ih", name = "l", descriptor = "I")
    public static int field9207;

    @OriginalMember(owner = "client!ih", name = "n", descriptor = "I")
    public int field9209;

    @OriginalMember(owner = "client!ih", name = "o", descriptor = "[I")
    public int[] field9210;

    @OriginalMember(owner = "client!ih", name = "b", descriptor = "(III)V", line = 22)
    public static final void method3662(int arg0, int arg1, int arg2) {
        field9207++;
        if (arg1 > 118) {
            class233 var3 = class7.method44(arg2, 12, -1);
            var3.method1422(0);
            var3.field3114 = arg0;
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(IIILjava/awt/Graphics;II)V")
    public abstract void method950(int arg0, int arg1, int arg2, Graphics arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(Ljava/awt/Graphics;IIB)V")
    public abstract void method952(Graphics arg0, int arg1, int arg2, byte arg3);

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(ILjava/awt/Canvas;)V")
    public abstract void method954(int arg0, Canvas arg1);
}
