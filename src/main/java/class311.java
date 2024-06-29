import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ed")
public class class311 {

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "J")
    public long field4720 = 0L;

    @OriginalMember(owner = "client!ed", name = "g", descriptor = "I")
    public static int field4725 = 0;

    @OriginalMember(owner = "client!ed", name = "r", descriptor = "I")
    public static int field4736 = 99;

    @OriginalMember(owner = "client!ed", name = "t", descriptor = "Ljava/lang/String;")
    public static String field4738 = "Loading config - ";

    @OriginalMember(owner = "client!ed", name = "m", descriptor = "I")
    public static int field4731 = 0;

    @OriginalMember(owner = "client!ed", name = "n", descriptor = "Lhb;")
    public static class318 field4732 = new class318(500);

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "I")
    public static int field4719;

    @OriginalMember(owner = "client!ed", name = "c", descriptor = "I")
    public int field4721;

    @OriginalMember(owner = "client!ed", name = "d", descriptor = "I")
    public int field4722;

    @OriginalMember(owner = "client!ed", name = "e", descriptor = "I")
    public int field4723;

    @OriginalMember(owner = "client!ed", name = "f", descriptor = "I")
    public int field4724;

    @OriginalMember(owner = "client!ed", name = "h", descriptor = "I")
    public int field4726;

    @OriginalMember(owner = "client!ed", name = "i", descriptor = "I")
    public int field4727;

    @OriginalMember(owner = "client!ed", name = "l", descriptor = "I")
    public int field4730;

    @OriginalMember(owner = "client!ed", name = "p", descriptor = "I")
    public static int field4734;

    @OriginalMember(owner = "client!ed", name = "q", descriptor = "I")
    public int field4735;

    @OriginalMember(owner = "client!ed", name = "s", descriptor = "I")
    public int field4737;

    @OriginalMember(owner = "client!ed", name = "u", descriptor = "I")
    public int field4739;

    @OriginalMember(owner = "client!ed", name = "v", descriptor = "I")
    public static int field4740;

    @OriginalMember(owner = "client!ed", name = "w", descriptor = "I")
    public static int field4741;

    @OriginalMember(owner = "client!ed", name = "x", descriptor = "I")
    public int field4742;

    @OriginalMember(owner = "client!ed", name = "k", descriptor = "Llm;")
    public static class210 field4729;

    @OriginalMember(owner = "client!ed", name = "j", descriptor = "Lmd;")
    public class233 field4728;

    @OriginalMember(owner = "client!ed", name = "o", descriptor = "Ljava/lang/String;")
    public static String field4733;

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(Lcm;B)V", line = 5)
    public static final void method2150(class319 arg0, byte arg1) {
        field4741++;
        if (arg0.field4810 != null) {
            arg0.field4810.field826 = 0;
        }
        arg0.field4809 = false;
        class319 var2 = arg0.method1521();
        if (arg1 == 96) {
            while (var2 != null) {
                method2150(var2, (byte) 96);
                var2 = arg0.method1543();
            }
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(B)V", line = 45)
    public static void method2151(byte arg0) {
        field4729 = null;
        if (arg0 != 115) {
            method2151((byte) 115);
        }
        field4733 = null;
        field4738 = null;
        field4732 = null;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(IBI)V", line = 70)
    public static final void method2152(int arg0, byte arg1, int arg2) {
        field4740++;
        int var3 = arg0;
        if (arg0 > 25) {
            var3 = 25;
        }
        arg0--;
        int var4 = class97.field1462[arg0];
        int var5 = class93.field1399[arg0];
        if (arg2 == 0) {
            class257.field3893++;
            class234.field3507.method28(244, false);
            class234.field3507.method1813(117, var3 + var3 + 3);
        }
        if (arg2 == 1) {
            class240.field3572++;
            class234.field3507.method28(146, false);
            class234.field3507.method1813(27, var3 + var3 + 3 + 14);
        }
        if (arg2 == 2) {
            class234.field3507.method28(156, false);
            class291.field4438++;
            class234.field3507.method1813(-127, var3 + var3 + 3);
        }
        class234.field3507.method1823(class217.field3309 + var4, (byte) -34);
        class234.field3507.method1842(true, class120.field1879[82] ? 1 : 0);
        if (arg1 < 26) {
            return;
        }
        class253.field3844 = class97.field1462[0];
        class283.field4288 = class93.field1399[0];
        for (int var6 = 1; var6 < var3; var6++) {
            arg0--;
            class234.field3507.method1843(-1, class97.field1462[arg0] - var4);
            class234.field3507.method1839(class93.field1399[arg0] - var5, 123);
        }
        class234.field3507.method1817(true, class189.field2807 + var5);
    }
}
