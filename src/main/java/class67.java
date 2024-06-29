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

@OriginalClass("client!ea")
public class class67 extends class115 {

    @OriginalMember(owner = "client!ea", name = "H", descriptor = "Lgg;")
    public class203 field1205;

    @OriginalMember(owner = "client!ea", name = "O", descriptor = "[S")
    public static short[] field1211 = new short[256];

    @OriginalMember(owner = "client!ea", name = "K", descriptor = "Luh;")
    public static class198 field1207 = new class198();

    @OriginalMember(owner = "client!ea", name = "T", descriptor = "Z")
    public static boolean field1216 = true;

    @OriginalMember(owner = "client!ea", name = "Q", descriptor = "I")
    public static int field1213 = 0;

    @OriginalMember(owner = "client!ea", name = "S", descriptor = "Lub;")
    public static class227 field1215 = class257.method1749("Welt", 17263);

    @OriginalMember(owner = "client!ea", name = "G", descriptor = "I")
    public static int field1204;

    @OriginalMember(owner = "client!ea", name = "I", descriptor = "I")
    public static int field1206;

    @OriginalMember(owner = "client!ea", name = "L", descriptor = "I")
    public static int field1208;

    @OriginalMember(owner = "client!ea", name = "M", descriptor = "I")
    public static int field1209;

    @OriginalMember(owner = "client!ea", name = "N", descriptor = "I")
    public static int field1210;

    @OriginalMember(owner = "client!ea", name = "P", descriptor = "I")
    public static int field1212;

    @OriginalMember(owner = "client!ea", name = "R", descriptor = "[Lnf;")
    public static class213[] field1214;

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(IZ[BI)Z")
    public static final boolean method416(int arg0, boolean arg1, byte[] arg2, int arg3) {
        field1210++;
        boolean var4 = true;
        class226 var5 = new class226(arg2);
        int var6 = -1;
        label58: while (true) {
            int var7 = var5.method1474(109);
            if (var7 == 0) {
                if (arg1) {
                    return true;
                }
                return var4;
            }
            var6 += var7;
            int var8 = 0;
            boolean var9 = false;
            while (true) {
                while (!var9) {
                    int var11 = var5.method1467(false);
                    if (var11 == 0) {
                        continue label58;
                    }
                    var8 += var11 - 1;
                    int var12 = var8 & 0x3F;
                    int var13 = var8 >> 6 & 0x3F;
                    int var14 = var5.method1471(255) >> 2;
                    int var15 = var13 + arg0;
                    int var16 = var12 + arg3;
                    if (var15 > 0 && var16 > 0 && var15 < 103 && var16 < 103) {
                        class45 var17 = class220.method1389(var6, (byte) 84);
                        if (var14 != 22 || class254.field4463 || var17.field793 != 0 || var17.field795 == 1 || var17.field740) {
                            var9 = true;
                            if (!var17.method245(-126)) {
                                class211.field3569++;
                                var4 = false;
                            }
                        }
                    }
                }
                int var10 = var5.method1467(arg1);
                if (var10 == 0) {
                    break;
                }
                var5.method1471(255);
            }
        }
    }

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "(I)V")
    public static final void method417(int arg0) {
        class225.field3839++;
        if (arg0 >= -15) {
            field1214 = null;
        }
        field1209++;
    }

    @OriginalMember(owner = "client!ea", name = "c", descriptor = "(Z)V")
    public static void method418(boolean arg0) {
        if (!arg0) {
            field1211 = null;
            field1215 = null;
            field1214 = null;
            field1207 = null;
        }
    }

