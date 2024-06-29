import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ec")
public class class24 {

    @OriginalMember(owner = "client!ec", name = "c", descriptor = "J")
    public static long field327 = 0L;

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "I")
    public static int field325;

    @OriginalMember(owner = "client!ec", name = "e", descriptor = "I")
    public static int field329;

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "Lre;")
    public static class228 field326;

    @OriginalMember(owner = "client!ec", name = "d", descriptor = "Lji;")
    public class43 field328;

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(Z)V")
    public static void method202(boolean arg0) {
        field326 = null;
        if (arg0) {
            method202(false);
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(Ljava/lang/String;ILhc;)Lih;")
    public static final class208 method203(String arg0, int arg1, class235 arg2) {
        field325++;
        int var3 = arg2.method1603(-125, arg0);
        if (~var3 == arg1) {
            return new class208(0);
        }
        int[] var4 = arg2.method1611(var3, arg1);
        class208 var5 = new class208(var4.length);
        for (int var6 = 0; var6 < var5.field3233; var6++) {
            class88 var7 = new class88(arg2.method1590(var4[var6], (byte) -25, var3));
            var5.field3242[var6] = var7.method675((byte) 16);
            var5.field3247[var6] = var7.method656(-252);
            var5.field3243[var6] = var7.method641(-1);
            var5.field3240[var6] = var7.method641(-1);
        }
        return var5;
    }
}
