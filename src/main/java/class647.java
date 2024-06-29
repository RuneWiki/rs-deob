import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kb")
public class class647 {

    @OriginalMember(owner = "client!kb", name = "d", descriptor = "I")
    public int field8666 = 512;

    @OriginalMember(owner = "client!kb", name = "c", descriptor = "I")
    public int field8665 = -1;

    @OriginalMember(owner = "client!kb", name = "g", descriptor = "I")
    public int field8669 = 64;

    @OriginalMember(owner = "client!kb", name = "e", descriptor = "I")
    public int field8667 = 127;

    @OriginalMember(owner = "client!kb", name = "i", descriptor = "I")
    public int field8671 = 1190717;

    @OriginalMember(owner = "client!kb", name = "k", descriptor = "I")
    public int field8673 = -1;

    @OriginalMember(owner = "client!kb", name = "l", descriptor = "Z")
    public boolean field8674 = false;

    @OriginalMember(owner = "client!kb", name = "q", descriptor = "Z")
    public boolean field8679 = true;

    @OriginalMember(owner = "client!kb", name = "n", descriptor = "I")
    public int field8676 = 8;

    @OriginalMember(owner = "client!kb", name = "p", descriptor = "Z")
    public boolean field8678 = true;

    @OriginalMember(owner = "client!kb", name = "o", descriptor = "I")
    public int field8677 = -1;

