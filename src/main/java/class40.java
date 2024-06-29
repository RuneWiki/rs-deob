import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jj")
public class class40 {

    @OriginalMember(owner = "client!jj", name = "i", descriptor = "I")
    public int field497;

    @OriginalMember(owner = "client!jj", name = "c", descriptor = "[I")
    public int[] field491;

    @OriginalMember(owner = "client!jj", name = "d", descriptor = "[Ljava/lang/String;")
    public String[] field492;

    @OriginalMember(owner = "client!jj", name = "k", descriptor = "[B")
    public byte[] field499;

    @OriginalMember(owner = "client!jj", name = "f", descriptor = "[I")
    public int[] field494;

    @OriginalMember(owner = "client!jj", name = "h", descriptor = "[Ljava/lang/String;")
    public static String[] field496 = new String[100];

    @OriginalMember(owner = "client!jj", name = "o", descriptor = "Ljava/lang/String;")
    public static String field503 = "K";

    @OriginalMember(owner = "client!jj", name = "q", descriptor = "[[I")
    public static int[][] field505 = new int[5][5000];

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "I")
    public static int field489;

    @OriginalMember(owner = "client!jj", name = "g", descriptor = "I")
    public static int field495;

    @OriginalMember(owner = "client!jj", name = "l", descriptor = "I")
    public static int field500;

    @OriginalMember(owner = "client!jj", name = "m", descriptor = "I")
    public static int field501;

    @OriginalMember(owner = "client!jj", name = "n", descriptor = "I")
    public static int field502;

    @OriginalMember(owner = "client!jj", name = "p", descriptor = "I")
    public static int field504;

    @OriginalMember(owner = "client!jj", name = "b", descriptor = "Leh;")
    public static class137 field490;

    @OriginalMember(owner = "client!jj", name = "j", descriptor = "Leh;")
    public static class137 field498;

    @OriginalMember(owner = "client!jj", name = "e", descriptor = "[I")
    public static int[] field493;

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(II)I")
    public final int method216(int arg0, int arg1) {
        if (arg1 != -7010) {
            this.field499 = null;
        }
        field489++;
        return this.field499[arg0] & 0x3;
    }

    @OriginalMember(owner = "client!jj", name = "b", descriptor = "(II)Z")
    public final boolean method217(int arg0, int arg1) {
        int var3 = 92 % ((26 - arg0) / 53);
        field504++;
        return (this.field499[arg1] & 0x4) != 0;
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(I)V")
    public static void method218(int arg0) {
        field490 = null;
        field505 = null;
        field496 = null;
        field498 = null;
        field493 = null;
        field503 = null;
        if (arg0 != 3) {
            field490 = null;
        }
    }

    @OriginalMember(owner = "client!jj", name = "c", descriptor = "(II)Z")
    public final boolean method219(int arg0, int arg1) {
        if (arg1 >= -78) {
            return true;
        } else {
            field495++;
            return (this.field499[arg0] & 0x10) == 0;
        }
    }

    @OriginalMember(owner = "client!jj", name = "<init>", descriptor = "(I)V")
    public class40(int arg0) {
        this.field497 = arg0;
        this.field491 = new int[this.field497];
        this.field492 = new String[this.field497];
        this.field499 = new byte[this.field497];
        this.field494 = new int[this.field497];
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(BI)Z")
    public final boolean method220(byte arg0, int arg1) {
        int var3 = 112 / ((arg0 - 34) / 56);
        field501++;
        return (this.field499[arg1] & 0x8) != 0;
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(III)V")
    public static final void method221(int arg0, int arg1, int arg2) {
        field502++;
        class269 var3 = class206.field3296[class244.field4011][arg2][arg0];
        if (var3 == null) {
            class250.method1724(class244.field4011, arg2, arg0);
            return;
        }
        class226 var4 = (class226) var3.method1802(43);
        class226 var5 = null;
        int var6 = -99999999;
        while (var4 != null) {
            class108 var13 = class256.method1753(-2, var4.field3629.field222);
            int var14 = var13.field1490;
            if (var13.field1492 == 1) {
                var14 = (var4.field3629.field216 + 1) * var14;
            }
            if (var6 < var14) {
                var5 = var4;
                var6 = var14;
            }
            var4 = (class226) var3.method1815(0);
        }
        if (var5 == null) {
            class250.method1724(class244.field4011, arg2, arg0);
            return;
        }
        var3.method1810(var5, (byte) -58);
        class226 var7 = (class226) var3.method1802(43);
        class18 var8 = null;
        if (arg1 >= -85) {
            method221(-2, -57, 105);
        }
        class18 var9 = null;
        while (var7 != null) {
            class18 var12 = var7.field3629;
            if (var5.field3629.field222 != var12.field222) {
                if (var8 == null) {
                    var8 = var12;
                }
                if (var8.field222 != var12.field222 && var9 == null) {
                    var9 = var12;
                }
            }
            var7 = (class226) var3.method1815(0);
        }
        long var10 = (long) (arg2 + (arg0 << 7) + 1610612736);
        class259.method1769(class244.field4011, arg2, arg0, class166.method1148(class244.field4011, arg2 * 128 + 64, arg0 * 128 - -64, (byte) 65), var5.field3629, var10, var8, var9);
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(IILjava/util/Random;)I")
    public static final int method222(int arg0, int arg1, Random arg2) {
        field500++;
        if (arg0 <= 0) {
            throw new IllegalArgumentException();
        } else if (class120.method783(18287, arg0)) {
            return (int) ((long) arg0 * ((long) arg2.nextInt() & 0xFFFFFFFFL) >> 32);
        } else {
            int var3 = 125 / ((-arg1 - 64) / 42);
            int var4 = Integer.MIN_VALUE - (int) (4294967296L % (long) arg0);
            int var5;
            do {
                var5 = arg2.nextInt();
            } while (var4 <= var5);
            return class134.method900(arg0, 84, var5);
        }
    }
}
