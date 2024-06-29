import jaggl.OpenGL;
import java.awt.Component;
import java.lang.reflect.Constructor;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aba")
public abstract class class222 implements class238 {

    @OriginalMember(owner = "client!aba", name = "l", descriptor = "Z")
    private boolean field3338 = false;

    @OriginalMember(owner = "client!aba", name = "e", descriptor = "Z")
    private boolean field3331;

    @OriginalMember(owner = "client!aba", name = "n", descriptor = "I")
    public int field3340;

    @OriginalMember(owner = "client!aba", name = "p", descriptor = "I")
    private int field3342;

    @OriginalMember(owner = "client!aba", name = "f", descriptor = "Ljj;")
    public class66 field3332;

    @OriginalMember(owner = "client!aba", name = "u", descriptor = "I")
    public int field3347;

    @OriginalMember(owner = "client!aba", name = "b", descriptor = "I")
    public int field3328;

    @OriginalMember(owner = "client!aba", name = "o", descriptor = "Lbg;")
    public static class340 field3341 = new class340();

    @OriginalMember(owner = "client!aba", name = "v", descriptor = "[I")
    public static int[] field3348 = new int[32];

    @OriginalMember(owner = "client!aba", name = "w", descriptor = "[I")
    public static int[] field3349;

    @OriginalMember(owner = "client!aba", name = "x", descriptor = "I")
    public static int field3350;

    @OriginalMember(owner = "client!aba", name = "a", descriptor = "I")
    public static int field3327;

    @OriginalMember(owner = "client!aba", name = "c", descriptor = "I")
    public static int field3329;

    @OriginalMember(owner = "client!aba", name = "d", descriptor = "I")
    public static int field3330;

    @OriginalMember(owner = "client!aba", name = "g", descriptor = "I")
    public static int field3333;

    @OriginalMember(owner = "client!aba", name = "h", descriptor = "I")
    public static int field3334;

    @OriginalMember(owner = "client!aba", name = "i", descriptor = "I")
    public static int field3335;

    @OriginalMember(owner = "client!aba", name = "j", descriptor = "I")
    public static int field3336;

    @OriginalMember(owner = "client!aba", name = "k", descriptor = "I")
    public static int field3337;

    @OriginalMember(owner = "client!aba", name = "m", descriptor = "I")
    public static int field3339;

    @OriginalMember(owner = "client!aba", name = "q", descriptor = "I")
    public static int field3343;

    @OriginalMember(owner = "client!aba", name = "r", descriptor = "I")
    public static int field3344;

    @OriginalMember(owner = "client!aba", name = "t", descriptor = "I")
    public static int field3346;

    // $FF: synthetic field
    @OriginalMember(owner = "client!aba", name = "y", descriptor = "Ljava/lang/Class;")
    public static Class field3351;

    @OriginalMember(owner = "client!aba", name = "s", descriptor = "[Loh;")
    public static class549[] field3345;

    @OriginalMember(owner = "client!aba", name = "b", descriptor = "(I)Z")
    public final boolean method1479(int arg0) {
        field3337++;
        int var2 = 32 / ((19 - arg0) / 32);
        if (!this.field3332.field1201) {
            return false;
        }
        int var3 = this.method1484((byte) 112);
        this.field3332.method648(94, this);
        OpenGL.glGenerateMipmapEXT(this.field3347);
        this.field3331 = true;
        this.method1491(9729);
        this.method1483(-99, var3);
        return true;
    }

    @OriginalMember(owner = "client!aba", name = "a", descriptor = "(BII)Z")
    public static final boolean method1480(byte arg0, int arg1, int arg2) {
        if (arg0 != -43) {
            field3349 = null;
        }
        field3343++;
        return class161.method1132((byte) -22, arg1, arg2) || class36.method321(386342943, arg1, arg2);
    }

    @OriginalMember(owner = "client!aba", name = "a", descriptor = "(B)I")
    public final int method1481(byte arg0) {
        field3330++;
        return arg0 == 98 ? this.field3328 : 101;
    }

    @OriginalMember(owner = "client!aba", name = "b", descriptor = "(B)V")
    public final void method1482(byte arg0) {
        field3339++;
        if (this.field3328 > 0) {
            this.field3332.method619(this.method1484((byte) 111), (byte) -9, this.field3328);
            this.field3328 = 0;
        }
        if (arg0 != -77) {
            this.field3331 = false;
        }
    }

    @OriginalMember(owner = "client!aba", name = "a", descriptor = "(II)V")
    private final void method1483(int arg0, int arg1) {
        this.field3332.field1149 -= arg1;
        field3333++;
        this.field3332.field1149 += this.method1484((byte) 106);
        if (arg0 > -98) {
            this.method1487(-120, false);
        }
    }

