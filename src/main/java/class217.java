import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!um")
public class class217 {

    @OriginalMember(owner = "client!um", name = "h", descriptor = "[Z")
    public static boolean[] field3655 = new boolean[112];

    @OriginalMember(owner = "client!um", name = "b", descriptor = "I")
    public static int field3649;

    @OriginalMember(owner = "client!um", name = "c", descriptor = "I")
    public static int field3650;

    @OriginalMember(owner = "client!um", name = "d", descriptor = "I")
    public static int field3651;

    @OriginalMember(owner = "client!um", name = "e", descriptor = "I")
    public static int field3652;

    @OriginalMember(owner = "client!um", name = "a", descriptor = "Lce;")
    public static class126 field3648;

    @OriginalMember(owner = "client!um", name = "g", descriptor = "Lki;")
    public static class307 field3654;

    @OriginalMember(owner = "client!um", name = "f", descriptor = "[Lk;")
    public static class240[] field3653;

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(I)V", line = 10)
    public static void method1489(int arg0) {
        if (arg0 == -10878) {
            field3648 = null;
            field3655 = null;
            field3654 = null;
            field3653 = null;
        }
    }

    @OriginalMember(owner = "client!um", name = "b", descriptor = "(I)V", line = 26)
    public static final void method1490(int arg0) {
        if (arg0 <= -123) {
            field3652++;
            class265.field4493.method1185(1);
        }
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(IBIIII)V", line = 45)
    public static final void method1491(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5) {
        class94.method647(class314.field5393[arg5], arg4 - arg3, -7, arg3 + arg4, arg0);
        int var6 = 0;
        field3650++;
        int var7 = arg2;
        if (arg1 != -62) {
            field3655 = (boolean[]) null;
        }
        int var8 = arg2 << 1;
        int var9 = arg3 * arg3;
        int var10 = var9 << 1;
        int var11 = arg2 * arg2;
        int var12 = var11 << 1;
        int var13 = var11 - ((var8 - 1) * var10);
        int var14 = (1 - var8) * var9 + var12;
        int var15 = var9 << 2;
        int var16 = var11 << 2;
        int var17 = ((var6 << 1) + 3) * var12;
        int var18 = ((arg2 << 1) - 3) * var10;
        int var19 = (var6 + 1) * var16;
        int var20 = (arg2 - 1) * var15;
        while (var7 > 0) {
            if (var14 < 0) {
                while (var14 < 0) {
                    var14 += var17;
                    var17 += var16;
                    var13 += var19;
                    var19 += var16;
                    var6++;
                }
            }
            if (var13 < 0) {
                var13 += var19;
                var6++;
                var19 += var16;
                var14 += var17;
                var17 += var16;
            }
            var13 += -var18;
            var18 -= var15;
            var14 += -var20;
            var20 -= var15;
            int var21 = arg4 + var6;
            var7--;
            int var22 = arg5 + var7;
            int var23 = arg5 - var7;
            int var24 = arg4 - var6;
            class94.method647(class314.field5393[var23], var24, -7, var21, arg0);
            class94.method647(class314.field5393[var22], var24, arg1 ^ 0x3B, var21, arg0);
        }
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(BII)I", line = 129)
    public static final int method1492(byte arg0, int arg1, int arg2) {
        field3651++;
        class192 var3 = (class192) class95.field1496.method1631(false, (long) arg1);
        if (var3 == null) {
            return 0;
        } else if (arg0 >= -60) {
            return -100;
        } else if (arg2 >= 0 && var3.field3278.length > arg2) {
            return var3.field3278[arg2];
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(IIILce;I)V", line = 167)
    public static final void method1493(int arg0, int arg1, int arg2, class126 arg3, int arg4) {
        field3649++;
        class112 var5 = class53.method337((byte) -127, arg0, arg4);
        if (arg2 != 59 || var5 == null) {
            return;
        }
        if (var5.field1782 != null) {
            class282 var6 = new class282();
            var6.field4686 = arg1;
            var6.field4688 = arg3;
            var6.field4697 = var5;
            var6.field4699 = var5.field1782;
            class309.method2111(var6, arg2 ^ 0x30D7B);
        }
        boolean var7 = true;
        if (var5.field1885 > 0) {
            var7 = class301.method2024(var5, -105);
        }
        if (!var7 || !class294.method1951(client.method804(var5), arg1 - 1, -18617)) {
            return;
        }
        if (arg1 == 1) {
            class24.field346++;
            class103.field1645.method1238(248, 71);
            class103.field1645.method947(arg0, (byte) 98);
            class103.field1645.method959(70, arg4);
        }
        if (arg1 == 2) {
            class57.field889++;
            class103.field1645.method1238(50, arg2 + 4);
            class103.field1645.method947(arg0, (byte) 121);
            class103.field1645.method959(50, arg4);
        }
        if (arg1 == 3) {
            class320.field5487++;
            class103.field1645.method1238(24, arg2 ^ 0x7F);
            class103.field1645.method947(arg0, (byte) 111);
            class103.field1645.method959(-86, arg4);
        }
        if (arg1 == 4) {
            class123.field2078++;
            class103.field1645.method1238(6, 79);
            class103.field1645.method947(arg0, (byte) 118);
            class103.field1645.method959(95, arg4);
        }
        if (arg1 == 5) {
            class103.field1645.method1238(71, arg2 + 52);
            class128.field2204++;
            class103.field1645.method947(arg0, (byte) 103);
            class103.field1645.method959(53, arg4);
        }
        if (arg1 == 6) {
            class103.field1645.method1238(82, 87);
            class65.field1092++;
            class103.field1645.method947(arg0, (byte) 127);
            class103.field1645.method959(-106, arg4);
        }
        if (arg1 == 7) {
            class103.field1645.method1238(177, 97);
            class288.field4784++;
            class103.field1645.method947(arg0, (byte) 102);
            class103.field1645.method959(arg2 - 9, arg4);
        }
        if (arg1 == 8) {
            class103.field1645.method1238(59, arg2 + 14);
            class54.field816++;
            class103.field1645.method947(arg0, (byte) 97);
            class103.field1645.method959(127, arg4);
        }
        if (arg1 == 9) {
            class221.field3739++;
            class103.field1645.method1238(231, 116);
            class103.field1645.method947(arg0, (byte) 103);
            class103.field1645.method959(arg2 + 39, arg4);
        }
        if (arg1 == 10) {
            class134.field2294++;
            class103.field1645.method1238(242, 112);
            class103.field1645.method947(arg0, (byte) 96);
            class103.field1645.method959(101, arg4);
        }
    }
}
