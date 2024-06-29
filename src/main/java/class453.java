import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ua")
public class class453 extends class96 {

    @OriginalMember(owner = "client!ua", name = "G", descriptor = "Lgn;")
    public static class475 field6587 = new class475(80, 5);

    @OriginalMember(owner = "client!ua", name = "I", descriptor = "Liu;")
    public static class390 field6589 = new class390(37, -2);

    @OriginalMember(owner = "client!ua", name = "J", descriptor = "I")
    public static int field6590 = 0;

    @OriginalMember(owner = "client!ua", name = "B", descriptor = "I")
    public static int field6582;

    @OriginalMember(owner = "client!ua", name = "C", descriptor = "I")
    public static int field6583;

    @OriginalMember(owner = "client!ua", name = "E", descriptor = "I")
    public static int field6585;

    @OriginalMember(owner = "client!ua", name = "F", descriptor = "I")
    public static int field6586;

    @OriginalMember(owner = "client!ua", name = "K", descriptor = "Lqk;")
    public static class14 field6591;

    @OriginalMember(owner = "client!ua", name = "D", descriptor = "Lfe;")
    private class384 field6584;

    @OriginalMember(owner = "client!ua", name = "H", descriptor = "Luo;")
    public static class388 field6588;

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(ILjava/lang/String;I)Ljava/lang/String;", line = 8)
    public final String method2633(int arg0, String arg1, int arg2) {
        field6586++;
        if (arg0 <= 67) {
            field6587 = null;
        }
        if (this.field6584 == null) {
            return arg1;
        } else {
            class149 var4 = (class149) this.field6584.method2310((byte) -80, (long) arg2);
            return var4 == null ? arg1 : var4.field1930;
        }
    }

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "(III)I", line = 29)
    public final int method2634(int arg0, int arg1, int arg2) {
        field6585++;
        if (this.field6584 == null) {
            return arg0;
        }
        if (arg2 != -10776) {
            field6590 = -60;
        }
        class304 var4 = (class304) this.field6584.method2310((byte) 79, (long) arg1);
        return var4 == null ? arg0 : var4.field4412;
    }

    @OriginalMember(owner = "client!ua", name = "e", descriptor = "(B)V", line = 52)
    public static void method2635(byte arg0) {
        if (arg0 != -33) {
            method2635((byte) -3);
        }
        field6591 = null;
        field6589 = null;
        field6587 = null;
        field6588 = null;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(Lae;B)V", line = 66)
    public final void method2636(class156 arg0, byte arg1) {
        while (true) {
            int var3 = arg0.method941((byte) 125);
            if (var3 == 0) {
                field6583++;
                if (arg1 >= -67) {
                    method2635((byte) -98);
                    return;
                }
                return;
            }
            this.method2637(arg0, (byte) -128, var3);
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(Lae;BI)V", line = 87)
    private final void method2637(class156 arg0, byte arg1, int arg2) {
        if (arg1 != -128) {
            field6590 = -119;
        }
        if (arg2 == 249) {
            int var4 = arg0.method941((byte) 126);
            if (this.field6584 == null) {
                int var5 = class340.method2064(107, var4);
                this.field6584 = new class384(var5);
            }
            for (int var6 = 0; var6 < var4; var6++) {
                boolean var7 = arg0.method941((byte) 124) == 1;
                int var8 = arg0.method943(1295851312);
                class86 var9;
                if (var7) {
                    var9 = new class149(arg0.method981(false));
                } else {
                    var9 = new class304(arg0.method950(arg1 ^ 0xFFFFFF3A));
                }
                this.field6584.method2317(arg1 ^ 0x7F, (long) var8, var9);
            }
        }
        field6582++;
    }
}
