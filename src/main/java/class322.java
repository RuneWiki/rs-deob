import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cn")
public class class322 extends class254 {

    @OriginalMember(owner = "client!cn", name = "w", descriptor = "I")
    private int field4718 = -1;

    @OriginalMember(owner = "client!cn", name = "B", descriptor = "I")
    private int field4723 = -1;

    @OriginalMember(owner = "client!cn", name = "u", descriptor = "I")
    public int field4716;

    @OriginalMember(owner = "client!cn", name = "y", descriptor = "Lnd;")
    public static class409 field4720 = new class409("LIVE", 0);

    @OriginalMember(owner = "client!cn", name = "A", descriptor = "Ltk;")
    public static class73 field4722 = new class73();

    @OriginalMember(owner = "client!cn", name = "C", descriptor = "Lcb;")
    public static class318 field4724 = new class318(95, -2);

    @OriginalMember(owner = "client!cn", name = "D", descriptor = "Ljj;")
    public static class398 field4725 = new class398(45, 2);

    @OriginalMember(owner = "client!cn", name = "v", descriptor = "I")
    public static int field4717;

    @OriginalMember(owner = "client!cn", name = "x", descriptor = "I")
    public static int field4719;

    @OriginalMember(owner = "client!cn", name = "z", descriptor = "I")
    public static int field4721;

    @OriginalMember(owner = "client!cn", name = "<init>", descriptor = "(Lpea;IIZ[[BI)V", line = 3)
    public class322(class641 arg0, int arg1, int arg2, boolean arg3, byte[][] arg4, int arg5) {
        super(arg0, 34067, arg1, arg2 * arg2 * 6, arg3);
        this.field4716 = arg2;
        super.field3510.method3553((byte) 47, this);
        for (int var7 = 0; ~var7 > -7; ++var7) {
            OpenGL.glTexImage2Dub(34069 - -var7, 0, super.field3502, arg2, arg2, 0, arg5, 5121, arg4[var7], 0);
        }
        this.method1592(124, true);
    }

    @OriginalMember(owner = "client!cn", name = "c", descriptor = "(I)V", line = 22)
    public static void method2077(int arg0) {
        field4722 = null;
        if (arg0 != -1) {
            method2077(101);
        }
        field4724 = null;
        field4720 = null;
        field4725 = null;
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(I)V", line = 36)
    public final void method545(int arg0) {
        ++field4721;
        OpenGL.glFramebufferTexture2DEXT(this.field4723, this.field4718, 3553, 0, 0);
        this.field4723 = -1;
        this.field4718 = -1;
        int var2 = -115 / ((arg0 - -59) / 52);
    }

    @OriginalMember(owner = "client!cn", name = "<init>", descriptor = "(Lpea;II)V", line = 50)
    public class322(class641 arg0, int arg1, int arg2) {
        super(arg0, 34067, arg1, arg2 * 6 * arg2, false);
        this.field4716 = arg2;
        super.field3510.method3553((byte) -113, this);
        for (int var4 = 0; var4 < 6; ++var4) {
            OpenGL.glTexImage2Dub(34069 - -var4, 0, super.field3502, arg2, arg2, 0, class465.method2634(true, super.field3502), 5121, (byte[]) null, 0);
        }
        this.method1592(99, true);
    }

    @OriginalMember(owner = "client!cn", name = "<init>", descriptor = "(Lpea;IIZ[[I)V", line = 96)
    public class322(class641 arg0, int arg1, int arg2, boolean arg3, int[][] arg4) {
        super(arg0, 34067, arg1, arg2 * 6 * arg2, arg3);
        this.field4716 = arg2;
        super.field3510.method3553((byte) 72, this);
        if (!arg3) {
            for (int var6 = 0; ~var6 > -7; ++var6) {
                OpenGL.glTexImage2Di(34069 - -var6, 0, super.field3502, arg2, arg2, 0, 32993, super.field3510.field8997, arg4[var6], 0);
            }
        } else {
            for (int var7 = 0; ~var7 > -7; ++var7) {
                class596.method3305((byte) 67, arg2, super.field3502, var7 + 34069, super.field3510.field8997, 32993, arg2, arg4[var7]);
            }
        }
        this.method1592(118, true);
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(ZIIII)V", line = 73)
    public final void method2078(boolean arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0) {
            this.field4718 = 75;
        }
        ++field4717;
        OpenGL.glFramebufferTexture2DEXT(arg3, arg4, arg1, super.field3513, arg2);
        this.field4718 = arg4;
        this.field4723 = arg3;
    }
}
