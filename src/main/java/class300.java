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

@OriginalClass("client!du")
public class class300 {

    @OriginalMember(owner = "client!du", name = "p", descriptor = "I")
    public int field4125;

    @OriginalMember(owner = "client!du", name = "n", descriptor = "I")
    public int field4123;

    @OriginalMember(owner = "client!du", name = "g", descriptor = "I")
    public int field4116;

    @OriginalMember(owner = "client!du", name = "c", descriptor = "I")
    public int field4112;

    @OriginalMember(owner = "client!du", name = "j", descriptor = "B")
    public byte field4119;

    @OriginalMember(owner = "client!du", name = "a", descriptor = "I")
    public int field4110;

    @OriginalMember(owner = "client!du", name = "d", descriptor = "I")
    public static int field4113 = 0;

    @OriginalMember(owner = "client!du", name = "f", descriptor = "Lada;")
    public static class144 field4115 = new class144(40, 10);

    @OriginalMember(owner = "client!du", name = "o", descriptor = "Lkv;")
    public static class227 field4124 = new class227();

    @OriginalMember(owner = "client!du", name = "b", descriptor = "I")
    public static int field4111;

    @OriginalMember(owner = "client!du", name = "h", descriptor = "I")
    public static int field4117;

    @OriginalMember(owner = "client!du", name = "k", descriptor = "I")
    public static int field4120;

    @OriginalMember(owner = "client!du", name = "m", descriptor = "Lei;")
    public class154 field4122;

    @OriginalMember(owner = "client!du", name = "e", descriptor = "Lqk;")
    public class16 field4114;

    @OriginalMember(owner = "client!du", name = "i", descriptor = "Ljw;")
    public class475 field4118;

    @OriginalMember(owner = "client!du", name = "l", descriptor = "Leg;")
    public class91 field4121;

    @OriginalMember(owner = "client!du", name = "a", descriptor = "(B)V", line = 6)
    public static void method1835(byte arg0) {
        if (arg0 == -44) {
            field4115 = null;
            field4124 = null;
        }
    }

    @OriginalMember(owner = "client!du", name = "a", descriptor = "(BLica;Luh;ILks;III)V", line = 18)
    public static final void method1836(byte arg0, class571 arg1, class145 arg2, int arg3, class373 arg4, int arg5, int arg6, int arg7) {
        field4120++;
        class14 var8 = new class14();
        var8.field123 = arg5 << 7;
        var8.field130 = arg6 << 7;
        var8.field129 = arg3;
        if (arg2 != null) {
            var8.field124 = arg2;
            int var10 = arg2.field2108;
            int var11 = arg2.field2067;
            if (arg7 == 1 || arg7 == 3) {
                var11 = arg2.field2108;
                var10 = arg2.field2067;
            }
            var8.field131 = arg2.field2042;
            var8.field147 = arg6 + var11 << 7;
            var8.field126 = arg2.field2074 << 7;
            var8.field133 = arg2.field2080;
            var8.field137 = arg2.field2061;
            var8.field132 = arg2.field2076;
            var8.field146 = arg5 + var10 << 7;
            var8.field127 = arg2.field2050;
            if (arg2.field2028 != null) {
                var8.field140 = true;
                var8.method103((byte) 125);
            }
            if (var8.field132 != null) {
                var8.field142 = var8.field131 + ((int) ((double) (var8.field133 - var8.field131) * Math.random()));
            }
            class1.field5.method131(var8, 0);
        } else if (arg1 != null) {
            var8.field145 = arg1;
            class87 var9 = arg1.field8405;
            if (var9.field1314 != null) {
                var8.field140 = true;
                var9 = var9.method655((byte) 108, class556.field8280);
            }
            if (var9 != null) {
                var8.field146 = var9.field1237 + arg5 << 7;
                var8.field147 = var9.field1237 + arg6 << 7;
                var8.field137 = class565.method3388(arg1, (byte) -114);
                var8.field127 = var9.field1301;
                var8.field126 = var9.field1242 << 7;
            }
            class615.field9103.method131(var8, 0);
        } else if (arg4 != null) {
            var8.field143 = arg4;
            var8.field146 = arg4.method940(-1) + arg5 << 7;
            var8.field147 = arg6 + arg4.method940(-1) << 7;
            var8.field137 = class335.method2046(128, arg4);
            var8.field126 = arg4.field5135 << 7;
            var8.field127 = arg4.field5139;
            class276.field3879.method2797(-4234, var8, (long) arg4.field1904);
        }
        if (arg0 < 49) {
            method1837(118, null, -103);
        }
    }

