import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mga")
public class class660 extends class375 {

    @OriginalMember(owner = "client!mga", name = "A", descriptor = "Ldg;")
    public static class376 field9336 = new class376(74, 3);

    @OriginalMember(owner = "client!mga", name = "v", descriptor = "I")
    public static int field9331;

    @OriginalMember(owner = "client!mga", name = "w", descriptor = "I")
    public static int field9332;

    @OriginalMember(owner = "client!mga", name = "x", descriptor = "I")
    public static int field9333;

    @OriginalMember(owner = "client!mga", name = "y", descriptor = "I")
    public static int field9334;

    @OriginalMember(owner = "client!mga", name = "C", descriptor = "I")
    public static int field9338;

    @OriginalMember(owner = "client!mga", name = "D", descriptor = "I")
    public static int field9339;

    @OriginalMember(owner = "client!mga", name = "F", descriptor = "I")
    public static int field9341;

    @OriginalMember(owner = "client!mga", name = "u", descriptor = "Ljava/lang/String;")
    public String field9330;

    @OriginalMember(owner = "client!mga", name = "z", descriptor = "[C")
    public char[] field9335;

    @OriginalMember(owner = "client!mga", name = "E", descriptor = "[C")
    public char[] field9340;

    @OriginalMember(owner = "client!mga", name = "t", descriptor = "[I")
    public int[] field9329;

    @OriginalMember(owner = "client!mga", name = "B", descriptor = "[I")
    public int[] field9337;

    @OriginalMember(owner = "client!mga", name = "d", descriptor = "(B)V")
    public static final void method3654(byte arg0) {
        class120.field1823.method2285((byte) -126);
        field9332++;
        class138.field2010.method2285((byte) -115);
        class123.field1855.method2285((byte) -117);
        if (arg0 >= -109) {
            method3656(-112);
        }
        class201.field2841.method2285((byte) -111);
    }

    @OriginalMember(owner = "client!mga", name = "a", descriptor = "(Lmo;I)V")
    public final void method3655(class695 arg0, int arg1) {
        if (arg1 < 101) {
            this.field9335 = null;
        }
        field9333++;
        while (true) {
            int var3 = arg0.method3826(false);
            if (var3 == 0) {
                return;
            }
            this.method3658(arg0, var3, (byte) 77);
        }
    }

    @OriginalMember(owner = "client!mga", name = "a", descriptor = "(I)V")
    public static void method3656(int arg0) {
        field9336 = null;
        if (arg0 != 15837) {
            method3656(96);
        }
    }

    @OriginalMember(owner = "client!mga", name = "c", descriptor = "(I)V")
    public final void method3657(int arg0) {
        if (arg0 != 11894) {
            return;
        }
        field9331++;
        if (this.field9337 != null) {
            for (int var2 = 0; var2 < this.field9337.length; var2++) {
                this.field9337[var2] = class486.method2826(this.field9337[var2], 32768);
            }
        }
        if (this.field9329 != null) {
            for (int var3 = 0; var3 < this.field9329.length; var3++) {
                this.field9329[var3] = class486.method2826(this.field9329[var3], 32768);
            }
        }
    }

    @OriginalMember(owner = "client!mga", name = "a", descriptor = "(Lmo;IB)V")
    private final void method3658(class695 arg0, int arg1, byte arg2) {
        if (arg2 != 77) {
            return;
        }
        field9341++;
        if (arg1 == 1) {
            this.field9330 = arg0.method3836(false);
        } else if (arg1 == 2) {
            int var7 = arg0.method3826(false);
            this.field9340 = new char[var7];
            this.field9329 = new int[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field9329[var8] = arg0.method3847((byte) 118);
                byte var9 = arg0.method3827((byte) -74);
                this.field9340[var8] = var9 == 0 ? 0 : class178.method1210(32062, var9);
            }
        } else if (arg1 == 3) {
            int var4 = arg0.method3826(false);
            this.field9337 = new int[var4];
            this.field9335 = new char[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field9337[var5] = arg0.method3847((byte) 118);
                byte var6 = arg0.method3827((byte) -111);
                this.field9335[var5] = var6 == 0 ? 0 : class178.method1210(32062, var6);
            }
            return;
        }
    }

    @OriginalMember(owner = "client!mga", name = "a", descriptor = "(IC)I")
    public final int method3659(int arg0, char arg1) {
        field9339++;
        if (this.field9329 == null) {
            return -1;
        }
        for (int var3 = 0; var3 < this.field9329.length; var3++) {
            if (this.field9340[var3] == arg1) {
                return this.field9329[var3];
            }
        }
        return arg0 == -1 ? -1 : 22;
    }

    @OriginalMember(owner = "client!mga", name = "c", descriptor = "(Z)V")
    public static final void method3660(boolean arg0) {
        field9334++;
        int var1 = class583.field8197.length;
        if (arg0) {
            field9336 = null;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            if (class583.field8197[var2] != null) {
                int var3 = -1;
                for (int var4 = 0; var4 < class127.field1894; var4++) {
                    if (class354.field5084[var4] == class273.field4105[var2]) {
                        var3 = var4;
                        break;
                    }
                }
                if (var3 == -1) {
                    class354.field5084[class127.field1894] = class273.field4105[var2];
                    var3 = class127.field1894++;
                }
                class695 var5 = new class695(class583.field8197[var2]);
                int var6 = 0;
                while (class583.field8197[var2].length > var5.field9761 && var6 < 511 && class217.field3042 < 1023) {
                    int var7 = var6++ << 6 | var3;
                    int var8 = var5.method3847((byte) 118);
                    int var9 = var8 >> 14;
                    int var10 = var8 >> 7 & 0x3F;
                    int var11 = var8 & 0x3F;
                    int var12 = (class273.field4105[var2] >> 8) * 64 + var10 - class109.field1672;
                    int var13 = (class273.field4105[var2] & 0xFF) * 64 + var11 - class203.field2874;
                    class592 var14 = class393.field5824.method362(var5.method3847((byte) 118), (byte) 84);
                    class16 var15 = (class16) class189.field2723.method1405((long) var7, (byte) -99);
                    if (var15 == null && (var14.field8330 & 0x1) > 0 && class97.field1532 == var9 && var12 >= 0 && class199.field2812 > (var14.field8345 + var12) && var13 >= 0 && class232.field3611 > var14.field8345 + var13) {
                        class577 var16 = new class577();
                        var16.field6216 = var7;
                        class16 var17 = new class16(var16);
                        class189.field2723.method1403((byte) -18, var17, (long) var7);
                        class261.field3968[class428.field6288++] = var17;
                        class85.field1396[class217.field3042++] = var7;
                        var16.field6170 = class564.field7962;
                        var16.method3275(var14, (byte) 87);
                        var16.method2548(0, var16.field8121.field8345);
                        var16.field6195 = var16.field8121.field8312 << 3;
                        var16.method2554(var16.field8121.field8318 + 4 << 11 & 0x3DDD, (byte) 85, true);
                        var16.method3273(var12, var16.method2553((byte) 91), true, var13, var9, false);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!mga", name = "b", descriptor = "(IC)I")
    public final int method3661(int arg0, char arg1) {
        field9338++;
        if (this.field9337 == null) {
            return -1;
        } else if (arg0 < 93) {
            return -110;
        } else {
            for (int var3 = 0; var3 < this.field9337.length; var3++) {
                if (this.field9335[var3] == arg1) {
                    return this.field9337[var3];
                }
            }
            return -1;
        }
    }
}
