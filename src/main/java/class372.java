import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lia")
public class class372 extends class276 {

    @OriginalMember(owner = "client!lia", name = "C", descriptor = "Ljava/lang/Object;")
    private Object field5442;

    @OriginalMember(owner = "client!lia", name = "A", descriptor = "[Ljava/lang/String;")
    private static final String[] field5450 = new String[] { method2955(method2954("#&N.")), method2955(method2954("6}\fln")), method2955(method2954("!:ClPe")), method2955(method2954("!:ClRe")), method2955(method2954("!:ClVe")), method2955(method2954("!:Cl/$=K6-e")), method2955(method2954("!:ClQe")), method2955(method2954("!:ClWe")), method2955(method2954("!:ClUe")) };

    @OriginalMember(owner = "client!lia", name = "I", descriptor = "I")
    public static int field5449 = -1;

    @OriginalMember(owner = "client!lia", name = "G", descriptor = "Lmv;")
    public static class125 field5445 = new class125(32, 3);

    @OriginalMember(owner = "client!lia", name = "B", descriptor = "I")
    public static int field5441;

    @OriginalMember(owner = "client!lia", name = "D", descriptor = "I")
    public static int field5443;

    @OriginalMember(owner = "client!lia", name = "K", descriptor = "I")
    public static int field5444;

    @OriginalMember(owner = "client!lia", name = "F", descriptor = "I")
    public static int field5446;

    @OriginalMember(owner = "client!lia", name = "J", descriptor = "I")
    public static int field5447;

    @OriginalMember(owner = "client!lia", name = "L", descriptor = "I")
    public static int field5448;

    @OriginalMember(owner = "client!lia", name = "a", descriptor = "(B)Ljava/lang/Object;")
    public final Object method2253(byte arg0) {
        try {
            if (arg0 != -71) {
                this.field5442 = null;
            }
            field5446++;
            return this.field5442;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field5450[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!lia", name = "a", descriptor = "(I)V")
    public static void method2950(int arg0) {
        try {
            field5445 = null;
            if (arg0 != 0) {
                method2951(63, 22, (byte) 61, null);
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field5450[8] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!lia", name = "c", descriptor = "(B)Z")
    public final boolean method2254(byte arg0) {
        try {
            int var2 = 29 / ((13 - arg0) / 62);
            field5447++;
            return false;
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field5450[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!lia", name = "a", descriptor = "(IIBLlga;)Lrha;")
    public static final class60 method2951(int arg0, int arg1, byte arg2, class47 arg3) {
        try {
            if (arg2 != -3) {
                method2951(28, 127, (byte) 81, null);
            }
            field5443++;
            byte[] var4 = arg3.method512(arg1, arg0, (byte) -47);
            return var4 == null ? null : new class60(var4);
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field5450[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 == null ? field5450[0] : field5450[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!lia", name = "<init>", descriptor = "(Lrc;Ljava/lang/Object;I)V")
    public class372(class131 arg0, Object arg1, int arg2) {
        super(arg0, arg2);
        try {
            this.field5442 = arg1;
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field5450[5] + (arg0 == null ? field5450[0] : field5450[1]) + ',' + (arg1 == null ? field5450[0] : field5450[1]) + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!lia", name = "a", descriptor = "(III)Lvo;")
    public static final class782 method2952(int arg0, int arg1, int arg2) {
        try {
            field5444++;
            class782 var3 = class435.method3389(arg1, (byte) -121);
            if (~arg0 == arg2) {
                return var3;
            } else if (var3 == null || var3.field11148 == null || arg0 >= var3.field11148.length) {
                return null;
            } else {
                return var3.field11148[arg0];
            }
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field5450[6] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!lia", name = "a", descriptor = "([II[JII)V")
    public static final void method2953(int[] arg0, int arg1, long[] arg2, int arg3, int arg4) {
        try {
            if (arg4 > arg3) {
                int var5 = (arg3 + arg4) / 2;
                int var6 = arg3;
                long var7 = arg2[var5];
                arg2[var5] = arg2[arg4];
                arg2[arg4] = var7;
                int var9 = arg0[var5];
                arg0[var5] = arg0[arg4];
                arg0[arg4] = var9;
                int var10 = ~var7 == Long.MIN_VALUE ? 0 : 1;
                for (int var11 = arg3; var11 < arg4; var11++) {
                    if (arg2[var11] < ((long) (var10 & var11) + var7)) {
                        long var12 = arg2[var11];
                        arg2[var11] = arg2[var6];
                        arg2[var6] = var12;
                        int var14 = arg0[var11];
                        arg0[var11] = arg0[var6];
                        arg0[var6++] = var14;
                    }
                }
                arg2[arg4] = arg2[var6];
                arg2[var6] = var7;
                arg0[arg4] = arg0[var6];
                arg0[var6] = var9;
                method2953(arg0, -1, arg2, arg3, var6 - 1);
                method2953(arg0, -1, arg2, var6 + 1, arg4);
            }
            field5441++;
            if (arg1 != -1) {
                field5445 = null;
            }
        } catch (RuntimeException var16) {
            throw class665.method4799(var16, field5450[2] + (arg0 == null ? field5450[0] : field5450[1]) + ',' + arg1 + ',' + (arg2 == null ? field5450[0] : field5450[1]) + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!lia", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2954(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x13);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!lia", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2955(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 77;
                    break;
                case 1:
                    var10005 = 83;
                    break;
                case 2:
                    var10005 = 34;
                    break;
                case 3:
                    var10005 = 66;
                    break;
                default:
                    var10005 = 19;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
