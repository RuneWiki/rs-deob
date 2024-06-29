import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oc")
public class class59 implements Runnable {

    @OriginalMember(owner = "client!oc", name = "q", descriptor = "Lci;")
    private class230 field1076 = new class230();

    @OriginalMember(owner = "client!oc", name = "y", descriptor = "Z")
    private boolean field1084 = false;

    @OriginalMember(owner = "client!oc", name = "v", descriptor = "I")
    public int field1081 = 0;

    @OriginalMember(owner = "client!oc", name = "w", descriptor = "Ljava/lang/Thread;")
    private Thread field1082;

    @OriginalMember(owner = "client!oc", name = "h", descriptor = "Lka;")
    public static class243 field1067 = new class243();

    @OriginalMember(owner = "client!oc", name = "r", descriptor = "[I")
    public static int[] field1077 = new int[50];

    @OriginalMember(owner = "client!oc", name = "m", descriptor = "Lta;")
    public static class241 field1072 = new class241(4);

    @OriginalMember(owner = "client!oc", name = "u", descriptor = "I")
    public static int field1080 = 0;

    @OriginalMember(owner = "client!oc", name = "t", descriptor = "Lhj;")
    public static class69 field1079 = class181.method1318(" ", (byte) -106);

    @OriginalMember(owner = "client!oc", name = "x", descriptor = "[[I")
    public static int[][] field1083 = new int[104][104];

