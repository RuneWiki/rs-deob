import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fh")
public class class189 extends class240 {

    @OriginalMember(owner = "client!fh", name = "P", descriptor = "I")
    public static int field3251 = (int) (Math.random() * 33.0D) - 16;

    @OriginalMember(owner = "client!fh", name = "W", descriptor = "Lcd;")
    private static class64 field3258 = class44.method335((byte) 71, "white:");

    @OriginalMember(owner = "client!fh", name = "V", descriptor = "I")
    public static int field3257 = -1;

    @OriginalMember(owner = "client!fh", name = "R", descriptor = "Lcd;")
    public static class64 field3253 = field3258;

    @OriginalMember(owner = "client!fh", name = "T", descriptor = "Lcd;")
    public static class64 field3255 = field3258;

    @OriginalMember(owner = "client!fh", name = "Q", descriptor = "Z")
    public static volatile boolean field3252 = false;

    @OriginalMember(owner = "client!fh", name = "O", descriptor = "I")
    public static int field3250;

    @OriginalMember(owner = "client!fh", name = "X", descriptor = "I")
    public static int field3259;

    @OriginalMember(owner = "client!fh", name = "U", descriptor = "Lja;")
    public static class60 field3256;

    @OriginalMember(owner = "client!fh", name = "S", descriptor = "[Lnm;")
    public static class176[] field3254;

    @OriginalMember(owner = "client!fh", name = "<init>", descriptor = "()V", line = 5)
    public class189() {
        super(0, true);
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(II)[I", line = 11)
    public final int[] method12(int arg0, int arg1) {
        if (arg0 != 64) {
            return (int[]) null;
        }
        field3250++;
        int[] var3 = this.field4094.method179(arg1, true);
        if (this.field4094.field344) {
            class95.method718(var3, 0, class169.field2936, class268.field4615[arg1]);
        }
        return var3;
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "([BIZI[Lwf;IZI)V", line = 37)
    public static final void method1339(byte[] arg0, int arg1, boolean arg2, int arg3, class54[] arg4, int arg5, boolean arg6, int arg7) {
        byte var8;
        if (arg6) {
            var8 = 1;
        } else {
            var8 = 4;
        }
        field3259++;
        if (!arg6) {
            for (int var9 = 0; var9 < 4; var9++) {
                for (int var10 = 0; var10 < 64; var10++) {
                    for (int var11 = 0; var11 < 64; var11++) {
                        if (arg7 + var10 > 0 && arg7 + var10 < 103 && (arg1 + var11) > 0 && (arg1 + var11) < 103) {
                            arg4[var9].field905[arg7 + var10][arg1 + var11] = class224.method1614(arg4[var9].field905[arg7 + var10][arg1 + var11], -16777217);
                        }
                    }
                }
            }
        }
        class13 var12 = new class13(arg0);
        for (int var13 = 0; var13 < var8; var13++) {
            for (int var14 = 0; var14 < 64; var14++) {
                for (int var15 = 0; var15 < 64; var15++) {
                    class117.method831(var13, -19940, arg5, arg1 + var15, arg7 + var14, 0, var12, arg3, arg6);
                }
            }
        }
        if (!arg2 || !class123.field2216 || arg6) {
            return;
        }
        class313 var16 = null;
        label120: while (true) {
            int var18;
            label113: do {
                while (var12.field281 < var12.field254.length) {
                    int var17 = var12.method152((byte) -87);
                    if (var17 != 0) {
                        if (var17 != 1) {
                            throw new IllegalStateException();
                        }
                        var18 = var12.method152((byte) -73);
                        continue label113;
                    }
                    var16 = new class313(var12);
                }
                if (var16 == null) {
                    var16 = new class313();
                }
                for (int var23 = 0; var23 < 8; var23++) {
                    for (int var24 = 0; var24 < 8; var24++) {
                        int var25 = (arg1 >> 3) + var24;
                        int var26 = (arg7 >> 3) + var23;
                        if (var26 >= 0 && var26 < 13 && var25 >= 0 && var25 < 13) {
                            class157.field2770[var26][var25] = var16;
                        }
                    }
                }
                break label120;
            } while (var18 <= 0);
            for (int var19 = 0; var19 < var18; var19++) {
                class220 var20 = new class220(var12);
                var20.field3730 += arg7 << 7;
                var20.field3734 += arg1 << 7;
                int var21 = var20.field3734 >> 7;
                int var22 = var20.field3730 >> 7;
                if (var22 >= 0 && var21 >= 0 && var22 < 104 && var21 < 104) {
                    var20.field3744 = class96.field1764[var20.field3717][var22][var21] - var20.field3744;
                    class177.method1239(var20);
                }
            }
        }
    }

    @OriginalMember(owner = "client!fh", name = "f", descriptor = "(I)V", line = 205)
    public static void method1340(int arg0) {
        field3255 = null;
        if (arg0 < -36) {
            field3253 = null;
            field3258 = null;
            field3254 = null;
            field3256 = null;
        }
    }
}
