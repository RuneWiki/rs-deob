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

@OriginalClass("client!wd")
public class class153 extends class256 {

    @OriginalMember(owner = "client!wd", name = "x", descriptor = "Z")
    public static boolean field2496 = true;

    @OriginalMember(owner = "client!wd", name = "w", descriptor = "Z")
    public static boolean field2495 = true;

    @OriginalMember(owner = "client!wd", name = "v", descriptor = "[I")
    public static int[] field2494 = new int[25];

    @OriginalMember(owner = "client!wd", name = "y", descriptor = "I")
    public static int field2497 = 0;

    @OriginalMember(owner = "client!wd", name = "r", descriptor = "I")
    public static int field2490;

    @OriginalMember(owner = "client!wd", name = "s", descriptor = "I")
    public static int field2491;

    @OriginalMember(owner = "client!wd", name = "t", descriptor = "I")
    public static int field2492;

    @OriginalMember(owner = "client!wd", name = "u", descriptor = "I")
    public static int field2493;

    @OriginalMember(owner = "client!wd", name = "z", descriptor = "I")
    public static int field2498;

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(Lwb;II)V")
    public static final void method1107(class76 arg0, int arg1, int arg2) {
        if (arg2 < 34) {
            method1107((class76) null, 62, 124);
        }
        field2492++;
        while (true) {
            class150 var3 = (class150) class294.field4664.method1807(-114);
            if (var3 == null) {
                return;
            }
            boolean var4 = false;
            for (int var5 = 0; var5 < var3.field2459; var5++) {
                if (var3.field2455[var5] != null) {
                    if (var3.field2455[var5].field1937 == 2) {
                        var3.field2454[var5] = -5;
                    }
                    if (var3.field2455[var5].field1937 == 0) {
                        var4 = true;
                    }
                }
                if (var3.field2451[var5] != null) {
                    if (var3.field2451[var5].field1937 == 2) {
                        var3.field2454[var5] = -6;
                    }
                    if (var3.field2451[var5].field1937 == 0) {
                        var4 = true;
                    }
                }
            }
            if (var4) {
                return;
            }
            arg0.method607(arg1, (byte) 116);
            arg0.method966((byte) 49, 0);
            int var6 = arg0.field2231;
            arg0.method1029(var3.field2453, 15430);
            for (int var7 = 0; var7 < var3.field2459; var7++) {
                if (var3.field2454[var7] == 0) {
                    try {
                        int var8 = var3.field2450[var7];
                        if (var8 == 0) {
                            Field var9 = (Field) var3.field2455[var7].field1936;
                            int var10 = var9.getInt((Object) null);
                            arg0.method966((byte) 59, 0);
                            arg0.method1029(var10, 15430);
                        } else if (var8 == 1) {
                            Field var13 = (Field) var3.field2455[var7].field1936;
                            var13.setInt((Object) null, var3.field2460[var7]);
                            arg0.method966((byte) 90, 0);
                        } else if (var8 == 2) {
                            Field var11 = (Field) var3.field2455[var7].field1936;
                            int var12 = var11.getModifiers();
                            arg0.method966((byte) 60, 0);
                            arg0.method1029(var12, 15430);
                        }
                        if (var8 == 3) {
                            Method var14 = (Method) var3.field2451[var7].field1936;
                            byte[][] var15 = var3.field2452[var7];
                            Object[] var16 = new Object[var15.length];
                            for (int var17 = 0; var17 < var15.length; var17++) {
                                ObjectInputStream var18 = new ObjectInputStream(new ByteArrayInputStream(var15[var17]));
                                var16[var17] = var18.readObject();
                            }
                            Object var19 = var14.invoke((Object) null, var16);
                            if (var19 == null) {
                                arg0.method966((byte) 47, 0);
                            } else if ((var19 instanceof Number)) {
                                arg0.method966((byte) 77, 1);
                                arg0.method967((byte) -8, ((Number) var19).longValue());
                            } else if (var19 instanceof String) {
                                arg0.method966((byte) 111, 2);
                                arg0.method1028(14630, (String) var19);
                            } else {
                                arg0.method966((byte) 44, 4);
                            }
                        } else if (var8 == 4) {
                            Method var20 = (Method) var3.field2451[var7].field1936;
                            int var21 = var20.getModifiers();
                            arg0.method966((byte) 66, 0);
                            arg0.method1029(var21, 15430);
                        }
                    } catch (ClassNotFoundException var22) {
                        arg0.method966((byte) 41, -10);
                    } catch (InvalidClassException var23) {
                        arg0.method966((byte) 122, -11);
                    } catch (StreamCorruptedException var24) {
                        arg0.method966((byte) 40, -12);
                    } catch (OptionalDataException var25) {
                        arg0.method966((byte) 92, -13);
                    } catch (IllegalAccessException var26) {
                        arg0.method966((byte) 93, -14);
                    } catch (IllegalArgumentException var27) {
                        arg0.method966((byte) 123, -15);
                    } catch (InvocationTargetException var28) {
                        arg0.method966((byte) 81, -16);
                    } catch (SecurityException var29) {
                        arg0.method966((byte) 111, -17);
                    } catch (IOException var30) {
                        arg0.method966((byte) 122, -18);
                    } catch (NullPointerException var31) {
                        arg0.method966((byte) 89, -19);
                    } catch (Exception var32) {
                        arg0.method966((byte) 122, -20);
                    } catch (Throwable var33) {
                        arg0.method966((byte) 32, -21);
                    }
                } else {
                    arg0.method966((byte) 37, var3.field2454[var7]);
                }
            }
            arg0.method1014(var6, 120);
            arg0.method1024(arg0.field2231 - var6, (byte) 9);
            var3.method1074((byte) -122);
        }
    }

