import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fc")
public class class343 {

    @OriginalMember(owner = "client!fc", name = "w", descriptor = "Lpo;")
    private class126 field4684 = null;

    @OriginalMember(owner = "client!fc", name = "s", descriptor = "Lht;")
    private class344 field4680;

    @OriginalMember(owner = "client!fc", name = "F", descriptor = "I")
    public int field4693;

    @OriginalMember(owner = "client!fc", name = "p", descriptor = "Z")
    private boolean field4677;

    @OriginalMember(owner = "client!fc", name = "C", descriptor = "I")
    public static int field4690 = 0;

    @OriginalMember(owner = "client!fc", name = "i", descriptor = "Lmq;")
    public static class104 field4670 = new class104(4);

    @OriginalMember(owner = "client!fc", name = "Q", descriptor = "Z")
    public static boolean field4704 = true;

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "I")
    public static int field4663;

    @OriginalMember(owner = "client!fc", name = "d", descriptor = "I")
    public static int field4665;

    @OriginalMember(owner = "client!fc", name = "e", descriptor = "I")
    public static int field4666;

    @OriginalMember(owner = "client!fc", name = "f", descriptor = "I")
    public static int field4667;

    @OriginalMember(owner = "client!fc", name = "g", descriptor = "I")
    public static int field4668;

    @OriginalMember(owner = "client!fc", name = "h", descriptor = "I")
    public static int field4669;

    @OriginalMember(owner = "client!fc", name = "j", descriptor = "I")
    public static int field4671;

    @OriginalMember(owner = "client!fc", name = "k", descriptor = "I")
    public static int field4672;

    @OriginalMember(owner = "client!fc", name = "l", descriptor = "I")
    public static int field4673;

    @OriginalMember(owner = "client!fc", name = "m", descriptor = "I")
    public static int field4674;

    @OriginalMember(owner = "client!fc", name = "n", descriptor = "I")
    public static int field4675;

    @OriginalMember(owner = "client!fc", name = "o", descriptor = "I")
    public static int field4676;

    @OriginalMember(owner = "client!fc", name = "q", descriptor = "I")
    public static int field4678;

    @OriginalMember(owner = "client!fc", name = "r", descriptor = "I")
    public static int field4679;

    @OriginalMember(owner = "client!fc", name = "t", descriptor = "I")
    public static int field4681;

    @OriginalMember(owner = "client!fc", name = "u", descriptor = "I")
    public static int field4682;

    @OriginalMember(owner = "client!fc", name = "v", descriptor = "I")
    public static int field4683;

    @OriginalMember(owner = "client!fc", name = "x", descriptor = "I")
    public static int field4685;

    @OriginalMember(owner = "client!fc", name = "y", descriptor = "I")
    public static int field4686;

    @OriginalMember(owner = "client!fc", name = "z", descriptor = "I")
    public static int field4687;

    @OriginalMember(owner = "client!fc", name = "A", descriptor = "I")
    public static int field4688;

    @OriginalMember(owner = "client!fc", name = "B", descriptor = "I")
    public static int field4689;

    @OriginalMember(owner = "client!fc", name = "D", descriptor = "I")
    public static int field4691;

    @OriginalMember(owner = "client!fc", name = "E", descriptor = "I")
    public static int field4692;

    @OriginalMember(owner = "client!fc", name = "G", descriptor = "I")
    public static int field4694;

    @OriginalMember(owner = "client!fc", name = "H", descriptor = "I")
    public static int field4695;

    @OriginalMember(owner = "client!fc", name = "I", descriptor = "I")
    public static int field4696;

    @OriginalMember(owner = "client!fc", name = "J", descriptor = "I")
    public static int field4697;

    @OriginalMember(owner = "client!fc", name = "K", descriptor = "I")
    public static int field4698;

    @OriginalMember(owner = "client!fc", name = "L", descriptor = "I")
    public static int field4699;

    @OriginalMember(owner = "client!fc", name = "M", descriptor = "I")
    public static int field4700;

    @OriginalMember(owner = "client!fc", name = "N", descriptor = "I")
    public static int field4701;

    @OriginalMember(owner = "client!fc", name = "O", descriptor = "I")
    public static int field4702;

    @OriginalMember(owner = "client!fc", name = "R", descriptor = "J")
    public static long field4705;

    @OriginalMember(owner = "client!fc", name = "P", descriptor = "Ldq;")
    public static class14 field4703;

    @OriginalMember(owner = "client!fc", name = "S", descriptor = "[I")
    public static int[] field4706;

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "[Ljava/lang/Object;")
    private Object[] field4662;

    @OriginalMember(owner = "client!fc", name = "c", descriptor = "[[Ljava/lang/Object;")
    private Object[][] field4664;

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;I)[B")
    public final byte[] method2024(String arg0, String arg1, int arg2) {
        field4679++;
        if (!this.method2032(29025)) {
            return null;
        }
        if (arg2 != 0) {
            this.field4677 = false;
        }
        String var4 = arg1.toLowerCase();
        String var5 = arg0.toLowerCase();
        int var6 = this.field4684.field1723.method462(32628, class168.method1041((byte) 74, var4));
        if (this.method2037(arg2 - 1, var6)) {
            int var7 = this.field4684.field1730[var6].method462(arg2 + 32628, class168.method1041((byte) 69, var5));
            return this.method2029(var6, var7, arg2);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(BI)I")
    public final int method2025(byte arg0, int arg1) {
        field4695++;
        if (!this.method2032(arg0 + 28951)) {
            return -1;
        }
        int var3 = this.field4684.field1723.method462(32628, arg1);
        if (arg0 == 74) {
            return this.method2037(-1, var3) ? var3 : -1;
        } else {
            return 30;
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(II)[I")
    public final int[] method2026(int arg0, int arg1) {
        if (arg1 >= -89) {
            this.field4684 = null;
        }
        field4692++;
        if (!this.method2037(-1, arg0)) {
            return null;
        }
        int[] var3 = this.field4684.field1734[arg0];
        if (var3 == null) {
            var3 = new int[this.field4684.field1720[arg0]];
            int var4 = 0;
            while (var4 < var3.length) {
                var3[var4] = var4++;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(I)I")
    public final int method2027(int arg0) {
        field4676++;
        int var2 = -55 % ((-arg0 - 40) / 57);
        return this.method2032(29025) ? this.field4684.field1728.length : -1;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(IBI)Z")
    private final boolean method2028(int arg0, byte arg1, int arg2) {
        if (arg1 < 35) {
            method2055((Object[]) null, 28, (byte) -11, -52, (long[]) null);
        }
        field4698++;
        if (!this.method2032(29025)) {
            return false;
        } else if (arg2 >= 0 && arg0 >= 0 && arg2 < this.field4684.field1728.length && arg0 < this.field4684.field1728[arg2]) {
            return true;
        } else if (class370.field5240) {
            throw new IllegalArgumentException(arg2 + "," + arg0);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(III)[B")
    public final byte[] method2029(int arg0, int arg1, int arg2) {
        field4685++;
        if (arg2 != 0) {
            field4706 = null;
        }
        return this.method2043(arg0, arg1, (int[]) null, 37);
    }

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "(I)V")
    public static void method2030(int arg0) {
        field4670 = null;
        field4706 = null;
        field4703 = null;
        int var1 = -99 / ((-arg0 - 4) / 44);
    }

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "(II)V")
    private final void method2031(int arg0, int arg1) {
        if (this.field4677) {
            this.field4662[arg1] = this.field4680.method832(-27333, arg1);
        } else {
            this.field4662[arg1] = class467.method2748(false, this.field4680.method832(-27333, arg1), (byte) -110);
        }
        field4671++;
        if (arg0 < 122) {
            this.field4684 = null;
        }
    }

    @OriginalMember(owner = "client!fc", name = "c", descriptor = "(I)Z")
    private final boolean method2032(int arg0) {
        if (arg0 != 29025) {
            this.field4664 = null;
        }
        field4696++;
        if (this.field4684 == null) {
            this.field4684 = this.field4680.method837((byte) 1);
            if (this.field4684 == null) {
                return false;
            }
            this.field4664 = new Object[this.field4684.field1727][];
            this.field4662 = new Object[this.field4684.field1727];
        }
        return true;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(B)V")
    public final void method2033(byte arg0) {
        field4688++;
        if (this.field4662 != null) {
            for (int var2 = 0; var2 < this.field4662.length; var2++) {
                this.field4662[var2] = null;
            }
        }
        int var3 = 30 / ((arg0 - 25) / 44);
    }

    @OriginalMember(owner = "client!fc", name = "c", descriptor = "(II)Z")
    public final boolean method2034(int arg0, int arg1) {
        field4668++;
        if (!this.method2032(29025)) {
            return false;
        }
        if (arg1 != -28758) {
            field4706 = null;
        }
        if (this.field4684.field1728.length == 1) {
            return this.method2035(0, arg0, -5657);
        } else if (!this.method2037(-1, arg0)) {
            return false;
        } else if (this.field4684.field1728[arg0] == 1) {
            return this.method2035(arg0, 0, -5657);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "(III)Z")
    public final boolean method2035(int arg0, int arg1, int arg2) {
        field4669++;
        if (!this.method2028(arg1, (byte) 47, arg0)) {
            return false;
        } else if (this.field4664[arg0] != null && this.field4664[arg0][arg1] != null) {
            return true;
        } else if (this.field4662[arg0] == null) {
            if (arg2 != -5657) {
                this.method2032(59);
            }
            this.method2031(125, arg0);
            return this.field4662[arg0] != null;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(IZZ)V")
    public final void method2036(int arg0, boolean arg1, boolean arg2) {
        field4697++;
        if (!this.method2032(29025)) {
            return;
        }
        if (arg2) {
            this.field4684.field1732 = null;
            this.field4684.field1730 = null;
        }
        if (arg0 != -9200) {
            field4704 = true;
        }
        if (arg1) {
            this.field4684.field1726 = null;
            this.field4684.field1723 = null;
        }
    }

    @OriginalMember(owner = "client!fc", name = "d", descriptor = "(II)Z")
    private final boolean method2037(int arg0, int arg1) {
        field4678++;
        if (!this.method2032(arg0 + 29026)) {
            return false;
        } else if (arg0 != -1) {
            return true;
        } else if (arg1 >= 0 && arg1 < this.field4684.field1728.length && this.field4684.field1728[arg1] != 0) {
            return true;
        } else if (class370.field5240) {
            throw new IllegalArgumentException(Integer.toString(arg1));
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "(BI)[B")
    public final byte[] method2038(byte arg0, int arg1) {
        field4682++;
        if (arg0 != -58) {
            this.method2042(-77, (String) null);
        }
        if (!this.method2032(29025)) {
            return null;
        } else if (this.field4684.field1728.length == 1) {
            return this.method2029(0, arg1, arg0 + 58);
        } else if (!this.method2037(-1, arg1)) {
            return null;
        } else if (this.field4684.field1728[arg1] == 1) {
            return this.method2029(arg1, 0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!fc", name = "d", descriptor = "(I)Z")
    public final boolean method2039(int arg0) {
        field4699++;
        if (!this.method2032(29025)) {
            return false;
        }
        int var2 = 13 % ((28 - arg0) / 36);
        boolean var3 = true;
        for (int var4 = 0; var4 < this.field4684.field1739.length; var4++) {
            int var5 = this.field4684.field1739[var4];
            if (this.field4662[var5] == null) {
                this.method2031(125, var5);
                if (this.field4662[var5] == null) {
                    var3 = false;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(Z)I")
    public final int method2040(boolean arg0) {
        if (!arg0) {
            field4690 = 118;
        }
        field4691++;
        if (!this.method2032(29025)) {
            throw new IllegalStateException("");
        }
        return this.field4684.field1731;
    }

    @OriginalMember(owner = "client!fc", name = "e", descriptor = "(I)V")
    public final void method2041(int arg0) {
        if (this.field4664 != null) {
            for (int var2 = 0; var2 < this.field4664.length; var2++) {
                this.field4664[var2] = null;
            }
        }
        field4666++;
        if (arg0 != -3) {
            this.method2043(95, -32, (int[]) null, 104);
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(ILjava/lang/String;)I")
    public final int method2042(int arg0, String arg1) {
        field4694++;
        if (!this.method2032(29025)) {
            return -1;
        }
        String var3 = arg1.toLowerCase();
        if (arg0 != 100) {
            field4704 = true;
        }
        int var4 = this.field4684.field1723.method462(arg0 ^ 0x7F10, class168.method1041((byte) 86, var3));
        return this.method2037(-1, var4) ? var4 : -1;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(II[II)[B")
    public final byte[] method2043(int arg0, int arg1, int[] arg2, int arg3) {
        field4700++;
        if (!this.method2028(arg1, (byte) 57, arg0)) {
            return null;
        }
        if (this.field4664[arg0] == null || this.field4664[arg0][arg1] == null) {
            boolean var5 = this.method2050(arg0, arg2, arg1, true);
            if (!var5) {
                this.method2031(125, arg0);
                boolean var6 = this.method2050(arg0, arg2, arg1, true);
                if (!var6) {
                    return null;
                }
            }
        }
        byte[] var7 = class468.method2753((byte) 48, this.field4664[arg0][arg1], false);
        if (this.field4693 == 1) {
            this.field4664[arg0][arg1] = null;
            if (this.field4684.field1728[arg0] == 1) {
                this.field4664[arg0] = null;
            }
        } else if (this.field4693 == 2) {
            this.field4664[arg0] = null;
        }
        return arg3 < 17 ? null : var7;
    }

    @OriginalMember(owner = "client!fc", name = "e", descriptor = "(II)Z")
    public final boolean method2044(int arg0, int arg1) {
        field4673++;
        if (!this.method2037(-1, arg1)) {
            return false;
        } else if (this.field4662[arg1] == null) {
            this.method2031(127, arg1);
            if (this.field4662[arg1] == null) {
                int var3 = -80 % ((-arg0 - 11) / 55);
                return false;
            } else {
                return true;
            }
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!fc", name = "f", descriptor = "(I)I")
    public final int method2045(int arg0) {
        field4702++;
        if (!this.method2032(arg0 + 29025)) {
            return 0;
        }
        int var2 = 0;
        int var3 = 0;
        for (int var4 = arg0; var4 < this.field4662.length; var4++) {
            if (this.field4684.field1720[var4] > 0) {
                var3 += this.method2047(var4, (byte) 120);
                var2 += 100;
            }
        }
        if (var2 == 0) {
            return 100;
        } else {
            return var3 * 100 / var2;
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(ZI)V")
    public final void method2046(boolean arg0, int arg1) {
        field4672++;
        if (!this.method2037(-1, arg1)) {
            return;
        }
        if (!arg0) {
            field4704 = true;
        }
        if (this.field4664 != null) {
            this.field4664[arg1] = null;
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(IB)I")
    private final int method2047(int arg0, byte arg1) {
        field4689++;
        if (!this.method2037(-1, arg0)) {
            return 0;
        } else if (arg1 <= 119) {
            return -5;
        } else if (this.field4662[arg0] == null) {
            return this.field4680.method826(29373, arg0);
        } else {
            return 100;
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(Ljava/lang/String;I)V")
    public final void method2048(String arg0, int arg1) {
        field4663++;
        if (!this.method2032(29025)) {
            return;
        }
        if (arg1 != -1) {
            this.method2049((String) null, -28);
        }
        String var3 = arg0.toLowerCase();
        int var4 = this.field4684.field1723.method462(32628, class168.method1041((byte) 71, var3));
        this.method2053(var4, (byte) -20);
    }

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "(Ljava/lang/String;I)I")
    public final int method2049(String arg0, int arg1) {
        field4701++;
        if (!this.method2032(29025)) {
            return 0;
        }
        String var3 = arg0.toLowerCase();
        int var4 = this.field4684.field1723.method462(32628, class168.method1041((byte) 79, var3));
        if (arg1 != 0) {
            this.method2049((String) null, -42);
        }
        return this.method2047(var4, (byte) 125);
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(I[IIZ)Z")
    private final boolean method2050(int arg0, int[] arg1, int arg2, boolean arg3) {
        field4687++;
        if (!this.method2037(-1, arg0)) {
            return false;
        } else if (this.field4662[arg0] == null) {
            return false;
        } else {
            int var5 = this.field4684.field1720[arg0];
            int[] var6 = this.field4684.field1734[arg0];
            if (this.field4664[arg0] == null) {
                this.field4664[arg0] = new Object[this.field4684.field1728[arg0]];
            }
            Object[] var7 = this.field4664[arg0];
            boolean var8 = arg3;
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
            if (arg1 != null && (arg1[0] != 0 || arg1[1] != 0 || arg1[2] != 0 || arg1[3] != 0)) {
                var11 = class468.method2753((byte) -82, this.field4662[arg0], true);
                class425 var12 = new class425(var11);
                var12.method2467(var12.field5886.length, 5, -355395068, arg1);
            } else {
                var11 = class468.method2753((byte) -122, this.field4662[arg0], false);
            }
            byte[] var13;
            try {
                var13 = class198.method1259(var11, (byte) 119);
            } catch (RuntimeException var49) {
                throw class340.method2018(var49, "T3 - " + (arg1 != null) + "," + arg0 + "," + var11.length + "," + class464.method2740(false, var11, var11.length) + "," + class464.method2740(false, var11, var11.length - 2) + "," + this.field4684.field1738[arg0] + "," + this.field4684.field1731);
            }
            if (this.field4677) {
                this.field4662[arg0] = null;
            }
            if (var5 <= 1) {
                int var48;
                if (var6 == null) {
                    var48 = 0;
                } else {
                    var48 = var6[0];
                }
                if (this.field4693 == 0) {
                    var7[var48] = class467.method2748(false, var13, (byte) -100);
                } else {
                    var7[var48] = var13;
                }
            } else if (this.field4693 == 2) {
                int var15 = var13.length;
                int var50 = var15 - 1;
                int var16 = var13[var50] & 0xFF;
                int var17 = var50 - var5 * var16 * 4;
                class425 var18 = new class425(var13);
                int var19 = 0;
                var18.field5830 = var17;
                int var20 = 0;
                for (int var21 = 0; var21 < var16; var21++) {
                    int var22 = 0;
                    for (int var23 = 0; var23 < var5; var23++) {
                        var22 += var18.method2502((byte) -86);
                        int var24;
                        if (var6 == null) {
                            var24 = var23;
                        } else {
                            var24 = var6[var23];
                        }
                        if (arg2 == var24) {
                            var19 += var22;
                            var20 = var24;
                        }
                    }
                }
                if (var19 == 0) {
                    return true;
                }
                byte[] var25 = new byte[var19];
                var18.field5830 = var17;
                int var26 = 0;
                int var27 = 0;
                for (int var28 = 0; var28 < var16; var28++) {
                    int var29 = 0;
                    for (int var30 = 0; var30 < var5; var30++) {
                        var29 += var18.method2502((byte) -86);
                        int var31;
                        if (var6 == null) {
                            var31 = var30;
                        } else {
                            var31 = var6[var30];
                        }
                        if (arg2 == var31) {
                            class415.method2423(var13, var27, var25, var26, var29);
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
                int var34 = var51 - var5 * var33 * 4;
                class425 var35 = new class425(var13);
                int[] var36 = new int[var5];
                var35.field5830 = var34;
                for (int var37 = 0; var37 < var33; var37++) {
                    int var38 = 0;
                    for (int var39 = 0; var39 < var5; var39++) {
                        var38 += var35.method2502((byte) -86);
                        var36[var39] += var38;
                    }
                }
                byte[][] var40 = new byte[var5][];
                for (int var41 = 0; var41 < var5; var41++) {
                    var40[var41] = new byte[var36[var41]];
                    var36[var41] = 0;
                }
                var35.field5830 = var34;
                int var42 = 0;
                for (int var43 = 0; var43 < var33; var43++) {
                    int var44 = 0;
                    for (int var45 = 0; var45 < var5; var45++) {
                        var44 += var35.method2502((byte) -86);
                        class415.method2423(var13, var42, var40[var45], var36[var45], var44);
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
                    if (this.field4693 == 0) {
                        var7[var47] = class467.method2748(false, var40[var46], (byte) 78);
                    } else {
                        var7[var47] = var40[var46];
                    }
                }
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "(Ljava/lang/String;Ljava/lang/String;I)Z")
    public final boolean method2051(String arg0, String arg1, int arg2) {
        field4686++;
        if (!this.method2032(29025)) {
            return false;
        }
        String var4 = arg1.toLowerCase();
        String var5 = arg0.toLowerCase();
        int var6 = this.field4684.field1723.method462(32628, class168.method1041((byte) 72, var4));
        if (this.method2037(arg2, var6)) {
            int var7 = this.field4684.field1730[var6].method462(arg2 ^ 0xFFFF808B, class168.method1041((byte) 100, var5));
            return this.method2035(var6, var7, -5657);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!fc", name = "c", descriptor = "(Ljava/lang/String;I)Z")
    public final boolean method2052(String arg0, int arg1) {
        if (arg1 >= -105) {
            return true;
        }
        field4674++;
        if (this.method2032(29025)) {
            String var3 = arg0.toLowerCase();
            int var4 = this.field4684.field1723.method462(32628, class168.method1041((byte) 74, var3));
            return this.method2044(-88, var4);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "(IB)V")
    private final void method2053(int arg0, byte arg1) {
        field4681++;
        int var3 = -52 % ((arg1 - 90) / 36);
        this.field4680.method836(arg0, 255);
    }

    @OriginalMember(owner = "client!fc", name = "<init>", descriptor = "(Lht;ZI)V")
    public class343(class344 arg0, boolean arg1, int arg2) {
        if (arg2 < 0 || arg2 > 2) {
            throw new IllegalArgumentException("js5: Invalid value " + arg2 + " supplied for discardunpacked");
        }
        this.field4680 = arg0;
        this.field4693 = arg2;
        this.field4677 = arg1;
    }

    @OriginalMember(owner = "client!fc", name = "f", descriptor = "(II)I")
    public final int method2054(int arg0, int arg1) {
        field4683++;
        if (arg0 != 0) {
            this.method2034(-52, 100);
        }
        return this.method2037(-1, arg1) ? this.field4684.field1728[arg1] : 0;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "([Ljava/lang/Object;IBI[J)V")
    public static final void method2055(Object[] arg0, int arg1, byte arg2, int arg3, long[] arg4) {
        if (arg2 != 108) {
            return;
        }
        if (arg1 > arg3) {
            int var5 = (arg1 + arg3) / 2;
            int var6 = arg3;
            long var7 = arg4[var5];
            arg4[var5] = arg4[arg1];
            arg4[arg1] = var7;
            Object var9 = arg0[var5];
            arg0[var5] = arg0[arg1];
            arg0[arg1] = var9;
            for (int var10 = arg3; var10 < arg1; var10++) {
                if (arg4[var10] < ((long) (var10 & 0x1) + var7)) {
                    long var11 = arg4[var10];
                    arg4[var10] = arg4[var6];
                    arg4[var6] = var11;
                    Object var13 = arg0[var10];
                    arg0[var10] = arg0[var6];
                    arg0[var6++] = var13;
                }
            }
            arg4[arg1] = arg4[var6];
            arg4[var6] = var7;
            arg0[arg1] = arg0[var6];
            arg0[var6] = var9;
            method2055(arg0, var6 - 1, (byte) 108, arg3, arg4);
            method2055(arg0, arg1, (byte) 108, var6 + 1, arg4);
        }
        field4667++;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(Ljava/lang/String;Z)Z")
    public final boolean method2056(String arg0, boolean arg1) {
        field4675++;
        if (!arg1) {
            return false;
        } else if (this.method2032(29025)) {
            String var3 = arg0.toLowerCase();
            int var4 = this.field4684.field1723.method462(32628, class168.method1041((byte) 84, var3));
            return var4 >= 0;
        } else {
            return false;
        }
    }
}
