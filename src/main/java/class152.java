import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!di")
public class class152 extends class78 {

    @OriginalMember(owner = "client!di", name = "R", descriptor = "Lik;")
    public static class259 field2447 = new class259(64);

    @OriginalMember(owner = "client!di", name = "W", descriptor = "I")
    public static int field2452 = 0;

    @OriginalMember(owner = "client!di", name = "V", descriptor = "I")
    public static int field2451 = 0;

    @OriginalMember(owner = "client!di", name = "F", descriptor = "I")
    public static int field2435;

    @OriginalMember(owner = "client!di", name = "G", descriptor = "I")
    public static int field2436;

    @OriginalMember(owner = "client!di", name = "H", descriptor = "I")
    public static int field2437;

    @OriginalMember(owner = "client!di", name = "I", descriptor = "I")
    public static int field2438;

    @OriginalMember(owner = "client!di", name = "J", descriptor = "I")
    public static int field2439;

    @OriginalMember(owner = "client!di", name = "L", descriptor = "I")
    public static int field2441;

    @OriginalMember(owner = "client!di", name = "M", descriptor = "I")
    public static int field2442;

    @OriginalMember(owner = "client!di", name = "O", descriptor = "I")
    public static int field2444;

    @OriginalMember(owner = "client!di", name = "Q", descriptor = "I")
    public static int field2446;

    @OriginalMember(owner = "client!di", name = "U", descriptor = "I")
    public static int field2450;

    @OriginalMember(owner = "client!di", name = "X", descriptor = "Lja;")
    public static class64 field2453;

    @OriginalMember(owner = "client!di", name = "Y", descriptor = "Lja;")
    public static class64 field2454;

    @OriginalMember(owner = "client!di", name = "K", descriptor = "Ljava/lang/String;")
    public String field2440;

    @OriginalMember(owner = "client!di", name = "N", descriptor = "[C")
    public char[] field2443;

    @OriginalMember(owner = "client!di", name = "S", descriptor = "[C")
    public char[] field2448;

    @OriginalMember(owner = "client!di", name = "P", descriptor = "[I")
    public int[] field2445;

