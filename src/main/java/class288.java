import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fn")
public class class288 extends class329 {

    @OriginalMember(owner = "client!fn", name = "n", descriptor = "I")
    public int field3585;

    @OriginalMember(owner = "client!fn", name = "o", descriptor = "I")
    public int field3586;

    @OriginalMember(owner = "client!fn", name = "l", descriptor = "Ljava/lang/Object;")
    public static volatile Object field3583 = null;

    @OriginalMember(owner = "client!fn", name = "k", descriptor = "I")
    public static int field3582;

    @OriginalMember(owner = "client!fn", name = "m", descriptor = "I")
    public static int field3584;

    @OriginalMember(owner = "client!fn", name = "p", descriptor = "I")
    public static int field3587;

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "([I[Ljava/lang/Object;I)V", line = 3)
    public static final void method1618(int[] arg0, Object[] arg1, int arg2) {
        field3584++;
        if (arg2 <= 110) {
            method1618(null, null, 120);
        }
        class601.method3297(arg0.length - 1, arg0, arg1, 1, 0);
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(III)Z", line = 14)
    public static final boolean method1619(int arg0, int arg1, int arg2) {
        field3582++;
        if (arg0 == -44) {
            return (arg1 & 0x800) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(I)V", line = 33)
    public static void method1620(int arg0) {
        field3583 = null;
        if (arg0 > -88) {
            method1622((byte) 64, null, true, 11);
        }
    }

    @OriginalMember(owner = "client!fn", name = "<init>", descriptor = "(II)V", line = 43)
    public class288(int arg0, int arg1) {
        this.field3585 = arg1;
        this.field3586 = arg0;
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(IIII)V", line = 53)
    public static final void method1621(int arg0, int arg1, int arg2, int arg3) {
        class75 var4 = class270.field3423[arg0][arg1][arg2];
        if (var4 == null) {
            return;
        }
        class137 var5 = var4.field1022;
        class137 var6 = var4.field1034;
        if (var5 != null) {
            var5.field1783 = (short) (var5.field1783 * arg3 / (0x10 << class52.field775 - 7));
            var5.field1776 = (short) (var5.field1776 * arg3 / (0x10 << class52.field775 - 7));
        }
        if (var6 != null) {
            var6.field1783 = (short) (var6.field1783 * arg3 / (0x10 << class52.field775 - 7));
            var6.field1776 = (short) (var6.field1776 * arg3 / (0x10 << class52.field775 - 7));
        }
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(BLjava/lang/String;ZI)Z", line = 76)
    public static final boolean method1622(byte arg0, String arg1, boolean arg2, int arg3) {
        field3587++;
        if (arg3 < 2 || arg3 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg3);
        }
        boolean var4 = false;
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
                return false;
            }
            if (var11 >= arg3) {
                return false;
            }
            if (var4) {
                var11 = -var11;
            }
            int var10 = arg3 * var6 + var11;
            if (var10 / arg3 != var6) {
                return false;
            }
            var5 = true;
            var6 = var10;
        }
        if (arg0 != 8) {
            method1621(41, -21, 36, -4);
        }
        return var5;
    }
}
