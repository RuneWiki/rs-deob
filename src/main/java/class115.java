import java.awt.Canvas;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qca")
public abstract class class115 extends class134 {

    @OriginalMember(owner = "client!qca", name = "m", descriptor = "[Lsu;")
    public static class210[] field1203 = new class210[8];

    @OriginalMember(owner = "client!qca", name = "l", descriptor = "Z")
    public static boolean field1202 = true;

    @OriginalMember(owner = "client!qca", name = "j", descriptor = "I")
    public int field1200;

    @OriginalMember(owner = "client!qca", name = "k", descriptor = "I")
    public int field1201;

    @OriginalMember(owner = "client!qca", name = "p", descriptor = "I")
    public static int field1206;

    @OriginalMember(owner = "client!qca", name = "n", descriptor = "Ljava/lang/String;")
    public static String field1204;

    @OriginalMember(owner = "client!qca", name = "o", descriptor = "[I")
    public int[] field1205;

    @OriginalMember(owner = "client!qca", name = "a", descriptor = "(Ljava/awt/Canvas;IZI)V")
    public abstract void method760(Canvas arg0, int arg1, boolean arg2, int arg3);

    @OriginalMember(owner = "client!qca", name = "a", descriptor = "(Loh;JBIIIIZ)V")
    public static final void method761(class404 arg0, long arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        field1206++;
        class34.field372 = arg7;
        class387.field5372 = arg1;
        if (arg2 != 113) {
            field1204 = null;
        }
        class163.field1819 = arg3;
        class30.field344 = arg6;
        class407.field5582 = arg5;
        class446.field6457 = 1;
        class231.field2696 = 10000;
        class462.field6583 = arg0;
        class215.field2505 = arg4;
        class344.field4471 = null;
    }

    @OriginalMember(owner = "client!qca", name = "a", descriptor = "(B)V")
    public static void method762(byte arg0) {
        field1203 = null;
        if (arg0 <= 58) {
            method762((byte) -80);
        }
        field1204 = null;
    }

    @OriginalMember(owner = "client!qca", name = "a", descriptor = "(Ljava/awt/Graphics;IIIIIII)V")
    public abstract void method763(Graphics arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7);
}
