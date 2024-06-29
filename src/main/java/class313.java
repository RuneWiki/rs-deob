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

@OriginalClass("client!hg")
public abstract class class313 {

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "I")
    public static int field4566;

    @OriginalMember(owner = "client!hg", name = "b", descriptor = "I")
    public static int field4567;

    @OriginalMember(owner = "client!hg", name = "c", descriptor = "Lg;")
    public static class470 field4568;

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(IIBI)I", line = 4)
    public static final int method1936(int arg0, int arg1, byte arg2, int arg3) {
        int var4 = arg0 & 0x3;
        field4566++;
        if (var4 == 0) {
            return arg3;
        }
        if (arg2 != -71) {
            method1937(-72);
        }
        if (var4 == 1) {
            return arg1;
        } else if (var4 == 2) {
            return 7 - arg3;
        } else {
            return 7 - arg1;
        }
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(I)V", line = 27)
    public static void method1937(int arg0) {
        int var1 = -98 % ((arg0 - 21) / 37);
        field4568 = null;
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(Lve;II)V", line = 37)
    public static final void method1938(class331 arg0, int arg1, int arg2) {
        if (arg1 != -6432) {
            return;
        }
        field4567++;
        while (true) {
            class82 var3 = (class82) class180.field2228.method802((byte) 99);
            if (var3 == null) {
                return;
            }
            boolean var4 = false;
            for (int var5 = 0; var5 < var3.field984; var5++) {
                if (var3.field983[var5] != null) {
                    if (var3.field983[var5].field5759 == 2) {
                        var3.field978[var5] = -5;
                    }
                    if (var3.field983[var5].field5759 == 0) {
                        var4 = true;
                    }
                }
                if (var3.field976[var5] != null) {
                    if (var3.field976[var5].field5759 == 2) {
                        var3.field978[var5] = -6;
                    }
                    if (var3.field976[var5].field5759 == 0) {
                        var4 = true;
                    }
                }
            }
            if (var4) {
                return;
            }
            arg0.method2008(arg2, (byte) -2);
            arg0.method909(0, -1);
            int var6 = arg0.field2206;
            arg0.method897(var3.field981, -127);
            for (int var7 = 0; var7 < var3.field984; var7++) {
                if (var3.field978[var7] == 0) {
                    try {
                        int var8 = var3.field979[var7];
                        if (var8 == 0) {
                            Field var9 = (Field) var3.field983[var7].field5755;
                            int var10 = var9.getInt((Object) null);
                            arg0.method909(0, -1);
                            arg0.method897(var10, -105);
                        } else if (var8 == 1) {
                            Field var11 = (Field) var3.field983[var7].field5755;
                            var11.setInt((Object) null, var3.field977[var7]);
                            arg0.method909(0, -1);
                        } else if (var8 == 2) {
                            Field var12 = (Field) var3.field983[var7].field5755;
                            int var13 = var12.getModifiers();
                            arg0.method909(0, -1);
                            arg0.method897(var13, arg1 + 6319);
                        }
                        if (var8 == 3) {
                            Method var16 = (Method) var3.field976[var7].field5755;
                            byte[][] var17 = var3.field985[var7];
                            Object[] var18 = new Object[var17.length];
                            for (int var19 = 0; var19 < var17.length; var19++) {
                                ObjectInputStream var20 = new ObjectInputStream(new ByteArrayInputStream(var17[var19]));
                                var18[var19] = var20.readObject();
                            }
                            Object var21 = var16.invoke((Object) null, var18);
                            if (var21 == null) {
                                arg0.method909(0, -1);
                            } else if ((var21 instanceof Number)) {
                                arg0.method909(1, -1);
                                arg0.method929((byte) -104, ((Number) var21).longValue());
                            } else if (var21 instanceof String) {
                                arg0.method909(2, -1);
                                arg0.method935((String) var21, -123);
                            } else {
                                arg0.method909(4, -1);
                            }
                        } else if (var8 == 4) {
                            Method var14 = (Method) var3.field976[var7].field5755;
                            int var15 = var14.getModifiers();
                            arg0.method909(0, -1);
                            arg0.method897(var15, -112);
                        }
                    } catch (ClassNotFoundException var22) {
                        arg0.method909(-10, -1);
                    } catch (InvalidClassException var23) {
                        arg0.method909(-11, -1);
                    } catch (StreamCorruptedException var24) {
                        arg0.method909(-12, -1);
                    } catch (OptionalDataException var25) {
                        arg0.method909(-13, -1);
                    } catch (IllegalAccessException var26) {
                        arg0.method909(-14, arg1 + 6431);
                    } catch (IllegalArgumentException var27) {
                        arg0.method909(-15, arg1 ^ 0x191F);
                    } catch (InvocationTargetException var28) {
                        arg0.method909(-16, arg1 ^ 0x191F);
                    } catch (SecurityException var29) {
                        arg0.method909(-17, arg1 + 6431);
                    } catch (IOException var30) {
                        arg0.method909(-18, -1);
                    } catch (NullPointerException var31) {
                        arg0.method909(-19, -1);
                    } catch (Exception var32) {
                        arg0.method909(-20, -1);
                    } catch (Throwable var33) {
                        arg0.method909(-21, -1);
                    }
                } else {
                    arg0.method909(var3.field978[var7], -1);
                }
            }
            arg0.method911(var6, (byte) 125);
            arg0.method890(arg0.field2206 - var6, arg1 ^ 0x1924);
            var3.method702((byte) -114);
        }
    }
}
