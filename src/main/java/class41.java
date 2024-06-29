import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qr")
public class class41 {

    @OriginalMember(owner = "client!qr", name = "k", descriptor = "[I")
    private int[] field600;

    @OriginalMember(owner = "client!qr", name = "l", descriptor = "[I")
    private int[] field601;

    @OriginalMember(owner = "client!qr", name = "d", descriptor = "Lno;")
    public static class420 field593 = new class420(128);

    @OriginalMember(owner = "client!qr", name = "n", descriptor = "Z")
    public static boolean field603 = false;

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "I")
    public static int field590;

    @OriginalMember(owner = "client!qr", name = "b", descriptor = "I")
    public static int field591;

    @OriginalMember(owner = "client!qr", name = "c", descriptor = "I")
    private int field592;

    @OriginalMember(owner = "client!qr", name = "e", descriptor = "I")
    private int field594;

    @OriginalMember(owner = "client!qr", name = "f", descriptor = "I")
    private int field595;

    @OriginalMember(owner = "client!qr", name = "g", descriptor = "I")
    private int field596;

    @OriginalMember(owner = "client!qr", name = "h", descriptor = "I")
    public static int field597;

    @OriginalMember(owner = "client!qr", name = "i", descriptor = "I")
    public static int field598;

    @OriginalMember(owner = "client!qr", name = "j", descriptor = "I")
    public static int field599;

    @OriginalMember(owner = "client!qr", name = "m", descriptor = "I")
    public static int field602;

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(Z)V")
    private final void method376(boolean arg0) {
        field602++;
        if (!arg0) {
            return;
        }
        this.field592 += ++this.field596;
        for (int var2 = 0; var2 < 256; var2++) {
            int var3 = this.field601[var2];
            if ((var2 & 0x2) == 0) {
                if ((var2 & 0x1) == 0) {
                    this.field595 ^= this.field595 << 13;
                } else {
                    this.field595 ^= this.field595 >>> 6;
                }
            } else if ((var2 & 0x1) == 0) {
                this.field595 ^= this.field595 << 2;
            } else {
                this.field595 ^= this.field595 >>> 16;
            }
            this.field595 += this.field601[var2 + 128 & 0xFF];
            int var4;
            this.field601[var2] = var4 = this.field595 + this.field601[class387.method2454(1020, var3) >> 2] + this.field592;
            this.field600[var2] = this.field592 = var3 + this.field601[class387.method2454(var4 >> 8 >> 2, 255)];
        }
    }

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(I)I")
    public final int method377(int arg0) {
        field590++;
        if (arg0 != 255) {
            return -57;
        }
        if (this.field594-- == 0) {
            this.method376(true);
            this.field594 = 255;
        }
        return this.field600[this.field594];
    }

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;B)V")
    public static final void method378(int arg0, String arg1, int arg2, String arg3, String arg4, byte arg5) {
        field599++;
        class384.method2437(arg4, 1, arg1, -1, (String) null, arg2, arg0, arg3);
        int var6 = 125 % ((arg5 - 28) / 55);
    }

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(B)V")
    private final void method379(byte arg0) {
        field591++;
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
            int var72 = var2 + var5;
            int var73 = var69 + var71;
            var4 = var73 ^ var71 >>> 4;
            int var74 = var71 + var72;
            int var75 = var4 + var61;
            var3 = var74 ^ var72 << 8;
            int var76 = var72 + var75;
            var8 = var3 + var64;
            var2 = var76 ^ var75 >>> 9;
            var9 = var8 + var75;
            var7 = var2 + var67;
        }
        for (int var11 = 0; var11 < 256; var11 += 8) {
            int var37 = this.field600[var11 + 6] + var3;
            int var38 = this.field600[var11 + 4] + var5;
            int var39 = this.field600[var11] + var9;
            int var40 = this.field600[var11 + 7] + var2;
            int var41 = this.field600[var11 + 3] + var6;
            int var42 = this.field600[var11 + 2] + var7;
            int var43 = this.field600[var11 + 5] + var4;
            int var44 = this.field600[var11 + 1] + var8;
            int var45 = var39 ^ var44 << 11;
            int var46 = var41 + var45;
            int var47 = var42 + var44;
            int var48 = var47 ^ var42 >>> 2;
            int var49 = var42 + var46;
            int var50 = var38 + var48;
            int var51 = var49 ^ var46 << 8;
            int var52 = var46 + var50;
            int var53 = var43 + var51;
            var6 = var52 ^ var50 >>> 16;
            int var54 = var6 + var37;
            int var55 = var50 + var53;
            var5 = var55 ^ var53 << 10;
            int var56 = var53 + var54;
            int var57 = var5 + var40;
            var4 = var56 ^ var54 >>> 4;
            int var58 = var4 + var45;
            int var59 = var54 + var57;
            var3 = var59 ^ var57 << 8;
            int var60 = var57 + var58;
            var8 = var3 + var48;
            var2 = var60 ^ var58 >>> 9;
            var9 = var8 + var58;
            var7 = var2 + var51;
            this.field601[var11] = var9;
            this.field601[var11 + 1] = var8;
            this.field601[var11 + 2] = var7;
            this.field601[var11 + 3] = var6;
            this.field601[var11 + 4] = var5;
            this.field601[var11 + 5] = var4;
            this.field601[var11 + 6] = var3;
            this.field601[var11 + 7] = var2;
        }
        if (arg0 >= -108) {
            this.method376(true);
        }
        for (int var12 = 0; var12 < 256; var12 += 8) {
            int var13 = this.field601[var12 + 5] + var4;
            int var14 = this.field601[var12 + 7] + var2;
            int var15 = this.field601[var12] + var9;
            int var16 = this.field601[var12 + 4] + var5;
            int var17 = this.field601[var12 + 6] + var3;
            int var18 = this.field601[var12 + 3] + var6;
            int var19 = this.field601[var12 + 1] + var8;
            int var20 = this.field601[var12 + 2] + var7;
            int var21 = var15 ^ var19 << 11;
            int var22 = var19 + var20;
            int var23 = var18 + var21;
            int var24 = var22 ^ var20 >>> 2;
            int var25 = var16 + var24;
            int var26 = var20 + var23;
            int var27 = var26 ^ var23 << 8;
            int var28 = var23 + var25;
            int var29 = var13 + var27;
            var6 = var28 ^ var25 >>> 16;
            int var30 = var6 + var17;
            int var31 = var25 + var29;
            var5 = var31 ^ var29 << 10;
            int var32 = var29 + var30;
            int var33 = var5 + var14;
            var4 = var32 ^ var30 >>> 4;
            int var34 = var4 + var21;
            int var35 = var30 + var33;
            var3 = var35 ^ var33 << 8;
            var8 = var3 + var24;
            int var36 = var33 + var34;
            var2 = var36 ^ var34 >>> 9;
            var7 = var2 + var27;
            var9 = var8 + var34;
            this.field601[var12] = var9;
            this.field601[var12 + 1] = var8;
            this.field601[var12 + 2] = var7;
            this.field601[var12 + 3] = var6;
            this.field601[var12 + 4] = var5;
            this.field601[var12 + 5] = var4;
            this.field601[var12 + 6] = var3;
            this.field601[var12 + 7] = var2;
        }
        this.method376(true);
        this.field594 = 256;
    }

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(II)V")
    public static final void method380(int arg0, int arg1) {
        class192.field2649 = -1;
        class254.field3580 = arg1;
        field598++;
        class192.field2649 = arg0;
        class410.method2564((byte) -42);
    }

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(IILjava/lang/String;IB)V")
    public static final void method381(int arg0, int arg1, String arg2, int arg3, byte arg4) {
        field597++;
        class453 var5 = class143.method983(-1, arg0, arg3);
        if (var5 == null) {
            return;
        }
        if (var5.field6366 != null) {
            class7 var6 = new class7();
            var6.field95 = var5;
            var6.field103 = arg2;
            var6.field110 = arg1;
            var6.field97 = var5.field6366;
            class177.method1168(var6);
        }
        boolean var7 = true;
        if (var5.field6403 > 0) {
            var7 = class18.method254(var5, 14158);
        }
        if (!var7 || arg4 >= -105 || !client.method1091(var5).method960(true, arg1 - 1)) {
            return;
        }
        if (arg1 == 1) {
            class46.field648.method1178(63, 39);
            class306.field4227++;
            class175.method1150(119, var5.field6452, arg3, arg0);
        }
        if (arg1 == 2) {
            class399.field5687++;
            class46.field648.method1178(63, 40);
            class175.method1150(79, var5.field6452, arg3, arg0);
        }
        if (arg1 == 3) {
            class46.field648.method1178(63, 87);
            class35.field539++;
            class175.method1150(126, var5.field6452, arg3, arg0);
        }
        if (arg1 == 4) {
            class46.field648.method1178(63, 35);
            class200.field2768++;
            class175.method1150(53, var5.field6452, arg3, arg0);
        }
        if (arg1 == 5) {
            class46.field648.method1178(63, 33);
            class375.field5349++;
            class175.method1150(101, var5.field6452, arg3, arg0);
        }
        if (arg1 == 6) {
            class46.field648.method1178(63, 99);
            class56.field765++;
            class175.method1150(93, var5.field6452, arg3, arg0);
        }
        if (arg1 == 7) {
            class244.field3454++;
            class46.field648.method1178(63, 164);
            class175.method1150(102, var5.field6452, arg3, arg0);
        }
        if (arg1 == 8) {
            class46.field648.method1178(63, 150);
            class368.field5189++;
            class175.method1150(82, var5.field6452, arg3, arg0);
        }
        if (arg1 == 9) {
            class203.field2786++;
            class46.field648.method1178(63, 159);
            class175.method1150(96, var5.field6452, arg3, arg0);
        }
        if (arg1 == 10) {
            class46.field648.method1178(63, 169);
            class9.field165++;
            class175.method1150(105, var5.field6452, arg3, arg0);
        }
    }

    @OriginalMember(owner = "client!qr", name = "b", descriptor = "(I)V")
    public static void method382(int arg0) {
        field593 = null;
        if (arg0 < 27) {
            field593 = null;
        }
    }

    @OriginalMember(owner = "client!qr", name = "<init>", descriptor = "()V")
    private class41() {
    }

    @OriginalMember(owner = "client!qr", name = "<init>", descriptor = "([I)V")
    public class41(int[] arg0) {
        this.field600 = new int[256];
        this.field601 = new int[256];
        for (int var2 = 0; var2 < arg0.length; var2++) {
            this.field600[var2] = arg0[var2];
        }
        this.method379((byte) -118);
    }
}
