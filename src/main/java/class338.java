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

@OriginalClass("client!ne")
public class class338 extends class509 {

    @OriginalMember(owner = "client!ne", name = "f", descriptor = "Ltm;")
    public static class412 field4897 = new class412();

    @OriginalMember(owner = "client!ne", name = "d", descriptor = "I")
    public static int field4895;

    @OriginalMember(owner = "client!ne", name = "e", descriptor = "I")
    public static int field4896;

    @OriginalMember(owner = "client!ne", name = "g", descriptor = "I")
    public static int field4898;

    @OriginalMember(owner = "client!ne", name = "h", descriptor = "I")
    public static int field4899;

    @OriginalMember(owner = "client!ne", name = "i", descriptor = "I")
    public static int field4900;

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(B)V")
    public static void method2144(byte arg0) {
        if (arg0 <= 107) {
            field4897 = null;
        }
        field4897 = null;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(IC)Z")
    public static final boolean method2145(int arg0, char arg1) {
        if (arg0 == 28855) {
            field4896++;
            return arg1 >= '0' && arg1 <= '9';
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(ILs;)V")
    public static final void method2146(int arg0, class296 arg1) {
        class528.field7227[arg0] = arg1;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(Lbba;I)I")
    public static final int method2147(class124 arg0, int arg1) {
        if (arg1 != -21) {
            return -101;
        }
        field4899++;
        if (arg0.field1790 == 0) {
            return 0;
        }
        if (arg0.field1787 != -1) {
            class124 var2 = null;
            if (arg0.field1787 < 32768) {
                class174 var3 = (class174) class234.field3169.method3953((long) arg0.field1787, 14);
                if (var3 != null) {
                    var2 = var3.field2336;
                }
            } else if (arg0.field1787 >= 32768) {
                var2 = class599.field8149[arg0.field1787 - 32768];
            }
            if (var2 != null) {
                int var4 = arg0.field2257 - var2.field2257;
                int var5 = arg0.field2259 - var2.field2259;
                if (var4 != 0 || var5 != 0) {
                    arg0.method1008((int) (Math.atan2((double) var4, (double) var5) * 2607.5945876176133D) & 0x3FFF, (byte) 81);
                }
            }
        }
        if ((arg0 instanceof class73)) {
            class73 var9 = (class73) arg0;
            if (var9.field1060 != -1 && (var9.field1883 == 0 || var9.field1881 > 0)) {
                var9.method1008(var9.field1060, (byte) 124);
                var9.field1060 = -1;
            }
        } else if (arg0 instanceof class192) {
            class192 var6 = (class192) arg0;
            if (var6.field2570 != -1 && (var6.field1883 == 0 || var6.field1881 > 0)) {
                int var7 = var6.field2257 - ((var6.field2570 - class121.field1765 - class121.field1765) * 256);
                int var8 = var6.field2259 - (var6.field2554 - class230.field3147 - class230.field3147) * 256;
                if (var7 != 0 || var8 != 0) {
                    var6.method1008((int) (Math.atan2((double) var7, (double) var8) * 2607.5945876176133D) & 0x3FFF, (byte) 91);
                }
                var6.field2570 = -1;
            }
        }
        return arg0.method1006(-100);
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(Lgaa;I)V")
    public static final void method2148(class315 arg0, int arg1) {
        field4895++;
        class143 var2 = (class143) class359.field5249.method2551((byte) -108);
        if (var2 == null) {
            return;
        }
        boolean var3 = false;
        int var4 = -6 % ((-arg1 - 75) / 44);
        for (int var5 = 0; var5 < var2.field2063; var5++) {
            if (var2.field2058[var5] != null) {
                if (var2.field2058[var5].field8321 == 2) {
                    var2.field2057[var5] = -5;
                }
                if (var2.field2058[var5].field8321 == 0) {
                    var3 = true;
                }
            }
            if (var2.field2061[var5] != null) {
                if (var2.field2061[var5].field8321 == 2) {
                    var2.field2057[var5] = -6;
                }
                if (var2.field2061[var5].field8321 == 0) {
                    var3 = true;
                }
            }
        }
        if (var3) {
            return;
        }
        int var6 = arg0.field5459;
        arg0.method2354(var2.field2062, (byte) 114);
        for (int var7 = 0; var7 < var2.field2063; var7++) {
            if (var2.field2057[var7] == 0) {
                try {
                    int var8 = var2.field2059[var7];
                    if (var8 == 0) {
                        Field var9 = (Field) var2.field2058[var7].field8318;
                        int var10 = var9.getInt(null);
                        arg0.method2380(65280, 0);
                        arg0.method2354(var10, (byte) 56);
                    } else if (var8 == 1) {
                        Field var13 = (Field) var2.field2058[var7].field8318;
                        var13.setInt(null, var2.field2060[var7]);
                        arg0.method2380(65280, 0);
                    } else if (var8 == 2) {
                        Field var11 = (Field) var2.field2058[var7].field8318;
                        int var12 = var11.getModifiers();
                        arg0.method2380(65280, 0);
                        arg0.method2354(var12, (byte) 70);
                    }
                    if (var8 == 3) {
                        Method var14 = (Method) var2.field2061[var7].field8318;
                        byte[][] var15 = var2.field2064[var7];
                        Object[] var16 = new Object[var15.length];
                        for (int var17 = 0; var17 < var15.length; var17++) {
                            ObjectInputStream var18 = new ObjectInputStream(new ByteArrayInputStream(var15[var17]));
                            var16[var17] = var18.readObject();
                        }
                        Object var19 = var14.invoke(null, var16);
                        if (var19 == null) {
                            arg0.method2380(65280, 0);
                        } else if ((var19 instanceof Number)) {
                            arg0.method2380(65280, 1);
                            arg0.method2369(-3, ((Number) var19).longValue());
                        } else if (var19 instanceof String) {
                            arg0.method2380(65280, 2);
                            arg0.method2349(80, (String) var19);
                        } else {
                            arg0.method2380(65280, 4);
                        }
                    } else if (var8 == 4) {
                        Method var20 = (Method) var2.field2061[var7].field8318;
                        int var21 = var20.getModifiers();
                        arg0.method2380(65280, 0);
                        arg0.method2354(var21, (byte) 95);
                    }
                } catch (ClassNotFoundException var22) {
                    arg0.method2380(65280, -10);
                } catch (InvalidClassException var23) {
                    arg0.method2380(65280, -11);
                } catch (StreamCorruptedException var24) {
                    arg0.method2380(65280, -12);
                } catch (OptionalDataException var25) {
                    arg0.method2380(65280, -13);
                } catch (IllegalAccessException var26) {
                    arg0.method2380(65280, -14);
                } catch (IllegalArgumentException var27) {
                    arg0.method2380(65280, -15);
                } catch (InvocationTargetException var28) {
                    arg0.method2380(65280, -16);
                } catch (SecurityException var29) {
                    arg0.method2380(65280, -17);
                } catch (IOException var30) {
                    arg0.method2380(65280, -18);
                } catch (NullPointerException var31) {
                    arg0.method2380(65280, -19);
                } catch (Exception var32) {
                    arg0.method2380(65280, -20);
                } catch (Throwable var33) {
                    arg0.method2380(65280, -21);
                }
            } else {
                arg0.method2380(65280, var2.field2057[var7]);
            }
        }
        arg0.method2360(-30310, var6);
        var2.method792((byte) -99);
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(IZ)V")
    public static final void method2149(int arg0, boolean arg1) {
        field4898++;
        if (arg0 != 0) {
            field4897 = null;
        }
        if (class209.field2778 == null) {
            class134.method1058(0);
        }
        if (arg1) {
            class209.field2778.method4262(arg0 + 26977);
        }
    }
}
