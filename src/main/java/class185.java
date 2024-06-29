import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bn")
public class class185 {

    @OriginalMember(owner = "client!bn", name = "b", descriptor = "Lce;")
    public static class126 field3198 = class206.method1445(-7923, "Votre liste d(Wamis est pleine (X100 noms maximum pour la version gratuite et 200 pour les abonn-Bs(Y)3");

    @OriginalMember(owner = "client!bn", name = "d", descriptor = "[I")
    public static int[] field3200 = new int[] { 12543016, 15504954, 15914854, 16773818 };

    @OriginalMember(owner = "client!bn", name = "f", descriptor = "Lvc;")
    public static class129 field3202 = new class129();

    @OriginalMember(owner = "client!bn", name = "j", descriptor = "I")
    public static volatile int field3206 = 0;

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "I")
    public static int field3197;

    @OriginalMember(owner = "client!bn", name = "c", descriptor = "I")
    public static int field3199;

    @OriginalMember(owner = "client!bn", name = "g", descriptor = "I")
    public static int field3203;

    @OriginalMember(owner = "client!bn", name = "h", descriptor = "I")
    public static int field3204;

    @OriginalMember(owner = "client!bn", name = "i", descriptor = "I")
    public static int field3205;

    @OriginalMember(owner = "client!bn", name = "e", descriptor = "[Z")
    public static boolean[] field3201;

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(II)Lte;", line = 17)
    public static final class265 method1338(int arg0, int arg1) {
        field3199++;
        class265 var2 = (class265) class78.field1274.method1173(-19839, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class306.field5135.method2173(class119.method781(false, arg0), class125.method831((byte) -22, arg0), (byte) -50);
        class265 var4 = new class265();
        if (arg1 != -7153) {
            method1338(-6, -48);
        }
        var4.field4481 = arg0;
        if (var3 != null) {
            var4.method1784(new class134(var3), arg1 ^ 0x7135);
        }
        var4.method1786(-11);
        if (!class286.field4734 && var4.field4425) {
            var4.field4484 = null;
        }
        if (var4.field4443) {
            var4.field4470 = 0;
            var4.field4483 = false;
        }
        class78.field1274.method1179(var4, (long) arg0, (byte) -72);
        return var4;
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(Z)V", line = 56)
    public static void method1339(boolean arg0) {
        if (arg0) {
            method1339(true);
        }
        field3200 = null;
        field3201 = null;
        field3202 = null;
        field3198 = null;
    }

    @OriginalMember(owner = "client!bn", name = "b", descriptor = "(II)V", line = 71)
    public static final void method1340(int arg0, int arg1) {
        class245 var2 = class139.method1022(5, (byte) -121, arg1);
        field3203++;
        var2.method1682(121);
        if (arg0 >= -82) {
            method1339(false);
        }
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(IILwd;I)V", line = 90)
    public static final void method1341(int arg0, int arg1, class112 arg2, int arg3) {
        field3197++;
        if (class82.field1324 != null || class51.field783 || arg2 == null || class186.method1344(-107, arg2) == null) {
            return;
        }
        class82.field1324 = arg2;
        class88.field1378 = class186.method1344(-73, arg2);
        class102.field1638 = arg0;
        class306.field5131 = 0;
        class17.field232 = false;
        class174.field3085 = arg3;
        int var4 = -55 / ((86 - arg1) / 37);
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(IIIIZ)V", line = 123)
    public static final void method1342(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        int var5 = 0;
        int var6 = arg0;
        field3204++;
        int var7 = -1;
        int var8 = -arg0;
        int var9 = class94.method645(class321.field5489, 0, arg0 + arg2, class52.field795);
        int var10 = class94.method645(class321.field5489, 0, arg2 - arg0, class52.field795);
        class94.method647(class314.field5393[arg3], var10, -7, var9, arg1);
        while (var5 < var6) {
            var7 += 2;
            var8 += var7;
            if (var8 > 0) {
                var6--;
                var8 -= var6 << 1;
                int var11 = arg3 - var6;
                int var12 = arg3 + var6;
                if (var12 >= class197.field3372 && class194.field3302 >= var11) {
                    int var13 = class94.method645(class321.field5489, 0, arg2 + var5, class52.field795);
                    int var14 = class94.method645(class321.field5489, 0, arg2 - var5, class52.field795);
                    if (var12 <= class194.field3302) {
                        class94.method647(class314.field5393[var12], var14, -7, var13, arg1);
                    }
                    if (class197.field3372 <= var11) {
                        class94.method647(class314.field5393[var11], var14, -7, var13, arg1);
                    }
                }
            }
            var5++;
            int var15 = arg3 + var5;
            int var16 = arg3 - var5;
            if (class197.field3372 <= var15 && var16 <= class194.field3302) {
                int var17 = class94.method645(class321.field5489, 0, arg2 + var6, class52.field795);
                int var18 = class94.method645(class321.field5489, 0, arg2 - var6, class52.field795);
                if (var15 <= class194.field3302) {
                    class94.method647(class314.field5393[var15], var18, -7, var17, arg1);
                }
                if (class197.field3372 <= var16) {
                    class94.method647(class314.field5393[var16], var18, -7, var17, arg1);
                }
            }
        }
        if (!arg4) {
            method1339(false);
        }
    }
}
