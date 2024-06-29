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

@OriginalClass("client!oc")
public class class33 extends class65 {

    @OriginalMember(owner = "client!oc", name = "p", descriptor = "[I")
    public int[] field310 = new int[1];

    @OriginalMember(owner = "client!oc", name = "q", descriptor = "[I")
    public int[] field311 = new int[] { -1 };

    @OriginalMember(owner = "client!oc", name = "o", descriptor = "Ltm;")
    public static class334 field309 = new class334(38, -2);

    @OriginalMember(owner = "client!oc", name = "r", descriptor = "Ltm;")
    public static class334 field312 = new class334(2, 0);

    @OriginalMember(owner = "client!oc", name = "t", descriptor = "Lvj;")
    public static class26 field314 = new class26(3, 2);

    @OriginalMember(owner = "client!oc", name = "k", descriptor = "I")
    public static int field305;

    @OriginalMember(owner = "client!oc", name = "l", descriptor = "I")
    public static int field306;

    @OriginalMember(owner = "client!oc", name = "m", descriptor = "I")
    public static int field307;

    @OriginalMember(owner = "client!oc", name = "n", descriptor = "I")
    public static int field308;

    @OriginalMember(owner = "client!oc", name = "s", descriptor = "I")
    public static int field313;

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(BLgba;)V", line = 7)
    public static final void method167(byte arg0, class702 arg1) {
        field306++;
        class49 var2 = (class49) class93.field1396.method3463((byte) -50);
        if (var2 == null) {
            return;
        }
        boolean var3 = false;
        if (arg0 > -31) {
            field314 = null;
        }
        for (int var4 = 0; var4 < var2.field809; var4++) {
            if (var2.field801[var4] != null) {
                if (var2.field801[var4].field2512 == 2) {
                    var2.field805[var4] = -5;
                }
                if (var2.field801[var4].field2512 == 0) {
                    var3 = true;
                }
            }
            if (var2.field804[var4] != null) {
                if (var2.field804[var4].field2512 == 2) {
                    var2.field805[var4] = -6;
                }
                if (var2.field804[var4].field2512 == 0) {
                    var3 = true;
                }
            }
        }
        if (var3) {
            return;
        }
        int var5 = arg1.field4534;
        arg1.method1970((byte) 29, var2.field806);
        for (int var6 = 0; var6 < var2.field809; var6++) {
            if (var2.field805[var6] == 0) {
                try {
                    int var7 = var2.field802[var6];
                    if (var7 == 0) {
                        Field var8 = (Field) var2.field801[var6].field2517;
                        int var9 = var8.getInt(null);
                        arg1.method1926(0, 65280);
                        arg1.method1970((byte) 29, var9);
                    } else if (var7 == 1) {
                        Field var12 = (Field) var2.field801[var6].field2517;
                        var12.setInt(null, var2.field807[var6]);
                        arg1.method1926(0, 65280);
                    } else if (var7 == 2) {
                        Field var10 = (Field) var2.field801[var6].field2517;
                        int var11 = var10.getModifiers();
                        arg1.method1926(0, 65280);
                        arg1.method1970((byte) 29, var11);
                    }
                    if (var7 == 3) {
                        Method var13 = (Method) var2.field804[var6].field2517;
                        byte[][] var14 = var2.field800[var6];
                        Object[] var15 = new Object[var14.length];
                        for (int var16 = 0; var16 < var14.length; var16++) {
                            ObjectInputStream var17 = new ObjectInputStream(new ByteArrayInputStream(var14[var16]));
                            var15[var16] = var17.readObject();
                        }
                        Object var18 = var13.invoke(null, var15);
                        if (var18 == null) {
                            arg1.method1926(0, 65280);
                        } else if ((var18 instanceof Number)) {
                            arg1.method1926(1, 65280);
                            arg1.method1964(((Number) var18).longValue(), (byte) 101);
                        } else if (var18 instanceof String) {
                            arg1.method1926(2, 65280);
                            arg1.method1931(126, (String) var18);
                        } else {
                            arg1.method1926(4, 65280);
                        }
                    } else if (var7 == 4) {
                        Method var19 = (Method) var2.field804[var6].field2517;
                        int var20 = var19.getModifiers();
                        arg1.method1926(0, 65280);
                        arg1.method1970((byte) 29, var20);
                    }
                } catch (ClassNotFoundException var21) {
                    arg1.method1926(-10, 65280);
                } catch (InvalidClassException var22) {
                    arg1.method1926(-11, 65280);
                } catch (StreamCorruptedException var23) {
                    arg1.method1926(-12, 65280);
                } catch (OptionalDataException var24) {
                    arg1.method1926(-13, 65280);
                } catch (IllegalAccessException var25) {
                    arg1.method1926(-14, 65280);
                } catch (IllegalArgumentException var26) {
                    arg1.method1926(-15, 65280);
                } catch (InvocationTargetException var27) {
                    arg1.method1926(-16, 65280);
                } catch (SecurityException var28) {
                    arg1.method1926(-17, 65280);
                } catch (IOException var29) {
                    arg1.method1926(-18, 65280);
                } catch (NullPointerException var30) {
                    arg1.method1926(-19, 65280);
                } catch (Exception var31) {
                    arg1.method1926(-20, 65280);
                } catch (Throwable var32) {
                    arg1.method1926(-21, 65280);
                }
            } else {
                arg1.method1926(var2.field805[var6], 65280);
            }
        }
        arg1.method1981(var5, (byte) -110);
        var2.method636((byte) 97);
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(Z[BII)Ljava/lang/String;", line = 190)
    public static final String method168(boolean arg0, byte[] arg1, int arg2, int arg3) {
        field305++;
        char[] var4 = new char[arg3];
        if (!arg0) {
            field314 = null;
        }
        int var5 = 0;
        for (int var6 = 0; var6 < arg3; var6++) {
            int var7 = arg1[arg2 + var6] & 0xFF;
            if (var7 != 0) {
                if (var7 >= 128 && var7 < 160) {
                    char var8 = class173.field2952[var7 - 128];
                    if (var8 == '\u0000') {
                        var8 = '?';
                    }
                    var7 = var8;
                }
                var4[var5++] = (char) var7;
            }
        }
        return new String(var4, 0, var5);
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(I)V", line = 233)
    public static void method169(int arg0) {
        if (arg0 != 32) {
            method167((byte) -126, null);
        }
        field309 = null;
        field312 = null;
        field314 = null;
    }

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "(I)V", line = 247)
    public static final void method170(int arg0) {
        class565.field8015.method253(class257.field4037, class654.field9289.field5436.method2435(3) == 1 ? class429.field6283 + 256 << 2 : -1, 0);
        int var1 = -107 / ((arg0 - 16) / 39);
        field308++;
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(IILnk;IBIIZLvga;Lha;)Lka;", line = 273)
    public final class282 method171(int arg0, int arg1, class426 arg2, int arg3, byte arg4, int arg5, int arg6, boolean arg7, class82 arg8, class544 arg9) {
        field307++;
        class282 var11 = null;
        int var12 = arg1;
        class228 var13 = null;
        if (arg3 != -1) {
            var13 = class581.field8222.method1548(-93, arg3);
        }
        int[] var14 = this.field311;
        if (var13 != null && var13.field3681 != null) {
            var14 = new int[var13.field3681.length];
            for (int var15 = 0; var15 < var13.field3681.length; var15++) {
                int var16 = var13.field3681[var15];
                if (var16 >= 0 && this.field311.length > var16) {
                    var14[var15] = this.field311[var16];
                } else {
                    var14[var15] = -1;
                }
            }
        }
        boolean var17 = false;
        boolean var18 = false;
        boolean var19 = false;
        boolean var20 = false;
        int var21 = -1;
        int var22 = -1;
        int var23 = 0;
        class249 var24 = null;
        class249 var25 = null;
        if (arg8 != null) {
            var12 = arg1 | 0x20;
            int var26 = arg8.field1197[arg6];
            int var27 = var26 >>> 16;
            var21 = var26 & 0xFFFF;
            var24 = class83.field1219.method2350(var27, true);
            if (var24 != null) {
                var18 |= var24.method1713(arg4 ^ 0x39, var21);
                var17 |= var24.method1711(var21, 0);
                var20 |= var24.method1709(var21, arg4 + 120);
                var19 |= arg8.field1186;
            }
            if ((arg8.field1184 || class584.field8245) && arg5 != -1 && arg8.field1197.length > arg5) {
                int var28 = arg8.field1197[arg5];
                var23 = arg8.field1211[arg6];
                int var29 = var28 >>> 16;
                var22 = var28 & 0xFFFF;
                if (var27 == var29) {
                    var25 = var24;
                } else {
                    var25 = class83.field1219.method2350(var22 >>> 16, true);
                }
                if (var25 != null) {
                    var18 |= var25.method1713(-56, var22);
                    var17 |= var25.method1711(var22, arg4 ^ 0xFFFFFF8C);
                    var20 |= var25.method1709(var22, 4);
                }
            }
            if (var18) {
                var12 |= 0x80;
            }
            if (var17) {
                var12 |= 0x100;
            }
            if (var19) {
                var12 |= 0x200;
            }
            if (var20) {
                var12 |= 0x400;
            }
        }
        if (arg4 != -116) {
            this.field310 = null;
        }
        long var30 = this.method172(arg2 == null ? null : arg2.field6248, arg3, arg4 - 5, arg7, var14);
        if (class186.field3110 != null) {
            var11 = (class282) class186.field3110.method80((byte) -37, var30);
        }
        if (var11 == null || arg9.method351(var11.method1044(), var12) != 0) {
            if (var11 != null) {
                var12 = arg9.method273(var12, var11.method1044());
            }
            int var32 = var12;
            boolean var33 = false;
            for (int var34 = 0; var34 < var14.length; var34++) {
                if (var14[var34] != -1 && !class556.field7917.method741(-125, var14[var34]).method3829(arg7, true)) {
                    var33 = true;
                }
            }
            if (var33) {
                return null;
            }
            class352[] var35 = new class352[var14.length];
            for (int var36 = 0; var36 < var14.length; var36++) {
                if (var14[var36] != -1) {
                    var35[var36] = class556.field7917.method741(class584.method3367(arg4, -14), var14[var36]).method3834(arg7, false);
                }
            }
            if (var13 != null && var13.field3646 != null) {
                for (int var37 = 0; var37 < var13.field3646.length; var37++) {
                    if (var13.field3646[var37] != null && var35[var37] != null) {
                        int var38 = var13.field3646[var37][0];
                        int var39 = var13.field3646[var37][1];
                        int var40 = var13.field3646[var37][2];
                        int var41 = var13.field3646[var37][3];
                        int var42 = var13.field3646[var37][4];
                        int var43 = var13.field3646[var37][5];
                        if (var41 != 0 || var42 != 0 || var43 != 0) {
                            var35[var37].method2233(var43, var42, var41, 127);
                        }
                        if (var38 != 0 || var39 != 0 || var40 != 0) {
                            var35[var37].method2236(var38, var39, (byte) 86, var40);
                        }
                    }
                }
            }
            class352 var44 = new class352(var35, var35.length);
            if (arg2 != null) {
                var32 = var12 | 0x4000;
            }
            var11 = arg9.method301(var44, var32, class69.field1070, 64, 850);
            if (arg2 != null) {
                for (int var45 = 0; var45 < 5; var45++) {
                    for (int var46 = 0; var46 < class626.field8786.length; var46++) {
                        if (arg2.field6248[var45] < class626.field8786[var46][var45].length) {
                            var11.method1018(class494.field7155[var46][var45], class626.field8786[var46][var45][arg2.field6248[var45]]);
                        }
                    }
                }
            }
            if (class186.field3110 != null) {
                var11.method1014(var12);
                class186.field3110.method67(var30, var11, -6772);
            }
        }
        if (arg8 == null || var24 == null) {
            return var11;
        } else {
            class282 var47 = var11.method1025((byte) 1, var12, true);
            var47.method1853(var22, var21, arg4 + 231, var24, arg8.field1186, var25, 0, arg0 - 1, var23);
            return var47;
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "([IIIZ[I)J", line = 519)
    private final long method172(int[] arg0, int arg1, int arg2, boolean arg3, int[] arg4) {
        field313++;
        int var6 = 117 % ((-arg2 - 5) / 57);
        long[] var7 = class285.field4388;
        long var8 = -1L;
        long var10 = var8 >>> 8 ^ var7[(int) ((var8 ^ (long) (arg1 >> 8)) & 0xFFL)];
        long var12 = var10 >>> 8 ^ var7[(int) (((long) arg1 ^ var10) & 0xFFL)];
        for (int var14 = 0; var14 < arg4.length; var14++) {
            long var18 = var7[(int) (((long) (arg4[var14] >> 24) ^ var12) & 0xFFL)] ^ var12 >>> 8;
            long var20 = var7[(int) ((var18 ^ (long) (arg4[var14] >> 16)) & 0xFFL)] ^ var18 >>> 8;
            long var22 = var7[(int) ((var20 ^ (long) (arg4[var14] >> 8)) & 0xFFL)] ^ var20 >>> 8;
            var12 = var22 >>> 8 ^ var7[(int) ((var22 ^ (long) arg4[var14]) & 0xFFL)];
        }
        if (arg0 != null) {
            for (int var15 = 0; var15 < 5; var15++) {
                var12 = var7[(int) (((long) arg0[var15] ^ var12) & 0xFFL)] ^ var12 >>> 8;
            }
        }
        return var12 >>> 8 ^ var7[(int) (((long) (arg3 ? 1 : 0) ^ var12) & 0xFFL)];
    }
}
