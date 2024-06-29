import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hb")
public class class756 {

    @OriginalMember(owner = "client!hb", name = "i", descriptor = "Lifa;")
    public static class450 field10475 = new class450();

    @OriginalMember(owner = "client!hb", name = "k", descriptor = "I")
    public static int field10477 = 0;

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "I")
    public int field10467;

    @OriginalMember(owner = "client!hb", name = "b", descriptor = "I")
    public int field10468;

    @OriginalMember(owner = "client!hb", name = "c", descriptor = "I")
    public int field10469;

    @OriginalMember(owner = "client!hb", name = "d", descriptor = "I")
    public int field10470;

    @OriginalMember(owner = "client!hb", name = "e", descriptor = "I")
    public int field10471;

    @OriginalMember(owner = "client!hb", name = "f", descriptor = "I")
    public static int field10472;

    @OriginalMember(owner = "client!hb", name = "g", descriptor = "I")
    public int field10473;

    @OriginalMember(owner = "client!hb", name = "h", descriptor = "I")
    public static int field10474;

    @OriginalMember(owner = "client!hb", name = "j", descriptor = "I")
    public static int field10476;

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(IC)Z")
    public static final boolean method4216(int arg0, char arg1) {
        field10474++;
        if (!(arg1 <= '\u0000' || arg1 >= '\u0080') || !(arg1 < ' ' || arg1 > 'ÿ')) {
            return true;
        }
        if (arg1 != '\u0000') {
            char[] var2 = class88.field1183;
            for (int var3 = 0; var3 < var2.length; var3++) {
                char var4 = var2[var3];
                if (arg1 == var4) {
                    return true;
                }
            }
        }
        return arg0 != 0;
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(B)V")
    public static void method4217(byte arg0) {
        field10475 = null;
        if (arg0 != -49) {
            field10475 = null;
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(I[ILiaa;I)V")
    public static final void method4218(int arg0, int[] arg1, class521 arg2, int arg3) {
        field10472++;
        if (arg2.field3430 != null) {
            boolean var4 = true;
            for (int var5 = 0; var5 < arg2.field3430.length; var5++) {
                if (arg2.field3430[var5] != arg1[var5]) {
                    var4 = false;
                    break;
                }
            }
            if (var4 && arg2.field3420 != -1) {
                class582 var6 = class362.field4504.method3600(-64, arg2.field3420);
                int var7 = var6.field7941;
                if (var7 == 1) {
                    arg2.field3368 = 0;
                    arg2.field3392 = 0;
                    arg2.field3359 = arg0;
                    arg2.field3376 = 1;
                    arg2.field3423 = 0;
                    if (!arg2.field3363) {
                        class60.method520(arg2.field3392, (byte) -106, arg2, var6);
                    }
                }
                if (var7 == 2) {
                    arg2.field3423 = 0;
                }
            }
        }
        boolean var8 = true;
        for (int var9 = arg3; var9 < arg1.length; var9++) {
            if (arg1[var9] != -1) {
                var8 = false;
            }
            if (arg2.field3430 == null || arg2.field3430[var9] == -1 || class362.field4504.method3600(arg3 ^ 0xFFFFFF92, arg1[var9]).field7947 >= class362.field4504.method3600(-39, arg2.field3430[var9]).field7947) {
                arg2.field3430 = arg1;
                arg2.field3359 = arg0;
                break;
            }
        }
        if (var8) {
            arg2.field3430 = arg1;
            arg2.field3359 = arg0;
        }
    }
}
