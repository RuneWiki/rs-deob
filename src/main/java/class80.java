import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kb")
public class class80 {

    @OriginalMember(owner = "client!kb", name = "i", descriptor = "[I")
    private int[] field1110;

    @OriginalMember(owner = "client!kb", name = "h", descriptor = "[I")
    private int[] field1109;

    @OriginalMember(owner = "client!kb", name = "g", descriptor = "Lhc;")
    public static class368 field1108 = new class368("glow3:", "", "", "");

    @OriginalMember(owner = "client!kb", name = "n", descriptor = "S")
    public static short field1115 = 320;

    @OriginalMember(owner = "client!kb", name = "o", descriptor = "Ljava/lang/String;")
    public static String field1116 = "";

    @OriginalMember(owner = "client!kb", name = "p", descriptor = "I")
    public static int field1117 = 0;

    @OriginalMember(owner = "client!kb", name = "r", descriptor = "I")
    public static int field1119 = 0;

    @OriginalMember(owner = "client!kb", name = "u", descriptor = "I")
    public static int field1122 = -1;

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "I")
    public static int field1102;

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "I")
    private int field1103;

    @OriginalMember(owner = "client!kb", name = "e", descriptor = "I")
    public static int field1106;

    @OriginalMember(owner = "client!kb", name = "f", descriptor = "I")
    private int field1107;

    @OriginalMember(owner = "client!kb", name = "j", descriptor = "I")
    private int field1111;

    @OriginalMember(owner = "client!kb", name = "k", descriptor = "I")
    public static int field1112;

    @OriginalMember(owner = "client!kb", name = "l", descriptor = "I")
    public static int field1113;

    @OriginalMember(owner = "client!kb", name = "m", descriptor = "I")
    public static int field1114;

    @OriginalMember(owner = "client!kb", name = "s", descriptor = "I")
    public static int field1120;

    @OriginalMember(owner = "client!kb", name = "t", descriptor = "I")
    private int field1121;

    @OriginalMember(owner = "client!kb", name = "q", descriptor = "Lij;")
    public static class316 field1118;

    @OriginalMember(owner = "client!kb", name = "c", descriptor = "[I")
    public static int[] field1104;

    @OriginalMember(owner = "client!kb", name = "d", descriptor = "[Llq;")
    public static class75[] field1105;

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(I)V")
    private final void method646(int arg0) {
        if (arg0 != 7) {
            method650(-23);
        }
        field1114++;
        this.field1111 += ++this.field1121;
        for (int var2 = 0; var2 < 256; var2++) {
            int var3 = this.field1110[var2];
            if ((var2 & 0x2) == 0) {
                if ((var2 & 0x1) == 0) {
                    this.field1103 ^= this.field1103 << 13;
                } else {
                    this.field1103 ^= this.field1103 >>> 6;
                }
            } else if ((var2 & 0x1) == 0) {
                this.field1103 ^= this.field1103 << 2;
            } else {
                this.field1103 ^= this.field1103 >>> 16;
            }
            this.field1103 += this.field1110[var2 + 128 & 0xFF];
            int var4;
            this.field1110[var2] = var4 = this.field1110[class187.method1301(255, var3 >> 2)] + this.field1111 + this.field1103;
            this.field1109[var2] = this.field1111 = this.field1110[class187.method1301(261321, var4) >> 8 >> 2] + var3;
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(IBIIZILij;)V")
    public static final void method647(int arg0, byte arg1, int arg2, int arg3, boolean arg4, int arg5, class316 arg6) {
        class82.field1136 = arg6;
        class451.field6495 = arg0;
        class448.field6350 = arg4;
        field1106++;
        class10.field78 = 1;
        int var7 = -69 / ((68 - arg1) / 36);
        class277.field3784 = arg5;
        class346.field4682 = arg2;
        class380.field5248 = arg3;
    }

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "(I)V")
    private final void method648(int arg0) {
        if (arg0 != 7) {
            this.field1103 = 12;
        }
        field1120++;
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
            int var70 = var65 + var68;
            int var71 = var3 + var6;
            var5 = var70 ^ var68 << 10;
            int var72 = var2 + var5;
            int var73 = var68 + var71;
            var4 = var73 ^ var71 >>> 4;
            int var74 = var71 + var72;
            int var75 = var4 + var61;
            var3 = var74 ^ var72 << 8;
            var8 = var3 + var64;
            int var76 = var72 + var75;
            var2 = var76 ^ var75 >>> 9;
            var7 = var2 + var67;
            var9 = var8 + var75;
        }
        for (int var11 = 0; var11 < 256; var11 += 8) {
            int var37 = this.field1109[var11 + 3] + var6;
            int var38 = this.field1109[var11 + 6] + var3;
            int var39 = this.field1109[var11] + var9;
            int var40 = this.field1109[var11 + 4] + var5;
            int var41 = this.field1109[var11 + 5] + var4;
            int var42 = this.field1109[var11 + 7] + var2;
            int var43 = this.field1109[var11 + 2] + var7;
            int var44 = this.field1109[var11 + 1] + var8;
            int var45 = var39 ^ var44 << 11;
            int var46 = var37 + var45;
            int var47 = var43 + var44;
            int var48 = var47 ^ var43 >>> 2;
            int var49 = var43 + var46;
            int var50 = var40 + var48;
            int var51 = var49 ^ var46 << 8;
            int var52 = var46 + var50;
            int var53 = var41 + var51;
            var6 = var52 ^ var50 >>> 16;
            int var54 = var50 + var53;
            int var55 = var6 + var38;
            var5 = var54 ^ var53 << 10;
            int var56 = var53 + var55;
            int var57 = var5 + var42;
            var4 = var56 ^ var55 >>> 4;
            int var58 = var55 + var57;
            int var59 = var4 + var45;
            var3 = var58 ^ var57 << 8;
            int var60 = var57 + var59;
            var8 = var3 + var48;
            var2 = var60 ^ var59 >>> 9;
            var9 = var8 + var59;
            var7 = var2 + var51;
            this.field1110[var11] = var9;
            this.field1110[var11 + 1] = var8;
            this.field1110[var11 + 2] = var7;
            this.field1110[var11 + 3] = var6;
            this.field1110[var11 + 4] = var5;
            this.field1110[var11 + 5] = var4;
            this.field1110[var11 + 6] = var3;
            this.field1110[var11 + 7] = var2;
        }
        for (int var12 = 0; var12 < 256; var12 += 8) {
            int var13 = this.field1110[var12 + 1] + var8;
            int var14 = this.field1110[var12 + 6] + var3;
            int var15 = this.field1110[var12 + 3] + var6;
            int var16 = this.field1110[var12] + var9;
            int var17 = this.field1110[var12 + 7] + var2;
            int var18 = this.field1110[var12 + 4] + var5;
            int var19 = this.field1110[var12 + 5] + var4;
            int var20 = this.field1110[var12 + 2] + var7;
            int var21 = var16 ^ var13 << 11;
            int var22 = var13 + var20;
            int var23 = var15 + var21;
            int var24 = var22 ^ var20 >>> 2;
            int var25 = var18 + var24;
            int var26 = var20 + var23;
            int var27 = var26 ^ var23 << 8;
            int var28 = var23 + var25;
            int var29 = var19 + var27;
            var6 = var28 ^ var25 >>> 16;
            int var30 = var6 + var14;
            int var31 = var25 + var29;
            var5 = var31 ^ var29 << 10;
            int var32 = var5 + var17;
            int var33 = var29 + var30;
            var4 = var33 ^ var30 >>> 4;
            int var34 = var4 + var21;
            int var35 = var30 + var32;
            var3 = var35 ^ var32 << 8;
            var8 = var3 + var24;
            int var36 = var32 + var34;
            var2 = var36 ^ var34 >>> 9;
            var7 = var2 + var27;
            var9 = var8 + var34;
            this.field1110[var12] = var9;
            this.field1110[var12 + 1] = var8;
            this.field1110[var12 + 2] = var7;
            this.field1110[var12 + 3] = var6;
            this.field1110[var12 + 4] = var5;
            this.field1110[var12 + 5] = var4;
            this.field1110[var12 + 6] = var3;
            this.field1110[var12 + 7] = var2;
        }
        this.method646(arg0);
        this.field1107 = 256;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(ILea;)V")
    public static final void method649(int arg0, class58 arg1) {
        field1113++;
        if (class343.field4623 == class111.field1711 || class341.field4617 == null) {
            return;
        }
        if (class65.method514(class343.field4623, (byte) 82, arg1)) {
            class111.field1711 = class343.field4623;
        }
        if (arg0 != 4) {
            method647(-26, (byte) 97, -81, 75, false, 70, (class316) null);
        }
    }

    @OriginalMember(owner = "client!kb", name = "c", descriptor = "(I)V")
    public static final void method650(int arg0) {
        field1102++;
        class254.field3522.method551((byte) -115);
        for (int var1 = 0; var1 < 32; var1++) {
            class417.field5775[var1] = 0L;
        }
        if (arg0 == -4) {
            for (int var2 = 0; var2 < 32; var2++) {
                class229.field3226[var2] = 0L;
            }
            class18.field245 = 0;
        }
    }

    @OriginalMember(owner = "client!kb", name = "d", descriptor = "(I)I")
    public final int method651(int arg0) {
        field1112++;
        if (this.field1107-- == 0) {
            this.method646(arg0 + 2);
            this.field1107 = 255;
        }
        return arg0 == 5 ? this.field1109[this.field1107] : 16;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(B)V")
    public static void method652(byte arg0) {
        field1116 = null;
        field1105 = null;
        field1108 = null;
        if (arg0 > 87) {
            field1118 = null;
            field1104 = null;
        }
    }

    @OriginalMember(owner = "client!kb", name = "<init>", descriptor = "()V")
    private class80() {
    }

    @OriginalMember(owner = "client!kb", name = "<init>", descriptor = "([I)V")
    public class80(int[] arg0) {
        this.field1110 = new int[256];
        this.field1109 = new int[256];
        for (int var2 = 0; var2 < arg0.length; var2++) {
            this.field1109[var2] = arg0[var2];
        }
        this.method648(7);
    }
}
