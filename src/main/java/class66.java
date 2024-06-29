import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!u")
public class class66 {

    @OriginalMember(owner = "client!u", name = "f", descriptor = "I")
    public static int field1222 = 0;

    @OriginalMember(owner = "client!u", name = "g", descriptor = "[C")
    public static char[] field1223 = new char[] { ' ', ' ', '_', '-', 'à', 'á', 'â', 'ä', 'ã', 'À', 'Á', 'Â', 'Ä', 'Ã', 'è', 'é', 'ê', 'ë', 'È', 'É', 'Ê', 'Ë', 'í', 'î', 'ï', 'Í', 'Î', 'Ï', 'ò', 'ó', 'ô', 'ö', 'õ', 'Ò', 'Ó', 'Ô', 'Ö', 'Õ', 'ù', 'ú', 'û', 'ü', 'Ù', 'Ú', 'Û', 'Ü', 'ç', 'Ç', 'ÿ', 'Ÿ', 'ñ', 'Ñ', 'ß' };

    @OriginalMember(owner = "client!u", name = "a", descriptor = "I")
    public static int field1217;

    @OriginalMember(owner = "client!u", name = "b", descriptor = "I")
    public static int field1218;

    @OriginalMember(owner = "client!u", name = "c", descriptor = "I")
    public static int field1219;

    @OriginalMember(owner = "client!u", name = "h", descriptor = "I")
    public static int field1224;

    @OriginalMember(owner = "client!u", name = "i", descriptor = "I")
    public static int field1225;

    @OriginalMember(owner = "client!u", name = "e", descriptor = "Ljava/util/zip/Inflater;")
    private Inflater field1221;

    @OriginalMember(owner = "client!u", name = "d", descriptor = "Z")
    public static boolean field1220;

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(Z)V")
    public static final void method669(boolean arg0) {
        field1219++;
        class48.field817 = 0;
        int var1 = class523.field7392.method3855(-2);
        boolean var2 = class523.field7392.method3851((byte) 30) == 1;
        int var3 = class523.field7392.method3851((byte) 30);
        int var4 = class523.field7392.method3859((byte) 76);
        class22.method277(arg0);
        class460.method2702(var3, 4);
        int var5 = (class418.field6098 - class523.field7392.field9761) / 16;
        class271.field4086 = new int[var5][4];
        for (int var6 = 0; var6 < var5; var6++) {
            for (int var10 = 0; var10 < 4; var10++) {
                class271.field4086[var6][var10] = class523.field7392.method3880(8);
            }
        }
        class248.field3860 = new int[var5];
        class549.field7718 = new int[var5];
        class583.field8197 = null;
        class475.field6774 = new byte[var5][];
        class44.field708 = new int[var5];
        class505.field7133 = new byte[var5][];
        class119.field1799 = new byte[var5][];
        class273.field4105 = new int[var5];
        class462.field6663 = null;
        class131.field1934 = new int[var5];
        class544.field7660 = new byte[var5][];
        int var7 = 0;
        for (int var8 = (var4 - (class199.field2812 >> 4)) / 8; var8 <= (var4 + (class199.field2812 >> 4)) / 8; var8++) {
            for (int var9 = (var1 - (class232.field3611 >> 4)) / 8; var9 <= ((class232.field3611 >> 4) + var1) / 8; var9++) {
                class273.field4105[var7] = (var8 << 8) + var9;
                class44.field708[var7] = class334.field4954.method2980(-9104, "m" + var8 + "_" + var9);
                class248.field3860[var7] = class334.field4954.method2980(-9104, "l" + var8 + "_" + var9);
                class549.field7718[var7] = class334.field4954.method2980(-9104, "um" + var8 + "_" + var9);
                class131.field1934[var7] = class334.field4954.method2980(-9104, "ul" + var8 + "_" + var9);
                var7++;
            }
        }
        class264.method1738(512, var4, var2, var1, 11);
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "([BLmo;B)V")
    public final void method670(byte[] arg0, class695 arg1, byte arg2) {
        field1217++;
        if (arg1.field9796[arg1.field9761] != 31 || arg1.field9796[arg1.field9761 + 1] != -117) {
            throw new RuntimeException("Invalid GZIP header!");
        }
        if (this.field1221 == null) {
            this.field1221 = new Inflater(true);
        }
        try {
            this.field1221.setInput(arg1.field9796, arg1.field9761 + 10, -arg1.field9761 + -10 - 8 + arg1.field9796.length);
            this.field1221.inflate(arg0);
            int var4 = 2 % ((53 - arg2) / 62);
        } catch (Exception var5) {
            this.field1221.reset();
            throw new RuntimeException("Invalid GZIP compressed data!");
        }
        this.field1221.reset();
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(B)V")
    public static void method671(byte arg0) {
        field1223 = null;
        int var1 = 55 / ((arg0 - 64) / 51);
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(III)Z")
    public static final boolean method672(int arg0, int arg1, int arg2) {
        if (arg0 != 235) {
            field1223 = null;
        }
        field1225++;
        return (arg2 & 0x20) != 0;
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(I[B)[B")
    public final byte[] method673(int arg0, byte[] arg1) {
        field1218++;
        class695 var3 = new class695(arg1);
        var3.field9761 = arg1.length - 4;
        int var4 = 103 % ((arg0 + 15) / 34);
        int var5 = var3.method3850(2);
        var3.field9761 = 0;
        byte[] var6 = new byte[var5];
        this.method670(var6, var3, (byte) 120);
        return var6;
    }

    @OriginalMember(owner = "client!u", name = "<init>", descriptor = "()V")
    public class66() {
        this(-1, 1000000, 1000000);
    }

    @OriginalMember(owner = "client!u", name = "<init>", descriptor = "(III)V")
    private class66(int arg0, int arg1, int arg2) {
    }
}
