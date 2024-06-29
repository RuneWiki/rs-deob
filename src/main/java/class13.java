import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lg")
public class class13 extends class242 {

    @OriginalMember(owner = "client!lg", name = "T", descriptor = "I")
    private int field258 = 0;

    @OriginalMember(owner = "client!lg", name = "Z", descriptor = "I")
    private int field264 = 1;

    @OriginalMember(owner = "client!lg", name = "R", descriptor = "I")
    private int field256 = 0;

    @OriginalMember(owner = "client!lg", name = "W", descriptor = "I")
    public static volatile int field261 = 0;

    @OriginalMember(owner = "client!lg", name = "U", descriptor = "Lbb;")
    public static class90 field259 = new class90();

    @OriginalMember(owner = "client!lg", name = "bb", descriptor = "Lp;")
    public static class280 field266 = class18.method140((byte) -117, "Moteur son pr-Bpar-B");

    @OriginalMember(owner = "client!lg", name = "eb", descriptor = "I")
    public static int field269 = 0;

    @OriginalMember(owner = "client!lg", name = "S", descriptor = "I")
    public static int field257;

    @OriginalMember(owner = "client!lg", name = "V", descriptor = "I")
    public static int field260;

    @OriginalMember(owner = "client!lg", name = "X", descriptor = "I")
    public static int field262;

    @OriginalMember(owner = "client!lg", name = "Y", descriptor = "I")
    public static int field263;

    @OriginalMember(owner = "client!lg", name = "ab", descriptor = "I")
    public static int field265;

    @OriginalMember(owner = "client!lg", name = "cb", descriptor = "I")
    public static int field267;

    @OriginalMember(owner = "client!lg", name = "db", descriptor = "I")
    public static int field268;

    @OriginalMember(owner = "client!lg", name = "fb", descriptor = "I")
    public static int field270;

    @OriginalMember(owner = "client!lg", name = "gb", descriptor = "[Lp;")
    public static class280[] field271;

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(IILlj;)V")
    public final void method49(int arg0, int arg1, class25 arg2) {
        ++field267;
        if (arg0 > -119) {
            this.field256 = 59;
        }
        if (arg1 != 0) {
            if (arg1 != 1) {
                if (arg1 == 3) {
                    this.field264 = arg2.method189((byte) -103);
                }
            } else {
                this.field256 = arg2.method189((byte) -103);
            }
        } else {
            this.field258 = arg2.method189((byte) -103);
        }
    }

    @OriginalMember(owner = "client!lg", name = "<init>", descriptor = "()V")
    public class13() {
        super(0, true);
    }

    @OriginalMember(owner = "client!lg", name = "d", descriptor = "(III)V")
    public static final void method109(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < class78.field1281; ++var3) {
            for (int var4 = 0; var4 < class57.field928; ++var4) {
                for (int var5 = 0; var5 < class86.field1411; ++var5) {
                    class162 var6 = class220.field3787[var3][var4][var5];
                    if (var6 != null) {
                        class163 var7 = var6.field2849;
                        if (var7 != null && var7.field2870.method825()) {
                            class126.method875(var7.field2870, var3, var4, var5, 1, 1);
                            if (var7.field2865 != null && var7.field2865.method825()) {
                                class126.method875(var7.field2865, var3, var4, var5, 1, 1);
                                var7.field2870.method827(var7.field2865, 0, 0, 0, false);
                                var7.field2865 = var7.field2865.method828(arg0, arg1, arg2);
                            }
                            var7.field2870 = var7.field2870.method828(arg0, arg1, arg2);
                        }
                        for (int var8 = 0; var8 < var6.field2841; ++var8) {
                            class160 var10 = var6.field2845[var8];
                            if (var10 != null && var10.field2811.method825()) {
                                class126.method875(var10.field2811, var3, var4, var5, var10.field2790 - var10.field2814 + 1, var10.field2788 - var10.field2796 + 1);
                                var10.field2811 = var10.field2811.method828(arg0, arg1, arg2);
                            }
                        }
                        class245 var9 = var6.field2839;
                        if (var9 != null && var9.field4301.method825()) {
                            class107.method748(var9.field4301, var3, var4, var5);
                            var9.field4301 = var9.field4301.method828(arg0, arg1, arg2);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!lg", name = "b", descriptor = "(II)I")
    public static final int method110(int arg0, int arg1) {
        ++field260;
        int var2 = 117 % ((-31 - arg1) / 63);
        return 255 & arg0;
    }

    @OriginalMember(owner = "client!lg", name = "g", descriptor = "(I)V")
    public final void method111(int arg0) {
        if (arg0 >= 122) {
            class252.method1696(115);
            ++field257;
        }
    }

    @OriginalMember(owner = "client!lg", name = "i", descriptor = "(I)V")
    public static void method112(int arg0) {
        field266 = null;
        field259 = null;
        if (arg0 != -27030) {
            field262 = 92;
        }
        field271 = null;
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(B)I")
    public static final int method113(byte arg0) {
        ++field263;
        if (arg0 != 81) {
            field271 = null;
        }
        if ((double) class53.field866 == 3.0D) {
            return 37;
        } else if ((double) class53.field866 == 4.0D) {
            return 50;
        } else if ((double) class53.field866 == 6.0D) {
            return 75;
        } else {
            return (double) class53.field866 == 8.0D ? 100 : 200;
        }
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(IB)V")
    public static final void method114(int arg0, byte arg1) {
        if (arg1 > -59) {
            method114(-23, (byte) -50);
        }
        ++field268;
        class157 var2 = class257.method1740(arg0, (byte) 73, 6);
        var2.method1121(24223);
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(II)[I")
    public final int[] method54(int arg0, int arg1) {
        ++field270;
        int[] var3 = super.field4251.method1417((byte) 115, arg0);
        if (super.field4251.field3655) {
            int var4 = class117.field2106[arg0];
            int var5 = var4 - 2048 >> 1;
            for (int var6 = 0; ~var6 > ~class264.field4654; ++var6) {
                int var7 = class102.field1701[var6];
                int var8 = var7 - 2048 >> 1;
                int var11;
                if (~this.field258 != -1) {
                    int var9 = var5 * var5 + var8 * var8 >> 12;
                    int var10 = (int) (4096.0D * Math.sqrt((double) ((float) var9 / 4096.0F)));
                    var11 = (int) ((double) (this.field264 * var10) * 3.141592653589793D);
                } else {
                    var11 = (var7 - var4) * this.field264;
                }
                int var12 = var11 - (var11 & -4096);
                if (this.field256 != 0) {
                    if (~this.field256 == -3) {
                        var12 -= 2048;
                        if (~var12 > -1) {
                            var12 = -var12;
                        }
                        var12 = 2048 - var12 << 1;
                    }
                } else {
                    var12 = class201.field3516[255 & var12 >> 4] + 4096 >> 1;
                }
                var3[var6] = var12;
            }
        }
        int var13 = -101 % ((73 - arg1) / 41);
        return var3;
    }
}
