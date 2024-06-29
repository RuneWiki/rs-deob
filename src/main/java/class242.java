import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!du")
public class class242 {

    @OriginalMember(owner = "client!du", name = "d", descriptor = "Lkn;")
    public static class530 field3520 = new class530("purple:", "lila:", "violet:", "roxo:");

    @OriginalMember(owner = "client!du", name = "f", descriptor = "I")
    public static int field3522 = 0;

    @OriginalMember(owner = "client!du", name = "g", descriptor = "S")
    public static short field3523 = 256;

    @OriginalMember(owner = "client!du", name = "a", descriptor = "I")
    public static int field3517;

    @OriginalMember(owner = "client!du", name = "b", descriptor = "I")
    public static int field3518;

    @OriginalMember(owner = "client!du", name = "c", descriptor = "I")
    public static int field3519;

    @OriginalMember(owner = "client!du", name = "e", descriptor = "I")
    public static int field3521;

    @OriginalMember(owner = "client!du", name = "a", descriptor = "(I)V")
    public static void method1524(int arg0) {
        int var1 = -123 / ((-arg0 - 18) / 59);
        field3520 = null;
    }

    @OriginalMember(owner = "client!du", name = "a", descriptor = "(Lkf;Z)V")
    public static final void method1525(class170 arg0, boolean arg1) {
        arg0.field2470 = null;
        field3518++;
        int var2 = arg0.field2475.length;
        for (int var3 = 0; var3 < var2; var3++) {
            arg0.field2475[var3].field1672 = false;
        }
        class477[] var4 = class38.field412;
        synchronized (class38.field412) {
            if (var2 < class38.field412.length && class516.field7602[var2] < 200) {
                class38.field412[var2].method2753(4, arg0);
                int var10002 = class516.field7602[var2]++;
            }
        }
        if (!arg1) {
            method1524(-94);
        }
    }

    @OriginalMember(owner = "client!du", name = "<init>", descriptor = "(II)V")
    public class242(int arg0, int arg1) {
    }

    @OriginalMember(owner = "client!du", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field3517++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!du", name = "a", descriptor = "(II)V")
    public static final void method1526(int arg0, int arg1) {
        field3519++;
        class45 var2 = class354.method2094(arg0, (byte) -57, 16);
        var2.method261(4);
        if (arg1 != -18436) {
            field3520 = null;
        }
    }
}
