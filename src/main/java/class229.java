import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sr")
public class class229 {

    @OriginalMember(owner = "client!sr", name = "c", descriptor = "I")
    private int field2977;

    @OriginalMember(owner = "client!sr", name = "f", descriptor = "I")
    private int field2980;

    @OriginalMember(owner = "client!sr", name = "l", descriptor = "I")
    private int field2986;

    @OriginalMember(owner = "client!sr", name = "g", descriptor = "I")
    private int field2981;

    @OriginalMember(owner = "client!sr", name = "e", descriptor = "I")
    private int field2979;

    @OriginalMember(owner = "client!sr", name = "i", descriptor = "I")
    private int field2983;

    @OriginalMember(owner = "client!sr", name = "h", descriptor = "I")
    private int field2982;

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "I")
    private int field2975;

    @OriginalMember(owner = "client!sr", name = "b", descriptor = "I")
    private int field2976;

    @OriginalMember(owner = "client!sr", name = "k", descriptor = "I")
    private int field2985;

    @OriginalMember(owner = "client!sr", name = "d", descriptor = "I")
    public static int field2978;

    @OriginalMember(owner = "client!sr", name = "j", descriptor = "I")
    public static int field2984;

    @OriginalMember(owner = "client!sr", name = "m", descriptor = "I")
    public static int field2987;

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(Lr;ZLfa;)V")
    public static final void method1387(class165 arg0, boolean arg1, class212 arg2) {
        field2978++;
        if (arg1 || class550.field7975 == null) {
            return;
        }
        if (class411.field5847 < 10) {
            if (!class550.field7972.method3810(30416, class550.field7975.field1480)) {
                class411.field5847 = class634.field9107.method3789(class550.field7975.field1480, 3) / 10;
                return;
            }
            class575.method3365((byte) 37);
            class411.field5847 = 10;
        }
        if (class411.field5847 == 10) {
            class550.field8007 = class550.field7975.field1475 >> 6 << 6;
            class550.field8009 = class550.field7975.field1484 >> 6 << 6;
            class550.field8003 = (class550.field7975.field1474 >> 6 << 6) + 64 - class550.field8007;
            class550.field7995 = (class550.field7975.field1481 >> 6 << 6) - (class550.field8009 - 64);
            int[] var3 = new int[3];
            int var4 = -1;
            int var5 = -1;
            if (class550.field7975.method815((class206.field2472.field530 >> 9) + class36.field689, class206.field2472.field532, (class206.field2472.field531 >> 9) + class88.field1239, 20035, var3)) {
                var5 = var3[2] - class550.field8009;
                var4 = var3[1] - class550.field8007;
            }
            if (!class37.field709 && var4 >= 0 && class550.field8003 > var4 && var5 >= 0 && var5 < class550.field7995) {
                int var6 = var5 + ((int) (Math.random() * 10.0D) - 5);
                int var7 = var4 + (int) (Math.random() * 10.0D) - 5;
                class418.field5921 = var7;
                class426.field6111 = var6;
            } else if (class510.field7457 == -1 || class186.field2273 == -1) {
                class550.field7975.method822(var3, 110, class550.field7975.field1477 >> 14 & 0x3FFF, class550.field7975.field1477 & 0x3FFF);
                class426.field6111 = var3[2] - class550.field8009;
                class418.field5921 = var3[1] - class550.field8007;
            } else {
                class550.field7975.method822(var3, 60, class510.field7457, class186.field2273);
                class186.field2273 = -1;
                class510.field7457 = -1;
                if (var3 != null) {
                    class418.field5921 = var3[1] - class550.field8007;
                    class426.field6111 = var3[2] - class550.field8009;
                }
                class37.field709 = false;
            }
            if (class550.field7975.field1488 == 37) {
                class550.field7984 = 3.0F;
                class550.field7983 = 3.0F;
            } else if (class550.field7975.field1488 == 50) {
                class550.field7984 = 4.0F;
                class550.field7983 = 4.0F;
            } else if (class550.field7975.field1488 == 75) {
                class550.field7984 = 6.0F;
                class550.field7983 = 6.0F;
            } else if (class550.field7975.field1488 == 100) {
                class550.field7984 = 8.0F;
                class550.field7983 = 8.0F;
            } else if (class550.field7975.field1488 == 200) {
                class550.field7984 = 16.0F;
                class550.field7983 = 16.0F;
            } else {
                class550.field7984 = 8.0F;
                class550.field7983 = 8.0F;
            }
            class550.field7985 = (int) class550.field7984 >> 1;
            class550.field7981 = class689.method3896(class550.field7985, (byte) -88);
            class582.method3389(110);
            class550.method3223();
            class356.field4756 = new class183();
            class550.field7988 += (int) (Math.random() * 5.0D) - 2;
            if (class550.field7988 < -8) {
                class550.field7988 = -8;
            }
            if (class550.field7988 > 8) {
                class550.field7988 = 8;
            }
            class550.field7979 += (int) (Math.random() * 5.0D) - 2;
            if (class550.field7979 < -16) {
                class550.field7979 = -16;
            }
            if (class550.field7979 > 16) {
                class550.field7979 = 16;
            }
            class550.method3216(arg2, class550.field7988 >> 2 << 10, class550.field7979 >> 1);
            class550.field7973.method3815(1024, 256, -13841);
            class550.field7974.method561(256, false, 256);
            class550.field7978.method810(4096, true);
            class342.field4519.method2679((byte) -123, 256);
            class411.field5847 = 20;
        } else if (class411.field5847 == 20) {
            class415.method2493(true, (byte) -120);
            class550.method3218(arg0, class550.field7988, class550.field7979);
            class411.field5847 = 60;
            class415.method2493(true, (byte) -109);
            class467.method2736(-29);
        } else if (class411.field5847 == 60) {
            if (class550.field7972.method3807(0, class550.field7975.field1480 + "_staticelements")) {
                if (!class550.field7972.method3810(30416, class550.field7975.field1480 + "_staticelements")) {
                    return;
                }
                class550.field7982 = class457.method2715((byte) 101, class550.field7975.field1480 + "_staticelements", class646.field9195, class550.field7972);
            } else {
                class550.field7982 = new class79(0);
            }
            class550.method3235();
            class411.field5847 = 70;
            class415.method2493(true, (byte) 125);
            class467.method2736(111);
        } else if (class411.field5847 == 70) {
            class287.field3876 = new class640(arg0, 11, true, class646.field9190);
            class411.field5847 = 73;
            class415.method2493(true, (byte) 83);
            class467.method2736(-109);
        } else if (class411.field5847 == 73) {
            class473.field6605 = new class640(arg0, 12, true, class646.field9190);
            class411.field5847 = 76;
            class415.method2493(true, (byte) -109);
            class467.method2736(126);
        } else if (class411.field5847 == 76) {
            class318.field4207 = new class640(arg0, 14, true, class646.field9190);
            class411.field5847 = 79;
            class415.method2493(true, (byte) 92);
            class467.method2736(126);
        } else if (class411.field5847 == 79) {
            class561.field8108 = new class640(arg0, 17, true, class646.field9190);
            class411.field5847 = 82;
            class415.method2493(true, (byte) 125);
            class467.method2736(106);
        } else if (class411.field5847 == 82) {
            class74.field1108 = new class640(arg0, 19, true, class646.field9190);
            class411.field5847 = 85;
            class415.method2493(true, (byte) 45);
            class467.method2736(111);
        } else if (class411.field5847 == 85) {
            class630.field9049 = new class640(arg0, 22, true, class646.field9190);
            class411.field5847 = 88;
            class415.method2493(true, (byte) -125);
            class467.method2736(117);
        } else if (class411.field5847 == 88) {
            class630.field9050 = new class640(arg0, 26, true, class646.field9190);
            class411.field5847 = 91;
            class415.method2493(true, (byte) -109);
            class467.method2736(107);
        } else {
            class571.field8343 = new class640(arg0, 30, true, class646.field9190);
            class411.field5847 = 100;
            class415.method2493(true, (byte) 78);
            class467.method2736(112);
            System.gc();
        }
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(IZII)Z")
    public final boolean method1388(int arg0, boolean arg1, int arg2, int arg3) {
        if (!arg1) {
            this.field2986 = 91;
        }
        field2987++;
        if (this.field2979 > arg2 || arg2 > this.field2976) {
            return false;
        } else if (arg3 < this.field2982 || arg3 > this.field2983) {
            return false;
        } else if (this.field2985 <= arg0 && arg0 <= this.field2975) {
            int var5 = arg2 - this.field2980;
            int var6 = arg0 - this.field2977;
            return (var5 * var5 + (var6 * var6)) < this.field2981;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(IIIIBIIIIII)V")
    public final void method1389(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        field2984++;
        this.field2980 = arg6;
        this.field2986 = arg9;
        this.field2977 = arg0;
        this.field2981 = arg5 * arg5;
        this.field2982 = this.field2986 + arg10;
        this.field2979 = this.field2980 + arg2;
        if (arg4 <= -12) {
            this.field2975 = this.field2977 + arg7;
            this.field2983 = this.field2986 + arg8;
            this.field2985 = this.field2977 + arg3;
            this.field2976 = this.field2980 + arg1;
        }
    }

    @OriginalMember(owner = "client!sr", name = "<init>", descriptor = "(IIIIIIIIII)V")
    public class229(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        this.field2977 = arg2;
        this.field2980 = arg0;
        this.field2986 = arg1;
        this.field2981 = arg3 * arg3;
        this.field2979 = this.field2980 + arg4;
        this.field2983 = this.field2986 + arg7;
        this.field2982 = this.field2986 + arg6;
        this.field2975 = this.field2977 + arg9;
        this.field2976 = this.field2980 + arg5;
        this.field2985 = this.field2977 + arg8;
    }
}
