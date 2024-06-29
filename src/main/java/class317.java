import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dm")
public class class317 extends class182 {

    @OriginalMember(owner = "client!dm", name = "I", descriptor = "Z")
    public boolean field5151 = true;

    @OriginalMember(owner = "client!dm", name = "O", descriptor = "[B")
    private byte[] field5155 = new byte[512];

    @OriginalMember(owner = "client!dm", name = "S", descriptor = "I")
    public int field5159 = 1638;

    @OriginalMember(owner = "client!dm", name = "M", descriptor = "I")
    public int field5154 = 4;

    @OriginalMember(owner = "client!dm", name = "Q", descriptor = "I")
    public int field5157 = 4;

    @OriginalMember(owner = "client!dm", name = "X", descriptor = "I")
    public int field5163 = 4;

    @OriginalMember(owner = "client!dm", name = "bb", descriptor = "I")
    public int field5167 = 0;

    @OriginalMember(owner = "client!dm", name = "Y", descriptor = "Lug;")
    public static class339 field5164 = new class339();

    @OriginalMember(owner = "client!dm", name = "eb", descriptor = "I")
    public static int field5170 = -1;

    @OriginalMember(owner = "client!dm", name = "fb", descriptor = "I")
    public static int field5171 = 0;

    @OriginalMember(owner = "client!dm", name = "gb", descriptor = "[I")
    public static int[] field5172 = new int[500];

    @OriginalMember(owner = "client!dm", name = "hb", descriptor = "[Ljava/lang/String;")
    public static String[] field5173 = new String[500];

    @OriginalMember(owner = "client!dm", name = "J", descriptor = "I")
    public static int field5152;

    @OriginalMember(owner = "client!dm", name = "L", descriptor = "I")
    public static int field5153;

    @OriginalMember(owner = "client!dm", name = "P", descriptor = "I")
    public static int field5156;

    @OriginalMember(owner = "client!dm", name = "R", descriptor = "I")
    public static int field5158;

    @OriginalMember(owner = "client!dm", name = "U", descriptor = "I")
    public static int field5160;

    @OriginalMember(owner = "client!dm", name = "V", descriptor = "I")
    public static int field5161;

    @OriginalMember(owner = "client!dm", name = "Z", descriptor = "I")
    public static int field5165;

    @OriginalMember(owner = "client!dm", name = "cb", descriptor = "I")
    public static int field5168;

    @OriginalMember(owner = "client!dm", name = "db", descriptor = "I")
    public static int field5169;

    @OriginalMember(owner = "client!dm", name = "ib", descriptor = "I")
    public static int field5174;

    @OriginalMember(owner = "client!dm", name = "W", descriptor = "[S")
    private short[] field5162;