    @OriginalMember(owner = "client!oc", name = "z", descriptor = "Lhj;")
    public static class69 field1085 = class181.method1318("b12_full", (byte) -109);

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "I")
    public static int field1060;

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "I")
    public static int field1061;

    @OriginalMember(owner = "client!oc", name = "c", descriptor = "I")
    public static int field1062;

    @OriginalMember(owner = "client!oc", name = "d", descriptor = "I")
    public static int field1063;

    @OriginalMember(owner = "client!oc", name = "e", descriptor = "I")
    public static int field1064;

    @OriginalMember(owner = "client!oc", name = "f", descriptor = "I")
    public static int field1065;

    @OriginalMember(owner = "client!oc", name = "g", descriptor = "I")
    public static int field1066;

    @OriginalMember(owner = "client!oc", name = "i", descriptor = "I")
    public static int field1068;

    @OriginalMember(owner = "client!oc", name = "j", descriptor = "I")
    public static int field1069;

    @OriginalMember(owner = "client!oc", name = "l", descriptor = "I")
    public static int field1071;

    @OriginalMember(owner = "client!oc", name = "n", descriptor = "I")
    public static int field1073;

    @OriginalMember(owner = "client!oc", name = "o", descriptor = "I")
    public static int field1074;

    @OriginalMember(owner = "client!oc", name = "s", descriptor = "I")
    public static int field1078;

    @OriginalMember(owner = "client!oc", name = "p", descriptor = "Lba;")
    public static class162 field1075;

    @OriginalMember(owner = "client!oc", name = "k", descriptor = "Z")
    public static boolean field1070;

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(BILke;[B)Lnd;")
    public final class248 method354(byte arg0, int arg1, class105 arg2, byte[] arg3) {
        field1068++;
        class248 var5 = new class248();
        var5.field2987 = false;
        var5.field4533 = arg3;
        var5.field4531 = 2;
        var5.field4527 = arg2;
        if (arg0 >= -53) {
            field1079 = null;
        }
        var5.field44 = (long) arg1;
        this.method357(var5, 4733);
        return var5;
    }

    @OriginalMember(owner = "client!oc", name = "run", descriptor = "()V")
    public final void run() {
        while (!this.field1084) {
            class230 var1 = this.field1076;
            class248 var2;
            synchronized (this.field1076) {
                var2 = (class248) this.field1076.method1641(true);
                if (var2 == null) {
                    try {
                        this.field1076.wait();
                    } catch (InterruptedException var6) {
                    }
                    continue;
                }
                this.field1081--;
            }
            try {
                if (var2.field4531 == 2) {
                    var2.field4527.method795(var2.field4533.length, (int) var2.field44, (byte) -81, var2.field4533);
                } else if (var2.field4531 == 3) {
                    var2.field4533 = var2.field4527.method797((byte) 86, (int) var2.field44);
                }
            } catch (Exception var7) {
                class222.method1575((String) null, var7, 94);
            }
            var2.field2983 = false;
        }
        field1063++;
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(Lfh;B)Lcd;")
    public static final class27 method355(class128 arg0, byte arg1) {
        field1065++;
        class27 var2 = new class27();
        var2.field390 = arg0.method912(-91);
        var2.field387 = class80.method568(var2.field390, -40);
        if (arg1 > -98) {
            method361(3);
        }
        return var2;
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(ZJ)V")
    public static final void method356(boolean arg0, long arg1) {
        field1062++;
        if (arg1 <= 0L) {
            return;
        }
        if ((arg1 % 10L) == 0L) {
            class167.method1237(arg1 - 1L, (byte) 121);
            class167.method1237(1L, (byte) 126);
        } else {
            class167.method1237(arg1, (byte) 125);
        }
        if (arg0) {
            method356(true, -40L);
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(Lnd;I)V")
    private final void method357(class248 arg0, int arg1) {
        class230 var3 = this.field1076;
        synchronized (this.field1076) {
            if (arg1 != 4733) {
                method355((class128) null, (byte) -48);
            }
            this.field1076.method1643(arg0, 4096);
            this.field1081++;
            this.field1076.notifyAll();
        }
        field1071++;
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(B)V")
    public static void method358(byte arg0) {
        field1075 = null;
        int var1 = 107 / ((12 - arg0) / 41);
        field1067 = null;
        field1079 = null;
        field1077 = null;
        field1085 = null;
        field1083 = null;
        field1072 = null;
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(BILke;)Lnd;")
    public final class248 method359(byte arg0, int arg1, class105 arg2) {
        field1061++;
        class248 var4 = new class248();
        var4.field4531 = 3;
        var4.field2987 = false;
        var4.field4527 = arg2;
        var4.field44 = (long) arg1;
        this.method357(var4, 4733);
        if (arg0 != 69) {
            method358((byte) -28);
        }
        return var4;
    }

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "(B)V")
    public final void method360(byte arg0) {
        if (arg0 >= -22) {
            this.method357((class248) null, -97);
        }
        this.field1084 = true;
        class230 var2 = this.field1076;
        synchronized (this.field1076) {
            this.field1076.notifyAll();
        }
        field1064++;
        try {
            this.field1082.join();
        } catch (InterruptedException var3) {
        }
        this.field1082 = null;
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(I)[Lqb;")
    public static final class56[] method361(int arg0) {
        if (arg0 != 16342) {
            field1067 = null;
        }
        field1066++;
        class56[] var1 = new class56[class196.field3573];
        for (int var2 = 0; var2 < class196.field3573; var2++) {
            int var3 = class69.field1350[var2] * class113.field2167[var2];
            byte[] var4 = class157.field2919[var2];
            int[] var5 = new int[var3];
            for (int var6 = 0; var6 < var3; var6++) {
                var5[var6] = class50.field841[class69.method443(var4[var6], 255)];
            }
            var1[var2] = new class264(class229.field4196, class53.field941, class138.field2585[var2], class88.field1682[var2], class69.field1350[var2], class113.field2167[var2], var5);
        }
        class229.method1636((byte) 120);
        return var1;
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(IIIIIIILek;ZIILsf;II)Lsf;")
    public static final class92 method362(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class159 arg7, boolean arg8, int arg9, int arg10, class92 arg11, int arg12, int arg13) {
        field1060++;
        long var14 = ((long) arg3 << 48) + (long) ((arg12 << 16) + (arg13 << 24) + arg5) + ((long) arg10 << 32);
        class92 var16 = (class92) class5.field42.method1714(var14, (byte) -125);
        if (var16 == null) {
            byte var17;
            if (arg5 == 1) {
                var17 = 9;
            } else if (arg5 == 2) {
                var17 = 12;
            } else if (arg5 == 3) {
                var17 = 15;
            } else if (arg5 == 4) {
                var17 = 18;
            } else {
                var17 = 21;
            }
            int[] var18 = new int[] { 64, 96, 128 };
            byte var19 = 3;
            class74 var20 = new class74(var17 * var19 + 1, var19 * 2 * var17 + -var17, 0);
            int var21 = var20.method534(0, 0, 0);
            int[][] var22 = new int[var19][var17];
            for (int var23 = 0; var23 < var19; var23++) {
                int var30 = var18[var23];
                int var31 = var18[var23];
                for (int var32 = 0; var32 < var17; var32++) {
                    int var33 = (var32 << 11) / var17;
                    int var34 = class178.field3247[var33] * var30 + arg1 >> 16;
                    int var35 = class178.field3232[var33] * var31 + arg6 >> 16;
                    var22[var23][var32] = var20.method534(var34, 0, var35);
                }
            }
            for (int var24 = 0; var24 < var19; var24++) {
                int var25 = (var24 * 256 + 128) / var19;
                int var26 = 256 - var25;
                byte var27 = (byte) (arg12 * var26 + arg13 * var25 >> 8);
                short var28 = (short) (((arg3 & 0x7F) * var25 + (arg10 & 0x7F) * var26 & 0x7F00) + ((arg3 & 0x380) * var25 + (arg10 & 0x380) * var26 & 0x38000) + ((arg3 & 0xFC00) * var25 + (arg10 & 0xFC00) * var26 & 0xFC0000) >> 8);
                for (int var29 = 0; var29 < var17; var29++) {
                    if (var24 == 0) {
                        var20.method516(var21, var22[0][(var29 + 1) % var17], var22[0][var29], (byte) 1, var28, var27);
                    } else {
                        var20.method516(var22[var24 - 1][var29], var22[var24 - 1][(var29 + 1) % var17], var22[var24][(var29 + 1) % var17], (byte) 1, var28, var27);
                        var20.method516(var22[var24 - 1][var29], var22[var24][(var29 + 1) % var17], var22[var24][var29], (byte) 1, var28, var27);
                    }
                }
            }
            var16 = var20.method526(64, 768, -50, -10, -50);
            class5.field42.method1705((byte) 123, var16, var14);
        }
        int var36 = arg5 * 64 - 1;
        int var37 = -var36;
        int var38 = -var36;
        if (arg9 != -5) {
            field1077 = null;
        }
        int var39 = var36;
        int var40 = var36;
        int var41 = arg11.method670();
        if (arg8) {
            if (arg4 > 640 && arg4 < 1408) {
                var40 = var36 + 128;
            }
            if (arg4 > 1152 && arg4 < 1920) {
                var39 = var36 + 128;
            }
            if (arg4 > 1664 || arg4 < 384) {
                var38 -= 128;
            }
            if (arg4 > 128 && arg4 < 896) {
                var37 -= 128;
            }
        }
        int var42 = arg11.method660();
        if (var37 > var41) {
            var41 = var37;
        }
        int var43 = arg11.method657();
        if (var39 < var42) {
            var42 = var39;
        }
        if (var38 > var43) {
            var43 = var38;
        }
        class151 var44 = null;
        int var45 = arg11.method665();
        if (arg7 != null) {
            int var46 = arg7.field2962[arg2];
            var44 = class167.method1236(-24, var46 >> 16);
            arg2 = var46 & 0xFFFF;
        }
        if (var45 > var40) {
            var45 = var40;
        }
        class92 var47;
        if (var44 == null) {
            var47 = var16.method654(true, true);
            var47.method661((var42 - var41) / 2, 128, (var45 - var43) / 2);
            var47.method652((var41 + var42) / 2, 0, (var43 + var45) / 2);
        } else {
            var47 = var16.method654(!var44.method1133(arg2, -19747), true);
            var47.method661((var42 - var41) / 2, 128, (var45 - var43) / 2);
            var47.method652((var41 + var42) / 2, 0, (var43 + var45) / 2);
            var47.method651(var44, arg2);
        }
        if (arg4 != 0) {
            var47.method667(arg4);
        }
        class238 var48 = (class238) var47;
        if (class156.method1179(arg1 + var41, arg6 + var43, arg9 + 129, class52.field927) != arg0 || class156.method1179(arg1 + var42, arg6 + var45, 126, class52.field927) != arg0) {
            for (int var49 = 0; var49 < var48.field4316; var49++) {
                var48.field4323[var49] += class156.method1179(var48.field4344[var49] + arg1, var48.field4324[var49] + arg6, 34, class52.field927) - arg0;
            }
            var48.field4328 = false;
        }
        return var47;
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(Lke;ZI)Lnd;")
    public final class248 method363(class105 arg0, boolean arg1, int arg2) {
        field1074++;
        class248 var4 = new class248();
        var4.field4531 = 1;
        class230 var5 = this.field1076;
        synchronized (this.field1076) {
            class248 var6 = (class248) this.field1076.method1639(true);
            while (true) {
                if (var6 == null) {
                    break;
                }
                if ((long) arg2 == var6.field44 && var6.field4527 == arg0 && var6.field4531 == 2) {
                    var4.field2983 = false;
                    var4.field4533 = var6.field4533;
                    return var4;
                }
                var6 = (class248) this.field1076.method1640(true);
            }
        }
        var4.field4533 = arg0.method797((byte) -106, arg2);
        var4.field2987 = true;
        var4.field2983 = arg1;
        return var4;
    }

    @OriginalMember(owner = "client!oc", name = "<init>", descriptor = "()V")
    public class59() {
        class86 var1 = class36.field508.method232(this, 5, (byte) 107);
        while (var1.field1663 == 0) {
            method356(false, 10L);
        }
        if (var1.field1663 == 2) {
            throw new RuntimeException();
        }
        this.field1082 = (Thread) var1.field1666;
    }
}
