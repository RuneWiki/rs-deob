import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ls")
public class class565 {

    @OriginalMember(owner = "client!ls", name = "g", descriptor = "Ljava/lang/String;")
    public static String field8191 = null;

    @OriginalMember(owner = "client!ls", name = "b", descriptor = "Llc;")
    public static class435 field8186 = new class435(117, 5);

    @OriginalMember(owner = "client!ls", name = "c", descriptor = "I")
    public static int field8187;

    @OriginalMember(owner = "client!ls", name = "d", descriptor = "I")
    public static int field8188;

    @OriginalMember(owner = "client!ls", name = "e", descriptor = "I")
    public static int field8189;

    @OriginalMember(owner = "client!ls", name = "f", descriptor = "I")
    public static int field8190;

    @OriginalMember(owner = "client!ls", name = "h", descriptor = "I")
    public static int field8192;

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "[[[Ldn;")
    public static class375[][][] field8185;

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(ILla;II)Lfu;")
    public static final class637 method3379(int arg0, class423 arg1, int arg2, int arg3) {
        field8189++;
        byte[] var4 = arg1.method2600(0, arg2, arg3);
        if (var4 == null) {
            return null;
        } else if (arg0 <= 54) {
            return null;
        } else {
            return new class637(var4);
        }
    }

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(Z)V")
    public static void method3380(boolean arg0) {
        field8191 = null;
        if (arg0) {
            method3380(false);
        }
        field8185 = null;
        field8186 = null;
    }

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(I)[Lnca;")
    public static final class627[] method3381(int arg0) {
        if (arg0 != 29753) {
            field8185 = null;
        }
        field8190++;
        return new class627[] { class32.field302, class671.field9558, class291.field4014 };
    }

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(ILsl;)V")
    public static final void method3382(int arg0, class479 arg1) {
        field8188++;
        if ((arg1.field6800.length - arg1.field6864) < 1) {
            return;
        }
        int var2 = arg1.method2886(true);
        if (var2 < 0 || var2 > 1 || (arg1.field6800.length - arg1.field6864) < 2) {
            return;
        }
        int var3 = arg1.method2882(-1);
        if ((var3 * 6) > (arg1.field6800.length - arg1.field6864)) {
            return;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            int var6 = arg1.method2882(-1);
            int var7 = arg1.method2868(-54);
            if (var6 < class541.field7855.length && class525.field7633[var6] && (class75.field1103.method3816((byte) -101, var6).field2411 != '1' || var7 >= -1 && var7 <= 1)) {
                class541.field7855[var6] = var7;
            }
        }
        int var5 = 33 % ((arg0 + 1) / 57);
    }
}
