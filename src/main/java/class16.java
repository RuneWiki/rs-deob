import java.awt.event.KeyEvent;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rj")
public class class16 extends class39 {

    @OriginalMember(owner = "client!rj", name = "C", descriptor = "Llc;")
    public static class143 field281 = class66.method374("Liste des mises -9 jour charg-Be", -1);

    @OriginalMember(owner = "client!rj", name = "B", descriptor = "Ljava/util/Random;")
    public static Random field280 = new Random();

    @OriginalMember(owner = "client!rj", name = "A", descriptor = "I")
    public static int field279;

    @OriginalMember(owner = "client!rj", name = "E", descriptor = "I")
    public static int field283;

    @OriginalMember(owner = "client!rj", name = "J", descriptor = "I")
    public static int field286;

    @OriginalMember(owner = "client!rj", name = "K", descriptor = "I")
    public static int field287;

    @OriginalMember(owner = "client!rj", name = "L", descriptor = "I")
    public static int field288;

    @OriginalMember(owner = "client!rj", name = "I", descriptor = "Lia;")
    public static class181 field285;

    @OriginalMember(owner = "client!rj", name = "G", descriptor = "[I")
    public static int[] field284;

    @OriginalMember(owner = "client!rj", name = "D", descriptor = "[Lbc;")
    public static class100[] field282;

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(ILjava/awt/event/KeyEvent;)I")
    public static final int method119(int arg0, KeyEvent arg1) {
        field286++;
        if (arg0 != 12959) {
            field282 = null;
        }
        int var2 = arg1.getKeyChar();
        if (var2 == 8364) {
            return 128;
        } else {
            if (var2 <= 0 || var2 >= 256) {
                var2 = -1;
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!rj", name = "f", descriptor = "(I)V")
    public static final void method120(int arg0) {
        field279++;
        int var1 = class155.field2793 * 128 + 64;
        int var2 = class245.field4389 * 128 + 64;
        int var3 = class20.method140(var1, arg0 + 26727, var2, class170.field3044) - class168.field3003;
        if (class247.field4441 >= 100) {
            class167.field2992 = class155.field2793 * 128 + 64;
            class154.field2776 = class245.field4389 * 128 + 64;
            class92.field1658 = class20.method140(class167.field2992, 106, class154.field2776, class170.field3044) - class168.field3003;
        } else {
            if (class92.field1658 < var3) {
                class92.field1658 += (var3 - class92.field1658) * class247.field4441 / 1000 + class66.field1231;
                if (var3 < class92.field1658) {
                    class92.field1658 = var3;
                }
            }
            if (class167.field2992 < var1) {
                class167.field2992 += (var1 - class167.field2992) * class247.field4441 / 1000 + class66.field1231;
                if (class167.field2992 > var1) {
                    class167.field2992 = var1;
                }
            }
            if (var3 < class92.field1658) {
                class92.field1658 -= (class92.field1658 - var3) * class247.field4441 / 1000 + class66.field1231;
                if (var3 > class92.field1658) {
                    class92.field1658 = var3;
                }
            }
            if (class154.field2776 < var2) {
                class154.field2776 += class66.field1231 + ((var2 - class154.field2776) * class247.field4441 / 1000);
                if (var2 < class154.field2776) {
                    class154.field2776 = var2;
                }
            }
            if (var1 < class167.field2992) {
                class167.field2992 -= class66.field1231 + ((class167.field2992 - var1) * class247.field4441 / 1000);
                if (var1 > class167.field2992) {
                    class167.field2992 = var1;
                }
            }
            if (var2 < class154.field2776) {
                class154.field2776 -= (class154.field2776 - var2) * class247.field4441 / 1000 + class66.field1231;
                if (class154.field2776 < var2) {
                    class154.field2776 = var2;
                }
            }
        }
        int var4 = class218.field3985 * 128 + 64;
        int var5 = class206.field3751 * 128 + 64;
        int var6 = class20.method140(var5, 97, var4, class170.field3044) - class53.field1034;
        int var7 = var5 - class167.field2992;
        int var8 = var4 - class154.field2776;
        int var9 = var6 - class92.field1658;
        if (arg0 != -26650) {
            return;
        }
        int var10 = (int) Math.sqrt((double) (var7 * var7 + (var8 * var8)));
        int var11 = (int) (Math.atan2((double) var9, (double) var10) * 325.949D) & 0x7FF;
        if (var11 < 128) {
            var11 = 128;
        }
        if (var11 > 383) {
            var11 = 383;
        }
        int var12 = (int) (Math.atan2((double) var7, (double) var8) * -325.949D) & 0x7FF;
        int var13 = var12 - class148.field2729;
        if (class163.field2925 < var11) {
            class163.field2925 += (var11 - class163.field2925) * class240.field4335 / 1000 + class52.field1022;
            if (var11 < class163.field2925) {
                class163.field2925 = var11;
            }
        }
        if (class163.field2925 > var11) {
            class163.field2925 -= (class163.field2925 - var11) * class240.field4335 / 1000 + class52.field1022;
            if (class163.field2925 < var11) {
                class163.field2925 = var11;
            }
        }
        if (var13 > 1024) {
            var13 -= 2048;
        }
        if (var13 < -1024) {
            var13 += 2048;
        }
        if (var13 > 0) {
            class148.field2729 += class240.field4335 * var13 / 1000 + class52.field1022;
            class148.field2729 &= 0x7FF;
        }
        if (var13 < 0) {
            class148.field2729 -= class52.field1022 + (-var13 * class240.field4335 / 1000);
            class148.field2729 &= 0x7FF;
        }
        int var14 = var12 - class148.field2729;
        if (var14 > 1024) {
            var14 -= 2048;
        }
        if (var14 < -1024) {
            var14 += 2048;
        }
        if (var14 < 0 && var13 > 0 || var14 > 0 && var13 < 0) {
            class148.field2729 = var12;
        }
    }

    @OriginalMember(owner = "client!rj", name = "b", descriptor = "(B)V")
    public static final void method121(byte arg0) {
        class58.method339();
        int var1 = -31 % ((-arg0 - 85) / 39);
        for (int var2 = 0; var2 < 4; var2++) {
            class171.field3052[var2].method644((byte) -69);
        }
        field287++;
        System.gc();
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(ILfi;)V")
    public static final void method122(int arg0, class228 arg1) {
        field283++;
        arg1.field4133 = arg1.field4137;
        if (arg1.field4145 == 0) {
            arg1.field4136 = 0;
            return;
        }
        if (arg1.field4131 != -1 && arg1.field4156 == 0) {
            class104 var2 = class164.method1081(arg1.field4131, -21331);
            if (arg1.field4138 > 0 && var2.field1827 == 0) {
                arg1.field4136++;
                return;
            }
            if (arg1.field4138 <= 0 && var2.field1822 == 0) {
                arg1.field4136++;
                return;
            }
        }
        int var3 = arg1.field4178;
        int var4 = arg1.field4108;
        int var5 = arg1.field4148[arg1.field4145 - 1] * 128 + arg1.method218((byte) -122) * 64;
        int var6 = arg1.field4115[arg1.field4145 - 1] * 128 + arg1.method218((byte) -124) * 64;
        if ((var5 - var3) > 256 || (var5 - var3) < -256 || (var6 - var4) > 256 || var6 - var4 < -256) {
            arg1.field4108 = var6;
            arg1.field4178 = var5;
            return;
        }
        if (var3 >= var5) {
            if (var3 <= var5) {
                if (var4 < var6) {
                    arg1.field4168 = 1024;
                } else if (var4 > var6) {
                    arg1.field4168 = 0;
                }
            } else if (var4 < var6) {
                arg1.field4168 = 768;
            } else if (var6 < var4) {
                arg1.field4168 = 256;
            } else {
                arg1.field4168 = 512;
            }
        } else if (var6 > var4) {
            arg1.field4168 = 1280;
        } else if (var4 > var6) {
            arg1.field4168 = 1792;
        } else {
            arg1.field4168 = 1536;
        }
        int var7 = arg1.field4168 - arg1.field4183 & 0x7FF;
        if (var7 > 1024) {
            var7 -= 2048;
        }
        if (arg0 < 53) {
            method119(5, (KeyEvent) null);
        }
        int var8 = arg1.field4157;
        if (var7 >= -256 && var7 <= 256) {
            var8 = arg1.field4113;
        } else if (var7 >= 256 && var7 < 768) {
            var8 = arg1.field4141;
        } else if (var7 >= -768 && var7 <= -256) {
            var8 = arg1.field4142;
        }
        int var9 = 4;
        if (var8 == -1) {
            var8 = arg1.field4113;
        }
        arg1.field4133 = var8;
        boolean var10 = true;
        if (arg1 instanceof class187) {
            var10 = ((class187) arg1).field3384.field1562;
        }
        if (var10) {
            if (arg1.field4183 != arg1.field4168 && arg1.field4182 == -1 && arg1.field4125 != 0) {
                var9 = 2;
            }
            if (arg1.field4145 > 2) {
                var9 = 6;
            }
            if (arg1.field4145 > 3) {
                var9 = 8;
            }
            if (arg1.field4136 > 0 && arg1.field4145 > 1) {
                var9 = 8;
                arg1.field4136--;
            }
        } else {
            if (arg1.field4145 > 1) {
                var9 = 6;
            }
            if (arg1.field4145 > 2) {
                var9 = 8;
            }
            if (arg1.field4136 > 0 && arg1.field4145 > 1) {
                var9 = 8;
                arg1.field4136--;
            }
        }
        if (arg1.field4160[arg1.field4145 - 1]) {
            var9 <<= 0x1;
        }
        if (var4 < var6) {
            arg1.field4108 += var9;
            if (var6 < arg1.field4108) {
                arg1.field4108 = var6;
            }
        } else if (var6 < var4) {
            arg1.field4108 -= var9;
            if (var6 > arg1.field4108) {
                arg1.field4108 = var6;
            }
        }
        if (var5 > var3) {
            arg1.field4178 += var9;
            if (arg1.field4178 > var5) {
                arg1.field4178 = var5;
            }
        } else if (var5 < var3) {
            arg1.field4178 -= var9;
            if (arg1.field4178 < var5) {
                arg1.field4178 = var5;
            }
        }
        if (var9 >= 8 && arg1.field4133 == arg1.field4113 && arg1.field4171 != -1) {
            arg1.field4133 = arg1.field4171;
        }
        if (arg1.field4178 == var5 && arg1.field4108 == var6) {
            if (arg1.field4138 > 0) {
                arg1.field4138--;
            }
            arg1.field4145--;
        }
    }

    @OriginalMember(owner = "client!rj", name = "g", descriptor = "(I)V")
    public static void method123(int arg0) {
        field285 = null;
        field280 = null;
        field284 = null;
        field282 = null;
        if (arg0 != -1) {
            field285 = null;
        }
        field281 = null;
    }
}
