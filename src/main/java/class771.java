import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sp")
public class class771 {

    @OriginalMember(owner = "client!sp", name = "c", descriptor = "Z")
    public boolean field10603 = true;

    @OriginalMember(owner = "client!sp", name = "f", descriptor = "Lqk;")
    public static class1 field10606 = new class1(61, 8);

    @OriginalMember(owner = "client!sp", name = "h", descriptor = "I")
    public static int field10608 = 64;

    @OriginalMember(owner = "client!sp", name = "k", descriptor = "[I")
    public static int[] field10611 = new int[1];

    @OriginalMember(owner = "client!sp", name = "i", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field10609 = new BigInteger("10001", 16);

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "C")
    private char field10601;

    @OriginalMember(owner = "client!sp", name = "b", descriptor = "I")
    public int field10602;

    @OriginalMember(owner = "client!sp", name = "e", descriptor = "I")
    public static int field10605;

    @OriginalMember(owner = "client!sp", name = "g", descriptor = "I")
    public static int field10607;

    @OriginalMember(owner = "client!sp", name = "j", descriptor = "I")
    public static int field10610;

    @OriginalMember(owner = "client!sp", name = "d", descriptor = "Ljava/lang/String;")
    public String field10604;

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(B)Z")
    public final boolean method4253(byte arg0) {
        field10605++;
        if (arg0 > -27) {
            this.field10601 = 'i';
        }
        return this.field10601 == 's';
    }

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(ILgga;B)V")
    private final void method4254(int arg0, class511 arg1, byte arg2) {
        if (arg2 != 82) {
            return;
        }
        field10610++;
        if (arg0 == 1) {
            this.field10601 = class395.method2438(arg1.method3030(-25984), -128);
        } else if (arg0 == 2) {
            this.field10602 = arg1.method3008(64);
        } else if (arg0 == 4) {
            this.field10603 = false;
        } else if (arg0 == 5) {
            this.field10604 = arg1.method2993((byte) -84);
            return;
        }
    }

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(ILgga;)V")
    public final void method4255(int arg0, class511 arg1) {
        field10607++;
        while (true) {
            int var3 = arg1.method3013(-100);
            if (var3 == 0) {
                if (arg0 == 26738) {
                    return;
                } else {
                    this.field10604 = null;
                    return;
                }
            }
            this.method4254(var3, arg1, (byte) 82);
        }
    }

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(I)V")
    public static void method4256(int arg0) {
        if (arg0 != -6) {
            field10609 = null;
        }
        field10606 = null;
        field10611 = null;
        field10609 = null;
    }
}
