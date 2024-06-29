import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pk")
public class class76 {

    @OriginalMember(owner = "client!pk", name = "c", descriptor = "Lvm;")
    public static class297 field1443 = new class297(64);

    @OriginalMember(owner = "client!pk", name = "e", descriptor = "I")
    public static int field1445 = -1;

    @OriginalMember(owner = "client!pk", name = "f", descriptor = "Lvm;")
    public static class297 field1446 = new class297(4);

    @OriginalMember(owner = "client!pk", name = "j", descriptor = "I")
    public static int field1450 = -1;

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "I")
    public static int field1441;

    @OriginalMember(owner = "client!pk", name = "b", descriptor = "I")
    public static int field1442;

    @OriginalMember(owner = "client!pk", name = "g", descriptor = "I")
    public static int field1447;

    @OriginalMember(owner = "client!pk", name = "i", descriptor = "I")
    public static int field1449;

    @OriginalMember(owner = "client!pk", name = "d", descriptor = "Lrd;")
    public static class135 field1444;

    @OriginalMember(owner = "client!pk", name = "h", descriptor = "Lng;")
    public static class138 field1448;

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(B)V", line = 6)
    public static void method575(byte arg0) {
        field1444 = null;
        if (arg0 != 112) {
            field1448 = (class138) null;
        }
        field1446 = null;
        field1443 = null;
        field1448 = null;
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(ILgg;)V", line = 25)
    public static final void method576(int arg0, class67 arg1) {
        field1441++;
        int var2 = arg1.field1212 - class45.field840;
        int var3 = arg1.field1217 * 128 + (arg1.method515(5373952) * 64);
        int var4 = 14 / ((arg0 - 1) / 40);
        int var5 = arg1.field1200 * 128 + (arg1.method515(5373952) * 64);
        if (arg1.field1252 == 0) {
            arg1.field1213 = 1024;
        }
        arg1.field1204 = 0;
        arg1.field1197 += (var5 - arg1.field1197) / var2;
        arg1.field1192 += (var3 - arg1.field1192) / var2;
        if (arg1.field1252 == 1) {
            arg1.field1213 = 1536;
        }
        if (arg1.field1252 == 2) {
            arg1.field1213 = 0;
        }
        if (arg1.field1252 == 3) {
            arg1.field1213 = 512;
        }
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(BI)V", line = 60)
    public static final void method577(byte arg0, int arg1) {
        field1449++;
        class25.field325.method2075(arg1, 1);
        int var2 = 99 % ((arg0 + 81) / 44);
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(IIIILmc;Lmc;IIIIJ)V", line = 70)
    public static final void method578(int arg0, int arg1, int arg2, int arg3, class51 arg4, class51 arg5, int arg6, int arg7, int arg8, int arg9, long arg10) {
        if (arg4 == null) {
            return;
        }
        class39 var12 = new class39();
        var12.field712 = arg10;
        var12.field705 = arg1 * 128 + 64;
        var12.field715 = arg2 * 128 + 64;
        var12.field703 = arg3;
        var12.field700 = arg4;
        var12.field711 = arg5;
        var12.field709 = arg6;
        var12.field706 = arg7;
        var12.field699 = arg8;
        var12.field708 = arg9;
        for (int var13 = arg0; var13 >= 0; var13--) {
            if (class41.field790[var13][arg1][arg2] == null) {
                class41.field790[var13][arg1][arg2] = new class271(var13, arg1, arg2);
            }
        }
        class41.field790[arg0][arg1][arg2].field4643 = var12;
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(IIIIII)V", line = 102)
    public static final void method579(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field1447++;
        int var6 = arg5;
        int var7 = arg2;
        int var8 = arg1 * arg1;
        int var9 = arg2 * arg2;
        int var10 = var8 << 1;
        int var11 = var9 << 1;
        int var12 = arg2 << 1;
        int var13 = var9 - ((var12 - 1) * var10);
        int var14 = (1 - var12) * var8 + var11;
        int var15 = var8 << 2;
        int var16 = var9 << 2;
        int var17 = ((arg5 << 1) + 3) * var11;
        int var18 = ((arg2 << 1) - 3) * var10;
        if (class105.field1887 <= arg3 && arg3 <= class274.field4748) {
            int var19 = class101.method731(class175.field3106, arg0 + arg1, class244.field4161, true);
            int var20 = class101.method731(class175.field3106, arg0 - arg1, class244.field4161, true);
            class73.method550(-29903, class308.field5329[arg3], var19, var20, arg4);
        }
        int var21 = (arg2 - 1) * var15;
        int var22 = (arg5 + 1) * var16;
        while (var7 > 0) {
            if (var14 < 0) {
                while (var14 < 0) {
                    var13 += var22;
                    var6++;
                    var14 += var17;
                    var17 += var16;
                    var22 += var16;
                }
            }
            var7--;
            if (var13 < 0) {
                var13 += var22;
                var22 += var16;
                var14 += var17;
                var6++;
                var17 += var16;
            }
            var13 += -var18;
            var14 += -var21;
            int var23 = arg3 - var7;
            int var24 = arg3 + var7;
            if (var24 >= class105.field1887 && var23 <= class274.field4748) {
                int var25 = class101.method731(class175.field3106, arg0 + var6, class244.field4161, true);
                int var26 = class101.method731(class175.field3106, arg0 - var6, class244.field4161, true);
                if (class105.field1887 <= var23) {
                    class73.method550(-29903, class308.field5329[var23], var25, var26, arg4);
                }
                if (var24 <= class274.field4748) {
                    class73.method550(-29903, class308.field5329[var24], var25, var26, arg4);
                }
            }
            var18 -= var15;
            var21 -= var15;
        }
    }

    @OriginalMember(owner = "client!pk", name = "b", descriptor = "(B)V", line = 204)
    public static final void method580(byte arg0) {
        field1442++;
        if (!class72.field1318 && class40.field724 != 2 && arg0 < -4) {
            try {
                class71.field1309.method1766(class307.field5289, 0);
            } catch (Throwable var2) {
            }
        }
    }
}
