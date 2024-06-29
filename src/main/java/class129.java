import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tn")
public class class129 {

    @OriginalMember(owner = "client!tn", name = "i", descriptor = "I")
    private int field2243 = 0;

    @OriginalMember(owner = "client!tn", name = "b", descriptor = "I")
    public int field2236 = 128;

    @OriginalMember(owner = "client!tn", name = "c", descriptor = "I")
    public int field2237 = -1;

    @OriginalMember(owner = "client!tn", name = "n", descriptor = "Z")
    public boolean field2248 = true;

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "I")
    public static int field2235;

    @OriginalMember(owner = "client!tn", name = "d", descriptor = "I")
    public static int field2238;

    @OriginalMember(owner = "client!tn", name = "e", descriptor = "I")
    public static int field2239;

    @OriginalMember(owner = "client!tn", name = "f", descriptor = "I")
    public static int field2240;

    @OriginalMember(owner = "client!tn", name = "g", descriptor = "I")
    public int field2241;

    @OriginalMember(owner = "client!tn", name = "h", descriptor = "I")
    public static int field2242;

    @OriginalMember(owner = "client!tn", name = "j", descriptor = "I")
    public static int field2244;

    @OriginalMember(owner = "client!tn", name = "k", descriptor = "I")
    public int field2245;

    @OriginalMember(owner = "client!tn", name = "l", descriptor = "I")
    public int field2246;

    @OriginalMember(owner = "client!tn", name = "m", descriptor = "I")
    public static int field2247;

    @OriginalMember(owner = "client!tn", name = "o", descriptor = "I")
    public int field2249;

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(ILoe;I)V", line = 13)
    public final void method917(int arg0, class146 arg1, int arg2) {
        while (true) {
            int var4 = arg1.method1005((byte) 122);
            if (var4 == 0) {
                int var5 = -123 % ((-arg0 - 50) / 59);
                field2244++;
                return;
            }
            this.method920(var4, 0, arg2, arg1);
        }
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(BI)V", line = 31)
    private final void method918(byte arg0, int arg1) {
        field2235++;
        double var3 = (double) ((arg1 & 0xFF5B61) >> 16) / 256.0D;
        if (arg0 >= -47) {
            field2238 = -55;
        }
        double var5 = (double) (arg1 >> 8 & 0xFF) / 256.0D;
        double var7 = var3;
        double var9 = var3;
        if (var5 < var3) {
            var9 = var5;
        }
        if (var3 < var5) {
            var7 = var5;
        }
        double var11 = (double) (arg1 & 0xFF) / 256.0D;
        double var13 = 0.0D;
        if (var7 < var11) {
            var7 = var11;
        }
        if (var9 > var11) {
            var9 = var11;
        }
        double var15 = 0.0D;
        double var17 = (var7 + var9) / 2.0D;
        this.field2241 = (int) (var17 * 256.0D);
        if (var7 != var9) {
            if (var3 == var7) {
                var13 = (var5 - var11) / (var7 - var9);
            } else if (var5 == var7) {
                var13 = (var11 - var3) / (var7 - var9) + 2.0D;
            } else if (var7 == var11) {
                var13 = (var3 - var5) / (var7 - var9) + 4.0D;
            }
            if (var17 < 0.5D) {
                var15 = (var7 - var9) / (var7 + var9);
            }
            if (var17 >= 0.5D) {
                var15 = (var7 - var9) / (2.0D - var7 - var9);
            }
        }
        if ((var17 > 0.5D)) {
            this.field2245 = (int) ((1.0D - var17) * var15 * 512.0D);
        } else {
            this.field2245 = (int) (var15 * var17 * 512.0D);
        }
        if (this.field2241 < 0) {
            this.field2241 = 0;
        } else if (this.field2241 > 255) {
            this.field2241 = 255;
        }
        this.field2246 = (int) (var15 * 256.0D);
        double var19 = var13 / 6.0D;
        if (this.field2246 < 0) {
            this.field2246 = 0;
        } else if (this.field2246 > 255) {
            this.field2246 = 255;
        }
        if (this.field2245 < 1) {
            this.field2245 = 1;
        }
        this.field2249 = (int) ((double) this.field2245 * var19);
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(I)Lgb;", line = 121)
    public static final class191 method919(int arg0) {
        field2240++;
        if (class101.field1849 >= class162.field2728.length) {
            int var1 = 38 / ((-arg0 - 3) / 33);
            return null;
        } else {
            return class162.field2728[class101.field1849++];
        }
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(IIILoe;)V", line = 135)
    private final void method920(int arg0, int arg1, int arg2, class146 arg3) {
        field2239++;
        if (arg1 != 0) {
            return;
        }
        if (arg0 == 1) {
            this.field2243 = arg3.method1025((byte) -98);
            this.method918((byte) -110, this.field2243);
        } else if (arg0 == 2) {
            this.field2237 = arg3.method989(76);
            if (this.field2237 == 65535) {
                this.field2237 = -1;
            }
        } else if (arg0 == 3) {
            this.field2236 = arg3.method989(114);
        } else if (arg0 == 4) {
            this.field2248 = false;
        }
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "([BI)V", line = 174)
    public static final void method921(byte[] arg0, int arg1) {
        field2242++;
        class146 var2 = new class146(arg0);
        var2.field2435 = arg0.length - 2;
        class238.field3972 = var2.method989(arg1 + 68);
        class9.field281 = new byte[class238.field3972][];
        class309.field5053 = new byte[class238.field3972][];
        class232.field3804 = new int[class238.field3972];
        class9.field284 = new int[class238.field3972];
        class137.field2335 = new boolean[class238.field3972];
        class76.field1367 = new int[class238.field3972];
        class321.field5218 = new int[class238.field3972];
        var2.field2435 = arg0.length - class238.field3972 * 8 - 7;
        class91.field1617 = var2.method989(63);
        class12.field368 = var2.method989(125);
        int var3 = (var2.method1005((byte) 122) & 0xFF) + 1;
        for (int var4 = arg1; var4 < class238.field3972; var4++) {
            class321.field5218[var4] = var2.method989(100);
        }
        for (int var5 = 0; var5 < class238.field3972; var5++) {
            class232.field3804[var5] = var2.method989(118);
        }
        for (int var6 = 0; var6 < class238.field3972; var6++) {
            class9.field284[var6] = var2.method989(72);
        }
        for (int var7 = 0; var7 < class238.field3972; var7++) {
            class76.field1367[var7] = var2.method989(88);
        }
        var2.field2435 = -(var3 * 3) - (-(-(class238.field3972 * 8) - 7) - arg0.length - 3);
        class323.field5225 = new int[var3];
        for (int var8 = 1; var8 < var3; var8++) {
            class323.field5225[var8] = var2.method1025((byte) -59);
            if (class323.field5225[var8] == 0) {
                class323.field5225[var8] = 1;
            }
        }
        var2.field2435 = 0;
        for (int var9 = 0; var9 < class238.field3972; var9++) {
            int var10 = class9.field284[var9];
            boolean var11 = false;
            int var12 = class76.field1367[var9];
            int var13 = var10 * var12;
            byte[] var14 = new byte[var13];
            byte[] var15 = new byte[var13];
            class309.field5053[var9] = var15;
            class9.field281[var9] = var14;
            int var16 = var2.method1005((byte) 122);
            if ((var16 & 0x1) == 0) {
                for (int var17 = 0; var17 < var13; var17++) {
                    var15[var17] = var2.method1029(-2);
                }
                if ((var16 & 0x2) != 0) {
                    for (int var18 = 0; var18 < var13; var18++) {
                        byte var19 = var14[var18] = var2.method1029(-2);
                        var11 |= var19 != -1;
                    }
                }
            } else {
                int var20 = 0;
                label98: while (true) {
                    if (var10 <= var20) {
                        if ((var16 & 0x2) == 0) {
                            break;
                        }
                        int var22 = 0;
                        while (true) {
                            if (var10 <= var22) {
                                break label98;
                            }
                            for (int var23 = 0; var23 < var12; var23++) {
                                byte var24 = var14[var10 * var23 + var22] = var2.method1029(-2);
                                var11 |= var24 != -1;
                            }
                            var22++;
                        }
                    }
                    for (int var21 = 0; var21 < var12; var21++) {
                        var15[var10 * var21 + var20] = var2.method1029(arg1 - 2);
                    }
                    var20++;
                }
            }
            class137.field2335[var9] = var11;
        }
    }
}
