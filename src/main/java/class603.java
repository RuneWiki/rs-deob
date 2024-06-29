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

@OriginalClass("client!iu")
public class class603 extends class476 {

    @OriginalMember(owner = "client!iu", name = "H", descriptor = "I")
    public static int field8441 = 0;

    @OriginalMember(owner = "client!iu", name = "I", descriptor = "I")
    public static int field8442;

    @OriginalMember(owner = "client!iu", name = "J", descriptor = "I")
    public static int field8443;

    @OriginalMember(owner = "client!iu", name = "L", descriptor = "I")
    public static int field8445;

    @OriginalMember(owner = "client!iu", name = "K", descriptor = "[Lst;")
    public static class456[] field8444;

    @OriginalMember(owner = "client!iu", name = "<init>", descriptor = "(Lwia;Lwia;Lht;)V")
    public class603(class791 arg0, class791 arg1, class606 arg2) {
        super(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "(IIIBI)V")
    public final void method2827(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        ++field8442;
        int var6 = super.field6670.method1507();
        int var7 = ((class606) super.field5543).field8477 * class246.method1630((byte) 83) / 10 % var6;
        if (arg3 == 55) {
            super.field6670.method1610(-var6 + var7 + arg0, arg1, -var7 + var6 + arg4, arg2);
        }
    }

    @OriginalMember(owner = "client!iu", name = "d", descriptor = "(B)V")
    public static void method3499(byte arg0) {
        if (arg0 < 89) {
            method3499((byte) -16);
        }
        field8444 = null;
    }

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "(Ljs;Z)V")
    public static final void method3500(class349 arg0, boolean arg1) {
        ++field8443;
        class304 var2 = (class304) class791.field10851.method1731((byte) -122);
        if (var2 != null) {
            boolean var3 = arg1;
            for (int var4 = 0; ~var4 > ~var2.field4381; ++var4) {
                if (var2.field4377[var4] != null) {
                    if (~var2.field4377[var4].field2089 == -3) {
                        var2.field4380[var4] = -5;
                    }
                    if (var2.field4377[var4].field2089 == 0) {
                        var3 = true;
                    }
                }
                if (var2.field4385[var4] != null) {
                    if (~var2.field4385[var4].field2089 == -3) {
                        var2.field4380[var4] = -6;
                    }
                    if (var2.field4385[var4].field2089 == 0) {
                        var3 = true;
                    }
                }
            }
            if (!var3) {
                int var5 = arg0.field7042;
                arg0.method2959(var2.field4379, (byte) 102);
                for (int var6 = 0; ~var2.field4381 < ~var6; ++var6) {
                    if (~var2.field4380[var6] != -1) {
                        arg0.method2952(0, var2.field4380[var6]);
                    } else {
                        try {
                            int var7 = var2.field4384[var6];
                            if (~var7 == -1) {
                                Field var8 = (Field) var2.field4377[var6].field2092;
                                int var9 = var8.getInt((Object) null);
                                arg0.method2952(0, 0);
                                arg0.method2959(var9, (byte) -118);
                            } else if (~var7 != -2) {
                                if (var7 == 2) {
                                    Field var10 = (Field) var2.field4377[var6].field2092;
                                    int var11 = var10.getModifiers();
                                    arg0.method2952(0, 0);
                                    arg0.method2959(var11, (byte) 120);
                                }
                            } else {
                                Field var12 = (Field) var2.field4377[var6].field2092;
                                var12.setInt((Object) null, var2.field4383[var6]);
                                arg0.method2952(0, 0);
                            }
                            if (var7 != 3) {
                                if (var7 == 4) {
                                    Method var19 = (Method) var2.field4385[var6].field2092;
                                    int var20 = var19.getModifiers();
                                    arg0.method2952(0, 0);
                                    arg0.method2959(var20, (byte) 120);
                                }
                            } else {
                                Method var13 = (Method) var2.field4385[var6].field2092;
                                byte[][] var14 = var2.field4382[var6];
                                Object[] var15 = new Object[var14.length];
                                for (int var16 = 0; var14.length > var16; ++var16) {
                                    ObjectInputStream var17 = new ObjectInputStream(new ByteArrayInputStream(var14[var16]));
                                    var15[var16] = var17.readObject();
                                }
                                Object var18 = var13.invoke((Object) null, var15);
                                if (var18 != null) {
                                    if (!(var18 instanceof Number)) {
                                        if (var18 instanceof String) {
                                            arg0.method2952(0, 2);
                                            arg0.method2953((String) var18, -28136);
                                        } else {
                                            arg0.method2952(0, 4);
                                        }
                                    } else {
                                        arg0.method2952(0, 1);
                                        arg0.method3003(((Number) var18).longValue(), (byte) 108);
                                    }
                                } else {
                                    arg0.method2952(0, 0);
                                }
                            }
                        } catch (ClassNotFoundException var21) {
                            arg0.method2952(0, -10);
                        } catch (InvalidClassException var22) {
                            arg0.method2952(0, -11);
                        } catch (StreamCorruptedException var23) {
                            arg0.method2952(0, -12);
                        } catch (OptionalDataException var24) {
                            arg0.method2952(0, -13);
                        } catch (IllegalAccessException var25) {
                            arg0.method2952(0, -14);
                        } catch (IllegalArgumentException var26) {
                            arg0.method2952(0, -15);
                        } catch (InvocationTargetException var27) {
                            arg0.method2952(0, -16);
                        } catch (SecurityException var28) {
                            arg0.method2952(0, -17);
                        } catch (IOException var29) {
                            arg0.method2952(0, -18);
                        } catch (NullPointerException var30) {
                            arg0.method2952(0, -19);
                        } catch (Exception var31) {
                            arg0.method2952(0, -20);
                        } catch (Throwable var32) {
                            arg0.method2952(0, -21);
                        }
                    }
                }
                arg0.method2942(var5, (byte) -104);
                var2.method3387((byte) -94);
            }
        }
    }
}
