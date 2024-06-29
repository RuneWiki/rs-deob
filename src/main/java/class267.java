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

@OriginalClass("client!cn")
public class class267 extends class240 {

    @OriginalMember(owner = "client!cn", name = "t", descriptor = "I")
    public int field4138;

    @OriginalMember(owner = "client!cn", name = "p", descriptor = "I")
    public int field4134;

    @OriginalMember(owner = "client!cn", name = "r", descriptor = "I")
    public static int field4136 = 0;

    @OriginalMember(owner = "client!cn", name = "n", descriptor = "Lkb;")
    public static class34 field4132 = new class34(5000);

    @OriginalMember(owner = "client!cn", name = "w", descriptor = "I")
    public static int field4141 = 0;

    @OriginalMember(owner = "client!cn", name = "o", descriptor = "I")
    public static int field4133;

    @OriginalMember(owner = "client!cn", name = "q", descriptor = "I")
    public static int field4135;

    @OriginalMember(owner = "client!cn", name = "s", descriptor = "I")
    public static int field4137;

    @OriginalMember(owner = "client!cn", name = "v", descriptor = "Loh;")
    public static class16 field4140;

    @OriginalMember(owner = "client!cn", name = "u", descriptor = "[Ljava/lang/String;")
    public static String[] field4139;

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(B)V", line = 4)
    public static void method1920(byte arg0) {
        field4132 = null;
        if (arg0 != -119) {
            field4141 = -71;
        }
        field4140 = null;
        field4139 = null;
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(ZLkb;I)V", line = 25)
    public static final void method1921(boolean arg0, class34 arg1, int arg2) {
        if (!arg0) {
            return;
        }
        field4135++;
        while (true) {
            class215 var3 = (class215) class92.field1514.method1490(200);
            if (var3 == null) {
                return;
            }
            boolean var4 = false;
            for (int var5 = 0; var5 < var3.field3416; var5++) {
                if (var3.field3424[var5] != null) {
                    if (var3.field3424[var5].field387 == 2) {
                        var3.field3428[var5] = -5;
                    }
                    if (var3.field3424[var5].field387 == 0) {
                        var4 = true;
                    }
                }
                if (var3.field3417[var5] != null) {
                    if (var3.field3417[var5].field387 == 2) {
                        var3.field3428[var5] = -6;
                    }
                    if (var3.field3417[var5].field387 == 0) {
                        var4 = true;
                    }
                }
            }
            if (var4) {
                return;
            }
            arg1.method246(false, arg2);
            arg1.method772((byte) -89, 0);
            int var6 = arg1.field1667;
            arg1.method784(117, var3.field3425);
            for (int var7 = 0; var7 < var3.field3416; var7++) {
                if (var3.field3428[var7] == 0) {
                    try {
                        int var8 = var3.field3419[var7];
                        if (var8 == 0) {
                            Field var9 = (Field) var3.field3424[var7].field391;
                            int var10 = var9.getInt((Object) null);
                            arg1.method772((byte) -113, 0);
                            arg1.method784(-67, var10);
                        } else if (var8 == 1) {
                            Field var13 = (Field) var3.field3424[var7].field391;
                            var13.setInt((Object) null, var3.field3432[var7]);
                            arg1.method772((byte) -66, 0);
                        } else if (var8 == 2) {
                            Field var11 = (Field) var3.field3424[var7].field391;
                            int var12 = var11.getModifiers();
                            arg1.method772((byte) -112, 0);
                            arg1.method784(-50, var12);
                        }
                        if (var8 == 3) {
                            Method var16 = (Method) var3.field3417[var7].field391;
                            byte[][] var17 = var3.field3423[var7];
                            Object[] var18 = new Object[var17.length];
                            for (int var19 = 0; var19 < var17.length; var19++) {
                                ObjectInputStream var20 = new ObjectInputStream(new ByteArrayInputStream(var17[var19]));
                                var18[var19] = var20.readObject();
                            }
                            Object var21 = var16.invoke((Object) null, var18);
                            if (var21 == null) {
                                arg1.method772((byte) -108, 0);
                            } else if ((var21 instanceof Number)) {
                                arg1.method772((byte) -97, 1);
                                arg1.method760(((Number) var21).longValue(), true);
                            } else if ((var21 instanceof String)) {
                                arg1.method772((byte) -88, 2);
                                arg1.method754((byte) 67, (String) var21);
                            } else {
                                arg1.method772((byte) -126, 4);
                            }
                        } else if (var8 == 4) {
                            Method var14 = (Method) var3.field3417[var7].field391;
                            int var15 = var14.getModifiers();
                            arg1.method772((byte) -100, 0);
                            arg1.method784(-101, var15);
                        }
                    } catch (ClassNotFoundException var34) {
                        arg1.method772((byte) -61, -10);
                    } catch (InvalidClassException var35) {
                        arg1.method772((byte) -77, -11);
                    } catch (StreamCorruptedException var36) {
                        arg1.method772((byte) -60, -12);
                    } catch (OptionalDataException var37) {
                        arg1.method772((byte) -94, -13);
                    } catch (IllegalAccessException var38) {
                        arg1.method772((byte) -63, -14);
                    } catch (IllegalArgumentException var39) {
                        arg1.method772((byte) -95, -15);
                    } catch (InvocationTargetException var40) {
                        arg1.method772((byte) -66, -16);
                    } catch (SecurityException var41) {
                        arg1.method772((byte) -83, -17);
                    } catch (IOException var42) {
                        arg1.method772((byte) -114, -18);
                    } catch (NullPointerException var43) {
                        arg1.method772((byte) -85, -19);
                    } catch (Exception var44) {
                        arg1.method772((byte) -116, -20);
                    } catch (Throwable var45) {
                        arg1.method772((byte) -119, -21);
                    }
                } else {
                    arg1.method772((byte) -63, var3.field3428[var7]);
                }
            }
            arg1.method778(var6, (byte) -86);
            arg1.method747(107, arg1.field1667 - var6);
            var3.method1701(-100);
        }
    }

    @OriginalMember(owner = "client!cn", name = "<init>", descriptor = "(II)V", line = 225)
    public class267(int arg0, int arg1) {
        this.field4138 = arg0;
        this.field4134 = arg1;
    }
}
