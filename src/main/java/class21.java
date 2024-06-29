import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fb")
public class class21 {

    @OriginalMember(owner = "client!fb", name = "d", descriptor = "I")
    public static int field343 = 0;

    @OriginalMember(owner = "client!fb", name = "h", descriptor = "I")
    public static int field347 = 0;

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "I")
    public static int field340;

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "I")
    public static int field341;

    @OriginalMember(owner = "client!fb", name = "e", descriptor = "I")
    public static int field344;

    @OriginalMember(owner = "client!fb", name = "f", descriptor = "I")
    public static int field345;

    @OriginalMember(owner = "client!fb", name = "g", descriptor = "I")
    public static int field346;

    @OriginalMember(owner = "client!fb", name = "i", descriptor = "I")
    public static int field348;

    @OriginalMember(owner = "client!fb", name = "c", descriptor = "[Lbf;")
    public static class108[] field342;

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(II)I")
    public static final int method139(int arg0, int arg1) {
        if (arg0 != 255) {
            method142((byte) 92, -91);
        }
        field340++;
        return arg1 & 0xFF;
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(I)V")
    public static final void method140(int arg0) {
        field344++;
        if (!class193.field2950) {
            return;
        }
        class178 var1 = class14.method96(-1, class142.field1952, class195.field2994);
        if (var1 != null && var1.field2684 != null) {
            class272 var2 = new class272();
            var2.field4340 = var1.field2684;
            var2.field4337 = var1;
            class160.method994((byte) -112, var2);
        }
        if (arg0 != -8252) {
            field346 = 40;
        }
        class43.field645 = -1;
        class193.field2950 = false;
        class312.method2108(false, var1);
    }

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "(I)V")
    public static void method141(int arg0) {
        if (arg0 == -1) {
            field342 = null;
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(BI)I")
    public static final int method142(byte arg0, int arg1) {
        if (arg0 == -84) {
            field348++;
            return arg1 >>> 8;
        } else {
            return -66;
        }
    }
}
