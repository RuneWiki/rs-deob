import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!og")
public class class42 {

    @OriginalMember(owner = "client!og", name = "d", descriptor = "I")
    public static volatile int field638 = 0;

    @OriginalMember(owner = "client!og", name = "b", descriptor = "Lsk;")
    public static class199 field636 = new class199(64);

    @OriginalMember(owner = "client!og", name = "g", descriptor = "[[[B")
    public static byte[][][] field641 = new byte[4][104][104];

    @OriginalMember(owner = "client!og", name = "l", descriptor = "Lmh;")
    public static class62 field646 = class201.method1405(true, "<col=ffff00>");

    @OriginalMember(owner = "client!og", name = "h", descriptor = "Lmh;")
    public static class62 field642 = class201.method1405(true, "k");

    @OriginalMember(owner = "client!og", name = "i", descriptor = "Lmh;")
    public static class62 field643 = class201.method1405(true, " weitere Optionen");

    @OriginalMember(owner = "client!og", name = "a", descriptor = "I")
    public static int field635;

    @OriginalMember(owner = "client!og", name = "c", descriptor = "I")
    public static int field637;

    @OriginalMember(owner = "client!og", name = "e", descriptor = "I")
    public static int field639;

    @OriginalMember(owner = "client!og", name = "j", descriptor = "I")
    public static int field644;

    @OriginalMember(owner = "client!og", name = "f", descriptor = "Lsg;")
    public static class191 field640;

    @OriginalMember(owner = "client!og", name = "m", descriptor = "Lhi;")
    public static class26 field647;

    @OriginalMember(owner = "client!og", name = "k", descriptor = "[[B")
    public static byte[][] field645;

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(Z)V", line = 5)
    public static void method282(boolean arg0) {
        field641 = (byte[][][]) null;
        field642 = null;
        field647 = null;
        field640 = null;
        field645 = (byte[][]) null;
        field643 = null;
        field636 = null;
        field646 = null;
        if (!arg0) {
            field644 = 2;
        }
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "([BIIBZI[Lwc;IIII)V", line = 72)
    public static final void method283(byte[] arg0, int arg1, int arg2, byte arg3, boolean arg4, int arg5, class218[] arg6, int arg7, int arg8, int arg9, int arg10) {
        field639++;
        if (!arg4) {
            for (int var11 = 0; var11 < 8; var11++) {
                for (int var12 = 0; var12 < 8; var12++) {
                    if ((arg5 + var11) > 0 && (arg5 + var11) < 103 && (arg8 + var12) > 0 && (arg8 + var12) < 103) {
                        arg6[arg1].field3756[arg5 + var11][arg8 + var12] = class234.method1648(arg6[arg1].field3756[arg5 + var11][arg8 + var12], -16777217);
                    }
                }
            }
        }
        class92 var13 = new class92(arg0);
        byte var14;
        if (arg4) {
            var14 = 1;
        } else {
            var14 = 4;
        }
        for (int var15 = 0; var15 < var14; var15++) {
            for (int var16 = 0; var16 < 64; var16++) {
                for (int var17 = 0; var17 < 64; var17++) {
                    if (arg2 == var15 && arg10 <= var16 && var16 < arg10 + 8 && var17 >= arg7 && (arg7 + 8) > var17) {
                        class49.method318(arg9, arg1, var13, 8, 0, 0, class151.method1086(arg9, (byte) 124, var17 & 0x7, var16 & 0x7) + arg8, arg4, class124.method943(var16 & 0x7, var17 & 0x7, arg9, false) + arg5);
                    } else {
                        class49.method318(0, 0, var13, 8, 0, 0, -1, arg4, -1);
                    }
                }
            }
        }
        int var18 = -68 / ((15 - arg3) / 59);
        if (arg4) {
            return;
        }
        class307 var19 = null;
        while (true) {
            int var21;
            label99: do {
                while (var13.field1495.length > var13.field1476) {
                    int var20 = var13.method702(-1);
                    if (var20 != 0) {
                        if (var20 != 1) {
                            throw new IllegalStateException();
                        }
                        var21 = var13.method702(-1);
                        continue label99;
                    }
                    var19 = new class307(var13);
                }
                if (var19 == null) {
                    var19 = new class307();
                }
                class215.field3648[arg5 >> 3][arg8 >> 3] = var19;
                return;
            } while (var21 <= 0);
            for (int var22 = 0; var22 < var21; var22++) {
                class292 var23 = new class292(var13);
                int var24 = var23.field4962 >> 7;
                int var25 = var23.field4959 >> 7;
                if (var23.field4969 == arg2 && arg10 <= var24 && var24 < (arg10 + 8) && arg7 <= var25 && arg7 + 8 > var25) {
                    int var26 = class108.method837(var23.field4962 & 0x3FF, arg9, var23.field4959 & 0x3FF, false) + (arg5 << 7);
                    int var27 = class208.method1456(arg9, var23.field4959 & 0x3FF, (byte) 75, var23.field4962 & 0x3FF) + (arg8 << 7);
                    var23.field4959 = var27;
                    var23.field4962 = var26;
                    int var28 = var23.field4959 >> 7;
                    int var29 = var23.field4962 >> 7;
                    if (var29 >= 0 && var28 >= 0 && var29 < 104 && var28 < 104) {
                        var23.field4973 = class37.field569[var23.field4969][var29][var28] - var23.field4973;
                        class117.method902(var23);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(II)Lmh;", line = 376)
    public static final class62 method284(int arg0, int arg1) {
        field635++;
        if (arg1 > -115) {
            method282(true);
        }
        return class164.method1181(arg0, 10, false, (byte) -35);
    }
}
