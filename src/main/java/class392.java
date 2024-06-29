import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ia")
public class class392 extends class258 implements Runnable {

    @OriginalMember(owner = "client!ia", name = "p", descriptor = "Z")
    private boolean field5579 = true;

    @OriginalMember(owner = "client!ia", name = "s", descriptor = "I")
    public int field5582 = -1;

    @OriginalMember(owner = "client!ia", name = "r", descriptor = "Lt;")
    private class343 field5581;

    @OriginalMember(owner = "client!ia", name = "t", descriptor = "Lvf;")
    public static class166 field5583 = new class166();

    @OriginalMember(owner = "client!ia", name = "v", descriptor = "Z")
    public static boolean field5585;

    @OriginalMember(owner = "client!ia", name = "w", descriptor = "Z")
    public static boolean field5586;

    @OriginalMember(owner = "client!ia", name = "n", descriptor = "I")
    public static int field5577;

    @OriginalMember(owner = "client!ia", name = "o", descriptor = "I")
    public static int field5578;

    @OriginalMember(owner = "client!ia", name = "q", descriptor = "I")
    public static int field5580;

    @OriginalMember(owner = "client!ia", name = "u", descriptor = "I")
    public static int field5584;

    @OriginalMember(owner = "client!ia", name = "x", descriptor = "I")
    public static int field5587;

    static {
        new class40("You are not currently in a channel.", "Du befindest dich derzeit nicht in einem Chatraum.", "Vous n'êtes dans aucun canal à l'heure actuelle.", "No momento você não está em um canal.");
        field5585 = false;
        field5586 = false;
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(BLoj;)V", line = 3)
    public static final void method2352(byte arg0, class280 arg1) {
        field5587++;
        arg1.method1351(0, 0, class110.field1336, 350);
        arg1.method1483(0, 0, class110.field1336, 350, class178.field2150 << 24 | 0x332277, 1);
        for (int var2 = 0; var2 < 100; var2++) {
            int var14 = class413.field5879[var2];
            int var15 = class168.field1993[var2];
            arg1.method1483(var14, var15, 2, 2, class22.field304[var2] << 24 | 0xFFFFFF, 1);
        }
        int var3 = 350 / class475.field6676;
        if (class71.field865 > 0) {
            int var4 = 346 - class475.field6676 - 4;
            int var5 = var3 * var4 / (class71.field865 + var3 - 1);
            int var6 = 4;
            if (class71.field865 > 1) {
                var6 += (class71.field865 - class215.field2961 - 1) * (var4 - var5) / (class71.field865 - 1);
            }
            arg1.method1483(class110.field1336 - 16, var6, 12, var5, class178.field2150 << 24 | 0x332277, 2);
            for (int var7 = class215.field2961; var7 < class215.field2961 + var3 && class71.field865 > var7; var7++) {
                String[] var8 = class217.method1214((byte) 109, class36.field447[var7], '\b');
                int var9 = (class110.field1336 - 8 - 16) / var8.length;
                for (int var10 = 0; var10 < var8.length; var10++) {
                    int var11 = (var9 * var10) + 8;
                    arg1.method1351(var11, 0, var11 + var9 - 8, 350);
                    class273.field3875.method1132(-16777216, 348 - class141.field1694 - class451.field6384.field5763 - ((-class215.field2961 + var7) * class475.field6676), var11, -1, var8[var10], -28115);
                }
            }
        }
        arg1.method1351(0, 0, class110.field1336, 350);
        arg1.method1756(-1, 0, 350 - class141.field1694, class110.field1336, 9);
        class101.field1230.method1132(-16777216, 350 - class453.field6394.field5763 - 1, 10, -1, "--> " + class249.field3503, -28115);
        int var12 = -1;
        if ((class204.field2796 % 30) > 15) {
            var12 = 16777215;
        }
        int var13 = 57 / ((-arg0 - 12) / 53);
        arg1.method1760((byte) 71, 350 - class453.field6394.field5763 - 11, 10 - -class453.field6394.method2419(false, "--> " + class249.field3503.substring(0, class87.field1065)), var12, 12);
    }

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "(Z)V", line = 77)
    public static void method2353(boolean arg0) {
        if (arg0) {
            field5585 = false;
        }
        field5583 = null;
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(B)V", line = 91)
    public static final void method2354(byte arg0) {
        class413.field5876.method385(0, 5);
        field5580++;
        class127.field1573.method2485(-14019, 5);
        class19.field254.method614(5, 3);
        class173.field2084.method2288(5, (byte) -13);
        class390.field5575.method2502(false, 5);
        class422.field6096.method122(5, -1);
        class175.field2103.method1262(5, (byte) 23);
        class234.field3258.method2454(false, 5);
        class269.field3860.method985(5, false);
        class75.field907.method2121(16, 5);
        class415.field6001.method1931(7, 5);
        class47.field611.method1894(5, (byte) 107);
        class44.field568.method1308(5, (byte) 121);
        class422.field6084.method2077(0, 5);
        class424.field6126.method1902(28192, 5);
        if (arg0 <= 110) {
            field5586 = false;
        }
        class128.field1576.method1320(5, (byte) 107);
        class459.field6482.method1238(150, 5);
        class312.field4557.method737(5, 50);
        class319.field4642.method1829((byte) 115, 5);
        class64.field811.method656(5, (byte) 63);
        class251.method1558(127, 5);
        class372.method2249(50, 0);
        class354.method2148(5, 83);
        class204.method1115(5, 126);
        class122.field1520.method1166(5, (byte) -52);
        class362.field5213.method1166(5, (byte) -52);
        class319.field4636.method1166(5, (byte) -52);
        class173.field2079.method1166(5, (byte) -52);
        class396.field5624.method1166(5, (byte) -52);
    }

    @OriginalMember(owner = "client!ia", name = "<init>", descriptor = "(Lt;)V", line = 181)
    public class392(class343 arg0) {
        this.field5581 = arg0;
    }

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "(B)V", line = 135)
    public final void method2355(byte arg0) {
        field5578++;
        (new Thread(this, "a")).start();
        int var2 = 20 / ((arg0 - 1) / 63);
    }

    @OriginalMember(owner = "client!ia", name = "run", descriptor = "()V", line = 146)
    public final void run() {
        field5584++;
        while (this.field5579) {
            this.field5581.method2085(this, (byte) 21);
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(I)V", line = 158)
    public final void method2356(int arg0) {
        field5577++;
        this.field5579 = false;
        if (arg0 != 5) {
            field5583 = null;
        }
    }
}
