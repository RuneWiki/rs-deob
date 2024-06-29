import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vfa")
public abstract class class465 extends class662 {

    @OriginalMember(owner = "client!vfa", name = "e", descriptor = "F")
    public static float field6718;

    @OriginalMember(owner = "client!vfa", name = "f", descriptor = "I")
    public static int field6719;

    @OriginalMember(owner = "client!vfa", name = "h", descriptor = "I")
    public static int field6721;

    @OriginalMember(owner = "client!vfa", name = "g", descriptor = "[[[B")
    public static byte[][][] field6720;

    @OriginalMember(owner = "client!vfa", name = "c", descriptor = "(I)V", line = 3)
    public static void method2749(int arg0) {
        field6720 = null;
        if (arg0 > -56) {
            field6718 = 0.4789169F;
        }
    }

    @OriginalMember(owner = "client!vfa", name = "a", descriptor = "(ILufa;ILka;BI)V", line = 16)
    public static final void method2750(int arg0, class152 arg1, int arg2, class219 arg3, byte arg4, int arg5) {
        if (arg4 == -123) {
            field6719++;
            if (arg3 != null) {
                arg1.method942(126, arg3.method1361(), arg3.method1355(), arg3.method1344(), arg2, arg3.method1359(), arg3.method1347(), arg5, arg0, arg3.method1339(), arg3.method1353());
            }
        }
    }

    @OriginalMember(owner = "client!vfa", name = "a", descriptor = "(ZZ)V", line = 30)
    public static final void method2751(boolean arg0, boolean arg1) {
        if (!arg0) {
            return;
        }
        if (class733.field10249 == null) {
            class4.method16(200);
        }
        field6721++;
        if (arg1) {
            class733.field10249.method2374((byte) 67);
        }
    }

    @OriginalMember(owner = "client!vfa", name = "a", descriptor = "(Z)Lsq;")
    public abstract class207 method2752(boolean arg0);
}
