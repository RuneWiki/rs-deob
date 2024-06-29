import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pj")
public abstract class class100 extends class419 {

    @OriginalMember(owner = "client!pj", name = "s", descriptor = "I")
    public int field1366;

    @OriginalMember(owner = "client!pj", name = "y", descriptor = "I")
    public int field1372;

    @OriginalMember(owner = "client!pj", name = "w", descriptor = "I")
    public int field1370;

    @OriginalMember(owner = "client!pj", name = "x", descriptor = "I")
    public int field1371;

    @OriginalMember(owner = "client!pj", name = "B", descriptor = "I")
    public int field1375;

    @OriginalMember(owner = "client!pj", name = "u", descriptor = "I")
    public int field1368;

    @OriginalMember(owner = "client!pj", name = "v", descriptor = "I")
    public int field1369;

    @OriginalMember(owner = "client!pj", name = "A", descriptor = "Ljc;")
    public static class305 field1374 = new class305("Connection lost.", "Verbindung abgebrochen.", "Connexion perdue.", "Conexão perdida.");

    @OriginalMember(owner = "client!pj", name = "C", descriptor = "[I")
    public static int[] field1376 = new int[2048];

    @OriginalMember(owner = "client!pj", name = "p", descriptor = "I")
    public static int field1363;

    @OriginalMember(owner = "client!pj", name = "q", descriptor = "I")
    public static int field1364;

    @OriginalMember(owner = "client!pj", name = "r", descriptor = "I")
    public static int field1365;

    @OriginalMember(owner = "client!pj", name = "t", descriptor = "I")
    public static int field1367;

    @OriginalMember(owner = "client!pj", name = "z", descriptor = "I")
    public static int field1373;

    @OriginalMember(owner = "client!pj", name = "d", descriptor = "(B)V")
    public final void method42(byte arg0) {
        if (arg0 != 92) {
            method612(null, -108, (byte) 87);
        }
        field1365++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(IIIZILot;Lza;)V")
    public final void method40(int arg0, int arg1, int arg2, boolean arg3, int arg4, class419 arg5, class287 arg6) {
        int var8 = 52 % ((61 - arg0) / 47);
        field1373++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!pj", name = "c", descriptor = "(B)Z")
    public final boolean method41(byte arg0) {
        field1364++;
        if (arg0 != -62) {
            this.method41((byte) -54);
        }
        return false;
    }

    @OriginalMember(owner = "client!pj", name = "e", descriptor = "(I)V")
    public static void method611(int arg0) {
        field1374 = null;
        field1376 = null;
        if (arg0 != -16777216) {
            method611(13);
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(Ljava/lang/String;IB)V")
    public static final void method612(String arg0, int arg1, byte arg2) {
        field1367++;
        class184 var3 = class277.method1682(arg1, 2, -82);
        var3.method1069(true);
        int var4 = 13 % ((-arg2 - 32) / 62);
        var3.field2394 = arg0;
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(IILer;ZLza;I)V")
    public static final void method613(int arg0, int arg1, class70 arg2, boolean arg3, class287 arg4, int arg5) {
        field1363++;
        class470 var6 = class465.field6927.method502((byte) -89, arg2.field853);
        if (var6.field6968 == -1) {
            return;
        }
        int var8;
        if (arg2.field824) {
            int var7 = arg2.field826 + arg0;
            var8 = var7 & 0x3;
        } else {
            var8 = 0;
        }
        class24 var9 = var6.method2871(arg4, var8, 262144, arg2.field839);
        if (var9 == null || !arg3) {
            return;
        }
        int var10 = arg2.field865;
        int var11 = arg2.field857;
        if ((var8 & 0x1) == 1) {
            var10 = arg2.field857;
            var11 = arg2.field865;
        }
        int var12 = var9.method155();
        int var13 = var9.method153();
        if (var6.field6972) {
            var13 = var11 * 4;
            var12 = var10 * 4;
        }
        if (var6.field6964 == 0) {
            var9.method141(arg5, arg1 + 4 - var11 * 4, var12, var13);
        } else {
            var9.method6(arg5, arg1 + 4 - (var11 * 4), var12, var13, 0, var6.field6964 | 0xFF000000, 1);
        }
    }

    @OriginalMember(owner = "client!pj", name = "f", descriptor = "(I)I")
    public abstract int method614(int arg0);

    @OriginalMember(owner = "client!pj", name = "<init>", descriptor = "(IIIIIII)V")
    public class100(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field1366 = arg0;
        this.field1372 = arg6;
        this.field1370 = arg2;
        this.field1371 = arg1;
        this.field1375 = arg4;
        this.field1368 = arg5;
        this.field1369 = arg3;
    }
}
