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

@OriginalClass("client!da")
public class class181 extends class241 {

    @OriginalMember(owner = "client!da", name = "p", descriptor = "[B")
    public byte[] field3286;

    @OriginalMember(owner = "client!da", name = "o", descriptor = "Loh;")
    public static class263 field3285 = class253.method1681(-118, "Mem:");

    @OriginalMember(owner = "client!da", name = "n", descriptor = "I")
    public static int field3284 = 0;

    @OriginalMember(owner = "client!da", name = "t", descriptor = "S")
    public static short field3290 = 320;

    @OriginalMember(owner = "client!da", name = "z", descriptor = "[I")
    public static int[] field3296 = new int[128];

    @OriginalMember(owner = "client!da", name = "v", descriptor = "I")
    public static int field3292;

    @OriginalMember(owner = "client!da", name = "x", descriptor = "I")
    public static int field3294;

    @OriginalMember(owner = "client!da", name = "y", descriptor = "I")
    public static int field3295;

    @OriginalMember(owner = "client!da", name = "q", descriptor = "Lw;")
    public static class141 field3287;

    @OriginalMember(owner = "client!da", name = "r", descriptor = "Lue;")
    public static class86 field3288;

    @OriginalMember(owner = "client!da", name = "s", descriptor = "[I")
    public static int[] field3289;

    @OriginalMember(owner = "client!da", name = "u", descriptor = "[I")
    public static int[] field3291;

    @OriginalMember(owner = "client!da", name = "w", descriptor = "[Lbb;")
    public static class88[] field3293;

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(B)V")
    public static void method1208(byte arg0) {
        field3293 = null;
        field3296 = null;
        field3287 = null;
        field3289 = null;
        if (arg0 == -54) {
            field3288 = null;
            field3285 = null;
            field3291 = null;
        }
    }

    @OriginalMember(owner = "client!da", name = "<init>", descriptor = "([B)V")
    public class181(byte[] arg0) {
        this.field3286 = arg0;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Lal;BI)V")
    public static final void method1209(class223 arg0, byte arg1, int arg2) {
        field3295++;
        if (arg1 != -51) {
            method1209((class223) null, (byte) -6, 42);
        }
        while (true) {
            class111 var3 = (class111) class214.field3807.method1878(true);
            if (var3 == null) {
                return;
            }
            boolean var4 = false;
            for (int var5 = 0; var5 < var3.field2086; var5++) {
                if (var3.field2085[var5] != null) {
                    if (var3.field2085[var5].field4114 == 2) {
                        var3.field2089[var5] = -5;
                    }
                    if (var3.field2085[var5].field4114 == 0) {
                        var4 = true;
                    }
                }
                if (var3.field2092[var5] != null) {
                    if (var3.field2092[var5].field4114 == 2) {
                        var3.field2089[var5] = -6;
                    }
                    if (var3.field2092[var5].field4114 == 0) {
                        var4 = true;
                    }
                }
            }
            if (var4) {
                return;
            }
            arg0.method1516(120, arg2);
            arg0.method1288((byte) -87, 0);
            int var6 = arg0.field3497;
            arg0.method1286(arg1 ^ 0x2DE9, var3.field2082);
            for (int var7 = 0; var7 < var3.field2086; var7++) {
                if (var3.field2089[var7] == 0) {
                    try {
                        int var8 = var3.field2083[var7];
                        if (var8 == 0) {
                            Field var9 = (Field) var3.field2085[var7].field4117;
                            int var10 = var9.getInt((Object) null);
                            arg0.method1288((byte) -34, 0);
                            arg0.method1286(-11740, var10);
                        } else if (var8 == 1) {
                            Field var11 = (Field) var3.field2085[var7].field4117;
                            var11.setInt((Object) null, var3.field2091[var7]);
                            arg0.method1288((byte) -59, 0);
                        } else if (var8 == 2) {
                            Field var12 = (Field) var3.field2085[var7].field4117;
                            int var13 = var12.getModifiers();
                            arg0.method1288((byte) -88, 0);
                            arg0.method1286(-11740, var13);
                        }
                        if (var8 == 3) {
                            Method var16 = (Method) var3.field2092[var7].field4117;
                            byte[][] var17 = var3.field2087[var7];
                            Object[] var18 = new Object[var17.length];
                            for (int var19 = 0; var19 < var17.length; var19++) {
                                ObjectInputStream var20 = new ObjectInputStream(new ByteArrayInputStream(var17[var19]));
                                var18[var19] = var20.readObject();
                            }
                            Object var21 = var16.invoke((Object) null, var18);
                            if (var21 == null) {
                                arg0.method1288((byte) -33, 0);
                            } else if ((var21 instanceof Number)) {
                                arg0.method1288((byte) -94, 1);
                                arg0.method1272((byte) 56, ((Number) var21).longValue());
                            } else if ((var21 instanceof class263)) {
                                arg0.method1288((byte) -110, 2);
                                arg0.method1312(-112, (class263) var21);
                            } else {
                                arg0.method1288((byte) -77, 4);
                            }
                        } else if (var8 == 4) {
                            Method var14 = (Method) var3.field2092[var7].field4117;
                            int var15 = var14.getModifiers();
                            arg0.method1288((byte) -45, 0);
                            arg0.method1286(-11740, var15);
                        }
                    } catch (ClassNotFoundException var22) {
                        arg0.method1288((byte) -68, -10);
                    } catch (InvalidClassException var23) {
                        arg0.method1288((byte) -45, -11);
                    } catch (StreamCorruptedException var24) {
                        arg0.method1288((byte) -92, -12);
                    } catch (OptionalDataException var25) {
                        arg0.method1288((byte) -84, -13);
                    } catch (IllegalAccessException var26) {
                        arg0.method1288((byte) -102, -14);
                    } catch (IllegalArgumentException var27) {
                        arg0.method1288((byte) -76, -15);
                    } catch (InvocationTargetException var28) {
                        arg0.method1288((byte) -17, -16);
                    } catch (SecurityException var29) {
                        arg0.method1288((byte) -68, -17);
                    } catch (IOException var30) {
                        arg0.method1288((byte) -119, -18);
                    } catch (NullPointerException var31) {
                        arg0.method1288((byte) -12, -19);
                    } catch (Exception var32) {
                        arg0.method1288((byte) -44, -20);
                    } catch (Throwable var33) {
                        arg0.method1288((byte) -100, -21);
                    }
                } else {
                    arg0.method1288((byte) -32, var3.field2089[var7]);
                }
            }
            arg0.method1291(346094688, var6);
            arg0.method1285((byte) -120, arg0.field3497 - var6);
            var3.method1614(-1204826926);
        }
    }
}
