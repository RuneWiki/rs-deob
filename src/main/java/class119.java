import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kd")
public class class119 {

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "I")
    public int field2095 = 0;

    @OriginalMember(owner = "client!kd", name = "d", descriptor = "[B")
    public static byte[] field2098 = new byte[] { 95, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57 };

    @OriginalMember(owner = "client!kd", name = "g", descriptor = "Loe;")
    public static class79 field2101 = new class79(16);

    @OriginalMember(owner = "client!kd", name = "j", descriptor = "Lhi;")
    private static class82 field2104 = class95.method664((byte) -62, "Unable to find ");

    @OriginalMember(owner = "client!kd", name = "k", descriptor = "Lhi;")
    public static class82 field2105 = null;

    @OriginalMember(owner = "client!kd", name = "h", descriptor = "Lhi;")
    public static class82 field2102 = field2104;

    @OriginalMember(owner = "client!kd", name = "l", descriptor = "F")
    public static float field2106;

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "I")
    public static int field2096;

    @OriginalMember(owner = "client!kd", name = "c", descriptor = "I")
    public static int field2097;

    @OriginalMember(owner = "client!kd", name = "e", descriptor = "I")
    public static int field2099;

    @OriginalMember(owner = "client!kd", name = "f", descriptor = "I")
    public static int field2100;

    @OriginalMember(owner = "client!kd", name = "i", descriptor = "Lum;")
    public static class222 field2103;

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(ILbc;I)V", line = 14)
    private final void method808(int arg0, class153 arg1, int arg2) {
        if (arg0 == 5) {
            this.field2095 = arg1.method1090(false);
        }
        if (arg2 >= 100) {
            field2096++;
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(ZBLhi;)V", line = 31)
    public static final void method809(boolean arg0, byte arg1, class82 arg2) {
        class82 var3 = arg2.method538((byte) -80);
        field2100++;
        short[] var4 = new short[16];
        if (arg1 < 82) {
            method810(107);
        }
        int var5 = 0;
        int var6 = arg0 ? 32768 : 0;
        int var7 = (arg0 ? class259.field4433 : class194.field3306) + var6;
        for (int var8 = var6; var8 < var7; var8++) {
            class194 var9 = class280.method1951(var8, 26029);
            if (var9.field3304 && var9.method1348(-109).method538((byte) -80).method563(81, var3) != -1) {
                if (var5 >= 50) {
                    class184.field3131 = -1;
                    class105.field1872 = null;
                    return;
                }
                if (var4.length <= var5) {
                    short[] var10 = new short[var4.length * 2];
                    for (int var11 = 0; var11 < var5; var11++) {
                        var10[var11] = var4[var11];
                    }
                    var4 = var10;
                }
                var4[var5++] = (short) var8;
            }
        }
        class254.field4380 = 0;
        class105.field1872 = var4;
        class184.field3131 = var5;
        class82[] var12 = new class82[class184.field3131];
        for (int var13 = 0; var13 < class184.field3131; var13++) {
            var12[var13] = class280.method1951(var4[var13], 26029).method1348(-65);
        }
        class35.method274(class105.field1872, var12, 110);
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(I)V", line = 106)
    public static void method810(int arg0) {
        if (arg0 <= 1) {
            return;
        }
        field2101 = null;
        field2102 = null;
        field2098 = null;
        field2104 = null;
        field2103 = null;
        field2105 = null;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(Lbc;I)V", line = 136)
    public final void method811(class153 arg0, int arg1) {
        field2099++;
        while (true) {
            int var3 = arg0.method1082(-32);
            if (var3 == 0) {
                if (arg1 <= 61) {
                    field2106 = 0.4796407F;
                }
                return;
            }
            this.method808(var3, arg0, 122);
        }
    }
}
