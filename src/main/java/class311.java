import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ct")
public class class311 implements class373 {

    @OriginalMember(owner = "client!ct", name = "f", descriptor = "I")
    public static int field4746 = 1339;

    @OriginalMember(owner = "client!ct", name = "b", descriptor = "[C")
    public static char[] field4742 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

    @OriginalMember(owner = "client!ct", name = "c", descriptor = "Lpu;")
    public static class179 field4743 = new class179("You can't add yourself to your own friends list.", "Du kannst dich nicht auf deine eigene Freunde-Liste setzen!", "Vous ne pouvez pas ajouter votre nom à votre liste d'amis.", "Você não pode adicionar a si próprio à sua lista de amigos.");

    @OriginalMember(owner = "client!ct", name = "g", descriptor = "Lpn;")
    public static class49 field4747 = new class49(17, 8);

    @OriginalMember(owner = "client!ct", name = "h", descriptor = "Leg;")
    private static class34 field4748 = new class34("", 13);

    @OriginalMember(owner = "client!ct", name = "i", descriptor = "I")
    public static int field4749 = 0;

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "I")
    public static int field4741;

    @OriginalMember(owner = "client!ct", name = "d", descriptor = "I")
    public static int field4744;

    @OriginalMember(owner = "client!ct", name = "e", descriptor = "I")
    public static int field4745;

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(I)V")
    public static void method2064(int arg0) {
        field4747 = null;
        field4743 = null;
        if (arg0 == 122) {
            field4748 = null;
            field4742 = null;
        }
    }

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(IIII)V")
    public static final void method2065(int arg0, int arg1, int arg2, int arg3) {
        field4741++;
        if (arg1 == 1010) {
            class152.method1089(class430.field6378, arg3, arg0);
        } else if (arg1 == 1006) {
            class152.method1089(class435.field6487, arg3, arg0);
        } else if (arg1 == 1001) {
            class152.method1089(class122.field1846, arg3, arg0);
        } else if (arg1 == 1009) {
            class152.method1089(field4748, arg3, arg0);
        } else if (arg1 == 1002) {
            class152.method1089(class87.field1430, arg3, arg0);
        }
        if (arg2 != 22993) {
            field4748 = null;
        }
    }

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(Lza;Lps;IIIII)V")
    public static final void method2066(class299 arg0, class352 arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        boolean var7 = true;
        int var8 = arg3;
        int var9 = arg3 + arg5;
        int var10 = arg4 - 1;
        int var11 = arg4 + arg6;
        for (int var12 = arg2; var12 <= arg2 + 1; var12++) {
            if (class183.field2802 != var12) {
                for (int var13 = var8; var13 <= var9; var13++) {
                    if (var13 >= 0 && var13 < class474.field6947) {
                        for (int var14 = var10; var14 <= var11; var14++) {
                            if (var14 >= 0 && var14 < class443.field6603 && (!var7 || var13 >= var9 || var14 >= var11 || var14 < arg4 && arg3 != var13)) {
                                class281 var15 = class348.field5192[var12][var13][var14];
                                if (var15 != null) {
                                    int var16 = (class407.field6024[var12].method56(var13, var14) + class407.field6024[var12].method56(var13 + 1, var14) + class407.field6024[var12].method56(var13, var14 + 1) + class407.field6024[var12].method56(var13 + 1, var14 + 1)) / 4 - (class407.field6024[arg2].method56(arg3, arg4) + class407.field6024[arg2].method56(arg3 + 1, arg4) + class407.field6024[arg2].method56(arg3, arg4 + 1) + class407.field6024[arg2].method56(arg3 + 1, arg4 + 1)) / 4;
                                    class501 var17 = var15.field4380;
                                    class501 var18 = var15.field4390;
                                    if (var17 != null && var17.method107((byte) -88)) {
                                        arg1.method102(arg0, var16, (var13 - arg3) * class90.field1454 + (1 - arg5) * class74.field1258, -750, var17, (var14 - arg4) * class90.field1454 + (1 - arg6) * class74.field1258, var7);
                                    }
                                    if (var18 != null && var18.method107((byte) -88)) {
                                        arg1.method102(arg0, var16, (var13 - arg3) * class90.field1454 + (1 - arg5) * class74.field1258, -750, var18, (var14 - arg4) * class90.field1454 + (1 - arg6) * class74.field1258, var7);
                                    }
                                    for (class21 var19 = var15.field4381; var19 != null; var19 = var19.field235) {
                                        class76 var20 = var19.field240;
                                        if (var20 != null && var20.method107((byte) -88) && (var20.field1283 == var13 || var8 == var13) && (var20.field1277 == var14 || var10 == var14)) {
                                            int var21 = var20.field1271 + 1 - var20.field1283;
                                            int var22 = var20.field1272 + 1 - var20.field1277;
                                            arg1.method102(arg0, var16, (var20.field1283 - arg3) * class90.field1454 + (var21 - arg5) * class74.field1258, -750, var20, (var20.field1277 - arg4) * class90.field1454 + (var22 - arg6) * class74.field1258, var7);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                var8--;
                var7 = false;
            }
        }
    }

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(Ljava/lang/String;CB)I")
    public static final int method2067(String arg0, char arg1, byte arg2) {
        if (arg2 <= 17) {
            method2064(66);
        }
        field4745++;
        int var3 = 0;
        int var4 = arg0.length();
        for (int var5 = 0; var5 < var4; var5++) {
            if (arg0.charAt(var5) == arg1) {
                var3++;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(Lsc;JI[I)Ljava/lang/String;")
    public final String method2068(class270 arg0, long arg1, int arg2, int[] arg3) {
        field4744++;
        if (class87.field1429 == arg0) {
            class163 var6 = class250.field4080.method160(arg2 + 21723, arg3[0]);
            return var6.method1169(-20642, (int) arg1);
        } else if (class183.field2803 == arg0 || class29.field309 == arg0) {
            class221 var7 = class300.field4608.method2088((int) arg1, arg2 ^ 0x380);
            return var7.field3377;
        } else if (class23.field261 == arg0 || class487.field7123 == arg0 || class54.field830 == arg0) {
            return class250.field4080.method160(22732, arg3[0]).method1169(-20642, (int) arg1);
        } else if (arg2 == 1009) {
            return null;
        } else {
            return null;
        }
    }
}
