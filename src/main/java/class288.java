import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nn")
public class class288 extends class119 {

    @OriginalMember(owner = "client!nn", name = "x", descriptor = "I")
    private int field3671 = -1;

    @OriginalMember(owner = "client!nn", name = "z", descriptor = "I")
    private int field3673 = -1;

    @OriginalMember(owner = "client!nn", name = "D", descriptor = "I")
    public int field3677;

    @OriginalMember(owner = "client!nn", name = "A", descriptor = "[I")
    public static int[] field3674 = new int[1];

    @OriginalMember(owner = "client!nn", name = "C", descriptor = "Ldq;")
    public static class493 field3676 = new class493(18, -1);

    @OriginalMember(owner = "client!nn", name = "F", descriptor = "I")
    public static int field3679 = -1;

    @OriginalMember(owner = "client!nn", name = "I", descriptor = "I")
    public static int field3682 = 0;

    @OriginalMember(owner = "client!nn", name = "G", descriptor = "Ldq;")
    public static class493 field3680 = new class493(15, 7);

    @OriginalMember(owner = "client!nn", name = "w", descriptor = "I")
    public static int field3670;

    @OriginalMember(owner = "client!nn", name = "y", descriptor = "I")
    public static int field3672;

    @OriginalMember(owner = "client!nn", name = "E", descriptor = "I")
    public static int field3678;

    @OriginalMember(owner = "client!nn", name = "H", descriptor = "I")
    public static int field3681;

    @OriginalMember(owner = "client!nn", name = "B", descriptor = "Lqn;")
    public static class47 field3675;

    @OriginalMember(owner = "client!nn", name = "d", descriptor = "(B)V")
    public static void method1699(byte arg0) {
        field3676 = null;
        if (arg0 != -12) {
            method1699((byte) -116);
        }
        field3680 = null;
        field3675 = null;
        field3674 = null;
    }

    @OriginalMember(owner = "client!nn", name = "<init>", descriptor = "(Lug;IIZ[[I)V")
    public class288(class395 arg0, int arg1, int arg2, boolean arg3, int[][] arg4) {
        super(arg0, 34067, arg1, arg2 * arg2 * 6, arg3);
        this.field3677 = arg2;
        super.field1607.method2322(this, 14);
        if (arg3) {
            for (int var6 = 0; var6 < 6; ++var6) {
                class475.method2864(32993, arg2, super.field1607.field5566, super.field1611, arg2, var6 + 34069, arg4[var6], -6495);
            }
        } else {
            for (int var7 = 0; var7 < 6; ++var7) {
                OpenGL.glTexImage2Di(var7 + 34069, 0, super.field1611, arg2, arg2, 0, 32993, super.field1607.field5566, arg4[var7], 0);
            }
        }
        this.method861(true, 9984);
    }

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(BII)Z")
    public static final boolean method1700(byte arg0, int arg1, int arg2) {
        ++field3678;
        if (arg0 != -43) {
            field3675 = null;
        }
        if (!((65536 & arg2) != 0 | class240.method1448(arg1, (byte) 109, arg2)) && !class225.method1374(arg2, arg1, false)) {
            return ~(arg1 & 55) == -1 && class9.method57(arg1, arg2, 55);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(I)V")
    public final void method864(int arg0) {
        OpenGL.glFramebufferTexture2DEXT(this.field3671, this.field3673, 3553, 0, 0);
        ++field3670;
        this.field3671 = -1;
        this.field3673 = arg0;
    }

    @OriginalMember(owner = "client!nn", name = "<init>", descriptor = "(Lug;IIZ[[BI)V")
    public class288(class395 arg0, int arg1, int arg2, boolean arg3, byte[][] arg4, int arg5) {
        super(arg0, 34067, arg1, arg2 * 6 * arg2, arg3);
        this.field3677 = arg2;
        super.field1607.method2322(this, 14);
        for (int var7 = 0; ~var7 > -7; ++var7) {
            OpenGL.glTexImage2Dub(34069 - -var7, 0, super.field1611, arg2, arg2, 0, arg5, 5121, arg4[var7], 0);
        }
        this.method861(true, 9984);
    }

    @OriginalMember(owner = "client!nn", name = "<init>", descriptor = "(Lug;II)V")
    public class288(class395 arg0, int arg1, int arg2) {
        super(arg0, 34067, arg1, arg2 * arg2 * 6, false);
        this.field3677 = arg2;
        super.field1607.method2322(this, 14);
        for (int var4 = 0; var4 < 6; ++var4) {
            OpenGL.glTexImage2Dub(var4 + 34069, 0, super.field1611, arg2, arg2, 0, class100.method757(super.field1611, (byte) -40), 5121, (byte[]) null, 0);
        }
        this.method861(true, 9984);
    }

    @OriginalMember(owner = "client!nn", name = "b", descriptor = "(III)V")
    public static final void method1701(int arg0, int arg1, int arg2) {
        ++field3681;
        if (arg1 <= 59) {
            method1699((byte) -87);
        }
        class153 var3 = class75.method656(12, 255, arg0);
        var3.method1003((byte) -45);
        var3.field1933 = arg2;
    }

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(BIIII)V")
    public final void method1702(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field3672;
        int var6 = -101 % ((-34 - arg0) / 54);
        OpenGL.glFramebufferTexture2DEXT(arg4, arg3, arg1, super.field1599, arg2);
        this.field3673 = arg3;
        this.field3671 = arg4;
    }
}
