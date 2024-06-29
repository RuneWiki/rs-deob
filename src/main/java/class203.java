import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vn")
public class class203 extends class42 {

    @OriginalMember(owner = "client!vn", name = "r", descriptor = "I")
    public int field2808 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!vn", name = "s", descriptor = "I")
    public int field2809 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!vn", name = "q", descriptor = "I")
    public int field2807 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!vn", name = "w", descriptor = "I")
    public int field2813 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!vn", name = "p", descriptor = "I")
    public int field2806 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!vn", name = "u", descriptor = "I")
    public int field2811 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!vn", name = "x", descriptor = "I")
    public int field2814 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!vn", name = "C", descriptor = "I")
    public int field2819 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!vn", name = "o", descriptor = "Ltk;")
    public class228 field2805;

    @OriginalMember(owner = "client!vn", name = "z", descriptor = "I")
    public static int field2816;

    @OriginalMember(owner = "client!vn", name = "y", descriptor = "Lra;")
    public static class70 field2815;

    @OriginalMember(owner = "client!vn", name = "E", descriptor = "Lff;")
    public static class9 field2821;

    @OriginalMember(owner = "client!vn", name = "n", descriptor = "I")
    public static int field2804;

    @OriginalMember(owner = "client!vn", name = "t", descriptor = "I")
    public static int field2810;

    @OriginalMember(owner = "client!vn", name = "v", descriptor = "I")
    public static int field2812;

    @OriginalMember(owner = "client!vn", name = "A", descriptor = "I")
    public static int field2817;

    @OriginalMember(owner = "client!vn", name = "D", descriptor = "I")
    public static int field2820;

    @OriginalMember(owner = "client!vn", name = "B", descriptor = "[[[J")
    public static long[][][] field2818;

    static {
        new class304("To use this item please login to a members' server.", "Du musst auf einer Mitglieder-Welt sein, um diesen Gegenstand zu benutzen.", "Veuillez vous connecter à un serveur d'abonnés pour utiliser cet objet.", "Acesse um servidor para membros para usar este objeto.");
        field2816 = 0;
        field2815 = new class70(2, 4, 4, 0);
        field2821 = new class9(50, 7);
    }

