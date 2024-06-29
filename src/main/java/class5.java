import java.awt.Point;
import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vi")
public class class5 extends class288 {

    @OriginalMember(owner = "client!vi", name = "F", descriptor = "I")
    private int field57 = 4096;

    @OriginalMember(owner = "client!vi", name = "L", descriptor = "[I")
    private int[] field63 = new int[3];

    @OriginalMember(owner = "client!vi", name = "R", descriptor = "I")
    private int field68 = 409;

    @OriginalMember(owner = "client!vi", name = "N", descriptor = "I")
    private int field65 = 4096;

    @OriginalMember(owner = "client!vi", name = "S", descriptor = "I")
    private int field69 = 4096;

    @OriginalMember(owner = "client!vi", name = "J", descriptor = "[I")
    public static int[] field61 = new int[] { 0, 1, 2, 3, 4, 5, 6, 14 };

    @OriginalMember(owner = "client!vi", name = "E", descriptor = "[I")
    public static int[] field56 = new int[32];

    @OriginalMember(owner = "client!vi", name = "I", descriptor = "I")
    public static int field60 = 0;

    @OriginalMember(owner = "client!vi", name = "C", descriptor = "I")
    public static int field54;

    @OriginalMember(owner = "client!vi", name = "D", descriptor = "I")
    public static int field55;

    @OriginalMember(owner = "client!vi", name = "G", descriptor = "I")
    public static int field58;

    @OriginalMember(owner = "client!vi", name = "H", descriptor = "I")
    public static int field59;

    @OriginalMember(owner = "client!vi", name = "K", descriptor = "I")
    public static int field62;

    @OriginalMember(owner = "client!vi", name = "M", descriptor = "I")
    public static int field64;

    @OriginalMember(owner = "client!vi", name = "Q", descriptor = "I")
    public static int field67;

    @OriginalMember(owner = "client!vi", name = "O", descriptor = "[Ljg;")
    public static class271[] field66;

    @OriginalMember(owner = "client!vi", name = "b", descriptor = "(Z)V")
    public static void method32(boolean arg0) {
        field61 = null;
        field56 = null;
        if (!arg0) {
            field61 = null;
        }
        field66 = null;
    }

    @OriginalMember(owner = "client!vi", name = "c", descriptor = "(II)V")
    public static final void method33(int arg0, int arg1) {
        if (!class94.field1376) {
            arg0 = -1;
        }
        ++field55;
        if (~class256.field4093 != ~arg0) {
            if (arg0 != -1) {
                class291 var2 = class222.method1469(arg0, arg1 + -13124);
                class43 var3 = var2.method1948((byte) 102);
                if (var3 == null) {
                    arg0 = -1;
                } else {
                    class250.field4006.method1677(var3.field4371, 17, class38.field458, new Point(var2.field4644, var2.field4642), var3.method334(), var3.field4384);
                    class256.field4093 = arg0;
                }
            }
            if (~arg0 == arg1 && ~class256.field4093 != 0) {
                class250.field4006.method1677(-1, 17, class38.field458, new Point(), (int[]) null, -1);
                class256.field4093 = -1;
            }
        }
    }

