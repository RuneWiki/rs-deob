import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!n")
public class class331 extends class335 {

    @OriginalMember(owner = "client!n", name = "N", descriptor = "I")
    public int field5138 = 4;

    @OriginalMember(owner = "client!n", name = "P", descriptor = "I")
    public int field5140 = 0;

    @OriginalMember(owner = "client!n", name = "U", descriptor = "[B")
    private byte[] field5145 = new byte[512];

    @OriginalMember(owner = "client!n", name = "eb", descriptor = "I")
    public int field5155 = 4;

    @OriginalMember(owner = "client!n", name = "Y", descriptor = "Z")
    public boolean field5149 = true;

    @OriginalMember(owner = "client!n", name = "R", descriptor = "I")
    public int field5142 = 4;

    @OriginalMember(owner = "client!n", name = "Z", descriptor = "I")
    public int field5150 = 1638;

    @OriginalMember(owner = "client!n", name = "T", descriptor = "I")
    public static int field5144 = 0;

    @OriginalMember(owner = "client!n", name = "fb", descriptor = "Lrd;")
    public static class225 field5156 = new class225();

    @OriginalMember(owner = "client!n", name = "jb", descriptor = "I")
    public static int field5160 = -1;

    @OriginalMember(owner = "client!n", name = "gb", descriptor = "Lid;")
    public static class189 field5157 = new class189();

    @OriginalMember(owner = "client!n", name = "M", descriptor = "I")
    public static int field5137;

    @OriginalMember(owner = "client!n", name = "O", descriptor = "I")
    public static int field5139;

    @OriginalMember(owner = "client!n", name = "S", descriptor = "I")
    public static int field5143;

    @OriginalMember(owner = "client!n", name = "V", descriptor = "I")
    public static int field5146;

    @OriginalMember(owner = "client!n", name = "X", descriptor = "I")
    public static int field5148;

    @OriginalMember(owner = "client!n", name = "ab", descriptor = "I")
    public static int field5151;

    @OriginalMember(owner = "client!n", name = "bb", descriptor = "I")
    public static int field5152;

    @OriginalMember(owner = "client!n", name = "cb", descriptor = "I")
    public static int field5153;

    @OriginalMember(owner = "client!n", name = "db", descriptor = "I")
    public static int field5154;

    @OriginalMember(owner = "client!n", name = "ib", descriptor = "I")
    public static int field5159;

    @OriginalMember(owner = "client!n", name = "hb", descriptor = "[I")
    public static int[] field5158;

    @OriginalMember(owner = "client!n", name = "Q", descriptor = "[S")
    private short[] field5141;

