import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ga")
public class class374 {

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "I")
    public static int field4823 = 500;

    @OriginalMember(owner = "client!ga", name = "f", descriptor = "[I")
    public static int[] field4827 = new int[250];

    @OriginalMember(owner = "client!ga", name = "g", descriptor = "F")
    public static float field4828;

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "I")
    public static int field4822;

    @OriginalMember(owner = "client!ga", name = "c", descriptor = "I")
    public static int field4824;

    @OriginalMember(owner = "client!ga", name = "d", descriptor = "I")
    public static int field4825;

    @OriginalMember(owner = "client!ga", name = "e", descriptor = "I")
    public static int field4826;

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(IB)V")
    public static final void method2162(int arg0, byte arg1) {
        if (class252.field3249 == null) {
            class252.field3249 = new byte[4][class85.field1090][class656.field8932];
        }
        field4824++;
        for (int var2 = arg0; var2 < 4; var2++) {
            for (int var3 = 0; var3 < class85.field1090; var3++) {
                for (int var4 = 0; var4 < class656.field8932; var4++) {
                    class252.field3249[var2][var3][var4] = arg1;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(CZ)Z")
    public static final boolean method2163(char arg0, boolean arg1) {
        if (arg1) {
            method2162(35, (byte) 9);
        }
        field4826++;
        if (!(arg0 <= '\u0000' || arg0 >= '\u0080') || !(arg0 < ' ' || arg0 > 'ÿ')) {
            return true;
        }
        if (arg0 != '\u0000') {
            char[] var2 = class89.field1159;
            for (int var3 = 0; var3 < var2.length; var3++) {
                char var4 = var2[var3];
                if (arg0 == var4) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(B)V")
    public static void method2164(byte arg0) {
        if (arg0 == 49) {
            field4827 = null;
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(I[Lxa;)V")
    public static final void method2165(int arg0, class468[] arg1) {
        field4822++;
        class394.field5027 = arg1.length;
        class306.field3871 = new class468[class394.field5027 + 10];
        class541.field6825 = new int[class394.field5027 + 10];
        class70.method553(arg1, 0, class306.field3871, 0, class394.field5027);
        for (int var2 = 0; var2 < class394.field5027; var2++) {
            class541.field6825[var2] = class306.field3871[var2].method1549();
        }
        int var3 = class394.field5027;
        if (arg0 == -30020) {
            while (class306.field3871.length > var3) {
                class541.field6825[var3] = 12;
                var3++;
            }
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(BLjaa;)V")
    public static final void method2166(byte arg0, class576 arg1) {
        field4825++;
        if (class522.field6605 == null) {
            class427 var2 = new class427();
            byte[] var3 = var2.method2351(128, (byte) -69, 16, 128);
            class522.field6605 = class416.method2317(var3, false, -137);
        }
        if (class706.field9872 == null) {
            class213 var4 = new class213();
            byte[] var5 = var4.method1243(16, (byte) 61, 128, 128);
            class706.field9872 = class416.method2317(var5, false, -137);
        }
        class353 var6 = arg1.field7593;
        if (var6.method2026(false) && class327.field4074 == null) {
            byte[] var7 = class304.method1811(new class96(419684), 4.0F, 128, 4.0F, 16, 128, 16.0F, 0.5F, true, 0.6F, 8);
            class327.field4074 = class416.method2317(var7, false, -137);
        }
        int var8 = -87 / ((arg0 - 81) / 39);
    }
}
