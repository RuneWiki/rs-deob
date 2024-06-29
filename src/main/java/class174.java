import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sj")
public class class174 extends class154 {

    @OriginalMember(owner = "client!sj", name = "Y", descriptor = "I")
    private int field2908 = 0;

    @OriginalMember(owner = "client!sj", name = "db", descriptor = "I")
    private int field2913 = 0;

    @OriginalMember(owner = "client!sj", name = "jb", descriptor = "I")
    private int field2919 = 1;

    @OriginalMember(owner = "client!sj", name = "eb", descriptor = "Leg;")
    public static class37 field2914 = method1167("Chargement du module texte )2 ", 79);

    @OriginalMember(owner = "client!sj", name = "cb", descriptor = "[[[I")
    public static int[][][] field2912 = new int[2][][];

    @OriginalMember(owner = "client!sj", name = "bb", descriptor = "[Leg;")
    public static class37[] field2911 = new class37[200];

    @OriginalMember(owner = "client!sj", name = "nb", descriptor = "I")
    public static int field2923 = -1;

    @OriginalMember(owner = "client!sj", name = "ob", descriptor = "Z")
    public static boolean field2924 = false;

    @OriginalMember(owner = "client!sj", name = "X", descriptor = "I")
    public static int field2907;

    @OriginalMember(owner = "client!sj", name = "Z", descriptor = "I")
    public static int field2909;

    @OriginalMember(owner = "client!sj", name = "fb", descriptor = "I")
    public static int field2915;

    @OriginalMember(owner = "client!sj", name = "gb", descriptor = "I")
    public static int field2916;

    @OriginalMember(owner = "client!sj", name = "hb", descriptor = "I")
    public static int field2917;

    @OriginalMember(owner = "client!sj", name = "ib", descriptor = "I")
    public static int field2918;

    @OriginalMember(owner = "client!sj", name = "kb", descriptor = "I")
    public static int field2920;

    @OriginalMember(owner = "client!sj", name = "lb", descriptor = "I")
    public static int field2921;

    @OriginalMember(owner = "client!sj", name = "mb", descriptor = "I")
    public static int field2922;

    @OriginalMember(owner = "client!sj", name = "ab", descriptor = "[[[B")
    public static byte[][][] field2910;

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(Lva;II)V")
    public final void method142(class187 arg0, int arg1, int arg2) {
        ++field2922;
        if (arg1 != -14015) {
            method1164((class101) null, -59);
        }
        if (arg2 != 0) {
            if (~arg2 != -2) {
                if (arg2 == 3) {
                    this.field2919 = arg0.method1268(255);
                }
            } else {
                this.field2913 = arg0.method1268(255);
            }
        } else {
            this.field2908 = arg0.method1268(255);
        }
    }

    @OriginalMember(owner = "client!sj", name = "d", descriptor = "(B)V")
    public static void method1163(byte arg0) {
        field2914 = null;
        if (arg0 > 31) {
            field2911 = null;
            field2912 = null;
            field2910 = null;
        }
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(Ljl;I)V")
    public static final void method1164(class101 arg0, int arg1) {
        if (arg1 != 207094343) {
            method1166(-31);
        }
        class290.field5109 = arg0;
        ++field2907;
    }

    @OriginalMember(owner = "client!sj", name = "e", descriptor = "(I)V")
    public final void method144(int arg0) {
        class77.method527((byte) 127);
        ++field2921;
        if (arg0 != -9) {
            this.method143(0, 117);
        }
    }

    @OriginalMember(owner = "client!sj", name = "c", descriptor = "(BI)Lub;")
    public static final class10 method1165(byte arg0, int arg1) {
        class10 var2 = (class10) class8.field133.method344((byte) 14, (long) arg1);
        ++field2920;
        if (arg0 != 18) {
            method1164((class101) null, 107);
        }
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class210.field3619.method666(class236.method1618(arg0 ^ 18, arg1), class173.method1159(arg1, (byte) -123), (byte) -51);
            class10 var4 = new class10();
            if (var3 != null) {
                var4.method66(new class187(var3), -86);
            }
            class8.field133.method341((byte) 16, var4, (long) arg1);
            return var4;
        }
    }

