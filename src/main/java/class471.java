import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nm")
public class class471 extends class131 {

    @OriginalMember(owner = "client!nm", name = "e", descriptor = "I")
    private int field6720 = 0;

    @OriginalMember(owner = "client!nm", name = "B", descriptor = "I")
    private int field6743 = 0;

    @OriginalMember(owner = "client!nm", name = "u", descriptor = "I")
    private int field6736 = 0;

    @OriginalMember(owner = "client!nm", name = "G", descriptor = "Z")
    private boolean field6748 = false;

    @OriginalMember(owner = "client!nm", name = "K", descriptor = "I")
    private int field6752 = 0;

    @OriginalMember(owner = "client!nm", name = "m", descriptor = "I")
    private int field6728;

    @OriginalMember(owner = "client!nm", name = "l", descriptor = "I")
    private int field6727;

    @OriginalMember(owner = "client!nm", name = "r", descriptor = "Lln;")
    private class377 field6733;

    @OriginalMember(owner = "client!nm", name = "f", descriptor = "Loq;")
    private class358 field6721;

    @OriginalMember(owner = "client!nm", name = "F", descriptor = "Z")
    private boolean field6747;

    @OriginalMember(owner = "client!nm", name = "g", descriptor = "Z")
    private boolean field6722;

    @OriginalMember(owner = "client!nm", name = "D", descriptor = "Z")
    private boolean field6745;

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "Z")
    private boolean field6716;

    @OriginalMember(owner = "client!nm", name = "c", descriptor = "I")
    public static int field6718 = -1;

    @OriginalMember(owner = "client!nm", name = "y", descriptor = "Z")
    public static boolean field6740 = false;

    @OriginalMember(owner = "client!nm", name = "i", descriptor = "[Ljava/lang/String;")
    public static String[] field6724 = new String[8];

    @OriginalMember(owner = "client!nm", name = "C", descriptor = "Z")
    public static boolean field6744 = false;

    @OriginalMember(owner = "client!nm", name = "t", descriptor = "Lmha;")
    public static class414 field6735 = null;

    @OriginalMember(owner = "client!nm", name = "x", descriptor = "[[B")
    public static byte[][] field6739 = new byte[250][];

    @OriginalMember(owner = "client!nm", name = "L", descriptor = "[J")
    public static long[] field6753;

    @OriginalMember(owner = "client!nm", name = "b", descriptor = "I")
    public static int field6717;

    @OriginalMember(owner = "client!nm", name = "d", descriptor = "I")
    public static int field6719;

    @OriginalMember(owner = "client!nm", name = "h", descriptor = "I")
    public static int field6723;

    @OriginalMember(owner = "client!nm", name = "j", descriptor = "I")
    public static int field6725;

    @OriginalMember(owner = "client!nm", name = "k", descriptor = "I")
    public static int field6726;

    @OriginalMember(owner = "client!nm", name = "n", descriptor = "I")
    public static int field6729;

    @OriginalMember(owner = "client!nm", name = "o", descriptor = "I")
    public static int field6730;

    @OriginalMember(owner = "client!nm", name = "p", descriptor = "I")
    public static int field6731;

    @OriginalMember(owner = "client!nm", name = "q", descriptor = "I")
    public static int field6732;

    @OriginalMember(owner = "client!nm", name = "v", descriptor = "I")
    public static int field6737;

    @OriginalMember(owner = "client!nm", name = "w", descriptor = "I")
    public static int field6738;

    @OriginalMember(owner = "client!nm", name = "z", descriptor = "I")
    public static int field6741;

    @OriginalMember(owner = "client!nm", name = "A", descriptor = "I")
    public static int field6742;

    @OriginalMember(owner = "client!nm", name = "E", descriptor = "I")
    public static int field6746;

    @OriginalMember(owner = "client!nm", name = "H", descriptor = "I")
    public static int field6749;

    @OriginalMember(owner = "client!nm", name = "I", descriptor = "I")
    public static int field6750;

    @OriginalMember(owner = "client!nm", name = "J", descriptor = "I")
    public static int field6751;

    @OriginalMember(owner = "client!nm", name = "s", descriptor = "Loh;")
    public static class404 field6734;

    static {
        new class104("", 76);
        field6753 = new long[256];
        for (int var0 = 0; var0 < 256; var0++) {
            long var1 = (long) var0;
            for (int var3 = 0; var3 < 8; var3++) {
                if ((var1 & 0x1L) == 1L) {
                    var1 = var1 >>> 1 ^ 0xC96C5795D7870F42L;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field6753[var0] = var1;
        }
    }

    @OriginalMember(owner = "client!nm", name = "c", descriptor = "()I", line = 6)
    public final int method510() {
        field6730++;
        return this.field6728 + this.field6743 + this.field6736;
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(FFFFFFILaa;II)V", line = 14)
    public final void method500(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, class485 arg7, int arg8, int arg9) {
        field6741++;
        class427 var11 = this.field6733.method2263((byte) 55);
        class427 var12 = this.field6733.method2224((byte) 23);
        class159 var13 = (class159) arg7;
        class358 var14 = var13.field1759;
        this.field6721.method155(this.field6747 || this.field6722 || (arg6 & 0x1) == 0 ? class755.field10532 : class523.field7453, -25446);
        this.field6733.method2269(-2);
        this.field6733.method2207((byte) -61, this.field6721);
        this.field6733.method2274(1, -2);
        this.field6733.method2255(1, 15818);
        if (this.field6748) {
            float var15 = (float) this.field6727 / (float) this.method501();
            float var16 = (float) this.field6728 / (float) this.method510();
            var11.method2673(0.0F, 0.0F, 0.0F, 1.0F, (arg4 - arg0) * var16, 0.0F, (byte) 82, (arg3 - arg1) * var15, (arg2 - arg0) * var15, (arg5 - arg1) * var16);
            var11.method2666(0.0F, ((float) this.field6752 + arg0) * var15, ((float) this.field6736 + arg1) * var16, (byte) -117);
        } else {
            var11.method2673(0.0F, 0.0F, 0.0F, 1.0F, arg4 - arg0, 0.0F, (byte) 82, arg3 - arg1, -arg0 + arg2, arg5 - arg1);
            var11.method2666(0.0F, arg0, arg1, (byte) -106);
        }
        var12.method2661(this.field6721.method599((float) this.field6728, 83), 1.0F, (byte) 60, this.field6721.method606(13050, (float) this.field6727));
        this.field6733.method2226(class655.field9349, -101);
        this.field6733.method2217(1, 95);
        this.field6733.method2207((byte) -61, var14);
        this.field6733.method2242(-110, class372.field4752, class94.field989);
        this.field6733.method2264(0, class324.field4136, (byte) 60);
        class427 var17 = this.field6733.method2224((byte) 23);
        var17.method1028(var11);
        var17.method1033(-arg8, -arg9, 0);
        var17.method2672(var14.method606(13050, 1.0F), 1.0F, 24002, var14.method599(1.0F, -97));
        this.field6733.method2226(class655.field9349, -109);
        this.field6733.method2304(119);
        this.field6733.method2279(2);
        this.field6733.method2248((byte) -118);
        this.field6733.method2264(0, class424.field6157, (byte) 60);
        this.field6733.method2242(-101, class372.field4752, class372.field4752);
        this.field6733.method2207((byte) -61, null);
        this.field6733.method2217(0, 25);
        this.field6733.method2248((byte) -89);
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "()I", line = 70)
    public final int method501() {
        field6731++;
        return this.field6752 + this.field6720 + this.field6727;
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(III)V", line = 79)
    public final void method822(int arg0, int arg1, int arg2) {
        field6738++;
        int[] var4 = this.field6733.method356(arg0, arg1, this.field6727, this.field6728);
        int[] var5 = new int[this.field6728 * this.field6727];
        this.field6721.method607(0, var5, this.field6727, this.field6728, 0, 0, 2444);
        if (arg2 == 0) {
            for (int var15 = 0; var15 < this.field6728; var15++) {
                int var16 = this.field6727 * var15;
                for (int var17 = 0; var17 < this.field6727; var17++) {
                    var5[var16 + var17] = class695.method3919(class327.method1956(var5[var16 + var17], 16777215), class327.method1956(-1459683328, var4[var16 + var17]) << 8);
                }
            }
        } else if (arg2 == 1) {
            for (int var12 = 0; var12 < this.field6728; var12++) {
                int var13 = this.field6727 * var12;
                for (int var14 = 0; var14 < this.field6727; var14++) {
                    var5[var13 + var14] = class695.method3919(class327.method1956(var5[var13 + var14], 16777215), class327.method1956(var4[var13 + var14], 1413218048) << 16);
                }
            }
        } else if (arg2 == 2) {
            for (int var9 = 0; var9 < this.field6728; var9++) {
                int var10 = this.field6727 * var9;
                for (int var11 = 0; var11 < this.field6727; var11++) {
                    var5[var10 + var11] = class695.method3919(class327.method1956(69561855, var4[var10 + var11]) << 24, class327.method1956(16777215, var5[var10 + var11]));
                }
            }
        } else if (arg2 == 3) {
            for (int var6 = 0; var6 < this.field6728; var6++) {
                int var7 = this.field6727 * var6;
                for (int var8 = 0; var8 < this.field6727; var8++) {
                    var5[var7 + var8] = class695.method3919(class327.method1956(16777215, var5[var7 + var8]), var4[var7 + var8] == 0 ? 0 : -16777216);
                }
            }
        }
        this.method2848(0, 0, this.field6727, this.field6728, var5, 0, this.field6727);
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(IIIIIII)V", line = 194)
    public final void method513(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field6750++;
        class427 var8 = this.field6733.method2263((byte) 55);
        class427 var9 = this.field6733.method2224((byte) 23);
        this.field6721.method155(class755.field10532, -25446);
        this.field6733.method2269(-2);
        this.field6733.method2207((byte) -61, this.field6721);
        this.field6733.method2274(arg6, -2);
        this.field6733.method2255(arg4, 15818);
        this.field6733.method2264(1, class58.field582, (byte) 60);
        this.field6733.method2268(1, 73, class58.field582);
        this.field6733.method2257(arg5, -552);
        boolean var10 = this.field6716 && this.field6736 == 0 && this.field6743 == 0;
        boolean var11 = this.field6745 && this.field6752 == 0 && this.field6720 == 0;
        if (var10 & var11) {
            var9.method2661(this.field6721.method599((float) arg3, 86), 1.0F, (byte) 60, this.field6721.method606(13050, (float) arg2));
            var8.method2661((float) arg3, 0.0F, (byte) 60, (float) arg2);
            var8.method1033(arg0, arg1, 0);
            this.field6733.method2226(class655.field9349, -92);
            this.field6733.method2304(80);
            this.field6733.method2279(2);
        } else if (var11) {
            int var12 = arg1 + arg3;
            int var13 = this.method510();
            var9.method2661(this.field6721.method599((float) this.field6728, -121), 1.0F, (byte) 60, this.field6721.method606(13050, (float) arg2));
            this.field6733.method2226(class655.field9349, -106);
            int var14 = this.field6736 + arg1;
            for (int var15 = this.field6728 + var14; var15 <= var12; var15 += var13) {
                var8.method2661((float) this.field6728, 0.0F, (byte) 60, (float) arg2);
                var8.method1033(arg0, var14, 0);
                this.field6733.method2304(71);
                this.field6733.method2279(2);
                var14 += var13;
            }
            if (var14 < var12) {
                int var16 = var12 - var14;
                var9.method2661(this.field6721.method599((float) var16, 70), 1.0F, (byte) 60, this.field6721.method606(13050, (float) arg2));
                this.field6733.method2226(class655.field9349, -118);
                var8.method2661((float) var16, 0.0F, (byte) 60, (float) arg2);
                var8.method1033(arg0, var14, 0);
                this.field6733.method2304(-7);
                this.field6733.method2279(2);
            }
        } else if (var10) {
            int var30 = arg0 + arg2;
            int var31 = this.method501();
            var9.method2661(this.field6721.method599((float) arg3, 73), 1.0F, (byte) 60, this.field6721.method606(13050, (float) this.field6727));
            this.field6733.method2226(class655.field9349, -103);
            int var32 = this.field6752 + arg0;
            int var33 = this.field6727 + var32;
            while (var30 >= var33) {
                var8.method2661((float) arg3, 0.0F, (byte) 60, (float) this.field6727);
                var8.method1033(var32, arg1, 0);
                this.field6733.method2304(-124);
                this.field6733.method2279(2);
                var33 += var31;
                var32 += var31;
            }
            if (var32 < var30) {
                int var34 = var30 - var32;
                var9.method2661(this.field6721.method599((float) arg3, -106), 1.0F, (byte) 60, this.field6721.method606(13050, (float) var34));
                this.field6733.method2226(class655.field9349, -113);
                var8.method2661((float) arg3, 0.0F, (byte) 60, (float) var34);
                var8.method1033(var32, arg1, 0);
                this.field6733.method2304(67);
                this.field6733.method2279(2);
            }
        } else {
            int var17 = arg1 + arg3;
            int var18 = arg0 + arg2;
            int var19 = this.method501();
            int var20 = this.method510();
            int var21 = this.field6736 + arg1;
            int var22 = this.field6728 + var21;
            while (var17 >= var22) {
                var9.method2661(this.field6721.method599((float) this.field6728, 100), 1.0F, (byte) 60, this.field6721.method606(13050, (float) this.field6727));
                this.field6733.method2226(class655.field9349, -97);
                int var27 = this.field6752 + arg0;
                int var28 = this.field6727 + var27;
                while (var18 >= var28) {
                    var8.method2661((float) this.field6728, 0.0F, (byte) 60, (float) this.field6727);
                    var8.method1033(var27, var21, 0);
                    this.field6733.method2304(77);
                    var28 += var19;
                    var27 += var19;
                    this.field6733.method2279(2);
                }
                if (var27 < var18) {
                    int var29 = var18 - var27;
                    var9.method2661(this.field6721.method599((float) this.field6728, 40), 1.0F, (byte) 60, this.field6721.method606(13050, (float) var29));
                    this.field6733.method2226(class655.field9349, -116);
                    var8.method2661((float) this.field6728, 0.0F, (byte) 60, (float) var29);
                    var8.method1033(var27, var21, 0);
                    this.field6733.method2304(-119);
                    this.field6733.method2279(2);
                }
                var22 += var20;
                var21 += var20;
            }
            if (var21 < var17) {
                int var23 = var17 - var21;
                var9.method2661(this.field6721.method599((float) var23, -115), 1.0F, (byte) 60, this.field6721.method606(13050, (float) this.field6727));
                this.field6733.method2226(class655.field9349, -93);
                int var24 = this.field6752 + arg0;
                int var25 = var24 + this.field6727;
                while (var18 >= var25) {
                    var8.method2661((float) var23, 0.0F, (byte) 60, (float) this.field6727);
                    var8.method1033(var24, var21, 0);
                    this.field6733.method2304(-124);
                    var24 += var19;
                    var25 += var19;
                    this.field6733.method2279(2);
                }
                if (var24 < var18) {
                    int var26 = var18 - var24;
                    var9.method2661(this.field6721.method599((float) var23, -117), 1.0F, (byte) 60, this.field6721.method606(13050, (float) var26));
                    this.field6733.method2226(class655.field9349, -94);
                    var8.method2661((float) var23, 0.0F, (byte) 60, (float) var26);
                    var8.method1033(var24, var21, 0);
                    this.field6733.method2304(54);
                    this.field6733.method2279(2);
                }
            }
        }
        this.field6733.method2248((byte) -97);
        this.field6733.method2264(1, class324.field4136, (byte) 60);
        this.field6733.method2268(1, 87, class324.field4136);
    }

    @OriginalMember(owner = "client!nm", name = "<init>", descriptor = "(Lln;IIZ)V", line = 733)
    public class471(class377 arg0, int arg1, int arg2, boolean arg3) {
        this.field6728 = arg2;
        this.field6727 = arg1;
        this.field6733 = arg0;
        this.field6721 = arg0.method2241(class687.field9697, arg3 ? class102.field1058 : class430.field6247, arg1, (byte) -125, arg2);
        this.field6721.method604(true, true, (byte) -43);
        this.field6747 = arg1 != this.field6721.method608(-27620);
        this.field6722 = arg2 != this.field6721.method603(true);
        this.field6745 = !this.field6747 && this.field6721.method600((byte) -118);
        this.field6716 = !this.field6722 && this.field6721.method600((byte) -122);
    }

    @OriginalMember(owner = "client!nm", name = "<init>", descriptor = "(Lln;II[III)V", line = 777)
    public class471(class377 arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5) {
        this.field6728 = arg2;
        this.field6733 = arg0;
        this.field6727 = arg1;
        this.field6721 = arg0.method2246(arg1, false, arg3, arg2, (byte) -4, arg5, arg4);
        this.field6721.method604(true, true, (byte) -43);
        this.field6747 = this.field6721.method608(-27620) != arg1;
        this.field6722 = arg2 != this.field6721.method603(true);
        this.field6745 = !this.field6747 && this.field6721.method600((byte) -125);
        this.field6716 = !this.field6722 && this.field6721.method600((byte) -121);
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(Z)V", line = 405)
    public static void method2846(boolean arg0) {
        if (arg0) {
            method2847(null, -115, null);
        }
        field6724 = null;
        field6739 = null;
        field6734 = null;
        field6753 = null;
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(Ltp;ILtp;)V", line = 422)
    public static final void method2847(class532 arg0, int arg1, class532 arg2) {
        class340.field4393++;
        field6717++;
        class249 var3 = class289.method1715(class283.field3447, 78, class41.field470);
        var3.field3016.method1421(arg2.field7704, arg1 ^ 0x513D);
        var3.field3016.method1444(1507430696, arg0.field7628);
        if (arg1 != -1) {
            field6724 = null;
        }
        var3.field3016.method1421(arg0.field7704, -20798);
        var3.field3016.method1444(1507430696, arg0.field7691);
        var3.field3016.method1449(arg1, arg2.field7691);
        var3.field3016.method1446(arg2.field7628, true);
        class510.method3017(var3, 69);
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(IILaa;II)V", line = 448)
    public final void method502(int arg0, int arg1, class485 arg2, int arg3, int arg4) {
        field6751++;
        class159 var6 = (class159) arg2;
        int var7 = this.field6752 + arg0;
        int var8 = this.field6736 + arg1;
        class358 var9 = var6.field1759;
        this.field6721.method155(class755.field10532, -25446);
        this.field6733.method2269(-2);
        this.field6733.method2207((byte) -61, this.field6721);
        this.field6733.method2274(1, -2);
        this.field6733.method2255(1, 15818);
        class427 var10 = this.field6733.method2263((byte) 55);
        var10.method2661((float) this.field6728, 0.0F, (byte) 60, (float) this.field6727);
        var10.method1033(var7, var8, 0);
        this.field6733.method2304(-4);
        class427 var11 = this.field6733.method2224((byte) 23);
        var11.method2661(this.field6721.method599((float) this.field6728, 110), 1.0F, (byte) 60, this.field6721.method606(13050, (float) this.field6727));
        this.field6733.method2226(class655.field9349, -104);
        this.field6733.method2217(1, 101);
        this.field6733.method2207((byte) -61, var9);
        this.field6733.method2242(-75, class372.field4752, class94.field989);
        this.field6733.method2264(0, class324.field4136, (byte) 60);
        class427 var12 = this.field6733.method2224((byte) 23);
        var12.method2661(var9.method599((float) this.field6728, -107), 1.0F, (byte) 60, var9.method606(13050, (float) this.field6727));
        var12.method2666(0.0F, var9.method606(13050, (float) (var7 - arg3)), var9.method599((float) (var8 - arg4), -90), (byte) -125);
        this.field6733.method2226(class655.field9349, -108);
        this.field6733.method2279(2);
        this.field6733.method2248((byte) -68);
        this.field6733.method2264(0, class424.field6157, (byte) 60);
        this.field6733.method2242(-104, class372.field4752, class372.field4752);
        this.field6733.method2207((byte) -61, null);
        this.field6733.method2217(0, 19);
        this.field6733.method2248((byte) -113);
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(IIII[III)V", line = 495)
    private final void method2848(int arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5, int arg6) {
        this.field6721.method605(arg5, arg2, arg6, arg1, arg4, arg0, false, arg3);
        field6729++;
    }

    @OriginalMember(owner = "client!nm", name = "b", descriptor = "()I", line = 503)
    public final int method509() {
        field6732++;
        return this.field6728;
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(IIIII)V", line = 511)
    public final void method512(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field6719++;
        class427 var6 = this.field6733.method2263((byte) 55);
        class427 var7 = this.field6733.method2224((byte) 23);
        int var8 = this.field6752 + arg0;
        int var9 = this.field6736 + arg1;
        this.field6721.method155(class755.field10532, -25446);
        this.field6733.method2269(-2);
        this.field6733.method2207((byte) -61, this.field6721);
        this.field6733.method2274(arg4, -2);
        this.field6733.method2255(arg2, 15818);
        this.field6733.method2264(1, class58.field582, (byte) 60);
        this.field6733.method2268(1, 93, class58.field582);
        this.field6733.method2257(arg3, -552);
        var6.method2661((float) this.field6728, 0.0F, (byte) 60, (float) this.field6727);
        var6.method1033(var8, var9, 0);
        var7.method2661(this.field6721.method599((float) this.field6728, -96), 1.0F, (byte) 60, this.field6721.method606(13050, (float) this.field6727));
        this.field6733.method2226(class655.field9349, -98);
        this.field6733.method2304(28);
        this.field6733.method2279(2);
        this.field6733.method2248((byte) -98);
        this.field6733.method2264(1, class324.field4136, (byte) 60);
        this.field6733.method2268(1, 48, class324.field4136);
    }

    @OriginalMember(owner = "client!nm", name = "b", descriptor = "(IIII)V", line = 546)
    public final void method511(int arg0, int arg1, int arg2, int arg3) {
        this.field6720 = arg2;
        this.field6736 = arg1;
        field6737++;
        this.field6743 = arg3;
        this.field6752 = arg0;
        this.field6748 = this.field6752 != 0 || this.field6736 != 0 || this.field6720 != 0 || this.field6743 != 0;
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(FFFFFFIIII)V", line = 572)
    public final void method506(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8, int arg9) {
        field6726++;
        class427 var11 = this.field6733.method2263((byte) 55);
        class427 var12 = this.field6733.method2224((byte) 23);
        this.field6721.method155(this.field6747 || this.field6722 || (arg9 & 0x1) == 0 ? class755.field10532 : class523.field7453, -25446);
        this.field6733.method2269(-2);
        this.field6733.method2207((byte) -61, this.field6721);
        this.field6733.method2274(arg8, -2);
        this.field6733.method2255(arg6, 15818);
        this.field6733.method2264(1, class58.field582, (byte) 60);
        this.field6733.method2268(1, 91, class58.field582);
        this.field6733.method2257(arg7, -552);
        if (this.field6748) {
            float var13 = (float) this.method501();
            float var14 = (float) this.method510();
            float var15 = (arg2 - arg0) / var13;
            float var16 = (arg3 - arg1) / var13;
            float var17 = (arg4 - arg0) / var14;
            float var18 = (arg5 - arg1) / var14;
            float var19 = (float) this.field6736 * var17;
            float var20 = (float) this.field6736 * var18;
            float var21 = (float) this.field6752 * var15;
            float var22 = (float) this.field6752 * var16;
            float var23 = (float) this.field6720 * -var15;
            float var24 = (float) this.field6720 * -var16;
            float var25 = (float) this.field6743 * -var17;
            float var26 = (float) this.field6743 * -var18;
            arg4 = arg4 + var21 + var25;
            arg3 = arg3 + var24 + var20;
            arg0 = arg0 + var21 + var19;
            arg1 = arg1 + var22 + var20;
            arg2 = arg2 + var23 + var19;
            arg5 = arg5 + var22 + var26;
        }
        var11.method2673(0.0F, 0.0F, 0.0F, 1.0F, arg4 - arg0, 0.0F, (byte) 82, arg3 - arg1, arg2 - arg0, arg5 - arg1);
        var11.method2666(0.0F, arg0, arg1, (byte) -121);
        var12.method2661(this.field6721.method599((float) this.field6728, -101), 1.0F, (byte) 60, this.field6721.method606(13050, (float) this.field6727));
        this.field6733.method2226(class655.field9349, -99);
        this.field6733.method2304(-123);
        this.field6733.method2279(2);
        this.field6733.method2248((byte) 119);
        this.field6733.method2264(1, class324.field4136, (byte) 60);
        this.field6733.method2268(1, 10, class324.field4136);
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(IIIIIIII)V", line = 639)
    public final void method505(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field6749++;
        class427 var9 = this.field6733.method2263((byte) 55);
        class427 var10 = this.field6733.method2224((byte) 23);
        this.field6721.method155(this.field6747 || this.field6722 || (arg7 & 0x1) == 0 ? class755.field10532 : class523.field7453, -25446);
        this.field6733.method2269(-2);
        this.field6733.method2207((byte) -61, this.field6721);
        this.field6733.method2274(arg6, -2);
        this.field6733.method2255(arg4, 15818);
        this.field6733.method2264(1, class58.field582, (byte) 60);
        this.field6733.method2268(1, 41, class58.field582);
        this.field6733.method2257(arg5, -552);
        var10.method2661(this.field6721.method599((float) this.field6728, 109), 1.0F, (byte) 60, this.field6721.method606(13050, (float) this.field6727));
        if (this.field6748) {
            arg2 = this.field6727 * arg2 / this.method501();
            arg3 = this.field6728 * arg3 / this.method510();
            arg0 += this.field6752 * arg2 / this.field6727;
            arg1 += this.field6736 * arg3 / this.field6728;
        }
        var9.method2661((float) arg3, 0.0F, (byte) 60, (float) arg2);
        var9.method1033(arg0, arg1, 0);
        this.field6733.method2226(class655.field9349, -121);
        this.field6733.method2304(5);
        this.field6733.method2279(2);
        this.field6733.method2248((byte) -121);
        this.field6733.method2264(1, class324.field4136, (byte) 60);
        this.field6733.method2268(1, 55, class324.field4136);
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(IIIIII)V", line = 682)
    public final void method826(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field6725++;
        int[] var7 = this.field6733.method356(arg4, arg5, arg2, arg3);
        if (var7 != null) {
            for (int var8 = 0; var8 < var7.length; var8++) {
                var7[var8] = class695.method3919(var7[var8], -16777216);
            }
            this.method2848(arg0, arg1, arg2, arg3, var7, 0, arg2);
        }
    }

    @OriginalMember(owner = "client!nm", name = "d", descriptor = "()I", line = 720)
    public final int method503() {
        field6723++;
        return this.field6727;
    }
}
