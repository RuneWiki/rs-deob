import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gg")
public class class312 extends class145 {

    @OriginalMember(owner = "client!gg", name = "J", descriptor = "I")
    public static int field4218 = -1;

    @OriginalMember(owner = "client!gg", name = "L", descriptor = "I")
    public static int field4220 = 0;

    @OriginalMember(owner = "client!gg", name = "K", descriptor = "I")
    public static int field4219 = -1;

    @OriginalMember(owner = "client!gg", name = "I", descriptor = "I")
    public static int field4217 = 10;

    @OriginalMember(owner = "client!gg", name = "P", descriptor = "I")
    public static int field4224 = -1;

    @OriginalMember(owner = "client!gg", name = "G", descriptor = "Lon;")
    public static class35 field4215 = new class35(64);

    @OriginalMember(owner = "client!gg", name = "F", descriptor = "I")
    public static int field4214;

    @OriginalMember(owner = "client!gg", name = "M", descriptor = "I")
    public static int field4221;

    @OriginalMember(owner = "client!gg", name = "O", descriptor = "I")
    public static int field4223;

    @OriginalMember(owner = "client!gg", name = "Q", descriptor = "I")
    public static int field4225;

    @OriginalMember(owner = "client!gg", name = "H", descriptor = "Lrk;")
    public static class427 field4216;

    @OriginalMember(owner = "client!gg", name = "N", descriptor = "Lrk;")
    public static class427 field4222;

    @OriginalMember(owner = "client!gg", name = "e", descriptor = "(I)V", line = 4)
    public static final void method1992(int arg0) {
        class417.field5851.method1810(arg0 + 54);
        field4214++;
        int var1 = class417.field5851.method1808(8, -11904);
        if (class221.field3055 > var1) {
            for (int var2 = var1; var2 < class221.field3055; var2++) {
                class26.field461[class298.field4018++] = class209.field2891[var2];
            }
        }
        if (class221.field3055 < var1) {
            throw new RuntimeException("gnpov1");
        }
        class221.field3055 = arg0;
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = class209.field2891[var3];
            class127 var5 = class298.field4012[var4];
            int var6 = class417.field5851.method1808(1, -11904);
            if (var6 == 0) {
                class209.field2891[class221.field3055++] = var4;
                var5.field4937 = class414.field5793;
            } else {
                int var7 = class417.field5851.method1808(2, -11904);
                if (var7 == 0) {
                    class209.field2891[class221.field3055++] = var4;
                    var5.field4937 = class414.field5793;
                    class344.field4664[class166.field2464++] = var4;
                } else if (var7 == 1) {
                    class209.field2891[class221.field3055++] = var4;
                    var5.field4937 = class414.field5793;
                    int var8 = class417.field5851.method1808(3, -11904);
                    var5.method2271(arg0 + 22419, var8, 1);
                    int var9 = class417.field5851.method1808(1, arg0 ^ 0xFFFFD180);
                    if (var9 == 1) {
                        class344.field4664[class166.field2464++] = var4;
                    }
                } else if (var7 == 2) {
                    class209.field2891[class221.field3055++] = var4;
                    var5.field4937 = class414.field5793;
                    if (class417.field5851.method1808(1, -11904) == 1) {
                        int var11 = class417.field5851.method1808(3, -11904);
                        var5.method2271(22419, var11, 2);
                        int var12 = class417.field5851.method1808(3, -11904);
                        var5.method2271(arg0 + 22419, var12, 2);
                    } else {
                        int var10 = class417.field5851.method1808(3, -11904);
                        var5.method2271(arg0 ^ 0x5793, var10, 0);
                    }
                    int var13 = class417.field5851.method1808(1, -11904);
                    if (var13 == 1) {
                        class344.field4664[class166.field2464++] = var4;
                    }
                } else if (var7 == 3) {
                    class26.field461[class298.field4018++] = var4;
                }
            }
        }
    }

    @OriginalMember(owner = "client!gg", name = "f", descriptor = "(I)V", line = 123)
    public static void method1993(int arg0) {
        field4222 = null;
        field4215 = null;
        if (arg0 == 1) {
            field4216 = null;
        }
    }

    @OriginalMember(owner = "client!gg", name = "<init>", descriptor = "()V", line = 149)
    public class312() {
        super(0, true);
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(II)[I", line = 152)
    public final int[] method3(int arg0, int arg1) {
        int var3 = -37 / ((arg1 - 16) / 49);
        field4223++;
        return class229.field3181;
    }

    @OriginalMember(owner = "client!gg", name = "b", descriptor = "(II)V", line = 167)
    public static final void method1994(int arg0, int arg1) {
        int var2 = 79 / ((-arg1 - 46) / 58);
        field4225++;
        class329 var3 = (class329) class19.field374.method614(-113, (long) arg0);
        if (var3 != null) {
            var3.method2367(5);
        }
    }
}
