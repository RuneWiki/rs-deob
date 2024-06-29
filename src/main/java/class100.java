import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oc")
public class class100 extends class50 {

    @OriginalMember(owner = "client!oc", name = "tb", descriptor = "Z")
    public boolean field2428 = false;

    @OriginalMember(owner = "client!oc", name = "yb", descriptor = "I")
    private int field2433 = 0;

    @OriginalMember(owner = "client!oc", name = "pb", descriptor = "I")
    private int field2424 = 0;

    @OriginalMember(owner = "client!oc", name = "wb", descriptor = "I")
    public int field2431;

    @OriginalMember(owner = "client!oc", name = "ub", descriptor = "I")
    private int field2429;

    @OriginalMember(owner = "client!oc", name = "Db", descriptor = "I")
    public int field2438;

    @OriginalMember(owner = "client!oc", name = "lb", descriptor = "I")
    public int field2420;

    @OriginalMember(owner = "client!oc", name = "vb", descriptor = "I")
    public int field2430;

    @OriginalMember(owner = "client!oc", name = "Lb", descriptor = "I")
    public int field2446;

    @OriginalMember(owner = "client!oc", name = "Kb", descriptor = "Lgd;")
    private class46 field2445;

    @OriginalMember(owner = "client!oc", name = "mb", descriptor = "I")
    public static int field2421 = 0;

    @OriginalMember(owner = "client!oc", name = "nb", descriptor = "I")
    public static int field2422 = 0;

    @OriginalMember(owner = "client!oc", name = "qb", descriptor = "I")
    public static int field2425 = 1;

    @OriginalMember(owner = "client!oc", name = "xb", descriptor = "Lid;")
    private static class60 field2432 = class11.method72(" has logged in)3", (byte) 115);

    @OriginalMember(owner = "client!oc", name = "rb", descriptor = "Lid;")
    public static class60 field2426 = field2432;

    @OriginalMember(owner = "client!oc", name = "Jb", descriptor = "Lid;")
    public static class60 field2444 = class11.method72("Spieler kann nicht gefunden werden: ", (byte) 91);

    @OriginalMember(owner = "client!oc", name = "Ib", descriptor = "Lid;")
    public static class60 field2443 = class11.method72("<)4col>", (byte) 94);

    @OriginalMember(owner = "client!oc", name = "Eb", descriptor = "Lid;")
    private static class60 field2439 = class11.method72("Error connecting to server)3", (byte) 91);

    @OriginalMember(owner = "client!oc", name = "Fb", descriptor = "Lid;")
    public static class60 field2440 = class11.method72("Untersuchen", (byte) -40);

    @OriginalMember(owner = "client!oc", name = "Gb", descriptor = "Lid;")
    public static class60 field2441 = field2439;

    @OriginalMember(owner = "client!oc", name = "ob", descriptor = "I")
    public static int field2423;

    @OriginalMember(owner = "client!oc", name = "sb", descriptor = "I")
    public static int field2427;

    @OriginalMember(owner = "client!oc", name = "zb", descriptor = "I")
    public static int field2434;

    @OriginalMember(owner = "client!oc", name = "Ab", descriptor = "I")
    public static int field2435;

    @OriginalMember(owner = "client!oc", name = "Bb", descriptor = "I")
    public static int field2436;

    @OriginalMember(owner = "client!oc", name = "Cb", descriptor = "I")
    public static int field2437;

    @OriginalMember(owner = "client!oc", name = "Hb", descriptor = "[I")
    public static int[] field2442;

    @OriginalMember(owner = "client!oc", name = "c", descriptor = "(B)V")
    public static final void method784(byte arg0) {
        class22.field520 = new byte[4][104][104];
        class55.field1380 = new int[4][105][105];
        class97.field2377 = new int[105][105];
        class132.field2995 = new int[104];
        class18.field458 = new byte[4][104][104];
        class106.field2596 = new int[104];
        int var1 = -25 / ((25 - arg0) / 55);
        class152.field3417 = new byte[4][104][104];
        class7.field95 = 99;
        class18.field459 = new int[104];
        class77.field1889 = new byte[4][105][105];
        class116.field2736 = new int[104];
        class8.field117 = new byte[4][104][104];
        field2423++;
        class87.field2174 = new int[104];
    }

    @OriginalMember(owner = "client!oc", name = "e", descriptor = "(I)Lka;")
    public final class70 method1(int arg0) {
        field2436++;
        class121 var2 = class13.method81(21299, this.field2429);
        class70 var3;
        if (this.field2428) {
            var3 = var2.method940(31710, -1);
        } else {
            var3 = var2.method940(31710, this.field2424);
        }
        int var4 = 80 % ((arg0 + 1) / 43);
        return var3 == null ? null : var3;
    }

    @OriginalMember(owner = "client!oc", name = "g", descriptor = "(I)I")
    public static final int method785(int arg0) {
        field2435++;
        if (arg0 > -33) {
            method786(-19, (byte) -67, true, -72, null, -43);
        }
        return class63.field1574++;
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(IBZILie;I)V")
    public static final void method786(int arg0, byte arg1, boolean arg2, int arg3, class61 arg4, int arg5) {
        class87.field2183 = 10000;
        class41.field1102 = arg0;
        class22.field524 = arg3;
        class106.field2626 = 1;
        class113.field2710 = arg4;
        field2437++;
        int var6 = -104 % ((23 - arg1) / 41);
        class14.field291 = arg5;
        class87.field2193 = arg2;
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(IIII)I")
    public static final int method787(int arg0, int arg1, int arg2, int arg3) {
        if (arg3 <= 46) {
            field2439 = null;
        }
        int var4 = arg0 & 0x3;
        field2434++;
        if (var4 == 0) {
            return arg2;
        } else if (var4 == 1) {
            return 7 - arg1;
        } else if (var4 == 2) {
            return 7 - arg2;
        } else {
            return arg1;
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(IB)V")
    public final void method788(int arg0, byte arg1) {
        field2427++;
        if (this.field2428) {
            return;
        }
        this.field2433 += arg0;
        if (arg1 != 92) {
            method787(36, -9, 109, 79);
        }
        while (this.field2445.field1196[this.field2424] < this.field2433) {
            this.field2433 -= this.field2445.field1196[this.field2424];
            this.field2424++;
            if (this.field2424 >= this.field2445.field1218.length) {
                this.field2428 = true;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!oc", name = "d", descriptor = "(B)V")
    public static void method789(byte arg0) {
        field2442 = null;
        field2440 = null;
        field2441 = null;
        field2439 = null;
        field2443 = null;
        field2444 = null;
        field2432 = null;
        int var1 = 51 / ((16 - arg0) / 32);
        field2426 = null;
    }

    @OriginalMember(owner = "client!oc", name = "<init>", descriptor = "(IIIIIII)V")
    public class100(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field2431 = arg4;
        this.field2429 = arg0;
        this.field2438 = arg2;
        this.field2420 = arg1;
        this.field2430 = arg3;
        this.field2446 = arg5 + arg6;
        int var8 = class13.method81(21299, this.field2429).field2785;
        if (var8 == -1) {
            this.field2428 = true;
        } else {
            this.field2428 = false;
            this.field2445 = class44.method344(var8, (byte) -124);
        }
    }
}
