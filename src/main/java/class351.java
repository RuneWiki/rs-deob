import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lk")
public abstract class class351 {

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "Z")
    public static boolean field4965 = true;

    @OriginalMember(owner = "client!lk", name = "d", descriptor = "I")
    public static int field4968 = 0;

    @OriginalMember(owner = "client!lk", name = "c", descriptor = "I")
    public static int field4967;

    @OriginalMember(owner = "client!lk", name = "b", descriptor = "Ltq;")
    public static class376 field4966;

    @OriginalMember(owner = "client!lk", name = "e", descriptor = "Ltq;")
    public static class376 field4969;

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(Lon;I)Lon;", line = 8)
    public static final class184 method2241(class184 arg0, int arg1) {
        field4967++;
        if (arg0.field2599 != -1) {
            return class282.method1863(arg0.field2599, arg1 + 710298693);
        } else if (arg1 == -710324528) {
            int var2 = arg0.field2584 >>> 16;
            class389 var3 = new class389(class22.field280);
            for (class167 var4 = (class167) var3.method2491(-93); var4 != null; var4 = (class167) var3.method2494((byte) -125)) {
                if (var4.field2332 == var2) {
                    return class282.method1863((int) var4.field5855, -25835);
                }
            }
            return null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!lk", name = "b", descriptor = "(I)V", line = 38)
    public static void method2242(int arg0) {
        field4966 = null;
        field4969 = null;
        if (arg0 != -6993) {
            method2242(80);
        }
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(BI)[B")
    public abstract byte[] method2239(byte arg0, int arg1);

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(I)Ler;")
    public abstract class54 method2240(int arg0);

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(IB)I")
    public abstract int method2243(int arg0, byte arg1);

    @OriginalMember(owner = "client!lk", name = "b", descriptor = "(IB)V")
    public abstract void method2244(int arg0, byte arg1);
}
