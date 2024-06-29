import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!po")
public class class333 {

    @OriginalMember(owner = "client!po", name = "b", descriptor = "I")
    public static int field4589 = 0;

    @OriginalMember(owner = "client!po", name = "d", descriptor = "Ljs;")
    public static class181 field4591 = new class181(5000);

    @OriginalMember(owner = "client!po", name = "j", descriptor = "Lkn;")
    public static class442 field4597 = new class442("Loaded defaults", "Standardeinstellungen geladen", "Paramètres par défaut chargés", "Padrões carregados");

    @OriginalMember(owner = "client!po", name = "l", descriptor = "F")
    public static float field4599 = 0.0F;

    @OriginalMember(owner = "client!po", name = "a", descriptor = "I")
    public static int field4588;

    @OriginalMember(owner = "client!po", name = "c", descriptor = "I")
    public int field4590;

    @OriginalMember(owner = "client!po", name = "e", descriptor = "I")
    public static int field4592;

    @OriginalMember(owner = "client!po", name = "f", descriptor = "I")
    public static int field4593;

    @OriginalMember(owner = "client!po", name = "g", descriptor = "I")
    public static int field4594;

    @OriginalMember(owner = "client!po", name = "k", descriptor = "I")
    public static int field4598;

    @OriginalMember(owner = "client!po", name = "h", descriptor = "Lnq;")
    public static class268 field4595;

    @OriginalMember(owner = "client!po", name = "i", descriptor = "Ljava/lang/String;")
    public String field4596;

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(BI)I", line = 4)
    public static final int method2138(byte arg0, int arg1) {
        if (arg0 < 26) {
            return 7;
        } else {
            field4593++;
            return arg1 >>> 10;
        }
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(IIIBI)I", line = 18)
    public static final int method2139(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        if (arg3 != -30) {
            return -7;
        }
        field4588++;
        int var5 = arg1 & 0xF;
        int var6 = var5 < 8 ? arg2 : arg4;
        int var7 = var5 < 4 ? arg4 : (var5 == 12 || var5 == 14 ? arg2 : arg0);
        return ((var5 & 0x2) == 0 ? var7 : -var7) + ((var5 & 0x1) == 0 ? var6 : -var6);
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(I)V", line = 45)
    public static void method2140(int arg0) {
        int var1 = -33 / ((-arg0 - 87) / 33);
        field4595 = null;
        field4591 = null;
        field4597 = null;
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(IIB)I", line = 58)
    public static final int method2141(int arg0, int arg1, byte arg2) {
        field4594++;
        int var3 = class405.method2543(arg1 - 1, (byte) -127, arg0 - 1) + class405.method2543(arg1 + 1, (byte) -106, arg0 - 1) - (-class405.method2543(arg1 + -1, (byte) -127, arg0 + 1) + -class405.method2543(arg1 + 1, (byte) -93, arg0 - -1));
        int var4 = class405.method2543(arg1 - 1, (byte) -100, arg0) + (class405.method2543(arg1 + 1, (byte) -95, arg0) + class405.method2543(arg1, (byte) -123, arg0 - 1)) + class405.method2543(arg1, (byte) -107, arg0 + 1);
        if (arg2 == 70) {
            int var5 = class405.method2543(arg1, (byte) -109, arg0);
            return var3 / 16 + var4 / 8 + (var5 / 4);
        } else {
            return 43;
        }
    }
}
