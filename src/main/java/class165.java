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

@OriginalClass("client!ku")
public class class165 extends class283 {

    @OriginalMember(owner = "client!ku", name = "j", descriptor = "Lhr;")
    public static class57 field2341 = new class57(0, 1);

    @OriginalMember(owner = "client!ku", name = "u", descriptor = "Lmp;")
    public static class315 field2352 = new class315("game3", 2);

    @OriginalMember(owner = "client!ku", name = "v", descriptor = "I")
    public static int field2353 = -1;

    @OriginalMember(owner = "client!ku", name = "i", descriptor = "I")
    public static int field2340;

    @OriginalMember(owner = "client!ku", name = "k", descriptor = "I")
    public static int field2342;

    @OriginalMember(owner = "client!ku", name = "l", descriptor = "I")
    public static int field2343;

    @OriginalMember(owner = "client!ku", name = "m", descriptor = "I")
    public static int field2344;

    @OriginalMember(owner = "client!ku", name = "n", descriptor = "I")
    public static int field2345;

    @OriginalMember(owner = "client!ku", name = "o", descriptor = "I")
    public static int field2346;

    @OriginalMember(owner = "client!ku", name = "p", descriptor = "I")
    public static int field2347;

    @OriginalMember(owner = "client!ku", name = "q", descriptor = "I")
    public static int field2348;

    @OriginalMember(owner = "client!ku", name = "r", descriptor = "I")
    public static int field2349;

    @OriginalMember(owner = "client!ku", name = "s", descriptor = "I")
    public static int field2350;

