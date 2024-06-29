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

@OriginalClass("client!l")
public class class123 {

    @OriginalMember(owner = "client!l", name = "g", descriptor = "I")
    public static int field2033 = 128;

    @OriginalMember(owner = "client!l", name = "f", descriptor = "Ltl;")
    public static class59 field2032 = class85.method639(")2", 9588);

    @OriginalMember(owner = "client!l", name = "m", descriptor = "Z")
    public static boolean field2039 = false;

    @OriginalMember(owner = "client!l", name = "o", descriptor = "I")
    public static int field2041 = 10;

    @OriginalMember(owner = "client!l", name = "c", descriptor = "Ltl;")
    public static class59 field2029 = class85.method639("Ausw-=hlen", 9588);

    @OriginalMember(owner = "client!l", name = "p", descriptor = "Ltl;")
    public static class59 field2042 = class85.method639("null", 9588);

    @OriginalMember(owner = "client!l", name = "b", descriptor = "I")
    public static int field2028;

    @OriginalMember(owner = "client!l", name = "d", descriptor = "I")
    public static int field2030;

    @OriginalMember(owner = "client!l", name = "e", descriptor = "I")
    public int field2031;

    @OriginalMember(owner = "client!l", name = "h", descriptor = "I")
    public int field2034;

    @OriginalMember(owner = "client!l", name = "j", descriptor = "I")
    public static int field2036;

    @OriginalMember(owner = "client!l", name = "k", descriptor = "I")
    public int field2037;

    @OriginalMember(owner = "client!l", name = "l", descriptor = "I")
    public static int field2038;

    @OriginalMember(owner = "client!l", name = "n", descriptor = "Z")
    public static boolean field2040;

    @OriginalMember(owner = "client!l", name = "i", descriptor = "[[B")
    public static byte[][] field2035;

