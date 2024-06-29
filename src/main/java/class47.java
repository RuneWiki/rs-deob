import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!en")
public class class47 {

    @OriginalMember(owner = "client!en", name = "p", descriptor = "Ljava/lang/String;")
    public static String field727 = "Drop";

    @OriginalMember(owner = "client!en", name = "h", descriptor = "[I")
    public static int[] field719 = new int[5];

    @OriginalMember(owner = "client!en", name = "a", descriptor = "I")
    public static int field712;

    @OriginalMember(owner = "client!en", name = "b", descriptor = "I")
    public int field713;

    @OriginalMember(owner = "client!en", name = "c", descriptor = "I")
    public static int field714;

    @OriginalMember(owner = "client!en", name = "d", descriptor = "I")
    public int field715;

    @OriginalMember(owner = "client!en", name = "e", descriptor = "I")
    public int field716;

    @OriginalMember(owner = "client!en", name = "f", descriptor = "I")
    public int field717;

    @OriginalMember(owner = "client!en", name = "g", descriptor = "I")
    public int field718;

    @OriginalMember(owner = "client!en", name = "i", descriptor = "I")
    public int field720;

    @OriginalMember(owner = "client!en", name = "j", descriptor = "I")
    public int field721;

    @OriginalMember(owner = "client!en", name = "k", descriptor = "I")
    public int field722;

    @OriginalMember(owner = "client!en", name = "l", descriptor = "I")
    public int field723;

    @OriginalMember(owner = "client!en", name = "m", descriptor = "I")
    public int field724;

    @OriginalMember(owner = "client!en", name = "n", descriptor = "I")
    public static int field725;

    @OriginalMember(owner = "client!en", name = "o", descriptor = "I")
    public int field726;

    @OriginalMember(owner = "client!en", name = "q", descriptor = "I")
    public int field728;

    @OriginalMember(owner = "client!en", name = "r", descriptor = "I")
    public static int field729;

    @OriginalMember(owner = "client!en", name = "s", descriptor = "I")
    public int field730;

    @OriginalMember(owner = "client!en", name = "t", descriptor = "I")
    public int field731;

    @OriginalMember(owner = "client!en", name = "u", descriptor = "I")
    public int field732;

    @OriginalMember(owner = "client!en", name = "v", descriptor = "I")
    public static int field733;

    @OriginalMember(owner = "client!en", name = "w", descriptor = "I")
    public int field734;

    @OriginalMember(owner = "client!en", name = "x", descriptor = "I")
    public int field735;

    @OriginalMember(owner = "client!en", name = "y", descriptor = "I")
    public int field736;

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(IB)V", line = 4)
    public static final void method403(int arg0, byte arg1) {
        field712++;
        if (arg1 <= 36) {
            method403(-71, (byte) -94);
        }
        if (class309.method2186(26080, arg0)) {
            class160.method1185((byte) -126, class110.field1789[arg0], -1);
        }
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(I)V", line = 48)
    public static void method404(int arg0) {
        field727 = null;
        field719 = null;
        if (arg0 != 5) {
            method408(59, (byte) -103, -45);
        }
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(BI)V", line = 61)
    public static final void method405(byte arg0, int arg1) {
        class9.field213.method2285(arg1, (byte) -119);
        field725++;
        if (arg0 != 69) {
            field719 = (int[]) null;
        }
        class19.field359.method2285(arg1, (byte) 109);
    }

    @OriginalMember(owner = "client!en", name = "b", descriptor = "(I)V", line = 73)
    public static final void method406(int arg0) {
        field733++;
        if (class118.field1919 != -1) {
            class5.method92(false, -1, -1, class118.field1919);
            class118.field1919 = -1;
        }
        if (arg0 != -31072) {
            field727 = (String) null;
        }
    }

    @OriginalMember(owner = "client!en", name = "b", descriptor = "(BI)V", line = 98)
    public static final void method407(byte arg0, int arg1) {
        class147.field2416.method2285(arg1, (byte) 98);
        if (arg0 != -123) {
            method407((byte) 109, -57);
        }
        class18.field347.method2285(arg1, (byte) -6);
        field714++;
        class13.field286.method2285(arg1, (byte) -52);
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(IBI)V", line = 111)
    public static final void method408(int arg0, byte arg1, int arg2) {
        class323.field5059 = class155.field2520[arg2][arg0].field1164;
        field729++;
        class151.field2473 = class155.field2520[arg2][arg0].field1150;
        class56.field855 = class155.field2520[arg2][arg0].field1161;
        if (arg1 != 35) {
            field719 = (int[]) null;
        }
        class261.method1813((float) class323.field5059, (float) class151.field2473, (float) class56.field855);
    }
}
