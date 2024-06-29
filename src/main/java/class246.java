import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wg")
public class class246 extends class219 {

    @OriginalMember(owner = "client!wg", name = "s", descriptor = "[Lkj;")
    public static class119[] field4506 = new class119[27];

    @OriginalMember(owner = "client!wg", name = "v", descriptor = "Li;")
    private static class88 field4509 = class208.method1425(105, "Please try again)3");

    @OriginalMember(owner = "client!wg", name = "w", descriptor = "Li;")
    public static class88 field4510 = field4509;

    @OriginalMember(owner = "client!wg", name = "t", descriptor = "I")
    public static int field4507;

    @OriginalMember(owner = "client!wg", name = "u", descriptor = "I")
    public static int field4508;

    @OriginalMember(owner = "client!wg", name = "x", descriptor = "I")
    public static int field4511;

    @OriginalMember(owner = "client!wg", name = "y", descriptor = "[I")
    public static int[] field4512;

    @OriginalMember(owner = "client!wg", name = "d", descriptor = "(B)V")
    public static void method1609(byte arg0) {
        field4509 = null;
        int var1 = 60 % ((83 - arg0) / 42);
        field4510 = null;
        field4512 = null;
        field4506 = null;
    }

    @OriginalMember(owner = "client!wg", name = "b", descriptor = "(III)I")
    public static final int method1610(int arg0, int arg1, int arg2) {
        field4507++;
        class177 var3 = (class177) class64.field1163.method1051(-1, (long) arg0);
        int var4 = 23 / ((arg1 + 62) / 43);
        if (var3 == null) {
            return 0;
        } else if (arg2 == -1) {
            return 0;
        } else {
            int var5 = 0;
            for (int var6 = 0; var6 < var3.field3553.length; var6++) {
                if (var3.field3555[var6] == arg2) {
                    var5 += var3.field3553[var6];
                }
            }
            return var5;
        }
    }
}
