import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rk")
public class class312 {

    @OriginalMember(owner = "client!rk", name = "m", descriptor = "[I")
    private int[] field4711;

    @OriginalMember(owner = "client!rk", name = "h", descriptor = "[I")
    private int[] field4706;

    @OriginalMember(owner = "client!rk", name = "j", descriptor = "[I")
    public static int[] field4708;

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "I")
    private int field4699;

    @OriginalMember(owner = "client!rk", name = "b", descriptor = "I")
    public static int field4700;

    @OriginalMember(owner = "client!rk", name = "c", descriptor = "I")
    public static int field4701;

    @OriginalMember(owner = "client!rk", name = "d", descriptor = "I")
    private int field4702;

    @OriginalMember(owner = "client!rk", name = "e", descriptor = "I")
    private int field4703;

    @OriginalMember(owner = "client!rk", name = "f", descriptor = "I")
    public static int field4704;

    @OriginalMember(owner = "client!rk", name = "g", descriptor = "I")
    public static int field4705;

    @OriginalMember(owner = "client!rk", name = "i", descriptor = "I")
    public static int field4707;

    @OriginalMember(owner = "client!rk", name = "l", descriptor = "I")
    public static int field4710;

    @OriginalMember(owner = "client!rk", name = "o", descriptor = "I")
    private int field4713;

    @OriginalMember(owner = "client!rk", name = "n", descriptor = "Lclient;")
    public static client field4712;

    @OriginalMember(owner = "client!rk", name = "k", descriptor = "[Lwk;")
    public static class300[] field4709;

    static {
        new class332("You are not allowed to join this user's clan channel.", "Du darfst den Chatraum dieses Benutzers nicht betreten.", "Vous n'êtes pas autorisé à rejoindre le canal de clan de cet utilisateur.", "Você não tem permissão para entrar no canal de clã desse usuário.");
        field4708 = new int[5];
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(I)V", line = 8)
    private final void method1930(int arg0) {
        field4707++;
        if (arg0 != -4) {
            this.field4711 = null;
        }
        this.field4713 += ++this.field4702;
        for (int var2 = 0; var2 < 256; var2++) {
            int var3 = this.field4706[var2];
            if ((var2 & 0x2) == 0) {
                if ((var2 & 0x1) == 0) {
                    this.field4699 ^= this.field4699 << 13;
                } else {
                    this.field4699 ^= this.field4699 >>> 6;
                }
            } else if ((var2 & 0x1) == 0) {
                this.field4699 ^= this.field4699 << 2;
            } else {
                this.field4699 ^= this.field4699 >>> 16;
            }
            this.field4699 += this.field4706[var2 + 128 & 0xFF];
            int var4;
            this.field4706[var2] = var4 = this.field4706[class412.method2463(var3, 1020) >> 2] + this.field4713 + this.field4699;
            this.field4711[var2] = this.field4713 = var3 + this.field4706[class412.method2463(255, var4 >> 8 >> 2)];
        }
    }

    @OriginalMember(owner = "client!rk", name = "b", descriptor = "(I)I", line = 54)
    public final int method1931(int arg0) {
        if (this.field4703 == 0) {
            this.method1930(-4);
            this.field4703 = 256;
        }
        if (arg0 <= 109) {
            method1934(-66, 88);
        }
        field4700++;
        return this.field4711[this.field4703 - 1];
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(B)I", line = 82)
    public final int method1932(byte arg0) {
        if (arg0 >= -80) {
            field4708 = null;
        }
        field4704++;
        if (this.field4703 == 0) {
            this.method1930(-4);
            this.field4703 = 256;
        }
        return this.field4711[--this.field4703];
    }

    @OriginalMember(owner = "client!rk", name = "c", descriptor = "(I)V", line = 99)
    private final void method1933(int arg0) {
        field4701++;
        int var2 = -36 % ((arg0 + 8) / 46);
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
            int var69 = var63 + var66;
            int var70 = var5 + var68;
            var7 = var69 ^ var66 >>> 16;
            int var71 = var4 + var7;
            int var72 = var66 + var70;
            var6 = var72 ^ var70 << 10;
            int var73 = var3 + var6;
            int var74 = var70 + var71;
            var5 = var74 ^ var71 >>> 4;
            int var75 = var5 + var62;
            int var76 = var71 + var73;
            var4 = var76 ^ var73 << 8;
            var9 = var4 + var65;
            int var77 = var73 + var75;
            var3 = var77 ^ var75 >>> 9;
            var8 = var3 + var68;
            var10 = var9 + var75;
        }
        for (int var12 = 0; var12 < 256; var12 += 8) {
            int var38 = this.field4711[var12 + 1] + var9;
            int var39 = this.field4711[var12 + 5] + var5;
            int var40 = this.field4711[var12] + var10;
            int var41 = this.field4711[var12 + 7] + var3;
            int var42 = this.field4711[var12 + 2] + var8;
            int var43 = this.field4711[var12 + 4] + var6;
            int var44 = this.field4711[var12 + 6] + var4;
            int var45 = this.field4711[var12 + 3] + var7;
            int var46 = var40 ^ var38 << 11;
            int var47 = var38 + var42;
            int var48 = var45 + var46;
            int var49 = var47 ^ var42 >>> 2;
            int var50 = var42 + var48;
            int var51 = var43 + var49;
            int var52 = var50 ^ var48 << 8;
            int var53 = var48 + var51;
            int var54 = var39 + var52;
            var7 = var53 ^ var51 >>> 16;
            int var55 = var51 + var54;
            int var56 = var7 + var44;
            var6 = var55 ^ var54 << 10;
            int var57 = var6 + var41;
            int var58 = var54 + var56;
            var5 = var58 ^ var56 >>> 4;
            int var59 = var56 + var57;
            int var60 = var5 + var46;
            var4 = var59 ^ var57 << 8;
            var9 = var4 + var49;
            int var61 = var57 + var60;
            var3 = var61 ^ var60 >>> 9;
            var10 = var9 + var60;
            var8 = var3 + var52;
            this.field4706[var12] = var10;
            this.field4706[var12 + 1] = var9;
            this.field4706[var12 + 2] = var8;
            this.field4706[var12 + 3] = var7;
            this.field4706[var12 + 4] = var6;
            this.field4706[var12 + 5] = var5;
            this.field4706[var12 + 6] = var4;
            this.field4706[var12 + 7] = var3;
        }
        for (int var13 = 0; var13 < 256; var13 += 8) {
            int var14 = this.field4706[var13 + 1] + var9;
            int var15 = this.field4706[var13 + 6] + var4;
            int var16 = this.field4706[var13 + 4] + var6;
            int var17 = this.field4706[var13 + 3] + var7;
            int var18 = this.field4706[var13 + 5] + var5;
            int var19 = this.field4706[var13] + var10;
            int var20 = this.field4706[var13 + 7] + var3;
            int var21 = this.field4706[var13 + 2] + var8;
            int var22 = var19 ^ var14 << 11;
            int var23 = var17 + var22;
            int var24 = var14 + var21;
            int var25 = var24 ^ var21 >>> 2;
            int var26 = var21 + var23;
            int var27 = var16 + var25;
            int var28 = var26 ^ var23 << 8;
            int var29 = var23 + var27;
            int var30 = var18 + var28;
            var7 = var29 ^ var27 >>> 16;
            int var31 = var7 + var15;
            int var32 = var27 + var30;
            var6 = var32 ^ var30 << 10;
            int var33 = var30 + var31;
            int var34 = var6 + var20;
            var5 = var33 ^ var31 >>> 4;
            int var35 = var5 + var22;
            int var36 = var31 + var34;
            var4 = var36 ^ var34 << 8;
            var9 = var4 + var25;
            int var37 = var34 + var35;
            var3 = var37 ^ var35 >>> 9;
            var10 = var9 + var35;
            var8 = var3 + var28;
            this.field4706[var13] = var10;
            this.field4706[var13 + 1] = var9;
            this.field4706[var13 + 2] = var8;
            this.field4706[var13 + 3] = var7;
            this.field4706[var13 + 4] = var6;
            this.field4706[var13 + 5] = var5;
            this.field4706[var13 + 6] = var4;
            this.field4706[var13 + 7] = var3;
        }
        this.method1930(-4);
        this.field4703 = 256;
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(II)V", line = 255)
    public static final void method1934(int arg0, int arg1) {
        field4710++;
        class186 var2 = class275.method1789(arg1, (byte) 123, 6);
        var2.method1279((byte) -65);
        if (arg0 > -21) {
            method1934(-23, -114);
        }
    }

    @OriginalMember(owner = "client!rk", name = "b", descriptor = "(B)V", line = 268)
    public static void method1935(byte arg0) {
        field4709 = null;
        int var1 = 84 / ((arg0 - 31) / 54);
        field4708 = null;
        field4712 = null;
    }

    @OriginalMember(owner = "client!rk", name = "<init>", descriptor = "()V", line = 279)
    private class312() {
    }

    @OriginalMember(owner = "client!rk", name = "<init>", descriptor = "([I)V", line = 281)
    public class312(int[] arg0) {
        this.field4711 = new int[256];
        this.field4706 = new int[256];
        for (int var2 = 0; var2 < arg0.length; var2++) {
            this.field4711[var2] = arg0[var2];
        }
        this.method1933(-75);
    }
}
