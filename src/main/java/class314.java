import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oh")
public class class314 {

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "Z")
    public static boolean field4736 = true;

    @OriginalMember(owner = "client!oh", name = "f", descriptor = "[I")
    public static int[] field4741 = new int[14];

    @OriginalMember(owner = "client!oh", name = "b", descriptor = "I")
    public static int field4737;

    @OriginalMember(owner = "client!oh", name = "c", descriptor = "I")
    public static int field4738;

    @OriginalMember(owner = "client!oh", name = "d", descriptor = "I")
    public static int field4739;

    @OriginalMember(owner = "client!oh", name = "e", descriptor = "I")
    public static int field4740;

    @OriginalMember(owner = "client!oh", name = "g", descriptor = "I")
    public static int field4742;

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(II)V", line = 6)
    public static final void method2143(int arg0, int arg1) {
        class326.field4932.method720(arg0, 1088);
        field4738++;
        class251.field3600.method720(arg0, 1088);
        class306.field4591.method720(arg0, 1088);
        if (arg1 != 32063) {
            field4741 = (int[]) null;
        }
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(I)V", line = 28)
    public static void method2144(int arg0) {
        field4741 = null;
        if (arg0 != -1) {
            field4741 = (int[]) null;
        }
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(ILec;)V", line = 47)
    public static final void method2145(int arg0, class171 arg1) {
        int var2 = -33 / ((arg0 - 47) / 58);
        field4740++;
        class45.method285(200000, arg1, 127);
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(ZI)Lnh;", line = 62)
    public static final class78 method2146(boolean arg0, int arg1) {
        field4742++;
        class78 var2 = (class78) class45.field549.method716((long) arg1, false);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class279.field4189.method955(3, arg1, -21853);
        class78 var4 = new class78();
        if (!arg0) {
            method2143(6, 75);
        }
        if (var3 != null) {
            var4.method602(0, new class316(var3));
        }
        class45.field549.method721((long) arg1, var4, 0);
        return var4;
    }
}
