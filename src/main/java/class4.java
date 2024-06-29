import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jja")
public class class4 extends class334 {

    @OriginalMember(owner = "client!jja", name = "G", descriptor = "I")
    private int field52 = 4096;

    @OriginalMember(owner = "client!jja", name = "E", descriptor = "I")
    private int field50 = 3216;

    @OriginalMember(owner = "client!jja", name = "K", descriptor = "I")
    private int field56 = 3216;

    @OriginalMember(owner = "client!jja", name = "R", descriptor = "[I")
    private int[] field62 = new int[3];

    @OriginalMember(owner = "client!jja", name = "F", descriptor = "Lin;")
    public static class380 field51 = new class380(71, 1);

    @OriginalMember(owner = "client!jja", name = "N", descriptor = "[I")
    public static int[] field58 = new int[250];

    @OriginalMember(owner = "client!jja", name = "O", descriptor = "[I")
    public static int[] field59 = new int[] { 2, 1, 1, 1, 2, 2, 2, 1, 3, 3, 3, 2, 0, 4, 0 };

    @OriginalMember(owner = "client!jja", name = "Q", descriptor = "Lsi;")
    public static class769 field61 = new class769(16);

    @OriginalMember(owner = "client!jja", name = "H", descriptor = "I")
    public static int field53;

    @OriginalMember(owner = "client!jja", name = "I", descriptor = "I")
    public static int field54;

    @OriginalMember(owner = "client!jja", name = "J", descriptor = "I")
    public static int field55;

    @OriginalMember(owner = "client!jja", name = "M", descriptor = "I")
    public static int field57;

    @OriginalMember(owner = "client!jja", name = "P", descriptor = "Ljt;")
    public static class663 field60;

    @OriginalMember(owner = "client!jja", name = "<init>", descriptor = "()V")
    public class4() {
        super(1, true);
    }

    @OriginalMember(owner = "client!jja", name = "a", descriptor = "()V")
    public static final void method26() {
        byte var0 = 10;
        byte var1 = 30;
        if (class528.field7374 != 0 && class203.field3004 != null) {
            class29.field307.method422(class229.field3362);
            for (int var2 = 0; var2 < class456.field6222.length; ++var2) {
                class29.field307.method2774(class229.field3362[3] - class229.field3362[1], true, class456.field6222[var2] + class134.field2239[var2], -256, class229.field3362[1]);
            }
            for (int var3 = 0; var3 < class300.field4323; ++var3) {
                class131 var11 = class717.field10013[var3];
                class29.field307.method482(var11.field2212[0], var11.field2208[0], var11.field2211[0], class191.field2878);
                class29.field307.method482(var11.field2212[1], var11.field2208[1], var11.field2211[1], class266.field3770);
                class29.field307.method482(var11.field2212[2], var11.field2208[2], var11.field2211[2], class273.field3838);
                class29.field307.method482(var11.field2212[3], var11.field2208[3], var11.field2211[3], class436.field6069);
                if (class191.field2878[2] != -1 && class266.field3770[2] != -1 && class273.field3838[2] != -1 && class436.field6069[2] != -1) {
                    int var12 = -65536;
                    if (var11.field2216 == 4) {
                        var12 = -16776961;
                    }
                    class29.field307.method2769(class191.field2878[0], var12, class266.field3770[0], class266.field3770[1], class191.field2878[1], 7166);
                    class29.field307.method2769(class266.field3770[0], var12, class273.field3838[0], class273.field3838[1], class266.field3770[1], 7166);
                    class29.field307.method2769(class273.field3838[0], var12, class436.field6069[0], class436.field6069[1], class273.field3838[1], 7166);
                    class29.field307.method2769(class436.field6069[0], var12, class191.field2878[0], class191.field2878[1], class436.field6069[1], 7166);
                    class29.field307.method2769(class191.field2878[0], var12, class273.field3838[0], class273.field3838[1], class191.field2878[1], 7166);
                }
            }
            class203.field3004.method2628(-256, "Dynamic: " + class401.field5525 + "/" + 5000, var0, -96, var1 + 45, -16777216);
            class203.field3004.method2628(-256, "Total Opaque Onscreen: " + class761.field10539 + "/" + 10000, var0, -107, var1 + 60, -16777216);
            class203.field3004.method2628(-256, "Total Trans Onscreen: " + class502.field6879 + "/" + 5000, var0, -110, var1 + 75, -16777216);
            class203.field3004.method2628(-256, "Occluders: " + (class393.field5456 + class258.field3667) + " Active: " + class300.field4323, var0, -99, var1 + 90, -16777216);
            class203.field3004.method2628(-256, "Occluded: Ground:" + class107.field1535 + " Walls: " + class469.field6392 + " CPs: " + class222.field3263 + " Pixels: " + class414.field5685, var0, -107, var1 + 105, -16777216);
            class203.field3004.method2628(-256, "Occlude Calc Took: " + class438.field6081 / 1000L + "us", var0, -119, var1 + 120, -16777216);
            if (class528.field7374 == 2 && class116.field1991 != null) {
                for (int var4 = 0; var4 < class116.field1991.length; ++var4) {
                    float var6 = (float) class116.field1991[var4];
                    float var7 = var6 / 4194304.0F;
                    if (var7 > 1.0F) {
                        var7 = 1.0F;
                    }
                    float var8 = var7 * 255.0F;
                    float var9 = 255.0F - var8;
                    int var10 = (int) var9;
                    class116.field1991[var4] = var10 | var10 << 8 | var10 << 16 | -16777216;
                }
                class85 var5 = class29.field307.method2773(1, class597.field8526, class116.field1991, 0, class122.field2067, class597.field8526);
                var5.method6(var0, 170, 1, 0, 0);
            }
        }
    }

