import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pi")
public abstract class class467 extends class280 {

    @OriginalMember(owner = "client!pi", name = "l", descriptor = "I")
    public int field6545;

    @OriginalMember(owner = "client!pi", name = "n", descriptor = "I")
    public int field6547;

    @OriginalMember(owner = "client!pi", name = "p", descriptor = "I")
    public int field6549;

    @OriginalMember(owner = "client!pi", name = "k", descriptor = "I")
    public int field6544;

    @OriginalMember(owner = "client!pi", name = "o", descriptor = "Z")
    public static boolean field6548 = false;

    @OriginalMember(owner = "client!pi", name = "m", descriptor = "I")
    public static int field6546;

    @OriginalMember(owner = "client!pi", name = "r", descriptor = "I")
    public static int field6551;

    @OriginalMember(owner = "client!pi", name = "s", descriptor = "I")
    public static int field6552;

    @OriginalMember(owner = "client!pi", name = "t", descriptor = "I")
    public static int field6553;

    @OriginalMember(owner = "client!pi", name = "q", descriptor = "Lml;")
    public static class215 field6550;

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(Z[BB)Ljava/lang/Object;")
    public static final Object method2748(boolean arg0, byte[] arg1, byte arg2) {
        int var3 = -43 / ((-arg2 - 30) / 50);
        field6553++;
        if (arg1 == null) {
            return null;
        }
        if (arg1.length > 136 && !class309.field4224) {
            try {
                class373 var4 = (class373) Class.forName("rp").getDeclaredConstructor().newInstance();
                var4.method2145((byte) -113, arg1);
                return var4;
            } catch (Throwable var5) {
                class309.field4224 = true;
            }
        }
        return arg0 ? class81.method555(arg1, 103) : arg1;
    }

    @OriginalMember(owner = "client!pi", name = "f", descriptor = "(I)V")
    public static final void method2749(int arg0) {
        field6546++;
        int var1 = -49 / ((-arg0 - 49) / 48);
        class255.field3565.method2623((byte) 120);
        class389.field5487.method2623((byte) -30);
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(IIII)Z")
    public static final boolean method2750(int arg0, int arg1, int arg2, int arg3) {
        if (class155.method942(arg0, arg1, arg2)) {
            int var4 = arg1 << class259.field3616;
            int var5 = arg2 << class259.field3616;
            return class210.method1323(var4 + 1, class317.field4306[arg0].method710(arg1, arg2) + arg3, var5 + 1) && class210.method1323(class372.field5263 + var4 - 1, class317.field4306[arg0].method710(arg1 + 1, arg2) + arg3, var5 + 1) && class210.method1323(class372.field5263 + var4 - 1, class317.field4306[arg0].method710(arg1 + 1, arg2 + 1) + arg3, class372.field5263 + var5 - 1) && class210.method1323(var4 + 1, class317.field4306[arg0].method710(arg1, arg2 + 1) + arg3, class372.field5263 + var5 - 1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!pi", name = "c", descriptor = "(Z)V")
    public static void method2751(boolean arg0) {
        field6550 = null;
        if (arg0) {
            method2751(false);
        }
    }

    @OriginalMember(owner = "client!pi", name = "<init>", descriptor = "(IIII)V")
    public class467(int arg0, int arg1, int arg2, int arg3) {
        this.field6545 = arg0;
        this.field6547 = arg1;
        this.field6549 = arg2;
        this.field6544 = arg3;
    }
}
