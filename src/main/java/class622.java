import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vc")
public class class622 extends class618 {

    @OriginalMember(owner = "client!vc", name = "g", descriptor = "I")
    public int field7864;

    @OriginalMember(owner = "client!vc", name = "i", descriptor = "I")
    public int field7866;

    @OriginalMember(owner = "client!vc", name = "j", descriptor = "I")
    public static int field7867;

    @OriginalMember(owner = "client!vc", name = "l", descriptor = "I")
    public int field7869;

    @OriginalMember(owner = "client!vc", name = "m", descriptor = "I")
    public static int field7870;

    @OriginalMember(owner = "client!vc", name = "n", descriptor = "I")
    public int field7871;

    @OriginalMember(owner = "client!vc", name = "k", descriptor = "Lwm;")
    public static class30 field7868;

    @OriginalMember(owner = "client!vc", name = "h", descriptor = "Lfda;")
    public class381 field7865;

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(I)V")
    public static void method3320(int arg0) {
        if (arg0 != 2) {
            field7868 = null;
        }
        field7868 = null;
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(Lmc;Z)Lrj;")
    public static final class379 method3321(class234 arg0, boolean arg1) {
        field7867++;
        if (arg1) {
            method3321(null, true);
        }
        return new class379(arg0.method1542(27067), arg0.method1542(27067), arg0.method1542(27067), arg0.method1542(27067), arg0.method1500((byte) -117), arg0.method1509(true));
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(Llq;ZZ)V")
    public static final void method3322(class210 arg0, boolean arg1, boolean arg2) {
        arg0.field2894 = arg2;
        if (!class70.field955) {
            class444.method2551(arg0, class734.field9960);
        } else if (arg1) {
            class520.field6609[class520.field6609.length - 1].method1873((byte) 127, arg0);
        } else {
            int var3 = class343.method1994(arg0.field2898);
            int var4 = class303.field3820[2] * arg0.method745((byte) -99) / arg0.field2887;
            int var5 = class343.method1994(arg0.field2898 - var4);
            int var6 = class343.method1994(arg0.field2898 + var4);
            if (var5 == var6) {
                class520.field6609[var3].method1873((byte) 108, arg0);
            } else if (var6 - var5 == 1) {
                class520.field6609[class106.field1448 + var5].method1873((byte) 95, arg0);
            } else {
                class520.field6609[class520.field6609.length - 1].method1873((byte) 112, arg0);
            }
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(JZ)V")
    public static final void method3323(long arg0, boolean arg1) {
        if (arg1) {
            method3321(null, false);
        }
        class368.field4499.setTime(new Date(arg0));
        field7870++;
    }
}
