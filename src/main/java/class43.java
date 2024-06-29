import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lm")
public class class43 {

    @OriginalMember(owner = "client!lm", name = "c", descriptor = "J")
    public long field697 = 0L;

    @OriginalMember(owner = "client!lm", name = "l", descriptor = "Lbd;")
    public static class162 field706 = class17.method142(0, " )2>");

    @OriginalMember(owner = "client!lm", name = "w", descriptor = "Lbd;")
    public static class162 field717 = null;

    @OriginalMember(owner = "client!lm", name = "u", descriptor = "Lbd;")
    public static class162 field715 = class17.method142(0, "leuchten2:");

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "[Lam;")
    public static class146[] field695 = new class146[50];

    @OriginalMember(owner = "client!lm", name = "p", descriptor = "[[I")
    public static int[][] field710 = new int[][] { { 0, 128, 0, 0, 128, 0, 128, 128 }, { 0, 128, 0, 0, 128, 0 }, { 0, 0, 64, 128, 0, 128 }, { 128, 128, 64, 128, 128, 0 }, { 0, 0, 128, 0, 128, 128, 64, 128 }, { 0, 128, 0, 0, 128, 0, 64, 128 }, { 64, 128, 0, 128, 0, 0, 64, 0 }, { 0, 0, 64, 0, 0, 64 }, { 128, 0, 128, 128, 0, 128, 0, 64, 64, 0 }, { 0, 128, 0, 0, 32, 64, 64, 96, 128, 128 }, { 0, 0, 128, 0, 128, 128, 64, 96, 32, 64 }, { 0, 0, 128, 0, 96, 32, 32, 32 } };

    @OriginalMember(owner = "client!lm", name = "y", descriptor = "[[[I")
    public static int[][][] field719 = new int[2][][];

    @OriginalMember(owner = "client!lm", name = "z", descriptor = "Z")
    public static boolean field720 = false;

    @OriginalMember(owner = "client!lm", name = "b", descriptor = "I")
    public int field696;

    @OriginalMember(owner = "client!lm", name = "d", descriptor = "I")
    public static int field698;

    @OriginalMember(owner = "client!lm", name = "e", descriptor = "I")
    public int field699;

    @OriginalMember(owner = "client!lm", name = "f", descriptor = "I")
    public int field700;

    @OriginalMember(owner = "client!lm", name = "g", descriptor = "I")
    public int field701;

    @OriginalMember(owner = "client!lm", name = "h", descriptor = "I")
    public static int field702;

    @OriginalMember(owner = "client!lm", name = "i", descriptor = "I")
    public int field703;

    @OriginalMember(owner = "client!lm", name = "j", descriptor = "I")
    public int field704;

    @OriginalMember(owner = "client!lm", name = "k", descriptor = "I")
    public int field705;

    @OriginalMember(owner = "client!lm", name = "m", descriptor = "I")
    public int field707;

    @OriginalMember(owner = "client!lm", name = "n", descriptor = "I")
    public static int field708;

    @OriginalMember(owner = "client!lm", name = "o", descriptor = "I")
    public static int field709;

    @OriginalMember(owner = "client!lm", name = "q", descriptor = "I")
    public int field711;

    @OriginalMember(owner = "client!lm", name = "s", descriptor = "I")
    public int field713;

    @OriginalMember(owner = "client!lm", name = "t", descriptor = "I")
    public static int field714;

    @OriginalMember(owner = "client!lm", name = "v", descriptor = "I")
    public int field716;

    @OriginalMember(owner = "client!lm", name = "x", descriptor = "I")
    public static int field718;

    @OriginalMember(owner = "client!lm", name = "r", descriptor = "Lrk;")
    public class255 field712;

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(II)V", line = 32)
    public static final void method317(int arg0, int arg1) {
        field702++;
        if (arg1 == 96) {
            class63 var2 = class46.method332(1, arg0, -12770);
            var2.method427(-22507);
        }
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(B)V", line = 47)
    public static void method318(byte arg0) {
        field695 = null;
        field710 = (int[][]) null;
        field706 = null;
        field717 = null;
        field719 = (int[][][]) null;
        field715 = null;
        if (arg0 != 90) {
            method317(-105, -30);
        }
    }

    @OriginalMember(owner = "client!lm", name = "b", descriptor = "(B)V", line = 69)
    public static final void method319(byte arg0) {
        for (class64 var1 = (class64) class149.field2678.method169(105); var1 != null; var1 = (class64) class149.field2678.method165((byte) -101)) {
            if (var1.field1022) {
                var1.method442((byte) -119);
            }
        }
        field708++;
        if (arg0 >= -90) {
            method319((byte) -90);
        }
        for (class64 var2 = (class64) client.field1884.method169(42); var2 != null; var2 = (class64) client.field1884.method165((byte) -101)) {
            if (var2.field1022) {
                var2.method442((byte) -119);
            }
        }
    }
}
