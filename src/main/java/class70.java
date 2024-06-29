import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wf")
public class class70 {

    @OriginalMember(owner = "client!wf", name = "e", descriptor = "I")
    public static int field930 = 2;

    @OriginalMember(owner = "client!wf", name = "f", descriptor = "I")
    public static int field931 = 0;

    @OriginalMember(owner = "client!wf", name = "k", descriptor = "J")
    public static long field936 = 0L;

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "I")
    public static int field926;

    @OriginalMember(owner = "client!wf", name = "b", descriptor = "I")
    public static int field927;

    @OriginalMember(owner = "client!wf", name = "g", descriptor = "I")
    public static int field932;

    @OriginalMember(owner = "client!wf", name = "j", descriptor = "I")
    public static int field935;

    @OriginalMember(owner = "client!wf", name = "l", descriptor = "I")
    public static int field937;

    @OriginalMember(owner = "client!wf", name = "d", descriptor = "Ltj;")
    public static class108 field929;

    @OriginalMember(owner = "client!wf", name = "i", descriptor = "Lbb;")
    public static class182 field934;

    @OriginalMember(owner = "client!wf", name = "h", descriptor = "Laf;")
    public static class250 field933;

    @OriginalMember(owner = "client!wf", name = "c", descriptor = "[Lvj;")
    public static class256[] field928;

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(IZ)V")
    public static final void method429(int arg0, boolean arg1) {
        field932++;
        class15 var2 = class449.field6404;
        synchronized (class449.field6404) {
            if (arg1) {
                method433(-122, 9);
            }
            class449.field6404.method91(4, arg0);
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(I)V")
    public static void method430(int arg0) {
        field933 = null;
        if (arg0 > -12) {
            field931 = 26;
        }
        field934 = null;
        field928 = null;
        field929 = null;
    }

    @OriginalMember(owner = "client!wf", name = "b", descriptor = "(I)V")
    public static final void method431(int arg0) {
        field926++;
        class24.field305.method98(arg0);
        class381.field5408.method98(0);
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(II)V")
    public static final void method432(int arg0, int arg1) {
        field927++;
        if (arg0 != 1) {
            method431(71);
        }
        class15 var2 = class297.field4320;
        synchronized (class297.field4320) {
            class297.field4320.method91(4, arg1);
        }
        class15 var3 = class245.field3656;
        synchronized (class245.field3656) {
            class245.field3656.method91(4, arg1);
        }
    }

    @OriginalMember(owner = "client!wf", name = "b", descriptor = "(II)V")
    public static final void method433(int arg0, int arg1) {
        field937++;
        if (arg0 < 78) {
            field931 = -32;
        }
        class15 var2 = class441.field6313;
        synchronized (class441.field6313) {
            class441.field6313.method91(4, arg1);
        }
        class15 var3 = class293.field4241;
        synchronized (class293.field4241) {
            class293.field4241.method91(4, arg1);
        }
        class125 var4 = class356.field5154;
        synchronized (class356.field5154) {
            class356.field5154.method752(arg1, 0);
        }
    }
}
