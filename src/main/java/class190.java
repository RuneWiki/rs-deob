import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kk")
public class class190 implements class243 {

    @OriginalMember(owner = "client!kk", name = "c", descriptor = "I")
    public int field2245;

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "I")
    public static int field2243;

    @OriginalMember(owner = "client!kk", name = "d", descriptor = "I")
    public static int field2246;

    @OriginalMember(owner = "client!kk", name = "e", descriptor = "I")
    public static int field2247;

    @OriginalMember(owner = "client!kk", name = "f", descriptor = "I")
    public static int field2248;

    @OriginalMember(owner = "client!kk", name = "b", descriptor = "Loh;")
    public static class404 field2244;

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(B)V", line = 6)
    public static void method1157(byte arg0) {
        if (arg0 > 5) {
            field2244 = null;
        }
    }

    @OriginalMember(owner = "client!kk", name = "<init>", descriptor = "(I)V", line = 17)
    public class190(int arg0) {
        this.field2245 = arg0;
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(Z)I", line = 25)
    public static final int method1158(boolean arg0) {
        field2248++;
        byte var1;
        if (class649.field9279 < 96) {
            var1 = 1;
            class707.method3960(125, true);
        } else {
            int var2 = class61.method467(-65536);
            if (var2 <= 100) {
                var1 = 4;
                class164.method1016(24);
            } else if (var2 <= 500) {
                class234.method1390(arg0);
                var1 = 3;
            } else if (var2 <= 1000) {
                class177.method1091((byte) 108);
                var1 = 2;
            } else {
                class707.method3960(-70, true);
                var1 = 1;
            }
        }
        if (class654.field9334.field9850.method1512(42) != 0) {
            class654.field9334.method3924(true, class654.field9334.field9835, 0);
            class627.method3597(false, 0, -31618);
        }
        class37.method168((byte) 119);
        return arg0 ? 1 : var1;
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(II)I", line = 86)
    public static final int method1159(int arg0, int arg1) {
        if (arg0 != -97) {
            method1158(false);
        }
        field2243++;
        return arg1 >>> 8;
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(I)Lhs;", line = 99)
    public final class325 method777(int arg0) {
        field2246++;
        return arg0 >= -8 ? null : class593.field8382;
    }

    @OriginalMember(owner = "client!kk", name = "b", descriptor = "(I)V", line = 111)
    public static final void method1160(int arg0) {
        field2247++;
        if (arg0 < 15) {
            method1160(6);
        }
        if (class188.field2237 != null) {
            class188.field2237.method4055((byte) -124);
        }
        if (class736.field10294 == null) {
            return;
        }
        while (true) {
            try {
                class736.field10294.join();
                return;
            } catch (InterruptedException var1) {
            }
        }
    }
}
