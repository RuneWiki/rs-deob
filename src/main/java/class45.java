import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tf")
public class class45 {

    @OriginalMember(owner = "client!tf", name = "b", descriptor = "[I")
    private int[] field675 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!tf", name = "q", descriptor = "Z")
    public boolean field690 = false;

    @OriginalMember(owner = "client!tf", name = "l", descriptor = "I")
    public int field685 = -1;

    @OriginalMember(owner = "client!tf", name = "e", descriptor = "[[S")
    public static short[][] field678 = new short[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

    @OriginalMember(owner = "client!tf", name = "p", descriptor = "Ljava/lang/String;")
    public static String field689 = "Loaded client variable data";

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "I")
    public static int field674;

    @OriginalMember(owner = "client!tf", name = "d", descriptor = "I")
    public static int field677;

    @OriginalMember(owner = "client!tf", name = "h", descriptor = "I")
    public static int field681;

    @OriginalMember(owner = "client!tf", name = "i", descriptor = "I")
    public static int field682;

    @OriginalMember(owner = "client!tf", name = "j", descriptor = "I")
    public static int field683;

    @OriginalMember(owner = "client!tf", name = "m", descriptor = "I")
    public static int field686;

    @OriginalMember(owner = "client!tf", name = "o", descriptor = "I")
    public static int field688;

    @OriginalMember(owner = "client!tf", name = "s", descriptor = "I")
    public static int field692;

    @OriginalMember(owner = "client!tf", name = "r", descriptor = "Lir;")
    public static class185 field691;

    @OriginalMember(owner = "client!tf", name = "n", descriptor = "[I")
    private int[] field687;

    @OriginalMember(owner = "client!tf", name = "c", descriptor = "[S")
    private short[] field676;

    @OriginalMember(owner = "client!tf", name = "f", descriptor = "[S")
    private short[] field679;

    @OriginalMember(owner = "client!tf", name = "g", descriptor = "[S")
    private short[] field680;

    @OriginalMember(owner = "client!tf", name = "k", descriptor = "[S")
    private short[] field684;

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(I)Ld;")
    public final class9 method322(int arg0) {
        field686++;
        class9[] var2 = new class9[5];
        int var3 = 0;
        class185 var4 = class333.field4897;
        synchronized (class333.field4897) {
            for (int var5 = 0; var5 < 5; var5++) {
                if (this.field675[var5] != -1) {
                    var2[var3++] = class393.method2524(class333.field4897, 0, this.field675[var5], (byte) -28);
                }
            }
        }
        class9 var6 = new class9(var2, var3);
        if (this.field684 != null) {
            for (int var7 = 0; var7 < this.field684.length; var7++) {
                var6.method65(this.field680[var7], false, this.field684[var7]);
            }
        }
        if (this.field679 != null) {
            for (int var8 = 0; var8 < this.field679.length; var8++) {
                var6.method62(this.field679[var8], this.field676[var8], -2);
            }
        }
        if (arg0 != 21915) {
            this.field675 = null;
        }
        return var6;
    }

