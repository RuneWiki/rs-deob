import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!t")
public class class197 extends class8 {

    @OriginalMember(owner = "client!t", name = "P", descriptor = "I")
    private int field3139 = 12288;

    @OriginalMember(owner = "client!t", name = "W", descriptor = "I")
    private int field3146 = 4096;

    @OriginalMember(owner = "client!t", name = "M", descriptor = "I")
    private int field3136 = 2048;

    @OriginalMember(owner = "client!t", name = "L", descriptor = "I")
    private int field3135 = 8192;

    @OriginalMember(owner = "client!t", name = "N", descriptor = "I")
    private int field3137 = 0;

    @OriginalMember(owner = "client!t", name = "U", descriptor = "I")
    private int field3144 = 2048;

    @OriginalMember(owner = "client!t", name = "X", descriptor = "I")
    private int field3147 = 0;

    @OriginalMember(owner = "client!t", name = "I", descriptor = "[Z")
    public static boolean[] field3132 = new boolean[200];

    @OriginalMember(owner = "client!t", name = "V", descriptor = "Ljava/lang/String;")
    public static String field3145 = null;

    @OriginalMember(owner = "client!t", name = "Z", descriptor = "Lfi;")
    public static class110 field3149 = new class110();

    @OriginalMember(owner = "client!t", name = "bb", descriptor = "Ljava/lang/String;")
    public static String field3151 = "white:";

    @OriginalMember(owner = "client!t", name = "cb", descriptor = "Ljava/lang/String;")
    public static String field3152 = null;

    @OriginalMember(owner = "client!t", name = "J", descriptor = "I")
    public static int field3133;

    @OriginalMember(owner = "client!t", name = "K", descriptor = "I")
    public static int field3134;

    @OriginalMember(owner = "client!t", name = "O", descriptor = "I")
    public static int field3138;

    @OriginalMember(owner = "client!t", name = "Q", descriptor = "I")
    public static int field3140;

    @OriginalMember(owner = "client!t", name = "R", descriptor = "I")
    public static int field3141;

    @OriginalMember(owner = "client!t", name = "S", descriptor = "I")
    public static int field3142;

    @OriginalMember(owner = "client!t", name = "T", descriptor = "I")
    public static int field3143;

    @OriginalMember(owner = "client!t", name = "Y", descriptor = "I")
    public static int field3148;

    @OriginalMember(owner = "client!t", name = "ab", descriptor = "I")
    public static int field3150;

    @OriginalMember(owner = "client!t", name = "a", descriptor = "([BZ)V")
    public static final void method1335(byte[] arg0, boolean arg1) {
        ++field3133;
        class221 var2 = new class221(arg0);
        var2.field3655 = arg0.length + -2;
        class278.field4385 = var2.method1521((byte) 113);
        class139.field2276 = new boolean[class278.field4385];
        class236.field3847 = new int[class278.field4385];
        class74.field1202 = new int[class278.field4385];
        if (!arg1) {
            class148.field2385 = new int[class278.field4385];
            class211.field3447 = new byte[class278.field4385][];
            class152.field2464 = new int[class278.field4385];
            class145.field2332 = new byte[class278.field4385][];
            var2.field3655 = arg0.length - class278.field4385 * 8 + -7;
            class27.field432 = var2.method1521((byte) 113);
            class155.field2513 = var2.method1521((byte) 113);
            int var3 = 1 + (255 & var2.method1517((byte) -96));
            for (int var4 = 0; ~var4 > ~class278.field4385; ++var4) {
                class152.field2464[var4] = var2.method1521((byte) 113);
            }
            for (int var5 = 0; var5 < class278.field4385; ++var5) {
                class74.field1202[var5] = var2.method1521((byte) 113);
            }
            for (int var6 = 0; class278.field4385 > var6; ++var6) {
                class148.field2385[var6] = var2.method1521((byte) 113);
            }
            for (int var7 = 0; ~var7 > ~class278.field4385; ++var7) {
                class236.field3847[var7] = var2.method1521((byte) 113);
            }
            var2.field3655 = -(class278.field4385 * 8) + -7 + arg0.length + -((var3 - 1) * 3);
            class194.field3113 = new int[var3];
            for (int var8 = 1; var8 < var3; ++var8) {
                class194.field3113[var8] = var2.method1531(65280);
                if (class194.field3113[var8] == 0) {
                    class194.field3113[var8] = 1;
                }
            }
            var2.field3655 = 0;
            for (int var9 = 0; ~class278.field4385 < ~var9; ++var9) {
                int var10 = class148.field2385[var9];
                int var11 = class236.field3847[var9];
                int var12 = var10 * var11;
                byte[] var13 = new byte[var12];
                byte[] var14 = new byte[var12];
                class145.field2332[var9] = var14;
                class211.field3447[var9] = var13;
                int var15 = var2.method1517((byte) -96);
                boolean var16 = false;
                if (~(1 & var15) != -1) {
                    int var17 = 0;
                    label92: while (true) {
                        if (~var17 <= ~var10) {
                            if ((var15 & 2) == 0) {
                                break;
                            }
                            int var18 = 0;
                            while (true) {
                                if (~var10 >= ~var18) {
                                    break label92;
                                }
                                for (int var19 = 0; ~var11 < ~var19; ++var19) {
                                    byte var20 = var13[var18 - -(var10 * var19)] = var2.method1535((byte) -96);
                                    var16 |= var20 != -1;
                                }
                                ++var18;
                            }
                        }
                        for (int var21 = 0; var11 > var21; ++var21) {
                            var14[var10 * var21 + var17] = var2.method1535((byte) -95);
                        }
                        ++var17;
                    }
                } else {
                    for (int var22 = 0; var22 < var12; ++var22) {
                        var14[var22] = var2.method1535((byte) -107);
                    }
                    if ((var15 & 2) != 0) {
                        for (int var23 = 0; var23 < var12; ++var23) {
                            byte var24 = var13[var23] = var2.method1535((byte) -89);
                            var16 |= ~var24 != 0;
                        }
                    }
                }
                class139.field2276[var9] = var16;
            }
        }
    }

