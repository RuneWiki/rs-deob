import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rh")
public class class32 extends class169 {

    @OriginalMember(owner = "client!rh", name = "y", descriptor = "I")
    private int field381 = -1;

    @OriginalMember(owner = "client!rh", name = "x", descriptor = "I")
    private int field380 = -1;

    @OriginalMember(owner = "client!rh", name = "A", descriptor = "I")
    public int field383;

    @OriginalMember(owner = "client!rh", name = "z", descriptor = "I")
    public static int field382;

    @OriginalMember(owner = "client!rh", name = "B", descriptor = "I")
    public static int field384;

    @OriginalMember(owner = "client!rh", name = "C", descriptor = "I")
    public static int field385;

    @OriginalMember(owner = "client!rh", name = "D", descriptor = "I")
    public static int field386;

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(I)V")
    public final void method192(int arg0) {
        OpenGL.glFramebufferTexture2DEXT(this.field381, this.field380, 3553, 0, 0);
        ++field385;
        this.field380 = -1;
        this.field381 = -1;
        int var2 = 51 % ((-44 - arg0) / 56);
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(IBII)V")
    public static final void method193(int arg0, byte arg1, int arg2, int arg3) {
        if (arg1 == -85) {
            if (arg0 == 0) {
                ++class469.field6894;
                class110.method857(4095, class44.field697);
            }
            ++field386;
            if (arg0 == 1) {
                ++class463.field6854;
                class110.method857(arg1 + 4180, class405.field5983);
            }
            class312.field4752.method1350(arg2 - -class422.field6201, (byte) 125);
            class312.field4752.method1400(class259.field4151.method30(arg1 + -7866, 82) ? 1 : 0, true);
            class312.field4752.method1386(true, arg3 - -class23.field273);
            class339.field5081 = false;
            class521.field7646 = arg2;
            class488.field7136 = arg3;
            class442.method2731(100);
        }
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(IIIBI)V")
    public final void method194(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        ++field384;
        if (arg3 > -114) {
            this.method192(37);
        }
        OpenGL.glFramebufferTexture2DEXT(arg4, arg0, arg2, super.field2561, arg1);
        this.field380 = arg0;
        this.field381 = arg4;
    }

    @OriginalMember(owner = "client!rh", name = "<init>", descriptor = "(Ltt;IIZ[[BI)V")
    public class32(class249 arg0, int arg1, int arg2, boolean arg3, byte[][] arg4, int arg5) {
        super(arg0, 34067, arg1, arg2 * 6 * arg2, arg3);
        this.field383 = arg2;
        super.field2559.method1749(25752, this);
        for (int var7 = 0; var7 < 6; ++var7) {
            OpenGL.glTexImage2Dub(var7 + 34069, 0, super.field2566, arg2, arg2, 0, arg5, 5121, arg4[var7], 0);
        }
        this.method1210((byte) -81, true);
    }

    @OriginalMember(owner = "client!rh", name = "e", descriptor = "(I)V")
    public static final void method195(int arg0) {
        class73.field1248.method534(class172.field2667, !class40.field667.field4218 ? -1 : class128.field1915 - -256 << 0, 256);
        if (arg0 != -1) {
            method193(-78, (byte) -124, 65, -46);
        }
        ++field382;
    }

    @OriginalMember(owner = "client!rh", name = "<init>", descriptor = "(Ltt;IIZ[[I)V")
    public class32(class249 arg0, int arg1, int arg2, boolean arg3, int[][] arg4) {
        super(arg0, 34067, arg1, arg2 * 6 * arg2, arg3);
        this.field383 = arg2;
        super.field2559.method1749(25752, this);
        if (!arg3) {
            for (int var6 = 0; ~var6 > -7; ++var6) {
                OpenGL.glTexImage2Di(34069 - -var6, 0, super.field2566, arg2, arg2, 0, 32993, super.field2559.field4048, arg4[var6], 0);
            }
        } else {
            for (int var7 = 0; ~var7 > -7; ++var7) {
                class460.method2821(arg4[var7], 7, arg2, super.field2559.field4048, arg2, var7 + 34069, super.field2566, 32993);
            }
        }
        this.method1210((byte) -81, true);
    }

    @OriginalMember(owner = "client!rh", name = "<init>", descriptor = "(Ltt;II)V")
    public class32(class249 arg0, int arg1, int arg2) {
        super(arg0, 34067, arg1, arg2 * arg2 * 6, false);
        this.field383 = arg2;
        super.field2559.method1749(25752, this);
        for (int var4 = 0; var4 < 6; ++var4) {
            OpenGL.glTexImage2Dub(var4 + 34069, 0, super.field2566, arg2, arg2, 0, class26.method159(super.field2566, -9640), 5121, (byte[]) null, 0);
        }
        this.method1210((byte) -81, true);
    }
}
