import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gk")
public class class159 extends class84 {

    @OriginalMember(owner = "client!gk", name = "G", descriptor = "[Lih;")
    public class209[] field2217;

    @OriginalMember(owner = "client!gk", name = "L", descriptor = "I")
    public static int field2222 = 0;

    @OriginalMember(owner = "client!gk", name = "O", descriptor = "Ljava/lang/String;")
    public static String field2224 = "M";

    @OriginalMember(owner = "client!gk", name = "K", descriptor = "[I")
    public static int[] field2221 = new int[1000];

    @OriginalMember(owner = "client!gk", name = "B", descriptor = "I")
    public static int field2212;

    @OriginalMember(owner = "client!gk", name = "C", descriptor = "I")
    public static int field2213;

    @OriginalMember(owner = "client!gk", name = "E", descriptor = "I")
    public static int field2215;

    @OriginalMember(owner = "client!gk", name = "F", descriptor = "I")
    public static int field2216;

    @OriginalMember(owner = "client!gk", name = "J", descriptor = "I")
    public static int field2220;

    @OriginalMember(owner = "client!gk", name = "P", descriptor = "I")
    public static int field2225;

    @OriginalMember(owner = "client!gk", name = "H", descriptor = "Lvj;")
    public static class117 field2218;

    @OriginalMember(owner = "client!gk", name = "I", descriptor = "Lhc;")
    public static class235 field2219;

    @OriginalMember(owner = "client!gk", name = "M", descriptor = "Lhc;")
    public static class235 field2223;

    @OriginalMember(owner = "client!gk", name = "D", descriptor = "[S")
    public static short[] field2214;

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(III)V")
    public static final void method1055(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < class269.field4120; var3++) {
            class188 var4 = class77.method492(-27088, var3);
            if (var4 != null) {
                int var5 = var4.field2588;
                if (var5 >= 0 && !class90.field1260.method912(var5, (byte) -33)) {
                    var5 = -1;
                }
                int var9;
                if (var4.field2601 >= 0) {
                    int var6 = var4.field2601;
                    int var7 = (var6 & 0x7F) + arg2;
                    if (var7 < 0) {
                        var7 = 0;
                    } else if (var7 > 127) {
                        var7 = 127;
                    }
                    int var8 = (var6 + arg1 & 0xFC00) + var7 + (var6 & 0x380);
                    var9 = class90.field1264[class213.method1391(96, var8, 116)];
                } else if (var5 >= 0) {
                    var9 = class90.field1264[class213.method1391(96, class90.field1260.method911(108, var5), 119)];
                } else if (var4.field2603 == -1) {
                    var9 = -1;
                } else {
                    int var10 = var4.field2603;
                    int var11 = (var10 & 0x7F) + arg2;
                    if (var11 < 0) {
                        var11 = 0;
                    } else if (var11 > 127) {
                        var11 = 127;
                    }
                    int var12 = (var10 + arg1 & 0xFC00) - (-(var10 & 0x380) - var11);
                    var9 = class90.field1264[class213.method1391(96, var12, 106)];
                }
                class73.field1000[var3 + 1] = var9;
            }
        }
        field2216++;
        if (arg0 >= -9) {
            method1059(108);
        }
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(IZILse;)V")
    public static final void method1056(int arg0, boolean arg1, int arg2, class211 arg3) {
        field2212++;
        if (class208.field2967 != null || class15.field146 || arg3 == null || class108.method696(0, arg3) == null) {
            return;
        }
        class208.field2967 = arg3;
        class225.field3414 = class108.method696(0, arg3);
        class265.field3975 = arg1;
        class294.field4625 = arg0;
        class42.field642 = arg2;
        class241.field3702 = 0;
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(IIIII)I")
    public static final int method1057(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2215++;
        int var5 = 65536 - class90.field1255[arg4 * 1024 / arg2] >> 1;
        return arg1 == 31363 ? ((65536 - var5) * arg0 >> 16) + (arg3 * var5 >> 16) : 73;
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(II)Z")
    public final boolean method1058(int arg0, int arg1) {
        if (arg0 < 58) {
            return true;
        } else {
            field2213++;
            return this.field2217[arg1].field2980;
        }
    }

    @OriginalMember(owner = "client!gk", name = "h", descriptor = "(I)V")
    public static final void method1059(int arg0) {
        class181.field2541.method1324((byte) -57);
        field2225++;
        int var1 = 115 % ((26 - arg0) / 54);
        client.field2186 = null;
        class202.field2806 = 1;
    }

    @OriginalMember(owner = "client!gk", name = "b", descriptor = "(Z)V")
    public static void method1060(boolean arg0) {
        field2221 = null;
        field2223 = null;
        field2214 = null;
        if (arg0) {
            field2223 = null;
        }
        field2219 = null;
        field2218 = null;
        field2224 = null;
    }

    @OriginalMember(owner = "client!gk", name = "b", descriptor = "(II)Z")
    public final boolean method1061(int arg0, int arg1) {
        if (arg1 != -1) {
            method1055(82, -37, -44);
        }
        field2220++;
        return this.field2217[arg0].field2986;
    }

    @OriginalMember(owner = "client!gk", name = "<init>", descriptor = "(Lhc;Lhc;IZ)V")
    public class159(class235 arg0, class235 arg1, int arg2, boolean arg3) {
        class148 var5 = new class148();
        int var6 = arg0.method1577(arg2, -6339);
        this.field2217 = new class209[var6];
        int[] var7 = arg0.method1567((byte) 69, arg2);
        for (int var8 = 0; var8 < var7.length; var8++) {
            byte[] var9 = arg0.method1576(-105, arg2, var7[var8]);
            class142 var10 = null;
            int var11 = (var9[0] & 0xFF) << 8 | var9[1] & 0xFF;
            for (class142 var12 = (class142) var5.method990(-84); var12 != null; var12 = (class142) var5.method993(-93)) {
                if (var12.field1975 == var11) {
                    var10 = var12;
                    break;
                }
            }
            if (var10 == null) {
                byte[] var13;
                if (arg3) {
                    var13 = arg1.method1580(0, (byte) -112, var11);
                } else {
                    var13 = arg1.method1580(var11, (byte) -124, 0);
                }
                var10 = new class142(var11, var13);
                var5.method988(var10, (byte) -77);
            }
            this.field2217[var7[var8]] = new class209(var9, var10);
        }
    }
}
