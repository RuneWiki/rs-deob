import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!om")
public class class344 {

    @OriginalMember(owner = "client!om", name = "v", descriptor = "Lot;")
    private class548 field5132 = null;

    @OriginalMember(owner = "client!om", name = "K", descriptor = "Z")
    private boolean field5147;

    @OriginalMember(owner = "client!om", name = "P", descriptor = "I")
    public int field5152;

    @OriginalMember(owner = "client!om", name = "D", descriptor = "Lsda;")
    private class237 field5140;

    @OriginalMember(owner = "client!om", name = "p", descriptor = "I")
    public static int field5126 = 0;

    @OriginalMember(owner = "client!om", name = "a", descriptor = "I")
    public static int field5111;

    @OriginalMember(owner = "client!om", name = "b", descriptor = "I")
    public static int field5112;

    @OriginalMember(owner = "client!om", name = "c", descriptor = "I")
    public static int field5113;

    @OriginalMember(owner = "client!om", name = "d", descriptor = "I")
    public static int field5114;

    @OriginalMember(owner = "client!om", name = "e", descriptor = "I")
    public static int field5115;

    @OriginalMember(owner = "client!om", name = "g", descriptor = "I")
    public static int field5117;

    @OriginalMember(owner = "client!om", name = "h", descriptor = "I")
    public static int field5118;

    @OriginalMember(owner = "client!om", name = "i", descriptor = "I")
    public static int field5119;

    @OriginalMember(owner = "client!om", name = "j", descriptor = "I")
    public static int field5120;

    @OriginalMember(owner = "client!om", name = "l", descriptor = "I")
    public static int field5122;

    @OriginalMember(owner = "client!om", name = "m", descriptor = "I")
    public static int field5123;

    @OriginalMember(owner = "client!om", name = "n", descriptor = "I")
    public static int field5124;

    @OriginalMember(owner = "client!om", name = "o", descriptor = "I")
    public static int field5125;

    @OriginalMember(owner = "client!om", name = "r", descriptor = "I")
    public static int field5128;

    @OriginalMember(owner = "client!om", name = "s", descriptor = "I")
    public static int field5129;

    @OriginalMember(owner = "client!om", name = "t", descriptor = "I")
    public static int field5130;

    @OriginalMember(owner = "client!om", name = "u", descriptor = "I")
    public static int field5131;

    @OriginalMember(owner = "client!om", name = "w", descriptor = "I")
    public static int field5133;

    @OriginalMember(owner = "client!om", name = "x", descriptor = "I")
    public static int field5134;

    @OriginalMember(owner = "client!om", name = "y", descriptor = "I")
    public static int field5135;

    @OriginalMember(owner = "client!om", name = "z", descriptor = "I")
    public static int field5136;

    @OriginalMember(owner = "client!om", name = "A", descriptor = "I")
    public static int field5137;

    @OriginalMember(owner = "client!om", name = "B", descriptor = "I")
    public static int field5138;

    @OriginalMember(owner = "client!om", name = "C", descriptor = "I")
    public static int field5139;

    @OriginalMember(owner = "client!om", name = "E", descriptor = "I")
    public static int field5141;

    @OriginalMember(owner = "client!om", name = "F", descriptor = "I")
    public static int field5142;

    @OriginalMember(owner = "client!om", name = "G", descriptor = "I")
    public static int field5143;

    @OriginalMember(owner = "client!om", name = "H", descriptor = "I")
    public static int field5144;

    @OriginalMember(owner = "client!om", name = "I", descriptor = "I")
    public static int field5145;

    @OriginalMember(owner = "client!om", name = "J", descriptor = "I")
    public static int field5146;

    @OriginalMember(owner = "client!om", name = "L", descriptor = "I")
    public static int field5148;

    @OriginalMember(owner = "client!om", name = "M", descriptor = "I")
    public static int field5149;

    @OriginalMember(owner = "client!om", name = "N", descriptor = "I")
    public static int field5150;

    @OriginalMember(owner = "client!om", name = "O", descriptor = "I")
    public static int field5151;

    @OriginalMember(owner = "client!om", name = "Q", descriptor = "I")
    public static int field5153;

    @OriginalMember(owner = "client!om", name = "q", descriptor = "Lom;")
    public static class344 field5127;

    @OriginalMember(owner = "client!om", name = "f", descriptor = "[Ljava/lang/Object;")
    private Object[] field5116;

