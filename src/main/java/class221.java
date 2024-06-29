import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hp")
public class class221 extends class120 {

    @OriginalMember(owner = "client!hp", name = "x", descriptor = "I")
    private int field3374 = -1;

    @OriginalMember(owner = "client!hp", name = "C", descriptor = "I")
    private int field3379 = -1;

    @OriginalMember(owner = "client!hp", name = "G", descriptor = "I")
    public int field3383;

    @OriginalMember(owner = "client!hp", name = "y", descriptor = "[Luu;")
    public static class193[] field3375 = new class193[1024];

    @OriginalMember(owner = "client!hp", name = "I", descriptor = "I")
    public static int field3385 = 2;

    @OriginalMember(owner = "client!hp", name = "z", descriptor = "I")
    public static int field3376;

    @OriginalMember(owner = "client!hp", name = "A", descriptor = "I")
    public static int field3377;

    @OriginalMember(owner = "client!hp", name = "B", descriptor = "I")
    public static int field3378;

    @OriginalMember(owner = "client!hp", name = "D", descriptor = "I")
    public static int field3380;

    @OriginalMember(owner = "client!hp", name = "E", descriptor = "I")
    public static int field3381;

    @OriginalMember(owner = "client!hp", name = "F", descriptor = "I")
    public static int field3382;

    @OriginalMember(owner = "client!hp", name = "H", descriptor = "I")
    public static int field3384;

    @OriginalMember(owner = "client!hp", name = "J", descriptor = "I")
    public static int field3386;

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(Ljava/lang/String;I)V")
    public static final void method1500(String arg0, int arg1) {
        ++field3384;
        if (class219.field3351) {
            boolean var2 = false;
            int var3 = class452.field6603;
            int[] var4 = class532.field7853;
            if (arg1 == 32655) {
                for (int var5 = 0; var5 < var3; ++var5) {
                    class510 var6 = class494.field7143[var4[var5]];
                    if (var6 != null && class364.field5293 != var6 && var6.field7363 != null && var6.field7363.equalsIgnoreCase(arg0)) {
                        class228.method1528(true, class67.field1121);
                        ++class146.field2261;
                        class276.field4124.method3016(var4[var5], -6);
                        class276.field4124.method3068((byte) 57, class72.field1164);
                        class276.field4124.method3045(3, class28.field391);
                        class276.field4124.method3048(-2034159384, 0);
                        class276.field4124.method3020(arg1 + -1022839679, class303.field4494);
                        class15.method88(var6.method135((byte) 72), 0, var6.field344[0], -2, 17686, var6.field343[0], true, 0, var6.method135((byte) 72));
                        var2 = true;
                        break;
                    }
                }
                if (!var2) {
                    class171.method1208((byte) -127, class412.field5831.method426(class503.field7255, arg1 ^ 32689) + arg0);
                }
                if (class219.field3351) {
                    class461.method2735((byte) -121);
                }
            }
        }
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(BI)C")
    public static final char method1501(byte arg0, int arg1) {
        ++field3382;
        int var2 = arg0 & 255;
        if (var2 == 0) {
            throw new IllegalArgumentException("Non cp1252 character 0x" + Integer.toString(var2, 16) + " provided");
        } else {
            if (~var2 <= -129 && var2 < 160) {
                char var3 = class79.field1284[var2 + -128];
                if (var3 == 0) {
                    var3 = '?';
                }
                var2 = var3;
            }
            if (arg1 != -23667) {
                method1504(78, 18, (byte) 92);
            }
            return (char) var2;
        }
    }

    @OriginalMember(owner = "client!hp", name = "<init>", descriptor = "(Lbt;II)V")
    public class221(class33 arg0, int arg1, int arg2) {
        super(arg0, 34067, arg1, arg2 * 6 * arg2, false);
        this.field3383 = arg2;
        super.field1884.method285(false, this);
        for (int var4 = 0; ~var4 > -7; ++var4) {
            OpenGL.glTexImage2Dub(var4 + 34069, 0, super.field1867, arg2, arg2, 0, class136.method993(super.field1867, (byte) -114), 5121, (byte[]) null, 0);
        }
        this.method879(true, (byte) 101);
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(IIIII)V")
    public final void method1502(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field3380;
        OpenGL.glFramebufferTexture2DEXT(arg2, arg4, arg3, super.field1872, arg0);
        int var6 = -95 % ((68 - arg1) / 49);
        this.field3374 = arg2;
        this.field3379 = arg4;
    }

    @OriginalMember(owner = "client!hp", name = "f", descriptor = "(I)V")
    public static void method1503(int arg0) {
        if (arg0 != -128) {
            field3375 = null;
        }
        field3375 = null;
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(Z)V")
    public final void method889(boolean arg0) {
        OpenGL.glFramebufferTexture2DEXT(this.field3374, this.field3379, 3553, 0, 0);
        ++field3377;
        this.field3374 = -1;
        if (!arg0) {
            this.field3379 = 84;
        }
        this.field3379 = -1;
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(IIB)Z")
    public static final boolean method1504(int arg0, int arg1, byte arg2) {
        if (arg2 > -80) {
            return false;
        } else {
            ++field3378;
            return (32768 & arg1) != 0;
        }
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(IIIBI)V")
    public static final void method1505(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        int var5 = 84 / ((1 - arg3) / 60);
        if (~arg1 > ~arg0) {
            class479.method2839(arg0, arg1, class271.field4078[arg2], 83, arg4);
        } else {
            class479.method2839(arg1, arg0, class271.field4078[arg2], 107, arg4);
        }
        ++field3381;
    }

    @OriginalMember(owner = "client!hp", name = "<init>", descriptor = "(Lbt;IIZ[[I)V")
    public class221(class33 arg0, int arg1, int arg2, boolean arg3, int[][] arg4) {
        super(arg0, 34067, arg1, arg2 * 6 * arg2, arg3);
        this.field3383 = arg2;
        super.field1884.method285(false, this);
        if (arg3) {
            for (int var6 = 0; ~var6 > -7; ++var6) {
                class199.method1356(arg4[var6], var6 + 34069, 46, 32993, super.field1884.field709, arg2, arg2, super.field1867);
            }
        } else {
            for (int var7 = 0; ~var7 > -7; ++var7) {
                OpenGL.glTexImage2Di(var7 + 34069, 0, super.field1867, arg2, arg2, 0, 32993, super.field1884.field709, arg4[var7], 0);
            }
        }
        this.method879(true, (byte) 82);
    }

    @OriginalMember(owner = "client!hp", name = "<init>", descriptor = "(Lbt;IIZ[[BI)V")
    public class221(class33 arg0, int arg1, int arg2, boolean arg3, byte[][] arg4, int arg5) {
        super(arg0, 34067, arg1, arg2 * 6 * arg2, arg3);
        this.field3383 = arg2;
        super.field1884.method285(false, this);
        for (int var7 = 0; ~var7 > -7; ++var7) {
            OpenGL.glTexImage2Dub(var7 + 34069, 0, super.field1867, arg2, arg2, 0, arg5, 5121, arg4[var7], 0);
        }
        this.method879(true, (byte) 74);
    }
}
