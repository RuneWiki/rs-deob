import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bi")
public class class93 extends class449 {

    @OriginalMember(owner = "client!bi", name = "w", descriptor = "Ljava/lang/String;")
    public String field1313;

    @OriginalMember(owner = "client!bi", name = "t", descriptor = "[I")
    public static int[] field1310 = new int[] { 32, 39, 44, 47 };

    @OriginalMember(owner = "client!bi", name = "u", descriptor = "Lrc;")
    public static class108 field1311 = new class108(1, -2);

    @OriginalMember(owner = "client!bi", name = "q", descriptor = "I")
    public static int field1307;

    @OriginalMember(owner = "client!bi", name = "s", descriptor = "I")
    public static int field1309;

    @OriginalMember(owner = "client!bi", name = "v", descriptor = "Ldp;")
    public static class307 field1312;

    @OriginalMember(owner = "client!bi", name = "r", descriptor = "Ltb;")
    public static class312 field1308;

    @OriginalMember(owner = "client!bi", name = "d", descriptor = "(I)V")
    public static void method780(int arg0) {
        field1310 = null;
        field1308 = null;
        field1311 = null;
        if (arg0 != 1) {
            field1309 = -23;
        }
        field1312 = null;
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(I[B)[B")
    public static final byte[] method781(int arg0, byte[] arg1) {
        field1307++;
        if (arg0 == -31648) {
            int var2 = arg1.length;
            byte[] var3 = new byte[var2];
            class214.method1449(arg1, 0, var3, 0, var2);
            return var3;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(IIIII)V")
    public static final void method782(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (class486.field6872 != null) {
            class486.field6872[arg0][arg1] = arg2 | 0xFF000000;
        }
        if (class218.field3157 != null) {
            class218.field3157[arg0][arg1] = (byte) (arg3 >> 3);
        }
        if (class332.field4610 != null) {
            class332.field4610[arg0][arg1] = (byte) arg4;
        }
    }

    @OriginalMember(owner = "client!bi", name = "<init>", descriptor = "()V")
    public class93() {
    }

    @OriginalMember(owner = "client!bi", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
    public class93(String arg0, int arg1) {
        this.field1313 = arg0;
    }
}