    @OriginalMember(owner = "client!tf", name = "b", descriptor = "(I)Z")
    public final boolean method323(int arg0) {
        field674++;
        if (this.field687 == null) {
            return true;
        }
        boolean var2 = true;
        class185 var3 = class333.field4897;
        synchronized (class333.field4897) {
            if (arg0 != 2) {
                this.method327(-84);
            }
            for (int var4 = 0; var4 < this.field687.length; var4++) {
                if (!class333.field4897.method1214((byte) -111, this.field687[var4], 0)) {
                    var2 = false;
                }
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(ILfb;I)V")
    private final void method324(int arg0, class341 arg1, int arg2) {
        field688++;
        if (arg2 == 1) {
            this.field685 = arg1.method2233((byte) 104);
        } else if (arg2 == 2) {
            int var8 = arg1.method2233((byte) 104);
            this.field687 = new int[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field687[var9] = arg1.method2239(-1076227960);
            }
        } else if (arg2 == 3) {
            this.field690 = true;
        } else if (arg2 == 40) {
            int var4 = arg1.method2233((byte) 104);
            this.field680 = new short[var4];
            this.field684 = new short[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field684[var5] = (short) arg1.method2239(-1076227960);
                this.field680[var5] = (short) arg1.method2239(-1076227960);
            }
        } else if (arg2 == 41) {
            int var6 = arg1.method2233((byte) 104);
            this.field676 = new short[var6];
            this.field679 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field679[var7] = (short) arg1.method2239(-1076227960);
                this.field676[var7] = (short) arg1.method2239(-1076227960);
            }
        } else if (arg2 >= 60 && arg2 < 70) {
            this.field675[arg2 - 60] = arg1.method2239(-1076227960);
        }
        if (arg0 < 87) {
            field691 = null;
        }
    }

    @OriginalMember(owner = "client!tf", name = "c", descriptor = "(I)Z")
    public final boolean method325(int arg0) {
        field692++;
        boolean var2 = true;
        class185 var3 = class333.field4897;
        synchronized (class333.field4897) {
            int var4 = 0;
            while (true) {
                if (var4 >= 5) {
                    break;
                }
                if (this.field675[var4] != -1 && !class333.field4897.method1214((byte) -111, this.field675[var4], 0)) {
                    var2 = false;
                }
                var4++;
            }
        }
        if (arg0 < 62) {
            this.method322(74);
        }
        return var2;
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(Lfb;B)V")
    public final void method326(class341 arg0, byte arg1) {
        if (arg1 < 22) {
            field689 = null;
        }
        while (true) {
            int var3 = arg0.method2233((byte) 104);
            if (var3 == 0) {
                field683++;
                return;
            }
            this.method324(93, arg0, var3);
        }
    }

    @OriginalMember(owner = "client!tf", name = "d", descriptor = "(I)Ld;")
    public final class9 method327(int arg0) {
        field677++;
        if (this.field687 == null) {
            return null;
        }
        class9[] var2 = new class9[this.field687.length];
        class185 var3 = class333.field4897;
        synchronized (class333.field4897) {
            int var4 = 0;
            while (true) {
                if (var4 >= this.field687.length) {
                    break;
                }
                var2[var4] = class393.method2524(class333.field4897, 0, this.field687[var4], (byte) -85);
                var4++;
            }
        }
        int var5 = 122 / ((arg0 + 64) / 53);
        class9 var6;
        if (var2.length == 1) {
            var6 = var2[0];
        } else {
            var6 = new class9(var2, var2.length);
        }
        if (var6 == null) {
            return null;
        }
        if (this.field684 != null) {
            for (int var7 = 0; var7 < this.field684.length; var7++) {
                var6.method65(this.field680[var7], false, this.field684[var7]);
            }
        }
        if (this.field679 != null) {
            for (int var8 = 0; var8 < this.field679.length; var8++) {
                var6.method62(this.field679[var8], this.field676[var8], -2);
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(B)V")
    public static void method328(byte arg0) {
        field691 = null;
        int var1 = -85 % ((arg0 - 65) / 36);
        field678 = null;
        field689 = null;
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(Lnb;IIIII)V")
    public static final void method329(class340 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        arg0.field5014 = 0;
        label58: for (int var6 = arg2; var6 <= arg4; var6++) {
            label56: for (int var7 = arg3; var7 <= arg5; var7++) {
                int var8 = class131.field1714[arg1][var6][var7];
                int var9 = 0;
                while (true) {
                    label51: while (true) {
                        if (var9 > 24) {
                            continue label56;
                        }
                        int var10 = var8 >>> var9 & 0xFF;
                        if (var10 <= 0) {
                            continue label56;
                        }
                        class64 var11 = class280.field4131[var10 - 1];
                        for (int var12 = 0; var12 < arg0.field5014; var12++) {
                            if (arg0.field5015[var12] == var11) {
                                var9 += 8;
                                continue label51;
                            }
                        }
                        arg0.field5015[arg0.field5014++] = var11;
                        if (arg0.field5014 == 4) {
                            break label58;
                        }
                        var9 += 8;
                    }
                }
            }
        }
        for (int var13 = arg0.field5014; var13 < 4; var13++) {
            arg0.field5015[var13] = null;
        }
    }
}
