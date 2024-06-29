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

@OriginalClass("client!g")
public class class151 {

    @OriginalMember(owner = "client!g", name = "e", descriptor = "I")
    private int field2595 = 0;

    @OriginalMember(owner = "client!g", name = "f", descriptor = "Loe;")
    private class120 field2596;

    @OriginalMember(owner = "client!g", name = "a", descriptor = "Loe;")
    public static class120 field2591 = new class120(32);

    @OriginalMember(owner = "client!g", name = "l", descriptor = "[S")
    public static short[] field2602 = new short[256];

    @OriginalMember(owner = "client!g", name = "o", descriptor = "Lmh;")
    public static class128 field2605 = class22.method156(122, "cookieprefix");

    @OriginalMember(owner = "client!g", name = "p", descriptor = "Lmh;")
    private static class128 field2606 = class22.method156(127, "Take");

    @OriginalMember(owner = "client!g", name = "r", descriptor = "[I")
    public static int[] field2608 = new int[2];

    @OriginalMember(owner = "client!g", name = "j", descriptor = "Lmh;")
    public static class128 field2600 = field2606;

    @OriginalMember(owner = "client!g", name = "d", descriptor = "F")
    public static float field2594;

    @OriginalMember(owner = "client!g", name = "b", descriptor = "I")
    public static int field2592;

    @OriginalMember(owner = "client!g", name = "g", descriptor = "I")
    public static int field2597;

    @OriginalMember(owner = "client!g", name = "h", descriptor = "I")
    public static int field2598;

    @OriginalMember(owner = "client!g", name = "i", descriptor = "I")
    public static int field2599;

    @OriginalMember(owner = "client!g", name = "k", descriptor = "I")
    public static int field2601;

    @OriginalMember(owner = "client!g", name = "n", descriptor = "I")
    public static int field2604;

    @OriginalMember(owner = "client!g", name = "c", descriptor = "Lqh;")
    private class287 field2593;

    @OriginalMember(owner = "client!g", name = "q", descriptor = "[I")
    public static int[] field2607;

    @OriginalMember(owner = "client!g", name = "m", descriptor = "[[S")
    public static short[][] field2603;

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(I)V", line = 14)
    public static void method1005(int arg0) {
        field2607 = null;
        field2602 = null;
        field2606 = null;
        field2605 = null;
        field2608 = null;
        field2591 = null;
        field2600 = null;
        int var1 = 118 / ((-arg0 - 53) / 62);
        field2603 = (short[][]) null;
    }

