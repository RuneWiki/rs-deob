import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ui")
public abstract class class232 {

    @OriginalMember(owner = "client!ui", name = "f", descriptor = "Llc;")
    private static class143 field4238 = class66.method374("white:", -1);

    @OriginalMember(owner = "client!ui", name = "d", descriptor = "Llc;")
    public static class143 field4236 = field4238;

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "Llc;")
    public static class143 field4233 = field4238;

    @OriginalMember(owner = "client!ui", name = "e", descriptor = "Lng;")
    public static class139 field4237 = new class139(4);

    @OriginalMember(owner = "client!ui", name = "k", descriptor = "Llc;")
    public static class143 field4243 = class66.method374("Schrifts-=tze geladen)3", -1);

    @OriginalMember(owner = "client!ui", name = "l", descriptor = "I")
    public static int field4244 = 0;

    @OriginalMember(owner = "client!ui", name = "b", descriptor = "I")
    public static int field4234;

    @OriginalMember(owner = "client!ui", name = "c", descriptor = "I")
    public static int field4235;

    @OriginalMember(owner = "client!ui", name = "g", descriptor = "I")
    public static int field4239;

    @OriginalMember(owner = "client!ui", name = "h", descriptor = "I")
    public static int field4240;

    @OriginalMember(owner = "client!ui", name = "i", descriptor = "I")
    public static int field4241;

    @OriginalMember(owner = "client!ui", name = "j", descriptor = "I")
    public static int field4242;

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(I)V")
    public static void method1572(int arg0) {
        field4236 = null;
        field4238 = null;
        if (arg0 != 12032) {
            method1575(-59, 39);
        }
        field4233 = null;
        field4237 = null;
        field4243 = null;
    }

    @OriginalMember(owner = "client!ui", name = "b", descriptor = "(I)V")
    public static final void method1573(int arg0) {
        class125.method760((long) class146.field2635);
        if (class7.field138 != -1) {
            class147.method946(class7.field138, 30);
        }
        for (int var1 = 0; var1 < class128.field2260; var1++) {
            if (class69.field1323[var1]) {
                class136.field2384[var1] = true;
            }
            class136.field2391[var1] = class69.field1323[var1];
            class69.field1323[var1] = false;
        }
        class190.field3471 = null;
        field4240++;
        class248.field4448 = class146.field2635;
        class195.field3614 = -1;
        class18.field320 = -1;
        if (class7.field138 != -1) {
            class128.field2260 = 0;
            class101.method601(0, class269.field4820, 0, -1, 0, arg0 ^ 0xFFFFEC17, class7.field138, 0, class10.field222);
        }
        class260.method1720();
        class128.field2252 = 0;
        if (arg0 != -5055) {
            field4233 = null;
        }
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(II)I")
    public abstract int method930(int arg0, int arg1);

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(B)V")
    public static final void method1574(byte arg0) {
        if (arg0 < 45) {
            field4238 = null;
        }
        if (class154.field2781 != null) {
            class71.method413(0, class154.field2781);
            class154.field2781 = null;
        }
        field4239++;
    }

    @OriginalMember(owner = "client!ui", name = "b", descriptor = "(II)I")
    public static final int method1575(int arg0, int arg1) {
        field4241++;
        double var2 = (double) (arg0 & 0xFF) / 256.0D;
        double var4 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
        double var6 = var4;
        double var8 = (double) ((arg0 & 0xFF07) >> 8) / 256.0D;
        if (var8 > var4) {
            var6 = var8;
        }
        if (var2 > var6) {
            var6 = var2;
        }
        double var10 = 0.0D;
        if (arg1 != 32086) {
            method1577(-80);
        }
        double var12 = var4;
        double var14 = 0.0D;
        if (var8 < var4) {
            var12 = var8;
        }
        if (var2 < var12) {
            var12 = var2;
        }
        double var16 = (var6 + var12) / 2.0D;
        int var18 = (int) (var16 * 256.0D);
        if (var6 != var12) {
            if (var16 < 0.5D) {
                var14 = (var6 - var12) / (var6 + var12);
            }
            if (var4 == var6) {
                var10 = (var8 - var2) / (var6 - var12);
            } else if (var6 == var8) {
                var10 = (var2 - var4) / (var6 - var12) + 2.0D;
            } else if (var2 == var6) {
                var10 = (var4 - var8) / (var6 - var12) + 4.0D;
            }
            if (var16 >= 0.5D) {
                var14 = (var6 - var12) / (2.0D - var6 - var12);
            }
        }
        double var19 = var10 / 6.0D;
        int var21 = (int) (var19 * 256.0D);
        if (var18 < 0) {
            var18 = 0;
        } else if (var18 > 255) {
            var18 = 255;
        }
        int var22 = (int) (var14 * 256.0D);
        if (var22 < 0) {
            var22 = 0;
        } else if (var22 > 255) {
            var22 = 255;
        }
        if (var18 > 243) {
            var22 >>= 0x4;
        } else if (var18 > 217) {
            var22 >>= 0x3;
        } else if (var18 > 192) {
            var22 >>= 0x2;
        } else if (var18 > 179) {
            var22 >>= 0x1;
        }
        return (var18 >> 1) + (var21 >> 2 << 10) + (var22 >> 5 << 7);
    }

    @OriginalMember(owner = "client!ui", name = "c", descriptor = "(I)Loa;")
    public abstract class252 method938(int arg0);

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(ZIIZIIZ)V")
    public static final void method1576(boolean arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, boolean arg6) {
        if (arg2 > arg1) {
            int var7 = (arg1 + arg2) / 2;
            int var8 = arg1;
            class133 var9 = class212.field3943[var7];
            class212.field3943[var7] = class212.field3943[arg2];
            class212.field3943[arg2] = var9;
            for (int var10 = arg1; var10 < arg2; var10++) {
                if (class119.method731(class212.field3943[var10], var9, arg5, arg4, arg6, 255, arg0) <= 0) {
                    class133 var11 = class212.field3943[var10];
                    class212.field3943[var10] = class212.field3943[var8];
                    class212.field3943[var8++] = var11;
                }
            }
            class212.field3943[arg2] = class212.field3943[var8];
            class212.field3943[var8] = var9;
            method1576(arg0, arg1, var8 - 1, false, arg4, arg5, arg6);
            method1576(arg0, var8 + 1, arg2, arg3, arg4, arg5, arg6);
        }
        field4234++;
        if (arg3) {
            method1574((byte) -14);
        }
    }

    @OriginalMember(owner = "client!ui", name = "c", descriptor = "(II)V")
    public abstract void method941(int arg0, int arg1);

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(IZ)[B")
    public abstract byte[] method933(int arg0, boolean arg1);

    @OriginalMember(owner = "client!ui", name = "d", descriptor = "(I)I")
    public static final int method1577(int arg0) {
        if (arg0 != -32222) {
            method1573(-21);
        }
        field4235++;
        return class90.field1628 == null || class144.field2584 >= class90.field1628.field2376 ? -1 : class144.field2584++;
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(II[BI)I")
    public static final int method1578(int arg0, int arg1, byte[] arg2, int arg3) {
        field4242++;
        int var4 = -1;
        for (int var5 = arg1; var5 < arg0; var5++) {
            var4 = class31.field485[(var4 ^ arg2[var5]) & 0xFF] ^ var4 >>> 8;
        }
        if (arg3 >= -10) {
            method1574((byte) 46);
        }
        return ~var4;
    }
}
