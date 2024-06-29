import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pd")
public class class179 extends class276 {

    @OriginalMember(owner = "client!pd", name = "T", descriptor = "Lci;")
    public static class60 field2948 = new class60();

    @OriginalMember(owner = "client!pd", name = "X", descriptor = "I")
    public static int field2952 = 0;

    @OriginalMember(owner = "client!pd", name = "Y", descriptor = "I")
    public static int field2953 = 0;

    @OriginalMember(owner = "client!pd", name = "Z", descriptor = "Z")
    public static boolean field2954 = false;

    @OriginalMember(owner = "client!pd", name = "M", descriptor = "I")
    public static int field2941;

    @OriginalMember(owner = "client!pd", name = "N", descriptor = "I")
    public static int field2942;

    @OriginalMember(owner = "client!pd", name = "O", descriptor = "I")
    private int field2943;

    @OriginalMember(owner = "client!pd", name = "P", descriptor = "I")
    private int field2944;

    @OriginalMember(owner = "client!pd", name = "Q", descriptor = "I")
    public static int field2945;

    @OriginalMember(owner = "client!pd", name = "R", descriptor = "I")
    public static int field2946;

    @OriginalMember(owner = "client!pd", name = "S", descriptor = "I")
    public static int field2947;

    @OriginalMember(owner = "client!pd", name = "U", descriptor = "I")
    public static int field2949;

    @OriginalMember(owner = "client!pd", name = "V", descriptor = "I")
    private int field2950;

    @OriginalMember(owner = "client!pd", name = "W", descriptor = "I")
    public static int field2951;

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(BI)V")
    private final void method1184(byte arg0, int arg1) {
        if (arg0 >= 43) {
            this.field2943 = (arg1 & 65280) >> 4;
            this.field2944 = 4080 & arg1 >> 12;
            ++field2946;
            this.field2950 = arg1 << 4 & 4080;
        }
    }

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "(II)[[I")
    public final int[][] method300(int arg0, int arg1) {
        if (arg1 != -1) {
            return null;
        } else {
            ++field2949;
            int[][] var3 = super.field4418.method835((byte) 110, arg0);
            if (super.field4418.field2164) {
                int[] var4 = var3[0];
                int[] var5 = var3[1];
                int[] var6 = var3[2];
                for (int var7 = 0; class53.field929 > var7; ++var7) {
                    var4[var7] = this.field2944;
                    var5[var7] = this.field2943;
                    var6[var7] = this.field2950;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!pd", name = "d", descriptor = "(II)V")
    public static final void method1185(int arg0, int arg1) {
        ++field2942;
        if (arg0 >= -81) {
            method1185(11, -72);
        }
        for (class83 var2 = class157.field2621.method782(0); var2 != null; var2 = class157.field2621.method788(true)) {
            if (~(var2.field1515 >> 48 & 65535L) == ~((long) arg1)) {
                var2.method547(10026);
            }
        }
    }

    @OriginalMember(owner = "client!pd", name = "<init>", descriptor = "(I)V")
    private class179(int arg0) {
        super(0, false);
        this.method1184((byte) 92, arg0);
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(ILeh;B)V")
    public final void method21(int arg0, class101 arg1, byte arg2) {
        if (arg2 != -1) {
            method1187(47, 15, 57);
        }
        if (~arg0 == -1) {
            this.method1184((byte) 47, arg1.method658(22292));
        }
        ++field2951;
    }

    @OriginalMember(owner = "client!pd", name = "g", descriptor = "(I)V")
    public static void method1186(int arg0) {
        field2948 = null;
        if (arg0 != -12220) {
            method1189(false, 126);
        }
    }

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "(III)V")
    public static final void method1187(int arg0, int arg1, int arg2) {
        ++field2947;
        if (arg2 == 16473) {
            for (int var3 = 0; ~var3 > ~class165.field2705; ++var3) {
                class90 var4 = class293.method1976((byte) 23, var3);
                if (var4 != null) {
                    int var5 = var4.field1602;
                    if (~var5 <= -1 && !class287.field4555.method235(var5, true)) {
                        var5 = -1;
                    }
                    int var9;
                    if (~var4.field1587 <= -1) {
                        int var6 = var4.field1587;
                        int var7 = (127 & var6) + arg1;
                        if (~var7 <= -1) {
                            if (~var7 < -128) {
                                var7 = 127;
                            }
                        } else {
                            var7 = 0;
                        }
                        int var8 = (arg0 + var6 & 64512) + var7 - -(var6 & 896);
                        var9 = class287.field4559[class31.method213(96, arg2 + -20104, var8)];
                    } else if (~var5 > -1) {
                        if (~var4.field1594 == 0) {
                            var9 = -1;
                        } else {
                            int var10 = var4.field1594;
                            int var11 = (127 & var10) + arg1;
                            if (var11 >= 0) {
                                if (~var11 < -128) {
                                    var11 = 127;
                                }
                            } else {
                                var11 = 0;
                            }
                            int var12 = (arg0 + var10 & 64512) + (896 & var10) + var11;
                            var9 = class287.field4559[class31.method213(96, -3631, var12)];
                        }
                    } else {
                        var9 = class287.field4559[class31.method213(96, -3631, class287.field4555.method234((byte) -9, var5))];
                    }
                    class92.field1615[var3 + 1] = var9;
                }
            }
        }
    }

    @OriginalMember(owner = "client!pd", name = "<init>", descriptor = "()V")
    public class179() {
        this(0);
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(ILvh;)V")
    public static final void method1188(int arg0, class108 arg1) {
        class10.field147 = arg1;
        ++field2941;
        if (arg0 >= -18) {
            field2953 = -22;
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(ZI)I")
    public static final int method1189(boolean arg0, int arg1) {
        if (arg1 != -1) {
            field2954 = false;
        }
        long var2 = class232.method1544((byte) -111);
        ++field2945;
        for (class261 var4 = !arg0 ? (class261) class143.field2456.method788(true) : (class261) class143.field2456.method782(0); var4 != null; var4 = (class261) class143.field2456.method788(true)) {
            if ((var4.field4261 & 4611686018427387903L) < var2) {
                if ((var4.field4261 & 4611686018427387904L) != 0L) {
                    int var5 = (int) var4.field1515;
                    class125.field2191[var5] = class50.field857[var5];
                    var4.method547(10026);
                    return var5;
                }
                var4.method547(10026);
            }
        }
        return -1;
    }
}
