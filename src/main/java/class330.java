import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eg")
public class class330 {

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "Lcm;")
    private class368 field4859 = null;

    @OriginalMember(owner = "client!eg", name = "i", descriptor = "I")
    private int field4867 = 65000;

    @OriginalMember(owner = "client!eg", name = "l", descriptor = "Lcm;")
    private class368 field4870 = null;

    @OriginalMember(owner = "client!eg", name = "f", descriptor = "I")
    private int field4864;

    @OriginalMember(owner = "client!eg", name = "e", descriptor = "I")
    public static int field4863 = 2;

    @OriginalMember(owner = "client!eg", name = "j", descriptor = "I")
    public static int field4868 = 0;

    @OriginalMember(owner = "client!eg", name = "b", descriptor = "I")
    public static int field4860;

    @OriginalMember(owner = "client!eg", name = "c", descriptor = "I")
    public static int field4861;

    @OriginalMember(owner = "client!eg", name = "d", descriptor = "I")
    public static int field4862;

    @OriginalMember(owner = "client!eg", name = "g", descriptor = "I")
    public static int field4865;

    @OriginalMember(owner = "client!eg", name = "h", descriptor = "I")
    public static int field4866;

    @OriginalMember(owner = "client!eg", name = "k", descriptor = "I")
    public static int field4869;

    @OriginalMember(owner = "client!eg", name = "m", descriptor = "I")
    public static int field4871;

    @OriginalMember(owner = "client!eg", name = "n", descriptor = "I")
    public static int field4872;

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(I)V", line = 9)
    public static final void method2160(int arg0) {
        field4866++;
        if (class200.field2769 > class200.field2765) {
            class200.field2765 = (float) ((double) class200.field2765 / 30.0D + (double) class200.field2765);
            if (class200.field2769 < class200.field2765) {
                class200.field2765 = class200.field2769;
            }
            class338.method2198((byte) 102);
            class200.field2762 = (int) class200.field2765 >> 1;
            class200.field2760 = class383.method2491(0, class200.field2762);
        } else if (class200.field2769 < class200.field2765) {
            class200.field2765 = (float) ((double) class200.field2765 - (double) class200.field2765 / 30.0D);
            if (class200.field2769 > class200.field2765) {
                class200.field2765 = class200.field2769;
            }
            class338.method2198((byte) 104);
            class200.field2762 = (int) class200.field2765 >> 1;
            class200.field2760 = class383.method2491(0, class200.field2762);
        }
        if (class248.field3655 != -1 && class222.field3067 != -1) {
            int var1 = class248.field3655 - class297.field4487;
            if (var1 < 2 || var1 > 2) {
                var1 >>= 0x4;
            }
            int var2 = class222.field3067 - class85.field1184;
            if (var2 < 2 || var2 > 2) {
                var2 >>= 0x4;
            }
            class297.field4487 -= -var1;
            class85.field1184 += var2;
            if (var1 == 0 && var2 == 0) {
                class248.field3655 = -1;
                class222.field3067 = -1;
            }
            class338.method2198((byte) 105);
        }
        if (arg0 > ~class280.field4118) {
            class184.field2463--;
            if (class184.field2463 == 0) {
                class184.field2463 = 100;
                class280.field4118--;
            }
        } else {
            class396.field5784 = -1;
            class169.field2281 = -1;
        }
        if (!class384.field5616 || class394.field5730 == null) {
            return;
        }
        for (class167 var3 = (class167) class394.field5730.method1575(~arg0); var3 != null; var3 = (class167) class394.field5730.method1573((byte) -128)) {
            class170 var4 = class174.method1160(-28930, var3.field2260.field462);
            if (class192.field2680 == 0 && var3.method1124(-1, class217.field3032, class277.field4060)) {
                if (var4.field2310 != null) {
                    if (var4.field2310[4] != null) {
                        class24.method213(0, var4.field2310[4], var4.field2320, -1, (byte) 99, (long) var3.field2260.field462, var4.field2299, 1006);
                    }
                    if (var4.field2310[3] != null) {
                        class24.method213(0, var4.field2310[3], var4.field2320, -1, (byte) 118, (long) var3.field2260.field462, var4.field2299, 1004);
                    }
                    if (var4.field2310[2] != null) {
                        class24.method213(0, var4.field2310[2], var4.field2320, -1, (byte) 104, (long) var3.field2260.field462, var4.field2299, 1012);
                    }
                    if (var4.field2310[1] != null) {
                        class24.method213(0, var4.field2310[1], var4.field2320, -1, (byte) 103, (long) var3.field2260.field462, var4.field2299, 1007);
                    }
                    if (var4.field2310[0] != null) {
                        class24.method213(0, var4.field2310[0], var4.field2320, -1, (byte) 104, (long) var3.field2260.field462, var4.field2299, 1001);
                    }
                }
                if (!var3.field2260.field458) {
                    var3.field2260.field458 = true;
                    class293.method1985(15, var3.field2260.field462, var4.field2299);
                }
                if (var3.field2260.field458) {
                    class293.method1985(17, var3.field2260.field462, var4.field2299);
                }
            } else if (var3.field2260.field458) {
                var3.field2260.field458 = false;
                class293.method1985(16, var3.field2260.field462, var4.field2299);
            }
        }
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(IBI[B)Z", line = 149)
    public final boolean method2161(int arg0, byte arg1, int arg2, byte[] arg3) {
        field4860++;
        class368 var5 = this.field4870;
        synchronized (this.field4870) {
            if (arg1 > -96) {
                this.field4867 = 30;
            }
            if (arg0 < 0 || this.field4867 < arg0) {
                throw new IllegalArgumentException();
            }
            boolean var6 = this.method2162(true, arg0, arg3, 113, arg2);
            if (!var6) {
                var6 = this.method2162(false, arg0, arg3, 126, arg2);
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(ZI[BII)Z", line = 175)
    private final boolean method2162(boolean arg0, int arg1, byte[] arg2, int arg3, int arg4) {
        field4862++;
        class368 var6 = this.field4870;
        synchronized (this.field4870) {
            try {
                if (arg3 <= 111) {
                    field4863 = -114;
                }
                int var7;
                if (arg0) {
                    if ((long) (arg4 * 6 + 6) > this.field4859.method2422(-99)) {
                        return false;
                    }
                    this.field4859.method2419(0, (long) (arg4 * 6));
                    this.field4859.method2425(-1, 6, class431.field6274, 0);
                    var7 = (class431.field6274[5] & 0xFF) + (class431.field6274[4] & 0xFF << 8) + (class431.field6274[3] & 0xFF << 16);
                    if (var7 <= 0 || this.field4870.method2422(77) / 520L < (long) var7) {
                        return false;
                    }
                } else {
                    var7 = (int) ((this.field4870.method2422(52) + 519L) / 520L);
                    if (var7 == 0) {
                        var7 = 1;
                    }
                }
                class431.field6274[2] = (byte) arg1;
                class431.field6274[3] = (byte) (var7 >> 16);
                class431.field6274[1] = (byte) (arg1 >> 8);
                class431.field6274[4] = (byte) (var7 >> 8);
                class431.field6274[0] = (byte) (arg1 >> 16);
                class431.field6274[5] = (byte) var7;
                this.field4859.method2419(0, (long) (arg4 * 6));
                this.field4859.method2420(6, -1, 0, class431.field6274);
                int var10 = 0;
                int var11 = 0;
                while (var10 < arg1) {
                    int var12 = 0;
                    if (arg0) {
                        label109: {
                            this.field4870.method2419(0, (long) (var7 * 520));
                            try {
                                this.field4870.method2425(-1, 8, class431.field6274, 0);
                            } catch (EOFException var33) {
                                return true;
                            }
                            int var13 = ((class431.field6274[0] & 0xFF) << 8) + (class431.field6274[1] & 0xFF);
                            var12 = (class431.field6274[6] & 0xFF) + (class431.field6274[5] & 0xFF << 8) + (class431.field6274[4] & 0xFF << 16);
                            int var14 = (class431.field6274[2] & 0xFF << 8) + (class431.field6274[3] & 0xFF);
                            int var15 = class431.field6274[7] & 0xFF;
                            if (arg4 == var13 && var11 == var14 && this.field4864 == var15) {
                                if (var12 >= 0 && (this.field4870.method2422(66) / 520L) >= ((long) var12)) {
                                    break label109;
                                }
                                return false;
                            }
                            return false;
                        }
                    }
                    if (var12 == 0) {
                        var12 = (int) ((this.field4870.method2422(89) + 519L) / 520L);
                        arg0 = false;
                        if (var12 == 0) {
                            var12++;
                        }
                        if (var7 == var12) {
                            var12++;
                        }
                    }
                    class431.field6274[1] = (byte) arg4;
                    class431.field6274[3] = (byte) var11;
                    if (arg1 - var10 <= 512) {
                        var12 = 0;
                    }
                    class431.field6274[0] = (byte) (arg4 >> 8);
                    class431.field6274[2] = (byte) (var11 >> 8);
                    class431.field6274[5] = (byte) (var12 >> 8);
                    class431.field6274[6] = (byte) var12;
                    class431.field6274[7] = (byte) this.field4864;
                    class431.field6274[4] = (byte) (var12 >> 16);
                    this.field4870.method2419(0, (long) (var7 * 520));
                    this.field4870.method2420(8, -1, 0, class431.field6274);
                    int var18 = arg1 - var10;
                    if (var18 > 512) {
                        var18 = 512;
                    }
                    this.field4870.method2420(var18, -1, var10, arg2);
                    var10 += var18;
                    var11++;
                    var7 = var12;
                }
                return true;
            } catch (IOException var34) {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!eg", name = "<init>", descriptor = "(ILcm;Lcm;I)V", line = 413)
    public class330(int arg0, class368 arg1, class368 arg2, int arg3) {
        this.field4859 = arg2;
        this.field4864 = arg0;
        this.field4867 = arg3;
        this.field4870 = arg1;
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(II)[B", line = 311)
    public final byte[] method2163(int arg0, int arg1) {
        field4872++;
        class368 var3 = this.field4870;
        synchronized (this.field4870) {
            try {
                if (this.field4859.method2422(-118) < (long) (arg0 * 6 + 6)) {
                    return null;
                }
                this.field4859.method2419(0, (long) (arg0 * 6));
                this.field4859.method2425(-1, 6, class431.field6274, 0);
                int var5 = ((class431.field6274[1] & 0xFF) << 8) + ((class431.field6274[0] & 0xFF << 16) + (class431.field6274[2] & 0xFF));
                int var6 = (class431.field6274[5] & 0xFF) + ((class431.field6274[4] & 0xFF) << 8) + ((class431.field6274[3] & 0xFF) << 16);
                if (var5 < 0 || var5 > this.field4867) {
                    return null;
                } else if (var6 > 0 && (long) var6 <= this.field4870.method2422(-80) / 520L) {
                    if (arg1 < 89) {
                        this.method2161(58, (byte) -22, 88, (byte[]) null);
                    }
                    byte[] var9 = new byte[var5];
                    int var10 = 0;
                    int var11 = 0;
                    while (var10 < var5) {
                        if (var6 == 0) {
                            return null;
                        }
                        this.field4870.method2419(0, (long) (var6 * 520));
                        int var13 = var5 - var10;
                        if (var13 > 512) {
                            var13 = 512;
                        }
                        this.field4870.method2425(-1, var13 + 8, class431.field6274, 0);
                        int var14 = ((class431.field6274[0] & 0xFF) << 8) + (class431.field6274[1] & 0xFF);
                        int var15 = (class431.field6274[2] & 0xFF << 8) + (class431.field6274[3] & 0xFF);
                        int var16 = (class431.field6274[5] & 0xFF << 8) + ((class431.field6274[4] & 0xFF) << 16) + (class431.field6274[6] & 0xFF);
                        int var17 = class431.field6274[7] & 0xFF;
                        if (arg0 == var14 && var11 == var15 && this.field4864 == var17) {
                            if (var16 >= 0 && (this.field4870.method2422(44) / 520L) >= ((long) var16)) {
                                var11++;
                                for (int var20 = 0; var20 < var13; var20++) {
                                    var9[var10++] = class431.field6274[var20 + 8];
                                }
                                var6 = var16;
                                continue;
                            }
                            return null;
                        }
                        return null;
                    }
                    return var9;
                } else {
                    return null;
                }
            } catch (IOException var39) {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!eg", name = "toString", descriptor = "()Ljava/lang/String;", line = 400)
    public final String toString() {
        field4869++;
        return "Cache:" + this.field4864;
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(ZI)Ltf;", line = 427)
    public static final class45 method2164(boolean arg0, int arg1) {
        field4861++;
        class51 var2 = class424.field6173;
        class45 var3;
        synchronized (class424.field6173) {
            var3 = (class45) class424.field6173.method378((byte) 28, (long) arg1);
        }
        if (var3 != null) {
            return var3;
        }
        byte[] var4 = class353.field5234.method1235(3, !arg0, arg1);
        class45 var5 = new class45();
        if (var4 != null) {
            var5.method326(new class341(var4), (byte) 86);
        }
        class51 var6 = class424.field6173;
        synchronized (class424.field6173) {
            class424.field6173.method367((long) arg1, var5, arg0);
        }
        return arg0 ? var5 : null;
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(Lqc;I)V", line = 458)
    public static final void method2165(class163 arg0, int arg1) {
        field4871++;
        if (class402.field5874 >= 400) {
            return;
        }
        class189 var2 = arg0.field2206;
        if (var2.field2575 != null) {
            var2 = var2.method1253(-1);
            if (var2 == null) {
                return;
            }
        }
        if (arg1 != -1379) {
            method2165((class163) null, 12);
        }
        if (!var2.field2630) {
            return;
        }
        String var3 = var2.field2589;
        if (var2.field2615 != 0) {
            String var4 = class396.field5783 == 1 ? class7.field97 : class104.field1358;
            var3 = var3 + class1.method1(var2.field2615, -4725, class383.field5609.field4661) + " (" + var4 + var2.field2615 + ")";
        }
        if (class117.field1526 == 1) {
            class24.method213(0, class429.field6239, class369.field5455 + " -> <col=ffff00>" + var3, class407.field5935, (byte) 106, (long) arg0.field2183, 0, 37);
            class142.field1808++;
        } else if (class263.field3862) {
            class154 var12 = class144.field1847 == -1 ? null : class410.method2595(arg1 - 21488, class144.field1847);
            if ((class45.field682 & 0x2) != 0 && var12 == null || var2.method1258(-1, class144.field1847, var12.field1960) != var12.field1960) {
                class78.field1090++;
                class24.method213(0, class298.field4505, class396.field5787 + " -> <col=ffff00>" + var3, class388.field5685, (byte) 102, (long) arg0.field2183, 0, 23);
            }
        } else {
            String[] var5 = var2.field2636;
            if (class21.field384) {
                var5 = class370.method2438((byte) 124, var5);
            }
            if (var5 != null) {
                for (int var6 = 4; var6 >= 0; var6--) {
                    if (var5[var6] != null && (class396.field5783 != 0 || !var5[var6].equalsIgnoreCase(class447.field6444))) {
                        byte var7 = 0;
                        if (var6 == 0) {
                            var7 = 20;
                        }
                        int var8 = class357.field5289;
                        if (var6 == 1) {
                            var7 = 31;
                        }
                        if (var6 == 2) {
                            var7 = 57;
                        }
                        if (var6 == 3) {
                            var7 = 42;
                        }
                        if (var6 == 4) {
                            var7 = 45;
                        }
                        if (var2.field2626 == var6) {
                            var8 = var2.field2639;
                        }
                        if (var2.field2582 == var6) {
                            var8 = var2.field2584;
                        }
                        class24.method213(0, var5[var6], "<col=ffff00>" + var3, var8, (byte) 100, (long) arg0.field2183, 0, var7);
                        class115.field1502++;
                    }
                }
            }
            if (class396.field5783 == 0 && var5 != null) {
                for (int var9 = 4; var9 >= 0; var9--) {
                    if (var5[var9] != null && var5[var9].equalsIgnoreCase(class447.field6444)) {
                        short var10 = 0;
                        if (var2.field2615 > class383.field5609.field4661) {
                            var10 = 2000;
                        }
                        short var11 = 0;
                        if (var9 == 0) {
                            var11 = 20;
                        }
                        if (var9 == 1) {
                            var11 = 31;
                        }
                        if (var9 == 2) {
                            var11 = 57;
                        }
                        if (var9 == 3) {
                            var11 = 42;
                        }
                        if (var9 == 4) {
                            var11 = 45;
                        }
                        if (var11 != 0) {
                            var11 += var10;
                        }
                        class24.method213(0, var5[var9], "<col=ffff00>" + var3, var2.field2620, (byte) 103, (long) arg0.field2183, 0, var11);
                        class437.field6345++;
                    }
                }
            }
            class447.field6436++;
            class24.method213(0, class337.field4982, "<col=ffff00>" + var3, class387.field5664, (byte) 106, (long) arg0.field2183, 0, 1009);
        }
    }
}
