import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.OptionalDataException;
import java.io.StreamCorruptedException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!th")
public class class179 {

    @OriginalMember(owner = "client!th", name = "b", descriptor = "Lsg;")
    private static class169 field3482 = class165.method1060("Loading fonts )2 ", 1536);

    @OriginalMember(owner = "client!th", name = "h", descriptor = "Lsg;")
    public static class169 field3488 = class165.method1060(" )2> <col=00ffff>", 1536);

    @OriginalMember(owner = "client!th", name = "f", descriptor = "Lsg;")
    public static class169 field3486 = field3482;

    @OriginalMember(owner = "client!th", name = "a", descriptor = "Ljava/util/zip/CRC32;")
    public static CRC32 field3481 = new CRC32();

    @OriginalMember(owner = "client!th", name = "j", descriptor = "Lua;")
    public static class181 field3490 = new class181(200);

    @OriginalMember(owner = "client!th", name = "k", descriptor = "[Lwh;")
    public static class206[] field3491 = new class206[16];

    @OriginalMember(owner = "client!th", name = "c", descriptor = "I")
    public static int field3483;

    @OriginalMember(owner = "client!th", name = "d", descriptor = "I")
    public static int field3484;

    @OriginalMember(owner = "client!th", name = "e", descriptor = "I")
    public static int field3485;

    @OriginalMember(owner = "client!th", name = "g", descriptor = "I")
    public static int field3487;

