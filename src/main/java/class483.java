import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ar")
public class class483 {

    @OriginalMember(owner = "client!ar", name = "b", descriptor = "Lhn;")
    public static class509 field7123 = new class509(20);

    @OriginalMember(owner = "client!ar", name = "d", descriptor = "Z")
    public static boolean field7125 = false;

    @OriginalMember(owner = "client!ar", name = "e", descriptor = "[I")
    public static int[] field7126 = new int[32];

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "I")
    public static int field7122;

    @OriginalMember(owner = "client!ar", name = "c", descriptor = "Lo;")
    public static class24 field7124;

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "([BZI)V")
    public static final void method2944(byte[] arg0, boolean arg1, int arg2) {
        field7122++;
        if (class256.field3401 == null) {
            class256.field3401 = new class396(20000);
        }
        class256.field3401.method2438(arg2, arg0, arg0.length, arg2 + 1769508784);
        if (!arg1) {
            return;
        }
        class38.method220(class256.field3401.field5761, arg2 ^ 0x2);
        class55.field637 = new class54[class527.field7743];
        int var3 = 0;
        for (int var4 = class327.field4345; var4 <= class412.field5887; var4++) {
            class54 var5 = class63.method380(var4, (byte) -109);
            if (var5 != null) {
                class55.field637[var3++] = var5;
            }
        }
        class192.field2468 = false;
        class65.field742 = class45.method252((byte) -8);
        class256.field3401 = null;
    }

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(I)V")
    public static void method2945(int arg0) {
        if (arg0 > -127) {
            field7124 = null;
        }
        field7124 = null;
        field7126 = null;
        field7123 = null;
    }
}
