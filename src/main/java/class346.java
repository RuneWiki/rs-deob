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

@OriginalClass("client!gf")
public class class346 {

    @OriginalMember(owner = "client!gf", name = "c", descriptor = "I")
    public static int field4698 = 0;

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "Lrq;")
    public static class35 field4696 = new class35();

    @OriginalMember(owner = "client!gf", name = "g", descriptor = "I")
    public static int field4702 = -1;

    @OriginalMember(owner = "client!gf", name = "b", descriptor = "I")
    public static int field4697;

    @OriginalMember(owner = "client!gf", name = "d", descriptor = "I")
    public static int field4699;

    @OriginalMember(owner = "client!gf", name = "e", descriptor = "I")
    public static int field4700;

    @OriginalMember(owner = "client!gf", name = "f", descriptor = "Lclient;")
    public static client field4701;

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(III)V", line = 6)
    public static final void method2198(int arg0, int arg1, int arg2) {
        field4699++;
        if (arg2 < 6) {
            method2199((class338) null, (byte) 53, 22);
        }
        if ((class224.field2811 < class224.field2814)) {
            class224.field2811 = (float) ((double) class224.field2811 / 30.0D + (double) class224.field2811);
            if (class224.field2814 < class224.field2811) {
                class224.field2811 = class224.field2814;
            }
            class211.method1291(131072);
            class224.field2809 = (int) class224.field2811 >> 1;
            class224.field2808 = class423.method2596(26363, class224.field2809);
        } else if (class224.field2814 < class224.field2811) {
            class224.field2811 = (float) ((double) class224.field2811 - (double) class224.field2811 / 30.0D);
            if (class224.field2814 > class224.field2811) {
                class224.field2811 = class224.field2814;
            }
            class211.method1291(131072);
            class224.field2809 = (int) class224.field2811 >> 1;
            class224.field2808 = class423.method2596(26363, class224.field2809);
        }
        if (class419.field5717 != -1 && class157.field1832 != -1) {
            int var3 = class419.field5717 - class54.field633;
            if (var3 < 2 || var3 > 2) {
                var3 /= 8;
            }
            int var4 = class157.field1832 - class394.field5366;
            if (var4 < 2 || var4 > 2) {
                var4 /= 8;
            }
            class54.field633 += var3;
            class394.field5366 += var4;
            if (var3 == 0 && var4 == 0) {
                class419.field5717 = -1;
                class157.field1832 = -1;
            }
            class211.method1291(131072);
        }
        if (class76.field943 <= 0) {
            class373.field5052 = -1;
            class42.field501 = -1;
        } else {
            class390.field5325--;
            if (class390.field5325 == 0) {
                class76.field943--;
                class390.field5325 = 100;
            }
        }
        if (!class287.field3783 || class141.field1663 == null) {
            return;
        }
        for (class428 var5 = (class428) class141.field1663.method1690((byte) -107); var5 != null; var5 = (class428) class141.field1663.method1699((byte) 40)) {
            class222 var6 = class339.method2178(false, var5.field5862.field3596);
            if (class38.field453 == 0 && var5.method2612(arg1, (byte) -106, arg0)) {
                if (var6.field2751 != null) {
                    if (var6.field2751[4] != null) {
                        class300.method1908(-1, var6.field2747, 0, 672, (long) var5.field5862.field3596, var6.field2751[4], var6.field2784, 1004);
                    }
                    if (var6.field2751[3] != null) {
                        class300.method1908(-1, var6.field2747, 0, 672, (long) var5.field5862.field3596, var6.field2751[3], var6.field2784, 1008);
                    }
                    if (var6.field2751[2] != null) {
                        class300.method1908(-1, var6.field2747, 0, 672, (long) var5.field5862.field3596, var6.field2751[2], var6.field2784, 1006);
                    }
                    if (var6.field2751[1] != null) {
                        class300.method1908(-1, var6.field2747, 0, 672, (long) var5.field5862.field3596, var6.field2751[1], var6.field2784, 1007);
                    }
                    if (var6.field2751[0] != null) {
                        class300.method1908(-1, var6.field2747, 0, 672, (long) var5.field5862.field3596, var6.field2751[0], var6.field2784, 1003);
                    }
                }
                if (!var5.field5862.field3598) {
                    var5.field5862.field3598 = true;
                    class93.method577(15, var5.field5862.field3596, var6.field2784);
                }
                if (var5.field5862.field3598) {
                    class93.method577(17, var5.field5862.field3596, var6.field2784);
                }
            } else if (var5.field5862.field3598) {
                var5.field5862.field3598 = false;
                class93.method577(16, var5.field5862.field3596, var6.field2784);
            }
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(Lkl;BI)V", line = 146)
    public static final void method2199(class338 arg0, byte arg1, int arg2) {
        if (arg1 <= 61) {
            field4702 = 126;
        }
        field4697++;
        while (true) {
            class40 var3 = (class40) class306.field4104.method1690((byte) -113);
            if (var3 == null) {
                return;
            }
            boolean var4 = false;
            for (int var5 = 0; var5 < var3.field471; var5++) {
                if (var3.field475[var5] != null) {
                    if (var3.field475[var5].field4244 == 2) {
                        var3.field478[var5] = -5;
                    }
                    if (var3.field475[var5].field4244 == 0) {
                        var4 = true;
                    }
                }
                if (var3.field470[var5] != null) {
                    if (var3.field470[var5].field4244 == 2) {
                        var3.field478[var5] = -6;
                    }
                    if (var3.field470[var5].field4244 == 0) {
                        var4 = true;
                    }
                }
            }
            if (var4) {
                return;
            }
            arg0.method2162(false, arg2);
            arg0.method1593(0, -98);
            int var6 = arg0.field3211;
            arg0.method1560(-26356, var3.field468);
            for (int var7 = 0; var7 < var3.field471; var7++) {
                if (var3.field478[var7] == 0) {
                    try {
                        int var8 = var3.field473[var7];
                        if (var8 == 0) {
                            Field var12 = (Field) var3.field475[var7].field4243;
                            int var13 = var12.getInt((Object) null);
                            arg0.method1593(0, -119);
                            arg0.method1560(-26356, var13);
                        } else if (var8 == 1) {
                            Field var11 = (Field) var3.field475[var7].field4243;
                            var11.setInt((Object) null, var3.field474[var7]);
                            arg0.method1593(0, -97);
                        } else if (var8 == 2) {
                            Field var9 = (Field) var3.field475[var7].field4243;
                            int var10 = var9.getModifiers();
                            arg0.method1593(0, -124);
                            arg0.method1560(-26356, var10);
                        }
                        if (var8 == 3) {
                            Method var16 = (Method) var3.field470[var7].field4243;
                            byte[][] var17 = var3.field476[var7];
                            Object[] var18 = new Object[var17.length];
                            for (int var19 = 0; var19 < var17.length; var19++) {
                                ObjectInputStream var20 = new ObjectInputStream(new ByteArrayInputStream(var17[var19]));
                                var18[var19] = var20.readObject();
                            }
                            Object var21 = var16.invoke((Object) null, var18);
                            if (var21 == null) {
                                arg0.method1593(0, -119);
                            } else if (var21 instanceof Number) {
                                arg0.method1593(1, -115);
                                arg0.method1591(2013886536, ((Number) var21).longValue());
                            } else if (var21 instanceof String) {
                                arg0.method1593(2, -115);
                                arg0.method1562(101, (String) var21);
                            } else {
                                arg0.method1593(4, -126);
                            }
                        } else if (var8 == 4) {
                            Method var14 = (Method) var3.field470[var7].field4243;
                            int var15 = var14.getModifiers();
                            arg0.method1593(0, -104);
                            arg0.method1560(-26356, var15);
                        }
                    } catch (ClassNotFoundException var22) {
                        arg0.method1593(-10, -107);
                    } catch (InvalidClassException var23) {
                        arg0.method1593(-11, -111);
                    } catch (StreamCorruptedException var24) {
                        arg0.method1593(-12, -115);
                    } catch (OptionalDataException var25) {
                        arg0.method1593(-13, -121);
                    } catch (IllegalAccessException var26) {
                        arg0.method1593(-14, -106);
                    } catch (IllegalArgumentException var27) {
                        arg0.method1593(-15, -104);
                    } catch (InvocationTargetException var28) {
                        arg0.method1593(-16, -127);
                    } catch (SecurityException var29) {
                        arg0.method1593(-17, -112);
                    } catch (IOException var30) {
                        arg0.method1593(-18, -119);
                    } catch (NullPointerException var31) {
                        arg0.method1593(-19, -101);
                    } catch (Exception var32) {
                        arg0.method1593(-20, -114);
                    } catch (Throwable var33) {
                        arg0.method1593(-21, -124);
                    }
                } else {
                    arg0.method1593(var3.field478[var7], -128);
                }
            }
            arg0.method1548(var6, 74);
            arg0.method1597(arg0.field3211 - var6, -95);
            var3.method263(false);
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(JB)Ljava/lang/String;", line = 333)
    public static final String method2200(long arg0, byte arg1) {
        field4700++;
        if (arg1 != -4) {
            method2201((byte) -88);
        }
        if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
            return null;
        } else if ((arg0 % 37L) == 0L) {
            return null;
        } else {
            int var3 = 0;
            for (long var4 = arg0; var4 != 0L; var4 /= 37L) {
                var3++;
            }
            StringBuffer var6 = new StringBuffer(var3);
            while (arg0 != 0L) {
                long var7 = arg0;
                arg0 /= 37L;
                char var9 = class134.field1530[(int) (var7 - (arg0 * 37L))];
                if (var9 == '_') {
                    int var10 = var6.length() - 1;
                    var6.setCharAt(var10, Character.toUpperCase(var6.charAt(var10)));
                    var9 = ' ';
                }
                var6.append(var9);
            }
            var6.reverse();
            var6.setCharAt(0, Character.toUpperCase(var6.charAt(0)));
            return var6.toString();
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(B)V", line = 384)
    public static void method2201(byte arg0) {
        if (arg0 != -94) {
            field4701 = null;
        }
        field4696 = null;
        field4701 = null;
    }
}
