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

@OriginalClass("client!gi")
public class class157 {

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "Lwa;")
    public static class265 field2441 = null;

    @OriginalMember(owner = "client!gi", name = "g", descriptor = "[I")
    public static int[] field2447 = new int[5];

    @OriginalMember(owner = "client!gi", name = "h", descriptor = "I")
    public static int field2448 = 0;

    @OriginalMember(owner = "client!gi", name = "c", descriptor = "I")
    public static int field2443 = 0;

    @OriginalMember(owner = "client!gi", name = "e", descriptor = "F")
    public static float field2445 = 0.0F;

    @OriginalMember(owner = "client!gi", name = "b", descriptor = "I")
    public static int field2442;

    @OriginalMember(owner = "client!gi", name = "d", descriptor = "I")
    public static int field2444;

    @OriginalMember(owner = "client!gi", name = "f", descriptor = "I")
    public static int field2446;

    @OriginalMember(owner = "client!gi", name = "i", descriptor = "I")
    public static int field2449;

    @OriginalMember(owner = "client!gi", name = "j", descriptor = "I")
    public static int field2450;

    @OriginalMember(owner = "client!gi", name = "k", descriptor = "I")
    public static int field2451;

    @OriginalMember(owner = "client!gi", name = "m", descriptor = "I")
    public static int field2453;

    @OriginalMember(owner = "client!gi", name = "l", descriptor = "Lnh;")
    public static class55 field2452;

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(IB)V")
    public static final void method1061(int arg0, byte arg1) {
        field2442++;
        short var2 = 256;
        if (arg0 > var2) {
            arg0 = var2;
        }
        if (arg0 > 10) {
            arg0 = 10;
        }
        class84.field1424 += arg0 * 128;
        if (class89.field1557.length < class84.field1424) {
            class84.field1424 -= class89.field1557.length;
            int var3 = (int) (Math.random() * 12.0D);
            class271.method1835(class30.field422[var3], true);
        }
        int var4 = 0;
        int var5 = (var2 - arg0) * 128;
        int var6 = arg0 * 128;
        for (int var7 = 0; var7 < var5; var7++) {
            int var26 = class33.field502[var4 + var6] - class89.field1557[class84.field1424 + var4 & class89.field1557.length + -1] * arg0 / 6;
            if (var26 < 0) {
                var26 = 0;
            }
            class33.field502[var4++] = var26;
        }
        for (int var8 = var2 - arg0; var8 < var2; var8++) {
            int var23 = var8 * 128;
            for (int var24 = 0; var24 < 128; var24++) {
                int var25 = (int) (Math.random() * 100.0D);
                if (var25 < 50 && var24 > 10 && var24 < 118) {
                    class33.field502[var23 + var24] = 255;
                } else {
                    class33.field502[var23 + var24] = 0;
                }
            }
        }
        if (arg1 > -41) {
            field2441 = null;
        }
        for (int var9 = 0; var9 < (var2 - arg0); var9++) {
            class192.field2975[var9] = class192.field2975[arg0 + var9];
        }
        for (int var10 = var2 - arg0; var10 < var2; var10++) {
            class192.field2975[var10] = (int) (Math.sin((double) class155.field2414 / 14.0D) * 16.0D + Math.sin((double) class155.field2414 / 15.0D) * 14.0D + Math.sin((double) class155.field2414 / 16.0D) * 12.0D);
            class155.field2414++;
        }
        class222.field3407 += arg0;
        int var11 = ((class192.field2978 & 0x1) + arg0) / 2;
        if (var11 <= 0) {
            return;
        }
        for (int var12 = 0; var12 < class222.field3407; var12++) {
            int var21 = (int) (Math.random() * 124.0D) + 2;
            int var22 = (int) (Math.random() * 128.0D) + 128;
            class33.field502[var21 + (var22 << 7)] = 192;
        }
        class222.field3407 = 0;
        for (int var13 = 0; var13 < var2; var13++) {
            int var18 = var13 * 128;
            int var19 = 0;
            for (int var20 = -var11; var20 < 128; var20++) {
                if ((var11 + var20) < 128) {
                    var19 += class33.field502[var11 + var18 + var20];
                }
                if (var20 - (var11 + 1) >= 0) {
                    var19 -= class33.field502[var18 + var20 - var11 - 1];
                }
                if (var20 >= 0) {
                    class288.field4570[var18 + var20] = var19 / (var11 * 2 + 1);
                }
            }
        }
        for (int var14 = 0; var14 < 128; var14++) {
            int var15 = 0;
            for (int var16 = -var11; var16 < var2; var16++) {
                int var17 = var16 * 128;
                if (var2 > var16 + var11) {
                    var15 += class288.field4570[var11 * 128 + var14 + var17];
                }
                if (-(var11 - var16) - 1 >= 0) {
                    var15 -= class288.field4570[var14 + var17 - ((var11 + 1) * 128)];
                }
                if (var16 >= 0) {
                    class33.field502[var14 + var17] = var15 / (var11 * 2 + 1);
                }
            }
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(B)V")
    public static void method1062(byte arg0) {
        field2452 = null;
        field2447 = null;
        if (arg0 <= 78) {
            field2448 = 45;
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(Lvg;II)V")
    public static final void method1063(class75 arg0, int arg1, int arg2) {
        field2451++;
        if (arg1 != 0) {
            field2447 = null;
        }
        while (true) {
            class98 var3 = (class98) class296.field4684.method1221(123);
            if (var3 == null) {
                return;
            }
            boolean var4 = false;
            for (int var5 = 0; var5 < var3.field1636; var5++) {
                if (var3.field1634[var5] != null) {
                    if (var3.field1634[var5].field1255 == 2) {
                        var3.field1633[var5] = -5;
                    }
                    if (var3.field1634[var5].field1255 == 0) {
                        var4 = true;
                    }
                }
                if (var3.field1659[var5] != null) {
                    if (var3.field1659[var5].field1255 == 2) {
                        var3.field1633[var5] = -6;
                    }
                    if (var3.field1659[var5].field1255 == 0) {
                        var4 = true;
                    }
                }
            }
            if (var4) {
                return;
            }
            arg0.method536((byte) -104, arg2);
            arg0.method654((byte) -128, 0);
            int var6 = arg0.field1535;
            arg0.method639(var3.field1654, (byte) -115);
            for (int var7 = 0; var7 < var3.field1636; var7++) {
                if (var3.field1633[var7] == 0) {
                    try {
                        int var8 = var3.field1638[var7];
                        if (var8 == 0) {
                            Field var12 = (Field) var3.field1634[var7].field1258;
                            int var13 = var12.getInt((Object) null);
                            arg0.method654((byte) -113, 0);
                            arg0.method639(var13, (byte) -119);
                        } else if (var8 == 1) {
                            Field var9 = (Field) var3.field1634[var7].field1258;
                            var9.setInt((Object) null, var3.field1641[var7]);
                            arg0.method654((byte) -111, 0);
                        } else if (var8 == 2) {
                            Field var10 = (Field) var3.field1634[var7].field1258;
                            int var11 = var10.getModifiers();
                            arg0.method654((byte) -111, 0);
                            arg0.method639(var11, (byte) -103);
                        }
                        if (var8 == 3) {
                            Method var14 = (Method) var3.field1659[var7].field1258;
                            byte[][] var15 = var3.field1653[var7];
                            Object[] var16 = new Object[var15.length];
                            for (int var17 = 0; var17 < var15.length; var17++) {
                                ObjectInputStream var18 = new ObjectInputStream(new ByteArrayInputStream(var15[var17]));
                                var16[var17] = var18.readObject();
                            }
                            Object var19 = var14.invoke((Object) null, var16);
                            if (var19 == null) {
                                arg0.method654((byte) -96, 0);
                            } else if ((var19 instanceof Number)) {
                                arg0.method654((byte) -119, 1);
                                arg0.method638(((Number) var19).longValue(), false);
                            } else if (var19 instanceof String) {
                                arg0.method654((byte) -109, 2);
                                arg0.method680((String) var19, (byte) 101);
                            } else {
                                arg0.method654((byte) -96, 4);
                            }
                        } else if (var8 == 4) {
                            Method var20 = (Method) var3.field1659[var7].field1258;
                            int var21 = var20.getModifiers();
                            arg0.method654((byte) -96, 0);
                            arg0.method639(var21, (byte) -112);
                        }
                    } catch (ClassNotFoundException var22) {
                        arg0.method654((byte) -127, -10);
                    } catch (InvalidClassException var23) {
                        arg0.method654((byte) -104, -11);
                    } catch (StreamCorruptedException var24) {
                        arg0.method654((byte) -127, -12);
                    } catch (OptionalDataException var25) {
                        arg0.method654((byte) -109, -13);
                    } catch (IllegalAccessException var26) {
                        arg0.method654((byte) -98, -14);
                    } catch (IllegalArgumentException var27) {
                        arg0.method654((byte) -101, -15);
                    } catch (InvocationTargetException var28) {
                        arg0.method654((byte) -117, -16);
                    } catch (SecurityException var29) {
                        arg0.method654((byte) -128, -17);
                    } catch (IOException var30) {
                        arg0.method654((byte) -93, -18);
                    } catch (NullPointerException var31) {
                        arg0.method654((byte) -125, -19);
                    } catch (Exception var32) {
                        arg0.method654((byte) -123, -20);
                    } catch (Throwable var33) {
                        arg0.method654((byte) -121, -21);
                    }
                } else {
                    arg0.method654((byte) -115, var3.field1633[var7]);
                }
            }
            arg0.method628(var6, 3);
            arg0.method648(1210551352, arg0.field1535 - var6);
            var3.method1123(arg1);
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(Ljava/lang/String;CI)I")
    public static final int method1064(String arg0, char arg1, int arg2) {
        field2453++;
        int var3 = 0;
        if (arg2 != -22452) {
            return -60;
        }
        int var4 = arg0.length();
        for (int var5 = 0; var5 < var4; var5++) {
            if (arg1 == arg0.charAt(var5)) {
                var3++;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(I)V")
    public static final void method1065(int arg0) {
        class115.field1872.method1898((byte) -92);
        field2450++;
        class269.field4300.method1898((byte) -83);
        int var1 = -26 / ((arg0 - 47) / 61);
        class231.field3670.method1898((byte) 85);
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(IZLg;Lg;Z)I")
    public static final int method1066(int arg0, boolean arg1, class284 arg2, class284 arg3, boolean arg4) {
        field2444++;
        if (!arg4) {
            method1064((String) null, (char) 65509, -60);
        }
        if (arg0 == 1) {
            int var5 = arg2.field651;
            int var6 = arg3.field651;
            if (!arg1) {
                if (var6 == -1) {
                    var6 = 2001;
                }
                if (var5 == -1) {
                    var5 = 2001;
                }
            }
            return var6 - var5;
        } else if (arg0 == 2) {
            return class37.method273(-976486868, arg2.method1907(0).field2320, arg3.method1907(0).field2320, class177.field2770);
        } else if (arg0 == 3) {
            if (arg3.field4507.equals("-")) {
                if (arg2.field4507.equals("-")) {
                    return 0;
                } else if (arg1) {
                    return -1;
                } else {
                    return 1;
                }
            } else if (arg2.field4507.equals("-")) {
                return arg1 ? 1 : -1;
            } else {
                return class37.method273(-976486868, arg2.field4507, arg3.field4507, class177.field2770);
            }
        } else if (arg0 == 4) {
            if (arg3.method331(-1)) {
                return arg2.method331(-1) ? 0 : 1;
            } else if (arg2.method331(-1)) {
                return -1;
            } else {
                return 0;
            }
        } else if (arg0 == 5) {
            if (arg3.method333(-7149)) {
                return arg2.method333(-7149) ? 0 : 1;
            } else if (arg2.method333(-7149)) {
                return -1;
            } else {
                return 0;
            }
        } else if (arg0 == 6) {
            if (arg3.method334((byte) -125)) {
                return arg2.method334((byte) -126) ? 0 : 1;
            } else if (arg2.method334((byte) -127)) {
                return -1;
            } else {
                return 0;
            }
        } else if (arg0 != 7) {
            return arg3.field4508 - arg2.field4508;
        } else if (arg3.method332(7129)) {
            return arg2.method332(7129) ? 0 : 1;
        } else if (arg2.method332(7129)) {
            return -1;
        } else {
            return 0;
        }
    }
}
