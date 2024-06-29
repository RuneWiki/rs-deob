import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bo")
public class class15 {

    @OriginalMember(owner = "client!bo", name = "f", descriptor = "Z")
    public static boolean field277 = false;

    @OriginalMember(owner = "client!bo", name = "h", descriptor = "[C")
    public static char[] field279 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

    @OriginalMember(owner = "client!bo", name = "g", descriptor = "[I")
    public static int[] field278 = new int[] { 76, 8, 137, 4, 0, 1, 38, 2, 19 };

    @OriginalMember(owner = "client!bo", name = "i", descriptor = "I")
    public static int field280 = 0;

    @OriginalMember(owner = "client!bo", name = "b", descriptor = "I")
    public static int field273 = 0;

    @OriginalMember(owner = "client!bo", name = "j", descriptor = "[I")
    public static int[] field281 = new int[2];

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "I")
    public static int field272;

    @OriginalMember(owner = "client!bo", name = "c", descriptor = "I")
    public static int field274;

    @OriginalMember(owner = "client!bo", name = "k", descriptor = "Lmg;")
    public class113 field282;

    @OriginalMember(owner = "client!bo", name = "l", descriptor = "Lsc;")
    public class19 field283;

    @OriginalMember(owner = "client!bo", name = "e", descriptor = "Lbm;")
    public static class307 field276;

    @OriginalMember(owner = "client!bo", name = "d", descriptor = "Lql;")
    public static class87 field275;

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(B)V", line = 16)
    public static void method112(byte arg0) {
        field281 = null;
        field278 = null;
        field276 = null;
        field275 = null;
        field279 = null;
        if (arg0 < 35) {
            method112((byte) -101);
        }
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(I)V", line = 39)
    public static final void method113(int arg0) {
        field272++;
        if (arg0 != 118) {
            field274 = 82;
        }
        class141.field2333.method1877(-29702);
        class325.field4965.method1877(-29702);
        class85.field1611.method1877(arg0 - 29820);
    }
}
