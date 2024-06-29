import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!od")
public class class436 {

    @OriginalMember(owner = "client!od", name = "d", descriptor = "[Ljava/lang/String;")
    public static String[] field6168 = new String[100];

    @OriginalMember(owner = "client!od", name = "j", descriptor = "[I")
    public static int[] field6174 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!od", name = "k", descriptor = "Lsh;")
    public static class472 field6175;

    @OriginalMember(owner = "client!od", name = "b", descriptor = "I")
    public static int field6166;

    @OriginalMember(owner = "client!od", name = "f", descriptor = "I")
    public static int field6170;

    @OriginalMember(owner = "client!od", name = "g", descriptor = "I")
    public int field6171;

    @OriginalMember(owner = "client!od", name = "i", descriptor = "I")
    public static int field6173;

    @OriginalMember(owner = "client!od", name = "h", descriptor = "Lpm;")
    public class96 field6172;

    @OriginalMember(owner = "client!od", name = "a", descriptor = "Z")
    public static boolean field6165;

    @OriginalMember(owner = "client!od", name = "e", descriptor = "[I")
    public int[] field6169;

    @OriginalMember(owner = "client!od", name = "c", descriptor = "[Ldp;")
    public static class319[] field6167;

    static {
        new class332("Ok", "Okay", "OK", "Ok");
        field6175 = new class472(20, -1);
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(ILre;)Lpa;", line = 6)
    public static final class456 method2540(int arg0, class446 arg1) {
        field6173++;
        arg1.method2628(49152);
        int var2 = arg1.method2628(49152);
        class456 var3 = class240.method1555(var2, 1220);
        var3.field6481 = arg1.method2628(arg0 + 49152);
        int var4 = arg1.method2628(arg0 ^ 0xC000);
        for (int var5 = arg0; var5 < var4; var5++) {
            int var6 = arg1.method2628(49152);
            var3.method210(var6, (byte) 55, arg1);
        }
        var3.method653(true);
        return var3;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(ZLre;)Ljava/lang/String;", line = 44)
    public static final String method2541(boolean arg0, class446 arg1) {
        if (arg0) {
            field6174 = null;
        }
        field6166++;
        return class345.method2126((byte) 78, 32767, arg1);
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(Z)V", line = 60)
    public static void method2542(boolean arg0) {
        field6168 = null;
        field6167 = null;
        field6174 = null;
        if (!arg0) {
            method2542(true);
        }
        field6175 = null;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(IB)V", line = 73)
    public static final void method2543(int arg0, byte arg1) {
        if (arg1 != -46) {
            field6175 = null;
        }
        field6170++;
        class186 var2 = class275.method1789(arg0, (byte) 123, 9);
        var2.method1279((byte) -65);
    }
}
