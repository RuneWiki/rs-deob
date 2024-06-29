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

@OriginalClass("client!sl")
public class class28 extends class393 {

    @OriginalMember(owner = "client!sl", name = "p", descriptor = "J")
    public long field492;

    @OriginalMember(owner = "client!sl", name = "q", descriptor = "Ljava/lang/String;")
    public static String field493 = "flash2:";

    @OriginalMember(owner = "client!sl", name = "o", descriptor = "Ljava/lang/String;")
    public static String field491 = "purple:";

    @OriginalMember(owner = "client!sl", name = "s", descriptor = "Z")
    public static boolean field495 = false;

    @OriginalMember(owner = "client!sl", name = "m", descriptor = "I")
    public static int field489;

    @OriginalMember(owner = "client!sl", name = "n", descriptor = "I")
    public static int field490;

    @OriginalMember(owner = "client!sl", name = "r", descriptor = "I")
    public static int field494;

    @OriginalMember(owner = "client!sl", name = "b", descriptor = "(I)V")
    public static void method249(int arg0) {
        field491 = null;
        field493 = null;
        if (arg0 != 6234) {
            field491 = null;
        }
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(IZLjava/lang/Object;)[B")
    public static final byte[] method250(int arg0, boolean arg1, Object arg2) {
        field490++;
        if (arg2 == null) {
            return null;
        }
        if (arg0 != 0) {
            method251(77, (class108) null, -79);
        }
        if (arg2 instanceof byte[]) {
            byte[] var3 = (byte[]) arg2;
            return arg1 ? class368.method2430(var3, (byte) -128) : var3;
        } else if (arg2 instanceof class133) {
            class133 var4 = (class133) arg2;
            return var4.method776((byte) -45);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(ILvg;I)V")
    public static final void method251(int arg0, class108 arg1, int arg2) {
        field489++;
        if (arg0 != -19) {
            field491 = null;
        }
        while (true) {
            class292 var3 = (class292) class278.field4076.method2649(0);
            if (var3 == null) {
                return;
            }
            boolean var4 = false;
            for (int var5 = 0; var5 < var3.field4231; var5++) {
                if (var3.field4236[var5] != null) {
                    if (var3.field4236[var5].field4259 == 2) {
                        var3.field4227[var5] = -5;
                    }
                    if (var3.field4236[var5].field4259 == 0) {
                        var4 = true;
                    }
                }
                if (var3.field4234[var5] != null) {
                    if (var3.field4234[var5].field4259 == 2) {
                        var3.field4227[var5] = -6;
                    }
                    if (var3.field4234[var5].field4259 == 0) {
                        var4 = true;
                    }
                }
            }
            if (var4) {
                return;
            }
            arg1.method756(arg0 + 19, arg2);
            arg1.method1707(arg0 + 48, 0);
            int var6 = arg1.field3915;
            arg1.method1704(var3.field4229, (byte) 127);
            for (int var7 = 0; var7 < var3.field4231; var7++) {
                if (var3.field4227[var7] == 0) {
                    try {
                        int var8 = var3.field4224[var7];
                        if (var8 == 0) {
                            Field var12 = (Field) var3.field4236[var7].field4262;
                            int var13 = var12.getInt((Object) null);
                            arg1.method1707(99, 0);
                            arg1.method1704(var13, (byte) 125);
                        } else if (var8 == 1) {
                            Field var9 = (Field) var3.field4236[var7].field4262;
                            var9.setInt((Object) null, var3.field4238[var7]);
                            arg1.method1707(arg0 + 129, 0);
                        } else if (var8 == 2) {
                            Field var10 = (Field) var3.field4236[var7].field4262;
                            int var11 = var10.getModifiers();
                            arg1.method1707(-125, 0);
                            arg1.method1704(var11, (byte) 127);
                        }
                        if (var8 == 3) {
                            Method var16 = (Method) var3.field4234[var7].field4262;
                            byte[][] var17 = var3.field4223[var7];
                            Object[] var18 = new Object[var17.length];
                            for (int var19 = 0; var19 < var17.length; var19++) {
                                ObjectInputStream var20 = new ObjectInputStream(new ByteArrayInputStream(var17[var19]));
                                var18[var19] = var20.readObject();
                            }
                            Object var21 = var16.invoke((Object) null, var18);
                            if (var21 == null) {
                                arg1.method1707(87, 0);
                            } else if ((var21 instanceof Number)) {
                                arg1.method1707(arg0 - 96, 1);
                                arg1.method1689((byte) 120, ((Number) var21).longValue());
                            } else if ((var21 instanceof String)) {
                                arg1.method1707(114, 2);
                                arg1.method1662((String) var21, (byte) 35);
                            } else {
                                arg1.method1707(61, 4);
                            }
                        } else if (var8 == 4) {
                            Method var14 = (Method) var3.field4234[var7].field4262;
                            int var15 = var14.getModifiers();
                            arg1.method1707(-121, 0);
                            arg1.method1704(var15, (byte) 125);
                        }
                    } catch (ClassNotFoundException var22) {
                        arg1.method1707(-111, -10);
                    } catch (InvalidClassException var23) {
                        arg1.method1707(102, -11);
                    } catch (StreamCorruptedException var24) {
                        arg1.method1707(-109, -12);
                    } catch (OptionalDataException var25) {
                        arg1.method1707(-122, -13);
                    } catch (IllegalAccessException var26) {
                        arg1.method1707(arg0 + 32, -14);
                    } catch (IllegalArgumentException var27) {
                        arg1.method1707(-124, -15);
                    } catch (InvocationTargetException var28) {
                        arg1.method1707(96, -16);
                    } catch (SecurityException var29) {
                        arg1.method1707(arg0 - 96, -17);
                    } catch (IOException var30) {
                        arg1.method1707(arg0 ^ 0xFFFFFFA5, -18);
                    } catch (NullPointerException var31) {
                        arg1.method1707(-4, -19);
                    } catch (Exception var32) {
                        arg1.method1707(-120, -20);
                    } catch (Throwable var33) {
                        arg1.method1707(-119, -21);
                    }
                } else {
                    arg1.method1707(-124, var3.field4227[var7]);
                }
            }
            arg1.method1677(var6, -104);
            arg1.method1669(arg1.field3915 - var6, (byte) -42);
            var3.method2574((byte) 125);
        }
    }

    @OriginalMember(owner = "client!sl", name = "<init>", descriptor = "()V")
    public class28() {
    }

    @OriginalMember(owner = "client!sl", name = "<init>", descriptor = "(J)V")
    public class28(long arg0) {
        this.field492 = arg0;
    }
}
