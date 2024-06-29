import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ba")
public class class53 {

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "Laj;")
    private class199 field886 = new class199();

    @OriginalMember(owner = "client!ba", name = "x", descriptor = "Lrd;")
    private class225 field909 = new class225();

    @OriginalMember(owner = "client!ba", name = "s", descriptor = "I")
    private int field904;

    @OriginalMember(owner = "client!ba", name = "r", descriptor = "I")
    private int field903;

    @OriginalMember(owner = "client!ba", name = "u", descriptor = "Lgd;")
    private class170 field906;

    @OriginalMember(owner = "client!ba", name = "e", descriptor = "I")
    public static int field890 = 0;

    @OriginalMember(owner = "client!ba", name = "d", descriptor = "S")
    public static short field889 = 205;

    @OriginalMember(owner = "client!ba", name = "j", descriptor = "I")
    public static int field895 = 0;

    @OriginalMember(owner = "client!ba", name = "o", descriptor = "I")
    public static int field900 = -1;

    @OriginalMember(owner = "client!ba", name = "q", descriptor = "[Z")
    public static boolean[] field902 = new boolean[112];

    @OriginalMember(owner = "client!ba", name = "l", descriptor = "F")
    public static float field897;

    @OriginalMember(owner = "client!ba", name = "b", descriptor = "I")
    public static int field887;

    @OriginalMember(owner = "client!ba", name = "c", descriptor = "I")
    public static int field888;

    @OriginalMember(owner = "client!ba", name = "f", descriptor = "I")
    public static int field891;

    @OriginalMember(owner = "client!ba", name = "g", descriptor = "I")
    public static int field892;

    @OriginalMember(owner = "client!ba", name = "h", descriptor = "I")
    public static int field893;

    @OriginalMember(owner = "client!ba", name = "i", descriptor = "I")
    public static int field894;

    @OriginalMember(owner = "client!ba", name = "k", descriptor = "I")
    public static int field896;

    @OriginalMember(owner = "client!ba", name = "n", descriptor = "I")
    public static int field899;

    @OriginalMember(owner = "client!ba", name = "p", descriptor = "I")
    public static int field901;

    @OriginalMember(owner = "client!ba", name = "t", descriptor = "I")
    public static int field905;

    @OriginalMember(owner = "client!ba", name = "v", descriptor = "I")
    public static int field907;

    @OriginalMember(owner = "client!ba", name = "w", descriptor = "I")
    public static int field908;

    @OriginalMember(owner = "client!ba", name = "m", descriptor = "[[Z")
    public static boolean[][] field898;

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(I)Lsm;", line = 5)
    public final class46 method437(int arg0) {
        field896++;
        if (arg0 <= 31) {
            this.method437(-6);
        }
        return this.field906.method1223((byte) 13);
    }

    @OriginalMember(owner = "client!ba", name = "b", descriptor = "(I)Lsm;", line = 38)
    public final class46 method438(int arg0) {
        field888++;
        return arg0 == -6213 ? this.field906.method1228(true) : (class46) null;
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(Laj;JB)V", line = 57)
    public final void method439(class199 arg0, long arg1, byte arg2) {
        field905++;
        if (arg2 != 18) {
            this.method440((byte) 20);
        }
        if (this.field903 == 0) {
            class199 var5 = this.field909.method1596((byte) -114);
            var5.method403(arg2 ^ 0x13);
            var5.method1412(0);
            if (this.field886 == var5) {
                class199 var6 = this.field909.method1596((byte) 29);
                var6.method403(1);
                var6.method1412(0);
            }
        } else {
            this.field903--;
        }
        this.field906.method1227(arg0, 0, arg1);
        this.field909.method1595(true, arg0);
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(B)V", line = 86)
    public final void method440(byte arg0) {
        if (arg0 >= -97) {
            field890 = -79;
        }
        this.field909.method1594(93);
        this.field906.method1226(0);
        field887++;
        this.field886 = new class199();
        this.field903 = this.field904;
    }

    @OriginalMember(owner = "client!ba", name = "b", descriptor = "(B)I", line = 105)
    public static final int method441(byte arg0) {
        if (arg0 <= 94) {
            method441((byte) 6);
        }
        field891++;
        return class12.field181 && field902[81] && class301.field4706 > 2 ? class137.field2167[class301.field4706 - 2] : class137.field2167[class301.field4706 - 1];
    }

    @OriginalMember(owner = "client!ba", name = "<init>", descriptor = "(I)V", line = 216)
    public class53(int arg0) {
        this.field904 = arg0;
        int var2 = 1;
        this.field903 = arg0;
        while ((var2 + var2) < arg0) {
            var2 += var2;
        }
        this.field906 = new class170(var2);
    }

    @OriginalMember(owner = "client!ba", name = "c", descriptor = "(B)V", line = 124)
    public static void method442(byte arg0) {
        field898 = (boolean[][]) null;
        int var1 = 72 / ((70 - arg0) / 36);
        field902 = null;
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(IJ)Laj;", line = 138)
    public final class199 method443(int arg0, long arg1) {
        if (arg0 != -2) {
            return (class199) null;
        }
        field907++;
        class199 var4 = (class199) this.field906.method1222(0, arg1);
        if (var4 != null) {
            this.field909.method1595(true, var4);
        }
        return var4;
    }

    @OriginalMember(owner = "client!ba", name = "b", descriptor = "(IJ)Ljava/lang/String;", line = 181)
    public static final String method444(int arg0, long arg1) {
        field901++;
        if (arg1 <= 0L || arg1 >= 6582952005840035281L) {
            return null;
        } else if ((arg1 % 37L) == 0L) {
            return null;
        } else {
            int var3 = 0;
            if (arg0 != 1) {
                return (String) null;
            }
            for (long var4 = arg1; var4 != 0L; var4 /= 37L) {
                var3++;
            }
            StringBuffer var6 = new StringBuffer(var3);
            while (arg1 != 0L) {
                long var7 = arg1;
                arg1 /= 37L;
                var6.append(class166.field2538[(int) (var7 - arg1 * 37L)]);
            }
            return var6.reverse().toString();
        }
    }
}
