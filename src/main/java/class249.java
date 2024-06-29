import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pc")
public class class249 extends class67 {

    @OriginalMember(owner = "client!pc", name = "v", descriptor = "I")
    private final int field4429;

    @OriginalMember(owner = "client!pc", name = "t", descriptor = "I")
    private final int field4427;

    @OriginalMember(owner = "client!pc", name = "F", descriptor = "I")
    private final int field4438;

    @OriginalMember(owner = "client!pc", name = "E", descriptor = "I")
    private final int field4437;

    @OriginalMember(owner = "client!pc", name = "q", descriptor = "I")
    public static int field4424 = 0;

    @OriginalMember(owner = "client!pc", name = "u", descriptor = "Le;")
    private static class191 field4428 = class54.method368("Starting 3d library", 2047);

    @OriginalMember(owner = "client!pc", name = "o", descriptor = "I")
    public static int field4422 = 0;

    @OriginalMember(owner = "client!pc", name = "x", descriptor = "Le;")
    public static class191 field4431 = field4428;

    @OriginalMember(owner = "client!pc", name = "n", descriptor = "I")
    public static int field4421 = 0;

    @OriginalMember(owner = "client!pc", name = "p", descriptor = "I")
    public static int field4423;

    @OriginalMember(owner = "client!pc", name = "r", descriptor = "I")
    public static int field4425;

    @OriginalMember(owner = "client!pc", name = "s", descriptor = "I")
    public static int field4426;

    @OriginalMember(owner = "client!pc", name = "w", descriptor = "I")
    public static int field4430;

    @OriginalMember(owner = "client!pc", name = "y", descriptor = "I")
    public static int field4432;

    @OriginalMember(owner = "client!pc", name = "z", descriptor = "I")
    public static int field4433;

    @OriginalMember(owner = "client!pc", name = "B", descriptor = "I")
    public static int field4434;

    @OriginalMember(owner = "client!pc", name = "C", descriptor = "I")
    public static int field4435;

