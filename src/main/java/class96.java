import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qv")
public class class96 extends class350 {

    @OriginalMember(owner = "client!qv", name = "R", descriptor = "Lgu;")
    public static class126 field1289 = new class126();

    @OriginalMember(owner = "client!qv", name = "S", descriptor = "Lim;")
    public static class353 field1290 = new class353(41, 3);

    @OriginalMember(owner = "client!qv", name = "V", descriptor = "I")
    public static int field1293 = -1;

    @OriginalMember(owner = "client!qv", name = "T", descriptor = "F")
    public static float field1291;

    @OriginalMember(owner = "client!qv", name = "I", descriptor = "I")
    public static int field1285;

    @OriginalMember(owner = "client!qv", name = "O", descriptor = "I")
    public static int field1286;

    @OriginalMember(owner = "client!qv", name = "P", descriptor = "I")
    public static int field1287;

    @OriginalMember(owner = "client!qv", name = "U", descriptor = "I")
    public static int field1292;

    @OriginalMember(owner = "client!qv", name = "W", descriptor = "Lwa;")
    public static class605 field1294;

    @OriginalMember(owner = "client!qv", name = "Q", descriptor = "[B")
    private byte[] field1288;

    @OriginalMember(owner = "client!qv", name = "d", descriptor = "(I)V")
    public static final void method530(int arg0) {
        class272.field3457.field7707 = 0;
        field1287++;
        class208.field2708 = null;
        class558.field7814 = null;
        class501.field6953 = null;
        class507.field7078 = null;
        class189.field2446 = 0;
        class262.field3333 = arg0;
        class342.field4758.field7707 = 0;
        class327.field4494 = 0;
        class429.method2510((byte) 96);
        class166.method899(-98);
        for (int var1 = 0; var1 < 2048; var1++) {
            class364.field5092[var1] = null;
        }
        class147.field1899 = null;
        for (int var2 = 0; var2 < class604.field8710; var2++) {
            class585 var4 = class179.field2310[var2].field6729;
            if (var4 != null) {
                var4.field399 = -1;
            }
        }
        class638.method3673(arg0 ^ 0xFFFFFFC0);
        class621.field8952 = 1;
        class597.method3438((byte) 124, 9);
        for (int var3 = 0; var3 < 100; var3++) {
            class99.field1326[var3] = true;
        }
        class391.method2364((byte) 112);
        class151.field1993 = 0L;
        class341.field4741 = null;
    }

    @OriginalMember(owner = "client!qv", name = "<init>", descriptor = "()V")
    public class96() {
        super(12, 5, 16, 2, 2, 0.45F);
    }

    @OriginalMember(owner = "client!qv", name = "a", descriptor = "(BIB)V")
    public final void method233(byte arg0, int arg1, byte arg2) {
        field1285++;
        if (arg2 != 61) {
            method533(119);
        }
        byte var4 = (byte) (((arg0 & 0xFF) >> 1) + 127);
        int var5 = arg1 * 2;
        int var6 = var5 + 1;
        this.field1288[var5] = var4;
        this.field1288[var6] = var4;
    }

    @OriginalMember(owner = "client!qv", name = "b", descriptor = "(IIII)[B")
    public final byte[] method531(int arg0, int arg1, int arg2, int arg3) {
        this.field1288 = new byte[arg0 * arg2 * 2 * arg1];
        field1292++;
        this.method3138(arg3 ^ 0x3DC785CC, arg1, arg0, arg2);
        if (arg3 != 0) {
            method532(107, 89, 46, 88, -98, 59, -34, 101, -71, (byte) -119);
        }
        return this.field1288;
    }

    @OriginalMember(owner = "client!qv", name = "a", descriptor = "(IIIIIIIIIB)V")
    public static final void method532(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, byte arg9) {
        if (arg9 >= -121) {
            return;
        }
        field1286++;
        if (class594.field8575 <= arg2 && arg2 <= class355.field4972 && arg7 >= class594.field8575 && arg7 <= class355.field4972 && arg8 >= class594.field8575 && class355.field4972 >= arg8 && class594.field8575 <= arg3 && class355.field4972 >= arg3 && arg4 >= class535.field7467 && arg4 <= class113.field1453 && arg0 >= class535.field7467 && arg0 <= class113.field1453 && class535.field7467 <= arg1 && arg1 <= class113.field1453 && arg6 >= class535.field7467 && class113.field1453 >= arg6) {
            class284.method1767(arg6, arg5, arg1, arg4, arg2, arg7, (byte) -114, arg8, arg0, arg3);
        } else {
            class74.method435((byte) 124, arg4, arg6, arg8, arg0, arg1, arg7, arg5, arg3, arg2);
        }
    }

    @OriginalMember(owner = "client!qv", name = "e", descriptor = "(I)V")
    public static void method533(int arg0) {
        if (arg0 != -613) {
            field1290 = null;
        }
        field1294 = null;
        field1290 = null;
        field1289 = null;
    }

    static {
        new class344("Your clan channel has now been disabled!", "Dein Chatraum ist jetzt ausgeschaltet.", "Votre canal de clan est désactivé.", "Seu canal de clã foi desativado!");
    }
}
