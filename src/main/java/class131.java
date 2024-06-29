import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sf")
public abstract class class131 {

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "Lec;")
    public static class32 field3012 = null;

    @OriginalMember(owner = "client!sf", name = "c", descriptor = "Lec;")
    public static class32 field3013 = class73.method594("Hidden)2use", true);

    @OriginalMember(owner = "client!sf", name = "d", descriptor = "Lec;")
    public static class32 field3014 = class73.method594("mn", true);

    @OriginalMember(owner = "client!sf", name = "h", descriptor = "Lec;")
    public static class32 field3018 = class73.method594("Bitte benutzen Sie eine andere Welt)3", true);

    @OriginalMember(owner = "client!sf", name = "j", descriptor = "Lec;")
    private static class32 field3020 = class73.method594("Please wait)3)3)3", true);

    @OriginalMember(owner = "client!sf", name = "g", descriptor = "Lec;")
    public static class32 field3017 = field3020;

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "I")
    public static int field3011;

    @OriginalMember(owner = "client!sf", name = "e", descriptor = "I")
    public static int field3015;

    @OriginalMember(owner = "client!sf", name = "f", descriptor = "I")
    public static int field3016;

    @OriginalMember(owner = "client!sf", name = "i", descriptor = "I")
    public static int field3019;

    @OriginalMember(owner = "client!sf", name = "k", descriptor = "[Lh;")
    public static class49[] field3021;

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(IIIILh;Z)V")
    public static final void method1006(int arg0, int arg1, int arg2, int arg3, class49 arg4, boolean arg5) {
        if (!arg5) {
            method1008(false);
        }
        field3015++;
        int var6 = arg0 * arg0 + arg3 * arg3;
        if (var6 <= 4225 || var6 >= 90000) {
            class136.method1034(-2011, arg2, arg1, arg3, arg4, arg0);
            return;
        }
        int var7 = class133.field3056 + class27.field493 & 0x7FF;
        int var8 = class7.field121[var7];
        int var9 = var8 * 256 / (class29.field527 + 256);
        int var10 = class7.field113[var7];
        int var11 = var10 * 256 / (class29.field527 + 256);
        int var12 = arg0 * var9 + arg3 * var11 >> 16;
        int var13 = arg3 * var9 - arg0 * var11 >> 16;
        double var14 = Math.atan2((double) var12, (double) var13);
        int var16 = (int) (Math.sin(var14) * 63.0D);
        int var17 = (int) (Math.cos(var14) * 57.0D);
        class48.field1138.method391(arg2 + var16 + 94 - 6, arg1 + 83 + -var17 + -20, 20, 20, 15, 15, var14, 256);
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "([BB)V")
    public abstract void method60(byte[] arg0, byte arg1);

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(IIIII)I")
    public static final int method1007(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field3019++;
        int var5 = 65536 - class7.field121[arg1 * 1024 / arg0] >> 1;
        if (arg3 <= 39) {
            method1006(-47, 14, -85, -90, null, false);
        }
        return ((65536 - var5) * arg4 >> 16) + (arg2 * var5 >> 16);
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(B)[B")
    public abstract byte[] method61(byte arg0);

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(Z)V")
    public static void method1008(boolean arg0) {
        field3021 = null;
        field3017 = null;
        field3020 = null;
        if (!arg0) {
            method1006(-21, -59, -1, 107, null, true);
        }
        field3018 = null;
        field3012 = null;
        field3013 = null;
        field3014 = null;
    }
}
