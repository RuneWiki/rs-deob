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

@OriginalClass("client!jn")
public class class256 extends class216 {

    @OriginalMember(owner = "client!jn", name = "m", descriptor = "I")
    private int field4273 = 0;

    @OriginalMember(owner = "client!jn", name = "y", descriptor = "Z")
    public boolean field4285 = false;

    @OriginalMember(owner = "client!jn", name = "i", descriptor = "I")
    private int field4269 = 0;

    @OriginalMember(owner = "client!jn", name = "o", descriptor = "Z")
    private boolean field4275 = false;

    @OriginalMember(owner = "client!jn", name = "D", descriptor = "I")
    private int field4290 = -32768;

    @OriginalMember(owner = "client!jn", name = "E", descriptor = "I")
    public int field4291;

    @OriginalMember(owner = "client!jn", name = "G", descriptor = "I")
    public int field4293;

    @OriginalMember(owner = "client!jn", name = "n", descriptor = "I")
    private int field4274;

    @OriginalMember(owner = "client!jn", name = "k", descriptor = "I")
    public int field4271;

    @OriginalMember(owner = "client!jn", name = "z", descriptor = "I")
    public int field4286;

    @OriginalMember(owner = "client!jn", name = "x", descriptor = "I")
    public int field4284;

    @OriginalMember(owner = "client!jn", name = "v", descriptor = "Lwa;")
    private class312 field4282;

    @OriginalMember(owner = "client!jn", name = "j", descriptor = "I")
    public static int field4270 = 0;

    @OriginalMember(owner = "client!jn", name = "u", descriptor = "I")
    public static int field4281 = 0;

    @OriginalMember(owner = "client!jn", name = "A", descriptor = "I")
    public static int field4287 = 0;

    @OriginalMember(owner = "client!jn", name = "h", descriptor = "I")
    public static int field4268;

    @OriginalMember(owner = "client!jn", name = "p", descriptor = "I")
    public static int field4276;

    @OriginalMember(owner = "client!jn", name = "q", descriptor = "I")
    public static int field4277;

    @OriginalMember(owner = "client!jn", name = "r", descriptor = "I")
    public static int field4278;

    @OriginalMember(owner = "client!jn", name = "s", descriptor = "I")
    public static int field4279;

    @OriginalMember(owner = "client!jn", name = "t", descriptor = "I")
    public static int field4280;

    @OriginalMember(owner = "client!jn", name = "w", descriptor = "I")
    public static int field4283;

    @OriginalMember(owner = "client!jn", name = "B", descriptor = "I")
    public static int field4288;

    @OriginalMember(owner = "client!jn", name = "H", descriptor = "I")
    public static int field4294;

    @OriginalMember(owner = "client!jn", name = "F", descriptor = "Lbn;")
    private class194 field4292;

    @OriginalMember(owner = "client!jn", name = "C", descriptor = "Lsi;")
    public static class66 field4289;

    @OriginalMember(owner = "client!jn", name = "l", descriptor = "Lfg;")
    public static class81 field4272;

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(II)V", line = 6)
    public final void method1781(int arg0, int arg1) {
        field4294++;
        if (this.field4285) {
            return;
        }
        this.field4269 += arg1;
        while (this.field4282.field5236[this.field4273] < this.field4269) {
            this.field4269 -= this.field4282.field5236[this.field4273];
            this.field4273++;
            if (this.field4273 >= this.field4282.field5226.length) {
                this.field4285 = true;
                break;
            }
        }
        if (arg0 != 4) {
            this.field4293 = -87;
        }
    }

    @OriginalMember(owner = "client!jn", name = "b", descriptor = "(II)V", line = 35)
    public static final void method1782(int arg0, int arg1) {
        field4268++;
        class281 var2 = class135.method957(0, arg0, 10);
        var2.method1933(arg1 ^ arg1);
    }

