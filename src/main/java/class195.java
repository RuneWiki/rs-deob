import java.awt.Canvas;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mu")
public abstract class class195 extends class499 {

    @OriginalMember(owner = "client!mu", name = "p", descriptor = "[I")
    public static int[] field2784 = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 85, 80, 84, 0, 91, 0, 0, 0, 81, 82, 86, 0, 0, 0, 0, 0, 0, 0, 0, 13, 0, 0, 0, 0, 83, 104, 105, 103, 102, 96, 98, 97, 99, 0, 0, 0, 0, 0, 0, 0, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, 0, 0, 0, 0, 0, 0, 0, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, 0, 0, 0, 0, 0, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, 0, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 0, 0, 0, 101, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!mu", name = "o", descriptor = "I")
    public int field2783;

    @OriginalMember(owner = "client!mu", name = "q", descriptor = "I")
    public static int field2785;

    @OriginalMember(owner = "client!mu", name = "r", descriptor = "I")
    public int field2786;

    @OriginalMember(owner = "client!mu", name = "n", descriptor = "[I")
    public int[] field2782;

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "(III)Lfq;", line = 9)
    public static final class134 method1184(int arg0, int arg1, int arg2) {
        class61 var3 = class385.field5410[arg0][arg1][arg2];
        return var3 == null ? null : var3.field814;
    }

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "(Llh;I)Ljava/lang/String;", line = 21)
    public static final String method1185(class365 arg0, int arg1) {
        if (arg1 != 0) {
            method1184(-9, 73, -14);
        }
        field2785++;
        return class40.method254(9, arg0, 32767);
    }

    @OriginalMember(owner = "client!mu", name = "c", descriptor = "(B)V", line = 32)
    public static void method1186(byte arg0) {
        if (arg0 == -38) {
            field2784 = null;
        }
    }

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "(Ljava/awt/Canvas;B)V")
    public abstract void method31(Canvas arg0, byte arg1);

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "(ILjava/awt/Graphics;II)V")
    public abstract void method26(int arg0, Graphics arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "(Ljava/awt/Graphics;IIIII)V")
    public abstract void method28(Graphics arg0, int arg1, int arg2, int arg3, int arg4, int arg5);
}
