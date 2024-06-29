import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ub")
public abstract class class250 {

    @OriginalMember(owner = "client!ub", name = "e", descriptor = "Lsf;")
    public static class33 field4308 = new class33();

    @OriginalMember(owner = "client!ub", name = "g", descriptor = "Lia;")
    private static class257 field4310 = class28.method234(-10, "wave:");

    @OriginalMember(owner = "client!ub", name = "f", descriptor = "Lia;")
    public static class257 field4309 = field4310;

    @OriginalMember(owner = "client!ub", name = "j", descriptor = "Lia;")
    public static class257 field4313 = field4310;

    @OriginalMember(owner = "client!ub", name = "n", descriptor = "I")
    public static int field4317 = -1;

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "I")
    public static int field4304;

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "I")
    public static int field4305;

    @OriginalMember(owner = "client!ub", name = "c", descriptor = "I")
    public static int field4306;

    @OriginalMember(owner = "client!ub", name = "d", descriptor = "I")
    public static int field4307;

    @OriginalMember(owner = "client!ub", name = "i", descriptor = "I")
    public static int field4312;

    @OriginalMember(owner = "client!ub", name = "k", descriptor = "I")
    public static int field4314;

    @OriginalMember(owner = "client!ub", name = "l", descriptor = "I")
    public static int field4315;

    @OriginalMember(owner = "client!ub", name = "m", descriptor = "I")
    public static int field4316;

    @OriginalMember(owner = "client!ub", name = "h", descriptor = "[[[B")
    public static byte[][][] field4311;

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(IB)I")
    public static final int method1631(int arg0, byte arg1) {
        if (arg1 < 118) {
            return -7;
        } else {
            field4315++;
            return arg0 >>> 8;
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(Lmi;I)V")
    public static final void method1632(class100 arg0, int arg1) {
        field4305++;
        class254 var2 = null;
        try {
            if (arg1 < 43) {
                method1632((class100) null, -1);
            }
            class176 var3 = arg0.method711("runescape", -81);
            while (var3.field3000 == 0) {
                class33.method283(-71, 1L);
            }
            if (var3.field3000 == 1) {
                var2 = (class254) var3.field3001;
                class152 var4 = class96.method698((byte) 50);
                var2.method1655(var4.field2677, var4.field2638, 1, 0);
            }
        } catch (Exception var6) {
        }
        try {
            if (var2 != null) {
                var2.method1658(13198);
            }
        } catch (Exception var5) {
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(I)V")
    public static void method1633(int arg0) {
        if (arg0 != 45) {
            field4310 = null;
        }
        field4311 = null;
        field4313 = null;
        field4310 = null;
        field4309 = null;
        field4308 = null;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(IIILia;I)V")
    public static final void method1634(int arg0, int arg1, int arg2, class257 arg3, int arg4) {
        class44 var5 = class148.method996(arg0, -1, arg1);
        field4314++;
        if (var5 == null) {
            return;
        }
        if (var5.field1017 != null) {
            class164 var6 = new class164();
            var6.field2860 = arg3;
            var6.field2858 = arg4;
            var6.field2867 = var5.field1017;
            var6.field2864 = var5;
            class57.method441(var6, -10305);
        }
        boolean var7 = true;
        if (var5.field949 > 0) {
            var7 = class191.method1296(var5, 87);
        }
        if (!var7 || !class146.method983(client.method590(var5), 1, arg4 - 1)) {
            return;
        }
        if (arg4 == 1) {
            class74.field1451++;
            class205.field3524.method908(false, 163);
            class205.field3524.method1066(-1687589720, arg0);
            class205.field3524.method1065(arg1, 1210792072);
        }
        if (arg4 == 2) {
            class205.field3524.method908(false, 125);
            class27.field525++;
            class205.field3524.method1066(-1687589720, arg0);
            class205.field3524.method1065(arg1, 1210792072);
        }
        if (arg4 == 3) {
            class143.field2515++;
            class205.field3524.method908(false, 45);
            class205.field3524.method1066(arg2 ^ 0x6496935E, arg0);
            class205.field3524.method1065(arg1, arg2 ^ 0xB7D4C77E);
        }
        if (arg4 == 4) {
            class215.field3654++;
            class205.field3524.method908(false, 252);
            class205.field3524.method1066(-1687589720, arg0);
            class205.field3524.method1065(arg1, 1210792072);
        }
        if (arg4 == 5) {
            class205.field3524.method908(false, 39);
            class205.field3524.method1066(arg2 ^ 0x6496935E, arg0);
            class205.field3524.method1065(arg1, arg2 ^ 0xB7D4C77E);
            class28.field537++;
        }
        if (arg4 == 6) {
            class205.field3524.method908(false, 114);
            class93.field1763++;
            class205.field3524.method1066(arg2 ^ 0x6496935E, arg0);
            class205.field3524.method1065(arg1, arg2 ^ 0xB7D4C77E);
        }
        if (arg4 == 7) {
            class205.field3524.method908(false, 28);
            class177.field3005++;
            class205.field3524.method1066(-1687589720, arg0);
            class205.field3524.method1065(arg1, 1210792072);
        }
        if (arg4 == 8) {
            class173.field2957++;
            class205.field3524.method908(false, 161);
            class205.field3524.method1066(arg2 ^ 0x6496935E, arg0);
            class205.field3524.method1065(arg1, 1210792072);
        }
        if (~arg4 == arg2) {
            class205.field3524.method908(false, 190);
            class205.field3524.method1066(-1687589720, arg0);
            class205.field3524.method1065(arg1, 1210792072);
            class79.field1544++;
        }
        if (arg4 == 10) {
            class81.field1571++;
            class205.field3524.method908(false, 199);
            class205.field3524.method1066(-1687589720, arg0);
            class205.field3524.method1065(arg1, arg2 ^ 0xB7D4C77E);
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(ZIBZLvb;II)V")
    public static final void method1635(boolean arg0, int arg1, byte arg2, boolean arg3, class226 arg4, int arg5, int arg6) {
        field4316++;
        long var7 = (long) ((arg5 << 16) + arg1);
        class137 var9 = (class137) class203.field3494.method434((byte) -93, var7);
        if (var9 != null) {
            return;
        }
        class137 var10 = (class137) class185.field3210.method434((byte) -93, var7);
        if (var10 != null) {
            return;
        }
        class137 var11 = (class137) class248.field4289.method434((byte) -93, var7);
        if (var11 == null) {
            if (!arg0) {
                class137 var12 = (class137) class158.field2774.method434((byte) -93, var7);
                if (var12 != null) {
                    return;
                }
            }
            class137 var13 = new class137();
            if (!arg3) {
                var13.field2450 = arg2;
                var13.field2451 = arg4;
                var13.field2447 = arg6;
                if (arg0) {
                    class203.field3494.method424(var13, (byte) -40, var7);
                    class80.field1566++;
                } else {
                    class85.field1658.method985(var13, (byte) 27);
                    class248.field4289.method424(var13, (byte) -40, var7);
                    class138.field2459++;
                }
            }
        } else if (arg0) {
            var11.method815((byte) 120);
            class203.field3494.method424(var11, (byte) -40, var7);
            class80.field1566++;
            class138.field2459--;
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(Lmi;ZI)V")
    public static final void method1636(class100 arg0, boolean arg1, int arg2) {
        if (arg2 != -28525) {
            return;
        }
        field4312++;
        if (arg1) {
            class30.field566 = 3;
            class133.method925((byte) -18, false);
            class179.field3093 = false;
            class38.field747 = 127;
            class152.field2649 = false;
            class209.field3573 = false;
            class25.field488 = 0;
            class72.field1409 = false;
            class81.field1574 = false;
            class169.field2918 = false;
            class115.field2070 = 0;
            class204.field3503 = false;
            class26.field513 = 255;
            class2.field45 = false;
            class99.field1830 = 127;
            class238.field4089 = 0;
            class133.field2387 = false;
            class19.field399 = false;
            class115.field2080 = 0;
            class2.field62 = false;
            method1632(arg0, 116);
            return;
        }
        class30.field566 = 3;
        class133.method925((byte) -18, true);
        class81.field1574 = true;
        class115.field2080 = 0;
        class38.field747 = 127;
        class26.field513 = 255;
        class238.field4089 = 0;
        class2.field45 = true;
        class99.field1830 = 127;
        class152.field2649 = true;
        class115.field2070 = 0;
        class169.field2918 = true;
        class209.field3573 = true;
        class2.field62 = true;
        class179.field3093 = true;
        class19.field399 = true;
        class204.field3503 = true;
        class72.field1409 = true;
        class25.field488 = 2;
        class133.field2387 = true;
        class254 var3 = null;
        try {
            class176 var4 = arg0.method711("runescape", -128);
            while (var4.field3000 == 0) {
                class33.method283(-70, 1L);
            }
            if (var4.field3000 == 1) {
                int var5 = 0;
                var3 = (class254) var4.field3001;
                byte[] var6 = new byte[(int) var3.method1657((byte) 74)];
                while (var6.length > var5) {
                    int var7 = var3.method1656(var5, var6.length - var5, -1, var6);
                    if (var7 == -1) {
                        throw new IOException("EOF");
                    }
                    var5 += var7;
                }
                class7.method108(new class152(var6), true);
            }
        } catch (Exception var9) {
        }
        try {
            if (var3 != null) {
                var3.method1658(13198);
            }
        } catch (Exception var8) {
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(I[B)V")
    public abstract void method1299(int arg0, byte[] arg1);

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "(I)[B")
    public abstract byte[] method1300(int arg0);

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(IIIIII)V")
    public static final void method1637(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class94.method692(class185.field3220[arg0], (byte) -126, arg3 - arg4, arg1, arg3 + arg4);
        int var6 = arg4 * arg4;
        int var7 = arg5;
        int var8 = 0;
        int var9 = arg5 * arg5;
        field4304++;
        if (arg2 != 25911) {
            method1633(88);
        }
        int var10 = var6 << 1;
        int var11 = var9 << 1;
        int var12 = arg5 << 1;
        int var13 = var9 - ((var12 - 1) * var10);
        int var14 = (1 - var12) * var6 + var11;
        int var15 = var6 << 2;
        int var16 = var9 << 2;
        int var17 = ((var8 << 1) + 3) * var11;
        int var18 = ((arg5 << 1) - 3) * var10;
        int var19 = (var8 + 1) * var16;
        int var20 = (arg5 - 1) * var15;
        while (var7 > 0) {
            if (var14 < 0) {
                while (var14 < 0) {
                    var8++;
                    var14 += var17;
                    var17 += var16;
                    var13 += var19;
                    var19 += var16;
                }
            }
            var7--;
            if (var13 < 0) {
                var8++;
                var13 += var19;
                var14 += var17;
                var19 += var16;
                var17 += var16;
            }
            int var21 = arg0 - var7;
            var14 += -var20;
            var13 += -var18;
            var18 -= var15;
            var20 -= var15;
            int var22 = arg3 - var8;
            int var23 = arg3 + var8;
            int var24 = arg0 + var7;
            class94.method692(class185.field3220[var21], (byte) 124, var22, arg1, var23);
            class94.method692(class185.field3220[var24], (byte) 76, var22, arg1, var23);
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(ZI)Laj;")
    public static final class21 method1638(boolean arg0, int arg1) {
        class21 var2 = (class21) class151.field2593.method836(-109, (long) arg1);
        field4307++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class238.field4070.method1197(arg1, 16, -2);
        class21 var4 = new class21();
        if (arg0) {
            return null;
        }
        if (var3 != null) {
            var4.method185(true, new class152(var3));
        }
        class151.field2593.method832(var4, (long) arg1, 0);
        return var4;
    }
}
