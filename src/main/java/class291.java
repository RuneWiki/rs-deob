import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!is")
public class class291 extends class98 {

    @OriginalMember(owner = "client!is", name = "S", descriptor = "I")
    public static int field4072 = 0;

    @OriginalMember(owner = "client!is", name = "X", descriptor = "F")
    public static float field4077;

    @OriginalMember(owner = "client!is", name = "L", descriptor = "I")
    public static int field4065;

    @OriginalMember(owner = "client!is", name = "M", descriptor = "I")
    public static int field4066;

    @OriginalMember(owner = "client!is", name = "O", descriptor = "I")
    public static int field4068;

    @OriginalMember(owner = "client!is", name = "P", descriptor = "I")
    public static int field4069;

    @OriginalMember(owner = "client!is", name = "Q", descriptor = "I")
    public static int field4070;

    @OriginalMember(owner = "client!is", name = "R", descriptor = "I")
    public static int field4071;

    @OriginalMember(owner = "client!is", name = "T", descriptor = "I")
    public static int field4073;

    @OriginalMember(owner = "client!is", name = "U", descriptor = "I")
    public static int field4074;

    @OriginalMember(owner = "client!is", name = "V", descriptor = "I")
    public static int field4075;

    @OriginalMember(owner = "client!is", name = "W", descriptor = "I")
    public static int field4076;

    @OriginalMember(owner = "client!is", name = "Y", descriptor = "Ltq;")
    public static class376 field4078;

