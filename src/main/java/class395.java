import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eaa")
public class class395 extends class766 {

    @OriginalMember(owner = "client!eaa", name = "p", descriptor = "I")
    public volatile int field5466 = -1;

    @OriginalMember(owner = "client!eaa", name = "q", descriptor = "Ljava/lang/String;")
    public volatile String field5467;

    @OriginalMember(owner = "client!eaa", name = "o", descriptor = "Lrl;")
    public static class713 field5465 = new class713();

    @OriginalMember(owner = "client!eaa", name = "n", descriptor = "I")
    public static int field5464;

    @OriginalMember(owner = "client!eaa", name = "r", descriptor = "Lgga;")
    public static class513 field5468;

    @OriginalMember(owner = "client!eaa", name = "a", descriptor = "(III[B)Ljava/lang/String;")
    public static final String method2356(int arg0, int arg1, int arg2, byte[] arg3) {
        if (arg0 != -129) {
            field5468 = null;
        }
        field5464++;
        char[] var4 = new char[arg1];
        int var5 = 0;
        int var6 = arg2;
        int var7 = arg2 + arg1;
        while (var7 > var6) {
            int var8 = arg3[var6++] & 0xFF;
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
                if (var8 >= 240) {
                    if (var8 >= 248) {
                        var9 = 65533;
                    } else if ((var6 + 2) < var7 && (arg3[var6] & 0xC0) == 128 && (arg3[var6 + 1] & 0xC0) == 128 && (arg3[var6 + 2] & 0xC0) == 128) {
                        int var10 = arg3[var6++] & 0x3F << 12 | (var8 & 0x7) << 18 | (arg3[var6++] & 0x3F) << 6 | arg3[var6++] & 0x3F;
                        if (var10 >= 65536 && var10 <= 1114111) {
                            var9 = 65533;
                        } else {
                            var9 = 65533;
                        }
                    } else {
                        var9 = 65533;
                    }
                } else if (var7 > var6 + 1 && (arg3[var6] & 0xC0) == 128 && (arg3[var6 + 1] & 0xC0) == 128) {
                    var9 = (var8 & 0xF) << 12 | arg3[var6++] & 0x3F << 6 | arg3[var6++] & 0x3F;
                    if (var9 < 2048) {
                        var9 = 65533;
                    }
                } else {
                    var9 = 65533;
                }
            } else if (var7 > var6 && (arg3[var6] & 0xC0) == 128) {
                var9 = (var8 & 0x1F) << 6 | arg3[var6++] & 0x3F;
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

    @OriginalMember(owner = "client!eaa", name = "a", descriptor = "(B)V")
    public static void method2357(byte arg0) {
        field5465 = null;
        if (arg0 >= -18) {
            method2357((byte) 4);
        }
        field5468 = null;
    }

    @OriginalMember(owner = "client!eaa", name = "<init>", descriptor = "(Ljava/lang/String;)V")
    public class395(String arg0) {
        this.field5467 = arg0;
    }
}