    @OriginalMember(owner = "client!ea", name = "<init>", descriptor = "(Lgg;)V")
    public class67(class203 arg0) {
        this.field1205 = arg0;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(Lnj;I)Lub;")
    public static final class227 method419(class226 arg0, int arg1) {
        field1208++;
        if (arg1 != -27885) {
            method419((class226) null, 84);
        }
        return class249.method1670(32767, -27760, arg0);
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(Lgh;II)V")
    public static final void method420(class106 arg0, int arg1, int arg2) {
        if (arg2 != 0) {
            return;
        }
        field1206++;
        while (true) {
            class261 var3 = (class261) class213.field3602.method1277(99);
            if (var3 == null) {
                return;
            }
            boolean var4 = false;
            for (int var5 = 0; var5 < var3.field4545; var5++) {
                if (var3.field4547[var5] != null) {
                    if (var3.field4547[var5].field1302 == 2) {
                        var3.field4549[var5] = -5;
                    }
                    if (var3.field4547[var5].field1302 == 0) {
                        var4 = true;
                    }
                }
                if (var3.field4550[var5] != null) {
                    if (var3.field4550[var5].field1302 == 2) {
                        var3.field4549[var5] = -6;
                    }
                    if (var3.field4550[var5].field1302 == 0) {
                        var4 = true;
                    }
                }
            }
            if (var4) {
                return;
            }
            arg0.method664((byte) -110, arg1);
            arg0.method1443(0, 0);
            int var6 = arg0.field3879;
            arg0.method1427(var3.field4546, (byte) -22);
            for (int var7 = 0; var7 < var3.field4545; var7++) {
                if (var3.field4549[var7] == 0) {
                    try {
                        int var8 = var3.field4548[var7];
                        if (var8 == 0) {
                            Field var9 = (Field) var3.field4547[var7].field1299;
                            int var10 = var9.getInt((Object) null);
                            arg0.method1443(0, 0);
                            arg0.method1427(var10, (byte) 68);
                        } else if (var8 == 1) {
                            Field var11 = (Field) var3.field4547[var7].field1299;
                            var11.setInt((Object) null, var3.field4551[var7]);
                            arg0.method1443(0, 0);
                        } else if (var8 == 2) {
                            Field var12 = (Field) var3.field4547[var7].field1299;
                            int var13 = var12.getModifiers();
                            arg0.method1443(0, 0);
                            arg0.method1427(var13, (byte) 55);
                        }
                        if (var8 == 3) {
                            byte[][] var16 = var3.field4541[var7];
                            Method var17 = (Method) var3.field4550[var7].field1299;
                            Object[] var18 = new Object[var16.length];
                            for (int var19 = 0; var19 < var16.length; var19++) {
                                ObjectInputStream var20 = new ObjectInputStream(new ByteArrayInputStream(var16[var19]));
                                var18[var19] = var20.readObject();
                            }
                            Object var21 = var17.invoke((Object) null, var18);
                            if (var21 == null) {
                                arg0.method1443(0, 0);
                            } else if ((var21 instanceof Number)) {
                                arg0.method1443(1, 0);
                                arg0.method1457(((Number) var21).longValue(), 80);
                            } else if ((var21 instanceof class227)) {
                                arg0.method1443(2, 0);
                                arg0.method1452((class227) var21, (byte) -63);
                            } else {
                                arg0.method1443(4, 0);
                            }
                        } else if (var8 == 4) {
                            Method var14 = (Method) var3.field4550[var7].field1299;
                            int var15 = var14.getModifiers();
                            arg0.method1443(0, 0);
                            arg0.method1427(var15, (byte) -18);
                        }
                    } catch (ClassNotFoundException var22) {
                        arg0.method1443(-10, 0);
                    } catch (InvalidClassException var23) {
                        arg0.method1443(-11, 0);
                    } catch (StreamCorruptedException var24) {
                        arg0.method1443(-12, 0);
                    } catch (OptionalDataException var25) {
                        arg0.method1443(-13, 0);
                    } catch (IllegalAccessException var26) {
                        arg0.method1443(-14, 0);
                    } catch (IllegalArgumentException var27) {
                        arg0.method1443(-15, 0);
                    } catch (InvocationTargetException var28) {
                        arg0.method1443(-16, 0);
                    } catch (SecurityException var29) {
                        arg0.method1443(-17, 0);
                    } catch (IOException var30) {
                        arg0.method1443(-18, 0);
                    } catch (NullPointerException var31) {
                        arg0.method1443(-19, 0);
                    } catch (Exception var32) {
                        arg0.method1443(-20, 0);
                    } catch (Throwable var33) {
                        arg0.method1443(-21, 0);
                    }
                } else {
                    arg0.method1443(var3.field4549[var7], 0);
                }
            }
            arg0.method1470(var6, false);
            arg0.method1464(arg0.field3879 - var6, 0);
            var3.method369(-75);
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(ILqe;IIIZ)V")
    public static final void method421(int arg0, class51 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        field1204++;
        if (class144.field2478 >= 50 || arg1.field887 == null || arg1.field887.length <= arg4 || arg1.field887[arg4] == null) {
            return;
        }
        int var6 = arg1.field887[arg4][0];
        int var7 = var6 >> 4 & 0x7;
        int var8 = var6 >> 8;
        int var9 = var6 & 0xF;
        if (arg1.field887[arg4].length > 1) {
            int var10 = (int) ((double) arg1.field887[arg4].length * Math.random());
            if (var10 > 0) {
                var8 = arg1.field887[arg4][var10];
            }
        }
        if (var9 == 0) {
            if (arg5) {
                class72.method435(var8, (byte) -116, 0, var7);
            }
        } else if (class248.field4311 != 0) {
            class130.field2281[class144.field2478] = var8;
            int var11 = (arg3 - 64) / arg0;
            class221.field3747[class144.field2478] = var7;
            class236.field4101[class144.field2478] = 0;
            int var12 = (arg2 - 64) / 128;
            class22.field384[class144.field2478] = null;
            class34.field585[class144.field2478] = (var11 << 16) + (var12 << 8) + var9;
            class144.field2478++;
        }
    }
}
