import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
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

@OriginalClass("client!gj")
public abstract class class223 {

    @OriginalMember(owner = "client!gj", name = "n", descriptor = "Z")
    public static boolean field3912 = false;

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "I")
    public static int field3899;

    @OriginalMember(owner = "client!gj", name = "d", descriptor = "I")
    public static int field3902;

    @OriginalMember(owner = "client!gj", name = "e", descriptor = "I")
    public static int field3903;

    @OriginalMember(owner = "client!gj", name = "f", descriptor = "I")
    public static int field3904;

    @OriginalMember(owner = "client!gj", name = "h", descriptor = "I")
    public static int field3906;

    @OriginalMember(owner = "client!gj", name = "i", descriptor = "I")
    public static int field3907;

    @OriginalMember(owner = "client!gj", name = "k", descriptor = "I")
    public int field3909;

    @OriginalMember(owner = "client!gj", name = "l", descriptor = "I")
    public int field3910;

    @OriginalMember(owner = "client!gj", name = "m", descriptor = "I")
    public static int field3911;

    @OriginalMember(owner = "client!gj", name = "o", descriptor = "I")
    public static int field3913;

    @OriginalMember(owner = "client!gj", name = "b", descriptor = "Ll;")
    public static class157 field3900;

    @OriginalMember(owner = "client!gj", name = "j", descriptor = "Ljava/awt/Image;")
    public Image field3908;

    @OriginalMember(owner = "client!gj", name = "c", descriptor = "[I")
    public static int[] field3901;

    @OriginalMember(owner = "client!gj", name = "g", descriptor = "[I")
    public int[] field3905;

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(IIILjava/awt/Graphics;II)V")
    public abstract void method359(int arg0, int arg1, int arg2, Graphics arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(Ljava/awt/Component;IIB)V")
    public abstract void method366(Component arg0, int arg1, int arg2, byte arg3);

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(I)I")
    public static final int method1510(int arg0) {
        field3903++;
        int var1 = 61 / ((-arg0 - 37) / 41);
        return 2;
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(B)V")
    public final void method1511(byte arg0) {
        class179.method1227(this.field3905, this.field3909, this.field3910);
        if (arg0 == 34) {
            field3913++;
        }
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(ILjd;)V")
    public static final void method1512(int arg0, class85 arg1) {
        field3906++;
        class172.field2967 = arg1;
        if (class107.field1882.field1478 == null) {
            return;
        }
        try {
            class85 var2 = class235.field4068.method592(arg0 ^ 0xFFFFA5DB, class107.field1882.field1478);
            class85 var3 = class196.field3370.method592(29698, class107.field1882.field1478);
            class85 var4 = class172.method1150(new class85[] { var2, class76.field1419, arg1, class246.field4206, var3 }, 0);
            class85 var5;
            if (arg1.method586(true) == 0) {
                var5 = class172.method1150(new class85[] { var4, class189.field3248 }, 0);
            } else {
                var5 = class172.method1150(new class85[] { var4, class24.field353, class237.method1585(class28.method200(-95) + 94608000000L, 22246), class153.field2613, class235.method1571(false, 94608000L) }, 0);
            }
            class172.method1150(new class85[] { class255.field4409, var5, class78.field1435 }, 0).method589(class107.field1882.field1478, true);
        } catch (Throwable var6) {
        }
        if (arg0 != -11815) {
            field3900 = null;
        }
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(ILtd;B)V")
    public static final void method1513(int arg0, class70 arg1, byte arg2) {
        if (arg2 > -88) {
            field3902 = 59;
        }
        field3907++;
        while (true) {
            class131 var3 = (class131) class239.field4119.method110(64);
            if (var3 == null) {
                return;
            }
            boolean var4 = false;
            for (int var5 = 0; var5 < var3.field2300; var5++) {
                if (var3.field2287[var5] != null) {
                    if (var3.field2287[var5].field1296 == 2) {
                        var3.field2291[var5] = -5;
                    }
                    if (var3.field2287[var5].field1296 == 0) {
                        var4 = true;
                    }
                }
                if (var3.field2296[var5] != null) {
                    if (var3.field2296[var5].field1296 == 2) {
                        var3.field2291[var5] = -6;
                    }
                    if (var3.field2296[var5].field1296 == 0) {
                        var4 = true;
                    }
                }
            }
            if (var4) {
                return;
            }
            arg1.method483(-24260, arg0);
            arg1.method1714(0, -714043120);
            int var6 = arg1.field4224;
            arg1.method1715(var3.field2292, (byte) -27);
            for (int var7 = 0; var7 < var3.field2300; var7++) {
                if (var3.field2291[var7] == 0) {
                    try {
                        int var8 = var3.field2297[var7];
                        if (var8 == 0) {
                            Field var9 = (Field) var3.field2287[var7].field1292;
                            int var10 = var9.getInt((Object) null);
                            arg1.method1714(0, -714043120);
                            arg1.method1715(var10, (byte) -114);
                        } else if (var8 == 1) {
                            Field var13 = (Field) var3.field2287[var7].field1292;
                            var13.setInt((Object) null, var3.field2285[var7]);
                            arg1.method1714(0, -714043120);
                        } else if (var8 == 2) {
                            Field var11 = (Field) var3.field2287[var7].field1292;
                            int var12 = var11.getModifiers();
                            arg1.method1714(0, -714043120);
                            arg1.method1715(var12, (byte) 121);
                        }
                        if (var8 == 3) {
                            byte[][] var16 = var3.field2290[var7];
                            Method var17 = (Method) var3.field2296[var7].field1292;
                            Object[] var18 = new Object[var16.length];
                            for (int var19 = 0; var19 < var16.length; var19++) {
                                ObjectInputStream var20 = new ObjectInputStream(new ByteArrayInputStream(var16[var19]));
                                var18[var19] = var20.readObject();
                            }
                            Object var21 = var17.invoke((Object) null, var18);
                            if (var21 == null) {
                                arg1.method1714(0, -714043120);
                            } else if (var21 instanceof Number) {
                                arg1.method1714(1, -714043120);
                                arg1.method1674((byte) 101, ((Number) var21).longValue());
                            } else if ((var21 instanceof class85)) {
                                arg1.method1714(2, -714043120);
                                arg1.method1698((byte) -72, (class85) var21);
                            } else {
                                arg1.method1714(4, -714043120);
                            }
                        } else if (var8 == 4) {
                            Method var14 = (Method) var3.field2296[var7].field1292;
                            int var15 = var14.getModifiers();
                            arg1.method1714(0, -714043120);
                            arg1.method1715(var15, (byte) 124);
                        }
                    } catch (ClassNotFoundException var22) {
                        arg1.method1714(-10, -714043120);
                    } catch (InvalidClassException var23) {
                        arg1.method1714(-11, -714043120);
                    } catch (StreamCorruptedException var24) {
                        arg1.method1714(-12, -714043120);
                    } catch (OptionalDataException var25) {
                        arg1.method1714(-13, -714043120);
                    } catch (IllegalAccessException var26) {
                        arg1.method1714(-14, -714043120);
                    } catch (IllegalArgumentException var27) {
                        arg1.method1714(-15, -714043120);
                    } catch (InvocationTargetException var28) {
                        arg1.method1714(-16, -714043120);
                    } catch (SecurityException var29) {
                        arg1.method1714(-17, -714043120);
                    } catch (IOException var30) {
                        arg1.method1714(-18, -714043120);
                    } catch (NullPointerException var31) {
                        arg1.method1714(-19, -714043120);
                    } catch (Exception var32) {
                        arg1.method1714(-20, -714043120);
                    } catch (Throwable var33) {
                        arg1.method1714(-21, -714043120);
                    }
                } else {
                    arg1.method1714(var3.field2291[var7], -714043120);
                }
            }
            arg1.method1713(-99, var6);
            arg1.method1693(arg1.field4224 - var6, -1);
            var3.method1753(137);
        }
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(Lge;BI)Lee;")
    public static final class266 method1514(class68 arg0, byte arg1, int arg2) {
        field3899++;
        if (class218.method1487(arg0, arg2, 508630)) {
            int var3 = 14 % ((arg1 - 33) / 56);
            return class31.method217(true);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!gj", name = "b", descriptor = "(B)V")
    public static void method1515(byte arg0) {
        field3900 = null;
        if (arg0 < -86) {
            field3901 = null;
        }
    }

    @OriginalMember(owner = "client!gj", name = "<init>", descriptor = "()V")
    protected class223() {
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(ILjava/awt/Graphics;ZI)V")
    public abstract void method361(int arg0, Graphics arg1, boolean arg2, int arg3);

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(IBIZ)I")
    public static final int method1516(int arg0, byte arg1, int arg2, boolean arg3) {
        field3904++;
        class186 var4 = (class186) class172.field2975.method1398(1, (long) arg0);
        if (var4 == null) {
            return 0;
        }
        int var5 = 0;
        int var6 = 0;
        if (arg1 != 51) {
            method1514((class68) null, (byte) 98, 116);
        }
        while (var6 < var4.field3198.length) {
            if (var4.field3198[var6] >= 0 && class116.field2081 > var4.field3198[var6]) {
                class61 var7 = class32.method221(11649, var4.field3198[var6]);
                if (var7.field1088 != null) {
                    class105 var8 = (class105) var7.field1088.method1398(arg1 - 50, (long) arg2);
                    if (var8 != null) {
                        if (arg3) {
                            var5 += var4.field3191[var6] * var8.field1842;
                        } else {
                            var5 += var8.field1842;
                        }
                    }
                }
            }
            var6++;
        }
        return var5;
    }
}
