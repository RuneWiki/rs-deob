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

@OriginalClass("client!hc")
public class class73 {

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "I")
    public static int field1095;

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "I")
    public static int field1096;

    @OriginalMember(owner = "client!hc", name = "c", descriptor = "I")
    public static int field1097;

    @OriginalMember(owner = "client!hc", name = "d", descriptor = "I")
    public static int field1098;

    @OriginalMember(owner = "client!hc", name = "e", descriptor = "I")
    public static int field1099;

    @OriginalMember(owner = "client!hc", name = "f", descriptor = "Lfo;")
    public static class486 field1100;

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(B)V", line = 4)
    public static void method559(byte arg0) {
        int var1 = -17 % ((arg0 - 31) / 47);
        field1100 = null;
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(Lmfa;I)V", line = 13)
    public static final void method560(class409 arg0, int arg1) {
        field1098++;
        class217 var2 = (class217) class593.field8040.method3618(83);
        if (var2 == null) {
            return;
        }
        boolean var3 = false;
        for (int var4 = 0; var4 < var2.field2835; var4++) {
            if (var2.field2836[var4] != null) {
                if (var2.field2836[var4].field3633 == 2) {
                    var2.field2827[var4] = -5;
                }
                if (var2.field2836[var4].field3633 == 0) {
                    var3 = true;
                }
            }
            if (var2.field2830[var4] != null) {
                if (var2.field2830[var4].field3633 == 2) {
                    var2.field2827[var4] = -6;
                }
                if (var2.field2830[var4].field3633 == 0) {
                    var3 = true;
                }
            }
        }
        if (var3) {
            return;
        }
        int var5 = arg0.field956;
        arg0.method473(-14, var2.field2834);
        for (int var6 = 0; var6 < var2.field2835; var6++) {
            if (var2.field2827[var6] == 0) {
                try {
                    int var7 = var2.field2828[var6];
                    if (var7 == 0) {
                        Field var11 = (Field) var2.field2836[var6].field3638;
                        int var12 = var11.getInt(null);
                        arg0.method444(0, 128);
                        arg0.method473(-32, var12);
                    } else if (var7 == 1) {
                        Field var8 = (Field) var2.field2836[var6].field3638;
                        var8.setInt(null, var2.field2833[var6]);
                        arg0.method444(0, 128);
                    } else if (var7 == 2) {
                        Field var9 = (Field) var2.field2836[var6].field3638;
                        int var10 = var9.getModifiers();
                        arg0.method444(0, 128);
                        arg0.method473(-123, var10);
                    }
                    if (var7 == 3) {
                        Method var13 = (Method) var2.field2830[var6].field3638;
                        byte[][] var14 = var2.field2837[var6];
                        Object[] var15 = new Object[var14.length];
                        for (int var16 = 0; var16 < var14.length; var16++) {
                            ObjectInputStream var17 = new ObjectInputStream(new ByteArrayInputStream(var14[var16]));
                            var15[var16] = var17.readObject();
                        }
                        Object var18 = var13.invoke(null, var15);
                        if (var18 == null) {
                            arg0.method444(0, 128);
                        } else if (var18 instanceof Number) {
                            arg0.method444(1, 128);
                            arg0.method451(((Number) var18).longValue(), (byte) 113);
                        } else if (var18 instanceof String) {
                            arg0.method444(2, 128);
                            arg0.method510((String) var18, (byte) 61);
                        } else {
                            arg0.method444(4, arg1 + 149);
                        }
                    } else if (var7 == 4) {
                        Method var19 = (Method) var2.field2830[var6].field3638;
                        int var20 = var19.getModifiers();
                        arg0.method444(0, 128);
                        arg0.method473(70, var20);
                    }
                } catch (ClassNotFoundException var21) {
                    arg0.method444(-10, 128);
                } catch (InvalidClassException var22) {
                    arg0.method444(-11, 128);
                } catch (StreamCorruptedException var23) {
                    arg0.method444(-12, arg1 ^ -149);
                } catch (OptionalDataException var24) {
                    arg0.method444(-13, 128);
                } catch (IllegalAccessException var25) {
                    arg0.method444(-14, 128);
                } catch (IllegalArgumentException var26) {
                    arg0.method444(-15, 128);
                } catch (InvocationTargetException var27) {
                    arg0.method444(-16, 128);
                } catch (SecurityException var28) {
                    arg0.method444(-17, 128);
                } catch (IOException var29) {
                    arg0.method444(-18, 128);
                } catch (NullPointerException var30) {
                    arg0.method444(-19, 128);
                } catch (Exception var31) {
                    arg0.method444(-20, 128);
                } catch (Throwable var32) {
                    arg0.method444(-21, 128);
                }
            } else {
                arg0.method444(var2.field2827[var6], arg1 ^ 0xFFFFFF6B);
            }
        }
        arg0.method511(var5, (byte) -96);
        var2.method549(6410);
        if (arg1 != -21) {
            method560(null, 116);
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(JI)I", line = 200)
    public static final int method561(long arg0, int arg1) {
        field1099++;
        if (arg1 >= -91) {
            field1096 = -64;
        }
        class569.method3335(25856, arg0);
        return class614.field8252.get(1);
    }
}
