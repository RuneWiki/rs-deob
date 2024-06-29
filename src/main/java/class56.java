import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eg")
public class class56 extends class115 {

    @OriginalMember(owner = "client!eg", name = "J", descriptor = "I")
    private int field628 = 4096;

    @OriginalMember(owner = "client!eg", name = "V", descriptor = "I")
    private int field639 = 3216;

    @OriginalMember(owner = "client!eg", name = "S", descriptor = "[I")
    private int[] field636 = new int[3];

    @OriginalMember(owner = "client!eg", name = "W", descriptor = "I")
    private int field640 = 3216;

    @OriginalMember(owner = "client!eg", name = "N", descriptor = "Ljf;")
    public static class119 field631 = null;

    @OriginalMember(owner = "client!eg", name = "O", descriptor = "[I")
    public static int[] field632 = new int[50];

    @OriginalMember(owner = "client!eg", name = "M", descriptor = "[[I")
    public static int[][] field630 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 4, 6 }, { 0, 2, 4 }, { 4, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 4, 7, 6 }, { 4, 7, 6, 0 }, { 0, 8, 6, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 4, 6, 10, 0 }, { 2, 4, 6, 0 } };

    @OriginalMember(owner = "client!eg", name = "Q", descriptor = "I")
    public static int field634 = 0;

    @OriginalMember(owner = "client!eg", name = "Y", descriptor = "I")
    public static int field642 = 0;

    @OriginalMember(owner = "client!eg", name = "Z", descriptor = "Z")
    public static boolean field643 = false;

    @OriginalMember(owner = "client!eg", name = "R", descriptor = "Z")
    public static boolean field635 = false;

    @OriginalMember(owner = "client!eg", name = "ab", descriptor = "[I")
    public static int[] field644 = new int[4096];

    @OriginalMember(owner = "client!eg", name = "L", descriptor = "I")
    public static int field629;

    @OriginalMember(owner = "client!eg", name = "P", descriptor = "I")
    public static int field633;

    @OriginalMember(owner = "client!eg", name = "T", descriptor = "I")
    public static int field637;

    @OriginalMember(owner = "client!eg", name = "U", descriptor = "I")
    public static int field638;

    @OriginalMember(owner = "client!eg", name = "X", descriptor = "I")
    public static int field641;

    @OriginalMember(owner = "client!eg", name = "bb", descriptor = "I")
    public static int field645;

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "()V")
    public static final void method322() {
        if (class384.field5629 != null) {
            for (int var0 = 0; var0 < class384.field5629.length; ++var0) {
                for (int var1 = 0; var1 < class158.field2245; ++var1) {
                    for (int var2 = 0; var2 < class52.field598; ++var2) {
                        if (class384.field5629[var0][var1][var2] != null) {
                            class384.field5629[var0][var1][var2].method1905(false);
                        }
                        class384.field5629[var0][var1][var2] = null;
                    }
                }
            }
        }
        class384.field5629 = null;
        class78.field887 = null;
        if (class379.field5582 != null) {
            for (int var3 = 0; var3 < class379.field5582.length; ++var3) {
                for (int var4 = 0; var4 < class158.field2245; ++var4) {
                    for (int var5 = 0; var5 < class52.field598; ++var5) {
                        if (class379.field5582[var3][var4][var5] != null) {
                            class379.field5582[var3][var4][var5].method1905(false);
                        }
                        class379.field5582[var3][var4][var5] = null;
                    }
                }
            }
        }
        class379.field5582 = null;
        class111.field1285 = null;
        class19.field202 = null;
        class132.field1814 = null;
        class135.field1899 = 0;
        if (class45.field547 != null) {
            for (int var6 = 0; var6 < class135.field1899; ++var6) {
                class45.field547[var6] = null;
            }
        }
        if (class300.field4276 != null) {
            for (int var7 = 0; var7 < class116.field1368; ++var7) {
                class300.field4276[var7] = null;
            }
            class116.field1368 = 0;
        }
        if (class256.field3438 != null) {
            for (int var8 = 0; var8 < class242.field3280; ++var8) {
                class256.field3438[var8] = null;
            }
            for (int var9 = 0; var9 < class52.field594; ++var9) {
                for (int var10 = 0; var10 < class158.field2245; ++var10) {
                    for (int var11 = 0; var11 < class52.field598; ++var11) {
                        class124.field1648[var9][var10][var11] = 0;
                    }
                }
            }
            class242.field3280 = 0;
        }
        class30.field275 = null;
        class264.method1686(false);
        class148.field2068.method1610(true);
        class341.field5015 = null;
        class41.field481 = null;
    }

    @OriginalMember(owner = "client!eg", name = "b", descriptor = "(II)[I")
    public final int[] method57(int arg0, int arg1) {
        ++field629;
        int[] var3 = super.field1340.method14(82, arg0);
        if (arg1 != 0) {
            method323(true);
        }
        if (super.field1340.field35) {
            int var4 = class196.field2673 * this.field628 >> 12;
            int[] var5 = this.method631(true, 0, arg0 + -1 & class315.field4488);
            int[] var6 = this.method631(true, 0, arg0);
            int[] var7 = this.method631(true, 0, class315.field4488 & arg0 - -1);
            for (int var8 = 0; class218.field2979 > var8; ++var8) {
                int var9 = (var7[var8] + -var5[var8]) * var4 >> 12;
                int var10 = (var6[var8 + -1 & class92.field1013] + -var6[var8 + 1 & class92.field1013]) * var4 >> 12;
                int var11 = var10 >> 4;
                int var12 = var9 >> 4;
                if (var11 < 0) {
                    var11 = -var11;
                }
                if (~var12 > -1) {
                    var12 = -var12;
                }
                if (var11 > 255) {
                    var11 = 255;
                }
                if (var12 > 255) {
                    var12 = 255;
                }
                int var13 = 255 & class318.field4501[((var12 - -1) * var12 >> 1) + var11];
                int var14 = var13 * 4096 >> 8;
                int var15 = var9 * var13 >> 8;
                int var16 = var10 * var13 >> 8;
                int var17 = this.field636[0] * var16 >> 12;
                int var18 = this.field636[2] * var14 >> 12;
                int var19 = this.field636[1] * var15 >> 12;
                var3[var8] = var17 + var19 + var18;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(BLbk;I)V")
    public final void method149(byte arg0, class211 arg1, int arg2) {
        if (arg0 > 83) {
            ++field633;
            if (~arg2 != -1) {
                if (~arg2 != -2) {
                    if (arg2 == 2) {
                        this.field639 = arg1.method1355(32136);
                    }
                } else {
                    this.field640 = arg1.method1355(32136);
                }
            } else {
                this.field628 = arg1.method1355(32136);
            }
        }
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(Z)V")
    public static void method323(boolean arg0) {
        field644 = null;
        field632 = null;
        if (!arg0) {
            field642 = -97;
        }
        field631 = null;
        field630 = null;
    }

    @OriginalMember(owner = "client!eg", name = "e", descriptor = "(B)V")
    private final void method324(byte arg0) {
        ++field638;
        double var2 = Math.cos((double) ((float) this.field639 / 4096.0F));
        this.field636[0] = (int) (var2 * Math.sin((double) ((float) this.field640 / 4096.0F)) * 4096.0D);
        this.field636[1] = (int) (var2 * Math.cos((double) ((float) this.field640 / 4096.0F)) * 4096.0D);
        if (arg0 != -110) {
            this.method140(106);
        }
        this.field636[2] = (int) (4096.0D * Math.sin((double) ((float) this.field639 / 4096.0F)));
        int var4 = this.field636[0] * this.field636[0] >> 12;
        int var5 = this.field636[1] * this.field636[1] >> 12;
        int var6 = this.field636[2] * this.field636[2] >> 12;
        int var7 = (int) (Math.sqrt((double) (var4 + var5 + var6 >> 12)) * 4096.0D);
        if (var7 != 0) {
            this.field636[1] = (this.field636[1] << 12) / var7;
            this.field636[2] = (this.field636[2] << 12) / var7;
            this.field636[0] = (this.field636[0] << 12) / var7;
        }
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(III)B")
    public static final byte method325(int arg0, int arg1, int arg2) {
        ++field645;
        if (~arg1 != -10) {
            return 0;
        } else {
            return (byte) ((1 & arg2) == arg0 ? 1 : 2);
        }
    }

    @OriginalMember(owner = "client!eg", name = "<init>", descriptor = "()V")
    public class56() {
        super(1, true);
    }

    @OriginalMember(owner = "client!eg", name = "d", descriptor = "(I)V")
    public final void method140(int arg0) {
        ++field641;
        if (arg0 == 0) {
            this.method324((byte) -110);
        }
    }
}
