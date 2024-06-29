import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ci")
public class class200 {

    @OriginalMember(owner = "client!ci", name = "d", descriptor = "I")
    private int field3164 = 0;

    @OriginalMember(owner = "client!ci", name = "g", descriptor = "Z")
    public boolean field3167 = true;

    @OriginalMember(owner = "client!ci", name = "j", descriptor = "I")
    public int field3170 = -1;

    @OriginalMember(owner = "client!ci", name = "h", descriptor = "I")
    public int field3168 = 128;

    @OriginalMember(owner = "client!ci", name = "o", descriptor = "Ljava/lang/String;")
    public static String field3175 = "shake:";

    @OriginalMember(owner = "client!ci", name = "i", descriptor = "Lad;")
    public static class128 field3169 = new class128();

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "I")
    public int field3161;

    @OriginalMember(owner = "client!ci", name = "b", descriptor = "I")
    public static int field3162;

    @OriginalMember(owner = "client!ci", name = "f", descriptor = "I")
    public static int field3166;

    @OriginalMember(owner = "client!ci", name = "k", descriptor = "I")
    public int field3171;

    @OriginalMember(owner = "client!ci", name = "m", descriptor = "I")
    public static int field3173;

    @OriginalMember(owner = "client!ci", name = "n", descriptor = "I")
    public static int field3174;

    @OriginalMember(owner = "client!ci", name = "p", descriptor = "I")
    public static int field3176;

    @OriginalMember(owner = "client!ci", name = "q", descriptor = "I")
    public int field3177;

    @OriginalMember(owner = "client!ci", name = "r", descriptor = "I")
    public int field3178;

    @OriginalMember(owner = "client!ci", name = "l", descriptor = "Lsd;")
    public static class27 field3172;

    @OriginalMember(owner = "client!ci", name = "s", descriptor = "Lcb;")
    public static class283 field3179;

    @OriginalMember(owner = "client!ci", name = "u", descriptor = "Lcb;")
    public static class283 field3181;

    @OriginalMember(owner = "client!ci", name = "e", descriptor = "Lak;")
    public static class313 field3165;

    @OriginalMember(owner = "client!ci", name = "t", descriptor = "Z")
    public static boolean field3180;

    @OriginalMember(owner = "client!ci", name = "c", descriptor = "[Lsd;")
    public static class27[] field3163;

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(ILhb;I)V", line = 4)
    public final void method1447(int arg0, class35 arg1, int arg2) {
        if (arg0 > -120) {
            this.method1450(98, -110, (class35) null, 73);
        }
        while (true) {
            int var4 = arg1.method273(65280);
            if (var4 == 0) {
                field3176++;
                return;
            }
            this.method1450(var4, arg2, arg1, -2);
        }
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(II)V", line = 35)
    private final void method1448(int arg0, int arg1) {
        field3166++;
        double var3 = (double) (arg1 >> 16 & 0xFF) / 256.0D;
        double var5 = (double) ((arg1 & 0xFFAC) >> 8) / 256.0D;
        double var7 = (double) (arg1 & 0xFF) / 256.0D;
        double var9 = var3;
        double var11 = var3;
        if (var5 > var3) {
            var11 = var5;
        }
        if (var5 < var3) {
            var9 = var5;
        }
        if (var7 < var9) {
            var9 = var7;
        }
        if (var7 > var11) {
            var11 = var7;
        }
        double var13 = 0.0D;
        if (arg0 != -13717) {
            return;
        }
        double var15 = (var9 + var11) / 2.0D;
        double var17 = 0.0D;
        this.field3177 = (int) (var15 * 256.0D);
        if (this.field3177 < 0) {
            this.field3177 = 0;
        } else if (this.field3177 > 255) {
            this.field3177 = 255;
        }
        if (var9 != var11) {
            if (var15 < 0.5D) {
                var13 = (var11 - var9) / (var9 + var11);
            }
            if (var3 == var11) {
                var17 = (var5 - var7) / (var11 - var9);
            } else if (var5 == var11) {
                var17 = (var7 - var3) / (var11 - var9) + 2.0D;
            } else if (var7 == var11) {
                var17 = (var3 - var5) / (var11 - var9) + 4.0D;
            }
            if (var15 >= 0.5D) {
                var13 = (var11 - var9) / (2.0D - var11 - var9);
            }
        }
        double var19 = var17 / 6.0D;
        this.field3171 = (int) (var13 * 256.0D);
        if ((var15 > 0.5D)) {
            this.field3161 = (int) ((1.0D - var15) * var13 * 512.0D);
        } else {
            this.field3161 = (int) (var13 * var15 * 512.0D);
        }
        if (this.field3171 < 0) {
            this.field3171 = 0;
        } else if (this.field3171 > 255) {
            this.field3171 = 255;
        }
        if (this.field3161 < 1) {
            this.field3161 = 1;
        }
        this.field3178 = (int) ((double) this.field3161 * var19);
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(I)V", line = 122)
    public static void method1449(int arg0) {
        field3172 = null;
        field3175 = null;
        field3169 = null;
        field3181 = null;
        field3163 = null;
        field3165 = null;
        if (arg0 != 128) {
            field3165 = (class313) null;
        }
        field3179 = null;
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(IILhb;I)V", line = 153)
    private final void method1450(int arg0, int arg1, class35 arg2, int arg3) {
        field3174++;
        if (~arg0 == arg3) {
            this.field3164 = arg2.method269(false);
            this.method1448(-13717, this.field3164);
        } else if (arg0 == 2) {
            this.field3170 = arg2.method300(-1394191632);
            if (this.field3170 == 65535) {
                this.field3170 = -1;
            }
        } else if (arg0 == 3) {
            this.field3168 = arg2.method300(arg3 - 1394191630);
        } else if (arg0 == 4) {
            this.field3167 = false;
        }
    }
}
