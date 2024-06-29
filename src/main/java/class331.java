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

@OriginalClass("client!ap")
public class class331 extends class417 implements class248 {

    @OriginalMember(owner = "client!ap", name = "U", descriptor = "Z")
    private boolean field5006;

    @OriginalMember(owner = "client!ap", name = "H", descriptor = "Z")
    private boolean field4993;

    @OriginalMember(owner = "client!ap", name = "M", descriptor = "Z")
    private boolean field4998;

    @OriginalMember(owner = "client!ap", name = "D", descriptor = "S")
    private short field4989;

    @OriginalMember(owner = "client!ap", name = "N", descriptor = "B")
    private byte field4999;

    @OriginalMember(owner = "client!ap", name = "A", descriptor = "B")
    private byte field4986;

    @OriginalMember(owner = "client!ap", name = "db", descriptor = "B")
    private byte field5015;

    @OriginalMember(owner = "client!ap", name = "z", descriptor = "Z")
    private boolean field4985;

    @OriginalMember(owner = "client!ap", name = "X", descriptor = "Lj;")
    private class377 field5009;

    @OriginalMember(owner = "client!ap", name = "J", descriptor = "Lc;")
    public class121 field4995;

    @OriginalMember(owner = "client!ap", name = "cb", descriptor = "S")
    public static short field5014 = 32767;

    @OriginalMember(owner = "client!ap", name = "B", descriptor = "I")
    public static int field4987;

    @OriginalMember(owner = "client!ap", name = "C", descriptor = "I")
    public static int field4988;

    @OriginalMember(owner = "client!ap", name = "E", descriptor = "I")
    public static int field4990;

    @OriginalMember(owner = "client!ap", name = "F", descriptor = "I")
    public static int field4991;

    @OriginalMember(owner = "client!ap", name = "G", descriptor = "I")
    public static int field4992;

    @OriginalMember(owner = "client!ap", name = "I", descriptor = "I")
    public static int field4994;

    @OriginalMember(owner = "client!ap", name = "K", descriptor = "I")
    public static int field4996;

    @OriginalMember(owner = "client!ap", name = "L", descriptor = "I")
    public static int field4997;

    @OriginalMember(owner = "client!ap", name = "O", descriptor = "I")
    public static int field5000;

    @OriginalMember(owner = "client!ap", name = "P", descriptor = "I")
    public static int field5001;

    @OriginalMember(owner = "client!ap", name = "Q", descriptor = "I")
    public static int field5002;

    @OriginalMember(owner = "client!ap", name = "R", descriptor = "I")
    public static int field5003;

    @OriginalMember(owner = "client!ap", name = "S", descriptor = "I")
    public static int field5004;

    @OriginalMember(owner = "client!ap", name = "T", descriptor = "I")
    public static int field5005;

    @OriginalMember(owner = "client!ap", name = "V", descriptor = "I")
    public static int field5007;

    @OriginalMember(owner = "client!ap", name = "W", descriptor = "I")
    public static int field5008;

    @OriginalMember(owner = "client!ap", name = "Y", descriptor = "I")
    public static int field5010;

    @OriginalMember(owner = "client!ap", name = "Z", descriptor = "I")
    public static int field5011;

    @OriginalMember(owner = "client!ap", name = "ab", descriptor = "I")
    public static int field5012;

    @OriginalMember(owner = "client!ap", name = "bb", descriptor = "I")
    public static int field5013;

