import java.awt.Component;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.OptionalDataException;
import java.io.StreamCorruptedException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ec")
public class class32 {

    @OriginalMember(owner = "client!ec", name = "n", descriptor = "[[I")
    private int[][] field941;

    @OriginalMember(owner = "client!ec", name = "q", descriptor = "I")
    private int field944;

    @OriginalMember(owner = "client!ec", name = "f", descriptor = "I")
    private int field933;

    @OriginalMember(owner = "client!ec", name = "d", descriptor = "Lwd;")
    public static class150 field931 = class2.method9(true, "Bitte laden Sie die Seite neu)3");

    @OriginalMember(owner = "client!ec", name = "g", descriptor = "I")
    public static int field934 = -1;

    @OriginalMember(owner = "client!ec", name = "e", descriptor = "I")
    public static int field932 = 0;

    @OriginalMember(owner = "client!ec", name = "o", descriptor = "I")
    public static int field942 = 0;

    @OriginalMember(owner = "client!ec", name = "k", descriptor = "Lwd;")
    public static class150 field938 = class2.method9(true, " steht bereits auf Ihrer Freunde)2Liste(Q");

    @OriginalMember(owner = "client!ec", name = "p", descriptor = "I")
    public static int field943 = 0;

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "I")
    public static int field928;

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "I")
    public static int field929;

    @OriginalMember(owner = "client!ec", name = "c", descriptor = "I")
    public static int field930;

    @OriginalMember(owner = "client!ec", name = "h", descriptor = "I")
    public static int field935;

    @OriginalMember(owner = "client!ec", name = "i", descriptor = "I")
    public static int field936;

    @OriginalMember(owner = "client!ec", name = "l", descriptor = "I")
    public static int field939;

    @OriginalMember(owner = "client!ec", name = "m", descriptor = "I")
    public static int field940;

    @OriginalMember(owner = "client!ec", name = "r", descriptor = "I")
    public static int field945;

    @OriginalMember(owner = "client!ec", name = "s", descriptor = "I")
    public static int field946;

    @OriginalMember(owner = "client!ec", name = "t", descriptor = "I")
    public static int field947;

    @OriginalMember(owner = "client!ec", name = "j", descriptor = "[Lqd;")
    public static class114[] field937;

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(BI)I")
    public final int method252(byte arg0, int arg1) {
        if (this.field941 != null) {
            arg1 = (int) ((long) this.field944 * (long) arg1 / (long) this.field933) + 6;
        }
        if (arg0 > -1) {
            this.method252((byte) -115, 14);
        }
        field947++;
        return arg1;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(BIIILce;IZ)V")
    public static final void method253(byte arg0, int arg1, int arg2, int arg3, class20 arg4, int arg5, boolean arg6) {
        field946++;
        long var7 = (long) ((arg2 << 16) + arg1);
        if (arg3 != 25341) {
            field934 = 17;
        }
        class126 var9 = (class126) class43.field1182.method534((byte) -108, var7);
        if (var9 != null) {
            return;
        }
        class126 var10 = (class126) class131.field3081.method534((byte) -84, var7);
        if (var10 != null) {
            return;
        }
        class126 var11 = (class126) class50.field1332.method534((byte) -128, var7);
        if (var11 == null) {
            if (!arg6) {
                class126 var12 = (class126) class22.field645.method534((byte) -118, var7);
                if (var12 != null) {
                    return;
                }
            }
            class126 var13 = new class126();
            var13.field2918 = arg5;
            var13.field2907 = arg0;
            var13.field2924 = arg4;
            if (arg6) {
                class43.field1182.method541(var13, var7, false);
                class63.field1622++;
            } else {
                class134.field3148.method1005(124, var13);
                class50.field1332.method541(var13, var7, false);
                class66.field1684++;
            }
        } else if (arg6) {
            var11.method996(-3);
            class43.field1182.method541(var11, var7, false);
            class63.field1622++;
            class66.field1684--;
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(Z)V")
    public static final void method254(boolean arg0) {
        class15.field405.method354((byte) 34);
        for (int var1 = 0; var1 < 32; var1++) {
            class104.field2348[var1] = 0L;
        }
        field935++;
        for (int var2 = 0; var2 < 32; var2++) {
            class50.field1355[var2] = 0L;
        }
        class106.field2399 = 0;
        if (arg0) {
            method253((byte) -33, 80, 97, -2, null, 91, false);
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(Ljava/awt/Component;B)V")
    public static final void method255(Component arg0, byte arg1) {
        field945++;
        Method var2 = class139.field3251;
        if (var2 != null) {
            try {
                var2.invoke(arg0, Boolean.FALSE);
            } catch (Throwable var3) {
            }
        }
        if (arg1 <= 118) {
            field937 = null;
        }
        arg0.addKeyListener(class5.field92);
        arg0.addFocusListener(class5.field92);
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(IBLt;)V")
    public static final void method256(int arg0, byte arg1, class128 arg2) {
        field930++;
        int var3 = -29 / ((arg1 + 31) / 57);
        while (true) {
            class76 var4 = (class76) class63.field1627.method702((byte) -127);
            if (var4 == null) {
                return;
            }
            boolean var5 = false;
            for (int var6 = 0; var6 < var4.field1879; var6++) {
                if (var4.field1880[var6] != null) {
                    if (var4.field1880[var6].field2281 == 2) {
                        var4.field1891[var6] = -5;
                    }
                    if (var4.field1880[var6].field2281 == 0) {
                        var5 = true;
                    }
                }
                if (var4.field1886[var6] != null) {
                    if (var4.field1886[var6].field2281 == 2) {
                        var4.field1891[var6] = -6;
                    }
                    if (var4.field1886[var6].field2281 == 0) {
                        var5 = true;
                    }
                }
            }
            if (var5) {
                return;
            }
            arg2.method965(true, arg0);
            arg2.method1126(31159, 0);
            int var7 = arg2.field3601;
            arg2.method1122((byte) 32, var4.field1885);
            for (int var8 = 0; var8 < var4.field1879; var8++) {
                if (var4.field1891[var8] == 0) {
                    try {
                        int var9 = var4.field1878[var8];
                        if (var9 == 0) {
                            Field var13 = (Field) var4.field1880[var8].field2282;
                            int var14 = var13.getInt(null);
                            arg2.method1126(31159, 0);
                            arg2.method1122((byte) 32, var14);
                        } else if (var9 == 1) {
                            Field var10 = (Field) var4.field1880[var8].field2282;
                            var10.setInt(null, var4.field1871[var8]);
                            arg2.method1126(31159, 0);
                        } else if (var9 == 2) {
                            Field var11 = (Field) var4.field1880[var8].field2282;
                            int var12 = var11.getModifiers();
                            arg2.method1126(31159, 0);
                            arg2.method1122((byte) 32, var12);
                        }
                        if (var9 == 3) {
                            Method var17 = (Method) var4.field1886[var8].field2282;
                            byte[][] var18 = var4.field1881[var8];
                            Object[] var19 = new Object[var18.length];
                            for (int var20 = 0; var20 < var18.length; var20++) {
                                ObjectInputStream var21 = new ObjectInputStream(new ByteArrayInputStream(var18[var20]));
                                var19[var20] = var21.readObject();
                            }
                            Object var22 = var17.invoke(null, var19);
                            if (var22 == null) {
                                arg2.method1126(31159, 0);
                            } else if (var22 instanceof Number) {
                                arg2.method1126(31159, 1);
                                arg2.method1129(((Number) var22).longValue(), false);
                            } else if (var22 instanceof class150) {
                                arg2.method1126(31159, 2);
                                arg2.method1111((class150) var22, 0);
                            } else {
                                arg2.method1126(31159, 4);
                            }
                        } else if (var9 == 4) {
                            Method var15 = (Method) var4.field1886[var8].field2282;
                            int var16 = var15.getModifiers();
                            arg2.method1126(31159, 0);
                            arg2.method1122((byte) 32, var16);
                        }
                    } catch (ClassNotFoundException var23) {
                        arg2.method1126(31159, -10);
                    } catch (InvalidClassException var24) {
                        arg2.method1126(31159, -11);
                    } catch (StreamCorruptedException var25) {
                        arg2.method1126(31159, -12);
                    } catch (OptionalDataException var26) {
                        arg2.method1126(31159, -13);
                    } catch (IllegalAccessException var27) {
                        arg2.method1126(31159, -14);
                    } catch (IllegalArgumentException var28) {
                        arg2.method1126(31159, -15);
                    } catch (InvocationTargetException var29) {
                        arg2.method1126(31159, -16);
                    } catch (SecurityException var30) {
                        arg2.method1126(31159, -17);
                    } catch (IOException var31) {
                        arg2.method1126(31159, -18);
                    } catch (NullPointerException var32) {
                        arg2.method1126(31159, -19);
                    } catch (Exception var33) {
                        arg2.method1126(31159, -20);
                    } catch (Throwable var34) {
                        arg2.method1126(31159, -21);
                    }
                } else {
                    arg2.method1126(31159, var4.field1891[var8]);
                }
            }
            arg2.method1109(var7, -34);
            arg2.method1125(-1, arg2.field3601 - var7);
            var4.method678((byte) -26);
        }
    }

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "(Z)V")
    public static void method257(boolean arg0) {
        if (arg0) {
            field934 = -122;
        }
        field938 = null;
        field931 = null;
        field937 = null;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(II)I")
    public final int method258(int arg0, int arg1) {
        field936++;
        int var3 = -112 % ((74 - arg0) / 47);
        if (this.field941 != null) {
            arg1 = (int) ((long) this.field944 * (long) arg1 / (long) this.field933);
        }
        return arg1;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(I)V")
    public static final void method259(int arg0) {
        class41.method294(-2607);
        field939++;
        class91.field2130 = true;
        class12.method78(true);
        int var1 = 4 / ((arg0 - 56) / 58);
        if (class118.field2702 != -1) {
            boolean var3 = class148.method1135(0, class118.field2702, (byte) 117, 190, 1, 0, 261);
            if (!var3) {
                class82.field1972 = true;
            }
        } else if (class42.field1111[class24.field695] != -1) {
            boolean var2 = class148.method1135(0, class42.field1111[class24.field695], (byte) 120, 190, 1, 0, 261);
            if (!var2) {
                class82.field1972 = true;
            }
        }
        if (class145.field3517 && class12.field305 == 1) {
            if (class96.field2218 == 1) {
                class20.method139(108);
            } else {
                class135.method1004(-74);
            }
        }
        class109.method780(89);
    }

    @OriginalMember(owner = "client!ec", name = "<init>", descriptor = "(II)V")
    public class32(int arg0, int arg1) {
        if (arg0 != arg1) {
            int var3 = class142.method1071((byte) 19, arg1, arg0);
            int var4 = arg1 / var3;
            int var5 = arg0 / var3;
            this.field941 = new int[var5][14];
            this.field944 = var4;
            this.field933 = var5;
            for (int var6 = 0; var6 < var5; var6++) {
                double var7 = (double) var6 / (double) var5 + 6.0D;
                int[] var9 = this.field941[var6];
                int var10 = (int) Math.floor(var7 + 1.0D - 7.0D);
                int var11 = (int) Math.ceil(var7 + 7.0D);
                double var12 = (double) var4 / (double) var5;
                if (var10 < 0) {
                    var10 = 0;
                }
                if (var11 > 14) {
                    var11 = 14;
                }
                while (var11 > var10) {
                    double var14 = var12;
                    double var16 = ((double) var10 - var7) * 3.141592653589793D;
                    if (var16 < -1.0E-4D || var16 > 1.0E-4D) {
                        var14 = var12 * (Math.sin(var16) / var16);
                    }
                    double var18 = var14 * (Math.cos(((double) var10 - var7) * 0.2243994752564138D) * 0.46D + 0.54D);
                    var9[var10] = (int) Math.floor(var18 * 65536.0D + 0.5D);
                    var10++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "([BI)[B")
    public final byte[] method260(byte[] arg0, int arg1) {
        if (this.field941 != null) {
            int var3 = (int) ((long) arg0.length * (long) this.field944 / (long) this.field933) + 14;
            int[] var4 = new int[var3];
            int var5 = 0;
            int var6 = 0;
            for (int var7 = 0; var7 < arg0.length; var7++) {
                byte var10 = arg0[var7];
                int[] var11 = this.field941[var6];
                for (int var12 = 0; var12 < 14; var12++) {
                    var4[var5 + var12] += var11[var12] * var10;
                }
                int var13 = this.field944 + var6;
                int var14 = var13 / this.field933;
                var5 += var14;
                var6 = var13 - this.field933 * var14;
            }
            arg0 = new byte[var3];
            for (int var8 = 0; var8 < var3; var8++) {
                int var9 = var4[var8] + 32768 >> 16;
                if (var9 < -128) {
                    arg0[var8] = -128;
                } else if (var9 <= 127) {
                    arg0[var8] = (byte) var9;
                } else {
                    arg0[var8] = 127;
                }
            }
        }
        if (arg1 <= 48) {
            field931 = null;
        }
        field940++;
        return arg0;
    }
}
