import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!av")
public class class583 {

    @OriginalMember(owner = "client!av", name = "e", descriptor = "Z")
    private boolean field8283 = false;

    @OriginalMember(owner = "client!av", name = "j", descriptor = "[Ljava/lang/String;")
    private String[] field8288 = new String[0];

    @OriginalMember(owner = "client!av", name = "a", descriptor = "I")
    private int field8279 = -1;

    @OriginalMember(owner = "client!av", name = "c", descriptor = "I")
    private int field8281;

    @OriginalMember(owner = "client!av", name = "m", descriptor = "[I")
    public static int[] field8291 = new int[6];

    @OriginalMember(owner = "client!av", name = "k", descriptor = "Lpr;")
    public static class407 field8289 = new class407(100, -2);

    @OriginalMember(owner = "client!av", name = "r", descriptor = "Lkfa;")
    public static class549 field8296 = new class549(44, -1);

    @OriginalMember(owner = "client!av", name = "s", descriptor = "Lpr;")
    public static class407 field8297 = new class407(43, 3);

    @OriginalMember(owner = "client!av", name = "i", descriptor = "F")
    public static float field8287;

    @OriginalMember(owner = "client!av", name = "b", descriptor = "I")
    public static int field8280;

    @OriginalMember(owner = "client!av", name = "d", descriptor = "I")
    public static int field8282;

    @OriginalMember(owner = "client!av", name = "f", descriptor = "I")
    public static int field8284;

    @OriginalMember(owner = "client!av", name = "g", descriptor = "I")
    public static int field8285;

    @OriginalMember(owner = "client!av", name = "h", descriptor = "I")
    public static int field8286;

    @OriginalMember(owner = "client!av", name = "l", descriptor = "I")
    public static int field8290;

    @OriginalMember(owner = "client!av", name = "n", descriptor = "I")
    public static int field8292;

    @OriginalMember(owner = "client!av", name = "o", descriptor = "I")
    public static int field8293;

    @OriginalMember(owner = "client!av", name = "p", descriptor = "I")
    public static int field8294;

    @OriginalMember(owner = "client!av", name = "t", descriptor = "[I")
    public static int[] field8298;

    @OriginalMember(owner = "client!av", name = "q", descriptor = "[[B")
    public static byte[][] field8295;

    @OriginalMember(owner = "client!av", name = "a", descriptor = "(II)V")
    private final void method3277(int arg0, int arg1) {
        field8280++;
        int var3 = -78 / ((-arg1 - 34) / 40);
        String[] var4 = new String[this.method3282(-102, arg0)];
        class652.method3677(this.field8288, 0, var4, 0, this.field8288.length);
        this.field8288 = var4;
    }

    @OriginalMember(owner = "client!av", name = "a", descriptor = "(Ljava/lang/String;I)V")
    public final void method3278(String arg0, int arg1) {
        this.method3281(arg0, -26548, this.field8279 + 1);
        if (arg1 == 8627) {
            field8292++;
        }
    }

    @OriginalMember(owner = "client!av", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field8293++;
        StringBuffer var1 = new StringBuffer();
        var1.append("[");
        for (int var2 = 0; var2 < this.field8279; var2++) {
            if (var2 != 0) {
                var1.append(", ");
            }
            var1.append(this.field8288[var2]);
        }
        var1.append("]");
        return var1.toString();
    }

