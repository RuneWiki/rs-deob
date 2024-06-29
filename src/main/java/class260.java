import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ih")
public class class260 extends class87 {

    @OriginalMember(owner = "client!ih", name = "k", descriptor = "I")
    public static int field4586 = 0;

    @OriginalMember(owner = "client!ih", name = "l", descriptor = "Le;")
    public static class191 field4587 = class54.method368("(U5", 2047);

    @OriginalMember(owner = "client!ih", name = "m", descriptor = "I")
    public static int field4588;

    @OriginalMember(owner = "client!ih", name = "n", descriptor = "I")
    public static int field4589;

    @OriginalMember(owner = "client!ih", name = "o", descriptor = "I")
    public static int field4590;

    @OriginalMember(owner = "client!ih", name = "p", descriptor = "I")
    public static int field4591;

    @OriginalMember(owner = "client!ih", name = "q", descriptor = "I")
    public static int field4592;

    @OriginalMember(owner = "client!ih", name = "r", descriptor = "I")
    public static int field4593;

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(I)V")
    public static final void method1783(int arg0) {
        field4590++;
        int var1 = 0;
        for (int var2 = 0; var2 < 104; var2++) {
            for (int var3 = 0; var3 < 104; var3++) {
                if (class53.method358(arg0 ^ 0x7DC7, var3, var2, var1, true, class201.field3608)) {
                    var1++;
                }
                if (var1 >= 512) {
                    return;
                }
            }
        }
        if (arg0 != 32245) {
            method1784(96);
        }
    }

    @OriginalMember(owner = "client!ih", name = "b", descriptor = "(I)V")
    public static void method1784(int arg0) {
        field4587 = null;
        if (arg0 != 134663368) {
            method1783(35);
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(ZLng;Lng;Lng;)V")
    public static final void method1785(boolean arg0, class121 arg1, class121 arg2, class121 arg3) {
        class51.field935 = arg2;
        class167.field2814 = arg1;
        field4588++;
        class8.field77 = arg3;
        if (arg0) {
            method1784(58);
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(Z)I")
    public static final int method1786(boolean arg0) {
        field4589++;
        if ((double) class216.field3808 == 3.0D) {
            return 37;
        } else if ((double) class216.field3808 == 4.0D) {
            return 50;
        } else if ((double) class216.field3808 == 6.0D) {
            return 75;
        } else {
            if (!arg0) {
                field4587 = null;
            }
            return 100;
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(II)I")
    public static final int method1787(int arg0, int arg1) {
        if (arg0 != 134663368) {
            method1784(28);
        }
        field4591++;
        return arg1 >>> 8;
    }
}
