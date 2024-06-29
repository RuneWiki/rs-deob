import java.io.UnsupportedEncodingException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ee")
public abstract class class265 extends class271 {

    @OriginalMember(owner = "client!ee", name = "B", descriptor = "Z")
    public volatile boolean field4575 = true;

    @OriginalMember(owner = "client!ee", name = "C", descriptor = "I")
    public static int field4576 = 0;

    @OriginalMember(owner = "client!ee", name = "I", descriptor = "Lwa;")
    public static class75 field4582 = class66.method560("<col=ff7000>", false);

    @OriginalMember(owner = "client!ee", name = "A", descriptor = "I")
    public static int field4574 = 0;

    @OriginalMember(owner = "client!ee", name = "E", descriptor = "I")
    public static int field4578;

    @OriginalMember(owner = "client!ee", name = "F", descriptor = "I")
    public static int field4579;

    @OriginalMember(owner = "client!ee", name = "H", descriptor = "I")
    public static int field4581;

    @OriginalMember(owner = "client!ee", name = "D", descriptor = "Z")
    public boolean field4577;

    @OriginalMember(owner = "client!ee", name = "G", descriptor = "Z")
    public boolean field4580;

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(BLjava/lang/String;)Lwa;", line = 18)
    public static final class75 method1885(byte arg0, String arg1) {
        byte[] var2;
        try {
            var2 = arg1.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException var7) {
            var2 = arg1.getBytes();
        }
        class75 var4 = new class75();
        field4579++;
        var4.field1280 = 0;
        var4.field1296 = var2;
        int var5 = -77 / ((10 - arg0) / 56);
        for (int var6 = 0; var6 < var2.length; var6++) {
            if (var2[var6] != 0) {
                var2[var4.field1280++] = var2[var6];
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(B)V", line = 49)
    public static void method1886(byte arg0) {
        field4582 = null;
        if (arg0 != -127) {
            field4574 = -110;
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(II)I", line = 70)
    public static final int method1887(int arg0, int arg1) {
        field4581++;
        int var2 = (arg0 >>> 1 & 0x55555555) + (arg0 & 0x55555555);
        int var3 = ((var2 & 0xCCCCCCCE) >>> 2) + (var2 & 0x33333333);
        int var4 = var3 + (var3 >>> 4) & 0xF0F0F0F;
        int var5 = (var4 >>> 8) + var4;
        int var6 = (var5 >>> 16) + var5;
        if (arg1 != 634549986) {
            method1885((byte) -19, (String) null);
        }
        return var6 & 0xFF;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(Lja;I)V", line = 94)
    public static final void method1888(class60 arg0, int arg1) {
        field4578++;
        if (arg1 > -105) {
            method1887(121, -87);
        }
        while (true) {
            while (arg0.field997.length > arg0.field1012) {
                boolean var2 = false;
                int var3 = 0;
                int var4 = 0;
                if (arg0.method501(0) == 1) {
                    var2 = true;
                    var3 = arg0.method501(0);
                    var4 = arg0.method501(0);
                }
                int var5 = arg0.method501(0);
                int var6 = arg0.method501(0);
                int var7 = class215.field3668 - (var6 * 64 + -class130.field2252) - 1;
                int var8 = var5 * 64 - class82.field1374;
                if (var8 >= 0 && var7 - 63 >= 0 && var8 + 63 < class39.field589 && class215.field3668 > var7) {
                    int var9 = var8 >> 6;
                    int var10 = var7 >> 6;
                    for (int var11 = 0; var11 < 64; var11++) {
                        for (int var12 = 0; var12 < 64; var12++) {
                            if (!var2 || var3 * 8 <= var11 && var3 * 8 + 8 > var11 && var12 >= var4 * 8 && var12 < var4 * 8 + 8) {
                                byte var13 = arg0.method511(-116);
                                if (var13 != 0) {
                                    if (class272.field4690[var9][var10] == null) {
                                        class272.field4690[var9][var10] = new byte[4096];
                                    }
                                    class272.field4690[var9][var10][(63 - var12 << 6) + var11] = var13;
                                    byte var14 = arg0.method511(-119);
                                    if (class297.field5081[var9][var10] == null) {
                                        class297.field5081[var9][var10] = new byte[4096];
                                    }
                                    class297.field5081[var9][var10][(63 - var12 << 6) + var11] = var14;
                                }
                            }
                        }
                    }
                } else {
                    for (int var15 = 0; var15 < (var2 ? 64 : 4096); var15++) {
                        byte var16 = arg0.method511(-117);
                        if (var16 != 0) {
                            arg0.field1012++;
                        }
                    }
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "client!ee", name = "f", descriptor = "(I)I")
    public abstract int method1756(int arg0);

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(Z)[B")
    public abstract byte[] method1751(boolean arg0);
}
