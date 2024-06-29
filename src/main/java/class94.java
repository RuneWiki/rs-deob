import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!la")
public class class94 {

    @OriginalMember(owner = "client!la", name = "f", descriptor = "I")
    public static int field1676 = 100;

    @OriginalMember(owner = "client!la", name = "j", descriptor = "Lpj;")
    public static class237 field1680 = class33.method353("blaugr-Un:", 37);

    @OriginalMember(owner = "client!la", name = "c", descriptor = "[I")
    public static int[] field1673 = new int[4096];

    @OriginalMember(owner = "client!la", name = "h", descriptor = "I")
    public static int field1678 = 0;

    @OriginalMember(owner = "client!la", name = "b", descriptor = "I")
    public static int field1672 = 0;

    @OriginalMember(owner = "client!la", name = "a", descriptor = "I")
    public static int field1671;

    @OriginalMember(owner = "client!la", name = "d", descriptor = "I")
    public static int field1674;

    @OriginalMember(owner = "client!la", name = "e", descriptor = "I")
    public static int field1675;

    @OriginalMember(owner = "client!la", name = "g", descriptor = "I")
    public static int field1677;

    @OriginalMember(owner = "client!la", name = "i", descriptor = "I")
    public static int field1679;

    @OriginalMember(owner = "client!la", name = "k", descriptor = "I")
    public static int field1681;

