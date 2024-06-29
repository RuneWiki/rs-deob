import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sp")
public class class633 {

    @OriginalMember(owner = "client!sp", name = "j", descriptor = "[I")
    private int[] field9071;

    @OriginalMember(owner = "client!sp", name = "d", descriptor = "[I")
    private int[] field9065;

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "Ljha;")
    public static class692 field9062 = new class692();

    @OriginalMember(owner = "client!sp", name = "o", descriptor = "[I")
    public static int[] field9076 = new int[3];

    @OriginalMember(owner = "client!sp", name = "g", descriptor = "[C")
    public static char[] field9068 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

    @OriginalMember(owner = "client!sp", name = "h", descriptor = "Lqe;")
    public static class465 field9069 = new class465(63, 1);

    @OriginalMember(owner = "client!sp", name = "b", descriptor = "I")
    private int field9063;

    @OriginalMember(owner = "client!sp", name = "c", descriptor = "I")
    public static int field9064;

    @OriginalMember(owner = "client!sp", name = "f", descriptor = "I")
    private int field9067;

    @OriginalMember(owner = "client!sp", name = "i", descriptor = "I")
    public static int field9070;

    @OriginalMember(owner = "client!sp", name = "k", descriptor = "I")
    public static int field9072;

    @OriginalMember(owner = "client!sp", name = "l", descriptor = "I")
    public static int field9073;

    @OriginalMember(owner = "client!sp", name = "m", descriptor = "I")
    private int field9074;

    @OriginalMember(owner = "client!sp", name = "n", descriptor = "I")
    private int field9075;

    @OriginalMember(owner = "client!sp", name = "p", descriptor = "I")
    public static int field9077;

    @OriginalMember(owner = "client!sp", name = "e", descriptor = "[Laf;")
    public static class433[] field9066;

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(Z)V", line = 8)
    public static final void method3638(boolean arg0) {
        class148.method1147(1);
        if (!arg0) {
            return;
        }
        field9070++;
        int var1 = class471.field6781.field6708.method3692(27669);
        if (var1 == 2) {
            class566.method3300((byte) -71, class363.field5105, 100, 100, class206.field2956, class359.field5046);
        } else if (var1 == 3) {
            class392.method2443(class626.field8992, class206.field2956, 2, -111, class363.field5105, class359.field5046, class254.field3689, 2);
        }
        if (class471.field6781.field6708.method3689(-10034)) {
            class373.method2347(class567.field8085, 0);
        }
        if (class359.field5046 != null) {
            class416.method2537(5079);
        }
        class339.field4781 = class471.field6781.field6708.method3692(27669) != 0;
        class200.field2876 = class471.field6781.field6708.method3689(-10034);
    }

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(I)I", line = 55)
    public final int method3639(int arg0) {
        if (this.field9075 == 0) {
            this.method3640(false);
            this.field9075 = 256;
        }
        field9073++;
        return arg0 == 8 ? this.field9071[this.field9075 - 1] : -100;
    }

    @OriginalMember(owner = "client!sp", name = "b", descriptor = "(Z)V", line = 72)
    private final void method3640(boolean arg0) {
        field9064++;
        this.field9074 += ++this.field9067;
        for (int var2 = 0; var2 < 256; var2++) {
            int var3 = this.field9065[var2];
            if ((var2 & 0x2) == 0) {
                if ((var2 & 0x1) == 0) {
                    this.field9063 ^= this.field9063 << 13;
                } else {
                    this.field9063 ^= this.field9063 >>> 6;
                }
            } else if ((var2 & 0x1) == 0) {
                this.field9063 ^= this.field9063 << 2;
            } else {
                this.field9063 ^= this.field9063 >>> 16;
            }
            this.field9063 += this.field9065[var2 + 128 & 0xFF];
            int var4;
            this.field9065[var2] = var4 = this.field9074 + this.field9065[class555.method3246(255, var3 >> 2)] + this.field9063;
            this.field9071[var2] = this.field9074 = var3 + this.field9065[class555.method3246(1020, var4 >> 8) >> 2];
        }
        if (arg0) {
            this.field9071 = null;
        }
    }

    @OriginalMember(owner = "client!sp", name = "b", descriptor = "(I)V", line = 120)
    public static void method3641(int arg0) {
        field9066 = null;
        field9069 = null;
        field9076 = null;
        field9068 = null;
        field9062 = null;
        if (arg0 != -3916) {
            field9069 = null;
        }
    }

    @OriginalMember(owner = "client!sp", name = "<init>", descriptor = "()V", line = 139)
    private class633() {
    }

    @OriginalMember(owner = "client!sp", name = "c", descriptor = "(I)V", line = 146)
    private final void method3642(int arg0) {
        field9077++;
        int var2 = 45 % ((75 - arg0) / 50);
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
            int var75 = var71 + var73;
            int var76 = var5 + var62;
            var4 = var75 ^ var73 << 8;
            var9 = var4 + var65;
            int var77 = var73 + var76;
            var3 = var77 ^ var76 >>> 9;
            var10 = var9 + var76;
            var8 = var3 + var68;
        }
        for (int var12 = 0; var12 < 256; var12 += 8) {
            int var38 = this.field9071[var12 + 5] + var5;
            int var39 = this.field9071[var12 + 4] + var6;
            int var40 = this.field9071[var12 + 3] + var7;
            int var41 = this.field9071[var12 + 1] + var9;
            int var42 = this.field9071[var12 + 6] + var4;
            int var43 = this.field9071[var12 + 2] + var8;
            int var44 = this.field9071[var12 + 7] + var3;
            int var45 = this.field9071[var12] + var10;
            int var46 = var45 ^ var41 << 11;
            int var47 = var41 + var43;
            int var48 = var40 + var46;
            int var49 = var47 ^ var43 >>> 2;
            int var50 = var39 + var49;
            int var51 = var43 + var48;
            int var52 = var51 ^ var48 << 8;
            int var53 = var38 + var52;
            int var54 = var48 + var50;
            var7 = var54 ^ var50 >>> 16;
            int var55 = var50 + var53;
            int var56 = var7 + var42;
            var6 = var55 ^ var53 << 10;
            int var57 = var6 + var44;
            int var58 = var53 + var56;
            var5 = var58 ^ var56 >>> 4;
            int var59 = var56 + var57;
            int var60 = var5 + var46;
            var4 = var59 ^ var57 << 8;
            int var61 = var57 + var60;
            var9 = var4 + var49;
            var3 = var61 ^ var60 >>> 9;
            var10 = var9 + var60;
            var8 = var3 + var52;
            this.field9065[var12] = var10;
            this.field9065[var12 + 1] = var9;
            this.field9065[var12 + 2] = var8;
            this.field9065[var12 + 3] = var7;
            this.field9065[var12 + 4] = var6;
            this.field9065[var12 + 5] = var5;
            this.field9065[var12 + 6] = var4;
            this.field9065[var12 + 7] = var3;
        }
        for (int var13 = 0; var13 < 256; var13 += 8) {
            int var14 = this.field9065[var13 + 6] + var4;
            int var15 = this.field9065[var13] + var10;
            int var16 = this.field9065[var13 + 7] + var3;
            int var17 = this.field9065[var13 + 3] + var7;
            int var18 = this.field9065[var13 + 5] + var5;
            int var19 = this.field9065[var13 + 1] + var9;
            int var20 = this.field9065[var13 + 2] + var8;
            int var21 = this.field9065[var13 + 4] + var6;
            int var22 = var15 ^ var19 << 11;
            int var23 = var19 + var20;
            int var24 = var17 + var22;
            int var25 = var23 ^ var20 >>> 2;
            int var26 = var21 + var25;
            int var27 = var20 + var24;
            int var28 = var27 ^ var24 << 8;
            int var29 = var18 + var28;
            int var30 = var24 + var26;
            var7 = var30 ^ var26 >>> 16;
            int var31 = var26 + var29;
            int var32 = var7 + var14;
            var6 = var31 ^ var29 << 10;
            int var33 = var29 + var32;
            int var34 = var6 + var16;
            var5 = var33 ^ var32 >>> 4;
            int var35 = var32 + var34;
            int var36 = var5 + var22;
            var4 = var35 ^ var34 << 8;
            int var37 = var34 + var36;
            var9 = var4 + var25;
            var3 = var37 ^ var36 >>> 9;
            var8 = var3 + var28;
            var10 = var9 + var36;
            this.field9065[var13] = var10;
            this.field9065[var13 + 1] = var9;
            this.field9065[var13 + 2] = var8;
            this.field9065[var13 + 3] = var7;
            this.field9065[var13 + 4] = var6;
            this.field9065[var13 + 5] = var5;
            this.field9065[var13 + 6] = var4;
            this.field9065[var13 + 7] = var3;
        }
        this.method3640(false);
        this.field9075 = 256;
    }

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(B)I", line = 292)
    public final int method3643(byte arg0) {
        field9072++;
        if (this.field9075 == 0) {
            this.method3640(false);
            this.field9075 = 256;
        }
        return arg0 == -20 ? this.field9071[--this.field9075] : -59;
    }

    @OriginalMember(owner = "client!sp", name = "<init>", descriptor = "([I)V", line = 315)
    public class633(int[] arg0) {
        this.field9071 = new int[256];
        this.field9065 = new int[256];
        for (int var2 = 0; var2 < arg0.length; var2++) {
            this.field9071[var2] = arg0[var2];
        }
        this.method3642(-93);
    }
}
