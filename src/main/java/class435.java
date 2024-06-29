import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wba")
public class class435 {

    @OriginalMember(owner = "client!wba", name = "h", descriptor = "Lad;")
    private class19 field6138 = new class19(16);

    @OriginalMember(owner = "client!wba", name = "i", descriptor = "Ltf;")
    private class701 field6139;

    @OriginalMember(owner = "client!wba", name = "d", descriptor = "[I")
    public static int[] field6134 = new int[16384];

    @OriginalMember(owner = "client!wba", name = "e", descriptor = "[I")
    public static int[] field6135 = new int[16384];

    @OriginalMember(owner = "client!wba", name = "n", descriptor = "Lsb;")
    public static class305 field6144;

    @OriginalMember(owner = "client!wba", name = "l", descriptor = "F")
    public static float field6142;

    @OriginalMember(owner = "client!wba", name = "a", descriptor = "I")
    public static int field6131;

    @OriginalMember(owner = "client!wba", name = "b", descriptor = "I")
    public static int field6132;

    @OriginalMember(owner = "client!wba", name = "c", descriptor = "I")
    public static int field6133;

    @OriginalMember(owner = "client!wba", name = "f", descriptor = "I")
    public static int field6136;

    @OriginalMember(owner = "client!wba", name = "g", descriptor = "I")
    public static int field6137;

    @OriginalMember(owner = "client!wba", name = "j", descriptor = "I")
    public static int field6140;

    @OriginalMember(owner = "client!wba", name = "k", descriptor = "I")
    public static int field6141;

    @OriginalMember(owner = "client!wba", name = "m", descriptor = "I")
    public static int field6143;

    @OriginalMember(owner = "client!wba", name = "a", descriptor = "(II)V")
    public final void method2491(int arg0, int arg1) {
        class19 var3 = this.field6138;
        synchronized (this.field6138) {
            if (arg1 < 64) {
                field6142 = 0.5353938F;
            }
            this.field6138.method83((byte) -2, arg0);
        }
        field6143++;
    }

