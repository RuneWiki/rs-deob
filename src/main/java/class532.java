import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ht")
public class class532 extends class306 {

    @OriginalMember(owner = "client!ht", name = "B", descriptor = "Ljava/lang/Object;")
    private Object field7252;

    @OriginalMember(owner = "client!ht", name = "z", descriptor = "I")
    public static int field7250 = 0;

    @OriginalMember(owner = "client!ht", name = "w", descriptor = "I")
    public static int field7247;

    @OriginalMember(owner = "client!ht", name = "x", descriptor = "I")
    public static int field7248;

    @OriginalMember(owner = "client!ht", name = "y", descriptor = "I")
    public static int field7249;

    @OriginalMember(owner = "client!ht", name = "A", descriptor = "I")
    public static int field7251;

    @OriginalMember(owner = "client!ht", name = "C", descriptor = "I")
    public static int field7253;

    @OriginalMember(owner = "client!ht", name = "f", descriptor = "(I)Ljava/lang/Object;", line = 5)
    public final Object method367(int arg0) {
        field7251++;
        return arg0 == -17290 ? this.field7252 : null;
    }

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "(I)Z", line = 17)
    public final boolean method366(int arg0) {
        field7253++;
        int var2 = -97 % ((70 - arg0) / 53);
        return false;
    }

    @OriginalMember(owner = "client!ht", name = "<init>", descriptor = "(Lwea;Ljava/lang/Object;I)V", line = 27)
    public class532(class142 arg0, Object arg1, int arg2) {
        super(arg0, arg2);
        this.field7252 = arg1;
    }

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;", line = 38)
    public static final String method2942(String arg0, int arg1) {
        field7248++;
        StringBuffer var2 = new StringBuffer();
        int var3 = arg0.length();
        int var4 = 32 / ((arg1 - 68) / 43);
        for (int var5 = 0; var5 < var3; var5++) {
            char var6 = arg0.charAt(var5);
            if (var6 == '%' && var3 > (var5 + 2)) {
                char var7 = arg0.charAt(var5 + 1);
                boolean var8 = false;
                int var9;
                if (var7 >= '0' && var7 <= '9') {
                    var9 = var7 - 48;
                } else if (var7 >= 'a' && var7 <= 'f') {
                    var9 = var7 + 10 - 97;
                } else {
                    if (var7 < 'A' || var7 > 'F') {
                        var2.append('%');
                        continue;
                    }
                    var9 = var7 + 10 - 65;
                }
                char var10 = arg0.charAt(var5 + 2);
                int var11 = var9 * 16;
                int var12;
                if (var10 >= '0' && var10 <= '9') {
                    var12 = var10 + var11 - 48;
                } else if (var10 >= 'a' && var10 <= 'f') {
                    var12 = var10 + var11 + '\n' - 97;
                } else {
                    if (var10 < 'A' || var10 > 'F') {
                        var2.append('%');
                        continue;
                    }
                    var12 = var10 + var11 + '\n' - 65;
                }
                var5 += 2;
                if (var12 != 0 && class316.method1933((byte) var12, 160)) {
                    var2.append(class274.method1671((byte) var12, true));
                }
            } else if (var6 == '+') {
                var2.append(' ');
            } else {
                var2.append(var6);
            }
        }
        return var2.toString();
    }

    @OriginalMember(owner = "client!ht", name = "b", descriptor = "(B)Lgh;", line = 116)
    public static final class503 method2943(byte arg0) {
        field7249++;
        class503 var1 = (class503) class676.field9546.method3678(-194);
        if (arg0 <= 87) {
            method2942(null, 53);
        }
        if (var1 == null) {
            return new class503();
        } else {
            class210.field3090--;
            return var1;
        }
    }
}
