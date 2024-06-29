import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ov")
public class class189 extends class657 {

    @OriginalMember(owner = "client!ov", name = "s", descriptor = "Lbga;")
    private class358 field2824;

    @OriginalMember(owner = "client!ov", name = "q", descriptor = "Lur;")
    private class537 field2822;

    @OriginalMember(owner = "client!ov", name = "p", descriptor = "Lqr;")
    private class65 field2821;

    @OriginalMember(owner = "client!ov", name = "t", descriptor = "I")
    public static int field2825 = 0;

    @OriginalMember(owner = "client!ov", name = "i", descriptor = "I")
    public static int field2814;

    @OriginalMember(owner = "client!ov", name = "j", descriptor = "I")
    public static int field2815;

    @OriginalMember(owner = "client!ov", name = "k", descriptor = "I")
    public static int field2816;

    @OriginalMember(owner = "client!ov", name = "l", descriptor = "I")
    public static int field2817;

    @OriginalMember(owner = "client!ov", name = "n", descriptor = "I")
    public static int field2819;

    @OriginalMember(owner = "client!ov", name = "o", descriptor = "I")
    public static int field2820;

    @OriginalMember(owner = "client!ov", name = "r", descriptor = "I")
    public static int field2823;

    @OriginalMember(owner = "client!ov", name = "m", descriptor = "[[[S")
    public static short[][][] field2818;

    @OriginalMember(owner = "client!ov", name = "a", descriptor = "(IIIILfha;)V")
    public static final void method1363(int arg0, int arg1, int arg2, int arg3, class380 arg4) {
        class384 var5 = class410.method2541(arg0, arg1, arg2);
        if (var5 != null) {
            arg4.field5922 = (arg1 << class130.field2185) + class72.field1328;
            arg4.field5927 = arg3;
            arg4.field5933 = (arg2 << class130.field2185) + class72.field1328;
            var5.field5579 = arg4;
            int var6 = class683.field9250 == class344.field4822 ? 1 : 0;
            if (arg4.method45(-52)) {
                if (arg4.method49((byte) 122)) {
                    arg4.field5924 = class391.field5762[var6];
                    class391.field5762[var6] = arg4;
                    return;
                }
                arg4.field5924 = class362.field5206[var6];
                class362.field5206[var6] = arg4;
                class30.field778 = true;
                return;
            }
            arg4.field5924 = class375.field5310[var6];
            class375.field5310[var6] = arg4;
        }
    }

    @OriginalMember(owner = "client!ov", name = "a", descriptor = "(ILdu;I)V")
    public final void method736(int arg0, class357 arg1, int arg2) {
        ++field2816;
        if (arg2 != -16776) {
            this.field2824 = null;
        }
    }

    @OriginalMember(owner = "client!ov", name = "a", descriptor = "(IZ)V")
    public final void method735(int arg0, boolean arg1) {
        if (arg0 == 15192) {
            ++field2815;
            OpenGL.glBindProgramARB(34336, this.field2821.field1246);
            OpenGL.glEnable(34336);
            super.field9010.method4096((byte) 47, 0, class380.field5528);
        }
    }

    @OriginalMember(owner = "client!ov", name = "<init>", descriptor = "(Lbga;Lin;Lur;)V")
    public class189(class358 arg0, class91 arg1, class537 arg2) {
        super(arg0);
        this.field2824 = arg0;
        this.field2822 = arg2;
        if (arg1 != null && this.field2822.method3090(100) && this.field2824.field5174) {
            this.field2821 = class221.method1571(34336, arg1.method844("gl", "transparent_water", -29832), this.field2824, 4);
        } else {
            this.field2821 = null;
        }
    }

    @OriginalMember(owner = "client!ov", name = "a", descriptor = "(ZB)V")
    public final void method734(boolean arg0, byte arg1) {
        if (arg1 != -103) {
            field2818 = null;
        }
        super.field9010.method4112(class72.field1302, 106, class720.field9793);
        ++field2820;
    }

    @OriginalMember(owner = "client!ov", name = "a", descriptor = "(B)V")
    public final void method728(byte arg0) {
        ++field2823;
        if (arg0 == 87) {
            super.field9010.method4096((byte) 47, 0, class755.field10544);
            OpenGL.glBindProgramARB(34336, 0);
            OpenGL.glDisable(34820);
            OpenGL.glDisable(34336);
        }
    }

    @OriginalMember(owner = "client!ov", name = "g", descriptor = "(I)V")
    public static void method1364(int arg0) {
        field2818 = null;
        if (arg0 != 34336) {
            field2825 = 99;
        }
    }

    @OriginalMember(owner = "client!ov", name = "a", descriptor = "(III)V")
    public final void method730(int arg0, int arg1, int arg2) {
        ++field2814;
        if (arg0 == 10756) {
            if (!this.field2822.field7428) {
                int var4 = super.field9010.field10260 % 4000 * 16 / 4000;
                super.field9010.method4097((byte) -118, this.field2822.field7429[var4]);
                OpenGL.glProgramLocalParameter4fARB(34336, 0, 0.0F, 0.0F, 0.0F, 1.0F);
            } else {
                float var5 = (float) (super.field9010.field10260 % 4000) / 4000.0F;
                super.field9010.method4097((byte) 79, this.field2822.field7422);
                OpenGL.glProgramLocalParameter4fARB(34336, 0, var5, 0.0F, 0.0F, 1.0F);
            }
        }
    }

    @OriginalMember(owner = "client!ov", name = "e", descriptor = "(I)Z")
    public final boolean method731(int arg0) {
        ++field2817;
        if (arg0 >= -57) {
            return true;
        } else {
            return this.field2821 != null;
        }
    }

    @OriginalMember(owner = "client!ov", name = "a", descriptor = "(ZLjava/lang/String;)V")
    public static final void method1365(boolean arg0, String arg1) {
        ++field2819;
        if (arg1 != null) {
            if (arg1.startsWith("*")) {
                arg1 = arg1.substring(1);
            }
            String var2 = class115.method1015(2, arg1);
            if (var2 != null) {
                if (!arg0) {
                    method1363(9, 65, -72, 107, (class380) null);
                }
                for (int var3 = 0; ~var3 > ~class324.field4501; ++var3) {
                    String var4 = class99.field1767[var3];
                    if (var4.startsWith("*")) {
                        var4 = var4.substring(1);
                    }
                    String var5 = class115.method1015(2, var4);
                    if (var5 != null && var5.equals(var2)) {
                        --class324.field4501;
                        for (int var6 = var3; class324.field4501 > var6; ++var6) {
                            class99.field1767[var6] = class99.field1767[var6 + 1];
                            class514.field7147[var6] = class514.field7147[var6 + 1];
                            class438.field6245[var6] = class438.field6245[var6 + 1];
                            class393.field5774[var6] = class393.field5774[var6 + 1];
                            class240.field3502[var6] = class240.field3502[var6 - -1];
                        }
                        ++class115.field1976;
                        class646.field8887 = class253.field3660;
                        class564 var7 = class227.method1594(class59.field1162, class72.field1320, -123);
                        var7.field7778.method1526(false, class621.method3541(arg1, -65));
                        var7.field7778.method1481((byte) -5, arg1);
                        class167.method1260(118, var7);
                        return;
                    }
                }
            }
        }
    }
}
