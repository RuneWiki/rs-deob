import java.awt.Font;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qh")
public class class153 extends class122 {

    @OriginalMember(owner = "client!qh", name = "lb", descriptor = "I")
    private int field2952 = 0;

    @OriginalMember(owner = "client!qh", name = "K", descriptor = "Z")
    private boolean field2925 = false;

    @OriginalMember(owner = "client!qh", name = "vb", descriptor = "I")
    private int field2962 = 0;

    @OriginalMember(owner = "client!qh", name = "wb", descriptor = "I")
    private int field2963;

    @OriginalMember(owner = "client!qh", name = "rb", descriptor = "I")
    private int field2958;

    @OriginalMember(owner = "client!qh", name = "eb", descriptor = "I")
    public int field2945;

    @OriginalMember(owner = "client!qh", name = "S", descriptor = "I")
    public int field2933;

    @OriginalMember(owner = "client!qh", name = "mb", descriptor = "I")
    public int field2953;

    @OriginalMember(owner = "client!qh", name = "sb", descriptor = "I")
    private int field2959;

    @OriginalMember(owner = "client!qh", name = "hb", descriptor = "I")
    public int field2948;

    @OriginalMember(owner = "client!qh", name = "V", descriptor = "I")
    public int field2936;

    @OriginalMember(owner = "client!qh", name = "pb", descriptor = "I")
    private int field2956;

    @OriginalMember(owner = "client!qh", name = "ab", descriptor = "I")
    private int field2941;

    @OriginalMember(owner = "client!qh", name = "L", descriptor = "I")
    private int field2926;

    @OriginalMember(owner = "client!qh", name = "tb", descriptor = "Lic;")
    private class77 field2960;

    @OriginalMember(owner = "client!qh", name = "U", descriptor = "[J")
    public static long[] field2935 = new long[100];

    @OriginalMember(owner = "client!qh", name = "W", descriptor = "Z")
    public static boolean field2937 = false;

    @OriginalMember(owner = "client!qh", name = "X", descriptor = "Lai;")
    public static class10 field2938 = class44.method278(")1p", 91);

    @OriginalMember(owner = "client!qh", name = "nb", descriptor = "I")
    public static int field2954 = 0;

    @OriginalMember(owner = "client!qh", name = "ub", descriptor = "Lai;")
    private static class10 field2961 = class44.method278("Prepared sound engine", -48);

    @OriginalMember(owner = "client!qh", name = "bb", descriptor = "Lai;")
    public static class10 field2942 = field2961;

    @OriginalMember(owner = "client!qh", name = "P", descriptor = "D")
    private double field2930;

    @OriginalMember(owner = "client!qh", name = "Q", descriptor = "D")
    private double field2931;

    @OriginalMember(owner = "client!qh", name = "R", descriptor = "D")
    public double field2932;

    @OriginalMember(owner = "client!qh", name = "Z", descriptor = "D")
    public double field2940;

    @OriginalMember(owner = "client!qh", name = "cb", descriptor = "D")
    private double field2943;

    @OriginalMember(owner = "client!qh", name = "fb", descriptor = "D")
    private double field2946;

    @OriginalMember(owner = "client!qh", name = "ob", descriptor = "D")
    private double field2955;

    @OriginalMember(owner = "client!qh", name = "yb", descriptor = "D")
    public double field2965;

    @OriginalMember(owner = "client!qh", name = "M", descriptor = "I")
    public static int field2927;

    @OriginalMember(owner = "client!qh", name = "N", descriptor = "I")
    public int field2928;

    @OriginalMember(owner = "client!qh", name = "Y", descriptor = "I")
    public static int field2939;

    @OriginalMember(owner = "client!qh", name = "db", descriptor = "I")
    public static int field2944;

    @OriginalMember(owner = "client!qh", name = "ib", descriptor = "I")
    public static int field2949;

    @OriginalMember(owner = "client!qh", name = "kb", descriptor = "I")
    public static int field2951;

    @OriginalMember(owner = "client!qh", name = "qb", descriptor = "I")
    private int field2957;

    @OriginalMember(owner = "client!qh", name = "xb", descriptor = "I")
    public static int field2964;

    @OriginalMember(owner = "client!qh", name = "jb", descriptor = "Lwg;")
    public static class206 field2950;

    @OriginalMember(owner = "client!qh", name = "gb", descriptor = "Ljava/awt/Font;")
    public static Font field2947;

    @OriginalMember(owner = "client!qh", name = "O", descriptor = "[Lta;")
    public static class173[] field2929;

