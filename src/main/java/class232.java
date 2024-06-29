import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vh")
public class class232 {

    @OriginalMember(owner = "client!vh", name = "k", descriptor = "Lqe;")
    private static class179 field4273 = class206.method1380(" is already on your friend list)3", (byte) -42);

    @OriginalMember(owner = "client!vh", name = "m", descriptor = "Lqe;")
    public static class179 field4275 = field4273;

    @OriginalMember(owner = "client!vh", name = "d", descriptor = "Luc;")
    public static class217 field4266 = new class217();

    @OriginalMember(owner = "client!vh", name = "q", descriptor = "I")
    public static int field4279 = 0;

    @OriginalMember(owner = "client!vh", name = "t", descriptor = "I")
    public static int field4282 = 0;

    @OriginalMember(owner = "client!vh", name = "r", descriptor = "[S")
    public static short[] field4280 = new short[] { 32, 40, 1, 17, 3, 11, 20, 21 };

    @OriginalMember(owner = "client!vh", name = "s", descriptor = "I")
    public static int field4281 = 0;

    @OriginalMember(owner = "client!vh", name = "B", descriptor = "Lqe;")
    public static class179 field4290 = class206.method1380("", (byte) 104);

    @OriginalMember(owner = "client!vh", name = "x", descriptor = "Lqe;")
    public static class179 field4286 = field4290;

    @OriginalMember(owner = "client!vh", name = "u", descriptor = "Lqe;")
    private static class179 field4283 = class206.method1380("Use", (byte) 75);

    @OriginalMember(owner = "client!vh", name = "A", descriptor = "Lqe;")
    public static class179 field4289 = field4290;

    @OriginalMember(owner = "client!vh", name = "o", descriptor = "Lqe;")
    public static class179 field4277 = field4290;

    @OriginalMember(owner = "client!vh", name = "y", descriptor = "Lqe;")
    public static class179 field4287 = field4290;

    @OriginalMember(owner = "client!vh", name = "w", descriptor = "Lqe;")
    public static class179 field4285 = field4283;

    @OriginalMember(owner = "client!vh", name = "n", descriptor = "Lqe;")
    public static class179 field4276 = class206.method1380("(U0a )2 via: ", (byte) -126);

    @OriginalMember(owner = "client!vh", name = "p", descriptor = "Lqe;")
    public static class179 field4278 = field4290;

    @OriginalMember(owner = "client!vh", name = "C", descriptor = "Lqe;")
    public static class179 field4291 = field4290;

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "I")
    public static int field4263;

    @OriginalMember(owner = "client!vh", name = "b", descriptor = "I")
    public int field4264;

    @OriginalMember(owner = "client!vh", name = "c", descriptor = "I")
    public int field4265;

    @OriginalMember(owner = "client!vh", name = "f", descriptor = "I")
    public int field4268;

    @OriginalMember(owner = "client!vh", name = "g", descriptor = "I")
    public static int field4269;

    @OriginalMember(owner = "client!vh", name = "h", descriptor = "I")
    public static int field4270;

    @OriginalMember(owner = "client!vh", name = "i", descriptor = "I")
    public int field4271;

    @OriginalMember(owner = "client!vh", name = "z", descriptor = "I")
    public static int field4288;

    @OriginalMember(owner = "client!vh", name = "v", descriptor = "J")
    public long field4284;

    @OriginalMember(owner = "client!vh", name = "e", descriptor = "Lrb;")
    public class186 field4267;

    @OriginalMember(owner = "client!vh", name = "j", descriptor = "Lrb;")
    public class186 field4272;

    @OriginalMember(owner = "client!vh", name = "l", descriptor = "Lrb;")
    public class186 field4274;

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(I)V")
    public static void method1514(int arg0) {
        field4283 = null;
        field4287 = null;
        field4286 = null;
        field4280 = null;
        field4289 = null;
        field4275 = null;
        field4278 = null;
        if (arg0 != -32099) {
            return;
        }
        field4273 = null;
        field4291 = null;
        field4290 = null;
        field4285 = null;
        field4266 = null;
        field4276 = null;
        field4277 = null;
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(I[Ldg;I[BB)V")
    public static final void method1515(int arg0, class40[] arg1, int arg2, byte[] arg3, byte arg4) {
        field4269++;
        class185 var5 = new class185(arg3);
        if (arg4 != 1) {
            return;
        }
        int var6 = -1;
        while (true) {
            int var7 = var5.method1213(false);
            if (var7 == 0) {
                return;
            }
            var6 += var7;
            int var8 = 0;
            while (true) {
                int var9 = var5.method1215((byte) 93);
                if (var9 == 0) {
                    break;
                }
                var8 += var9 - 1;
                int var10 = var8 & 0x3F;
                int var11 = var8 >> 12;
                int var12 = var8 >> 6 & 0x3F;
                int var13 = var5.method1243(3);
                int var14 = var13 >> 2;
                int var15 = var13 & 0x3;
                int var16 = arg0 + var12;
                int var17 = arg2 + var10;
                if (var16 > 0 && var17 > 0 && var16 < 103 && var17 < 103) {
                    class40 var18 = null;
                    int var19 = var11;
                    if ((class9.field265[1][var16][var17] & 0x2) == 2) {
                        var19 = var11 - 1;
                    }
                    if (var19 >= 0) {
                        var18 = arg1[var19];
                    }
                    class111.method719(var11, class180.field3307, var11, true, var16, (byte) 107, var17, var14, var6, var15, var18);
                }
            }
        }
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method1516(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field4263++;
        int var8 = class56.method391(16777215, class70.field1403, class168.field3037, arg5);
        int var9 = class56.method391(16777215, class70.field1403, class168.field3037, arg2);
        int var10 = class56.method391(16777215, class40.field869, class235.field4336, arg7);
        int var11 = class56.method391(16777215, class40.field869, class235.field4336, arg1);
        int var12 = class56.method391(16777215, class70.field1403, class168.field3037, arg5 + arg6);
        int var13 = class56.method391(16777215, class70.field1403, class168.field3037, arg2 - arg6);
        for (int var14 = var8; var14 < var12; var14++) {
            class23.method161(var11, -1, arg3, var10, class14.field331[var14]);
        }
        int var15 = var9;
        int var16 = -28 / ((arg4 + 46) / 33);
        while (var15 > var13) {
            class23.method161(var11, -1, arg3, var10, class14.field331[var15]);
            var15--;
        }
        int var17 = class56.method391(16777215, class40.field869, class235.field4336, arg6 + arg7);
        int var18 = class56.method391(16777215, class40.field869, class235.field4336, arg1 - arg6);
        for (int var19 = var12; var19 <= var13; var19++) {
            int[] var20 = class14.field331[var19];
            class23.method161(var17, -1, arg3, var10, var20);
            class23.method161(var18, -1, arg0, var17, var20);
            class23.method161(var11, -1, arg3, var18, var20);
        }
    }
}
