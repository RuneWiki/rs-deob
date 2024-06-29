import java.io.DataInputStream;
import java.net.URL;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!va")
public class class488 extends class263 {

    @OriginalMember(owner = "client!va", name = "M", descriptor = "I")
    private int field7265 = 1024;

    @OriginalMember(owner = "client!va", name = "L", descriptor = "I")
    private int field7264 = 204;

    @OriginalMember(owner = "client!va", name = "F", descriptor = "I")
    private int field7258 = 0;

    @OriginalMember(owner = "client!va", name = "E", descriptor = "I")
    private int field7257 = 409;

    @OriginalMember(owner = "client!va", name = "O", descriptor = "I")
    private int field7267 = 8;

    @OriginalMember(owner = "client!va", name = "S", descriptor = "I")
    private int field7271 = 4;

    @OriginalMember(owner = "client!va", name = "U", descriptor = "I")
    private int field7273 = 1024;

    @OriginalMember(owner = "client!va", name = "Y", descriptor = "I")
    private int field7277 = 81;

    @OriginalMember(owner = "client!va", name = "X", descriptor = "Lkr;")
    public static class262 field7276 = new class262("runescape", 0);

    @OriginalMember(owner = "client!va", name = "cb", descriptor = "I")
    public static int field7281 = 0;

    @OriginalMember(owner = "client!va", name = "fb", descriptor = "Z")
    public static boolean field7284 = false;

    @OriginalMember(owner = "client!va", name = "eb", descriptor = "[I")
    public static int[] field7283 = new int[2048];

    @OriginalMember(owner = "client!va", name = "bb", descriptor = "Z")
    public static boolean field7280 = false;

    @OriginalMember(owner = "client!va", name = "db", descriptor = "Ldp;")
    public static class347 field7282 = new class347("wave2:", "welle2:", "ondulation2:", "onda2:");

    @OriginalMember(owner = "client!va", name = "G", descriptor = "I")
    private int field7259;

    @OriginalMember(owner = "client!va", name = "H", descriptor = "I")
    public static int field7260;

    @OriginalMember(owner = "client!va", name = "I", descriptor = "I")
    public static int field7261;

    @OriginalMember(owner = "client!va", name = "J", descriptor = "I")
    public static int field7262;

    @OriginalMember(owner = "client!va", name = "N", descriptor = "I")
    public static int field7266;

    @OriginalMember(owner = "client!va", name = "R", descriptor = "I")
    private int field7270;

    @OriginalMember(owner = "client!va", name = "T", descriptor = "I")
    public static int field7272;

    @OriginalMember(owner = "client!va", name = "V", descriptor = "I")
    public static int field7274;

    @OriginalMember(owner = "client!va", name = "W", descriptor = "I")
    private int field7275;

    @OriginalMember(owner = "client!va", name = "Z", descriptor = "I")
    public static int field7278;

    @OriginalMember(owner = "client!va", name = "ab", descriptor = "Lok;")
    public static class74 field7279;

    @OriginalMember(owner = "client!va", name = "Q", descriptor = "[I")
    private int[] field7269;

    @OriginalMember(owner = "client!va", name = "K", descriptor = "[[I")
    private int[][] field7263;

