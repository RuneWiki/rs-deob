import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rh")
public class class26 {

    @OriginalMember(owner = "client!rh", name = "c", descriptor = "I")
    public static int field458 = 0;

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "I")
    public static int field456;

    @OriginalMember(owner = "client!rh", name = "b", descriptor = "I")
    public static int field457;

    @OriginalMember(owner = "client!rh", name = "d", descriptor = "I")
    public static int field459;

    @OriginalMember(owner = "client!rh", name = "e", descriptor = "I")
    public static int field460;

    @OriginalMember(owner = "client!rh", name = "f", descriptor = "I")
    public static int field461;

    @OriginalMember(owner = "client!rh", name = "g", descriptor = "I")
    public static int field462;

    @OriginalMember(owner = "client!rh", name = "h", descriptor = "Laj;")
    public static class151 field463;

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(BILuf;)V")
    public static final void method166(byte arg0, int arg1, class46 arg2) {
        int var3 = -97 % ((-arg0 - 15) / 52);
        field460++;
        if (arg2.field765 > class275.field4598) {
            class146.method1079(arg2, (byte) 119);
        } else if (class275.field4598 > arg2.field708) {
            class296.method2040(arg2, 1304);
        } else {
            class73.method519(0, arg2);
        }
        if (arg2.field715 < 128 || arg2.field771 < 128 || arg2.field715 >= 13184 || arg2.field771 >= 13184) {
            arg2.field765 = 0;
            arg2.field708 = 0;
            arg2.field757 = -1;
            arg2.field761 = -1;
            arg2.field715 = arg2.field711[0] * 128 + arg2.method294((byte) -118) * 64;
            arg2.field771 = arg2.field717[0] * 128 + (arg2.method294((byte) -116) * 64);
            arg2.method283((byte) 78);
        }
        if (class16.field314 == arg2 && (arg2.field715 < 1536 || arg2.field771 < 1536 || arg2.field715 >= 11776 || arg2.field771 >= 11776)) {
            arg2.field761 = -1;
            arg2.field765 = 0;
            arg2.field757 = -1;
            arg2.field708 = 0;
            arg2.field715 = arg2.field711[0] * 128 + arg2.method294((byte) -107) * 64;
            arg2.field771 = arg2.field717[0] * 128 + arg2.method294((byte) -109) * 64;
            arg2.method283((byte) 61);
        }
        class70.method482(2, arg2);
        class255.method1841(arg2, 1);
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(I)V")
    public static void method167(int arg0) {
        if (arg0 != 0) {
            field456 = 21;
        }
        field463 = null;
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(Lhg;IZ)V")
    public static final void method168(class207 arg0, int arg1, boolean arg2) {
        field461++;
        int var3 = arg0.field3416 == arg1 ? arg0.field3484 : arg0.field3416;
        int var4 = arg0.field3344 == 0 ? arg0.field3481 : arg0.field3344;
        class3.method30(-58, arg2, var3, class208.field3515[arg0.field3405 >> 16], arg0.field3405, var4);
        if (arg0.field3462 != null) {
            class3.method30(arg1 ^ 0x78, arg2, var3, arg0.field3462, arg0.field3405, var4);
        }
        class278 var5 = (class278) class306.field4952.method987(-106, (long) arg0.field3405);
        if (var5 != null) {
            class271.method1912(arg2, var4, 2, var5.field4622, var3);
        }
    }

    @OriginalMember(owner = "client!rh", name = "b", descriptor = "(I)V")
    public static final void method169(int arg0) {
        field459++;
        for (class76 var1 = (class76) class258.field4343.method309(0); var1 != null; var1 = (class76) class258.field4343.method312((byte) -112)) {
            class226 var3 = var1.field1294;
            if (class182.field2898 != var3.field3832 || class275.field4598 > var3.field3817) {
                var1.method993(32);
            } else if (class275.field4598 >= var3.field3810) {
                if (var3.field3809 > 0) {
                    class307 var4 = class57.field1002[var3.field3809 - 1];
                    if (var4 != null && var4.field715 >= 0 && var4.field715 < 13312 && var4.field771 >= 0 && var4.field771 < 13312) {
                        var3.method1602((byte) -122, var4.field771, var4.field715, class275.field4598, class277.method1939(var3.field3832, var4.field715, var4.field771, (byte) -34) - var3.field3801);
                    }
                }
                if (var3.field3809 < 0) {
                    int var5 = -var3.field3809 - 1;
                    class123 var6;
                    if (class297.field4860 == var5) {
                        var6 = class16.field314;
                    } else {
                        var6 = class15.field300[var5];
                    }
                    if (var6 != null && var6.field715 >= 0 && var6.field715 < 13312 && var6.field771 >= 0 && var6.field771 < 13312) {
                        var3.method1602((byte) -111, var6.field771, var6.field715, class275.field4598, class277.method1939(var3.field3832, var6.field715, var6.field771, (byte) -34) - var3.field3801);
                    }
                }
                var3.method1601(0, class19.field356);
                class115.method885(class182.field2898, (int) var3.field3819, (int) var3.field3818, (int) var3.field3798, 60, var3, var3.field3835, -1L, false);
            }
        }
        int var2 = 125 / ((arg0 - 92) / 34);
    }

    @OriginalMember(owner = "client!rh", name = "c", descriptor = "(I)V")
    public static final void method170(int arg0) {
        if (class109.field1791 != null) {
            class214 var1 = class109.field1791;
            synchronized (class109.field1791) {
                class109.field1791 = null;
            }
        }
        if (arg0 != 0) {
            field458 = 90;
        }
        field457++;
    }
}
