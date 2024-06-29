import java.awt.Canvas;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!g")
public class class156 {

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(Ljava/awt/Canvas;Lvd;Ld;II)Lha;")
    public static final class60 method1156(Canvas arg0, class39 arg1, class151 arg2, int arg3, int arg4) {
        int var5 = 77 % ((39 - arg4) / 34);
        try {
            if (!class648.method3768(12)) {
                throw new RuntimeException("");
            } else if (class383.method2462((byte) 117, "jagdx")) {
                Class var6 = Class.forName("fi");
                Method var7 = var6.getDeclaredMethod("createToolkit", Class.forName("java.awt.Canvas"), Class.forName("d"), Class.forName("vd"), Class.forName("java.lang.Integer"));
                return (class60) var7.invoke(null, arg0, arg2, arg1, Integer.valueOf(arg3));
            } else {
                throw new RuntimeException("");
            }
        } catch (Throwable var9) {
            throw new RuntimeException("");
        }
    }
}
