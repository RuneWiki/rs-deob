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

@OriginalClass("client!ac")
public class class214 {

    @OriginalMember(owner = "client!ac", name = "c", descriptor = "Lvq;")
    private class22 field3157;

    @OriginalMember(owner = "client!ac", name = "j", descriptor = "Ljava/lang/String;")
    public static String field3164 = "Connecting to update server";

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "I")
    public static int field3155;

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "I")
    public static int field3156;

    @OriginalMember(owner = "client!ac", name = "d", descriptor = "I")
    public static int field3158;

    @OriginalMember(owner = "client!ac", name = "e", descriptor = "I")
    public static int field3159;

    @OriginalMember(owner = "client!ac", name = "f", descriptor = "I")
    public static int field3160;

    @OriginalMember(owner = "client!ac", name = "g", descriptor = "I")
    public static int field3161;

    @OriginalMember(owner = "client!ac", name = "i", descriptor = "I")
    public static int field3163;

    @OriginalMember(owner = "client!ac", name = "k", descriptor = "Lak;")
    public static class219 field3165;

    @OriginalMember(owner = "client!ac", name = "h", descriptor = "Lon;")
    private class35 field3162;

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(I)V", line = 9)
    public static final void method1624(int arg0) {
        field3156++;
        if (class73.field1235.method670()) {
            class122.method1027(false);
            class73.field1235.method725(class33.field475);
            class126.method1061(false);
        } else {
            class322.method2145(class288.field4303, false);
        }
        if (arg0 != 31269) {
            field3165 = null;
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(BLjava/lang/String;)V", line = 29)
    public static final void method1625(byte arg0, String arg1) {
        field3163++;
        if (arg0 == -97 && class377.field5352 != null) {
            class13.field216.method2781(false, 84);
            class151.field2306++;
            class13.field216.method267(class429.method2677(arg1, arg0 ^ 0xFFFFFF9E), false);
            class13.field216.method265((byte) -48, arg1);
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(BLvq;)V", line = 50)
    public final void method1626(byte arg0, class22 arg1) {
        int var3 = -114 % ((59 - arg0) / 55);
        this.field3157 = arg1;
        field3158++;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(Ldp;B)V", line = 63)
    public static final void method1627(class174 arg0, byte arg1) {
        if (arg1 >= -107) {
            field3164 = null;
        }
        class280.field4199 = arg0;
        field3159++;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(IILjh;)V", line = 76)
    public static final void method1628(int arg0, int arg1, class444 arg2) {
        field3160++;
        if (arg1 != -4) {
            return;
        }
        while (true) {
            class388 var3 = (class388) class334.field4787.method157((byte) -125);
            if (var3 == null) {
                return;
            }
            boolean var4 = false;
            for (int var5 = 0; var5 < var3.field5567; var5++) {
                if (var3.field5555[var5] != null) {
                    if (var3.field5555[var5].field2121 == 2) {
                        var3.field5560[var5] = -5;
                    }
                    if (var3.field5555[var5].field2121 == 0) {
                        var4 = true;
                    }
                }
                if (var3.field5562[var5] != null) {
                    if (var3.field5562[var5].field2121 == 2) {
                        var3.field5560[var5] = -6;
                    }
                    if (var3.field5562[var5].field2121 == 0) {
                        var4 = true;
                    }
                }
            }
            if (var4) {
                return;
            }
            arg2.method2781(false, arg0);
            arg2.method267(0, false);
            int var6 = arg2.field565;
            arg2.method275(var3.field5558, 1414495172);
            for (int var7 = 0; var7 < var3.field5567; var7++) {
                if (var3.field5560[var7] == 0) {
                    try {
                        int var8 = var3.field5561[var7];
                        if (var8 == 0) {
                            Field var12 = (Field) var3.field5555[var7].field2125;
                            int var13 = var12.getInt((Object) null);
                            arg2.method267(0, false);
                            arg2.method275(var13, 1414495172);
                        } else if (var8 == 1) {
                            Field var9 = (Field) var3.field5555[var7].field2125;
                            var9.setInt((Object) null, var3.field5556[var7]);
                            arg2.method267(0, false);
                        } else if (var8 == 2) {
                            Field var10 = (Field) var3.field5555[var7].field2125;
                            int var11 = var10.getModifiers();
                            arg2.method267(0, false);
                            arg2.method275(var11, 1414495172);
                        }
                        if (var8 == 3) {
                            Method var16 = (Method) var3.field5562[var7].field2125;
                            byte[][] var17 = var3.field5564[var7];
                            Object[] var18 = new Object[var17.length];
                            for (int var19 = 0; var19 < var17.length; var19++) {
                                ObjectInputStream var20 = new ObjectInputStream(new ByteArrayInputStream(var17[var19]));
                                var18[var19] = var20.readObject();
                            }
                            Object var21 = var16.invoke((Object) null, var18);
                            if (var21 == null) {
                                arg2.method267(0, false);
                            } else if ((var21 instanceof Number)) {
                                arg2.method267(1, false);
                                arg2.method269(110, ((Number) var21).longValue());
                            } else if (var21 instanceof String) {
                                arg2.method267(2, false);
                                arg2.method265((byte) -101, (String) var21);
                            } else {
                                arg2.method267(4, false);
                            }
                        } else if (var8 == 4) {
                            Method var14 = (Method) var3.field5562[var7].field2125;
                            int var15 = var14.getModifiers();
                            arg2.method267(0, false);
                            arg2.method275(var15, 1414495172);
                        }
                    } catch (ClassNotFoundException var22) {
                        arg2.method267(-10, false);
                    } catch (InvalidClassException var23) {
                        arg2.method267(-11, false);
                    } catch (StreamCorruptedException var24) {
                        arg2.method267(-12, false);
                    } catch (OptionalDataException var25) {
                        arg2.method267(-13, false);
                    } catch (IllegalAccessException var26) {
                        arg2.method267(-14, false);
                    } catch (IllegalArgumentException var27) {
                        arg2.method267(-15, false);
                    } catch (InvocationTargetException var28) {
                        arg2.method267(-16, false);
                    } catch (SecurityException var29) {
                        arg2.method267(-17, false);
                    } catch (IOException var30) {
                        arg2.method267(-18, false);
                    } catch (NullPointerException var31) {
                        arg2.method267(-19, false);
                    } catch (Exception var32) {
                        arg2.method267(-20, false);
                    } catch (Throwable var33) {
                        arg2.method267(-21, false);
                    }
                } else {
                    arg2.method267(var3.field5560[var7], false);
                }
            }
            arg2.method272(var6, -11329);
            arg2.method287(arg2.field565 - var6, -98);
            var3.method251(68);
        }
    }

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "(I)Lon;", line = 271)
    public final class35 method1629(int arg0) {
        field3161++;
        if (arg0 != -1) {
            return null;
        }
        class35 var2 = this.field3162;
        if (this.field3157.field322 == var2) {
            this.field3162 = null;
            return null;
        } else {
            this.field3162 = var2.field498;
            return var2;
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(B)V", line = 292)
    public static void method1630(byte arg0) {
        field3165 = null;
        if (arg0 != 22) {
            method1624(-22);
        }
        field3164 = null;
    }

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "(B)Lon;", line = 303)
    public final class35 method1631(byte arg0) {
        field3155++;
        class35 var2 = this.field3157.field322.field498;
        if (this.field3157.field322 == var2) {
            this.field3162 = null;
            return null;
        } else {
            int var3 = 58 / ((13 - arg0) / 55);
            this.field3162 = var2.field498;
            return var2;
        }
    }

    @OriginalMember(owner = "client!ac", name = "<init>", descriptor = "()V", line = 329)
    public class214() {
    }

    @OriginalMember(owner = "client!ac", name = "<init>", descriptor = "(Lvq;)V", line = 334)
    public class214(class22 arg0) {
        this.field3157 = arg0;
    }
}
