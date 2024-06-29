import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!at")
public abstract class class535 extends class496 {

    @OriginalMember(owner = "client!at", name = "v", descriptor = "I")
    private int field7924;

    @OriginalMember(owner = "client!at", name = "y", descriptor = "F")
    public float field7927;

    @OriginalMember(owner = "client!at", name = "j", descriptor = "I")
    public int field7912;

    @OriginalMember(owner = "client!at", name = "z", descriptor = "I")
    public int field7928;

    @OriginalMember(owner = "client!at", name = "r", descriptor = "I")
    private int field7920;

    @OriginalMember(owner = "client!at", name = "q", descriptor = "I")
    public int field7919;

    @OriginalMember(owner = "client!at", name = "i", descriptor = "[I")
    public static int[] field7911 = new int[] { 1, -1, -1, 1 };

    @OriginalMember(owner = "client!at", name = "s", descriptor = "[Z")
    public static boolean[] field7921 = new boolean[8];

    @OriginalMember(owner = "client!at", name = "w", descriptor = "I")
    public static int field7925 = -1;

    @OriginalMember(owner = "client!at", name = "k", descriptor = "Lqu;")
    public static class364 field7913 = new class364(76, 2);

    @OriginalMember(owner = "client!at", name = "l", descriptor = "I")
    public static int field7914;

    @OriginalMember(owner = "client!at", name = "m", descriptor = "I")
    public static int field7915;

    @OriginalMember(owner = "client!at", name = "n", descriptor = "I")
    public static int field7916;

    @OriginalMember(owner = "client!at", name = "o", descriptor = "I")
    public static int field7917;

    @OriginalMember(owner = "client!at", name = "p", descriptor = "I")
    public static int field7918;

    @OriginalMember(owner = "client!at", name = "t", descriptor = "I")
    public static int field7922;

    @OriginalMember(owner = "client!at", name = "u", descriptor = "I")
    public static int field7923;

    @OriginalMember(owner = "client!at", name = "x", descriptor = "I")
    public static int field7926;

    @OriginalMember(owner = "client!at", name = "A", descriptor = "I")
    public static int field7929;

    @OriginalMember(owner = "client!at", name = "B", descriptor = "I")
    public static int field7930;

    @OriginalMember(owner = "client!at", name = "a", descriptor = "(Lno;I)V", line = 3)
    public static final void method3142(class483 arg0, int arg1) {
        field7922++;
        arg0.method2933(0);
        int var2 = 0;
        for (int var3 = 0; var3 < class264.field3925; var3++) {
            int var15 = class533.field7895[var3];
            if ((class262.field3877[var15] & 0x1) == 0) {
                if (var2 > 0) {
                    class262.field3877[var15] = (byte) class313.method1926(class262.field3877[var15], 2);
                    var2--;
                } else {
                    int var16 = arg0.method2937(-19811, 1);
                    if (var16 == 0) {
                        var2 = class352.method2152(11, arg0);
                        class262.field3877[var15] = (byte) class313.method1926(class262.field3877[var15], 2);
                    } else {
                        class325.method2033(var15, arg0, (byte) 124);
                    }
                }
            }
        }
        arg0.method2930(20056);
        if (var2 != 0) {
            throw new RuntimeException("nsn0");
        }
        arg0.method2933(0);
        for (int var4 = 0; var4 < class264.field3925; var4++) {
            int var13 = class533.field7895[var4];
            if ((class262.field3877[var13] & 0x1) != 0) {
                if (var2 > 0) {
                    var2--;
                    class262.field3877[var13] = (byte) class313.method1926(class262.field3877[var13], 2);
                } else {
                    int var14 = arg0.method2937(-19811, 1);
                    if (var14 == 0) {
                        var2 = class352.method2152(11, arg0);
                        class262.field3877[var13] = (byte) class313.method1926(class262.field3877[var13], 2);
                    } else {
                        class325.method2033(var13, arg0, (byte) 111);
                    }
                }
            }
        }
        arg0.method2930(arg1 + 20056);
        if (var2 != 0) {
            throw new RuntimeException("nsn1");
        }
        arg0.method2933(arg1);
        for (int var5 = 0; var5 < class574.field8478; var5++) {
            int var11 = class402.field5764[var5];
            if ((class262.field3877[var11] & 0x1) != 0) {
                if (var2 > 0) {
                    class262.field3877[var11] = (byte) class313.method1926(class262.field3877[var11], 2);
                    var2--;
                } else {
                    int var12 = arg0.method2937(-19811, 1);
                    if (var12 == 0) {
                        var2 = class352.method2152(11, arg0);
                        class262.field3877[var11] = (byte) class313.method1926(class262.field3877[var11], 2);
                    } else if (class421.method2503(arg0, var11, 0)) {
                        class262.field3877[var11] = (byte) class313.method1926(class262.field3877[var11], 2);
                    }
                }
            }
        }
        arg0.method2930(20056);
        if (var2 != 0) {
            throw new RuntimeException("nsn2");
        }
        arg0.method2933(0);
        for (int var6 = 0; var6 < class574.field8478; var6++) {
            int var9 = class402.field5764[var6];
            if ((class262.field3877[var9] & 0x1) == 0) {
                if (var2 > 0) {
                    class262.field3877[var9] = (byte) class313.method1926(class262.field3877[var9], 2);
                    var2--;
                } else {
                    int var10 = arg0.method2937(-19811, 1);
                    if (var10 == 0) {
                        var2 = class352.method2152(11, arg0);
                        class262.field3877[var9] = (byte) class313.method1926(class262.field3877[var9], 2);
                    } else if (class421.method2503(arg0, var9, 0)) {
                        class262.field3877[var9] = (byte) class313.method1926(class262.field3877[var9], 2);
                    }
                }
            }
        }
        arg0.method2930(arg1 ^ 0x4E58);
        if (var2 != 0) {
            throw new RuntimeException("nsn3");
        }
        class264.field3925 = arg1;
        class574.field8478 = 0;
        for (int var7 = 1; var7 < 2048; var7++) {
            class262.field3877[var7] = (byte) (class262.field3877[var7] >> 1);
            class179 var8 = class383.field5604[var7];
            if (var8 == null) {
                class402.field5764[class574.field8478++] = var7;
            } else {
                class533.field7895[class264.field3925++] = var7;
            }
        }
    }

