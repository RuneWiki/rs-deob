import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!db")
public class class34 extends Canvas {

    @OriginalMember(owner = "client!db", name = "f", descriptor = "Ljava/awt/Component;")
    private Component field333;

    @OriginalMember(owner = "client!db", name = "a", descriptor = "Ljava/lang/String;")
    public static String field328 = null;

    @OriginalMember(owner = "client!db", name = "e", descriptor = "Lpn;")
    public static class361 field332 = new class361();

    @OriginalMember(owner = "client!db", name = "j", descriptor = "[I")
    public static int[] field337 = new int[1];

    @OriginalMember(owner = "client!db", name = "h", descriptor = "Ljj;")
    public static class398 field335 = new class398(12, -1);

    @OriginalMember(owner = "client!db", name = "b", descriptor = "I")
    public static int field329;

    @OriginalMember(owner = "client!db", name = "c", descriptor = "I")
    public static int field330;

    @OriginalMember(owner = "client!db", name = "d", descriptor = "I")
    public static int field331;

    @OriginalMember(owner = "client!db", name = "k", descriptor = "I")
    public static int field338;

    @OriginalMember(owner = "client!db", name = "i", descriptor = "Lwl;")
    public static class30 field336;

    @OriginalMember(owner = "client!db", name = "g", descriptor = "Ljava/lang/Object;")
    public static Object field334;

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(I)V", line = 5)
    public static void method206(int arg0) {
        field336 = null;
        if (arg0 != -1) {
            field338 = -55;
        }
        field332 = null;
        field328 = null;
        field334 = null;
        field337 = null;
        field335 = null;
    }

    @OriginalMember(owner = "client!db", name = "paint", descriptor = "(Ljava/awt/Graphics;)V", line = 22)
    public final void paint(Graphics arg0) {
        this.field333.paint(arg0);
        field330++;
    }

    @OriginalMember(owner = "client!db", name = "<init>", descriptor = "(Ljava/awt/Component;)V", line = 35)
    public class34(Component arg0) {
        this.field333 = arg0;
    }

    @OriginalMember(owner = "client!db", name = "update", descriptor = "(Ljava/awt/Graphics;)V", line = 43)
    public final void update(Graphics arg0) {
        field329++;
        this.field333.update(arg0);
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(ZI[B)Ljava/lang/Object;", line = 56)
    public static final Object method207(boolean arg0, int arg1, byte[] arg2) {
        field331++;
        if (arg2 == null) {
            return null;
        }
        if (arg2.length > arg1 && !class193.field2505) {
            try {
                class653 var3 = (class653) Class.forName("sj").getDeclaredConstructor().newInstance();
                var3.method2522(arg2, 4);
                return var3;
            } catch (Throwable var4) {
                class193.field2505 = true;
            }
        }
        return arg0 ? class21.method117(0, arg2) : arg2;
    }
}
