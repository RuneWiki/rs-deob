import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vg")
public class class196 {

    @OriginalMember(owner = "client!vg", name = "w", descriptor = "[B")
    private byte[] field3829 = new byte[4];

    @OriginalMember(owner = "client!vg", name = "i", descriptor = "Loc;")
    private class129 field3815;

    @OriginalMember(owner = "client!vg", name = "h", descriptor = "I")
    private int field3814;

    @OriginalMember(owner = "client!vg", name = "j", descriptor = "J")
    private long field3816;

    @OriginalMember(owner = "client!vg", name = "q", descriptor = "Leh;")
    private static class47 field3823 = class195.method1282((byte) -4, "Press (Wrecover a locked account(W on front page)3");

    @OriginalMember(owner = "client!vg", name = "f", descriptor = "Leh;")
    public static class47 field3812 = field3823;

    @OriginalMember(owner = "client!vg", name = "r", descriptor = "Leh;")
    public static class47 field3824 = class195.method1282((byte) -4, "Versteckt");

    @OriginalMember(owner = "client!vg", name = "d", descriptor = "[I")
    public static int[] field3810 = new int[2048];

    @OriginalMember(owner = "client!vg", name = "y", descriptor = "Leh;")
    private static class47 field3831 = class195.method1282((byte) -4, "Choose Option");

    @OriginalMember(owner = "client!vg", name = "t", descriptor = "I")
    public static int field3826 = 0;

    @OriginalMember(owner = "client!vg", name = "x", descriptor = "Leh;")
    private static class47 field3830 = class195.method1282((byte) -4, "Loading )2 please wait)3");

    @OriginalMember(owner = "client!vg", name = "g", descriptor = "Leh;")
    public static class47 field3813 = field3831;

    @OriginalMember(owner = "client!vg", name = "A", descriptor = "Leh;")
    private static class47 field3833 = class195.method1282((byte) -4, "Walk here");

    @OriginalMember(owner = "client!vg", name = "k", descriptor = "Leh;")
    public static class47 field3817 = field3833;

    @OriginalMember(owner = "client!vg", name = "z", descriptor = "J")
    public static long field3832 = 0L;

