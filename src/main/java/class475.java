import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fj")
public class class475 extends class362 implements class21 {

    @OriginalMember(owner = "client!fj", name = "L", descriptor = "Lvr;")
    public class92 field6616;

    @OriginalMember(owner = "client!fj", name = "D", descriptor = "Z")
    private boolean field6609;

    @OriginalMember(owner = "client!fj", name = "I", descriptor = "J")
    public static long field6613 = 0L;

    @OriginalMember(owner = "client!fj", name = "C", descriptor = "I")
    public static int field6608 = 0;

    @OriginalMember(owner = "client!fj", name = "x", descriptor = "I")
    public static int field6603;

    @OriginalMember(owner = "client!fj", name = "y", descriptor = "I")
    public static int field6604;

    @OriginalMember(owner = "client!fj", name = "z", descriptor = "I")
    public static int field6605;

    @OriginalMember(owner = "client!fj", name = "A", descriptor = "I")
    public static int field6606;

    @OriginalMember(owner = "client!fj", name = "E", descriptor = "I")
    public static int field6610;

    @OriginalMember(owner = "client!fj", name = "G", descriptor = "I")
    public static int field6611;

    @OriginalMember(owner = "client!fj", name = "H", descriptor = "I")
    public static int field6612;

    @OriginalMember(owner = "client!fj", name = "J", descriptor = "I")
    public static int field6614;

    @OriginalMember(owner = "client!fj", name = "K", descriptor = "I")
    public static int field6615;

    @OriginalMember(owner = "client!fj", name = "M", descriptor = "I")
    public static int field6617;

    @OriginalMember(owner = "client!fj", name = "N", descriptor = "I")
    public static int field6618;

    @OriginalMember(owner = "client!fj", name = "O", descriptor = "I")
    public static int field6619;

    @OriginalMember(owner = "client!fj", name = "P", descriptor = "I")
    public static int field6620;

    @OriginalMember(owner = "client!fj", name = "Q", descriptor = "I")
    public static int field6621;

    @OriginalMember(owner = "client!fj", name = "B", descriptor = "[I")
    public static int[] field6607;

    @OriginalMember(owner = "client!fj", name = "f", descriptor = "(I)I")
    public final int method759(int arg0) {
        if (arg0 != -20767) {
            this.method110((byte) -114);
        }
        ++field6618;
        return this.field6616.method656((byte) -66);
    }

