import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!we")
public class class203 {

    @OriginalMember(owner = "client!we", name = "i", descriptor = "[I")
    private int[] field3996 = new int[256];

    @OriginalMember(owner = "client!we", name = "c", descriptor = "[I")
    private int[] field3990 = new int[256];

    @OriginalMember(owner = "client!we", name = "k", descriptor = "Leh;")
    private static class47 field3998 = class195.method1282((byte) -4, "Loading interfaces )2 ");

    @OriginalMember(owner = "client!we", name = "f", descriptor = "Leh;")
    public static class47 field3993 = class195.method1282((byte) -4, "rot:");

    @OriginalMember(owner = "client!we", name = "h", descriptor = "Leh;")
    public static class47 field3995 = field3998;

    @OriginalMember(owner = "client!we", name = "a", descriptor = "I")
    public static int field3988;

    @OriginalMember(owner = "client!we", name = "b", descriptor = "I")
    public static int field3989;

    @OriginalMember(owner = "client!we", name = "d", descriptor = "I")
    public static int field3991;

    @OriginalMember(owner = "client!we", name = "e", descriptor = "I")
    public static int field3992;

    @OriginalMember(owner = "client!we", name = "g", descriptor = "I")
    public static int field3994;

    @OriginalMember(owner = "client!we", name = "j", descriptor = "I")
    private int field3997;

    @OriginalMember(owner = "client!we", name = "l", descriptor = "I")
    private int field3999;

    @OriginalMember(owner = "client!we", name = "m", descriptor = "I")
    private int field4000;

