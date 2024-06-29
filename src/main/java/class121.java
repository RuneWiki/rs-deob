import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cda")
public abstract class class121 extends class210 {

    @OriginalMember(owner = "client!cda", name = "E", descriptor = "S")
    public short field1627;

    @OriginalMember(owner = "client!cda", name = "y", descriptor = "S")
    public short field1621;

    @OriginalMember(owner = "client!cda", name = "B", descriptor = "Leg;")
    public static class336 field1624 = new class336(128);

    @OriginalMember(owner = "client!cda", name = "H", descriptor = "Lpf;")
    public static class759 field1630 = new class759();

    @OriginalMember(owner = "client!cda", name = "x", descriptor = "I")
    public static int field1620;

    @OriginalMember(owner = "client!cda", name = "z", descriptor = "I")
    public static int field1622;

    @OriginalMember(owner = "client!cda", name = "A", descriptor = "I")
    public static int field1623;

    @OriginalMember(owner = "client!cda", name = "C", descriptor = "I")
    public static int field1625;

    @OriginalMember(owner = "client!cda", name = "D", descriptor = "I")
    public static int field1626;

    @OriginalMember(owner = "client!cda", name = "F", descriptor = "I")
    public static int field1628;

    @OriginalMember(owner = "client!cda", name = "G", descriptor = "Lwm;")
    public static class30 field1629;

    @OriginalMember(owner = "client!cda", name = "b", descriptor = "(Lha;I)Z")
    public final boolean method717(class570 arg0, int arg1) {
        ++field1626;
        int var3 = -120 % ((arg1 - 21) / 53);
        return class578.method3100(super.field2889, super.field2900 >> class88.field1221, this.method747(15258), super.field2896 >> class88.field1221, true);
    }

    @OriginalMember(owner = "client!cda", name = "c", descriptor = "(I)Z")
    public final boolean method718(int arg0) {
        ++field1622;
        if (arg0 > -95) {
            this.method174(true, -17, (byte) -67, (class210) null, (class570) null, 19, 105);
        }
        return class145.field1873[(super.field2896 >> class88.field1221) + -class454.field5914 + class76.field1069][(super.field2900 >> class88.field1221) + -class309.field3875 + class76.field1069];
    }

    @OriginalMember(owner = "client!cda", name = "a", descriptor = "(ZIBLlq;Lha;II)V")
    public final void method174(boolean arg0, int arg1, byte arg2, class210 arg3, class570 arg4, int arg5, int arg6) {
        ++field1625;
        if (arg2 != -126) {
            this.field1621 = 50;
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!cda", name = "a", descriptor = "([Lgu;I)I")
    public final int method719(class757[] arg0, int arg1) {
        if (arg1 < 62) {
            this.method717((class570) null, 127);
        }
        ++field1628;
        return this.method1406(super.field2896 >> class88.field1221, arg0, super.field2900 >> class88.field1221, 120);
    }

    @OriginalMember(owner = "client!cda", name = "f", descriptor = "(I)V")
    public static void method720(int arg0) {
        field1624 = null;
        field1629 = null;
        if (arg0 != 128) {
            method720(-122);
        }
        field1630 = null;
    }

    @OriginalMember(owner = "client!cda", name = "d", descriptor = "(I)Z")
    public final boolean method171(int arg0) {
        ++field1623;
        if (arg0 > -80) {
            field1630 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!cda", name = "b", descriptor = "(I)V")
    public final void method185(int arg0) {
        if (arg0 == 0) {
            ++field1620;
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!cda", name = "<init>", descriptor = "(IIIIIII)V")
    public class121(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field1627 = (short) arg6;
        super.field2895 = (byte) arg3;
        super.field2896 = arg0;
        this.field1621 = (short) arg5;
        super.field2892 = arg1;
        super.field2889 = (byte) arg4;
        super.field2900 = arg2;
    }
}
