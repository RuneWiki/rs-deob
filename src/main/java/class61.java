import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hl")
public class class61 extends class286 {

    @OriginalMember(owner = "client!hl", name = "S", descriptor = "Z")
    public boolean field840 = true;

    @OriginalMember(owner = "client!hl", name = "P", descriptor = "I")
    public int field837 = 4;

    @OriginalMember(owner = "client!hl", name = "T", descriptor = "I")
    public int field841 = 1638;

    @OriginalMember(owner = "client!hl", name = "U", descriptor = "I")
    public int field842 = 4;

    @OriginalMember(owner = "client!hl", name = "ab", descriptor = "I")
    public int field848 = 0;

    @OriginalMember(owner = "client!hl", name = "jb", descriptor = "[B")
    private byte[] field857 = new byte[512];

    @OriginalMember(owner = "client!hl", name = "mb", descriptor = "I")
    public int field860 = 4;

    @OriginalMember(owner = "client!hl", name = "kb", descriptor = "I")
    public static int field858 = -1;

    @OriginalMember(owner = "client!hl", name = "ib", descriptor = "I")
    public static int field856 = 0;

    @OriginalMember(owner = "client!hl", name = "lb", descriptor = "I")
    public static int field859 = 0;

    @OriginalMember(owner = "client!hl", name = "O", descriptor = "I")
    public static int field836;

    @OriginalMember(owner = "client!hl", name = "Q", descriptor = "I")
    public static int field838;

    @OriginalMember(owner = "client!hl", name = "R", descriptor = "I")
    public static int field839;

    @OriginalMember(owner = "client!hl", name = "W", descriptor = "I")
    public static int field844;

    @OriginalMember(owner = "client!hl", name = "X", descriptor = "I")
    public static int field845;

    @OriginalMember(owner = "client!hl", name = "Y", descriptor = "I")
    public static int field846;

    @OriginalMember(owner = "client!hl", name = "cb", descriptor = "I")
    public static int field850;

    @OriginalMember(owner = "client!hl", name = "db", descriptor = "I")
    public static int field851;

    @OriginalMember(owner = "client!hl", name = "fb", descriptor = "I")
    public static int field853;

    @OriginalMember(owner = "client!hl", name = "gb", descriptor = "I")
    public static int field854;

    @OriginalMember(owner = "client!hl", name = "hb", descriptor = "I")
    public static int field855;

    @OriginalMember(owner = "client!hl", name = "bb", descriptor = "Lek;")
    public static class172 field849;

    @OriginalMember(owner = "client!hl", name = "V", descriptor = "Lhe;")
    public static class87 field843;

    @OriginalMember(owner = "client!hl", name = "Z", descriptor = "[I")
    public static int[] field847;

    @OriginalMember(owner = "client!hl", name = "N", descriptor = "[S")
    private short[] field835;

    @OriginalMember(owner = "client!hl", name = "eb", descriptor = "[S")
    private short[] field852;

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(BIIIIII)I", line = 7)
    private final int method397(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field836++;
        int var8 = arg3 - 4096;
        int var9 = arg2 >> 12;
        int var10 = var9 + 1;
        int var11 = var9 & 0xFF;
        if (arg1 <= var10) {
            var10 = 0;
        }
        int var12 = arg2 & 0xFFF;
        int var13 = var10 & 0xFF;
        int var14 = var12 - 4096;
        int var15 = this.field857[arg5 + var11] & 0x3;
        int var16;
        if (var15 <= 1) {
            var16 = var15 == 0 ? var12 + arg3 : -var12 + arg3;
        } else {
            var16 = var15 == 2 ? var12 - arg3 : -var12 - arg3;
        }
        int var17 = class196.field3356[var12];
        if (arg0 != 95) {
            return -61;
        }
        int var18 = this.field857[arg5 + var13] & 0x3;
        int var19;
        if (var18 <= 1) {
            var19 = var18 == 0 ? arg3 + var14 : -var14 + arg3;
        } else {
            var19 = var18 == 2 ? var14 - arg3 : -arg3 + -var14;
        }
        int var20 = this.field857[arg4 + var11] & 0x3;
        int var21 = var16 + ((var19 - var16) * var17 >> 12);
        int var22;
        if (var20 <= 1) {
            var22 = var20 == 0 ? var12 + var8 : -var12 + var8;
        } else {
            var22 = var20 == 2 ? var12 - var8 : -var8 + -var12;
        }
        int var23 = this.field857[arg4 + var13] & 0x3;
        int var24;
        if (var23 <= 1) {
            var24 = var23 == 0 ? var8 + var14 : -var14 + var8;
        } else {
            var24 = var23 == 2 ? var14 - var8 : -var8 + -var14;
        }
        int var25 = ((var24 - var22) * var17 >> 12) + var22;
        return ((var25 - var21) * arg6 >> 12) + var21;
    }

