import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ad")
public class class128 extends class112 {

    @OriginalMember(owner = "client!ad", name = "S", descriptor = "Z")
    private boolean field1956 = true;

    @OriginalMember(owner = "client!ad", name = "X", descriptor = "Z")
    private boolean field1961 = true;

    @OriginalMember(owner = "client!ad", name = "N", descriptor = "Lwm;")
    private static class152 field1951 = class157.method1048("Loaded textures", 113);

    @OriginalMember(owner = "client!ad", name = "K", descriptor = "I")
    public static int field1948 = 128;

    @OriginalMember(owner = "client!ad", name = "V", descriptor = "Lwm;")
    public static class152 field1959 = class157.method1048("Chargement en cours)3 Veuillez patienter)3", 121);

    @OriginalMember(owner = "client!ad", name = "W", descriptor = "I")
    public static int field1960 = 0;

    @OriginalMember(owner = "client!ad", name = "Z", descriptor = "Lwm;")
    public static class152 field1963 = field1951;

    @OriginalMember(owner = "client!ad", name = "P", descriptor = "[I")
    public static int[] field1953 = new int[1000];

    @OriginalMember(owner = "client!ad", name = "cb", descriptor = "Z")
    public static boolean field1966 = false;

    @OriginalMember(owner = "client!ad", name = "L", descriptor = "I")
    public static int field1949;

    @OriginalMember(owner = "client!ad", name = "M", descriptor = "I")
    public static int field1950;

    @OriginalMember(owner = "client!ad", name = "O", descriptor = "I")
    public static int field1952;

    @OriginalMember(owner = "client!ad", name = "Q", descriptor = "I")
    public static int field1954;

    @OriginalMember(owner = "client!ad", name = "R", descriptor = "I")
    public static int field1955;

    @OriginalMember(owner = "client!ad", name = "T", descriptor = "I")
    public static int field1957;

    @OriginalMember(owner = "client!ad", name = "U", descriptor = "I")
    public static int field1958;

    @OriginalMember(owner = "client!ad", name = "Y", descriptor = "I")
    public static int field1962;

    @OriginalMember(owner = "client!ad", name = "ab", descriptor = "I")
    public static int field1964;

