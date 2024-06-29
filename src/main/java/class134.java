import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aba")
public class class134 extends class66 {

    @OriginalMember(owner = "client!aba", name = "o", descriptor = "Leq;")
    private class357 field1583;

    @OriginalMember(owner = "client!aba", name = "w", descriptor = "I")
    private int field1591;

    @OriginalMember(owner = "client!aba", name = "s", descriptor = "I")
    private int field1587;

    @OriginalMember(owner = "client!aba", name = "v", descriptor = "I")
    private int field1590;

    @OriginalMember(owner = "client!aba", name = "p", descriptor = "I")
    private int field1584;

    @OriginalMember(owner = "client!aba", name = "q", descriptor = "I")
    private int field1585;

    @OriginalMember(owner = "client!aba", name = "t", descriptor = "I")
    private int field1588;

    @OriginalMember(owner = "client!aba", name = "u", descriptor = "[I")
    public static int[] field1589 = new int[14];

    @OriginalMember(owner = "client!aba", name = "m", descriptor = "Z")
    public static boolean field1581 = false;

    @OriginalMember(owner = "client!aba", name = "k", descriptor = "I")
    public static int field1579;

    @OriginalMember(owner = "client!aba", name = "l", descriptor = "I")
    public static int field1580;

    @OriginalMember(owner = "client!aba", name = "r", descriptor = "I")
    public static int field1586;

    @OriginalMember(owner = "client!aba", name = "n", descriptor = "Lgv;")
    private class45 field1582;

    @OriginalMember(owner = "client!aba", name = "a", descriptor = "(IBILha;Lqia;)V")
    public static final void method844(int arg0, byte arg1, int arg2, class454 arg3, class547 arg4) {
        field1580++;
        int var5 = 35 % ((arg1 + 49) / 51);
        class419.field5962.method3114(true);
        if (class459.field6422) {
            return;
        }
        for (class499 var6 = (class499) arg4.method3111(60); var6 != null; var6 = (class499) arg4.method3116(-53)) {
            class351 var7 = class341.field4406.method2765(36, var6.field7056);
            if (class423.method2513(16777215, var7)) {
                boolean var8 = class223.method1442(arg2, var6, arg0, true, var7, arg3);
                if (var8) {
                    class590.method3280(var6, var7, arg3, (byte) 49);
                }
            }
        }
    }

    @OriginalMember(owner = "client!aba", name = "a", descriptor = "(ILgaa;Lgaa;)V")
    public static final void method845(int arg0, class460 arg1, class460 arg2) {
        field1579++;
        class282.field3573++;
        class650 var3 = class314.method1837(class736.field10288, true, class625.field8727);
        var3.field8928.method1112(arg1.field6524, -126);
        var3.field8928.method1157(arg1.field6601, (byte) 118);
        var3.field8928.method1116(arg2.field6601, 9571);
        if (arg0 == 27533) {
            var3.field8928.method1101(arg2.field6556, 255);
            var3.field8928.method1092(1905513336, arg2.field6524);
            var3.field8928.method1157(arg1.field6556, (byte) 115);
            class108.method745(var3, arg0 - 27577);
        }
    }

    @OriginalMember(owner = "client!aba", name = "d", descriptor = "(I)V")
    public static void method846(int arg0) {
        field1589 = null;
        if (arg0 != 0) {
            field1589 = null;
        }
    }

    @OriginalMember(owner = "client!aba", name = "c", descriptor = "(I)Lgv;")
    public final class45 method501(int arg0) {
        field1586++;
        if (arg0 > -79) {
            this.method501(64);
        }
        if (this.field1582 == null) {
            class510.field7196[4] = this.field1588;
            class510.field7196[2] = this.field1591;
            class510.field7196[5] = this.field1584;
            class510.field7196[0] = this.field1590;
            class96 var2 = this.field1583.field6364;
            class510.field7196[3] = this.field1585;
            class510.field7196[1] = this.field1587;
            boolean var3 = false;
            int var4 = 0;
            for (int var5 = 0; var5 < 6; var5++) {
                if (!var2.method390(class510.field7196[var5], -9396)) {
                    return null;
                }
                class91 var7 = var2.method389(9559, class510.field7196[var5]);
                int var8 = var7.field1159 ? 64 : 128;
                if (var4 < var8) {
                    var4 = var8;
                }
                if (var7.field1153 > 0) {
                    var3 = true;
                }
            }
            for (int var6 = 0; var6 < 6; var6++) {
                class657.field9029[var6] = var2.method395(false, 1.0F, var4, class510.field7196[var6], -11288, var4);
            }
            this.field1582 = new class45(this.field1583, 6407, var4, var3, class657.field9029);
        }
        return this.field1582;
    }

    @OriginalMember(owner = "client!aba", name = "<init>", descriptor = "(Leq;IIIIII)V")
    public class134(class357 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field1583 = arg0;
        this.field1591 = arg3;
        this.field1587 = arg2;
        this.field1590 = arg1;
        this.field1584 = arg6;
        this.field1585 = arg4;
        this.field1588 = arg5;
    }
}
