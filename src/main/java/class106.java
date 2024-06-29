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

@OriginalClass("client!ai")
public class class106 extends class28 {

    @OriginalMember(owner = "client!ai", name = "K", descriptor = "Lqg;")
    public class205 field1876;

    @OriginalMember(owner = "client!ai", name = "G", descriptor = "I")
    public static int field1872 = 0;

    @OriginalMember(owner = "client!ai", name = "N", descriptor = "Lvf;")
    private static class265 field1878 = class87.method582(-46, "Loading)3)3)3");

    @OriginalMember(owner = "client!ai", name = "T", descriptor = "Z")
    public static boolean field1884 = true;

    @OriginalMember(owner = "client!ai", name = "R", descriptor = "Lvf;")
    public static class265 field1882 = class87.method582(-46, "Lade Sprites )2 ");

    @OriginalMember(owner = "client!ai", name = "H", descriptor = "Lvf;")
    public static class265 field1873 = field1878;

    @OriginalMember(owner = "client!ai", name = "I", descriptor = "I")
    public static int field1874;

    @OriginalMember(owner = "client!ai", name = "J", descriptor = "I")
    public static int field1875;

    @OriginalMember(owner = "client!ai", name = "M", descriptor = "I")
    public static int field1877;

    @OriginalMember(owner = "client!ai", name = "O", descriptor = "I")
    public static int field1879;

    @OriginalMember(owner = "client!ai", name = "P", descriptor = "I")
    public static int field1880;

    @OriginalMember(owner = "client!ai", name = "Q", descriptor = "I")
    public static int field1881;

    @OriginalMember(owner = "client!ai", name = "S", descriptor = "I")
    public static int field1883;

