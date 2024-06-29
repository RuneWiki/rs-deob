import jaggl.OpenGL;
import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mu")
public class class314 extends class599 {

    @OriginalMember(owner = "client!mu", name = "G", descriptor = "I")
    private int field4657 = -1;

    @OriginalMember(owner = "client!mu", name = "B", descriptor = "I")
    private int field4653 = -1;

    @OriginalMember(owner = "client!mu", name = "A", descriptor = "I")
    public int field4652;

    @OriginalMember(owner = "client!mu", name = "C", descriptor = "Leo;")
    public static class310 field4654 = new class310();

    @OriginalMember(owner = "client!mu", name = "z", descriptor = "I")
    public static int field4651;

    @OriginalMember(owner = "client!mu", name = "E", descriptor = "I")
    public static int field4655;

    @OriginalMember(owner = "client!mu", name = "F", descriptor = "I")
    public static int field4656;

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "(IIIIB)V", line = 4)
    public final void method2039(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        ++field4651;
        OpenGL.glFramebufferTexture2DEXT(arg0, arg2, arg3, super.field8445, arg1);
        this.field4657 = arg0;
        this.field4653 = arg2;
        int var6 = 92 / ((arg4 - 28) / 36);
    }

    @OriginalMember(owner = "client!mu", name = "b", descriptor = "(B)V", line = 19)
    public static void method2040(byte arg0) {
        field4654 = null;
        if (arg0 > -62) {
            method2040((byte) 45);
        }
    }

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "(B)V", line = 29)
    public final void method1255(byte arg0) {
        OpenGL.glFramebufferTexture2DEXT(this.field4657, this.field4653, 3553, 0, 0);
        ++field4656;
        this.field4657 = -1;
        this.field4653 = -1;
        int var2 = -57 % ((-34 - arg0) / 63);
    }

    @OriginalMember(owner = "client!mu", name = "<init>", descriptor = "(Lkv;IIZ[[I)V", line = 41)
    public class314(class280 arg0, int arg1, int arg2, boolean arg3, int[][] arg4) {
        super(arg0, 34067, arg1, arg2 * arg2 * 6, arg3);
        this.field4652 = arg2;
        super.field8449.method1840(this, 2205);
        if (arg3) {
            for (int var6 = 0; var6 < 6; ++var6) {
                class555.method3230(arg4[var6], var6 + 34069, arg2, 32993, arg2, 255, super.field8444, super.field8449.field4273);
            }
        } else {
            for (int var7 = 0; var7 < 6; ++var7) {
                OpenGL.glTexImage2Di(34069 - -var7, 0, super.field8444, arg2, arg2, 0, 32993, super.field8449.field4273, arg4[var7], 0);
            }
        }
        this.method3468(0, true);
    }

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "(Lcb;BLd;Ljava/awt/Canvas;I)Lha;", line = 72)
    public static final class66 method2041(class544 arg0, byte arg1, class159 arg2, Canvas arg3, int arg4) {
        ++field4655;
        if (!class630.method3598((byte) 112)) {
            throw new RuntimeException("");
        } else if (!class291.method1971("jaggl", 0)) {
            throw new RuntimeException("");
        } else {
            OpenGL var5 = new OpenGL();
            long var6 = var5.init(arg3, 8, 8, 8, 24, 0, arg4);
            if (var6 == 0L) {
                throw new RuntimeException("");
            } else {
                class673 var8 = new class673(var5, arg3, var6, arg2, arg0, arg4);
                if (arg1 <= 38) {
                    return null;
                } else {
                    var8.method1053(0);
                    return var8;
                }
            }
        }
    }

    @OriginalMember(owner = "client!mu", name = "<init>", descriptor = "(Lkv;II)V", line = 102)
    public class314(class280 arg0, int arg1, int arg2) {
        super(arg0, 34067, arg1, arg2 * 6 * arg2, false);
        this.field4652 = arg2;
        super.field8449.method1840(this, 2205);
        for (int var4 = 0; var4 < 6; ++var4) {
            OpenGL.glTexImage2Dub(var4 + 34069, 0, super.field8444, arg2, arg2, 0, class422.method2523(super.field8444, 124), 5121, (byte[]) null, 0);
        }
        this.method3468(0, true);
    }

    @OriginalMember(owner = "client!mu", name = "<init>", descriptor = "(Lkv;IIZ[[BI)V", line = 126)
    public class314(class280 arg0, int arg1, int arg2, boolean arg3, byte[][] arg4, int arg5) {
        super(arg0, 34067, arg1, arg2 * arg2 * 6, arg3);
        this.field4652 = arg2;
        super.field8449.method1840(this, 2205);
        for (int var7 = 0; ~var7 > -7; ++var7) {
            OpenGL.glTexImage2Dub(34069 - -var7, 0, super.field8444, arg2, arg2, 0, arg5, 5121, arg4[var7], 0);
        }
        this.method3468(0, true);
    }
}
