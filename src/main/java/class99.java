import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iv")
public class class99 {

    @OriginalMember(owner = "client!iv", name = "a", descriptor = "Laea;")
    public static class50 field1265 = new class50();

    @OriginalMember(owner = "client!iv", name = "c", descriptor = "Lht;")
    public static class582 field1267 = new class582(3, 19);

    @OriginalMember(owner = "client!iv", name = "g", descriptor = "Lqr;")
    public static class65 field1271 = new class65(8);

    @OriginalMember(owner = "client!iv", name = "b", descriptor = "I")
    public static int field1266;

    @OriginalMember(owner = "client!iv", name = "d", descriptor = "I")
    public static int field1268;

    @OriginalMember(owner = "client!iv", name = "f", descriptor = "I")
    public static int field1270;

    @OriginalMember(owner = "client!iv", name = "e", descriptor = "[J")
    public static long[] field1269;

    @OriginalMember(owner = "client!iv", name = "a", descriptor = "(I)V", line = 3)
    public static void method732(int arg0) {
        field1269 = null;
        field1265 = null;
        field1267 = null;
        field1271 = null;
        if (arg0 != 128) {
            field1269 = null;
        }
    }

    @OriginalMember(owner = "client!iv", name = "b", descriptor = "(I)V", line = 17)
    public static final void method733(int arg0) {
        field1266++;
        class490.field6652.method561((byte) -78);
        if (arg0 != 1235398604) {
            field1271 = null;
        }
    }

    @OriginalMember(owner = "client!iv", name = "a", descriptor = "([BIII)Ljava/lang/String;", line = 47)
    public static final String method734(byte[] arg0, int arg1, int arg2, int arg3) {
        field1268++;
        char[] var4 = new char[arg1];
        int var5 = 0;
        int var6 = arg2;
        int var7 = arg2 + arg1;
        if (arg3 < 101) {
            method732(1);
        }
        while (var6 < var7) {
            int var8 = arg0[var6++] & 0xFF;
            int var9;
            if (var8 < 128) {
                if (var8 == 0) {
                    var9 = 65533;
                } else {
                    var9 = var8;
                }
            } else if (var8 < 192) {
                var9 = 65533;
            } else if (var8 >= 224) {
                if (var8 < 240) {
                    if ((var6 + 1) < var7 && (arg0[var6] & 0xC0) == 128 && (arg0[var6 + 1] & 0xC0) == 128) {
                        var9 = (var8 & 0xF) << 12 | arg0[var6++] & 0x3F << 6 | arg0[var6++] & 0x3F;
                        if (var9 < 2048) {
                            var9 = 65533;
                        }
                    } else {
                        var9 = 65533;
                    }
                } else if (var8 >= 248) {
                    var9 = 65533;
                } else if (var6 + 2 < var7 && (arg0[var6] & 0xC0) == 128 && (arg0[var6 + 1] & 0xC0) == 128 && (arg0[var6 + 2] & 0xC0) == 128) {
                    int var10 = arg0[var6++] & 0x3F << 12 | var8 << 18 & 0x1C0000 | arg0[var6++] & 0x3F << 6 | arg0[var6++] & 0x3F;
                    if (var10 >= 65536 && var10 <= 1114111) {
                        var9 = 65533;
                    } else {
                        var9 = 65533;
                    }
                } else {
                    var9 = 65533;
                }
            } else if (var6 < var7 && (arg0[var6] & 0xC0) == 128) {
                var9 = arg0[var6++] & 0x3F | var8 & 0x1F << 6;
                if (var9 < 128) {
                    var9 = 65533;
                }
            } else {
                var9 = 65533;
            }
            var4[var5++] = (char) var9;
        }
        return new String(var4, 0, var5);
    }
}
