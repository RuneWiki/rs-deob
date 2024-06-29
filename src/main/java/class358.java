import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tg")
public class class358 {

    @OriginalMember(owner = "client!tg", name = "b", descriptor = "I")
    public static int field5111;

    @OriginalMember(owner = "client!tg", name = "d", descriptor = "I")
    public static int field5113;

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "J")
    public static long field5110;

    @OriginalMember(owner = "client!tg", name = "c", descriptor = "Lvc;")
    public static class143 field5112;

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(I)V", line = 10)
    public static void method2198(int arg0) {
        field5112 = null;
        if (arg0 != 6762) {
            field5110 = 26L;
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(BIIJ)V", line = 23)
    public static final void method2199(byte arg0, int arg1, int arg2, long arg3) {
        if (arg0 <= 1) {
            method2200(-85, 63, -14, null, 13, -44);
        }
        field5113++;
        int var5 = ((int) arg3 & 0x7C502) >> 14;
        int var6 = (int) arg3 >> 20 & 0x3;
        int var7 = Integer.MAX_VALUE & (int) (arg3 >>> 32);
        if (var5 != 10 && var5 != 11 && var5 != 22) {
            class140.method867(var6, 0, true, (byte) 50, 0, var5, arg2, 0, arg1);
            return;
        }
        class290 var8 = field5112.method890(var7, false);
        int var9;
        int var10;
        if (var6 == 0 || var6 == 2) {
            var10 = var8.field3762;
            var9 = var8.field3724;
        } else {
            var9 = var8.field3762;
            var10 = var8.field3724;
        }
        int var11 = var8.field3753;
        if (var6 != 0) {
            var11 = (var11 >> 4 - var6) + (var11 << var6 & 0xF);
        }
        class140.method867(0, var11, true, (byte) 50, var10, 0, arg2, var9, arg1);
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(IIILeq;II)Lmba;", line = 69)
    public static final class77 method2200(int arg0, int arg1, int arg2, class357 arg3, int arg4, int arg5) {
        field5111++;
        if (arg4 != 3234) {
            return null;
        } else if (!arg3.field5082 && (!class487.method2850((byte) 127, arg5) || !class487.method2850((byte) -62, arg1))) {
            return arg3.field5017 ? new class77(arg3, 34037, arg2, arg0, arg5, arg1, true) : new class77(arg3, arg2, arg0, arg5, arg1, class353.method2103(63, arg5), class353.method2103(arg4 - 3117, arg1), true);
        } else {
            return new class77(arg3, 3553, arg2, arg0, arg5, arg1, true);
        }
    }
}
