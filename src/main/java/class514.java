import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gia")
public class class514 extends class429 {

    @OriginalMember(owner = "client!gia", name = "A", descriptor = "F")
    private float field7097 = 0.0F;

    @OriginalMember(owner = "client!gia", name = "u", descriptor = "Lnc;")
    private class227 field7091;

    @OriginalMember(owner = "client!gia", name = "s", descriptor = "I")
    public static int field7089 = 0;

    @OriginalMember(owner = "client!gia", name = "n", descriptor = "I")
    public static int field7084;

    @OriginalMember(owner = "client!gia", name = "o", descriptor = "I")
    public static int field7085;

    @OriginalMember(owner = "client!gia", name = "p", descriptor = "I")
    public static int field7086;

    @OriginalMember(owner = "client!gia", name = "q", descriptor = "I")
    public static int field7087;

    @OriginalMember(owner = "client!gia", name = "r", descriptor = "I")
    public static int field7088;

    @OriginalMember(owner = "client!gia", name = "t", descriptor = "I")
    public static int field7090;

    @OriginalMember(owner = "client!gia", name = "v", descriptor = "I")
    public static int field7092;

    @OriginalMember(owner = "client!gia", name = "w", descriptor = "I")
    public static int field7093;

    @OriginalMember(owner = "client!gia", name = "x", descriptor = "I")
    public static int field7094;

    @OriginalMember(owner = "client!gia", name = "y", descriptor = "I")
    public static int field7095;

    @OriginalMember(owner = "client!gia", name = "B", descriptor = "I")
    public static int field7098;

    @OriginalMember(owner = "client!gia", name = "m", descriptor = "Leja;")
    public static class432 field7083;

    @OriginalMember(owner = "client!gia", name = "z", descriptor = "[[[Lq;")
    public static class172[][][] field7096;

    @OriginalMember(owner = "client!gia", name = "a", descriptor = "(III)V", line = 3)
    public final void method46(int arg0, int arg1, int arg2) {
        ++field7086;
        super.field5939.method959(1, arg0 ^ -70);
        if (arg0 == 37) {
            if (~(arg2 & 128) != -1) {
                super.field5939.method988(arg0 + -36, (class408) null);
            } else if (~(arg1 & 1) != -2) {
                if (this.field7091.field3302) {
                    super.field5939.method988(1, this.field7091.field3301);
                } else {
                    super.field5939.method988(1, this.field7091.field3298[0]);
                }
            } else if (this.field7091.field3302) {
                this.field7097 = (float) (super.field5939.field1928 % 4000) / 4000.0F;
                super.field5939.method988(1, this.field7091.field3301);
            } else {
                int var4 = super.field5939.field1928 % 4000 * 16 / 4000;
                super.field5939.method988(1, this.field7091.field3298[var4]);
            }
            super.field5939.method959(0, 119);
        }
    }

    @OriginalMember(owner = "client!gia", name = "h", descriptor = "(I)V", line = 47)
    public static void method3022(int arg0) {
        field7083 = null;
        if (arg0 != 0) {
            field7089 = -82;
        }
        field7096 = null;
    }

    @OriginalMember(owner = "client!gia", name = "a", descriptor = "(Len;ZI)V", line = 58)
    public final void method45(class408 arg0, boolean arg1, int arg2) {
        ++field7095;
        super.field5939.method988(1, arg0);
        if (arg1) {
            this.method43(-35, false);
        }
    }

    @OriginalMember(owner = "client!gia", name = "a", descriptor = "(ILjava/lang/String;)Z", line = 70)
    public static final boolean method3023(int arg0, String arg1) {
        ++field7098;
        int var2 = 47 / ((-33 - arg0) / 55);
        return class488.field6709.containsKey(arg1);
    }

    @OriginalMember(owner = "client!gia", name = "c", descriptor = "(I)V", line = 83)
    public final void method1097(int arg0) {
        if (super.field5939.method964(true) == 0) {
            class742 var2 = super.field5939.method1003(-112);
            super.field5939.method959(1, -64);
            class742 var3 = super.field5939.method943(-23324);
            var3.method1552(var2);
            var3.method4101(0.125F, 1.0F, 0.125F, 116);
            var3.method4084(0.0F, this.field7097, -40, 0.0F);
            super.field5939.method983(-82, class604.field8581);
            super.field5939.method959(0, 114);
        }
        if (arg0 > -41) {
            this.method47((byte) -19);
        }
        ++field7090;
    }

    @OriginalMember(owner = "client!gia", name = "b", descriptor = "(B)V", line = 111)
    public final void method47(byte arg0) {
        ++field7094;
        super.field5939.method959(1, 120);
        super.field5939.method974(class317.field4523, class317.field4523, (byte) -59);
        super.field5939.method1014(0, 80, class264.field3730);
        super.field5939.method973(0, class264.field3730, (byte) 125);
        super.field5939.method102(1, (byte) 111);
        super.field5939.method988(1, (class408) null);
        int var2 = 68 / ((arg0 - -56) / 48);
        super.field5939.method959(0, -46);
        super.field5939.method973(0, class264.field3730, (byte) 66);
    }

    @OriginalMember(owner = "client!gia", name = "a", descriptor = "(ZZ)V", line = 131)
    public final void method44(boolean arg0, boolean arg1) {
        ++field7093;
        super.field5939.method959(1, 123);
        super.field5939.method974(class228.field3319, class552.field7657, (byte) -59);
        super.field5939.method139(0, arg1, true, class264.field3730, 0);
        super.field5939.method973(0, class317.field4535, (byte) 66);
        super.field5939.method102(0, (byte) 96);
        super.field5939.method959(0, -115);
        super.field5939.method1001(-16777216, (byte) 114);
        super.field5939.method973(0, class504.field6917, (byte) 126);
        this.method1097(-107);
    }

    @OriginalMember(owner = "client!gia", name = "<init>", descriptor = "(Lmj;Lnc;)V", line = 148)
    public class514(class114 arg0, class227 arg1) {
        super(arg0);
        this.field7091 = arg1;
    }

    @OriginalMember(owner = "client!gia", name = "a", descriptor = "(II)I", line = 159)
    public static final int method3024(int arg0, int arg1) {
        ++field7092;
        byte var2;
        if (~arg1 >= -12001) {
            if (arg1 > 5000) {
                class775.method4271(255);
                var2 = 3;
            } else if (~arg1 < -2001) {
                class698.method3917(94);
                var2 = 2;
            } else {
                class713.method3967(true, 2);
                var2 = 1;
            }
        } else {
            var2 = 4;
            class565.method3294(-5550);
        }
        if (class420.field5820.field9482.method2338(17539) != 2) {
            class420.field5820.method3781(class420.field5820.field9466, 106, 2);
            class636.method3625(false, 2, 113);
        }
        class95.method797(92);
        return arg0 >= -127 ? -80 : var2;
    }

    @OriginalMember(owner = "client!gia", name = "a", descriptor = "(IZ)V", line = 216)
    public final void method43(int arg0, boolean arg1) {
        super.field5939.method974(class317.field4523, class552.field7657, (byte) -59);
        if (arg0 == 0) {
            ++field7084;
        }
    }

    @OriginalMember(owner = "client!gia", name = "a", descriptor = "(B)Z", line = 228)
    public final boolean method48(byte arg0) {
        ++field7087;
        if (arg0 != -128) {
            field7083 = null;
        }
        return this.field7091.method1541(true);
    }
}