    @OriginalMember(owner = "client!vg", name = "b", descriptor = "Leh;")
    public static class47 field3808 = field3830;

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "I")
    public static int field3807;

    @OriginalMember(owner = "client!vg", name = "e", descriptor = "I")
    public static int field3811;

    @OriginalMember(owner = "client!vg", name = "l", descriptor = "I")
    public static int field3818;

    @OriginalMember(owner = "client!vg", name = "m", descriptor = "I")
    public static int field3819;

    @OriginalMember(owner = "client!vg", name = "o", descriptor = "I")
    public static int field3821;

    @OriginalMember(owner = "client!vg", name = "p", descriptor = "I")
    private int field3822;

    @OriginalMember(owner = "client!vg", name = "s", descriptor = "I")
    public static int field3825;

    @OriginalMember(owner = "client!vg", name = "u", descriptor = "I")
    public static int field3827;

    @OriginalMember(owner = "client!vg", name = "v", descriptor = "I")
    private int field3828;

    @OriginalMember(owner = "client!vg", name = "n", descriptor = "Ljava/io/DataInputStream;")
    private DataInputStream field3820;

    @OriginalMember(owner = "client!vg", name = "c", descriptor = "[B")
    private byte[] field3809;

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(I)[B")
    public final byte[] method1286(int arg0) throws IOException {
        field3821++;
        if (class201.method1313(29) > this.field3816) {
            throw new IOException("fdt");
        }
        if (arg0 != 0) {
            method1288((byte) -25, null);
        }
        if (this.field3814 == 0) {
            if (this.field3815.field2543 == 2) {
                throw new IOException("fds");
            }
            if (this.field3815.field2543 == 1) {
                this.field3814 = 1;
                this.field3820 = (DataInputStream) this.field3815.field2548;
            }
        }
        if (this.field3814 == 1) {
            int var2 = this.field3820.available();
            if (var2 > 0) {
                if (this.field3822 + var2 > 4) {
                    var2 = 4 - this.field3822;
                }
                this.field3822 += this.field3820.read(this.field3829, this.field3822, var2);
                if (this.field3822 == 4) {
                    int var3 = (new class68(this.field3829)).method599((byte) 96);
                    this.field3809 = new byte[var3];
                    this.field3814 = 2;
                }
            }
        }
        if (this.field3814 == 2) {
            int var4 = this.field3820.available();
            if (var4 > 0) {
                if (this.field3809.length < var4 + this.field3828) {
                    var4 = this.field3809.length - this.field3828;
                }
                this.field3828 += this.field3820.read(this.field3809, this.field3828, var4);
                if (this.field3809.length == this.field3828) {
                    return this.field3809;
                }
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(ZI)Z")
    public static final boolean method1287(boolean arg0, int arg1) {
        field3807++;
        if (arg0) {
            method1290(97, -90, -95, -122, -102);
        }
        return (arg1 >> 31 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(BLeh;)I")
    public static final int method1288(byte arg0, class47 arg1) {
        field3825++;
        if (class132.field2606 == 1) {
            return 7;
        } else if (arg1.method393(class122.field2476, 0)) {
            return 1;
        } else if (arg1.method393(class108.field2236, 0)) {
            return 1;
        } else if (arg1.method393(class117.field2379, 0)) {
            return 2;
        } else if (arg1.method393(class72.field1550, 0)) {
            return 2;
        } else if (arg1.method393(class47.field935, 0)) {
            return 3;
        } else if (arg1.method393(class188.field3640, 0)) {
            return 4;
        } else if (arg1.method393(class84.field1784, 0)) {
            return 4;
        } else {
            int var2 = -94 % ((49 - arg0) / 52);
            if (arg1.method393(class197.field3837, 0)) {
                return 5;
            } else if (arg1.method393(class166.field3228, 0)) {
                return 6;
            } else {
                return 0;
            }
        }
    }

    @OriginalMember(owner = "client!vg", name = "b", descriptor = "(I)V")
    public static void method1289(int arg0) {
        if (arg0 != 2047) {
            method1288((byte) 63, null);
        }
        field3812 = null;
        field3833 = null;
        field3808 = null;
        field3831 = null;
        field3810 = null;
        field3824 = null;
        field3823 = null;
        field3813 = null;
        field3830 = null;
        field3817 = null;
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(IIIII)V")
    public static final void method1290(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class169.method1147(arg4, arg0, arg4 + arg2, arg0 + arg3);
        field3818++;
        class17.method179();
        class53.field1033++;
        class51.method451(true, 0);
        class87.method709(true, -101);
        class51.method451(false, 0);
        class87.method709(false, 114);
        class163.method1111(-1);
        class12.method89(arg1 ^ 0x7923);
        if (!class152.field2992) {
            int var5 = class146.field2854;
            int var6 = field3826 + class160.field3116 & 0x7FF;
            if (var5 < class88.field1877 / 256) {
                var5 = class88.field1877 / 256;
            }
            if (class200.field3904[4] && class75.field1633[4] + 128 > var5) {
                var5 = class75.field1633[4] + 128;
            }
            class199.method1310(class39.method335(class123.field2489.field3291, field3827, class123.field2489.field3281, arg1 + 20296) - 50, var5, class94.field1947, class100.field2103, var6, var5 * 3 + 600, (byte) 122);
        }
        int var7;
        if (class152.field2992) {
            var7 = class192.method1261(255);
        } else {
            var7 = class47.method403(-39);
        }
        int var8 = class33.field639;
        int var9 = class188.field3655;
        int var10 = class194.field3787;
        int var11 = class98.field2086;
        int var12 = class53.field1036;
        if (arg1 != 600) {
            field3832 = -31L;
        }
        for (int var13 = 0; var13 < 5; var13++) {
            if (class200.field3904[var13]) {
                int var16 = (int) ((double) -class8.field161[var13] + (double) (class8.field161[var13] * 2 + 1) * Math.random() + Math.sin((double) class96.field2047[var13] / 100.0D * (double) class198.field3848[var13]) * (double) class75.field1633[var13]);
                if (var13 == 2) {
                    class98.field2086 += var16;
                }
                if (var13 == 3) {
                    class53.field1036 = class53.field1036 + var16 & 0x7FF;
                }
                if (var13 == 1) {
                    class188.field3655 += var16;
                }
                if (var13 == 0) {
                    class33.field639 += var16;
                }
                if (var13 == 4) {
                    class194.field3787 += var16;
                    if (class194.field3787 < 128) {
                        class194.field3787 = 128;
                    }
                    if (class194.field3787 > 383) {
                        class194.field3787 = 383;
                    }
                }
            }
        }
        int var14 = class84.field1788;
        int var15 = class41.field814;
        if (arg4 <= var14 && arg2 + arg4 > var14 && arg0 <= var15 && arg0 + arg3 > var15) {
            class30.field565 = true;
            class30.field570 = class41.field814 - arg0;
            class30.field579 = 0;
            class30.field563 = class84.field1788 - arg4;
        } else {
            class30.field565 = false;
            class30.field579 = 0;
        }
        class126.method951((byte) -126);
        class169.method1149(arg4, arg0, arg2, arg3, 0);
        class126.method951((byte) -127);
        class47.method388(class33.field639, class188.field3655, class98.field2086, class194.field3787, class53.field1036, var7);
        class126.method951((byte) -127);
        class122.method939();
        class18.method200(arg2, -25071, arg0, arg3, arg4);
        class75.method660(arg4, 0, arg0);
        ((class91) class17.field354).method738(class190.field3677, 0);
        class114.method899(arg0, arg2, arg4, arg3, -1);
        class194.field3787 = var10;
        class98.field2086 = var11;
        class188.field3655 = var9;
        class33.field639 = var8;
        class53.field1036 = var12;
        if (class182.field3497 && class131.method966(0, false, true) == 0) {
            class182.field3497 = false;
        }
        if (class182.field3497) {
            class169.method1149(arg4, arg0, arg2, arg3, 0);
            class148.method1046(false, false, field3808);
        }
        if (!class182.field3497 && !class80.field1726 && arg4 <= var14 && var14 < arg2 + arg4 && var15 >= arg0 && var15 < arg0 + arg3) {
            class20.method207(var15, (byte) 95, var14, arg4, arg0);
        }
    }

    @OriginalMember(owner = "client!vg", name = "<init>", descriptor = "(Lqf;Ljava/net/URL;)V")
    public class196(class150 arg0, URL arg1) {
        this.field3815 = arg0.method1059(arg1, 73);
        this.field3814 = 0;
        this.field3816 = class201.method1313(29) + 30000L;
    }
}
