import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ks")
public class class289 {

    @OriginalMember(owner = "client!ks", name = "c", descriptor = "Luc;")
    public static class51 field4328 = new class51(30);

    @OriginalMember(owner = "client!ks", name = "j", descriptor = "Z")
    public static boolean field4335 = false;

    @OriginalMember(owner = "client!ks", name = "l", descriptor = "Ljava/lang/String;")
    public static String field4337 = "slide:";

    @OriginalMember(owner = "client!ks", name = "m", descriptor = "I")
    public static int field4338 = 0;

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "I")
    private int field4326;

    @OriginalMember(owner = "client!ks", name = "b", descriptor = "I")
    public static int field4327;

    @OriginalMember(owner = "client!ks", name = "d", descriptor = "I")
    public static int field4329;

    @OriginalMember(owner = "client!ks", name = "e", descriptor = "I")
    public int field4330;

    @OriginalMember(owner = "client!ks", name = "f", descriptor = "I")
    public static int field4331;

    @OriginalMember(owner = "client!ks", name = "h", descriptor = "I")
    public int field4333;

    @OriginalMember(owner = "client!ks", name = "i", descriptor = "I")
    public static int field4334;

    @OriginalMember(owner = "client!ks", name = "k", descriptor = "I")
    public static int field4336;

    @OriginalMember(owner = "client!ks", name = "n", descriptor = "I")
    public static int field4339;

    @OriginalMember(owner = "client!ks", name = "g", descriptor = "Lir;")
    public static class185 field4332;

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(B)Lok;", line = 5)
    public final class10 method1963(byte arg0) {
        field4327++;
        class10 var2 = (class10) class295.field4449.method378((byte) 28, (long) this.field4326);
        if (var2 != null) {
            return var2;
        }
        class10 var3 = class10.method88(class421.field6117, this.field4326, 0);
        if (var3 != null) {
            class295.field4449.method367((long) this.field4326, var3, true);
        }
        if (arg0 != -15) {
            field4338 = 106;
        }
        return var3;
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(ILfb;IB)V", line = 26)
    private final void method1964(int arg0, class341 arg1, int arg2, byte arg3) {
        field4334++;
        if (arg3 <= 109) {
            field4337 = null;
        }
        if (arg2 == 1) {
            this.field4326 = arg1.method2239(-1076227960);
        } else if (arg2 == 2) {
            this.field4333 = arg1.method2233((byte) 104);
            this.field4330 = arg1.method2233((byte) 104);
            return;
        }
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(II)V", line = 49)
    public static final void method1965(int arg0, int arg1) {
        class51 var2 = class239.field3357;
        synchronized (class239.field3357) {
            class239.field3357.method379(arg0, false);
        }
        field4339++;
        class51 var3 = class390.field5701;
        synchronized (class390.field5701) {
            class390.field5701.method379(arg0, false);
        }
        if (arg1 != 0) {
            method1966(37);
        }
        class216 var4 = class444.field6413;
        synchronized (class444.field6413) {
            class444.field6413.method1422(-1, arg0);
        }
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(I)Z", line = 72)
    public static final boolean method1966(int arg0) {
        field4329++;
        if (arg0 != 3032) {
            field4328 = null;
        }
        return class72.field1026 != 0 || class7.field93 >= 2;
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(Lfb;II)V", line = 86)
    public final void method1967(class341 arg0, int arg1, int arg2) {
        while (true) {
            int var4 = arg0.method2233((byte) 104);
            if (var4 == 0) {
                if (arg2 != -9539) {
                    method1966(50);
                }
                field4336++;
                return;
            }
            this.method1964(arg1, arg0, var4, (byte) 118);
        }
    }

    @OriginalMember(owner = "client!ks", name = "b", descriptor = "(I)V", line = 118)
    public static void method1968(int arg0) {
        field4328 = null;
        field4337 = null;
        field4332 = null;
        if (arg0 != 0) {
            field4331 = 5;
        }
    }
}