    @OriginalMember(owner = "client!di", name = "T", descriptor = "[I")
    public int[] field2449;

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(IIIZIBIIIIII)Z", line = 7)
    private static final boolean method1161(int arg0, int arg1, int arg2, boolean arg3, int arg4, byte arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        for (int var12 = 0; var12 < 104; var12++) {
            for (int var13 = 0; var13 < 104; var13++) {
                class125.field1997[var12][var13] = 0;
                class86.field1321[var12][var13] = 99999999;
            }
        }
        class125.field1997[arg4][arg6] = 99;
        int var14 = arg4;
        class86.field1321[arg4][arg6] = 0;
        int var15 = arg6;
        field2444++;
        boolean var16 = false;
        int var17 = 0;
        byte var18 = 0;
        class217.field3470[var18] = arg4;
        int var32 = var18 + 1;
        class297.field4688[var18] = arg6;
        int[][] var19 = class244.field3772[class41.field734].field879;
        while (var17 != var32) {
            var15 = class297.field4688[var17];
            var14 = class217.field3470[var17];
            var17 = var17 + 1 & 0xFFF;
            if (arg1 == var14 && arg7 == var15) {
                var16 = true;
                break;
            }
            if (arg2 != 0) {
                if ((arg2 < 5 || arg2 == 10) && class244.field3772[class41.field734].method422(arg1, arg7, (byte) -85, var15, arg2 - 1, arg8, var14, 2)) {
                    var16 = true;
                    break;
                }
                if (arg2 < 10 && class244.field3772[class41.field734].method410(arg1, (byte) 51, arg2 - 1, var15, arg7, 2, var14, arg8)) {
                    var16 = true;
                    break;
                }
            }
            if (arg11 != 0 && arg0 != 0 && class244.field3772[class41.field734].method425(arg11, var15, -85, var14, 2, arg9, arg1, arg0, arg7)) {
                var16 = true;
                break;
            }
            int var20 = class86.field1321[var14][var15] + 1;
            if (var14 > 0 && class125.field1997[var14 - 1][var15] == 0 && (var19[var14 - 1][var15] & 0x12C010E) == 0 && (var19[var14 - 1][var15 + 1] & 0x12C0138) == 0) {
                class217.field3470[var32] = var14 - 1;
                class297.field4688[var32] = var15;
                class125.field1997[var14 - 1][var15] = 2;
                var32 = var32 + 1 & 0xFFF;
                class86.field1321[var14 - 1][var15] = var20;
            }
            if (var14 < 102 && class125.field1997[var14 + 1][var15] == 0 && (var19[var14 + 2][var15] & 0x12C0183) == 0 && (var19[var14 + 2][var15 + 1] & 0x12C01E0) == 0) {
                class217.field3470[var32] = var14 + 1;
                class297.field4688[var32] = var15;
                class125.field1997[var14 + 1][var15] = 8;
                var32 = var32 + 1 & 0xFFF;
                class86.field1321[var14 + 1][var15] = var20;
            }
            if (var15 > 0 && class125.field1997[var14][var15 - 1] == 0 && (var19[var14][var15 - 1] & 0x12C010E) == 0 && (var19[var14 + 1][var15 - 1] & 0x12C0183) == 0) {
                class217.field3470[var32] = var14;
                class297.field4688[var32] = var15 - 1;
                class125.field1997[var14][var15 - 1] = 1;
                class86.field1321[var14][var15 - 1] = var20;
                var32 = var32 + 1 & 0xFFF;
            }
            if (var15 < 102 && class125.field1997[var14][var15 + 1] == 0 && (var19[var14][var15 + 2] & 0x12C0138) == 0 && (var19[var14 + 1][var15 + 2] & 0x12C01E0) == 0) {
                class217.field3470[var32] = var14;
                class297.field4688[var32] = var15 + 1;
                var32 = var32 + 1 & 0xFFF;
                class125.field1997[var14][var15 + 1] = 4;
                class86.field1321[var14][var15 + 1] = var20;
            }
            if (var14 > 0 && var15 > 0 && class125.field1997[var14 - 1][var15 - 1] == 0 && (var19[var14 - 1][var15] & 0x12C0138) == 0 && (var19[var14 - 1][var15 - 1] & 0x12C010E) == 0 && (var19[var14][var15 - 1] & 0x12C0183) == 0) {
                class217.field3470[var32] = var14 - 1;
                class297.field4688[var32] = var15 - 1;
                class125.field1997[var14 - 1][var15 - 1] = 3;
                class86.field1321[var14 - 1][var15 - 1] = var20;
                var32 = var32 + 1 & 0xFFF;
            }
            if (var14 < 102 && var15 > 0 && class125.field1997[var14 + 1][var15 - 1] == 0 && (var19[var14 + 1][var15 - 1] & 0x12C010E) == 0 && (var19[var14 + 2][var15 - 1] & 0x12C0183) == 0 && (var19[var14 + 2][var15] & 0x12C01E0) == 0) {
                class217.field3470[var32] = var14 + 1;
                class297.field4688[var32] = var15 - 1;
                var32 = var32 + 1 & 0xFFF;
                class125.field1997[var14 + 1][var15 - 1] = 9;
                class86.field1321[var14 + 1][var15 - 1] = var20;
            }
            if (var14 > 0 && var15 < 102 && class125.field1997[var14 - 1][var15 + 1] == 0 && (var19[var14 - 1][var15 + 1] & 0x12C010E) == 0 && (var19[var14 - 1][var15 + 2] & 0x12C0138) == 0 && (var19[var14][var15 + 2] & 0x12C01E0) == 0) {
                class217.field3470[var32] = var14 - 1;
                class297.field4688[var32] = var15 + 1;
                var32 = var32 + 1 & 0xFFF;
                class125.field1997[var14 - 1][var15 + 1] = 6;
                class86.field1321[var14 - 1][var15 + 1] = var20;
            }
            if (var14 < 102 && var15 < 102 && class125.field1997[var14 + 1][var15 + 1] == 0 && (var19[var14 + 1][var15 + 2] & 0x12C0138) == 0 && (var19[var14 + 2][var15 + 2] & 0x12C01E0) == 0 && (var19[var14 + 2][var15 + 1] & 0x12C0183) == 0) {
                class217.field3470[var32] = var14 + 1;
                class297.field4688[var32] = var15 + 1;
                class125.field1997[var14 + 1][var15 + 1] = 12;
                class86.field1321[var14 + 1][var15 + 1] = var20;
                var32 = var32 + 1 & 0xFFF;
            }
        }
        if (arg5 <= 9) {
            return true;
        }
        class122.field1951 = 0;
        if (!var16) {
            if (!arg3) {
                return false;
            }
            int var21 = 1000;
            int var22 = 100;
            byte var23 = 10;
            for (int var24 = arg1 - var23; var24 <= (arg1 + var23); var24++) {
                for (int var25 = arg7 - var23; var25 <= arg7 + var23; var25++) {
                    if (var24 >= 0 && var25 >= 0 && var24 < 104 && var25 < 104 && class86.field1321[var24][var25] < 100) {
                        int var26 = 0;
                        if (arg7 > var25) {
                            var26 = arg7 - var25;
                        } else if (var25 > (arg0 + arg7 - 1)) {
                            var26 = 1 - (arg7 - (var25 - arg0));
                        }
                        int var27 = 0;
                        if (var24 < arg1) {
                            var27 = arg1 - var24;
                        } else if (var24 > (arg1 + arg11 - 1)) {
                            var27 = var24 + 1 - arg1 - arg11;
                        }
                        int var28 = var26 * var26 + var27 * var27;
                        if (var21 > var28 || var21 == var28 && var22 > class86.field1321[var24][var25]) {
                            var15 = var25;
                            var21 = var28;
                            var14 = var24;
                            var22 = class86.field1321[var24][var25];
                        }
                    }
                }
            }
            if (var21 == 1000) {
                return false;
            }
            if (arg4 == var14 && arg6 == var15) {
                return false;
            }
            class122.field1951 = 1;
        }
        byte var29 = 0;
        class217.field3470[var29] = var14;
        int var33 = var29 + 1;
        class297.field4688[var29] = var15;
        int var30;
        int var31 = var30 = class125.field1997[var14][var15];
        while (arg4 != var14 || arg6 != var15) {
            if (var30 != var31) {
                var30 = var31;
                class217.field3470[var33] = var14;
                class297.field4688[var33++] = var15;
            }
            if ((var31 & 0x2) != 0) {
                var14++;
            } else if ((var31 & 0x8) != 0) {
                var14--;
            }
            if ((var31 & 0x1) != 0) {
                var15++;
            } else if ((var31 & 0x4) != 0) {
                var15--;
            }
            var31 = class125.field1997[var14][var15];
        }
        if (var33 > 0) {
            class303.method2108(arg10, var33, 1);
            return true;
        } else if (arg10 == 1) {
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(IIIIIZIIIZII)Z", line = 403)
    public static final boolean method1162(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7, int arg8, boolean arg9, int arg10, int arg11) {
        field2435++;
        if (class19.field356.method200(-1) == 2) {
            return method1161(arg1, arg4, arg10, arg9, arg6, (byte) 101, arg2, arg8, arg11, arg0, arg3, arg7);
        } else if (class19.field356.method200(-1) > 2) {
            return class90.method649(arg3, arg8, arg1, arg10, -105, arg0, arg6, arg7, class19.field356.method200(-1), arg11, arg4, arg9, arg2);
        } else {
            if (!arg5) {
                method1167(false);
            }
            return class318.method2181(arg11, arg2, arg6, arg4, arg0, arg1, arg10, arg7, 0, arg9, arg8, arg3);
        }
    }

    @OriginalMember(owner = "client!di", name = "g", descriptor = "(I)V", line = 421)
    public final void method1163(int arg0) {
        field2446++;
        if (this.field2445 != null) {
            for (int var2 = 0; var2 < this.field2445.length; var2++) {
                this.field2445[var2] = class94.method673(this.field2445[var2], 32768);
            }
        }
        if (arg0 != 32768) {
            field2451 = -110;
        }
        if (this.field2449 != null) {
            for (int var3 = 0; var3 < this.field2449.length; var3++) {
                this.field2449[var3] = class94.method673(this.field2449[var3], 32768);
            }
        }
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "([BI)[B", line = 452)
    public static final byte[] method1164(byte[] arg0, int arg1) {
        if (arg1 != -7457) {
            field2453 = (class64) null;
        }
        field2436++;
        class101 var2 = new class101(arg0);
        int var3 = var2.method741(8);
        int var4 = var2.method775(arg1 + 7493);
        if (var4 < 0 || !(class248.field3828 == 0 || class248.field3828 >= var4)) {
            throw new RuntimeException();
        } else if (var3 == 0) {
            byte[] var7 = new byte[var4];
            var2.method770(var4, var7, -1127, 0);
            return var7;
        } else {
            int var5 = var2.method775(71);
            if (var5 < 0 || class248.field3828 != 0 && class248.field3828 < var5) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var3 == 1) {
                class238.method1690(var6, var5, arg0, var4, 9);
            } else {
                class188.field2993.method552(10, var6, var2);
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(IC)I", line = 517)
    public final int method1165(int arg0, char arg1) {
        field2437++;
        if (arg0 != -1) {
            return -23;
        } else if (this.field2449 == null) {
            return -1;
        } else {
            for (int var3 = 0; var3 < this.field2449.length; var3++) {
                if (this.field2448[var3] == arg1) {
                    return this.field2449[var3];
                }
            }
            return -1;
        }
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(IIIIIIIIII)V", line = 542)
    public static final void method1166(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        class297 var10 = null;
        class297 var11 = (class297) class221.field3547.method1490(200);
        field2439++;
        while (var11 != null) {
            if (var11.field4693 == arg3 && var11.field4694 == arg8 && var11.field4685 == arg9 && var11.field4692 == arg4) {
                var10 = var11;
                break;
            }
            var11 = (class297) class221.field3547.method1487((byte) 117);
        }
        if (var10 == null) {
            var10 = new class297();
            var10.field4685 = arg9;
            var10.field4693 = arg3;
            var10.field4692 = arg4;
            var10.field4694 = arg8;
            class251.method1775((byte) -127, var10);
            class221.field3547.method1493(-70, var10);
        }
        var10.field4690 = arg1;
        var10.field4684 = arg7;
        var10.field4689 = arg5;
        if (arg0 != 30194) {
            field2447 = (class259) null;
        }
        var10.field4682 = arg2;
        var10.field4696 = arg6;
    }

    @OriginalMember(owner = "client!di", name = "b", descriptor = "(Z)V", line = 585)
    public static void method1167(boolean arg0) {
        field2453 = null;
        field2447 = null;
        field2454 = null;
        if (!arg0) {
            field2447 = (class259) null;
        }
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(Lpe;ZI)V", line = 598)
    private final void method1168(class101 arg0, boolean arg1, int arg2) {
        if (arg1) {
            this.field2443 = (char[]) null;
        }
        field2441++;
        if (arg2 == 1) {
            this.field2440 = arg0.method749((byte) -116);
        } else if (arg2 == 2) {
            int var7 = arg0.method741(27);
            this.field2449 = new int[var7];
            this.field2448 = new char[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field2449[var8] = arg0.method731(false);
                byte var9 = arg0.method727((byte) 124);
                this.field2448[var8] = var9 == 0 ? 0 : class220.method1590((byte) 47, var9);
            }
        } else if (arg2 == 3) {
            int var4 = arg0.method741(83);
            this.field2445 = new int[var4];
            this.field2443 = new char[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field2445[var5] = arg0.method731(false);
                byte var6 = arg0.method727((byte) 125);
                this.field2443[var5] = var6 == 0 ? 0 : class220.method1590((byte) 47, var6);
            }
        } else if (arg2 == 4) {
        }
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(ZC)I", line = 667)
    public final int method1169(boolean arg0, char arg1) {
        field2438++;
        if (this.field2445 == null) {
            return -1;
        }
        if (arg0) {
            this.field2443 = (char[]) null;
        }
        for (int var3 = 0; var3 < this.field2445.length; var3++) {
            if (this.field2443[var3] == arg1) {
                return this.field2445[var3];
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(ZLpe;)V", line = 694)
    public final void method1170(boolean arg0, class101 arg1) {
        while (true) {
            int var3 = arg1.method741(12);
            if (var3 == 0) {
                field2442++;
                if (arg0) {
                    field2452 = -8;
                }
                return;
            }
            this.method1168(arg1, arg0, var3);
        }
    }
}
