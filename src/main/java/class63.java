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

@OriginalClass("client!k")
public class class63 extends class99 {

    @OriginalMember(owner = "client!k", name = "mb", descriptor = "I")
    public int field1535 = 0;

    @OriginalMember(owner = "client!k", name = "qb", descriptor = "Z")
    public boolean field1539 = true;

    @OriginalMember(owner = "client!k", name = "tb", descriptor = "I")
    public int field1542 = -1;

    @OriginalMember(owner = "client!k", name = "Gb", descriptor = "I")
    public int field1555 = -1;

    @OriginalMember(owner = "client!k", name = "db", descriptor = "I")
    public static int field1526 = 0;

    @OriginalMember(owner = "client!k", name = "vb", descriptor = "Lpd;")
    public static class94 field1544 = class28.method249(49, "Anmelde)2Limit -Uberschritten)3");

    @OriginalMember(owner = "client!k", name = "Cb", descriptor = "Lpd;")
    public static class94 field1551 = class28.method249(120, "Offline");

    @OriginalMember(owner = "client!k", name = "zb", descriptor = "[I")
    public static int[] field1548 = new int[100];

    @OriginalMember(owner = "client!k", name = "Fb", descriptor = "[J")
    public static long[] field1554 = new long[32];

    @OriginalMember(owner = "client!k", name = "jb", descriptor = "Z")
    public static boolean field1532 = false;

    @OriginalMember(owner = "client!k", name = "Ab", descriptor = "Lpd;")
    private static class94 field1549 = class28.method249(-55, "Click to continue");

    @OriginalMember(owner = "client!k", name = "Ib", descriptor = "Lpd;")
    public static class94 field1557 = class28.method249(-74, "Diese Welt ist voll)3");

    @OriginalMember(owner = "client!k", name = "Kb", descriptor = "Lpd;")
    private static class94 field1559 = class28.method249(-106, "Loading ignore list");

    @OriginalMember(owner = "client!k", name = "Hb", descriptor = "Lpd;")
    public static class94 field1556 = field1549;

    @OriginalMember(owner = "client!k", name = "Lb", descriptor = "Lpd;")
    public static class94 field1560 = field1559;