    @OriginalMember(owner = "client!om", name = "k", descriptor = "[[Ljava/lang/Object;")
    private Object[][] field5121;

    @OriginalMember(owner = "client!om", name = "a", descriptor = "([IIII)[B")
    public final byte[] method2210(int[] arg0, int arg1, int arg2, int arg3) {
        field5139++;
        int var5 = 43 / ((arg3 - 1) / 35);
        if (!this.method2241(arg1, arg2, 13828096)) {
            return null;
        }
        if (this.field5121[arg2] == null || this.field5121[arg2][arg1] == null) {
            boolean var6 = this.method2220(arg0, arg1, false, arg2);
            if (!var6) {
                this.method2243(arg2, 255);
                boolean var7 = this.method2220(arg0, arg1, false, arg2);
                if (!var7) {
                    return null;
                }
            }
        }
        byte[] var8 = class682.method3830(false, -24, this.field5121[arg2][arg1]);
        if (this.field5152 == 1) {
            this.field5121[arg2][arg1] = null;
            if (this.field5132.field7782[arg2] == 1) {
                this.field5121[arg2] = null;
            }
        } else if (this.field5152 == 2) {
            this.field5121[arg2] = null;
        }
        return var8;
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;)[B")
    public final byte[] method2211(String arg0, int arg1, String arg2) {
        field5120++;
        if (!this.method2239((byte) -45)) {
            return null;
        }
        String var4 = arg0.toLowerCase();
        String var5 = arg2.toLowerCase();
        if (arg1 != 19558) {
            this.field5121 = null;
        }
        int var6 = this.field5132.field7793.method2981(class98.method932(var4, (byte) -120), -118);
        if (this.method2223(var6, true)) {
            int var7 = this.field5132.field7778[var6].method2981(class98.method932(var5, (byte) -20), arg1 - 19681);
            return this.method2216(var6, var7, true);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(B)Z")
    public final boolean method2212(byte arg0) {
        field5144++;
        if (!this.method2239((byte) -45)) {
            return false;
        }
        boolean var2 = true;
        if (arg0 != 110) {
            this.method2239((byte) -119);
        }
        for (int var3 = 0; var3 < this.field5132.field7788.length; var3++) {
            int var4 = this.field5132.field7788[var3];
            if (this.field5116[var4] == null) {
                this.method2243(var4, arg0 ^ 0x91);
                if (this.field5116[var4] == null) {
                    var2 = false;
                }
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(I)J")
    public static final long method2213(int arg0) {
        if (arg0 <= 49) {
            field5126 = -28;
        }
        field5123++;
        return class358.field5340.method2287(67);
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(ILjava/lang/String;)Z")
    public final boolean method2214(int arg0, String arg1) {
        field5133++;
        int var3 = this.method2228("", 5781);
        if (var3 == -1) {
            if (arg0 < 38) {
                this.field5147 = true;
            }
            return this.method2237(12734, arg1, "");
        } else {
            return this.method2237(12734, "", arg1);
        }
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(IZ)V")
    private final void method2215(int arg0, boolean arg1) {
        if (!arg1) {
            field5142++;
            this.field5140.method943(arg0, -1);
        }
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(IIZ)[B")
    public final byte[] method2216(int arg0, int arg1, boolean arg2) {
        field5145++;
        if (!arg2) {
            this.field5132 = null;
        }
        return this.method2210(null, arg1, arg0, -113);
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(III)Z")
    public final boolean method2217(int arg0, int arg1, int arg2) {
        field5122++;
        int var4 = 77 / ((arg1 + 20) / 45);
        if (!this.method2241(arg2, arg0, 13828096)) {
            return false;
        } else if (this.field5121[arg0] != null && this.field5121[arg0][arg2] != null) {
            return true;
        } else if (this.field5116[arg0] == null) {
            this.method2243(arg0, 255);
            return this.field5116[arg0] != null;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;I)Z")
    public final boolean method2218(String arg0, String arg1, int arg2) {
        field5130++;
        if (!this.method2239((byte) -45)) {
            return false;
        }
        String var4 = arg1.toLowerCase();
        String var5 = arg0.toLowerCase();
        int var6 = this.field5132.field7793.method2981(class98.method932(var4, (byte) -95), -121);
        if (var6 < 0) {
            return false;
        }
        int var7 = this.field5132.field7778[var6].method2981(class98.method932(var5, (byte) -23), -121);
        if (var7 < 0) {
            return false;
        } else {
            return arg2 <= -22;
        }
    }

    @OriginalMember(owner = "client!om", name = "b", descriptor = "(I)I")
    public final int method2219(int arg0) {
        field5143++;
        if (!this.method2239((byte) -45)) {
            return 0;
        }
        int var2 = 0;
        int var3 = 0;
        for (int var4 = 0; var4 < this.field5116.length; var4++) {
            if (this.field5132.field7791[var4] > 0) {
                var3 += this.method2244(var4, 0);
                var2 += 100;
            }
        }
        if (var2 == 0) {
            return 100;
        } else {
            return arg0 * var3 / var2;
        }
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "([IIZI)Z")
    private final boolean method2220(int[] arg0, int arg1, boolean arg2, int arg3) {
        field5111++;
        if (!this.method2223(arg3, true)) {
            return false;
        } else if (this.field5116[arg3] == null) {
            return false;
        } else {
            int var5 = this.field5132.field7791[arg3];
            int[] var6 = this.field5132.field7781[arg3];
            if (this.field5121[arg3] == null) {
                this.field5121[arg3] = new Object[this.field5132.field7782[arg3]];
            }
            Object[] var7 = this.field5121[arg3];
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
            if (arg0 == null || arg0[0] == 0 && arg0[1] == 0 && arg0[2] == 0 && arg0[3] == 0) {
                var11 = class682.method3830(false, -22, this.field5116[arg3]);
            } else {
                var11 = class682.method3830(true, -123, this.field5116[arg3]);
                class61 var12 = new class61(var11);
                var12.method696(-1640531527, arg0, var12.field1397.length, 5);
            }
            byte[] var13;
            try {
                var13 = class433.method2631(-96, var11);
            } catch (RuntimeException var49) {
                throw class225.method1538(var49, "T3 - " + (arg0 != null) + "," + arg3 + "," + var11.length + "," + class569.method3284(var11.length, -102, var11) + "," + class569.method3284(var11.length - 2, -73, var11) + "," + this.field5132.field7777[arg3] + "," + this.field5132.field7786);
            }
            if (arg2) {
                field5127 = null;
            }
            if (this.field5147) {
                this.field5116[arg3] = null;
            }
            if (var5 <= 1) {
                int var48;
                if (var6 == null) {
                    var48 = 0;
                } else {
                    var48 = var6[0];
                }
                if (this.field5152 == 0) {
                    var7[var48] = class515.method3039(false, var13, -1);
                } else {
                    var7[var48] = var13;
                }
            } else if (this.field5152 == 2) {
                int var15 = var13.length;
                int var50 = var15 - 1;
                int var16 = var13[var50] & 0xFF;
                int var17 = var50 - var16 * 4 * var5;
                class61 var18 = new class61(var13);
                int var19 = 0;
                var18.field1393 = var17;
                int var20 = 0;
                for (int var21 = 0; var21 < var16; var21++) {
                    int var22 = 0;
                    for (int var23 = 0; var23 < var5; var23++) {
                        var22 += var18.method730(96);
                        int var24;
                        if (var6 == null) {
                            var24 = var23;
                        } else {
                            var24 = var6[var23];
                        }
                        if (arg1 == var24) {
                            var19 += var22;
                            var20 = var24;
                        }
                    }
                }
                if (var19 == 0) {
                    return true;
                }
                byte[] var25 = new byte[var19];
                var18.field1393 = var17;
                int var26 = 0;
                int var27 = 0;
                for (int var28 = 0; var28 < var16; var28++) {
                    int var29 = 0;
                    for (int var30 = 0; var30 < var5; var30++) {
                        var29 += var18.method730(124);
                        int var31;
                        if (var6 == null) {
                            var31 = var30;
                        } else {
                            var31 = var6[var30];
                        }
                        if (arg1 == var31) {
                            class692.method3873(var13, var27, var25, var26, var29);
                            var26 += var29;
                        }
                        var27 += var29;
                    }
                }
                var7[var20] = var25;
            } else {
                int var32 = var13.length;
                int var51 = var32 - 1;
                int var33 = var13[var51] & 0xFF;
                int var34 = var51 - var5 * 4 * var33;
                class61 var35 = new class61(var13);
                var35.field1393 = var34;
                int[] var36 = new int[var5];
                for (int var37 = 0; var37 < var33; var37++) {
                    int var38 = 0;
                    for (int var39 = 0; var39 < var5; var39++) {
                        var38 += var35.method730(-81);
                        var36[var39] += var38;
                    }
                }
                byte[][] var40 = new byte[var5][];
                for (int var41 = 0; var41 < var5; var41++) {
                    var40[var41] = new byte[var36[var41]];
                    var36[var41] = 0;
                }
                var35.field1393 = var34;
                int var42 = 0;
                for (int var43 = 0; var43 < var33; var43++) {
                    int var44 = 0;
                    for (int var45 = 0; var45 < var5; var45++) {
                        var44 += var35.method730(121);
                        class692.method3873(var13, var42, var40[var45], var36[var45], var44);
                        var36[var45] += var44;
                        var42 += var44;
                    }
                }
                for (int var46 = 0; var46 < var5; var46++) {
                    int var47;
                    if (var6 == null) {
                        var47 = var46;
                    } else {
                        var47 = var6[var46];
                    }
                    if (this.field5152 == 0) {
                        var7[var47] = class515.method3039(false, var40[var46], -1);
                    } else {
                        var7[var47] = var40[var46];
                    }
                }
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!om", name = "b", descriptor = "(IZ)Z")
    public final boolean method2221(int arg0, boolean arg1) {
        field5149++;
        if (!this.method2223(arg0, arg1)) {
            return false;
        } else if (this.field5116[arg0] == null) {
            this.method2243(arg0, 255);
            return this.field5116[arg0] != null;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!om", name = "b", descriptor = "(ILjava/lang/String;)V")
    public final void method2222(int arg0, String arg1) {
        field5118++;
        if (!this.method2239((byte) -45)) {
            return;
        }
        if (arg0 != -1) {
            this.field5152 = 124;
        }
        String var3 = arg1.toLowerCase();
        int var4 = this.field5132.field7793.method2981(class98.method932(var3, (byte) -66), -114);
        this.method2215(var4, false);
    }

    @OriginalMember(owner = "client!om", name = "c", descriptor = "(IZ)Z")
    private final boolean method2223(int arg0, boolean arg1) {
        if (!arg1) {
            this.method2232(-26, null);
        }
        field5131++;
        if (!this.method2239((byte) -45)) {
            return false;
        } else if (arg0 >= 0 && arg0 < this.field5132.field7782.length && this.field5132.field7782[arg0] != 0) {
            return true;
        } else if (class198.field3089) {
            throw new IllegalArgumentException(Integer.toString(arg0));
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(Z)V")
    public final void method2224(boolean arg0) {
        if (!arg0) {
            return;
        }
        field5138++;
        if (this.field5116 != null) {
            for (int var2 = 0; var2 < this.field5116.length; var2++) {
                this.field5116[var2] = null;
            }
        }
    }

    @OriginalMember(owner = "client!om", name = "b", descriptor = "(B)V")
    public final void method2225(byte arg0) {
        if (arg0 >= -62) {
            this.method2241(43, 83, 55);
        }
        if (this.field5121 != null) {
            for (int var2 = 0; var2 < this.field5121.length; var2++) {
                this.field5121[var2] = null;
            }
        }
        field5115++;
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(Ljava/lang/String;B)Z")
    public final boolean method2226(String arg0, byte arg1) {
        field5153++;
        if (!this.method2239((byte) -45)) {
            return false;
        }
        String var3 = arg0.toLowerCase();
        int var4 = this.field5132.field7793.method2981(class98.method932(var3, (byte) -38), arg1 ^ 0xFFFFFF94);
        if (var4 < 0) {
            return false;
        } else {
            if (arg1 != 21) {
                this.method2221(-21, true);
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(Ljava/lang/String;I)I")
    public final int method2227(String arg0, int arg1) {
        field5129++;
        if (!this.method2239((byte) -45)) {
            return 0;
        } else if (arg1 == 24383) {
            String var3 = arg0.toLowerCase();
            int var4 = this.field5132.field7793.method2981(class98.method932(var3, (byte) -37), arg1 ^ 0xFFFFA0B7);
            return this.method2244(var4, 0);
        } else {
            return 27;
        }
    }

    @OriginalMember(owner = "client!om", name = "b", descriptor = "(Ljava/lang/String;I)I")
    public final int method2228(String arg0, int arg1) {
        field5128++;
        if (!this.method2239((byte) -45)) {
            return -1;
        }
        String var3 = arg0.toLowerCase();
        int var4 = this.field5132.field7793.method2981(class98.method932(var3, (byte) -65), arg1 - 5907);
        if (arg1 != 5781) {
            this.method2214(92, null);
        }
        return this.method2223(var4, true) ? var4 : -1;
    }

    @OriginalMember(owner = "client!om", name = "c", descriptor = "(B)I")
    public final int method2229(byte arg0) {
        field5114++;
        if (arg0 <= 69) {
            this.field5121 = null;
        }
        if (!this.method2239((byte) -45)) {
            throw new IllegalStateException("");
        }
        return this.field5132.field7786;
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(BI)Z")
    public final boolean method2230(byte arg0, int arg1) {
        field5141++;
        if (!this.method2239((byte) -45)) {
            return false;
        } else if (this.field5132.field7782.length == 1) {
            return this.method2217(0, -102, arg1);
        } else if (!this.method2223(arg1, true)) {
            return false;
        } else if (this.field5132.field7782[arg1] == 1) {
            return this.method2217(arg1, 41, 0);
        } else {
            int var3 = -102 % ((-arg0 - 22) / 57);
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(II)[I")
    public final int[] method2231(int arg0, int arg1) {
        field5137++;
        if (!this.method2223(arg0, true)) {
            return null;
        } else if (arg1 == 3) {
            int[] var3 = this.field5132.field7781[arg0];
            if (var3 == null) {
                var3 = new int[this.field5132.field7791[arg0]];
                int var4 = 0;
                while (var3.length > var4) {
                    var3[var4] = var4++;
                }
            }
            return var3;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!om", name = "c", descriptor = "(ILjava/lang/String;)Z")
    public final boolean method2232(int arg0, String arg1) {
        field5113++;
        if (!this.method2239((byte) -45)) {
            return false;
        }
        String var3 = arg1.toLowerCase();
        if (arg0 != 1) {
            this.field5121 = null;
        }
        int var4 = this.field5132.field7793.method2981(class98.method932(var3, (byte) -51), -119);
        return this.method2221(var4, true);
    }

    @OriginalMember(owner = "client!om", name = "d", descriptor = "(IZ)I")
    public final int method2233(int arg0, boolean arg1) {
        if (arg1) {
            this.method2231(-68, 51);
        }
        field5125++;
        if (this.method2239((byte) -45)) {
            int var3 = this.field5132.field7793.method2981(arg0, -119);
            return this.method2223(var3, true) ? var3 : -1;
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(IZZ[[[Ldf;II)Z")
    public static final boolean method2234(int arg0, boolean arg1, boolean arg2, class370[][][] arg3, int arg4, int arg5) {
        if (arg2) {
            field5126 = -36;
        }
        field5136++;
        byte var6 = arg1 ? 1 : (byte) (class705.field9922 & 0xFF);
        if (class483.field6917[class37.field1046][arg0][arg4] == var6) {
            return false;
        } else if ((class517.field7301[class37.field1046][arg0][arg4] & 0x4) == 0) {
            return false;
        } else {
            byte var7 = 0;
            int var8 = 0;
            class443.field6380[var7] = arg0;
            int var35 = var7 + 1;
            class586.field8458[var7] = arg4;
            class483.field6917[class37.field1046][arg0][arg4] = var6;
            while (var35 != var8) {
                int var9 = class443.field6380[var8] & 0xFFFF;
                int var10 = class443.field6380[var8] >> 16 & 0xFF;
                int var11 = class443.field6380[var8] >> 24 & 0xFF;
                int var12 = class586.field8458[var8] & 0xFFFF;
                int var13 = (class586.field8458[var8] & 0xFFB284) >> 16;
                var8 = var8 + 1 & 0xFFF;
                boolean var14 = false;
                if ((class517.field7301[class37.field1046][var9][var12] & 0x4) == 0) {
                    var14 = true;
                }
                boolean var15 = false;
                label237: for (int var16 = class37.field1046 + 1; var16 <= 3; var16++) {
                    if ((class517.field7301[var16][var9][var12] & 0x8) == 0) {
                        if (var14 && arg3[var16][var9][var12] != null) {
                            if (arg3[var16][var9][var12].field5491 != null) {
                                int var20 = class573.method3294(var10, -3);
                                if (arg3[var16][var9][var12].field5491.field9020 == var20 || arg3[var16][var9][var12].field5493 != null && arg3[var16][var9][var12].field5493.field9020 == var20) {
                                    continue;
                                }
                                if (var11 != 0) {
                                    int var21 = class573.method3294(var11, -3);
                                    if (arg3[var16][var9][var12].field5491.field9020 == var21 || arg3[var16][var9][var12].field5493 != null && arg3[var16][var9][var12].field5493.field9020 == var21) {
                                        continue;
                                    }
                                }
                                if (var13 != 0) {
                                    int var22 = class573.method3294(var13, -3);
                                    if (arg3[var16][var9][var12].field5491.field9020 == var22 || arg3[var16][var9][var12].field5493 != null && arg3[var16][var9][var12].field5493.field9020 == var22) {
                                        continue;
                                    }
                                }
                            }
                            class370 var23 = arg3[var16][var9][var12];
                            if (var23.field5497 != null) {
                                for (class636 var24 = var23.field5497; var24 != null; var24 = var24.field9171) {
                                    class122 var25 = var24.field9172;
                                    if (var25 instanceof class83) {
                                        class83 var26 = (class83) var25;
                                        int var27 = var26.method844((byte) 124);
                                        int var28 = var26.method846((byte) -105);
                                        if (var27 == 21) {
                                            var27 = 19;
                                        }
                                        int var29 = var27 | var28 << 6;
                                        if (var10 == var29 || var11 != 0 && var11 == var29 || var13 != 0 && var13 == var29) {
                                            continue label237;
                                        }
                                    }
                                }
                            }
                        }
                        class370 var30 = arg3[var16][var9][var12];
                        if (var30 != null && var30.field5497 != null) {
                            for (class636 var31 = var30.field5497; var31 != null; var31 = var31.field9171) {
                                class122 var32 = var31.field9172;
                                if (var32.field2227 != var32.field2220 || var32.field2230 != var32.field2222) {
                                    for (int var33 = var32.field2220; var33 <= var32.field2227; var33++) {
                                        for (int var34 = var32.field2230; var34 <= var32.field2222; var34++) {
                                            class483.field6917[var16][var33][var34] = var6;
                                        }
                                    }
                                }
                            }
                        }
                        var15 = true;
                        class483.field6917[var16][var9][var12] = var6;
                    }
                }
                if (var15) {
                    int var17 = class485.field6947[class37.field1046 + 1].method551(var9, var12, (byte) -93);
                    if (var17 > class314.field4643[arg5]) {
                        class314.field4643[arg5] = var17;
                    }
                    int var18 = var9 << 9;
                    if (var18 < class263.field3848[arg5]) {
                        class263.field3848[arg5] = var18;
                    } else if (class706.field9941[arg5] < var18) {
                        class706.field9941[arg5] = var18;
                    }
                    int var19 = var12 << 9;
                    if (class70.field1468[arg5] > var19) {
                        class70.field1468[arg5] = var19;
                    } else if (var19 > class129.field2341[arg5]) {
                        class129.field2341[arg5] = var19;
                    }
                }
                if (!var14) {
                    if (var9 >= 1 && class483.field6917[class37.field1046][var9 - 1][var12] != var6) {
                        class443.field6380[var35] = class2.method189(class2.method189(1179648, var9 - 1), -754974720);
                        class586.field8458[var35] = class2.method189(var12, 1245184);
                        class483.field6917[class37.field1046][var9 - 1][var12] = var6;
                        var35 = var35 + 1 & 0xFFF;
                    }
                    var12++;
                    if (var12 < class218.field3316) {
                        if ((var9 - 1) >= 0 && class483.field6917[class37.field1046][var9 - 1][var12] != var6 && (class517.field7301[class37.field1046][var9][var12] & 0x4) == 0 && (class517.field7301[class37.field1046][var9 - 1][var12 - 1] & 0x4) == 0) {
                            class443.field6380[var35] = class2.method189(class2.method189(1179648, var9 - 1), 1375731712);
                            class586.field8458[var35] = class2.method189(var12, 1245184);
                            var35 = var35 + 1 & 0xFFF;
                            class483.field6917[class37.field1046][var9 - 1][var12] = var6;
                        }
                        if (class483.field6917[class37.field1046][var9][var12] != var6) {
                            class443.field6380[var35] = class2.method189(class2.method189(5373952, var9), 318767104);
                            class586.field8458[var35] = class2.method189(var12, 5439488);
                            var35 = var35 + 1 & 0xFFF;
                            class483.field6917[class37.field1046][var9][var12] = var6;
                        }
                        if (var9 + 1 < class675.field9604 && class483.field6917[class37.field1046][var9 + 1][var12] != var6 && (class517.field7301[class37.field1046][var9][var12] & 0x4) == 0 && (class517.field7301[class37.field1046][var9 + 1][var12 - 1] & 0x4) == 0) {
                            class443.field6380[var35] = class2.method189(class2.method189(var9 + 1, 5373952), -1845493760);
                            class586.field8458[var35] = class2.method189(5439488, var12);
                            class483.field6917[class37.field1046][var9 + 1][var12] = var6;
                            var35 = var35 + 1 & 0xFFF;
                        }
                    }
                    var12--;
                    if (class675.field9604 > (var9 + 1) && class483.field6917[class37.field1046][var9 + 1][var12] != var6) {
                        class443.field6380[var35] = class2.method189(class2.method189(9568256, var9 + 1), 1392508928);
                        class586.field8458[var35] = class2.method189(9633792, var12);
                        class483.field6917[class37.field1046][var9 + 1][var12] = var6;
                        var35 = var35 + 1 & 0xFFF;
                    }
                    var12--;
                    if (var12 >= 0) {
                        if (var9 - 1 >= 0 && class483.field6917[class37.field1046][var9 - 1][var12] != var6 && (class517.field7301[class37.field1046][var9][var12] & 0x4) == 0 && (class517.field7301[class37.field1046][var9 - 1][var12 + 1] & 0x4) == 0) {
                            class443.field6380[var35] = class2.method189(class2.method189(var9 - 1, 13762560), 301989888);
                            class586.field8458[var35] = class2.method189(13828096, var12);
                            var35 = var35 + 1 & 0xFFF;
                            class483.field6917[class37.field1046][var9 - 1][var12] = var6;
                        }
                        if (class483.field6917[class37.field1046][var9][var12] != var6) {
                            class443.field6380[var35] = class2.method189(class2.method189(13762560, var9), -1828716544);
                            class586.field8458[var35] = class2.method189(13828096, var12);
                            var35 = var35 + 1 & 0xFFF;
                            class483.field6917[class37.field1046][var9][var12] = var6;
                        }
                        if ((var9 + 1) < class675.field9604 && class483.field6917[class37.field1046][var9 + 1][var12] != var6 && (class517.field7301[class37.field1046][var9][var12] & 0x4) == 0 && (class517.field7301[class37.field1046][var9 + 1][var12 + 1] & 0x4) == 0) {
                            class443.field6380[var35] = class2.method189(-771751936, class2.method189(var9 + 1, 9568256));
                            class586.field8458[var35] = class2.method189(9633792, var12);
                            var35 = var35 + 1 & 0xFFF;
                            class483.field6917[class37.field1046][var9 + 1][var12] = var6;
                        }
                    }
                }
            }
            if (class314.field4643[arg5] != -1000000) {
                class314.field4643[arg5] += 40;
                class263.field3848[arg5] -= 512;
                class706.field9941[arg5] += 512;
                class129.field2341[arg5] += 512;
                class70.field1468[arg5] -= 512;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(ZZI)V")
    public final void method2235(boolean arg0, boolean arg1, int arg2) {
        field5124++;
        if (!this.method2239((byte) -45)) {
            return;
        }
        if (arg1) {
            this.field5132.field7783 = null;
            this.field5132.field7793 = null;
        }
        if (arg0) {
            this.field5132.field7789 = null;
            this.field5132.field7778 = null;
        }
        if (arg2 != 0) {
            this.method2244(44, 64);
        }
    }

    @OriginalMember(owner = "client!om", name = "b", descriptor = "(II)I")
    public final int method2236(int arg0, int arg1) {
        field5151++;
        if (arg1 != 0) {
            this.method2239((byte) -63);
        }
        return this.method2223(arg0, true) ? this.field5132.field7782[arg0] : 0;
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;)Z")
    private final boolean method2237(int arg0, String arg1, String arg2) {
        field5117++;
        if (!this.method2239((byte) -45)) {
            return false;
        }
        String var4 = arg1.toLowerCase();
        String var5 = arg2.toLowerCase();
        int var6 = this.field5132.field7793.method2981(class98.method932(var4, (byte) -103), -111);
        if (!this.method2223(var6, true)) {
            return false;
        }
        if (arg0 != 12734) {
            this.method2228(null, -24);
        }
        int var7 = this.field5132.field7778[var6].method2981(class98.method932(var5, (byte) -62), arg0 - 12848);
        return this.method2217(var6, 98, var7);
    }

    @OriginalMember(owner = "client!om", name = "c", descriptor = "(I)V")
    public static void method2238(int arg0) {
        if (arg0 < 95) {
            field5127 = null;
        }
        field5127 = null;
    }

    @OriginalMember(owner = "client!om", name = "d", descriptor = "(B)Z")
    private final boolean method2239(byte arg0) {
        field5148++;
        if (this.field5132 == null) {
            this.field5132 = this.field5140.method953(false);
            if (this.field5132 == null) {
                return false;
            }
            this.field5116 = new Object[this.field5132.field7792];
            this.field5121 = new Object[this.field5132.field7792][];
        }
        if (arg0 != -45) {
            this.field5132 = null;
        }
        return true;
    }

    @OriginalMember(owner = "client!om", name = "c", descriptor = "(II)V")
    public final void method2240(int arg0, int arg1) {
        field5112++;
        if (!this.method2223(arg1, true)) {
            return;
        }
        if (arg0 != 13349) {
            this.method2240(-7, -35);
        }
        if (this.field5121 != null) {
            this.field5121[arg1] = null;
        }
    }

    @OriginalMember(owner = "client!om", name = "b", descriptor = "(III)Z")
    private final boolean method2241(int arg0, int arg1, int arg2) {
        if (arg2 != 13828096) {
            this.method2227(null, 47);
        }
        field5150++;
        if (!this.method2239((byte) -45)) {
            return false;
        } else if (arg1 >= 0 && arg0 >= 0 && arg1 < this.field5132.field7782.length && arg0 < this.field5132.field7782[arg1]) {
            return true;
        } else if (class198.field3089) {
            throw new IllegalArgumentException(arg1 + "," + arg0);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!om", name = "d", descriptor = "(II)[B")
    public final byte[] method2242(int arg0, int arg1) {
        field5146++;
        if (!this.method2239((byte) -45)) {
            return null;
        } else if (this.field5132.field7782.length == 1) {
            return this.method2216(0, arg1, true);
        } else if (!this.method2223(arg1, true)) {
            return null;
        } else if (this.field5132.field7782[arg1] == 1) {
            return this.method2216(arg1, 0, true);
        } else if (arg0 == 0) {
            throw new RuntimeException();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!om", name = "e", descriptor = "(II)V")
    private final void method2243(int arg0, int arg1) {
        field5119++;
        if (this.field5147) {
            this.field5116[arg0] = this.field5140.method945(arg0, -128);
        } else {
            this.field5116[arg0] = class515.method3039(false, this.field5140.method945(arg0, class691.method3871(arg1, -132)), class691.method3871(arg1, -256));
        }
        if (arg1 != 255) {
            this.method2222(-24, null);
        }
    }

    @OriginalMember(owner = "client!om", name = "f", descriptor = "(II)I")
    private final int method2244(int arg0, int arg1) {
        field5135++;
        if (this.method2223(arg0, true)) {
            if (arg1 != 0) {
                this.field5132 = null;
            }
            return this.field5116[arg0] == null ? this.field5140.method956((byte) -125, arg0) : 100;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!om", name = "<init>", descriptor = "(Lsda;ZI)V")
    public class344(class237 arg0, boolean arg1, int arg2) {
        if (arg2 < 0 || arg2 > 2) {
            throw new IllegalArgumentException("js5: Invalid value " + arg2 + " supplied for discardunpacked");
        }
        this.field5147 = arg1;
        this.field5152 = arg2;
        this.field5140 = arg0;
    }

    @OriginalMember(owner = "client!om", name = "d", descriptor = "(I)I")
    public final int method2245(int arg0) {
        field5134++;
        if (this.method2239((byte) -45)) {
            if (arg0 != 0) {
                method2234(40, false, false, null, -86, -39);
            }
            return this.field5132.field7782.length;
        } else {
            return -1;
        }
    }
}
