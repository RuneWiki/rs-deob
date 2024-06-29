import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tn")
public class class190 extends class91 {

    @OriginalMember(owner = "client!tn", name = "k", descriptor = "[I")
    public static int[] field2848 = new int[1];

    @OriginalMember(owner = "client!tn", name = "l", descriptor = "I")
    public static int field2849;

    @OriginalMember(owner = "client!tn", name = "m", descriptor = "I")
    public int field2850;

    @OriginalMember(owner = "client!tn", name = "n", descriptor = "I")
    public int field2851;

    @OriginalMember(owner = "client!tn", name = "o", descriptor = "I")
    public int field2852;

    @OriginalMember(owner = "client!tn", name = "p", descriptor = "I")
    public int field2853;

    @OriginalMember(owner = "client!tn", name = "q", descriptor = "I")
    public static int field2854;

    @OriginalMember(owner = "client!tn", name = "r", descriptor = "I")
    public static int field2855;

    @OriginalMember(owner = "client!tn", name = "s", descriptor = "I")
    public int field2856;

    @OriginalMember(owner = "client!tn", name = "u", descriptor = "I")
    public int field2858;

    @OriginalMember(owner = "client!tn", name = "t", descriptor = "Ljava/lang/String;")
    public String field2857;

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(B[B)V", line = 9)
    public static final void method1365(byte arg0, byte[] arg1) {
        int var2 = -69 % ((arg0 - 2) / 43);
        field2849++;
        class431 var3 = new class431(arg1);
        boolean var4 = false;
        while (true) {
            while (true) {
                int var5 = var3.method2557(14929);
                if (var5 == 0) {
                    if (var4) {
                        return;
                    }
                    if (class239.field3460 == null) {
                        class255.field3646 = 4;
                        class773.field10642 = new int[4];
                        class239.field3460 = new int[4];
                    }
                    for (int var6 = 0; var6 < class239.field3460.length; var6++) {
                        class239.field3460[var6] = 0;
                        class773.field10642[var6] = var6 * 20;
                    }
                    return;
                }
                if (var5 == 1) {
                    if (class239.field3460 == null) {
                        class773.field10642 = new int[4];
                        class239.field3460 = new int[4];
                        class255.field3646 = 4;
                    }
                    for (int var7 = 0; var7 < class239.field3460.length; var7++) {
                        class239.field3460[var7] = var3.method2528((byte) 89);
                        class773.field10642[var7] = var3.method2528((byte) 89);
                    }
                    var4 = true;
                } else if (var5 == 2) {
                    class315.field4466 = var3.method2565((byte) -95);
                } else if (var5 == 3) {
                    class255.field3646 = var3.method2557(14929);
                    class773.field10642 = new int[class255.field3646];
                    class239.field3460 = new int[class255.field3646];
                }
            }
        }
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(I)V", line = 90)
    public static void method1366(int arg0) {
        if (arg0 != 3) {
            field2848 = null;
        }
        field2848 = null;
    }
}