    @OriginalMember(owner = "client!ad", name = "bb", descriptor = "I")
    public static int field1965;

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(Z)V", line = 19)
    public static void method820(boolean arg0) {
        field1951 = null;
        field1959 = null;
        field1963 = null;
        field1953 = null;
        if (!arg0) {
            field1951 = (class152) null;
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(BI)[I", line = 47)
    public final int[] method53(byte arg0, int arg1) {
        int[] var3 = this.field1585.method1952(arg1, (byte) 56);
        if (arg0 != -3) {
            field1959 = (class152) null;
        }
        if (this.field1585.field4935) {
            int[] var4 = this.method751(this.field1956 ? class275.field4712 - arg1 : arg1, (byte) 127, 0);
            if (this.field1961) {
                for (int var5 = 0; var5 < class58.field889; var5++) {
                    var3[var5] = var4[class251.field4304 - var5];
                }
            } else {
                class187.method1247(var4, 0, var3, 0, class58.field889);
            }
        }
        field1954++;
        return var3;
    }

    @OriginalMember(owner = "client!ad", name = "<init>", descriptor = "()V", line = 84)
    public class128() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(IILhi;)V", line = 92)
    public final void method52(int arg0, int arg1, class291 arg2) {
        field1950++;
        if (arg1 == 0) {
            this.field1961 = arg2.method2011(-79) == 1;
        } else if (arg1 == 1) {
            this.field1956 = arg2.method2011(arg0 ^ -31113) == 1;
        } else if (arg1 == 2) {
            this.field1591 = arg2.method2011(arg0 - 31253) == 1;
        }
        if (arg0 != 31164) {
            method823(80, (class205) null);
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(II[Ljava/lang/Object;[II)V", line = 136)
    public static final void method821(int arg0, int arg1, Object[] arg2, int[] arg3, int arg4) {
        field1958++;
        if (arg0 < arg4) {
            int var5 = (arg0 + arg4) / 2;
            int var6 = arg0;
            int var7 = arg3[var5];
            arg3[var5] = arg3[arg4];
            arg3[arg4] = var7;
            Object var8 = arg2[var5];
            arg2[var5] = arg2[arg4];
            arg2[arg4] = var8;
            for (int var9 = arg0; var9 < arg4; var9++) {
                if (arg3[var9] < ((var9 & 0x1) + var7)) {
                    int var10 = arg3[var9];
                    arg3[var9] = arg3[var6];
                    arg3[var6] = var10;
                    Object var11 = arg2[var9];
                    arg2[var9] = arg2[var6];
                    arg2[var6++] = var11;
                }
            }
            arg3[arg4] = arg3[var6];
            arg3[var6] = var7;
            arg2[arg4] = arg2[var6];
            arg2[var6] = var8;
            method821(arg0, -125, arg2, arg3, var6 - 1);
            method821(var6 + 1, -83, arg2, arg3, arg4);
        }
        if (arg1 >= -30) {
            method820(false);
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(IZ)[[I", line = 196)
    public final int[][] method55(int arg0, boolean arg1) {
        if (arg1) {
            return (int[][]) ((int[][]) null);
        }
        field1962++;
        int[][] var3 = this.field1594.method656((byte) 121, arg0);
        if (this.field1594.field1402) {
            int[][] var4 = this.method750(0, (byte) -17, this.field1956 ? class275.field4712 - arg0 : arg0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            if (this.field1961) {
                for (int var12 = 0; var12 < class58.field889; var12++) {
                    var8[var12] = var5[class251.field4304 - var12];
                    var9[var12] = var6[class251.field4304 - var12];
                    var10[var12] = var7[class251.field4304 - var12];
                }
            } else {
                for (int var11 = 0; var11 < class58.field889; var11++) {
                    var8[var11] = var5[var11];
                    var9[var11] = var6[var11];
                    var10[var11] = var7[var11];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(IIILoe;I)V", line = 266)
    public static final void method822(int arg0, int arg1, int arg2, class127 arg3, int arg4) {
        if (class217.field3516) {
            class13.method76(arg1, arg2, arg3.field1876 + arg1, arg3.field1921 + arg2);
        }
        field1949++;
        if (class8.field111 < 3) {
            if (class217.field3516) {
                ((class68) class324.field5655).method440(arg1, arg2, arg3.field1876, arg3.field1921, class324.field5655.field3281 / 2, class324.field5655.field3284 / 2, class272.field4645, 256, (class68) arg3.method818(-1, false));
            } else {
                ((class109) class324.field5655).method513(arg1, arg2, arg3.field1876, arg3.field1921, class324.field5655.field3281 / 2, class324.field5655.field3284 / 2, class272.field4645, 256, arg3.field1776, arg3.field1825);
            }
        } else if (class217.field3516) {
            class203 var5 = arg3.method818(-1, false);
            if (var5 != null) {
                var5.method429(arg1, arg2);
            }
        } else {
            class96.method632(arg1, arg2, 0, arg3.field1776, arg3.field1825);
        }
        class206.field3360[arg0] = true;
        if (arg4 <= 103) {
            field1953 = (int[]) null;
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(ILah;)V", line = 312)
    public static final void method823(int arg0, class205 arg1) {
        field1965++;
        class33.field541 = arg1;
        if (arg0 != -3) {
            field1960 = -3;
        }
    }

    @OriginalMember(owner = "client!ad", name = "h", descriptor = "(I)Lhe;", line = 334)
    public static final class94 method824(int arg0) {
        field1955++;
        try {
            return arg0 == -19452 ? (class94) Class.forName("el").getDeclaredConstructor().newInstance() : (class94) null;
        } catch (Throwable var2) {
            return null;
        }
    }
}
