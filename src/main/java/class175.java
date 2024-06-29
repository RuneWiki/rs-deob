import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cr")
public abstract class class175 {

    @OriginalMember(owner = "client!cr", name = "c", descriptor = "I")
    public static int field2276 = 0;

    @OriginalMember(owner = "client!cr", name = "b", descriptor = "Lmq;")
    public static class78 field2275 = new class78(82, 6);

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "I")
    public static int field2274;

    @OriginalMember(owner = "client!cr", name = "d", descriptor = "I")
    public static int field2277;

    @OriginalMember(owner = "client!cr", name = "e", descriptor = "I")
    public static int field2278;

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(I)V")
    public static void method1080(int arg0) {
        field2275 = null;
        if (arg0 < 113) {
            method1081(126, 30L);
        }
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(IJ)V")
    public static final void method1081(int arg0, long arg1) {
        field2274++;
        if (class495.field7002 != null) {
            if (class276.field3497 == 1 || class276.field3497 == 5) {
                class633.method3441(arg1, arg0 ^ Integer.MIN_VALUE);
            } else if (class276.field3497 == 4) {
                class153.method952(false, arg1);
            }
        }
        class241.method1500(class458.field6407, true, (long) class266.field3368);
        if (class638.field8834 != -1) {
            class737.method4131(0, class638.field8834);
        }
        for (int var3 = 0; var3 < class48.field702; var3++) {
            if (class709.field9971[var3]) {
                class6.field69[var3] = true;
            }
            class595.field8265[var3] = class709.field9971[var3];
            class709.field9971[var3] = false;
        }
        class62.field843 = class266.field3368;
        class560.method3165(null, 0, -1, -1);
        class460.method2700(null, -1, -1, -5);
        if (arg0 != Integer.MIN_VALUE) {
            field2278 = -117;
        }
        if (class638.field8834 != -1) {
            class48.field702 = 0;
            class106.method725(-8);
        }
        class458.field6407.method59();
        class208.method1277((byte) 34, class458.field6407);
        int var4 = class315.method1845((byte) 26);
        if (var4 == -1) {
            var4 = class105.field1289;
        }
        if (var4 == -1) {
            var4 = class137.field1636;
        }
        class419.method2492(var4, arg0 + 2147458712);
        int var5 = class339.field4374.method253((byte) -27) << 8;
        class171.method1066(class339.field4374.field5784 + var5, class591.field8232, class339.field4374.field5790 + var5, (byte) -63, class339.field4374.field5779);
        class591.field8232 = 0;
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(IB)Z")
    public abstract boolean method873(int arg0, byte arg1) throws IOException;

    @OriginalMember(owner = "client!cr", name = "b", descriptor = "(I)V")
    public abstract void method872(int arg0);

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(II[BZ)I")
    public abstract int method870(int arg0, int arg1, byte[] arg2, boolean arg3) throws IOException;

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(II[BI)V")
    public abstract void method868(int arg0, int arg1, byte[] arg2, int arg3) throws IOException;

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(ZIB)Ldi;")
    public static final class464 method1082(boolean arg0, int arg1, byte arg2) {
        field2277++;
        long var3 = (long) (arg1 | (arg0 ? Integer.MIN_VALUE : 0));
        return arg2 == 20 ? (class464) class3.field26.method3248(var3, 0) : null;
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(B)V")
    public abstract void method871(byte arg0);
}
