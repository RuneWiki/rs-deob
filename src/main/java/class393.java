import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pu")
public class class393 {

    @OriginalMember(owner = "client!pu", name = "j", descriptor = "[I")
    private int[] field5815;

    @OriginalMember(owner = "client!pu", name = "i", descriptor = "[I")
    private int[] field5814;

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "I")
    public static int field5806;

    @OriginalMember(owner = "client!pu", name = "b", descriptor = "I")
    public static int field5807;

    @OriginalMember(owner = "client!pu", name = "c", descriptor = "I")
    private int field5808;

    @OriginalMember(owner = "client!pu", name = "d", descriptor = "I")
    public static int field5809;

    @OriginalMember(owner = "client!pu", name = "e", descriptor = "I")
    public static int field5810;

    @OriginalMember(owner = "client!pu", name = "f", descriptor = "I")
    private int field5811;

    @OriginalMember(owner = "client!pu", name = "g", descriptor = "I")
    private int field5812;

    @OriginalMember(owner = "client!pu", name = "h", descriptor = "I")
    public static int field5813;

    @OriginalMember(owner = "client!pu", name = "k", descriptor = "I")
    private int field5816;

    @OriginalMember(owner = "client!pu", name = "l", descriptor = "I")
    public static int field5817;

    static {
        new class180("Join your channel by clicking 'Join Chat' and typing: ", "Klick auf 'Betreten' und gib ein: ", "Pour rejoindre votre canal, cliquez sur « Participer » et entrez : ", "Para entrar no seu canal, clique em \"Acessar bate-papo\" e digite: ");
    }

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "(I)V", line = 5)
    private final void method2456(int arg0) {
        field5809++;
        if (arg0 != 9893) {
            this.method2461((byte) 55);
        }
        this.field5812 += ++this.field5811;
        for (int var2 = 0; var2 < 256; var2++) {
            int var3 = this.field5815[var2];
            if ((var2 & 0x2) == 0) {
                if ((var2 & 0x1) == 0) {
                    this.field5816 ^= this.field5816 << 13;
                } else {
                    this.field5816 ^= this.field5816 >>> 6;
                }
            } else if ((var2 & 0x1) == 0) {
                this.field5816 ^= this.field5816 << 2;
            } else {
                this.field5816 ^= this.field5816 >>> 16;
            }
            this.field5816 += this.field5815[var2 + 128 & 0xFF];
            int var4;
            this.field5815[var2] = var4 = this.field5815[class388.method2441(var3 >> 2, 255)] + this.field5816 + this.field5812;
            this.field5814[var2] = this.field5812 = this.field5815[class388.method2441(var4 >> 8, 1020) >> 2] + var3;
        }
    }

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "(Lj;III[Z)V", line = 50)
    public static final void method2457(class377 arg0, int arg1, int arg2, int arg3, boolean[] arg4) {
        if (class62.field1063 == class529.field7807) {
            return;
        }
        int var5 = class145.field2135[arg1].method273(arg2, arg3);
        for (int var6 = 0; var6 <= arg1; var6++) {
            if (arg4 == null || arg4[var6]) {
                class35 var7 = class145.field2135[var6];
                if (var7 != null) {
                    var7.method275(arg0, arg2, var5 - var7.method273(arg2, arg3), arg3, 0, false);
                }
            }
        }
    }

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "(IZ)Z", line = 76)
    public static final boolean method2458(int arg0, boolean arg1) {
        if (arg1) {
            field5817 = -42;
        }
        field5806++;
        return arg0 >= 4 && arg0 <= 8;
    }

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "(B)I", line = 87)
    public final int method2459(byte arg0) {
        if (arg0 > -19) {
            return 31;
        }
        if (this.field5808 == 0) {
            this.method2456(9893);
            this.field5808 = 256;
        }
        field5807++;
        return this.field5814[--this.field5808];
    }

    @OriginalMember(owner = "client!pu", name = "b", descriptor = "(I)I", line = 105)
    public final int method2460(int arg0) {
        if (arg0 <= 23) {
            return -22;
        }
        if (this.field5808 == 0) {
            this.method2456(9893);
            this.field5808 = 256;
        }
        field5813++;
        return this.field5814[this.field5808 - 1];
    }

    @OriginalMember(owner = "client!pu", name = "b", descriptor = "(B)V", line = 136)
    private final void method2461(byte arg0) {
        field5810++;
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
            int var65 = var7 + var63;
            int var66 = var5 + var64;
            int var67 = var65 ^ var63 << 8;
            int var68 = var4 + var67;
            int var69 = var63 + var66;
            var6 = var69 ^ var66 >>> 16;
            int var70 = var3 + var6;
            int var71 = var66 + var68;
            var5 = var71 ^ var68 << 10;
            int var72 = var68 + var70;
            int var73 = var2 + var5;
            var4 = var72 ^ var70 >>> 4;
            int var74 = var4 + var61;
            int var75 = var70 + var73;
            var3 = var75 ^ var73 << 8;
            int var76 = var73 + var74;
            var8 = var3 + var64;
            var2 = var76 ^ var74 >>> 9;
            var7 = var2 + var67;
            var9 = var8 + var74;
        }
        if (arg0 != -94) {
            return;
        }
        for (int var11 = 0; var11 < 256; var11 += 8) {
            int var37 = this.field5814[var11 + 1] + var8;
            int var38 = this.field5814[var11 + 2] + var7;
            int var39 = this.field5814[var11 + 7] + var2;
            int var40 = this.field5814[var11] + var9;
            int var41 = this.field5814[var11 + 6] + var3;
            int var42 = this.field5814[var11 + 3] + var6;
            int var43 = this.field5814[var11 + 5] + var4;
            int var44 = this.field5814[var11 + 4] + var5;
            int var45 = var40 ^ var37 << 11;
            int var46 = var37 + var38;
            int var47 = var42 + var45;
            int var48 = var46 ^ var38 >>> 2;
            int var49 = var38 + var47;
            int var50 = var44 + var48;
            int var51 = var49 ^ var47 << 8;
            int var52 = var43 + var51;
            int var53 = var47 + var50;
            var6 = var53 ^ var50 >>> 16;
            int var54 = var6 + var41;
            int var55 = var50 + var52;
            var5 = var55 ^ var52 << 10;
            int var56 = var52 + var54;
            int var57 = var5 + var39;
            var4 = var56 ^ var54 >>> 4;
            int var58 = var4 + var45;
            int var59 = var54 + var57;
            var3 = var59 ^ var57 << 8;
            int var60 = var57 + var58;
            var8 = var3 + var48;
            var2 = var60 ^ var58 >>> 9;
            var7 = var2 + var51;
            var9 = var8 + var58;
            this.field5815[var11] = var9;
            this.field5815[var11 + 1] = var8;
            this.field5815[var11 + 2] = var7;
            this.field5815[var11 + 3] = var6;
            this.field5815[var11 + 4] = var5;
            this.field5815[var11 + 5] = var4;
            this.field5815[var11 + 6] = var3;
            this.field5815[var11 + 7] = var2;
        }
        for (int var12 = 0; var12 < 256; var12 += 8) {
            int var13 = this.field5815[var12] + var9;
            int var14 = this.field5815[var12 + 3] + var6;
            int var15 = this.field5815[var12 + 2] + var7;
            int var16 = this.field5815[var12 + 1] + var8;
            int var17 = this.field5815[var12 + 5] + var4;
            int var18 = this.field5815[var12 + 4] + var5;
            int var19 = this.field5815[var12 + 6] + var3;
            int var20 = this.field5815[var12 + 7] + var2;
            int var21 = var13 ^ var16 << 11;
            int var22 = var15 + var16;
            int var23 = var14 + var21;
            int var24 = var22 ^ var15 >>> 2;
            int var25 = var18 + var24;
            int var26 = var15 + var23;
            int var27 = var26 ^ var23 << 8;
            int var28 = var23 + var25;
            int var29 = var17 + var27;
            var6 = var28 ^ var25 >>> 16;
            int var30 = var25 + var29;
            int var31 = var6 + var19;
            var5 = var30 ^ var29 << 10;
            int var32 = var5 + var20;
            int var33 = var29 + var31;
            var4 = var33 ^ var31 >>> 4;
            int var34 = var31 + var32;
            int var35 = var4 + var21;
            var3 = var34 ^ var32 << 8;
            var8 = var3 + var24;
            int var36 = var32 + var35;
            var2 = var36 ^ var35 >>> 9;
            var9 = var8 + var35;
            var7 = var2 + var27;
            this.field5815[var12] = var9;
            this.field5815[var12 + 1] = var8;
            this.field5815[var12 + 2] = var7;
            this.field5815[var12 + 3] = var6;
            this.field5815[var12 + 4] = var5;
            this.field5815[var12 + 5] = var4;
            this.field5815[var12 + 6] = var3;
            this.field5815[var12 + 7] = var2;
        }
        this.method2456(9893);
        this.field5808 = 256;
    }

    @OriginalMember(owner = "client!pu", name = "<init>", descriptor = "()V", line = 284)
    private class393() {
    }

    @OriginalMember(owner = "client!pu", name = "<init>", descriptor = "([I)V", line = 286)
    public class393(int[] arg0) {
        this.field5815 = new int[256];
        this.field5814 = new int[256];
        for (int var2 = 0; var2 < arg0.length; var2++) {
            this.field5814[var2] = arg0[var2];
        }
        this.method2461((byte) -94);
    }
}
