import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mg")
public class class287 extends class137 {

    @OriginalMember(owner = "client!mg", name = "q", descriptor = "Ljava/lang/String;")
    public String field4646;

    @OriginalMember(owner = "client!mg", name = "n", descriptor = "Ljava/lang/String;")
    public static String field4643 = "Please remove ";

    @OriginalMember(owner = "client!mg", name = "k", descriptor = "I")
    public static int field4640 = 0;

    @OriginalMember(owner = "client!mg", name = "m", descriptor = "I")
    public static int field4642;

    @OriginalMember(owner = "client!mg", name = "o", descriptor = "I")
    public static int field4644;

    @OriginalMember(owner = "client!mg", name = "p", descriptor = "I")
    public static int field4645;

    @OriginalMember(owner = "client!mg", name = "l", descriptor = "Lag;")
    public static class197 field4641;

    @OriginalMember(owner = "client!mg", name = "b", descriptor = "(B)V")
    public static void method1948(byte arg0) {
        if (arg0 != 100) {
            field4641 = null;
        }
        field4641 = null;
        field4643 = null;
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(ILgi;)V")
    public static final void method1949(int arg0, class164 arg1) {
        if (arg0 != 0) {
            method1948((byte) 15);
        }
        field4642++;
        class82.field1329 = arg1;
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(IIIIZ)V")
    public static final void method1950(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        class95.field1504 = arg1;
        class200.field3208 = arg2;
        class210.field3346 = arg3;
        class48.field710 = new class116[arg0][class95.field1504][class200.field3208];
        class300.field4915 = new int[arg0][class95.field1504 + 1][class200.field3208 + 1];
        if (arg4) {
            class111.field1711 = new class116[1][class95.field1504][class200.field3208];
            class120.field1905 = new int[class95.field1504][class200.field3208];
            class199.field3192 = new int[1][class95.field1504 + 1][class200.field3208 + 1];
        } else {
            class111.field1711 = null;
            class120.field1905 = null;
            class199.field3192 = null;
        }
        class294.method2020(false);
        class248.field3935 = new class52[500];
        class28.field512 = 0;
        class91.field1457 = new class52[500];
        class11.field213 = 0;
        class55.field798 = new int[arg0][class95.field1504 + 1][class200.field3208 + 1];
        class68.field1093 = new class90[5000];
        class198.field3188 = 0;
        class119.field1872 = new class90[100];
        class306.field4970 = new boolean[class210.field3346 + class210.field3346 + 1][class210.field3346 + class210.field3346 + 1];
        class225.field3541 = new boolean[class210.field3346 + class210.field3346 + 2][class210.field3346 + class210.field3346 + 2];
        class54.field789 = new byte[arg0][class95.field1504][class200.field3208];
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(BLgi;Lgi;)V")
    public static final void method1951(byte arg0, class164 arg1, class164 arg2) {
        class243.field3844 = arg2;
        class156.field2502 = arg1;
        field4644++;
        if (arg0 > -88) {
            field4640 = 64;
        }
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(III)V")
    public static final void method1952(int arg0, int arg1, int arg2) {
        field4645++;
        class291 var3 = class61.method389(arg1, arg0, arg0 - 7);
        var3.method2009(-105);
        var3.field4763 = arg2;
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(II)I")
    public static final int method1953(int arg0, int arg1) {
        int var2 = (arg0 & 0x7F) * arg1 >> 7;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 126) {
            var2 = 126;
        }
        return (arg0 & 0xFF80) + var2;
    }

    @OriginalMember(owner = "client!mg", name = "<init>", descriptor = "()V")
    public class287() {
    }

    @OriginalMember(owner = "client!mg", name = "<init>", descriptor = "(Ljava/lang/String;)V")
    public class287(String arg0) {
        this.field4646 = arg0;
    }
}
