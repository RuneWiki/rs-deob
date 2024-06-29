import java.awt.FontMetrics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!r")
public class class32 extends class29 {

    @OriginalMember(owner = "mapview!r", name = "m", descriptor = "Z")
    public static boolean field400 = true;

    @OriginalMember(owner = "mapview!r", name = "t", descriptor = "I")
    public static int field407 = 0;

    @OriginalMember(owner = "mapview!r", name = "n", descriptor = "I")
    public static int field401;

    @OriginalMember(owner = "mapview!r", name = "r", descriptor = "I")
    public static int field405;

    @OriginalMember(owner = "mapview!r", name = "l", descriptor = "J")
    public static long field399;

    @OriginalMember(owner = "mapview!r", name = "s", descriptor = "Lga;")
    public static class12 field406;

    @OriginalMember(owner = "mapview!r", name = "q", descriptor = "Lj;")
    public class17 field404;

    @OriginalMember(owner = "mapview!r", name = "p", descriptor = "Ld;")
    public static class7 field403;

    @OriginalMember(owner = "mapview!r", name = "o", descriptor = "Ljava/awt/FontMetrics;")
    public static FontMetrics field402;

    @OriginalMember(owner = "mapview!r", name = "k", descriptor = "Ljava/lang/String;")
    public static String field398;

    @OriginalMember(owner = "mapview!r", name = "a", descriptor = "(II)I", line = 25)
    public static int method205(int arg0, int arg1) {
        return arg0 & arg1;
    }

    @OriginalMember(owner = "mapview!r", name = "d", descriptor = "(I)V", line = 51)
    public static void method206(int arg0) {
        field398 = null;
        if (arg0 == 0) {
            field403 = null;
            field402 = null;
            field406 = null;
        }
    }

    @OriginalMember(owner = "mapview!r", name = "e", descriptor = "(I)[Lv;", line = 66)
    public static final class36[] method207(int arg0) {
        class36[] var1 = new class36[class16.field254];
        for (int var2 = arg0; var2 < class16.field254; var2++) {
            class36 var3 = var1[var2] = new class36();
            var3.field452 = class12.field229;
            var3.field449 = class1.field69;
            var3.field453 = class1.field68[var2];
            var3.field455 = class29.field375[var2];
            var3.field451 = mapview.field2[var2];
            var3.field456 = class26.field334[var2];
            var3.field454 = class31.field396;
            var3.field450 = class33.field415[var2];
        }
        class3.method28(11793);
        return var1;
    }

    @OriginalMember(owner = "mapview!r", name = "a", descriptor = "([BIII)Lj;", line = 94)
    public static final class17 method208(byte[] arg0, int arg1, int arg2, int arg3) {
        class17 var4 = new class17();
        var4.field268 = arg2;
        var4.field263 = new byte[arg1];
        for (int var5 = arg3; var5 < arg3 + arg1; var5++) {
            if (arg0[var5] != 0) {
                var4.field263[var4.field268++] = arg0[var5];
            }
        }
        return var4;
    }
}
