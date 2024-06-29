import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ps")
public abstract class class82 extends class697 {

    @OriginalMember(owner = "client!ps", name = "G", descriptor = "Lph;")
    public static class598 field1599 = new class598(2, 2);

    @OriginalMember(owner = "client!ps", name = "y", descriptor = "I")
    public static int field1591;

    @OriginalMember(owner = "client!ps", name = "z", descriptor = "I")
    public static int field1592;

    @OriginalMember(owner = "client!ps", name = "A", descriptor = "I")
    public static int field1593;

    @OriginalMember(owner = "client!ps", name = "B", descriptor = "I")
    public static int field1594;

    @OriginalMember(owner = "client!ps", name = "C", descriptor = "I")
    public static int field1595;

    @OriginalMember(owner = "client!ps", name = "D", descriptor = "I")
    public static int field1596;

    @OriginalMember(owner = "client!ps", name = "E", descriptor = "I")
    public static int field1597;

    @OriginalMember(owner = "client!ps", name = "F", descriptor = "I")
    public static int field1598;

    @OriginalMember(owner = "client!ps", name = "H", descriptor = "Lom;")
    public static class344 field1600;

    @OriginalMember(owner = "client!ps", name = "e", descriptor = "(I)V")
    public final void method448(int arg0) {
        ++field1592;
        if (arg0 > -12) {
            method839(-91);
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ps", name = "<init>", descriptor = "(IIIII)V")
    public class82(int arg0, int arg1, int arg2, int arg3, int arg4) {
        super.field9804 = (byte) arg4;
        super.field9815 = arg2;
        super.field9806 = arg0;
        super.field9814 = (byte) arg3;
        super.field9809 = arg1;
    }

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(IIIIIII)V")
    public static final void method834(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field1598;
        int var7 = 20 / ((28 - arg2) / 46);
        class539[] var8 = class565.field8254;
        for (int var9 = 0; var9 < var8.length; ++var9) {
            class539 var10 = var8[var9];
            if (var10 != null && ~var10.field7539 == -3) {
                class152.method1190((byte) -123, var10.field7537, var10.field7535, arg3, arg4 >> 1, var10.field7534, arg0 >> 1, arg5, var10.field7533 * 2);
                if (class559.field7906[0] > -1 && ~(class336.field5031 % 20) > -11) {
                    class513.field7239[var10.field7528].method3914(class559.field7906[0] + arg6 + -12, class559.field7906[1] + arg1 - 28);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "([Lff;B)I")
    public final int method835(class9[] arg0, byte arg1) {
        ++field1593;
        if (arg1 <= 102) {
            this.method838((byte) -57);
        }
        return this.method3896(super.field9815 >> class30.field940, arg0, 48, super.field9806 >> class30.field940);
    }

    @OriginalMember(owner = "client!ps", name = "b", descriptor = "(Z)Z")
    public final boolean method836(boolean arg0) {
        if (!arg0) {
            this.method838((byte) 58);
        }
        ++field1594;
        return class224.field3361[(super.field9806 >> class30.field940) + -class547.field7768 + class643.field9239][(super.field9815 >> class30.field940) + -class318.field4685 + class643.field9239];
    }

    @OriginalMember(owner = "client!ps", name = "g", descriptor = "(I)Z")
    public final boolean method447(int arg0) {
        if (arg0 > -15) {
            field1599 = null;
        }
        ++field1595;
        return false;
    }

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(ILlk;)Llk;")
    public static final class545 method837(int arg0, class545 arg1) {
        ++field1596;
        if (arg1.field7733 != -1) {
            return class415.method2533((byte) 97, arg1.field7733);
        } else {
            if (arg0 > -84) {
                method837(-118, (class545) null);
            }
            int var2 = arg1.field7755 >>> 16;
            class182 var3 = new class182(class78.field1572);
            for (class601 var4 = (class601) var3.method1336(-1); var4 != null; var4 = (class601) var3.method1337(7698)) {
                if (~var4.field8614 == ~var2) {
                    return class415.method2533((byte) -54, (int) var4.field6132);
                }
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(IILgfa;IILr;Z)V")
    public final void method455(int arg0, int arg1, class697 arg2, int arg3, int arg4, class167 arg5, boolean arg6) {
        if (arg1 != -1008) {
            this.method455(-109, -69, (class697) null, -102, 64, (class167) null, false);
        }
        ++field1591;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ps", name = "f", descriptor = "(B)Z")
    public final boolean method838(byte arg0) {
        ++field1597;
        if (arg0 < 4) {
            field1599 = null;
        }
        class636 var2 = class432.method2628(super.field9814, super.field9806 >> class30.field940, super.field9815 >> class30.field940);
        return var2 != null && var2.field9172.field2224 ? class523.method3071(var2.field9172.method530(-106) + this.method530(-42), false, super.field9806 >> class30.field940, super.field9814, super.field9815 >> class30.field940) : class649.method3708(super.field9806 >> class30.field940, -126, super.field9814, super.field9815 >> class30.field940);
    }

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(I)V")
    public static void method839(int arg0) {
        field1600 = null;
        field1599 = null;
        int var1 = 24 / ((-3 - arg0) / 39);
    }
}
