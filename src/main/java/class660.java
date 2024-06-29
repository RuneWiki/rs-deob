import jaggl.OpenGL;
import java.awt.Font;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gfa")
public class class660 extends class710 {

    @OriginalMember(owner = "client!gfa", name = "w", descriptor = "I")
    private int field9199 = -1;

    @OriginalMember(owner = "client!gfa", name = "y", descriptor = "I")
    private int field9201 = -1;

    @OriginalMember(owner = "client!gfa", name = "z", descriptor = "I")
    public int field9202;

    @OriginalMember(owner = "client!gfa", name = "A", descriptor = "[I")
    public static int[] field9203 = new int[8];

    @OriginalMember(owner = "client!gfa", name = "u", descriptor = "Lnj;")
    public static class415 field9197 = new class415(83, 4);

    @OriginalMember(owner = "client!gfa", name = "C", descriptor = "I")
    public static int field9205 = -1;

    @OriginalMember(owner = "client!gfa", name = "v", descriptor = "I")
    public static int field9198;

    @OriginalMember(owner = "client!gfa", name = "B", descriptor = "I")
    public static int field9204;

    @OriginalMember(owner = "client!gfa", name = "x", descriptor = "Ljava/awt/Font;")
    public static Font field9200;

    @OriginalMember(owner = "client!gfa", name = "a", descriptor = "(B)V", line = 3)
    public final void method1502(byte arg0) {
        OpenGL.glFramebufferTexture2DEXT(this.field9201, this.field9199, 3553, 0, 0);
        if (arg0 < 33) {
            method3626(112);
        }
        ++field9198;
        this.field9201 = -1;
        this.field9199 = -1;
    }

    @OriginalMember(owner = "client!gfa", name = "<init>", descriptor = "(Lji;II)V", line = 16)
    public class660(class622 arg0, int arg1, int arg2) {
        super(arg0, 34067, arg1, arg2 * 6 * arg2, false);
        this.field9202 = arg2;
        super.field9933.method3388(this, false);
        for (int var4 = 0; ~var4 > -7; ++var4) {
            OpenGL.glTexImage2Dub(34069 - -var4, 0, super.field9923, arg2, arg2, 0, class149.method1100(super.field9923, 6409), 5121, (byte[]) null, 0);
        }
        this.method3905(true, true);
    }

    @OriginalMember(owner = "client!gfa", name = "d", descriptor = "(I)V", line = 33)
    public static void method3626(int arg0) {
        if (arg0 != 0) {
            field9200 = null;
        }
        field9197 = null;
        field9200 = null;
        field9203 = null;
    }

    @OriginalMember(owner = "client!gfa", name = "a", descriptor = "(IBIII)V", line = 50)
    public final void method3627(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        ++field9204;
        OpenGL.glFramebufferTexture2DEXT(arg0, arg3, arg2, super.field9924, arg4);
        if (arg1 >= -55) {
            this.field9199 = 43;
        }
        this.field9201 = arg0;
        this.field9199 = arg3;
    }

    @OriginalMember(owner = "client!gfa", name = "<init>", descriptor = "(Lji;IIZ[[I)V", line = 63)
    public class660(class622 arg0, int arg1, int arg2, boolean arg3, int[][] arg4) {
        super(arg0, 34067, arg1, arg2 * 6 * arg2, arg3);
        this.field9202 = arg2;
        super.field9933.method3388(this, false);
        if (arg3) {
            for (int var6 = 0; ~var6 > -7; ++var6) {
                class537.method2856(super.field9933.field8676, arg2, var6 + 34069, -123, arg2, arg4[var6], 32993, super.field9923);
            }
        } else {
            for (int var7 = 0; ~var7 > -7; ++var7) {
                OpenGL.glTexImage2Di(var7 + 34069, 0, super.field9923, arg2, arg2, 0, 32993, super.field9933.field8676, arg4[var7], 0);
            }
        }
        this.method3905(true, true);
    }

    @OriginalMember(owner = "client!gfa", name = "<init>", descriptor = "(Lji;IIZ[[BI)V", line = 103)
    public class660(class622 arg0, int arg1, int arg2, boolean arg3, byte[][] arg4, int arg5) {
        super(arg0, 34067, arg1, arg2 * arg2 * 6, arg3);
        this.field9202 = arg2;
        super.field9933.method3388(this, false);
        for (int var7 = 0; var7 < 6; ++var7) {
            OpenGL.glTexImage2Dub(34069 - -var7, 0, super.field9923, arg2, arg2, 0, arg5, 5121, arg4[var7], 0);
        }
        this.method3905(true, true);
    }
}
