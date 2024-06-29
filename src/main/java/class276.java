import java.awt.Component;
import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nh")
public class class276 {

    @OriginalMember(owner = "client!nh", name = "s", descriptor = "Ltf;")
    private class106 field4809 = null;

    @OriginalMember(owner = "client!nh", name = "q", descriptor = "I")
    private int field4807 = 65000;

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "Ltf;")
    private class106 field4791 = null;

    @OriginalMember(owner = "client!nh", name = "c", descriptor = "I")
    private int field4793;

    @OriginalMember(owner = "client!nh", name = "d", descriptor = "Lmb;")
    public static class96 field4794 = class243.method1708("Ihre Ignorieren)2Liste ist voll)1 Sie k-Onnen nur 100 Spieler darauf eintragen)3", (byte) 120);

    @OriginalMember(owner = "client!nh", name = "i", descriptor = "I")
    public static int field4799 = 0;

    @OriginalMember(owner = "client!nh", name = "m", descriptor = "Lmb;")
    public static class96 field4803 = class243.method1708("loginscreen", (byte) 98);

    @OriginalMember(owner = "client!nh", name = "f", descriptor = "I")
    public static int field4796 = 0;

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "I")
    public static int field4792;

    @OriginalMember(owner = "client!nh", name = "g", descriptor = "I")
    public static int field4797;

    @OriginalMember(owner = "client!nh", name = "h", descriptor = "I")
    public static int field4798;

    @OriginalMember(owner = "client!nh", name = "j", descriptor = "I")
    public static int field4800;

    @OriginalMember(owner = "client!nh", name = "k", descriptor = "I")
    public static int field4801;

    @OriginalMember(owner = "client!nh", name = "l", descriptor = "I")
    public static int field4802;

    @OriginalMember(owner = "client!nh", name = "n", descriptor = "I")
    public static int field4804;

    @OriginalMember(owner = "client!nh", name = "o", descriptor = "I")
    public static int field4805;

    @OriginalMember(owner = "client!nh", name = "p", descriptor = "I")
    public static int field4806;

    @OriginalMember(owner = "client!nh", name = "r", descriptor = "I")
    public static int field4808;

    @OriginalMember(owner = "client!nh", name = "t", descriptor = "I")
    public static int field4810;

    @OriginalMember(owner = "client!nh", name = "u", descriptor = "I")
    public static int field4811;

    @OriginalMember(owner = "client!nh", name = "e", descriptor = "[I")
    public static int[] field4795;

    @OriginalMember(owner = "client!nh", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field4792++;
        return "Cache:" + this.field4793;
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(ZBI[BI)Z")
    private final boolean method1864(boolean arg0, byte arg1, int arg2, byte[] arg3, int arg4) {
        field4810++;
        class106 var6 = this.field4791;
        synchronized (this.field4791) {
            try {
                int var8;
                if (arg0) {
                    if (this.field4809.method792(100) < (long) (arg2 * 6 + 6)) {
                        return false;
                    }
                    this.field4809.method784(-1658, (long) (arg2 * 6));
                    this.field4809.method783(6, client.field1999, false, 0);
                    var8 = (client.field1999[5] & 0xFF) + ((client.field1999[3] & 0xFF) << 16) + (client.field1999[4] & 0xFF << 8);
                    if (var8 <= 0 || ((long) var8) > (this.field4791.method792(100) / 520L)) {
                        return false;
                    }
                } else {
                    var8 = (int) ((this.field4791.method792(100) + 519L) / 520L);
                    if (var8 == 0) {
                        var8 = 1;
                    }
                }
                client.field1999[1] = (byte) (arg4 >> 8);
                if (arg1 <= 62) {
                    return true;
                }
                client.field1999[0] = (byte) (arg4 >> 16);
                client.field1999[2] = (byte) arg4;
                client.field1999[3] = (byte) (var8 >> 16);
                client.field1999[5] = (byte) var8;
                client.field1999[4] = (byte) (var8 >> 8);
                this.field4809.method784(-1658, (long) (arg2 * 6));
                int var11 = 0;
                this.field4809.method785(0, (byte) 71, client.field1999, 6);
                int var12 = 0;
                while (var11 < arg4) {
                    int var13 = 0;
                    if (arg0) {
                        label110: {
                            this.field4791.method784(-1658, (long) (var8 * 520));
                            try {
                                this.field4791.method783(8, client.field1999, false, 0);
                            } catch (EOFException var36) {
                                return true;
                            }
                            var13 = ((client.field1999[4] & 0xFF) << 16) + (client.field1999[5] & 0xFF << 8) + (client.field1999[6] & 0xFF);
                            int var14 = (client.field1999[2] & 0xFF << 8) + (client.field1999[3] & 0xFF);
                            int var15 = (client.field1999[0] & 0xFF << 8) + (client.field1999[1] & 0xFF);
                            int var16 = client.field1999[7] & 0xFF;
                            if (arg2 == var15 && var12 == var14 && this.field4793 == var16) {
                                if (var13 >= 0 && (long) var13 <= this.field4791.method792(100) / 520L) {
                                    break label110;
                                }
                                return false;
                            }
                            return false;
                        }
                    }
                    if (var13 == 0) {
                        arg0 = false;
                        var13 = (int) ((this.field4791.method792(100) + 519L) / 520L);
                        if (var13 == 0) {
                            var13++;
                        }
                        if (var8 == var13) {
                            var13++;
                        }
                    }
                    int var19 = arg4 - var11;
                    client.field1999[1] = (byte) arg2;
                    if (arg4 - var11 <= 512) {
                        var13 = 0;
                    }
                    client.field1999[0] = (byte) (arg2 >> 8);
                    client.field1999[5] = (byte) (var13 >> 8);
                    client.field1999[6] = (byte) var13;
                    if (var19 > 512) {
                        var19 = 512;
                    }
                    client.field1999[4] = (byte) (var13 >> 16);
                    client.field1999[7] = (byte) this.field4793;
                    client.field1999[3] = (byte) var12;
                    client.field1999[2] = (byte) (var12 >> 8);
                    var12++;
                    this.field4791.method784(-1658, (long) (var8 * 520));
                    var8 = var13;
                    this.field4791.method785(0, (byte) 71, client.field1999, 8);
                    this.field4791.method785(var11, (byte) 71, arg3, var19);
                    var11 += var19;
                }
                return true;
            } catch (IOException var37) {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(IIIIII)Z")
    public static final boolean method1865(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 != arg2 || arg3 != arg4) {
            for (int var8 = arg1; var8 <= arg2; var8++) {
                for (int var14 = arg3; var14 <= arg4; var14++) {
                    if (class247.field4278[arg0][var8][var14] == -client.field1990) {
                        return false;
                    }
                }
            }
            int var9 = (arg1 << 7) + 1;
            int var10 = (arg3 << 7) + 2;
            int var11 = class173.field3022[arg0][arg1][arg3] + arg5;
            if (!class272.method1851(var9, var11, var10)) {
                return false;
            }
            int var12 = (arg2 << 7) - 1;
            if (!class272.method1851(var12, var11, var10)) {
                return false;
            }
            int var13 = (arg4 << 7) - 1;
            if (!class272.method1851(var9, var11, var13)) {
                return false;
            } else if (class272.method1851(var12, var11, var13)) {
                return true;
            } else {
                return false;
            }
        } else if (class153.method1123(arg0, arg1, arg3)) {
            int var6 = arg1 << 7;
            int var7 = arg3 << 7;
            return class272.method1851(var6 + 1, class173.field3022[arg0][arg1][arg3] + arg5, var7 + 1) && class272.method1851(var6 + 128 - 1, class173.field3022[arg0][arg1 + 1][arg3] + arg5, var7 + 1) && class272.method1851(var6 + 128 - 1, class173.field3022[arg0][arg1 + 1][arg3 + 1] + arg5, var7 + 128 - 1) && class272.method1851(var6 + 1, class173.field3022[arg0][arg1][arg3 + 1] + arg5, var7 + 128 - 1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(Z)V")
    public static final void method1866(boolean arg0) {
        field4797++;
        class15.field237.method83(0);
        class51.field883.method83(0);
        class224.field3808.method83(0);
        if (!arg0) {
            class258.field4470.method83(0);
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "([BIBI)Z")
    public final boolean method1867(byte[] arg0, int arg1, byte arg2, int arg3) {
        field4801++;
        class106 var5 = this.field4791;
        synchronized (this.field4791) {
            if (arg3 < 0 || arg3 > this.field4807) {
                throw new IllegalArgumentException();
            }
            if (arg2 != -74) {
                field4799 = -30;
            }
            boolean var6 = this.method1864(true, (byte) 76, arg1, arg0, arg3);
            if (!var6) {
                var6 = this.method1864(false, (byte) 89, arg1, arg0, arg3);
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(IB)[B")
    public final byte[] method1868(int arg0, byte arg1) {
        field4804++;
        class106 var3 = this.field4791;
        synchronized (this.field4791) {
            try {
                if (((long) (arg0 * 6 + 6)) > this.field4809.method792(100)) {
                    return null;
                }
                this.field4809.method784(-1658, (long) (arg0 * 6));
                this.field4809.method783(6, client.field1999, false, 0);
                int var5 = (client.field1999[1] & 0xFF << 8) + (client.field1999[0] & 0xFF << 16) + (client.field1999[2] & 0xFF);
                int var6 = (client.field1999[5] & 0xFF) + ((client.field1999[3] & 0xFF << 16) + (client.field1999[4] & 0xFF << 8));
                if (var5 < 0 || var5 > this.field4807) {
                    return null;
                } else if (var6 > 0 && (long) var6 <= this.field4791.method792(100) / 520L) {
                    byte[] var9 = new byte[var5];
                    int var10 = 0;
                    int var11 = 0;
                    if (arg1 >= -85) {
                        return null;
                    }
                    while (var10 < var5) {
                        if (var6 == 0) {
                            return null;
                        }
                        this.field4791.method784(-1658, (long) (var6 * 520));
                        int var14 = var5 - var10;
                        if (var14 > 512) {
                            var14 = 512;
                        }
                        this.field4791.method783(var14 + 8, client.field1999, false, 0);
                        int var15 = (client.field1999[6] & 0xFF) + ((client.field1999[4] & 0xFF) << 16) + (client.field1999[5] & 0xFF << 8);
                        int var16 = (client.field1999[0] & 0xFF << 8) + (client.field1999[1] & 0xFF);
                        int var17 = client.field1999[7] & 0xFF;
                        int var18 = (client.field1999[2] & 0xFF << 8) + (client.field1999[3] & 0xFF);
                        if (arg0 == var16 && var11 == var18 && this.field4793 == var17) {
                            if (var15 >= 0 && this.field4791.method792(100) / 520L >= (long) var15) {
                                for (int var21 = 0; var21 < var14; var21++) {
                                    var9[var10++] = client.field1999[var21 + 8];
                                }
                                var6 = var15;
                                var11++;
                                continue;
                            }
                            return null;
                        }
                        return null;
                    }
                    return var9;
                } else {
                    return null;
                }
            } catch (IOException var42) {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(ZLhg;)V")
    public static final void method1869(boolean arg0, class260 arg1) {
        arg1.field4571 = arg0;
        field4805++;
        if (arg1.field4573 != -1) {
            class67 var2 = class189.method1332(arg1.field4573, 2);
            if (var2 == null || var2.field1140 == null) {
                arg1.field4573 = -1;
            } else {
                arg1.field4512++;
                if (var2.field1140.length > arg1.field4536 && var2.field1143[arg1.field4536] < arg1.field4512) {
                    arg1.field4512 = 1;
                    arg1.field4536++;
                    class71.method481(arg1.field4533, !arg0, var2, arg1.field4511, arg1.field4536, class236.field4047 == arg1);
                }
                if (arg1.field4536 >= var2.field1140.length) {
                    arg1.field4512 = 0;
                    arg1.field4536 = 0;
                    class71.method481(arg1.field4533, true, var2, arg1.field4511, arg1.field4536, class236.field4047 == arg1);
                }
            }
        }
        if (arg1.field4543 != -1 && arg1.field4518 <= class236.field4053) {
            int var3 = class146.method1082(arg1.field4543, (byte) 80).field3175;
            if (var3 == -1) {
                arg1.field4543 = -1;
            } else {
                class67 var4 = class189.method1332(var3, 2);
                if (var4 == null || var4.field1140 == null) {
                    arg1.field4543 = -1;
                } else {
                    if (arg1.field4548 < 0) {
                        arg1.field4548 = 0;
                        class71.method481(arg1.field4533, !arg0, var4, arg1.field4511, 0, class236.field4047 == arg1);
                    }
                    arg1.field4553++;
                    if (arg1.field4548 < var4.field1140.length && var4.field1143[arg1.field4548] < arg1.field4553) {
                        arg1.field4553 = 1;
                        arg1.field4548++;
                        class71.method481(arg1.field4533, true, var4, arg1.field4511, arg1.field4548, class236.field4047 == arg1);
                    }
                    if (var4.field1140.length <= arg1.field4548) {
                        arg1.field4543 = -1;
                    }
                }
            }
        }
        if (arg1.field4526 != -1 && arg1.field4529 <= 1) {
            class67 var5 = class189.method1332(arg1.field4526, 2);
            if (var5.field1156 == 1 && arg1.field4558 > 0 && class236.field4053 >= arg1.field4506 && class236.field4053 > arg1.field4559) {
                arg1.field4529 = 1;
                return;
            }
        }
        if (arg1.field4526 != -1 && arg1.field4529 == 0) {
            class67 var6 = class189.method1332(arg1.field4526, 2);
            if (var6 == null || var6.field1140 == null) {
                arg1.field4526 = -1;
            } else {
                arg1.field4514++;
                if (var6.field1140.length > arg1.field4576 && var6.field1143[arg1.field4576] < arg1.field4514) {
                    arg1.field4576++;
                    arg1.field4514 = 1;
                    class71.method481(arg1.field4533, true, var6, arg1.field4511, arg1.field4576, class236.field4047 == arg1);
                }
                if (var6.field1140.length <= arg1.field4576) {
                    arg1.field4576 -= var6.field1149;
                    arg1.field4580++;
                    if (var6.field1142 <= arg1.field4580) {
                        arg1.field4526 = -1;
                    } else if (arg1.field4576 >= 0 && arg1.field4576 < var6.field1140.length) {
                        class71.method481(arg1.field4533, true, var6, arg1.field4511, arg1.field4576, class236.field4047 == arg1);
                    } else {
                        arg1.field4526 = -1;
                    }
                }
                arg1.field4571 = var6.field1150;
            }
        }
        if (arg1.field4529 > 0) {
            arg1.field4529--;
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(Ljava/awt/Component;I)V")
    public static final void method1870(Component arg0, int arg1) {
        arg0.removeMouseListener(class194.field3345);
        arg0.removeMouseMotionListener(class194.field3345);
        arg0.removeFocusListener(class194.field3345);
        if (arg1 != -1) {
            field4802 = -113;
        }
        class159.field2819 = 0;
        field4800++;
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(I)V")
    public static void method1871(int arg0) {
        field4795 = null;
        field4794 = null;
        if (arg0 < 79) {
            field4794 = null;
        }
        field4803 = null;
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(III)V")
    public static final void method1872(int arg0, int arg1, int arg2) {
        field4798++;
        int var3 = arg1;
        if (arg0 >= -19) {
            method1874(false, (class96) null);
        }
        arg1--;
        if (var3 > 25) {
            var3 = 25;
        }
        int var4 = class19.field318[arg1];
        int var5 = class222.field3799[arg1];
        if (arg2 == 0) {
            class140.field2505.method1012((byte) -119, 36);
            class157.field2740++;
            class140.field2505.method1652(var3 + var3 + 3, (byte) 41);
        }
        if (arg2 == 1) {
            class208.field3603++;
            class140.field2505.method1012((byte) -127, 211);
            class140.field2505.method1652(var3 + var3 + 3 + 14, (byte) 41);
        }
        if (arg2 == 2) {
            class21.field353++;
            class140.field2505.method1012((byte) 115, 5);
            class140.field2505.method1652(var3 + var3 + 3, (byte) 41);
        }
        class140.field2505.method1632(true, var4 + class196.field3383);
        class140.field2505.method1655((byte) 122, class233.field3990[82] ? 1 : 0);
        class227.field3863 = class222.field3799[0];
        class217.field3727 = class19.field318[0];
        for (int var6 = 1; var6 < var3; var6++) {
            arg1--;
            class140.field2505.method1654(0, class19.field318[arg1] - var4);
            class140.field2505.method1655((byte) 29, class222.field3799[arg1] - var5);
        }
        class140.field2505.method1639(-88, var5 + class225.field3832);
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(IIIIIIB)V")
    public static final void method1873(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6) {
        class38.field643 = 0;
        field4811++;
        for (int var7 = -1; var7 < class145.field2577 + class132.field2375; var7++) {
            class260 var23;
            if (var7 == -1) {
                var23 = class236.field4047;
            } else if (class145.field2577 <= var7) {
                var23 = class86.field1450[class222.field3797[var7 - class145.field2577]];
            } else {
                var23 = class22.field371[class103.field1734[var7]];
            }
            if (var23 != null && var23.method362(false)) {
                if (var23 instanceof class197) {
                    class229 var24 = ((class197) var23).field3436;
                    if (var24.field3926 != null) {
                        var24 = var24.method1560((byte) -74);
                    }
                    if (var24 == null) {
                        continue;
                    }
                }
                if (var7 >= class145.field2577) {
                    class229 var25 = ((class197) var23).field3436;
                    if (var25.field3926 != null) {
                        var25 = var25.method1560((byte) -74);
                    }
                    if (var25.field3941 >= 0 && class10.field178.length > var25.field3941) {
                        int var26;
                        if (var25.field3913 == -1) {
                            var26 = var23.method1796(-89) + 15;
                        } else {
                            var26 = var25.field3913 + 15;
                        }
                        class9.method74(arg0, arg2 >> 1, arg1, var23, var26, (byte) -114, arg5 >> 1);
                        if (class179.field3093 > -1) {
                            class10.field178[var25.field3941].method1057(class179.field3093 + arg3 - 12, class220.field3756 + -30 + arg4);
                        }
                    }
                    class64[] var27 = class46.field790;
                    for (int var28 = 0; var28 < var27.length; var28++) {
                        class64 var29 = var27[var28];
                        if (var29 != null && var29.field1101 == 1 && class222.field3797[var7 - class145.field2577] == var29.field1098 && class236.field4053 % 20 < 10) {
                            int var30;
                            if (var25.field3913 == -1) {
                                var30 = var23.method1796(-71) + 15;
                            } else {
                                var30 = var25.field3913 + 15;
                            }
                            class9.method74(arg0, arg2 >> 1, arg1, var23, var30, (byte) -119, arg5 >> 1);
                            if (class179.field3093 > -1) {
                                class181.field3140[var29.field1091].method1057(arg3 + class179.field3093 - 12, class220.field3756 + -28 + arg4);
                            }
                        }
                    }
                } else {
                    int var31 = 30;
                    class47 var32 = (class47) var23;
                    if (var32.field816 != -1 || var32.field810 != -1) {
                        class9.method74(arg0, arg2 >> 1, arg1, var23, var23.method1796(-58) + 15, (byte) -91, arg5 >> 1);
                        if (class179.field3093 > -1) {
                            if (var32.field816 != -1) {
                                class40.field691[var32.field816].method1057(class179.field3093 + arg3 - 12, class220.field3756 + arg4 + -var31);
                                var31 += 25;
                            }
                            if (var32.field810 != -1) {
                                class10.field178[var32.field810].method1057(class179.field3093 + arg3 - 12, class220.field3756 + arg4 - var31);
                                var31 += 25;
                            }
                        }
                    }
                    if (var7 >= 0) {
                        class64[] var33 = class46.field790;
                        for (int var34 = 0; var34 < var33.length; var34++) {
                            class64 var35 = var33[var34];
                            if (var35 != null && var35.field1101 == 10 && class103.field1734[var7] == var35.field1098) {
                                class9.method74(arg0, arg2 >> 1, arg1, var23, var23.method1796(-97) + 15, (byte) -70, arg5 >> 1);
                                if (class179.field3093 > -1) {
                                    class181.field3140[var35.field1091].method1057(class179.field3093 + arg3 - 12, -var31 + arg4 + class220.field3756);
                                }
                            }
                        }
                    }
                }
                if (var23.field4509 != null && (class145.field2577 <= var7 || class106.field1774 == 0 || class106.field1774 == 3 || class106.field1774 == 1 && class25.method170(0, ((class47) var23).field828))) {
                    class9.method74(arg0, arg2 >> 1, arg1, var23, var23.method1796(-84), (byte) -95, arg5 >> 1);
                    if (class179.field3093 > -1 && class272.field4741 > class38.field643) {
                        class272.field4729[class38.field643] = class71.field1216.method125(var23.field4509) / 2;
                        class272.field4720[class38.field643] = class71.field1216.field284;
                        class272.field4727[class38.field643] = class179.field3093;
                        class272.field4730[class38.field643] = class220.field3756;
                        class272.field4724[class38.field643] = var23.field4568;
                        class272.field4742[class38.field643] = var23.field4504;
                        class272.field4738[class38.field643] = var23.field4556;
                        class272.field4723[class38.field643] = var23.field4509;
                        class38.field643++;
                    }
                }
                if (var23.field4560 > class236.field4053) {
                    class246 var36 = class242.field4206[0];
                    class246 var37 = class242.field4206[1];
                    int var38;
                    if ((var23 instanceof class197)) {
                        class197 var39 = (class197) var23;
                        class246[] var40 = (class246[]) class265.field4633.method84(-14, (long) var39.field3436.field3901);
                        if (var40 == null) {
                            var40 = class73.method530(var39.field3436.field3901, 0, -112, class103.field1735);
                            if (var40 != null) {
                                class265.field4633.method88(var40, 16518, (long) var39.field3436.field3901);
                            }
                        }
                        if (var40 != null && var40.length == 2) {
                            var37 = var40[1];
                            var36 = var40[0];
                        }
                        class229 var41 = var39.field3436;
                        if (var41.field3913 == -1) {
                            var38 = var23.method1796(-95);
                        } else {
                            var38 = var41.field3913;
                        }
                    } else {
                        var38 = var23.method1796(-55);
                    }
                    class9.method74(arg0, arg2 >> 1, arg1, var23, var36.field4271 + var38 + 10, (byte) -107, arg5 >> 1);
                    if (class179.field3093 > -1) {
                        int var42 = arg3 + class179.field3093 - (var36.field4266 >> 1);
                        int var43 = arg4 + class220.field3756 - 3;
                        var36.method1057(var42, var43);
                        int var44 = var23.field4565 * var36.field4266 / 255;
                        int var45 = var36.field4271;
                        class84.method603(var42, var43, var42 + var44, var43 + var45);
                        var37.method1057(var42, var43);
                        class84.method593(arg3, arg4, arg3 + arg5, arg4 - -arg2);
                    }
                }
                for (int var46 = 0; var46 < 4; var46++) {
                    if (var23.field4550[var46] > class236.field4053) {
                        int var49;
                        if (var23 instanceof class197) {
                            class197 var47 = (class197) var23;
                            class229 var48 = var47.field3436;
                            if (var48.field3913 == -1) {
                                var49 = var23.method1796(-116) / 2;
                            } else {
                                var49 = var48.field3913 / 2;
                            }
                        } else {
                            var49 = var23.method1796(-108) / 2;
                        }
                        class9.method74(arg0, arg2 >> 1, arg1, var23, var49, (byte) -115, arg5 >> 1);
                        if (class179.field3093 > -1) {
                            if (var46 == 1) {
                                class220.field3756 -= 20;
                            }
                            if (var46 == 2) {
                                class220.field3756 -= 10;
                                class179.field3093 -= 15;
                            }
                            if (var46 == 3) {
                                class220.field3756 -= 10;
                                class179.field3093 += 15;
                            }
                            class221.field3787[var23.field4577[var46]].method1057(class179.field3093 + arg3 - 12, class220.field3756 + -12 + arg4);
                            class149.field2628.method117(class31.method205(var23.field4562[var46], (byte) -78), arg3 + class179.field3093 - 1, arg4 + 3 - -class220.field3756, 16777215, 0);
                        }
                    }
                }
            }
        }
        if (arg6 < 105) {
            method1865(-122, -60, 6, 56, -97, 3);
        }
        for (int var8 = 0; var8 < class38.field643; var8++) {
            int var9 = class272.field4727[var8];
            int var10 = class272.field4730[var8];
            int var11 = class272.field4729[var8];
            int var12 = class272.field4720[var8];
            boolean var13 = true;
            while (var13) {
                var13 = false;
                for (int var22 = 0; var22 < var8; var22++) {
                    if (class272.field4730[var22] - class272.field4720[var22] < var10 - -2 && (var10 - var12) < (class272.field4730[var22] + 2) && class272.field4729[var22] + class272.field4727[var22] > -var11 + var9 && class272.field4727[var22] - class272.field4729[var22] < var9 + var11 && (class272.field4730[var22] - class272.field4720[var22]) < var10) {
                        var13 = true;
                        var10 = class272.field4730[var22] - class272.field4720[var22];
                    }
                }
            }
            class179.field3093 = class272.field4727[var8];
            class220.field3756 = class272.field4730[var8] = var10;
            class96 var14 = class272.field4723[var8];
            if (class44.field746 == 0) {
                int var15 = 16776960;
                if (class272.field4724[var8] < 6) {
                    var15 = class258.field4476[class272.field4724[var8]];
                }
                if (class272.field4724[var8] == 6) {
                    var15 = class51.field899 % 20 < 10 ? 16711680 : 16776960;
                }
                if (class272.field4724[var8] == 7) {
                    var15 = class51.field899 % 20 < 10 ? 255 : 65535;
                }
                if (class272.field4724[var8] == 8) {
                    var15 = (class51.field899 % 20) < 10 ? 45056 : 8454016;
                }
                if (class272.field4724[var8] == 9) {
                    int var16 = 150 - class272.field4738[var8];
                    if (var16 < 50) {
                        var15 = var16 * 1280 + 16711680;
                    } else if (var16 < 100) {
                        var15 = 33160960 - (var16 * 327680);
                    } else if (var16 < 150) {
                        var15 = (var16 - 100) * 5 + 65280;
                    }
                }
                if (class272.field4724[var8] == 10) {
                    int var17 = 150 - class272.field4738[var8];
                    if (var17 < 50) {
                        var15 = var17 * 5 + 16711680;
                    } else if (var17 < 100) {
                        var15 = 16384000 + 16711935 - (var17 * 327680);
                    } else if (var17 < 150) {
                        var15 = 255 + 500 - (var17 * 5) - (-(var17 * 327680) - -32768000);
                    }
                }
                if (class272.field4724[var8] == 11) {
                    int var18 = 150 - class272.field4738[var8];
                    if (var18 < 50) {
                        var15 = 16777215 - (var18 * 327685);
                    } else if (var18 < 100) {
                        var15 = var18 * 327685 - 16318970;
                    } else if (var18 < 150) {
                        var15 = 16777215 - (var18 - 100) * 327680;
                    }
                }
                if (class272.field4742[var8] == 0) {
                    class71.field1216.method117(var14, class179.field3093 + arg3, class220.field3756 + arg4, var15, 0);
                }
                if (class272.field4742[var8] == 1) {
                    class71.field1216.method138(var14, arg3 + class179.field3093, class220.field3756 + arg4, var15, 0, class51.field899);
                }
                if (class272.field4742[var8] == 2) {
                    class71.field1216.method140(var14, class179.field3093 + arg3, class220.field3756 + arg4, var15, 0, class51.field899);
                }
                if (class272.field4742[var8] == 3) {
                    class71.field1216.method120(var14, arg3 + class179.field3093, arg4 - -class220.field3756, var15, 0, class51.field899, 150 - class272.field4738[var8]);
                }
                if (class272.field4742[var8] == 4) {
                    int var19 = (150 - class272.field4738[var8]) * (class71.field1216.method125(var14) + 100) / 150;
                    class84.method603(class179.field3093 + arg3 - 50, arg4, class179.field3093 + arg3 + 50, arg4 - -arg2);
                    class71.field1216.method128(var14, arg3 + class179.field3093 + 50 - var19, class220.field3756 + arg4, var15, 0);
                    class84.method593(arg3, arg4, arg3 + arg5, arg4 - -arg2);
                }
                if (class272.field4742[var8] == 5) {
                    int var20 = 150 - class272.field4738[var8];
                    int var21 = 0;
                    class84.method603(arg3, arg4 - (class71.field1216.field284 + 1 - class220.field3756), arg3 - -arg5, class220.field3756 + arg4 + 5);
                    if (var20 < 25) {
                        var21 = var20 - 25;
                    } else if (var20 > 125) {
                        var21 = var20 - 125;
                    }
                    class71.field1216.method117(var14, class179.field3093 + arg3, class220.field3756 + arg4 + var21, var15, 0);
                    class84.method593(arg3, arg4, arg3 + arg5, arg2 + arg4);
                }
            } else {
                class71.field1216.method117(var14, class179.field3093 + arg3, class220.field3756 + arg4, 16776960, 0);
            }
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(ZLmb;)V")
    public static final void method1874(boolean arg0, class96 arg1) {
        field4808++;
        if (class244.field4237 == null) {
            return;
        }
        int var2 = 0;
        if (!arg0) {
            field4796 = -62;
        }
        long var3 = arg1.method685((byte) 127);
        if (var3 == 0L) {
            return;
        }
        while (class244.field4237.length > var2 && class244.field4237[var2].field4304 != var3) {
            var2++;
        }
        if (class244.field4237.length > var2 && class244.field4237[var2] != null) {
            class31.field486++;
            class140.field2505.method1012((byte) -124, 51);
            class140.field2505.method1668(class244.field4237[var2].field4304, -107);
        }
    }

    @OriginalMember(owner = "client!nh", name = "<init>", descriptor = "(ILtf;Ltf;I)V")
    public class276(int arg0, class106 arg1, class106 arg2, int arg3) {
        this.field4807 = arg3;
        this.field4809 = arg2;
        this.field4793 = arg0;
        this.field4791 = arg1;
    }
}
