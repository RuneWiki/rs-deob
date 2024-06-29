import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sh")
public class class254 {

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "Lvk;")
    public static class67 field4085 = new class67(64);

    @OriginalMember(owner = "client!sh", name = "c", descriptor = "I")
    public static int field4087;

    @OriginalMember(owner = "client!sh", name = "d", descriptor = "I")
    public static int field4088;

    @OriginalMember(owner = "client!sh", name = "e", descriptor = "I")
    public static int field4089;

    @OriginalMember(owner = "client!sh", name = "f", descriptor = "I")
    public static int field4090;

    @OriginalMember(owner = "client!sh", name = "h", descriptor = "I")
    public static int field4092;

    @OriginalMember(owner = "client!sh", name = "i", descriptor = "I")
    public static int field4093;

    @OriginalMember(owner = "client!sh", name = "g", descriptor = "[I")
    public static int[] field4091;

    @OriginalMember(owner = "client!sh", name = "b", descriptor = "[Lbe;")
    public static class81[] field4086;

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(ZZI)I", line = 14)
    public static final int method1634(boolean arg0, boolean arg1, int arg2) {
        field4090++;
        int var3 = arg2;
        if (arg0) {
            var3 = class196.field3139 + class156.field2483 + arg2;
        }
        if (arg1) {
            var3 += class46.field666 + class230.field3727;
        }
        return var3;
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(B)V", line = 47)
    public static void method1635(byte arg0) {
        field4085 = null;
        field4091 = null;
        field4086 = null;
        int var1 = -77 % ((arg0 - 37) / 58);
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "([BB)[B", line = 59)
    public static final byte[] method1636(byte[] arg0, byte arg1) {
        field4087++;
        int var2 = arg0.length;
        if (arg1 != 71) {
            field4085 = (class67) null;
        }
        byte[] var3 = new byte[var2];
        class213.method1339(arg0, 0, var3, 0, var2);
        return var3;
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(IIIIII)V", line = 83)
    public static final void method1637(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field4092++;
        long var6 = class100.method670(arg1, arg0, arg2);
        if (var6 != 0L) {
            int var8 = (int) var6 >> 20 & 0x3;
            int var9 = (int) var6 >> 14 & 0x1F;
            int[] var10 = class286.field4718;
            int var11 = arg3;
            if (var6 > 0L) {
                var11 = arg5;
            }
            int var12 = (52736 - arg2 * 512) * 4 + arg0 * 4 + 24624;
            int var13 = (int) (var6 >>> 32) & Integer.MAX_VALUE;
            class291 var14 = class291.method1939(0, var13);
            if (var14.field4774 == -1) {
                if (var9 == 0 || var9 == 2) {
                    if (var8 == 0) {
                        var10[var12] = var11;
                        var10[var12 + 512] = var11;
                        var10[var12 + 1024] = var11;
                        var10[var12 + 1536] = var11;
                    } else if (var8 == 1) {
                        var10[var12] = var11;
                        var10[var12 + 1] = var11;
                        var10[var12 + 2] = var11;
                        var10[var12 + 3] = var11;
                    } else if (var8 == 2) {
                        var10[var12 + 3] = var11;
                        var10[var12 + 512 + 3] = var11;
                        var10[var12 + 3 + 1024] = var11;
                        var10[var12 + 3 + 1536] = var11;
                    } else if (var8 == 3) {
                        var10[var12 + 1536] = var11;
                        var10[var12 + 1536 + 1] = var11;
                        var10[var12 + 1538] = var11;
                        var10[var12 + 1536 + 3] = var11;
                    }
                }
                if (var9 == 3) {
                    if (var8 == 0) {
                        var10[var12] = var11;
                    } else if (var8 == 1) {
                        var10[var12 + 3] = var11;
                    } else if (var8 == 2) {
                        var10[var12 + 3 + 1536] = var11;
                    } else if (var8 == 3) {
                        var10[var12 + 1536] = var11;
                    }
                }
                if (var9 == 2) {
                    if (var8 == 3) {
                        var10[var12] = var11;
                        var10[var12 + 512] = var11;
                        var10[var12 + 1024] = var11;
                        var10[var12 + 1536] = var11;
                    } else if (var8 == 0) {
                        var10[var12] = var11;
                        var10[var12 + 1] = var11;
                        var10[var12 + 2] = var11;
                        var10[var12 + 3] = var11;
                    } else if (var8 == 1) {
                        var10[var12 + 3] = var11;
                        var10[var12 + 515] = var11;
                        var10[var12 + 3 + 1024] = var11;
                        var10[var12 + 1539] = var11;
                    } else if (var8 == 2) {
                        var10[var12 + 1536] = var11;
                        var10[var12 + 1536 + 1] = var11;
                        var10[var12 + 1536 + 2] = var11;
                        var10[var12 + 1536 + 3] = var11;
                    }
                }
            } else {
                class33 var15 = class134.field2162[var14.field4774];
                if (var15 != null) {
                    int var16 = (var14.field4812 * 4 - var15.field1243) / 2;
                    int var17 = (var14.field4785 * 4 - var15.field1241) / 2;
                    var15.method246(arg0 * 4 + var16 + 48, 48 - -((-var14.field4785 + -arg2 + 104) * 4) - -var17);
                }
            }
        }
        long var18 = class245.method1597(arg1, arg0, arg2);
        if (var18 != 0L) {
            int var20 = (int) var18 >> 14 & 0x1F;
            int var21 = Integer.MAX_VALUE & (int) (var18 >>> 32);
            int var22 = ((int) var18 & 0x34EDF0) >> 20;
            class291 var23 = class291.method1939(0, var21);
            if (var23.field4774 != -1) {
                class33 var24 = class134.field2162[var23.field4774];
                if (var24 != null) {
                    int var25 = (var23.field4785 * 4 - var24.field1241) / 2;
                    int var26 = (var23.field4812 * 4 - var24.field1243) / 2;
                    var24.method246(arg0 * 4 + var26 + 48, (-var23.field4785 + -arg2 + 104) * 4 + var25 + 48);
                }
            } else if (var20 == 9) {
                int[] var27 = class286.field4718;
                int var28 = 15658734;
                if (var18 > 0L) {
                    var28 = 15597568;
                }
                int var29 = (52736 - arg2 * 512) * 4 + arg0 * 4 + 24624;
                if (var22 == 0 || var22 == 2) {
                    var27[var29 + 1536] = var28;
                    var27[var29 + 1024 + 1] = var28;
                    var27[var29 + 512 + 2] = var28;
                    var27[var29 + 3] = var28;
                } else {
                    var27[var29] = var28;
                    var27[var29 + 513] = var28;
                    var27[var29 + 1024 + 2] = var28;
                    var27[var29 + 1536 + 3] = var28;
                }
            }
        }
        long var30 = class259.method1658(arg1, arg0, arg2);
        if (arg4 <= 100) {
            field4085 = (class67) null;
        }
        if (var30 == 0L) {
            return;
        }
        int var32 = (int) (var30 >>> 32) & Integer.MAX_VALUE;
        class291 var33 = class291.method1939(0, var32);
        if (var33.field4774 == -1) {
            return;
        }
        class33 var34 = class134.field2162[var33.field4774];
        if (var34 != null) {
            int var35 = (var33.field4812 * 4 - var34.field1243) / 2;
            int var36 = (var33.field4785 * 4 - var34.field1241) / 2;
            var34.method246((arg0 * 4) + var35 + 48, (104 - var33.field4785 + -arg2) * 4 + var36 + 48);
        }
    }
}
