import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oh")
public class class168 extends class179 {

    @OriginalMember(owner = "client!oh", name = "Q", descriptor = "I")
    public int field2969 = 4;

    @OriginalMember(owner = "client!oh", name = "T", descriptor = "I")
    public int field2972 = 1638;

    @OriginalMember(owner = "client!oh", name = "ab", descriptor = "[B")
    private byte[] field2979 = new byte[512];

    @OriginalMember(owner = "client!oh", name = "bb", descriptor = "I")
    public int field2980 = 4;

    @OriginalMember(owner = "client!oh", name = "Y", descriptor = "Z")
    public boolean field2977 = true;

    @OriginalMember(owner = "client!oh", name = "gb", descriptor = "I")
    public int field2985 = 4;

    @OriginalMember(owner = "client!oh", name = "fb", descriptor = "I")
    public int field2984 = 0;

    @OriginalMember(owner = "client!oh", name = "S", descriptor = "Lug;")
    public static class238 field2971 = new class238(5000);

    @OriginalMember(owner = "client!oh", name = "lb", descriptor = "I")
    public static int field2990 = -2;

    @OriginalMember(owner = "client!oh", name = "mb", descriptor = "I")
    public static int field2991 = 0;

    @OriginalMember(owner = "client!oh", name = "R", descriptor = "I")
    public static int field2970;

    @OriginalMember(owner = "client!oh", name = "U", descriptor = "I")
    public static int field2973;

    @OriginalMember(owner = "client!oh", name = "V", descriptor = "I")
    public static int field2974;

    @OriginalMember(owner = "client!oh", name = "W", descriptor = "I")
    public static int field2975;

    @OriginalMember(owner = "client!oh", name = "X", descriptor = "I")
    public static int field2976;

    @OriginalMember(owner = "client!oh", name = "Z", descriptor = "I")
    public static int field2978;

    @OriginalMember(owner = "client!oh", name = "db", descriptor = "I")
    public static int field2982;

    @OriginalMember(owner = "client!oh", name = "eb", descriptor = "I")
    public static int field2983;

    @OriginalMember(owner = "client!oh", name = "hb", descriptor = "I")
    public static int field2986;

    @OriginalMember(owner = "client!oh", name = "kb", descriptor = "I")
    public static int field2989;

    @OriginalMember(owner = "client!oh", name = "jb", descriptor = "Llc;")
    public static class278 field2988;

    @OriginalMember(owner = "client!oh", name = "cb", descriptor = "[S")
    private short[] field2981;

    @OriginalMember(owner = "client!oh", name = "ib", descriptor = "[S")
    private short[] field2987;

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(ILra;I)V", line = 5)
    public final void method54(int arg0, class41 arg1, int arg2) {
        if (arg0 < 108) {
            this.field2980 = 38;
        }
        if (arg2 == 0) {
            this.field2977 = arg1.method357(false) == 1;
        } else if (arg2 == 1) {
            this.field2985 = arg1.method357(false);
        } else if (arg2 == 2) {
            this.field2972 = arg1.method309(2);
            if (this.field2972 < 0) {
                this.field2987 = new short[this.field2985];
                for (int var5 = 0; var5 < this.field2985; var5++) {
                    this.field2987[var5] = (short) arg1.method309(2);
                }
            }
        } else if (arg2 == 3) {
            this.field2969 = this.field2980 = arg1.method357(false);
        } else if (arg2 == 4) {
            this.field2984 = arg1.method357(false);
        } else if (arg2 == 5) {
            this.field2969 = arg1.method357(false);
        } else if (arg2 == 6) {
            this.field2980 = arg1.method357(false);
        }
        field2982++;
    }

