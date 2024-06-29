import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fl")
public class class191 {

    @OriginalMember(owner = "client!fl", name = "i", descriptor = "Lua;")
    public class73 field3536 = new class73();

    @OriginalMember(owner = "client!fl", name = "d", descriptor = "[Ldk;")
    public static class178[] field3531 = new class178[28];

    @OriginalMember(owner = "client!fl", name = "j", descriptor = "I")
    public static int field3537 = -1;

    @OriginalMember(owner = "client!fl", name = "f", descriptor = "I")
    public static int field3533 = -1;

    @OriginalMember(owner = "client!fl", name = "o", descriptor = "I")
    public static int field3542 = 0;

    @OriginalMember(owner = "client!fl", name = "p", descriptor = "I")
    public static int field3543 = 0;

    @OriginalMember(owner = "client!fl", name = "n", descriptor = "I")
    public static int field3541 = -2;

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "I")
    public static int field3528;

    @OriginalMember(owner = "client!fl", name = "b", descriptor = "I")
    public static int field3529;

    @OriginalMember(owner = "client!fl", name = "c", descriptor = "I")
    public static int field3530;

    @OriginalMember(owner = "client!fl", name = "e", descriptor = "I")
    public static int field3532;

    @OriginalMember(owner = "client!fl", name = "g", descriptor = "I")
    public static int field3534;

    @OriginalMember(owner = "client!fl", name = "h", descriptor = "I")
    public static int field3535;

    @OriginalMember(owner = "client!fl", name = "l", descriptor = "I")
    public static int field3539;

    @OriginalMember(owner = "client!fl", name = "m", descriptor = "I")
    public static int field3540;

    @OriginalMember(owner = "client!fl", name = "q", descriptor = "I")
    public static int field3544;

    @OriginalMember(owner = "client!fl", name = "r", descriptor = "I")
    public static int field3545;

    @OriginalMember(owner = "client!fl", name = "s", descriptor = "Lua;")
    private class73 field3546;

    @OriginalMember(owner = "client!fl", name = "k", descriptor = "[I")
    public static int[] field3538;

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(I)V")
    public static void method1373(int arg0) {
        field3538 = null;
        field3531 = null;
        if (arg0 < 84) {
            field3541 = -52;
        }
    }

    @OriginalMember(owner = "client!fl", name = "b", descriptor = "(I)Lua;")
    public final class73 method1374(int arg0) {
        field3529++;
        class73 var2 = this.field3536.field1273;
        if (arg0 != 256) {
            field3537 = -83;
        }
        if (this.field3536 == var2) {
            this.field3546 = null;
            return null;
        } else {
            this.field3546 = var2.field1273;
            return var2;
        }
    }

    @OriginalMember(owner = "client!fl", name = "c", descriptor = "(I)Lua;")
    public final class73 method1375(int arg0) {
        class73 var2 = this.field3536.field1269;
        if (arg0 != 16259) {
            field3542 = 36;
        }
        field3545++;
        if (this.field3536 == var2) {
            this.field3546 = null;
            return null;
        } else {
            this.field3546 = var2.field1269;
            return var2;
        }
    }

    @OriginalMember(owner = "client!fl", name = "d", descriptor = "(I)Lua;")
    public final class73 method1376(int arg0) {
        class73 var2 = this.field3536.field1269;
        field3539++;
        if (this.field3536 == var2) {
            return null;
        } else if (arg0 >= -115) {
            return null;
        } else {
            var2.method476(-110);
            return var2;
        }
    }

    @OriginalMember(owner = "client!fl", name = "e", descriptor = "(I)Lua;")
    public final class73 method1377(int arg0) {
        field3530++;
        if (arg0 != -19546) {
            this.field3536 = null;
        }
        class73 var2 = this.field3546;
        if (this.field3536 == var2) {
            this.field3546 = null;
            return null;
        } else {
            this.field3546 = var2.field1269;
            return var2;
        }
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(Lua;Z)V")
    public final void method1378(class73 arg0, boolean arg1) {
        if (arg0.field1273 != null) {
            arg0.method476(-58);
        }
        field3528++;
        arg0.field1269 = this.field3536.field1269;
        arg0.field1273 = this.field3536;
        arg0.field1273.field1269 = arg0;
        if (!arg1) {
            arg0.field1269.field1273 = arg0;
        }
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(Lp;II)Lli;")
    public static final class185 method1379(class82 arg0, int arg1, int arg2) {
        field3544++;
        if (!class145.method1038(arg2, client.method1502(arg0), 15975) && arg0.field1496 == null) {
            return null;
        } else if (arg0.field1604 == null || arg2 >= arg0.field1604.length || arg0.field1604[arg2] == null || arg0.field1604[arg2].method1309(-1).method1311((byte) 49) == 0) {
            return class185.field3456 ? class87.method567(-11039, new class185[] { class254.field4507, class90.method591(arg2, 0) }) : null;
        } else {
            int var3 = -65 % ((55 - arg1) / 43);
            return arg0.field1604[arg2];
        }
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(II)I")
    public static final int method1380(int arg0, int arg1) {
        field3535++;
        double var2 = (double) ((arg1 & 0xFFED15) >> 16) / 256.0D;
        double var4 = (double) (arg1 & 0xFF) / 256.0D;
        double var6 = (double) (arg1 >> 8 & 0xFF) / 256.0D;
        double var8 = var2;
        double var10 = var2;
        if (var6 > var2) {
            var10 = var6;
        }
        if (var2 > var6) {
            var8 = var6;
        }
        if (var8 > var4) {
            var8 = var4;
        }
        if (var10 < var4) {
            var10 = var4;
        }
        double var12 = 0.0D;
        double var14 = 0.0D;
        double var16 = (var8 + var10) / 2.0D;
        int var18 = 31 / ((arg0 - 19) / 40);
        if (var8 != var10) {
            if (var16 < 0.5D) {
                var14 = (var10 - var8) / (var8 + var10);
            }
            if (var16 >= 0.5D) {
                var14 = (var10 - var8) / (2.0D - var10 - var8);
            }
            if (var2 == var10) {
                var12 = (var6 - var4) / (var10 - var8);
            } else if (var6 == var10) {
                var12 = (var4 - var2) / (var10 - var8) + 2.0D;
            } else if (var4 == var10) {
                var12 = (var2 - var6) / (var10 - var8) + 4.0D;
            }
        }
        double var19 = var12 / 6.0D;
        int var21 = (int) (var14 * 256.0D);
        int var22 = (int) (var16 * 256.0D);
        if (var21 < 0) {
            var21 = 0;
        } else if (var21 > 255) {
            var21 = 255;
        }
        if (var22 < 0) {
            var22 = 0;
        } else if (var22 > 255) {
            var22 = 255;
        }
        if (var22 > 243) {
            var21 >>= 0x4;
        } else if (var22 > 217) {
            var21 >>= 0x3;
        } else if (var22 > 192) {
            var21 >>= 0x2;
        } else if (var22 > 179) {
            var21 >>= 0x1;
        }
        int var23 = (int) (var19 * 256.0D);
        return (var21 >> 5 << 7) + (var23 >> 2 << 10) + (var22 >> 1);
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(B)Lua;")
    public final class73 method1381(byte arg0) {
        field3540++;
        class73 var2 = this.field3546;
        if (this.field3536 == var2) {
            this.field3546 = null;
            return null;
        } else {
            this.field3546 = var2.field1273;
            int var3 = -109 / ((54 - arg0) / 52);
            return var2;
        }
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(Lua;B)V")
    public final void method1382(class73 arg0, byte arg1) {
        if (arg0.field1273 != null) {
            arg0.method476(-78);
        }
        if (arg1 > -19) {
            this.method1382((class73) null, (byte) 67);
        }
        arg0.field1269 = this.field3536;
        arg0.field1273 = this.field3536.field1273;
        arg0.field1273.field1269 = arg0;
        arg0.field1269.field1273 = arg0;
        field3532++;
    }

    @OriginalMember(owner = "client!fl", name = "<init>", descriptor = "()V")
    public class191() {
        this.field3536.field1273 = this.field3536;
        this.field3536.field1269 = this.field3536;
    }

    @OriginalMember(owner = "client!fl", name = "b", descriptor = "(B)V")
    public final void method1383(byte arg0) {
        if (arg0 < 11) {
            method1380(-46, 115);
        }
        while (true) {
            class73 var2 = this.field3536.field1269;
            if (this.field3536 == var2) {
                this.field3546 = null;
                field3534++;
                return;
            }
            var2.method476(120);
        }
    }
}
