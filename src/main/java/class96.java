import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uk")
public class class96 extends class81 {

    @OriginalMember(owner = "client!uk", name = "p", descriptor = "S")
    public static short field1698 = 32767;

    @OriginalMember(owner = "client!uk", name = "r", descriptor = "[I")
    public static int[] field1700 = new int[99];

    @OriginalMember(owner = "client!uk", name = "C", descriptor = "Lpj;")
    public static class237 field1711;

    @OriginalMember(owner = "client!uk", name = "D", descriptor = "I")
    public static int field1712;

    @OriginalMember(owner = "client!uk", name = "q", descriptor = "I")
    public static int field1699;

    @OriginalMember(owner = "client!uk", name = "s", descriptor = "I")
    public static int field1701;

    @OriginalMember(owner = "client!uk", name = "t", descriptor = "I")
    public static int field1702;

    @OriginalMember(owner = "client!uk", name = "u", descriptor = "I")
    public static int field1703;

    @OriginalMember(owner = "client!uk", name = "v", descriptor = "I")
    public int field1704;

    @OriginalMember(owner = "client!uk", name = "w", descriptor = "I")
    public static int field1705;

    @OriginalMember(owner = "client!uk", name = "x", descriptor = "I")
    public int field1706;

    @OriginalMember(owner = "client!uk", name = "y", descriptor = "I")
    public static int field1707;

    @OriginalMember(owner = "client!uk", name = "A", descriptor = "I")
    public static int field1709;

    @OriginalMember(owner = "client!uk", name = "B", descriptor = "I")
    public static int field1710;

    @OriginalMember(owner = "client!uk", name = "E", descriptor = "I")
    public int field1713;

    @OriginalMember(owner = "client!uk", name = "F", descriptor = "I")
    public static int field1714;

