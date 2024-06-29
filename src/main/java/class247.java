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

@OriginalClass("client!fi")
public class class247 extends class7 {

    @OriginalMember(owner = "client!fi", name = "x", descriptor = "I")
    private int field4193 = 0;

    @OriginalMember(owner = "client!fi", name = "K", descriptor = "I")
    private int field4206 = 0;

    @OriginalMember(owner = "client!fi", name = "W", descriptor = "Z")
    private boolean field4217 = false;

    @OriginalMember(owner = "client!fi", name = "V", descriptor = "I")
    private int field4216 = -32768;

    @OriginalMember(owner = "client!fi", name = "P", descriptor = "I")
    public int field4211;

    @OriginalMember(owner = "client!fi", name = "A", descriptor = "I")
    private int field4196;

    @OriginalMember(owner = "client!fi", name = "H", descriptor = "I")
    public int field4203;

    @OriginalMember(owner = "client!fi", name = "F", descriptor = "I")
    public int field4201;

    @OriginalMember(owner = "client!fi", name = "O", descriptor = "I")
    private int field4210;

    @OriginalMember(owner = "client!fi", name = "B", descriptor = "I")
    public int field4197;

    @OriginalMember(owner = "client!fi", name = "s", descriptor = "I")
    private int field4188;

    @OriginalMember(owner = "client!fi", name = "z", descriptor = "I")
    private int field4195;

    @OriginalMember(owner = "client!fi", name = "X", descriptor = "I")
    private int field4218;

    @OriginalMember(owner = "client!fi", name = "v", descriptor = "I")
    private int field4191;

    @OriginalMember(owner = "client!fi", name = "M", descriptor = "I")
    public int field4208;

    @OriginalMember(owner = "client!fi", name = "U", descriptor = "Ldh;")
    private class157 field4215;

    @OriginalMember(owner = "client!fi", name = "C", descriptor = "Lbe;")
    private static class283 field4198 = class153.method941(127, "wave:");

    @OriginalMember(owner = "client!fi", name = "Q", descriptor = "Lbe;")
    public static class283 field4212 = class153.method941(-49, "Konfig geladen)3");

    @OriginalMember(owner = "client!fi", name = "L", descriptor = "Lbe;")
    private static class283 field4207 = class153.method941(-125, "Loaded interfaces");

    @OriginalMember(owner = "client!fi", name = "Z", descriptor = "I")
    public static int field4220 = 100;

    @OriginalMember(owner = "client!fi", name = "gb", descriptor = "Lbe;")
    public static class283 field4227 = class153.method941(-68, "p11_full");

    @OriginalMember(owner = "client!fi", name = "G", descriptor = "Lbe;")
    public static class283 field4202 = field4207;

    @OriginalMember(owner = "client!fi", name = "E", descriptor = "[I")
    public static int[] field4200 = new int[5];

    @OriginalMember(owner = "client!fi", name = "hb", descriptor = "Lbe;")
    public static class283 field4228 = field4198;

    @OriginalMember(owner = "client!fi", name = "ib", descriptor = "Lbe;")
    public static class283 field4229 = field4198;

    @OriginalMember(owner = "client!fi", name = "q", descriptor = "D")
    private double field4186;

    @OriginalMember(owner = "client!fi", name = "r", descriptor = "D")
    private double field4187;

    @OriginalMember(owner = "client!fi", name = "D", descriptor = "D")
    private double field4199;

    @OriginalMember(owner = "client!fi", name = "I", descriptor = "D")
    public double field4204;

    @OriginalMember(owner = "client!fi", name = "J", descriptor = "D")
    private double field4205;

    @OriginalMember(owner = "client!fi", name = "S", descriptor = "D")
    public double field4214;

    @OriginalMember(owner = "client!fi", name = "cb", descriptor = "D")
    private double field4223;

    @OriginalMember(owner = "client!fi", name = "eb", descriptor = "D")
    public double field4225;

    @OriginalMember(owner = "client!fi", name = "t", descriptor = "I")
    public static int field4189;

    @OriginalMember(owner = "client!fi", name = "u", descriptor = "I")
    public static int field4190;

    @OriginalMember(owner = "client!fi", name = "w", descriptor = "I")
    public static int field4192;

    @OriginalMember(owner = "client!fi", name = "y", descriptor = "I")
    public static int field4194;

    @OriginalMember(owner = "client!fi", name = "N", descriptor = "I")
    public static int field4209;

    @OriginalMember(owner = "client!fi", name = "R", descriptor = "I")
    public static int field4213;

    @OriginalMember(owner = "client!fi", name = "Y", descriptor = "I")
    private int field4219;

    @OriginalMember(owner = "client!fi", name = "ab", descriptor = "I")
    public static int field4221;

