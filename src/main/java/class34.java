import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!va")
public class class34 extends class135 {

    @OriginalMember(owner = "client!va", name = "I", descriptor = "Luk;")
    public class98 field440;

    @OriginalMember(owner = "client!va", name = "A", descriptor = "[B")
    public static byte[] field432 = new byte[520];

    @OriginalMember(owner = "client!va", name = "D", descriptor = "I")
    public static int field435 = 0;

    @OriginalMember(owner = "client!va", name = "E", descriptor = "Lpk;")
    public static class100 field436 = new class100(512);

    @OriginalMember(owner = "client!va", name = "M", descriptor = "[I")
    public static int[] field443 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!va", name = "N", descriptor = "I")
    public static int field444 = 2;

    @OriginalMember(owner = "client!va", name = "z", descriptor = "I")
    public static int field431;

    @OriginalMember(owner = "client!va", name = "B", descriptor = "I")
    public static int field433;

    @OriginalMember(owner = "client!va", name = "C", descriptor = "I")
    public static int field434;

    @OriginalMember(owner = "client!va", name = "F", descriptor = "I")
    public static int field437;

    @OriginalMember(owner = "client!va", name = "G", descriptor = "I")
    public static int field438;

    @OriginalMember(owner = "client!va", name = "H", descriptor = "I")
    public static int field439;

    @OriginalMember(owner = "client!va", name = "J", descriptor = "I")
    public static int field441;

    @OriginalMember(owner = "client!va", name = "L", descriptor = "Ljava/lang/String;")
    public static String field442;

    @OriginalMember(owner = "client!va", name = "y", descriptor = "[Lhc;")
    public static class229[] field430;

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(ZBLdl;Ldl;)V")
    public static final void method268(boolean arg0, byte arg1, class123 arg2, class123 arg3) {
        if (arg1 < 103) {
            field443 = null;
        }
        field431++;
        class215.field3503 = arg2;
        class97.field1495 = arg0;
        class5.field73 = arg3;
    }

    @OriginalMember(owner = "client!va", name = "b", descriptor = "(II)Ljava/lang/String;")
    public static final String method269(int arg0, int arg1) {
        field441++;
        if (arg1 == 250) {
            return arg0 < 999999999 ? Integer.toString(arg0) : "*";
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(IBIIII)V")
    public static final void method270(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = arg5 - arg0;
        field437++;
        int var7 = arg2 - arg3;
        if (var7 == 0) {
            if (var6 != 0) {
                class23.method160(arg3, 116, arg4, arg5, arg0);
            }
        } else if (var6 == 0) {
            class47.method358((byte) -84, arg2, arg4, arg3, arg0);
        } else {
            if (var7 < 0) {
                var7 = -var7;
            }
            if (var6 < 0) {
                var6 = -var6;
            }
            boolean var8 = var6 > var7;
            if (var8) {
                int var9 = arg3;
                int var10 = arg2;
                arg3 = arg0;
                arg2 = arg5;
                arg0 = var9;
                arg5 = var10;
            }
            if (arg2 < arg3) {
                int var11 = arg3;
                arg3 = arg2;
                arg2 = var11;
                int var12 = arg0;
                arg0 = arg5;
                arg5 = var12;
            }
            int var13 = arg0;
            int var14 = 62 % ((arg1 + 7) / 48);
            int var15 = arg5 - arg0;
            int var16 = arg2 - arg3;
            int var17 = arg5 <= arg0 ? -1 : 1;
            int var18 = -(var16 >> 1);
            if (var15 < 0) {
                var15 = -var15;
            }
            if (var8) {
                for (int var20 = arg3; var20 <= arg2; var20++) {
                    class106.field1637[var20][var13] = arg4;
                    var18 += var15;
                    if (var18 > 0) {
                        var18 -= var16;
                        var13 += var17;
                    }
                }
            } else {
                for (int var19 = arg3; var19 <= arg2; var19++) {
                    class106.field1637[var13][var19] = arg4;
                    var18 += var15;
                    if (var18 > 0) {
                        var13 += var17;
                        var18 -= var16;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(IB)I")
    public static final int method271(int arg0, byte arg1) {
        field438++;
        if (arg0 < 0) {
            return 0;
        }
        class33 var2 = (class33) class82.field1233.method665((byte) 101, (long) arg0);
        if (var2 == null) {
            return class157.method1062(5, arg0).field3761;
        }
        int var3 = 0;
        int var4 = 115 / ((arg1 + 60) / 33);
        for (int var5 = 0; var5 < var2.field426.length; var5++) {
            if (var2.field426[var5] == -1) {
                var3++;
            }
        }
        return var3 + class157.method1062(5, arg0).field3761 - var2.field426.length;
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(BLjava/lang/String;Z)V")
    public static final void method272(byte arg0, String arg1, boolean arg2) {
        field434++;
        byte var3 = 4;
        if (arg0 < 3) {
            method274((byte) -65);
        }
        int var4 = class279.field4433.method1305(arg1, 250);
        int var5 = var3 + 6;
        int var6 = class279.field4433.method1304(arg1, 250) * 13;
        int var7 = var3 + 6;
        class127.method876(var5 - var3, -var3 + var7, var4 + var3 + var3, var3 + var6 + var3, 0);
        class127.method855(var5 - var3, -var3 + var7, var3 + var4 + var3, var6 - -var3 + var3, 16777215);
        class279.field4433.method1323(arg1, var5, var7, var4, var6, 16777215, -1, 1, 1, 0);
        class286.method1908(var3 + var4 + var3, 31, var7 - var3, -var3 + var5, var6 + var3 + var3);
        if (!arg2) {
            class79.method532(var5, var4, var7, var6, 2);
            return;
        }
        try {
            Graphics var8 = class86.field1364.getGraphics();
            class26.field369.method295(true, 0, var8, 0);
        } catch (Exception var9) {
            class86.field1364.repaint();
        }
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(IIZI)I")
    public static final int method273(int arg0, int arg1, boolean arg2, int arg3) {
        field439++;
        if (arg2) {
            method275((byte) 45);
        }
        if (arg1 >= arg3) {
            return arg0 < arg1 ? arg0 : arg1;
        } else {
            return arg3;
        }
    }

    @OriginalMember(owner = "client!va", name = "b", descriptor = "(B)V")
    public static void method274(byte arg0) {
        field443 = null;
        field442 = null;
        field430 = null;
        field432 = null;
        if (arg0 != -126) {
            field432 = null;
        }
        field436 = null;
    }

    @OriginalMember(owner = "client!va", name = "c", descriptor = "(B)Lhc;")
    public static final class229 method275(byte arg0) {
        field433++;
        int var1 = class236.field3777[0] * class228.field3696[0];
        int[] var2 = new int[var1];
        byte[] var3 = class101.field1574[0];
        for (int var4 = 0; var4 < var1; var4++) {
            var2[var4] = class72.field1023[class224.method1526(255, var3[var4])];
        }
        int var5 = -13 % ((arg0 - 1) / 43);
        class12 var6 = new class12(class46.field583, class209.field3253, class206.field3221[0], class226.field3653[0], class236.field3777[0], class228.field3696[0], var2);
        class222.method1506((byte) 106);
        return var6;
    }

    @OriginalMember(owner = "client!va", name = "<init>", descriptor = "(Luk;)V")
    public class34(class98 arg0) {
        this.field440 = arg0;
    }
}
