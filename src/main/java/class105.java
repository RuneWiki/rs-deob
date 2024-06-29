import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ti")
public class class105 {

    @OriginalMember(owner = "client!ti", name = "c", descriptor = "Z")
    public static boolean field1519 = false;

    @OriginalMember(owner = "client!ti", name = "d", descriptor = "Lqj;")
    public static class196 field1520 = class80.method502(")4a=", -48);

    @OriginalMember(owner = "client!ti", name = "b", descriptor = "Ldf;")
    public static class231 field1518 = new class231(4096);

    @OriginalMember(owner = "client!ti", name = "f", descriptor = "Ljh;")
    public static class154 field1522 = new class154();

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "I")
    public static int field1517;

    @OriginalMember(owner = "client!ti", name = "e", descriptor = "I")
    public static int field1521;

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(I)V")
    public static void method640(int arg0) {
        field1522 = null;
        if (arg0 != -1) {
            method641(null, (byte) 115);
        }
        field1520 = null;
        field1518 = null;
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "([BB)V")
    public static final void method641(byte[] arg0, byte arg1) {
        if (arg1 > -95) {
            field1519 = true;
        }
        field1521++;
        int var2 = 0;
        while (true) {
            while (var2 < arg0.length) {
                int var3 = (arg0[var2++] & 0xFF) * 64 - class212.field3809;
                int var4 = (arg0[var2++] & 0xFF) * 64 - class83.field1203;
                if (var3 > 0 && var4 > 0 && var3 + 64 < class144.field2221 && var4 + 64 < class83.field1213) {
                    int var5 = class83.field1213 - var4 - 1 >> 6;
                    int var6 = var3 >> 6;
                    for (int var7 = 0; var7 < 64; var7++) {
                        for (int var8 = -64; var8 < 0; var8++) {
                            byte var9 = arg0[var2++];
                            if (var9 != 0) {
                                if (class92.field1349[var6][var5] == null) {
                                    class92.field1349[var6][var5] = new byte[4096];
                                }
                                class92.field1349[var6][var5][(-(var8 + 1) << 6) + var7] = var9;
                                byte var10 = arg0[var2++];
                                if (class104.field1500[var6][var5] == null) {
                                    class104.field1500[var6][var5] = new byte[4096];
                                }
                                class104.field1500[var6][var5][(-(var8 + 1) << 6) + var7] = var10;
                            }
                        }
                    }
                } else {
                    for (int var11 = -4096; var11 < 0; var11++) {
                        byte var12 = arg0[var2++];
                        if (var12 != 0) {
                            var2++;
                        }
                    }
                }
            }
            return;
        }
    }
}
