import java.io.File;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aa")
public abstract class class514 {

    @OriginalMember(owner = "client!aa", name = "c", descriptor = "Lvl;")
    public static class15 field7016 = new class15(0, 4);

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "I")
    public static int field7015;

    @OriginalMember(owner = "client!aa", name = "d", descriptor = "I")
    public static int field7017;

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "Lgj;")
    public static class662 field7014;

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(B)V", line = 11)
    public static final void method2943(byte arg0) {
        if (arg0 > -118) {
            return;
        }
        for (int var1 = 0; var1 < class554.field7832.length; var1++) {
            for (int var2 = 0; var2 < class554.field7832[0].length; var2++) {
                for (int var3 = 0; var3 < class554.field7832[0][0].length; var3++) {
                    class554.field7832[var1][var2][var3] = 0;
                }
            }
        }
        field7017++;
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(I)V", line = 47)
    public static void method2944(int arg0) {
        field7014 = null;
        field7016 = null;
        if (arg0 != 1161) {
            method2943((byte) -7);
        }
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(Ljava/io/File;ILjava/lang/String;)V", line = 58)
    public static final void method2945(File arg0, int arg1, String arg2) {
        if (arg1 == 0) {
            class488.field6591.put(arg2, arg0);
            field7015++;
        }
    }
}
