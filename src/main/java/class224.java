import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sb")
public class class224 extends class211 {

    @OriginalMember(owner = "client!sb", name = "p", descriptor = "I")
    private int field4033 = -32768;

    @OriginalMember(owner = "client!sb", name = "u", descriptor = "Z")
    public static boolean field4038 = false;

    @OriginalMember(owner = "client!sb", name = "n", descriptor = "[Ls;")
    public static class237[] field4031 = new class237[2048];

    @OriginalMember(owner = "client!sb", name = "v", descriptor = "Lcf;")
    public static class93 field4039 = class147.method1066("Cabbage", -48);

    @OriginalMember(owner = "client!sb", name = "j", descriptor = "I")
    public static int field4027;

    @OriginalMember(owner = "client!sb", name = "k", descriptor = "I")
    public static int field4028;

    @OriginalMember(owner = "client!sb", name = "l", descriptor = "I")
    public static int field4029;

    @OriginalMember(owner = "client!sb", name = "m", descriptor = "I")
    public static int field4030;

    @OriginalMember(owner = "client!sb", name = "o", descriptor = "I")
    public int field4032;

    @OriginalMember(owner = "client!sb", name = "q", descriptor = "I")
    public static int field4034;

    @OriginalMember(owner = "client!sb", name = "r", descriptor = "I")
    public static int field4035;

    @OriginalMember(owner = "client!sb", name = "s", descriptor = "I")
    public int field4036;

    @OriginalMember(owner = "client!sb", name = "t", descriptor = "I")
    public static int field4037;

    @OriginalMember(owner = "client!sb", name = "w", descriptor = "I")
    public static int field4040;

    @OriginalMember(owner = "client!sb", name = "x", descriptor = "I")
    public static int field4041;

    @OriginalMember(owner = "client!sb", name = "y", descriptor = "I")
    public static int field4042;

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(IIIIIIIIJILod;)V")
    public final void method106(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class91 arg10) {
        class20 var13 = class89.method617(this.field4032, 0).method166(-1, -1, 0, 0, this.field4036, (class31) null);
        field4030++;
        if (var13 != null) {
            var13.method106(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10);
            this.field4033 = var13.method93();
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(ILhg;)V")
    public static final void method1551(int arg0, class177 arg1) {
        class280.field5021 = arg1.method1277(class39.field605, (byte) 74);
        class161.field2844 = arg1.method1277(class268.field4789, (byte) 74);
        field4035++;
        if (arg0 >= -116) {
            field4031 = null;
        }
    }

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "(I)V")
    public static final void method1552(int arg0) {
        class11 var1 = class272.field4835;
        synchronized (class272.field4835) {
            client.field2739++;
            class218.field3969 = class124.field2204;
            class227.field4056 = class245.field4402;
            class157.field2793 = class238.field4259;
            class93.field1648 = class56.field939;
            class193.field3527 = class80.field1498;
            class58.field992 = class170.field2986;
            class52.field859 = class35.field548;
            class56.field939 = arg0;
        }
        field4029++;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(IIIII)V")
    public final void method95(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field4028++;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "()I")
    public final int method93() {
        field4042++;
        return this.field4033;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(Lkj;IIII)V")
    public static final void method1553(class145 arg0, int arg1, int arg2, int arg3, int arg4) {
        field4034++;
        int var5 = -56 / ((50 - arg4) / 51);
        if (class253.field4549 >= 400) {
            return;
        }
        if (arg0.field2523 != null) {
            arg0 = arg0.method1058(249);
        }
        if (arg0 == null || !arg0.field2554) {
            return;
        }
        class93 var6 = arg0.field2516;
        if (arg0.field2560 != 0) {
            class93 var7 = class78.field1460 == 1 ? class70.field1281 : class151.field2645;
            var6 = class130.method949((byte) -77, new class93[] { var6, class14.method60(arg0.field2560, (byte) -114, class166.field2927.field4228), class271.field4823, var7, class148.method1067(-7015, arg0.field2560), class228.field4087 });
        }
        if (class268.field4769 == 1) {
            class45.field729++;
            class144.method1042((short) 47, (long) arg3, class220.field3994, class156.field2768, true, arg2, class130.method949((byte) -77, new class93[] { class97.field1738, class141.field2464, var6 }), arg1);
        } else if (class263.field4695) {
            class131 var15 = class7.field102 == -1 ? null : class30.method176(7255, class7.field102);
            if ((class210.field3799 & 0x2) != 0) {
                if (var15 == null || arg0.method1054(class7.field102, 80, var15.field2320) != var15.field2320) {
                    class79.field1473++;
                    class144.method1042((short) 44, (long) arg3, class54.field888, class153.field2683, true, arg2, class130.method949((byte) -77, new class93[] { class66.field1206, class141.field2464, var6 }), arg1);
                }
                return;
            }
        } else {
            class185.field3413++;
            class93[] var8 = arg0.field2547;
            if (class168.field2959) {
                var8 = class157.method1123(var8, true);
            }
            if (var8 != null) {
                for (int var9 = 4; var9 >= 0; var9--) {
                    if (var8[var9] != null && (class78.field1460 != 0 || !var8[var9].method649(class42.field662, -4446))) {
                        class181.field3255++;
                        byte var10 = 0;
                        int var11 = -1;
                        if (var9 == 0) {
                            var10 = 21;
                        }
                        if (var9 == 1) {
                            var10 = 30;
                        }
                        if (var9 == 2) {
                            var10 = 35;
                        }
                        if (arg0.field2519 == var9) {
                            var11 = arg0.field2527;
                        }
                        if (var9 == 3) {
                            var10 = 60;
                        }
                        if (var9 == 4) {
                            var10 = 39;
                        }
                        if (arg0.field2555 == var9) {
                            var11 = arg0.field2568;
                        }
                        class144.method1042(var10, (long) arg3, var11, var8[var9], true, arg2, class130.method949((byte) -77, new class93[] { class141.field2457, var6 }), arg1);
                    }
                }
            }
            if (class78.field1460 == 0 && var8 != null) {
                for (int var12 = 4; var12 >= 0; var12--) {
                    if (var8[var12] != null && var8[var12].method649(class42.field662, -4446)) {
                        short var13 = 0;
                        short var14 = 0;
                        if (var12 == 0) {
                            var14 = 21;
                        }
                        class102.field1776++;
                        if (arg0.field2560 > class166.field2927.field4228) {
                            var13 = 2000;
                        }
                        if (var12 == 1) {
                            var14 = 30;
                        }
                        if (var12 == 2) {
                            var14 = 35;
                        }
                        if (var12 == 3) {
                            var14 = 60;
                        }
                        if (var12 == 4) {
                            var14 = 39;
                        }
                        if (var14 != 0) {
                            var14 += var13;
                        }
                        class144.method1042(var14, (long) arg3, arg0.field2502, var8[var12], true, arg2, class130.method949((byte) -77, new class93[] { class141.field2457, var6 }), arg1);
                    }
                }
            }
            class144.method1042((short) 1005, (long) arg3, class126.field2237, class266.field4735, true, arg2, class130.method949((byte) -77, new class93[] { class141.field2457, var6 }), arg1);
            return;
        }
    }

    @OriginalMember(owner = "client!sb", name = "c", descriptor = "(I)V")
    public static void method1554(int arg0) {
        field4039 = null;
        field4031 = null;
        if (arg0 != 7095) {
            method1552(100);
        }
    }
}
