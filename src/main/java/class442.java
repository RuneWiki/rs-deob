import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sk")
public class class442 extends class431 {

    @OriginalMember(owner = "client!sk", name = "m", descriptor = "I")
    public volatile int field6493 = -1;

    @OriginalMember(owner = "client!sk", name = "k", descriptor = "Ljava/lang/String;")
    public volatile String field6491;

    @OriginalMember(owner = "client!sk", name = "l", descriptor = "I")
    public static int field6492;

    @OriginalMember(owner = "client!sk", name = "n", descriptor = "I")
    public static int field6494;

    @OriginalMember(owner = "client!sk", name = "o", descriptor = "I")
    public static int field6495;

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(ZIILgo;Lgo;ZI)I", line = 6)
    public static final int method2713(boolean arg0, int arg1, int arg2, class445 arg3, class445 arg4, boolean arg5, int arg6) {
        field6495++;
        int var7 = class62.method544(arg1, arg4, arg6, arg0, arg3);
        if (var7 != 0) {
            return arg0 ? -var7 : var7;
        } else if (arg2 == -1) {
            return 0;
        } else {
            int var8 = class62.method544(arg1, arg4, arg2, arg5, arg3);
            return arg5 ? -var8 : var8;
        }
    }

    @OriginalMember(owner = "client!sk", name = "<init>", descriptor = "(Ljava/lang/String;)V", line = 39)
    public class442(String arg0) {
        this.field6491 = arg0;
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(B[BZ)V", line = 47)
    public static final void method2714(byte arg0, byte[] arg1, boolean arg2) {
        int var3 = -14 / ((56 - arg0) / 36);
        field6492++;
        if (class70.field998 == null) {
            class70.field998 = new class217(20000);
        }
        class70.field998.method1516(arg1, 26818, arg1.length, 0);
        if (!arg2) {
            return;
        }
        class182.method1212(class70.field998.field3572, 10);
        class210.field3428 = new class445[class422.field6295];
        int var4 = 0;
        for (int var5 = class258.field3953; var5 <= class129.field1883; var5++) {
            class445 var6 = class160.method1093((byte) -106, var5);
            if (var6 != null) {
                class210.field3428[var4++] = var6;
            }
        }
        class327.field4926 = false;
        class5.field48 = class493.method2937(-105);
        class70.field998 = null;
    }
}
