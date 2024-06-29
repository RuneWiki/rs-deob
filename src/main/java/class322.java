import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!en")
public class class322 {

    @OriginalMember(owner = "client!en", name = "a", descriptor = "Lkg;")
    public static class275 field4150 = new class275(93, 3);

    @OriginalMember(owner = "client!en", name = "c", descriptor = "I")
    public static int field4152 = 0;

    @OriginalMember(owner = "client!en", name = "b", descriptor = "I")
    public static int field4151;

    @OriginalMember(owner = "client!en", name = "d", descriptor = "I")
    public static int field4153;

    @OriginalMember(owner = "client!en", name = "e", descriptor = "I")
    public static int field4154;

    @OriginalMember(owner = "client!en", name = "toString", descriptor = "()Ljava/lang/String;", line = 6)
    public final String toString() {
        field4153++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(Lii;Z)V", line = 16)
    public static final void method1890(class556 arg0, boolean arg1) {
        for (int var2 = arg0.field7734; var2 <= arg0.field7741; var2++) {
            for (int var3 = arg0.field7746; var3 <= arg0.field7744; var3++) {
                class14 var4 = class197.field2689[arg0.field5796][var2][var3];
                if (var4 != null) {
                    class621 var5 = var4.field289;
                    class621 var6 = null;
                    while (var5 != null) {
                        if (var5.field8559 == arg0) {
                            if (var6 == null) {
                                var4.field289 = var5.field8560;
                            } else {
                                var6.field8560 = var5.field8560;
                            }
                            var5.method3491((byte) -67);
                            break;
                        }
                        var6 = var5;
                        var5 = var5.field8560;
                    }
                }
            }
        }
        if (!arg1) {
            class501.method2938(arg0);
        }
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(BI)Z", line = 70)
    public static final boolean method1891(byte arg0, int arg1) {
        field4154++;
        int var2 = arg0 & 0xFF;
        if (var2 == 0) {
            return false;
        } else {
            int var3 = -97 / ((-arg1 - 32) / 37);
            return var2 < 128 || var2 >= 160 || class378.field4835[var2 - 128] != '\u0000';
        }
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(I)V", line = 98)
    public static void method1892(int arg0) {
        if (arg0 != 3) {
            field4150 = null;
        }
        field4150 = null;
    }
}
