import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gaa")
public class class433 implements class169 {

    @OriginalMember(owner = "client!gaa", name = "m", descriptor = "I")
    public int field6234;

    @OriginalMember(owner = "client!gaa", name = "l", descriptor = "I")
    public int field6233;

    @OriginalMember(owner = "client!gaa", name = "b", descriptor = "I")
    public int field6223;

    @OriginalMember(owner = "client!gaa", name = "g", descriptor = "I")
    public int field6228;

    @OriginalMember(owner = "client!gaa", name = "a", descriptor = "I")
    public int field6222;

    @OriginalMember(owner = "client!gaa", name = "e", descriptor = "Lvn;")
    public class186 field6226;

    @OriginalMember(owner = "client!gaa", name = "n", descriptor = "I")
    public int field6235;

    @OriginalMember(owner = "client!gaa", name = "i", descriptor = "I")
    public int field6230;

    @OriginalMember(owner = "client!gaa", name = "h", descriptor = "Lmf;")
    public class409 field6229;

    @OriginalMember(owner = "client!gaa", name = "f", descriptor = "I")
    public int field6227;

    @OriginalMember(owner = "client!gaa", name = "j", descriptor = "Z")
    public boolean field6231;

    @OriginalMember(owner = "client!gaa", name = "k", descriptor = "Leda;")
    public static class116 field6232 = new class116(20, 3);

    @OriginalMember(owner = "client!gaa", name = "o", descriptor = "[I")
    public static int[] field6236 = new int[3];

    @OriginalMember(owner = "client!gaa", name = "p", descriptor = "I")
    public static int field6237 = -1;

    @OriginalMember(owner = "client!gaa", name = "q", descriptor = "Ljn;")
    public static class117 field6238 = new class117(20);

    @OriginalMember(owner = "client!gaa", name = "r", descriptor = "I")
    public static int field6239 = 0;

    @OriginalMember(owner = "client!gaa", name = "c", descriptor = "I")
    public static int field6224;

    @OriginalMember(owner = "client!gaa", name = "d", descriptor = "I")
    public static int field6225;

    @OriginalMember(owner = "client!gaa", name = "a", descriptor = "(Z)V")
    public static void method2542(boolean arg0) {
        field6236 = null;
        field6238 = null;
        field6232 = null;
        if (!arg0) {
            field6239 = 47;
        }
    }

    @OriginalMember(owner = "client!gaa", name = "a", descriptor = "([BIZI)Ljava/lang/String;")
    public static final String method2543(byte[] arg0, int arg1, boolean arg2, int arg3) {
        field6225++;
        char[] var4 = new char[arg3];
        int var5 = 0;
        int var6 = arg1;
        int var7 = arg1 + arg3;
        if (arg2) {
            field6236 = null;
        }
        while (var7 > var6) {
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
                        var9 = (var8 & 0xF) << 12 | (arg0[var6++] & 0x3F) << 6 | arg0[var6++] & 0x3F;
                        if (var9 < 2048) {
                            var9 = 65533;
                        }
                    } else {
                        var9 = 65533;
                    }
                } else if (var8 >= 248) {
                    var9 = 65533;
                } else if ((var6 + 2) < var7 && (arg0[var6] & 0xC0) == 128 && (arg0[var6 + 1] & 0xC0) == 128 && (arg0[var6 + 2] & 0xC0) == 128) {
                    int var10 = (arg0[var6++] & 0x3F) << 12 | var8 & 0x7 << 18 | (arg0[var6++] & 0x3F) << 6 | arg0[var6++] & 0x3F;
                    if (var10 >= 65536 && var10 <= 1114111) {
                        var9 = 65533;
                    } else {
                        var9 = 65533;
                    }
                } else {
                    var9 = 65533;
                }
            } else if (var7 > var6 && (arg0[var6] & 0xC0) == 128) {
                var9 = arg0[var6++] & 0x3F | (var8 & 0x1F) << 6;
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

    @OriginalMember(owner = "client!gaa", name = "a", descriptor = "(I)Lkq;")
    public final class696 method726(int arg0) {
        if (arg0 != -17) {
            method2543(null, -73, false, 39);
        }
        field6224++;
        return class152.field2540;
    }

    @OriginalMember(owner = "client!gaa", name = "<init>", descriptor = "(ILvn;Lmf;IIIIIIIZ)V")
    public class433(int arg0, class186 arg1, class409 arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, boolean arg10) {
        this.field6234 = arg9;
        this.field6233 = arg8;
        this.field6223 = arg7;
        this.field6228 = arg3;
        this.field6222 = arg4;
        this.field6226 = arg1;
        this.field6235 = arg6;
        this.field6230 = arg5;
        this.field6229 = arg2;
        this.field6227 = arg0;
        this.field6231 = arg10;
    }
}
