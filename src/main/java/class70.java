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

@OriginalClass("client!hj")
public class class70 {

    @OriginalMember(owner = "client!hj", name = "e", descriptor = "S")
    public static short field1246 = 1;

    @OriginalMember(owner = "client!hj", name = "m", descriptor = "I")
    public static int field1254 = 0;

    @OriginalMember(owner = "client!hj", name = "g", descriptor = "Lqk;")
    public static class207 field1248 = class24.method212(255, "clignotant1:");

    @OriginalMember(owner = "client!hj", name = "i", descriptor = "Lqk;")
    public static class207 field1250 = class24.method212(255, "Vous ne pouvez pas ajouter votre nom -9 votre liste noire)3");

    @OriginalMember(owner = "client!hj", name = "n", descriptor = "[I")
    public static int[] field1255 = new int[14];

    @OriginalMember(owner = "client!hj", name = "h", descriptor = "Lqk;")
    public static class207 field1249 = class24.method212(255, "Sprites charg-Bs");

    @OriginalMember(owner = "client!hj", name = "c", descriptor = "Lpj;")
    public static class247 field1244 = new class247();

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "I")
    public static int field1242;

    @OriginalMember(owner = "client!hj", name = "b", descriptor = "I")
    public static int field1243;

    @OriginalMember(owner = "client!hj", name = "f", descriptor = "I")
    public static int field1247;

    @OriginalMember(owner = "client!hj", name = "j", descriptor = "I")
    public static int field1251;

    @OriginalMember(owner = "client!hj", name = "k", descriptor = "I")
    public static int field1252;

    @OriginalMember(owner = "client!hj", name = "l", descriptor = "I")
    public static int field1253;

    @OriginalMember(owner = "client!hj", name = "o", descriptor = "I")
    public static int field1256;

    @OriginalMember(owner = "client!hj", name = "p", descriptor = "I")
    public static int field1257;

    @OriginalMember(owner = "client!hj", name = "d", descriptor = "Lmd;")
    public static class220 field1245;

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(BLpk;)V")
    public static final void method505(byte arg0, class99 arg1) {
        field1247++;
        class144.field2489 = arg1;
        if (arg0 != -85) {
            field1244 = null;
        }
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(IB)[B")
    public static final synchronized byte[] method506(int arg0, byte arg1) {
        field1257++;
        if (arg0 == 100 && class55.field1021 > 0) {
            byte[] var2 = class83.field1523[--class55.field1021];
            class83.field1523[class55.field1021] = null;
            return var2;
        } else if (arg0 == 5000 && class277.field4871 > 0) {
            byte[] var3 = class228.field4185[--class277.field4871];
            class228.field4185[class277.field4871] = null;
            return var3;
        } else {
            if (arg1 != 13) {
                field1246 = 17;
            }
            if (arg0 == 30000 && class191.field3379 > 0) {
                byte[] var4 = class188.field3329[--class191.field3379];
                class188.field3329[class191.field3379] = null;
                return var4;
            } else {
                return new byte[arg0];
            }
        }
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(Lke;II)V")
    public static final void method507(class107 arg0, int arg1, int arg2) {
        if (arg1 < 22) {
            return;
        }
        field1256++;
        while (true) {
            class31 var3 = (class31) class125.field2178.method922((byte) 39);
            if (var3 == null) {
                return;
            }
            boolean var4 = false;
            for (int var5 = 0; var5 < var3.field636; var5++) {
                if (var3.field640[var5] != null) {
                    if (var3.field640[var5].field1696 == 2) {
                        var3.field635[var5] = -5;
                    }
                    if (var3.field640[var5].field1696 == 0) {
                        var4 = true;
                    }
                }
                if (var3.field631[var5] != null) {
                    if (var3.field631[var5].field1696 == 2) {
                        var3.field635[var5] = -6;
                    }
                    if (var3.field631[var5].field1696 == 0) {
                        var4 = true;
                    }
                }
            }
            if (var4) {
                return;
            }
            arg0.method767(arg2, (byte) 87);
            arg0.method1041(true, 0);
            int var6 = arg0.field2593;
            arg0.method1068(var3.field621, 126);
            for (int var7 = 0; var7 < var3.field636; var7++) {
                if (var3.field635[var7] == 0) {
                    try {
                        int var8 = var3.field628[var7];
                        if (var8 == 0) {
                            Field var12 = (Field) var3.field640[var7].field1699;
                            int var13 = var12.getInt((Object) null);
                            arg0.method1041(true, 0);
                            arg0.method1068(var13, 118);
                        } else if (var8 == 1) {
                            Field var9 = (Field) var3.field640[var7].field1699;
                            var9.setInt((Object) null, var3.field637[var7]);
                            arg0.method1041(true, 0);
                        } else if (var8 == 2) {
                            Field var10 = (Field) var3.field640[var7].field1699;
                            int var11 = var10.getModifiers();
                            arg0.method1041(true, 0);
                            arg0.method1068(var11, 115);
                        }
                        if (var8 == 3) {
                            Method var14 = (Method) var3.field631[var7].field1699;
                            byte[][] var15 = var3.field634[var7];
                            Object[] var16 = new Object[var15.length];
                            for (int var17 = 0; var17 < var15.length; var17++) {
                                ObjectInputStream var18 = new ObjectInputStream(new ByteArrayInputStream(var15[var17]));
                                var16[var17] = var18.readObject();
                            }
                            Object var19 = var14.invoke((Object) null, var16);
                            if (var19 == null) {
                                arg0.method1041(true, 0);
                            } else if ((var19 instanceof Number)) {
                                arg0.method1041(true, 1);
                                arg0.method1048((byte) 87, ((Number) var19).longValue());
                            } else if ((var19 instanceof class207)) {
                                arg0.method1041(true, 2);
                                arg0.method1040(true, (class207) var19);
                            } else {
                                arg0.method1041(true, 4);
                            }
                        } else if (var8 == 4) {
                            Method var20 = (Method) var3.field631[var7].field1699;
                            int var21 = var20.getModifiers();
                            arg0.method1041(true, 0);
                            arg0.method1068(var21, 118);
                        }
                    } catch (ClassNotFoundException var22) {
                        arg0.method1041(true, -10);
                    } catch (InvalidClassException var23) {
                        arg0.method1041(true, -11);
                    } catch (StreamCorruptedException var24) {
                        arg0.method1041(true, -12);
                    } catch (OptionalDataException var25) {
                        arg0.method1041(true, -13);
                    } catch (IllegalAccessException var26) {
                        arg0.method1041(true, -14);
                    } catch (IllegalArgumentException var27) {
                        arg0.method1041(true, -15);
                    } catch (InvocationTargetException var28) {
                        arg0.method1041(true, -16);
                    } catch (SecurityException var29) {
                        arg0.method1041(true, -17);
                    } catch (IOException var30) {
                        arg0.method1041(true, -18);
                    } catch (NullPointerException var31) {
                        arg0.method1041(true, -19);
                    } catch (Exception var32) {
                        arg0.method1041(true, -20);
                    } catch (Throwable var33) {
                        arg0.method1041(true, -21);
                    }
                } else {
                    arg0.method1041(true, var3.field635[var7]);
                }
            }
            arg0.method1044(var6, -519731256);
            arg0.method1074(arg0.field2593 - var6, 2022405415);
            var3.method1346((byte) -16);
        }
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(III)I")
    public static final int method508(int arg0, int arg1, int arg2) {
        field1251++;
        if (arg1 == -1) {
            return 12345678;
        }
        int var3 = (arg1 & 0x7F) * arg2 >> 7;
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        if (arg0 != -1563918489) {
            method505((byte) 20, (class99) null);
        }
        return (arg1 & 0xFF80) + var3;
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(B)V")
    public static void method509(byte arg0) {
        field1249 = null;
        field1244 = null;
        if (arg0 <= -102) {
            field1255 = null;
            field1250 = null;
            field1248 = null;
            field1245 = null;
        }
    }
}
