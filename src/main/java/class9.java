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

@OriginalClass("client!kw")
public class class9 extends class115 {

    @OriginalMember(owner = "client!kw", name = "J", descriptor = "[B")
    public byte[] field133;

    @OriginalMember(owner = "client!kw", name = "D", descriptor = "I")
    public static int field127;

    @OriginalMember(owner = "client!kw", name = "E", descriptor = "I")
    public static int field128;

    @OriginalMember(owner = "client!kw", name = "F", descriptor = "I")
    public int field129;

    @OriginalMember(owner = "client!kw", name = "G", descriptor = "I")
    public static int field130;

    @OriginalMember(owner = "client!kw", name = "H", descriptor = "I")
    public int field131;

    @OriginalMember(owner = "client!kw", name = "I", descriptor = "I")
    public int field132;

    @OriginalMember(owner = "client!kw", name = "K", descriptor = "I")
    public static int field134;

    @OriginalMember(owner = "client!kw", name = "L", descriptor = "I")
    public static int field135;

    @OriginalMember(owner = "client!kw", name = "M", descriptor = "I")
    public int field136;

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "(IIIII)V")
    public final void method145(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field127++;
        this.field132 = arg4;
        if (arg0 > -35) {
            this.field136 = -21;
        }
        this.field129 = arg2 - arg4;
        this.field131 = arg3;
        this.field136 = arg1 - arg3;
    }

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "(Lkja;B)V")
    public static final void method146(class373 arg0, byte arg1) {
        field135++;
        class588 var2 = (class588) class351.field4967.method3731((byte) -69);
        if (var2 == null) {
            return;
        }
        boolean var3 = false;
        for (int var4 = 0; var4 < var2.field8446; var4++) {
            if (var2.field8444[var4] != null) {
                if (var2.field8444[var4].field10365 == 2) {
                    var2.field8442[var4] = -5;
                }
                if (var2.field8444[var4].field10365 == 0) {
                    var3 = true;
                }
            }
            if (var2.field8448[var4] != null) {
                if (var2.field8448[var4].field10365 == 2) {
                    var2.field8442[var4] = -6;
                }
                if (var2.field8448[var4].field10365 == 0) {
                    var3 = true;
                }
            }
        }
        if (var3) {
            return;
        }
        int var5 = arg0.field5983;
        arg0.method2548(var2.field8450, (byte) -101);
        for (int var6 = 0; var6 < var2.field8446; var6++) {
            if (var2.field8442[var6] == 0) {
                try {
                    int var7 = var2.field8449[var6];
                    if (var7 == 0) {
                        Field var8 = (Field) var2.field8444[var6].field10371;
                        int var9 = var8.getInt(null);
                        arg0.method2524(false, 0);
                        arg0.method2548(var9, (byte) -126);
                    } else if (var7 == 1) {
                        Field var12 = (Field) var2.field8444[var6].field10371;
                        var12.setInt(null, var2.field8443[var6]);
                        arg0.method2524(false, 0);
                    } else if (var7 == 2) {
                        Field var10 = (Field) var2.field8444[var6].field10371;
                        int var11 = var10.getModifiers();
                        arg0.method2524(false, 0);
                        arg0.method2548(var11, (byte) -125);
                    }
                    if (var7 == 3) {
                        Method var15 = (Method) var2.field8448[var6].field10371;
                        byte[][] var16 = var2.field8452[var6];
                        Object[] var17 = new Object[var16.length];
                        for (int var18 = 0; var18 < var16.length; var18++) {
                            ObjectInputStream var19 = new ObjectInputStream(new ByteArrayInputStream(var16[var18]));
                            var17[var18] = var19.readObject();
                        }
                        Object var20 = var15.invoke(null, var17);
                        if (var20 == null) {
                            arg0.method2524(false, 0);
                        } else if ((var20 instanceof Number)) {
                            arg0.method2524(false, 1);
                            arg0.method2563(true, ((Number) var20).longValue());
                        } else if ((var20 instanceof String)) {
                            arg0.method2524(false, 2);
                            arg0.method2566(-2, (String) var20);
                        } else {
                            arg0.method2524(false, 4);
                        }
                    } else if (var7 == 4) {
                        Method var13 = (Method) var2.field8448[var6].field10371;
                        int var14 = var13.getModifiers();
                        arg0.method2524(false, 0);
                        arg0.method2548(var14, (byte) -115);
                    }
                } catch (ClassNotFoundException var21) {
                    arg0.method2524(false, -10);
                } catch (InvalidClassException var22) {
                    arg0.method2524(false, -11);
                } catch (StreamCorruptedException var23) {
                    arg0.method2524(false, -12);
                } catch (OptionalDataException var24) {
                    arg0.method2524(false, -13);
                } catch (IllegalAccessException var25) {
                    arg0.method2524(false, -14);
                } catch (IllegalArgumentException var26) {
                    arg0.method2524(false, -15);
                } catch (InvocationTargetException var27) {
                    arg0.method2524(false, -16);
                } catch (SecurityException var28) {
                    arg0.method2524(false, -17);
                } catch (IOException var29) {
                    arg0.method2524(false, -18);
                } catch (NullPointerException var30) {
                    arg0.method2524(false, -19);
                } catch (Exception var31) {
                    arg0.method2524(false, -20);
                } catch (Throwable var32) {
                    arg0.method2524(false, -21);
                }
            } else {
                arg0.method2524(false, var2.field8442[var6]);
            }
        }
        if (arg1 != -121) {
            method146(null, (byte) 120);
        }
        arg0.method2584(var5, false);
        var2.method4237(-1);
    }

    @OriginalMember(owner = "client!kw", name = "b", descriptor = "(B)V")
    public final void method147(byte arg0) {
        field130++;
        int var2 = -1;
        if (arg0 != 0) {
            return;
        }
        int var3 = this.field133.length - 8;
        while (var3 > var2) {
            var2++;
            this.field133[var2] = 0;
            var2++;
            this.field133[var2] = 0;
            var2++;
            this.field133[var2] = 0;
            var2++;
            this.field133[var2] = 0;
            var2++;
            this.field133[var2] = 0;
            var2++;
            this.field133[var2] = 0;
            var2++;
            this.field133[var2] = 0;
            var2++;
            this.field133[var2] = 0;
        }
        while ((this.field133.length - 1) > var2) {
            var2++;
            this.field133[var2] = 0;
        }
    }

    @OriginalMember(owner = "client!kw", name = "b", descriptor = "(IIIIIII)V")
    public final void method148(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field128++;
        int var8 = 0;
        if (arg0 != arg1) {
            var8 = (arg6 - arg3 << 16) / (arg0 - arg1);
        }
        int var9 = 0;
        if (arg0 != arg5) {
            var9 = (arg2 - arg6 << 16) / (arg5 - arg0);
        }
        int var10 = arg4;
        if (arg1 != arg5) {
            var10 = (arg3 - arg2 << 16) / (arg1 - arg5);
        }
        if (arg0 >= arg1 && arg5 >= arg1) {
            if (arg0 >= arg5) {
                int var11;
                int var12 = var11 = arg3 << 16;
                int var13 = arg2 << 16;
                if (arg1 < 0) {
                    var11 -= arg1 * var8;
                    var12 -= arg1 * var10;
                    arg1 = 0;
                }
                if (arg5 < 0) {
                    var13 -= arg5 * var9;
                    arg5 = 0;
                }
                if ((arg1 == arg5 || var8 <= var10) && (arg1 != arg5 || var9 <= var8)) {
                    int var17 = arg0 - arg5;
                    int var18 = arg5 - arg1;
                    int var19 = this.field129 * arg1;
                    while (true) {
                        var18--;
                        if (var18 < 0) {
                            while (true) {
                                var17--;
                                if (var17 < 0) {
                                    return;
                                }
                                class451.method2655(var19, var13 >> 16, var11 >> 16, 0, this.field133, (byte) 68);
                                var19 += this.field129;
                                var13 += var9;
                                var11 += var8;
                            }
                        }
                        class451.method2655(var19, var12 >> 16, var11 >> 16, 0, this.field133, (byte) 68);
                        var19 += this.field129;
                        var11 += var8;
                        var12 += var10;
                    }
                } else {
                    int var14 = arg0 - arg5;
                    int var15 = arg5 - arg1;
                    int var16 = this.field129 * arg1;
                    while (true) {
                        var15--;
                        if (var15 < 0) {
                            while (true) {
                                var14--;
                                if (var14 < 0) {
                                    return;
                                }
                                class451.method2655(var16, var11 >> 16, var13 >> 16, 0, this.field133, (byte) 68);
                                var11 += var8;
                                var13 += var9;
                                var16 += this.field129;
                            }
                        }
                        class451.method2655(var16, var11 >> 16, var12 >> 16, 0, this.field133, (byte) 68);
                        var11 += var8;
                        var16 += this.field129;
                        var12 += var10;
                    }
                }
            } else {
                int var20;
                int var21 = var20 = arg3 << 16;
                if (arg1 < 0) {
                    var21 -= arg1 * var10;
                    var20 -= arg1 * var8;
                    arg1 = 0;
                }
                int var22 = arg6 << 16;
                if (arg0 < 0) {
                    var22 -= arg0 * var9;
                    arg0 = 0;
                }
                if (arg0 != arg1 && var8 > var10 || arg0 == arg1 && var10 > var9) {
                    int var23 = arg5 - arg0;
                    int var24 = arg0 - arg1;
                    int var25 = this.field129 * arg1;
                    while (true) {
                        var24--;
                        if (var24 < 0) {
                            while (true) {
                                var23--;
                                if (var23 < 0) {
                                    return;
                                }
                                class451.method2655(var25, var22 >> 16, var21 >> 16, 0, this.field133, (byte) 68);
                                var21 += var10;
                                var25 += this.field129;
                                var22 += var9;
                            }
                        }
                        class451.method2655(var25, var20 >> 16, var21 >> 16, 0, this.field133, (byte) 68);
                        var25 += this.field129;
                        var21 += var10;
                        var20 += var8;
                    }
                } else {
                    int var26 = arg5 - arg0;
                    int var27 = arg0 - arg1;
                    int var28 = this.field129 * arg1;
                    while (true) {
                        var27--;
                        if (var27 < 0) {
                            while (true) {
                                var26--;
                                if (var26 < 0) {
                                    return;
                                }
                                class451.method2655(var28, var21 >> 16, var22 >> 16, 0, this.field133, (byte) 68);
                                var21 += var10;
                                var22 += var9;
                                var28 += this.field129;
                            }
                        }
                        class451.method2655(var28, var21 >> 16, var20 >> 16, 0, this.field133, (byte) 68);
                        var20 += var8;
                        var21 += var10;
                        var28 += this.field129;
                    }
                }
            }
        } else if (arg0 > arg5) {
            if (arg1 >= arg0) {
                int var29;
                int var30 = var29 = arg2 << 16;
                if (arg5 < 0) {
                    var30 -= arg5 * var9;
                    var29 -= arg5 * var10;
                    arg5 = 0;
                }
                int var31 = arg6 << 16;
                if (arg0 < 0) {
                    var31 -= arg0 * var8;
                    arg0 = 0;
                }
                if (var10 > var9) {
                    int var32 = arg1 - arg0;
                    int var33 = arg0 - arg5;
                    int var34 = this.field129 * arg5;
                    while (true) {
                        var33--;
                        if (var33 < 0) {
                            while (true) {
                                var32--;
                                if (var32 < 0) {
                                    return;
                                }
                                class451.method2655(var34, var29 >> 16, var31 >> 16, 0, this.field133, (byte) 68);
                                var29 += var10;
                                var31 += var8;
                                var34 += this.field129;
                            }
                        }
                        class451.method2655(var34, var29 >> 16, var30 >> 16, 0, this.field133, (byte) 68);
                        var30 += var9;
                        var29 += var10;
                        var34 += this.field129;
                    }
                } else {
                    int var35 = arg1 - arg0;
                    int var36 = arg0 - arg5;
                    int var37 = this.field129 * arg5;
                    while (true) {
                        var36--;
                        if (var36 < 0) {
                            while (true) {
                                var35--;
                                if (var35 < 0) {
                                    return;
                                }
                                class451.method2655(var37, var31 >> 16, var29 >> 16, 0, this.field133, (byte) 68);
                                var29 += var10;
                                var37 += this.field129;
                                var31 += var8;
                            }
                        }
                        class451.method2655(var37, var30 >> 16, var29 >> 16, 0, this.field133, (byte) 68);
                        var30 += var9;
                        var37 += this.field129;
                        var29 += var10;
                    }
                }
            } else {
                int var38;
                int var39 = var38 = arg2 << 16;
                if (arg5 < 0) {
                    var38 -= arg5 * var10;
                    var39 -= arg5 * var9;
                    arg5 = 0;
                }
                int var40 = arg3 << 16;
                if (arg1 < 0) {
                    var40 -= arg1 * var8;
                    arg1 = 0;
                }
                if (var9 < var10) {
                    int var41 = arg0 - arg1;
                    int var42 = arg1 - arg5;
                    int var43 = this.field129 * arg5;
                    while (true) {
                        var42--;
                        if (var42 < 0) {
                            while (true) {
                                var41--;
                                if (var41 < 0) {
                                    return;
                                }
                                class451.method2655(var43, var40 >> 16, var39 >> 16, 0, this.field133, (byte) 68);
                                var40 += var8;
                                var39 += var9;
                                var43 += this.field129;
                            }
                        }
                        class451.method2655(var43, var38 >> 16, var39 >> 16, 0, this.field133, (byte) 68);
                        var39 += var9;
                        var38 += var10;
                        var43 += this.field129;
                    }
                } else {
                    int var44 = arg0 - arg1;
                    int var45 = arg1 - arg5;
                    int var46 = this.field129 * arg5;
                    while (true) {
                        var45--;
                        if (var45 < 0) {
                            while (true) {
                                var44--;
                                if (var44 < 0) {
                                    return;
                                }
                                class451.method2655(var46, var39 >> 16, var40 >> 16, 0, this.field133, (byte) 68);
                                var40 += var8;
                                var39 += var9;
                                var46 += this.field129;
                            }
                        }
                        class451.method2655(var46, var39 >> 16, var38 >> 16, 0, this.field133, (byte) 68);
                        var38 += var10;
                        var39 += var9;
                        var46 += this.field129;
                    }
                }
            }
        } else if (arg1 <= arg5) {
            int var47;
            int var48 = var47 = arg6 << 16;
            if (arg0 < 0) {
                var48 -= arg0 * var8;
                var47 -= arg0 * var9;
                arg0 = 0;
            }
            int var49 = arg3 << 16;
            if (arg1 < 0) {
                var49 -= arg1 * var10;
                arg1 = 0;
            }
            if (var9 <= var8) {
                int var50 = arg5 - arg1;
                int var51 = arg1 - arg0;
                int var52 = this.field129 * arg0;
                while (true) {
                    var51--;
                    if (var51 < 0) {
                        while (true) {
                            var50--;
                            if (var50 < 0) {
                                return;
                            }
                            class451.method2655(var52, var49 >> 16, var47 >> 16, 0, this.field133, (byte) 68);
                            var49 += var10;
                            var47 += var9;
                            var52 += this.field129;
                        }
                    }
                    class451.method2655(var52, var48 >> 16, var47 >> 16, 0, this.field133, (byte) 68);
                    var47 += var9;
                    var48 += var8;
                    var52 += this.field129;
                }
            } else {
                int var53 = arg5 - arg1;
                int var54 = arg1 - arg0;
                int var55 = this.field129 * arg0;
                while (true) {
                    var54--;
                    if (var54 < 0) {
                        while (true) {
                            var53--;
                            if (var53 < 0) {
                                return;
                            }
                            class451.method2655(var55, var47 >> 16, var49 >> 16, 0, this.field133, (byte) 68);
                            var49 += var10;
                            var55 += this.field129;
                            var47 += var9;
                        }
                    }
                    class451.method2655(var55, var47 >> 16, var48 >> 16, 0, this.field133, (byte) 68);
                    var48 += var8;
                    var47 += var9;
                    var55 += this.field129;
                }
            }
        } else {
            int var56;
            int var57 = var56 = arg6 << 16;
            if (arg0 < 0) {
                var56 -= arg0 * var9;
                var57 -= arg0 * var8;
                arg0 = 0;
            }
            int var58 = arg2 << 16;
            if (arg5 < 0) {
                var58 -= arg5 * var10;
                arg5 = 0;
            }
            if ((arg0 == arg5 || var8 >= var9) && (arg0 != arg5 || var8 <= var10)) {
                int var62 = arg1 - arg5;
                int var63 = arg5 - arg0;
                int var64 = this.field129 * arg0;
                while (true) {
                    var63--;
                    if (var63 < 0) {
                        while (true) {
                            var62--;
                            if (var62 < 0) {
                                return;
                            }
                            class451.method2655(var64, var57 >> 16, var58 >> 16, 0, this.field133, (byte) 68);
                            var64 += this.field129;
                            var58 += var10;
                            var57 += var8;
                        }
                    }
                    class451.method2655(var64, var57 >> 16, var56 >> 16, 0, this.field133, (byte) 68);
                    var56 += var9;
                    var64 += this.field129;
                    var57 += var8;
                }
            } else {
                int var59 = arg1 - arg5;
                int var60 = arg5 - arg0;
                int var61 = this.field129 * arg0;
                while (true) {
                    var60--;
                    if (var60 < 0) {
                        while (true) {
                            var59--;
                            if (var59 < 0) {
                                return;
                            }
                            class451.method2655(var61, var58 >> 16, var57 >> 16, 0, this.field133, (byte) 68);
                            var57 += var8;
                            var61 += this.field129;
                            var58 += var10;
                        }
                    }
                    class451.method2655(var61, var56 >> 16, var57 >> 16, 0, this.field133, (byte) 68);
                    var57 += var8;
                    var61 += this.field129;
                    var56 += var9;
                }
            }
        }
    }

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "(III)Z")
    public final boolean method149(int arg0, int arg1, int arg2) {
        if (arg0 != -13) {
            this.method147((byte) 42);
        }
        field134++;
        return (arg1 * arg2) <= this.field133.length;
    }

    @OriginalMember(owner = "client!kw", name = "<init>", descriptor = "(Llea;II)V")
    public class9(class573 arg0, int arg1, int arg2) {
        this.field133 = new byte[arg1 * arg2];
    }
}
