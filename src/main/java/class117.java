import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gw")
public class class117 extends class435 {

    @OriginalMember(owner = "client!gw", name = "u", descriptor = "I")
    public static int field1530 = -1;

    @OriginalMember(owner = "client!gw", name = "l", descriptor = "Lao;")
    public static class191 field1521 = new class191(6, -1);

    @OriginalMember(owner = "client!gw", name = "w", descriptor = "Lao;")
    public static class191 field1532 = new class191(76, 3);

    @OriginalMember(owner = "client!gw", name = "q", descriptor = "I")
    public static int field1526;

    @OriginalMember(owner = "client!gw", name = "r", descriptor = "I")
    public int field1527;

    @OriginalMember(owner = "client!gw", name = "t", descriptor = "I")
    public int field1529;

    @OriginalMember(owner = "client!gw", name = "z", descriptor = "Lo;")
    public static class24 field1535;

    @OriginalMember(owner = "client!gw", name = "x", descriptor = "Lfo;")
    public static class361 field1533;

    @OriginalMember(owner = "client!gw", name = "n", descriptor = "[I")
    public int[] field1523;

    @OriginalMember(owner = "client!gw", name = "o", descriptor = "[I")
    public int[] field1524;

    @OriginalMember(owner = "client!gw", name = "p", descriptor = "[I")
    public int[] field1525;

    @OriginalMember(owner = "client!gw", name = "m", descriptor = "[Ltc;")
    public class236[] field1522;

    @OriginalMember(owner = "client!gw", name = "s", descriptor = "[Ltc;")
    public class236[] field1528;

    @OriginalMember(owner = "client!gw", name = "y", descriptor = "[[S")
    public static short[][] field1534;

    @OriginalMember(owner = "client!gw", name = "v", descriptor = "[[[B")
    public byte[][][] field1531;

    @OriginalMember(owner = "client!gw", name = "a", descriptor = "(II)Luc;")
    public static final class23 method703(int arg0, int arg1) {
        field1526++;
        int var2 = -31 % ((arg1 + 72) / 52);
        class49[] var3 = class195.field2519;
        synchronized (class195.field2519) {
            class23 var4;
            if (class195.field2519.length <= arg0 || class195.field2519[arg0].method288(104)) {
                var4 = new class23();
                var4.field226 = new class82[arg0];
                for (int var5 = 0; var5 < arg0; var5++) {
                    var4.field226[var5] = new class82();
                }
            } else {
                var4 = (class23) class195.field2519[arg0].method282(34);
                var4.method1239(52);
                int var10002 = class381.field5513[arg0]--;
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!gw", name = "c", descriptor = "(I)V")
    public static void method704(int arg0) {
        field1533 = null;
        field1535 = null;
        field1534 = null;
        field1521 = null;
        if (arg0 != -11907) {
            method703(-76, 84);
        }
        field1532 = null;
    }
}
