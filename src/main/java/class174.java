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

@OriginalClass("client!ro")
public abstract class class174 extends class316 {

    @OriginalMember(owner = "client!ro", name = "f", descriptor = "Lrc;")
    public static class108 field2645 = new class108(65, -1);

    @OriginalMember(owner = "client!ro", name = "n", descriptor = "F")
    public static float field2653;

    @OriginalMember(owner = "client!ro", name = "d", descriptor = "I")
    public int field2643;

    @OriginalMember(owner = "client!ro", name = "e", descriptor = "I")
    public static int field2644;

    @OriginalMember(owner = "client!ro", name = "g", descriptor = "I")
    public static int field2646;

    @OriginalMember(owner = "client!ro", name = "h", descriptor = "I")
    public static int field2647;

    @OriginalMember(owner = "client!ro", name = "j", descriptor = "I")
    public static int field2649;

    @OriginalMember(owner = "client!ro", name = "k", descriptor = "I")
    public static int field2650;

    @OriginalMember(owner = "client!ro", name = "l", descriptor = "I")
    public static int field2651;

    @OriginalMember(owner = "client!ro", name = "m", descriptor = "I")
    public int field2652;

    @OriginalMember(owner = "client!ro", name = "o", descriptor = "I")
    public int field2654;

    @OriginalMember(owner = "client!ro", name = "i", descriptor = "Z")
    public boolean field2648;

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(ZILvc;IILuq;I)V")
    public final void method70(boolean arg0, int arg1, class89 arg2, int arg3, int arg4, class316 arg5, int arg6) {
        field2647++;
        if (arg1 < 40) {
            method1259(-64);
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(I)V")
    public static void method1259(int arg0) {
        if (arg0 == -1) {
            field2645 = null;
        }
    }

    @OriginalMember(owner = "client!ro", name = "c", descriptor = "(I)Z")
    public final boolean method68(int arg0) {
        int var2 = -52 / ((arg0 - 2) / 57);
        field2651++;
        return false;
    }

    @OriginalMember(owner = "client!ro", name = "d", descriptor = "(B)V")
    public final void method75(byte arg0) {
        field2646++;
        if (arg0 != 111) {
            this.method70(true, 10, (class89) null, -74, 127, (class316) null, 12);
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(IILvh;)V")
    public static final void method1260(int arg0, int arg1, class84 arg2) {
        int var3 = 39 / ((23 - arg1) / 37);
        field2649++;
        while (true) {
            class116 var4 = (class116) class349.field4808.method775(1);
            if (var4 == null) {
                return;
            }
            boolean var5 = false;
            for (int var6 = 0; var6 < var4.field1615; var6++) {
                if (var4.field1614[var6] != null) {
                    if (var4.field1614[var6].field3979 == 2) {
                        var4.field1612[var6] = -5;
                    }
                    if (var4.field1614[var6].field3979 == 0) {
                        var5 = true;
                    }
                }
                if (var4.field1613[var6] != null) {
                    if (var4.field1613[var6].field3979 == 2) {
                        var4.field1612[var6] = -6;
                    }
                    if (var4.field1613[var6].field3979 == 0) {
                        var5 = true;
                    }
                }
            }
            if (var5) {
                return;
            }
            arg2.method713((byte) -29, arg0);
            arg2.method1180((byte) -110, 0);
            int var7 = arg2.field2298;
            arg2.method1177(var4.field1610, -110);
            for (int var8 = 0; var8 < var4.field1615; var8++) {
                if (var4.field1612[var8] == 0) {
                    try {
                        int var9 = var4.field1607[var8];
                        if (var9 == 0) {
                            Field var13 = (Field) var4.field1614[var8].field3984;
                            int var14 = var13.getInt((Object) null);
                            arg2.method1180((byte) -110, 0);
                            arg2.method1177(var14, -78);
                        } else if (var9 == 1) {
                            Field var12 = (Field) var4.field1614[var8].field3984;
                            var12.setInt((Object) null, var4.field1608[var8]);
                            arg2.method1180((byte) -110, 0);
                        } else if (var9 == 2) {
                            Field var10 = (Field) var4.field1614[var8].field3984;
                            int var11 = var10.getModifiers();
                            arg2.method1180((byte) -110, 0);
                            arg2.method1177(var11, -120);
                        }
                        if (var9 == 3) {
                            Method var15 = (Method) var4.field1613[var8].field3984;
                            byte[][] var16 = var4.field1611[var8];
                            Object[] var17 = new Object[var16.length];
                            for (int var18 = 0; var18 < var16.length; var18++) {
                                ObjectInputStream var19 = new ObjectInputStream(new ByteArrayInputStream(var16[var18]));
                                var17[var18] = var19.readObject();
                            }
                            Object var20 = var15.invoke((Object) null, var17);
                            if (var20 == null) {
                                arg2.method1180((byte) -110, 0);
                            } else if ((var20 instanceof Number)) {
                                arg2.method1180((byte) -110, 1);
                                arg2.method1190(((Number) var20).longValue(), (byte) -72);
                            } else if (var20 instanceof String) {
                                arg2.method1180((byte) -110, 2);
                                arg2.method1184((byte) 69, (String) var20);
                            } else {
                                arg2.method1180((byte) -110, 4);
                            }
                        } else if (var9 == 4) {
                            Method var21 = (Method) var4.field1613[var8].field3984;
                            int var22 = var21.getModifiers();
                            arg2.method1180((byte) -110, 0);
                            arg2.method1177(var22, -54);
                        }
                    } catch (ClassNotFoundException var23) {
                        arg2.method1180((byte) -110, -10);
                    } catch (InvalidClassException var24) {
                        arg2.method1180((byte) -110, -11);
                    } catch (StreamCorruptedException var25) {
                        arg2.method1180((byte) -110, -12);
                    } catch (OptionalDataException var26) {
                        arg2.method1180((byte) -110, -13);
                    } catch (IllegalAccessException var27) {
                        arg2.method1180((byte) -110, -14);
                    } catch (IllegalArgumentException var28) {
                        arg2.method1180((byte) -110, -15);
                    } catch (InvocationTargetException var29) {
                        arg2.method1180((byte) -110, -16);
                    } catch (SecurityException var30) {
                        arg2.method1180((byte) -110, -17);
                    } catch (IOException var31) {
                        arg2.method1180((byte) -110, -18);
                    } catch (NullPointerException var32) {
                        arg2.method1180((byte) -110, -19);
                    } catch (Exception var33) {
                        arg2.method1180((byte) -110, -20);
                    } catch (Throwable var34) {
                        arg2.method1180((byte) -110, -21);
                    }
                } else {
                    arg2.method1180((byte) -110, var4.field1612[var8]);
                }
            }
            arg2.method1167(var7, (byte) 124);
            arg2.method1138(arg2.field2298 - var7, 1);
            var4.method2714(123);
        }
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(IBI)B")
    public static final byte method1261(int arg0, byte arg1, int arg2) {
        field2644++;
        if (arg2 == 9) {
            if (arg1 >= -87) {
                field2653 = 0.62922555F;
            }
            return (byte) ((arg0 & 0x1) == 0 ? 1 : 2);
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(B)J")
    public static final long method1262(byte arg0) {
        if (arg0 >= -54) {
            method1262((byte) 41);
        }
        field2650++;
        return class350.field4812.method458(113);
    }
}
