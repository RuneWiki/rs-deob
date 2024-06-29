import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nl")
public class class475 {

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "I")
    public int field7025 = -1;

    @OriginalMember(owner = "client!nl", name = "f", descriptor = "Llo;")
    public static class306 field7030 = new class306("rating: ", "Kampfstufe: ", "classement ", "qualificação: ");

    @OriginalMember(owner = "client!nl", name = "o", descriptor = "I")
    public static int field7039 = 0;

    @OriginalMember(owner = "client!nl", name = "b", descriptor = "I")
    public int field7026;

    @OriginalMember(owner = "client!nl", name = "c", descriptor = "I")
    public static int field7027;

    @OriginalMember(owner = "client!nl", name = "d", descriptor = "I")
    public int field7028;

    @OriginalMember(owner = "client!nl", name = "e", descriptor = "I")
    public int field7029;

    @OriginalMember(owner = "client!nl", name = "g", descriptor = "I")
    public static int field7031;

    @OriginalMember(owner = "client!nl", name = "h", descriptor = "I")
    public int field7032;

    @OriginalMember(owner = "client!nl", name = "i", descriptor = "I")
    public static int field7033;

    @OriginalMember(owner = "client!nl", name = "j", descriptor = "I")
    public int field7034;

    @OriginalMember(owner = "client!nl", name = "k", descriptor = "I")
    public int field7035;

    @OriginalMember(owner = "client!nl", name = "l", descriptor = "I")
    public static int field7036;

    @OriginalMember(owner = "client!nl", name = "m", descriptor = "I")
    public int field7037;

    @OriginalMember(owner = "client!nl", name = "p", descriptor = "I")
    public int field7040;

    @OriginalMember(owner = "client!nl", name = "n", descriptor = "Lc;")
    public static class202 field7038;

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(B)V", line = 3)
    public static void method2806(byte arg0) {
        field7038 = null;
        if (arg0 >= 112) {
            field7030 = null;
        }
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(IIZLjava/lang/String;)Z", line = 20)
    public static final boolean method2807(int arg0, int arg1, boolean arg2, String arg3) {
        field7027++;
        if (arg1 != 55) {
            return false;
        } else if (arg0 >= 2 && arg0 <= 36) {
            boolean var4 = false;
            boolean var5 = false;
            int var6 = 0;
            int var7 = arg3.length();
            for (int var8 = 0; var8 < var7; var8++) {
                char var9 = arg3.charAt(var8);
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
                    return false;
                }
                if (arg0 <= var11) {
                    return false;
                }
                if (var4) {
                    var11 = -var11;
                }
                int var10 = arg0 * var6 + var11;
                if ((var10 / arg0) != var6) {
                    return false;
                }
                var6 = var10;
                var5 = true;
            }
            return var5;
        } else {
            throw new IllegalArgumentException("Invalid radix:" + arg0);
        }
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(Z)V", line = 98)
    public static final void method2808(boolean arg0) {
        if (arg0) {
            class66.field977 = class213.field3395;
            class360.field5592 = class320.field5039;
        } else {
            class66.field977 = class417.field6321;
            class360.field5592 = class511.field7488;
        }
        class76.field1315 = class66.field977.length;
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(IZ)Lvi;", line = 128)
    public static final class206 method2809(int arg0, boolean arg1) {
        field7036++;
        class206[] var2 = class453.method2709((byte) 94);
        int var3 = 0;
        if (!arg1) {
            return null;
        }
        while (var2.length > var3) {
            class206 var4 = var2[var3];
            if (var4.field3259 == arg0) {
                return var4;
            }
            var3++;
        }
        return null;
    }
}
