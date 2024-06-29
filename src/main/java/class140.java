import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fca")
public class class140 extends class325 {

    @OriginalMember(owner = "client!fca", name = "u", descriptor = "I")
    private int field1541 = -1;

    @OriginalMember(owner = "client!fca", name = "w", descriptor = "I")
    private int field1543 = -1;

    @OriginalMember(owner = "client!fca", name = "x", descriptor = "I")
    public int field1544;

    @OriginalMember(owner = "client!fca", name = "B", descriptor = "Lcq;")
    public static class110 field1547 = new class110(53, -2);

    @OriginalMember(owner = "client!fca", name = "E", descriptor = "I")
    public static int field1550 = 104;

    @OriginalMember(owner = "client!fca", name = "v", descriptor = "I")
    public static int field1542;

    @OriginalMember(owner = "client!fca", name = "y", descriptor = "I")
    public static int field1545;

    @OriginalMember(owner = "client!fca", name = "z", descriptor = "I")
    public static int field1546;

    @OriginalMember(owner = "client!fca", name = "C", descriptor = "I")
    public static int field1548;

    @OriginalMember(owner = "client!fca", name = "D", descriptor = "Lwi;")
    public static class540 field1549;

    @OriginalMember(owner = "client!fca", name = "F", descriptor = "Ltf;")
    public static class701 field1551;

    @OriginalMember(owner = "client!fca", name = "H", descriptor = "[Lir;")
    public static class27[] field1552;

    @OriginalMember(owner = "client!fca", name = "<init>", descriptor = "(Lvj;II)V", line = 3)
    public class140(class422 arg0, int arg1, int arg2) {
        super(arg0, 34067, arg1, arg2 * arg2 * 6, false);
        this.field1544 = arg2;
        super.field3991.method2396((byte) 36, this);
        for (int var4 = 0; ~var4 > -7; ++var4) {
            OpenGL.glTexImage2Dub(34069 - -var4, 0, super.field4000, arg2, arg2, 0, class396.method2242(super.field4000, false), 5121, (byte[]) null, 0);
        }
        this.method1839(true, (byte) 40);
    }

    @OriginalMember(owner = "client!fca", name = "<init>", descriptor = "(Lvj;IIZ[[I)V", line = 208)
    public class140(class422 arg0, int arg1, int arg2, boolean arg3, int[][] arg4) {
        super(arg0, 34067, arg1, arg2 * 6 * arg2, arg3);
        this.field1544 = arg2;
        super.field3991.method2396((byte) 36, this);
        if (!arg3) {
            for (int var6 = 0; ~var6 > -7; ++var6) {
                OpenGL.glTexImage2Di(34069 - -var6, 0, super.field4000, arg2, arg2, 0, 32993, super.field3991.field5908, arg4[var6], 0);
            }
        } else {
            for (int var7 = 0; ~var7 > -7; ++var7) {
                class443.method2568(arg4[var7], arg2, super.field3991.field5908, arg2, 32993, 29914, super.field4000, 34069 - -var7);
            }
        }
        this.method1839(true, (byte) 55);
    }

    @OriginalMember(owner = "client!fca", name = "<init>", descriptor = "(Lvj;IIZ[[BI)V", line = 249)
    public class140(class422 arg0, int arg1, int arg2, boolean arg3, byte[][] arg4, int arg5) {
        super(arg0, 34067, arg1, arg2 * 6 * arg2, arg3);
        this.field1544 = arg2;
        super.field3991.method2396((byte) 36, this);
        for (int var7 = 0; var7 < 6; ++var7) {
            OpenGL.glTexImage2Dub(var7 + 34069, 0, super.field4000, arg2, arg2, 0, arg5, 5121, arg4[var7], 0);
        }
        this.method1839(true, (byte) 109);
    }

