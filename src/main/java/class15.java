import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kh")
public class class15 extends class634 {

    @OriginalMember(owner = "client!kh", name = "J", descriptor = "I")
    private int field132 = 0;

    @OriginalMember(owner = "client!kh", name = "K", descriptor = "I")
    private int field133 = 20;

    @OriginalMember(owner = "client!kh", name = "M", descriptor = "I")
    private int field135 = 0;

    @OriginalMember(owner = "client!kh", name = "Q", descriptor = "I")
    private int field139 = 1365;

    @OriginalMember(owner = "client!kh", name = "H", descriptor = "Lnb;")
    public static class301 field130 = new class301("stellardawn", 1);

    @OriginalMember(owner = "client!kh", name = "L", descriptor = "[[Z")
    public static boolean[][] field134 = new boolean[][] { new boolean[13], { false, false, true, true, true, true, true, false, false, false, false, false, true }, { true, true, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, false, false, true, true, true, false, false, false, false, false }, { true, false, false, false, false, true, true, true, false, false, false, false, false }, { false, false, true, true, true, true, false, false, false, false, false, false, false }, { false, true, true, true, true, true, false, false, false, false, false, false, true }, { false, true, true, true, true, true, true, true, false, false, false, false, true }, { true, true, false, false, false, false, false, true, false, false, false, false, false }, { true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false }, { true, false, true, true, true, true, true, true, false, false, true, true, false }, { true, true, true, true, true, true, true, true, true, true, true, true, true }, new boolean[13], { true, true, true, true, true, true, true, true, true, true, true, true, true } };

    @OriginalMember(owner = "client!kh", name = "O", descriptor = "Ljt;")
    public static class104 field137 = new class104("", 15);

    @OriginalMember(owner = "client!kh", name = "F", descriptor = "I")
    public static int field128;

    @OriginalMember(owner = "client!kh", name = "G", descriptor = "I")
    public static int field129;

    @OriginalMember(owner = "client!kh", name = "I", descriptor = "I")
    public static int field131;

    @OriginalMember(owner = "client!kh", name = "N", descriptor = "I")
    public static int field136;

    @OriginalMember(owner = "client!kh", name = "P", descriptor = "I")
    public static int field138;

    @OriginalMember(owner = "client!kh", name = "R", descriptor = "[Ljava/lang/String;")
    public static String[] field140;

    @OriginalMember(owner = "client!kh", name = "f", descriptor = "(I)V", line = 3)
    public static void method71(int arg0) {
        field130 = null;
        field140 = null;
        field137 = null;
        if (arg0 != 2) {
            field137 = null;
        }
        field134 = null;
    }

