import java.awt.Component;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ud")
public class class188 {

    @OriginalMember(owner = "client!ud", name = "c", descriptor = "I")
    public int field3734 = -1;

    @OriginalMember(owner = "client!ud", name = "d", descriptor = "Lrf;")
    public static class163 field3735 = class53.method392(-53, "Wordpack geladen)3");

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "I")
    public static int field3732 = 0;

    @OriginalMember(owner = "client!ud", name = "j", descriptor = "[J")
    public static long[] field3741 = new long[500];

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "Z")
    public static boolean field3733 = false;

    @OriginalMember(owner = "client!ud", name = "f", descriptor = "Lrf;")
    public static class163 field3737 = class53.method392(-113, "mapscene");

    @OriginalMember(owner = "client!ud", name = "i", descriptor = "Lrf;")
    public static class163 field3740 = class53.method392(100, "headicons_prayer");

    @OriginalMember(owner = "client!ud", name = "o", descriptor = "[I")
    public static int[] field3746 = new int[50];

    @OriginalMember(owner = "client!ud", name = "e", descriptor = "I")
    public static int field3736;

    @OriginalMember(owner = "client!ud", name = "h", descriptor = "I")
    public static int field3739;

    @OriginalMember(owner = "client!ud", name = "l", descriptor = "I")
    public static int field3743;

    @OriginalMember(owner = "client!ud", name = "n", descriptor = "I")
    public static int field3745;

    @OriginalMember(owner = "client!ud", name = "g", descriptor = "Lqa;")
    public class149 field3738;

    @OriginalMember(owner = "client!ud", name = "m", descriptor = "[I")
    public int[] field3744;

    @OriginalMember(owner = "client!ud", name = "k", descriptor = "[Lrf;")
    public class163[] field3742;

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(B)V")
    public static final void method1266(byte arg0) {
        field3745++;
        if (arg0 != -7) {
            return;
        }
        while (true) {
            class5 var1 = class96.field2046;
            class82 var2;
            synchronized (class96.field2046) {
                var2 = (class82) class37.field748.method45(0);
            }
            if (var2 == null) {
                return;
            }
            var2.field1654.method1274(var2.field1663, var2.field1657, -3, (int) var2.field1950, false);
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(Ljava/awt/Component;B)V")
    public static final void method1267(Component arg0, byte arg1) {
        Method var2 = class67.field1412;
        if (var2 != null) {
            try {
                var2.invoke(arg0, Boolean.FALSE);
            } catch (Throwable var4) {
            }
        }
        arg0.addKeyListener(class175.field3528);
        int var3 = -77 / ((arg1 + 36) / 50);
        field3743++;
        arg0.addFocusListener(class175.field3528);
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(IIIIIIIB)V")
    public static final void method1268(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte arg7) {
        field3739++;
        if (class114.method781(arg2, (byte) -128)) {
            if (arg7 != 106) {
                method1268(8, 55, -128, 28, -45, 65, 124, (byte) -79);
            }
            class36.method230(arg7 ^ 0xFFFFFF94, arg0, arg5, arg3, arg1, -1, class84.field1798[arg2], arg4, arg6);
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(I)V")
    public static void method1269(int arg0) {
        if (arg0 >= -80) {
            method1268(-23, 29, -33, 91, -125, -36, -24, (byte) -123);
        }
        field3735 = null;
        field3746 = null;
        field3741 = null;
        field3740 = null;
        field3737 = null;
    }
}
