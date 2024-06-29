import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ws")
public class class241 extends class435 {

    @OriginalMember(owner = "client!ws", name = "w", descriptor = "I")
    private int field3189;

    @OriginalMember(owner = "client!ws", name = "l", descriptor = "I")
    private int field3178;

    @OriginalMember(owner = "client!ws", name = "y", descriptor = "I")
    public int field3191;

    @OriginalMember(owner = "client!ws", name = "v", descriptor = "I")
    private int field3188;

    @OriginalMember(owner = "client!ws", name = "o", descriptor = "I")
    public int field3181;

    @OriginalMember(owner = "client!ws", name = "m", descriptor = "I")
    public int field3179;

    @OriginalMember(owner = "client!ws", name = "x", descriptor = "I")
    private int field3190;

    @OriginalMember(owner = "client!ws", name = "q", descriptor = "I")
    private int field3183;

    @OriginalMember(owner = "client!ws", name = "s", descriptor = "I")
    public int field3185;

    @OriginalMember(owner = "client!ws", name = "B", descriptor = "Ljava/util/Random;")
    public static Random field3194 = new Random();

    @OriginalMember(owner = "client!ws", name = "C", descriptor = "Lao;")
    public static class191 field3195 = new class191(49, 12);

    @OriginalMember(owner = "client!ws", name = "n", descriptor = "I")
    public static int field3180;

    @OriginalMember(owner = "client!ws", name = "p", descriptor = "I")
    public static int field3182;

    @OriginalMember(owner = "client!ws", name = "r", descriptor = "I")
    public static int field3184;

    @OriginalMember(owner = "client!ws", name = "t", descriptor = "I")
    public static int field3186;

    @OriginalMember(owner = "client!ws", name = "u", descriptor = "I")
    public static int field3187;

    @OriginalMember(owner = "client!ws", name = "z", descriptor = "I")
    public static int field3192;

