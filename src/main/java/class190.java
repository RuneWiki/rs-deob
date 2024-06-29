import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fd")
public class class190 extends class175 {

    @OriginalMember(owner = "client!fd", name = "O", descriptor = "I")
    private int field3139 = 0;

    @OriginalMember(owner = "client!fd", name = "V", descriptor = "I")
    private int field3145 = 16;

    @OriginalMember(owner = "client!fd", name = "X", descriptor = "I")
    private int field3147 = 4096;

    @OriginalMember(owner = "client!fd", name = "T", descriptor = "I")
    private int field3143 = 2000;

    @OriginalMember(owner = "client!fd", name = "Z", descriptor = "I")
    private int field3149 = 0;

    @OriginalMember(owner = "client!fd", name = "R", descriptor = "Lag;")
    public static class235 field3141 = new class235(5000);

    @OriginalMember(owner = "client!fd", name = "cb", descriptor = "Z")
    public static boolean field3152 = true;

    @OriginalMember(owner = "client!fd", name = "eb", descriptor = "[I")
    public static int[] field3154 = new int[25];

    @OriginalMember(owner = "client!fd", name = "K", descriptor = "I")
    public static int field3135;

    @OriginalMember(owner = "client!fd", name = "L", descriptor = "I")
    public static int field3136;

    @OriginalMember(owner = "client!fd", name = "M", descriptor = "I")
    public static int field3137;

    @OriginalMember(owner = "client!fd", name = "N", descriptor = "I")
    public static int field3138;

    @OriginalMember(owner = "client!fd", name = "Q", descriptor = "I")
    public static int field3140;

    @OriginalMember(owner = "client!fd", name = "S", descriptor = "I")
    public static int field3142;

    @OriginalMember(owner = "client!fd", name = "U", descriptor = "I")
    public static int field3144;

    @OriginalMember(owner = "client!fd", name = "W", descriptor = "I")
    public static int field3146;

    @OriginalMember(owner = "client!fd", name = "Y", descriptor = "I")
    public static int field3148;

    @OriginalMember(owner = "client!fd", name = "bb", descriptor = "I")
    public static int field3151;

    @OriginalMember(owner = "client!fd", name = "db", descriptor = "I")
    public static int field3153;

    @OriginalMember(owner = "client!fd", name = "ab", descriptor = "[Ljd;")
    public static class85[] field3150;

