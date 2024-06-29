import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ha")
public class class91 extends class476 {

    @OriginalMember(owner = "client!ha", name = "j", descriptor = "I")
    public static int field1458;

    @OriginalMember(owner = "client!ha", name = "k", descriptor = "I")
    public static int field1459;

    @OriginalMember(owner = "client!ha", name = "l", descriptor = "I")
    public int field1460;

    @OriginalMember(owner = "client!ha", name = "m", descriptor = "I")
    public int field1461;

    @OriginalMember(owner = "client!ha", name = "n", descriptor = "I")
    public static int field1462;

    @OriginalMember(owner = "client!ha", name = "i", descriptor = "Ldk;")
    public static class421 field1457;

    @OriginalMember(owner = "client!ha", name = "o", descriptor = "[I")
    public static int[] field1463;

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IBI)I")
    public static final int method745(int arg0, byte arg1, int arg2) {
        field1458++;
        if (arg1 != 103) {
            method745(-2, (byte) 114, 22);
        }
        int var3 = arg0 >> 31 & arg2 - 1;
        return ((arg0 >>> 31) + arg0) % arg2 + var3;
    }

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(I)V")
    public static final void method746(int arg0) {
        field1462++;
        int[] var1 = new int[class534.field7872.field7602];
        int var2 = 0;
        for (int var3 = 0; var3 < class534.field7872.field7602; var3++) {
            class297 var5 = class534.field7872.method3089(var3, 125);
            if (var5.field4076 >= 0 || var5.field4077 >= 0) {
                var1[var2++] = var3;
            }
        }
        class117.field1844 = new int[var2];
        if (arg0 != -1) {
            method746(-9);
        }
        for (int var4 = 0; var4 < var2; var4++) {
            class117.field1844[var4] = var1[var4];
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Z)V")
    public static void method747(boolean arg0) {
        if (!arg0) {
            field1463 = null;
        }
        field1463 = null;
        field1457 = null;
    }

    static {
        new class157("You have been removed from this channel.", "Du wurdest aus dem Chatraum entfernt.", "Vous avez été supprimé de ce canal.", "Você foi retirado desse canal.");
    }
}
