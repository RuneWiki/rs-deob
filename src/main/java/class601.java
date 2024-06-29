import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qd")
public abstract class class601 extends class337 {

    @OriginalMember(owner = "client!qd", name = "y", descriptor = "Z")
    public boolean field7646;

    @OriginalMember(owner = "client!qd", name = "s", descriptor = "[Lqd;")
    public class601[] field7640;

    @OriginalMember(owner = "client!qd", name = "q", descriptor = "Luw;")
    public static class208 field7638 = new class208(9, 2);

    @OriginalMember(owner = "client!qd", name = "E", descriptor = "Luw;")
    public static class208 field7652 = new class208(11, 2);

    @OriginalMember(owner = "client!qd", name = "l", descriptor = "I")
    public static int field7633;

    @OriginalMember(owner = "client!qd", name = "m", descriptor = "I")
    public static int field7634;

    @OriginalMember(owner = "client!qd", name = "n", descriptor = "I")
    public static int field7635;

    @OriginalMember(owner = "client!qd", name = "o", descriptor = "I")
    public static int field7636;

    @OriginalMember(owner = "client!qd", name = "p", descriptor = "I")
    public static int field7637;

    @OriginalMember(owner = "client!qd", name = "r", descriptor = "I")
    public static int field7639;

    @OriginalMember(owner = "client!qd", name = "t", descriptor = "I")
    public static int field7641;

    @OriginalMember(owner = "client!qd", name = "u", descriptor = "I")
    public static int field7642;

    @OriginalMember(owner = "client!qd", name = "w", descriptor = "I")
    public static int field7644;

    @OriginalMember(owner = "client!qd", name = "x", descriptor = "I")
    public static int field7645;

    @OriginalMember(owner = "client!qd", name = "B", descriptor = "I")
    public int field7649;

    @OriginalMember(owner = "client!qd", name = "C", descriptor = "I")
    public static int field7650;

    @OriginalMember(owner = "client!qd", name = "D", descriptor = "I")
    public static int field7651;

    @OriginalMember(owner = "client!qd", name = "A", descriptor = "Luja;")
    public static class190 field7648;

    @OriginalMember(owner = "client!qd", name = "v", descriptor = "Ltda;")
    public class357 field7643;

