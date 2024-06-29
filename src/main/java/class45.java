import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fk")
public class class45 {

    @OriginalMember(owner = "client!fk", name = "g", descriptor = "[I")
    private int[] field946;

    @OriginalMember(owner = "client!fk", name = "d", descriptor = "[I")
    private int[] field943;

    @OriginalMember(owner = "client!fk", name = "e", descriptor = "I")
    public static int field944 = 0;

    @OriginalMember(owner = "client!fk", name = "f", descriptor = "[I")
    public static int[] field945 = new int[2048];

    @OriginalMember(owner = "client!fk", name = "b", descriptor = "Lpa;")
    public static class2 field941 = null;

    @OriginalMember(owner = "client!fk", name = "n", descriptor = "[I")
    public static int[] field953 = new int[14];

    @OriginalMember(owner = "client!fk", name = "o", descriptor = "I")
    public static int field954 = 0;

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "I")
    public static int field940;

    @OriginalMember(owner = "client!fk", name = "c", descriptor = "I")
    private int field942;

    @OriginalMember(owner = "client!fk", name = "i", descriptor = "I")
    public static int field948;

    @OriginalMember(owner = "client!fk", name = "j", descriptor = "I")
    public static int field949;

    @OriginalMember(owner = "client!fk", name = "k", descriptor = "I")
    private int field950;

    @OriginalMember(owner = "client!fk", name = "l", descriptor = "I")
    public static int field951;

    @OriginalMember(owner = "client!fk", name = "m", descriptor = "I")
    private int field952;

    @OriginalMember(owner = "client!fk", name = "p", descriptor = "I")
    private int field955;

    @OriginalMember(owner = "client!fk", name = "q", descriptor = "I")
    public static int field956;

    @OriginalMember(owner = "client!fk", name = "h", descriptor = "Lgf;")
    public static class8 field947;

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(III)V", line = 12)
    public static final void method385(int arg0, int arg1, int arg2) {
        field940++;
        if (arg2 == -14455) {
            class104 var3 = class293.method2085(5, arg1, false);
            var3.method879(0);
            var3.field1966 = arg0;
        }
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(Z)I", line = 28)
    public final int method386(boolean arg0) {
        field956++;
        if (arg0) {
            this.field943 = (int[]) null;
        }
        if ((this.field955--) == 0) {
            this.method389(true);
            this.field955 = 255;
        }
        return this.field943[this.field955];
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(I)V", line = 55)
    public static void method387(int arg0) {
        field941 = null;
        field945 = null;
        if (arg0 != 25228) {
            method387(68);
        }
        field953 = null;
        field947 = null;
    }

    @OriginalMember(owner = "client!fk", name = "b", descriptor = "(I)V", line = 91)
    private final void method388(int arg0) {
        field949++;
        int var2 = -1640531527;
        int var3 = -1640531527;
        int var4 = -1640531527;
        int var5 = -1640531527;
        int var6 = -1640531527;
        int var7 = -1640531527;
        int var8 = -1640531527;
        int var9 = -1640531527;
        if (arg0 != 20394) {
            this.field943 = (int[]) null;
        }
        for (int var10 = 0; var10 < 4; var10++) {
            int var11 = var9 ^ var8 << 11;
            int var12 = var6 + var11;
            int var13 = var7 + var8;
            int var14 = var13 ^ var7 >>> 2;
            int var15 = var7 + var12;
            int var16 = var15 ^ var12 << 8;
            int var17 = var4 + var16;
            int var18 = var5 + var14;
            int var19 = var12 + var18;
            var6 = var19 ^ var18 >>> 16;
            int var20 = var17 + var18;
            int var21 = var3 + var6;
            var5 = var20 ^ var17 << 10;
            int var22 = var17 + var21;
            int var23 = var2 + var5;
            var4 = var22 ^ var21 >>> 4;
            int var24 = var4 + var11;
            int var25 = var21 + var23;
            var3 = var25 ^ var23 << 8;
            var8 = var3 + var14;
            int var26 = var23 + var24;
            var2 = var26 ^ var24 >>> 9;
            var7 = var2 + var16;
            var9 = var8 + var24;
        }
        for (int var27 = 0; var27 < 256; var27 += 8) {
            int var28 = this.field943[var27 + 7] + var2;
            int var29 = this.field943[var27] + var9;
            int var30 = this.field943[var27 + 6] + var3;
            int var31 = this.field943[var27 + 1] + var8;
            int var32 = this.field943[var27 + 4] + var5;
            int var33 = var29 ^ var31 << 11;
            int var34 = this.field943[var27 + 3] + var6;
            int var35 = this.field943[var27 + 5] + var4;
            int var36 = this.field943[var27 + 2] + var7;
            int var37 = var33 + var34;
            int var38 = var31 + var36;
            int var39 = var38 ^ var36 >>> 2;
            int var40 = var32 + var39;
            int var41 = var36 + var37;
            int var42 = var41 ^ var37 << 8;
            int var43 = var37 + var40;
            int var44 = var35 + var42;
            var6 = var43 ^ var40 >>> 16;
            int var45 = var6 + var30;
            int var46 = var40 + var44;
            var5 = var46 ^ var44 << 10;
            int var47 = var44 + var45;
            var4 = var47 ^ var45 >>> 4;
            int var48 = var4 + var33;
            int var49 = var5 + var28;
            int var50 = var45 + var49;
            var3 = var50 ^ var49 << 8;
            int var51 = var48 + var49;
            var2 = var51 ^ var48 >>> 9;
            var8 = var3 + var39;
            var7 = var2 + var42;
            var9 = var8 + var48;
            this.field946[var27] = var9;
            this.field946[var27 + 1] = var8;
            this.field946[var27 + 2] = var7;
            this.field946[var27 + 3] = var6;
            this.field946[var27 + 4] = var5;
            this.field946[var27 + 5] = var4;
            this.field946[var27 + 6] = var3;
            this.field946[var27 + 7] = var2;
        }
        for (int var52 = 0; var52 < 256; var52 += 8) {
            int var53 = this.field946[var52 + 2] + var7;
            int var54 = this.field946[var52 + 7] + var2;
            int var55 = this.field946[var52 + 1] + var8;
            int var56 = this.field946[var52 + 4] + var5;
            int var57 = this.field946[var52 + 3] + var6;
            int var58 = this.field946[var52] + var9;
            int var59 = this.field946[var52 + 5] + var4;
            int var60 = var58 ^ var55 << 11;
            int var61 = var53 + var55;
            int var62 = var57 + var60;
            int var63 = this.field946[var52 + 6] + var3;
            int var64 = var61 ^ var53 >>> 2;
            int var65 = var56 + var64;
            int var66 = var53 + var62;
            int var67 = var66 ^ var62 << 8;
            int var68 = var59 + var67;
            int var69 = var62 + var65;
            var6 = var69 ^ var65 >>> 16;
            int var70 = var6 + var63;
            int var71 = var65 + var68;
            var5 = var71 ^ var68 << 10;
            int var72 = var5 + var54;
            int var73 = var68 + var70;
            var4 = var73 ^ var70 >>> 4;
            int var74 = var4 + var60;
            int var75 = var70 + var72;
            var3 = var75 ^ var72 << 8;
            var8 = var3 + var64;
            int var76 = var72 + var74;
            var2 = var76 ^ var74 >>> 9;
            var9 = var8 + var74;
            this.field946[var52] = var9;
            var7 = var2 + var67;
            this.field946[var52 + 1] = var8;
            this.field946[var52 + 2] = var7;
            this.field946[var52 + 3] = var6;
            this.field946[var52 + 4] = var5;
            this.field946[var52 + 5] = var4;
            this.field946[var52 + 6] = var3;
            this.field946[var52 + 7] = var2;
        }
        this.method389(true);
        this.field955 = 256;
    }

    @OriginalMember(owner = "client!fk", name = "<init>", descriptor = "()V", line = 244)
    private class45() {
    }

    @OriginalMember(owner = "client!fk", name = "<init>", descriptor = "([I)V", line = 246)
    public class45(int[] arg0) {
        this.field946 = new int[256];
        this.field943 = new int[256];
        for (int var2 = 0; var2 < arg0.length; var2++) {
            this.field943[var2] = arg0[var2];
        }
        this.method388(20394);
    }

    @OriginalMember(owner = "client!fk", name = "b", descriptor = "(Z)V", line = 267)
    private final void method389(boolean arg0) {
        field948++;
        this.field952 += ++this.field942;
        if (!arg0) {
            return;
        }
        for (int var2 = 0; var2 < 256; var2++) {
            int var3 = this.field946[var2];
            if ((var2 & 0x2) == 0) {
                if ((var2 & 0x1) == 0) {
                    this.field950 ^= this.field950 << 13;
                } else {
                    this.field950 ^= this.field950 >>> 6;
                }
            } else if ((var2 & 0x1) == 0) {
                this.field950 ^= this.field950 << 2;
            } else {
                this.field950 ^= this.field950 >>> 16;
            }
            this.field950 += this.field946[var2 + 128 & 0xFF];
            int var4;
            this.field946[var2] = var4 = this.field952 + this.field950 + this.field946[class52.method442(255, var3 >> 2)];
            this.field943[var2] = this.field952 = this.field946[class52.method442(var4, 261359) >> 8 >> 2] + var3;
        }
    }
}
