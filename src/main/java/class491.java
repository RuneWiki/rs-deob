import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gl")
public class class491 {

    @OriginalMember(owner = "client!gl", name = "b", descriptor = "I")
    public int field7087 = 0;

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "I")
    public static int field7086;

    @OriginalMember(owner = "client!gl", name = "c", descriptor = "I")
    public static int field7088;

    @OriginalMember(owner = "client!gl", name = "d", descriptor = "I")
    public static int field7089;

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(III)Z", line = 4)
    public static final boolean method2908(int arg0, int arg1, int arg2) {
        int var3 = class496.field7269[arg0][arg1][arg2];
        if (-class484.field6969 == var3) {
            return false;
        } else if (class484.field6969 == var3) {
            return true;
        } else {
            int var4 = arg1 << class295.field3991;
            int var5 = arg2 << class295.field3991;
            if (class24.method150(var4 + 1, class492.field7122[arg0].method85(arg1, arg2), var5 + 1) && class24.method150(class117.field1845 + var4 - 1, class492.field7122[arg0].method85(arg1 + 1, arg2), var5 + 1) && class24.method150(class117.field1845 + var4 - 1, class492.field7122[arg0].method85(arg1 + 1, arg2 + 1), class117.field1845 + var5 - 1) && class24.method150(var4 + 1, class492.field7122[arg0].method85(arg1, arg2 + 1), class117.field1845 + var5 - 1) && class24.method150(class392.field5656 + var4, class492.field7122[arg0].method85(arg1, arg2), var5 + 1) && class24.method150(class117.field1845 + var4 - 1, class492.field7122[arg0].method85(arg1 + 1, arg2), class392.field5656 + var5) && class24.method150(class392.field5656 + var4, class492.field7122[arg0].method85(arg1, arg2 + 1), class117.field1845 + var5 - 1) && class24.method150(class117.field1845 + var4 - 1, class492.field7122[arg0].method85(arg1, arg2), class392.field5656 + var5) && class24.method150(class392.field5656 + var4, class492.field7122[arg0].method85(arg1, arg2), class392.field5656 + var5)) {
                class496.field7269[arg0][arg1][arg2] = class484.field6969;
                return true;
            } else {
                class496.field7269[arg0][arg1][arg2] = -class484.field6969;
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(IILsv;)V", line = 30)
    private final void method2909(int arg0, int arg1, class319 arg2) {
        field7086++;
        if (~arg0 == arg1) {
            this.field7087 = arg2.method1844(-103);
        }
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(Lsv;I)V", line = 45)
    public final void method2910(class319 arg0, int arg1) {
        if (arg1 != -1) {
            this.field7087 = -28;
        }
        while (true) {
            int var3 = arg0.method1869(-120);
            if (var3 == 0) {
                field7088++;
                return;
            }
            this.method2909(var3, -6, arg0);
        }
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(BI)V", line = 65)
    public static final void method2911(byte arg0, int arg1) {
        class336.field4899 = arg1;
        class470.field6776 = -1;
        class281.field3828 = -1;
        field7089++;
        if (arg0 >= 117) {
            class409.method2400((byte) 2);
        }
    }
}
