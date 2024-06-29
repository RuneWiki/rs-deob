import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sc")
public class class266 extends InputStream {

    @OriginalMember(owner = "client!sc", name = "d", descriptor = "[[S")
    public static short[][] field4200 = new short[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

    @OriginalMember(owner = "client!sc", name = "e", descriptor = "Ljava/lang/String;")
    public static String field4201 = " from your friend list first.";

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "I")
    public static int field4197 = 0;

    @OriginalMember(owner = "client!sc", name = "i", descriptor = "J")
    public static long field4205 = 0L;

    @OriginalMember(owner = "client!sc", name = "c", descriptor = "I")
    public static int field4199 = 0;

    @OriginalMember(owner = "client!sc", name = "n", descriptor = "[J")
    public static long[] field4210 = new long[500];

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "I")
    public static int field4198;

    @OriginalMember(owner = "client!sc", name = "f", descriptor = "I")
    public static int field4202;

    @OriginalMember(owner = "client!sc", name = "g", descriptor = "I")
    public static int field4203;

    @OriginalMember(owner = "client!sc", name = "h", descriptor = "I")
    public static int field4204;

    @OriginalMember(owner = "client!sc", name = "k", descriptor = "I")
    public static int field4207;

    @OriginalMember(owner = "client!sc", name = "l", descriptor = "I")
    public static int field4208;

    @OriginalMember(owner = "client!sc", name = "m", descriptor = "I")
    public static int field4209;

    @OriginalMember(owner = "client!sc", name = "o", descriptor = "I")
    public static int field4211;

    @OriginalMember(owner = "client!sc", name = "j", descriptor = "[Llg;")
    public static class13[] field4206;

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(B)V")
    public static final void method1781(byte arg0) {
        field4204++;
        class183.field2900.method1763(-1);
        int var1 = class183.field2900.method1765(1, (byte) 88);
        if (arg0 < 11) {
            field4206 = null;
        }
        if (var1 == 0) {
            return;
        }
        int var2 = class183.field2900.method1765(2, (byte) 11);
        if (var2 == 0) {
            class147.field2179[class122.field1840++] = 2047;
        } else if (var2 == 1) {
            int var3 = class183.field2900.method1765(3, (byte) 109);
            class263.field4168.method1980((byte) -128, 1, var3);
            int var4 = class183.field2900.method1765(1, (byte) -117);
            if (var4 == 1) {
                class147.field2179[class122.field1840++] = 2047;
            }
        } else if (var2 == 2) {
            if (class183.field2900.method1765(1, (byte) -125) == 1) {
                int var5 = class183.field2900.method1765(3, (byte) 105);
                class263.field4168.method1980((byte) -127, 2, var5);
                int var6 = class183.field2900.method1765(3, (byte) 36);
                class263.field4168.method1980((byte) -127, 2, var6);
            } else {
                int var7 = class183.field2900.method1765(3, (byte) -117);
                class263.field4168.method1980((byte) -128, 0, var7);
            }
            int var8 = class183.field2900.method1765(1, (byte) -123);
            if (var8 == 1) {
                class147.field2179[class122.field1840++] = 2047;
            }
        } else if (var2 == 3) {
            int var9 = class183.field2900.method1765(7, (byte) -10);
            int var10 = class183.field2900.method1765(7, (byte) -29);
            class130.field1941 = class183.field2900.method1765(2, (byte) -115);
            int var11 = class183.field2900.method1765(1, (byte) -125);
            if (var11 == 1) {
                class147.field2179[class122.field1840++] = 2047;
            }
            int var12 = class183.field2900.method1765(1, (byte) -127);
            class263.field4168.method1014(var9, (byte) 103, var12 == 1, var10);
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(II)Lre;")
    public static final class237 method1782(int arg0, int arg1) {
        field4198++;
        class237 var2 = (class237) class154.field2286.method1361((byte) -95, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        if (arg1 < 98) {
            field4209 = -124;
        }
        byte[] var3 = class9.field159.method721((byte) -117, 5, arg0);
        class237 var4 = new class237();
        if (var3 != null) {
            var4.method1621((byte) -122, new class31(var3));
        }
        class154.field2286.method1365((long) arg0, (byte) 13, var4);
        return var4;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(I)V")
    public static void method1783(int arg0) {
        field4201 = null;
        if (arg0 > 104) {
            field4200 = null;
            field4206 = null;
            field4210 = null;
        }
    }

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "(B)Lej;")
    public static final class51 method1784(byte arg0) {
        field4202++;
        int var1 = class170.field2583[0] * class104.field1621[0];
        byte[] var2 = class301.field4847[0];
        int[] var3 = new int[var1];
        for (int var4 = 0; var4 < var1; var4++) {
            var3[var4] = class102.field1585[class118.method863(var2[var4], 255)];
        }
        if (arg0 >= -3) {
            field4205 = 3L;
        }
        class51 var5 = new class51(class214.field3278, class234.field3705, class196.field3069[0], class125.field1877[0], class104.field1621[0], class170.field2583[0], var3);
        class30.method254(2);
        return var5;
    }

    @OriginalMember(owner = "client!sc", name = "read", descriptor = "()I")
    public final int read() {
        class122.method922(30000L, (byte) -93);
        field4208++;
        return -1;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(IC)B")
    public static final byte method1785(int arg0, char arg1) {
        field4207++;
        if (arg0 != 28035) {
            return -107;
        }
        byte var2;
        if (!(arg1 <= '\u0000' || arg1 >= '\u0080') || !(arg1 < ' ' || arg1 > 'ÿ')) {
            var2 = (byte) arg1;
        } else if (arg1 == '€') {
            var2 = -128;
        } else if (arg1 == '‚') {
            var2 = -126;
        } else if (arg1 == 'ƒ') {
            var2 = -125;
        } else if (arg1 == '„') {
            var2 = -124;
        } else if (arg1 == '…') {
            var2 = -123;
        } else if (arg1 == '†') {
            var2 = -122;
        } else if (arg1 == '‡') {
            var2 = -121;
        } else if (arg1 == 'ˆ') {
            var2 = -120;
        } else if (arg1 == '‰') {
            var2 = -119;
        } else if (arg1 == 'Š') {
            var2 = -118;
        } else if (arg1 == '‹') {
            var2 = -117;
        } else if (arg1 == 'Œ') {
            var2 = -116;
        } else if (arg1 == 'Ž') {
            var2 = -114;
        } else if (arg1 == '‘') {
            var2 = -111;
        } else if (arg1 == '’') {
            var2 = -110;
        } else if (arg1 == '“') {
            var2 = -109;
        } else if (arg1 == '”') {
            var2 = -108;
        } else if (arg1 == '•') {
            var2 = -107;
        } else if (arg1 == '–') {
            var2 = -106;
        } else if (arg1 == '—') {
            var2 = -105;
        } else if (arg1 == '˜') {
            var2 = -104;
        } else if (arg1 == '™') {
            var2 = -103;
        } else if (arg1 == 'š') {
            var2 = -102;
        } else if (arg1 == '›') {
            var2 = -101;
        } else if (arg1 == 'œ') {
            var2 = -100;
        } else if (arg1 == 'ž') {
            var2 = -98;
        } else if (arg1 == 'Ÿ') {
            var2 = -97;
        } else {
            var2 = 63;
        }
        return var2;
    }
}
