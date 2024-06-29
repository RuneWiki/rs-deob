import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dh")
public class class271 extends class324 {

    @OriginalMember(owner = "client!dh", name = "o", descriptor = "I")
    public int field3798;

    @OriginalMember(owner = "client!dh", name = "u", descriptor = "I")
    public int field3804;

    @OriginalMember(owner = "client!dh", name = "m", descriptor = "Lig;")
    public static class206 field3796 = new class206(111, 0);

    @OriginalMember(owner = "client!dh", name = "t", descriptor = "Lea;")
    public static class474 field3803 = new class474("Self", "Mich", "Moi", "Eu");

    @OriginalMember(owner = "client!dh", name = "j", descriptor = "I")
    public static int field3793;

    @OriginalMember(owner = "client!dh", name = "k", descriptor = "I")
    public static int field3794;

    @OriginalMember(owner = "client!dh", name = "l", descriptor = "I")
    public static int field3795;

    @OriginalMember(owner = "client!dh", name = "n", descriptor = "I")
    public static int field3797;

    @OriginalMember(owner = "client!dh", name = "p", descriptor = "I")
    public static int field3799;

    @OriginalMember(owner = "client!dh", name = "q", descriptor = "I")
    public static int field3800;

    @OriginalMember(owner = "client!dh", name = "r", descriptor = "I")
    public static int field3801;

    @OriginalMember(owner = "client!dh", name = "s", descriptor = "I")
    public static int field3802;

    @OriginalMember(owner = "client!dh", name = "v", descriptor = "Lts;")
    public static class464 field3805;

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(B)I", line = 3)
    public final int method1771(byte arg0) {
        if (arg0 < 32) {
            this.method1772(74);
        }
        field3797++;
        return class434.method2711(this.field3798, 261108);
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(I)Z", line = 15)
    public final boolean method1772(int arg0) {
        field3800++;
        if (arg0 != -680557226) {
            this.method1776(-115);
        }
        return (this.field3798 >> 22 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!dh", name = "e", descriptor = "(I)I", line = 26)
    public final int method1773(int arg0) {
        if (arg0 != 27812) {
            method1777(40, -93, 72);
        }
        field3795++;
        return (this.field3798 & 0x1D18F9) >> 18;
    }

    @OriginalMember(owner = "client!dh", name = "f", descriptor = "(I)V", line = 38)
    public static void method1774(int arg0) {
        field3796 = null;
        if (arg0 <= 13) {
            method1775(-71, -90, -76, null);
        }
        field3805 = null;
        field3803 = null;
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(IIILqn;)J", line = 54)
    public static final long method1775(int arg0, int arg1, int arg2, class57 arg3) {
        field3802++;
        long var4 = 4194304L;
        long var6 = 2147483648L;
        long var8 = Long.MIN_VALUE;
        class385 var10 = class575.field8301.method1499(-7532, arg3.method89(127));
        long var11 = (long) (arg1 | arg2 << 7 | arg3.method95(60) << 14 | arg3.method92(9812) << 20 | 0x40000000);
        if (var10.field5806 == 0) {
            var11 |= var8;
        }
        int var13 = -13 % ((87 - arg0) / 33);
        if (var10.field5800 == 1) {
            var11 |= var4;
        }
        if (var10.field5870) {
            var11 |= var6;
        }
        return var11 | (long) arg3.method89(-110) << 32;
    }

    @OriginalMember(owner = "client!dh", name = "g", descriptor = "(I)Z", line = 92)
    public final boolean method1776(int arg0) {
        if (arg0 >= -87) {
            field3796 = null;
        }
        field3799++;
        return (this.field3798 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(III)Z", line = 108)
    public static final boolean method1777(int arg0, int arg1, int arg2) {
        field3793++;
        if (arg2 < 108) {
            method1775(80, 113, 66, null);
        }
        return (arg0 & 0x21) != 0;
    }

    @OriginalMember(owner = "client!dh", name = "h", descriptor = "(I)Z", line = 123)
    public final boolean method1778(int arg0) {
        int var2 = -31 / ((-arg0 - 78) / 37);
        field3801++;
        return (this.field3798 >> 21 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!dh", name = "<init>", descriptor = "(II)V", line = 134)
    public class271(int arg0, int arg1) {
        this.field3798 = arg0;
        this.field3804 = arg1;
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(IB)Z", line = 143)
    public final boolean method1779(int arg0, byte arg1) {
        field3794++;
        if (arg1 != 15) {
            field3803 = null;
        }
        return (this.field3798 >> arg0 + 1 & 0x1) != 0;
    }
}
