import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ss")
public abstract class class283 extends class96 {

    @OriginalMember(owner = "client!ss", name = "E", descriptor = "Lgn;")
    public static class475 field4036 = new class475(52, 0);

    @OriginalMember(owner = "client!ss", name = "G", descriptor = "Liu;")
    public static class390 field4038 = new class390(39, -2);

    @OriginalMember(owner = "client!ss", name = "B", descriptor = "I")
    public static int field4033;

    @OriginalMember(owner = "client!ss", name = "C", descriptor = "I")
    public static int field4034;

    @OriginalMember(owner = "client!ss", name = "D", descriptor = "I")
    public static int field4035;

    @OriginalMember(owner = "client!ss", name = "F", descriptor = "I")
    public static int field4037;

    @OriginalMember(owner = "client!ss", name = "H", descriptor = "I")
    public static int field4039;

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(I[S)[S")
    public static final short[] method1717(int arg0, short[] arg1) {
        field4035++;
        if (arg1 == null) {
            return null;
        } else {
            short[] var2 = new short[arg1.length];
            class268.method1639(arg1, 0, var2, arg0, arg1.length);
            return var2;
        }
    }

    @OriginalMember(owner = "client!ss", name = "b", descriptor = "(III)V")
    public static final void method1718(int arg0, int arg1, int arg2) {
        field4037++;
        if (class164.field2152 != arg0) {
            class228.field3210 = new int[arg0];
            for (int var3 = 0; var3 < arg0; var3++) {
                class228.field3210[var3] = (var3 << 12) / arg0;
            }
            class107.field1429 = arg0 - 1;
            class164.field2152 = arg0;
            class456.field6647 = arg0 * 32;
        }
        if (arg1 < 15 || class508.field7746 == arg2) {
            return;
        }
        if (class164.field2152 == arg2) {
            class447.field6523 = class228.field3210;
        } else {
            class447.field6523 = new int[arg2];
            for (int var4 = 0; var4 < arg2; var4++) {
                class447.field6523[var4] = (var4 << 12) / arg2;
            }
        }
        class340.field4948 = arg2 - 1;
        class508.field7746 = arg2;
    }

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(IZ[B)Ljava/lang/Object;")
    public static final Object method1719(int arg0, boolean arg1, byte[] arg2) {
        field4034++;
        if (arg2 == null) {
            return null;
        }
        if (arg0 > ~arg2.length && !class390.field5791) {
            try {
                class444 var3 = (class444) Class.forName("u").getDeclaredConstructor().newInstance();
                var3.method377((byte) -51, arg2);
                return var3;
            } catch (Throwable var4) {
                class390.field5791 = true;
            }
        }
        return arg1 ? class304.method1828((byte) -47, arg2) : arg2;
    }

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(I)V")
    public static void method1720(int arg0) {
        int var1 = -80 % ((-arg0 - 52) / 48);
        field4036 = null;
        field4038 = null;
    }

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(Lrl;I)V")
    public static final void method1721(class487 arg0, int arg1) {
        field4033++;
        if (arg1 != 128) {
            method1717(-16, null);
        }
        if (class441.field6440 == null) {
            class141 var2 = new class141();
            byte[] var3 = var2.method889(128, 16, 128, 17983);
            class441.field6440 = method1719(-137, false, var3);
        }
        if (class505.field7707 == null) {
            class217 var4 = new class217();
            byte[] var5 = var4.method1336(26, 16, 128, 128);
            class505.field7707 = method1719(-137, false, var5);
        }
        class417 var6 = arg0.field7320;
        if (var6.method2482(35632) && class4.field67 == null) {
            byte[] var7 = class23.method205(128, new class148(419684), 16.0F, arg1 - 29, 0.5F, 16, 4.0F, 4.0F, 0.6F, 128, 8);
            class4.field67 = method1719(arg1 - 265, false, var7);
        }
    }

    static {
        new class194("Invalid teleport!", "Unzulässiger Teleport!", "Téléportation non valide !", "Teleporte inválido!");
        new class194(null, "geschickt werden.", null, null);
    }
}
