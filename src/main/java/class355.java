import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wt")
public class class355 {

    @OriginalMember(owner = "client!wt", name = "d", descriptor = "Lrr;")
    public static class280 field5544 = new class280(10, 2, 2, 0);

    @OriginalMember(owner = "client!wt", name = "b", descriptor = "I")
    public static int field5542;

    @OriginalMember(owner = "client!wt", name = "c", descriptor = "I")
    public static int field5543;

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "[[[J")
    public static long[][][] field5541;

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "(ILap;B)V", line = 5)
    public static final void method2279(int arg0, class340 arg1, byte arg2) {
        class299.field4808 = 0;
        field5542++;
        class285.field4669 = false;
        class187.method1270((byte) 118, arg1);
        class250.method1696(-20950, arg1);
        if (class285.field4669) {
            System.out.println("---endgpp---");
        }
        if (arg2 != 0) {
            method2280((byte) -126, -102, 5);
        }
        if (arg1.field301 != arg0) {
            throw new RuntimeException("gpi1 pos:" + arg1.field301 + " psize:" + arg0);
        }
    }

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "(BII)Z", line = 25)
    public static final boolean method2280(byte arg0, int arg1, int arg2) {
        int var3 = 23 % ((32 - arg0) / 38);
        field5543++;
        return (class192.field2982[1][arg2][arg1] & 0x2) != 0;
    }

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "(Z)V", line = 43)
    public static void method2281(boolean arg0) {
        if (arg0) {
            method2281(false);
        }
        field5544 = null;
        field5541 = null;
    }

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "(Lol;)V", line = 57)
    public static final void method2282(class290 arg0) {
        for (int var1 = arg0.field4718; var1 <= arg0.field4722; var1++) {
            for (int var2 = arg0.field4717; var2 <= arg0.field4713; var2++) {
                class465 var3 = class66.field977[arg0.field4720][var1][var2];
                if (var3 != null) {
                    class1 var4 = var3.field6898;
                    class1 var5 = null;
                    while (var4 != null) {
                        if (var4.field9 == arg0) {
                            if (var5 == null) {
                                var3.field6898 = var4.field2;
                            } else {
                                var5.field2 = var4.field2;
                            }
                            var4.method3(false);
                            break;
                        }
                        var5 = var4;
                        var4 = var4.field2;
                    }
                    var3.field6900 = 0;
                    for (class1 var6 = var3.field6898; var6 != null; var6 = var6.field2) {
                        var3.field6900 = (byte) (var3.field6900 | var6.field4);
                    }
                }
            }
        }
    }
}
