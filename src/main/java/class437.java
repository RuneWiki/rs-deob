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

@OriginalClass("client!cf")
public class class437 {

    @OriginalMember(owner = "client!cf", name = "c", descriptor = "Lfc;")
    private class174 field6124 = new class174(64);

    @OriginalMember(owner = "client!cf", name = "o", descriptor = "Lfc;")
    private class174 field6136 = new class174(100);

    @OriginalMember(owner = "client!cf", name = "f", descriptor = "Loi;")
    private class53 field6127;

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "Leh;")
    public static class246 field6123 = new class246(8, -2);

    @OriginalMember(owner = "client!cf", name = "j", descriptor = "I")
    public static int field6131 = 0;

    @OriginalMember(owner = "client!cf", name = "l", descriptor = "[B")
    public static byte[] field6133 = new byte[520];

    @OriginalMember(owner = "client!cf", name = "n", descriptor = "Lmg;")
    public static class103 field6135 = new class103("WIP", 2);

    @OriginalMember(owner = "client!cf", name = "p", descriptor = "[I")
    public static int[] field6137 = new int[13];

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "I")
    public static int field6122;

    @OriginalMember(owner = "client!cf", name = "d", descriptor = "I")
    public static int field6125;

    @OriginalMember(owner = "client!cf", name = "e", descriptor = "I")
    public static int field6126;

    @OriginalMember(owner = "client!cf", name = "g", descriptor = "I")
    public static int field6128;

    @OriginalMember(owner = "client!cf", name = "h", descriptor = "I")
    public static int field6129;

    @OriginalMember(owner = "client!cf", name = "i", descriptor = "I")
    public static int field6130;

    @OriginalMember(owner = "client!cf", name = "k", descriptor = "I")
    public static int field6132;

    @OriginalMember(owner = "client!cf", name = "m", descriptor = "I")
    public static int field6134;

    @OriginalMember(owner = "client!cf", name = "q", descriptor = "Loi;")
    public static class53 field6138;

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(BILvo;I)Lvf;", line = 6)
    public static final class106 method2564(byte arg0, int arg1, class32 arg2, int arg3) {
        field6134++;
        int var4 = arg2.field377 | arg1 << 8;
        class106 var5 = (class106) class17.field209.method1781(false, (long) var4 << 16);
        if (var5 != null) {
            return var5;
        }
        byte[] var6 = class324.field4734.method421(class324.field4734.method425(true, var4), 1);
        if (var6 == null) {
            int var8 = arg3 + 65536 << 8 | arg2.field377;
            class106 var9 = (class106) class17.field209.method1781(false, (long) var8 << 16);
            if (var9 != null) {
                return var9;
            }
            byte[] var10 = class324.field4734.method421(class324.field4734.method425(true, var8), 1);
            if (var10 == null) {
                int var12 = arg2.field377 | 0xFFFF00;
                class106 var13 = (class106) class17.field209.method1781(false, (long) var12 << 16);
                int var14 = -38 % ((61 - arg0) / 48);
                if (var13 != null) {
                    return var13;
                }
                byte[] var15 = class324.field4734.method421(class324.field4734.method425(true, var12), 1);
                if (var15 == null) {
                    return null;
                } else if (var15.length <= 1) {
                    return null;
                } else {
                    class106 var16 = class330.method1985(0, var15);
                    var16.field1404 = arg2;
                    class17.field209.method1779(var16, (byte) -27, (long) var12 << 16);
                    return var16;
                }
            } else if (var10.length <= 1) {
                return null;
            } else {
                class106 var11 = class330.method1985(0, var10);
                var11.field1404 = arg2;
                class17.field209.method1779(var11, (byte) -27, (long) var8 << 16);
                return var11;
            }
        } else if (var6.length <= 1) {
            return null;
        } else {
            class106 var7 = class330.method1985(0, var6);
            var7.field1404 = arg2;
            class17.field209.method1779(var7, (byte) -27, (long) var4 << 16);
            return var7;
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(I)V", line = 76)
    public final void method2565(int arg0) {
        if (arg0 != 0) {
            field6131 = -102;
        }
        class174 var2 = this.field6124;
        synchronized (this.field6124) {
            this.field6124.method1096((byte) -76);
        }
        field6122++;
        class174 var3 = this.field6136;
        synchronized (this.field6136) {
            this.field6136.method1096((byte) -18);
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(II)Leb;", line = 96)
    public final class449 method2566(int arg0, int arg1) {
        field6125++;
        class174 var3 = this.field6124;
        class449 var4;
        synchronized (this.field6124) {
            var4 = (class449) this.field6124.method1088((long) arg0, (byte) 115);
        }
        if (var4 != null) {
            return var4;
        }
        class53 var5 = this.field6127;
        byte[] var6;
        synchronized (this.field6127) {
            var6 = this.field6127.method426(class41.method235(arg1 - 30303, arg0), (byte) 9, class357.method2112(arg0, (byte) 119));
        }
        class449 var7 = new class449();
        var7.field6275 = this;
        var7.field6269 = arg0;
        if (var6 != null) {
            var7.method2628(new class403(var6), (byte) 58);
        }
        var7.method2627(arg1 ^ 0xFFFFFF9F);
        class174 var8 = this.field6124;
        synchronized (this.field6124) {
            if (arg1 != -19) {
                method2567(true);
            }
            this.field6124.method1097(19627, var7, (long) arg0);
            return var7;
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(Z)V", line = 129)
    public static void method2567(boolean arg0) {
        field6138 = null;
        if (arg0) {
            field6137 = null;
        }
        field6133 = null;
        field6135 = null;
        field6137 = null;
        field6123 = null;
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(B)V", line = 143)
    public final void method2568(byte arg0) {
        field6130++;
        class174 var2 = this.field6124;
        synchronized (this.field6124) {
            this.field6124.method1095(arg0 + 20);
        }
        if (arg0 == -20) {
            class174 var3 = this.field6136;
            synchronized (this.field6136) {
                this.field6136.method1095(arg0 ^ 0xFFFFFFEC);
            }
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "([JZ[Ljava/lang/Object;)V", line = 161)
    public static final void method2569(long[] arg0, boolean arg1, Object[] arg2) {
        field6132++;
        class171.method1070(arg0.length - 1, (byte) -23, arg2, arg0, 0);
        if (!arg1) {
            field6133 = null;
        }
    }

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "(II)V", line = 176)
    public final void method2570(int arg0, int arg1) {
        class174 var3 = this.field6124;
        synchronized (this.field6124) {
            this.field6124.method1087(1, arg1);
        }
        field6126++;
        int var4 = -36 / ((-arg0 - 69) / 43);
        class174 var5 = this.field6136;
        synchronized (this.field6136) {
            this.field6136.method1087(1, arg1);
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(Ljp;IZ)V", line = 191)
    public static final void method2571(class241 arg0, int arg1, boolean arg2) {
        if (!arg2) {
            return;
        }
        field6128++;
        while (true) {
            class227 var3 = (class227) class100.field1337.method2655(15152);
            if (var3 == null) {
                return;
            }
            boolean var4 = false;
            for (int var5 = 0; var5 < var3.field3263; var5++) {
                if (var3.field3271[var5] != null) {
                    if (var3.field3271[var5].field5277 == 2) {
                        var3.field3273[var5] = -5;
                    }
                    if (var3.field3271[var5].field5277 == 0) {
                        var4 = true;
                    }
                }
                if (var3.field3264[var5] != null) {
                    if (var3.field3264[var5].field5277 == 2) {
                        var3.field3273[var5] = -6;
                    }
                    if (var3.field3264[var5].field5277 == 0) {
                        var4 = true;
                    }
                }
            }
            if (var4) {
                return;
            }
            arg0.method1523(9823, arg1);
            arg0.method2376((byte) 122, 0);
            int var6 = arg0.field5665;
            arg0.method2354(var3.field3267, !arg2);
            for (int var7 = 0; var7 < var3.field3263; var7++) {
                if (var3.field3273[var7] == 0) {
                    try {
                        int var8 = var3.field3266[var7];
                        if (var8 == 0) {
                            Field var12 = (Field) var3.field3271[var7].field5274;
                            int var13 = var12.getInt(null);
                            arg0.method2376((byte) 122, 0);
                            arg0.method2354(var13, !arg2);
                        } else if (var8 == 1) {
                            Field var11 = (Field) var3.field3271[var7].field5274;
                            var11.setInt(null, var3.field3268[var7]);
                            arg0.method2376((byte) 122, 0);
                        } else if (var8 == 2) {
                            Field var9 = (Field) var3.field3271[var7].field5274;
                            int var10 = var9.getModifiers();
                            arg0.method2376((byte) 122, 0);
                            arg0.method2354(var10, !arg2);
                        }
                        if (var8 == 3) {
                            Method var14 = (Method) var3.field3264[var7].field5274;
                            byte[][] var15 = var3.field3270[var7];
                            Object[] var16 = new Object[var15.length];
                            for (int var17 = 0; var17 < var15.length; var17++) {
                                ObjectInputStream var18 = new ObjectInputStream(new ByteArrayInputStream(var15[var17]));
                                var16[var17] = var18.readObject();
                            }
                            Object var19 = var14.invoke(null, var16);
                            if (var19 == null) {
                                arg0.method2376((byte) 122, 0);
                            } else if (var19 instanceof Number) {
                                arg0.method2376((byte) 122, 1);
                                arg0.method2358(((Number) var19).longValue(), (byte) -49);
                            } else if (var19 instanceof String) {
                                arg0.method2376((byte) 122, 2);
                                arg0.method2377((byte) -53, (String) var19);
                            } else {
                                arg0.method2376((byte) 122, 4);
                            }
                        } else if (var8 == 4) {
                            Method var20 = (Method) var3.field3264[var7].field5274;
                            int var21 = var20.getModifiers();
                            arg0.method2376((byte) 122, 0);
                            arg0.method2354(var21, false);
                        }
                    } catch (ClassNotFoundException var22) {
                        arg0.method2376((byte) 122, -10);
                    } catch (InvalidClassException var23) {
                        arg0.method2376((byte) 122, -11);
                    } catch (StreamCorruptedException var24) {
                        arg0.method2376((byte) 122, -12);
                    } catch (OptionalDataException var25) {
                        arg0.method2376((byte) 122, -13);
                    } catch (IllegalAccessException var26) {
                        arg0.method2376((byte) 122, -14);
                    } catch (IllegalArgumentException var27) {
                        arg0.method2376((byte) 122, -15);
                    } catch (InvocationTargetException var28) {
                        arg0.method2376((byte) 122, -16);
                    } catch (SecurityException var29) {
                        arg0.method2376((byte) 122, -17);
                    } catch (IOException var30) {
                        arg0.method2376((byte) 122, -18);
                    } catch (NullPointerException var31) {
                        arg0.method2376((byte) 122, -19);
                    } catch (Exception var32) {
                        arg0.method2376((byte) 122, -20);
                    } catch (Throwable var33) {
                        arg0.method2376((byte) 122, -21);
                    }
                } else {
                    arg0.method2376((byte) 122, var3.field3273[var7]);
                }
            }
            arg0.method2344(false, var6);
            arg0.method2349((byte) -93, arg0.field5665 - var6);
            var3.method2891(5);
        }
    }

    @OriginalMember(owner = "client!cf", name = "<init>", descriptor = "(Lle;ILoi;Loi;Loi;)V", line = 434)
    public class437(class205 arg0, int arg1, class53 arg2, class53 arg3, class53 arg4) {
        this.field6127 = arg2;
        if (this.field6127 != null) {
            int var6 = this.field6127.method434(26154) - 1;
            this.field6127.method435(var6, 0);
        }
        class405.method2400(arg3, false, arg4);
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(IB)Lmh;", line = 402)
    public final class454 method2572(int arg0, byte arg1) {
        field6129++;
        class174 var3 = this.field6136;
        class454 var5;
        synchronized (this.field6136) {
            if (arg1 < 62) {
                return null;
            }
            var5 = (class454) this.field6136.method1088((long) arg0, (byte) -112);
            if (var5 == null) {
                var5 = new class454(arg0);
                this.field6136.method1097(19627, var5, (long) arg0);
            }
        }
        synchronized (var5) {
            return var5.method2650(true) ? var5 : null;
        }
    }
}
