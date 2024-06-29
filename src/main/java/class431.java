import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qe")
public class class431 extends class657 {

    @OriginalMember(owner = "client!qe", name = "z", descriptor = "I")
    private int field6313 = -1;

    @OriginalMember(owner = "client!qe", name = "G", descriptor = "I")
    private int field6319 = -1;

    @OriginalMember(owner = "client!qe", name = "D", descriptor = "I")
    public int field6317;

    @OriginalMember(owner = "client!qe", name = "A", descriptor = "[Lvr;")
    public static class121[] field6314 = new class121[75];

    @OriginalMember(owner = "client!qe", name = "x", descriptor = "Ldg;")
    public static class376 field6311 = new class376(12, 8);

    @OriginalMember(owner = "client!qe", name = "w", descriptor = "I")
    public static int field6310;

    @OriginalMember(owner = "client!qe", name = "y", descriptor = "I")
    public static int field6312;

    @OriginalMember(owner = "client!qe", name = "B", descriptor = "I")
    public static int field6315;

    @OriginalMember(owner = "client!qe", name = "C", descriptor = "I")
    public static int field6316;

    @OriginalMember(owner = "client!qe", name = "F", descriptor = "I")
    public static int field6318;

    @OriginalMember(owner = "client!qe", name = "<init>", descriptor = "(Lok;IIZ[[I)V", line = 3)
    public class431(class228 arg0, int arg1, int arg2, boolean arg3, int[][] arg4) {
        super(arg0, 34067, arg1, arg2 * 6 * arg2, arg3);
        this.field6317 = arg2;
        super.field9210.method1505(-2, this);
        if (arg3) {
            for (int var6 = 0; var6 < 6; ++var6) {
                class329.method2072(super.field9208, arg2, arg2, arg4[var6], 32993, 2, var6 + 34069, super.field9210.field3547);
            }
        } else {
            for (int var7 = 0; ~var7 > -7; ++var7) {
                OpenGL.glTexImage2Di(34069 - -var7, 0, super.field9208, arg2, arg2, 0, 32993, super.field9210.field3547, arg4[var7], 0);
            }
        }
        this.method3617((byte) 41, true);
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(IIIIB)V", line = 34)
    public final void method2570(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        ++field6312;
        if (arg4 >= -118) {
            field6311 = null;
        }
        OpenGL.glFramebufferTexture2DEXT(arg2, arg3, arg0, super.field9223, arg1);
        this.field6319 = arg3;
        this.field6313 = arg2;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(I)V", line = 47)
    public final void method226(int arg0) {
        ++field6310;
        OpenGL.glFramebufferTexture2DEXT(this.field6313, this.field6319, 3553, 0, 0);
        this.field6313 = -1;
        this.field6319 = arg0;
    }

    @OriginalMember(owner = "client!qe", name = "<init>", descriptor = "(Lok;IIZ[[BI)V", line = 59)
    public class431(class228 arg0, int arg1, int arg2, boolean arg3, byte[][] arg4, int arg5) {
        super(arg0, 34067, arg1, arg2 * arg2 * 6, arg3);
        this.field6317 = arg2;
        super.field9210.method1505(-2, this);
        for (int var7 = 0; var7 < 6; ++var7) {
            OpenGL.glTexImage2Dub(var7 + 34069, 0, super.field9208, arg2, arg2, 0, arg5, 5121, arg4[var7], 0);
        }
        this.method3617((byte) 41, true);
    }

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "(Z)V", line = 81)
    public static void method2571(boolean arg0) {
        if (!arg0) {
            field6314 = null;
        }
        field6311 = null;
        field6314 = null;
    }

    @OriginalMember(owner = "client!qe", name = "<init>", descriptor = "(Lok;II)V", line = 132)
    public class431(class228 arg0, int arg1, int arg2) {
        super(arg0, 34067, arg1, arg2 * arg2 * 6, false);
        this.field6317 = arg2;
        super.field9210.method1505(-2, this);
        for (int var4 = 0; ~var4 > -7; ++var4) {
            OpenGL.glTexImage2Dub(var4 + 34069, 0, super.field9208, arg2, arg2, 0, class145.method1035(super.field9208, 6408), 5121, (byte[]) null, 0);
        }
        this.method3617((byte) 41, true);
    }

    @OriginalMember(owner = "client!qe", name = "c", descriptor = "(B)V", line = 99)
    public static final void method2572(byte arg0) {
        ++field6316;
        int var1 = 67 % ((arg0 - -30) / 43);
        for (class697 var2 = (class697) class302.field4494.method472((byte) -96); var2 != null; var2 = (class697) class302.field4494.method482(-39)) {
            if (var2.field9862 != -1) {
                var2.method3678(-1);
            } else {
                var2.field9873 = 0;
                if (~var2.field9870 <= -1 && ~var2.field9874 <= -1 && ~var2.field9870 > ~class199.field2812 && var2.field9874 < class232.field3611) {
                    class188.method1268(var2, (byte) 27);
                }
            }
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(IIILvg;)V", line = 151)
    public static final void method2573(int arg0, int arg1, int arg2, class49 arg3) {
        ++field6315;
        if (arg3 != null) {
            if (arg3.field931 != null) {
                class14 var4 = new class14();
                var4.field122 = arg3.field931;
                var4.field129 = arg3;
                class220.method1443(var4);
            }
            class484.field6876 = arg3.field903;
            class435.field6357 = arg2;
            class642.field9054 = arg1;
            class189.field2716 = arg3.field914;
            class654.field9181 = arg3.field1023;
            class190.field2750 = arg3.field925;
            class245.field3797 = true;
            if (arg0 != 0) {
                field6318 = -84;
            }
            class19.field223 = arg3.field977;
            class563.method3215(true, arg3);
        }
    }
}
