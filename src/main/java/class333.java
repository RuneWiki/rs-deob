import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ur")
public class class333 extends class143 {

    @OriginalMember(owner = "client!ur", name = "C", descriptor = "[I")
    private int[] field4628;

    @OriginalMember(owner = "client!ur", name = "A", descriptor = "[I")
    private int[] field4626;

    @OriginalMember(owner = "client!ur", name = "R", descriptor = "Lai;")
    private class646 field4642;

    @OriginalMember(owner = "client!ur", name = "D", descriptor = "Lai;")
    private class646 field4629;

    @OriginalMember(owner = "client!ur", name = "B", descriptor = "Lai;")
    private class646 field4627;

    @OriginalMember(owner = "client!ur", name = "E", descriptor = "[Lai;")
    private class646[] field4630;

    @OriginalMember(owner = "client!ur", name = "K", descriptor = "Lkq;")
    public static class696 field4636 = new class696(8, 1);

    @OriginalMember(owner = "client!ur", name = "P", descriptor = "I")
    public static int field4640 = -1;

    @OriginalMember(owner = "client!ur", name = "N", descriptor = "Leda;")
    public static class116 field4639 = new class116(0, 0);

    @OriginalMember(owner = "client!ur", name = "F", descriptor = "I")
    public static int field4631;

    @OriginalMember(owner = "client!ur", name = "G", descriptor = "I")
    public static int field4632;

    @OriginalMember(owner = "client!ur", name = "H", descriptor = "I")
    public static int field4633;

    @OriginalMember(owner = "client!ur", name = "I", descriptor = "I")
    public static int field4634;

    @OriginalMember(owner = "client!ur", name = "J", descriptor = "I")
    public static int field4635;

    @OriginalMember(owner = "client!ur", name = "L", descriptor = "I")
    public static int field4637;

    @OriginalMember(owner = "client!ur", name = "M", descriptor = "I")
    public static int field4638;

    @OriginalMember(owner = "client!ur", name = "Q", descriptor = "I")
    public static int field4641;

    @OriginalMember(owner = "client!ur", name = "S", descriptor = "I")
    public static int field4643;

