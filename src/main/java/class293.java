import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vm")
public abstract class class293 {

    @OriginalMember(owner = "client!vm", name = "c", descriptor = "[I")
    public static int[] field4417 = new int[] { 2047, 16383, 65535 };

    @OriginalMember(owner = "client!vm", name = "f", descriptor = "I")
    public static int field4420 = 0;

    @OriginalMember(owner = "client!vm", name = "b", descriptor = "I")
    public static int field4416;

    @OriginalMember(owner = "client!vm", name = "d", descriptor = "I")
    public static int field4418;

    @OriginalMember(owner = "client!vm", name = "e", descriptor = "I")
    public static int field4419;

    @OriginalMember(owner = "client!vm", name = "g", descriptor = "I")
    public static int field4421;

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "[Ldp;")
    public static class319[] field4415;

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(B)V")
    public static void method1843(byte arg0) {
        field4415 = null;
        field4417 = null;
        if (arg0 != -97) {
            method1844(43);
        }
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(I)Z")
    public abstract boolean method897(int arg0);

    @OriginalMember(owner = "client!vm", name = "b", descriptor = "(B)C")
    public abstract char method895(byte arg0);

    @OriginalMember(owner = "client!vm", name = "c", descriptor = "(B)J")
    public abstract long method893(byte arg0);

    @OriginalMember(owner = "client!vm", name = "b", descriptor = "(I)I")
    public abstract int method891(int arg0);

    @OriginalMember(owner = "client!vm", name = "c", descriptor = "(I)V")
    public static final void method1844(int arg0) {
        field4416++;
        class44.field628 = null;
        class24.field320 = -1;
        if (arg0 < 38) {
            field4420 = 95;
        }
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(III[BII)Z")
    public static final boolean method1845(int arg0, int arg1, int arg2, byte[] arg3, int arg4, int arg5) {
        field4419++;
        if (arg2 != 65535) {
            return false;
        }
        boolean var6 = true;
        class446 var7 = new class446(arg3);
        int var8 = -1;
        label60: while (true) {
            int var9 = var7.method2609((byte) -92);
            if (var9 == 0) {
                return var6;
            }
            var8 += var9;
            int var10 = 0;
            boolean var11 = false;
            while (true) {
                while (!var11) {
                    int var13 = var7.method2635(22);
                    if (var13 == 0) {
                        continue label60;
                    }
                    var10 += var13 - 1;
                    int var14 = var10 & 0x3F;
                    int var15 = (var10 & 0xFD1) >> 6;
                    int var16 = var7.method2628(49152) >> 2;
                    int var17 = arg0 + var15;
                    int var18 = var14 + arg1;
                    if (var17 > 0 && var18 > 0 && var17 < (arg4 - 1) && var18 < (arg5 - 1)) {
                        class271 var19 = class206.field3124.method338((byte) 107, var8);
                        if (var16 != 22 || class337.field5038.field3937 || var19.field4053 != 0 || var19.field4069 == 1 || var19.field4045) {
                            if (!var19.method1769((byte) -20)) {
                                var6 = false;
                                class363.field5510++;
                            }
                            var11 = true;
                        }
                    }
                }
                int var12 = var7.method2635(86);
                if (var12 == 0) {
                    break;
                }
                var7.method2628(arg2 ^ 0x3FFF);
            }
        }
    }

    @OriginalMember(owner = "client!vm", name = "d", descriptor = "(I)I")
    public abstract int method892(int arg0);
}
