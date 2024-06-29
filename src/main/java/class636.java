import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nfa")
public class class636 {

    @OriginalMember(owner = "client!nfa", name = "g", descriptor = "Lhm;")
    private class208 field8619 = new class208(64);

    @OriginalMember(owner = "client!nfa", name = "b", descriptor = "Lpfa;")
    private class275 field8614;

    @OriginalMember(owner = "client!nfa", name = "e", descriptor = "Lpfa;")
    private class275 field8617;

    @OriginalMember(owner = "client!nfa", name = "d", descriptor = "Lvf;")
    public static class141 field8616 = new class141(7, 0, 1, 1);

    @OriginalMember(owner = "client!nfa", name = "f", descriptor = "[I")
    public static int[] field8618 = new int[1];

    @OriginalMember(owner = "client!nfa", name = "a", descriptor = "I")
    public static int field8613;

    @OriginalMember(owner = "client!nfa", name = "c", descriptor = "I")
    public static int field8615;

    @OriginalMember(owner = "client!nfa", name = "h", descriptor = "Ltu;")
    public static class324 field8620;

    @OriginalMember(owner = "client!nfa", name = "a", descriptor = "(II)Lkv;", line = 6)
    public final class252 method3562(int arg0, int arg1) {
        field8613++;
        class252 var3 = (class252) this.field8619.method1221((long) arg1, true);
        if (var3 != null) {
            return var3;
        }
        byte[] var4;
        if (arg1 < 32768) {
            var4 = this.field8614.method1659(-3, arg1, 0);
        } else {
            var4 = this.field8617.method1659(arg0 ^ 0xFFFF9B98, arg1 & 0x7FFF, 0);
        }
        class252 var5 = new class252();
        if (var4 != null) {
            var5.method1517(0, new class572(var4));
        }
        if (arg0 != 25703) {
            this.field8617 = null;
        }
        if (arg1 >= 32768) {
            var5.method1515((byte) -98);
        }
        this.field8619.method1230((byte) 100, (long) arg1, var5);
        return var5;
    }

    @OriginalMember(owner = "client!nfa", name = "a", descriptor = "(Loa;Lvi;B)I", line = 43)
    public static final int method3563(class650 arg0, class505 arg1, byte arg2) {
        field8615++;
        if (arg1.field6302 != -1) {
            return arg1.field6302;
        }
        if (arg1.field6300 != -1) {
            class152 var3 = arg0.field8781.method2718(arg0.method419() ? arg1.field6300 : arg1.field6301, (byte) 72);
            if (!var3.field1818) {
                return var3.field1825;
            }
        }
        return arg2 == 24 ? arg1.field6314 : -40;
    }

    @OriginalMember(owner = "client!nfa", name = "a", descriptor = "(I)V", line = 92)
    public static void method3564(int arg0) {
        field8618 = null;
        if (arg0 != 64) {
            method3563(null, null, (byte) -49);
        }
        field8620 = null;
        field8616 = null;
    }

    @OriginalMember(owner = "client!nfa", name = "<init>", descriptor = "(ILpfa;Lpfa;)V", line = 107)
    public class636(int arg0, class275 arg1, class275 arg2) {
        this.field8614 = arg1;
        this.field8617 = arg2;
        if (this.field8614 != null) {
            this.field8614.method1655(0, (byte) -82);
        }
        if (this.field8617 != null) {
            this.field8617.method1655(0, (byte) -82);
        }
    }
}
