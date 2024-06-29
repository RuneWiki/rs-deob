import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tk")
public class class192 implements Runnable {

    @OriginalMember(owner = "client!tk", name = "b", descriptor = "[Lis;")
    public volatile class291[] field2619 = new class291[2];

    @OriginalMember(owner = "client!tk", name = "c", descriptor = "Z")
    public volatile boolean field2620 = false;

    @OriginalMember(owner = "client!tk", name = "f", descriptor = "Z")
    public volatile boolean field2623 = false;

    @OriginalMember(owner = "client!tk", name = "g", descriptor = "[I")
    public static int[] field2624 = new int[] { 2, 1, 1, 1, 2, 2, 2, 1, 3, 3, 3, 2, 0, 4, 0 };

    @OriginalMember(owner = "client!tk", name = "j", descriptor = "I")
    public static int field2627 = 0;

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "I")
    public static int field2618;

    @OriginalMember(owner = "client!tk", name = "e", descriptor = "I")
    public static int field2622;

    @OriginalMember(owner = "client!tk", name = "h", descriptor = "I")
    public static int field2625;

    @OriginalMember(owner = "client!tk", name = "i", descriptor = "I")
    public static int field2626;

    @OriginalMember(owner = "client!tk", name = "k", descriptor = "I")
    public static int field2628;

    @OriginalMember(owner = "client!tk", name = "d", descriptor = "Lam;")
    public class378 field2621;

    @OriginalMember(owner = "client!tk", name = "run", descriptor = "()V", line = 5)
    public final void run() {
        this.field2623 = true;
        field2622++;
        try {
            while (!this.field2620) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class291 var2 = this.field2619[var1];
                    if (var2 != null) {
                        var2.method1859(-5807);
                    }
                }
                class278.method1757(10L, 0);
                class282.method1805(this.field2621, (Object) null, 1);
            }
        } catch (Exception var9) {
            class411.method2578(var9, (String) null, (byte) -68);
        } finally {
            Object var6 = null;
            this.field2623 = false;
        }
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(IILen;Llm;Lgk;I)Z", line = 38)
    public static final boolean method1226(int arg0, int arg1, class174 arg2, class290 arg3, class278 arg4, int arg5) {
        field2628++;
        int var6 = Integer.MAX_VALUE;
        int var7 = Integer.MIN_VALUE;
        int var8 = Integer.MAX_VALUE;
        int var9 = Integer.MIN_VALUE;
        if (arg3.field4158 != null) {
            var6 = class106.field1220 + ((arg4.field3916 + arg3.field4155 - class106.field1225) * (class106.field1229 - class106.field1220) / (class106.field1234 - class106.field1225));
            var8 = class106.field1233 - (arg3.field4156 + arg4.field3921 - class106.field1219) * (class106.field1233 - class106.field1224) / (class106.field1216 - class106.field1219);
            var9 = class106.field1233 - ((arg4.field3921 + arg3.field4148 - class106.field1219) * (class106.field1233 - class106.field1224) / (class106.field1216 - class106.field1219));
            var7 = (arg3.field4153 + arg4.field3916 - class106.field1225) * (class106.field1229 - class106.field1220) / (class106.field1234 - class106.field1225) + class106.field1220;
        }
        class11 var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        if (arg3.field4123 != -1) {
            if (arg4.field3928 && arg3.field4124 != -1) {
                var10 = arg3.method1851(arg2, false, true);
            } else {
                var10 = arg3.method1851(arg2, false, false);
            }
            if (var10 != null) {
                var11 = arg4.field3918 - (var10.method52() + 1 >> 1);
                if (var11 < var6) {
                    var6 = var11;
                }
                var12 = arg4.field3918 + (var10.method52() + 1 >> 1);
                if (var12 > var7) {
                    var7 = var12;
                }
                var13 = arg4.field3926 - (var10.method47() + 1 >> 1);
                if (var13 < var8) {
                    var8 = var13;
                }
                var14 = arg4.field3926 + (var10.method47() + 1 >> 1);
                if (var14 > var9) {
                    var9 = var14;
                }
            }
        }
        class31 var15 = null;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        if (arg1 > -37) {
            return false;
        }
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        if (arg3.field4142 != null) {
            var15 = class169.method1118((byte) -111, arg3.field4128);
            if (var15 != null) {
                var16 = class324.field4570.method1752((int[]) null, arg3.field4142, class88.field986, (class11[]) null, -88);
                int var23 = arg4.field3926;
                if (var10 == null) {
                    var17 = var23 - var15.method178() * var16 / 2;
                } else {
                    var17 = var23 - ((var10.method47() >> 1) + var16 * var15.method176());
                }
                for (int var24 = 0; var24 < var16; var24++) {
                    String var25 = class88.field986[var24];
                    if ((var16 - 1) > var24) {
                        var25 = var25.substring(0, var25.length() - 4);
                    }
                    int var26 = var15.method180(var25);
                    if (var26 > var18) {
                        var18 = var26;
                    }
                }
                var19 = arg4.field3918 + arg0 - (var18 / 2);
                var20 = var18 / 2 + arg0 + arg4.field3918;
                if (var19 < var6) {
                    var6 = var19;
                }
                if (var7 < var20) {
                    var7 = var20;
                }
                var21 = arg5 + var17;
                if (var8 > var21) {
                    var8 = var21;
                }
                var22 = var15.method176() * var16 + var17 + arg5;
                if (var22 > var9) {
                    var9 = var22;
                }
            }
        }
        if (class106.field1220 > var7 || class106.field1229 < var6 || class106.field1224 > var9 || var8 > class106.field1233) {
            return true;
        }
        if (arg3.field4158 != null) {
            int[] var27 = new int[arg3.field4158.length];
            for (int var28 = 0; var28 < (var27.length / 2); var28++) {
                int var30 = arg3.field4158[var28 * 2] + arg4.field3916;
                int var31 = arg3.field4158[var28 * 2 + 1] + arg4.field3921;
                var27[var28 * 2] = (var30 - class106.field1225) * (class106.field1229 - class106.field1220) / (class106.field1234 - class106.field1225) + class106.field1220;
                var27[var28 * 2 + 1] = class106.field1233 - ((class106.field1233 - class106.field1224) * (var31 - class106.field1219) / (class106.field1216 - class106.field1219));
            }
            class309.method1936(arg2, var27, arg3.field4127);
            for (int var29 = 0; var29 < var27.length / 2 - 1; var29++) {
                arg2.method1154(arg3.field4138, var27[var29 * 2 + 1], var27[(var29 + 1) * 2 + 1], var27[var29 * 2], var27[(var29 + 1) * 2], true);
            }
            arg2.method1154(arg3.field4138, var27[var27.length - 1], var27[1], var27[var27.length - 2], var27[0], true);
        }
        if (var10 != null) {
            if (class239.field3249 > 0 && (class48.field561 != -1 && class48.field561 == arg4.field3920 || class162.field2284 != -1 && class162.field2284 == arg3.field4144)) {
                int var32;
                if (class100.field1118 <= 50) {
                    var32 = class100.field1118 * 2;
                } else {
                    var32 = (100 - class100.field1118) * 2;
                }
                int var33 = var32 << 24 | 0xFFFF00;
                arg2.method1152(arg4.field3926, arg4.field3918, var33, 1, var10.method51() / 2 + 7);
                arg2.method1152(arg4.field3926, arg4.field3918, var33, 1, var10.method51() / 2 + 5);
                arg2.method1152(arg4.field3926, arg4.field3918, var33, 1, var10.method51() / 2 + 3);
                arg2.method1152(arg4.field3926, arg4.field3918, var33, 1, var10.method51() / 2 + 1);
                arg2.method1152(arg4.field3926, arg4.field3918, var33, 1, var10.method51() / 2);
            }
            var10.method90(arg4.field3918 - (var10.method52() >> 1), arg4.field3926 + -(var10.method47() >> 1));
        }
        if (arg3.field4142 != null && var15 != null) {
            class113.method622(var17, arg2, var18, arg4, arg3, var15, false, var16);
        }
        if (arg3.field4123 != -1 || arg3.field4142 != null) {
            class424 var34 = new class424(arg4);
            var34.field6082 = var13;
            var34.field6085 = var20;
            var34.field6084 = var11;
            var34.field6091 = var12;
            var34.field6078 = var19;
            var34.field6093 = var14;
            var34.field6092 = var21;
            var34.field6094 = var22;
            class188.field2550.method1125(-1, var34);
        }
        return false;
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(Ljf;I)Z", line = 257)
    public static final boolean method1227(class119 arg0, int arg1) {
        field2625++;
        int var2 = 95 / ((arg1 - 77) / 34);
        if (arg0.field1538 == 205) {
            class217.field2971 = 250;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(B)V", line = 286)
    public static void method1228(byte arg0) {
        field2624 = null;
        if (arg0 < 122) {
            field2624 = null;
        }
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(III)I", line = 297)
    public static final int method1229(int arg0, int arg1, int arg2) {
        field2618++;
        if (arg1 == 1 || arg1 == 3) {
            return class269.field3779[arg2 & 0x3];
        } else if (arg0 == -4) {
            return class299.field4260[arg2 & 0x3];
        } else {
            return -90;
        }
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(Z)V", line = 324)
    public static final void method1230(boolean arg0) {
        class139.field1980 = null;
        class275.field3883 = null;
        class247.field3360 = null;
        class134.field1881 = null;
        class422.field6055 = null;
        if (!arg0) {
            method1227((class119) null, -70);
        }
        class330.field4716 = null;
        class401.field5825 = null;
        field2626++;
        class94.field1040 = null;
        class115.field1341 = null;
        class30.field278 = null;
        class299.field4266 = null;
        class369.field5417 = null;
    }
}
