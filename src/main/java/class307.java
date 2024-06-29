import jaggl.memory.NativeHeap;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nu")
public class class307 extends class195 {

    @OriginalMember(owner = "client!nu", name = "v", descriptor = "Ljaggl/memory/NativeHeap;")
    public NativeHeap field4508;

    @OriginalMember(owner = "client!nu", name = "s", descriptor = "I")
    public static int field4505;

    @OriginalMember(owner = "client!nu", name = "t", descriptor = "I")
    public static int field4506;

    @OriginalMember(owner = "client!nu", name = "u", descriptor = "I")
    public static int field4507;

    @OriginalMember(owner = "client!nu", name = "w", descriptor = "I")
    public static int field4509;

    @OriginalMember(owner = "client!nu", name = "q", descriptor = "Ljf;")
    public static class522 field4503;

    @OriginalMember(owner = "client!nu", name = "r", descriptor = "[[[B")
    public static byte[][][] field4504;

    @OriginalMember(owner = "client!nu", name = "a", descriptor = "(III)I")
    public static final int method1972(int arg0, int arg1, int arg2) {
        if (arg1 != 3) {
            field4503 = null;
        }
        field4509++;
        return arg2 == 1 || arg2 == 3 ? class113.field1580[arg0 & 0x3] : class271.field3768[arg0 & 0x3];
    }

    @OriginalMember(owner = "client!nu", name = "c", descriptor = "(I)V")
    public final void method1973(int arg0) {
        this.field4508.method160();
        field4506++;
        if (arg0 != -32251) {
            method1976(9);
        }
    }

    @OriginalMember(owner = "client!nu", name = "b", descriptor = "(B)V")
    public static void method1974(byte arg0) {
        if (arg0 > 8) {
            field4504 = null;
            field4503 = null;
        }
    }

    @OriginalMember(owner = "client!nu", name = "a", descriptor = "(Ljava/lang/String;I)V")
    public static final void method1975(String arg0, int arg1) {
        field4507++;
        if (arg0 == null) {
            return;
        }
        if (arg0.startsWith("*")) {
            arg0 = arg0.substring(1);
        }
        String var2 = class414.method2512(arg0, (byte) -76);
        if (var2 == null) {
            return;
        }
        if (arg1 != 1) {
            method1972(13, 11, -120);
        }
        for (int var3 = 0; var3 < class204.field2873; var3++) {
            String var4 = class279.field3853[var3];
            if (var4.startsWith("*")) {
                var4 = var4.substring(1);
            }
            String var5 = class414.method2512(var4, (byte) 118);
            if (var5 != null && var5.equals(var2)) {
                class204.field2873--;
                for (int var6 = var3; var6 < class204.field2873; var6++) {
                    class279.field3853[var6] = class279.field3853[var6 + 1];
                    class42.field640[var6] = class42.field640[var6 + 1];
                    class296.field4382[var6] = class296.field4382[var6 + 1];
                    class381.field5815[var6] = class381.field5815[var6 + 1];
                    class152.field2204[var6] = class152.field2204[var6 + 1];
                }
                class87.field1183++;
                class475.field6921 = class485.field7086;
                class179.method1287(false, class15.field247);
                class75.field1006.method625(class142.method951(-99, arg0), false);
                class75.field1006.method603(54, arg0);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!nu", name = "<init>", descriptor = "(I)V")
    public class307(int arg0) {
        this.field4508 = new NativeHeap(arg0);
    }

    @OriginalMember(owner = "client!nu", name = "d", descriptor = "(I)V")
    public static final void method1976(int arg0) {
        field4505++;
        if (class249.field3466 != null) {
            return;
        }
        class249.field3466 = new int[65536];
        double var1 = (Math.random() * 0.03D - 0.015D) + 0.7D;
        for (int var3 = 0; var3 < 65536; var3++) {
            double var4 = (double) (var3 >> 10 & 0x3F) / 64.0D + 0.0078125D;
            double var6 = (double) (var3 >> 7 & 0x7) / 8.0D + 0.0625D;
            double var8 = (double) (var3 & 0x7F) / 128.0D;
            double var10 = var8;
            double var12 = var8;
            double var14 = var8;
            if (var6 != 0.0D) {
                double var16;
                if ((var8 < 0.5D)) {
                    var16 = (var6 + 1.0D) * var8;
                } else {
                    var16 = var6 + var8 - var6 * var8;
                }
                double var18 = var8 * 2.0D - var16;
                double var20 = var4 + 0.3333333333333333D;
                if (var20 > 1.0D) {
                    var20--;
                }
                double var24 = var4 - 0.3333333333333333D;
                if (var4 * 6.0D < 1.0D) {
                    var12 = (var16 - var18) * 6.0D * var4 + var18;
                } else if ((var4 * 2.0D < 1.0D)) {
                    var12 = var16;
                } else if ((var4 * 3.0D < 2.0D)) {
                    var12 = (var16 - var18) * (0.6666666666666666D - var4) * 6.0D + var18;
                } else {
                    var12 = var18;
                }
                if ((var20 * 6.0D < 1.0D)) {
                    var10 = (var16 - var18) * 6.0D * var20 + var18;
                } else if (var20 * 2.0D < 1.0D) {
                    var10 = var16;
                } else if ((var20 * 3.0D < 2.0D)) {
                    var10 = (var16 - var18) * (0.6666666666666666D - var20) * 6.0D + var18;
                } else {
                    var10 = var18;
                }
                if (var24 < 0.0D) {
                    var24++;
                }
                if (var24 * 6.0D < 1.0D) {
                    var14 = (var16 - var18) * 6.0D * var24 + var18;
                } else if (var24 * 2.0D < 1.0D) {
                    var14 = var16;
                } else if ((var24 * 3.0D < 2.0D)) {
                    var14 = (var16 - var18) * (0.6666666666666666D - var24) * 6.0D + var18;
                } else {
                    var14 = var18;
                }
            }
            double var26 = Math.pow(var10, var1);
            double var28 = Math.pow(var12, var1);
            double var30 = Math.pow(var14, var1);
            int var32 = (int) (var26 * 256.0D);
            int var33 = (int) (var28 * 256.0D);
            int var34 = (int) (var30 * 256.0D);
            int var35 = (var32 << 16) + (var33 << 8) + var34;
            class249.field3466[var3] = var35;
        }
        if (arg0 != 1) {
            field4503 = null;
        }
    }
}
