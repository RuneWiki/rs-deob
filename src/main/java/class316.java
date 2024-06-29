import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ab")
public class class316 {

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "Ljava/lang/String;")
    public String field4231;

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "Ljava/lang/String;")
    public String field4230;

    @OriginalMember(owner = "client!ab", name = "e", descriptor = "Ljava/lang/String;")
    public String field4234;

    @OriginalMember(owner = "client!ab", name = "d", descriptor = "Leba;")
    public static class550 field4233 = new class550(98, 9);

    @OriginalMember(owner = "client!ab", name = "g", descriptor = "I")
    public static int field4236 = 0;

    @OriginalMember(owner = "client!ab", name = "c", descriptor = "I")
    public static int field4232;

    @OriginalMember(owner = "client!ab", name = "f", descriptor = "I")
    public static int field4235;

    @OriginalMember(owner = "client!ab", name = "h", descriptor = "I")
    public static int field4237;

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(I)V", line = 3)
    public static final void method1845(int arg0) {
        if (arg0 != 10384) {
            method1847(-45, -55, -28, false, 124, 54);
        }
        class642.field8878.method2172(-15112);
        field4232++;
    }

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "(I)V", line = 19)
    public static void method1846(int arg0) {
        if (arg0 != 9) {
            field4233 = null;
        }
        field4233 = null;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(IIIZII)V", line = 29)
    public static final void method1847(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
        field4235++;
        int var6 = 8 % ((arg1 - 55) / 45);
        long var7 = (long) (arg2 | (arg3 ? Integer.MIN_VALUE : 0));
        class16 var9 = (class16) class253.field3318.method3057(1, var7);
        if (var9 == null) {
            var9 = new class16();
            class253.field3318.method3061(125, var7, var9);
        }
        if (arg5 >= var9.field213.length) {
            int[] var10 = new int[arg5 + 1];
            int[] var11 = new int[arg5 + 1];
            for (int var12 = 0; var12 < var9.field213.length; var12++) {
                var10[var12] = var9.field213[var12];
                var11[var12] = var9.field212[var12];
            }
            for (int var13 = var9.field213.length; var13 < arg5; var13++) {
                var10[var13] = -1;
                var11[var13] = 0;
            }
            var9.field212 = var11;
            var9.field213 = var10;
        }
        var9.field213[arg5] = arg4;
        var9.field212[arg5] = arg0;
    }

    @OriginalMember(owner = "client!ab", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", line = 90)
    public class316(String arg0, String arg1, String arg2) {
        this.field4231 = arg2;
        this.field4230 = arg1;
        this.field4234 = arg0;
    }
}
