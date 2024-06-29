import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mh")
public class class104 extends class149 {

    @OriginalMember(owner = "client!mh", name = "N", descriptor = "I")
    private int field1485 = 2048;

    @OriginalMember(owner = "client!mh", name = "Q", descriptor = "I")
    private int field1488 = 0;

    @OriginalMember(owner = "client!mh", name = "R", descriptor = "I")
    private int field1489 = 12288;

    @OriginalMember(owner = "client!mh", name = "S", descriptor = "I")
    private int field1490 = 4096;

    @OriginalMember(owner = "client!mh", name = "O", descriptor = "I")
    private int field1486 = 8192;

    @OriginalMember(owner = "client!mh", name = "V", descriptor = "I")
    private int field1493 = 0;

    @OriginalMember(owner = "client!mh", name = "Y", descriptor = "I")
    private int field1496 = 2048;

    @OriginalMember(owner = "client!mh", name = "K", descriptor = "[Ljava/awt/Color;")
    public static Color[] field1482 = new Color[] { new Color(9179409), new Color(16777215) };

    @OriginalMember(owner = "client!mh", name = "bb", descriptor = "I")
    public static int field1499 = 1401;

    @OriginalMember(owner = "client!mh", name = "I", descriptor = "I")
    public static int field1480;

    @OriginalMember(owner = "client!mh", name = "J", descriptor = "I")
    public static int field1481;

    @OriginalMember(owner = "client!mh", name = "L", descriptor = "I")
    public static int field1483;

    @OriginalMember(owner = "client!mh", name = "M", descriptor = "I")
    public static int field1484;

    @OriginalMember(owner = "client!mh", name = "P", descriptor = "I")
    public static int field1487;

    @OriginalMember(owner = "client!mh", name = "T", descriptor = "I")
    public static int field1491;

    @OriginalMember(owner = "client!mh", name = "U", descriptor = "I")
    public static int field1492;

    @OriginalMember(owner = "client!mh", name = "W", descriptor = "I")
    public static int field1494;

    @OriginalMember(owner = "client!mh", name = "X", descriptor = "I")
    public static int field1495;

    @OriginalMember(owner = "client!mh", name = "ab", descriptor = "I")
    public static int field1498;

    @OriginalMember(owner = "client!mh", name = "Z", descriptor = "Loa;")
    public static class33 field1497;

