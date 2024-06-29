import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nha")
public class class340 {

    @OriginalMember(owner = "client!nha", name = "b", descriptor = "D")
    public static double field4755 = -1.0D;

    @OriginalMember(owner = "client!nha", name = "e", descriptor = "I")
    public static int field4758 = -1;

    @OriginalMember(owner = "client!nha", name = "a", descriptor = "I")
    public static int field4754;

    @OriginalMember(owner = "client!nha", name = "c", descriptor = "I")
    public static int field4756;

    @OriginalMember(owner = "client!nha", name = "d", descriptor = "I")
    public static int field4757;

    @OriginalMember(owner = "client!nha", name = "a", descriptor = "(II)V", line = 5)
    public static final void method2164(int arg0, int arg1) {
        class550.field7586 = arg0;
        field4757++;
        class685.field9165.method3103(-11294);
        if (arg1 != 128) {
            field4756 = 104;
        }
    }

    @OriginalMember(owner = "client!nha", name = "a", descriptor = "(ZLlf;)V", line = 25)
    public static final void method2165(boolean arg0, class250 arg1) {
        field4754++;
        if (class197.field2553 == null) {
            class617 var2 = new class617();
            byte[] var3 = var2.method3421(128, 128, arg0, 16);
            class197.field2553 = class33.method182(-19357, var3, false);
        }
        if (class16.field170 == null) {
            class437 var4 = new class437();
            byte[] var5 = var4.method2620(128, 34037, 128, 16);
            class16.field170 = class33.method182(-19357, var5, false);
        }
        class131 var6 = arg1.field3516;
        if (arg0) {
            method2164(-46, -91);
        }
        if (var6.method927(14) && class684.field9135 == null) {
            byte[] var7 = class37.method215(16.0F, 0.6F, 128, 0.5F, 16, (byte) 118, 8, 4.0F, new class503(419684), 128, 4.0F);
            class684.field9135 = class33.method182(-19357, var7, false);
        }
    }
}
