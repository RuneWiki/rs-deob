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

@OriginalClass("client!t")
public class class252 extends class211 {

    @OriginalMember(owner = "client!t", name = "m", descriptor = "Z")
    public static volatile boolean field4129 = true;

    @OriginalMember(owner = "client!t", name = "v", descriptor = "[Lna;")
    public static class26[] field4138 = new class26[500];

    @OriginalMember(owner = "client!t", name = "p", descriptor = "Ln;")
    public static class282 field4132 = new class282(64);

    @OriginalMember(owner = "client!t", name = "w", descriptor = "[J")
    public static long[] field4139 = new long[100];

    @OriginalMember(owner = "client!t", name = "y", descriptor = "I")
    public static int field4141 = 0;

    @OriginalMember(owner = "client!t", name = "B", descriptor = "Lna;")
    private static class26 field4144 = class69.method505("Your friend list is full)3 Max of 100 for free users)1 and 200 for members)3", (byte) -120);

    @OriginalMember(owner = "client!t", name = "x", descriptor = "Z")
    public static boolean field4140 = false;

    @OriginalMember(owner = "client!t", name = "E", descriptor = "[I")
    public static int[] field4147 = new int[32];

    @OriginalMember(owner = "client!t", name = "D", descriptor = "Lna;")
    public static class26 field4146 = field4144;

    @OriginalMember(owner = "client!t", name = "z", descriptor = "I")
    public static int field4142 = 0;

    @OriginalMember(owner = "client!t", name = "C", descriptor = "Lna;")
    public static class26 field4145 = class69.method505(")3", (byte) -120);

    @OriginalMember(owner = "client!t", name = "F", descriptor = "I")
    public static int field4148 = 0;

    @OriginalMember(owner = "client!t", name = "n", descriptor = "I")
    public static int field4130;

    @OriginalMember(owner = "client!t", name = "o", descriptor = "I")
    public static int field4131;

    @OriginalMember(owner = "client!t", name = "q", descriptor = "I")
    public static int field4133;

    @OriginalMember(owner = "client!t", name = "r", descriptor = "I")
    public static int field4134;

    @OriginalMember(owner = "client!t", name = "s", descriptor = "I")
    public static int field4135;

    @OriginalMember(owner = "client!t", name = "t", descriptor = "I")
    public static int field4136;

    @OriginalMember(owner = "client!t", name = "u", descriptor = "I")
    public static int field4137;

    @OriginalMember(owner = "client!t", name = "A", descriptor = "I")
    public static int field4143;

    @OriginalMember(owner = "client!t", name = "l", descriptor = "Lma;")
    public static class285 field4128;

    @OriginalMember(owner = "client!t", name = "G", descriptor = "[Lek;")
    public static class183[] field4149;

