import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gs")
public class class43 {

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "I")
    public int field477 = 128;

    @OriginalMember(owner = "client!gs", name = "h", descriptor = "I")
    public int field484 = 128;

    @OriginalMember(owner = "client!gs", name = "k", descriptor = "I")
    public int field487;

    @OriginalMember(owner = "client!gs", name = "d", descriptor = "I")
    public int field480;

    @OriginalMember(owner = "client!gs", name = "b", descriptor = "I")
    public int field478;

    @OriginalMember(owner = "client!gs", name = "g", descriptor = "I")
    public int field483;

    @OriginalMember(owner = "client!gs", name = "f", descriptor = "[I")
    public static int[] field482 = new int[256];

    @OriginalMember(owner = "client!gs", name = "m", descriptor = "Ldh;")
    public static class320 field489;

    @OriginalMember(owner = "client!gs", name = "c", descriptor = "I")
    public static int field479;

    @OriginalMember(owner = "client!gs", name = "e", descriptor = "I")
    public static int field481;

    @OriginalMember(owner = "client!gs", name = "i", descriptor = "I")
    public static int field485;

    @OriginalMember(owner = "client!gs", name = "j", descriptor = "I")
    public static int field486;

    @OriginalMember(owner = "client!gs", name = "l", descriptor = "I")
    public static int field488;

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            int var1 = var0;
            for (int var2 = 0; var2 < 8; var2++) {
                if ((var1 & 0x1) == 1) {
                    var1 = var1 >>> 1 ^ 0xEDB88320;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field482[var0] = var1;
        }
        field489 = new class320(84, 6);
    }

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(B)V", line = 4)
    public static void method250(byte arg0) {
        field482 = null;
        int var1 = 51 / ((arg0 + 54) / 47);
        field489 = null;
    }

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(I)V", line = 16)
    public static final void method251(int arg0) {
        if (class275.field3370 != null) {
            if (class397.field5443) {
                class445.method2760(-114);
            }
            class36.field387.method3967((byte) -127);
            class655.method3719();
            class8.method33(-31239);
            class300.method1773(-9);
            class119.method772(0);
            class403.method2454(-18958);
            if (class12.field103 != null) {
                class12.field103.method2637((byte) 96);
            }
            class562.method3276(94);
            class38.method185(true);
            class451.method2778((byte) -38);
            class223.method1295(110);
            class40.method245(8, false);
            for (int var1 = 0; var1 < 2048; var1++) {
                class183 var5 = class75.field792[var1];
                if (var5 != null) {
                    for (int var6 = 0; var6 < var5.field7191.length; var6++) {
                        var5.field7191[var6] = null;
                    }
                }
            }
            for (int var2 = 0; var2 < class529.field7533; var2++) {
                class197 var3 = class452.field6509[var2].field1661;
                if (var3 != null) {
                    for (int var4 = 0; var4 < var3.field7191.length; var4++) {
                        var3.field7191[var4] = null;
                    }
                }
            }
            class667.field9490 = null;
            class672.field9542 = null;
            class275.field3370.method336(-73);
            class275.field3370 = null;
        }
        field481++;
        if (arg0 < 0) {
            method250((byte) 101);
        }
    }

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(Lgs;I)V", line = 97)
    public final void method252(class43 arg0, int arg1) {
        this.field477 = arg0.field477;
        this.field484 = arg0.field484;
        this.field480 = arg0.field480;
        if (arg1 == 6) {
            this.field487 = arg0.field487;
            this.field478 = arg0.field478;
            field488++;
            this.field483 = arg0.field483;
        }
    }

    @OriginalMember(owner = "client!gs", name = "b", descriptor = "(B)Lgs;", line = 113)
    public final class43 method253(byte arg0) {
        if (arg0 != -126) {
            this.field478 = 70;
        }
        field479++;
        return new class43(this.field487, this.field484, this.field477, this.field483, this.field478, this.field480);
    }

    @OriginalMember(owner = "client!gs", name = "b", descriptor = "(I)V", line = 130)
    public static final void method254(int arg0) {
        class522.field7427++;
        field486++;
        int var1 = 47 % ((46 - arg0) / 57);
        class249 var2 = class289.method1715(class649.field9276, 53, class41.field470);
        var2.field3016.method1446(class442.field6417, true);
        class510.method3017(var2, 71);
    }

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(IIIIIILjava/lang/String;I)V", line = 145)
    public static final void method255(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, String arg6, int arg7) {
        field485++;
        class68 var8 = new class68();
        var8.field698 = arg3;
        var8.field690 = arg4;
        var8.field697 = arg1;
        var8.field689 = arg6;
        var8.field700 = class392.field5398 + arg0;
        if (arg7 != 84) {
            method255(-63, 38, 87, 28, -123, 87, null, 80);
        }
        var8.field696 = arg2;
        var8.field688 = arg5;
        class262.field3249.method2792((byte) -13, var8);
    }

    @OriginalMember(owner = "client!gs", name = "<init>", descriptor = "(I)V", line = 177)
    public class43(int arg0) {
        this.field487 = arg0;
    }

    @OriginalMember(owner = "client!gs", name = "<init>", descriptor = "(IIIIII)V", line = 184)
    private class43(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field487 = arg0;
        this.field480 = arg5;
        this.field477 = arg2;
        this.field478 = arg4;
        this.field483 = arg3;
        this.field484 = arg1;
    }
}
