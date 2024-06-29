import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.OptionalDataException;
import java.io.StreamCorruptedException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ne")
public class class146 extends class102 {

    @OriginalMember(owner = "client!ne", name = "U", descriptor = "I")
    private int field2650 = 204;

    @OriginalMember(owner = "client!ne", name = "P", descriptor = "I")
    private int field2645 = 1;

    @OriginalMember(owner = "client!ne", name = "bb", descriptor = "I")
    private int field2657 = 1;

    @OriginalMember(owner = "client!ne", name = "Y", descriptor = "[I")
    public static int[] field2654 = new int[5];

    @OriginalMember(owner = "client!ne", name = "Q", descriptor = "[[B")
    public static byte[][] field2646 = new byte[1000][];

    @OriginalMember(owner = "client!ne", name = "O", descriptor = "Lqe;")
    public static class179 field2644 = class206.method1380("m-Ochte mit Ihnen handeln)3", (byte) 72);

    @OriginalMember(owner = "client!ne", name = "R", descriptor = "Lqe;")
    private static class179 field2647 = class206.method1380("FULL", (byte) -27);

    @OriginalMember(owner = "client!ne", name = "W", descriptor = "Lqe;")
    public static class179 field2652 = field2647;

    @OriginalMember(owner = "client!ne", name = "M", descriptor = "I")
    public static int field2642;

    @OriginalMember(owner = "client!ne", name = "N", descriptor = "I")
    public static int field2643;

    @OriginalMember(owner = "client!ne", name = "S", descriptor = "I")
    public static int field2648;

    @OriginalMember(owner = "client!ne", name = "T", descriptor = "I")
    public static int field2649;

    @OriginalMember(owner = "client!ne", name = "V", descriptor = "I")
    public static int field2651;

    @OriginalMember(owner = "client!ne", name = "X", descriptor = "I")
    public static int field2653;

    @OriginalMember(owner = "client!ne", name = "Z", descriptor = "I")
    public static int field2655;

    @OriginalMember(owner = "client!ne", name = "ab", descriptor = "I")
    public static int field2656;

    @OriginalMember(owner = "client!ne", name = "e", descriptor = "(I)V")
    public static void method938(int arg0) {
        field2654 = null;
        field2647 = null;
        field2652 = null;
        field2646 = null;
        field2644 = null;
        if (arg0 != 11613) {
            method940(-3, (class10) null, false);
        }
    }