    @OriginalMember(owner = "client!th", name = "i", descriptor = "I")
    public static int field3489;

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(B)V")
    public static void method1189(byte arg0) {
        field3486 = null;
        field3491 = null;
        if (arg0 != -1) {
            method1189((byte) -18);
        }
        field3488 = null;
        field3490 = null;
        field3482 = null;
        field3481 = null;
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(ILoa;)V")
    public static final void method1190(int arg0, class127 arg1) {
        if (arg0 != 20083) {
            field3490 = null;
        }
        byte[] var2 = new byte[24];
        field3484++;
        if (class181.field3531 != null) {
            try {
                int var3 = 0;
                class181.field3531.method1342(0L, false);
                class181.field3531.method1332(var2, (byte) -33);
                while (var3 < 24 && var2[var3] == 0) {
                    var3++;
                }
                if (var3 >= 24) {
                    throw new IOException();
                }
            } catch (Exception var5) {
                for (int var4 = 0; var4 < 24; var4++) {
                    var2[var4] = -1;
                }
            }
        }
        arg1.method772(true, var2, 24, 0);
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(IBLrg;)V")
    public static final void method1191(int arg0, byte arg1, class160 arg2) {
        if (arg1 >= -70) {
            field3488 = null;
        }
        field3483++;
        while (true) {
            class90 var3 = (class90) class13.field297.method145(0);
            if (var3 == null) {
                return;
            }
            boolean var4 = false;
            for (int var5 = 0; var5 < var3.field1632; var5++) {
                if (var3.field1630[var5] != null) {
                    if (var3.field1630[var5].field3296 == 2) {
                        var3.field1636[var5] = -5;
                    }
                    if (var3.field1630[var5].field3296 == 0) {
                        var4 = true;
                    }
                }
                if (var3.field1642[var5] != null) {
                    if (var3.field1642[var5].field3296 == 2) {
                        var3.field1636[var5] = -6;
                    }
                    if (var3.field1642[var5].field3296 == 0) {
                        var4 = true;
                    }
                }
            }
            if (var4) {
                return;
            }
            arg2.method1024(arg0, (byte) -94);
            arg2.method821(0, 64);
            int var6 = arg2.field2346;
            arg2.method802((byte) 64, var3.field1634);
            for (int var7 = 0; var7 < var3.field1632; var7++) {
                if (var3.field1636[var7] == 0) {
                    try {
                        int var8 = var3.field1631[var7];
                        if (var8 == 0) {
                            Field var12 = (Field) var3.field1630[var7].field3299;
                            int var13 = var12.getInt(null);
                            arg2.method821(0, 64);
                            arg2.method802((byte) 64, var13);
                        } else if (var8 == 1) {
                            Field var11 = (Field) var3.field1630[var7].field3299;
                            var11.setInt(null, var3.field1639[var7]);
                            arg2.method821(0, 64);
                        } else if (var8 == 2) {
                            Field var9 = (Field) var3.field1630[var7].field3299;
                            int var10 = var9.getModifiers();
                            arg2.method821(0, 64);
                            arg2.method802((byte) 64, var10);
                        }
                        if (var8 == 3) {
                            Method var14 = (Method) var3.field1642[var7].field3299;
                            byte[][] var15 = var3.field1649[var7];
                            Object[] var16 = new Object[var15.length];
                            for (int var17 = 0; var17 < var15.length; var17++) {
                                ObjectInputStream var18 = new ObjectInputStream(new ByteArrayInputStream(var15[var17]));
                                var16[var17] = var18.readObject();
                            }
                            Object var19 = var14.invoke(null, var16);
                            if (var19 == null) {
                                arg2.method821(0, 64);
                            } else if (var19 instanceof Number) {
                                arg2.method821(1, 64);
                                arg2.method816(((Number) var19).longValue(), -16701);
                            } else if (var19 instanceof class169) {
                                arg2.method821(2, 64);
                                arg2.method799((class169) var19, (byte) 0);
                            } else {
                                arg2.method821(4, 64);
                            }
                        } else if (var8 == 4) {
                            Method var20 = (Method) var3.field1642[var7].field3299;
                            int var21 = var20.getModifiers();
                            arg2.method821(0, 64);
                            arg2.method802((byte) 64, var21);
                        }
                    } catch (ClassNotFoundException var22) {
                        arg2.method821(-10, 64);
                    } catch (InvalidClassException var23) {
                        arg2.method821(-11, 64);
                    } catch (StreamCorruptedException var24) {
                        arg2.method821(-12, 64);
                    } catch (OptionalDataException var25) {
                        arg2.method821(-13, 64);
                    } catch (IllegalAccessException var26) {
                        arg2.method821(-14, 64);
                    } catch (IllegalArgumentException var27) {
                        arg2.method821(-15, 64);
                    } catch (InvocationTargetException var28) {
                        arg2.method821(-16, 64);
                    } catch (SecurityException var29) {
                        arg2.method821(-17, 64);
                    } catch (IOException var30) {
                        arg2.method821(-18, 64);
                    } catch (NullPointerException var31) {
                        arg2.method821(-19, 64);
                    } catch (Exception var32) {
                        arg2.method821(-20, 64);
                    } catch (Throwable var33) {
                        arg2.method821(-21, 64);
                    }
                } else {
                    arg2.method821(var3.field1636[var7], 64);
                }
            }
            arg2.method826(118, var6);
            arg2.method803(arg2.field2346 - var6, 477567000);
            var3.method1213(9104);
        }
    }

    @OriginalMember(owner = "client!th", name = "b", descriptor = "(B)V")
    public static final void method1192(byte arg0) {
        int var1 = 95 % ((-arg0 - 12) / 33);
        for (class80 var2 = (class80) class202.field3948.method1042((byte) 104); var2 != null; var2 = (class80) class202.field3948.method1047((byte) 64)) {
            int var3 = var2.field1475;
            if (class44.method280(var3, true)) {
                boolean var4 = true;
                class150[] var5 = class142.field2647[var3];
                for (int var6 = 0; var6 < var5.length; var6++) {
                    if (var5[var6] != null) {
                        var4 = var5[var6].field2778;
                        break;
                    }
                }
                if (!var4) {
                    int var7 = (int) var2.field3543;
                    class150 var8 = class62.method385((byte) 41, var7);
                    if (var8 != null) {
                        class64.method404(98, var8);
                    }
                }
            }
        }
        field3487++;
    }
}
