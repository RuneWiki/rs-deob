import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nm")
public abstract class class405 extends class417 {

    @OriginalMember(owner = "client!nm", name = "n", descriptor = "I")
    public int field5537;

    @OriginalMember(owner = "client!nm", name = "q", descriptor = "I")
    private int field5540;

    @OriginalMember(owner = "client!nm", name = "j", descriptor = "I")
    public int field5533;

    @OriginalMember(owner = "client!nm", name = "w", descriptor = "F")
    public float field5546;

    @OriginalMember(owner = "client!nm", name = "k", descriptor = "I")
    private int field5534;

    @OriginalMember(owner = "client!nm", name = "m", descriptor = "I")
    public int field5536;

    @OriginalMember(owner = "client!nm", name = "l", descriptor = "Lbn;")
    public static class378 field5535 = new class378(2, 14);

    @OriginalMember(owner = "client!nm", name = "y", descriptor = "I")
    public static int field5548 = -1;

    @OriginalMember(owner = "client!nm", name = "i", descriptor = "I")
    public static int field5532;

    @OriginalMember(owner = "client!nm", name = "o", descriptor = "I")
    public static int field5538;

    @OriginalMember(owner = "client!nm", name = "p", descriptor = "I")
    public static int field5539;

    @OriginalMember(owner = "client!nm", name = "r", descriptor = "I")
    public static int field5541;

    @OriginalMember(owner = "client!nm", name = "s", descriptor = "I")
    public static int field5542;

    @OriginalMember(owner = "client!nm", name = "t", descriptor = "I")
    public static int field5543;

    @OriginalMember(owner = "client!nm", name = "u", descriptor = "I")
    public static int field5544;

    @OriginalMember(owner = "client!nm", name = "v", descriptor = "I")
    public static int field5545;

    @OriginalMember(owner = "client!nm", name = "x", descriptor = "Ldba;")
    public static class79 field5547;

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(I)F")
    public final float method2382(int arg0) {
        field5545++;
        return arg0 == 0 ? this.field5546 : 0.29109082F;
    }

    @OriginalMember(owner = "client!nm", name = "b", descriptor = "(I)I")
    public final int method2383(int arg0) {
        field5543++;
        if (arg0 != 2039035457) {
            this.field5536 = -63;
        }
        return this.field5537;
    }