    @OriginalMember(owner = "client!ne", name = "c", descriptor = "(III)I")
    public static final int method939(int arg0, int arg1, int arg2) {
        ++field2648;
        if (arg0 == -2) {
            return 12345678;
        } else if (arg0 == -1) {
            if (arg2 >= 2) {
                if (arg2 > 126) {
                    arg2 = 126;
                }
            } else {
                arg2 = 2;
            }
            return arg2;
        } else {
            int var3 = (arg0 & 127) * arg2 >> 7;
            if (~var3 > -3) {
                var3 = 2;
            } else if (~var3 < -127) {
                var3 = 126;
            }
            if (arg1 != 497) {
                method942((byte) 89);
            }
            return (65408 & arg0) + var3;
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(ZI)[I")
    public final int[] method11(boolean arg0, int arg1) {
        ++field2656;
        int[] var3 = super.field1960.method699((byte) -74, arg1);
        if (!arg0) {
            method938(48);
        }
        if (super.field1960.field2007) {
            for (int var4 = 0; ~class155.field2796 < ~var4; ++var4) {
                int var5 = class124.field2292[var4];
                int var6 = class94.field1769[arg1];
                int var7 = this.field2657 * var5 >> 12;
                int var8 = var5 % (4096 / this.field2657) * this.field2657;
                int var9 = this.field2645 * var6 >> 12;
                int var10 = var6 % (4096 / this.field2645) * this.field2645;
                if (this.field2650 > var10) {
                    for (var7 -= var9; ~var7 > -1; var7 += 4) {
                    }
                    while (~var7 < -4) {
                        var7 -= 4;
                    }
                    if (var7 != 1) {
                        var3[var4] = 0;
                        continue;
                    }
                    if (var8 < this.field2650) {
                        var3[var4] = 0;
                        continue;
                    }
                }
                if (this.field2650 > var8) {
                    int var11;
                    for (var11 = var7 - var9; var11 < 0; var11 += 4) {
                    }
                    while (~var11 < -4) {
                        var11 -= 4;
                    }
                    if (~var11 < -1) {
                        var3[var4] = 0;
                        continue;
                    }
                }
                var3[var4] = 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(ILai;Z)V")
    public static final void method940(int arg0, class10 arg1, boolean arg2) {
        ++field2651;
        if (!arg2) {
            while (true) {
                class211 var3 = (class211) class205.field3838.method242(16711680);
                if (var3 == null) {
                    return;
                }
                boolean var4 = false;
                for (int var5 = 0; var5 < var3.field3936; ++var5) {
                    if (var3.field3943[var5] != null) {
                        if (var3.field3943[var5].field595 == 2) {
                            var3.field3930[var5] = -5;
                        }
                        if (var3.field3943[var5].field595 == 0) {
                            var4 = true;
                        }
                    }
                    if (var3.field3939[var5] != null) {
                        if (~var3.field3939[var5].field595 == -3) {
                            var3.field3930[var5] = -6;
                        }
                        if (var3.field3939[var5].field595 == 0) {
                            var4 = true;
                        }
                    }
                }
                if (var4) {
                    return;
                }
                arg1.method70((byte) -62, arg0);
                arg1.method1230((byte) -68, 0);
                int var6 = arg1.field3432;
                arg1.method1229((byte) -95, var3.field3950);
                for (int var7 = 0; var3.field3936 > var7; ++var7) {
                    if (~var3.field3930[var7] != -1) {
                        arg1.method1230((byte) -85, var3.field3930[var7]);
                    } else {
                        try {
                            int var8 = var3.field3948[var7];
                            if (var8 == 0) {
                                Field var9 = (Field) var3.field3943[var7].field591;
                                int var10 = var9.getInt((Object) null);
                                arg1.method1230((byte) -82, 0);
                                arg1.method1229((byte) -108, var10);
                            } else if (var8 != 1) {
                                if (var8 == 2) {
                                    Field var11 = (Field) var3.field3943[var7].field591;
                                    int var12 = var11.getModifiers();
                                    arg1.method1230((byte) -114, 0);
                                    arg1.method1229((byte) -87, var12);
                                }
                            } else {
                                Field var13 = (Field) var3.field3943[var7].field591;
                                var13.setInt((Object) null, var3.field3932[var7]);
                                arg1.method1230((byte) -72, 0);
                            }
                            if (var8 != 3) {
                                if (~var8 == -5) {
                                    Method var14 = (Method) var3.field3939[var7].field591;
                                    int var15 = var14.getModifiers();
                                    arg1.method1230((byte) -80, 0);
                                    arg1.method1229((byte) -124, var15);
                                }
                            } else {
                                Method var16 = (Method) var3.field3939[var7].field591;
                                byte[][] var17 = var3.field3949[var7];
                                Object[] var18 = new Object[var17.length];
                                for (int var19 = 0; ~var17.length < ~var19; ++var19) {
                                    ObjectInputStream var20 = new ObjectInputStream(new ByteArrayInputStream(var17[var19]));
                                    var18[var19] = var20.readObject();
                                }
                                Object var21 = var16.invoke((Object) null, var18);
                                if (var21 == null) {
                                    arg1.method1230((byte) -107, 0);
                                } else if (!(var21 instanceof Number)) {
                                    if (var21 instanceof class179) {
                                        arg1.method1230((byte) -126, 2);
                                        arg1.method1212((byte) 0, (class179) var21);
                                    } else {
                                        arg1.method1230((byte) -51, 4);
                                    }
                                } else {
                                    arg1.method1230((byte) -110, 1);
                                    arg1.method1232(((Number) var21).longValue(), (byte) 124);
                                }
                            }
                        } catch (ClassNotFoundException var22) {
                            arg1.method1230((byte) -69, -10);
                        } catch (InvalidClassException var23) {
                            arg1.method1230((byte) -101, -11);
                        } catch (StreamCorruptedException var24) {
                            arg1.method1230((byte) -118, -12);
                        } catch (OptionalDataException var25) {
                            arg1.method1230((byte) -80, -13);
                        } catch (IllegalAccessException var26) {
                            arg1.method1230((byte) -118, -14);
                        } catch (IllegalArgumentException var27) {
                            arg1.method1230((byte) -56, -15);
                        } catch (InvocationTargetException var28) {
                            arg1.method1230((byte) -120, -16);
                        } catch (SecurityException var29) {
                            arg1.method1230((byte) -58, -17);
                        } catch (IOException var30) {
                            arg1.method1230((byte) -100, -18);
                        } catch (NullPointerException var31) {
                            arg1.method1230((byte) -72, -19);
                        } catch (Exception var32) {
                            arg1.method1230((byte) -89, -20);
                        } catch (Throwable var33) {
                            arg1.method1230((byte) -62, -21);
                        }
                    }
                }
                arg1.method1228(var6, (byte) 88);
                arg1.method1238(Integer.MAX_VALUE, -var6 + arg1.field3432);
                var3.method592((byte) -128);
            }
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(Lsc;Z)V")
    public static final void method941(class197 arg0, boolean arg1) {
        class209.field3921.method235(-127, arg0);
        while (true) {
            class197 var2;
            int var3;
            int var4;
            int var5;
            int var6;
            class197[][] var7;
            class197 var65;
            do {
                class197 var64;
                do {
                    class197 var63;
                    do {
                        class197 var62;
                        do {
                            do {
                                do {
                                    while (true) {
                                        while (true) {
                                            do {
                                                var2 = (class197) class209.field3921.method230(-111);
                                                if (var2 == null) {
                                                    return;
                                                }
                                            } while (!var2.field3666);
                                            var3 = var2.field3682;
                                            var4 = var2.field3670;
                                            var5 = var2.field3661;
                                            var6 = var2.field3665;
                                            var7 = class229.field4232[var5];
                                            if (!var2.field3667) {
                                                break;
                                            }
                                            if (arg1) {
                                                if (var5 > 0) {
                                                    class197 var8 = class229.field4232[var5 - 1][var3][var4];
                                                    if (var8 != null && var8.field3666) {
                                                        continue;
                                                    }
                                                }
                                                if (var3 <= class232.field4288 && var3 > class165.field2982) {
                                                    class197 var9 = var7[var3 - 1][var4];
                                                    if (var9 != null && var9.field3666 && (var9.field3667 || (var2.field3686 & 1) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var3 >= class232.field4288 && var3 < class137.field2524 - 1) {
                                                    class197 var10 = var7[var3 + 1][var4];
                                                    if (var10 != null && var10.field3666 && (var10.field3667 || (var2.field3686 & 4) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var4 <= class4.field62 && var4 > class223.field4119) {
                                                    class197 var11 = var7[var3][var4 - 1];
                                                    if (var11 != null && var11.field3666 && (var11.field3667 || (var2.field3686 & 8) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var4 >= class4.field62 && var4 < class175.field3197 - 1) {
                                                    class197 var12 = var7[var3][var4 + 1];
                                                    if (var12 != null && var12.field3666 && (var12.field3667 || (var2.field3686 & 2) == 0)) {
                                                        continue;
                                                    }
                                                }
                                            } else {
                                                arg1 = true;
                                            }
                                            var2.field3667 = false;
                                            if (var2.field3677 != null) {
                                                class197 var13 = var2.field3677;
                                                if (var13.field3663 != null) {
                                                    if (!class116.method747(0, var3, var4)) {
                                                        class162.method1040(var13.field3663, 0, class187.field3470, class54.field1179, class130.field2367, class239.field4397, var3, var4);
                                                    }
                                                } else if (var13.field3683 != null && !class116.method747(0, var3, var4)) {
                                                    class243.method1566(var13.field3683, class187.field3470, class54.field1179, class130.field2367, class239.field4397, var3, var4);
                                                }
                                                class237 var14 = var13.field3680;
                                                if (var14 != null) {
                                                    var14.field4382.method286(0, class187.field3470, class54.field1179, class130.field2367, class239.field4397, var14.field4356 - class100.field1859, var14.field4376 - class66.field1343, var14.field4375 - class110.field2060, var14.field4379);
                                                }
                                                for (int var15 = 0; var15 < var13.field3662; ++var15) {
                                                    class167 var16 = var13.field3672[var15];
                                                    if (var16 != null) {
                                                        var16.field3010.method286(var16.field3017, class187.field3470, class54.field1179, class130.field2367, class239.field4397, var16.field3022 - class100.field1859, var16.field3002 - class66.field1343, var16.field3004 - class110.field2060, var16.field3014);
                                                    }
                                                }
                                            }
                                            boolean var17 = false;
                                            if (var2.field3663 != null) {
                                                if (!class116.method747(var6, var3, var4)) {
                                                    var17 = true;
                                                    if (var2.field3663.field3060 != 12345678 || class218.field4042 && var5 <= class135.field2493) {
                                                        class162.method1040(var2.field3663, var6, class187.field3470, class54.field1179, class130.field2367, class239.field4397, var3, var4);
                                                    }
                                                }
                                            } else if (var2.field3683 != null && !class116.method747(var6, var3, var4)) {
                                                var17 = true;
                                                class243.method1566(var2.field3683, class187.field3470, class54.field1179, class130.field2367, class239.field4397, var3, var4);
                                            }
                                            int var18 = 0;
                                            int var19 = 0;
                                            class237 var20 = var2.field3680;
                                            class169 var21 = var2.field3678;
                                            if (var20 != null || var21 != null) {
                                                if (class232.field4288 == var3) {
                                                    ++var18;
                                                } else if (class232.field4288 < var3) {
                                                    var18 += 2;
                                                }
                                                if (class4.field62 == var4) {
                                                    var18 += 3;
                                                } else if (class4.field62 > var4) {
                                                    var18 += 6;
                                                }
                                                var19 = class64.field1322[var18];
                                                var2.field3671 = class73.field1441[var18];
                                            }
                                            if (var20 != null) {
                                                if ((var20.field4365 & class96.field1818[var18]) != 0) {
                                                    if (var20.field4365 == 16) {
                                                        var2.field3684 = 3;
                                                        var2.field3675 = class34.field731[var18];
                                                        var2.field3679 = 3 - var2.field3675;
                                                    } else if (var20.field4365 == 32) {
                                                        var2.field3684 = 6;
                                                        var2.field3675 = class190.field3536[var18];
                                                        var2.field3679 = 6 - var2.field3675;
                                                    } else if (var20.field4365 == 64) {
                                                        var2.field3684 = 12;
                                                        var2.field3675 = class143.field2606[var18];
                                                        var2.field3679 = 12 - var2.field3675;
                                                    } else {
                                                        var2.field3684 = 9;
                                                        var2.field3675 = class77.field1500[var18];
                                                        var2.field3679 = 9 - var2.field3675;
                                                    }
                                                } else {
                                                    var2.field3684 = 0;
                                                }
                                                if ((var20.field4365 & var19) != 0 && !class91.method601(var6, var3, var4, var20.field4365)) {
                                                    var20.field4382.method286(0, class187.field3470, class54.field1179, class130.field2367, class239.field4397, var20.field4356 - class100.field1859, var20.field4376 - class66.field1343, var20.field4375 - class110.field2060, var20.field4379);
                                                }
                                                if ((var20.field4360 & var19) != 0 && !class91.method601(var6, var3, var4, var20.field4360)) {
                                                    var20.field4362.method286(0, class187.field3470, class54.field1179, class130.field2367, class239.field4397, var20.field4356 - class100.field1859, var20.field4376 - class66.field1343, var20.field4375 - class110.field2060, var20.field4379);
                                                }
                                            }
                                            if (var21 != null && !class216.method1415(var6, var3, var4, var21.field3051.method295())) {
                                                if ((var21.field3042 & var19) != 0) {
                                                    var21.field3051.method286(0, class187.field3470, class54.field1179, class130.field2367, class239.field4397, var21.field3041 - class100.field1859 + var21.field3046, var21.field3047 - class66.field1343, var21.field3044 - class110.field2060 + var21.field3039, var21.field3049);
                                                } else if (var21.field3042 == 256) {
                                                    int var22 = var21.field3041 - class100.field1859;
                                                    int var23 = var21.field3047 - class66.field1343;
                                                    int var24 = var21.field3044 - class110.field2060;
                                                    int var25 = var21.field3040;
                                                    int var26;
                                                    if (var25 != 1 && var25 != 2) {
                                                        var26 = var22;
                                                    } else {
                                                        var26 = -var22;
                                                    }
                                                    int var27;
                                                    if (var25 != 2 && var25 != 3) {
                                                        var27 = var24;
                                                    } else {
                                                        var27 = -var24;
                                                    }
                                                    if (var27 < var26) {
                                                        var21.field3051.method286(0, class187.field3470, class54.field1179, class130.field2367, class239.field4397, var21.field3046 + var22, var23, var21.field3039 + var24, var21.field3049);
                                                    } else if (var21.field3038 != null) {
                                                        var21.field3038.method286(0, class187.field3470, class54.field1179, class130.field2367, class239.field4397, var22, var23, var24, var21.field3049);
                                                    }
                                                }
                                            }
                                            if (var17) {
                                                class47 var28 = var2.field3681;
                                                if (var28 != null) {
                                                    var28.field1028.method286(0, class187.field3470, class54.field1179, class130.field2367, class239.field4397, var28.field1018 - class100.field1859, var28.field1020 - class66.field1343, var28.field1019 - class110.field2060, var28.field1026);
                                                }
                                                class232 var29 = var2.field3668;
                                                if (var29 != null && var29.field4271 == 0) {
                                                    if (var29.field4267 != null) {
                                                        var29.field4267.method286(0, class187.field3470, class54.field1179, class130.field2367, class239.field4397, var29.field4264 - class100.field1859, var29.field4268 - class66.field1343, var29.field4265 - class110.field2060, var29.field4284);
                                                    }
                                                    if (var29.field4274 != null) {
                                                        var29.field4274.method286(0, class187.field3470, class54.field1179, class130.field2367, class239.field4397, var29.field4264 - class100.field1859, var29.field4268 - class66.field1343, var29.field4265 - class110.field2060, var29.field4284);
                                                    }
                                                    if (var29.field4272 != null) {
                                                        var29.field4272.method286(0, class187.field3470, class54.field1179, class130.field2367, class239.field4397, var29.field4264 - class100.field1859, var29.field4268 - class66.field1343, var29.field4265 - class110.field2060, var29.field4284);
                                                    }
                                                }
                                            }
                                            int var30 = var2.field3686;
                                            if (var30 != 0) {
                                                if (var3 < class232.field4288 && (var30 & 4) != 0) {
                                                    class197 var31 = var7[var3 + 1][var4];
                                                    if (var31 != null && var31.field3666) {
                                                        class209.field3921.method235(-69, var31);
                                                    }
                                                }
                                                if (var4 < class4.field62 && (var30 & 2) != 0) {
                                                    class197 var32 = var7[var3][var4 + 1];
                                                    if (var32 != null && var32.field3666) {
                                                        class209.field3921.method235(-73, var32);
                                                    }
                                                }
                                                if (var3 > class232.field4288 && (var30 & 1) != 0) {
                                                    class197 var33 = var7[var3 - 1][var4];
                                                    if (var33 != null && var33.field3666) {
                                                        class209.field3921.method235(-108, var33);
                                                    }
                                                }
                                                if (var4 > class4.field62 && (var30 & 8) != 0) {
                                                    class197 var34 = var7[var3][var4 - 1];
                                                    if (var34 != null && var34.field3666) {
                                                        class209.field3921.method235(-98, var34);
                                                    }
                                                }
                                            }
                                            break;
                                        }
                                        if (var2.field3684 != 0) {
                                            boolean var35 = true;
                                            for (int var36 = 0; var36 < var2.field3662; ++var36) {
                                                if (class18.field483 != var2.field3672[var36].field3019 && (var2.field3674[var36] & var2.field3684) == var2.field3675) {
                                                    var35 = false;
                                                    break;
                                                }
                                            }
                                            if (var35) {
                                                class237 var37 = var2.field3680;
                                                if (!class91.method601(var6, var3, var4, var37.field4365)) {
                                                    var37.field4382.method286(0, class187.field3470, class54.field1179, class130.field2367, class239.field4397, var37.field4356 - class100.field1859, var37.field4376 - class66.field1343, var37.field4375 - class110.field2060, var37.field4379);
                                                }
                                                var2.field3684 = 0;
                                            }
                                        }
                                        if (!var2.field3676) {
                                            break;
                                        }
                                        try {
                                            int var38 = var2.field3662;
                                            var2.field3676 = false;
                                            int var39 = 0;
                                            label558: for (int var40 = 0; var40 < var38; ++var40) {
                                                class167 var41 = var2.field3672[var40];
                                                if (class18.field483 != var41.field3019) {
                                                    for (int var42 = var41.field3006; var42 <= var41.field3011; ++var42) {
                                                        for (int var43 = var41.field3018; var43 <= var41.field3023; ++var43) {
                                                            class197 var44 = var7[var42][var43];
                                                            if (var44.field3667) {
                                                                var2.field3676 = true;
                                                                continue label558;
                                                            }
                                                            if (var44.field3684 != 0) {
                                                                int var45 = 0;
                                                                if (var42 > var41.field3006) {
                                                                    ++var45;
                                                                }
                                                                if (var42 < var41.field3011) {
                                                                    var45 += 4;
                                                                }
                                                                if (var43 > var41.field3018) {
                                                                    var45 += 8;
                                                                }
                                                                if (var43 < var41.field3023) {
                                                                    var45 += 2;
                                                                }
                                                                if ((var45 & var44.field3684) == var2.field3679) {
                                                                    var2.field3676 = true;
                                                                    continue label558;
                                                                }
                                                            }
                                                        }
                                                    }
                                                    class114.field2141[var39++] = var41;
                                                    int var46 = class232.field4288 - var41.field3006;
                                                    int var47 = var41.field3011 - class232.field4288;
                                                    if (var47 > var46) {
                                                        var46 = var47;
                                                    }
                                                    int var48 = class4.field62 - var41.field3018;
                                                    int var49 = var41.field3023 - class4.field62;
                                                    if (var49 > var48) {
                                                        var41.field3020 = var46 + var49;
                                                    } else {
                                                        var41.field3020 = var46 + var48;
                                                    }
                                                }
                                            }
                                            while (var39 > 0) {
                                                int var50 = -50;
                                                int var51 = -1;
                                                for (int var52 = 0; var52 < var39; ++var52) {
                                                    class167 var53 = class114.field2141[var52];
                                                    if (class18.field483 != var53.field3019) {
                                                        if (var53.field3020 > var50) {
                                                            var50 = var53.field3020;
                                                            var51 = var52;
                                                        } else if (var53.field3020 == var50) {
                                                            int var54 = var53.field3022 - class100.field1859;
                                                            int var55 = var53.field3004 - class110.field2060;
                                                            int var56 = class114.field2141[var51].field3022 - class100.field1859;
                                                            int var57 = class114.field2141[var51].field3004 - class110.field2060;
                                                            if (var54 * var54 + var55 * var55 > var56 * var56 + var57 * var57) {
                                                                var51 = var52;
                                                            }
                                                        }
                                                    }
                                                }
                                                if (var51 == -1) {
                                                    break;
                                                }
                                                class167 var58 = class114.field2141[var51];
                                                var58.field3019 = class18.field483;
                                                if (!class141.method894(var6, var58.field3006, var58.field3011, var58.field3018, var58.field3023, var58.field3010.method295())) {
                                                    var58.field3010.method286(var58.field3017, class187.field3470, class54.field1179, class130.field2367, class239.field4397, var58.field3022 - class100.field1859, var58.field3002 - class66.field1343, var58.field3004 - class110.field2060, var58.field3014);
                                                }
                                                for (int var59 = var58.field3006; var59 <= var58.field3011; ++var59) {
                                                    for (int var60 = var58.field3018; var60 <= var58.field3023; ++var60) {
                                                        class197 var61 = var7[var59][var60];
                                                        if (var61.field3684 != 0) {
                                                            class209.field3921.method235(-109, var61);
                                                        } else if ((var3 != var59 || var4 != var60) && var61.field3666) {
                                                            class209.field3921.method235(-87, var61);
                                                        }
                                                    }
                                                }
                                            }
                                            if (!var2.field3676) {
                                                break;
                                            }
                                        } catch (Exception var80) {
                                            var2.field3676 = false;
                                            break;
                                        }
                                    }
                                } while (!var2.field3666);
                            } while (var2.field3684 != 0);
                            if (var3 > class232.field4288 || var3 <= class165.field2982) {
                                break;
                            }
                            var62 = var7[var3 - 1][var4];
                        } while (var62 != null && var62.field3666);
                        if (var3 < class232.field4288 || var3 >= class137.field2524 - 1) {
                            break;
                        }
                        var63 = var7[var3 + 1][var4];
                    } while (var63 != null && var63.field3666);
                    if (var4 > class4.field62 || var4 <= class223.field4119) {
                        break;
                    }
                    var64 = var7[var3][var4 - 1];
                } while (var64 != null && var64.field3666);
                if (var4 < class4.field62 || var4 >= class175.field3197 - 1) {
                    break;
                }
                var65 = var7[var3][var4 + 1];
            } while (var65 != null && var65.field3666);
            var2.field3666 = false;
            --class218.field4027;
            class232 var66 = var2.field3668;
            if (var66 != null && var66.field4271 != 0) {
                if (var66.field4267 != null) {
                    var66.field4267.method286(0, class187.field3470, class54.field1179, class130.field2367, class239.field4397, var66.field4264 - class100.field1859, var66.field4268 - class66.field1343 - var66.field4271, var66.field4265 - class110.field2060, var66.field4284);
                }
                if (var66.field4274 != null) {
                    var66.field4274.method286(0, class187.field3470, class54.field1179, class130.field2367, class239.field4397, var66.field4264 - class100.field1859, var66.field4268 - class66.field1343 - var66.field4271, var66.field4265 - class110.field2060, var66.field4284);
                }
                if (var66.field4272 != null) {
                    var66.field4272.method286(0, class187.field3470, class54.field1179, class130.field2367, class239.field4397, var66.field4264 - class100.field1859, var66.field4268 - class66.field1343 - var66.field4271, var66.field4265 - class110.field2060, var66.field4284);
                }
            }
            if (var2.field3671 != 0) {
                class169 var67 = var2.field3678;
                if (var67 != null && !class216.method1415(var6, var3, var4, var67.field3051.method295())) {
                    if ((var67.field3042 & var2.field3671) != 0) {
                        var67.field3051.method286(0, class187.field3470, class54.field1179, class130.field2367, class239.field4397, var67.field3041 - class100.field1859 + var67.field3046, var67.field3047 - class66.field1343, var67.field3044 - class110.field2060 + var67.field3039, var67.field3049);
                    } else if (var67.field3042 == 256) {
                        int var68 = var67.field3041 - class100.field1859;
                        int var69 = var67.field3047 - class66.field1343;
                        int var70 = var67.field3044 - class110.field2060;
                        int var71 = var67.field3040;
                        int var72;
                        if (var71 != 1 && var71 != 2) {
                            var72 = var68;
                        } else {
                            var72 = -var68;
                        }
                        int var73;
                        if (var71 != 2 && var71 != 3) {
                            var73 = var70;
                        } else {
                            var73 = -var70;
                        }
                        if (var73 >= var72) {
                            var67.field3051.method286(0, class187.field3470, class54.field1179, class130.field2367, class239.field4397, var67.field3046 + var68, var69, var67.field3039 + var70, var67.field3049);
                        } else if (var67.field3038 != null) {
                            var67.field3038.method286(0, class187.field3470, class54.field1179, class130.field2367, class239.field4397, var68, var69, var70, var67.field3049);
                        }
                    }
                }
                class237 var74 = var2.field3680;
                if (var74 != null) {
                    if ((var74.field4360 & var2.field3671) != 0 && !class91.method601(var6, var3, var4, var74.field4360)) {
                        var74.field4362.method286(0, class187.field3470, class54.field1179, class130.field2367, class239.field4397, var74.field4356 - class100.field1859, var74.field4376 - class66.field1343, var74.field4375 - class110.field2060, var74.field4379);
                    }
                    if ((var74.field4365 & var2.field3671) != 0 && !class91.method601(var6, var3, var4, var74.field4365)) {
                        var74.field4382.method286(0, class187.field3470, class54.field1179, class130.field2367, class239.field4397, var74.field4356 - class100.field1859, var74.field4376 - class66.field1343, var74.field4375 - class110.field2060, var74.field4379);
                    }
                }
            }
            if (var5 < class155.field2793 - 1) {
                class197 var75 = class229.field4232[var5 + 1][var3][var4];
                if (var75 != null && var75.field3666) {
                    class209.field3921.method235(-117, var75);
                }
            }
            if (var3 < class232.field4288) {
                class197 var76 = var7[var3 + 1][var4];
                if (var76 != null && var76.field3666) {
                    class209.field3921.method235(-92, var76);
                }
            }
            if (var4 < class4.field62) {
                class197 var77 = var7[var3][var4 + 1];
                if (var77 != null && var77.field3666) {
                    class209.field3921.method235(-125, var77);
                }
            }
            if (var3 > class232.field4288) {
                class197 var78 = var7[var3 - 1][var4];
                if (var78 != null && var78.field3666) {
                    class209.field3921.method235(-90, var78);
                }
            }
            if (var4 > class4.field62) {
                class197 var79 = var7[var3][var4 - 1];
                if (var79 != null && var79.field3666) {
                    class209.field3921.method235(-110, var79);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(Lra;IZ)V")
    public final void method13(class185 arg0, int arg1, boolean arg2) {
        if (arg2) {
            field2652 = null;
        }
        ++field2642;
        if (arg1 != 0) {
            if (~arg1 != -2) {
                if (~arg1 == -3) {
                    this.field2650 = arg0.method1252(2);
                }
            } else {
                this.field2645 = arg0.method1243(3);
            }
        } else {
            this.field2657 = arg0.method1243(3);
        }
    }

    @OriginalMember(owner = "client!ne", name = "<init>", descriptor = "()V")
    public class146() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ne", name = "d", descriptor = "(B)V")
    public static final void method942(byte arg0) {
        ++field2643;
        try {
            if (~class239.field4406 == -1) {
                if (class199.field3714 != null) {
                    class199.field3714.method303(1);
                    class199.field3714 = null;
                }
                class4.field57 = false;
                class201.field3732 = 0;
                class239.field4406 = 1;
                class22.field541 = null;
            }
            if (arg0 != 72) {
                field2646 = null;
            }
            if (class239.field4406 == 1) {
                if (class22.field541 == null) {
                    class22.field541 = class25.field588.method1(class222.field4090, class234.field4316, -6138);
                }
                if (class22.field541.field595 == 2) {
                    throw new IOException();
                }
                if (class22.field541.field595 == 1) {
                    class199.field3714 = new class46((Socket) class22.field541.field591, class25.field588);
                    class22.field541 = null;
                    class239.field4406 = 2;
                }
            }
            if (class239.field4406 == 2) {
                long var1 = class16.field445 = class232.field4286.method1137(77);
                class81.field1564.field3432 = 0;
                class81.field1564.method1230((byte) -78, 14);
                int var3 = (int) (var1 >> 16 & 31L);
                class81.field1564.method1230((byte) -103, var3);
                class199.field3714.method307(-51, 0, class81.field1564.field3397, 2);
                class239.field4406 = 3;
                class36.field789.field3432 = 0;
            }
            if (~class239.field4406 == -4) {
                if (class192.field3585 != null) {
                    class192.field3585.method96((byte) 125);
                }
                if (class163.field2951 != null) {
                    class163.field2951.method96((byte) 86);
                }
                int var4 = class199.field3714.method309((byte) 51);
                if (class192.field3585 != null) {
                    class192.field3585.method96((byte) 101);
                }
                if (class163.field2951 != null) {
                    class163.field2951.method96((byte) 112);
                }
                if (~var4 != -1) {
                    class16.method126(var4, -27085);
                    return;
                }
                class239.field4406 = 4;
                class36.field789.field3432 = 0;
            }
            if (~class239.field4406 == -5) {
                if (~class36.field789.field3432 > -9) {
                    int var5 = class199.field3714.method305((byte) 114);
                    if (-class36.field789.field3432 + 8 < var5) {
                        var5 = -class36.field789.field3432 + 8;
                    }
                    if (~var5 < -1) {
                        class199.field3714.method311((byte) -66, class36.field789.field3397, class36.field789.field3432, var5);
                        class36.field789.field3432 += var5;
                    }
                }
                if (class36.field789.field3432 == 8) {
                    class36.field789.field3432 = 0;
                    class211.field3946 = class36.field789.method1226(-1);
                    class239.field4406 = 5;
                }
            }
            if (class239.field4406 == 5) {
                class81.field1564.field3432 = 0;
                int[] var6 = new int[] { (int) (9.9999999E7D * Math.random()), (int) (9.9999999E7D * Math.random()), (int) (class211.field3946 >> 32), (int) class211.field3946 };
                class81.field1564.method1230((byte) -89, 10);
                class81.field1564.method1229((byte) -100, var6[0]);
                class81.field1564.method1229((byte) -68, var6[1]);
                class81.field1564.method1229((byte) -117, var6[2]);
                class81.field1564.method1229((byte) -68, var6[3]);
                class81.field1564.method1232(class232.field4286.method1137(76), (byte) 124);
                class81.field1564.method1212((byte) 0, class232.field4278);
                class81.field1564.method1220((byte) 115, class205.field3821, class62.field1313);
                class108.field2016.field3432 = 0;
                if (~class80.field1545 == -41) {
                    class108.field2016.method1230((byte) -110, 18);
                } else {
                    class108.field2016.method1230((byte) -122, 16);
                }
                class108.field2016.method1230((byte) -48, class81.field1564.field3432 + 129 - -class192.method1290(class73.field1432, (byte) -124));
                class108.field2016.method1229((byte) -66, 497);
                class108.field2016.method1230((byte) -77, class180.field3307 ? 1 : 0);
                class124.method785(arg0 + -200, class108.field2016);
                class108.field2016.method1212((byte) 0, class73.field1432);
                class108.field2016.method1229((byte) -93, class151.field2730);
                class108.field2016.method1229((byte) -98, class18.field475.field1112);
                class108.field2016.method1229((byte) -81, class80.field1539.field1112);
                class108.field2016.method1229((byte) -64, class227.field4192.field1112);
                class108.field2016.method1229((byte) -81, class50.field1070.field1112);
                class108.field2016.method1229((byte) -108, class157.field2850.field1112);
                class108.field2016.method1229((byte) -123, class34.field753.field1112);
                class108.field2016.method1229((byte) -87, class179.field3251.field1112);
                class108.field2016.method1229((byte) -86, class183.field3381.field1112);
                class108.field2016.method1229((byte) -76, class131.field2384.field1112);
                class108.field2016.method1229((byte) -111, class38.field822.field1112);
                class108.field2016.method1229((byte) -68, class223.field4108.field1112);
                class108.field2016.method1229((byte) -76, class144.field2634.field1112);
                class108.field2016.method1229((byte) -77, class237.field4380.field1112);
                class108.field2016.method1229((byte) -77, class86.field1648.field1112);
                class108.field2016.method1229((byte) -70, class48.field1033.field1112);
                class108.field2016.method1229((byte) -110, class123.field2275.field1112);
                class108.field2016.method1229((byte) -107, class50.field1083.field1112);
                class108.field2016.method1229((byte) -94, class25.field579.field1112);
                class108.field2016.method1229((byte) -128, class163.field2944.field1112);
                class108.field2016.method1229((byte) -128, class66.field1346.field1112);
                class108.field2016.method1229((byte) -122, class149.field2679.field1112);
                class108.field2016.method1229((byte) -85, class106.field1986.field1112);
                class108.field2016.method1229((byte) -67, class42.field904.field1112);
                class108.field2016.method1229((byte) -120, class112.field2101.field1112);
                class108.field2016.method1248(class81.field1564.field3397, 96, class81.field1564.field3432, 0);
                class199.field3714.method307(-72, 0, class108.field2016.field3397, class108.field2016.field3432);
                class81.field1564.method61(var6, true);
                for (int var7 = 0; ~var7 > -5; ++var7) {
                    var6[var7] += 50;
                }
                class36.field789.method61(var6, true);
                class239.field4406 = 6;
            }
            if (~class239.field4406 == -7 && class199.field3714.method305((byte) 70) > 0) {
                int var8 = class199.field3714.method309((byte) 42);
                if (var8 == 21 && ~class80.field1545 == -21) {
                    class239.field4406 = 7;
                } else if (var8 == 2) {
                    class239.field4406 = 9;
                } else {
                    if (~var8 == -16 && class80.field1545 == 40) {
                        class54.method379(arg0 + -199);
                        return;
                    }
                    if (var8 != 23 || ~class167.field3016 <= -2) {
                        class16.method126(var8, arg0 + -27157);
                        return;
                    }
                    class239.field4406 = 0;
                    ++class167.field3016;
                }
            }
            if (class239.field4406 == 7 && ~class199.field3714.method305((byte) 90) < -1) {
                class211.field3947 = class199.field3714.method309((byte) 114) * 60 - -180;
                class239.field4406 = 8;
            }
            if (class239.field4406 == 8) {
                class201.field3732 = 0;
                class105.method688(class135.field2498, class78.method502((byte) -115, new class179[] { class148.method949((byte) -14, class211.field3947 / 60), class44.field955 }), class66.field1345, (byte) 34);
                if (~(--class211.field3947) >= -1) {
                    class239.field4406 = 0;
                }
            } else {
                if (~class239.field4406 == -10 && class199.field3714.method305((byte) 113) >= 9) {
                    class178.field3233 = class199.field3714.method309((byte) 25);
                    class172.field3088 = class199.field3714.method309((byte) -41);
                    class221.field4080 = class199.field3714.method309((byte) -128) == 1;
                    class159.field2871 = class199.field3714.method309((byte) 80);
                    class159.field2871 <<= 8;
                    class159.field2871 += class199.field3714.method309((byte) 38);
                    class132.field2394 = class199.field3714.method309((byte) -128);
                    class199.field3714.method311((byte) -80, class36.field789.field3397, 0, 1);
                    class36.field789.field3432 = 0;
                    class169.field3043 = class36.field789.method64(116);
                    class199.field3714.method311((byte) -78, class36.field789.field3397, 0, 2);
                    class36.field789.field3432 = 0;
                    class150.field2705 = class36.field789.method1252(2);
                    class239.field4406 = 10;
                }
                if (~class239.field4406 == -11) {
                    if (~class199.field3714.method305((byte) 124) <= ~class150.field2705) {
                        class36.field789.field3432 = 0;
                        class199.field3714.method311((byte) -111, class36.field789.field3397, 0, class150.field2705);
                        class177.method1118((byte) -67);
                        class2.field35 = -1;
                        class18.method135(105, false);
                        class169.field3043 = -1;
                    }
                } else {
                    ++class201.field3732;
                    if (class201.field3732 > 2000) {
                        if (class167.field3016 < 1) {
                            class239.field4406 = 0;
                            if (class234.field4316 == class109.field2050) {
                                class234.field4316 = class93.field1764;
                            } else {
                                class234.field4316 = class109.field2050;
                            }
                            ++class167.field3016;
                        } else {
                            class16.method126(-3, arg0 + -27157);
                        }
                    }
                }
            }
        } catch (IOException var9) {
            if (class167.field3016 < 1) {
                ++class167.field3016;
                if (~class234.field4316 == ~class109.field2050) {
                    class234.field4316 = class93.field1764;
                } else {
                    class234.field4316 = class109.field2050;
                }
                class239.field4406 = 0;
            } else {
                class16.method126(-2, arg0 ^ -27013);
            }
        }
    }
}
