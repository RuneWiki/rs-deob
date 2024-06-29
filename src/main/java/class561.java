import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cd")
public class class561 extends class646 {

    @OriginalMember(owner = "client!cd", name = "K", descriptor = "Leda;")
    public static class116 field8176 = new class116(88, -2);

    @OriginalMember(owner = "client!cd", name = "N", descriptor = "Leda;")
    public static class116 field8179 = new class116(19, 7);

    @OriginalMember(owner = "client!cd", name = "R", descriptor = "Llfa;")
    public static class313 field8183 = new class313(14, 1);

    @OriginalMember(owner = "client!cd", name = "U", descriptor = "Llfa;")
    public static class313 field8186 = new class313(15, 4);

    @OriginalMember(owner = "client!cd", name = "V", descriptor = "Llfa;")
    public static class313 field8187 = new class313(16, -2);

    @OriginalMember(owner = "client!cd", name = "W", descriptor = "Llfa;")
    public static class313 field8188 = new class313(17, 0);

    @OriginalMember(owner = "client!cd", name = "X", descriptor = "Llfa;")
    public static class313 field8189 = new class313(18, -2);

    @OriginalMember(owner = "client!cd", name = "Y", descriptor = "Llfa;")
    public static class313 field8190 = new class313(19, -2);

    @OriginalMember(owner = "client!cd", name = "Z", descriptor = "Llfa;")
    public static class313 field8191 = new class313(20, 6);

    @OriginalMember(owner = "client!cd", name = "ab", descriptor = "Llfa;")
    public static class313 field8192 = new class313(21, 9);

    @OriginalMember(owner = "client!cd", name = "bb", descriptor = "Llfa;")
    public static class313 field8193 = new class313(22, -2);

    @OriginalMember(owner = "client!cd", name = "cb", descriptor = "Llfa;")
    public static class313 field8194 = new class313(23, 4);

    @OriginalMember(owner = "client!cd", name = "db", descriptor = "Llfa;")
    public static class313 field8195 = new class313(24, -1);

    @OriginalMember(owner = "client!cd", name = "eb", descriptor = "Llfa;")
    public static class313 field8196 = new class313(25, -2);

    @OriginalMember(owner = "client!cd", name = "fb", descriptor = "Llfa;")
    public static class313 field8197 = new class313(26, 0);

    @OriginalMember(owner = "client!cd", name = "gb", descriptor = "Llfa;")
    public static class313 field8198 = new class313(27, 0);

    @OriginalMember(owner = "client!cd", name = "hb", descriptor = "[Llfa;")
    private static class313[] field8199 = new class313[32];

    @OriginalMember(owner = "client!cd", name = "ib", descriptor = "I")
    public static int field8200;

    @OriginalMember(owner = "client!cd", name = "I", descriptor = "I")
    public static int field8174;

    @OriginalMember(owner = "client!cd", name = "J", descriptor = "I")
    public static int field8175;

    @OriginalMember(owner = "client!cd", name = "L", descriptor = "I")
    public static int field8177;

    @OriginalMember(owner = "client!cd", name = "M", descriptor = "I")
    public static int field8178;

    @OriginalMember(owner = "client!cd", name = "P", descriptor = "I")
    public static int field8181;

    @OriginalMember(owner = "client!cd", name = "Q", descriptor = "I")
    public static int field8182;

    @OriginalMember(owner = "client!cd", name = "S", descriptor = "I")
    public static int field8184;

    @OriginalMember(owner = "client!cd", name = "T", descriptor = "I")
    public static int field8185;

    @OriginalMember(owner = "client!cd", name = "O", descriptor = "Lbj;")
    public static class404 field8180;

