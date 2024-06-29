import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wi")
public class class489 {

    @OriginalMember(owner = "client!wi", name = "l", descriptor = "I")
    private int field6923;

    @OriginalMember(owner = "client!wi", name = "e", descriptor = "Z")
    private boolean field6916;

    @OriginalMember(owner = "client!wi", name = "f", descriptor = "Z")
    private boolean field6917;

    @OriginalMember(owner = "client!wi", name = "j", descriptor = "I")
    private int field6921;

    @OriginalMember(owner = "client!wi", name = "d", descriptor = "I")
    public static int field6915 = 0;

    @OriginalMember(owner = "client!wi", name = "c", descriptor = "Z")
    public static boolean field6914 = false;

    @OriginalMember(owner = "client!wi", name = "m", descriptor = "Z")
    public static boolean field6924 = false;

    @OriginalMember(owner = "client!wi", name = "i", descriptor = "Lke;")
    public static class622 field6920 = new class622(34, 6);

    @OriginalMember(owner = "client!wi", name = "o", descriptor = "[F")
    public static float[] field6926 = new float[16];

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "I")
    public static int field6912;

    @OriginalMember(owner = "client!wi", name = "b", descriptor = "I")
    public static int field6913;

    @OriginalMember(owner = "client!wi", name = "g", descriptor = "I")
    public static int field6918;

    @OriginalMember(owner = "client!wi", name = "k", descriptor = "I")
    public static int field6922;

    @OriginalMember(owner = "client!wi", name = "n", descriptor = "I")
    public static int field6925;

    @OriginalMember(owner = "client!wi", name = "h", descriptor = "Ljava/lang/String;")
    public static String field6919;

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(B)V", line = 4)
    public static void method2855(byte arg0) {
        int var1 = 37 % ((72 - arg0) / 54);
        field6926 = null;
        field6920 = null;
        field6919 = null;
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(I)I", line = 17)
    public final int method2856(int arg0) {
        if (arg0 != -25366) {
            this.method2860(false);
        }
        field6918++;
        return this.field6923;
    }

    @OriginalMember(owner = "client!wi", name = "b", descriptor = "(I)Z", line = 30)
    public final boolean method2857(int arg0) {
        field6925++;
        if (arg0 != 6) {
            this.field6923 = -84;
        }
        return this.field6916;
    }

    @OriginalMember(owner = "client!wi", name = "c", descriptor = "(I)I", line = 44)
    public final int method2858(int arg0) {
        field6912++;
        if (arg0 != 2423) {
            this.method2860(true);
        }
        return this.field6921;
    }

    @OriginalMember(owner = "client!wi", name = "d", descriptor = "(I)V", line = 63)
    public static final void method2859(int arg0) {
        field6913++;
        class31.field424.method1020((byte) -75);
        for (int var1 = 0; var1 < 32; var1++) {
            class581.field8249[var1] = 0L;
        }
        int var2 = 0;
        if (arg0 != 13102) {
            field6920 = null;
        }
        while (var2 < 32) {
            class364.field5266[var2] = 0L;
            var2++;
        }
        class684.field9710 = 0;
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(Z)Z", line = 89)
    public final boolean method2860(boolean arg0) {
        field6922++;
        if (arg0) {
            this.field6923 = 116;
        }
        return this.field6917;
    }

    @OriginalMember(owner = "client!wi", name = "<init>", descriptor = "(ZIIZ)V", line = 104)
    public class489(boolean arg0, int arg1, int arg2, boolean arg3) {
        this.field6923 = arg2;
        this.field6916 = arg3;
        this.field6917 = arg0;
        this.field6921 = arg1;
    }
}
