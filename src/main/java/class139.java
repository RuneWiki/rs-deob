import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sa")
public class class139 extends class252 {

    @OriginalMember(owner = "client!sa", name = "v", descriptor = "I")
    private int field1850 = -1;

    @OriginalMember(owner = "client!sa", name = "B", descriptor = "I")
    private int field1856 = -1;

    @OriginalMember(owner = "client!sa", name = "A", descriptor = "I")
    public int field1855;

    @OriginalMember(owner = "client!sa", name = "y", descriptor = "I")
    public static int field1853 = 0;

    @OriginalMember(owner = "client!sa", name = "w", descriptor = "I")
    public static int field1851;

    @OriginalMember(owner = "client!sa", name = "x", descriptor = "I")
    public static int field1852;

    @OriginalMember(owner = "client!sa", name = "z", descriptor = "I")
    public static int field1854;

    @OriginalMember(owner = "client!sa", name = "C", descriptor = "I")
    public static int field1857;

    @OriginalMember(owner = "client!sa", name = "D", descriptor = "I")
    public static int field1858;

    @OriginalMember(owner = "client!sa", name = "E", descriptor = "I")
    public static int field1859;

    @OriginalMember(owner = "client!sa", name = "F", descriptor = "I")
    public static int field1860;

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(IIIIB)V", line = 4)
    public final void method860(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        ++field1858;
        OpenGL.glFramebufferTexture2DEXT(arg3, arg2, arg1, super.field3362, arg0);
        this.field1856 = arg3;
        if (arg4 == 107) {
            this.field1850 = arg2;
        }
    }

    @OriginalMember(owner = "client!sa", name = "<init>", descriptor = "(Lur;IIZ[[BI)V", line = 21)
    public class139(class377 arg0, int arg1, int arg2, boolean arg3, byte[][] arg4, int arg5) {
        super(arg0, 34067, arg1, arg2 * 6 * arg2, arg3);
        this.field1855 = arg2;
        super.field3354.method2236(this, -62);
        for (int var7 = 0; ~var7 > -7; ++var7) {
            OpenGL.glTexImage2Dub(34069 - -var7, 0, super.field3356, arg2, arg2, 0, arg5, 5121, arg4[var7], 0);
        }
        this.method1555((byte) 119, true);
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(ZIIIIIIII)Z", line = 41)
    public static final boolean method861(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        ++field1852;
        int var9 = class96.field1170.field1249[0];
        if (arg6 > -98) {
            return false;
        } else {
            int var10 = class96.field1170.field1251[0];
            if (var9 >= 0 && var9 < class308.field4128 && ~var10 <= -1 && ~var10 > ~class426.field6200) {
                if (~arg8 <= -1 && ~class308.field4128 < ~arg8 && ~arg3 <= -1 && ~class426.field6200 < ~arg3) {
                    int var11 = class199.method1270(arg3, arg0, var9, arg4, class19.field169, arg8, class471.field6998, var10, -122, arg5, arg7, class96.field1170.method546(24273), arg1, class96.field1223[class96.field1170.field3695], arg2);
                    if (var11 < 1) {
                        return false;
                    } else {
                        class234.field3122 = class19.field169[var11 - 1];
                        class417.field6028 = class471.field6998[var11 - 1];
                        class20.field180 = false;
                        class336.method1959((byte) -21);
                        return true;
                    }
                } else {
                    return false;
                }
            } else {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!sa", name = "<init>", descriptor = "(Lur;IIZ[[I)V", line = 74)
    public class139(class377 arg0, int arg1, int arg2, boolean arg3, int[][] arg4) {
        super(arg0, 34067, arg1, arg2 * arg2 * 6, arg3);
        this.field1855 = arg2;
        super.field3354.method2236(this, 99);
        if (arg3) {
            for (int var6 = 0; ~var6 > -7; ++var6) {
                class471.method2873(super.field3354.field5437, arg2, 32993, arg4[var6], arg2, (byte) -59, var6 + 34069, super.field3356);
            }
        } else {
            for (int var7 = 0; ~var7 > -7; ++var7) {
                OpenGL.glTexImage2Di(34069 - -var7, 0, super.field3356, arg2, arg2, 0, 32993, super.field3354.field5437, arg4[var7], 0);
            }
        }
        this.method1555((byte) 118, true);
    }

    @OriginalMember(owner = "client!sa", name = "<init>", descriptor = "(Lur;II)V", line = 107)
    public class139(class377 arg0, int arg1, int arg2) {
        super(arg0, 34067, arg1, arg2 * 6 * arg2, false);
        this.field1855 = arg2;
        super.field3354.method2236(this, 118);
        for (int var4 = 0; ~var4 > -7; ++var4) {
            OpenGL.glTexImage2Dub(var4 + 34069, 0, super.field3356, arg2, arg2, 0, class105.method639(-124, super.field3356), 5121, (byte[]) null, 0);
        }
        this.method1555((byte) 111, true);
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(IIIZI)V", line = 124)
    public static final void method862(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        if (arg0 == 4756) {
            if (~class20.field183 != -1) {
                class244.field3221 = class20.field183;
                class142.method874(0, (byte) -25);
            } else {
                class477.method2910(3, false);
            }
            ++field1860;
            class442.field6425 = arg3;
            class141.field1870 = arg2;
            class183.field2380 = arg4;
            class416.method2556(arg1);
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(B)V", line = 154)
    public final void method863(byte arg0) {
        ++field1854;
        OpenGL.glFramebufferTexture2DEXT(this.field1856, this.field1850, 3553, 0, 0);
        this.field1856 = -1;
        this.field1850 = -1;
        if (arg0 != 103) {
            this.field1856 = 59;
        }
    }
}
