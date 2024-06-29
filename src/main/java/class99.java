import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wh")
public class class99 extends class200 {

    @OriginalMember(owner = "client!wh", name = "y", descriptor = "[B")
    public byte[] field1639;

    @OriginalMember(owner = "client!wh", name = "x", descriptor = "Z")
    public static boolean field1638 = false;

    @OriginalMember(owner = "client!wh", name = "u", descriptor = "I")
    public static int field1635;

    @OriginalMember(owner = "client!wh", name = "v", descriptor = "I")
    public static int field1636;

    @OriginalMember(owner = "client!wh", name = "w", descriptor = "I")
    public static int field1637;

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(BI)I")
    public static final int method739(byte arg0, int arg1) {
        field1637++;
        int var2 = 37 % ((arg0 - 40) / 55);
        return arg1 >>> 8;
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(IIIII[III)V")
    public static final void method740(int arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5, int arg6, int arg7) {
        field1636++;
        if (arg4 > 0 && !class354.method2243(arg2 + 21467, arg4)) {
            throw new IllegalArgumentException("");
        } else if (arg3 > 0 && !class354.method2243(0, arg3)) {
            throw new IllegalArgumentException("");
        } else if (arg7 == 32993) {
            int var8 = 0;
            int var9 = arg4 >= arg3 ? arg3 : arg4;
            int var10 = arg4 >> 1;
            int var11 = arg3 >> 1;
            if (arg2 != -21467) {
                field1638 = false;
            }
            int[] var12 = arg5;
            int[] var13 = new int[var10 * var11];
            while (true) {
                OpenGL.glTexImage2Di(arg0, var8, arg6, arg4, arg3, 0, arg7, arg1, var12, 0);
                if (var9 <= 1) {
                    return;
                }
                int var14 = 0;
                int var15 = 0;
                int var16 = arg4 + var15;
                for (int var17 = 0; var17 < var11; var17++) {
                    for (int var19 = 0; var19 < var10; var19++) {
                        int var20 = var12[var15++];
                        int var21 = var12[var15++];
                        int var22 = var12[var16++];
                        int var23 = var20 & 0xFF;
                        int var24 = (var20 & 0xFF04F1) >> 16;
                        int var25 = var20 >> 8 & 0xFF;
                        int var26 = var20 >> 24 & 0xFF;
                        int var27 = var12[var16++];
                        int var28 = (var21 >> 24 & 0xFF) + var26;
                        int var29 = (var21 & 0xFF) + var23;
                        int var30 = ((var21 & 0xFF22) >> 8) + var25;
                        int var31 = (var21 >> 16 & 0xFF) + var24;
                        int var32 = (var22 & 0xFF) + var29;
                        int var33 = ((var22 & 0xFFBF63) >> 16) + var31;
                        int var34 = (var22 >> 8 & 0xFF) + var30;
                        int var35 = (var22 >> 24 & 0xFF) + var28;
                        int var36 = (var27 >> 24 & 0xFF) + var35;
                        int var37 = (var27 >> 16 & 0xFF) + var33;
                        int var38 = (var27 & 0xFF) + var32;
                        int var39 = ((var27 & 0xFF13) >> 8) + var34;
                        var13[var14++] = class121.method909(class121.method909(class207.method1405(var39, 1020) << 6, class121.method909(class207.method1405(1020, var36) << 22, class207.method1405(var37, 1020) << 14)), class207.method1405(var38 >> 2, 255));
                    }
                    var15 += arg4;
                    var16 += arg4;
                }
                int[] var18 = var13;
                var13 = var12;
                arg3 = var11;
                arg4 = var10;
                var12 = var18;
                var9 >>= 0x1;
                var10 >>= 0x1;
                var11 >>= 0x1;
                var8++;
            }
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(Lqa;IILia;III[[[B[I[I[I[I[IIBIIZ)V")
    public static final void method741(class162 arg0, int arg1, int arg2, class414 arg3, int arg4, int arg5, int arg6, byte[][][] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, byte arg14, int arg15, int arg16, boolean arg17) {
        class95.field1609 = arg0;
        class416.field6218 = arg1;
        class65.field1126 = arg3;
        class165.field2567 = class95.field1609.method293() > 0;
        class267.field3846 = arg4 >> class426.field6345;
        class388.field5834 = arg6 >> class426.field6345;
        class472.field7077 = arg4;
        class350.field5363 = arg6;
        class455.field6800 = arg5;
        class451.field6738 = class267.field3846 - class369.field5579;
        if (class451.field6738 < 0) {
            class345.field5181 = -class451.field6738;
            class451.field6738 = 0;
        } else {
            class345.field5181 = 0;
        }
        class363.field5501 = class388.field5834 - class369.field5579;
        if (class363.field5501 < 0) {
            class291.field4150 = -class363.field5501;
            class363.field5501 = 0;
        } else {
            class291.field4150 = 0;
        }
        class1.field2 = class369.field5579 + class267.field3846;
        if (class1.field2 > class151.field2408) {
            class1.field2 = class151.field2408;
        }
        class252.field3602 = class388.field5834 + class369.field5579;
        if (class252.field3602 > class261.field3792) {
            class252.field3602 = class261.field3792;
        }
        for (int var18 = 0; var18 < class369.field5579 + class369.field5579 + 2; var18++) {
            for (int var23 = 0; var23 < class369.field5579 + class369.field5579 + 2; var23++) {
                int var24 = class267.field3846 + var18 - class369.field5579;
                int var25 = class388.field5834 + var23 - class369.field5579;
                if (var24 >= 0 && var25 >= 0 && var24 < class151.field2408 && var25 < class261.field3792) {
                    int var26 = var24 << class426.field6345;
                    int var27 = var25 << class426.field6345;
                    int var28 = class43.field829[class43.field829.length - 1].method376(var24, var25) - (0x3E8 << class426.field6345 - 7);
                    int var29 = class335.field5061 == null ? class43.field829[0].method376(var24, var25) + class177.field2697 : class335.field5061[0].method376(var24, var25) + class177.field2697;
                    class20.field352[var18][var23] = class95.field1609.method274(var26, var28, var27, var26, var29, var27);
                } else {
                    class20.field352[var18][var23] = false;
                }
            }
        }
        for (int var19 = 0; var19 < class369.field5579 + class369.field5579 + 1; var19++) {
            for (int var22 = 0; var22 < class369.field5579 + class369.field5579 + 1; var22++) {
                class62.field1078[var19][var22] = class20.field352[var19][var22] || class20.field352[var19 + 1][var22] || class20.field352[var19][var22 + 1] || class20.field352[var19 + 1][var22 + 1];
            }
        }
        class482.field7166 = arg8;
        class502.field7409 = arg9;
        class521.field7737 = arg10;
        class500.field7379 = arg11;
        class286.field4071 = arg12;
        class377.method2346();
        class495.method2975(1);
        for (class163 var20 = (class163) class221.field3167.method1640(false); var20 != null; var20 = (class163) class221.field3167.method1641(true)) {
            var20.method360(true);
            class329.method2110(var20, (byte) -101);
        }
        if (class165.field2567) {
            for (int var21 = 0; var21 < class161.field2494; var21++) {
                class448.field6723[var21].method2733(arg17, arg1, 7201);
            }
        }
        if (arg2 > 1) {
            class95.field1609.method212(0);
            if (class318.field4777 == null || class318.field4777 instanceof class28) {
                class318.field4777 = new class518();
            }
        } else if (class318.field4777 == null || class318.field4777 instanceof class518) {
            class318.field4777 = new class28();
        }
        class318.field4777.method328(0, arg2);
        class318.field4777.method329((byte) 76);
        if (class268.field3870 != null) {
            class102.method763(true);
            class318.field4777.method331(-119, 22);
            class132.method986(arg2, null, 0, (byte) 0, arg15, arg16);
            class318.field4777.method329((byte) 97);
            class318.field4777.method331(108, 23);
            class102.method763(false);
        }
        class132.method986(arg2, arg7, arg13, arg14, arg15, arg16);
        class318.field4777.method329((byte) 76);
        class318.field4777.method327(1);
        class318.field4777.method329((byte) 122);
        if (arg2 > 1) {
            class95.field1609.method277(0);
        }
        class95.field1609.method289(0, null);
    }

    @OriginalMember(owner = "client!wh", name = "<init>", descriptor = "([B)V")
    public class99(byte[] arg0) {
        this.field1639 = arg0;
    }
}
