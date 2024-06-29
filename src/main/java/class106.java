import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!g")
public class class106 extends class278 {

    @OriginalMember(owner = "client!g", name = "I", descriptor = "Z")
    private boolean field1439 = true;

    @OriginalMember(owner = "client!g", name = "N", descriptor = "I")
    private int field1443 = 4096;

    @OriginalMember(owner = "client!g", name = "K", descriptor = "Z")
    public static boolean field1440 = true;

    @OriginalMember(owner = "client!g", name = "R", descriptor = "[I")
    public static int[] field1447 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!g", name = "L", descriptor = "I")
    public static int field1441;

    @OriginalMember(owner = "client!g", name = "O", descriptor = "I")
    public static int field1444;

    @OriginalMember(owner = "client!g", name = "P", descriptor = "I")
    public static int field1445;

    @OriginalMember(owner = "client!g", name = "Q", descriptor = "I")
    public static int field1446;

    @OriginalMember(owner = "client!g", name = "M", descriptor = "Lf;")
    public static class529 field1442;

    @OriginalMember(owner = "client!g", name = "<init>", descriptor = "()V")
    public class106() {
        super(1, false);
    }

    @OriginalMember(owner = "client!g", name = "d", descriptor = "(B)V")
    public static final void method689(byte arg0) {
        ++field1446;
        if (class310.field4243 != 0) {
            try {
                if (~(++class270.field3692) < -2001) {
                    if (class117.field1578 != null) {
                        class117.field1578.method644(-80);
                        class117.field1578 = null;
                    }
                    if (client.field2804 >= 1) {
                        class310.field4243 = 0;
                        class376.field5289 = -5;
                        return;
                    }
                    ++client.field2804;
                    class310.field4243 = 1;
                    class270.field3692 = 0;
                    if (class85.field1172 != class33.field472) {
                        class85.field1172 = class33.field472;
                    } else {
                        class85.field1172 = class325.field4460;
                    }
                }
                if (~class310.field4243 == -2) {
                    class456.field6668 = class282.field3804.method2281(true, class85.field1172, class54.field751);
                    class310.field4243 = 2;
                }
                if (~class310.field4243 == -3) {
                    if (~class456.field6668.field5652 == -3) {
                        throw new IOException();
                    }
                    if (class456.field6668.field5652 != 1) {
                        return;
                    }
                    class117.field1578 = new class95((Socket) class456.field6668.field5654, class282.field3804);
                    class456.field6668 = null;
                    class117.field1578.method643(class244.field3395.field5073, class244.field3395.field5069, -1, 0);
                    class362.method2026(-2757);
                    int var1 = class117.field1578.method650((byte) -24);
                    class362.method2026(-2757);
                    if (~var1 != -22) {
                        class376.field5289 = var1;
                        class310.field4243 = 0;
                        class117.field1578.method644(-112);
                        class117.field1578 = null;
                        return;
                    }
                    class310.field4243 = 3;
                }
                if (class310.field4243 == 3) {
                    if (~class117.field1578.method645((byte) -80) > -2) {
                        return;
                    }
                    class483.field7096 = new String[class117.field1578.method650((byte) -111)];
                    class310.field4243 = 4;
                }
                if (class310.field4243 == 4) {
                    if (class117.field1578.method645((byte) -117) < class483.field7096.length * 8) {
                        return;
                    }
                    class387.field5435.field5069 = 0;
                    class117.field1578.method649(class483.field7096.length * 8, false, 0, class387.field5435.field5073);
                    for (int var2 = 0; ~class483.field7096.length < ~var2; ++var2) {
                        class483.field7096[var2] = class310.method1760((byte) -57, class387.field5435.method2063(arg0 + 584310705));
                    }
                    class310.field4243 = 0;
                    class376.field5289 = 21;
                    class117.field1578.method644(-121);
                    class117.field1578 = null;
                    return;
                }
            } catch (IOException var3) {
                if (class117.field1578 != null) {
                    class117.field1578.method644(-101);
                    class117.field1578 = null;
                }
                if (client.field2804 < 1) {
                    if (~class85.field1172 != ~class33.field472) {
                        class85.field1172 = class33.field472;
                    } else {
                        class85.field1172 = class325.field4460;
                    }
                    class310.field4243 = 1;
                    class270.field3692 = 0;
                    ++client.field2804;
                } else {
                    class376.field5289 = -4;
                    class310.field4243 = 0;
                }
            }
            if (arg0 != -17) {
                field1447 = null;
            }
        }
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(Llh;II)V")
    public final void method210(class365 arg0, int arg1, int arg2) {
        if (~arg2 != -1) {
            if (~arg2 == -2) {
                this.field1439 = arg0.method2099(255) == 1;
            }
        } else {
            this.field1443 = arg0.method2062((byte) 14);
        }
        if (arg1 != -30446) {
            this.method210((class365) null, 81, 61);
        }
        ++field1441;
    }

    @OriginalMember(owner = "client!g", name = "e", descriptor = "(B)V")
    public static void method690(byte arg0) {
        int var1 = 72 / ((64 - arg0) / 38);
        field1442 = null;
        field1447 = null;
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(II)[[I")
    public final int[][] method324(int arg0, int arg1) {
        ++field1445;
        int[][] var3 = super.field3757.method1450(arg1, -1);
        if (arg0 < 75) {
            method691((class22) null, (byte) -97);
        }
        if (super.field3757.field3420) {
            int[] var4 = this.method1570(0, 0, arg1 + -1 & class40.field549);
            int[] var5 = this.method1570(0, 0, arg1);
            int[] var6 = this.method1570(0, 0, arg1 + 1 & class40.field549);
            int[] var7 = var3[0];
            int[] var8 = var3[1];
            int[] var9 = var3[2];
            for (int var10 = 0; var10 < class507.field7456; ++var10) {
                int var11 = (var6[var10] - var4[var10]) * this.field1443;
                int var12 = (var5[class412.field6045 & var10 + 1] + -var5[class412.field6045 & var10 + -1]) * this.field1443;
                int var13 = var12 >> 12;
                int var14 = var11 >> 12;
                int var15 = var13 * var13 >> 12;
                int var16 = var14 * var14 >> 12;
                int var17 = (int) (4096.0D * Math.sqrt((double) ((float) (var15 - -var16 + 4096) / 4096.0F)));
                int var18;
                int var19;
                int var20;
                if (var17 == 0) {
                    var18 = 0;
                    var19 = 0;
                    var20 = 0;
                } else {
                    var20 = var11 / var17;
                    var18 = 16777216 / var17;
                    var19 = var12 / var17;
                }
                if (this.field1439) {
                    var18 = (var18 >> 1) + 2048;
                    var19 = (var19 >> 1) + 2048;
                    var20 = (var20 >> 1) + 2048;
                }
                var7[var10] = var19;
                var8[var10] = var20;
                var9[var10] = var18;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(Lir;B)I")
    public static final int method691(class22 arg0, byte arg1) {
        ++field1444;
        if (arg0.field333 == 0) {
            return 0;
        } else {
            if (~arg0.field289 != 0) {
                class22 var2 = null;
                if (~arg0.field289 <= -32769) {
                    if (~arg0.field289 <= -32769) {
                        var2 = class309.field4234[arg0.field289 + -32768];
                    }
                } else {
                    var2 = class179.field2534[arg0.field289];
                }
                if (var2 != null) {
                    int var3 = arg0.field466 - var2.field466;
                    int var4 = -var2.field461 + arg0.field461;
                    if (~var3 != -1 || ~var4 != -1) {
                        arg0.method158((int) (2607.5945876176133D * Math.atan2((double) var3, (double) var4)) & 16383, true);
                    }
                }
            }
            if (arg0 instanceof class192) {
                class192 var5 = (class192) arg0;
                if (~var5.field2713 != 0 && (var5.field368 == 0 || ~var5.field371 < -1)) {
                    var5.method158(var5.field2713, true);
                    var5.field2713 = -1;
                }
            } else if (arg0 instanceof class405) {
                class405 var6 = (class405) arg0;
                if (~var6.field5619 != 0 && (var6.field368 == 0 || var6.field371 > 0)) {
                    int var7 = var6.field466 - (-class215.field3059 + var6.field5619 + -class215.field3059) * 64;
                    int var8 = var6.field461 - (-class79.field1134 + -class79.field1134 + var6.field5618) * 64;
                    if (~var7 != -1 || var8 != 0) {
                        var6.method158((int) (2607.5945876176133D * Math.atan2((double) var7, (double) var8)) & 16383, true);
                    }
                    var6.field5619 = -1;
                }
            }
            return arg1 >= -49 ? -103 : arg0.method156((byte) -126);
        }
    }
}
