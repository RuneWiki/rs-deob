import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ji")
public class class220 {

    @OriginalMember(owner = "client!ji", name = "m", descriptor = "I")
    public int field2723 = -1;

    @OriginalMember(owner = "client!ji", name = "p", descriptor = "[Lpi;")
    public static class298[] field2726;

    @OriginalMember(owner = "client!ji", name = "o", descriptor = "I")
    public static int field2725;

    @OriginalMember(owner = "client!ji", name = "r", descriptor = "Z")
    public static boolean field2728;

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "I")
    public int field2711;

    @OriginalMember(owner = "client!ji", name = "b", descriptor = "I")
    public int field2712;

    @OriginalMember(owner = "client!ji", name = "c", descriptor = "I")
    public static int field2713;

    @OriginalMember(owner = "client!ji", name = "d", descriptor = "I")
    public int field2714;

    @OriginalMember(owner = "client!ji", name = "e", descriptor = "I")
    public int field2715;

    @OriginalMember(owner = "client!ji", name = "f", descriptor = "I")
    public int field2716;

    @OriginalMember(owner = "client!ji", name = "g", descriptor = "I")
    public static int field2717;

    @OriginalMember(owner = "client!ji", name = "h", descriptor = "I")
    public int field2718;

    @OriginalMember(owner = "client!ji", name = "i", descriptor = "I")
    public int field2719;

    @OriginalMember(owner = "client!ji", name = "j", descriptor = "I")
    public static int field2720;

    @OriginalMember(owner = "client!ji", name = "k", descriptor = "I")
    public int field2721;

    @OriginalMember(owner = "client!ji", name = "n", descriptor = "I")
    public int field2724;

    @OriginalMember(owner = "client!ji", name = "l", descriptor = "Lwp;")
    public static class288 field2722;

    @OriginalMember(owner = "client!ji", name = "q", descriptor = "Ljava/lang/String;")
    public static String field2727;

    static {
        new class72("You are not allowed to talk in this clan channel.", "Du darfst in diesem Chatraum nicht reden.", "Vous n'êtes pas autorisé à parler dans ce canal de clan.", "Você não tem permissão para conversar neste canal de clã.");
        field2726 = new class298[32768];
        field2725 = 0;
        field2728 = false;
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(B)Ljava/lang/String;", line = 3)
    public static final String method1336(byte arg0) {
        field2713++;
        String var1 = "www";
        int var2 = 19 % ((arg0 + 28) / 56);
        if (class94.field1105 != 0) {
            var1 = "www-wtqa";
        }
        String var3 = "";
        if (class175.field2033 != null) {
            var3 = "/p=" + class175.field2033;
        }
        return class31.field356 == 1 ? "http://" + var1 + ".stellardawn.com/l=" + class373.field5057 + "/a=" + class333.field4549 + var3 + "/" : "http://" + var1 + ".runescape.com/l=" + class373.field5057 + "/a=" + class333.field4549 + var3 + "/";
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(Z)V", line = 37)
    public static final void method1337(boolean arg0) {
        field2720++;
        for (class23 var1 = (class23) class210.field2546.method1844(0); var1 != null; var1 = (class23) class210.field2546.method1844(0)) {
            class378.method2349(var1, (byte) 78);
        }
        client.method2701();
        if (arg0) {
            method1338((class118) null, 86, -69, (class450) null, 14, 99, 50, (byte[][][]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, -35, (byte) 70, 120, -3, false);
        }
        client.method2685();
        client.method2692();
        client.method2695();
        client.method2699();
        client.method2702();
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(Luo;IILwr;III[[[B[I[I[I[I[IIBIIZ)V", line = 65)
    public static final void method1338(class118 arg0, int arg1, int arg2, class450 arg3, int arg4, int arg5, int arg6, byte[][][] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, byte arg14, int arg15, int arg16, boolean arg17) {
        class131.field1498 = arg0;
        class98.field1153 = arg1;
        class434.field5922 = arg3;
        class217.field2665 = class131.field1498.method788() > 0;
        class325.field4341 = arg4 >> 7;
        class121.field1381 = arg6 >> 7;
        class437.field5999 = arg4;
        class278.field3599 = arg6;
        class162.field1888 = arg5;
        class118.field1361 = class325.field4341 - class347.field4720;
        if (class118.field1361 < 0) {
            class369.field5028 = -class118.field1361;
            class118.field1361 = 0;
        } else {
            class369.field5028 = 0;
        }
        class244.field3247 = class121.field1381 - class347.field4720;
        if (class244.field3247 < 0) {
            class453.field6410 = -class244.field3247;
            class244.field3247 = 0;
        } else {
            class453.field6410 = 0;
        }
        class386.field5281 = class347.field4720 + class325.field4341;
        if (class386.field5281 > class43.field512) {
            class386.field5281 = class43.field512;
        }
        class369.field5031 = class347.field4720 + class121.field1381;
        if (class369.field5031 > class262.field3367) {
            class369.field5031 = class262.field3367;
        }
        for (int var18 = 0; var18 < class347.field4720 + class347.field4720 + 2; var18++) {
            for (int var23 = 0; var23 < class347.field4720 + class347.field4720 + 2; var23++) {
                int var24 = class325.field4341 + var18 - class347.field4720;
                int var25 = class121.field1381 + var23 - class347.field4720;
                if (var24 >= 0 && var25 >= 0 && var24 < class43.field512 && var25 < class262.field3367) {
                    int var26 = var24 << 7;
                    int var27 = var25 << 7;
                    int var28 = class219.field2709[3].method1050(var24, var25) - 1000;
                    int var29 = class75.field915 == null ? class219.field2709[0].method1050(var24, var25) + 128 : class75.field915[0].method1050(var24, var25) + 128;
                    class446.field6218[var18][var23] = class131.field1498.method791(var26, var28, var27, var26, var29, var27);
                } else {
                    class446.field6218[var18][var23] = false;
                }
            }
        }
        for (int var19 = 0; var19 < class347.field4720 + class347.field4720 + 1; var19++) {
            for (int var22 = 0; var22 < class347.field4720 + class347.field4720 + 1; var22++) {
                class140.field1628[var19][var22] = class446.field6218[var19][var22] || class446.field6218[var19 + 1][var22] || class446.field6218[var19][var22 + 1] || class446.field6218[var19 + 1][var22 + 1];
            }
        }
        class108.field1297 = arg8;
        class307.field4134 = arg9;
        class434.field5934 = arg10;
        class163.field1901 = arg11;
        class411.field5661 = arg12;
        class298.method1891();
        class76.method451(true);
        for (class175 var20 = (class175) class386.field5275.method1838(-6325); var20 != null; var20 = (class175) class386.field5275.method1834((byte) 23)) {
            var20.method358(42);
            class91.method572(true, var20);
        }
        if (class217.field2665) {
            for (int var21 = 0; var21 < class208.field2534; var21++) {
                class349.field4761[var21].method22(arg1, false, arg17);
            }
        }
        if (arg2 > 1) {
            class131.field1498.method743(0);
            if (class419.field5721 == null || class419.field5721 instanceof class382) {
                class419.field5721 = new class51();
            }
        } else if (class419.field5721 == null || class419.field5721 instanceof class51) {
            class419.field5721 = new class382();
        }
        class419.field5721.method294(arg2, 0);
        class419.field5721.method286((byte) 25);
        if (class104.field1216 != null) {
            class318.method1992(true);
            class419.field5721.method298(103, 22);
            class430.method2619(arg2, (byte[][][]) null, 0, (byte) 0, arg15, arg16);
            class419.field5721.method286((byte) 84);
            class419.field5721.method298(18, 23);
            class318.method1992(false);
        }
        class430.method2619(arg2, arg7, arg13, arg14, arg15, arg16);
        class419.field5721.method286((byte) 58);
        class419.field5721.method297(20883);
        class419.field5721.method286((byte) 125);
        if (arg2 > 1) {
            class131.field1498.method759(0);
        }
        class131.field1498.method784(0, (class92[]) null);
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(ZZI)V", line = 220)
    public static final void method1339(boolean arg0, boolean arg1, int arg2) {
        if (arg2 != 0) {
            return;
        }
        field2717++;
        if (arg0) {
            class372.field5047++;
            class8.method41(996518056);
        }
        if (arg1) {
            class146.field1713++;
            class433.method2638(-23);
        }
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(I)V", line = 246)
    public static void method1340(int arg0) {
        if (arg0 != 1) {
            method1336((byte) 38);
        }
        field2726 = null;
        field2722 = null;
        field2727 = null;
    }
}
