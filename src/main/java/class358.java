import jaggl.OpenGL;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hg")
public class class358 extends class179 {

    @OriginalMember(owner = "client!hg", name = "C", descriptor = "I")
    private int field5579 = -1;

    @OriginalMember(owner = "client!hg", name = "y", descriptor = "I")
    private int field5575 = -1;

    @OriginalMember(owner = "client!hg", name = "u", descriptor = "I")
    public int field5571;

    @OriginalMember(owner = "client!hg", name = "t", descriptor = "[I")
    public static int[] field5570 = new int[200];

    @OriginalMember(owner = "client!hg", name = "A", descriptor = "Lfb;")
    public static class368 field5577 = class347.method2240((byte) 113);

    @OriginalMember(owner = "client!hg", name = "v", descriptor = "I")
    public static int field5572;

    @OriginalMember(owner = "client!hg", name = "w", descriptor = "I")
    public static int field5573;

    @OriginalMember(owner = "client!hg", name = "z", descriptor = "I")
    public static int field5576;

    @OriginalMember(owner = "client!hg", name = "B", descriptor = "I")
    public static int field5578;

    @OriginalMember(owner = "client!hg", name = "D", descriptor = "I")
    public static int field5580;

    @OriginalMember(owner = "client!hg", name = "E", descriptor = "I")
    public static int field5581;

    @OriginalMember(owner = "client!hg", name = "x", descriptor = "Lqs;")
    public static class496 field5574;

    @OriginalMember(owner = "client!hg", name = "<init>", descriptor = "(Lih;II)V", line = 3)
    public class358(class214 arg0, int arg1, int arg2) {
        super(arg0, 34067, arg1, arg2 * arg2 * 6, false);
        this.field5571 = arg2;
        super.field2845.method1471(true, this);
        for (int var4 = 0; var4 < 6; ++var4) {
            OpenGL.glTexImage2Dub(34069 - -var4, 0, super.field2832, arg2, arg2, 0, class344.method2215(super.field2832, -12017), 5121, (byte[]) null, 0);
        }
        this.method1208(true, -111);
    }

    @OriginalMember(owner = "client!hg", name = "d", descriptor = "(I)V", line = 21)
    public static void method2295(int arg0) {
        int var1 = 86 % ((-17 - arg0) / 61);
        field5570 = null;
        field5574 = null;
        field5577 = null;
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(IIIII)V", line = 33)
    public final void method2296(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 >= -42) {
            this.method1213(82);
        }
        OpenGL.glFramebufferTexture2DEXT(arg4, arg0, arg2, super.field2843, arg3);
        ++field5576;
        this.field5579 = arg0;
        this.field5575 = arg4;
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(Lqs;B)V", line = 48)
    public static final void method2297(class496 arg0, byte arg1) {
        class223.field3851 = arg0;
        ++field5578;
        if (arg1 != -102) {
            field5577 = null;
        }
    }

    @OriginalMember(owner = "client!hg", name = "<init>", descriptor = "(Lih;IIZ[[BI)V", line = 59)
    public class358(class214 arg0, int arg1, int arg2, boolean arg3, byte[][] arg4, int arg5) {
        super(arg0, 34067, arg1, arg2 * 6 * arg2, arg3);
        this.field5571 = arg2;
        super.field2845.method1471(true, this);
        for (int var7 = 0; var7 < 6; ++var7) {
            OpenGL.glTexImage2Dub(var7 + 34069, 0, super.field2832, arg2, arg2, 0, arg5, 5121, arg4[var7], 0);
        }
        this.method1208(true, -113);
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(IIBII)V", line = 80)
    public static final void method2298(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        ++field5580;
        for (int var5 = 0; ~class128.field2208 < ~var5; ++var5) {
            Rectangle var6 = class166.field2665[var5];
            if (~(var6.x + var6.width) < ~arg4 && ~var6.x > ~(arg1 + arg4) && var6.y + var6.height > arg0 && ~var6.y > ~(arg0 - -arg3)) {
                class445.field6633[var5] = true;
            }
        }
        if (arg2 > -120) {
            field5577 = null;
        }
    }

    @OriginalMember(owner = "client!hg", name = "<init>", descriptor = "(Lih;IIZ[[I)V", line = 108)
    public class358(class214 arg0, int arg1, int arg2, boolean arg3, int[][] arg4) {
        super(arg0, 34067, arg1, arg2 * 6 * arg2, arg3);
        this.field5571 = arg2;
        super.field2845.method1471(true, this);
        if (!arg3) {
            for (int var6 = 0; ~var6 > -7; ++var6) {
                OpenGL.glTexImage2Di(var6 + 34069, 0, super.field2832, arg2, arg2, 0, 32993, super.field2845.field3671, arg4[var6], 0);
            }
        } else {
            for (int var7 = 0; ~var7 > -7; ++var7) {
                class531.method3142(super.field2832, arg4[var7], super.field2845.field3671, 34069 - -var7, (byte) 7, arg2, 32993, arg2);
            }
        }
        this.method1208(true, -119);
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(III)V", line = 140)
    public static final void method2299(int arg0, int arg1, int arg2) {
        ++field5572;
        int var3 = -97 % ((arg2 - -4) / 43);
        class266 var4 = class308.method1961(true, arg0, 13);
        var4.method1781((byte) 95);
        var4.field4454 = arg1;
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(I)V", line = 165)
    public final void method1213(int arg0) {
        ++field5573;
        OpenGL.glFramebufferTexture2DEXT(this.field5575, this.field5579, 3553, 0, arg0);
        this.field5575 = -1;
        this.field5579 = -1;
    }
}
