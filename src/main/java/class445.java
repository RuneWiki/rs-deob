import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wo")
public class class445 extends class40 {

    @OriginalMember(owner = "client!wo", name = "Q", descriptor = "Lpm;")
    public static class349 field6356 = new class349("Connecting to update server", "Verbindung mit Update-Server...", "Connexion au serveur de mise à jour en cours", "Conectando ao servidor de atualização");

    @OriginalMember(owner = "client!wo", name = "K", descriptor = "I")
    public static int field6350;

    @OriginalMember(owner = "client!wo", name = "L", descriptor = "I")
    public static int field6351;

    @OriginalMember(owner = "client!wo", name = "M", descriptor = "I")
    public static int field6352;

    @OriginalMember(owner = "client!wo", name = "N", descriptor = "I")
    public static int field6353;

    @OriginalMember(owner = "client!wo", name = "O", descriptor = "I")
    public static int field6354;

    @OriginalMember(owner = "client!wo", name = "P", descriptor = "I")
    public static int field6355;

    @OriginalMember(owner = "client!wo", name = "R", descriptor = "I")
    public static int field6357;

    @OriginalMember(owner = "client!wo", name = "S", descriptor = "I")
    public static int field6358;

    @OriginalMember(owner = "client!wo", name = "c", descriptor = "(I)V", line = 8)
    public static final void method2770(int arg0) {
        class366.field5239 = class70.field934.field2575 + class70.field934.field2574 - -2;
        ++field6354;
        class1.field4 = new String[500];
        class130.field1842 = class317.field4651.field2574 - -2 + class317.field4651.field2575;
        if (arg0 != 30383) {
            method2770(0);
        }
        for (int var1 = 0; class1.field4.length > var1; ++var1) {
            class1.field4[var1] = "";
        }
    }

    @OriginalMember(owner = "client!wo", name = "b", descriptor = "(BI)V", line = 33)
    public static final void method2771(byte arg0, int arg1) {
        if (class32.field398 == null) {
            class32.field398 = new byte[4][class80.field1034][class381.field5414];
        }
        ++field6355;
        if (arg1 <= -81) {
            for (int var2 = 0; ~var2 > -5; ++var2) {
                for (int var3 = 0; ~var3 > ~class80.field1034; ++var3) {
                    for (int var4 = 0; ~var4 > ~class381.field5414; ++var4) {
                        class32.field398[var2][var3][var4] = arg0;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!wo", name = "b", descriptor = "(II)Lko;", line = 69)
    public static final class294 method2772(int arg0, int arg1) {
        ++field6358;
        class294 var2 = (class294) class243.field3601.method1972((long) arg0, arg1);
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class9.field120.method643(class215.method1505(-715567576, arg0), class446.method2780(arg0, -1071689049), true);
            class294 var4 = new class294();
            if (var3 != null) {
                var4.method1990(false, new class130(var3));
            }
            class243.field3601.method1975(var4, (long) arg0, false);
            return var4;
        }
    }

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(Ljava/lang/String;BZ)V", line = 91)
    public static final void method2773(String arg0, byte arg1, boolean arg2) {
        class449.field6414.field1405 = 1;
        ++field6351;
        String var3 = arg0.toLowerCase();
        short[] var4 = new short[16];
        int var5 = 0;
        for (int var6 = 0; ~var6 > ~class320.field4691; ++var6) {
            class409 var10 = class167.method1202(true, var6);
            if ((!arg2 || var10.field5805) && ~var10.field5840 == 0 && ~var10.field5856 == 0 && var10.field5811 == 0 && var10.field5871.toLowerCase().indexOf(var3) != -1) {
                if (var5 >= 250) {
                    class297.field4327 = null;
                    class324.field4722 = -1;
                    return;
                }
                if (~var4.length >= ~var5) {
                    short[] var11 = new short[var4.length * 2];
                    for (int var12 = 0; ~var5 < ~var12; ++var12) {
                        var11[var12] = var4[var12];
                    }
                    var4 = var11;
                }
                var4[var5++] = (short) var6;
            }
        }
        class324.field4722 = var5;
        class19.field255 = 0;
        int var7 = 80 % ((arg1 - -73) / 51);
        class297.field4327 = var4;
        String[] var8 = new String[class324.field4722];
        for (int var9 = 0; ~class324.field4722 < ~var9; ++var9) {
            var8[var9] = class167.method1202(true, var4[var9]).field5871;
        }
        class376.method2401(false, var8, class297.field4327);
        class449.field6414.method658(true);
        class449.field6414.field1405 = 2;
    }

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(BI)[I", line = 163)
    public final int[] method44(byte arg0, int arg1) {
        ++field6350;
        int[] var3 = super.field551.method185(65280, arg1);
        if (super.field551.field441) {
            class271.method1855(var3, 0, class410.field5886, class86.field1123[arg1]);
        }
        if (arg0 > -20) {
            field6356 = null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!wo", name = "d", descriptor = "(I)V", line = 188)
    public static void method2774(int arg0) {
        field6356 = null;
        if (arg0 >= -95) {
            method2776((byte) -94, 101);
        }
    }

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(Ljava/util/Random;II)I", line = 204)
    public static final int method2775(Random arg0, int arg1, int arg2) {
        ++field6352;
        if (arg2 <= 0) {
            throw new IllegalArgumentException();
        } else if (class432.method2698((byte) -79, arg2)) {
            return (int) ((long) arg2 * (4294967295L & (long) arg0.nextInt()) >> 32);
        } else {
            if (arg1 != 31178) {
                method2775((Random) null, 90, 54);
            }
            int var3 = -((int) (4294967296L % (long) arg2)) + Integer.MIN_VALUE;
            int var4;
            do {
                var4 = arg0.nextInt();
            } while (~var4 <= ~var3);
            return class52.method336(var4, arg2, 73);
        }
    }

    @OriginalMember(owner = "client!wo", name = "<init>", descriptor = "()V", line = 233)
    public class445() {
        super(0, true);
    }

    @OriginalMember(owner = "client!wo", name = "c", descriptor = "(BI)V", line = 236)
    public static final void method2776(byte arg0, int arg1) {
        ++field6357;
        if (class103.method609(arg1, 1)) {
            class223[] var2 = class186.field2657[arg1];
            for (int var3 = 0; var3 < var2.length; ++var3) {
                class223 var4 = var2[var3];
                if (var4 != null) {
                    var4.field3292 = 1;
                    var4.field3267 = 0;
                    var4.field3276 = 0;
                }
            }
            if (arg0 < 91) {
                field6356 = null;
            }
        }
    }
}
