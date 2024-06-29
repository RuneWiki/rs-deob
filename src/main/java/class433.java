import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!li")
public class class433 extends class416 {

    @OriginalMember(owner = "client!li", name = "O", descriptor = "I")
    public int field5967;

    @OriginalMember(owner = "client!li", name = "F", descriptor = "Z")
    public boolean field5959;

    @OriginalMember(owner = "client!li", name = "R", descriptor = "J")
    public long field5970;

    @OriginalMember(owner = "client!li", name = "E", descriptor = "J")
    public long field5958;

    @OriginalMember(owner = "client!li", name = "B", descriptor = "Z")
    public boolean field5955;

    @OriginalMember(owner = "client!li", name = "G", descriptor = "Ljava/lang/String;")
    public String field5960;

    @OriginalMember(owner = "client!li", name = "Q", descriptor = "Z")
    public boolean field5969;

    @OriginalMember(owner = "client!li", name = "M", descriptor = "Ljava/lang/String;")
    public String field5965;

    @OriginalMember(owner = "client!li", name = "J", descriptor = "I")
    public int field5963;

    @OriginalMember(owner = "client!li", name = "x", descriptor = "I")
    public int field5951;

    @OriginalMember(owner = "client!li", name = "I", descriptor = "I")
    public int field5962;

    @OriginalMember(owner = "client!li", name = "P", descriptor = "I")
    public int field5968;

    @OriginalMember(owner = "client!li", name = "z", descriptor = "I")
    public static int field5953 = 0;

    @OriginalMember(owner = "client!li", name = "C", descriptor = "Z")
    public static boolean field5956 = false;

    @OriginalMember(owner = "client!li", name = "K", descriptor = "[I")
    public static int[] field5964 = new int[5];

    @OriginalMember(owner = "client!li", name = "D", descriptor = "[I")
    public static int[] field5957 = new int[1];

    @OriginalMember(owner = "client!li", name = "A", descriptor = "[J")
    public static long[] field5954 = new long[32];

    @OriginalMember(owner = "client!li", name = "H", descriptor = "I")
    public static int field5961;

    @OriginalMember(owner = "client!li", name = "N", descriptor = "I")
    public static int field5966;

    @OriginalMember(owner = "client!li", name = "y", descriptor = "Ljava/lang/String;")
    public String field5952;

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(II[FIFIIIII[F)V", line = 8)
    public static final void method2492(int arg0, int arg1, float[] arg2, int arg3, float arg4, int arg5, int arg6, int arg7, int arg8, int arg9, float[] arg10) {
        int var11 = arg1 - arg5;
        field5961++;
        int var12 = arg7 - arg8;
        int var13 = arg6 - arg9;
        float var14 = arg10[2] * (float) var13 + arg10[1] * (float) var11 + arg10[0] * (float) var12;
        float var15 = arg10[5] * (float) var13 + arg10[4] * (float) var11 + arg10[3] * (float) var12;
        float var16 = arg10[arg3] * (float) var13 + arg10[7] * (float) var11 + arg10[6] * (float) var12;
        float var17 = (float) Math.sqrt((double) (var16 * var16 + var14 * var14 + var15 * var15));
        float var18 = (float) Math.atan2((double) var14, (double) var16) / 6.2831855F + 0.5F;
        float var19 = (float) Math.asin((double) (var15 / var17)) / 3.1415927F + arg4 + 0.5F;
        if (arg0 == 1) {
            float var21 = var18;
            var18 = -var19;
            var19 = var21;
        } else if (arg0 == 2) {
            var19 = -var19;
            var18 = -var18;
        } else if (arg0 == 3) {
            float var20 = var18;
            var18 = var19;
            var19 = -var20;
        }
        arg2[1] = var19;
        arg2[0] = var18;
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(I)V", line = 62)
    public static void method2493(int arg0) {
        field5957 = null;
        field5954 = null;
        if (arg0 != -16334) {
            method2492(-7, -112, null, 14, 0.023782212F, -114, 115, 59, -4, 32, null);
        }
        field5964 = null;
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(IIJ)Ljava/lang/String;", line = 82)
    public static final String method2494(int arg0, int arg1, long arg2) {
        class56.method376(arg2, -8474);
        field5966++;
        int var4 = class132.field2151.get(5);
        int var5 = class132.field2151.get(2) + 1;
        if (arg0 >= -98) {
            method2492(78, -12, null, -58, 0.71233284F, -117, -73, -87, 1, 61, null);
        }
        int var6 = class132.field2151.get(1);
        int var7 = class132.field2151.get(11);
        int var8 = class132.field2151.get(12);
        return Integer.toString(var4 / 10) + var4 % 10 + "/" + var5 / 10 + var5 % 10 + "/" + var6 % 100 / 10 + var6 % 10 + " " + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10;
    }

    @OriginalMember(owner = "client!li", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIJIIZZJZ)V", line = 122)
    public class433(String arg0, String arg1, int arg2, int arg3, int arg4, long arg5, int arg6, int arg7, boolean arg8, boolean arg9, long arg10, boolean arg11) {
        this.field5967 = arg4;
        this.field5959 = arg9;
        this.field5970 = arg5;
        this.field5958 = arg10;
        this.field5955 = arg11;
        this.field5960 = arg0;
        this.field5969 = arg8;
        this.field5965 = arg1;
        this.field5963 = arg3;
        this.field5951 = arg7;
        this.field5962 = arg6;
        this.field5968 = arg2;
    }
}