    @OriginalMember(owner = "client!qd", name = "z", descriptor = "Ljh;")
    public class651 field7647;

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(IB)[I", line = 11)
    public int[] method261(int arg0, byte arg1) {
        if (arg1 >= -76) {
            return null;
        } else {
            field7641++;
            throw new IllegalStateException("This operation does not have a monochrome output");
        }
    }

    @OriginalMember(owner = "client!qd", name = "b", descriptor = "(II)[[I", line = 24)
    public int[][] method638(int arg0, int arg1) {
        if (arg0 == 2017) {
            field7645++;
            throw new IllegalStateException("This operation does not have a colour output");
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(Lmc;II)V", line = 36)
    public void method259(class234 arg0, int arg1, int arg2) {
        field7644++;
        int var4 = -119 % ((arg2 - 40) / 52);
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(III)[I", line = 45)
    public final int[] method3243(int arg0, int arg1, int arg2) {
        field7642++;
        if (arg1 != 27123) {
            this.method259(null, -2, 30);
        }
        return this.field7640[arg2].field7646 ? this.field7640[arg2].method261(arg0, (byte) -118) : this.field7640[arg2].method638(2017, arg0)[0];
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(I)I", line = 69)
    public int method2039(int arg0) {
        field7651++;
        if (arg0 != -1) {
            field7648 = null;
        }
        return -1;
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(B)V", line = 80)
    public void method2038(byte arg0) {
        field7633++;
        if (this.field7646) {
            this.field7643.method2052(-125);
            this.field7643 = null;
        } else {
            this.field7647.method3513((byte) -116);
            this.field7647 = null;
        }
        int var2 = -51 / ((-arg0 - 47) / 58);
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(BLkj;Lha;Lek;)V", line = 110)
    public static final void method3244(byte arg0, class307 arg1, class570 arg2, class624 arg3) {
        field7637++;
        class772 var4 = arg3.method3342(-60, arg2);
        if (var4 == null) {
            return;
        }
        int var5 = var4.method620();
        if (var4.method612() > var5) {
            var5 = var4.method612();
        }
        byte var6 = 10;
        int var7 = arg1.field3855;
        int var8 = arg1.field3861;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        if (arg3.field7946 != null) {
            var9 = class364.field4453.method1058(arg3.field7946, null, class414.field5483, (byte) 119, null);
            for (int var12 = 0; var12 < var9; var12++) {
                String var13 = class414.field5483[var12];
                if ((var9 - 1) > var12) {
                    var13 = var13.substring(0, var13.length() - 4);
                }
                int var14 = class190.field2647.method3310(var13);
                if (var10 < var14) {
                    var10 = var14;
                }
            }
            var11 = var9 * class190.field2647.method3309() + class190.field2647.method3313() / 2;
        }
        int var15 = var5 / 2 + arg1.field3855;
        int var16 = arg1.field3861;
        if ((class402.field5358 + var5) > var7) {
            var15 = var10 / 2 + var5 / 2 + var6 + class402.field5358 + 5;
            var7 = class402.field5358;
        } else if (class402.field5345 - var5 < var7) {
            var15 = class402.field5345 - (var5 / 2) - var6 - (var10 / 2) - 5;
            var7 = class402.field5345 - var5;
        }
        if ((class402.field5344 + var5) > var8) {
            var16 = var5 / 2 + class402.field5344 + var6;
            var8 = class402.field5344;
        } else if (var8 > (class402.field5353 - var5)) {
            var8 = class402.field5353 - var5;
            var16 = class402.field5353 - (var5 / 2) - var11 - var6;
        }
        int var17 = (int) ((Math.atan2((double) (var7 - arg1.field3855), (double) (var8 - arg1.field3861)) / 3.141592653589793D) * 32767.0D) & 0xFFFF;
        var4.method4197((float) var5 / 2.0F + (float) var7, (float) var5 / 2.0F + (float) var8, 4096, var17);
        int var18 = -2;
        int var19 = -2;
        int var20 = -2;
        int var21 = -2;
        if (arg3.field7946 != null) {
            var19 = var16;
            var18 = var15 - (var10 / 2) - 5;
            var21 = class190.field2647.method3309() * var9 + var16 + 3;
            var20 = var18 + var10 + 10;
            if (arg3.field7921 != 0) {
                arg2.method3068(false, var18, var16, var20 - var18, arg3.field7921, var21 - var16);
            }
            if (arg3.field7940 != 0) {
                arg2.method3075(var18, var20 - var18, var21 - var16, (byte) 85, var16, arg3.field7940);
            }
            for (int var22 = 0; var22 < var9; var22++) {
                String var23 = class414.field5483[var22];
                if (var22 < (var9 - 1)) {
                    var23 = var23.substring(0, var23.length() - 4);
                }
                class190.field2647.method3311(arg2, var23, var15, var16, arg3.field7925, true);
                var16 += class190.field2647.method3309();
            }
        }
        if (arg0 <= 4 || arg3.field7941 == -1 && arg3.field7946 == null) {
            return;
        }
        class212 var24 = new class212(arg1);
        int var25 = var5 >> 1;
        var24.field2905 = var18;
        var24.field2915 = var19;
        var24.field2920 = var8 - var25;
        var24.field2916 = var7 + var25;
        var24.field2907 = var8 + var25;
        var24.field2919 = var21;
        var24.field2914 = var20;
        var24.field2912 = var7 - var25;
        class565.field7168.method3593(var24, 15);
    }

    @OriginalMember(owner = "client!qd", name = "b", descriptor = "(III)V", line = 255)
    public void method3245(int arg0, int arg1, int arg2) {
        field7634++;
        int var4 = this.field7649 == 255 ? arg0 : this.field7649;
        if (arg1 != 27046) {
            this.method261(-10, (byte) -12);
        }
        if (this.field7646) {
            this.field7643 = new class357(var4, arg0, arg2);
        } else {
            this.field7647 = new class651(var4, arg0, arg2);
        }
    }

    @OriginalMember(owner = "client!qd", name = "b", descriptor = "(I)V", line = 278)
    public static void method3246(int arg0) {
        field7648 = null;
        field7652 = null;
        if (arg0 <= 50) {
            field7652 = null;
        }
        field7638 = null;
    }

    @OriginalMember(owner = "client!qd", name = "b", descriptor = "(B)V", line = 291)
    public void method292(byte arg0) {
        if (arg0 < 44) {
            this.method259(null, -16, -56);
        }
        field7639++;
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(BII)[[I", line = 305)
    public final int[][] method3247(byte arg0, int arg1, int arg2) {
        field7636++;
        if (arg0 >= -87) {
            this.method2038((byte) -12);
        }
        if (this.field7640[arg1].field7646) {
            int[] var4 = this.field7640[arg1].method261(arg2, (byte) -100);
            return new int[][] { var4, var4, var4 };
        } else {
            return this.field7640[arg1].method638(2017, arg2);
        }
    }

    @OriginalMember(owner = "client!qd", name = "e", descriptor = "(I)I", line = 338)
    public int method3248(int arg0) {
        if (arg0 == 32727) {
            field7635++;
            return -1;
        } else {
            return 125;
        }
    }

    @OriginalMember(owner = "client!qd", name = "<init>", descriptor = "(IZ)V", line = 351)
    public class601(int arg0, boolean arg1) {
        this.field7646 = arg1;
        this.field7640 = new class601[arg0];
    }
}
