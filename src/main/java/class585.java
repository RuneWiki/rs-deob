import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!saa")
public class class585 extends class125 {

    @OriginalMember(owner = "client!saa", name = "j", descriptor = "[Lwf;")
    public static class105[] field8346 = new class105[50];

    @OriginalMember(owner = "client!saa", name = "i", descriptor = "I")
    public static int field8345;

    @OriginalMember(owner = "client!saa", name = "l", descriptor = "I")
    public static int field8348;

    @OriginalMember(owner = "client!saa", name = "m", descriptor = "I")
    public static int field8349;

    @OriginalMember(owner = "client!saa", name = "n", descriptor = "I")
    public static int field8350;

    @OriginalMember(owner = "client!saa", name = "p", descriptor = "I")
    public static int field8352;

    @OriginalMember(owner = "client!saa", name = "q", descriptor = "I")
    public static int field8353;

    @OriginalMember(owner = "client!saa", name = "r", descriptor = "I")
    public static int field8354;

    @OriginalMember(owner = "client!saa", name = "s", descriptor = "I")
    public static int field8355;

    @OriginalMember(owner = "client!saa", name = "t", descriptor = "I")
    public static int field8356;

    @OriginalMember(owner = "client!saa", name = "k", descriptor = "Lip;")
    public static class304 field8347;

    @OriginalMember(owner = "client!saa", name = "o", descriptor = "Lla;")
    public static class423 field8351;

    @OriginalMember(owner = "client!saa", name = "<init>", descriptor = "(ILgp;)V")
    public class585(int arg0, class549 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!saa", name = "b", descriptor = "(I)V")
    public static final void method3444(int arg0) {
        class434.method2665();
        ++field8345;
        for (int var1 = 0; ~var1 > -5; ++var1) {
            class6.field57[var1].method3650((byte) -114);
        }
        if (arg0 != -14756) {
            method3447(-2, -57, -91, -99, -122, -80);
        }
        class40.method423((byte) 102);
        class648.method3743(arg0 + 27001);
        class76.method637(81);
        System.gc();
        class211.field3164.method1235();
    }

    @OriginalMember(owner = "client!saa", name = "<init>", descriptor = "(Lgp;)V")
    public class585(class549 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!saa", name = "c", descriptor = "(I)V")
    public static void method3445(int arg0) {
        field8346 = null;
        field8351 = null;
        if (arg0 == -5) {
            field8347 = null;
        }
    }

    @OriginalMember(owner = "client!saa", name = "a", descriptor = "(ILqk;B)I")
    public static final int method3446(int arg0, class146 arg1, byte arg2) {
        ++field8353;
        if (!client.method2732(arg1).method2856((byte) 47, arg0) && arg1.field2086 == null) {
            return -1;
        } else {
            if (arg2 < 99) {
                method3448(-67, true, false, 4, -20);
            }
            return arg1.field1994 != null && ~arg1.field1994.length < ~arg0 ? arg1.field1994[arg0] : -1;
        }
    }

    @OriginalMember(owner = "client!saa", name = "a", descriptor = "(B)I")
    public final int method158(byte arg0) {
        ++field8355;
        int var2 = 83 / ((arg0 - -63) / 49);
        return 3;
    }

    @OriginalMember(owner = "client!saa", name = "a", descriptor = "(IIIIII)V")
    public static final void method3447(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == -1) {
            ++field8356;
            for (int var6 = arg5; var6 <= arg2; ++var6) {
                class518.method3153(arg1, arg3, class193.field2839[var6], -7, arg4);
            }
        }
    }

    @OriginalMember(owner = "client!saa", name = "a", descriptor = "(BI)V")
    public final void method157(byte arg0, int arg1) {
        super.field1732 = arg1;
        if (arg0 <= -32) {
            ++field8352;
        }
    }

    @OriginalMember(owner = "client!saa", name = "a", descriptor = "(IZZII)I")
    public static final int method3448(int arg0, boolean arg1, boolean arg2, int arg3, int arg4) {
        ++field8354;
        class37 var5 = class582.method3429(arg2, (byte) -98, arg0);
        if (var5 == null) {
            return 0;
        } else {
            int var6 = arg3;
            for (int var7 = 0; ~var7 > ~var5.field334.length; ++var7) {
                if (~var5.field334[var7] <= -1 && class425.field6147.field10379 > var5.field334[var7]) {
                    class424 var8 = class425.field6147.method4144(var5.field334[var7], 125);
                    int var9 = var8.method2634(class332.field4513.method1901(-4115, arg4).field2364, arg4, false);
                    if (arg1) {
                        var6 += var5.field332[var7] * var9;
                    } else {
                        var6 += var9;
                    }
                }
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!saa", name = "c", descriptor = "(Z)I")
    public final int method3449(boolean arg0) {
        if (arg0) {
            return -104;
        } else {
            ++field8348;
            return super.field1732;
        }
    }

    @OriginalMember(owner = "client!saa", name = "b", descriptor = "(Z)V")
    public final void method156(boolean arg0) {
        ++field8350;
        if (~super.field1732 > -1 || ~super.field1732 < -5) {
            super.field1732 = this.method158((byte) -125);
        }
        if (!arg0) {
            field8347 = null;
        }
    }

    @OriginalMember(owner = "client!saa", name = "a", descriptor = "(ZI)I")
    public final int method155(boolean arg0, int arg1) {
        if (!arg0) {
            return 78;
        } else {
            ++field8349;
            return 1;
        }
    }
}
