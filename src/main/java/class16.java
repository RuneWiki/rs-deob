import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qk")
public class class16 {

    @OriginalMember(owner = "client!qk", name = "d", descriptor = "Llga;")
    private class663 field159 = new class663(64);

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "Lsea;")
    private class648 field156;

    @OriginalMember(owner = "client!qk", name = "h", descriptor = "Len;")
    public static class290 field163 = new class290("", 16);

    @OriginalMember(owner = "client!qk", name = "j", descriptor = "I")
    public static int field165 = -1;

    @OriginalMember(owner = "client!qk", name = "l", descriptor = "Lor;")
    public static class594 field167 = new class594();

    @OriginalMember(owner = "client!qk", name = "b", descriptor = "I")
    public static int field157;

    @OriginalMember(owner = "client!qk", name = "c", descriptor = "I")
    public static int field158;

    @OriginalMember(owner = "client!qk", name = "e", descriptor = "I")
    public static int field160;

    @OriginalMember(owner = "client!qk", name = "f", descriptor = "I")
    public static int field161;

    @OriginalMember(owner = "client!qk", name = "g", descriptor = "I")
    public static int field162;

    @OriginalMember(owner = "client!qk", name = "i", descriptor = "I")
    public static int field164;

    @OriginalMember(owner = "client!qk", name = "k", descriptor = "I")
    public static int field166;

    @OriginalMember(owner = "client!qk", name = "m", descriptor = "[I")
    public static int[] field168;

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(Z)V", line = 4)
    public final void method75(boolean arg0) {
        class663 var2 = this.field159;
        synchronized (this.field159) {
            this.field159.method3749(7648);
        }
        if (!arg0) {
            field162++;
        }
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(ILin;IILr;IILua;B)V", line = 22)
    public static final void method76(int arg0, class78 arg1, int arg2, int arg3, class166 arg4, int arg5, int arg6, class618 arg7, byte arg8) {
        field164++;
        class165 var9 = class123.field1685.method3709((byte) 98, arg5);
        if (var9 != null && var9.field2413 && var9.method1158(class578.field8156, 120)) {
            if (var9.field2366 != null) {
                int[] var10 = new int[var9.field2366.length];
                for (int var11 = 0; var11 < var10.length / 2; var11++) {
                    int var13;
                    if (class203.field2863 == 4) {
                        var13 = (int) class705.field9964 & 0x3FFF;
                    } else {
                        var13 = (int) class705.field9964 + class174.field2526 & 0x3FFF;
                    }
                    int var14 = class597.field8342[var13];
                    int var15 = class597.field8344[var13];
                    if (class203.field2863 != 4) {
                        var15 = var15 * 256 / (class216.field3062 + 256);
                        var14 = var14 * 256 / (class216.field3062 + 256);
                    }
                    var10[var11 * 2] = ((var9.field2366[var11 * 2] * 4 + arg6) * var15 + (var9.field2366[var11 * 2 + 1] * 4 + arg2) * var14 >> 14) + arg1.field1104 / 2 + arg3;
                    var10[var11 * 2 + 1] = arg1.field1050 / 2 + (arg0 - ((var9.field2366[var11 * 2 + 1] * 4 + arg2) * var15 - ((var9.field2366[var11 * 2] * 4 + arg6) * var14) >> 14));
                }
                class642.method3568(arg4, var10, var9.field2383, arg1.field1032, arg1.field1049);
                for (int var12 = 0; var12 < (var10.length / 2 - 1); var12++) {
                    arg4.method199(var10[var12 * 2], var10[var12 * 2 + 1], var10[var12 * 2 + 2], var10[(var12 + 1) * 2 + 1], var9.field2369, 1, arg7, arg3, arg0);
                }
                arg4.method199(var10[var10.length - 2], var10[var10.length - 1], var10[0], var10[1], var9.field2369, 1, arg7, arg3, arg0);
            }
            class702 var16 = null;
            if (var9.field2405 != -1) {
                var16 = var9.method1153(-13665, false, arg4);
                if (var16 != null) {
                    class160.method1130(arg0, arg8 ^ 0xFFFFFEDE, arg2, arg7, arg3, arg1, var16, arg6);
                }
            }
            if (var9.field2406 != null) {
                int var17 = 0;
                if (var16 != null) {
                    var17 = var16.method1653();
                }
                class417 var18 = class499.field6781;
                class283 var19 = class166.field2419;
                if (var9.field2379 == 1) {
                    var19 = class136.field1916;
                    var18 = class273.field3741;
                }
                if (var9.field2379 == 2) {
                    var19 = class377.field5030;
                    var18 = class428.field5986;
                }
                class210.method1360(var17, var18, var19, arg3, arg7, arg1, arg0, arg6, arg2, var9.field2406, var9.field2373, (byte) 115);
            }
        }
        if (arg8 != -34) {
            method76(111, null, 1, 44, null, -32, 76, null, (byte) -70);
        }
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(B)V", line = 122)
    public final void method77(byte arg0) {
        field160++;
        class663 var2 = this.field159;
        synchronized (this.field159) {
            this.field159.method3755(19713);
        }
        int var3 = 27 / ((arg0 - 3) / 35);
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(II)Lwi;", line = 135)
    public final class430 method78(int arg0, int arg1) {
        field157++;
        class663 var3 = this.field159;
        class430 var4;
        synchronized (this.field159) {
            var4 = (class430) this.field159.method3747((byte) -66, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        class648 var5 = this.field156;
        byte[] var6;
        synchronized (this.field156) {
            var6 = this.field156.method3654(-15615, arg1, arg0);
        }
        class430 var7 = new class430();
        if (var6 != null) {
            var7.method2467((byte) 105, new class501(var6));
        }
        var7.method2468(arg1 - 162);
        class663 var8 = this.field159;
        synchronized (this.field159) {
            this.field159.method3748((long) arg0, var7, 12537);
            return var7;
        }
    }

    @OriginalMember(owner = "client!qk", name = "<init>", descriptor = "(Lci;ILsea;)V", line = 223)
    public class16(class414 arg0, int arg1, class648 arg2) {
        this.field156 = arg2;
        if (this.field156 != null) {
            this.field156.method3653(35, true);
        }
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(BI)V", line = 171)
    public final void method79(byte arg0, int arg1) {
        class663 var3 = this.field159;
        synchronized (this.field159) {
            this.field159.method3754(arg1, true);
            if (arg0 < 72) {
                this.method77((byte) -113);
            }
        }
        field161++;
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(I)V", line = 185)
    public static void method80(int arg0) {
        if (arg0 == 1) {
            field167 = null;
            field168 = null;
            field163 = null;
        }
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(Lsea;I)V", line = 197)
    public static final void method81(class648 arg0, int arg1) {
        field158++;
        if (arg1 < 29) {
            field165 = 18;
        }
        class575.field8140 = arg0.method3643("hitmarks", 1);
        class450.field6180 = arg0.method3643("hitbar_default", 1);
        class338.field4530 = arg0.method3643("timerbar_default", 1);
        class611.field8478 = arg0.method3643("headicons_pk", 1);
        class476.field6551 = arg0.method3643("headicons_prayer", 1);
        class619.field8611 = arg0.method3643("hint_headicons", 1);
        class65.field857 = arg0.method3643("hint_mapmarkers", 1);
        class576.field8143 = arg0.method3643("mapflag", 1);
        class171.field2471 = arg0.method3643("cross", 1);
        class158.field2307 = arg0.method3643("mapdots", 1);
        class409.field5808 = arg0.method3643("scrollbar", 1);
        class68.field924 = arg0.method3643("name_icons", 1);
        class62.field702 = arg0.method3643("floorshadows", 1);
        class71.field951 = arg0.method3643("compass", 1);
        class234.field3243 = arg0.method3643("otherlevel", 1);
        class623.field8649 = arg0.method3643("hint_mapedge", 1);
    }
}
