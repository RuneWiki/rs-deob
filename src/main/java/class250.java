import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bp")
public abstract class class250 {

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "Lgn;")
    public static class475 field3606 = new class475(35, 3);

    @OriginalMember(owner = "client!bp", name = "d", descriptor = "[I")
    public static int[] field3609 = new int[2];

    @OriginalMember(owner = "client!bp", name = "b", descriptor = "I")
    public static int field3607;

    @OriginalMember(owner = "client!bp", name = "c", descriptor = "I")
    public static int field3608;

    @OriginalMember(owner = "client!bp", name = "b", descriptor = "(Leq;Z)Lgl;")
    public abstract class408 method364(class134 arg0, boolean arg1);

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(Leq;I)V")
    public abstract void method361(class134 arg0, int arg1);

    @OriginalMember(owner = "client!bp", name = "c", descriptor = "(I)V")
    public abstract void method722(int arg0);

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(ILeq;BI)Z")
    public abstract boolean method365(int arg0, class134 arg1, byte arg2, int arg3);

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(BILru;)V")
    public static final void method1572(byte arg0, int arg1, class121 arg2) {
        if (class409.field6006) {
            arg1 = 0;
            class409.field6006 = false;
        }
        int var3 = -45 % ((arg0 - 10) / 45);
        field3607++;
        if (class199.field2777 != null && class199.field2777.method692(arg2, 18778)) {
            return;
        }
        class199.field2777 = arg2;
        class190.field2702 = class109.method653(false);
        class450.field6559 = arg1;
        class173.field2369 = arg1;
        if (class173.field2369 == 0) {
            class440.method2577(3031);
            return;
        }
        class298.field4333 = class477.field6871;
        class428.field6301 = class166.field2174;
        class213.field3012 = class430.field6326;
        class188.field2681 = class93.field1256;
        class359.field5336 = class89.field1213;
        field3608 = class289.field4143;
        class392.field5806 = class445.field6494;
        class210.field2968 = class140.field1836;
        class304.field4408 = class239.field3339;
        class487.field7261 = class483.field6991;
    }

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(IIILbp;IZLeq;)V")
    public abstract void method719(int arg0, int arg1, int arg2, class250 arg3, int arg4, boolean arg5, class134 arg6);

    @OriginalMember(owner = "client!bp", name = "d", descriptor = "(I)Z")
    public abstract boolean method723(int arg0);

    @OriginalMember(owner = "client!bp", name = "e", descriptor = "(I)V")
    public static void method1573(int arg0) {
        field3609 = null;
        field3606 = null;
        if (arg0 >= -39) {
            field3609 = null;
        }
    }
}
