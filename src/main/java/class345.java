import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vo")
public class class345 {

    @OriginalMember(owner = "client!vo", name = "C", descriptor = "Lpq;")
    private class171 field4869 = null;

    @OriginalMember(owner = "client!vo", name = "i", descriptor = "I")
    public int field4849;

    @OriginalMember(owner = "client!vo", name = "n", descriptor = "Lts;")
    private class35 field4854;

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "Z")
    private boolean field4841;

    @OriginalMember(owner = "client!vo", name = "z", descriptor = "Lel;")
    public static class3 field4866 = new class3();

    @OriginalMember(owner = "client!vo", name = "S", descriptor = "I")
    public static int field4885 = 0;

    @OriginalMember(owner = "client!vo", name = "Q", descriptor = "F")
    public static float field4883;

    @OriginalMember(owner = "client!vo", name = "b", descriptor = "I")
    public static int field4842;

    @OriginalMember(owner = "client!vo", name = "c", descriptor = "I")
    public static int field4843;

    @OriginalMember(owner = "client!vo", name = "f", descriptor = "I")
    public static int field4846;

    @OriginalMember(owner = "client!vo", name = "g", descriptor = "I")
    public static int field4847;

    @OriginalMember(owner = "client!vo", name = "h", descriptor = "I")
    public static int field4848;

    @OriginalMember(owner = "client!vo", name = "j", descriptor = "I")
    public static int field4850;

    @OriginalMember(owner = "client!vo", name = "k", descriptor = "I")
    public static int field4851;

    @OriginalMember(owner = "client!vo", name = "l", descriptor = "I")
    public static int field4852;

    @OriginalMember(owner = "client!vo", name = "m", descriptor = "I")
    public static int field4853;

    @OriginalMember(owner = "client!vo", name = "o", descriptor = "I")
    public static int field4855;

    @OriginalMember(owner = "client!vo", name = "p", descriptor = "I")
    public static int field4856;

    @OriginalMember(owner = "client!vo", name = "q", descriptor = "I")
    public static int field4857;

    @OriginalMember(owner = "client!vo", name = "r", descriptor = "I")
    public static int field4858;

    @OriginalMember(owner = "client!vo", name = "s", descriptor = "I")
    public static int field4859;

    @OriginalMember(owner = "client!vo", name = "t", descriptor = "I")
    public static int field4860;

    @OriginalMember(owner = "client!vo", name = "u", descriptor = "I")
    public static int field4861;

    @OriginalMember(owner = "client!vo", name = "v", descriptor = "I")
    public static int field4862;

    @OriginalMember(owner = "client!vo", name = "w", descriptor = "I")
    public static int field4863;

    @OriginalMember(owner = "client!vo", name = "x", descriptor = "I")
    public static int field4864;

    @OriginalMember(owner = "client!vo", name = "y", descriptor = "I")
    public static int field4865;

    @OriginalMember(owner = "client!vo", name = "A", descriptor = "I")
    public static int field4867;

    @OriginalMember(owner = "client!vo", name = "B", descriptor = "I")
    public static int field4868;

    @OriginalMember(owner = "client!vo", name = "D", descriptor = "I")
    public static int field4870;

    @OriginalMember(owner = "client!vo", name = "E", descriptor = "I")
    public static int field4871;

    @OriginalMember(owner = "client!vo", name = "F", descriptor = "I")
    public static int field4872;

    @OriginalMember(owner = "client!vo", name = "G", descriptor = "I")
    public static int field4873;

    @OriginalMember(owner = "client!vo", name = "H", descriptor = "I")
    public static int field4874;

    @OriginalMember(owner = "client!vo", name = "I", descriptor = "I")
    public static int field4875;

    @OriginalMember(owner = "client!vo", name = "J", descriptor = "I")
    public static int field4876;

    @OriginalMember(owner = "client!vo", name = "K", descriptor = "I")
    public static int field4877;

    @OriginalMember(owner = "client!vo", name = "L", descriptor = "I")
    public static int field4878;

    @OriginalMember(owner = "client!vo", name = "M", descriptor = "I")
    public static int field4879;

    @OriginalMember(owner = "client!vo", name = "N", descriptor = "I")
    public static int field4880;

    @OriginalMember(owner = "client!vo", name = "O", descriptor = "I")
    public static int field4881;

    @OriginalMember(owner = "client!vo", name = "P", descriptor = "I")
    public static int field4882;

    @OriginalMember(owner = "client!vo", name = "R", descriptor = "I")
    public static int field4884;

    @OriginalMember(owner = "client!vo", name = "e", descriptor = "[Ljava/lang/Object;")
    private Object[] field4845;

    @OriginalMember(owner = "client!vo", name = "d", descriptor = "[[Ljava/lang/Object;")
    private Object[][] field4844;

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(ZZZ)V")
    public final void method2067(boolean arg0, boolean arg1, boolean arg2) {
        field4863++;
        if (!arg2) {
            this.field4849 = 19;
        }
        if (!this.method2100(-16777216)) {
            return;
        }
        if (arg1) {
            this.field4869.field2773 = null;
            this.field4869.field2767 = null;
        }
        if (arg0) {
            this.field4869.field2777 = null;
            this.field4869.field2760 = null;
        }
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(Ljava/lang/String;I)Z")
    public final boolean method2068(String arg0, int arg1) {
        field4872++;
        if (arg1 != 0) {
            this.field4869 = null;
        }
        int var3 = this.method2083(2, "");
        return var3 == -1 ? this.method2085(arg0, 100, "") : this.method2085("", 100, arg0);
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(II)V")
    public final void method2069(int arg0, int arg1) {
        field4879++;
        if (arg0 == 0 && this.method2074(arg1, -20099) && this.field4844 != null) {
            this.field4844[arg1] = null;
        }
    }

    @OriginalMember(owner = "client!vo", name = "b", descriptor = "(II)I")
    public final int method2070(int arg0, int arg1) {
        field4860++;
        if (!this.method2100(arg1 ^ 0xFFFFFF)) {
            return -1;
        }
        if (arg1 != -1) {
            this.method2093(-70, true);
        }
        int var3 = this.field4869.field2777.method3067((byte) 80, arg0);
        return this.method2074(var3, -20099) ? var3 : -1;
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(BILr;IIILfa;)V")
    public static final void method2071(byte arg0, int arg1, class98 arg2, int arg3, int arg4, int arg5, class615 arg6) {
        field4875++;
        if (class238.field3515 < 100) {
            class314.method1898(arg2, 88, arg6);
        }
        arg2.method771(arg4, arg1, arg4 + arg5, arg1 - -arg3);
        if (class238.field3515 < 100) {
            byte var7 = 20;
            int var8 = arg4 + (arg5 / 2);
            arg2.method824(arg4, arg1, arg5, arg3, -16777216, 0);
            int var9 = arg1 - var7 - (-(arg3 / 2) + 18);
            arg2.method791(var8 - 152, var9, 304, 34, class16.field254[class446.field6456].getRGB(), 0);
            arg2.method824(var8 - 150, var9 - -2, class238.field3515 * 3, 30, class505.field7506[class446.field6456].getRGB(), 0);
            class148.field2503.method2399(class82.field1258[class446.field6456].getRGB(), var8, var7 + var9, -1, class343.field4767.method2059(class238.field3511, true), (byte) 109);
            return;
        }
        int var10 = class404.field5808 - (int) ((float) arg5 / class161.field2616);
        int var11 = class438.field6298 + ((int) ((float) arg3 / class161.field2616));
        if (arg0 != -65) {
            method2080((byte) 65);
        }
        int var12 = (int) ((float) arg5 / class161.field2616) + class404.field5808;
        int var13 = class438.field6298 - ((int) ((float) arg3 / class161.field2616));
        class500.field7430 = (int) ((float) (arg5 * 2) / class161.field2616);
        class123.field2007 = class404.field5808 - ((int) ((float) arg5 / class161.field2616));
        class556.field8141 = class438.field6298 - (int) ((float) arg3 / class161.field2616);
        class259.field3710 = (int) ((float) (arg3 * 2) / class161.field2616);
        class161.method1210(class161.field2628 + var10, class161.field2636 + var11, var12 + class161.field2628, class161.field2636 + var13, arg4, arg1, arg4 + arg5, arg1 - (-arg3 + -1));
        class161.method1208(arg2);
        class692 var14 = class161.method1226(arg2);
        class443.method2589(0, arg2, var14, 0, arg0 ^ 0xFFFFFFBE);
        if (class440.field6371 > 0) {
            class106.field1751--;
            if (class106.field1751 == 0) {
                class106.field1751 = 20;
                class440.field6371--;
            }
        }
        if (!class570.field8319) {
            return;
        }
        int var15 = arg4 + arg5 - 5;
        int var16 = arg1 + arg3 - 8;
        class335.field4670.method2403(63409608, 16776960, var16, var15, -1, "Fps:" + class327.field4548);
        int var20 = var16 - 15;
        Runtime var17 = Runtime.getRuntime();
        int var18 = (int) ((var17.totalMemory() - var17.freeMemory()) / 1024L);
        int var19 = 16776960;
        if (var18 > 65536) {
            var19 = 16711680;
        }
        class335.field4670.method2403(63409608, var19, var20, var15, -1, "Mem:" + var18 + "k");
        var16 = var20 - 15;
    }

    @OriginalMember(owner = "client!vo", name = "b", descriptor = "(Ljava/lang/String;I)Z")
    public final boolean method2072(String arg0, int arg1) {
        if (arg1 != -6257) {
            return true;
        }
        field4880++;
        if (this.method2100(arg1 - 16770959)) {
            String var3 = arg0.toLowerCase();
            int var4 = this.field4869.field2777.method3067((byte) 86, class88.method656(arg1 + 6243, var3));
            return this.method2101((byte) -59, var4);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(BLjava/lang/String;Ljava/lang/String;)[B")
    public final byte[] method2073(byte arg0, String arg1, String arg2) {
        field4850++;
        if (arg0 <= 48) {
            field4882 = -48;
        }
        if (!this.method2100(-16777216)) {
            return null;
        }
        String var4 = arg2.toLowerCase();
        String var5 = arg1.toLowerCase();
        int var6 = this.field4869.field2777.method3067((byte) 51, class88.method656(-122, var4));
        if (this.method2074(var6, -20099)) {
            int var7 = this.field4869.field2773[var6].method3067((byte) 90, class88.method656(-126, var5));
            return this.method2081(-124, var7, var6);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!vo", name = "c", descriptor = "(II)Z")
    private final boolean method2074(int arg0, int arg1) {
        if (arg1 != -20099) {
            field4882 = 120;
        }
        field4864++;
        if (!this.method2100(-16777216)) {
            return false;
        } else if (arg0 >= 0 && this.field4869.field2757.length > arg0 && this.field4869.field2757[arg0] != 0) {
            return true;
        } else if (class546.field8016) {
            throw new IllegalArgumentException(Integer.toString(arg0));
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(III[I)[B")
    public final byte[] method2075(int arg0, int arg1, int arg2, int[] arg3) {
        field4842++;
        if (!this.method2090(arg0, arg2, -90)) {
            return null;
        }
        if (this.field4844[arg2] == null || this.field4844[arg2][arg0] == null) {
            boolean var5 = this.method2082((byte) 78, arg0, arg3, arg2);
            if (!var5) {
                this.method2088(arg2, 0);
                boolean var6 = this.method2082((byte) 49, arg0, arg3, arg2);
                if (!var6) {
                    return null;
                }
            }
        }
        byte[] var7 = class600.method3420(this.field4844[arg2][arg0], false, false);
        int var8 = 81 % ((arg1 + 36) / 37);
        if (this.field4849 == 1) {
            this.field4844[arg2][arg0] = null;
            if (this.field4869.field2757[arg2] == 1) {
                this.field4844[arg2] = null;
            }
        } else if (this.field4849 == 2) {
            this.field4844[arg2] = null;
        }
        return var7;
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(I)Z")
    public final boolean method2076(int arg0) {
        field4871++;
        if (!this.method2100(-16777216)) {
            return false;
        }
        boolean var2 = true;
        for (int var3 = 0; var3 < this.field4869.field2761.length; var3++) {
            int var4 = this.field4869.field2761[var3];
            if (this.field4845[var4] == null) {
                this.method2088(var4, 0);
                if (this.field4845[var4] == null) {
                    var2 = false;
                }
            }
        }
        if (arg0 < 66) {
            field4883 = -1.5047107F;
        }
        return var2;
    }

    @OriginalMember(owner = "client!vo", name = "d", descriptor = "(II)Z")
    public final boolean method2077(int arg0, int arg1) {
        field4853++;
        if (!this.method2100(-16777216)) {
            return false;
        } else if (this.field4869.field2757.length == 1) {
            return this.method2089(0, -128, arg1);
        } else if (this.method2074(arg1, -20099)) {
            if (arg0 != 0) {
                field4882 = -103;
            }
            if (this.field4869.field2757[arg1] != 1) {
                throw new RuntimeException();
            }
            return this.method2089(arg1, arg0 ^ 0xFFFFFF80, 0);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!vo", name = "b", descriptor = "(I)V")
    public final void method2078(int arg0) {
        if (this.field4845 != null) {
            for (int var2 = 0; var2 < this.field4845.length; var2++) {
                this.field4845[var2] = null;
            }
        }
        field4865++;
        if (arg0 != 0) {
            method2071((byte) -33, -117, null, 89, 1, 35, null);
        }
    }

    @OriginalMember(owner = "client!vo", name = "c", descriptor = "(I)I")
    public final int method2079(int arg0) {
        field4884++;
        if (!this.method2100(-16777216)) {
            return 0;
        }
        int var2 = arg0;
        int var3 = 0;
        for (int var4 = 0; var4 < this.field4845.length; var4++) {
            if (this.field4869.field2772[var4] > 0) {
                var3 += this.method2094(var4, false);
                var2 += 100;
            }
        }
        if (var2 == 0) {
            return 100;
        } else {
            return var3 * 100 / var2;
        }
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(B)V")
    public static void method2080(byte arg0) {
        field4866 = null;
        int var1 = -33 % ((arg0 + 7) / 36);
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(III)[B")
    public final byte[] method2081(int arg0, int arg1, int arg2) {
        int var4 = -123 % ((-arg0 - 79) / 44);
        field4877++;
        return this.method2075(arg1, -81, arg2, null);
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(BI[II)Z")
    private final boolean method2082(byte arg0, int arg1, int[] arg2, int arg3) {
        field4876++;
        if (!this.method2074(arg3, -20099)) {
            return false;
        } else if (this.field4845[arg3] == null) {
            return false;
        } else {
            int var5 = this.field4869.field2772[arg3];
            int[] var6 = this.field4869.field2765[arg3];
            if (this.field4844[arg3] == null) {
                this.field4844[arg3] = new Object[this.field4869.field2757[arg3]];
            }
            Object[] var7 = this.field4844[arg3];
            if (arg0 < 44) {
                this.method2094(-74, true);
            }
            boolean var8 = true;
            for (int var9 = 0; var9 < var5; var9++) {
                int var10;
                if (var6 == null) {
                    var10 = var9;
                } else {
                    var10 = var6[var9];
                }
                if (var7[var10] == null) {
                    var8 = false;
                    break;
                }
            }
            if (var8) {
                return true;
            }
            byte[] var11;
            if (arg2 != null && (arg2[0] != 0 || arg2[1] != 0 || arg2[2] != 0 || arg2[3] != 0)) {
                var11 = class600.method3420(this.field4845[arg3], false, true);
                class465 var12 = new class465(var11);
                var12.method2726(var12.field6719.length, arg2, 97, 5);
            } else {
                var11 = class600.method3420(this.field4845[arg3], false, false);
            }
            byte[] var13;
            try {
                var13 = class447.method2607(var11, (byte) 77);
            } catch (RuntimeException var49) {
                throw class603.method3432(var49, "T3 - " + (arg2 != null) + "," + arg3 + "," + var11.length + "," + class304.method1858(var11.length, -12498, var11) + "," + class304.method1858(var11.length - 2, -12498, var11) + "," + this.field4869.field2762[arg3] + "," + this.field4869.field2758);
            }
            if (this.field4841) {
                this.field4845[arg3] = null;
            }
            if (var5 <= 1) {
                int var15;
                if (var6 == null) {
                    var15 = 0;
                } else {
                    var15 = var6[0];
                }
                if (this.field4849 == 0) {
                    var7[var15] = class8.method32((byte) -69, false, var13);
                } else {
                    var7[var15] = var13;
                }
            } else if (this.field4849 == 2) {
                int var32 = var13.length;
                int var51 = var32 - 1;
                int var33 = var13[var51] & 0xFF;
                int var34 = var51 - var5 * var33 * 4;
                class465 var35 = new class465(var13);
                int var36 = 0;
                int var37 = 0;
                var35.field6710 = var34;
                for (int var38 = 0; var38 < var33; var38++) {
                    int var39 = 0;
                    for (int var40 = 0; var40 < var5; var40++) {
                        var39 += var35.method2691((byte) -67);
                        int var41;
                        if (var6 == null) {
                            var41 = var40;
                        } else {
                            var41 = var6[var40];
                        }
                        if (arg1 == var41) {
                            var37 = var41;
                            var36 += var39;
                        }
                    }
                }
                if (var36 == 0) {
                    return true;
                }
                byte[] var42 = new byte[var36];
                int var43 = 0;
                var35.field6710 = var34;
                int var44 = 0;
                for (int var45 = 0; var45 < var33; var45++) {
                    int var46 = 0;
                    for (int var47 = 0; var47 < var5; var47++) {
                        var46 += var35.method2691((byte) -67);
                        int var48;
                        if (var6 == null) {
                            var48 = var47;
                        } else {
                            var48 = var6[var47];
                        }
                        if (arg1 == var48) {
                            class553.method3242(var13, var44, var42, var43, var46);
                            var43 += var46;
                        }
                        var44 += var46;
                    }
                }
                var7[var37] = var42;
            } else {
                int var16 = var13.length;
                int var50 = var16 - 1;
                int var17 = var13[var50] & 0xFF;
                int var18 = var50 - var5 * var17 * 4;
                class465 var19 = new class465(var13);
                var19.field6710 = var18;
                int[] var20 = new int[var5];
                for (int var21 = 0; var21 < var17; var21++) {
                    int var22 = 0;
                    for (int var23 = 0; var23 < var5; var23++) {
                        var22 += var19.method2691((byte) -67);
                        var20[var23] += var22;
                    }
                }
                byte[][] var24 = new byte[var5][];
                for (int var25 = 0; var25 < var5; var25++) {
                    var24[var25] = new byte[var20[var25]];
                    var20[var25] = 0;
                }
                var19.field6710 = var18;
                int var26 = 0;
                for (int var27 = 0; var27 < var17; var27++) {
                    int var28 = 0;
                    for (int var29 = 0; var29 < var5; var29++) {
                        var28 += var19.method2691((byte) -67);
                        class553.method3242(var13, var26, var24[var29], var20[var29], var28);
                        var20[var29] += var28;
                        var26 += var28;
                    }
                }
                for (int var30 = 0; var30 < var5; var30++) {
                    int var31;
                    if (var6 == null) {
                        var31 = var30;
                    } else {
                        var31 = var6[var30];
                    }
                    if (this.field4849 == 0) {
                        var7[var31] = class8.method32((byte) -69, false, var24[var30]);
                    } else {
                        var7[var31] = var24[var30];
                    }
                }
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(ILjava/lang/String;)I")
    public final int method2083(int arg0, String arg1) {
        if (arg0 != 2) {
            this.field4845 = null;
        }
        field4861++;
        if (this.method2100(arg0 ^ 0xFF000002)) {
            String var3 = arg1.toLowerCase();
            int var4 = this.field4869.field2777.method3067((byte) 59, class88.method656(-34, var3));
            return this.method2074(var4, arg0 - 20101) ? var4 : -1;
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(ZLjava/lang/String;)I")
    public final int method2084(boolean arg0, String arg1) {
        field4862++;
        if (!this.method2100(-16777216)) {
            return 0;
        }
        String var3 = arg1.toLowerCase();
        if (arg0) {
            return -29;
        } else {
            int var4 = this.field4869.field2777.method3067((byte) 64, class88.method656(-30, var3));
            return this.method2094(var4, false);
        }
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;)Z")
    private final boolean method2085(String arg0, int arg1, String arg2) {
        field4858++;
        if (arg1 != 100) {
            this.method2084(true, null);
        }
        if (!this.method2100(-16777216)) {
            return false;
        }
        String var4 = arg0.toLowerCase();
        String var5 = arg2.toLowerCase();
        int var6 = this.field4869.field2777.method3067((byte) 66, class88.method656(-16, var4));
        if (this.method2074(var6, -20099)) {
            int var7 = this.field4869.field2773[var6].method3067((byte) 87, class88.method656(-27, var5));
            return this.method2089(var6, -127, var7);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!vo", name = "e", descriptor = "(II)[B")
    public final byte[] method2086(int arg0, int arg1) {
        field4878++;
        if (!this.method2100(-16777216)) {
            return null;
        } else if (this.field4869.field2757.length == 1) {
            return this.method2081(arg0 - 1148, arg1, 0);
        } else if (!this.method2074(arg1, -20099)) {
            return null;
        } else if (this.field4869.field2757[arg1] == 1) {
            return this.method2081(21, 0, arg1);
        } else if (arg0 == 1024) {
            throw new RuntimeException();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(BLjava/lang/String;)Z")
    public final boolean method2087(byte arg0, String arg1) {
        field4848++;
        if (this.method2100(-16777216)) {
            int var3 = 118 % ((arg0 - 40) / 63);
            String var4 = arg1.toLowerCase();
            int var5 = this.field4869.field2777.method3067((byte) 90, class88.method656(-55, var4));
            return var5 >= 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!vo", name = "f", descriptor = "(II)V")
    private final void method2088(int arg0, int arg1) {
        if (arg1 != 0) {
            this.method2094(98, false);
        }
        field4859++;
        if (this.field4841) {
            this.field4845[arg0] = this.field4854.method304(arg0, 122);
        } else {
            this.field4845[arg0] = class8.method32((byte) -69, false, this.field4854.method304(arg0, 113));
        }
    }

    @OriginalMember(owner = "client!vo", name = "b", descriptor = "(III)Z")
    public final boolean method2089(int arg0, int arg1, int arg2) {
        field4846++;
        if (!this.method2090(arg2, arg0, -65)) {
            return false;
        } else if (this.field4844[arg0] != null && this.field4844[arg0][arg2] != null) {
            return true;
        } else if (this.field4845[arg0] == null) {
            this.method2088(arg0, 0);
            if (arg1 >= -121) {
                this.method2069(-66, -65);
            }
            return this.field4845[arg0] != null;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!vo", name = "c", descriptor = "(III)Z")
    private final boolean method2090(int arg0, int arg1, int arg2) {
        field4857++;
        if (arg2 > -62) {
            this.method2101((byte) -73, 75);
        }
        if (!this.method2100(-16777216)) {
            return false;
        } else if (arg1 >= 0 && arg0 >= 0 && this.field4869.field2757.length > arg1 && arg0 < this.field4869.field2757[arg1]) {
            return true;
        } else if (class546.field8016) {
            throw new IllegalArgumentException(arg1 + "," + arg0);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!vo", name = "b", descriptor = "(B)I")
    public final int method2091(byte arg0) {
        field4874++;
        if (!this.method2100(-16777216)) {
            throw new IllegalStateException("");
        }
        return arg0 == -45 ? this.field4869.field2758 : 97;
    }

    @OriginalMember(owner = "client!vo", name = "c", descriptor = "(Ljava/lang/String;I)V")
    public final void method2092(String arg0, int arg1) {
        field4856++;
        if (!this.method2100(arg1 ^ 0xFFE712)) {
            return;
        }
        String var3 = arg0.toLowerCase();
        int var4 = this.field4869.field2777.method3067((byte) 77, class88.method656(-67, var3));
        this.method2096(var4, -1);
        if (arg1 != -6382) {
            this.field4845 = null;
        }
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(IZ)[I")
    public final int[] method2093(int arg0, boolean arg1) {
        field4852++;
        if (!this.method2074(arg0, -20099)) {
            return null;
        }
        if (arg1) {
            this.method2086(36, 65);
        }
        int[] var3 = this.field4869.field2765[arg0];
        if (var3 == null) {
            var3 = new int[this.field4869.field2772[arg0]];
            int var4 = 0;
            while (var3.length > var4) {
                var3[var4] = var4++;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!vo", name = "b", descriptor = "(IZ)I")
    private final int method2094(int arg0, boolean arg1) {
        if (arg1) {
            this.field4841 = true;
        }
        field4851++;
        if (this.method2074(arg0, -20099)) {
            return this.field4845[arg0] == null ? this.field4854.method303(arg0, -87) : 100;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(IIIIB)V")
    public static final void method2095(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        if (arg4 != -23) {
            method2071((byte) 101, -78, null, 13, -4, -75, null);
        }
        for (int var5 = 0; var5 < class43.field586; var5++) {
            Rectangle var6 = class50.field666[var5];
            if (var6.x + var6.width > arg0 && arg0 + arg2 > var6.x && arg1 < var6.y + var6.height && (arg1 + arg3) > var6.y) {
                class221.field3297[var5] = true;
            }
        }
        field4873++;
    }

    @OriginalMember(owner = "client!vo", name = "g", descriptor = "(II)V")
    private final void method2096(int arg0, int arg1) {
        if (arg1 == -1) {
            this.field4854.method306(-108, arg0);
            field4867++;
        }
    }

    @OriginalMember(owner = "client!vo", name = "d", descriptor = "(I)V")
    public final void method2097(int arg0) {
        if (arg0 >= -31) {
            return;
        }
        field4881++;
        if (this.field4844 != null) {
            for (int var2 = 0; var2 < this.field4844.length; var2++) {
                this.field4844[var2] = null;
            }
        }
    }

    @OriginalMember(owner = "client!vo", name = "h", descriptor = "(II)I")
    public final int method2098(int arg0, int arg1) {
        if (arg0 == 0) {
            field4847++;
            return this.method2074(arg1, arg0 ^ 0xFFFFB17D) ? this.field4869.field2757[arg1] : 0;
        } else {
            return -15;
        }
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(Ljava/lang/String;ZLjava/lang/String;)Z")
    public final boolean method2099(String arg0, boolean arg1, String arg2) {
        field4870++;
        if (!this.method2100(-16777216)) {
            return false;
        }
        if (arg1) {
            this.method2098(90, 10);
        }
        String var4 = arg0.toLowerCase();
        String var5 = arg2.toLowerCase();
        int var6 = this.field4869.field2777.method3067((byte) 51, class88.method656(-64, var4));
        if (var6 < 0) {
            return false;
        } else {
            int var7 = this.field4869.field2773[var6].method3067((byte) 103, class88.method656(-63, var5));
            return var7 >= 0;
        }
    }

    @OriginalMember(owner = "client!vo", name = "e", descriptor = "(I)Z")
    private final boolean method2100(int arg0) {
        field4855++;
        if (arg0 != -16777216) {
            this.method2083(116, null);
        }
        if (this.field4869 == null) {
            this.field4869 = this.field4854.method305(-82);
            if (this.field4869 == null) {
                return false;
            }
            this.field4845 = new Object[this.field4869.field2759];
            this.field4844 = new Object[this.field4869.field2759][];
        }
        return true;
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(BI)Z")
    public final boolean method2101(byte arg0, int arg1) {
        field4843++;
        if (!this.method2074(arg1, arg0 ^ 0x4EB8)) {
            return false;
        } else if (this.field4845[arg1] == null) {
            this.method2088(arg1, arg0 + 59);
            if (arg0 != -59) {
                this.field4854 = null;
            }
            return this.field4845[arg1] != null;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(Z)I")
    public final int method2102(boolean arg0) {
        field4868++;
        if (this.method2100(-16777216)) {
            if (!arg0) {
                field4866 = null;
            }
            return this.field4869.field2757.length;
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!vo", name = "<init>", descriptor = "(Lts;ZI)V")
    public class345(class35 arg0, boolean arg1, int arg2) {
        if (arg2 < 0 || arg2 > 2) {
            throw new IllegalArgumentException("js5: Invalid value " + arg2 + " supplied for discardunpacked");
        }
        this.field4849 = arg2;
        this.field4854 = arg0;
        this.field4841 = arg1;
    }
}
