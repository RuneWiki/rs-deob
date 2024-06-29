import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!li")
public class class82 {

    @OriginalMember(owner = "client!li", name = "g", descriptor = "[Ldd;")
    private class259[] field1273;

    @OriginalMember(owner = "client!li", name = "a", descriptor = "I")
    public static int field1267;

    @OriginalMember(owner = "client!li", name = "b", descriptor = "I")
    public static int field1268;

    @OriginalMember(owner = "client!li", name = "c", descriptor = "I")
    public static int field1269;

    @OriginalMember(owner = "client!li", name = "f", descriptor = "I")
    public static int field1272;

    @OriginalMember(owner = "client!li", name = "e", descriptor = "Lwa;")
    public static class142 field1271;

    @OriginalMember(owner = "client!li", name = "d", descriptor = "[[B")
    public static byte[][] field1270;

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(I)V")
    public static void method639(int arg0) {
        field1271 = null;
        if (arg0 > -23) {
            method639(-69);
        }
        field1270 = null;
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(IZLjava/lang/String;)V")
    public static final void method640(int arg0, boolean arg1, String arg2) {
        field1268++;
        String var3 = arg2.toLowerCase();
        short[] var4 = new short[16];
        int var5 = arg1 ? 32768 : 0;
        int var6 = 0;
        int var7 = var5 + (arg1 ? class297.field4587 : class134.field1962);
        for (int var8 = var5; var8 < var7; var8++) {
            class245 var11 = class69.method544(1, var8);
            if (var11.field3816 && var11.method1676((byte) -80).toLowerCase().indexOf(var3) != -1) {
                if (var6 >= 50) {
                    class91.field1383 = null;
                    class181.field2637 = -1;
                    return;
                }
                if (var6 >= var4.length) {
                    short[] var12 = new short[var4.length * 2];
                    for (int var13 = 0; var13 < var6; var13++) {
                        var12[var13] = var4[var13];
                    }
                    var4 = var12;
                }
                var4[var6++] = (short) var8;
            }
        }
        class97.field1432 = 0;
        class181.field2637 = var6;
        class91.field1383 = var4;
        if (arg0 < 102) {
            field1270 = null;
        }
        String[] var9 = new String[class181.field2637];
        for (int var10 = 0; var10 < class181.field2637; var10++) {
            var9[var10] = class69.method544(1, var4[var10]).method1676((byte) -61);
        }
        class176.method1167(class91.field1383, var9, true);
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(BI)[B")
    public static final byte[] method641(byte arg0, int arg1) {
        if (arg0 >= -83) {
            field1270 = null;
        }
        class254 var2 = (class254) class156.field2289.method675(31558, (long) arg1);
        if (var2 == null) {
            byte[] var3 = new byte[512];
            Random var4 = new Random((long) arg1);
            for (int var5 = 0; var5 < 255; var5++) {
                var3[var5] = (byte) var5;
            }
            for (int var6 = 0; var6 < 255; var6++) {
                int var7 = 255 - var6;
                int var8 = class18.method129(var4, 113, var7);
                byte var9 = var3[var8];
                var3[var8] = var3[var7];
                var3[var7] = var3[511 - var6] = var9;
            }
            var2 = new class254(var3);
            class156.field2289.method677((byte) 126, (long) arg1, var2);
        }
        field1267++;
        return var2.field3921;
    }

    @OriginalMember(owner = "client!li", name = "<init>", descriptor = "(I)V")
    public class82(int arg0) {
        this.field1273 = new class259[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class259 var3 = this.field1273[var2] = new class259();
            var3.field3972 = var3;
            var3.field3973 = var3;
        }
    }

    @OriginalMember(owner = "client!li", name = "b", descriptor = "(I)V")
    public static final void method642(int arg0) {
        field1269++;
        if (class281.field4313 < 128.0F) {
            class281.field4313 = 128.0F;
        }
        if (class281.field4313 > 383.0F) {
            class281.field4313 = 383.0F;
        }
        while (class89.field1349 >= 2048.0F) {
            class89.field1349 -= 2048.0F;
        }
        while (class89.field1349 < 0.0F) {
            class89.field1349 += 2048.0F;
        }
        int var1 = class264.field4128 >> 7;
        if (arg0 != 10344) {
            method639(4);
        }
        int var2 = class110.field1635 >> 7;
        int var3 = class268.method1810(class260.field3986, class110.field1635, (byte) 118, class264.field4128);
        int var4 = 0;
        if (var2 > 3 && var1 > 3 && var2 < 100 && var1 < 100) {
            for (int var5 = var2 - 4; var5 <= var2 + 4; var5++) {
                for (int var6 = var1 - 4; var6 <= var1 + 4; var6++) {
                    int var7 = class260.field3986;
                    if (var7 < 3 && (class247.field3844[1][var5][var6] & 0x2) == 2) {
                        var7++;
                    }
                    int var8 = (class23.field383[var7][var5][var6] & 0xFF) * 8 + var3 - class166.field2451[var7][var5][var6];
                    if (var4 < var8) {
                        var4 = var8;
                    }
                }
            }
        }
        int var9 = var4 * 192;
        if (var9 > 98048) {
            var9 = 98048;
        }
        if (var9 < 32768) {
            var9 = 32768;
        }
        if (var9 > class175.field2565) {
            class175.field2565 += (var9 - class175.field2565) / 24;
        } else if (class175.field2565 > var9) {
            class175.field2565 += (var9 - class175.field2565) / 80;
        }
    }
}
