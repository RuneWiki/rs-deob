import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vv")
public class class640 {

    @OriginalMember(owner = "client!vv", name = "d", descriptor = "I")
    public int field9300;

    @OriginalMember(owner = "client!vv", name = "e", descriptor = "[I")
    public static int[] field9301 = new int[4096];

    @OriginalMember(owner = "client!vv", name = "g", descriptor = "Lvv;")
    public static class640 field9303 = new class640("LIVE", 0);

    @OriginalMember(owner = "client!vv", name = "a", descriptor = "I")
    public static int field9297;

    @OriginalMember(owner = "client!vv", name = "b", descriptor = "I")
    public static int field9298;

    @OriginalMember(owner = "client!vv", name = "c", descriptor = "I")
    public static int field9299;

    @OriginalMember(owner = "client!vv", name = "f", descriptor = "I")
    public static int field9302;

    @OriginalMember(owner = "client!vv", name = "a", descriptor = "(Ljava/lang/String;IZI)I", line = 4)
    public static final int method3705(String arg0, int arg1, boolean arg2, int arg3) {
        field9302++;
        if (arg3 < 2 || arg3 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg3);
        }
        boolean var4 = false;
        boolean var5 = false;
        int var6 = 0;
        int var7 = arg0.length();
        for (int var8 = 0; var8 < var7; var8++) {
            char var9 = arg0.charAt(var8);
            if (var8 == 0) {
                if (var9 == '-') {
                    var4 = true;
                    continue;
                }
                if (var9 == '+' && arg2) {
                    continue;
                }
            }
            int var11;
            if (var9 >= '0' && var9 <= '9') {
                var11 = var9 - '0';
            } else if (var9 >= 'A' && var9 <= 'Z') {
                var11 = var9 - '7';
            } else if (var9 >= 'a' && var9 <= 'z') {
                var11 = var9 - 'W';
            } else {
                throw new NumberFormatException();
            }
            if (arg3 <= var11) {
                throw new NumberFormatException();
            }
            if (var4) {
                var11 = -var11;
            }
            int var10 = arg3 * var6 + var11;
            if (var10 / arg3 != var6) {
                throw new NumberFormatException();
            }
            var6 = var10;
            var5 = true;
        }
        if (arg1 != -91) {
            method3707((byte) -97);
        }
        if (!var5) {
            throw new NumberFormatException();
        }
        return var6;
    }

    @OriginalMember(owner = "client!vv", name = "a", descriptor = "(I)I", line = 85)
    public final int method3706(int arg0) {
        field9298++;
        int var2 = -44 / ((arg0 + 81) / 45);
        return this.field9300;
    }

    @OriginalMember(owner = "client!vv", name = "a", descriptor = "(B)I", line = 100)
    public static final int method3707(byte arg0) {
        if (arg0 > -127) {
            field9301 = null;
        }
        field9297++;
        return class588.field8730;
    }

    @OriginalMember(owner = "client!vv", name = "toString", descriptor = "()Ljava/lang/String;", line = 111)
    public final String toString() {
        field9299++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!vv", name = "b", descriptor = "(B)V", line = 123)
    public static void method3708(byte arg0) {
        field9303 = null;
        if (arg0 != 72) {
            field9303 = null;
        }
        field9301 = null;
    }

    @OriginalMember(owner = "client!vv", name = "<init>", descriptor = "(Ljava/lang/String;I)V", line = 135)
    public class640(String arg0, int arg1) {
        this.field9300 = arg1;
    }
}
