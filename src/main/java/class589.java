import java.awt.Canvas;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nc")
public abstract class class589 extends class329 {

    @OriginalMember(owner = "client!nc", name = "m", descriptor = "I")
    public static int field8276 = 0;

    @OriginalMember(owner = "client!nc", name = "n", descriptor = "I")
    public static int field8277 = 0;

    @OriginalMember(owner = "client!nc", name = "l", descriptor = "I")
    public static int field8275;

    @OriginalMember(owner = "client!nc", name = "o", descriptor = "I")
    public static int field8278;

    @OriginalMember(owner = "client!nc", name = "p", descriptor = "I")
    public int field8279;

    @OriginalMember(owner = "client!nc", name = "q", descriptor = "I")
    public int field8280;

    @OriginalMember(owner = "client!nc", name = "k", descriptor = "[I")
    public int[] field8274;

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(IIII)I", line = 9)
    public static final int method3241(int arg0, int arg1, int arg2, int arg3) {
        field8275++;
        if (arg0 != 217) {
            return -14;
        }
        if (arg2 > 243) {
            arg3 >>= 0x4;
        } else if (arg2 > 217) {
            arg3 >>= 0x3;
        } else if (arg2 > 192) {
            arg3 >>= 0x2;
        } else if (arg2 > 179) {
            arg3 >>= 0x1;
        }
        return (arg2 >> 1) + (arg3 >> 5 << 7) + ((arg1 >> 2 & 0x3F) << 10);
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lmba;", line = 35)
    public static final class215 method3242(Throwable arg0, String arg1) {
        field8278++;
        class215 var2;
        if ((arg0 instanceof class215)) {
            var2 = (class215) arg0;
            var2.field2672 = var2.field2672 + ' ' + arg1;
        } else {
            var2 = new class215(arg0, arg1);
        }
        return var2;
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(ILjava/awt/Canvas;)V")
    public abstract void method857(int arg0, Canvas arg1);

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(IILjava/awt/Graphics;B)V")
    public abstract void method856(int arg0, int arg1, Graphics arg2, byte arg3);

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(IIILjava/awt/Graphics;BI)V")
    public abstract void method855(int arg0, int arg1, int arg2, Graphics arg3, byte arg4, int arg5);
}
