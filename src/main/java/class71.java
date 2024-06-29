import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!m")
public class class71 extends class87 {

    @OriginalMember(owner = "client!m", name = "S", descriptor = "I")
    private int field1129 = 2048;

    @OriginalMember(owner = "client!m", name = "P", descriptor = "I")
    private int field1126 = 10;

    @OriginalMember(owner = "client!m", name = "X", descriptor = "I")
    private int field1134 = 0;

    @OriginalMember(owner = "client!m", name = "K", descriptor = "I")
    public static int field1121 = 1;

    @OriginalMember(owner = "client!m", name = "G", descriptor = "I")
    public static int field1117 = 0;

    @OriginalMember(owner = "client!m", name = "U", descriptor = "Lpi;")
    public static class201 field1131 = new class201(4);

    @OriginalMember(owner = "client!m", name = "H", descriptor = "I")
    public static int field1118;

    @OriginalMember(owner = "client!m", name = "I", descriptor = "I")
    public static int field1119;

    @OriginalMember(owner = "client!m", name = "J", descriptor = "I")
    public static int field1120;

    @OriginalMember(owner = "client!m", name = "L", descriptor = "I")
    public static int field1122;

    @OriginalMember(owner = "client!m", name = "N", descriptor = "I")
    public static int field1124;

    @OriginalMember(owner = "client!m", name = "O", descriptor = "I")
    public static int field1125;

    @OriginalMember(owner = "client!m", name = "Q", descriptor = "I")
    public static int field1127;

    @OriginalMember(owner = "client!m", name = "R", descriptor = "I")
    public static int field1128;

    @OriginalMember(owner = "client!m", name = "V", descriptor = "I")
    public static int field1132;

    @OriginalMember(owner = "client!m", name = "W", descriptor = "Llc;")
    public static class270 field1133;

    @OriginalMember(owner = "client!m", name = "M", descriptor = "[I")
    private int[] field1123;

    @OriginalMember(owner = "client!m", name = "T", descriptor = "[I")
    private int[] field1130;

    @OriginalMember(owner = "client!m", name = "e", descriptor = "(I)V")
    public final void method136(int arg0) {
        if (arg0 != 0) {
            method538((byte) -13);
        }
        ++field1118;
        this.method539(arg0 ^ 125);
    }

