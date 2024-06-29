import jaggl.OpenGL;
import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sb")
public class class290 extends class715 {

    @OriginalMember(owner = "client!sb", name = "q", descriptor = "Z")
    public static boolean field4077 = false;

    @OriginalMember(owner = "client!sb", name = "m", descriptor = "I")
    public static int field4073;

    @OriginalMember(owner = "client!sb", name = "n", descriptor = "I")
    public static int field4074;

    @OriginalMember(owner = "client!sb", name = "o", descriptor = "I")
    public static int field4075;

    @OriginalMember(owner = "client!sb", name = "p", descriptor = "I")
    public static int field4076;

    @OriginalMember(owner = "client!sb", name = "r", descriptor = "I")
    public static int field4078;

    @OriginalMember(owner = "client!sb", name = "s", descriptor = "I")
    public static int field4079;

    @OriginalMember(owner = "client!sb", name = "t", descriptor = "I")
    public static int field4080;

    @OriginalMember(owner = "client!sb", name = "u", descriptor = "I")
    public static int field4081;

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(III)V")
    public final void method687(int arg0, int arg1, int arg2) {
        if (arg1 != 1782) {
            field4077 = false;
        }
        ++field4075;
    }

    @OriginalMember(owner = "client!sb", name = "c", descriptor = "(I)V")
    public final void method689(int arg0) {
        super.field9979.method2751(8, false);
        ++field4074;
        int var2 = -70 % ((-71 - arg0) / 42);
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(B)Z")
    public final boolean method690(byte arg0) {
        if (arg0 != -3) {
            this.method686((byte) -45, false);
        }
        ++field4081;
        return true;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(IBLeq;Ld;Ljava/awt/Canvas;)Lha;")
    public static final class58 method1872(int arg0, byte arg1, class209 arg2, class149 arg3, Canvas arg4) {
        ++field4073;
        if (!class591.method3393((byte) 7)) {
            throw new RuntimeException("");
        } else if (!class96.method870(arg1 ^ 67, "jaggl")) {
            throw new RuntimeException("");
        } else {
            OpenGL var5 = new OpenGL();
            if (arg1 != 67) {
                method1872(-109, (byte) 101, (class209) null, (class149) null, (Canvas) null);
            }
            long var6 = var5.init(arg4, 8, 8, 8, 24, 0, arg0);
            if (var6 == 0L) {
                throw new RuntimeException("");
            } else {
                class132 var8 = new class132(var5, arg4, var6, arg3, arg2, arg0);
                var8.method2776(arg1 ^ 62);
                return var8;
            }
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(ILdu;I)V")
    public final void method693(int arg0, class355 arg1, int arg2) {
        super.field9979.method2732(-54, arg1);
        ++field4079;
        super.field9979.method2721(arg2, true);
        int var4 = 95 / ((arg0 - 31) / 50);
    }

    @OriginalMember(owner = "client!sb", name = "<init>", descriptor = "(Lgt;)V")
    public class290(class453 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(BZ)V")
    public final void method686(byte arg0, boolean arg1) {
        if (arg0 > -105) {
            method1872(111, (byte) 117, (class209) null, (class149) null, (Canvas) null);
        }
        ++field4076;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(ZI)V")
    public final void method691(boolean arg0, int arg1) {
        ++field4078;
        super.field9979.method2751(8, true);
        if (arg1 != 4) {
            field4080 = 105;
        }
    }
}
