import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qc")
public class class526 {

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "Z")
    public boolean field7638 = true;

    @OriginalMember(owner = "client!qc", name = "k", descriptor = "I")
    public int field7647 = 128;

    @OriginalMember(owner = "client!qc", name = "g", descriptor = "I")
    private int field7643 = 0;

    @OriginalMember(owner = "client!qc", name = "p", descriptor = "I")
    public int field7652 = -1;

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "I")
    public static int field7637;

    @OriginalMember(owner = "client!qc", name = "c", descriptor = "I")
    public static int field7639;

    @OriginalMember(owner = "client!qc", name = "d", descriptor = "I")
    public static int field7640;

    @OriginalMember(owner = "client!qc", name = "e", descriptor = "I")
    public static int field7641;

    @OriginalMember(owner = "client!qc", name = "f", descriptor = "I")
    public int field7642;

    @OriginalMember(owner = "client!qc", name = "h", descriptor = "I")
    public int field7644;

    @OriginalMember(owner = "client!qc", name = "i", descriptor = "I")
    public static int field7645;

    @OriginalMember(owner = "client!qc", name = "j", descriptor = "I")
    public static int field7646;

    @OriginalMember(owner = "client!qc", name = "l", descriptor = "I")
    public static int field7648;

    @OriginalMember(owner = "client!qc", name = "m", descriptor = "I")
    public int field7649;

    @OriginalMember(owner = "client!qc", name = "n", descriptor = "I")
    public static int field7650;

    @OriginalMember(owner = "client!qc", name = "o", descriptor = "I")
    public int field7651;

    @OriginalMember(owner = "client!qc", name = "q", descriptor = "I")
    public static int field7653;

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", line = 5)
    public static final String method3108(int arg0, String arg1, String arg2, String arg3) {
        field7646++;
        if (arg0 == -1) {
            for (int var4 = arg1.indexOf(arg2); var4 != -1; var4 = arg1.indexOf(arg2, arg3.length() + var4)) {
                arg1 = arg1.substring(0, var4) + arg3 + arg1.substring(arg2.length() + var4);
            }
            return arg1;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(Lph;I)V", line = 28)
    public static final void method3109(class459 arg0, int arg1) {
        class102.field1946 = arg0;
        if (arg1 != 255) {
            method3109(null, 9);
        }
        field7639++;
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(Lnn;Z)V", line = 39)
    public final void method3110(class289 arg0, boolean arg1) {
        field7640++;
        while (true) {
            int var3 = arg0.method1858(-3256);
            if (var3 == 0) {
                if (arg1) {
                    method3109(null, 29);
                    return;
                } else {
                    return;
                }
            }
            this.method3114(var3, (byte) 82, arg0);
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(II)V", line = 65)
    private final void method3111(int arg0, int arg1) {
        field7650++;
        if (arg0 >= -4) {
            return;
        }
        double var3 = (double) (arg1 >> 16 & 0xFF) / 256.0D;
        double var5 = (double) (arg1 >> 8 & 0xFF) / 256.0D;
        double var7 = (double) (arg1 & 0xFF) / 256.0D;
        double var9 = var3;
        if (var5 < var3) {
            var9 = var5;
        }
        if (var7 < var9) {
            var9 = var7;
        }
        double var11 = var3;
        if (var3 < var5) {
            var11 = var5;
        }
        if (var11 < var7) {
            var11 = var7;
        }
        double var13 = 0.0D;
        double var15 = 0.0D;
        double var17 = (var9 + var11) / 2.0D;
        if (var9 != var11) {
            if (var17 < 0.5D) {
                var15 = (var11 - var9) / (var9 + var11);
            }
            if (var3 == var11) {
                var13 = (var5 - var7) / (var11 - var9);
            } else if (var5 == var11) {
                var13 = (var7 - var3) / (var11 - var9) + 2.0D;
            } else if (var7 == var11) {
                var13 = (var3 - var5) / (var11 - var9) + 4.0D;
            }
            if (var17 >= 0.5D) {
                var15 = (var11 - var9) / (2.0D - var11 - var9);
            }
        }
        this.field7651 = (int) (var17 * 256.0D);
        this.field7644 = (int) (var15 * 256.0D);
        double var19 = var13 / 6.0D;
        if (this.field7651 < 0) {
            this.field7651 = 0;
        } else if (this.field7651 > 255) {
            this.field7651 = 255;
        }
        if (this.field7644 < 0) {
            this.field7644 = 0;
        } else if (this.field7644 > 255) {
            this.field7644 = 255;
        }
        if (var17 > 0.5D) {
            this.field7649 = (int) ((1.0D - var17) * var15 * 512.0D);
        } else {
            this.field7649 = (int) (var15 * var17 * 512.0D);
        }
        if (this.field7649 < 1) {
            this.field7649 = 1;
        }
        this.field7642 = (int) ((double) this.field7649 * var19);
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(BILjava/lang/String;)V", line = 155)
    public static final void method3112(byte arg0, int arg1, String arg2) {
        field7641++;
        if (arg0 == -126) {
            class18 var3 = class140.method1047(2, arg1, false);
            var3.method122(true);
            var3.field301 = arg2;
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(IIIII)V", line = 170)
    public static final void method3113(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field7645++;
        int var5 = arg2;
        int var6 = arg0;
        int var7 = -arg0;
        int var8 = -1;
        class503.method3027(arg1 - arg0, (byte) 127, arg0 + arg1, arg4, class316.field4797[arg3]);
        while (var6 > var5) {
            var8 += 2;
            var5++;
            var7 += var8;
            if (var7 >= 0) {
                var6--;
                var7 -= var6 << 1;
                int[] var9 = class316.field4797[arg3 + var6];
                int[] var10 = class316.field4797[arg3 - var6];
                int var11 = arg1 + var5;
                int var12 = arg1 - var5;
                class503.method3027(var12, (byte) 127, var11, arg4, var9);
                class503.method3027(var12, (byte) 127, var11, arg4, var10);
            }
            int var13 = arg1 + var6;
            int var14 = arg1 - var6;
            int[] var15 = class316.field4797[arg3 + var5];
            int[] var16 = class316.field4797[arg3 - var5];
            class503.method3027(var14, (byte) 127, var13, arg4, var15);
            class503.method3027(var14, (byte) 127, var13, arg4, var16);
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(IBLnn;)V", line = 235)
    private final void method3114(int arg0, byte arg1, class289 arg2) {
        field7648++;
        if (arg0 == 1) {
            this.field7643 = arg2.method1863(109);
            this.method3111(-76, this.field7643);
        } else if (arg0 == 2) {
            this.field7652 = arg2.method1841((byte) 14);
            if (this.field7652 == 65535) {
                this.field7652 = -1;
            }
        } else if (arg0 == 3) {
            this.field7647 = arg2.method1841((byte) 81) << 0;
        } else if (arg0 == 4) {
            this.field7638 = false;
        }
        if (arg1 <= 38) {
            this.field7652 = -86;
        }
    }
}