    @OriginalMember(owner = "client!du", name = "a", descriptor = "(ILgba;I)V", line = 108)
    public static final void method1837(int arg0, class574 arg1, int arg2) {
        if (arg0 != -3) {
            return;
        }
        field4111++;
        while (true) {
            class22 var3 = (class22) class359.field4877.method124((byte) 42);
            if (var3 == null) {
                return;
            }
            boolean var4 = false;
            for (int var5 = 0; var5 < var3.field216; var5++) {
                if (var3.field220[var5] != null) {
                    if (var3.field220[var5].field202 == 2) {
                        var3.field218[var5] = -5;
                    }
                    if (var3.field220[var5].field202 == 0) {
                        var4 = true;
                    }
                }
                if (var3.field214[var5] != null) {
                    if (var3.field214[var5].field202 == 2) {
                        var3.field218[var5] = -6;
                    }
                    if (var3.field214[var5].field202 == 0) {
                        var4 = true;
                    }
                }
            }
            if (var4) {
                return;
            }
            arg1.method3413(true, arg2);
            arg1.method1049(arg0 + 2, 0);
            int var6 = arg1.field2177;
            arg1.method1058(602643080, var3.field217);
            for (int var7 = 0; var7 < var3.field216; var7++) {
                if (var3.field218[var7] == 0) {
                    try {
                        int var8 = var3.field208[var7];
                        if (var8 == 0) {
                            Field var12 = (Field) var3.field220[var7].field201;
                            int var13 = var12.getInt(null);
                            arg1.method1049(arg0 + 2, 0);
                            arg1.method1058(arg0 + 602643083, var13);
                        } else if (var8 == 1) {
                            Field var9 = (Field) var3.field220[var7].field201;
                            var9.setInt(null, var3.field209[var7]);
                            arg1.method1049(arg0 ^ 0x2, 0);
                        } else if (var8 == 2) {
                            Field var10 = (Field) var3.field220[var7].field201;
                            int var11 = var10.getModifiers();
                            arg1.method1049(-1, 0);
                            arg1.method1058(602643080, var11);
                        }
                        if (var8 == 3) {
                            Method var16 = (Method) var3.field214[var7].field201;
                            byte[][] var17 = var3.field221[var7];
                            Object[] var18 = new Object[var17.length];
                            for (int var19 = 0; var19 < var17.length; var19++) {
                                ObjectInputStream var20 = new ObjectInputStream(new ByteArrayInputStream(var17[var19]));
                                var18[var19] = var20.readObject();
                            }
                            Object var21 = var16.invoke(null, var18);
                            if (var21 == null) {
                                arg1.method1049(arg0 + 2, 0);
                            } else if (var21 instanceof Number) {
                                arg1.method1049(arg0 + 2, 1);
                                arg1.method1025(-496560248, ((Number) var21).longValue());
                            } else if ((var21 instanceof String)) {
                                arg1.method1049(-1, 2);
                                arg1.method1050((byte) 32, (String) var21);
                            } else {
                                arg1.method1049(arg0 ^ 0x2, 4);
                            }
                        } else if (var8 == 4) {
                            Method var14 = (Method) var3.field214[var7].field201;
                            int var15 = var14.getModifiers();
                            arg1.method1049(-1, 0);
                            arg1.method1058(602643080, var15);
                        }
                    } catch (ClassNotFoundException var22) {
                        arg1.method1049(-1, -10);
                    } catch (InvalidClassException var23) {
                        arg1.method1049(arg0 ^ 0x2, -11);
                    } catch (StreamCorruptedException var24) {
                        arg1.method1049(-1, -12);
                    } catch (OptionalDataException var25) {
                        arg1.method1049(-1, -13);
                    } catch (IllegalAccessException var26) {
                        arg1.method1049(-1, -14);
                    } catch (IllegalArgumentException var27) {
                        arg1.method1049(-1, -15);
                    } catch (InvocationTargetException var28) {
                        arg1.method1049(-1, -16);
                    } catch (SecurityException var29) {
                        arg1.method1049(-1, -17);
                    } catch (IOException var30) {
                        arg1.method1049(-1, -18);
                    } catch (NullPointerException var31) {
                        arg1.method1049(-1, -19);
                    } catch (Exception var32) {
                        arg1.method1049(-1, -20);
                    } catch (Throwable var33) {
                        arg1.method1049(-1, -21);
                    }
                } else {
                    arg1.method1049(arg0 + 2, var3.field218[var7]);
                }
            }
            arg1.method1063(var6, -1751678248);
            arg1.method1066(arg1.field2177 - var6, -127);
            var3.method2457(-8422);
        }
    }

    @OriginalMember(owner = "client!du", name = "a", descriptor = "([[II)V", line = 303)
    public static final void method1838(int[][] arg0, int arg1) {
        class604.field8993 = arg0;
        if (arg1 >= 86) {
            field4117++;
        }
    }

    @OriginalMember(owner = "client!du", name = "<init>", descriptor = "(BIIIII)V", line = 333)
    public class300(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field4125 = arg3;
        this.field4123 = arg2;
        this.field4116 = arg5;
        this.field4112 = arg4;
        this.field4119 = arg0;
        this.field4110 = arg1;
    }
}