    @OriginalMember(owner = "client!wd", name = "d", descriptor = "(I)V")
    public static void method1108(int arg0) {
        field2494 = null;
        if (arg0 != 0) {
            method1110(-87);
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(IIIZIIII)V")
    public static final void method1109(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6, int arg7) {
        int var8 = 0;
        field2491++;
        int var9 = arg7;
        int var10 = 0;
        int var11 = arg4 * arg4;
        int var12 = arg4 - arg5;
        int var13 = arg7 - arg5;
        int var14 = arg7 * arg7;
        int var15 = var12 * var12;
        int var16 = var13 * var13;
        int var17 = var14 << 1;
        int var18 = var11 << 1;
        int var19 = var16 << 1;
        int var20 = arg7 << 1;
        int var21 = var15 << 1;
        int var22 = var13 << 1;
        int var23 = (1 - var20) * var11 + var17;
        int var24 = (1 - var22) * var15 + var19;
        int var25 = var16 - ((var22 - 1) * var21);
        int var26 = var14 - ((var20 - 1) * var18);
        int var27 = var11 << 2;
        int var28 = var16 << 2;
        int var29 = var15 << 2;
        int var30 = var14 << 2;
        int var31 = (var20 - 3) * var18;
        int var32 = var17 * 3;
        if (!arg3) {
            field2495 = true;
        }
        int var33 = var19 * 3;
        int var34 = (var22 - 3) * var21;
        int var35 = var30;
        int var36 = (arg7 - 1) * var27;
        int var37 = var28;
        if (class108.field1650 <= arg0 && arg0 <= class154.field2509) {
            int[] var38 = class114.field1841[arg0];
            int var39 = class32.method278(class32.field540, 1, class61.field1034, arg2 - arg4);
            int var40 = class32.method278(class32.field540, 1, class61.field1034, arg2 + arg4);
            int var41 = class32.method278(class32.field540, 1, class61.field1034, arg2 - var12);
            int var42 = class32.method278(class32.field540, 1, class61.field1034, arg2 + var12);
            class224.method1504(arg6, var41, var39, var38, 7);
            class224.method1504(arg1, var42, var41, var38, 7);
            class224.method1504(arg6, var40, var42, var38, 7);
        }
        int var43 = (var13 - 1) * var29;
        while (var9 > 0) {
            if (var23 < 0) {
                while (var23 < 0) {
                    var8++;
                    var23 += var32;
                    var32 += var30;
                    var26 += var35;
                    var35 += var30;
                }
            }
            if (var26 < 0) {
                var26 += var35;
                var8++;
                var23 += var32;
                var35 += var30;
                var32 += var30;
            }
            var23 += -var36;
            var36 -= var27;
            boolean var44 = var13 >= var9;
            if (var44) {
                if (var24 < 0) {
                    while (var24 < 0) {
                        var25 += var37;
                        var37 += var28;
                        var24 += var33;
                        var33 += var28;
                        var10++;
                    }
                }
                if (var25 < 0) {
                    var24 += var33;
                    var10++;
                    var25 += var37;
                    var33 += var28;
                    var37 += var28;
                }
                var24 += -var43;
                var43 -= var29;
                var25 += -var34;
                var34 -= var29;
            }
            var9--;
            var26 += -var31;
            int var45 = arg0 - var9;
            var31 -= var27;
            int var46 = arg0 + var9;
            if (var46 >= class108.field1650 && var45 <= class154.field2509) {
                int var47 = class32.method278(class32.field540, 1, class61.field1034, arg2 + var8);
                int var48 = class32.method278(class32.field540, 1, class61.field1034, arg2 - var8);
                if (var44) {
                    int var49 = class32.method278(class32.field540, 1, class61.field1034, arg2 + var10);
                    int var50 = class32.method278(class32.field540, 1, class61.field1034, arg2 - var10);
                    if (class108.field1650 <= var45) {
                        int[] var51 = class114.field1841[var45];
                        class224.method1504(arg6, var50, var48, var51, 7);
                        class224.method1504(arg1, var49, var50, var51, 7);
                        class224.method1504(arg6, var47, var49, var51, 7);
                    }
                    if (var46 <= class154.field2509) {
                        int[] var52 = class114.field1841[var46];
                        class224.method1504(arg6, var50, var48, var52, 7);
                        class224.method1504(arg1, var49, var50, var52, 7);
                        class224.method1504(arg6, var47, var49, var52, 7);
                    }
                } else {
                    if (var45 >= class108.field1650) {
                        class224.method1504(arg6, var47, var48, class114.field1841[var45], 7);
                    }
                    if (class154.field2509 >= var46) {
                        class224.method1504(arg6, var47, var48, class114.field1841[var46], 7);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!wd", name = "e", descriptor = "(I)Lbf;")
    public static final class102 method1110(int arg0) {
        int var1 = class4.field56[0] * class19.field268[0];
        field2498++;
        byte[] var2 = class66.field1082[0];
        int[] var3 = new int[var1];
        for (int var4 = 0; var4 < var1; var4++) {
            var3[var4] = class244.field3857[class64.method498(255, var2[var4])];
        }
        class17 var5 = new class17(class287.field4592, class20.field315, class193.field3155[0], class197.field3224[0], class4.field56[0], class19.field268[0], var3);
        if (arg0 != 18975) {
            method1109(-81, 96, -60, false, -48, 124, 49, 37);
        }
        class213.method1410(0);
        return var5;
    }
}
