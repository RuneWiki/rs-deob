import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nda")
public class class559 extends class648 {

    @OriginalMember(owner = "client!nda", name = "o", descriptor = "Z")
    private boolean field7983 = false;

    @OriginalMember(owner = "client!nda", name = "l", descriptor = "Z")
    private boolean field7980;

    @OriginalMember(owner = "client!nda", name = "z", descriptor = "[Lpf;")
    private class584[] field7994;

    @OriginalMember(owner = "client!nda", name = "q", descriptor = "Lsg;")
    public static class399 field7985 = new class399(0, 0);

    @OriginalMember(owner = "client!nda", name = "B", descriptor = "Z")
    public static boolean field7996 = true;

    @OriginalMember(owner = "client!nda", name = "C", descriptor = "Lqe;")
    public static class469 field7997 = new class469(107, 16);

    @OriginalMember(owner = "client!nda", name = "E", descriptor = "Ljg;")
    public static class340 field7999 = new class340();

    @OriginalMember(owner = "client!nda", name = "m", descriptor = "I")
    public static int field7981;

    @OriginalMember(owner = "client!nda", name = "n", descriptor = "I")
    public static int field7982;

    @OriginalMember(owner = "client!nda", name = "p", descriptor = "I")
    public static int field7984;

    @OriginalMember(owner = "client!nda", name = "r", descriptor = "I")
    public static int field7986;

    @OriginalMember(owner = "client!nda", name = "s", descriptor = "I")
    public static int field7987;

    @OriginalMember(owner = "client!nda", name = "t", descriptor = "I")
    public static int field7988;

    @OriginalMember(owner = "client!nda", name = "u", descriptor = "I")
    public static int field7989;

    @OriginalMember(owner = "client!nda", name = "v", descriptor = "I")
    public static int field7990;

    @OriginalMember(owner = "client!nda", name = "w", descriptor = "I")
    public static int field7991;

    @OriginalMember(owner = "client!nda", name = "x", descriptor = "I")
    public static int field7992;

    @OriginalMember(owner = "client!nda", name = "y", descriptor = "I")
    public static int field7993;

    @OriginalMember(owner = "client!nda", name = "D", descriptor = "[I")
    public static int[] field7998;

    @OriginalMember(owner = "client!nda", name = "A", descriptor = "[Lfg;")
    public static class129[] field7995;

    @OriginalMember(owner = "client!nda", name = "a", descriptor = "(ZILha;IIII)V", line = 4)
    public static final void method3265(boolean arg0, int arg1, class60 arg2, int arg3, int arg4, int arg5, int arg6) {
        if ((class421.field6279 == null || class182.field2800 == null || class304.field4312 == null) && class640.field8990.method208(class706.field9944, (byte) 70) && class640.field8990.method208(class342.field4970, (byte) 70) && class640.field8990.method208(class328.field4672, (byte) 70)) {
            class129 var7 = class129.method919(class640.field8990, class342.field4970, 0);
            class182.field2800 = arg2.method422(var7, true);
            var7.method914();
            class750.field10491 = arg2.method422(var7, true);
            class421.field6279 = arg2.method422(class129.method919(class640.field8990, class706.field9944, 0), true);
            class129 var8 = class129.method919(class640.field8990, class328.field4672, 0);
            class304.field4312 = arg2.method422(var8, true);
            var8.method914();
            class222.field3265 = arg2.method422(var8, true);
        }
        if (arg0) {
            ++field7982;
            if (class421.field6279 != null && class182.field2800 != null && class304.field4312 != null) {
                int var9 = (arg1 + -(class304.field4312.method1517() * 2)) / class421.field6279.method1517();
                for (int var10 = 0; ~var9 < ~var10; ++var10) {
                    class421.field6279.method3142(arg3 + (class304.field4312.method1517() - -(var10 * class421.field6279.method1517())), arg5 + arg4 + -class421.field6279.method1510());
                }
                int var11 = (-class304.field4312.method1510() + -arg6 + arg5) / class182.field2800.method1510();
                for (int var12 = 0; ~var11 < ~var12; ++var12) {
                    class182.field2800.method3142(arg3, arg6 + (arg4 - -(var12 * class182.field2800.method1510())));
                    class750.field10491.method3142(arg1 + arg3 + -class750.field10491.method1517(), class182.field2800.method1510() * var12 + arg6 + arg4);
                }
                class304.field4312.method3142(arg3, arg4 + (arg5 - class304.field4312.method1510()));
                class222.field3265.method3142(arg3 + (arg1 - class304.field4312.method1517()), -class304.field4312.method1510() + arg5 + arg4);
            }
        }
    }

