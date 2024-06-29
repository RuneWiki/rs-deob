import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wn")
public class class672 {

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "I")
    public static int field9659;

    @OriginalMember(owner = "client!wn", name = "b", descriptor = "I")
    public static int field9660;

    @OriginalMember(owner = "client!wn", name = "c", descriptor = "I")
    public static int field9661;

    @OriginalMember(owner = "client!wn", name = "d", descriptor = "Ljn;")
    public static class668 field9662;

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(ZI)Lsb;")
    public static final class264 method3826(boolean arg0, int arg1) {
        field9661++;
        class264[] var2 = class160.method1007(-256);
        if (!arg0) {
            return null;
        }
        for (int var3 = 0; var3 < var2.length; var3++) {
            class264 var4 = var2[var3];
            if (var4.field3632 == arg1) {
                return var4;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(I)V")
    public static void method3827(int arg0) {
        field9662 = null;
        if (arg0 <= 30) {
            field9662 = null;
        }
    }
}
