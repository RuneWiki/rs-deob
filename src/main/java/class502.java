import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hha")
public class class502 {

    @OriginalMember(owner = "client!hha", name = "a", descriptor = "I")
    public static int field7282;

    @OriginalMember(owner = "client!hha", name = "b", descriptor = "I")
    public static int field7283;

    @OriginalMember(owner = "client!hha", name = "a", descriptor = "([BIII)Ljava/lang/String;", line = 5)
    public static final String method3037(byte[] arg0, int arg1, int arg2, int arg3) {
        if (arg3 != -129) {
            return null;
        }
        field7283++;
        char[] var4 = new char[arg2];
        int var5 = 0;
        int var6 = arg1;
        int var7 = arg1 + arg2;
        while (var7 > var6) {
            int var8 = arg0[var6++] & 0xFF;
            int var9;
            if (var8 >= 128) {
                if (var8 < 192) {
                    var9 = 65533;
                } else if (var8 < 224) {
                    if (var6 < var7 && (arg0[var6] & 0xC0) == 128) {
                        var9 = arg0[var6++] & 0x3F | var8 & 0x1F << 6;
                        if (var9 < 128) {
                            var9 = 65533;
                        }
                    } else {
                        var9 = 65533;
                    }
                } else if (var8 < 240) {
                    if ((var6 + 1) < var7 && (arg0[var6] & 0xC0) == 128 && (arg0[var6 + 1] & 0xC0) == 128) {
                        var9 = (arg0[var6++] & 0x3F) << 6 | var8 & 0xF << 12 | arg0[var6++] & 0x3F;
                        if (var9 < 2048) {
                            var9 = 65533;
                        }
                    } else {
                        var9 = 65533;
                    }
                } else if (var8 >= 248) {
                    var9 = 65533;
                } else if (var6 + 2 < var7 && (arg0[var6] & 0xC0) == 128 && (arg0[var6 + 1] & 0xC0) == 128 && (arg0[var6 + 2] & 0xC0) == 128) {
                    int var10 = var8 & 0x7 << 18 | arg0[var6++] << 12 & 0x3F000 | (arg0[var6++] & 0x3F) << 6 | arg0[var6++] & 0x3F;
                    if (var10 >= 65536 && var10 <= 1114111) {
                        var9 = 65533;
                    } else {
                        var9 = 65533;
                    }
                } else {
                    var9 = 65533;
                }
            } else if (var8 == 0) {
                var9 = 65533;
            } else {
                var9 = var8;
            }
            var4[var5++] = (char) var9;
        }
        return new String(var4, 0, var5);
    }

    @OriginalMember(owner = "client!hha", name = "a", descriptor = "(III)Z", line = 101)
    public static final boolean method3038(int arg0, int arg1, int arg2) {
        field7282++;
        int var3 = -125 / ((-arg2 - 6) / 62);
        return (arg0 & 0x22) != 0;
    }
}
