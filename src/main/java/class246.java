import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sc")
public class class246 {

    @OriginalMember(owner = "client!sc", name = "e", descriptor = "Lbe;")
    public static class283 field4179 = class153.method941(125, "::qa_op_test");

    @OriginalMember(owner = "client!sc", name = "d", descriptor = "[Z")
    public static boolean[] field4178 = new boolean[112];

    @OriginalMember(owner = "client!sc", name = "c", descriptor = "Lbe;")
    public static class283 field4177 = class153.method941(126, "Mitglieder)2Welt");

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "I")
    public static int field4176;

    @OriginalMember(owner = "client!sc", name = "f", descriptor = "I")
    public static int field4180;

    @OriginalMember(owner = "client!sc", name = "g", descriptor = "I")
    public static int field4181;

    @OriginalMember(owner = "client!sc", name = "h", descriptor = "I")
    public static int field4182;

    @OriginalMember(owner = "client!sc", name = "i", descriptor = "I")
    public static int field4183;

    @OriginalMember(owner = "client!sc", name = "j", descriptor = "I")
    public static int field4184;

    @OriginalMember(owner = "client!sc", name = "k", descriptor = "I")
    public static int field4185;

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "Loa;")
    public static class272 field4175;

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(B)V", line = 10)
    public static final void method1672(byte arg0) {
        field4180++;
        if (class60.field827 != null) {
            class60.field827.method1476(-13575);
        }
        if (class155.field2561 != null) {
            class155.field2561.method1476(-13575);
        }
        class269.method1808(class33.field501, true, 22050, 2);
        class60.field827 = class18.method115(119, class150.field2460, 0, 22050, class264.field4487);
        class60.field827.method1469(50, class239.field4035);
        if (arg0 > 14) {
            class155.field2561 = class18.method115(77, class150.field2460, 1, 2048, class264.field4487);
            class155.field2561.method1469(50, class301.field5089);
        }
    }

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "(B)V", line = 42)
    public static void method1673(byte arg0) {
        field4177 = null;
        int var1 = -25 % ((-arg0 - 10) / 38);
        field4178 = null;
        field4179 = null;
        field4175 = null;
    }

    @OriginalMember(owner = "client!sc", name = "c", descriptor = "(B)V", line = 71)
    public static final void method1674(byte arg0) {
        if (arg0 > -40) {
            field4175 = (class272) null;
        }
        class126.field2093 = null;
        class260.field4421 = null;
        class72.field1277 = null;
        class107.field1831 = null;
        class178.field3072 = null;
        class217.field3680 = null;
        class280.field4683 = null;
        class205.field3494 = null;
        class243.field4100 = null;
        class23.field354 = null;
        class16.field188 = null;
        class54.field751 = null;
        class69.field1148 = null;
        class44.field605 = null;
        class213.field3629 = null;
        class269.field4539 = null;
        class15.field169 = null;
        class159.field2599 = null;
        class240.field4056 = null;
        class259.field4407 = null;
        class25.field375 = null;
        field4184++;
        class65.field895 = null;
        class280.field4677 = null;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(BILek;)Z", line = 107)
    public static final boolean method1675(byte arg0, int arg1, class172 arg2) {
        field4181++;
        if (arg0 != 19) {
            method1675((byte) -119, 122, (class172) null);
        }
        byte[] var3 = arg2.method1112(arg1, arg0 - 120);
        if (var3 == null) {
            return false;
        } else {
            class190.method1236(var3, -65);
            return true;
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(IIIILgf;IJIIII)Z", line = 124)
    public static final boolean method1676(int arg0, int arg1, int arg2, int arg3, class7 arg4, int arg5, long arg6, int arg7, int arg8, int arg9, int arg10) {
        return arg4 == null ? true : class208.method1381(arg0, arg7, arg8, arg9 + 1 - arg7, arg10 - arg8 + 1, arg1, arg2, arg3, arg4, arg5, true, arg6);
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(BI)V", line = 132)
    public static final void method1677(byte arg0, int arg1) {
        class72 var2 = class25.method174(arg1, (byte) -75, 5);
        field4182++;
        var2.method479(-62);
        if (arg0 != -115) {
            method1672((byte) -101);
        }
    }

    @OriginalMember(owner = "client!sc", name = "d", descriptor = "(B)I", line = 148)
    public static final int method1678(byte arg0) {
        field4183++;
        if (arg0 != 46) {
            method1678((byte) -52);
        }
        return 16;
    }
}
