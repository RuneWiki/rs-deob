import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tv")
public class class78 {

    @OriginalMember(owner = "client!tv", name = "b", descriptor = "Z")
    public boolean field1118 = true;

    @OriginalMember(owner = "client!tv", name = "k", descriptor = "I")
    private int field1127 = -1;

    @OriginalMember(owner = "client!tv", name = "m", descriptor = "Lkw;")
    private class346 field1129;

    @OriginalMember(owner = "client!tv", name = "f", descriptor = "I")
    private int field1122;

    @OriginalMember(owner = "client!tv", name = "j", descriptor = "I")
    private int field1126;

    @OriginalMember(owner = "client!tv", name = "i", descriptor = "Lcea;")
    private class93 field1125;

    @OriginalMember(owner = "client!tv", name = "a", descriptor = "I")
    private int field1117;

    @OriginalMember(owner = "client!tv", name = "e", descriptor = "Llo;")
    private class116 field1121;

    @OriginalMember(owner = "client!tv", name = "p", descriptor = "Ljs;")
    private class171 field1132;

    @OriginalMember(owner = "client!tv", name = "n", descriptor = "Lol;")
    private class246 field1130;

    @OriginalMember(owner = "client!tv", name = "q", descriptor = "I")
    public static int field1133 = 0;

    @OriginalMember(owner = "client!tv", name = "l", descriptor = "Lsm;")
    public static class387 field1128 = new class387("", 12);

    @OriginalMember(owner = "client!tv", name = "t", descriptor = "Ldj;")
    public static class703 field1136 = new class703(12, 0, 1, 0);

    @OriginalMember(owner = "client!tv", name = "c", descriptor = "I")
    public static int field1119;

    @OriginalMember(owner = "client!tv", name = "d", descriptor = "I")
    public static int field1120;

    @OriginalMember(owner = "client!tv", name = "g", descriptor = "I")
    public static int field1123;

    @OriginalMember(owner = "client!tv", name = "h", descriptor = "I")
    public static int field1124;

    @OriginalMember(owner = "client!tv", name = "o", descriptor = "I")
    public static int field1131;

    @OriginalMember(owner = "client!tv", name = "r", descriptor = "I")
    public static int field1134;

    @OriginalMember(owner = "client!tv", name = "s", descriptor = "I")
    public static int field1135;

    @OriginalMember(owner = "client!tv", name = "a", descriptor = "(III[B)V")
    public final void method642(int arg0, int arg1, int arg2, byte[] arg3) {
        if (arg1 != 512) {
            field1128 = null;
        }
        this.field1132.method821(this.field1129.method2159((byte) -111, arg2) * arg0, arg2, arg3, (byte) -64);
        field1134++;
        this.method643((byte) -36, this.field1132, arg0);
    }

    @OriginalMember(owner = "client!tv", name = "a", descriptor = "(BLlo;I)V")
    private final void method643(byte arg0, class116 arg1, int arg2) {
        field1131++;
        if (arg2 == 0) {
            return;
        }
        this.method647(24);
        this.field1129.method2164(6, this.field1130);
        this.field1129.method2135(4, arg1, 0, arg2, 59);
        if (arg0 != -36) {
            this.field1117 = 18;
        }
    }

    @OriginalMember(owner = "client!tv", name = "a", descriptor = "(I)V")
    public static void method644(int arg0) {
        if (arg0 != 12) {
            field1133 = 105;
        }
        field1128 = null;
        field1136 = null;
    }

    @OriginalMember(owner = "client!tv", name = "a", descriptor = "(BILcs;)V")
    public static final void method645(byte arg0, int arg1, class335 arg2) {
        int var3 = 94 % ((-arg0 - 21) / 55);
        field1123++;
        int var4 = -1;
        int var5 = 0;
        if (class703.field9918 < arg2.field4628) {
            class141.method997(-24023, arg2);
        } else if (class703.field9918 > arg2.field4586) {
            class502.method3056((byte) 107, arg2, false);
            var5 = class465.field6624;
            var4 = class235.field3517;
        } else {
            class431.method2659(arg2, (byte) -70);
        }
        if (arg2.field3923 < 512 || arg2.field3916 < 512 || arg2.field3923 >= ((class184.field2546 - 1) * 512) || arg2.field3916 >= class240.field3555 * 512 - 512) {
            arg2.field4545 = -1;
            arg2.field4564 = null;
            var5 = 0;
            arg2.field4586 = 0;
            var4 = -1;
            arg2.field4544 = -1;
            arg2.field4547 = -1;
            arg2.field4628 = 0;
            arg2.field3923 = arg2.field4646[0] * 512 + arg2.method2053(true) * 256;
            arg2.field3916 = arg2.field4645[0] * 512 + (arg2.method2053(true) * 256);
            arg2.method2062((byte) 124);
        }
        if (class108.field1536 == arg2 && (arg2.field3923 < 6144 || arg2.field3916 < 6144 || arg2.field3923 >= (class184.field2546 - 12) * 512 || ((class240.field3555 - 12) * 512) <= arg2.field3916)) {
            arg2.field4545 = -1;
            var4 = -1;
            arg2.field4586 = 0;
            arg2.field4544 = -1;
            var5 = 0;
            arg2.field4628 = 0;
            arg2.field4564 = null;
            arg2.field4547 = -1;
            arg2.field3923 = arg2.field4646[0] * 512 + arg2.method2053(true) * 256;
            arg2.field3916 = arg2.field4645[0] * 512 + arg2.method2053(true) * 256;
            arg2.method2062((byte) 120);
        }
        int var6 = class314.method1939(-67, arg2);
        class57.method546(arg2, -107);
        class364.method2291(-28, var4, var5, var6, arg2);
        class530.method3216(var4, -3587, arg2);
        class177.method1271(true, arg2);
    }

