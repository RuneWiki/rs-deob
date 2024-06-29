import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!va")
public class class198 {

    @OriginalMember(owner = "client!va", name = "s", descriptor = "[I")
    private int[] field3879;

    @OriginalMember(owner = "client!va", name = "d", descriptor = "[I")
    private int[] field3864;

    @OriginalMember(owner = "client!va", name = "a", descriptor = "Ljd;")
    public static class92 field3861 = class202.method1325((byte) 90, "Ihr Spielkonto wird bereits benutzt)3");

    @OriginalMember(owner = "client!va", name = "f", descriptor = "Ljd;")
    public static class92 field3866 = class202.method1325((byte) 90, "<col=ffffff>");

    @OriginalMember(owner = "client!va", name = "n", descriptor = "Ljd;")
    public static class92 field3874 = class202.method1325((byte) 90, "T");

    @OriginalMember(owner = "client!va", name = "t", descriptor = "Ljd;")
    private static class92 field3880 = class202.method1325((byte) 90, "Unable to find ");

    @OriginalMember(owner = "client!va", name = "g", descriptor = "Ljd;")
    public static class92 field3867 = field3880;

    @OriginalMember(owner = "client!va", name = "r", descriptor = "I")
    public static int field3878 = -1;

    @OriginalMember(owner = "client!va", name = "c", descriptor = "I")
    public static int field3863;

    @OriginalMember(owner = "client!va", name = "e", descriptor = "I")
    private int field3865;

    @OriginalMember(owner = "client!va", name = "h", descriptor = "I")
    private int field3868;

    @OriginalMember(owner = "client!va", name = "i", descriptor = "I")
    private int field3869;

    @OriginalMember(owner = "client!va", name = "j", descriptor = "I")
    public static int field3870;

    @OriginalMember(owner = "client!va", name = "l", descriptor = "I")
    public static int field3872;

    @OriginalMember(owner = "client!va", name = "m", descriptor = "I")
    public static int field3873;

    @OriginalMember(owner = "client!va", name = "o", descriptor = "I")
    public static int field3875;

    @OriginalMember(owner = "client!va", name = "p", descriptor = "I")
    private int field3876;

    @OriginalMember(owner = "client!va", name = "q", descriptor = "I")
    public static int field3877;

    @OriginalMember(owner = "client!va", name = "k", descriptor = "Lub;")
    public static class190 field3871;

