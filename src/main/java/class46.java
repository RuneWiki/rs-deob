import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ee")
public class class46 extends class35 {

    @OriginalMember(owner = "client!ee", name = "gb", descriptor = "Z")
    private boolean field959 = false;

    @OriginalMember(owner = "client!ee", name = "qb", descriptor = "I")
    private int field969 = 0;

    @OriginalMember(owner = "client!ee", name = "ob", descriptor = "I")
    private int field967 = 0;

    @OriginalMember(owner = "client!ee", name = "Z", descriptor = "I")
    public int field952;

    @OriginalMember(owner = "client!ee", name = "Gb", descriptor = "I")
    private int field985;

    @OriginalMember(owner = "client!ee", name = "jb", descriptor = "I")
    private int field962;

    @OriginalMember(owner = "client!ee", name = "Mb", descriptor = "I")
    private int field991;

    @OriginalMember(owner = "client!ee", name = "lb", descriptor = "I")
    private int field964;

    @OriginalMember(owner = "client!ee", name = "vb", descriptor = "I")
    public int field974;

    @OriginalMember(owner = "client!ee", name = "fb", descriptor = "I")
    public int field958;

    @OriginalMember(owner = "client!ee", name = "bb", descriptor = "I")
    private int field954;

    @OriginalMember(owner = "client!ee", name = "zb", descriptor = "I")
    private int field978;

    @OriginalMember(owner = "client!ee", name = "tb", descriptor = "I")
    public int field972;

    @OriginalMember(owner = "client!ee", name = "kb", descriptor = "I")
    public int field963;

    @OriginalMember(owner = "client!ee", name = "Pb", descriptor = "Lri;")
    private class178 field994;

    @OriginalMember(owner = "client!ee", name = "ib", descriptor = "Lrd;")
    private static class173 field961 = class133.method843("Account locked as we suspect it has been stolen)3", -98);

    @OriginalMember(owner = "client!ee", name = "cb", descriptor = "[J")
    public static long[] field955 = new long[32];

    @OriginalMember(owner = "client!ee", name = "Ab", descriptor = "Lrd;")
    public static class173 field979 = class133.method843("headicons_pk", 28);

    @OriginalMember(owner = "client!ee", name = "Db", descriptor = "[[S")
    public static short[][] field982 = new short[][] { new short[0], new short[0], new short[0], new short[0], new short[0] };

    @OriginalMember(owner = "client!ee", name = "nb", descriptor = "J")
    public static volatile long field966 = 0L;

    @OriginalMember(owner = "client!ee", name = "rb", descriptor = "I")
    public static int field970 = 0;

    @OriginalMember(owner = "client!ee", name = "yb", descriptor = "Lrd;")
    public static class173 field977 = class133.method843("lila:", 121);

    @OriginalMember(owner = "client!ee", name = "wb", descriptor = "[[[I")
    public static int[][][] field975 = new int[4][105][105];

    @OriginalMember(owner = "client!ee", name = "Bb", descriptor = "Lrd;")
    public static class173 field980 = class133.method843("<col=80ff00>", -109);

    @OriginalMember(owner = "client!ee", name = "Ob", descriptor = "Lrd;")
    private static class173 field993 = class133.method843("Close", 122);

    @OriginalMember(owner = "client!ee", name = "Fb", descriptor = "Lrd;")
    public static class173 field984 = field993;

    @OriginalMember(owner = "client!ee", name = "Nb", descriptor = "Lrd;")
    public static class173 field992 = field961;

    @OriginalMember(owner = "client!ee", name = "ab", descriptor = "D")
    private double field953;

    @OriginalMember(owner = "client!ee", name = "mb", descriptor = "D")
    private double field965;

    @OriginalMember(owner = "client!ee", name = "pb", descriptor = "D")
    public double field968;

    @OriginalMember(owner = "client!ee", name = "ub", descriptor = "D")
    private double field973;

    @OriginalMember(owner = "client!ee", name = "Cb", descriptor = "D")
    private double field981;

    @OriginalMember(owner = "client!ee", name = "Eb", descriptor = "D")
    public double field983;

    @OriginalMember(owner = "client!ee", name = "Hb", descriptor = "D")
    public double field986;

    @OriginalMember(owner = "client!ee", name = "Ib", descriptor = "D")
    private double field987;

    @OriginalMember(owner = "client!ee", name = "eb", descriptor = "I")
    public static int field957;

    @OriginalMember(owner = "client!ee", name = "hb", descriptor = "I")
    private int field960;

    @OriginalMember(owner = "client!ee", name = "xb", descriptor = "I")
    public static int field976;

    @OriginalMember(owner = "client!ee", name = "Jb", descriptor = "I")
    public static int field988;

