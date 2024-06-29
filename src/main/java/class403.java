import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nm")
public class class403 extends class418 {

    @OriginalMember(owner = "client!nm", name = "v", descriptor = "I")
    private int field5728 = -1;

    @OriginalMember(owner = "client!nm", name = "D", descriptor = "I")
    private int field5736 = -1;

    @OriginalMember(owner = "client!nm", name = "A", descriptor = "I")
    public int field5733;

    @OriginalMember(owner = "client!nm", name = "y", descriptor = "[I")
    public static int[] field5731 = new int[] { -1, -1, 1, 1 };

    @OriginalMember(owner = "client!nm", name = "E", descriptor = "I")
    public static int field5737 = 1407;

    @OriginalMember(owner = "client!nm", name = "x", descriptor = "I")
    public static int field5730 = 0;

    @OriginalMember(owner = "client!nm", name = "w", descriptor = "I")
    public static int field5729;

    @OriginalMember(owner = "client!nm", name = "z", descriptor = "I")
    public static int field5732;

    @OriginalMember(owner = "client!nm", name = "B", descriptor = "I")
    public static int field5734;

    @OriginalMember(owner = "client!nm", name = "C", descriptor = "I")
    public static int field5735;

    @OriginalMember(owner = "client!nm", name = "c", descriptor = "(I)V")
    public static void method2405(int arg0) {
        if (arg0 != -1) {
            field5730 = 70;
        }
        field5731 = null;
    }

    @OriginalMember(owner = "client!nm", name = "<init>", descriptor = "(Lgi;IIZ[[BI)V")
    public class403(class583 arg0, int arg1, int arg2, boolean arg3, byte[][] arg4, int arg5) {
        super(arg0, 34067, arg1, arg2 * arg2 * 6, arg3);
        this.field5733 = arg2;
        super.field5883.method3358(32886, this);
        for (int var7 = 0; ~var7 > -7; ++var7) {
            OpenGL.glTexImage2Dub(34069 - -var7, 0, super.field5889, arg2, arg2, 0, arg5, 5121, arg4[var7], 0);
        }
        this.method2513(false, true);
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(ZBLjava/lang/String;Ljava/lang/String;)V")
    public static final void method2406(boolean arg0, byte arg1, String arg2, String arg3) {
        class205.field2891 = arg0;
        ++field5735;
        if (arg1 < 78) {
            method2406(true, (byte) 13, (String) null, (String) null);
        }
        class146.field2257 = arg3;
        class636.field9276 = arg2;
        if (class205.field2891 || class40.field797 == 3 || !class146.field2257.equals("") && !class636.field9276.equals("")) {
            if (class40.field797 != 1) {
                class304.field4150 = 0;
                class228.field3260 = -1;
            }
            class143.field2204 = false;
            class464.method2712(-3, (byte) -66);
            class385.field5163 = 0;
            class348.field4669 = 1;
            class369.field5012 = 0;
        } else {
            class464.method2712(3, (byte) -66);
        }
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(Lmc;I)V")
    public static final void method2407(class114 arg0, int arg1) {
        if (arg1 != -9130) {
            field5731 = null;
        }
        if (~class233.field3287 == ~arg0.field1871) {
            class48.field940[arg0.field1768] = true;
        }
        ++field5732;
    }

    @OriginalMember(owner = "client!nm", name = "<init>", descriptor = "(Lgi;IIZ[[I)V")
    public class403(class583 arg0, int arg1, int arg2, boolean arg3, int[][] arg4) {
        super(arg0, 34067, arg1, arg2 * 6 * arg2, arg3);
        this.field5733 = arg2;
        super.field5883.method3358(32886, this);
        if (arg3) {
            for (int var6 = 0; ~var6 > -7; ++var6) {
                class5.method34(super.field5883.field8279, arg2, 32993, super.field5889, 34069 - -var6, 25951, arg2, arg4[var6]);
            }
        } else {
            for (int var7 = 0; ~var7 > -7; ++var7) {
                OpenGL.glTexImage2Di(var7 + 34069, 0, super.field5889, arg2, arg2, 0, 32993, super.field5883.field8279, arg4[var7], 0);
            }
        }
        this.method2513(false, true);
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(B)V")
    public final void method1220(byte arg0) {
        OpenGL.glFramebufferTexture2DEXT(this.field5728, this.field5736, 3553, 0, 0);
        ++field5729;
        this.field5736 = -1;
        if (arg0 != 73) {
            method2406(false, (byte) 12, (String) null, (String) null);
        }
        this.field5728 = -1;
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(IIIII)V")
    public final void method2408(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 >= 86) {
            ++field5734;
            OpenGL.glFramebufferTexture2DEXT(arg2, arg3, arg4, super.field5879, arg0);
            this.field5728 = arg2;
            this.field5736 = arg3;
        }
    }

    @OriginalMember(owner = "client!nm", name = "<init>", descriptor = "(Lgi;II)V")
    public class403(class583 arg0, int arg1, int arg2) {
        super(arg0, 34067, arg1, arg2 * arg2 * 6, false);
        this.field5733 = arg2;
        super.field5883.method3358(32886, this);
        for (int var4 = 0; var4 < 6; ++var4) {
            OpenGL.glTexImage2Dub(var4 + 34069, 0, super.field5889, arg2, arg2, 0, class92.method678(-24501, super.field5889), 5121, (byte[]) null, 0);
        }
        this.method2513(false, true);
    }
}
