import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ga")
public class class62 extends class221 {

    @OriginalMember(owner = "client!ga", name = "p", descriptor = "I")
    private final int field1213;

    @OriginalMember(owner = "client!ga", name = "t", descriptor = "I")
    private final int field1217;

    @OriginalMember(owner = "client!ga", name = "v", descriptor = "I")
    private final int field1219;

    @OriginalMember(owner = "client!ga", name = "r", descriptor = "I")
    private final int field1215;

    @OriginalMember(owner = "client!ga", name = "o", descriptor = "Lrd;")
    public static class173 field1212 = class133.method843("Verbindung konnte nicht hergestellt werden)3", 61);

    @OriginalMember(owner = "client!ga", name = "x", descriptor = "Ljava/lang/Object;")
    public static Object field1221 = new Object();

    @OriginalMember(owner = "client!ga", name = "z", descriptor = "Lrd;")
    private static class173 field1223 = class133.method843("Sorry invited players only)3", 119);

    @OriginalMember(owner = "client!ga", name = "A", descriptor = "Lrd;")
    public static class173 field1224 = field1223;

    @OriginalMember(owner = "client!ga", name = "E", descriptor = "[Lrd;")
    public static class173[] field1228 = new class173[200];

    @OriginalMember(owner = "client!ga", name = "n", descriptor = "I")
    public static int field1211;

    @OriginalMember(owner = "client!ga", name = "q", descriptor = "I")
    public static int field1214;

    @OriginalMember(owner = "client!ga", name = "s", descriptor = "I")
    public static int field1216;

    @OriginalMember(owner = "client!ga", name = "u", descriptor = "I")
    public static int field1218;

    @OriginalMember(owner = "client!ga", name = "w", descriptor = "I")
    public static int field1220;

    @OriginalMember(owner = "client!ga", name = "y", descriptor = "I")
    public static int field1222;

    @OriginalMember(owner = "client!ga", name = "B", descriptor = "I")
    public static int field1225;

    @OriginalMember(owner = "client!ga", name = "C", descriptor = "I")
    public static int field1226;

    @OriginalMember(owner = "client!ga", name = "D", descriptor = "I")
    public static int field1227;

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(IIIII)V")
    public static final void method390(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 != -30497) {
            field1224 = null;
        }
        if (arg0 <= arg2) {
            for (int var5 = arg0; arg2 > var5; ++var5) {
                class107.field1998[var5][arg4] = arg3;
            }
        } else {
            for (int var6 = arg2; arg0 > var6; ++var6) {
                class107.field1998[var6][arg4] = arg3;
            }
        }
        ++field1227;
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(Lbc;Lbc;BLjava/awt/Component;)V")
    public static final void method391(class14 arg0, class14 arg1, byte arg2, Component arg3) {
        ++field1218;
        if (!class7.field134) {
            class27.method209();
            byte[] var4 = arg1.method142(class22.field486, 0, (byte) 2);
            if (arg2 < 10) {
                field1212 = null;
            }
            class166.field3208 = new class180(var4, arg3);
            class15.field345 = class166.field3208.method1223();
            class112.field2085 = class209.method1380((byte) -120, arg0, class203.field3962);
            class57.field1144 = class209.method1380((byte) -112, arg0, class216.field4194);
            class98.field1790 = class209.method1380((byte) -113, arg0, class177.field3463);
            class140.field2621 = class216.method1414(class172.field3362, 0, arg0);
            class109.field2036 = class216.method1414(class63.field1237, 0, arg0);
            class163.field3013 = new int[256];
            for (int var5 = 0; ~var5 > -65; ++var5) {
                class163.field3013[var5] = var5 * 262144;
            }
            for (int var6 = 0; ~var6 > -65; ++var6) {
                class163.field3013[var6 + 64] = var6 * 1024 + 16711680;
            }
            for (int var7 = 0; ~var7 > -65; ++var7) {
                class163.field3013[var7 - -128] = var7 * 4 + 16776960;
            }
            for (int var8 = 0; var8 < 64; ++var8) {
                class163.field3013[var8 + 192] = 16777215;
            }
            class170.field3303 = new int[256];
            for (int var9 = 0; ~var9 > -65; ++var9) {
                class170.field3303[var9] = var9 * 1024;
            }
            for (int var10 = 0; var10 < 64; ++var10) {
                class170.field3303[var10 + 64] = var10 * 4 + 65280;
            }
            for (int var11 = 0; var11 < 64; ++var11) {
                class170.field3303[var11 - -128] = var11 * 262144 + 65535;
            }
            for (int var12 = 0; ~var12 > -65; ++var12) {
                class170.field3303[var12 + 192] = 16777215;
            }
            class145.field2722 = new int[256];
            for (int var13 = 0; ~var13 > -65; ++var13) {
                class145.field2722[var13] = var13 * 4;
            }
            for (int var14 = 0; ~var14 > -65; ++var14) {
                class145.field2722[var14 - -64] = var14 * 262144 + 255;
            }
            for (int var15 = 0; ~var15 > -65; ++var15) {
                class145.field2722[var15 + 128] = var15 * 1024 + 16711935;
            }
            for (int var16 = 0; ~var16 > -65; ++var16) {
                class145.field2722[var16 - -192] = 16777215;
            }
            class34.field751 = new int[256];
            class101.field1855 = new int[32768];
            class207.field4036 = new int[32768];
            class135.method854((class39) null, (byte) -58);
            class66.field1290 = new int[32768];
            class191.field3738 = new int[32768];
            class87.field1699 = class87.field1688;
            class183.field3601 = 0;
            class87.field1686 = class87.field1688;
            if (class211.field4079 != 0) {
                class147.field2816 = false;
            } else {
                class147.field2816 = true;
            }
            class24.field526 = false;
            if (!class147.field2816) {
                class46.method325(0, 2, class114.field2106, class107.field1990, 1, 255, false);
            } else {
                class143.method904(1, 2);
            }
            class108.method664(false, 0);
            class7.field134 = true;
            class166.field3208.method1226(0, 0);
            class15.field345.method1226(382, 0);
            class112.field2085.method291(-(class112.field2085.field812 / 2) + 382, 18);
            class214.field4156 = new class180(128, 254);
            class191.field3736 = new class180(128, 254);
        }
    }