    @OriginalMember(owner = "client!t", name = "b", descriptor = "(I)V", line = 6)
    public static final void method1740(int arg0) {
        field4135++;
        if (arg0 == 0) {
            class241.field3929.method1987(3);
        }
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(IIIZIII)V", line = 33)
    public static final void method1741(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6) {
        int var7 = 0;
        class145[] var8 = class122.field1901;
        while (var8.length > var7) {
            class145 var9 = var8[var7];
            if (var9 != null && var9.field2213 == 2) {
                class97.method724(arg0 >> 1, arg5, (var9.field2199 - class165.field2568 << 7) + var9.field2202, var9.field2205 * 2, arg2 >> 1, (var9.field2208 - class12.field157 << 7) + var9.field2198, (byte) -114, arg4);
                if (class223.field3524 > -1 && (class229.field3626 % 20) < 10) {
                    class10.field133[var9.field2203].method876(class223.field3524 + arg1 - 12, arg6 + -28 - -class327.field5665);
                }
            }
            var7++;
        }
        if (!arg3) {
            field4140 = true;
        }
        field4133++;
    }

    @OriginalMember(owner = "client!t", name = "b", descriptor = "(B)V", line = 65)
    public static final void method1742(byte arg0) {
        field4137++;
        class94.field1533.method1986((byte) -117);
        class263.field4299.method1986((byte) -108);
        class307.field5291.method1986((byte) -117);
        if (arg0 <= 122) {
            method1743(true, (byte) -67);
        }
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(ZB)V", line = 85)
    public static final void method1743(boolean arg0, byte arg1) {
        field4134++;
        int var2 = 85 % ((-arg1 - 17) / 59);
        byte[][] var3;
        byte var4;
        if (class255.field4184 && arg0) {
            var3 = class84.field1372;
            var4 = 1;
        } else {
            var4 = 4;
            var3 = class47.field761;
        }
        for (int var5 = 0; var5 < var4; var5++) {
            class258.method1815(-16385);
            for (int var6 = 0; var6 < 13; var6++) {
                for (int var7 = 0; var7 < 13; var7++) {
                    int var8 = class78.field1190[var5][var6][var7];
                    if (var8 != -1) {
                        int var9 = var8 >> 24 & 0x3;
                        if (!arg0 || var9 == 0) {
                            int var10 = (var8 & 0x6) >> 1;
                            int var11 = var8 >> 14 & 0x3FF;
                            int var12 = var8 >> 3 & 0x7FF;
                            int var13 = (var11 / 8 << 8) + var12 / 8;
                            for (int var14 = 0; var14 < class293.field4884.length; var14++) {
                                if (class293.field4884[var14] == var13 && var3[var14] != null) {
                                    class18.method123(class218.field3479, var5, var3[var14], var9, var10, var6 * 8, var7 * 8, arg0, (var11 & 0x7) * 8, (var12 & 0x7) * 8, (byte) -54);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(BJII)Z", line = 173)
    public static final boolean method1744(byte arg0, long arg1, int arg2, int arg3) {
        field4130++;
        int var5 = (int) arg1 >> 14 & 0x1F;
        if (arg0 != 39) {
            method1740(-62);
        }
        int var6 = (int) arg1 >> 20 & 0x3;
        int var7 = (int) (arg1 >>> 32) & Integer.MAX_VALUE;
        if (var5 == 10 || var5 == 11 || var5 == 22) {
            class78 var8 = class104.method750(4, var7);
            int var9;
            int var10;
            if (var6 == 0 || var6 == 2) {
                var9 = var8.field1178;
                var10 = var8.field1171;
            } else {
                var9 = var8.field1171;
                var10 = var8.field1178;
            }
            int var11 = var8.field1234;
            if (var6 != 0) {
                var11 = (var11 << var6 & 0xF) + (var11 >> 4 - var6);
            }
            class33.method269(class13.field221.field3890[0], 0, var9, true, var11, 2, arg3, var10, 0, 2, arg2, class13.field221.field3904[0]);
        } else {
            class33.method269(class13.field221.field3890[0], var6, 0, true, 0, 2, arg3, 0, var5 + 1, 2, arg2, class13.field221.field3904[0]);
        }
        class304.field5243 = class11.field152;
        class203.field3178 = 0;
        class260.field4255 = 2;
        class267.field4414 = class205.field3210;
        return true;
    }

    @OriginalMember(owner = "client!t", name = "c", descriptor = "(B)V", line = 222)
    public static void method1745(byte arg0) {
        int var1 = 58 % ((arg0 - 7) / 43);
        field4128 = null;
        field4146 = null;
        field4149 = null;
        field4147 = null;
        field4138 = null;
        field4132 = null;
        field4139 = null;
        field4144 = null;
        field4145 = null;
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(Li;II)V", line = 242)
    public static final void method1746(class214 arg0, int arg1, int arg2) {
        field4136++;
        if (arg2 > -109) {
            method1746((class214) null, 67, 54);
        }
        while (true) {
            class294 var3 = (class294) class301.field5187.method264(-80);
            if (var3 == null) {
                return;
            }
            boolean var4 = false;
            for (int var5 = 0; var5 < var3.field4889; var5++) {
                if (var3.field4901[var5] != null) {
                    if (var3.field4901[var5].field2811 == 2) {
                        var3.field4896[var5] = -5;
                    }
                    if (var3.field4901[var5].field2811 == 0) {
                        var4 = true;
                    }
                }
                if (var3.field4894[var5] != null) {
                    if (var3.field4894[var5].field2811 == 2) {
                        var3.field4896[var5] = -6;
                    }
                    if (var3.field4894[var5].field2811 == 0) {
                        var4 = true;
                    }
                }
            }
            if (var4) {
                return;
            }
            arg0.method1431(0, arg1);
            arg0.method591((byte) -86, 0);
            int var6 = arg0.field1301;
            arg0.method577(-127, var3.field4904);
            for (int var7 = 0; var7 < var3.field4889; var7++) {
                if (var3.field4896[var7] == 0) {
                    try {
                        int var8 = var3.field4898[var7];
                        if (var8 == 0) {
                            Field var12 = (Field) var3.field4901[var7].field2812;
                            int var13 = var12.getInt((Object) null);
                            arg0.method591((byte) -102, 0);
                            arg0.method577(-122, var13);
                        } else if (var8 == 1) {
                            Field var9 = (Field) var3.field4901[var7].field2812;
                            var9.setInt((Object) null, var3.field4895[var7]);
                            arg0.method591((byte) -98, 0);
                        } else if (var8 == 2) {
                            Field var10 = (Field) var3.field4901[var7].field2812;
                            int var11 = var10.getModifiers();
                            arg0.method591((byte) -26, 0);
                            arg0.method577(-124, var11);
                        }
                        if (var8 == 3) {
                            Method var14 = (Method) var3.field4894[var7].field2812;
                            byte[][] var15 = var3.field4900[var7];
                            Object[] var16 = new Object[var15.length];
                            for (int var17 = 0; var17 < var15.length; var17++) {
                                ObjectInputStream var18 = new ObjectInputStream(new ByteArrayInputStream(var15[var17]));
                                var16[var17] = var18.readObject();
                            }
                            Object var19 = var14.invoke((Object) null, var16);
                            if (var19 == null) {
                                arg0.method591((byte) -51, 0);
                            } else if ((var19 instanceof Number)) {
                                arg0.method591((byte) -94, 1);
                                arg0.method579(((Number) var19).longValue(), -2037491440);
                            } else if (var19 instanceof class26) {
                                arg0.method591((byte) -52, 2);
                                arg0.method584(0, (class26) var19);
                            } else {
                                arg0.method591((byte) -94, 4);
                            }
                        } else if (var8 == 4) {
                            Method var20 = (Method) var3.field4894[var7].field2812;
                            int var21 = var20.getModifiers();
                            arg0.method591((byte) -27, 0);
                            arg0.method577(-126, var21);
                        }
                    } catch (ClassNotFoundException var34) {
                        arg0.method591((byte) -102, -10);
                    } catch (InvalidClassException var35) {
                        arg0.method591((byte) -41, -11);
                    } catch (StreamCorruptedException var36) {
                        arg0.method591((byte) -76, -12);
                    } catch (OptionalDataException var37) {
                        arg0.method591((byte) -60, -13);
                    } catch (IllegalAccessException var38) {
                        arg0.method591((byte) -76, -14);
                    } catch (IllegalArgumentException var39) {
                        arg0.method591((byte) -98, -15);
                    } catch (InvocationTargetException var40) {
                        arg0.method591((byte) -112, -16);
                    } catch (SecurityException var41) {
                        arg0.method591((byte) -11, -17);
                    } catch (IOException var42) {
                        arg0.method591((byte) -27, -18);
                    } catch (NullPointerException var43) {
                        arg0.method591((byte) -37, -19);
                    } catch (Exception var44) {
                        arg0.method591((byte) -75, -20);
                    } catch (Throwable var45) {
                        arg0.method591((byte) -79, -21);
                    }
                } else {
                    arg0.method591((byte) -101, var3.field4896[var7]);
                }
            }
            arg0.method632((byte) 86, var6);
            arg0.method608((byte) -127, arg0.field1301 - var6);
            var3.method1006(-1024);
        }
    }
}
