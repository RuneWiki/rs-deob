import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cj")
public class class317 extends class279 {

    @OriginalMember(owner = "client!cj", name = "z", descriptor = "[B")
    public byte[] field5016;

    @OriginalMember(owner = "client!cj", name = "x", descriptor = "I")
    public static int field5014 = 0;

    @OriginalMember(owner = "client!cj", name = "y", descriptor = "Lrm;")
    public static class184 field5015 = new class184(500);

    @OriginalMember(owner = "client!cj", name = "A", descriptor = "I")
    public static int field5017 = 0;

    @OriginalMember(owner = "client!cj", name = "C", descriptor = "Z")
    public static boolean field5019 = true;

    @OriginalMember(owner = "client!cj", name = "F", descriptor = "Ljava/lang/String;")
    public static String field5022 = "Continue";

    @OriginalMember(owner = "client!cj", name = "E", descriptor = "Ljava/lang/String;")
    public static String field5021 = "Loading defaults - ";

    @OriginalMember(owner = "client!cj", name = "u", descriptor = "I")
    public static int field5011;

    @OriginalMember(owner = "client!cj", name = "v", descriptor = "I")
    public static int field5012;

    @OriginalMember(owner = "client!cj", name = "w", descriptor = "I")
    public static int field5013;

    @OriginalMember(owner = "client!cj", name = "B", descriptor = "I")
    public static int field5018;

    @OriginalMember(owner = "client!cj", name = "D", descriptor = "Lgb;")
    public static class88 field5020;

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "([[II)V", line = 6)
    public static final void method2222(int[][] arg0, int arg1) {
        if (arg1 == 500) {
            class284.field4402 = arg0;
            field5013++;
        }
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(Lti;B)V", line = 17)
    public static final void method2223(class197 arg0, byte arg1) {
        field5012++;
        long var2 = 0L;
        int var4 = -1;
        int var5 = 0;
        int var6 = 0;
        if (arg1 > -41) {
            return;
        }
        if (arg0.field3147 == 0) {
            var2 = class204.method1506(arg0.field3155, arg0.field3158, arg0.field3149);
        }
        if (arg0.field3147 == 1) {
            var2 = class120.method860(arg0.field3155, arg0.field3158, arg0.field3149);
        }
        if (arg0.field3147 == 2) {
            var2 = class20.method203(arg0.field3155, arg0.field3158, arg0.field3149);
        }
        if (arg0.field3147 == 3) {
            var2 = class145.method1075(arg0.field3155, arg0.field3158, arg0.field3149);
        }
        if (var2 != 0L) {
            var5 = ((int) var2 & 0x7F902) >> 14;
            var6 = (int) var2 >> 20 & 0x3;
            var4 = Integer.MAX_VALUE & (int) (var2 >>> 32);
        }
        arg0.field3141 = var6;
        arg0.field3150 = var4;
        arg0.field3143 = var5;
    }

    @OriginalMember(owner = "client!cj", name = "e", descriptor = "(I)Lvf;", line = 61)
    public static final class66 method2224(int arg0) {
        field5011++;
        int var1 = -54 / ((arg0 + 37) / 52);
        try {
            return (class66) Class.forName("ei").getDeclaredConstructor().newInstance();
        } catch (Throwable var3) {
            return null;
        }
    }

    @OriginalMember(owner = "client!cj", name = "b", descriptor = "(B)V", line = 79)
    public static void method2225(byte arg0) {
        field5020 = null;
        field5022 = null;
        field5015 = null;
        if (arg0 <= 100) {
            method2223((class197) null, (byte) 69);
        }
        field5021 = null;
    }

    @OriginalMember(owner = "client!cj", name = "b", descriptor = "(III)Lv;", line = 94)
    public static final class263 method2226(int arg0, int arg1, int arg2) {
        class124 var3 = class83.field1138[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        }
        for (int var4 = 0; var4 < var3.field1798; var4++) {
            class263 var5 = var3.field1783[var4];
            if ((var5.field4122 >> 29 & 0x3L) == 2L && var5.field4124 == arg1 && var5.field4127 == arg2) {
                class326.method2290(var5);
                return var5;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!cj", name = "<init>", descriptor = "([B)V", line = 125)
    public class317(byte[] arg0) {
        this.field5016 = arg0;
    }
}
