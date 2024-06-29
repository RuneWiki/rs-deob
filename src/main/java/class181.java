import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sg")
public class class181 {

    @OriginalMember(owner = "client!sg", name = "c", descriptor = "[I")
    private int[] field3005;

    @OriginalMember(owner = "client!sg", name = "d", descriptor = "Lkj;")
    public static class114 field3006 = null;

    @OriginalMember(owner = "client!sg", name = "e", descriptor = "I")
    public static int field3007 = 0;

    @OriginalMember(owner = "client!sg", name = "b", descriptor = "I")
    public static int field3004 = 0;

    @OriginalMember(owner = "client!sg", name = "g", descriptor = "I")
    public static int field3009 = 0;

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "I")
    public static int field3003;

    @OriginalMember(owner = "client!sg", name = "f", descriptor = "I")
    public static int field3008;

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "([ILti;[I[IB)V")
    public static final void method1274(int[] arg0, class139 arg1, int[] arg2, int[] arg3, byte arg4) {
        if (arg4 != -119) {
            return;
        }
        for (int var5 = 0; var5 < arg0.length; var5++) {
            int var6 = arg2[var5];
            int var7 = arg0[var5];
            int var8 = arg3[var5];
            for (int var9 = 0; var6 != 0 && arg1.field2847.length > var9; var9++) {
                if ((var6 & 0x1) != 0) {
                    if (var7 == -1) {
                        arg1.field2847[var9] = null;
                    } else {
                        class77 var10 = class28.method246(-41, var7);
                        int var11 = var10.field1270;
                        class161 var12 = arg1.field2847[var9];
                        if (var12 != null) {
                            if (var12.field2633 == var7) {
                                if (var11 == 0) {
                                    var12 = arg1.field2847[var9] = null;
                                } else if (var11 == 1) {
                                    var12.field2622 = var8;
                                    var12.field2626 = 0;
                                    var12.field2624 = 1;
                                    var12.field2639 = 0;
                                    var12.field2623 = 0;
                                    class124.method916(arg1.field2887, arg1.field2849, arg4 ^ 0xE387F7D9, false, var10, 0);
                                } else if (var11 == 2) {
                                    var12.field2626 = 0;
                                }
                            } else if (var10.field1257 >= class28.method246(arg4 + 191, var12.field2633).field1257) {
                                var12 = arg1.field2847[var9] = null;
                            }
                        }
                        if (var12 == null) {
                            class161 var13 = arg1.field2847[var9] = new class161();
                            var13.field2633 = var7;
                            var13.field2622 = var8;
                            var13.field2624 = 1;
                            var13.field2623 = 0;
                            var13.field2626 = 0;
                            var13.field2639 = 0;
                            class124.method916(arg1.field2887, arg1.field2849, 477628496, false, var10, 0);
                        }
                    }
                }
                var6 >>>= 0x1;
            }
        }
        field3008++;
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(II)I")
    public final int method1275(int arg0, int arg1) {
        field3003++;
        int var3 = (this.field3005.length >> 1) - 1;
        if (arg1 != 4461) {
            field3004 = 41;
        }
        int var4 = arg0 & var3;
        while (true) {
            int var5 = this.field3005[var4 + var4 + 1];
            if (var5 == -1) {
                return -1;
            }
            if (this.field3005[var4 + var4] == arg0) {
                return var5;
            }
            var4 = var3 & var4 + 1;
        }
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(B)V")
    public static void method1276(byte arg0) {
        field3006 = null;
        if (arg0 > -14) {
            field3007 = -40;
        }
    }

    @OriginalMember(owner = "client!sg", name = "<init>", descriptor = "([I)V")
    public class181(int[] arg0) {
        int var2;
        for (var2 = 1; var2 <= ((arg0.length >> 1) + arg0.length); var2 <<= 0x1) {
        }
        this.field3005 = new int[var2 + var2];
        for (int var3 = 0; var3 < (var2 + var2); var3++) {
            this.field3005[var3] = -1;
        }
        int var4 = 0;
        while (var4 < arg0.length) {
            int var5;
            for (var5 = var2 - 1 & arg0[var4]; this.field3005[var5 + var5 + 1] != -1; var5 = var5 + 1 & var2 + -1) {
            }
            this.field3005[var5 + var5] = arg0[var4];
            this.field3005[var5 + var5 + 1] = var4++;
        }
    }
}
