import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kha")
public class class584 extends class493 {

    @OriginalMember(owner = "client!kha", name = "w", descriptor = "F")
    private float field8178 = 0.0F;

    @OriginalMember(owner = "client!kha", name = "v", descriptor = "Lmt;")
    private class399 field8177;

    @OriginalMember(owner = "client!kha", name = "t", descriptor = "Z")
    public static boolean field8175 = false;

    @OriginalMember(owner = "client!kha", name = "n", descriptor = "I")
    public static int field8169;

    @OriginalMember(owner = "client!kha", name = "o", descriptor = "I")
    public static int field8170;

    @OriginalMember(owner = "client!kha", name = "p", descriptor = "I")
    public static int field8171;

    @OriginalMember(owner = "client!kha", name = "q", descriptor = "I")
    public static int field8172;

    @OriginalMember(owner = "client!kha", name = "r", descriptor = "I")
    public static int field8173;

    @OriginalMember(owner = "client!kha", name = "s", descriptor = "I")
    public static int field8174;

    @OriginalMember(owner = "client!kha", name = "u", descriptor = "I")
    public static int field8176;

    @OriginalMember(owner = "client!kha", name = "x", descriptor = "I")
    public static int field8179;

    @OriginalMember(owner = "client!kha", name = "y", descriptor = "I")
    public static int field8180;

    @OriginalMember(owner = "client!kha", name = "B", descriptor = "[I")
    public static int[] field8182;

    @OriginalMember(owner = "client!kha", name = "z", descriptor = "[Lufa;")
    public static class680[] field8181;

    @OriginalMember(owner = "client!kha", name = "c", descriptor = "(B)V", line = 4)
    public static void method3259(byte arg0) {
        if (arg0 == 19) {
            field8181 = null;
            field8182 = null;
        }
    }

    @OriginalMember(owner = "client!kha", name = "a", descriptor = "(IZ)V", line = 16)
    public final void method632(int arg0, boolean arg1) {
        super.field6720.method2156(class365.field4838, class199.field2365, 22831);
        if (arg0 < 93) {
            field8182 = null;
        }
        ++field8169;
    }

    @OriginalMember(owner = "client!kha", name = "g", descriptor = "(I)V", line = 27)
    public final void method657(int arg0) {
        ++field8179;
        if (arg0 != 8) {
            this.field8177 = null;
        }
        if (~super.field6720.method2125(arg0 + 114) == -1) {
            class648 var2 = super.field6720.method2180(1);
            super.field6720.method2114((byte) 120, 1);
            class648 var3 = super.field6720.method2119((byte) -105);
            var3.method25(var2);
            var3.method3666(1.0F, 0.125F, 0.125F, arg0 + -115);
            var3.method3669(-122, 0.0F, this.field8178, 0.0F);
            super.field6720.method2149(class555.field7829, (byte) 103);
            super.field6720.method2114((byte) 120, 0);
        }
    }

    @OriginalMember(owner = "client!kha", name = "b", descriptor = "(IZ)V", line = 54)
    public final void method633(int arg0, boolean arg1) {
        super.field6720.method2114((byte) 120, 1);
        ++field8173;
        if (arg0 != 69) {
            this.field8177 = null;
        }
        super.field6720.method2156(class365.field4838, class669.field9307, 22831);
        super.field6720.method1334(0, true, (byte) 27, class71.field769, false);
        super.field6720.method2116(-78, class547.field7717, 0);
        super.field6720.method1311((byte) 32, 0);
        super.field6720.method2114((byte) 120, 0);
        super.field6720.method2134(2, -16777216);
        super.field6720.method2116(arg0 + -174, class421.field5897, 0);
        this.method657(8);
    }

    @OriginalMember(owner = "client!kha", name = "<init>", descriptor = "(Luv;Lmt;)V", line = 75)
    public class584(class367 arg0, class399 arg1) {
        super(arg0);
        this.field8177 = arg1;
    }

    @OriginalMember(owner = "client!kha", name = "a", descriptor = "(ILji;Z)V", line = 83)
    public static final void method3260(int arg0, class611 arg1, boolean arg2) {
        if (!arg2) {
            method3259((byte) 10);
        }
        ++field8174;
        if (class399.field5653 != null) {
            try {
                class399.field5653.method1966(0L, 0);
                class399.field5653.method1972(24, arg0, -1, arg1.field8529);
            } catch (Exception var3) {
            }
        }
    }

    @OriginalMember(owner = "client!kha", name = "a", descriptor = "(III)V", line = 103)
    public final void method627(int arg0, int arg1, int arg2) {
        if (arg2 > -75) {
            field8181 = null;
        }
        super.field6720.method2114((byte) 120, 1);
        ++field8172;
        if (~(128 & arg0) == -1) {
            if (~(arg1 & 1) != -2) {
                if (this.field8177.field5652) {
                    super.field6720.method2148(this.field8177.field5648, -1);
                } else {
                    super.field6720.method2148(this.field8177.field5654[0], 113);
                }
            } else if (!this.field8177.field5652) {
                int var4 = super.field6720.field5048 % 4000 * 16 / 4000;
                super.field6720.method2148(this.field8177.field5654[var4], -122);
            } else {
                this.field8178 = (float) (super.field6720.field5048 % 4000) / 4000.0F;
                super.field6720.method2148(this.field8177.field5648, -114);
            }
        } else {
            super.field6720.method2148((class649) null, 102);
        }
        super.field6720.method2114((byte) 120, 0);
    }

    @OriginalMember(owner = "client!kha", name = "a", descriptor = "(IIZ)Z", line = 150)
    public static final boolean method3261(int arg0, int arg1, boolean arg2) {
        if (arg2) {
            method3261(-71, 94, true);
        }
        ++field8180;
        return (class147.method908(arg1, arg0, -35) | class55.method317(arg0, arg1, (byte) 85) | class399.method2313(arg0, arg1, arg2)) & class396.method2304(arg0, arg1, (byte) -96);
    }

    @OriginalMember(owner = "client!kha", name = "b", descriptor = "(B)Z", line = 163)
    public final boolean method634(byte arg0) {
        ++field8171;
        return arg0 != 27 ? false : this.field8177.method2309(arg0 ^ -22391);
    }

    @OriginalMember(owner = "client!kha", name = "a", descriptor = "(IILbl;)V", line = 174)
    public final void method629(int arg0, int arg1, class649 arg2) {
        super.field6720.method2148(arg2, -119);
        if (arg0 != 6) {
            this.field8177 = null;
        }
        ++field8170;
    }

    @OriginalMember(owner = "client!kha", name = "c", descriptor = "(I)V", line = 194)
    public final void method628(int arg0) {
        super.field6720.method2114((byte) 120, 1);
        ++field8176;
        super.field6720.method2156(class199.field2365, class199.field2365, 22831);
        if (arg0 == -2) {
            super.field6720.method2174(0, -98, class71.field769);
            super.field6720.method2116(-110, class71.field769, 0);
            super.field6720.method1311((byte) 119, 1);
            super.field6720.method2148((class649) null, 63);
            super.field6720.method2114((byte) 120, 0);
            super.field6720.method2116(-68, class71.field769, 0);
        }
    }
}
