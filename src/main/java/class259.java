import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!d")
public class class259 extends class134 {

    @OriginalMember(owner = "client!d", name = "o", descriptor = "I")
    public int field4252;

    @OriginalMember(owner = "client!d", name = "p", descriptor = "I")
    public int field4253;

    @OriginalMember(owner = "client!d", name = "s", descriptor = "[I")
    public static int[] field4256 = new int[128];

    @OriginalMember(owner = "client!d", name = "r", descriptor = "I")
    public static int field4255 = 0;

    @OriginalMember(owner = "client!d", name = "m", descriptor = "I")
    public static int field4250;

    @OriginalMember(owner = "client!d", name = "n", descriptor = "I")
    public static int field4251;

    @OriginalMember(owner = "client!d", name = "t", descriptor = "I")
    public static int field4257;

    @OriginalMember(owner = "client!d", name = "u", descriptor = "I")
    public static int field4258;

    @OriginalMember(owner = "client!d", name = "q", descriptor = "Lgj;")
    public static class255 field4254;

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(B)V")
    public static final void method1799(byte arg0) {
        field4257++;
        class9.field106.method144(arg0 - 45);
        if (arg0 != 45) {
            method1802(-82, (byte) -105);
        }
    }

    @OriginalMember(owner = "client!d", name = "b", descriptor = "(B)V")
    public static final void method1800(byte arg0) {
        if (arg0 != -62) {
            field4255 = 3;
        }
        field4258++;
        class111.field1696.method144(arg0 + 62);
        class6.field54.method144(0);
    }

    @OriginalMember(owner = "client!d", name = "<init>", descriptor = "(II)V")
    public class259(int arg0, int arg1) {
        this.field4252 = arg0;
        this.field4253 = arg1;
    }

    @OriginalMember(owner = "client!d", name = "d", descriptor = "(I)V")
    public static void method1801(int arg0) {
        int var1 = 42 % ((-arg0 - 61) / 49);
        field4254 = null;
        field4256 = null;
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(IB)V")
    public static final void method1802(int arg0, byte arg1) {
        field4250++;
        if (arg0 == 0) {
            return;
        }
        if (arg0 == 1) {
            class268.method1844(1);
        } else if (arg0 == 2) {
            class224.method1561((byte) -31);
        } else if (arg0 == 3) {
            class76.method499(0);
        } else {
            throw new RuntimeException();
        }
        if (arg1 < 89) {
            field4251 = -53;
        }
    }
}
