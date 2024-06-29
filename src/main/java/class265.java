import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cb")
public class class265 {

    @OriginalMember(owner = "client!cb", name = "e", descriptor = "I")
    public static volatile int field4316 = 0;

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "I")
    public static int field4313 = 0;

    @OriginalMember(owner = "client!cb", name = "f", descriptor = "I")
    public static int field4317 = -1;

    @OriginalMember(owner = "client!cb", name = "g", descriptor = "Li;")
    public static class58 field4318 = new class58(16);

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "I")
    public static int field4312;

    @OriginalMember(owner = "client!cb", name = "c", descriptor = "I")
    public static int field4314;

    @OriginalMember(owner = "client!cb", name = "d", descriptor = "I")
    public static int field4315;

    @OriginalMember(owner = "client!cb", name = "h", descriptor = "Lgi;")
    public static class164 field4319;

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(B)V")
    public static void method1779(byte arg0) {
        if (arg0 < 121) {
            field4313 = -25;
        }
        field4319 = null;
        field4318 = null;
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(I)V")
    public static final void method1780(int arg0) {
        client.field2666.method1876((byte) 114);
        field4312++;
        if (arg0 == -1) {
            class312.field5034.method1876((byte) 126);
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(IZII)Lec;")
    public static final class25 method1781(int arg0, boolean arg1, int arg2, int arg3) {
        field4315++;
        int var4 = arg0 << 8 | arg3;
        class25 var5 = (class25) class108.field1682.method61(42, (long) var4 << 16);
        if (var5 != null) {
            return var5;
        }
        byte[] var6 = class6.field151.method1142(class6.field151.method1147(var4, -25327), -10363);
        if (var6 == null) {
            int var8 = arg2 + 65536 << 8 | arg3;
            class25 var9 = (class25) class108.field1682.method61(27, (long) var8 << 16);
            if (var9 != null) {
                return var9;
            }
            byte[] var10 = class6.field151.method1142(class6.field151.method1147(var8, -25327), -10363);
            if (arg1) {
                method1780(51);
            }
            if (var10 == null) {
                int var12 = arg3 | 0xFFFF00;
                class25 var13 = (class25) class108.field1682.method61(91, (long) var12 << 16);
                if (var13 != null) {
                    return var13;
                }
                byte[] var14 = class6.field151.method1142(class6.field151.method1147(var12, -25327), -10363);
                if (var14 == null) {
                    return null;
                } else if (var14.length <= 1) {
                    return null;
                } else {
                    class25 var15 = class150.method1021((byte) 39, var14);
                    var15.field462 = arg3;
                    class108.field1682.method59(var15, (long) var12 << 16, 5);
                    return var15;
                }
            } else if (var10.length <= 1) {
                return null;
            } else {
                class25 var11 = class150.method1021((byte) 39, var10);
                var11.field462 = arg3;
                class108.field1682.method59(var11, (long) var8 << 16, 5);
                return var11;
            }
        } else if (var6.length <= 1) {
            return null;
        } else {
            class25 var7 = class150.method1021((byte) 39, var6);
            var7.field462 = arg3;
            class108.field1682.method59(var7, (long) var4 << 16, 5);
            return var7;
        }
    }
}
