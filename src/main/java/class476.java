import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!td")
public class class476 {

    @OriginalMember(owner = "client!td", name = "n", descriptor = "[I")
    private int[] field6774;

    @OriginalMember(owner = "client!td", name = "c", descriptor = "[I")
    private int[] field6763;

    @OriginalMember(owner = "client!td", name = "e", descriptor = "D")
    public static double field6765;

    @OriginalMember(owner = "client!td", name = "a", descriptor = "I")
    public static int field6761;

    @OriginalMember(owner = "client!td", name = "b", descriptor = "I")
    public static int field6762;

    @OriginalMember(owner = "client!td", name = "d", descriptor = "I")
    private int field6764;

    @OriginalMember(owner = "client!td", name = "f", descriptor = "I")
    public static int field6766;

    @OriginalMember(owner = "client!td", name = "g", descriptor = "I")
    public static int field6767;

    @OriginalMember(owner = "client!td", name = "h", descriptor = "I")
    private int field6768;

    @OriginalMember(owner = "client!td", name = "i", descriptor = "I")
    private int field6769;

    @OriginalMember(owner = "client!td", name = "j", descriptor = "I")
    public static int field6770;

    @OriginalMember(owner = "client!td", name = "k", descriptor = "I")
    public static int field6771;

    @OriginalMember(owner = "client!td", name = "l", descriptor = "I")
    private int field6772;

