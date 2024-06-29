import java.io.IOException;
import java.net.Socket;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ah")
public class class129 extends class310 {

    @OriginalMember(owner = "client!ah", name = "P", descriptor = "I")
    private int field2174 = 0;

    @OriginalMember(owner = "client!ah", name = "O", descriptor = "I")
    private int field2173 = 2048;

    @OriginalMember(owner = "client!ah", name = "X", descriptor = "I")
    private int field2182 = 5;

    @OriginalMember(owner = "client!ah", name = "S", descriptor = "[B")
    private byte[] field2177 = new byte[512];

    @OriginalMember(owner = "client!ah", name = "K", descriptor = "[S")
    private short[] field2170 = new short[512];

    @OriginalMember(owner = "client!ah", name = "eb", descriptor = "I")
    private int field2189 = 1;

    @OriginalMember(owner = "client!ah", name = "N", descriptor = "I")
    private int field2172 = 2;

    @OriginalMember(owner = "client!ah", name = "gb", descriptor = "I")
    private int field2191 = 5;

    @OriginalMember(owner = "client!ah", name = "Y", descriptor = "I")
    public static int field2183 = 0;

    @OriginalMember(owner = "client!ah", name = "bb", descriptor = "Ljava/lang/String;")
    public static String field2186 = "Please wait...";

    @OriginalMember(owner = "client!ah", name = "W", descriptor = "Ljava/lang/String;")
    public static String field2181 = "shake:";

    @OriginalMember(owner = "client!ah", name = "hb", descriptor = "Z")
    public static boolean field2192 = false;

    @OriginalMember(owner = "client!ah", name = "cb", descriptor = "Ljl;")
    public static class332 field2187 = new class332(128);

    @OriginalMember(owner = "client!ah", name = "ib", descriptor = "I")
    public static int field2193 = -1;

    @OriginalMember(owner = "client!ah", name = "M", descriptor = "I")
    public static int field2171;

    @OriginalMember(owner = "client!ah", name = "R", descriptor = "I")
    public static int field2176;

    @OriginalMember(owner = "client!ah", name = "T", descriptor = "I")
    public static int field2178;

    @OriginalMember(owner = "client!ah", name = "U", descriptor = "I")
    public static int field2179;

    @OriginalMember(owner = "client!ah", name = "V", descriptor = "I")
    public static int field2180;

    @OriginalMember(owner = "client!ah", name = "db", descriptor = "I")
    public static int field2188;

    @OriginalMember(owner = "client!ah", name = "fb", descriptor = "I")
    public static int field2190;

    @OriginalMember(owner = "client!ah", name = "Q", descriptor = "Lth;")
    public static class57 field2175;

    @OriginalMember(owner = "client!ah", name = "ab", descriptor = "Lth;")
    public static class57 field2185;

    @OriginalMember(owner = "client!ah", name = "Z", descriptor = "[[[Laa;")
    public static class36[][][] field2184;

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(Lqm;II)V", line = 28)
    public final void method75(class227 arg0, int arg1, int arg2) {
        if (arg2 == 0) {
            this.field2182 = this.field2191 = arg0.method1720((byte) -128);
        } else if (arg2 == 1) {
            this.field2174 = arg0.method1720((byte) -103);
        } else if (arg2 == 2) {
            this.field2173 = arg0.method1765(true);
        } else if (arg2 == 3) {
            this.field2172 = arg0.method1720((byte) -97);
        } else if (arg2 == 4) {
            this.field2189 = arg0.method1720((byte) -108);
        } else if (arg2 == 5) {
            this.field2182 = arg0.method1720((byte) -73);
        } else if (arg2 == 6) {
            this.field2191 = arg0.method1720((byte) -37);
        }
        if (arg1 != -2470) {
            this.method989(-35);
        }
        field2176++;
    }

    @OriginalMember(owner = "client!ah", name = "<init>", descriptor = "()V", line = 94)
    public class129() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ah", name = "d", descriptor = "(B)V", line = 108)
    public final void method553(byte arg0) {
        if (arg0 < -82) {
            field2180++;
            this.field2177 = class66.method567((byte) 44, this.field2174);
            this.method989(-120);
        }
    }

    @OriginalMember(owner = "client!ah", name = "d", descriptor = "(I)V", line = 125)
    private final void method989(int arg0) {
        Random var2 = new Random((long) this.field2174);
        field2179++;
        this.field2170 = new short[512];
        if (arg0 >= -1) {
            field2181 = (String) null;
        }
        if (this.field2173 > 0) {
            for (int var3 = 0; var3 < 512; var3++) {
                this.field2170[var3] = (short) class2.method4(this.field2173, var2, 104);
            }
        }
    }

