import java.io.IOException;
import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cj")
public class class60 {

    @OriginalMember(owner = "client!cj", name = "b", descriptor = "Lqe;")
    private static class168 field817 = class66.method448("Loaded config", -125);

    @OriginalMember(owner = "client!cj", name = "d", descriptor = "[I")
    public static int[] field819 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @OriginalMember(owner = "client!cj", name = "i", descriptor = "Lqe;")
    public static class168 field824 = field817;

    @OriginalMember(owner = "client!cj", name = "j", descriptor = "Lqe;")
    private static class168 field825 = class66.method448("Ok", -108);

    @OriginalMember(owner = "client!cj", name = "l", descriptor = "[I")
    public static int[] field827 = new int[5];

    @OriginalMember(owner = "client!cj", name = "e", descriptor = "Lqe;")
    public static class168 field820 = class66.method448("(U1", 105);

    @OriginalMember(owner = "client!cj", name = "k", descriptor = "Lqe;")
    public static class168 field826 = field825;

    @OriginalMember(owner = "client!cj", name = "m", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field828 = new BigInteger("9431484119947534773405476242098823416177206852045075556673005859802229236458585051597844837479119770056361726819094346360070592289857694387401749674169083");

    @OriginalMember(owner = "client!cj", name = "n", descriptor = "Lqe;")
    public static class168 field829 = class66.method448("M", -118);

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "I")
    public static int field816;

    @OriginalMember(owner = "client!cj", name = "f", descriptor = "I")
    public static int field821;

    @OriginalMember(owner = "client!cj", name = "g", descriptor = "I")
    public static int field822;

    @OriginalMember(owner = "client!cj", name = "h", descriptor = "I")
    public static int field823;

    @OriginalMember(owner = "client!cj", name = "c", descriptor = "Loe;")
    public static class256 field818;

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(ZI)V")
    public static final void method409(boolean arg0, int arg1) {
        field823++;
        if (class148.field2583 == null) {
            return;
        }
        if (arg1 >= -85) {
            method409(false, 38);
        }
        try {
            class112 var2 = new class112(4);
            var2.method768(arg0 ? 2 : 3, 7295);
            var2.method748(979698984, 0);
            class148.field2583.method1650(12398, 0, var2.field1780, 4);
        } catch (IOException var4) {
            try {
                class148.field2583.method1653(-20);
            } catch (Exception var3) {
            }
            class148.field2583 = null;
            class249.field4313++;
        }
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(BI)Loj;")
    public static final class79 method410(byte arg0, int arg1) {
        if (arg0 >= -24) {
            field829 = null;
        }
        field822++;
        class79 var2 = (class79) class103.field1659.method1499(0, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        class79 var3 = class255.method1682((byte) 98, class212.field3668, false, arg1, class145.field2531);
        if (var3 != null) {
            class103.field1659.method1502((byte) -18, var3, (long) arg1);
        }
        return var3;
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(I)V")
    public static void method411(int arg0) {
        field819 = null;
        field827 = null;
        field818 = null;
        field824 = null;
        field828 = null;
        field820 = null;
        if (arg0 < 61) {
            field819 = null;
        }
        field826 = null;
        field825 = null;
        field817 = null;
        field829 = null;
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(Lmj;I)Z")
    public static final boolean method412(class129 arg0, int arg1) {
        field816++;
        if (~arg0.field2136 == arg1) {
            class182.field3239 = 250;
            return true;
        } else {
            return false;
        }
    }
}
