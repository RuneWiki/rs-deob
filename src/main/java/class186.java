import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.OptionalDataException;
import java.io.StreamCorruptedException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ue")
public class class186 extends class27 {

    @OriginalMember(owner = "client!ue", name = "T", descriptor = "I")
    private int field3655 = 4;

    @OriginalMember(owner = "client!ue", name = "cb", descriptor = "I")
    private int field3664 = 4;

    @OriginalMember(owner = "client!ue", name = "fb", descriptor = "[I")
    private int[] field3667 = new int[512];

    @OriginalMember(owner = "client!ue", name = "gb", descriptor = "I")
    private int field3668 = 1638;

    @OriginalMember(owner = "client!ue", name = "db", descriptor = "I")
    private int field3665 = 4;

    @OriginalMember(owner = "client!ue", name = "Q", descriptor = "Z")
    private boolean field3652 = true;

    @OriginalMember(owner = "client!ue", name = "O", descriptor = "I")
    private int field3650 = 0;

    @OriginalMember(owner = "client!ue", name = "N", descriptor = "Lkb;")
    public static class93 field3649 = class76.method390("nav", 0);

    @OriginalMember(owner = "client!ue", name = "bb", descriptor = "Z")
    public static boolean field3663 = false;

    @OriginalMember(owner = "client!ue", name = "jb", descriptor = "Lkb;")
    public static class93 field3671 = class76.method390("Bitte benutzen Sie eine andere Welt)3", 0);

    @OriginalMember(owner = "client!ue", name = "M", descriptor = "I")
    public static int field3648;

    @OriginalMember(owner = "client!ue", name = "P", descriptor = "I")
    public static int field3651;

    @OriginalMember(owner = "client!ue", name = "S", descriptor = "I")
    public static int field3654;

    @OriginalMember(owner = "client!ue", name = "U", descriptor = "I")
    public static int field3656;

    @OriginalMember(owner = "client!ue", name = "V", descriptor = "I")
    public static int field3657;

    @OriginalMember(owner = "client!ue", name = "W", descriptor = "I")
    public static int field3658;

    @OriginalMember(owner = "client!ue", name = "X", descriptor = "I")
    public static int field3659;

    @OriginalMember(owner = "client!ue", name = "Y", descriptor = "I")
    public static int field3660;

    @OriginalMember(owner = "client!ue", name = "ab", descriptor = "I")
    public static int field3662;

    @OriginalMember(owner = "client!ue", name = "hb", descriptor = "I")
    public static int field3669;

    @OriginalMember(owner = "client!ue", name = "ib", descriptor = "I")
    public static int field3670;

    @OriginalMember(owner = "client!ue", name = "kb", descriptor = "I")
    public static int field3672;

    @OriginalMember(owner = "client!ue", name = "R", descriptor = "[I")
    private int[] field3653;

    @OriginalMember(owner = "client!ue", name = "Z", descriptor = "[I")
    private int[] field3661;

    @OriginalMember(owner = "client!ue", name = "eb", descriptor = "[Lna;")
    public static class119[] field3666;

    @OriginalMember(owner = "client!ue", name = "d", descriptor = "(I)V")
    public static final void method1211(int arg0) {
        ++field3669;
        class35.method195(37);
        class144.method899((byte) 124);
        class50.method264(960816300);
        class142.method891(279);
        class153.method957((byte) 125);
        class9.method52(true);
        class98.method551(0);
        class171.method1147((byte) -101);
        int var1 = 100 % ((arg0 - -40) / 63);
        class92.method480((byte) -13);
        class3.method17(-118);
        class24.method140(0);
        class172.method1152((byte) -104);
        ((class200) class150.field2894).method1310(true);
        class23.field350.method676(30626);
        class110.field1987.method465(true);
        class203.field3929.method465(true);
        class181.field3586.method465(true);
        class76.field1375.method465(true);
        class61.field974.method465(true);
        class63.field1000.method465(true);
        class26.field398.method465(true);
        class206.field4030.method465(true);
        class66.field1183.method465(true);
        class104.field1921.method465(true);
        class174.field3445.method465(true);
    }

    @OriginalMember(owner = "client!ue", name = "e", descriptor = "(I)V")
    private final void method1212(int arg0) {
        Random var2 = new Random((long) this.field3650);
        for (int var3 = 0; var3 < 255; ++var3) {
            this.field3667[var3] = -1;
        }
        if (arg0 != -1) {
            method1217(83);
        }
        for (int var4 = 0; ~var4 > -256; ++var4) {
            int var5;
            do {
                var5 = class64.method327(255, var2, arg0 ^ -10094);
            } while (~this.field3667[var5] != 0);
            this.field3667[var5 - -255] = this.field3667[var5] = var4;
        }
        ++field3658;
    }