    @OriginalMember(owner = "client!ws", name = "A", descriptor = "I")
    public static int field3193;

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "(Lkh;II)V")
    public static final void method1502(class13 arg0, int arg1, int arg2) {
        if (arg1 != 27160) {
            method1502(null, 35, -105);
        }
        field3186++;
        boolean var3 = arg0.method80(1, 255) == 1;
        if (var3) {
            class407.field5847[class154.field2019++] = arg2;
        }
        int var4 = arg0.method80(2, 255);
        class531 var5 = class29.field272[arg2];
        if (var4 == 0) {
            if (var3) {
                var5.field7799 = false;
            } else if (class308.field4121 == arg2) {
                throw new RuntimeException("s:lr");
            } else {
                class228 var6 = class362.field4936[arg2] = new class228();
                var6.field3073 = (var5.field3695 << 28) - (-(var5.field1249[0] + class357.field4867 >> 6 << 14) - (var5.field1251[0] + class418.field6074 >> 6));
                if (var5.field7819 == -1) {
                    var6.field3076 = var5.field1231.method615(arg1 - 27161);
                } else {
                    var6.field3076 = var5.field7819;
                }
                var6.field3074 = var5.field1156;
                var6.field3071 = var5.field7803;
                if (var5.field7801 > 0) {
                    class99.method607(var5, (byte) 74);
                }
                class29.field272[arg2] = null;
                if (arg0.method80(1, 255) != 0) {
                    class252.method1565(-12971, arg2, arg0);
                }
            }
        } else if (var4 == 1) {
            int var7 = arg0.method80(3, 255);
            int var8 = var5.field1249[0];
            int var9 = var5.field1251[0];
            if (var7 == 0) {
                var9--;
                var8--;
            } else if (var7 == 1) {
                var9--;
            } else if (var7 == 2) {
                var9--;
                var8++;
            } else if (var7 == 3) {
                var8--;
            } else if (var7 == 4) {
                var8++;
            } else if (var7 == 5) {
                var8--;
                var9++;
            } else if (var7 == 6) {
                var9++;
            } else if (var7 == 7) {
                var8++;
                var9++;
            }
            if (var3) {
                var5.field7815 = var8;
                var5.field7794 = var9;
                var5.field7799 = true;
            } else {
                var5.method3154(-48, var8, var9, class447.field6522[arg2]);
            }
        } else if (var4 == 2) {
            int var10 = arg0.method80(4, arg1 ^ 0x6AE7);
            int var11 = var5.field1249[0];
            int var12 = var5.field1251[0];
            if (var10 == 0) {
                var11 -= 2;
                var12 -= 2;
            } else if (var10 == 1) {
                var11--;
                var12 -= 2;
            } else if (var10 == 2) {
                var12 -= 2;
            } else if (var10 == 3) {
                var11++;
                var12 -= 2;
            } else if (var10 == 4) {
                var11 += 2;
                var12 -= 2;
            } else if (var10 == 5) {
                var12--;
                var11 -= 2;
            } else if (var10 == 6) {
                var12--;
                var11 += 2;
            } else if (var10 == 7) {
                var11 -= 2;
            } else if (var10 == 8) {
                var11 += 2;
            } else if (var10 == 9) {
                var11 -= 2;
                var12++;
            } else if (var10 == 10) {
                var12++;
                var11 += 2;
            } else if (var10 == 11) {
                var12 += 2;
                var11 -= 2;
            } else if (var10 == 12) {
                var12 += 2;
                var11--;
            } else if (var10 == 13) {
                var12 += 2;
            } else if (var10 == 14) {
                var12 += 2;
                var11++;
            } else if (var10 == 15) {
                var12 += 2;
                var11 += 2;
            }
            if (var3) {
                var5.field7815 = var11;
                var5.field7799 = true;
                var5.field7794 = var12;
            } else {
                var5.method3154(-71, var11, var12, class447.field6522[arg2]);
            }
        } else {
            int var13 = arg0.method80(1, 255);
            if (var13 == 0) {
                int var14 = arg0.method80(12, 255);
                int var15 = var14 >> 10;
                int var16 = (var14 & 0x3E5) >> 5;
                if (var16 > 15) {
                    var16 -= 32;
                }
                int var17 = var14 & 0x1F;
                if (var17 > 15) {
                    var17 -= 32;
                }
                int var18 = var5.field1249[0] + var16;
                int var19 = var5.field1251[0] + var17;
                if (var3) {
                    var5.field7794 = var19;
                    var5.field7799 = true;
                    var5.field7815 = var18;
                } else {
                    var5.method3154(89, var18, var19, class447.field6522[arg2]);
                }
                var5.field3695 = (byte) (var5.field3695 + var15 & 0x3);
                if (class308.field4121 == arg2) {
                    class210.field2808 = var5.field3695;
                }
            } else {
                int var20 = arg0.method80(30, 255);
                int var21 = var20 >> 28;
                int var22 = (var20 & 0xFFFF39C) >> 14;
                int var23 = var20 & 0x3FFF;
                int var24 = (class357.field4867 + var22 + var5.field1249[0] & 0x3FFF) - class357.field4867;
                int var25 = (var5.field1251[0] + class418.field6074 + var23 & 0x3FFF) - class418.field6074;
                if (var3) {
                    var5.field7815 = var24;
                    var5.field7794 = var25;
                    var5.field7799 = true;
                } else {
                    var5.method3154(arg1 ^ 0xFFFF95B0, var24, var25, class447.field6522[arg2]);
                }
                var5.field3695 = (byte) (var5.field3695 + var21 & 0x3);
                if (class308.field4121 == arg2) {
                    class210.field2808 = var5.field3695;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "(Z[III)V")
    public final void method1503(boolean arg0, int[] arg1, int arg2, int arg3) {
        arg1[0] = this.field3178;
        field3180++;
        if (!arg0) {
            this.field3188 = -38;
        }
        arg1[1] = arg3 + this.field3183 - this.field3185;
        arg1[2] = arg2 + this.field3188 - this.field3179;
    }

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "(B)V")
    public static void method1504(byte arg0) {
        field3195 = null;
        int var1 = 90 / ((arg0 - 7) / 33);
        field3194 = null;
    }

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "(III)Z")
    public final boolean method1505(int arg0, int arg1, int arg2) {
        int var4 = 91 / ((67 - arg2) / 44);
        field3182++;
        return arg0 >= this.field3185 && arg0 <= this.field3181 && arg1 >= this.field3179 && this.field3191 >= arg1;
    }

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "(ZII)I")
    public static final int method1506(boolean arg0, int arg1, int arg2) {
        field3187++;
        if (!arg0) {
            method1504((byte) -48);
        }
        if (arg2 == -1) {
            return 12345678;
        }
        int var3 = (arg2 & 0x7F) * arg1 >> 7;
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        return (arg2 & 0xFF80) + var3;
    }

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "(III[I)V")
    public final void method1507(int arg0, int arg1, int arg2, int[] arg3) {
        arg3[0] = 0;
        arg3[1] = this.field3185 + arg2 - this.field3183;
        if (arg0 <= 29) {
            this.method1505(57, -19, -2);
        }
        field3193++;
        arg3[2] = this.field3179 + arg1 - this.field3188;
    }

    @OriginalMember(owner = "client!ws", name = "b", descriptor = "(III)Z")
    public final boolean method1508(int arg0, int arg1, int arg2) {
        int var4 = 90 / ((arg0 - 67) / 55);
        field3184++;
        return arg1 >= this.field3183 && this.field3189 >= arg1 && this.field3188 <= arg2 && this.field3190 >= arg2;
    }

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "(IIII)Z")
    public final boolean method1509(int arg0, int arg1, int arg2, int arg3) {
        int var5 = -38 / ((arg3 + 13) / 35);
        field3192++;
        return this.field3178 == arg0 && this.field3183 <= arg2 && arg2 <= this.field3189 && this.field3188 <= arg1 && this.field3190 >= arg1;
    }

    @OriginalMember(owner = "client!ws", name = "<init>", descriptor = "(IIIIIIIII)V")
    public class241(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        this.field3189 = arg3;
        this.field3178 = arg0;
        this.field3191 = arg8;
        this.field3188 = arg2;
        this.field3181 = arg7;
        this.field3179 = arg6;
        this.field3190 = arg4;
        this.field3183 = arg1;
        this.field3185 = arg5;
    }
}
