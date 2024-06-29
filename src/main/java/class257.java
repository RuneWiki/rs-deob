import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!f")
public class class257 extends class59 {

    @OriginalMember(owner = "client!f", name = "J", descriptor = "Z")
    public static boolean field4296 = false;

    @OriginalMember(owner = "client!f", name = "M", descriptor = "I")
    public static int field4299 = -1;

    @OriginalMember(owner = "client!f", name = "I", descriptor = "I")
    public static int field4295;

    @OriginalMember(owner = "client!f", name = "K", descriptor = "I")
    public static int field4297;

    @OriginalMember(owner = "client!f", name = "O", descriptor = "I")
    public static int field4301;

    @OriginalMember(owner = "client!f", name = "P", descriptor = "I")
    public static int field4302;

    @OriginalMember(owner = "client!f", name = "Q", descriptor = "I")
    public static int field4303;

    @OriginalMember(owner = "client!f", name = "R", descriptor = "I")
    public static int field4304;

    @OriginalMember(owner = "client!f", name = "L", descriptor = "[Lda;")
    private class223[] field4298;

    @OriginalMember(owner = "client!f", name = "N", descriptor = "[Lph;")
    public static class229[] field4300;

    @OriginalMember(owner = "client!f", name = "b", descriptor = "(B)V", line = 4)
    public static void method1788(byte arg0) {
        if (arg0 != 94) {
            method1789(-123, 12, -113, 17);
        }
        field4300 = null;
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(II)[[I", line = 16)
    public final int[][] method116(int arg0, int arg1) {
        field4303++;
        if (arg1 != 4588) {
            method1789(-37, 114, -86, -81);
        }
        int[][] var3 = this.field838.method1796(true, arg0);
        if (this.field838.field4334) {
            int var4 = class241.field3993;
            int var5 = class293.field4789;
            int[][][] var6 = this.field838.method1797(125);
            int[][] var7 = new int[var4][var5];
            this.method1790(125, var7);
            for (int var8 = 0; var8 < class241.field3993; var8++) {
                int[] var9 = var7[var8];
                int[][] var10 = var6[var8];
                int[] var11 = var10[0];
                int[] var12 = var10[1];
                int[] var13 = var10[2];
                for (int var14 = 0; var14 < class293.field4789; var14++) {
                    int var15 = var9[var14];
                    var13[var14] = class243.method1696(var15 << 4, 4080);
                    var12[var14] = class243.method1696(65280, var15) >> 4;
                    var11[var14] = class243.method1696(var15 >> 12, 4080);
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(IIII)V", line = 76)
    public static final void method1789(int arg0, int arg1, int arg2, int arg3) {
        field4302++;
        class229 var4 = class248.method1746(8528, new class229[] { class8.field102, class50.method354(0, arg1), client.field5428, class50.method354(arg0 ^ 0x0, arg3 >> 6), client.field5428, class50.method354(0, arg2 >> 6), client.field5428, class50.method354(0, arg3 & 0x3F), client.field5428, class50.method354(arg0, arg2 & 0x3F) });
        var4.method1624(true);
        class193.method1353(var4, arg0 ^ 0x2E69);
    }

    @OriginalMember(owner = "client!f", name = "<init>", descriptor = "()V", line = 101)
    public class257() {
        super(0, true);
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(I[[I)V", line = 110)
    private final void method1790(int arg0, int[][] arg1) {
        int var3 = class293.field4789;
        if (arg0 < 45) {
            return;
        }
        field4295++;
        int var4 = class241.field3993;
        class249.method1750(true, arg1);
        class282.method1938(class33.field544, 0, (byte) -112, 0, class4.field51);
        if (this.field4298 == null) {
            return;
        }
        for (int var5 = 0; var5 < this.field4298.length; var5++) {
            class223 var6 = this.field4298[var5];
            int var7 = var6.field3665;
            int var8 = var6.field3669;
            if (var8 >= 0) {
                if (var7 >= 0) {
                    var6.method1391(112, var4, var3);
                } else {
                    var6.method1392(true, var4, var3);
                }
            } else if (var7 >= 0) {
                var6.method1396(var4, -110, var3);
            }
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(BILhb;)V", line = 157)
    public final void method67(byte arg0, int arg1, class164 arg2) {
        if (arg1 == 0) {
            this.field4298 = new class223[arg2.method1178(8)];
            for (int var4 = 0; var4 < this.field4298.length; var4++) {
                int var5 = arg2.method1178(arg0 ^ 0x7B);
                if (var5 == 0) {
                    this.field4298[var4] = class58.method387(arg2, 3650);
                } else if (var5 == 1) {
                    this.field4298[var4] = class190.method1330(arg0 - 113, arg2);
                } else if (var5 == 2) {
                    this.field4298[var4] = class4.method23((byte) -99, arg2);
                } else if (var5 == 3) {
                    this.field4298[var4] = class181.method1286(arg2, (byte) 99);
                }
            }
        } else if (arg1 == 1) {
            this.field841 = arg2.method1178(arg0 ^ 0x7B) == 1;
        }
        field4304++;
        if (arg0 != 115) {
            this.method116(79, 75);
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(ZI)[I", line = 235)
    public final int[] method63(boolean arg0, int arg1) {
        int[] var3 = this.field846.method383(3583, arg1);
        if (this.field846.field811) {
            this.method1790(51, this.field846.method386((byte) -28));
        }
        if (!arg0) {
            field4300 = (class229[]) null;
        }
        field4297++;
        return var3;
    }
}
