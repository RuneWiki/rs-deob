import java.awt.Canvas;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nda")
public abstract class class584 extends class379 {

    @OriginalMember(owner = "client!nda", name = "h", descriptor = "I")
    public int field7972;

    @OriginalMember(owner = "client!nda", name = "j", descriptor = "I")
    public int field7974;

    @OriginalMember(owner = "client!nda", name = "k", descriptor = "I")
    public static int field7975;

    @OriginalMember(owner = "client!nda", name = "i", descriptor = "[I")
    public int[] field7973;

    @OriginalMember(owner = "client!nda", name = "a", descriptor = "(Ljava/awt/Canvas;BII)V")
    public abstract void method1869(Canvas arg0, byte arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!nda", name = "a", descriptor = "(IIIBLjava/awt/Graphics;III)V")
    public abstract void method1867(int arg0, int arg1, int arg2, byte arg3, Graphics arg4, int arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!nda", name = "a", descriptor = "(BI)V")
    public static final void method3360(byte arg0, int arg1) {
        if (arg0 == 97) {
            field7975++;
            class714 var2 = class350.method2072((long) arg1, 16, (byte) 115);
            var2.method4044((byte) -128);
        }
    }
}
