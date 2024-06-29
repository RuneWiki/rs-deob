import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ph")
public class class79 extends class177 {

    @OriginalMember(owner = "client!ph", name = "E", descriptor = "Lta;")
    public static class197 field1107 = new class197(20);

    @OriginalMember(owner = "client!ph", name = "K", descriptor = "I")
    public static int field1112 = 0;

    @OriginalMember(owner = "client!ph", name = "M", descriptor = "Z")
    public static volatile boolean field1114 = false;

    @OriginalMember(owner = "client!ph", name = "L", descriptor = "I")
    public static int field1113 = 0;

    @OriginalMember(owner = "client!ph", name = "J", descriptor = "F")
    public static float field1111;

    @OriginalMember(owner = "client!ph", name = "C", descriptor = "I")
    public static int field1105;

    @OriginalMember(owner = "client!ph", name = "D", descriptor = "I")
    public static int field1106;

    @OriginalMember(owner = "client!ph", name = "F", descriptor = "I")
    public static int field1108;

    @OriginalMember(owner = "client!ph", name = "H", descriptor = "I")
    public static int field1109;

    @OriginalMember(owner = "client!ph", name = "I", descriptor = "I")
    public static int field1110;

    @OriginalMember(owner = "client!ph", name = "N", descriptor = "I")
    public static int field1115;

