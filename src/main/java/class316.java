import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uq")
public class class316 {

    @OriginalMember(owner = "client!uq", name = "d", descriptor = "Z")
    public static boolean field4266 = false;

    @OriginalMember(owner = "client!uq", name = "b", descriptor = "I")
    public static int field4264 = 0;

    @OriginalMember(owner = "client!uq", name = "f", descriptor = "I")
    public static int field4268 = 0;

    @OriginalMember(owner = "client!uq", name = "g", descriptor = "Llc;")
    public static class435 field4269 = new class435(46, 0);

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "I")
    public static int field4263;

    @OriginalMember(owner = "client!uq", name = "c", descriptor = "I")
    public static int field4265;

    @OriginalMember(owner = "client!uq", name = "h", descriptor = "I")
    public static int field4270;

    @OriginalMember(owner = "client!uq", name = "e", descriptor = "Lla;")
    public static class423 field4267;

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(III)I")
    public static final int method1941(int arg0, int arg1, int arg2) {
        if (arg0 < 62) {
            return -48;
        } else {
            field4263++;
            int var3 = arg2 - 1 & arg1 >> 31;
            return ((arg1 >>> 31) + arg1) % arg2 + var3;
        }
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(I[BIZ)Ljava/lang/String;")
    public static final String method1942(int arg0, byte[] arg1, int arg2, boolean arg3) {
        if (!arg3) {
            return null;
        }
        field4270++;
        char[] var4 = new char[arg2];
        int var5 = 0;
        int var6 = arg0;
        int var7 = arg0 + arg2;
        while (var7 > var6) {
            int var8 = arg1[var6++] & 0xFF;
            int var10;
            if (var8 >= 128) {
                if (var8 < 192) {
                    var10 = 65533;
                } else if (var8 >= 224) {
                    if (var8 >= 240) {
                        if (var8 >= 248) {
                            var10 = 65533;
                        } else if ((var6 + 2) < var7 && (arg1[var6] & 0xC0) == 128 && (arg1[var6 + 1] & 0xC0) == 128 && (arg1[var6 + 2] & 0xC0) == 128) {
                            int var9 = arg1[var6++] & 0x3F << 12 | var8 << 18 & 0x1C0000 | arg1[var6++] & 0x3F << 6 | arg1[var6++] & 0x3F;
                            if (var9 >= 65536 && var9 <= 1114111) {
                                var10 = 65533;
                            } else {
                                var10 = 65533;
                            }
                        } else {
                            var10 = 65533;
                        }
                    } else if (var7 > var6 + 1 && (arg1[var6] & 0xC0) == 128 && (arg1[var6 + 1] & 0xC0) == 128) {
                        var10 = (var8 & 0xF) << 12 | arg1[var6++] & 0x3F << 6 | arg1[var6++] & 0x3F;
                        if (var10 < 2048) {
                            var10 = 65533;
                        }
                    } else {
                        var10 = 65533;
                    }
                } else if (var7 > var6 && (arg1[var6] & 0xC0) == 128) {
                    var10 = arg1[var6++] & 0x3F | var8 & 0x1F << 6;
                    if (var10 < 128) {
                        var10 = 65533;
                    }
                } else {
                    var10 = 65533;
                }
            } else if (var8 == 0) {
                var10 = 65533;
            } else {
                var10 = var8;
            }
            var4[var5++] = (char) var10;
        }
        return new String(var4, 0, var5);
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(B)V")
    public static void method1943(byte arg0) {
        field4269 = null;
        field4267 = null;
        if (arg0 != -68) {
            field4268 = -2;
        }
    }

    @OriginalMember(owner = "client!uq", name = "b", descriptor = "(III)Laca;")
    public static final class217 method1944(int arg0, int arg1, int arg2) {
        class375 var3 = class565.field8185[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class217 var4 = var3.field5432;
            var3.field5432 = null;
            class502.method3061(var4);
            return var4;
        }
    }
}
