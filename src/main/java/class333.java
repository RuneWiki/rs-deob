import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hq")
public class class333 extends class443 {

    @OriginalMember(owner = "client!hq", name = "D", descriptor = "[S")
    public static short[] field4896 = new short[256];

    @OriginalMember(owner = "client!hq", name = "J", descriptor = "F")
    public static float field4902;

    @OriginalMember(owner = "client!hq", name = "u", descriptor = "I")
    public static int field4887;

    @OriginalMember(owner = "client!hq", name = "x", descriptor = "I")
    public static int field4890;

    @OriginalMember(owner = "client!hq", name = "y", descriptor = "I")
    public static int field4891;

    @OriginalMember(owner = "client!hq", name = "A", descriptor = "I")
    public static int field4893;

    @OriginalMember(owner = "client!hq", name = "B", descriptor = "I")
    public static int field4894;

    @OriginalMember(owner = "client!hq", name = "F", descriptor = "I")
    public static int field4898;

    @OriginalMember(owner = "client!hq", name = "G", descriptor = "I")
    public static int field4899;

    @OriginalMember(owner = "client!hq", name = "H", descriptor = "I")
    public static int field4900;

    @OriginalMember(owner = "client!hq", name = "K", descriptor = "I")
    public static int field4903;

    @OriginalMember(owner = "client!hq", name = "E", descriptor = "Lir;")
    public static class185 field4897;

    @OriginalMember(owner = "client!hq", name = "C", descriptor = "Ljava/lang/String;")
    public String field4895;

    @OriginalMember(owner = "client!hq", name = "v", descriptor = "[C")
    public char[] field4888;

    @OriginalMember(owner = "client!hq", name = "I", descriptor = "[C")
    public char[] field4901;

    @OriginalMember(owner = "client!hq", name = "w", descriptor = "[I")
    public int[] field4889;

    @OriginalMember(owner = "client!hq", name = "z", descriptor = "[I")
    public int[] field4892;

    @OriginalMember(owner = "client!hq", name = "d", descriptor = "(I)V", line = 4)
    public final void method2173(int arg0) {
        field4903++;
        if (arg0 <= 79) {
            return;
        }
        if (this.field4892 != null) {
            for (int var2 = 0; var2 < this.field4892.length; var2++) {
                this.field4892[var2] = class258.method1708(this.field4892[var2], 32768);
            }
        }
        if (this.field4889 != null) {
            for (int var3 = 0; var3 < this.field4889.length; var3++) {
                this.field4889[var3] = class258.method1708(this.field4889[var3], 32768);
            }
        }
    }

    @OriginalMember(owner = "client!hq", name = "d", descriptor = "(B)V", line = 34)
    public static void method2174(byte arg0) {
        field4897 = null;
        field4896 = null;
        if (arg0 < 125) {
            method2180(-50, 38);
        }
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "([Ljava/lang/Object;B[III)V", line = 50)
    public static final void method2175(Object[] arg0, byte arg1, int[] arg2, int arg3, int arg4) {
        if (arg3 > arg4) {
            int var5 = (arg3 + arg4) / 2;
            int var6 = arg4;
            int var7 = arg2[var5];
            arg2[var5] = arg2[arg3];
            arg2[arg3] = var7;
            Object var8 = arg0[var5];
            arg0[var5] = arg0[arg3];
            arg0[arg3] = var8;
            for (int var9 = arg4; var9 < arg3; var9++) {
                if (arg2[var9] < (var9 & 0x1) + var7) {
                    int var10 = arg2[var9];
                    arg2[var9] = arg2[var6];
                    arg2[var6] = var10;
                    Object var11 = arg0[var9];
                    arg0[var9] = arg0[var6];
                    arg0[var6++] = var11;
                }
            }
            arg2[arg3] = arg2[var6];
            arg2[var6] = var7;
            arg0[arg3] = arg0[var6];
            arg0[var6] = var8;
            method2175(arg0, (byte) -122, arg2, var6 - 1, arg4);
            method2175(arg0, (byte) 29, arg2, arg3, var6 + 1);
        }
        field4899++;
        int var12 = 109 % ((arg1 + 79) / 39);
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(BI)V", line = 104)
    public static final void method2176(byte arg0, int arg1) {
        field4890++;
        if (arg0 > 115) {
            class440 var2 = class186.method1241(arg1, 3, (byte) 56);
            var2.method2749(13828096);
        }
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(Lfb;IB)V", line = 117)
    private final void method2177(class341 arg0, int arg1, byte arg2) {
        if (arg1 == 1) {
            this.field4895 = arg0.method2261((byte) 81);
        } else if (arg1 == 2) {
            int var4 = arg0.method2233((byte) 104);
            this.field4901 = new char[var4];
            this.field4889 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field4889[var5] = arg0.method2239(-1076227960);
                byte var6 = arg0.method2211(255);
                this.field4901[var5] = var6 == 0 ? 0 : class95.method758(var6, false);
            }
        } else if (arg1 == 3) {
            int var7 = arg0.method2233((byte) 104);
            this.field4892 = new int[var7];
            this.field4888 = new char[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field4892[var8] = arg0.method2239(-1076227960);
                byte var9 = arg0.method2211(255);
                this.field4888[var8] = var9 == 0 ? 0 : class95.method758(var9, false);
            }
        }
        int var10 = 17 % ((arg2 + 9) / 60);
        field4891++;
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(ZLfb;)V", line = 187)
    public final void method2178(boolean arg0, class341 arg1) {
        if (!arg0) {
            this.field4888 = null;
        }
        while (true) {
            int var3 = arg1.method2233((byte) 104);
            if (var3 == 0) {
                field4893++;
                return;
            }
            this.method2177(arg1, var3, (byte) -88);
        }
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(CB)I", line = 209)
    public final int method2179(char arg0, byte arg1) {
        if (arg1 >= -110) {
            this.field4889 = null;
        }
        field4887++;
        if (this.field4889 == null) {
            return -1;
        }
        for (int var3 = 0; var3 < this.field4889.length; var3++) {
            if (this.field4901[var3] == arg0) {
                return this.field4889[var3];
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!hq", name = "b", descriptor = "(II)V", line = 242)
    public static final void method2180(int arg0, int arg1) {
        class163.field2227 = 1000 / arg0;
        if (arg1 == -17498) {
            field4898++;
        }
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(CI)I", line = 255)
    public final int method2181(char arg0, int arg1) {
        if (arg1 != -29513) {
            return 7;
        }
        field4894++;
        if (this.field4892 == null) {
            return -1;
        }
        for (int var3 = 0; var3 < this.field4892.length; var3++) {
            if (this.field4888[var3] == arg0) {
                return this.field4892[var3];
            }
        }
        return -1;
    }
}
