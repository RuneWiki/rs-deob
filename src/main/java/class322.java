import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ug")
public class class322 {

    @OriginalMember(owner = "client!ug", name = "g", descriptor = "[I")
    private int[] field5040;

    @OriginalMember(owner = "client!ug", name = "f", descriptor = "[I")
    private int[] field5039;

    @OriginalMember(owner = "client!ug", name = "e", descriptor = "Lb;")
    public static class66 field5038 = new class66();

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "I")
    private int field5034;

    @OriginalMember(owner = "client!ug", name = "b", descriptor = "I")
    public static int field5035;

    @OriginalMember(owner = "client!ug", name = "c", descriptor = "I")
    public static int field5036;

    @OriginalMember(owner = "client!ug", name = "d", descriptor = "I")
    public static int field5037;

    @OriginalMember(owner = "client!ug", name = "h", descriptor = "I")
    private int field5041;

    @OriginalMember(owner = "client!ug", name = "i", descriptor = "I")
    private int field5042;

    @OriginalMember(owner = "client!ug", name = "j", descriptor = "I")
    public static int field5043;

    @OriginalMember(owner = "client!ug", name = "k", descriptor = "I")
    public static int field5044;

    @OriginalMember(owner = "client!ug", name = "l", descriptor = "I")
    public static int field5045;

    @OriginalMember(owner = "client!ug", name = "m", descriptor = "I")
    private int field5046;

    @OriginalMember(owner = "client!ug", name = "o", descriptor = "I")
    public static int field5048;

    @OriginalMember(owner = "client!ug", name = "p", descriptor = "Lbi;")
    public static class91 field5049;

    @OriginalMember(owner = "client!ug", name = "q", descriptor = "Ljava/lang/String;")
    public static String field5050;

    @OriginalMember(owner = "client!ug", name = "n", descriptor = "[Lme;")
    public static class200[] field5047;

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(B)V", line = 9)
    public static void method2266(byte arg0) {
        if (arg0 != -37) {
            field5038 = (class66) null;
        }
        field5050 = null;
        field5038 = null;
        field5049 = null;
        field5047 = null;
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(I)V", line = 26)
    public static final void method2267(int arg0) {
        field5043++;
        if (class64.field931 == 0) {
            return;
        }
        try {
            if (++class155.field2526 > 1500) {
                if (class319.field5005 != null) {
                    class319.field5005.method371(-2);
                    class319.field5005 = null;
                }
                if (class77.field1211 >= 1) {
                    class133.field2117 = -5;
                    class64.field931 = 0;
                    return;
                }
                class64.field931 = 1;
                if (class264.field3913 == class149.field2427) {
                    class264.field3913 = class139.field2254;
                } else {
                    class264.field3913 = class149.field2427;
                }
                class77.field1211++;
                class155.field2526 = 0;
            }
            if (class64.field931 == 1) {
                class334.field5192 = class92.field1484.method549(field5050, class264.field3913, (byte) 72);
                class64.field931 = 2;
            }
            if (arg0 != 18705) {
                method2270(32);
            }
            if (class64.field931 == 2) {
                if (class334.field5192.field405 == 2) {
                    throw new IOException();
                }
                if (class334.field5192.field405 != 1) {
                    return;
                }
                class319.field5005 = new class41((Socket) class334.field5192.field409, class92.field1484);
                class334.field5192 = null;
                class319.field5005.method373(arg0 ^ 0x4910, 0, class209.field3305.field34, class209.field3305.field48);
                if (class55.field837 != null) {
                    class55.field837.method2326((byte) 69);
                }
                if (class255.field3765 != null) {
                    class255.field3765.method2326((byte) 51);
                }
                int var1 = class319.field5005.method372(0);
                if (class55.field837 != null) {
                    class55.field837.method2326((byte) 15);
                }
                if (class255.field3765 != null) {
                    class255.field3765.method2326((byte) 105);
                }
                if (var1 != 101) {
                    class64.field931 = 0;
                    class133.field2117 = var1;
                    class319.field5005.method371(-2);
                    class319.field5005 = null;
                    return;
                }
                class64.field931 = 3;
            }
            if (class64.field931 == 3) {
                if (class319.field5005.method370((byte) 126) < 2) {
                    return;
                }
                int var2 = class319.field5005.method372(0) << 8 | class319.field5005.method372(arg0 - 18705);
                class36.method323(var2, 2);
                if (class1.field72 == -1) {
                    class64.field931 = 0;
                    class133.field2117 = 6;
                    class319.field5005.method371(-2);
                    class319.field5005 = null;
                    return;
                }
                class64.field931 = 0;
                class319.field5005.method371(-2);
                class319.field5005 = null;
                class272.method1938(-85);
                return;
            }
        } catch (IOException var4) {
            if (class319.field5005 != null) {
                class319.field5005.method371(arg0 - 18707);
                class319.field5005 = null;
            }
            if (class77.field1211 < 1) {
                class155.field2526 = 0;
                class77.field1211++;
                if (class264.field3913 == class149.field2427) {
                    class264.field3913 = class139.field2254;
                } else {
                    class264.field3913 = class149.field2427;
                }
                class64.field931 = 1;
            } else {
                class64.field931 = 0;
                class133.field2117 = -4;
            }
        }
    }

    @OriginalMember(owner = "client!ug", name = "b", descriptor = "(I)I", line = 174)
    public final int method2268(int arg0) {
        if (arg0 >= -16) {
            return 50;
        }
        if (this.field5046-- == 0) {
            this.method2269((byte) 73);
            this.field5046 = 255;
        }
        field5048++;
        return this.field5039[this.field5046];
    }

    @OriginalMember(owner = "client!ug", name = "b", descriptor = "(B)V", line = 193)
    private final void method2269(byte arg0) {
        this.field5034 += ++this.field5041;
        field5035++;
        if (arg0 != 73) {
            this.method2268(36);
        }
        for (int var2 = 0; var2 < 256; var2++) {
            int var3 = this.field5040[var2];
            if ((var2 & 0x2) == 0) {
                if ((var2 & 0x1) == 0) {
                    this.field5042 ^= this.field5042 << 13;
                } else {
                    this.field5042 ^= this.field5042 >>> 6;
                }
            } else if ((var2 & 0x1) == 0) {
                this.field5042 ^= this.field5042 << 2;
            } else {
                this.field5042 ^= this.field5042 >>> 16;
            }
            this.field5042 += this.field5040[var2 + 128 & 0xFF];
            int var4;
            this.field5040[var2] = var4 = this.field5042 + this.field5040[class164.method1234(1020, var3) >> 2] + this.field5034;
            this.field5039[var2] = this.field5034 = var3 + this.field5040[class164.method1234(var4 >> 8 >> 2, 255)];
        }
    }

    @OriginalMember(owner = "client!ug", name = "c", descriptor = "(I)V", line = 233)
    public static final void method2270(int arg0) {
        if (arg0 >= -13) {
            method2266((byte) -35);
        }
        field5036++;
        if (class128.field2052) {
            return;
        }
        class6.field134 = true;
        class128.field2052 = true;
        if (class126.field2018) {
            class171.field2747 = (float) ((int) class171.field2747 + 191 & 0xFFFFFF80);
        } else {
            class217.field3376 += (24.0F - class217.field3376) / 2.0F;
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(I[B)Z", line = 260)
    public static final boolean method2271(int arg0, byte[] arg1) {
        field5044++;
        class1 var2 = new class1(arg1);
        if (arg0 >= -68) {
            method2266((byte) -25);
        }
        int var3 = var2.method15((byte) 117);
        if (var3 != 1) {
            return false;
        }
        boolean var4 = var2.method15((byte) 71) == 1;
        if (var4) {
            class216.method1565(var2, 0);
        }
        class204.method1460(-9401, var2);
        return true;
    }

    @OriginalMember(owner = "client!ug", name = "<init>", descriptor = "()V", line = 294)
    private class322() {
    }

    @OriginalMember(owner = "client!ug", name = "<init>", descriptor = "([I)V", line = 296)
    public class322(int[] arg0) {
        this.field5040 = new int[256];
        this.field5039 = new int[256];
        for (int var2 = 0; var2 < arg0.length; var2++) {
            this.field5039[var2] = arg0[var2];
        }
        this.method2272(8);
    }

    @OriginalMember(owner = "client!ug", name = "d", descriptor = "(I)V", line = 317)
    private final void method2272(int arg0) {
        if (arg0 != 8) {
            method2271(89, (byte[]) null);
        }
        field5045++;
        int var2 = -1640531527;
        int var3 = -1640531527;
        int var4 = -1640531527;
        int var5 = -1640531527;
        int var6 = -1640531527;
        int var7 = -1640531527;
        int var8 = -1640531527;
        int var9 = -1640531527;
        for (int var10 = 0; var10 < 4; var10++) {
            int var11 = var9 ^ var8 << 11;
            int var12 = var7 + var8;
            int var13 = var6 + var11;
            int var14 = var12 ^ var7 >>> 2;
            int var15 = var5 + var14;
            int var16 = var7 + var13;
            int var17 = var16 ^ var13 << 8;
            int var18 = var4 + var17;
            int var19 = var13 + var15;
            var6 = var19 ^ var15 >>> 16;
            int var20 = var15 + var18;
            var5 = var20 ^ var18 << 10;
            int var21 = var3 + var6;
            int var22 = var2 + var5;
            int var23 = var18 + var21;
            var4 = var23 ^ var21 >>> 4;
            int var24 = var21 + var22;
            var3 = var24 ^ var22 << 8;
            int var25 = var4 + var11;
            int var26 = var22 + var25;
            var2 = var26 ^ var25 >>> 9;
            var8 = var3 + var14;
            var7 = var2 + var17;
            var9 = var8 + var25;
        }
        for (int var27 = 0; var27 < 256; var27 += 8) {
            int var28 = this.field5039[var27 + 7] + var2;
            int var29 = this.field5039[var27 + 6] + var3;
            int var30 = this.field5039[var27 + 2] + var7;
            int var31 = this.field5039[var27 + 5] + var4;
            int var32 = this.field5039[var27 + 3] + var6;
            int var33 = this.field5039[var27 + 1] + var8;
            int var34 = this.field5039[var27 + 4] + var5;
            int var35 = this.field5039[var27] + var9;
            int var36 = var35 ^ var33 << 11;
            int var37 = var30 + var33;
            int var38 = var32 + var36;
            int var39 = var37 ^ var30 >>> 2;
            int var40 = var34 + var39;
            int var41 = var30 + var38;
            int var42 = var41 ^ var38 << 8;
            int var43 = var31 + var42;
            int var44 = var38 + var40;
            var6 = var44 ^ var40 >>> 16;
            int var45 = var40 + var43;
            int var46 = var6 + var29;
            var5 = var45 ^ var43 << 10;
            int var47 = var43 + var46;
            int var48 = var5 + var28;
            var4 = var47 ^ var46 >>> 4;
            int var49 = var4 + var36;
            int var50 = var46 + var48;
            var3 = var50 ^ var48 << 8;
            var8 = var3 + var39;
            int var51 = var48 + var49;
            var2 = var51 ^ var49 >>> 9;
            var7 = var2 + var42;
            var9 = var8 + var49;
            this.field5040[var27] = var9;
            this.field5040[var27 + 1] = var8;
            this.field5040[var27 + 2] = var7;
            this.field5040[var27 + 3] = var6;
            this.field5040[var27 + 4] = var5;
            this.field5040[var27 + 5] = var4;
            this.field5040[var27 + 6] = var3;
            this.field5040[var27 + 7] = var2;
        }
        for (int var52 = 0; var52 < 256; var52 += 8) {
            int var53 = this.field5040[var52 + 3] + var6;
            int var54 = this.field5040[var52 + 4] + var5;
            int var55 = this.field5040[var52] + var9;
            int var56 = this.field5040[var52 + 7] + var2;
            int var57 = this.field5040[var52 + 2] + var7;
            int var58 = this.field5040[var52 + 1] + var8;
            int var59 = this.field5040[var52 + 5] + var4;
            int var60 = var55 ^ var58 << 11;
            int var61 = this.field5040[var52 + 6] + var3;
            int var62 = var53 + var60;
            int var63 = var57 + var58;
            int var64 = var63 ^ var57 >>> 2;
            int var65 = var54 + var64;
            int var66 = var57 + var62;
            int var67 = var66 ^ var62 << 8;
            int var68 = var62 + var65;
            int var69 = var59 + var67;
            var6 = var68 ^ var65 >>> 16;
            int var70 = var65 + var69;
            int var71 = var6 + var61;
            var5 = var70 ^ var69 << 10;
            int var72 = var5 + var56;
            int var73 = var69 + var71;
            var4 = var73 ^ var71 >>> 4;
            int var74 = var71 + var72;
            var3 = var74 ^ var72 << 8;
            int var75 = var4 + var60;
            int var76 = var72 + var75;
            var8 = var3 + var64;
            var2 = var76 ^ var75 >>> 9;
            var9 = var8 + var75;
            var7 = var2 + var67;
            this.field5040[var52] = var9;
            this.field5040[var52 + 1] = var8;
            this.field5040[var52 + 2] = var7;
            this.field5040[var52 + 3] = var6;
            this.field5040[var52 + 4] = var5;
            this.field5040[var52 + 5] = var4;
            this.field5040[var52 + 6] = var3;
            this.field5040[var52 + 7] = var2;
        }
        this.method2269((byte) 73);
        this.field5046 = 256;
    }
}
