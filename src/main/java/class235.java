import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hh")
public class class235 extends class182 {

    @OriginalMember(owner = "client!hh", name = "O", descriptor = "Lsf;")
    public static class124 field3846 = new class124(64);

    @OriginalMember(owner = "client!hh", name = "R", descriptor = "[I")
    public static int[] field3849 = new int[2];

    @OriginalMember(owner = "client!hh", name = "Q", descriptor = "Ljava/lang/String;")
    public static String field3848 = "Mechscape is loading - please wait...";

    @OriginalMember(owner = "client!hh", name = "S", descriptor = "Lkk;")
    public static class260 field3850 = new class260();

    @OriginalMember(owner = "client!hh", name = "T", descriptor = "Llj;")
    public static class59 field3851 = new class59(128);

    @OriginalMember(owner = "client!hh", name = "V", descriptor = "Lka;")
    public static class211 field3853 = null;

    @OriginalMember(owner = "client!hh", name = "U", descriptor = "Z")
    public static boolean field3852 = false;

    @OriginalMember(owner = "client!hh", name = "X", descriptor = "I")
    public static volatile int field3855 = 0;

    @OriginalMember(owner = "client!hh", name = "I", descriptor = "I")
    public static int field3840;

    @OriginalMember(owner = "client!hh", name = "J", descriptor = "I")
    public static int field3841;

    @OriginalMember(owner = "client!hh", name = "K", descriptor = "I")
    public static int field3842;

    @OriginalMember(owner = "client!hh", name = "L", descriptor = "I")
    public static int field3843;

    @OriginalMember(owner = "client!hh", name = "M", descriptor = "I")
    public static int field3844;

    @OriginalMember(owner = "client!hh", name = "N", descriptor = "I")
    public static int field3845;

    @OriginalMember(owner = "client!hh", name = "P", descriptor = "I")
    public static int field3847;

