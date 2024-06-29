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

@OriginalClass("client!ih")
public class class219 {

    @OriginalMember(owner = "client!ih", name = "m", descriptor = "Lec;")
    public static class25 field3502 = new class25(64);

    @OriginalMember(owner = "client!ih", name = "o", descriptor = "I")
    public static int field3504 = 0;

    @OriginalMember(owner = "client!ih", name = "p", descriptor = "S")
    public static short field3505 = 1;

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "I")
    public int field3490;

    @OriginalMember(owner = "client!ih", name = "b", descriptor = "I")
    public static int field3491;

    @OriginalMember(owner = "client!ih", name = "c", descriptor = "I")
    public int field3492;

    @OriginalMember(owner = "client!ih", name = "d", descriptor = "I")
    public int field3493;

    @OriginalMember(owner = "client!ih", name = "e", descriptor = "I")
    public static int field3494;

    @OriginalMember(owner = "client!ih", name = "f", descriptor = "I")
    public int field3495;

    @OriginalMember(owner = "client!ih", name = "g", descriptor = "I")
    public static int field3496;

    @OriginalMember(owner = "client!ih", name = "h", descriptor = "I")
    public int field3497;

    @OriginalMember(owner = "client!ih", name = "i", descriptor = "I")
    public int field3498;

    @OriginalMember(owner = "client!ih", name = "j", descriptor = "I")
    public static int field3499;

    @OriginalMember(owner = "client!ih", name = "k", descriptor = "I")
    public static int field3500;

    @OriginalMember(owner = "client!ih", name = "l", descriptor = "I")
    public static int field3501;

    @OriginalMember(owner = "client!ih", name = "n", descriptor = "I")
    public static int field3503;

    @OriginalMember(owner = "client!ih", name = "q", descriptor = "[[[B")
    public static byte[][][] field3506;

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(IZ)V")
    public static final void method1529(int arg0, boolean arg1) {
        if (arg0 != -198) {
            method1535((byte) 20, (class201) null, 70);
        }
        for (class145 var2 = (class145) class226.field3589.method1959(arg0 ^ 0xFFFFFFF7); var2 != null; var2 = (class145) class226.field3589.method1956(126)) {
            if (var2.field2290 != null) {
                class71.field1024.method597(var2.field2290);
                var2.field2290 = null;
            }
            if (var2.field2286 != null) {
                class71.field1024.method597(var2.field2286);
                var2.field2286 = null;
            }
            var2.method900(71);
        }
        field3491++;
        if (!arg1) {
            return;
        }
        for (class145 var3 = (class145) class66.field976.method1959(arg0 + 403); var3 != null; var3 = (class145) class66.field976.method1956(118)) {
            if (var3.field2290 != null) {
                class71.field1024.method597(var3.field2290);
                var3.field2290 = null;
            }
            var3.method900(arg0 ^ 0xFFFFFF02);
        }
        for (class145 var4 = (class145) class89.field1371.method871(-36); var4 != null; var4 = (class145) class89.field1371.method869(-14210)) {
            if (var4.field2290 != null) {
                class71.field1024.method597(var4.field2290);
                var4.field2290 = null;
            }
            var4.method900(arg0 ^ 0xFFFFFF1F);
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(I)V")
    public static void method1530(int arg0) {
        field3506 = null;
        if (arg0 == -1) {
            field3502 = null;
        }
    }

    @OriginalMember(owner = "client!ih", name = "b", descriptor = "(I)V")
    public static final void method1531(int arg0) {
        class70.field1018 = 0;
        class138.field2142 = 0;
        class215.method1505(true);
        class53.method317((byte) -108);
        field3496++;
        if (arg0 != -21836) {
            field3506 = null;
        }
        class276.method1920(-68);
        for (int var1 = 0; var1 < class138.field2142; var1++) {
            int var3 = class261.field4267[var1];
            if (class4.field32 != class76.field1188[var3].field860) {
                if (class76.field1188[var3].field442.method690(arg0 + 21836)) {
                    class48.method299(arg0 + 21907, class76.field1188[var3]);
                }
                class76.field1188[var3].method214((class106) null, (byte) -39);
                class76.field1188[var3] = null;
            }
        }
        if (class20.field272 != class192.field3042.field3272) {
            throw new RuntimeException("gnp1 pos:" + class192.field3042.field3272 + " psize:" + class20.field272);
        }
        for (int var2 = 0; var2 < class14.field195; var2++) {
            if (class76.field1188[class76.field1189[var2]] == null) {
                throw new RuntimeException("gnp2 pos:" + var2 + " size:" + class14.field195);
            }
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(ZLkk;III)V")
    public static final void method1532(boolean arg0, class254 arg1, int arg2, int arg3, int arg4) {
        int var5 = arg1.field4085;
        if (arg3 != -1) {
            method1536((byte) -25, (class202) null);
        }
        int var6 = arg1.field4152;
        field3499++;
        if (arg1.field4035 == 0) {
            arg1.field4152 = arg1.field4106;
        } else if (arg1.field4035 == 1) {
            arg1.field4152 = arg4 - arg1.field4106;
        } else if (arg1.field4035 == 2) {
            arg1.field4152 = arg1.field4106 * arg4 >> 14;
        } else if (arg1.field4035 == 3) {
            if (arg1.field4052 == 2) {
                arg1.field4152 = (arg1.field4106 - 1) * arg1.field4109 + arg1.field4106 * 32;
            } else if (arg1.field4052 == 7) {
                arg1.field4152 = arg1.field4106 * 12 + ((arg1.field4106 - 1) * arg1.field4109);
            }
        }
        if (arg1.field4155 == 0) {
            arg1.field4085 = arg1.field4105;
        } else if (arg1.field4155 == 1) {
            arg1.field4085 = arg2 - arg1.field4105;
        } else if (arg1.field4155 == 2) {
            arg1.field4085 = arg1.field4105 * arg2 >> 14;
        } else if (arg1.field4155 == 3) {
            if (arg1.field4052 == 2) {
                arg1.field4085 = arg1.field4105 * 32 + ((arg1.field4105 - 1) * arg1.field4147);
            } else if (arg1.field4052 == 7) {
                arg1.field4085 = (arg1.field4105 - 1) * arg1.field4147 + arg1.field4105 * 115;
            }
        }
        if (arg1.field4155 == 4) {
            arg1.field4085 = arg1.field4152 * arg1.field4050 / arg1.field4127;
        }
        if (arg1.field4035 == 4) {
            arg1.field4152 = arg1.field4127 * arg1.field4085 / arg1.field4050;
        }
        if (class266.field4381 && (client.method1085(arg1).field3765 != 0 || arg1.field4052 == 0)) {
            if (arg1.field4152 < 5 && arg1.field4085 < 5) {
                arg1.field4085 = 5;
                arg1.field4152 = 5;
            } else {
                if (arg1.field4085 <= 0) {
                    arg1.field4085 = 5;
                }
                if (arg1.field4152 <= 0) {
                    arg1.field4152 = 5;
                }
            }
        }
        if (arg1.field4060 == 1337) {
            class22.field296 = arg1;
        }
        if (arg0 && arg1.field4177 != null && arg1.field4085 != var5 || arg1.field4152 != var6) {
            class298 var7 = new class298();
            var7.field4905 = arg1.field4177;
            var7.field4906 = arg1;
            class276.field4573.method1952(var7, arg3 ^ 0xFFFFFFB3);
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(ZI)V")
    public static final void method1533(boolean arg0, int arg1) {
        class10.method56(class160.field2523, class79.field1254, class169.field2644, arg0, (byte) -118);
        field3501++;
        int var2 = -62 % ((10 - arg1) / 61);
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(BJ)V")
    public static final void method1534(byte arg0, long arg1) {
        if (class92.field1402 == 1 || class92.field1402 == 5) {
            class157.method1041(arg1, (byte) -126);
        } else if (class92.field1402 == 2) {
            class192.method1335(5000);
        } else if (class92.field1402 == 4) {
            class71.method450(arg0 ^ 0xE, arg1);
        } else {
            class121.method789(0);
        }
        if (!class220.field3525) {
            class70.field1016[0] = 1005;
            class178.field2773[0] = class84.field1332;
            class214.field3420[0] = class276.field4574;
            if (class145.field2280 != 0) {
                class262.field4331 = field3504;
                class265.field4367 = class230.field3686;
            } else if (class102.field1548 == 0) {
                class262.field4331 = class60.field924;
                class265.field4367 = class1.field1;
            } else {
                class265.field4367 = class199.field3158;
                class262.field4331 = class218.field3483;
            }
            class18.field251 = 1;
            class156.field2472[0] = "";
        }
        field3494++;
        class77.method505((long) class4.field32);
        if (class160.field2523 != -1) {
            class105.method676(class160.field2523, arg0 - 140);
        }
        for (int var3 = 0; var3 < class249.field3967; var3++) {
            if (class283.field4731[var3]) {
                class241.field3799[var3] = true;
            }
            class169.field2640[var3] = class283.field4731[var3];
            class283.field4731[var3] = false;
        }
        class117.field1772 = null;
        class128.field1971 = -1;
        class90.field1387 = class4.field32;
        if (arg0 != 102) {
            return;
        }
        class218.field3480 = null;
        class256.field4228 = -1;
        if (class160.field2523 != -1) {
            class249.field3967 = 0;
            class160.method1062((byte) 42);
        }
        class62.method387();
        class283.method2000((byte) -117);
        if (class220.field3525) {
            if (class163.field2563) {
                class223.method1559((byte) -77);
            } else {
                class27.method166(6);
            }
        } else if (class117.field1772 != null) {
            class195.method1356(class198.field3144, class72.field1039, (byte) 17, class117.field1772);
        } else if (class128.field1971 != -1) {
            class195.method1356(class128.field1971, class256.field4228, (byte) 17, (class254) null);
        }
        int var4 = class220.field3525 ? -1 : class37.method228((byte) -41);
        if (var4 == -1) {
            var4 = class246.field3926;
        }
        class92.method600(false, var4);
        if (class301.field4937 == 1) {
            class301.field4937 = 2;
        }
        if (class183.field2849 == 1) {
            class183.field2849 = 2;
        }
        if (class37.field482 == 3) {
            for (int var5 = 0; var5 < class249.field3967; var5++) {
                if (class169.field2640[var5]) {
                    class62.method395(class310.field5013[var5], class73.field1059[var5], class260.field4266[var5], class150.field2341[var5], 16711935, 128);
                } else if (class241.field3799[var5]) {
                    class62.method395(class310.field5013[var5], class73.field1059[var5], class260.field4266[var5], class150.field2341[var5], 16711680, 128);
                }
            }
        }
        class299.method2073(125, class309.field5006.field836, class247.field3938, class165.field2600, class309.field5006.field850);
        class247.field3938 = 0;
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(BLul;I)V")
    public static final void method1535(byte arg0, class201 arg1, int arg2) {
        field3500++;
        if (arg0 <= 53) {
            method1533(false, -34);
        }
        while (true) {
            class296 var3 = (class296) class163.field2568.method1959(205);
            if (var3 == null) {
                return;
            }
            boolean var4 = false;
            for (int var5 = 0; var5 < var3.field4859; var5++) {
                if (var3.field4860[var5] != null) {
                    if (var3.field4860[var5].field725 == 2) {
                        var3.field4873[var5] = -5;
                    }
                    if (var3.field4860[var5].field725 == 0) {
                        var4 = true;
                    }
                }
                if (var3.field4865[var5] != null) {
                    if (var3.field4865[var5].field725 == 2) {
                        var3.field4873[var5] = -6;
                    }
                    if (var3.field4865[var5].field725 == 0) {
                        var4 = true;
                    }
                }
            }
            if (var4) {
                return;
            }
            arg1.method1391(0, arg2);
            arg1.method1446((byte) 29, 0);
            int var6 = arg1.field3272;
            arg1.method1425(var3.field4863, (byte) -99);
            for (int var7 = 0; var7 < var3.field4859; var7++) {
                if (var3.field4873[var7] == 0) {
                    try {
                        int var8 = var3.field4868[var7];
                        if (var8 == 0) {
                            Field var12 = (Field) var3.field4860[var7].field723;
                            int var13 = var12.getInt((Object) null);
                            arg1.method1446((byte) 111, 0);
                            arg1.method1425(var13, (byte) -100);
                        } else if (var8 == 1) {
                            Field var11 = (Field) var3.field4860[var7].field723;
                            var11.setInt((Object) null, var3.field4870[var7]);
                            arg1.method1446((byte) 76, 0);
                        } else if (var8 == 2) {
                            Field var9 = (Field) var3.field4860[var7].field723;
                            int var10 = var9.getModifiers();
                            arg1.method1446((byte) 79, 0);
                            arg1.method1425(var10, (byte) -126);
                        }
                        if (var8 == 3) {
                            Method var14 = (Method) var3.field4865[var7].field723;
                            byte[][] var15 = var3.field4874[var7];
                            Object[] var16 = new Object[var15.length];
                            for (int var17 = 0; var17 < var15.length; var17++) {
                                ObjectInputStream var18 = new ObjectInputStream(new ByteArrayInputStream(var15[var17]));
                                var16[var17] = var18.readObject();
                            }
                            Object var19 = var14.invoke((Object) null, var16);
                            if (var19 == null) {
                                arg1.method1446((byte) 49, 0);
                            } else if ((var19 instanceof Number)) {
                                arg1.method1446((byte) 127, 1);
                                arg1.method1413(-349748560, ((Number) var19).longValue());
                            } else if ((var19 instanceof String)) {
                                arg1.method1446((byte) 108, 2);
                                arg1.method1409((String) var19, (byte) 77);
                            } else {
                                arg1.method1446((byte) 126, 4);
                            }
                        } else if (var8 == 4) {
                            Method var20 = (Method) var3.field4865[var7].field723;
                            int var21 = var20.getModifiers();
                            arg1.method1446((byte) 93, 0);
                            arg1.method1425(var21, (byte) -98);
                        }
                    } catch (ClassNotFoundException var22) {
                        arg1.method1446((byte) 100, -10);
                    } catch (InvalidClassException var23) {
                        arg1.method1446((byte) 33, -11);
                    } catch (StreamCorruptedException var24) {
                        arg1.method1446((byte) 54, -12);
                    } catch (OptionalDataException var25) {
                        arg1.method1446((byte) 112, -13);
                    } catch (IllegalAccessException var26) {
                        arg1.method1446((byte) 119, -14);
                    } catch (IllegalArgumentException var27) {
                        arg1.method1446((byte) 66, -15);
                    } catch (InvocationTargetException var28) {
                        arg1.method1446((byte) 91, -16);
                    } catch (SecurityException var29) {
                        arg1.method1446((byte) 81, -17);
                    } catch (IOException var30) {
                        arg1.method1446((byte) 109, -18);
                    } catch (NullPointerException var31) {
                        arg1.method1446((byte) 107, -19);
                    } catch (Exception var32) {
                        arg1.method1446((byte) 84, -20);
                    } catch (Throwable var33) {
                        arg1.method1446((byte) 107, -21);
                    }
                } else {
                    arg1.method1446((byte) 57, var3.field4873[var7]);
                }
            }
            arg1.method1436(var6, (byte) -127);
            arg1.method1408((byte) 46, arg1.field3272 - var6);
            var3.method900(100);
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(BLma;)Lfb;")
    public static final class31 method1536(byte arg0, class202 arg1) {
        field3503++;
        if (arg0 > -86) {
            field3504 = 75;
        }
        return new class31(arg1.method1442(-1970239824), arg1.method1442(-1970239824), arg1.method1442(-1970239824), arg1.method1442(-1970239824), arg1.method1401((byte) -112), arg1.method1420((byte) 0));
    }
}
