import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gg")
public class class67 extends class93 {

    @OriginalMember(owner = "client!gg", name = "eb", descriptor = "I")
    private int field1362 = 32768;

    @OriginalMember(owner = "client!gg", name = "X", descriptor = "[I")
    public static int[] field1355 = new int[] { 0, 4, 4, 8, 0, 0, 8, 0, 0 };

    @OriginalMember(owner = "client!gg", name = "Z", descriptor = "Ljd;")
    public static class92 field1357 = class202.method1325((byte) 90, "Ausw-=hlen");

    @OriginalMember(owner = "client!gg", name = "S", descriptor = "I")
    public static int field1350;

    @OriginalMember(owner = "client!gg", name = "T", descriptor = "I")
    public static int field1351;

    @OriginalMember(owner = "client!gg", name = "U", descriptor = "I")
    public static int field1352;

    @OriginalMember(owner = "client!gg", name = "V", descriptor = "I")
    public static int field1353;

    @OriginalMember(owner = "client!gg", name = "W", descriptor = "I")
    public static int field1354;

    @OriginalMember(owner = "client!gg", name = "Y", descriptor = "I")
    public static int field1356;

    @OriginalMember(owner = "client!gg", name = "ab", descriptor = "I")
    public static int field1358;

    @OriginalMember(owner = "client!gg", name = "bb", descriptor = "I")
    public static int field1359;

    @OriginalMember(owner = "client!gg", name = "cb", descriptor = "I")
    public static int field1360;

    @OriginalMember(owner = "client!gg", name = "db", descriptor = "Lfa;")
    public static class52 field1361;

    @OriginalMember(owner = "client!gg", name = "d", descriptor = "(B)V")
    public final void method87(byte arg0) {
        class107.method738((byte) -20);
        ++field1353;
        if (arg0 != -85) {
            this.method63(109, (class70) null, -113);
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(II)[[I")
    public final int[][] method62(int arg0, int arg1) {
        int[][] var3 = super.field1873.method553(arg0, arg1 ^ arg1);
        ++field1354;
        if (super.field1873.field1656) {
            int[] var4 = this.method648((byte) 119, arg0, 1);
            int[] var5 = this.method648((byte) 104, arg0, 2);
            int[] var6 = var3[2];
            int[] var7 = var3[0];
            int[] var8 = var3[1];
            for (int var9 = 0; class150.field2985 > var9; ++var9) {
                int var10 = var5[var9] * this.field1362 >> 12;
                int var11 = 255 & var4[var9] * 255 >> 12;
                int var12 = class54.field1128[var11] * var10 >> 12;
                int var13 = class26.field598[var11] * var10 >> 12;
                int var14 = class5.field279 & (var12 >> 12) + arg0;
                int var15 = class2.field163 & var9 - -(var13 >> 12);
                int[][] var16 = this.method649(0, true, var14);
                var7[var9] = var16[0][var15];
                var8[var9] = var16[1][var15];
                var6[var9] = var16[2][var15];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!gg", name = "<init>", descriptor = "()V")
    public class67() {
        super(3, false);
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(Ltf;)V")
    public static final void method394(class185 arg0) {
        for (int var1 = arg0.field3488; var1 <= arg0.field3489; ++var1) {
            for (int var2 = arg0.field3486; var2 <= arg0.field3504; ++var2) {
                class43 var3 = class31.field698[arg0.field3487][var1][var2];
                if (var3 != null) {
                    for (int var4 = 0; var4 < var3.field979; ++var4) {
                        if (var3.field966[var4] == arg0) {
                            --var3.field979;
                            for (int var5 = var4; var5 < var3.field979; ++var5) {
                                var3.field966[var5] = var3.field966[var5 + 1];
                                var3.field976[var5] = var3.field976[var5 + 1];
                            }
                            var3.field966[var3.field979] = null;
                            break;
                        }
                    }
                    var3.field981 = 0;
                    for (int var6 = 0; var6 < var3.field979; ++var6) {
                        var3.field981 |= var3.field976[var6];
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!gg", name = "f", descriptor = "(I)V")
    public static final void method395(int arg0) {
        ++field1358;
        if (arg0 == 0) {
            class208.field3995.method923(-95);
        }
    }

    @OriginalMember(owner = "client!gg", name = "b", descriptor = "(II)I")
    public static int method396(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(IB)[I")
    public final int[] method66(int arg0, byte arg1) {
        ++field1359;
        int[] var3 = super.field1887.method916(arg0, -67);
        if (super.field1887.field2757) {
            int[] var4 = this.method648((byte) 108, arg0, 1);
            int[] var5 = this.method648((byte) 106, arg0, 2);
            for (int var6 = 0; ~var6 > ~class150.field2985; ++var6) {
                int var7 = (var4[var6] & 4081) >> 4;
                int var8 = var5[var6] * this.field1362 >> 12;
                int var9 = class26.field598[var7] * var8 >> 12;
                int var10 = class2.field163 & var6 - -(var9 >> 12);
                int var11 = class54.field1128[var7] * var8 >> 12;
                int var12 = (var11 >> 12) + arg0 & class5.field279;
                int[] var13 = this.method648((byte) 59, var12, 0);
                var3[var6] = var13[var10];
            }
        }
        int var14 = 77 / ((67 - arg1) / 42);
        return var3;
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(ILh;I)V")
    public final void method63(int arg0, class70 arg1, int arg2) {
        if (arg2 != 0) {
            method394((class185) null);
        }
        if (arg0 != 0) {
            if (arg0 == 1) {
                super.field1885 = ~arg1.method443(255) == -2;
            }
        } else {
            this.field1362 = arg1.method442(-21351) << 4;
        }
        ++field1350;
    }

    @OriginalMember(owner = "client!gg", name = "g", descriptor = "(I)V")
    public static void method397(int arg0) {
        field1355 = null;
        field1361 = null;
        if (arg0 == 0) {
            field1357 = null;
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(Lnh;BLnh;Lnh;)V")
    public static final void method398(class133 arg0, byte arg1, class133 arg2, class133 arg3) {
        ++field1356;
        class47.field1026 = arg2.method880(client.field692, false);
        class209.field4017 = arg3.method880(class168.field3286, false);
        class81.field1633 = arg3.method880(class87.field1721, false);
        class208.field3998 = arg3.method880(class118.field2368, false);
        if (arg1 != 88) {
            method398((class133) null, (byte) 17, (class133) null, (class133) null);
        }
        class107.field2204 = arg3.method880(class91.field1809, false);
        class80.field1628 = arg3.method880(class132.field2640, false);
        class89.field1761 = arg3.method880(class120.field2432, false);
        class40.field906 = arg3.method880(class26.field602, false);
        class4.field265 = arg3.method880(class91.field1780, false);
        class133.field2651 = arg3.method880(class103.field2130, false);
        class156.field3109 = arg3.method880(class2.field146, false);
        class73.field1539 = arg0.method880(class118.field2398, false);
    }
}
