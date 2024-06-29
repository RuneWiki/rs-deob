import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gh")
public class class24 {

    @OriginalMember(owner = "client!gh", name = "i", descriptor = "I")
    public int field347;

    @OriginalMember(owner = "client!gh", name = "r", descriptor = "I")
    public int field356;

    @OriginalMember(owner = "client!gh", name = "s", descriptor = "I")
    public int field357;

    @OriginalMember(owner = "client!gh", name = "t", descriptor = "I")
    public int field358;

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "I")
    public static int field339 = 0;

    @OriginalMember(owner = "client!gh", name = "g", descriptor = "Ljd;")
    private static class85 field345 = class221.method1499("Hidden", (byte) 98);

    @OriginalMember(owner = "client!gh", name = "n", descriptor = "Ljd;")
    public static class85 field352 = field345;

    @OriginalMember(owner = "client!gh", name = "c", descriptor = "Ljd;")
    private static class85 field341 = class221.method1499("RuneScape is loading )2 please wait)3)3)3", (byte) -64);

    @OriginalMember(owner = "client!gh", name = "d", descriptor = "I")
    public static int field342 = 0;

    @OriginalMember(owner = "client!gh", name = "k", descriptor = "[I")
    public static int[] field349 = new int[4096];

    @OriginalMember(owner = "client!gh", name = "o", descriptor = "Ljd;")
    public static class85 field353 = class221.method1499("; Expires=", (byte) 119);

    @OriginalMember(owner = "client!gh", name = "f", descriptor = "[S")
    public static short[] field344 = new short[256];

    @OriginalMember(owner = "client!gh", name = "e", descriptor = "I")
    public static int field343 = 50;

    @OriginalMember(owner = "client!gh", name = "m", descriptor = "Z")
    public static boolean field351 = true;

    @OriginalMember(owner = "client!gh", name = "p", descriptor = "Ljd;")
    private static class85 field354 = class221.method1499("Walk here", (byte) 102);

    @OriginalMember(owner = "client!gh", name = "l", descriptor = "Ljd;")
    public static class85 field350 = field341;

    @OriginalMember(owner = "client!gh", name = "q", descriptor = "[Ljd;")
    public static class85[] field355 = new class85[100];

    @OriginalMember(owner = "client!gh", name = "u", descriptor = "Ljd;")
    public static class85 field359 = field354;

    @OriginalMember(owner = "client!gh", name = "b", descriptor = "I")
    public static int field340;

    @OriginalMember(owner = "client!gh", name = "j", descriptor = "I")
    public static int field348;

    @OriginalMember(owner = "client!gh", name = "h", descriptor = "Lr;")
    public static class39 field346;

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(Z)V")
    public static void method159(boolean arg0) {
        field353 = null;
        field349 = null;
        field355 = null;
        if (arg0) {
            return;
        }
        field359 = null;
        field352 = null;
        field341 = null;
        field346 = null;
        field354 = null;
        field344 = null;
        field350 = null;
        field345 = null;
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(ILjb;IIIIII)V")
    public static final void method160(int arg0, class255 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (class255.field4412) {
            class169.field2920 = 32;
        } else {
            class169.field2920 = 0;
        }
        field348++;
        class255.field4412 = false;
        if (class217.field3806 != 0) {
            if (arg0 <= arg4 && arg4 < (arg0 + 16) && arg5 <= arg2 && arg5 + 16 > arg2) {
                arg1.field4484 -= 4;
                class16.method120((byte) -119, arg1);
            } else if (arg4 >= arg0 && arg4 < arg0 + 16 && (arg5 + arg6 - 16) <= arg2 && arg2 < arg5 + arg6) {
                arg1.field4484 += 4;
                class16.method120((byte) -99, arg1);
            } else if (arg4 >= arg0 - class169.field2920 && arg4 < (class169.field2920 + arg0 + 16) && arg2 >= arg5 + 16 && arg2 < (arg5 + arg6 - 16)) {
                int var8 = (arg6 - 32) * arg6 / arg3;
                if (var8 < 8) {
                    var8 = 8;
                }
                int var9 = arg2 - arg5 - (var8 / 2) - 16;
                int var10 = arg6 - var8 - 32;
                arg1.field4484 = (arg3 - arg6) * var9 / var10;
                class16.method120((byte) -20, arg1);
                class255.field4412 = true;
            }
        }
        if (arg7 != 4096) {
            field353 = null;
        }
        if (class146.field2492 == 0) {
            return;
        }
        int var11 = arg1.field4513;
        if (arg4 >= (arg0 - var11) && arg2 >= arg5 && (arg0 + 16) > arg4 && arg2 <= arg5 + arg6) {
            arg1.field4484 += class146.field2492 * 45;
            class16.method120((byte) -118, arg1);
            return;
        }
    }

    @OriginalMember(owner = "client!gh", name = "<init>", descriptor = "()V")
    public class24() {
    }

    @OriginalMember(owner = "client!gh", name = "<init>", descriptor = "(Lgh;)V")
    public class24(class24 arg0) {
        this.field347 = arg0.field347;
        this.field356 = arg0.field356;
        this.field357 = arg0.field357;
        this.field358 = arg0.field358;
    }
}