    @OriginalMember(owner = "client!nda", name = "a", descriptor = "(II)Lcda;", line = 62)
    public static final class172 method3266(int arg0, int arg1) {
        ++field7990;
        class172[] var2 = class276.method1753(-56);
        int var3 = 0;
        if (arg1 != -5) {
            method3267(-114, 43, -88, true, 57);
        }
        while (var3 < var2.length) {
            class172 var4 = var2[var3];
            if (var4.field2671 == arg0) {
                return var4;
            }
            ++var3;
        }
        return null;
    }

    @OriginalMember(owner = "client!nda", name = "a", descriptor = "(ZI)V", line = 91)
    public final void method1448(boolean arg0, int arg1) {
        ++field7987;
        super.field9139.method2300(class499.field7099, class336.field4874, arg1);
    }

    @OriginalMember(owner = "client!nda", name = "a", descriptor = "(IIIZI)V", line = 99)
    public static final void method3267(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        if (arg1 < arg0) {
            for (int var5 = arg1; arg0 > var5; ++var5) {
                class664.field9322[var5][arg4] = arg2;
            }
        } else {
            for (int var6 = arg0; ~var6 > ~arg1; ++var6) {
                class664.field9322[var6][arg4] = arg2;
            }
        }
        if (arg3) {
            ++field7984;
        }
    }

    @OriginalMember(owner = "client!nda", name = "<init>", descriptor = "(Lwu;)V", line = 137)
    public class559(class373 arg0) {
        super(arg0);
        if (arg0.field5616) {
            this.field7980 = arg0.field5635 < 3;
            int var2 = !this.field7980 ? 127 : 48;
            int[][] var3 = new int[6][4096];
            int[][] var4 = new int[6][4096];
            int[][] var5 = new int[6][4096];
            int var6 = 0;
            for (int var7 = 0; ~var7 > -65; ++var7) {
                for (int var8 = 0; ~var8 > -65; ++var8) {
                    float var9 = (float) var8 * 2.0F / 64.0F - 1.0F;
                    float var10 = (float) var7 * 2.0F / 64.0F - 1.0F;
                    float var11 = (float) (1.0D / Math.sqrt((double) (var10 * var10 + var9 * var9 + 1.0F)));
                    float var12 = var9 * var11;
                    float var13 = var10 * var11;
                    for (int var14 = 0; var14 < 6; ++var14) {
                        float var15;
                        if (var14 == 0) {
                            var15 = -var12;
                        } else if (~var14 == -2) {
                            var15 = var12;
                        } else if (var14 != 2) {
                            if (~var14 != -4) {
                                if (~var14 != -5) {
                                    var15 = -var11;
                                } else {
                                    var15 = var11;
                                }
                            } else {
                                var15 = -var13;
                            }
                        } else {
                            var15 = var13;
                        }
                        int var16;
                        int var17;
                        int var18;
                        if (var15 > 0.0F) {
                            var16 = (int) ((double) var2 * Math.pow((double) var15, 96.0D));
                            var17 = (int) (Math.pow((double) var15, 36.0D) * (double) var2);
                            var18 = (int) ((double) var2 * Math.pow((double) var15, 12.0D));
                        } else {
                            var18 = 0;
                            var17 = 0;
                            var16 = 0;
                        }
                        var4[var14][var6] = var16 << 24;
                        var5[var14][var6] = var17 << 24;
                        var3[var14][var6] = var18 << 24;
                    }
                    ++var6;
                }
            }
            this.field7994 = new class584[3];
            this.field7994[0] = super.field9139.method2424(var4, 64, false, true);
            this.field7994[1] = super.field9139.method2424(var5, 64, false, true);
            this.field7994[2] = super.field9139.method2424(var3, 64, false, true);
        }
    }

    @OriginalMember(owner = "client!nda", name = "c", descriptor = "(I)Z", line = 248)
    public final boolean method1449(int arg0) {
        ++field7989;
        return arg0 != 13003 ? true : true;
    }

    @OriginalMember(owner = "client!nda", name = "c", descriptor = "(B)Z", line = 259)
    public static final boolean method3268(byte arg0) {
        ++field7993;
        return arg0 <= 94 ? true : class596.field8442;
    }

