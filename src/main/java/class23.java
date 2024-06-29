import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wi")
public class class23 extends class36 {

    @OriginalMember(owner = "client!wi", name = "fb", descriptor = "Z")
    private boolean field337 = false;

    @OriginalMember(owner = "client!wi", name = "lb", descriptor = "I")
    private int field343 = -1;

    @OriginalMember(owner = "client!wi", name = "sb", descriptor = "Z")
    private volatile boolean field350 = false;

    @OriginalMember(owner = "client!wi", name = "Ab", descriptor = "I")
    private int field358;

    @OriginalMember(owner = "client!wi", name = "nb", descriptor = "Lkl;")
    private class75 field345;

    @OriginalMember(owner = "client!wi", name = "gb", descriptor = "Lkl;")
    private class75 field338;

    @OriginalMember(owner = "client!wi", name = "jb", descriptor = "Lck;")
    public static class119 field341 = class298.method1987((byte) 120, "Clientscript error in: ");

    @OriginalMember(owner = "client!wi", name = "ob", descriptor = "[Lba;")
    public static class292[] field346 = new class292[2048];

    @OriginalMember(owner = "client!wi", name = "vb", descriptor = "I")
    public static int field353 = 0;

    @OriginalMember(owner = "client!wi", name = "xb", descriptor = "Lck;")
    private static class119 field355 = class298.method1987((byte) 21, "Discard");

    @OriginalMember(owner = "client!wi", name = "ib", descriptor = "Lck;")
    public static class119 field340 = field355;

    @OriginalMember(owner = "client!wi", name = "qb", descriptor = "[I")
    public static int[] field348 = new int[32768];

    @OriginalMember(owner = "client!wi", name = "Bb", descriptor = "I")
    public static int field359 = 0;

    @OriginalMember(owner = "client!wi", name = "yb", descriptor = "Lvh;")
    public static class212 field356 = new class212(16);

    @OriginalMember(owner = "client!wi", name = "Fb", descriptor = "Lck;")
    public static class119 field363 = class298.method1987((byte) 59, "Lade Schrifts-=tze )2 ");

    @OriginalMember(owner = "client!wi", name = "Eb", descriptor = "Lck;")
    public static class119 field362 = class298.method1987((byte) 100, "Sie k-Onnen sich selbst nicht selbst auf Ihre Ignorieren)2Liste setzen(Q");

    @OriginalMember(owner = "client!wi", name = "db", descriptor = "I")
    public static int field335;

    @OriginalMember(owner = "client!wi", name = "eb", descriptor = "I")
    public static int field336;

    @OriginalMember(owner = "client!wi", name = "kb", descriptor = "I")
    public static int field342;

    @OriginalMember(owner = "client!wi", name = "mb", descriptor = "I")
    public static int field344;

    @OriginalMember(owner = "client!wi", name = "pb", descriptor = "I")
    private int field347;

    @OriginalMember(owner = "client!wi", name = "tb", descriptor = "I")
    public static int field351;

    @OriginalMember(owner = "client!wi", name = "ub", descriptor = "I")
    public static int field352;

    @OriginalMember(owner = "client!wi", name = "wb", descriptor = "I")
    public static int field354;

    @OriginalMember(owner = "client!wi", name = "zb", descriptor = "I")
    public static int field357;

    @OriginalMember(owner = "client!wi", name = "Cb", descriptor = "I")
    public static int field360;

    @OriginalMember(owner = "client!wi", name = "Db", descriptor = "I")
    private int field361;

    @OriginalMember(owner = "client!wi", name = "rb", descriptor = "Lva;")
    public static class36 field349;

    @OriginalMember(owner = "client!wi", name = "hb", descriptor = "[Z")
    private volatile boolean[] field339;

    @OriginalMember(owner = "client!wi", name = "<init>", descriptor = "(Lkl;Lkl;IZZZ)V", line = 3)
    public class23(class75 arg0, class75 arg1, int arg2, boolean arg3, boolean arg4, boolean arg5) {
        super(arg3, arg4);
        this.field358 = arg2;
        this.field345 = arg0;
        this.field338 = arg1;
        this.field337 = arg5;
        class217.method1372(this.field358, this, false);
    }

