import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!i")
public class class88 extends class43 {

    @OriginalMember(owner = "client!i", name = "V", descriptor = "I")
    private int field1534 = 16;

    @OriginalMember(owner = "client!i", name = "W", descriptor = "I")
    private int field1535 = 2000;

    @OriginalMember(owner = "client!i", name = "eb", descriptor = "I")
    private int field1543 = 4096;

    @OriginalMember(owner = "client!i", name = "ib", descriptor = "I")
    private int field1547 = 0;

    @OriginalMember(owner = "client!i", name = "lb", descriptor = "I")
    private int field1550 = 0;

    @OriginalMember(owner = "client!i", name = "db", descriptor = "[Lmb;")
    public static class132[] field1542 = new class132[200];

    @OriginalMember(owner = "client!i", name = "T", descriptor = "I")
    public static int field1532 = -1;

    @OriginalMember(owner = "client!i", name = "fb", descriptor = "Lmb;")
    private static class132 field1544 = class166.method1092("Loaded textures", 122);

    @OriginalMember(owner = "client!i", name = "kb", descriptor = "Lmb;")
    public static class132 field1549 = field1544;

    @OriginalMember(owner = "client!i", name = "U", descriptor = "I")
    public static int field1533;

    @OriginalMember(owner = "client!i", name = "X", descriptor = "I")
    public static int field1536;

    @OriginalMember(owner = "client!i", name = "Z", descriptor = "I")
    public static int field1538;

    @OriginalMember(owner = "client!i", name = "ab", descriptor = "I")
    public static int field1539;

    @OriginalMember(owner = "client!i", name = "bb", descriptor = "I")
    public static int field1540;

    @OriginalMember(owner = "client!i", name = "cb", descriptor = "I")
    public static int field1541;

    @OriginalMember(owner = "client!i", name = "gb", descriptor = "I")
    public static int field1545;

    @OriginalMember(owner = "client!i", name = "hb", descriptor = "I")
    public static int field1546;

    @OriginalMember(owner = "client!i", name = "jb", descriptor = "I")
    public static int field1548;

    @OriginalMember(owner = "client!i", name = "mb", descriptor = "I")
    public static int field1551;

    @OriginalMember(owner = "client!i", name = "Y", descriptor = "Lpb;")
    public static class165 field1537;

