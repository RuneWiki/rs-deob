import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dp")
public class class3 {

    @OriginalMember(owner = "client!dp", name = "e", descriptor = "I")
    public int field19 = -1;

    @OriginalMember(owner = "client!dp", name = "g", descriptor = "I")
    public int field21 = 128;

    @OriginalMember(owner = "client!dp", name = "n", descriptor = "Z")
    public boolean field28 = true;

    @OriginalMember(owner = "client!dp", name = "p", descriptor = "I")
    private int field30 = 0;

    @OriginalMember(owner = "client!dp", name = "c", descriptor = "Lwf;")
    public static class117 field17 = new class117(64);

    @OriginalMember(owner = "client!dp", name = "k", descriptor = "I")
    public static int field25 = 0;

    @OriginalMember(owner = "client!dp", name = "o", descriptor = "Z")
    public static boolean field29 = false;

    @OriginalMember(owner = "client!dp", name = "d", descriptor = "Z")
    public static boolean field18 = false;

    @OriginalMember(owner = "client!dp", name = "m", descriptor = "Lada;")
    public static class144 field27 = new class144(31, -2);

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "I")
    public int field15;

    @OriginalMember(owner = "client!dp", name = "b", descriptor = "I")
    public int field16;

    @OriginalMember(owner = "client!dp", name = "f", descriptor = "I")
    public static int field20;

    @OriginalMember(owner = "client!dp", name = "h", descriptor = "I")
    public static int field22;

    @OriginalMember(owner = "client!dp", name = "i", descriptor = "I")
    public int field23;

    @OriginalMember(owner = "client!dp", name = "j", descriptor = "I")
    public static int field24;

    @OriginalMember(owner = "client!dp", name = "l", descriptor = "I")
    public int field26;

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(I)V", line = 3)
    public static void method6(int arg0) {
        if (arg0 != -1) {
            field29 = false;
        }
        field27 = null;
        field17 = null;
    }

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(II)V", line = 14)
    private final void method7(int arg0, int arg1) {
        field24++;
        double var3 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
        double var5 = (double) ((arg0 & 0xFFB5) >> 8) / 256.0D;
        double var7 = (double) (arg0 & 0xFF) / 256.0D;
        if (arg1 > -52) {
            this.field19 = -29;
        }
        double var9 = var3;
        if (var3 > var5) {
            var9 = var5;
        }
        if (var9 > var7) {
            var9 = var7;
        }
        double var11 = var3;
        if (var5 > var3) {
            var11 = var5;
        }
        if (var11 < var7) {
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
        this.field15 = (int) (var17 * 256.0D);
        double var19 = var13 / 6.0D;
        this.field26 = (int) (var15 * 256.0D);
        if (this.field26 < 0) {
            this.field26 = 0;
        } else if (this.field26 > 255) {
            this.field26 = 255;
        }
        if (this.field15 < 0) {
            this.field15 = 0;
        } else if (this.field15 > 255) {
            this.field15 = 255;
        }
        if ((var17 > 0.5D)) {
            this.field16 = (int) ((1.0D - var17) * var15 * 512.0D);
        } else {
            this.field16 = (int) (var15 * var17 * 512.0D);
        }
        if (this.field16 < 1) {
            this.field16 = 1;
        }
        this.field23 = (int) ((double) this.field16 * var19);
    }

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(Lgw;ZI)V", line = 110)
    private final void method8(class148 arg0, boolean arg1, int arg2) {
        if (arg2 == 1) {
            this.field30 = arg0.method1028((byte) 123);
            this.method7(this.field30, -115);
        } else if (arg2 == 2) {
            this.field19 = arg0.method1045(true);
            if (this.field19 == 65535) {
                this.field19 = -1;
            }
        } else if (arg2 == 3) {
            this.field21 = arg0.method1045(true) << 0;
        } else if (arg2 == 4) {
            this.field28 = false;
        }
        field20++;
        if (arg1) {
            this.method8(null, false, -122);
        }
    }

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(Lgw;B)V", line = 173)
    public final void method9(class148 arg0, byte arg1) {
        if (arg1 > -117) {
            return;
        }
        while (true) {
            int var3 = arg0.method1032((byte) -33);
            if (var3 == 0) {
                field22++;
                return;
            }
            this.method8(arg0, false, var3);
        }
    }
}
