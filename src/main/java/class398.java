import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ln")
public class class398 {

    @OriginalMember(owner = "client!ln", name = "f", descriptor = "I")
    public int field5466 = 16777215;

    @OriginalMember(owner = "client!ln", name = "k", descriptor = "I")
    public int field5471 = 8;

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "I")
    public int field5461;

    @OriginalMember(owner = "client!ln", name = "b", descriptor = "I")
    public int field5462;

    @OriginalMember(owner = "client!ln", name = "c", descriptor = "I")
    public int field5463;

    @OriginalMember(owner = "client!ln", name = "e", descriptor = "I")
    public static int field5465;

    @OriginalMember(owner = "client!ln", name = "h", descriptor = "I")
    public int field5468;

    @OriginalMember(owner = "client!ln", name = "i", descriptor = "I")
    public static int field5469;

    @OriginalMember(owner = "client!ln", name = "j", descriptor = "I")
    public int field5470;

    @OriginalMember(owner = "client!ln", name = "l", descriptor = "I")
    public static int field5472;

    @OriginalMember(owner = "client!ln", name = "m", descriptor = "I")
    public static int field5473;

    @OriginalMember(owner = "client!ln", name = "g", descriptor = "Z")
    public boolean field5467;

    @OriginalMember(owner = "client!ln", name = "d", descriptor = "[I")
    public static int[] field5464;

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(I)V", line = 7)
    public static final void method2452(int arg0) {
        field5469++;
        for (int var1 = 0; var1 < class565.field8020; var1++) {
            class481 var3 = class262.field3842[var1];
            boolean var4 = false;
            if (var3.field6758 == null) {
                var3.field6765--;
                if (var3.field6765 < (var3.method2864(-30) ? -1500 : -10)) {
                    var4 = true;
                } else {
                    if (var3.field6766 == 1 && var3.field6755 == null) {
                        var3.field6755 = class382.method2377(class602.field8436, var3.field6756, 0);
                        if (var3.field6755 == null) {
                            continue;
                        }
                        var3.field6765 += var3.field6755.method2378();
                    } else if (var3.method2864(-36) && (var3.field6760 == null || var3.field6753 == null)) {
                        if (var3.field6760 == null) {
                            var3.field6760 = class175.method1273(class486.field6846, var3.field6756);
                        }
                        if (var3.field6760 == null) {
                            continue;
                        }
                        if (var3.field6753 == null) {
                            var3.field6753 = var3.field6760.method1271(new int[] { 22050 });
                            if (var3.field6753 == null) {
                                continue;
                            }
                        }
                    }
                    if (var3.field6765 < 0) {
                        int var5 = 8192;
                        int var7;
                        if (var3.field6767 == 0) {
                            var7 = var3.field6757 * (var3.field6766 == 3 ? class21.field353.field10094.method2896(-105) : class21.field353.field10061.method2896(-62)) >> 2;
                        } else {
                            int var6 = (var3.field6767 & 0x3F50D35) >> 24;
                            if (class210.field3250.field5755 == var6) {
                                int var8 = (var3.field6767 & 0xFF) << 9;
                                int var9 = class210.field3250.method2102(true) << 8;
                                int var10 = var3.field6767 >> 16 & 0xFF;
                                int var11 = (var10 << 9) + var9 + 256 - class210.field3250.field5742;
                                int var12 = var3.field6767 >> 8 & 0xFF;
                                int var13 = (var12 << 9) + var9 + 256 - class210.field3250.field5746;
                                int var14 = Math.abs(var11) + Math.abs(var13) - 512;
                                if (var8 < var14) {
                                    var3.field6765 = -99999;
                                    continue;
                                }
                                if (var14 < 0) {
                                    var14 = 0;
                                }
                                var7 = class21.field353.field10095.method2896(arg0 - 115) * (var8 - var14) * var3.field6757 / var8 >> 2;
                                if (var3.field6752 != null && var3.field6752 instanceof class672) {
                                    class672 var15 = (class672) var3.field6752;
                                    short var16 = var15.field9368;
                                    short var17 = var15.field9364;
                                }
                                if (var11 != 0 || var13 != 0) {
                                    int var18 = -class544.field7813 - ((int) (Math.atan2((double) var11, (double) var13) * 2607.5945876176133D)) - 4096 & 0x3FFF;
                                    if (var18 > 8192) {
                                        var18 = 16384 - var18;
                                    }
                                    int var19;
                                    if (var14 <= 0) {
                                        var19 = 8192;
                                    } else if (var14 >= 4096) {
                                        var19 = 16384;
                                    } else {
                                        var19 = (8192 - var14) / 4096 + 8192;
                                    }
                                    var5 = (16384 - var19 >> 1) + var18 * var19 / 8192;
                                }
                            } else {
                                var7 = 0;
                            }
                        }
                        if (var7 > 0) {
                            class218 var20 = null;
                            if (var3.field6766 == 1) {
                                var20 = var3.field6755.method2380().method1498(class451.field6328);
                            } else if (var3.method2864(-109)) {
                                var20 = var3.field6753;
                            }
                            class18 var21 = var3.field6758 = class18.method194(var20, var3.field6759, var7, var5);
                            var21.method179(var3.field6764 - 1);
                            class184.field2828.method424(var21);
                        }
                    }
                }
            } else if (!var3.field6758.method3386((byte) 54)) {
                var4 = true;
            }
            if (var4) {
                class565.field8020--;
                for (int var22 = var1; var22 < class565.field8020; var22++) {
                    class262.field3842[var22] = class262.field3842[var22 + 1];
                }
                var1--;
            }
        }
        if (class169.field2642 && !class95.method694((byte) -93)) {
            if (class21.field353.field10078.method2896(-96) != 0 && class577.field8137 != -1) {
                if (class695.field9710 == null) {
                    class370.method2306(class21.field353.field10078.method2896(-75), 0, class488.field6899, class577.field8137, (byte) -84, false);
                } else {
                    class611.method3554(class577.field8137, 0, class488.field6899, class21.field353.field10078.method2896(arg0 - 49), class695.field9710, arg0 - 117, false);
                }
            }
            class695.field9710 = null;
            class169.field2642 = false;
        } else if (class21.field353.field10078.method2896(-15) != 0 && class577.field8137 != -1 && !class95.method694((byte) -93)) {
            class284.field4194++;
            class312 var2 = class353.method2245(class87.field971, class268.field3899, (byte) 121);
            var2.field4445.method2959(class577.field8137, (byte) -36);
            class208.method1440(var2, 56);
            class577.field8137 = -1;
        }
        if (arg0 != -1) {
            method2452(22);
        }
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(IILso;)V", line = 232)
    private final void method2453(int arg0, int arg1, class494 arg2) {
        field5465++;
        if (arg1 != 0) {
            this.method2453(99, 47, null);
        }
        if (arg0 == 1) {
            this.field5471 = arg2.method2998(true);
        } else if (arg0 == 2) {
            this.field5467 = true;
        } else if (arg0 == 3) {
            this.field5462 = arg2.method2988(-3);
            this.field5470 = arg2.method2988(arg1 - 3);
            this.field5463 = arg2.method2988(-3);
        } else if (arg0 == 4) {
            this.field5468 = arg2.method2964((byte) 100);
            return;
        } else if (arg0 == 5) {
            this.field5461 = arg2.method2998(true);
            return;
        } else if (arg0 == 6) {
            this.field5466 = arg2.method2960((byte) 94);
            return;
        }
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(Lso;Z)V", line = 287)
    public final void method2454(class494 arg0, boolean arg1) {
        field5473++;
        while (true) {
            int var3 = arg0.method2964((byte) 62);
            if (var3 == 0) {
                if (arg1) {
                    return;
                } else {
                    this.field5471 = -69;
                    return;
                }
            }
            this.method2453(var3, 0, arg0);
        }
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(B)V", line = 315)
    public static void method2455(byte arg0) {
        int var1 = -80 % ((arg0 - 44) / 55);
        field5464 = null;
    }
}
