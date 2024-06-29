import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!da")
public class class31 {

    @OriginalMember(owner = "client!da", name = "b", descriptor = "Ltg;")
    public static class184 field533 = class135.method812("Neuer Benutzer", 3);

    @OriginalMember(owner = "client!da", name = "a", descriptor = "I")
    public static int field532 = 0;

    @OriginalMember(owner = "client!da", name = "g", descriptor = "Ltg;")
    public static class184 field538 = class135.method812("::autoshadow on", 3);

    @OriginalMember(owner = "client!da", name = "c", descriptor = "Ltg;")
    public static class184 field534 = class135.method812("<col=ffffff>", 3);

    @OriginalMember(owner = "client!da", name = "f", descriptor = "I")
    public static int field537 = 0;

    @OriginalMember(owner = "client!da", name = "e", descriptor = "I")
    public static int field536;

    @OriginalMember(owner = "client!da", name = "h", descriptor = "I")
    public static int field539;

    @OriginalMember(owner = "client!da", name = "d", descriptor = "Lrh;")
    public static class167 field535;

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(B)V")
    public static void method195(byte arg0) {
        field534 = null;
        field535 = null;
        field538 = null;
        field533 = null;
        if (arg0 != -99) {
            method195((byte) -77);
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(BII)I")
    public static final int method196(byte arg0, int arg1, int arg2) {
        field539++;
        int var3 = -58 % ((-arg0 - 55) / 50);
        int var4 = class73.method427((byte) 97, arg2 + 45365, arg1 + 91923, 4) + (class73.method427((byte) 118, arg2 + 10294, arg1 - -37821, 2) - 128 >> 1) + (class73.method427((byte) 82, arg2, arg1, 1) + -128 >> 2) - 128;
        int var5 = (int) ((double) var4 * 0.3D) + 35;
        if (var5 < 10) {
            var5 = 10;
        } else if (var5 > 60) {
            var5 = 60;
        }
        return var5;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Lvb;Ljava/awt/Component;Lvb;B)V")
    public static final void method197(class197 arg0, Component arg1, class197 arg2, byte arg3) {
        field536++;
        if (class113.field2038) {
            return;
        }
        class4.method17();
        byte[] var4 = arg2.method1249((byte) -128, 0, class69.field1321);
        class65.field1238 = new class137(var4, arg1);
        class158.field2829 = class65.field1238.method836();
        class9.field174 = class46.method265(class14.field261, arg0, -34);
        class43.field820 = class46.method265(class120.field2158, arg0, -50);
        class133.field2418 = class46.method265(class19.field359, arg0, -42);
        class5.field86 = class15.method94(class34.field594, arg0, 0);
        class185.field3576 = class15.method94(class138.field2501, arg0, 0);
        if (arg3 <= 22) {
            field532 = -105;
        }
        class40.field750 = new int[256];
        for (int var5 = 0; var5 < 64; var5++) {
            class40.field750[var5] = var5 * 262144;
        }
        for (int var6 = 0; var6 < 64; var6++) {
            class40.field750[var6 + 64] = var6 * 1024 + 16711680;
        }
        for (int var7 = 0; var7 < 64; var7++) {
            class40.field750[var7 + 128] = var7 * 4 + 16776960;
        }
        for (int var8 = 0; var8 < 64; var8++) {
            class40.field750[var8 + 192] = 16777215;
        }
        class131.field2385 = new int[256];
        for (int var9 = 0; var9 < 64; var9++) {
            class131.field2385[var9] = var9 * 1024;
        }
        for (int var10 = 0; var10 < 64; var10++) {
            class131.field2385[var10 + 64] = var10 * 4 + 65280;
        }
        for (int var11 = 0; var11 < 64; var11++) {
            class131.field2385[var11 + 128] = var11 * 262144 + 65535;
        }
        for (int var12 = 0; var12 < 64; var12++) {
            class131.field2385[var12 + 192] = 16777215;
        }
        class188.field3628 = new int[256];
        for (int var13 = 0; var13 < 64; var13++) {
            class188.field3628[var13] = var13 * 4;
        }
        for (int var14 = 0; var14 < 64; var14++) {
            class188.field3628[var14 + 64] = var14 * 262144 + 255;
        }
        for (int var15 = 0; var15 < 64; var15++) {
            class188.field3628[var15 + 128] = var15 * 1024 + 16711935;
        }
        for (int var16 = 0; var16 < 64; var16++) {
            class188.field3628[var16 + 192] = 16777215;
        }
        class81.field1449 = new int[32768];
        class6.field117 = new int[32768];
        class172.field3259 = new int[256];
        class176.method1082(89, null);
        class158.field2824 = new int[32768];
        class32.field563 = new int[32768];
        if (class136.field2480 == 0) {
            class68.field1310 = true;
        } else {
            class68.field1310 = false;
        }
        class188.field3651 = class188.field3649;
        class49.field903 = false;
        class188.field3626 = class188.field3649;
        class2.field54 = 0;
        if (class68.field1310) {
            class120.method724((byte) 125, 2);
        } else {
            class209.method1328(1, class180.field3427, 255, 2, class21.field389, false, 0);
        }
        class168.method1046(false, (byte) -52);
        class113.field2038 = true;
        class65.field1238.method824(0, 0);
        class158.field2829.method824(382, 0);
        class9.field174.method1062(382 - class9.field174.field3246 / 2, 18);
        class15.field287 = new class137(128, 254);
        class209.field4010 = new class137(128, 254);
    }
}
