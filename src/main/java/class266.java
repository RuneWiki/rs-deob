import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fj")
public class class266 {

    @OriginalMember(owner = "client!fj", name = "b", descriptor = "[I")
    private int[] field4342;

    @OriginalMember(owner = "client!fj", name = "g", descriptor = "[I")
    private int[] field4347;

    @OriginalMember(owner = "client!fj", name = "f", descriptor = "J")
    public static long field4346 = 0L;

    @OriginalMember(owner = "client!fj", name = "j", descriptor = "Ljava/lang/String;")
    public static String field4350 = "Walk here";

    @OriginalMember(owner = "client!fj", name = "o", descriptor = "I")
    public static int field4355 = -1;

    @OriginalMember(owner = "client!fj", name = "k", descriptor = "F")
    public static float field4351;

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "I")
    public static int field4341;

    @OriginalMember(owner = "client!fj", name = "c", descriptor = "I")
    public static int field4343;

    @OriginalMember(owner = "client!fj", name = "d", descriptor = "I")
    private int field4344;

    @OriginalMember(owner = "client!fj", name = "e", descriptor = "I")
    private int field4345;

    @OriginalMember(owner = "client!fj", name = "h", descriptor = "I")
    private int field4348;

    @OriginalMember(owner = "client!fj", name = "i", descriptor = "I")
    private int field4349;

    @OriginalMember(owner = "client!fj", name = "l", descriptor = "I")
    public static int field4352;

    @OriginalMember(owner = "client!fj", name = "m", descriptor = "I")
    public static int field4353;

    @OriginalMember(owner = "client!fj", name = "n", descriptor = "I")
    public static int field4354;

    @OriginalMember(owner = "client!fj", name = "p", descriptor = "I")
    public static int field4356;

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(B)V", line = 5)
    private final void method1864(byte arg0) {
        field4354++;
        if (arg0 != 116) {
            method1867((byte) -13);
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
            int var11 = var9 ^ var8 << 11;
            int var12 = var7 + var8;
            int var13 = var12 ^ var7 >>> 2;
            int var14 = var5 + var13;
            int var15 = var6 + var11;
            int var16 = var7 + var15;
            int var17 = var16 ^ var15 << 8;
            int var18 = var4 + var17;
            int var19 = var14 + var15;
            var6 = var19 ^ var14 >>> 16;
            int var20 = var14 + var18;
            var5 = var20 ^ var18 << 10;
            int var21 = var2 + var5;
            int var22 = var3 + var6;
            int var23 = var18 + var22;
            var4 = var23 ^ var22 >>> 4;
            int var24 = var4 + var11;
            int var25 = var21 + var22;
            var3 = var25 ^ var21 << 8;
            var8 = var3 + var13;
            int var26 = var21 + var24;
            var2 = var26 ^ var24 >>> 9;
            var9 = var8 + var24;
            var7 = var2 + var17;
        }
        for (int var27 = 0; var27 < 256; var27 += 8) {
            int var28 = this.field4342[var27 + 1] + var8;
            int var29 = this.field4342[var27 + 5] + var4;
            int var30 = this.field4342[var27 + 2] + var7;
            int var31 = this.field4342[var27 + 7] + var2;
            int var32 = this.field4342[var27] + var9;
            int var33 = this.field4342[var27 + 4] + var5;
            int var34 = this.field4342[var27 + 3] + var6;
            int var35 = this.field4342[var27 + 6] + var3;
            int var36 = var32 ^ var28 << 11;
            int var37 = var34 + var36;
            int var38 = var28 + var30;
            int var39 = var38 ^ var30 >>> 2;
            int var40 = var33 + var39;
            int var41 = var30 + var37;
            int var42 = var41 ^ var37 << 8;
            int var43 = var37 + var40;
            int var44 = var29 + var42;
            var6 = var43 ^ var40 >>> 16;
            int var45 = var6 + var35;
            int var46 = var40 + var44;
            var5 = var46 ^ var44 << 10;
            int var47 = var5 + var31;
            int var48 = var44 + var45;
            var4 = var48 ^ var45 >>> 4;
            int var49 = var4 + var36;
            int var50 = var45 + var47;
            var3 = var50 ^ var47 << 8;
            var8 = var3 + var39;
            int var51 = var47 + var49;
            var2 = var51 ^ var49 >>> 9;
            var7 = var2 + var42;
            var9 = var8 + var49;
            this.field4347[var27] = var9;
            this.field4347[var27 + 1] = var8;
            this.field4347[var27 + 2] = var7;
            this.field4347[var27 + 3] = var6;
            this.field4347[var27 + 4] = var5;
            this.field4347[var27 + 5] = var4;
            this.field4347[var27 + 6] = var3;
            this.field4347[var27 + 7] = var2;
        }
        for (int var52 = 0; var52 < 256; var52 += 8) {
            int var53 = this.field4347[var52 + 1] + var8;
            int var54 = this.field4347[var52 + 3] + var6;
            int var55 = this.field4347[var52 + 5] + var4;
            int var56 = this.field4347[var52] + var9;
            int var57 = this.field4347[var52 + 6] + var3;
            int var58 = this.field4347[var52 + 4] + var5;
            int var59 = this.field4347[var52 + 7] + var2;
            int var60 = this.field4347[var52 + 2] + var7;
            int var61 = var56 ^ var53 << 11;
            int var62 = var53 + var60;
            int var63 = var62 ^ var60 >>> 2;
            int var64 = var58 + var63;
            int var65 = var54 + var61;
            int var66 = var60 + var65;
            int var67 = var66 ^ var65 << 8;
            int var68 = var55 + var67;
            int var69 = var64 + var65;
            var6 = var69 ^ var64 >>> 16;
            int var70 = var6 + var57;
            int var71 = var64 + var68;
            var5 = var71 ^ var68 << 10;
            int var72 = var68 + var70;
            int var73 = var5 + var59;
            var4 = var72 ^ var70 >>> 4;
            int var74 = var4 + var61;
            int var75 = var70 + var73;
            var3 = var75 ^ var73 << 8;
            var8 = var3 + var63;
            int var76 = var73 + var74;
            var2 = var76 ^ var74 >>> 9;
            var7 = var2 + var67;
            var9 = var8 + var74;
            this.field4347[var52] = var9;
            this.field4347[var52 + 1] = var8;
            this.field4347[var52 + 2] = var7;
            this.field4347[var52 + 3] = var6;
            this.field4347[var52 + 4] = var5;
            this.field4347[var52 + 5] = var4;
            this.field4347[var52 + 6] = var3;
            this.field4347[var52 + 7] = var2;
        }
        this.method1868((byte) -126);
        this.field4345 = 256;
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(I)V", line = 152)
    public static final void method1865(int arg0) {
        field4356++;
        if (!class52.field1046) {
            return;
        }
        class181 var1 = class204.method1392(class119.field2126, arg0 + 2, class354.field5650);
        if (var1 != null && var1.field2986 != null) {
            class47 var2 = new class47();
            var2.field936 = var1.field2986;
            var2.field939 = var1;
            class20.method184(var2, (byte) -88);
        }
        class52.field1046 = false;
        class229.field3756 = arg0;
        class52.method459(128, var1);
    }

    @OriginalMember(owner = "client!fj", name = "b", descriptor = "(B)I", line = 178)
    public final int method1866(byte arg0) {
        if (arg0 != 65) {
            return -46;
        }
        field4353++;
        if ((this.field4345--) == 0) {
            this.method1868((byte) -127);
            this.field4345 = 255;
        }
        return this.field4342[this.field4345];
    }

    @OriginalMember(owner = "client!fj", name = "c", descriptor = "(B)V", line = 202)
    public static void method1867(byte arg0) {
        field4350 = null;
        if (arg0 != -107) {
            field4350 = (String) null;
        }
    }

    @OriginalMember(owner = "client!fj", name = "d", descriptor = "(B)V", line = 224)
    private final void method1868(byte arg0) {
        field4352++;
        if (arg0 >= -124) {
            field4346 = 61L;
        }
        this.field4348 += ++this.field4349;
        for (int var2 = 0; var2 < 256; var2++) {
            int var3 = this.field4347[var2];
            if ((var2 & 0x2) == 0) {
                if ((var2 & 0x1) == 0) {
                    this.field4344 ^= this.field4344 << 13;
                } else {
                    this.field4344 ^= this.field4344 >>> 6;
                }
            } else if ((var2 & 0x1) == 0) {
                this.field4344 ^= this.field4344 << 2;
            } else {
                this.field4344 ^= this.field4344 >>> 16;
            }
            this.field4344 += this.field4347[var2 + 128 & 0xFF];
            int var4;
            this.field4347[var2] = var4 = this.field4344 + (this.field4347[class83.method613(var3, 1020) >> 2] + this.field4348);
            this.field4342[var2] = this.field4348 = this.field4347[class83.method613(var4 >> 8 >> 2, 255)] + var3;
        }
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(Lg;I)Z", line = 268)
    public static final boolean method1869(class181 arg0, int arg1) {
        if (arg1 != 1) {
            field4355 = 10;
        }
        field4343++;
        if (arg0.field3059 == 205) {
            class263.field4323 = 250;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!fj", name = "<init>", descriptor = "()V", line = 290)
    private class266() {
    }

    @OriginalMember(owner = "client!fj", name = "<init>", descriptor = "([I)V", line = 297)
    public class266(int[] arg0) {
        this.field4342 = new int[256];
        this.field4347 = new int[256];
        for (int var2 = 0; var2 < arg0.length; var2++) {
            this.field4342[var2] = arg0[var2];
        }
        this.method1864((byte) 116);
    }
}
