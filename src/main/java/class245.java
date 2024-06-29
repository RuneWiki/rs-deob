import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!le")
public class class245 extends class303 {

    @OriginalMember(owner = "client!le", name = "K", descriptor = "I")
    private int field3783 = 0;

    @OriginalMember(owner = "client!le", name = "M", descriptor = "I")
    private int field3785 = 1;

    @OriginalMember(owner = "client!le", name = "P", descriptor = "I")
    private int field3788 = 0;

    @OriginalMember(owner = "client!le", name = "H", descriptor = "I")
    public static int field3780 = 2;

    @OriginalMember(owner = "client!le", name = "O", descriptor = "Ljava/lang/String;")
    public static String field3787 = "purple:";

    @OriginalMember(owner = "client!le", name = "I", descriptor = "Lik;")
    public static class259 field3781 = new class259(100);

    @OriginalMember(owner = "client!le", name = "S", descriptor = "[B")
    public static byte[] field3791;

    @OriginalMember(owner = "client!le", name = "L", descriptor = "B")
    public static byte field3784;

    @OriginalMember(owner = "client!le", name = "G", descriptor = "I")
    public static int field3779;

    @OriginalMember(owner = "client!le", name = "J", descriptor = "I")
    public static int field3782;

    @OriginalMember(owner = "client!le", name = "N", descriptor = "I")
    public static int field3786;

    @OriginalMember(owner = "client!le", name = "R", descriptor = "I")
    public static int field3790;

    @OriginalMember(owner = "client!le", name = "T", descriptor = "I")
    public static int field3792;

    @OriginalMember(owner = "client!le", name = "Q", descriptor = "[Lje;")
    public static class74[] field3789;

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(Z)V", line = 5)
    public static void method1739(boolean arg0) {
        field3787 = null;
        field3791 = null;
        field3789 = null;
        field3781 = null;
        if (arg0) {
            field3789 = (class74[]) null;
        }
    }