    @OriginalMember(owner = "client!la", name = "a", descriptor = "()V")
    public static final void method697() {
        class234.field4050 = 0;
        label191: for (int var0 = 0; var0 < class27.field489; var0++) {
            class36 var1 = class164.field2926[var0];
            if (class49.field1058 != null) {
                for (int var2 = 0; var2 < class49.field1058.length; var2++) {
                    if (class49.field1058[var2] != -1000000 && (var1.field816 <= class49.field1058[var2] || var1.field822 <= class49.field1058[var2]) && (var1.field802 <= class102.field1821[var2] || var1.field810 <= class102.field1821[var2]) && (var1.field802 >= client.field2716[var2] || var1.field810 >= client.field2716[var2]) && (var1.field801 <= class199.field3451[var2] || var1.field782 <= class199.field3451[var2]) && (var1.field801 >= class213.field3637[var2] || var1.field782 >= class213.field3637[var2])) {
                        continue label191;
                    }
                }
            }
            if (var1.field780 == 1) {
                int var3 = var1.field800 + class159.field2860 - class275.field4833;
                if (var3 >= 0 && var3 <= class159.field2860 + class159.field2860) {
                    int var4 = var1.field786 + class159.field2860 - class207.field3515;
                    if (var4 < 0) {
                        var4 = 0;
                    }
                    int var5 = var1.field823 + class159.field2860 - class207.field3515;
                    if (var5 > class159.field2860 + class159.field2860) {
                        var5 = class159.field2860 + class159.field2860;
                    }
                    boolean var6 = false;
                    while (var4 <= var5) {
                        if (class56.field1152[var3][var4++]) {
                            var6 = true;
                            break;
                        }
                    }
                    if (var6) {
                        int var7 = class249.field4311 - var1.field802;
                        if (var7 > 32) {
                            var1.field825 = 1;
                        } else {
                            if (var7 >= -32) {
                                continue;
                            }
                            var1.field825 = 2;
                            var7 = -var7;
                        }
                        var1.field783 = (var1.field801 - class101.field1800 << 8) / var7;
                        var1.field819 = (var1.field782 - class101.field1800 << 8) / var7;
                        var1.field778 = (var1.field816 - class32.field696 << 8) / var7;
                        var1.field817 = (var1.field822 - class32.field696 << 8) / var7;
                        class190.field3310[class234.field4050++] = var1;
                    }
                }
            } else if (var1.field780 == 2) {
                int var8 = var1.field786 + class159.field2860 - class207.field3515;
                if (var8 >= 0 && var8 <= class159.field2860 + class159.field2860) {
                    int var9 = var1.field800 + class159.field2860 - class275.field4833;
                    if (var9 < 0) {
                        var9 = 0;
                    }
                    int var10 = var1.field791 + class159.field2860 - class275.field4833;
                    if (var10 > class159.field2860 + class159.field2860) {
                        var10 = class159.field2860 + class159.field2860;
                    }
                    boolean var11 = false;
                    while (var9 <= var10) {
                        if (class56.field1152[var9++][var8]) {
                            var11 = true;
                            break;
                        }
                    }
                    if (var11) {
                        int var12 = class101.field1800 - var1.field801;
                        if (var12 > 32) {
                            var1.field825 = 3;
                        } else {
                            if (var12 >= -32) {
                                continue;
                            }
                            var1.field825 = 4;
                            var12 = -var12;
                        }
                        var1.field813 = (var1.field802 - class249.field4311 << 8) / var12;
                        var1.field809 = (var1.field810 - class249.field4311 << 8) / var12;
                        var1.field778 = (var1.field816 - class32.field696 << 8) / var12;
                        var1.field817 = (var1.field822 - class32.field696 << 8) / var12;
                        class190.field3310[class234.field4050++] = var1;
                    }
                }
            } else if (var1.field780 == 4) {
                int var13 = var1.field816 - class32.field696;
                if (var13 > 128) {
                    int var14 = var1.field786 + class159.field2860 - class207.field3515;
                    if (var14 < 0) {
                        var14 = 0;
                    }
                    int var15 = var1.field823 + class159.field2860 - class207.field3515;
                    if (var15 > class159.field2860 + class159.field2860) {
                        var15 = class159.field2860 + class159.field2860;
                    }
                    if (var14 <= var15) {
                        int var16 = var1.field800 + class159.field2860 - class275.field4833;
                        if (var16 < 0) {
                            var16 = 0;
                        }
                        int var17 = var1.field791 + class159.field2860 - class275.field4833;
                        if (var17 > class159.field2860 + class159.field2860) {
                            var17 = class159.field2860 + class159.field2860;
                        }
                        boolean var18 = false;
                        label163: for (int var19 = var16; var19 <= var17; var19++) {
                            for (int var20 = var14; var20 <= var15; var20++) {
                                if (class56.field1152[var19][var20]) {
                                    var18 = true;
                                    break label163;
                                }
                            }
                        }
                        if (var18) {
                            var1.field825 = 5;
                            var1.field813 = (var1.field802 - class249.field4311 << 8) / var13;
                            var1.field809 = (var1.field810 - class249.field4311 << 8) / var13;
                            var1.field783 = (var1.field801 - class101.field1800 << 8) / var13;
                            var1.field819 = (var1.field782 - class101.field1800 << 8) / var13;
                            class190.field3310[class234.field4050++] = var1;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(B)V")
    public static void method698(byte arg0) {
        if (arg0 > 11) {
            field1680 = null;
            field1673 = null;
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(ZI)V")
    public static final void method699(boolean arg0, int arg1) {
        field1671++;
        if (class256.field4395 == arg0) {
            return;
        }
        class256.field4395 = arg0;
        if (arg1 >= -12) {
            field1676 = -108;
        }
        class105.method786(false);
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(II)Lbe;")
    public static final class28 method700(int arg0, int arg1) {
        field1675++;
        class28 var2 = (class28) class216.field3755.method940((long) arg1, 69);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class215.field3733.method1645(true, class49.method451(104, arg1), class139.method961(arg1, 1214261064));
        class28 var4 = new class28();
        var4.field527 = arg1;
        if (var3 != null) {
            var4.method258(false, new class32(var3));
        }
        var4.method263(-87);
        if (var4.field555) {
            var4.field551 = 0;
            var4.field529 = false;
        }
        if (!class181.field3173 && var4.field512) {
            var4.field511 = null;
        }
        class216.field3755.method937(-70, var4, (long) arg1);
        int var5 = -6 / ((arg0 + 16) / 35);
        return var4;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(BI)Loi;")
    public static final class79 method701(byte arg0, int arg1) {
        field1677++;
        class79 var2 = (class79) class138.field2380.method1549((long) arg1, 9447);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class141.field2525.method1645(true, arg1, 26);
        class79 var4 = new class79();
        if (var3 != null) {
            var4.method609(new class32(var3), arg0 + 19183);
        }
        class138.field2380.method1552((byte) -111, var4, (long) arg1);
        if (arg0 != -72) {
            method702(-17);
        }
        return var4;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(I)V")
    public static final void method702(int arg0) {
        field1681++;
        if (!class151.method1033((byte) -92) && class274.field4798 != class214.field3647) {
            class128.method908((byte) 61, class63.field1264, class263.field4495, false, class229.field3911.field3715[0], class229.field3911.field3743[0], class274.field4798);
        } else if (arg0 == -2937 && class274.field4798 != class270.field4625) {
            class270.field4625 = class274.field4798;
            class262.method1761(class274.field4798, (byte) -116);
            class199.method1357(arg0 + 2937);
        }
    }
}
