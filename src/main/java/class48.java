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

@OriginalClass("client!qr")
public class class48 {

    @OriginalMember(owner = "client!qr", name = "c", descriptor = "Lwm;")
    private class399 field982 = new class399(64);

    @OriginalMember(owner = "client!qr", name = "e", descriptor = "Lph;")
    private class459 field984;

    @OriginalMember(owner = "client!qr", name = "h", descriptor = "Z")
    public static boolean field987;

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "I")
    public static int field980;

    @OriginalMember(owner = "client!qr", name = "b", descriptor = "I")
    public static int field981;

    @OriginalMember(owner = "client!qr", name = "d", descriptor = "I")
    public static int field983;

    @OriginalMember(owner = "client!qr", name = "f", descriptor = "I")
    public static int field985;

    @OriginalMember(owner = "client!qr", name = "g", descriptor = "I")
    public static int field986;

    @OriginalMember(owner = "client!qr", name = "i", descriptor = "I")
    public static int field988;

    @OriginalMember(owner = "client!qr", name = "j", descriptor = "[Z")
    public static boolean[] field989;

    static {
        new class309("Adventurer", "Abenteurer", "Aventurier", "Aventureiro");
        field987 = false;
    }

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(II)Lll;", line = 3)
    public final class247 method460(int arg0, int arg1) {
        if (arg1 != -18297) {
            this.method460(-81, -60);
        }
        field983++;
        class399 var3 = this.field982;
        class247 var4;
        synchronized (this.field982) {
            var4 = (class247) this.field982.method2478(1, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        class459 var5 = this.field984;
        byte[] var6;
        synchronized (this.field984) {
            var6 = this.field984.method2757(11, arg0, (byte) -122);
        }
        class247 var7 = new class247();
        if (var6 != null) {
            var7.method1601(new class289(var6), 2);
        }
        class399 var8 = this.field982;
        synchronized (this.field982) {
            this.field982.method2472(arg1 ^ 0x4703, var7, (long) arg0);
            return var7;
        }
    }

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(I)V", line = 37)
    public final void method461(int arg0) {
        class399 var2 = this.field982;
        synchronized (this.field982) {
            if (arg0 < 24) {
                this.method462(68, -6);
            }
            this.field982.method2477(104);
        }
        field986++;
    }

    @OriginalMember(owner = "client!qr", name = "b", descriptor = "(II)V", line = 56)
    public final void method462(int arg0, int arg1) {
        class399 var3 = this.field982;
        synchronized (this.field982) {
            if (arg1 != 11) {
                method463(false, false);
            }
            this.field982.method2471((byte) 98, arg0);
        }
        field988++;
    }

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(ZZ)V", line = 72)
    public static final void method463(boolean arg0, boolean arg1) {
        field985++;
        if (!arg1) {
            method465(-109);
        }
        for (class358 var2 = (class358) class378.field5531.method1892(86); var2 != null; var2 = (class358) class378.field5531.method1893((byte) -2)) {
            if (var2.field5248 != null) {
                class288.field4357.method2157(var2.field5248);
                var2.field5248 = null;
            }
            if (var2.field5266 != null) {
                class288.field4357.method2157(var2.field5266);
                var2.field5266 = null;
            }
            var2.method1676(arg1);
        }
        if (!arg0) {
            return;
        }
        for (class358 var3 = (class358) class492.field7212.method1892(111); var3 != null; var3 = (class358) class492.field7212.method1893((byte) -2)) {
            if (var3.field5248 != null) {
                class288.field4357.method2157(var3.field5248);
                var3.field5248 = null;
            }
            var3.method1676(true);
        }
        for (class358 var4 = (class358) class407.field6167.method1615(0); var4 != null; var4 = (class358) class407.field6167.method1621((byte) 111)) {
            if (var4.field5248 != null) {
                class288.field4357.method2157(var4.field5248);
                var4.field5248 = null;
            }
            var4.method1676(true);
        }
    }

    @OriginalMember(owner = "client!qr", name = "b", descriptor = "(I)V", line = 141)
    public final void method464(int arg0) {
        field981++;
        if (arg0 != 1) {
            this.method460(69, -103);
        }
        class399 var2 = this.field982;
        synchronized (this.field982) {
            this.field982.method2475((byte) 67);
        }
    }

    @OriginalMember(owner = "client!qr", name = "c", descriptor = "(I)V", line = 160)
    public static void method465(int arg0) {
        field989 = null;
        if (arg0 != 0) {
            field989 = null;
        }
    }

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(ILha;I)V", line = 173)
    public static final void method466(int arg0, class43 arg1, int arg2) {
        if (arg0 > -56) {
            method463(true, true);
        }
        field980++;
        while (true) {
            class270 var3 = (class270) class467.field6936.method1892(95);
            if (var3 == null) {
                return;
            }
            boolean var4 = false;
            for (int var5 = 0; var5 < var3.field4089; var5++) {
                if (var3.field4097[var5] != null) {
                    if (var3.field4097[var5].field2119 == 2) {
                        var3.field4101[var5] = -5;
                    }
                    if (var3.field4097[var5].field2119 == 0) {
                        var4 = true;
                    }
                }
                if (var3.field4099[var5] != null) {
                    if (var3.field4099[var5].field2119 == 2) {
                        var3.field4101[var5] = -6;
                    }
                    if (var3.field4099[var5].field2119 == 0) {
                        var4 = true;
                    }
                }
            }
            if (var4) {
                return;
            }
            arg1.method266((byte) -74, arg2);
            arg1.method1814(0, true);
            int var6 = arg1.field4399;
            arg1.method1862((byte) -115, var3.field4098);
            for (int var7 = 0; var7 < var3.field4089; var7++) {
                if (var3.field4101[var7] == 0) {
                    try {
                        int var8 = var3.field4091[var7];
                        if (var8 == 0) {
                            Field var9 = (Field) var3.field4097[var7].field2115;
                            int var10 = var9.getInt(null);
                            arg1.method1814(0, true);
                            arg1.method1862((byte) -115, var10);
                        } else if (var8 == 1) {
                            Field var13 = (Field) var3.field4097[var7].field2115;
                            var13.setInt(null, var3.field4102[var7]);
                            arg1.method1814(0, true);
                        } else if (var8 == 2) {
                            Field var11 = (Field) var3.field4097[var7].field2115;
                            int var12 = var11.getModifiers();
                            arg1.method1814(0, true);
                            arg1.method1862((byte) -115, var12);
                        }
                        if (var8 == 3) {
                            Method var16 = (Method) var3.field4099[var7].field2115;
                            byte[][] var17 = var3.field4093[var7];
                            Object[] var18 = new Object[var17.length];
                            for (int var19 = 0; var19 < var17.length; var19++) {
                                ObjectInputStream var20 = new ObjectInputStream(new ByteArrayInputStream(var17[var19]));
                                var18[var19] = var20.readObject();
                            }
                            Object var21 = var16.invoke(null, var18);
                            if (var21 == null) {
                                arg1.method1814(0, true);
                            } else if ((var21 instanceof Number)) {
                                arg1.method1814(1, true);
                                arg1.method1826(((Number) var21).longValue(), 252);
                            } else if (var21 instanceof String) {
                                arg1.method1814(2, true);
                                arg1.method1821((String) var21, 124);
                            } else {
                                arg1.method1814(4, true);
                            }
                        } else if (var8 == 4) {
                            Method var14 = (Method) var3.field4099[var7].field2115;
                            int var15 = var14.getModifiers();
                            arg1.method1814(0, true);
                            arg1.method1862((byte) -115, var15);
                        }
                    } catch (ClassNotFoundException var22) {
                        arg1.method1814(-10, true);
                    } catch (InvalidClassException var23) {
                        arg1.method1814(-11, true);
                    } catch (StreamCorruptedException var24) {
                        arg1.method1814(-12, true);
                    } catch (OptionalDataException var25) {
                        arg1.method1814(-13, true);
                    } catch (IllegalAccessException var26) {
                        arg1.method1814(-14, true);
                    } catch (IllegalArgumentException var27) {
                        arg1.method1814(-15, true);
                    } catch (InvocationTargetException var28) {
                        arg1.method1814(-16, true);
                    } catch (SecurityException var29) {
                        arg1.method1814(-17, true);
                    } catch (IOException var30) {
                        arg1.method1814(-18, true);
                    } catch (NullPointerException var31) {
                        arg1.method1814(-19, true);
                    } catch (Exception var32) {
                        arg1.method1814(-20, true);
                    } catch (Throwable var33) {
                        arg1.method1814(-21, true);
                    }
                } else {
                    arg1.method1814(var3.field4101[var7], true);
                }
            }
            arg1.method1817(var6, (byte) 110);
            arg1.method1828(false, arg1.field4399 - var6);
            var3.method1676(true);
        }
    }

    @OriginalMember(owner = "client!qr", name = "<init>", descriptor = "(Lkp;ILph;)V", line = 370)
    public class48(class341 arg0, int arg1, class459 arg2) {
        this.field984 = arg2;
        if (this.field984 != null) {
            this.field984.method2763(11, -3);
        }
    }
}
