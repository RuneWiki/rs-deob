import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nl")
public class class435 {

    @OriginalMember(owner = "client!nl", name = "y", descriptor = "Lba;")
    private class71 field6165 = null;

    @OriginalMember(owner = "client!nl", name = "N", descriptor = "Lbb;")
    private class134 field6180;

    @OriginalMember(owner = "client!nl", name = "p", descriptor = "Z")
    private boolean field6156;

    @OriginalMember(owner = "client!nl", name = "k", descriptor = "I")
    public int field6151;

    @OriginalMember(owner = "client!nl", name = "w", descriptor = "Lch;")
    public static class151 field6163 = new class151("You can't add yourself to your own friend list.", "Du kannst dich nicht auf deine eigene Freunde-Liste setzen!", "Vous ne pouvez pas ajouter votre nom à votre liste d'amis.", "Você não pode adicionar a si próprio à sua lista de amigos.");

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "I")
    public static int field6141;

    @OriginalMember(owner = "client!nl", name = "b", descriptor = "I")
    public static int field6142;

    @OriginalMember(owner = "client!nl", name = "c", descriptor = "I")
    public static int field6143;

    @OriginalMember(owner = "client!nl", name = "d", descriptor = "I")
    public static int field6144;

    @OriginalMember(owner = "client!nl", name = "e", descriptor = "I")
    public static int field6145;

    @OriginalMember(owner = "client!nl", name = "f", descriptor = "I")
    public static int field6146;

    @OriginalMember(owner = "client!nl", name = "g", descriptor = "I")
    public static int field6147;

    @OriginalMember(owner = "client!nl", name = "h", descriptor = "I")
    public static int field6148;

    @OriginalMember(owner = "client!nl", name = "i", descriptor = "I")
    public static int field6149;

    @OriginalMember(owner = "client!nl", name = "j", descriptor = "I")
    public static int field6150;

    @OriginalMember(owner = "client!nl", name = "m", descriptor = "I")
    public static int field6153;

    @OriginalMember(owner = "client!nl", name = "n", descriptor = "I")
    public static int field6154;

    @OriginalMember(owner = "client!nl", name = "o", descriptor = "I")
    public static int field6155;

    @OriginalMember(owner = "client!nl", name = "q", descriptor = "I")
    public static int field6157;

    @OriginalMember(owner = "client!nl", name = "r", descriptor = "I")
    public static int field6158;

    @OriginalMember(owner = "client!nl", name = "s", descriptor = "I")
    public static int field6159;

    @OriginalMember(owner = "client!nl", name = "t", descriptor = "I")
    public static int field6160;

    @OriginalMember(owner = "client!nl", name = "u", descriptor = "I")
    public static int field6161;

    @OriginalMember(owner = "client!nl", name = "v", descriptor = "I")
    public static int field6162;

    @OriginalMember(owner = "client!nl", name = "x", descriptor = "I")
    public static int field6164;

    @OriginalMember(owner = "client!nl", name = "z", descriptor = "I")
    public static int field6166;

    @OriginalMember(owner = "client!nl", name = "A", descriptor = "I")
    public static int field6167;

    @OriginalMember(owner = "client!nl", name = "B", descriptor = "I")
    public static int field6168;

    @OriginalMember(owner = "client!nl", name = "C", descriptor = "I")
    public static int field6169;

    @OriginalMember(owner = "client!nl", name = "D", descriptor = "I")
    public static int field6170;

    @OriginalMember(owner = "client!nl", name = "E", descriptor = "I")
    public static int field6171;

    @OriginalMember(owner = "client!nl", name = "F", descriptor = "I")
    public static int field6172;

    @OriginalMember(owner = "client!nl", name = "G", descriptor = "I")
    public static int field6173;

    @OriginalMember(owner = "client!nl", name = "H", descriptor = "I")
    public static int field6174;

    @OriginalMember(owner = "client!nl", name = "J", descriptor = "I")
    public static int field6176;

    @OriginalMember(owner = "client!nl", name = "K", descriptor = "I")
    public static int field6177;

    @OriginalMember(owner = "client!nl", name = "L", descriptor = "I")
    public static int field6178;

    @OriginalMember(owner = "client!nl", name = "M", descriptor = "I")
    public static int field6179;

    @OriginalMember(owner = "client!nl", name = "O", descriptor = "I")
    public static int field6181;

    @OriginalMember(owner = "client!nl", name = "P", descriptor = "I")
    public static int field6182;

    @OriginalMember(owner = "client!nl", name = "R", descriptor = "I")
    public static int field6183;

    @OriginalMember(owner = "client!nl", name = "I", descriptor = "[Ljava/lang/Object;")
    private Object[] field6175;

    @OriginalMember(owner = "client!nl", name = "l", descriptor = "[[Ljava/lang/Object;")
    private Object[][] field6152;

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(Ljava/lang/String;Z)I", line = 8)
    public final int method2625(String arg0, boolean arg1) {
        field6164++;
        if (!this.method2642(858993459)) {
            return 0;
        }
        String var3 = arg0.toLowerCase();
        if (arg1) {
            this.field6156 = true;
        }
        int var4 = this.field6165.field1016.method758(-115, class117.method914(var3, 0));
        return this.method2653(-122, var4);
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(Ljava/lang/String;BLjava/lang/String;)[B", line = 28)
    public final byte[] method2626(String arg0, byte arg1, String arg2) {
        field6158++;
        if (!this.method2642(858993459)) {
            return null;
        }
        String var4 = arg2.toLowerCase();
        String var5 = arg0.toLowerCase();
        int var6 = this.field6165.field1016.method758(-128, class117.method914(var4, 0));
        if (!this.method2634(119, var6)) {
            return null;
        }
        int var7 = this.field6165.field1030[var6].method758(-115, class117.method914(var5, 0));
        if (arg1 < 107) {
            this.field6165 = null;
        }
        return this.method2633(var6, var7, -48);
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(BI)Z", line = 52)
    public final boolean method2627(byte arg0, int arg1) {
        field6179++;
        if (arg0 <= 25) {
            this.method2626((String) null, (byte) -84, (String) null);
        }
        if (!this.method2642(858993459)) {
            return false;
        } else if (this.field6165.field1017.length == 1) {
            return this.method2649(1, arg1, 0);
        } else if (!this.method2634(96, arg1)) {
            return false;
        } else if (this.field6165.field1017[arg1] == 1) {
            return this.method2649(1, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(I)Z", line = 81)
    public static final boolean method2628(int arg0) {
        field6171++;
        if (arg0 == 2) {
            return class377.field5192 == 0 ? class102.field1431 : true;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(Z)I", line = 97)
    public final int method2629(boolean arg0) {
        field6170++;
        if (!this.method2642(858993459)) {
            return 0;
        }
        int var2 = 0;
        int var3 = 0;
        for (int var4 = 0; var4 < this.field6175.length; var4++) {
            if (this.field6165.field1027[var4] > 0) {
                var2 += 100;
                var3 += this.method2653(-103, var4);
            }
        }
        if (arg0) {
            this.field6156 = false;
        }
        if (var2 == 0) {
            return 100;
        } else {
            return var3 * 100 / var2;
        }
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(II)Z", line = 136)
    public final boolean method2630(int arg0, int arg1) {
        field6146++;
        if (!this.method2634(116, arg1)) {
            return false;
        } else if (arg0 != -1) {
            return false;
        } else if (this.field6175[arg1] == null) {
            this.method2644(11342, arg1);
            return this.field6175[arg1] != null;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(B)V", line = 161)
    public final void method2631(byte arg0) {
        field6183++;
        if (arg0 != -128) {
            this.field6156 = false;
        }
        if (this.field6175 != null) {
            for (int var2 = 0; var2 < this.field6175.length; var2++) {
                this.field6175[var2] = null;
            }
        }
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(IZZ)V", line = 182)
    public final void method2632(int arg0, boolean arg1, boolean arg2) {
        field6182++;
        if (!this.method2642(858993459)) {
            return;
        }
        int var4 = 3 / ((-arg0 - 48) / 52);
        if (arg2) {
            this.field6165.field1030 = null;
            this.field6165.field1025 = null;
        }
        if (arg1) {
            this.field6165.field1016 = null;
            this.field6165.field1024 = null;
        }
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(III)[B", line = 208)
    public final byte[] method2633(int arg0, int arg1, int arg2) {
        field6178++;
        int var4 = 98 % ((28 - arg2) / 49);
        return this.method2652((int[]) null, (byte) -8, arg1, arg0);
    }

    @OriginalMember(owner = "client!nl", name = "b", descriptor = "(II)Z", line = 218)
    private final boolean method2634(int arg0, int arg1) {
        field6173++;
        if (!this.method2642(858993459)) {
            return false;
        } else if (arg1 >= 0 && this.field6165.field1017.length > arg1 && this.field6165.field1017[arg1] != 0) {
            if (arg0 < 33) {
                this.method2633(-94, 77, -3);
            }
            return true;
        } else if (class365.field5013) {
            throw new IllegalArgumentException(Integer.toString(arg1));
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(BII[I)Z", line = 242)
    private final boolean method2635(byte arg0, int arg1, int arg2, int[] arg3) {
        field6148++;
        if (!this.method2634(88, arg1)) {
            return false;
        } else if (this.field6175[arg1] == null) {
            return false;
        } else {
            int var5 = this.field6165.field1027[arg1];
            int[] var6 = this.field6165.field1018[arg1];
            if (this.field6152[arg1] == null) {
                this.field6152[arg1] = new Object[this.field6165.field1017[arg1]];
            }
            Object[] var7 = this.field6152[arg1];
            boolean var8 = true;
            if (arg0 > -24) {
                this.field6152 = null;
            }
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
            if (arg3 == null || arg3[0] == 0 && arg3[1] == 0 && arg3[2] == 0 && arg3[3] == 0) {
                var11 = class79.method692(this.field6175[arg1], false, 30743);
            } else {
                var11 = class79.method692(this.field6175[arg1], true, 30743);
                class161 var12 = new class161(var11);
                var12.method1197(5, arg3, true, var12.field2262.length);
            }
            byte[] var13;
            try {
                var13 = class118.method921(var11, true);
            } catch (RuntimeException var49) {
                throw class353.method2178(var49, "T3 - " + (arg3 != null) + "," + arg1 + "," + var11.length + "," + class349.method2163(var11, var11.length, false) + "," + class349.method2163(var11, var11.length - 2, false) + "," + this.field6165.field1029[arg1] + "," + this.field6165.field1020);
            }
            if (this.field6156) {
                this.field6175[arg1] = null;
            }
            if (var5 <= 1) {
                int var48;
                if (var6 == null) {
                    var48 = 0;
                } else {
                    var48 = var6[0];
                }
                if (this.field6151 == 0) {
                    var7[var48] = class131.method983(false, var13, 23543);
                } else {
                    var7[var48] = var13;
                }
            } else if (this.field6151 == 2) {
                int var15 = var13.length;
                int var50 = var15 - 1;
                int var16 = var13[var50] & 0xFF;
                int var17 = var50 - var5 * 4 * var16;
                class161 var18 = new class161(var13);
                int var19 = 0;
                int var20 = 0;
                var18.field2298 = var17;
                for (int var21 = 0; var21 < var16; var21++) {
                    int var22 = 0;
                    for (int var23 = 0; var23 < var5; var23++) {
                        var22 += var18.method1168(255);
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
                int var26 = 0;
                var18.field2298 = var17;
                int var27 = 0;
                for (int var28 = 0; var28 < var16; var28++) {
                    int var29 = 0;
                    for (int var30 = 0; var30 < var5; var30++) {
                        var29 += var18.method1168(255);
                        int var31;
                        if (var6 == null) {
                            var31 = var30;
                        } else {
                            var31 = var6[var30];
                        }
                        if (arg2 == var31) {
                            class214.method1449(var13, var27, var25, var26, var29);
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
                class161 var35 = new class161(var13);
                var35.field2298 = var34;
                int[] var36 = new int[var5];
                for (int var37 = 0; var37 < var33; var37++) {
                    int var38 = 0;
                    for (int var39 = 0; var39 < var5; var39++) {
                        var38 += var35.method1168(255);
                        var36[var39] += var38;
                    }
                }
                byte[][] var40 = new byte[var5][];
                for (int var41 = 0; var41 < var5; var41++) {
                    var40[var41] = new byte[var36[var41]];
                    var36[var41] = 0;
                }
                var35.field2298 = var34;
                int var42 = 0;
                for (int var43 = 0; var43 < var33; var43++) {
                    int var44 = 0;
                    for (int var45 = 0; var45 < var5; var45++) {
                        var44 += var35.method1168(255);
                        class214.method1449(var13, var42, var40[var45], var36[var45], var44);
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
                    if (this.field6151 == 0) {
                        var7[var47] = class131.method983(false, var40[var46], 23543);
                    } else {
                        var7[var47] = var40[var46];
                    }
                }
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!nl", name = "c", descriptor = "(II)V", line = 527)
    private final void method2636(int arg0, int arg1) {
        field6145++;
        if (arg1 != -1153202558) {
            this.method2631((byte) -40);
        }
        this.field6180.method992(arg1 + 1153202434, arg0);
    }

    @OriginalMember(owner = "client!nl", name = "b", descriptor = "(I)Z", line = 542)
    public final boolean method2637(int arg0) {
        field6141++;
        if (!this.method2642(arg0 + 858975278)) {
            return false;
        } else if (arg0 == 18181) {
            boolean var2 = true;
            for (int var3 = 0; var3 < this.field6165.field1028.length; var3++) {
                int var4 = this.field6165.field1028[var3];
                if (this.field6175[var4] == null) {
                    this.method2644(11342, var4);
                    if (this.field6175[var4] == null) {
                        var2 = false;
                    }
                }
            }
            return var2;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!nl", name = "d", descriptor = "(II)I", line = 579)
    public final int method2638(int arg0, int arg1) {
        field6176++;
        if (arg0 != 1) {
            this.field6175 = null;
        }
        return this.method2634(49, arg1) ? this.field6165.field1017[arg1] : 0;
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(Ljava/lang/String;I)Z", line = 599)
    public final boolean method2639(String arg0, int arg1) {
        field6150++;
        if (!this.method2642(858993459)) {
            return false;
        } else if (arg1 > -17) {
            return false;
        } else {
            String var3 = arg0.toLowerCase();
            int var4 = this.field6165.field1016.method758(-123, class117.method914(var3, 0));
            return var4 >= 0;
        }
    }

    @OriginalMember(owner = "client!nl", name = "b", descriptor = "(Ljava/lang/String;I)Z", line = 621)
    public final boolean method2640(String arg0, int arg1) {
        field6172++;
        if (this.method2642(858993459)) {
            String var3 = arg0.toLowerCase();
            int var4 = this.field6165.field1016.method758(arg1 ^ 0xFFFFFF8E, class117.method914(var3, arg1 + arg1));
            return this.method2630(~arg1, var4);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!nl", name = "e", descriptor = "(II)V", line = 645)
    public final void method2641(int arg0, int arg1) {
        if (arg0 != 0) {
            this.method2651(4);
        }
        field6162++;
        if (this.method2634(104, arg1) && this.field6152 != null) {
            this.field6152[arg1] = null;
        }
    }

    @OriginalMember(owner = "client!nl", name = "c", descriptor = "(I)Z", line = 665)
    private final boolean method2642(int arg0) {
        field6161++;
        if (this.field6165 == null) {
            this.field6165 = this.field6180.method995(255);
            if (this.field6165 == null) {
                return false;
            }
            this.field6152 = new Object[this.field6165.field1015][];
            this.field6175 = new Object[this.field6165.field1015];
        }
        if (arg0 != 858993459) {
            this.method2630(-88, -27);
        }
        return true;
    }

    @OriginalMember(owner = "client!nl", name = "f", descriptor = "(II)I", line = 689)
    public static final int method2643(int arg0, int arg1) {
        int var2 = ((arg1 & 0xAAAAAAAA) >>> 1) + (arg1 & 0x55555555);
        field6166++;
        int var3 = ((var2 & 0xCCCCCCCF) >>> 2) + (var2 & 0x33333333);
        if (arg0 != 0) {
            field6163 = null;
        }
        int var4 = (var3 >>> 4) + var3 & 0xF0F0F0F;
        int var5 = (var4 >>> 8) + var4;
        int var6 = (var5 >>> 16) + var5;
        return var6 & 0xFF;
    }

    @OriginalMember(owner = "client!nl", name = "g", descriptor = "(II)V", line = 710)
    private final void method2644(int arg0, int arg1) {
        if (arg0 != 11342) {
            return;
        }
        field6174++;
        if (this.field6156) {
            this.field6175[arg1] = this.field6180.method994((byte) 105, arg1);
        } else {
            this.field6175[arg1] = class131.method983(false, this.field6180.method994((byte) 105, arg1), 23543);
        }
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(Lup;IIIII)V", line = 725)
    public static final void method2645(class340 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        arg0.field4700 = 0;
        for (int var6 = 0; var6 < 4; var6++) {
            if (arg0.field4699[var6] != null) {
                arg0.field4700++;
            }
        }
        label50: for (int var7 = 0; var7 < arg0.field4700; var7++) {
            long var8 = class221.field3191[arg1][arg2][arg3];
            while (var8 != 0L) {
                class87 var14 = class357.field4906[(int) ((var8 & 0xFFFFL) - 1L)];
                var8 >>>= 0x10;
                if (arg0.field4699[var7] == var14) {
                    continue label50;
                }
            }
            long var10 = class221.field3191[arg1][arg4][arg5];
            while (var10 != 0L) {
                class87 var13 = class357.field4906[(int) ((var10 & 0xFFFFL) - 1L)];
                var10 >>>= 0x10;
                if (arg0.field4699[var7] == var13) {
                    continue label50;
                }
            }
            for (int var12 = var7; var12 < arg0.field4700 - 1; var12++) {
                arg0.field4699[var12] = arg0.field4699[var12 + 1];
            }
            arg0.field4700--;
        }
    }

    @OriginalMember(owner = "client!nl", name = "c", descriptor = "(Ljava/lang/String;I)V", line = 784)
    public final void method2646(String arg0, int arg1) {
        field6160++;
        if (this.method2642(858993459) && arg1 == -7426) {
            String var3 = arg0.toLowerCase();
            int var4 = this.field6165.field1016.method758(-120, class117.method914(var3, 0));
            this.method2636(var4, arg1 - 1153195132);
        }
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;)Z", line = 803)
    public final boolean method2647(String arg0, int arg1, String arg2) {
        field6147++;
        if (!this.method2642(858993459)) {
            return false;
        }
        String var4 = arg0.toLowerCase();
        String var5 = arg2.toLowerCase();
        if (arg1 < 61) {
            this.method2658(-128);
        }
        int var6 = this.field6165.field1016.method758(-103, class117.method914(var4, 0));
        if (this.method2634(42, var6)) {
            int var7 = this.field6165.field1030[var6].method758(-86, class117.method914(var5, 0));
            return this.method2649(1, var7, var6);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(IZ)I", line = 830)
    public final int method2648(int arg0, boolean arg1) {
        field6168++;
        if (!this.method2642(858993459)) {
            return -1;
        }
        int var3 = this.field6165.field1016.method758(-109, arg0);
        if (this.method2634(106, var3)) {
            if (!arg1) {
                field6163 = null;
            }
            return var3;
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!nl", name = "b", descriptor = "(III)Z", line = 853)
    public final boolean method2649(int arg0, int arg1, int arg2) {
        field6142++;
        if (arg0 != 1) {
            this.method2641(65, -87);
        }
        if (!this.method2661(arg2, arg1, (byte) 94)) {
            return false;
        } else if (this.field6152[arg2] != null && this.field6152[arg2][arg1] != null) {
            return true;
        } else if (this.field6175[arg2] == null) {
            this.method2644(11342, arg2);
            return this.field6175[arg2] != null;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!nl", name = "b", descriptor = "(BI)[B", line = 882)
    public final byte[] method2650(byte arg0, int arg1) {
        field6144++;
        if (arg0 != -72) {
            this.field6151 = 94;
        }
        if (!this.method2642(arg0 ^ 0xCCCCCC8B)) {
            return null;
        } else if (this.field6165.field1017.length == 1) {
            return this.method2633(0, arg1, -94);
        } else if (!this.method2634(122, arg1)) {
            return null;
        } else if (this.field6165.field1017[arg1] == 1) {
            return this.method2633(arg1, 0, 98);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!nl", name = "d", descriptor = "(I)V", line = 910)
    public final void method2651(int arg0) {
        if (this.field6152 != null) {
            for (int var2 = 0; var2 < this.field6152.length; var2++) {
                this.field6152[var2] = null;
            }
        }
        if (arg0 == 1) {
            field6153++;
        }
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "([IBII)[B", line = 938)
    public final byte[] method2652(int[] arg0, byte arg1, int arg2, int arg3) {
        field6155++;
        if (!this.method2661(arg3, arg2, (byte) -49)) {
            return null;
        }
        if (this.field6152[arg3] == null || this.field6152[arg3][arg2] == null) {
            boolean var5 = this.method2635((byte) -44, arg3, arg2, arg0);
            if (!var5) {
                this.method2644(11342, arg3);
                boolean var6 = this.method2635((byte) -113, arg3, arg2, arg0);
                if (!var6) {
                    return null;
                }
            }
        }
        byte[] var7 = class79.method692(this.field6152[arg3][arg2], false, 30743);
        if (this.field6151 == 1) {
            this.field6152[arg3][arg2] = null;
            if (this.field6165.field1017[arg3] == 1) {
                this.field6152[arg3] = null;
            }
        } else if (this.field6151 == 2) {
            this.field6152[arg3] = null;
        }
        int var8 = 26 % ((arg1 - 41) / 48);
        return var7;
    }

    @OriginalMember(owner = "client!nl", name = "h", descriptor = "(II)I", line = 988)
    private final int method2653(int arg0, int arg1) {
        field6154++;
        if (arg0 > -100) {
            this.field6151 = -105;
        }
        if (this.method2634(44, arg1)) {
            return this.field6175[arg1] == null ? this.field6180.method996(0, arg1) : 100;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!nl", name = "e", descriptor = "(I)V", line = 1006)
    public static void method2654(int arg0) {
        int var1 = 57 % ((arg0 + 3) / 42);
        field6163 = null;
    }

    @OriginalMember(owner = "client!nl", name = "i", descriptor = "(II)[I", line = 1015)
    public final int[] method2655(int arg0, int arg1) {
        field6159++;
        if (arg0 != 0) {
            return null;
        } else if (this.method2634(127, arg1)) {
            int[] var3 = this.field6165.field1018[arg1];
            if (var3 == null) {
                var3 = new int[this.field6165.field1027[arg1]];
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

    @OriginalMember(owner = "client!nl", name = "f", descriptor = "(I)V", line = 1045)
    public static final void method2656(int arg0) {
        field6167++;
        class305.field4337.method159(27099);
        class110.field1541.method1931((byte) 43);
        class353.field4854.method2225(15691);
        class468.field6599.method499(false);
        class363.field5001.method1998((byte) 19);
        class373.field5128.method1658(25);
        class386.field5289.method1859(false);
        class371.field5108.method1663(192);
        class97.field1365.method2327((byte) -105);
        class31.field332.method2456(arg0 - 1855727496);
        class382.field5247.method1776(arg0 + 99);
        class449.field6390.method850(true);
        class53.field788.method2314((byte) 126);
        class93.field1312.method1970(true);
        class422.field5847.method1637((byte) -9);
        class97.field1377.method699(-20452);
        class39.field534.method1510((byte) -127);
        class84.field1213.method2442((byte) 32);
        class82.field1180.method2675(127);
        class407.field5577.method180(-105);
        class37.method225(arg0 + 102);
        class289.method1898(-29940);
        class402.method2420((byte) -125);
        class432.method2619(true);
        class365.field5015.method2119(arg0);
        class285.field4079.method2119(arg0);
        class239.field3506.method2119(0);
        class424.field5869.method2119(0);
        class457.field6467.method2119(0);
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(Ljava/lang/String;B)I", line = 1082)
    public final int method2657(String arg0, byte arg1) {
        if (arg1 != 15) {
            this.method2625((String) null, true);
        }
        field6143++;
        if (this.method2642(858993459)) {
            String var3 = arg0.toLowerCase();
            int var4 = this.field6165.field1016.method758(arg1 ^ 0xFFFFFFAD, class117.method914(var3, 0));
            return this.method2634(41, var4) ? var4 : -1;
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!nl", name = "<init>", descriptor = "(Lbb;ZI)V", line = 1169)
    public class435(class134 arg0, boolean arg1, int arg2) {
        if (arg2 < 0 || arg2 > 2) {
            throw new IllegalArgumentException("js5: Invalid value " + arg2 + " supplied for discardunpacked");
        }
        this.field6180 = arg0;
        this.field6156 = arg1;
        this.field6151 = arg2;
    }

    @OriginalMember(owner = "client!nl", name = "g", descriptor = "(I)I", line = 1106)
    public final int method2658(int arg0) {
        field6169++;
        if (this.method2642(arg0 + 858993460)) {
            if (arg0 != -1) {
                method2628(16);
            }
            return this.field6165.field1017.length;
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!nl", name = "h", descriptor = "(I)I", line = 1121)
    public final int method2659(int arg0) {
        field6149++;
        if (arg0 != 21944) {
            this.field6165 = null;
        }
        if (!this.method2642(858993459)) {
            throw new IllegalStateException("");
        }
        return this.field6165.field1020;
    }

    @OriginalMember(owner = "client!nl", name = "i", descriptor = "(I)[Ljd;", line = 1136)
    public static final class383[] method2660(int arg0) {
        if (arg0 != 0) {
            method2654(-28);
        }
        field6177++;
        return new class383[] { class480.field6799, class404.field5527, class406.field5544, class325.field4529, class340.field4704 };
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(IIB)Z", line = 1147)
    private final boolean method2661(int arg0, int arg1, byte arg2) {
        field6181++;
        if (!this.method2642(858993459)) {
            return false;
        } else if (arg0 >= 0 && arg1 >= 0 && this.field6165.field1017.length > arg0 && this.field6165.field1017[arg0] > arg1) {
            int var4 = 120 % ((arg2 - 14) / 57);
            return true;
        } else if (class365.field5013) {
            throw new IllegalArgumentException(arg0 + "," + arg1);
        } else {
            return false;
        }
    }
}