    @OriginalMember(owner = "client!kh", name = "<init>", descriptor = "()V", line = 16)
    public class15() {
        super(0, true);
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(Lln;BI[II[I)Ljh;", line = 19)
    public static final class159 method72(class377 arg0, byte arg1, int arg2, int[] arg3, int arg4, int[] arg5) {
        if (arg1 >= -23) {
            method74(10, (String) null, -17, false, (String) null, (byte) 11, false);
        }
        ++field128;
        if (arg0.method2192(class252.field3039, class687.field9697, true)) {
            byte[] var6 = new byte[arg2 * arg4];
            for (int var7 = 0; ~var7 > ~arg2; ++var7) {
                int var8 = arg4 * var7 + arg5[var7];
                for (int var9 = 0; ~var9 > ~arg3[var7]; ++var9) {
                    var6[var8++] = -1;
                }
            }
            return new class159(arg0, arg4, arg2, var6);
        } else {
            int[] var10 = new int[arg2 * arg4];
            for (int var11 = 0; ~arg2 < ~var11; ++var11) {
                int var12 = arg4 * var11 + arg5[var11];
                for (int var13 = 0; ~var13 > ~arg3[var11]; ++var13) {
                    var10[var12++] = -16777216;
                }
            }
            return new class159(arg0, arg4, arg2, var10);
        }
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(II)Z", line = 76)
    public static final boolean method73(int arg0, int arg1) {
        if (arg0 != 0) {
            field137 = null;
        }
        ++field129;
        return ~arg1 == -4 || ~arg1 == -6 || arg1 == 6;
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(ILig;Z)V", line = 88)
    public final void method3(int arg0, class244 arg1, boolean arg2) {
        ++field131;
        if (~arg0 != -1) {
            if (~arg0 != -2) {
                if (arg0 != 2) {
                    if (~arg0 == -4) {
                        this.field135 = arg1.method1476(95);
                    }
                } else {
                    this.field132 = arg1.method1476(-74);
                }
            } else {
                this.field133 = arg1.method1476(51);
            }
        } else {
            this.field139 = arg1.method1476(-98);
        }
        if (arg2) {
            field140 = null;
        }
    }

    @OriginalMember(owner = "client!kh", name = "b", descriptor = "(BI)[I", line = 154)
    public final int[] method13(byte arg0, int arg1) {
        ++field138;
        int[] var3 = super.field9114.method1858(100, arg1);
        if (arg0 > -55) {
            this.method3(42, (class244) null, true);
        }
        if (super.field9114.field3897) {
            for (int var4 = 0; ~var4 > ~class635.field9139; ++var4) {
                int var5 = (class246.field2980[var4] << 12) / this.field139 + this.field132;
                int var6 = (class164.field1840[arg1] << 12) / this.field139 + this.field135;
                int var7 = var5;
                int var8 = var6;
                int var9 = var5;
                int var10 = var6;
                int var11 = var5 * var5 >> 12;
                int var12 = var6 * var6 >> 12;
                int var13;
                for (var13 = 0; ~(var11 - -var12) > -16385 && ~this.field133 < ~var13; ++var13) {
                    var10 = (var9 * var10 >> 12) * 2 - -var8;
                    var9 = -var12 + var11 + var7;
                    var11 = var9 * var9 >> 12;
                    var12 = var10 * var10 >> 12;
                }
                var3[var4] = ~var13 <= ~(this.field133 - 1) ? 0 : (var13 << 12) / this.field133;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(ILjava/lang/String;IZLjava/lang/String;BZ)V", line = 215)
    public static final void method74(int arg0, String arg1, int arg2, boolean arg3, String arg4, byte arg5, boolean arg6) {
        class332.field4306.field5531 = 1;
        ++field136;
        String var7 = arg4.toLowerCase();
        short[] var8 = new short[16];
        int var9 = -1;
        String var10 = null;
        if (~arg2 != 0) {
            class703 var11 = class84.field884.method98(true, arg2);
            if (var11 == null || var11.method3946((byte) -100) != arg3) {
                return;
            }
            if (!var11.method3946((byte) -100)) {
                var9 = var11.field9906;
            } else {
                var10 = var11.field9901;
            }
        }
        int var12 = 39 % ((-47 - arg5) / 60);
        int var13 = 0;
        for (int var14 = 0; ~var14 > ~class361.field4643.field1614; ++var14) {
            class431 var17 = class361.field4643.method912((byte) 1, var14);
            if ((!arg6 || var17.field6299) && var17.field6319 == -1 && var17.field6303 == -1 && var17.field6263 == 0 && var17.field6294.toLowerCase().indexOf(var7) != -1) {
                if (~arg2 != 0) {
                    if (arg3) {
                        if (!arg1.equals(var17.method2708(var10, (byte) 54, arg2))) {
                            continue;
                        }
                    } else if (arg0 != var17.method2710(0, arg2, var9)) {
                        continue;
                    }
                }
                if (var13 >= 250) {
                    class605.field8607 = -1;
                    class406.field5552 = null;
                    return;
                }
                if (var13 >= var8.length) {
                    short[] var18 = new short[var8.length * 2];
                    for (int var19 = 0; var19 < var13; ++var19) {
                        var18[var19] = var8[var19];
                    }
                    var8 = var18;
                }
                var8[var13++] = (short) var14;
            }
        }
        class605.field8607 = var13;
        class406.field5552 = var8;
        class707.field9972 = 0;
        String[] var15 = new String[class605.field8607];
        for (int var16 = 0; class605.field8607 > var16; ++var16) {
            var15[var16] = class361.field4643.method912((byte) 1, var8[var16]).field6294;
        }
        class503.method2986((byte) -103, class406.field5552, var15);
        class332.field4306.method2492((byte) 118);
        class332.field4306.field5531 = 2;
    }
}