    @OriginalMember(owner = "client!at", name = "a", descriptor = "(I)I", line = 206)
    public final int method3143(int arg0) {
        field7926++;
        return arg0 >= -74 ? 81 : this.field7912;
    }

    @OriginalMember(owner = "client!at", name = "a", descriptor = "(Z)Ljf;", line = 223)
    public static final class28 method3144(boolean arg0) {
        field7930++;
        if (arg0) {
            field7925 = 88;
        }
        try {
            return (class28) Class.forName("ct").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return null;
        }
    }

    @OriginalMember(owner = "client!at", name = "b", descriptor = "(I)F", line = 240)
    public final float method3145(int arg0) {
        field7916++;
        if (arg0 != 2) {
            this.field7919 = -19;
        }
        return this.field7927;
    }

    @OriginalMember(owner = "client!at", name = "c", descriptor = "(I)I", line = 257)
    public final int method3146(int arg0) {
        if (arg0 == 0) {
            field7917++;
            return this.field7920;
        } else {
            return 42;
        }
    }

    @OriginalMember(owner = "client!at", name = "a", descriptor = "(Ljava/lang/String;IB)V", line = 272)
    public static final void method3147(String arg0, int arg1, byte arg2) {
        int var3 = -19 % ((-arg2 - 12) / 32);
        field7914++;
        class621 var4 = class442.method2691(arg1, 3, true);
        var4.method3592((byte) 118);
        var4.field9072 = arg0;
    }

    @OriginalMember(owner = "client!at", name = "a", descriptor = "(B)I", line = 288)
    public final int method3148(byte arg0) {
        field7929++;
        if (arg0 >= -11) {
            this.method3148((byte) 23);
        }
        return this.field7924;
    }

    @OriginalMember(owner = "client!at", name = "b", descriptor = "(B)I", line = 299)
    public static final int method3149(byte arg0) {
        if (arg0 > -41) {
            field7913 = null;
        }
        field7918++;
        return class390.field5688++;
    }

    @OriginalMember(owner = "client!at", name = "g", descriptor = "(I)I", line = 315)
    public final int method3150(int arg0) {
        if (arg0 != 2) {
            field7911 = null;
        }
        field7923++;
        return this.field7928;
    }

    @OriginalMember(owner = "client!at", name = "h", descriptor = "(I)I", line = 326)
    public final int method3151(int arg0) {
        field7915++;
        return arg0 > -20 ? 102 : this.field7919;
    }

    @OriginalMember(owner = "client!at", name = "i", descriptor = "(I)V", line = 345)
    public static void method3152(int arg0) {
        field7921 = null;
        field7913 = null;
        if (arg0 == 1) {
            field7911 = null;
        }
    }

    @OriginalMember(owner = "client!at", name = "<init>", descriptor = "(IIIIIF)V", line = 357)
    public class535(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        this.field7924 = arg4;
        this.field7927 = arg5;
        this.field7912 = arg2;
        this.field7928 = arg1;
        this.field7920 = arg3;
        this.field7919 = arg0;
    }

    @OriginalMember(owner = "client!at", name = "a", descriptor = "(IF)V")
    public abstract void method94(int arg0, float arg1);

    @OriginalMember(owner = "client!at", name = "a", descriptor = "(IIII)V")
    public abstract void method93(int arg0, int arg1, int arg2, int arg3);
}
