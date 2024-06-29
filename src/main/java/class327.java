import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!d")
public class class327 extends class262 {

    @OriginalMember(owner = "client!d", name = "v", descriptor = "I")
    private int field4393 = -1;

    @OriginalMember(owner = "client!d", name = "A", descriptor = "I")
    private int field4398 = -1;

    @OriginalMember(owner = "client!d", name = "x", descriptor = "I")
    public int field4395;

    @OriginalMember(owner = "client!d", name = "E", descriptor = "Lkea;")
    public static class218 field4401 = new class218();

    @OriginalMember(owner = "client!d", name = "H", descriptor = "I")
    public static int field4404 = 0;

    @OriginalMember(owner = "client!d", name = "w", descriptor = "I")
    public static int field4394;

    @OriginalMember(owner = "client!d", name = "y", descriptor = "I")
    public static int field4396;

    @OriginalMember(owner = "client!d", name = "z", descriptor = "I")
    public static int field4397;

    @OriginalMember(owner = "client!d", name = "B", descriptor = "I")
    public static int field4399;

    @OriginalMember(owner = "client!d", name = "F", descriptor = "I")
    public static int field4402;

    @OriginalMember(owner = "client!d", name = "G", descriptor = "Lsca;")
    public static class235 field4403;

    @OriginalMember(owner = "client!d", name = "C", descriptor = "Z")
    public static boolean field4400;

    @OriginalMember(owner = "client!d", name = "<init>", descriptor = "(Lag;IIZ[[I)V")
    public class327(class469 arg0, int arg1, int arg2, boolean arg3, int[][] arg4) {
        super(arg0, 34067, arg1, arg2 * arg2 * 6, arg3);
        this.field4395 = arg2;
        super.field3422.method2627(106, this);
        if (arg3) {
            for (int var6 = 0; ~var6 > -7; ++var6) {
                class308.method1811(arg4[var6], 34069 - -var6, 32993, 98, arg2, super.field3422.field6460, super.field3413, arg2);
            }
        } else {
            for (int var7 = 0; var7 < 6; ++var7) {
                OpenGL.glTexImage2Di(var7 + 34069, 0, super.field3413, arg2, arg2, 0, 32993, super.field3422.field6460, arg4[var7], 0);
            }
        }
        this.method1582(120, true);
    }

    @OriginalMember(owner = "client!d", name = "<init>", descriptor = "(Lag;II)V")
    public class327(class469 arg0, int arg1, int arg2) {
        super(arg0, 34067, arg1, arg2 * 6 * arg2, false);
        this.field4395 = arg2;
        super.field3422.method2627(89, this);
        for (int var4 = 0; ~var4 > -7; ++var4) {
            OpenGL.glTexImage2Dub(var4 + 34069, 0, super.field3413, arg2, arg2, 0, class151.method888((byte) -93, super.field3413), 5121, (byte[]) null, 0);
        }
        this.method1582(122, true);
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(Lrc;Z)V")
    public static final void method1903(class29 arg0, boolean arg1) {
        for (int var2 = arg0.field423; var2 <= arg0.field420; ++var2) {
            for (int var3 = arg0.field419; var3 <= arg0.field421; ++var3) {
                class207 var4 = class153.field2168[arg0.field385][var2][var3];
                if (var4 != null) {
                    class634 var5 = var4.field2774;
                    class634 var6 = null;
                    while (var5 != null) {
                        if (var5.field8767 == arg0) {
                            if (var6 != null) {
                                var6.field8764 = var5.field8764;
                            } else {
                                var4.field2774 = var5.field8764;
                            }
                            var5.method3515(1);
                            break;
                        }
                        var6 = var5;
                        var5 = var5.field8764;
                    }
                }
            }
        }
        if (!arg1) {
            class454.method2557(arg0);
        }
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(I)V")
    public final void method395(int arg0) {
        OpenGL.glFramebufferTexture2DEXT(this.field4398, this.field4393, 3553, 0, 0);
        ++field4399;
        if (arg0 == 33071) {
            this.field4393 = -1;
            this.field4398 = -1;
        }
    }

    @OriginalMember(owner = "client!d", name = "b", descriptor = "(II)V")
    public static final void method1904(int arg0, int arg1) {
        ++field4394;
        if (class60.method341(arg0, arg1 + 1)) {
            class587.method3251(arg1, arg1 ^ 116, class124.field1729[arg0]);
        }
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(IBIII)V")
    public final void method1905(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        OpenGL.glFramebufferTexture2DEXT(arg0, arg3, arg2, super.field3415, arg4);
        ++field4402;
        int var6 = -12 / ((56 - arg1) / 51);
        this.field4398 = arg0;
        this.field4393 = arg3;
    }

    @OriginalMember(owner = "client!d", name = "g", descriptor = "(I)V")
    public static void method1906(int arg0) {
        field4401 = null;
        field4403 = null;
        if (arg0 != 32993) {
            field4403 = null;
        }
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(ILr;)V")
    public static final void method1907(int arg0, class562 arg1) {
        class421.field5524 = new class633[class600.field8341.length];
        ++field4397;
        for (int var2 = arg0; ~var2 > ~class600.field8341.length; ++var2) {
            int var3 = class600.field8341[var2];
            class658 var4 = class77.method422(class418.field5501, var3, (byte) -110);
            class409 var5 = arg1.method1130(var4, class92.method513(class6.field62, var3), true);
            class421.field5524[var2] = new class633(var5, var4);
        }
    }

    @OriginalMember(owner = "client!d", name = "<init>", descriptor = "(Lag;IIZ[[BI)V")
    public class327(class469 arg0, int arg1, int arg2, boolean arg3, byte[][] arg4, int arg5) {
        super(arg0, 34067, arg1, arg2 * arg2 * 6, arg3);
        this.field4395 = arg2;
        super.field3422.method2627(66, this);
        for (int var7 = 0; var7 < 6; ++var7) {
            OpenGL.glTexImage2Dub(34069 - -var7, 0, super.field3413, arg2, arg2, 0, arg5, 5121, arg4[var7], 0);
        }
        this.method1582(118, true);
    }
}