    @OriginalMember(owner = "client!av", name = "a", descriptor = "(ZI)V")
    public static final void method3279(boolean arg0, int arg1) {
        class59.field619 = 0;
        field8282++;
        class46.field507 = 0;
        class685.method3815(-116);
        class217.method1286((byte) 116, arg0);
        class628.method3520((byte) 108);
        boolean var2 = false;
        int var3 = 0;
        if (arg1 != -1) {
            field8287 = 1.1559204F;
        }
        while (var3 < class59.field619) {
            int var5 = class550.field7859[var3];
            class443 var6 = (class443) class392.field5223.method3234((byte) -35, (long) var5);
            class625 var7 = var6.field6107;
            if (class215.field2615 && class10.method56(var5, 16777215)) {
                class32.method171(79);
            }
            if (class469.field6549 != var7.field3734) {
                if (var7.field8855.method100((byte) 122)) {
                    class13.method64(var7, -9581);
                }
                var7.method3501(null, 82);
                var6.method1519((byte) 121);
                var2 = true;
            }
            var3++;
        }
        if (var2) {
            class208.field2528 = class392.field5223.method3230(false);
            class392.field5223.method3229(class609.field8605, 20028);
        }
        if (class478.field7009 != class680.field9630.field6215) {
            throw new RuntimeException("gnp1 pos:" + class680.field9630.field6215 + " psize:" + class478.field7009);
        }
        for (int var4 = 0; var4 < class118.field1356; var4++) {
            if (class392.field5223.method3234((byte) -31, (long) class664.field9449[var4]) == null) {
                throw new RuntimeException("gnp2 pos:" + var4 + " size:" + class118.field1356);
            }
        }
    }

    @OriginalMember(owner = "client!av", name = "a", descriptor = "(JI)V")
    public static final void method3280(long arg0, int arg1) {
        try {
            Thread.sleep(arg0);
        } catch (InterruptedException var3) {
        }
        field8285++;
        if (arg1 < 45) {
            field8297 = null;
        }
    }

    @OriginalMember(owner = "client!av", name = "a", descriptor = "(Ljava/lang/String;II)V")
    private final void method3281(String arg0, int arg1, int arg2) {
        if (arg2 > this.field8279) {
            this.field8279 = arg2;
        }
        field8286++;
        if (arg2 >= this.field8288.length) {
            this.method3277(arg2, arg1 ^ 0x67C9);
        }
        if (arg1 == -26548) {
            this.field8288[arg2] = arg0;
        }
    }

