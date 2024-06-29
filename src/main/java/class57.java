import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rq")
public class class57 {

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "Ljw;")
    public static class259 field729 = new class259(6, 4);

    @OriginalMember(owner = "client!rq", name = "c", descriptor = "I")
    public static int field731;

    @OriginalMember(owner = "client!rq", name = "d", descriptor = "I")
    public static int field732;

    @OriginalMember(owner = "client!rq", name = "e", descriptor = "I")
    public static int field733;

    @OriginalMember(owner = "client!rq", name = "f", descriptor = "I")
    public static int field734;

    @OriginalMember(owner = "client!rq", name = "b", descriptor = "[I")
    public static int[] field730;

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(I)I")
    public static final int method331(int arg0) {
        field731++;
        class380 var1 = class162.field2320;
        synchronized (class162.field2320) {
            if (arg0 != 27707) {
                method331(109);
            }
            return class162.field2320.method2175((byte) -54);
        }
    }

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(ZLeg;)V")
    public static final void method332(boolean arg0, class48 arg1) {
        field732++;
        arg1.field566 = false;
        if (arg1.field564 != null) {
            arg1.field564.field8923 = 0;
        }
        for (class48 var2 = arg1.method257(); var2 != null; var2 = arg1.method254()) {
            method332(true, var2);
        }
        if (!arg0) {
            field729 = null;
        }
    }

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(IBIIIIIIII)V")
    public static final void method333(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field733++;
        if (class281.field3703 <= arg4 && arg4 <= class255.field3350 && class281.field3703 <= arg2 && arg2 <= class255.field3350 && arg6 >= class281.field3703 && arg6 <= class255.field3350 && class281.field3703 <= arg0 && class255.field3350 >= arg0 && class6.field66 <= arg7 && arg7 <= class151.field2071 && class6.field66 <= arg5 && class151.field2071 >= arg5 && class6.field66 <= arg9 && arg9 <= class151.field2071 && arg8 >= class6.field66 && arg8 <= class151.field2071) {
            class582.method3213(arg3, arg2, arg5, arg0, arg8, 0, arg4, arg6, arg9, arg7);
        } else {
            class344.method2054(arg5, arg7, arg9, arg0, 13884, arg3, arg8, arg2, arg6, arg4);
        }
        if (arg1 != -33) {
            method334(10, 26, 36, -8);
        }
    }

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(IIII)V")
    public static final void method334(int arg0, int arg1, int arg2, int arg3) {
        field734++;
        int var4 = class602.field8408.field4323 * arg3 >> 8;
        if (arg0 != var4 && arg1 != -1) {
            class571.method3154(class165.field2366, var4, false, (byte) -120, arg1, 0);
            class33.field460 = true;
        }
    }

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(B)V")
    public static void method335(byte arg0) {
        if (arg0 > -120) {
            method332(false, null);
        }
        field730 = null;
        field729 = null;
    }
}
