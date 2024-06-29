import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gn")
public class class258 extends class335 {

    @OriginalMember(owner = "client!gn", name = "N", descriptor = "Z")
    private boolean field4043 = true;

    @OriginalMember(owner = "client!gn", name = "S", descriptor = "Z")
    private boolean field4048 = true;

    @OriginalMember(owner = "client!gn", name = "U", descriptor = "Ljava/lang/String;")
    public static String field4050 = "Take";

    @OriginalMember(owner = "client!gn", name = "L", descriptor = "I")
    public static int field4041;

    @OriginalMember(owner = "client!gn", name = "M", descriptor = "I")
    public static int field4042;

    @OriginalMember(owner = "client!gn", name = "O", descriptor = "I")
    public static int field4044;

    @OriginalMember(owner = "client!gn", name = "P", descriptor = "I")
    public static int field4045;

    @OriginalMember(owner = "client!gn", name = "Q", descriptor = "I")
    public static int field4046;

    @OriginalMember(owner = "client!gn", name = "R", descriptor = "I")
    public static int field4047;

    @OriginalMember(owner = "client!gn", name = "T", descriptor = "I")
    public static int field4049;

    @OriginalMember(owner = "client!gn", name = "V", descriptor = "I")
    public static int field4051;

    @OriginalMember(owner = "client!gn", name = "W", descriptor = "I")
    public static int field4052;

    @OriginalMember(owner = "client!gn", name = "X", descriptor = "I")
    public static int field4053;

    @OriginalMember(owner = "client!gn", name = "Y", descriptor = "I")
    public static int field4054;

    @OriginalMember(owner = "client!gn", name = "Z", descriptor = "I")
    public static int field4055;

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(CB)Z", line = 4)
    public static final boolean method1767(char arg0, byte arg1) {
        if (arg1 <= 94) {
            method1768(true);
        }
        field4051++;
        return arg0 >= '0' && arg0 <= '9';
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(ILkh;I)V", line = 25)
    public final void method230(int arg0, class166 arg1, int arg2) {
        if (arg0 == 0) {
            this.field4048 = arg1.method1178(0) == 1;
        } else if (arg0 == 1) {
            this.field4043 = arg1.method1178(0) == 1;
        } else if (arg0 == 2) {
            this.field5234 = arg1.method1178(0) == 1;
        }
        if (arg2 < 51) {
            field4041 = 93;
        }
        field4042++;
    }

    @OriginalMember(owner = "client!gn", name = "c", descriptor = "(Z)V", line = 58)
    public static void method1768(boolean arg0) {
        if (!arg0) {
            method1770((byte) 77, -12, -118);
        }
        field4050 = null;
    }

    @OriginalMember(owner = "client!gn", name = "f", descriptor = "(I)I", line = 75)
    public static final int method1769(int arg0) {
        if (arg0 <= 51) {
            field4050 = (String) null;
        }
        field4055++;
        if (class322.field5023) {
            return 0;
        } else if (class19.method150(-88)) {
            return class289.field4503 ? 2 : 1;
        } else {
            return 1;
        }
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(BII)I", line = 93)
    public static final int method1770(byte arg0, int arg1, int arg2) {
        if (arg2 < arg1) {
            int var3 = arg2;
            arg2 = arg1;
            arg1 = var3;
        }
        while (arg1 != 0) {
            int var4 = arg2 % arg1;
            arg2 = arg1;
            arg1 = var4;
        }
        field4053++;
        return arg0 <= 33 ? -56 : arg2;
    }

    @OriginalMember(owner = "client!gn", name = "<init>", descriptor = "()V", line = 265)
    public class258() {
        super(1, false);
    }

    @OriginalMember(owner = "client!gn", name = "b", descriptor = "(II)[I", line = 132)
    public final int[] method149(int arg0, int arg1) {
        field4049++;
        int[] var3 = this.field5233.method1110((byte) 108, arg0);
        if (this.field5233.field2467) {
            int[] var4 = this.method2330(this.field4043 ? class227.field3597 - arg0 : arg0, true, 0);
            if (this.field4048) {
                for (int var5 = 0; var5 < class105.field1630; var5++) {
                    var3[var5] = var4[class244.field3906 - var5];
                }
            } else {
                class343.method2378(var4, 0, var3, 0, class105.field1630);
            }
        }
        return arg1 == 621 ? var3 : (int[]) null;
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(IB)[[I", line = 172)
    public final int[][] method249(int arg0, byte arg1) {
        field4046++;
        if (arg1 != 51) {
            this.field4048 = false;
        }
        int[][] var3 = this.field5232.method1101(arg0, true);
        if (this.field5232.field2446) {
            int[][] var4 = this.method2328(this.field4043 ? class227.field3597 - arg0 : arg0, false, 0);
            int[] var5 = var4[1];
            int[] var6 = var4[2];
            int[] var7 = var3[2];
            int[] var8 = var3[1];
            int[] var9 = var4[0];
            int[] var10 = var3[0];
            if (this.field4048) {
                for (int var11 = 0; var11 < class105.field1630; var11++) {
                    var10[var11] = var9[class244.field3906 - var11];
                    var8[var11] = var5[class244.field3906 - var11];
                    var7[var11] = var6[class244.field3906 - var11];
                }
            } else {
                for (int var12 = 0; var12 < class105.field1630; var12++) {
                    var10[var12] = var9[var12];
                    var8[var12] = var5[var12];
                    var7[var12] = var6[var12];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!gn", name = "g", descriptor = "(I)V", line = 244)
    public static final void method1771(int arg0) {
        field4047++;
        class120.field1828 = null;
        if (arg0 != 20371) {
            field4052 = -78;
        }
        class161.method1100(class322.field5024, -1, -1, 0, 0, 0, 0, class188.field2816, class331.field5160);
        if (class120.field1828 != null) {
            class208.method1480(class142.field2209, 10602, 0, class188.field2816, class125.field1957.field3506, -1412584499, class322.field5024, class120.field1828, class120.field1835, 0);
            class120.field1828 = null;
        }
    }
}
