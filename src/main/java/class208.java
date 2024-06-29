import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gm")
public class class208 {

    @OriginalMember(owner = "client!gm", name = "b", descriptor = "I")
    public static int field3142;

    @OriginalMember(owner = "client!gm", name = "c", descriptor = "I")
    public static int field3143;

    @OriginalMember(owner = "client!gm", name = "e", descriptor = "I")
    public static int field3145;

    @OriginalMember(owner = "client!gm", name = "f", descriptor = "Lgm;")
    public class208 field3146;

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "Lda;")
    public static class400 field3141;

    @OriginalMember(owner = "client!gm", name = "d", descriptor = "Ljf;")
    public class638 field3144;

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(ZI[B)V")
    public static final void method1483(boolean arg0, int arg1, byte[] arg2) {
        field3145++;
        if (arg1 != 20259) {
            field3141 = null;
        }
        if (class43.field716 == null) {
            class43.field716 = new class479(20000);
        }
        class43.field716.method2898(0, arg2, (byte) -115, arg2.length);
        if (!arg0) {
            return;
        }
        class422.method2587(false, class43.field716.field6800);
        class537.field7803 = new class592[class243.field3581];
        int var3 = 0;
        for (int var4 = class536.field7790; var4 <= class560.field8127; var4++) {
            class592 var5 = class613.method3569(32767, var4);
            if (var5 != null) {
                class537.field7803[var3++] = var5;
            }
        }
        class494.field7107 = false;
        class573.field8265 = class465.method2818(255);
        class43.field716 = null;
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(ILjava/lang/String;ZB)I")
    public static final int method1484(int arg0, String arg1, boolean arg2, byte arg3) {
        field3143++;
        if (arg0 < 2 || arg0 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg0);
        }
        boolean var4 = false;
        if (arg3 > -116) {
            field3141 = null;
        }
        boolean var5 = false;
        int var6 = 0;
        int var7 = arg1.length();
        for (int var8 = 0; var8 < var7; var8++) {
            char var9 = arg1.charAt(var8);
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
            if (arg0 <= var11) {
                throw new NumberFormatException();
            }
            if (var4) {
                var11 = -var11;
            }
            int var10 = arg0 * var6 + var11;
            if (var10 / arg0 != var6) {
                throw new NumberFormatException();
            }
            var5 = true;
            var6 = var10;
        }
        if (!var5) {
            throw new NumberFormatException();
        }
        return var6;
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(I)V")
    public final void method1485(int arg0) {
        if (arg0 != 32659) {
            return;
        }
        field3142++;
        if (class630.field8920 < 500) {
            this.field3146 = class82.field1154;
            this.field3144 = null;
            class630.field8920++;
            class82.field1154 = this;
        }
    }

    @OriginalMember(owner = "client!gm", name = "b", descriptor = "(I)V")
    public static void method1486(int arg0) {
        if (arg0 == 0) {
            field3141 = null;
        }
    }
}