    @OriginalMember(owner = "client!is", name = "N", descriptor = "[[I")
    public static int[][] field4067;

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;II)I")
    public static final int method1926(String arg0, String arg1, int arg2, int arg3) {
        ++field4073;
        int var4 = arg0.length();
        int var5 = arg1.length();
        int var6 = 0;
        int var7 = 0;
        char var8 = 0;
        char var9 = 0;
        while (var4 > -var8 + var6 || var7 - var9 < var5) {
            if (var6 - var8 >= var4) {
                return -1;
            }
            if (var5 <= -var9 + var7) {
                return 1;
            }
            char var22;
            if (~var8 != -1) {
                var22 = var8;
                boolean var23 = false;
            } else {
                var22 = arg0.charAt(var6++);
            }
            char var24;
            if (var9 != 0) {
                var24 = var9;
                boolean var25 = false;
            } else {
                var24 = arg1.charAt(var7++);
            }
            var8 = class164.method1122(var22, -126);
            var9 = class164.method1122(var24, -115);
            char var26 = class442.method2759(arg2, var22, -124);
            char var27 = class442.method2759(arg2, var24, -127);
            if (~var26 != ~var27 && Character.toUpperCase(var26) != Character.toUpperCase(var27)) {
                char var28 = Character.toLowerCase(var26);
                char var29 = Character.toLowerCase(var27);
                if (var28 != var29) {
                    return class404.method2575((byte) -111, var28, arg2) - class404.method2575((byte) -111, var29, arg2);
                }
            }
        }
        int var10 = Math.min(var4, var5);
        for (int var11 = 0; var10 > var11; ++var11) {
            int var16;
            int var17;
            if (~arg2 == -3) {
                var16 = var4 - 1 + -var11;
                var17 = -var11 + var5 + -1;
            } else {
                var17 = var11;
                var16 = var11;
            }
            char var18 = arg0.charAt(var16);
            char var19 = arg1.charAt(var17);
            if (~var18 != ~var19 && ~Character.toUpperCase(var18) != ~Character.toUpperCase(var19)) {
                char var20 = Character.toLowerCase(var18);
                char var21 = Character.toLowerCase(var19);
                if (~var20 != ~var21) {
                    return class404.method2575((byte) -111, var20, arg2) + -class404.method2575((byte) -111, var21, arg2);
                }
            }
        }
        int var12 = -var5 + var4;
        if (var12 != 0) {
            return var12;
        } else {
            for (int var13 = 0; var13 < var10; ++var13) {
                char var14 = arg0.charAt(var13);
                char var15 = arg1.charAt(var13);
                if (var14 != var15) {
                    return class404.method2575((byte) -111, var14, arg2) - class404.method2575((byte) -111, var15, arg2);
                }
            }
            if (arg3 != 713330051) {
                method1930((byte) 79, (class376) null, (class134) null);
            }
            return 0;
        }
    }

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(ILdg;I)V")
    public final void method81(int arg0, class236 arg1, int arg2) {
        if (arg0 == arg2) {
            super.field1176 = ~arg1.method1574(-108) == -2;
        }
        ++field4069;
    }

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(ILjava/awt/Component;)Lji;")
    public static final class365 method1927(int arg0, Component arg1) {
        if (arg0 <= 101) {
            field4066 = -44;
        }
        ++field4070;
        return new class345(arg1);
    }

    @OriginalMember(owner = "client!is", name = "e", descriptor = "(I)V")
    public static final void method1928(int arg0) {
        for (int var1 = 0; ~class176.field2399 < ~var1; ++var1) {
            int var3 = class150.field1853[var1];
            class77 var4 = class167.field2335[var3];
            int var5 = class359.field5120.method1574(-101);
            if (~(var5 & 2) != -1) {
                var5 += class359.field5120.method1574(-19) << 8;
            }
            if ((8 & var5) != 0) {
                int var6 = class359.field5120.method1566(-3451);
                if (~var6 == -65536) {
                    var6 = -1;
                }
                int var7 = class359.field5120.method1569(-1);
                boolean var8 = true;
                if (var6 != -1 && ~var4.field5611 != 0) {
                    if (var4.field5611 == var6) {
                        class97 var9 = class434.method2721(var6, 4096);
                        if (var9.field1158 && ~var9.field1166 != 0) {
                            class412 var10 = class189.method1288(-8192, var9.field1166);
                            int var11 = var10.field5910;
                            if (~var11 != -1) {
                                if (var11 != 1) {
                                    if (~var11 == -3) {
                                        var8 = false;
                                        var4.field5642 = 0;
                                    }
                                } else {
                                    var8 = true;
                                }
                            } else {
                                var8 = false;
                            }
                        }
                    } else {
                        class97 var12 = class434.method2721(var6, 4096);
                        class97 var13 = class434.method2721(var4.field5611, 4096);
                        if (~var12.field1166 != 0 && ~var13.field1166 != 0) {
                            class412 var14 = class189.method1288(-8192, var12.field1166);
                            class412 var15 = class189.method1288(-8192, var13.field1166);
                            if (~var15.field5931 < ~var14.field5931) {
                                var8 = false;
                            }
                        }
                    }
                }
                if (var8) {
                    var4.field5605 = var7 >> 16;
                    var4.field5649 = 0;
                    var4.field5593 = 1;
                    var4.field5611 = var6;
                    var4.field5650 = (var7 & 65535) + class189.field2726;
                    var4.field5606 = 0;
                    if (~var4.field5650 < ~class189.field2726) {
                        var4.field5649 = -1;
                    }
                    if (var4.field5611 != -1 && ~class189.field2726 == ~var4.field5650) {
                        int var16 = class434.method2721(var4.field5611, 4096).field1166;
                        if (var16 != -1) {
                            class412 var17 = class189.method1288(-8192, var16);
                            if (var17 != null && var17.field5925 != null) {
                                class148.method896(false, var17, (byte) 104, var4.field3284, 0, var4.field3269);
                            }
                        }
                    }
                }
            }
            if ((var5 & 64) != 0) {
                int var18 = class359.field5120.method1594(-99);
                int var19 = class359.field5120.method1556((byte) 99);
                var4.method2523((byte) 72, var19, class189.field2726, var18);
            }
            if (~(128 & var5) != -1) {
                var4.field5599 = class359.field5120.method1562(false);
                var4.field5633 = 100;
            }
            if (~(256 & var5) != -1) {
                int var20 = class359.field5120.method1574(-26);
                int[] var21 = new int[var20];
                int[] var22 = new int[var20];
                int[] var23 = new int[var20];
                for (int var24 = 0; var20 > var24; ++var24) {
                    int var25 = class359.field5120.method1590(false);
                    if (var25 == 65535) {
                        var25 = -1;
                    }
                    var21[var24] = var25;
                    var22[var24] = class359.field5120.method1574(-61);
                    var23[var24] = class359.field5120.method1585(117);
                }
                class425.method2675(var23, var4, (byte) -34, var21, var22);
            }
            if (~(1024 & var5) != -1) {
                var4.field5614 = class359.field5120.method1590(false);
                var4.field5639 = class359.field5120.method1590(false);
            }
            if (~(4 & var5) != -1) {
                if (var4.field912.method833(112)) {
                    class217.method1453(124, var4);
                }
                var4.method431(class403.method2568(class359.field5120.method1617((byte) 48), (byte) -117), 96);
                var4.method2532(0, var4.field912.field1697);
                var4.field5577 = var4.field912.field1646 << 3;
                if (var4.field912.method833(67)) {
                    class3.method15(var4, class129.field1570, (class88) null, -112, 0, var4.field5664[0], (class40) null, var4.field5677[0]);
                }
            }
            if (~(var5 & 32) != -1) {
                int var26 = class359.field5120.method1594(-121);
                int var27 = class359.field5120.method1575((byte) 112);
                var4.method2523((byte) 72, var27, class189.field2726, var26);
                var4.field5586 = class189.field2726 - -300;
                var4.field5626 = class359.field5120.method1556((byte) 126);
            }
            if (~(1 & var5) != -1) {
                var4.field5574 = class359.field5120.method1566(-3451);
                if (var4.field5574 == 65535) {
                    var4.field5574 = -1;
                }
            }
            if (~(var5 & 16) != -1) {
                int var28 = class359.field5120.method1617((byte) 48);
                if (~var28 == -65536) {
                    var28 = -1;
                }
                int var29 = class359.field5120.method1575((byte) 95);
                class94.method523((byte) -27, var29, var4, var28);
            }
            if ((var5 & 512) != 0) {
                int var30 = class359.field5120.method1617((byte) 48);
                var4.field5627 = class359.field5120.method1567(65280);
                var4.field5652 = class359.field5120.method1575((byte) 106);
                var4.field5600 = var30 & 32767;
                var4.field5575 = (var30 & 32768) != 0;
                var4.field5603 = class189.field2726 + var4.field5600 + var4.field5627;
            }
        }
        ++field4076;
        int var2 = 10 / ((arg0 - 48) / 53);
    }

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(IIIIIIZ)V")
    public static final void method1929(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        class65.field745 = arg2;
        class106.field1268 = arg3;
        ++field4074;
        class440.field6291 = arg0;
        if (arg5 != 100) {
            method1932(-45);
        }
        class289.field4064 = arg1;
        class160.field2105 = arg4;
        if (arg6 && class289.field4064 >= 100) {
            class334.field4730 = class160.field2105 * 128 + 64;
            class265.field3774 = class65.field745 * 128 + 64;
            class276.field3925 = class114.method709(class129.field1570, class334.field4730, arg5 ^ 100, class265.field3774) - class440.field6291;
        }
        class129.field1568 = 2;
    }

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(BLtq;Lae;)V")
    public static final void method1930(byte arg0, class376 arg1, class134 arg2) {
        ++field4075;
        if (!class433.field6233) {
            arg2.method601(0);
            class254.field3668 = arg2.method596(class375.method2394(arg1, class161.field2134), true);
            if (arg0 == -44) {
                class254.field3668.method2446((class330.field4671 - class254.field3668.method762()) / 2, (class105.field1259 + -class254.field3668.method761()) / 2);
                class389.field5503 = arg2.method596(class375.method2394(arg1, class163.field2222), true);
                class389.field5503.method2446((class330.field4671 + -class389.field5503.method762()) / 2, 18);
                class433.field6233 = true;
            }
        }
    }

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(IBILfj;III)V")
    public static final void method1931(int arg0, byte arg1, int arg2, class396 arg3, int arg4, int arg5, int arg6) {
        if (arg1 == 20) {
            client.method1115(arg3.field3284, arg3.field3269, true, arg5, 0, arg4, arg6, arg0, arg2);
            ++field4068;
        }
    }

    @OriginalMember(owner = "client!is", name = "f", descriptor = "(I)V")
    public static void method1932(int arg0) {
        field4078 = null;
        if (arg0 != 4096) {
            field4072 = 84;
        }
        field4067 = null;
    }

    @OriginalMember(owner = "client!is", name = "<init>", descriptor = "()V")
    public class291() {
        super(1, false);
    }

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(II)[I")
    public final int[] method83(int arg0, int arg1) {
        ++field4065;
        int[] var3 = super.field1177.method820(arg1, true);
        if (super.field1177.field1610) {
            int[] var4 = this.method539(0, (byte) -80, arg1);
            for (int var5 = 0; var5 < class268.field3811; ++var5) {
                var3[var5] = 4096 - var4[var5];
            }
        }
        return arg0 != 0 ? null : var3;
    }

    @OriginalMember(owner = "client!is", name = "b", descriptor = "(II)[[I")
    public final int[][] method194(int arg0, int arg1) {
        ++field4071;
        int var3 = 106 / ((arg1 - 60) / 43);
        int[][] var4 = super.field1184.method185((byte) -48, arg0);
        if (super.field1184.field332) {
            int[][] var5 = this.method546(arg0, (byte) 33, 0);
            int[] var6 = var5[0];
            int[] var7 = var5[1];
            int[] var8 = var5[2];
            int[] var9 = var4[0];
            int[] var10 = var4[1];
            int[] var11 = var4[2];
            for (int var12 = 0; class268.field3811 > var12; ++var12) {
                var9[var12] = -var6[var12] + 4096;
                var10[var12] = 4096 - var7[var12];
                var11[var12] = -var8[var12] + 4096;
            }
        }
        return var4;
    }

    static {
        new class362("You cannot send a quick chat message to a player on this world at this time.", "Einem Spieler auf dieser Welt können derzeit keine Direktchat-Nachrichten", "Impossible d'envoyer un message rapide à un joueur de ce serveur à l'heure actuelle.", "Você não pode enviar uma mensagem de papo rápido para um jogador neste mundo neste momento.");
    }
}
