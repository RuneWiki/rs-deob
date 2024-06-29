import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!f")
public class class37 extends class160 {

    @OriginalMember(owner = "client!f", name = "V", descriptor = "I")
    private int field521 = 1365;

    @OriginalMember(owner = "client!f", name = "Z", descriptor = "I")
    private int field525 = 0;

    @OriginalMember(owner = "client!f", name = "U", descriptor = "I")
    private int field520 = 0;

    @OriginalMember(owner = "client!f", name = "bb", descriptor = "I")
    private int field527 = 20;

    @OriginalMember(owner = "client!f", name = "S", descriptor = "Ljava/lang/String;")
    public static String field518 = null;

    @OriginalMember(owner = "client!f", name = "Y", descriptor = "I")
    public static int field524 = 0;

    @OriginalMember(owner = "client!f", name = "eb", descriptor = "Z")
    public static boolean field530 = false;

    @OriginalMember(owner = "client!f", name = "W", descriptor = "I")
    public static int field522;

    @OriginalMember(owner = "client!f", name = "X", descriptor = "I")
    public static int field523;

    @OriginalMember(owner = "client!f", name = "ab", descriptor = "I")
    public static int field526;

    @OriginalMember(owner = "client!f", name = "cb", descriptor = "I")
    public static int field528;

    @OriginalMember(owner = "client!f", name = "db", descriptor = "I")
    public static int field529;

    @OriginalMember(owner = "client!f", name = "T", descriptor = "Lhc;")
    public static class235 field519;

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;I)I")
    public static final int method273(int arg0, String arg1, String arg2, int arg3) {
        ++field526;
        int var4 = arg2.length();
        int var5 = arg1.length();
        int var6 = 0;
        int var7 = 0;
        char var8 = 0;
        char var9 = 0;
        while (~(-var9 + var6) > ~var4 || var5 > var7 - var8) {
            if (var4 <= -var9 + var6) {
                return -1;
            }
            if (-var8 + var7 >= var5) {
                return 1;
            }
            char var22;
            if (~var9 != -1) {
                var22 = var9;
                boolean var23 = false;
            } else {
                var22 = arg2.charAt(var6++);
            }
            char var24;
            if (~var8 != -1) {
                var24 = var8;
                boolean var25 = false;
            } else {
                var24 = arg1.charAt(var7++);
            }
            var9 = class86.method615(115, var22);
            var8 = class86.method615(115, var24);
            char var26 = class193.method1308(var22, -205, arg3);
            char var27 = class193.method1308(var24, arg0 + 976486663, arg3);
            if (var26 != var27 && Character.toUpperCase(var26) != Character.toUpperCase(var27)) {
                char var28 = Character.toLowerCase(var26);
                char var29 = Character.toLowerCase(var27);
                if (var28 != var29) {
                    return class78.method562(var28, arg3, (byte) 119) - class78.method562(var29, arg3, (byte) 119);
                }
            }
        }
        int var10 = Math.min(var4, var5);
        for (int var11 = 0; var10 > var11; ++var11) {
            int var16;
            int var17;
            if (~arg3 == -3) {
                var16 = var4 - 1 + -var11;
                var17 = var5 - var11 + -1;
            } else {
                var17 = var11;
                var16 = var11;
            }
            char var18 = arg2.charAt(var16);
            char var19 = arg1.charAt(var17);
            if (var18 != var19 && ~Character.toUpperCase(var18) != ~Character.toUpperCase(var19)) {
                char var20 = Character.toLowerCase(var18);
                char var21 = Character.toLowerCase(var19);
                if (~var20 != ~var21) {
                    return class78.method562(var20, arg3, (byte) 119) + -class78.method562(var21, arg3, (byte) 119);
                }
            }
        }
        int var12 = -var5 + var4;
        if (~var12 != -1) {
            return var12;
        } else if (arg0 != -976486868) {
            return 127;
        } else {
            for (int var13 = 0; ~var10 < ~var13; ++var13) {
                char var14 = arg2.charAt(var13);
                char var15 = arg1.charAt(var13);
                if (var14 != var15) {
                    return class78.method562(var14, arg3, (byte) 119) + -class78.method562(var15, arg3, (byte) 119);
                }
            }
            return 0;
        }
    }

    @OriginalMember(owner = "client!f", name = "e", descriptor = "(I)V")
    public static void method274(int arg0) {
        field518 = null;
        field519 = null;
        if (arg0 != -443) {
            field530 = true;
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(IB)[I")
    public final int[] method1(int arg0, byte arg1) {
        ++field523;
        int[] var3 = super.field2488.method15((byte) 124, arg0);
        if (arg1 != 57) {
            return null;
        } else {
            if (super.field2488.field42) {
                for (int var4 = 0; ~class240.field3896 < ~var4; ++var4) {
                    int var5 = (class103.field1713[arg0] << 12) / this.field521 + this.field525;
                    int var6 = (class190.field2946[var4] << 12) / this.field521 + this.field520;
                    int var7 = var6;
                    int var8 = var5;
                    int var9 = var6;
                    int var10 = var5;
                    int var11 = var6 * var6 >> 12;
                    int var12 = var5 * var5 >> 12;
                    int var13 = 0;
                    while (~(var11 + var12) > -16385 && this.field527 > var13) {
                        ++var13;
                        var10 = (var9 * var10 >> 12) * 2 + var8;
                        var9 = var7 + var11 + -var12;
                        var11 = var9 * var9 >> 12;
                        var12 = var10 * var10 >> 12;
                    }
                    var3[var4] = ~(this.field527 - 1) < ~var13 ? (var13 << 12) / this.field527 : 0;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!f", name = "<init>", descriptor = "()V")
    public class37() {
        super(0, true);
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(Lai;II)V")
    public final void method2(class88 arg0, int arg1, int arg2) {
        ++field522;
        if (arg1 >= 11) {
            if (arg2 != 0) {
                if (~arg2 != -2) {
                    if (arg2 != 2) {
                        if (~arg2 == -4) {
                            this.field525 = arg0.method645(11596);
                        }
                    } else {
                        this.field520 = arg0.method645(11596);
                    }
                } else {
                    this.field527 = arg0.method645(11596);
                }
            } else {
                this.field521 = arg0.method645(11596);
            }
        }
    }
}
