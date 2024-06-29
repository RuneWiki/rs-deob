import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nf")
public class class157 extends class53 {

    @OriginalMember(owner = "client!nf", name = "E", descriptor = "S")
    public static short field2735 = 256;

    @OriginalMember(owner = "client!nf", name = "J", descriptor = "Lua;")
    public static class113 field2740 = null;

    @OriginalMember(owner = "client!nf", name = "C", descriptor = "[I")
    public static int[] field2733 = new int[25];

    @OriginalMember(owner = "client!nf", name = "O", descriptor = "I")
    public static int field2745 = 0;

    @OriginalMember(owner = "client!nf", name = "M", descriptor = "Z")
    public static boolean field2743 = false;

    @OriginalMember(owner = "client!nf", name = "V", descriptor = "Z")
    public static boolean field2752 = true;

    @OriginalMember(owner = "client!nf", name = "X", descriptor = "I")
    public static int field2754 = -1;

    @OriginalMember(owner = "client!nf", name = "I", descriptor = "I")
    public static int field2739 = 0;

    @OriginalMember(owner = "client!nf", name = "F", descriptor = "I")
    public static int field2736;

    @OriginalMember(owner = "client!nf", name = "G", descriptor = "I")
    public int field2737;

    @OriginalMember(owner = "client!nf", name = "H", descriptor = "I")
    public static int field2738;

    @OriginalMember(owner = "client!nf", name = "K", descriptor = "I")
    public static int field2741;

    @OriginalMember(owner = "client!nf", name = "L", descriptor = "I")
    public static int field2742;

    @OriginalMember(owner = "client!nf", name = "N", descriptor = "I")
    public static int field2744;

    @OriginalMember(owner = "client!nf", name = "P", descriptor = "I")
    public static int field2746;

    @OriginalMember(owner = "client!nf", name = "Q", descriptor = "I")
    public static int field2747;

    @OriginalMember(owner = "client!nf", name = "R", descriptor = "I")
    public int field2748;

    @OriginalMember(owner = "client!nf", name = "S", descriptor = "I")
    public static int field2749;

    @OriginalMember(owner = "client!nf", name = "T", descriptor = "I")
    public static int field2750;

    @OriginalMember(owner = "client!nf", name = "U", descriptor = "I")
    public int field2751;

    @OriginalMember(owner = "client!nf", name = "W", descriptor = "I")
    public static int field2753;

    @OriginalMember(owner = "client!nf", name = "Y", descriptor = "I")
    public static int field2755;

    @OriginalMember(owner = "client!nf", name = "D", descriptor = "Lp;")
    public class280 field2734;

    @OriginalMember(owner = "client!nf", name = "b", descriptor = "(B)V")
    public final void method1112(byte arg0) {
        ++field2744;
        super.field865 |= Long.MIN_VALUE;
        if (~this.method1119(-108) == -1L) {
            class49.field805.method273(0, this);
        }
        if (arg0 < 90) {
            this.field2737 = -33;
        }
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(II)Lv;")
    public static final class149 method1113(int arg0, int arg1) {
        ++field2750;
        if (arg0 > -49) {
            return null;
        } else {
            class149 var2 = (class149) class120.field2137.method1480((byte) 50, (long) arg1);
            if (var2 != null) {
                return var2;
            } else {
                class149 var3 = class152.method1075(arg1, class112.field1852, false, false, class204.field3548);
                if (var3 != null) {
                    class120.field2137.method1483((byte) -104, (long) arg1, var3);
                }
                return var3;
            }
        }
    }

    @OriginalMember(owner = "client!nf", name = "c", descriptor = "(B)I")
    public final int method1114(byte arg0) {
        int var2 = -13 % ((arg0 - -35) / 37);
        ++field2742;
        return (int) (255L & super.field2827 >>> 32);
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(Lua;I)Lua;")
    public static final class113 method1115(class113 arg0, int arg1) {
        ++field2736;
        if (~arg0.field1998 != 0) {
            return class233.method1569(65535, arg0.field1998);
        } else {
            int var2 = arg0.field1964 >>> 16;
            class185 var3 = new class185(class261.field4614);
            for (class144 var4 = (class144) var3.method1287(22580); var4 != null; var4 = (class144) var3.method1290(-1)) {
                if (var4.field2517 == var2) {
                    return class233.method1569(65535, (int) var4.field2827);
                }
            }
            if (arg1 != 22226) {
                field2752 = false;
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!nf", name = "b", descriptor = "(II)Lpf;")
    public static final class281 method1116(int arg0, int arg1) {
        ++field2738;
        class281 var2 = (class281) class126.field2203.method1480((byte) 50, (long) arg1);
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class204.field3550.method1258(arg1, 0, (byte) 126);
            class281 var4 = new class281(var3);
            var4.method535(class108.field1777, (int[]) null);
            if (arg0 != -18666) {
                return null;
            } else {
                class126.field2203.method1483((byte) -109, (long) arg1, var4);
                return var4;
            }
        }
    }

    @OriginalMember(owner = "client!nf", name = "e", descriptor = "(I)I")
    public final int method1117(int arg0) {
        ++field2755;
        return arg0 != 25 ? -23 : (int) super.field2827;
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(IIZII)V")
    public static final void method1118(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
        ++field2746;
        if (arg2) {
            method1118(-118, 32, true, 20, -39);
        }
        class157 var5 = class257.method1740(arg0, (byte) 117, 8);
        var5.method1112((byte) 91);
        var5.field2748 = arg1;
        var5.field2751 = arg4;
        var5.field2737 = arg3;
    }

    @OriginalMember(owner = "client!nf", name = "f", descriptor = "(I)J")
    public final long method1119(int arg0) {
        if (arg0 > -94) {
            return 28L;
        } else {
            ++field2753;
            return Long.MAX_VALUE & super.field865;
        }
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(ZLp;I)V")
    public static final void method1120(boolean arg0, class280 arg1, int arg2) {
        if (arg0) {
            ++field2747;
            class157 var3 = class257.method1740(arg2, (byte) 122, 2);
            var3.method1112((byte) 125);
            var3.field2734 = arg1;
        }
    }

    @OriginalMember(owner = "client!nf", name = "g", descriptor = "(I)V")
    public final void method1121(int arg0) {
        ++field2741;
        if (arg0 == 24223) {
            super.field865 = 500L + class77.method569((byte) 114) | super.field865 & Long.MIN_VALUE;
            class264.field4652.method273(0, this);
        }
    }

    @OriginalMember(owner = "client!nf", name = "h", descriptor = "(I)V")
    public static void method1122(int arg0) {
        field2740 = null;
        field2733 = null;
        if (arg0 < 98) {
            method1120(true, (class280) null, -112);
        }
    }

    @OriginalMember(owner = "client!nf", name = "<init>", descriptor = "(II)V")
    public class157(int arg0, int arg1) {
        super.field2827 = (long) arg0 << 32 | (long) arg1;
    }
}
