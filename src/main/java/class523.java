import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pu")
public class class523 {

    @OriginalMember(owner = "client!pu", name = "b", descriptor = "Llga;")
    private class663 field7096 = new class663(256);

    @OriginalMember(owner = "client!pu", name = "d", descriptor = "Lfa;")
    private class212 field7098;

    @OriginalMember(owner = "client!pu", name = "k", descriptor = "Llj;")
    private class565 field7105;

    @OriginalMember(owner = "client!pu", name = "i", descriptor = "[I")
    public static int[] field7103 = null;

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "I")
    public static int field7095;

    @OriginalMember(owner = "client!pu", name = "g", descriptor = "I")
    public static int field7101;

    @OriginalMember(owner = "client!pu", name = "h", descriptor = "I")
    public static int field7102;

    @OriginalMember(owner = "client!pu", name = "j", descriptor = "I")
    public static int field7104;

    @OriginalMember(owner = "client!pu", name = "l", descriptor = "I")
    public static int field7106;

    @OriginalMember(owner = "client!pu", name = "m", descriptor = "I")
    public static int field7107;

    @OriginalMember(owner = "client!pu", name = "f", descriptor = "Lrt;")
    public static class208 field7100;

    @OriginalMember(owner = "client!pu", name = "c", descriptor = "Lsea;")
    public static class648 field7097;

    @OriginalMember(owner = "client!pu", name = "e", descriptor = "[[B")
    public static byte[][] field7099;

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "([BIZ)V")
    public static final void method2979(byte[] arg0, int arg1, boolean arg2) {
        if (class342.field4591 == null) {
            class342.field4591 = new class501(20000);
        }
        int var3 = -28 / ((arg1 + 54) / 62);
        field7106++;
        class342.field4591.method2873(arg0.length, 0, arg0, -29981);
        if (!arg2) {
            return;
        }
        class116.method829(true, class342.field4591.field6855);
        class362.field4777 = new class228[class368.field4964];
        int var4 = 0;
        for (int var5 = class301.field4171; var5 <= class244.field3325; var5++) {
            class228 var6 = class250.method1540(24510, var5);
            if (var6 != null) {
                class362.field4777[var4++] = var6;
            }
        }
        class330.field4462 = false;
        class311.field4309 = class577.method3295((byte) 15);
        class342.field4591 = null;
    }

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "(I)V")
    public static final void method2980(int arg0) {
        if (arg0 != 64) {
            return;
        }
        field7101++;
        if (class334.field4506 == null) {
            return;
        }
        class300.field4089.method3905((byte) -79);
        class256.method1575();
        class273.method1694((byte) 19);
        class187.method1286(-2);
        class445.method2521((byte) 83);
        class239.method1498(1);
        if (class261.field3549 != null) {
            class261.field3549.method2387(-126);
        }
        class255.method1572((byte) -32);
        class63.method526(false);
        class527.method3007((byte) -13);
        class329.method1957(0);
        class152.method1095(false, true);
        for (int var1 = 0; var1 < 2048; var1++) {
            class677 var5 = class671.field9407[var1];
            if (var5 != null) {
                for (int var6 = 0; var6 < var5.field1806.length; var6++) {
                    var5.field1806[var6] = null;
                }
            }
        }
        for (int var2 = 0; var2 < class254.field3465; var2++) {
            class61 var3 = class31.field400[var2].field5552;
            if (var3 != null) {
                for (int var4 = 0; var4 < var3.field1806.length; var4++) {
                    var3.field1806[var4] = null;
                }
            }
        }
        class250.field3403 = null;
        class524.field7112 = null;
        class334.field4506.method1168(arg0 ^ 0x70);
        class334.field4506 = null;
    }

    @OriginalMember(owner = "client!pu", name = "b", descriptor = "(I)V")
    public final void method2981(int arg0) {
        if (arg0 != 15006) {
            method2979(null, 32, false);
        }
        this.field7096.method3754(5, true);
        field7095++;
    }

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "(Z)V")
    public final void method2982(boolean arg0) {
        field7102++;
        if (arg0) {
            field7097 = null;
        }
        this.field7096.method3749(7648);
    }

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "(II)Lcw;")
    public final class164 method2983(int arg0, int arg1) {
        field7104++;
        Object var3 = this.field7096.method3747((byte) -66, (long) arg1);
        if (var3 != null) {
            return (class164) var3;
        } else if (!this.field7098.method1367(arg1, false)) {
            return null;
        } else if (arg0 <= 55) {
            return null;
        } else {
            class686 var4 = this.field7098.method1365(-17951, arg1);
            int var5 = var4.field9795 ? 64 : this.field7105.field7817;
            class164 var7;
            if (var4.field9786 && this.field7105.method120()) {
                float[] var6 = this.field7098.method1369(0.7F, var5, true, arg1, var5, false);
                var7 = new class164(this.field7105, 3553, 34842, var5, var5, var4.field9780 != 0, var6, 6408);
            } else {
                int[] var8;
                if (!var4.field9784 && class67.method562((byte) -18, var4.field9797)) {
                    var8 = this.field7098.method1366(true, arg1, var5, 0.7F, var5, (byte) -113);
                } else {
                    var8 = this.field7098.method1370(0.7F, false, var5, (byte) -16, var5, arg1);
                }
                var7 = new class164(this.field7105, 3553, 6408, var5, var5, var4.field9780 != 0, var8, 0, 0, false);
            }
            var7.method1151(var4.field9792, 39, var4.field9781);
            this.field7096.method3748((long) arg1, var7, 12537);
            return var7;
        }
    }

    @OriginalMember(owner = "client!pu", name = "c", descriptor = "(I)V")
    public static void method2984(int arg0) {
        field7097 = null;
        if (arg0 <= -81) {
            field7103 = null;
            field7099 = null;
            field7100 = null;
        }
    }

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "(ZILjava/lang/String;Ljava/lang/String;ZZI)V")
    public static final void method2985(boolean arg0, int arg1, String arg2, String arg3, boolean arg4, boolean arg5, int arg6) {
        class697.field9899.field8990 = 1;
        if (arg4) {
            field7100 = null;
        }
        field7107++;
        String var7 = arg2.toLowerCase();
        short[] var8 = new short[16];
        int var9 = -1;
        String var10 = null;
        if (arg1 != -1) {
            class488 var11 = class71.field952.method1977((byte) 58, arg1);
            if (var11 == null || var11.method2772(113) != arg5) {
                return;
            }
            if (var11.method2772(118)) {
                var10 = var11.field6701;
            } else {
                var9 = var11.field6697;
            }
        }
        int var12 = 0;
        for (int var13 = 0; var13 < class599.field8366.field9974; var13++) {
            class661 var16 = class599.field8366.method3949(0, var13);
            if ((!arg0 || var16.field9246) && var16.field9190 == -1 && var16.field9232 == -1 && var16.field9217 == 0 && var16.field9222.toLowerCase().indexOf(var7) != -1) {
                if (arg1 != -1) {
                    if (arg5) {
                        if (!arg3.equals(var16.method3726(arg1, -1, var10))) {
                            continue;
                        }
                    } else if (arg6 != var16.method3729(-111, var9, arg1)) {
                        continue;
                    }
                }
                if (var12 >= 250) {
                    class657.field9135 = null;
                    class495.field6745 = -1;
                    return;
                }
                if (var8.length <= var12) {
                    short[] var17 = new short[var8.length * 2];
                    for (int var18 = 0; var18 < var12; var18++) {
                        var17[var18] = var8[var18];
                    }
                    var8 = var17;
                }
                var8[var12++] = (short) var13;
            }
        }
        class495.field6745 = var12;
        class592.field8294 = 0;
        class657.field9135 = var8;
        String[] var14 = new String[class495.field6745];
        for (int var15 = 0; var15 < class495.field6745; var15++) {
            var14[var15] = class599.field8366.method3949(0, var8[var15]).field9222;
        }
        class384.method2278(1, var14, class657.field9135);
        class697.field9899.method3628((byte) -14);
        class697.field9899.field8990 = 2;
    }

    @OriginalMember(owner = "client!pu", name = "<init>", descriptor = "(Llj;Lfa;)V")
    public class523(class565 arg0, class212 arg1) {
        this.field7098 = arg1;
        this.field7105 = arg0;
    }
}
