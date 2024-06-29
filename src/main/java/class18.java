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

@OriginalClass("client!af")
public class class18 extends class27 {

    @OriginalMember(owner = "client!af", name = "Q", descriptor = "I")
    private int field296 = 585;

    @OriginalMember(owner = "client!af", name = "K", descriptor = "I")
    public static int field290 = 0;

    @OriginalMember(owner = "client!af", name = "O", descriptor = "Ljava/lang/String;")
    public static String field294 = "Checking for updates - ";

    @OriginalMember(owner = "client!af", name = "L", descriptor = "I")
    public static int field291;

    @OriginalMember(owner = "client!af", name = "M", descriptor = "I")
    public static int field292;

    @OriginalMember(owner = "client!af", name = "N", descriptor = "I")
    public static int field293;

    @OriginalMember(owner = "client!af", name = "P", descriptor = "I")
    public static int field295;

    @OriginalMember(owner = "client!af", name = "R", descriptor = "I")
    public static int field297;

    @OriginalMember(owner = "client!af", name = "S", descriptor = "I")
    public static int field298;

    @OriginalMember(owner = "client!af", name = "T", descriptor = "I")
    public static int field299;

    @OriginalMember(owner = "client!af", name = "U", descriptor = "I")
    public static int field300;

    @OriginalMember(owner = "client!af", name = "g", descriptor = "(I)V", line = 5)
    public static void method110(int arg0) {
        int var1 = -27 % ((-arg0 - 33) / 57);
        field294 = null;
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(IILlf;)V", line = 21)
    public static final void method111(int arg0, int arg1, class260 arg2) {
        field292++;
        if (arg1 != -20) {
            method110(-120);
        }
        while (true) {
            class144 var3 = (class144) class312.field4646.method93((byte) -75);
            if (var3 == null) {
                return;
            }
            boolean var4 = false;
            for (int var5 = 0; var5 < var3.field2082; var5++) {
                if (var3.field2076[var5] != null) {
                    if (var3.field2076[var5].field3056 == 2) {
                        var3.field2077[var5] = -5;
                    }
                    if (var3.field2076[var5].field3056 == 0) {
                        var4 = true;
                    }
                }
                if (var3.field2086[var5] != null) {
                    if (var3.field2086[var5].field3056 == 2) {
                        var3.field2077[var5] = -6;
                    }
                    if (var3.field2086[var5].field3056 == 0) {
                        var4 = true;
                    }
                }
            }
            if (var4) {
                return;
            }
            arg2.method1915(true, arg0);
            arg2.method1355((byte) -110, 0);
            int var6 = arg2.field2776;
            arg2.method1354(var3.field2079, (byte) -49);
            for (int var7 = 0; var7 < var3.field2082; var7++) {
                if (var3.field2077[var7] == 0) {
                    try {
                        int var8 = var3.field2080[var7];
                        if (var8 == 0) {
                            Field var9 = (Field) var3.field2076[var7].field3058;
                            int var10 = var9.getInt((Object) null);
                            arg2.method1355((byte) -110, 0);
                            arg2.method1354(var10, (byte) -20);
                        } else if (var8 == 1) {
                            Field var11 = (Field) var3.field2076[var7].field3058;
                            var11.setInt((Object) null, var3.field2075[var7]);
                            arg2.method1355((byte) -117, 0);
                        } else if (var8 == 2) {
                            Field var12 = (Field) var3.field2076[var7].field3058;
                            int var13 = var12.getModifiers();
                            arg2.method1355((byte) -110, 0);
                            arg2.method1354(var13, (byte) 117);
                        }
                        if (var8 == 3) {
                            Method var16 = (Method) var3.field2086[var7].field3058;
                            byte[][] var17 = var3.field2083[var7];
                            Object[] var18 = new Object[var17.length];
                            for (int var19 = 0; var19 < var17.length; var19++) {
                                ObjectInputStream var20 = new ObjectInputStream(new ByteArrayInputStream(var17[var19]));
                                var18[var19] = var20.readObject();
                            }
                            Object var21 = var16.invoke((Object) null, var18);
                            if (var21 == null) {
                                arg2.method1355((byte) -121, 0);
                            } else if ((var21 instanceof Number)) {
                                arg2.method1355((byte) -122, 1);
                                arg2.method1327(((Number) var21).longValue(), (byte) 7);
                            } else if ((var21 instanceof String)) {
                                arg2.method1355((byte) -111, 2);
                                arg2.method1343((String) var21, 0);
                            } else {
                                arg2.method1355((byte) -116, 4);
                            }
                        } else if (var8 == 4) {
                            Method var14 = (Method) var3.field2086[var7].field3058;
                            int var15 = var14.getModifiers();
                            arg2.method1355((byte) -114, 0);
                            arg2.method1354(var15, (byte) -40);
                        }
                    } catch (ClassNotFoundException var34) {
                        arg2.method1355((byte) -110, -10);
                    } catch (InvalidClassException var35) {
                        arg2.method1355((byte) -108, -11);
                    } catch (StreamCorruptedException var36) {
                        arg2.method1355((byte) -116, -12);
                    } catch (OptionalDataException var37) {
                        arg2.method1355((byte) -109, -13);
                    } catch (IllegalAccessException var38) {
                        arg2.method1355((byte) -112, -14);
                    } catch (IllegalArgumentException var39) {
                        arg2.method1355((byte) -128, -15);
                    } catch (InvocationTargetException var40) {
                        arg2.method1355((byte) -115, -16);
                    } catch (SecurityException var41) {
                        arg2.method1355((byte) -108, -17);
                    } catch (IOException var42) {
                        arg2.method1355((byte) -116, -18);
                    } catch (NullPointerException var43) {
                        arg2.method1355((byte) -115, -19);
                    } catch (Exception var44) {
                        arg2.method1355((byte) -116, -20);
                    } catch (Throwable var45) {
                        arg2.method1355((byte) -112, -21);
                    }
                } else {
                    arg2.method1355((byte) -116, var3.field2077[var7]);
                }
            }
            arg2.method1340((byte) 100, var6);
            arg2.method1374(arg1 ^ 0xFFFFA5AF, arg2.field2776 - var6);
            var3.method876(8);
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(IB)[I", line = 214)
    public final int[] method18(int arg0, byte arg1) {
        field291++;
        int[] var3 = this.field375.method2087(arg1 ^ 0x70, arg0);
        if (arg1 != -62) {
            return (int[]) null;
        }
        if (this.field375.field4382) {
            int var4 = class215.field3175[arg0];
            for (int var5 = 0; var5 < class209.field3053; var5++) {
                int var6 = class251.field3721[var5];
                if (this.field296 < var6 && (4096 - this.field296) > var6 && var4 > 2048 - this.field296 && var4 < this.field296 + 2048) {
                    int var7 = 2048 - var6;
                    int var8 = var7 >= 0 ? var7 : -var7;
                    int var9 = var8 << 12;
                    int var10 = var9 / (2048 - this.field296);
                    var3[var5] = 4096 - var10;
                } else if (var6 > (2048 - this.field296) && this.field296 + 2048 > var6) {
                    int var11 = var4 - 2048;
                    int var12 = var11 >= 0 ? var11 : -var11;
                    int var13 = var12 - this.field296;
                    int var14 = var13 << 12;
                    var3[var5] = var14 / (2048 - this.field296);
                } else if (var4 < this.field296 || var4 > (4096 - this.field296)) {
                    int var19 = var6 - 2048;
                    int var20 = var19 >= 0 ? var19 : -var19;
                    int var21 = var20 - this.field296;
                    int var22 = var21 << 12;
                    var3[var5] = var22 / (2048 - this.field296);
                } else if (var6 >= this.field296 && var6 <= 4096 - this.field296) {
                    var3[var5] = 0;
                } else {
                    int var15 = 2048 - var4;
                    int var16 = var15 >= 0 ? var15 : -var15;
                    int var17 = var16 << 12;
                    int var18 = var17 / (2048 - this.field296);
                    var3[var5] = 4096 - var18;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!af", name = "e", descriptor = "(B)I", line = 295)
    public static final int method112(byte arg0) {
        field297++;
        try {
            if (class315.field4682 == 0) {
                if (class321.field4833 > class176.method1234(5574) - 5000L) {
                    return 0;
                }
                class22.field340 = class54.field787.method486(class302.field4508, (byte) 85, class157.field2266);
                class129.field1877 = class176.method1234(arg0 + 5670);
                class315.field4682 = 1;
            }
            if ((class129.field1877 + 30000L) < class176.method1234(5574)) {
                return class1.method6(true, 1000);
            }
            if (arg0 != -96) {
                method112((byte) -58);
            }
            if (class315.field4682 == 1) {
                if (class22.field340.field3056 == 2) {
                    return class1.method6(true, 1001);
                }
                if (class22.field340.field3056 != 1) {
                    return -1;
                }
                class67.field973 = new class215((Socket) class22.field340.field3058, class54.field787);
                class22.field340 = null;
                class107.field1533.field2776 = 0;
                int var1 = 0;
                if (class178.field2556) {
                    var1 = class4.field112;
                }
                class107.field1533.method1355((byte) -108, 23);
                class107.field1533.method1354(var1, (byte) 125);
                class67.field973.method1558(5000, class107.field1533.field2718, 0, class107.field1533.field2776);
                if (class119.field1675 != null) {
                    class119.field1675.method535((byte) -91);
                }
                if (class28.field396 != null) {
                    class28.field396.method535((byte) -121);
                }
                int var2 = class67.field973.method1553(0);
                if (class119.field1675 != null) {
                    class119.field1675.method535((byte) -125);
                }
                if (class28.field396 != null) {
                    class28.field396.method535((byte) -126);
                }
                if (var2 != 0) {
                    return class1.method6(true, var2);
                }
                class315.field4682 = 2;
            }
            if (class315.field4682 == 2) {
                if (class67.field973.method1554(-2) < 2) {
                    return -1;
                }
                class276.field4184 = class67.field973.method1553(0);
                class276.field4184 <<= 0x8;
                class276.field4184 += class67.field973.method1553(0);
                class174.field2511 = new byte[class276.field4184];
                class147.field2117 = 0;
                class315.field4682 = 3;
            }
            if (class315.field4682 != 3) {
                return -1;
            }
            int var3 = class67.field973.method1554(-2);
            if (var3 < 1) {
                return -1;
            }
            if (var3 > (class276.field4184 - class147.field2117)) {
                var3 = class276.field4184 - class147.field2117;
            }
            class67.field973.method1552(class174.field2511, class147.field2117, var3, (byte) 33);
            class147.field2117 += var3;
            if (class147.field2117 < class276.field4184) {
                return -1;
            } else if (class17.method107(4018, class174.field2511)) {
                class270.field4099 = new class316[class294.field4431];
                int var4 = 0;
                for (int var5 = class22.field338; var5 <= class232.field3504; var5++) {
                    class316 var6 = class206.method1506(var5, -35);
                    if (var6 != null) {
                        class270.field4099[var4++] = var6;
                    }
                }
                class67.field973.method1555(false);
                class99.field1399 = 0;
                class67.field973 = null;
                class174.field2511 = null;
                class315.field4682 = 0;
                class321.field4833 = class176.method1234(5574);
                return 0;
            } else {
                return class1.method6(true, 1002);
            }
        } catch (IOException var8) {
            return class1.method6(true, 1003);
        }
    }

    @OriginalMember(owner = "client!af", name = "<init>", descriptor = "()V", line = 428)
    public class18() {
        super(0, true);
    }

    @OriginalMember(owner = "client!af", name = "h", descriptor = "(I)Led;", line = 436)
    public static final class281 method113(int arg0) {
        field293++;
        return arg0 >= -58 ? (class281) null : class105.field1500;
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(ILsb;I)V", line = 447)
    public final void method23(int arg0, class190 arg1, int arg2) {
        field298++;
        if (arg0 != -5836) {
            this.method18(-125, (byte) -95);
        }
        if (arg2 == 0) {
            this.field296 = arg1.method1317((byte) 76);
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(ILei;BIIIIII)V", line = 474)
    public static final void method114(int arg0, class261 arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field300++;
        int var9 = arg3 & 0x3;
        int var10 = 113 % ((arg2 + 49) / 55);
        int var11;
        int var12;
        if (var9 == 1 || var9 == 3) {
            var12 = arg1.field3907;
            var11 = arg1.field3962;
        } else {
            var11 = arg1.field3907;
            var12 = arg1.field3962;
        }
        int var13;
        int var14;
        if (arg4 + var11 <= 104) {
            var13 = arg4 + (var11 >> 1);
            var14 = arg4 + (var11 + 1 >> 1);
        } else {
            var14 = arg4 + 1;
            var13 = arg4;
        }
        int var15 = (arg5 << 7) + (var12 << 6);
        int var16;
        int var17;
        if (arg5 + var12 <= 104) {
            var16 = arg5 + (var12 + 1 >> 1);
            var17 = (var12 >> 1) + arg5;
        } else {
            var16 = arg5 + 1;
            var17 = arg5;
        }
        int[][] var18 = class132.field1930[arg0];
        int var19 = 0;
        int var20 = var18[var16][var13] + var18[var16][var14] + var18[var17][var13] + var18[var17][var14] >> 2;
        if (arg0 != 0) {
            int[][] var21 = class132.field1930[0];
            var19 = var20 - (var21[var17][var13] + var21[var16][var13] + var21[var17][var14] + var21[var16][var14] >> 2);
        }
        int var22 = (arg4 << 7) + (var11 << 6);
        int[][] var23 = (int[][]) null;
        if (arg0 < 3) {
            var23 = class132.field1930[arg0 + 1];
        }
        class127 var24 = arg1.method1935(var23, var22, (byte) 110, var15, arg3, true, false, (class234) null, var18, var20, arg8);
        class24.method144(var24.field1847, var15 - arg6, var19, var22 - arg7);
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(IIIIIIIBII)V", line = 562)
    public static final void method115(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte arg7, int arg8, int arg9) {
        if (arg7 <= 63) {
            field294 = (String) null;
        }
        if (arg1 == arg3 && arg2 == arg6 && arg0 == arg4 && arg5 == arg9) {
            class306.method2154(arg0, arg5, arg1, arg6, arg8, (byte) 112);
        } else {
            int var10 = arg6;
            int var11 = arg1;
            int var12 = arg6 * 3;
            int var13 = arg1 * 3;
            int var14 = arg3 * 3;
            int var15 = arg2 * 3;
            int var16 = arg9 * 3;
            int var17 = arg4 * 3;
            int var18 = arg0 - (var17 + arg1 - var14);
            int var19 = arg5 + var15 - var16 - arg6;
            int var20 = var17 + var13 - var14 - var14;
            int var21 = var16 - (var15 - (var12 - var15));
            int var22 = var14 - var13;
            int var23 = var15 - var12;
            for (int var24 = 128; var24 <= 4096; var24 += 128) {
                int var25 = var24 * var24 >> 12;
                int var26 = var24 * var25 >> 12;
                int var27 = var18 * var26;
                int var28 = var19 * var26;
                int var29 = var20 * var25;
                int var30 = var21 * var25;
                int var31 = var22 * var24;
                int var32 = var23 * var24;
                int var33 = (var30 + var32 + var28 >> 12) + arg6;
                int var34 = (var27 + var29 + var31 >> 12) + arg1;
                class306.method2154(var34, var33, var11, var10, arg8, (byte) 112);
                var10 = var33;
                var11 = var34;
            }
        }
        field299++;
    }
}
