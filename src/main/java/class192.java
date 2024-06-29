import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rd")
public class class192 {

    @OriginalMember(owner = "client!rd", name = "d", descriptor = "[I")
    public static int[] field3138 = new int[2500];

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "I")
    public int field3135;

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "I")
    public int field3136;

    @OriginalMember(owner = "client!rd", name = "f", descriptor = "I")
    public static int field3140;

    @OriginalMember(owner = "client!rd", name = "g", descriptor = "I")
    public static int field3141;

    @OriginalMember(owner = "client!rd", name = "l", descriptor = "I")
    public static int field3146;

    @OriginalMember(owner = "client!rd", name = "m", descriptor = "I")
    public int field3147;

    @OriginalMember(owner = "client!rd", name = "n", descriptor = "I")
    public static int field3148;

    @OriginalMember(owner = "client!rd", name = "o", descriptor = "I")
    public static int field3149;

    @OriginalMember(owner = "client!rd", name = "p", descriptor = "I")
    public int field3150;

    @OriginalMember(owner = "client!rd", name = "j", descriptor = "J")
    public long field3144;

    @OriginalMember(owner = "client!rd", name = "c", descriptor = "Lsb;")
    public static class124 field3137;

    @OriginalMember(owner = "client!rd", name = "h", descriptor = "Lsb;")
    public static class124 field3142;

    @OriginalMember(owner = "client!rd", name = "e", descriptor = "Lci;")
    public class60 field3139;

    @OriginalMember(owner = "client!rd", name = "i", descriptor = "Lci;")
    public class60 field3143;

    @OriginalMember(owner = "client!rd", name = "k", descriptor = "Lci;")
    public class60 field3145;

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(B)V")
    public static final void method1316(byte arg0) {
        while (true) {
            if (class143.field2360.method613(121, class222.field3547) >= 11) {
                int var1 = class143.field2360.method612(11, -124);
                if (var1 != 2047) {
                    boolean var2 = false;
                    if (class191.field3129[var1] == null) {
                        var2 = true;
                        class191.field3129[var1] = new class213();
                        if (class128.field2112[var1] != null) {
                            class191.field3129[var1].method1416(class128.field2112[var1], 1);
                        }
                    }
                    class279.field4431[class144.field2386++] = var1;
                    class213 var3 = class191.field3129[var1];
                    var3.field2846 = class207.field3336;
                    int var4 = class143.field2360.method612(1, -125);
                    if (var4 == 1) {
                        class200.field3251[class254.field4039++] = var1;
                    }
                    int var5 = class143.field2360.method612(1, -121);
                    int var6 = class143.field2360.method612(5, -125);
                    if (var6 > 15) {
                        var6 -= 32;
                    }
                    int var7 = class143.field2360.method612(5, -128);
                    if (var7 > 15) {
                        var7 -= 32;
                    }
                    int var8 = class242.field3835[class143.field2360.method612(3, -120)];
                    if (var2) {
                        var3.field2893 = var3.field2831 = var8;
                    }
                    var3.method1409(class48.field878.field2813[0] + var6, (byte) -92, var5 == 1, class48.field878.field2844[0] + var7);
                    continue;
                }
            }
            class143.field2360.method605((byte) -118);
            field3149++;
            if (arg0 <= 47) {
                method1320(-53);
                return;
            }
            return;
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(IIIIII)V")
    public static final void method1317(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = arg1 - arg0;
        int var7 = arg2 - arg5;
        field3148++;
        if (var7 == 0) {
            if (var6 != 0) {
                class270.method1834((byte) 4, arg3, arg0, arg5, arg1);
            }
        } else if (var6 == 0) {
            class105.method782((byte) 48, arg0, arg5, arg3, arg2);
        } else {
            int var8 = (var6 << 12) / var7;
            int var9 = arg0 - (arg5 * var8 >> 12);
            if (arg4 != 3) {
                method1316((byte) -32);
            }
            int var10;
            int var11;
            if (class32.field540 > arg5) {
                var10 = class32.field540;
                var11 = var9 + (class32.field540 * var8 >> 12);
            } else if (arg5 <= class61.field1034) {
                var10 = arg5;
                var11 = arg0;
            } else {
                var11 = (class61.field1034 * var8 >> 12) + var9;
                var10 = class61.field1034;
            }
            int var12;
            int var13;
            if (class32.field540 > arg2) {
                var12 = class32.field540;
                var13 = (class32.field540 * var8 >> 12) + var9;
            } else if (class61.field1034 < arg2) {
                var12 = class61.field1034;
                var13 = var9 + (class61.field1034 * var8 >> 12);
            } else {
                var13 = arg1;
                var12 = arg2;
            }
            if (class108.field1650 > var11) {
                var10 = (class108.field1650 - var9 << 12) / var8;
                var11 = class108.field1650;
            } else if (class154.field2509 < var11) {
                var10 = (class154.field2509 - var9 << 12) / var8;
                var11 = class154.field2509;
            }
            if (class108.field1650 > var13) {
                var13 = class108.field1650;
                var12 = (class108.field1650 - var9 << 12) / var8;
            } else if (var13 > class154.field2509) {
                var12 = (class154.field2509 - var9 << 12) / var8;
                var13 = class154.field2509;
            }
            class47.method400(var11, var10, true, arg3, var12, var13);
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(I)V")
    public static void method1318(int arg0) {
        field3137 = null;
        field3138 = null;
        field3142 = null;
        int var1 = 60 % ((4 - arg0) / 50);
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "([[II)V")
    public static final void method1319(int[][] arg0, int arg1) {
        if (arg1 == 0) {
            field3141++;
            class114.field1841 = arg0;
        }
    }

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "(I)V")
    public static final void method1320(int arg0) {
        field3146++;
        if (arg0 != 15) {
            method1320(27);
        }
        class180.field2994.method1156(arg0 - 95);
        client.field4569.method1156(arg0 - 143);
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(Lsb;ILsb;)V")
    public static final void method1321(class124 arg0, int arg1, class124 arg2) {
        class271.field4342 = arg0;
        class193.field3161 = arg2;
        field3140++;
        class244.field3859 = class193.field3161.method891(0, 3);
        if (arg1 <= 111) {
            field3142 = null;
        }
    }
}
