import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qj")
public class class512 {

    @OriginalMember(owner = "client!qj", name = "h", descriptor = "I")
    public static int field6798 = 0;

    @OriginalMember(owner = "client!qj", name = "i", descriptor = "J")
    public static long field6799 = 0L;

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "I")
    public static int field6791;

    @OriginalMember(owner = "client!qj", name = "b", descriptor = "I")
    public static int field6792;

    @OriginalMember(owner = "client!qj", name = "c", descriptor = "I")
    public static int field6793;

    @OriginalMember(owner = "client!qj", name = "f", descriptor = "I")
    public static int field6796;

    @OriginalMember(owner = "client!qj", name = "g", descriptor = "I")
    public static int field6797;

    @OriginalMember(owner = "client!qj", name = "e", descriptor = "Lofa;")
    public static class333 field6795;

    @OriginalMember(owner = "client!qj", name = "d", descriptor = "[Lhu;")
    public static class133[] field6794;

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(I)V")
    public static void method2858(int arg0) {
        field6795 = null;
        int var1 = -72 % ((arg0 + 65) / 53);
        field6794 = null;
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "([Lvfa;IB)V")
    public static final void method2859(class672[] arg0, int arg1, byte arg2) {
        field6797++;
        if (arg2 != -107) {
            field6794 = null;
        }
        for (int var3 = 0; var3 < arg0.length; var3++) {
            class672 var4 = arg0[var3];
            if (var4 != null && var4.field9255 == arg1 && !client.method1883(var4)) {
                if (var4.field9239 == 0) {
                    method2859(arg0, var4.field9200, (byte) -107);
                    if (var4.field9240 != null) {
                        method2859(var4.field9240, var4.field9200, (byte) -107);
                    }
                    class8 var5 = (class8) class350.field4925.method2135((long) var4.field9200, (byte) 31);
                    if (var5 != null) {
                        class288.method1788(-1, var5.field161);
                    }
                }
                if (var4.field9239 == 6 && var4.field9203 != -1) {
                    class456 var6 = class509.field6780.method663((byte) -90, var4.field9203);
                    if (var6 != null) {
                        var4.field9189 += class244.field3417;
                        int var7 = var4.field9192;
                        while (var6.field6225[var4.field9192] < var4.field9189) {
                            var4.field9189 -= var6.field6225[var4.field9192];
                            var4.field9192++;
                            if (var4.field9192 >= var6.field6229.length) {
                                var4.field9192 -= var6.field6242;
                                if (var4.field9192 < 0 || var4.field9192 >= var6.field6229.length) {
                                    var4.field9192 = 0;
                                }
                            }
                            var4.field9237 = var4.field9192 + 1;
                            if (var4.field9237 >= var6.field6229.length) {
                                var4.field9237 -= var6.field6242;
                                if (var4.field9237 < 0 || var6.field6229.length <= var4.field9237) {
                                    var4.field9237 = -1;
                                }
                            }
                            class399.method2347(var4, arg2 + 2367);
                        }
                        if (var4.field9192 != var7) {
                            class532.method2965(var6, false, var4.field9192);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(Lfha;IZ)V")
    public static final void method2860(class383 arg0, int arg1, boolean arg2) {
        field6796++;
        if (class181.field2730 >= 400) {
            return;
        }
        if (arg1 != 0) {
            field6794 = null;
        }
        if (class472.field6475 != arg0) {
            String var3;
            if (arg0.field5329 == 0) {
                boolean var4 = true;
                if (class472.field6475.field5325 != -1 && arg0.field5325 != -1) {
                    int var5 = class472.field6475.field5325 >= arg0.field5325 ? arg0.field5325 : class472.field6475.field5325;
                    int var6 = class472.field6475.field5330 - arg0.field5330;
                    if (var6 < 0) {
                        var6 = -var6;
                    }
                    if (var6 > var5) {
                        var4 = false;
                    }
                }
                String var7 = class683.field9532 == class12.field187 ? class517.field6870.method2877(class713.field9854, (byte) -108) : class517.field6868.method2877(class713.field9854, (byte) -108);
                if (arg0.field5357 > arg0.field5330) {
                    var3 = arg0.method2267(arg1 - 116, true) + (var4 ? class161.method1153(class472.field6475.field5330, false, arg0.field5330) : "<col=ffffff>") + " (" + var7 + arg0.field5330 + "+" + (arg0.field5357 - arg0.field5330) + ")";
                } else {
                    var3 = arg0.method2267(arg1 ^ 0xFFFFFF8C, true) + (var4 ? class161.method1153(class472.field6475.field5330, false, arg0.field5330) : "<col=ffffff>") + " (" + var7 + arg0.field5330 + ")";
                }
            } else if (arg0.field5329 == -1) {
                var3 = arg0.method2267(-116, true);
            } else {
                var3 = arg0.method2267(-116, true) + " (" + class517.field6869.method2877(class713.field9854, (byte) -108) + arg0.field5329 + ")";
            }
            if (class142.field2268 && !arg2 && (class575.field7557 & 0x8) != 0) {
                class586.method3203(true, (long) arg0.field10297, (long) arg0.field10297, false, 0, 60, false, -1, class414.field5733, class719.field10008, (byte) 87, class341.field4808 + " -> <col=ffffff>" + var3, 0);
                class347.field4861++;
            }
            if (arg2) {
                class586.method3203(false, (long) arg0.field10297, 0L, false, 0, -1, true, 0, -1, "<col=cccccc>" + var3, (byte) 87, "", 0);
            } else {
                for (int var8 = 7; var8 >= 0; var8--) {
                    if (class44.field574[var8] != null) {
                        short var9 = 0;
                        if (class683.field9532 == class628.field8355 && class44.field574[var8].equalsIgnoreCase(class517.field6863.method2877(class713.field9854, (byte) -108))) {
                            if (class472.field6475.field5330 < arg0.field5330) {
                                var9 = 2000;
                            }
                            if (class472.field6475.field5326 != 0 && arg0.field5326 != 0) {
                                if (class472.field6475.field5326 == arg0.field5326) {
                                    var9 = 2000;
                                } else {
                                    var9 = 0;
                                }
                            }
                        } else if (class416.field5745[var8]) {
                            var9 = 2000;
                        }
                        short var10 = (short) (class358.field5002[var8] + var9);
                        int var11 = class343.field4826[var8] == -1 ? class456.field6235 : class343.field4826[var8];
                        class586.method3203(true, (long) arg0.field10297, (long) arg0.field10297, false, 0, var10, false, -1, var11, class44.field574[var8], (byte) 87, "<col=ffffff>" + var3, 0);
                        class258.field3578++;
                    }
                }
            }
            if (!arg2) {
                for (class433 var12 = (class433) class446.field6126.method21(2); var12 != null; var12 = (class433) class446.field6126.method9(-128)) {
                    if (var12.field5963 == 45) {
                        var12.field5952 = "<col=ffffff>" + var3;
                        return;
                    }
                }
            }
        } else if (class142.field2268 && (class575.field7557 & 0x10) != 0) {
            class193.field2906++;
            class586.method3203(true, (long) arg0.field10297, 0L, false, 0, 22, false, -1, class414.field5733, class719.field10008, (byte) 87, class341.field4808 + " -> <col=ffffff>" + class517.field6877.method2877(class713.field9854, (byte) -108), 0);
        }
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(BII)I")
    public final int method2861(byte arg0, int arg1, int arg2) {
        field6791++;
        int var4 = class199.field2993 <= arg1 ? arg1 : class199.field2993;
        int var5 = -69 % ((51 - arg0) / 42);
        if (class556.field7330 == this) {
            return 0;
        } else if (class381.field5298 == this) {
            return var4 - arg2;
        } else if (class731.field10137 == this) {
            return (var4 - arg2) / 2;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!qj", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field6792++;
        throw new IllegalStateException();
    }
}