    @OriginalMember(owner = "client!sj", name = "f", descriptor = "(I)V")
    public static final void method1166(int arg0) {
        ++field2915;
        if (~class232.method1597(84) == -3) {
            byte var1 = (byte) (255 & class8.field137 + -4);
            int var2 = class8.field137 % 104;
            for (int var3 = 0; var3 < 4; ++var3) {
                for (int var16 = 0; var16 < 104; ++var16) {
                    class62.field1014[var3][var2][var16] = var1;
                }
            }
            if (~class237.field4140 != -4) {
                for (int var4 = 0; var4 < 2; ++var4) {
                    class169.field2821[var4] = -1000000;
                    class268.field4694[var4] = 1000000;
                    class137.field2342[var4] = 0;
                    class214.field3711[var4] = 1000000;
                    class167.field2797[var4] = 0;
                }
                if (~class273.field4794 == -2) {
                    if (~(4 & class241.field4312[class237.field4140][class82.field1285.field1799 >> 7][class82.field1285.field1793 >> 7]) != -1) {
                        class241.method1666(0, class82.field1285.field1799 >> 7, false, class82.field1285.field1793 >> 7, class286.field5048, -30742);
                    }
                    if (~class159.field2655 > -311) {
                        int var5 = class200.field3403 >> 7;
                        int var6 = class213.field3683 >> 7;
                        int var7 = class82.field1285.field1793 >> 7;
                        int var8 = class82.field1285.field1799 >> 7;
                        int var9;
                        if (~var8 >= ~var6) {
                            var9 = -var8 + var6;
                        } else {
                            var9 = var8 - var6;
                        }
                        int var10;
                        if (var7 <= var5) {
                            var10 = -var7 + var5;
                        } else {
                            var10 = -var5 + var7;
                        }
                        if (var10 < var9) {
                            int var11 = var10 * 65536 / var9;
                            int var12 = 32768;
                            while (~var6 != ~var8) {
                                if (~var8 < ~var6) {
                                    ++var6;
                                } else if (var6 > var8) {
                                    --var6;
                                }
                                if (~(class241.field4312[class237.field4140][var6][var5] & 4) != -1) {
                                    class241.method1666(1, var6, false, var5, class286.field5048, -30742);
                                    break;
                                }
                                var12 += var11;
                                if (~var12 <= -65537) {
                                    if (var5 < var7) {
                                        ++var5;
                                    } else if (var5 > var7) {
                                        --var5;
                                    }
                                    var12 -= 65536;
                                    if (~(4 & class241.field4312[class237.field4140][var6][var5]) != -1) {
                                        class241.method1666(1, var6, false, var5, class286.field5048, -30742);
                                        break;
                                    }
                                }
                            }
                        } else {
                            int var13 = var9 * 65536 / var10;
                            int var14 = 32768;
                            while (~var5 != ~var7) {
                                if (var5 < var7) {
                                    ++var5;
                                } else if (~var7 > ~var5) {
                                    --var5;
                                }
                                if (~(class241.field4312[class237.field4140][var6][var5] & 4) != -1) {
                                    class241.method1666(1, var6, false, var5, class286.field5048, arg0 + -7351);
                                    break;
                                }
                                var14 += var13;
                                if (var14 >= 65536) {
                                    if (var6 >= var8) {
                                        if (~var8 > ~var6) {
                                            --var6;
                                        }
                                    } else {
                                        ++var6;
                                    }
                                    var14 -= 65536;
                                    if (~(class241.field4312[class237.field4140][var6][var5] & 4) != -1) {
                                        class241.method1666(1, var6, false, var5, class286.field5048, -30742);
                                        break;
                                    }
                                }
                            }
                        }
                    }
                } else {
                    int var15 = class262.method1768(class237.field4140, class213.field3683, class200.field3403, (byte) -115);
                    if (~(-class137.field2338 + var15) > -801 && ~(class241.field4312[class237.field4140][class213.field3683 >> 7][class200.field3403 >> 7] & 4) != -1) {
                        class241.method1666(1, class213.field3683 >> 7, false, class200.field3403 >> 7, class286.field5048, arg0 + -7351);
                    }
                }
                if (arg0 != -23391) {
                    method1168(-80, 20, 55, -58, 99, 111);
                }
            }
        }
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(Ljava/lang/String;I)Leg;")
    public static final class37 method1167(String arg0, int arg1) {
        ++field2909;
        byte[] var2 = arg0.getBytes();
        int var3 = var2.length;
        int var4 = 14 / ((21 - arg1) / 37);
        class37 var5 = new class37();
        var5.field599 = new byte[var3];
        int var6 = 0;
        while (var6 < var3) {
            int var7 = 255 & var2[var6++];
            if (var7 <= 45 && var7 >= 40) {
                if (~var3 >= ~var6) {
                    break;
                }
                int var8 = var2[var6++] & 255;
                var5.field599[var5.field576++] = (byte) ((var7 + -40) * 43 + (var8 - 48));
            } else if (~var7 != -1) {
                var5.field599[var5.field576++] = (byte) var7;
            }
        }
        var5.method250((byte) 85);
        return var5.method226(-193);
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(IIIIII)V")
    public static final void method1168(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg2 == -535405712) {
            ++field2917;
            int var6 = -arg3 + arg1;
            int var7 = -arg5 + arg0;
            if (var6 != 0) {
                if (var7 == 0) {
                    class180.method1194(arg4, arg1, arg3, false, arg5);
                } else {
                    int var8 = (var7 << 12) / var6;
                    int var9 = -(arg3 * var8 >> 12) + arg5;
                    int var10;
                    int var11;
                    if (~arg1 <= ~class178.field2972) {
                        if (~arg1 >= ~class217.field3741) {
                            var10 = arg0;
                            var11 = arg1;
                        } else {
                            var11 = class217.field3741;
                            var10 = (class217.field3741 * var8 >> 12) + var9;
                        }
                    } else {
                        var11 = class178.field2972;
                        var10 = (class178.field2972 * var8 >> 12) + var9;
                    }
                    int var12;
                    int var13;
                    if (arg3 < class178.field2972) {
                        var12 = class178.field2972;
                        var13 = var9 - -(class178.field2972 * var8 >> 12);
                    } else if (~class217.field3741 > ~arg3) {
                        var12 = class217.field3741;
                        var13 = (class217.field3741 * var8 >> 12) + var9;
                    } else {
                        var13 = arg5;
                        var12 = arg3;
                    }
                    if (~var13 > ~class286.field5050) {
                        var13 = class286.field5050;
                        var12 = (-var9 + class286.field5050 << 12) / var8;
                    } else if (~var13 < ~class96.field1507) {
                        var12 = (-var9 + class96.field1507 << 12) / var8;
                        var13 = class96.field1507;
                    }
                    if (~class286.field5050 >= ~var10) {
                        if (class96.field1507 < var10) {
                            var11 = (-var9 + class96.field1507 << 12) / var8;
                            var10 = class96.field1507;
                        }
                    } else {
                        var10 = class286.field5050;
                        var11 = (-var9 + class286.field5050 << 12) / var8;
                    }
                    class170.method1135(var11, var12, var10, (byte) 108, arg4, var13);
                }
            } else {
                if (var7 != 0) {
                    class287.method1920(arg4, arg5, arg0, -1, arg3);
                }
            }
        }
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(IIIIIIIIB)V")
    public static final void method1169(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, byte arg8) {
        ++field2918;
        if (arg8 != 98) {
            field2912 = null;
        }
        int var9 = -arg5 + arg0;
        int var10 = arg1 - arg7;
        int var11 = (-arg6 + arg3 << 16) / var9;
        int var12 = (-arg4 + arg2 << 16) / var10;
        class282.method1889(arg6, arg4, 0, var12, 0, var11, 1, arg7, arg5, arg1, arg0);
    }

    @OriginalMember(owner = "client!sj", name = "b", descriptor = "(II)[I")
    public final int[] method143(int arg0, int arg1) {
        int[] var3 = super.field2574.method206(arg0, 10232);
        if (arg1 != 1075962732) {
            this.method142((class187) null, 14, -57);
        }
        if (super.field2574.field536) {
            int var4 = class62.field1029[arg0];
            int var5 = var4 + -2048 >> 1;
            for (int var6 = 0; ~var6 > ~class227.field3898; ++var6) {
                int var7 = class239.field4263[var6];
                int var8 = var7 + -2048 >> 1;
                int var11;
                if (this.field2908 != 0) {
                    int var9 = var5 * var5 + var8 * var8 >> 12;
                    int var10 = (int) (4096.0D * Math.sqrt((double) ((float) var9 / 4096.0F)));
                    var11 = (int) ((double) (this.field2919 * var10) * 3.141592653589793D);
                } else {
                    var11 = (-var4 + var7) * this.field2919;
                }
                int var12 = var11 - (var11 & -4096);
                if (~this.field2913 == -1) {
                    var12 = class111.field1854[255 & var12 >> 4] + 4096 >> 1;
                } else if (this.field2913 == 2) {
                    var12 -= 2048;
                    if (var12 < 0) {
                        var12 = -var12;
                    }
                    var12 = -var12 + 2048 << 1;
                }
                var3[var6] = var12;
            }
        }
        ++field2916;
        return var3;
    }

    @OriginalMember(owner = "client!sj", name = "<init>", descriptor = "()V")
    public class174() {
        super(0, true);
    }
}