    @OriginalMember(owner = "client!tv", name = "b", descriptor = "(I)V")
    public final void method646(int arg0) {
        int var2 = 29 / ((arg0 - 87) / 39);
        this.method643((byte) -36, this.field1121, this.field1117);
        field1119++;
    }

    @OriginalMember(owner = "client!tv", name = "c", descriptor = "(I)V")
    private final void method647(int arg0) {
        field1120++;
        if (!this.field1118) {
            return;
        }
        this.field1118 = false;
        byte[] var2 = this.field1125.field1334;
        byte[] var3 = this.field1129.field5119;
        int var4 = 0;
        int var5 = this.field1125.field1342;
        int var6 = this.field1125.field1342 * this.field1126 + this.field1122;
        for (int var7 = -128; var7 < 0; var7++) {
            var4 = (var4 << 8) - var4;
            for (int var13 = -128; var13 < 0; var13++) {
                if (var2[var6++] != 0) {
                    var4++;
                }
            }
            var6 += var5 - 128;
        }
        if (this.field1130 != null && this.field1127 == var4) {
            this.field1118 = false;
            return;
        }
        this.field1127 = var4;
        int var8 = this.field1122 + (this.field1126 * var5);
        int var9 = 0;
        int var10 = -128;
        if (arg0 < 13) {
            return;
        }
        while (var10 < 0) {
            for (int var11 = -128; var11 < 0; var11++) {
                if (var2[var8] == 0) {
                    int var12 = 0;
                    if (var2[var8 - 1] != 0) {
                        var12++;
                    }
                    if (var2[var8 + 1] != 0) {
                        var12++;
                    }
                    if (var2[var8 - var5] != 0) {
                        var12++;
                    }
                    if (var2[var5 + var8] != 0) {
                        var12++;
                    }
                    var3[var9++] = (byte) (var12 * 17);
                } else {
                    var3[var9++] = 68;
                }
                var8++;
            }
            var8 += this.field1125.field1342 - 128;
            var10++;
        }
        if (this.field1130 == null) {
            this.field1130 = new class246(this.field1129, 3553, 6406, 128, 128, false, this.field1129.field5119, 6406, false);
            this.field1130.method1676(false, false, (byte) 52);
            this.field1130.method1131((byte) 42, true);
        } else {
            this.field1130.method1672(this.field1129.field5119, 0, 128, 6406, 0, 1622, 128, 0, false, 0);
        }
    }

    @OriginalMember(owner = "client!tv", name = "a", descriptor = "(I[BLmba;I)Lob;")
    public static final class4 method648(int arg0, byte[] arg1, class643 arg2, int arg3) {
        field1124++;
        if (arg1 == null) {
            return null;
        }
        int var4 = OpenGL.glGenProgramARB();
        OpenGL.glBindProgramARB(arg0, var4);
        OpenGL.glProgramRawARB(arg0, arg3, arg1);
        OpenGL.glGetIntegerv(34379, class3.field12, 0);
        if (class3.field12[0] == -1) {
            OpenGL.glBindProgramARB(arg0, 0);
            return new class4(arg2, arg0, var4);
        } else {
            OpenGL.glBindProgramARB(arg0, 0);
            return null;
        }
    }

    @OriginalMember(owner = "client!tv", name = "<init>", descriptor = "(Lkw;Lcea;Lmt;IIIII)V")
    public class78(class346 arg0, class93 arg1, class410 arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.field1129 = arg0;
        this.field1122 = arg6;
        this.field1126 = arg7;
        this.field1125 = arg1;
        int var9 = 0x1 << arg5;
        int var10 = 0;
        int var11 = arg3 << arg5;
        int var12 = arg4 << arg5;
        for (int var13 = 0; var13 < var9; var13++) {
            int var25 = (var12 + var13) * arg2.field4679 + var11;
            for (int var26 = 0; var26 < var9; var26++) {
                short[] var27 = arg2.field5844[var25++];
                if (var27 != null) {
                    var10 += var27.length;
                }
            }
        }
        this.field1117 = var10;
        if (var10 <= 0) {
            this.field1130 = null;
        } else {
            class479 var14 = new class479(var10 * 2);
            if (this.field1129.field5047) {
                for (int var20 = 0; var20 < var9; var20++) {
                    int var21 = (var12 + var20) * arg2.field4679 + var11;
                    for (int var22 = 0; var22 < var9; var22++) {
                        short[] var23 = arg2.field5844[var21++];
                        if (var23 != null) {
                            for (int var24 = 0; var24 < var23.length; var24++) {
                                var14.method2862(var23[var24] & 0xFFFF, -1166933656);
                            }
                        }
                    }
                }
            } else {
                for (int var15 = 0; var15 < var9; var15++) {
                    int var16 = (var12 + var15) * arg2.field4679 + var11;
                    for (int var17 = 0; var17 < var9; var17++) {
                        short[] var18 = arg2.field5844[var16++];
                        if (var18 != null) {
                            for (int var19 = 0; var19 < var18.length; var19++) {
                                var14.method2918(var18[var19] & 0xFFFF, (byte) 43);
                            }
                        }
                    }
                }
            }
            this.field1121 = this.field1129.method2139(true, 5123, var14.field6864, false, var14.field6800);
            this.field1132 = new class171(this.field1129, 5123, null, 1);
        }
    }
}
