import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!se")
public abstract class class255 {

    @OriginalMember(owner = "client!se", name = "c", descriptor = "I")
    public static int field3697 = 0;

    @OriginalMember(owner = "client!se", name = "d", descriptor = "Z")
    public static boolean field3698 = false;

    @OriginalMember(owner = "client!se", name = "f", descriptor = "I")
    public static int field3700 = 4;

    @OriginalMember(owner = "client!se", name = "a", descriptor = "I")
    public static int field3695;

    @OriginalMember(owner = "client!se", name = "b", descriptor = "I")
    public static int field3696;

    @OriginalMember(owner = "client!se", name = "e", descriptor = "I")
    public static int field3699;

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(ILrca;ZILak;)V", line = 3)
    public static final void method1736(int arg0, class452 arg1, boolean arg2, int arg3, class349 arg4) {
        if (!arg2) {
            return;
        }
        field3696++;
        if ((arg0 & 0x800) != 0) {
            arg4.field881 = arg1.method286(128);
            arg4.field948 = arg1.method274(29471);
            arg4.field977 = arg1.method274(29471);
            arg4.field981 = arg1.method286(128);
            arg4.field898 = arg1.method280((byte) -60) + class605.field8787;
            arg4.field962 = arg1.method228((byte) 67) + class605.field8787;
            arg4.field979 = arg1.method278(106);
            arg4.field988 = 0;
            if (arg4.field4893) {
                arg4.field977 += arg4.field4905;
                arg4.field981 += arg4.field4937;
                arg4.field881 += arg4.field4905;
                arg4.field992 = 0;
                arg4.field948 += arg4.field4937;
            } else {
                arg4.field948 += arg4.field995[0];
                arg4.field977 += arg4.field991[0];
                arg4.field992 = 1;
                arg4.field981 += arg4.field995[0];
                arg4.field881 += arg4.field991[0];
            }
        }
        byte var5 = -1;
        if ((arg0 & 0x4000) != 0) {
            arg4.field928 = arg1.method272(2);
            if (arg4.field928.charAt(0) == '~') {
                arg4.field928 = arg4.field928.substring(1);
                class541.method3185(arg4.method2192(true, -32526), arg4.field4897, arg4.field928, 0, 2, 6642, arg4.method2196((byte) -118, false));
            } else if (class468.field6748 == arg4) {
                class541.method3185(arg4.method2192(true, -32526), arg4.field4897, arg4.field928, 0, 2, 6642, arg4.method2196((byte) -83, false));
            }
            arg4.field884 = 0;
            arg4.field934 = 150;
            arg4.field965 = 0;
        }
        if ((arg0 & 0x80) != 0) {
            int var6 = arg1.method232((byte) 20);
            int var7 = arg1.method273(255);
            arg4.method469(var7, class605.field8787, (byte) 93, var6);
            arg4.field954 = class605.field8787 + 300;
            arg4.field947 = arg1.method273(255);
        }
        if ((arg0 & 0x20000) != 0) {
            int var8 = arg1.method288((byte) -127);
            int[] var9 = new int[var8];
            int[] var10 = new int[var8];
            for (int var11 = 0; var11 < var8; var11++) {
                int var12 = arg1.method228((byte) 67);
                if ((var12 & 0xC000) == 49152) {
                    int var13 = arg1.method253(-13900);
                    var9[var11] = class164.method1221(var13, var12 << 16);
                } else {
                    var9[var11] = var12;
                }
                var10[var11] = arg1.method248((byte) -103);
            }
            arg4.method483(arg2, var9, var10);
        }
        if ((arg0 & 0x2000) != 0) {
            int var14 = arg1.method248((byte) -127);
            arg4.field976 = arg1.method273(255);
            arg4.field879 = arg1.method288((byte) -127);
            arg4.field961 = (var14 & 0x8000) != 0;
            arg4.field897 = var14 & 0x7FFF;
            arg4.field964 = class605.field8787 + arg4.field976 + arg4.field897;
        }
        if ((arg0 & 0x10000) != 0) {
            arg4.field926 = arg1.method286(128);
            arg4.field929 = arg1.method242(-2);
            arg4.field974 = arg1.method277((byte) 96);
            arg4.field887 = (byte) arg1.method278(88);
            arg4.field958 = class605.field8787 + arg1.method248((byte) -114);
            arg4.field907 = class605.field8787 + arg1.method228((byte) 67);
        }
        if ((arg0 & 0x200) != 0) {
            arg4.field4926 = arg1.method236(124) == 1;
        }
        if ((arg0 & 0x10) != 0) {
            int var15 = arg1.method253(-13900);
            if (var15 == 65535) {
                var15 = -1;
            }
            arg4.field967 = var15;
        }
        if ((arg0 & 0x4) != 0) {
            arg4.field4936 = arg1.method228((byte) 67);
            if (arg4.field992 == 0) {
                arg4.method474(-1, arg4.field4936);
                arg4.field4936 = -1;
            }
        }
        if ((arg0 & 0x1000) != 0) {
            int var16 = arg1.method253(-13900);
            int var17 = arg1.method234((byte) -95);
            if (var16 == 65535) {
                var16 = -1;
            }
            int var18 = arg1.method278(115);
            int var19 = var18 & 0x7;
            int var20 = var18 >> 3 & 0xF;
            if (var20 == 15) {
                var20 = -1;
            }
            arg4.method463(var19, var16, var20, true, -127, var17);
        }
        if ((arg0 & 0x40000) != 0) {
            int var21 = class605.field8787;
            int var22 = arg1.method232((byte) -126);
            int var23 = arg1.method236(115);
            arg4.method469(var23, var21, (byte) 121, var22);
        }
        if ((arg0 & 0x100) != 0) {
            var5 = arg1.method286(128);
        }
        if ((arg0 & 0x2) != 0) {
            int[] var24 = new int[4];
            for (int var25 = 0; var25 < 4; var25++) {
                var24[var25] = arg1.method253(-13900);
                if (var24[var25] == 65535) {
                    var24[var25] = -1;
                }
            }
            int var26 = arg1.method278(88);
            class494.method2977(true, arg4, var24, var26);
        }
        if ((arg0 & 0x8) != 0) {
            class50.field735[arg3] = arg1.method242(-2);
        }
        if ((arg0 & 0x20) != 0) {
            int var27 = arg1.method280((byte) -25);
            int var28 = arg1.method265(-4);
            if (var27 == 65535) {
                var27 = -1;
            }
            int var29 = arg1.method236(116);
            int var30 = var29 & 0x7;
            int var31 = var29 >> 3 & 0xF;
            if (var31 == 15) {
                var31 = -1;
            }
            arg4.method463(var30, var27, var31, false, -107, var28);
        }
        if ((arg0 & 0x40) != 0) {
            int var32 = arg1.method236(119);
            byte[] var33 = new byte[var32];
            class35 var34 = new class35(var33);
            arg1.method271(-1, var32, var33, 0);
            class196.field2807[arg3] = var34;
            arg4.method2200(-5061, var34);
        }
        if ((arg0 & 0x400) != 0) {
            int var35 = arg1.method278(88);
            int[] var36 = new int[var35];
            int[] var37 = new int[var35];
            int[] var38 = new int[var35];
            for (int var39 = 0; var39 < var35; var39++) {
                int var40 = arg1.method253(-13900);
                if (var40 == 65535) {
                    var40 = -1;
                }
                var36[var39] = var40;
                var37[var39] = arg1.method288((byte) -127);
                var38[var39] = arg1.method280((byte) -53);
            }
            class624.method3608(arg4, -127, var37, var38, var36);
        }
        if (!arg4.field4893) {
            return;
        }
        if (var5 == 127) {
            arg4.method2195(false, arg4.field4937, arg4.field4905);
            return;
        }
        byte var41;
        if (var5 == -1) {
            var41 = class50.field735[arg3];
        } else {
            var41 = var5;
        }
        class162.method1214(arg4, 0, var41);
        arg4.method2201(-1, var41, arg4.field4905, arg4.field4937);
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;IC)Ljava/lang/String;", line = 318)
    public static final String method1737(String arg0, String arg1, int arg2, char arg3) {
        field3699++;
        int var4 = arg1.length();
        int var5 = arg0.length();
        int var6 = var4;
        int var7 = var5 - 1;
        if (arg2 != var7) {
            int var8 = 0;
            while (true) {
                var8 = arg1.indexOf(arg3, var8);
                if (var8 < 0) {
                    break;
                }
                var6 += var7;
                var8++;
            }
        }
        StringBuffer var9 = new StringBuffer(var6);
        int var10 = 0;
        while (true) {
            int var11 = arg1.indexOf(arg3, var10);
            if (var11 < 0) {
                var9.append(arg1.substring(var10));
                return var9.toString();
            }
            var9.append(arg1.substring(var10, var11));
            var9.append(arg0);
            var10 = var11 + 1;
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(FIII[FIFFBFI)V")
    public abstract void method1738(float arg0, int arg1, int arg2, int arg3, float[] arg4, int arg5, float arg6, float arg7, byte arg8, float arg9, int arg10);
}
