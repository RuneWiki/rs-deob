import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bj")
public class class360 extends class224 implements Runnable {

    @OriginalMember(owner = "client!bj", name = "q", descriptor = "Z")
    private boolean field5168 = true;

    @OriginalMember(owner = "client!bj", name = "z", descriptor = "I")
    public int field5177 = -1;

    @OriginalMember(owner = "client!bj", name = "v", descriptor = "Ltu;")
    private class7 field5173;

    @OriginalMember(owner = "client!bj", name = "y", descriptor = "Z")
    public static boolean field5176 = false;

    @OriginalMember(owner = "client!bj", name = "r", descriptor = "I")
    public static int field5169;

    @OriginalMember(owner = "client!bj", name = "s", descriptor = "I")
    public static int field5170;

    @OriginalMember(owner = "client!bj", name = "t", descriptor = "I")
    public static int field5171;

    @OriginalMember(owner = "client!bj", name = "u", descriptor = "I")
    public static int field5172;

    @OriginalMember(owner = "client!bj", name = "w", descriptor = "I")
    public static int field5174;

    @OriginalMember(owner = "client!bj", name = "A", descriptor = "I")
    public static int field5178;

    @OriginalMember(owner = "client!bj", name = "C", descriptor = "I")
    public static int field5180;

    @OriginalMember(owner = "client!bj", name = "B", descriptor = "Ljava/lang/String;")
    public static String field5179;

    @OriginalMember(owner = "client!bj", name = "x", descriptor = "[Lo;")
    public static class359[] field5175;

    @OriginalMember(owner = "client!bj", name = "b", descriptor = "(I)V", line = 6)
    public final void method2147(int arg0) {
        this.field5168 = false;
        field5171++;
        if (arg0 != 967669134) {
            method2151(-3);
        }
    }

    @OriginalMember(owner = "client!bj", name = "<init>", descriptor = "(Ltu;)V", line = 274)
    public class360(class7 arg0) {
        this.field5173 = arg0;
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(Lnf;II)Z", line = 25)
    public static final boolean method2148(class28 arg0, int arg1, int arg2) {
        field5170++;
        int var3 = -13 / ((26 - arg1) / 54);
        int var4 = arg0.method194(2, -15886);
        if (var4 == 0) {
            if (arg0.method194(1, -15886) != 0) {
                method2148(arg0, 90, arg2);
            }
            int var5 = arg0.method194(6, -15886);
            int var6 = arg0.method194(6, -15886);
            boolean var7 = arg0.method194(1, -15886) == 1;
            if (var7) {
                class505.field7389[class154.field2383++] = arg2;
            }
            if (class45.field642[arg2] != null) {
                throw new RuntimeException("hr:lr");
            }
            class137 var8 = class312.field4240[arg2];
            class487 var9 = class45.field642[arg2] = new class487();
            var9.field179 = arg2;
            if (class161.field2438[arg2] != null) {
                var9.method2892((byte) 53, class161.field2438[arg2]);
            }
            var9.method106(1113158831, true, var8.field2068);
            var9.field202 = var8.field2072;
            int var10 = var8.field2070;
            int var11 = var10 >> 28;
            int var12 = (var10 & 0x3FC86A) >> 14;
            var9.field7046 = var8.field2066;
            int var13 = var10 & 0xFF;
            var9.field258[0] = class195.field2829[arg2];
            var9.field6279 = (byte) var11;
            var9.method2888((byte) -96, (var13 << 6) + var6 - class399.field5727, (var12 << 6) - class110.field1775 + var5);
            var9.field7020 = false;
            class312.field4240[arg2] = null;
            return true;
        } else if (var4 == 1) {
            int var14 = arg0.method194(2, -15886);
            int var15 = class312.field4240[arg2].field2070;
            class312.field4240[arg2].field2070 = ((var15 >> 28) + var14 & 0x3 << 28) + (var15 & 0xFFFFFFF);
            return false;
        } else if (var4 == 2) {
            int var16 = arg0.method194(5, -15886);
            int var17 = var16 >> 3;
            int var18 = var16 & 0x7;
            int var19 = class312.field4240[arg2].field2070;
            int var20 = (var19 >> 28) + var17 & 0x3;
            int var21 = var19 >> 14 & 0xFF;
            int var22 = var19 & 0xFF;
            if (var18 == 0) {
                var22--;
                var21--;
            }
            if (var18 == 1) {
                var22--;
            }
            if (var18 == 2) {
                var21++;
                var22--;
            }
            if (var18 == 3) {
                var21--;
            }
            if (var18 == 4) {
                var21++;
            }
            if (var18 == 5) {
                var21--;
                var22++;
            }
            if (var18 == 6) {
                var22++;
            }
            if (var18 == 7) {
                var21++;
                var22++;
            }
            class312.field4240[arg2].field2070 = (var20 << 28) + (var21 << 14) + var22;
            return false;
        } else {
            int var23 = arg0.method194(18, -15886);
            int var24 = var23 >> 16;
            int var25 = (var23 & 0xFFB7) >> 8;
            int var26 = var23 & 0xFF;
            int var27 = class312.field4240[arg2].field2070;
            int var28 = (var27 >> 28) + var24 & 0x3;
            int var29 = (var27 >> 14) + var25 & 0xFF;
            int var30 = var26 + var27 & 0xFF;
            class312.field4240[arg2].field2070 = (var28 << 28) + (var29 << 14) + var30;
            return false;
        }
    }

    @OriginalMember(owner = "client!bj", name = "b", descriptor = "(B)V", line = 188)
    public final void method2149(byte arg0) {
        (new Thread(this, "a")).start();
        int var2 = 18 / ((-arg0 - 51) / 49);
        field5169++;
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(BI)V", line = 201)
    public static final void method2150(byte arg0, int arg1) {
        field5174++;
        class314 var2 = class177.method1213(false, 2, arg1);
        if (arg0 != 76) {
            field5179 = null;
        }
        var2.method1811((byte) 86);
    }

    @OriginalMember(owner = "client!bj", name = "run", descriptor = "()V", line = 214)
    public final void run() {
        field5172++;
        while (this.field5168) {
            this.field5173.method44(-124, this);
        }
    }

    @OriginalMember(owner = "client!bj", name = "c", descriptor = "(I)V", line = 226)
    public static void method2151(int arg0) {
        if (arg0 != -12202) {
            field5178 = 43;
        }
        field5179 = null;
        field5175 = null;
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(III)I", line = 240)
    public static final int method2152(int arg0, int arg1, int arg2) {
        if (arg2 != 8946) {
            method2148(null, 97, -122);
        }
        field5180++;
        if (arg1 < arg0) {
            int var3 = arg1;
            arg1 = arg0;
            arg0 = var3;
        }
        while (arg0 != 0) {
            int var4 = arg1 % arg0;
            arg1 = arg0;
            arg0 = var4;
        }
        return arg1;
    }
}
