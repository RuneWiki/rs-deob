import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bk")
public class class52 extends class224 {

    @OriginalMember(owner = "client!bk", name = "S", descriptor = "I")
    public int field630 = 4;

    @OriginalMember(owner = "client!bk", name = "bb", descriptor = "[B")
    private byte[] field639 = new byte[512];

    @OriginalMember(owner = "client!bk", name = "gb", descriptor = "I")
    public int field644 = 4;

    @OriginalMember(owner = "client!bk", name = "hb", descriptor = "Z")
    public boolean field645 = true;

    @OriginalMember(owner = "client!bk", name = "eb", descriptor = "I")
    public int field642 = 1638;

    @OriginalMember(owner = "client!bk", name = "jb", descriptor = "I")
    public int field647 = 4;

    @OriginalMember(owner = "client!bk", name = "lb", descriptor = "I")
    public int field649 = 0;

    @OriginalMember(owner = "client!bk", name = "W", descriptor = "Luf;")
    public static class168 field634 = class148.method1019(-1720, ")3)3)3");

    @OriginalMember(owner = "client!bk", name = "T", descriptor = "I")
    public static int field631;

    @OriginalMember(owner = "client!bk", name = "U", descriptor = "I")
    public static int field632;

    @OriginalMember(owner = "client!bk", name = "X", descriptor = "I")
    public static int field635;

    @OriginalMember(owner = "client!bk", name = "Y", descriptor = "I")
    public static int field636;

    @OriginalMember(owner = "client!bk", name = "Z", descriptor = "I")
    public static int field637;

    @OriginalMember(owner = "client!bk", name = "cb", descriptor = "I")
    public static int field640;

    @OriginalMember(owner = "client!bk", name = "db", descriptor = "I")
    public static int field641;

    @OriginalMember(owner = "client!bk", name = "ib", descriptor = "I")
    public static int field646;

    @OriginalMember(owner = "client!bk", name = "kb", descriptor = "I")
    public static int field648;

    @OriginalMember(owner = "client!bk", name = "mb", descriptor = "I")
    public static int field650;

    @OriginalMember(owner = "client!bk", name = "nb", descriptor = "I")
    public static int field651;

    @OriginalMember(owner = "client!bk", name = "ab", descriptor = "Ldk;")
    public static class241 field638;

    @OriginalMember(owner = "client!bk", name = "fb", descriptor = "Ldk;")
    public static class241 field643;

    @OriginalMember(owner = "client!bk", name = "R", descriptor = "[S")
    private short[] field629;

    @OriginalMember(owner = "client!bk", name = "V", descriptor = "[S")
    private short[] field633;