    @OriginalMember(owner = "client!kb", name = "m", descriptor = "I")
    public int field8675 = 0;

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "I")
    public static int field8663;

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "I")
    public static int field8664;

    @OriginalMember(owner = "client!kb", name = "f", descriptor = "I")
    public static int field8668;

    @OriginalMember(owner = "client!kb", name = "h", descriptor = "I")
    public static int field8670;

    @OriginalMember(owner = "client!kb", name = "j", descriptor = "I")
    public int field8672;

    @OriginalMember(owner = "client!kb", name = "s", descriptor = "I")
    public static int field8681;

    @OriginalMember(owner = "client!kb", name = "t", descriptor = "I")
    public static int field8682;

    @OriginalMember(owner = "client!kb", name = "r", descriptor = "Lrg;")
    public class601 field8680;

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(Leh;I)V")
    public final void method3544(class335 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2034(255);
            if (var3 == 0) {
                field8664++;
                int var4 = 19 % ((arg1 - 85) / 40);
                return;
            }
            this.method3549(arg0, 0, var3);
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(Loa;Lgba;III)V")
    public static final void method3545(class651 arg0, class625 arg1, int arg2, int arg3, int arg4) {
        field8668++;
        class217 var5 = arg1.method3431(0, arg0);
        if (var5 == null || arg3 != -939090648) {
            return;
        }
        arg0.method421(arg2, arg4, arg2 + arg1.field8350, arg4 - -arg1.field8361);
        if (class504.field6729 == 2 || class504.field6729 == 5 || class265.field3677 == null) {
            arg0.method397(-16777216, var5, arg2, arg4);
            return;
        }
        int var6;
        int var7;
        int var8;
        int var9;
        if (class140.field2254 == 4) {
            var6 = class412.field5654;
            var7 = 4096;
            var8 = (int) (-class42.field602) & 0x3FFF;
            var9 = class247.field3443;
        } else {
            var6 = class199.field2897.field8612;
            var8 = (int) (-class42.field602) + class588.field7795 & 0x3FFF;
            var9 = class199.field2897.field8620;
            var7 = 4096 - (class376.field5073 * 16);
        }
        int var10 = var9 / 128 + 48 - ((class34.field530 - 104) * 2);
        int var11 = class34.field531 * 4 + 48 - (var6 / 128) - ((class34.field531 + -104) * 2);
        class265.field3677.method2642((float) arg1.field8350 / 2.0F + (float) arg2, (float) arg1.field8361 / 2.0F + (float) arg4, (float) var10, (float) var11, var7, var8 << 2, var5, arg2, arg4);
        for (class704 var12 = (class704) class312.field4299.method3257(arg3 + 939090525); var12 != null; var12 = (class704) class312.field4299.method3263((byte) -126)) {
            int var58 = var12.field9905;
            int var59 = (class304.field4221.field2565[var58] >> 14 & 0x3FFF) - class473.field6334;
            int var60 = (class304.field4221.field2565[var58] & 0x3FFF) - class233.field3269;
            int var61 = var59 * 4 + 2 - (var9 / 128);
            int var62 = var60 * 4 + 2 - (var6 / 128);
            class551.method3060(arg0, arg2, var62, arg4, var61, arg1, arg3 + 939090650, class304.field4221.field2559[var58], var5);
        }
        for (int var13 = 0; var13 < class243.field3392; var13++) {
            int var55 = class518.field6906[var13] * 4 - (var9 / 128 - 2);
            int var56 = class82.field1287[var13] * 4 + 2 - var6 / 128;
            class58 var57 = class470.field6288.method1258(class70.field1051[var13], (byte) -65);
            if (var57.field888 != null) {
                var57 = var57.method486((byte) -113, class80.field1261);
                if (var57 == null || var57.field845 == -1) {
                    continue;
                }
            }
            class551.method3060(arg0, arg2, var56, arg4, var55, arg1, 2, var57.field845, var5);
        }
        for (class354 var14 = (class354) class262.field3643.method2915(106); var14 != null; var14 = (class354) class262.field3643.method2912((byte) 125)) {
            int var50 = (int) (var14.field6724 >> 28 & 0x3L);
            if (class138.field2239 == var50) {
                int var51 = (int) (var14.field6724 & 0x3FFFL) - class473.field6334;
                int var52 = (int) (var14.field6724 >> 14 & 0x3FFFL) - class233.field3269;
                int var53 = var51 * 4 + 2 - (var9 / 128);
                int var54 = var52 * 4 + 2 - (var6 / 128);
                class146.method1056(var5, arg2, var54, var53, arg1, false, class683.field9617[0], arg4);
            }
        }
        for (int var15 = 0; var15 < class92.field1396; var15++) {
            class280 var45 = (class280) class616.field8143.method2918((long) class415.field5681[var15], (byte) 111);
            if (var45 != null) {
                class287 var46 = var45.field3983;
                if (var46.method1778(-21653) && class199.field2897.field8609 == var46.field8609) {
                    class419 var47 = var46.field4052;
                    if (var47 != null && var47.field5753 != null) {
                        var47 = var47.method2401(false, class80.field1261);
                    }
                    if (var47 != null && var47.field5780 && var47.field5734) {
                        int var48 = var46.field8620 / 128 - (var9 / 128);
                        int var49 = var46.field8612 / 128 - (var6 / 128);
                        if (var47.field5778 == -1) {
                            class146.method1056(var5, arg2, var49, var48, arg1, false, class683.field9617[1], arg4);
                        } else {
                            class551.method3060(arg0, arg2, var49, arg4, var48, arg1, 2, var47.field5778, var5);
                        }
                    }
                }
            }
        }
        int var16 = class664.field9426;
        int[] var17 = class55.field762;
        for (int var18 = 0; var18 < var16; var18++) {
            class403 var37 = class572.field7601[var17[var18]];
            if (var37 != null && var37.method2309(arg3 + 939068995) && class199.field2897 != var37 && class199.field2897.field8609 == var37.field8609) {
                int var38 = var37.field8620 / 128 - (var9 / 128);
                int var39 = var37.field8612 / 128 - (var6 / 128);
                boolean var40 = false;
                for (int var41 = 0; var41 < class408.field5515; var41++) {
                    if (var37.field5398.equals(class398.field5296[var41]) && class358.field4848[var41] != 0) {
                        var40 = true;
                        break;
                    }
                }
                boolean var42 = false;
                for (int var43 = 0; var43 < class156.field2457; var43++) {
                    if (var37.field5398.equals(class636.field8571[var43].field3128)) {
                        var42 = true;
                        break;
                    }
                }
                boolean var44 = false;
                if (class199.field2897.field5397 != 0 && var37.field5397 != 0 && class199.field2897.field5397 == var37.field5397) {
                    var44 = true;
                }
                if (var37.field5394) {
                    class146.method1056(var5, arg2, var39, var38, arg1, false, class683.field9617[6], arg4);
                } else if (var40) {
                    class146.method1056(var5, arg2, var39, var38, arg1, false, class683.field9617[3], arg4);
                } else if (var42) {
                    class146.method1056(var5, arg2, var39, var38, arg1, false, class683.field9617[5], arg4);
                } else if (var44) {
                    class146.method1056(var5, arg2, var39, var38, arg1, false, class683.field9617[4], arg4);
                } else {
                    class146.method1056(var5, arg2, var39, var38, arg1, false, class683.field9617[2], arg4);
                }
            }
        }
        class149[] var19 = class129.field2154;
        for (int var20 = 0; var20 < var19.length; var20++) {
            class149 var23 = var19[var20];
            if (var23 != null && var23.field2385 != 0 && (class642.field8626 % 20) < 10) {
                if (var23.field2385 == 1) {
                    class280 var24 = (class280) class616.field8143.method2918((long) var23.field2383, (byte) 23);
                    if (var24 != null) {
                        class287 var25 = var24.field3983;
                        int var26 = var25.field8620 / 128 - (var9 / 128);
                        int var27 = var25.field8612 / 128 - (var6 / 128);
                        class645.method3540(var23.field2389, arg2, var26, var27, var5, arg1, arg4, 2, 360000L);
                    }
                }
                if (var23.field2385 == 2) {
                    int var28 = var23.field2377 / 128 - (var9 / 128);
                    int var29 = var23.field2390 / 128 - (var6 / 128);
                    long var30 = (long) (var23.field2376 << 7);
                    long var32 = var30 * var30;
                    class645.method3540(var23.field2389, arg2, var28, var29, var5, arg1, arg4, arg3 ^ 0xC8069D2A, var32);
                }
                if (var23.field2385 == 10 && var23.field2383 >= 0 && class572.field7601.length > var23.field2383) {
                    class403 var34 = class572.field7601[var23.field2383];
                    if (var34 != null) {
                        int var35 = var34.field8620 / 128 - var9 / 128;
                        int var36 = var34.field8612 / 128 - (var6 / 128);
                        class645.method3540(var23.field2389, arg2, var35, var36, var5, arg1, arg4, 2, 360000L);
                    }
                }
            }
        }
        if (class140.field2254 == 4) {
            return;
        }
        if (class123.field2061 != 0) {
            int var21 = (class123.field2061 * 4 + class199.field2897.method2317((byte) 40) * 2 + 2 - 2) - (var9 / 128);
            int var22 = class476.field6353 * 4 + 2 - (var6 / 128 + -((class199.field2897.method2317((byte) 40) - 1) * 2));
            class146.method1056(var5, arg2, var22, var21, arg1, false, class226.field3189[class227.field3199 ? 1 : 0], arg4);
        }
        arg0.method3567(3, arg1.field8350 / 2 + arg2 - 1, 3, arg4 + (arg1.field8361 / 2) - 1, -1, (byte) 97);
        return;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(I)V")
    public static final void method3546(int arg0) {
        field8663++;
        if (class171.field2633 == null) {
            return;
        }
        class2.field11 = new class230();
        class2.field11.method1436(class171.field2633.field7354.method546(class516.field6892, (byte) -35), (byte) 40, class171.field2633, class171.field2633.field7363, class690.field9730);
        if (arg0 == 127) {
            class696.field9776 = new Thread(class2.field11, "");
            class696.field9776.start();
        }
    }

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "(I)V")
    public final void method3547(int arg0) {
        this.field8676 = this.field8676 << 8 | this.field8672;
        field8681++;
        if (this.field8673 == -1) {
            this.field8673 = this.field8677;
        }
        if (arg0 != 11534) {
            this.field8672 = -49;
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(Ljava/lang/String;I)V")
    public static final void method3548(String arg0, int arg1) {
        field8670++;
        if (arg0 == null) {
            return;
        }
        if (arg0.startsWith("*")) {
            arg0 = arg0.substring(1);
        }
        if (arg1 != 1) {
            method3546(-30);
        }
        String var2 = class166.method1138(arg0, 3317);
        if (var2 == null) {
            return;
        }
        for (int var3 = 0; var3 < class408.field5515; var3++) {
            String var4 = class398.field5296[var3];
            if (var4.startsWith("*")) {
                var4 = var4.substring(1);
            }
            String var5 = class166.method1138(var4, 3317);
            if (var5 != null && var5.equals(var2)) {
                class408.field5515--;
                for (int var6 = var3; var6 < class408.field5515; var6++) {
                    class398.field5296[var6] = class398.field5296[var6 + 1];
                    class34.field529[var6] = class34.field529[var6 + 1];
                    class358.field4848[var6] = class358.field4848[var6 + 1];
                    class561.field7436[var6] = class561.field7436[var6 + 1];
                    class410.field5541[var6] = class410.field5541[var6 + 1];
                    class68.field1029[var6] = class68.field1029[var6 + 1];
                }
                class410.field5544 = class367.field4959;
                class187.field2780++;
                class402 var7 = class390.method2252(class402.field5346, -80, class262.field3644);
                var7.field5354.method1980(-345277664, class580.method3186(100, arg0));
                var7.field5354.method2019(-104, arg0);
                class36.method278(arg1 - 1, var7);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(Leh;II)V")
    private final void method3549(class335 arg0, int arg1, int arg2) {
        field8682++;
        if (arg1 != 0) {
            return;
        }
        if (arg2 == 1) {
            this.field8675 = class561.method3086(arg0.method2042((byte) 53), 12582);
        } else if (arg2 == 2) {
            this.field8677 = arg0.method2034(arg1 + 255);
        } else if (arg2 == 3) {
            this.field8677 = arg0.method2001((byte) -83);
            if (this.field8677 == 65535) {
                this.field8677 = -1;
                return;
            }
        } else if (arg2 == 5) {
            this.field8679 = false;
        } else if (arg2 == 7) {
            this.field8665 = class561.method3086(arg0.method2042((byte) 53), 12582);
            return;
        } else if (arg2 == 8) {
            this.field8680.field7986 = this.field8672;
            return;
        } else if (arg2 == 9) {
            this.field8666 = arg0.method2001((byte) -83) << 2;
            return;
        } else if (arg2 == 10) {
            this.field8678 = false;
            return;
        } else if (arg2 == 11) {
            this.field8676 = arg0.method2034(255);
            return;
        } else if (arg2 == 12) {
            this.field8674 = true;
            return;
        } else if (arg2 == 13) {
            this.field8671 = arg0.method2042((byte) 53);
            return;
        } else {
            if (arg2 == 14) {
                this.field8669 = arg0.method2034(255) << 2;
            } else if (arg2 == 15) {
                this.field8673 = arg0.method2001((byte) -83);
                if (this.field8673 == 65535) {
                    this.field8673 = -1;
                    return;
                }
                return;
            } else if (arg2 == 16) {
                this.field8667 = arg0.method2034(arg1 ^ 0xFF);
                return;
            }
            return;
        }
    }
}
