import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pfa")
public class class299 {

    @OriginalMember(owner = "client!pfa", name = "b", descriptor = "Let;")
    public static class596 field3924 = new class596(1);

    @OriginalMember(owner = "client!pfa", name = "g", descriptor = "Lkg;")
    public static class275 field3929 = new class275(116, 2);

    @OriginalMember(owner = "client!pfa", name = "i", descriptor = "[I")
    public static int[] field3931 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!pfa", name = "h", descriptor = "Lhg;")
    public static class693 field3930 = new class693(63, -1);

    @OriginalMember(owner = "client!pfa", name = "j", descriptor = "Lcha;")
    public static class220 field3932 = new class220(10, 2);

    @OriginalMember(owner = "client!pfa", name = "k", descriptor = "Lan;")
    public static class23 field3933 = new class23();

    @OriginalMember(owner = "client!pfa", name = "a", descriptor = "I")
    public static int field3923;

    @OriginalMember(owner = "client!pfa", name = "c", descriptor = "I")
    public static int field3925;

    @OriginalMember(owner = "client!pfa", name = "d", descriptor = "I")
    public static int field3926;

    @OriginalMember(owner = "client!pfa", name = "e", descriptor = "I")
    public static int field3927;

    @OriginalMember(owner = "client!pfa", name = "f", descriptor = "I")
    public static int field3928;

    @OriginalMember(owner = "client!pfa", name = "a", descriptor = "(IB)I")
    public static final int method1786(int arg0, byte arg1) {
        field3925++;
        if (arg1 != 122) {
            return 88;
        }
        int var2 = arg0 & 0x3F;
        int var3 = arg0 >> 6 & 0x3;
        if (var2 == 18) {
            if (var3 == 0) {
                return 1;
            }
            if (var3 == 1) {
                return 2;
            }
            if (var3 == 2) {
                return 4;
            }
            if (var3 == 3) {
                return 8;
            }
        } else if (var2 == 19 || var2 == 21) {
            if (var3 == 0) {
                return 16;
            }
            if (var3 == 1) {
                return 32;
            }
            if (var3 == 2) {
                return 64;
            }
            if (var3 == 3) {
                return 128;
            }
        }
        return 0;
    }

    @OriginalMember(owner = "client!pfa", name = "a", descriptor = "(ZLqg;)[Lpv;")
    public static final class72[] method1787(boolean arg0, class465 arg1) {
        field3923++;
        if (!arg1.method2656(-16)) {
            return new class72[0];
        }
        class181 var2 = arg1.method2642(5);
        if (!arg0) {
            return null;
        }
        while (var2.field2538 == 0) {
            class149.method1052(10L, true);
        }
        if (var2.field2538 == 2) {
            return new class72[0];
        }
        int[] var3 = (int[]) var2.field2540;
        class72[] var4 = new class72[var3.length >> 2];
        for (int var5 = 0; var5 < var4.length; var5++) {
            class72 var6 = new class72();
            var4[var5] = var6;
            var6.field1004 = var3[var5 << 2];
            var6.field1009 = var3[(var5 << 2) + 1];
            var6.field1001 = var3[(var5 << 2) + 2];
            var6.field1007 = var3[(var5 << 2) + 3];
        }
        return var4;
    }

    @OriginalMember(owner = "client!pfa", name = "a", descriptor = "(I)V")
    public static void method1788(int arg0) {
        field3933 = null;
        if (arg0 != 1465) {
            method1786(57, (byte) -48);
        }
        field3931 = null;
        field3924 = null;
        field3929 = null;
        field3932 = null;
        field3930 = null;
    }

    @OriginalMember(owner = "client!pfa", name = "a", descriptor = "(B)V")
    public static final void method1789(byte arg0) {
        if (class203.field2718 != null) {
            for (int var1 = 0; var1 < class203.field2718.length; var1++) {
                for (int var2 = 0; var2 < class203.field2718[var1].length; var2++) {
                    class203.field2718[var1][var2] = class605.field8417;
                }
            }
        }
        field3928++;
        int var3 = 38 / ((arg0 + 86) / 39);
    }

    @OriginalMember(owner = "client!pfa", name = "a", descriptor = "([SBI)[S")
    public static final short[] method1790(short[] arg0, byte arg1, int arg2) {
        field3926++;
        short[] var3 = new short[arg2];
        if (arg1 <= 92) {
            field3931 = null;
        }
        class135.method996(arg0, 0, var3, 0, arg2);
        return var3;
    }

    @OriginalMember(owner = "client!pfa", name = "a", descriptor = "(ZLha;)V")
    public static final void method1791(boolean arg0, class60 arg1) {
        if (class697.field9709) {
            class117.method912(arg1, -16777216);
        } else {
            class60.method521(-113, arg1);
        }
        if (arg0) {
            field3924 = null;
        }
        field3927++;
    }

    @OriginalMember(owner = "client!pfa", name = "a", descriptor = "(Lrba;[Llaa;)V")
    public static final void method1792(class435 arg0, class123[] arg1) {
        if (class683.field9517) {
            int var2 = arg0.method916(arg1, true);
            class681.field9504.method456(var2, arg1);
        }
        if (class395.field5009 == class195.field2669) {
            boolean var3 = false;
            boolean var4 = false;
            int var5;
            int var6;
            if (arg0 instanceof class556) {
                var5 = ((class556) arg0).field7734;
                var6 = ((class556) arg0).field7746;
            } else {
                var5 = arg0.field5801 >> class480.field6531;
                var6 = arg0.field5797 >> class480.field6531;
            }
            class681.field9504.method453(class707.field9826[0].method1676(arg0.field5801, true, arg0.field5797), class317.method1871(var5, var6), class170.method1183(var5, var6), class203.method1315(var5, var6));
        }
        class635 var7 = arg0.method755(class681.field9504, -94);
        if (var7 == null) {
            return;
        }
        if (arg0.field5795) {
            class314[] var8 = var7.field8760;
            for (int var9 = 0; var9 < var8.length; var9++) {
                class314 var10 = var8[var9];
                if (var10.field4099) {
                    class236.method1478(18, var10.field4098 - var10.field4103, var10.field4103 + var10.field4101, var10.field4102 - var10.field4103, var10.field4103 + var10.field4100);
                }
            }
        }
        if (var7.field8759) {
            var7.field8757 = arg0;
            if (class454.field6071) {
                class641 var11 = class386.field4924;
                synchronized (class386.field4924) {
                    class386.field4924.method3605(24723, var7);
                    return;
                }
            }
            class386.field4924.method3605(24723, var7);
            return;
        }
        class358.method2077((byte) -14, var7);
    }
}