    @OriginalMember(owner = "client!ue", name = "<init>", descriptor = "()V")
    public class186() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ue", name = "d", descriptor = "(B)V")
    private final void method1213(byte arg0) {
        if (arg0 == -22) {
            if (~this.field3668 < -1) {
                this.field3653 = new int[this.field3655];
                this.field3661 = new int[this.field3655];
                for (int var2 = 0; ~this.field3655 < ~var2; ++var2) {
                    this.field3653[var2] = (int) (Math.pow((double) (this.field3668 / 4096), (double) var2) * 4096.0D);
                    this.field3661[var2] = (int) (4096.0D * Math.pow(2.0D, (double) var2));
                }
            } else if (this.field3653 != null && ~this.field3653.length == ~this.field3655) {
                this.field3661 = new int[this.field3655];
                for (int var3 = 0; this.field3655 > var3; ++var3) {
                    this.field3661[var3] = (int) (4096.0D * Math.pow(2.0D, (double) var3));
                }
            }
            ++field3660;
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(IZ)[I")
    public final int[] method55(int arg0, boolean arg1) {
        ++field3648;
        int[] var3 = super.field447.method1238(arg1, arg0);
        if (super.field447.field3737) {
            int var4 = this.field3665 << 12;
            int var5 = class142.field2781[arg0] * this.field3664;
            int var6 = this.field3664 << 12;
            for (int var7 = 0; var7 < class159.field3209; ++var7) {
                int var8 = 0;
                int var9 = class97.field1808[var7] * this.field3665;
                for (int var10 = 0; this.field3655 > var10; ++var10) {
                    int var11 = this.field3661[var10];
                    int var12 = this.field3653[var10];
                    int var13 = this.method1216((byte) 125, var6 * var11 >> 12, var9 * var11 >> 12, var4 * var11 >> 12, var5 * var11 >> 12);
                    var8 += var12 * var13 >> 12;
                }
                if (this.field3652) {
                    var8 = (var8 >> 1) + 2048;
                }
                var3[var7] = var8;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(ILag;I)V")
    public static final void method1214(int arg0, class8 arg1, int arg2) {
        ++field3656;
        if (arg0 != 0) {
            method1211(69);
        }
        while (true) {
            class29 var3 = (class29) class165.field3262.method692(false);
            if (var3 == null) {
                return;
            }
            boolean var4 = false;
            for (int var5 = 0; ~var3.field477 < ~var5; ++var5) {
                if (var3.field481[var5] != null) {
                    if (var3.field481[var5].field344 == 2) {
                        var3.field476[var5] = -5;
                    }
                    if (~var3.field481[var5].field344 == -1) {
                        var4 = true;
                    }
                }
                if (var3.field471[var5] != null) {
                    if (var3.field471[var5].field344 == 2) {
                        var3.field476[var5] = -6;
                    }
                    if (~var3.field471[var5].field344 == -1) {
                        var4 = true;
                    }
                }
            }
            if (var4) {
                return;
            }
            arg1.method47(arg2, 8);
            arg1.method1069(0, (byte) -26);
            int var6 = arg1.field3153;
            arg1.method1051(true, var3.field469);
            for (int var7 = 0; ~var7 > ~var3.field477; ++var7) {
                if (~var3.field476[var7] != -1) {
                    arg1.method1069(var3.field476[var7], (byte) -26);
                } else {
                    try {
                        int var8 = var3.field473[var7];
                        if (~var8 == -1) {
                            Field var9 = (Field) var3.field481[var7].field342;
                            int var10 = var9.getInt((Object) null);
                            arg1.method1069(0, (byte) -26);
                            arg1.method1051(true, var10);
                        } else if (var8 != 1) {
                            if (~var8 == -3) {
                                Field var11 = (Field) var3.field481[var7].field342;
                                int var12 = var11.getModifiers();
                                arg1.method1069(0, (byte) -26);
                                arg1.method1051(true, var12);
                            }
                        } else {
                            Field var13 = (Field) var3.field481[var7].field342;
                            var13.setInt((Object) null, var3.field478[var7]);
                            arg1.method1069(0, (byte) -26);
                        }
                        if (~var8 != -4) {
                            if (var8 == 4) {
                                Method var14 = (Method) var3.field471[var7].field342;
                                int var15 = var14.getModifiers();
                                arg1.method1069(0, (byte) -26);
                                arg1.method1051(true, var15);
                            }
                        } else {
                            Method var16 = (Method) var3.field471[var7].field342;
                            byte[][] var17 = var3.field480[var7];
                            Object[] var18 = new Object[var17.length];
                            for (int var19 = 0; ~var19 > ~var17.length; ++var19) {
                                ObjectInputStream var20 = new ObjectInputStream(new ByteArrayInputStream(var17[var19]));
                                var18[var19] = var20.readObject();
                            }
                            Object var21 = var16.invoke((Object) null, var18);
                            if (var21 == null) {
                                arg1.method1069(0, (byte) -26);
                            } else if (!(var21 instanceof Number)) {
                                if (var21 instanceof class93) {
                                    arg1.method1069(2, (byte) -26);
                                    arg1.method1052((byte) 70, (class93) var21);
                                } else {
                                    arg1.method1069(4, (byte) -26);
                                }
                            } else {
                                arg1.method1069(1, (byte) -26);
                                arg1.method1064(((Number) var21).longValue(), -1);
                            }
                        }
                    } catch (ClassNotFoundException var22) {
                        arg1.method1069(-10, (byte) -26);
                    } catch (InvalidClassException var23) {
                        arg1.method1069(-11, (byte) -26);
                    } catch (StreamCorruptedException var24) {
                        arg1.method1069(-12, (byte) -26);
                    } catch (OptionalDataException var25) {
                        arg1.method1069(-13, (byte) -26);
                    } catch (IllegalAccessException var26) {
                        arg1.method1069(-14, (byte) -26);
                    } catch (IllegalArgumentException var27) {
                        arg1.method1069(-15, (byte) -26);
                    } catch (InvocationTargetException var28) {
                        arg1.method1069(-16, (byte) -26);
                    } catch (SecurityException var29) {
                        arg1.method1069(-17, (byte) -26);
                    } catch (IOException var30) {
                        arg1.method1069(-18, (byte) -26);
                    } catch (NullPointerException var31) {
                        arg1.method1069(-19, (byte) -26);
                    } catch (Exception var32) {
                        arg1.method1069(-20, (byte) -26);
                    } catch (Throwable var33) {
                        arg1.method1069(-21, (byte) -26);
                    }
                }
            }
            arg1.method1058(var6, false);
            arg1.method1085(-110, -var6 + arg1.field3153);
            var3.method235(false);
        }
    }

    @OriginalMember(owner = "client!ue", name = "c", descriptor = "(B)V")
    public final void method154(byte arg0) {
        ++field3662;
        this.method1212(-1);
        this.method1213((byte) -22);
        if (arg0 <= 77) {
            this.method154((byte) -34);
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(IIIIZI)Lob;")
    public static final class129 method1215(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        ++field3651;
        long var6 = ((long) arg3 << 38) + ((long) arg5 << 16) + (long) arg2 - -((long) arg0 << 40);
        if (!arg4) {
            class129 var8 = (class129) class76.field1376.method680(var6, (byte) -28);
            if (var8 != null) {
                return var8;
            }
        }
        class166 var9 = class166.method1126(-24, arg2);
        if (~arg5 < -2 && var9.field3319 != null) {
            int var10 = -1;
            for (int var11 = 0; ~var11 > -11; ++var11) {
                if (arg5 >= var9.field3311[var11] && ~var9.field3311[var11] != -1) {
                    var10 = var9.field3319[var11];
                }
            }
            if (~var10 != 0) {
                var9 = class166.method1126(107, var10);
            }
        }
        class125 var12 = var9.method1118((byte) -70);
        if (var12 == null) {
            return null;
        } else {
            class129 var13 = null;
            if (var9.field3302 != -1) {
                var13 = method1215(0, 9, var9.field3301, 1, true, 10);
                if (var13 == null) {
                    return null;
                }
            }
            int[] var14 = class118.field2204;
            int var15 = class118.field2202;
            int var16 = class118.field2201;
            int[] var17 = new int[4];
            class118.method663(var17);
            class129 var18 = new class129(36, 32);
            class118.method667(var18.field2450, 36, 32);
            class118.method662();
            class150.method918();
            class150.method921(16, 16);
            class150.field2889 = false;
            int var19 = var9.field3267;
            if (!arg4) {
                if (arg3 == 2) {
                    var19 = (int) ((double) var19 * 1.04D);
                }
            } else {
                var19 = (int) ((double) var19 * 1.5D);
            }
            int var20 = class150.field2888[var9.field3287] * var19 >> 16;
            int var21 = class150.field2896[var9.field3287] * var19 >> 16;
            var12.method269();
            var12.method272(0, var9.field3286, var9.field3276, var9.field3287, var9.field3316, var21 - var12.field73 / 2 + var9.field3273, var9.field3273 + var20);
            if (arg1 != 9) {
                field3671 = null;
            }
            if (arg3 >= 1) {
                var18.method756(1);
            }
            if (arg3 >= 2) {
                var18.method756(16777215);
            }
            if (~arg0 != -1) {
                var18.method753(arg0);
            }
            class118.method667(var18.field2450, 36, 32);
            if (var9.field3302 != -1) {
                var13.method737(0, 0);
            }
            if (!arg4 && (var9.field3288 == 1 || arg5 != 1) && arg5 != -1) {
                class9.field144.method1013(class25.method141(95, arg5), 0, 9, 16776960, 1);
            }
            if (!arg4) {
                class76.field1376.method678(true, var18, var6);
            }
            class118.method667(var14, var15, var16);
            class118.method665(var17);
            class150.method918();
            class150.field2889 = true;
            return var18;
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(BIIII)I")
    private final int method1216(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field3657;
        int var6 = -4096 & arg2;
        int var7 = arg2 - var6;
        int var8 = var6 >> 12;
        int var9 = var8 + 1;
        int var10 = var8 & 255;
        int var11 = -4096 & arg4;
        int var12 = arg4 - var11;
        int var13 = var11 >> 12;
        int var14 = var13 - -1;
        int var15 = -23 / ((arg0 - 88) / 32);
        int var16 = var13 & 255;
        int var17 = arg1 & -4096;
        if (~var14 <= ~(var17 >> 12)) {
            var14 = 0;
        }
        int var18 = -4096 & arg3;
        if (~(var18 >> 12) >= ~var9) {
            var9 = 0;
        }
        int var19 = this.field3667[this.field3667[var16] + var10] % 4;
        int var20 = var14 & 255;
        int var21 = var9 & 255;
        int var22 = this.field3667[this.field3667[var16] + var21] % 4;
        int var23 = this.field3667[this.field3667[var20] + var21] % 4;
        int var24 = this.field3667[this.field3667[var20] + var10] % 4;
        int var25 = class71.method375((byte) -79, var12, var7, class39.field648[var19]);
        int var26 = class71.method375((byte) -79, var12, var7 + -4096, class39.field648[var22]);
        int var27 = class71.method375((byte) -79, var12 - 4096, var7, class39.field648[var24]);
        int var28 = class71.method375((byte) -79, var12 - 4096, var7 + -4096, class39.field648[var23]);
        int var29 = class165.method1113(true, var7);
        int var30 = class165.method1113(true, var12);
        int var31 = class7.method37(var26, 1, var25, var29);
        int var32 = class7.method37(var28, 1, var27, var29);
        return class7.method37(var32, 1, var31, var30);
    }

    @OriginalMember(owner = "client!ue", name = "f", descriptor = "(I)V")
    public static void method1217(int arg0) {
        field3666 = null;
        field3649 = null;
        field3671 = null;
        if (arg0 != -4096) {
            field3663 = false;
        }
    }

    @OriginalMember(owner = "client!ue", name = "b", descriptor = "(III)I")
    public static final int method1218(int arg0, int arg1, int arg2) {
        int var3 = arg1 >>> 31;
        ++field3670;
        if (arg0 <= 122) {
            field3671 = null;
        }
        return (arg1 + var3) / arg2 - var3;
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(BILrd;)V")
    public final void method15(byte arg0, int arg1, class158 arg2) {
        if (~arg1 != -1) {
            if (~arg1 != -2) {
                if (~arg1 != -3) {
                    if (arg1 != 3) {
                        if (arg1 != 4) {
                            if (~arg1 != -6) {
                                if (arg1 == 6) {
                                    this.field3664 = arg2.method1054(128);
                                }
                            } else {
                                this.field3665 = arg2.method1054(128);
                            }
                        } else {
                            this.field3650 = arg2.method1054(128);
                        }
                    } else {
                        this.field3665 = this.field3664 = arg2.method1054(128);
                    }
                } else {
                    this.field3668 = arg2.method1083(true);
                    if (~this.field3668 > -1) {
                        this.field3653 = new int[this.field3655];
                        for (int var5 = 0; this.field3655 > var5; ++var5) {
                            this.field3653[var5] = arg2.method1083(true);
                        }
                    }
                }
            } else {
                this.field3655 = arg2.method1054(128);
            }
        } else {
            this.field3652 = ~arg2.method1054(128) == -2;
        }
        if (arg0 < 106) {
            this.field3667 = null;
        }
        ++field3659;
    }
}
