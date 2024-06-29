import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jd")
public class class155 extends class189 {

    @OriginalMember(owner = "client!jd", name = "I", descriptor = "I")
    public static int field2523 = -1;

    @OriginalMember(owner = "client!jd", name = "H", descriptor = "Ls;")
    public static class186 field2522 = new class186(70, 6);

    @OriginalMember(owner = "client!jd", name = "J", descriptor = "Lbj;")
    public static class162 field2524 = new class162(22, 2);

    @OriginalMember(owner = "client!jd", name = "K", descriptor = "Llf;")
    public static class160 field2525 = new class160(2);

    @OriginalMember(owner = "client!jd", name = "w", descriptor = "I")
    public static int field2512;

    @OriginalMember(owner = "client!jd", name = "x", descriptor = "I")
    public static int field2513;

    @OriginalMember(owner = "client!jd", name = "z", descriptor = "I")
    public static int field2515;

    @OriginalMember(owner = "client!jd", name = "B", descriptor = "I")
    public static int field2516;

    @OriginalMember(owner = "client!jd", name = "F", descriptor = "I")
    public static int field2520;

    @OriginalMember(owner = "client!jd", name = "G", descriptor = "I")
    public static int field2521;

    @OriginalMember(owner = "client!jd", name = "L", descriptor = "Lhs;")
    public static class216 field2526;

    @OriginalMember(owner = "client!jd", name = "C", descriptor = "Ljava/lang/String;")
    public String field2517;

    @OriginalMember(owner = "client!jd", name = "D", descriptor = "[C")
    public char[] field2518;

    @OriginalMember(owner = "client!jd", name = "E", descriptor = "[C")
    public char[] field2519;

    @OriginalMember(owner = "client!jd", name = "v", descriptor = "[I")
    public int[] field2511;

    @OriginalMember(owner = "client!jd", name = "y", descriptor = "[I")
    public int[] field2514;

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(I)V")
    public static void method1121(int arg0) {
        field2522 = null;
        if (arg0 != 0) {
            field2525 = null;
        }
        field2526 = null;
        field2525 = null;
        field2524 = null;
    }

    @OriginalMember(owner = "client!jd", name = "c", descriptor = "(I)V")
    public final void method1122(int arg0) {
        if (arg0 >= -34) {
            method1127(null, null, null, null, 123);
        }
        field2520++;
        if (this.field2511 != null) {
            for (int var2 = 0; var2 < this.field2511.length; var2++) {
                this.field2511[var2] = class418.method2558(this.field2511[var2], 32768);
            }
        }
        if (this.field2514 != null) {
            for (int var3 = 0; var3 < this.field2514.length; var3++) {
                this.field2514[var3] = class418.method2558(this.field2514[var3], 32768);
            }
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(CI)I")
    public final int method1123(char arg0, int arg1) {
        if (arg1 != 14072) {
            field2526 = null;
        }
        field2512++;
        if (this.field2511 == null) {
            return -1;
        }
        for (int var3 = 0; var3 < this.field2511.length; var3++) {
            if (this.field2519[var3] == arg0) {
                return this.field2511[var3];
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(BLnn;)V")
    public final void method1124(byte arg0, class289 arg1) {
        if (arg0 != -36) {
            this.method1125((char) 65522, -37);
        }
        while (true) {
            int var3 = arg1.method1858(-3256);
            if (var3 == 0) {
                field2515++;
                return;
            }
            this.method1126(var3, 0, arg1);
        }
    }

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "(CI)I")
    public final int method1125(char arg0, int arg1) {
        field2521++;
        if (arg1 <= 105) {
            return -35;
        } else if (this.field2514 == null) {
            return -1;
        } else {
            for (int var3 = 0; var3 < this.field2514.length; var3++) {
                if (this.field2518[var3] == arg0) {
                    return this.field2514[var3];
                }
            }
            return -1;
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(IILnn;)V")
    private final void method1126(int arg0, int arg1, class289 arg2) {
        if (arg0 == 1) {
            this.field2517 = arg2.method1834(-17823);
        } else if (arg0 == 2) {
            int var4 = arg2.method1858(-3256);
            this.field2514 = new int[var4];
            this.field2518 = new char[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field2514[var5] = arg2.method1841((byte) -117);
                byte var6 = arg2.method1816(true);
                this.field2518[var5] = var6 == 0 ? 0 : class289.method1878(class509.method3048(arg1, 124), var6);
            }
        } else if (arg0 == 3) {
            int var7 = arg2.method1858(-3256);
            this.field2511 = new int[var7];
            this.field2519 = new char[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field2511[var8] = arg2.method1841((byte) -7);
                byte var9 = arg2.method1816(true);
                this.field2519[var8] = var9 == 0 ? 0 : class289.method1878(114, var9);
            }
        }
        if (arg1 != 0) {
            this.method1124((byte) 81, null);
        }
        field2516++;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "([ILsf;[I[II)V")
    public static final void method1127(int[] arg0, class366 arg1, int[] arg2, int[] arg3, int arg4) {
        field2513++;
        for (int var5 = 0; var5 < arg2.length; var5++) {
            int var6 = arg2[var5];
            int var7 = arg0[var5];
            int var8 = arg3[var5];
            for (int var9 = 0; var7 != 0 && arg1.field7802.length > var9; var9++) {
                if ((var7 & 0x1) != 0) {
                    if (var6 == -1) {
                        arg1.field7802[var9] = null;
                    } else {
                        class57 var10 = class422.field6355.method236(var6, (byte) -66);
                        int var11 = var10.field1203;
                        class452 var12 = arg1.field7802[var9];
                        if (var12 != null) {
                            if (var12.field6710 == var6) {
                                if (var11 == 0) {
                                    var12 = arg1.field7802[var9] = null;
                                } else if (var11 == 1) {
                                    var12.field6715 = 0;
                                    var12.field6714 = 0;
                                    var12.field6711 = var8;
                                    var12.field6713 = 0;
                                    var12.field6706 = 1;
                                    class433.method2602(var10, arg1.field6073, arg1.field6078, (byte) 85, arg1.field6084, 0, class15.field266 == arg1);
                                } else if (var11 == 2) {
                                    var12.field6715 = 0;
                                }
                            } else if (var10.field1204 >= class422.field6355.method236(var12.field6710, (byte) 22).field1204) {
                                var12 = arg1.field7802[var9] = null;
                            }
                        }
                        if (var12 == null) {
                            class452 var13 = arg1.field7802[var9] = new class452();
                            var13.field6714 = 0;
                            var13.field6713 = 0;
                            var13.field6711 = var8;
                            var13.field6710 = var6;
                            var13.field6706 = 1;
                            var13.field6715 = 0;
                            class433.method2602(var10, arg1.field6073, arg1.field6078, (byte) 53, arg1.field6084, 0, class15.field266 == arg1);
                        }
                    }
                }
                var7 >>>= 0x1;
            }
        }
        if (arg4 != -1) {
            method1121(-32);
        }
    }
}
