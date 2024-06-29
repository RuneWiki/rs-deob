import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pr")
public class class139 {

    @OriginalMember(owner = "client!pr", name = "d", descriptor = "I")
    public static int field1792 = 0;

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "I")
    public static int field1789;

    @OriginalMember(owner = "client!pr", name = "b", descriptor = "I")
    public static int field1790;

    @OriginalMember(owner = "client!pr", name = "c", descriptor = "I")
    public static int field1791;

    @OriginalMember(owner = "client!pr", name = "f", descriptor = "Lir;")
    public static class185 field1794;

    @OriginalMember(owner = "client!pr", name = "e", descriptor = "[Ljava/lang/String;")
    public static String[] field1793;

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(II)V", line = 6)
    public static final void method973(int arg0, int arg1) {
        field1789++;
        int var2 = 46 / ((74 - arg0) / 50);
        class90.field1227.method379(arg1, false);
    }

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(I)V", line = 19)
    public static void method974(int arg0) {
        field1794 = null;
        field1793 = null;
        if (arg0 != 24687) {
            field1793 = null;
        }
    }

    @OriginalMember(owner = "client!pr", name = "b", descriptor = "(I)V", line = 34)
    public static final void method975(int arg0) {
        if (arg0 >= -32) {
            field1792 = 83;
        }
        field1790++;
        class322.method2118();
        for (int var1 = 0; var1 < 4; var1++) {
            class420.field6108[var1].method1850(false);
        }
        class403.method2571(-1);
        class452.method2808(0);
        System.gc();
    }

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(IBILsj;)V", line = 63)
    public static final void method976(int arg0, byte arg1, int arg2, class248 arg3) {
        int var4 = 5 / ((arg1 - 18) / 48);
        class210.field2850 = arg0;
        class228.field3140 = arg3;
        class40.field619 = arg2;
        field1791++;
    }
}