    @OriginalMember(owner = "client!ku", name = "t", descriptor = "I")
    public static int field2351;

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "(ZI)V")
    public final void method73(boolean arg0, int arg1) {
        ++field2348;
        if (arg1 != 2) {
            this.method77(2);
        }
    }

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "(Ljc;B)V")
    public static final void method1181(class168 arg0, byte arg1) {
        ++field2343;
        class408 var2 = (class408) class231.field3473.method3565(127);
        if (var2 != null) {
            boolean var3 = false;
            for (int var4 = 0; ~var4 > ~var2.field5808; ++var4) {
                if (var2.field5816[var4] != null) {
                    if (~var2.field5816[var4].field6198 == -3) {
                        var2.field5811[var4] = -5;
                    }
                    if (var2.field5816[var4].field6198 == 0) {
                        var3 = true;
                    }
                }
                if (var2.field5810[var4] != null) {
                    if (var2.field5810[var4].field6198 == 2) {
                        var2.field5811[var4] = -6;
                    }
                    if (var2.field5810[var4].field6198 == 0) {
                        var3 = true;
                    }
                }
            }
            if (!var3) {
                int var5 = arg0.field6864;
                arg0.method2926((byte) -116, var2.field5815);
                if (arg1 > 99) {
                    for (int var6 = 0; ~var6 > ~var2.field5808; ++var6) {
                        if (~var2.field5811[var6] != -1) {
                            arg0.method2881(var2.field5811[var6], (byte) 120);
                        } else {
                            try {
                                int var7 = var2.field5809[var6];
                                if (var7 == 0) {
                                    Field var8 = (Field) var2.field5816[var6].field6200;
                                    int var9 = var8.getInt((Object) null);
                                    arg0.method2881(0, (byte) 118);
                                    arg0.method2926((byte) -122, var9);
                                } else if (~var7 == -2) {
                                    Field var10 = (Field) var2.field5816[var6].field6200;
                                    var10.setInt((Object) null, var2.field5804[var6]);
                                    arg0.method2881(0, (byte) 114);
                                } else if (var7 == 2) {
                                    Field var11 = (Field) var2.field5816[var6].field6200;
                                    int var12 = var11.getModifiers();
                                    arg0.method2881(0, (byte) 117);
                                    arg0.method2926((byte) -124, var12);
                                }
                                if (var7 != 3) {
                                    if (~var7 == -5) {
                                        Method var19 = (Method) var2.field5810[var6].field6200;
                                        int var20 = var19.getModifiers();
                                        arg0.method2881(0, (byte) 122);
                                        arg0.method2926((byte) -125, var20);
                                    }
                                } else {
                                    Method var13 = (Method) var2.field5810[var6].field6200;
                                    byte[][] var14 = var2.field5814[var6];
                                    Object[] var15 = new Object[var14.length];
                                    for (int var16 = 0; ~var14.length < ~var16; ++var16) {
                                        ObjectInputStream var17 = new ObjectInputStream(new ByteArrayInputStream(var14[var16]));
                                        var15[var16] = var17.readObject();
                                    }
                                    Object var18 = var13.invoke((Object) null, var15);
                                    if (var18 != null) {
                                        if (!(var18 instanceof Number)) {
                                            if (var18 instanceof String) {
                                                arg0.method2881(2, (byte) 122);
                                                arg0.method2902((String) var18, false);
                                            } else {
                                                arg0.method2881(4, (byte) 125);
                                            }
                                        } else {
                                            arg0.method2881(1, (byte) 122);
                                            arg0.method2912((byte) 110, ((Number) var18).longValue());
                                        }
                                    } else {
                                        arg0.method2881(0, (byte) 127);
                                    }
                                }
                            } catch (ClassNotFoundException var21) {
                                arg0.method2881(-10, (byte) 112);
                            } catch (InvalidClassException var22) {
                                arg0.method2881(-11, (byte) 126);
                            } catch (StreamCorruptedException var23) {
                                arg0.method2881(-12, (byte) 126);
                            } catch (OptionalDataException var24) {
                                arg0.method2881(-13, (byte) 117);
                            } catch (IllegalAccessException var25) {
                                arg0.method2881(-14, (byte) 114);
                            } catch (IllegalArgumentException var26) {
                                arg0.method2881(-15, (byte) 116);
                            } catch (InvocationTargetException var27) {
                                arg0.method2881(-16, (byte) 115);
                            } catch (SecurityException var28) {
                                arg0.method2881(-17, (byte) 111);
                            } catch (IOException var29) {
                                arg0.method2881(-18, (byte) 119);
                            } catch (NullPointerException var30) {
                                arg0.method2881(-19, (byte) 123);
                            } catch (Exception var31) {
                                arg0.method2881(-20, (byte) 122);
                            } catch (Throwable var32) {
                                arg0.method2881(-21, (byte) 116);
                            }
                        }
                    }
                    arg0.method2919(32767, var5);
                    var2.method2656((byte) 126);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ku", name = "b", descriptor = "(B)V")
    public static void method1182(byte arg0) {
        field2352 = null;
        if (arg0 > -14) {
            method1184(115, 50, -104);
        }
        field2341 = null;
    }

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "(I)Z")
    public final boolean method77(int arg0) {
        ++field2344;
        if (arg0 <= 96) {
            method1183((String) null, 77);
        }
        return true;
    }

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
    public static final String method1183(String arg0, int arg1) {
        ++field2345;
        int var2 = arg0.length();
        int var3 = 0;
        for (int var4 = 0; var2 > var4; ++var4) {
            char var8 = arg0.charAt(var4);
            if (var8 == '<' || ~var8 == -63) {
                var3 += 3;
            }
        }
        StringBuffer var5 = new StringBuffer(var2 + var3);
        for (int var6 = 0; var2 > var6; ++var6) {
            char var7 = arg0.charAt(var6);
            if (~var7 != -61) {
                if (~var7 != -63) {
                    var5.append(var7);
                } else {
                    var5.append("<gt>");
                }
            } else {
                var5.append("<lt>");
            }
        }
        if (arg1 != -13970) {
            method1181((class168) null, (byte) -7);
        }
        return var5.toString();
    }

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "(Lou;II)V")
    public final void method75(class158 arg0, int arg1, int arg2) {
        if (arg1 != 2) {
            field2341 = null;
        }
        ++field2350;
        super.field3958.method2164(6, arg0);
        super.field3958.method2120(arg2, arg1 ^ 9);
    }

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "(B)V")
    public final void method74(byte arg0) {
        ++field2346;
        super.field3958.method2127(11, false);
        if (arg0 != 85) {
            this.method77(50);
        }
    }

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "(III)I")
    public static final int method1184(int arg0, int arg1, int arg2) {
        ++field2340;
        int var3 = arg1;
        while (arg0 > 0) {
            var3 = arg2 & 1 | var3 << 1;
            arg2 >>>= 1;
            --arg0;
        }
        return var3;
    }

    @OriginalMember(owner = "client!ku", name = "<init>", descriptor = "(Lkw;)V")
    public class165(class346 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!ku", name = "b", descriptor = "(IZ)V")
    public final void method76(int arg0, boolean arg1) {
        if (arg0 != -938) {
            field2341 = null;
        }
        ++field2349;
        super.field3958.method2127(arg0 + 949, true);
    }

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "(ZII)V")
    public final void method79(boolean arg0, int arg1, int arg2) {
        if (!arg0) {
            field2341 = null;
        }
        ++field2347;
    }
}