    @OriginalMember(owner = "client!n", name = "W", descriptor = "[S")
    private short[] field5147;

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(IIIBIII)I", line = 6)
    private final int method2294(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6) {
        field5153++;
        int var8 = arg2 - 4096;
        int var9 = arg4 >> 12;
        int var10 = var9 + 1;
        if (arg3 > -36) {
            method2296((byte) 81);
        }
        if (arg6 <= var10) {
            var10 = 0;
        }
        int var11 = arg4 & 0xFFF;
        int var12 = var9 & 0xFF;
        int var13 = var11 - 4096;
        int var14 = this.field5145[var12 + arg1] & 0x3;
        int var15 = class295.field4559[var11];
        int var16;
        if (var14 <= 1) {
            var16 = var14 == 0 ? var11 + arg2 : arg2 - var11;
        } else {
            var16 = var14 == 2 ? var11 - arg2 : -arg2 + -var11;
        }
        int var17 = var10 & 0xFF;
        int var18 = this.field5145[arg1 + var17] & 0x3;
        int var19;
        if (var18 > 1) {
            var19 = var18 == 2 ? var13 - arg2 : -arg2 + -var13;
        } else {
            var19 = var18 == 0 ? arg2 + var13 : -var13 + arg2;
        }
        int var20 = this.field5145[arg0 + var12] & 0x3;
        int var21 = ((var19 - var16) * var15 >> 12) + var16;
        int var22;
        if (var20 <= 1) {
            var22 = var20 == 0 ? var8 + var11 : var8 - var11;
        } else {
            var22 = var20 == 2 ? var11 - var8 : -var11 - var8;
        }
        int var23 = this.field5145[arg0 + var17] & 0x3;
        int var24;
        if (var23 <= 1) {
            var24 = var23 == 0 ? var13 + var8 : -var13 + var8;
        } else {
            var24 = var23 == 2 ? var13 - var8 : -var8 + -var13;
        }
        int var25 = ((var24 - var22) * var15 >> 12) + var22;
        return ((var25 - var21) * arg5 >> 12) + var21;
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(Z[II)V", line = 81)
    public final void method2295(boolean arg0, int[] arg1, int arg2) {
        field5143++;
        int var4 = class280.field4316[arg2] * this.field5155;
        if (arg0) {
            this.method2297(false);
        }
        if (this.field5142 == 1) {
            short var38 = this.field5141[0];
            int var39 = this.field5147[0] << 12;
            int var40 = var4 * var39 >> 12;
            int var41 = this.field5138 * var39 >> 12;
            int var42 = this.field5155 * var39 >> 12;
            int var43 = var40 >> 12;
            int var44 = var43 + 1;
            if (var42 <= var44) {
                var44 = 0;
            }
            int var45 = this.field5145[var44 & 0xFF] & 0xFF;
            int var46 = var40 & 0xFFF;
            int var47 = class295.field4559[var46];
            int var48 = this.field5145[var43 & 0xFF] & 0xFF;
            if (this.field5149) {
                for (int var49 = 0; var49 < class105.field1630; var49++) {
                    int var50 = class90.field1437[var49] * this.field5138;
                    int var51 = this.method2294(var45, var48, var46, (byte) -100, var39 * var50 >> 12, var47, var41);
                    int var52 = var38 * var51 >> 12;
                    arg1[var49] = (var52 >> 1) + 2048;
                }
            } else {
                for (int var53 = 0; var53 < class105.field1630; var53++) {
                    int var54 = class90.field1437[var53] * this.field5138;
                    int var55 = this.method2294(var45, var48, var46, (byte) -97, var39 * var54 >> 12, var47, var41);
                    arg1[var53] = var38 * var55 >> 12;
                }
            }
            return;
        }
        short var5 = this.field5141[0];
        if (var5 > 8 || var5 < -8) {
            int var6 = this.field5147[0] << 12;
            int var7 = var4 * var6 >> 12;
            int var8 = this.field5138 * var6 >> 12;
            int var9 = var7 >> 12;
            int var10 = this.field5145[var9 & 0xFF] & 0xFF;
            int var11 = var7 & 0xFFF;
            int var12 = class295.field4559[var11];
            int var13 = var9 + 1;
            int var14 = this.field5155 * var6 >> 12;
            if (var13 >= var14) {
                var13 = 0;
            }
            int var15 = this.field5145[var13 & 0xFF] & 0xFF;
            for (int var16 = 0; var16 < class105.field1630; var16++) {
                int var17 = class90.field1437[var16] * this.field5138;
                int var18 = this.method2294(var15, var10, var11, (byte) -51, var6 * var17 >> 12, var12, var8);
                arg1[var16] = var5 * var18 >> 12;
            }
        }
        for (int var19 = 1; var19 < this.field5142; var19++) {
            short var20 = this.field5141[var19];
            if (var20 > 8 || var20 < -8) {
                int var21 = this.field5147[var19] << 12;
                int var22 = this.field5155 * var21 >> 12;
                int var23 = this.field5138 * var21 >> 12;
                int var24 = var4 * var21 >> 12;
                int var25 = var24 >> 12;
                int var26 = var25 + 1;
                int var27 = var24 & 0xFFF;
                int var28 = this.field5145[var25 & 0xFF] & 0xFF;
                if (var26 >= var22) {
                    var26 = 0;
                }
                int var29 = class295.field4559[var27];
                int var30 = this.field5145[var26 & 0xFF] & 0xFF;
                if (this.field5149 && this.field5142 - 1 == var19) {
                    for (int var31 = 0; var31 < class105.field1630; var31++) {
                        int var32 = class90.field1437[var31] * this.field5138;
                        int var33 = this.method2294(var30, var28, var27, (byte) -58, var21 * var32 >> 12, var29, var23);
                        int var34 = arg1[var31] + (var20 * var33 >> 12);
                        arg1[var31] = (var34 >> 1) + 2048;
                    }
                } else {
                    for (int var35 = 0; var35 < class105.field1630; var35++) {
                        int var36 = class90.field1437[var35] * this.field5138;
                        int var37 = this.method2294(var30, var28, var27, (byte) -90, var21 * var36 >> 12, var29, var23);
                        arg1[var35] += var20 * var37 >> 12;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!n", name = "c", descriptor = "(B)V", line = 239)
    public static void method2296(byte arg0) {
        field5157 = null;
        field5156 = null;
        field5158 = null;
        if (arg0 != -33) {
            method2296((byte) -53);
        }
    }

    @OriginalMember(owner = "client!n", name = "c", descriptor = "(Z)V", line = 252)
    private final void method2297(boolean arg0) {
        field5152++;
        if (this.field5150 > 0) {
            this.field5141 = new short[this.field5142];
            this.field5147 = new short[this.field5142];
            for (int var2 = 0; var2 < this.field5142; var2++) {
                this.field5141[var2] = (short) ((int) (Math.pow((double) ((float) this.field5150 / 4096.0F), (double) var2) * 4096.0D));
                this.field5147[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
            }
        } else if (this.field5141 != null && this.field5141.length == this.field5142) {
            this.field5147 = new short[this.field5142];
            for (int var3 = 0; var3 < this.field5142; var3++) {
                this.field5147[var3] = (short) ((int) Math.pow(2.0D, (double) var3));
            }
        }
        if (arg0) {
            this.field5147 = (short[]) null;
        }
    }

    @OriginalMember(owner = "client!n", name = "e", descriptor = "(I)V", line = 291)
    public final void method381(int arg0) {
        field5154++;
        this.field5145 = class313.method2122(this.field5140, (byte) 87);
        this.method2297(false);
        for (int var2 = this.field5142 - 1; var2 >= 1; var2--) {
            short var3 = this.field5141[var2];
            if (var3 > 8 || var3 < -8) {
                break;
            }
            this.field5142--;
        }
        int var4 = -23 % ((44 - arg0) / 35);
    }

    @OriginalMember(owner = "client!n", name = "b", descriptor = "(II)[I", line = 322)
    public final int[] method149(int arg0, int arg1) {
        if (arg1 != 621) {
            field5156 = (class225) null;
        }
        field5151++;
        int[] var3 = this.field5233.method1110((byte) 108, arg0);
        if (this.field5233.field2467) {
            this.method2295(false, var3, arg0);
        }
        return var3;
    }

    @OriginalMember(owner = "client!n", name = "c", descriptor = "(II)Lte;", line = 344)
    public static final class124 method2298(int arg0, int arg1) {
        class124 var2 = (class124) class338.field5280.method2179(false, (long) arg1);
        field5139++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class142.field2190.method980(arg1, 0, 5);
        if (arg0 == -1) {
            class124 var4 = new class124(var3);
            var4.method2242(class78.field1251, (int[]) null);
            class338.field5280.method2173(var4, true, (long) arg1);
            return var4;
        } else {
            return (class124) null;
        }
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(IIIBI)V", line = 366)
    public static final void method2299(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        field5146++;
        if (class222.field3535 == 1) {
            class111.field1721[class313.field4865 / 100].method617(class233.field3691 - 8, class317.field4950 + -8);
        }
        if (class222.field3535 == 2) {
            class111.field1721[(class313.field4865 / 100) + 4].method617(class233.field3691 - 8, class317.field4950 + -8);
        }
        if (arg3 >= 115) {
            class2.method7(true);
        }
    }

    @OriginalMember(owner = "client!n", name = "<init>", descriptor = "()V", line = 449)
    public class331() {
        super(0, true);
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(BLki;)V", line = 406)
    public static final void method2300(byte arg0, class180 arg1) {
        field5148++;
        class14 var2 = null;
        try {
            class197 var3 = arg1.method1275(5600, "runescape");
            while (var3.field2956 == 0) {
                class5.method26(0, 1L);
            }
            if (var3.field2956 == 1) {
                var2 = (class14) var3.field2959;
                class166 var4 = class95.method713(false);
                var2.method105(var4.field2532, 0, (byte) -128, var4.field2500);
            }
            if (arg0 != -106) {
                method2300((byte) 66, (class180) null);
            }
        } catch (Exception var8) {
        }
        try {
            if (var2 != null) {
                var2.method102((byte) 18);
            }
        } catch (Exception var7) {
        }
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(ILkh;I)V", line = 456)
    public final void method230(int arg0, class166 arg1, int arg2) {
        field5137++;
        if (arg0 == 0) {
            this.field5149 = arg1.method1178(0) == 1;
        } else if (arg0 == 1) {
            this.field5142 = arg1.method1178(0);
        } else if (arg0 == 2) {
            this.field5150 = arg1.method1166(52);
            if (this.field5150 < 0) {
                this.field5141 = new short[this.field5142];
                for (int var5 = 0; var5 < this.field5142; var5++) {
                    this.field5141[var5] = (short) arg1.method1166(52);
                }
            }
        } else if (arg0 == 3) {
            this.field5138 = this.field5155 = arg1.method1178(0);
        } else if (arg0 == 4) {
            this.field5140 = arg1.method1178(0);
        } else if (arg0 == 5) {
            this.field5138 = arg1.method1178(0);
        } else if (arg0 == 6) {
            this.field5155 = arg1.method1178(0);
        }
        if (arg2 <= 51) {
            method2298(-12, -114);
        }
    }
}
