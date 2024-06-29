import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sg")
public class class181 {

    @OriginalMember(owner = "client!sg", name = "k", descriptor = "[I")
    private int[] field2429;

    @OriginalMember(owner = "client!sg", name = "c", descriptor = "[I")
    private int[] field2421;

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "Z")
    public static boolean field2419 = false;

    @OriginalMember(owner = "client!sg", name = "i", descriptor = "Z")
    public static boolean field2427 = false;

    @OriginalMember(owner = "client!sg", name = "b", descriptor = "I")
    public static int field2420;

    @OriginalMember(owner = "client!sg", name = "d", descriptor = "I")
    public static int field2422;

    @OriginalMember(owner = "client!sg", name = "e", descriptor = "I")
    public static int field2423;

    @OriginalMember(owner = "client!sg", name = "g", descriptor = "I")
    private int field2425;

    @OriginalMember(owner = "client!sg", name = "h", descriptor = "I")
    private int field2426;

    @OriginalMember(owner = "client!sg", name = "j", descriptor = "I")
    public static int field2428;

    @OriginalMember(owner = "client!sg", name = "l", descriptor = "I")
    private int field2430;

    @OriginalMember(owner = "client!sg", name = "m", descriptor = "I")
    private int field2431;

    @OriginalMember(owner = "client!sg", name = "n", descriptor = "I")
    public static int field2432;

    @OriginalMember(owner = "client!sg", name = "f", descriptor = "[Ll;")
    public static class315[] field2424;

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(I)V", line = 8)
    private final void method1184(int arg0) {
        field2420++;
        this.field2430 += ++this.field2431;
        if (arg0 != -21636924) {
            this.method1186(53);
        }
        for (int var2 = 0; var2 < 256; var2++) {
            int var3 = this.field2429[var2];
            if ((var2 & 0x2) == 0) {
                if ((var2 & 0x1) == 0) {
                    this.field2425 ^= this.field2425 << 13;
                } else {
                    this.field2425 ^= this.field2425 >>> 6;
                }
            } else if ((var2 & 0x1) == 0) {
                this.field2425 ^= this.field2425 << 2;
            } else {
                this.field2425 ^= this.field2425 >>> 16;
            }
            this.field2425 += this.field2429[var2 + 128 & 0xFF];
            int var4;
            this.field2429[var2] = var4 = this.field2430 + this.field2425 + this.field2429[class394.method2529(var3 >> 2, 255)];
            this.field2421[var2] = this.field2430 = var3 + this.field2429[class394.method2529(255, var4 >> 8 >> 2)];
        }
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(Ltj;IILwh;BII)V", line = 51)
    public static final void method1185(class298 arg0, int arg1, int arg2, class288 arg3, byte arg4, int arg5, int arg6) {
        field2422++;
        if (class31.field512 < 100) {
            class429.method2681(arg0, arg3, (byte) -120);
        }
        arg0.method462(arg1, arg2, arg1 + arg6, arg2 + arg5);
        if (class31.field512 < 100) {
            byte var7 = 20;
            int var8 = arg6 / 2 + arg1;
            int var9 = arg5 / 2 + arg2 - var7 - 18;
            arg0.method435(arg1, arg2, arg6, arg5, -16777216, 0);
            arg0.method511(var8 - 152, var9, 304, 34, class443.field6401[class410.field5953].getRGB(), 0);
            arg0.method435(var8 - 150, var9 + 2, class31.field512 * 3, 30, class257.field3773[class410.field5953].getRGB(), 0);
            class199.field2756.method925(-1, class325.field4820, var8, class117.field1518[class410.field5953].getRGB(), -22978, var9 + var7);
            return;
        }
        int var10 = class297.field4487 - ((int) ((float) arg6 / class200.field2765));
        int var11 = class85.field1184 + ((int) ((float) arg5 / class200.field2765));
        int var12 = (int) ((float) arg6 / class200.field2765) + class297.field4487;
        class265.field3926 = class297.field4487 - ((int) ((float) arg6 / class200.field2765));
        class356.field5270 = class85.field1184 - (int) ((float) arg5 / class200.field2765);
        class27.field466 = (int) ((float) (arg5 * 2) / class200.field2765);
        int var13 = class85.field1184 - ((int) ((float) arg5 / class200.field2765));
        class30.field487 = (int) ((float) (arg6 * 2) / class200.field2765);
        if (arg4 != -124) {
            field2419 = true;
        }
        class200.method1340(var10 + class200.field2782, class200.field2789 + var11, class200.field2782 + var12, class200.field2789 + var13, arg1, arg2, arg1 + arg6, arg5 + 1 + arg2);
        class200.method1328(arg0);
        class242 var14 = class200.method1338(arg0);
        class356.method2339(0, arg4 + 3196, arg0, var14, 0);
        if (class280.field4118 > 0) {
            class184.field2463--;
            if (class184.field2463 == 0) {
                class280.field4118--;
                class184.field2463 = 20;
            }
        }
        if (!class169.field2287) {
            return;
        }
        int var15 = arg1 + arg6 - 5;
        int var16 = arg2 + arg5 - 8;
        class41.field630.method922(16776960, "Fps:" + class258.field3781, var15, var16, -1, 0);
        int var20 = var16 - 15;
        Runtime var17 = Runtime.getRuntime();
        int var18 = (int) ((var17.totalMemory() - var17.freeMemory()) / 1024L);
        int var19 = 16776960;
        if (var18 > 65536) {
            var19 = 16711680;
        }
        class41.field630.method922(var19, "Mem:" + var18 + "k", var15, var20, -1, 0);
        var16 = var20 - 15;
    }

    @OriginalMember(owner = "client!sg", name = "b", descriptor = "(I)V", line = 131)
    private final void method1186(int arg0) {
        field2428++;
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
            int var70 = var65 + var69;
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
            int var37 = this.field2421[var11] + var9;
            int var38 = this.field2421[var11 + 3] + var6;
            int var39 = this.field2421[var11 + 6] + var3;
            int var40 = this.field2421[var11 + 1] + var8;
            int var41 = this.field2421[var11 + 2] + var7;
            int var42 = this.field2421[var11 + 4] + var5;
            int var43 = this.field2421[var11 + 5] + var4;
            int var44 = this.field2421[var11 + 7] + var2;
            int var45 = var37 ^ var40 << 11;
            int var46 = var38 + var45;
            int var47 = var40 + var41;
            int var48 = var47 ^ var41 >>> 2;
            int var49 = var41 + var46;
            int var50 = var42 + var48;
            int var51 = var49 ^ var46 << 8;
            int var52 = var46 + var50;
            int var53 = var43 + var51;
            var6 = var52 ^ var50 >>> 16;
            int var54 = var50 + var53;
            int var55 = var6 + var39;
            var5 = var54 ^ var53 << 10;
            int var56 = var53 + var55;
            int var57 = var5 + var44;
            var4 = var56 ^ var55 >>> 4;
            int var58 = var4 + var45;
            int var59 = var55 + var57;
            var3 = var59 ^ var57 << 8;
            int var60 = var57 + var58;
            var8 = var3 + var48;
            var2 = var60 ^ var58 >>> 9;
            var7 = var2 + var51;
            var9 = var8 + var58;
            this.field2429[var11] = var9;
            this.field2429[var11 + 1] = var8;
            this.field2429[var11 + 2] = var7;
            this.field2429[var11 + 3] = var6;
            this.field2429[var11 + 4] = var5;
            this.field2429[var11 + 5] = var4;
            this.field2429[var11 + 6] = var3;
            this.field2429[var11 + 7] = var2;
        }
        for (int var12 = 0; var12 < 256; var12 += 8) {
            int var13 = this.field2429[var12 + 2] + var7;
            int var14 = this.field2429[var12] + var9;
            int var15 = this.field2429[var12 + 3] + var6;
            int var16 = this.field2429[var12 + 1] + var8;
            int var17 = this.field2429[var12 + 7] + var2;
            int var18 = this.field2429[var12 + 6] + var3;
            int var19 = this.field2429[var12 + 4] + var5;
            int var20 = this.field2429[var12 + 5] + var4;
            int var21 = var14 ^ var16 << 11;
            int var22 = var15 + var21;
            int var23 = var13 + var16;
            int var24 = var23 ^ var13 >>> 2;
            int var25 = var13 + var22;
            int var26 = var19 + var24;
            int var27 = var25 ^ var22 << 8;
            int var28 = var20 + var27;
            int var29 = var22 + var26;
            var6 = var29 ^ var26 >>> 16;
            int var30 = var26 + var28;
            int var31 = var6 + var18;
            var5 = var30 ^ var28 << 10;
            int var32 = var28 + var31;
            int var33 = var5 + var17;
            var4 = var32 ^ var31 >>> 4;
            int var34 = var31 + var33;
            int var35 = var4 + var21;
            var3 = var34 ^ var33 << 8;
            var8 = var3 + var24;
            int var36 = var33 + var35;
            var2 = var36 ^ var35 >>> 9;
            var9 = var8 + var35;
            var7 = var2 + var27;
            this.field2429[var12] = var9;
            this.field2429[var12 + 1] = var8;
            this.field2429[var12 + 2] = var7;
            this.field2429[var12 + 3] = var6;
            this.field2429[var12 + 4] = var5;
            this.field2429[var12 + 5] = var4;
            this.field2429[var12 + 6] = var3;
            this.field2429[var12 + 7] = var2;
        }
        this.method1184(-21636924);
        if (arg0 >= -21) {
            this.field2425 = 72;
        }
        this.field2426 = 256;
    }

    @OriginalMember(owner = "client!sg", name = "c", descriptor = "(I)I", line = 286)
    public final int method1187(int arg0) {
        if ((this.field2426--) == 0) {
            this.method1184(-21636924);
            this.field2426 = 255;
        }
        field2423++;
        return arg0 == 20647 ? this.field2421[this.field2426] : -7;
    }

    @OriginalMember(owner = "client!sg", name = "<init>", descriptor = "()V", line = 313)
    private class181() {
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(IB)V", line = 316)
    public static final void method1188(int arg0, byte arg1) {
        field2432++;
        if (arg1 != -92) {
            method1185((class298) null, -53, -37, (class288) null, (byte) 2, 90, -63);
        }
        class440 var2 = class186.method1241(arg0, 7, (byte) 56);
        var2.method2749(13828096);
    }

    @OriginalMember(owner = "client!sg", name = "<init>", descriptor = "([I)V", line = 328)
    public class181(int[] arg0) {
        this.field2429 = new int[256];
        this.field2421 = new int[256];
        for (int var2 = 0; var2 < arg0.length; var2++) {
            this.field2421[var2] = arg0[var2];
        }
        this.method1186(-81);
    }

    @OriginalMember(owner = "client!sg", name = "d", descriptor = "(I)V", line = 347)
    public static void method1189(int arg0) {
        int var1 = 11 % ((arg0 - 12) / 41);
        field2424 = null;
    }
}
