import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.OptionalDataException;
import java.io.StreamCorruptedException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jh")
public class class64 {

    @OriginalMember(owner = "client!jh", name = "c", descriptor = "Lce;")
    public static class126 field1081 = class206.method1445(-7923, "hitbar_default");

    @OriginalMember(owner = "client!jh", name = "i", descriptor = "I")
    public static int field1087 = 0;

    @OriginalMember(owner = "client!jh", name = "j", descriptor = "[J")
    public static long[] field1088 = new long[200];

    @OriginalMember(owner = "client!jh", name = "f", descriptor = "Lwd;")
    public static class112 field1084 = null;

    @OriginalMember(owner = "client!jh", name = "d", descriptor = "I")
    public static int field1082;

    @OriginalMember(owner = "client!jh", name = "e", descriptor = "I")
    public static int field1083;

    @OriginalMember(owner = "client!jh", name = "h", descriptor = "I")
    public static int field1086;

    @OriginalMember(owner = "client!jh", name = "k", descriptor = "I")
    public static int field1089;

    @OriginalMember(owner = "client!jh", name = "l", descriptor = "I")
    public static int field1090;

    @OriginalMember(owner = "client!jh", name = "b", descriptor = "Lp;")
    public static class85 field1080;

    @OriginalMember(owner = "client!jh", name = "g", descriptor = "Lqb;")
    public static class87 field1085;

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "[[[I")
    public static int[][][] field1079;

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(ILcc;ZILcc;)Lfd;", line = 6)
    public static final class219 method467(int arg0, class313 arg1, boolean arg2, int arg3, class313 arg4) {
        field1083++;
        int[] var5 = arg4.method2182(arg3, (byte) 90);
        boolean var6 = true;
        for (int var7 = arg0; var7 < var5.length; var7++) {
            byte[] var8 = arg4.method2187(arg3, var5[var7], 0);
            if (var8 == null) {
                var6 = false;
            } else {
                int var9 = var8[1] & 0xFF | (var8[0] & 0xFF) << 8;
                byte[] var10;
                if (arg2) {
                    var10 = arg1.method2187(0, var9, 0);
                } else {
                    var10 = arg1.method2187(var9, 0, 0);
                }
                if (var10 == null) {
                    var6 = false;
                }
            }
        }
        if (!var6) {
            return null;
        }
        try {
            return new class219(arg4, arg1, arg3, arg2);
        } catch (Exception var12) {
            return null;
        }
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(BI)I", line = 79)
    public static final int method468(byte arg0, int arg1) {
        if (arg0 >= -5) {
            field1081 = (class126) null;
        }
        field1089++;
        class176 var2 = class78.method557(arg1, (byte) -41);
        int var3 = var2.field3108;
        int var4 = var2.field3102;
        int var5 = var2.field3105;
        int var6 = class266.field4498[var4 - var3];
        return class138.field2462[var5] >> var3 & var6;
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(II)[B", line = 104)
    public static final byte[] method469(int arg0, int arg1) {
        field1086++;
        if (arg1 > -72) {
            field1084 = (class112) null;
        }
        class177 var2 = (class177) class14.field190.method303((long) arg0, 0);
        if (var2 == null) {
            byte[] var3 = new byte[512];
            Random var4 = new Random((long) arg0);
            for (int var5 = 0; var5 < 255; var5++) {
                var3[var5] = (byte) var5;
            }
            for (int var6 = 0; var6 < 255; var6++) {
                int var7 = 255 - var6;
                int var8 = class244.method1675(var4, (byte) 110, var7);
                byte var9 = var3[var8];
                var3[var8] = var3[var7];
                var3[var7] = var3[511 - var6] = var9;
            }
            var2 = new class177(var3);
            class14.field190.method308(var2, (long) arg0, (byte) 121);
        }
        return var2.field3124;
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "([IIIIII)V", line = 152)
    public static final void method470(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class5 var6 = class297.field4940[arg3][arg4][arg5];
        if (var6 == null) {
            return;
        }
        class260 var7 = var6.field43;
        if (var7 != null) {
            int var8 = var7.field4367;
            if (var8 != 0) {
                for (int var9 = 0; var9 < 4; var9++) {
                    arg0[arg1] = var8;
                    arg0[arg1 + 1] = var8;
                    arg0[arg1 + 2] = var8;
                    arg0[arg1 + 3] = var8;
                    arg1 += arg2;
                }
            }
            return;
        }
        class77 var10 = var6.field44;
        if (var10 == null) {
            return;
        }
        int var11 = var10.field1256;
        int var12 = var10.field1266;
        int var13 = var10.field1250;
        int var14 = var10.field1249;
        int[] var15 = class183.field3194[var11];
        int[] var16 = class317.field5440[var12];
        int var17 = 0;
        if (var13 != 0) {
            for (int var18 = 0; var18 < 4; var18++) {
                arg0[arg1] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg0[arg1 + 1] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg0[arg1 + 2] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg0[arg1 + 3] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg1 += arg2;
            }
            return;
        }
        for (int var19 = 0; var19 < 4; var19++) {
            if (var15[var16[var17++]] != 0) {
                arg0[arg1] = var14;
            }
            if (var15[var16[var17++]] != 0) {
                arg0[arg1 + 1] = var14;
            }
            if (var15[var16[var17++]] != 0) {
                arg0[arg1 + 2] = var14;
            }
            if (var15[var16[var17++]] != 0) {
                arg0[arg1 + 3] = var14;
            }
            arg1 += arg2;
        }
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(Loh;IB)V", line = 269)
    public static final void method471(class169 arg0, int arg1, byte arg2) {
        if (arg2 != 25) {
            method469(-42, 118);
        }
        field1082++;
        while (true) {
            class202 var3 = (class202) class57.field890.method898((byte) -91);
            if (var3 == null) {
                return;
            }
            boolean var4 = false;
            for (int var5 = 0; var5 < var3.field3460; var5++) {
                if (var3.field3455[var5] != null) {
                    if (var3.field3455[var5].field965 == 2) {
                        var3.field3457[var5] = -5;
                    }
                    if (var3.field3455[var5].field965 == 0) {
                        var4 = true;
                    }
                }
                if (var3.field3454[var5] != null) {
                    if (var3.field3454[var5].field965 == 2) {
                        var3.field3457[var5] = -6;
                    }
                    if (var3.field3454[var5].field965 == 0) {
                        var4 = true;
                    }
                }
            }
            if (var4) {
                return;
            }
            arg0.method1238(arg1, 109);
            arg0.method933(arg2 ^ 0xFFFFFFE4, 0);
            int var6 = arg0.field2299;
            arg0.method947(var3.field3461, (byte) 117);
            for (int var7 = 0; var7 < var3.field3460; var7++) {
                if (var3.field3457[var7] == 0) {
                    try {
                        int var8 = var3.field3464[var7];
                        if (var8 == 0) {
                            Field var12 = (Field) var3.field3455[var7].field967;
                            int var13 = var12.getInt((Object) null);
                            arg0.method933(arg2 - 28, 0);
                            arg0.method947(var13, (byte) 99);
                        } else if (var8 == 1) {
                            Field var9 = (Field) var3.field3455[var7].field967;
                            var9.setInt((Object) null, var3.field3451[var7]);
                            arg0.method933(-3, 0);
                        } else if (var8 == 2) {
                            Field var10 = (Field) var3.field3455[var7].field967;
                            int var11 = var10.getModifiers();
                            arg0.method933(-3, 0);
                            arg0.method947(var11, (byte) 127);
                        }
                        if (var8 == 3) {
                            Method var14 = (Method) var3.field3454[var7].field967;
                            byte[][] var15 = var3.field3458[var7];
                            Object[] var16 = new Object[var15.length];
                            for (int var17 = 0; var17 < var15.length; var17++) {
                                ObjectInputStream var18 = new ObjectInputStream(new ByteArrayInputStream(var15[var17]));
                                var16[var17] = var18.readObject();
                            }
                            Object var19 = var14.invoke((Object) null, var16);
                            if (var19 == null) {
                                arg0.method933(arg2 ^ 0xFFFFFFE4, 0);
                            } else if (var19 instanceof Number) {
                                arg0.method933(-3, 1);
                                arg0.method962(-123, ((Number) var19).longValue());
                            } else if ((var19 instanceof class126)) {
                                arg0.method933(-3, 2);
                                arg0.method980((class126) var19, true);
                            } else {
                                arg0.method933(-3, 4);
                            }
                        } else if (var8 == 4) {
                            Method var20 = (Method) var3.field3454[var7].field967;
                            int var21 = var20.getModifiers();
                            arg0.method933(-3, 0);
                            arg0.method947(var21, (byte) 113);
                        }
                    } catch (ClassNotFoundException var34) {
                        arg0.method933(-3, -10);
                    } catch (InvalidClassException var35) {
                        arg0.method933(-3, -11);
                    } catch (StreamCorruptedException var36) {
                        arg0.method933(-3, -12);
                    } catch (OptionalDataException var37) {
                        arg0.method933(arg2 ^ 0xFFFFFFE4, -13);
                    } catch (IllegalAccessException var38) {
                        arg0.method933(-3, -14);
                    } catch (IllegalArgumentException var39) {
                        arg0.method933(-3, -15);
                    } catch (InvocationTargetException var40) {
                        arg0.method933(arg2 - 28, -16);
                    } catch (SecurityException var41) {
                        arg0.method933(-3, -17);
                    } catch (IOException var42) {
                        arg0.method933(arg2 ^ 0xFFFFFFE4, -18);
                    } catch (NullPointerException var43) {
                        arg0.method933(-3, -19);
                    } catch (Exception var44) {
                        arg0.method933(-3, -20);
                    } catch (Throwable var45) {
                        arg0.method933(-3, -21);
                    }
                } else {
                    arg0.method933(-3, var3.field3457[var7]);
                }
            }
            arg0.method934(var6, -112);
            arg0.method952(arg0.field2299 - var6, arg2 ^ 0x6D);
            var3.method499((byte) 64);
        }
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(Z)V", line = 468)
    public static void method472(boolean arg0) {
        field1084 = null;
        field1081 = null;
        field1079 = (int[][][]) null;
        field1085 = null;
        field1088 = null;
        if (arg0) {
            field1085 = (class87) null;
        }
        field1080 = null;
    }
}