    @OriginalMember(owner = "client!hl", name = "h", descriptor = "(I)V", line = 82)
    public static void method398(int arg0) {
        if (arg0 != -1921846484) {
            field844 = -6;
        }
        field843 = null;
        field847 = null;
        field849 = null;
    }

    @OriginalMember(owner = "client!hl", name = "e", descriptor = "(I)V", line = 94)
    public final void method276(int arg0) {
        field838++;
        if (arg0 != 3) {
            field858 = 112;
        }
        this.field857 = class69.method438(-112, this.field848);
        this.method400(false);
        for (int var2 = this.field842 - 1; var2 >= 1; var2--) {
            short var3 = this.field852[var2];
            if (var3 > 8 || var3 < -8) {
                break;
            }
            this.field842--;
        }
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(II[I)V", line = 123)
    public final void method399(int arg0, int arg1, int[] arg2) {
        field853++;
        if (arg0 != 26683) {
            return;
        }
        int var4 = class153.field2509[arg1] * this.field837;
        if (this.field842 == 1) {
            short var38 = this.field852[0];
            int var39 = this.field835[0] << 12;
            int var40 = var4 * var39 >> 12;
            int var41 = var40 >> 12;
            int var42 = var40 & 0xFFF;
            int var43 = var41 + 1;
            int var44 = this.field837 * var39 >> 12;
            int var45 = this.field860 * var39 >> 12;
            if (var44 <= var43) {
                var43 = 0;
            }
            int var46 = this.field857[var41 & 0xFF] & 0xFF;
            int var47 = class196.field3356[var42];
            int var48 = this.field857[var43 & 0xFF] & 0xFF;
            if (this.field840) {
                for (int var49 = 0; var49 < class27.field410; var49++) {
                    int var50 = class174.field2978[var49] * this.field860;
                    int var51 = this.method397((byte) 95, var45, var39 * var50 >> 12, var42, var48, var46, var47);
                    int var52 = var38 * var51 >> 12;
                    arg2[var49] = (var52 >> 1) + 2048;
                }
            } else {
                for (int var53 = 0; var53 < class27.field410; var53++) {
                    int var54 = class174.field2978[var53] * this.field860;
                    int var55 = this.method397((byte) 95, var45, var39 * var54 >> 12, var42, var48, var46, var47);
                    arg2[var53] = var38 * var55 >> 12;
                }
            }
            return;
        }
        short var5 = this.field852[0];
        if (var5 > 8 || var5 < -8) {
            int var6 = this.field835[0] << 12;
            int var7 = this.field860 * var6 >> 12;
            int var8 = this.field837 * var6 >> 12;
            int var9 = var4 * var6 >> 12;
            int var10 = var9 >> 12;
            int var11 = var10 + 1;
            int var12 = this.field857[var10 & 0xFF] & 0xFF;
            if (var11 >= var8) {
                var11 = 0;
            }
            int var13 = var9 & 0xFFF;
            int var14 = this.field857[var11 & 0xFF] & 0xFF;
            int var15 = class196.field3356[var13];
            for (int var16 = 0; var16 < class27.field410; var16++) {
                int var17 = class174.field2978[var16] * this.field860;
                int var18 = this.method397((byte) 95, var7, var6 * var17 >> 12, var13, var14, var12, var15);
                arg2[var16] = var5 * var18 >> 12;
            }
        }
        for (int var19 = 1; var19 < this.field842; var19++) {
            short var20 = this.field852[var19];
            if (var20 > 8 || var20 < -8) {
                int var21 = this.field835[var19] << 12;
                int var22 = this.field860 * var21 >> 12;
                int var23 = this.field837 * var21 >> 12;
                int var24 = var4 * var21 >> 12;
                int var25 = var24 >> 12;
                int var26 = var24 & 0xFFF;
                int var27 = class196.field3356[var26];
                int var28 = var25 + 1;
                int var29 = this.field857[var25 & 0xFF] & 0xFF;
                if (var28 >= var23) {
                    var28 = 0;
                }
                int var30 = this.field857[var28 & 0xFF] & 0xFF;
                if (this.field840 && (this.field842 - 1) == var19) {
                    for (int var31 = 0; var31 < class27.field410; var31++) {
                        int var32 = class174.field2978[var31] * this.field860;
                        int var33 = this.method397((byte) 95, var22, var21 * var32 >> 12, var26, var30, var29, var27);
                        int var34 = (var20 * var33 >> 12) + arg2[var31];
                        arg2[var31] = (var34 >> 1) + 2048;
                    }
                } else {
                    for (int var35 = 0; var35 < class27.field410; var35++) {
                        int var36 = class174.field2978[var35] * this.field860;
                        int var37 = this.method397((byte) 95, var22, var21 * var36 >> 12, var26, var30, var29, var27);
                        arg2[var35] += var20 * var37 >> 12;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!hl", name = "b", descriptor = "(Z)V", line = 281)
    private final void method400(boolean arg0) {
        field846++;
        if (this.field841 > 0) {
            this.field852 = new short[this.field842];
            this.field835 = new short[this.field842];
            for (int var3 = 0; var3 < this.field842; var3++) {
                this.field852[var3] = (short) ((int) (Math.pow((double) ((float) this.field841 / 4096.0F), (double) var3) * 4096.0D));
                this.field835[var3] = (short) ((int) Math.pow(2.0D, (double) var3));
            }
        } else if (this.field852 != null && this.field852.length == this.field842) {
            this.field835 = new short[this.field842];
            for (int var2 = 0; var2 < this.field842; var2++) {
                this.field835[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
            }
        }
        if (arg0) {
            this.field841 = -73;
        }
    }

    @OriginalMember(owner = "client!hl", name = "i", descriptor = "(I)V", line = 321)
    public static final void method401(int arg0) {
        class122.field2036 = new class69[class259.field4410.method1117(-1)][];
        field851++;
        class229.field3911 = new boolean[class259.field4410.method1117(-1)];
        if (arg0 < 10) {
            method401(1);
        }
    }

    @OriginalMember(owner = "client!hl", name = "<init>", descriptor = "()V", line = 333)
    public class61() {
        super(0, true);
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(Lfe;ZI)V", line = 338)
    public final void method19(class229 arg0, boolean arg1, int arg2) {
        field839++;
        if (arg1) {
            return;
        }
        if (arg2 == 0) {
            this.field840 = arg0.method1535((byte) 121) == 1;
        } else if (arg2 == 1) {
            this.field842 = arg0.method1535((byte) 96);
        } else if (arg2 == 2) {
            this.field841 = arg0.method1507(73);
            if (this.field841 < 0) {
                this.field852 = new short[this.field842];
                for (int var5 = 0; var5 < this.field842; var5++) {
                    this.field852[var5] = (short) arg0.method1507(73);
                }
            }
        } else if (arg2 == 3) {
            this.field860 = this.field837 = arg0.method1535((byte) 103);
        } else if (arg2 == 4) {
            this.field848 = arg0.method1535((byte) 118);
        } else if (arg2 == 5) {
            this.field860 = arg0.method1535((byte) 111);
        } else if (arg2 == 6) {
            this.field837 = arg0.method1535((byte) 113);
        }
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(II)[I", line = 435)
    public final int[] method14(int arg0, int arg1) {
        if (arg0 >= -52) {
            return (int[]) null;
        }
        field854++;
        int[] var3 = this.field4863.method1579(arg1, (byte) 90);
        if (this.field4863.field3984) {
            this.method399(26683, arg1, var3);
        }
        return var3;
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(ZZ)V", line = 456)
    public static final void method402(boolean arg0, boolean arg1) {
        if (!arg0) {
            class269.field4547 = arg1;
            class97.field1618 = !class96.method622((byte) 0);
            field855++;
        }
    }
}
