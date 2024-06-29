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

@OriginalClass("client!ld")
public class class60 {

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "Z")
    public static boolean field764 = false;

    @OriginalMember(owner = "client!ld", name = "c", descriptor = "[I")
    public static int[] field765 = new int[5];

    @OriginalMember(owner = "client!ld", name = "e", descriptor = "Ljava/lang/String;")
    public static String field767 = "Loaded world list data";

    @OriginalMember(owner = "client!ld", name = "j", descriptor = "Ljava/lang/String;")
    public static String field772 = "Examine";

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "I")
    public static int field763;

    @OriginalMember(owner = "client!ld", name = "d", descriptor = "I")
    public static int field766;

    @OriginalMember(owner = "client!ld", name = "f", descriptor = "I")
    public static int field768;

    @OriginalMember(owner = "client!ld", name = "g", descriptor = "I")
    public static int field769;

    @OriginalMember(owner = "client!ld", name = "h", descriptor = "I")
    public static int field770;

    @OriginalMember(owner = "client!ld", name = "i", descriptor = "I")
    public static int field771;

    @OriginalMember(owner = "client!ld", name = "k", descriptor = "I")
    public static int field773;

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(I)V")
    public static void method348(int arg0) {
        field772 = null;
        if (arg0 != 0) {
            field764 = true;
        }
        field765 = null;
        field767 = null;
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(I[II[II)V")
    public static final void method349(int arg0, int[] arg1, int arg2, int[] arg3, int arg4) {
        if (arg4 != 20703) {
            field764 = true;
        }
        if (arg2 > arg0) {
            int var5 = arg0;
            int var6 = (arg0 + arg2) / 2;
            int var7 = arg1[var6];
            arg1[var6] = arg1[arg2];
            arg1[arg2] = var7;
            int var8 = arg3[var6];
            arg3[var6] = arg3[arg2];
            arg3[arg2] = var8;
            for (int var9 = arg0; var9 < arg2; var9++) {
                if ((var9 & 0x1) + var7 < arg1[var9]) {
                    int var10 = arg1[var9];
                    arg1[var9] = arg1[var5];
                    arg1[var5] = var10;
                    int var11 = arg3[var9];
                    arg3[var9] = arg3[var5];
                    arg3[var5++] = var11;
                }
            }
            arg1[arg2] = arg1[var5];
            arg1[var5] = var7;
            arg3[arg2] = arg3[var5];
            arg3[var5] = var8;
            method349(arg0, arg1, var5 - 1, arg3, 20703);
            method349(var5 + 1, arg1, arg2, arg3, 20703);
        }
        field773++;
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(IIIBI)V")
    public static final void method350(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        field768++;
        class54 var5 = (class54) class39.field483.method708((long) arg0, 127);
        if (var5 == null) {
            var5 = new class54();
            class39.field483.method707((long) arg0, var5, (byte) 120);
        }
        if (var5.field689.length <= arg1) {
            int[] var6 = new int[arg1 + 1];
            int[] var7 = new int[arg1 + 1];
            for (int var8 = 0; var8 < var5.field689.length; var8++) {
                var6[var8] = var5.field689[var8];
                var7[var8] = var5.field694[var8];
            }
            for (int var9 = var5.field689.length; var9 < arg1; var9++) {
                var6[var9] = -1;
                var7[var9] = 0;
            }
            var5.field689 = var6;
            var5.field694 = var7;
        }
        var5.field689[arg1] = arg2;
        var5.field694[arg1] = arg4;
        int var10 = -57 / ((arg3 + 10) / 40);
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(Lnk;II)V")
    public static final void method351(class286 arg0, int arg1, int arg2) {
        if (arg1 != -24452) {
            method351((class286) null, -42, 52);
        }
        field771++;
        while (true) {
            class21 var3 = (class21) class154.field2383.method1802(arg1 + 24495);
            if (var3 == null) {
                return;
            }
            boolean var4 = false;
            for (int var5 = 0; var5 < var3.field271; var5++) {
                if (var3.field278[var5] != null) {
                    if (var3.field278[var5].field3995 == 2) {
                        var3.field281[var5] = -5;
                    }
                    if (var3.field278[var5].field3995 == 0) {
                        var4 = true;
                    }
                }
                if (var3.field272[var5] != null) {
                    if (var3.field272[var5].field3995 == 2) {
                        var3.field281[var5] = -6;
                    }
                    if (var3.field272[var5].field3995 == 0) {
                        var4 = true;
                    }
                }
            }
            if (var4) {
                return;
            }
            arg0.method1932(false, arg2);
            arg0.method580((byte) 90, 0);
            int var6 = arg0.field1228;
            arg0.method574(var3.field273, -1);
            for (int var7 = 0; var7 < var3.field271; var7++) {
                if (var3.field281[var7] == 0) {
                    try {
                        int var8 = var3.field275[var7];
                        if (var8 == 0) {
                            Field var9 = (Field) var3.field278[var7].field3992;
                            int var10 = var9.getInt((Object) null);
                            arg0.method580((byte) 92, 0);
                            arg0.method574(var10, -1);
                        } else if (var8 == 1) {
                            Field var13 = (Field) var3.field278[var7].field3992;
                            var13.setInt((Object) null, var3.field267[var7]);
                            arg0.method580((byte) 122, 0);
                        } else if (var8 == 2) {
                            Field var11 = (Field) var3.field278[var7].field3992;
                            int var12 = var11.getModifiers();
                            arg0.method580((byte) 101, 0);
                            arg0.method574(var12, -1);
                        }
                        if (var8 == 3) {
                            Method var14 = (Method) var3.field272[var7].field3992;
                            byte[][] var15 = var3.field268[var7];
                            Object[] var16 = new Object[var15.length];
                            for (int var17 = 0; var17 < var15.length; var17++) {
                                ObjectInputStream var18 = new ObjectInputStream(new ByteArrayInputStream(var15[var17]));
                                var16[var17] = var18.readObject();
                            }
                            Object var19 = var14.invoke((Object) null, var16);
                            if (var19 == null) {
                                arg0.method580((byte) 68, 0);
                            } else if (var19 instanceof Number) {
                                arg0.method580((byte) 61, 1);
                                arg0.method590(((Number) var19).longValue(), 1027669520);
                            } else if ((var19 instanceof String)) {
                                arg0.method580((byte) 116, 2);
                                arg0.method566((byte) -50, (String) var19);
                            } else {
                                arg0.method580((byte) 60, 4);
                            }
                        } else if (var8 == 4) {
                            Method var20 = (Method) var3.field272[var7].field3992;
                            int var21 = var20.getModifiers();
                            arg0.method580((byte) 107, 0);
                            arg0.method574(var21, arg1 ^ 0x5F83);
                        }
                    } catch (ClassNotFoundException var22) {
                        arg0.method580((byte) 78, -10);
                    } catch (InvalidClassException var23) {
                        arg0.method580((byte) 99, -11);
                    } catch (StreamCorruptedException var24) {
                        arg0.method580((byte) 106, -12);
                    } catch (OptionalDataException var25) {
                        arg0.method580((byte) 74, -13);
                    } catch (IllegalAccessException var26) {
                        arg0.method580((byte) 71, -14);
                    } catch (IllegalArgumentException var27) {
                        arg0.method580((byte) 61, -15);
                    } catch (InvocationTargetException var28) {
                        arg0.method580((byte) 96, -16);
                    } catch (SecurityException var29) {
                        arg0.method580((byte) 107, -17);
                    } catch (IOException var30) {
                        arg0.method580((byte) 105, -18);
                    } catch (NullPointerException var31) {
                        arg0.method580((byte) 123, -19);
                    } catch (Exception var32) {
                        arg0.method580((byte) 76, -20);
                    } catch (Throwable var33) {
                        arg0.method580((byte) 119, -21);
                    }
                } else {
                    arg0.method580((byte) 62, var3.field281[var7]);
                }
            }
            arg0.method581(var6, 125);
            arg0.method544(arg1 ^ 0x509A, arg0.field1228 - var6);
            var3.method1673(14510);
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(IB)I")
    public static final int method352(int arg0, byte arg1) {
        field769++;
        int var2 = 0;
        if (arg0 < 0 || arg0 >= 65536) {
            var2 += 16;
            arg0 >>>= 0x10;
        }
        if (arg0 >= 256) {
            var2 += 8;
            arg0 >>>= 0x8;
        }
        int var3 = 106 / ((16 - arg1) / 36);
        if (arg0 >= 16) {
            arg0 >>>= 0x4;
            var2 += 4;
        }
        if (arg0 >= 4) {
            arg0 >>>= 0x2;
            var2 += 2;
        }
        if (arg0 >= 1) {
            arg0 >>>= 0x1;
            var2++;
        }
        return arg0 + var2;
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(Lwb;I)Z")
    public static final boolean method353(class123 arg0, int arg1) {
        if (arg1 != -22460) {
            method351((class286) null, -116, 100);
        }
        field766++;
        if (arg0.field1848 == 205) {
            class285.field4538 = 250;
            return true;
        } else {
            return false;
        }
    }
}