    @OriginalMember(owner = "client!wba", name = "a", descriptor = "(B)V")
    public static final void method2492(byte arg0) {
        class626.field8849.method2575(0);
        field6131++;
        int var1 = class626.field8849.method2574(296813219, 8);
        if (class651.field9144 > var1) {
            for (int var2 = var1; var2 < class651.field9144; var2++) {
                class179.field2013[class517.field7365++] = class398.field5375[var2];
            }
        }
        if (class651.field9144 < var1) {
            throw new RuntimeException("gnpov1");
        }
        class651.field9144 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = class398.field5375[var3];
            class600 var5 = ((class214) class274.field3433.method3669((long) var4, arg0 - 34)).field2601;
            int var6 = class626.field8849.method2574(296813219, 1);
            if (var6 == 0) {
                class398.field5375[class651.field9144++] = var4;
                var5.field9452 = class678.field9539;
            } else {
                int var7 = class626.field8849.method2574(296813219, 2);
                if (var7 == 0) {
                    class398.field5375[class651.field9144++] = var4;
                    var5.field9452 = class678.field9539;
                    class8.field90[class645.field9107++] = var4;
                } else if (var7 == 1) {
                    class398.field5375[class651.field9144++] = var4;
                    var5.field9452 = class678.field9539;
                    int var8 = class626.field8849.method2574(296813219, 3);
                    var5.method3361(arg0 - 27799, var8, 1);
                    int var9 = class626.field8849.method2574(296813219, 1);
                    if (var9 == 1) {
                        class8.field90[class645.field9107++] = var4;
                    }
                } else if (var7 == 2) {
                    class398.field5375[class651.field9144++] = var4;
                    var5.field9452 = class678.field9539;
                    if (class626.field8849.method2574(arg0 + 296813186, 1) == 1) {
                        int var11 = class626.field8849.method2574(296813219, 3);
                        var5.method3361(-27766, var11, 2);
                        int var12 = class626.field8849.method2574(arg0 + 296813186, 3);
                        var5.method3361(arg0 ^ 0xFFFF93AB, var12, 2);
                    } else {
                        int var10 = class626.field8849.method2574(296813219, 3);
                        var5.method3361(-27766, var10, 0);
                    }
                    int var13 = class626.field8849.method2574(arg0 ^ 0x11B10282, 1);
                    if (var13 == 1) {
                        class8.field90[class645.field9107++] = var4;
                    }
                } else if (var7 == 3) {
                    class179.field2013[class517.field7365++] = var4;
                }
            }
        }
        if (arg0 != 33) {
            field6144 = null;
        }
    }

    @OriginalMember(owner = "client!wba", name = "a", descriptor = "(I)V")
    public final void method2493(int arg0) {
        class19 var2 = this.field6138;
        synchronized (this.field6138) {
            this.field6138.method80((byte) 98);
        }
        field6137++;
        if (arg0 != 0) {
            this.method2494(60, -50, 35, null, 16, 52);
        }
    }

    @OriginalMember(owner = "client!wba", name = "a", descriptor = "(IIILoa;II)Lvfa;")
    public final class266 method2494(int arg0, int arg1, int arg2, class228 arg3, int arg4, int arg5) {
        field6140++;
        class623[] var7 = null;
        class521 var8 = this.method2498(29, arg0);
        if (var8.field7392 != null) {
            var7 = new class623[var8.field7392.length];
            for (int var9 = 0; var9 < var7.length; var9++) {
                class459 var10 = arg3.method1373((byte) 115, var8.field7392[var9]);
                var7[var9] = new class623(var10.field6516, var10.field6513, var10.field6514, var10.field6522, var10.field6518, var10.field6525, var10.field6515, var10.field6524);
            }
        }
        int var11 = 67 % ((arg2 + 6) / 63);
        return new class266(var8.field7393, var7, var8.field7391, arg4, arg1, arg5);
    }

    @OriginalMember(owner = "client!wba", name = "b", descriptor = "(I)V")
    public static void method2495(int arg0) {
        field6144 = null;
        field6135 = null;
        field6134 = null;
        int var1 = -80 / ((-arg0 - 5) / 44);
    }

    @OriginalMember(owner = "client!wba", name = "a", descriptor = "(I[Ljava/lang/Object;II[J)V")
    public static final void method2496(int arg0, Object[] arg1, int arg2, int arg3, long[] arg4) {
        field6136++;
        if (arg2 > arg3) {
            int var5 = (arg3 + arg2) / 2;
            int var6 = arg3;
            long var7 = arg4[var5];
            arg4[var5] = arg4[arg2];
            arg4[arg2] = var7;
            Object var9 = arg1[var5];
            arg1[var5] = arg1[arg2];
            arg1[arg2] = var9;
            int var10 = ~var7 == Long.MIN_VALUE ? 0 : 1;
            for (int var11 = arg3; var11 < arg2; var11++) {
                if (arg4[var11] < ((long) (var10 & var11) + var7)) {
                    long var12 = arg4[var11];
                    arg4[var11] = arg4[var6];
                    arg4[var6] = var12;
                    Object var14 = arg1[var11];
                    arg1[var11] = arg1[var6];
                    arg1[var6++] = var14;
                }
            }
            arg4[arg2] = arg4[var6];
            arg4[var6] = var7;
            arg1[arg2] = arg1[var6];
            arg1[var6] = var9;
            method2496(-104, arg1, var6 - 1, arg3, arg4);
            method2496(-98, arg1, arg2, var6 + 1, arg4);
        }
        if (arg0 > -97) {
            method2492((byte) -28);
        }
    }

    @OriginalMember(owner = "client!wba", name = "a", descriptor = "(BZIIZ)I")
    public static final int method2497(byte arg0, boolean arg1, int arg2, int arg3, boolean arg4) {
        field6132++;
        class628 var5 = class555.method3150(arg2, 0, arg4);
        if (var5 == null) {
            return 0;
        }
        int var6 = 0;
        if (arg0 > -27) {
            field6142 = 1.7357572F;
        }
        for (int var7 = 0; var7 < var5.field8858.length; var7++) {
            if (var5.field8858[var7] >= 0 && var5.field8858[var7] < class19.field153.field522) {
                class487 var8 = class19.field153.method272(var5.field8858[var7], -11824);
                int var9 = var8.method2827(class53.field531.method1562(arg3, (byte) -96).field1859, arg3, 0);
                if (arg1) {
                    var6 += var5.field8850[var7] * var9;
                } else {
                    var6 += var9;
                }
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!wba", name = "b", descriptor = "(II)Lff;")
    private final class521 method2498(int arg0, int arg1) {
        field6133++;
        class19 var3 = this.field6138;
        class521 var4;
        synchronized (this.field6138) {
            var4 = (class521) this.field6138.method78(arg0 ^ arg0, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        class701 var5 = this.field6139;
        byte[] var6;
        synchronized (this.field6139) {
            var6 = this.field6139.method3854((byte) 32, 29, arg1);
        }
        class521 var7 = new class521();
        if (var6 != null) {
            var7.method2958(new class115(var6), -1);
        }
        class19 var8 = this.field6138;
        synchronized (this.field6138) {
            this.field6138.method92(1, (long) arg1, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!wba", name = "a", descriptor = "(Z)V")
    public final void method2499(boolean arg0) {
        class19 var2 = this.field6138;
        synchronized (this.field6138) {
            this.field6138.method88(110);
        }
        if (arg0) {
            field6134 = null;
        }
        field6141++;
    }

    @OriginalMember(owner = "client!wba", name = "<init>", descriptor = "(Lqh;ILtf;)V")
    public class435(class320 arg0, int arg1, class701 arg2) {
        this.field6139 = arg2;
        this.field6139.method3883(29, 0);
    }

    static {
        double var0 = 3.834951969714103E-4D;
        for (int var2 = 0; var2 < 16384; var2++) {
            field6134[var2] = (int) (Math.sin((double) var2 * var0) * 16384.0D);
            field6135[var2] = (int) (Math.cos((double) var2 * var0) * 16384.0D);
        }
        field6144 = new class305(81, -1);
    }
}
