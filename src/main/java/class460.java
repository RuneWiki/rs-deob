import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rp")
public class class460 {

    @OriginalMember(owner = "client!rp", name = "f", descriptor = "Z")
    private boolean field6711 = true;

    @OriginalMember(owner = "client!rp", name = "k", descriptor = "I")
    private int field6722 = -1;

    @OriginalMember(owner = "client!rp", name = "e", descriptor = "I")
    private int field6717;

    @OriginalMember(owner = "client!rp", name = "d", descriptor = "I")
    private int field6721;

    @OriginalMember(owner = "client!rp", name = "h", descriptor = "[Lah;")
    private class404[] field6724;

    @OriginalMember(owner = "client!rp", name = "i", descriptor = "I")
    private int field6714;

    @OriginalMember(owner = "client!rp", name = "j", descriptor = "I")
    private int field6723;

    @OriginalMember(owner = "client!rp", name = "p", descriptor = "[Lah;")
    private class404[] field6720;

    @OriginalMember(owner = "client!rp", name = "b", descriptor = "Lah;")
    private class404 field6719;

    @OriginalMember(owner = "client!rp", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field6726 = new String[] { method3509(method3508("[\u0018a\u001e\f")), method3509(method3508("NC#\\")), method3509(method3508("RFarY")), method3509(method3508("RFaqY")), method3509(method3508("RFasY")), method3509(method3508("RFatY")), method3509(method3508("RFa\f\u0018N_;\u000eY")), method3509(method3508("RFauY")) };

    @OriginalMember(owner = "client!rp", name = "o", descriptor = "Ldv;")
    public static class685 field6716 = new class685(7, 0, 1, 1);

    @OriginalMember(owner = "client!rp", name = "c", descriptor = "I")
    private int field6710;

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "I")
    public static int field6712;

    @OriginalMember(owner = "client!rp", name = "m", descriptor = "I")
    private int field6713;

    @OriginalMember(owner = "client!rp", name = "n", descriptor = "I")
    public static int field6715;

    @OriginalMember(owner = "client!rp", name = "g", descriptor = "I")
    public static int field6718;

    @OriginalMember(owner = "client!rp", name = "l", descriptor = "I")
    public static int field6725;

