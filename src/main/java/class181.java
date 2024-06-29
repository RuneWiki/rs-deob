import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!we")
public class class181 {

    @OriginalMember(owner = "client!we", name = "c", descriptor = "[I")
    private int[] field2316;

    @OriginalMember(owner = "client!we", name = "k", descriptor = "[I")
    private int[] field2324;

    @OriginalMember(owner = "client!we", name = "h", descriptor = "S")
    public static short field2321 = 256;

    @OriginalMember(owner = "client!we", name = "j", descriptor = "[I")
    public static int[] field2323 = new int[25];

    @OriginalMember(owner = "client!we", name = "r", descriptor = "Lim;")
    public static class353 field2331 = new class353(38, 9);

    @OriginalMember(owner = "client!we", name = "s", descriptor = "Z")
    public static boolean field2332 = false;

    @OriginalMember(owner = "client!we", name = "a", descriptor = "I")
    private int field2314;

    @OriginalMember(owner = "client!we", name = "b", descriptor = "I")
    public static int field2315;

    @OriginalMember(owner = "client!we", name = "d", descriptor = "I")
    public static int field2317;

    @OriginalMember(owner = "client!we", name = "e", descriptor = "I")
    public static int field2318;

    @OriginalMember(owner = "client!we", name = "f", descriptor = "I")
    private int field2319;

    @OriginalMember(owner = "client!we", name = "g", descriptor = "I")
    public static int field2320;

    @OriginalMember(owner = "client!we", name = "i", descriptor = "I")
    private int field2322;

    @OriginalMember(owner = "client!we", name = "l", descriptor = "I")
    public static int field2325;

    @OriginalMember(owner = "client!we", name = "m", descriptor = "I")
    public static int field2326;

    @OriginalMember(owner = "client!we", name = "n", descriptor = "I")
    public static int field2327;

    @OriginalMember(owner = "client!we", name = "p", descriptor = "I")
    public static int field2329;

    @OriginalMember(owner = "client!we", name = "q", descriptor = "I")
    private int field2330;

    @OriginalMember(owner = "client!we", name = "o", descriptor = "Lsv;")
    public static class389 field2328;

