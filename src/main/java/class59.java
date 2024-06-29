import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fh")
public class class59 {

    @OriginalMember(owner = "client!fh", name = "o", descriptor = "Z")
    public boolean field1236 = true;

    @OriginalMember(owner = "client!fh", name = "p", descriptor = "I")
    public int field1237;

    @OriginalMember(owner = "client!fh", name = "e", descriptor = "I")
    public int field1226;

    @OriginalMember(owner = "client!fh", name = "j", descriptor = "I")
    public int field1231;

    @OriginalMember(owner = "client!fh", name = "h", descriptor = "I")
    public int field1229;

    @OriginalMember(owner = "client!fh", name = "q", descriptor = "I")
    public int field1238;

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "I")
    public int field1222;

    @OriginalMember(owner = "client!fh", name = "c", descriptor = "[I")
    public static int[] field1224 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @OriginalMember(owner = "client!fh", name = "i", descriptor = "Z")
    public static boolean field1230 = false;

    @OriginalMember(owner = "client!fh", name = "n", descriptor = "I")
    public static int field1235 = 0;

    @OriginalMember(owner = "client!fh", name = "f", descriptor = "[Ljd;")
    public static class92[] field1227 = new class92[1000];

    @OriginalMember(owner = "client!fh", name = "r", descriptor = "[[[B")
    public static byte[][][] field1239 = new byte[4][104][104];

    @OriginalMember(owner = "client!fh", name = "k", descriptor = "Ljd;")
    public static class92 field1232 = class202.method1325((byte) 90, "settings=");

    @OriginalMember(owner = "client!fh", name = "g", descriptor = "Ljd;")
    public static class92 field1228 = class202.method1325((byte) 90, "null");

    @OriginalMember(owner = "client!fh", name = "b", descriptor = "I")
    public static int field1223;

    @OriginalMember(owner = "client!fh", name = "l", descriptor = "I")
    public static int field1233;

    @OriginalMember(owner = "client!fh", name = "m", descriptor = "I")
    public static int field1234;

    @OriginalMember(owner = "client!fh", name = "d", descriptor = "Lnh;")
    public static class133 field1225;

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(B)V")
    public static final void method360(byte arg0) {
        if (arg0 != 17) {
            method361(-44, -33, 5, 46, null, null, 99, -120, -46, 103, 59L);
        }
        field1223++;
        class65.field1330.method923(arg0 - 112);
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(IIIILtg;Ltg;IIIIJ)V")
    public static final void method361(int arg0, int arg1, int arg2, int arg3, class186 arg4, class186 arg5, int arg6, int arg7, int arg8, int arg9, long arg10) {
        if (arg4 == null) {
            return;
        }
        class138 var12 = new class138();
        var12.field2759 = arg10;
        var12.field2765 = arg1 * 128 + 64;
        var12.field2761 = arg2 * 128 + 64;
        var12.field2764 = arg3;
        var12.field2775 = arg4;
        var12.field2772 = arg5;
        var12.field2763 = arg6;
        var12.field2770 = arg7;
        var12.field2760 = arg8;
        var12.field2771 = arg9;
        for (int var13 = arg0; var13 >= 0; var13--) {
            if (class31.field698[var13][arg1][arg2] == null) {
                class31.field698[var13][arg1][arg2] = new class43(var13, arg1, arg2);
            }
        }
        class31.field698[arg0][arg1][arg2].field953 = var12;
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(Lnh;Lnh;BLnh;Lnh;)V")
    public static final void method362(class133 arg0, class133 arg1, byte arg2, class133 arg3, class133 arg4) {
        field1233++;
        class205.field3952 = arg4;
        class190.field3673 = arg3;
        class99.field2018 = arg1;
        class174.field3362 = arg0;
        if (arg2 < 44) {
            method362(null, null, (byte) 49, null, null);
        }
        class60.field1256 = new class1[class190.field3673.method884((byte) -111)][];
        class155.field3089 = new boolean[class190.field3673.method884((byte) -81)];
    }

    @OriginalMember(owner = "client!fh", name = "<init>", descriptor = "(IIIIIIZ)V")
    public class59(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        this.field1237 = arg5;
        this.field1226 = arg0;
        this.field1236 = arg6;
        this.field1231 = arg3;
        this.field1229 = arg2;
        this.field1238 = arg1;
        this.field1222 = arg4;
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(I)V")
    public static void method363(int arg0) {
        field1239 = null;
        field1227 = null;
        if (arg0 != 9233) {
            method363(-20);
        }
        field1224 = null;
        field1228 = null;
        field1232 = null;
        field1225 = null;
    }
}
