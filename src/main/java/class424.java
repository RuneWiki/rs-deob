import java.awt.Canvas;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cd")
public abstract class class424 extends class276 {

    @OriginalMember(owner = "client!cd", name = "s", descriptor = "I")
    public static int field6392 = 1400;

    @OriginalMember(owner = "client!cd", name = "n", descriptor = "I")
    public static int field6387;

    @OriginalMember(owner = "client!cd", name = "o", descriptor = "I")
    public int field6388;

    @OriginalMember(owner = "client!cd", name = "p", descriptor = "I")
    public static int field6389;

    @OriginalMember(owner = "client!cd", name = "r", descriptor = "I")
    public int field6391;

    @OriginalMember(owner = "client!cd", name = "t", descriptor = "I")
    public static int field6393;

    @OriginalMember(owner = "client!cd", name = "q", descriptor = "Lai;")
    public static class488 field6390;

    @OriginalMember(owner = "client!cd", name = "u", descriptor = "[I")
    public int[] field6394;

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "(Z)V", line = 7)
    public static void method2597(boolean arg0) {
        field6390 = null;
        if (!arg0) {
            method2599(-26);
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(Lza;I)V", line = 27)
    public static final void method2598(class491 arg0, int arg1) {
        field6393++;
        if (class331.field5216) {
            class144.method1051(arg0, (byte) -113);
        } else {
            class337.method2120(false, arg0);
        }
        if (arg1 != 32586) {
            method2599(47);
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(I)V", line = 46)
    public static final void method2599(int arg0) {
        class509.field7398.method2350((byte) 126);
        field6389++;
        if (arg0 != 10619) {
            method2597(true);
        }
        class432.field6464 = 1;
        class505.field7357 = null;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(IIILjava/awt/Graphics;II)V")
    public abstract void method617(int arg0, int arg1, int arg2, Graphics arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(IIZLjava/awt/Graphics;)V")
    public abstract void method618(int arg0, int arg1, boolean arg2, Graphics arg3);

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(ILjava/awt/Canvas;)V")
    public abstract void method619(int arg0, Canvas arg1);
}
