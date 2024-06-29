import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ij")
public class class258 extends class112 {

    @OriginalMember(owner = "client!ij", name = "z", descriptor = "Z")
    public static boolean field4095 = false;

    @OriginalMember(owner = "client!ij", name = "D", descriptor = "Ljava/lang/String;")
    public static String field4099 = "purple:";

    @OriginalMember(owner = "client!ij", name = "L", descriptor = "Ljava/util/Random;")
    public static Random field4107 = new Random();

    @OriginalMember(owner = "client!ij", name = "T", descriptor = "I")
    public static int field4114 = 0;

    @OriginalMember(owner = "client!ij", name = "U", descriptor = "I")
    public static int field4115 = 0;

    @OriginalMember(owner = "client!ij", name = "A", descriptor = "I")
    public static int field4096;

    @OriginalMember(owner = "client!ij", name = "B", descriptor = "I")
    public static int field4097;

    @OriginalMember(owner = "client!ij", name = "C", descriptor = "I")
    public static int field4098;

    @OriginalMember(owner = "client!ij", name = "I", descriptor = "I")
    public static int field4104;

    @OriginalMember(owner = "client!ij", name = "J", descriptor = "I")
    public static int field4105;

    @OriginalMember(owner = "client!ij", name = "K", descriptor = "I")
    public static int field4106;

    @OriginalMember(owner = "client!ij", name = "M", descriptor = "I")
    public static int field4108;

    @OriginalMember(owner = "client!ij", name = "O", descriptor = "I")
    public static int field4109;

    @OriginalMember(owner = "client!ij", name = "P", descriptor = "I")
    public static int field4110;

    @OriginalMember(owner = "client!ij", name = "S", descriptor = "Lph;")
    public static class203 field4113;

    @OriginalMember(owner = "client!ij", name = "Q", descriptor = "Ljava/lang/String;")
    public String field4111;

    @OriginalMember(owner = "client!ij", name = "G", descriptor = "[C")
    public char[] field4102;

    @OriginalMember(owner = "client!ij", name = "H", descriptor = "[C")
    public char[] field4103;

    @OriginalMember(owner = "client!ij", name = "E", descriptor = "[I")
    public int[] field4100;

    @OriginalMember(owner = "client!ij", name = "F", descriptor = "[I")
    public int[] field4101;

