import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vk")
public class class162 extends class326 {

    @OriginalMember(owner = "client!vk", name = "O", descriptor = "I")
    private int field2622 = 81;

    @OriginalMember(owner = "client!vk", name = "Q", descriptor = "I")
    private int field2624 = 8;

    @OriginalMember(owner = "client!vk", name = "S", descriptor = "I")
    private int field2626 = 409;

    @OriginalMember(owner = "client!vk", name = "Z", descriptor = "I")
    private int field2633 = 1024;

    @OriginalMember(owner = "client!vk", name = "db", descriptor = "I")
    private int field2637 = 4;

    @OriginalMember(owner = "client!vk", name = "eb", descriptor = "I")
    private int field2638 = 1024;

    @OriginalMember(owner = "client!vk", name = "V", descriptor = "I")
    private int field2629 = 204;

    @OriginalMember(owner = "client!vk", name = "cb", descriptor = "I")
    private int field2636 = 0;

    @OriginalMember(owner = "client!vk", name = "K", descriptor = "[La;")
    public static class281[] field2618 = new class281[14];

    @OriginalMember(owner = "client!vk", name = "fb", descriptor = "Lvl;")
    public static class6 field2639 = new class6(new byte[5000]);

    @OriginalMember(owner = "client!vk", name = "gb", descriptor = "I")
    public static int field2640 = 0;

    @OriginalMember(owner = "client!vk", name = "J", descriptor = "I")
    public static int field2617;

    @OriginalMember(owner = "client!vk", name = "M", descriptor = "I")
    public static int field2620;

    @OriginalMember(owner = "client!vk", name = "N", descriptor = "I")
    public static int field2621;

    @OriginalMember(owner = "client!vk", name = "P", descriptor = "I")
    private int field2623;

    @OriginalMember(owner = "client!vk", name = "T", descriptor = "I")
    private int field2627;

    @OriginalMember(owner = "client!vk", name = "U", descriptor = "I")
    public static int field2628;

    @OriginalMember(owner = "client!vk", name = "W", descriptor = "I")
    public static int field2630;

    @OriginalMember(owner = "client!vk", name = "X", descriptor = "I")
    public static int field2631;

    @OriginalMember(owner = "client!vk", name = "ab", descriptor = "I")
    private int field2634;

    @OriginalMember(owner = "client!vk", name = "bb", descriptor = "I")
    public static int field2635;

    @OriginalMember(owner = "client!vk", name = "L", descriptor = "[I")
    private int[] field2619;

    @OriginalMember(owner = "client!vk", name = "Y", descriptor = "[Luj;")
    public static class169[] field2632;

    @OriginalMember(owner = "client!vk", name = "I", descriptor = "[[I")
    private int[][] field2616;

