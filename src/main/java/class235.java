import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eba")
public class class235 {

    @OriginalMember(owner = "client!eba", name = "g", descriptor = "I")
    public int field3061 = -1;

    @OriginalMember(owner = "client!eba", name = "d", descriptor = "I")
    public int field3058 = 512;

    @OriginalMember(owner = "client!eba", name = "i", descriptor = "I")
    private int field3063 = 0;

    @OriginalMember(owner = "client!eba", name = "a", descriptor = "Z")
    public boolean field3055 = true;

    @OriginalMember(owner = "client!eba", name = "f", descriptor = "Lcb;")
    public static class318 field3060 = new class318(23, -2);

    @OriginalMember(owner = "client!eba", name = "p", descriptor = "[[I")
    public static int[][] field3070 = new int[128][128];

    @OriginalMember(owner = "client!eba", name = "q", descriptor = "I")
    public static int field3071 = -2;

    @OriginalMember(owner = "client!eba", name = "b", descriptor = "I")
    public static int field3056;

    @OriginalMember(owner = "client!eba", name = "c", descriptor = "I")
    public static int field3057;

    @OriginalMember(owner = "client!eba", name = "e", descriptor = "I")
    public static int field3059;

    @OriginalMember(owner = "client!eba", name = "h", descriptor = "I")
    public static int field3062;

    @OriginalMember(owner = "client!eba", name = "j", descriptor = "I")
    public static int field3064;

    @OriginalMember(owner = "client!eba", name = "k", descriptor = "I")
    public static int field3065;

    @OriginalMember(owner = "client!eba", name = "l", descriptor = "I")
    public int field3066;

    @OriginalMember(owner = "client!eba", name = "m", descriptor = "I")
    public static int field3067;

    @OriginalMember(owner = "client!eba", name = "n", descriptor = "I")
    public int field3068;

    @OriginalMember(owner = "client!eba", name = "o", descriptor = "I")
    public int field3069;

    @OriginalMember(owner = "client!eba", name = "r", descriptor = "I")
    public int field3072;

    @OriginalMember(owner = "client!eba", name = "s", descriptor = "I")
    public static int field3073;

    @OriginalMember(owner = "client!eba", name = "a", descriptor = "(ILdga;)V", line = 4)
    public final void method1453(int arg0, class138 arg1) {
        if (arg0 != -1) {
            method1455(-126, true, -125);
        }
        field3064++;
        while (true) {
            int var3 = arg1.method957((byte) -65);
            if (var3 == 0) {
                return;
            }
            this.method1460(arg1, 113, var3);
        }
    }

    @OriginalMember(owner = "client!eba", name = "a", descriptor = "(IB)V", line = 25)
    private final void method1454(int arg0, byte arg1) {
        field3059++;
        double var3 = (double) ((arg0 & 0xFF1FBB) >> 16) / 256.0D;
        double var5 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
        double var7 = (double) (arg0 & 0xFF) / 256.0D;
        double var9 = var3;
        if (var5 < var3) {
            var9 = var5;
        }
        if (var7 < var9) {
            var9 = var7;
        }
        double var11 = var3;
        if (var3 < var5) {
            var11 = var5;
        }
        if (var7 > var11) {
            var11 = var7;
        }
        double var13 = 0.0D;
        double var15 = 0.0D;
        double var17 = (var9 + var11) / 2.0D;
        if (var9 != var11) {
            if (var17 < 0.5D) {
                var15 = (var11 - var9) / (var9 + var11);
            }
            if (var3 == var11) {
                var13 = (var5 - var7) / (var11 - var9);
            } else if (var5 == var11) {
                var13 = (var7 - var3) / (var11 - var9) + 2.0D;
            } else if (var7 == var11) {
                var13 = (var3 - var5) / (var11 - var9) + 4.0D;
            }
            if (var17 >= 0.5D) {
                var15 = (var11 - var9) / (2.0D - var11 - var9);
            }
        }
        this.field3068 = (int) (var17 * 256.0D);
        double var19 = var13 / 6.0D;
        this.field3072 = (int) (var15 * 256.0D);
        if (arg1 <= 76) {
            this.method1460(null, 123, -120);
        }
        if (this.field3068 < 0) {
            this.field3068 = 0;
        } else if (this.field3068 > 255) {
            this.field3068 = 255;
        }
        if (this.field3072 < 0) {
            this.field3072 = 0;
        } else if (this.field3072 > 255) {
            this.field3072 = 255;
        }
        if ((var17 > 0.5D)) {
            this.field3069 = (int) ((1.0D - var17) * var15 * 512.0D);
        } else {
            this.field3069 = (int) (var15 * var17 * 512.0D);
        }
        if (this.field3069 < 1) {
            this.field3069 = 1;
        }
        this.field3066 = (int) ((double) this.field3069 * var19);
    }

