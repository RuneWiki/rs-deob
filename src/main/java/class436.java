import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iea")
public class class436 {

    @OriginalMember(owner = "client!iea", name = "d", descriptor = "I")
    public static int field6078 = 0;

    @OriginalMember(owner = "client!iea", name = "a", descriptor = "I")
    public static int field6075;

    @OriginalMember(owner = "client!iea", name = "c", descriptor = "I")
    public static int field6077;

    @OriginalMember(owner = "client!iea", name = "e", descriptor = "I")
    public static int field6079;

    @OriginalMember(owner = "client!iea", name = "b", descriptor = "Ljava/awt/Image;")
    public static Image field6076;

    // $FF: synthetic field
    @OriginalMember(owner = "client!iea", name = "f", descriptor = "Ljava/lang/Class;")
    public static Class field6080;

    @OriginalMember(owner = "client!iea", name = "a", descriptor = "(I)V")
    public static void method2406(int arg0) {
        field6076 = null;
        int var1 = 17 % ((arg0 + 50) / 50);
    }

    @OriginalMember(owner = "client!iea", name = "a", descriptor = "(III)Z")
    public static final boolean method2407(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < class461.field6405; var3++) {
            class32 var4 = class476.field6930[var3];
            if (var4.field372 == 1) {
                int var5 = var4.field374 - arg0;
                if (var5 > 0) {
                    int var6 = (var4.field369 * var5 >> 8) + var4.field376;
                    int var7 = (var4.field357 * var5 >> 8) + var4.field375;
                    int var8 = (var4.field368 * var5 >> 8) + var4.field370;
                    int var9 = (var4.field360 * var5 >> 8) + var4.field371;
                    if (arg2 >= var6 && arg2 <= var7 && arg1 >= var8 && arg1 <= var9) {
                        return true;
                    }
                }
            } else if (var4.field372 == 2) {
                int var10 = arg0 - var4.field374;
                if (var10 > 0) {
                    int var11 = (var4.field369 * var10 >> 8) + var4.field376;
                    int var12 = (var4.field357 * var10 >> 8) + var4.field375;
                    int var13 = (var4.field368 * var10 >> 8) + var4.field370;
                    int var14 = (var4.field360 * var10 >> 8) + var4.field371;
                    if (arg2 >= var11 && arg2 <= var12 && arg1 >= var13 && arg1 <= var14) {
                        return true;
                    }
                }
            } else if (var4.field372 == 3) {
                int var15 = var4.field376 - arg2;
                if (var15 > 0) {
                    int var16 = (var4.field356 * var15 >> 8) + var4.field374;
                    int var17 = (var4.field365 * var15 >> 8) + var4.field373;
                    int var18 = (var4.field368 * var15 >> 8) + var4.field370;
                    int var19 = (var4.field360 * var15 >> 8) + var4.field371;
                    if (arg0 >= var16 && arg0 <= var17 && arg1 >= var18 && arg1 <= var19) {
                        return true;
                    }
                }
            } else if (var4.field372 == 4) {
                int var20 = arg2 - var4.field376;
                if (var20 > 0) {
                    int var21 = (var4.field356 * var20 >> 8) + var4.field374;
                    int var22 = (var4.field365 * var20 >> 8) + var4.field373;
                    int var23 = (var4.field368 * var20 >> 8) + var4.field370;
                    int var24 = (var4.field360 * var20 >> 8) + var4.field371;
                    if (arg0 >= var21 && arg0 <= var22 && arg1 >= var23 && arg1 <= var24) {
                        return true;
                    }
                }
            } else if (var4.field372 == 5) {
                int var25 = arg1 - var4.field370;
                if (var25 > 0) {
                    int var26 = (var4.field356 * var25 >> 8) + var4.field374;
                    int var27 = (var4.field365 * var25 >> 8) + var4.field373;
                    int var28 = (var4.field369 * var25 >> 8) + var4.field376;
                    int var29 = (var4.field357 * var25 >> 8) + var4.field375;
                    if (arg0 >= var26 && arg0 <= var27 && arg2 >= var28 && arg2 <= var29) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!iea", name = "a", descriptor = "(IIBIIIIILoa;)V")
    public static final void method2408(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class635 arg8) {
        field6077++;
        class670 var9 = (class670) class480.method2801(arg7, arg6, arg3);
        if (var9 != null) {
            class335 var10 = class195.field2339.method3729(var9.method444((byte) 119), (byte) 109);
            int var11 = var9.method443((byte) -124) & 0x3;
            int var12 = var9.method447((byte) -91);
            if (var10.field4373 == -1) {
                int var13 = arg0;
                if (var10.field4407 > 0) {
                    var13 = arg1;
                }
                if (var12 == 0 || var12 == 2) {
                    if (var11 == 0) {
                        arg8.method3558(75, var13, arg4, arg5, 4);
                    } else if (var11 == 1) {
                        arg8.method3549(var13, 4, arg5, arg4, (byte) 54);
                    } else if (var11 == 2) {
                        arg8.method3558(arg2 + 137, var13, arg4 + 3, arg5, 4);
                    } else if (var11 == 3) {
                        arg8.method3549(var13, 4, arg5 + 3, arg4, (byte) 54);
                    }
                }
                if (var12 == 3) {
                    if (var11 == 0) {
                        arg8.method3552(1, 1, 7, var13, arg5, arg4);
                    } else if (var11 == 1) {
                        arg8.method3552(1, 1, 7, var13, arg5, arg4 + 3);
                    } else if (var11 == 2) {
                        arg8.method3552(1, 1, arg2 ^ 0xFFFFFFE2, var13, arg5 + 3, arg4 + 3);
                    } else if (var11 == 3) {
                        arg8.method3552(1, 1, 7, var13, arg5 + 3, arg4);
                    }
                }
                if (var12 == 2) {
                    if (var11 == 0) {
                        arg8.method3549(var13, 4, arg5, arg4, (byte) 54);
                    } else if (var11 == 1) {
                        arg8.method3558(106, var13, arg4 + 3, arg5, 4);
                    } else if (var11 == 2) {
                        arg8.method3549(var13, 4, arg5 + 3, arg4, (byte) 54);
                    } else if (var11 == 3) {
                        arg8.method3558(74, var13, arg4, arg5, 4);
                    }
                }
            } else {
                class639.method3601(var10, arg8, arg5, arg4, 111, var11);
            }
        }
        class670 var14 = (class670) class396.method2163(arg7, arg6, arg3, field6080 == null ? (field6080 = method2411("ql")) : field6080);
        if (var14 != null) {
            class335 var15 = class195.field2339.method3729(var14.method444((byte) 74), (byte) 109);
            int var16 = var14.method443((byte) -123) & 0x3;
            int var17 = var14.method447((byte) -91);
            if (var15.field4373 != -1) {
                class639.method3601(var15, arg8, arg5, arg4, -13, var16);
            } else if (var17 == 9) {
                int var18 = -1118482;
                if (var15.field4407 > 0) {
                    var18 = -1179648;
                }
                if (var16 == 0 || var16 == 2) {
                    arg8.method3554(var18, arg4 + 3, arg4, arg5, arg2 ^ 0xFFFFE6DE, arg5 + 3);
                } else {
                    arg8.method3554(var18, arg4 + 3, arg4, arg5 + 3, 6459, arg5);
                }
            }
        }
        class670 var19 = (class670) class606.method3380(arg7, arg6, arg3);
        if (var19 != null) {
            class335 var20 = class195.field2339.method3729(var19.method444((byte) 117), (byte) 109);
            int var21 = var19.method443((byte) -120) & 0x3;
            if (var20.field4373 != -1) {
                class639.method3601(var20, arg8, arg5, arg4, 121, var21);
            }
        }
        if (arg2 != -27) {
            field6078 = -127;
        }
    }

    @OriginalMember(owner = "client!iea", name = "a", descriptor = "(JJ)J")
    public static long method2409(long arg0, long arg1) {
        return arg0 & arg1;
    }

    @OriginalMember(owner = "client!iea", name = "a", descriptor = "(Z)V")
    public static final void method2410(boolean arg0) {
        class381.field4954 = 0;
        field6075++;
        int var1 = class680.field9630.method2558((byte) -91);
        boolean var2 = class680.field9630.method2563(-2263) == 1;
        int var3 = class680.field9630.method2563(-2263);
        int var4 = class680.field9630.method2574(-1758460248);
        class508.method2916((byte) -55);
        class345.method1919((byte) -63, var3);
        int var5 = (class478.field7009 - class680.field9630.field6215) / 16;
        class233.field2974 = new int[var5][4];
        for (int var6 = 0; var6 < var5; var6++) {
            for (int var10 = 0; var10 < 4; var10++) {
                class233.field2974[var6][var10] = class680.field9630.method2575((byte) -48);
            }
        }
        class583.field8295 = new byte[var5][];
        class196.field2362 = new byte[var5][];
        class292.field3763 = null;
        class383.field5136 = new int[var5];
        class136.field1556 = new int[var5];
        client.field3410 = null;
        class309.field4014 = new byte[var5][];
        class498.field7189 = new int[var5];
        class287.field3696 = new int[var5];
        class21.field185 = new int[var5];
        class351.field4603 = new byte[var5][];
        if (!arg0) {
            return;
        }
        int var7 = 0;
        for (int var8 = (var1 - (class399.field5338 >> 4)) / 8; var8 <= ((class399.field5338 >> 4) + var1) / 8; var8++) {
            for (int var9 = (var4 - (class349.field4567 >> 4)) / 8; var9 <= (var4 + (class349.field4567 >> 4)) / 8; var9++) {
                class287.field3696[var7] = (var8 << 8) + var9;
                class498.field7189[var7] = class299.field3914.method1716(arg0, "m" + var8 + "_" + var9);
                class136.field1556[var7] = class299.field3914.method1716(arg0, "l" + var8 + "_" + var9);
                class383.field5136[var7] = class299.field3914.method1716(arg0, "um" + var8 + "_" + var9);
                class21.field185[var7] = class299.field3914.method1716(arg0, "ul" + var8 + "_" + var9);
                var7++;
            }
        }
        class162.method975(var1, var2, var4, 11, (byte) 88);
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!iea", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method2411(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