    @OriginalMember(owner = "client!fi", name = "bb", descriptor = "I")
    public int field4222;

    @OriginalMember(owner = "client!fi", name = "db", descriptor = "I")
    public static int field4224;

    @OriginalMember(owner = "client!fi", name = "fb", descriptor = "[I")
    public static int[] field4226;

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(BI)V", line = 6)
    public final void method1679(byte arg0, int arg1) {
        this.field4204 += this.field4199 * 0.5D * (double) arg1 * (double) arg1 + (double) arg1 * this.field4187;
        this.field4214 += (double) arg1 * this.field4205;
        this.field4225 += (double) arg1 * this.field4186;
        field4224++;
        this.field4217 = true;
        if (arg0 != 65) {
            this.field4206 = 56;
        }
        this.field4187 += (double) arg1 * this.field4199;
        this.field4222 = (int) (Math.atan2(this.field4186, this.field4205) * 325.949D) + 1024 & 0x7FF;
        this.field4219 = (int) (Math.atan2(this.field4187, this.field4223) * 325.949D) & 0x7FF;
        if (this.field4215 == null) {
            return;
        }
        this.field4206 += arg1;
        while (true) {
            do {
                do {
                    if (this.field4215.field2568[this.field4193] >= this.field4206) {
                        return;
                    }
                    this.field4206 -= this.field4215.field2568[this.field4193];
                    this.field4193++;
                } while (this.field4193 < this.field4215.field2578.length);
                this.field4193 -= this.field4215.field2567;
            } while (this.field4193 >= 0 && this.field4215.field2578.length > this.field4193);
            this.field4193 = 0;
        }
    }

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "(B)V", line = 57)
    public static void method1680(byte arg0) {
        field4227 = null;
        field4226 = null;
        field4200 = null;
        field4202 = null;
        field4212 = null;
        field4228 = null;
        field4229 = null;
        if (arg0 <= 118) {
            method1684(60, -96);
        }
        field4207 = null;
        field4198 = null;
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(Lwc;II)V", line = 97)
    public static final void method1681(class96 arg0, int arg1, int arg2) {
        if (arg1 < 69) {
            return;
        }
        field4194++;
        while (true) {
            class243 var3 = (class243) class113.field1898.method1812((byte) 107);
            if (var3 == null) {
                return;
            }
            boolean var4 = false;
            for (int var5 = 0; var5 < var3.field4096; var5++) {
                if (var3.field4095[var5] != null) {
                    if (var3.field4095[var5].field5293 == 2) {
                        var3.field4106[var5] = -5;
                    }
                    if (var3.field4095[var5].field5293 == 0) {
                        var4 = true;
                    }
                }
                if (var3.field4105[var5] != null) {
                    if (var3.field4105[var5].field5293 == 2) {
                        var3.field4106[var5] = -6;
                    }
                    if (var3.field4105[var5].field5293 == 0) {
                        var4 = true;
                    }
                }
            }
            if (var4) {
                return;
            }
            arg0.method621(arg2, 8);
            arg0.method1499(true, 0);
            int var6 = arg0.field3905;
            arg0.method1515(var3.field4102, 93);
            for (int var7 = 0; var7 < var3.field4096; var7++) {
                if (var3.field4106[var7] == 0) {
                    try {
                        int var8 = var3.field4094[var7];
                        if (var8 == 0) {
                            Field var9 = (Field) var3.field4095[var7].field5296;
                            int var10 = var9.getInt((Object) null);
                            arg0.method1499(true, 0);
                            arg0.method1515(var10, 94);
                        } else if (var8 == 1) {
                            Field var13 = (Field) var3.field4095[var7].field5296;
                            var13.setInt((Object) null, var3.field4109[var7]);
                            arg0.method1499(true, 0);
                        } else if (var8 == 2) {
                            Field var11 = (Field) var3.field4095[var7].field5296;
                            int var12 = var11.getModifiers();
                            arg0.method1499(true, 0);
                            arg0.method1515(var12, 112);
                        }
                        if (var8 == 3) {
                            Method var14 = (Method) var3.field4105[var7].field5296;
                            byte[][] var15 = var3.field4108[var7];
                            Object[] var16 = new Object[var15.length];
                            for (int var17 = 0; var17 < var15.length; var17++) {
                                ObjectInputStream var18 = new ObjectInputStream(new ByteArrayInputStream(var15[var17]));
                                var16[var17] = var18.readObject();
                            }
                            Object var19 = var14.invoke((Object) null, var16);
                            if (var19 == null) {
                                arg0.method1499(true, 0);
                            } else if (var19 instanceof Number) {
                                arg0.method1499(true, 1);
                                arg0.method1544((byte) 8, ((Number) var19).longValue());
                            } else if ((var19 instanceof class283)) {
                                arg0.method1499(true, 2);
                                arg0.method1520((class283) var19, 115);
                            } else {
                                arg0.method1499(true, 4);
                            }
                        } else if (var8 == 4) {
                            Method var20 = (Method) var3.field4105[var7].field5296;
                            int var21 = var20.getModifiers();
                            arg0.method1499(true, 0);
                            arg0.method1515(var21, 70);
                        }
                    } catch (ClassNotFoundException var34) {
                        arg0.method1499(true, -10);
                    } catch (InvalidClassException var35) {
                        arg0.method1499(true, -11);
                    } catch (StreamCorruptedException var36) {
                        arg0.method1499(true, -12);
                    } catch (OptionalDataException var37) {
                        arg0.method1499(true, -13);
                    } catch (IllegalAccessException var38) {
                        arg0.method1499(true, -14);
                    } catch (IllegalArgumentException var39) {
                        arg0.method1499(true, -15);
                    } catch (InvocationTargetException var40) {
                        arg0.method1499(true, -16);
                    } catch (SecurityException var41) {
                        arg0.method1499(true, -17);
                    } catch (IOException var42) {
                        arg0.method1499(true, -18);
                    } catch (NullPointerException var43) {
                        arg0.method1499(true, -19);
                    } catch (Exception var44) {
                        arg0.method1499(true, -20);
                    } catch (Throwable var45) {
                        arg0.method1499(true, -21);
                    }
                } else {
                    arg0.method1499(true, var3.field4106[var7]);
                }
            }
            arg0.method1506(var6, (byte) -127);
            arg0.method1511(arg0.field3905 - var6, -88);
            var3.method557((byte) -89);
        }
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(Z)Lhk;", line = 291)
    private final class289 method1682(boolean arg0) {
        field4221++;
        class169 var2 = class259.method1750((byte) 81, this.field4191);
        class289 var3 = var2.method1074(this.field4193, 38);
        if (var3 == null) {
            return null;
        }
        if (!arg0) {
            method1680((byte) -96);
        }
        var3.method1362(this.field4219);
        return var3;
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(IIIIIIIIJ)V", line = 313)
    public final void method41(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        class289 var11 = this.method1682(true);
        field4213++;
        if (var11 != null) {
            var11.method41(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
            this.field4216 = var11.method40();
        }
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(IIIZI)V", line = 329)
    public final void method1683(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        field4190++;
        if (!this.field4217) {
            double var6 = (double) (arg1 - this.field4196);
            double var8 = (double) (arg0 - this.field4188);
            double var10 = Math.sqrt(var6 * var6 + var8 * var8);
            this.field4214 = (double) this.field4210 * var8 / var10 + (double) this.field4188;
            this.field4225 = (double) this.field4210 * var6 / var10 + (double) this.field4196;
            this.field4204 = (double) this.field4218;
        }
        double var12 = (double) (this.field4197 + 1 - arg2);
        if (arg3) {
            this.field4186 = -0.7852558004348824D;
        }
        this.field4186 = ((double) arg1 - this.field4225) / var12;
        this.field4205 = ((double) arg0 - this.field4214) / var12;
        this.field4223 = Math.sqrt(this.field4205 * this.field4205 + this.field4186 * this.field4186);
        if (!this.field4217) {
            this.field4187 = -this.field4223 * Math.tan((double) this.field4195 * 0.02454369D);
        }
        this.field4199 = ((double) arg4 - this.field4204 - (this.field4187 * var12)) * 2.0D / (var12 * var12);
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "()I", line = 364)
    public final int method40() {
        field4189++;
        return this.field4216;
    }

    @OriginalMember(owner = "client!fi", name = "<init>", descriptor = "(IIIIIIIIIII)V", line = 432)
    public class247(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field4211 = arg1;
        this.field4217 = false;
        this.field4196 = arg2;
        this.field4203 = arg5;
        this.field4201 = arg10;
        this.field4210 = arg8;
        this.field4197 = arg6;
        this.field4188 = arg3;
        this.field4195 = arg7;
        this.field4218 = arg4;
        this.field4191 = arg0;
        this.field4208 = arg9;
        int var12 = class259.method1750((byte) 82, this.field4191).field2831;
        if (var12 == -1) {
            this.field4215 = null;
        } else {
            this.field4215 = class132.method821(128, var12);
        }
    }

    @OriginalMember(owner = "client!fi", name = "c", descriptor = "(II)V", line = 396)
    public static final void method1684(int arg0, int arg1) {
        field4192++;
        class46.field632.method1637(true, arg0);
        int var2 = -68 % ((arg1 + 13) / 58);
    }
}
