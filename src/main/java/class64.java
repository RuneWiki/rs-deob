import java.awt.datatransfer.Clipboard;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dl")
public class class64 {

    @OriginalMember(owner = "client!dl", name = "h", descriptor = "I")
    public int field872;

    @OriginalMember(owner = "client!dl", name = "p", descriptor = "I")
    public int field880;

    @OriginalMember(owner = "client!dl", name = "b", descriptor = "I")
    public int field866;

    @OriginalMember(owner = "client!dl", name = "e", descriptor = "I")
    public int field869;

    @OriginalMember(owner = "client!dl", name = "f", descriptor = "B")
    public byte field870;

    @OriginalMember(owner = "client!dl", name = "k", descriptor = "I")
    public int field875;

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "[Ljava/lang/String;")
    public static String[] field865 = new String[100];

    @OriginalMember(owner = "client!dl", name = "m", descriptor = "F")
    public static float field877 = 0.25F;

    @OriginalMember(owner = "client!dl", name = "n", descriptor = "[J")
    public static long[] field878 = new long[256];

    @OriginalMember(owner = "client!dl", name = "d", descriptor = "I")
    public static int field868;

    @OriginalMember(owner = "client!dl", name = "j", descriptor = "I")
    public static int field874;

    @OriginalMember(owner = "client!dl", name = "s", descriptor = "I")
    public static int field883;

    @OriginalMember(owner = "client!dl", name = "q", descriptor = "Lpda;")
    public class137 field881;

    @OriginalMember(owner = "client!dl", name = "o", descriptor = "Lbp;")
    public class430 field879;

    @OriginalMember(owner = "client!dl", name = "g", descriptor = "Lqr;")
    public class664 field871;

    @OriginalMember(owner = "client!dl", name = "r", descriptor = "Lon;")
    public static class678 field882;

    @OriginalMember(owner = "client!dl", name = "l", descriptor = "Lgw;")
    public class73 field876;

    @OriginalMember(owner = "client!dl", name = "i", descriptor = "Ljava/awt/datatransfer/Clipboard;")
    public static Clipboard field873;

    @OriginalMember(owner = "client!dl", name = "c", descriptor = "Z")
    public static boolean field867;

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(BILsa;Lpca;ILdg;II)V")
    public static final void method535(byte arg0, int arg1, class698 arg2, class532 arg3, int arg4, class193 arg5, int arg6, int arg7) {
        if (arg0 >= -107) {
            return;
        }
        field883++;
        class118 var8 = new class118();
        var8.field1516 = arg7 << 9;
        var8.field1524 = arg1 << 9;
        var8.field1533 = arg6;
        if (arg2 != null) {
            var8.field1535 = arg2;
            int var9 = arg2.field9589;
            int var10 = arg2.field9654;
            if (arg4 == 1 || arg4 == 3) {
                var9 = arg2.field9654;
                var10 = arg2.field9589;
            }
            var8.field1525 = arg2.field9622;
            var8.field1521 = arg2.field9643;
            var8.field1511 = arg2.field9642;
            var8.field1508 = arg2.field9636;
            var8.field1526 = arg2.field9609;
            var8.field1513 = arg2.field9664;
            var8.field1510 = arg2.field9610 << 9;
            var8.field1529 = arg7 + var10 << 9;
            var8.field1509 = arg2.field9680;
            var8.field1517 = arg1 + var9 << 9;
            if (arg2.field9630 != null) {
                var8.field1532 = true;
                var8.method885(75);
            }
            if (var8.field1511 != null) {
                var8.field1519 = (int) (Math.random() * (double) (var8.field1508 - var8.field1509)) + var8.field1509;
            }
            class434.field5598.method2087(var8, 72);
        } else if (arg3 != null) {
            var8.field1518 = arg3;
            class699 var11 = arg3.field6914;
            if (var11.field9714 != null) {
                var8.field1532 = true;
                var11 = var11.method3823(class397.field5054, -32574);
            }
            if (var11 != null) {
                var8.field1517 = var11.field9711 + arg1 << 9;
                var8.field1529 = var11.field9711 + arg7 << 9;
                var8.field1525 = class88.method671(arg3, -74);
                var8.field1526 = var11.field9755;
                var8.field1513 = var11.field9725;
                var8.field1510 = var11.field9758 << 9;
            }
            class253.field3444.method2087(var8, 45);
        } else if (arg5 != null) {
            var8.field1512 = arg5;
            var8.field1517 = arg1 + arg5.method1265(86) << 9;
            var8.field1529 = arg7 + arg5.method1265(110) << 9;
            var8.field1525 = class542.method2876(-1, arg5);
            var8.field1510 = arg5.field2483 << 9;
            var8.field1526 = arg5.field2502;
            var8.field1513 = arg5.field2516;
            class145.field1891.method38(var8, -111, (long) arg5.field2960);
            return;
        }
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(I)V")
    public static void method536(int arg0) {
        field865 = null;
        field878 = null;
        field873 = null;
        if (arg0 != -1) {
            method536(-47);
        }
        field882 = null;
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(B)Z")
    public final boolean method537(byte arg0) {
        int var2 = 97 / ((arg0 - 7) / 54);
        field868++;
        return this.field870 == 2 || this.field870 == 3;
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "([Ltc;BIIIZ)V")
    public static final void method538(class477[] arg0, byte arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (arg1 > -100) {
            field877 = -0.23601411F;
        }
        for (int var6 = 0; var6 < arg0.length; var6++) {
            class477 var7 = arg0[var6];
            if (var7 != null && var7.field6292 == arg3) {
                class66.method542(arg4, arg2, arg5, (byte) 111, var7);
                class677.method3723(-1, arg4, arg2, var7);
                if (var7.field6317 > (var7.field6225 - var7.field6372)) {
                    var7.field6317 = var7.field6225 - var7.field6372;
                }
                if (var7.field6252 - var7.field6224 < var7.field6356) {
                    var7.field6356 = var7.field6252 - var7.field6224;
                }
                if (var7.field6317 < 0) {
                    var7.field6317 = 0;
                }
                if (var7.field6356 < 0) {
                    var7.field6356 = 0;
                }
                if (var7.field6312 == 0) {
                    class133.method965(1900077296, arg5, var7);
                }
            }
        }
        field874++;
    }

    @OriginalMember(owner = "client!dl", name = "<init>", descriptor = "(BIIIII)V")
    public class64(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field872 = arg1;
        this.field880 = arg5;
        this.field866 = arg4;
        this.field869 = arg2;
        this.field870 = arg0;
        this.field875 = arg3;
    }

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            long var1 = (long) var0;
            for (int var3 = 0; var3 < 8; var3++) {
                if ((var1 & 0x1L) == 1L) {
                    var1 = var1 >>> 1 ^ 0xC96C5795D7870F42L;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field878[var0] = var1;
        }
    }
}
