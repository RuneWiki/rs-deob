import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jb")
public class class185 {

    @OriginalMember(owner = "client!jb", name = "g", descriptor = "I")
    private int field3107 = -1;

    @OriginalMember(owner = "client!jb", name = "m", descriptor = "I")
    private int field3113 = 0;

    @OriginalMember(owner = "client!jb", name = "l", descriptor = "[B")
    public static byte[] field3112 = new byte[32896];

    @OriginalMember(owner = "client!jb", name = "e", descriptor = "F")
    public static float field3105;

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "I")
    public int field3101;

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "I")
    public static int field3102;

    @OriginalMember(owner = "client!jb", name = "c", descriptor = "I")
    public int field3103;

    @OriginalMember(owner = "client!jb", name = "d", descriptor = "I")
    public int field3104;

    @OriginalMember(owner = "client!jb", name = "f", descriptor = "I")
    public static int field3106;

    @OriginalMember(owner = "client!jb", name = "h", descriptor = "I")
    public static int field3108;

    @OriginalMember(owner = "client!jb", name = "i", descriptor = "I")
    public int field3109;

    @OriginalMember(owner = "client!jb", name = "j", descriptor = "I")
    public static int field3110;

    @OriginalMember(owner = "client!jb", name = "k", descriptor = "I")
    public static int field3111;

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(I)V")
    public static void method1234(int arg0) {
        field3112 = null;
        if (arg0 < 46) {
            method1235(-113, 56);
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(II)Z")
    public static final boolean method1235(int arg0, int arg1) {
        if (arg1 < 80) {
            field3105 = -0.5641492F;
        }
        field3111++;
        return (arg0 & 0x386F18) >> 21 != 0;
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(Lva;BII)V")
    private final void method1236(class187 arg0, byte arg1, int arg2, int arg3) {
        if (arg3 == 1) {
            this.field3113 = arg0.method1248((byte) -100);
            this.method1238(this.field3113, (byte) 123);
        } else if (arg3 == 2) {
            this.field3107 = arg0.method1244(false);
            if (this.field3107 == 65535) {
                this.field3107 = -1;
            }
        } else if (arg3 == 3) {
            arg0.method1244(false);
        }
        if (arg1 < 5) {
            field3105 = -2.1644564F;
        }
        field3106++;
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(B)V")
    public static final void method1237(byte arg0) {
        field3110++;
        if (arg0 > -111) {
            method1235(-4, -80);
        }
        class168.field2813.method1409(127);
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(IB)V")
    private final void method1238(int arg0, byte arg1) {
        field3102++;
        double var3 = (double) ((arg0 & 0xFF88) >> 8) / 256.0D;
        double var5 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
        double var7 = var5;
        double var9 = (double) (arg0 & 0xFF) / 256.0D;
        if (var3 < var5) {
            var7 = var3;
        }
        double var11 = 0.0D;
        double var13 = var5;
        if (var9 < var7) {
            var7 = var9;
        }
        if (arg1 <= 119) {
            field3112 = null;
        }
        if (var5 < var3) {
            var13 = var3;
        }
        double var15 = 0.0D;
        if (var9 > var13) {
            var13 = var9;
        }
        double var17 = (var7 + var13) / 2.0D;
        this.field3101 = (int) (var17 * 256.0D);
        if (var7 != var13) {
            if (var17 < 0.5D) {
                var15 = (var13 - var7) / (var7 + var13);
            }
            if (var5 == var13) {
                var11 = (var3 - var9) / (var13 - var7);
            } else if (var3 == var13) {
                var11 = (var9 - var5) / (var13 - var7) + 2.0D;
            } else if (var9 == var13) {
                var11 = (var5 - var3) / (var13 - var7) + 4.0D;
            }
            if (var17 >= 0.5D) {
                var15 = (var13 - var7) / (2.0D - var13 - var7);
            }
        }
        double var19 = var11 / 6.0D;
        if (this.field3101 < 0) {
            this.field3101 = 0;
        } else if (this.field3101 > 255) {
            this.field3101 = 255;
        }
        this.field3104 = (int) (var15 * 256.0D);
        if (var17 > 0.5D) {
            this.field3103 = (int) ((1.0D - var17) * var15 * 512.0D);
        } else {
            this.field3103 = (int) (var15 * var17 * 512.0D);
        }
        if (this.field3104 < 0) {
            this.field3104 = 0;
        } else if (this.field3104 > 255) {
            this.field3104 = 255;
        }
        if (this.field3103 < 1) {
            this.field3103 = 1;
        }
        this.field3109 = (int) ((double) this.field3103 * var19);
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(Lva;IB)V")
    public final void method1239(class187 arg0, int arg1, byte arg2) {
        while (true) {
            int var4 = arg0.method1268(255);
            if (var4 == 0) {
                int var5 = 1 / ((arg2 + 53) / 62);
                field3108++;
                return;
            }
            this.method1236(arg0, (byte) 9, arg1, var4);
        }
    }

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 256; var1++) {
            for (int var2 = 0; var2 <= var1; var2++) {
                field3112[var0++] = (byte) ((int) (255.0D / Math.sqrt((double) ((float) (var1 * var1 + var2 * var2 + 65535) / 65535.0F))));
            }
        }
    }
}