    @OriginalMember(owner = "client!le", name = "b", descriptor = "(II)[I", line = 28)
    public final int[] method67(int arg0, int arg1) {
        if (arg0 != -3) {
            this.field3788 = -114;
        }
        field3786++;
        int[] var3 = this.field4763.method394(0, arg1);
        if (this.field4763.field863) {
            int var4 = class36.field591[arg1];
            int var5 = var4 - 2048 >> 1;
            for (int var6 = 0; var6 < class70.field1108; var6++) {
                int var7 = class291.field4427[var6];
                int var8 = var7 - 2048 >> 1;
                int var11;
                if (this.field3788 == 0) {
                    var11 = (var7 - var4) * this.field3785;
                } else {
                    int var9 = var5 * var5 + var8 * var8 >> 12;
                    int var10 = (int) (Math.sqrt((double) ((float) var9 / 4096.0F)) * 4096.0D);
                    var11 = (int) ((double) (this.field3785 * var10) * 3.141592653589793D);
                }
                int var12 = var11 - (var11 & 0xFFFFF000);
                if (this.field3783 == 0) {
                    var12 = class148.field2386[var12 >> 4 & 0xFF] + 4096 >> 1;
                } else if (this.field3783 == 2) {
                    var12 -= 2048;
                    if (var12 < 0) {
                        var12 = -var12;
                    }
                    var12 = 2048 - var12 << 1;
                }
                var3[var6] = var12;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!le", name = "<init>", descriptor = "()V", line = 91)
    public class245() {
        super(0, true);
    }

    static {
        int var0 = 0;
        field3791 = new byte[32896];
        for (int var1 = 0; var1 < 256; var1++) {
            for (int var2 = 0; var2 <= var1; var2++) {
                field3791[var0++] = (byte) ((int) (255.0D / Math.sqrt((double) ((float) (var2 * var2 + (var1 * var1 + 65535)) / 65535.0F))));
            }
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(ILpe;I)V", line = 108)
    public final void method65(int arg0, class101 arg1, int arg2) {
        if (arg2 == 0) {
            this.field3788 = arg1.method741(72);
        } else if (arg2 == 1) {
            this.field3783 = arg1.method741(104);
        } else if (arg2 == 3) {
            this.field3785 = arg1.method741(arg0 ^ 0xFFFFF000);
        }
        field3792++;
        if (arg0 != -4004) {
            this.field3785 = -78;
        }
    }

    @OriginalMember(owner = "client!le", name = "c", descriptor = "(II)V", line = 142)
    public static final void method1740(int arg0, int arg1) {
        field3779++;
        if (arg0 != -21863) {
            method1741(-88, (byte) 53, 34, 41, 16, -83, -32, 122, -112);
        }
        class4 var2 = class67.method510(1, 11, arg1);
        var2.method6(255);
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(IBIIIIIII)V", line = 174)
    public static final void method1741(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        int var9 = 53 % ((arg1 + 15) / 61);
        for (int var10 = 0; var10 < class43.field763.field3136; var10++) {
            if (class43.field763.method1443(true, var10)) {
                int var11 = class43.field763.field3139[var10] - class310.field4885;
                int var12 = class279.field4316 - (class43.field763.field3137[var10] + -class70.field1107) - 1;
                int var13 = class43.field763.method1438(var10, (byte) 81);
                int var14 = (arg3 - arg4) * (var12 - arg8) / (arg7 - arg8) + arg4;
                int var15 = arg5 + ((arg2 - arg5) * (var11 - arg6) / (arg0 - arg6));
                int var16 = 16777215;
                class241 var17 = null;
                if (var13 == 0) {
                    if ((double) class101.field1719 == 3.0D) {
                        var17 = class12.field229;
                    }
                    if ((double) class101.field1719 == 4.0D) {
                        var17 = class109.field1803;
                    }
                    if ((double) class101.field1719 == 6.0D) {
                        var17 = class141.field2239;
                    }
                    if ((double) class101.field1719 >= 8.0D) {
                        var17 = class240.field3735;
                    }
                }
                if (var13 == 1) {
                    if ((double) class101.field1719 == 3.0D) {
                        var17 = class141.field2239;
                    }
                    if ((double) class101.field1719 == 4.0D) {
                        var17 = class240.field3735;
                    }
                    if ((double) class101.field1719 == 6.0D) {
                        var17 = class61.field952;
                    }
                    if ((double) class101.field1719 >= 8.0D) {
                        var17 = class98.field1629;
                    }
                }
                if (var13 == 2) {
                    var16 = 16755200;
                    if ((double) class101.field1719 == 3.0D) {
                        var17 = class61.field952;
                    }
                    if ((double) class101.field1719 == 4.0D) {
                        var17 = class98.field1629;
                    }
                    if ((double) class101.field1719 == 6.0D) {
                        var17 = class170.field2647;
                    }
                    if ((double) class101.field1719 >= 8.0D) {
                        var17 = class216.field3455;
                    }
                }
                if (class43.field763.field3144[var10] != -1) {
                    var16 = class43.field763.field3144[var10];
                }
                if (var17 != null) {
                    int var18 = class127.field2035.method1018(class43.field763.field3131[var10], (int[]) null, class233.field3686);
                    int var19 = var14 - var17.method1715() * (var18 - 1) / 2;
                    int var20 = var19 + var17.method1716() / 2;
                    for (int var21 = 0; var21 < var18; var21++) {
                        String var22 = class233.field3686[var21];
                        if ((var18 - 1) > var21) {
                            var22 = var22.substring(0, var22.length() - 4);
                        }
                        var17.method1714(var22, var15, var20, var16, true);
                        var20 += var17.method1715();
                    }
                }
            }
        }
        field3790++;
    }

    @OriginalMember(owner = "client!le", name = "e", descriptor = "(I)V", line = 325)
    public final void method70(int arg0) {
        if (arg0 <= 13) {
            this.method65(16, (class101) null, -73);
        }
        field3782++;
        class226.method1635(4096);
    }
}