    @OriginalMember(owner = "client!va", name = "b", descriptor = "Lud;")
    public static class192 field3862;

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(Z)V")
    private final void method1311(boolean arg0) {
        this.field3869 += ++this.field3876;
        field3875++;
        int var2 = 0;
        if (!arg0) {
            this.method1311(false);
        }
        while (var2 < 256) {
            int var3 = this.field3879[var2];
            if ((var2 & 0x2) == 0) {
                if ((var2 & 0x1) == 0) {
                    this.field3868 ^= this.field3868 << 13;
                } else {
                    this.field3868 ^= this.field3868 >>> 6;
                }
            } else if ((var2 & 0x1) == 0) {
                this.field3868 ^= this.field3868 << 2;
            } else {
                this.field3868 ^= this.field3868 >>> 16;
            }
            this.field3868 += this.field3879[var2 + 128 & 0xFF];
            int var4;
            this.field3879[var2] = var4 = this.field3869 + this.field3868 + this.field3879[class196.method1301(var3 >> 2, 255)];
            this.field3864[var2] = this.field3869 = this.field3879[class196.method1301(var4 >> 8 >> 2, 255)] + var3;
            var2++;
        }
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(I)V")
    private final void method1312(int arg0) {
        field3873++;
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
            int var68 = var4 + var67;
            int var69 = var62 + var65;
            var6 = var69 ^ var65 >>> 16;
            int var70 = var3 + var6;
            int var71 = var65 + var68;
            var5 = var71 ^ var68 << 10;
            int var72 = var2 + var5;
            int var73 = var68 + var70;
            var4 = var73 ^ var70 >>> 4;
            int var74 = var4 + var61;
            int var75 = var70 + var72;
            var3 = var75 ^ var72 << 8;
            int var76 = var72 + var74;
            var8 = var3 + var64;
            var2 = var76 ^ var74 >>> 9;
            var7 = var2 + var67;
            var9 = var8 + var74;
        }
        for (int var11 = 0; var11 < 256; var11 += 8) {
            int var37 = this.field3864[var11 + 2] + var7;
            int var38 = this.field3864[var11 + 4] + var5;
            int var39 = this.field3864[var11] + var9;
            int var40 = this.field3864[var11 + 1] + var8;
            int var41 = this.field3864[var11 + 3] + var6;
            int var42 = this.field3864[var11 + 6] + var3;
            int var43 = this.field3864[var11 + 5] + var4;
            int var44 = this.field3864[var11 + 7] + var2;
            int var45 = var39 ^ var40 << 11;
            int var46 = var37 + var40;
            int var47 = var41 + var45;
            int var48 = var46 ^ var37 >>> 2;
            int var49 = var37 + var47;
            int var50 = var49 ^ var47 << 8;
            int var51 = var38 + var48;
            int var52 = var43 + var50;
            int var53 = var47 + var51;
            var6 = var53 ^ var51 >>> 16;
            int var54 = var6 + var42;
            int var55 = var51 + var52;
            var5 = var55 ^ var52 << 10;
            int var56 = var5 + var44;
            int var57 = var52 + var54;
            var4 = var57 ^ var54 >>> 4;
            int var58 = var4 + var45;
            int var59 = var54 + var56;
            var3 = var59 ^ var56 << 8;
            var8 = var3 + var48;
            int var60 = var56 + var58;
            var2 = var60 ^ var58 >>> 9;
            var9 = var8 + var58;
            this.field3879[var11] = var9;
            var7 = var2 + var50;
            this.field3879[var11 + 1] = var8;
            this.field3879[var11 + 2] = var7;
            this.field3879[var11 + 3] = var6;
            this.field3879[var11 + 4] = var5;
            this.field3879[var11 + 5] = var4;
            this.field3879[var11 + 6] = var3;
            this.field3879[var11 + 7] = var2;
        }
        if (arg0 != -1583157726) {
            field3880 = null;
        }
        for (int var12 = 0; var12 < 256; var12 += 8) {
            int var13 = this.field3879[var12 + 6] + var3;
            int var14 = this.field3879[var12 + 1] + var8;
            int var15 = this.field3879[var12 + 2] + var7;
            int var16 = this.field3879[var12 + 5] + var4;
            int var17 = this.field3879[var12 + 4] + var5;
            int var18 = this.field3879[var12] + var9;
            int var19 = var18 ^ var14 << 11;
            int var20 = var14 + var15;
            int var21 = this.field3879[var12 + 3] + var6;
            int var22 = var19 + var21;
            int var23 = var20 ^ var15 >>> 2;
            int var24 = var17 + var23;
            int var25 = var15 + var22;
            int var26 = this.field3879[var12 + 7] + var2;
            int var27 = var25 ^ var22 << 8;
            int var28 = var16 + var27;
            int var29 = var22 + var24;
            var6 = var29 ^ var24 >>> 16;
            int var30 = var24 + var28;
            var5 = var30 ^ var28 << 10;
            int var31 = var5 + var26;
            int var32 = var6 + var13;
            int var33 = var28 + var32;
            var4 = var33 ^ var32 >>> 4;
            int var34 = var31 + var32;
            var3 = var34 ^ var31 << 8;
            var8 = var3 + var23;
            int var35 = var4 + var19;
            int var36 = var31 + var35;
            var2 = var36 ^ var35 >>> 9;
            var7 = var2 + var27;
            var9 = var8 + var35;
            this.field3879[var12] = var9;
            this.field3879[var12 + 1] = var8;
            this.field3879[var12 + 2] = var7;
            this.field3879[var12 + 3] = var6;
            this.field3879[var12 + 4] = var5;
            this.field3879[var12 + 5] = var4;
            this.field3879[var12 + 6] = var3;
            this.field3879[var12 + 7] = var2;
        }
        this.method1311(true);
        this.field3865 = 256;
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(ZILfd;)V")
    public static final void method1313(boolean arg0, int arg1, class55 arg2) {
        if (class123.field2485 != null) {
            try {
                class123.field2485.method319(true);
            } catch (Exception var8) {
            }
            class123.field2485 = null;
        }
        class123.field2485 = arg2;
        class47.method291(arg0, 128);
        field3870++;
        class46.field1017 = 0;
        class116.field2351 = null;
        if (arg1 != 4) {
            field3866 = null;
        }
        class208.field4000 = null;
        class16.field444.field1472 = 0;
        while (true) {
            class153 var3 = (class153) class190.field3610.method215((byte) -79);
            if (var3 == null) {
                while (true) {
                    class153 var4 = (class153) class126.field2547.method215((byte) -84);
                    if (var4 == null) {
                        if (class147.field2921 != 0) {
                            try {
                                class70 var5 = new class70(4);
                                var5.method428(4, 122);
                                var5.method428(class147.field2921, 92);
                                var5.method458(0, 9345);
                                class123.field2485.method324(0, var5.field1493, 4, 2084);
                            } catch (IOException var7) {
                                try {
                                    class123.field2485.method319(true);
                                } catch (Exception var6) {
                                }
                                class43.field975++;
                                class123.field2485 = null;
                            }
                        }
                        class187.field3533 = 0;
                        class180.field3443 = class168.method1118(1);
                        return;
                    }
                    class156.field3094.method1160(-1886201657, var4);
                    class164.field3198.method210((byte) -66, var4.field4079, var4);
                    class182.field3465--;
                    class74.field1563++;
                }
            }
            class100.field2058.method210((byte) -72, var3.field4079, var3);
            class129.field2600--;
            class208.field4002++;
        }
    }

    @OriginalMember(owner = "client!va", name = "b", descriptor = "(Z)I")
    public final int method1314(boolean arg0) {
        if (this.field3865-- == 0) {
            this.method1311(arg0);
            this.field3865 = 255;
        }
        field3863++;
        if (!arg0) {
            this.field3868 = 93;
        }
        return this.field3864[this.field3865];
    }

    @OriginalMember(owner = "client!va", name = "b", descriptor = "(I)V")
    public static void method1315(int arg0) {
        field3880 = null;
        field3861 = null;
        field3867 = null;
        if (arg0 != 10455) {
            field3880 = null;
        }
        field3874 = null;
        field3862 = null;
        field3866 = null;
        field3871 = null;
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(III)Ltf;")
    public static final class185 method1316(int arg0, int arg1, int arg2) {
        class43 var3 = class31.field698[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        }
        for (int var4 = 0; var4 < var3.field979; var4++) {
            class185 var5 = var3.field966[var4];
            if ((var5.field3495 >> 29 & 0x3L) == 2L && var5.field3488 == arg1 && var5.field3486 == arg2) {
                return var5;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!va", name = "<init>", descriptor = "()V")
    private class198() {
    }

    @OriginalMember(owner = "client!va", name = "<init>", descriptor = "([I)V")
    public class198(int[] arg0) {
        this.field3879 = new int[256];
        this.field3864 = new int[256];
        for (int var2 = 0; var2 < arg0.length; var2++) {
            this.field3864[var2] = arg0[var2];
        }
        this.method1312(-1583157726);
    }
}