    @OriginalMember(owner = "client!i", name = "c", descriptor = "(III)V")
    private static final void method546(int arg0, int arg1, int arg2) {
        class169 var3 = class101.field1900[arg0][arg1][arg2];
        if (var3 != null) {
            var3.field3099 = null;
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(IIIILtf;II)V")
    public static final void method547(int arg0, int arg1, int arg2, int arg3, class210 arg4, int arg5, int arg6) {
        ++field1538;
        boolean var7 = false;
        boolean var8 = true;
        long var9 = 0L;
        boolean var11 = false;
        if (~arg6 == -1) {
            var9 = class85.method534(arg1, arg0, arg3);
        }
        if (arg6 == 1) {
            var9 = class200.method1265(arg1, arg0, arg3);
        }
        if (~arg6 == -3) {
            var9 = class53.method364(arg1, arg0, arg3);
        }
        if (arg2 != 4096) {
            method551(7, 23, 67, 127);
        }
        if (~arg6 == -4) {
            var9 = class65.method408(arg1, arg0, arg3);
        }
        if (var9 != 0L) {
            int var12 = Integer.MAX_VALUE & (int) (var9 >>> 32);
            int var13 = 3 & (int) var9 >> 20;
            class84 var14 = class66.method414(0, var12);
            int var15 = (int) var9 >> 14 & 31;
            if (~arg6 == -1) {
                class134.method916(arg1, arg0, arg3);
                if (var14.field1427 != 0) {
                    arg4.method1303(var14.field1447, var13, (byte) 103, arg0, var15, arg3);
                }
            }
            if (arg6 == 1) {
                method546(arg1, arg0, arg3);
            }
            if (~arg6 == -3) {
                class127.method835(arg1, arg0, arg3);
                if (var14.field1427 != 0 && arg0 - -var14.field1434 < 104 && var14.field1434 + arg3 < 104 && var14.field1440 + arg0 < 104 && ~(var14.field1440 + arg3) > -105) {
                    arg4.method1298(arg3, var14.field1434, var14.field1447, arg0, var14.field1440, var13, 6229);
                }
            }
            if (~arg6 == -4) {
                class209.method1290(arg1, arg0, arg3);
                if (var14.field1427 == 1) {
                    arg4.method1308(arg3, arg0, true);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!i", name = "<init>", descriptor = "()V")
    public class88() {
        super(0, true);
    }

    @OriginalMember(owner = "client!i", name = "c", descriptor = "(II)V")
    public static final void method548(int arg0, int arg1) {
        ++field1546;
        class17 var2 = class69.field1147;
        synchronized (class69.field1147) {
            class210.field3843 = arg0;
        }
        if (arg1 != -16828) {
            field1544 = null;
        }
    }

    @OriginalMember(owner = "client!i", name = "d", descriptor = "(II)Z")
    public static final boolean method549(int arg0, int arg1) {
        if (arg0 <= 47) {
            field1542 = null;
        }
        ++field1536;
        return (arg1 & 386312542) >> 28 != 0;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Lmb;B)Lmb;")
    public static final class132 method550(class132 arg0, byte arg1) {
        ++field1551;
        if (arg1 != -54) {
            return null;
        } else {
            class100 var2 = class49.method322(arg0, 0);
            return var2 == null ? class153.field2790 : var2.field1877;
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(IIII)V")
    public static final void method551(int arg0, int arg1, int arg2, int arg3) {
        class169 var4 = class101.field1900[arg0][arg1][arg2];
        if (var4 != null) {
            class220 var5 = var4.field3099;
            if (var5 != null) {
                var5.field4010 = var5.field4010 * arg3 / 16;
                var5.field4018 = var5.field4018 * arg3 / 16;
            }
        }
    }

    @OriginalMember(owner = "client!i", name = "b", descriptor = "(II)[I")
    public final int[] method64(int arg0, int arg1) {
        ++field1548;
        int[] var3 = super.field768.method1123(arg1 ^ arg1, arg0);
        if (super.field768.field3219) {
            int var4 = this.field1543 >> 1;
            int[][] var5 = super.field768.method1120(0);
            Random var6 = new Random((long) this.field1547);
            for (int var7 = 0; this.field1535 > var7; ++var7) {
                int var8 = this.field1543 > 0 ? this.field1550 + -var4 + class133.method914((byte) 53, var6, this.field1543) : this.field1550;
                int var9 = var8 >> 4 & 255;
                int var10 = class133.method914((byte) 53, var6, class131.field2427);
                int var11 = class133.method914((byte) 53, var6, class42.field689);
                int var12 = (class69.field1151[var9] * this.field1534 >> 12) + var10;
                int var13 = (class174.field3239[var9] * this.field1534 >> 12) + var11;
                int var14 = -var10 + var12;
                int var15 = -var11 + var13;
                if (~var14 != -1 || var15 != 0) {
                    if (~var14 > -1) {
                        var14 = -var14;
                    }
                    if (var15 < 0) {
                        var15 = -var15;
                    }
                    boolean var16 = ~var14 > ~var15;
                    if (var16) {
                        int var17 = var10;
                        var10 = var11;
                        var11 = var17;
                        int var18 = var12;
                        var12 = var13;
                        var13 = var18;
                    }
                    if (var10 > var12) {
                        int var19 = var10;
                        int var20 = var11;
                        var10 = var12;
                        var11 = var13;
                        var12 = var19;
                        var13 = var20;
                    }
                    int var21 = var11;
                    int var22 = -var10 + var12;
                    int var23 = -var11 + var13;
                    if (~var23 > -1) {
                        var23 = -var23;
                    }
                    int var24 = 2048 / var22;
                    int var25 = -var22 / 2;
                    int var26 = -(class133.method914((byte) 53, var6, 4096) >> 2) + 1024;
                    int var27 = var13 <= var11 ? -1 : 1;
                    for (int var28 = var10; var12 > var28; ++var28) {
                        var25 += var23;
                        int var29 = (var28 - var10) * var24 + var26 - -1024;
                        int var30 = class90.field1593 & var28;
                        int var31 = class185.field3423 & var21;
                        if (var25 > 0) {
                            var25 += -var22;
                            var21 -= -var27;
                        }
                        if (var16) {
                            var5[var31][var30] = var29;
                        } else {
                            var5[var30][var31] = var29;
                        }
                    }
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(IBLkd;)V")
    public final void method200(int arg0, byte arg1, class112 arg2) {
        if (~arg0 != -1) {
            if (~arg0 != -2) {
                if (~arg0 != -3) {
                    if (~arg0 != -4) {
                        if (arg0 == 4) {
                            this.field1543 = arg2.method739(-128);
                        }
                    } else {
                        this.field1550 = arg2.method739(87);
                    }
                } else {
                    this.field1534 = arg2.method716(-1308);
                }
            } else {
                this.field1535 = arg2.method739(34);
            }
        } else {
            this.field1547 = arg2.method716(-1308);
        }
        ++field1540;
        if (arg1 != -73) {
            this.field1534 = 85;
        }
    }

    @OriginalMember(owner = "client!i", name = "g", descriptor = "(I)V")
    public static final void method552(int arg0) {
        class56.field955 = null;
        ++field1533;
        class4.field47 = null;
        if (arg0 != 3310) {
            method548(49, 26);
        }
        class165.field3020 = null;
        class226.field4101 = null;
        class222.field4035 = null;
        class230.field4146 = null;
        class113.field2187 = null;
        class219.field4001 = null;
        class12.field163 = null;
        class141.field2653 = null;
        class111.field2107 = null;
    }

    @OriginalMember(owner = "client!i", name = "f", descriptor = "(I)V")
    public final void method234(int arg0) {
        class191.method1222(false);
        ++field1539;
        if (arg0 <= 21) {
            field1549 = null;
        }
    }

    @OriginalMember(owner = "client!i", name = "h", descriptor = "(I)V")
    public static void method553(int arg0) {
        if (arg0 != -1) {
            method550((class132) null, (byte) 93);
        }
        field1542 = null;
        field1544 = null;
        field1549 = null;
        field1537 = null;
    }
}