    @OriginalMember(owner = "client!jja", name = "b", descriptor = "(B)V")
    public final void method27(byte arg0) {
        this.method30(1);
        if (arg0 < -27) {
            ++field54;
        }
    }

    @OriginalMember(owner = "client!jja", name = "a", descriptor = "(II)[I")
    public final int[] method28(int arg0, int arg1) {
        ++field53;
        int[] var3 = super.field4743.method1027((byte) -112, arg0);
        if (arg1 != -22563988) {
            this.method27((byte) -52);
        }
        if (super.field4743.field1993) {
            int var4 = class495.field6796 * this.field52 >> 12;
            int[] var5 = this.method2052(0, 0, arg0 + -1 & class147.field2360);
            int[] var6 = this.method2052(0, 0, arg0);
            int[] var7 = this.method2052(0, 0, arg0 - -1 & class147.field2360);
            for (int var8 = 0; class439.field6099 > var8; ++var8) {
                int var9 = (var7[var8] + -var5[var8]) * var4 >> 12;
                int var10 = (var6[var8 - 1 & class478.field6578] + -var6[var8 + 1 & class478.field6578]) * var4 >> 12;
                int var11 = var10 >> 4;
                int var12 = var9 >> 4;
                if (var11 < 0) {
                    var11 = -var11;
                }
                if (var12 < 0) {
                    var12 = -var12;
                }
                if (var11 > 255) {
                    var11 = 255;
                }
                if (var12 > 255) {
                    var12 = 255;
                }
                int var13 = class191.field2867[((var12 + 1) * var12 >> 1) + var11] & 255;
                int var14 = var13 * 4096 >> 8;
                int var15 = var10 * var13 >> 8;
                int var16 = var9 * var13 >> 8;
                int var17 = this.field62[2] * var14 >> 12;
                int var18 = this.field62[0] * var15 >> 12;
                int var19 = this.field62[1] * var16 >> 12;
                var3[var8] = var17 + var18 - -var19;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!jja", name = "a", descriptor = "(IZLol;)V")
    public final void method29(int arg0, boolean arg1, class431 arg2) {
        if (arg0 != 0) {
            if (~arg0 != -2) {
                if (~arg0 == -3) {
                    this.field50 = arg2.method2565((byte) -112);
                }
            } else {
                this.field56 = arg2.method2565((byte) -112);
            }
        } else {
            this.field52 = arg2.method2565((byte) -126);
        }
        if (arg1) {
            method31((byte) 67);
        }
        ++field55;
    }

    @OriginalMember(owner = "client!jja", name = "g", descriptor = "(I)V")
    private final void method30(int arg0) {
        ++field57;
        double var2 = Math.cos((double) ((float) this.field50 / 4096.0F));
        this.field62[0] = (int) (var2 * Math.sin((double) ((float) this.field56 / 4096.0F)) * 4096.0D);
        this.field62[1] = (int) (4096.0D * var2 * Math.cos((double) ((float) this.field56 / 4096.0F)));
        this.field62[2] = (int) (4096.0D * Math.sin((double) ((float) this.field50 / 4096.0F)));
        int var4 = this.field62[0] * this.field62[0] >> 12;
        int var5 = this.field62[arg0] * this.field62[1] >> 12;
        int var6 = this.field62[2] * this.field62[2] >> 12;
        int var7 = (int) (4096.0D * Math.sqrt((double) (var4 - (-var5 + -var6) >> 12)));
        if (var7 != 0) {
            this.field62[1] = (this.field62[1] << 12) / var7;
            this.field62[0] = (this.field62[0] << 12) / var7;
            this.field62[2] = (this.field62[2] << 12) / var7;
        }
    }

    @OriginalMember(owner = "client!jja", name = "c", descriptor = "(B)V")
    public static void method31(byte arg0) {
        field58 = null;
        field61 = null;
        field59 = null;
        field60 = null;
        field51 = null;
        int var1 = 111 % ((arg0 - -41) / 44);
    }
}
