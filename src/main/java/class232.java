import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fd")
public class class232 extends class261 {

    @OriginalMember(owner = "client!fd", name = "H", descriptor = "I")
    private int field3842 = 32768;

    @OriginalMember(owner = "client!fd", name = "S", descriptor = "I")
    public static int field3851 = 0;

    @OriginalMember(owner = "client!fd", name = "Q", descriptor = "Lve;")
    public static class255 field3849 = class87.method607(64, "welle:");

    @OriginalMember(owner = "client!fd", name = "G", descriptor = "Lve;")
    public static class255 field3841 = class87.method607(35, "hint_mapmarkers");

    @OriginalMember(owner = "client!fd", name = "O", descriptor = "I")
    public static int field3847 = 0;

    @OriginalMember(owner = "client!fd", name = "F", descriptor = "I")
    public static int field3840;

    @OriginalMember(owner = "client!fd", name = "J", descriptor = "I")
    public static int field3843;

    @OriginalMember(owner = "client!fd", name = "K", descriptor = "I")
    public static int field3844;

    @OriginalMember(owner = "client!fd", name = "M", descriptor = "I")
    public static int field3845;

    @OriginalMember(owner = "client!fd", name = "N", descriptor = "I")
    public static int field3846;

    @OriginalMember(owner = "client!fd", name = "P", descriptor = "I")
    public static int field3848;

    @OriginalMember(owner = "client!fd", name = "R", descriptor = "I")
    public static int field3850;

    @OriginalMember(owner = "client!fd", name = "U", descriptor = "I")
    public static int field3853;

    @OriginalMember(owner = "client!fd", name = "V", descriptor = "I")
    public static int field3854;

    @OriginalMember(owner = "client!fd", name = "W", descriptor = "I")
    public static int field3855;

    @OriginalMember(owner = "client!fd", name = "X", descriptor = "I")
    public static int field3856;

