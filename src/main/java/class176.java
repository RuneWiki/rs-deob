import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!s")
public class class176 {

    @OriginalMember(owner = "client!s", name = "a", descriptor = "[I")
    private int[] field2748;

    @OriginalMember(owner = "client!s", name = "e", descriptor = "[I")
    private int[] field2752;

    @OriginalMember(owner = "client!s", name = "b", descriptor = "Loq;")
    public static class231 field2749 = new class231("", 17);

    @OriginalMember(owner = "client!s", name = "c", descriptor = "I")
    public static int field2750;

    @OriginalMember(owner = "client!s", name = "d", descriptor = "I")
    public static int field2751;

    @OriginalMember(owner = "client!s", name = "f", descriptor = "I")
    public static int field2753;

    @OriginalMember(owner = "client!s", name = "g", descriptor = "I")
    private int field2754;

    @OriginalMember(owner = "client!s", name = "h", descriptor = "I")
    private int field2755;

    @OriginalMember(owner = "client!s", name = "i", descriptor = "I")
    private int field2756;

    @OriginalMember(owner = "client!s", name = "j", descriptor = "I")
    private int field2757;

    @OriginalMember(owner = "client!s", name = "k", descriptor = "I")
    public static int field2758;

    @OriginalMember(owner = "client!s", name = "l", descriptor = "I")
    public static int field2759;

    @OriginalMember(owner = "client!s", name = "m", descriptor = "I")
    public static int field2760;

