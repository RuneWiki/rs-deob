import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ng")
public class class176 extends class46 {

    @OriginalMember(owner = "client!ng", name = "z", descriptor = "Ljava/lang/String;")
    public static String field2673 = "flash2:";

    @OriginalMember(owner = "client!ng", name = "B", descriptor = "[J")
    public static long[] field2674 = new long[1000];

    @OriginalMember(owner = "client!ng", name = "r", descriptor = "F")
    public static float field2665;

    @OriginalMember(owner = "client!ng", name = "u", descriptor = "I")
    public static int field2668;

    @OriginalMember(owner = "client!ng", name = "x", descriptor = "I")
    public static int field2671;

    @OriginalMember(owner = "client!ng", name = "y", descriptor = "I")
    public int field2672;

    @OriginalMember(owner = "client!ng", name = "D", descriptor = "I")
    public int field2676;

    @OriginalMember(owner = "client!ng", name = "C", descriptor = "Lsf;")
    public static class197 field2675;

    @OriginalMember(owner = "client!ng", name = "q", descriptor = "[I")
    public int[] field2664;

    @OriginalMember(owner = "client!ng", name = "t", descriptor = "[I")
    public int[] field2667;

    @OriginalMember(owner = "client!ng", name = "v", descriptor = "[I")
    public int[] field2669;

    @OriginalMember(owner = "client!ng", name = "o", descriptor = "[Lsf;")
    public class197[] field2662;

    @OriginalMember(owner = "client!ng", name = "w", descriptor = "[Lsf;")
    public class197[] field2670;

    @OriginalMember(owner = "client!ng", name = "s", descriptor = "[Lgm;")
    public static class249[] field2666;

    @OriginalMember(owner = "client!ng", name = "p", descriptor = "[[[B")
    public byte[][][] field2663;

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(IBII)V", line = 9)
    public static final void method1257(int arg0, byte arg1, int arg2, int arg3) {
        class338 var4 = class195.method1391(9, (byte) -92, arg0);
        var4.method2352((byte) 126);
        if (arg1 != 49) {
            method1257(41, (byte) 41, 106, -45);
        }
        field2668++;
        var4.field5288 = arg2;
        var4.field5279 = arg3;
    }

    @OriginalMember(owner = "client!ng", name = "b", descriptor = "(II)Lsi;", line = 28)
    public static final class335 method1258(int arg0, int arg1) {
        field2671++;
        if (arg0 == 0) {
            return new class110();
        } else if (arg0 == 1) {
            return new class78();
        } else if (arg0 == 2) {
            return new class306();
        } else if (arg0 == 3) {
            return new class101();
        } else if (arg0 == 4) {
            return new class316();
        } else if (arg0 == 5) {
            return new class237();
        } else if (arg0 == 6) {
            return new class210();
        } else if (arg0 == 7) {
            return new class130();
        } else if (arg0 == 8) {
            return new class260();
        } else if (arg0 == 9) {
            return new class258();
        } else if (arg0 == 10) {
            return new class77();
        } else if (arg0 == 11) {
            return new class63();
        } else if (arg0 == 12) {
            return new class251();
        } else if (arg0 == 13) {
            return new class273();
        } else if (arg0 == 14) {
            return new class81();
        } else if (arg0 == 15) {
            return new class171();
        } else if (arg0 == 16) {
            return new class208();
        } else if (arg0 == 17) {
            return new class205();
        } else if (arg0 == 18) {
            return new class41();
        } else if (arg0 == 19) {
            return new class339();
        } else if (arg0 == 20) {
            return new class95();
        } else if (arg0 == 21) {
            return new class149();
        } else if (arg0 == 22) {
            return new class290();
        } else if (arg0 == 23) {
            return new class67();
        } else if (arg0 == 24) {
            return new class19();
        } else if (arg0 == 25) {
            return new class213();
        } else if (arg0 == 26) {
            return new class68();
        } else if (arg0 == 27) {
            return new class310();
        } else if (arg0 == 28) {
            return new class44();
        } else if (arg0 == 29) {
            return new class29();
        } else if (arg0 == 30) {
            return new class232();
        } else if (arg0 == 31) {
            return new class23();
        } else if (arg0 == 32) {
            return new class83();
        } else if (arg0 == 33) {
            return new class174();
        } else if (arg0 == 34) {
            return new class331();
        } else if (arg0 == 35) {
            return new class238();
        } else if (arg0 == 36) {
            return new class322();
        } else if (arg0 == 37) {
            return new class219();
        } else if (arg0 == 38) {
            return new class318();
        } else if (arg0 == 39) {
            return new class234();
        } else {
            if (arg1 != -10644) {
                method1257(44, (byte) 29, 18, 14);
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(III)J", line = 355)
    public static final long method1259(int arg0, int arg1, int arg2) {
        class142 var3 = class256.field4013[arg0][arg1][arg2];
        if (var3 == null) {
            return 0L;
        }
        for (int var4 = 0; var4 < var3.field2204; var4++) {
            class26 var5 = var3.field2197[var4];
            if ((var5.field402 >> 29 & 0x3L) == 2L && var5.field411 == arg1 && var5.field410 == arg2) {
                return var5.field402;
            }
        }
        return 0L;
    }

    @OriginalMember(owner = "client!ng", name = "d", descriptor = "(I)V", line = 385)
    public static void method1260(int arg0) {
        int var1 = 118 % ((28 - arg0) / 53);
        field2674 = null;
        field2666 = null;
        field2675 = null;
        field2673 = null;
    }
}
