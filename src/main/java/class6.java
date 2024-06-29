import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kr")
public class class6 extends class381 {

    @OriginalMember(owner = "client!kr", name = "n", descriptor = "Ljava/lang/String;")
    public String field43;

    @OriginalMember(owner = "client!kr", name = "m", descriptor = "I")
    public static int field42;

    @OriginalMember(owner = "client!kr", name = "l", descriptor = "Lk;")
    public static class293 field41;

    @OriginalMember(owner = "client!kr", name = "c", descriptor = "(I)V", line = 4)
    public static void method35(int arg0) {
        if (arg0 != 45) {
            field41 = null;
        }
        field41 = null;
    }

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(IILjava/lang/String;Z)I", line = 14)
    public static final int method36(int arg0, int arg1, String arg2, boolean arg3) {
        field42++;
        if (arg1 < 2 || arg1 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg1);
        }
        boolean var4 = false;
        boolean var5 = false;
        int var6 = 0;
        int var7 = arg2.length();
        for (int var8 = 0; var8 < var7; var8++) {
            char var9 = arg2.charAt(var8);
            if (var8 == 0) {
                if (var9 == '-') {
                    var4 = true;
                    continue;
                }
                if (var9 == '+' && arg3) {
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
            if (arg1 <= var11) {
                throw new NumberFormatException();
            }
            if (var4) {
                var11 = -var11;
            }
            int var10 = arg1 * var6 + var11;
            if ((var10 / arg1) != var6) {
                throw new NumberFormatException();
            }
            var5 = true;
            var6 = var10;
        }
        if (arg0 <= 60) {
            method35(113);
        }
        if (!var5) {
            throw new NumberFormatException();
        }
        return var6;
    }

    @OriginalMember(owner = "client!kr", name = "<init>", descriptor = "()V", line = 98)
    public class6() {
    }

    @OriginalMember(owner = "client!kr", name = "<init>", descriptor = "(Ljava/lang/String;I)V", line = 100)
    public class6(String arg0, int arg1) {
        this.field43 = arg0;
    }
}