    @OriginalMember(owner = "client!oh", name = "j", descriptor = "(I)V", line = 102)
    private final void method1218(int arg0) {
        if (arg0 != 4096) {
            method1220(9, 26, 80, 52, 86, -33, 112, -64);
        }
        if (this.field2972 > 0) {
            this.field2987 = new short[this.field2985];
            this.field2981 = new short[this.field2985];
            for (int var2 = 0; var2 < this.field2985; var2++) {
                this.field2987[var2] = (short) ((int) (Math.pow((double) ((float) this.field2972 / 4096.0F), (double) var2) * 4096.0D));
                this.field2981[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
            }
        } else if (this.field2987 != null && this.field2987.length == this.field2985) {
            this.field2981 = new short[this.field2985];
            for (int var3 = 0; var3 < this.field2985; var3++) {
                this.field2981[var3] = (short) ((int) Math.pow(2.0D, (double) var3));
            }
        }
        field2989++;
    }

    @OriginalMember(owner = "client!oh", name = "b", descriptor = "(B)V", line = 145)
    public static final void method1219(byte arg0) {
        field2976++;
        for (int var1 = 0; var1 < class132.field2303; var1++) {
            int var2 = class112.field1958[var1];
            class144 var3 = class300.field5172[var2];
            int var4 = class23.field302.method357(false);
            if ((var4 & 0x80) != 0) {
                var4 += class23.field302.method357(false) << 8;
            }
            class286.method2001(var2, -115, var4, var3);
        }
        int var5 = 17 / ((64 - arg0) / 61);
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(IIIIIIII)V", line = 172)
    public static final void method1220(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg7 >= -9) {
            method1222((byte) -63, -66);
        }
        field2978++;
        if (arg3 >= class244.field4161 && arg4 <= class175.field3106 && arg2 >= class105.field1887 && arg1 <= class274.field4748) {
            class165.method1210(arg1, arg3, arg4, arg0, arg6, -85, arg2, arg5);
        } else {
            class52.method414(arg2, arg6, arg3, arg4, arg1, arg0, arg5, -134684116);
        }
    }

    @OriginalMember(owner = "client!oh", name = "<init>", descriptor = "()V", line = 189)
    public class168() {
        super(0, true);
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(IIIIIII)I", line = 194)
    private final int method1221(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field2975++;
        int var8 = arg1 - 4096;
        int var9 = arg4 >> 12;
        int var10 = var9 + 1;
        int var11 = var9 & 0xFF;
        int var12 = this.field2979[arg3 + var11] & 0x3;
        int var13 = arg4 & 0xFFF;
        int var14 = var13 - 4096;
        int var15;
        if (var12 <= 1) {
            var15 = var12 == 0 ? var13 + arg1 : -var13 + arg1;
        } else {
            var15 = var12 == 2 ? var13 - arg1 : -arg1 + -var13;
        }
        if (var10 >= arg2) {
            var10 = 0;
        }
        int var16 = var10 & 0xFF;
        int var17 = this.field2979[arg3 + var16] & 0x3;
        if (arg6 != 30723) {
            return -90;
        }
        int var18 = class49.field876[var13];
        int var19;
        if (var17 <= 1) {
            var19 = var17 == 0 ? arg1 + var14 : -var14 + arg1;
        } else {
            var19 = var17 == 2 ? var14 - arg1 : -arg1 + -var14;
        }
        int var20 = var15 + ((var19 - var15) * var18 >> 12);
        int var21 = this.field2979[var11 + arg0] & 0x3;
        int var22;
        if (var21 <= 1) {
            var22 = var21 == 0 ? var8 + var13 : -var13 + var8;
        } else {
            var22 = var21 == 2 ? var13 - var8 : -var8 + -var13;
        }
        int var23 = this.field2979[var16 + arg0] & 0x3;
        int var24;
        if (var23 > 1) {
            var24 = var23 == 2 ? var14 - var8 : -var8 + -var14;
        } else {
            var24 = var23 == 0 ? var14 + var8 : -var14 + var8;
        }
        int var25 = ((var24 - var22) * var18 >> 12) + var22;
        return ((var25 - var20) * arg5 >> 12) + var20;
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(B)V", line = 274)
    public final void method418(byte arg0) {
        this.field2979 = class191.method1385(this.field2984, -32341);
        this.method1218(4096);
        int var2 = this.field2985 - 1;
        if (arg0 != -110) {
            this.field2980 = 33;
        }
        while (var2 >= 1) {
            short var3 = this.field2987[var2];
            if (var3 > 8 || var3 < -8) {
                break;
            }
            this.field2985--;
            var2--;
        }
        field2986++;
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(BI)V", line = 303)
    public static final void method1222(byte arg0, int arg1) {
        if (arg0 == -124) {
            class77 var2 = class156.method1158(12, false, arg1);
            field2973++;
            var2.method586((byte) 98);
        }
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(Z)V", line = 340)
    public static void method1223(boolean arg0) {
        field2988 = null;
        field2971 = null;
        if (!arg0) {
            field2971 = (class238) null;
        }
    }

    @OriginalMember(owner = "client!oh", name = "k", descriptor = "(I)[Lj;", line = 370)
    public static final class227[] method1224(int arg0) {
        field2974++;
        class227[] var1 = new class227[class38.field691];
        if (arg0 != -23968) {
            method1223(true);
        }
        for (int var2 = 0; var2 < class38.field691; var2++) {
            byte[] var3 = class6.field92[var2];
            int var4 = class94.field1692[var2] * class62.field1093[var2];
            int[] var5 = new int[var4];
            for (int var6 = 0; var6 < var4; var6++) {
                var5[var6] = class305.field5270[class150.method1123(var3[var6], 255)];
            }
            var1[var2] = new class227(class142.field2486, class153.field2740, class13.field172[var2], class307.field5283[var2], class94.field1692[var2], class62.field1093[var2], var5);
        }
        class183.method1343(255);
        return var1;
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(II)[I", line = 411)
    public final int[] method41(int arg0, int arg1) {
        field2983++;
        if (arg1 != -31598) {
            return (int[]) null;
        }
        int[] var3 = this.field3157.method1258(-66, arg0);
        if (this.field3157.field3081) {
            this.method1225(var3, 1844420972, arg0);
        }
        return var3;
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "([III)V", line = 441)
    public final void method1225(int[] arg0, int arg1, int arg2) {
        if (arg1 != 1844420972) {
            this.field2977 = false;
        }
        field2970++;
        int var4 = class292.field5049[arg2] * this.field2980;
        if (this.field2985 == 1) {
            int var38 = this.field2981[0] << 12;
            short var39 = this.field2987[0];
            int var40 = this.field2980 * var38 >> 12;
            int var41 = this.field2969 * var38 >> 12;
            int var42 = var4 * var38 >> 12;
            int var43 = var42 >> 12;
            int var44 = var43 + 1;
            int var45 = var42 & 0xFFF;
            int var46 = class49.field876[var45];
            if (var44 >= var40) {
                var44 = 0;
            }
            int var47 = this.field2979[var43 & 0xFF] & 0xFF;
            int var48 = this.field2979[var44 & 0xFF] & 0xFF;
            if (this.field2977) {
                for (int var52 = 0; var52 < class161.field2858; var52++) {
                    int var53 = class290.field5017[var52] * this.field2969;
                    int var54 = this.method1221(var48, var45, var41, var47, var38 * var53 >> 12, var46, 30723);
                    int var55 = var39 * var54 >> 12;
                    arg0[var52] = (var55 >> 1) + 2048;
                }
            } else {
                for (int var49 = 0; var49 < class161.field2858; var49++) {
                    int var50 = class290.field5017[var49] * this.field2969;
                    int var51 = this.method1221(var48, var45, var41, var47, var38 * var50 >> 12, var46, 30723);
                    arg0[var49] = var39 * var51 >> 12;
                }
            }
            return;
        }
        short var5 = this.field2987[0];
        if (var5 > 8 || var5 < -8) {
            int var6 = this.field2981[0] << 12;
            int var7 = this.field2980 * var6 >> 12;
            int var8 = var4 * var6 >> 12;
            int var9 = var8 >> 12;
            int var10 = var8 & 0xFFF;
            int var11 = class49.field876[var10];
            int var12 = this.field2969 * var6 >> 12;
            int var13 = var9 + 1;
            int var14 = this.field2979[var9 & 0xFF] & 0xFF;
            if (var13 >= var7) {
                var13 = 0;
            }
            int var15 = this.field2979[var13 & 0xFF] & 0xFF;
            for (int var16 = 0; var16 < class161.field2858; var16++) {
                int var17 = class290.field5017[var16] * this.field2969;
                int var18 = this.method1221(var15, var10, var12, var14, var6 * var17 >> 12, var11, 30723);
                arg0[var16] = var5 * var18 >> 12;
            }
        }
        for (int var19 = 1; var19 < this.field2985; var19++) {
            short var20 = this.field2987[var19];
            if (var20 > 8 || var20 < -8) {
                int var21 = this.field2981[var19] << 12;
                int var22 = this.field2969 * var21 >> 12;
                int var23 = this.field2980 * var21 >> 12;
                int var24 = var4 * var21 >> 12;
                int var25 = var24 >> 12;
                int var26 = var25 + 1;
                int var27 = this.field2979[var25 & 0xFF] & 0xFF;
                int var28 = var24 & 0xFFF;
                int var29 = class49.field876[var28];
                if (var23 <= var26) {
                    var26 = 0;
                }
                int var30 = this.field2979[var26 & 0xFF] & 0xFF;
                if (this.field2977 && (this.field2985 - 1) == var19) {
                    for (int var31 = 0; var31 < class161.field2858; var31++) {
                        int var32 = class290.field5017[var31] * this.field2969;
                        int var33 = this.method1221(var30, var28, var22, var27, var21 * var32 >> 12, var29, 30723);
                        int var34 = (var20 * var33 >> 12) + arg0[var31];
                        arg0[var31] = (var34 >> 1) + 2048;
                    }
                } else {
                    for (int var35 = 0; var35 < class161.field2858; var35++) {
                        int var36 = class290.field5017[var35] * this.field2969;
                        int var37 = this.method1221(var30, var28, var22, var27, var21 * var36 >> 12, var29, 30723);
                        arg0[var35] += var20 * var37 >> 12;
                    }
                }
            }
        }
    }
}
