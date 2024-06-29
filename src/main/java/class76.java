import java.io.UnsupportedEncodingException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!d")
public class class76 {

    @OriginalMember(owner = "client!d", name = "g", descriptor = "I")
    public int field1508 = -1;

    @OriginalMember(owner = "client!d", name = "j", descriptor = "[I")
    public static int[] field1511 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!d", name = "m", descriptor = "Z")
    public static boolean field1514 = true;

    @OriginalMember(owner = "client!d", name = "a", descriptor = "I")
    public int field1502;

    @OriginalMember(owner = "client!d", name = "c", descriptor = "I")
    public static int field1504;

    @OriginalMember(owner = "client!d", name = "d", descriptor = "I")
    public int field1505;

    @OriginalMember(owner = "client!d", name = "e", descriptor = "I")
    public int field1506;

    @OriginalMember(owner = "client!d", name = "f", descriptor = "I")
    public static int field1507;

    @OriginalMember(owner = "client!d", name = "h", descriptor = "I")
    public int field1509;

    @OriginalMember(owner = "client!d", name = "i", descriptor = "I")
    public int field1510;

    @OriginalMember(owner = "client!d", name = "k", descriptor = "I")
    public int field1512;

    @OriginalMember(owner = "client!d", name = "l", descriptor = "I")
    public static int field1513;

    @OriginalMember(owner = "client!d", name = "n", descriptor = "I")
    public int field1515;

    @OriginalMember(owner = "client!d", name = "o", descriptor = "I")
    public int field1516;

    @OriginalMember(owner = "client!d", name = "b", descriptor = "[[B")
    public static byte[][] field1503;

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(IZ)I")
    public static final int method540(int arg0, boolean arg1) {
        field1513++;
        if (arg1) {
            field1511 = null;
        }
        return arg0 & 0xFF;
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(IIIILa;La;IIIIJ)V")
    public static final void method541(int arg0, int arg1, int arg2, int arg3, class20 arg4, class20 arg5, int arg6, int arg7, int arg8, int arg9, long arg10) {
        if (arg4 == null) {
            return;
        }
        class127 var12 = new class127();
        var12.field2390 = arg10;
        var12.field2375 = arg1 * 128 + 64;
        var12.field2378 = arg2 * 128 + 64;
        var12.field2387 = arg3;
        var12.field2384 = arg4;
        var12.field2386 = arg5;
        var12.field2388 = arg6;
        var12.field2385 = arg7;
        var12.field2382 = arg8;
        var12.field2389 = arg9;
        for (int var13 = arg0; var13 >= 0; var13--) {
            if (class110.field2124[var13][arg1][arg2] == null) {
                class110.field2124[var13][arg1][arg2] = new class16(var13, arg1, arg2);
            }
        }
        class110.field2124[arg0][arg1][arg2].field212 = var12;
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(I)V")
    public static void method542(int arg0) {
        if (arg0 != 8) {
            field1514 = false;
        }
        field1511 = null;
        field1503 = null;
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(ILjava/lang/String;)Lr;")
    public static final class66 method543(int arg0, String arg1) {
        byte[] var2;
        try {
            var2 = arg1.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException var5) {
            var2 = arg1.getBytes();
        }
        class66 var3 = new class66();
        var3.field1283 = var2;
        if (arg0 != 25732) {
            field1511 = null;
        }
        var3.field1308 = 0;
        field1507++;
        for (int var4 = 0; var4 < var2.length; var4++) {
            if (var2[var4] != 0) {
                var2[var3.field1308++] = var2[var4];
            }
        }
        return var3;
    }
}
