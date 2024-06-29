import java.awt.FontMetrics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ec")
public class class32 extends RuntimeException {

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "Ljava/lang/Throwable;")
    public Throwable field675;

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "Ljava/lang/String;")
    public String field676;

    @OriginalMember(owner = "client!ec", name = "d", descriptor = "[I")
    public static int[] field678 = new int[99];

    @OriginalMember(owner = "client!ec", name = "j", descriptor = "I")
    public static int field684;

    @OriginalMember(owner = "client!ec", name = "l", descriptor = "I")
    public static int field686;

    @OriginalMember(owner = "client!ec", name = "h", descriptor = "Lkc;")
    private static class67 field682;

    @OriginalMember(owner = "client!ec", name = "p", descriptor = "Z")
    public static volatile boolean field690;

    @OriginalMember(owner = "client!ec", name = "n", descriptor = "Lkc;")
    public static class67 field688;

    @OriginalMember(owner = "client!ec", name = "s", descriptor = "[I")
    public static int[] field693;

    @OriginalMember(owner = "client!ec", name = "t", descriptor = "Lkc;")
    public static class67 field694;

    @OriginalMember(owner = "client!ec", name = "c", descriptor = "I")
    public static int field677;

    @OriginalMember(owner = "client!ec", name = "e", descriptor = "I")
    public static int field679;

    @OriginalMember(owner = "client!ec", name = "f", descriptor = "I")
    public static int field680;

    @OriginalMember(owner = "client!ec", name = "g", descriptor = "I")
    public static int field681;

    @OriginalMember(owner = "client!ec", name = "k", descriptor = "I")
    public static int field685;

    @OriginalMember(owner = "client!ec", name = "o", descriptor = "I")
    public static int field689;

    @OriginalMember(owner = "client!ec", name = "r", descriptor = "I")
    public static int field692;

    @OriginalMember(owner = "client!ec", name = "m", descriptor = "Ldf;")
    public static class28 field687;

    @OriginalMember(owner = "client!ec", name = "i", descriptor = "Ljava/awt/FontMetrics;")
    public static FontMetrics field683;

    @OriginalMember(owner = "client!ec", name = "q", descriptor = "[I")
    public static int[] field691;

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 99; var1++) {
            int var2 = var1 + 1;
            int var3 = (int) ((double) var2 + Math.pow(2.0D, (double) var2 / 7.0D) * 300.0D);
            var0 += var3;
            field678[var1] = var0 / 4;
        }
        field684 = 0;
        field686 = 0;
        field682 = class19.method144("Unable to connect)3", 123);
        field690 = false;
        field688 = field682;
        field693 = new int[25];
        field694 = field682;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(Z)V", line = 8)
    public static final void method271(boolean arg0) {
        if (class66.field1543 != null) {
            class60 var1 = class66.field1543;
            synchronized (class66.field1543) {
                class66.field1543 = null;
            }
        }
        field681++;
        if (!arg0) {
            method272(-109);
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(I)V", line = 36)
    public static final void method272(int arg0) {
        class77.field1820.method378((byte) -65);
        field679++;
        class69.field1653.method378((byte) -82);
        if (arg0 == 25) {
            class125.field2913.method378((byte) -99);
            class141.field3387.method378((byte) -98);
        }
    }

    @OriginalMember(owner = "client!ec", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V", line = 58)
    public class32(Throwable arg0, String arg1) {
        this.field675 = arg0;
        this.field676 = arg1;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(III[Led;IIIILed;III)Led;", line = 68)
    public static final class33 method273(int arg0, int arg1, int arg2, class33[] arg3, int arg4, int arg5, int arg6, int arg7, class33 arg8, int arg9, int arg10, int arg11) {
        field680++;
        if (arg10 > arg11 || arg7 < arg0 || arg9 <= arg11 || arg5 <= arg7) {
            return null;
        }
        for (int var12 = 0; var12 < arg3.length; var12++) {
            class33 var13 = arg3[var12];
            if (var13 != null && var13.field719 == arg4 && !class99.method760(18547, var13) && arg8 != var13) {
                int var14 = var13.field813 + arg10 - arg1;
                int var15 = var13.field750 + arg0 - arg2;
                if (var13.field729 == 0) {
                    class33 var16 = method273(var15, var13.field728, var13.field806, arg3, var13.field740, var13.field704 + var15, -128, arg7, arg8, var13.field733 + var14, var14, arg11);
                    if (var16 != null) {
                        return var16;
                    }
                    if (var13.field700 != null) {
                        class33 var17 = method273(var15, var13.field728, var13.field806, var13.field700, var13.field740, var13.field704 + var15, -128, arg7, arg8, var13.field733 + var14, var14, arg11);
                        if (var17 != null) {
                            return var17;
                        }
                    }
                }
                if (class84.method654(0, class83.method649((byte) -102, var13)) && var14 <= arg11 && arg7 >= var15 && var13.field733 + var14 > arg11 && var13.field704 + var15 > arg7) {
                    return var13;
                }
            }
        }
        if (arg6 > -127) {
            field694 = null;
        }
        return null;
    }

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "(I)V", line = 135)
    public static void method274(int arg0) {
        field691 = null;
        field682 = null;
        field694 = null;
        field683 = null;
        field687 = null;
        if (arg0 < 53) {
            field694 = null;
        }
        field693 = null;
        field688 = null;
        field678 = null;
    }
}
