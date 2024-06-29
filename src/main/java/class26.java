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

@OriginalClass("client!uf")
public class class26 extends class349 {

    @OriginalMember(owner = "client!uf", name = "y", descriptor = "I")
    private int field667;

    @OriginalMember(owner = "client!uf", name = "A", descriptor = "I")
    private int field669;

    @OriginalMember(owner = "client!uf", name = "s", descriptor = "I")
    private int field661;

    @OriginalMember(owner = "client!uf", name = "o", descriptor = "I")
    private int field657;

    @OriginalMember(owner = "client!uf", name = "z", descriptor = "I")
    private int field668;

    @OriginalMember(owner = "client!uf", name = "u", descriptor = "I")
    private int field663;

    @OriginalMember(owner = "client!uf", name = "F", descriptor = "I")
    private int field674;

    @OriginalMember(owner = "client!uf", name = "x", descriptor = "I")
    private int field666;

    @OriginalMember(owner = "client!uf", name = "r", descriptor = "I")
    public static int field660 = 0;

    @OriginalMember(owner = "client!uf", name = "C", descriptor = "[I")
    public static int[] field671 = new int[99];

    @OriginalMember(owner = "client!uf", name = "t", descriptor = "I")
    public static int field662 = 0;

    @OriginalMember(owner = "client!uf", name = "I", descriptor = "I")
    public static int field677;

    @OriginalMember(owner = "client!uf", name = "p", descriptor = "I")
    public static int field658;

    @OriginalMember(owner = "client!uf", name = "q", descriptor = "I")
    public static int field659;

    @OriginalMember(owner = "client!uf", name = "B", descriptor = "I")
    public static int field670;

    @OriginalMember(owner = "client!uf", name = "D", descriptor = "I")
    public static int field672;

    @OriginalMember(owner = "client!uf", name = "E", descriptor = "I")
    public static int field673;

    @OriginalMember(owner = "client!uf", name = "G", descriptor = "I")
    public static int field675;

    @OriginalMember(owner = "client!uf", name = "H", descriptor = "I")
    public static int field676;

    @OriginalMember(owner = "client!uf", name = "w", descriptor = "Ljj;")
    public static class168 field665;