    @OriginalMember(owner = "client!fca", name = "a", descriptor = "(Lr;IBIII)V", line = 24)
    public static final void method778(class564 arg0, int arg1, byte arg2, int arg3, int arg4, int arg5) {
        ++field1548;
        arg0.method982(arg5, arg4, arg1 + arg5, arg3 + arg4);
        if (arg2 > -29) {
            method778((class564) null, -10, (byte) -2, -26, -78, -120);
        }
        arg0.method3206(arg3, (byte) 84, arg5, arg4, -16777216, arg1);
        if (~class96.field1028 <= -101) {
            float var6 = (float) class482.field6964 / (float) class482.field6946;
            int var7 = arg1;
            int var8 = arg3;
            if (!(var6 < 1.0F)) {
                var7 = (int) ((float) arg3 / var6);
            } else {
                var8 = (int) ((float) arg1 * var6);
            }
            int var9 = (arg3 - var8) / 2 + arg4;
            int var10 = (-var7 + arg1) / 2 + arg5;
            if (class320.field3944 == null || ~arg1 != ~class320.field3944.method315() || class320.field3944.method306() != arg3) {
                class482.method2769(class482.field6943, class482.field6964 + class482.field6951, class482.field6946 + class482.field6943, class482.field6951, var10, var9, var10 - -var7, var8 + var9);
                class482.method2790(arg0);
                class320.field3944 = arg0.method951(var10, var9, var7, var8, false);
            }
            class320.field3944.method3001(var10, var9);
            int var11 = class554.field7914 * var7 / class482.field6946;
            int var12 = class100.field1079 * var8 / class482.field6964;
            int var13 = class609.field8520 * var7 / class482.field6946 + var10;
            int var14 = -(class222.field2744 * var8 / class482.field6964) - var12 + var9 + var8;
            int var15 = -1996554240;
            if (class312.field3886 == class246.field3031) {
                var15 = -1996488705;
            }
            arg0.method1022(var13, var14, var11, var12, var15, 1);
            arg0.method999(var13, var14, var11, var12, var15, 0);
            if (~class269.field3346 < -1) {
                int var16;
                if (class348.field4660 <= 50) {
                    var16 = class348.field4660 * 5;
                } else {
                    var16 = (-class348.field4660 + 100) * 5;
                }
                for (class679 var17 = (class679) class482.field6939.method3434((byte) 2); var17 != null; var17 = (class679) class482.field6939.method3430(true)) {
                    class655 var18 = class482.field6927.method705(var17.field9562, -127);
                    if (class302.method1753((byte) -71, var18)) {
                        if (class254.field3190 != var17.field9562) {
                            if (class599.field8437 != -1 && ~class599.field8437 == ~var18.field9193) {
                                int var19 = var17.field9572 * var7 / class482.field6946 + var10;
                                int var20 = (-var17.field9563 + class482.field6964) * var8 / class482.field6964 + var9;
                                arg0.method3206(4, (byte) 120, var19 + -2, var20 + -2, 16776960 | var16 << 24, 4);
                            }
                        } else {
                            int var21 = var17.field9572 * var7 / class482.field6946 + var10;
                            int var22 = (-var17.field9563 + class482.field6964) * var8 / class482.field6964 + var9;
                            arg0.method3206(4, (byte) 118, var21 + -2, var22 - 2, var16 << 24 | 16776960, 4);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!fca", name = "c", descriptor = "(B)V", line = 122)
    public static void method779(byte arg0) {
        int var1 = -40 / ((4 - arg0) / 63);
        field1551 = null;
        field1552 = null;
        field1547 = null;
        field1549 = null;
    }

    @OriginalMember(owner = "client!fca", name = "a", descriptor = "(Lwl;ILkca;Lr;BILfg;I)V", line = 134)
    public static final void method780(class679 arg0, int arg1, class655 arg2, class564 arg3, byte arg4, int arg5, class174 arg6, int arg7) {
        ++field1545;
        int var8 = arg0.field9560 + -5 + -(arg1 / 2);
        int var9 = arg5 + 2;
        if (arg4 < 31) {
            method778((class564) null, -113, (byte) 43, 80, -9, 61);
        }
        if (~arg2.field9210 != -1) {
            arg3.method3206(arg7 * arg6.method1062() + arg5 - var9 - -1, (byte) 107, var8, var9, arg2.field9210, arg1 - -10);
        }
        if (~arg2.field9218 != -1) {
            arg3.method3201(arg2.field9218, arg1 - -10, 6195, -var9 + 1 + arg6.method1062() * arg7 + arg5, var9, var8);
        }
        int var10 = arg2.field9202;
        if (arg0.field9570 && ~arg2.field9215 != 0) {
            var10 = arg2.field9215;
        }
        for (int var11 = 0; arg7 > var11; ++var11) {
            String var12 = class610.field8592[var11];
            if (arg7 + -1 > var11) {
                var12 = var12.substring(0, -4 + var12.length());
            }
            arg6.method1060(arg3, var12, arg0.field9560, arg5, var10, true);
            arg5 += arg6.method1062();
        }
    }

    @OriginalMember(owner = "client!fca", name = "a", descriptor = "(I)V", line = 175)
    public final void method459(int arg0) {
        ++field1546;
        OpenGL.glFramebufferTexture2DEXT(this.field1541, this.field1543, 3553, 0, 0);
        this.field1543 = -1;
        if (arg0 != Integer.MIN_VALUE) {
            this.method459(-117);
        }
        this.field1541 = -1;
    }

    @OriginalMember(owner = "client!fca", name = "a", descriptor = "(IIIII)V", line = 192)
    public final void method781(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field1542;
        OpenGL.glFramebufferTexture2DEXT(arg0, arg3, arg2, super.field3996, arg4);
        this.field1541 = arg0;
        this.field1543 = arg3;
        if (arg1 != -16777216) {
            method779((byte) 98);
        }
    }
}
