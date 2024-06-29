import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaa")
public class class528 extends class417 {

    @OriginalMember(owner = "client!jaa", name = "i", descriptor = "Ljava/lang/String;")
    public String field7892;

    @OriginalMember(owner = "client!jaa", name = "k", descriptor = "Lada;")
    public static class144 field7894 = new class144(71, -1);

    @OriginalMember(owner = "client!jaa", name = "j", descriptor = "I")
    public static int field7893;

    @OriginalMember(owner = "client!jaa", name = "a", descriptor = "(I)V", line = 5)
    public static void method3186(int arg0) {
        field7894 = null;
        if (arg0 != 97) {
            field7894 = null;
        }
    }

    @OriginalMember(owner = "client!jaa", name = "<init>", descriptor = "()V", line = 15)
    public class528() {
    }

    @OriginalMember(owner = "client!jaa", name = "<init>", descriptor = "(Ljava/lang/String;)V", line = 19)
    public class528(String arg0) {
        this.field7892 = arg0;
    }

    @OriginalMember(owner = "client!jaa", name = "a", descriptor = "(ZILjava/lang/String;B)I", line = 28)
    public static final int method3187(boolean arg0, int arg1, String arg2, byte arg3) {
        field7893++;
        if (arg1 < 2 || arg1 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg1);
        }
        if (arg3 != -106) {
            field7894 = null;
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
                if (var9 == '+' && arg0) {
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
            var6 = var10;
            var5 = true;
        }
        if (!var5) {
            throw new NumberFormatException();
        }
        return var6;
    }
}