    @OriginalMember(owner = "client!m", name = "b", descriptor = "(II)V")
    public static final void method534(int arg0, int arg1) {
        if (~class207.field3062 == -1) {
            class284.field4575.method464(arg0, 100);
        } else {
            class263.field4133 = arg0;
        }
        if (arg1 != 13672) {
            field1117 = 49;
        }
        ++field1132;
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(ZI)V")
    public static final void method535(boolean arg0, int arg1) {
        ++field1122;
        byte[][] var2 = class7.field75;
        if (arg1 != 26857) {
            field1121 = 99;
        }
        int var3 = class170.field2576.length;
        for (int var4 = 0; ~var3 < ~var4; ++var4) {
            byte[] var5 = var2[var4];
            if (var5 != null) {
                int var6 = (class53.field768[var4] >> 8) * 64 + -class163.field2520;
                int var7 = (class53.field768[var4] & 255) * 64 + -class149.field2390;
                class52.method316((byte) -118);
                class254.method1748(class235.field3431, var6, var5, arg1 + -26858, var7, arg0);
            }
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(IZ)[I")
    public final int[] method37(int arg0, boolean arg1) {
        int[] var3 = super.field1378.method319(arg0, arg1);
        ++field1119;
        if (super.field1378.field733) {
            int var4 = class140.field2272[arg0];
            if (~this.field1134 != -1) {
                for (int var5 = 0; var5 < class206.field3032; ++var5) {
                    short var6 = 0;
                    int var7 = 0;
                    int var8 = class138.field2254[var5];
                    int var9 = this.field1134;
                    if (var9 != 1) {
                        if (var9 != 2) {
                            if (var9 == 3) {
                                var7 = (-var4 + var8 >> 1) + 2048;
                            }
                        } else {
                            var7 = (var4 - (4096 - var8) >> 1) + 2048;
                        }
                    } else {
                        var7 = var8;
                    }
                    for (int var10 = 0; this.field1126 > var10; ++var10) {
                        if (var7 >= this.field1130[var10] && ~var7 > ~this.field1130[var10 + 1]) {
                            if (var7 < this.field1123[var10]) {
                                var6 = 4096;
                            }
                            break;
                        }
                    }
                    var3[var5] = var6;
                }
            } else {
                short var11 = 0;
                for (int var12 = 0; this.field1126 > var12; ++var12) {
                    if (~this.field1130[var12] >= ~var4 && ~this.field1130[var12 + 1] < ~var4) {
                        if (var4 < this.field1123[var12]) {
                            var11 = 4096;
                        }
                        break;
                    }
                }
                class117.method875(var3, 0, class206.field3032, var11);
            }
        }
        return arg1 ? null : var3;
    }

    @OriginalMember(owner = "client!m", name = "c", descriptor = "(B)V")
    public static final void method536(byte arg0) {
        ++field1128;
        for (int var1 = 0; ~class12.field135 < ~var1; ++var1) {
            int var2 = class14.field159[var1];
            class12 var3 = class255.field3856[var2];
            if (var3 != null) {
                class261.method1791(128, var3.field137.field1738, var3);
            }
        }
        if (arg0 != 89) {
            method537((String) null, -126);
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(Ljava/lang/String;I)I")
    public static final int method537(String arg0, int arg1) {
        ++field1124;
        int var2 = arg0.length();
        int var3 = 0;
        for (int var4 = 0; var2 > var4; ++var4) {
            var3 = class204.method1445(arg0.charAt(var4), 90) + (var3 << 5) + -var3;
        }
        int var5 = 65 % ((arg1 - -37) / 58);
        return var3;
    }

    @OriginalMember(owner = "client!m", name = "d", descriptor = "(B)V")
    public static void method538(byte arg0) {
        if (arg0 != -75) {
            method536((byte) -37);
        }
        field1131 = null;
        field1133 = null;
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(Lhc;II)V")
    public final void method40(class53 arg0, int arg1, int arg2) {
        if (arg2 != 25645) {
            method536((byte) 2);
        }
        if (~arg1 != -1) {
            if (arg1 != 1) {
                if (~arg1 == -3) {
                    this.field1134 = arg0.method366(arg2 + -42150);
                }
            } else {
                this.field1129 = arg0.method331(-97);
            }
        } else {
            this.field1126 = arg0.method366(-16505);
        }
        ++field1127;
    }

    @OriginalMember(owner = "client!m", name = "<init>", descriptor = "()V")
    public class71() {
        super(0, true);
    }

    @OriginalMember(owner = "client!m", name = "f", descriptor = "(I)V")
    private final void method539(int arg0) {
        ++field1120;
        this.field1130 = new int[this.field1126 - -1];
        this.field1123 = new int[this.field1126 - -1];
        int var2 = 0;
        int var3 = 4096 / this.field1126;
        int var4 = this.field1129 * var3 >> 12;
        int var5 = 0;
        if (arg0 > 9) {
            while (~this.field1126 < ~var5) {
                this.field1130[var5] = var2;
                this.field1123[var5] = var2 - -var4;
                var2 += var3;
                ++var5;
            }
            this.field1130[this.field1126] = 4096;
            this.field1123[this.field1126] = this.field1123[0] + 4096;
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(IIIIILff;IJZ)Z")
    public static final boolean method540(int arg0, int arg1, int arg2, int arg3, int arg4, class4 arg5, int arg6, long arg7, boolean arg8) {
        if (arg5 == null) {
            return true;
        } else {
            int var10 = arg1 - arg4;
            int var11 = arg2 - arg4;
            int var12 = arg1 + arg4;
            int var13 = arg2 + arg4;
            if (arg8) {
                if (arg6 > 640 && arg6 < 1408) {
                    var13 += 128;
                }
                if (arg6 > 1152 && arg6 < 1920) {
                    var12 += 128;
                }
                if (arg6 > 1664 || arg6 < 384) {
                    var11 -= 128;
                }
                if (arg6 > 128 && arg6 < 896) {
                    var10 -= 128;
                }
            }
            int var14 = var10 / 128;
            int var15 = var11 / 128;
            int var16 = var12 / 128;
            int var17 = var13 / 128;
            return class1.method1(arg0, var14, var15, var16 - var14 + 1, var17 - var15 + 1, arg1, arg2, arg3, arg5, arg6, true, arg7);
        }
    }
}
