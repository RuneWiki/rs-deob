import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gd")
public class class262 extends class519 {

    @OriginalMember(owner = "client!gd", name = "x", descriptor = "I")
    public int field4367 = (int) (class19.method91((byte) 124) / 1000L);

    @OriginalMember(owner = "client!gd", name = "y", descriptor = "Ljava/lang/String;")
    public String field4368;

    @OriginalMember(owner = "client!gd", name = "A", descriptor = "S")
    public short field4370;

    @OriginalMember(owner = "client!gd", name = "w", descriptor = "Lbu;")
    public static class407 field4366 = new class407(8);

    @OriginalMember(owner = "client!gd", name = "z", descriptor = "[I")
    public static int[] field4369 = new int[32];

    @OriginalMember(owner = "client!gd", name = "u", descriptor = "I")
    public static int field4364;

    @OriginalMember(owner = "client!gd", name = "v", descriptor = "I")
    public static int field4365;

    @OriginalMember(owner = "client!gd", name = "B", descriptor = "I")
    public static int field4371;

    @OriginalMember(owner = "client!gd", name = "C", descriptor = "I")
    public static int field4372;

    @OriginalMember(owner = "client!gd", name = "c", descriptor = "(B)V", line = 8)
    public static void method1749(byte arg0) {
        if (arg0 != 3) {
            field4369 = null;
        }
        field4366 = null;
        field4369 = null;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(IILza;I)V", line = 25)
    public static final void method1750(int arg0, int arg1, class491 arg2, int arg3) {
        field4372++;
        class412.field6247 = new class284[arg1][arg3];
        class533.field7842 = arg2;
        if (class34.field525 != null) {
            class65.field975 = class450.method2693(class34.field525[1], class34.field525[0], class34.field525[4], 3424, class34.field525[2], class34.field525[3], class34.field525[5]);
        }
        class446.field6659 = new class284();
        int var4 = 100 % ((-arg0 - 40) / 45);
        class123.method975(true);
    }

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "(I)V", line = 44)
    public static final void method1751(int arg0) {
        field4364++;
        try {
            if (class432.field6464 == 1) {
                int var1 = class509.field7398.method2373(-1);
                if (var1 > 0 && class509.field7398.method2384(true)) {
                    int var2 = var1 - class257.field4335;
                    if (var2 < 0) {
                        var2 = 0;
                    }
                    class509.field7398.method2360(32001, var2);
                    return;
                }
                class509.field7398.method2350((byte) 7);
                class509.field7398.method2358((byte) 121);
                if (class505.field7357 == null) {
                    class432.field6464 = 0;
                } else {
                    class432.field6464 = 2;
                }
                class147.field2399 = null;
                class291.field4732 = null;
            }
            int var3 = 63 % ((arg0 + 20) / 38);
        } catch (Exception var5) {
            var5.printStackTrace();
            class509.field7398.method2350((byte) 95);
            class147.field2399 = null;
            class291.field4732 = null;
            class432.field6464 = 0;
            class505.field7357 = null;
        }
    }

    @OriginalMember(owner = "client!gd", name = "<init>", descriptor = "(Ljava/lang/String;I)V", line = 93)
    public class262(String arg0, int arg1) {
        this.field4368 = arg0;
        this.field4370 = (short) arg1;
    }
}