    @OriginalMember(owner = "client!mh", name = "c", descriptor = "(III)Z")
    private final boolean method697(int arg0, int arg1, int arg2) {
        if (arg2 < 120) {
            this.method99(-90);
        }
        ++field1483;
        int var4 = (arg0 + arg1) * this.field1489 >> 12;
        int var5 = class253.field3510[255 & var4 * 255 >> 12];
        int var6 = (var5 << 12) / this.field1489;
        int var7 = (var6 << 12) / this.field1486;
        int var8 = this.field1490 * var7 >> 12;
        return ~var8 < ~(arg1 - arg0) && -arg0 + arg1 > -var8;
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(IIIFIIFIIII[FF)V")
    public static final void method698(int arg0, int arg1, int arg2, float arg3, int arg4, int arg5, float arg6, int arg7, int arg8, int arg9, int arg10, float[] arg11, float arg12) {
        int var13 = arg7 - arg0;
        int var14 = arg9 - arg2;
        int var15 = arg10 - arg4;
        ++field1484;
        float var16 = arg11[2] * (float) var15 + arg11[arg8] * (float) var14 + arg11[1] * (float) var13;
        float var17 = arg11[5] * (float) var15 + arg11[3] * (float) var14 + arg11[4] * (float) var13;
        float var18 = arg11[8] * (float) var15 + arg11[7] * (float) var13 + arg11[6] * (float) var14;
        float var19;
        float var20;
        if (~arg1 != -1) {
            if (arg1 != 1) {
                if (arg1 != 2) {
                    if (~arg1 != -4) {
                        if (~arg1 != -5) {
                            var19 = -var18 + arg6 + 0.5F;
                            var20 = -var17 + arg3 + 0.5F;
                        } else {
                            var19 = arg6 + var18 + 0.5F;
                            var20 = -var17 + arg3 + 0.5F;
                        }
                    } else {
                        var20 = -var17 + arg3 + 0.5F;
                        var19 = arg12 + var16 + 0.5F;
                    }
                } else {
                    var19 = -var16 + arg12 + 0.5F;
                    var20 = -var17 + arg3 + 0.5F;
                }
            } else {
                var19 = arg12 + var16 + 0.5F;
                var20 = arg6 + var18 + 0.5F;
            }
        } else {
            var20 = -var18 + arg6 + 0.5F;
            var19 = arg12 + var16 + 0.5F;
        }
        if (arg5 != 1) {
            if (~arg5 == -3) {
                var20 = -var20;
                var19 = -var19;
            } else if (arg5 == 3) {
                float var21 = var19;
                var19 = var20;
                var20 = -var21;
            }
        } else {
            float var22 = var19;
            var19 = -var20;
            var20 = var22;
        }
        class25.field414 = var19;
        class404.field6113 = var20;
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(IBLtl;)V")
    public final void method93(int arg0, byte arg1, class91 arg2) {
        ++field1487;
        if (arg1 == 35) {
            if (arg0 != 0) {
                if (arg0 != 1) {
                    if (~arg0 != -3) {
                        if (arg0 != 3) {
                            if (~arg0 != -5) {
                                if (arg0 != 5) {
                                    if (arg0 == 6) {
                                        this.field1486 = arg2.method631(10494);
                                    }
                                } else {
                                    this.field1490 = arg2.method631(10494);
                                }
                            } else {
                                this.field1489 = arg2.method631(arg1 ^ 10461);
                            }
                        } else {
                            this.field1496 = arg2.method631(arg1 ^ 10461);
                        }
                    } else {
                        this.field1488 = arg2.method631(arg1 ^ 10461);
                    }
                } else {
                    this.field1493 = arg2.method631(10494);
                }
            } else {
                this.field1485 = arg2.method631(10494);
            }
        }
    }

    @OriginalMember(owner = "client!mh", name = "d", descriptor = "(B)V")
    public static final void method699(byte arg0) {
        class19.field284 = new class491[50];
        if (arg0 >= -24) {
            field1497 = null;
        }
        class240.field3386 = 0;
        ++field1491;
    }

    @OriginalMember(owner = "client!mh", name = "d", descriptor = "(III)Z")
    private final boolean method700(int arg0, int arg1, int arg2) {
        ++field1494;
        int var4 = (-arg0 + arg1) * this.field1489 >> 12;
        int var5 = class253.field3510[var4 * 255 >> 12 & 255];
        if (arg2 != 1409751308) {
            method701(-54);
        }
        int var6 = (var5 << 12) / this.field1489;
        int var7 = (var6 << 12) / this.field1486;
        int var8 = this.field1490 * var7 >> 12;
        return ~var8 < ~(arg0 + arg1) && arg0 + arg1 > -var8;
    }

    @OriginalMember(owner = "client!mh", name = "e", descriptor = "(I)V")
    public static void method701(int arg0) {
        if (arg0 != -2048) {
            method703(70, -73, -23, -74, -91, 52, -27, -40);
        }
        field1482 = null;
        field1497 = null;
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(IILap;IIII)V")
    public static final void method702(int arg0, int arg1, class337 arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field1492;
        class192.method1353(arg1, arg2.field2215, arg3, arg4, 0, 14631, arg5, arg2.field2217, arg0, arg2.field2210);
        if (arg6 != 12407) {
            method702(-46, 50, (class337) null, -93, -53, -37, -125);
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(II)[I")
    public final int[] method92(int arg0, int arg1) {
        ++field1495;
        int[] var3 = super.field2152.method2891(arg1, (byte) 96);
        if (arg0 != -10835) {
            this.field1490 = -47;
        }
        if (super.field2152.field7051) {
            int var4 = class185.field2613[arg1] + -2048;
            for (int var5 = 0; var5 < class316.field4838; ++var5) {
                int var6 = class197.field2791[var5] + -2048;
                int var7 = this.field1485 + var6;
                int var8 = var7 >= -2048 ? var7 : var7 + 4096;
                int var9 = var8 <= 2048 ? var8 : var8 + -4096;
                int var10 = var4 - -this.field1493;
                int var11 = var10 >= -2048 ? var10 : var10 + 4096;
                int var12 = var11 > 2048 ? var11 + -4096 : var11;
                int var13 = var6 - -this.field1488;
                int var14 = var13 < -2048 ? var13 - -4096 : var13;
                int var15 = var14 <= 2048 ? var14 : var14 + -4096;
                int var16 = this.field1496 + var4;
                int var17 = var16 >= -2048 ? var16 : var16 - -4096;
                int var18 = ~var17 < -2049 ? var17 + -4096 : var17;
                var3[var5] = !this.method700(var9, var12, 1409751308) && !this.method697(var15, var18, class41.method323(arg0, -10793)) ? 0 : 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!mh", name = "d", descriptor = "(I)V")
    public final void method99(int arg0) {
        ++field1498;
        if (arg0 >= -86) {
            method698(-43, -28, 5, 0.5635919F, 83, 27, 0.8163945F, -75, -5, 43, 25, (float[]) null, -0.51842934F);
        }
        class117.method761(0);
    }

    @OriginalMember(owner = "client!mh", name = "<init>", descriptor = "()V")
    public class104() {
        super(0, true);
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method703(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        ++field1481;
        int var8 = class278.method1758(class158.field2302, class410.field6176, arg3, 115);
        int var9 = class278.method1758(class158.field2302, class410.field6176, arg6, -88);
        if (arg5 != 8379) {
            method698(-60, -18, -105, 0.17980011F, 45, 16, -0.3223832F, 8, -62, -31, 10, (float[]) null, 1.2794077F);
        }
        int var10 = class278.method1758(class443.field6591, class396.field6021, arg1, -64);
        int var11 = class278.method1758(class443.field6591, class396.field6021, arg7, arg5 ^ 8403);
        int var12 = class278.method1758(class158.field2302, class410.field6176, arg0 + arg3, -102);
        int var13 = class278.method1758(class158.field2302, class410.field6176, -arg0 + arg6, -64);
        for (int var14 = var8; ~var14 > ~var12; ++var14) {
            class271.method1736(var11, arg4, var10, arg5 + -8390, class23.field356[var14]);
        }
        for (int var15 = var9; var13 < var15; --var15) {
            class271.method1736(var11, arg4, var10, -11, class23.field356[var15]);
        }
        int var16 = class278.method1758(class443.field6591, class396.field6021, arg1 - -arg0, arg5 ^ 8438);
        int var17 = class278.method1758(class443.field6591, class396.field6021, -arg0 + arg7, -121);
        for (int var18 = var12; ~var18 >= ~var13; ++var18) {
            int[] var19 = class23.field356[var18];
            class271.method1736(var16, arg4, var10, -11, var19);
            class271.method1736(var17, arg2, var16, -11, var19);
            class271.method1736(var11, arg4, var17, -11, var19);
        }
    }

    @OriginalMember(owner = "client!mh", name = "f", descriptor = "(I)V")
    public static final void method704(int arg0) {
        if (arg0 >= -29) {
            method699((byte) 123);
        }
        ++field1480;
        if (class508.field7556 != null) {
            if (~class508.field7556.field1791 == -2) {
                class508.field7556 = null;
                return;
            }
            if (class508.field7556.field1791 == 2) {
                class138.method916(true, 2, class477.field6937, class295.field4370);
                class508.field7556 = null;
                return;
            }
        }
    }
}
