import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kk")
public class class158 extends class130 {

    @OriginalMember(owner = "client!kk", name = "r", descriptor = "I")
    public int field2055;

    @OriginalMember(owner = "client!kk", name = "s", descriptor = "I")
    public int field2056;

    @OriginalMember(owner = "client!kk", name = "q", descriptor = "I")
    public static int field2054 = 2;

    @OriginalMember(owner = "client!kk", name = "n", descriptor = "[B")
    public static byte[] field2051;

    @OriginalMember(owner = "client!kk", name = "o", descriptor = "I")
    public static int field2052;

    @OriginalMember(owner = "client!kk", name = "p", descriptor = "I")
    public static int field2053;

    static {
        int var0 = 0;
        field2051 = new byte[32896];
        for (int var1 = 0; var1 < 256; var1++) {
            for (int var2 = 0; var2 <= var1; var2++) {
                field2051[var0++] = (byte) ((int) (255.0D / Math.sqrt((double) ((float) (var1 * var1 + var2 * var2 + 65535) / 65535.0F))));
            }
        }
    }

    @OriginalMember(owner = "client!kk", name = "b", descriptor = "(I)V", line = 5)
    public static void method899(int arg0) {
        int var1 = -41 / ((arg0 + 64) / 49);
        field2051 = null;
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(I)Lwea;", line = 18)
    public final class259 method235(int arg0) {
        field2052++;
        if (arg0 <= 38) {
            this.field2055 = -28;
        }
        return class551.field7693;
    }

    @OriginalMember(owner = "client!kk", name = "<init>", descriptor = "(Lct;Lrc;IIIIIIIII)V", line = 30)
    public class158(class414 arg0, class29 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
        this.field2055 = arg10;
        this.field2056 = arg9;
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(Ljava/lang/String;Z)Ljava/lang/String;", line = 39)
    public static final String method900(String arg0, boolean arg1) {
        field2053++;
        if (arg0 == null) {
            return null;
        }
        int var2 = 0;
        int var3 = arg0.length();
        while (var2 < var3 && class83.method479(0, arg0.charAt(var2))) {
            var2++;
        }
        while (var3 > var2 && class83.method479(0, arg0.charAt(var3 - 1))) {
            var3--;
        }
        if (!arg1) {
            field2054 = -114;
        }
        int var4 = var3 - var2;
        if (var4 < 1 || var4 > 12) {
            return null;
        }
        StringBuffer var5 = new StringBuffer(var4);
        for (int var6 = var2; var6 < var3; var6++) {
            char var7 = arg0.charAt(var6);
            if (class444.method2375((byte) 17, var7)) {
                char var8 = class39.method233((byte) -88, var7);
                if (var8 != '\u0000') {
                    var5.append(var8);
                }
            }
        }
        if (var5.length() == 0) {
            return null;
        } else {
            return var5.toString();
        }
    }
}