    @OriginalMember(owner = "client!pc", name = "D", descriptor = "I")
    public static int field4436;

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "()V")
    public static final void method1739() {
        class117.field1932 = 0;
        label191: for (int var0 = 0; var0 < class137.field2305; ++var0) {
            class206 var1 = class99.field1588[var0];
            if (class165.field2791 != null) {
                for (int var2 = 0; var2 < class165.field2791.length; ++var2) {
                    if (class165.field2791[var2] != -1000000 && (var1.field3673 <= class165.field2791[var2] || var1.field3651 <= class165.field2791[var2]) && (var1.field3656 <= class143.field2372[var2] || var1.field3667 <= class143.field2372[var2]) && (var1.field3656 >= class135.field2276[var2] || var1.field3667 >= class135.field2276[var2]) && (var1.field3646 <= class273.field4835[var2] || var1.field3648 <= class273.field4835[var2]) && (var1.field3646 >= class110.field1838[var2] || var1.field3648 >= class110.field1838[var2])) {
                        continue label191;
                    }
                }
            }
            if (var1.field3647 == 1) {
                int var3 = var1.field3657 - class161.field2720 + class81.field1368;
                if (var3 >= 0 && var3 <= class81.field1368 + class81.field1368) {
                    int var4 = var1.field3666 - class31.field440 + class81.field1368;
                    if (var4 < 0) {
                        var4 = 0;
                    }
                    int var5 = var1.field3661 - class31.field440 + class81.field1368;
                    if (var5 > class81.field1368 + class81.field1368) {
                        var5 = class81.field1368 + class81.field1368;
                    }
                    boolean var6 = false;
                    while (var4 <= var5) {
                        if (class66.field1150[var3][var4++]) {
                            var6 = true;
                            break;
                        }
                    }
                    if (var6) {
                        int var7 = class267.field4716 - var1.field3656;
                        if (var7 > 32) {
                            var1.field3668 = 1;
                        } else {
                            if (var7 >= -32) {
                                continue;
                            }
                            var1.field3668 = 2;
                            var7 = -var7;
                        }
                        var1.field3655 = (var1.field3646 - class73.field1268 << 8) / var7;
                        var1.field3672 = (var1.field3648 - class73.field1268 << 8) / var7;
                        var1.field3664 = (var1.field3673 - class22.field319 << 8) / var7;
                        var1.field3654 = (var1.field3651 - class22.field319 << 8) / var7;
                        class126.field2093[class117.field1932++] = var1;
                    }
                }
            } else if (var1.field3647 == 2) {
                int var8 = var1.field3666 - class31.field440 + class81.field1368;
                if (var8 >= 0 && var8 <= class81.field1368 + class81.field1368) {
                    int var9 = var1.field3657 - class161.field2720 + class81.field1368;
                    if (var9 < 0) {
                        var9 = 0;
                    }
                    int var10 = var1.field3663 - class161.field2720 + class81.field1368;
                    if (var10 > class81.field1368 + class81.field1368) {
                        var10 = class81.field1368 + class81.field1368;
                    }
                    boolean var11 = false;
                    while (var9 <= var10) {
                        if (class66.field1150[var9++][var8]) {
                            var11 = true;
                            break;
                        }
                    }
                    if (var11) {
                        int var12 = class73.field1268 - var1.field3646;
                        if (var12 > 32) {
                            var1.field3668 = 3;
                        } else {
                            if (var12 >= -32) {
                                continue;
                            }
                            var1.field3668 = 4;
                            var12 = -var12;
                        }
                        var1.field3665 = (var1.field3656 - class267.field4716 << 8) / var12;
                        var1.field3658 = (var1.field3667 - class267.field4716 << 8) / var12;
                        var1.field3664 = (var1.field3673 - class22.field319 << 8) / var12;
                        var1.field3654 = (var1.field3651 - class22.field319 << 8) / var12;
                        class126.field2093[class117.field1932++] = var1;
                    }
                }
            } else if (var1.field3647 == 4) {
                int var13 = var1.field3673 - class22.field319;
                if (var13 > 128) {
                    int var14 = var1.field3666 - class31.field440 + class81.field1368;
                    if (var14 < 0) {
                        var14 = 0;
                    }
                    int var15 = var1.field3661 - class31.field440 + class81.field1368;
                    if (var15 > class81.field1368 + class81.field1368) {
                        var15 = class81.field1368 + class81.field1368;
                    }
                    if (var14 <= var15) {
                        int var16 = var1.field3657 - class161.field2720 + class81.field1368;
                        if (var16 < 0) {
                            var16 = 0;
                        }
                        int var17 = var1.field3663 - class161.field2720 + class81.field1368;
                        if (var17 > class81.field1368 + class81.field1368) {
                            var17 = class81.field1368 + class81.field1368;
                        }
                        boolean var18 = false;
                        label163: for (int var19 = var16; var19 <= var17; ++var19) {
                            for (int var20 = var14; var20 <= var15; ++var20) {
                                if (class66.field1150[var19][var20]) {
                                    var18 = true;
                                    break label163;
                                }
                            }
                        }
                        if (var18) {
                            var1.field3668 = 5;
                            var1.field3665 = (var1.field3656 - class267.field4716 << 8) / var13;
                            var1.field3658 = (var1.field3667 - class267.field4716 << 8) / var13;
                            var1.field3655 = (var1.field3646 - class73.field1268 << 8) / var13;
                            var1.field3672 = (var1.field3648 - class73.field1268 << 8) / var13;
                            class126.field2093[class117.field1932++] = var1;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(Le;ILe;ILe;)V")
    public static final void method1740(class191 arg0, int arg1, class191 arg2, int arg3, class191 arg4) {
        if (arg1 <= 8) {
            field4430 = -62;
        }
        ++field4435;
        class132.method892(-1, arg4, arg2, 10289, arg0, arg3);
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(IBI)V")
    public final void method443(int arg0, byte arg1, int arg2) {
        if (arg1 > -51) {
            method1741((byte) 85);
        }
        ++field4425;
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(B)V")
    public static void method1741(byte arg0) {
        field4428 = null;
        field4431 = null;
        if (arg0 < 73) {
            method1742(43, 14, -57);
        }
    }

    @OriginalMember(owner = "client!pc", name = "c", descriptor = "(III)V")
    public static final void method1742(int arg0, int arg1, int arg2) {
        ++field4432;
        int var3 = -73 / ((arg1 - 44) / 35);
        class241 var4 = class14.method97(6, arg0, -67);
        var4.method1694((byte) -90);
        var4.field4301 = arg2;
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(III)V")
    public final void method441(int arg0, int arg1, int arg2) {
        ++field4423;
        if (arg0 != 32) {
            method1739();
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(IIB)V")
    public final void method446(int arg0, int arg1, byte arg2) {
        if (arg2 > -40) {
            method1739();
        }
        ++field4433;
        int var4 = this.field4437 * arg0 >> 12;
        int var5 = this.field4438 * arg1 >> 12;
        int var6 = this.field4427 * arg0 >> 12;
        int var7 = this.field4429 * arg1 >> 12;
        class63.method419(var5, super.field1165, 7185, var4, var7, var6);
    }

    @OriginalMember(owner = "client!pc", name = "<init>", descriptor = "(IIIIII)V")
    public class249(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(-1, arg4, arg5);
        this.field4429 = arg3;
        this.field4427 = arg2;
        this.field4438 = arg1;
        this.field4437 = arg0;
    }
}
