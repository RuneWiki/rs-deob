import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!en")
public class class68 extends class160 {

    @OriginalMember(owner = "client!en", name = "u", descriptor = "Lsm;")
    public static class249 field1005 = new class249();

    @OriginalMember(owner = "client!en", name = "q", descriptor = "I")
    public static int field1001;

    @OriginalMember(owner = "client!en", name = "r", descriptor = "I")
    public static int field1002;

    @OriginalMember(owner = "client!en", name = "s", descriptor = "I")
    public static int field1003;

    @OriginalMember(owner = "client!en", name = "t", descriptor = "I")
    public static int field1004;

    @OriginalMember(owner = "client!en", name = "w", descriptor = "Lqb;")
    public static class159 field1007;

    @OriginalMember(owner = "client!en", name = "v", descriptor = "[Laq;")
    public static class385[] field1006;

    @OriginalMember(owner = "client!en", name = "c", descriptor = "(I)V", line = 3)
    public static void method479(int arg0) {
        if (arg0 != 22884) {
            field1006 = null;
        }
        field1006 = null;
        field1007 = null;
        field1005 = null;
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(B)V", line = 31)
    public static final void method480(byte arg0) {
        field1002++;
        if (arg0 != 43) {
            return;
        }
        for (class106 var1 = (class106) class250.field3514.method1544(-88); var1 != null; var1 = (class106) class250.field3514.method1546((byte) -42)) {
            if (class10.method98(var1.field1517, arg0 - 57)) {
                class325.method1954(var1, true);
            }
        }
        if (class161.field2310 == 1) {
            class351.field4800 = false;
            class189.method1222(class183.field2661, class393.field5531, arg0 ^ 0xFFFFD683, class214.field3036, class23.field405);
            return;
        }
        class189.method1222(class183.field2661, class393.field5531, -10584, class214.field3036, class23.field405);
        int var2 = class328.field4531.method522(-10, class180.field2614.method695(-114, class487.field6867));
        for (class106 var3 = (class106) class250.field3514.method1544(-125); var3 != null; var3 = (class106) class250.field3514.method1546((byte) -42)) {
            int var4 = class431.method2523(var3, arg0 + 66);
            if (var2 < var4) {
                var2 = var4;
            }
        }
        class183.field2661 = class161.field2310 * 16 + (class490.field6921 ? 26 : 22);
        class23.field405 = var2 + 8;
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(II)V", line = 79)
    public static final void method481(int arg0, int arg1) {
        class3.field29 = 100;
        class446.field6163 = arg1;
        class175.field2588 = 3;
        if (arg0 != 21216) {
            method479(-119);
        }
        field1003++;
        class283.field3887 = -1;
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(Z)V", line = 104)
    public static final void method482(boolean arg0) {
        field1004++;
        for (class314 var1 = (class314) field1005.method1544(-99); var1 != null; var1 = (class314) field1005.method1546((byte) -42)) {
            class288 var2 = var1.field4257;
            if (class76.field1161 != var2.field6766 || class356.field4972 > var2.field3949) {
                var1.method1182(28818);
                var2.method1773(255);
            } else if (class356.field4972 >= var2.field3917) {
                if (var2.field3943 > 0) {
                    class196 var3 = class256.field3581[var2.field3943 - 1];
                    if (var3 != null && var3.field6765 >= 0 && class200.field2875 * 128 > var3.field6765 && var3.field6746 >= 0 && var3.field6746 < class422.field5811 * 128) {
                        var2.method1777(var3.field6765, var3.field6746, true, class418.method2441(var3.field6746, var2.field6766, var3.field6765, -16778) - var2.field3948, class356.field4972);
                    }
                }
                if (var2.field3943 < 0) {
                    int var4 = -var2.field3943 - 1;
                    class23 var5;
                    if (class327.field4523 == var4) {
                        var5 = class2.field21;
                    } else {
                        var5 = class310.field4235[var4];
                    }
                    if (var5 != null && var5.field6765 >= 0 && var5.field6765 < class200.field2875 * 128 && var5.field6746 >= 0 && (class422.field5811 * 128) > var5.field6746) {
                        var2.method1777(var5.field6765, var5.field6746, true, class418.method2441(var5.field6746, var2.field6766, var5.field6765, -16778) - var2.field3948, class356.field4972);
                    }
                }
                var2.method1774(-114, class42.field717);
                class249.method1542(var2, true);
            }
        }
        if (!arg0) {
            field1005 = null;
        }
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(IBI)I", line = 166)
    public static final int method483(int arg0, byte arg1, int arg2) {
        if (arg1 >= -33) {
            return -67;
        }
        field1001++;
        int var3 = 1;
        while (arg2 > 1) {
            if ((arg2 & 0x1) != 0) {
                var3 = arg0 * var3;
            }
            arg0 *= arg0;
            arg2 >>= 0x1;
        }
        if (arg2 == 1) {
            return arg0 * var3;
        } else {
            return var3;
        }
    }
}
