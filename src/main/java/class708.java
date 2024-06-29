import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!io")
public class class708 extends class487 {

    @OriginalMember(owner = "client!io", name = "D", descriptor = "I")
    private int field9976 = -1;

    @OriginalMember(owner = "client!io", name = "G", descriptor = "I")
    private int field9979 = -1;

    @OriginalMember(owner = "client!io", name = "F", descriptor = "I")
    public int field9978;

    @OriginalMember(owner = "client!io", name = "C", descriptor = "Lcb;")
    public static class631 field9975 = new class631(74, 4);

    @OriginalMember(owner = "client!io", name = "B", descriptor = "I")
    public static int field9974;

    @OriginalMember(owner = "client!io", name = "E", descriptor = "I")
    public static int field9977;

    @OriginalMember(owner = "client!io", name = "H", descriptor = "I")
    public static int field9980;

    @OriginalMember(owner = "client!io", name = "I", descriptor = "I")
    public static int field9981;

    @OriginalMember(owner = "client!io", name = "J", descriptor = "I")
    public static int field9982;

    @OriginalMember(owner = "client!io", name = "K", descriptor = "I")
    public static int field9983;

    @OriginalMember(owner = "client!io", name = "b", descriptor = "(Z)V")
    public static void method3923(boolean arg0) {
        field9975 = null;
        if (!arg0) {
            method3923(true);
        }
    }

    @OriginalMember(owner = "client!io", name = "<init>", descriptor = "(Lrs;IIZ[[I)V")
    public class708(class166 arg0, int arg1, int arg2, boolean arg3, int[][] arg4) {
        super(arg0, 34067, arg1, arg2 * arg2 * 6, arg3);
        this.field9978 = arg2;
        super.field7044.method1306(this, 32);
        if (!arg3) {
            for (int var6 = 0; var6 < 6; ++var6) {
                OpenGL.glTexImage2Di(34069 - -var6, 0, super.field7033, arg2, arg2, 0, 32993, super.field7044.field2878, arg4[var6], 0);
            }
        } else {
            for (int var7 = 0; ~var7 > -7; ++var7) {
                class380.method2397(arg4[var7], arg2, super.field7033, 32993, arg2, -30633, super.field7044.field2878, var7 + 34069);
            }
        }
        this.method2967(true, true);
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(IIIII)V")
    public final void method3924(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != 34069) {
            this.field9978 = -17;
        }
        ++field9983;
        OpenGL.glFramebufferTexture2DEXT(arg2, arg4, arg3, super.field7047, arg1);
        this.field9976 = arg2;
        this.field9979 = arg4;
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(IIBILjava/lang/String;III)V")
    public static final void method3925(int arg0, int arg1, byte arg2, int arg3, String arg4, int arg5, int arg6, int arg7) {
        ++field9982;
        class31 var8 = new class31();
        var8.field292 = arg4;
        var8.field289 = arg0;
        var8.field295 = arg3;
        var8.field299 = arg1;
        var8.field298 = arg5;
        var8.field294 = class199.field3403 + arg7;
        var8.field290 = arg6;
        if (arg2 < 6) {
            field9975 = null;
        }
        class383.field5749.method3266(var8, true);
    }

    @OriginalMember(owner = "client!io", name = "<init>", descriptor = "(Lrs;IIZ[[BI)V")
    public class708(class166 arg0, int arg1, int arg2, boolean arg3, byte[][] arg4, int arg5) {
        super(arg0, 34067, arg1, arg2 * arg2 * 6, arg3);
        this.field9978 = arg2;
        super.field7044.method1306(this, 67);
        for (int var7 = 0; ~var7 > -7; ++var7) {
            OpenGL.glTexImage2Dub(var7 + 34069, 0, super.field7033, arg2, arg2, 0, arg5, 5121, arg4[var7], 0);
        }
        this.method2967(true, true);
    }

    @OriginalMember(owner = "client!io", name = "c", descriptor = "(I)V")
    public static final void method3926(int arg0) {
        ++field9974;
        if (class452.field6572 != class209.field3494) {
            int var1 = 25 % ((arg0 - -60) / 58);
            try {
                class284.method1862(class52.field834, "tbrefresh", (byte) 47);
            } catch (Throwable var2) {
            }
        }
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(B)V")
    public final void method2069(byte arg0) {
        OpenGL.glFramebufferTexture2DEXT(this.field9976, this.field9979, 3553, 0, 0);
        ++field9981;
        this.field9976 = -1;
        if (arg0 != -31) {
            this.method3924(37, 24, -108, -15, 39);
        }
        this.field9979 = -1;
    }

    @OriginalMember(owner = "client!io", name = "<init>", descriptor = "(Lrs;II)V")
    public class708(class166 arg0, int arg1, int arg2) {
        super(arg0, 34067, arg1, arg2 * arg2 * 6, false);
        this.field9978 = arg2;
        super.field7044.method1306(this, 109);
        for (int var4 = 0; var4 < 6; ++var4) {
            OpenGL.glTexImage2Dub(var4 + 34069, 0, super.field7033, arg2, arg2, 0, class468.method2868((byte) -2, super.field7033), 5121, (byte[]) null, 0);
        }
        this.method2967(true, true);
    }
}
