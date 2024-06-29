import java.awt.Canvas;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jq")
public abstract class class200 {

    @OriginalMember(owner = "client!jq", name = "e", descriptor = "I")
    public static int field2777;

    @OriginalMember(owner = "client!jq", name = "k", descriptor = "I")
    public static int field2783 = field2777 >> 2;

    @OriginalMember(owner = "client!jq", name = "g", descriptor = "I")
    public static int field2779 = field2777;

    @OriginalMember(owner = "client!jq", name = "j", descriptor = "Lsd;")
    public static class74 field2782 = new class74(7, -1);

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "I")
    public int field2773;

    @OriginalMember(owner = "client!jq", name = "d", descriptor = "I")
    public static int field2776;

    @OriginalMember(owner = "client!jq", name = "f", descriptor = "I")
    public static int field2778;

    @OriginalMember(owner = "client!jq", name = "h", descriptor = "I")
    public int field2780;

    @OriginalMember(owner = "client!jq", name = "b", descriptor = "Lbi;")
    public static class150 field2774;

    @OriginalMember(owner = "client!jq", name = "i", descriptor = "Lg;")
    public static class470 field2781;

    @OriginalMember(owner = "client!jq", name = "c", descriptor = "[I")
    public int[] field2775;

    @OriginalMember(owner = "client!jq", name = "l", descriptor = "[[Lqe;")
    public static class160[][] field2784;

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(Lrs;IIIII)V")
    public static final void method1095(class258 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        arg0.field3730 = 0;
        for (int var6 = 0; var6 < 4; var6++) {
            if (arg0.field3732[var6] != null) {
                arg0.field3730++;
            }
        }
        label50: for (int var7 = 0; var7 < arg0.field3730; var7++) {
            long var8 = class382.field5424[arg1][arg2][arg3];
            while (var8 != 0L) {
                class326 var14 = class364.field5236[(int) ((var8 & 0xFFFFL) - 1L)];
                var8 >>>= 0x10;
                if (arg0.field3732[var7] == var14) {
                    continue label50;
                }
            }
            long var10 = class382.field5424[arg1][arg4][arg5];
            while (var10 != 0L) {
                class326 var13 = class364.field5236[(int) ((var10 & 0xFFFFL) - 1L)];
                var10 >>>= 0x10;
                if (arg0.field3732[var7] == var13) {
                    continue label50;
                }
            }
            for (int var12 = var7; var12 < arg0.field3730 - 1; var12++) {
                arg0.field3732[var12] = arg0.field3732[var12 + 1];
            }
            arg0.field3730--;
        }
    }

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(II)I")
    public static final int method1096(int arg0, int arg1) {
        field2778++;
        if (arg1 == -1) {
            return arg0 == 16711935 ? -1 : class154.method746(arg0, (byte) -126);
        } else {
            return 97;
        }
    }

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(ILjava/awt/Canvas;)V")
    public abstract void method146(int arg0, Canvas arg1);

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(I)V")
    public static void method1097(int arg0) {
        field2781 = null;
        field2774 = null;
        field2784 = null;
        if (arg0 == -22064) {
            field2782 = null;
        }
    }

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(Lph;III[Z)V")
    public static final void method1098(class125 arg0, int arg1, int arg2, int arg3, boolean[] arg4) {
        if (class398.field5667 == class361.field5208) {
            return;
        }
        int var5 = class443.field6329[arg1].method1857(arg2, arg3);
        for (int var6 = 0; var6 <= arg1; var6++) {
            if (arg4 == null || arg4[var6]) {
                class443 var7 = class443.field6329[var6];
                if (var7 != null) {
                    var7.method1858(arg0, arg2, var5 - var7.method1857(arg2, arg3), arg3, 0, false);
                }
            }
        }
    }

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(IIIILjava/awt/Graphics;I)V")
    public abstract void method147(int arg0, int arg1, int arg2, int arg3, Graphics arg4, int arg5);

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(IIILjava/awt/Graphics;)V")
    public abstract void method145(int arg0, int arg1, int arg2, Graphics arg3);

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(ZILcj;)V")
    public static final void method1099(boolean arg0, int arg1, class198 arg2) {
        int var3 = -105 % ((arg1 - 75) / 40);
        field2776++;
        if (class223.field3099 >= 400 || class19.field258 == arg2) {
            return;
        }
        String var10;
        if (arg2.field2743 == 0) {
            boolean var4 = true;
            if (class19.field258.field2749 != -1 && arg2.field2749 != -1) {
                int var5 = class19.field258.field2726 > arg2.field2726 ? class19.field258.field2726 : arg2.field2726;
                int var6 = class19.field258.field2749 >= arg2.field2749 ? arg2.field2749 : class19.field258.field2749;
                int var7 = var5 * 10 / 100 + var6 + 5;
                int var8 = class19.field258.field2726 - arg2.field2726;
                if (var8 < 0) {
                    var8 = -var8;
                }
                if (var7 < var8) {
                    var4 = false;
                }
            }
            String var9 = class289.field4317 == class262.field3772 ? class291.field4326.method205((byte) 114, class68.field849) : class349.field5016.method205((byte) 110, class68.field849);
            if (arg2.field2733 <= arg2.field2726) {
                var10 = arg2.method1084(true, -78) + (var4 ? class62.method319(class19.field258.field2726, arg2.field2726, 9) : "<col=ffffff>") + " (" + var9 + arg2.field2726 + ")";
            } else {
                var10 = arg2.method1084(true, -115) + (var4 ? class62.method319(class19.field258.field2726, arg2.field2726, 9) : "<col=ffffff>") + " (" + var9 + arg2.field2726 + "+" + (arg2.field2733 - arg2.field2726) + ")";
            }
        } else {
            var10 = arg2.method1084(true, 123) + " (" + class74.field892.method205((byte) 104, class68.field849) + arg2.field2743 + ")";
        }
        if (class293.field4359) {
            if (!arg0 && (class284.field4135 & 0x8) != 0) {
                class362.field5209++;
                client.method1672((long) arg2.field2457, 0, 4, -1, class435.field6264, class390.field5570, 0, false, class126.field1543 + " -> <col=ffffff>" + var10, 7520, true);
            }
        } else if (arg0) {
            client.method1672(0L, 0, -1, 0, -1, "<col=cccccc>" + var10, 0, true, "", 7520, false);
        } else {
            for (int var11 = 7; var11 >= 0; var11--) {
                if (class451.field6377[var11] != null) {
                    short var12 = 0;
                    if (class475.field6675 == class289.field4317 && class451.field6377[var11].equalsIgnoreCase(class347.field4951.method205((byte) 105, class68.field849))) {
                        if (arg2.field2726 > class19.field258.field2726) {
                            var12 = 2000;
                        }
                        if (class19.field258.field2744 != 0 && arg2.field2744 != 0) {
                            if (class19.field258.field2744 == arg2.field2744) {
                                var12 = 2000;
                            } else {
                                var12 = 0;
                            }
                        }
                    } else if (class397.field5642[var11]) {
                        var12 = 2000;
                    }
                    short var13 = (short) (class289.field4315[var11] + var12);
                    int var14 = class237.field3284[var11] == -1 ? class66.field835 : class237.field3284[var11];
                    client.method1672((long) arg2.field2457, 0, var13, -1, var14, class451.field6377[var11], 0, false, "<col=ffffff>" + var10, 7520, true);
                    class486.field6887++;
                }
            }
        }
        if (arg0) {
            return;
        }
        for (class158 var15 = (class158) class485.field6882.method802((byte) 124); var15 != null; var15 = (class158) class485.field6882.method806((byte) 104)) {
            if (var15.field1889 == 9) {
                var15.field1874 = "<col=ffffff>" + var10;
                return;
            }
        }
    }
}
