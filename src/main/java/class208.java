import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ve")
public class class208 {

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "I")
    private int field3753 = 0;

    @OriginalMember(owner = "client!ve", name = "d", descriptor = "Lrj;")
    private class254 field3755;

    @OriginalMember(owner = "client!ve", name = "c", descriptor = "I")
    public static int field3754 = -1;

    @OriginalMember(owner = "client!ve", name = "i", descriptor = "Lke;")
    public static class256 field3760 = class316.method2202(")2", 27626);

    @OriginalMember(owner = "client!ve", name = "k", descriptor = "I")
    public static int field3762 = 0;

    @OriginalMember(owner = "client!ve", name = "g", descriptor = "Lij;")
    public static class175 field3758 = new class175();

    @OriginalMember(owner = "client!ve", name = "n", descriptor = "Lke;")
    private static class256 field3765 = class316.method2202("Starting 3d Library", 27626);

    @OriginalMember(owner = "client!ve", name = "o", descriptor = "Lke;")
    public static class256 field3766 = class316.method2202("Cach-B", 27626);

    @OriginalMember(owner = "client!ve", name = "m", descriptor = "Lke;")
    public static class256 field3764 = field3765;

    @OriginalMember(owner = "client!ve", name = "r", descriptor = "[I")
    public static int[] field3769 = new int[2];

    @OriginalMember(owner = "client!ve", name = "p", descriptor = "I")
    public static int field3767 = 0;

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "I")
    public static int field3752;

    @OriginalMember(owner = "client!ve", name = "e", descriptor = "I")
    public static int field3756;

    @OriginalMember(owner = "client!ve", name = "f", descriptor = "I")
    public static int field3757;

    @OriginalMember(owner = "client!ve", name = "h", descriptor = "I")
    public static int field3759;

    @OriginalMember(owner = "client!ve", name = "j", descriptor = "I")
    public static int field3761;

    @OriginalMember(owner = "client!ve", name = "l", descriptor = "I")
    public static int field3763;

    @OriginalMember(owner = "client!ve", name = "q", descriptor = "Lsg;")
    private class163 field3768;

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(I)Lsg;", line = 6)
    public final class163 method1469(int arg0) {
        if (arg0 != 6956) {
            this.field3755 = (class254) null;
        }
        this.field3753 = 0;
        field3752++;
        return this.method1473((byte) 14);
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(B)V", line = 31)
    public static final void method1470(byte arg0) {
        field3763++;
        if (arg0 >= -15) {
            field3754 = -93;
        }
        for (class316 var1 = (class316) class62.field1098.method1743(true); var1 != null; var1 = (class316) class62.field1098.method1742((byte) 30)) {
            int var2 = var1.field5453;
            if (class298.method2087(var2, 20330)) {
                boolean var3 = true;
                class188[] var4 = class50.field921[var2];
                for (int var5 = 0; var5 < var4.length; var5++) {
                    if (var4[var5] != null) {
                        var3 = var4[var5].field3396;
                        break;
                    }
                }
                if (!var3) {
                    int var6 = (int) var1.field2895;
                    class188 var7 = class182.method1335((byte) 86, var6);
                    if (var7 != null) {
                        class64.method500(var7, (byte) -117);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "(I)V", line = 91)
    public static void method1471(int arg0) {
        field3760 = null;
        field3769 = null;
        field3758 = null;
        field3766 = null;
        if (arg0 == 27351) {
            field3765 = null;
            field3764 = null;
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(II)Z", line = 107)
    public static final boolean method1472(int arg0, int arg1) {
        field3761++;
        if (arg1 < 0) {
            return false;
        }
        int var2 = class303.field5243[arg1];
        if (var2 >= 2000) {
            var2 -= 2000;
        }
        if (var2 == 1004) {
            return true;
        } else {
            return arg0 != -1;
        }
    }

    @OriginalMember(owner = "client!ve", name = "<init>", descriptor = "(Lrj;)V", line = 199)
    public class208(class254 arg0) {
        this.field3755 = arg0;
    }

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "(B)Lsg;", line = 136)
    public final class163 method1473(byte arg0) {
        if (arg0 != 14) {
            return (class163) null;
        }
        field3757++;
        if (this.field3753 > 0 && this.field3755.field4336[this.field3753 - 1] != this.field3768) {
            class163 var2 = this.field3768;
            this.field3768 = var2.field2893;
            return var2;
        }
        class163 var3;
        do {
            if (this.field3755.field4347 <= this.field3753) {
                return null;
            }
            var3 = this.field3755.field4336[this.field3753++].field2893;
        } while (this.field3755.field4336[this.field3753 - 1] == var3);
        this.field3768 = var3.field2893;
        return var3;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(ILng;)V", line = 187)
    public static final void method1474(int arg0, class138 arg1) {
        if (arg0 == 2000) {
            class193.field3525 = arg1.method1006((byte) 104, class160.field2851);
            field3756++;
        }
    }
}
