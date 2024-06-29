import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cl")
public class class30 extends class309 {

    @OriginalMember(owner = "client!cl", name = "X", descriptor = "Ljava/lang/Object;")
    private Object field367;

    @OriginalMember(owner = "client!cl", name = "Z", descriptor = "Ljava/lang/String;")
    public static String field369 = "wave:";

    @OriginalMember(owner = "client!cl", name = "bb", descriptor = "[Lfh;")
    public static class114[] field371 = new class114[50];

    @OriginalMember(owner = "client!cl", name = "S", descriptor = "I")
    public static int field363;

    @OriginalMember(owner = "client!cl", name = "T", descriptor = "I")
    public static int field364;

    @OriginalMember(owner = "client!cl", name = "U", descriptor = "I")
    public static int field365;

    @OriginalMember(owner = "client!cl", name = "W", descriptor = "I")
    public static int field366;

    @OriginalMember(owner = "client!cl", name = "Y", descriptor = "I")
    public static int field368;

    @OriginalMember(owner = "client!cl", name = "ab", descriptor = "I")
    public static int field370;

    @OriginalMember(owner = "client!cl", name = "cb", descriptor = "I")
    public static int field372;

    @OriginalMember(owner = "client!cl", name = "db", descriptor = "I")
    public static int field373;

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(Ldk;III)Lqi;")
    public static final class232 method162(class251 arg0, int arg1, int arg2, int arg3) {
        field368++;
        if (class290.method1932(-102, arg2, arg3, arg0)) {
            if (arg1 != 50) {
                field369 = null;
            }
            return class177.method1299(-19995);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!cl", name = "i", descriptor = "(I)Ljava/lang/Object;")
    public final Object method134(int arg0) {
        field365++;
        int var2 = 87 / ((arg0 - 3) / 48);
        return this.field367;
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(II[II[I)V")
    public static final void method163(int arg0, int arg1, int[] arg2, int arg3, int[] arg4) {
        field370++;
        int var5 = -7 % (arg0 / 49);
        if (arg1 <= arg3) {
            return;
        }
        int var6 = (arg1 + arg3) / 2;
        int var7 = arg3;
        int var8 = arg4[var6];
        arg4[var6] = arg4[arg1];
        arg4[arg1] = var8;
        int var9 = arg2[var6];
        arg2[var6] = arg2[arg1];
        arg2[arg1] = var9;
        for (int var10 = arg3; var10 < arg1; var10++) {
            if (arg4[var10] > (var10 & 0x1) + var8) {
                int var11 = arg4[var10];
                arg4[var10] = arg4[var7];
                arg4[var7] = var11;
                int var12 = arg2[var10];
                arg2[var10] = arg2[var7];
                arg2[var7++] = var12;
            }
        }
        arg4[arg1] = arg4[var7];
        arg4[var7] = var8;
        arg2[arg1] = arg2[var7];
        arg2[var7] = var9;
        method163(99, var7 - 1, arg2, arg3, arg4);
        method163(88, arg1, arg2, var7 + 1, arg4);
    }

    @OriginalMember(owner = "client!cl", name = "c", descriptor = "(Z)Z")
    public final boolean method133(boolean arg0) {
        if (arg0) {
            this.method133(false);
        }
        field363++;
        return false;
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(ILdk;)V")
    public static final void method164(int arg0, class251 arg1) {
        field364++;
        class1.field16 = arg1;
        if (arg0 != 1) {
            method164(106, (class251) null);
        }
    }

    @OriginalMember(owner = "client!cl", name = "<init>", descriptor = "(Ljava/lang/Object;)V")
    public class30(Object arg0) {
        this.field367 = arg0;
    }

    @OriginalMember(owner = "client!cl", name = "b", descriptor = "(B)V")
    public static void method165(byte arg0) {
        field371 = null;
        if (arg0 != 0) {
            field371 = null;
        }
        field369 = null;
    }
}
