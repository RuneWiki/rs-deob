import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ri")
public class class58 extends class248 {

    @OriginalMember(owner = "client!ri", name = "t", descriptor = "[I")
    public static int[] field889 = new int[256];

    @OriginalMember(owner = "client!ri", name = "w", descriptor = "I")
    public static int field892;

    @OriginalMember(owner = "client!ri", name = "z", descriptor = "Ljava/lang/String;")
    public static String field895;

    @OriginalMember(owner = "client!ri", name = "x", descriptor = "Ljl;")
    public static class231 field893;

    @OriginalMember(owner = "client!ri", name = "r", descriptor = "I")
    public static int field887;

    @OriginalMember(owner = "client!ri", name = "s", descriptor = "I")
    public static int field888;

    @OriginalMember(owner = "client!ri", name = "u", descriptor = "I")
    public static int field890;

    @OriginalMember(owner = "client!ri", name = "v", descriptor = "I")
    public static int field891;

    @OriginalMember(owner = "client!ri", name = "y", descriptor = "Z")
    public static boolean field894;

    @OriginalMember(owner = "client!ri", name = "A", descriptor = "[I")
    public static int[] field896;

    @OriginalMember(owner = "client!ri", name = "e", descriptor = "(I)V")
    public static void method386(int arg0) {
        field893 = null;
        field895 = null;
        if (arg0 == 1) {
            field889 = null;
            field896 = null;
        }
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(ILjava/lang/String;JZBILjava/lang/String;IIZZ)V")
    public static final void method387(int arg0, String arg1, long arg2, boolean arg3, byte arg4, int arg5, String arg6, int arg7, int arg8, boolean arg9, boolean arg10) {
        field891++;
        int[] var12 = new int[4];
        for (int var13 = 0; var13 < 3; var13++) {
            var12[var13] = (int) (Math.random() * 9.9999999E7D);
        }
        class114 var14 = new class114(128);
        var14.method775(10, -128);
        var14.method794((arg10 ? 4 : 0) | (arg3 ? 2 : 0) | (arg9 ? 1 : 0), (byte) -126);
        if (arg4 <= 72) {
            return;
        }
        var14.method765(532401312, arg2);
        var14.method737(-2645, var12[0]);
        var14.method734((byte) 7, arg1);
        var14.method737(-2645, var12[1]);
        var14.method794(class76.field1177, (byte) -74);
        var14.method775(arg5, -111);
        var14.method775(arg7, -119);
        var14.method737(-2645, var12[2]);
        var14.method794(arg8, (byte) -128);
        var14.method794(arg0, (byte) -43);
        var14.method737(-2645, var12[3]);
        var14.method744(class75.field1167, 20819, class101.field1502);
        class114 var15 = new class114(350);
        var15.method734((byte) -126, arg6);
        int var16 = 8 - (class136.method918((byte) 115, arg6) % 8);
        for (int var17 = 0; var17 < var16; var17++) {
            var15.method775((int) (Math.random() * 255.0D), -112);
        }
        var15.method767(609913776, var12);
        class95.field1451.field1673 = 0;
        class95.field1451.method775(22, -112);
        class95.field1451.method794(var14.field1673 + var15.field1673 + 2, (byte) -76);
        class95.field1451.method794(534, (byte) -43);
        class95.field1451.method774((byte) -128, var14.field1673, 0, var14.field1629);
        class95.field1451.method774((byte) -127, var15.field1673, 0, var15.field1629);
        class204.field2956 = -3;
        class81.field1251 = 1;
        class40.field591 = 0;
        class221.field3259 = 0;
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(BLve;Lve;)V")
    public static final void method388(byte arg0, class233 arg1, class233 arg2) {
        class134.field1948 = class5.method61(class213.field3050, (byte) -118, arg1, 0, arg2);
        field890++;
        class43.field624 = (class241) class134.field1948;
        class258.field3914 = class5.method61(class48.field702, (byte) -118, arg1, 0, arg2);
        if (arg0 != -45) {
            field895 = null;
        }
        class179.field2556 = class5.method61(class276.field4422, (byte) -118, arg1, 0, arg2);
    }

    @OriginalMember(owner = "client!ri", name = "f", descriptor = "(I)V")
    public static final void method389(int arg0) {
        field888++;
        class61.field931.method260(0);
        if (arg0 < 107) {
            method388((byte) -65, (class233) null, (class233) null);
        }
    }

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            int var1 = var0;
            for (int var2 = 0; var2 < 8; var2++) {
                if ((var1 & 0x1) == 1) {
                    var1 = var1 >>> 1 ^ 0xEDB88320;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field889[var0] = var1;
        }
        field892 = 7759444;
        field895 = "Loading world list data";
        field893 = new class231(64);
    }
}
