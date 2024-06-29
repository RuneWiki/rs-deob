import java.awt.Font;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hg")
public abstract class class220 {

    @OriginalMember(owner = "client!hg", name = "e", descriptor = "I")
    public static volatile int field3600 = 0;

    @OriginalMember(owner = "client!hg", name = "b", descriptor = "I")
    public int field3597;

    @OriginalMember(owner = "client!hg", name = "d", descriptor = "I")
    public int field3599;

    @OriginalMember(owner = "client!hg", name = "f", descriptor = "I")
    public int field3601;

    @OriginalMember(owner = "client!hg", name = "h", descriptor = "I")
    public int field3603;

    @OriginalMember(owner = "client!hg", name = "i", descriptor = "I")
    public int field3604;

    @OriginalMember(owner = "client!hg", name = "j", descriptor = "I")
    public int field3605;

    @OriginalMember(owner = "client!hg", name = "k", descriptor = "I")
    public static int field3606;

    @OriginalMember(owner = "client!hg", name = "l", descriptor = "I")
    public static int field3607;

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "Lbl;")
    public static class146 field3596;

    @OriginalMember(owner = "client!hg", name = "g", descriptor = "Ldk;")
    public static class251 field3602;

    @OriginalMember(owner = "client!hg", name = "c", descriptor = "Ljava/awt/Font;")
    public static Font field3598;

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(ZZ)V")
    public static final void method1513(boolean arg0, boolean arg1) {
        class55.field905 = 99;
        if (!arg1) {
            field3602 = null;
        }
        class131.field2059 = new int[104];
        class184.field3019 = new int[5];
        byte var2;
        if (arg0) {
            var2 = 1;
        } else {
            var2 = 4;
        }
        class62.field1023 = new int[104];
        class224.field3644 = new byte[var2][105][105];
        class155.field2418 = new int[104];
        class132.field2079 = new int[104];
        class126.field1994 = new int[104];
        class301.field4814 = new byte[var2][104][104];
        field3607++;
        class293.field4703 = new int[var2][105][105];
        class308.field4929 = new byte[var2][104][104];
        class263.field4225 = new byte[var2][104][104];
        class79.field1316 = new byte[var2][104][104];
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(B)V")
    public static void method1514(byte arg0) {
        if (arg0 != 106) {
            field3606 = 127;
        }
        field3596 = null;
        field3598 = null;
        field3602 = null;
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(III)V")
    public abstract void method1515(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(IIIIZ)V")
    public static final void method1516(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        class96.field1548 = arg1;
        class59.field972 = arg2;
        class209.field3307 = arg3;
        class243.field3862 = new class151[arg0][class96.field1548][class59.field972];
        class148.field2320 = new int[arg0][class96.field1548 + 1][class59.field972 + 1];
        if (arg4) {
            class267.field4301 = new class151[1][class96.field1548][class59.field972];
            class245.field3906 = new int[class96.field1548][class59.field972];
            class26.field324 = new int[1][class96.field1548 + 1][class59.field972 + 1];
        } else {
            class267.field4301 = null;
            class245.field3906 = null;
            class26.field324 = null;
        }
        class188.method1344(false);
        class13.field133 = new class229[500];
        class261.field4200 = 0;
        class65.field1085 = new class229[500];
        class49.field814 = 0;
        class123.field1964 = new int[arg0][class96.field1548 + 1][class59.field972 + 1];
        class151.field2343 = new class179[5000];
        class18.field217 = 0;
        class136.field2155 = new class179[100];
        class203.field3245 = new boolean[class209.field3307 + class209.field3307 + 1][class209.field3307 + class209.field3307 + 1];
        client.field4858 = new boolean[class209.field3307 + class209.field3307 + 2][class209.field3307 + class209.field3307 + 2];
        class107.field1702 = new byte[arg0][class96.field1548][class59.field972];
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(II)V")
    public abstract void method1517(int arg0, int arg1);
}