    @OriginalMember(owner = "client!l", name = "a", descriptor = "[[[B")
    public static byte[][][] field2027;

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(I)V", line = 7)
    public static void method912(int arg0) {
        field2027 = (byte[][][]) null;
        if (arg0 != 8) {
            method913(-83, -96, 14);
        }
        field2042 = null;
        field2035 = (byte[][]) null;
        field2032 = null;
        field2029 = null;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(III)Z", line = 30)
    public static final boolean method913(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < class255.field4234; var3++) {
            class86 var4 = class154.field2517[var3];
            if (var4.field1348 == 1) {
                int var5 = var4.field1365 - arg0;
                if (var5 > 0) {
                    int var6 = (var4.field1356 * var5 >> 8) + var4.field1355;
                    int var7 = (var4.field1366 * var5 >> 8) + var4.field1368;
                    int var8 = (var4.field1346 * var5 >> 8) + var4.field1352;
                    int var9 = (var4.field1344 * var5 >> 8) + var4.field1364;
                    if (arg2 >= var6 && arg2 <= var7 && arg1 >= var8 && arg1 <= var9) {
                        return true;
                    }
                }
            } else if (var4.field1348 == 2) {
                int var10 = arg0 - var4.field1365;
                if (var10 > 0) {
                    int var11 = (var4.field1356 * var10 >> 8) + var4.field1355;
                    int var12 = (var4.field1366 * var10 >> 8) + var4.field1368;
                    int var13 = (var4.field1346 * var10 >> 8) + var4.field1352;
                    int var14 = (var4.field1344 * var10 >> 8) + var4.field1364;
                    if (arg2 >= var11 && arg2 <= var12 && arg1 >= var13 && arg1 <= var14) {
                        return true;
                    }
                }
            } else if (var4.field1348 == 3) {
                int var15 = var4.field1355 - arg2;
                if (var15 > 0) {
                    int var16 = (var4.field1345 * var15 >> 8) + var4.field1365;
                    int var17 = (var4.field1358 * var15 >> 8) + var4.field1363;
                    int var18 = (var4.field1346 * var15 >> 8) + var4.field1352;
                    int var19 = (var4.field1344 * var15 >> 8) + var4.field1364;
                    if (arg0 >= var16 && arg0 <= var17 && arg1 >= var18 && arg1 <= var19) {
                        return true;
                    }
                }
            } else if (var4.field1348 == 4) {
                int var20 = arg2 - var4.field1355;
                if (var20 > 0) {
                    int var21 = (var4.field1345 * var20 >> 8) + var4.field1365;
                    int var22 = (var4.field1358 * var20 >> 8) + var4.field1363;
                    int var23 = (var4.field1346 * var20 >> 8) + var4.field1352;
                    int var24 = (var4.field1344 * var20 >> 8) + var4.field1364;
                    if (arg0 >= var21 && arg0 <= var22 && arg1 >= var23 && arg1 <= var24) {
                        return true;
                    }
                }
            } else if (var4.field1348 == 5) {
                int var25 = arg1 - var4.field1352;
                if (var25 > 0) {
                    int var26 = (var4.field1345 * var25 >> 8) + var4.field1365;
                    int var27 = (var4.field1358 * var25 >> 8) + var4.field1363;
                    int var28 = (var4.field1356 * var25 >> 8) + var4.field1355;
                    int var29 = (var4.field1366 * var25 >> 8) + var4.field1368;
                    if (arg0 >= var26 && arg0 <= var27 && arg2 >= var28 && arg2 <= var29) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(ILs;)V", line = 158)
    public final void method914(int arg0, class170 arg1) {
        if (arg0 != 1794) {
            return;
        }
        field2036++;
        while (true) {
            int var3 = arg1.method1221(102);
            if (var3 == 0) {
                return;
            }
            this.method915((byte) -67, arg1, var3);
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(BLs;I)V", line = 204)
    private final void method915(byte arg0, class170 arg1, int arg2) {
        if (arg0 != -67) {
            return;
        }
        if (arg2 == 1) {
            this.field2031 = arg1.method1214(arg0 - 18187);
            this.field2037 = arg1.method1221(75);
            this.field2034 = arg1.method1221(109);
        }
        field2038++;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(Lpd;IB)V", line = 230)
    public static final void method916(class253 arg0, int arg1, byte arg2) {
        if (arg2 < 6) {
            return;
        }
        field2028++;
        while (true) {
            class99 var3 = (class99) class284.field4885.method536(2);
            if (var3 == null) {
                return;
            }
            boolean var4 = false;
            for (int var5 = 0; var5 < var3.field1599; var5++) {
                if (var3.field1588[var5] != null) {
                    if (var3.field1588[var5].field4256 == 2) {
                        var3.field1587[var5] = -5;
                    }
                    if (var3.field1588[var5].field4256 == 0) {
                        var4 = true;
                    }
                }
                if (var3.field1593[var5] != null) {
                    if (var3.field1593[var5].field4256 == 2) {
                        var3.field1587[var5] = -6;
                    }
                    if (var3.field1593[var5].field4256 == 0) {
                        var4 = true;
                    }
                }
            }
            if (var4) {
                return;
            }
            arg0.method1768(true, arg1);
            arg0.method1219(0, true);
            int var6 = arg0.field2787;
            arg0.method1213(-1, var3.field1586);
            for (int var7 = 0; var7 < var3.field1599; var7++) {
                if (var3.field1587[var7] == 0) {
                    try {
                        int var8 = var3.field1592[var7];
                        if (var8 == 0) {
                            Field var9 = (Field) var3.field1588[var7].field4255;
                            int var10 = var9.getInt((Object) null);
                            arg0.method1219(0, true);
                            arg0.method1213(-1, var10);
                        } else if (var8 == 1) {
                            Field var13 = (Field) var3.field1588[var7].field4255;
                            var13.setInt((Object) null, var3.field1584[var7]);
                            arg0.method1219(0, true);
                        } else if (var8 == 2) {
                            Field var11 = (Field) var3.field1588[var7].field4255;
                            int var12 = var11.getModifiers();
                            arg0.method1219(0, true);
                            arg0.method1213(-1, var12);
                        }
                        if (var8 == 3) {
                            Method var14 = (Method) var3.field1593[var7].field4255;
                            byte[][] var15 = var3.field1598[var7];
                            Object[] var16 = new Object[var15.length];
                            for (int var17 = 0; var17 < var15.length; var17++) {
                                ObjectInputStream var18 = new ObjectInputStream(new ByteArrayInputStream(var15[var17]));
                                var16[var17] = var18.readObject();
                            }
                            Object var19 = var14.invoke((Object) null, var16);
                            if (var19 == null) {
                                arg0.method1219(0, true);
                            } else if ((var19 instanceof Number)) {
                                arg0.method1219(1, true);
                                arg0.method1206(((Number) var19).longValue(), false);
                            } else if (var19 instanceof class59) {
                                arg0.method1219(2, true);
                                arg0.method1236((byte) 48, (class59) var19);
                            } else {
                                arg0.method1219(4, true);
                            }
                        } else if (var8 == 4) {
                            Method var20 = (Method) var3.field1593[var7].field4255;
                            int var21 = var20.getModifiers();
                            arg0.method1219(0, true);
                            arg0.method1213(-1, var21);
                        }
                    } catch (ClassNotFoundException var34) {
                        arg0.method1219(-10, true);
                    } catch (InvalidClassException var35) {
                        arg0.method1219(-11, true);
                    } catch (StreamCorruptedException var36) {
                        arg0.method1219(-12, true);
                    } catch (OptionalDataException var37) {
                        arg0.method1219(-13, true);
                    } catch (IllegalAccessException var38) {
                        arg0.method1219(-14, true);
                    } catch (IllegalArgumentException var39) {
                        arg0.method1219(-15, true);
                    } catch (InvocationTargetException var40) {
                        arg0.method1219(-16, true);
                    } catch (SecurityException var41) {
                        arg0.method1219(-17, true);
                    } catch (IOException var42) {
                        arg0.method1219(-18, true);
                    } catch (NullPointerException var43) {
                        arg0.method1219(-19, true);
                    } catch (Exception var44) {
                        arg0.method1219(-20, true);
                    } catch (Throwable var45) {
                        arg0.method1219(-21, true);
                    }
                } else {
                    arg0.method1219(var3.field1587[var7], true);
                }
            }
            arg0.method1201(var6, 0);
            arg0.method1215(arg0.field2787 - var6, 117);
            var3.method2000(121);
        }
    }
}
