import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!du")
public class class326 {

    @OriginalMember(owner = "client!du", name = "b", descriptor = "I")
    public int field5064 = -1;

    @OriginalMember(owner = "client!du", name = "c", descriptor = "Z")
    public boolean field5065 = false;

    @OriginalMember(owner = "client!du", name = "e", descriptor = "Z")
    public boolean field5067 = false;

    @OriginalMember(owner = "client!du", name = "a", descriptor = "I")
    public int field5063 = 1;

    @OriginalMember(owner = "client!du", name = "l", descriptor = "I")
    public int field5074 = 2;

    @OriginalMember(owner = "client!du", name = "n", descriptor = "I")
    public int field5076 = 64;

    @OriginalMember(owner = "client!du", name = "k", descriptor = "I")
    public int field5073 = 64;

    @OriginalMember(owner = "client!du", name = "m", descriptor = "[I")
    public static int[] field5075 = new int[250];

    @OriginalMember(owner = "client!du", name = "d", descriptor = "I")
    public static int field5066;

    @OriginalMember(owner = "client!du", name = "f", descriptor = "I")
    public static int field5068;

    @OriginalMember(owner = "client!du", name = "g", descriptor = "I")
    public static int field5069;

    @OriginalMember(owner = "client!du", name = "h", descriptor = "I")
    public static int field5070;

    @OriginalMember(owner = "client!du", name = "i", descriptor = "I")
    public static int field5071;

    @OriginalMember(owner = "client!du", name = "j", descriptor = "I")
    public static int field5072;

    @OriginalMember(owner = "client!du", name = "a", descriptor = "(IIIII)V", line = 5)
    public static final void method2194(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (class575.field8191 != null) {
            class575.field8191[arg0][arg1] = arg2 | 0xFF000000;
        }
        if (class479.field7078 != null) {
            class479.field7078[arg0][arg1] = (short) arg3;
        }
        if (class530.field7728 != null) {
            class530.field7728[arg0][arg1] = (byte) arg4;
        }
    }

    @OriginalMember(owner = "client!du", name = "a", descriptor = "(BIILie;)V", line = 17)
    private final void method2195(byte arg0, int arg1, int arg2, class6 arg3) {
        field5070++;
        int var5 = 6 % ((arg0 - 27) / 52);
        if (arg2 == 1) {
            this.field5064 = arg3.method67(12021);
            if (this.field5064 == 65535) {
                this.field5064 = -1;
                return;
            }
        } else if (arg2 == 2) {
            this.field5073 = arg3.method67(12021) + 1;
            this.field5076 = arg3.method67(12021) + 1;
            return;
        } else if (arg2 == 3) {
            arg3.method81(true);
        } else if (arg2 == 4) {
            this.field5074 = arg3.method70(-9059);
            return;
        } else if (arg2 == 5) {
            this.field5063 = arg3.method70(-9059);
            return;
        } else {
            if (arg2 == 6) {
                this.field5067 = true;
            } else if (arg2 == 7) {
                this.field5065 = true;
                return;
            }
            return;
        }
    }

    @OriginalMember(owner = "client!du", name = "a", descriptor = "(I)V", line = 66)
    public static void method2196(int arg0) {
        field5075 = null;
        if (arg0 != 2) {
            field5075 = null;
        }
    }

    @OriginalMember(owner = "client!du", name = "a", descriptor = "(ZI)Lpca;", line = 77)
    public static final class665 method2197(boolean arg0, int arg1) {
        if (arg0) {
            field5075 = null;
        }
        field5068++;
        int var2 = arg1 >> 16;
        int var3 = arg1 & 0xFFFF;
        if (class564.field8105[var2] == null || class564.field8105[var2][var3] == null) {
            boolean var4 = class107.method1016(var2, (byte) 118);
            if (!var4) {
                return null;
            }
        }
        return class564.field8105[var2][var3];
    }

