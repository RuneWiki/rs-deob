import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qg")
public class class207 {

    @OriginalMember(owner = "client!qg", name = "g", descriptor = "I")
    public static int field3173 = 0;

    @OriginalMember(owner = "client!qg", name = "i", descriptor = "[Ljava/lang/String;")
    public static String[] field3175 = new String[1000];

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "[I")
    public static int[] field3167 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!qg", name = "n", descriptor = "[I")
    public static int[] field3180 = new int[] { 1, 0, -1, 0 };

    @OriginalMember(owner = "client!qg", name = "c", descriptor = "I")
    public static int field3169;

    @OriginalMember(owner = "client!qg", name = "d", descriptor = "I")
    public static int field3170;

    @OriginalMember(owner = "client!qg", name = "h", descriptor = "I")
    public int field3174;

    @OriginalMember(owner = "client!qg", name = "j", descriptor = "I")
    public static int field3176;

    @OriginalMember(owner = "client!qg", name = "k", descriptor = "I")
    public static int field3177;

    @OriginalMember(owner = "client!qg", name = "l", descriptor = "I")
    public static int field3178;

    @OriginalMember(owner = "client!qg", name = "m", descriptor = "I")
    public static int field3179;

    @OriginalMember(owner = "client!qg", name = "o", descriptor = "I")
    public int field3181;

    @OriginalMember(owner = "client!qg", name = "p", descriptor = "I")
    public int field3182;

    @OriginalMember(owner = "client!qg", name = "e", descriptor = "Ljd;")
    public static class95 field3171;

    @OriginalMember(owner = "client!qg", name = "f", descriptor = "Ljd;")
    public static class95 field3172;

    @OriginalMember(owner = "client!qg", name = "b", descriptor = "[[S")
    public static short[][] field3168;

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(IILwm;)V", line = 13)
    private final void method1490(int arg0, int arg1, class254 arg2) {
        field3179++;
        if (~arg0 == arg1) {
            this.field3174 = arg2.method1755(false);
            this.field3181 = arg2.method1774((byte) 104);
            this.field3182 = arg2.method1774((byte) -123);
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(IIIIII)V", line = 42)
    public static final void method1491(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = -37 % ((-arg3 - 13) / 60);
        field3170++;
        if (class234.field3569 <= arg0 && arg4 <= class322.field4965 && arg5 >= class212.field3261 && arg2 <= class182.field2888) {
            class167.method1266(arg1, arg5, arg0, arg4, 122, arg2);
        } else {
            class223.method1588(arg5, -1, arg0, arg4, arg2, arg1);
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "([II[I[ILkk;)V", line = 62)
    public static final void method1492(int[] arg0, int arg1, int[] arg2, int[] arg3, class76 arg4) {
        for (int var5 = arg1; var5 < arg2.length; var5++) {
            int var6 = arg3[var5];
            int var7 = arg2[var5];
            int var8 = arg0[var5];
            for (int var9 = 0; var6 != 0 && arg4.field4672.length > var9; var9++) {
                if ((var6 & 0x1) != 0) {
                    if (var7 == -1) {
                        arg4.field4672[var9] = null;
                    } else {
                        class28 var10 = client.method1010(var7, (byte) 107);
                        class69 var11 = arg4.field4672[var9];
                        int var12 = var10.field335;
                        if (var11 != null) {
                            if (var11.field978 == var7) {
                                if (var12 == 0) {
                                    var11 = arg4.field4672[var9] = null;
                                } else if (var12 == 1) {
                                    var11.field989 = var8;
                                    var11.field979 = 0;
                                    var11.field992 = 0;
                                    var11.field981 = 0;
                                    var11.field988 = 1;
                                    class146.method1105(0, false, 6924, arg4.field4731, var10, arg4.field4713);
                                } else if (var12 == 2) {
                                    var11.field979 = 0;
                                }
                            } else if (var10.field314 >= client.method1010(var11.field978, (byte) 120).field314) {
                                var11 = arg4.field4672[var9] = null;
                            }
                        }
                        if (var11 == null) {
                            class69 var13 = arg4.field4672[var9] = new class69();
                            var13.field978 = var7;
                            var13.field992 = 0;
                            var13.field988 = 1;
                            var13.field979 = 0;
                            var13.field981 = 0;
                            var13.field989 = var8;
                            class146.method1105(0, false, 6924, arg4.field4731, var10, arg4.field4713);
                        }
                    }
                }
                var6 >>>= 0x1;
            }
        }
        field3177++;
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(IB)Ldc;", line = 158)
    public static final class1 method1493(int arg0, byte arg1) {
        field3178++;
        class1 var2 = (class1) class204.field3124.method730((long) arg0, (byte) 90);
        if (var2 != null) {
            return var2;
        } else if (arg1 == -23) {
            byte[] var3;
            if (arg0 < 32768) {
                var3 = class170.field2741.method696(arg0, (byte) 105, 0);
            } else {
                var3 = class332.field5189.method696(arg0 & 0x7FFF, (byte) 98, 0);
            }
            class1 var4 = new class1();
            if (var3 != null) {
                var4.method5(new class254(var3), (byte) 72);
            }
            if (arg0 >= 32768) {
                var4.method9(31866);
            }
            class204.field3124.method734((byte) -14, (long) arg0, var4);
            return var4;
        } else {
            return (class1) null;
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(I)V", line = 191)
    public static void method1494(int arg0) {
        field3172 = null;
        field3175 = null;
        field3171 = null;
        field3167 = null;
        field3180 = null;
        if (arg0 == 4) {
            field3168 = (short[][]) null;
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(Lwm;I)V", line = 214)
    public final void method1495(class254 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method1774((byte) 47);
            if (var3 == 0) {
                if (arg1 >= -17) {
                    this.field3181 = -1;
                }
                field3176++;
                return;
            }
            this.method1490(var3, -2, arg0);
        }
    }
}
