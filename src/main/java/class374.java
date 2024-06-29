import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!we")
public class class374 extends class513 {

    @OriginalMember(owner = "client!we", name = "n", descriptor = "Ljava/lang/String;")
    public String field5035;

    @OriginalMember(owner = "client!we", name = "k", descriptor = "[I")
    public static int[] field5032 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

    @OriginalMember(owner = "client!we", name = "l", descriptor = "Ljk;")
    public static class585 field5033 = new class585(24, 7);

    @OriginalMember(owner = "client!we", name = "m", descriptor = "I")
    public static int field5034;

    @OriginalMember(owner = "client!we", name = "j", descriptor = "J")
    public static long field5031;

    @OriginalMember(owner = "client!we", name = "b", descriptor = "(III)Z", line = 3)
    public static final boolean method2177(int arg0, int arg1, int arg2) {
        field5034++;
        if (arg0 <= 38) {
            field5033 = null;
        }
        return (arg1 & 0x70000) != 0 | class664.method3754(arg1, 90, arg2) || class436.method2611(arg1, arg2, 65535);
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(B)V", line = 20)
    public static void method2178(byte arg0) {
        field5032 = null;
        field5033 = null;
        if (arg0 >= -124) {
            field5033 = null;
        }
    }

    @OriginalMember(owner = "client!we", name = "<init>", descriptor = "()V", line = 37)
    public class374() {
    }

    @OriginalMember(owner = "client!we", name = "<init>", descriptor = "(Ljava/lang/String;)V", line = 39)
    public class374(String arg0) {
        this.field5035 = arg0;
    }
}
