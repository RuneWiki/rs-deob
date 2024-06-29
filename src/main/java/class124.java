import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!r")
public class class124 {

    @OriginalMember(owner = "client!r", name = "d", descriptor = "[B")
    public static byte[] field1684 = new byte[2048];

    @OriginalMember(owner = "client!r", name = "a", descriptor = "I")
    public static int field1681;

    @OriginalMember(owner = "client!r", name = "b", descriptor = "I")
    public static int field1682;

    @OriginalMember(owner = "client!r", name = "c", descriptor = "I")
    public static int field1683;

    @OriginalMember(owner = "client!r", name = "e", descriptor = "I")
    public static int field1685;

    @OriginalMember(owner = "client!r", name = "f", descriptor = "I")
    public static int field1686;

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Ljp;B)V")
    public static final void method814(class241 arg0, byte arg1) {
        arg0.method1515(-2044015643);
        field1686++;
        int var2 = class343.field4982;
        class22 var3 = class246.field3587 = class378.field5355[var2] = new class22();
        var3.field3289 = var2;
        int var4 = arg0.method1520(-12494, 30);
        int var5 = 105 % ((arg1 - 12) / 59);
        byte var6 = (byte) (var4 >> 28);
        int var7 = var4 >> 14 & 0x3FFF;
        int var8 = var4 & 0x3FFF;
        var3.field3368[0] = var7 - class441.field6171;
        var3.field1896 = (var3.field3368[0] << 7) + (var3.method125((byte) -109) << 6);
        var3.field3378[0] = var8 - class367.field5241;
        var3.field1899 = (var3.field3378[0] << 7) + (var3.method125((byte) -83) << 6);
        class320.field4627 = var3.field1904 = var6;
        if (class226.field3255[var2] != null) {
            var3.method131(class226.field3255[var2], -1);
        }
        class144.field1908 = 0;
        class521.field7674[class144.field1908++] = var2;
        class395.field5603[var2] = 0;
        class187.field2693 = 0;
        for (int var9 = 1; var9 < 2048; var9++) {
            if (var2 != var9) {
                int var10 = arg0.method1520(-12494, 18);
                int var11 = var10 >> 16;
                int var12 = (var10 & 0xFFA1) >> 8;
                int var13 = var10 & 0xFF;
                class357 var14 = class309.field4501[var9] = new class357();
                var14.field5118 = 0;
                var14.field5120 = -1;
                var14.field5123 = (var12 << 14) + (var11 << 28) + var13;
                var14.field5126 = false;
                class236.field3440[class187.field2693++] = var9;
                class395.field5603[var9] = 0;
            }
        }
        arg0.method1514(false);
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(II)Ljava/lang/String;")
    public static final String method815(int arg0, int arg1) {
        field1681++;
        return arg1 == 255 ? (arg0 >> 24 & 0xFF) + "." + (arg0 >> 16 & 0xFF) + "." + (arg0 >> 8 & 0xFF) + "." + (arg0 & 0xFF) : null;
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(I)V")
    public static final void method816(int arg0) {
        field1683++;
        class302 var1 = null;
        try {
            class370 var2 = class268.field3914.method950(false, "3", 0);
            while (var2.field5277 == 0) {
                class52.method411(1L, (byte) 107);
            }
            if (var2.field5277 == 2) {
                throw new RuntimeException("Error opening file");
            }
            var1 = (class302) var2.field5274;
            byte[] var3 = new byte[(int) var1.method1843(107)];
            if (~var3.length == arg0) {
                class538.field7869 = "";
                class427.field6018 = "";
            } else {
                int var5;
                for (int var4 = 0; var4 < var3.length; var4 += var5) {
                    var5 = var1.method1842(var4, (byte) 39, var3, var3.length - var4);
                    if (var5 == -1) {
                        throw new IOException("EOF");
                    }
                }
                class403 var6 = new class403(var3);
                int var7 = var6.method2357((byte) 119);
                if (var7 > 50) {
                    throw new RuntimeException("Bad length");
                }
                var6.field5665 = var7 + 1;
                if (!var6.method2328((byte) -39)) {
                    throw new RuntimeException("Invalid CRC");
                }
                var6.field5665 = 1;
                int var8 = var6.method2357((byte) 121);
                if (var8 != 0) {
                    throw new RuntimeException("Invalid version " + var8);
                }
                class427.field6018 = var6.method2366(true);
                class538.field7869 = var6.method2366(true);
            }
        } catch (Exception var10) {
            class538.field7869 = "";
            class427.field6018 = "";
        }
        try {
            if (var1 != null) {
                var1.method1844((byte) 127);
            }
        } catch (Exception var9) {
        }
    }

    @OriginalMember(owner = "client!r", name = "b", descriptor = "(I)V")
    public static void method817(int arg0) {
        if (arg0 < 96) {
            method816(-74);
        }
        field1684 = null;
    }
}
