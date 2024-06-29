import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cb")
public class class81 {

    @OriginalMember(owner = "client!cb", name = "d", descriptor = "Z")
    public static boolean field943 = false;

    @OriginalMember(owner = "client!cb", name = "e", descriptor = "Llg;")
    public static class32 field944 = new class32(11, 0, 1, 2);

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "I")
    public static int field940;

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "I")
    public static int field941;

    @OriginalMember(owner = "client!cb", name = "c", descriptor = "I")
    public static int field942;

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(ILag;)V", line = 3)
    public static final void method431(int arg0, class469 arg1) {
        if (arg0 != -4242) {
            return;
        }
        field942++;
        if (class3.field9 == null) {
            class130 var2 = new class130();
            byte[] var3 = var2.method760(128, 0, 16, 128);
            class3.field9 = class440.method2477(var3, (byte) -102, false);
        }
        if (class242.field3190 == null) {
            class629 var4 = new class629();
            byte[] var5 = var4.method3485(128, 128, 16, true);
            class242.field3190 = class440.method2477(var5, (byte) -70, false);
        }
        class630 var6 = arg1.field6394;
        if (var6.method3486(arg0 + 4161) && class41.field520 == null) {
            byte[] var7 = class379.method2167(128, 0.6F, (byte) 107, 4.0F, new class674(419684), 128, 8, 0.5F, 16.0F, 4.0F, 16);
            class41.field520 = class440.method2477(var7, (byte) -110, false);
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(B)V", line = 51)
    public static void method432(byte arg0) {
        field944 = null;
        int var1 = 66 / ((-arg0 - 42) / 63);
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(Ljd;B)V", line = 67)
    public static final void method433(class537 arg0, byte arg1) {
        field940++;
        arg0.method3011(-1);
        if (arg1 != -97) {
            field943 = true;
        }
        int var2 = class423.field5702;
        class573 var3 = class408.field5369 = class513.field7145[var2] = new class573();
        var3.field3010 = var2;
        int var4 = arg0.method3008(false, 30);
        byte var5 = (byte) (var4 >> 28);
        int var6 = var4 >> 14 & 0x3FFF;
        int var7 = var4 & 0x3FFF;
        var3.field3088[0] = var6 - class125.field1745;
        var3.field398 = (var3.field3088[0] << 9) + (var3.method1435((byte) 108) << 8);
        var3.field3086[0] = var7 - class4.field23;
        var3.field397 = (var3.field3086[0] << 9) + (var3.method1435((byte) 78) << 8);
        class298.field3942 = var3.field385 = var3.field386 = var5;
        if (class8.method44(var3.field3086[0], var3.field3088[0], arg1 ^ 0xFFFFC56D)) {
            var3.field386++;
        }
        if (class540.field7405[var2] != null) {
            var3.method3172(-34, class540.field7405[var2]);
        }
        class426.field5750 = 0;
        class586.field8104[class426.field5750++] = var2;
        class376.field4975[var2] = 0;
        class293.field3900 = 0;
        for (int var8 = 1; var8 < 2048; var8++) {
            if (var2 != var8) {
                int var9 = arg0.method3008(false, 18);
                int var10 = var9 >> 16;
                int var11 = var9 >> 8 & 0xFF;
                int var12 = var9 & 0xFF;
                class228 var13 = class11.field145[var8] = new class228();
                var13.field2961 = false;
                var13.field2957 = (var11 << 14) + ((var10 << 28) + var12);
                var13.field2954 = -1;
                var13.field2958 = 0;
                class306.field4084[class293.field3900++] = var8;
                class376.field4975[var8] = 0;
            }
        }
        arg0.method3016(80);
    }
}