    @OriginalMember(owner = "client!eba", name = "a", descriptor = "(IZI)I", line = 123)
    public static final int method1455(int arg0, boolean arg1, int arg2) {
        field3065++;
        if (arg1) {
            return 0;
        }
        class149 var3 = class255.method1597(arg0, arg1, 27628);
        if (var3 == null) {
            return class255.field3521.method3381(25192, arg0).field6341;
        }
        int var4 = 0;
        for (int var5 = arg2; var5 < var3.field1873.length; var5++) {
            if (var3.field1873[var5] == -1) {
                var4++;
            }
        }
        return var4 + (class255.field3521.method3381(arg2 ^ 0x6268, arg0).field6341 - var3.field1873.length);
    }

    @OriginalMember(owner = "client!eba", name = "a", descriptor = "(IIII)V", line = 161)
    public static final void method1456(int arg0, int arg1, int arg2, int arg3) {
        field3062++;
        class253.field3491.method906(arg3, arg0);
        class253.field3491.method915(arg2, 1502242504);
        class253.field3491.method913(arg1, 118);
    }

    @OriginalMember(owner = "client!eba", name = "a", descriptor = "(IBIILud;)V", line = 172)
    public static final void method1457(int arg0, byte arg1, int arg2, int arg3, class519 arg4) {
        field3056++;
        int var5 = arg4.field526[0];
        int var6 = arg4.field516[0];
        if (var5 < 0 || class588.field8082 <= var5 || var6 < 0 || var6 >= class12.field113 || arg0 < 0 || class588.field8082 <= arg0 || arg2 < 0 || class12.field113 <= arg2) {
            return;
        }
        int var7 = class25.method146(arg0, var6, 0, class517.field7136, arg2, -4, 0, true, 0, class364.field5239, class624.field8489[arg4.field3925], (byte) -68, 0, arg4.method241(-25747), var5);
        if (var7 >= 1 && var7 <= 3 && arg3 > 71) {
            for (int var8 = 0; var8 < (var7 - 1); var8++) {
                arg4.method2950(arg1, class517.field7136[var8], class364.field5239[var8], -111);
            }
        }
    }

    @OriginalMember(owner = "client!eba", name = "a", descriptor = "(IIZZI)V", line = 215)
    public static final void method1458(int arg0, int arg1, boolean arg2, boolean arg3, int arg4) {
        field3073++;
        if (arg4 > -112) {
            field3071 = 79;
        }
        class58.method360(class375.field5394.length - 1, arg3, arg1, (byte) -121, arg2, arg0, 0);
        class277.field3749 = 0;
        class258.field3583 = null;
    }

    @OriginalMember(owner = "client!eba", name = "a", descriptor = "(B)V", line = 242)
    public static void method1459(byte arg0) {
        field3070 = null;
        if (arg0 != -68) {
            field3060 = null;
        }
        field3060 = null;
    }

    @OriginalMember(owner = "client!eba", name = "a", descriptor = "(Ldga;II)V", line = 253)
    private final void method1460(class138 arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            this.field3063 = arg0.method904(120);
            this.method1454(this.field3063, (byte) 97);
        } else if (arg2 == 2) {
            this.field3061 = arg0.method922((byte) -125);
            if (this.field3061 == 65535) {
                this.field3061 = -1;
            }
        } else if (arg2 == 3) {
            this.field3058 = arg0.method922((byte) -115) << 2;
        } else if (arg2 == 4) {
            this.field3055 = false;
        }
        field3057++;
        if (arg1 < 57) {
            method1458(-105, -13, false, true, 67);
        }
    }
}
