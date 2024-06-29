import jaggl.OpenGL;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!laa")
public class class122 extends class493 {

    @OriginalMember(owner = "client!laa", name = "F", descriptor = "[F")
    private float[] field1602 = new float[4];

    @OriginalMember(owner = "client!laa", name = "t", descriptor = "Z")
    private boolean field1591 = false;

    @OriginalMember(owner = "client!laa", name = "K", descriptor = "Lqv;")
    private class447 field1607;

    @OriginalMember(owner = "client!laa", name = "B", descriptor = "Lqv;")
    private class447 field1599;

    @OriginalMember(owner = "client!laa", name = "A", descriptor = "Lqv;")
    private class447 field1598;

    @OriginalMember(owner = "client!laa", name = "G", descriptor = "Lqv;")
    private class447 field1603;

    @OriginalMember(owner = "client!laa", name = "I", descriptor = "Ljs;")
    private class334 field1605;

    @OriginalMember(owner = "client!laa", name = "z", descriptor = "Z")
    private boolean field1597;

    @OriginalMember(owner = "client!laa", name = "w", descriptor = "Z")
    public static boolean field1594 = false;

    @OriginalMember(owner = "client!laa", name = "n", descriptor = "I")
    public static int field1585 = 0;

    @OriginalMember(owner = "client!laa", name = "H", descriptor = "I")
    public static int field1604 = 0;

    @OriginalMember(owner = "client!laa", name = "r", descriptor = "Ljava/util/Random;")
    public static Random field1589 = new Random();

    @OriginalMember(owner = "client!laa", name = "o", descriptor = "I")
    public static int field1586;

    @OriginalMember(owner = "client!laa", name = "p", descriptor = "I")
    public static int field1587;

    @OriginalMember(owner = "client!laa", name = "q", descriptor = "I")
    public static int field1588;

    @OriginalMember(owner = "client!laa", name = "s", descriptor = "I")
    public static int field1590;

    @OriginalMember(owner = "client!laa", name = "v", descriptor = "I")
    public static int field1593;

    @OriginalMember(owner = "client!laa", name = "x", descriptor = "I")
    public static int field1595;

    @OriginalMember(owner = "client!laa", name = "y", descriptor = "I")
    public static int field1596;

    @OriginalMember(owner = "client!laa", name = "D", descriptor = "I")
    public static int field1601;

    @OriginalMember(owner = "client!laa", name = "J", descriptor = "I")
    public static int field1606;

    @OriginalMember(owner = "client!laa", name = "L", descriptor = "I")
    public static int field1608;

    @OriginalMember(owner = "client!laa", name = "u", descriptor = "Z")
    private boolean field1592;

    @OriginalMember(owner = "client!laa", name = "C", descriptor = "Z")
    private boolean field1600;

    @OriginalMember(owner = "client!laa", name = "a", descriptor = "(III)V")
    public final void method627(int arg0, int arg1, int arg2) {
        ++field1590;
        if (arg2 >= -75) {
            this.method633(69, true);
        }
    }

    @OriginalMember(owner = "client!laa", name = "a", descriptor = "(IZ)V")
    public final void method632(int arg0, boolean arg1) {
        if (arg0 <= 93) {
            this.field1605 = null;
        }
        ++field1595;
    }

    @OriginalMember(owner = "client!laa", name = "c", descriptor = "(I)V")
    public final void method628(int arg0) {
        super.field6720.method2114((byte) 120, 1);
        ++field1587;
        super.field6720.method2148((class649) null, 76);
        super.field6720.method2156(class199.field2365, class199.field2365, 22831);
        super.field6720.method2174(0, -108, class71.field769);
        super.field6720.method2174(2, -54, class421.field5897);
        super.field6720.method2116(arg0 ^ 92, class71.field769, 0);
        super.field6720.method2114((byte) 120, 0);
        if (this.field1591) {
            super.field6720.method2174(0, -87, class71.field769);
            super.field6720.method2116(-93, class71.field769, 0);
            this.field1591 = false;
        }
        if (this.field1592) {
            OpenGL.glBindProgramARB(34336, 0);
            OpenGL.glDisable(34820);
            OpenGL.glDisable(34336);
            this.field1592 = false;
        }
        if (arg0 != -2) {
            this.method627(-34, -50, 9);
        }
    }

