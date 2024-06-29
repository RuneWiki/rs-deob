import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eg")
public class class18 extends class112 {

    @OriginalMember(owner = "client!eg", name = "S", descriptor = "Z")
    public boolean field264 = true;

    @OriginalMember(owner = "client!eg", name = "M", descriptor = "[Lw;")
    public static class37[] field258 = new class37[50];

    @OriginalMember(owner = "client!eg", name = "R", descriptor = "I")
    public static int field263 = 0;

    @OriginalMember(owner = "client!eg", name = "Q", descriptor = "I")
    public static int field262 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "client!eg", name = "B", descriptor = "Ljava/lang/String;")
    public static String field247 = "Your friend list is full. Max of 100 for free users, and 200 for members.";

    @OriginalMember(owner = "client!eg", name = "O", descriptor = "Ljava/lang/String;")
    public static String field260 = "shake:";

    @OriginalMember(owner = "client!eg", name = "A", descriptor = "I")
    public static int field246;

    @OriginalMember(owner = "client!eg", name = "C", descriptor = "I")
    public static int field248;

    @OriginalMember(owner = "client!eg", name = "D", descriptor = "I")
    public static int field249;

    @OriginalMember(owner = "client!eg", name = "E", descriptor = "I")
    public static int field250;

    @OriginalMember(owner = "client!eg", name = "F", descriptor = "I")
    public static int field251;

    @OriginalMember(owner = "client!eg", name = "G", descriptor = "I")
    public static int field252;

    @OriginalMember(owner = "client!eg", name = "H", descriptor = "I")
    public static int field253;

    @OriginalMember(owner = "client!eg", name = "I", descriptor = "I")
    public static int field254;

    @OriginalMember(owner = "client!eg", name = "N", descriptor = "I")
    public static int field259;

    @OriginalMember(owner = "client!eg", name = "P", descriptor = "I")
    public static int field261;

    @OriginalMember(owner = "client!eg", name = "T", descriptor = "I")
    public static int field265;

    @OriginalMember(owner = "client!eg", name = "U", descriptor = "I")
    public static int field266;

    @OriginalMember(owner = "client!eg", name = "V", descriptor = "I")
    public static int field267;

    @OriginalMember(owner = "client!eg", name = "z", descriptor = "[I")
    private int[] field245;

    @OriginalMember(owner = "client!eg", name = "K", descriptor = "[I")
    public int[] field256;

    @OriginalMember(owner = "client!eg", name = "J", descriptor = "[Ljava/lang/String;")
    private String[] field255;

    @OriginalMember(owner = "client!eg", name = "L", descriptor = "[[I")
    private int[][] field257;

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(I)V")
    public static final void method135(int arg0) {
        int var1 = -35 / ((arg0 + 33) / 45);
        class250.field3987.method1157(760);
        field267++;
    }

    @OriginalMember(owner = "client!eg", name = "b", descriptor = "(I)I")
    public final int method136(int arg0) {
        field250++;
        if (this.field245 == null) {
            return 0;
        } else if (arg0 < 69) {
            return -30;
        } else {
            return this.field245.length;
        }
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(III)I")
    public final int method137(int arg0, int arg1, int arg2) {
        if (arg1 != -1) {
            return 109;
        }
        field249++;
        if (this.field245 == null || arg2 < 0 || this.field245.length < arg2) {
            return -1;
        } else if (this.field257[arg2] == null || arg0 < 0 || arg0 > this.field257[arg2].length) {
            return -1;
        } else {
            return this.field257[arg2][arg0];
        }
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(II)I")
    public final int method138(int arg0, int arg1) {
        field259++;
        if (arg1 != -1) {
            this.method139((class136) null, 4);
        }
        return this.field245 == null || arg0 < 0 || arg0 > this.field245.length ? -1 : this.field245[arg0];
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(Lig;I)V")
    public final void method139(class136 arg0, int arg1) {
        field261++;
        while (true) {
            int var3 = arg0.method1012(4);
            if (var3 == 0) {
                int var4 = -12 % ((arg1 - 21) / 56);
                return;
            }
            this.method143(var3, arg0, 0);
        }
    }

    @OriginalMember(owner = "client!eg", name = "c", descriptor = "(I)Ljava/lang/String;")
    public final String method140(int arg0) {
        field253++;
        StringBuffer var2 = new StringBuffer(80);
        if (this.field255 == null) {
            return "";
        }
        var2.append(this.field255[0]);
        for (int var3 = 1; var3 < this.field255.length; var3++) {
            var2.append("...");
            var2.append(this.field255[var3]);
        }
        if (arg0 != -1) {
            this.field256 = null;
        }
        return var2.toString();
    }

    @OriginalMember(owner = "client!eg", name = "d", descriptor = "(I)V")
    public static final void method141(int arg0) {
        class244.field3854.method1156(-125);
        field251++;
        if (arg0 >= -52) {
            method141(37);
        }
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(IIIII[Lml;[BIZII)V")
    public static final void method142(int arg0, int arg1, int arg2, int arg3, int arg4, class13[] arg5, byte[] arg6, int arg7, boolean arg8, int arg9, int arg10) {
        field265++;
        class136 var11 = new class136(arg6);
        int var12 = -1;
        while (true) {
            int var13 = var11.method1020(true);
            if (var13 == 0) {
                if (arg0 != 20759) {
                    method135(-77);
                    return;
                }
                return;
            }
            var12 += var13;
            int var14 = 0;
            while (true) {
                int var15 = var11.method1004(122);
                if (var15 == 0) {
                    break;
                }
                var14 += var15 - 1;
                int var16 = var14 & 0x3F;
                int var17 = (var14 & 0xFE5) >> 6;
                int var18 = var11.method1012(4);
                int var19 = var14 >> 12;
                int var20 = var18 >> 2;
                int var21 = var18 & 0x3;
                if (arg1 == var19 && var17 >= arg10 && var17 < arg10 + 8 && var16 >= arg2 && (arg2 + 8) > var16) {
                    class248 var22 = class46.method396(var12, (byte) 63);
                    int var23 = arg9 + class250.method1665(var22.field3947, var22.field3960, var21, 0, var16 & 0x7, arg3, var17 & 0x7);
                    int var24 = arg4 + class251.method1670(var16 & 0x7, arg3, var22.field3960, var22.field3947, var21, var17 & 0x7, (byte) -121);
                    if (var23 > 0 && var24 > 0 && var23 < 103 && var24 < 103) {
                        class13 var25 = null;
                        if (!arg8) {
                            int var26 = arg7;
                            if ((class43.field790[1][var23][var24] & 0x2) == 2) {
                                var26 = arg7 - 1;
                            }
                            if (var26 >= 0) {
                                var25 = arg5[var26];
                            }
                        }
                        class290.method1950(!arg8, arg8, var23, arg3 + var21 & 0x3, arg7, var12, var24, 1, var25, arg7, var20);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(ILig;I)V")
    private final void method143(int arg0, class136 arg1, int arg2) {
        if (arg2 != 0) {
            this.method136(5);
        }
        field252++;
        if (arg0 == 1) {
            this.field255 = class183.method1282('<', arg2, arg1.method1010(arg2 - 108));
        } else if (arg0 == 2) {
            int var4 = arg1.method1012(arg2 ^ 0x4);
            this.field256 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field256[var5] = arg1.method996(class172.method1232(arg2, 65280));
            }
        } else if (arg0 == 3) {
            int var6 = arg1.method1012(4);
            this.field245 = new int[var6];
            this.field257 = new int[var6][];
            for (int var7 = 0; var7 < var6; var7++) {
                int var8 = arg1.method996(arg2 ^ 0xFF00);
                this.field245[var7] = var8;
                this.field257[var7] = new int[class29.field509[var8]];
                for (int var9 = 0; var9 < class29.field509[var8]; var9++) {
                    this.field257[var7][var9] = arg1.method996(arg2 + 65280);
                }
            }
        } else if (arg0 == 4) {
            this.field264 = false;
        }
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(ILig;[I)V")
    public final void method144(int arg0, class136 arg1, int[] arg2) {
        field254++;
        if (this.field245 == null) {
            return;
        }
        for (int var4 = 0; var4 < this.field245.length && var4 < arg2.length; var4++) {
            int var5 = class128.field2118[this.method138(var4, arg0 ^ 0x42CF)];
            if (var5 > 0) {
                arg1.method994(var5, (long) arg2[var4], 0);
            }
        }
        if (arg0 != -17104) {
            field247 = null;
        }
    }

    @OriginalMember(owner = "client!eg", name = "e", descriptor = "(I)V")
    public static void method145(int arg0) {
        field258 = null;
        if (arg0 == -1822) {
            field260 = null;
            field247 = null;
        }
    }

    @OriginalMember(owner = "client!eg", name = "b", descriptor = "(II)V")
    public static final void method146(int arg0, int arg1) {
        class23 var2 = class91.method694(arg1, arg0, 122);
        var2.method183(-87);
        field246++;
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(ILig;)Ljava/lang/String;")
    public final String method147(int arg0, class136 arg1) {
        if (arg0 < 25) {
            this.field255 = null;
        }
        field248++;
        StringBuffer var3 = new StringBuffer(80);
        if (this.field245 != null) {
            for (int var4 = 0; var4 < this.field245.length; var4++) {
                var3.append(this.field255[var4]);
                var3.append(class108.method801(this.field245[var4], 0, this.field257[var4], arg1.method979(class4.field59[this.field245[var4]], true)));
            }
        }
        var3.append(this.field255[this.field255.length - 1]);
        return var3.toString();
    }

    @OriginalMember(owner = "client!eg", name = "e", descriptor = "(B)V")
    public final void method148(byte arg0) {
        if (this.field256 != null) {
            for (int var2 = 0; var2 < this.field256.length; var2++) {
                this.field256[var2] = class140.method1045(this.field256[var2], 32768);
            }
        }
        field266++;
        int var3 = -4 / ((arg0 - 62) / 52);
    }
}
