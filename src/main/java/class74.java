import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gi")
public class class74 extends class178 {

    @OriginalMember(owner = "client!gi", name = "M", descriptor = "I")
    public int field1429 = -1;

    @OriginalMember(owner = "client!gi", name = "Q", descriptor = "Z")
    public boolean field1433 = true;

    @OriginalMember(owner = "client!gi", name = "V", descriptor = "I")
    public int field1438 = 0;

    @OriginalMember(owner = "client!gi", name = "T", descriptor = "I")
    public int field1436 = -1;

    @OriginalMember(owner = "client!gi", name = "P", descriptor = "[I")
    public static int[] field1432 = new int[1000];

    @OriginalMember(owner = "client!gi", name = "U", descriptor = "Z")
    public static boolean field1437 = true;

    @OriginalMember(owner = "client!gi", name = "W", descriptor = "I")
    public static int field1439 = -1;

    @OriginalMember(owner = "client!gi", name = "N", descriptor = "I")
    public static int field1430;

    @OriginalMember(owner = "client!gi", name = "O", descriptor = "I")
    public static int field1431;

    @OriginalMember(owner = "client!gi", name = "R", descriptor = "I")
    public static int field1434;

    @OriginalMember(owner = "client!gi", name = "S", descriptor = "I")
    public static int field1435;

    @OriginalMember(owner = "client!gi", name = "X", descriptor = "I")
    public static int field1440;

    @OriginalMember(owner = "client!gi", name = "L", descriptor = "Lpd;")
    public static class162 field1428;

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(III)I")
    public static final int method481(int arg0, int arg1, int arg2) {
        field1435++;
        int var3 = arg1;
        while (arg2 > 0) {
            arg2--;
            var3 = var3 << 1 | arg0 & 0x1;
            arg0 >>>= 0x1;
        }
        return var3;
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(Lwa;BII)V")
    private final void method482(class229 arg0, byte arg1, int arg2, int arg3) {
        if (arg2 == 1) {
            this.field1438 = class209.method1306(arg0.method1450(arg1 ^ 0xFFFFA562), (byte) 116);
        } else if (arg2 == 2) {
            this.field1436 = arg0.method1475(255);
        } else if (arg2 == 3) {
            this.field1436 = arg0.method1490((byte) 73);
            if (this.field1436 == 65535) {
                this.field1436 = -1;
            }
        } else if (arg2 == 5) {
            this.field1433 = false;
        } else if (arg2 == 7) {
            this.field1429 = class209.method1306(arg0.method1450(-23209), (byte) 116);
        } else if (arg2 == 8) {
            class85.field1602 = arg3;
        } else if (arg2 == 9) {
            arg0.method1490((byte) 73);
        }
        field1440++;
        if (arg1 != 53) {
            this.field1433 = true;
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(IBLwa;)V")
    public final void method483(int arg0, byte arg1, class229 arg2) {
        if (arg1 < 68) {
            this.method483(-123, (byte) -41, null);
        }
        field1431++;
        while (true) {
            int var4 = arg2.method1475(255);
            if (var4 == 0) {
                return;
            }
            this.method482(arg2, (byte) 53, var4, arg0);
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(Ljava/awt/Component;Lsd;Lsd;I)V")
    public static final void method484(Component arg0, class192 arg1, class192 arg2, int arg3) {
        field1434++;
        if (class33.field667) {
            return;
        }
        class221.method1381();
        byte[] var4 = arg2.method1208(0, (byte) 97, class120.field2162);
        class20.field434 = new class84(var4, arg0);
        class228.field3979 = class20.field434.method536();
        class222.field3843 = class227.method1420(arg1, -5, class83.field1583);
        class204.field3623 = class227.method1420(arg1, -5, class116.field2091);
        class116.field2086 = class227.method1420(arg1, -5, class106.field1879);
        class228.field3988 = class103.method630(class3.field75, arg1, true);
        class9.field148 = class103.method630(class91.field1665, arg1, true);
        class109.field1933 = new int[256];
        for (int var5 = 0; var5 < 64; var5++) {
            class109.field1933[var5] = var5 * 262144;
        }
        for (int var6 = 0; var6 < 64; var6++) {
            class109.field1933[var6 + 64] = var6 * 1024 + 16711680;
        }
        for (int var7 = 0; var7 < 64; var7++) {
            class109.field1933[var7 + 128] = var7 * 4 + 16776960;
        }
        for (int var8 = 0; var8 < 64; var8++) {
            class109.field1933[var8 + 192] = 16777215;
        }
        class236.field4410 = new int[256];
        for (int var9 = 0; var9 < 64; var9++) {
            class236.field4410[var9] = var9 * 1024;
        }
        for (int var10 = 0; var10 < 64; var10++) {
            class236.field4410[var10 + 64] = var10 * 4 + 65280;
        }
        for (int var11 = 0; var11 < 64; var11++) {
            class236.field4410[var11 + 128] = var11 * 262144 + 65535;
        }
        for (int var12 = 0; var12 < 64; var12++) {
            class236.field4410[var12 + 192] = 16777215;
        }
        class163.field2946 = new int[256];
        for (int var13 = 0; var13 < 64; var13++) {
            class163.field2946[var13] = var13 * 4;
        }
        for (int var14 = 0; var14 < 64; var14++) {
            class163.field2946[var14 + 64] = var14 * 262144 + 255;
        }
        for (int var15 = 0; var15 < 64; var15++) {
            class163.field2946[var15 + 128] = var15 * 1024 + 16711935;
        }
        for (int var16 = 0; var16 < 64; var16++) {
            class163.field2946[var16 + 192] = 16777215;
        }
        class189.field3346 = new int[32768];
        class140.field2551 = new int[256];
        class208.field3665 = new int[32768];
        class147.method934(null, arg3 ^ 0x23D9);
        class192.field3419 = new int[32768];
        class233.field4295 = false;
        class67.field1323 = new int[32768];
        class161.field2906 = 0;
        class160.field2899 = class160.field2876;
        class160.field2871 = class160.field2876;
        if (class156.field2825 == 0) {
            class13.field309 = true;
        } else {
            class13.field309 = false;
        }
        if (class13.field309) {
            class59.method396(2, 1);
        } else {
            class20.method172(0, (byte) -69, 2, class156.field2819, false, class16.field363, 255);
        }
        class116.method703((byte) -83, false);
        class33.field667 = true;
        class139.method898(arg3 ^ 0xFFFFF1AF);
        class212.field3732 = new class84(arg3, 254);
        class11.field203 = new class84(128, 254);
    }

    @OriginalMember(owner = "client!gi", name = "d", descriptor = "(B)V")
    public static void method485(byte arg0) {
        field1432 = null;
        if (arg0 == 80) {
            field1428 = null;
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(Lwd;IZII)V")
    public static final void method486(class232 arg0, int arg1, boolean arg2, int arg3, int arg4) {
        if (client.field693 < 3) {
            class8.field131.method535(arg4, arg3, arg0.field4215, arg0.field4216, class8.field131.field1586 / 2, class8.field131.field1591 / 2, class94.field1761, 256, arg0.field4145, arg0.field4218);
        } else {
            class221.method1377(arg4, arg3, 0, arg0.field4145, arg0.field4218);
        }
        if (arg2) {
            method486(null, 50, false, 7, -92);
        }
        field1430++;
        class63.field1234[arg1] = true;
    }
}
