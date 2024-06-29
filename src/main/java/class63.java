import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!r")
public class class63 extends class291 {

    @OriginalMember(owner = "client!r", name = "W", descriptor = "[Lbh;")
    public class16[] field1040;

    @OriginalMember(owner = "client!r", name = "R", descriptor = "Leg;")
    public static class37 field1035 = class174.method1167("Hidden)2use", -60);

    @OriginalMember(owner = "client!r", name = "S", descriptor = "[I")
    public static int[] field1036 = new int[1000];

    @OriginalMember(owner = "client!r", name = "Q", descriptor = "Leg;")
    public static class37 field1034 = class174.method1167("Chargement de RuneScape en cours )2 veuillez patienter)3)3)3", 59);

    @OriginalMember(owner = "client!r", name = "T", descriptor = "Z")
    public static boolean field1037 = false;

    @OriginalMember(owner = "client!r", name = "P", descriptor = "Leg;")
    public static class37 field1033 = class174.method1167(")1o", 102);

    @OriginalMember(owner = "client!r", name = "V", descriptor = "Leg;")
    public static class37 field1039 = class174.method1167("leuchten1:", -68);

    @OriginalMember(owner = "client!r", name = "U", descriptor = "Leg;")
    public static class37 field1038 = null;

    @OriginalMember(owner = "client!r", name = "M", descriptor = "I")
    public static int field1030;

    @OriginalMember(owner = "client!r", name = "N", descriptor = "I")
    public static int field1031;

    @OriginalMember(owner = "client!r", name = "O", descriptor = "Ljl;")
    public static class101 field1032;

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(ZI)Z")
    public final boolean method446(boolean arg0, int arg1) {
        if (arg0) {
            return false;
        } else {
            field1031++;
            return this.field1040[arg1].field233;
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IIZ)I")
    public static final int method447(int arg0, int arg1, boolean arg2) {
        field1030++;
        if (arg2) {
            field1036 = null;
        }
        int var3 = 1;
        while (arg0 > 1) {
            if ((arg0 & 0x1) != 0) {
                var3 = arg1 * var3;
            }
            arg0 >>= 0x1;
            arg1 *= arg1;
        }
        if (arg0 == 1) {
            return arg1 * var3;
        } else {
            return var3;
        }
    }

    @OriginalMember(owner = "client!r", name = "b", descriptor = "(B)V")
    public static void method448(byte arg0) {
        int var1 = -44 % ((arg0 + 28) / 36);
        field1034 = null;
        field1036 = null;
        field1038 = null;
        field1035 = null;
        field1033 = null;
        field1032 = null;
        field1039 = null;
    }

    @OriginalMember(owner = "client!r", name = "<init>", descriptor = "(Ljl;Ljl;IZ)V")
    public class63(class101 arg0, class101 arg1, int arg2, boolean arg3) {
        class226 var5 = new class226();
        int var6 = arg0.method672(arg2, (byte) 119);
        this.field1040 = new class16[var6];
        int[] var7 = arg0.method671(arg2, (byte) 49);
        for (int var8 = 0; var8 < var7.length; var8++) {
            byte[] var9 = arg0.method666(var7[var8], arg2, (byte) -51);
            class204 var10 = null;
            int var11 = (var9[0] & 0xFF) << 8 | var9[1] & 0xFF;
            for (class204 var12 = (class204) var5.method1566(-3); var12 != null; var12 = (class204) var5.method1570(3)) {
                if (var12.field3489 == var11) {
                    var10 = var12;
                    break;
                }
            }
            if (var10 == null) {
                byte[] var13;
                if (arg3) {
                    var13 = arg1.method679(0, var11, -12);
                } else {
                    var13 = arg1.method679(var11, 0, -23);
                }
                var10 = new class204(var11, var13);
                var5.method1574(var10, 0);
            }
            this.field1040[var7[var8]] = new class16(var9, var10);
        }
    }
}
