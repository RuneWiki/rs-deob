import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hr")
public class class491 {

    @OriginalMember(owner = "client!hr", name = "d", descriptor = "Z")
    public boolean field6616 = true;

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "I")
    private int field6613 = 0;

    @OriginalMember(owner = "client!hr", name = "g", descriptor = "I")
    public int field6619 = -1;

    @OriginalMember(owner = "client!hr", name = "o", descriptor = "I")
    public int field6627 = 512;

    @OriginalMember(owner = "client!hr", name = "h", descriptor = "F")
    public static float field6620;

    @OriginalMember(owner = "client!hr", name = "b", descriptor = "I")
    public static int field6614;

    @OriginalMember(owner = "client!hr", name = "c", descriptor = "I")
    public static int field6615;

    @OriginalMember(owner = "client!hr", name = "e", descriptor = "I")
    public static int field6617;

    @OriginalMember(owner = "client!hr", name = "f", descriptor = "I")
    public static int field6618;

    @OriginalMember(owner = "client!hr", name = "i", descriptor = "I")
    public int field6621;

    @OriginalMember(owner = "client!hr", name = "j", descriptor = "I")
    public static int field6622;

    @OriginalMember(owner = "client!hr", name = "k", descriptor = "I")
    public int field6623;

    @OriginalMember(owner = "client!hr", name = "l", descriptor = "I")
    public static int field6624;

    @OriginalMember(owner = "client!hr", name = "m", descriptor = "I")
    public int field6625;

    @OriginalMember(owner = "client!hr", name = "n", descriptor = "I")
    public static int field6626;

    @OriginalMember(owner = "client!hr", name = "p", descriptor = "I")
    public int field6628;

    @OriginalMember(owner = "client!hr", name = "q", descriptor = "Lq;")
    public static class397 field6629;

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(B)V", line = 5)
    public static void method2738(byte arg0) {
        if (arg0 != -29) {
            field6620 = -0.75374407F;
        }
        field6629 = null;
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(Lbi;III)Lo;", line = 16)
    public static final class28 method2739(class449 arg0, int arg1, int arg2, int arg3) {
        field6622++;
        if (arg3 <= 6) {
            return null;
        }
        class335 var4 = new class335(arg0.method2537(false, arg2, arg1));
        class28 var5 = new class28(arg1, var4.method2029((byte) -63), var4.method2029((byte) -64), var4.method2045(-98), var4.method2045(-98), var4.method2034(255) == 1, var4.method2034(255), var4.method2034(255));
        int var6 = var4.method2034(255);
        for (int var7 = 0; var7 < var6; var7++) {
            var5.field457.method3265(new class531(var4.method2034(255), var4.method2001((byte) -83), var4.method2001((byte) -83), var4.method2001((byte) -83), var4.method2001((byte) -83), var4.method2001((byte) -83), var4.method2001((byte) -83), var4.method2001((byte) -83), var4.method2001((byte) -83)), (byte) -96);
        }
        var5.method240(0);
        return var5;
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(IBLoa;IILe;I)V", line = 46)
    public static final void method2740(int arg0, byte arg1, class651 arg2, int arg3, int arg4, class498 arg5, int arg6) {
        if (class699.field9827 < 100) {
            class698.method3863(10092, arg2, arg5);
        }
        field6626++;
        arg2.method421(arg3, arg4, arg0 + arg3, arg4 + arg6);
        if (class699.field9827 < 100) {
            byte var7 = 20;
            int var8 = arg3 + (arg0 / 2);
            int var9 = arg4 + (arg6 / 2) - var7 - 18;
            arg2.method415(arg3, arg4, arg0, arg6, -16777216, 0);
            arg2.method423(var8 - 152, var9, 304, 34, class265.field3683[class580.field7704].getRGB(), 0);
            arg2.method415(var8 - 150, var9 - -2, class699.field9827 * 3, 30, class153.field2413[class580.field7704].getRGB(), 0);
            class450.field6177.method1303(class72.field1082.method546(class516.field6892, (byte) -35), var8, var7 + var9, class244.field3418[class580.field7704].getRGB(), 8364, -1);
            return;
        }
        int var10 = class613.field8098 - ((int) ((float) arg0 / class567.field7506));
        int var11 = (int) ((float) arg6 / class567.field7506) + class180.field2749;
        int var12 = class613.field8098 + ((int) ((float) arg0 / class567.field7506));
        int var13 = class180.field2749 - ((int) ((float) arg6 / class567.field7506));
        class227.field3194 = (int) ((float) (arg6 * 2) / class567.field7506);
        class393.field5175 = class613.field8098 - (int) ((float) arg0 / class567.field7506);
        class576.field7610 = class180.field2749 - (int) ((float) arg6 / class567.field7506);
        class34.field532 = (int) ((float) (arg0 * 2) / class567.field7506);
        class567.method3109(class567.field7515 + var10, class567.field7529 + var11, class567.field7515 + var12, class567.field7529 + var13, arg3, arg4, arg0 + arg3, arg4 + arg6 + 1);
        class567.method3111(arg2);
        class593 var14 = class567.method3114(arg2);
        if (arg1 > -123) {
            method2738((byte) 126);
        }
        class499.method2765(0, var14, arg2, (byte) -36, 0);
        if (class665.field9428 > 0) {
            class412.field5653--;
            if (class412.field5653 == 0) {
                class665.field9428--;
                class412.field5653 = 20;
            }
        }
        if (!class286.field4034) {
            return;
        }
        int var15 = arg0 + arg3 - 5;
        int var16 = arg4 + arg6 - 8;
        class188.field2788.method1293(var15, -1, "Fps:" + class244.field3415, 24386, var16, 16776960);
        int var20 = var16 - 15;
        Runtime var17 = Runtime.getRuntime();
        int var18 = (int) ((var17.totalMemory() - var17.freeMemory()) / 1024L);
        int var19 = 16776960;
        if (var18 > 65536) {
            var19 = 16711680;
        }
        class188.field2788.method1293(var15, -1, "Mem:" + var18 + "k", 24386, var20, var19);
        var16 = var20 - 15;
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(BLeh;)V", line = 127)
    public final void method2741(byte arg0, class335 arg1) {
        if (arg0 < 78) {
            return;
        }
        while (true) {
            int var3 = arg1.method2034(255);
            if (var3 == 0) {
                field6615++;
                return;
            }
            this.method2745(-68, arg1, var3);
        }
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(ZI)V", line = 152)
    public static final void method2742(boolean arg0, int arg1) {
        field6617++;
        if (!arg0) {
            method2738((byte) -18);
        }
        class216.field3086 = arg1;
        class239.field3366.method3739(0);
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(II)V", line = 166)
    private final void method2743(int arg0, int arg1) {
        field6618++;
        double var3 = (double) (arg0 >> 16 & arg1) / 256.0D;
        double var5 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
        double var7 = (double) (arg0 & 0xFF) / 256.0D;
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
        if (var7 > var11) {
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
        double var19 = var13 / 6.0D;
        this.field6628 = (int) (var15 * 256.0D);
        this.field6625 = (int) (var17 * 256.0D);
        if (this.field6628 < 0) {
            this.field6628 = 0;
        } else if (this.field6628 > 255) {
            this.field6628 = 255;
        }
        if (var17 > 0.5D) {
            this.field6623 = (int) ((1.0D - var17) * var15 * 512.0D);
        } else {
            this.field6623 = (int) (var15 * var17 * 512.0D);
        }
        if (this.field6625 < 0) {
            this.field6625 = 0;
        } else if (this.field6625 > 255) {
            this.field6625 = 255;
        }
        if (this.field6623 < 1) {
            this.field6623 = 1;
        }
        this.field6621 = (int) ((double) this.field6623 * var19);
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(BIII)I", line = 253)
    public static final int method2744(byte arg0, int arg1, int arg2, int arg3) {
        int var4 = arg2 & 0x3;
        field6624++;
        if (var4 == 0) {
            return arg1;
        } else if (var4 == 1) {
            return 4095 - arg3;
        } else if (arg0 >= -84) {
            return 66;
        } else if (var4 == 2) {
            return 4095 - arg1;
        } else {
            return arg3;
        }
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(ILeh;I)V", line = 283)
    private final void method2745(int arg0, class335 arg1, int arg2) {
        field6614++;
        if (arg2 == 1) {
            this.field6613 = arg1.method2042((byte) 53);
            this.method2743(this.field6613, 255);
        } else if (arg2 == 2) {
            this.field6619 = arg1.method2001((byte) -83);
            if (this.field6619 == 65535) {
                this.field6619 = -1;
            }
        } else if (arg2 == 3) {
            this.field6627 = arg1.method2001((byte) -83) << 2;
        } else if (arg2 == 4) {
            this.field6616 = false;
        }
        int var4 = -44 % ((arg0 + 28) / 35);
    }
}