    @OriginalMember(owner = "client!we", name = "n", descriptor = "I")
    private int field4001;

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(Lhd;IIIIIIZ)V")
    public static final void method1329(class68 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        if (arg6 >= 0 && arg6 < 104 && arg2 >= 0 && arg2 < 104) {
            class182.field3490[arg5][arg6][arg2] = 0;
            while (true) {
                int var8 = arg0.method604((byte) -128);
                if (var8 == 0) {
                    if (arg5 == 0) {
                        class103.field2171[0][arg6][arg2] = -class63.method532(arg6 + arg4 + 932731, arg2 + 556238 + arg1, -119) * 8;
                    } else {
                        class103.field2171[arg5][arg6][arg2] = class103.field2171[arg5 - 1][arg6][arg2] - 240;
                    }
                    break;
                }
                if (var8 == 1) {
                    int var9 = arg0.method604((byte) 68);
                    if (var9 == 1) {
                        var9 = 0;
                    }
                    if (arg5 == 0) {
                        class103.field2171[0][arg6][arg2] = -var9 * 8;
                    } else {
                        class103.field2171[arg5][arg6][arg2] = class103.field2171[arg5 - 1][arg6][arg2] - var9 * 8;
                    }
                    break;
                }
                if (var8 <= 49) {
                    class57.field1129[arg5][arg6][arg2] = arg0.method567(-1);
                    class123.field2488[arg5][arg6][arg2] = (byte) ((var8 - 2) / 4);
                    class105.field2191[arg5][arg6][arg2] = (byte) class142.method1018(var8 + arg3 - 2, 3);
                } else if (var8 <= 81) {
                    class182.field3490[arg5][arg6][arg2] = (byte) (var8 - 49);
                } else {
                    class67.field1440[arg5][arg6][arg2] = (byte) (var8 - 81);
                }
            }
        } else {
            while (true) {
                int var10 = arg0.method604((byte) 38);
                if (var10 == 0) {
                    break;
                }
                if (var10 == 1) {
                    arg0.method604((byte) 87);
                    break;
                }
                if (var10 <= 49) {
                    arg0.method604((byte) 23);
                }
            }
        }
        if (arg7) {
            method1331(true);
        }
        field3994++;
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(I)I")
    public final int method1330(int arg0) {
        if (this.field4000-- == 0) {
            this.method1333((byte) 94);
            this.field4000 = 255;
        }
        int var2 = -106 % ((-arg0 - 14) / 45);
        field3989++;
        return this.field3990[this.field4000];
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(Z)V")
    public static void method1331(boolean arg0) {
        if (!arg0) {
            method1329(null, -100, -93, 94, 127, -23, 34, false);
        }
        field3995 = null;
        field3998 = null;
        field3993 = null;
    }

    @OriginalMember(owner = "client!we", name = "b", descriptor = "(I)V")
    private final void method1332(int arg0) {
        field3988++;
        int var2 = 71 / ((-arg0 - 67) / 34);
        int var3 = -1640531527;
        int var4 = -1640531527;
        int var5 = -1640531527;
        int var6 = -1640531527;
        int var7 = -1640531527;
        int var8 = -1640531527;
        int var9 = -1640531527;
        int var10 = -1640531527;
        for (int var11 = 0; var11 < 4; var11++) {
            int var62 = var10 ^ var9 << 11;
            int var63 = var7 + var62;
            int var64 = var8 + var9;
            int var65 = var64 ^ var8 >>> 2;
            int var66 = var6 + var65;
            int var67 = var8 + var63;
            int var68 = var67 ^ var63 << 8;
            int var69 = var5 + var68;
            int var70 = var63 + var66;
            var7 = var70 ^ var66 >>> 16;
            int var71 = var66 + var69;
            int var72 = var4 + var7;
            var6 = var71 ^ var69 << 10;
            int var73 = var3 + var6;
            int var74 = var69 + var72;
            var5 = var74 ^ var72 >>> 4;
            int var75 = var72 + var73;
            int var76 = var5 + var62;
            var4 = var75 ^ var73 << 8;
            int var77 = var73 + var76;
            var9 = var4 + var65;
            var3 = var77 ^ var76 >>> 9;
            var8 = var3 + var68;
            var10 = var9 + var76;
        }
        for (int var12 = 0; var12 < 256; var12 += 8) {
            int var38 = this.field3990[var12 + 2] + var8;
            int var39 = this.field3990[var12 + 4] + var6;
            int var40 = this.field3990[var12 + 7] + var3;
            int var41 = this.field3990[var12 + 1] + var9;
            int var42 = this.field3990[var12 + 5] + var5;
            int var43 = this.field3990[var12 + 3] + var7;
            int var44 = this.field3990[var12 + 6] + var4;
            int var45 = this.field3990[var12] + var10;
            int var46 = var45 ^ var41 << 11;
            int var47 = var38 + var41;
            int var48 = var43 + var46;
            int var49 = var47 ^ var38 >>> 2;
            int var50 = var38 + var48;
            int var51 = var39 + var49;
            int var52 = var50 ^ var48 << 8;
            int var53 = var48 + var51;
            var7 = var53 ^ var51 >>> 16;
            int var54 = var42 + var52;
            int var55 = var7 + var44;
            int var56 = var51 + var54;
            var6 = var56 ^ var54 << 10;
            int var57 = var6 + var40;
            int var58 = var54 + var55;
            var5 = var58 ^ var55 >>> 4;
            int var59 = var5 + var46;
            int var60 = var55 + var57;
            var4 = var60 ^ var57 << 8;
            int var61 = var57 + var59;
            var9 = var4 + var49;
            var3 = var61 ^ var59 >>> 9;
            var8 = var3 + var52;
            var10 = var9 + var59;
            this.field3996[var12] = var10;
            this.field3996[var12 + 1] = var9;
            this.field3996[var12 + 2] = var8;
            this.field3996[var12 + 3] = var7;
            this.field3996[var12 + 4] = var6;
            this.field3996[var12 + 5] = var5;
            this.field3996[var12 + 6] = var4;
            this.field3996[var12 + 7] = var3;
        }
        for (int var13 = 0; var13 < 256; var13 += 8) {
            int var14 = this.field3996[var13 + 4] + var6;
            int var15 = this.field3996[var13] + var10;
            int var16 = this.field3996[var13 + 3] + var7;
            int var17 = this.field3996[var13 + 2] + var8;
            int var18 = this.field3996[var13 + 7] + var3;
            int var19 = this.field3996[var13 + 5] + var5;
            int var20 = this.field3996[var13 + 1] + var9;
            int var21 = var15 ^ var20 << 11;
            int var22 = var17 + var20;
            int var23 = this.field3996[var13 + 6] + var4;
            int var24 = var22 ^ var17 >>> 2;
            int var25 = var16 + var21;
            int var26 = var14 + var24;
            int var27 = var17 + var25;
            int var28 = var27 ^ var25 << 8;
            int var29 = var25 + var26;
            var7 = var29 ^ var26 >>> 16;
            int var30 = var7 + var23;
            int var31 = var19 + var28;
            int var32 = var26 + var31;
            var6 = var32 ^ var31 << 10;
            int var33 = var30 + var31;
            int var34 = var6 + var18;
            var5 = var33 ^ var30 >>> 4;
            int var35 = var5 + var21;
            int var36 = var30 + var34;
            var4 = var36 ^ var34 << 8;
            var9 = var4 + var24;
            int var37 = var34 + var35;
            var3 = var37 ^ var35 >>> 9;
            var8 = var3 + var28;
            var10 = var9 + var35;
            this.field3996[var13] = var10;
            this.field3996[var13 + 1] = var9;
            this.field3996[var13 + 2] = var8;
            this.field3996[var13 + 3] = var7;
            this.field3996[var13 + 4] = var6;
            this.field3996[var13 + 5] = var5;
            this.field3996[var13 + 6] = var4;
            this.field3996[var13 + 7] = var3;
        }
        this.method1333((byte) -125);
        this.field4000 = 256;
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(B)V")
    private final void method1333(byte arg0) {
        int var2 = 81 / ((arg0 - 11) / 39);
        field3992++;
        this.field3997 += ++this.field3999;
        for (int var3 = 0; var3 < 256; var3++) {
            int var4 = this.field3996[var3];
            if ((var3 & 0x2) == 0) {
                if ((var3 & 0x1) == 0) {
                    this.field4001 ^= this.field4001 << 13;
                } else {
                    this.field4001 ^= this.field4001 >>> 6;
                }
            } else if ((var3 & 0x1) == 0) {
                this.field4001 ^= this.field4001 << 2;
            } else {
                this.field4001 ^= this.field4001 >>> 16;
            }
            this.field4001 += this.field3996[var3 + 128 & 0xFF];
            int var5;
            this.field3996[var3] = var5 = this.field3997 + this.field3996[class142.method1018(var4 >> 2, 255)] + this.field4001;
            this.field3990[var3] = this.field3997 = this.field3996[class142.method1018(var5 >> 8 >> 2, 255)] + var4;
        }
    }

    @OriginalMember(owner = "client!we", name = "<init>", descriptor = "([I)V")
    public class203(int[] arg0) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            this.field3990[var2] = arg0[var2];
        }
        this.method1332(-123);
    }
}
