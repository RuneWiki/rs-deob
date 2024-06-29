import jaggl.OpenGL;
import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wr")
public class class96 implements class496 {

    @OriginalMember(owner = "client!wr", name = "i", descriptor = "Lae;")
    private class283 field1130;

    @OriginalMember(owner = "client!wr", name = "c", descriptor = "Ljava/lang/String;")
    private String field1124;

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "I")
    public static int field1122;

    @OriginalMember(owner = "client!wr", name = "b", descriptor = "I")
    public static int field1123;

    @OriginalMember(owner = "client!wr", name = "d", descriptor = "I")
    public static int field1125;

    @OriginalMember(owner = "client!wr", name = "e", descriptor = "I")
    public static int field1126;

    @OriginalMember(owner = "client!wr", name = "g", descriptor = "I")
    public static int field1128;

    @OriginalMember(owner = "client!wr", name = "h", descriptor = "I")
    public static int field1129;

    @OriginalMember(owner = "client!wr", name = "f", descriptor = "Lmia;")
    public static class684 field1127;

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(B)I")
    public final int method690(byte arg0) {
        field1123++;
        if (arg0 > -7) {
            this.field1124 = null;
        }
        return this.field1130.method1837((byte) -99, this.field1124) ? 100 : this.field1130.method1868(0, this.field1124);
    }

    @OriginalMember(owner = "client!wr", name = "b", descriptor = "(I)V")
    public static void method691(int arg0) {
        field1127 = null;
        if (arg0 != 18) {
            method692(-126, 115, true, -11, 102);
        }
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(IIZII)V")
    public static final void method692(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
        if (arg2) {
            field1127 = null;
        }
        field1126++;
        class17 var5 = class245.method1634(1, (long) arg1 << 32 | (long) arg0, 18);
        var5.method66((byte) 120);
        var5.field104 = arg4;
        var5.field107 = arg3;
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(I)Ljea;")
    public final class248 method693(int arg0) {
        if (arg0 <= 103) {
            return null;
        } else {
            field1125++;
            return class248.field3693;
        }
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(BLd;Ljava/awt/Canvas;Lae;I)Lha;")
    public static final class473 method694(byte arg0, class101 arg1, Canvas arg2, class283 arg3, int arg4) {
        field1129++;
        if (!class68.method523(-457)) {
            throw new RuntimeException("");
        } else if (class161.method1027(38, "jaggl")) {
            OpenGL var5 = new OpenGL();
            long var6 = var5.init(arg2, 8, 8, 8, 24, 0, arg4);
            if (var6 == 0L) {
                throw new RuntimeException("");
            } else if (arg0 <= 125) {
                return null;
            } else {
                class556 var8 = new class556(var5, arg2, var6, arg1, arg3, arg4);
                var8.method1383(119);
                return var8;
            }
        } else {
            throw new RuntimeException("");
        }
    }

    @OriginalMember(owner = "client!wr", name = "<init>", descriptor = "(Lae;Ljava/lang/String;)V")
    public class96(class283 arg0, String arg1) {
        this.field1130 = arg0;
        this.field1124 = arg1;
    }
}
