import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!po")
public class class174 {

    @OriginalMember(owner = "client!po", name = "a", descriptor = "I")
    public static int field2507 = -1;

    @OriginalMember(owner = "client!po", name = "g", descriptor = "Z")
    public static boolean field2513 = false;

    @OriginalMember(owner = "client!po", name = "b", descriptor = "I")
    public static int field2508;

    @OriginalMember(owner = "client!po", name = "c", descriptor = "I")
    public static int field2509;

    @OriginalMember(owner = "client!po", name = "d", descriptor = "I")
    public static int field2510;

    @OriginalMember(owner = "client!po", name = "h", descriptor = "I")
    public static int field2514;

    @OriginalMember(owner = "client!po", name = "f", descriptor = "Lph;")
    public static class361 field2512;

    @OriginalMember(owner = "client!po", name = "e", descriptor = "[B")
    public static byte[] field2511;

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(ILqf;)Ljava/lang/String;", line = 6)
    public static final String method1218(int arg0, class359 arg1) {
        field2514++;
        if (client.method347(arg1).method1442(true) == 0) {
            return null;
        } else if (arg0 <= 106) {
            return (String) null;
        } else if (arg1.field5528 == null || arg1.field5528.trim().length() == 0) {
            return class190.field2769 ? "Hidden-use" : null;
        } else {
            return arg1.field5528;
        }
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(Lgj;I)V", line = 38)
    public static final void method1219(class333 arg0, int arg1) {
        if (class304.field4560 == arg0.field5119 || arg0.field5190 == -1 || arg0.field5177 != 0 || arg0.field5194 + 1 > class119.method893(arg0.field5190, (byte) -41).field3694[arg0.field5132]) {
            int var2 = arg0.field5119 - arg0.field5136;
            int var3 = class304.field4560 - arg0.field5136;
            int var4 = arg0.field5173 * 128 + arg0.method1700(-117) * 64;
            int var5 = arg0.field5095 * 128 + arg0.method1700(-106) * 64;
            int var6 = arg0.field5175 * 128 + (arg0.method1700(-125) * 64);
            int var7 = arg0.field5091 * 128 + arg0.method1700(-100) * 64;
            arg0.field5137 = ((var2 - var3) * var4 + var3 * var6) / var2;
            arg0.field5165 = ((var2 - var3) * var5 + var3 * var7) / var2;
        }
        if (arg0.field5163 == 0) {
            arg0.field5089 = 1024;
        }
        if (arg1 <= 69) {
            field2507 = -39;
        }
        field2510++;
        if (arg0.field5163 == 1) {
            arg0.field5089 = 1536;
        }
        arg0.field5158 = 0;
        if (arg0.field5163 == 2) {
            arg0.field5089 = 0;
        }
        if (arg0.field5163 == 3) {
            arg0.field5089 = 512;
        }
        arg0.field5199 = arg0.field5089;
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(IIIII)V", line = 83)
    public static final void method1220(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = 24 / ((arg3 + 78) / 32);
        class206 var6 = (class206) class135.field1968.method1405((long) arg0, false);
        if (var6 == null) {
            var6 = new class206();
            class135.field1968.method1400((long) arg0, 118, var6);
        }
        field2508++;
        if (var6.field3008.length <= arg1) {
            int[] var7 = new int[arg1 + 1];
            int[] var8 = new int[arg1 + 1];
            for (int var9 = 0; var9 < var6.field3008.length; var9++) {
                var7[var9] = var6.field3008[var9];
                var8[var9] = var6.field3014[var9];
            }
            for (int var10 = var6.field3008.length; var10 < arg1; var10++) {
                var7[var10] = -1;
                var8[var10] = 0;
            }
            var6.field3008 = var7;
            var6.field3014 = var8;
        }
        var6.field3008[arg1] = arg2;
        var6.field3014[arg1] = arg4;
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(I)V", line = 136)
    public static final void method1221(int arg0) {
        field2509++;
        class95.field1336 = 0;
        class22.field337 = 0;
        if (arg0 < 32) {
            return;
        }
        class58.method468((byte) -125);
        class227.method1691(32);
        class62.method504(-3588);
        for (int var1 = 0; var1 < class22.field337; var1++) {
            int var2 = class177.field2548[var1];
            if (class304.field4560 != class300.field4495[var2].field5153) {
                if (class300.field4495[var2].field2609.method1544(-27)) {
                    class249.method1834((byte) 125, class300.field4495[var2]);
                }
                class300.field4495[var2].method1259((class214) null, (byte) 7);
                class300.field4495[var2] = null;
            }
        }
        if (class358.field5481 != class83.field1194.field2776) {
            throw new RuntimeException("gnp1 pos:" + class83.field1194.field2776 + " psize:" + class358.field5481);
        }
        for (int var3 = 0; var3 < class166.field2384; var3++) {
            if (class300.field4495[class215.field3158[var3]] == null) {
                throw new RuntimeException("gnp2 pos:" + var3 + " size:" + class166.field2384);
            }
        }
    }

    @OriginalMember(owner = "client!po", name = "b", descriptor = "(I)V", line = 190)
    public static void method1222(int arg0) {
        if (arg0 >= 80) {
            field2511 = null;
            field2512 = null;
        }
    }
}
