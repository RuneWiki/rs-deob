import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tl")
public class class326 {

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "I")
    public static int field4765 = 0;

    @OriginalMember(owner = "client!tl", name = "b", descriptor = "I")
    public static int field4766;

    @OriginalMember(owner = "client!tl", name = "d", descriptor = "I")
    public static int field4768;

    @OriginalMember(owner = "client!tl", name = "e", descriptor = "I")
    public static int field4769;

    @OriginalMember(owner = "client!tl", name = "f", descriptor = "I")
    public static int field4770;

    @OriginalMember(owner = "client!tl", name = "c", descriptor = "Lfh;")
    public static class140 field4767;

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(ILfh;ZLfh;)V", line = 10)
    public static final void method2251(int arg0, class140 arg1, boolean arg2, class140 arg3) {
        class211.field2983 = arg2;
        class305.field4458 = arg3;
        field4770++;
        class122.field1605 = arg1;
        if (arg0 <= 51) {
            method2251(54, (class140) null, true, (class140) null);
        }
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(B)V", line = 23)
    public static void method2252(byte arg0) {
        field4767 = null;
        if (arg0 != 12) {
            method2252((byte) -64);
        }
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(Lqc;Z)V", line = 35)
    public static final void method2253(class331 arg0, boolean arg1) {
        field4768++;
        if (!arg1) {
            return;
        }
        int var2 = arg0.field4929 - class313.field4603;
        int var3 = arg0.field4853 * 128 + (arg0.method1699(-1) * 64);
        int var4 = arg0.field4928 * 128 + (arg0.method1699(-1) * 64);
        if (arg0.field4901 == 0) {
            arg0.field4912 = 1024;
        }
        arg0.field4893 += (var4 - arg0.field4893) / var2;
        arg0.field4855 += (var3 - arg0.field4855) / var2;
        if (arg0.field4901 == 1) {
            arg0.field4912 = 1536;
        }
        arg0.field4932 = 0;
        if (arg0.field4901 == 2) {
            arg0.field4912 = 0;
        }
        if (arg0.field4901 == 3) {
            arg0.field4912 = 512;
        }
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(II)V", line = 71)
    public static final void method2254(int arg0, int arg1) {
        field4766++;
        if (arg1 < 10) {
            field4767 = (class140) null;
        }
        class130.field1775.method2264((byte) 70, arg0);
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(ILjava/lang/String;)V", line = 89)
    public static final void method2255(int arg0, String arg1) {
        if (arg0 != 6137) {
            return;
        }
        field4769++;
        if (class242.field3504 == null) {
            return;
        }
        int var2 = 0;
        long var3 = class201.method1476(-127, arg1);
        if (var3 == 0L) {
            return;
        }
        while (class242.field3504.length > var2 && class242.field3504[var2].field304 != var3) {
            var2++;
        }
        if (class242.field3504.length > var2 && class242.field3504[var2] != null) {
            class159.field2261++;
            class251.field3681.method1309(23, 75);
            class251.field3681.method2049(-19780, class242.field3504[var2].field304);
        }
    }
}