    @OriginalMember(owner = "client!td", name = "m", descriptor = "I")
    public static int field6773;

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(I)V", line = 12)
    private final void method2806(int arg0) {
        field6773++;
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
            int var68 = var4 + var67;
            int var69 = var63 + var65;
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
            int var37 = this.field6763[var11 + 1] + var8;
            int var38 = this.field6763[var11] + var9;
            int var39 = this.field6763[var11 + 2] + var7;
            int var40 = this.field6763[var11 + 7] + var2;
            int var41 = this.field6763[var11 + 5] + var4;
            int var42 = this.field6763[var11 + 6] + var3;
            int var43 = this.field6763[var11 + 4] + var5;
            int var44 = this.field6763[var11 + 3] + var6;
            int var45 = var38 ^ var37 << 11;
            int var46 = var44 + var45;
            int var47 = var37 + var39;
            int var48 = var47 ^ var39 >>> 2;
            int var49 = var39 + var46;
            int var50 = var43 + var48;
            int var51 = var49 ^ var46 << 8;
            int var52 = var41 + var51;
            int var53 = var46 + var50;
            var6 = var53 ^ var50 >>> 16;
            int var54 = var6 + var42;
            int var55 = var50 + var52;
            var5 = var55 ^ var52 << 10;
            int var56 = var52 + var54;
            int var57 = var5 + var40;
            var4 = var56 ^ var54 >>> 4;
            int var58 = var54 + var57;
            int var59 = var4 + var45;
            var3 = var58 ^ var57 << 8;
            int var60 = var57 + var59;
            var8 = var3 + var48;
            var2 = var60 ^ var59 >>> 9;
            var9 = var8 + var59;
            var7 = var2 + var51;
            this.field6774[var11] = var9;
            this.field6774[var11 + 1] = var8;
            this.field6774[var11 + 2] = var7;
            this.field6774[var11 + 3] = var6;
            this.field6774[var11 + 4] = var5;
            this.field6774[var11 + 5] = var4;
            this.field6774[var11 + 6] = var3;
            this.field6774[var11 + 7] = var2;
        }
        for (int var12 = 0; var12 < 256; var12 += 8) {
            int var13 = this.field6774[var12 + 7] + var2;
            int var14 = this.field6774[var12 + 3] + var6;
            int var15 = this.field6774[var12 + 4] + var5;
            int var16 = this.field6774[var12 + 1] + var8;
            int var17 = this.field6774[var12 + 5] + var4;
            int var18 = this.field6774[var12 + 2] + var7;
            int var19 = this.field6774[var12] + var9;
            int var20 = this.field6774[var12 + 6] + var3;
            int var21 = var19 ^ var16 << 11;
            int var22 = var16 + var18;
            int var23 = var14 + var21;
            int var24 = var22 ^ var18 >>> 2;
            int var25 = var18 + var23;
            int var26 = var15 + var24;
            int var27 = var25 ^ var23 << 8;
            int var28 = var17 + var27;
            int var29 = var23 + var26;
            var6 = var29 ^ var26 >>> 16;
            int var30 = var26 + var28;
            int var31 = var6 + var20;
            var5 = var30 ^ var28 << 10;
            int var32 = var5 + var13;
            int var33 = var28 + var31;
            var4 = var33 ^ var31 >>> 4;
            int var34 = var31 + var32;
            int var35 = var4 + var21;
            var3 = var34 ^ var32 << 8;
            var8 = var3 + var24;
            int var36 = var32 + var35;
            var2 = var36 ^ var35 >>> 9;
            var9 = var8 + var35;
            var7 = var2 + var27;
            this.field6774[var12] = var9;
            this.field6774[var12 + 1] = var8;
            this.field6774[var12 + 2] = var7;
            this.field6774[var12 + 3] = var6;
            this.field6774[var12 + 4] = var5;
            this.field6774[var12 + 5] = var4;
            this.field6774[var12 + 6] = var3;
            this.field6774[var12 + 7] = var2;
        }
        if (arg0 != -114964277) {
            this.field6763 = null;
        }
        this.method2809((byte) -18);
        this.field6764 = 256;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(B)I", line = 164)
    public final int method2807(byte arg0) {
        if (this.field6764 == 0) {
            this.method2809((byte) -62);
            this.field6764 = 256;
        }
        if (arg0 != -12) {
            this.method2807((byte) 95);
        }
        field6767++;
        return this.field6763[this.field6764 - 1];
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(Lrv;I)Lsc;", line = 182)
    public static final class365 method2808(class120 arg0, int arg1) {
        field6771++;
        class269 var2 = class302.method2002(-14432, arg0);
        int var3 = arg0.method871(arg1 ^ 0x53D5864B);
        int var4 = arg0.method871(23995);
        if (arg1 != 1406524400) {
            field6766 = -108;
        }
        return new class365(var2.field3774, var2.field3784, var2.field3777, var2.field3783, var2.field3769, var2.field3773, var2.field3781, var2.field3775, var2.field3776, var3, var4);
    }

    @OriginalMember(owner = "client!td", name = "<init>", descriptor = "()V", line = 205)
    private class476() {
    }

    @OriginalMember(owner = "client!td", name = "b", descriptor = "(B)V", line = 208)
    private final void method2809(byte arg0) {
        field6762++;
        this.field6768 += ++this.field6769;
        int var2 = -97 / ((80 - arg0) / 41);
        for (int var3 = 0; var3 < 256; var3++) {
            int var4 = this.field6774[var3];
            if ((var3 & 0x2) == 0) {
                if ((var3 & 0x1) == 0) {
                    this.field6772 ^= this.field6772 << 13;
                } else {
                    this.field6772 ^= this.field6772 >>> 6;
                }
            } else if ((var3 & 0x1) == 0) {
                this.field6772 ^= this.field6772 << 2;
            } else {
                this.field6772 ^= this.field6772 >>> 16;
            }
            this.field6772 += this.field6774[var3 + 128 & 0xFF];
            int var5;
            this.field6774[var3] = var5 = this.field6768 + this.field6772 + this.field6774[class111.method773(255, var4 >> 2)];
            this.field6763[var3] = this.field6768 = this.field6774[class111.method773(1020, var5 >> 8) >> 2] + var4;
        }
    }

    @OriginalMember(owner = "client!td", name = "b", descriptor = "(I)I", line = 249)
    public final int method2810(int arg0) {
        int var2 = -28 / ((arg0 + 40) / 62);
        field6761++;
        if (this.field6764 == 0) {
            this.method2809((byte) 121);
            this.field6764 = 256;
        }
        return this.field6763[--this.field6764];
    }

    @OriginalMember(owner = "client!td", name = "<init>", descriptor = "([I)V", line = 264)
    public class476(int[] arg0) {
        this.field6774 = new int[256];
        this.field6763 = new int[256];
        for (int var2 = 0; var2 < arg0.length; var2++) {
            this.field6763[var2] = arg0[var2];
        }
        this.method2806(-114964277);
    }
}
