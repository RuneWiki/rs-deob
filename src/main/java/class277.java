import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dk")
public class class277 {

    @OriginalMember(owner = "client!dk", name = "g", descriptor = "Loa;")
    public static class99 field4872 = class221.method1463(2844, "::qa_op_test");

    @OriginalMember(owner = "client!dk", name = "h", descriptor = "Loa;")
    public static class99 field4873 = class221.method1463(2844, "http:)4)4");

    @OriginalMember(owner = "client!dk", name = "j", descriptor = "[I")
    public static int[] field4875 = new int[25];

    @OriginalMember(owner = "client!dk", name = "c", descriptor = "Lbg;")
    public static class237 field4868 = new class237(32);

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "I")
    public static int field4866;

    @OriginalMember(owner = "client!dk", name = "b", descriptor = "I")
    public static int field4867;

    @OriginalMember(owner = "client!dk", name = "d", descriptor = "I")
    public static int field4869;

    @OriginalMember(owner = "client!dk", name = "f", descriptor = "I")
    public static int field4871;

    @OriginalMember(owner = "client!dk", name = "i", descriptor = "I")
    public static int field4874;

    @OriginalMember(owner = "client!dk", name = "e", descriptor = "Ltf;")
    public static class107 field4870;

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(IIII)Lud;")
    public static final class2 method1831(int arg0, int arg1, int arg2, int arg3) {
        field4867++;
        class2 var4 = new class2();
        if (arg0 != -21190) {
            method1831(56, -58, -55, -63);
        }
        var4.field15 = arg1;
        var4.field12 = arg2;
        class57.field959.method1544((byte) 102, (long) arg3, var4);
        class102.method717(13654, arg2);
        class107 var5 = class22.method131(arg3, 1538872048);
        if (var5 != null) {
            class238.method1555(var5, 10555);
        }
        if (class137.field2411 != null) {
            class238.method1555(class137.field2411, 10555);
            class137.field2411 = null;
        }
        int var6 = class258.field4497;
        for (int var7 = 0; var7 < var6; var7++) {
            if (class53.method366(20, class258.field4502[var7])) {
                class67.method443(arg0 - 10865, var7);
            }
        }
        if (class258.field4497 == 1) {
            class244.field4209 = false;
            class62.method408(class90.field1539, class217.field3769, 113, class284.field4938, class238.field4114);
        } else {
            class62.method408(class90.field1539, class217.field3769, arg0 ^ 0xFFFFAD57, class284.field4938, class238.field4114);
            int var8 = class228.field3950.method480(class23.field333);
            for (int var9 = 0; var9 < class258.field4497; var9++) {
                int var10 = class228.field3950.method480(class165.method1111(var9, -1));
                if (var8 < var10) {
                    var8 = var10;
                }
            }
            class217.field3769 = class258.field4497 * 15 + 22;
            class238.field4114 = var8 + 8;
        }
        if (var5 != null) {
            class216.method1446(false, (byte) 84, var5);
        }
        class123.method814(arg2, 0);
        if (class9.field75 != -1) {
            class220.method1460(1, (byte) 119, class9.field75);
        }
        return var4;
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(B)V")
    public static void method1832(byte arg0) {
        int var1 = 41 / ((arg0 + 1) / 40);
        field4873 = null;
        field4870 = null;
        field4875 = null;
        field4868 = null;
        field4872 = null;
    }
}