    @OriginalMember(owner = "client!bk", name = "d", descriptor = "(I)V", line = 15)
    private final void method286(int arg0) {
        if (arg0 != 2) {
            method287(-103, true);
        }
        if (this.field642 > 0) {
            this.field633 = new short[this.field647];
            this.field629 = new short[this.field647];
            for (int var3 = 0; var3 < this.field647; var3++) {
                this.field629[var3] = (short) ((int) (Math.pow((double) ((float) this.field642 / 4096.0F), (double) var3) * 4096.0D));
                this.field633[var3] = (short) ((int) Math.pow(2.0D, (double) var3));
            }
        } else if (this.field629 != null && this.field629.length == this.field647) {
            this.field633 = new short[this.field647];
            for (int var2 = 0; var2 < this.field647; var2++) {
                this.field633[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
            }
        }
        field648++;
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(IZ)Z", line = 56)
    public static final boolean method287(int arg0, boolean arg1) {
        field640++;
        if (arg1) {
            return ((arg0 & 0x18C859) >> 20) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(I[B)Lw;", line = 68)
    public static final class37 method288(int arg0, byte[] arg1) {
        field632++;
        if (arg1 == null) {
            return null;
        } else {
            int var2 = -47 % ((arg0 - 58) / 41);
            class302 var3 = new class302(arg1, class154.field2430, class254.field4341, class205.field3374, class214.field3490, class236.field3779);
            class244.method1679(-14642);
            return var3;
        }
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(IILg;I)V", line = 86)
    public static final void method289(int arg0, int arg1, class242 arg2, int arg3) {
        field646++;
        if (class76.field1032 != 0 && class76.field1032 != 3 || !arg2.method1662(-111)) {
            return;
        }
        int var4 = arg2.field4113[arg3];
        if (var4 > arg0 || (arg2.field4129[arg3] + var4) < arg0) {
            return;
        }
        int var5 = arg0 - arg2.field3989 / 2;
        int var6 = class71.field959 + class45.field551 & 0x7FF;
        int var7 = arg3 - arg2.field4057 / 2;
        int var8 = class173.field2812[var6];
        int var9 = (class70.field934 + 256) * var8 >> 8;
        int var10 = class173.field2818[var6];
        int var11 = (class70.field934 + 256) * var10 >> 8;
        int var12 = var5 * var11 + var7 * var9 >> 11;
        int var13 = class266.field4489.field3027 + var12 >> 7;
        int var14 = var7 * var11 - var5 * var9 >> 11;
        int var15 = class266.field4489.field3021 - var14 >> 7;
        if (arg1 != 81) {
            field638 = (class241) null;
        }
        if (class280.field4694 > 0 && class190.field3071[82] && class190.field3071[81]) {
            class151.method1036(class276.field4641 + var15, arg1 + 895969563, class79.field1127, class182.field2916 + var13);
            return;
        }
        boolean var16 = class240.method1623(1, true, (byte) 80, class266.field4489.field3020[0], 0, var13, 0, 0, class266.field4489.field3033[0], 0, 0, var15);
        if (!var16) {
            return;
        }
        class249.field4262.method1095(var5, -40);
        class249.field4262.method1095(var7, -125);
        class249.field4262.method1047(121, class71.field959);
        class249.field4262.method1095(57, -64);
        class249.field4262.method1095(class45.field551, arg1 - 108);
        class249.field4262.method1095(class70.field934, -95);
        class249.field4262.method1095(89, -120);
        class249.field4262.method1047(105, class266.field4489.field3027);
        class249.field4262.method1047(92, class266.field4489.field3021);
        class249.field4262.method1095(class8.field104, -86);
        class249.field4262.method1095(63, -40);
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "([III)V", line = 158)
    public final void method290(int[] arg0, int arg1, int arg2) {
        field650++;
        int var4 = class303.field5103[arg2] * this.field644;
        if (arg1 > -78) {
            return;
        }
        if (this.field647 == 1) {
            short var5 = this.field629[0];
            int var6 = this.field633[0] << 12;
            int var7 = this.field644 * var6 >> 12;
            int var8 = var4 * var6 >> 12;
            int var9 = this.field630 * var6 >> 12;
            int var10 = var8 >> 12;
            int var11 = var8 & 0xFFF;
            int var12 = this.field639[var10 & 0xFF] & 0xFF;
            int var13 = class229.field3703[var11];
            int var14 = var10 + 1;
            if (var7 <= var14) {
                var14 = 0;
            }
            int var15 = this.field639[var14 & 0xFF] & 0xFF;
            if (this.field645) {
                for (int var19 = 0; var19 < class187.field2961; var19++) {
                    int var20 = class73.field979[var19] * this.field630;
                    int var21 = this.method291(var9, var11, (byte) 63, var12, var13, var6 * var20 >> 12, var15);
                    int var22 = var5 * var21 >> 12;
                    arg0[var19] = (var22 >> 1) + 2048;
                }
            } else {
                for (int var16 = 0; var16 < class187.field2961; var16++) {
                    int var17 = class73.field979[var16] * this.field630;
                    int var18 = this.method291(var9, var11, (byte) 63, var12, var13, var6 * var17 >> 12, var15);
                    arg0[var16] = var5 * var18 >> 12;
                }
            }
            return;
        }
        short var23 = this.field629[0];
        if (var23 > 8 || var23 < -8) {
            int var24 = this.field633[0] << 12;
            int var25 = this.field644 * var24 >> 12;
            int var26 = var4 * var24 >> 12;
            int var27 = this.field630 * var24 >> 12;
            int var28 = var26 >> 12;
            int var29 = this.field639[var28 & 0xFF] & 0xFF;
            int var30 = var26 & 0xFFF;
            int var31 = var28 + 1;
            if (var31 >= var25) {
                var31 = 0;
            }
            int var32 = this.field639[var31 & 0xFF] & 0xFF;
            int var33 = class229.field3703[var30];
            for (int var34 = 0; var34 < class187.field2961; var34++) {
                int var35 = class73.field979[var34] * this.field630;
                int var36 = this.method291(var27, var30, (byte) 63, var29, var33, var24 * var35 >> 12, var32);
                arg0[var34] = var23 * var36 >> 12;
            }
        }
        for (int var37 = 1; var37 < this.field647; var37++) {
            short var38 = this.field629[var37];
            if (var38 > 8 || var38 < -8) {
                int var39 = this.field633[var37] << 12;
                int var40 = this.field630 * var39 >> 12;
                int var41 = var4 * var39 >> 12;
                int var42 = this.field644 * var39 >> 12;
                int var43 = var41 >> 12;
                int var44 = var41 & 0xFFF;
                int var45 = var43 + 1;
                int var46 = class229.field3703[var44];
                int var47 = this.field639[var43 & 0xFF] & 0xFF;
                if (var42 <= var45) {
                    var45 = 0;
                }
                int var48 = this.field639[var45 & 0xFF] & 0xFF;
                if (this.field645 && this.field647 - 1 == var37) {
                    for (int var49 = 0; var49 < class187.field2961; var49++) {
                        int var50 = class73.field979[var49] * this.field630;
                        int var51 = this.method291(var40, var44, (byte) 63, var47, var46, var39 * var50 >> 12, var48);
                        int var52 = (var38 * var51 >> 12) + arg0[var49];
                        arg0[var49] = (var52 >> 1) + 2048;
                    }
                } else {
                    for (int var53 = 0; var53 < class187.field2961; var53++) {
                        int var54 = class73.field979[var53] * this.field630;
                        int var55 = this.method291(var40, var44, (byte) 63, var47, var46, var39 * var54 >> 12, var48);
                        arg0[var53] += var38 * var55 >> 12;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(IIBIIII)I", line = 323)
    private final int method291(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6) {
        field635++;
        int var8 = arg1 - 4096;
        int var9 = arg5 >> 12;
        int var10 = var9 + 1;
        int var11 = arg5 & 0xFFF;
        int var12 = var9 & 0xFF;
        if (arg0 <= var10) {
            var10 = 0;
        }
        int var13 = var10 & 0xFF;
        if (arg2 != 63) {
            field638 = (class241) null;
        }
        int var14 = var11 - 4096;
        int var15 = this.field639[var12 + arg3] & 0x3;
        int var16 = class229.field3703[var11];
        int var17;
        if (var15 > 1) {
            var17 = var15 == 2 ? var11 - arg1 : -arg1 + -var11;
        } else {
            var17 = var15 == 0 ? var11 + arg1 : -var11 + arg1;
        }
        int var18 = this.field639[var13 + arg3] & 0x3;
        int var19;
        if (var18 <= 1) {
            var19 = var18 == 0 ? arg1 + var14 : -var14 + arg1;
        } else {
            var19 = var18 == 2 ? var14 - arg1 : -arg1 + -var14;
        }
        int var20 = ((var19 - var17) * var16 >> 12) + var17;
        int var21 = this.field639[var12 + arg6] & 0x3;
        int var22;
        if (var21 > 1) {
            var22 = var21 == 2 ? var11 - var8 : -var11 - var8;
        } else {
            var22 = var21 == 0 ? var8 + var11 : -var11 + var8;
        }
        int var23 = this.field639[arg6 + var13] & 0x3;
        int var24;
        if (var23 > 1) {
            var24 = var23 == 2 ? var14 - var8 : -var8 + -var14;
        } else {
            var24 = var23 == 0 ? var8 + var14 : -var14 + var8;
        }
        int var25 = ((var24 - var22) * var16 >> 12) + var22;
        return ((var25 - var20) * arg4 >> 12) + var20;
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(IZLj;)V", line = 403)
    public final void method19(int arg0, boolean arg1, class153 arg2) {
        if (arg1) {
            return;
        }
        field637++;
        if (arg0 == 0) {
            this.field645 = arg2.method1042((byte) 118) == 1;
        } else if (arg0 == 1) {
            this.field647 = arg2.method1042((byte) 86);
        } else if (arg0 == 2) {
            this.field642 = arg2.method1081((byte) -94);
            if (this.field642 < 0) {
                this.field629 = new short[this.field647];
                for (int var5 = 0; var5 < this.field647; var5++) {
                    this.field629[var5] = (short) arg2.method1081((byte) 109);
                }
            }
        } else if (arg0 == 3) {
            this.field630 = this.field644 = arg2.method1042((byte) -109);
        } else if (arg0 == 4) {
            this.field649 = arg2.method1042((byte) -40);
        } else if (arg0 == 5) {
            this.field630 = arg2.method1042((byte) -16);
        } else if (arg0 == 6) {
            this.field644 = arg2.method1042((byte) -28);
        }
    }

    @OriginalMember(owner = "client!bk", name = "<init>", descriptor = "()V", line = 494)
    public class52() {
        super(0, true);
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(Z)V", line = 504)
    public final void method80(boolean arg0) {
        this.field639 = class300.method2051(true, this.field649);
        field641++;
        this.method286(2);
        for (int var2 = this.field647 - 1; var2 >= 1; var2--) {
            short var3 = this.field629[var2];
            if (var3 > 8 || var3 < -8) {
                break;
            }
            this.field647--;
        }
        if (arg0) {
            this.field639 = (byte[]) null;
        }
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(BI)[I", line = 538)
    public final int[] method18(byte arg0, int arg1) {
        int[] var3 = this.field3613.method1866(1, arg1);
        int var4 = 21 / ((arg0 - 20) / 51);
        field631++;
        if (this.field3613.field4531) {
            this.method290(var3, -95, arg1);
        }
        return var3;
    }

    @OriginalMember(owner = "client!bk", name = "d", descriptor = "(Z)V", line = 582)
    public static void method292(boolean arg0) {
        if (arg0) {
            method292(true);
        }
        field638 = null;
        field643 = null;
        field634 = null;
    }
}