    @OriginalMember(owner = "client!laa", name = "f", descriptor = "(I)V")
    public final void method756(int arg0) {
        ++field1596;
        if (arg0 != -25684) {
            field1604 = -102;
        }
        int var2 = super.field6720.method2154((byte) 67);
        class648 var3 = super.field6720.method2118((byte) -90);
        if (!this.field1600) {
            OpenGL.glBindProgramARB(34336, ~var2 != Integer.MIN_VALUE ? this.field1598.field6243 : this.field1607.field6243);
        } else {
            OpenGL.glBindProgramARB(34336, var2 == Integer.MAX_VALUE ? this.field1599.field6243 : this.field1603.field6243);
        }
        OpenGL.glEnable(34336);
        this.field1592 = true;
        var3.method3648((byte) 51, 0.0F, -1.0F, (float) var2, this.field1602, 0.0F);
        OpenGL.glProgramLocalParameter4fARB(34336, 1, this.field1602[0], this.field1602[1], this.field1602[2], this.field1602[3]);
        this.method654(arg0 + 25626);
    }

    @OriginalMember(owner = "client!laa", name = "a", descriptor = "(IILbl;)V")
    public final void method629(int arg0, int arg1, class649 arg2) {
        if (arg2 == null) {
            if (!this.field1591) {
                super.field6720.method2148(super.field6720.field5078, 41);
                super.field6720.method2153(1, (byte) -124);
                super.field6720.method2174(0, arg0 + -132, class547.field7717);
                super.field6720.method2116(-108, class547.field7717, 0);
                this.field1591 = true;
            }
        } else {
            if (this.field1591) {
                super.field6720.method2174(0, -57, class71.field769);
                super.field6720.method2116(-67, class71.field769, 0);
                this.field1591 = false;
            }
            super.field6720.method2148(arg2, -124);
            super.field6720.method2153(arg1, (byte) -128);
        }
        if (arg0 == 6) {
            ++field1586;
        }
    }

    @OriginalMember(owner = "client!laa", name = "<init>", descriptor = "(Lhl;Lni;)V")
    public class122(class529 arg0, class522 arg1) {
        super(arg0);
        if (arg1 != null && arg0.field7192) {
            this.field1607 = class715.method3999(arg1.method2879("gl", "uw_ground_unlit", -32734), arg0, 34336, 25246);
            this.field1599 = class715.method3999(arg1.method2879("gl", "uw_ground_lit", -32734), arg0, 34336, 25246);
            this.field1598 = class715.method3999(arg1.method2879("gl", "uw_model_unlit", -32734), arg0, 34336, 25246);
            this.field1603 = class715.method3999(arg1.method2879("gl", "uw_model_lit", -32734), arg0, 34336, 25246);
            if (this.field1603 != null & this.field1598 != null & this.field1607 != null & this.field1599 != null) {
                this.field1605 = super.field6720.method2150(2, 1, (byte) 31, new int[] { 0, -1 }, false);
                this.field1605.method1694(false, false, -37);
                this.field1597 = true;
            } else {
                this.field1597 = false;
            }
        } else {
            this.field1597 = false;
        }
    }

    @OriginalMember(owner = "client!laa", name = "b", descriptor = "(I)V")
    public final void method654(int arg0) {
        if (arg0 > -45) {
            field1589 = null;
        }
        ++field1588;
        if (this.field1592) {
            int var2 = super.field6720.method356();
            int var3 = super.field6720.method400();
            float var4 = (float) var2 + -((float) (-var3 + var2) * 0.125F);
            float var5 = (float) var2 - (float) (-var3 + var2) * 0.25F;
            OpenGL.glProgramLocalParameter4fARB(34336, 0, var5, var4, 1.0F / (float) super.field6720.method2112(126), (float) super.field6720.method2155((byte) 98) / 255.0F);
            super.field6720.method2114((byte) 120, 1);
            super.field6720.method2134(2, super.field6720.method2143((byte) 89));
            super.field6720.method2114((byte) 120, 0);
        }
    }

    @OriginalMember(owner = "client!laa", name = "c", descriptor = "(B)V")
    public static void method788(byte arg0) {
        field1589 = null;
        if (arg0 != 122) {
            method788((byte) -116);
        }
    }

    @OriginalMember(owner = "client!laa", name = "b", descriptor = "(B)Z")
    public final boolean method634(byte arg0) {
        ++field1601;
        if (arg0 != 27) {
            this.method633(-106, true);
        }
        return this.field1597;
    }

    @OriginalMember(owner = "client!laa", name = "b", descriptor = "(IZ)V")
    public final void method633(int arg0, boolean arg1) {
        if (arg0 == 69) {
            ++field1608;
            this.field1600 = arg1;
            super.field6720.method2114((byte) 120, 1);
            super.field6720.method2148(this.field1605, -114);
            super.field6720.method2156(class365.field4838, class94.field1233, 22831);
            super.field6720.method2174(0, -81, class421.field5897);
            super.field6720.method1334(2, true, (byte) 27, class71.field769, false);
            super.field6720.method2116(-125, class547.field7717, 0);
            super.field6720.method2114((byte) 120, 0);
            this.method756(-25684);
        }
    }
}
