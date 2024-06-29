import jaggl.OpenGL;
import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gaa")
public class class432 {

    @OriginalMember(owner = "client!gaa", name = "c", descriptor = "Lmv;")
    public static class297 field5577 = new class297(6, 0, 4, 2);

    @OriginalMember(owner = "client!gaa", name = "a", descriptor = "I")
    public static int field5575;

    @OriginalMember(owner = "client!gaa", name = "b", descriptor = "I")
    public static int field5576;

    @OriginalMember(owner = "client!gaa", name = "d", descriptor = "I")
    public static int field5578;

    @OriginalMember(owner = "client!gaa", name = "e", descriptor = "[[[S")
    public static short[][][] field5579;

    @OriginalMember(owner = "client!gaa", name = "toString", descriptor = "()Ljava/lang/String;", line = 3)
    public final String toString() {
        field5576++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!gaa", name = "a", descriptor = "(Lfd;B)Lqga;", line = 11)
    public static final class41 method2472(class418 arg0, byte arg1) {
        field5575++;
        class562 var2 = class167.method1156(100)[arg0.method2396(-111)];
        class573 var3 = class239.method1507((byte) -37)[arg0.method2396(-113)];
        int var4 = arg0.method2383(65280);
        int var5 = arg0.method2383(65280);
        if (arg1 <= 107) {
            return null;
        }
        int var6 = arg0.method2393(-30727);
        int var7 = arg0.method2393(-30727);
        int var8 = arg0.method2383(65280);
        int var9 = arg0.method2355(99);
        int var10 = arg0.method2355(53);
        return new class41(var2, var3, var4, var5, var6, var7, var8, var9, var10);
    }

    @OriginalMember(owner = "client!gaa", name = "a", descriptor = "(ILe;Ljava/awt/Canvas;ILpe;)Loa;", line = 42)
    public static final class43 method2473(int arg0, class702 arg1, Canvas arg2, int arg3, class615 arg4) {
        field5578++;
        if (!class181.method1205((byte) -28)) {
            throw new RuntimeException("");
        } else if (!client.method709("jaggl", (byte) -93)) {
            throw new RuntimeException("");
        } else if (arg3 == 4) {
            OpenGL var5 = new OpenGL();
            long var6 = var5.init(arg2, 8, 8, 8, 24, 0, arg0);
            if (var6 == 0L) {
                throw new RuntimeException("");
            }
            class27 var8 = new class27(var5, arg2, var6, arg1, arg4, arg0);
            var8.method3095((byte) 17);
            return var8;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!gaa", name = "a", descriptor = "(Z)V", line = 84)
    public static void method2474(boolean arg0) {
        if (!arg0) {
            field5579 = null;
            field5577 = null;
        }
    }

    @OriginalMember(owner = "client!gaa", name = "a", descriptor = "(ZZ)Z", line = 95)
    public static boolean method2475(boolean arg0, boolean arg1) {
        return arg0 | arg1;
    }
}
