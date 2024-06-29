import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qc")
public class class140 extends class529 {

    @OriginalMember(owner = "client!qc", name = "o", descriptor = "I")
    public int field1897;

    @OriginalMember(owner = "client!qc", name = "n", descriptor = "I")
    public int field1896;

    @OriginalMember(owner = "client!qc", name = "q", descriptor = "Ljava/lang/String;")
    public String field1899;

    @OriginalMember(owner = "client!qc", name = "m", descriptor = "J")
    public long field1895;

    @OriginalMember(owner = "client!qc", name = "p", descriptor = "I")
    public int field1898;

    @OriginalMember(owner = "client!qc", name = "w", descriptor = "I")
    public int field1905;

    @OriginalMember(owner = "client!qc", name = "v", descriptor = "Z")
    public boolean field1904;

    @OriginalMember(owner = "client!qc", name = "t", descriptor = "Ljava/lang/String;")
    public String field1902;

    @OriginalMember(owner = "client!qc", name = "l", descriptor = "I")
    public int field1894;

    @OriginalMember(owner = "client!qc", name = "r", descriptor = "Z")
    public boolean field1900;

    @OriginalMember(owner = "client!qc", name = "s", descriptor = "I")
    public static int field1901;

    @OriginalMember(owner = "client!qc", name = "u", descriptor = "I")
    public static int field1903;

    @OriginalMember(owner = "client!qc", name = "x", descriptor = "[[B")
    public static byte[][] field1906;

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(IILtq;)Z")
    public static final boolean method853(int arg0, int arg1, class276 arg2) {
        field1901++;
        int var3 = arg2.method1852(123, 2);
        if (var3 == 0) {
            if (arg2.method1852(arg0 ^ 0xFFFFFEDF, 1) != 0) {
                method853(arg0, arg1, arg2);
            }
            int var4 = arg2.method1852(arg0 + 467, 6);
            int var5 = arg2.method1852(92, 6);
            boolean var6 = arg2.method1852(116, 1) == 1;
            if (var6) {
                class530.field7787[class275.field4367++] = arg1;
            }
            if (class264.field4276[arg1] != null) {
                throw new RuntimeException("hr:lr");
            }
            class34 var7 = class460.field7103[arg1];
            class350 var8 = class264.field4276[arg1] = new class350();
            var8.field847 = arg1;
            if (class456.field7044[arg1] != null) {
                var8.method2312(class456.field7044[arg1], (byte) 115);
            }
            var8.method426(true, var7.field349, (byte) -111);
            var8.field829 = var7.field346;
            int var9 = var7.field348;
            int var10 = var9 >> 28;
            int var11 = (var9 & 0x3FFBBC) >> 14;
            var8.field5425 = var7.field345;
            int var12 = var9 & 0xFF;
            var8.field895[0] = class467.field7156[arg1];
            var8.field6419 = (byte) var10;
            var8.method2317((var11 << 6) + var4 - class453.field7018, 1584974182, (var12 << 6) + var5 - class126.field1718);
            var8.field5454 = false;
            class460.field7103[arg1] = null;
            return true;
        } else if (var3 == 1) {
            int var13 = arg2.method1852(118, 2);
            int var14 = class460.field7103[arg1].field348;
            class460.field7103[arg1].field348 = ((var14 >> 28) + var13 & 0x3 << 28) + (var14 & 0xFFFFFFF);
            return false;
        } else if (var3 == 2) {
            int var15 = arg2.method1852(112, 5);
            int var16 = var15 >> 3;
            int var17 = var15 & 0x7;
            int var18 = class460.field7103[arg1].field348;
            int var19 = (var18 >> 28) + var16 & 0x3;
            int var20 = (var18 & 0x3FF2BD) >> 14;
            int var21 = var18 & 0xFF;
            if (var17 == 0) {
                var21--;
                var20--;
            }
            if (var17 == 1) {
                var21--;
            }
            if (var17 == 2) {
                var21--;
                var20++;
            }
            if (var17 == 3) {
                var20--;
            }
            if (var17 == 4) {
                var20++;
            }
            if (var17 == 5) {
                var20--;
                var21++;
            }
            if (var17 == 6) {
                var21++;
            }
            if (var17 == 7) {
                var21++;
                var20++;
            }
            class460.field7103[arg1].field348 = (var20 << 14) + ((var19 << 28) + var21);
            return false;
        } else {
            int var22 = arg2.method1852(101, 18);
            if (arg0 != -345) {
                field1906 = null;
            }
            int var23 = var22 >> 16;
            int var24 = (var22 & 0xFFAC) >> 8;
            int var25 = var22 & 0xFF;
            int var26 = class460.field7103[arg1].field348;
            int var27 = (var26 >> 28) + var23 & 0x3;
            int var28 = (var26 >> 14) + var24 & 0xFF;
            int var29 = var26 + var25 & 0xFF;
            class460.field7103[arg1].field348 = (var27 << 28) + (var28 << 14) + var29;
            return false;
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(IIII)V")
    public static final void method854(int arg0, int arg1, int arg2, int arg3) {
        int var4 = class141.field1911.field6112 * arg3 >> 8;
        field1903++;
        if (var4 != 0 && arg1 != -1) {
            class50.method358(arg1, class198.field3045, var4, 23618, false, 0);
            class5.field55 = true;
        }
        int var5 = 80 / ((-arg2 - 63) / 44);
    }

    @OriginalMember(owner = "client!qc", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIJIIZZ)V")
    public class140(String arg0, String arg1, int arg2, int arg3, int arg4, long arg5, int arg6, int arg7, boolean arg8, boolean arg9) {
        this.field1897 = arg6;
        this.field1896 = arg2;
        this.field1899 = arg0;
        this.field1895 = arg5;
        this.field1898 = arg4;
        this.field1905 = arg7;
        this.field1904 = arg9;
        this.field1902 = arg1;
        this.field1894 = arg3;
        this.field1900 = arg8;
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(Z)V")
    public static void method855(boolean arg0) {
        if (!arg0) {
            field1906 = null;
        }
        field1906 = null;
    }
}
