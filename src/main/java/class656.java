import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pb")
public class class656 {

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "I")
    public static int field8674;

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "I")
    public static int field8675;

    @OriginalMember(owner = "client!pb", name = "c", descriptor = "I")
    public static int field8676;

    @OriginalMember(owner = "client!pb", name = "e", descriptor = "I")
    public static int field8678;

    @OriginalMember(owner = "client!pb", name = "g", descriptor = "J")
    public long field8680;

    @OriginalMember(owner = "client!pb", name = "d", descriptor = "Lpb;")
    public class656 field8677;

    @OriginalMember(owner = "client!pb", name = "h", descriptor = "Lpb;")
    public class656 field8681;

    @OriginalMember(owner = "client!pb", name = "f", descriptor = "[I")
    public static int[] field8679;

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(Ljava/lang/String;IZ)V", line = 5)
    public static final void method3563(String arg0, int arg1, boolean arg2) {
        field8676++;
        if (arg0 == null) {
            return;
        }
        if (class543.field7184 >= 100) {
            class178.method1234(4, 31663, class517.field6879.method2877(class713.field9854, (byte) -108));
            return;
        }
        String var3 = class496.method2797(arg0, true);
        if (var3 == null) {
            return;
        }
        int var4 = 0;
        if (arg1 <= 81) {
            method3563(null, 126, false);
        }
        while (class543.field7184 > var4) {
            String var9 = class496.method2797(class756.field10526[var4], true);
            if (var9 != null && var9.equals(var3)) {
                class178.method1234(4, 31663, arg0 + class517.field6880.method2877(class713.field9854, (byte) -108));
                return;
            }
            if (class13.field202[var4] != null) {
                String var10 = class496.method2797(class13.field202[var4], true);
                if (var10 != null && var10.equals(var3)) {
                    class178.method1234(4, 31663, arg0 + class517.field6880.method2877(class713.field9854, (byte) -108));
                    return;
                }
            }
            var4++;
        }
        for (int var5 = 0; var5 < client.field4355; var5++) {
            String var7 = class496.method2797(class549.field7252[var5], true);
            if (var7 != null && var7.equals(var3)) {
                class178.method1234(4, 31663, class517.field6885.method2877(class713.field9854, (byte) -108) + arg0 + class517.field6886.method2877(class713.field9854, (byte) -108));
                return;
            }
            if (class238.field3361[var5] != null) {
                String var8 = class496.method2797(class238.field3361[var5], true);
                if (var8 != null && var8.equals(var3)) {
                    class178.method1234(4, 31663, class517.field6885.method2877(class713.field9854, (byte) -108) + arg0 + class517.field6886.method2877(class713.field9854, (byte) -108));
                    return;
                }
            }
        }
        if (class496.method2797(class472.field6475.field5334, true).equals(var3)) {
            class178.method1234(4, 31663, class517.field6882.method2877(class713.field9854, (byte) -108));
            return;
        }
        class508.field6779++;
        class583 var6 = class381.method2246(1, class128.field2105, class397.field5532);
        var6.field7637.method3823(-35, class419.method2429(true, arg0) + 1);
        var6.field7637.method3795(arg0, (byte) -103);
        var6.field7637.method3823(-126, arg2 ? 1 : 0);
        class42.method309(var6, 0);
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(Z)V", line = 107)
    public final void method3564(boolean arg0) {
        field8678++;
        if (this.field8681 == null) {
            return;
        }
        this.field8681.field8677 = this.field8677;
        this.field8677.field8681 = this.field8681;
        if (arg0) {
            this.field8677 = null;
            this.field8681 = null;
        }
    }

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "(Z)V", line = 125)
    public static void method3565(boolean arg0) {
        if (!arg0) {
            method3567(55, false);
        }
        field8679 = null;
    }

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "(B)Z", line = 135)
    public final boolean method3566(byte arg0) {
        if (arg0 == 78) {
            field8674++;
            return this.field8681 != null;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(IZ)V", line = 150)
    public static final void method3567(int arg0, boolean arg1) {
        class411.field5711.method1677(class411.field5711.field3908, (byte) -71, 0);
        field8675++;
        class411.field5711.method1677(class411.field5711.field3890, (byte) -71, 0);
        class411.field5711.method1677(class411.field5711.field3882, (byte) -71, 1);
        class411.field5711.method1677(class411.field5711.field3888, (byte) -71, 1);
        class411.field5711.method1677(class411.field5711.field3904, (byte) -71, 0);
        class411.field5711.method1677(class411.field5711.field3884, (byte) -71, 0);
        class411.field5711.method1677(class411.field5711.field3900, (byte) -71, 0);
        class411.field5711.method1677(class411.field5711.field3879, (byte) -71, 0);
        class411.field5711.method1677(class411.field5711.field3869, (byte) -71, 0);
        class411.field5711.method1677(class411.field5711.field3918, (byte) -71, 0);
        class411.field5711.method1677(class411.field5711.field3897, (byte) -71, 0);
        class411.field5711.method1677(class411.field5711.field3868, (byte) -71, 0);
        class411.field5711.method1677(class411.field5711.field3902, (byte) -71, 0);
        class411.field5711.method1677(class411.field5711.field3915, (byte) -71, 0);
        class411.field5711.method1677(class411.field5711.field3895, (byte) -71, 0);
        class411.field5711.method1677(class411.field5711.field3912, (byte) -71, 0);
        class411.field5711.method1677(class411.field5711.field3911, (byte) -71, 0);
        class411.field5711.method1677(class411.field5711.field3891, (byte) -71, 0);
        class411.field5711.method1677(class411.field5711.field3876, (byte) -71, 0);
        class371.method2179(8583);
        class411.field5711.method1677(class411.field5711.field3874, (byte) -71, 2);
        class411.field5711.method1677(class411.field5711.field3903, (byte) -71, arg0);
        class505.method2837((byte) 126);
        class320.method1940(arg0);
        class50.field641 = true;
    }
}