    @OriginalMember(owner = "client!k", name = "Eb", descriptor = "I")
    public static int field1553 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "client!k", name = "O", descriptor = "I")
    public static int field1525;

    @OriginalMember(owner = "client!k", name = "eb", descriptor = "I")
    public static int field1527;

    @OriginalMember(owner = "client!k", name = "fb", descriptor = "I")
    public static int field1528;

    @OriginalMember(owner = "client!k", name = "gb", descriptor = "I")
    public static int field1529;

    @OriginalMember(owner = "client!k", name = "hb", descriptor = "I")
    public int field1530;

    @OriginalMember(owner = "client!k", name = "ib", descriptor = "I")
    public static int field1531;

    @OriginalMember(owner = "client!k", name = "kb", descriptor = "I")
    public static int field1533;

    @OriginalMember(owner = "client!k", name = "lb", descriptor = "I")
    public static int field1534;

    @OriginalMember(owner = "client!k", name = "nb", descriptor = "I")
    public static int field1536;

    @OriginalMember(owner = "client!k", name = "ob", descriptor = "I")
    public int field1537;

    @OriginalMember(owner = "client!k", name = "pb", descriptor = "I")
    public int field1538;

    @OriginalMember(owner = "client!k", name = "rb", descriptor = "I")
    public static int field1540;

    @OriginalMember(owner = "client!k", name = "sb", descriptor = "I")
    public int field1541;

    @OriginalMember(owner = "client!k", name = "wb", descriptor = "I")
    public static int field1545;

    @OriginalMember(owner = "client!k", name = "xb", descriptor = "I")
    public static int field1546;

    @OriginalMember(owner = "client!k", name = "yb", descriptor = "I")
    public int field1547;

    @OriginalMember(owner = "client!k", name = "Db", descriptor = "I")
    public static int field1552;

    @OriginalMember(owner = "client!k", name = "Jb", descriptor = "I")
    public int field1558;

    @OriginalMember(owner = "client!k", name = "Bb", descriptor = "Ls;")
    public static class111 field1550;

    @OriginalMember(owner = "client!k", name = "ub", descriptor = "[I")
    public static int[] field1543;

    @OriginalMember(owner = "client!k", name = "Mb", descriptor = "[[B")
    public static byte[][] field1561;

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(BI)Lme;", line = 4)
    public static final class77 method466(byte arg0, int arg1) {
        field1546++;
        int var2 = arg1 >> 16;
        int var3 = arg1 & 0xFFFF;
        if (class108.field2673[var2] == null || class108.field2673[var2][var3] == null) {
            boolean var4 = class98.method741((byte) -89, var2);
            if (!var4) {
                return null;
            }
        }
        if (arg0 != -38) {
            method477(-94, true);
        }
        return class108.field2673[var2][var3];
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(IIZ)I", line = 31)
    public static final int method467(int arg0, int arg1, boolean arg2) {
        field1527++;
        if (!arg2) {
            return -58;
        }
        if (arg1 < arg0) {
            int var3 = arg1;
            arg1 = arg0;
            arg0 = var3;
        }
        while (arg0 != 0) {
            int var4 = arg1 % arg0;
            arg1 = arg0;
            arg0 = var4;
        }
        return arg1;
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(ILuc;BI)V", line = 63)
    private final void method468(int arg0, class122 arg1, byte arg2, int arg3) {
        if (arg2 >= -46) {
            method467(73, 71, false);
        }
        field1534++;
        if (arg3 == 1) {
            this.field1535 = arg1.method935((byte) -128);
        } else if (arg3 == 2) {
            this.field1542 = arg1.method943(-1025);
        } else if (arg3 == 5) {
            this.field1539 = false;
        } else if (arg3 == 7) {
            this.field1555 = arg1.method935((byte) -128);
        }
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(IBLuc;)V", line = 98)
    public final void method469(int arg0, byte arg1, class122 arg2) {
        field1545++;
        if (arg1 <= 103) {
            return;
        }
        while (true) {
            int var4 = arg2.method943(-1025);
            if (var4 == 0) {
                return;
            }
            this.method468(arg0, arg2, (byte) -47, var4);
        }
    }

    @OriginalMember(owner = "client!k", name = "c", descriptor = "(I)V", line = 130)
    public final void method470(int arg0) {
        if (this.field1555 != arg0) {
            this.method476(this.field1555, (byte) -99);
            this.field1547 = this.field1538;
            this.field1537 = this.field1541;
            this.field1558 = this.field1530;
        }
        this.method476(this.field1535, (byte) -99);
        field1529++;
    }

    @OriginalMember(owner = "client!k", name = "b", descriptor = "(IIIIIII)V", line = 150)
    public static final void method471(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1531++;
        int var7 = 2048 - arg5 & 0x7FF;
        int var8 = 2048 - arg3 & 0x7FF;
        int var9 = 0;
        if (arg6 != 23326) {
            return;
        }
        int var10 = 0;
        int var11 = arg1;
        if (var7 != 0) {
            int var12 = class48.field1213[var7];
            int var13 = class48.field1194[var7];
            int var14 = var9 * var13 - arg1 * var12 >> 16;
            var11 = var9 * var12 + arg1 * var13 >> 16;
            var9 = var14;
        }
        if (var8 != 0) {
            int var15 = class48.field1213[var8];
            int var16 = class48.field1194[var8];
            int var17 = var10 * var16 + var11 * var15 >> 16;
            var11 = var11 * var16 - var10 * var15 >> 16;
            var10 = var17;
        }
        class103.field2596 = arg0 - var9;
        class105.field2615 = arg4 - var11;
        class55.field1413 = arg3;
        class20.field553 = arg2 - var10;
        class87.field2207 = arg5;
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(IIZI)Lpd;", line = 226)
    public static final class94 method472(int arg0, int arg1, boolean arg2, int arg3) {
        field1528++;
        if (arg1 < 1 || arg1 > 36) {
            arg1 = 10;
        }
        int var4 = 1;
        for (int var5 = arg0 / arg1; var5 != 0; var5 /= arg1) {
            var4++;
        }
        int var6 = var4;
        if (arg0 < 0 || arg2) {
            var6 = var4 + 1;
        }
        byte[] var7 = new byte[var6];
        if (arg0 < 0) {
            var7[0] = 45;
        } else if (arg2) {
            var7[0] = 43;
        }
        for (int var8 = 0; var8 < var4; var8++) {
            int var10 = arg0 % arg1;
            if (var10 < 0) {
                var10 = -var10;
            }
            if (var10 > 9) {
                var10 += 39;
            }
            var7[var6 - var8 - 1] = (byte) (var10 + 48);
            arg0 /= arg1;
        }
        class94 var9 = new class94();
        if (arg3 == 0) {
            var9.field2382 = var7;
            var9.field2396 = var6;
            return var9;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!k", name = "d", descriptor = "(Z)V", line = 288)
    public static void method473(boolean arg0) {
        field1560 = null;
        field1556 = null;
        field1561 = null;
        field1557 = null;
        if (arg0) {
            field1553 = -61;
        }
        field1548 = null;
        field1554 = null;
        field1559 = null;
        field1544 = null;
        field1543 = null;
        field1551 = null;
        field1550 = null;
        field1549 = null;
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(BIII)V", line = 320)
    public static final void method474(byte arg0, int arg1, int arg2, int arg3) {
        if (arg0 <= 115) {
            method474((byte) 15, 16, -72, -22);
        }
        field1533++;
        if (arg1 < 128 || arg2 < 128 || arg1 > 13056 || arg2 > 13056) {
            class1.field25 = -1;
            class9.field250 = -1;
            return;
        }
        int var4 = class25.method226(class64.field1589, arg2, arg1, (byte) -104) - arg3;
        int var5 = arg2 - class105.field2615;
        int var6 = var4 - class103.field2596;
        int var7 = arg1 - class20.field553;
        int var8 = class48.field1194[class87.field2207];
        int var9 = class48.field1213[class87.field2207];
        int var10 = class48.field1213[class55.field1413];
        int var11 = class48.field1194[class55.field1413];
        int var12 = var5 * var10 + var7 * var11 >> 16;
        int var13 = var5 * var11 - var7 * var10 >> 16;
        int var15 = var6 * var8 - var9 * var13 >> 16;
        int var16 = var6 * var9 + var8 * var13 >> 16;
        if (var16 < 50) {
            class9.field250 = -1;
            class1.field25 = -1;
        } else {
            class1.field25 = (var15 << 9) / var16 + 167;
            class9.field250 = (var12 << 9) / var16 + 256;
        }
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(Lhb;II)V", line = 372)
    public static final void method475(class43 arg0, int arg1, int arg2) {
        if (arg2 <= 21) {
            field1561 = null;
        }
        field1536++;
        while (true) {
            class6 var3 = (class6) class42.field1061.method895(-14156);
            if (var3 == null) {
                return;
            }
            boolean var4 = false;
            for (int var5 = 0; var5 < var3.field117; var5++) {
                if (var3.field119[var5] != null) {
                    if (var3.field119[var5].field2944 == 2) {
                        var3.field123[var5] = -5;
                    }
                    if (var3.field119[var5].field2944 == 0) {
                        var4 = true;
                    }
                }
                if (var3.field124[var5] != null) {
                    if (var3.field124[var5].field2944 == 2) {
                        var3.field123[var5] = -6;
                    }
                    if (var3.field124[var5].field2944 == 0) {
                        var4 = true;
                    }
                }
            }
            if (var4) {
                return;
            }
            arg0.method326(arg1, -127);
            arg0.method916(-2, 0);
            int var6 = arg0.field3047;
            arg0.method917(var3.field120, true);
            for (int var7 = 0; var7 < var3.field117; var7++) {
                if (var3.field123[var7] == 0) {
                    try {
                        int var8 = var3.field115[var7];
                        if (var8 == 0) {
                            Field var12 = (Field) var3.field119[var7].field2946;
                            int var13 = var12.getInt(null);
                            arg0.method916(-2, 0);
                            arg0.method917(var13, true);
                        } else if (var8 == 1) {
                            Field var11 = (Field) var3.field119[var7].field2946;
                            var11.setInt(null, var3.field127[var7]);
                            arg0.method916(-2, 0);
                        } else if (var8 == 2) {
                            Field var9 = (Field) var3.field119[var7].field2946;
                            int var10 = var9.getModifiers();
                            arg0.method916(-2, 0);
                            arg0.method917(var10, true);
                        }
                        if (var8 == 3) {
                            Method var16 = (Method) var3.field124[var7].field2946;
                            byte[][] var17 = var3.field125[var7];
                            Object[] var18 = new Object[var17.length];
                            for (int var19 = 0; var19 < var17.length; var19++) {
                                ObjectInputStream var20 = new ObjectInputStream(new ByteArrayInputStream(var17[var19]));
                                var18[var19] = var20.readObject();
                            }
                            Object var21 = var16.invoke(null, var18);
                            if (var21 == null) {
                                arg0.method916(-2, 0);
                            } else if (var21 instanceof Number) {
                                arg0.method916(-2, 1);
                                arg0.method965(-102, ((Number) var21).longValue());
                            } else if (var21 instanceof class94) {
                                arg0.method916(-2, 2);
                                arg0.method922(2, (class94) var21);
                            } else {
                                arg0.method916(-2, 4);
                            }
                        } else if (var8 == 4) {
                            Method var14 = (Method) var3.field124[var7].field2946;
                            int var15 = var14.getModifiers();
                            arg0.method916(-2, 0);
                            arg0.method917(var15, true);
                        }
                    } catch (ClassNotFoundException var22) {
                        arg0.method916(-2, -10);
                    } catch (InvalidClassException var23) {
                        arg0.method916(-2, -11);
                    } catch (StreamCorruptedException var24) {
                        arg0.method916(-2, -12);
                    } catch (OptionalDataException var25) {
                        arg0.method916(-2, -13);
                    } catch (IllegalAccessException var26) {
                        arg0.method916(-2, -14);
                    } catch (IllegalArgumentException var27) {
                        arg0.method916(-2, -15);
                    } catch (InvocationTargetException var28) {
                        arg0.method916(-2, -16);
                    } catch (SecurityException var29) {
                        arg0.method916(-2, -17);
                    } catch (IOException var30) {
                        arg0.method916(-2, -18);
                    } catch (NullPointerException var31) {
                        arg0.method916(-2, -19);
                    } catch (Exception var32) {
                        arg0.method916(-2, -20);
                    } catch (Throwable var33) {
                        arg0.method916(-2, -21);
                    }
                } else {
                    arg0.method916(-2, var3.field123[var7]);
                }
            }
            arg0.method930(-51, var6);
            arg0.method927(false, arg0.field3047 - var6);
            var3.method1074((byte) -28);
        }
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(IB)V", line = 565)
    private final void method476(int arg0, byte arg1) {
        field1540++;
        double var3 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
        double var5 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
        double var7 = var3;
        if (var3 > var5) {
            var7 = var5;
        }
        double var9 = (double) (arg0 & 0xFF) / 256.0D;
        if (var9 < var7) {
            var7 = var9;
        }
        double var11 = 0.0D;
        double var13 = 0.0D;
        double var15 = var3;
        if (arg1 != -99) {
            return;
        }
        if (var3 < var5) {
            var15 = var5;
        }
        if (var15 < var9) {
            var15 = var9;
        }
        double var17 = (var7 + var15) / 2.0D;
        if (var7 != var15) {
            if (var3 == var15) {
                var11 = (var5 - var9) / (-var7 + var15);
            } else if (var5 == var15) {
                var11 = (var9 - var3) / (var15 - var7) + 2.0D;
            } else if (var9 == var15) {
                var11 = (var3 - var5) / (var15 - var7) + 4.0D;
            }
            if (var17 < 0.5D) {
                var13 = (var15 - var7) / (var7 + var15);
            }
            if (var17 >= 0.5D) {
                var13 = (var15 - var7) / (2.0D - var15 + -var7);
            }
        }
        this.field1541 = (int) (var13 * 256.0D);
        this.field1530 = (int) (var17 * 256.0D);
        if (this.field1530 < 0) {
            this.field1530 = 0;
        } else if (this.field1530 > 255) {
            this.field1530 = 255;
        }
        double var19 = var11 / 6.0D;
        this.field1538 = (int) (var19 * 256.0D);
        if (this.field1541 < 0) {
            this.field1541 = 0;
        } else if (this.field1541 > 255) {
            this.field1541 = 255;
        }
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(IZ)V", line = 654)
    public static final void method477(int arg0, boolean arg1) {
        field1552++;
        class75 var2 = (class75) class86.field2185.method19(25239, (long) arg0);
        if (var2 != null) {
            var2.method1074((byte) -28);
            if (arg1) {
                field1544 = null;
            }
        }
    }
}
