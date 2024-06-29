import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rb")
public class class320 extends class665 {

    @OriginalMember(owner = "client!rb", name = "k", descriptor = "I")
    public int field4703;

    @OriginalMember(owner = "client!rb", name = "l", descriptor = "I")
    public int field4704;

    @OriginalMember(owner = "client!rb", name = "m", descriptor = "I")
    public static int field4705;

    @OriginalMember(owner = "client!rb", name = "n", descriptor = "I")
    public static int field4706;

    @OriginalMember(owner = "client!rb", name = "o", descriptor = "I")
    public static int field4707;

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(IIILde;)V")
    public static final void method2002(int arg0, int arg1, int arg2, class491 arg3) {
        field4706++;
        int[] var4 = new int[4];
        class476.method2790(var4, arg2, var4.length, arg1);
        class599.method3392(arg0, arg3, var4, (byte) -101);
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(II)Z")
    public static final boolean method2003(int arg0, int arg1) {
        if (arg0 > -59) {
            return false;
        } else {
            field4705++;
            return arg1 == 10 || arg1 == 11 || arg1 == 12;
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(I)Lws;")
    public static final class325 method2004(int arg0) {
        field4707++;
        return arg0 == 1 ? class127.method957(1, 5492) : null;
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(Lha;III[Z)V")
    public static final void method2005(class54 arg0, int arg1, int arg2, int arg3, boolean[] arg4) {
        if (class499.field7071 == class296.field4340) {
            return;
        }
        int var5 = class420.field6108[arg1].method442(arg2, true, arg3);
        for (int var6 = 0; var6 <= arg1; var6++) {
            if (arg4 == null || arg4[var6]) {
                class37 var7 = class420.field6108[var6];
                if (var7 != null) {
                    var7.method437(arg0, arg2, var5 - var7.method442(arg2, true, arg3), arg3, 0, false);
                }
            }
        }
    }
}
