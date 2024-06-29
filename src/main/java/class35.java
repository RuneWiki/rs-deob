import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fd")
public class class35 {

    @OriginalMember(owner = "client!fd", name = "q", descriptor = "[I")
    private int[] field885 = new int[256];

    @OriginalMember(owner = "client!fd", name = "c", descriptor = "[I")
    private int[] field871 = new int[256];

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "Lad;")
    public static class5 field870 = class88.method674("(U", 58);

    @OriginalMember(owner = "client!fd", name = "x", descriptor = "[J")
    public static long[] field892 = new long[200];

    @OriginalMember(owner = "client!fd", name = "o", descriptor = "I")
    public static int field883 = 0;

    @OriginalMember(owner = "client!fd", name = "r", descriptor = "Lad;")
    public static class5 field886 = class88.method674(" )2> @cya@", -77);

    @OriginalMember(owner = "client!fd", name = "v", descriptor = "Lad;")
    public static class5 field890 = class88.method674("M", -89);

    @OriginalMember(owner = "client!fd", name = "l", descriptor = "I")
    public static int field880 = 0;

    @OriginalMember(owner = "client!fd", name = "s", descriptor = "Lad;")
    public static class5 field887 = class88.method674("lila:", -85);

    @OriginalMember(owner = "client!fd", name = "t", descriptor = "Lad;")
    public static class5 field888 = class88.method674(" hat sich eingeloggt)3", -95);

    @OriginalMember(owner = "client!fd", name = "y", descriptor = "I")
    public static int field893 = 0;

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "I")
    public static int field869;

    @OriginalMember(owner = "client!fd", name = "e", descriptor = "I")
    public static int field873;

    @OriginalMember(owner = "client!fd", name = "f", descriptor = "I")
    public static int field874;

    @OriginalMember(owner = "client!fd", name = "g", descriptor = "I")
    private int field875;

    @OriginalMember(owner = "client!fd", name = "i", descriptor = "I")
    public static int field877;

    @OriginalMember(owner = "client!fd", name = "j", descriptor = "I")
    private int field878;

    @OriginalMember(owner = "client!fd", name = "k", descriptor = "I")
    public static int field879;

    @OriginalMember(owner = "client!fd", name = "m", descriptor = "I")
    public static int field881;

    @OriginalMember(owner = "client!fd", name = "n", descriptor = "I")
    private int field882;

    @OriginalMember(owner = "client!fd", name = "p", descriptor = "I")
    public static int field884;

    @OriginalMember(owner = "client!fd", name = "u", descriptor = "I")
    private int field889;

    @OriginalMember(owner = "client!fd", name = "w", descriptor = "I")
    public static int field891;

    @OriginalMember(owner = "client!fd", name = "z", descriptor = "I")
    public static int field894;

    @OriginalMember(owner = "client!fd", name = "A", descriptor = "I")
    public static int field895;

    @OriginalMember(owner = "client!fd", name = "C", descriptor = "I")
    public static int field897;

    @OriginalMember(owner = "client!fd", name = "D", descriptor = "I")
    public static int field898;

    @OriginalMember(owner = "client!fd", name = "E", descriptor = "I")
    public static int field899;

    @OriginalMember(owner = "client!fd", name = "B", descriptor = "J")
    public static long field896;

    @OriginalMember(owner = "client!fd", name = "d", descriptor = "Ltb;")
    public static class116 field872;

    @OriginalMember(owner = "client!fd", name = "h", descriptor = "[Lub;")
    public static class122[] field876;

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(I)V", line = 18)
    private final void method268(int arg0) {
        field897++;
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
            var6 = var68 ^ var65 >>> 16;
            int var69 = var3 + var6;
            int var70 = var4 + var67;
            int var71 = var65 + var70;
            var5 = var71 ^ var70 << 10;
            int var72 = var2 + var5;
            int var73 = var69 + var70;
            var4 = var73 ^ var69 >>> 4;
            int var74 = var4 + var61;
            int var75 = var69 + var72;
            var3 = var75 ^ var72 << 8;
            int var76 = var72 + var74;
            var8 = var3 + var64;
            var2 = var76 ^ var74 >>> 9;
            var7 = var2 + var67;
            var9 = var8 + var74;
        }
        for (int var11 = 0; var11 < 256; var11 += 8) {
            int var37 = this.field871[var11] + var9;
            int var38 = this.field871[var11 + 6] + var3;
            int var39 = this.field871[var11 + 4] + var5;
            int var40 = this.field871[var11 + 5] + var4;
            int var41 = this.field871[var11 + 1] + var8;
            int var42 = this.field871[var11 + 3] + var6;
            int var43 = var37 ^ var41 << 11;
            int var44 = this.field871[var11 + 2] + var7;
            int var45 = var42 + var43;
            int var46 = this.field871[var11 + 7] + var2;
            int var47 = var41 + var44;
            int var48 = var47 ^ var44 >>> 2;
            int var49 = var44 + var45;
            int var50 = var39 + var48;
            int var51 = var49 ^ var45 << 8;
            int var52 = var40 + var51;
            int var53 = var45 + var50;
            var6 = var53 ^ var50 >>> 16;
            int var54 = var50 + var52;
            int var55 = var6 + var38;
            var5 = var54 ^ var52 << 10;
            int var56 = var52 + var55;
            int var57 = var5 + var46;
            var4 = var56 ^ var55 >>> 4;
            int var58 = var55 + var57;
            var3 = var58 ^ var57 << 8;
            var8 = var3 + var48;
            int var59 = var4 + var43;
            int var60 = var57 + var59;
            var2 = var60 ^ var59 >>> 9;
            var9 = var8 + var59;
            var7 = var2 + var51;
            this.field885[var11] = var9;
            this.field885[var11 + 1] = var8;
            this.field885[var11 + 2] = var7;
            this.field885[var11 + 3] = var6;
            this.field885[var11 + 4] = var5;
            this.field885[var11 + 5] = var4;
            this.field885[var11 + 6] = var3;
            this.field885[var11 + 7] = var2;
        }
        for (int var12 = 0; var12 < 256; var12 += 8) {
            int var13 = this.field885[var12] + var9;
            int var14 = this.field885[var12 + 7] + var2;
            int var15 = this.field885[var12 + 1] + var8;
            int var16 = this.field885[var12 + 3] + var6;
            int var17 = this.field885[var12 + 6] + var3;
            int var18 = this.field885[var12 + 4] + var5;
            int var19 = var13 ^ var15 << 11;
            int var20 = this.field885[var12 + 2] + var7;
            int var21 = var15 + var20;
            int var22 = var16 + var19;
            int var23 = var21 ^ var20 >>> 2;
            int var24 = var20 + var22;
            int var25 = this.field885[var12 + 5] + var4;
            int var26 = var24 ^ var22 << 8;
            int var27 = var18 + var23;
            int var28 = var22 + var27;
            var6 = var28 ^ var27 >>> 16;
            int var29 = var25 + var26;
            int var30 = var27 + var29;
            var5 = var30 ^ var29 << 10;
            int var31 = var6 + var17;
            int var32 = var29 + var31;
            int var33 = var5 + var14;
            var4 = var32 ^ var31 >>> 4;
            int var34 = var4 + var19;
            int var35 = var31 + var33;
            var3 = var35 ^ var33 << 8;
            int var36 = var33 + var34;
            var2 = var36 ^ var34 >>> 9;
            var7 = var2 + var26;
            var8 = var3 + var23;
            var9 = var8 + var34;
            this.field885[var12] = var9;
            this.field885[var12 + 1] = var8;
            this.field885[var12 + 2] = var7;
            this.field885[var12 + 3] = var6;
            this.field885[var12 + 4] = var5;
            this.field885[var12 + 5] = var4;
            this.field885[var12 + 6] = var3;
            this.field885[var12 + 7] = var2;
        }
        if (arg0 != 8) {
            field890 = null;
        }
        this.method271(7);
        this.field889 = 256;
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(BIILrd;)Lub;", line = 172)
    public static final class122 method269(byte arg0, int arg1, int arg2, class106 arg3) {
        if (arg0 != -108) {
            field872 = null;
        }
        field899++;
        return class5.method76((byte) 113, arg1, arg3, arg2) ? class14.method120(-1) : null;
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(Z)V", line = 194)
    public static final void method270(boolean arg0) {
        if (!arg0) {
            field894++;
            class101.field2461.method885(-90);
        }
    }

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "(I)V", line = 205)
    private final void method271(int arg0) {
        field898++;
        this.field882 += ++this.field878;
        if (arg0 != 7) {
            method275(null, 120, -92, 36);
        }
        for (int var2 = 0; var2 < 256; var2++) {
            int var3 = this.field885[var2];
            if ((var2 & 0x2) == 0) {
                if ((var2 & 0x1) == 0) {
                    this.field875 ^= this.field875 << 13;
                } else {
                    this.field875 ^= this.field875 >>> 6;
                }
            } else if ((var2 & 0x1) == 0) {
                this.field875 ^= this.field875 << 2;
            } else {
                this.field875 ^= this.field875 >>> 16;
            }
            this.field875 += this.field885[var2 + 128 & 0xFF];
            int var4;
            this.field885[var2] = var4 = this.field885[class104.method832(var3, 1020) >> 2] + this.field882 + this.field875;
            this.field871[var2] = this.field882 = var3 + this.field885[class104.method832(255, var4 >> 8 >> 2)];
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(B)V", line = 260)
    public static void method272(byte arg0) {
        field872 = null;
        field892 = null;
        field876 = null;
        field887 = null;
        field890 = null;
        field870 = null;
        if (arg0 != -14) {
            field890 = null;
        }
        field888 = null;
        field886 = null;
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(JI)V", line = 277)
    public static final void method273(long arg0, int arg1) {
        field879++;
        if (arg0 == 0L) {
            return;
        }
        if (class100.field2437 >= 100 && class56.field1398 != 1 || class100.field2437 >= 200) {
            class21.method168(class60.field1465, class135.field3269, false, 0);
            return;
        }
        class5 var3 = class110.method891(arg0, -30523).method45((byte) -101);
        for (int var4 = 0; var4 < class100.field2437; var4++) {
            if (field892[var4] == arg0) {
                class21.method168(class69.method546(true, new class5[] { var3, class36.field920 }), class135.field3269, false, 0);
                return;
            }
        }
        for (int var5 = 0; var5 < class32.field769; var5++) {
            if (class14.field400[var5] == arg0) {
                class21.method168(class69.method546(true, new class5[] { class112.field2797, var3, class20.field539 }), class135.field3269, false, 0);
                return;
            }
        }
        if (var3.method66((byte) -96, class82.field1932.field2801)) {
            return;
        }
        class21.field543[class100.field2437] = var3;
        class78.field1828++;
        field892[class100.field2437] = arg0;
        class40.field1040[class100.field2437] = 0;
        class100.field2437++;
        class43.field1086 = true;
        class5.field163.method209(199, 10);
        if (arg1 != -548127580) {
            field888 = null;
        }
        class5.field163.method340(arg0, arg1 ^ 0x2A228774);
    }

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "(Z)I", line = 372)
    public final int method274(boolean arg0) {
        field873++;
        if (!arg0) {
            return -64;
        }
        if (this.field889-- == 0) {
            this.method271(7);
            this.field889 = 255;
        }
        return this.field871[this.field889];
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(Lrd;III)[Luc;", line = 389)
    public static final class123[] method275(class106 arg0, int arg1, int arg2, int arg3) {
        field869++;
        if (class5.method76((byte) -76, arg1, arg0, arg3)) {
            if (arg2 < 86) {
                field883 = 58;
            }
            return class102.method822(true);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!fd", name = "<init>", descriptor = "([I)V", line = 425)
    public class35(int[] arg0) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            this.field871[var2] = arg0[var2];
        }
        this.method268(8);
    }
}
