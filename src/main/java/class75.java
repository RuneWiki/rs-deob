import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pk")
public class class75 extends class186 {

    @OriginalMember(owner = "client!pk", name = "T", descriptor = "Ljava/lang/Object;")
    private Object field1184;

    @OriginalMember(owner = "client!pk", name = "E", descriptor = "Ljava/lang/String;")
    public static String field1177 = "shake:";

    @OriginalMember(owner = "client!pk", name = "P", descriptor = "Lwj;")
    public static class158 field1181 = new class158(0, 0);

    @OriginalMember(owner = "client!pk", name = "U", descriptor = "[Lmm;")
    public static class114[] field1185 = new class114[14];

    @OriginalMember(owner = "client!pk", name = "N", descriptor = "I")
    public static int field1179;

    @OriginalMember(owner = "client!pk", name = "O", descriptor = "I")
    public static int field1180;

    @OriginalMember(owner = "client!pk", name = "R", descriptor = "I")
    public static int field1182;

    @OriginalMember(owner = "client!pk", name = "S", descriptor = "I")
    public static int field1183;

    @OriginalMember(owner = "client!pk", name = "M", descriptor = "Ljava/lang/String;")
    public static String field1178;

    @OriginalMember(owner = "client!pk", name = "e", descriptor = "(I)Ljava/lang/Object;")
    public final Object method559(int arg0) {
        if (arg0 != 17395) {
            this.method559(-100);
        }
        field1180++;
        return this.field1184;
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(IIIIIII)V")
    public static final void method560(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1183++;
        if (arg3 > -104) {
            return;
        }
        class263 var7 = class34.method219(arg0, 79, arg6);
        if (var7 != null && var7.field4135 != null) {
            class234 var8 = new class234();
            var8.field3423 = var7;
            var8.field3419 = var7.field4135;
            class224.method1557((byte) 119, var8);
        }
        class243.field3580 = arg4;
        class309.field4981 = arg6;
        class69.field1111 = arg1;
        class295.field4741 = arg0;
        class87.field1380 = arg5;
        class212.field3119 = arg2;
        class6.field57 = true;
        class63.method476(var7, 14105);
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(I[Lmh;Z)V")
    public static final void method561(int arg0, class263[] arg1, boolean arg2) {
        field1182++;
        if (arg2) {
            return;
        }
        for (int var3 = 0; var3 < arg1.length; var3++) {
            class263 var4 = arg1[var3];
            if (var4 != null && var4.field4202 == arg0 && (!var4.field4167 || !client.method901(var4))) {
                if (var4.field4129 == 0) {
                    if (!var4.field4167 && client.method901(var4) && class207.field3041 != var4) {
                        continue;
                    }
                    method561(var4.field4083, arg1, arg2);
                    if (var4.field4143 != null) {
                        method561(var4.field4083, var4.field4143, false);
                    }
                    class133 var5 = (class133) class251.field3793.method1073(-1, (long) var4.field4083);
                    if (var5 != null) {
                        class56.method396(var5.field2187, 5947);
                    }
                }
                if (var4.field4129 == 6) {
                    if (var4.field4122 != -1 || var4.field4073 != -1) {
                        boolean var6 = class84.method624((byte) -50, var4);
                        int var7;
                        if (var6) {
                            var7 = var4.field4073;
                        } else {
                            var7 = var4.field4122;
                        }
                        if (var7 != -1) {
                            class76 var8 = class232.method1609((byte) -32, var7);
                            if (var8 != null) {
                                var4.field4130 += class126.field2126;
                                while (var4.field4130 > var8.field1194[var4.field4076]) {
                                    var4.field4130 -= var8.field1194[var4.field4076];
                                    var4.field4076++;
                                    if (var4.field4076 >= var8.field1191.length) {
                                        var4.field4076 -= var8.field1186;
                                        if (var4.field4076 < 0 || var8.field1191.length <= var4.field4076) {
                                            var4.field4076 = 0;
                                        }
                                    }
                                    var4.field4156 = var4.field4076 + 1;
                                    if (var4.field4156 >= var8.field1191.length) {
                                        var4.field4156 -= var8.field1186;
                                        if (var4.field4156 < 0 || var4.field4156 >= var8.field1191.length) {
                                            var4.field4156 = -1;
                                        }
                                    }
                                    class63.method476(var4, 14105);
                                }
                            }
                        }
                    }
                    if (var4.field4166 != 0 && !var4.field4167) {
                        int var9 = var4.field4166 >> 16;
                        int var10 = class126.field2126 * var9;
                        var4.field4211 = var4.field4211 + var10 & 0x7FF;
                        int var11 = var4.field4166 << 16 >> 16;
                        int var12 = class126.field2126 * var11;
                        var4.field4071 = var4.field4071 + var12 & 0x7FF;
                        class63.method476(var4, 14105);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!pk", name = "c", descriptor = "(B)V")
    public static void method562(byte arg0) {
        field1181 = null;
        field1185 = null;
        if (arg0 == 123) {
            field1178 = null;
            field1177 = null;
        }
    }

    @OriginalMember(owner = "client!pk", name = "d", descriptor = "(Z)Z")
    public final boolean method563(boolean arg0) {
        if (!arg0) {
            field1185 = null;
        }
        field1179++;
        return false;
    }

    @OriginalMember(owner = "client!pk", name = "<init>", descriptor = "(Ljava/lang/Object;)V")
    public class75(Object arg0) {
        this.field1184 = arg0;
    }
}
