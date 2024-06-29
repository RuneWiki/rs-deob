import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!h")
public class class244 {

    @OriginalMember(owner = "client!h", name = "a", descriptor = "I")
    public static int field4048 = 0;

    @OriginalMember(owner = "client!h", name = "g", descriptor = "B")
    public static byte field4054;

    @OriginalMember(owner = "client!h", name = "b", descriptor = "I")
    public static int field4049;

    @OriginalMember(owner = "client!h", name = "c", descriptor = "I")
    public static int field4050;

    @OriginalMember(owner = "client!h", name = "e", descriptor = "I")
    public static int field4052;

    @OriginalMember(owner = "client!h", name = "f", descriptor = "I")
    public static int field4053;

    @OriginalMember(owner = "client!h", name = "h", descriptor = "I")
    public static int field4055;

    @OriginalMember(owner = "client!h", name = "j", descriptor = "I")
    public static int field4057;

    @OriginalMember(owner = "client!h", name = "k", descriptor = "I")
    public static int field4058;

    @OriginalMember(owner = "client!h", name = "i", descriptor = "Lic;")
    public static class135 field4056;

    @OriginalMember(owner = "client!h", name = "d", descriptor = "Lek;")
    public static class206 field4051;

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(Lek;Lek;Lek;I)V", line = 9)
    public static final void method1725(class206 arg0, class206 arg1, class206 arg2, int arg3) {
        field4053++;
        class229.field3757 = arg0;
        class206.field3418 = arg2;
        class232.field3808 = arg1;
        if (arg3 != 0) {
            method1729(true);
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(Lml;III)V", line = 21)
    public static final void method1726(class152 arg0, int arg1, int arg2, int arg3) {
        if (arg2 < class224.field3701) {
            class312 var4 = class353.field5644[arg1][arg2 + 1][arg3];
            if (var4 != null && var4.field5092 != null && var4.field5092.field1653.method418()) {
                arg0.method426(var4.field5092.field1653, 128, 0, 0, true);
            }
        }
        if (arg3 < class224.field3701) {
            class312 var5 = class353.field5644[arg1][arg2][arg3 + 1];
            if (var5 != null && var5.field5092 != null && var5.field5092.field1653.method418()) {
                arg0.method426(var5.field5092.field1653, 0, 0, 128, true);
            }
        }
        if (arg2 < class224.field3701 && arg3 < class280.field4578) {
            class312 var6 = class353.field5644[arg1][arg2 + 1][arg3 + 1];
            if (var6 != null && var6.field5092 != null && var6.field5092.field1653.method418()) {
                arg0.method426(var6.field5092.field1653, 128, 0, 128, true);
            }
        }
        if (arg2 < class224.field3701 && arg3 > 0) {
            class312 var7 = class353.field5644[arg1][arg2 + 1][arg3 - 1];
            if (var7 != null && var7.field5092 != null && var7.field5092.field1653.method418()) {
                arg0.method426(var7.field5092.field1653, 128, 0, -128, true);
            }
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(B)V", line = 68)
    public static final void method1727(byte arg0) {
        class300.field4865.method895(128);
        field4058++;
        class97.field1764.method895(128);
        if (arg0 > -40) {
            field4050 = -121;
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(I)V", line = 86)
    public static final void method1728(int arg0) {
        class345.field5444.method895(128);
        if (arg0 == 0) {
            field4049++;
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(Z)V", line = 103)
    public static final void method1729(boolean arg0) {
        class284.field4641 = 0;
        field4057++;
        class272.field4424 = 0;
        class275.field4492 = arg0;
        class174.field2885 = 0;
        class92.field1637 = 0;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(IBI)V", line = 119)
    public static final void method1730(int arg0, byte arg1, int arg2) {
        int var3 = 88 % ((arg1 + 50) / 59);
        class334.field5322[arg0] = arg2;
        class190 var4 = (class190) class59.field1156.method2344(-1, (long) arg0);
        field4055++;
        if (var4 == null) {
            class190 var5 = new class190(class218.method1520((byte) 44) + 500L);
            class59.field1156.method2337(var5, 709, (long) arg0);
        } else {
            var4.field3220 = class218.method1520((byte) 65) + 500L;
        }
    }

    @OriginalMember(owner = "client!h", name = "b", descriptor = "(B)V", line = 144)
    public static void method1731(byte arg0) {
        if (arg0 < 89) {
            field4050 = -78;
        }
        field4051 = null;
        field4056 = null;
    }
}
