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

@OriginalClass("client!qg")
public class class329 {

    @OriginalMember(owner = "client!qg", name = "f", descriptor = "Lci;")
    private class320 field4836;

    @OriginalMember(owner = "client!qg", name = "c", descriptor = "I")
    public int field4833;

    @OriginalMember(owner = "client!qg", name = "d", descriptor = "Lqv;")
    public static class316 field4834 = new class316(112, -2);

    @OriginalMember(owner = "client!qg", name = "j", descriptor = "I")
    public static int field4840 = 0;

    @OriginalMember(owner = "client!qg", name = "i", descriptor = "I")
    public static int field4839 = -1;

    @OriginalMember(owner = "client!qg", name = "h", descriptor = "I")
    public static int field4838 = 0;

    @OriginalMember(owner = "client!qg", name = "k", descriptor = "[I")
    public static int[] field4841 = new int[1000];

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "I")
    public static int field4831;

    @OriginalMember(owner = "client!qg", name = "b", descriptor = "I")
    public static int field4832;

    @OriginalMember(owner = "client!qg", name = "e", descriptor = "I")
    public static int field4835;

    @OriginalMember(owner = "client!qg", name = "g", descriptor = "I")
    public static int field4837;

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(ILjava/lang/String;)V", line = 3)
    public static final void method2077(int arg0, String arg1) {
        field4831++;
        if (class290.field4298 == null) {
            class460.method2730((byte) -102);
        }
        String[] var2 = class446.method2630(arg0, arg1, '\n');
        if (arg0 != -1) {
            field4840 = 46;
        }
        for (int var3 = 0; var3 < var2.length; var3++) {
            for (int var4 = class490.field7070; var4 > 0; var4--) {
                class290.field4298[var4] = class290.field4298[var4 - 1];
            }
            class290.field4298[0] = var2[var3];
            if ((class290.field4298.length - 1) > class490.field7070) {
                class490.field7070++;
                if (class345.field5085 > 0) {
                    class345.field5085++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(I)V", line = 51)
    public static void method2078(int arg0) {
        int var1 = 56 % ((-arg0 - 3) / 32);
        field4841 = null;
        field4834 = null;
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(Liu;II)V", line = 64)
    public static final void method2079(class415 arg0, int arg1, int arg2) {
        if (arg2 != -26731) {
            field4838 = -30;
        }
        field4835++;
        while (true) {
            class131 var3 = (class131) class345.field5086.method863(-1);
            if (var3 == null) {
                return;
            }
            boolean var4 = false;
            for (int var5 = 0; var5 < var3.field2045; var5++) {
                if (var3.field2049[var5] != null) {
                    if (var3.field2049[var5].field1314 == 2) {
                        var3.field2050[var5] = -5;
                    }
                    if (var3.field2049[var5].field1314 == 0) {
                        var4 = true;
                    }
                }
                if (var3.field2046[var5] != null) {
                    if (var3.field2046[var5].field1314 == 2) {
                        var3.field2050[var5] = -6;
                    }
                    if (var3.field2046[var5].field1314 == 0) {
                        var4 = true;
                    }
                }
            }
            if (var4) {
                return;
            }
            arg0.method2480(true, arg1);
            arg0.method3048(-2034159384, 0);
            int var6 = arg0.field7558;
            arg0.method3019(var3.field2048, arg2 ^ 0xFFFFBA15);
            for (int var7 = 0; var7 < var3.field2045; var7++) {
                if (var3.field2050[var7] == 0) {
                    try {
                        int var8 = var3.field2051[var7];
                        if (var8 == 0) {
                            Field var9 = (Field) var3.field2049[var7].field1311;
                            int var10 = var9.getInt(null);
                            arg0.method3048(-2034159384, 0);
                            arg0.method3019(var10, 11648);
                        } else if (var8 == 1) {
                            Field var11 = (Field) var3.field2049[var7].field1311;
                            var11.setInt(null, var3.field2044[var7]);
                            arg0.method3048(-2034159384, 0);
                        } else if (var8 == 2) {
                            Field var12 = (Field) var3.field2049[var7].field1311;
                            int var13 = var12.getModifiers();
                            arg0.method3048(-2034159384, 0);
                            arg0.method3019(var13, 11648);
                        }
                        if (var8 == 3) {
                            Method var16 = (Method) var3.field2046[var7].field1311;
                            byte[][] var17 = var3.field2053[var7];
                            Object[] var18 = new Object[var17.length];
                            for (int var19 = 0; var19 < var17.length; var19++) {
                                ObjectInputStream var20 = new ObjectInputStream(new ByteArrayInputStream(var17[var19]));
                                var18[var19] = var20.readObject();
                            }
                            Object var21 = var16.invoke(null, var18);
                            if (var21 == null) {
                                arg0.method3048(-2034159384, 0);
                            } else if ((var21 instanceof Number)) {
                                arg0.method3048(-2034159384, 1);
                                arg0.method3014(((Number) var21).longValue(), -2);
                            } else if ((var21 instanceof String)) {
                                arg0.method3048(-2034159384, 2);
                                arg0.method3057((byte) -28, (String) var21);
                            } else {
                                arg0.method3048(-2034159384, 4);
                            }
                        } else if (var8 == 4) {
                            Method var14 = (Method) var3.field2046[var7].field1311;
                            int var15 = var14.getModifiers();
                            arg0.method3048(-2034159384, 0);
                            arg0.method3019(var15, 11648);
                        }
                    } catch (ClassNotFoundException var22) {
                        arg0.method3048(arg2 - 2034132653, -10);
                    } catch (InvalidClassException var23) {
                        arg0.method3048(-2034159384, -11);
                    } catch (StreamCorruptedException var24) {
                        arg0.method3048(-2034159384, -12);
                    } catch (OptionalDataException var25) {
                        arg0.method3048(arg2 - 2034132653, -13);
                    } catch (IllegalAccessException var26) {
                        arg0.method3048(arg2 - 2034132653, -14);
                    } catch (IllegalArgumentException var27) {
                        arg0.method3048(-2034159384, -15);
                    } catch (InvocationTargetException var28) {
                        arg0.method3048(arg2 - 2034132653, -16);
                    } catch (SecurityException var29) {
                        arg0.method3048(-2034159384, -17);
                    } catch (IOException var30) {
                        arg0.method3048(arg2 - 2034132653, -18);
                    } catch (NullPointerException var31) {
                        arg0.method3048(arg2 ^ 0x793EA77D, -19);
                    } catch (Exception var32) {
                        arg0.method3048(arg2 ^ 0x793EA77D, -20);
                    } catch (Throwable var33) {
                        arg0.method3048(arg2 ^ 0x793EA77D, -21);
                    }
                } else {
                    arg0.method3048(-2034159384, var3.field2050[var7]);
                }
            }
            arg0.method3032(var6, (byte) -85);
            arg0.method3025(arg0.field7558 - var6, 76);
            var3.method421(arg2 + 48802);
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(III)V", line = 254)
    public static final void method2080(int arg0, int arg1, int arg2) {
        if (arg2 != -3) {
            return;
        }
        class228.method1528(true, class437.field6231);
        field4837++;
        class217.field3269++;
        class276.field4124.method3016(arg1, arg2 ^ 0x7E);
        class276.field4124.method3020(-1022807024, arg0);
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(IIBI)V", line = 271)
    public static final void method2081(int arg0, int arg1, byte arg2, int arg3) {
        if (arg2 < 89) {
            method2081(46, 112, (byte) 73, -44);
        }
        field4832++;
        String var4 = "tele " + arg1 + "," + (arg0 >> 6) + "," + (arg3 >> 6) + "," + (arg0 & 0x3F) + "," + (arg3 & 0x3F);
        System.out.println(var4);
        class162.method1175(312929383, var4, true, false);
    }

    @OriginalMember(owner = "client!qg", name = "<init>", descriptor = "(Lsn;ILci;)V", line = 292)
    public class329(class453 arg0, int arg1, class320 arg2) {
        new class511(64);
        this.field4836 = arg2;
        this.field4833 = this.field4836.method2030(-10914, 15);
    }
}
