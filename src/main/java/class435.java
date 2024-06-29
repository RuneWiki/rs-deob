import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pg")
public abstract class class435 {

    @OriginalMember(owner = "client!pg", name = "c", descriptor = "Lal;")
    public static class52 field6410 = new class52(64);

    @OriginalMember(owner = "client!pg", name = "e", descriptor = "Lvd;")
    public static class26 field6412 = null;

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "I")
    public static int field6408;

    @OriginalMember(owner = "client!pg", name = "b", descriptor = "I")
    public static int field6409;

    @OriginalMember(owner = "client!pg", name = "d", descriptor = "Lmp;")
    public static class452 field6411;

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(IB)V", line = 11)
    public static final void method2680(int arg0, byte arg1) {
        field6408++;
        class424.method2634(-1);
        class304.method2048(arg1 + 6);
        if (arg1 != -2) {
            field6412 = null;
        }
        int var2 = class386.method2449(true, arg0).field6038;
        if (var2 == 0) {
            return;
        }
        int var3 = class403.field6014[arg0];
        if (var2 == 6) {
            class358.field5482 = var3;
        }
        if (var2 == 5) {
            class345.field5327 = var3;
        }
        if (var2 == 9) {
            class427.field6303 = var3;
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(Z)V", line = 47)
    public static void method2681(boolean arg0) {
        field6411 = null;
        field6412 = null;
        field6410 = null;
        if (!arg0) {
            method2680(66, (byte) 72);
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(Ljava/awt/Component;B)V", line = 78)
    public static final void method2682(Component arg0, byte arg1) {
        arg0.addMouseListener(class433.field6389);
        int var2 = -35 / ((-arg1 - 29) / 33);
        field6409++;
        arg0.addMouseMotionListener(class433.field6389);
        arg0.addFocusListener(class433.field6389);
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(III)V")
    public abstract void method1984(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(I)V")
    public abstract void method1989(int arg0);

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(III[I)V")
    public abstract void method1996(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(IIIIII)V")
    public abstract void method1987(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "([I)V")
    public abstract void method1985(int[] arg0);

    @OriginalMember(owner = "client!pg", name = "b", descriptor = "(I)V")
    public abstract void method1994(int arg0);

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(Lpg;)V")
    public abstract void method1992(class435 arg0);

    @OriginalMember(owner = "client!pg", name = "c", descriptor = "(I)V")
    public abstract void method1993(int arg0);

    @OriginalMember(owner = "client!pg", name = "d", descriptor = "(I)V")
    public abstract void method1986(int arg0);

    @OriginalMember(owner = "client!pg", name = "e", descriptor = "(I)V")
    public abstract void method1991(int arg0);

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "()V")
    public abstract void method1988();

    @OriginalMember(owner = "client!pg", name = "b", descriptor = "(III)V")
    public abstract void method1995(int arg0, int arg1, int arg2);
}
