import jaggl.OpenGL;
import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aa")
public class class103 extends class329 {

    @OriginalMember(owner = "client!aa", name = "m", descriptor = "Ljava/lang/String;")
    public String field1388;

    @OriginalMember(owner = "client!aa", name = "n", descriptor = "I")
    public static int field1389 = 0;

    @OriginalMember(owner = "client!aa", name = "l", descriptor = "Lwp;")
    public static class453 field1387 = new class453(113, 1);

    @OriginalMember(owner = "client!aa", name = "k", descriptor = "I")
    public static int field1386;

    @OriginalMember(owner = "client!aa", name = "o", descriptor = "[[Lkp;")
    public static class507[][] field1390;

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(I)V")
    public static void method588(int arg0) {
        if (arg0 != 0) {
            method589(null, null, 68, (byte) 30, null);
        }
        field1387 = null;
        field1390 = null;
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(Lfa;Ljava/awt/Canvas;IBLpl;)Lr;")
    public static final class566 method589(class526 arg0, Canvas arg1, int arg2, byte arg3, class612 arg4) {
        if (arg3 > -6) {
            return null;
        }
        field1386++;
        if (!class236.method1420(false)) {
            throw new RuntimeException("");
        } else if (class496.method2671("jaggl", -84)) {
            OpenGL var5 = new OpenGL();
            long var6 = var5.init(arg1, 8, 8, 8, 24, 0, arg2);
            if (var6 == 0L) {
                throw new RuntimeException("");
            }
            class337 var8 = new class337(var5, arg1, var6, arg0, arg4, arg2);
            var8.method2585((byte) -100);
            return var8;
        } else {
            throw new RuntimeException("");
        }
    }

    @OriginalMember(owner = "client!aa", name = "<init>", descriptor = "()V")
    public class103() {
    }

    @OriginalMember(owner = "client!aa", name = "<init>", descriptor = "(Ljava/lang/String;)V")
    public class103(String arg0) {
        this.field1388 = arg0;
    }
}
