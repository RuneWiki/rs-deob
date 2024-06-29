import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ak")
public class class301 {

    @OriginalMember(owner = "client!ak", name = "f", descriptor = "Lma;")
    public static class263 field5145 = null;

    @OriginalMember(owner = "client!ak", name = "d", descriptor = "[I")
    public static int[] field5143 = new int[2048];

    @OriginalMember(owner = "client!ak", name = "h", descriptor = "I")
    public static int field5147 = 0;

    @OriginalMember(owner = "client!ak", name = "e", descriptor = "[[S")
    public static short[][] field5144 = new short[][] { { 6554, 115, 10304, 28, 5702, 7756, 5681, 4510, -31835, 22437, 2859, -11339, 16, 5157, 10446, 3658, -27314, -21965, 472, 580, 784, 21966, 28950, -15697, -14002 }, { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486, 24, 5392, 10429, 3673, -27335, -21957, 192, 687, 412, 21821, 28835, -15460, -14019 }, new short[0], new short[0], new short[0] };

    @OriginalMember(owner = "client!ak", name = "g", descriptor = "Ltl;")
    private static class59 field5146 = class85.method639(" has logged in)3", 9588);

    @OriginalMember(owner = "client!ak", name = "c", descriptor = "[I")
    public static int[] field5142 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @OriginalMember(owner = "client!ak", name = "i", descriptor = "Ltl;")
    public static class59 field5148 = field5146;

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "I")
    public static int field5140;

    @OriginalMember(owner = "client!ak", name = "b", descriptor = "I")
    public static int field5141;

    @OriginalMember(owner = "client!ak", name = "j", descriptor = "I")
    public static int field5149;

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(IIIIBI)V", line = 6)
    public static final void method2100(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5) {
        if (arg4 != -73) {
            field5145 = (class263) null;
        }
        if (arg0 <= class62.field957 && arg3 >= class28.field369) {
            boolean var6;
            if (class69.field1061 > arg2) {
                arg2 = class69.field1061;
                var6 = false;
            } else if (arg2 <= class153.field2504) {
                var6 = true;
            } else {
                arg2 = class153.field2504;
                var6 = false;
            }
            boolean var7;
            if (arg5 < class69.field1061) {
                var7 = false;
                arg5 = class69.field1061;
            } else if (class153.field2504 < arg5) {
                var7 = false;
                arg5 = class153.field2504;
            } else {
                var7 = true;
            }
            if (arg0 < class28.field369) {
                arg0 = class28.field369;
            } else {
                class174.method1283(7, arg1, class163.field2662[arg0++], arg2, arg5);
            }
            if (arg3 > class62.field957) {
                arg3 = class62.field957;
            } else {
                class174.method1283(7, arg1, class163.field2662[arg3--], arg2, arg5);
            }
            if (var6 && var7) {
                for (int var8 = arg0; var8 <= arg3; var8++) {
                    int[] var9 = class163.field2662[var8];
                    var9[arg2] = var9[arg5] = arg1;
                }
            } else if (var6) {
                for (int var11 = arg0; var11 <= arg3; var11++) {
                    class163.field2662[var11][arg2] = arg1;
                }
            } else if (var7) {
                for (int var10 = arg0; var10 <= arg3; var10++) {
                    class163.field2662[var10][arg5] = arg1;
                }
            }
        }
        field5149++;
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(Z)V", line = 139)
    public static final void method2101(boolean arg0) {
        field5140++;
        class140.method1019(field5145, (byte) -116);
        class279.field4785++;
        if (class190.field3187 && class17.field217) {
            int var1 = class184.field3079;
            int var2 = var1 - class62.field952;
            if (var2 < class26.field343) {
                var2 = class26.field343;
            }
            int var3 = class254.field4213;
            if ((class26.field343 + class211.field3435.field4467) < (var2 + field5145.field4467)) {
                var2 = class26.field343 + class211.field3435.field4467 - field5145.field4467;
            }
            int var4 = var2 - class308.field5215;
            if (!arg0) {
                field5148 = (class59) null;
            }
            int var5 = var2 - (class26.field343 - class211.field3435.field4504);
            int var6 = field5145.field4493;
            int var7 = var3 - class264.field4555;
            if (var7 < class114.field1842) {
                var7 = class114.field1842;
            }
            if (class114.field1842 + class211.field3435.field4420 < field5145.field4420 + var7) {
                var7 = class114.field1842 + class211.field3435.field4420 - field5145.field4420;
            }
            int var8 = var7 + class211.field3435.field4405 - class114.field1842;
            int var9 = var7 - class93.field1444;
            if (class279.field4785 > field5145.field4523 && (var9 > var6 || -var6 > var9 || var4 > var6 || (-var6) > var4)) {
                class114.field1863 = true;
            }
            if (field5145.field4524 != null && class114.field1863) {
                class128 var10 = new class128();
                var10.field2110 = field5145;
                var10.field2105 = var8;
                var10.field2106 = var5;
                var10.field2103 = field5145.field4524;
                class299.method2093((byte) 120, var10);
            }
            if (class59.field910 == 0) {
                if (class114.field1863) {
                    if (field5145.field4443 != null) {
                        class128 var11 = new class128();
                        var11.field2106 = var5;
                        var11.field2105 = var8;
                        var11.field2104 = class313.field5305;
                        var11.field2110 = field5145;
                        var11.field2103 = field5145.field4443;
                        class299.method2093((byte) 97, var11);
                    }
                    if (class313.field5305 != null && client.method284(field5145) != null) {
                        class137.field2267++;
                        class234.field3888.method1768(true, 181);
                        class234.field3888.method1238(1871071368, field5145.field4500);
                        class234.field3888.method1217(field5145.field4392, (byte) -15);
                        class234.field3888.method1211(class313.field5305.field4392, (byte) -106);
                        class234.field3888.method1238(1871071368, class313.field5305.field4500);
                    }
                } else if ((class281.field4842 == 1 || class157.method1117(class231.field3803 - 1, 1007)) && class231.field3803 > 2) {
                    class133.method972(-32199);
                } else if (class231.field3803 > 0) {
                    class288.method2002(-3);
                }
                field5145 = null;
            }
        } else if (class279.field4785 > 1) {
            field5145 = null;
        }
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(I)V", line = 296)
    public static void method2102(int arg0) {
        field5148 = null;
        field5145 = null;
        field5146 = null;
        field5143 = null;
        if (arg0 == -1) {
            field5144 = (short[][]) null;
            field5142 = null;
        }
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(B)V", line = 332)
    public static final void method2103(byte arg0) {
        field5141++;
        class190.field3182.method1482((byte) 30);
        if (arg0 != 34) {
            method2100(86, 85, -48, -116, (byte) 23, -15);
        }
    }
}
