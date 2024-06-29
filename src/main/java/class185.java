import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jq")
public class class185 extends class381 {

    @OriginalMember(owner = "client!jq", name = "w", descriptor = "Lre;")
    public static class359 field2691 = new class359();

    @OriginalMember(owner = "client!jq", name = "x", descriptor = "Ljava/lang/String;")
    public static String field2692 = "flash1:";

    @OriginalMember(owner = "client!jq", name = "l", descriptor = "I")
    public int field2680;

    @OriginalMember(owner = "client!jq", name = "n", descriptor = "I")
    public static int field2682;

    @OriginalMember(owner = "client!jq", name = "p", descriptor = "I")
    public static int field2684;

    @OriginalMember(owner = "client!jq", name = "q", descriptor = "I")
    public int field2685;

    @OriginalMember(owner = "client!jq", name = "y", descriptor = "I")
    public static int field2693;

    @OriginalMember(owner = "client!jq", name = "v", descriptor = "Lrk;")
    public static class427 field2690;

    @OriginalMember(owner = "client!jq", name = "m", descriptor = "[I")
    public int[] field2681;

    @OriginalMember(owner = "client!jq", name = "t", descriptor = "[I")
    public int[] field2688;

    @OriginalMember(owner = "client!jq", name = "u", descriptor = "[I")
    public int[] field2689;

    @OriginalMember(owner = "client!jq", name = "r", descriptor = "[Lid;")
    public class242[] field2686;

    @OriginalMember(owner = "client!jq", name = "s", descriptor = "[Lid;")
    public class242[] field2687;

    @OriginalMember(owner = "client!jq", name = "o", descriptor = "[[[B")
    public byte[][][] field2683;

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(ZZ)Z", line = 10)
    public static boolean method1348(boolean arg0, boolean arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!jq", name = "c", descriptor = "(I)V", line = 17)
    public static void method1349(int arg0) {
        field2690 = null;
        field2692 = null;
        if (arg0 > -6) {
            field2692 = null;
        }
        field2691 = null;
    }

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(Lsb;I)V", line = 39)
    public static final void method1350(class362 arg0, int arg1) {
        field2682++;
        boolean var2 = false;
        if (class414.field5793 == arg0.field4986 || arg0.field4980 == -1 || arg0.field4934 != 0) {
            var2 = true;
        } else {
            class209 var3 = class288.method1819(arg0.field4980, (byte) 105);
            if (var3.field2909 || var3.field2894[arg0.field4959] < (arg0.field4985 + 1)) {
                var2 = true;
            }
        }
        if (var2) {
            int var4 = arg0.field4986 - arg0.field4940;
            int var5 = class414.field5793 - arg0.field4940;
            int var6 = arg0.field4961 * 128 + (arg0.method2146(arg1 ^ 0xFFFF9F9A) * 64);
            int var7 = arg0.field4918 * 128 + (arg0.method2146(-120) * 64);
            int var8 = arg0.field4922 * 128 + arg0.method2146(19) * 64;
            int var9 = arg0.field4964 * 128 + arg0.method2146(48) * 64;
            arg0.field3176 = ((var4 - var5) * var6 + var5 * var8) / var4;
            arg0.field3167 = ((var4 - var5) * var7 + var5 * var9) / var4;
        }
        arg0.field5001 = 0;
        if (arg0.field4955 == 0) {
            arg0.method2274((byte) -84, 8192);
        }
        if (arg0.field4955 == 1) {
            arg0.method2274((byte) -104, 12288);
        }
        if (arg0.field4955 == 2) {
            arg0.method2274((byte) -92, 0);
        }
        if (arg0.field4955 == 3) {
            arg0.method2274((byte) -82, 4096);
        }
        if (arg1 != -24589) {
            field2692 = null;
        }
    }
}