    @OriginalMember(owner = "client!fj", name = "c", descriptor = "(I)I")
    public final int method114(int arg0) {
        if (arg0 != -9772) {
            field6607 = null;
        }
        ++field6614;
        return this.field6616.field1154;
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(IILza;I)Z")
    public final boolean method129(int arg0, int arg1, class290 arg2, int arg3) {
        if (arg0 != 3) {
            return true;
        } else {
            ++field6611;
            class377 var5 = this.field6616.method662(super.field5171, false, (byte) 108, false, super.field5167, arg2, 131072);
            if (var5 == null) {
                return false;
            } else {
                class125 var6 = arg2.method368();
                var6.method825(super.field5175 + super.field5167, super.field5174, super.field5171 + super.field5169);
                return var5.method1586(arg1, arg3, var6, false);
            }
        }
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(B)I")
    public final int method110(byte arg0) {
        if (arg0 < 100) {
            field6613 = 57L;
        }
        ++field6603;
        return this.field6616.field1174;
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(I)I")
    public final int method112(int arg0) {
        int var2 = 41 % ((arg0 - -5) / 55);
        ++field6610;
        return this.field6616.field1177;
    }

    @OriginalMember(owner = "client!fj", name = "d", descriptor = "(I)V")
    public final void method115(int arg0) {
        ++field6612;
        if (arg0 != 16372) {
            this.method111(80, (class290) null);
        }
    }

    @OriginalMember(owner = "client!fj", name = "g", descriptor = "(I)V")
    public static void method2741(int arg0) {
        field6607 = null;
        if (arg0 <= 125) {
            method2742(13, 0, -31, 3, (byte[]) null, -53, -84, (byte[]) null, 93);
        }
    }

    @OriginalMember(owner = "client!fj", name = "b", descriptor = "(I)Z")
    public final boolean method113(int arg0) {
        ++field6617;
        if (arg0 != 31692) {
            this.method117((class290) null, (byte) 78);
        }
        return this.field6616.method654((byte) 105);
    }

    @OriginalMember(owner = "client!fj", name = "b", descriptor = "(Lza;B)Lkf;")
    public final class170 method126(class290 arg0, byte arg1) {
        ++field6620;
        class377 var3 = this.field6616.method662(super.field5171, false, (byte) 108, true, super.field5167, arg0, 2048);
        if (var3 == null) {
            return null;
        } else {
            if (arg1 > -86) {
                this.method130((class290) null, -29);
            }
            class125 var4 = arg0.method368();
            var4.method825(super.field5167 - -super.field5175, super.field5174, super.field5171 + super.field5169);
            class170 var5 = null;
            if (this.field6609) {
                var5 = class423.method2509(0, 1);
            }
            if (this.field6616.field1157 != null) {
                class324 var6 = this.field6616.field1157.method2084();
                arg0.method345(var3, var6, var4, var5 != null ? var5.field2475[0] : null, 0);
            } else {
                var3.method1566(var4, var5 != null ? var5.field2475[0] : null, 0);
            }
            int var7 = super.field5167 >> 7;
            int var8 = super.field5171 >> 7;
            this.field6616.method664(var3, true, var7, arg0, true, var7, var8, var8);
            return var5;
        }
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(ILza;I)Le;")
    public final class377 method116(int arg0, class290 arg1, int arg2) {
        ++field6606;
        if (arg0 != 13439) {
            field6608 = 7;
        }
        return this.field6616.method662(0, false, (byte) 96, false, 0, arg1, arg2);
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(Lza;B)V")
    public final void method117(class290 arg0, byte arg1) {
        if (arg1 != -38) {
            field6613 = 58L;
        }
        ++field6605;
        this.field6616.method653(arg0, arg1 + 37);
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(ILza;)V")
    public final void method111(int arg0, class290 arg1) {
        if (arg0 == -38) {
            ++field6621;
            this.field6616.method657(false, arg1);
        }
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(IIII[BII[BI)V")
    public static final void method2742(int arg0, int arg1, int arg2, int arg3, byte[] arg4, int arg5, int arg6, byte[] arg7, int arg8) {
        ++field6615;
        int var9 = -(arg0 >> 2);
        int var10 = 25 % ((81 - arg3) / 45);
        int var11 = -(arg0 & 3);
        for (int var12 = -arg8; ~var12 > -1; ++var12) {
            int var10001;
            for (int var13 = var9; ~var13 > -1; ++var13) {
                var10001 = arg6++;
                arg7[var10001] = (byte) (arg7[var10001] + -arg4[arg5++]);
                int var15 = arg6++;
                arg7[var15] = (byte) (arg7[var15] + -arg4[arg5++]);
                int var16 = arg6++;
                arg7[var16] = (byte) (arg7[var16] + -arg4[arg5++]);
                int var17 = arg6++;
                arg7[var17] = (byte) (arg7[var17] + -arg4[arg5++]);
            }
            for (int var14 = var11; ~var14 > -1; ++var14) {
                var10001 = arg6++;
                arg7[var10001] = (byte) (arg7[var10001] + -arg4[arg5++]);
            }
            arg6 += arg1;
            arg5 += arg2;
        }
    }

    @OriginalMember(owner = "client!fj", name = "<init>", descriptor = "(Lza;Lfu;IIIIIZIIIIII)V")
    public class475(class290 arg0, class270 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13) {
        super(arg4, arg5, arg6, arg8, arg9, arg10, class347.method2058((byte) 53, arg12, arg11));
        this.field6616 = new class92(arg0, arg1, arg11, arg12, arg2, arg3, arg4, arg6, arg7, arg13);
        this.field6609 = ~arg1.field3957 != -1 && !arg7;
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(Lza;I)V")
    public final void method130(class290 arg0, int arg1) {
        if (arg1 != 0) {
            this.method113(-39);
        }
        ++field6604;
        class377 var3 = this.field6616.method662(super.field5171, false, (byte) 83, true, super.field5167, arg0, 262144);
        if (var3 != null) {
            int var4 = super.field5167 >> 7;
            int var5 = super.field5171 >> 7;
            this.field6616.method664(var3, false, var4, arg0, true, var4, var5, var5);
        }
    }
}
