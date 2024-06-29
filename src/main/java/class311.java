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

@OriginalClass("client!ag")
public class class311 {

    @OriginalMember(owner = "client!ag", name = "o", descriptor = "[I")
    public static int[] field4586 = new int[] { 7, 8, 9, 10, 11, 12, 13, 15 };

    @OriginalMember(owner = "client!ag", name = "k", descriptor = "Lvq;")
    public static class24 field4582 = new class24(79, -1);

    @OriginalMember(owner = "client!ag", name = "p", descriptor = "Lvq;")
    public static class24 field4587 = new class24(102, 3);

    @OriginalMember(owner = "client!ag", name = "b", descriptor = "I")
    public static int field4573;

    @OriginalMember(owner = "client!ag", name = "c", descriptor = "I")
    public int field4574;

    @OriginalMember(owner = "client!ag", name = "d", descriptor = "I")
    public static int field4575;

    @OriginalMember(owner = "client!ag", name = "e", descriptor = "I")
    public static int field4576;

    @OriginalMember(owner = "client!ag", name = "f", descriptor = "I")
    public int field4577;

    @OriginalMember(owner = "client!ag", name = "g", descriptor = "I")
    public int field4578;

    @OriginalMember(owner = "client!ag", name = "h", descriptor = "I")
    public int field4579;

    @OriginalMember(owner = "client!ag", name = "j", descriptor = "I")
    public int field4581;

    @OriginalMember(owner = "client!ag", name = "l", descriptor = "I")
    public int field4583;

    @OriginalMember(owner = "client!ag", name = "m", descriptor = "I")
    public int field4584;

    @OriginalMember(owner = "client!ag", name = "q", descriptor = "I")
    public static int field4588;

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "[B")
    public byte[] field4572;

    @OriginalMember(owner = "client!ag", name = "n", descriptor = "[B")
    public byte[] field4585;

    @OriginalMember(owner = "client!ag", name = "i", descriptor = "[I")
    public static int[] field4580;

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(IILge;)V", line = 6)
    public static final void method2064(int arg0, int arg1, class108 arg2) {
        field4576++;
        if (arg1 < 67) {
            field4582 = null;
        }
        while (true) {
            class433 var3 = (class433) class146.field1975.method2478(1603);
            if (var3 == null) {
                return;
            }
            boolean var4 = false;
            for (int var5 = 0; var5 < var3.field6303; var5++) {
                if (var3.field6307[var5] != null) {
                    if (var3.field6307[var5].field5134 == 2) {
                        var3.field6305[var5] = -5;
                    }
                    if (var3.field6307[var5].field5134 == 0) {
                        var4 = true;
                    }
                }
                if (var3.field6302[var5] != null) {
                    if (var3.field6302[var5].field5134 == 2) {
                        var3.field6305[var5] = -6;
                    }
                    if (var3.field6302[var5].field5134 == 0) {
                        var4 = true;
                    }
                }
            }
            if (var4) {
                return;
            }
            arg2.method767(8, arg0);
            arg2.method1727(-128, 0);
            int var6 = arg2.field3762;
            arg2.method1721(25153, var3.field6306);
            for (int var7 = 0; var7 < var3.field6303; var7++) {
                if (var3.field6305[var7] == 0) {
                    try {
                        int var8 = var3.field6301[var7];
                        if (var8 == 0) {
                            Field var12 = (Field) var3.field6307[var7].field5129;
                            int var13 = var12.getInt((Object) null);
                            arg2.method1727(-128, 0);
                            arg2.method1721(25153, var13);
                        } else if (var8 == 1) {
                            Field var9 = (Field) var3.field6307[var7].field5129;
                            var9.setInt((Object) null, var3.field6310[var7]);
                            arg2.method1727(-128, 0);
                        } else if (var8 == 2) {
                            Field var10 = (Field) var3.field6307[var7].field5129;
                            int var11 = var10.getModifiers();
                            arg2.method1727(-128, 0);
                            arg2.method1721(25153, var11);
                        }
                        if (var8 == 3) {
                            Method var16 = (Method) var3.field6302[var7].field5129;
                            byte[][] var17 = var3.field6304[var7];
                            Object[] var18 = new Object[var17.length];
                            for (int var19 = 0; var19 < var17.length; var19++) {
                                ObjectInputStream var20 = new ObjectInputStream(new ByteArrayInputStream(var17[var19]));
                                var18[var19] = var20.readObject();
                            }
                            Object var21 = var16.invoke((Object) null, var18);
                            if (var21 == null) {
                                arg2.method1727(-128, 0);
                            } else if ((var21 instanceof Number)) {
                                arg2.method1727(-128, 1);
                                arg2.method1730(((Number) var21).longValue(), false);
                            } else if ((var21 instanceof String)) {
                                arg2.method1727(-128, 2);
                                arg2.method1712((String) var21, 106);
                            } else {
                                arg2.method1727(-128, 4);
                            }
                        } else if (var8 == 4) {
                            Method var14 = (Method) var3.field6302[var7].field5129;
                            int var15 = var14.getModifiers();
                            arg2.method1727(-128, 0);
                            arg2.method1721(25153, var15);
                        }
                    } catch (ClassNotFoundException var22) {
                        arg2.method1727(-128, -10);
                    } catch (InvalidClassException var23) {
                        arg2.method1727(-128, -11);
                    } catch (StreamCorruptedException var24) {
                        arg2.method1727(-128, -12);
                    } catch (OptionalDataException var25) {
                        arg2.method1727(-128, -13);
                    } catch (IllegalAccessException var26) {
                        arg2.method1727(-128, -14);
                    } catch (IllegalArgumentException var27) {
                        arg2.method1727(-128, -15);
                    } catch (InvocationTargetException var28) {
                        arg2.method1727(-128, -16);
                    } catch (SecurityException var29) {
                        arg2.method1727(-128, -17);
                    } catch (IOException var30) {
                        arg2.method1727(-128, -18);
                    } catch (NullPointerException var31) {
                        arg2.method1727(-128, -19);
                    } catch (Exception var32) {
                        arg2.method1727(-128, -20);
                    } catch (Throwable var33) {
                        arg2.method1727(-128, -21);
                    }
                } else {
                    arg2.method1727(-128, var3.field6305[var7]);
                }
            }
            arg2.method1755(68186120, var6);
            arg2.method1753(arg2.field3762 - var6, (byte) -127);
            var3.method1820(-25246);
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(B)V", line = 195)
    public static void method2065(byte arg0) {
        field4582 = null;
        field4580 = null;
        field4586 = null;
        if (arg0 == -2) {
            field4587 = null;
        }
    }

    @OriginalMember(owner = "client!ag", name = "b", descriptor = "(B)V", line = 209)
    public static final void method2066(byte arg0) {
        field4575++;
        if (arg0 >= -37) {
            method2064(42, 42, (class108) null);
        }
        class363 var1 = class148.field2017;
        synchronized (class148.field2017) {
            class148.field2017.method2313(112);
        }
    }
}
