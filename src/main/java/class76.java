import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kr")
public class class76 {

    @OriginalMember(owner = "client!kr", name = "h", descriptor = "[I")
    private int[] field1029;

    @OriginalMember(owner = "client!kr", name = "b", descriptor = "[I")
    private int[] field1023;

    @OriginalMember(owner = "client!kr", name = "l", descriptor = "I")
    public static int field1033 = 0;

    @OriginalMember(owner = "client!kr", name = "k", descriptor = "[Lqg;")
    public static class205[] field1032 = new class205[30];

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "I")
    public static int field1022;

    @OriginalMember(owner = "client!kr", name = "c", descriptor = "I")
    public static int field1024;

    @OriginalMember(owner = "client!kr", name = "d", descriptor = "I")
    private int field1025;

    @OriginalMember(owner = "client!kr", name = "e", descriptor = "I")
    private int field1026;

    @OriginalMember(owner = "client!kr", name = "f", descriptor = "I")
    public static int field1027;

    @OriginalMember(owner = "client!kr", name = "g", descriptor = "I")
    public static int field1028;

    @OriginalMember(owner = "client!kr", name = "i", descriptor = "I")
    private int field1030;

    @OriginalMember(owner = "client!kr", name = "j", descriptor = "I")
    public static int field1031;

    @OriginalMember(owner = "client!kr", name = "m", descriptor = "I")
    public static int field1034;

    @OriginalMember(owner = "client!kr", name = "n", descriptor = "I")
    private int field1035;

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(I)V", line = 7)
    public static void method500(int arg0) {
        if (arg0 != -257) {
            method501((byte) -124);
        }
        field1032 = null;
    }

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(B)V", line = 19)
    public static final void method501(byte arg0) {
        field1028++;
        class382.field5821.method709(-21357);
        class346.field5419.method804(-1);
        if (class379.field5784 != null) {
            class379.field5784.method440(7, class245.field3430);
        }
        class498.field7279.method750(0);
        if (arg0 <= 90) {
            return;
        }
        class245.field3430.setBackground(Color.black);
        class98.field1417 = -1;
        class382.field5821 = class313.method2030(100, class245.field3430);
        class346.field5419 = class262.method1687(class245.field3430, (byte) -5, true);
        if (class379.field5784 != null) {
            class379.field5784.method437(class245.field3430, false);
        }
    }

    @OriginalMember(owner = "client!kr", name = "b", descriptor = "(I)I", line = 43)
    public final int method502(int arg0) {
        if (arg0 != -9746) {
            this.field1025 = 50;
        }
        field1022++;
        if (this.field1025 == 0) {
            this.method506(arg0 ^ 0xFFFFF061);
            this.field1025 = 256;
        }
        return this.field1029[--this.field1025];
    }

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(IIIILns;Z)V", line = 63)
    public static final void method503(int arg0, int arg1, int arg2, int arg3, class438 arg4, boolean arg5) {
        class123.field1772 = 10000;
        class225.field3230 = arg2;
        class32.field496 = arg5;
        field1031++;
        int var6 = 20 % ((40 - arg3) / 54);
        class466.field6795 = arg4;
        class369.field5667 = arg1;
        class30.field464 = 1;
        class388.field5899 = arg0;
    }

    @OriginalMember(owner = "client!kr", name = "c", descriptor = "(I)I", line = 83)
    public final int method504(int arg0) {
        field1034++;
        if (this.field1025 == 0) {
            this.method506(arg0 + 30895);
            this.field1025 = 256;
        }
        if (arg0 != -20256) {
            field1032 = null;
        }
        return this.field1029[this.field1025 - 1];
    }

    @OriginalMember(owner = "client!kr", name = "d", descriptor = "(I)V", line = 103)
    private final void method505(int arg0) {
        if (arg0 != -6) {
            return;
        }
        field1024++;
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
            int var72 = var68 + var70;
            int var73 = var2 + var5;
            var4 = var72 ^ var70 >>> 4;
            int var74 = var70 + var73;
            int var75 = var4 + var61;
            var3 = var74 ^ var73 << 8;
            int var76 = var73 + var75;
            var8 = var3 + var64;
            var2 = var76 ^ var75 >>> 9;
            var7 = var2 + var67;
            var9 = var8 + var75;
        }
        for (int var11 = 0; var11 < 256; var11 += 8) {
            int var37 = this.field1029[var11 + 7] + var2;
            int var38 = this.field1029[var11 + 1] + var8;
            int var39 = this.field1029[var11 + 6] + var3;
            int var40 = this.field1029[var11 + 4] + var5;
            int var41 = this.field1029[var11 + 2] + var7;
            int var42 = this.field1029[var11] + var9;
            int var43 = this.field1029[var11 + 3] + var6;
            int var44 = this.field1029[var11 + 5] + var4;
            int var45 = var42 ^ var38 << 11;
            int var46 = var38 + var41;
            int var47 = var43 + var45;
            int var48 = var46 ^ var41 >>> 2;
            int var49 = var40 + var48;
            int var50 = var41 + var47;
            int var51 = var50 ^ var47 << 8;
            int var52 = var44 + var51;
            int var53 = var47 + var49;
            var6 = var53 ^ var49 >>> 16;
            int var54 = var6 + var39;
            int var55 = var49 + var52;
            var5 = var55 ^ var52 << 10;
            int var56 = var5 + var37;
            int var57 = var52 + var54;
            var4 = var57 ^ var54 >>> 4;
            int var58 = var54 + var56;
            int var59 = var4 + var45;
            var3 = var58 ^ var56 << 8;
            var8 = var3 + var48;
            int var60 = var56 + var59;
            var2 = var60 ^ var59 >>> 9;
            var7 = var2 + var51;
            var9 = var8 + var59;
            this.field1023[var11] = var9;
            this.field1023[var11 + 1] = var8;
            this.field1023[var11 + 2] = var7;
            this.field1023[var11 + 3] = var6;
            this.field1023[var11 + 4] = var5;
            this.field1023[var11 + 5] = var4;
            this.field1023[var11 + 6] = var3;
            this.field1023[var11 + 7] = var2;
        }
        for (int var12 = 0; var12 < 256; var12 += 8) {
            int var13 = this.field1023[var12 + 6] + var3;
            int var14 = this.field1023[var12] + var9;
            int var15 = this.field1023[var12 + 7] + var2;
            int var16 = this.field1023[var12 + 3] + var6;
            int var17 = this.field1023[var12 + 4] + var5;
            int var18 = this.field1023[var12 + 2] + var7;
            int var19 = this.field1023[var12 + 5] + var4;
            int var20 = this.field1023[var12 + 1] + var8;
            int var21 = var14 ^ var20 << 11;
            int var22 = var16 + var21;
            int var23 = var18 + var20;
            int var24 = var23 ^ var18 >>> 2;
            int var25 = var17 + var24;
            int var26 = var18 + var22;
            int var27 = var26 ^ var22 << 8;
            int var28 = var22 + var25;
            int var29 = var19 + var27;
            var6 = var28 ^ var25 >>> 16;
            int var30 = var6 + var13;
            int var31 = var25 + var29;
            var5 = var31 ^ var29 << 10;
            int var32 = var29 + var30;
            int var33 = var5 + var15;
            var4 = var32 ^ var30 >>> 4;
            int var34 = var30 + var33;
            int var35 = var4 + var21;
            var3 = var34 ^ var33 << 8;
            int var36 = var33 + var35;
            var8 = var3 + var24;
            var2 = var36 ^ var35 >>> 9;
            var9 = var8 + var35;
            var7 = var2 + var27;
            this.field1023[var12] = var9;
            this.field1023[var12 + 1] = var8;
            this.field1023[var12 + 2] = var7;
            this.field1023[var12 + 3] = var6;
            this.field1023[var12 + 4] = var5;
            this.field1023[var12 + 5] = var4;
            this.field1023[var12 + 6] = var3;
            this.field1023[var12 + 7] = var2;
        }
        this.method506(10639);
        this.field1025 = 256;
    }

    @OriginalMember(owner = "client!kr", name = "<init>", descriptor = "()V", line = 257)
    private class76() {
    }

    @OriginalMember(owner = "client!kr", name = "e", descriptor = "(I)V", line = 260)
    private final void method506(int arg0) {
        field1027++;
        if (arg0 != 10639) {
            this.field1023 = null;
        }
        this.field1030 += ++this.field1026;
        for (int var2 = 0; var2 < 256; var2++) {
            int var3 = this.field1023[var2];
            if ((var2 & 0x2) == 0) {
                if ((var2 & 0x1) == 0) {
                    this.field1035 ^= this.field1035 << 13;
                } else {
                    this.field1035 ^= this.field1035 >>> 6;
                }
            } else if ((var2 & 0x1) == 0) {
                this.field1035 ^= this.field1035 << 2;
            } else {
                this.field1035 ^= this.field1035 >>> 16;
            }
            this.field1035 += this.field1023[var2 + 128 & 0xFF];
            int var4;
            this.field1023[var2] = var4 = this.field1035 + (this.field1023[class494.method2942(var3 >> 2, 255)] + this.field1030);
            this.field1029[var2] = this.field1030 = this.field1023[class494.method2942(var4, 261279) >> 8 >> 2] + var3;
        }
    }

    @OriginalMember(owner = "client!kr", name = "<init>", descriptor = "([I)V", line = 304)
    public class76(int[] arg0) {
        this.field1029 = new int[256];
        this.field1023 = new int[256];
        for (int var2 = 0; var2 < arg0.length; var2++) {
            this.field1029[var2] = arg0[var2];
        }
        this.method505(-6);
    }
}