    @OriginalMember(owner = "client!ga", name = "<init>", descriptor = "(IIIIII)V")
    public class62(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(-1, arg4, arg5);
        this.field1213 = arg1;
        this.field1217 = arg2;
        this.field1219 = arg0;
        this.field1215 = arg3;
    }

    @OriginalMember(owner = "client!ga", name = "c", descriptor = "(III)J")
    public static final long method392(int arg0, int arg1, int arg2) {
        class105 var3 = class208.field4055[arg0][arg1][arg2];
        if (var3 == null) {
            return 0L;
        } else {
            for (int var4 = 0; var4 < var3.field1972; ++var4) {
                class5 var5 = var3.field1948[var4];
                if ((var5.field123 >> 29 & 3L) == 2L && var5.field120 == arg1 && var5.field125 == arg2) {
                    return var5.field123;
                }
            }
            return 0L;
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(III)V")
    public final void method393(int arg0, int arg1, int arg2) {
        int var4 = this.field1219 * arg1 >> 12;
        if (arg2 != 0) {
            field1221 = null;
        }
        int var5 = this.field1217 * arg1 >> 12;
        ++field1226;
        int var6 = this.field1213 * arg0 >> 12;
        int var7 = this.field1215 * arg0 >> 12;
        class74.method456((byte) 95, var5, var7, super.field4246, var6, var4);
    }

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "(III)V")
    public final void method394(int arg0, int arg1, int arg2) {
        ++field1214;
        if (arg0 != 0) {
            method391((class14) null, (class14) null, (byte) -92, (Component) null);
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(ZLqc;Lbc;Lbc;I)V")
    public static final void method395(boolean arg0, class162 arg1, class14 arg2, class14 arg3, int arg4) {
        ++field1222;
        class169.field3255 = arg0;
        class40.field831 = arg3;
        class216.field4179 = arg2;
        int var5 = class216.field4179.method132(false) + arg4;
        class64.field1262 = var5 * 256 - -class216.field4179.method138(var5, true);
        class121.field2285 = arg1;
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(ZZ)V")
    public static final void method396(boolean arg0, boolean arg1) {
        ++field1211;
        int var2 = class18.field378;
        if (arg0) {
            var2 = 1;
        }
        if (class175.field3447.field2820 >> 7 == class55.field1094 && ~(class175.field3447.field2801 >> 7) == ~class193.field3759) {
            class55.field1094 = 0;
        }
        int var3 = 0;
        if (arg1) {
            field1221 = null;
        }
        while (~var3 > ~var2) {
            class212 var4;
            long var5;
            if (arg0) {
                var4 = class175.field3447;
                var5 = 8791798054912L;
            } else {
                var4 = class183.field3600[class189.field3703[var3]];
                var5 = (long) class189.field3703[var3] << 32;
            }
            if (var4 != null && var4.method727(true)) {
                var4.field4096 = false;
                if ((class107.field2003 && ~class18.field378 < -51 || class18.field378 > 200) && !arg0 && ~var4.field2815 == ~var4.field2762) {
                    var4.field4096 = true;
                }
                int var7 = var4.field2820 >> 7;
                int var8 = var4.field2801 >> 7;
                if (var7 >= 0 && var7 < 104 && var8 >= 0 && ~var8 > -105) {
                    if (var4.field4125 != null && ~var4.field4116 >= ~class217.field4203 && class217.field4203 < var4.field4101) {
                        var4.field4096 = false;
                        var4.field2757 = class56.method361(class172.field3347, var4.field2801, (byte) 107, var4.field2820);
                        class159.method1041(class172.field3347, var4.field2820, var4.field2801, var4.field2757, var4, var4.field2786, var5, var4.field4112, var4.field4126, var4.field4107, var4.field4095);
                    } else {
                        label93: {
                            if (~(var4.field2820 & 127) == -65 && ~(var4.field2801 & 127) == -65) {
                                if (~class199.field3877[var7][var8] == ~class41.field851) {
                                    break label93;
                                }
                                class199.field3877[var7][var8] = class41.field851;
                            }
                            var4.field2757 = class56.method361(class172.field3347, var4.field2801, (byte) -56, var4.field2820);
                            class55.method357(class172.field3347, var4.field2820, var4.field2801, var4.field2757, 60, var4, var4.field2786, var5, var4.field2810);
                        }
                    }
                }
            }
            ++var3;
        }
    }

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "(I)V")
    public static void method397(int arg0) {
        field1228 = null;
        field1223 = null;
        field1224 = null;
        if (arg0 != -128) {
            method398(113, -12, -12, -64, -17, -34, (class121) null, -88);
        }
        field1212 = null;
        field1221 = null;
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(IIIIIILmb;I)V")
    public static final void method398(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class121 arg6, int arg7) {
        if (arg1 != 0) {
            field1221 = null;
        }
        ++field1216;
        if (~arg0 <= -1 && arg0 < 104 && arg7 >= 0 && ~arg7 > -105) {
            class21.field462[arg4][arg0][arg7] = 0;
            while (true) {
                int var8 = arg6.method751((byte) 97);
                if (var8 == 0) {
                    if (~arg4 != -1) {
                        class46.field975[arg4][arg0][arg7] = class46.field975[arg4 + -1][arg0][arg7] + -240;
                        return;
                    } else {
                        class46.field975[0][arg0][arg7] = 8 * -class12.method73(arg7 + 556238 + arg5, arg2 + 932731 + arg0, -767549439);
                        return;
                    }
                }
                if (var8 == 1) {
                    int var9 = arg6.method751((byte) -119);
                    if (var9 == 1) {
                        var9 = 0;
                    }
                    if (~arg4 == -1) {
                        class46.field975[0][arg0][arg7] = -var9 * 8;
                        return;
                    }
                    class46.field975[arg4][arg0][arg7] = class46.field975[arg4 - 1][arg0][arg7] + -(var9 * 8);
                    return;
                }
                if (~var8 >= -50) {
                    class45.field938[arg4][arg0][arg7] = arg6.method767(arg1 + -87);
                    class23.field502[arg4][arg0][arg7] = (byte) ((var8 + -2) / 4);
                    class126.field2384[arg4][arg0][arg7] = (byte) class209.method1383(3, arg3 + var8 + -2);
                } else if (var8 <= 81) {
                    class21.field462[arg4][arg0][arg7] = (byte) (var8 + -49);
                } else {
                    class208.field4054[arg4][arg0][arg7] = (byte) (var8 + -81);
                }
            }
        } else {
            while (true) {
                int var10 = arg6.method751((byte) -29);
                if (~var10 == -1) {
                    return;
                }
                if (var10 == 1) {
                    arg6.method751((byte) 88);
                    return;
                }
                if (var10 <= 49) {
                    arg6.method751((byte) 115);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(IIB)V")
    public final void method399(int arg0, int arg1, byte arg2) {
        int var4 = 71 / ((arg2 - -50) / 44);
        ++field1220;
    }
}