    @OriginalMember(owner = "client!wi", name = "f", descriptor = "(I)V", line = 30)
    private final void method173(int arg0) {
        this.field339 = new boolean[this.field532.length];
        field342++;
        if (arg0 >= -40) {
            return;
        }
        for (int var2 = 0; var2 < this.field339.length; var2++) {
            this.field339[var2] = false;
        }
        if (this.field345 == null) {
            this.field350 = true;
            return;
        }
        this.field343 = -1;
        for (int var3 = 0; var3 < this.field339.length; var3++) {
            if (this.field543[var3] > 0) {
                class234.method1509(false, this, this.field345, var3);
                this.field343 = var3;
            }
        }
        if (this.field343 == -1) {
            this.field350 = true;
        }
    }

    @OriginalMember(owner = "client!wi", name = "e", descriptor = "(II)V", line = 85)
    public final void method174(int arg0, int arg1) {
        field335++;
        if (arg1 > -113) {
            field363 = (class119) null;
        }
        if (this.method276(arg0, (byte) -100)) {
            class204.method1291(this.field358, arg0, (byte) 40);
        }
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(II)I", line = 100)
    public final int method175(int arg0, int arg1) {
        if (arg1 != 8) {
            field359 = -17;
        }
        field336++;
        if (!this.method276(arg0, (byte) -105)) {
            return 0;
        } else if (this.field532[arg0] == null) {
            return this.field339[arg0] ? 100 : class222.method1412(this.field358, arg0, 6);
        } else {
            return 100;
        }
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "()V", line = 138)
    public static final void method176() {
        int var0 = class206.field3273[class269.field4433];
        class169[] var1 = class206.field3287[class269.field4433];
        class19.field257 = 0;
        label194: for (int var2 = 0; var2 < var0; var2++) {
            class169 var3 = var1[var2];
            if (class260.field4170 != null) {
                for (int var4 = 0; var4 < class260.field4170.length; var4++) {
                    if (class260.field4170[var4] != -1000000 && (var3.field2665 <= class260.field4170[var4] || var3.field2668 <= class260.field4170[var4]) && (var3.field2675 <= class212.field3400[var4] || var3.field2671 <= class212.field3400[var4]) && (var3.field2675 >= class150.field2386[var4] || var3.field2671 >= class150.field2386[var4]) && (var3.field2659 <= class262.field4247[var4] || var3.field2664 <= class262.field4247[var4]) && (var3.field2659 >= class220.field3531[var4] || var3.field2664 >= class220.field3531[var4])) {
                        continue label194;
                    }
                }
            }
            if (var3.field2676 == 1) {
                int var5 = var3.field2658 + class153.field2442 - class257.field4121;
                if (var5 >= 0 && var5 <= class153.field2442 + class153.field2442) {
                    int var6 = var3.field2673 + class153.field2442 - class208.field3327;
                    if (var6 < 0) {
                        var6 = 0;
                    }
                    int var7 = var3.field2667 + class153.field2442 - class208.field3327;
                    if (var7 > class153.field2442 + class153.field2442) {
                        var7 = class153.field2442 + class153.field2442;
                    }
                    boolean var8 = false;
                    while (var6 <= var7) {
                        if (class168.field2648[var5][var6++]) {
                            var8 = true;
                            break;
                        }
                    }
                    if (var8) {
                        int var9 = class89.field1373 - var3.field2675;
                        if (var9 > 32) {
                            var3.field2654 = 1;
                        } else {
                            if (var9 >= -32) {
                                continue;
                            }
                            var3.field2654 = 2;
                            var9 = -var9;
                        }
                        var3.field2656 = (var3.field2659 - class208.field3314 << 8) / var9;
                        var3.field2657 = (var3.field2664 - class208.field3314 << 8) / var9;
                        var3.field2661 = (var3.field2665 - class220.field3527 << 8) / var9;
                        var3.field2674 = (var3.field2668 - class220.field3527 << 8) / var9;
                        class289.field4759[class19.field257++] = var3;
                    }
                }
            } else if (var3.field2676 == 2) {
                int var10 = var3.field2673 + class153.field2442 - class208.field3327;
                if (var10 >= 0 && var10 <= class153.field2442 + class153.field2442) {
                    int var11 = var3.field2658 + class153.field2442 - class257.field4121;
                    if (var11 < 0) {
                        var11 = 0;
                    }
                    int var12 = var3.field2669 + class153.field2442 - class257.field4121;
                    if (var12 > class153.field2442 + class153.field2442) {
                        var12 = class153.field2442 + class153.field2442;
                    }
                    boolean var13 = false;
                    while (var11 <= var12) {
                        if (class168.field2648[var11++][var10]) {
                            var13 = true;
                            break;
                        }
                    }
                    if (var13) {
                        int var14 = class208.field3314 - var3.field2659;
                        if (var14 > 32) {
                            var3.field2654 = 3;
                        } else {
                            if (var14 >= -32) {
                                continue;
                            }
                            var3.field2654 = 4;
                            var14 = -var14;
                        }
                        var3.field2660 = (var3.field2675 - class89.field1373 << 8) / var14;
                        var3.field2679 = (var3.field2671 - class89.field1373 << 8) / var14;
                        var3.field2661 = (var3.field2665 - class220.field3527 << 8) / var14;
                        var3.field2674 = (var3.field2668 - class220.field3527 << 8) / var14;
                        class289.field4759[class19.field257++] = var3;
                    }
                }
            } else if (var3.field2676 == 4) {
                int var15 = var3.field2665 - class220.field3527;
                if (var15 > 128) {
                    int var16 = var3.field2673 + class153.field2442 - class208.field3327;
                    if (var16 < 0) {
                        var16 = 0;
                    }
                    int var17 = var3.field2667 + class153.field2442 - class208.field3327;
                    if (var17 > class153.field2442 + class153.field2442) {
                        var17 = class153.field2442 + class153.field2442;
                    }
                    if (var16 <= var17) {
                        int var18 = var3.field2658 + class153.field2442 - class257.field4121;
                        if (var18 < 0) {
                            var18 = 0;
                        }
                        int var19 = var3.field2669 + class153.field2442 - class257.field4121;
                        if (var19 > class153.field2442 + class153.field2442) {
                            var19 = class153.field2442 + class153.field2442;
                        }
                        boolean var20 = false;
                        label166: for (int var21 = var18; var21 <= var19; var21++) {
                            for (int var22 = var16; var22 <= var17; var22++) {
                                if (class168.field2648[var21][var22]) {
                                    var20 = true;
                                    break label166;
                                }
                            }
                        }
                        if (var20) {
                            var3.field2654 = 5;
                            var3.field2660 = (var3.field2675 - class89.field1373 << 8) / var15;
                            var3.field2679 = (var3.field2671 - class89.field1373 << 8) / var15;
                            var3.field2656 = (var3.field2659 - class208.field3314 << 8) / var15;
                            var3.field2657 = (var3.field2664 - class208.field3314 << 8) / var15;
                            class289.field4759[class19.field257++] = var3;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!wi", name = "b", descriptor = "(II)V", line = 364)
    public final void method177(int arg0, int arg1) {
        field360++;
        if (arg0 <= 36 || !this.method276(arg1, (byte) -89)) {
            return;
        }
        if (this.field345 == null || this.field339 == null || !this.field339[arg1]) {
            class87.method593((byte) 2, this.field524[arg1], true, 455041648, this.field358, this, arg1);
        } else {
            class181.method1156(this, 0, this.field345, arg1);
        }
    }

    @OriginalMember(owner = "client!wi", name = "b", descriptor = "(III)V", line = 383)
    public final void method178(int arg0, int arg1, int arg2) {
        this.field361 = arg1;
        if (arg2 != -2210) {
            return;
        }
        this.field347 = arg0;
        field357++;
        if (this.field338 == null) {
            class87.method593((byte) 0, this.field347, true, 455041648, 255, this, this.field358);
        } else {
            class181.method1156(this, 0, this.field338, this.field358);
        }
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "([BLkl;IZB)V", line = 403)
    public final void method179(byte[] arg0, class75 arg1, int arg2, boolean arg3, byte arg4) {
        field344++;
        if (arg4 <= 55) {
            return;
        }
        if (this.field338 != arg1) {
            if (!arg3 && this.field343 == arg2) {
                this.field350 = true;
            }
            if (arg0 == null || arg0.length <= 2) {
                this.field339[arg2] = false;
                if (this.field337 || arg3) {
                    class87.method593((byte) 2, this.field524[arg2], arg3, 455041648, this.field358, this, arg2);
                }
                return;
            }
            class86.field1293.reset();
            class86.field1293.update(arg0, 0, arg0.length - 2);
            int var6 = (int) class86.field1293.getValue();
            int var7 = ((arg0[arg0.length - 2] & 0xFF) << 8) + (arg0[arg0.length - 1] & 0xFF);
            if (this.field524[arg2] != var6 || this.field505[arg2] != var7) {
                this.field339[arg2] = false;
                if (this.field337 || arg3) {
                    class87.method593((byte) 2, this.field524[arg2], arg3, 455041648, this.field358, this, arg2);
                }
                return;
            }
            this.field339[arg2] = true;
            if (arg3) {
                this.field532[arg2] = class151.method975((byte) -57, false, arg0);
            }
            return;
        }
        if (this.field350) {
            throw new RuntimeException();
        }
        if (arg0 == null) {
            class87.method593((byte) 0, this.field347, true, 455041648, 255, this, this.field358);
            return;
        }
        class86.field1293.reset();
        class86.field1293.update(arg0, 0, arg0.length);
        int var8 = (int) class86.field1293.getValue();
        if (this.field347 != var8) {
            class87.method593((byte) 0, this.field347, true, 455041648, 255, this, this.field358);
            return;
        }
        class3 var9;
        try {
            var9 = new class3(class299.method1994(arg0, 9));
        } catch (RuntimeException var13) {
            class87.method593((byte) 0, this.field347, true, 455041648, 255, this, this.field358);
            return;
        }
        int var11 = var9.method64((byte) -97);
        if (var11 != 5 && var11 != 6) {
            class87.method593((byte) 0, this.field347, true, 455041648, 255, this, this.field358);
            return;
        }
        int var12 = 0;
        if (var11 >= 6) {
            var12 = var9.method71(-668527048);
        }
        if (this.field361 != var12) {
            class87.method593((byte) 0, this.field347, true, 455041648, 255, this, this.field358);
            return;
        }
        this.method277(arg0, 86);
        this.method173(-51);
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(Z)V", line = 541)
    public static void method180(boolean arg0) {
        field355 = null;
        field349 = null;
        field340 = null;
        field341 = null;
        field346 = null;
        field356 = null;
        field362 = null;
        if (arg0) {
            method182((byte[]) null, 105);
        }
        field348 = null;
        field363 = null;
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(B)I", line = 562)
    public final int method181(byte arg0) {
        field351++;
        if (this.field350) {
            return 100;
        } else if (this.field532 == null) {
            int var2 = -82 % ((61 - arg0) / 48);
            int var3 = class222.method1412(255, this.field358, 6);
            if (var3 >= 100) {
                var3 = 99;
            }
            return var3;
        } else {
            return 99;
        }
    }

    @OriginalMember(owner = "client!wi", name = "b", descriptor = "([BI)V", line = 587)
    public static final void method182(byte[] arg0, int arg1) {
        field352++;
        int var2 = 43 / ((arg1 + 30) / 46);
        int var3 = 0;
        while (true) {
            while (arg0.length > var3) {
                int var4 = (arg0[var3++] & 0xFF) * 64 - class142.field2263;
                int var5 = (arg0[var3++] & 0xFF) * 64 - class221.field3552;
                if (var4 > 0 && var5 > 0 && (var4 + 64) < class126.field1938 && var5 + 64 < class258.field4137) {
                    int var6 = var4 >> 6;
                    int var7 = class258.field4137 - var5 - 1 >> 6;
                    for (int var8 = 0; var8 < 64; var8++) {
                        for (int var9 = -64; var9 < 0; var9++) {
                            byte var10 = arg0[var3++];
                            if (var10 != 0) {
                                if (class196.field3133[var6][var7] == null) {
                                    class196.field3133[var6][var7] = new byte[4096];
                                }
                                class196.field3133[var6][var7][(-(var9 + 1) << 6) + var8] = var10;
                                byte var11 = arg0[var3++];
                                if (class236.field3796[var6][var7] == null) {
                                    class236.field3796[var6][var7] = new byte[4096];
                                }
                                class236.field3796[var6][var7][(-(var9 + 1) << 6) + var8] = var11;
                            }
                        }
                    }
                } else {
                    for (int var12 = -4096; var12 < 0; var12++) {
                        byte var13 = arg0[var3++];
                        if (var13 != 0) {
                            var3++;
                        }
                    }
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(ZI[BIZ)V", line = 687)
    public final void method183(boolean arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
        if (arg3 <= 80) {
            method180(false);
        }
        field354++;
        if (arg4) {
            if (this.field350) {
                throw new RuntimeException();
            }
            if (this.field338 != null) {
                class65.method480(arg2, this.field338, (byte) 112, this.field358);
            }
            this.method277(arg2, 127);
            this.method173(-128);
            return;
        }
        arg2[arg2.length - 2] = (byte) (this.field505[arg1] >> 8);
        arg2[arg2.length - 1] = (byte) this.field505[arg1];
        if (this.field345 != null) {
            class65.method480(arg2, this.field345, (byte) -108, arg1);
            this.field339[arg1] = true;
        }
        if (arg0) {
            this.field532[arg1] = class151.method975((byte) -57, false, arg2);
        }
    }
}
