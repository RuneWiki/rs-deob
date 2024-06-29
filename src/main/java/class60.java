import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!b")
public class class60 extends class112 {

    @OriginalMember(owner = "client!b", name = "N", descriptor = "Lwm;")
    public static class152 field910 = class157.method1048("", 117);

    @OriginalMember(owner = "client!b", name = "Q", descriptor = "Lwm;")
    public static class152 field913 = class157.method1048("<col=ff3000>", 98);

    @OriginalMember(owner = "client!b", name = "K", descriptor = "I")
    public static int field907;

    @OriginalMember(owner = "client!b", name = "L", descriptor = "I")
    public static int field908;

    @OriginalMember(owner = "client!b", name = "M", descriptor = "I")
    public static int field909;

    @OriginalMember(owner = "client!b", name = "O", descriptor = "I")
    public static int field911;

    @OriginalMember(owner = "client!b", name = "R", descriptor = "Lu;")
    public static class255 field914;

    @OriginalMember(owner = "client!b", name = "P", descriptor = "[[[B")
    public static byte[][][] field912;

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(BI)[I", line = 11)
    public final int[] method53(byte arg0, int arg1) {
        field909++;
        if (arg0 != -3) {
            field912 = (byte[][][]) ((byte[][][]) null);
        }
        int[] var3 = this.field1585.method1952(arg1, (byte) 49);
        if (this.field1585.field4935) {
            for (int var4 = 0; var4 < class58.field889; var4++) {
                this.method398(true, arg1, var4);
                int[] var5 = this.method751(class132.field2026, (byte) 104, 0);
                var3[var4] = var5[class5.field78];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(ZII)V", line = 47)
    private final void method398(boolean arg0, int arg1, int arg2) {
        if (!arg0) {
            this.method53((byte) 90, 105);
        }
        field911++;
        int var4 = class114.field1620[arg1];
        int var5 = class131.field1992[arg2];
        float var6 = (float) Math.atan2((double) (var5 - 2048), (double) (var4 - 2048));
        if ((double) var6 >= -3.141592653589793D && (double) var6 <= -2.356194490192345D) {
            class132.field2026 = arg1;
            class5.field78 = arg2;
        } else if (-1.5707963267948966D >= (double) var6 && -2.356194490192345D <= (double) var6) {
            class132.field2026 = arg2;
            class5.field78 = arg1;
        } else if ((double) var6 <= -0.7853981633974483D && (double) var6 >= -1.5707963267948966D) {
            class132.field2026 = arg2;
            class5.field78 = class58.field889 - arg1;
        } else if (var6 <= 0.0F && -0.7853981633974483D <= (double) var6) {
            class132.field2026 = class268.field4526 - arg1;
            class5.field78 = arg2;
        } else if (var6 >= 0.0F && (double) var6 <= 0.7853981633974483D) {
            class5.field78 = class58.field889 - arg2;
            class132.field2026 = class268.field4526 - arg1;
        } else if ((double) var6 >= 0.7853981633974483D && (double) var6 <= 1.5707963267948966D) {
            class132.field2026 = class268.field4526 - arg2;
            class5.field78 = class58.field889 - arg1;
        } else if ((double) var6 >= 1.5707963267948966D && (double) var6 <= 2.356194490192345D) {
            class5.field78 = arg1;
            class132.field2026 = class268.field4526 - arg2;
        } else if ((double) var6 >= 2.356194490192345D && (double) var6 <= 3.141592653589793D) {
            class5.field78 = class58.field889 - arg2;
            class132.field2026 = arg1;
        }
        class132.field2026 &= class275.field4712;
        class5.field78 &= class251.field4304;
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(IILhi;)V", line = 125)
    public final void method52(int arg0, int arg1, class291 arg2) {
        if (arg0 == 31164) {
            field908++;
            if (arg1 == 0) {
                this.field1591 = arg2.method2011(-26) == 1;
            }
        }
    }

    @OriginalMember(owner = "client!b", name = "h", descriptor = "(I)V", line = 142)
    public static void method399(int arg0) {
        field910 = null;
        if (arg0 == -17760) {
            field913 = null;
            field912 = (byte[][][]) null;
            field914 = null;
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(IZ)[[I", line = 156)
    public final int[][] method55(int arg0, boolean arg1) {
        field907++;
        if (arg1) {
            this.method55(-28, true);
        }
        int[][] var3 = this.field1594.method656((byte) 118, arg0);
        if (this.field1594.field1402) {
            int[] var4 = var3[1];
            int[] var5 = var3[0];
            int[] var6 = var3[2];
            for (int var7 = 0; var7 < class58.field889; var7++) {
                this.method398(true, arg0, var7);
                int[][] var8 = this.method750(0, (byte) -17, class132.field2026);
                var5[var7] = var8[0][class5.field78];
                var4[var7] = var8[1][class5.field78];
                var6[var7] = var8[2][class5.field78];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!b", name = "<init>", descriptor = "()V", line = 208)
    public class60() {
        super(1, false);
    }
}
