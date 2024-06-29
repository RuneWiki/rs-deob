import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ri")
public class class75 extends class198 {

    @OriginalMember(owner = "client!ri", name = "m", descriptor = "D")
    public static double field944 = -1.0D;

    @OriginalMember(owner = "client!ri", name = "n", descriptor = "Z")
    public static volatile boolean field945 = true;

    @OriginalMember(owner = "client!ri", name = "t", descriptor = "I")
    public static int field951 = 0;

    @OriginalMember(owner = "client!ri", name = "v", descriptor = "F")
    public static float field953;

    @OriginalMember(owner = "client!ri", name = "h", descriptor = "I")
    public int field939;

    @OriginalMember(owner = "client!ri", name = "i", descriptor = "I")
    public int field940;

    @OriginalMember(owner = "client!ri", name = "j", descriptor = "I")
    public static int field941;

    @OriginalMember(owner = "client!ri", name = "k", descriptor = "I")
    public int field942;

    @OriginalMember(owner = "client!ri", name = "l", descriptor = "I")
    public static int field943;

    @OriginalMember(owner = "client!ri", name = "p", descriptor = "I")
    public static int field947;

    @OriginalMember(owner = "client!ri", name = "q", descriptor = "I")
    public int field948;

    @OriginalMember(owner = "client!ri", name = "r", descriptor = "I")
    public int field949;

    @OriginalMember(owner = "client!ri", name = "s", descriptor = "I")
    public static int field950;

    @OriginalMember(owner = "client!ri", name = "u", descriptor = "I")
    public int field952;

    @OriginalMember(owner = "client!ri", name = "g", descriptor = "Lfo;")
    public static class361 field938;

    @OriginalMember(owner = "client!ri", name = "o", descriptor = "Ljava/lang/String;")
    public String field946;

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(II)Z", line = 6)
    public static final boolean method436(int arg0, int arg1) {
        int var2 = -67 / ((14 - arg1) / 61);
        field941++;
        if (arg0 == 17 || arg0 == 50 || arg0 == 49 || arg0 == 12 || arg0 == 4) {
            return true;
        } else {
            return arg0 == 59 || arg0 == 1011;
        }
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "()V", line = 31)
    public static final void method437() {
        for (int var0 = 0; var0 < class428.field6219; var0++) {
            class279 var1 = class447.field6523[var0];
            class212.method1351(var1);
            class447.field6523[var0] = null;
        }
        class428.field6219 = 0;
    }

    @OriginalMember(owner = "client!ri", name = "c", descriptor = "(I)V", line = 44)
    public static final void method438(int arg0) {
        int var1 = 117 / ((arg0 - 5) / 61);
        field950++;
        class263.field3530 = new class36(class453.field6779.method1823(class374.field5072, (byte) -88), "", class256.field3403, 1008, -1, 0L, 0, 0, true, false);
    }

    @OriginalMember(owner = "client!ri", name = "d", descriptor = "(I)V", line = 58)
    public static void method439(int arg0) {
        if (arg0 == 1803) {
            field938 = null;
        }
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(IIBI)V", line = 72)
    public static final void method440(int arg0, int arg1, byte arg2, int arg3) {
        field943++;
        class6 var4 = class275.field3657[arg3][arg1];
        if (arg2 != -29) {
            method439(18);
        }
        class523.method3112(var4 == null ? class358.field4873 : var4, arg0, (byte) -111);
    }
}