    @OriginalMember(owner = "client!fd", name = "T", descriptor = "Ldl;")
    public static class34 field3852;

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(BZ)V", line = 8)
    public static final void method1606(byte arg0, boolean arg1) {
        if (class96.field1664 == null) {
            class96.field1664 = new byte[4][104][104];
        }
        for (int var2 = 0; var2 < 4; var2++) {
            for (int var3 = 0; var3 < 104; var3++) {
                for (int var4 = 0; var4 < 104; var4++) {
                    class96.field1664[var2][var3][var4] = arg0;
                }
            }
        }
        if (arg1) {
            field3847 = 62;
        }
        field3843++;
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(Lpb;BI)V", line = 50)
    public final void method20(class70 arg0, byte arg1, int arg2) {
        if (arg1 > -115) {
            this.method111((byte) 88);
        }
        field3855++;
        if (arg2 == 0) {
            this.field3842 = arg0.method423(255) << 4;
        } else if (arg2 == 1) {
            this.field4434 = arg0.method481(0) == 1;
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(BLpb;)V", line = 88)
    public static final void method1607(byte arg0, class70 arg1) {
        if (arg0 > -111) {
            method1608((byte) -17);
        }
        for (int var2 = 0; var2 < class206.field3539; var2++) {
            int var3 = arg1.method486((byte) 64);
            int var4 = arg1.method423(255);
            if (var4 == 65535) {
                var4 = -1;
            }
            if (class213.field3631[var3] != null) {
                class213.field3631[var3].field359 = var4;
            }
        }
        field3848++;
    }

    @OriginalMember(owner = "client!fd", name = "h", descriptor = "(B)V", line = 117)
    public static void method1608(byte arg0) {
        field3841 = null;
        field3852 = null;
        field3849 = null;
        if (arg0 > -23) {
            method1608((byte) -102);
        }
    }

    @OriginalMember(owner = "client!fd", name = "g", descriptor = "(B)V", line = 130)
    public final void method111(byte arg0) {
        class254.method1735(arg0 ^ 0xFFFFFF9D);
        if (arg0 != -57) {
            field3851 = 125;
        }
        field3854++;
    }

    @OriginalMember(owner = "client!fd", name = "<init>", descriptor = "()V", line = 153)
    public class232() {
        super(3, false);
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(ZIILn;II)V", line = 157)
    public static final void method1609(boolean arg0, int arg1, int arg2, class271 arg3, int arg4, int arg5) {
        field3844++;
        if (class255.field4356 >= 50 || arg3.field4672 == null || arg3.field4672.length <= arg2 || arg3.field4672[arg2] == null) {
            return;
        }
        int var6 = arg3.field4672[arg2][0];
        int var7 = var6 >> 4 & 0x7;
        int var8 = var6 & 0xF;
        int var9 = var6 >> 8;
        if (arg3.field4672[arg2].length > 1) {
            int var10 = (int) ((double) arg3.field4672[arg2].length * Math.random());
            if (var10 > 0) {
                var9 = arg3.field4672[arg2][var10];
            }
        }
        if (var8 == 0) {
            if (arg0) {
                class2.method6(var7, var9, (byte) 91, 0);
            }
        } else if (class301.field5169 != 0) {
            class25.field410[class255.field4356] = var9;
            class124.field2054[class255.field4356] = var7;
            class25.field406[class255.field4356] = 0;
            int var11 = (arg4 - 64) / 128;
            int var12 = (arg1 - 64) / 128;
            if (arg5 == 26694) {
                class269.field4626[class255.field4356] = null;
                class255.field4357[class255.field4356] = (var12 << 16) + (var11 << 8) + var8;
                class255.field4356++;
            }
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(ZI)[[I", line = 217)
    public final int[][] method13(boolean arg0, int arg1) {
        field3840++;
        int[][] var3 = this.field4418.method35(arg1, 118);
        if (this.field4418.field94) {
            int[] var4 = this.method1822(1, 56, arg1);
            int[] var5 = this.method1822(2, 63, arg1);
            int[] var6 = var3[2];
            int[] var7 = var3[0];
            int[] var8 = var3[1];
            for (int var9 = 0; var9 < class92.field1576; var9++) {
                int var10 = var4[var9] * 255 >> 12 & 0xFF;
                int var11 = var5[var9] * this.field3842 >> 12;
                int var12 = class107.field1800[var10] * var11 >> 12;
                int var13 = class72.field1188[var10] * var11 >> 12;
                int var14 = (var12 >> 12) + arg1 & class250.field4205;
                int var15 = var9 + (var13 >> 12) & class77.field1260;
                int[][] var16 = this.method1819(-103, 0, var14);
                var7[var9] = var16[0][var15];
                var8[var9] = var16[1][var15];
                var6[var9] = var16[2][var15];
            }
        }
        if (!arg0) {
            method1607((byte) -73, (class70) null);
        }
        return var3;
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(IZLve;)V", line = 279)
    public static final void method1610(int arg0, boolean arg1, class255 arg2) {
        field3850++;
        if (arg0 != 6081) {
            field3849 = (class255) null;
        }
        int var3 = 0;
        class255 var4 = arg2.method1777(-157);
        short[] var5 = new short[16];
        for (int var6 = 0; var6 < class137.field2289; var6++) {
            class192 var7 = class132.method990((byte) -119, var6);
            if ((!arg1 || var7.field3108) && var7.field3130 == -1 && var7.field3060 == -1 && var7.field3118 == 0 && var7.field3112.method1777(-157).method1790((byte) 124, var4) != -1) {
                if (var3 >= 250) {
                    class133.field2219 = null;
                    class291.field4991 = -1;
                    return;
                }
                if (var5.length <= var3) {
                    short[] var8 = new short[var5.length * 2];
                    for (int var9 = 0; var9 < var3; var9++) {
                        var8[var9] = var5[var9];
                    }
                    var5 = var8;
                }
                var5[var3++] = (short) var6;
            }
        }
        class49.field744 = 0;
        class133.field2219 = var5;
        class291.field4991 = var3;
        class255[] var10 = new class255[class291.field4991];
        for (int var11 = 0; var11 < class291.field4991; var11++) {
            var10[var11] = class132.method990((byte) -119, var5[var11]).field3112;
        }
        class220.method1549(0, class133.field2219, var10);
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(IB)Lib;", line = 359)
    public static final class87 method1611(int arg0, byte arg1) {
        field3856++;
        if (arg1 > -101) {
            return (class87) null;
        }
        class87 var2 = (class87) class301.field5142.method558((long) arg0, true);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class244.field4118.method636(class265.method1845(arg0, -1274626424), (byte) 124, class43.method263((byte) 107, arg0));
        class87 var4 = new class87();
        var4.field1405 = arg0;
        if (var3 != null) {
            var4.method603(false, new class70(var3));
        }
        class301.field5142.method555(var4, (long) arg0, 0);
        return var4;
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(BLve;I)V", line = 386)
    public static final void method1612(byte arg0, class255 arg1, int arg2) {
        if (arg0 <= 51) {
            field3841 = (class255) null;
        }
        field3845++;
        class53 var3 = class303.method2112(-1155040160, arg2, 3);
        var3.method325((byte) -102);
        var3.field822 = arg1;
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(BI)[I", line = 406)
    public final int[] method21(byte arg0, int arg1) {
        int var3 = 87 % ((arg0 + 49) / 33);
        field3846++;
        int[] var4 = this.field4425.method906(arg1, 8251);
        if (this.field4425.field2043) {
            int[] var5 = this.method1822(1, 9, arg1);
            int[] var6 = this.method1822(2, 36, arg1);
            for (int var7 = 0; var7 < class92.field1576; var7++) {
                int var8 = var5[var7] >> 4 & 0xFF;
                int var9 = var6[var7] * this.field3842 >> 12;
                int var10 = class72.field1188[var8] * var9 >> 12;
                int var11 = class107.field1800[var8] * var9 >> 12;
                int var12 = var7 + (var10 >> 12) & class77.field1260;
                int var13 = class250.field4205 & (var11 >> 12) + arg1;
                int[] var14 = this.method1822(0, 106, var13);
                var4[var7] = var14[var12];
            }
        }
        return var4;
    }
}
