import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!g")
public abstract class class419 extends class85 {

    @OriginalMember(owner = "client!g", name = "A", descriptor = "Z")
    public volatile boolean field5569 = true;

    @OriginalMember(owner = "client!g", name = "y", descriptor = "Loi;")
    public static class169 field5567 = new class169("Allocated memory", "Zugewiesener Speicher.", "Mémoire attribuée", "Memória alocada");

    @OriginalMember(owner = "client!g", name = "E", descriptor = "Lpi;")
    public static class340 field5573 = new class340(26, -1);

    @OriginalMember(owner = "client!g", name = "F", descriptor = "I")
    public static int field5574 = 0;

    @OriginalMember(owner = "client!g", name = "G", descriptor = "Z")
    public static boolean field5575 = false;

    @OriginalMember(owner = "client!g", name = "z", descriptor = "I")
    public static int field5568;

    @OriginalMember(owner = "client!g", name = "C", descriptor = "I")
    public static int field5571;

    @OriginalMember(owner = "client!g", name = "H", descriptor = "I")
    public static int field5576;

    @OriginalMember(owner = "client!g", name = "I", descriptor = "I")
    public static int field5577;

    @OriginalMember(owner = "client!g", name = "J", descriptor = "I")
    public static int field5578;

    @OriginalMember(owner = "client!g", name = "B", descriptor = "Z")
    public boolean field5570;

    @OriginalMember(owner = "client!g", name = "D", descriptor = "Z")
    public boolean field5572;

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(I)V", line = 7)
    public static void method2460(int arg0) {
        if (arg0 <= -77) {
            field5567 = null;
            field5573 = null;
        }
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(IBIIII)V", line = 19)
    public static final void method2461(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5) {
        field5568++;
        int var6 = 103 % ((arg1 - 50) / 62);
        if (class421.field5647.field7704 != 0 && arg5 != 0 && class405.field5433 < 50 && arg0 != -1) {
            class46.field673[class405.field5433++] = new class449((byte) 1, arg0, arg5, arg3, arg2, arg4);
        }
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(IIIIBI)V", line = 41)
    public static final void method2462(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5) {
        field5578++;
        if (class65.field827 <= arg2 && class281.field3589 >= arg3 && class418.field5559 <= arg1 && class456.field6365 >= arg0) {
            class46.method293(arg5, arg0, arg3, arg1, arg2, false);
        } else {
            class152.method1047(arg4 - 73, arg5, arg1, arg2, arg3, arg0);
        }
        if (arg4 != 113) {
            field5576 = -122;
        }
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(IIIZIII)V", line = 58)
    public static final void method2463(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6) {
        if (arg3) {
            return;
        }
        field5577++;
        if (arg0 >= class65.field827 && arg6 <= class281.field3589 && class418.field5559 <= arg4 && arg2 <= class456.field6365) {
            if (arg1 == 1) {
                class78.method455(arg6, -30347, arg4, arg5, arg2, arg0);
            } else {
                class491.method2940(arg6, arg5, arg0, arg4, arg2, (byte) -56, arg1);
            }
        } else if (arg1 == 1) {
            class303.method1815(arg2, arg5, (byte) -54, arg4, arg6, arg0);
        } else {
            class239.method1514(arg4, arg0, arg6, true, arg2, arg1, arg5);
        }
    }

    @OriginalMember(owner = "client!g", name = "f", descriptor = "(I)I")
    public abstract int method2368(int arg0);

    @OriginalMember(owner = "client!g", name = "d", descriptor = "(B)[B")
    public abstract byte[] method2370(byte arg0);
}