    @OriginalMember(owner = "client!nda", name = "a", descriptor = "(Lk;B)Ljava/lang/String;", line = 270)
    public static final String method3269(class567 arg0, byte arg1) {
        if (arg1 < 126) {
            return null;
        } else {
            ++field7981;
            return arg0.field8054 + " <col=ffffff>>";
        }
    }

    @OriginalMember(owner = "client!nda", name = "a", descriptor = "(ZZ)V", line = 282)
    public final void method1451(boolean arg0, boolean arg1) {
        if (arg0) {
            this.method1451(true, true);
        }
        if (this.field7994 != null && arg1) {
            super.field9139.method2375((byte) 24, 1);
            super.field9139.method2348((byte) -116, class474.field6892);
            class441 var3 = super.field9139.method2299(-25498);
            var3.method765(1024);
            super.field9139.method2291(class60.field854, -120);
            if (!this.field7980) {
                super.field9139.method2300(class336.field4874, class499.field7099, 0);
                super.field9139.method2329(0, (byte) -125, class328.field4670);
                super.field9139.method2375((byte) -107, 2);
                super.field9139.method2300(class499.field7099, class661.field9242, 0);
                super.field9139.method2329(0, (byte) -126, class328.field4670);
                super.field9139.method2340(class328.field4670, true, 1, false, true);
                super.field9139.method2407(0, class10.field152, 59);
                super.field9139.method2294(super.field9139.field5583, -2);
            } else {
                super.field9139.method2300(class499.field7099, class661.field9242, 0);
                super.field9139.method2340(class331.field4759, true, 0, false, true);
                super.field9139.method2407(0, class10.field152, 47);
            }
            super.field9139.method2375((byte) -72, 0);
            this.field7983 = true;
        } else {
            super.field9139.method2407(0, class10.field152, 119);
        }
        ++field7986;
    }

    @OriginalMember(owner = "client!nda", name = "d", descriptor = "(I)V", line = 325)
    public final void method1450(int arg0) {
        if (!this.field7983) {
            super.field9139.method2407(0, class331.field4759, 65);
        } else {
            super.field9139.method2375((byte) -116, 1);
            super.field9139.method2294((class663) null, -2);
            super.field9139.method2348((byte) 126, class112.field1557);
            super.field9139.method2410(-1);
            if (this.field7980) {
                super.field9139.method2300(class336.field4874, class336.field4874, 0);
                super.field9139.method2329(0, (byte) -124, class331.field4759);
                super.field9139.method2407(0, class331.field4759, 70);
            } else {
                super.field9139.method2300(class336.field4874, class336.field4874, 0);
                super.field9139.method2329(0, (byte) -125, class331.field4759);
                super.field9139.method2375((byte) 58, 2);
                super.field9139.method2300(class336.field4874, class336.field4874, 0);
                super.field9139.method2329(0, (byte) -125, class331.field4759);
                super.field9139.method2329(1, (byte) -125, class328.field4670);
                super.field9139.method2407(0, class331.field4759, 48);
                super.field9139.method2294((class663) null, -2);
            }
            super.field9139.method2375((byte) -84, 0);
            this.field7983 = false;
        }
        if (arg0 >= -67) {
            this.field7983 = false;
        }
        ++field7991;
        super.field9139.method2300(class336.field4874, class336.field4874, 0);
    }

    @OriginalMember(owner = "client!nda", name = "a", descriptor = "(BII)V", line = 368)
    public final void method1453(byte arg0, int arg1, int arg2) {
        if (arg0 > 33) {
            ++field7992;
            if (this.field7983) {
                super.field9139.method2375((byte) -77, 1);
                super.field9139.method2294(this.field7994[arg1 + -1], -2);
                super.field9139.method2375((byte) 47, 0);
            }
        }
    }

    @OriginalMember(owner = "client!nda", name = "a", descriptor = "(Lbca;II)V", line = 392)
    public final void method1455(class663 arg0, int arg1, int arg2) {
        ++field7988;
        if (arg1 != 12885) {
            field7997 = null;
        }
        super.field9139.method2294(arg0, -2);
        super.field9139.method2353((byte) -104, arg2);
    }

    @OriginalMember(owner = "client!nda", name = "d", descriptor = "(B)V", line = 404)
    public static void method3270(byte arg0) {
        field7995 = null;
        if (arg0 != 95) {
            field7998 = null;
        }
        field7999 = null;
        field7998 = null;
        field7985 = null;
        field7997 = null;
    }
}
