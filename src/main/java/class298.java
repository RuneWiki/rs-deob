import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ofa")
public class class298 {

    @OriginalMember(owner = "client!ofa", name = "q", descriptor = "I")
    public int field4454;

    @OriginalMember(owner = "client!ofa", name = "a", descriptor = "[B")
    private byte[] field4438;

    @OriginalMember(owner = "client!ofa", name = "r", descriptor = "[I")
    public static int[] field4455 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!ofa", name = "f", descriptor = "I")
    public static int field4443;

    @OriginalMember(owner = "client!ofa", name = "g", descriptor = "I")
    public int field4444;

    @OriginalMember(owner = "client!ofa", name = "h", descriptor = "I")
    public static int field4445;

    @OriginalMember(owner = "client!ofa", name = "j", descriptor = "I")
    public int field4447;

    @OriginalMember(owner = "client!ofa", name = "p", descriptor = "I")
    public static int field4453;

    @OriginalMember(owner = "client!ofa", name = "t", descriptor = "I")
    public int field4457;

    @OriginalMember(owner = "client!ofa", name = "i", descriptor = "Lav;")
    public class585 field4446;

    @OriginalMember(owner = "client!ofa", name = "c", descriptor = "[I")
    public int[] field4440;

    @OriginalMember(owner = "client!ofa", name = "d", descriptor = "[I")
    public int[] field4441;

    @OriginalMember(owner = "client!ofa", name = "e", descriptor = "[I")
    public int[] field4442;

    @OriginalMember(owner = "client!ofa", name = "m", descriptor = "[I")
    public int[] field4450;

    @OriginalMember(owner = "client!ofa", name = "n", descriptor = "[I")
    public int[] field4451;

    @OriginalMember(owner = "client!ofa", name = "o", descriptor = "[I")
    public int[] field4452;

    @OriginalMember(owner = "client!ofa", name = "s", descriptor = "[Lav;")
    public class585[] field4456;

    @OriginalMember(owner = "client!ofa", name = "k", descriptor = "[[B")
    public byte[][] field4448;

    @OriginalMember(owner = "client!ofa", name = "u", descriptor = "[[B")
    public static byte[][] field4458;

    @OriginalMember(owner = "client!ofa", name = "b", descriptor = "[[I")
    public int[][] field4439;

    @OriginalMember(owner = "client!ofa", name = "l", descriptor = "[[I")
    public int[][] field4449;

    @OriginalMember(owner = "client!ofa", name = "a", descriptor = "(IIB)I")
    public static final int method1858(int arg0, int arg1, byte arg2) {
        if (arg2 != -94) {
            field4455 = null;
        }
        field4453++;
        int var3 = arg1 >>> 31;
        return (arg1 + var3) / arg0 - var3;
    }

