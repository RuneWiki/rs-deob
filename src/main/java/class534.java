import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ms")
public class class534 {

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "Z")
    public static boolean field7853 = false;

    @OriginalMember(owner = "client!ms", name = "c", descriptor = "Lho;")
    public static class103 field7855 = new class103(58, 2);

    @OriginalMember(owner = "client!ms", name = "d", descriptor = "Lho;")
    public static class103 field7856 = new class103(55, 4);

    @OriginalMember(owner = "client!ms", name = "b", descriptor = "I")
    public static int field7854;

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "(B)V")
    public static void method3166(byte arg0) {
        field7856 = null;
        field7855 = null;
        int var1 = -74 / ((arg0 - 21) / 36);
    }

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "(I)V")
    public static final void method3167(int arg0) {
        if (arg0 > -49) {
            method3168(-125, -127);
        }
        field7854++;
        int var1 = 0;
        for (int var2 = 0; var2 < class308.field4128; var2++) {
            for (int var3 = 0; var3 < class426.field6200; var3++) {
                if (class89.method491(class186.field2421, -1, var1, var2, true, var3)) {
                    var1++;
                }
                if (var1 >= 512) {
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "(II)V")
    public static final void method3168(int arg0, int arg1) {
        class498 var2 = class186.field2421[0][arg0][arg1];
        for (int var3 = 0; var3 < 3; var3++) {
            class498 var4 = class186.field2421[var3][arg0][arg1] = class186.field2421[var3 + 1][arg0][arg1];
            if (var4 != null) {
                var4.field7269--;
                for (class192 var5 = var4.field7263; var5 != null; var5 = var5.field2469) {
                    class279 var6 = var5.field2466;
                    if (var6.field3698 == arg0 && var6.field3688 == arg1) {
                        var6.field3695--;
                    }
                }
            }
        }
        if (class186.field2421[0][arg0][arg1] == null) {
            class186.field2421[0][arg0][arg1] = new class498(0, arg0, arg1);
            class186.field2421[0][arg0][arg1].field7262 = 1;
        }
        class186.field2421[0][arg0][arg1].field7276 = var2;
        class186.field2421[3][arg0][arg1] = null;
    }
}
