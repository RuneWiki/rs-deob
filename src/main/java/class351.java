import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tc")
public class class351 extends class292 {

    @OriginalMember(owner = "client!tc", name = "w", descriptor = "I")
    private int field4521 = -1;

    @OriginalMember(owner = "client!tc", name = "v", descriptor = "I")
    private int field4520 = -1;

    @OriginalMember(owner = "client!tc", name = "t", descriptor = "I")
    public int field4518;

    @OriginalMember(owner = "client!tc", name = "y", descriptor = "Lpia;")
    public static class94 field4523 = new class94(22, 7);

    @OriginalMember(owner = "client!tc", name = "B", descriptor = "I")
    public static int field4526 = 0;

    @OriginalMember(owner = "client!tc", name = "A", descriptor = "Ldh;")
    public static class320 field4525 = new class320(24, -2);

    @OriginalMember(owner = "client!tc", name = "u", descriptor = "I")
    public static int field4519;

    @OriginalMember(owner = "client!tc", name = "x", descriptor = "I")
    public static int field4522;

    @OriginalMember(owner = "client!tc", name = "z", descriptor = "I")
    public static int field4524;

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(I)V", line = 3)
    public final void method66(int arg0) {
        ++field4519;
        OpenGL.glFramebufferTexture2DEXT(this.field4521, this.field4520, 3553, 0, 0);
        this.field4520 = -1;
        this.field4521 = -1;
        int var2 = 109 / ((80 - arg0) / 44);
    }

    @OriginalMember(owner = "client!tc", name = "<init>", descriptor = "(Lnv;II)V", line = 17)
    public class351(class417 arg0, int arg1, int arg2) {
        super(arg0, 34067, arg1, arg2 * arg2 * 6, false);
        this.field4518 = arg2;
        super.field3603.method2621(-2, this);
        for (int var4 = 0; var4 < 6; ++var4) {
            OpenGL.glTexImage2Dub(var4 + 34069, 0, super.field3593, arg2, arg2, 0, class311.method1848(-34845, super.field3593), 5121, (byte[]) null, 0);
        }
        this.method1742(true, 29646);
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(IIIII)V", line = 34)
    public final void method2080(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field4522;
        if (arg1 != 26697) {
            field4524 = -105;
        }
        OpenGL.glFramebufferTexture2DEXT(arg2, arg3, arg4, super.field3589, arg0);
        this.field4520 = arg3;
        this.field4521 = arg2;
    }

    @OriginalMember(owner = "client!tc", name = "e", descriptor = "(I)V", line = 47)
    public static void method2081(int arg0) {
        if (arg0 != 0) {
            method2081(-108);
        }
        field4523 = null;
        field4525 = null;
    }

    @OriginalMember(owner = "client!tc", name = "<init>", descriptor = "(Lnv;IIZ[[I)V", line = 66)
    public class351(class417 arg0, int arg1, int arg2, boolean arg3, int[][] arg4) {
        super(arg0, 34067, arg1, arg2 * arg2 * 6, arg3);
        this.field4518 = arg2;
        super.field3603.method2621(-2, this);
        if (!arg3) {
            for (int var6 = 0; var6 < 6; ++var6) {
                OpenGL.glTexImage2Di(34069 - -var6, 0, super.field3593, arg2, arg2, 0, 32993, super.field3603.field6028, arg4[var6], 0);
            }
        } else {
            for (int var7 = 0; var7 < 6; ++var7) {
                class278.method1676(arg2, super.field3593, arg2, var7 + 34069, 32993, false, super.field3603.field6028, arg4[var7]);
            }
        }
        this.method1742(true, 29646);
    }

    @OriginalMember(owner = "client!tc", name = "<init>", descriptor = "(Lnv;IIZ[[BI)V", line = 105)
    public class351(class417 arg0, int arg1, int arg2, boolean arg3, byte[][] arg4, int arg5) {
        super(arg0, 34067, arg1, arg2 * 6 * arg2, arg3);
        this.field4518 = arg2;
        super.field3603.method2621(-2, this);
        for (int var7 = 0; var7 < 6; ++var7) {
            OpenGL.glTexImage2Dub(var7 + 34069, 0, super.field3593, arg2, arg2, 0, arg5, 5121, arg4[var7], 0);
        }
        this.method1742(true, 29646);
    }
}