    @OriginalMember(owner = "client!ee", name = "Kb", descriptor = "I")
    public int field989;

    @OriginalMember(owner = "client!ee", name = "Lb", descriptor = "I")
    public static int field990;

    @OriginalMember(owner = "client!ee", name = "db", descriptor = "Lbc;")
    public static class14 field956;

    @OriginalMember(owner = "client!ee", name = "sb", descriptor = "[Lsa;")
    public static class180[] field971;

    @OriginalMember(owner = "client!ee", name = "f", descriptor = "(B)V")
    public static void method322(byte arg0) {
        field956 = null;
        field982 = null;
        field979 = null;
        field961 = null;
        field971 = null;
        field955 = null;
        field975 = null;
        field992 = null;
        field993 = null;
        if (arg0 > 26) {
            field980 = null;
            field977 = null;
            field984 = null;
        }
    }

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "(II)V")
    public final void method323(int arg0, int arg1) {
        this.field983 += (double) arg0 * this.field981;
        this.field986 += this.field987 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field973;
        this.field968 += (double) arg0 * this.field965;
        this.field959 = true;
        field957++;
        this.field973 += (double) arg0 * this.field987;
        this.field989 = (int) (Math.atan2(this.field981, this.field965) * 325.949D) + 1024 & 0x7FF;
        this.field960 = (int) (Math.atan2(this.field973, this.field953) * 325.949D) & 0x7FF;
        int var3 = 24 / ((arg1 - 66) / 38);
        if (this.field994 == null) {
            return;
        }
        this.field967 += arg0;
        while (true) {
            do {
                do {
                    if (this.field994.field3498[this.field969] >= this.field967) {
                        return;
                    }
                    this.field967 -= this.field994.field3498[this.field969];
                    this.field969++;
                } while (this.field969 < this.field994.field3496.length);
                this.field969 -= this.field994.field3497;
            } while (this.field969 >= 0 && this.field969 < this.field994.field3496.length);
            this.field969 = 0;
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(ZIIII)V")
    public final void method324(boolean arg0, int arg1, int arg2, int arg3, int arg4) {
        if (!this.field959) {
            double var6 = (double) (arg1 - this.field985);
            double var8 = (double) (arg4 - this.field991);
            double var10 = Math.sqrt(var6 * var6 + var8 * var8);
            this.field986 = this.field954;
            this.field968 = (double) this.field978 * var8 / var10 + (double) this.field991;
            this.field983 = (double) this.field978 * var6 / var10 + (double) this.field985;
        }
        field990++;
        double var12 = (double) (this.field972 + 1 - arg3);
        this.field965 = ((double) arg4 - this.field968) / var12;
        this.field981 = ((double) arg1 - this.field983) / var12;
        this.field953 = Math.sqrt(this.field981 * this.field981 + this.field965 * this.field965);
        if (!this.field959) {
            this.field973 = -this.field953 * Math.tan((double) this.field964 * 0.02454369D);
        }
        if (arg0) {
            this.field983 = 0.03454179418788281D;
        }
        this.field987 = ((double) arg2 - this.field986 - this.field973 * var12) * 2.0D / (var12 * var12);
    }

    @OriginalMember(owner = "client!ee", name = "e", descriptor = "(I)Lvf;")
    public final class213 method274(int arg0) {
        field988++;
        class123 var2 = class219.method1427(this.field962, arg0 ^ 0x7F95);
        class213 var3 = var2.method790(this.field969, 85);
        if (var3 == null) {
            return null;
        }
        var3.method1399(this.field960);
        if (arg0 != -32768) {
            field984 = null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(IILbc;IIIZ)V")
    public static final void method325(int arg0, int arg1, class14 arg2, int arg3, int arg4, int arg5, boolean arg6) {
        class12.field192 = arg2;
        class134.field2535 = arg0;
        field976++;
        class55.field1097 = arg4;
        class194.field3761 = arg3;
        class193.field3749 = arg6;
        class28.field570 = arg5;
        class58.field1145 = arg1;
    }

    @OriginalMember(owner = "client!ee", name = "<init>", descriptor = "(IIIIIIIIIII)V")
    public class46(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field959 = false;
        this.field952 = arg5;
        this.field985 = arg2;
        this.field962 = arg0;
        this.field991 = arg3;
        this.field964 = arg7;
        this.field974 = arg1;
        this.field958 = arg9;
        this.field954 = arg4;
        this.field978 = arg8;
        this.field972 = arg6;
        this.field963 = arg10;
        int var12 = class219.method1427(this.field962, -126).field2307;
        if (var12 == -1) {
            this.field994 = null;
        } else {
            this.field994 = class167.method1080(11098, var12);
        }
    }
}
