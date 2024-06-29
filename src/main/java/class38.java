import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fi")
public class class38 {

    @OriginalMember(owner = "client!fi", name = "f", descriptor = "[I")
    private int[] field510;

    @OriginalMember(owner = "client!fi", name = "h", descriptor = "[I")
    private int[] field512;

    @OriginalMember(owner = "client!fi", name = "m", descriptor = "Luv;")
    public static class2 field517 = new class2(71, 0);

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "I")
    private int field505;

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "I")
    public static int field506;

    @OriginalMember(owner = "client!fi", name = "c", descriptor = "I")
    public static int field507;

    @OriginalMember(owner = "client!fi", name = "d", descriptor = "I")
    public static int field508;

    @OriginalMember(owner = "client!fi", name = "e", descriptor = "I")
    public static int field509;

    @OriginalMember(owner = "client!fi", name = "g", descriptor = "I")
    public static int field511;

    @OriginalMember(owner = "client!fi", name = "i", descriptor = "I")
    private int field513;

    @OriginalMember(owner = "client!fi", name = "j", descriptor = "I")
    private int field514;

    @OriginalMember(owner = "client!fi", name = "k", descriptor = "I")
    public static int field515;

    @OriginalMember(owner = "client!fi", name = "l", descriptor = "I")
    private int field516;

    @OriginalMember(owner = "client!fi", name = "n", descriptor = "I")
    public static int field518;

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(B)I")
    public final int method312(byte arg0) {
        if (arg0 <= 41) {
            return 8;
        }
        field509++;
        if (this.field513 == 0) {
            this.method315((byte) -35);
            this.field513 = 256;
        }
        return this.field512[--this.field513];
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(ILjava/awt/Canvas;)Lgw;")
    public static final class108 method313(int arg0, Canvas arg1) {
        field518++;
        try {
            if (arg0 != 0) {
                field517 = null;
            }
            Class var2 = Class.forName("uj");
            class108 var3 = (class108) var2.getDeclaredConstructor().newInstance();
            var3.method814(89, arg1);
            return var3;
        } catch (Throwable var5) {
            class142 var4 = new class142();
            var4.method814(122, arg1);
            return var4;
        }
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(Z)V")
    public static final void method314(boolean arg0) {
        if (arg0) {
            return;
        }
        field515++;
        for (class203 var1 = (class203) class184.field2723.method2957(-79); var1 != null; var1 = (class203) class184.field2723.method2947(-117)) {
            if (var1.field2964) {
                var1.method1333(-13076);
            }
        }
        for (class203 var2 = (class203) class150.field2286.method2957(-52); var2 != null; var2 = (class203) class150.field2286.method2947(-103)) {
            if (var2.field2964) {
                var2.method1333(-13076);
            }
        }
    }

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "(B)V")
    private final void method315(byte arg0) {
        field508++;
        int var2 = -49 / ((arg0 - 50) / 49);
        this.field514 += ++this.field516;
        for (int var3 = 0; var3 < 256; var3++) {
            int var4 = this.field510[var3];
            if ((var3 & 0x2) == 0) {
                if ((var3 & 0x1) == 0) {
                    this.field505 ^= this.field505 << 13;
                } else {
                    this.field505 ^= this.field505 >>> 6;
                }
            } else if ((var3 & 0x1) == 0) {
                this.field505 ^= this.field505 << 2;
            } else {
                this.field505 ^= this.field505 >>> 16;
            }
            this.field505 += this.field510[var3 + 128 & 0xFF];
            int var5;
            this.field510[var3] = var5 = this.field505 + this.field510[class140.method1023(var4, 1020) >> 2] + this.field514;
            this.field512[var3] = this.field514 = var4 + this.field510[class140.method1023(var5 >> 8 >> 2, 255)];
        }
    }

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "(Z)V")
    private final void method316(boolean arg0) {
        field507++;
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
            int var68 = var63 + var65;
            int var69 = var4 + var67;
            var6 = var68 ^ var65 >>> 16;
            int var70 = var65 + var69;
            int var71 = var3 + var6;
            var5 = var70 ^ var69 << 10;
            int var72 = var2 + var5;
            int var73 = var69 + var71;
            var4 = var73 ^ var71 >>> 4;
            int var74 = var4 + var61;
            int var75 = var71 + var72;
            var3 = var75 ^ var72 << 8;
            int var76 = var72 + var74;
            var8 = var3 + var64;
            var2 = var76 ^ var74 >>> 9;
            var7 = var2 + var67;
            var9 = var8 + var74;
        }
        if (!arg0) {
            this.field513 = 29;
        }
        for (int var11 = 0; var11 < 256; var11 += 8) {
            int var37 = this.field512[var11 + 7] + var2;
            int var38 = this.field512[var11 + 1] + var8;
            int var39 = this.field512[var11] + var9;
            int var40 = this.field512[var11 + 4] + var5;
            int var41 = this.field512[var11 + 2] + var7;
            int var42 = this.field512[var11 + 6] + var3;
            int var43 = this.field512[var11 + 3] + var6;
            int var44 = this.field512[var11 + 5] + var4;
            int var45 = var39 ^ var38 << 11;
            int var46 = var38 + var41;
            int var47 = var43 + var45;
            int var48 = var46 ^ var41 >>> 2;
            int var49 = var41 + var47;
            int var50 = var40 + var48;
            int var51 = var49 ^ var47 << 8;
            int var52 = var44 + var51;
            int var53 = var47 + var50;
            var6 = var53 ^ var50 >>> 16;
            int var54 = var50 + var52;
            int var55 = var6 + var42;
            var5 = var54 ^ var52 << 10;
            int var56 = var52 + var55;
            int var57 = var5 + var37;
            var4 = var56 ^ var55 >>> 4;
            int var58 = var4 + var45;
            int var59 = var55 + var57;
            var3 = var59 ^ var57 << 8;
            var8 = var3 + var48;
            int var60 = var57 + var58;
            var2 = var60 ^ var58 >>> 9;
            var9 = var8 + var58;
            var7 = var2 + var51;
            this.field510[var11] = var9;
            this.field510[var11 + 1] = var8;
            this.field510[var11 + 2] = var7;
            this.field510[var11 + 3] = var6;
            this.field510[var11 + 4] = var5;
            this.field510[var11 + 5] = var4;
            this.field510[var11 + 6] = var3;
            this.field510[var11 + 7] = var2;
        }
        for (int var12 = 0; var12 < 256; var12 += 8) {
            int var13 = this.field510[var12 + 5] + var4;
            int var14 = this.field510[var12 + 2] + var7;
            int var15 = this.field510[var12 + 3] + var6;
            int var16 = this.field510[var12 + 7] + var2;
            int var17 = this.field510[var12 + 6] + var3;
            int var18 = this.field510[var12 + 4] + var5;
            int var19 = this.field510[var12 + 1] + var8;
            int var20 = this.field510[var12] + var9;
            int var21 = var20 ^ var19 << 11;
            int var22 = var14 + var19;
            int var23 = var15 + var21;
            int var24 = var22 ^ var14 >>> 2;
            int var25 = var18 + var24;
            int var26 = var14 + var23;
            int var27 = var26 ^ var23 << 8;
            int var28 = var13 + var27;
            int var29 = var23 + var25;
            var6 = var29 ^ var25 >>> 16;
            int var30 = var25 + var28;
            int var31 = var6 + var17;
            var5 = var30 ^ var28 << 10;
            int var32 = var5 + var16;
            int var33 = var28 + var31;
            var4 = var33 ^ var31 >>> 4;
            int var34 = var31 + var32;
            int var35 = var4 + var21;
            var3 = var34 ^ var32 << 8;
            var8 = var3 + var24;
            int var36 = var32 + var35;
            var2 = var36 ^ var35 >>> 9;
            var7 = var2 + var27;
            var9 = var8 + var35;
            this.field510[var12] = var9;
            this.field510[var12 + 1] = var8;
            this.field510[var12 + 2] = var7;
            this.field510[var12 + 3] = var6;
            this.field510[var12 + 4] = var5;
            this.field510[var12 + 5] = var4;
            this.field510[var12 + 6] = var3;
            this.field510[var12 + 7] = var2;
        }
        this.method315((byte) 99);
        this.field513 = 256;
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(I)V")
    public static void method317(int arg0) {
        if (arg0 == 0) {
            field517 = null;
        }
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(III)Z")
    public static final boolean method318(int arg0, int arg1, int arg2) {
        field506++;
        if (arg0 >= -36) {
            return false;
        } else {
            return class511.method3014(3652, arg1, arg2) | (arg2 & 0x70000) != 0 || class328.method2040(arg2, arg1, 13430);
        }
    }

    @OriginalMember(owner = "client!fi", name = "<init>", descriptor = "()V")
    private class38() {
    }

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "(I)I")
    public final int method319(int arg0) {
        int var2 = 13 % ((-arg0 - 85) / 40);
        field511++;
        if (this.field513 == 0) {
            this.method315((byte) 99);
            this.field513 = 256;
        }
        return this.field512[this.field513 - 1];
    }

    @OriginalMember(owner = "client!fi", name = "<init>", descriptor = "([I)V")
    public class38(int[] arg0) {
        this.field510 = new int[256];
        this.field512 = new int[256];
        for (int var2 = 0; var2 < arg0.length; var2++) {
            this.field512[var2] = arg0[var2];
        }
        this.method316(true);
    }
}