    @OriginalMember(owner = "client!jn", name = "b", descriptor = "(I)Lv;", line = 60)
    private final class286 method1783(int arg0) {
        class269 var2 = class259.method1799(arg0 ^ 0xFFFFAFD0, this.field4274);
        field4278++;
        class286 var3;
        if (this.field4285) {
            var3 = var2.method1868(-1, (byte) -107);
        } else {
            var3 = var2.method1868(this.field4273, (byte) -118);
        }
        if (arg0 != -1) {
            this.field4271 = -119;
        }
        return var3 == null ? null : var3;
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(IIIIIIIIJILbn;)V", line = 83)
    public final void method185(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class194 arg10) {
        field4279++;
        class286 var13 = this.method1783(-1);
        if (var13 != null) {
            this.method1787(var13, 1);
            var13.method185(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field4292);
            this.field4290 = var13.method182();
        }
    }

    @OriginalMember(owner = "client!jn", name = "<init>", descriptor = "(IIIIIII)V", line = 436)
    public class256(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field4291 = arg5 + arg6;
        this.field4293 = arg2;
        this.field4274 = arg0;
        this.field4271 = arg3;
        this.field4286 = arg4;
        this.field4284 = arg1;
        int var8 = class259.method1799(20527, this.field4274).field4508;
        if (var8 == -1) {
            this.field4285 = true;
        } else {
            this.field4285 = false;
            this.field4282 = class53.method362((byte) 112, var8);
        }
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(IILdg;)V", line = 115)
    public static final void method1784(int arg0, int arg1, class6 arg2) {
        if (arg0 <= 33) {
            field4272 = (class81) null;
        }
        field4277++;
        while (true) {
            class22 var3 = (class22) class157.field2555.method1580((byte) -39);
            if (var3 == null) {
                return;
            }
            boolean var4 = false;
            for (int var5 = 0; var5 < var3.field286; var5++) {
                if (var3.field285[var5] != null) {
                    if (var3.field285[var5].field4125 == 2) {
                        var3.field290[var5] = -5;
                    }
                    if (var3.field285[var5].field4125 == 0) {
                        var4 = true;
                    }
                }
                if (var3.field281[var5] != null) {
                    if (var3.field281[var5].field4125 == 2) {
                        var3.field290[var5] = -6;
                    }
                    if (var3.field281[var5].field4125 == 0) {
                        var4 = true;
                    }
                }
            }
            if (var4) {
                return;
            }
            arg2.method37(69, arg1);
            arg2.method1188(-105, 0);
            int var6 = arg2.field2670;
            arg2.method1168(var3.field280, (byte) -101);
            for (int var7 = 0; var7 < var3.field286; var7++) {
                if (var3.field290[var7] == 0) {
                    try {
                        int var8 = var3.field293[var7];
                        if (var8 == 0) {
                            Field var12 = (Field) var3.field285[var7].field4123;
                            int var13 = var12.getInt((Object) null);
                            arg2.method1188(-84, 0);
                            arg2.method1168(var13, (byte) -76);
                        } else if (var8 == 1) {
                            Field var9 = (Field) var3.field285[var7].field4123;
                            var9.setInt((Object) null, var3.field284[var7]);
                            arg2.method1188(-102, 0);
                        } else if (var8 == 2) {
                            Field var10 = (Field) var3.field285[var7].field4123;
                            int var11 = var10.getModifiers();
                            arg2.method1188(-83, 0);
                            arg2.method1168(var11, (byte) -71);
                        }
                        if (var8 == 3) {
                            Method var14 = (Method) var3.field281[var7].field4123;
                            byte[][] var15 = var3.field291[var7];
                            Object[] var16 = new Object[var15.length];
                            for (int var17 = 0; var17 < var15.length; var17++) {
                                ObjectInputStream var18 = new ObjectInputStream(new ByteArrayInputStream(var15[var17]));
                                var16[var17] = var18.readObject();
                            }
                            Object var19 = var14.invoke((Object) null, var16);
                            if (var19 == null) {
                                arg2.method1188(-84, 0);
                            } else if ((var19 instanceof Number)) {
                                arg2.method1188(-98, 1);
                                arg2.method1208((byte) -6, ((Number) var19).longValue());
                            } else if ((var19 instanceof class229)) {
                                arg2.method1188(-103, 2);
                                arg2.method1194(-11504, (class229) var19);
                            } else {
                                arg2.method1188(-99, 4);
                            }
                        } else if (var8 == 4) {
                            Method var20 = (Method) var3.field281[var7].field4123;
                            int var21 = var20.getModifiers();
                            arg2.method1188(-125, 0);
                            arg2.method1168(var21, (byte) -81);
                        }
                    } catch (ClassNotFoundException var34) {
                        arg2.method1188(-71, -10);
                    } catch (InvalidClassException var35) {
                        arg2.method1188(-115, -11);
                    } catch (StreamCorruptedException var36) {
                        arg2.method1188(-93, -12);
                    } catch (OptionalDataException var37) {
                        arg2.method1188(-96, -13);
                    } catch (IllegalAccessException var38) {
                        arg2.method1188(-109, -14);
                    } catch (IllegalArgumentException var39) {
                        arg2.method1188(-97, -15);
                    } catch (InvocationTargetException var40) {
                        arg2.method1188(-79, -16);
                    } catch (SecurityException var41) {
                        arg2.method1188(-105, -17);
                    } catch (IOException var42) {
                        arg2.method1188(-120, -18);
                    } catch (NullPointerException var43) {
                        arg2.method1188(-98, -19);
                    } catch (Exception var44) {
                        arg2.method1188(-82, -20);
                    } catch (Throwable var45) {
                        arg2.method1188(-79, -21);
                    }
                } else {
                    arg2.method1188(-115, var3.field290[var7]);
                }
            }
            arg2.method1186(var6, 1528727344);
            arg2.method1173(arg2.field2670 - var6, -1);
            var3.method598(99);
        }
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(IIIII)V", line = 325)
    public final void method183(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field4283++;
        if (!this.field4275) {
            class286 var6 = this.method1783(-1);
            if (var6 == null) {
                return;
            }
            this.method1787(var6, 1);
        }
        if (this.field4292 != null) {
            this.field4292.method1370(arg0, arg1, arg3, arg2, arg4);
        }
    }

    @OriginalMember(owner = "client!jn", name = "c", descriptor = "(I)V", line = 355)
    public static void method1785(int arg0) {
        field4289 = null;
        field4272 = null;
        if (arg0 != 0) {
            method1786(-112, 17, 13, -9);
        }
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(IIII)V", line = 366)
    public static final void method1786(int arg0, int arg1, int arg2, int arg3) {
        field4288++;
        class281 var4 = class135.method957(arg1, arg3, 11);
        var4.method1932(0);
        var4.field4660 = arg2;
        var4.field4657 = arg0;
    }

    @OriginalMember(owner = "client!jn", name = "b", descriptor = "()I", line = 381)
    public final int method182() {
        field4276++;
        return this.field4290;
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(Lv;I)V", line = 403)
    private final void method1787(class286 arg0, int arg1) {
        if (class99.field1675) {
            class322 var4 = (class322) arg0;
            if ((this.field4292 == null || this.field4292.field3197) && (var4.field5464 != null || var4.field5476 != null)) {
                this.field4292 = new class194(class319.field5393, 1, 1);
            }
            if (this.field4292 != null) {
                this.field4292.method1372(var4.field5464, var4.field5476, false, var4.field5448, var4.field5461, var4.field5459);
            }
        } else {
            class246 var3 = (class246) arg0;
            if ((this.field4292 == null || this.field4292.field3197) && (var3.field4083 != null || var3.field4064 != null)) {
                this.field4292 = new class194(class319.field5393, 1, 1);
            }
            if (this.field4292 != null) {
                this.field4292.method1372(var3.field4083, var3.field4064, false, var3.field4072, var3.field4080, var3.field4068);
            }
        }
        field4280++;
        if (arg1 == 1) {
            this.field4275 = true;
        }
    }
}
