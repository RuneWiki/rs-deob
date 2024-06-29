import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!u")
public class class26 {

    @OriginalMember(owner = "client!u", name = "a", descriptor = "Z")
    public static boolean field316 = false;

    @OriginalMember(owner = "client!u", name = "e", descriptor = "I")
    public static int field320 = 0;

    @OriginalMember(owner = "client!u", name = "d", descriptor = "Lmg;")
    public static class116 field319 = new class116();

    @OriginalMember(owner = "client!u", name = "b", descriptor = "I")
    public static int field317;

    @OriginalMember(owner = "client!u", name = "c", descriptor = "I")
    public static int field318;

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(Z)V", line = 7)
    public static void method166(boolean arg0) {
        field319 = null;
        if (!arg0) {
            field319 = (class116) null;
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(IIIILhd;JZ)V", line = 16)
    public static final void method167(int arg0, int arg1, int arg2, int arg3, class161 arg4, long arg5, boolean arg6) {
        if (arg4 == null) {
            return;
        }
        class184 var8 = new class184();
        var8.field2968 = arg4;
        var8.field2960 = arg1 * 128 + 64;
        var8.field2966 = arg2 * 128 + 64;
        var8.field2963 = arg3;
        var8.field2972 = arg5;
        var8.field2965 = arg6;
        if (class129.field2184[arg0][arg1][arg2] == null) {
            class129.field2184[arg0][arg1][arg2] = new class36(arg0, arg1, arg2);
        }
        class129.field2184[arg0][arg1][arg2].field537 = var8;
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "([SI[Ljava/lang/String;)V", line = 39)
    public static final void method168(short[] arg0, int arg1, String[] arg2) {
        if (arg1 > 122) {
            field317++;
            class134.method1027(arg0, (byte) -77, arg2.length - 1, 0, arg2);
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(I)V", line = 66)
    public static final void method169(int arg0) {
        if (arg0 > -61) {
            field320 = 25;
        }
        field318++;
        if (class74.field1265 != null && class74.field1255 != null) {
            return;
        }
        class74.field1265 = new int[256];
        class74.field1255 = new int[256];
        for (int var1 = 0; var1 < 256; var1++) {
            double var2 = (double) var1 / 255.0D * 6.283185307179586D;
            class74.field1265[var1] = (int) (Math.sin(var2) * 4096.0D);
            class74.field1255[var1] = (int) (Math.cos(var2) * 4096.0D);
        }
    }
}
