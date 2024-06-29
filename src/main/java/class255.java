import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rb")
public class class255 {

    @OriginalMember(owner = "client!rb", name = "j", descriptor = "Lpj;")
    public static class237 field4380 = class33.method353("Bitte entfernen Sie ", 94);

    @OriginalMember(owner = "client!rb", name = "g", descriptor = "Z")
    public static boolean field4377 = true;

    @OriginalMember(owner = "client!rb", name = "h", descriptor = "Lpj;")
    public static class237 field4378 = class33.method353("Versteckt", 125);

    @OriginalMember(owner = "client!rb", name = "f", descriptor = "Lpj;")
    public static class237 field4376 = class33.method353("; Expires=", 25);

    @OriginalMember(owner = "client!rb", name = "c", descriptor = "[S")
    public static short[] field4373 = new short[256];

    @OriginalMember(owner = "client!rb", name = "k", descriptor = "Lpj;")
    public static class237 field4381 = class33.method353("Mem:", 61);

    @OriginalMember(owner = "client!rb", name = "l", descriptor = "[I")
    public static int[] field4382 = new int[] { 160, 192, 80, 96, 0, 144, 80, 48, 160 };

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "I")
    public static int field4372;

    @OriginalMember(owner = "client!rb", name = "d", descriptor = "I")
    public static int field4374;

    @OriginalMember(owner = "client!rb", name = "e", descriptor = "I")
    public static int field4375;

    @OriginalMember(owner = "client!rb", name = "i", descriptor = "I")
    public static int field4379;

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "Lfa;")
    public static class239 field4371;

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(Z)V")
    public static void method1721(boolean arg0) {
        field4376 = null;
        field4380 = null;
        field4381 = null;
        field4373 = null;
        field4378 = null;
        field4382 = null;
        field4371 = null;
        if (!arg0) {
            method1722(8, 75, -10, (class271) null);
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(IIILjh;)V")
    public static final void method1722(int arg0, int arg1, int arg2, class271 arg3) {
        field4379++;
        if ((arg1 & 0x100) != 0) {
            arg3.field3704 = class65.field1288.method316((byte) -107);
            arg3.field3691 = class65.field1288.method316((byte) -122);
            arg3.field3676 = class65.field1288.method343((byte) 55);
            arg3.field3682 = class65.field1288.method295(14179);
            arg3.field3729 = class65.field1288.method300(128) + class241.field4246;
            arg3.field3714 = class65.field1288.method300(128) + class241.field4246;
            arg3.field3708 = class65.field1288.method295(14179);
            arg3.field3703 = 0;
            arg3.field3740 = 1;
        }
        if ((arg1 & 0x200) != 0) {
            arg3.field3734 = class65.field1288.method339(-16777216);
            int var4 = class65.field1288.method340(26964);
            arg3.field3680 = 0;
            if (arg3.field3734 == 65535) {
                arg3.field3734 = -1;
            }
            arg3.field3728 = 0;
            arg3.field3735 = (var4 & 0xFFFF) + class241.field4246;
            arg3.field3721 = var4 >> 16;
            if (arg3.field3735 > class241.field4246) {
                arg3.field3680 = -1;
            }
            if (arg3.field3734 != -1 && class241.field4246 == arg3.field3735) {
                int var5 = class190.method1288(arg3.field3734, (byte) 115).field1054;
                if (var5 != -1) {
                    class256 var6 = class256.method1732(var5, true);
                    if (var6 != null && var6.field4416 != null) {
                        class95.method706(arg3.field3700, class229.field3911 == arg3, 0, (byte) 92, arg3.field3710, var6);
                    }
                }
            }
        }
        if ((arg1 & 0x80) != 0) {
            arg3.field3706 = class65.field1288.method321((byte) -122);
            arg3.field3730 = class65.field1288.method314(-754926392);
        }
        if ((arg1 & 0x4) != 0) {
            int var7 = class65.field1288.method316((byte) -98);
            byte[] var8 = new byte[var7];
            class32 var9 = new class32(var8);
            class65.field1288.method328(var7, 0, 15872, var8);
            class169.field2969[arg2] = var9;
            arg3.method1801(var9, (byte) 57);
        }
        if ((arg1 & 0x400) != 0) {
            int var10 = class65.field1288.method347(255);
            int var11 = class65.field1288.method347(255);
            arg3.method1440(18353, var10, class241.field4246, var11);
        }
        if ((arg1 & 0x10) != 0) {
            int var12 = class65.field1288.method295(14179);
            int var13 = class65.field1288.method316((byte) -67);
            arg3.method1440(18353, var12, class241.field4246, var13);
            arg3.field3746 = class241.field4246 + 300;
            arg3.field3727 = class65.field1288.method316((byte) 99);
        }
        if (arg0 < 60) {
            method1724(76L, 83);
        }
        if ((arg1 & 0x8) != 0) {
            arg3.field3719 = class65.field1288.method339(-16777216);
            if (arg3.field3719 == 65535) {
                arg3.field3719 = -1;
            }
        }
        if ((arg1 & 0x1) != 0) {
            arg3.field3713 = class65.field1288.method324(1);
            if (arg3.field3713.method1607((byte) -91, 0) == 126) {
                arg3.field3713 = arg3.field3713.method1610(1, 126);
                class175.method1212(arg3.field3713, arg3.method1802((byte) -18), (byte) 113, 2);
            } else if (class229.field3911 == arg3) {
                class175.method1212(arg3.field3713, arg3.method1802((byte) -18), (byte) 127, 2);
            }
            arg3.field3725 = 0;
            arg3.field3694 = 150;
            arg3.field3702 = 0;
        }
        if ((arg1 & 0x40) != 0) {
            int var14 = class65.field1288.method321((byte) 92);
            if (var14 == 65535) {
                var14 = -1;
            }
            int var15 = class65.field1288.method343((byte) 79);
            client.method1049(0, arg3, var15, var14);
        }
        if ((arg1 & 0x2) == 0) {
            return;
        }
        int var16 = class65.field1288.method300(128);
        int var17 = class65.field1288.method343((byte) 119);
        int var18 = class65.field1288.method343((byte) 104);
        int var19 = class65.field1288.field647;
        boolean var20 = (var16 & 0x8000) != 0;
        if (arg3.field4655 != null && arg3.field4645 != null) {
            long var21 = arg3.field4655.method1616(0);
            boolean var23 = false;
            if (var17 <= 1) {
                if (!var20 && class239.field4184 == 1 || class53.field1113 == 1) {
                    var23 = true;
                } else {
                    for (int var24 = 0; var24 < class179.field3143; var24++) {
                        if (class17.field289[var24] == var21) {
                            var23 = true;
                            break;
                        }
                    }
                }
            }
            if (!var23 && class94.field1672 == 0) {
                class128.field2240.field647 = 0;
                class65.field1288.method328(var18, 0, 15872, class128.field2240.field644);
                int var25 = -1;
                class128.field2240.field647 = 0;
                class237 var27;
                if (var20) {
                    var16 &= 0x7FFF;
                    class189 var26 = class55.method487(false, class128.field2240);
                    var25 = var26.field3293;
                    var27 = var26.field3291.method1565((byte) -105, class128.field2240);
                } else {
                    var27 = class194.method1344(class11.method116(class128.field2240, -102).method1615(67));
                }
                arg3.field3713 = var27.method1605(false);
                arg3.field3702 = var16 & 0xFF;
                arg3.field3725 = var16 >> 8;
                arg3.field3694 = 150;
                if (var17 == 2) {
                    class220.method1467(var27, class238.method1626(new class237[] { class6.field58, arg3.method1802((byte) -18) }, -54), 1, var25, (class237) null, var20 ? 17 : 1);
                } else if (var17 == 1) {
                    class220.method1467(var27, class238.method1626(new class237[] { class148.field2627, arg3.method1802((byte) -18) }, -110), 1, var25, (class237) null, var20 ? 17 : 1);
                } else {
                    class220.method1467(var27, arg3.method1802((byte) -18), 1, var25, (class237) null, var20 ? 17 : 2);
                }
            }
        }
        class65.field1288.field647 = var19 + var18;
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(B)Lgk;")
    public static final class154 method1723(byte arg0) {
        class154 var1 = new class154(class52.field1094, class43.field944, class252.field4341[0], class226.field3868[0], class174.field3060[0], class175.field3063[0], class127.field2221[0], class139.field2398);
        class190.method1291((byte) 103);
        field4374++;
        if (arg0 != 54) {
            method1722(33, -46, -20, (class271) null);
        }
        return var1;
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(JI)V")
    public static final void method1724(long arg0, int arg1) {
        field4375++;
        if (arg0 == 0L) {
            return;
        }
        if (class179.field3143 >= 100) {
            class175.method1212(class233.field4032, class239.field4202, (byte) 118, 0);
            return;
        }
        class237 var3 = class146.method995(270, arg0).method1581((byte) -120);
        if (arg1 < 121) {
            field4372 = -47;
        }
        for (int var4 = 0; var4 < class179.field3143; var4++) {
            if (class17.field289[var4] == arg0) {
                class175.method1212(class238.method1626(new class237[] { var3, class3.field33 }, -125), class239.field4202, (byte) 123, 0);
                return;
            }
        }
        for (int var5 = 0; var5 < class221.field3810; var5++) {
            if (class144.field2601[var5] == arg0) {
                class175.method1212(class238.method1626(new class237[] { class176.field3085, var3, class58.field1194 }, -45), class239.field4202, (byte) 112, 0);
                return;
            }
        }
        if (var3.method1585((byte) 78, class229.field3911.field4655)) {
            class175.method1212(class210.field3590, class239.field4202, (byte) 117, 0);
            return;
        }
        class17.field289[class179.field3143] = arg0;
        class83.field1562++;
        class78.field1477[class179.field3143++] = class146.method995(270, arg0);
        class20.field381 = class3.field31;
        class223.field3830.method368(-103, 31);
        class223.field3830.method292(-50, arg0);
    }
}
