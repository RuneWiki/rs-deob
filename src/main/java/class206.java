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

@OriginalClass("client!ii")
public class class206 extends class89 {

    @OriginalMember(owner = "client!ii", name = "eb", descriptor = "I")
    private int field3701 = -1;

    @OriginalMember(owner = "client!ii", name = "V", descriptor = "I")
    public static int field3692 = 0;

    @OriginalMember(owner = "client!ii", name = "W", descriptor = "I")
    public static int field3693 = 5063219;

    @OriginalMember(owner = "client!ii", name = "Y", descriptor = "I")
    public static int field3695 = -2;

    @OriginalMember(owner = "client!ii", name = "X", descriptor = "Lha;")
    public static class46 field3694 = class271.method1828("Suche nach Updates )2 ", -46);

    @OriginalMember(owner = "client!ii", name = "mb", descriptor = "Lha;")
    private static class46 field3709 = class271.method1828("Take", -46);

    @OriginalMember(owner = "client!ii", name = "T", descriptor = "Lha;")
    public static class46 field3690 = field3709;

    @OriginalMember(owner = "client!ii", name = "S", descriptor = "I")
    public static int field3689;

    @OriginalMember(owner = "client!ii", name = "U", descriptor = "I")
    public static int field3691;

    @OriginalMember(owner = "client!ii", name = "Z", descriptor = "I")
    public static int field3696;

    @OriginalMember(owner = "client!ii", name = "bb", descriptor = "I")
    public static int field3698;

    @OriginalMember(owner = "client!ii", name = "cb", descriptor = "I")
    private int field3699;

    @OriginalMember(owner = "client!ii", name = "db", descriptor = "I")
    private int field3700;

    @OriginalMember(owner = "client!ii", name = "fb", descriptor = "I")
    public static int field3702;

    @OriginalMember(owner = "client!ii", name = "gb", descriptor = "I")
    public static int field3703;

    @OriginalMember(owner = "client!ii", name = "hb", descriptor = "I")
    public static int field3704;

    @OriginalMember(owner = "client!ii", name = "ib", descriptor = "I")
    public static int field3705;

    @OriginalMember(owner = "client!ii", name = "jb", descriptor = "I")
    public static int field3706;

    @OriginalMember(owner = "client!ii", name = "lb", descriptor = "I")
    public static int field3708;

    @OriginalMember(owner = "client!ii", name = "ab", descriptor = "Z")
    public static boolean field3697;

    @OriginalMember(owner = "client!ii", name = "R", descriptor = "[I")
    private int[] field3688;

    @OriginalMember(owner = "client!ii", name = "kb", descriptor = "[Lrk;")
    public static class179[] field3707;

    @OriginalMember(owner = "client!ii", name = "c", descriptor = "(I)V")
    public final void method695(int arg0) {
        super.method695(89);
        this.field3688 = null;
        if (arg0 < 6) {
            this.field3701 = -21;
        }
        ++field3689;
    }

