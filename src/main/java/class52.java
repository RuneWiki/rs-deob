import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fl")
public abstract class class52 {

    @OriginalMember(owner = "client!fl", name = "b", descriptor = "Ljava/lang/String;")
    public static String field777 = "glow2:";

    @OriginalMember(owner = "client!fl", name = "e", descriptor = "Ljava/lang/String;")
    public static String field780 = "Started 3d Library";

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "I")
    public static int field776;

    @OriginalMember(owner = "client!fl", name = "c", descriptor = "I")
    public static int field778;

    @OriginalMember(owner = "client!fl", name = "d", descriptor = "I")
    public static int field779;

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(IIIILh;Lh;IIIIJ)V", line = 11)
    public static final void method435(int arg0, int arg1, int arg2, int arg3, class111 arg4, class111 arg5, int arg6, int arg7, int arg8, int arg9, long arg10) {
        if (arg4 == null) {
            return;
        }
        class94 var12 = new class94();
        var12.field1311 = arg10;
        var12.field1316 = arg1 * 128 + 64;
        var12.field1322 = arg2 * 128 + 64;
        var12.field1307 = arg3;
        var12.field1313 = arg4;
        var12.field1317 = arg5;
        var12.field1314 = arg6;
        var12.field1318 = arg7;
        var12.field1309 = arg8;
        var12.field1319 = arg9;
        for (int var13 = arg0; var13 >= 0; var13--) {
            if (class302.field4502[var13][arg1][arg2] == null) {
                class302.field4502[var13][arg1][arg2] = new class167(var13, arg1, arg2);
            }
        }
        class302.field4502[arg0][arg1][arg2].field2412 = var12;
    }

    @OriginalMember(owner = "client!fl", name = "b", descriptor = "(I)V", line = 39)
    public static final void method436(int arg0) {
        field779++;
        class200.field2941.method462(24);
        if (arg0 != 64) {
            method438((byte) -26);
        }
    }

    @OriginalMember(owner = "client!fl", name = "b", descriptor = "(II)V", line = 53)
    public static final void method437(int arg0, int arg1) {
        field778++;
        short var2 = 256;
        if (var2 < arg1) {
            arg1 = var2;
        }
        if (arg1 > 10) {
            arg1 = 10;
        }
        class51.field774 += arg1 * 128;
        if (class51.field774 > class111.field1618.length) {
            class51.field774 -= class111.field1618.length;
            int var3 = (int) (Math.random() * 12.0D);
            class59.method470(18, class173.field2506[var3]);
        }
        int var4 = 0;
        int var5 = arg1 * 128;
        int var6 = (var2 - arg1) * 128;
        for (int var7 = 0; var7 < var6; var7++) {
            int var8 = class267.field4071[var4 + var5] - (class111.field1618[class51.field774 + var4 & class111.field1618.length + -1] * arg1 / 6);
            if (var8 < 0) {
                var8 = 0;
            }
            class267.field4071[var4++] = var8;
        }
        int var9 = var2 - arg1;
        if (arg0 > -22) {
            method437(-2, 17);
        }
        while (var9 < var2) {
            int var10 = var9 * 128;
            for (int var11 = 0; var11 < 128; var11++) {
                int var12 = (int) (Math.random() * 100.0D);
                if (var12 < 50 && var11 > 10 && var11 < 118) {
                    class267.field4071[var11 + var10] = 255;
                } else {
                    class267.field4071[var10 + var11] = 0;
                }
            }
            var9++;
        }
        for (int var13 = 0; var13 < (var2 - arg1); var13++) {
            client.field636[var13] = client.field636[arg1 + var13];
        }
        for (int var14 = var2 - arg1; var14 < var2; var14++) {
            client.field636[var14] = (int) (Math.sin((double) class145.field2090 / 14.0D) * 16.0D + Math.sin((double) class145.field2090 / 15.0D) * 14.0D + Math.sin((double) class145.field2090 / 16.0D) * 12.0D);
            class145.field2090++;
        }
        class302.field4507 += arg1;
        int var15 = ((class304.field4560 & 0x1) + arg1) / 2;
        if (var15 <= 0) {
            return;
        }
        for (int var16 = 0; var16 < class302.field4507; var16++) {
            int var17 = (int) (Math.random() * 124.0D) + 2;
            int var18 = (int) (Math.random() * 128.0D) + 128;
            class267.field4071[var17 + (var18 << 7)] = 192;
        }
        class302.field4507 = 0;
        for (int var19 = 0; var19 < var2; var19++) {
            int var20 = var19 * 128;
            int var21 = 0;
            for (int var22 = -var15; var22 < 128; var22++) {
                if (var22 + var15 < 128) {
                    var21 += class267.field4071[var15 + var20 + var22];
                }
                if (var22 - var15 - 1 >= 0) {
                    var21 -= class267.field4071[var22 + var20 - var15 - 1];
                }
                if (var22 >= 0) {
                    class194.field2822[var20 + var22] = var21 / (var15 * 2 + 1);
                }
            }
        }
        for (int var23 = 0; var23 < 128; var23++) {
            int var24 = 0;
            for (int var25 = -var15; var25 < var2; var25++) {
                int var26 = var25 * 128;
                if (var2 > (var25 + var15)) {
                    var24 += class194.field2822[var15 * 128 + var23 + var26];
                }
                if ((var25 - var15 - 1) >= 0) {
                    var24 -= class194.field2822[var23 + var26 - (var15 * 128) - 128];
                }
                if (var25 >= 0) {
                    class267.field4071[var23 + var26] = var24 / (var15 * 2 + 1);
                }
            }
        }
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(B)V", line = 232)
    public static void method438(byte arg0) {
        field780 = null;
        int var1 = -78 / ((arg0 - 12) / 62);
        field777 = null;
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(I)Lgk;")
    public abstract class273 method432(int arg0);

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(BI)V")
    public abstract void method433(byte arg0, int arg1);

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(II)[B")
    public abstract byte[] method434(int arg0, int arg1);

    @OriginalMember(owner = "client!fl", name = "c", descriptor = "(II)I")
    public abstract int method439(int arg0, int arg1);
}