    @OriginalMember(owner = "client!ur", name = "T", descriptor = "[Lpi;")
    public static class302[] field4644;

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(IIIZLfa;Lvo;)[F")
    public final float[] method1978(int arg0, int arg1, int arg2, boolean arg3, class615 arg4, class345 arg5) {
        class213.field3241 = arg4;
        class398.field5758 = arg5;
        field4637++;
        for (int var7 = 0; var7 < this.field4630.length; var7++) {
            this.field4630[var7].method1538(arg1, 0, arg0);
        }
        class550.method3227(-44, arg1, arg0);
        float[] var8 = new float[arg1 * 4 * arg0];
        int var9 = 0;
        for (int var10 = 0; var10 < arg0; var10++) {
            int[] var13;
            int[] var14;
            int[] var15;
            if (this.field4629.field9160) {
                int[] var16 = this.field4629.method424(var10, (byte) -120);
                var15 = var16;
                var13 = var16;
                var14 = var16;
            } else {
                int[][] var12 = this.field4629.method298(-12424, var10);
                var13 = var12[1];
                var14 = var12[0];
                var15 = var12[2];
            }
            int[] var17;
            if (this.field4627.field9160) {
                var17 = this.field4627.method424(var10, (byte) -120);
            } else {
                var17 = this.field4627.method298(arg2 ^ 0xFFFFCF78, var10)[0];
            }
            if (arg3) {
                var9 = var10 << 2;
            }
            int[] var18;
            if (this.field4642.field9160) {
                var18 = this.field4642.method424(var10, (byte) -120);
            } else {
                var18 = this.field4642.method298(-12424, var10)[0];
            }
            for (int var19 = arg1 - 1; var19 >= 0; var19--) {
                float var20 = (float) var17[var19] / 4096.0F;
                if (var20 < 0.0F) {
                    var20 = 0.0F;
                } else if (var20 > 1.0F) {
                    var20 = 1.0F;
                }
                float var21 = ((float) var18[var19] * 31.0F / 4096.0F + 1.0F) / 4096.0F;
                var8[var9++] = (float) var14[var19] * var21;
                var8[var9++] = (float) var13[var19] * var21;
                var8[var9++] = (float) var15[var19] * var21;
                var8[var9++] = var20;
                if (arg3) {
                    var9 += (arg1 << 2) - 4;
                }
            }
        }
        for (int var11 = arg2; var11 < this.field4630.length; var11++) {
            this.field4630[var11].method1543(-95);
        }
        return var8;
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(Lvo;ILfa;)Z")
    public final boolean method1979(class345 arg0, int arg1, class615 arg2) {
        field4633++;
        if (arg1 <= 27) {
            method1981((byte) 65, -88);
        }
        if (class436.field6282 >= 0) {
            for (int var4 = 0; var4 < this.field4626.length; var4++) {
                if (!arg0.method2089(class436.field6282, -127, this.field4626[var4])) {
                    return false;
                }
            }
        } else {
            for (int var5 = 0; var5 < this.field4626.length; var5++) {
                if (!arg0.method2077(0, this.field4626[var5])) {
                    return false;
                }
            }
        }
        for (int var6 = 0; var6 < this.field4628.length; var6++) {
            if (!arg2.method2363((byte) -120, this.field4628[var6])) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!ur", name = "b", descriptor = "(III)B")
    public static final byte method1980(int arg0, int arg1, int arg2) {
        field4632++;
        if (arg1 != -21638) {
            method1981((byte) 116, 69);
        }
        if (arg2 == 9) {
            return (byte) ((arg0 & 0x1) == 0 ? 1 : 2);
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(BI)V")
    public static final void method1981(byte arg0, int arg1) {
        field4638++;
        int var2 = -110 / ((78 - arg0) / 41);
        class449 var3 = class611.method3463(arg1, (byte) -111, 6);
        var3.method2614(123);
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(ZIDZLvo;IILfa;)[I")
    public final int[] method1982(boolean arg0, int arg1, double arg2, boolean arg3, class345 arg4, int arg5, int arg6, class615 arg7) {
        class213.field3241 = arg7;
        class398.field5758 = arg4;
        field4641++;
        for (int var10 = 0; var10 < this.field4630.length; var10++) {
            this.field4630[var10].method1538(arg5, 0, arg6);
        }
        class51.method410((byte) -21, arg2);
        class550.method3227(-48, arg5, arg6);
        int[] var11 = new int[arg5 * arg6];
        int var12;
        byte var13;
        int var14;
        if (arg3) {
            var13 = -1;
            var12 = arg5 - 1;
            var14 = -1;
        } else {
            var12 = 0;
            var13 = 1;
            var14 = arg5;
        }
        int var15 = 0;
        for (int var16 = 0; var16 < arg6; var16++) {
            if (arg0) {
                var15 = var16;
            }
            int[] var19;
            int[] var20;
            int[] var21;
            if (this.field4629.field9160) {
                int[] var18 = this.field4629.method424(var16, (byte) -120);
                var19 = var18;
                var20 = var18;
                var21 = var18;
            } else {
                int[][] var22 = this.field4629.method298(-12424, var16);
                var21 = var22[1];
                var19 = var22[2];
                var20 = var22[0];
            }
            for (int var23 = var12; var23 != var14; var23 += var13) {
                int var24 = var20[var23] >> 4;
                if (var24 > 255) {
                    var24 = 255;
                }
                if (var24 < 0) {
                    var24 = 0;
                }
                int var25 = var21[var23] >> 4;
                if (var25 > 255) {
                    var25 = 255;
                }
                if (var25 < 0) {
                    var25 = 0;
                }
                int var26 = var19[var23] >> 4;
                if (var26 > 255) {
                    var26 = 255;
                }
                int var27 = class535.field7871[var25];
                if (var26 < 0) {
                    var26 = 0;
                }
                int var28 = class535.field7871[var24];
                int var29 = class535.field7871[var26];
                int var30 = (var27 << 8) + (var28 << 16) + var29;
                if (var30 != 0) {
                    var30 |= 0xFF000000;
                }
                var11[var15++] = var30;
                if (arg0) {
                    var15 += arg5 - 1;
                }
            }
        }
        for (int var17 = 0; var17 < this.field4630.length; var17++) {
            this.field4630[var17].method1543(-102);
        }
        if (arg1 < 93) {
            field4639 = null;
        }
        return var11;
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(II)Lai;")
    public static final class646 method1983(int arg0, int arg1) {
        field4634++;
        if (arg0 == 0) {
            return new class408();
        } else if (arg0 == 1) {
            return new class398();
        } else if (arg0 == 2) {
            return new class207();
        } else if (arg0 == 3) {
            return new class151();
        } else if (arg0 == 4) {
            return new class54();
        } else if (arg0 == 5) {
            return new class534();
        } else if (arg0 == 6) {
            return new class611();
        } else if (arg0 == 7) {
            return new class403();
        } else if (arg0 == 8) {
            return new class174();
        } else if (arg0 == 9) {
            return new class464();
        } else if (arg0 == 10) {
            return new class311();
        } else if (arg0 == 11) {
            return new class33();
        } else if (arg0 == 12) {
            return new class60();
        } else if (arg0 == 13) {
            return new class164();
        } else if (arg0 == 14) {
            return new class621();
        } else if (arg0 == 15) {
            return new class243();
        } else if (arg0 == 16) {
            return new class160();
        } else if (arg0 == 17) {
            return new class643();
        } else if (arg0 == 18) {
            return new class462();
        } else if (arg0 == 19) {
            return new class694();
        } else if (arg0 == 20) {
            return new class246();
        } else if (arg0 == 21) {
            return new class390();
        } else if (arg0 == 22) {
            return new class448();
        } else if (arg0 == 23) {
            return new class561();
        } else if (arg0 == 24) {
            return new class288();
        } else if (arg0 == 25) {
            return new class224();
        } else if (arg0 == 26) {
            return new class375();
        } else if (arg0 == 27) {
            return new class426();
        } else if (arg0 == 28) {
            return new class531();
        } else if (arg0 == 29) {
            return new class608();
        } else if (arg0 == 30) {
            return new class557();
        } else if (arg0 == 31) {
            return new class358();
        } else if (arg0 == 32) {
            return new class467();
        } else if (arg0 == 33) {
            return new class412();
        } else if (arg0 == 34) {
            return new class334();
        } else if (arg0 == 35) {
            return new class271();
        } else if (arg0 == 36) {
            return new class235();
        } else if (arg0 == 37) {
            return new class234();
        } else if (arg0 == 38) {
            return new class413();
        } else if (arg0 == 39) {
            return new class537();
        } else {
            if (arg1 <= 40) {
                method1984(-49);
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(I)V")
    public static void method1984(int arg0) {
        field4644 = null;
        field4636 = null;
        if (arg0 != 0) {
            field4636 = null;
        }
        field4639 = null;
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(Lat;Z)Z")
    public static final boolean method1985(class144 arg0, boolean arg1) {
        boolean var2 = class687.field9745 == class340.field4723;
        int var3 = 0;
        short var4 = 0;
        byte var5 = 0;
        arg0.method1096(-115);
        if (arg0.field2481 < 0 || arg0.field2484 < 0 || arg0.field2483 >= class33.field474 || arg0.field2486 >= class687.field9758) {
            return false;
        }
        short var6 = 0;
        for (int var7 = arg0.field2481; var7 <= arg0.field2483; var7++) {
            for (int var11 = arg0.field2484; var11 <= arg0.field2486; var11++) {
                class293 var12 = class316.method1907(arg0.field3158, var7, var11);
                if (var12 != null) {
                    class198 var13 = class421.method2492(-27822, arg0);
                    class198 var14 = var12.field4097;
                    if (var14 == null) {
                        var12.field4097 = var13;
                    } else {
                        while (var14.field3078 != null) {
                            var14 = var14.field3078;
                        }
                        var14.field3078 = var13;
                    }
                    if (var2 && (class544.field7990[var7][var11] & 0xFF000000) != 0) {
                        var3 = class544.field7990[var7][var11];
                        var4 = class453.field6524[var7][var11];
                        var5 = class352.field4941[var7][var11];
                    }
                    if (!arg1 && var12.field4084 != null && var12.field4084.field9737 > var6) {
                        var6 = var12.field4084.field9737;
                    }
                }
            }
        }
        if (var2 && (var3 & 0xFF000000) != 0) {
            for (int var8 = arg0.field2481; var8 <= arg0.field2483; var8++) {
                for (int var9 = arg0.field2484; var9 <= arg0.field2486; var9++) {
                    if ((class544.field7990[var8][var9] & 0xFF000000) == 0) {
                        class544.field7990[var8][var9] = var3;
                        class453.field6524[var8][var9] = var4;
                        class352.field4941[var8][var9] = var5;
                    }
                }
            }
        }
        if (arg1) {
            class88.field1308[class136.field2197++] = arg0;
        } else {
            int var10 = class687.field9745 == class340.field4723 ? 1 : 0;
            if (!arg0.method633(true)) {
                class128.field2093[var10][class108.field1764[var10]++] = arg0;
            } else if (arg0.method630(-2)) {
                class430.field6131[var10][class352.field4945[var10]++] = arg0;
            } else {
                class431.field6138[var10][class310.field4305[var10]++] = arg0;
            }
        }
        if (arg1) {
            arg0.field3160 -= var6;
        }
        return true;
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(ILvo;ZIDILfa;)[I")
    public final int[] method1986(int arg0, class345 arg1, boolean arg2, int arg3, double arg4, int arg5, class615 arg6) {
        class213.field3241 = arg6;
        class398.field5758 = arg1;
        field4631++;
        for (int var9 = 0; var9 < this.field4630.length; var9++) {
            this.field4630[var9].method1538(arg3, arg5 ^ 0xFF, arg0);
        }
        class51.method410((byte) -21, arg4);
        class550.method3227(arg5 - 328, arg3, arg0);
        int[] var10 = new int[arg3 * 4 * arg0];
        int var11 = 0;
        for (int var12 = 0; var12 < arg0; var12++) {
            int[] var15;
            int[] var16;
            int[] var17;
            if (this.field4629.field9160) {
                int[] var14 = this.field4629.method424(var12, (byte) -120);
                var15 = var14;
                var16 = var14;
                var17 = var14;
            } else {
                int[][] var18 = this.field4629.method298(-12424, var12);
                var17 = var18[1];
                var15 = var18[0];
                var16 = var18[2];
            }
            if (arg2) {
                var11 = var12;
            }
            int[] var19;
            if (this.field4627.field9160) {
                var19 = this.field4627.method424(var12, (byte) -120);
            } else {
                var19 = this.field4627.method298(arg5 - 12679, var12)[0];
            }
            for (int var20 = arg3 - 1; var20 >= 0; var20--) {
                int var21 = var15[var20] >> 4;
                if (var21 > 255) {
                    var21 = 255;
                }
                if (var21 < 0) {
                    var21 = 0;
                }
                int var22 = var17[var20] >> 4;
                if (var22 > 255) {
                    var22 = 255;
                }
                if (var22 < 0) {
                    var22 = 0;
                }
                int var23 = var16[var20] >> 4;
                if (var23 > 255) {
                    var23 = 255;
                }
                int var24 = class535.field7871[var22];
                if (var23 < 0) {
                    var23 = 0;
                }
                int var25 = class535.field7871[var21];
                int var26 = class535.field7871[var23];
                int var27;
                if (var25 == 0 && var24 == 0 && var26 == 0) {
                    var27 = 0;
                } else {
                    var27 = var19[var20] >> 4;
                    if (var27 > 255) {
                        var27 = 255;
                    }
                    if (var27 < 0) {
                        var27 = 0;
                    }
                }
                var10[var11++] = (var24 << 8) + (var25 << 16) + (var27 << 24) + var26;
                if (arg2) {
                    var11 += arg3 - 1;
                }
            }
        }
        if (arg5 != 255) {
            method1980(-109, 78, 13);
        }
        for (int var13 = 0; var13 < this.field4630.length; var13++) {
            this.field4630[var13].method1543(arg5 - 132);
        }
        return var10;
    }

    @OriginalMember(owner = "client!ur", name = "<init>", descriptor = "()V")
    public class333() {
        this.field4628 = new int[0];
        this.field4626 = new int[0];
        this.field4642 = new class408(0);
        this.field4642.field9153 = 1;
        this.field4629 = new class408();
        this.field4629.field9153 = 1;
        this.field4627 = new class408();
        this.field4630 = new class646[] { this.field4629, this.field4627, this.field4642 };
        this.field4627.field9153 = 1;
    }

    @OriginalMember(owner = "client!ur", name = "<init>", descriptor = "(Lek;)V")
    public class333(class465 arg0) {
        int var2 = arg0.method2705(-24);
        int var3 = 0;
        int var4 = 0;
        int[][] var5 = new int[var2][];
        this.field4630 = new class646[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            class646 var16 = class367.method2205(arg0, 75);
            if (var16.method3146(true) >= 0) {
                var3++;
            }
            if (var16.method1540(0) >= 0) {
                var4++;
            }
            int var17 = var16.field9158.length;
            var5[var6] = new int[var17];
            for (int var18 = 0; var18 < var17; var18++) {
                var5[var6][var18] = arg0.method2705(-67);
            }
            this.field4630[var6] = var16;
        }
        this.field4626 = new int[var3];
        this.field4628 = new int[var4];
        int var7 = 0;
        int var8 = 0;
        for (int var9 = 0; var9 < var2; var9++) {
            class646 var11 = this.field4630[var9];
            int var12 = var11.field9158.length;
            for (int var13 = 0; var13 < var12; var13++) {
                var11.field9158[var13] = this.field4630[var5[var9][var13]];
            }
            int var14 = var11.method3146(true);
            int var15 = var11.method1540(0);
            if (var14 > 0) {
                this.field4626[var7++] = var14;
            }
            if (var15 > 0) {
                this.field4628[var8++] = var15;
            }
            var5[var9] = null;
        }
        this.field4629 = this.field4630[arg0.method2705(-93)];
        this.field4627 = this.field4630[arg0.method2705(-69)];
        Object var10 = null;
        this.field4642 = this.field4630[arg0.method2705(-54)];
    }
}
