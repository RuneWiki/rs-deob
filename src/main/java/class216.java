import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nj")
public class class216 extends class45 {

    @OriginalMember(owner = "client!nj", name = "t", descriptor = "[I")
    public static int[] field3454 = new int[1000];

    @OriginalMember(owner = "client!nj", name = "G", descriptor = "Ljl;")
    public static class332 field3467 = new class332(64);

    @OriginalMember(owner = "client!nj", name = "o", descriptor = "I")
    public int field3449;

    @OriginalMember(owner = "client!nj", name = "p", descriptor = "I")
    public int field3450;

    @OriginalMember(owner = "client!nj", name = "q", descriptor = "I")
    public int field3451;

    @OriginalMember(owner = "client!nj", name = "r", descriptor = "I")
    public int field3452;

    @OriginalMember(owner = "client!nj", name = "s", descriptor = "I")
    public int field3453;

    @OriginalMember(owner = "client!nj", name = "u", descriptor = "I")
    public int field3455;

    @OriginalMember(owner = "client!nj", name = "v", descriptor = "I")
    public static int field3456;

    @OriginalMember(owner = "client!nj", name = "w", descriptor = "I")
    public static int field3457;

    @OriginalMember(owner = "client!nj", name = "x", descriptor = "I")
    public static int field3458;

    @OriginalMember(owner = "client!nj", name = "y", descriptor = "I")
    public int field3459;

    @OriginalMember(owner = "client!nj", name = "z", descriptor = "I")
    public int field3460;

    @OriginalMember(owner = "client!nj", name = "A", descriptor = "I")
    public static int field3461;

    @OriginalMember(owner = "client!nj", name = "B", descriptor = "I")
    public int field3462;

    @OriginalMember(owner = "client!nj", name = "C", descriptor = "I")
    public static int field3463;

    @OriginalMember(owner = "client!nj", name = "D", descriptor = "I")
    public int field3464;

    @OriginalMember(owner = "client!nj", name = "F", descriptor = "I")
    public int field3466;

    @OriginalMember(owner = "client!nj", name = "H", descriptor = "I")
    public int field3468;

    @OriginalMember(owner = "client!nj", name = "E", descriptor = "Lml;")
    public static class17 field3465;

    @OriginalMember(owner = "client!nj", name = "c", descriptor = "(B)V", line = 15)
    public static void method1627(byte arg0) {
        if (arg0 >= -19) {
            method1629(-18);
        }
        field3465 = null;
        field3454 = null;
        field3467 = null;
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(IIIIIII)V", line = 29)
    public static final void method1628(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field3463++;
        class250 var7 = class25.method165(arg1, arg5, 24836);
        if (var7 != null && var7.field4096 != null) {
            class40 var8 = new class40();
            var8.field593 = var7;
            var8.field581 = var7.field4096;
            class29.method183((byte) 119, var8);
        }
        class245.field4015 = arg4;
        class275.field4549 = arg5;
        class209.field3297 = arg1;
        class232.field3847 = arg0;
        class104.field1690 = arg6;
        class227.field3789 = true;
        class6.field48 = arg2;
        if (arg3 >= 25) {
            class205.method1568(var7, (byte) 127);
        }
    }

    @OriginalMember(owner = "client!nj", name = "b", descriptor = "(I)V", line = 68)
    public static final void method1629(int arg0) {
        field3458++;
        if (!class42.field607 || class237.field3921) {
            return;
        }
        class36[][][] var1 = class129.field2184;
        for (int var2 = 0; var2 < var1.length; var2++) {
            class36[][] var3 = var1[var2];
            for (int var4 = 0; var4 < var3.length; var4++) {
                for (int var5 = 0; var5 < var3[var4].length; var5++) {
                    class36 var6 = var3[var4][var5];
                    if (var6 != null) {
                        if (var6.field537 != null && var6.field537.field2968 instanceof class337) {
                            class337 var7 = (class337) var6.field537.field2968;
                            if ((Long.MIN_VALUE & var6.field537.field2972) == 0L) {
                                var7.method2351(false, true, true, true, false, true, true);
                            } else {
                                var7.method2351(true, true, true, true, true, true, true);
                            }
                        }
                        if (var6.field526 != null) {
                            if (var6.field526.field5400 instanceof class337) {
                                class337 var8 = (class337) var6.field526.field5400;
                                if ((Long.MIN_VALUE & var6.field526.field5406) == 0L) {
                                    var8.method2351(false, true, true, true, false, true, true);
                                } else {
                                    var8.method2351(true, true, true, true, true, true, true);
                                }
                            }
                            if (var6.field526.field5410 instanceof class337) {
                                class337 var9 = (class337) var6.field526.field5410;
                                if ((var6.field526.field5406 & Long.MIN_VALUE) == 0L) {
                                    var9.method2351(false, true, true, true, false, true, true);
                                } else {
                                    var9.method2351(true, true, true, true, true, true, true);
                                }
                            }
                        }
                        if (var6.field533 != null) {
                            if (var6.field533.field5392 instanceof class337) {
                                class337 var10 = (class337) var6.field533.field5392;
                                if ((var6.field533.field5397 & Long.MIN_VALUE) == 0L) {
                                    var10.method2351(false, true, true, true, false, true, true);
                                } else {
                                    var10.method2351(true, true, true, true, true, true, true);
                                }
                            }
                            if (var6.field533.field5390 instanceof class337) {
                                class337 var11 = (class337) var6.field533.field5390;
                                if ((var6.field533.field5397 & Long.MIN_VALUE) == 0L) {
                                    var11.method2351(false, true, true, true, false, true, true);
                                } else {
                                    var11.method2351(true, true, true, true, true, true, true);
                                }
                            }
                        }
                        for (int var12 = 0; var12 < var6.field531; var12++) {
                            if (var6.field544[var12].field3287 instanceof class337) {
                                class337 var13 = (class337) var6.field544[var12].field3287;
                                if ((var6.field544[var12].field3279 & Long.MIN_VALUE) == 0L) {
                                    var13.method2351(false, true, true, true, false, true, true);
                                } else {
                                    var13.method2351(true, true, true, true, true, true, true);
                                }
                            }
                        }
                    }
                }
            }
        }
        class237.field3921 = true;
        if (arg0 != 64) {
            field3465 = (class17) null;
        }
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(ZLjava/lang/String;)Z", line = 214)
    public static final boolean method1630(boolean arg0, String arg1) {
        if (arg0) {
            return false;
        } else {
            field3456++;
            return class229.method1778(true, arg1, true, 10);
        }
    }
}
