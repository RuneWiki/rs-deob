import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tc")
public class class135 {

    @OriginalMember(owner = "client!tc", name = "l", descriptor = "I")
    public int field3166 = -1;

    @OriginalMember(owner = "client!tc", name = "g", descriptor = "Ltd;")
    public static class136 field3161 = class145.method1172("::qa_op_test", 45);

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "Ltd;")
    private static class136 field3155 = class145.method1172("Loading wordpack )2 ", 45);

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "Ltd;")
    public static class136 field3156 = field3155;

    @OriginalMember(owner = "client!tc", name = "j", descriptor = "Ltd;")
    public static class136 field3164 = class145.method1172("Clientscript error in: ", 45);

    @OriginalMember(owner = "client!tc", name = "m", descriptor = "Ltd;")
    public static class136 field3167 = class145.method1172("<)4col> x", 45);

    @OriginalMember(owner = "client!tc", name = "d", descriptor = "I")
    public static int field3158;

    @OriginalMember(owner = "client!tc", name = "f", descriptor = "I")
    public static int field3160;

    @OriginalMember(owner = "client!tc", name = "i", descriptor = "I")
    public static int field3163;

    @OriginalMember(owner = "client!tc", name = "c", descriptor = "Lmd;")
    public static class87 field3157;

    @OriginalMember(owner = "client!tc", name = "k", descriptor = "Lba;")
    public class9 field3165;

    @OriginalMember(owner = "client!tc", name = "h", descriptor = "[I")
    public static int[] field3162;

    @OriginalMember(owner = "client!tc", name = "n", descriptor = "[I")
    public int[] field3168;

    @OriginalMember(owner = "client!tc", name = "e", descriptor = "[Ltd;")
    public class136[] field3159;

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(B)Lsf;")
    public static final class131 method1087(byte arg0) {
        field3163++;
        try {
            if (arg0 != 100) {
                method1088((byte) -34);
            }
            return (class131) Class.forName("ib").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return new class41();
        }
    }

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "(B)V")
    public static void method1088(byte arg0) {
        if (arg0 != 61) {
            method1088((byte) -27);
        }
        field3164 = null;
        field3157 = null;
        field3156 = null;
        field3167 = null;
        field3162 = null;
        field3155 = null;
        field3161 = null;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(IIBII)V")
    public static final void method1089(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        class79 var5 = (class79) class88.field2088.method109(125, (long) arg0);
        field3158++;
        if (var5 == null) {
            var5 = new class79();
            class88.field2088.method112(var5, (byte) 3, (long) arg0);
        }
        if (var5.field1806.length <= arg4) {
            int[] var6 = new int[arg4 + 1];
            int[] var7 = new int[arg4 + 1];
            for (int var8 = 0; var8 < var5.field1806.length; var8++) {
                var7[var8] = var5.field1806[var8];
                var6[var8] = var5.field1809[var8];
            }
            for (int var9 = var5.field1806.length; var9 < arg4; var9++) {
                var7[var9] = -1;
                var6[var9] = 0;
            }
            var5.field1809 = var6;
            var5.field1806 = var7;
        }
        var5.field1806[arg4] = arg3;
        var5.field1809[arg4] = arg1;
        if (arg2 < 109) {
            field3167 = null;
        }
    }
}
