import java.awt.Component;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!el")
public class class218 extends class137 {

    @OriginalMember(owner = "client!el", name = "r", descriptor = "[I")
    public static int[] field3424 = new int[2];

    @OriginalMember(owner = "client!el", name = "p", descriptor = "Lad;")
    public static class275 field3422 = new class275(4);

    @OriginalMember(owner = "client!el", name = "x", descriptor = "Lrg;")
    public static class248 field3430 = null;

    @OriginalMember(owner = "client!el", name = "w", descriptor = "[I")
    public static int[] field3429 = new int[14];

    @OriginalMember(owner = "client!el", name = "A", descriptor = "[I")
    public static int[] field3433 = new int[2000];

    @OriginalMember(owner = "client!el", name = "B", descriptor = "I")
    public static int field3434 = 0;

    @OriginalMember(owner = "client!el", name = "k", descriptor = "I")
    public static int field3417;

    @OriginalMember(owner = "client!el", name = "m", descriptor = "I")
    public int field3419;

    @OriginalMember(owner = "client!el", name = "n", descriptor = "I")
    public static int field3420;

    @OriginalMember(owner = "client!el", name = "u", descriptor = "I")
    public static int field3427;

    @OriginalMember(owner = "client!el", name = "v", descriptor = "I")
    public int field3428;

    @OriginalMember(owner = "client!el", name = "z", descriptor = "Lgi;")
    public static class164 field3432;

    @OriginalMember(owner = "client!el", name = "l", descriptor = "[I")
    public int[] field3418;

    @OriginalMember(owner = "client!el", name = "s", descriptor = "[I")
    public int[] field3425;

    @OriginalMember(owner = "client!el", name = "y", descriptor = "[I")
    public int[] field3431;

    @OriginalMember(owner = "client!el", name = "q", descriptor = "[Lkc;")
    public class301[] field3423;

    @OriginalMember(owner = "client!el", name = "t", descriptor = "[Lkc;")
    public class301[] field3426;

    @OriginalMember(owner = "client!el", name = "o", descriptor = "[[[B")
    public byte[][][] field3421;

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(ZLjava/awt/Component;)V")
    public static final void method1488(boolean arg0, Component arg1) {
        field3417++;
        if (!arg0) {
            return;
        }
        Method var2 = class69.field1115;
        if (var2 != null) {
            try {
                var2.invoke(arg1, Boolean.FALSE);
            } catch (Throwable var3) {
            }
        }
        arg1.addKeyListener(class171.field2801);
        arg1.addFocusListener(class171.field2801);
    }

    @OriginalMember(owner = "client!el", name = "b", descriptor = "(B)V")
    public static void method1489(byte arg0) {
        field3422 = null;
        if (arg0 <= 4) {
            field3433 = null;
        }
        field3432 = null;
        field3430 = null;
        field3424 = null;
        field3429 = null;
        field3433 = null;
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(IIIII)V")
    public static final void method1490(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field3420++;
        class291 var5 = class61.method389(arg2, arg3, 0);
        var5.method2009(arg3 - 119);
        var5.field4763 = arg0;
        var5.field4768 = arg4;
        var5.field4773 = arg1;
    }
}
