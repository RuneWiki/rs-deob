import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hj")
public class class570 {

    @OriginalMember(owner = "client!hj", name = "c", descriptor = "[I")
    private int[] field8026;

    @OriginalMember(owner = "client!hj", name = "i", descriptor = "[I")
    private int[] field8032;

    @OriginalMember(owner = "client!hj", name = "j", descriptor = "[I")
    public static int[] field8033 = new int[50];

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "I")
    public static int field8024;

    @OriginalMember(owner = "client!hj", name = "b", descriptor = "I")
    private int field8025;

    @OriginalMember(owner = "client!hj", name = "d", descriptor = "I")
    private int field8027;

    @OriginalMember(owner = "client!hj", name = "e", descriptor = "I")
    private int field8028;

    @OriginalMember(owner = "client!hj", name = "f", descriptor = "I")
    private int field8029;

    @OriginalMember(owner = "client!hj", name = "g", descriptor = "I")
    public static int field8030;

    @OriginalMember(owner = "client!hj", name = "h", descriptor = "I")
    public static int field8031;

    @OriginalMember(owner = "client!hj", name = "k", descriptor = "I")
    public static int field8034;

    @OriginalMember(owner = "client!hj", name = "l", descriptor = "I")
    public static int field8035;

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(I)V", line = 4)
    public static void method3203(int arg0) {
        if (arg0 != -20732) {
            field8033 = null;
        }
        field8033 = null;
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(Lha;IIIIIIZZ)V", line = 14)
    public static final void method3204(class60 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, boolean arg8) {
        class22.field158 = arg0;
        class351.field4702 = arg1;
        class181.field2224 = class351.field4702 > 1 && class22.field158.method435();
        class443.field6172 = arg2;
        class601.field8373 = 0x1 << class443.field6172;
        class522.field7044 = class601.field8373 >> 1;
        Math.sqrt((double) (class522.field7044 * class522.field7044 + class522.field7044 * class522.field7044));
        class307.field4170 = arg3;
        class68.field743 = arg4;
        class480.field6629 = arg5;
        class118.field1562 = arg6;
        class169.field2110 = class648.method3661((byte) -20);
        class112.method754((byte) 102);
        class396.field5627 = new class624[arg3][class68.field743][class480.field6629];
        class86.field1182 = new class281[arg3];
        if (arg7) {
            class574.field8077 = new int[class68.field743][class480.field6629];
            class425.field5983 = new byte[class68.field743][class480.field6629];
            class622.field8711 = new short[class68.field743][class480.field6629];
            class195.field2334 = new class624[1][class68.field743][class480.field6629];
            class143.field1850 = new class281[1];
        } else {
            class574.field8077 = null;
            class425.field5983 = null;
            class622.field8711 = null;
            class195.field2334 = null;
            class143.field1850 = null;
        }
        if (arg8) {
            class180.field2218 = new long[arg3][arg4][arg5];
            class85.field1176 = new class669[65535];
            class284.field3760 = new boolean[65535];
            class474.field6562 = 0;
        } else {
            class180.field2218 = null;
            class85.field1176 = null;
            class284.field3760 = null;
            class474.field6562 = 0;
        }
        class148.method912(false);
        class732.field10200 = new class176[2];
        class43.field467 = new class176[2];
        class707.field9896 = new class176[2];
        class170.field2121 = new class176[10000];
        class735.field10260 = 0;
        class295.field3961 = new class176[5000];
        class540.field7311 = 0;
        class561.field7935 = new class752[5000];
        class320.field4304 = 0;
        class423.field5940 = new boolean[class118.field1562 + class118.field1562 + 1][class118.field1562 + class118.field1562 + 1];
        class619.field8676 = new boolean[class118.field1562 + class118.field1562 + 2][class118.field1562 + class118.field1562 + 2];
        class320.field4301 = new int[class118.field1562 + class118.field1562 + 2];
        class350.field4641 = class350.field4643;
        if (class181.field2224) {
            class219.field2838 = new boolean[arg3][class118.field1562 + class118.field1562 + 1][class118.field1562 + class118.field1562 + 1];
            class331.field4466 = new boolean[arg3][][];
            if (class532.field7227 != null) {
                class199.method1102();
            }
            class532.field7227 = new class588[class351.field4702];
            class22.field158.method395(class532.field7227.length + 1);
            class22.field158.method431(0);
            for (int var9 = 0; var9 < class532.field7227.length; var9++) {
                class532.field7227[var9] = new class588(var9 + 1, class22.field158);
                (new Thread(class532.field7227[var9], "wr" + var9)).start();
            }
            byte var10;
            if (class351.field4702 == 2) {
                var10 = 4;
                class360.field4767 = 2;
            } else if (class351.field4702 == 3) {
                var10 = 6;
                class360.field4767 = 3;
            } else {
                var10 = 8;
                class360.field4767 = 4;
            }
            class293.field3923 = new class643[var10];
            for (int var11 = 0; var11 < var10; var11++) {
                class293.field3923[var11] = new class643(class698.field9827[class351.field4702 - 2][var11]);
            }
        } else {
            class360.field4767 = 1;
        }
        class281.field3729 = new int[class360.field4767 - 1];
        class116.field1540 = new int[class360.field4767 - 1];
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(B)V", line = 137)
    private final void method3205(byte arg0) {
        field8031++;
        int var2 = -1640531527;
        int var3 = -1640531527;
        int var4 = -1640531527;
        int var5 = -1640531527;
        int var6 = -1640531527;
        int var7 = -1640531527;
        int var8 = -1640531527;
        int var9 = -1640531527;
        for (int var10 = 0; var10 < 4; var10++) {
            int var62 = var9 ^ var8 << 11;
            int var63 = var7 + var8;
            int var64 = var6 + var62;
            int var65 = var63 ^ var7 >>> 2;
            int var66 = var5 + var65;
            int var67 = var7 + var64;
            int var68 = var67 ^ var64 << 8;
            int var69 = var64 + var66;
            int var70 = var4 + var68;
            var6 = var69 ^ var66 >>> 16;
            int var71 = var66 + var70;
            int var72 = var3 + var6;
            var5 = var71 ^ var70 << 10;
            int var73 = var2 + var5;
            int var74 = var70 + var72;
            var4 = var74 ^ var72 >>> 4;
            int var75 = var4 + var62;
            int var76 = var72 + var73;
            var3 = var76 ^ var73 << 8;
            int var77 = var73 + var75;
            var8 = var3 + var65;
            var2 = var77 ^ var75 >>> 9;
            var9 = var8 + var75;
            var7 = var2 + var68;
        }
        int var11 = 0;
        int var12 = 62 % ((arg0 + 75) / 48);
        while (var11 < 256) {
            int var38 = this.field8032[var11 + 1] + var8;
            int var39 = this.field8032[var11] + var9;
            int var40 = this.field8032[var11 + 7] + var2;
            int var41 = this.field8032[var11 + 5] + var4;
            int var42 = this.field8032[var11 + 2] + var7;
            int var43 = this.field8032[var11 + 4] + var5;
            int var44 = this.field8032[var11 + 3] + var6;
            int var45 = this.field8032[var11 + 6] + var3;
            int var46 = var39 ^ var38 << 11;
            int var47 = var38 + var42;
            int var48 = var44 + var46;
            int var49 = var47 ^ var42 >>> 2;
            int var50 = var43 + var49;
            int var51 = var42 + var48;
            int var52 = var51 ^ var48 << 8;
            int var53 = var48 + var50;
            int var54 = var41 + var52;
            var6 = var53 ^ var50 >>> 16;
            int var55 = var6 + var45;
            int var56 = var50 + var54;
            var5 = var56 ^ var54 << 10;
            int var57 = var5 + var40;
            int var58 = var54 + var55;
            var4 = var58 ^ var55 >>> 4;
            int var59 = var4 + var46;
            int var60 = var55 + var57;
            var3 = var60 ^ var57 << 8;
            var8 = var3 + var49;
            int var61 = var57 + var59;
            var2 = var61 ^ var59 >>> 9;
            var7 = var2 + var52;
            var9 = var8 + var59;
            this.field8026[var11] = var9;
            this.field8026[var11 + 1] = var8;
            this.field8026[var11 + 2] = var7;
            this.field8026[var11 + 3] = var6;
            this.field8026[var11 + 4] = var5;
            this.field8026[var11 + 5] = var4;
            this.field8026[var11 + 6] = var3;
            this.field8026[var11 + 7] = var2;
            var11 += 8;
        }
        for (int var13 = 0; var13 < 256; var13 += 8) {
            int var14 = this.field8026[var13 + 7] + var2;
            int var15 = this.field8026[var13 + 3] + var6;
            int var16 = this.field8026[var13 + 4] + var5;
            int var17 = this.field8026[var13 + 1] + var8;
            int var18 = this.field8026[var13 + 6] + var3;
            int var19 = this.field8026[var13] + var9;
            int var20 = this.field8026[var13 + 5] + var4;
            int var21 = this.field8026[var13 + 2] + var7;
            int var22 = var19 ^ var17 << 11;
            int var23 = var17 + var21;
            int var24 = var15 + var22;
            int var25 = var23 ^ var21 >>> 2;
            int var26 = var16 + var25;
            int var27 = var21 + var24;
            int var28 = var27 ^ var24 << 8;
            int var29 = var20 + var28;
            int var30 = var24 + var26;
            var6 = var30 ^ var26 >>> 16;
            int var31 = var6 + var18;
            int var32 = var26 + var29;
            var5 = var32 ^ var29 << 10;
            int var33 = var5 + var14;
            int var34 = var29 + var31;
            var4 = var34 ^ var31 >>> 4;
            int var35 = var31 + var33;
            int var36 = var4 + var22;
            var3 = var35 ^ var33 << 8;
            var8 = var3 + var25;
            int var37 = var33 + var36;
            var2 = var37 ^ var36 >>> 9;
            var7 = var2 + var28;
            var9 = var8 + var36;
            this.field8026[var13] = var9;
            this.field8026[var13 + 1] = var8;
            this.field8026[var13 + 2] = var7;
            this.field8026[var13 + 3] = var6;
            this.field8026[var13 + 4] = var5;
            this.field8026[var13 + 5] = var4;
            this.field8026[var13 + 6] = var3;
            this.field8026[var13 + 7] = var2;
        }
        this.method3206((byte) 94);
        this.field8027 = 256;
    }

    @OriginalMember(owner = "client!hj", name = "b", descriptor = "(B)V", line = 283)
    private final void method3206(byte arg0) {
        field8024++;
        if (arg0 != 94) {
            return;
        }
        this.field8025 += ++this.field8029;
        for (int var2 = 0; var2 < 256; var2++) {
            int var3 = this.field8026[var2];
            if ((var2 & 0x2) == 0) {
                if ((var2 & 0x1) == 0) {
                    this.field8028 ^= this.field8028 << 13;
                } else {
                    this.field8028 ^= this.field8028 >>> 6;
                }
            } else if ((var2 & 0x1) == 0) {
                this.field8028 ^= this.field8028 << 2;
            } else {
                this.field8028 ^= this.field8028 >>> 16;
            }
            this.field8028 += this.field8026[var2 + 128 & 0xFF];
            int var4;
            this.field8026[var2] = var4 = this.field8028 + this.field8026[class321.method1919(1020, var3) >> 2] + this.field8025;
            this.field8032[var2] = this.field8025 = this.field8026[class321.method1919(var4 >> 8, 1020) >> 2] + var3;
        }
    }

    @OriginalMember(owner = "client!hj", name = "b", descriptor = "(I)I", line = 325)
    public final int method3207(int arg0) {
        field8030++;
        if (arg0 <= 76) {
            this.field8025 = -71;
        }
        if (this.field8027 == 0) {
            this.method3206((byte) 94);
            this.field8027 = 256;
        }
        return this.field8032[--this.field8027];
    }

    @OriginalMember(owner = "client!hj", name = "<init>", descriptor = "()V", line = 351)
    private class570() {
    }

    @OriginalMember(owner = "client!hj", name = "c", descriptor = "(I)I", line = 354)
    public final int method3208(int arg0) {
        field8034++;
        if (arg0 != 3) {
            return 20;
        }
        if (this.field8027 == 0) {
            this.method3206((byte) 94);
            this.field8027 = 256;
        }
        return this.field8032[this.field8027 - 1];
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "([I[JIIZ)V", line = 372)
    public static final void method3209(int[] arg0, long[] arg1, int arg2, int arg3, boolean arg4) {
        if (arg2 < arg3) {
            int var5 = (arg2 + arg3) / 2;
            int var6 = arg2;
            long var7 = arg1[var5];
            arg1[var5] = arg1[arg3];
            arg1[arg3] = var7;
            int var9 = arg0[var5];
            arg0[var5] = arg0[arg3];
            arg0[arg3] = var9;
            int var10 = var7 == Long.MAX_VALUE ? 0 : 1;
            for (int var11 = arg2; var11 < arg3; var11++) {
                if (var7 + ((long) (var10 & var11)) > arg1[var11]) {
                    long var12 = arg1[var11];
                    arg1[var11] = arg1[var6];
                    arg1[var6] = var12;
                    int var14 = arg0[var11];
                    arg0[var11] = arg0[var6];
                    arg0[var6++] = var14;
                }
            }
            arg1[arg3] = arg1[var6];
            arg1[var6] = var7;
            arg0[arg3] = arg0[var6];
            arg0[var6] = var9;
            method3209(arg0, arg1, arg2, var6 - 1, arg4);
            method3209(arg0, arg1, var6 + 1, arg3, arg4);
        }
        field8035++;
        if (arg4) {
            method3204(null, 101, -71, 107, 35, -44, 75, true, true);
        }
    }

    @OriginalMember(owner = "client!hj", name = "<init>", descriptor = "([I)V", line = 431)
    public class570(int[] arg0) {
        this.field8026 = new int[256];
        this.field8032 = new int[256];
        for (int var2 = 0; var2 < arg0.length; var2++) {
            this.field8032[var2] = arg0[var2];
        }
        this.method3205((byte) -123);
    }
}
