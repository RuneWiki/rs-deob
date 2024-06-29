import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ip")
public class class735 {

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "I")
    public static int field10154 = -1;

    @OriginalMember(owner = "client!ip", name = "b", descriptor = "I")
    public static int field10155;

    @OriginalMember(owner = "client!ip", name = "c", descriptor = "I")
    public static int field10156;

    @OriginalMember(owner = "client!ip", name = "d", descriptor = "[[Z")
    public static boolean[][] field10157;

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(I)V", line = 5)
    public static void method4097(int arg0) {
        if (arg0 == 5907) {
            field10157 = null;
        }
    }

    @OriginalMember(owner = "client!ip", name = "toString", descriptor = "()Ljava/lang/String;", line = 19)
    public final String toString() {
        field10156++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(Lit;Z)V", line = 33)
    public static final void method4098(class672 arg0, boolean arg1) {
        for (int var2 = arg0.field9368; var2 <= arg0.field9371; var2++) {
            for (int var3 = arg0.field9364; var3 <= arg0.field9360; var3++) {
                class46 var4 = class767.field10562[arg0.field5755][var2][var3];
                if (var4 != null) {
                    class48 var5 = var4.field586;
                    class48 var6 = null;
                    while (var5 != null) {
                        if (var5.field605 == arg0) {
                            if (var6 == null) {
                                var4.field586 = var5.field611;
                            } else {
                                var6.field611 = var5.field611;
                            }
                            var5.method344(-120);
                            break;
                        }
                        var6 = var5;
                        var5 = var5.field611;
                    }
                }
            }
        }
        if (!arg1) {
            class393.method2434(arg0);
        }
    }

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(ZI)I", line = 79)
    public static final int method4099(boolean arg0, int arg1) {
        field10155++;
        if (arg0) {
            field10154 = -29;
        }
        return arg1 >>> 8;
    }
}
