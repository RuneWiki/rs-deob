import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pg")
public class class73 extends class253 {

    @OriginalMember(owner = "client!pg", name = "x", descriptor = "Ljd;")
    public class85 field1372;

    @OriginalMember(owner = "client!pg", name = "s", descriptor = "Ljd;")
    public static class85 field1367 = class221.method1499("Ladevorgang )2 bitte warten Sie)3", (byte) -70);

    @OriginalMember(owner = "client!pg", name = "u", descriptor = "Ljd;")
    public static class85 field1369 = class221.method1499("Bitte warten Sie )2 es wird versucht)1 die Verbindung wiederherzustellen)3", (byte) 88);

    @OriginalMember(owner = "client!pg", name = "w", descriptor = "Ljd;")
    public static class85 field1371 = class221.method1499("welle2:", (byte) -113);

    @OriginalMember(owner = "client!pg", name = "t", descriptor = "I")
    public static int field1368;

    @OriginalMember(owner = "client!pg", name = "v", descriptor = "I")
    public static int field1370;

    @OriginalMember(owner = "client!pg", name = "y", descriptor = "Lge;")
    public static class68 field1373;

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(Lqb;IIIII)V")
    public static final void method516(class56 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var6 = true;
        int var7 = arg2;
        int var8 = arg2 + arg4;
        int var9 = arg3 - 1;
        int var10 = arg3 + arg5;
        for (int var11 = arg1; var11 <= arg1 + 1; var11++) {
            if (class272.field4811 != var11) {
                for (int var12 = var7; var12 <= var8; var12++) {
                    if (var12 >= 0 && var12 < class122.field2140) {
                        for (int var13 = var9; var13 <= var10; var13++) {
                            if (var13 >= 0 && var13 < class202.field3521 && (!var6 || var12 >= var8 || var13 >= var10 || var13 < arg3 && arg2 != var12)) {
                                class208 var14 = class99.field1780[var11][var12][var13];
                                if (var14 != null) {
                                    int var15 = (class245.field4193[var11][var12 + 1][var13] + class245.field4193[var11][var12][var13] + class245.field4193[var11][var12][var13 + 1] + class245.field4193[var11][var12 + 1][var13 + 1]) / 4 - (class245.field4193[arg1][arg2 + 1][arg3] + class245.field4193[arg1][arg2][arg3] + class245.field4193[arg1][arg2][arg3 + 1] + class245.field4193[arg1][arg2 + 1][arg3 + 1]) / 4;
                                    class233 var16 = var14.field3656;
                                    if (var16 != null) {
                                        if (var16.field4040.method378()) {
                                            arg0.method373(var16.field4040, (var12 - arg2) * 128 + (1 - arg4) * 64, var15, (var13 - arg3) * 128 + (1 - arg5) * 64, var6);
                                        }
                                        if (var16.field4025 != null && var16.field4025.method378()) {
                                            arg0.method373(var16.field4025, (var12 - arg2) * 128 + (1 - arg4) * 64, var15, (var13 - arg3) * 128 + (1 - arg5) * 64, var6);
                                        }
                                    }
                                    for (int var17 = 0; var17 < var14.field3646; var17++) {
                                        class213 var18 = var14.field3650[var17];
                                        if (var18 != null && var18.field3724.method378() && (var18.field3731 == var12 || var7 == var12) && (var18.field3729 == var13 || var9 == var13)) {
                                            int var19 = var18.field3737 + 1 - var18.field3731;
                                            int var20 = var18.field3722 + 1 - var18.field3729;
                                            arg0.method373(var18.field3724, (var18.field3731 - arg2) * 128 + (var19 - arg4) * 64, var15, (var18.field3729 - arg3) * 128 + (var20 - arg5) * 64, var6);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                var7--;
                var6 = false;
            }
        }
    }

    @OriginalMember(owner = "client!pg", name = "d", descriptor = "(I)V")
    public static void method517(int arg0) {
        field1367 = null;
        field1371 = null;
        field1373 = null;
        field1369 = null;
        int var1 = -25 % ((arg0 - 81) / 36);
    }

    @OriginalMember(owner = "client!pg", name = "<init>", descriptor = "()V")
    public class73() {
    }

    @OriginalMember(owner = "client!pg", name = "<init>", descriptor = "(Ljd;I)V")
    public class73(class85 arg0, int arg1) {
        this.field1372 = arg0;
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(IIILge;)[Lc;")
    public static final class103[] method518(int arg0, int arg1, int arg2, class68 arg3) {
        field1370++;
        if (class253.method1750(arg1, arg3, (byte) 125, arg2)) {
            int var4 = -33 / ((59 - arg0) / 36);
            return class28.method196(3);
        } else {
            return null;
        }
    }
}
