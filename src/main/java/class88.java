import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!al")
public class class88 extends class255 {

    @OriginalMember(owner = "client!al", name = "q", descriptor = "I")
    private int field1233;

    @OriginalMember(owner = "client!al", name = "o", descriptor = "I")
    private int field1231;

    @OriginalMember(owner = "client!al", name = "t", descriptor = "I")
    private int field1236;

    @OriginalMember(owner = "client!al", name = "v", descriptor = "I")
    private int field1238;

    @OriginalMember(owner = "client!al", name = "z", descriptor = "Ljava/lang/String;")
    public static String field1242 = "white:";

    @OriginalMember(owner = "client!al", name = "p", descriptor = "I")
    public static int field1232;

    @OriginalMember(owner = "client!al", name = "r", descriptor = "I")
    public static int field1234;

    @OriginalMember(owner = "client!al", name = "s", descriptor = "I")
    public static int field1235;

    @OriginalMember(owner = "client!al", name = "u", descriptor = "I")
    public static int field1237;

    @OriginalMember(owner = "client!al", name = "w", descriptor = "I")
    public static int field1239;

    @OriginalMember(owner = "client!al", name = "x", descriptor = "I")
    public static int field1240;

    @OriginalMember(owner = "client!al", name = "y", descriptor = "I")
    public static int field1241;

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(III)V", line = 5)
    public final void method699(int arg0, int arg1, int arg2) {
        if (arg0 != 16900) {
            this.method699(106, -122, -99);
        }
        field1240++;
        int var4 = this.field1236 * arg2 >> 12;
        int var5 = this.field1231 * arg2 >> 12;
        int var6 = this.field1233 * arg1 >> 12;
        int var7 = this.field1238 * arg1 >> 12;
        class354.method2466(var6, var4, this.field3809, var7, var5, true, this.field3812);
    }

    @OriginalMember(owner = "client!al", name = "c", descriptor = "(I)V", line = 29)
    public static void method700(int arg0) {
        int var1 = -25 / ((arg0 + 35) / 42);
        field1242 = null;
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(IIB)V", line = 51)
    public final void method701(int arg0, int arg1, byte arg2) {
        field1235++;
        int var4 = 60 / ((1 - arg2) / 57);
        int var5 = this.field1231 * arg0 >> 12;
        int var6 = this.field1236 * arg0 >> 12;
        int var7 = this.field1238 * arg1 >> 12;
        int var8 = this.field1233 * arg1 >> 12;
        class227.method1692(this.field3803, var5, var7, true, var8, var6);
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(IIIII[[I)I", line = 70)
    public static final int method702(int arg0, int arg1, int arg2, int arg3, int arg4, int[][] arg5) {
        field1239++;
        if (arg0 >= -75) {
            field1242 = (String) null;
        }
        int var6 = (128 - arg2) * arg5[arg4][arg1] + arg5[arg4 + 1][arg1] * arg2 >> 7;
        int var7 = (128 - arg2) * arg5[arg4][arg1 + 1] + (arg5[arg4 + 1][arg1 + 1] * arg2) >> 7;
        return (128 - arg3) * var6 + arg3 * var7 >> 7;
    }

    @OriginalMember(owner = "client!al", name = "c", descriptor = "(III)V", line = 85)
    public final void method703(int arg0, int arg1, int arg2) {
        field1232++;
        int var4 = this.field1236 * arg0 >> 12;
        int var5 = this.field1231 * arg0 >> 12;
        int var6 = this.field1238 * arg1 >> 12;
        int var7 = this.field1233 * arg1 >> 12;
        if (arg2 != 27159) {
            this.field1233 = 98;
        }
        class97.method765(this.field3809, var7, var6, this.field3803, var4, this.field3812, (byte) -15, var5);
    }

    @OriginalMember(owner = "client!al", name = "c", descriptor = "(B)V", line = 105)
    public static final void method704(byte arg0) {
        field1237++;
        for (class349 var1 = (class349) class247.field3654.method93((byte) -124); var1 != null; var1 = (class349) class247.field3654.method97(-92)) {
            if (var1.field5393) {
                var1.method2446(7819);
            }
        }
        for (class349 var2 = (class349) class158.field2282.method93((byte) -70); var2 != null; var2 = (class349) class158.field2282.method97(-100)) {
            if (var2.field5393) {
                var2.method2446(7819);
            }
        }
        if (arg0 <= 55) {
            field1241 = -60;
        }
    }

    @OriginalMember(owner = "client!al", name = "<init>", descriptor = "(IIIIIII)V", line = 140)
    public class88(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field1233 = arg3;
        this.field1231 = arg2;
        this.field1236 = arg0;
        this.field1238 = arg1;
    }
}
