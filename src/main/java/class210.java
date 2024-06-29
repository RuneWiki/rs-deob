import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!to")
public class class210 implements class389 {

    @OriginalMember(owner = "client!to", name = "b", descriptor = "La;")
    public class609 field3213;

    @OriginalMember(owner = "client!to", name = "g", descriptor = "Lvo;")
    private class345 field3218;

    @OriginalMember(owner = "client!to", name = "a", descriptor = "Z")
    public static boolean field3212 = false;

    @OriginalMember(owner = "client!to", name = "c", descriptor = "I")
    public static int field3214;

    @OriginalMember(owner = "client!to", name = "d", descriptor = "I")
    public static int field3215;

    @OriginalMember(owner = "client!to", name = "e", descriptor = "I")
    public static int field3216;

    @OriginalMember(owner = "client!to", name = "f", descriptor = "I")
    public static int field3217;

    @OriginalMember(owner = "client!to", name = "h", descriptor = "I")
    public static int field3219;

    @OriginalMember(owner = "client!to", name = "i", descriptor = "Lf;")
    public class257 field3220;

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(ILis;)Lis;", line = 4)
    public static final class101 method1444(int arg0, class101 arg1) {
        field3214++;
        if (arg1.field1539 != -1) {
            return class271.method1711(arg1.field1539, arg0 + 23727);
        } else if (arg0 == 0) {
            int var2 = arg1.field1577 >>> 16;
            class341 var3 = new class341(class199.field3098);
            for (class259 var4 = (class259) var3.method2047(112); var4 != null; var4 = (class259) var3.method2050(arg0)) {
                if (var4.field3716 == var2) {
                    return class271.method1711((int) var4.field6265, 23727);
                }
            }
            return null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(ZZ)V", line = 36)
    public void method344(boolean arg0, boolean arg1) {
        if (arg1) {
            int var3 = this.field3213.field8760.method1329(class570.field8333, this.field3220.method11(), false) + this.field3213.field8755;
            int var4 = this.field3213.field8757.method2447(-1464849236, class140.field2349, this.field3220.method9()) + this.field3213.field8748;
            this.field3220.method1638(var3, var4);
        }
        if (!arg0) {
            field3217++;
        }
    }

    @OriginalMember(owner = "client!to", name = "b", descriptor = "(I)Z", line = 56)
    public final boolean method348(int arg0) {
        field3216++;
        return arg0 == 21378 ? this.field3218.method2077(arg0 - 21378, this.field3213.field8750) : false;
    }

    @OriginalMember(owner = "client!to", name = "c", descriptor = "(I)V", line = 69)
    public static final void method1445(int arg0) {
        class511.method3040((long) class148.field2508, class637.field9048, false);
        field3219++;
        if (~class557.field8146 != arg0) {
            class246.method1583(class557.field8146, 11475);
        }
        for (int var1 = 0; var1 < class43.field586; var1++) {
            if (class636.field9030[var1]) {
                class221.field3297[var1] = true;
            }
            class392.field5701[var1] = class636.field9030[var1];
            class636.field9030[var1] = false;
        }
        class419.field5958 = class148.field2508;
        if (class557.field8146 != -1) {
            class43.field586 = 0;
            class198.method1390(1438);
        }
        class637.field9048.method805();
        class288.method1767(class637.field9048, arg0 ^ 0x8);
        int var2 = class208.method1441(false);
        if (var2 == -1) {
            var2 = class324.field4521;
        }
        if (var2 == -1) {
            var2 = class266.field3822;
        }
        class260.method1650(var2, 448389448);
        class193.field2993 = 0;
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(I)V", line = 118)
    public final void method343(int arg0) {
        field3215++;
        if (arg0 >= -29) {
            method1445(-33);
        }
        this.field3220 = class699.method3926(this.field3213.field8750, (byte) 100, this.field3218);
    }

    @OriginalMember(owner = "client!to", name = "<init>", descriptor = "(Lvo;La;)V", line = 132)
    public class210(class345 arg0, class609 arg1) {
        this.field3213 = arg1;
        this.field3218 = arg0;
    }
}
