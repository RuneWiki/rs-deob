import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hc")
public class class235 {

    @OriginalMember(owner = "client!hc", name = "A", descriptor = "Lic;")
    private class143 field3784 = null;

    @OriginalMember(owner = "client!hc", name = "q", descriptor = "Z")
    private boolean field3774;

    @OriginalMember(owner = "client!hc", name = "L", descriptor = "Z")
    private boolean field3795;

    @OriginalMember(owner = "client!hc", name = "l", descriptor = "Lqj;")
    private class149 field3769;

    @OriginalMember(owner = "client!hc", name = "v", descriptor = "[I")
    public static int[] field3779 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!hc", name = "p", descriptor = "Loh;")
    public static class281 field3773 = new class281(4);

    @OriginalMember(owner = "client!hc", name = "K", descriptor = "I")
    public static int field3794 = 0;

    @OriginalMember(owner = "client!hc", name = "M", descriptor = "Z")
    public static boolean field3796 = false;

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "I")
    public static int field3758;

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "I")
    public static int field3759;

    @OriginalMember(owner = "client!hc", name = "c", descriptor = "I")
    public static int field3760;

    @OriginalMember(owner = "client!hc", name = "d", descriptor = "I")
    public static int field3761;

    @OriginalMember(owner = "client!hc", name = "e", descriptor = "I")
    public static int field3762;

    @OriginalMember(owner = "client!hc", name = "f", descriptor = "I")
    public static int field3763;

    @OriginalMember(owner = "client!hc", name = "g", descriptor = "I")
    public static int field3764;

    @OriginalMember(owner = "client!hc", name = "h", descriptor = "I")
    public static int field3765;

    @OriginalMember(owner = "client!hc", name = "i", descriptor = "I")
    public static int field3766;

    @OriginalMember(owner = "client!hc", name = "j", descriptor = "I")
    public static int field3767;

    @OriginalMember(owner = "client!hc", name = "k", descriptor = "I")
    public static int field3768;

    @OriginalMember(owner = "client!hc", name = "m", descriptor = "I")
    public static int field3770;

    @OriginalMember(owner = "client!hc", name = "n", descriptor = "I")
    public static int field3771;

    @OriginalMember(owner = "client!hc", name = "o", descriptor = "I")
    public static int field3772;

    @OriginalMember(owner = "client!hc", name = "r", descriptor = "I")
    public static int field3775;

    @OriginalMember(owner = "client!hc", name = "s", descriptor = "I")
    public static int field3776;

    @OriginalMember(owner = "client!hc", name = "t", descriptor = "I")
    public static int field3777;

    @OriginalMember(owner = "client!hc", name = "u", descriptor = "I")
    public static int field3778;

    @OriginalMember(owner = "client!hc", name = "w", descriptor = "I")
    public static int field3780;

    @OriginalMember(owner = "client!hc", name = "x", descriptor = "I")
    public static int field3781;

    @OriginalMember(owner = "client!hc", name = "y", descriptor = "I")
    public static int field3782;

    @OriginalMember(owner = "client!hc", name = "z", descriptor = "I")
    public static int field3783;

    @OriginalMember(owner = "client!hc", name = "B", descriptor = "I")
    public static int field3785;

    @OriginalMember(owner = "client!hc", name = "C", descriptor = "I")
    public static int field3786;

    @OriginalMember(owner = "client!hc", name = "D", descriptor = "I")
    public static int field3787;

    @OriginalMember(owner = "client!hc", name = "E", descriptor = "I")
    public static int field3788;

    @OriginalMember(owner = "client!hc", name = "F", descriptor = "I")
    public static int field3789;

    @OriginalMember(owner = "client!hc", name = "H", descriptor = "I")
    public static int field3791;

    @OriginalMember(owner = "client!hc", name = "I", descriptor = "I")
    public static int field3792;

    @OriginalMember(owner = "client!hc", name = "N", descriptor = "I")
    public static int field3797;

    @OriginalMember(owner = "client!hc", name = "O", descriptor = "I")
    public static int field3798;

    @OriginalMember(owner = "client!hc", name = "G", descriptor = "[Ljava/lang/Object;")
    private Object[] field3790;

    @OriginalMember(owner = "client!hc", name = "J", descriptor = "[[Ljava/lang/Object;")
    private Object[][] field3793;

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(B)Z")
    private final boolean method1588(byte arg0) {
        field3770++;
        if (this.field3784 == null) {
            this.field3784 = this.field3769.method1005(-1502);
            if (this.field3784 == null) {
                return false;
            }
            this.field3793 = new Object[this.field3784.field2175][];
            this.field3790 = new Object[this.field3784.field2175];
        }
        return arg0 == -101 ? true : true;
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(I[II)Z")
    private final boolean method1589(int arg0, int[] arg1, int arg2) {
        field3771++;
        if (!this.method1597(0, arg0)) {
            return false;
        } else if (this.field3790[arg0] == null) {
            return false;
        } else {
            int var4 = this.field3784.field2186[arg0];
            int[] var5 = this.field3784.field2171[arg0];
            if (this.field3793[arg0] == null) {
                this.field3793[arg0] = new Object[this.field3784.field2190[arg0]];
            }
            Object[] var6 = this.field3793[arg0];
            boolean var7 = true;
            int var8 = 103 % ((arg2 - 48) / 51);
            for (int var9 = 0; var9 < var4; var9++) {
                int var10;
                if (var5 == null) {
                    var10 = var9;
                } else {
                    var10 = var5[var9];
                }
                if (var6[var10] == null) {
                    var7 = false;
                    break;
                }
            }
            if (var7) {
                return true;
            }
            byte[] var11;
            if (arg1 != null && (arg1[0] != 0 || arg1[1] != 0 || arg1[2] != 0 || arg1[3] != 0)) {
                var11 = class103.method748(this.field3790[arg0], true, 520);
                class88 var12 = new class88(var11);
                var12.method651(arg1, (byte) -9, 5, var12.field1471.length);
            } else {
                var11 = class103.method748(this.field3790[arg0], false, 520);
            }
            byte[] var13;
            try {
                var13 = class261.method1770(var11, (byte) 14);
            } catch (RuntimeException var32) {
                throw class167.method1126(var32, "T3 - " + (arg1 != null) + "," + arg0 + "," + var11.length + "," + class69.method503(var11.length, var11, 0) + "," + class69.method503(var11.length - 2, var11, 0) + "," + this.field3784.field2182[arg0] + "," + this.field3784.field2179);
            }
            if (this.field3795) {
                this.field3790[arg0] = null;
            }
            if (var4 <= 1) {
                int var15;
                if (var5 == null) {
                    var15 = 0;
                } else {
                    var15 = var5[0];
                }
                if (this.field3774) {
                    var6[var15] = var13;
                } else {
                    var6[var15] = class171.method1151(-137, false, var13);
                }
            } else {
                int var16 = var13.length;
                int var33 = var16 - 1;
                int var17 = var13[var33] & 0xFF;
                int var18 = var33 - var17 * 4 * var4;
                int[] var19 = new int[var4];
                class88 var20 = new class88(var13);
                var20.field1535 = var18;
                for (int var21 = 0; var21 < var17; var21++) {
                    int var22 = 0;
                    for (int var23 = 0; var23 < var4; var23++) {
                        var22 += var20.method641(-1);
                        var19[var23] += var22;
                    }
                }
                byte[][] var24 = new byte[var4][];
                for (int var25 = 0; var25 < var4; var25++) {
                    var24[var25] = new byte[var19[var25]];
                    var19[var25] = 0;
                }
                var20.field1535 = var18;
                int var26 = 0;
                for (int var27 = 0; var27 < var17; var27++) {
                    int var28 = 0;
                    for (int var29 = 0; var29 < var4; var29++) {
                        var28 += var20.method641(-1);
                        class175.method1187(var13, var26, var24[var29], var19[var29], var28);
                        var26 += var28;
                        var19[var29] += var28;
                    }
                }
                for (int var30 = 0; var30 < var4; var30++) {
                    int var31;
                    if (var5 == null) {
                        var31 = var30;
                    } else {
                        var31 = var5[var30];
                    }
                    if (this.field3774) {
                        var6[var31] = var24[var30];
                    } else {
                        var6[var31] = class171.method1151(-137, false, var24[var30]);
                    }
                }
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(IBI)[B")
    public final byte[] method1590(int arg0, byte arg1, int arg2) {
        if (arg1 == -25) {
            field3798++;
            return this.method1608(arg2, (byte) -44, (int[]) null, arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(BLjava/lang/String;)Z")
    public final boolean method1591(byte arg0, String arg1) {
        field3777++;
        if (!this.method1588((byte) -101)) {
            return false;
        }
        String var3 = arg1.toLowerCase();
        if (arg0 != -123) {
            field3794 = -82;
        }
        int var4 = this.field3784.field2197.method1958(class221.method1493((byte) -51, var3), (byte) 82);
        return this.method1609(arg0 ^ 0xFFFFFFF5, var4);
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(II)V")
    public final void method1592(int arg0, int arg1) {
        field3762++;
        if (!this.method1597(0, arg0)) {
            return;
        }
        if (this.field3793 != null) {
            this.field3793[arg0] = null;
        }
        if (arg1 <= 14) {
            this.method1609(-93, 58);
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(III)[B")
    public final byte[] method1593(int arg0, int arg1, int arg2) {
        field3759++;
        if (!this.method1599(arg1, 119, arg2)) {
            return null;
        }
        if (this.field3793[arg1] == null || this.field3793[arg1][arg2] == null) {
            boolean var4 = this.method1589(arg1, (int[]) null, -41);
            if (!var4) {
                this.method1612(arg1, (byte) 56);
                boolean var5 = this.method1589(arg1, (int[]) null, -22);
                if (!var5) {
                    return null;
                }
            }
        }
        if (arg0 <= 94) {
            this.method1594(-27);
        }
        return class103.method748(this.field3793[arg1][arg2], false, 520);
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(I)I")
    public final int method1594(int arg0) {
        field3766++;
        if (!this.method1588((byte) -101)) {
            return 0;
        }
        int var2 = 0;
        int var3 = 0;
        for (int var4 = 0; var4 < this.field3790.length; var4++) {
            if (this.field3784.field2186[var4] > 0) {
                var2 += 100;
                var3 += this.method1605(var4, (byte) -106);
            }
        }
        if (var2 == 0) {
            return 100;
        }
        int var5 = var3 * 100 / var2;
        if (arg0 <= 104) {
            return 90;
        } else {
            return var5;
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;)[B")
    public final byte[] method1595(int arg0, String arg1, String arg2) {
        if (arg0 != 3) {
            this.field3795 = true;
        }
        field3781++;
        if (!this.method1588((byte) -101)) {
            return null;
        }
        String var4 = arg2.toLowerCase();
        String var5 = arg1.toLowerCase();
        int var6 = this.field3784.field2197.method1958(class221.method1493((byte) 21, var4), (byte) 108);
        if (this.method1597(0, var6)) {
            int var7 = this.field3784.field2196[var6].method1958(class221.method1493((byte) -92, var5), (byte) 98);
            return this.method1590(var7, (byte) -25, var6);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "(I)V")
    public static final void method1596(int arg0) {
        field3765++;
        if (!class191.method1284(arg0 ^ 0xFFFFFF87) && class255.field4081 != class240.field3892) {
            class30.method238(class219.field3376, class283.field4473.field2268[0], class3.field14, false, false, -1592, class240.field3892, class283.field4473.field2271[0]);
            return;
        }
        if (arg0 != 0) {
            method1607((byte) -68);
        }
        if (class240.field3892 != class206.field3220 && class160.method1080(class240.field3892, arg0 ^ 0x103A)) {
            class206.field3220 = class240.field3892;
            class244.method1685(arg0 + 34);
        }
    }

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "(II)Z")
    private final boolean method1597(int arg0, int arg1) {
        field3786++;
        if (!this.method1588((byte) -101)) {
            return false;
        } else if (arg1 >= arg0 && arg1 < this.field3784.field2190.length && this.field3784.field2190[arg1] != 0) {
            return true;
        } else if (class277.field4398) {
            throw new IllegalArgumentException(Integer.toString(arg1));
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "(BLjava/lang/String;)V")
    public final void method1598(byte arg0, String arg1) {
        field3783++;
        if (!this.method1588((byte) -101)) {
            return;
        }
        String var3 = arg1.toLowerCase();
        int var4 = this.field3784.field2197.method1958(class221.method1493((byte) 126, var3), (byte) 104);
        if (arg0 <= 4) {
            this.method1604(-106, (String) null);
        }
        this.method1619(var4, 124);
    }

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "(III)Z")
    private final boolean method1599(int arg0, int arg1, int arg2) {
        field3758++;
        if (!this.method1588((byte) -101)) {
            return false;
        } else if (arg0 >= 0 && arg2 >= 0 && this.field3784.field2190.length > arg0 && arg2 < this.field3784.field2190[arg0]) {
            int var4 = -107 % ((arg1 - 68) / 44);
            return true;
        } else if (class277.field4398) {
            throw new IllegalArgumentException(arg0 + "," + arg2);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!hc", name = "c", descriptor = "(BLjava/lang/String;)I")
    public final int method1600(byte arg0, String arg1) {
        field3788++;
        if (!this.method1588((byte) -101)) {
            return 0;
        }
        if (arg0 != -95) {
            field3779 = null;
        }
        String var3 = arg1.toLowerCase();
        int var4 = this.field3784.field2197.method1958(class221.method1493((byte) 23, var3), (byte) 59);
        return this.method1605(var4, (byte) -110);
    }

    @OriginalMember(owner = "client!hc", name = "c", descriptor = "(II)[B")
    public final byte[] method1601(int arg0, int arg1) {
        field3792++;
        if (!this.method1588((byte) -101)) {
            return null;
        } else if (this.field3784.field2190.length == 1) {
            return this.method1590(arg1, (byte) -25, 0);
        } else if (!this.method1597(arg0 - 17055, arg1)) {
            return null;
        } else if (this.field3784.field2190[arg1] == 1) {
            return this.method1590(0, (byte) -25, arg1);
        } else {
            if (arg0 != 17055) {
                this.method1599(-18, -67, 104);
            }
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(BLjava/lang/String;Ljava/lang/String;)Z")
    public final boolean method1602(byte arg0, String arg1, String arg2) {
        field3761++;
        if (!this.method1588((byte) -101)) {
            return false;
        }
        String var4 = arg2.toLowerCase();
        String var5 = arg1.toLowerCase();
        int var6 = this.field3784.field2197.method1958(class221.method1493((byte) 127, var4), (byte) 78);
        if (arg0 < 43) {
            this.field3774 = true;
        }
        if (this.method1597(0, var6)) {
            int var7 = this.field3784.field2196[var6].method1958(class221.method1493((byte) 121, var5), (byte) 51);
            return this.method1615(-98, var6, var7);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(ILjava/lang/String;)I")
    public final int method1603(int arg0, String arg1) {
        field3768++;
        if (!this.method1588((byte) -101)) {
            return -1;
        }
        if (arg0 >= -104) {
            this.field3784 = null;
        }
        String var3 = arg1.toLowerCase();
        int var4 = this.field3784.field2197.method1958(class221.method1493((byte) 120, var3), (byte) 114);
        return this.method1597(0, var4) ? var4 : -1;
    }

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "(ILjava/lang/String;)Z")
    public final boolean method1604(int arg0, String arg1) {
        if (arg0 != -17743) {
            return false;
        }
        field3775++;
        if (this.method1588((byte) -101)) {
            String var3 = arg1.toLowerCase();
            int var4 = this.field3784.field2197.method1958(class221.method1493((byte) 127, var3), (byte) 67);
            return var4 >= 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(IB)I")
    private final int method1605(int arg0, byte arg1) {
        if (arg1 >= -93) {
            this.field3769 = null;
        }
        field3776++;
        if (this.method1597(0, arg0)) {
            return this.field3790[arg0] == null ? this.field3769.method1001((byte) -78, arg0) : 100;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!hc", name = "c", descriptor = "(I)I")
    public final int method1606(int arg0) {
        if (arg0 != 0) {
            this.field3790 = null;
        }
        field3780++;
        if (!this.method1588((byte) -101)) {
            throw new IllegalStateException("");
        }
        return this.field3784.field2179;
    }

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "(B)V")
    public static void method1607(byte arg0) {
        if (arg0 <= -53) {
            field3779 = null;
            field3773 = null;
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(IB[II)[B")
    public final byte[] method1608(int arg0, byte arg1, int[] arg2, int arg3) {
        field3760++;
        if (!this.method1599(arg0, arg1 + 169, arg3)) {
            return null;
        }
        if (this.field3793[arg0] == null || this.field3793[arg0][arg3] == null) {
            boolean var5 = this.method1589(arg0, arg2, 114);
            if (!var5) {
                this.method1612(arg0, (byte) 53);
                boolean var6 = this.method1589(arg0, arg2, 117);
                if (!var6) {
                    return null;
                }
            }
        }
        if (arg1 != -44) {
            this.field3774 = true;
        }
        byte[] var7 = class103.method748(this.field3793[arg0][arg3], false, 520);
        if (this.field3774) {
            this.field3793[arg0][arg3] = null;
            if (this.field3784.field2190[arg0] == 1) {
                this.field3793[arg0] = null;
            }
        }
        return var7;
    }

    @OriginalMember(owner = "client!hc", name = "d", descriptor = "(II)Z")
    public final boolean method1609(int arg0, int arg1) {
        if (arg0 < 100) {
            this.field3774 = false;
        }
        field3772++;
        if (!this.method1597(0, arg1)) {
            return false;
        } else if (this.field3790[arg1] == null) {
            this.method1612(arg1, (byte) 52);
            return this.field3790[arg1] != null;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(IZZ)V")
    public final void method1610(int arg0, boolean arg1, boolean arg2) {
        field3782++;
        if (!this.method1588((byte) -101)) {
            return;
        }
        if (arg1) {
            this.field3784.field2180 = null;
            this.field3784.field2196 = null;
        }
        if (arg0 != -22617) {
            this.field3769 = null;
        }
        if (arg2) {
            this.field3784.field2184 = null;
            this.field3784.field2197 = null;
        }
    }

    @OriginalMember(owner = "client!hc", name = "e", descriptor = "(II)[I")
    public final int[] method1611(int arg0, int arg1) {
        field3797++;
        if (!this.method1597(arg1 + arg1, arg0)) {
            return null;
        }
        int[] var3 = this.field3784.field2171[arg0];
        if (var3 == null) {
            var3 = new int[this.field3784.field2186[arg0]];
            int var4 = 0;
            while (var3.length > var4) {
                var3[var4] = var4++;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "(IB)V")
    private final void method1612(int arg0, byte arg1) {
        if (arg1 < 46) {
            this.method1619(12, 92);
        }
        if (this.field3795) {
            this.field3790[arg0] = this.field3769.method1003(arg0, 2);
        } else {
            this.field3790[arg0] = class171.method1151(-137, false, this.field3769.method1003(arg0, 2));
        }
        field3778++;
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(ZI)Z")
    public final boolean method1613(boolean arg0, int arg1) {
        field3789++;
        if (!this.method1588((byte) -101)) {
            return false;
        } else if (this.field3784.field2190.length == 1) {
            return this.method1615(-88, 0, arg1);
        } else {
            if (arg0) {
                this.field3795 = false;
            }
            if (!this.method1597(0, arg1)) {
                return false;
            } else if (this.field3784.field2190[arg1] == 1) {
                return this.method1615(-44, arg1, 0);
            } else {
                throw new RuntimeException();
            }
        }
    }

    @OriginalMember(owner = "client!hc", name = "d", descriptor = "(I)V")
    public final void method1614(int arg0) {
        field3767++;
        if (arg0 < -34 && this.field3793 != null) {
            for (int var2 = 0; var2 < this.field3793.length; var2++) {
                this.field3793[var2] = null;
            }
        }
    }

    @OriginalMember(owner = "client!hc", name = "c", descriptor = "(III)Z")
    public final boolean method1615(int arg0, int arg1, int arg2) {
        if (arg0 >= -26) {
            this.field3784 = null;
        }
        field3785++;
        if (!this.method1599(arg1, 11, arg2)) {
            return false;
        } else if (this.field3793[arg1] != null && this.field3793[arg1][arg2] != null) {
            return true;
        } else if (this.field3790[arg1] == null) {
            this.method1612(arg1, (byte) 109);
            return this.field3790[arg1] != null;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!hc", name = "f", descriptor = "(II)I")
    public final int method1616(int arg0, int arg1) {
        field3763++;
        return this.method1597(arg1 ^ arg1, arg0) ? this.field3784.field2190[arg0] : 0;
    }

    @OriginalMember(owner = "client!hc", name = "e", descriptor = "(I)Z")
    public final boolean method1617(int arg0) {
        field3787++;
        if (!this.method1588((byte) -101)) {
            return false;
        }
        boolean var2 = true;
        for (int var3 = 0; var3 < this.field3784.field2174.length; var3++) {
            int var4 = this.field3784.field2174[var3];
            if (this.field3790[var4] == null) {
                this.method1612(var4, (byte) 118);
                if (this.field3790[var4] == null) {
                    var2 = false;
                }
            }
        }
        if (arg0 != 14449) {
            this.method1608(127, (byte) -108, (int[]) null, -12);
        }
        return var2;
    }

    @OriginalMember(owner = "client!hc", name = "<init>", descriptor = "(Lqj;ZZ)V")
    public class235(class149 arg0, boolean arg1, boolean arg2) {
        this.field3774 = arg2;
        this.field3795 = arg1;
        this.field3769 = arg0;
    }

    @OriginalMember(owner = "client!hc", name = "f", descriptor = "(I)I")
    public final int method1618(int arg0) {
        field3791++;
        if (this.method1588((byte) -101)) {
            if (arg0 != 0) {
                this.method1618(-125);
            }
            return this.field3784.field2190.length;
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!hc", name = "g", descriptor = "(II)V")
    private final void method1619(int arg0, int arg1) {
        this.field3769.method1007((byte) 107, arg0);
        int var3 = -16 % ((62 - arg1) / 46);
        field3764++;
    }
}
