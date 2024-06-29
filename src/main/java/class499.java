import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dv")
public class class499 {

    @OriginalMember(owner = "client!dv", name = "o", descriptor = "Loi;")
    public static class169 field7343;

    @OriginalMember(owner = "client!dv", name = "a", descriptor = "B")
    public byte field7329;

    @OriginalMember(owner = "client!dv", name = "e", descriptor = "B")
    public byte field7333;

    @OriginalMember(owner = "client!dv", name = "f", descriptor = "B")
    public byte field7334;

    @OriginalMember(owner = "client!dv", name = "k", descriptor = "B")
    public byte field7339;

    @OriginalMember(owner = "client!dv", name = "l", descriptor = "B")
    public byte field7340;

    @OriginalMember(owner = "client!dv", name = "r", descriptor = "B")
    public byte field7346;

    @OriginalMember(owner = "client!dv", name = "x", descriptor = "B")
    public byte field7352;

    @OriginalMember(owner = "client!dv", name = "d", descriptor = "I")
    public static int field7332;

    @OriginalMember(owner = "client!dv", name = "j", descriptor = "I")
    public static int field7338;

    @OriginalMember(owner = "client!dv", name = "m", descriptor = "I")
    public int field7341;

    @OriginalMember(owner = "client!dv", name = "n", descriptor = "I")
    public static int field7342;

    @OriginalMember(owner = "client!dv", name = "w", descriptor = "I")
    public int field7351;

    @OriginalMember(owner = "client!dv", name = "h", descriptor = "Lf;")
    public static class404 field7336;

    // $FF: synthetic field
    @OriginalMember(owner = "client!dv", name = "y", descriptor = "Ljava/lang/Class;")
    public static Class field7353;

    @OriginalMember(owner = "client!dv", name = "p", descriptor = "S")
    public short field7344;

    @OriginalMember(owner = "client!dv", name = "b", descriptor = "Z")
    public boolean field7330;

    @OriginalMember(owner = "client!dv", name = "c", descriptor = "Z")
    public boolean field7331;

    @OriginalMember(owner = "client!dv", name = "g", descriptor = "Z")
    public boolean field7335;

    @OriginalMember(owner = "client!dv", name = "i", descriptor = "Z")
    public boolean field7337;

    @OriginalMember(owner = "client!dv", name = "q", descriptor = "Z")
    public boolean field7345;

    @OriginalMember(owner = "client!dv", name = "s", descriptor = "Z")
    public boolean field7347;

    @OriginalMember(owner = "client!dv", name = "t", descriptor = "Z")
    public boolean field7348;

    @OriginalMember(owner = "client!dv", name = "u", descriptor = "Z")
    public boolean field7349;

    @OriginalMember(owner = "client!dv", name = "v", descriptor = "Z")
    public boolean field7350;

    @OriginalMember(owner = "client!dv", name = "a", descriptor = "(BLej;)V")
    public static final void method2985(byte arg0, class354 arg1) {
        if (arg0 != -24) {
            field7343 = null;
        }
        field7338++;
        if (class470.field6877 == null) {
            return;
        }
        class323 var2 = null;
        if (arg1.field4533 == 0) {
            var2 = (class323) class67.method384(arg1.field4544, arg1.field4546, arg1.field4538);
        }
        if (arg1.field4533 == 1) {
            var2 = (class323) class301.method1806(arg1.field4544, arg1.field4546, arg1.field4538);
        }
        if (arg1.field4533 == 2) {
            var2 = (class323) class346.method2038(arg1.field4544, arg1.field4546, arg1.field4538, field7353 == null ? (field7353 = method2989("wk")) : field7353);
        }
        if (arg1.field4533 == 3) {
            var2 = (class323) class205.method1342(arg1.field4544, arg1.field4546, arg1.field4538);
        }
        if (var2 == null) {
            arg1.field4537 = 0;
            arg1.field4548 = 0;
            arg1.field4535 = -1;
        } else {
            arg1.field4535 = var2.method413(arg0 - 30478);
            arg1.field4537 = var2.method414(17350);
            arg1.field4548 = var2.method415(arg0 - 15293);
        }
    }

    @OriginalMember(owner = "client!dv", name = "a", descriptor = "([II[III)V")
    public static final void method2986(int[] arg0, int arg1, int[] arg2, int arg3, int arg4) {
        field7332++;
        if (arg1 != 1) {
            field7343 = null;
        }
        if (arg3 >= arg4) {
            return;
        }
        int var5 = (arg3 + arg4) / 2;
        int var6 = arg3;
        int var7 = arg2[var5];
        arg2[var5] = arg2[arg4];
        arg2[arg4] = var7;
        int var8 = arg0[var5];
        arg0[var5] = arg0[arg4];
        arg0[arg4] = var8;
        int var9 = ~var7 == Integer.MIN_VALUE ? 0 : 1;
        for (int var10 = arg3; var10 < arg4; var10++) {
            if (arg2[var10] < (var9 & var10) + var7) {
                int var11 = arg2[var10];
                arg2[var10] = arg2[var6];
                arg2[var6] = var11;
                int var12 = arg0[var10];
                arg0[var10] = arg0[var6];
                arg0[var6++] = var12;
            }
        }
        arg2[arg4] = arg2[var6];
        arg2[var6] = var7;
        arg0[arg4] = arg0[var6];
        arg0[var6] = var8;
        method2986(arg0, 1, arg2, arg3, var6 - 1);
        method2986(arg0, arg1, arg2, var6 + 1, arg4);
    }

    @OriginalMember(owner = "client!dv", name = "a", descriptor = "(I)V")
    public static final void method2987(int arg0) {
        field7342++;
        if (arg0 > 63) {
            class91.field1263.method842(class166.field2153, class421.field5647.field7714 ? class248.field3169 + 256 << 0 : -1, 256);
        }
    }

    @OriginalMember(owner = "client!dv", name = "b", descriptor = "(I)V")
    public static void method2988(int arg0) {
        field7336 = null;
        field7343 = null;
        if (arg0 > -89) {
            method2985((byte) 31, null);
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!dv", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method2989(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    static {
        new class169("Select", "Auswählen", "Sélectionner", "Selecionar");
        field7343 = new class169("Unable to find ", "Spieler kann nicht gefunden werden: ", "Impossible de trouver ", "Não é possível encontrar ");
    }
}
