import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ao")
public class class191 {

    @OriginalMember(owner = "client!ao", name = "e", descriptor = "I")
    public int field2462;

    @OriginalMember(owner = "client!ao", name = "c", descriptor = "I")
    private int field2460;

    @OriginalMember(owner = "client!ao", name = "f", descriptor = "I")
    public static int field2463 = 0;

    @OriginalMember(owner = "client!ao", name = "h", descriptor = "Ljava/lang/String;")
    public static String field2465 = null;

    @OriginalMember(owner = "client!ao", name = "d", descriptor = "Lao;")
    public static class191 field2461 = new class191(85, 2);

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "I")
    public static int field2458;

    @OriginalMember(owner = "client!ao", name = "b", descriptor = "I")
    public static int field2459;

    @OriginalMember(owner = "client!ao", name = "g", descriptor = "I")
    public static int field2464;

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(I)V", line = 6)
    public static void method1089(int arg0) {
        field2461 = null;
        if (arg0 != 2) {
            method1089(-67);
        }
        field2465 = null;
    }

    @OriginalMember(owner = "client!ao", name = "b", descriptor = "(I)I", line = 21)
    public final int method1090(int arg0) {
        if (arg0 != 2) {
            method1091(null, -12, -17, -22, 118, (byte) -51);
        }
        field2458++;
        return this.field2460;
    }

    @OriginalMember(owner = "client!ao", name = "<init>", descriptor = "(II)V", line = 31)
    public class191(int arg0, int arg1) {
        this.field2462 = arg1;
        this.field2460 = arg0;
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(Lfq;IIIIB)Ljava/awt/Frame;", line = 40)
    public static final Frame method1091(class137 arg0, int arg1, int arg2, int arg3, int arg4, byte arg5) {
        field2459++;
        if (!arg0.method842(false)) {
            return null;
        }
        if (arg4 == 0) {
            class459[] var6 = class223.method1405((byte) 122, arg0);
            if (var6 == null) {
                return null;
            }
            boolean var7 = false;
            for (int var8 = 0; var8 < var6.length; var8++) {
                if (var6[var8].field6842 == arg2 && var6[var8].field6845 == arg3 && (arg1 == 0 || var6[var8].field6843 == arg1) && (!var7 || var6[var8].field6839 > arg4)) {
                    var7 = true;
                    arg4 = var6[var8].field6839;
                }
            }
            if (!var7) {
                return null;
            }
        }
        if (arg5 < 121) {
            method1091(null, 111, -62, -44, 115, (byte) -89);
        }
        class236 var9 = arg0.method841(arg4, arg3, 99, arg2, arg1);
        while (var9.field3149 == 0) {
            class316.method1873(10L, false);
        }
        Frame var10 = (Frame) var9.field3151;
        if (var10 == null) {
            return null;
        } else if (var9.field3149 == 2) {
            class116.method697((byte) 116, var10, arg0);
            return null;
        } else {
            return var10;
        }
    }

    @OriginalMember(owner = "client!ao", name = "toString", descriptor = "()Ljava/lang/String;", line = 109)
    public final String toString() {
        field2464++;
        throw new IllegalStateException();
    }
}