    @OriginalMember(owner = "client!ap", name = "b", descriptor = "(I)I")
    public final int method12(int arg0) {
        ++field5012;
        if (arg0 != 3765) {
            this.field5009 = null;
        }
        return this.field5015;
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(Lqa;ZII)Lmr;")
    private final class95 method2122(class162 arg0, boolean arg1, int arg2, int arg3) {
        ++field4992;
        if (arg3 >= -102) {
            this.field5006 = true;
        }
        class79 var5 = class319.field4807.method2874(this.field4989 & 65535, -17045);
        class35 var6;
        class35 var7;
        if (!this.field4998) {
            if (~this.field4986 > -4) {
                var6 = class43.field829[this.field4986 - -1];
            } else {
                var6 = null;
            }
            var7 = class43.field829[this.field4986];
        } else {
            var6 = class43.field829[0];
            var7 = class335.field5061[this.field4986];
        }
        return var5.method625(super.field6228, super.field6233, this.field5015 != 11 ? this.field4999 : this.field4999 + 4, var6, arg2, arg1, arg0, var7, ~this.field5015 != -12 ? this.field5015 : 10, super.field6230, -1);
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(ILqa;)V")
    public final void method15(int arg0, class162 arg1) {
        ++field5003;
        if (arg0 != -13300) {
            this.method15(-101, (class162) null);
        }
        Object var3 = null;
        class377 var5;
        if (this.field5009 == null && this.field4985) {
            class95 var4 = this.method2122(arg1, true, 262144, arg0 + 13191);
            var5 = var4 != null ? var4.field1602 : null;
        } else {
            var5 = this.field5009;
            this.field5009 = null;
        }
        if (var5 != null) {
            class254.method1633(var5, this.field4986, super.field6228, super.field6233, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(ILqa;B)Lc;")
    private final class121 method2123(int arg0, class162 arg1, byte arg2) {
        ++field4991;
        if (this.field4995 != null && ~arg1.method255(this.field4995.method889(), arg0) == -1) {
            return this.field4995;
        } else {
            class95 var4 = this.method2122(arg1, false, arg0, -122);
            int var5 = -20 % ((42 - arg2) / 39);
            return var4 == null ? null : var4.field1606;
        }
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(IILck;)V")
    public static final void method2124(int arg0, int arg1, class452 arg2) {
        if (arg0 != 0) {
            field5014 = 98;
        }
        ++field5008;
        while (true) {
            class84 var3 = (class84) class201.field2942.method2427(arg0 + 112);
            if (var3 == null) {
                return;
            }
            boolean var4 = false;
            for (int var5 = 0; var5 < var3.field1458; ++var5) {
                if (var3.field1456[var5] != null) {
                    if (var3.field1456[var5].field4940 == 2) {
                        var3.field1460[var5] = -5;
                    }
                    if (var3.field1456[var5].field4940 == 0) {
                        var4 = true;
                    }
                }
                if (var3.field1454[var5] != null) {
                    if (~var3.field1454[var5].field4940 == -3) {
                        var3.field1460[var5] = -6;
                    }
                    if (~var3.field1454[var5].field4940 == -1) {
                        var4 = true;
                    }
                }
            }
            if (var4) {
                return;
            }
            arg2.method2694(arg1, false);
            arg2.method1109(false, 0);
            int var6 = arg2.field2289;
            arg2.method1117(var3.field1462, (byte) 12);
            for (int var7 = 0; ~var7 > ~var3.field1458; ++var7) {
                if (~var3.field1460[var7] != -1) {
                    arg2.method1109(false, var3.field1460[var7]);
                } else {
                    try {
                        int var8 = var3.field1463[var7];
                        if (var8 == 0) {
                            Field var9 = (Field) var3.field1456[var7].field4939;
                            int var10 = var9.getInt((Object) null);
                            arg2.method1109(false, 0);
                            arg2.method1117(var10, (byte) 12);
                        } else if (var8 != 1) {
                            if (var8 == 2) {
                                Field var11 = (Field) var3.field1456[var7].field4939;
                                int var12 = var11.getModifiers();
                                arg2.method1109(false, 0);
                                arg2.method1117(var12, (byte) 12);
                            }
                        } else {
                            Field var13 = (Field) var3.field1456[var7].field4939;
                            var13.setInt((Object) null, var3.field1461[var7]);
                            arg2.method1109(false, 0);
                        }
                        if (~var8 != -4) {
                            if (~var8 == -5) {
                                Method var14 = (Method) var3.field1454[var7].field4939;
                                int var15 = var14.getModifiers();
                                arg2.method1109(false, 0);
                                arg2.method1117(var15, (byte) 12);
                            }
                        } else {
                            Method var16 = (Method) var3.field1454[var7].field4939;
                            byte[][] var17 = var3.field1457[var7];
                            Object[] var18 = new Object[var17.length];
                            for (int var19 = 0; var17.length > var19; ++var19) {
                                ObjectInputStream var20 = new ObjectInputStream(new ByteArrayInputStream(var17[var19]));
                                var18[var19] = var20.readObject();
                            }
                            Object var21 = var16.invoke((Object) null, var18);
                            if (var21 != null) {
                                if (var21 instanceof Number) {
                                    arg2.method1109(false, 1);
                                    arg2.method1084(2, ((Number) var21).longValue());
                                } else if (var21 instanceof String) {
                                    arg2.method1109(false, 2);
                                    arg2.method1089((byte) -89, (String) var21);
                                } else {
                                    arg2.method1109(false, 4);
                                }
                            } else {
                                arg2.method1109(false, 0);
                            }
                        }
                    } catch (ClassNotFoundException var22) {
                        arg2.method1109(false, -10);
                    } catch (InvalidClassException var23) {
                        arg2.method1109(false, -11);
                    } catch (StreamCorruptedException var24) {
                        arg2.method1109(false, -12);
                    } catch (OptionalDataException var25) {
                        arg2.method1109(false, -13);
                    } catch (IllegalAccessException var26) {
                        arg2.method1109(false, -14);
                    } catch (IllegalArgumentException var27) {
                        arg2.method1109(false, -15);
                    } catch (InvocationTargetException var28) {
                        arg2.method1109(false, -16);
                    } catch (SecurityException var29) {
                        arg2.method1109(false, -17);
                    } catch (IOException var30) {
                        arg2.method1109(false, -18);
                    } catch (NullPointerException var31) {
                        arg2.method1109(false, -19);
                    } catch (Exception var32) {
                        arg2.method1109(false, -20);
                    } catch (Throwable var33) {
                        arg2.method1109(false, -21);
                    }
                }
            }
            arg2.method1106(var6, (byte) -3);
            arg2.method1110(-var6 + arg2.field2289, false);
            var3.method2090(-1);
        }
    }

    @OriginalMember(owner = "client!ap", name = "c", descriptor = "(I)V")
    public final void method26(int arg0) {
        if (this.field4995 != null) {
            this.field4995.method898();
        }
        ++field4997;
        int var2 = 58 % ((arg0 - -46) / 44);
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(ILqa;ZLto;III)V")
    public final void method18(int arg0, class162 arg1, boolean arg2, class8 arg3, int arg4, int arg5, int arg6) {
        if (arg4 == -1) {
            ++field4996;
            if (!(arg3 instanceof class213)) {
                if (arg3 instanceof class331) {
                    class331 var8 = (class331) arg3;
                    if (this.field4995 != null && var8.field4995 != null) {
                        this.field4995.method928(var8.field4995, arg0, arg6, arg5, arg2);
                        return;
                    }
                }
            } else {
                class213 var9 = (class213) arg3;
                if (this.field4995 == null || var9.field3063 == null) {
                    return;
                }
                this.field4995.method928(var9.field3063, arg0, arg6, arg5, arg2);
            }
        }
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(ZLqa;)Lae;")
    public final class163 method13(boolean arg0, class162 arg1) {
        ++field5013;
        if (this.field4995 == null) {
            return null;
        } else {
            class414 var3 = arg1.method240();
            if (arg0) {
                method2124(-95, 72, (class452) null);
            }
            var3.method868(super.field6228, super.field6230, super.field6233);
            class163 var4 = null;
            if (this.field5006) {
                var4 = class483.method2876(1, 0);
            }
            this.field4995.method927(var3, var4 == null ? null : var4.field2516[0], 0);
            return var4;
        }
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(BLqa;)V")
    public final void method25(byte arg0, class162 arg1) {
        ++field5001;
        int var3 = 55 % ((-45 - arg0) / 48);
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(B)I")
    public final int method19(byte arg0) {
        ++field4987;
        return arg0 != -69 ? -44 : this.field4999;
    }

    @OriginalMember(owner = "client!ap", name = "f", descriptor = "(I)I")
    public final int method2125(int arg0) {
        if (arg0 != 0) {
            this.method26(85);
        }
        ++field5005;
        return this.field4995 == null ? 15 : this.field4995.method891() / 4;
    }

    @OriginalMember(owner = "client!ap", name = "<init>", descriptor = "(Lqa;Lgm;IIIIIZIIIIIIZ)V")
    public class331(class162 arg0, class79 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, boolean arg14) {
        super(arg2, arg4, arg5, arg6, arg8, arg9, arg10, arg11, arg1.field1331 == 1, class59.method521(arg12, arg13, (byte) 76));
        this.field5006 = ~arg1.field1357 != -1 && !arg7;
        this.field4993 = arg14;
        this.field4998 = arg7;
        this.field4989 = (short) arg1.field1318;
        this.field4999 = (byte) arg13;
        this.field4986 = (byte) arg3;
        this.field5015 = (byte) arg12;
        this.field4985 = arg0.method226() && arg1.field1385 && !this.field4998 && class443.field6623.method338(-4, class169.field2624) != 0;
        int var16 = 2048;
        if (this.field4993) {
            var16 |= 65536;
        }
        class95 var17 = this.method2122(arg0, this.field4985, var16, -118);
        if (var17 != null) {
            this.field5009 = var17.field1602;
            this.field4995 = var17.field1606;
            if (this.field4993) {
                this.field4995 = this.field4995.method938((byte) 0, var16, false);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!ap", name = "d", descriptor = "(I)I")
    public final int method547(int arg0) {
        if (arg0 != 3) {
            this.method17((byte) -95);
        }
        ++field5004;
        return this.field4995 == null ? 0 : this.field4995.method930();
    }

    @OriginalMember(owner = "client!ap", name = "c", descriptor = "(B)V")
    public final void method22(byte arg0) {
        ++field4990;
        this.field4993 = false;
        if (arg0 != -3) {
            this.field4986 = 120;
        }
        if (this.field4995 != null) {
            this.field4995.method906(this.field4995.method889() & -65537);
        }
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(III)I")
    public static final int method2126(int arg0, int arg1, int arg2) {
        ++field5007;
        int var3 = class64.method543(arg0 + -1, 133704508, arg1 + -1) - -class64.method543(arg0 + -1, 133704508, arg1 + 1) - (-class64.method543(arg0 + 1, 133704508, arg1 - 1) + -class64.method543(arg0 + 1, 133704508, arg1 + 1));
        int var4 = class64.method543(arg0, 133704508, arg1 + -1) - -class64.method543(arg0, 133704508, arg1 - -1) - -class64.method543(arg0 - 1, 133704508, arg1) + class64.method543(arg0 + 1, 133704508, arg1);
        int var5 = class64.method543(arg0, 133704508, arg1);
        return arg2 >= -43 ? 69 : var3 / 16 + var4 / 8 + var5 / 4;
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(Lqa;I)V")
    public final void method9(class162 arg0, int arg1) {
        ++field5011;
        Object var3 = null;
        if (arg1 <= -111) {
            class377 var5;
            if (this.field5009 == null && this.field4985) {
                class95 var4 = this.method2122(arg0, true, 262144, -120);
                var5 = var4 != null ? var4.field1602 : null;
            } else {
                var5 = this.field5009;
                this.field5009 = null;
            }
            if (var5 != null) {
                class13.method88(var5, this.field4986, super.field6228, super.field6233, (boolean[]) null);
            }
        }
    }

    @OriginalMember(owner = "client!ap", name = "b", descriptor = "(B)I")
    public final int method17(byte arg0) {
        int var2 = -29 % ((arg0 - -60) / 40);
        ++field4994;
        return this.field4989 & 65535;
    }

    @OriginalMember(owner = "client!ap", name = "b", descriptor = "(Z)Z")
    public final boolean method24(boolean arg0) {
        ++field4988;
        if (arg0) {
            this.method25((byte) -7, (class162) null);
        }
        return this.field4993;
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(I)Z")
    public final boolean method8(int arg0) {
        ++field5000;
        if (arg0 <= 94) {
            this.field4999 = 109;
        }
        return this.field4985;
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(ILqa;II)Z")
    public final boolean method14(int arg0, class162 arg1, int arg2, int arg3) {
        ++field5010;
        class121 var5 = this.method2123(arg0, arg1, (byte) 89);
        if (var5 != null) {
            class414 var6 = arg1.method240();
            var6.method868(super.field6228, super.field6230, super.field6233);
            return var5.method924(arg3, arg2, var6, false);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(Lqa;II)Lc;")
    public final class121 method23(class162 arg0, int arg1, int arg2) {
        if (arg1 != 17793) {
            this.field5009 = null;
        }
        ++field5002;
        return this.method2123(arg2, arg0, (byte) -60);
    }
}