    @OriginalMember(owner = "client!uf", name = "v", descriptor = "Lek;")
    public static class206 field664;

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(III)V", line = 5)
    public final void method210(int arg0, int arg1, int arg2) {
        field675++;
        if (arg0 != 12459) {
            this.method215(105, -95, 48);
        }
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(I)V", line = 19)
    public static final void method211(int arg0) {
        class35.method262();
        int var1 = 60 / ((-arg0 - 37) / 51);
        class85.method648((byte) -33);
        class200.method1372(0);
        field659++;
        class262.field4311.method486(-1);
        class339.field5365 = new class223();
        ((class7) class305.field4968).method83(1);
        class17.method168();
        class2.field63 = new class33[255];
        class2.field50 = 0;
        class294.method2100();
        class221.method1548();
        class128.method912(104);
        class189.method1309(-1, false);
        class8.method96(32);
        class310.method2256((byte) 61);
        for (int var2 = 0; var2 < 2048; var2++) {
            class98 var3 = class182.field3151[var2];
            if (var3 != null) {
                var3.field141 = null;
            }
        }
        if (class241.field4016) {
            class221.method1546(104, 104);
            class194.method1342(-127, class133.field2281);
            class214.method1473();
        }
        class237.method1647(class99.field1828, class124.field2186, (byte) -5);
        class127.method907(false, class99.field1828);
        class220.field3652 = null;
        class114.field2066 = null;
        class71.field1300 = null;
        class15.field450 = null;
        class156.field2639 = null;
        if (class334.field5326 == 5) {
            class44.method371(true, class99.field1828);
        }
        if (class334.field5326 == 10) {
            class267.method1873((byte) 122, false);
        }
        if (class334.field5326 == 30) {
            class311.method2260(25, -19880);
        }
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(IILih;)V", line = 83)
    public static final void method212(int arg0, int arg1, class39 arg2) {
        field670++;
        if (arg1 <= 17) {
            method216(122, 125, 17);
        }
        while (true) {
            class136 var3 = (class136) class164.field2755.method431(0);
            if (var3 == null) {
                return;
            }
            boolean var4 = false;
            for (int var5 = 0; var5 < var3.field2324; var5++) {
                if (var3.field2326[var5] != null) {
                    if (var3.field2326[var5].field3504 == 2) {
                        var3.field2322[var5] = -5;
                    }
                    if (var3.field2326[var5].field3504 == 0) {
                        var4 = true;
                    }
                }
                if (var3.field2331[var5] != null) {
                    if (var3.field2331[var5].field3504 == 2) {
                        var3.field2322[var5] = -6;
                    }
                    if (var3.field2331[var5].field3504 == 0) {
                        var4 = true;
                    }
                }
            }
            if (var4) {
                return;
            }
            arg2.method291((byte) 71, arg0);
            arg2.method1027(0, -20374);
            int var6 = arg2.field2435;
            arg2.method1045((byte) 114, var3.field2327);
            for (int var7 = 0; var7 < var3.field2324; var7++) {
                if (var3.field2322[var7] == 0) {
                    try {
                        int var8 = var3.field2323[var7];
                        if (var8 == 0) {
                            Field var9 = (Field) var3.field2326[var7].field3501;
                            int var10 = var9.getInt((Object) null);
                            arg2.method1027(0, -20374);
                            arg2.method1045((byte) -59, var10);
                        } else if (var8 == 1) {
                            Field var11 = (Field) var3.field2326[var7].field3501;
                            var11.setInt((Object) null, var3.field2325[var7]);
                            arg2.method1027(0, -20374);
                        } else if (var8 == 2) {
                            Field var12 = (Field) var3.field2326[var7].field3501;
                            int var13 = var12.getModifiers();
                            arg2.method1027(0, -20374);
                            arg2.method1045((byte) -49, var13);
                        }
                        if (var8 == 3) {
                            Method var14 = (Method) var3.field2331[var7].field3501;
                            byte[][] var15 = var3.field2328[var7];
                            Object[] var16 = new Object[var15.length];
                            for (int var17 = 0; var17 < var15.length; var17++) {
                                ObjectInputStream var18 = new ObjectInputStream(new ByteArrayInputStream(var15[var17]));
                                var16[var17] = var18.readObject();
                            }
                            Object var19 = var14.invoke((Object) null, var16);
                            if (var19 == null) {
                                arg2.method1027(0, -20374);
                            } else if (var19 instanceof Number) {
                                arg2.method1027(1, -20374);
                                arg2.method1003((byte) -15, ((Number) var19).longValue());
                            } else if ((var19 instanceof String)) {
                                arg2.method1027(2, -20374);
                                arg2.method1012((String) var19, (byte) 53);
                            } else {
                                arg2.method1027(4, -20374);
                            }
                        } else if (var8 == 4) {
                            Method var20 = (Method) var3.field2331[var7].field3501;
                            int var21 = var20.getModifiers();
                            arg2.method1027(0, -20374);
                            arg2.method1045((byte) -4, var21);
                        }
                    } catch (ClassNotFoundException var34) {
                        arg2.method1027(-10, -20374);
                    } catch (InvalidClassException var35) {
                        arg2.method1027(-11, -20374);
                    } catch (StreamCorruptedException var36) {
                        arg2.method1027(-12, -20374);
                    } catch (OptionalDataException var37) {
                        arg2.method1027(-13, -20374);
                    } catch (IllegalAccessException var38) {
                        arg2.method1027(-14, -20374);
                    } catch (IllegalArgumentException var39) {
                        arg2.method1027(-15, -20374);
                    } catch (InvocationTargetException var40) {
                        arg2.method1027(-16, -20374);
                    } catch (SecurityException var41) {
                        arg2.method1027(-17, -20374);
                    } catch (IOException var42) {
                        arg2.method1027(-18, -20374);
                    } catch (NullPointerException var43) {
                        arg2.method1027(-19, -20374);
                    } catch (Exception var44) {
                        arg2.method1027(-20, -20374);
                    } catch (Throwable var45) {
                        arg2.method1027(-21, -20374);
                    }
                } else {
                    arg2.method1027(var3.field2322[var7], -20374);
                }
            }
            arg2.method1053((byte) 118, var6);
            arg2.method990(false, arg2.field2435 - var6);
            var3.method535(-2801);
        }
    }

    @OriginalMember(owner = "client!uf", name = "c", descriptor = "(III)V", line = 275)
    public final void method213(int arg0, int arg1, int arg2) {
        if (arg2 != 13258) {
            this.field657 = 90;
        }
        field658++;
    }

    @OriginalMember(owner = "client!uf", name = "b", descriptor = "(I)V", line = 286)
    public static void method214(int arg0) {
        field665 = null;
        if (arg0 != 104) {
            field672 = 126;
        }
        field671 = null;
        field664 = null;
    }

    @OriginalMember(owner = "client!uf", name = "b", descriptor = "(III)V", line = 306)
    public final void method215(int arg0, int arg1, int arg2) {
        if (arg0 != -1664663732) {
            field677 = -102;
        }
        field676++;
        int var4 = this.field663 * arg1 >> 12;
        int var5 = this.field657 * arg2 >> 12;
        int var6 = this.field667 * arg1 >> 12;
        int var7 = this.field666 * arg1 >> 12;
        int var8 = this.field668 * arg2 >> 12;
        int var9 = this.field674 * arg2 >> 12;
        int var10 = this.field669 * arg2 >> 12;
        int var11 = this.field661 * arg1 >> 12;
        class345.method2459(var4, this.field5583, var6, var5, var7, var10, var11, var8, 23805, var9);
    }

    @OriginalMember(owner = "client!uf", name = "d", descriptor = "(III)V", line = 333)
    public static final void method216(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < class138.field2345; var3++) {
            for (int var4 = 0; var4 < class224.field3701; var4++) {
                for (int var5 = 0; var5 < class280.field4578; var5++) {
                    class312 var6 = class353.field5644[var3][var4][var5];
                    if (var6 != null) {
                        class16 var7 = var6.field5102;
                        if (var7 != null && var7.field473.method418()) {
                            class310.method2255(var7.field473, var3, var4, var5, 1, 1);
                            if (var7.field465 != null && var7.field465.method418()) {
                                class310.method2255(var7.field465, var3, var4, var5, 1, 1);
                                var7.field473.method426(var7.field465, 0, 0, 0, false);
                                var7.field465 = var7.field465.method397(arg0, arg1, arg2);
                            }
                            var7.field473 = var7.field473.method397(arg0, arg1, arg2);
                        }
                        for (int var8 = 0; var8 < var6.field5078; var8++) {
                            class278 var9 = var6.field5089[var8];
                            if (var9 != null && var9.field4529.method418()) {
                                class310.method2255(var9.field4529, var3, var4, var5, var9.field4525 + 1 - var9.field4523, var9.field4544 - var9.field4530 + 1);
                                var9.field4529 = var9.field4529.method397(arg0, arg1, arg2);
                            }
                        }
                        class94 var10 = var6.field5092;
                        if (var10 != null && var10.field1653.method418()) {
                            class244.method1726(var10.field1653, var3, var4, var5);
                            var10.field1653 = var10.field1653.method397(arg0, arg1, arg2);
                        }
                    }
                }
            }
        }
    }

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 99; var1++) {
            int var2 = var1 + 1;
            int var3 = (int) (Math.pow(2.0D, (double) var2 / 7.0D) * 300.0D + (double) var2);
            var0 += var3;
            field671[var1] = var0 / 4;
        }
        field677 = 0;
    }

    @OriginalMember(owner = "client!uf", name = "<init>", descriptor = "(IIIIIIIIII)V", line = 410)
    public class26(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        super(-1, arg8, arg9);
        this.field667 = arg3;
        this.field669 = arg6;
        this.field661 = arg7;
        this.field657 = arg2;
        this.field668 = arg4;
        this.field663 = arg1;
        this.field674 = arg0;
        this.field666 = arg5;
    }
}