    static {
        class313[] var0 = class38.method315(-73);
        for (int var1 = 0; ~var0.length < ~var1; ++var1) {
            field8199[var0[var1].field4340] = var0[var1];
        }
        field8200 = -1;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(II)[[I", line = 4)
    public final int[][] method298(int arg0, int arg1) {
        ++field8181;
        if (arg0 != -12424) {
            method3283(-10);
        }
        int[][] var3 = super.field9164.method1002(arg0 ^ -12522, arg1);
        if (super.field9164.field2082) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            for (int var7 = 0; ~var7 > ~class89.field1330; ++var7) {
                this.method3284(var7, -2048, arg1);
                int[][] var8 = this.method3626(90, class240.field3531, 0);
                var4[var7] = var8[0][class86.field1289];
                var5[var7] = var8[1][class86.field1289];
                var6[var7] = var8[2][class86.field1289];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(Lek;IB)V", line = 46)
    public final void method295(class465 arg0, int arg1, byte arg2) {
        if (arg1 == 0) {
            super.field9160 = arg0.method2705(-113) == 1;
        }
        if (arg2 <= 7) {
            field8189 = null;
        }
        ++field8174;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(ZZLjava/lang/String;)V", line = 63)
    public static final void method3280(boolean arg0, boolean arg1, String arg2) {
        ++field8175;
        if (arg2 != null) {
            if (~class90.field1333 <= -101) {
                class300.method1846(4, class343.field4788.method2059(class238.field3511, true), 0);
            } else {
                String var3 = class57.method494(arg2, (byte) 95);
                if (var3 != null) {
                    for (int var4 = 0; class90.field1333 > var4; ++var4) {
                        String var9 = class57.method494(class623.field8878[var4], (byte) 120);
                        if (var9 != null && var9.equals(var3)) {
                            class300.method1846(4, arg2 + class343.field4789.method2059(class238.field3511, true), 0);
                            return;
                        }
                        if (class409.field5848[var4] != null) {
                            String var10 = class57.method494(class409.field5848[var4], (byte) 118);
                            if (var10 != null && var10.equals(var3)) {
                                class300.method1846(4, arg2 + class343.field4789.method2059(class238.field3511, true), 0);
                                return;
                            }
                        }
                    }
                    for (int var5 = 0; var5 < class520.field7677; ++var5) {
                        String var7 = class57.method494(class437.field6290[var5], (byte) 99);
                        if (var7 != null && var7.equals(var3)) {
                            class300.method1846(4, class343.field4794.method2059(class238.field3511, arg1) + arg2 + class343.field4795.method2059(class238.field3511, true), 0);
                            return;
                        }
                        if (class661.field9302[var5] != null) {
                            String var8 = class57.method494(class661.field9302[var5], (byte) 121);
                            if (var8 != null && var8.equals(var3)) {
                                class300.method1846(4, class343.field4794.method2059(class238.field3511, true) + arg2 + class343.field4795.method2059(class238.field3511, true), 0);
                                return;
                            }
                        }
                    }
                    if (class57.method494(class103.field1708.field3848, (byte) 91).equals(var3)) {
                        class300.method1846(4, class343.field4791.method2059(class238.field3511, true), 0);
                    } else {
                        ++class535.field7861;
                        class699 var6 = class452.method2630(class699.field9897, class427.field6092, (byte) 121);
                        var6.field9908.method2753((byte) 71, class252.method1609(0, arg2) + 1);
                        var6.field9908.method2703(false, arg2);
                        var6.field9908.method2753((byte) 110, arg0 ? 1 : 0);
                        class149.method1134(var6, arg1);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(BI)V", line = 161)
    public static final void method3281(byte arg0, int arg1) {
        int var2 = 68 / ((arg0 - -48) / 43);
        ++field8177;
        class449 var3 = class611.method3463(arg1, (byte) -125, 4);
        var3.method2614(90);
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(I[B)V", line = 173)
    public static final void method3282(int arg0, byte[] arg1) {
        ++field8178;
        if (arg0 != -1) {
            field8188 = null;
        }
        class465 var2 = new class465(arg1);
        while (true) {
            while (true) {
                int var3 = var2.method2705(-68);
                if (var3 == 0) {
                    return;
                }
                if (var3 == 1) {
                    int[] var4 = class171.field2768 = new int[6];
                    var4[0] = var2.method2755((byte) -82);
                    var4[1] = var2.method2755((byte) -45);
                    var4[2] = var2.method2755((byte) -111);
                    var4[3] = var2.method2755((byte) -117);
                    var4[4] = var2.method2755((byte) -93);
                    var4[5] = var2.method2755((byte) -121);
                } else if (var3 == 4) {
                    int var5 = var2.method2705(arg0 ^ 83);
                    class512.field7613 = new int[var5];
                    for (int var6 = 0; ~var5 < ~var6; ++var6) {
                        class512.field7613[var6] = var2.method2755((byte) -117);
                        if (~class512.field7613[var6] == -65536) {
                            class512.field7613[var6] = -1;
                        }
                    }
                } else if (var3 == 5) {
                    int var7 = var2.method2705(-66);
                    class66.field950 = new int[var7];
                    for (int var8 = 0; var8 < var7; ++var8) {
                        class66.field950[var8] = var2.method2755((byte) -42);
                        if (~class66.field950[var8] == -65536) {
                            class66.field950[var8] = -1;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "(IB)[I", line = 250)
    public final int[] method424(int arg0, byte arg1) {
        ++field8184;
        int[] var3 = super.field9156.method2193(1269, arg0);
        if (super.field9156.field5075) {
            for (int var4 = 0; ~class89.field1330 < ~var4; ++var4) {
                this.method3284(var4, arg1 + -1928, arg0);
                int[] var5 = this.method3628(false, 0, class240.field3531);
                var3[var4] = var5[class86.field1289];
            }
        }
        return arg1 != -120 ? null : var3;
    }

    @OriginalMember(owner = "client!cd", name = "d", descriptor = "(I)V", line = 291)
    public static void method3283(int arg0) {
        field8180 = null;
        field8196 = null;
        field8195 = null;
        field8191 = null;
        field8183 = null;
        field8198 = null;
        field8199 = null;
        field8176 = null;
        field8197 = null;
        field8193 = null;
        field8194 = null;
        field8186 = null;
        field8179 = null;
        field8192 = null;
        field8190 = null;
        field8188 = null;
        field8189 = null;
        if (arg0 < -126) {
            field8187 = null;
        }
    }

    @OriginalMember(owner = "client!cd", name = "d", descriptor = "(III)V", line = 319)
    private final void method3284(int arg0, int arg1, int arg2) {
        ++field8185;
        int var4 = class518.field7652[arg0];
        int var5 = class78.field1195[arg2];
        float var6 = (float) Math.atan2((double) (var4 + -2048), (double) (arg1 + var5));
        if ((double) var6 >= -3.141592653589793D && (double) var6 <= -2.356194490192345D) {
            class86.field1289 = arg0;
            class240.field3531 = arg2;
        } else if ((double) var6 <= -1.5707963267948966D && (double) var6 >= -2.356194490192345D) {
            class86.field1289 = arg2;
            class240.field3531 = arg0;
        } else if ((double) var6 <= -0.7853981633974483D && (double) var6 >= -1.5707963267948966D) {
            class240.field3531 = arg0;
            class86.field1289 = -arg2 + class89.field1330;
        } else if (var6 <= 0.0F && (double) var6 >= -0.7853981633974483D) {
            class86.field1289 = arg0;
            class240.field3531 = class236.field3492 - arg2;
        } else if (var6 >= 0.0F && (double) var6 <= 0.7853981633974483D) {
            class86.field1289 = -arg0 + class89.field1330;
            class240.field3531 = -arg2 + class236.field3492;
        } else if ((double) var6 >= 0.7853981633974483D && (double) var6 <= 1.5707963267948966D) {
            class240.field3531 = -arg0 + class236.field3492;
            class86.field1289 = -arg2 + class89.field1330;
        } else if ((double) var6 >= 1.5707963267948966D && (double) var6 <= 2.356194490192345D) {
            class86.field1289 = arg2;
            class240.field3531 = -arg0 + class236.field3492;
        } else if ((double) var6 >= 2.356194490192345D && (double) var6 <= 3.141592653589793D) {
            class240.field3531 = arg2;
            class86.field1289 = -arg0 + class89.field1330;
        }
        class240.field3531 &= class453.field6525;
        class86.field1289 &= class156.field2572;
    }

    @OriginalMember(owner = "client!cd", name = "<init>", descriptor = "()V", line = 397)
    public class561() {
        super(1, false);
    }
}