    @OriginalMember(owner = "client!g", name = "b", descriptor = "(I)Lqh;", line = 36)
    public final class287 method1006(int arg0) {
        field2604++;
        this.field2595 = arg0;
        return this.method1010((byte) -102);
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(II)V", line = 45)
    public static final void method1007(int arg0, int arg1) {
        if (arg1 != 0) {
            field2608 = (int[]) null;
        }
        field2597++;
        class118.field1996.method1833(arg0, (byte) 70);
    }

    @OriginalMember(owner = "client!g", name = "<init>", descriptor = "(Loe;)V", line = 314)
    public class151(class120 arg0) {
        this.field2596 = arg0;
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(Lq;BI)V", line = 70)
    public static final void method1008(class90 arg0, byte arg1, int arg2) {
        if (arg1 <= 98) {
            return;
        }
        field2599++;
        while (true) {
            class132 var3 = (class132) class123.field2095.method2024(0);
            if (var3 == null) {
                return;
            }
            boolean var4 = false;
            for (int var5 = 0; var5 < var3.field2285; var5++) {
                if (var3.field2282[var5] != null) {
                    if (var3.field2282[var5].field560 == 2) {
                        var3.field2288[var5] = -5;
                    }
                    if (var3.field2282[var5].field560 == 0) {
                        var4 = true;
                    }
                }
                if (var3.field2295[var5] != null) {
                    if (var3.field2295[var5].field560 == 2) {
                        var3.field2288[var5] = -6;
                    }
                    if (var3.field2295[var5].field560 == 0) {
                        var4 = true;
                    }
                }
            }
            if (var4) {
                return;
            }
            arg0.method570(arg2, -1);
            arg0.method1352(7528, 0);
            int var6 = arg0.field3380;
            arg0.method1337(-104, var3.field2293);
            for (int var7 = 0; var7 < var3.field2285; var7++) {
                if (var3.field2288[var7] == 0) {
                    try {
                        int var8 = var3.field2289[var7];
                        if (var8 == 0) {
                            Field var12 = (Field) var3.field2282[var7].field562;
                            int var13 = var12.getInt((Object) null);
                            arg0.method1352(7528, 0);
                            arg0.method1337(-61, var13);
                        } else if (var8 == 1) {
                            Field var11 = (Field) var3.field2282[var7].field562;
                            var11.setInt((Object) null, var3.field2297[var7]);
                            arg0.method1352(7528, 0);
                        } else if (var8 == 2) {
                            Field var9 = (Field) var3.field2282[var7].field562;
                            int var10 = var9.getModifiers();
                            arg0.method1352(7528, 0);
                            arg0.method1337(-120, var10);
                        }
                        if (var8 == 3) {
                            byte[][] var16 = var3.field2298[var7];
                            Method var17 = (Method) var3.field2295[var7].field562;
                            Object[] var18 = new Object[var16.length];
                            for (int var19 = 0; var19 < var16.length; var19++) {
                                ObjectInputStream var20 = new ObjectInputStream(new ByteArrayInputStream(var16[var19]));
                                var18[var19] = var20.readObject();
                            }
                            Object var21 = var17.invoke((Object) null, var18);
                            if (var21 == null) {
                                arg0.method1352(7528, 0);
                            } else if (var21 instanceof Number) {
                                arg0.method1352(7528, 1);
                                arg0.method1344(113, ((Number) var21).longValue());
                            } else if ((var21 instanceof class128)) {
                                arg0.method1352(7528, 2);
                                arg0.method1343((byte) 66, (class128) var21);
                            } else {
                                arg0.method1352(7528, 4);
                            }
                        } else if (var8 == 4) {
                            Method var14 = (Method) var3.field2295[var7].field562;
                            int var15 = var14.getModifiers();
                            arg0.method1352(7528, 0);
                            arg0.method1337(-91, var15);
                        }
                    } catch (ClassNotFoundException var34) {
                        arg0.method1352(7528, -10);
                    } catch (InvalidClassException var35) {
                        arg0.method1352(7528, -11);
                    } catch (StreamCorruptedException var36) {
                        arg0.method1352(7528, -12);
                    } catch (OptionalDataException var37) {
                        arg0.method1352(7528, -13);
                    } catch (IllegalAccessException var38) {
                        arg0.method1352(7528, -14);
                    } catch (IllegalArgumentException var39) {
                        arg0.method1352(7528, -15);
                    } catch (InvocationTargetException var40) {
                        arg0.method1352(7528, -16);
                    } catch (SecurityException var41) {
                        arg0.method1352(7528, -17);
                    } catch (IOException var42) {
                        arg0.method1352(7528, -18);
                    } catch (NullPointerException var43) {
                        arg0.method1352(7528, -19);
                    } catch (Exception var44) {
                        arg0.method1352(7528, -20);
                    } catch (Throwable var45) {
                        arg0.method1352(7528, -21);
                    }
                } else {
                    arg0.method1352(7528, var3.field2288[var7]);
                }
            }
            arg0.method1332(113, var6);
            arg0.method1294(arg0.field3380 - var6, (byte) -77);
            var3.method1978((byte) -117);
        }
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(IIIIII)V", line = 263)
    public static final void method1009(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field2601++;
        class125.field2103 = arg3;
        if (arg4 != 6379) {
            field2603 = (short[][]) ((short[][]) null);
        }
        class120.field2030 = arg0;
        class204.field3605 = arg1;
        class283.field4862 = arg5;
        class309.field5246 = arg2;
        if (class120.field2030 >= 100) {
            int var6 = class309.field5246 * 128 + 64;
            int var7 = class125.field2103 * 128 + 64;
            int var8 = class64.method427(var6, var7, class133.field2315, (byte) 120) - class283.field4862;
            int var9 = var8 - class187.field3249;
            int var10 = var6 - class142.field2436;
            int var11 = var7 - class143.field2445;
            int var12 = (int) Math.sqrt((double) (var10 * var10 + var11 * var11));
            class311.field5271 = (int) (Math.atan2((double) var9, (double) var12) * 325.949D) & 0x7FF;
            class33.field716 = (int) (-325.949D * Math.atan2((double) var10, (double) var11)) & 0x7FF;
            if (class311.field5271 < 128) {
                class311.field5271 = 128;
            }
            if (class311.field5271 > 383) {
                class311.field5271 = 383;
            }
        }
        class1.field21 = 2;
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(B)Lqh;", line = 323)
    public final class287 method1010(byte arg0) {
        field2592++;
        if (this.field2595 > 0 && this.field2596.field2029[this.field2595 - 1] != this.field2593) {
            class287 var2 = this.field2593;
            this.field2593 = var2.field4902;
            return var2;
        }
        int var3 = -28 / ((-arg0 - 55) / 44);
        class287 var4;
        do {
            if (this.field2596.field2032 <= this.field2595) {
                return null;
            }
            var4 = this.field2596.field2029[this.field2595++].field4902;
        } while (this.field2596.field2029[this.field2595 - 1] == var4);
        this.field2593 = var4.field4902;
        return var4;
    }
}
