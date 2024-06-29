import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ld")
public class class152 extends class89 {

    @OriginalMember(owner = "client!ld", name = "jb", descriptor = "I")
    private int field2671 = 32768;

    @OriginalMember(owner = "client!ld", name = "Q", descriptor = "[I")
    public static int[] field2652 = new int[128];

    @OriginalMember(owner = "client!ld", name = "R", descriptor = "Lda;")
    public static class275 field2653 = class255.method1672(123, " steht bereits auf Ihrer Freunde)2Liste(Q");

    @OriginalMember(owner = "client!ld", name = "S", descriptor = "I")
    public static int field2654 = 0;

    @OriginalMember(owner = "client!ld", name = "Z", descriptor = "I")
    public static int field2661 = 0;

    @OriginalMember(owner = "client!ld", name = "X", descriptor = "I")
    public static int field2659 = 0;

    @OriginalMember(owner = "client!ld", name = "gb", descriptor = "Z")
    public static boolean field2668 = false;

    @OriginalMember(owner = "client!ld", name = "eb", descriptor = "I")
    public static int field2666 = 0;

    @OriginalMember(owner = "client!ld", name = "hb", descriptor = "I")
    public static int field2669 = 0;

    @OriginalMember(owner = "client!ld", name = "W", descriptor = "Z")
    public static boolean field2658 = false;

    @OriginalMember(owner = "client!ld", name = "U", descriptor = "I")
    public static int field2656;

    @OriginalMember(owner = "client!ld", name = "V", descriptor = "I")
    public static int field2657;

    @OriginalMember(owner = "client!ld", name = "Y", descriptor = "I")
    public static int field2660;

    @OriginalMember(owner = "client!ld", name = "bb", descriptor = "I")
    public static int field2663;

    @OriginalMember(owner = "client!ld", name = "cb", descriptor = "I")
    public static int field2664;

    @OriginalMember(owner = "client!ld", name = "db", descriptor = "I")
    public static int field2665;

    @OriginalMember(owner = "client!ld", name = "fb", descriptor = "I")
    public static int field2667;

    @OriginalMember(owner = "client!ld", name = "ib", descriptor = "I")
    public static int field2670;

    @OriginalMember(owner = "client!ld", name = "T", descriptor = "[I")
    public static int[] field2655;

    @OriginalMember(owner = "client!ld", name = "ab", descriptor = "[I")
    public static int[] field2662;

    @OriginalMember(owner = "client!ld", name = "kb", descriptor = "[[S")
    public static short[][] field2672;

    @OriginalMember(owner = "client!ld", name = "i", descriptor = "(I)V")
    public static void method1073(int arg0) {
        field2653 = null;
        if (arg0 == -4143) {
            field2652 = null;
            field2662 = null;
            field2655 = null;
            field2672 = null;
        }
    }