    @OriginalMember(owner = "client!ofa", name = "a", descriptor = "(III)Z")
    public static final boolean method1859(int arg0, int arg1, int arg2) {
        field4443++;
        if (class67.method545(true, arg0, arg2)) {
            if (arg1 != 19308) {
                field4455 = null;
            }
            return class45.method250(540800, arg0, arg2) | (arg2 & 0xB000) != 0 | class627.method3488(arg0, arg2, (byte) 75) ? true : (arg0 & 0x37) == 0 & (class233.method1473(-104, arg2, arg0) | class117.method854(arg0, (byte) -82, arg2));
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ofa", name = "a", descriptor = "(JJ)J")
    public static long method1860(long arg0, long arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!ofa", name = "a", descriptor = "(I)V")
    public static void method1861(int arg0) {
        int var1 = 124 / ((70 - arg0) / 33);
        field4458 = null;
        field4455 = null;
    }

    @OriginalMember(owner = "client!ofa", name = "a", descriptor = "([BZ)V")
    private final void method1862(byte[] arg0, boolean arg1) {
        if (arg1) {
            this.field4454 = 61;
        }
        field4445++;
        class96 var3 = new class96(class623.method3465(90, arg0));
        int var4 = var3.method718(83);
        if (var4 < 5 || var4 > 6) {
            throw new RuntimeException();
        }
        if (var4 < 6) {
            this.field4444 = 0;
        } else {
            this.field4444 = var3.method714(false);
        }
        int var5 = var3.method718(-52);
        boolean var6 = (var5 & 0x1) != 0;
        boolean var7 = (var5 & 0x2) != 0;
        this.field4457 = var3.method743((byte) -31);
        int var8 = 0;
        this.field4442 = new int[this.field4457];
        int var9 = -1;
        for (int var10 = 0; var10 < this.field4457; var10++) {
            this.field4442[var10] = var8 += var3.method743((byte) -14);
            if (this.field4442[var10] > var9) {
                var9 = this.field4442[var10];
            }
        }
        this.field4447 = var9 + 1;
        this.field4440 = new int[this.field4447];
        this.field4451 = new int[this.field4447];
        if (var7) {
            this.field4448 = new byte[this.field4447][];
        }
        this.field4441 = new int[this.field4447];
        this.field4449 = new int[this.field4447][];
        this.field4452 = new int[this.field4447];
        if (var6) {
            this.field4450 = new int[this.field4447];
            for (int var11 = 0; var11 < this.field4447; var11++) {
                this.field4450[var11] = -1;
            }
            for (int var12 = 0; var12 < this.field4457; var12++) {
                this.field4450[this.field4442[var12]] = var3.method714(arg1);
            }
            this.field4446 = new class585(this.field4450);
        }
        for (int var13 = 0; var13 < this.field4457; var13++) {
            this.field4440[this.field4442[var13]] = var3.method714(arg1);
        }
        if (var7) {
            for (int var14 = 0; var14 < this.field4457; var14++) {
                byte[] var15 = new byte[64];
                var3.method719(var15, 64, -7861, 0);
                this.field4448[this.field4442[var14]] = var15;
            }
        }
        for (int var16 = 0; var16 < this.field4457; var16++) {
            this.field4451[this.field4442[var16]] = var3.method714(false);
        }
        for (int var17 = 0; var17 < this.field4457; var17++) {
            this.field4441[this.field4442[var17]] = var3.method743((byte) -28);
        }
        for (int var18 = 0; var18 < this.field4457; var18++) {
            int var25 = this.field4442[var18];
            int var26 = 0;
            int var27 = this.field4441[var25];
            int var28 = -1;
            this.field4449[var25] = new int[var27];
            for (int var29 = 0; var29 < var27; var29++) {
                int var30 = this.field4449[var25][var29] = var26 += var3.method743((byte) -126);
                if (var30 > var28) {
                    var28 = var30;
                }
            }
            this.field4452[var25] = var28 + 1;
            if ((var28 + 1) == var27) {
                this.field4449[var25] = null;
            }
        }
        if (!var6) {
            return;
        }
        this.field4456 = new class585[var9 + 1];
        this.field4439 = new int[var9 + 1][];
        for (int var19 = 0; var19 < this.field4457; var19++) {
            int var20 = this.field4442[var19];
            int var21 = this.field4441[var20];
            this.field4439[var20] = new int[this.field4452[var20]];
            for (int var22 = 0; var22 < this.field4452[var20]; var22++) {
                this.field4439[var20][var22] = -1;
            }
            for (int var23 = 0; var23 < var21; var23++) {
                int var24;
                if (this.field4449[var20] == null) {
                    var24 = var23;
                } else {
                    var24 = this.field4449[var20][var23];
                }
                this.field4439[var20][var24] = var3.method714(arg1);
            }
            this.field4456[var20] = new class585(this.field4439[var20]);
        }
    }

    @OriginalMember(owner = "client!ofa", name = "<init>", descriptor = "([BI[B)V")
    public class298(byte[] arg0, int arg1, byte[] arg2) {
        this.field4454 = class528.method2931((byte) -83, arg0.length, arg0);
        if (this.field4454 != arg1) {
            throw new RuntimeException();
        }
        if (arg2 != null) {
            if (arg2.length != 64) {
                throw new RuntimeException();
            }
            this.field4438 = class424.method2405(arg0.length, arg0, 0, -55);
            for (int var4 = 0; var4 < 64; var4++) {
                if (this.field4438[var4] != arg2[var4]) {
                    throw new RuntimeException();
                }
            }
        }
        this.method1862(arg0, false);
    }
}
