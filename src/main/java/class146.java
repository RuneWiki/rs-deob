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

@OriginalClass("client!vl")
public class class146 extends class154 {

    @OriginalMember(owner = "client!vl", name = "p", descriptor = "[B")
    public byte[] field2472;

    @OriginalMember(owner = "client!vl", name = "s", descriptor = "Lvj;")
    public static class96 field2475 = new class96(64);

    @OriginalMember(owner = "client!vl", name = "u", descriptor = "Z")
    public static boolean field2477 = true;

    @OriginalMember(owner = "client!vl", name = "x", descriptor = "Loh;")
    public static class258 field2480 = class153.method1046(":assist:", 105);

    @OriginalMember(owner = "client!vl", name = "o", descriptor = "I")
    public static int field2471;

    @OriginalMember(owner = "client!vl", name = "q", descriptor = "I")
    public static int field2473;

    @OriginalMember(owner = "client!vl", name = "r", descriptor = "I")
    public static int field2474;

    @OriginalMember(owner = "client!vl", name = "t", descriptor = "I")
    public static int field2476;

    @OriginalMember(owner = "client!vl", name = "v", descriptor = "I")
    public static int field2478;

    @OriginalMember(owner = "client!vl", name = "A", descriptor = "Lsj;")
    public static class169 field2483;

    @OriginalMember(owner = "client!vl", name = "B", descriptor = "Lgb;")
    public static class213 field2484;

    @OriginalMember(owner = "client!vl", name = "w", descriptor = "[I")
    public static int[] field2479;

    @OriginalMember(owner = "client!vl", name = "y", descriptor = "[I")
    public static int[] field2481;

    @OriginalMember(owner = "client!vl", name = "z", descriptor = "[[B")
    public static byte[][] field2482;

    @OriginalMember(owner = "client!vl", name = "d", descriptor = "(B)V", line = 15)
    public static void method1009(byte arg0) {
        field2480 = null;
        field2481 = null;
        if (arg0 != -119) {
            method1009((byte) -95);
        }
        field2482 = (byte[][]) null;
        field2483 = null;
        field2479 = null;
        field2475 = null;
        field2484 = null;
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(II)I", line = 32)
    public static final int method1010(int arg0, int arg1) {
        field2476++;
        if (arg0 >= -66) {
            method1009((byte) -68);
        }
        return arg1 & 0xFF;
    }

    @OriginalMember(owner = "client!vl", name = "<init>", descriptor = "([B)V", line = 41)
    public class146(byte[] arg0) {
        this.field2472 = arg0;
    }

    @OriginalMember(owner = "client!vl", name = "b", descriptor = "(II)Z", line = 63)
    public static final boolean method1011(int arg0, int arg1) {
        field2478++;
        if (arg0 <= 114) {
            method1010(113, 120);
        }
        return (arg1 >> 29 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(ZLf;I)V", line = 75)
    public static final void method1012(boolean arg0, class121 arg1, int arg2) {
        field2473++;
        if (arg0) {
            return;
        }
        while (true) {
            class236 var3 = (class236) class155.field2652.method83(-122);
            if (var3 == null) {
                return;
            }
            boolean var4 = false;
            for (int var5 = 0; var5 < var3.field4129; var5++) {
                if (var3.field4121[var5] != null) {
                    if (var3.field4121[var5].field2067 == 2) {
                        var3.field4134[var5] = -5;
                    }
                    if (var3.field4121[var5].field2067 == 0) {
                        var4 = true;
                    }
                }
                if (var3.field4122[var5] != null) {
                    if (var3.field4122[var5].field2067 == 2) {
                        var3.field4134[var5] = -6;
                    }
                    if (var3.field4122[var5].field2067 == 0) {
                        var4 = true;
                    }
                }
            }
            if (var4) {
                return;
            }
            arg1.method885(arg2, -72);
            arg1.method1598(0, 27052);
            int var6 = arg1.field4051;
            arg1.method1577(true, var3.field4123);
            for (int var7 = 0; var7 < var3.field4129; var7++) {
                if (var3.field4134[var7] == 0) {
                    try {
                        int var8 = var3.field4124[var7];
                        if (var8 == 0) {
                            Field var9 = (Field) var3.field4121[var7].field2063;
                            int var10 = var9.getInt((Object) null);
                            arg1.method1598(0, 27052);
                            arg1.method1577(true, var10);
                        } else if (var8 == 1) {
                            Field var11 = (Field) var3.field4121[var7].field2063;
                            var11.setInt((Object) null, var3.field4125[var7]);
                            arg1.method1598(0, 27052);
                        } else if (var8 == 2) {
                            Field var12 = (Field) var3.field4121[var7].field2063;
                            int var13 = var12.getModifiers();
                            arg1.method1598(0, 27052);
                            arg1.method1577(!arg0, var13);
                        }
                        if (var8 == 3) {
                            Method var14 = (Method) var3.field4122[var7].field2063;
                            byte[][] var15 = var3.field4133[var7];
                            Object[] var16 = new Object[var15.length];
                            for (int var17 = 0; var17 < var15.length; var17++) {
                                ObjectInputStream var18 = new ObjectInputStream(new ByteArrayInputStream(var15[var17]));
                                var16[var17] = var18.readObject();
                            }
                            Object var19 = var14.invoke((Object) null, var16);
                            if (var19 == null) {
                                arg1.method1598(0, 27052);
                            } else if ((var19 instanceof Number)) {
                                arg1.method1598(1, 27052);
                                arg1.method1603(((Number) var19).longValue(), -1649350304);
                            } else if ((var19 instanceof class258)) {
                                arg1.method1598(2, 27052);
                                arg1.method1590((class258) var19, (byte) -88);
                            } else {
                                arg1.method1598(4, 27052);
                            }
                        } else if (var8 == 4) {
                            Method var20 = (Method) var3.field4122[var7].field2063;
                            int var21 = var20.getModifiers();
                            arg1.method1598(0, 27052);
                            arg1.method1577(true, var21);
                        }
                    } catch (ClassNotFoundException var34) {
                        arg1.method1598(-10, 27052);
                    } catch (InvalidClassException var35) {
                        arg1.method1598(-11, 27052);
                    } catch (StreamCorruptedException var36) {
                        arg1.method1598(-12, 27052);
                    } catch (OptionalDataException var37) {
                        arg1.method1598(-13, 27052);
                    } catch (IllegalAccessException var38) {
                        arg1.method1598(-14, 27052);
                    } catch (IllegalArgumentException var39) {
                        arg1.method1598(-15, 27052);
                    } catch (InvocationTargetException var40) {
                        arg1.method1598(-16, 27052);
                    } catch (SecurityException var41) {
                        arg1.method1598(-17, 27052);
                    } catch (IOException var42) {
                        arg1.method1598(-18, 27052);
                    } catch (NullPointerException var43) {
                        arg1.method1598(-19, 27052);
                    } catch (Exception var44) {
                        arg1.method1598(-20, 27052);
                    } catch (Throwable var45) {
                        arg1.method1598(-21, 27052);
                    }
                } else {
                    arg1.method1598(var3.field4134[var7], 27052);
                }
            }
            arg1.method1609(var6, (byte) 125);
            arg1.method1618(14691, arg1.field4051 - var6);
            var3.method1054((byte) 80);
        }
    }
}
