import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qn")
public class class196 extends class179 {

    @OriginalMember(owner = "client!qn", name = "u", descriptor = "I")
    public static int field2868 = 0;

    @OriginalMember(owner = "client!qn", name = "w", descriptor = "Z")
    public static boolean field2870 = true;

    @OriginalMember(owner = "client!qn", name = "v", descriptor = "[I")
    public static int[] field2869 = new int[50];

    @OriginalMember(owner = "client!qn", name = "s", descriptor = "I")
    public static int field2866;

    @OriginalMember(owner = "client!qn", name = "x", descriptor = "I")
    public static int field2871;

    @OriginalMember(owner = "client!qn", name = "y", descriptor = "I")
    public static int field2872;

    @OriginalMember(owner = "client!qn", name = "z", descriptor = "Lcj;")
    public static class181 field2873;

    @OriginalMember(owner = "client!qn", name = "t", descriptor = "[Lbj;")
    public static class251[] field2867;

    @OriginalMember(owner = "client!qn", name = "A", descriptor = "[[S")
    public static short[][] field2874;

    @OriginalMember(owner = "client!qn", name = "e", descriptor = "(B)V", line = 5)
    public static void method1503(byte arg0) {
        field2873 = null;
        field2874 = null;
        if (arg0 < 109) {
            method1505((class174) null, -110);
        }
        field2869 = null;
        field2867 = null;
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(ILjava/lang/String;)V", line = 38)
    public static final void method1504(int arg0, String arg1) {
        class170.field2531 = arg1;
        field2871++;
        if (class188.field2783.field2639 == null) {
            return;
        }
        try {
            String var2 = class188.field2783.field2639.getParameter("cookieprefix");
            String var3 = class188.field2783.field2639.getParameter("cookiehost");
            String var4 = var2 + "settings=" + arg1 + "; version=1; path=/; domain=" + var3;
            String var5;
            if (arg1.length() == 0) {
                var5 = var4 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
            } else {
                var5 = var4 + "; Expires=" + class358.method2298(class10.method63(-21149) + 94608000000L, true) + "; Max-Age=" + 94608000L;
            }
            class412.method2589("document.cookie=\"" + var5 + "\"", -1947, class188.field2783.field2639);
        } catch (Throwable var6) {
        }
        if (arg0 > -29) {
            field2868 = -13;
        }
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(Ldp;I)V", line = 81)
    public static final void method1505(class174 arg0, int arg1) {
        field2866++;
        class231.field3375 = arg0;
        int var2 = 34 % ((-arg1 - 61) / 55);
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(Lec;II)V", line = 91)
    public static final void method1506(class37 arg0, int arg1, int arg2) {
        if (arg1 != 15) {
            return;
        }
        if (class76.field1303 != null) {
            try {
                class76.field1303.method482(0L, (byte) 20);
                class76.field1303.method484(arg0.field578, 24, arg2, arg1 ^ 0x4F);
            } catch (Exception var3) {
            }
        }
        field2872++;
    }
}
