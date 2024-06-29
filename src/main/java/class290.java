import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hi")
public class class290 extends class71 {

    @OriginalMember(owner = "client!hi", name = "R", descriptor = "I")
    private int field5167 = 0;

    @OriginalMember(owner = "client!hi", name = "Q", descriptor = "I")
    private int field5166 = 0;

    @OriginalMember(owner = "client!hi", name = "bb", descriptor = "I")
    private int field5177 = 0;

    @OriginalMember(owner = "client!hi", name = "M", descriptor = "Z")
    public static boolean field5162 = false;

    @OriginalMember(owner = "client!hi", name = "J", descriptor = "I")
    private int field5159;

    @OriginalMember(owner = "client!hi", name = "K", descriptor = "I")
    public static int field5160;

    @OriginalMember(owner = "client!hi", name = "L", descriptor = "I")
    public static int field5161;

    @OriginalMember(owner = "client!hi", name = "N", descriptor = "I")
    public static int field5163;

    @OriginalMember(owner = "client!hi", name = "O", descriptor = "I")
    private int field5164;

    @OriginalMember(owner = "client!hi", name = "P", descriptor = "I")
    private int field5165;

    @OriginalMember(owner = "client!hi", name = "T", descriptor = "I")
    private int field5169;

    @OriginalMember(owner = "client!hi", name = "U", descriptor = "I")
    public static int field5170;

    @OriginalMember(owner = "client!hi", name = "V", descriptor = "I")
    private int field5171;

    @OriginalMember(owner = "client!hi", name = "W", descriptor = "I")
    public static int field5172;

    @OriginalMember(owner = "client!hi", name = "X", descriptor = "I")
    public static int field5173;

    @OriginalMember(owner = "client!hi", name = "Y", descriptor = "I")
    private int field5174;

    @OriginalMember(owner = "client!hi", name = "Z", descriptor = "I")
    public static int field5175;

    @OriginalMember(owner = "client!hi", name = "ab", descriptor = "I")
    public static int field5176;

    @OriginalMember(owner = "client!hi", name = "S", descriptor = "[Z")
    public static boolean[] field5168;

