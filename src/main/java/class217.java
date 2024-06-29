import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cha")
public abstract class class217 {

    @OriginalMember(owner = "client!cha", name = "a", descriptor = "I")
    public int field2515;

    @OriginalMember(owner = "client!cha", name = "f", descriptor = "I")
    public int field2520;

    @OriginalMember(owner = "client!cha", name = "j", descriptor = "I")
    public int field2524;

    @OriginalMember(owner = "client!cha", name = "g", descriptor = "Z")
    public static boolean field2521 = true;

    @OriginalMember(owner = "client!cha", name = "e", descriptor = "Z")
    public static boolean field2519 = false;

    @OriginalMember(owner = "client!cha", name = "c", descriptor = "I")
    public static int field2517;

    @OriginalMember(owner = "client!cha", name = "h", descriptor = "I")
    public static int field2522;

    @OriginalMember(owner = "client!cha", name = "i", descriptor = "I")
    public static int field2523;

    @OriginalMember(owner = "client!cha", name = "k", descriptor = "I")
    public static int field2525;

    @OriginalMember(owner = "client!cha", name = "l", descriptor = "Loh;")
    public static class404 field2526;

    @OriginalMember(owner = "client!cha", name = "b", descriptor = "Ltp;")
    public static class532 field2516;

    @OriginalMember(owner = "client!cha", name = "d", descriptor = "[I")
    public static int[] field2518;

    @OriginalMember(owner = "client!cha", name = "a", descriptor = "(IIZ)V")
    public abstract void method1265(int arg0, int arg1, boolean arg2);

    @OriginalMember(owner = "client!cha", name = "a", descriptor = "(IB)V")
    public static final void method1266(int arg0, byte arg1) {
        if (arg1 <= 35) {
            method1269(-33, (byte) -128);
        }
        field2525++;
        class47 var2 = class258.method1546(2, arg0, (byte) 121);
        var2.method274(false);
    }

    @OriginalMember(owner = "client!cha", name = "a", descriptor = "(III)V")
    public abstract void method1267(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!cha", name = "a", descriptor = "(IIB)V")
    public abstract void method1268(int arg0, int arg1, byte arg2);

    @OriginalMember(owner = "client!cha", name = "<init>", descriptor = "(III)V")
    public class217(int arg0, int arg1, int arg2) {
        this.field2515 = arg0;
        this.field2520 = arg1;
        this.field2524 = arg2;
    }

    @OriginalMember(owner = "client!cha", name = "b", descriptor = "(IB)Z")
    public static final boolean method1269(int arg0, byte arg1) {
        if (arg1 > -99) {
            return false;
        } else {
            field2517++;
            return arg0 == 3 || arg0 == 4;
        }
    }

    @OriginalMember(owner = "client!cha", name = "a", descriptor = "(Z)V")
    public static void method1270(boolean arg0) {
        if (!arg0) {
            field2518 = null;
            field2526 = null;
            field2516 = null;
        }
    }
}
