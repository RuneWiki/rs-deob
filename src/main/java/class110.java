import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jh")
public class class110 extends class193 {

    @OriginalMember(owner = "client!jh", name = "f", descriptor = "[Ljava/lang/String;")
    public static String[] field1478 = new String[100];

    @OriginalMember(owner = "client!jh", name = "g", descriptor = "I")
    public static int field1479;

    @OriginalMember(owner = "client!jh", name = "h", descriptor = "I")
    public static int field1480;

    @OriginalMember(owner = "client!jh", name = "j", descriptor = "I")
    public static int field1482;

    @OriginalMember(owner = "client!jh", name = "k", descriptor = "I")
    public static int field1483;

    @OriginalMember(owner = "client!jh", name = "l", descriptor = "I")
    public static int field1484;

    @OriginalMember(owner = "client!jh", name = "m", descriptor = "I")
    public static int field1485;

    @OriginalMember(owner = "client!jh", name = "n", descriptor = "I")
    public static int field1486;

    @OriginalMember(owner = "client!jh", name = "o", descriptor = "I")
    public static int field1487;

    @OriginalMember(owner = "client!jh", name = "i", descriptor = "Lsu;")
    public static class141 field1481;

    @OriginalMember(owner = "client!jh", name = "p", descriptor = "[[Lhd;")
    public static class523[][] field1488;

    @OriginalMember(owner = "client!jh", name = "b", descriptor = "(ZZ)V")
    public final void method95(boolean arg0, boolean arg1) {
        ++field1487;
        if (!arg1) {
            field1481 = null;
        }
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(Z)Z")
    public final boolean method93(boolean arg0) {
        ++field1485;
        if (arg0) {
            this.method94(false, false);
        }
        return true;
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(ZZ)V")
    public final void method94(boolean arg0, boolean arg1) {
        ++field1482;
        super.field2498.method2281(!arg0, arg0);
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(IJLya;)V")
    public static final void method809(int arg0, long arg1, class38 arg2) {
        int var4 = -116 % ((arg0 - 43) / 61);
        class308.field3934 = 0;
        class505.field7282 = class347.field4460;
        ++field1479;
        class347.field4460 = 0;
        long var5 = class504.method3034((byte) -100);
        for (class67 var7 = (class67) class46.field563.method2097((byte) 86); var7 != null; var7 = (class67) class46.field563.method2091(-1)) {
            if (var7.method595(arg2, arg1)) {
                ++class308.field3934;
            }
        }
        if (class335.field4232 && ~(arg1 % 100L) == -1L) {
            System.out.println("Particle system count: " + class46.field563.method2094(1126) + ", running: " + class308.field3934 + ". Particles: " + class347.field4460 + ". Time taken: " + (class504.method3034((byte) -101) + -var5) + "ms");
        }
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(Lsq;II)V")
    public final void method97(class119 arg0, int arg1, int arg2) {
        if (arg2 == 36) {
            super.field2498.method2322(arg0, 14);
            ++field1483;
            super.field2498.method2305(7681, arg1);
        }
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(IIZ)V")
    public final void method99(int arg0, int arg1, boolean arg2) {
        if (!arg2) {
            ++field1480;
        }
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(B)V")
    public final void method92(byte arg0) {
        ++field1484;
        super.field2498.method2281(false, false);
        if (arg0 >= -56) {
            field1481 = null;
        }
    }

    @OriginalMember(owner = "client!jh", name = "<init>", descriptor = "(Lug;)V")
    public class110(class395 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!jh", name = "b", descriptor = "(B)V")
    public static void method810(byte arg0) {
        field1481 = null;
        if (arg0 < -96) {
            field1478 = null;
            field1488 = null;
        }
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(ILhd;)V")
    public static final void method811(int arg0, class523 arg1) {
        ++field1486;
        if (arg0 != 14230) {
            field1478 = null;
        }
        if (~class252.field3219 == ~arg1.field7650) {
            if (class23.field336.field2852 == null) {
                arg1.field7588 = 0;
                arg1.field7689 = 0;
            } else {
                arg1.field7620 = 150;
                arg1.field7586 = (int) (Math.sin((double) class163.field2065 / 40.0D) * 256.0D) & 2047;
                arg1.field7689 = class66.field858;
                arg1.field7580 = 5;
                arg1.field7588 = class11.method85(class23.field336.field2852, 0);
                arg1.field7627 = 0;
                arg1.field7703 = class23.field336.field4888;
                arg1.field7691 = class23.field336.field4907;
                arg1.field7698 = class23.field336.field4866;
            }
        }
    }
}
