import java.lang.reflect.Field;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iga")
public class class480 extends class577 {

    @OriginalMember(owner = "client!iga", name = "o", descriptor = "[B")
    public byte[] field6746;

    @OriginalMember(owner = "client!iga", name = "p", descriptor = "[Ljava/lang/String;")
    public static String[] field6747 = new String[8];

    @OriginalMember(owner = "client!iga", name = "l", descriptor = "I")
    public static int field6743;

    @OriginalMember(owner = "client!iga", name = "m", descriptor = "I")
    public static int field6744;

    @OriginalMember(owner = "client!iga", name = "n", descriptor = "I")
    public static int field6745;

    @OriginalMember(owner = "client!iga", name = "q", descriptor = "I")
    public static int field6748;

    // $FF: synthetic field
    @OriginalMember(owner = "client!iga", name = "r", descriptor = "Ljava/lang/Class;")
    public static Class field6749;

    // $FF: synthetic field
    @OriginalMember(owner = "client!iga", name = "s", descriptor = "Ljava/lang/Class;")
    public static Class field6750;

    // $FF: synthetic field
    @OriginalMember(owner = "client!iga", name = "t", descriptor = "Ljava/lang/Class;")
    public static Class field6751;

    // $FF: synthetic method
    @OriginalMember(owner = "client!iga", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method2862(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!iga", name = "a", descriptor = "(I)V", line = 4)
    public static void method2857(int arg0) {
        if (arg0 != 3) {
            field6747 = null;
        }
        field6747 = null;
    }

    @OriginalMember(owner = "client!iga", name = "a", descriptor = "(III)V", line = 15)
    public static final void method2858(int arg0, int arg1, int arg2) {
        field6743++;
        class313 var3 = class312.method1998((long) arg2 | (long) arg1 << 32, arg0, -1);
        var3.method2006(-125);
    }

    @OriginalMember(owner = "client!iga", name = "a", descriptor = "(Z)I", line = 25)
    public static final int method2859(boolean arg0) {
        field6744++;
        if (arg0) {
            field6747 = null;
        }
        int var1 = 0;
        Field[] var2 = (field6749 == null ? (field6749 = method2862("gn")) : field6749).getDeclaredFields();
        Field[] var3 = var2;
        for (int var4 = 0; var4 < var3.length; var4++) {
            Field var5 = var3[var4];
            if ((field6750 == null ? (field6750 = method2862("qa")) : field6750).isAssignableFrom(var5.getType())) {
                var1++;
            }
        }
        return var1 + 1;
    }

    @OriginalMember(owner = "client!iga", name = "b", descriptor = "(Z)Lso;", line = 57)
    public static final class494 method2860(boolean arg0) {
        field6745++;
        class494 var1 = new class494(518);
        if (arg0) {
            return null;
        }
        class343.field4788 = new int[4];
        class343.field4788[1] = (int) (Math.random() * 9.9999999E7D);
        class343.field4788[2] = (int) (Math.random() * 9.9999999E7D);
        class343.field4788[3] = (int) (Math.random() * 9.9999999E7D);
        class343.field4788[0] = (int) (Math.random() * 9.9999999E7D);
        var1.method2952(0, 10);
        var1.method2959(class343.field4788[0], (byte) -38);
        var1.method2959(class343.field4788[1], (byte) 113);
        var1.method2959(class343.field4788[2], (byte) -66);
        var1.method2959(class343.field4788[3], (byte) -63);
        return var1;
    }

    @OriginalMember(owner = "client!iga", name = "a", descriptor = "(IIIIIIIILha;)V", line = 81)
    public static final void method2861(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class65 arg8) {
        if (arg3 != 1) {
            field6747 = null;
        }
        field6748++;
        class484 var9 = (class484) class335.method2132(arg0, arg2, arg5);
        if (var9 != null) {
            class282 var10 = class277.field4038.method3919(true, var9.method1483(24853));
            int var11 = var9.method1478((byte) 126) & 0x3;
            int var12 = var9.method1482(true);
            if (var10.field4108 == -1) {
                int var13 = arg4;
                if (var10.field4149 > 0) {
                    var13 = arg1;
                }
                if (var12 == 0 || var12 == 2) {
                    if (var11 == 0) {
                        arg8.method547(arg6, 80, 4, arg7, var13);
                    } else if (var11 == 1) {
                        arg8.method465(4, 1, arg7, var13, arg6);
                    } else if (var11 == 2) {
                        arg8.method547(arg6 + 3, 51, 4, arg7, var13);
                    } else if (var11 == 3) {
                        arg8.method465(4, arg3, arg7 + 3, var13, arg6);
                    }
                }
                if (var12 == 3) {
                    if (var11 == 0) {
                        arg8.method436(arg6, 1, var13, arg7, true, 1);
                    } else if (var11 == 1) {
                        arg8.method436(arg6 + 3, 1, var13, arg7, true, 1);
                    } else if (var11 == 2) {
                        arg8.method436(arg6 + 3, 1, var13, arg7 + 3, true, 1);
                    } else if (var11 == 3) {
                        arg8.method436(arg6, 1, var13, arg7 + 3, true, 1);
                    }
                }
                if (var12 == 2) {
                    if (var11 == 0) {
                        arg8.method465(4, arg3, arg7, var13, arg6);
                    } else if (var11 == 1) {
                        arg8.method547(arg6 + 3, arg3 ^ 0x4D, 4, arg7, var13);
                    } else if (var11 == 2) {
                        arg8.method465(4, 1, arg7 + 3, var13, arg6);
                    } else if (var11 == 3) {
                        arg8.method547(arg6, 66, 4, arg7, var13);
                    }
                }
            } else {
                class222.method1514(arg6, arg7, var10, 65280, arg8, var11);
            }
        }
        class484 var14 = (class484) class537.method3227(arg0, arg2, arg5, field6751 == null ? (field6751 = method2862("nq")) : field6751);
        if (var14 != null) {
            class282 var15 = class277.field4038.method3919(true, var14.method1483(24853));
            int var16 = var14.method1478((byte) 117) & 0x3;
            int var17 = var14.method1482(true);
            if (var15.field4108 != -1) {
                class222.method1514(arg6, arg7, var15, 65280, arg8, var16);
            } else if (var17 == 9) {
                int var18 = -1118482;
                if (var15.field4149 > 0) {
                    var18 = -1179648;
                }
                if (var16 == 0 || var16 == 2) {
                    arg8.method446(var18, arg7, arg3 - 126, arg7 - -3, arg6 + 3, arg6);
                } else {
                    arg8.method446(var18, arg7 + 3, -125, arg7, arg6 + 3, arg6);
                }
            }
        }
        class484 var19 = (class484) class266.method1725(arg0, arg2, arg5);
        if (var19 == null) {
            return;
        }
        class282 var20 = class277.field4038.method3919(true, var19.method1483(24853));
        int var21 = var19.method1478((byte) 127) & 0x3;
        if (var20.field4108 != -1) {
            class222.method1514(arg6, arg7, var20, 65280, arg8, var21);
            return;
        }
    }

    @OriginalMember(owner = "client!iga", name = "<init>", descriptor = "([B)V", line = 223)
    public class480(byte[] arg0) {
        this.field6746 = arg0;
    }
}
