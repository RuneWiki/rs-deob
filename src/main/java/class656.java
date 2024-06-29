import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ip")
public class class656 {

    @OriginalMember(owner = "client!ip", name = "i", descriptor = "[I")
    private int[] field9314;

    @OriginalMember(owner = "client!ip", name = "r", descriptor = "[I")
    private int[] field9323;

    @OriginalMember(owner = "client!ip", name = "j", descriptor = "[I")
    public static int[] field9315 = new int[] { 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 120 };

    @OriginalMember(owner = "client!ip", name = "f", descriptor = "Loea;")
    public static class552 field9311 = new class552(128);

    @OriginalMember(owner = "client!ip", name = "n", descriptor = "I")
    public static int field9319 = 0;

    @OriginalMember(owner = "client!ip", name = "q", descriptor = "[F")
    public static float[] field9322 = new float[4];

    @OriginalMember(owner = "client!ip", name = "o", descriptor = "I")
    public static int field9320 = 0;

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "I")
    public static int field9306;

    @OriginalMember(owner = "client!ip", name = "b", descriptor = "I")
    private int field9307;

    @OriginalMember(owner = "client!ip", name = "c", descriptor = "I")
    public static int field9308;

    @OriginalMember(owner = "client!ip", name = "d", descriptor = "I")
    public static int field9309;

    @OriginalMember(owner = "client!ip", name = "e", descriptor = "I")
    private int field9310;

    @OriginalMember(owner = "client!ip", name = "g", descriptor = "I")
    private int field9312;

    @OriginalMember(owner = "client!ip", name = "h", descriptor = "I")
    public static int field9313;

    @OriginalMember(owner = "client!ip", name = "k", descriptor = "I")
    private int field9316;

    @OriginalMember(owner = "client!ip", name = "l", descriptor = "I")
    public static int field9317;

    @OriginalMember(owner = "client!ip", name = "m", descriptor = "I")
    public static int field9318;

    @OriginalMember(owner = "client!ip", name = "p", descriptor = "I")
    public static int field9321;

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(IJ)Ljava/lang/String;", line = 8)
    public static final String method3708(int arg0, long arg1) {
        field9313++;
        class405.field5740.setTime(new Date(arg1));
        int var3 = class405.field5740.get(arg0);
        int var4 = class405.field5740.get(5);
        int var5 = class405.field5740.get(2);
        int var6 = class405.field5740.get(1);
        int var7 = class405.field5740.get(11);
        int var8 = class405.field5740.get(12);
        int var9 = class405.field5740.get(13);
        return class426.field6115[var3 - 1] + ", " + var4 / 10 + var4 % 10 + "-" + class430.field6183[var5] + "-" + var6 + " " + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10 + " GMT";
    }

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(I)I", line = 31)
    public final int method3709(int arg0) {
        if (this.field9310 == 0) {
            this.method3715(18627);
            this.field9310 = 256;
        }
        field9309++;
        if (arg0 >= -63) {
            this.method3715(43);
        }
        return this.field9314[--this.field9310];
    }

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(IBI)V", line = 50)
    public static final void method3710(int arg0, byte arg1, int arg2) {
        field9308++;
        class233 var3 = class7.method44(arg0, 14, -1);
        var3.method1422(0);
        int var4 = 91 / ((-arg1 - 65) / 55);
        var3.field3114 = arg2;
    }

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(Z)I", line = 63)
    public final int method3711(boolean arg0) {
        field9317++;
        if (arg0) {
            this.field9312 = 112;
        }
        if (this.field9310 == 0) {
            this.method3715(18627);
            this.field9310 = 256;
        }
        return this.field9314[this.field9310 - 1];
    }

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(B)V", line = 81)
    public static void method3712(byte arg0) {
        field9311 = null;
        field9315 = null;
        if (arg0 != 26) {
            field9320 = -97;
        }
        field9322 = null;
    }

    @OriginalMember(owner = "client!ip", name = "b", descriptor = "(I)V", line = 105)
    public static final void method3713(int arg0) {
        field9306++;
        class440.field6293.method2778((byte) 125);
        class310.field4100.method2778((byte) 116);
        class151.field1869.method2778((byte) 108);
        if (arg0 < 70) {
            field9322 = null;
        }
        class129.field1644.method2778((byte) 114);
    }

    @OriginalMember(owner = "client!ip", name = "b", descriptor = "(B)V", line = 120)
    private final void method3714(byte arg0) {
        field9318++;
        if (arg0 != -6) {
            return;
        }
        int var2 = -1640531527;
        int var3 = -1640531527;
        int var4 = -1640531527;
        int var5 = -1640531527;
        int var6 = -1640531527;
        int var7 = -1640531527;
        int var8 = -1640531527;
        int var9 = -1640531527;
        for (int var10 = 0; var10 < 4; var10++) {
            int var61 = var9 ^ var8 << 11;
            int var62 = var6 + var61;
            int var63 = var7 + var8;
            int var64 = var63 ^ var7 >>> 2;
            int var65 = var5 + var64;
            int var66 = var7 + var62;
            int var67 = var66 ^ var62 << 8;
            int var68 = var62 + var65;
            int var69 = var4 + var67;
            var6 = var68 ^ var65 >>> 16;
            int var70 = var3 + var6;
            int var71 = var65 + var69;
            var5 = var71 ^ var69 << 10;
            int var72 = var2 + var5;
            int var73 = var69 + var70;
            var4 = var73 ^ var70 >>> 4;
            int var74 = var70 + var72;
            int var75 = var4 + var61;
            var3 = var74 ^ var72 << 8;
            int var76 = var72 + var75;
            var8 = var3 + var64;
            var2 = var76 ^ var75 >>> 9;
            var7 = var2 + var67;
            var9 = var8 + var75;
        }
        for (int var11 = 0; var11 < 256; var11 += 8) {
            int var37 = this.field9314[var11 + 5] + var4;
            int var38 = this.field9314[var11 + 4] + var5;
            int var39 = this.field9314[var11 + 3] + var6;
            int var40 = this.field9314[var11 + 2] + var7;
            int var41 = this.field9314[var11 + 7] + var2;
            int var42 = this.field9314[var11] + var9;
            int var43 = this.field9314[var11 + 1] + var8;
            int var44 = this.field9314[var11 + 6] + var3;
            int var45 = var42 ^ var43 << 11;
            int var46 = var40 + var43;
            int var47 = var39 + var45;
            int var48 = var46 ^ var40 >>> 2;
            int var49 = var38 + var48;
            int var50 = var40 + var47;
            int var51 = var50 ^ var47 << 8;
            int var52 = var37 + var51;
            int var53 = var47 + var49;
            var6 = var53 ^ var49 >>> 16;
            int var54 = var49 + var52;
            int var55 = var6 + var44;
            var5 = var54 ^ var52 << 10;
            int var56 = var5 + var41;
            int var57 = var52 + var55;
            var4 = var57 ^ var55 >>> 4;
            int var58 = var55 + var56;
            int var59 = var4 + var45;
            var3 = var58 ^ var56 << 8;
            int var60 = var56 + var59;
            var8 = var3 + var48;
            var2 = var60 ^ var59 >>> 9;
            var9 = var8 + var59;
            var7 = var2 + var51;
            this.field9323[var11] = var9;
            this.field9323[var11 + 1] = var8;
            this.field9323[var11 + 2] = var7;
            this.field9323[var11 + 3] = var6;
            this.field9323[var11 + 4] = var5;
            this.field9323[var11 + 5] = var4;
            this.field9323[var11 + 6] = var3;
            this.field9323[var11 + 7] = var2;
        }
        for (int var12 = 0; var12 < 256; var12 += 8) {
            int var13 = this.field9323[var12 + 3] + var6;
            int var14 = this.field9323[var12 + 5] + var4;
            int var15 = this.field9323[var12 + 1] + var8;
            int var16 = this.field9323[var12 + 2] + var7;
            int var17 = this.field9323[var12 + 7] + var2;
            int var18 = this.field9323[var12 + 6] + var3;
            int var19 = this.field9323[var12] + var9;
            int var20 = this.field9323[var12 + 4] + var5;
            int var21 = var19 ^ var15 << 11;
            int var22 = var15 + var16;
            int var23 = var13 + var21;
            int var24 = var22 ^ var16 >>> 2;
            int var25 = var16 + var23;
            int var26 = var20 + var24;
            int var27 = var25 ^ var23 << 8;
            int var28 = var14 + var27;
            int var29 = var23 + var26;
            var6 = var29 ^ var26 >>> 16;
            int var30 = var26 + var28;
            int var31 = var6 + var18;
            var5 = var30 ^ var28 << 10;
            int var32 = var5 + var17;
            int var33 = var28 + var31;
            var4 = var33 ^ var31 >>> 4;
            int var34 = var31 + var32;
            int var35 = var4 + var21;
            var3 = var34 ^ var32 << 8;
            int var36 = var32 + var35;
            var8 = var3 + var24;
            var2 = var36 ^ var35 >>> 9;
            var9 = var8 + var35;
            var7 = var2 + var27;
            this.field9323[var12] = var9;
            this.field9323[var12 + 1] = var8;
            this.field9323[var12 + 2] = var7;
            this.field9323[var12 + 3] = var6;
            this.field9323[var12 + 4] = var5;
            this.field9323[var12 + 5] = var4;
            this.field9323[var12 + 6] = var3;
            this.field9323[var12 + 7] = var2;
        }
        this.method3715(18627);
        this.field9310 = 256;
    }

    @OriginalMember(owner = "client!ip", name = "c", descriptor = "(I)V", line = 268)
    private final void method3715(int arg0) {
        field9321++;
        this.field9307 += ++this.field9312;
        for (int var2 = 0; var2 < 256; var2++) {
            int var3 = this.field9323[var2];
            if ((var2 & 0x2) == 0) {
                if ((var2 & 0x1) == 0) {
                    this.field9316 ^= this.field9316 << 13;
                } else {
                    this.field9316 ^= this.field9316 >>> 6;
                }
            } else if ((var2 & 0x1) == 0) {
                this.field9316 ^= this.field9316 << 2;
            } else {
                this.field9316 ^= this.field9316 >>> 16;
            }
            this.field9316 += this.field9323[var2 + 128 & 0xFF];
            int var4;
            this.field9323[var2] = var4 = this.field9323[class435.method2605(255, var3 >> 2)] + this.field9316 + this.field9307;
            this.field9314[var2] = this.field9307 = this.field9323[class435.method2605(var4, 261324) >> 8 >> 2] + var3;
        }
        if (arg0 != 18627) {
            this.method3715(-20);
        }
    }

    @OriginalMember(owner = "client!ip", name = "<init>", descriptor = "()V", line = 327)
    private class656() {
    }

    @OriginalMember(owner = "client!ip", name = "<init>", descriptor = "([I)V", line = 329)
    public class656(int[] arg0) {
        this.field9314 = new int[256];
        this.field9323 = new int[256];
        for (int var2 = 0; var2 < arg0.length; var2++) {
            this.field9314[var2] = arg0[var2];
        }
        this.method3714((byte) -6);
    }
}
