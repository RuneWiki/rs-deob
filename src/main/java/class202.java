import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ig")
public abstract class class202 extends class170 {

    @OriginalMember(owner = "client!ig", name = "r", descriptor = "F")
    public static float field2428;

    @OriginalMember(owner = "client!ig", name = "j", descriptor = "I")
    public int field2420;

    @OriginalMember(owner = "client!ig", name = "k", descriptor = "I")
    public static int field2421;

    @OriginalMember(owner = "client!ig", name = "l", descriptor = "I")
    public int field2422;

    @OriginalMember(owner = "client!ig", name = "m", descriptor = "I")
    public static int field2423;

    @OriginalMember(owner = "client!ig", name = "o", descriptor = "I")
    public int field2425;

    @OriginalMember(owner = "client!ig", name = "p", descriptor = "I")
    public static int field2426;

    @OriginalMember(owner = "client!ig", name = "s", descriptor = "I")
    public static int field2429;

    @OriginalMember(owner = "client!ig", name = "t", descriptor = "I")
    public static int field2430;

    @OriginalMember(owner = "client!ig", name = "u", descriptor = "I")
    public static int field2431;

    @OriginalMember(owner = "client!ig", name = "n", descriptor = "Les;")
    public static class320 field2424;

    @OriginalMember(owner = "client!ig", name = "q", descriptor = "Z")
    public boolean field2427;

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(ZLoe;ILqa;III)V")
    public final void method312(boolean arg0, class170 arg1, int arg2, class206 arg3, int arg4, int arg5, int arg6) {
        field2421++;
        if (arg5 != 13915) {
            this.method312(false, null, -3, null, 13, 70, -6);
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(I)V")
    public static void method1086(int arg0) {
        field2424 = null;
        if (arg0 <= 49) {
            method1087(53);
        }
    }

    @OriginalMember(owner = "client!ig", name = "c", descriptor = "(B)V")
    public final void method314(byte arg0) {
        field2430++;
        if (arg0 < 23) {
            method1086(-9);
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ig", name = "b", descriptor = "(I)V")
    public static final void method1087(int arg0) {
        if (arg0 == -1629) {
            field2431++;
            class290.field3763.method3687(1402);
        }
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(B)V")
    public static final void method1088(byte arg0) {
        field2429++;
        if (arg0 != -43) {
            method1086(-28);
        }
        class394.field5207.method2642(true);
    }

    @OriginalMember(owner = "client!ig", name = "d", descriptor = "(I)Z")
    public final boolean method317(int arg0) {
        field2426++;
        if (arg0 != 64) {
            this.method312(true, null, -14, null, 94, 91, 73);
        }
        return false;
    }
}