    @OriginalMember(owner = "client!ph", name = "d", descriptor = "(I)V", line = 7)
    public static void method626(int arg0) {
        int var1 = 43 / ((25 - arg0) / 53);
        field1107 = null;
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(BIIII)V", line = 15)
    public static final void method627(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        if (class204.field3244 < 100) {
            class289.method2042((byte) -67);
        }
        field1110++;
        if (class36.field534) {
            class194.method1416(arg2, arg3, arg1 + arg2, arg3 + arg4);
        } else {
            class168.method1234(arg2, arg3, arg1 + arg2, arg3 - -arg4);
        }
        if (class204.field3244 < 100) {
            byte var5 = 20;
            int var6 = arg1 / 2 + arg2;
            int var7 = arg3 + (arg4 / 2) - var5 - 18;
            if (class36.field534) {
                class194.method1413(arg2, arg3, arg1, arg4, 0);
                class194.method1406(var6 - 152, var7, 304, 34, 9179409);
                class194.method1406(var6 - 151, var7 + 1, 302, 32, 0);
                class194.method1413(var6 - 150, var7 + 2, class204.field3244 * 3, 30, 9179409);
                class194.method1413(class204.field3244 * 3 + var6 - 150, var7 + 2, 300 - (class204.field3244 * 3), 30, 0);
            } else {
                class168.method1224(arg2, arg3, arg1, arg4, 0);
                class168.method1228(var6 - 152, var7, 304, 34, 9179409);
                class168.method1228(var6 - 151, var7 + 1, 302, 32, 0);
                class168.method1224(var6 - 150, var7 + 2, class204.field3244 * 3, 30, 9179409);
                class168.method1224(class204.field3244 * 3 + (var6 - 150), var7 - -2, 300 - (class204.field3244 * 3), 30, 0);
            }
            class64.field956.method439(class142.field2188, var6, var5 + var7, 16777215, -1);
            return;
        }
        class121.field1913 = (int) ((float) (arg1 * 2) / field1111);
        int var8 = class241.field3631 - (int) ((float) arg4 / field1111);
        class57.field857 = (int) ((float) (arg4 * 2) / field1111);
        class45.field712 = class12.field136 - ((int) ((float) arg1 / field1111));
        int var9 = class12.field136 - (int) ((float) arg1 / field1111);
        class105.field1606 = class241.field3631 - (int) ((float) arg4 / field1111);
        int var10 = (int) ((float) arg1 / field1111) + class12.field136;
        int var11 = (int) ((float) arg4 / field1111) + class241.field3631;
        if (class36.field534) {
            if (class62.field940 == null || class62.field940.field312 != arg1 || class62.field940.field315 != arg4) {
                class62.field940 = null;
                class62.field940 = new class134(arg1, arg4);
            }
            class168.method1244(class62.field940.field2101, arg1, arg4);
            class219.method1568(arg1, var9, var10, (byte) -117, arg4, var8, 0, var11, 0);
            class276.method1927(var8, 0, 0, var10, var9, var11, arg0 ^ 0xFFFFFFE3, arg1, arg4);
            class224.method1601(var9, arg4, var10, 0, var11, (byte) -90, 0, var8, arg1);
            class194.method1415(class62.field940.field2101, arg2, arg3, arg1, arg4);
            class168.field2525 = null;
        } else {
            class219.method1568(arg1 + arg2, var9, var10, (byte) -91, arg3 + arg4, var8, arg3, var11, arg2);
            class276.method1927(var8, arg2, arg3, var10, var9, var11, arg0 ^ 0xFFFFFFE3, arg2 + arg1, arg3 + arg4);
            class224.method1601(var9, arg3 + arg4, var10, arg2, var11, (byte) -92, arg3, var8, arg1 + arg2);
        }
        if (class261.field3862 > 0) {
            class27.field313--;
            if (class27.field313 == 0) {
                class27.field313 = 20;
                class261.field3862--;
            }
        }
        if (class87.field1285) {
            int var12 = arg3 + arg4 - 8;
            int var13 = arg1 + arg2 - 5;
            class182.field2726.method447("Fps:" + class96.field1424, var13, var12, 16776960, -1);
            int var17 = var12 - 15;
            int var14 = 16776960;
            Runtime var15 = Runtime.getRuntime();
            int var16 = (int) ((var15.totalMemory() - var15.freeMemory()) / 1024L);
            if (var16 > 65536) {
                var14 = 16711680;
            }
            class182.field2726.method447("Mem:" + var16 + "k", var13, var17, var14, -1);
            var12 = var17 - 15;
        }
        if (arg0 != 28) {
            method626(-54);
        }
    }

    @OriginalMember(owner = "client!ph", name = "b", descriptor = "(Z)V", line = 132)
    public static final void method628(boolean arg0) {
        int var1 = class174.field2574 + class235.field3602.field4507;
        field1106++;
        int var2 = class299.field4710 + class235.field3602.field4496;
        if (class147.field2245 - var1 < -500 || (class147.field2245 - var1) > 500 || (class99.field1473 - var2) < -500 || class99.field1473 - var2 > 500) {
            class99.field1473 = var2;
            class147.field2245 = var1;
        }
        if (class147.field2245 != var1) {
            class147.field2245 += (var1 - class147.field2245) / 16;
        }
        if (class99.field1473 != var2) {
            class99.field1473 += (var2 - class99.field1473) / 16;
        }
        if (!arg0) {
            return;
        }
        if (class304.field4766) {
            for (int var3 = 0; var3 < class179.field2681; var3++) {
                int var4 = class320.field4985[var3];
                if (var4 == 98) {
                    class80.field1125 = class80.field1125 + 47 & 0xFFFFFFF0;
                } else if (var4 == 99) {
                    class80.field1125 = class80.field1125 - 17 & 0xFFFFFFF0;
                } else if (var4 == 96) {
                    class136.field2125 = class136.field2125 - 65 & 0xFFFFFF80;
                } else if (var4 == 97) {
                    class136.field2125 = class136.field2125 + 191 & 0xFFFFFF80;
                }
            }
        } else {
            if (class50.field768[98]) {
                class41.field608 += (12 - class41.field608) / 2;
            } else if (class50.field768[99]) {
                class41.field608 += (-class41.field608 - 12) / 2;
            } else {
                class41.field608 /= 2;
            }
            class80.field1125 += class41.field608 / 2;
            if (class50.field768[96]) {
                class115.field1802 += (-class115.field1802 - 24) / 2;
            } else if (class50.field768[97]) {
                class115.field1802 += (24 - class115.field1802) / 2;
            } else {
                class115.field1802 /= 2;
            }
            class136.field2125 += class115.field1802 / 2;
        }
        class150.method1110((byte) 115);
    }

    @OriginalMember(owner = "client!ph", name = "<init>", descriptor = "()V", line = 218)
    public class79() {
        super(1, true);
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(II)[I", line = 230)
    public final int[] method95(int arg0, int arg1) {
        if (arg0 > -52) {
            return (int[]) null;
        }
        field1108++;
        int[] var3 = this.field2652.method1481(arg1, (byte) -50);
        if (this.field2652.field3287) {
            int[][] var4 = this.method1285(0, arg1, 27847);
            int[] var5 = var4[1];
            int[] var6 = var4[2];
            int[] var7 = var4[0];
            for (int var8 = 0; var8 < class287.field4415; var8++) {
                var3[var8] = (var7[var8] + var6[var8] + var5[var8]) / 3;
            }
        }
        return var3;
    }
}