    @OriginalMember(owner = "client!t", name = "b", descriptor = "(II)[I")
    public final int[] method44(int arg0, int arg1) {
        ++field3148;
        int[] var3 = super.field110.method1585(0, arg1);
        if (arg0 != 3) {
            return null;
        } else {
            if (super.field110.field3734) {
                int var4 = class182.field2864[arg1] + -2048;
                for (int var5 = 0; class231.field3798 > var5; ++var5) {
                    int var6 = class176.field2776[var5] + -2048;
                    int var7 = var6 - -this.field3144;
                    int var8 = ~var7 <= 2047 ? var7 : var7 + 4096;
                    int var9 = ~var8 >= -2049 ? var8 : var8 + -4096;
                    int var10 = var6 - -this.field3137;
                    int var11 = this.field3147 + var4;
                    int var12 = ~var10 > 2047 ? var10 + 4096 : var10;
                    int var13 = var12 > 2048 ? var12 + -4096 : var12;
                    int var14 = var4 - -this.field3136;
                    int var15 = ~var11 <= 2047 ? var11 : var11 - -4096;
                    int var16 = ~var14 <= 2047 ? var14 : var14 - -4096;
                    int var17 = ~var16 < -2049 ? var16 + -4096 : var16;
                    int var18 = ~var15 >= -2049 ? var15 : var15 - 4096;
                    var3[var5] = !this.method1338(false, var9, var18) && !this.method1337(var17, var13, (byte) 6) ? 0 : 4096;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!t", name = "d", descriptor = "(Z)V")
    public static final void method1336(boolean arg0) {
        if (class72.field1188 != null) {
            class162 var1 = class72.field1188;
            synchronized (class72.field1188) {
                class72.field1188 = null;
            }
        }
        ++field3141;
        if (!arg0) {
            field3151 = null;
        }
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(IIB)Z")
    private final boolean method1337(int arg0, int arg1, byte arg2) {
        ++field3134;
        int var4 = (arg0 + arg1) * this.field3139 >> 12;
        int var5 = class84.field1319[var4 * 255 >> 12 & 255];
        int var6 = (var5 << 12) / this.field3139;
        int var7 = -25 / ((-85 - arg2) / 33);
        int var8 = (var6 << 12) / this.field3135;
        int var9 = this.field3146 * var8 >> 12;
        return ~var9 < ~(arg0 - arg1) && -var9 < -arg1 + arg0;
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(ZII)Z")
    private final boolean method1338(boolean arg0, int arg1, int arg2) {
        int var4 = (-arg1 + arg2) * this.field3139 >> 12;
        if (arg0) {
            method1339(-18);
        }
        ++field3138;
        int var5 = class84.field1319[(1044945 & var4 * 255) >> 12];
        int var6 = (var5 << 12) / this.field3139;
        int var7 = (var6 << 12) / this.field3135;
        int var8 = this.field3146 * var7 >> 12;
        return var8 > arg1 + arg2 && ~(arg1 - -arg2) < ~(-var8);
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(BLog;I)V")
    public final void method64(byte arg0, class221 arg1, int arg2) {
        ++field3142;
        if (arg0 >= 62) {
            if (arg2 != 0) {
                if (arg2 != 1) {
                    if (arg2 != 2) {
                        if (~arg2 != -4) {
                            if (arg2 != 4) {
                                if (~arg2 != -6) {
                                    if (arg2 == 6) {
                                        this.field3135 = arg1.method1521((byte) 113);
                                    }
                                } else {
                                    this.field3146 = arg1.method1521((byte) 113);
                                }
                            } else {
                                this.field3139 = arg1.method1521((byte) 113);
                            }
                        } else {
                            this.field3136 = arg1.method1521((byte) 113);
                        }
                    } else {
                        this.field3137 = arg1.method1521((byte) 113);
                    }
                } else {
                    this.field3147 = arg1.method1521((byte) 113);
                }
            } else {
                this.field3144 = arg1.method1521((byte) 113);
            }
        }
    }

    @OriginalMember(owner = "client!t", name = "e", descriptor = "(I)V")
    public static void method1339(int arg0) {
        field3152 = null;
        field3132 = null;
        field3145 = null;
        if (arg0 != -15880) {
            field3152 = null;
        }
        field3151 = null;
        field3149 = null;
    }

    @OriginalMember(owner = "client!t", name = "f", descriptor = "(I)I")
    public static final int method1340(int arg0) {
        ++field3143;
        int var1 = 56 % ((arg0 - 20) / 56);
        class8.field97 = 0;
        return class231.method1616(-1);
    }

    @OriginalMember(owner = "client!t", name = "c", descriptor = "(Z)V")
    public final void method66(boolean arg0) {
        if (arg0) {
            method1339(102);
        }
        class78.method547(14764);
        ++field3140;
    }

    @OriginalMember(owner = "client!t", name = "<init>", descriptor = "()V")
    public class197() {
        super(0, true);
    }
}
