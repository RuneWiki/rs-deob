import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lq")
public class class385 extends class177 implements class232 {

    @OriginalMember(owner = "client!lq", name = "D", descriptor = "Lkg;")
    public class177 field5698;

    @OriginalMember(owner = "client!lq", name = "z", descriptor = "I")
    public static int field5694;

    @OriginalMember(owner = "client!lq", name = "A", descriptor = "I")
    public static int field5695;

    @OriginalMember(owner = "client!lq", name = "B", descriptor = "I")
    public static int field5696;

    @OriginalMember(owner = "client!lq", name = "C", descriptor = "I")
    public static int field5697;

    @OriginalMember(owner = "client!lq", name = "E", descriptor = "I")
    public static int field5699;

    @OriginalMember(owner = "client!lq", name = "F", descriptor = "I")
    public static int field5700;

    @OriginalMember(owner = "client!lq", name = "G", descriptor = "I")
    public static int field5701;

    @OriginalMember(owner = "client!lq", name = "H", descriptor = "I")
    public static int field5702;

    @OriginalMember(owner = "client!lq", name = "I", descriptor = "I")
    public static int field5703;

    @OriginalMember(owner = "client!lq", name = "J", descriptor = "I")
    public static int field5704;

    @OriginalMember(owner = "client!lq", name = "K", descriptor = "I")
    public static int field5705;

    @OriginalMember(owner = "client!lq", name = "L", descriptor = "I")
    public static int field5706;

    @OriginalMember(owner = "client!lq", name = "M", descriptor = "I")
    public static int field5707;

    @OriginalMember(owner = "client!lq", name = "N", descriptor = "I")
    public static int field5708;

    @OriginalMember(owner = "client!lq", name = "O", descriptor = "I")
    public static int field5709;

