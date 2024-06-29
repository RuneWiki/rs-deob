import jaclib.memory.Buffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pba")
public abstract class class336 {

    @OriginalMember(owner = "client!pba", name = "e", descriptor = "Z")
    private boolean field4763;

    @OriginalMember(owner = "client!pba", name = "j", descriptor = "I")
    private int field4768;

    @OriginalMember(owner = "client!pba", name = "m", descriptor = "Lrda;")
    public class663 field4771;

    @OriginalMember(owner = "client!pba", name = "h", descriptor = "I")
    private int field4766;

    @OriginalMember(owner = "client!pba", name = "a", descriptor = "I")
    public int field4759;

    @OriginalMember(owner = "client!pba", name = "f", descriptor = "I")
    public static int field4764 = 1337;

    @OriginalMember(owner = "client!pba", name = "b", descriptor = "I")
    public static int field4760;

    @OriginalMember(owner = "client!pba", name = "c", descriptor = "I")
    public static int field4761;

    @OriginalMember(owner = "client!pba", name = "d", descriptor = "I")
    public static int field4762;

    @OriginalMember(owner = "client!pba", name = "g", descriptor = "I")
    public static int field4765;

    @OriginalMember(owner = "client!pba", name = "i", descriptor = "I")
    public static int field4767;

    @OriginalMember(owner = "client!pba", name = "k", descriptor = "I")
    public static int field4769;

    @OriginalMember(owner = "client!pba", name = "l", descriptor = "I")
    public static int field4770;

    @OriginalMember(owner = "client!pba", name = "a", descriptor = "(BIII)Z", line = 7)
    public static final boolean method2023(byte arg0, int arg1, int arg2, int arg3) {
        field4760++;
        if (!class499.field6715 || !class557.field7336) {
            return false;
        } else if (class462.field6335 < 100) {
            return false;
        } else {
            int var4 = class64.field787[arg1][arg2][arg3];
            if ((-class418.field5771) == var4) {
                return false;
            } else if (class418.field5771 == var4) {
                return true;
            } else if (class588.field7675 == class507.field6771) {
                return false;
            } else if (arg0 >= -92) {
                return true;
            } else {
                int var5 = arg2 << class140.field2224;
                int var6 = arg3 << class140.field2224;
                if (class566.method3128(false, var5 + 1, var5 + -1 + class384.field5377, class507.field6771[arg1].method1742(arg2, 86, arg3), var5 + 1, class507.field6771[arg1].method1742(arg2, 49, arg3 + 1), var6 + class384.field5377 - 1, class507.field6771[arg1].method1742(arg2 + 1, 101, arg3 - -1), class384.field5377 + var6 - 1, var6 + 1) && class566.method3128(false, var5 + 1, class384.field5377 + var5 + -1, class507.field6771[arg1].method1742(arg2, 79, arg3), class384.field5377 + var5 - 1, class507.field6771[arg1].method1742(arg2 + 1, 76, arg3 - -1), var6 + class384.field5377 - 1, class507.field6771[arg1].method1742(arg2 + 1, 45, arg3), var6 + 1, var6 + 1)) {
                    class324.field4600++;
                    class64.field787[arg1][arg2][arg3] = class418.field5771;
                    return true;
                } else {
                    class64.field787[arg1][arg2][arg3] = -class418.field5771;
                    return false;
                }
            }
        }
    }

    @OriginalMember(owner = "client!pba", name = "finalize", descriptor = "()V", line = 52)
    protected final void finalize() throws Throwable {
        field4762++;
        this.field4771.method3616(this.field4759, -5, this.field4768);
        super.finalize();
    }

