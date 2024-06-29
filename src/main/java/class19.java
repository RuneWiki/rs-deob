import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fn")
public class class19 {

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "I")
    public static int field311 = 2;

    @OriginalMember(owner = "client!fn", name = "e", descriptor = "[C")
    public static char[] field315 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

    @OriginalMember(owner = "client!fn", name = "c", descriptor = "I")
    public static int field313;

    @OriginalMember(owner = "client!fn", name = "f", descriptor = "Lkd;")
    public static class11 field316;

    @OriginalMember(owner = "client!fn", name = "b", descriptor = "[Lho;")
    public static class215[] field312;

    @OriginalMember(owner = "client!fn", name = "d", descriptor = "[[[B")
    public static byte[][][] field314;

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(I)V", line = 16)
    public static void method219(int arg0) {
        field314 = (byte[][][]) null;
        if (arg0 > 18) {
            field315 = null;
            field312 = null;
            field316 = null;
        }
    }

    @OriginalMember(owner = "client!fn", name = "b", descriptor = "(I)Z", line = 32)
    public static final boolean method220(int arg0) {
        field313++;
        try {
            if (class42.field671 == 2) {
                if (class261.field4008 == null) {
                    class261.field4008 = class73.method688(class337.field5185, class62.field952, class150.field2450);
                    if (class261.field4008 == null) {
                        return false;
                    }
                }
                if (class226.field3524 == null) {
                    class226.field3524 = new class214(class214.field3354, class266.field4128);
                }
                if (class128.field2122.method123(class356.field5674, class261.field4008, 31213, 22050, class226.field3524)) {
                    class128.field2122.method154(arg0 ^ 0xFFFF9EB0);
                    class128.field2122.method153(class110.field1693, (byte) -25);
                    class128.field2122.method151(class287.field4447, arg0 ^ 0xFFFFCDED, class261.field4008);
                    class226.field3524 = null;
                    class261.field4008 = null;
                    class337.field5185 = null;
                    class42.field671 = 0;
                    return true;
                }
            }
            if (arg0 != -13230) {
                method220(36);
            }
        } catch (Exception var2) {
            var2.printStackTrace();
            class128.field2122.method148(true);
            class42.field671 = 0;
            class226.field3524 = null;
            class337.field5185 = null;
            class261.field4008 = null;
        }
        return false;
    }
}
