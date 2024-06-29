import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qn")
public class class47 {

    @OriginalMember(owner = "client!qn", name = "j", descriptor = "Lf;")
    private class532 field574 = null;

    @OriginalMember(owner = "client!qn", name = "v", descriptor = "I")
    public int field586;

    @OriginalMember(owner = "client!qn", name = "R", descriptor = "Z")
    private boolean field608;

    @OriginalMember(owner = "client!qn", name = "h", descriptor = "Lim;")
    private class404 field572;

    @OriginalMember(owner = "client!qn", name = "S", descriptor = "Lud;")
    public static class27 field609;

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "I")
    public static int field565;

    @OriginalMember(owner = "client!qn", name = "b", descriptor = "I")
    public static int field566;

    @OriginalMember(owner = "client!qn", name = "c", descriptor = "I")
    public static int field567;

    @OriginalMember(owner = "client!qn", name = "d", descriptor = "I")
    public static int field568;

    @OriginalMember(owner = "client!qn", name = "e", descriptor = "I")
    public static int field569;

    @OriginalMember(owner = "client!qn", name = "f", descriptor = "I")
    public static int field570;

    @OriginalMember(owner = "client!qn", name = "g", descriptor = "I")
    public static int field571;

    @OriginalMember(owner = "client!qn", name = "i", descriptor = "I")
    public static int field573;

    @OriginalMember(owner = "client!qn", name = "k", descriptor = "I")
    public static int field575;

    @OriginalMember(owner = "client!qn", name = "m", descriptor = "I")
    public static int field577;

    @OriginalMember(owner = "client!qn", name = "n", descriptor = "I")
    public static int field578;

    @OriginalMember(owner = "client!qn", name = "o", descriptor = "I")
    public static int field579;

    @OriginalMember(owner = "client!qn", name = "p", descriptor = "I")
    public static int field580;

    @OriginalMember(owner = "client!qn", name = "q", descriptor = "I")
    public static int field581;

    @OriginalMember(owner = "client!qn", name = "r", descriptor = "I")
    public static int field582;

    @OriginalMember(owner = "client!qn", name = "t", descriptor = "I")
    public static int field584;

    @OriginalMember(owner = "client!qn", name = "u", descriptor = "I")
    public static int field585;

    @OriginalMember(owner = "client!qn", name = "w", descriptor = "I")
    public static int field587;

    @OriginalMember(owner = "client!qn", name = "x", descriptor = "I")
    public static int field588;

    @OriginalMember(owner = "client!qn", name = "y", descriptor = "I")
    public static int field589;

    @OriginalMember(owner = "client!qn", name = "z", descriptor = "I")
    public static int field590;

    @OriginalMember(owner = "client!qn", name = "A", descriptor = "I")
    public static int field591;

    @OriginalMember(owner = "client!qn", name = "B", descriptor = "I")
    public static int field592;

    @OriginalMember(owner = "client!qn", name = "C", descriptor = "I")
    public static int field593;

    @OriginalMember(owner = "client!qn", name = "D", descriptor = "I")
    public static int field594;

    @OriginalMember(owner = "client!qn", name = "E", descriptor = "I")
    public static int field595;

    @OriginalMember(owner = "client!qn", name = "F", descriptor = "I")
    public static int field596;

    @OriginalMember(owner = "client!qn", name = "G", descriptor = "I")
    public static int field597;

    @OriginalMember(owner = "client!qn", name = "H", descriptor = "I")
    public static int field598;

    @OriginalMember(owner = "client!qn", name = "I", descriptor = "I")
    public static int field599;

    @OriginalMember(owner = "client!qn", name = "J", descriptor = "I")
    public static int field600;

    @OriginalMember(owner = "client!qn", name = "K", descriptor = "I")
    public static int field601;

    @OriginalMember(owner = "client!qn", name = "L", descriptor = "I")
    public static int field602;

    @OriginalMember(owner = "client!qn", name = "N", descriptor = "I")
    public static int field604;

    @OriginalMember(owner = "client!qn", name = "O", descriptor = "I")
    public static int field605;

    @OriginalMember(owner = "client!qn", name = "P", descriptor = "I")
    public static int field606;

    @OriginalMember(owner = "client!qn", name = "Q", descriptor = "I")
    public static int field607;

    @OriginalMember(owner = "client!qn", name = "l", descriptor = "[Lbs;")
    public static class485[] field576;

    @OriginalMember(owner = "client!qn", name = "s", descriptor = "[Ljava/lang/Object;")
    private Object[] field583;

    @OriginalMember(owner = "client!qn", name = "M", descriptor = "[[Ljava/lang/Object;")
    private Object[][] field603;

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(IZ)V")
    private final void method455(int arg0, boolean arg1) {
        if (this.field608) {
            this.field583[arg0] = this.field572.method502(0, arg0);
        } else {
            this.field583[arg0] = class379.method2149(-20569, false, this.field572.method502(0, arg0));
        }
        field569++;
        if (!arg1) {
            this.method455(51, true);
        }
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(IB)[I")
    public final int[] method456(int arg0, byte arg1) {
        field591++;
        if (!this.method468(arg0, 89)) {
            return null;
        }
        int[] var3 = this.field574.field7835[arg0];
        if (var3 == null) {
            var3 = new int[this.field574.field7818[arg0]];
            int var4 = 0;
            while (var3.length > var4) {
                var3[var4] = var4++;
            }
        }
        return arg1 >= -72 ? null : var3;
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(II)[B")
    public final byte[] method457(int arg0, int arg1) {
        field606++;
        if (!this.method490((byte) -38)) {
            return null;
        } else if (this.field574.field7830.length == 1) {
            return this.method481(0, arg0, -66);
        } else if (this.method468(arg0, 106)) {
            if (arg1 > -54) {
                this.method490((byte) 125);
            }
            if (this.field574.field7830[arg0] != 1) {
                throw new RuntimeException();
            }
            return this.method481(arg0, 0, -72);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(BLbf;)V")
    public static final void method458(byte arg0, class375 arg1) {
        if ((arg1 instanceof class295)) {
            class295 var3 = (class295) arg1;
            if (var3.field3773 != null) {
                class176.method1124(class23.field336.field2676 != var3.field2676, (byte) -99, var3);
            }
        } else if (arg1 instanceof class223) {
            class223 var2 = (class223) arg1;
            class135.method932(-80, var2, class23.field336.field2676 != var2.field2676);
        }
        field593++;
        if (arg0 != -43) {
            method470(115, -51, 11, 66, 10, -24);
        }
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(Ljava/lang/String;I)Z")
    public final boolean method459(String arg0, int arg1) {
        field571++;
        if (this.method490((byte) -38)) {
            String var3 = arg0.toLowerCase();
            int var4 = -21 % ((64 - arg1) / 51);
            int var5 = this.field574.field7832.method46(class471.method2843(var3, false), (byte) -66);
            return var5 >= 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(III[I)Z")
    private final boolean method460(int arg0, int arg1, int arg2, int[] arg3) {
        field568++;
        if (!this.method468(arg0, 125)) {
            return false;
        } else if (this.field583[arg0] == null) {
            return false;
        } else {
            int var5 = this.field574.field7818[arg0];
            int[] var6 = this.field574.field7835[arg0];
            if (this.field603[arg0] == null) {
                this.field603[arg0] = new Object[this.field574.field7830[arg0]];
            }
            Object[] var7 = this.field603[arg0];
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
            if (arg1 != 3674) {
                this.method465(-11, (byte) -8);
            }
            byte[] var11;
            if (arg3 != null && (arg3[0] != 0 || arg3[1] != 0 || arg3[2] != 0 || arg3[3] != 0)) {
                var11 = class406.method2402(false, true, this.field583[arg0]);
                class463 var12 = new class463(var11);
                var12.method2771(5, var12.field6618.length, (byte) 112, arg3);
            } else {
                var11 = class406.method2402(false, false, this.field583[arg0]);
            }
            byte[] var13;
            try {
                var13 = class271.method1608((byte) -100, var11);
            } catch (RuntimeException var49) {
                throw class208.method1292(var49, "T3 - " + (arg3 != null) + "," + arg0 + "," + var11.length + "," + class242.method1478(arg1 - 3671, var11, var11.length) + "," + class242.method1478(3, var11, var11.length - 2) + "," + this.field574.field7837[arg0] + "," + this.field574.field7828);
            }
            if (this.field608) {
                this.field583[arg0] = null;
            }
            if (var5 <= 1) {
                int var48;
                if (var6 == null) {
                    var48 = 0;
                } else {
                    var48 = var6[0];
                }
                if (this.field586 == 0) {
                    var7[var48] = class379.method2149(-20569, false, var13);
                } else {
                    var7[var48] = var13;
                }
            } else if (this.field586 == 2) {
                int var15 = var13.length;
                int var50 = var15 - 1;
                int var16 = var13[var50] & 0xFF;
                int var17 = var50 - var5 * var16 * 4;
                class463 var18 = new class463(var13);
                int var19 = 0;
                int var20 = 0;
                var18.field6631 = var17;
                for (int var21 = 0; var21 < var16; var21++) {
                    int var22 = 0;
                    for (int var23 = 0; var23 < var5; var23++) {
                        var22 += var18.method2727(-102);
                        int var24;
                        if (var6 == null) {
                            var24 = var23;
                        } else {
                            var24 = var6[var23];
                        }
                        if (arg2 == var24) {
                            var20 = var24;
                            var19 += var22;
                        }
                    }
                }
                if (var19 == 0) {
                    return true;
                }
                byte[] var25 = new byte[var19];
                int var26 = 0;
                var18.field6631 = var17;
                int var27 = 0;
                for (int var28 = 0; var28 < var16; var28++) {
                    int var29 = 0;
                    for (int var30 = 0; var30 < var5; var30++) {
                        var29 += var18.method2727(arg1 - 3764);
                        int var31;
                        if (var6 == null) {
                            var31 = var30;
                        } else {
                            var31 = var6[var30];
                        }
                        if (arg2 == var31) {
                            class318.method1875(var13, var27, var25, var26, var29);
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
                int var34 = var51 - var33 * 4 * var5;
                class463 var35 = new class463(var13);
                int[] var36 = new int[var5];
                var35.field6631 = var34;
                for (int var37 = 0; var37 < var33; var37++) {
                    int var38 = 0;
                    for (int var39 = 0; var39 < var5; var39++) {
                        var38 += var35.method2727(-82);
                        var36[var39] += var38;
                    }
                }
                byte[][] var40 = new byte[var5][];
                for (int var41 = 0; var41 < var5; var41++) {
                    var40[var41] = new byte[var36[var41]];
                    var36[var41] = 0;
                }
                var35.field6631 = var34;
                int var42 = 0;
                for (int var43 = 0; var43 < var33; var43++) {
                    int var44 = 0;
                    for (int var45 = 0; var45 < var5; var45++) {
                        var44 += var35.method2727(arg1 - 3771);
                        class318.method1875(var13, var42, var40[var45], var36[var45], var44);
                        var42 += var44;
                        var36[var45] += var44;
                    }
                }
                for (int var46 = 0; var46 < var5; var46++) {
                    int var47;
                    if (var6 == null) {
                        var47 = var46;
                    } else {
                        var47 = var6[var46];
                    }
                    if (this.field586 == 0) {
                        var7[var47] = class379.method2149(-20569, false, var40[var46]);
                    } else {
                        var7[var47] = var40[var46];
                    }
                }
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(I)V")
    public final void method461(int arg0) {
        field566++;
        if (arg0 != 0) {
            field576 = null;
        }
        if (this.field583 != null) {
            for (int var2 = 0; var2 < this.field583.length; var2++) {
                this.field583[var2] = null;
            }
        }
    }

    @OriginalMember(owner = "client!qn", name = "b", descriptor = "(I)V")
    public static final void method462(int arg0) {
        field585++;
        class365[] var1 = class159.field2029;
        synchronized (class159.field2029) {
            for (int var2 = arg0; var2 < class159.field2029.length; var2++) {
                class159.field2029[var2] = new class365();
                class244.field3153[var2] = 0;
            }
        }
    }

    @OriginalMember(owner = "client!qn", name = "c", descriptor = "(I)I")
    public final int method463(int arg0) {
        field567++;
        if (!this.method490((byte) -38)) {
            return 0;
        }
        int var2 = -31 % ((arg0 - 41) / 53);
        int var3 = 0;
        int var4 = 0;
        for (int var5 = 0; var5 < this.field583.length; var5++) {
            if (this.field574.field7818[var5] > 0) {
                var3 += 100;
                var4 += this.method465(var5, (byte) 119);
            }
        }
        if (var3 == 0) {
            return 100;
        } else {
            return var4 * 100 / var3;
        }
    }

    @OriginalMember(owner = "client!qn", name = "d", descriptor = "(I)Z")
    public final boolean method464(int arg0) {
        field599++;
        int var2 = 61 % ((arg0 - 28) / 58);
        if (!this.method490((byte) -38)) {
            return false;
        }
        boolean var3 = true;
        for (int var4 = 0; var4 < this.field574.field7827.length; var4++) {
            int var5 = this.field574.field7827[var4];
            if (this.field583[var5] == null) {
                this.method455(var5, true);
                if (this.field583[var5] == null) {
                    var3 = false;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!qn", name = "b", descriptor = "(IB)I")
    private final int method465(int arg0, byte arg1) {
        int var3 = 119 / ((arg1 + 35) / 41);
        field596++;
        if (this.method468(arg0, 100)) {
            return this.field583[arg0] == null ? this.field572.method503(arg0, 14847) : 100;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;I)[B")
    public final byte[] method466(String arg0, String arg1, int arg2) {
        field581++;
        if (!this.method490((byte) -38)) {
            return null;
        }
        String var4 = arg1.toLowerCase();
        int var5 = 26 / ((-arg2 - 13) / 42);
        String var6 = arg0.toLowerCase();
        int var7 = this.field574.field7832.method46(class471.method2843(var4, false), (byte) -88);
        if (this.method468(var7, 79)) {
            int var8 = this.field574.field7822[var7].method46(class471.method2843(var6, false), (byte) -50);
            return this.method481(var7, var8, -110);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!qn", name = "b", descriptor = "(Ljava/lang/String;I)V")
    public final void method467(String arg0, int arg1) {
        field600++;
        if (!this.method490((byte) -38)) {
            return;
        }
        String var3 = arg0.toLowerCase();
        if (arg1 >= -27) {
            field609 = null;
        }
        int var4 = this.field574.field7832.method46(class471.method2843(var3, false), (byte) -110);
        this.method475(-1, var4);
    }

    @OriginalMember(owner = "client!qn", name = "b", descriptor = "(II)Z")
    private final boolean method468(int arg0, int arg1) {
        field589++;
        if (!this.method490((byte) -38)) {
            return false;
        } else if (arg0 >= 0 && arg0 < this.field574.field7830.length && this.field574.field7830[arg0] != 0) {
            return arg1 > 62;
        } else if (class85.field1070) {
            throw new IllegalArgumentException(Integer.toString(arg0));
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!qn", name = "c", descriptor = "(II)I")
    public final int method469(int arg0, int arg1) {
        field601++;
        if (this.method468(arg1, arg0 - 30199)) {
            return arg0 == 30322 ? this.field574.field7830[arg1] : 59;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(IIIIII)V")
    public static final void method470(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = 110 / ((40 - arg2) / 58);
        field598++;
        if (class407.field5817.field3619 != 0 && arg3 != 0 && class189.field2475 < 50 && arg1 != -1) {
            class466.field6728[class189.field2475++] = new class212((byte) 1, arg1, arg3, arg4, arg0, arg5);
        }
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(IBI)Z")
    public final boolean method471(int arg0, byte arg1, int arg2) {
        field588++;
        if (!this.method477(-1, arg2, arg0)) {
            return false;
        } else if (this.field603[arg0] != null && this.field603[arg0][arg2] != null) {
            return true;
        } else if (arg1 > -66) {
            return true;
        } else if (this.field583[arg0] == null) {
            this.method455(arg0, true);
            return this.field583[arg0] != null;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(B)I")
    public final int method472(byte arg0) {
        field570++;
        if (arg0 != -82) {
            this.method475(-91, 22);
        }
        return this.method490((byte) -38) ? this.field574.field7830.length : -1;
    }

    @OriginalMember(owner = "client!qn", name = "d", descriptor = "(II)V")
    public final void method473(int arg0, int arg1) {
        field565++;
        if (!this.method468(arg1, 110)) {
            return;
        }
        if (this.field603 != null) {
            this.field603[arg1] = null;
        }
        if (arg0 != -2) {
            this.method483(-43);
        }
    }

    @OriginalMember(owner = "client!qn", name = "c", descriptor = "(IB)I")
    public final int method474(int arg0, byte arg1) {
        field579++;
        if (arg1 != 126) {
            this.field603 = null;
        }
        if (this.method490((byte) -38)) {
            int var3 = this.field574.field7832.method46(arg0, (byte) -98);
            return this.method468(var3, 66) ? var3 : -1;
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!qn", name = "e", descriptor = "(II)V")
    private final void method475(int arg0, int arg1) {
        if (arg0 != -1) {
            this.field586 = -123;
        }
        this.field572.method499(arg0 - 637, arg1);
        field578++;
    }

    @OriginalMember(owner = "client!qn", name = "f", descriptor = "(II)Z")
    public final boolean method476(int arg0, int arg1) {
        field607++;
        if (arg1 != 10859) {
            this.method482(null, -67, null);
        }
        if (!this.method468(arg0, 94)) {
            return false;
        } else if (this.field583[arg0] == null) {
            this.method455(arg0, true);
            return this.field583[arg0] != null;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(III)Z")
    private final boolean method477(int arg0, int arg1, int arg2) {
        field594++;
        if (!this.method490((byte) -38)) {
            return false;
        } else if (arg0 >= ~arg2 && arg1 >= 0 && this.field574.field7830.length > arg2 && arg1 < this.field574.field7830[arg2]) {
            return true;
        } else if (class85.field1070) {
            throw new IllegalArgumentException(arg2 + "," + arg1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(Lfh;B)Lag;")
    public static final class483 method478(class463 arg0, byte arg1) {
        if (arg1 <= 35) {
            field609 = null;
        }
        field584++;
        class483 var2 = new class483();
        var2.field7066 = arg0.method2758((byte) 109);
        var2.field7064 = class176.field2307.method847(var2.field7066, 32768);
        return var2;
    }

    @OriginalMember(owner = "client!qn", name = "e", descriptor = "(I)I")
    public final int method479(int arg0) {
        int var2 = -11 / ((arg0 - 13) / 42);
        field597++;
        if (!this.method490((byte) -38)) {
            throw new IllegalStateException("");
        }
        return this.field574.field7828;
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(BLjava/lang/String;)Z")
    public final boolean method480(byte arg0, String arg1) {
        if (arg0 != 22) {
            return false;
        }
        field604++;
        if (this.method490((byte) -38)) {
            String var3 = arg1.toLowerCase();
            int var4 = this.field574.field7832.method46(class471.method2843(var3, false), (byte) -76);
            return this.method476(var4, arg0 + 10837);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!qn", name = "b", descriptor = "(III)[B")
    public final byte[] method481(int arg0, int arg1, int arg2) {
        if (arg2 >= -59) {
            this.field574 = null;
        }
        field580++;
        return this.method487(arg1, arg0, null, -20447);
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;)Z")
    public final boolean method482(String arg0, int arg1, String arg2) {
        field577++;
        if (!this.method490((byte) -38)) {
            return false;
        }
        String var4 = arg0.toLowerCase();
        String var5 = arg2.toLowerCase();
        int var6 = this.field574.field7832.method46(class471.method2843(var4, false), (byte) -60);
        if (arg1 != -1) {
            this.method474(111, (byte) 14);
        }
        if (this.method468(var6, arg1 ^ 0xFFFFFF8E)) {
            int var7 = this.field574.field7822[var6].method46(class471.method2843(var5, false), (byte) -92);
            return this.method471(var6, (byte) -122, var7);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!qn", name = "f", descriptor = "(I)V")
    public final void method483(int arg0) {
        if (this.field603 != null) {
            for (int var2 = 0; var2 < this.field603.length; var2++) {
                this.field603[var2] = null;
            }
        }
        field590++;
        if (arg0 != 0) {
            this.field574 = null;
        }
    }

    @OriginalMember(owner = "client!qn", name = "c", descriptor = "(Ljava/lang/String;I)I")
    public final int method484(String arg0, int arg1) {
        field573++;
        if (arg1 != 0) {
            this.method472((byte) 124);
        }
        if (this.method490((byte) -38)) {
            String var3 = arg0.toLowerCase();
            int var4 = this.field574.field7832.method46(class471.method2843(var3, false), (byte) -59);
            return this.method465(var4, (byte) 90);
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!qn", name = "g", descriptor = "(I)V")
    public static void method485(int arg0) {
        field576 = null;
        if (arg0 != 0) {
            field609 = null;
        }
        field609 = null;
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(ZI)Z")
    public final boolean method486(boolean arg0, int arg1) {
        field602++;
        if (!this.method490((byte) -38)) {
            return false;
        } else if (this.field574.field7830.length == 1) {
            return this.method471(0, (byte) -82, arg1);
        } else if (!this.method468(arg1, 112)) {
            return false;
        } else if (arg0) {
            return false;
        } else if (this.field574.field7830[arg1] == 1) {
            return this.method471(arg1, (byte) -71, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(II[II)[B")
    public final byte[] method487(int arg0, int arg1, int[] arg2, int arg3) {
        field592++;
        if (!this.method477(-1, arg0, arg1)) {
            return null;
        }
        if (this.field603[arg1] == null || this.field603[arg1][arg0] == null) {
            boolean var5 = this.method460(arg1, 3674, arg0, arg2);
            if (!var5) {
                this.method455(arg1, true);
                boolean var6 = this.method460(arg1, arg3 + 24121, arg0, arg2);
                if (!var6) {
                    return null;
                }
            }
        }
        byte[] var7 = class406.method2402(false, false, this.field603[arg1][arg0]);
        if (this.field586 == 1) {
            this.field603[arg1][arg0] = null;
            if (this.field574.field7830[arg1] == 1) {
                this.field603[arg1] = null;
            }
        } else if (this.field586 == 2) {
            this.field603[arg1] = null;
        }
        if (arg3 != -20447) {
            this.method455(-86, true);
        }
        return var7;
    }

    @OriginalMember(owner = "client!qn", name = "d", descriptor = "(Ljava/lang/String;I)I")
    public final int method488(String arg0, int arg1) {
        field575++;
        if (!this.method490((byte) -38)) {
            return -1;
        }
        String var3 = arg0.toLowerCase();
        int var4 = this.field574.field7832.method46(class471.method2843(var3, false), (byte) -107);
        if (arg1 < 81) {
            this.field608 = false;
        }
        return this.method468(var4, 101) ? var4 : -1;
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(ZIZ)V")
    public final void method489(boolean arg0, int arg1, boolean arg2) {
        field582++;
        if (!this.method490((byte) -38)) {
            return;
        }
        if (arg0) {
            this.field574.field7832 = null;
            this.field574.field7833 = null;
        }
        if (arg1 == 0 && arg2) {
            this.field574.field7829 = null;
            this.field574.field7822 = null;
        }
    }

    @OriginalMember(owner = "client!qn", name = "<init>", descriptor = "(Lim;ZI)V")
    public class47(class404 arg0, boolean arg1, int arg2) {
        if (arg2 < 0 || arg2 > 2) {
            throw new IllegalArgumentException("js5: Invalid value " + arg2 + " supplied for discardunpacked");
        }
        this.field586 = arg2;
        this.field608 = arg1;
        this.field572 = arg0;
    }

    @OriginalMember(owner = "client!qn", name = "b", descriptor = "(B)Z")
    private final boolean method490(byte arg0) {
        if (arg0 != -38) {
            this.field586 = 80;
        }
        field605++;
        if (this.field574 == null) {
            this.field574 = this.field572.method506((byte) 0);
            if (this.field574 == null) {
                return false;
            }
            this.field583 = new Object[this.field574.field7831];
            this.field603 = new Object[this.field574.field7831][];
        }
        return true;
    }

    static {
        new class335("Unable to add friend - system busy.", "Der Freund konnte nicht hinzugefügt werden, das System ist derzeit ausgelastet.", "Impossible d'ajouter un ami - système occupé.", "Não foi possível adicionar o amigo. O sistema está ocupado.");
        field609 = new class27(7, 0, 1, 1);
    }
}