    @OriginalMember(owner = "client!uk", name = "z", descriptor = "Lug;")
    public static class194 field1708;

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(II)I")
    public static final int method714(int arg0, int arg1) {
        field1707++;
        int var2 = arg0 & 0x3F;
        int var3 = (arg0 & 0xE3) >> 6;
        if (var2 == 18) {
            if (var3 == 0) {
                return 1;
            }
            if (var3 == 1) {
                return 2;
            }
            if (var3 == 2) {
                return 4;
            }
            if (var3 == 3) {
                return 8;
            }
        } else if (var2 == 19 || var2 == 21) {
            if (var3 == 0) {
                return 16;
            }
            if (var3 == 1) {
                return 32;
            }
            if (var3 == 2) {
                return 64;
            }
            if (var3 == 3) {
                return 128;
            }
        }
        if (arg1 > -70) {
            field1700 = null;
        }
        return 0;
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(IZI)Z")
    public static final boolean method715(int arg0, boolean arg1, int arg2) {
        if (arg0 == 11) {
            arg0 = 10;
        }
        field1703++;
        if (arg0 >= 5 && arg0 <= 8) {
            arg0 = 4;
        }
        class28 var3 = class94.method700(78, arg2);
        if (!arg1) {
            field1711 = null;
        }
        return var3.method255(78, arg0);
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(BI)V")
    public static final void method716(byte arg0, int arg1) {
        field1705++;
        class108.field1923.method939(arg1, 1);
        if (arg0 >= -101) {
            method720((byte) -70);
        }
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(Lmc;)V")
    public static final void method717(class191 arg0) {
        for (int var1 = arg0.field3316; var1 <= arg0.field3327; var1++) {
            for (int var2 = arg0.field3315; var2 <= arg0.field3320; var2++) {
                class35 var3 = class274.field4775[arg0.field3323][var1][var2];
                if (var3 != null) {
                    for (int var4 = 0; var4 < var3.field759; var4++) {
                        if (var3.field755[var4] == arg0) {
                            var3.field759--;
                            for (int var5 = var4; var5 < var3.field759; var5++) {
                                var3.field755[var5] = var3.field755[var5 + 1];
                                var3.field765[var5] = var3.field765[var5 + 1];
                            }
                            var3.field755[var3.field759] = null;
                            break;
                        }
                    }
                    var3.field768 = 0;
                    for (int var6 = 0; var6 < var3.field759; var6++) {
                        var3.field768 |= var3.field765[var6];
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(B)V")
    public static final void method718(byte arg0) {
        if (arg0 != -52) {
            method714(-44, 95);
        }
        if (class131.field2312 != null) {
            class131.field2312.method1073(false);
        }
        field1699++;
        if (class79.field1485 != null) {
            class79.field1485.method1073(false);
        }
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(IIILbe;BLjh;Lhi;I)V")
    public static final void method719(int arg0, int arg1, int arg2, class28 arg3, byte arg4, class271 arg5, class210 arg6, int arg7) {
        class249 var8 = new class249();
        var8.field4315 = arg0 * 128;
        var8.field4309 = arg1 * 128;
        var8.field4318 = arg7;
        if (arg3 != null) {
            var8.field4319 = arg3.field498;
            var8.field4334 = arg3.field505;
            var8.field4316 = arg3.field550;
            var8.field4314 = arg3.field496;
            var8.field4317 = arg3.field526 * 128;
            var8.field4321 = arg3;
            int var10 = arg3.field507;
            int var11 = arg3.field571;
            if (arg2 == 1 || arg2 == 3) {
                var11 = arg3.field507;
                var10 = arg3.field571;
            }
            var8.field4326 = (arg0 + var11) * 128;
            var8.field4322 = (arg1 + var10) * 128;
            if (arg3.field537 != null) {
                var8.field4323 = true;
                var8.method1702(94);
            }
            if (var8.field4314 != null) {
                var8.field4313 = var8.field4334 + ((int) (Math.random() * (double) (var8.field4319 - var8.field4334)));
            }
            class156.field2757.method675(var8, (byte) -59);
        } else if (arg6 != null) {
            var8.field4310 = arg6;
            class231 var9 = arg6.field3586;
            if (var9.field3991 != null) {
                var8.field4323 = true;
                var9 = var9.method1530(-1);
            }
            if (var9 != null) {
                var8.field4322 = (var9.field3989 + arg1) * 128;
                var8.field4326 = (var9.field3989 + arg0) * 128;
                var8.field4316 = class268.method1785(arg6, -1);
                var8.field4317 = var9.field3986 * 128;
            }
            class82.field1536.method675(var8, (byte) -93);
        } else if (arg5 != null) {
            var8.field4329 = arg5;
            var8.field4322 = (arg5.method1441((byte) 116) + arg1) * 128;
            var8.field4326 = (arg0 + arg5.method1441((byte) 119)) * 128;
            var8.field4316 = class28.method248(arg5, -80);
            var8.field4317 = arg5.field4632 * 128;
            class33.field703.method562(var8, arg5.field4655.method1616(0), (byte) 56);
        }
        if (arg4 >= 42) {
            field1709++;
        }
    }

    @OriginalMember(owner = "client!uk", name = "b", descriptor = "(B)V")
    public static void method720(byte arg0) {
        field1708 = null;
        if (arg0 != 113) {
            method719(-84, 8, 29, (class28) null, (byte) 123, (class271) null, (class210) null, 105);
        }
        field1700 = null;
        field1711 = null;
    }

    @OriginalMember(owner = "client!uk", name = "d", descriptor = "(I)V")
    public static final void method721(int arg0) {
        class22.field406 = new class141[class203.field3477.method1640(-1)][];
        if (arg0 != 23936) {
            field1714 = -110;
        }
        field1701++;
        class257.field4423 = new boolean[class203.field3477.method1640(-1)];
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(ZIJI)Lpj;")
    public static final class237 method722(boolean arg0, int arg1, long arg2, int arg3) {
        field1702++;
        if (arg3 < 2 || arg3 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg3);
        }
        int var5 = 1;
        long var6 = arg2 / (long) arg3;
        while (var6 != 0L) {
            var6 /= (long) arg3;
            var5++;
        }
        if (arg1 != 4) {
            method718((byte) 98);
        }
        int var8 = var5;
        if (arg2 < 0L || arg0) {
            var8 = var5 + 1;
        }
        byte[] var9 = new byte[var8];
        if (arg2 < 0L) {
            var9[0] = 45;
        } else if (arg0) {
            var9[0] = 43;
        }
        for (int var10 = 0; var10 < var5; var10++) {
            int var12 = (int) (arg2 % (long) arg3);
            arg2 /= (long) arg3;
            if (var12 < 0) {
                var12 = -var12;
            }
            if (var12 > 9) {
                var12 += 39;
            }
            var9[var8 - var10 - 1] = (byte) (var12 + 48);
        }
        class237 var11 = new class237();
        var11.field4151 = var9;
        var11.field4114 = var8;
        return var11;
    }

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 99; var1++) {
            int var2 = var1 + 1;
            int var3 = (int) (Math.pow(2.0D, (double) var2 / 7.0D) * 300.0D + (double) var2);
            var0 += var3;
            field1700[var1] = var0 / 4;
        }
        field1711 = class33.method353(":clanreq:", 54);
        field1712 = 0;
    }
}
