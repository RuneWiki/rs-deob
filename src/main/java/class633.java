import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rh")
public class class633 extends class396 {

    @OriginalMember(owner = "client!rh", name = "x", descriptor = "I")
    private int field9006 = -1;

    @OriginalMember(owner = "client!rh", name = "z", descriptor = "I")
    private int field9008 = -1;

    @OriginalMember(owner = "client!rh", name = "A", descriptor = "I")
    public int field9009;

    @OriginalMember(owner = "client!rh", name = "v", descriptor = "I")
    public static int field9004;

    @OriginalMember(owner = "client!rh", name = "w", descriptor = "I")
    public static int field9005;

    @OriginalMember(owner = "client!rh", name = "y", descriptor = "I")
    public static int field9007;

    @OriginalMember(owner = "client!rh", name = "B", descriptor = "I")
    public static int field9010;

    @OriginalMember(owner = "client!rh", name = "C", descriptor = "I")
    public static int field9011;

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(IIIIZ)V", line = 3)
    public final void method3678(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        OpenGL.glFramebufferTexture2DEXT(arg3, arg1, arg0, super.field5507, arg2);
        ++field9007;
        this.field9006 = arg3;
        this.field9008 = arg1;
        if (!arg4) {
            this.method527(-78);
        }
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(I)V", line = 19)
    public final void method527(int arg0) {
        OpenGL.glFramebufferTexture2DEXT(this.field9006, this.field9008, 3553, 0, 0);
        if (arg0 < 123) {
            method3679((byte) -10);
        }
        ++field9005;
        this.field9008 = -1;
        this.field9006 = -1;
    }

    @OriginalMember(owner = "client!rh", name = "d", descriptor = "(B)V", line = 34)
    public static final void method3679(byte arg0) {
        class116.method764(class740.field10315, -1176833464);
        ++field9010;
        ++class223.field3142;
        if (class218.field3086 && class441.field6047) {
            int var1 = 0;
            if (arg0 < -76) {
                int var2 = 0;
                if (class264.field3595) {
                    var1 = class468.method2788(false);
                    var2 = class142.method934((byte) -88);
                }
                int var3 = class93.field1263.method805(0) - -var1;
                int var4 = var2 + class93.field1263.method806(0);
                int var5 = var3 - class281.field3737;
                int var6 = var4 - class138.field1900;
                if (class94.field1375 > var5) {
                    var5 = class94.field1375;
                }
                if (~(var5 - -class740.field10315.field9966) < ~(class94.field1375 + class316.field4062.field9966)) {
                    var5 = -class740.field10315.field9966 + class316.field4062.field9966 + class94.field1375;
                }
                if (~class416.field5798 < ~var6) {
                    var6 = class416.field5798;
                }
                if (class740.field10315.field10011 + var6 > class416.field5798 + class316.field4062.field10011) {
                    var6 = -class740.field10315.field10011 + class316.field4062.field10011 + class416.field5798;
                }
                int var7 = -class94.field1375 + var5 + class316.field4062.field9971;
                int var8 = -class416.field5798 + var6 + class316.field4062.field10014;
                if (class93.field1263.method1698(false)) {
                    if (class740.field10315.field9956 < class223.field3142) {
                        int var9 = -class659.field9306 + var5;
                        int var10 = -class42.field593 + var6;
                        if (var9 > class740.field10315.field10046 || -class740.field10315.field10046 > var9 || class740.field10315.field10046 < var10 || ~var10 > ~(-class740.field10315.field10046)) {
                            class662.field9335 = true;
                        }
                    }
                    if (class740.field10315.field10025 != null && class662.field9335) {
                        class700 var11 = new class700();
                        var11.field9745 = class740.field10315;
                        var11.field9757 = class740.field10315.field10025;
                        var11.field9758 = var8;
                        var11.field9747 = var7;
                        class318.method1840(var11);
                        return;
                    }
                } else {
                    if (class662.field9335) {
                        class254.method1598((byte) -121);
                        if (class740.field10315.field10059 != null) {
                            class700 var12 = new class700();
                            var12.field9752 = class692.field9684;
                            var12.field9745 = class740.field10315;
                            var12.field9757 = class740.field10315.field10059;
                            var12.field9747 = var7;
                            var12.field9758 = var8;
                            class318.method1840(var12);
                        }
                        if (class692.field9684 != null && client.method2683(class740.field10315) != null) {
                            class507.method3026(class692.field9684, true, class740.field10315);
                        }
                    } else if ((class536.field7507 == 1 || class647.method3753(1002)) && class605.field8642 > 2) {
                        class510.method3042(class281.field3737 - -class659.field9306, class42.field593 + class138.field1900, (byte) -108);
                    } else if (class4.method18(-3427)) {
                        class510.method3042(class659.field9306 + class281.field3737, class42.field593 + class138.field1900, (byte) -107);
                    }
                    class740.field10315 = null;
                }
            }
        } else {
            if (~class223.field3142 < -2) {
                class740.field10315 = null;
            }
        }
    }

    @OriginalMember(owner = "client!rh", name = "<init>", descriptor = "(Lep;IIZ[[I)V", line = 163)
    public class633(class371 arg0, int arg1, int arg2, boolean arg3, int[][] arg4) {
        super(arg0, 34067, arg1, arg2 * arg2 * 6, arg3);
        this.field9009 = arg2;
        super.field5514.method2154(this, -2);
        if (arg3) {
            for (int var6 = 0; var6 < 6; ++var6) {
                class616.method3618(super.field5514.field5075, arg2, arg4[var6], 32993, super.field5509, (byte) -48, arg2, 34069 - -var6);
            }
        } else {
            for (int var7 = 0; var7 < 6; ++var7) {
                OpenGL.glTexImage2Di(var7 + 34069, 0, super.field5509, arg2, arg2, 0, 32993, super.field5514.field5075, arg4[var7], 0);
            }
        }
        this.method2419(true, true);
    }

    @OriginalMember(owner = "client!rh", name = "<init>", descriptor = "(Lep;IIZ[[BI)V", line = 194)
    public class633(class371 arg0, int arg1, int arg2, boolean arg3, byte[][] arg4, int arg5) {
        super(arg0, 34067, arg1, arg2 * 6 * arg2, arg3);
        this.field9009 = arg2;
        super.field5514.method2154(this, -2);
        for (int var7 = 0; ~var7 > -7; ++var7) {
            OpenGL.glTexImage2Dub(var7 + 34069, 0, super.field5509, arg2, arg2, 0, arg5, 5121, arg4[var7], 0);
        }
        this.method2419(true, true);
    }

    @OriginalMember(owner = "client!rh", name = "b", descriptor = "(IZ)V", line = 214)
    public static final void method3680(int arg0, boolean arg1) {
        ++field9011;
        if (~class577.field8263.length() != arg0) {
            class645.method3738("--> " + class577.field8263, (byte) -49);
            class564.method3367(arg0 ^ -116, arg1, class577.field8263, false);
            class718.field10149 = 0;
            class577.field8263 = "";
            class199.field2878 = 0;
        }
    }

    @OriginalMember(owner = "client!rh", name = "<init>", descriptor = "(Lep;II)V", line = 230)
    public class633(class371 arg0, int arg1, int arg2) {
        super(arg0, 34067, arg1, arg2 * 6 * arg2, false);
        this.field9009 = arg2;
        super.field5514.method2154(this, -2);
        for (int var4 = 0; var4 < 6; ++var4) {
            OpenGL.glTexImage2Dub(34069 - -var4, 0, super.field5509, arg2, arg2, 0, class743.method4144(super.field5509, 6410), 5121, (byte[]) null, 0);
        }
        this.method2419(true, true);
    }
}
