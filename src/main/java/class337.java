import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bi")
public class class337 {

    @OriginalMember(owner = "client!bi", name = "d", descriptor = "S")
    public static short field4461 = 256;

    @OriginalMember(owner = "client!bi", name = "b", descriptor = "Ljc;")
    public static class305 field4459 = new class305(" has logged in.", " loggt sich ein.", " s'est connecté.", " entrou no jogo.");

    @OriginalMember(owner = "client!bi", name = "h", descriptor = "[I")
    public static int[] field4465 = new int[1024];

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "I")
    public static int field4458;

    @OriginalMember(owner = "client!bi", name = "c", descriptor = "I")
    public static int field4460;

    @OriginalMember(owner = "client!bi", name = "e", descriptor = "I")
    public static int field4462;

    @OriginalMember(owner = "client!bi", name = "f", descriptor = "I")
    public static int field4463;

    @OriginalMember(owner = "client!bi", name = "g", descriptor = "I")
    public static int field4464;

    @OriginalMember(owner = "client!bi", name = "j", descriptor = "Lo;")
    public static class24 field4467;

    @OriginalMember(owner = "client!bi", name = "i", descriptor = "Lfo;")
    public static class361 field4466;

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(B)V", line = 5)
    public static final void method1963(byte arg0) {
        int var1 = -41 / ((arg0 + 12) / 52);
        class275.field3667.method1139(((float) class319.field4256.field4667 * 0.1F + 0.7F) * class189.field2447);
        field4462++;
        class275.field3667.method1181(class514.field7476, class53.field619, class148.field1944, (float) (class229.field3082 << 0), (float) (class70.field818 << 0), (float) (class419.field6090 << 0));
        class275.field3667.method1159(class253.field3372);
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(IIIII)V", line = 19)
    public static final void method1964(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field4463++;
        int var5 = 0;
        int var6 = arg2;
        int var7 = -arg2;
        int var8 = -1;
        int var9 = class406.method2491(class307.field4111, false, class91.field1086, arg0 + arg2);
        if (arg3 != -25746) {
            return;
        }
        int var10 = class406.method2491(class307.field4111, false, class91.field1086, arg0 - arg2);
        class476.method2907(var9, 96, arg1, class5.field54[arg4], var10);
        while (var6 > var5) {
            var8 += 2;
            var7 += var8;
            if (var7 > 0) {
                var6--;
                var7 -= var6 << 1;
                int var11 = arg4 - var6;
                int var12 = arg4 + var6;
                if (class169.field2184 <= var12 && var11 <= class386.field5620) {
                    int var13 = class406.method2491(class307.field4111, false, class91.field1086, arg0 + var5);
                    int var14 = class406.method2491(class307.field4111, false, class91.field1086, arg0 - var5);
                    if (var12 <= class386.field5620) {
                        class476.method2907(var13, arg3 ^ 0xFFFF9B55, arg1, class5.field54[var12], var14);
                    }
                    if (var11 >= class169.field2184) {
                        class476.method2907(var13, 116, arg1, class5.field54[var11], var14);
                    }
                }
            }
            var5++;
            int var15 = arg4 - var5;
            int var16 = arg4 + var5;
            if (var16 >= class169.field2184 && var15 <= class386.field5620) {
                int var17 = class406.method2491(class307.field4111, false, class91.field1086, arg0 + var6);
                int var18 = class406.method2491(class307.field4111, false, class91.field1086, arg0 - var6);
                if (class386.field5620 >= var16) {
                    class476.method2907(var17, arg3 + 25814, arg1, class5.field54[var16], var18);
                }
                if (class169.field2184 <= var15) {
                    class476.method2907(var17, 71, arg1, class5.field54[var15], var18);
                }
            }
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(III)I", line = 97)
    public static final int method1965(int arg0, int arg1, int arg2) {
        field4458++;
        if (arg1 == 4 || arg1 == 5) {
            return class430.field6260[arg2 & 0x3];
        } else {
            int var3 = 32 / ((-arg0 - 44) / 56);
            return 256;
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(I)V", line = 114)
    public static void method1966(int arg0) {
        field4467 = null;
        field4459 = null;
        field4465 = null;
        field4466 = null;
        if (arg0 >= -95) {
            field4461 = 42;
        }
    }
}
