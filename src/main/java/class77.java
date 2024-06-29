import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bi")
public class class77 {

    @OriginalMember(owner = "client!bi", name = "e", descriptor = "Z")
    public static boolean field1175 = false;

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "I")
    public static int field1171;

    @OriginalMember(owner = "client!bi", name = "b", descriptor = "I")
    public static int field1172;

    @OriginalMember(owner = "client!bi", name = "c", descriptor = "I")
    public static int field1173;

    @OriginalMember(owner = "client!bi", name = "d", descriptor = "I")
    public static int field1174;

    @OriginalMember(owner = "client!bi", name = "f", descriptor = "I")
    public static int field1176;

    @OriginalMember(owner = "client!bi", name = "h", descriptor = "I")
    public static int field1178;

    @OriginalMember(owner = "client!bi", name = "g", descriptor = "Lvl;")
    public static class73 field1177;

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(IB)Lqg;")
    public static final class230 method526(int arg0, byte arg1) {
        field1173++;
        class230 var2 = (class230) class254.field4148.method1517((long) arg0, (byte) 92);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class187.field2936.method501(-2, arg0, 1);
        class230 var4 = new class230();
        if (var3 != null) {
            var4.method1617(arg0, false, new class170(var3));
        }
        class254.field4148.method1518(var4, (long) arg0, (byte) 75);
        return arg1 >= -79 ? null : var4;
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(IIIIII)V")
    public static final void method527(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field1171++;
        if (class56.field816 <= arg0 && class187.field2938 >= arg2 && arg4 >= class115.field1678 && arg5 <= class60.field882) {
            class240.method1696(arg2, arg5, arg4, arg3, arg0, 28443);
        } else {
            class80.method543(arg0, arg2, arg4, arg5, arg1 - 65, arg3);
        }
        if (arg1 != 64) {
            field1177 = null;
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(IIIILsc;JLsc;Lsc;)V")
    public static final void method528(int arg0, int arg1, int arg2, int arg3, class248 arg4, long arg5, class248 arg6, class248 arg7) {
        class123 var9 = new class123();
        var9.field1765 = arg4;
        var9.field1764 = arg1 * 128 + 64;
        var9.field1770 = arg2 * 128 + 64;
        var9.field1768 = arg3;
        var9.field1774 = arg5;
        var9.field1777 = arg6;
        var9.field1767 = arg7;
        int var10 = 0;
        class113 var11 = class184.field2892[arg0][arg1][arg2];
        if (var11 != null) {
            for (int var12 = 0; var12 < var11.field1646; var12++) {
                class158 var13 = var11.field1634[var12];
                if ((var13.field2354 & 0x400000L) == 4194304L) {
                    int var14 = var13.field2365.method4();
                    if (var14 != -32768 && var14 < var10) {
                        var10 = var14;
                    }
                }
            }
        }
        var9.field1779 = -var10;
        if (class184.field2892[arg0][arg1][arg2] == null) {
            class184.field2892[arg0][arg1][arg2] = new class113(arg0, arg1, arg2);
        }
        class184.field2892[arg0][arg1][arg2].field1631 = var9;
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "([BIII)Ljava/lang/String;")
    public static final String method529(byte[] arg0, int arg1, int arg2, int arg3) {
        field1172++;
        char[] var4 = new char[arg3];
        int var5 = 0;
        for (int var6 = arg2; var6 < arg3; var6++) {
            int var7 = arg0[arg1 + var6] & 0xFF;
            if (var7 != 0) {
                if (var7 >= 128 && var7 < 160) {
                    char var8 = class117.field1694[var7 - 128];
                    if (var8 == '\u0000') {
                        var8 = '?';
                    }
                    var7 = var8;
                }
                var4[var5++] = (char) var7;
            }
        }
        return new String(var4, 0, var5);
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(I)V")
    public static void method530(int arg0) {
        if (arg0 != -32074) {
            method526(4, (byte) -15);
        }
        field1177 = null;
    }
}
