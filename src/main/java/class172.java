import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!t")
public class class172 extends class44 {

    @OriginalMember(owner = "client!t", name = "r", descriptor = "I")
    public static int field3403 = 0;

    @OriginalMember(owner = "client!t", name = "v", descriptor = "Lkb;")
    public static class93 field3407 = class76.method390("Fehler bei der Verbindung zum Server)3", 0);

    @OriginalMember(owner = "client!t", name = "H", descriptor = "Lkb;")
    public static class93 field3419 = class76.method390("scape main", 0);

    @OriginalMember(owner = "client!t", name = "m", descriptor = "I")
    public int field3398;

    @OriginalMember(owner = "client!t", name = "o", descriptor = "I")
    public int field3400;

    @OriginalMember(owner = "client!t", name = "q", descriptor = "I")
    public int field3402;

    @OriginalMember(owner = "client!t", name = "t", descriptor = "I")
    public int field3405;

    @OriginalMember(owner = "client!t", name = "u", descriptor = "I")
    public int field3406;

    @OriginalMember(owner = "client!t", name = "w", descriptor = "I")
    public int field3408;

    @OriginalMember(owner = "client!t", name = "x", descriptor = "I")
    public int field3409;

    @OriginalMember(owner = "client!t", name = "y", descriptor = "I")
    public int field3410;

    @OriginalMember(owner = "client!t", name = "z", descriptor = "I")
    public int field3411;

    @OriginalMember(owner = "client!t", name = "A", descriptor = "I")
    public static int field3412;

    @OriginalMember(owner = "client!t", name = "B", descriptor = "I")
    public static int field3413;

    @OriginalMember(owner = "client!t", name = "C", descriptor = "I")
    public int field3414;

    @OriginalMember(owner = "client!t", name = "D", descriptor = "I")
    public int field3415;

    @OriginalMember(owner = "client!t", name = "E", descriptor = "I")
    public int field3416;

    @OriginalMember(owner = "client!t", name = "F", descriptor = "I")
    public int field3417;

    @OriginalMember(owner = "client!t", name = "G", descriptor = "I")
    public int field3418;

    @OriginalMember(owner = "client!t", name = "K", descriptor = "I")
    public int field3421;

    @OriginalMember(owner = "client!t", name = "L", descriptor = "I")
    public int field3422;

    @OriginalMember(owner = "client!t", name = "M", descriptor = "I")
    public static int field3423;

    @OriginalMember(owner = "client!t", name = "N", descriptor = "I")
    public int field3424;

    @OriginalMember(owner = "client!t", name = "O", descriptor = "I")
    public static int field3425;

    @OriginalMember(owner = "client!t", name = "I", descriptor = "Lph;")
    public class144 field3420;

    @OriginalMember(owner = "client!t", name = "n", descriptor = "Lsb;")
    public class165 field3399;

    @OriginalMember(owner = "client!t", name = "p", descriptor = "Lw;")
    public class199 field3401;

    @OriginalMember(owner = "client!t", name = "s", descriptor = "Lwc;")
    public class202 field3404;

    @OriginalMember(owner = "client!t", name = "b", descriptor = "(I)V")
    public static final void method1148(int arg0) {
        Object var1 = class30.field505;
        synchronized (class30.field505) {
            if (class167.field3337 != arg0) {
                class167.field3337 = 1;
                try {
                    class30.field505.wait();
                } catch (InterruptedException var2) {
                }
            }
        }
        field3412++;
    }

    @OriginalMember(owner = "client!t", name = "c", descriptor = "(I)V")
    public final void method1149(int arg0) {
        this.field3404 = null;
        if (arg0 == -22069) {
            this.field3399 = null;
            field3413++;
            this.field3401 = null;
            this.field3420 = null;
        }
    }

    @OriginalMember(owner = "client!t", name = "d", descriptor = "(I)V")
    public static void method1150(int arg0) {
        if (arg0 != 0) {
            field3407 = null;
        }
        field3419 = null;
        field3407 = null;
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(IIIIIIBI)V")
    public static final void method1151(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6, int arg7) {
        field3423++;
        if (class67.method352(arg6 ^ 0xFFFFFFDD, arg5)) {
            class1.method9(arg4, -1, (byte) 112, arg0, arg7, class28.field460[arg5], arg3, arg2, arg1);
            if (arg6 != -33) {
                method1148(77);
            }
        }
    }

    @OriginalMember(owner = "client!t", name = "b", descriptor = "(B)V")
    public static final void method1152(byte arg0) {
        field3425++;
        class110.field1984.method676(30626);
        int var1 = 113 / ((-arg0 - 23) / 40);
        class81.field1498.method676(30626);
        class174.field3439.method676(30626);
    }
}
