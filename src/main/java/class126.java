import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pb")
public abstract class class126 {

    @OriginalMember(owner = "client!pb", name = "i", descriptor = "[I")
    public static int[] field2439 = new int[50];

    @OriginalMember(owner = "client!pb", name = "d", descriptor = "Lcc;")
    public static class209 field2434 = class95.method669(93, "name_icons");

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "Lcc;")
    private static class209 field2431 = class95.method669(122, "Face here");

    @OriginalMember(owner = "client!pb", name = "n", descriptor = "Lcc;")
    private static class209 field2444 = class95.method669(90, ")1 ");

    @OriginalMember(owner = "client!pb", name = "e", descriptor = "I")
    public static int field2435 = 0;

    @OriginalMember(owner = "client!pb", name = "q", descriptor = "I")
    public static int field2447 = 0;

    @OriginalMember(owner = "client!pb", name = "s", descriptor = "Lcc;")
    public static class209 field2449 = field2431;

    @OriginalMember(owner = "client!pb", name = "h", descriptor = "I")
    public static int field2438 = 0;

    @OriginalMember(owner = "client!pb", name = "o", descriptor = "Lcc;")
    private static class209 field2445 = class95.method669(107, "Loaded wordpack");

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "Lcc;")
    public static class209 field2432 = class95.method669(110, "ondulation:");

    @OriginalMember(owner = "client!pb", name = "m", descriptor = "Lcc;")
    public static class209 field2443 = field2445;

    @OriginalMember(owner = "client!pb", name = "u", descriptor = "Lcc;")
    public static class209 field2451 = class95.method669(121, "Interfaces charg-Bes");

    @OriginalMember(owner = "client!pb", name = "f", descriptor = "I")
    public static int field2436;

    @OriginalMember(owner = "client!pb", name = "g", descriptor = "I")
    public static int field2437;

    @OriginalMember(owner = "client!pb", name = "j", descriptor = "I")
    public static int field2440;

    @OriginalMember(owner = "client!pb", name = "k", descriptor = "I")
    public static int field2441;

    @OriginalMember(owner = "client!pb", name = "l", descriptor = "I")
    public static int field2442;

    @OriginalMember(owner = "client!pb", name = "p", descriptor = "I")
    public static int field2446;

    @OriginalMember(owner = "client!pb", name = "r", descriptor = "I")
    public static int field2448;

    @OriginalMember(owner = "client!pb", name = "t", descriptor = "I")
    public static int field2450;

    @OriginalMember(owner = "client!pb", name = "c", descriptor = "Laa;")
    public static class168 field2433;

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(Lde;I)V")
    public static final void method905(class108 arg0, int arg1) {
        field2446++;
        class92 var2 = (class92) class210.field3823.method1755(arg0.field2140.method1448(true), (byte) -96);
        if (var2 == null) {
            class114.method810((class218) null, arg0.field1567[0], 0, class99.field1937, (byte) 105, (class163) null, arg0.field1548[0], arg0);
        } else {
            var2.method647(0);
        }
        int var3 = -37 / ((arg1 - 29) / 42);
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(III)Lpb;")
    public class126 method906(int arg0, int arg1, int arg2) {
        field2441++;
        return this;
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(Lji;I)V")
    public static final void method907(class42 arg0, int arg1) {
        field2436++;
        if (arg1 != 0) {
            method911(124, false, (class209) null);
        }
        if (class165.field2987 == arg0.field766) {
            class129.field2476[arg0.field722] = true;
        }
    }

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "(III)Lwc;")
    public static final class230 method908(int arg0, int arg1, int arg2) {
        class109 var3 = class106.field2089[arg0][arg1][arg2];
        return var3 == null || var3.field2198 == null ? null : var3.field2198;
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(IIIII)V")
    public abstract void method214(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "()Z")
    public boolean method909() {
        field2437++;
        return false;
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(Lpb;IIIZ)V")
    public void method910(class126 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field2448++;
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(IIIIIIIIJILmd;)V")
    public abstract void method208(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class221 arg10);

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "()I")
    public abstract int method216();

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(IZLcc;)V")
    public static final void method911(int arg0, boolean arg1, class209 arg2) {
        int var3 = 0;
        class209 var4 = arg2.method1467((byte) 125);
        short[] var5 = new short[16];
        field2450++;
        for (int var6 = 0; var6 < class199.field3560; var6++) {
            class82 var9 = class249.method1728(var6, true);
            if ((!arg1 || var9.field1613) && var9.field1625 == -1 && var9.field1617 == -1 && var9.field1645 == 0 && var9.field1629.method1467((byte) 58).method1443(true, var4) != -1) {
                if (var3 >= 250) {
                    class289.field5092 = -1;
                    class3.field47 = null;
                    return;
                }
                if (var3 >= var5.length) {
                    short[] var10 = new short[var5.length * 2];
                    for (int var11 = 0; var11 < var3; var11++) {
                        var10[var11] = var5[var11];
                    }
                    var5 = var10;
                }
                var5[var3++] = (short) var6;
            }
        }
        class3.field47 = var5;
        class28.field519 = arg0;
        class289.field5092 = var3;
        class209[] var7 = new class209[class289.field5092];
        for (int var8 = 0; var8 < class289.field5092; var8++) {
            var7[var8] = class249.method1728(var5[var8], true).field1629;
        }
        class78.method546(arg0, var7, class3.field47);
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(Z)V")
    public static void method912(boolean arg0) {
        field2439 = null;
        field2449 = null;
        field2433 = null;
        field2431 = null;
        field2444 = null;
        field2443 = null;
        field2451 = null;
        field2445 = null;
        field2434 = null;
        field2432 = null;
        if (!arg0) {
            field2439 = null;
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(IJ)Lcc;")
    public static final class209 method913(int arg0, long arg1) {
        class28.field493.setTime(new Date(arg1));
        field2440++;
        int var3 = class28.field493.get(7);
        int var4 = class28.field493.get(5);
        int var5 = class28.field493.get(2);
        int var6 = class28.field493.get(1);
        int var7 = class28.field493.get(11);
        int var8 = class28.field493.get(12);
        if (arg0 == -1) {
            int var9 = class28.field493.get(13);
            return class229.method1604(new class209[] { class290.field5110[var3 - 1], field2444, class66.method485(var4 / 10, (byte) 109), class66.method485(var4 % 10, (byte) 108), class109.field2207, class72.field1370[var5], class109.field2207, class66.method485(var6, (byte) 11), class201.field3623, class66.method485(var7 / 10, (byte) 65), class66.method485(var7 % 10, (byte) 39), class112.field2258, class66.method485(var8 / 10, (byte) 62), class66.method485(var8 % 10, (byte) 97), class112.field2258, class66.method485(var9 / 10, (byte) 91), class66.method485(var9 % 10, (byte) 108), class80.field1489 }, (byte) 66);
        } else {
            return null;
        }
    }
}
