import jaggl.OpenGL;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ku")
public class class375 extends class210 {

    @OriginalMember(owner = "client!ku", name = "B", descriptor = "I")
    private int field5255 = -1;

    @OriginalMember(owner = "client!ku", name = "D", descriptor = "I")
    private int field5257 = -1;

    @OriginalMember(owner = "client!ku", name = "A", descriptor = "I")
    public int field5254;

    @OriginalMember(owner = "client!ku", name = "y", descriptor = "I")
    public static int field5252;

    @OriginalMember(owner = "client!ku", name = "z", descriptor = "I")
    public static int field5253;

    @OriginalMember(owner = "client!ku", name = "C", descriptor = "I")
    public static int field5256;

    @OriginalMember(owner = "client!ku", name = "E", descriptor = "I")
    public static int field5258;

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "(IIIII)V", line = 5)
    public static final void method2356(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field5252;
        int var5 = 0;
        if (arg0 == -8155) {
            while (~class540.field7565 < ~var5) {
                Rectangle var6 = class686.field9382[var5];
                if (~arg4 > ~(var6.x + var6.width) && ~var6.x > ~(arg4 - -arg1) && ~arg3 > ~(var6.y + var6.height) && ~(arg3 - -arg2) < ~var6.y) {
                    class220.field2877[var5] = true;
                }
                ++var5;
            }
            class189.method1186(arg3 - -arg2, arg4 - -arg1, (byte) -73, arg4, arg3);
        }
    }

    @OriginalMember(owner = "client!ku", name = "<init>", descriptor = "(Leea;IIZ[[BI)V", line = 30)
    public class375(class131 arg0, int arg1, int arg2, boolean arg3, byte[][] arg4, int arg5) {
        super(arg0, 34067, arg1, arg2 * 6 * arg2, arg3);
        this.field5254 = arg2;
        super.field2761.method926(this, 79);
        for (int var7 = 0; var7 < 6; ++var7) {
            OpenGL.glTexImage2Dub(var7 + 34069, 0, super.field2776, arg2, arg2, 0, arg5, 5121, arg4[var7], 0);
        }
        this.method1297(true, false);
    }

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "(Lkha;ILkha;)V", line = 49)
    public static final void method2357(class583 arg0, int arg1, class583 arg2) {
        if (arg1 == 1589) {
            if (arg0.field8205 != null) {
                arg0.method3311(arg1 ^ 1617);
            }
            ++field5256;
            arg0.field8205 = arg2;
            arg0.field8206 = arg2.field8206;
            arg0.field8205.field8206 = arg0;
            arg0.field8206.field8205 = arg0;
        }
    }

    @OriginalMember(owner = "client!ku", name = "<init>", descriptor = "(Leea;IIZ[[I)V", line = 67)
    public class375(class131 arg0, int arg1, int arg2, boolean arg3, int[][] arg4) {
        super(arg0, 34067, arg1, arg2 * 6 * arg2, arg3);
        this.field5254 = arg2;
        super.field2761.method926(this, 35);
        if (!arg3) {
            for (int var6 = 0; ~var6 > -7; ++var6) {
                OpenGL.glTexImage2Di(var6 + 34069, 0, super.field2776, arg2, arg2, 0, 32993, super.field2761.field1849, arg4[var6], 0);
            }
        } else {
            for (int var7 = 0; ~var7 > -7; ++var7) {
                class180.method1137(var7 + 34069, (byte) -90, arg4[var7], arg2, 32993, arg2, super.field2776, super.field2761.field1849);
            }
        }
        this.method1297(true, false);
    }

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "(I)V", line = 98)
    public final void method1299(int arg0) {
        OpenGL.glFramebufferTexture2DEXT(this.field5257, this.field5255, 3553, 0, 0);
        ++field5253;
        this.field5255 = -1;
        this.field5257 = -1;
        if (arg0 > -38) {
            this.method2358(-111, -29, false, -61, -10);
        }
    }

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "(IIZII)V", line = 111)
    public final void method2358(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
        ++field5258;
        if (arg2) {
            this.field5254 = 63;
        }
        OpenGL.glFramebufferTexture2DEXT(arg4, arg0, arg1, super.field2762, arg3);
        this.field5255 = arg0;
        this.field5257 = arg4;
    }

    @OriginalMember(owner = "client!ku", name = "<init>", descriptor = "(Leea;II)V", line = 130)
    public class375(class131 arg0, int arg1, int arg2) {
        super(arg0, 34067, arg1, arg2 * 6 * arg2, false);
        this.field5254 = arg2;
        super.field2761.method926(this, 71);
        for (int var4 = 0; var4 < 6; ++var4) {
            OpenGL.glTexImage2Dub(var4 + 34069, 0, super.field2776, arg2, arg2, 0, class240.method1529(true, super.field2776), 5121, (byte[]) null, 0);
        }
        this.method1297(true, false);
    }
}
