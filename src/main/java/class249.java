import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mn")
public class class249 {

    @OriginalMember(owner = "client!mn", name = "g", descriptor = "Loe;")
    private class137 field3887;

    @OriginalMember(owner = "client!mn", name = "c", descriptor = "Ljava/lang/String;")
    public static String field3883 = "";

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "I")
    public static int field3881;

    @OriginalMember(owner = "client!mn", name = "b", descriptor = "I")
    public static int field3882;

    @OriginalMember(owner = "client!mn", name = "d", descriptor = "I")
    public static int field3884;

    @OriginalMember(owner = "client!mn", name = "e", descriptor = "I")
    public static int field3885;

    @OriginalMember(owner = "client!mn", name = "h", descriptor = "I")
    public static int field3888;

    @OriginalMember(owner = "client!mn", name = "f", descriptor = "Lcf;")
    private class431 field3886;

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(I)V", line = 3)
    public static final void method1678(int arg0) {
        class282.method1834(class193.field3258.field7235, 4);
        field3881++;
        int var1 = (class412.field6180 >> 10) + (class390.field5842 >> 3);
        int var2 = (class71.field1024 >> 10) + (class176.field2613 >> 3);
        class154.field2286 = class398.field5947.field5826 = 0;
        class398.field5947.method1184(true, 8, 8);
        byte var3 = 18;
        class349.field5163 = new byte[var3][];
        class464.field6723 = new int[var3];
        class505.field7380 = new int[var3];
        class487.field7011 = new int[var3][4];
        class71.field1021 = new int[var3];
        int var4 = 111 / ((arg0 - 12) / 52);
        class286.field4337 = new byte[var3][];
        class155.field2311 = new byte[var3][];
        class258.field3971 = new int[var3];
        class147.field2229 = new int[var3];
        class60.field719 = new byte[var3][];
        class301.field4569 = new byte[var3][];
        class485.field6975 = new int[var3];
        int var5 = 0;
        for (int var6 = (var1 - (class69.field976 >> 4)) / 8; var6 <= ((class69.field976 >> 4) + var1) / 8; var6++) {
            for (int var9 = (var2 - (class285.field4328 >> 4)) / 8; var9 <= (((class285.field4328 >> 4) + var2) / 8); var9++) {
                int var10 = (var6 << 8) + var9;
                class505.field7380[var5] = var10;
                class464.field6723[var5] = class430.field6378.method2537("m" + var6 + "_" + var9, -97);
                class485.field6975[var5] = class430.field6378.method2537("l" + var6 + "_" + var9, -64);
                class71.field1021[var5] = class430.field6378.method2537("n" + var6 + "_" + var9, -75);
                class258.field3971[var5] = class430.field6378.method2537("um" + var6 + "_" + var9, 94);
                class147.field2229[var5] = class430.field6378.method2537("ul" + var6 + "_" + var9, -79);
                if (class71.field1021[var5] == -1) {
                    class464.field6723[var5] = -1;
                    class485.field6975[var5] = -1;
                    class258.field3971[var5] = -1;
                    class147.field2229[var5] = -1;
                }
                var5++;
            }
        }
        for (int var7 = var5; var7 < class71.field1021.length; var7++) {
            class71.field1021[var7] = -1;
            class464.field6723[var7] = -1;
            class485.field6975[var7] = -1;
            class258.field3971[var7] = -1;
            class147.field2229[var7] = -1;
        }
        byte var8;
        if (class429.field6373 == 1 || class429.field6373 == 2) {
            var8 = 3;
        } else {
            var8 = 7;
        }
        class366.method2290(var1, false, var2, var8, 8);
    }

    @OriginalMember(owner = "client!mn", name = "b", descriptor = "(I)Lcf;", line = 89)
    public final class431 method1679(int arg0) {
        field3888++;
        class431 var2 = this.field3887.field2077.field6384;
        int var3 = -40 / ((-arg0 - 54) / 52);
        if (this.field3887.field2077 == var2) {
            this.field3886 = null;
            return null;
        } else {
            this.field3886 = var2.field6384;
            return var2;
        }
    }

    @OriginalMember(owner = "client!mn", name = "c", descriptor = "(I)V", line = 110)
    public static final void method1680(int arg0) {
        class74.method640(arg0 ^ 0xFFFF869A, class358.field5315);
        if (arg0 == 2783) {
            class460.field6694++;
            field3885++;
            class71.field1020.method1542(class483.field6955, -2756);
        }
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(BLoe;)V", line = 125)
    public final void method1681(byte arg0, class137 arg1) {
        this.field3887 = arg1;
        int var3 = -53 % ((-arg0 - 52) / 54);
        field3884++;
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(B)Lcf;", line = 136)
    public final class431 method1682(byte arg0) {
        if (arg0 >= -20) {
            return null;
        }
        field3882++;
        class431 var2 = this.field3886;
        if (this.field3887.field2077 == var2) {
            this.field3886 = null;
            return null;
        } else {
            this.field3886 = var2.field6384;
            return var2;
        }
    }

    @OriginalMember(owner = "client!mn", name = "d", descriptor = "(I)V", line = 158)
    public static void method1683(int arg0) {
        if (arg0 == -8009) {
            field3883 = null;
        }
    }

    @OriginalMember(owner = "client!mn", name = "<init>", descriptor = "()V", line = 175)
    public class249() {
    }

    @OriginalMember(owner = "client!mn", name = "<init>", descriptor = "(Loe;)V", line = 178)
    public class249(class137 arg0) {
        this.field3887 = arg0;
    }
}
