import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ah")
public class class434 extends class225 {

    @OriginalMember(owner = "client!ah", name = "y", descriptor = "Laj;")
    public class71 field6381;

    @OriginalMember(owner = "client!ah", name = "w", descriptor = "I")
    public static int field6379 = 0;

    @OriginalMember(owner = "client!ah", name = "E", descriptor = "Z")
    public static boolean field6387 = true;

    @OriginalMember(owner = "client!ah", name = "B", descriptor = "I")
    public static int field6384 = 13156520;

    @OriginalMember(owner = "client!ah", name = "x", descriptor = "I")
    public static int field6380;

    @OriginalMember(owner = "client!ah", name = "A", descriptor = "I")
    public static int field6383;

    @OriginalMember(owner = "client!ah", name = "C", descriptor = "I")
    public static int field6385;

    @OriginalMember(owner = "client!ah", name = "D", descriptor = "Lqp;")
    public static class278 field6386;

    @OriginalMember(owner = "client!ah", name = "z", descriptor = "Lcq;")
    public static class67 field6382;

    // $FF: synthetic field
    @OriginalMember(owner = "client!ah", name = "F", descriptor = "Ljava/lang/Class;")
    public static Class field6388;

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(IIIIIB)V")
    public static final void method2739(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5) {
        field6380++;
        int var6 = arg1 - arg3;
        int var7 = arg2 - arg0;
        if (var6 == 0) {
            if (var7 != 0) {
                class415.method2646(arg0, -1, arg3, arg4, arg2);
            }
        } else if (var7 == 0) {
            class135.method845(arg4, arg1, arg0, arg3, (byte) -127);
        } else {
            int var8 = (var7 << 12) / var6;
            int var9 = arg0 - (arg3 * var8 >> 12);
            int var10;
            int var11;
            if (class87.field1227 > arg1) {
                var11 = (class87.field1227 * var8 >> 12) + var9;
                var10 = class87.field1227;
            } else if (arg1 <= class299.field4382) {
                var10 = arg1;
                var11 = arg2;
            } else {
                var11 = (class299.field4382 * var8 >> 12) + var9;
                var10 = class299.field4382;
            }
            int var12;
            int var13;
            if (class87.field1227 > arg3) {
                var12 = class87.field1227;
                var13 = var9 + (class87.field1227 * var8 >> 12);
            } else if (arg3 <= class299.field4382) {
                var13 = arg0;
                var12 = arg3;
            } else {
                var12 = class299.field4382;
                var13 = (class299.field4382 * var8 >> 12) + var9;
            }
            if (var13 < class379.field5521) {
                var13 = class379.field5521;
                var12 = (class379.field5521 - var9 << 12) / var8;
            } else if (class125.field1751 < var13) {
                var12 = (class125.field1751 - var9 << 12) / var8;
                var13 = class125.field1751;
            }
            if (arg5 >= 18) {
                if (class379.field5521 > var11) {
                    var11 = class379.field5521;
                    var10 = (class379.field5521 - var9 << 12) / var8;
                } else if (class125.field1751 < var11) {
                    var10 = (class125.field1751 - var9 << 12) / var8;
                    var11 = class125.field1751;
                }
                class318.method2144(var12, (byte) 83, var13, arg4, var11, var10);
            }
        }
    }

    @OriginalMember(owner = "client!ah", name = "e", descriptor = "(I)V")
    public static void method2740(int arg0) {
        field6386 = null;
        field6382 = null;
        if (arg0 != -26801) {
            method2741(false);
        }
    }

    @OriginalMember(owner = "client!ah", name = "<init>", descriptor = "(Laj;)V")
    public class434(class71 arg0) {
        this.field6381 = arg0;
    }

    @OriginalMember(owner = "client!ah", name = "b", descriptor = "(Z)V")
    public static final void method2741(boolean arg0) {
        field6385++;
        if (arg0) {
            method2739(-80, -67, -103, 68, 92, (byte) 8);
        }
        while (true) {
            class5 var1;
            class298 var3;
            do {
                do {
                    var1 = (class5) class395.field5837.method340(false);
                    if (var1 == null) {
                        return;
                    }
                } while (class213.field2852 == null);
                if (var1.field56 >= 0) {
                    int var2 = var1.field56 - 1;
                    var3 = class306.field4496[var2];
                } else {
                    int var4 = -var1.field56 - 1;
                    if (class272.field3950 == var4) {
                        var3 = class227.field2988;
                    } else {
                        var3 = class206.field2777[var4];
                    }
                }
            } while (var3 == null);
            class104 var5 = class329.method2190((byte) 63, var1.field68);
            int var6;
            int var7;
            if (var1.field55 == 1 || var1.field55 == 3) {
                var6 = var5.field1506;
                var7 = var5.field1489;
            } else {
                var6 = var5.field1489;
                var7 = var5.field1506;
            }
            int var8 = var1.field63 + (var6 >> 1);
            int var9 = (var6 + 1 >> 1) + var1.field63;
            int var10 = (var7 >> 1) + var1.field58;
            int var11 = var1.field58 + (var7 + 1 >> 1);
            class351 var12 = class12.field205[var3.field727];
            int var13 = var12.method742(var8, var10) + var12.method742(var9, var10) + var12.method742(var8, var11) + var12.method742(var9, var11) >> 2;
            class425 var14 = null;
            int var15 = class215.field2859[var1.field57];
            if (var15 == 0) {
                var14 = (class425) class40.method292(var3.field727, var1.field63, var1.field58);
            } else if (var15 == 1) {
                var14 = (class425) class376.method2434(var3.field727, var1.field63, var1.field58);
            } else if (var15 == 2) {
                var14 = (class425) class243.method1460(var3.field727, var1.field63, var1.field58, field6388 == null ? (field6388 = method2742("jb")) : field6388);
            } else if (var15 == 3) {
                var14 = (class425) class130.method823(var3.field727, var1.field63, var1.field58);
            }
            if (var14 != null) {
                class115.method737(var1.field59, 0, 0, var1.field64 + 1, -1, var1.field63, var3.field727, var15, -28070, var1.field58);
                var3.field4356 = var1.field63 * 128 + var6 * 64;
                var3.field4351 = var1.field64 + class28.field418;
                var3.field4366 = var13;
                var3.field4368 = var14;
                var3.field4363 = var1.field58 * 128 + (var7 * 64);
                var3.field4355 = class28.field418 + var1.field59;
                int var16 = var1.field53;
                int var17 = var1.field52;
                int var18 = var1.field60;
                int var19 = var1.field54;
                if (var17 < var16) {
                    int var20 = var16;
                    var16 = var17;
                    var17 = var20;
                }
                var3.field4354 = var1.field63 + var16;
                if (var18 > var19) {
                    int var21 = var18;
                    var18 = var19;
                    var19 = var21;
                }
                var3.field4367 = var1.field63 + var17;
                var3.field4361 = var1.field58 + var19;
                var3.field4364 = var1.field58 + var18;
            }
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method2742(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