    @OriginalMember(owner = "client!aba", name = "c", descriptor = "(B)I")
    private final int method1484(byte arg0) {
        field3335++;
        if (arg0 < 59) {
            field3341 = null;
        }
        int var2 = this.field3332.method646(this.field3340, false) * this.field3342;
        return this.field3331 ? var2 * 4 / 3 : var2;
    }

    @OriginalMember(owner = "client!aba", name = "a", descriptor = "(IIILjava/lang/Class;)V")
    public static final void method1485(int arg0, int arg1, int arg2, Class arg3) {
        class184 var4 = class277.field4051[arg0][arg1][arg2];
        if (var4 == null) {
            return;
        }
        for (class277 var5 = var4.field2675; var5 != null; var5 = var5.field4045) {
            class360 var6 = var5.field4044;
            if (arg3.isAssignableFrom(var6.getClass()) && var6.field5117 == arg1 && var6.field5113 == arg2) {
                class321.method2001(var6);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!aba", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        this.method1482((byte) -77);
        field3329++;
        super.finalize();
    }

    @OriginalMember(owner = "client!aba", name = "a", descriptor = "(Ljava/awt/Component;IZ)Lnu;")
    public static final class324 method1486(Component arg0, int arg1, boolean arg2) {
        if (arg1 != 9728) {
            method1489(-20);
        }
        field3336++;
        try {
            Constructor var3 = Class.forName("uc").getDeclaredConstructor(field3351 == null ? (field3351 = method1493("java.awt.Component")) : field3351, Boolean.TYPE);
            return (class324) var3.newInstance(arg0, Boolean.valueOf(arg2));
        } catch (Throwable var4) {
            return new class369(arg0, arg2);
        }
    }

    @OriginalMember(owner = "client!aba", name = "a", descriptor = "(IZ)V")
    public final void method1487(int arg0, boolean arg1) {
        field3346++;
        if (this.field3331 != arg1) {
            int var3 = this.method1484((byte) 123);
            this.field3331 = true;
            this.method1491(9729);
            this.method1483(-125, var3);
        }
        if (arg0 < 67) {
            this.field3338 = false;
        }
    }

    @OriginalMember(owner = "client!aba", name = "d", descriptor = "(B)V")
    public static final void method1488(byte arg0) {
        class302.method1887((byte) -74);
        field3344++;
        class134.method1030(class202.field2854.field7916, 22050, 2, false);
        int var1 = -122 % ((19 - arg0) / 38);
        class127.field2087 = class407.method2473(22050, 0, class270.field3976, class474.field6795, 16384);
        class127.field2087.method2072((byte) -75, class483.field6849);
        class384.field5706 = class407.method2473(2048, 1, class270.field3976, class474.field6795, 16384);
        class384.field5706.method2072((byte) -75, class35.field485);
    }

    @OriginalMember(owner = "client!aba", name = "c", descriptor = "(I)V")
    public static void method1489(int arg0) {
        field3345 = null;
        field3341 = null;
        field3349 = null;
        field3348 = null;
        if (arg0 > -112) {
            method1486(null, 111, false);
        }
    }

    @OriginalMember(owner = "client!aba", name = "a", descriptor = "(BZ)V")
    public final void method1490(byte arg0, boolean arg1) {
        if (arg1 != this.field3338) {
            this.field3338 = arg1;
            this.method1491(9729);
        }
        if (arg0 < 67) {
            this.method1484((byte) -55);
        }
        field3334++;
    }

    @OriginalMember(owner = "client!aba", name = "<init>", descriptor = "(Ljj;IIIZ)V")
    public class222(class66 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.field3331 = arg4;
        this.field3340 = arg2;
        this.field3342 = arg3;
        this.field3332 = arg0;
        this.field3347 = arg1;
        OpenGL.glGenTextures(1, class616.field8723, 0);
        this.field3328 = class616.field8723[0];
        this.method1483(-121, 0);
    }

    @OriginalMember(owner = "client!aba", name = "d", descriptor = "(I)V")
    private final void method1491(int arg0) {
        this.field3332.method648(115, this);
        field3327++;
        if (this.field3338) {
            OpenGL.glTexParameteri(this.field3347, 10241, this.field3331 ? 9987 : 9729);
            OpenGL.glTexParameteri(this.field3347, 10240, 9729);
        } else {
            OpenGL.glTexParameteri(this.field3347, 10241, this.field3331 ? 9984 : 9728);
            OpenGL.glTexParameteri(this.field3347, 10240, 9728);
        }
        if (arg0 != 9729) {
            this.field3340 = -37;
        }
    }

    @OriginalMember(owner = "client!aba", name = "a", descriptor = "(I)V")
    public abstract void method1492(int arg0);

    // $FF: synthetic method
    @OriginalMember(owner = "client!aba", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method1493(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field3348[var1] = var0 - 1;
            var0 += var0;
        }
        field3349 = new int[] { 1, 4 };
        field3350 = 0;
    }
}
