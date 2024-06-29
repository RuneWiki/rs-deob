import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qw")
public class class76 {

    @OriginalMember(owner = "client!qw", name = "a", descriptor = "Lbq;")
    public static class289 field799 = new class289();

    @OriginalMember(owner = "client!qw", name = "b", descriptor = "I")
    public static int field800;

    @OriginalMember(owner = "client!qw", name = "c", descriptor = "I")
    public static int field801;

    @OriginalMember(owner = "client!qw", name = "e", descriptor = "I")
    public static int field803;

    @OriginalMember(owner = "client!qw", name = "d", descriptor = "Lqv;")
    public static class444 field802;

    @OriginalMember(owner = "client!qw", name = "a", descriptor = "(ILjava/lang/String;ZB)I")
    public static final int method543(int arg0, String arg1, boolean arg2, byte arg3) {
        field800++;
        int var4 = -120 / ((arg3 + 69) / 42);
        if (arg0 < 2 || arg0 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg0);
        }
        boolean var5 = false;
        boolean var6 = false;
        int var7 = 0;
        int var8 = arg1.length();
        for (int var9 = 0; var9 < var8; var9++) {
            char var10 = arg1.charAt(var9);
            if (var9 == 0) {
                if (var10 == '-') {
                    var5 = true;
                    continue;
                }
                if (var10 == '+' && arg2) {
                    continue;
                }
            }
            int var12;
            if (var10 >= '0' && var10 <= '9') {
                var12 = var10 - '0';
            } else if (var10 >= 'A' && var10 <= 'Z') {
                var12 = var10 - '7';
            } else if (var10 >= 'a' && var10 <= 'z') {
                var12 = var10 - 'W';
            } else {
                throw new NumberFormatException();
            }
            if (var12 >= arg0) {
                throw new NumberFormatException();
            }
            if (var5) {
                var12 = -var12;
            }
            int var11 = arg0 * var7 + var12;
            if ((var11 / arg0) != var7) {
                throw new NumberFormatException();
            }
            var6 = true;
            var7 = var11;
        }
        if (!var6) {
            throw new NumberFormatException();
        }
        return var7;
    }

    @OriginalMember(owner = "client!qw", name = "a", descriptor = "(BD)V")
    public static final void method544(byte arg0, double arg1) {
        if (arg0 > -92) {
            return;
        }
        if (class398.field5448 != arg1) {
            for (int var3 = 0; var3 < 256; var3++) {
                int var4 = (int) (Math.pow((double) var3 / 255.0D, arg1) * 255.0D);
                class59.field617[var3] = var4 <= 255 ? var4 : 255;
            }
            class398.field5448 = arg1;
        }
        field803++;
    }

    @OriginalMember(owner = "client!qw", name = "a", descriptor = "(Ltp;III)V")
    public static final void method545(class532 arg0, int arg1, int arg2, int arg3) {
        field801++;
        if (arg0 == null) {
            return;
        }
        if (arg0.field7642 != null) {
            class622 var4 = new class622();
            var4.field8904 = arg0.field7642;
            var4.field8908 = arg0;
            class133.method859(var4);
        }
        class283.field3449 = arg0.field7704;
        class12.field96 = arg2;
        class192.field2266 = arg0.field7550;
        class568.field8075 = true;
        class61.field627 = arg0.field7599;
        class620.field8886 = arg0.field7628;
        class421.field6093 = arg0.field7691;
        if (arg3 != 30011) {
            method546(false);
        }
        class262.field3260 = arg1;
        class11.method50(arg0, (byte) -119);
    }

    @OriginalMember(owner = "client!qw", name = "a", descriptor = "(Z)V")
    public static void method546(boolean arg0) {
        field799 = null;
        if (arg0) {
            method546(false);
        }
        field802 = null;
    }
}
