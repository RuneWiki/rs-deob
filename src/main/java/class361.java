import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lo")
public class class361 extends class3 {

    @OriginalMember(owner = "client!lo", name = "I", descriptor = "[I")
    private int[] field5698 = new int[3];

    @OriginalMember(owner = "client!lo", name = "N", descriptor = "I")
    private int field5703 = 409;

    @OriginalMember(owner = "client!lo", name = "F", descriptor = "I")
    private int field5695 = 4096;

    @OriginalMember(owner = "client!lo", name = "O", descriptor = "I")
    private int field5704 = 4096;

    @OriginalMember(owner = "client!lo", name = "H", descriptor = "I")
    private int field5697 = 4096;

    @OriginalMember(owner = "client!lo", name = "G", descriptor = "I")
    public static int field5696;

    @OriginalMember(owner = "client!lo", name = "J", descriptor = "I")
    public static int field5699;

    @OriginalMember(owner = "client!lo", name = "K", descriptor = "I")
    public static int field5700;

    @OriginalMember(owner = "client!lo", name = "L", descriptor = "I")
    public static int field5701;

    @OriginalMember(owner = "client!lo", name = "M", descriptor = "I")
    public static int field5702;

    @OriginalMember(owner = "client!lo", name = "P", descriptor = "I")
    public static int field5705;

    @OriginalMember(owner = "client!lo", name = "<init>", descriptor = "()V", line = 8)
    public class361() {
        super(1, false);
    }

    @OriginalMember(owner = "client!lo", name = "e", descriptor = "(I)V", line = 12)
    public static final void method2505(int arg0) {
        class23.field342.method644((byte) -90);
        if (arg0 >= 115) {
            field5701++;
        }
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(II)[[I", line = 24)
    public final int[][] method22(int arg0, int arg1) {
        field5700++;
        int[][] var3 = this.field20.method2435(arg1, false);
        if (arg0 != -21194) {
            this.field5703 = 38;
        }
        if (this.field20.field5556) {
            int[][] var4 = this.method16(arg1, 0, (byte) 101);
            int[] var5 = var4[2];
            int[] var6 = var4[1];
            int[] var7 = var4[0];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; var11 < class326.field5342; var11++) {
                int var12 = var7[var11];
                int var13 = var12 - this.field5698[0];
                if (var13 < 0) {
                    var13 = -var13;
                }
                if (this.field5703 < var13) {
                    var8[var11] = var12;
                    var9[var11] = var6[var11];
                    var10[var11] = var5[var11];
                } else {
                    int var14 = var6[var11];
                    int var15 = var14 - this.field5698[1];
                    if (var15 < 0) {
                        var15 = -var15;
                    }
                    if (this.field5703 >= var15) {
                        int var16 = var5[var11];
                        int var17 = var16 - this.field5698[2];
                        if (var17 < 0) {
                            var17 = -var17;
                        }
                        if (this.field5703 >= var17) {
                            var8[var11] = this.field5704 * var12 >> 12;
                            var9[var11] = this.field5697 * var14 >> 12;
                            var10[var11] = this.field5695 * var16 >> 12;
                        } else {
                            var8[var11] = var12;
                            var9[var11] = var14;
                            var10[var11] = var16;
                        }
                    } else {
                        var8[var11] = var12;
                        var9[var11] = var14;
                        var10[var11] = var5[var11];
                    }
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!lo", name = "d", descriptor = "(III)Z", line = 122)
    public static final boolean method2506(int arg0, int arg1, int arg2) {
        field5699++;
        if (!class286.field4681) {
            return false;
        }
        int var3 = arg2 >> 16;
        int var4 = arg2 & 0xFFFF;
        if (class167.field2627[var3] == null || class167.field2627[var3][var4] == null) {
            return false;
        }
        class264 var5 = class167.field2627[var3][var4];
        if (arg1 > -43) {
            field5696 = 12;
        }
        if (arg0 == -1 && var5.field4350 == 0) {
            for (int var6 = 0; var6 < class117.field1701; var6++) {
                if (class300.field4949[var6] == 49 || class300.field4949[var6] == 1004 || class300.field4949[var6] == 28 || class300.field4949[var6] == 16 || class300.field4949[var6] == 33) {
                    for (class264 var7 = class94.method629(5386, class86.field1243[var6]); var7 != null; var7 = class268.method1886(125, var7)) {
                        if (var5.field4204 == var7.field4204) {
                            return true;
                        }
                    }
                }
            }
        } else {
            for (int var8 = 0; var8 < class117.field1701; var8++) {
                if (class100.field1450[var8] == arg0 && class86.field1243[var8] == var5.field4204 && (class300.field4949[var8] == 49 || class300.field4949[var8] == 1004 || class300.field4949[var8] == 28 || class300.field4949[var8] == 16 || class300.field4949[var8] == 33)) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(Lfh;IZ)V", line = 204)
    public final void method14(class313 arg0, int arg1, boolean arg2) {
        field5705++;
        if (arg1 == 0) {
            this.field5703 = arg0.method2250(-1613178296);
        } else if (arg1 == 1) {
            this.field5695 = arg0.method2250(-1613178296);
        } else if (arg1 == 2) {
            this.field5697 = arg0.method2250(-1613178296);
        } else if (arg1 == 3) {
            this.field5704 = arg0.method2250(-1613178296);
        } else if (arg1 == 4) {
            int var5 = arg0.method2249(-92);
            this.field5698[0] = class235.method1623(16711680, var5) << 4;
            this.field5698[2] = class235.method1623(0, var5 >> 12);
            this.field5698[1] = class235.method1623(var5 >> 4, 4080);
        }
        if (arg2) {
            this.field5695 = 72;
        }
    }

    @OriginalMember(owner = "client!lo", name = "e", descriptor = "(B)V", line = 274)
    public static final void method2507(byte arg0) {
        field5702++;
        if (arg0 <= 69) {
            return;
        }
        for (class122 var1 = (class122) class166.field2615.method1081(-53); var1 != null; var1 = (class122) class166.field2615.method1083((byte) 113)) {
            class92 var2 = var1.field1822;
            if (class120.field1779 != var2.field1351 || var2.field1330 < class58.field875) {
                var1.method1131(8);
            } else if (class58.field875 >= var2.field1343) {
                if (var2.field1324 > 0) {
                    class233 var3 = class329.field5377[var2.field1324 - 1];
                    if (var3 != null && var3.field4796 >= 0 && var3.field4796 < 13312 && var3.field4783 >= 0 && var3.field4783 < 13312) {
                        var2.method607((byte) 55, var3.field4783, client.method889(var3.field4796, var2.field1351, var3.field4783, -116) - var2.field1357, class58.field875, var3.field4796);
                    }
                }
                if (var2.field1324 < 0) {
                    int var4 = -var2.field1324 - 1;
                    class39 var5;
                    if (class102.field1490 == var4) {
                        var5 = class329.field5388;
                    } else {
                        var5 = class130.field1984[var4];
                    }
                    if (var5 != null && var5.field4796 >= 0 && var5.field4796 < 13312 && var5.field4783 >= 0 && var5.field4783 < 13312) {
                        var2.method607((byte) 55, var5.field4783, client.method889(var5.field4796, var2.field1351, var5.field4783, -128) - var2.field1357, class58.field875, var5.field4796);
                    }
                }
                var2.method608(class215.field3322, false);
                class255.method1816(class120.field1779, (int) var2.field1355, (int) var2.field1354, (int) var2.field1332, 60, var2, var2.field1342, -1L, false);
            }
        }
    }
}
