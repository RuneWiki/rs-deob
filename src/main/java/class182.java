import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ed")
public class class182 {

    @OriginalMember(owner = "client!ed", name = "d", descriptor = "I")
    public static int field2883 = 0;

    @OriginalMember(owner = "client!ed", name = "c", descriptor = "Z")
    public static boolean field2882 = true;

    @OriginalMember(owner = "client!ed", name = "f", descriptor = "[C")
    public static char[] field2885 = new char[128];

    @OriginalMember(owner = "client!ed", name = "g", descriptor = "Llf;")
    public static class211 field2886 = new class211(5);

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "I")
    public static int field2881;

    @OriginalMember(owner = "client!ed", name = "e", descriptor = "I")
    public static int field2884;

    @OriginalMember(owner = "client!ed", name = "h", descriptor = "I")
    public static int field2887;

    @OriginalMember(owner = "client!ed", name = "i", descriptor = "I")
    public static int field2888;

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "[I")
    public static int[] field2880;

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(Ldl;BLjava/lang/String;)Lph;")
    public static final class78 method1273(class123 arg0, byte arg1, String arg2) {
        field2881++;
        int var3 = arg0.method813(arg2, -1);
        if (var3 == -1) {
            return new class78(0);
        }
        int[] var4 = arg0.method817((byte) 127, var3);
        int var5 = -10 / ((arg1 - 53) / 63);
        class78 var6 = new class78(var4.length);
        for (int var7 = 0; var7 < var6.field1110; var7++) {
            class25 var8 = new class25(arg0.method807((byte) 116, var4[var7], var3));
            var6.field1112[var7] = var8.method189(false);
            var6.field1100[var7] = var8.method188(-112);
            var6.field1105[var7] = (short) var8.method190(-3);
            var6.field1096[var7] = (short) var8.method190(-3);
            var6.field1095[var7] = var8.method214((byte) 44);
        }
        return var6;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(IILdl;I)Lhc;")
    public static final class229 method1274(int arg0, int arg1, class123 arg2, int arg3) {
        field2884++;
        int var4 = -53 / ((-arg1 - 78) / 44);
        return class214.method1445((byte) 84, arg2, arg0, arg3) ? class34.method275((byte) -127) : null;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(I)V")
    public static void method1275(int arg0) {
        if (arg0 != -25503) {
            field2886 = null;
        }
        field2885 = null;
        field2880 = null;
        field2886 = null;
    }
}
