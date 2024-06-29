import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!n")
public class class288 {

    @OriginalMember(owner = "client!n", name = "a", descriptor = "[I")
    private int[] field4839;

    @OriginalMember(owner = "client!n", name = "j", descriptor = "[I")
    private int[] field4848;

    @OriginalMember(owner = "client!n", name = "l", descriptor = "Lqb;")
    public static class209 field4850 = new class209(4);

    @OriginalMember(owner = "client!n", name = "p", descriptor = "Lbd;")
    public static class162 field4854 = class17.method142(0, "http:)4)4");

    @OriginalMember(owner = "client!n", name = "n", descriptor = "Lqb;")
    public static class209 field4852 = new class209(64);

    @OriginalMember(owner = "client!n", name = "b", descriptor = "I")
    private int field4840;

    @OriginalMember(owner = "client!n", name = "c", descriptor = "I")
    public static int field4841;

    @OriginalMember(owner = "client!n", name = "d", descriptor = "I")
    private int field4842;

    @OriginalMember(owner = "client!n", name = "e", descriptor = "I")
    public static int field4843;

    @OriginalMember(owner = "client!n", name = "f", descriptor = "I")
    private int field4844;

    @OriginalMember(owner = "client!n", name = "g", descriptor = "I")
    public static int field4845;

    @OriginalMember(owner = "client!n", name = "h", descriptor = "I")
    public static int field4846;

    @OriginalMember(owner = "client!n", name = "i", descriptor = "I")
    public static int field4847;

    @OriginalMember(owner = "client!n", name = "k", descriptor = "I")
    public static int field4849;

    @OriginalMember(owner = "client!n", name = "m", descriptor = "I")
    private int field4851;

    @OriginalMember(owner = "client!n", name = "q", descriptor = "I")
    public static int field4855;

    @OriginalMember(owner = "client!n", name = "o", descriptor = "Ljava/lang/Thread;")
    public static Thread field4853;

    @OriginalMember(owner = "client!n", name = "r", descriptor = "[[[Lnm;")
    public static class225[][][] field4856;

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(I)V", line = 16)
    private final void method1996(int arg0) {
        this.field4844 += ++this.field4842;
        field4841++;
        for (int var2 = arg0; var2 < 256; var2++) {
            int var3 = this.field4848[var2];
            if ((var2 & 0x2) == 0) {
                if ((var2 & 0x1) == 0) {
                    this.field4840 ^= this.field4840 << 13;
                } else {
                    this.field4840 ^= this.field4840 >>> 6;
                }
            } else if ((var2 & 0x1) == 0) {
                this.field4840 ^= this.field4840 << 2;
            } else {
                this.field4840 ^= this.field4840 >>> 16;
            }
            this.field4840 += this.field4848[var2 + 128 & 0xFF];
            int var4;
            this.field4848[var2] = var4 = this.field4844 + this.field4848[class92.method695(1020, var3) >> 2] + this.field4840;
            this.field4839[var2] = this.field4844 = var3 + this.field4848[class92.method695(var4, 261364) >> 8 >> 2];
        }
    }

