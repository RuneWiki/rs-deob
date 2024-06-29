import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ba")
public class class351 {

    @OriginalMember(owner = "client!ba", name = "f", descriptor = "I")
    public int field5069;

    @OriginalMember(owner = "client!ba", name = "c", descriptor = "Ldg;")
    public static class376 field5066 = new class376(53, 0);

    @OriginalMember(owner = "client!ba", name = "h", descriptor = "[I")
    public static int[] field5071 = new int[] { 1, 4 };

    @OriginalMember(owner = "client!ba", name = "i", descriptor = "J")
    public static long field5072 = -1L;

    @OriginalMember(owner = "client!ba", name = "b", descriptor = "I")
    public static int field5065;

    @OriginalMember(owner = "client!ba", name = "d", descriptor = "I")
    public static int field5067;

    @OriginalMember(owner = "client!ba", name = "e", descriptor = "I")
    public static int field5068;

    @OriginalMember(owner = "client!ba", name = "g", descriptor = "I")
    public static int field5070;

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "Lla;")
    public static class416 field5064;

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(Z)V")
    public static final void method2157(boolean arg0) {
        field5070++;
        class485.field6902.method2279(0);
        if (arg0) {
            method2158(null, 102, null, null, null);
        }
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "([IILpaa;[I[I)V")
    public static final void method2158(int[] arg0, int arg1, class577 arg2, int[] arg3, int[] arg4) {
        field5067++;
        for (int var5 = arg1; var5 < arg3.length; var5++) {
            int var6 = arg3[var5];
            int var7 = arg0[var5];
            int var8 = arg4[var5];
            int var9 = 0;
            while (var7 != 0 && var9 < arg2.field6229.length) {
                if ((var7 & 0x1) != 0) {
                    if (var6 == -1) {
                        arg2.field6229[var9] = null;
                    } else {
                        class30 var10 = class188.field2708.method2140(var6, arg1 ^ 0x7F);
                        int var11 = var10.field461;
                        class300 var12 = arg2.field6229[var9];
                        if (var12 != null) {
                            if (var12.field4466 == var6) {
                                if (var11 == 0) {
                                    var12 = arg2.field6229[var9] = null;
                                } else if (var11 == 1) {
                                    var12.field4465 = 0;
                                    var12.field4471 = 0;
                                    var12.field4464 = var8;
                                    var12.field4475 = 1;
                                    var12.field4474 = 0;
                                    class603.method3399(var10, arg2.field3024, 0, false, -69, arg2.field3029, arg2.field3019);
                                } else if (var11 == 2) {
                                    var12.field4474 = 0;
                                }
                            } else if (var10.field462 >= class188.field2708.method2140(var12.field4466, 127).field462) {
                                var12 = arg2.field6229[var9] = null;
                            }
                        }
                        if (var12 == null) {
                            class300 var13 = arg2.field6229[var9] = new class300();
                            var13.field4466 = var6;
                            var13.field4471 = 0;
                            var13.field4474 = 0;
                            var13.field4465 = 0;
                            var13.field4464 = var8;
                            var13.field4475 = 1;
                            class603.method3399(var10, arg2.field3024, 0, false, -72, arg2.field3029, arg2.field3019);
                        }
                    }
                }
                var9++;
                var7 >>>= 0x1;
            }
        }
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(Llca;B)I")
    public static final int method2159(class597 arg0, byte arg1) {
        if (arg1 < 49) {
            return -25;
        }
        field5068++;
        if (class502.field7105 == arg0) {
            return 6407;
        } else if (class75.field1306 == arg0) {
            return 6408;
        } else if (class87.field1467 == arg0) {
            return 6406;
        } else if (class547.field7690 == arg0) {
            return 6409;
        } else if (class87.field1430 == arg0) {
            return 6410;
        } else if (class2.field11 == arg0) {
            return 6145;
        } else {
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!ba", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field5065++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ba", name = "<init>", descriptor = "(I)V")
    public class351(int arg0) {
        this.field5069 = arg0;
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(I)V")
    public static void method2160(int arg0) {
        field5071 = null;
        field5064 = null;
        if (arg0 != 16082) {
            field5071 = null;
        }
        field5066 = null;
    }
}
