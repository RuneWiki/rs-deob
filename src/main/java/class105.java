import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jj")
public class class105 {

    @OriginalMember(owner = "client!jj", name = "i", descriptor = "[Lvd;")
    private class4[] field1688;

    @OriginalMember(owner = "client!jj", name = "f", descriptor = "Ljava/lang/String;")
    public static String field1685 = "Loading wordpack - ";

    @OriginalMember(owner = "client!jj", name = "c", descriptor = "[[I")
    public static int[][] field1682 = new int[104][104];

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "I")
    public static int field1680;

    @OriginalMember(owner = "client!jj", name = "b", descriptor = "I")
    public static int field1681;

    @OriginalMember(owner = "client!jj", name = "d", descriptor = "I")
    public static int field1683;

    @OriginalMember(owner = "client!jj", name = "g", descriptor = "I")
    public static int field1686;

    @OriginalMember(owner = "client!jj", name = "h", descriptor = "I")
    public static int field1687;

    @OriginalMember(owner = "client!jj", name = "e", descriptor = "Lj;")
    public static class165 field1684;

    @OriginalMember(owner = "client!jj", name = "j", descriptor = "Lclient;")
    public static client field1689;

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(ZI)Lci;")
    public static final class244 method759(boolean arg0, int arg1) {
        field1680++;
        if (!arg0) {
            method763((class221) null, 27);
        }
        class244 var2 = (class244) class1.field7.method1832((long) arg1, (byte) -42);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class278.field4376.method1357(arg1, 5, -1);
        class244 var4 = new class244();
        if (var3 != null) {
            var4.method1678(new class221(var3), (byte) -101);
        }
        class1.field7.method1831((long) arg1, var4, 128);
        return var4;
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(Lnb;IZ)V")
    public static final void method760(class207 arg0, int arg1, boolean arg2) {
        if (class222.field3682 < arg0.field3373) {
            class184.method1249(-26236, arg0);
        } else if (class222.field3682 <= arg0.field3339) {
            class129.method921(arg0, 8182);
        } else {
            class234.method1634(-256, arg0);
        }
        field1687++;
        if (arg0.field3389 < 128 || arg0.field3341 < 128 || arg0.field3389 >= 13184 || arg0.field3341 >= 13184) {
            arg0.field3352 = -1;
            arg0.field3339 = 0;
            arg0.field3373 = 0;
            arg0.field3378 = -1;
            arg0.field3389 = arg0.field3340[0] * 128 + (arg0.method278(0) * 64);
            arg0.field3341 = arg0.field3321[0] * 128 + (arg0.method278(0) * 64);
            arg0.method1427((byte) 60);
        }
        if (class167.field2655 == arg0 && (arg0.field3389 < 1536 || arg0.field3341 < 1536 || arg0.field3389 >= 11776 || arg0.field3341 >= 11776)) {
            arg0.field3352 = -1;
            arg0.field3378 = -1;
            arg0.field3373 = 0;
            arg0.field3339 = 0;
            arg0.field3389 = arg0.field3340[0] * 128 + arg0.method278(0) * 64;
            arg0.field3341 = arg0.field3321[0] * 128 + (arg0.method278(0) * 64);
            arg0.method1427((byte) 60);
        }
        class221.method1518((byte) 80, arg0);
        if (arg2) {
            method762(95);
        }
        class110.method803(arg0, -128);
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(ILqh;B)Lea;")
    public static final class37 method761(int arg0, class201 arg1, byte arg2) {
        field1686++;
        if (class96.method714(arg0, (byte) 66, arg1)) {
            if (arg2 != -82) {
                field1684 = null;
            }
            return class134.method939(false);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(I)V")
    public static void method762(int arg0) {
        if (arg0 != 104) {
            method761(-22, (class201) null, (byte) 15);
        }
        field1685 = null;
        field1684 = null;
        field1689 = null;
        field1682 = null;
    }

    @OriginalMember(owner = "client!jj", name = "<init>", descriptor = "(I)V")
    public class105(int arg0) {
        this.field1688 = new class4[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class4 var3 = this.field1688[var2] = new class4();
            var3.field52 = var3;
            var3.field55 = var3;
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(Log;I)Lfh;")
    public static final class132 method763(class221 arg0, int arg1) {
        field1681++;
        if (arg1 != -1386) {
            method761(79, (class201) null, (byte) -38);
        }
        return new class132(arg0.method1550(57), arg0.method1550(arg1 + 1510), arg0.method1550(90), arg0.method1550(-118), arg0.method1531(65280), arg0.method1517((byte) -96));
    }
}