    @OriginalMember(owner = "client!va", name = "P", descriptor = "[[I")
    private int[][] field7268;

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(ILjava/lang/Throwable;Ljava/lang/String;)V", line = 4)
    public static final void method2913(int arg0, Throwable arg1, String arg2) {
        ++field7262;
        try {
            String var3 = "";
            if (arg1 != null) {
                var3 = class498.method2969(arg1, 0);
            }
            if (arg2 != null) {
                if (arg1 != null) {
                    var3 = var3 + " | ";
                }
                var3 = var3 + arg2;
            }
            class517.method3058((byte) -95, var3);
            String var4 = class80.method574(":", var3, "%3a", 0);
            String var5 = class80.method574("@", var4, "%40", 0);
            String var6 = class80.method574("&", var5, "%26", 0);
            String var7 = class80.method574("#", var6, "%23", arg0);
            if (class384.field5797.field1611 != null) {
                class533 var8 = class384.field5797.method824(new URL(class384.field5797.field1611.getCodeBase(), "clienterror.ws?c=" + class202.field2944 + "&u=" + class200.field2920 + "&v1=" + class109.field1628 + "&v2=" + class109.field1609 + "&e=" + var7), true);
                while (var8.field7848 == 0) {
                    class389.method2332(-128, 1L);
                }
                if (~var8.field7848 == -2) {
                    DataInputStream var9 = (DataInputStream) var8.field7849;
                    var9.read();
                    var9.close();
                }
            }
        } catch (Exception var10) {
        }
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(IB)[I", line = 53)
    public final int[] method33(int arg0, byte arg1) {
        ++field7266;
        int[] var3 = super.field3917.method41(arg0, 1);
        if (arg1 <= 40) {
            this.method33(56, (byte) 49);
        }
        if (super.field3917.field91) {
            int var4 = 0;
            int var5;
            for (var5 = class170.field2509[arg0] + this.field7258; ~var5 > -1; var5 += 4096) {
            }
            while (var5 > 4096) {
                var5 -= 4096;
            }
            while (~var4 > ~this.field7267 && ~var5 <= ~this.field7269[var4]) {
                ++var4;
            }
            int var6 = var4 - 1;
            boolean var7 = (1 & var4) == 0;
            int var8 = this.field7269[var4];
            int var9 = this.field7269[var4 + -1];
            if (~var5 < ~(this.field7275 + var9) && ~(var8 - this.field7275) < ~var5) {
                for (int var10 = 0; class367.field5597 > var10; ++var10) {
                    int var11 = !var7 ? -this.field7273 : this.field7273;
                    int var12 = 0;
                    int var13;
                    for (var13 = (this.field7259 * var11 >> 12) + class379.field5711[var10]; var13 < 0; var13 += 4096) {
                    }
                    while (var13 > 4096) {
                        var13 -= 4096;
                    }
                    while (var12 < this.field7271 && ~this.field7263[var6][var12] >= ~var13) {
                        ++var12;
                    }
                    int var14 = var12 - 1;
                    int var15 = this.field7263[var6][var14];
                    int var16 = this.field7263[var6][var12];
                    if (~(var15 - -this.field7275) > ~var13 && ~(-this.field7275 + var16) < ~var13) {
                        var3[var10] = this.field7268[var6][var14];
                    } else {
                        var3[var10] = 0;
                    }
                }
            } else {
                class442.method2591(var3, 0, class367.field5597, 0);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(IIIIIII)V", line = 160)
    public static final void method2914(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field7260;
        if (~class297.field4427 >= ~arg3 && ~arg5 >= ~class102.field1544 && ~class305.field4555 >= ~arg1 && arg4 <= class286.field4290) {
            if (arg0 != 1) {
                class512.method3017(arg1, arg5, arg0, arg4, (byte) -113, arg2, arg3);
            } else {
                class50.method375(arg5, arg4, -18403, arg2, arg1, arg3);
            }
        } else if (~arg0 != -2) {
            class283.method1765(arg1, arg0, arg3, 6408, arg4, arg2, arg5);
        } else {
            class147.method1066(arg2, arg4, arg5, arg3, (byte) -105, arg1);
        }
        if (arg6 != 81) {
            method2913(-102, (Throwable) null, (String) null);
        }
    }

    @OriginalMember(owner = "client!va", name = "d", descriptor = "(I)V", line = 191)
    private final void method2915(int arg0) {
        ++field7261;
        Random var2 = new Random((long) this.field7267);
        this.field7259 = 4096 / this.field7271;
        this.field7270 = 4096 / this.field7267;
        this.field7275 = this.field7277 / 2;
        int var3 = this.field7259 / 2;
        this.field7263 = new int[this.field7267][this.field7271 + 1];
        this.field7268 = new int[this.field7267][this.field7271];
        this.field7269 = new int[this.field7267 + 1];
        int var4 = this.field7270 / 2;
        this.field7269[0] = 0;
        for (int var5 = arg0; var5 < this.field7267; ++var5) {
            if (~var5 < -1) {
                int var6 = this.field7270;
                int var7 = (class363.method2166(arg0 ^ 22591, 4096, var2) + -2048) * this.field7264 >> 12;
                int var8 = (var4 * var7 >> 12) + var6;
                this.field7269[var5] = this.field7269[var5 + -1] + var8;
            }
            this.field7263[var5][0] = 0;
            for (int var9 = 0; var9 < this.field7271; ++var9) {
                if (~var9 < -1) {
                    int var10 = this.field7259;
                    int var11 = (-2048 + class363.method2166(arg0 + 22591, 4096, var2)) * this.field7257 >> 12;
                    int var12 = (var3 * var11 >> 12) + var10;
                    this.field7263[var5][var9] = this.field7263[var5][var9 + -1] + var12;
                }
                this.field7268[var5][var9] = this.field7265 <= 0 ? 4096 : 4096 + -class363.method2166(22591, this.field7265, var2);
            }
            this.field7263[var5][this.field7271] = 4096;
        }
        this.field7269[this.field7267] = 4096;
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(IZLgk;)V", line = 252)
    public final void method32(int arg0, boolean arg1, class468 arg2) {
        if (arg1) {
            ++field7274;
            if (arg0 != 0) {
                if (arg0 != 1) {
                    if (arg0 != 2) {
                        if (~arg0 != -4) {
                            if (arg0 != 4) {
                                if (arg0 != 5) {
                                    if (arg0 != 6) {
                                        if (arg0 == 7) {
                                            this.field7265 = arg2.method2727((byte) 43);
                                        }
                                    } else {
                                        this.field7277 = arg2.method2727((byte) 43);
                                    }
                                } else {
                                    this.field7258 = arg2.method2727((byte) 43);
                                }
                            } else {
                                this.field7273 = arg2.method2727((byte) 43);
                            }
                        } else {
                            this.field7264 = arg2.method2727((byte) 43);
                        }
                    } else {
                        this.field7257 = arg2.method2727((byte) 43);
                    }
                } else {
                    this.field7267 = arg2.method2765(50);
                }
            } else {
                this.field7271 = arg2.method2765(54);
            }
        }
    }

    @OriginalMember(owner = "client!va", name = "c", descriptor = "(B)V", line = 343)
    public final void method748(byte arg0) {
        ++field7278;
        this.method2915(arg0 ^ 110);
        if (arg0 != 110) {
            this.field7269 = null;
        }
    }

    @OriginalMember(owner = "client!va", name = "c", descriptor = "(IB)V", line = 355)
    public static final void method2916(int arg0, byte arg1) {
        int var2 = -7 / ((-54 - arg1) / 57);
        ++field7272;
        class382 var3 = class426.field6355;
        synchronized (class426.field6355) {
            class426.field6355.method2294(arg0, true);
        }
    }

    @OriginalMember(owner = "client!va", name = "<init>", descriptor = "()V", line = 367)
    public class488() {
        super(0, true);
    }

    @OriginalMember(owner = "client!va", name = "e", descriptor = "(I)V", line = 370)
    public static void method2917(int arg0) {
        field7279 = null;
        field7276 = null;
        if (arg0 != 1) {
            method2914(-43, -55, -7, 8, -92, -58, 123);
        }
        field7283 = null;
        field7282 = null;
    }
}