    @OriginalMember(owner = "client!lq", name = "P", descriptor = "I")
    public static int field5710;

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(I)Z", line = 5)
    public final boolean method377(int arg0) {
        if (arg0 >= -27) {
            this.method1264(true);
        }
        field5697++;
        return false;
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(IILqa;)Lc;", line = 16)
    public final class121 method381(int arg0, int arg1, class162 arg2) {
        if (arg0 == 1584) {
            field5694++;
            return null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!lq", name = "c", descriptor = "(I)V", line = 27)
    public final void method376(int arg0) {
        if (arg0 == 16931) {
            field5700++;
        }
    }

    @OriginalMember(owner = "client!lq", name = "b", descriptor = "(I)I", line = 42)
    public final int method375(int arg0) {
        field5705++;
        return arg0 == -13015 ? 0 : 56;
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(JI)V", line = 53)
    public static final void method2423(long arg0, int arg1) {
        int var3 = 12 % ((59 - arg1) / 56);
        field5710++;
        int var4 = class95.field1558.field5529 + class379.field5655;
        int var5 = class314.field4492 + class95.field1558.field5539;
        if ((class510.field7532 - var4) < -500 || (class510.field7532 - var4) > 500 || (class87.field1460 - var5) < -500 || (class87.field1460 - var5) > 500) {
            class510.field7532 = var4;
            class87.field1460 = var5;
        }
        if (class510.field7532 != var4) {
            int var6 = var4 - class510.field7532;
            int var7 = (int) ((long) var6 * arg0 / 320L);
            if (var6 <= 0) {
                if (var7 == 0) {
                    var7 = -1;
                } else if (var7 < var6) {
                    var7 = var6;
                }
            } else if (var7 == 0) {
                var7 = 1;
            } else if (var7 > var6) {
                var7 = var6;
            }
            class510.field7532 += var7;
        }
        if (class87.field1460 != var5) {
            int var8 = var5 - class87.field1460;
            int var9 = (int) ((long) var8 * arg0 / 320L);
            if (var8 > 0) {
                if (var9 == 0) {
                    var9 = 1;
                } else if (var8 < var9) {
                    var9 = var8;
                }
            } else if (var9 == 0) {
                var9 = -1;
            } else if (var8 > var9) {
                var9 = var8;
            }
            class87.field1460 += var9;
        }
        if (!class397.field5830.field150) {
            class382.field5684 += (float) arg0 * class434.field6315 / 6.0F;
            class66.field1161 += (float) arg0 * class278.field4008 / 6.0F;
        }
        class111.method822(4);
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(IIII[BII[BI)V", line = 141)
    public static final void method2424(int arg0, int arg1, int arg2, int arg3, byte[] arg4, int arg5, int arg6, byte[] arg7, int arg8) {
        field5709++;
        int var9 = -(arg2 >> 2);
        int var10 = -(arg2 & 0x3);
        int var11 = -41 % ((arg5 - 14) / 36);
        for (int var12 = -arg6; var12 < 0; var12++) {
            int var10001;
            for (int var13 = var9; var13 < 0; var13++) {
                var10001 = arg1++;
                arg4[var10001] = (byte) (arg4[var10001] - arg7[arg8++]);
                int var15 = arg1++;
                arg4[var15] = (byte) (arg4[var15] - arg7[arg8++]);
                int var16 = arg1++;
                arg4[var16] = (byte) (arg4[var16] - arg7[arg8++]);
                int var17 = arg1++;
                arg4[var17] = (byte) (arg4[var17] - arg7[arg8++]);
            }
            for (int var14 = var10; var14 < 0; var14++) {
                var10001 = arg1++;
                arg4[var10001] = (byte) (arg4[var10001] - arg7[arg8++]);
            }
            arg8 += arg3;
            arg1 += arg0;
        }
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(IIIZLoe;IIIIII)Z", line = 184)
    public static final boolean method2425(int arg0, int arg1, int arg2, boolean arg3, class133 arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        field5706++;
        int var11 = arg7;
        int var12 = arg1;
        byte var13 = 64;
        byte var14 = 64;
        int var15 = arg7 - var13;
        int var16 = arg1 - var14;
        class54.field800[var13][var14] = 99;
        class466.field6859[var13][var14] = 0;
        if (arg3) {
            method2424(-44, 78, -17, 122, null, -112, -85, null, 17);
        }
        byte var17 = 0;
        int var18 = 0;
        class127.field1935[var17] = arg7;
        byte var10001 = var17;
        int var26 = var17 + 1;
        class185.field2760[var10001] = arg1;
        int[][] var19 = arg4.field2047;
        while (var26 != var18) {
            var12 = class185.field2760[var18];
            var11 = class127.field1935[var18];
            int var20 = var11 - arg4.field2050;
            int var21 = var12 - arg4.field2052;
            int var22 = var12 - var16;
            var18 = var18 + 1 & 0xFFF;
            int var23 = var11 - var15;
            if (arg5 == -4) {
                if (arg9 == var11 && arg6 == var12) {
                    class366.field5490 = var11;
                    class407.field5985 = var12;
                    return true;
                }
            } else if (arg5 == -3) {
                if (class310.method1945(1, arg9, arg6, (byte) -73, arg8, var12, var11, arg2, 1)) {
                    class407.field5985 = var12;
                    class366.field5490 = var11;
                    return true;
                }
            } else if (arg5 == -2) {
                if (arg4.method972(arg6, 1, 57, arg2, arg9, arg8, var11, var12, arg0, 1)) {
                    class366.field5490 = var11;
                    class407.field5985 = var12;
                    return true;
                }
            } else if (arg5 == -1) {
                if (arg4.method974(arg2, 1, arg0, arg9, arg8, var12, 2, var11, arg6)) {
                    class407.field5985 = var12;
                    class366.field5490 = var11;
                    return true;
                }
            } else if (arg5 == 0 || arg5 == 1 || arg5 == 2 || arg5 == 3 || arg5 == 9) {
                if (arg4.method979(var11, 1, arg9, 0, arg10, arg5, var12, arg6)) {
                    class407.field5985 = var12;
                    class366.field5490 = var11;
                    return true;
                }
            } else if (arg4.method971(arg10, var11, arg5, arg9, 1, 0, arg6, var12)) {
                class407.field5985 = var12;
                class366.field5490 = var11;
                return true;
            }
            int var25 = class466.field6859[var23][var22] + 1;
            if (var23 > 0 && class54.field800[var23 - 1][var22] == 0 && (var19[var20 - 1][var21] & 0x42240000) == 0) {
                class127.field1935[var26] = var11 - 1;
                class185.field2760[var26] = var12;
                var26 = var26 + 1 & 0xFFF;
                class54.field800[var23 - 1][var22] = 2;
                class466.field6859[var23 - 1][var22] = var25;
            }
            if (var23 < 127 && class54.field800[var23 + 1][var22] == 0 && (var19[var20 + 1][var21] & 0x60240000) == 0) {
                class127.field1935[var26] = var11 + 1;
                class185.field2760[var26] = var12;
                class54.field800[var23 + 1][var22] = 8;
                var26 = var26 + 1 & 0xFFF;
                class466.field6859[var23 + 1][var22] = var25;
            }
            if (var22 > 0 && class54.field800[var23][var22 - 1] == 0 && (var19[var20][var21 - 1] & 0x40A40000) == 0) {
                class127.field1935[var26] = var11;
                class185.field2760[var26] = var12 - 1;
                var26 = var26 + 1 & 0xFFF;
                class54.field800[var23][var22 - 1] = 1;
                class466.field6859[var23][var22 - 1] = var25;
            }
            if (var22 < 127 && class54.field800[var23][var22 + 1] == 0 && (var19[var20][var21 + 1] & 0x48240000) == 0) {
                class127.field1935[var26] = var11;
                class185.field2760[var26] = var12 + 1;
                var26 = var26 + 1 & 0xFFF;
                class54.field800[var23][var22 + 1] = 4;
                class466.field6859[var23][var22 + 1] = var25;
            }
            if (var23 > 0 && var22 > 0 && class54.field800[var23 - 1][var22 - 1] == 0 && (var19[var20 - 1][var21 - 1] & 0x43A40000) == 0 && (var19[var20 - 1][var21] & 0x42240000) == 0 && (var19[var20][var21 - 1] & 0x40A40000) == 0) {
                class127.field1935[var26] = var11 - 1;
                class185.field2760[var26] = var12 - 1;
                class54.field800[var23 - 1][var22 - 1] = 3;
                var26 = var26 + 1 & 0xFFF;
                class466.field6859[var23 - 1][var22 - 1] = var25;
            }
            if (var23 < 127 && var22 > 0 && class54.field800[var23 + 1][var22 - 1] == 0 && (var19[var20 + 1][var21 - 1] & 0x60E40000) == 0 && (var19[var20 + 1][var21] & 0x60240000) == 0 && (var19[var20][var21 - 1] & 0x40A40000) == 0) {
                class127.field1935[var26] = var11 + 1;
                class185.field2760[var26] = var12 - 1;
                var26 = var26 + 1 & 0xFFF;
                class54.field800[var23 + 1][var22 - 1] = 9;
                class466.field6859[var23 + 1][var22 - 1] = var25;
            }
            if (var23 > 0 && var22 < 127 && class54.field800[var23 - 1][var22 + 1] == 0 && (var19[var20 - 1][var21 + 1] & 0x4E240000) == 0 && (var19[var20 - 1][var21] & 0x42240000) == 0 && (var19[var20][var21 + 1] & 0x48240000) == 0) {
                class127.field1935[var26] = var11 - 1;
                class185.field2760[var26] = var12 + 1;
                class54.field800[var23 - 1][var22 + 1] = 6;
                var26 = var26 + 1 & 0xFFF;
                class466.field6859[var23 - 1][var22 + 1] = var25;
            }
            if (var23 < 127 && var22 < 127 && class54.field800[var23 + 1][var22 + 1] == 0 && (var19[var20 + 1][var21 + 1] & 0x78240000) == 0 && (var19[var20 + 1][var21] & 0x60240000) == 0 && (var19[var20][var21 + 1] & 0x48240000) == 0) {
                class127.field1935[var26] = var11 + 1;
                class185.field2760[var26] = var12 + 1;
                class54.field800[var23 + 1][var22 + 1] = 12;
                var26 = var26 + 1 & 0xFFF;
                class466.field6859[var23 + 1][var22 + 1] = var25;
            }
        }
        class366.field5490 = var11;
        class407.field5985 = var12;
        return false;
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(Lqa;I)V", line = 431)
    public final void method374(class162 arg0, int arg1) {
        if (arg1 == 28339) {
            field5699++;
        }
    }

    @OriginalMember(owner = "client!lq", name = "<init>", descriptor = "(IIIIILkg;)V", line = 441)
    public class385(int arg0, int arg1, int arg2, int arg3, int arg4, class177 arg5) {
        super(arg2, arg3, arg4, 0, 0, 0, class18.method164(1, arg0, arg1));
        this.field5698 = arg5;
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(ILqa;)Lbw;", line = 452)
    public final class482 method114(int arg0, class162 arg1) {
        field5704++;
        if (arg0 != -6796) {
            this.method374(null, -66);
        }
        return null;
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(IIILqa;)Z", line = 463)
    public final boolean method122(int arg0, int arg1, int arg2, class162 arg3) {
        field5696++;
        if (arg1 != -1) {
            this.field5698 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(Z)I", line = 474)
    public final int method380(boolean arg0) {
        if (arg0) {
            field5707++;
            return 0;
        } else {
            return 72;
        }
    }

    @OriginalMember(owner = "client!lq", name = "j", descriptor = "(I)V", line = 487)
    public static final void method2426(int arg0) {
        class364 var1 = class248.field3579;
        synchronized (class248.field3579) {
            if (arg0 != -5438) {
                method2423(49L, -19);
            }
            class248.field3579.method2349(0);
        }
        field5703++;
        class364 var2 = class87.field1449;
        synchronized (class87.field1449) {
            class87.field1449.method2349(0);
        }
    }

    @OriginalMember(owner = "client!lq", name = "b", descriptor = "(Lqa;I)V", line = 503)
    public final void method373(class162 arg0, int arg1) {
        field5702++;
        if (arg1 != -2304) {
            method2425(45, 97, 118, false, null, 53, 52, 15, 102, -119, 101);
        }
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(B)I", line = 514)
    public final int method379(byte arg0) {
        field5695++;
        return arg0 == -96 ? 0 : -99;
    }

    @OriginalMember(owner = "client!lq", name = "b", descriptor = "(Z)I", line = 530)
    public final int method1264(boolean arg0) {
        field5708++;
        return arg0 ? 41 : 0;
    }

    @OriginalMember(owner = "client!lq", name = "c", descriptor = "(Lqa;I)V", line = 544)
    public final void method126(class162 arg0, int arg1) {
        if (arg1 > -43) {
            this.method114(103, null);
        }
        field5701++;
    }
}
