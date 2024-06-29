import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!km")
public abstract class class436 extends class235 {

    @OriginalMember(owner = "client!km", name = "B", descriptor = "Lbp;")
    public class46 field6399;

    @OriginalMember(owner = "client!km", name = "E", descriptor = "Ljava/lang/String;")
    public static String field6401 = "Created gameworld";

    @OriginalMember(owner = "client!km", name = "D", descriptor = "Lwe;")
    public static class24 field6400 = new class24(256);

    @OriginalMember(owner = "client!km", name = "H", descriptor = "J")
    public static long field6404 = 0L;

    @OriginalMember(owner = "client!km", name = "I", descriptor = "I")
    public static int field6405 = 0;

    @OriginalMember(owner = "client!km", name = "A", descriptor = "I")
    public static int field6398;

    @OriginalMember(owner = "client!km", name = "G", descriptor = "I")
    public static int field6403;

    @OriginalMember(owner = "client!km", name = "J", descriptor = "I")
    public static int field6406;

    @OriginalMember(owner = "client!km", name = "F", descriptor = "[I")
    public static int[] field6402;

    @OriginalMember(owner = "client!km", name = "d", descriptor = "(I)V")
    public static void method2756(int arg0) {
        field6401 = null;
        field6400 = null;
        if (arg0 != 0) {
            method2759(-123, -15);
        }
        field6402 = null;
    }

    @OriginalMember(owner = "client!km", name = "e", descriptor = "(I)Z")
    public abstract boolean method1621(int arg0);

    @OriginalMember(owner = "client!km", name = "d", descriptor = "(B)Ljava/lang/Object;")
    public abstract Object method1622(byte arg0);

    @OriginalMember(owner = "client!km", name = "f", descriptor = "(I)V")
    public static final void method2757(int arg0) {
        field6403++;
        class328.field4707.method212(-77);
        class16.field177.method212(-111);
        if (arg0 > -45) {
            field6402 = null;
        }
    }

    @OriginalMember(owner = "client!km", name = "<init>", descriptor = "(Lbp;)V")
    public class436(class46 arg0) {
        this.field6399 = arg0;
    }

    @OriginalMember(owner = "client!km", name = "b", descriptor = "(II)Lg;")
    public static final class433 method2758(int arg0, int arg1) {
        field6406++;
        class146[] var2 = class308.field4401;
        synchronized (class308.field4401) {
            class433 var3;
            if (arg0 >= class308.field4401.length || class308.field4401[arg0].method973(arg1 - 12172)) {
                var3 = new class433();
                var3.field6381 = new class206[arg0];
                for (int var4 = 0; var4 < arg0; var4++) {
                    var3.field6381[var4] = new class206();
                }
            } else {
                var3 = (class433) class308.field4401[arg0].method972(128);
                var3.method1754((byte) 71);
                int var10002 = class151.field1980[arg0]--;
            }
            if (arg1 != 12300) {
                field6405 = 7;
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!km", name = "c", descriptor = "(II)I")
    public static final int method2759(int arg0, int arg1) {
        return class274.field4030 == null ? 0 : class274.field4030[arg0][arg1] & 0xFFFFFF;
    }
}
