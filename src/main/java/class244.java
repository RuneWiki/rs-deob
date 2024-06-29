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

@OriginalClass("client!lp")
public class class244 extends class29 {

    @OriginalMember(owner = "client!lp", name = "j", descriptor = "Z")
    public static boolean field3628 = false;

    @OriginalMember(owner = "client!lp", name = "m", descriptor = "[[[I")
    public static int[][][] field3631 = new int[2][][];

    @OriginalMember(owner = "client!lp", name = "q", descriptor = "J")
    public static long field3635 = 0L;

    @OriginalMember(owner = "client!lp", name = "r", descriptor = "[Lwh;")
    public static class90[] field3636 = new class90[29];

    @OriginalMember(owner = "client!lp", name = "k", descriptor = "I")
    public static int field3629;

    @OriginalMember(owner = "client!lp", name = "l", descriptor = "I")
    public static int field3630;

    @OriginalMember(owner = "client!lp", name = "n", descriptor = "I")
    public static int field3632;

    @OriginalMember(owner = "client!lp", name = "o", descriptor = "I")
    public static int field3633;

    @OriginalMember(owner = "client!lp", name = "p", descriptor = "I")
    public static int field3634;

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(IILck;)V")
    public static final void method1534(int arg0, int arg1, class419 arg2) {
        field3633++;
        if (arg0 != -21381) {
            method1534(-88, 17, (class419) null);
        }
        while (true) {
            class55 var3 = (class55) class140.field1858.method2843(1123227612);
            if (var3 == null) {
                return;
            }
            boolean var4 = false;
            for (int var5 = 0; var5 < var3.field737; var5++) {
                if (var3.field734[var5] != null) {
                    if (var3.field734[var5].field5253 == 2) {
                        var3.field738[var5] = -5;
                    }
                    if (var3.field734[var5].field5253 == 0) {
                        var4 = true;
                    }
                }
                if (var3.field742[var5] != null) {
                    if (var3.field742[var5].field5253 == 2) {
                        var3.field738[var5] = -6;
                    }
                    if (var3.field742[var5].field5253 == 0) {
                        var4 = true;
                    }
                }
            }
            if (var4) {
                return;
            }
            arg2.method2461((byte) 39, arg1);
            arg2.method1753(true, 0);
            int var6 = arg2.field4021;
            arg2.method1744(var3.field740, true);
            for (int var7 = 0; var7 < var3.field737; var7++) {
                if (var3.field738[var7] == 0) {
                    try {
                        int var8 = var3.field741[var7];
                        if (var8 == 0) {
                            Field var9 = (Field) var3.field734[var7].field5255;
                            int var10 = var9.getInt((Object) null);
                            arg2.method1753(true, 0);
                            arg2.method1744(var10, true);
                        } else if (var8 == 1) {
                            Field var13 = (Field) var3.field734[var7].field5255;
                            var13.setInt((Object) null, var3.field735[var7]);
                            arg2.method1753(true, 0);
                        } else if (var8 == 2) {
                            Field var11 = (Field) var3.field734[var7].field5255;
                            int var12 = var11.getModifiers();
                            arg2.method1753(true, 0);
                            arg2.method1744(var12, true);
                        }
                        if (var8 == 3) {
                            Method var14 = (Method) var3.field742[var7].field5255;
                            byte[][] var15 = var3.field736[var7];
                            Object[] var16 = new Object[var15.length];
                            for (int var17 = 0; var17 < var15.length; var17++) {
                                ObjectInputStream var18 = new ObjectInputStream(new ByteArrayInputStream(var15[var17]));
                                var16[var17] = var18.readObject();
                            }
                            Object var19 = var14.invoke((Object) null, var16);
                            if (var19 == null) {
                                arg2.method1753(true, 0);
                            } else if ((var19 instanceof Number)) {
                                arg2.method1753(true, 1);
                                arg2.method1722(((Number) var19).longValue(), true);
                            } else if ((var19 instanceof String)) {
                                arg2.method1753(true, 2);
                                arg2.method1730(-11508, (String) var19);
                            } else {
                                arg2.method1753(true, 4);
                            }
                        } else if (var8 == 4) {
                            Method var20 = (Method) var3.field742[var7].field5255;
                            int var21 = var20.getModifiers();
                            arg2.method1753(true, 0);
                            arg2.method1744(var21, true);
                        }
                    } catch (ClassNotFoundException var22) {
                        arg2.method1753(true, -10);
                    } catch (InvalidClassException var23) {
                        arg2.method1753(true, -11);
                    } catch (StreamCorruptedException var24) {
                        arg2.method1753(true, -12);
                    } catch (OptionalDataException var25) {
                        arg2.method1753(true, -13);
                    } catch (IllegalAccessException var26) {
                        arg2.method1753(true, -14);
                    } catch (IllegalArgumentException var27) {
                        arg2.method1753(true, -15);
                    } catch (InvocationTargetException var28) {
                        arg2.method1753(true, -16);
                    } catch (SecurityException var29) {
                        arg2.method1753(true, -17);
                    } catch (IOException var30) {
                        arg2.method1753(true, -18);
                    } catch (NullPointerException var31) {
                        arg2.method1753(true, -19);
                    } catch (Exception var32) {
                        arg2.method1753(true, -20);
                    } catch (Throwable var33) {
                        arg2.method1753(true, -21);
                    }
                } else {
                    arg2.method1753(true, var3.field738[var7]);
                }
            }
            arg2.method1737(false, var6);
            arg2.method1733(arg0 - 1800, arg2.field4021 - var6);
            var3.method1510((byte) -13);
        }
    }

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(BLck;I)Z")
    public static final boolean method1535(byte arg0, class419 arg1, int arg2) {
        field3632++;
        int var3 = arg1.method2464(2, 0);
        if (var3 == 0) {
            if (arg1.method2464(1, 0) != 0) {
                method1535((byte) -126, arg1, arg2);
            }
            int var4 = arg1.method2464(6, 0);
            int var5 = arg1.method2464(6, 0);
            boolean var6 = arg1.method2464(1, 0) == 1;
            if (var6) {
                class191.field2846[class201.field2946++] = arg2;
            }
            if (class124.field1559[arg2] != null) {
                throw new RuntimeException("hr:lr");
            }
            class452 var7 = class124.field1559[arg2] = new class452();
            var7.field2154 = arg2;
            if (class486.field6847[arg2] != null) {
                var7.method2647((byte) -110, class486.field6847[arg2]);
            }
            var7.method914(94, class51.field705[arg2]);
            var7.field2125 = class359.field5163[arg2];
            int var8 = class139.field1830[arg2];
            int var9 = var8 >> 28;
            int var10 = (var8 & 0x3FD354) >> 14;
            int var11 = var8 & 0xFF;
            var7.field2166[0] = class8.field80[arg2];
            var7.field4319 = (byte) var9;
            var7.method2640((var11 << 6) + var5 - class360.field5180, (byte) 60, (var10 << 6) + var4 - class240.field3602);
            var7.field6272 = false;
            return true;
        } else if (var3 == 1) {
            int var12 = arg1.method2464(2, 0);
            int var13 = class139.field1830[arg2];
            class139.field1830[arg2] = class367.method2256(268435455, var13) + class367.method2256((var13 >> 28) + var12 << 28, 805306368);
            return false;
        } else if (var3 == 2) {
            int var14 = arg1.method2464(5, 0);
            int var15 = var14 >> 3;
            int var16 = var14 & 0x7;
            int var17 = class139.field1830[arg2];
            int var18 = (var17 >> 28) + var15 & 0x3;
            int var19 = (var17 & 0x3FCDC3) >> 14;
            int var20 = var17 & 0xFF;
            if (var16 == 0) {
                var20--;
                var19--;
            }
            if (var16 == 1) {
                var20--;
            }
            if (var16 == 2) {
                var19++;
                var20--;
            }
            if (var16 == 3) {
                var19--;
            }
            if (var16 == 4) {
                var19++;
            }
            if (var16 == 5) {
                var19--;
                var20++;
            }
            if (var16 == 6) {
                var20++;
            }
            if (var16 == 7) {
                var20++;
                var19++;
            }
            class139.field1830[arg2] = (var18 << 28) + (var19 << 14) + var20;
            return false;
        } else {
            int var21 = arg1.method2464(18, 0);
            int var22 = var21 >> 16;
            int var23 = (var21 & 0xFF26) >> 8;
            int var24 = var21 & 0xFF;
            int var25 = class139.field1830[arg2];
            if (arg0 >= -45) {
                field3628 = true;
            }
            int var26 = (var25 >> 28) + var22 & 0x3;
            int var27 = (var25 >> 14) + var23 & 0xFF;
            int var28 = var25 + var24 & 0xFF;
            class139.field1830[arg2] = (var26 << 28) - (-(var27 << 14) - var28);
            return false;
        }
    }

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(IIIIIIIBII)V")
    public static final void method1536(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte arg7, int arg8, int arg9) {
        field3629++;
        if (arg7 <= 16) {
            method1538(32);
        }
        if (!class78.method452(arg4, -3192)) {
            return;
        }
        if (class77.field945[arg4] == null) {
            client.method1119(class112.field1421[arg4], -1, arg2, arg9, arg0, arg8, arg5, arg3, arg1, arg6);
        } else {
            client.method1119(class77.field945[arg4], -1, arg2, arg9, arg0, arg8, arg5, arg3, arg1, arg6);
        }
    }

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(II)I")
    public static final int method1537(int arg0, int arg1) {
        if (arg1 != 427369832) {
            method1535((byte) 62, (class419) null, 49);
        }
        field3630++;
        return arg0 >>> 8;
    }

    @OriginalMember(owner = "client!lp", name = "b", descriptor = "(I)V")
    public static void method1538(int arg0) {
        field3631 = null;
        if (arg0 != -5) {
            field3628 = true;
        }
        field3636 = null;
    }
}