    @OriginalMember(owner = "client!nm", name = "c", descriptor = "(I)I")
    public final int method2384(int arg0) {
        if (arg0 != 630) {
            field5547 = null;
        }
        field5532++;
        return this.field5534;
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(B)Z")
    public static final boolean method2385(byte arg0) {
        field5539++;
        Hashtable var1 = new Hashtable();
        Enumeration var2 = class50.field582.keys();
        while (var2.hasMoreElements()) {
            Object var3 = var2.nextElement();
            var1.put(var3, class50.field582.get(var3));
        }
        try {
            Class var4 = Class.forName("java.lang.reflect.AccessibleObject");
            Class var5 = Class.forName("java.lang.ClassLoader");
            Field var6 = var5.getDeclaredField("nativeLibraries");
            if (arg0 > -62) {
                field5547 = null;
            }
            Method var7 = var4.getDeclaredMethod("setAccessible", Boolean.TYPE);
            var7.invoke(var6, Boolean.TRUE);
            try {
                Enumeration var8 = class50.field582.keys();
                while (var8.hasMoreElements()) {
                    String var9 = (String) var8.nextElement();
                    try {
                        File var10 = (File) class485.field6909.get(var9);
                        Class var11 = (Class) class50.field582.get(var9);
                        Vector var12 = (Vector) var6.get(var11.getClassLoader());
                        for (int var13 = 0; var13 < var12.size(); var13++) {
                            try {
                                Object var14 = var12.elementAt(var13);
                                Field var15 = var14.getClass().getDeclaredField("name");
                                var7.invoke(var15, Boolean.TRUE);
                                try {
                                    String var16 = (String) var15.get(var14);
                                    if (var16 != null && var16.equalsIgnoreCase(var10.getCanonicalPath())) {
                                        Field var17 = var14.getClass().getDeclaredField("handle");
                                        Method var18 = var14.getClass().getDeclaredMethod("finalize");
                                        var7.invoke(var17, Boolean.TRUE);
                                        var7.invoke(var18, Boolean.TRUE);
                                        try {
                                            var18.invoke(var14);
                                            var17.set(var14, Integer.valueOf(0));
                                            var1.remove(var9);
                                        } catch (Throwable var19) {
                                        }
                                        var7.invoke(var18, Boolean.FALSE);
                                        var7.invoke(var17, Boolean.FALSE);
                                    }
                                } catch (Throwable var20) {
                                }
                                var7.invoke(var15, Boolean.FALSE);
                            } catch (Throwable var21) {
                            }
                        }
                    } catch (Throwable var22) {
                    }
                }
            } catch (Throwable var23) {
            }
            var7.invoke(var6, Boolean.FALSE);
        } catch (Throwable var24) {
        }
        class50.field582 = var1;
        return class50.field582.isEmpty();
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(IIIIIII)V")
    public static final void method2386(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class196.method1322((byte) 25, arg6);
        field5541++;
        int var7 = 0;
        int var8 = arg6 - arg5;
        if (var8 < 0) {
            var8 = 0;
        }
        int var9 = arg6;
        int var10 = -arg6;
        int var11 = var8;
        int var12 = -var8;
        if (arg3 >= -66) {
            method2385((byte) -128);
        }
        int var13 = -1;
        if (class3.field25 <= arg0 && class100.field1452 >= arg0) {
            int[] var14 = class604.field8993[arg0];
            int var15 = class36.method223(class130.field1801, (byte) 50, arg1 - arg6, class14.field136);
            int var16 = class36.method223(class130.field1801, (byte) 50, arg1 + arg6, class14.field136);
            int var17 = class36.method223(class130.field1801, (byte) 50, arg1 - var8, class14.field136);
            int var18 = class36.method223(class130.field1801, (byte) 50, arg1 + var8, class14.field136);
            class140.method969(var15, 15888, arg4, var17, var14);
            class140.method969(var17, 15888, arg2, var18, var14);
            class140.method969(var18, 15888, arg4, var16, var14);
        }
        int var19 = -1;
        while (var7 < var9) {
            var13 += 2;
            var19 += 2;
            var12 += var19;
            var10 += var13;
            if (var12 >= 0 && var11 >= 1) {
                var11--;
                var12 -= var11 << 1;
                class423.field5715[var11] = var7;
            }
            var7++;
            if (var10 >= 0) {
                var9--;
                var10 -= var9 << 1;
                int var20 = arg0 - var9;
                int var21 = arg0 + var9;
                if (var21 >= class3.field25 && class100.field1452 >= var20) {
                    if (var8 > var9) {
                        int var22 = class423.field5715[var9];
                        int var23 = class36.method223(class130.field1801, (byte) 50, arg1 + var7, class14.field136);
                        int var24 = class36.method223(class130.field1801, (byte) 50, arg1 - var7, class14.field136);
                        int var25 = class36.method223(class130.field1801, (byte) 50, arg1 + var22, class14.field136);
                        int var26 = class36.method223(class130.field1801, (byte) 50, arg1 - var22, class14.field136);
                        if (class100.field1452 >= var21) {
                            int[] var27 = class604.field8993[var21];
                            class140.method969(var24, 15888, arg4, var26, var27);
                            class140.method969(var26, 15888, arg2, var25, var27);
                            class140.method969(var25, 15888, arg4, var23, var27);
                        }
                        if (var20 >= class3.field25) {
                            int[] var28 = class604.field8993[var20];
                            class140.method969(var24, 15888, arg4, var26, var28);
                            class140.method969(var26, 15888, arg2, var25, var28);
                            class140.method969(var25, 15888, arg4, var23, var28);
                        }
                    } else {
                        int var29 = class36.method223(class130.field1801, (byte) 50, arg1 + var7, class14.field136);
                        int var30 = class36.method223(class130.field1801, (byte) 50, arg1 - var7, class14.field136);
                        if (var21 <= class100.field1452) {
                            class140.method969(var30, 15888, arg4, var29, class604.field8993[var21]);
                        }
                        if (class3.field25 <= var20) {
                            class140.method969(var30, 15888, arg4, var29, class604.field8993[var20]);
                        }
                    }
                }
            }
            int var31 = arg0 - var7;
            int var32 = arg0 + var7;
            if (class3.field25 <= var32 && var31 <= class100.field1452) {
                int var33 = arg1 + var9;
                int var34 = arg1 - var9;
                if (class14.field136 <= var33 && var34 <= class130.field1801) {
                    int var35 = class36.method223(class130.field1801, (byte) 50, var33, class14.field136);
                    int var36 = class36.method223(class130.field1801, (byte) 50, var34, class14.field136);
                    if (var8 > var7) {
                        int var37 = var11 < var7 ? class423.field5715[var7] : var11;
                        int var38 = class36.method223(class130.field1801, (byte) 50, arg1 + var37, class14.field136);
                        int var39 = class36.method223(class130.field1801, (byte) 50, arg1 - var37, class14.field136);
                        if (class100.field1452 >= var32) {
                            int[] var40 = class604.field8993[var32];
                            class140.method969(var36, 15888, arg4, var39, var40);
                            class140.method969(var39, 15888, arg2, var38, var40);
                            class140.method969(var38, 15888, arg4, var35, var40);
                        }
                        if (class3.field25 <= var31) {
                            int[] var41 = class604.field8993[var31];
                            class140.method969(var36, 15888, arg4, var39, var41);
                            class140.method969(var39, 15888, arg2, var38, var41);
                            class140.method969(var38, 15888, arg4, var35, var41);
                        }
                    } else {
                        if (var32 <= class100.field1452) {
                            class140.method969(var36, 15888, arg4, var35, class604.field8993[var32]);
                        }
                        if (var31 >= class3.field25) {
                            class140.method969(var36, 15888, arg4, var35, class604.field8993[var31]);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(BIII)V")
    public abstract void method1437(byte arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!nm", name = "g", descriptor = "(I)V")
    public static void method2387(int arg0) {
        field5535 = null;
        field5547 = null;
        int var1 = 32 / ((arg0 - 37) / 53);
    }

    @OriginalMember(owner = "client!nm", name = "<init>", descriptor = "(IIIIIF)V")
    public class405(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        this.field5537 = arg1;
        this.field5540 = arg3;
        this.field5533 = arg0;
        this.field5546 = arg5;
        this.field5534 = arg4;
        this.field5536 = arg2;
    }

    @OriginalMember(owner = "client!nm", name = "b", descriptor = "(B)I")
    public final int method2388(byte arg0) {
        field5538++;
        int var2 = -61 / ((arg0 + 18) / 60);
        return this.field5533;
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(FZ)V")
    public abstract void method1439(float arg0, boolean arg1);

    @OriginalMember(owner = "client!nm", name = "h", descriptor = "(I)I")
    public final int method2389(int arg0) {
        field5544++;
        return arg0 == -10161 ? this.field5536 : 103;
    }

    @OriginalMember(owner = "client!nm", name = "i", descriptor = "(I)I")
    public final int method2390(int arg0) {
        if (arg0 != 6042) {
            this.method2390(110);
        }
        field5542++;
        return this.field5540;
    }
}