    @OriginalMember(owner = "client!ah", name = "b", descriptor = "(Z)I", line = 158)
    public static final int method990(boolean arg0) {
        field2190++;
        try {
            if (!arg0) {
                return 64;
            }
            if (class198.field3160 == 0) {
                if (class272.field4517 > class47.method371(92) - 5000L) {
                    return 0;
                }
                class206.field3258 = class128.field2163.method1124(class258.field4329, -79, class118.field1988);
                class254.field4292 = class47.method371(90);
                class198.field3160 = 1;
            }
            if (class47.method371(121) > (class254.field4292 + 30000L)) {
                return class159.method1242(-74, 1000);
            }
            if (class198.field3160 == 1) {
                if (class206.field3258.field3064 == 2) {
                    return class159.method1242(-72, 1001);
                }
                if (class206.field3258.field3064 != 1) {
                    return -1;
                }
                class342.field5449 = new class117((Socket) class206.field3258.field3066, class128.field2163);
                int var1 = 0;
                class36.field520.field3760 = 0;
                if (class56.field919) {
                    var1 = class243.field3997;
                }
                class206.field3258 = null;
                class36.field520.method1712(23, -90);
                class36.field520.method1757(var1, -110);
                class342.field5449.method924(0, class36.field520.field3793, class36.field520.field3760, 114);
                if (class65.field1152 != null) {
                    class65.field1152.method1517((byte) 127);
                }
                if (class260.field4374 != null) {
                    class260.field4374.method1517((byte) 127);
                }
                int var2 = class342.field5449.method918(0);
                if (class65.field1152 != null) {
                    class65.field1152.method1517((byte) 124);
                }
                if (class260.field4374 != null) {
                    class260.field4374.method1517((byte) 126);
                }
                if (var2 != 0) {
                    return class159.method1242(-103, var2);
                }
                class198.field3160 = 2;
            }
            if (class198.field3160 == 2) {
                if (class342.field5449.method926(0) < 2) {
                    return -1;
                }
                class140.field2302 = class342.field5449.method918(0);
                class140.field2302 <<= 0x8;
                class140.field2302 += class342.field5449.method918(0);
                class321.field5108 = new byte[class140.field2302];
                class81.field1385 = 0;
                class198.field3160 = 3;
            }
            if (class198.field3160 != 3) {
                return -1;
            }
            int var3 = class342.field5449.method926(0);
            if (var3 < 1) {
                return -1;
            }
            if (var3 > (class140.field2302 - class81.field1385)) {
                var3 = class140.field2302 - class81.field1385;
            }
            class342.field5449.method919(class321.field5108, class81.field1385, var3, true);
            class81.field1385 += var3;
            if (class81.field1385 < class140.field2302) {
                return -1;
            } else if (class184.method1452(-125, class321.field5108)) {
                class118.field1999 = new class201[class189.field3042];
                int var4 = 0;
                for (int var5 = class209.field3300; var5 <= class172.field2756; var5++) {
                    class201 var6 = class291.method2108(var5, (byte) 119);
                    if (var6 != null) {
                        class118.field1999[var4++] = var6;
                    }
                }
                class342.field5449.method916((byte) 72);
                class342.field5449 = null;
                class198.field3160 = 0;
                class321.field5108 = null;
                class231.field3836 = 0;
                class272.field4517 = class47.method371(126);
                return 0;
            } else {
                return class159.method1242(-119, 1002);
            }
        } catch (IOException var8) {
            return class159.method1242(-90, 1003);
        }
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(II)[I", line = 299)
    public final int[] method77(int arg0, int arg1) {
        int[] var3 = this.field4950.method930(arg0, 0);
        field2178++;
        if (arg1 != -13093) {
            this.method989(-120);
        }
        if (this.field4950.field2001) {
            int var4 = class230.field3818[arg0] * this.field2191 + 2048;
            int var5 = var4 >> 12;
            int var6 = var5 + 1;
            for (int var7 = 0; var7 < class261.field4405; var7++) {
                class222.field3628 = Integer.MAX_VALUE;
                class200.field3183 = Integer.MAX_VALUE;
                class283.field4632 = Integer.MAX_VALUE;
                class220.field3584 = Integer.MAX_VALUE;
                int var8 = class293.field4737[var7] * this.field2182 + 2048;
                int var9 = var8 >> 12;
                int var10 = var9 + 1;
                for (int var11 = var5 - 1; var11 <= var6; var11++) {
                    int var12 = this.field2177[(var11 >= this.field2191 ? var11 - this.field2191 : var11) & 0xFF] & 0xFF;
                    for (int var13 = var9 - 1; var13 <= var10; var13++) {
                        int var14 = (this.field2177[var12 + (this.field2182 > var13 ? var13 : var13 - this.field2182) & 0xFF] & 0xFF) * 2;
                        int var10000 = -(var13 << 12);
                        int var27 = var14 + 1;
                        int var15 = var10000 - (this.field2170[var14] - var8);
                        int var16 = var4 - (var11 << 12) - this.field2170[var27];
                        int var17 = this.field2189;
                        int var18;
                        if (var17 == 1) {
                            var18 = var15 * var15 + var16 * var16 >> 12;
                        } else if (var17 == 3) {
                            int var24 = var15 >= 0 ? var15 : -var15;
                            int var25 = var16 >= 0 ? var16 : -var16;
                            var18 = var24 <= var25 ? var25 : var24;
                        } else if (var17 == 4) {
                            int var21 = (int) (Math.sqrt((double) ((float) (var15 >= 0 ? var15 : -var15) / 4096.0F)) * 4096.0D);
                            int var22 = (int) (Math.sqrt((double) ((float) (var16 < 0 ? -var16 : var16) / 4096.0F)) * 4096.0D);
                            int var23 = var21 + var22;
                            var18 = var23 * var23 >> 12;
                        } else if (var17 == 5) {
                            int var19 = var16 * var16;
                            int var20 = var15 * var15;
                            var18 = (int) (Math.sqrt(Math.sqrt((double) ((float) (var19 + var20) / 1.6777216E7F))) * 4096.0D);
                        } else if (var17 == 2) {
                            var18 = (var15 >= 0 ? var15 : -var15) + (var16 < 0 ? -var16 : var16);
                        } else {
                            var18 = (int) (Math.sqrt((double) ((float) (var15 * var15 + var16 * var16) / 1.6777216E7F)) * 4096.0D);
                        }
                        if (var18 < class220.field3584) {
                            class222.field3628 = class200.field3183;
                            class200.field3183 = class283.field4632;
                            class283.field4632 = class220.field3584;
                            class220.field3584 = var18;
                        } else if (var18 < class283.field4632) {
                            class222.field3628 = class200.field3183;
                            class200.field3183 = class283.field4632;
                            class283.field4632 = var18;
                        } else if (var18 < class200.field3183) {
                            class222.field3628 = class200.field3183;
                            class200.field3183 = var18;
                        } else if (var18 < class222.field3628) {
                            class222.field3628 = var18;
                        }
                    }
                }
                int var26 = this.field2172;
                if (var26 == 0) {
                    var3[var7] = class220.field3584;
                } else if (var26 == 1) {
                    var3[var7] = class283.field4632;
                } else if (var26 == 3) {
                    var3[var7] = class200.field3183;
                } else if (var26 == 4) {
                    var3[var7] = class222.field3628;
                } else if (var26 == 2) {
                    var3[var7] = class283.field4632 - class220.field3584;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ah", name = "e", descriptor = "(B)V", line = 508)
    public static void method991(byte arg0) {
        field2181 = null;
        field2175 = null;
        field2186 = null;
        field2185 = null;
        field2184 = (class36[][][]) null;
        if (arg0 >= 103) {
            field2187 = null;
        }
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(Llb;Z)V", line = 538)
    public static final void method992(class341 arg0, boolean arg1) {
        field2171++;
        for (int var2 = 0; var2 < class196.field3131.length; var2++) {
            class196.field3131[var2] = 0;
        }
        if (!arg1) {
            field2187 = (class332) null;
        }
        short var3 = 256;
        for (int var4 = 0; var4 < 5000; var4++) {
            int var5 = (int) ((double) var3 * Math.random() * 128.0D);
            class196.field3131[var5] = (int) (Math.random() * 284.0D);
        }
        for (int var6 = 0; var6 < 20; var6++) {
            for (int var7 = 1; var7 < (var3 - 1); var7++) {
                for (int var8 = 1; var8 < 127; var8++) {
                    int var9 = (var7 << 7) + var8;
                    class121.field2091[var9] = (class196.field3131[var9 + 1] + class196.field3131[var9 - 128] + class196.field3131[var9 + -1] + class196.field3131[var9 + 128]) / 4;
                }
            }
            int[] var10 = class196.field3131;
            class196.field3131 = class121.field2091;
            class121.field2091 = var10;
        }
        if (arg0 == null) {
            return;
        }
        int var11 = 0;
        for (int var12 = 0; var12 < arg0.field4649; var12++) {
            for (int var13 = 0; var13 < arg0.field4652; var13++) {
                if (arg0.field5444[var11++] != 0) {
                    int var14 = var13 + arg0.field4645 + 16;
                    int var15 = var12 + arg0.field4650 + 16;
                    int var16 = (var15 << 7) + var14;
                    class196.field3131[var16] = 0;
                }
            }
        }
    }
}
