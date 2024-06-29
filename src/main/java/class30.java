import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ks")
public class class30 {

    @OriginalMember(owner = "client!ks", name = "g", descriptor = "I")
    public static int field482 = -1;

    @OriginalMember(owner = "client!ks", name = "b", descriptor = "Luv;")
    public static class3 field477 = new class3(67, 3);

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "I")
    public static int field476;

    @OriginalMember(owner = "client!ks", name = "c", descriptor = "I")
    public static int field478;

    @OriginalMember(owner = "client!ks", name = "d", descriptor = "I")
    public static int field479;

    @OriginalMember(owner = "client!ks", name = "e", descriptor = "I")
    public static int field480;

    @OriginalMember(owner = "client!ks", name = "f", descriptor = "I")
    public static int field481;

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(B)V")
    public static final void method178(byte arg0) {
        field476++;
        if (arg0 != -6) {
            field477 = null;
        }
        class337.field4706.method315(1);
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(IFIIIIZIZ)[[I")
    public static final int[][] method179(int arg0, float arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, boolean arg8) {
        field481++;
        int[][] var9 = new int[arg7][arg4];
        class621 var10 = new class621();
        var10.field8939 = arg2;
        var10.field8933 = arg6;
        var10.field8951 = arg3;
        var10.field8937 = (int) (arg1 * 4096.0F);
        if (!arg8) {
            method179(-33, 1.2541639F, -104, -7, -8, -67, false, -10, true);
        }
        var10.field8942 = arg5;
        var10.method18(-9);
        class512.method2856((byte) -97, arg4, arg7);
        for (int var11 = 0; var11 < arg7; var11++) {
            var10.method3560(var11, (byte) 37, var9[var11]);
        }
        return var9;
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(I)V")
    public static void method180(int arg0) {
        field477 = null;
        if (arg0 != -14538) {
            method180(-47);
        }
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(ILjava/lang/String;)J")
    public static final long method181(int arg0, String arg1) {
        field479++;
        long var2 = 0L;
        int var4 = arg1.length();
        for (int var5 = 0; var5 < var4; var5++) {
            var2 *= 37L;
            char var6 = arg1.charAt(var5);
            if (var6 >= 'A' && var6 <= 'Z') {
                var2 += (var6 + 1 - 65);
            } else if (var6 >= 'a' && var6 <= 'z') {
                var2 += (var6 - 96);
            } else if (var6 >= '0' && var6 <= '9') {
                var2 += (var6 + 27 - 48);
            }
            if (var2 >= 177917621779460413L) {
                break;
            }
        }
        while (var2 % 37L == 0L && var2 != 0L) {
            var2 /= 37L;
        }
        int var7 = 55 / (arg0 / 43);
        return var2;
    }
}
