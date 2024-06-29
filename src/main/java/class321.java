import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rb")
public class class321 extends class591 {

    @OriginalMember(owner = "client!rb", name = "z", descriptor = "I")
    private int field4748 = -1;

    @OriginalMember(owner = "client!rb", name = "D", descriptor = "I")
    private int field4752 = -1;

    @OriginalMember(owner = "client!rb", name = "B", descriptor = "I")
    public int field4750;

    @OriginalMember(owner = "client!rb", name = "C", descriptor = "I")
    public int field4751;

    @OriginalMember(owner = "client!rb", name = "E", descriptor = "I")
    public int field4753;

    @OriginalMember(owner = "client!rb", name = "w", descriptor = "I")
    public static int field4745;

    @OriginalMember(owner = "client!rb", name = "x", descriptor = "I")
    public static int field4746;

    @OriginalMember(owner = "client!rb", name = "y", descriptor = "I")
    public static int field4747;

    @OriginalMember(owner = "client!rb", name = "A", descriptor = "I")
    public static int field4749;

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(I)V")
    public final void method1953(int arg0) {
        ++field4749;
        OpenGL.glFramebufferTexture3DEXT(this.field4752, this.field4748, super.field8241, 0, 0, 0);
        this.field4748 = -1;
        this.field4752 = arg0;
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(ILfaa;BI)V")
    public static final void method1954(int arg0, class140 arg1, byte arg2, int arg3) {
        if (arg2 >= -8) {
            method1954(78, (class140) null, (byte) -97, -64);
        }
        ++field4746;
        class212 var4 = arg1.method999((byte) -72, class630.field8790);
        if (var4 != null) {
            class630.field8790.method442(arg3, arg0, arg1.field2121 + arg3, arg1.field2082 + arg0);
            if (class124.field1722 >= 3) {
                class630.field8790.method425(-16777216, var4, arg3, arg0);
            } else {
                class687.field9666.method2657((float) arg1.field2121 / 2.0F + (float) arg3, (float) arg1.field2082 / 2.0F + (float) arg0, 4096, 65532 & (int) (-class646.field9167) << 2, var4, arg3, arg0);
            }
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(IIIZIIII)V")
    public final void method1955(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6, int arg7) {
        super.field8237.method1804(arg3, this);
        ++field4745;
        OpenGL.glCopyTexSubImage3D(super.field8241, 0, arg5, arg4, arg2, arg0, arg6, arg1, arg7);
        OpenGL.glFlush();
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(Lbt;)V")
    public static final void method1956(class39 arg0) {
        for (int var1 = arg0.field517; var1 <= arg0.field516; ++var1) {
            for (int var2 = arg0.field512; var2 <= arg0.field519; ++var2) {
                class486 var3 = class658.field9266[arg0.field520][var1][var2];
                if (var3 != null) {
                    class20 var4 = var3.field6751;
                    class20 var5 = null;
                    while (var4 != null) {
                        if (var4.field281 == arg0) {
                            if (var5 != null) {
                                var5.field284 = var4.field284;
                            } else {
                                var3.field6751 = var4.field284;
                            }
                            var4.method103(-128);
                            break;
                        }
                        var5 = var4;
                        var4 = var4.field284;
                    }
                    var3.field6733 = 0;
                    for (class20 var6 = var3.field6751; var6 != null; var6 = var6.field284) {
                        var3.field6733 = (byte) (var3.field6733 | var6.field286);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!rb", name = "<init>", descriptor = "(Len;IIII[BI)V")
    public class321(class289 arg0, int arg1, int arg2, int arg3, int arg4, byte[] arg5, int arg6) {
        super(arg0, 32879, arg1, arg2 * arg4 * arg3, false);
        this.field4750 = arg4;
        this.field4751 = arg2;
        this.field4753 = arg3;
        super.field8237.method1804(false, this);
        OpenGL.glPixelStorei(3317, 1);
        OpenGL.glTexImage3Dub(super.field8241, 0, super.field8226, this.field4751, this.field4753, this.field4750, 0, arg6, 5121, arg5, 0);
        OpenGL.glPixelStorei(3317, 4);
        this.method3288(0, true);
    }

    @OriginalMember(owner = "client!rb", name = "<init>", descriptor = "(Len;IIII)V")
    public class321(class289 arg0, int arg1, int arg2, int arg3, int arg4) {
        super(arg0, 32879, arg1, arg3 * arg4 * arg2, false);
        this.field4751 = arg2;
        this.field4753 = arg3;
        this.field4750 = arg4;
        super.field8237.method1804(false, this);
        OpenGL.glTexImage3Dub(super.field8241, 0, super.field8226, this.field4751, this.field4753, this.field4750, 0, class448.method2575((byte) -87, super.field8226), 5121, (byte[]) null, 0);
        this.method3288(0, true);
    }
}