    @OriginalMember(owner = "client!s", name = "n", descriptor = "I")
    public static int field2761;

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(Ltq;Ltq;I)V", line = 12)
    public static final void method1102(class427 arg0, class427 arg1, int arg2) {
        class39.field520++;
        field2753++;
        class400.method2379((byte) -75, class500.field7574);
        class230.field3508.method253(-123, arg1.field6157);
        if (arg2 != 0) {
            return;
        }
        class230.field3508.method266(arg0.field6157, false);
        class230.field3508.method263(arg1.field6274, (byte) -115);
        class230.field3508.method282(arg0.field6274, arg2 ^ 0xFFFFFFDF);
        class230.field3508.method252(arg0.field6265, arg2 ^ 0xFFFFFF99);
        class230.field3508.method252(arg1.field6265, -112);
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(B)V", line = 30)
    public static final void method1103(byte arg0) {
        field2750++;
        if (class316.field4761) {
            return;
        }
        if (arg0 != -69) {
            field2749 = null;
        }
        class7.field81 = true;
        if (class463.field7116.field2961) {
            class23.field289 = ((int) class23.field289 - 65 & 0xFFFFFF80);
        } else {
            class407.field5917 += (-24.0F - class407.field5917) / 2.0F;
        }
        class316.field4761 = true;
    }

    @OriginalMember(owner = "client!s", name = "b", descriptor = "(B)V", line = 57)
    private final void method1104(byte arg0) {
        field2759++;
        this.field2757 += ++this.field2754;
        int var2 = 0;
        if (arg0 <= 39) {
            this.field2755 = 61;
        }
        while (var2 < 256) {
            int var3 = this.field2748[var2];
            if ((var2 & 0x2) == 0) {
                if ((var2 & 0x1) == 0) {
                    this.field2756 ^= this.field2756 << 13;
                } else {
                    this.field2756 ^= this.field2756 >>> 6;
                }
            } else if ((var2 & 0x1) == 0) {
                this.field2756 ^= this.field2756 << 2;
            } else {
                this.field2756 ^= this.field2756 >>> 16;
            }
            this.field2756 += this.field2748[var2 + 128 & 0xFF];
            int var4;
            this.field2748[var2] = var4 = this.field2756 + this.field2748[class330.method2050(var3 >> 2, 255)] + this.field2757;
            this.field2752[var2] = this.field2757 = this.field2748[class330.method2050(var4 >> 8 >> 2, 255)] + var3;
            var2++;
        }
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(I)I", line = 99)
    public final int method1105(int arg0) {
        field2760++;
        if (arg0 != 256) {
            this.field2748 = null;
        }
        if (this.field2755 == 0) {
            this.method1104((byte) 43);
            this.field2755 = 256;
        }
        return this.field2752[this.field2755 - 1];
    }

    @OriginalMember(owner = "client!s", name = "b", descriptor = "(I)V", line = 120)
    public static void method1106(int arg0) {
        if (arg0 != -25565) {
            method1107(null, -67, 32, 23, 14L, -104, -79, -55, null);
        }
        field2749 = null;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(Lbe;IIIJIIILtq;)V", line = 131)
    public static final void method1107(class28 arg0, int arg1, int arg2, int arg3, long arg4, int arg5, int arg6, int arg7, class427 arg8) {
        field2751++;
        int var10 = arg1 * arg1 + arg5 * arg5;
        if (arg4 < (long) var10 || arg3 >= -107) {
            return;
        }
        int var11 = Math.min(arg8.field6175 / 2, arg8.field6126 / 2);
        if ((var11 * var11) >= var10) {
            class153.method983(arg0, class325.field4878[arg2], false, arg5, arg1, arg7, arg8, arg6);
            return;
        }
        var11 -= 10;
        int var12;
        if (class408.field5928 == 4) {
            var12 = (int) class23.field289 & 0x3FFF;
        } else {
            var12 = (int) class23.field289 + class273.field4145 & 0x3FFF;
        }
        int var13 = class195.field3075[var12];
        int var14 = class195.field3077[var12];
        if (class408.field5928 != 4) {
            var14 = var14 * 256 / (class222.field3427 + 256);
            var13 = var13 * 256 / (class222.field3427 + 256);
        }
        int var15 = arg5 * var13 + (arg1 * var14) >> 15;
        int var16 = arg5 * var14 - (arg1 * var13) >> 15;
        double var17 = Math.atan2((double) var15, (double) var16);
        int var19 = (int) (Math.sin(var17) * (double) var11);
        int var20 = (int) ((double) var11 * Math.cos(var17));
        class40.field578[arg2].method999((float) arg8.field6175 / 2.0F + (float) arg7 + (float) var19, (float) arg8.field6126 / 2.0F + (float) arg6 + (float) (-var20), 4096, (int) (-var17 / 6.283185307179586D * 65535.0D));
    }

    @OriginalMember(owner = "client!s", name = "c", descriptor = "(B)I", line = 187)
    public final int method1108(byte arg0) {
        if (arg0 > -101) {
            return -106;
        }
        field2758++;
        if (this.field2755 == 0) {
            this.method1104((byte) 67);
            this.field2755 = 256;
        }
        return this.field2752[--this.field2755];
    }

    @OriginalMember(owner = "client!s", name = "<init>", descriptor = "()V", line = 207)
    private class176() {
    }

    @OriginalMember(owner = "client!s", name = "d", descriptor = "(B)V", line = 211)
    private final void method1109(byte arg0) {
        field2761++;
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
            int var62 = var7 + var8;
            int var63 = var6 + var61;
            int var64 = var62 ^ var7 >>> 2;
            int var65 = var5 + var64;
            int var66 = var7 + var63;
            int var67 = var66 ^ var63 << 8;
            int var68 = var4 + var67;
            int var69 = var63 + var65;
            var6 = var69 ^ var65 >>> 16;
            int var70 = var3 + var6;
            int var71 = var65 + var68;
            var5 = var71 ^ var68 << 10;
            int var72 = var68 + var70;
            int var73 = var2 + var5;
            var4 = var72 ^ var70 >>> 4;
            int var74 = var4 + var61;
            int var75 = var70 + var73;
            var3 = var75 ^ var73 << 8;
            int var76 = var73 + var74;
            var8 = var3 + var64;
            var2 = var76 ^ var74 >>> 9;
            var7 = var2 + var67;
            var9 = var8 + var74;
        }
        if (arg0 <= 107) {
            this.field2748 = null;
        }
        for (int var11 = 0; var11 < 256; var11 += 8) {
            int var37 = this.field2752[var11 + 7] + var2;
            int var38 = this.field2752[var11] + var9;
            int var39 = this.field2752[var11 + 2] + var7;
            int var40 = this.field2752[var11 + 5] + var4;
            int var41 = this.field2752[var11 + 3] + var6;
            int var42 = this.field2752[var11 + 4] + var5;
            int var43 = this.field2752[var11 + 6] + var3;
            int var44 = this.field2752[var11 + 1] + var8;
            int var45 = var38 ^ var44 << 11;
            int var46 = var41 + var45;
            int var47 = var39 + var44;
            int var48 = var47 ^ var39 >>> 2;
            int var49 = var39 + var46;
            int var50 = var42 + var48;
            int var51 = var49 ^ var46 << 8;
            int var52 = var40 + var51;
            int var53 = var46 + var50;
            var6 = var53 ^ var50 >>> 16;
            int var54 = var6 + var43;
            int var55 = var50 + var52;
            var5 = var55 ^ var52 << 10;
            int var56 = var5 + var37;
            int var57 = var52 + var54;
            var4 = var57 ^ var54 >>> 4;
            int var58 = var4 + var45;
            int var59 = var54 + var56;
            var3 = var59 ^ var56 << 8;
            int var60 = var56 + var58;
            var8 = var3 + var48;
            var2 = var60 ^ var58 >>> 9;
            var7 = var2 + var51;
            var9 = var8 + var58;
            this.field2748[var11] = var9;
            this.field2748[var11 + 1] = var8;
            this.field2748[var11 + 2] = var7;
            this.field2748[var11 + 3] = var6;
            this.field2748[var11 + 4] = var5;
            this.field2748[var11 + 5] = var4;
            this.field2748[var11 + 6] = var3;
            this.field2748[var11 + 7] = var2;
        }
        for (int var12 = 0; var12 < 256; var12 += 8) {
            int var13 = this.field2748[var12] + var9;
            int var14 = this.field2748[var12 + 4] + var5;
            int var15 = this.field2748[var12 + 2] + var7;
            int var16 = this.field2748[var12 + 6] + var3;
            int var17 = this.field2748[var12 + 7] + var2;
            int var18 = this.field2748[var12 + 3] + var6;
            int var19 = this.field2748[var12 + 1] + var8;
            int var20 = this.field2748[var12 + 5] + var4;
            int var21 = var13 ^ var19 << 11;
            int var22 = var15 + var19;
            int var23 = var18 + var21;
            int var24 = var22 ^ var15 >>> 2;
            int var25 = var15 + var23;
            int var26 = var14 + var24;
            int var27 = var25 ^ var23 << 8;
            int var28 = var23 + var26;
            int var29 = var20 + var27;
            var6 = var28 ^ var26 >>> 16;
            int var30 = var26 + var29;
            int var31 = var6 + var16;
            var5 = var30 ^ var29 << 10;
            int var32 = var5 + var17;
            int var33 = var29 + var31;
            var4 = var33 ^ var31 >>> 4;
            int var34 = var31 + var32;
            int var35 = var4 + var21;
            var3 = var34 ^ var32 << 8;
            var8 = var3 + var24;
            int var36 = var32 + var35;
            var2 = var36 ^ var35 >>> 9;
            var9 = var8 + var35;
            var7 = var2 + var27;
            this.field2748[var12] = var9;
            this.field2748[var12 + 1] = var8;
            this.field2748[var12 + 2] = var7;
            this.field2748[var12 + 3] = var6;
            this.field2748[var12 + 4] = var5;
            this.field2748[var12 + 5] = var4;
            this.field2748[var12 + 6] = var3;
            this.field2748[var12 + 7] = var2;
        }
        this.method1104((byte) 68);
        this.field2755 = 256;
    }

    @OriginalMember(owner = "client!s", name = "<init>", descriptor = "([I)V", line = 357)
    public class176(int[] arg0) {
        this.field2748 = new int[256];
        this.field2752 = new int[256];
        for (int var2 = 0; var2 < arg0.length; var2++) {
            this.field2752[var2] = arg0[var2];
        }
        this.method1109((byte) 109);
    }
}