    @OriginalMember(owner = "client!ld", name = "<init>", descriptor = "()V")
    public class152() {
        super(3, false);
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(ZI)[[I")
    public final int[][] method21(boolean arg0, int arg1) {
        if (!arg0) {
            this.method49(-95, (class85) null, -110);
        }
        ++field2665;
        int[][] var3 = super.field1512.method824(arg1, (byte) -33);
        if (super.field1512.field2007) {
            int[] var4 = this.method645(-128, 1, arg1);
            int[] var5 = this.method645(-126, 2, arg1);
            int[] var6 = var3[2];
            int[] var7 = var3[0];
            int[] var8 = var3[1];
            for (int var9 = 0; class65.field1070 > var9; ++var9) {
                int var10 = var5[var9] * this.field2671 >> 12;
                int var11 = (1044824 & var4[var9] * 255) >> 12;
                int var12 = class143.field2519[var11] * var10 >> 12;
                int var13 = class159.field2791[var11] * var10 >> 12;
                int var14 = (var13 >> 12) + var9 & class1.field11;
                int var15 = class277.field4837 & arg1 - -(var12 >> 12);
                int[][] var16 = this.method648(arg0, 0, var15);
                var7[var9] = var16[0][var14];
                var8[var9] = var16[1][var14];
                var6[var9] = var16[2][var14];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(ILij;I)V")
    public final void method49(int arg0, class85 arg1, int arg2) {
        ++field2657;
        if (arg0 == -20503) {
            if (~arg2 != -1) {
                if (arg2 == 1) {
                    super.field1508 = ~arg1.method564((byte) 49) == -2;
                }
            } else {
                this.field2671 = arg1.method608(106) << 4;
            }
        }
    }

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "(II)I")
    public static final int method1074(int arg0, int arg1) {
        if (arg0 <= 45) {
            method1077(12, 74, 72, (class165) null);
        }
        ++field2656;
        return arg1 >>> 7;
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(IZ)[I")
    public final int[] method239(int arg0, boolean arg1) {
        ++field2660;
        if (arg1) {
            this.method49(-2, (class85) null, -29);
        }
        int[] var3 = super.field1503.method229(arg0, (byte) -90);
        if (super.field1503.field664) {
            int[] var4 = this.method645(120, 1, arg0);
            int[] var5 = this.method645(-126, 2, arg0);
            for (int var6 = 0; ~var6 > ~class65.field1070; ++var6) {
                int var7 = (var4[var6] & 4081) >> 4;
                int var8 = var5[var6] * this.field2671 >> 12;
                int var9 = class159.field2791[var7] * var8 >> 12;
                int var10 = class143.field2519[var7] * var8 >> 12;
                int var11 = class1.field11 & var6 - -(var9 >> 12);
                int var12 = (var10 >> 12) + arg0 & class277.field4837;
                int[] var13 = this.method645(-125, 0, var12);
                var3[var6] = var13[var11];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ld", name = "j", descriptor = "(I)Lpb;")
    public static final class124 method1075(int arg0) {
        if (arg0 != 128) {
            method1076((byte) -111);
        }
        ++field2664;
        try {
            return (class124) Class.forName("jf").newInstance();
        } catch (Throwable var1) {
            return null;
        }
    }

    @OriginalMember(owner = "client!ld", name = "c", descriptor = "(B)V")
    public static final void method1076(byte arg0) {
        class249 var1 = (class249) class277.field4835.method550(-74);
        if (arg0 != 25) {
            field2652 = null;
        }
        while (var1 != null) {
            if (var1.field4398) {
                var1.method1632((byte) -113);
            }
            var1 = (class249) class277.field4835.method545(104);
        }
        for (class249 var2 = (class249) class135.field2387.method550(-81); var2 != null; var2 = (class249) class135.field2387.method545(104)) {
            if (var2.field4398) {
                var2.method1632((byte) -113);
            }
        }
        ++field2667;
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(IIILgd;)V")
    public static final void method1077(int arg0, int arg1, int arg2, class165 arg3) {
        ++field2670;
        if (arg3.field1776 == arg0 && arg0 != -1) {
            class215 var4 = class201.method1321(128, arg0);
            int var5 = var4.field3671;
            if (var5 == 1) {
                arg3.field1740 = 0;
                arg3.field1780 = 0;
                arg3.field1744 = 0;
                arg3.field1749 = arg2;
                class12.method54(-1797326908, false, arg3.field1758, arg3.field1770, arg3.field1740, var4);
            }
            if (~var5 == -3) {
                arg3.field1744 = 0;
            }
        } else if (arg0 == -1 || arg3.field1776 == -1 || ~class201.method1321(128, arg0).field3662 <= ~class201.method1321(128, arg3.field1776).field3662) {
            arg3.field1781 = arg3.field1791;
            arg3.field1744 = 0;
            arg3.field1749 = arg2;
            arg3.field1740 = 0;
            arg3.field1776 = arg0;
            arg3.field1780 = 0;
            if (arg3.field1776 != -1) {
                class12.method54(-1797326908, false, arg3.field1758, arg3.field1770, arg3.field1740, class201.method1321(128, arg3.field1776));
            }
        }
        if (arg1 >= -77) {
            field2653 = null;
        }
    }

    @OriginalMember(owner = "client!ld", name = "e", descriptor = "(I)V")
    public final void method234(int arg0) {
        class250.method1642((byte) 104);
        if (arg0 == 1) {
            ++field2663;
        }
    }
}
