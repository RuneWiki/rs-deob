import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sd")
public class class265 {

    @OriginalMember(owner = "client!sd", name = "k", descriptor = "Ljo;")
    private class382 field3957 = new class382(64);

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "Lok;")
    private class74 field3947;

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "Lok;")
    private class74 field3948;

    @OriginalMember(owner = "client!sd", name = "f", descriptor = "Luv;")
    public static class2 field3952;

    @OriginalMember(owner = "client!sd", name = "i", descriptor = "[I")
    public static int[] field3955;

    @OriginalMember(owner = "client!sd", name = "l", descriptor = "F")
    public static float field3958;

    @OriginalMember(owner = "client!sd", name = "c", descriptor = "I")
    public static int field3949;

    @OriginalMember(owner = "client!sd", name = "d", descriptor = "I")
    public static int field3950;

    @OriginalMember(owner = "client!sd", name = "e", descriptor = "I")
    public static int field3951;

    @OriginalMember(owner = "client!sd", name = "g", descriptor = "I")
    public static int field3953;

    @OriginalMember(owner = "client!sd", name = "j", descriptor = "[I")
    public static int[] field3956;

    @OriginalMember(owner = "client!sd", name = "h", descriptor = "[Lgo;")
    public static class310[] field3954;

    static {
        new class347("From", "Von:", "De", "De");
        field3952 = new class2(93, 6);
        field3955 = new int[32];
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(III)Z", line = 9)
    public static final boolean method1656(int arg0, int arg1, int arg2) {
        if (arg0 != -1) {
            method1657(-62);
        }
        field3953++;
        return (arg1 & 0x70000) != 0 | class316.method1976(true, arg1, arg2) || class328.method2040(arg1, arg2, 13430);
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(I)V", line = 20)
    public static void method1657(int arg0) {
        if (arg0 == -1) {
            field3954 = null;
            field3952 = null;
            field3955 = null;
            field3956 = null;
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(IBILvi;Ldr;)V", line = 60)
    public static final void method1658(int arg0, byte arg1, int arg2, class480 arg3, class293 arg4) {
        field3950++;
        byte var5 = -1;
        if ((arg2 & 0x400) != 0) {
            int var6 = arg4.method2774(32);
            if (var6 == 65535) {
                var6 = -1;
            }
            int var7 = arg4.method2734(19671);
            int var8 = arg4.method2765(54);
            arg3.method2423(var6, var8, false, var7, (byte) -61);
        }
        if ((arg2 & 0x20000) != 0) {
            int var9 = arg4.method2719(113738408);
            int var10 = arg4.method2734(19671);
            if (var9 == 65535) {
                var9 = -1;
            }
            int var11 = arg4.method2752((byte) -10);
            arg3.method2423(var9, var11, true, var10, (byte) 121);
        }
        if ((arg2 & 0x8) != 0) {
            int var12 = arg4.method2724(255);
            int var13 = arg4.method2765(125);
            arg3.method2418(class86.field1350, var13, 18067, var12);
            arg3.field6014 = class86.field1350 + 300;
            arg3.field5978 = arg4.method2752((byte) 36);
        }
        if ((arg2 & 0x100) != 0) {
            int var14 = arg4.method2719(113738408);
            arg3.field6046 = arg4.method2765(111);
            arg3.field6031 = arg4.method2715((byte) 84);
            arg3.field5996 = var14 & 0x7FFF;
            arg3.field6052 = (var14 & 0x8000) != 0;
            arg3.field5983 = class86.field1350 + arg3.field5996 + arg3.field6046;
        }
        if ((arg2 & 0x2000) != 0) {
            arg3.field6007 = arg4.method2770(-20459);
            if (arg3.field6007.charAt(0) == '~') {
                arg3.field6007 = arg3.field6007.substring(1);
                class73.method515(126, 2, 0, arg3.method2866(false, -83), arg3.field6007, arg3.method2864(-9476, true));
            } else if (class410.field6198 == arg3) {
                class73.method515(126, 2, 0, arg3.method2866(false, -106), arg3.field6007, arg3.method2864(-9476, true));
            }
            arg3.field6020 = 0;
            arg3.field6041 = 0;
            arg3.field6010 = 150;
        }
        if ((arg2 & 0x10000) != 0) {
            int var15 = arg4.method2765(105);
            int[] var16 = new int[var15];
            int[] var17 = new int[var15];
            int[] var18 = new int[var15];
            for (int var19 = 0; var19 < var15; var19++) {
                int var20 = arg4.method2727((byte) 43);
                if (var20 == 65535) {
                    var20 = -1;
                }
                var16[var19] = var20;
                var17[var19] = arg4.method2752((byte) -127);
                var18[var19] = arg4.method2774(32);
            }
            class439.method2572(var16, (byte) -54, var17, var18, arg3);
        }
        if ((arg2 & 0x1) != 0) {
            int var21 = arg4.method2756((byte) -92);
            byte[] var22 = new byte[var21];
            class468 var23 = new class468(var22);
            arg4.method2716(0, -127, var22, var21);
            class448.field6609[arg0] = var23;
            arg3.method2862(var23, false);
        }
        if ((arg2 & 0x8000) != 0) {
            int var24 = class86.field1350;
            int var25 = arg4.method2724(255);
            int var26 = arg4.method2715((byte) 47);
            arg3.method2418(var24, var26, 18067, var25);
        }
        if ((arg2 & 0x1000) != 0) {
            arg3.field7089 = arg4.method2765(50) == 1;
        }
        int var27 = 11 / ((arg1 - 75) / 34);
        if ((arg2 & 0x40000) != 0) {
            arg3.field5963 = arg4.method2733(-116);
            arg3.field6022 = arg4.method2729(true);
            arg3.field6008 = arg4.method2729(true);
            arg3.field5984 = (byte) arg4.method2765(111);
            arg3.field5976 = class86.field1350 + arg4.method2730(-1458809016);
            arg3.field5982 = class86.field1350 + arg4.method2727((byte) 43);
        }
        if ((arg2 & 0x4000) != 0) {
            arg3.field6045 = arg4.method2733(-127);
            arg3.field5975 = arg4.method2729(true);
            arg3.field5990 = arg4.method2714((byte) -60);
            arg3.field6025 = arg4.method2764((byte) 105);
            arg3.field6054 = arg4.method2730(-1458809016) + class86.field1350;
            arg3.field6051 = arg4.method2774(32) + class86.field1350;
            arg3.field6032 = arg4.method2756((byte) 65);
            if (arg3.field7060) {
                arg3.field5975 += arg3.field7085;
                arg3.field6066 = 0;
                arg3.field6025 += arg3.field7085;
                arg3.field5990 += arg3.field7095;
                arg3.field6045 += arg3.field7095;
            } else {
                arg3.field5975 += arg3.field6068[0];
                arg3.field5990 += arg3.field6065[0];
                arg3.field6025 += arg3.field6068[0];
                arg3.field6066 = 1;
                arg3.field6045 += arg3.field6065[0];
            }
            arg3.field6064 = 0;
        }
        if ((arg2 & 0x4) != 0) {
            int var28 = arg4.method2730(-1458809016);
            if (var28 == 65535) {
                var28 = -1;
            }
            int var29 = arg4.method2756((byte) 79);
            class330.method2042(-68, arg3, var28, var29);
        }
        if ((arg2 & 0x2) != 0) {
            int var30 = arg4.method2774(32);
            if (var30 == 65535) {
                var30 = -1;
            }
            arg3.field5991 = var30;
        }
        if ((arg2 & 0x20) != 0) {
            arg3.field7093 = arg4.method2774(32);
            if (arg3.field6066 == 0) {
                arg3.method2426(arg3.field7093, (byte) 38);
                arg3.field7093 = -1;
            }
        }
        if ((arg2 & 0x10) != 0) {
            int var31 = arg4.method2774(32);
            int var32 = arg4.method2715((byte) 73);
            int var33 = arg4.method2765(87);
            int var34 = arg4.field6830;
            boolean var35 = (var31 & 0x8000) != 0;
            if (arg3.field7063 != null && arg3.field7104 != null) {
                boolean var36 = false;
                if (var32 <= 1) {
                    if (!var35 && !(!class252.field3437 || class488.field7284) || class502.field7405) {
                        var36 = true;
                    } else if (class473.method2811(8, arg3.field7063)) {
                        var36 = true;
                    }
                }
                if (!var36 && class61.field832 == 0) {
                    class465.field6771.field6830 = 0;
                    arg4.method2761(class465.field6771.field6868, 0, (byte) 114, var33);
                    class465.field6771.field6830 = 0;
                    int var37 = -1;
                    String var38;
                    if (var35) {
                        var31 &= 0x7FFF;
                        class196 var39 = class511.method3013(class465.field6771, 1);
                        var37 = var39.field2882;
                        var38 = var39.field2878.method1049(class465.field6771, 11866);
                    } else {
                        var38 = class352.method2133(-82, class90.method695((byte) 122, class465.field6771));
                    }
                    arg3.field6007 = var38.trim();
                    arg3.field6020 = var31 & 0xFF;
                    arg3.field6010 = 150;
                    arg3.field6041 = var31 >> 8;
                    int var40;
                    if (var32 == 1 || var32 == 2) {
                        var40 = var35 ? 17 : 1;
                    } else {
                        var40 = var35 ? 17 : 2;
                    }
                    if (var32 == 2) {
                        class273.method1702("<img=1>" + arg3.method2866(false, -96), (byte) -99, var40, 0, var38, var37, null, "<img=1>" + arg3.method2864(-9476, true));
                    } else if (var32 == 1) {
                        class273.method1702("<img=0>" + arg3.method2866(false, -123), (byte) 84, var40, 0, var38, var37, null, "<img=0>" + arg3.method2864(-9476, true));
                    } else {
                        class273.method1702(arg3.method2866(false, -98), (byte) 108, var40, 0, var38, var37, null, arg3.method2864(-9476, true));
                    }
                }
            }
            arg4.field6830 = var34 + var33;
        }
        if ((arg2 & 0x80) != 0) {
            class364.field5564[arg0] = arg4.method2729(true);
        }
        if ((arg2 & 0x800) != 0) {
            var5 = arg4.method2764((byte) 72);
        }
        if (!arg3.field7060) {
            return;
        }
        if (var5 == 127) {
            arg3.method2863((byte) -112, arg3.field7085, arg3.field7095);
            return;
        }
        byte var41;
        if (var5 == -1) {
            var41 = class364.field5564[arg0];
        } else {
            var41 = var5;
        }
        arg3.method2868(arg3.field7095, var41, -94, arg3.field7085);
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(BI)Lti;", line = 397)
    public final class238 method1659(byte arg0, int arg1) {
        field3949++;
        class238 var3 = (class238) this.field3957.method2288((long) arg1, 0);
        if (var3 != null) {
            return var3;
        }
        byte[] var4;
        if (arg1 < 32768) {
            var4 = this.field3947.method541(arg1, 0, (byte) -122);
        } else {
            var4 = this.field3948.method541(arg1 & 0x7FFF, 0, (byte) -122);
        }
        class238 var5 = new class238();
        if (arg0 >= -11) {
            this.field3957 = null;
        }
        if (var4 != null) {
            var5.method1467(14, new class468(var4));
        }
        if (arg1 >= 32768) {
            var5.method1464(0);
        }
        this.field3957.method2290((long) arg1, var5, 116);
        return var5;
    }

    @OriginalMember(owner = "client!sd", name = "<init>", descriptor = "(ILok;Lok;)V", line = 434)
    public class265(int arg0, class74 arg1, class74 arg2) {
        this.field3947 = arg1;
        this.field3948 = arg2;
        if (this.field3947 != null) {
            this.field3947.method536(false, 0);
        }
        if (this.field3948 != null) {
            this.field3948.method536(false, 0);
        }
    }
}
