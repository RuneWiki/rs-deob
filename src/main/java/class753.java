import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!f")
public class class753 {

    @OriginalMember(owner = "client!f", name = "c", descriptor = "Lmu;")
    public static class303 field10516 = new class303(13, -2);

    @OriginalMember(owner = "client!f", name = "a", descriptor = "I")
    public static int field10514;

    @OriginalMember(owner = "client!f", name = "b", descriptor = "I")
    public int field10515;

    @OriginalMember(owner = "client!f", name = "d", descriptor = "I")
    public static int field10517;

    @OriginalMember(owner = "client!f", name = "e", descriptor = "I")
    public int field10518;

    @OriginalMember(owner = "client!f", name = "f", descriptor = "I")
    public static int field10519;

    @OriginalMember(owner = "client!f", name = "g", descriptor = "I")
    public int field10520;

    @OriginalMember(owner = "client!f", name = "h", descriptor = "Z")
    public boolean field10521;

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(Z)Z")
    public static final boolean method4202(boolean arg0) {
        field10514++;
        boolean var1 = arg0;
        if (class230.field3327 == null) {
            if (class569.field7819.method874(false, class349.field4877)) {
                class230.field3327 = class267.method1771(class569.field7819, class349.field4877);
            } else {
                var1 = false;
            }
        }
        if (class54.field1102 == null) {
            if (class569.field7819.method874(!arg0, class77.field1383)) {
                class54.field1102 = class267.method1771(class569.field7819, class77.field1383);
            } else {
                var1 = false;
            }
        }
        if (class724.field9810 == null) {
            if (class569.field7819.method874(false, class67.field1269)) {
                class724.field9810 = class267.method1771(class569.field7819, class67.field1269);
            } else {
                var1 = false;
            }
        }
        if (class276.field3876 == null) {
            if (class416.field6026.method874(false, class66.field1254)) {
                class276.field3876 = class507.method2982((byte) -89, class66.field1254, class416.field6026);
            } else {
                var1 = false;
            }
        }
        if (class729.field9866 == null) {
            if (class569.field7819.method874(false, class66.field1254)) {
                class729.field9866 = class267.method1782(class569.field7819, class66.field1254);
            } else {
                var1 = false;
            }
        }
        return var1;
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(I)V")
    public static void method4203(int arg0) {
        field10516 = null;
        if (arg0 != 1) {
            method4203(-30);
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(II)I")
    public static final int method4204(int arg0, int arg1) {
        field10517++;
        int var2 = arg0 & 0x3F;
        int var3 = (arg1 & arg0) >> 6;
        if (var2 == 18) {
            if (var3 == 0) {
                return 1;
            }
            if (var3 == 1) {
                return 2;
            }
            if (var3 == 2) {
                return 4;
            }
            if (var3 == 3) {
                return 8;
            }
        } else if (var2 == 19 || var2 == 21) {
            if (var3 == 0) {
                return 16;
            }
            if (var3 == 1) {
                return 32;
            }
            if (var3 == 2) {
                return 64;
            }
            if (var3 == 3) {
                return 128;
            }
        }
        return 0;
    }
}