    @OriginalMember(owner = "client!rp", name = "q", descriptor = "Lfs;")
    private class581 field6709;

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(I)V", line = 7)
    public final void method3503(int arg0) {
        try {
            if (arg0 < 114) {
                method3507(false, -120);
            }
            field6725++;
            if (this.field6724 != null) {
                for (int var2 = 0; var2 < this.field6724.length; var2++) {
                    this.field6724[var2].method3179();
                }
            }
            this.field6709 = null;
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field6726[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(IILha;IIIIIII)V", line = 33)
    public final void method3504(int arg0, int arg1, class66 arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        try {
            int var21 = arg5 + arg6 & 0x3FFF;
            field6718++;
            if (arg3 == 2) {
                if (this.field6721 == -1 || this.field6713 == 0) {
                    arg2.method556(arg1, arg4, arg8, arg9, arg7, 0);
                } else {
                    class439 var11 = class702.field10199.method1366((byte) -115, this.field6721);
                    if (this.field6709 == null && class702.field10199.method1363(this.field6721, (byte) -117)) {
                        int[] var12 = var11.field6478 == 2 ? class702.field10199.method1365((byte) -59, this.field6713, false, 0.7F, this.field6721, this.field6713) : class702.field10199.method1364(arg3 ^ 0xFFFF9BCA, false, this.field6721, this.field6713, this.field6713, 0.7F);
                        this.field6709 = arg2.method520(0, this.field6713, var12, (byte) 41, this.field6713, this.field6713);
                    }
                    if (var11.field6478 == 2) {
                        arg2.method556(arg1, arg4, arg8, arg9, arg7, 0);
                    }
                    if (this.field6709 != null) {
                        int var13 = var11.field6478 == 2 ? 1 : 0;
                        int var14 = arg0 * arg9 / -4096;
                        int var15;
                        for (var15 = (arg8 - arg9) / 2 + (var21 * arg9 / 4096); var15 > arg9; var15 -= arg9) {
                        }
                        while (var15 < 0) {
                            var15 += arg9;
                        }
                        while (arg9 < var14) {
                            var14 -= arg9;
                        }
                        while (var14 < 0) {
                            var14 += arg9;
                        }
                        for (int var16 = var15 - arg9; var16 < arg8; var16 += arg9) {
                            for (int var17 = var14 - arg9; var17 < arg9; var17 += arg9) {
                                this.field6709.method4343(arg1 + var16, arg4 + var17, arg9, arg9, 1, 0, var13);
                            }
                        }
                    }
                }
                for (int var18 = this.field6710 - 1; var18 >= 0; var18--) {
                    this.field6720[var18].method3171(arg2, arg1, arg4, arg8, arg9, arg0, var21);
                }
            }
        } catch (RuntimeException var20) {
            throw class759.method5498(var20, field6726[2] + arg0 + ',' + arg1 + ',' + (arg2 == null ? field6726[1] : field6726[0]) + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ')');
        }
    }

    @OriginalMember(owner = "client!rp", name = "b", descriptor = "(I)V", line = 113)
    public static void method3505(int arg0) {
        try {
            field6716 = null;
            if (arg0 != 0) {
                field6716 = null;
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field6726[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(ILha;I)Z", line = 123)
    public final boolean method3506(int arg0, class66 arg1, int arg2) {
        try {
            field6715++;
            if (this.field6722 != arg0) {
                this.field6722 = arg0;
                int var4 = class554.method4172(arg0, 24500);
                if (var4 > 512) {
                    var4 = 512;
                }
                if (var4 <= 0) {
                    var4 = 1;
                }
                if (this.field6713 != var4) {
                    this.field6713 = var4;
                    this.field6709 = null;
                }
                if (this.field6724 != null) {
                    this.field6710 = 0;
                    int[] var5 = new int[this.field6724.length];
                    for (int var6 = 0; var6 < this.field6724.length; var6++) {
                        class404 var7 = this.field6724[var6];
                        if (var7.method3176(this.field6714, this.field6723, this.field6717, this.field6722)) {
                            var5[this.field6710] = var7.field6033;
                            this.field6720[this.field6710++] = var7;
                        }
                    }
                    class69.method626(0, var5, (byte) -62, this.field6720, this.field6710 - 1);
                }
                this.field6711 = true;
            }
            if (arg2 < 60) {
                this.field6723 = 24;
            }
            boolean var8 = false;
            if (this.field6711) {
                this.field6711 = false;
                for (int var9 = this.field6710 - 1; var9 >= 0; var9--) {
                    boolean var10 = this.field6720[var9].method3170(arg1, this.field6719);
                    var8 |= var10;
                    this.field6711 |= !var10;
                }
            }
            return var8;
        } catch (RuntimeException var12) {
            throw class759.method5498(var12, field6726[7] + arg0 + ',' + (arg1 == null ? field6726[1] : field6726[0]) + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(ZI)V", line = 201)
    public static final void method3507(boolean arg0, int arg1) {
        try {
            field6712++;
            if (!arg0 && class470.field6830 != arg1) {
                class648.field9378 = class659.field9506 = class123.field1449[arg1];
                class54.method404(58);
                class138.field1642 = new int[4][class648.field9378 >> 3][class659.field9506 >> 3];
                class686.field9951 = new int[class648.field9378][class659.field9506];
                class91.field1045 = new int[class648.field9378][class659.field9506];
                for (int var2 = 0; var2 < 4; var2++) {
                    class429.field6298[var2] = class212.method1863(4014, class648.field9378, class659.field9506);
                }
                class520.field7621 = new byte[4][class648.field9378][class659.field9506];
                class601.method4465(class648.field9378, 4, (byte) 71, class659.field9506);
                class246.method2088((byte) -16, class659.field9506 >> 3, class648.field9378 >> 3, class610.field8913);
                class470.field6830 = arg1;
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field6726[5] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!rp", name = "<init>", descriptor = "(I[Lah;IIII)V", line = 250)
    public class460(int arg0, class404[] arg1, int arg2, int arg3, int arg4, int arg5) {
        try {
            this.field6717 = arg5;
            this.field6721 = arg0;
            this.field6724 = arg1;
            this.field6714 = arg3;
            this.field6723 = arg4;
            if (arg1 == null) {
                this.field6719 = null;
                this.field6720 = null;
            } else {
                this.field6720 = new class404[arg1.length];
                this.field6719 = arg2 < 0 ? null : arg1[arg2];
            }
        } catch (RuntimeException var8) {
            throw class759.method5498(var8, field6726[6] + arg0 + ',' + (arg1 == null ? field6726[1] : field6726[0]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!rp", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3508(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x71);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!rp", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3509(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 32;
                    break;
                case 1:
                    var10005 = 54;
                    break;
                case 2:
                    var10005 = 79;
                    break;
                case 3:
                    var10005 = 48;
                    break;
                default:
                    var10005 = 113;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
