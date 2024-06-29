import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pp")
public class class269 {

    @OriginalMember(owner = "client!pp", name = "f", descriptor = "I")
    public int field3402;

    @OriginalMember(owner = "client!pp", name = "e", descriptor = "I")
    public static int field3401 = -1;

    @OriginalMember(owner = "client!pp", name = "g", descriptor = "I")
    public static int field3403 = -1;

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "I")
    public static int field3397;

    @OriginalMember(owner = "client!pp", name = "b", descriptor = "I")
    public static int field3398;

    @OriginalMember(owner = "client!pp", name = "c", descriptor = "I")
    public static int field3399;

    @OriginalMember(owner = "client!pp", name = "d", descriptor = "I")
    public static int field3400;

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(I)I", line = 3)
    public final int method1596(int arg0) {
        if (arg0 >= -125) {
            field3403 = -75;
        }
        field3398++;
        return this.field3402;
    }

    @OriginalMember(owner = "client!pp", name = "toString", descriptor = "()Ljava/lang/String;", line = 20)
    public final String toString() {
        field3400++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(IIBII)V", line = 30)
    public static final void method1597(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        field3397++;
        if (arg2 <= 68) {
            field3403 = 67;
        }
        if (arg0 < arg1) {
            for (int var5 = arg0; var5 < arg1; var5++) {
                class387.field5088[var5][arg4] = arg3;
            }
        } else {
            for (int var6 = arg1; var6 < arg0; var6++) {
                class387.field5088[var6][arg4] = arg3;
            }
        }
    }

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(ILjava/lang/String;)V", line = 65)
    public static final void method1598(int arg0, String arg1) {
        field3399++;
        if (arg1 == null) {
            return;
        }
        if (arg1.startsWith("*")) {
            arg1 = arg1.substring(1);
        }
        String var2 = class465.method2803(arg1, (byte) 127);
        if (arg0 != 1 || var2 == null) {
            return;
        }
        for (int var3 = 0; var3 < class498.field7223; var3++) {
            String var4 = class385.field5063[var3];
            if (var4.startsWith("*")) {
                var4 = var4.substring(1);
            }
            String var5 = class465.method2803(var4, (byte) 111);
            if (var5 != null && var5.equals(var2)) {
                class498.field7223--;
                for (int var6 = var3; var6 < class498.field7223; var6++) {
                    class385.field5063[var6] = class385.field5063[var6 + 1];
                    class113.field1520[var6] = class113.field1520[var6 + 1];
                    class281.field3580[var6] = class281.field3580[var6 + 1];
                    class380.field5004[var6] = class380.field5004[var6 + 1];
                    class28.field395[var6] = class28.field395[var6 + 1];
                }
                class522.field7556++;
                class72.field932 = class160.field2037;
                class282.method1669(class141.field1827, false);
                class40.field511.method2729(class463.method2733(-121, arg1), false);
                class40.field511.method2769(arg1, true);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!pp", name = "<init>", descriptor = "(Ljava/lang/String;I)V", line = 136)
    public class269(String arg0, int arg1) {
        this.field3402 = arg1;
    }
}
