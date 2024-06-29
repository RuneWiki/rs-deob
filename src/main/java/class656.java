import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sn")
public class class656 {

    @OriginalMember(owner = "client!sn", name = "j", descriptor = "Ldc;")
    private class302 field9377;

    @OriginalMember(owner = "client!sn", name = "c", descriptor = "Z")
    public static boolean field9370 = false;

    @OriginalMember(owner = "client!sn", name = "g", descriptor = "I")
    public static int field9374 = -1;

    @OriginalMember(owner = "client!sn", name = "k", descriptor = "[Ljava/lang/String;")
    public static String[] field9378 = new String[100];

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "I")
    public static int field9368;

    @OriginalMember(owner = "client!sn", name = "b", descriptor = "I")
    public static int field9369;

    @OriginalMember(owner = "client!sn", name = "d", descriptor = "I")
    public static int field9371;

    @OriginalMember(owner = "client!sn", name = "f", descriptor = "I")
    public static int field9373;

    @OriginalMember(owner = "client!sn", name = "i", descriptor = "I")
    public static int field9376;

    @OriginalMember(owner = "client!sn", name = "h", descriptor = "Ldu;")
    private class381 field9375;

    @OriginalMember(owner = "client!sn", name = "e", descriptor = "[Lf;")
    public static class256[] field9372;

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(Ldc;I)V")
    public final void method3702(class302 arg0, int arg1) {
        field9369++;
        if (arg1 > -22) {
            this.method3702(null, 15);
        }
        this.field9377 = arg0;
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(I)V")
    public static void method3703(int arg0) {
        field9378 = null;
        if (arg0 == 20048) {
            field9372 = null;
        }
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(B)Ldu;")
    public final class381 method3704(byte arg0) {
        field9371++;
        class381 var2 = this.field9377.field4475.field5737;
        if (this.field9377.field4475 == var2) {
            this.field9375 = null;
            return null;
        } else {
            this.field9375 = var2.field5737;
            int var3 = 92 / ((-arg0 - 14) / 56);
            return var2;
        }
    }

    @OriginalMember(owner = "client!sn", name = "b", descriptor = "(I)V")
    public static final void method3705(int arg0) {
        class293.method1804(class335.field4872.field9481, (byte) 70);
        field9376++;
        int var1 = (class397.field6005 >> 3) + (class306.field4529 >> 12);
        class49.field779 = class321.field4681.field7905 = 0;
        int var2 = (class603.field8702 >> 12) + (class403.field6049 >> 3);
        class321.field4681.method418(0, 8, 8);
        byte var3 = 18;
        class246.field3253 = new byte[var3][];
        class443.field6438 = new int[var3];
        class505.field7147 = new int[var3];
        if (arg0 != 4) {
            method3705(59);
        }
        class47.field751 = new byte[var3][];
        class51.field801 = new byte[var3][];
        class221.field2933 = new int[var3];
        class108.field1609 = new byte[var3][];
        class480.field6863 = new int[var3];
        class299.field4396 = new int[var3];
        class654.field9367 = new int[var3][4];
        class372.field5505 = new int[var3];
        class476.field6823 = new byte[var3][];
        int var4 = 0;
        for (int var5 = (var1 - (class72.field1144 >> 4)) / 8; var5 <= ((class72.field1144 >> 4) + var1) / 8; var5++) {
            for (int var8 = (var2 - (class668.field9444 >> 4)) / 8; var8 <= (((class668.field9444 >> 4) + var2) / 8); var8++) {
                int var9 = (var5 << 8) + var8;
                class505.field7147[var4] = var9;
                class221.field2933[var4] = class43.field625.method1819("m" + var5 + "_" + var8, (byte) 106);
                class372.field5505[var4] = class43.field625.method1819("l" + var5 + "_" + var8, (byte) 53);
                class480.field6863[var4] = class43.field625.method1819("n" + var5 + "_" + var8, (byte) 88);
                class299.field4396[var4] = class43.field625.method1819("um" + var5 + "_" + var8, (byte) 96);
                class443.field6438[var4] = class43.field625.method1819("ul" + var5 + "_" + var8, (byte) 108);
                if (class480.field6863[var4] == -1) {
                    class221.field2933[var4] = -1;
                    class372.field5505[var4] = -1;
                    class299.field4396[var4] = -1;
                    class443.field6438[var4] = -1;
                }
                var4++;
            }
        }
        for (int var6 = var4; var6 < class480.field6863.length; var6++) {
            class480.field6863[var6] = -1;
            class221.field2933[var6] = -1;
            class372.field5505[var6] = -1;
            class299.field4396[var6] = -1;
            class443.field6438[var6] = -1;
        }
        byte var7;
        if (class264.field3451 == 3) {
            var7 = 4;
        } else {
            var7 = 8;
        }
        class699.method3924(var2, 126, var7, var1, false);
    }

    @OriginalMember(owner = "client!sn", name = "c", descriptor = "(I)Ldu;")
    public final class381 method3706(int arg0) {
        field9368++;
        class381 var2 = this.field9375;
        if (this.field9377.field4475 == var2) {
            this.field9375 = null;
            return null;
        }
        this.field9375 = var2.field5737;
        if (arg0 != 18) {
            field9372 = null;
        }
        return var2;
    }

    @OriginalMember(owner = "client!sn", name = "<init>", descriptor = "()V")
    public class656() {
    }

    @OriginalMember(owner = "client!sn", name = "<init>", descriptor = "(Ldc;)V")
    public class656(class302 arg0) {
        this.field9377 = arg0;
    }
}
