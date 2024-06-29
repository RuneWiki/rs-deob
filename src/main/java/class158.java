import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ec")
public class class158 extends RuntimeException {

    @OriginalMember(owner = "client!ec", name = "c", descriptor = "Ljava/lang/Throwable;")
    public Throwable field2779;

    @OriginalMember(owner = "client!ec", name = "l", descriptor = "Ljava/lang/String;")
    public String field2788;

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "Z")
    public static boolean field2778 = false;

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "Lbd;")
    private static class162 field2777 = class17.method142(0, "Prepared sound engine");

    @OriginalMember(owner = "client!ec", name = "g", descriptor = "Lbd;")
    public static class162 field2783 = field2777;

    @OriginalMember(owner = "client!ec", name = "e", descriptor = "I")
    public static int field2781;

    @OriginalMember(owner = "client!ec", name = "i", descriptor = "I")
    public static int field2785;

    @OriginalMember(owner = "client!ec", name = "k", descriptor = "I")
    public static int field2787;

    @OriginalMember(owner = "client!ec", name = "f", descriptor = "Lda;")
    public static class143 field2782;

    @OriginalMember(owner = "client!ec", name = "j", descriptor = "Lda;")
    public static class143 field2786;

    @OriginalMember(owner = "client!ec", name = "h", descriptor = "Lwf;")
    public static class215 field2784;

    @OriginalMember(owner = "client!ec", name = "d", descriptor = "[[[I")
    public static int[][][] field2780;

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(I)V", line = 33)
    public static final void method1222(int arg0) {
        int var1 = 70 / ((arg0 + 58) / 38);
        class48.field764.method1931(122);
        class34.field548 = null;
        class9.field105 = 1;
        field2785++;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(BLbd;)V", line = 47)
    public static final void method1223(byte arg0, class162 arg1) {
        field2781++;
        if (class83.field1438 >= 2) {
            if (arg1.method1282(class146.field2639, 106)) {
                class102.method838((byte) -64);
                for (int var2 = 0; var2 < 10; var2++) {
                    System.gc();
                }
                Runtime var3 = Runtime.getRuntime();
                int var4 = (int) ((var3.totalMemory() - var3.freeMemory()) / 1024L);
                class82.method633(0, class135.method1062(new class162[] { class205.field3460, class156.method1212(10, var4), class231.field3850 }, true), (class162) null, -92);
            }
            if (class117.field2159 && arg1.method1282(class123.field2235, arg0 ^ 0x30)) {
                System.out.println("oncard_geometry:" + class41.field660);
                System.out.println("oncard_2d:" + class41.field661);
                System.out.println("oncard_texture:" + class41.field658);
            }
            if (arg1.method1282(class13.field214, arg0 ^ 0x65)) {
                class141.method1099(arg0 + 35);
            }
            if (arg1.method1282(class133.field2376, 91)) {
                class55.field863.method1707(arg0 ^ 0xFFFF05);
            }
            if (arg1.method1282(class165.field2926, 64)) {
                class55.field863.method1698((byte) -109);
            }
            if (arg1.method1282(class57.field895, 45)) {
                client.field1903.method233(-26794);
                class116.field2054.method1831(-60);
                class55.field863.method1699(-103);
            }
            if (arg1.method1282(class278.field4671, 125)) {
                class180.field3089 = true;
            }
            if (arg1.method1282(class293.field4932, 86)) {
                class122.method984(25, 2047);
            }
            if (arg1.method1282(class214.field3584, arg0 ^ 0x2E)) {
                class203.field3440 = true;
            }
            if (arg1.method1282(class257.field4259, 89)) {
                class203.field3440 = false;
            }
            if (arg1.method1282(class315.field5318, 90)) {
                class266.method1822((byte) -35, -1, -1, 0, false);
            }
            if (arg1.method1282(class39.field637, 111)) {
                class266.method1822((byte) -35, -1, -1, 1, false);
            }
            if (arg1.method1282(class60.field928, 38)) {
                class266.method1822((byte) -35, -1, -1, 2, false);
            }
            if (arg1.method1282(class22.field358, 92)) {
                class266.method1822((byte) -35, 1024, 768, 3, false);
            }
            if (arg1.method1282(class60.field931, arg0 + 121)) {
                for (int var5 = 0; var5 < 4; var5++) {
                    for (int var6 = 1; var6 < 103; var6++) {
                        for (int var7 = 1; var7 < 103; var7++) {
                            class267.field4473[var5].field3061[var6][var7] = 0;
                        }
                    }
                }
            }
            if (arg1.method1269(class157.field2769, 16360) && class8.field88 != 0) {
                class306.method2083(arg1.method1254((byte) 95, 6).method1238(-100), arg0 ^ 0x30);
            }
            if (arg1.method1282(class10.field124, 83) && class8.field88 == 2) {
                throw new RuntimeException();
            }
            if (arg1.method1269(class282.field4796, 16360)) {
                class240.field3982 = arg1.method1254((byte) 95, 12).method1278(-1).method1238(-94);
                class82.method633(0, class135.method1062(new class162[] { class32.field537, class156.method1212(arg0 + 5, class240.field3982) }, true), (class162) null, 98);
            }
            if (arg1.method1282(class305.field5145, 52)) {
                class255.field4223 = true;
            }
        }
        class187.field3229.method338(115, (byte) 8);
        class187.field3229.method753(arg1.method1249((byte) -118) - 1, true);
        class80.field1390++;
        class187.field3229.method727(arg1.method1254((byte) 95, 2), -253);
        if (arg0 != 5) {
            field2780 = (int[][][]) ((int[][][]) null);
        }
    }

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "(I)V", line = 196)
    public static void method1224(int arg0) {
        field2784 = null;
        field2786 = null;
        field2780 = (int[][][]) null;
        field2782 = null;
        field2777 = null;
        if (arg0 >= -33) {
            field2783 = (class162) null;
        }
        field2783 = null;
    }

    @OriginalMember(owner = "client!ec", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V", line = 211)
    public class158(Throwable arg0, String arg1) {
        this.field2779 = arg0;
        this.field2788 = arg1;
    }
}