    @OriginalMember(owner = "client!vi", name = "b", descriptor = "(II)[[I")
    public final int[][] method34(int arg0, int arg1) {
        ++field54;
        int[][] var3 = super.field4598.method812(arg1, 65535);
        if (arg0 != 1) {
            this.field68 = 95;
        }
        if (super.field4598.field1954) {
            int[][] var4 = this.method1930(0, arg1, (byte) 80);
            int[] var5 = var4[1];
            int[] var6 = var4[0];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; ~var11 > ~class186.field2986; ++var11) {
                int var12 = var6[var11];
                int var13 = -this.field63[0] + var12;
                if (var13 < 0) {
                    var13 = -var13;
                }
                if (~this.field68 > ~var13) {
                    var8[var11] = var12;
                    var9[var11] = var5[var11];
                    var10[var11] = var7[var11];
                } else {
                    int var14 = var5[var11];
                    int var15 = var14 - this.field63[1];
                    if (~var15 > -1) {
                        var15 = -var15;
                    }
                    if (~this.field68 > ~var15) {
                        var8[var11] = var12;
                        var9[var11] = var14;
                        var10[var11] = var7[var11];
                    } else {
                        int var16 = var7[var11];
                        int var17 = var16 - this.field63[2];
                        if (~var17 > -1) {
                            var17 = -var17;
                        }
                        if (this.field68 < var17) {
                            var8[var11] = var12;
                            var9[var11] = var14;
                            var10[var11] = var16;
                        } else {
                            var8[var11] = this.field69 * var12 >> 12;
                            var9[var11] = this.field65 * var14 >> 12;
                            var10[var11] = this.field57 * var16 >> 12;
                        }
                    }
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(Lhi;BI)V")
    public final void method20(class264 arg0, byte arg1, int arg2) {
        if (arg2 != 0) {
            if (arg2 != 1) {
                if (~arg2 != -3) {
                    if (arg2 != 3) {
                        if (~arg2 == -5) {
                            int var5 = arg0.method1732(122);
                            this.field63[2] = class204.method1369(255, var5) >> 12;
                            this.field63[0] = class204.method1369(16711680, var5) << 4;
                            this.field63[1] = class204.method1369(65280, var5) >> 4;
                        }
                    } else {
                        this.field69 = arg0.method1777(arg1 + -29);
                    }
                } else {
                    this.field65 = arg0.method1777(-85);
                }
            } else {
                this.field57 = arg0.method1777(arg1 ^ 60);
            }
        } else {
            this.field68 = arg0.method1777(arg1 + -46);
        }
        if (arg1 != -19) {
            this.method20((class264) null, (byte) 90, -63);
        }
        ++field58;
    }

    @OriginalMember(owner = "client!vi", name = "d", descriptor = "(B)V")
    public static final void method35(byte arg0) {
        ++field59;
        if (~class95.field1440 != -1) {
            try {
                if (++class92.field1309 > 1500) {
                    if (class149.field2395 != null) {
                        class149.field2395.method1276(-1);
                        class149.field2395 = null;
                    }
                    if (~class217.field3480 <= -2) {
                        class157.field2523 = -5;
                        class95.field1440 = 0;
                        return;
                    }
                    ++class217.field3480;
                    class95.field1440 = 1;
                    class92.field1309 = 0;
                    if (class271.field4380 == class148.field2385) {
                        class148.field2385 = class3.field52;
                    } else {
                        class148.field2385 = class271.field4380;
                    }
                }
                if (~class95.field1440 == -2) {
                    class270.field4367 = class250.field4006.method1672(-3, class148.field2385, class199.field3204);
                    class95.field1440 = 2;
                }
                if (class95.field1440 == 2) {
                    if (class270.field4367.field2271 == 2) {
                        throw new IOException();
                    }
                    if (~class270.field4367.field2271 != -2) {
                        return;
                    }
                    class149.field2395 = new class186((Socket) class270.field4367.field2266, class250.field4006);
                    class270.field4367 = null;
                    class149.field2395.method1272(class83.field1148.field4195, 0, class83.field1148.field4198, -83);
                    if (class226.field3580 != null) {
                        class226.field3580.method735(0);
                    }
                    if (class147.field2361 != null) {
                        class147.field2361.method735(0);
                    }
                    int var1 = class149.field2395.method1270(0);
                    if (class226.field3580 != null) {
                        class226.field3580.method735(0);
                    }
                    if (class147.field2361 != null) {
                        class147.field2361.method735(0);
                    }
                    if (~var1 != -102) {
                        class95.field1440 = 0;
                        class157.field2523 = var1;
                        class149.field2395.method1276(-1);
                        class149.field2395 = null;
                        return;
                    }
                    class95.field1440 = 3;
                }
                if (~class95.field1440 == -4) {
                    if (~class149.field2395.method1274(29491) > -3) {
                        return;
                    }
                    int var2 = class149.field2395.method1270(0) << 8 | class149.field2395.method1270(0);
                    class270.method1821(var2, true);
                    if (class125.field2088 == -1) {
                        class157.field2523 = 6;
                        class95.field1440 = 0;
                        class149.field2395.method1276(-1);
                        class149.field2395 = null;
                        return;
                    }
                    class95.field1440 = 0;
                    class149.field2395.method1276(-1);
                    class149.field2395 = null;
                    class39.method305(false);
                    return;
                }
            } catch (IOException var3) {
                if (class149.field2395 != null) {
                    class149.field2395.method1276(-1);
                    class149.field2395 = null;
                }
                if (~class217.field3480 <= -2) {
                    class95.field1440 = 0;
                    class157.field2523 = -4;
                } else {
                    class95.field1440 = 1;
                    ++class217.field3480;
                    if (class271.field4380 != class148.field2385) {
                        class148.field2385 = class271.field4380;
                    } else {
                        class148.field2385 = class3.field52;
                    }
                    class92.field1309 = 0;
                }
            }
            if (arg0 > -19) {
                field60 = -23;
            }
        }
    }

    @OriginalMember(owner = "client!vi", name = "<init>", descriptor = "()V")
    public class5() {
        super(1, false);
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(IIIII)V")
    public static final void method36(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class121.field2042 = arg0;
        class156.field2507 = arg2;
        ++field64;
        class58.field817 = arg4;
        if (arg3 < -121) {
            client.field3617 = arg1;
        }
    }
}