    @OriginalMember(owner = "client!ii", name = "d", descriptor = "(I)I")
    public static final int method1456(int arg0) {
        ++field3705;
        return arg0 != 0 ? -29 : class168.field2965;
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(IIIIZIII)V")
    public static final void method1457(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6, int arg7) {
        ++field3706;
        int var8 = arg6 + arg7;
        int var9 = -arg7 + arg5;
        int var10 = arg0 + arg7;
        if (!arg4) {
            field3694 = null;
        }
        for (int var11 = arg6; ~var8 < ~var11; ++var11) {
            class24.method170((byte) 33, arg0, class6.field100[var11], arg1, arg2);
        }
        int var12 = -arg7 + arg1;
        for (int var13 = arg5; var9 < var13; --var13) {
            class24.method170((byte) 33, arg0, class6.field100[var13], arg1, arg2);
        }
        for (int var14 = var8; ~var9 <= ~var14; ++var14) {
            int[] var15 = class6.field100[var14];
            class24.method170((byte) 33, arg0, var15, var10, arg2);
            class24.method170((byte) 33, var10, var15, var12, arg3);
            class24.method170((byte) 33, var12, var15, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!ii", name = "<init>", descriptor = "()V")
    public class206() {
        super(0, false);
    }

    @OriginalMember(owner = "client!ii", name = "e", descriptor = "(I)V")
    public static void method1458(int arg0) {
        field3709 = null;
        field3707 = null;
        field3694 = null;
        if (arg0 < 108) {
            method1461(-123, 4, -47, -110);
        }
        field3690 = null;
    }

    @OriginalMember(owner = "client!ii", name = "c", descriptor = "(B)I")
    public final int method686(byte arg0) {
        if (arg0 < 30) {
            return 45;
        } else {
            ++field3696;
            return this.field3701;
        }
    }

    @OriginalMember(owner = "client!ii", name = "f", descriptor = "(I)Z")
    private final boolean method1459(int arg0) {
        if (arg0 != 128) {
            return true;
        } else {
            ++field3698;
            if (this.field3688 != null) {
                return true;
            } else if (~this.field3701 <= -1) {
                int var2 = class241.field4284;
                int var3 = class113.field2149;
                int var4 = !class10.field174.method730(0, this.field3701) ? 128 : 64;
                this.field3688 = class10.field174.method733((byte) -76, this.field3701);
                this.field3700 = var4;
                this.field3699 = var4;
                class45.method299(var3, arg0 ^ 8260, var2);
                return this.field3688 != null;
            } else {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(ZB)V")
    public static final void method1460(boolean arg0, byte arg1) {
        ++field3702;
        if (!class65.field1089 != !arg0) {
            class65.field1089 = arg0;
            class86.method675(0);
            if (arg1 != 77) {
                field3707 = null;
            }
        }
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(Lwe;II)V")
    public final void method14(class75 arg0, int arg1, int arg2) {
        if (arg1 == -641641492) {
            if (arg2 == 0) {
                this.field3701 = arg0.method545((byte) -121);
            }
            ++field3704;
        }
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(IIII)I")
    public static final int method1461(int arg0, int arg1, int arg2, int arg3) {
        ++field3691;
        if (class119.field2228 == null) {
            return 0;
        } else {
            if (arg3 != 4) {
                field3697 = true;
            }
            int var4 = arg0 >> 7;
            int var5 = arg2 >> 7;
            if (var5 >= 0 && var4 >= 0 && var5 <= 103 && ~var4 >= -104) {
                int var6 = arg1;
                if (arg1 < 3 && (2 & class111.field2081[1][var5][var4]) == 2) {
                    var6 = arg1 + 1;
                }
                int var7 = arg2 & 127;
                int var8 = 127 & arg0;
                int var9 = (-var7 + 128) * class119.field2228[var6][var5][var4 + 1] - -(class119.field2228[var6][var5 - -1][var4 + 1] * var7) >> 7;
                int var10 = (-var7 + 128) * class119.field2228[var6][var5][var4] - -(class119.field2228[var6][var5 - -1][var4] * var7) >> 7;
                return (-var8 + 128) * var10 + var8 * var9 >> 7;
            } else {
                return 0;
            }
        }
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(ILdl;I)V")
    public static final void method1462(int arg0, class43 arg1, int arg2) {
        ++field3703;
        if (arg0 != 0) {
            method1460(false, (byte) -16);
        }
        while (true) {
            class57 var3 = (class57) class131.field2395.method264(-118);
            if (var3 == null) {
                return;
            }
            boolean var4 = false;
            for (int var5 = 0; var3.field959 > var5; ++var5) {
                if (var3.field949[var5] != null) {
                    if (~var3.field949[var5].field2925 == -3) {
                        var3.field961[var5] = -5;
                    }
                    if (~var3.field949[var5].field2925 == -1) {
                        var4 = true;
                    }
                }
                if (var3.field953[var5] != null) {
                    if (var3.field953[var5].field2925 == 2) {
                        var3.field961[var5] = -6;
                    }
                    if (var3.field953[var5].field2925 == 0) {
                        var4 = true;
                    }
                }
            }
            if (var4) {
                return;
            }
            arg1.method285((byte) -90, arg2);
            arg1.method570(0, arg0 + 15619);
            int var6 = arg1.field1380;
            arg1.method581(true, var3.field960);
            for (int var7 = 0; ~var7 > ~var3.field959; ++var7) {
                if (~var3.field961[var7] != -1) {
                    arg1.method570(var3.field961[var7], 15619);
                } else {
                    try {
                        int var8 = var3.field954[var7];
                        if (var8 == 0) {
                            Field var9 = (Field) var3.field949[var7].field2921;
                            int var10 = var9.getInt((Object) null);
                            arg1.method570(0, 15619);
                            arg1.method581(true, var10);
                        } else if (~var8 == -2) {
                            Field var11 = (Field) var3.field949[var7].field2921;
                            var11.setInt((Object) null, var3.field952[var7]);
                            arg1.method570(0, arg0 + 15619);
                        } else if (~var8 == -3) {
                            Field var12 = (Field) var3.field949[var7].field2921;
                            int var13 = var12.getModifiers();
                            arg1.method570(0, 15619);
                            arg1.method581(true, var13);
                        }
                        if (~var8 != -4) {
                            if (var8 == 4) {
                                Method var14 = (Method) var3.field953[var7].field2921;
                                int var15 = var14.getModifiers();
                                arg1.method570(0, 15619);
                                arg1.method581(true, var15);
                            }
                        } else {
                            byte[][] var16 = var3.field963[var7];
                            Object[] var17 = new Object[var16.length];
                            Method var18 = (Method) var3.field953[var7].field2921;
                            for (int var19 = 0; ~var16.length < ~var19; ++var19) {
                                ObjectInputStream var20 = new ObjectInputStream(new ByteArrayInputStream(var16[var19]));
                                var17[var19] = var20.readObject();
                            }
                            Object var21 = var18.invoke((Object) null, var17);
                            if (var21 != null) {
                                if (!(var21 instanceof Number)) {
                                    if (var21 instanceof class46) {
                                        arg1.method570(2, 15619);
                                        arg1.method584((class46) var21, arg0 + 19347);
                                    } else {
                                        arg1.method570(4, 15619);
                                    }
                                } else {
                                    arg1.method570(1, 15619);
                                    arg1.method578((byte) -122, ((Number) var21).longValue());
                                }
                            } else {
                                arg1.method570(0, 15619);
                            }
                        }
                    } catch (ClassNotFoundException var22) {
                        arg1.method570(-10, arg0 ^ 15619);
                    } catch (InvalidClassException var23) {
                        arg1.method570(-11, 15619);
                    } catch (StreamCorruptedException var24) {
                        arg1.method570(-12, arg0 + 15619);
                    } catch (OptionalDataException var25) {
                        arg1.method570(-13, arg0 ^ 15619);
                    } catch (IllegalAccessException var26) {
                        arg1.method570(-14, 15619);
                    } catch (IllegalArgumentException var27) {
                        arg1.method570(-15, 15619);
                    } catch (InvocationTargetException var28) {
                        arg1.method570(-16, arg0 ^ 15619);
                    } catch (SecurityException var29) {
                        arg1.method570(-17, arg0 + 15619);
                    } catch (IOException var30) {
                        arg1.method570(-18, 15619);
                    } catch (NullPointerException var31) {
                        arg1.method570(-19, 15619);
                    } catch (Exception var32) {
                        arg1.method570(-20, arg0 ^ 15619);
                    } catch (Throwable var33) {
                        arg1.method570(-21, arg0 ^ 15619);
                    }
                }
            }
            arg1.method592(255, var6);
            arg1.method556(-var6 + arg1.field1380, 80);
            var3.method501(0);
        }
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(IB)[[I")
    public final int[][] method30(int arg0, byte arg1) {
        if (arg1 != 25) {
            field3692 = 94;
        }
        int[][] var3 = super.field1695.method843((byte) -25, arg0);
        if (super.field1695.field2028 && this.method1459(128)) {
            int var4 = this.field3699 * (class113.field2149 != this.field3700 ? this.field3700 * arg0 / class113.field2149 : arg0);
            int[] var5 = var3[0];
            int[] var6 = var3[1];
            int[] var7 = var3[2];
            if (class241.field4284 != this.field3699) {
                for (int var8 = 0; var8 < class241.field4284; ++var8) {
                    int var9 = this.field3699 * var8 / class241.field4284;
                    int var10 = this.field3688[var4 + var9];
                    var7[var8] = class50.method369(var10 << 4, 4080);
                    var6[var8] = class50.method369(var10 >> 4, 4080);
                    var5[var8] = class50.method369(var10 >> 12, 4080);
                }
            } else {
                for (int var11 = 0; var11 < class241.field4284; ++var11) {
                    int var12 = this.field3688[var4++];
                    var7[var11] = class50.method369(4080, var12 << 4);
                    var6[var11] = class50.method369(65280, var12) >> 4;
                    var5[var11] = class50.method369(var12 >> 12, 4080);
                }
            }
        }
        ++field3708;
        return var3;
    }
}
