import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tj")
public class class296 extends class134 {

    @OriginalMember(owner = "client!tj", name = "m", descriptor = "I")
    public static int field4858 = 0;

    @OriginalMember(owner = "client!tj", name = "p", descriptor = "Ljava/lang/String;")
    public static String field4861 = "yellow:";

    @OriginalMember(owner = "client!tj", name = "z", descriptor = "I")
    public static int field4871 = 0;

    @OriginalMember(owner = "client!tj", name = "q", descriptor = "Lkk;")
    public static class254 field4862 = null;

    @OriginalMember(owner = "client!tj", name = "s", descriptor = "Z")
    public static volatile boolean field4864 = false;

    @OriginalMember(owner = "client!tj", name = "v", descriptor = "I")
    public static int field4867 = 0;

    @OriginalMember(owner = "client!tj", name = "F", descriptor = "[Ljava/lang/String;")
    public static String[] field4876 = new String[100];

    @OriginalMember(owner = "client!tj", name = "E", descriptor = "S")
    public static short field4875 = 32767;

    @OriginalMember(owner = "client!tj", name = "n", descriptor = "I")
    public int field4859;

    @OriginalMember(owner = "client!tj", name = "r", descriptor = "I")
    public int field4863;

    @OriginalMember(owner = "client!tj", name = "u", descriptor = "I")
    public static int field4866;

    @OriginalMember(owner = "client!tj", name = "x", descriptor = "I")
    public static int field4869;

    @OriginalMember(owner = "client!tj", name = "A", descriptor = "I")
    public static int field4872;

    @OriginalMember(owner = "client!tj", name = "w", descriptor = "[I")
    public int[] field4868;

    @OriginalMember(owner = "client!tj", name = "y", descriptor = "[I")
    public int[] field4870;

    @OriginalMember(owner = "client!tj", name = "C", descriptor = "[I")
    public int[] field4873;

    @OriginalMember(owner = "client!tj", name = "o", descriptor = "[Lkb;")
    public class54[] field4860;

    @OriginalMember(owner = "client!tj", name = "t", descriptor = "[Lkb;")
    public class54[] field4865;

    @OriginalMember(owner = "client!tj", name = "D", descriptor = "[[[B")
    public byte[][][] field4874;

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(IIIIIII)I")
    public static final int method2059(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = arg1 & 0x3;
        field4869++;
        if ((arg2 & 0x1) == 1) {
            int var8 = arg6;
            arg6 = arg0;
            arg0 = var8;
        }
        if (var7 == 0) {
            return arg5;
        } else if (var7 == 1) {
            return arg4;
        } else {
            int var9 = -10 % ((arg3 + 5) / 46);
            return var7 == 2 ? 7 - arg5 - (arg6 - 1) : -arg0 - -1 + (7 - arg4);
        }
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(ILfa;)V")
    public static final void method2060(int arg0, class273 arg1) {
        if (arg0 == 7) {
            field4866++;
        }
    }

    @OriginalMember(owner = "client!tj", name = "d", descriptor = "(I)Lt;")
    public static final class212 method2061(int arg0) {
        field4872++;
        try {
            return new class23();
        } catch (Throwable var2) {
            if (arg0 != 25666) {
                method2062(-100);
            }
            try {
                return (class212) Class.forName("kh").getDeclaredConstructor().newInstance();
            } catch (Throwable var1) {
                return new class32();
            }
        }
    }

    @OriginalMember(owner = "client!tj", name = "e", descriptor = "(I)V")
    public static void method2062(int arg0) {
        field4876 = null;
        field4862 = null;
        field4861 = null;
        int var1 = -98 % ((arg0 + 16) / 58);
    }
}
