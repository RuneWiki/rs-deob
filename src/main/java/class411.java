import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qv")
public class class411 {

    @OriginalMember(owner = "client!qv", name = "c", descriptor = "Lhga;")
    public static class158 field6313 = new class158(22, -2);

    @OriginalMember(owner = "client!qv", name = "g", descriptor = "I")
    public static int field6317 = 0;

    @OriginalMember(owner = "client!qv", name = "a", descriptor = "I")
    public static int field6311;

    @OriginalMember(owner = "client!qv", name = "b", descriptor = "I")
    public static int field6312;

    @OriginalMember(owner = "client!qv", name = "d", descriptor = "I")
    public static int field6314;

    @OriginalMember(owner = "client!qv", name = "e", descriptor = "I")
    public static int field6315;

    @OriginalMember(owner = "client!qv", name = "f", descriptor = "Z")
    public static boolean field6316;

    @OriginalMember(owner = "client!qv", name = "a", descriptor = "(IB)I")
    public static final int method2617(int arg0, byte arg1) {
        field6312++;
        return arg1 <= 35 ? -32 : arg0 >> 11 & 0x7F;
    }

    @OriginalMember(owner = "client!qv", name = "a", descriptor = "(I)V")
    public static void method2618(int arg0) {
        if (arg0 == -17073) {
            field6313 = null;
        }
    }

    @OriginalMember(owner = "client!qv", name = "a", descriptor = "(CI)C")
    public static final char method2619(char arg0, int arg1) {
        if (arg1 != -1) {
            method2617(53, (byte) -44);
        }
        field6314++;
        if (arg0 == 'Æ') {
            return 'E';
        } else if (arg0 == 'æ') {
            return 'e';
        } else if (arg0 == 'ß') {
            return 's';
        } else if (arg0 == 'Œ') {
            return 'E';
        } else {
            return (char) (arg0 == 'œ' ? 'e' : '\u0000');
        }
    }

    @OriginalMember(owner = "client!qv", name = "b", descriptor = "(I)[Lja;")
    public static final class254[] method2620(int arg0) {
        if (arg0 == 0) {
            field6311++;
            return new class254[] { class250.field4005, class219.field3576, class563.field8093 };
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!qv", name = "a", descriptor = "(IZLsp;[I)V")
    public static final void method2621(int arg0, boolean arg1, class589 arg2, int[] arg3) {
        field6315++;
        if (arg2.field4174 != null) {
            boolean var4 = true;
            for (int var5 = 0; var5 < arg2.field4174.length; var5++) {
                if (arg2.field4174[var5] != arg3[var5]) {
                    var4 = false;
                    break;
                }
            }
            if (var4 && arg2.field4215 != -1) {
                class428 var6 = class636.field8942.method2872((byte) 11, arg2.field4215);
                int var7 = var6.field6513;
                if (var7 == 1) {
                    arg2.field4209 = 0;
                    arg2.field4194 = 1;
                    arg2.field4213 = 0;
                    arg2.field4150 = arg0;
                    arg2.field4188 = 0;
                    if (!arg2.field4180) {
                        class216.method1622(arg2.field4209, arg2, (byte) -122, var6);
                    }
                }
                if (var7 == 2) {
                    arg2.field4213 = 0;
                }
            }
        }
        boolean var8 = true;
        for (int var9 = 0; var9 < arg3.length; var9++) {
            if (arg3[var9] != -1) {
                var8 = false;
            }
            if (arg2.field4174 == null || arg2.field4174[var9] == -1 || class636.field8942.method2872((byte) 11, arg3[var9]).field6527 >= class636.field8942.method2872((byte) 11, arg2.field4174[var9]).field6527) {
                arg2.field4174 = arg3;
                arg2.field4259 = arg2.field4267;
                arg2.field4150 = arg0;
            }
        }
        if (var8) {
            arg2.field4259 = arg2.field4267;
            arg2.field4150 = arg0;
            arg2.field4174 = arg3;
        }
        if (arg1) {
            field6317 = 79;
        }
    }
}
