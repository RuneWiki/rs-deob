import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rb")
public class class235 extends class6 {

    @OriginalMember(owner = "client!rb", name = "z", descriptor = "I")
    public int field3333 = 0;

    @OriginalMember(owner = "client!rb", name = "x", descriptor = "[I")
    public static int[] field3331 = new int[4096];

    @OriginalMember(owner = "client!rb", name = "A", descriptor = "Ldi;")
    public static class83 field3334;

    @OriginalMember(owner = "client!rb", name = "H", descriptor = "[[I")
    public static int[][] field3339;

    @OriginalMember(owner = "client!rb", name = "D", descriptor = "Lqp;")
    public static class466 field3336;

    @OriginalMember(owner = "client!rb", name = "B", descriptor = "F")
    public static float field3335;

    @OriginalMember(owner = "client!rb", name = "w", descriptor = "I")
    public static int field3330;

    @OriginalMember(owner = "client!rb", name = "y", descriptor = "I")
    public static int field3332;

    @OriginalMember(owner = "client!rb", name = "E", descriptor = "I")
    public static int field3337;

    @OriginalMember(owner = "client!rb", name = "G", descriptor = "I")
    public static int field3338;

    static {
        for (int var0 = 0; var0 < 4096; var0++) {
            field3331[var0] = class525.method3118(var0, 125);
        }
        field3334 = new class83(42, 3);
        field3339 = new int[][] { { 0, 2 }, { 0, 2 }, { 0, 0, 2 }, { 2, 0, 0 }, { 0, 2, 0 }, { 0, 0, 2 }, { 0, 5, 1, 4 }, { 0, 4, 4, 4 }, { 4, 4, 4, 0 }, { 6, 6, 6, 2, 2, 2 }, { 2, 2, 2, 6, 6, 6 }, { 0, 11, 6, 6, 6, 4 }, { 0, 2 }, { 0, 4, 4, 4 }, { 0, 4, 4, 4 } };
        field3336 = new class466("Prepared sound engine", "Musik-Engine vorbereitet.", "Moteur son préparé", "Mecanismo de som preparado");
    }

    @OriginalMember(owner = "client!rb", name = "f", descriptor = "(I)V", line = 5)
    public static void method1447(int arg0) {
        field3336 = null;
        if (arg0 == 4) {
            field3334 = null;
            field3339 = null;
            field3331 = null;
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(BLsi;)V", line = 35)
    public final void method1448(byte arg0, class391 arg1) {
        int var3 = 39 % ((arg0 - 12) / 47);
        while (true) {
            int var4 = arg1.method2348(-2);
            if (var4 == 0) {
                field3332++;
                return;
            }
            this.method1449(arg1, -100, var4);
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(Lsi;II)V", line = 57)
    private final void method1449(class391 arg0, int arg1, int arg2) {
        if (arg2 == 2) {
            this.field3333 = arg0.method2353((byte) 106);
        }
        if (arg1 > -75) {
            field3334 = null;
        }
        field3338++;
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(ZZI)V", line = 80)
    public static final void method1450(boolean arg0, boolean arg1, int arg2) {
        if (arg2 != 5) {
            method1450(false, false, 50);
        }
        if (arg1) {
            class476.field6944++;
            class136.method921(-71);
        }
        field3337++;
        if (arg0) {
            class272.field3757++;
            class134.method915(-4737);
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(I[I)Ljava/lang/String;", line = 105)
    public static final String method1451(int arg0, int[] arg1) {
        field3330++;
        StringBuffer var2 = new StringBuffer();
        int var3 = class382.field5582;
        for (int var4 = arg0; var4 < arg1.length; var4++) {
            class326 var5 = class351.field5158.method2293(arg1[var4], (byte) -18);
            if (var5.field4451 != -1) {
                class16 var6 = (class16) class172.field2552.method1073((long) var5.field4451, false);
                if (var6 == null) {
                    class4 var7 = class4.method22(class364.field5334, var5.field4451, 0);
                    if (var7 != null) {
                        var6 = class269.field3721.method265(var7, true);
                        class172.field2552.method1072((long) var5.field4451, var6, false);
                    }
                }
                if (var6 != null) {
                    class150.field2264[var3] = var6;
                    var2.append(" <img=").append(var3).append(">");
                    var3++;
                }
            }
        }
        return var2.toString();
    }
}