    @OriginalMember(owner = "client!ai", name = "d", descriptor = "(I)V")
    public static void method706(int arg0) {
        field1873 = null;
        field1882 = null;
        field1878 = null;
        if (arg0 >= -82) {
            method708(-17, 102, -44, -74, (byte) -61);
        }
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(ZLfl;Lfl;)V")
    public static final void method707(boolean arg0, class192 arg1, class192 arg2) {
        class107.field1885 = arg2;
        class103.field1838 = arg1;
        field1881++;
        class17.field476 = class103.field1838.method1331(3, (byte) 127);
        if (!arg0) {
            field1872 = 4;
        }
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(IIIIB)V")
    public static final void method708(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        field1874++;
        class178 var5 = class188.method1282(arg2, 8, 261360480);
        var5.method1162(true);
        if (arg4 > -85) {
            method712(0, -28, -114, 39, -96, (byte) 40, 87, -105);
        }
        var5.field3172 = arg3;
        var5.field3170 = arg1;
        var5.field3171 = arg0;
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(Lhg;)V")
    public static final void method709(class146 arg0) {
        for (int var1 = arg0.field2728; var1 <= arg0.field2733; var1++) {
            for (int var2 = arg0.field2719; var2 <= arg0.field2721; var2++) {
                class137 var3 = class200.field3577[arg0.field2732][var1][var2];
                if (var3 != null) {
                    for (int var4 = 0; var4 < var3.field2502; var4++) {
                        if (var3.field2506[var4] == arg0) {
                            var3.field2502--;
                            for (int var5 = var4; var5 < var3.field2502; var5++) {
                                var3.field2506[var5] = var3.field2506[var5 + 1];
                                var3.field2514[var5] = var3.field2514[var5 + 1];
                            }
                            var3.field2506[var3.field2502] = null;
                            break;
                        }
                    }
                    var3.field2520 = 0;
                    for (int var6 = 0; var6 < var3.field2502; var6++) {
                        var3.field2520 |= var3.field2514[var6];
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(BLfl;)V")
    public static final void method710(byte arg0, class192 arg1) {
        class243.field4242 = arg1;
        field1879++;
        if (arg0 > 95) {
            class275.field4857 = class243.field4242.method1331(4, (byte) 120);
        }
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(Lnd;II)V")
    public static final void method711(class272 arg0, int arg1, int arg2) {
        field1883++;
        if (arg1 != -5) {
            method706(26);
        }
        while (true) {
            class254 var3 = (class254) class67.field1275.method789((byte) -85);
            if (var3 == null) {
                return;
            }
            boolean var4 = false;
            for (int var5 = 0; var5 < var3.field4376; var5++) {
                if (var3.field4374[var5] != null) {
                    if (var3.field4374[var5].field1996 == 2) {
                        var3.field4375[var5] = -5;
                    }
                    if (var3.field4374[var5].field1996 == 0) {
                        var4 = true;
                    }
                }
                if (var3.field4360[var5] != null) {
                    if (var3.field4360[var5].field1996 == 2) {
                        var3.field4375[var5] = -6;
                    }
                    if (var3.field4360[var5].field1996 == 0) {
                        var4 = true;
                    }
                }
            }
            if (var4) {
                return;
            }
            arg0.method1863(true, arg2);
            arg0.method903((byte) 36, 0);
            int var6 = arg0.field2449;
            arg0.method898((byte) 97, var3.field4363);
            for (int var7 = 0; var7 < var3.field4376; var7++) {
                if (var3.field4375[var7] == 0) {
                    try {
                        int var8 = var3.field4371[var7];
                        if (var8 == 0) {
                            Field var12 = (Field) var3.field4374[var7].field1997;
                            int var13 = var12.getInt((Object) null);
                            arg0.method903((byte) 36, 0);
                            arg0.method898((byte) 69, var13);
                        } else if (var8 == 1) {
                            Field var11 = (Field) var3.field4374[var7].field1997;
                            var11.setInt((Object) null, var3.field4367[var7]);
                            arg0.method903((byte) 36, 0);
                        } else if (var8 == 2) {
                            Field var9 = (Field) var3.field4374[var7].field1997;
                            int var10 = var9.getModifiers();
                            arg0.method903((byte) 36, 0);
                            arg0.method898((byte) 104, var10);
                        }
                        if (var8 == 3) {
                            Method var16 = (Method) var3.field4360[var7].field1997;
                            byte[][] var17 = var3.field4362[var7];
                            Object[] var18 = new Object[var17.length];
                            for (int var19 = 0; var19 < var17.length; var19++) {
                                ObjectInputStream var20 = new ObjectInputStream(new ByteArrayInputStream(var17[var19]));
                                var18[var19] = var20.readObject();
                            }
                            Object var21 = var16.invoke((Object) null, var18);
                            if (var21 == null) {
                                arg0.method903((byte) 36, 0);
                            } else if (var21 instanceof Number) {
                                arg0.method903((byte) 36, 1);
                                arg0.method911(0, ((Number) var21).longValue());
                            } else if ((var21 instanceof class265)) {
                                arg0.method903((byte) 36, 2);
                                arg0.method941((class265) var21, (byte) -58);
                            } else {
                                arg0.method903((byte) 36, 4);
                            }
                        } else if (var8 == 4) {
                            Method var14 = (Method) var3.field4360[var7].field1997;
                            int var15 = var14.getModifiers();
                            arg0.method903((byte) 36, 0);
                            arg0.method898((byte) 41, var15);
                        }
                    } catch (ClassNotFoundException var22) {
                        arg0.method903((byte) 36, -10);
                    } catch (InvalidClassException var23) {
                        arg0.method903((byte) 36, -11);
                    } catch (StreamCorruptedException var24) {
                        arg0.method903((byte) 36, -12);
                    } catch (OptionalDataException var25) {
                        arg0.method903((byte) 36, -13);
                    } catch (IllegalAccessException var26) {
                        arg0.method903((byte) 36, -14);
                    } catch (IllegalArgumentException var27) {
                        arg0.method903((byte) 36, -15);
                    } catch (InvocationTargetException var28) {
                        arg0.method903((byte) 36, -16);
                    } catch (SecurityException var29) {
                        arg0.method903((byte) 36, -17);
                    } catch (IOException var30) {
                        arg0.method903((byte) 36, -18);
                    } catch (NullPointerException var31) {
                        arg0.method903((byte) 36, -19);
                    } catch (Exception var32) {
                        arg0.method903((byte) 36, -20);
                    } catch (Throwable var33) {
                        arg0.method903((byte) 36, -21);
                    }
                } else {
                    arg0.method903((byte) 36, var3.field4375[var7]);
                }
            }
            arg0.method905(arg1 + 126, var6);
            arg0.method926(-129, arg0.field2449 - var6);
            var3.method97(158);
        }
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(IIIIIBII)V")
    public static final void method712(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6, int arg7) {
        field1875++;
        int var8 = -102 / ((74 - arg5) / 44);
        int var9 = class219.method1507(class205.field3681, class81.field1521, arg0, 0);
        int var10 = class219.method1507(class205.field3681, class81.field1521, arg3, 0);
        int var11 = class219.method1507(class79.field1510, class107.field1890, arg4, 0);
        int var12 = class219.method1507(class79.field1510, class107.field1890, arg6, 0);
        int var13 = class219.method1507(class205.field3681, class81.field1521, arg0 + arg2, 0);
        int var14 = class219.method1507(class205.field3681, class81.field1521, arg3 - arg2, 0);
        for (int var15 = var9; var15 < var13; var15++) {
            class203.method1394(class44.field973[var15], var11, var12, -7249, arg7);
        }
        for (int var16 = var10; var16 > var14; var16--) {
            class203.method1394(class44.field973[var16], var11, var12, -7249, arg7);
        }
        int var17 = class219.method1507(class79.field1510, class107.field1890, arg2 + arg4, 0);
        int var18 = class219.method1507(class79.field1510, class107.field1890, arg6 - arg2, 0);
        for (int var19 = var13; var19 <= var14; var19++) {
            int[] var20 = class44.field973[var19];
            class203.method1394(var20, var11, var17, -7249, arg7);
            class203.method1394(var20, var17, var18, -7249, arg1);
            class203.method1394(var20, var18, var12, -7249, arg7);
        }
    }

    @OriginalMember(owner = "client!ai", name = "<init>", descriptor = "(Lqg;)V")
    public class106(class205 arg0) {
        this.field1876 = arg0;
    }
}
