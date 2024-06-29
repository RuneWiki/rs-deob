import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eha")
public class class98 {

    @OriginalMember(owner = "client!eha", name = "e", descriptor = "I")
    public int field1604;

    @OriginalMember(owner = "client!eha", name = "h", descriptor = "B")
    public byte field1607;

    @OriginalMember(owner = "client!eha", name = "l", descriptor = "I")
    public int field1611;

    @OriginalMember(owner = "client!eha", name = "k", descriptor = "I")
    public int field1610;

    @OriginalMember(owner = "client!eha", name = "d", descriptor = "S")
    public short field1603;

    @OriginalMember(owner = "client!eha", name = "i", descriptor = "I")
    public int field1608;

    @OriginalMember(owner = "client!eha", name = "j", descriptor = "S")
    public short field1609;

    @OriginalMember(owner = "client!eha", name = "c", descriptor = "S")
    public short field1602;

    @OriginalMember(owner = "client!eha", name = "f", descriptor = "I")
    public int field1605;

    @OriginalMember(owner = "client!eha", name = "g", descriptor = "Z")
    public boolean field1606;

    @OriginalMember(owner = "client!eha", name = "a", descriptor = "I")
    public static int field1600;

    @OriginalMember(owner = "client!eha", name = "b", descriptor = "[Lffa;")
    public static class199[] field1601;

    @OriginalMember(owner = "client!eha", name = "a", descriptor = "(Ljava/lang/String;IIZ)Z")
    public static final boolean method869(String arg0, int arg1, int arg2, boolean arg3) {
        field1600++;
        if (arg1 < 2 || arg1 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg1);
        }
        boolean var4 = false;
        boolean var5 = false;
        int var6 = 0;
        if (arg2 != 6114) {
            return true;
        }
        int var7 = arg0.length();
        for (int var8 = 0; var8 < var7; var8++) {
            char var9 = arg0.charAt(var8);
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
                return false;
            }
            if (arg1 <= var11) {
                return false;
            }
            if (var4) {
                var11 = -var11;
            }
            int var10 = arg1 * var6 + var11;
            if ((var10 / arg1) != var6) {
                return false;
            }
            var5 = true;
            var6 = var10;
        }
        return var5;
    }

    @OriginalMember(owner = "client!eha", name = "a", descriptor = "(I)V")
    public static void method870(int arg0) {
        if (arg0 != -31940) {
            field1601 = null;
        }
        field1601 = null;
    }

    @OriginalMember(owner = "client!eha", name = "<init>", descriptor = "(IIIIIIIIIZZI)V")
    public class98(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, boolean arg10, int arg11) {
        this.field1604 = arg11;
        this.field1607 = (byte) arg8;
        this.field1611 = arg1;
        this.field1610 = arg2;
        this.field1603 = (short) arg6;
        this.field1608 = arg0;
        this.field1609 = (short) arg5;
        this.field1602 = (short) arg4;
        this.field1605 = arg3;
        this.field1606 = arg10;
    }
}