    @OriginalMember(owner = "client!ij", name = "R", descriptor = "[[I")
    public static int[][] field4112;

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(ILig;)V")
    public final void method1720(int arg0, class136 arg1) {
        while (true) {
            int var3 = arg1.method1012(4);
            if (var3 == 0) {
                field4104++;
                if (arg0 != 0) {
                    field4112 = null;
                    return;
                }
                return;
            }
            this.method1724(arg1, true, var3);
        }
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(BC)I")
    public final int method1721(byte arg0, char arg1) {
        field4105++;
        if (this.field4100 == null) {
            return -1;
        }
        for (int var3 = 0; var3 < this.field4100.length; var3++) {
            if (this.field4102[var3] == arg1) {
                return this.field4100[var3];
            }
        }
        int var4 = -91 % ((-arg0 - 69) / 47);
        return -1;
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(I)V")
    public static void method1722(int arg0) {
        if (arg0 == 30) {
            field4099 = null;
            field4113 = null;
            field4107 = null;
            field4112 = null;
        }
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(CB)I")
    public final int method1723(char arg0, byte arg1) {
        field4097++;
        int var3 = -90 / ((arg1 + 2) / 41);
        if (this.field4101 == null) {
            return -1;
        }
        for (int var4 = 0; var4 < this.field4101.length; var4++) {
            if (this.field4103[var4] == arg0) {
                return this.field4101[var4];
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(Lig;ZI)V")
    private final void method1724(class136 arg0, boolean arg1, int arg2) {
        if (arg2 == 1) {
            this.field4111 = arg0.method1010(-119);
        } else if (arg2 == 2) {
            int var7 = arg0.method1012(4);
            this.field4102 = new char[var7];
            this.field4100 = new int[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field4100[var8] = arg0.method996(65280);
                byte var9 = arg0.method981(false);
                this.field4102[var8] = var9 == 0 ? 0 : class259.method1733(var9, -69);
            }
        } else if (arg2 == 3) {
            int var4 = arg0.method1012(4);
            this.field4101 = new int[var4];
            this.field4103 = new char[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field4101[var5] = arg0.method996(65280);
                byte var6 = arg0.method981(false);
                this.field4103[var5] = var6 == 0 ? 0 : class259.method1733(var6, -128);
            }
        }
        if (!arg1) {
            method1722(-30);
        }
        field4109++;
    }

    @OriginalMember(owner = "client!ij", name = "b", descriptor = "(I)V")
    public final void method1725(int arg0) {
        field4096++;
        if (this.field4101 != null) {
            for (int var2 = 0; var2 < this.field4101.length; var2++) {
                this.field4101[var2] = class140.method1045(this.field4101[var2], 32768);
            }
        }
        if (this.field4100 != null) {
            for (int var3 = 0; var3 < this.field4100.length; var3++) {
                this.field4100[var3] = class140.method1045(this.field4100[var3], 32768);
            }
        }
        if (arg0 < 105) {
            method1728(-49, true);
        }
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(JI)V")
    public static final void method1726(long arg0, int arg1) {
        if (arg1 != 18145) {
            return;
        }
        field4108++;
        if (arg0 == 0L) {
            return;
        }
        if (!(class45.field820 < 100 || class48.field879) || class45.field820 >= 200) {
            class106.method787(class18.field247, "", 0, true);
            return;
        }
        String var3 = class66.method506((byte) 20, arg0);
        for (int var4 = 0; var4 < class45.field820; var4++) {
            if (class159.field2570[var4] == arg0) {
                class106.method787(var3 + class247.field3883, "", 0, true);
                return;
            }
        }
        for (int var5 = 0; var5 < class286.field4554; var5++) {
            if (class145.field2390[var5] == arg0) {
                class106.method787(class75.field1235 + var3 + class187.field3060, "", 0, true);
                return;
            }
        }
        if (var3.equals(class48.field878.field3445)) {
            class106.method787(class206.field3316, "", 0, true);
            return;
        }
        class32.field528++;
        class35.field603[class45.field820] = var3;
        class159.field2570[class45.field820] = arg0;
        class200.field3263[class45.field820] = 0;
        class248.field3932[class45.field820] = "";
        class277.field4401[class45.field820] = 0;
        class297.field4703[class45.field820] = false;
        class204.field3288 = class61.field1040;
        class45.field820++;
        class87.field1405.method607(234, (byte) 121);
        class87.field1405.method967((byte) -8, arg0);
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(ILqa;Z)V")
    public static final void method1727(int arg0, class73 arg1, boolean arg2) {
        field4110++;
        if (arg2) {
            int var3 = class33.field557;
            int var4 = var3 * 956 / 503;
            class233.field3693.method132((class137.field2301 - var4) / 2, 0, var4, var3);
            class190.field3106.method588(class137.field2301 / 2 - class190.field3106.field2440 / 2, 18);
        }
        arg1.method568(class228.field3635, class137.field2301 / 2, class33.field557 / 2 - 26, 16777215, -1);
        int var5 = class33.field557 / 2 - 18;
        class63.method492(class137.field2301 / 2 - 152, var5, 304, 34, 9179409);
        class63.method492(class137.field2301 / 2 - 151, var5 + 1, 302, 32, 0);
        class63.method493(class137.field2301 / 2 - 150, var5 + 2, class219.field3512 * 3, 30, 9179409);
        class63.method493(class137.field2301 / 2 + class219.field3512 * 3 - 150, var5 - -2, 300 - class219.field3512 * 3, 30, 0);
        if (arg0 != 515) {
            field4095 = true;
        }
        arg1.method568(class43.field783, class137.field2301 / 2, class33.field557 / 2 + 4, 16777215, -1);
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(IZ)Lth;")
    public static final class119 method1728(int arg0, boolean arg1) {
        if (!arg1) {
            method1727(92, (class73) null, false);
        }
        field4098++;
        return (class119) class81.field1337.method1063((byte) -110, (long) arg0);
    }
}
