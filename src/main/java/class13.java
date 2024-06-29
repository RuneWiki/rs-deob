import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lg")
public class class13 {

    @OriginalMember(owner = "client!lg", name = "c", descriptor = "I")
    public static int field221 = 0;

    @OriginalMember(owner = "client!lg", name = "d", descriptor = "[J")
    public static long[] field222 = new long[500];

    @OriginalMember(owner = "client!lg", name = "i", descriptor = "I")
    public static int field227 = -1;

    @OriginalMember(owner = "client!lg", name = "j", descriptor = "Lta;")
    public static class262 field228 = new class262(2);

    @OriginalMember(owner = "client!lg", name = "k", descriptor = "Lgb;")
    public static class149 field229 = new class149();

    @OriginalMember(owner = "client!lg", name = "l", descriptor = "Lll;")
    public static class211 field230 = new class211(8);

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "I")
    public static int field219;

    @OriginalMember(owner = "client!lg", name = "b", descriptor = "I")
    public static int field220;

    @OriginalMember(owner = "client!lg", name = "e", descriptor = "I")
    public static int field223;

    @OriginalMember(owner = "client!lg", name = "f", descriptor = "I")
    public static int field224;

    @OriginalMember(owner = "client!lg", name = "g", descriptor = "I")
    public static int field225;

    @OriginalMember(owner = "client!lg", name = "h", descriptor = "I")
    public static int field226;

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(IIIII)V")
    public static final void method130(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field226++;
        int var5 = -arg0;
        class263.method1788(arg2 - arg0, -18732, arg4, class156.field2379[arg1], arg0 + arg2);
        if (arg3 < 56) {
            field230 = null;
        }
        int var6 = 0;
        int var7 = -1;
        int var8 = arg0;
        while (var6 < var8) {
            var7 += 2;
            var5 += var7;
            var6++;
            if (var5 >= 0) {
                var8--;
                int[] var9 = class156.field2379[arg1 - var8];
                int[] var10 = class156.field2379[arg1 + var8];
                var5 -= var8 << 1;
                int var11 = arg2 - var6;
                int var12 = arg2 + var6;
                class263.method1788(var11, -18732, arg4, var10, var12);
                class263.method1788(var11, -18732, arg4, var9, var12);
            }
            int var13 = arg2 + var8;
            int var14 = arg2 - var8;
            int[] var15 = class156.field2379[arg1 + var6];
            int[] var16 = class156.field2379[arg1 - var6];
            class263.method1788(var14, -18732, arg4, var15, var13);
            class263.method1788(var14, -18732, arg4, var16, var13);
        }
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(Z)V")
    public static void method131(boolean arg0) {
        field222 = null;
        field228 = null;
        if (!arg0) {
            field223 = 14;
        }
        field230 = null;
        field229 = null;
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(I)V")
    public static final void method132(int arg0) {
        field220++;
        if (class34.field544 != -1) {
            class9.method102(class34.field544, (byte) 96);
        }
        for (int var1 = 0; var1 < class145.field2254; var1++) {
            if (class37.field632[var1]) {
                class222.field3476[var1] = true;
            }
            class9.field185[var1] = class37.field632[var1];
            class37.field632[var1] = false;
        }
        class153.field2348 = class267.field4256;
        class123.field1929 = -1;
        if (arg0 < 74) {
            field229 = null;
        }
        class45.field722 = -1;
        class157.field2417 = null;
        if (class34.field544 != -1) {
            class145.field2254 = 0;
            class105.method803((byte) -118);
        }
        class201.method1344();
        class127.field1996 = 0;
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(IIIIII)Z")
    public static final boolean method133(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 != arg2 || arg3 != arg4) {
            for (int var8 = arg1; var8 <= arg2; var8++) {
                for (int var14 = arg3; var14 <= arg4; var14++) {
                    if (class5.field98[arg0][var8][var14] == -class90.field1449) {
                        return false;
                    }
                }
            }
            int var9 = (arg1 << 7) + 1;
            int var10 = (arg3 << 7) + 2;
            int var11 = class68.field1079[arg0][arg1][arg3] + arg5;
            if (!class80.method630(var9, var11, var10)) {
                return false;
            }
            int var12 = (arg2 << 7) - 1;
            if (!class80.method630(var12, var11, var10)) {
                return false;
            }
            int var13 = (arg4 << 7) - 1;
            if (!class80.method630(var9, var11, var13)) {
                return false;
            } else if (class80.method630(var12, var11, var13)) {
                return true;
            } else {
                return false;
            }
        } else if (class228.method1513(arg0, arg1, arg3)) {
            int var6 = arg1 << 7;
            int var7 = arg3 << 7;
            return class80.method630(var6 + 1, class68.field1079[arg0][arg1][arg3] + arg5, var7 + 1) && class80.method630(var6 + 128 - 1, class68.field1079[arg0][arg1 + 1][arg3] + arg5, var7 + 1) && class80.method630(var6 + 128 - 1, class68.field1079[arg0][arg1 + 1][arg3 + 1] + arg5, var7 + 128 - 1) && class80.method630(var6 + 1, class68.field1079[arg0][arg1][arg3 + 1] + arg5, var7 + 128 - 1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(Ljava/lang/String;B)[B")
    public static final byte[] method134(String arg0, byte arg1) {
        field224++;
        int var2 = arg0.length();
        byte[] var3 = new byte[var2];
        int var4 = -19 / ((17 - arg1) / 53);
        for (int var5 = 0; var5 < var2; var5++) {
            char var6 = arg0.charAt(var5);
            if (var6 > '\u0000' && var6 < '\u0080' || var6 >= ' ' && var6 <= 'ÿ') {
                var3[var5] = (byte) var6;
            } else if (var6 == '€') {
                var3[var5] = -128;
            } else if (var6 == '‚') {
                var3[var5] = -126;
            } else if (var6 == 'ƒ') {
                var3[var5] = -125;
            } else if (var6 == '„') {
                var3[var5] = -124;
            } else if (var6 == '…') {
                var3[var5] = -123;
            } else if (var6 == '†') {
                var3[var5] = -122;
            } else if (var6 == '‡') {
                var3[var5] = -121;
            } else if (var6 == 'ˆ') {
                var3[var5] = -120;
            } else if (var6 == '‰') {
                var3[var5] = -119;
            } else if (var6 == 'Š') {
                var3[var5] = -118;
            } else if (var6 == '‹') {
                var3[var5] = -117;
            } else if (var6 == 'Œ') {
                var3[var5] = -116;
            } else if (var6 == 'Ž') {
                var3[var5] = -114;
            } else if (var6 == '‘') {
                var3[var5] = -111;
            } else if (var6 == '’') {
                var3[var5] = -110;
            } else if (var6 == '“') {
                var3[var5] = -109;
            } else if (var6 == '”') {
                var3[var5] = -108;
            } else if (var6 == '•') {
                var3[var5] = -107;
            } else if (var6 == '–') {
                var3[var5] = -106;
            } else if (var6 == '—') {
                var3[var5] = -105;
            } else if (var6 == '˜') {
                var3[var5] = -104;
            } else if (var6 == '™') {
                var3[var5] = -103;
            } else if (var6 == 'š') {
                var3[var5] = -102;
            } else if (var6 == '›') {
                var3[var5] = -101;
            } else if (var6 == 'œ') {
                var3[var5] = -100;
            } else if (var6 == 'ž') {
                var3[var5] = -98;
            } else if (var6 == 'Ÿ') {
                var3[var5] = -97;
            } else {
                var3[var5] = 63;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(BLuf;)Z")
    public static final boolean method135(byte arg0, class176 arg1) {
        field219++;
        if (arg1.method1147(class283.field4474, -85)) {
            return true;
        } else if (arg0 > -91) {
            return false;
        } else {
            return false;
        }
    }
}