    @OriginalMember(owner = "client!vn", name = "b", descriptor = "(Z)V", line = 3)
    public static void method1303(boolean arg0) {
        field2821 = null;
        field2818 = null;
        field2815 = null;
        if (!arg0) {
            method1303(true);
        }
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(ZILcr;IB)V", line = 21)
    public static final void method1304(boolean arg0, int arg1, class403 arg2, int arg3, byte arg4) {
        field2810++;
        int var5 = arg2.field5450;
        if (arg2.field5467 == 0) {
            arg2.field5450 = arg2.field5536;
        } else if (arg2.field5467 == 1) {
            arg2.field5450 = arg3 - arg2.field5536;
        } else if (arg2.field5467 == 2) {
            arg2.field5450 = arg2.field5536 * arg3 >> 14;
        }
        int var6 = arg2.field5404;
        if (arg4 < 79) {
            field2821 = null;
        }
        if (arg2.field5563 == 0) {
            arg2.field5404 = arg2.field5432;
        } else if (arg2.field5563 == 1) {
            arg2.field5404 = arg1 - arg2.field5432;
        } else if (arg2.field5563 == 2) {
            arg2.field5404 = arg2.field5432 * arg1 >> 14;
        }
        if (arg2.field5467 == 4) {
            arg2.field5450 = arg2.field5451 * arg2.field5404 / arg2.field5474;
        }
        if (arg2.field5563 == 4) {
            arg2.field5404 = arg2.field5474 * arg2.field5450 / arg2.field5451;
        }
        if (class299.field3964 && (client.method1255(arg2).field4714 != 0 || arg2.field5480 == 0)) {
            if (arg2.field5404 < 5 && arg2.field5450 < 5) {
                arg2.field5404 = 5;
                arg2.field5450 = 5;
            } else {
                if (arg2.field5404 <= 0) {
                    arg2.field5404 = 5;
                }
                if (arg2.field5450 <= 0) {
                    arg2.field5450 = 5;
                }
            }
        }
        if (class430.field5890 == arg2.field5468) {
            class112.field1596 = arg2;
        }
        if (arg0 && arg2.field5464 != null && arg2.field5450 != var5 || arg2.field5404 != var6) {
            class353 var7 = new class353();
            var7.field4772 = arg2.field5464;
            var7.field4770 = arg2;
            class55.field869.method1666((byte) -112, var7);
        }
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(III)Z", line = 98)
    public final boolean method1305(int arg0, int arg1, int arg2) {
        field2804++;
        if (this.field2813 <= arg1 && arg1 <= this.field2808 && this.field2809 <= arg0 && arg0 <= this.field2819) {
            return true;
        } else {
            if (arg2 != 255) {
                this.field2805 = null;
            }
            return this.field2811 <= arg1 && this.field2807 >= arg1 && this.field2806 <= arg0 && arg0 <= this.field2814;
        }
    }

    @OriginalMember(owner = "client!vn", name = "<init>", descriptor = "(Ltk;)V", line = 324)
    public class203(class228 arg0) {
        this.field2805 = arg0;
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(IILhq;)Z", line = 141)
    public static final boolean method1306(int arg0, int arg1, class108 arg2) {
        field2820++;
        if (arg0 != 4) {
            field2815 = null;
        }
        int var3 = arg2.method756(arg0 + 3, 2);
        if (var3 == 0) {
            if (arg2.method756(7, 1) != 0) {
                method1306(4, arg1, arg2);
            }
            int var4 = arg2.method756(7, 6);
            int var5 = arg2.method756(arg0 + 3, 6);
            boolean var6 = arg2.method756(7, 1) == 1;
            if (var6) {
                class191.field2695[class371.field4995++] = arg1;
            }
            if (class499.field6901[arg1] != null) {
                throw new RuntimeException("hr:lr");
            }
            class212 var7 = class449.field6120[arg1];
            class515 var8 = class499.field6901[arg1] = new class515();
            var8.field6170 = arg1;
            if (class406.field5589[arg1] != null) {
                var8.method3029(96, class406.field5589[arg1]);
            }
            var8.method2593(var7.field2880, false);
            var8.field6202 = var7.field2881;
            int var9 = var7.field2885;
            int var10 = var9 >> 28;
            int var11 = (var9 & 0x3FD7DA) >> 14;
            int var12 = var9 & 0xFF;
            var8.field7639 = var7.field2889;
            var8.field6265[0] = class150.field2133[arg1];
            var8.field573 = (byte) var10;
            var8.method3036((byte) 71, (var12 << 6) + var5 - class421.field5762, (var11 << 6) - -var4 - class401.field5382);
            var8.field7610 = false;
            class449.field6120[arg1] = null;
            return true;
        } else if (var3 == 1) {
            int var13 = arg2.method756(7, 2);
            int var14 = class449.field6120[arg1].field2885;
            class449.field6120[arg1].field2885 = ((var14 >> 28) + var13 & 0x3 << 28) + (var14 & 0xFFFFFFF);
            return false;
        } else if (var3 == 2) {
            int var15 = arg2.method756(7, 5);
            int var16 = var15 >> 3;
            int var17 = var15 & 0x7;
            int var18 = class449.field6120[arg1].field2885;
            int var19 = (var18 >> 28) + var16 & 0x3;
            int var20 = var18 >> 14 & 0xFF;
            int var21 = var18 & 0xFF;
            if (var17 == 0) {
                var20--;
                var21--;
            }
            if (var17 == 1) {
                var21--;
            }
            if (var17 == 2) {
                var21--;
                var20++;
            }
            if (var17 == 3) {
                var20--;
            }
            if (var17 == 4) {
                var20++;
            }
            if (var17 == 5) {
                var20--;
                var21++;
            }
            if (var17 == 6) {
                var21++;
            }
            if (var17 == 7) {
                var20++;
                var21++;
            }
            class449.field6120[arg1].field2885 = (var19 << 28) + (var20 << 14) + var21;
            return false;
        } else {
            int var22 = arg2.method756(arg0 ^ 0x3, 18);
            int var23 = var22 >> 16;
            int var24 = var22 >> 8 & 0xFF;
            int var25 = var22 & 0xFF;
            int var26 = class449.field6120[arg1].field2885;
            int var27 = (var26 >> 28) + var23 & 0x3;
            int var28 = (var26 >> 14) + var24 & 0xFF;
            int var29 = var25 + var26 & 0xFF;
            class449.field6120[arg1].field2885 = (var27 << 28) + (var28 << 14) + var29;
            return false;
        }
    }
}