    @OriginalMember(owner = "client!we", name = "a", descriptor = "([FBI)[F")
    public static final float[] method1109(float[] arg0, byte arg1, int arg2) {
        field2327++;
        if (arg1 >= -55) {
            return null;
        } else {
            float[] var3 = new float[arg2];
            class205.method1314(arg0, 0, var3, 0, arg2);
            return var3;
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(I)Lgo;")
    public static final class377 method1110(int arg0) {
        field2325++;
        if (arg0 != 256) {
            return null;
        }
        try {
            return (class377) Class.forName("ih").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return null;
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(B)V")
    private final void method1111(byte arg0) {
        field2329++;
        this.field2330 += ++this.field2319;
        for (int var2 = 0; var2 < 256; var2++) {
            int var4 = this.field2316[var2];
            if ((var2 & 0x2) == 0) {
                if ((var2 & 0x1) == 0) {
                    this.field2314 ^= this.field2314 << 13;
                } else {
                    this.field2314 ^= this.field2314 >>> 6;
                }
            } else if ((var2 & 0x1) == 0) {
                this.field2314 ^= this.field2314 << 2;
            } else {
                this.field2314 ^= this.field2314 >>> 16;
            }
            this.field2314 += this.field2316[var2 + 128 & 0xFF];
            int var5;
            this.field2316[var2] = var5 = this.field2330 + (this.field2316[class143.method783(255, var4 >> 2)] + this.field2314);
            this.field2324[var2] = this.field2330 = this.field2316[class143.method783(255, var5 >> 8 >> 2)] + var4;
        }
        int var3 = 76 % ((arg0 - 23) / 48);
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(Z)V")
    public static final void method1112(boolean arg0) {
        class172.field2225 = new class201[50];
        if (arg0) {
            field2323 = null;
        }
        class369.field5138 = 0;
        field2318++;
    }

    @OriginalMember(owner = "client!we", name = "b", descriptor = "(I)V")
    public static void method1113(int arg0) {
        field2328 = null;
        field2331 = null;
        field2323 = null;
        if (arg0 != 18664) {
            field2323 = null;
        }
    }

    @OriginalMember(owner = "client!we", name = "c", descriptor = "(I)V")
    private final void method1114(int arg0) {
        field2320++;
        int var2 = -1640531527;
        int var3 = -1640531527;
        int var4 = -1640531527;
        int var5 = -1640531527;
        int var6 = -1640531527;
        int var7 = -1640531527;
        int var8 = -1640531527;
        int var9 = -1640531527;
        if (arg0 < 40) {
            this.field2324 = null;
        }
        for (int var10 = 0; var10 < 4; var10++) {
            int var61 = var9 ^ var8 << 11;
            int var62 = var6 + var61;
            int var63 = var7 + var8;
            int var64 = var63 ^ var7 >>> 2;
            int var65 = var7 + var62;
            int var66 = var5 + var64;
            int var67 = var65 ^ var62 << 8;
            int var68 = var62 + var66;
            int var69 = var4 + var67;
            var6 = var68 ^ var66 >>> 16;
            int var70 = var66 + var69;
            int var71 = var3 + var6;
            var5 = var70 ^ var69 << 10;
            int var72 = var69 + var71;
            int var73 = var2 + var5;
            var4 = var72 ^ var71 >>> 4;
            int var74 = var4 + var61;
            int var75 = var71 + var73;
            var3 = var75 ^ var73 << 8;
            var8 = var3 + var64;
            int var76 = var73 + var74;
            var2 = var76 ^ var74 >>> 9;
            var7 = var2 + var67;
            var9 = var8 + var74;
        }
        for (int var11 = 0; var11 < 256; var11 += 8) {
            int var37 = this.field2324[var11 + 4] + var5;
            int var38 = this.field2324[var11 + 1] + var8;
            int var39 = this.field2324[var11 + 2] + var7;
            int var40 = this.field2324[var11 + 7] + var2;
            int var41 = this.field2324[var11 + 5] + var4;
            int var42 = this.field2324[var11] + var9;
            int var43 = this.field2324[var11 + 3] + var6;
            int var44 = this.field2324[var11 + 6] + var3;
            int var45 = var42 ^ var38 << 11;
            int var46 = var43 + var45;
            int var47 = var38 + var39;
            int var48 = var47 ^ var39 >>> 2;
            int var49 = var37 + var48;
            int var50 = var39 + var46;
            int var51 = var50 ^ var46 << 8;
            int var52 = var41 + var51;
            int var53 = var46 + var49;
            var6 = var53 ^ var49 >>> 16;
            int var54 = var49 + var52;
            int var55 = var6 + var44;
            var5 = var54 ^ var52 << 10;
            int var56 = var52 + var55;
            int var57 = var5 + var40;
            var4 = var56 ^ var55 >>> 4;
            int var58 = var4 + var45;
            int var59 = var55 + var57;
            var3 = var59 ^ var57 << 8;
            int var60 = var57 + var58;
            var8 = var3 + var48;
            var2 = var60 ^ var58 >>> 9;
            var7 = var2 + var51;
            var9 = var8 + var58;
            this.field2316[var11] = var9;
            this.field2316[var11 + 1] = var8;
            this.field2316[var11 + 2] = var7;
            this.field2316[var11 + 3] = var6;
            this.field2316[var11 + 4] = var5;
            this.field2316[var11 + 5] = var4;
            this.field2316[var11 + 6] = var3;
            this.field2316[var11 + 7] = var2;
        }
        for (int var12 = 0; var12 < 256; var12 += 8) {
            int var13 = this.field2316[var12 + 1] + var8;
            int var14 = this.field2316[var12] + var9;
            int var15 = this.field2316[var12 + 5] + var4;
            int var16 = this.field2316[var12 + 4] + var5;
            int var17 = this.field2316[var12 + 3] + var6;
            int var18 = this.field2316[var12 + 6] + var3;
            int var19 = this.field2316[var12 + 7] + var2;
            int var20 = this.field2316[var12 + 2] + var7;
            int var21 = var14 ^ var13 << 11;
            int var22 = var17 + var21;
            int var23 = var13 + var20;
            int var24 = var23 ^ var20 >>> 2;
            int var25 = var16 + var24;
            int var26 = var20 + var22;
            int var27 = var26 ^ var22 << 8;
            int var28 = var22 + var25;
            int var29 = var15 + var27;
            var6 = var28 ^ var25 >>> 16;
            int var30 = var25 + var29;
            int var31 = var6 + var18;
            var5 = var30 ^ var29 << 10;
            int var32 = var5 + var19;
            int var33 = var29 + var31;
            var4 = var33 ^ var31 >>> 4;
            int var34 = var31 + var32;
            int var35 = var4 + var21;
            var3 = var34 ^ var32 << 8;
            int var36 = var32 + var35;
            var8 = var3 + var24;
            var2 = var36 ^ var35 >>> 9;
            var7 = var2 + var27;
            var9 = var8 + var35;
            this.field2316[var12] = var9;
            this.field2316[var12 + 1] = var8;
            this.field2316[var12 + 2] = var7;
            this.field2316[var12 + 3] = var6;
            this.field2316[var12 + 4] = var5;
            this.field2316[var12 + 5] = var4;
            this.field2316[var12 + 6] = var3;
            this.field2316[var12 + 7] = var2;
        }
        this.method1111((byte) -112);
        this.field2322 = 256;
    }

    @OriginalMember(owner = "client!we", name = "d", descriptor = "(I)I")
    public final int method1115(int arg0) {
        field2326++;
        if (~this.field2322 == arg0) {
            this.method1111((byte) 102);
            this.field2322 = 256;
        }
        return this.field2324[this.field2322 - 1];
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(IIILck;Lck;)V")
    public static final void method1116(int arg0, int arg1, int arg2, class8 arg3, class8 arg4) {
        class563 var5 = class423.method2492(arg0, arg1, arg2);
        if (var5 != null) {
            var5.field7896 = arg3;
            var5.field7884 = arg4;
        }
    }

    @OriginalMember(owner = "client!we", name = "e", descriptor = "(I)I")
    public final int method1117(int arg0) {
        field2317++;
        int var2 = 83 % ((arg0 + 63) / 62);
        if (this.field2322 == 0) {
            this.method1111((byte) -81);
            this.field2322 = 256;
        }
        return this.field2324[--this.field2322];
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(ZI)V")
    public static final void method1118(boolean arg0, int arg1) {
        field2315++;
        class435.field5921 = 0;
        class387.field5383 = 0;
        class74.method434((byte) 81);
        class367.method2254(32316, arg0);
        class59.method336(-3406);
        boolean var2 = false;
        for (int var3 = 0; var3 < class435.field5921; var3++) {
            int var6 = class60.field832[var3];
            class480 var7 = (class480) class131.field1619.method3476((long) var6, (byte) 28);
            class585 var8 = var7.field6729;
            if (class264.field3373 && class476.method2702(503866593, var6)) {
                class24.method150(-126);
            }
            if (class7.field61 != var8.field372) {
                if (var8.field8478.method3615((byte) -74)) {
                    class640.method3689(var8, 2015625216);
                }
                var8.method3374(-124, null);
                var7.method589(-8880);
                var2 = true;
            }
        }
        if (var2) {
            class604.field8710 = class131.field1619.method3480(-24064);
            class131.field1619.method3477(class179.field2310, (byte) -101);
        }
        if (class262.field3333 != class342.field4758.field7707) {
            throw new RuntimeException("gnp1 pos:" + class342.field4758.field7707 + " psize:" + class262.field3333);
        }
        for (int var4 = 0; var4 < class551.field7652; var4++) {
            if (class131.field1619.method3476((long) class286.field3739[var4], (byte) 28) == null) {
                throw new RuntimeException("gnp2 pos:" + var4 + " size:" + class551.field7652);
            }
        }
        int var5 = -94 % ((arg1 + 22) / 37);
    }

    @OriginalMember(owner = "client!we", name = "<init>", descriptor = "()V")
    private class181() {
    }

    @OriginalMember(owner = "client!we", name = "<init>", descriptor = "([I)V")
    public class181(int[] arg0) {
        this.field2316 = new int[256];
        this.field2324 = new int[256];
        for (int var2 = 0; var2 < arg0.length; var2++) {
            this.field2324[var2] = arg0[var2];
        }
        this.method1114(71);
    }
}