    @OriginalMember(owner = "client!qh", name = "T", descriptor = "[[[B")
    public static byte[][][] field2934;

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(ILc;)V")
    public static final void method1036(int arg0, class21 arg1) {
        field2927++;
        class104.field1952 = arg1;
        if (arg0 != 100) {
            field2938 = null;
        }
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(IB)Z")
    public static final boolean method1037(int arg0, byte arg1) {
        field2944++;
        if (arg1 == 125) {
            return (arg0 & 0x1) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!qh", name = "e", descriptor = "(I)Lsa;")
    public final class164 method264(int arg0) {
        field2964++;
        int var2 = -94 % ((arg0 - 66) / 59);
        class154 var3 = class135.method919(false, this.field2956);
        class164 var4 = var3.method1048(this.field2952, -41);
        if (var4 == null) {
            return null;
        } else {
            var4.method1089(this.field2957);
            return var4;
        }
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(IIIII)V")
    public final void method1038(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (!this.field2925) {
            double var6 = (double) (arg1 - this.field2958);
            double var8 = (double) (arg2 - this.field2963);
            double var10 = Math.sqrt(var6 * var6 + var8 * var8);
            this.field2932 = (double) this.field2959 * var8 / var10 + (double) this.field2963;
            this.field2940 = (double) this.field2959 * var6 / var10 + (double) this.field2958;
            this.field2965 = this.field2926;
        }
        if (arg3 >= -100) {
            return;
        }
        field2939++;
        double var12 = (double) (this.field2948 + 1 - arg0);
        this.field2943 = ((double) arg1 - this.field2940) / var12;
        this.field2931 = ((double) arg2 - this.field2932) / var12;
        this.field2946 = Math.sqrt(this.field2943 * this.field2943 + this.field2931 * this.field2931);
        if (!this.field2925) {
            this.field2955 = -this.field2946 * Math.tan((double) this.field2941 * 0.02454369D);
        }
        this.field2930 = ((double) arg4 - this.field2965 - this.field2955 * var12) * 2.0D / (var12 * var12);
    }

    @OriginalMember(owner = "client!qh", name = "b", descriptor = "(II)V")
    public final void method1039(int arg0, int arg1) {
        field2951++;
        this.field2965 += this.field2930 * 0.5D * (double) arg1 * (double) arg1 + (double) arg1 * this.field2955;
        this.field2925 = true;
        if (arg0 < 78) {
            method1041(-22);
        }
        this.field2955 += (double) arg1 * this.field2930;
        this.field2940 += (double) arg1 * this.field2943;
        this.field2932 += (double) arg1 * this.field2931;
        this.field2928 = (int) (Math.atan2(this.field2943, this.field2931) * 325.949D) + 1024 & 0x7FF;
        this.field2957 = (int) (Math.atan2(this.field2955, this.field2946) * 325.949D) & 0x7FF;
        if (this.field2960 == null) {
            return;
        }
        this.field2962 += arg1;
        while (true) {
            do {
                do {
                    if (this.field2960.field1358[this.field2952] >= this.field2962) {
                        return;
                    }
                    this.field2962 -= this.field2960.field1358[this.field2952];
                    this.field2952++;
                } while (this.field2960.field1339.length > this.field2952);
                this.field2952 -= this.field2960.field1355;
            } while (this.field2952 >= 0 && this.field2952 < this.field2960.field1339.length);
            this.field2952 = 0;
        }
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(Ljava/lang/Object;IZ)[B")
    public static final byte[] method1040(Object arg0, int arg1, boolean arg2) {
        field2949++;
        if (arg1 != 27023) {
            return null;
        } else if (arg0 == null) {
            return null;
        } else if (arg0 instanceof byte[]) {
            byte[] var3 = (byte[]) arg0;
            return arg2 ? class65.method427(false, var3) : var3;
        } else if (arg0 instanceof class70) {
            class70 var4 = (class70) arg0;
            return var4.method396(2006780792);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!qh", name = "f", descriptor = "(I)V")
    public static void method1041(int arg0) {
        field2950 = null;
        if (arg0 != 2047) {
            method1037(44, (byte) 13);
        }
        field2942 = null;
        field2934 = null;
        field2929 = null;
        field2947 = null;
        field2961 = null;
        field2938 = null;
        field2935 = null;
    }

    @OriginalMember(owner = "client!qh", name = "<init>", descriptor = "(IIIIIIIIIII)V")
    public class153(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field2963 = arg3;
        this.field2958 = arg2;
        this.field2945 = arg5;
        this.field2925 = false;
        this.field2933 = arg9;
        this.field2953 = arg10;
        this.field2959 = arg8;
        this.field2948 = arg6;
        this.field2936 = arg1;
        this.field2956 = arg0;
        this.field2941 = arg7;
        this.field2926 = arg4;
        int var12 = class135.method919(false, this.field2956).field2981;
        if (var12 == -1) {
            this.field2960 = null;
        } else {
            this.field2960 = class142.method958((byte) -98, var12);
        }
    }
}