    @OriginalMember(owner = "client!hi", name = "<init>", descriptor = "()V", line = 4)
    public class290() {
        super(1, false);
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(IIII)V", line = 13)
    private final void method2069(int arg0, int arg1, int arg2, int arg3) {
        field5170++;
        int var5 = arg0 > 2048 ? arg0 + arg1 - (arg0 * arg1 >> 12) : (arg1 + 4096) * arg0 >> 12;
        if (var5 <= 0) {
            this.field5159 = this.field5171 = this.field5169 = arg0;
        } else {
            int var6 = arg2 * 6;
            int var7 = arg0 + arg0 - var5;
            int var8 = (var5 - var7 << 12) / var5;
            int var9 = var6 >> 12;
            int var11 = var6 - (var9 << 12);
            int var12 = var8 * var5 >> 12;
            int var13 = var11 * var12 >> 12;
            int var14 = var7 + var13;
            int var15 = var5 - var13;
            if (var9 == 0) {
                this.field5171 = var14;
                this.field5159 = var5;
                this.field5169 = var7;
            } else if (var9 == 1) {
                this.field5171 = var5;
                this.field5159 = var15;
                this.field5169 = var7;
            } else if (var9 == 2) {
                this.field5169 = var14;
                this.field5159 = var7;
                this.field5171 = var5;
            } else if (var9 == 3) {
                this.field5169 = var5;
                this.field5171 = var15;
                this.field5159 = var7;
            } else if (var9 == 4) {
                this.field5169 = var5;
                this.field5171 = var7;
                this.field5159 = var14;
            } else if (var9 == 5) {
                this.field5169 = var15;
                this.field5171 = var7;
                this.field5159 = var5;
            }
        }
        if (arg3 != 1378498636) {
            this.field5169 = -106;
        }
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(BIII)V", line = 122)
    private final void method2070(byte arg0, int arg1, int arg2, int arg3) {
        field5172++;
        if (arg0 != -50) {
            this.field5169 = 26;
        }
        int var5 = arg3 < arg2 ? arg2 : arg3;
        int var6 = arg3 > arg2 ? arg2 : arg3;
        int var7 = var5 < arg1 ? arg1 : var5;
        int var8 = arg1 < var6 ? arg1 : var6;
        int var9 = var7 - var8;
        this.field5164 = (var7 + var8) / 2;
        if (var9 <= 0) {
            this.field5165 = 0;
        } else {
            int var10 = (var7 - arg1 << 12) / var9;
            int var11 = (var7 - arg2 << 12) / var9;
            int var12 = (var7 - arg3 << 12) / var9;
            if (arg2 == var7) {
                this.field5165 = arg3 == var8 ? var10 + 20480 : 4096 - var12;
            } else if (arg3 == var7) {
                this.field5165 = arg1 == var8 ? var11 + 4096 : -var10 + 12288;
            } else {
                this.field5165 = arg2 == var8 ? var12 + 12288 : -var11 + 20480;
            }
            this.field5165 /= 6;
        }
        if (this.field5164 > 0 && this.field5164 < 4096) {
            this.field5174 = (var9 << 12) / (this.field5164 > 2048 ? 8192 - (this.field5164 * 2) : this.field5164 * 2);
        } else {
            this.field5174 = 0;
        }
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(IBI)V", line = 177)
    public static final void method2071(int arg0, byte arg1, int arg2) {
        for (int var3 = 0; var3 < class192.field3469; var3++) {
            class231 var4 = class216.method1578(var3, -126);
            if (var4 != null) {
                int var5 = var4.field4035;
                if (var5 >= 0 && !class27.field656.method314(var5, 1)) {
                    var5 = -1;
                }
                int var9;
                if (var4.field4037 >= 0) {
                    int var10 = var4.field4037;
                    int var11 = (var10 & 0x7F) + arg0;
                    if (var11 < 0) {
                        var11 = 0;
                    } else if (var11 > 127) {
                        var11 = 127;
                    }
                    int var12 = (var10 & 0x380) + (arg2 + var10 & 0xFC00) + var11;
                    var9 = class27.field645[class306.method2177(false, var12, 96)];
                } else if (var5 >= 0) {
                    var9 = class27.field645[class306.method2177(false, class27.field656.method316(false, var5), 96)];
                } else if (var4.field4046 == -1) {
                    var9 = -1;
                } else {
                    int var6 = var4.field4046;
                    int var7 = (var6 & 0x7F) + arg0;
                    if (var7 < 0) {
                        var7 = 0;
                    } else if (var7 > 127) {
                        var7 = 127;
                    }
                    int var8 = (arg2 + var6 & 0xFC00) + var7 + (var6 & 0x380);
                    var9 = class27.field645[class306.method2177(false, var8, 96)];
                }
                class102.field1923[var3 + 1] = var9;
            }
        }
        int var13 = -75 / ((3 - arg1) / 60);
        field5176++;
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(BLvh;)Lk;", line = 252)
    public static final class232 method2072(byte arg0, class53 arg1) {
        field5160++;
        if (arg0 >= -65) {
            method2074(-60);
        }
        return new class232(arg1.method495((byte) -107), arg1.method495((byte) 94), arg1.method495((byte) -65), arg1.method495((byte) 100), arg1.method495((byte) 85), arg1.method495((byte) 122), arg1.method495((byte) -67), arg1.method495((byte) 116), arg1.method461((byte) 117), arg1.method483(-125));
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(IZLvh;)V", line = 273)
    public final void method77(int arg0, boolean arg1, class53 arg2) {
        field5173++;
        if (!arg1) {
            return;
        }
        if (arg0 == 0) {
            this.field5166 = arg2.method495((byte) -82);
        } else if (arg0 == 1) {
            this.field5167 = (arg2.method494(false) << 12) / 100;
        } else if (arg0 == 2) {
            this.field5177 = (arg2.method494(false) << 12) / 100;
        }
    }

    @OriginalMember(owner = "client!hi", name = "b", descriptor = "(Z)V", line = 322)
    public static void method2073(boolean arg0) {
        if (!arg0) {
            field5162 = false;
        }
        field5168 = null;
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(II)[[I", line = 335)
    public final int[][] method86(int arg0, int arg1) {
        field5163++;
        int var3 = 124 / ((-arg1 - 70) / 54);
        int[][] var4 = this.field1400.method1746((byte) 25, arg0);
        if (this.field1400.field4363) {
            int[][] var5 = this.method619(0, 2, arg0);
            int[] var6 = var5[0];
            int[] var7 = var5[1];
            int[] var8 = var5[2];
            int[] var9 = var4[0];
            int[] var10 = var4[1];
            int[] var11 = var4[2];
            for (int var12 = 0; var12 < class215.field3787; var12++) {
                this.method2070((byte) -50, var8[var12], var6[var12], var7[var12]);
                this.field5174 += this.field5167;
                this.field5165 += this.field5166;
                this.field5164 += this.field5177;
                while (this.field5165 < 0) {
                    this.field5165 += 4096;
                }
                if (this.field5164 < 0) {
                    this.field5164 = 0;
                }
                if (this.field5164 > 4096) {
                    this.field5164 = 4096;
                }
                if (this.field5174 < 0) {
                    this.field5174 = 0;
                }
                if (this.field5174 > 4096) {
                    this.field5174 = 4096;
                }
                while (this.field5165 > 4096) {
                    this.field5165 -= 4096;
                }
                this.method2069(this.field5164, this.field5174, this.field5165, 1378498636);
                var9[var12] = this.field5159;
                var10[var12] = this.field5171;
                var11[var12] = this.field5169;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!hi", name = "f", descriptor = "(I)V", line = 410)
    public static final void method2074(int arg0) {
        if (class317.field5560 != null) {
            class41.method352(class317.field5560, 30922);
            class317.field5560 = null;
        }
        field5175++;
        if (arg0 < 25) {
            field5168 = (boolean[]) null;
        }
    }
}
