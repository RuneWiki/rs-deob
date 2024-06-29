import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fv")
public class class111 extends class446 {

    @OriginalMember(owner = "client!fv", name = "F", descriptor = "Ldr;")
    public static class675 field1380 = new class675(113, -1);

    @OriginalMember(owner = "client!fv", name = "G", descriptor = "Ldr;")
    public static class675 field1381 = new class675(44, 0);

    @OriginalMember(owner = "client!fv", name = "B", descriptor = "I")
    public static int field1376;

    @OriginalMember(owner = "client!fv", name = "C", descriptor = "I")
    public static int field1377;

    @OriginalMember(owner = "client!fv", name = "D", descriptor = "I")
    public static int field1378;

    @OriginalMember(owner = "client!fv", name = "E", descriptor = "I")
    public static int field1379;

    @OriginalMember(owner = "client!fv", name = "H", descriptor = "I")
    public static int field1382;

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "(IBIII)V", line = 4)
    public final void method769(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        ++field1379;
        int var6 = 79 % ((51 - arg1) / 42);
        int var7 = super.field5604.method1552();
        int var8 = ((class334) super.field4027).field4138 * class637.method3565(-3452) / 10 % var7;
        super.field5604.method2552(-var7 + arg2 - -var8, arg0, -var8 + arg3 + var7, arg4);
    }

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "([I[I[ILpp;I)V", line = 21)
    public static final void method770(int[] arg0, int[] arg1, int[] arg2, class365 arg3, int arg4) {
        if (arg4 != 1) {
            field1380 = null;
        }
        ++field1378;
        for (int var5 = 0; var5 < arg1.length; ++var5) {
            int var6 = arg1[var5];
            int var7 = arg2[var5];
            int var8 = arg0[var5];
            for (int var9 = 0; ~var7 != -1 && ~arg3.field418.length < ~var9; ++var9) {
                if (~(var7 & 1) != -1) {
                    if (~var6 == 0) {
                        arg3.field418[var9] = null;
                    } else {
                        class207 var10 = class11.field110.method1141(var6, (byte) 107);
                        int var11 = var10.field2451;
                        class78 var12 = arg3.field418[var9];
                        if (var12 != null) {
                            if (~var12.field1014 == ~var6) {
                                if (var11 == 0) {
                                    var12 = arg3.field418[var9] = null;
                                } else if (~var11 == -2) {
                                    var12.field1009 = 0;
                                    var12.field1016 = 1;
                                    var12.field1011 = var8;
                                    var12.field1015 = 0;
                                    var12.field1013 = 0;
                                    class526.method2841(arg4 + -305539928, arg3.field8010, var10, class67.field815 == arg3, arg3.field8018, 0, arg3.field8011);
                                } else if (~var11 == -3) {
                                    var12.field1013 = 0;
                                }
                            } else if (~var10.field2425 <= ~class11.field110.method1141(var12.field1014, (byte) 123).field2425) {
                                var12 = arg3.field418[var9] = null;
                            }
                        }
                        if (var12 == null) {
                            class78 var13 = arg3.field418[var9] = new class78();
                            var13.field1014 = var6;
                            var13.field1013 = 0;
                            var13.field1011 = var8;
                            var13.field1009 = 0;
                            var13.field1015 = 0;
                            var13.field1016 = 1;
                            class526.method2841(arg4 ^ -305539928, arg3.field8010, var10, class67.field815 == arg3, arg3.field8018, 0, arg3.field8011);
                        }
                    }
                }
                var7 >>>= 1;
            }
        }
    }

    @OriginalMember(owner = "client!fv", name = "f", descriptor = "(I)V", line = 116)
    public static final void method771(int arg0) {
        ++field1376;
        class162.field1917.method1224(false);
        if (arg0 == 0) {
            class185.field2189.method1224(false);
            class89.field1161.method1224(false);
            class106.field1334.method1224(false);
        }
    }

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "(BLjr;)I", line = 131)
    public static final int method772(byte arg0, class100 arg1) {
        ++field1377;
        if (class100.field1285 != arg1) {
            if (class100.field1286 == arg1) {
                return 5122;
            } else if (class100.field1287 == arg1) {
                return 5124;
            } else if (class100.field1288 != arg1) {
                if (class100.field1289 != arg1) {
                    if (class100.field1290 != arg1) {
                        if (class100.field1291 == arg1) {
                            return 5131;
                        } else if (class100.field1292 == arg1) {
                            return 5126;
                        } else if (arg0 > -14) {
                            return 9;
                        } else {
                            throw new IllegalArgumentException("");
                        }
                    } else {
                        return 5125;
                    }
                } else {
                    return 5123;
                }
            } else {
                return 5121;
            }
        } else {
            return 5120;
        }
    }

    @OriginalMember(owner = "client!fv", name = "<init>", descriptor = "(Lpfa;Lpfa;Loq;)V", line = 174)
    public class111(class275 arg0, class275 arg1, class334 arg2) {
        super(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!fv", name = "g", descriptor = "(I)V", line = 182)
    public static void method773(int arg0) {
        field1381 = null;
        field1380 = null;
        if (arg0 != -1) {
            method771(44);
        }
    }
}
