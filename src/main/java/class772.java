import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kn")
public class class772 extends class296 {

    @OriginalMember(owner = "client!kn", name = "y", descriptor = "I")
    private int field10686 = -1;

    @OriginalMember(owner = "client!kn", name = "o", descriptor = "Lut;")
    private class136 field10676;

    @OriginalMember(owner = "client!kn", name = "l", descriptor = "I")
    private int field10673;

    @OriginalMember(owner = "client!kn", name = "C", descriptor = "[[B")
    private byte[][] field10690;

    @OriginalMember(owner = "client!kn", name = "t", descriptor = "[[B")
    private byte[][] field10681;

    @OriginalMember(owner = "client!kn", name = "j", descriptor = "F")
    private float field10671;

    @OriginalMember(owner = "client!kn", name = "k", descriptor = "F")
    private float field10672;

    @OriginalMember(owner = "client!kn", name = "n", descriptor = "F")
    private float field10675;

    @OriginalMember(owner = "client!kn", name = "q", descriptor = "F")
    private float field10678;

    @OriginalMember(owner = "client!kn", name = "r", descriptor = "F")
    private float field10679;

    @OriginalMember(owner = "client!kn", name = "u", descriptor = "F")
    private float field10682;

    @OriginalMember(owner = "client!kn", name = "v", descriptor = "F")
    private float field10683;

    @OriginalMember(owner = "client!kn", name = "w", descriptor = "F")
    private float field10684;

    @OriginalMember(owner = "client!kn", name = "x", descriptor = "F")
    private float field10685;

    @OriginalMember(owner = "client!kn", name = "z", descriptor = "F")
    private float field10687;

    @OriginalMember(owner = "client!kn", name = "B", descriptor = "F")
    private float field10689;

    @OriginalMember(owner = "client!kn", name = "D", descriptor = "F")
    private float field10691;

    @OriginalMember(owner = "client!kn", name = "m", descriptor = "[[Lgg;")
    private class188[][] field10674;

    @OriginalMember(owner = "client!kn", name = "A", descriptor = "[[Leo;")
    private class314[][] field10688;

    @OriginalMember(owner = "client!kn", name = "i", descriptor = "[[Lit;")
    private class674[][] field10670;

    @OriginalMember(owner = "client!kn", name = "p", descriptor = "[[Lpea;")
    private class756[][] field10677;