    @OriginalMember(owner = "client!n", name = "b", descriptor = "(I)V", line = 65)
    public static void method1997(int arg0) {
        if (arg0 != 64) {
            field4852 = (class209) null;
        }
        field4852 = null;
        field4850 = null;
        field4856 = (class225[][][]) null;
        field4854 = null;
        field4853 = null;
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(Z)I", line = 79)
    public final int method1998(boolean arg0) {
        if (!arg0) {
            method2001((byte) 107, (Component) null);
        }
        field4846++;
        if (this.field4851-- == 0) {
            this.method1996(0);
            this.field4851 = 255;
        }
        return this.field4839[this.field4851];
    }

    @OriginalMember(owner = "client!n", name = "c", descriptor = "(I)V", line = 104)
    private final void method1999(int arg0) {
        field4847++;
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
            int var12 = var6 + var11;
            int var13 = var7 + var8;
            int var14 = var13 ^ var7 >>> 2;
            int var15 = var7 + var12;
            int var16 = var15 ^ var12 << 8;
            int var17 = var4 + var16;
            int var18 = var5 + var14;
            int var19 = var12 + var18;
            var6 = var19 ^ var18 >>> 16;
            int var20 = var3 + var6;
            int var21 = var17 + var18;
            var5 = var21 ^ var17 << 10;
            int var22 = var2 + var5;
            int var23 = var17 + var20;
            var4 = var23 ^ var20 >>> 4;
            int var24 = var4 + var11;
            int var25 = var20 + var22;
            var3 = var25 ^ var22 << 8;
            int var26 = var22 + var24;
            var2 = var26 ^ var24 >>> 9;
            var7 = var2 + var16;
            var8 = var3 + var14;
            var9 = var8 + var24;
        }
        for (int var27 = 0; var27 < 256; var27 += 8) {
            int var28 = this.field4839[var27 + 7] + var2;
            int var29 = this.field4839[var27 + 1] + var8;
            int var30 = this.field4839[var27 + 4] + var5;
            int var31 = this.field4839[var27 + 6] + var3;
            int var32 = this.field4839[var27 + 3] + var6;
            int var33 = this.field4839[var27 + 2] + var7;
            int var34 = this.field4839[var27 + 5] + var4;
            int var35 = this.field4839[var27] + var9;
            int var36 = var35 ^ var29 << 11;
            int var37 = var32 + var36;
            int var38 = var29 + var33;
            int var39 = var38 ^ var33 >>> 2;
            int var40 = var33 + var37;
            int var41 = var40 ^ var37 << 8;
            int var42 = var34 + var41;
            int var43 = var30 + var39;
            int var44 = var37 + var43;
            var6 = var44 ^ var43 >>> 16;
            int var45 = var42 + var43;
            var5 = var45 ^ var42 << 10;
            int var46 = var6 + var31;
            int var47 = var42 + var46;
            var4 = var47 ^ var46 >>> 4;
            int var48 = var4 + var36;
            int var49 = var5 + var28;
            int var50 = var46 + var49;
            var3 = var50 ^ var49 << 8;
            var8 = var3 + var39;
            int var51 = var48 + var49;
            var2 = var51 ^ var48 >>> 9;
            var7 = var2 + var41;
            var9 = var8 + var48;
            this.field4848[var27] = var9;
            this.field4848[var27 + 1] = var8;
            this.field4848[var27 + 2] = var7;
            this.field4848[var27 + 3] = var6;
            this.field4848[var27 + 4] = var5;
            this.field4848[var27 + 5] = var4;
            this.field4848[var27 + 6] = var3;
            this.field4848[var27 + 7] = var2;
        }
        if (arg0 <= 75) {
            method1997(39);
        }
        for (int var52 = 0; var52 < 256; var52 += 8) {
            int var53 = this.field4848[var52 + 6] + var3;
            int var54 = this.field4848[var52 + 2] + var7;
            int var55 = this.field4848[var52 + 5] + var4;
            int var56 = this.field4848[var52] + var9;
            int var57 = this.field4848[var52 + 3] + var6;
            int var58 = this.field4848[var52 + 1] + var8;
            int var59 = this.field4848[var52 + 7] + var2;
            int var60 = var56 ^ var58 << 11;
            int var61 = var54 + var58;
            int var62 = var61 ^ var54 >>> 2;
            int var63 = this.field4848[var52 + 4] + var5;
            int var64 = var57 + var60;
            int var65 = var62 + var63;
            int var66 = var54 + var64;
            int var67 = var66 ^ var64 << 8;
            int var68 = var55 + var67;
            int var69 = var64 + var65;
            var6 = var69 ^ var65 >>> 16;
            int var70 = var65 + var68;
            int var71 = var6 + var53;
            var5 = var70 ^ var68 << 10;
            int var72 = var5 + var59;
            int var73 = var68 + var71;
            var4 = var73 ^ var71 >>> 4;
            int var74 = var71 + var72;
            int var75 = var4 + var60;
            var3 = var74 ^ var72 << 8;
            int var76 = var72 + var75;
            var2 = var76 ^ var75 >>> 9;
            var7 = var2 + var67;
            var8 = var3 + var62;
            var9 = var8 + var75;
            this.field4848[var52] = var9;
            this.field4848[var52 + 1] = var8;
            this.field4848[var52 + 2] = var7;
            this.field4848[var52 + 3] = var6;
            this.field4848[var52 + 4] = var5;
            this.field4848[var52 + 5] = var4;
            this.field4848[var52 + 6] = var3;
            this.field4848[var52 + 7] = var2;
        }
        this.method1996(0);
        this.field4851 = 256;
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(IB)I", line = 252)
    public static final int method2000(int arg0, byte arg1) {
        if (arg1 >= -70) {
            return 93;
        } else {
            field4845++;
            return (arg0 & 0x1D38AD) >> 18;
        }
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(BLjava/awt/Component;)V", line = 270)
    public static final void method2001(byte arg0, Component arg1) {
        arg1.addMouseListener(class240.field3998);
        arg1.addMouseMotionListener(class240.field3998);
        if (arg0 > -30) {
            method2000(-103, (byte) -68);
        }
        field4849++;
        arg1.addFocusListener(class240.field3998);
    }

    @OriginalMember(owner = "client!n", name = "<init>", descriptor = "()V", line = 285)
    private class288() {
    }

    @OriginalMember(owner = "client!n", name = "<init>", descriptor = "([I)V", line = 287)
    public class288(int[] arg0) {
        this.field4839 = new int[256];
        this.field4848 = new int[256];
        for (int var2 = 0; var2 < arg0.length; var2++) {
            this.field4839[var2] = arg0[var2];
        }
        this.method1999(117);
    }
}
