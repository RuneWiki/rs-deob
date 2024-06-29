import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rf")
public class class159 {

    @OriginalMember(owner = "client!rf", name = "c", descriptor = "Lsg;")
    public static class169 field3035 = class165.method1060(":assistreq:", 1536);

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "I")
    public static int field3033 = 0;

    @OriginalMember(owner = "client!rf", name = "h", descriptor = "[[[B")
    public static byte[][][] field3040 = new byte[4][104][104];

    @OriginalMember(owner = "client!rf", name = "g", descriptor = "Lsg;")
    public static class169 field3039 = class165.method1060("Verbindung mit Update)2Server)3)3)3", 1536);

    @OriginalMember(owner = "client!rf", name = "d", descriptor = "I")
    public static int field3036;

    @OriginalMember(owner = "client!rf", name = "e", descriptor = "I")
    public static int field3037;

    @OriginalMember(owner = "client!rf", name = "i", descriptor = "I")
    public static int field3041;

    @OriginalMember(owner = "client!rf", name = "f", descriptor = "[Lug;")
    public static class187[] field3038;

    @OriginalMember(owner = "client!rf", name = "b", descriptor = "[[[I")
    public static int[][][] field3034;

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(I)V")
    public static void method1020(int arg0) {
        if (arg0 != 16076) {
            method1023(-6, 45, 77, (byte) 104, -65);
        }
        field3039 = null;
        field3034 = null;
        field3040 = null;
        field3038 = null;
        field3035 = null;
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(BI)Ltc;")
    public static final class174 method1021(byte arg0, int arg1) {
        class174 var2 = (class174) class92.field1729.method1206((long) arg1, -24742);
        if (arg0 <= 3) {
            field3034 = null;
        }
        field3041++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class200.field3905.method552(arg1, 12, 0);
        class174 var4 = new class174();
        if (var3 != null) {
            var4.method1164(14025, new class127(var3));
        }
        var4.method1163(35);
        class92.field1729.method1208((long) arg1, -36, var4);
        return var4;
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(BILke;)Ljd;")
    public static final class85 method1022(byte arg0, int arg1, class95 arg2) {
        field3036++;
        if (arg0 == 40) {
            byte[] var3 = arg2.method558(arg1, -108);
            return var3 == null ? null : new class85(var3);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(IIIBI)V")
    public static final void method1023(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        field3037++;
        class87 var5 = (class87) class3.field59.method1045((long) arg0, (byte) -77);
        if (var5 == null) {
            var5 = new class87();
            class3.field59.method1044((long) arg0, true, var5);
        }
        if (arg1 >= var5.field1597.length) {
            int[] var6 = new int[arg1 + 1];
            int[] var7 = new int[arg1 + 1];
            for (int var8 = 0; var8 < var5.field1597.length; var8++) {
                var6[var8] = var5.field1597[var8];
                var7[var8] = var5.field1599[var8];
            }
            for (int var9 = var5.field1597.length; var9 < arg1; var9++) {
                var6[var9] = -1;
                var7[var9] = 0;
            }
            var5.field1597 = var6;
            var5.field1599 = var7;
        }
        var5.field1597[arg1] = arg2;
        if (arg3 != -64) {
            method1021((byte) -20, 15);
        }
        var5.field1599[arg1] = arg4;
    }
}
