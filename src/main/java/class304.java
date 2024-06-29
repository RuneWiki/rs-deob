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

@OriginalClass("client!ao")
public class class304 {

    @OriginalMember(owner = "client!ao", name = "b", descriptor = "I")
    public int field4168 = 8;

    @OriginalMember(owner = "client!ao", name = "i", descriptor = "I")
    public int field4175 = 16777215;

    @OriginalMember(owner = "client!ao", name = "l", descriptor = "J")
    public static long field4178 = -1L;

    @OriginalMember(owner = "client!ao", name = "n", descriptor = "S")
    public static short field4180 = 32767;

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "I")
    public static int field4167;

    @OriginalMember(owner = "client!ao", name = "d", descriptor = "I")
    public int field4170;

    @OriginalMember(owner = "client!ao", name = "e", descriptor = "I")
    public int field4171;

    @OriginalMember(owner = "client!ao", name = "g", descriptor = "I")
    public int field4173;

    @OriginalMember(owner = "client!ao", name = "h", descriptor = "I")
    public int field4174;

    @OriginalMember(owner = "client!ao", name = "j", descriptor = "I")
    public static int field4176;

    @OriginalMember(owner = "client!ao", name = "k", descriptor = "I")
    public int field4177;

    @OriginalMember(owner = "client!ao", name = "m", descriptor = "I")
    public static int field4179;

    @OriginalMember(owner = "client!ao", name = "c", descriptor = "Lct;")
    public static class157 field4169;

    @OriginalMember(owner = "client!ao", name = "f", descriptor = "Z")
    public boolean field4172;

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(Lfca;I)V", line = 7)
    public final void method1942(class93 arg0, int arg1) {
        field4167++;
        while (true) {
            int var3 = arg0.method793((byte) 113);
            if (var3 == 0) {
                if (arg1 == -25044) {
                    return;
                } else {
                    this.field4175 = 102;
                    return;
                }
            }
            this.method1945(var3, -30359, arg0);
        }
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(Z)V", line = 29)
    public static void method1943(boolean arg0) {
        if (arg0) {
            method1944(null, 120);
        }
        field4169 = null;
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(Lkka;I)V", line = 59)
    public static final void method1944(class329 arg0, int arg1) {
        field4176++;
        class410 var2 = (class410) class153.field2516.method3589((byte) -127);
        if (var2 == null) {
            return;
        }
        boolean var3 = false;
        for (int var4 = 0; var4 < var2.field5610; var4++) {
            if (var2.field5603[var4] != null) {
                if (var2.field5603[var4].field7412 == 2) {
                    var2.field5602[var4] = -5;
                }
                if (var2.field5603[var4].field7412 == 0) {
                    var3 = true;
                }
            }
            if (var2.field5612[var4] != null) {
                if (var2.field5612[var4].field7412 == 2) {
                    var2.field5602[var4] = -6;
                }
                if (var2.field5612[var4].field7412 == 0) {
                    var3 = true;
                }
            }
        }
        if (var3) {
            return;
        }
        int var5 = -9 / ((-arg1 - 24) / 48);
        int var6 = arg0.field1442;
        arg0.method759(var2.field5607, 124);
        for (int var7 = 0; var7 < var2.field5610; var7++) {
            if (var2.field5602[var7] == 0) {
                try {
                    int var8 = var2.field5608[var7];
                    if (var8 == 0) {
                        Field var12 = (Field) var2.field5603[var7].field7416;
                        int var13 = var12.getInt(null);
                        arg0.method754(0, 39);
                        arg0.method759(var13, 127);
                    } else if (var8 == 1) {
                        Field var9 = (Field) var2.field5603[var7].field7416;
                        var9.setInt(null, var2.field5604[var7]);
                        arg0.method754(0, 72);
                    } else if (var8 == 2) {
                        Field var10 = (Field) var2.field5603[var7].field7416;
                        int var11 = var10.getModifiers();
                        arg0.method754(0, 75);
                        arg0.method759(var11, -37);
                    }
                    if (var8 == 3) {
                        Method var14 = (Method) var2.field5612[var7].field7416;
                        byte[][] var15 = var2.field5606[var7];
                        Object[] var16 = new Object[var15.length];
                        for (int var17 = 0; var17 < var15.length; var17++) {
                            ObjectInputStream var18 = new ObjectInputStream(new ByteArrayInputStream(var15[var17]));
                            var16[var17] = var18.readObject();
                        }
                        Object var19 = var14.invoke(null, var16);
                        if (var19 == null) {
                            arg0.method754(0, 121);
                        } else if ((var19 instanceof Number)) {
                            arg0.method754(1, 52);
                            arg0.method794(-2, ((Number) var19).longValue());
                        } else if ((var19 instanceof String)) {
                            arg0.method754(2, 46);
                            arg0.method783((byte) -101, (String) var19);
                        } else {
                            arg0.method754(4, 72);
                        }
                    } else if (var8 == 4) {
                        Method var20 = (Method) var2.field5612[var7].field7416;
                        int var21 = var20.getModifiers();
                        arg0.method754(0, 79);
                        arg0.method759(var21, 125);
                    }
                } catch (ClassNotFoundException var22) {
                    arg0.method754(-10, 70);
                } catch (InvalidClassException var23) {
                    arg0.method754(-11, 30);
                } catch (StreamCorruptedException var24) {
                    arg0.method754(-12, 105);
                } catch (OptionalDataException var25) {
                    arg0.method754(-13, 58);
                } catch (IllegalAccessException var26) {
                    arg0.method754(-14, 49);
                } catch (IllegalArgumentException var27) {
                    arg0.method754(-15, 32);
                } catch (InvocationTargetException var28) {
                    arg0.method754(-16, 20);
                } catch (SecurityException var29) {
                    arg0.method754(-17, 115);
                } catch (IOException var30) {
                    arg0.method754(-18, 27);
                } catch (NullPointerException var31) {
                    arg0.method754(-19, 41);
                } catch (Exception var32) {
                    arg0.method754(-20, 94);
                } catch (Throwable var33) {
                    arg0.method754(-21, 99);
                }
            } else {
                arg0.method754(var2.field5602[var7], 64);
            }
        }
        arg0.method799(var6, true);
        var2.method1207(107);
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(IILfca;)V", line = 250)
    private final void method1945(int arg0, int arg1, class93 arg2) {
        if (arg0 == 1) {
            this.field4168 = arg2.method763(arg1 ^ 0xFFFF893D);
        } else if (arg0 == 2) {
            this.field4172 = true;
        } else if (arg0 == 3) {
            this.field4171 = arg2.method774(-4);
            this.field4174 = arg2.method774(-4);
            this.field4170 = arg2.method774(-4);
        } else if (arg0 == 4) {
            this.field4177 = arg2.method793((byte) 47);
        } else if (arg0 == 5) {
            this.field4173 = arg2.method763(92);
        } else if (arg0 == 6) {
            this.field4175 = arg2.method767((byte) -119);
        }
        field4179++;
        if (arg1 != -30359) {
            this.method1945(118, 47, null);
        }
    }
}