    @OriginalMember(owner = "client!hh", name = "W", descriptor = "[Lbn;")
    public static class75[] field3854;

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(II)[[I", line = 9)
    public final int[][] method122(int arg0, int arg1) {
        field3844++;
        if (arg1 != 4944) {
            method1632((byte) 18, 125, 125, -64, -109);
        }
        int[][] var3 = this.field3152.method1953(arg0, 80);
        if (this.field3152.field4493) {
            int[] var4 = this.method1292(arg0, 2, -85);
            int[][] var5 = this.method1291(arg0, (byte) 24, 0);
            int[][] var6 = this.method1291(arg0, (byte) 101, 1);
            int[] var7 = var3[2];
            int[] var8 = var3[1];
            int[] var9 = var5[1];
            int[] var10 = var5[0];
            int[] var11 = var5[2];
            int[] var12 = var6[0];
            int[] var13 = var3[0];
            int[] var14 = var6[1];
            int[] var15 = var6[2];
            for (int var16 = 0; var16 < class26.field672; var16++) {
                int var17 = var4[var16];
                if (var17 == 4096) {
                    var13[var16] = var10[var16];
                    var8[var16] = var9[var16];
                    var7[var16] = var11[var16];
                } else if (var17 == 0) {
                    var13[var16] = var12[var16];
                    var8[var16] = var14[var16];
                    var7[var16] = var15[var16];
                } else {
                    int var18 = 4096 - var17;
                    var13[var16] = var10[var16] * var17 + (var12[var16] * var18) >> 12;
                    var8[var16] = var9[var16] * var17 + var14[var16] * var18 >> 12;
                    var7[var16] = var11[var16] * var17 + var15[var16] * var18 >> 12;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!hh", name = "b", descriptor = "(Z)V", line = 86)
    public static void method1631(boolean arg0) {
        field3854 = null;
        field3848 = null;
        field3846 = null;
        field3851 = null;
        field3853 = null;
        field3849 = null;
        if (!arg0) {
            field3850 = null;
        }
    }

    @OriginalMember(owner = "client!hh", name = "<init>", descriptor = "()V", line = 102)
    public class235() {
        super(3, false);
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(BIIII)V", line = 106)
    public static final void method1632(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 >= class190.field3224 && arg1 <= class289.field4704) {
            int var5 = class114.method842(class87.field1520, (byte) -52, arg2, class177.field2930);
            int var6 = class114.method842(class87.field1520, (byte) -49, arg3, class177.field2930);
            class21.method187(var6, arg1, arg4, var5, (byte) -55);
        }
        field3840++;
        if (arg0 >= -118) {
            method1632((byte) -53, -4, -43, -11, 21);
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(Loe;IB)V", line = 124)
    public final void method126(class146 arg0, int arg1, byte arg2) {
        field3842++;
        if (arg2 != 60) {
            field3849 = (int[]) null;
        }
        if (arg1 == 0) {
            this.field3154 = arg0.method1005((byte) 122) == 1;
        }
    }

    @OriginalMember(owner = "client!hh", name = "b", descriptor = "(II)[I", line = 144)
    public final int[] method125(int arg0, int arg1) {
        field3841++;
        if (arg0 != 2) {
            field3852 = true;
        }
        int[] var3 = this.field3166.method775(arg1, 127);
        if (this.field3166.field1903) {
            int[] var4 = this.method1292(arg1, 0, -103);
            int[] var5 = this.method1292(arg1, 1, -91);
            int[] var6 = this.method1292(arg1, 2, -126);
            for (int var7 = 0; var7 < class26.field672; var7++) {
                int var8 = var6[var7];
                if (var8 == 4096) {
                    var3[var7] = var4[var7];
                } else if (var8 == 0) {
                    var3[var7] = var5[var7];
                } else {
                    var3[var7] = (4096 - var8) * var5[var7] + var4[var7] * var8 >> 12;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!hh", name = "b", descriptor = "(B)V", line = 195)
    public static final void method1633(byte arg0) {
        class35.method262();
        field3845++;
        for (int var1 = 0; var1 < 4; var1++) {
            class23.field576[var1].method1929(arg0 + 33554305);
        }
        if (arg0 != 127) {
            method1634((class157) null, (byte) 115);
        }
        System.gc();
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(Lla;B)V", line = 216)
    public static final void method1634(class157 arg0, byte arg1) {
        class203 var2 = null;
        field3847++;
        try {
            class210 var3 = arg0.method1130("runescape", false);
            while (var3.field3504 == 0) {
                class122.method881(96, 1L);
            }
            if (var3.field3504 == 1) {
                var2 = (class203) var3.field3501;
                class146 var4 = class173.method1233(32583);
                var2.method1386(0, var4.field2496, -1, var4.field2435);
            }
        } catch (Exception var9) {
        }
        try {
            if (var2 != null) {
                var2.method1390(0);
            }
            int var6 = 113 / ((56 - arg1) / 41);
        } catch (Exception var8) {
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(IIIJ)Z", line = 262)
    public static final boolean method1635(int arg0, int arg1, int arg2, long arg3) {
        class312 var5 = class353.field5644[arg0][arg1][arg2];
        if (var5 == null) {
            return false;
        } else if (var5.field5102 != null && var5.field5102.field469 == arg3) {
            return true;
        } else if (var5.field5082 != null && var5.field5082.field5299 == arg3) {
            return true;
        } else if (var5.field5092 != null && var5.field5092.field1652 == arg3) {
            return true;
        } else {
            for (int var6 = 0; var6 < var5.field5078; var6++) {
                if (var5.field5089[var6].field4527 == arg3) {
                    return true;
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!hh", name = "g", descriptor = "(I)I", line = 295)
    public static final int method1636(int arg0) {
        if (arg0 != -25475) {
            field3848 = (String) null;
        }
        field3843++;
        return ((class30.field706 == 0 ? 0 : 1) << 22) + ((class52.field1045 == 0 ? 0 : 1) << 21) + ((class8.field268 == 0 ? 0 : 1) << 20) + ((class277.field4519 ? 1 : 0) << 19) + ((class264.field4330 ? 1 : 0) << 16) + ((class68.field1254 ? 1 : 0) << 15) + ((class281.field4606 ? 1 : 0) << 13) + (class111.field2032 & 0x3 << 11) + ((class252.field4143 ? 1 : 0) << 10) + ((class358.field5697 ? 1 : 0) << 9) + (((class136.field2333 ? 1 : 0) << 6) + (class152.field2601 & 0x7) - (-((class207.field3462 ? 1 : 0) << 3) + -((class166.field2784 ? 1 : 0) << 4) + -((class349.field5590 ? 1 : 0) << 5) - (((class53.field1060 ? 1 : 0) << 7) + ((class359.field5723 ? 1 : 0) << 8)))) - (-(class248.field4071 << 17) + -(class214.method1489() << 23));
    }
}