    @OriginalMember(owner = "client!du", name = "b", descriptor = "(I)V", line = 113)
    public static final void method2198(int arg0) {
        field5072++;
        if (arg0 > -69) {
            return;
        }
        for (int var1 = 0; var1 < class275.field4413; var1++) {
            class681 var3 = class674.field9494[var1];
            boolean var4 = false;
            if (var3.field9547 == null) {
                var3.field9559--;
                if (var3.field9559 >= (var3.method3879(-3) ? -1500 : -10)) {
                    if (var3.field9548 == 1 && var3.field9556 == null) {
                        var3.field9556 = class120.method1073(class452.field6799, var3.field9558, 0);
                        if (var3.field9556 == null) {
                            continue;
                        }
                        var3.field9559 += var3.field9556.method1070();
                    } else if (var3.method3879(-3) && (var3.field9555 == null || var3.field9553 == null)) {
                        if (var3.field9555 == null) {
                            var3.field9555 = class249.method1777(class290.field4598, var3.field9558);
                        }
                        if (var3.field9555 == null) {
                            continue;
                        }
                        if (var3.field9553 == null) {
                            var3.field9553 = var3.field9555.method1768(new int[] { 22050 });
                            if (var3.field9553 == null) {
                                continue;
                            }
                        }
                    }
                    if (var3.field9559 < 0) {
                        int var5 = 8192;
                        int var14;
                        if (var3.field9557 == 0) {
                            var14 = var3.field9549 * (var3.field9548 == 3 ? class17.field282.field4875 : class17.field282.field4860) >> 2;
                        } else {
                            int var6 = var3.field9557 >> 24 & 0x3;
                            if (class567.field8141.field9695 == var6) {
                                int var7 = (var3.field9557 & 0xFF) << 9;
                                int var8 = class567.field8141.method1841(20744) << 8;
                                int var9 = var3.field9557 >> 16 & 0xFF;
                                int var10 = (var9 << 9) + var8 + 256 - class567.field8141.field9696;
                                int var11 = var3.field9557 >> 8 & 0xFF;
                                int var12 = (var11 << 9) + var8 + 256 - class567.field8141.field9705;
                                int var13 = Math.abs(var10) + Math.abs(var12) - 512;
                                if (var13 > var7) {
                                    var3.field9559 = -99999;
                                    continue;
                                }
                                if (var13 < 0) {
                                    var13 = 0;
                                }
                                var14 = class17.field282.field4847 * var3.field9549 * (var7 - var13) / var7 >> 2;
                                if (var3.field9552 != null && var3.field9552 instanceof class459) {
                                    class459 var15 = (class459) var3.field9552;
                                    short var16 = var15.field6869;
                                    short var17 = var15.field6865;
                                }
                                if (var10 != 0 || var12 != 0) {
                                    int var18 = -class523.field7598 - ((int) (Math.atan2((double) var10, (double) var12) * 2607.5945876176133D)) - 4096 & 0x3FFF;
                                    if (var18 > 8192) {
                                        var18 = 16384 - var18;
                                    }
                                    int var19;
                                    if (var13 <= 0) {
                                        var19 = 8192;
                                    } else if (var13 >= 4096) {
                                        var19 = 16384;
                                    } else {
                                        var19 = (8192 - var13) / 4096 + 8192;
                                    }
                                    var5 = (16384 - var19 >> 1) + var18 * var19 / 8192;
                                }
                            } else {
                                var14 = 0;
                            }
                        }
                        if (var14 > 0) {
                            class59 var20 = null;
                            if (var3.field9548 == 1) {
                                var20 = var3.field9556.method1071().method671(class694.field9729);
                            } else if (var3.method3879(-3)) {
                                var20 = var3.field9553;
                            }
                            class169 var21 = var3.field9547 = class169.method1391(var20, var3.field9551, var14, var5);
                            var21.method1381(var3.field9554 - 1);
                            class505.field7381.method1990(var21);
                        }
                    }
                } else {
                    var4 = true;
                }
            } else if (!var3.field9547.method708(50)) {
                var4 = true;
            }
            if (var4) {
                class275.field4413--;
                for (int var22 = var1; var22 < class275.field4413; var22++) {
                    class674.field9494[var22] = class674.field9494[var22 + 1];
                }
                var1--;
            }
        }
        if (class659.field9185 && !class426.method2696((byte) -102)) {
            if (class17.field282.field4864 != 0 && class187.field3121 != -1) {
                if (class235.field3741 == null) {
                    class143.method1216(0, class663.field9232, class17.field282.field4864, (byte) 121, false, class187.field3121);
                } else {
                    class656.method3774((byte) -111, class17.field282.field4864, false, 0, class187.field3121, class663.field9232, class235.field3741);
                }
            }
            class235.field3741 = null;
            class659.field9185 = false;
        } else if (class17.field282.field4864 != 0 && class187.field3121 != -1 && !class426.method2696((byte) 91)) {
            class706.field9993++;
            class165 var2 = class271.method1917(class420.field6424, (byte) -78, class401.field6186);
            var2.field2776.method82(false, class187.field3121);
            class642.method3726(-684096285, var2);
            class187.field3121 = -1;
        }
    }

    @OriginalMember(owner = "client!du", name = "a", descriptor = "(IIIZ)V", line = 334)
    public static final void method2199(int arg0, int arg1, int arg2, boolean arg3) {
        if (arg2 != 2520) {
            method2201(-123, -95, 17, null, null, -69, 118, -38, -37);
        }
        field5066++;
        if (arg1 < 8000 || arg1 > 48000) {
            throw new IllegalArgumentException();
        }
        class41.field581 = arg1;
        class3.field23 = arg3;
        class561.field8083 = arg0;
    }

    @OriginalMember(owner = "client!du", name = "a", descriptor = "(Lie;II)V", line = 359)
    public final void method2200(class6 arg0, int arg1, int arg2) {
        if (arg1 != -25524) {
            this.field5073 = 76;
        }
        while (true) {
            int var4 = arg0.method70(-9059);
            if (var4 == 0) {
                field5069++;
                return;
            }
            this.method2195((byte) -30, arg2, var4, arg0);
        }
    }

    @OriginalMember(owner = "client!du", name = "a", descriptor = "(III[B[BIIII)V", line = 387)
    public static final void method2201(int arg0, int arg1, int arg2, byte[] arg3, byte[] arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg6 != 0) {
            method2197(true, -48);
        }
        field5071++;
        int var9 = -(arg8 >> 2);
        int var10 = -(arg8 & 0x3);
        for (int var11 = -arg0; var11 < 0; var11++) {
            int var10001;
            for (int var12 = var9; var12 < 0; var12++) {
                var10001 = arg2++;
                arg3[var10001] = (byte) (arg3[var10001] - arg4[arg5++]);
                int var14 = arg2++;
                arg3[var14] = (byte) (arg3[var14] - arg4[arg5++]);
                int var15 = arg2++;
                arg3[var15] = (byte) (arg3[var15] - arg4[arg5++]);
                int var16 = arg2++;
                arg3[var16] = (byte) (arg3[var16] - arg4[arg5++]);
            }
            for (int var13 = var10; var13 < 0; var13++) {
                var10001 = arg2++;
                arg3[var10001] = (byte) (arg3[var10001] - arg4[arg5++]);
            }
            arg5 += arg1;
            arg2 += arg7;
        }
    }
}