    @OriginalMember(owner = "client!dm", name = "ab", descriptor = "[S")
    private short[] field5166;

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(II[I)V", line = 8)
    public final void method2281(int arg0, int arg1, int[] arg2) {
        field5153++;
        int var4 = class248.field4066[arg1] * this.field5154;
        if (arg0 < 44) {
            return;
        }
        if (this.field5163 == 1) {
            int var38 = this.field5166[0] << 12;
            short var39 = this.field5162[0];
            int var40 = this.field5157 * var38 >> 12;
            int var41 = this.field5154 * var38 >> 12;
            int var42 = var4 * var38 >> 12;
            int var43 = var42 >> 12;
            int var44 = var43 + 1;
            int var45 = this.field5155[var43 & 0xFF] & 0xFF;
            int var46 = var42 & 0xFFF;
            int var47 = class105.field1922[var46];
            if (var41 <= var44) {
                var44 = 0;
            }
            int var48 = this.field5155[var44 & 0xFF] & 0xFF;
            if (this.field5151) {
                for (int var52 = 0; var52 < class26.field672; var52++) {
                    int var53 = class21.field539[var52] * this.field5157;
                    int var54 = this.method2285(var46, var48, var47, var45, var38 * var53 >> 12, var40, false);
                    int var55 = var39 * var54 >> 12;
                    arg2[var52] = (var55 >> 1) + 2048;
                }
            } else {
                for (int var49 = 0; var49 < class26.field672; var49++) {
                    int var50 = class21.field539[var49] * this.field5157;
                    int var51 = this.method2285(var46, var48, var47, var45, var38 * var50 >> 12, var40, false);
                    arg2[var49] = var39 * var51 >> 12;
                }
            }
            return;
        }
        short var5 = this.field5162[0];
        if (var5 > 8 || var5 < -8) {
            int var6 = this.field5166[0] << 12;
            int var7 = var4 * var6 >> 12;
            int var8 = var7 >> 12;
            int var9 = var8 + 1;
            int var10 = this.field5154 * var6 >> 12;
            int var11 = this.field5155[var8 & 0xFF] & 0xFF;
            int var12 = var7 & 0xFFF;
            if (var10 <= var9) {
                var9 = 0;
            }
            int var13 = class105.field1922[var12];
            int var14 = this.field5155[var9 & 0xFF] & 0xFF;
            int var15 = this.field5157 * var6 >> 12;
            for (int var16 = 0; var16 < class26.field672; var16++) {
                int var17 = class21.field539[var16] * this.field5157;
                int var18 = this.method2285(var12, var14, var13, var11, var6 * var17 >> 12, var15, false);
                arg2[var16] = var5 * var18 >> 12;
            }
        }
        for (int var19 = 1; var19 < this.field5163; var19++) {
            short var20 = this.field5162[var19];
            if (var20 > 8 || var20 < -8) {
                int var21 = this.field5166[var19] << 12;
                int var22 = var4 * var21 >> 12;
                int var23 = var22 >> 12;
                int var24 = this.field5155[var23 & 0xFF] & 0xFF;
                int var25 = this.field5157 * var21 >> 12;
                int var26 = this.field5154 * var21 >> 12;
                int var27 = var22 & 0xFFF;
                int var28 = var23 + 1;
                if (var28 >= var26) {
                    var28 = 0;
                }
                int var29 = this.field5155[var28 & 0xFF] & 0xFF;
                int var30 = class105.field1922[var27];
                if (this.field5151 && this.field5163 - 1 == var19) {
                    for (int var31 = 0; var31 < class26.field672; var31++) {
                        int var32 = class21.field539[var31] * this.field5157;
                        int var33 = this.method2285(var27, var29, var30, var24, var21 * var32 >> 12, var25, false);
                        int var34 = (var20 * var33 >> 12) + arg2[var31];
                        arg2[var31] = (var34 >> 1) + 2048;
                    }
                } else {
                    for (int var35 = 0; var35 < class26.field672; var35++) {
                        int var36 = class21.field539[var35] * this.field5157;
                        int var37 = this.method2285(var27, var29, var30, var24, var21 * var36 >> 12, var25, false);
                        arg2[var35] += var20 * var37 >> 12;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!dm", name = "<init>", descriptor = "()V", line = 455)
    public class317() {
        super(0, true);
    }

    @OriginalMember(owner = "client!dm", name = "b", descriptor = "(II)[I", line = 174)
    public final int[] method125(int arg0, int arg1) {
        if (arg0 != 2) {
            field5171 = -106;
        }
        field5169++;
        int[] var3 = this.field3166.method775(arg1, 127);
        if (this.field3166.field1903) {
            this.method2281(97, arg1, var3);
        }
        return var3;
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(ZI)V", line = 196)
    public static final void method2282(boolean arg0, int arg1) {
        field5156++;
        class170.field2809 = -1;
        class170.field2809 = -1;
        if (arg0) {
            field5171 = -24;
        }
        if (arg1 == 37) {
            class38.field822 = 3.0F;
        } else if (arg1 == 50) {
            class38.field822 = 4.0F;
        } else if (arg1 == 75) {
            class38.field822 = 6.0F;
        } else if (arg1 == 100) {
            class38.field822 = 8.0F;
        } else if (arg1 == 200) {
            class38.field822 = 16.0F;
        }
    }

    @OriginalMember(owner = "client!dm", name = "g", descriptor = "(I)V", line = 229)
    private final void method2283(int arg0) {
        if (arg0 != -1419163444) {
            return;
        }
        field5152++;
        if (this.field5159 > 0) {
            this.field5166 = new short[this.field5163];
            this.field5162 = new short[this.field5163];
            for (int var2 = 0; var2 < this.field5163; var2++) {
                this.field5162[var2] = (short) ((int) (Math.pow((double) ((float) this.field5159 / 4096.0F), (double) var2) * 4096.0D));
                this.field5166[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
            }
        } else if (this.field5162 != null && this.field5162.length == this.field5163) {
            this.field5166 = new short[this.field5163];
            for (int var3 = 0; var3 < this.field5163; var3++) {
                this.field5166[var3] = (short) ((int) Math.pow(2.0D, (double) var3));
            }
        }
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(Lla;IIIII)Ljava/awt/Frame;", line = 273)
    public static final Frame method2284(class157 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field5158++;
        if (!arg0.method1119(7173)) {
            return null;
        }
        if (arg4 != -10754) {
            method2286(false);
        }
        if (arg2 == 0) {
            class248[] var6 = class81.method600(-118, arg0);
            if (var6 == null) {
                return null;
            }
            boolean var7 = false;
            for (int var8 = 0; var8 < var6.length; var8++) {
                if (var6[var8].field4070 == arg3 && var6[var8].field4073 == arg1 && (arg5 == 0 || var6[var8].field4075 == arg5) && (!var7 || arg2 < var6[var8].field4074)) {
                    var7 = true;
                    arg2 = var6[var8].field4074;
                }
            }
            if (!var7) {
                return null;
            }
        }
        class210 var9 = arg0.method1126(arg2, arg1, arg5, 112, arg3);
        while (var9.field3504 == 0) {
            class122.method881(41, 10L);
        }
        Frame var10 = (Frame) var9.field3501;
        if (var10 == null) {
            return null;
        } else if (var9.field3504 == 2) {
            class273.method1936(arg0, -2, var10);
            return null;
        } else {
            return var10;
        }
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(IIIIIIZ)I", line = 349)
    private final int method2285(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        field5161++;
        int var8 = arg0 - 4096;
        int var9 = arg4 >> 12;
        int var10 = var9 + 1;
        int var11 = var9 & 0xFF;
        if (arg5 <= var10) {
            var10 = 0;
        }
        int var12 = this.field5155[var11 + arg3] & 0x3;
        int var13 = var10 & 0xFF;
        int var14 = arg4 & 0xFFF;
        int var15 = class105.field1922[var14];
        int var16;
        if (var12 > 1) {
            var16 = var12 == 2 ? var14 - arg0 : -arg0 + -var14;
        } else {
            var16 = var12 == 0 ? arg0 + var14 : -var14 + arg0;
        }
        int var17 = var14 - 4096;
        int var18 = this.field5155[arg3 + var13] & 0x3;
        int var19;
        if (var18 > 1) {
            var19 = var18 == 2 ? var17 - arg0 : -arg0 + -var17;
        } else {
            var19 = var18 == 0 ? arg0 + var17 : arg0 - var17;
        }
        int var20 = ((var19 - var16) * var15 >> 12) + var16;
        if (arg6) {
            this.field5159 = 124;
        }
        int var21 = this.field5155[arg1 + var11] & 0x3;
        int var22;
        if (var21 > 1) {
            var22 = var21 == 2 ? var14 - var8 : -var8 + -var14;
        } else {
            var22 = var21 == 0 ? var14 + var8 : var8 - var14;
        }
        int var23 = this.field5155[arg1 + var13] & 0x3;
        int var24;
        if (var23 <= 1) {
            var24 = var23 == 0 ? var8 + var17 : -var17 + var8;
        } else {
            var24 = var23 == 2 ? var17 - var8 : -var8 + -var17;
        }
        int var25 = var22 + ((var24 - var22) * var15 >> 12);
        return var20 + ((var25 - var20) * arg2 >> 12);
    }

    @OriginalMember(owner = "client!dm", name = "e", descriptor = "(I)V", line = 426)
    public final void method163(int arg0) {
        if (arg0 != 100) {
            return;
        }
        this.field5155 = class223.method1561(15844, this.field5167);
        this.method2283(-1419163444);
        field5160++;
        for (int var2 = this.field5163 - 1; var2 >= 1; var2--) {
            short var3 = this.field5162[var2];
            if (var3 > 8 || var3 < -8) {
                break;
            }
            this.field5163--;
        }
    }

    @OriginalMember(owner = "client!dm", name = "b", descriptor = "(Z)V", line = 460)
    public static final void method2286(boolean arg0) {
        class342.field5413.method297((byte) -127);
        int var1 = class342.field5413.method295((byte) -120, 1);
        field5168++;
        if (var1 == 0 || !arg0) {
            return;
        }
        int var2 = class342.field5413.method295((byte) 6, 2);
        if (var2 == 0) {
            class34.field761[class91.field1613++] = 2047;
        } else if (var2 == 1) {
            int var11 = class342.field5413.method295((byte) 31, 3);
            class96.field1750.method57(-2079349584, 1, var11);
            int var12 = class342.field5413.method295((byte) -105, 1);
            if (var12 == 1) {
                class34.field761[class91.field1613++] = 2047;
            }
        } else if (var2 == 2) {
            if (class342.field5413.method295((byte) 72, 1) == 1) {
                int var3 = class342.field5413.method295((byte) 58, 3);
                class96.field1750.method57(-2079349584, 2, var3);
                int var4 = class342.field5413.method295((byte) -90, 3);
                class96.field1750.method57(-2079349584, 2, var4);
            } else {
                int var5 = class342.field5413.method295((byte) -112, 3);
                class96.field1750.method57(-2079349584, 0, var5);
            }
            int var6 = class342.field5413.method295((byte) 39, 1);
            if (var6 == 1) {
                class34.field761[class91.field1613++] = 2047;
            }
        } else if (var2 == 3) {
            class276.field4506 = class342.field5413.method295((byte) 79, 2);
            int var7 = class342.field5413.method295((byte) 123, 7);
            int var8 = class342.field5413.method295((byte) 5, 1);
            if (var8 == 1) {
                class34.field761[class91.field1613++] = 2047;
            }
            int var9 = class342.field5413.method295((byte) -91, 7);
            int var10 = class342.field5413.method295((byte) 59, 1);
            class96.field1750.method749(var10 == 1, var7, -26866, var9);
        }
    }

    @OriginalMember(owner = "client!dm", name = "h", descriptor = "(I)V", line = 543)
    public static void method2287(int arg0) {
        if (arg0 != -1) {
            field5172 = (int[]) null;
        }
        field5172 = null;
        field5173 = null;
        field5164 = null;
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(Loe;IB)V", line = 581)
    public final void method126(class146 arg0, int arg1, byte arg2) {
        if (arg1 == 0) {
            this.field5151 = arg0.method1005((byte) 122) == 1;
        } else if (arg1 == 1) {
            this.field5163 = arg0.method1005((byte) 122);
        } else if (arg1 == 2) {
            this.field5159 = arg0.method1050(3);
            if (this.field5159 < 0) {
                this.field5162 = new short[this.field5163];
                for (int var5 = 0; var5 < this.field5163; var5++) {
                    this.field5162[var5] = (short) arg0.method1050(3);
                }
            }
        } else if (arg1 == 3) {
            this.field5157 = this.field5154 = arg0.method1005((byte) 122);
        } else if (arg1 == 4) {
            this.field5167 = arg0.method1005((byte) 122);
        } else if (arg1 == 5) {
            this.field5157 = arg0.method1005((byte) 122);
        } else if (arg1 == 6) {
            this.field5154 = arg0.method1005((byte) 122);
        }
        if (arg2 != 60) {
            method2287(77);
        }
        field5165++;
    }
}
