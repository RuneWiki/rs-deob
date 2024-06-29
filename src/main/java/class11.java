import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!b")
public class class11 extends class106 {

    @OriginalMember(owner = "client!b", name = "K", descriptor = "I")
    public int field218 = -1;

    @OriginalMember(owner = "client!b", name = "I", descriptor = "I")
    public int field216 = -1;

    @OriginalMember(owner = "client!b", name = "O", descriptor = "I")
    public int field222 = 0;

    @OriginalMember(owner = "client!b", name = "V", descriptor = "Z")
    public boolean field229 = true;

    @OriginalMember(owner = "client!b", name = "F", descriptor = "[S")
    public static short[] field213 = new short[] { 3, 35, 23, 48, 40, 29, 28, 14 };

    @OriginalMember(owner = "client!b", name = "Q", descriptor = "Lrf;")
    public static class163 field224 = class53.method392(-122, "<col=ffb000>");

    @OriginalMember(owner = "client!b", name = "H", descriptor = "Lrf;")
    private static class163 field215 = class53.method392(101, "Please enter your username)3");

    @OriginalMember(owner = "client!b", name = "T", descriptor = "[I")
    public static int[] field227 = new int[25];

    @OriginalMember(owner = "client!b", name = "P", descriptor = "Lrf;")
    public static class163 field223 = field215;

    @OriginalMember(owner = "client!b", name = "G", descriptor = "I")
    public static int field214;

    @OriginalMember(owner = "client!b", name = "J", descriptor = "I")
    public static int field217;

    @OriginalMember(owner = "client!b", name = "L", descriptor = "I")
    public static int field219;

    @OriginalMember(owner = "client!b", name = "M", descriptor = "I")
    public static int field220;

    @OriginalMember(owner = "client!b", name = "N", descriptor = "I")
    public static int field221;

    @OriginalMember(owner = "client!b", name = "R", descriptor = "I")
    public static int field225;

    @OriginalMember(owner = "client!b", name = "S", descriptor = "I")
    public static int field226;

    @OriginalMember(owner = "client!b", name = "U", descriptor = "I")
    public static int field228;

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(Lde;II)V")
    public static final void method84(class36 arg0, int arg1, int arg2) {
        field225++;
        class106.method721(arg0.field679, arg2, arg0.field716, false);
        if (arg1 != -25270) {
            method88(-117);
        }
    }

    @OriginalMember(owner = "client!b", name = "b", descriptor = "(II)I")
    private final int method85(int arg0, int arg1) {
        field219++;
        if (arg1 == 16711935) {
            return -1;
        }
        double var3 = (double) (arg1 >> 8 & 0xFF) / 256.0D;
        double var5 = (double) (arg1 & 0xFF) / 256.0D;
        double var7 = 0.0D;
        double var9 = (double) (arg1 >> 16 & 0xFF) / 256.0D;
        double var11 = var9;
        if (var9 < var3) {
            var11 = var3;
        }
        double var13 = 0.0D;
        if (var11 < var5) {
            var11 = var5;
        }
        double var15 = var9;
        if (var9 > var3) {
            var15 = var3;
        }
        if (var5 < var15) {
            var15 = var5;
        }
        double var17 = (var11 + var15) / 2.0D;
        if (var11 != var15) {
            if (var17 < 0.5D) {
                var13 = (var11 - var15) / (var11 + var15);
            }
            if (var17 >= 0.5D) {
                var13 = (var11 - var15) / (2.0D - var11 + -var15);
            }
            if (var9 == var11) {
                var7 = (var3 - var5) / (-var15 + var11);
            } else if (var3 == var11) {
                var7 = (var5 - var9) / (-var15 + var11) + 2.0D;
            } else if (var5 == var11) {
                var7 = (var9 - var3) / (var11 - var15) + 4.0D;
            }
        }
        int var19 = (int) ((double) arg0 * var17);
        int var20 = (int) (var13 * 256.0D);
        double var21 = var7 / 6.0D;
        int var23 = (int) (var21 * 256.0D);
        if (var20 < 0) {
            var20 = 0;
        } else if (var20 > 255) {
            var20 = 255;
        }
        if (var19 < 0) {
            var19 = 0;
        } else if (var19 > 255) {
            var19 = 255;
        }
        if (var19 > 243) {
            var20 >>= 0x4;
        } else if (var19 > 217) {
            var20 >>= 0x3;
        } else if (var19 > 192) {
            var20 >>= 0x2;
        } else if (var19 > 179) {
            var20 >>= 0x1;
        }
        return (var19 >> 1) + (var20 >> 5 << 7) + (var23 >> 2 << 10);
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(ILfa;I)V")
    public final void method86(int arg0, class52 arg1, int arg2) {
        if (arg2 != -26591) {
            field224 = null;
        }
        while (true) {
            int var4 = arg1.method344(arg2 + 26846);
            if (var4 == 0) {
                field226++;
                return;
            }
            this.method89(var4, arg0, arg2 ^ 0x1092, arg1);
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(IZZ)Lrf;")
    public static final class163 method87(int arg0, boolean arg1, boolean arg2) {
        if (arg2) {
            method88(42);
        }
        field214++;
        return class103.method705((byte) -17, arg1, arg0, 10);
    }

    @OriginalMember(owner = "client!b", name = "f", descriptor = "(I)V")
    public static void method88(int arg0) {
        if (arg0 > -68) {
            return;
        }
        field215 = null;
        field224 = null;
        field213 = null;
        field223 = null;
        field227 = null;
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(IIILfa;)V")
    private final void method89(int arg0, int arg1, int arg2, class52 arg3) {
        if (arg0 == 1) {
            this.field222 = this.method85(256, arg3.method340(false));
        } else if (arg0 == 2) {
            this.field216 = arg3.method344(255);
        } else if (arg0 == 3) {
            this.field216 = arg3.method390((byte) 126);
            if (this.field216 == 65535) {
                this.field216 = -1;
            }
        } else if (arg0 == 5) {
            this.field229 = false;
        } else if (arg0 == 7) {
            this.field218 = this.method85(arg2 + 30797, arg3.method340(false));
        } else if (arg0 != 8 && arg0 == 9) {
            arg3.method390((byte) 108);
        }
        if (arg2 != -30541) {
            this.method89(-39, 42, 19, null);
        }
        field217++;
    }

    @OriginalMember(owner = "client!b", name = "c", descriptor = "(II)Lrf;")
    public static final class163 method90(int arg0, int arg1) {
        if (arg0 < 17) {
            return null;
        } else {
            field221++;
            return arg1 < 999999999 ? class34.method217(arg1, -65) : class28.field529;
        }
    }
}
