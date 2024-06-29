import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wn")
public class class174 {

    @OriginalMember(owner = "client!wn", name = "f", descriptor = "Lgp;")
    public static class459 field2244 = new class459(4, 6);

    @OriginalMember(owner = "client!wn", name = "g", descriptor = "I")
    public static int field2245 = -1;

    @OriginalMember(owner = "client!wn", name = "b", descriptor = "I")
    public static int field2240;

    @OriginalMember(owner = "client!wn", name = "d", descriptor = "I")
    public static int field2242;

    @OriginalMember(owner = "client!wn", name = "e", descriptor = "I")
    public int field2243;

    @OriginalMember(owner = "client!wn", name = "c", descriptor = "Ljava/lang/String;")
    public String field2241;

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "[Lwn;")
    public static class174[] field2239;

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(Z)V", line = 7)
    public static final void method1135(boolean arg0) {
        class529.method3140(2, 22050, (byte) -66, class421.field5647.field7723);
        field2242++;
        class508.field7461 = new class382();
        if (!arg0) {
            return;
        }
        class508.field7461.method2235((byte) 86, 128, 9);
        class254.field3207 = class203.method1335(22050, 0, class272.field3454, class172.field2221, 179);
        class254.field3207.method2951(class508.field7461, 0);
        class478.method2868(class351.field4485, class235.field3059, class508.field7461, class135.field1829, 21909);
        class531.field7820 = class203.method1335(2048, 1, class272.field3454, class172.field2221, 179);
        class18.field313 = new class317();
        class531.field7820.method2951(class18.field313, 0);
        class439.field6117 = new class83(22050, class426.field5847);
        class18.field317 = class288.field3685.method1297("scape main", -5105);
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(IIIII[BI)V", line = 30)
    public static final void method1136(int arg0, int arg1, int arg2, int arg3, int arg4, byte[] arg5, int arg6) {
        field2240++;
        if (arg1 > 0 && !class158.method1064(arg1, (byte) -27)) {
            throw new IllegalArgumentException("");
        } else if (arg3 <= 0 || class158.method1064(arg3, (byte) -34)) {
            int var7 = class163.method1083(arg0, (byte) -47);
            int var8 = 0;
            int var9 = arg1 < arg3 ? arg1 : arg3;
            int var10 = arg1 >> 1;
            int var11 = arg3 >> 1;
            byte[] var12 = arg5;
            byte[] var13 = new byte[var10 * var11 * var7];
            if (arg4 >= 70) {
                while (true) {
                    OpenGL.glTexImage2Dub(arg6, var8, arg2, arg1, arg3, 0, arg0, 5121, var12, 0);
                    if (var9 <= 1) {
                        return;
                    }
                    int var14 = arg1 * var7;
                    byte[] var15 = var13;
                    for (int var16 = 0; var16 < var7; var16++) {
                        int var17 = var16;
                        int var18 = var16;
                        int var19 = var14 + var16;
                        for (int var20 = 0; var20 < var11; var20++) {
                            for (int var21 = 0; var21 < var10; var21++) {
                                byte var22 = var12[var18];
                                int var23 = var7 + var18;
                                int var24 = var12[var23] + var22;
                                int var25 = var12[var19] + var24;
                                var18 = var7 + var23;
                                int var26 = var7 + var19;
                                int var27 = var12[var26] + var25;
                                var13[var17] = (byte) (var27 >> 2);
                                var19 = var7 + var26;
                                var17 += var7;
                            }
                            var19 += var14;
                            var18 += var14;
                        }
                    }
                    var13 = var12;
                    var12 = var15;
                    arg3 = var11;
                    arg1 = var10;
                    var8++;
                    var11 >>= 0x1;
                    var9 >>= 0x1;
                    var10 >>= 0x1;
                }
            }
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(I)V", line = 137)
    public static void method1137(int arg0) {
        field2244 = null;
        if (arg0 == 2) {
            field2239 = null;
        }
    }
}
