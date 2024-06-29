import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tn")
public abstract class class570 extends class383 {

    @OriginalMember(owner = "client!tn", name = "B", descriptor = "S")
    public short field8104;

    @OriginalMember(owner = "client!tn", name = "w", descriptor = "I")
    public static int field8099;

    @OriginalMember(owner = "client!tn", name = "x", descriptor = "I")
    public static int field8100;

    @OriginalMember(owner = "client!tn", name = "y", descriptor = "I")
    public static int field8101;

    @OriginalMember(owner = "client!tn", name = "z", descriptor = "I")
    public static int field8102;

    @OriginalMember(owner = "client!tn", name = "A", descriptor = "I")
    public static int field8103;

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(BB)V", line = 8)
    public static final void method3224(byte arg0, byte arg1) {
        if (class125.field1420 == null) {
            class125.field1420 = new byte[4][class142.field1574][class140.field1550];
        }
        if (arg1 > -87) {
            method3224((byte) 30, (byte) -70);
        }
        ++field8100;
        for (int var2 = 0; ~var2 > -5; ++var2) {
            for (int var3 = 0; ~class142.field1574 < ~var3; ++var3) {
                for (int var4 = 0; ~var4 > ~class140.field1550; ++var4) {
                    class125.field1420[var2][var3][var4] = arg0;
                }
            }
        }
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(I[Leq;)I", line = 45)
    public final int method479(int arg0, class670[] arg1) {
        if (arg0 != -26355) {
            return 85;
        } else {
            ++field8101;
            return this.method2199(super.field5179 >> class559.field7984, super.field5176 >> class559.field7984, arg1, 112);
        }
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(I[BZ)V", line = 56)
    public static final void method3225(int arg0, byte[] arg1, boolean arg2) {
        ++field8099;
        if (class386.field5205 == null) {
            class386.field5205 = new class115(20000);
        }
        int var3 = -94 / ((22 - arg0) / 48);
        class386.field5205.method629(53, arg1, arg1.length, 0);
        if (arg2) {
            class303.method1754(class386.field5205.field1269, -21524);
            class114.field1202 = new class130[class217.field2619];
            int var4 = 0;
            for (int var5 = class267.field3330; ~class25.field224 <= ~var5; ++var5) {
                class130 var6 = class63.method345(3, var5);
                if (var6 != null) {
                    class114.field1202[var4++] = var6;
                }
            }
            class607.field8507 = false;
            class458.field6503 = class557.method3157(-67);
            class386.field5205 = null;
        }
    }

    @OriginalMember(owner = "client!tn", name = "f", descriptor = "(I)Z", line = 97)
    public final boolean method481(int arg0) {
        if (arg0 != 0) {
            this.method481(103);
        }
        ++field8103;
        return class475.field6837[(super.field5179 >> class559.field7984) + class460.field6544 + -class309.field3830][(super.field5176 >> class559.field7984) + -class379.field5139 + class460.field6544];
    }

    @OriginalMember(owner = "client!tn", name = "d", descriptor = "(B)Z", line = 109)
    public final boolean method483(byte arg0) {
        if (arg0 <= 101) {
            this.method483((byte) 21);
        }
        ++field8102;
        return class64.method349(-110, super.field5179 >> class559.field7984, super.field5169, super.field5176 >> class559.field7984);
    }

    @OriginalMember(owner = "client!tn", name = "<init>", descriptor = "(IIIIII)V", line = 119)
    public class570(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super.field5169 = (byte) arg4;
        super.field5178 = arg1;
        this.field8104 = (short) arg5;
        super.field5179 = arg0;
        super.field5166 = (byte) arg3;
        super.field5176 = arg2;
    }
}