    @OriginalMember(owner = "client!av", name = "b", descriptor = "(II)I")
    private final int method3282(int arg0, int arg1) {
        field8284++;
        int var3 = this.field8288.length;
        if (arg0 >= -8) {
            this.method3278(null, -98);
        }
        while (arg1 >= var3) {
            if (!this.field8283) {
                var3 += this.field8281;
            } else if (var3 == 0) {
                var3 = 1;
            } else {
                var3 = this.field8281 * var3;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!av", name = "a", descriptor = "(IIILaj;II)V")
    public static final void method3283(int arg0, int arg1, int arg2, class282 arg3, int arg4, int arg5) {
        if (arg1 < 27) {
            method3279(true, -115);
        }
        field8290++;
        if (arg3.field3591 == -1 && arg3.field3590 == null) {
            return;
        }
        int var6 = 0;
        if (arg3.field3587 < arg4) {
            var6 += arg4 - arg3.field3587;
        } else if (arg3.field3588 > arg4) {
            var6 += arg3.field3588 - arg4;
        }
        int var7 = class601.field8530.field2877 * arg3.field3567 >> 8;
        if (arg3.field3583 < arg2) {
            var6 += arg2 - arg3.field3583;
        } else if (arg3.field3582 > arg2) {
            var6 += arg3.field3582 - arg2;
        }
        if (arg3.field3569 == 0 || arg3.field3569 < var6 - 256 || class601.field8530.field2877 == 0 || arg3.field3585 != arg5) {
            if (arg3.field3577 != null) {
                class424.field5641.method2852(arg3.field3577);
                arg3.field3572 = null;
                arg3.field3575 = null;
                arg3.field3577 = null;
            }
            if (arg3.field3586 != null) {
                class424.field5641.method2852(arg3.field3586);
                arg3.field3586 = null;
                arg3.field3580 = null;
                arg3.field3574 = null;
            }
            return;
        }
        var6 -= 256;
        if (var6 < 0) {
            var6 = 0;
        }
        int var8 = (arg3.field3569 - var6) * var7 / arg3.field3569;
        if (arg3.field3577 != null) {
            arg3.field3577.method942(var8);
        } else if (arg3.field3591 >= 0) {
            if (arg3.field3568) {
                if (arg3.field3572 == null) {
                    arg3.field3572 = class297.method1689(class194.field2332, arg3.field3591);
                }
                if (arg3.field3572 != null) {
                    if (arg3.field3575 == null) {
                        arg3.field3575 = arg3.field3572.method1690(new int[] { 22050 });
                    }
                    if (arg3.field3575 != null) {
                        class159 var9 = class159.method928(arg3.field3575, 100, var8);
                        var9.method941(-1);
                        class424.field5641.method2847(var9);
                        arg3.field3577 = var9;
                    }
                }
            } else {
                class34 var10 = class34.method187(class581.field8259, arg3.field3591, 0);
                if (var10 != null) {
                    class298 var11 = var10.method186().method1691(class607.field8572);
                    class159 var12 = class159.method928(var11, 100, var8);
                    var12.method941(-1);
                    class424.field5641.method2847(var12);
                    arg3.field3577 = var12;
                }
            }
        }
        if (arg3.field3586 != null) {
            arg3.field3586.method942(var8);
            if (arg3.field3586.method1520(-53)) {
                return;
            }
            arg3.field3574 = null;
            arg3.field3580 = null;
            arg3.field3586 = null;
        } else if (arg3.field3590 != null && (arg3.field3565 -= arg0) <= 0) {
            if (arg3.field3578) {
                if (arg3.field3580 == null) {
                    int var13 = (int) (Math.random() * (double) arg3.field3590.length);
                    arg3.field3580 = class297.method1689(class194.field2332, arg3.field3590[var13]);
                }
                if (arg3.field3580 != null) {
                    if (arg3.field3574 == null) {
                        arg3.field3574 = arg3.field3580.method1690(new int[] { 22050 });
                    }
                    if (arg3.field3574 != null) {
                        class159 var14 = class159.method928(arg3.field3574, 100, var8);
                        var14.method941(0);
                        class424.field5641.method2847(var14);
                        arg3.field3586 = var14;
                        arg3.field3565 = (int) (Math.random() * (double) (arg3.field3576 - arg3.field3566)) + arg3.field3566;
                        return;
                    }
                }
            } else {
                int var15 = (int) ((double) arg3.field3590.length * Math.random());
                class34 var16 = class34.method187(class581.field8259, arg3.field3590[var15], 0);
                if (var16 == null) {
                    return;
                }
                class298 var17 = var16.method186().method1691(class607.field8572);
                class159 var18 = class159.method928(var17, 100, var8);
                var18.method941(0);
                class424.field5641.method2847(var18);
                arg3.field3565 = (int) (Math.random() * (double) (arg3.field3576 - arg3.field3566)) + arg3.field3566;
                arg3.field3586 = var18;
            }
            return;
        }
    }

    @OriginalMember(owner = "client!av", name = "a", descriptor = "(B)V")
    public static void method3284(byte arg0) {
        field8298 = null;
        field8296 = null;
        field8295 = null;
        field8291 = null;
        field8297 = null;
        if (arg0 > 29) {
            field8289 = null;
        }
    }

    @OriginalMember(owner = "client!av", name = "<init>", descriptor = "(IZ)V")
    public class583(int arg0, boolean arg1) {
        this.field8281 = arg0;
        this.field8283 = arg1;
    }

    @OriginalMember(owner = "client!av", name = "a", descriptor = "(I)[Ljava/lang/String;")
    public final String[] method3285(int arg0) {
        if (arg0 == -10576) {
            field8294++;
            String[] var2 = new String[this.field8279 + 1];
            class652.method3677(this.field8288, 0, var2, 0, this.field8279 + 1);
            return var2;
        } else {
            return null;
        }
    }
}
