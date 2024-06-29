import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nf")
public class class409 {

    @OriginalMember(owner = "client!nf", name = "b", descriptor = "Lhn;")
    public static class509 field6099 = new class509(17, 12);

    @OriginalMember(owner = "client!nf", name = "d", descriptor = "Loe;")
    public static class137 field6101 = new class137();

    @OriginalMember(owner = "client!nf", name = "f", descriptor = "[I")
    public static int[] field6103 = new int[8];

    @OriginalMember(owner = "client!nf", name = "g", descriptor = "I")
    public static int field6104 = -1;

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "I")
    public static int field6098;

    @OriginalMember(owner = "client!nf", name = "c", descriptor = "I")
    public static int field6100;

    @OriginalMember(owner = "client!nf", name = "e", descriptor = "Lul;")
    public static class406 field6102;

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(I)V")
    public static void method2571(int arg0) {
        field6103 = null;
        field6102 = null;
        field6101 = null;
        if (arg0 == -4353) {
            field6099 = null;
        }
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(Ljs;I[[B)V")
    public static final void method2572(class219 arg0, int arg1, byte[][] arg2) {
        field6098++;
        int[] var3 = new int[] { -1, 0, 0, 0, 0 };
        int var4 = arg2.length;
        if (arg1 != -99) {
            method2571(-18);
        }
        for (int var5 = 0; var5 < var4; var5++) {
            byte[] var10 = arg2[var5];
            if (var10 != null) {
                class217 var11 = new class217(var10);
                int var12 = class505.field7380[var5] >> 8;
                int var13 = class505.field7380[var5] & 0xFF;
                int var14 = var12 * 64 - class390.field5842;
                int var15 = var13 * 64 - class176.field2613;
                class92.method746(980099212);
                arg0.method1727(class176.field2613, var14, class184.field2758, (byte) 123, var15, class390.field5842, var11);
                arg0.method1575(1026, var11, var14, class377.field5692, var15, var3);
                if (!arg0.field3957 && (class136.field2073 / 8) == var12 && (class517.field7520 / 8) == var13 && var3[0] != -1) {
                    class32.field377 = class517.field7530.method1234(class138.field2098, var3[3], 903, var3[2], var3[1], var3[0]);
                    class134.field2049 = var3[4];
                }
            }
        }
        for (int var6 = 0; var6 < var4; var6++) {
            int var7 = (class505.field7380[var6] >> 8) * 64 - class390.field5842;
            int var8 = (class505.field7380[var6] & 0xFF) * 64 - class176.field2613;
            byte[] var9 = arg2[var6];
            if (var9 == null && class517.field7520 < 800) {
                class92.method746(980099212);
                arg0.method1729(var8, (byte) 34, 64, 64, var7);
            }
        }
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(ILga;Lya;IIBI)V")
    public static final void method2573(int arg0, class279 arg1, class38 arg2, int arg3, int arg4, byte arg5, int arg6) {
        if (class172.field2549 < 100) {
            class22.method168(69, arg1, arg2);
        }
        field6100++;
        arg2.method313(arg0, arg6, arg0 + arg3, arg6 - -arg4);
        if (class172.field2549 < 100) {
            byte var7 = 20;
            int var8 = arg3 / 2 + arg0;
            int var9 = arg6 + (arg4 / 2) - var7 - 18;
            arg2.method284(arg0, arg6, arg3, arg4, -16777216, 0);
            arg2.method293(var8 - 152, var9, 304, 34, class472.field6822[class168.field2478].getRGB(), 0);
            arg2.method284(var8 - 150, var9 - -2, class172.field2549 * 3, 30, class335.field4997[class168.field2478].getRGB(), 0);
            class185.field2805.method2030(var7 + var9, class341.field5070.method1635(class224.field3673, (byte) 120), -1, 0, class338.field5036[class168.field2478].getRGB(), var8);
            return;
        }
        if (arg5 >= -83) {
            method2571(38);
        }
        int var10 = class136.field2074 - ((int) ((float) arg3 / class7.field91));
        int var11 = (int) ((float) arg4 / class7.field91) + class319.field4810;
        int var12 = (int) ((float) arg3 / class7.field91) + class136.field2074;
        class273.field4166 = class319.field4810 - ((int) ((float) arg4 / class7.field91));
        class523.field7654 = (int) ((float) (arg3 * 2) / class7.field91);
        int var13 = class319.field4810 - (int) ((float) arg4 / class7.field91);
        class346.field5123 = (int) ((float) (arg4 * 2) / class7.field91);
        class145.field2205 = class136.field2074 - ((int) ((float) arg3 / class7.field91));
        class7.method58(class7.field106 + var10, class7.field103 + var11, class7.field106 + var12, var13 - -class7.field103, arg0, arg6, arg0 + arg3, arg6 - -1 + arg4);
        class7.method47(arg2);
        class137 var14 = class7.method49(arg2);
        class224.method1599(var14, arg2, (byte) -124, 0, 0);
        if (class197.field3283 > 0) {
            class324.field4851--;
            if (class324.field4851 == 0) {
                class197.field3283--;
                class324.field4851 = 20;
            }
        }
        if (!class470.field6798) {
            return;
        }
        int var15 = arg0 + arg3 - 5;
        int var16 = arg4 + arg6 - 8;
        class313.field4722.method2035(var16, "Fps:" + class309.field4659, 0, -1, var15, 16776960);
        int var20 = var16 - 15;
        Runtime var17 = Runtime.getRuntime();
        int var18 = (int) ((var17.totalMemory() - var17.freeMemory()) / 1024L);
        int var19 = 16776960;
        if (var18 > 65536) {
            var19 = 16711680;
        }
        class313.field4722.method2035(var20, "Mem:" + var18 + "k", 0, -1, var15, var19);
        var16 = var20 - 15;
    }

    static {
        new class234("You are not currently in a channel.", "Du befindest dich derzeit nicht in einem Chatraum.", "Vous n'êtes dans aucun canal à l'heure actuelle.", "No momento você não está em um canal.");
        new class234(null, "Spieler nicht auf deiner Freunde-Liste.", null, null);
    }
}