    @OriginalMember(owner = "client!kn", name = "s", descriptor = "[[Lkca;")
    private class91[][] field10680;

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(III[[ZZI)V", line = 9)
    public final void method1895(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5) {
        class690 var7 = this.field10676.field2309;
        this.field10686 = -1;
        this.field10682 = var7.field9589;
        this.field10691 = var7.field9582;
        this.field10675 = var7.field9575;
        this.field10685 = var7.field9571;
        this.field10683 = var7.field9580;
        this.field10671 = var7.field9579;
        this.field10678 = var7.field9567;
        this.field10679 = var7.field9585;
        this.field10687 = var7.field9577;
        this.field10672 = var7.field9566;
        this.field10684 = var7.field9588;
        this.field10689 = var7.field9564;
        for (int var8 = 0; var8 < arg2 + arg2; ++var8) {
            for (int var9 = 0; var9 < arg2 + arg2; ++var9) {
                if (arg3[var8][var9]) {
                    int var10 = arg0 - arg2 + var8;
                    int var11 = arg1 - arg2 + var9;
                    if (var10 >= 0 && var10 < super.field4037 && var11 >= 0 && var11 < super.field4034) {
                        this.method4249(var10, var11, arg5);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!kn", name = "YA", descriptor = "()V", line = 53)
    public final void method1905() {
        this.field10690 = null;
        this.field10681 = null;
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(III[[ZZII)V", line = 59)
    public final void method1906(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5, int arg6) {
        class690 var8 = this.field10676.field2309;
        this.field10686 = arg5;
        this.field10682 = var8.field9589;
        this.field10691 = var8.field9582;
        this.field10675 = var8.field9575;
        this.field10685 = var8.field9571;
        this.field10683 = var8.field9580;
        this.field10671 = var8.field9579;
        this.field10678 = var8.field9567;
        this.field10679 = var8.field9585;
        this.field10687 = var8.field9577;
        this.field10672 = var8.field9566;
        this.field10684 = var8.field9588;
        this.field10689 = var8.field9564;
        for (int var9 = 0; var9 < arg2 + arg2; ++var9) {
            for (int var10 = 0; var10 < arg2 + arg2; ++var10) {
                if (arg3[var9][var10]) {
                    int var11 = arg0 - arg2 + var9;
                    int var12 = arg1 - arg2 + var10;
                    if (var11 >= 0 && var11 < super.field4037 && var12 >= 0 && var12 < super.field4034) {
                        this.method4249(var11, var12, arg6);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(I)Z", line = 103)
    private final boolean method4246(int arg0) {
        if ((this.field10673 & 8) == 0) {
            return false;
        } else if (arg0 == 4) {
            return true;
        } else if (arg0 == 8) {
            return true;
        } else {
            return arg0 == 9;
        }
    }

    @OriginalMember(owner = "client!kn", name = "CA", descriptor = "(Lr;IIIIZ)V", line = 119)
    public final void method1902(class196 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(Lbq;[I)V", line = 123)
    public final void method1900(class307 arg0, int[] arg1) {
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(IILjp;[I[I[I[II)V", line = 130)
    private final void method4247(int arg0, int arg1, class376 arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int arg7) {
        class188 var9 = this.field10674[arg0][arg1];
        if (var9 != null) {
            if ((var9.field2895 & 2) == 0) {
                if (arg7 != 0) {
                    if ((var9.field2895 & 4) != 0) {
                        if ((arg7 & 1) != 0) {
                            return;
                        }
                    } else if ((arg7 & 2) != 0) {
                        return;
                    }
                }
                int var10 = super.field4035 * arg0;
                int var11 = super.field4035 + var10;
                int var12 = super.field4035 * arg1;
                int var13 = super.field4035 + var12;
                float var16;
                float var17;
                float var18;
                float var19;
                int var23;
                int var25;
                int var27;
                int var29;
                int var31;
                int var33;
                int var35;
                int var37;
                if ((var9.field2895 & 1) != 0) {
                    int var14 = super.field4041[arg0][arg1];
                    float var15 = (float) var14 * this.field10672;
                    if (this.field10686 == -1) {
                        var16 = (float) var12 * this.field10684 + (float) var10 * this.field10687 + var15 + this.field10689;
                        if (var16 <= (float) this.field10676.field2328) {
                            return;
                        }
                        var17 = (float) var12 * this.field10684 + (float) var11 * this.field10687 + var15 + this.field10689;
                        if (var17 <= (float) this.field10676.field2328) {
                            return;
                        }
                        var18 = (float) var13 * this.field10684 + (float) var11 * this.field10687 + var15 + this.field10689;
                        if (var18 <= (float) this.field10676.field2328) {
                            return;
                        }
                        var19 = (float) var13 * this.field10684 + (float) var10 * this.field10687 + var15 + this.field10689;
                        if (var19 <= (float) this.field10676.field2328) {
                            return;
                        }
                    } else {
                        var16 = (float) var12 * this.field10684 + (float) var10 * this.field10687 + var15 + this.field10689;
                        var17 = (float) var12 * this.field10684 + (float) var11 * this.field10687 + var15 + this.field10689;
                        var18 = (float) var13 * this.field10684 + (float) var11 * this.field10687 + var15 + this.field10689;
                        var19 = (float) var13 * this.field10684 + (float) var10 * this.field10687 + var15 + this.field10689;
                    }
                    float var20 = (float) var14 * this.field10691;
                    float var21 = (float) var14 * this.field10671;
                    if (this.field10686 == -1) {
                        float var22 = (float) var12 * this.field10675 + (float) var10 * this.field10682 + var20 + this.field10685;
                        var23 = (int) ((float) this.field10676.field2317 * var22 / var16) + arg2.field5100;
                        float var24 = (float) var12 * this.field10678 + (float) var10 * this.field10683 + var21 + this.field10679;
                        var25 = (int) ((float) this.field10676.field2306 * var24 / var16) + arg2.field5102;
                        float var26 = (float) var12 * this.field10675 + (float) var11 * this.field10682 + var20 + this.field10685;
                        var27 = (int) ((float) this.field10676.field2317 * var26 / var17) + arg2.field5100;
                        float var28 = (float) var12 * this.field10678 + (float) var11 * this.field10683 + var21 + this.field10679;
                        var29 = (int) ((float) this.field10676.field2306 * var28 / var17) + arg2.field5102;
                        float var30 = (float) var13 * this.field10675 + (float) var11 * this.field10682 + var20 + this.field10685;
                        var31 = (int) ((float) this.field10676.field2317 * var30 / var18) + arg2.field5100;
                        float var32 = (float) var13 * this.field10678 + (float) var11 * this.field10683 + var21 + this.field10679;
                        var33 = (int) ((float) this.field10676.field2306 * var32 / var18) + arg2.field5102;
                        float var34 = (float) var13 * this.field10675 + (float) var10 * this.field10682 + var20 + this.field10685;
                        var35 = (int) ((float) this.field10676.field2317 * var34 / var19) + arg2.field5100;
                        float var36 = (float) var13 * this.field10678 + (float) var10 * this.field10683 + var21 + this.field10679;
                        var37 = (int) ((float) this.field10676.field2306 * var36 / var19) + arg2.field5102;
                    } else {
                        float var38 = (float) var12 * this.field10675 + (float) var10 * this.field10682 + var20 + this.field10685;
                        var23 = (int) ((float) this.field10676.field2317 * var38 / (float) this.field10686) + arg2.field5100;
                        float var39 = (float) var12 * this.field10678 + (float) var10 * this.field10683 + var21 + this.field10679;
                        var25 = (int) ((float) this.field10676.field2306 * var39 / (float) this.field10686) + arg2.field5102;
                        float var40 = (float) var12 * this.field10675 + (float) var11 * this.field10682 + var20 + this.field10685;
                        var27 = (int) ((float) this.field10676.field2317 * var40 / (float) this.field10686) + arg2.field5100;
                        float var41 = (float) var12 * this.field10678 + (float) var11 * this.field10683 + var21 + this.field10679;
                        var29 = (int) ((float) this.field10676.field2306 * var41 / (float) this.field10686) + arg2.field5102;
                        float var42 = (float) var13 * this.field10675 + (float) var11 * this.field10682 + var20 + this.field10685;
                        var31 = (int) ((float) this.field10676.field2317 * var42 / (float) this.field10686) + arg2.field5100;
                        float var43 = (float) var13 * this.field10678 + (float) var11 * this.field10683 + var21 + this.field10679;
                        var33 = (int) ((float) this.field10676.field2306 * var43 / (float) this.field10686) + arg2.field5102;
                        float var44 = (float) var13 * this.field10675 + (float) var10 * this.field10682 + var20 + this.field10685;
                        var35 = (int) ((float) this.field10676.field2317 * var44 / (float) this.field10686) + arg2.field5100;
                        float var45 = (float) var13 * this.field10678 + (float) var10 * this.field10683 + var21 + this.field10679;
                        var37 = (int) ((float) this.field10676.field2306 * var45 / (float) this.field10686) + arg2.field5102;
                    }
                } else {
                    int var46 = super.field4041[arg0][arg1];
                    int var47 = super.field4041[arg0 + 1][arg1];
                    int var48 = super.field4041[arg0 + 1][arg1 + 1];
                    int var49 = super.field4041[arg0][arg1 + 1];
                    if (this.field10686 == -1) {
                        var16 = (float) var12 * this.field10684 + (float) var10 * this.field10687 + (float) var46 * this.field10672 + this.field10689;
                        if (var16 <= (float) this.field10676.field2328) {
                            return;
                        }
                        var17 = (float) var12 * this.field10684 + (float) var11 * this.field10687 + (float) var47 * this.field10672 + this.field10689;
                        if (var17 <= (float) this.field10676.field2328) {
                            return;
                        }
                        var18 = (float) var13 * this.field10684 + (float) var11 * this.field10687 + (float) var48 * this.field10672 + this.field10689;
                        if (var18 <= (float) this.field10676.field2328) {
                            return;
                        }
                        var19 = (float) var13 * this.field10684 + (float) var10 * this.field10687 + (float) var49 * this.field10672 + this.field10689;
                        if (var19 <= (float) this.field10676.field2328) {
                            return;
                        }
                        float var50 = (float) var12 * this.field10675 + (float) var10 * this.field10682 + (float) var46 * this.field10691 + this.field10685;
                        var23 = (int) ((float) this.field10676.field2317 * var50 / var16) + arg2.field5100;
                        float var51 = (float) var12 * this.field10678 + (float) var10 * this.field10683 + (float) var46 * this.field10671 + this.field10679;
                        var25 = (int) ((float) this.field10676.field2306 * var51 / var16) + arg2.field5102;
                        float var52 = (float) var12 * this.field10675 + (float) var11 * this.field10682 + (float) var47 * this.field10691 + this.field10685;
                        var27 = (int) ((float) this.field10676.field2317 * var52 / var17) + arg2.field5100;
                        float var53 = (float) var12 * this.field10678 + (float) var11 * this.field10683 + (float) var47 * this.field10671 + this.field10679;
                        var29 = (int) ((float) this.field10676.field2306 * var53 / var17) + arg2.field5102;
                        float var54 = (float) var13 * this.field10675 + (float) var11 * this.field10682 + (float) var48 * this.field10691 + this.field10685;
                        var31 = (int) ((float) this.field10676.field2317 * var54 / var18) + arg2.field5100;
                        float var55 = (float) var13 * this.field10678 + (float) var11 * this.field10683 + (float) var48 * this.field10671 + this.field10679;
                        var33 = (int) ((float) this.field10676.field2306 * var55 / var18) + arg2.field5102;
                        float var56 = (float) var13 * this.field10675 + (float) var10 * this.field10682 + (float) var49 * this.field10691 + this.field10685;
                        var35 = (int) ((float) this.field10676.field2317 * var56 / var19) + arg2.field5100;
                        float var57 = (float) var13 * this.field10678 + (float) var10 * this.field10683 + (float) var49 * this.field10671 + this.field10679;
                        var37 = (int) ((float) this.field10676.field2306 * var57 / var19) + arg2.field5102;
                    } else {
                        var16 = (float) var12 * this.field10684 + (float) var10 * this.field10687 + (float) var46 * this.field10672 + this.field10689;
                        var17 = (float) var12 * this.field10684 + (float) var11 * this.field10687 + (float) var47 * this.field10672 + this.field10689;
                        var18 = (float) var13 * this.field10684 + (float) var11 * this.field10687 + (float) var48 * this.field10672 + this.field10689;
                        var19 = (float) var13 * this.field10684 + (float) var10 * this.field10687 + (float) var49 * this.field10672 + this.field10689;
                        float var58 = (float) var12 * this.field10675 + (float) var10 * this.field10682 + (float) var46 * this.field10691 + this.field10685;
                        var23 = (int) ((float) this.field10676.field2317 * var58 / (float) this.field10686) + arg2.field5100;
                        float var59 = (float) var12 * this.field10678 + (float) var10 * this.field10683 + (float) var46 * this.field10671 + this.field10679;
                        var25 = (int) ((float) this.field10676.field2306 * var59 / (float) this.field10686) + arg2.field5102;
                        float var60 = (float) var12 * this.field10675 + (float) var11 * this.field10682 + (float) var47 * this.field10691 + this.field10685;
                        var27 = (int) ((float) this.field10676.field2317 * var60 / (float) this.field10686) + arg2.field5100;
                        float var61 = (float) var12 * this.field10678 + (float) var11 * this.field10683 + (float) var47 * this.field10671 + this.field10679;
                        var29 = (int) ((float) this.field10676.field2306 * var61 / (float) this.field10686) + arg2.field5102;
                        float var62 = (float) var13 * this.field10675 + (float) var11 * this.field10682 + (float) var48 * this.field10691 + this.field10685;
                        var31 = (int) ((float) this.field10676.field2317 * var62 / (float) this.field10686) + arg2.field5100;
                        float var63 = (float) var13 * this.field10678 + (float) var11 * this.field10683 + (float) var48 * this.field10671 + this.field10679;
                        var33 = (int) ((float) this.field10676.field2306 * var63 / (float) this.field10686) + arg2.field5102;
                        float var64 = (float) var13 * this.field10675 + (float) var10 * this.field10682 + (float) var49 * this.field10691 + this.field10685;
                        var35 = (int) ((float) this.field10676.field2317 * var64 / (float) this.field10686) + arg2.field5100;
                        float var65 = (float) var13 * this.field10678 + (float) var10 * this.field10683 + (float) var49 * this.field10671 + this.field10679;
                        var37 = (int) ((float) this.field10676.field2306 * var65 / (float) this.field10686) + arg2.field5102;
                    }
                }
                if (this.field10686 == -1) {
                    if ((var29 - var37) * (var31 - var35) - (var27 - var35) * (var33 - var37) > 0) {
                        arg2.field5096 = var31 < 0 || var35 < 0 || var27 < 0 || var31 > arg2.field5093 || var35 > arg2.field5093 || var27 > arg2.field5093;
                        if (var9.field2896 >= 0) {
                            arg2.method2280((float) var33, (float) var37, (float) var29, (float) var31, (float) var35, (float) var27, var18, var19, var17, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, -16777216 | class624.field8692[var9.field2897 & 65535] & 16777215, -16777216 | class624.field8692[var9.field2899 & 65535] & 16777215, -16777216 | class624.field8692[var9.field2898 & 65535] & 16777215, 0, 0, 0, 0, var9.field2896);
                        } else {
                            arg2.method2283((float) var33, (float) var37, (float) var29, (float) var31, (float) var35, (float) var27, (float) ((int) var18), (float) ((int) var19), (float) ((int) var17), (float) (var9.field2897 & 65535), (float) (var9.field2899 & 65535), (float) (var9.field2898 & 65535));
                        }
                    }
                    if ((var23 - var27) * (var37 - var29) - (var25 - var29) * (var35 - var27) > 0) {
                        arg2.field5096 = var23 < 0 || var27 < 0 || var35 < 0 || var23 > arg2.field5093 || var27 > arg2.field5093 || var35 > arg2.field5093;
                        if (var9.field2896 >= 0) {
                            arg2.method2280((float) var25, (float) var29, (float) var37, (float) var23, (float) var27, (float) var35, var16, var17, var19, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, -16777216 | class624.field8692[var9.field2894 & 65535] & 16777215, -16777216 | class624.field8692[var9.field2898 & 65535] & 16777215, -16777216 | class624.field8692[var9.field2899 & 65535] & 16777215, 0, 0, 0, 0, var9.field2896);
                            return;
                        }
                        arg2.method2283((float) var25, (float) var29, (float) var37, (float) var23, (float) var27, (float) var35, (float) ((int) var16), (float) ((int) var17), (float) ((int) var19), (float) (var9.field2894 & 65535), (float) (var9.field2898 & 65535), (float) (var9.field2899 & 65535));
                        return;
                    }
                } else {
                    if ((var29 - var37) * (var31 - var35) - (var27 - var35) * (var33 - var37) > 0) {
                        arg2.field5096 = var31 < 0 || var35 < 0 || var27 < 0 || var31 > arg2.field5093 || var35 > arg2.field5093 || var27 > arg2.field5093;
                        if (var9.field2896 >= 0) {
                            arg2.method2280((float) var33, (float) var37, (float) var29, (float) var31, (float) var35, (float) var27, var18, var19, var17, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, -16777216 | class624.field8692[var9.field2897 & 65535] & 16777215, -16777216 | class624.field8692[var9.field2899 & 65535] & 16777215, -16777216 | class624.field8692[var9.field2898 & 65535] & 16777215, 0, 0, 0, 0, var9.field2896);
                        } else {
                            arg2.method2283((float) var33, (float) var37, (float) var29, (float) var31, (float) var35, (float) var27, (float) ((int) var18), (float) ((int) var19), (float) ((int) var17), (float) (var9.field2897 & 65535), (float) (var9.field2899 & 65535), (float) (var9.field2898 & 65535));
                        }
                    }
                    if ((var23 - var27) * (var37 - var29) - (var25 - var29) * (var35 - var27) > 0) {
                        arg2.field5096 = var23 < 0 || var27 < 0 || var35 < 0 || var23 > arg2.field5093 || var27 > arg2.field5093 || var35 > arg2.field5093;
                        if (var9.field2896 >= 0) {
                            arg2.method2280((float) var25, (float) var29, (float) var37, (float) var23, (float) var27, (float) var35, var16, var17, var19, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, -16777216 | class624.field8692[var9.field2894 & 65535] & 16777215, -16777216 | class624.field8692[var9.field2898 & 65535] & 16777215, -16777216 | class624.field8692[var9.field2899 & 65535] & 16777215, 0, 0, 0, 0, var9.field2896);
                            return;
                        }
                        arg2.method2283((float) var25, (float) var29, (float) var37, (float) var23, (float) var27, (float) var35, (float) ((int) var16), (float) ((int) var17), (float) ((int) var19), (float) (var9.field2894 & 65535), (float) (var9.field2898 & 65535), (float) (var9.field2899 & 65535));
                    }
                }
            }
        } else {
            class314 var66 = this.field10688[arg0][arg1];
            if (var66 != null) {
                if (arg7 != 0) {
                    if ((var66.field4299 & 4) != 0) {
                        if ((arg7 & 1) != 0) {
                            return;
                        }
                    } else if ((arg7 & 2) != 0) {
                        return;
                    }
                }
                if (this.field10686 == -1) {
                    for (int var67 = 0; var67 < var66.field4301; ++var67) {
                        int var68 = (arg0 << super.field4036) + var66.field4298[var67];
                        short var69 = var66.field4295[var67];
                        int var70 = (arg1 << super.field4036) + var66.field4303[var67];
                        float var71 = (float) var70 * this.field10684 + (float) var68 * this.field10687 + (float) var69 * this.field10672 + this.field10689;
                        if (var71 <= (float) this.field10676.field2328) {
                            return;
                        }
                        float var72 = (float) var70 * this.field10675 + (float) var68 * this.field10682 + (float) var69 * this.field10691 + this.field10685;
                        float var73 = (float) var70 * this.field10678 + (float) var68 * this.field10683 + (float) var69 * this.field10671 + this.field10679;
                        arg3[var67] = (int) ((float) this.field10676.field2317 * var72 / var71) + arg2.field5100;
                        arg4[var67] = (int) ((float) this.field10676.field2306 * var73 / var71) + arg2.field5102;
                        arg5[var67] = (int) var71;
                    }
                } else {
                    for (int var74 = 0; var74 < var66.field4301; ++var74) {
                        int var110 = (arg0 << super.field4036) + var66.field4298[var74];
                        short var111 = var66.field4295[var74];
                        int var112 = (arg1 << super.field4036) + var66.field4303[var74];
                        float var113 = (float) var112 * this.field10684 + (float) var110 * this.field10687 + (float) var111 * this.field10672 + this.field10689;
                        float var114 = (float) var112 * this.field10675 + (float) var110 * this.field10682 + (float) var111 * this.field10691 + this.field10685;
                        float var115 = (float) var112 * this.field10678 + (float) var110 * this.field10683 + (float) var111 * this.field10671 + this.field10679;
                        arg3[var74] = (int) ((float) this.field10676.field2317 * var114 / (float) this.field10686) + arg2.field5100;
                        arg4[var74] = (int) ((float) this.field10676.field2306 * var115 / (float) this.field10686) + arg2.field5102;
                        arg5[var74] = (int) var113;
                    }
                }
                if (var66.field4300 != null) {
                    if (this.field10686 == -1) {
                        for (int var75 = 0; var75 < var66.field4292; ++var75) {
                            short var76 = var66.field4290[var75];
                            short var77 = var66.field4294[var75];
                            short var78 = var66.field4296[var75];
                            int var79 = arg3[var76];
                            int var80 = arg3[var77];
                            int var81 = arg3[var78];
                            int var82 = arg4[var76];
                            int var83 = arg4[var77];
                            int var84 = arg4[var78];
                            if ((var79 - var80) * (var84 - var83) - (var81 - var80) * (var82 - var83) > 0) {
                                arg2.field5096 = var79 < 0 || var80 < 0 || var81 < 0 || var79 > arg2.field5093 || var80 > arg2.field5093 || var81 > arg2.field5093;
                                short var85 = var66.field4300[var75];
                                if (var85 != -1) {
                                    arg2.method2280((float) var82, (float) var83, (float) var84, (float) var79, (float) var80, (float) var81, (float) arg5[var76], (float) arg5[var77], (float) arg5[var78], (float) var66.field4298[var76] / (float) super.field4035, (float) var66.field4298[var77] / (float) super.field4035, (float) var66.field4298[var78] / (float) super.field4035, (float) var66.field4303[var76] / (float) super.field4035, (float) var66.field4303[var77] / (float) super.field4035, (float) var66.field4303[var78] / (float) super.field4035, -16777216 | class624.field8692[var66.field4293[var76] & 65535] & 16777215, -16777216 | class624.field8692[var66.field4293[var77] & 65535] & 16777215, -16777216 | class624.field8692[var66.field4293[var78] & 65535] & 16777215, 0, 0, 0, 0, var85);
                                } else {
                                    int var86 = var66.field4302[var75];
                                    if (var86 != -1) {
                                        arg2.method2283((float) var82, (float) var83, (float) var84, (float) var79, (float) var80, (float) var81, (float) arg5[var76], (float) arg5[var77], (float) arg5[var78], (float) class7.method51(false, var66.field4293[var76], var86), (float) class7.method51(false, var66.field4293[var77], var86), (float) class7.method51(false, var66.field4293[var78], var86));
                                    }
                                }
                            }
                        }
                        return;
                    }
                    for (int var87 = 0; var87 < var66.field4292; ++var87) {
                        short var88 = var66.field4290[var87];
                        short var89 = var66.field4294[var87];
                        short var90 = var66.field4296[var87];
                        int var91 = arg3[var88];
                        int var92 = arg3[var89];
                        int var93 = arg3[var90];
                        int var94 = arg4[var88];
                        int var95 = arg4[var89];
                        int var96 = arg4[var90];
                        if ((var91 - var92) * (var96 - var95) - (var93 - var92) * (var94 - var95) > 0) {
                            arg2.field5096 = var91 < 0 || var92 < 0 || var93 < 0 || var91 > arg2.field5093 || var92 > arg2.field5093 || var93 > arg2.field5093;
                            short var97 = var66.field4300[var87];
                            if (var97 != -1) {
                                arg2.method2280((float) var94, (float) var95, (float) var96, (float) var91, (float) var92, (float) var93, (float) arg5[var88], (float) arg5[var89], (float) arg5[var90], (float) var66.field4298[var88] / (float) super.field4035, (float) var66.field4298[var89] / (float) super.field4035, (float) var66.field4298[var90] / (float) super.field4035, (float) var66.field4303[var88] / (float) super.field4035, (float) var66.field4303[var89] / (float) super.field4035, (float) var66.field4303[var90] / (float) super.field4035, -16777216 | class624.field8692[var66.field4293[var88] & 65535] & 16777215, -16777216 | class624.field8692[var66.field4293[var89] & 65535] & 16777215, -16777216 | class624.field8692[var66.field4293[var90] & 65535] & 16777215, 0, 0, 0, 0, var97);
                            } else {
                                int var98 = var66.field4302[var87];
                                if (var98 != -1) {
                                    arg2.method2283((float) var94, (float) var95, (float) var96, (float) var91, (float) var92, (float) var93, (float) arg5[var88], (float) arg5[var89], (float) arg5[var90], (float) class7.method51(false, var66.field4293[var88], var98), (float) class7.method51(false, var66.field4293[var89], var98), (float) class7.method51(false, var66.field4293[var90], var98));
                                }
                            }
                        }
                    }
                    return;
                }
                for (int var99 = 0; var99 < var66.field4292; ++var99) {
                    short var100 = var66.field4290[var99];
                    short var101 = var66.field4294[var99];
                    short var102 = var66.field4296[var99];
                    int var103 = arg3[var100];
                    int var104 = arg3[var101];
                    int var105 = arg3[var102];
                    int var106 = arg4[var100];
                    int var107 = arg4[var101];
                    int var108 = arg4[var102];
                    if ((var103 - var104) * (var108 - var107) - (var105 - var104) * (var106 - var107) > 0) {
                        int var109 = var66.field4302[var99];
                        if (var109 != -1) {
                            arg2.field5096 = var103 < 0 || var104 < 0 || var105 < 0 || var103 > arg2.field5093 || var104 > arg2.field5093 || var105 > arg2.field5093;
                            arg2.method2283((float) var106, (float) var107, (float) var108, (float) var103, (float) var104, (float) var105, (float) arg5[var100], (float) arg5[var101], (float) arg5[var102], (float) class7.method51(false, var66.field4293[var100], var109), (float) class7.method51(false, var66.field4293[var101], var109), (float) class7.method51(false, var66.field4293[var102], var109));
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!kn", name = "U", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V", line = 607)
    public final void method1896(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13) {
        boolean var15 = (this.field10673 & 32) == 0;
        if (this.field10680 == null && !var15) {
            this.field10680 = new class91[super.field4037][super.field4034];
            this.field10677 = new class756[super.field4037][super.field4034];
        } else if (this.field10670 == null && var15) {
            this.field10670 = new class674[super.field4037][super.field4034];
        } else if (this.field10674 != null) {
            throw new IllegalStateException();
        }
        if (arg2 != null && arg2.length != 0) {
            for (int var16 = 0; var16 < arg6.length; ++var16) {
                if (arg6[var16] == -1) {
                    arg6[var16] = 0;
                } else {
                    arg6[var16] = class624.field8692[class752.method4172(arg6[var16], 1474149255) & 65535] << 8 | 255;
                }
            }
            if (arg7 != null) {
                for (int var17 = 0; var17 < arg7.length; ++var17) {
                    if (arg7[var17] == -1) {
                        arg7[var17] = 0;
                    } else {
                        arg7[var17] = class624.field8692[class752.method4172(arg7[var17], 1474149255) & 65535] << 8 | 255;
                    }
                }
            }
            if (var15) {
                class674 var18 = new class674();
                var18.field9355 = (short) arg2.length;
                var18.field9349 = (short) (arg2.length / 3);
                var18.field9359 = new short[var18.field9355];
                var18.field9353 = new short[var18.field9355];
                var18.field9351 = new short[var18.field9355];
                var18.field9357 = new int[var18.field9355];
                var18.field9350 = new short[var18.field9355];
                var18.field9352 = new short[var18.field9355];
                var18.field9358 = new byte[var18.field9355];
                if (arg5 != null) {
                    var18.field9356 = new short[var18.field9355];
                }
                for (int var19 = 0; var19 < var18.field9355; ++var19) {
                    int var22 = arg2[var19];
                    int var23 = arg4[var19];
                    boolean var24 = false;
                    int var25;
                    if (var22 == 0 && var23 == 0) {
                        var25 = this.field10690[arg0][arg1] - this.field10681[arg0][arg1];
                    } else if (var22 == 0 && super.field4035 == var23) {
                        var25 = this.field10690[arg0][arg1 + 1] - this.field10681[arg0][arg1 + 1];
                    } else if (super.field4035 == var22 && super.field4035 == var23) {
                        var25 = this.field10690[arg0 + 1][arg1 + 1] - this.field10681[arg0 + 1][arg1 + 1];
                    } else if (super.field4035 == var22 && var23 == 0) {
                        var25 = this.field10690[arg0 + 1][arg1] - this.field10681[arg0 + 1][arg1];
                    } else {
                        int var26 = (this.field10690[arg0 + 1][arg1] - this.field10681[arg0 + 1][arg1]) * var22 + (this.field10690[arg0][arg1] - this.field10681[arg0][arg1]) * (super.field4035 - var22);
                        int var27 = (this.field10690[arg0 + 1][arg1 + 1] - this.field10681[arg0 + 1][arg1 + 1]) * var22 + (this.field10690[arg0][arg1 + 1] - this.field10681[arg0][arg1 + 1]) * (super.field4035 - var22);
                        var25 = (super.field4035 - var23) * var26 + var23 * var27 >> super.field4036 * 2;
                    }
                    int var28 = (arg0 << super.field4036) + var22;
                    int var29 = (arg1 << super.field4036) + var23;
                    var18.field9359[var19] = (short) var22;
                    var18.field9351[var19] = (short) var23;
                    var18.field9353[var19] = (short) (this.method1907(var28, (byte) 125, var29) + (arg3 != null ? arg3[var19] : 0));
                    if (var25 < 0) {
                        var25 = 0;
                    }
                    if (arg6[var19] == 0) {
                        var18.field9357[var19] = 0;
                        if (arg7 != null) {
                            var18.field9358[var19] = (byte) var25;
                        }
                    } else {
                        int var30 = 0;
                        if (arg5 != null) {
                            short var31 = var18.field9356[var19] = (short) arg5[var19];
                            if (arg11 != 0) {
                                var30 = var31 * 255 / arg11;
                                if (var30 < 0) {
                                    var30 = 0;
                                } else if (var30 > 255) {
                                    var30 = 255;
                                }
                            }
                        }
                        int var32 = -16777216;
                        if (arg8[var19] != -1 && this.method4246(this.field10676.field970.method1270(arg8[var19], true).field4250)) {
                            var32 = -1694498816;
                        }
                        var18.field9357[var19] = var32 | class580.method3337(arg10, method4253(arg6[var19] >> 8, var25), var30, -16711936);
                        if (arg7 != null) {
                            var18.field9358[var19] = (byte) var25;
                        }
                    }
                    var18.field9350[var19] = (short) arg8[var19];
                    var18.field9352[var19] = (short) arg9[var19];
                }
                if (arg7 != null) {
                    var18.field9354 = new int[var18.field9349];
                }
                for (int var20 = 0; var20 < var18.field9349; ++var20) {
                    int var21 = var20 * 3;
                    if (arg7 != null && arg7[var21] != 0) {
                        var18.field9354[var20] = -16777216 | arg7[var21] >> 8;
                    }
                }
                this.field10670[arg0][arg1] = var18;
            } else {
                boolean var33 = true;
                int var34 = -1;
                int var35 = -1;
                int var36 = -1;
                int var37 = -1;
                if (arg2.length == 6) {
                    for (int var38 = 0; var38 < 6; ++var38) {
                        if (arg2[var38] == 0 && arg4[var38] == 0) {
                            if (var34 != -1 && arg6[var34] != arg6[var38]) {
                                var33 = false;
                                break;
                            }
                            var34 = var38;
                        } else if (arg2[var38] == super.field4035 && arg4[var38] == 0) {
                            if (var35 != -1 && arg6[var35] != arg6[var38]) {
                                var33 = false;
                                break;
                            }
                            var35 = var38;
                        } else if (arg2[var38] == super.field4035 && arg4[var38] == super.field4035) {
                            if (var36 != -1 && arg6[var36] != arg6[var38]) {
                                var33 = false;
                                break;
                            }
                            var36 = var38;
                        } else if (arg2[var38] == 0 && arg4[var38] == super.field4035) {
                            if (var37 != -1 && arg6[var37] != arg6[var38]) {
                                var33 = false;
                                break;
                            }
                            var37 = var38;
                        }
                    }
                    if (var34 == -1 || var35 == -1 || var36 == -1 || var37 == -1) {
                        var33 = false;
                    }
                    if (var33) {
                        if (arg3 != null) {
                            for (int var39 = 0; var39 < 4; ++var39) {
                                if (arg3[var39] != 0) {
                                    var33 = false;
                                    break;
                                }
                            }
                        }
                        if (var33) {
                            for (int var40 = 1; var40 < 4; ++var40) {
                                if (arg2[var40] != arg2[0] && arg2[0] + super.field4035 != arg2[var40] && arg2[0] - super.field4035 != arg2[var40]) {
                                    var33 = false;
                                    break;
                                }
                                if (arg4[var40] != arg4[0] && arg4[0] + super.field4035 != arg4[var40] && arg4[0] - super.field4035 != arg4[var40]) {
                                    var33 = false;
                                    break;
                                }
                            }
                        }
                    }
                } else {
                    var33 = false;
                }
                if (var33) {
                    class91 var41 = new class91();
                    int var42 = arg6[0];
                    int var43 = arg8[0];
                    if (arg7 != null) {
                        var41.field1374 = arg7[0] >> 8;
                        if (var42 == 0) {
                            var41.field1370 = (byte) (var41.field1370 | 2);
                        }
                    } else if (var42 == 0) {
                        return;
                    }
                    if (super.field4041[arg0 + 1][arg1] == super.field4041[arg0][arg1] && super.field4041[arg0 + 1][arg1 + 1] == super.field4041[arg0][arg1] && super.field4041[arg0][arg1 + 1] == super.field4041[arg0][arg1]) {
                        var41.field1370 = (byte) (var41.field1370 | 1);
                    }
                    if (var43 != -1 && (var41.field1370 & 2) == 0 && !this.field10676.field970.method1270(var43, true).field4244) {
                        int var44;
                        if (arg5 != null && arg11 != 0) {
                            var44 = arg5[var34] * 255 / arg11;
                            if (var44 < 0) {
                                var44 = 0;
                            } else if (var44 > 255) {
                                var44 = 255;
                            }
                        } else {
                            var44 = 0;
                        }
                        var41.field1378 = class580.method3337(arg10, method4253(arg6[var34] >> 8, this.field10690[arg0][arg1] - this.field10681[arg0][arg1]), var44, -16711936);
                        if (var41.field1374 != 0) {
                            var41.field1378 |= 255 - (this.field10690[arg0][arg1] - this.field10681[arg0][arg1]) << 25;
                        }
                        int var45;
                        if (arg5 != null && arg11 != 0) {
                            var45 = arg5[var35] * 255 / arg11;
                            if (var45 < 0) {
                                var45 = 0;
                            } else if (var45 > 255) {
                                var45 = 255;
                            }
                        } else {
                            var45 = 0;
                        }
                        var41.field1377 = class580.method3337(arg10, method4253(arg6[var35] >> 8, this.field10690[arg0 + 1][arg1] - this.field10681[arg0 + 1][arg1]), var45, -16711936);
                        if (var41.field1374 != 0) {
                            var41.field1377 |= 255 - (this.field10690[arg0 + 1][arg1] - this.field10681[arg0 + 1][arg1]) << 25;
                        }
                        int var46;
                        if (arg5 != null && arg11 != 0) {
                            var46 = arg5[var36] * 255 / arg11;
                            if (var46 < 0) {
                                var46 = 0;
                            } else if (var46 > 255) {
                                var46 = 255;
                            }
                        } else {
                            var46 = 0;
                        }
                        var41.field1379 = class580.method3337(arg10, method4253(arg6[var36] >> 8, this.field10690[arg0 + 1][arg1 + 1] - this.field10681[arg0 + 1][arg1 + 1]), var46, -16711936);
                        if (var41.field1374 != 0) {
                            var41.field1379 |= 255 - (this.field10690[arg0 + 1][arg1 + 1] - this.field10681[arg0 + 1][arg1 + 1]) << 25;
                        }
                        int var47;
                        if (arg5 != null && arg11 != 0) {
                            var47 = arg5[var37] * 255 / arg11;
                            if (var47 < 0) {
                                var47 = 0;
                            } else if (var47 > 255) {
                                var47 = 255;
                            }
                        } else {
                            var47 = 0;
                        }
                        var41.field1371 = class580.method3337(arg10, method4253(arg6[var37] >> 8, this.field10690[arg0][arg1 + 1] - this.field10681[arg0][arg1 + 1]), var47, -16711936);
                        var41.field1376 = (short) var43;
                    } else {
                        int var48;
                        if (arg5 != null && arg11 != 0) {
                            var48 = arg5[var34] * 255 / arg11;
                            if (var48 < 0) {
                                var48 = 0;
                            } else if (var48 > 255) {
                                var48 = 255;
                            }
                        } else {
                            var48 = 0;
                        }
                        var41.field1378 = class580.method3337(arg10, method4253(arg6[var34] >> 8, this.field10690[arg0][arg1] - this.field10681[arg0][arg1]), var48, -16711936);
                        if (var41.field1374 != 0) {
                            var41.field1378 |= 255 - (this.field10690[arg0][arg1] - this.field10681[arg0][arg1]) << 25;
                        }
                        int var49;
                        if (arg5 != null && arg11 != 0) {
                            var49 = arg5[var35] * 255 / arg11;
                            if (var49 < 0) {
                                var49 = 0;
                            } else if (var49 > 255) {
                                var49 = 255;
                            }
                        } else {
                            var49 = 0;
                        }
                        var41.field1377 = class580.method3337(arg10, method4253(arg6[var35] >> 8, this.field10690[arg0 + 1][arg1] - this.field10681[arg0 + 1][arg1]), var49, -16711936);
                        if (var41.field1374 != 0) {
                            var41.field1377 |= 255 - (this.field10690[arg0 + 1][arg1] - this.field10681[arg0 + 1][arg1]) << 25;
                        }
                        int var50;
                        if (arg5 != null && arg11 != 0) {
                            var50 = arg5[var36] * 255 / arg11;
                            if (var50 < 0) {
                                var50 = 0;
                            } else if (var50 > 255) {
                                var50 = 255;
                            }
                        } else {
                            var50 = 0;
                        }
                        var41.field1379 = class580.method3337(arg10, method4253(arg6[var36] >> 8, this.field10690[arg0 + 1][arg1 + 1] - this.field10681[arg0 + 1][arg1 + 1]), var50, -16711936);
                        if (var41.field1374 != 0) {
                            var41.field1379 |= 255 - (this.field10690[arg0 + 1][arg1 + 1] - this.field10681[arg0 + 1][arg1 + 1]) << 25;
                        }
                        int var51;
                        if (arg5 != null && arg11 != 0) {
                            var51 = arg5[var37] * 255 / arg11;
                            if (var51 < 0) {
                                var51 = 0;
                            } else if (var51 > 255) {
                                var51 = 255;
                            }
                        } else {
                            var51 = 0;
                        }
                        var41.field1371 = class580.method3337(arg10, method4253(arg6[var37] >> 8, this.field10690[arg0][arg1 + 1] - this.field10681[arg0][arg1 + 1]), var51, -16711936);
                        if (var41.field1374 != 0) {
                            var41.field1371 |= 255 - (this.field10690[arg0][arg1 + 1] - this.field10681[arg0][arg1 + 1]) << 25;
                        }
                        var41.field1376 = -1;
                    }
                    if (arg5 != null) {
                        var41.field1375 = (short) arg5[var36];
                        var41.field1372 = (short) arg5[var37];
                        var41.field1380 = (short) arg5[var35];
                        var41.field1373 = (short) arg5[var34];
                    }
                    this.field10680[arg0][arg1] = var41;
                } else {
                    class756 var52 = new class756();
                    var52.field10422 = (short) arg2.length;
                    var52.field10418 = (short) (arg2.length / 3);
                    var52.field10416 = new short[var52.field10422];
                    var52.field10417 = new short[var52.field10422];
                    var52.field10425 = new short[var52.field10422];
                    var52.field10420 = new int[var52.field10422];
                    if (arg5 != null) {
                        var52.field10424 = new short[var52.field10422];
                    }
                    for (int var53 = 0; var53 < var52.field10422; ++var53) {
                        int var68 = arg2[var53];
                        int var69 = arg4[var53];
                        boolean var70 = false;
                        int var71;
                        if (var68 == 0 && var69 == 0) {
                            var71 = this.field10690[arg0][arg1] - this.field10681[arg0][arg1];
                        } else if (var68 == 0 && super.field4035 == var69) {
                            var71 = this.field10690[arg0][arg1 + 1] - this.field10681[arg0][arg1 + 1];
                        } else if (super.field4035 == var68 && super.field4035 == var69) {
                            var71 = this.field10690[arg0 + 1][arg1 + 1] - this.field10681[arg0 + 1][arg1 + 1];
                        } else if (super.field4035 == var68 && var69 == 0) {
                            var71 = this.field10690[arg0 + 1][arg1] - this.field10681[arg0 + 1][arg1];
                        } else {
                            int var72 = (this.field10690[arg0 + 1][arg1] - this.field10681[arg0 + 1][arg1]) * var68 + (this.field10690[arg0][arg1] - this.field10681[arg0][arg1]) * (super.field4035 - var68);
                            int var73 = (this.field10690[arg0 + 1][arg1 + 1] - this.field10681[arg0 + 1][arg1 + 1]) * var68 + (this.field10690[arg0][arg1 + 1] - this.field10681[arg0][arg1 + 1]) * (super.field4035 - var68);
                            var71 = (super.field4035 - var69) * var72 + var69 * var73 >> super.field4036 * 2;
                        }
                        int var74 = (arg0 << super.field4036) + var68;
                        int var75 = (arg1 << super.field4036) + var69;
                        var52.field10416[var53] = (short) var68;
                        var52.field10425[var53] = (short) var69;
                        var52.field10417[var53] = (short) (this.method1907(var74, (byte) 118, var75) + (arg3 != null ? arg3[var53] : 0));
                        if (var71 < 0) {
                            var71 = 0;
                        }
                        if (arg6[var53] == 0) {
                            if (arg7 != null) {
                                var52.field10420[var53] = var71 << 25;
                            } else {
                                var52.field10420[var53] = 0;
                            }
                        } else {
                            int var76 = 0;
                            if (arg5 != null) {
                                short var77 = var52.field10424[var53] = (short) arg5[var53];
                                if (arg11 != 0) {
                                    var76 = var77 * 255 / arg11;
                                    if (var76 < 0) {
                                        var76 = 0;
                                    } else if (var76 > 255) {
                                        var76 = 255;
                                    }
                                }
                            }
                            var52.field10420[var53] = class580.method3337(arg10, method4253(arg6[var53] >> 8, var71), var76, -16711936);
                            if (arg7 != null) {
                                var52.field10420[var53] |= var71 << 25;
                            }
                        }
                    }
                    boolean var54 = false;
                    for (int var55 = 0; var55 < var52.field10418; ++var55) {
                        if (arg8[var55 * 3] != -1 && !this.field10676.field970.method1270(arg8[var55 * 3], true).field4244) {
                            var54 = true;
                        }
                    }
                    if (arg7 != null) {
                        var52.field10423 = new int[var52.field10418];
                    }
                    if (var54) {
                        var52.field10421 = new short[var52.field10418];
                        var52.field10426 = new short[var52.field10418];
                    }
                    for (int var56 = 0; var56 < var52.field10418; ++var56) {
                        int var57 = var56 * 3;
                        if (arg7 != null && arg7[var57] != 0) {
                            var52.field10423[var56] = arg7[var57] >> 8;
                        }
                        if (var54) {
                            int var58 = var57 + 1;
                            int var59 = var58 + 1;
                            boolean var60 = false;
                            boolean var61 = true;
                            int var62 = arg8[var57];
                            if (var62 != -1 && !this.field10676.field970.method1270(var62, true).field4244) {
                                var60 = true;
                            } else {
                                var61 = false;
                            }
                            int var63 = arg8[var58];
                            if (var63 != -1 && !this.field10676.field970.method1270(var63, true).field4244) {
                                var60 = true;
                            } else {
                                var61 = false;
                            }
                            int var64 = arg8[var59];
                            if (var64 != -1 && !this.field10676.field970.method1270(var64, true).field4244) {
                                var60 = true;
                            } else {
                                var61 = false;
                            }
                            if (var61) {
                                var52.field10421[var56] = (short) var64;
                                var52.field10426[var56] = (short) arg9[var57];
                            } else {
                                if (var60) {
                                    int var65 = arg8[var57];
                                    if (var65 != -1 && !this.field10676.field970.method1270(var65, true).field4244) {
                                        var52.field10420[var57] = class624.field8692[class752.method4172(this.field10676.field970.method1270(var65, true).field4239 & 65535, 1474149255) & 65535];
                                    }
                                    int var66 = arg8[var58];
                                    if (var66 != -1 && !this.field10676.field970.method1270(var66, true).field4244) {
                                        var52.field10420[var58] = class624.field8692[class752.method4172(this.field10676.field970.method1270(var66, true).field4239 & 65535, 1474149255) & 65535];
                                    }
                                    int var67 = arg8[var59];
                                    if (var67 != -1 && !this.field10676.field970.method1270(var67, true).field4244) {
                                        var52.field10420[var59] = class624.field8692[class752.method4172(this.field10676.field970.method1270(var67, true).field4239 & 65535, 1474149255) & 65535];
                                    }
                                }
                                var52.field10421[var56] = -1;
                            }
                        }
                    }
                    this.field10677[arg0][arg1] = var52;
                }
            }
        }
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V", line = 1304)
    public final void method1898(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16) {
        if (this.field10674 == null) {
            this.field10674 = new class188[super.field4037][super.field4034];
            this.field10688 = new class314[super.field4037][super.field4034];
        } else if (this.field10680 != null || this.field10670 != null) {
            throw new IllegalStateException();
        }
        boolean var18 = false;
        if (arg9.length == 2 && arg6.length == 2 && (arg9[0] == arg9[1] || arg11[0] != -1 && arg11[0] == arg11[1])) {
            var18 = true;
            for (int var19 = 1; var19 < 2; ++var19) {
                int var20 = arg2[arg6[var19]];
                int var21 = arg4[arg6[var19]];
                if (var20 != 0 && super.field4035 != var20 || var21 != 0 && super.field4035 != var21) {
                    var18 = false;
                    break;
                }
            }
        }
        if (!var18) {
            class314 var22 = new class314();
            short var23 = (short) arg2.length;
            short var24 = (short) arg9.length;
            var22.field4301 = var23;
            var22.field4293 = new short[var23];
            var22.field4298 = new short[var23];
            var22.field4295 = new short[var23];
            var22.field4303 = new short[var23];
            for (int var25 = 0; var25 < var23; ++var25) {
                int var32 = arg2[var25];
                int var33 = arg4[var25];
                if (var32 == 0 && var33 == 0) {
                    var22.field4293[var25] = (short) (this.field10690[arg0][arg1] - this.field10681[arg0][arg1]);
                } else if (var32 == 0 && super.field4035 == var33) {
                    var22.field4293[var25] = (short) (this.field10690[arg0][arg1 + 1] - this.field10681[arg0][arg1 + 1]);
                } else if (super.field4035 == var32 && super.field4035 == var33) {
                    var22.field4293[var25] = (short) (this.field10690[arg0 + 1][arg1 + 1] - this.field10681[arg0 + 1][arg1 + 1]);
                } else if (super.field4035 == var32 && var33 == 0) {
                    var22.field4293[var25] = (short) (this.field10690[arg0 + 1][arg1] - this.field10681[arg0 + 1][arg1]);
                } else {
                    int var34 = (this.field10690[arg0 + 1][arg1] - this.field10681[arg0 + 1][arg1]) * var32 + (this.field10690[arg0][arg1] - this.field10681[arg0][arg1]) * (super.field4035 - var32);
                    int var35 = (this.field10690[arg0 + 1][arg1 + 1] - this.field10681[arg0 + 1][arg1 + 1]) * var32 + (this.field10690[arg0][arg1 + 1] - this.field10681[arg0][arg1 + 1]) * (super.field4035 - var32);
                    var22.field4293[var25] = (short) ((super.field4035 - var33) * var34 + var33 * var35 >> super.field4036 * 2);
                }
                int var36 = (arg0 << super.field4036) + var32;
                int var37 = (arg1 << super.field4036) + var33;
                var22.field4298[var25] = (short) var32;
                var22.field4303[var25] = (short) var33;
                var22.field4295[var25] = (short) (this.method1907(var36, (byte) 102, var37) + (arg3 != null ? arg3[var25] : 0));
                if (var22.field4293[var25] < 2) {
                    var22.field4293[var25] = 2;
                }
            }
            boolean var26 = false;
            int var27 = 0;
            for (int var28 = 0; var28 < var24; ++var28) {
                if (arg9[var28] >= 0 || arg10 != null && arg10[var28] >= 0) {
                    ++var27;
                }
                int var30 = arg11[var28];
                if (var30 != -1) {
                    class311 var31 = this.field10676.field970.method1270(var30, true);
                    if (!var31.field4244) {
                        var26 = true;
                        if (this.method4246(var31.field4250) || var31.field4251 != 0 || var31.field4243 != 0) {
                            var22.field4299 = (byte) (var22.field4299 | 4);
                        }
                    }
                }
            }
            var22.field4302 = new int[var27];
            if (arg10 != null) {
                var22.field4297 = new int[var27];
            }
            var22.field4290 = new short[var27];
            var22.field4294 = new short[var27];
            var22.field4296 = new short[var27];
            if (var26) {
                var22.field4300 = new short[var27];
                var22.field4291 = new short[var27];
            }
            for (int var29 = 0; var29 < var24; ++var29) {
                if (arg9[var29] >= 0 || arg10 != null && arg10[var29] >= 0) {
                    if (arg9[var29] >= 0) {
                        var22.field4302[var22.field4292] = class752.method4172(arg9[var29], 1474149255);
                    } else {
                        var22.field4302[var22.field4292] = -1;
                    }
                    if (arg10 != null) {
                        if (arg10[var29] != -1) {
                            var22.field4297[var22.field4292] = class752.method4172(arg10[var29], 1474149255);
                        } else {
                            var22.field4297[var22.field4292] = -1;
                        }
                    }
                    var22.field4290[var22.field4292] = (short) arg6[var29];
                    var22.field4294[var22.field4292] = (short) arg7[var29];
                    var22.field4296[var22.field4292] = (short) arg8[var29];
                    if (var26) {
                        if (arg11[var29] != -1 && !this.field10676.field970.method1270(arg11[var29], true).field4244) {
                            var22.field4300[var22.field4292] = (short) arg11[var29];
                            var22.field4291[var22.field4292] = (short) arg12[var29];
                        } else {
                            var22.field4300[var22.field4292] = -1;
                        }
                    }
                    ++var22.field4292;
                }
            }
            this.field10688[arg0][arg1] = var22;
        } else {
            if (arg9[0] >= 0 || arg10 != null && arg10[0] >= 0) {
                class188 var38 = new class188();
                int var39 = arg9[0];
                int var40 = arg11[0];
                if (arg10 != null) {
                    var38.field2900 = class7.method51(false, this.field10690[arg0][arg1] - this.field10681[arg0][arg1], class752.method4172(arg10[0], 1474149255));
                    if (var39 == -1) {
                        var38.field2895 = (byte) (var38.field2895 | 2);
                    }
                }
                if (super.field4041[arg0 + 1][arg1] == super.field4041[arg0][arg1] && super.field4041[arg0 + 1][arg1 + 1] == super.field4041[arg0][arg1] && super.field4041[arg0][arg1 + 1] == super.field4041[arg0][arg1]) {
                    var38.field2895 = (byte) (var38.field2895 | 1);
                }
                class311 var41 = null;
                if (var40 != -1) {
                    var41 = this.field10676.field970.method1270(var40, true);
                }
                if (var41 != null && (var38.field2895 & 2) == 0 && !var41.field4244) {
                    var38.field2894 = (short) (this.field10690[arg0][arg1] - this.field10681[arg0][arg1]);
                    var38.field2898 = (short) (this.field10690[arg0 + 1][arg1] - this.field10681[arg0 + 1][arg1]);
                    var38.field2897 = (short) (this.field10690[arg0 + 1][arg1 + 1] - this.field10681[arg0 + 1][arg1 + 1]);
                    var38.field2899 = (short) (this.field10690[arg0][arg1 + 1] - this.field10681[arg0][arg1 + 1]);
                    var38.field2896 = (short) var40;
                    if (this.method4246(var41.field4250) || var41.field4251 != 0 || var41.field4243 != 0) {
                        var38.field2895 = (byte) (var38.field2895 | 4);
                    }
                } else {
                    short var42 = class752.method4172(var39, 1474149255);
                    var38.field2894 = (short) class7.method51(false, this.field10690[arg0][arg1] - this.field10681[arg0][arg1], var42);
                    var38.field2898 = (short) class7.method51(false, this.field10690[arg0 + 1][arg1] - this.field10681[arg0 + 1][arg1], var42);
                    var38.field2897 = (short) class7.method51(false, this.field10690[arg0 + 1][arg1 + 1] - this.field10681[arg0 + 1][arg1 + 1], var42);
                    var38.field2899 = (short) class7.method51(false, this.field10690[arg0][arg1 + 1] - this.field10681[arg0][arg1 + 1], var42);
                    var38.field2896 = -1;
                }
                this.field10674[arg0][arg1] = var38;
            }
        }
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(IIIIIII[[ZLcc;Ljp;[I[I)V", line = 1557)
    private final void method4248(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7, class762 arg8, class376 arg9, int[] arg10, int[] arg11) {
        int var13 = (arg6 - arg4) * arg2 / 256;
        int var14 = arg2 >> 8;
        boolean var15 = arg8.field10495;
        this.field10676.method557(false);
        arg9.field5097 = false;
        arg9.field5090 = false;
        int var16 = arg0;
        int var17 = arg1 + var13;
        for (int var18 = arg3; var18 < arg5; ++var18) {
            for (int var19 = arg4; var19 < arg6; ++var19) {
                if (arg7[var18 - arg3][var19 - arg4]) {
                    if (this.field10680 != null) {
                        if (this.field10680[var18][var19] != null) {
                            class91 var20 = this.field10680[var18][var19];
                            if (var20.field1376 != -1 && (var20.field1370 & 2) == 0 && var20.field1374 == 0) {
                                int var21 = this.field10676.method1118(var20.field1376);
                                arg9.method2283((float) (var17 - var14), (float) (var17 - var14), (float) var17, (float) (var14 + var16), (float) var16, (float) (var14 + var16), 100.0F, 100.0F, 100.0F, (float) class7.method51(false, var20.field1379, var21), (float) class7.method51(false, var20.field1371, var21), (float) class7.method51(false, var20.field1377, var21));
                                arg9.method2283((float) var17, (float) var17, (float) (var17 - var14), (float) var16, (float) (var14 + var16), (float) var16, 100.0F, 100.0F, 100.0F, (float) class7.method51(false, var20.field1378, var21), (float) class7.method51(false, var20.field1377, var21), (float) class7.method51(false, var20.field1371, var21));
                            } else if (var20.field1374 == 0) {
                                arg9.method2289((float) (var17 - var14), (float) (var17 - var14), (float) var17, (float) (var14 + var16), (float) var16, (float) (var14 + var16), 100.0F, 100.0F, 100.0F, var20.field1379, var20.field1371, var20.field1377);
                                arg9.method2289((float) var17, (float) var17, (float) (var17 - var14), (float) var16, (float) (var14 + var16), (float) var16, 100.0F, 100.0F, 100.0F, var20.field1378, var20.field1377, var20.field1371);
                            } else {
                                int var22 = var20.field1374;
                                arg9.method2289((float) (var17 - var14), (float) (var17 - var14), (float) var17, (float) (var14 + var16), (float) var16, (float) (var14 + var16), 100.0F, 100.0F, 100.0F, class110.method927(var20.field1379 & -16777216, 2346, var22), class110.method927(var20.field1371 & -16777216, 2346, var22), class110.method927(var20.field1377 & -16777216, 2346, var22));
                                arg9.method2289((float) var17, (float) var17, (float) (var17 - var14), (float) var16, (float) (var14 + var16), (float) var16, 100.0F, 100.0F, 100.0F, class110.method927(var20.field1378 & -16777216, 2346, var22), class110.method927(var20.field1377 & -16777216, 2346, var22), class110.method927(var20.field1371 & -16777216, 2346, var22));
                            }
                        } else if (this.field10677[var18][var19] != null) {
                            class756 var23 = this.field10677[var18][var19];
                            for (int var24 = 0; var24 < var23.field10422; ++var24) {
                                arg10[var24] = var23.field10416[var24] * var14 / super.field4035 + var16;
                                arg11[var24] = var17 - var23.field10425[var24] * var14 / super.field4035;
                            }
                            for (int var25 = 0; var25 < var23.field10418; ++var25) {
                                int var26 = var25 * 3;
                                int var27 = var26 + 1;
                                int var28 = var27 + 1;
                                int var29 = arg10[var26];
                                int var30 = arg10[var27];
                                int var31 = arg10[var28];
                                int var32 = arg11[var26];
                                int var33 = arg11[var27];
                                int var34 = arg11[var28];
                                if (var23.field10423 != null && var23.field10423[var25] != 0 && (var23.field10421 == null || var23.field10421 != null && var23.field10421[var25] == -1)) {
                                    int var35 = var23.field10423[var25];
                                    arg9.method2289((float) var32, (float) var33, (float) var34, (float) var29, (float) var30, (float) var31, 100.0F, 100.0F, 100.0F, class110.method927(-16777216 - (var23.field10420[var26] & -16777216), 2346, var35), class110.method927(-16777216 - (var23.field10420[var27] & -16777216), 2346, var35), class110.method927(-16777216 - (var23.field10420[var28] & -16777216), 2346, var35));
                                } else if (var23.field10421 != null && var23.field10421[var25] != -1) {
                                    int var36 = this.field10676.method1118(var23.field10421[var25]);
                                    arg9.method2283((float) var32, (float) var33, (float) var34, (float) var29, (float) var30, (float) var31, 100.0F, 100.0F, 100.0F, (float) var36, (float) var36, (float) var36);
                                } else {
                                    arg9.method2289((float) var32, (float) var33, (float) var34, (float) var29, (float) var30, (float) var31, 100.0F, 100.0F, 100.0F, var23.field10420[var26], var23.field10420[var27], var23.field10420[var28]);
                                }
                            }
                        }
                    } else if (this.field10670[var18][var19] != null) {
                        class674 var37 = this.field10670[var18][var19];
                        for (int var38 = 0; var38 < var37.field9355; ++var38) {
                            arg10[var38] = var37.field9359[var38] * var14 / super.field4035 + var16;
                            arg11[var38] = var17 - var37.field9351[var38] * var14 / super.field4035;
                        }
                        for (int var39 = 0; var39 < var37.field9349; ++var39) {
                            int var40 = var39 * 3;
                            int var41 = var40 + 1;
                            int var42 = var41 + 1;
                            int var43 = arg10[var40];
                            int var44 = arg10[var41];
                            int var45 = arg10[var42];
                            int var46 = arg11[var40];
                            int var47 = arg11[var41];
                            int var48 = arg11[var42];
                            if (var37.field9354 != null && var37.field9354[var39] != 0) {
                                int var49 = var37.field9354[var39];
                                arg9.method2289((float) var46, (float) var47, (float) var48, (float) var43, (float) var44, (float) var45, 100.0F, 100.0F, 100.0F, var49, var49, var49);
                            } else {
                                arg9.method2289((float) var46, (float) var47, (float) var48, (float) var43, (float) var44, (float) var45, 100.0F, 100.0F, 100.0F, var37.field9357[var40], var37.field9357[var41], var37.field9357[var42]);
                            }
                        }
                    }
                }
                var17 -= var14;
            }
            var17 = arg1 + var13;
            var16 += var14;
        }
        arg9.field5097 = true;
        this.field10676.method557(var15);
    }

    @OriginalMember(owner = "client!kn", name = "<init>", descriptor = "(Lut;IIII[[I[[II)V", line = 1751)
    public class772(class136 arg0, int arg1, int arg2, int arg3, int arg4, int[][] arg5, int[][] arg6, int arg7) {
        super(arg3, arg4, arg7, arg5);
        this.field10676 = arg0;
        this.field10673 = arg2;
        this.field10690 = new byte[arg3 + 1][arg4 + 1];
        int var9 = this.field10676.field2338 >> 9;
        for (int var10 = 1; var10 < arg4; ++var10) {
            for (int var11 = 1; var11 < arg3; ++var11) {
                int var13 = arg6[var11 + 1][var10] - arg6[var11 - 1][var10];
                int var14 = arg6[var11][var10 + 1] - arg6[var11][var10 - 1];
                int var15 = (int) Math.sqrt((double) (var14 * var14 + arg7 * 512 + var13 * var13));
                int var16 = (var13 << 8) / var15;
                int var17 = arg7 * -512 / var15;
                int var18 = (var14 << 8) / var15;
                int var19 = (this.field10676.field2312 * var18 + this.field10676.field2337 * var17 + this.field10676.field2304 * var16 >> 17) + var9;
                int var20 = var19 >> 1;
                if (var20 < 2) {
                    var20 = 2;
                } else if (var20 > 126) {
                    var20 = 126;
                }
                this.field10690[var11][var10] = (byte) var20;
            }
        }
        this.field10681 = new byte[arg3 + 1][arg4 + 1];
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(III)V", line = 1801)
    private final void method4249(int arg0, int arg1, int arg2) {
        class762 var4 = this.field10676.method1124(Thread.currentThread());
        var4.field10539.field5087 = 0;
        if (this.field10680 != null) {
            this.method4251(arg0, arg1, var4.field10492, var4, var4.field10539, var4.field10534, var4.field10519, var4.field10526, var4.field10532, arg2);
        } else if (this.field10674 != null) {
            this.method4247(arg0, arg1, var4.field10539, var4.field10534, var4.field10519, var4.field10526, var4.field10532, arg2);
        } else {
            if (this.field10670 != null) {
                this.method4252(arg0, arg1, var4.field10492, var4, var4.field10539, var4.field10534, var4.field10519, var4.field10526, var4.field10532, arg2);
            }
        }
    }

    @OriginalMember(owner = "client!kn", name = "b", descriptor = "(IIIIIII[[ZLcc;Ljp;[I[I)V", line = 1822)
    private final void method4250(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7, class762 arg8, class376 arg9, int[] arg10, int[] arg11) {
        int var13 = (arg6 - arg4) * arg2 / 256;
        int var14 = arg2 >> 8;
        boolean var15 = arg8.field10495;
        this.field10676.method557(false);
        arg9.field5097 = false;
        arg9.field5090 = false;
        int var16 = arg0;
        int var17 = arg1 + var13;
        for (int var18 = arg3; var18 < arg5; ++var18) {
            for (int var19 = arg4; var19 < arg6; ++var19) {
                if (arg7[var18 - arg3][var19 - arg4]) {
                    if (this.field10674[var18][var19] != null) {
                        class188 var20 = this.field10674[var18][var19];
                        if (var20.field2896 != -1 && (var20.field2895 & 2) == 0 && var20.field2900 == -1) {
                            int var21 = this.field10676.method1118(var20.field2896);
                            arg9.method2283((float) (var17 - var14), (float) (var17 - var14), (float) var17, (float) (var14 + var16), (float) var16, (float) (var14 + var16), 100.0F, 100.0F, 100.0F, (float) class7.method51(false, var20.field2897 & 65535, var21), (float) class7.method51(false, var20.field2899 & 65535, var21), (float) class7.method51(false, var20.field2898 & 65535, var21));
                            arg9.method2283((float) var17, (float) var17, (float) (var17 - var14), (float) var16, (float) (var14 + var16), (float) var16, 100.0F, 100.0F, 100.0F, (float) class7.method51(false, var20.field2894 & 65535, var21), (float) class7.method51(false, var20.field2898 & 65535, var21), (float) class7.method51(false, var20.field2899 & 65535, var21));
                        } else if (var20.field2900 == -1) {
                            arg9.method2283((float) (var17 - var14), (float) (var17 - var14), (float) var17, (float) (var14 + var16), (float) var16, (float) (var14 + var16), 100.0F, 100.0F, 100.0F, (float) (var20.field2897 & 65535), (float) (var20.field2899 & 65535), (float) (var20.field2898 & 65535));
                            arg9.method2283((float) var17, (float) var17, (float) (var17 - var14), (float) var16, (float) (var14 + var16), (float) var16, 100.0F, 100.0F, 100.0F, (float) (var20.field2894 & 65535), (float) (var20.field2898 & 65535), (float) (var20.field2899 & 65535));
                        } else {
                            int var22 = var20.field2900;
                            arg9.method2283((float) (var17 - var14), (float) (var17 - var14), (float) var17, (float) (var14 + var16), (float) var16, (float) (var14 + var16), 100.0F, 100.0F, 100.0F, (float) var22, (float) var22, (float) var22);
                            arg9.method2283((float) var17, (float) var17, (float) (var17 - var14), (float) var16, (float) (var14 + var16), (float) var16, 100.0F, 100.0F, 100.0F, (float) var22, (float) var22, (float) var22);
                        }
                    } else if (this.field10688[var18][var19] != null) {
                        class314 var23 = this.field10688[var18][var19];
                        for (int var24 = 0; var24 < var23.field4301; ++var24) {
                            arg10[var24] = var23.field4298[var24] * var14 / super.field4035 + var16;
                            arg11[var24] = var17 - var23.field4303[var24] * var14 / super.field4035;
                        }
                        for (int var25 = 0; var25 < var23.field4292; ++var25) {
                            short var26 = var23.field4290[var25];
                            short var27 = var23.field4294[var25];
                            short var28 = var23.field4296[var25];
                            int var29 = arg10[var26];
                            int var30 = arg10[var27];
                            int var31 = arg10[var28];
                            int var32 = arg11[var26];
                            int var33 = arg11[var27];
                            int var34 = arg11[var28];
                            if (var23.field4297 != null && var23.field4297[var25] != -1) {
                                int var35 = var23.field4297[var25];
                                arg9.method2283((float) var32, (float) var33, (float) var34, (float) var29, (float) var30, (float) var31, 100.0F, 100.0F, 100.0F, (float) class7.method51(false, var23.field4293[var26], var35), (float) class7.method51(false, var23.field4293[var27], var35), (float) class7.method51(false, var23.field4293[var28], var35));
                            } else if (var23.field4300 != null && var23.field4300[var25] != -1) {
                                int var36 = this.field10676.method1118(var23.field4300[var25]);
                                arg9.method2283((float) var32, (float) var33, (float) var34, (float) var29, (float) var30, (float) var31, 100.0F, 100.0F, 100.0F, (float) class7.method51(false, var23.field4293[var26], var36), (float) class7.method51(false, var23.field4293[var27], var36), (float) class7.method51(false, var23.field4293[var28], var36));
                            } else {
                                int var37 = var23.field4302[var25];
                                arg9.method2283((float) var32, (float) var33, (float) var34, (float) var29, (float) var30, (float) var31, 100.0F, 100.0F, 100.0F, (float) class7.method51(false, var23.field4293[var26], var37), (float) class7.method51(false, var23.field4293[var27], var37), (float) class7.method51(false, var23.field4293[var28], var37));
                            }
                        }
                    }
                }
                var17 -= var14;
            }
            var17 = arg1 + var13;
            var16 += var14;
        }
        arg9.field5097 = true;
        this.field10676.method557(var15);
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(IIIIIII[[Z)V", line = 1958)
    public final void method1899(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
        class762 var9 = this.field10676.method1124(Thread.currentThread());
        class376 var10 = var9.field10539;
        var10.field5087 = 0;
        var10.field5096 = true;
        this.field10676.method494();
        if (this.field10680 == null && this.field10670 == null) {
            if (this.field10674 != null) {
                this.method4250(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, var9, var10, var9.field10534, var9.field10519);
            }
        } else {
            this.method4248(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, var9, var10, var9.field10534, var9.field10519);
        }
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(II)V", line = 1973)
    public final void method1903(int arg0, int arg1) {
        this.method4249(arg0, arg1, 0);
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(IIZLcc;Ljp;[I[I[I[II)V", line = 1978)
    private final void method4251(int arg0, int arg1, boolean arg2, class762 arg3, class376 arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int arg9) {
        class91 var11 = this.field10680[arg0][arg1];
        if (var11 != null) {
            if ((var11.field1370 & 2) == 0) {
                if (arg9 != 0) {
                    if ((var11.field1370 & 4) != 0) {
                        if ((arg9 & 1) != 0) {
                            return;
                        }
                    } else if ((arg9 & 2) != 0) {
                        return;
                    }
                }
                int var12 = super.field4035 * arg0;
                int var13 = super.field4035 + var12;
                int var14 = super.field4035 * arg1;
                int var15 = super.field4035 + var14;
                int var16 = 0;
                int var17 = 0;
                int var18 = 0;
                int var19 = 0;
                float var22;
                float var23;
                float var24;
                float var25;
                int var33;
                int var35;
                int var37;
                int var39;
                int var41;
                int var43;
                int var45;
                int var47;
                if ((var11.field1370 & 1) != 0 && !arg2) {
                    int var20 = super.field4041[arg0][arg1];
                    float var21 = (float) var20 * this.field10672;
                    if (this.field10686 == -1) {
                        var22 = (float) var14 * this.field10684 + (float) var12 * this.field10687 + var21 + this.field10689;
                        if (var22 <= (float) this.field10676.field2328) {
                            return;
                        }
                        var23 = (float) var14 * this.field10684 + (float) var13 * this.field10687 + var21 + this.field10689;
                        if (var23 <= (float) this.field10676.field2328) {
                            return;
                        }
                        var24 = (float) var15 * this.field10684 + (float) var13 * this.field10687 + var21 + this.field10689;
                        if (var24 <= (float) this.field10676.field2328) {
                            return;
                        }
                        var25 = (float) var15 * this.field10684 + (float) var12 * this.field10687 + var21 + this.field10689;
                        if (var25 <= (float) this.field10676.field2328) {
                            return;
                        }
                    } else {
                        var22 = (float) var14 * this.field10684 + (float) var12 * this.field10687 + var21 + this.field10689;
                        var23 = (float) var14 * this.field10684 + (float) var13 * this.field10687 + var21 + this.field10689;
                        var24 = (float) var15 * this.field10684 + (float) var13 * this.field10687 + var21 + this.field10689;
                        var25 = (float) var15 * this.field10684 + (float) var12 * this.field10687 + var21 + this.field10689;
                    }
                    if (arg3.field10489) {
                        int var26 = (int) (var22 - (float) arg3.field10500);
                        if (var26 > 0) {
                            var16 = var26;
                            if (var26 > 255) {
                                var16 = 255;
                            }
                        }
                        int var27 = (int) (var23 - (float) arg3.field10500);
                        if (var27 > 0) {
                            var17 = var27;
                            if (var27 > 255) {
                                var17 = 255;
                            }
                        }
                        int var28 = (int) (var24 - (float) arg3.field10500);
                        if (var28 > 0) {
                            var18 = var28;
                            if (var28 > 255) {
                                var18 = 255;
                            }
                        }
                        int var29 = (int) (var25 - (float) arg3.field10500);
                        if (var29 > 0) {
                            var19 = var29;
                            if (var29 > 255) {
                                var19 = 255;
                            }
                        }
                    }
                    float var30 = (float) var20 * this.field10691;
                    float var31 = (float) var20 * this.field10671;
                    if (this.field10686 == -1) {
                        float var32 = (float) var14 * this.field10675 + (float) var12 * this.field10682 + var30 + this.field10685;
                        var33 = (int) ((float) this.field10676.field2317 * var32 / var22) + arg4.field5100;
                        float var34 = (float) var14 * this.field10678 + (float) var12 * this.field10683 + var31 + this.field10679;
                        var35 = (int) ((float) this.field10676.field2306 * var34 / var22) + arg4.field5102;
                        float var36 = (float) var14 * this.field10675 + (float) var13 * this.field10682 + var30 + this.field10685;
                        var37 = (int) ((float) this.field10676.field2317 * var36 / var23) + arg4.field5100;
                        float var38 = (float) var14 * this.field10678 + (float) var13 * this.field10683 + var31 + this.field10679;
                        var39 = (int) ((float) this.field10676.field2306 * var38 / var23) + arg4.field5102;
                        float var40 = (float) var15 * this.field10675 + (float) var13 * this.field10682 + var30 + this.field10685;
                        var41 = (int) ((float) this.field10676.field2317 * var40 / var24) + arg4.field5100;
                        float var42 = (float) var15 * this.field10678 + (float) var13 * this.field10683 + var31 + this.field10679;
                        var43 = (int) ((float) this.field10676.field2306 * var42 / var24) + arg4.field5102;
                        float var44 = (float) var15 * this.field10675 + (float) var12 * this.field10682 + var30 + this.field10685;
                        var45 = (int) ((float) this.field10676.field2317 * var44 / var25) + arg4.field5100;
                        float var46 = (float) var15 * this.field10678 + (float) var12 * this.field10683 + var31 + this.field10679;
                        var47 = (int) ((float) this.field10676.field2306 * var46 / var25) + arg4.field5102;
                    } else {
                        float var48 = (float) var14 * this.field10675 + (float) var12 * this.field10682 + var30 + this.field10685;
                        var33 = (int) ((float) this.field10676.field2317 * var48 / (float) this.field10686) + arg4.field5100;
                        float var49 = (float) var14 * this.field10678 + (float) var12 * this.field10683 + var31 + this.field10679;
                        var35 = (int) ((float) this.field10676.field2306 * var49 / (float) this.field10686) + arg4.field5102;
                        float var50 = (float) var14 * this.field10675 + (float) var13 * this.field10682 + var30 + this.field10685;
                        var37 = (int) ((float) this.field10676.field2317 * var50 / (float) this.field10686) + arg4.field5100;
                        float var51 = (float) var14 * this.field10678 + (float) var13 * this.field10683 + var31 + this.field10679;
                        var39 = (int) ((float) this.field10676.field2306 * var51 / (float) this.field10686) + arg4.field5102;
                        float var52 = (float) var15 * this.field10675 + (float) var13 * this.field10682 + var30 + this.field10685;
                        var41 = (int) ((float) this.field10676.field2317 * var52 / (float) this.field10686) + arg4.field5100;
                        float var53 = (float) var15 * this.field10678 + (float) var13 * this.field10683 + var31 + this.field10679;
                        var43 = (int) ((float) this.field10676.field2306 * var53 / (float) this.field10686) + arg4.field5102;
                        float var54 = (float) var15 * this.field10675 + (float) var12 * this.field10682 + var30 + this.field10685;
                        var45 = (int) ((float) this.field10676.field2317 * var54 / (float) this.field10686) + arg4.field5100;
                        float var55 = (float) var15 * this.field10678 + (float) var12 * this.field10683 + var31 + this.field10679;
                        var47 = (int) ((float) this.field10676.field2306 * var55 / (float) this.field10686) + arg4.field5102;
                    }
                } else {
                    int var56 = super.field4041[arg0][arg1];
                    int var57 = super.field4041[arg0 + 1][arg1];
                    int var58 = super.field4041[arg0 + 1][arg1 + 1];
                    int var59 = super.field4041[arg0][arg1 + 1];
                    if (this.field10686 == -1) {
                        var22 = (float) var14 * this.field10684 + (float) var12 * this.field10687 + (float) var56 * this.field10672 + this.field10689;
                        if (var22 <= (float) this.field10676.field2328) {
                            return;
                        }
                        var23 = (float) var14 * this.field10684 + (float) var13 * this.field10687 + (float) var57 * this.field10672 + this.field10689;
                        if (var23 <= (float) this.field10676.field2328) {
                            return;
                        }
                        var24 = (float) var15 * this.field10684 + (float) var13 * this.field10687 + (float) var58 * this.field10672 + this.field10689;
                        if (var24 <= (float) this.field10676.field2328) {
                            return;
                        }
                        var25 = (float) var15 * this.field10684 + (float) var12 * this.field10687 + (float) var59 * this.field10672 + this.field10689;
                        if (var25 <= (float) this.field10676.field2328) {
                            return;
                        }
                    } else {
                        var22 = (float) var14 * this.field10684 + (float) var12 * this.field10687 + (float) var56 * this.field10672 + this.field10689;
                        var23 = (float) var14 * this.field10684 + (float) var13 * this.field10687 + (float) var57 * this.field10672 + this.field10689;
                        var24 = (float) var15 * this.field10684 + (float) var13 * this.field10687 + (float) var58 * this.field10672 + this.field10689;
                        var25 = (float) var15 * this.field10684 + (float) var12 * this.field10687 + (float) var59 * this.field10672 + this.field10689;
                    }
                    if (arg2) {
                        int var60 = (int) (var22 - (float) arg3.field10500);
                        if (var60 > 255) {
                            var60 = 255;
                        }
                        if (var60 > 0) {
                            var16 = var60;
                            int var61 = var11.field1373 * var60 / 255;
                            if (var61 > 0) {
                                var56 -= var61;
                            }
                        }
                        int var62 = (int) (var23 - (float) arg3.field10500);
                        if (var62 > 255) {
                            var62 = 255;
                        }
                        if (var62 > 0) {
                            var17 = var62;
                            int var63 = var11.field1380 * var62 / 255;
                            if (var63 > 0) {
                                var57 -= var63;
                            }
                        }
                        int var64 = (int) (var24 - (float) arg3.field10500);
                        if (var64 > 255) {
                            var64 = 255;
                        }
                        if (var64 > 0) {
                            var18 = var64;
                            int var65 = var11.field1375 * var64 / 255;
                            if (var65 > 0) {
                                var58 -= var65;
                            }
                        }
                        int var66 = (int) (var25 - (float) arg3.field10500);
                        if (var66 > 255) {
                            var66 = 255;
                        }
                        if (var66 > 0) {
                            var19 = var66;
                            int var67 = var11.field1372 * var66 / 255;
                            if (var67 > 0) {
                                var59 -= var67;
                            }
                        }
                    } else if (arg3.field10489) {
                        int var68 = (int) (var22 - (float) arg3.field10500);
                        if (var68 > 0) {
                            var16 = var68;
                            if (var68 > 255) {
                                var16 = 255;
                            }
                        }
                        int var69 = (int) (var23 - (float) arg3.field10500);
                        if (var69 > 0) {
                            var17 = var69;
                            if (var69 > 255) {
                                var17 = 255;
                            }
                        }
                        int var70 = (int) (var24 - (float) arg3.field10500);
                        if (var70 > 0) {
                            var18 = var70;
                            if (var70 > 255) {
                                var18 = 255;
                            }
                        }
                        int var71 = (int) (var25 - (float) arg3.field10500);
                        if (var71 > 0) {
                            var19 = var71;
                            if (var71 > 255) {
                                var19 = 255;
                            }
                        }
                    }
                    if (this.field10686 == -1) {
                        float var72 = (float) var14 * this.field10675 + (float) var12 * this.field10682 + (float) var56 * this.field10691 + this.field10685;
                        var33 = (int) ((float) this.field10676.field2317 * var72 / var22) + arg4.field5100;
                        float var73 = (float) var14 * this.field10678 + (float) var12 * this.field10683 + (float) var56 * this.field10671 + this.field10679;
                        var35 = (int) ((float) this.field10676.field2306 * var73 / var22) + arg4.field5102;
                        float var74 = (float) var14 * this.field10675 + (float) var13 * this.field10682 + (float) var57 * this.field10691 + this.field10685;
                        var37 = (int) ((float) this.field10676.field2317 * var74 / var23) + arg4.field5100;
                        float var75 = (float) var14 * this.field10678 + (float) var13 * this.field10683 + (float) var57 * this.field10671 + this.field10679;
                        var39 = (int) ((float) this.field10676.field2306 * var75 / var23) + arg4.field5102;
                        float var76 = (float) var15 * this.field10675 + (float) var13 * this.field10682 + (float) var58 * this.field10691 + this.field10685;
                        var41 = (int) ((float) this.field10676.field2317 * var76 / var24) + arg4.field5100;
                        float var77 = (float) var15 * this.field10678 + (float) var13 * this.field10683 + (float) var58 * this.field10671 + this.field10679;
                        var43 = (int) ((float) this.field10676.field2306 * var77 / var24) + arg4.field5102;
                        float var78 = (float) var15 * this.field10675 + (float) var12 * this.field10682 + (float) var59 * this.field10691 + this.field10685;
                        var45 = (int) ((float) this.field10676.field2317 * var78 / var25) + arg4.field5100;
                        float var79 = (float) var15 * this.field10678 + (float) var12 * this.field10683 + (float) var59 * this.field10671 + this.field10679;
                        var47 = (int) ((float) this.field10676.field2306 * var79 / var25) + arg4.field5102;
                    } else {
                        float var80 = (float) var14 * this.field10675 + (float) var12 * this.field10682 + (float) var56 * this.field10691 + this.field10685;
                        var33 = (int) ((float) this.field10676.field2317 * var80 / (float) this.field10686) + arg4.field5100;
                        float var81 = (float) var14 * this.field10678 + (float) var12 * this.field10683 + (float) var56 * this.field10671 + this.field10679;
                        var35 = (int) ((float) this.field10676.field2306 * var81 / (float) this.field10686) + arg4.field5102;
                        float var82 = (float) var14 * this.field10675 + (float) var13 * this.field10682 + (float) var57 * this.field10691 + this.field10685;
                        var37 = (int) ((float) this.field10676.field2317 * var82 / (float) this.field10686) + arg4.field5100;
                        float var83 = (float) var14 * this.field10678 + (float) var13 * this.field10683 + (float) var57 * this.field10671 + this.field10679;
                        var39 = (int) ((float) this.field10676.field2306 * var83 / (float) this.field10686) + arg4.field5102;
                        float var84 = (float) var15 * this.field10675 + (float) var13 * this.field10682 + (float) var58 * this.field10691 + this.field10685;
                        var41 = (int) ((float) this.field10676.field2317 * var84 / (float) this.field10686) + arg4.field5100;
                        float var85 = (float) var15 * this.field10678 + (float) var13 * this.field10683 + (float) var58 * this.field10671 + this.field10679;
                        var43 = (int) ((float) this.field10676.field2306 * var85 / (float) this.field10686) + arg4.field5102;
                        float var86 = (float) var15 * this.field10675 + (float) var12 * this.field10682 + (float) var59 * this.field10691 + this.field10685;
                        var45 = (int) ((float) this.field10676.field2317 * var86 / (float) this.field10686) + arg4.field5100;
                        float var87 = (float) var15 * this.field10678 + (float) var12 * this.field10683 + (float) var59 * this.field10671 + this.field10679;
                        var47 = (int) ((float) this.field10676.field2306 * var87 / (float) this.field10686) + arg4.field5102;
                    }
                }
                boolean var88 = var11.field1376 != -1 && this.method4246(this.field10676.field970.method1270(var11.field1376, true).field4250);
                if (this.field10686 == -1) {
                    int var89 = var17 + var18 + var19;
                    if ((var39 - var47) * (var41 - var45) - (var37 - var45) * (var43 - var47) > 0) {
                        arg4.field5096 = var41 < 0 || var45 < 0 || var37 < 0 || var41 > arg4.field5093 || var45 > arg4.field5093 || var37 > arg4.field5093;
                        if (var89 < 765) {
                            if (var89 > 0) {
                                if (var11.field1376 >= 0) {
                                    int var90 = -16777216;
                                    if (var88) {
                                        var90 = -1694498816;
                                    }
                                    arg4.method2280((float) var43, (float) var47, (float) var39, (float) var41, (float) var45, (float) var37, var24, var25, var23, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, var90 | var11.field1379 & 16777215, var90 | var11.field1371 & 16777215, var90 | var11.field1377 & 16777215, arg3.field10493, var18, var19, var17, var11.field1376);
                                } else {
                                    if (var88) {
                                        arg4.field5087 = 100;
                                    }
                                    arg4.method2289((float) var43, (float) var47, (float) var39, (float) var41, (float) var45, (float) var37, (float) ((int) var24), (float) ((int) var25), (float) ((int) var23), class110.method927(var18 << 24 | arg3.field10493, 2346, var11.field1379), class110.method927(var19 << 24 | arg3.field10493, 2346, var11.field1371), class110.method927(var17 << 24 | arg3.field10493, 2346, var11.field1377));
                                    arg4.field5087 = 0;
                                }
                            } else if (var11.field1376 >= 0) {
                                int var91 = -16777216;
                                if (var88) {
                                    var91 = -1694498816;
                                }
                                arg4.method2280((float) var43, (float) var47, (float) var39, (float) var41, (float) var45, (float) var37, var24, var25, var23, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, var91 | var11.field1379 & 16777215, var91 | var11.field1371 & 16777215, var91 | var11.field1377 & 16777215, 0, 0, 0, 0, var11.field1376);
                            } else {
                                if (var88) {
                                    arg4.field5087 = 100;
                                }
                                arg4.method2289((float) var43, (float) var47, (float) var39, (float) var41, (float) var45, (float) var37, (float) ((int) var24), (float) ((int) var25), (float) ((int) var23), var11.field1379, var11.field1371, var11.field1377);
                                arg4.field5087 = 0;
                            }
                        } else {
                            arg4.method2288((float) var43, (float) var47, (float) var39, (float) var41, (float) var45, (float) var37, (float) ((int) var24), (float) ((int) var25), (float) ((int) var23), arg3.field10493);
                        }
                    }
                    int var92 = var16 + var17 + var19;
                    if ((var33 - var37) * (var47 - var39) - (var35 - var39) * (var45 - var37) > 0) {
                        arg4.field5096 = var33 < 0 || var37 < 0 || var45 < 0 || var33 > arg4.field5093 || var37 > arg4.field5093 || var45 > arg4.field5093;
                        if (var92 < 765) {
                            if (var88) {
                                arg4.field5087 = -1694498816;
                            }
                            if (var92 > 0) {
                                if (var11.field1376 >= 0) {
                                    int var93 = -16777216;
                                    if (var88) {
                                        var93 = -1694498816;
                                    }
                                    arg4.method2280((float) var35, (float) var39, (float) var47, (float) var33, (float) var37, (float) var45, var22, var23, var25, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, var93 | var11.field1378 & 16777215, var93 | var11.field1377 & 16777215, var93 | var11.field1371 & 16777215, arg3.field10493, var16, var17, var19, var11.field1376);
                                    return;
                                }
                                if (var88) {
                                    arg4.field5087 = 100;
                                }
                                arg4.method2289((float) var35, (float) var39, (float) var47, (float) var33, (float) var37, (float) var45, (float) ((int) var22), (float) ((int) var23), (float) ((int) var25), class110.method927(var16 << 24 | arg3.field10493, 2346, var11.field1378), class110.method927(var17 << 24 | arg3.field10493, 2346, var11.field1377), class110.method927(var19 << 24 | arg3.field10493, 2346, var11.field1371));
                                arg4.field5087 = 0;
                                return;
                            }
                            if (var11.field1376 >= 0) {
                                int var94 = -16777216;
                                if (var88) {
                                    var94 = -1694498816;
                                }
                                arg4.method2280((float) var35, (float) var39, (float) var47, (float) var33, (float) var37, (float) var45, var22, var23, var25, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, var94 | var11.field1378 & 16777215, var94 | var11.field1377 & 16777215, var94 | var11.field1371 & 16777215, 0, 0, 0, 0, var11.field1376);
                                return;
                            }
                            if (var88) {
                                arg4.field5087 = 100;
                            }
                            arg4.method2289((float) var35, (float) var39, (float) var47, (float) var33, (float) var37, (float) var45, (float) ((int) var22), (float) ((int) var23), (float) ((int) var25), var11.field1378, var11.field1377, var11.field1371);
                            arg4.field5087 = 0;
                            return;
                        }
                        arg4.method2288((float) var35, (float) var39, (float) var47, (float) var33, (float) var37, (float) var45, (float) ((int) var22), (float) ((int) var23), (float) ((int) var25), arg3.field10493);
                        return;
                    }
                } else {
                    int var95 = var17 + var18 + var19;
                    if ((var39 - var47) * (var41 - var45) - (var37 - var45) * (var43 - var47) > 0) {
                        arg4.field5096 = var41 < 0 || var45 < 0 || var37 < 0 || var41 > arg4.field5093 || var45 > arg4.field5093 || var37 > arg4.field5093;
                        if (var95 < 765) {
                            if (var88) {
                                arg4.field5087 = -1694498816;
                            }
                            if (var95 > 0) {
                                if (var11.field1376 >= 0) {
                                    int var96 = -16777216;
                                    if (var88) {
                                        var96 = -1694498816;
                                    }
                                    arg4.method2280((float) var43, (float) var47, (float) var39, (float) var41, (float) var45, (float) var37, var24, var25, var23, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, var96 | var11.field1379 & 16777215, var96 | var11.field1371 & 16777215, var96 | var11.field1377 & 16777215, arg3.field10493, var18, var19, var17, var11.field1376);
                                } else {
                                    if (var88) {
                                        arg4.field5087 = 100;
                                    }
                                    arg4.method2289((float) var43, (float) var47, (float) var39, (float) var41, (float) var45, (float) var37, (float) ((int) var24), (float) ((int) var25), (float) ((int) var23), class110.method927(var18 << 24 | arg3.field10493, 2346, var11.field1379), class110.method927(var19 << 24 | arg3.field10493, 2346, var11.field1371), class110.method927(var17 << 24 | arg3.field10493, 2346, var11.field1377));
                                    arg4.field5087 = 0;
                                }
                            } else if (var11.field1376 >= 0) {
                                int var97 = -16777216;
                                if (var88) {
                                    var97 = -1694498816;
                                }
                                arg4.method2280((float) var43, (float) var47, (float) var39, (float) var41, (float) var45, (float) var37, var24, var25, var23, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, var97 | var11.field1379 & 16777215, var97 | var11.field1371 & 16777215, var97 | var11.field1377 & 16777215, 0, 0, 0, 0, var11.field1376);
                            } else {
                                if (var88) {
                                    arg4.field5087 = 100;
                                }
                                arg4.method2289((float) var43, (float) var47, (float) var39, (float) var41, (float) var45, (float) var37, (float) ((int) var24), (float) ((int) var25), (float) ((int) var23), var11.field1379, var11.field1371, var11.field1377);
                                arg4.field5087 = 0;
                            }
                        } else {
                            arg4.method2288((float) var43, (float) var47, (float) var39, (float) var41, (float) var45, (float) var37, (float) ((int) var24), (float) ((int) var25), (float) ((int) var23), arg3.field10493);
                        }
                    }
                    int var98 = var16 + var17 + var19;
                    if ((var33 - var37) * (var47 - var39) - (var35 - var39) * (var45 - var37) > 0) {
                        arg4.field5096 = var33 < 0 || var37 < 0 || var45 < 0 || var33 > arg4.field5093 || var37 > arg4.field5093 || var45 > arg4.field5093;
                        if (var98 < 765) {
                            if (var88) {
                                arg4.field5087 = -1694498816;
                            }
                            if (var98 > 0) {
                                if (var11.field1376 >= 0) {
                                    int var99 = -16777216;
                                    if (var88) {
                                        var99 = -1694498816;
                                    }
                                    arg4.method2280((float) var35, (float) var39, (float) var47, (float) var33, (float) var37, (float) var45, var22, var23, var25, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, var99 | var11.field1378 & 16777215, var99 | var11.field1377 & 16777215, var99 | var11.field1371 & 16777215, arg3.field10493, var16, var17, var19, var11.field1376);
                                    return;
                                }
                                if (var88) {
                                    arg4.field5087 = 100;
                                }
                                arg4.method2289((float) var35, (float) var39, (float) var47, (float) var33, (float) var37, (float) var45, (float) ((int) var22), (float) ((int) var23), (float) ((int) var25), class110.method927(var16 << 24 | arg3.field10493, 2346, var11.field1378), class110.method927(var17 << 24 | arg3.field10493, 2346, var11.field1377), class110.method927(var19 << 24 | arg3.field10493, 2346, var11.field1371));
                                arg4.field5087 = 0;
                                return;
                            }
                            if (var11.field1376 >= 0) {
                                int var100 = -16777216;
                                if (var88) {
                                    var100 = -1694498816;
                                }
                                arg4.method2280((float) var35, (float) var39, (float) var47, (float) var33, (float) var37, (float) var45, var22, var23, var25, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, var100 | var11.field1378 & 16777215, var100 | var11.field1377 & 16777215, var100 | var11.field1371 & 16777215, 0, 0, 0, 0, var11.field1376);
                                return;
                            }
                            if (var88) {
                                arg4.field5087 = 100;
                            }
                            arg4.method2289((float) var35, (float) var39, (float) var47, (float) var33, (float) var37, (float) var45, (float) ((int) var22), (float) ((int) var23), (float) ((int) var25), var11.field1378, var11.field1377, var11.field1371);
                            arg4.field5087 = 0;
                            return;
                        }
                        arg4.method2288((float) var35, (float) var39, (float) var47, (float) var33, (float) var37, (float) var45, (float) ((int) var22), (float) ((int) var23), (float) ((int) var25), arg3.field10493);
                    }
                }
            }
        } else {
            class756 var101 = this.field10677[arg0][arg1];
            if (var101 != null) {
                if (arg9 != 0) {
                    if ((var101.field10419 & 4) != 0) {
                        if ((arg9 & 1) != 0) {
                            return;
                        }
                    } else if ((arg9 & 2) != 0) {
                        return;
                    }
                }
                if (this.field10686 == -1) {
                    for (int var102 = 0; var102 < var101.field10422; ++var102) {
                        int var103 = (arg0 << super.field4036) + var101.field10416[var102];
                        int var104 = var101.field10417[var102];
                        int var105 = (arg1 << super.field4036) + var101.field10425[var102];
                        float var106 = (float) var105 * this.field10684 + (float) var103 * this.field10687 + (float) var104 * this.field10672 + this.field10689;
                        if (var106 <= (float) this.field10676.field2328) {
                            return;
                        }
                        arg8[var102] = 0;
                        if (arg2) {
                            int var107 = (int) (var106 - (float) arg3.field10500);
                            if (var107 > 255) {
                                var107 = 255;
                            }
                            if (var107 > 0) {
                                arg8[var102] = var107;
                                int var108 = var101.field10424[var102] * var107 / 255;
                                if (var108 > 0) {
                                    var104 -= var108;
                                }
                            }
                        } else if (arg3.field10489) {
                            int var109 = (int) (var106 - (float) arg3.field10500);
                            if (var109 > 0) {
                                arg8[var102] = var109;
                                if (arg8[var102] > 255) {
                                    arg8[var102] = 255;
                                }
                            }
                        }
                        float var110 = (float) var105 * this.field10675 + (float) var103 * this.field10682 + (float) var104 * this.field10691 + this.field10685;
                        float var111 = (float) var105 * this.field10678 + (float) var103 * this.field10683 + (float) var104 * this.field10671 + this.field10679;
                        arg5[var102] = (int) ((float) this.field10676.field2317 * var110 / var106) + arg4.field5100;
                        arg6[var102] = (int) ((float) this.field10676.field2306 * var111 / var106) + arg4.field5102;
                        arg7[var102] = (int) var106;
                    }
                } else {
                    for (int var112 = 0; var112 < var101.field10422; ++var112) {
                        int var152 = (arg0 << super.field4036) + var101.field10416[var112];
                        int var153 = var101.field10417[var112];
                        int var154 = (arg1 << super.field4036) + var101.field10425[var112];
                        float var155 = (float) var154 * this.field10684 + (float) var152 * this.field10687 + (float) var153 * this.field10672 + this.field10689;
                        arg8[var112] = 0;
                        if (arg2) {
                            int var156 = this.field10686 - arg3.field10500;
                            if (var156 > 255) {
                                var156 = 255;
                            }
                            if (var156 > 0) {
                                arg8[var112] = var156;
                                int var157 = var101.field10424[var112] * var156 / 255;
                                if (var157 > 0) {
                                    var153 -= var157;
                                }
                            }
                        } else if (arg3.field10489) {
                            int var158 = this.field10686 - arg3.field10500;
                            if (var158 > 0) {
                                arg8[var112] = var158;
                                if (arg8[var112] > 255) {
                                    arg8[var112] = 255;
                                }
                            }
                        }
                        float var159 = (float) var154 * this.field10675 + (float) var152 * this.field10682 + (float) var153 * this.field10691 + this.field10685;
                        float var160 = (float) var154 * this.field10678 + (float) var152 * this.field10683 + (float) var153 * this.field10671 + this.field10679;
                        arg5[var112] = (int) ((float) this.field10676.field2317 * var159 / (float) this.field10686) + arg4.field5100;
                        arg6[var112] = (int) ((float) this.field10676.field2306 * var160 / (float) this.field10686) + arg4.field5102;
                        arg7[var112] = (int) var155;
                    }
                }
                if (var101.field10421 != null) {
                    if (this.field10686 == -1) {
                        for (int var113 = 0; var113 < var101.field10418; ++var113) {
                            int var114 = var113 * 3;
                            int var115 = var114 + 1;
                            int var116 = var115 + 1;
                            int var117 = arg5[var114];
                            int var118 = arg5[var115];
                            int var119 = arg5[var116];
                            int var120 = arg6[var114];
                            int var121 = arg6[var115];
                            int var122 = arg6[var116];
                            int var123 = arg8[var114] + arg8[var115] + arg8[var116];
                            if ((var117 - var118) * (var122 - var121) - (var119 - var118) * (var120 - var121) > 0) {
                                arg4.field5096 = var117 < 0 || var118 < 0 || var119 < 0 || var117 > arg4.field5093 || var118 > arg4.field5093 || var119 > arg4.field5093;
                                short var124 = var101.field10421[var113];
                                if (var123 < 765) {
                                    if (var123 > 0) {
                                        if (var124 != -1) {
                                            int var125 = -16777216;
                                            if (var124 != -1 && this.method4246(this.field10676.field970.method1270(var124, true).field4250)) {
                                                var125 = -1694498816;
                                            }
                                            arg4.method2280((float) var120, (float) var121, (float) var122, (float) var117, (float) var118, (float) var119, (float) arg7[var114], (float) arg7[var115], (float) arg7[var116], (float) var101.field10416[var114] / (float) super.field4035, (float) var101.field10416[var115] / (float) super.field4035, (float) var101.field10416[var116] / (float) super.field4035, (float) var101.field10425[var114] / (float) super.field4035, (float) var101.field10425[var115] / (float) super.field4035, (float) var101.field10425[var116] / (float) super.field4035, var125 | var101.field10420[var114] & 16777215, var125 | var101.field10420[var115] & 16777215, var125 | var101.field10420[var116] & 16777215, arg3.field10493, arg8[var114], arg8[var115], arg8[var116], var124);
                                        } else if ((var101.field10420[var114] & 16777215) != 0) {
                                            if (var124 != -1 && this.method4246(this.field10676.field970.method1270(var124, true).field4250)) {
                                                arg4.field5087 = -1694498816;
                                            }
                                            arg4.method2289((float) var120, (float) var121, (float) var122, (float) var117, (float) var118, (float) var119, (float) arg7[var114], (float) arg7[var115], (float) arg7[var116], class110.method927(arg8[var114] << 24 | arg3.field10493, 2346, var101.field10420[var114]), class110.method927(arg8[var115] << 24 | arg3.field10493, 2346, var101.field10420[var115]), class110.method927(arg8[var116] << 24 | arg3.field10493, 2346, var101.field10420[var116]));
                                            arg4.field5087 = 0;
                                        }
                                    } else if (var124 != -1) {
                                        int var126 = -16777216;
                                        if (var124 != -1 && this.method4246(this.field10676.field970.method1270(var124, true).field4250)) {
                                            var126 = -1694498816;
                                        }
                                        arg4.method2280((float) var120, (float) var121, (float) var122, (float) var117, (float) var118, (float) var119, (float) arg7[var114], (float) arg7[var115], (float) arg7[var116], (float) var101.field10416[var114] / (float) super.field4035, (float) var101.field10416[var115] / (float) super.field4035, (float) var101.field10416[var116] / (float) super.field4035, (float) var101.field10425[var114] / (float) super.field4035, (float) var101.field10425[var115] / (float) super.field4035, (float) var101.field10425[var116] / (float) super.field4035, var126 | var101.field10420[var114] & 16777215, var126 | var101.field10420[var115] & 16777215, var126 | var101.field10420[var116] & 16777215, 0, 0, 0, 0, var124);
                                    } else if ((var101.field10420[var114] & 16777215) != 0) {
                                        if (var124 != -1 && this.method4246(this.field10676.field970.method1270(var124, true).field4250)) {
                                            arg4.field5087 = -1694498816;
                                        }
                                        arg4.method2289((float) var120, (float) var121, (float) var122, (float) var117, (float) var118, (float) var119, (float) arg7[var114], (float) arg7[var115], (float) arg7[var116], var101.field10420[var114], var101.field10420[var115], var101.field10420[var116]);
                                        arg4.field5087 = 0;
                                    }
                                } else {
                                    arg4.method2288((float) var120, (float) var121, (float) var122, (float) var117, (float) var118, (float) var119, (float) arg7[var114], (float) arg7[var115], (float) arg7[var116], arg3.field10493);
                                }
                            }
                        }
                        return;
                    }
                    for (int var127 = 0; var127 < var101.field10418; ++var127) {
                        int var128 = var127 * 3;
                        int var129 = var128 + 1;
                        int var130 = var129 + 1;
                        int var131 = arg5[var128];
                        int var132 = arg5[var129];
                        int var133 = arg5[var130];
                        int var134 = arg6[var128];
                        int var135 = arg6[var129];
                        int var136 = arg6[var130];
                        int var137 = arg8[var128] + arg8[var129] + arg8[var130];
                        if ((var131 - var132) * (var136 - var135) - (var133 - var132) * (var134 - var135) > 0) {
                            arg4.field5096 = var131 < 0 || var132 < 0 || var133 < 0 || var131 > arg4.field5093 || var132 > arg4.field5093 || var133 > arg4.field5093;
                            short var138 = var101.field10421[var127];
                            if (var137 < 765) {
                                if (var138 != -1 && this.method4246(this.field10676.field970.method1270(var138, true).field4250)) {
                                    arg4.field5087 = -1694498816;
                                }
                                if (var137 > 0) {
                                    if (var138 != -1) {
                                        int var139 = -16777216;
                                        if (var138 != -1 && this.method4246(this.field10676.field970.method1270(var138, true).field4250)) {
                                            var139 = -1694498816;
                                        }
                                        arg4.method2280((float) var134, (float) var135, (float) var136, (float) var131, (float) var132, (float) var133, (float) arg7[var128], (float) arg7[var129], (float) arg7[var130], (float) var101.field10416[var128] / (float) super.field4035, (float) var101.field10416[var129] / (float) super.field4035, (float) var101.field10416[var130] / (float) super.field4035, (float) var101.field10425[var128] / (float) super.field4035, (float) var101.field10425[var129] / (float) super.field4035, (float) var101.field10425[var130] / (float) super.field4035, var139 | var101.field10420[var128] & 16777215, var139 | var101.field10420[var129] & 16777215, var139 | var101.field10420[var130] & 16777215, arg3.field10493, arg8[var128], arg8[var129], arg8[var130], var138);
                                    } else if ((var101.field10420[var128] & 16777215) != 0) {
                                        if (var138 != -1 && this.method4246(this.field10676.field970.method1270(var138, true).field4250)) {
                                            arg4.field5087 = -1694498816;
                                        }
                                        arg4.method2289((float) var134, (float) var135, (float) var136, (float) var131, (float) var132, (float) var133, (float) arg7[var128], (float) arg7[var129], (float) arg7[var130], class110.method927(arg8[var128] << 24 | arg3.field10493, 2346, var101.field10420[var128]), class110.method927(arg8[var129] << 24 | arg3.field10493, 2346, var101.field10420[var129]), class110.method927(arg8[var130] << 24 | arg3.field10493, 2346, var101.field10420[var130]));
                                        arg4.field5087 = 0;
                                    }
                                } else if (var138 != -1) {
                                    int var140 = -16777216;
                                    if (var138 != -1 && this.method4246(this.field10676.field970.method1270(var138, true).field4250)) {
                                        var140 = -1694498816;
                                    }
                                    arg4.method2280((float) var134, (float) var135, (float) var136, (float) var131, (float) var132, (float) var133, (float) arg7[var128], (float) arg7[var129], (float) arg7[var130], (float) var101.field10416[var128] / (float) super.field4035, (float) var101.field10416[var129] / (float) super.field4035, (float) var101.field10416[var130] / (float) super.field4035, (float) var101.field10425[var128] / (float) super.field4035, (float) var101.field10425[var129] / (float) super.field4035, (float) var101.field10425[var130] / (float) super.field4035, var140 | var101.field10420[var128] & 16777215, var140 | var101.field10420[var129] & 16777215, var140 | var101.field10420[var130] & 16777215, 0, 0, 0, 0, var138);
                                } else if ((var101.field10420[var128] & 16777215) != 0) {
                                    if (var138 != -1 && this.method4246(this.field10676.field970.method1270(var138, true).field4250)) {
                                        arg4.field5087 = -1694498816;
                                    }
                                    arg4.method2289((float) var134, (float) var135, (float) var136, (float) var131, (float) var132, (float) var133, (float) arg7[var128], (float) arg7[var129], (float) arg7[var130], var101.field10420[var128], var101.field10420[var129], var101.field10420[var130]);
                                    arg4.field5087 = 0;
                                }
                                arg4.field5087 = 0;
                            } else {
                                arg4.method2288((float) var134, (float) var135, (float) var136, (float) var131, (float) var132, (float) var133, (float) arg7[var128], (float) arg7[var129], (float) arg7[var130], arg3.field10493);
                            }
                        }
                    }
                    return;
                }
                for (int var141 = 0; var141 < var101.field10418; ++var141) {
                    int var142 = var141 * 3;
                    int var143 = var142 + 1;
                    int var144 = var143 + 1;
                    int var145 = arg5[var142];
                    int var146 = arg5[var143];
                    int var147 = arg5[var144];
                    int var148 = arg6[var142];
                    int var149 = arg6[var143];
                    int var150 = arg6[var144];
                    int var151 = arg8[var142] + arg8[var143] + arg8[var144];
                    if ((var145 - var146) * (var150 - var149) - (var147 - var146) * (var148 - var149) > 0) {
                        arg4.field5096 = var145 < 0 || var146 < 0 || var147 < 0 || var145 > arg4.field5093 || var146 > arg4.field5093 || var147 > arg4.field5093;
                        if (var151 < 765) {
                            if (var151 > 0) {
                                if ((var101.field10420[var142] & 16777215) != 0) {
                                    arg4.method2289((float) var148, (float) var149, (float) var150, (float) var145, (float) var146, (float) var147, (float) arg7[var142], (float) arg7[var143], (float) arg7[var144], class580.method3337(arg3.field10493, var101.field10420[var142], arg8[var142], -16711936), class580.method3337(arg3.field10493, var101.field10420[var143], arg8[var143], -16711936), class580.method3337(arg3.field10493, var101.field10420[var144], arg8[var144], -16711936));
                                }
                            } else if ((var101.field10420[var142] & 16777215) != 0) {
                                arg4.method2289((float) var148, (float) var149, (float) var150, (float) var145, (float) var146, (float) var147, (float) arg7[var142], (float) arg7[var143], (float) arg7[var144], var101.field10420[var142], var101.field10420[var143], var101.field10420[var144]);
                            }
                        } else {
                            arg4.method2288((float) var148, (float) var149, (float) var150, (float) var145, (float) var146, (float) var147, (float) arg7[var142], (float) arg7[var143], (float) arg7[var144], arg3.field10493);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!kn", name = "ka", descriptor = "(III)V", line = 2968)
    public final void method1894(int arg0, int arg1, int arg2) {
        if (this.field10681[arg0][arg1] < arg2) {
            this.field10681[arg0][arg1] = (byte) arg2;
        }
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(Lr;IIIIZ)Z", line = 2973)
    public final boolean method1901(class196 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        return false;
    }

    @OriginalMember(owner = "client!kn", name = "b", descriptor = "(IIZLcc;Ljp;[I[I[I[II)V", line = 2980)
    private final void method4252(int arg0, int arg1, boolean arg2, class762 arg3, class376 arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int arg9) {
        class674 var11 = this.field10670[arg0][arg1];
        if (arg9 == 0 || (arg9 & 2) == 0) {
            if (var11 != null) {
                if (this.field10686 == -1) {
                    for (int var12 = 0; var12 < var11.field9355; ++var12) {
                        int var13 = (arg0 << super.field4036) + var11.field9359[var12];
                        int var14 = var11.field9353[var12];
                        int var15 = (arg1 << super.field4036) + var11.field9351[var12];
                        float var16 = (float) var15 * this.field10684 + (float) var13 * this.field10687 + (float) var14 * this.field10672 + this.field10689;
                        if (var16 <= (float) this.field10676.field2328) {
                            return;
                        }
                        arg8[var12] = 0;
                        if (arg2) {
                            int var17 = (int) (var16 - (float) arg3.field10500);
                            if (var17 > 255) {
                                var17 = 255;
                            }
                            if (var17 > 0) {
                                arg8[var12] = var17;
                                int var18 = var11.field9356[var12] * var17 / 255;
                                if (var18 > 0) {
                                    var14 -= var18;
                                }
                            }
                        } else if (arg3.field10489) {
                            int var19 = (int) (var16 - (float) arg3.field10500);
                            if (var19 > 0) {
                                arg8[var12] = var19;
                                if (arg8[var12] > 255) {
                                    arg8[var12] = 255;
                                }
                            }
                        }
                        float var20 = (float) var15 * this.field10675 + (float) var13 * this.field10682 + (float) var14 * this.field10691 + this.field10685;
                        float var21 = (float) var15 * this.field10678 + (float) var13 * this.field10683 + (float) var14 * this.field10671 + this.field10679;
                        arg5[var12] = (int) ((float) this.field10676.field2317 * var20 / var16) + arg4.field5100;
                        arg6[var12] = (int) ((float) this.field10676.field2306 * var21 / var16) + arg4.field5102;
                        arg7[var12] = (int) var16;
                    }
                } else {
                    for (int var22 = 0; var22 < var11.field9355; ++var22) {
                        int var36 = (arg0 << super.field4036) + var11.field9359[var22];
                        int var37 = var11.field9353[var22];
                        int var38 = (arg1 << super.field4036) + var11.field9351[var22];
                        float var39 = (float) var38 * this.field10684 + (float) var36 * this.field10687 + (float) var37 * this.field10672 + this.field10689;
                        arg8[var22] = 0;
                        if (arg2) {
                            int var40 = this.field10686 - arg3.field10500;
                            if (var40 > 255) {
                                var40 = 255;
                            }
                            if (var40 > 0) {
                                arg8[var22] = var40;
                                int var41 = var11.field9356[var22] * var40 / 255;
                                if (var41 > 0) {
                                    var37 -= var41;
                                }
                            }
                        } else if (arg3.field10489) {
                            int var42 = this.field10686 - arg3.field10500;
                            if (var42 > 0) {
                                arg8[var22] = var42;
                                if (arg8[var22] > 255) {
                                    arg8[var22] = 255;
                                }
                            }
                        }
                        float var43 = (float) var38 * this.field10675 + (float) var36 * this.field10682 + (float) var37 * this.field10691 + this.field10685;
                        float var44 = (float) var38 * this.field10678 + (float) var36 * this.field10683 + (float) var37 * this.field10671 + this.field10679;
                        arg5[var22] = (int) ((float) this.field10676.field2317 * var43 / (float) this.field10686) + arg4.field5100;
                        arg6[var22] = (int) ((float) this.field10676.field2306 * var44 / (float) this.field10686) + arg4.field5102;
                        arg7[var22] = (int) var39;
                    }
                }
                float var23 = (float) super.field4035;
                for (int var24 = 0; var24 < var11.field9349; ++var24) {
                    int var25 = var24 * 3;
                    int var26 = var25 + 1;
                    int var27 = var26 + 1;
                    int var28 = arg5[var25];
                    int var29 = arg5[var26];
                    int var30 = arg5[var27];
                    int var31 = arg6[var25];
                    int var32 = arg6[var26];
                    int var33 = arg6[var27];
                    if ((var28 - var29) * (var33 - var32) - (var30 - var29) * (var31 - var32) > 0) {
                        arg4.field5096 = var28 < 0 || var29 < 0 || var30 < 0 || var28 > arg4.field5093 || var29 > arg4.field5093 || var30 > arg4.field5093;
                        if (arg8[var25] + arg8[var26] + arg8[var27] < 765) {
                            int var34 = arg0 << super.field4036;
                            int var35 = arg1 << super.field4036;
                            if ((var11.field9357[var25] & 16777215) != 0) {
                                if (var11.field9350[var25] == var11.field9350[var26] && var11.field9350[var25] == var11.field9350[var27] && var11.field9352[var25] == var11.field9352[var26] && var11.field9352[var25] == var11.field9352[var27]) {
                                    arg4.method2280((float) var31, (float) var32, (float) var33, (float) var28, (float) var29, (float) var30, (float) arg7[var25], (float) arg7[var26], (float) arg7[var27], (float) (var11.field9359[var25] + var34) / (float) var11.field9352[var25], (float) (var11.field9359[var26] + var34) / (float) var11.field9352[var26], (float) (var11.field9359[var27] + var34) / (float) var11.field9352[var27], (float) (var11.field9351[var25] + var35) / (float) var11.field9352[var25], (float) (var11.field9351[var26] + var35) / (float) var11.field9352[var26], (float) (var11.field9351[var27] + var35) / (float) var11.field9352[var27], var11.field9357[var25], var11.field9357[var26], var11.field9357[var27], arg3.field10493, arg8[var25], arg8[var26], arg8[var27], var11.field9350[var25]);
                                } else {
                                    arg4.method2282((float) var31, (float) var32, (float) var33, (float) var28, (float) var29, (float) var30, (float) arg7[var25], (float) arg7[var26], (float) arg7[var27], (float) (var11.field9359[var25] + var34) / var23, (float) (var11.field9359[var26] + var34) / var23, (float) (var11.field9359[var27] + var34) / var23, (float) (var11.field9351[var25] + var35) / var23, (float) (var11.field9351[var26] + var35) / var23, (float) (var11.field9351[var27] + var35) / var23, var11.field9357[var25], var11.field9357[var26], var11.field9357[var27], arg3.field10493, arg8[var25], arg8[var26], arg8[var27], var11.field9350[var25], var23 / (float) var11.field9352[var25], var11.field9350[var26], var23 / (float) var11.field9352[var26], var11.field9350[var27], var23 / (float) var11.field9352[var27]);
                                }
                            }
                        } else {
                            arg4.method2288((float) var31, (float) var32, (float) var33, (float) var28, (float) var29, (float) var30, (float) arg7[var25], (float) arg7[var26], (float) arg7[var27], arg3.field10493);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!kn", name = "fa", descriptor = "(IILr;)Lr;", line = 3170)
    public final class196 method1908(int arg0, int arg1, class196 arg2) {
        return null;
    }

    @OriginalMember(owner = "client!kn", name = "b", descriptor = "(II)I", line = 3175)
    private static final int method4253(int arg0, int arg1) {
        int var2 = (arg0 & 16711680) * arg1 >> 23;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 253) {
            var2 = 253;
        }
        int var3 = (arg0 & 65280) * arg1 >> 15;
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 253) {
            var3 = 253;
        }
        int var4 = (arg0 & 255) * arg1 >> 7;
        if (var4 < 2) {
            var4 = 2;
        } else if (var4 > 253) {
            var4 = 253;
        }
        return var2 << 16 | var3 << 8 | var4;
    }

    @OriginalMember(owner = "client!kn", name = "wa", descriptor = "(Lr;IIIIZ)V", line = 3203)
    public final void method1904(class196 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
    }
}
