import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vj")
public class class170 extends class215 {

    @OriginalMember(owner = "client!vj", name = "P", descriptor = "Lsb;")
    public static class110 field2693 = new class110(16);

    @OriginalMember(owner = "client!vj", name = "T", descriptor = "I")
    public static int field2697 = -1;

    @OriginalMember(owner = "client!vj", name = "R", descriptor = "[C")
    public static char[] field2695 = new char[] { '€', '\u0000', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', '\u0000', 'Ž', '\u0000', '\u0000', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', '\u0000', 'ž', 'Ÿ' };

    @OriginalMember(owner = "client!vj", name = "U", descriptor = "J")
    public static long field2698 = 0L;

    @OriginalMember(owner = "client!vj", name = "X", descriptor = "I")
    public static int field2701 = 0;

    @OriginalMember(owner = "client!vj", name = "N", descriptor = "I")
    public static int field2691;

    @OriginalMember(owner = "client!vj", name = "O", descriptor = "I")
    public static int field2692;

    @OriginalMember(owner = "client!vj", name = "Q", descriptor = "I")
    public static int field2694;

    @OriginalMember(owner = "client!vj", name = "S", descriptor = "I")
    public static int field2696;

    @OriginalMember(owner = "client!vj", name = "V", descriptor = "I")
    public static int field2699;

    @OriginalMember(owner = "client!vj", name = "W", descriptor = "I")
    public static int field2700;

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(IIBI)I")
    public static final int method1159(int arg0, int arg1, byte arg2, int arg3) {
        ++field2692;
        int var4 = arg0 / arg1;
        int var5 = arg0 & arg1 + -1;
        int var6 = arg3 & arg1 + -1;
        if (arg2 != 114) {
            field2695 = null;
        }
        int var7 = arg3 / arg1;
        int var8 = class24.method136(var7, arg2 ^ 941, var4);
        int var9 = class24.method136(var7, 991, var4 - -1);
        int var10 = class24.method136(var7 + 1, arg2 + 877, var4);
        int var11 = class24.method136(var7 - -1, 991, var4 + 1);
        int var12 = class278.method1852(var8, arg1, arg2 + -8, var9, var5);
        int var13 = class278.method1852(var10, arg1, 15, var11, var5);
        return class278.method1852(var12, arg1, 67, var13, var6);
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(ZI)V")
    public static final void method1160(boolean arg0, int arg1) {
        ++field2696;
        byte var2 = 4;
        byte[][] var3 = class281.field4451;
        if (arg1 != 8) {
            field2701 = 97;
        }
        for (int var4 = 0; var2 > var4; ++var4) {
            class51.method294((byte) -127);
            for (int var5 = 0; ~var5 > -14; ++var5) {
                for (int var6 = 0; ~var6 > -14; ++var6) {
                    int var7 = class67.field843[var4][var5][var6];
                    if (~var7 != 0) {
                        int var8 = (55002830 & var7) >> 24;
                        if (!arg0 || ~var8 == -1) {
                            int var9 = (var7 & 6) >> 1;
                            int var10 = (16766734 & var7) >> 14;
                            int var11 = 2047 & var7 >> 3;
                            int var12 = (var10 / 8 << 8) + var11 / 8;
                            for (int var13 = 0; var13 < class86.field1056.length; ++var13) {
                                if (~class86.field1056[var13] == ~var12 && var3[var13] != null) {
                                    class292.method1965(var5 * 8, var8, class187.field2975, var3[var13], arg0, (var10 & 7) * 8, var4, var9, (7 & var11) * 8, (byte) -111, var6 * 8);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!vj", name = "d", descriptor = "(B)V")
    public static void method1161(byte arg0) {
        field2693 = null;
        if (arg0 > 99) {
            field2695 = null;
        }
    }

    @OriginalMember(owner = "client!vj", name = "b", descriptor = "(II)[I")
    public final int[] method47(int arg0, int arg1) {
        ++field2691;
        if (arg1 != 255) {
            field2695 = null;
        }
        int[] var3 = super.field3445.method1755(arg0, (byte) 112);
        if (super.field3445.field4163) {
            class72.method405(var3, 0, class244.field4015, class76.field956[arg0]);
        }
        return var3;
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(IIB)V")
    public static final void method1162(int arg0, int arg1, byte arg2) {
        ++field2700;
        class34 var3 = class160.method1116(arg0, (byte) -35);
        int var4 = var3.field440;
        int var5 = var3.field445;
        int var6 = var3.field442;
        if (arg2 > -95) {
            field2701 = 26;
        }
        int var7 = class15.field194[var5 - var6];
        if (~arg1 > -1 || var7 < arg1) {
            arg1 = 0;
        }
        int var8 = var7 << var6;
        class52.method298(arg1 << var6 & var8 | ~var8 & class238.field3939[var4], 0, var4);
    }

    @OriginalMember(owner = "client!vj", name = "<init>", descriptor = "()V")
    public class170() {
        super(0, true);
    }
}