    @OriginalMember(owner = "client!fd", name = "d", descriptor = "(B)V")
    public static void method1279(byte arg0) {
        field3154 = null;
        field3150 = null;
        field3141 = null;
        if (arg0 < 104) {
            field3153 = -72;
        }
    }

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "(II)[I")
    public final int[] method29(int arg0, int arg1) {
        ++field3136;
        if (arg1 != -27746) {
            field3154 = null;
        }
        int[] var3 = super.field2941.method1427(-21281, arg0);
        if (super.field2941.field3565) {
            int var4 = this.field3147 >> 1;
            int[][] var5 = super.field2941.method1428(128);
            Random var6 = new Random((long) this.field3149);
            for (int var7 = 0; var7 < this.field3143; ++var7) {
                int var8 = ~this.field3147 < -1 ? this.field3139 + class63.method494(var6, -32752, this.field3147) + -var4 : this.field3139;
                int var9 = 255 & var8 >> 4;
                int var10 = class63.method494(var6, -32752, class211.field3514);
                int var11 = class63.method494(var6, -32752, class220.field3690);
                int var12 = (class247.field4305[var9] * this.field3145 >> 12) + var11;
                int var13 = -var11 + var12;
                int var14 = (class241.field4151[var9] * this.field3145 >> 12) + var10;
                int var15 = -var10 + var14;
                if (var15 != 0 || var13 != 0) {
                    if (~var15 > -1) {
                        var15 = -var15;
                    }
                    if (var13 < 0) {
                        var13 = -var13;
                    }
                    boolean var16 = ~var15 > ~var13;
                    if (var16) {
                        int var17 = var10;
                        int var18 = var14;
                        var14 = var12;
                        var10 = var11;
                        var11 = var17;
                        var12 = var18;
                    }
                    if (var14 < var10) {
                        int var19 = var10;
                        int var20 = var11;
                        var10 = var14;
                        var11 = var12;
                        var14 = var19;
                        var12 = var20;
                    }
                    int var21 = var11;
                    int var22 = -var10 + var14;
                    int var23 = -var22 / 2;
                    int var24 = -var11 + var12;
                    int var25 = 2048 / var22;
                    if (var24 < 0) {
                        var24 = -var24;
                    }
                    int var26 = 1024 + -(class63.method494(var6, -32752, 4096) >> 2);
                    int var27 = var11 >= var12 ? -1 : 1;
                    for (int var28 = var10; ~var28 > ~var14; ++var28) {
                        var23 += var24;
                        int var29 = (-var10 + var28) * var25 + var26 - -1024;
                        int var30 = class161.field2765 & var28;
                        int var31 = var21 & class108.field1928;
                        if (var23 > 0) {
                            var21 += var27;
                            var23 -= var22;
                        }
                        if (!var16) {
                            var5[var30][var31] = var29;
                        } else {
                            var5[var31][var30] = var29;
                        }
                    }
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/Class;")
    public static final Class method1280(int arg0, String arg1) throws ClassNotFoundException {
        ++field3148;
        if (arg1.equals("B")) {
            return Byte.TYPE;
        } else if (arg1.equals("I")) {
            return Integer.TYPE;
        } else if (arg1.equals("S")) {
            return Short.TYPE;
        } else if (arg1.equals("J")) {
            return Long.TYPE;
        } else if (arg1.equals("Z")) {
            return Boolean.TYPE;
        } else if (arg1.equals("F")) {
            return Float.TYPE;
        } else if (arg1.equals("D")) {
            return Double.TYPE;
        } else if (arg1.equals("C")) {
            return Character.TYPE;
        } else {
            if (arg0 <= 61) {
                method1282((class53) null, -120);
            }
            return Class.forName(arg1);
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(Lce;I)Lij;")
    public static final class50 method1281(class10 arg0, int arg1) {
        int var2 = -58 % ((arg1 - -7) / 58);
        ++field3144;
        if (~class164.method1145((byte) 120, client.method605(arg0)) == -1) {
            return null;
        } else if (arg0.field201 != null && arg0.field201.method399(false).method396(1) != 0) {
            return arg0.field201;
        } else {
            return class126.field2206 ? class155.field2694 : null;
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(ZILwd;)V")
    public final void method39(boolean arg0, int arg1, class217 arg2) {
        if (arg1 != 0) {
            if (arg1 != 1) {
                if (arg1 != 2) {
                    if (~arg1 != -4) {
                        if (~arg1 == -5) {
                            this.field3147 = arg2.method1441(-32);
                        }
                    } else {
                        this.field3139 = arg2.method1441(-94);
                    }
                } else {
                    this.field3145 = arg2.method1487(255);
                }
            } else {
                this.field3143 = arg2.method1441(115);
            }
        } else {
            this.field3149 = arg2.method1487(255);
        }
        if (arg0) {
            ++field3137;
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(Ltf;I)V")
    public static final void method1282(class53 arg0, int arg1) {
        ++field3138;
        class60 var2 = (class60) class217.field3637.method689(1001);
        if (arg1 == 27262) {
            while (var2 != null) {
                if (var2.field1115 == arg0) {
                    if (var2.field1102 != null) {
                        class174.field2907.method80(var2.field1102);
                        var2.field1102 = null;
                    }
                    var2.method267(126);
                    return;
                }
                var2 = (class60) class217.field3637.method688(-53);
            }
        }
    }

    @OriginalMember(owner = "client!fd", name = "<init>", descriptor = "()V")
    public class190() {
        super(0, true);
    }

    @OriginalMember(owner = "client!fd", name = "f", descriptor = "(I)V")
    public final void method44(int arg0) {
        ++field3140;
        if (arg0 != 0) {
            field3150 = null;
        }
        class160.method1128((byte) -98);
    }

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "(III)I")
    public static final int method1283(int arg0, int arg1, int arg2) {
        if (arg0 >= -63) {
            field3152 = true;
        }
        ++field3142;
        int var3 = arg1 >> 31 & arg2 - 1;
        return ((arg1 >>> 31) + arg1) % arg2 - -var3;
    }

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "(Z)I")
    public static final int method1284(boolean arg0) {
        ++field3135;
        if (arg0) {
            field3151 = -101;
        }
        return ((class203.field3379 == 0 ? 0 : 1) << 22) + ((~class66.field1260 != -1 ? 1 : 0) << 21) + ((~class196.field3249 == -1 ? 0 : 1) << 20) + ((class5.field68 ? 1 : 0) << 19) + ((!class126.field2210 ? 0 : 1) << 16) + ((class70.field1344 ? 1 : 0) << 15) + (6144 & class83.field1556 << 11) + ((!class76.field1440 ? 0 : 1) << 10) + ((!class44.field808 ? 0 : 1) << 7) + ((class172.field2878 ? 1 : 0) << 5) + ((class193.field3211 ? 1 : 0) << 4) + (7 & class99.field1828) - -((class193.field3208 ? 1 : 0) << 3) + ((!class21.field459 ? 0 : 1) << 6) - (-((class56.field998 ? 1 : 0) << 8) - (((class146.field2530 ? 1 : 0) << 9) + ((client.field1525 ? 1 : 0) << 13))) + ((3 & class170.field2841) << 17);
    }
}
