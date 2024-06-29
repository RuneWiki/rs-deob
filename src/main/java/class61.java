import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qc")
public class class61 extends class166 {

    @OriginalMember(owner = "client!qc", name = "R", descriptor = "Lhj;")
    private static class69 field1114 = class181.method1318("You can(Wt add yourself to your own friend list)3", (byte) -118);

    @OriginalMember(owner = "client!qc", name = "T", descriptor = "Lhj;")
    public static class69 field1116 = field1114;

    @OriginalMember(owner = "client!qc", name = "V", descriptor = "Ltk;")
    public static class50 field1118 = null;

    @OriginalMember(owner = "client!qc", name = "O", descriptor = "I")
    public static int field1111;

    @OriginalMember(owner = "client!qc", name = "P", descriptor = "I")
    public static int field1112;

    @OriginalMember(owner = "client!qc", name = "Q", descriptor = "I")
    public static int field1113;

    @OriginalMember(owner = "client!qc", name = "S", descriptor = "I")
    public static int field1115;

    @OriginalMember(owner = "client!qc", name = "W", descriptor = "I")
    public static int field1119;

    @OriginalMember(owner = "client!qc", name = "U", descriptor = "Lcf;")
    public static class91 field1117;

    @OriginalMember(owner = "client!qc", name = "e", descriptor = "(II)V")
    public static final void method367(int arg0, int arg1) {
        if (arg0 == 255) {
            class193.field3519.method1708(-1009973721, arg1);
            field1113++;
        }
    }

    @OriginalMember(owner = "client!qc", name = "<init>", descriptor = "()V")
    public class61() {
        super(0, true);
    }

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "(II)[I")
    public final int[] method20(int arg0, int arg1) {
        field1119++;
        return arg1 == 8388607 ? class24.field347 : null;
    }

    @OriginalMember(owner = "client!qc", name = "f", descriptor = "(II)V")
    public static final void method368(int arg0, int arg1) {
        field1111++;
        class175.field3208 += arg0 * 128;
        if (class179.field3249.length < class175.field3208) {
            int var2 = (int) (Math.random() * 12.0D);
            class175.field3208 -= class179.field3249.length;
            class157.method1185(109, class133.field2478[var2]);
        }
        short var3 = 256;
        int var4 = 0;
        int var5 = arg0 * 128;
        int var6 = (var3 - arg0) * 128;
        int var7 = 0;
        if (arg1 != 292) {
            return;
        }
        while (var7 < var6) {
            int var26 = class13.field186[var4 + var5] - (class179.field3249[class175.field3208 + var4 & class179.field3249.length + -1] * arg0 / 6);
            if (var26 < 0) {
                var26 = 0;
            }
            class13.field186[var4++] = var26;
            var7++;
        }
        for (int var8 = var3 - arg0; var8 < var3; var8++) {
            int var23 = var8 * 128;
            for (int var24 = 0; var24 < 128; var24++) {
                int var25 = (int) (Math.random() * 100.0D);
                if (var25 < 50 && var24 > 10 && var24 < 118) {
                    class13.field186[var23 + var24] = 255;
                } else {
                    class13.field186[var23 + var24] = 0;
                }
            }
        }
        for (int var9 = 0; var9 < (var3 - arg0); var9++) {
            class69.field1308[var9] = class69.field1308[arg0 + var9];
        }
        for (int var10 = var3 - arg0; var10 < var3; var10++) {
            class69.field1308[var10] = (int) (Math.sin((double) class241.field4431 / 14.0D) * 16.0D + Math.sin((double) class241.field4431 / 15.0D) * 14.0D + Math.sin((double) class241.field4431 / 16.0D) * 12.0D);
            class241.field4431++;
        }
        int var11 = ((class180.field3272 & 0x1) + arg0) / 2;
        class129.field2411 += arg0;
        if (var11 <= 0) {
            return;
        }
        for (int var12 = 0; var12 < class129.field2411; var12++) {
            int var21 = (int) (Math.random() * 124.0D) + 2;
            int var22 = (int) (Math.random() * 128.0D) + 128;
            class13.field186[(var22 << 7) + var21] = 192;
        }
        class129.field2411 = 0;
        for (int var13 = 0; var13 < var3; var13++) {
            int var18 = var13 * 128;
            int var19 = 0;
            for (int var20 = -var11; var20 < 128; var20++) {
                if ((var20 + var11) < 128) {
                    var19 += class13.field186[var18 + var20 + var11];
                }
                if ((var20 - var11 - 1) >= 0) {
                    var19 -= class13.field186[var20 + var18 - (var11 + 1)];
                }
                if (var20 >= 0) {
                    class36.field497[var18 + var20] = var19 / (var11 * 2 + 1);
                }
            }
        }
        for (int var14 = 0; var14 < 128; var14++) {
            int var15 = 0;
            for (int var16 = -var11; var16 < var3; var16++) {
                int var17 = var16 * 128;
                if (var11 + var16 < var3) {
                    var15 += class36.field497[var11 * 128 + var14 + var17];
                }
                if ((-(var11 - var16) - 1) >= 0) {
                    var15 -= class36.field497[var14 + var17 - (var11 * 128) - 128];
                }
                if (var16 >= 0) {
                    class13.field186[var14 + var17] = var15 / (var11 * 2 + 1);
                }
            }
        }
    }

    @OriginalMember(owner = "client!qc", name = "d", descriptor = "(B)V")
    public static void method369(byte arg0) {
        field1114 = null;
        field1118 = null;
        if (arg0 > -28) {
            method368(65, -96);
        }
        field1117 = null;
        field1116 = null;
    }

    @OriginalMember(owner = "client!qc", name = "g", descriptor = "(II)V")
    public static final void method370(int arg0, int arg1) {
        if (arg0 <= 77) {
            method369((byte) -100);
        }
        field1112++;
        class5.field42.method1708(-1009973721, arg1);
    }
}