    @OriginalMember(owner = "client!vk", name = "R", descriptor = "[[I")
    private int[][] field2625;

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(II)[I", line = 5)
    public final int[] method103(int arg0, int arg1) {
        field2621++;
        int[] var3 = this.field5112.method1648(arg1, -16687);
        if (this.field5112.field3583) {
            int var4 = 0;
            int var5;
            for (var5 = class34.field508[arg1] + this.field2636; var5 < 0; var5 += 4096) {
            }
            while (var5 > 4096) {
                var5 -= 4096;
            }
            while (this.field2624 > var4 && var5 >= this.field2619[var4]) {
                var4++;
            }
            boolean var6 = (var4 & 0x1) == 0;
            int var7 = var4 - 1;
            int var8 = this.field2619[var4];
            int var9 = this.field2619[var4 - 1];
            if (var5 > (this.field2634 + var9) && var5 < var8 - this.field2634) {
                for (int var10 = 0; var10 < class166.field2731; var10++) {
                    int var11 = 0;
                    int var12 = var6 ? this.field2633 : -this.field2633;
                    int var13;
                    for (var13 = (this.field2627 * var12 >> 12) + class110.field1527[var10]; var13 < 0; var13 += 4096) {
                    }
                    while (var13 > 4096) {
                        var13 -= 4096;
                    }
                    while (var11 < this.field2637 && var13 >= this.field2625[var7][var11]) {
                        var11++;
                    }
                    int var14 = var11 - 1;
                    int var15 = this.field2625[var7][var11];
                    int var16 = this.field2625[var7][var14];
                    if (this.field2634 + var16 < var13 && (var15 - this.field2634) > var13) {
                        var3[var10] = this.field2616[var7][var14];
                    } else {
                        var3[var10] = 0;
                    }
                }
            } else {
                class54.method425(var3, 0, class166.field2731, 0);
            }
        }
        return arg0 >= -25 ? (int[]) null : var3;
    }

    @OriginalMember(owner = "client!vk", name = "<init>", descriptor = "()V", line = 103)
    public class162() {
        super(0, true);
    }

    @OriginalMember(owner = "client!vk", name = "f", descriptor = "(B)V", line = 110)
    public static void method1206(byte arg0) {
        field2639 = null;
        if (arg0 != -85) {
            field2639 = (class6) null;
        }
        field2632 = null;
        field2618 = null;
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(Z)I", line = 128)
    public static final int method1207(boolean arg0) {
        field2630++;
        if (!arg0) {
            method1207(true);
        }
        if (class47.field616) {
            return 0;
        } else if (class154.method1119((byte) 16)) {
            return class317.field5019 ? 2 : 1;
        } else {
            return 1;
        }
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(Ltb;Z)V", line = 145)
    public static final void method1208(class177 arg0, boolean arg1) {
        if (arg0.field2897 != null) {
            arg0.field2897.field3585 = 0;
        }
        field2631++;
        arg0.field2896 = false;
        if (!arg1) {
            method1206((byte) -23);
        }
        for (class177 var2 = arg0.method187(); var2 != null; var2 = arg0.method178()) {
            method1208(var2, true);
        }
    }

    @OriginalMember(owner = "client!vk", name = "d", descriptor = "(I)V", line = 171)
    private final void method1209(int arg0) {
        field2617++;
        int var2 = -102 / ((arg0 - 30) / 38);
        Random var3 = new Random((long) this.field2624);
        this.field2627 = 4096 / this.field2637;
        this.field2619 = new int[this.field2624 + 1];
        this.field2634 = this.field2622 / 2;
        this.field2625 = new int[this.field2624][this.field2637 + 1];
        this.field2619[0] = 0;
        this.field2623 = 4096 / this.field2624;
        int var4 = this.field2623 / 2;
        this.field2616 = new int[this.field2624][this.field2637];
        int var5 = this.field2627 / 2;
        for (int var6 = 0; var6 < this.field2624; var6++) {
            if (var6 > 0) {
                int var7 = this.field2623;
                int var8 = (class207.method1523(4096, -109, var3) - 2048) * this.field2629 >> 12;
                int var9 = (var4 * var8 >> 12) + var7;
                this.field2619[var6] = this.field2619[var6 - 1] + var9;
            }
            this.field2625[var6][0] = 0;
            for (int var10 = 0; var10 < this.field2637; var10++) {
                if (var10 > 0) {
                    int var11 = this.field2627;
                    int var12 = (class207.method1523(4096, -124, var3) - 2048) * this.field2626 >> 12;
                    int var13 = (var5 * var12 >> 12) + var11;
                    this.field2625[var6][var10] = this.field2625[var6][var10 - 1] + var13;
                }
                this.field2616[var6][var10] = this.field2638 <= 0 ? 4096 : 4096 - class207.method1523(this.field2638, -126, var3);
            }
            this.field2625[var6][this.field2637] = 4096;
        }
        this.field2619[this.field2624] = 4096;
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(IIIII)Z", line = 242)
    public static final boolean method1210(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = class60.field888 * arg3 + class57.field798 * arg0 >> 16;
        int var6 = class57.field798 * arg3 - class60.field888 * arg0 >> 16;
        int var7 = class199.field3176 * var6 + class102.field1360 * arg1 >> 16;
        int var8 = class199.field3176 * arg1 - class102.field1360 * var6 >> 16;
        if (var7 < 1) {
            var7 = 1;
        }
        int var9 = (var5 << 9) / var7;
        int var10 = (var8 << 9) / var7;
        int var11 = class199.field3176 * var6 + class102.field1360 * arg2 >> 16;
        int var12 = class199.field3176 * arg2 - class102.field1360 * var6 >> 16;
        if (var11 < 1) {
            var11 = 1;
        }
        int var13 = (var5 << 9) / var11;
        int var14 = (var12 << 9) / var11;
        if (var7 < 50 && var11 < 50) {
            return false;
        } else if (var7 > arg4 && var11 > arg4) {
            return false;
        } else if (var9 < class11.field206 && var13 < class11.field206) {
            return false;
        } else if (var9 > class259.field4074 && var13 > class259.field4074) {
            return false;
        } else if (var10 < class306.field4781 && var14 < class306.field4781) {
            return false;
        } else {
            return var10 <= class249.field3925 || var14 <= class249.field3925;
        }
    }

    @OriginalMember(owner = "client!vk", name = "e", descriptor = "(B)V", line = 298)
    public final void method99(byte arg0) {
        if (arg0 == 31) {
            this.method1209(arg0 ^ 0x44);
            field2628++;
        }
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(IZLvl;)V", line = 309)
    public final void method98(int arg0, boolean arg1, class6 arg2) {
        if (arg1) {
            method1206((byte) -6);
        }
        if (arg0 == 0) {
            this.field2637 = arg2.method58(-288140008);
        } else if (arg0 == 1) {
            this.field2624 = arg2.method58(-288140008);
        } else if (arg0 == 2) {
            this.field2626 = arg2.method39((byte) 58);
        } else if (arg0 == 3) {
            this.field2629 = arg2.method39((byte) 111);
        } else if (arg0 == 4) {
            this.field2633 = arg2.method39((byte) 120);
        } else if (arg0 == 5) {
            this.field2636 = arg2.method39((byte) 78);
        } else if (arg0 == 6) {
            this.field2622 = arg2.method39((byte) 74);
        } else if (arg0 == 7) {
            this.field2638 = arg2.method39((byte) 64);
        }
        field2635++;
    }
}
