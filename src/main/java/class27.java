import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!il")
public class class27 {

    @OriginalMember(owner = "client!il", name = "c", descriptor = "Luf;")
    public static class168 field337 = class148.method1019(-1720, ":trade:");

    @OriginalMember(owner = "client!il", name = "k", descriptor = "Luf;")
    public static class168 field345 = class148.method1019(-1720, "(U");

    @OriginalMember(owner = "client!il", name = "h", descriptor = "I")
    public static int field342 = -1;

    @OriginalMember(owner = "client!il", name = "a", descriptor = "[Z")
    public static boolean[] field335 = new boolean[200];

    @OriginalMember(owner = "client!il", name = "e", descriptor = "Luf;")
    public static class168 field339 = class148.method1019(-1720, " (X");

    @OriginalMember(owner = "client!il", name = "b", descriptor = "I")
    public static int field336 = 0;

    @OriginalMember(owner = "client!il", name = "l", descriptor = "I")
    public static int field346 = 0;

    @OriginalMember(owner = "client!il", name = "d", descriptor = "I")
    public static int field338;

    @OriginalMember(owner = "client!il", name = "f", descriptor = "I")
    public static int field340;

    @OriginalMember(owner = "client!il", name = "g", descriptor = "I")
    public static int field341;

    @OriginalMember(owner = "client!il", name = "i", descriptor = "I")
    public static int field343;

    @OriginalMember(owner = "client!il", name = "j", descriptor = "I")
    public static int field344;

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(BI)V", line = 14)
    public static final void method141(byte arg0, int arg1) {
        if (arg0 >= -80) {
            return;
        }
        field340++;
        if (!class18.method83((byte) -106, arg1)) {
            return;
        }
        class242[] var2 = class272.field4582[arg1];
        for (int var3 = 0; var3 < var2.length; var3++) {
            class242 var4 = var2[var3];
            if (var4 != null) {
                var4.field4027 = 0;
                var4.field4091 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(Lug;BIIIZ)V", line = 62)
    public static final void method142(class190 arg0, byte arg1, int arg2, int arg3, int arg4, boolean arg5) {
        field341++;
        if (class36.field414 >= 50 || arg0.field3091 == null || arg3 >= arg0.field3091.length || arg0.field3091[arg3] == null) {
            return;
        }
        int var6 = arg0.field3091[arg3][0];
        int var7 = var6 >> 8;
        int var8 = var6 >> 4 & 0x7;
        if (arg0.field3091[arg3].length > 1) {
            int var9 = (int) (Math.random() * (double) arg0.field3091[arg3].length);
            if (var9 > 0) {
                var7 = arg0.field3091[arg3][var9];
            }
        }
        int var10 = var6 & 0xF;
        if (var10 == 0) {
            if (arg5) {
                class280.method1938((byte) 90, var8, var7, 0);
            }
        } else if (class72.field968 != 0 && arg1 == -119) {
            class271.field4554[class36.field414] = var7;
            int var11 = (arg4 - 64) / 128;
            int var12 = (arg2 - 64) / 128;
            class295.field4996[class36.field414] = var8;
            class242.field4067[class36.field414] = 0;
            class135.field2114[class36.field414] = null;
            class221.field3588[class36.field414] = (var11 << 8) + (var12 << 16) + var10;
            class36.field414++;
        }
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(I)V", line = 136)
    public static void method143(int arg0) {
        field337 = null;
        field345 = null;
        field335 = null;
        field339 = null;
        if (arg0 != 883044776) {
            field335 = (boolean[]) null;
        }
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(IILdk;)Lsk;", line = 178)
    public static final class193 method144(int arg0, int arg1, class241 arg2) {
        field344++;
        if (class254.method1748(arg2, 1, arg0)) {
            if (arg1 != -64) {
                field346 = -70;
            }
            return class154.method1100(false);
        } else {
            return null;
        }
    }
}
