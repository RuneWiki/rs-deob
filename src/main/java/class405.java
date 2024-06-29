import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ml")
public class class405 extends class436 {

    @OriginalMember(owner = "client!ml", name = "S", descriptor = "Z")
    public static volatile boolean field5711 = true;

    @OriginalMember(owner = "client!ml", name = "W", descriptor = "[F")
    public static float[] field5715 = new float[4];

    @OriginalMember(owner = "client!ml", name = "R", descriptor = "I")
    public static int field5710;

    @OriginalMember(owner = "client!ml", name = "U", descriptor = "I")
    public static int field5713;

    @OriginalMember(owner = "client!ml", name = "V", descriptor = "I")
    public static int field5714;

    @OriginalMember(owner = "client!ml", name = "P", descriptor = "Lfa;")
    public static class243 field5708;

    @OriginalMember(owner = "client!ml", name = "T", descriptor = "Lcb;")
    public static class544 field5712;

    @OriginalMember(owner = "client!ml", name = "Q", descriptor = "[[B")
    public static byte[][] field5709;

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(B)Lfk;", line = 9)
    public static final class678 method2437(byte arg0) {
        field5713++;
        class678 var1 = (class678) class214.field3086.method2480(381);
        if (var1 != null) {
            var1.method3117((byte) -126);
            var1.method1512(false);
            return var1;
        }
        if (arg0 > -84) {
            method2437((byte) 38);
        }
        class678 var2;
        do {
            var2 = (class678) class297.field4474.method2480(381);
            if (var2 == null) {
                return null;
            }
            if (var2.method3838((byte) -92) > class109.method731(70)) {
                return null;
            }
            var2.method3117((byte) 62);
            var2.method1512(false);
        } while ((var2.field3123 & Long.MIN_VALUE) == 0L);
        return var2;
    }

    @OriginalMember(owner = "client!ml", name = "c", descriptor = "(I)V", line = 49)
    public static void method2438(int arg0) {
        field5709 = null;
        if (arg0 != 2048) {
            field5709 = null;
        }
        field5715 = null;
        field5712 = null;
        field5708 = null;
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(ZLhk;)Lhk;", line = 62)
    public static final class110 method2439(boolean arg0, class110 arg1) {
        if (!arg0) {
            method2439(true, null);
        }
        field5714++;
        class110 var2 = arg1 == null ? new class110() : new class110(arg1);
        var2.method732(128, 9, (byte) -3);
        return var2;
    }

    @OriginalMember(owner = "client!ml", name = "b", descriptor = "(B)V", line = 82)
    public static final void method2440(byte arg0) {
        class147.field1873 = 0;
        field5710++;
        for (int var1 = 0; var1 < 2048; var1++) {
            class698.field9864[var1] = null;
            class89.field1152[var1] = 1;
            class359.field5218[var1] = null;
        }
        if (arg0 < 71) {
            field5709 = null;
        }
    }
}