    @OriginalMember(owner = "client!pba", name = "a", descriptor = "(I[BI)V", line = 61)
    public final void method2024(int arg0, byte[] arg1, int arg2) {
        if (arg2 != 0) {
            method2025(-0.676658F, -81, -115, 1.3576148F, 1.9671094F, -4, null, -69, -91, -0.8109105F, 126, -0.4044189F, null);
        }
        this.method680((byte) 74);
        field4765++;
        if (this.field4768 >= arg0) {
            OpenGL.glBufferSubDataARBub(this.field4766, 0, arg0, arg1, 0);
        } else {
            OpenGL.glBufferDataARBub(this.field4766, arg0, arg1, 0, this.field4763 ? 35040 : 35044);
            this.field4771.field8964 += arg0 - this.field4768;
            this.field4768 = arg0;
        }
    }

    @OriginalMember(owner = "client!pba", name = "a", descriptor = "(FIIFFILcq;IIFIF[B)V", line = 89)
    public static final void method2025(float arg0, int arg1, int arg2, float arg3, float arg4, int arg5, class470 arg6, int arg7, int arg8, float arg9, int arg10, float arg11, byte[] arg12) {
        for (int var13 = arg2; var13 < arg10; var13++) {
            class681.method3846(arg10, arg12, arg11, arg5, arg0, (byte) -67, arg3, arg4, arg9, arg8, arg1, var13, arg7, arg6);
            arg7 += arg5 * arg8;
        }
        field4770++;
    }

    @OriginalMember(owner = "client!pba", name = "c", descriptor = "(B)Z", line = 108)
    public static final boolean method2026(byte arg0) {
        field4769++;
        boolean var1 = true;
        if (class277.field3858 == null) {
            if (class84.field1023.method2216(class663.field8755, -101)) {
                class277.field3858 = class720.method4037(class84.field1023, class663.field8755);
            } else {
                var1 = false;
            }
        }
        if (class298.field4236 == null) {
            if (class84.field1023.method2216(class65.field801, -120)) {
                class298.field4236 = class720.method4037(class84.field1023, class65.field801);
            } else {
                var1 = false;
            }
        }
        if (arg0 != -54) {
            return false;
        }
        if (class525.field6967 == null) {
            if (class84.field1023.method2216(class465.field6410, -54)) {
                class525.field6967 = class720.method4037(class84.field1023, class465.field6410);
            } else {
                var1 = false;
            }
        }
        if (class739.field10206 == null) {
            if (class275.field3836.method2216(class452.field6184, 70)) {
                class739.field10206 = class165.method1184(class275.field3836, 13580, class452.field6184);
            } else {
                var1 = false;
            }
        }
        if (class313.field4477 == null) {
            if (class84.field1023.method2216(class452.field6184, -98)) {
                class313.field4477 = class720.method4046(class84.field1023, class452.field6184);
            } else {
                var1 = false;
            }
        }
        return var1;
    }

    @OriginalMember(owner = "client!pba", name = "<init>", descriptor = "(Lrda;I[BIZ)V", line = 187)
    public class336(class663 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
        this.field4763 = arg4;
        this.field4768 = arg3;
        this.field4771 = arg0;
        this.field4766 = arg1;
        OpenGL.glGenBuffersARB(1, class626.field8308, 0);
        this.field4759 = class626.field8308[0];
        this.method680((byte) -113);
        OpenGL.glBufferDataARBub(arg1, this.field4768, arg2, 0, this.field4763 ? 35040 : 35044);
        this.field4771.field8964 += this.field4768;
    }

    @OriginalMember(owner = "client!pba", name = "<init>", descriptor = "(Lrda;ILjaclib/memory/Buffer;IZ)V", line = 206)
    public class336(class663 arg0, int arg1, Buffer arg2, int arg3, boolean arg4) {
        this.field4771 = arg0;
        this.field4766 = arg1;
        this.field4763 = arg4;
        this.field4768 = arg3;
        OpenGL.glGenBuffersARB(1, class626.field8308, 0);
        this.field4759 = class626.field8308[0];
        this.method680((byte) -112);
        OpenGL.glBufferDataARBa(arg1, this.field4768, arg2.getAddress(), this.field4763 ? 35040 : 35044);
        this.field4771.field8964 += this.field4768;
    }

    @OriginalMember(owner = "client!pba", name = "b", descriptor = "(B)V")
    public abstract void method680(byte arg0);
}
