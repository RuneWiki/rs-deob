import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!is")
public class class39 extends class333 {

    @OriginalMember(owner = "client!is", name = "P", descriptor = "Lhc;")
    public static class368 field517 = new class368(" has logged out.", " loggt sich aus.", " s'est déconnecté.", " saiu do jogo.");

    @OriginalMember(owner = "client!is", name = "R", descriptor = "Lka;")
    public static class408 field519 = new class408(50);

    @OriginalMember(owner = "client!is", name = "S", descriptor = "Ljm;")
    public static class162 field520 = new class162();

    @OriginalMember(owner = "client!is", name = "J", descriptor = "I")
    public static int field511;

    @OriginalMember(owner = "client!is", name = "K", descriptor = "I")
    public static int field512;

    @OriginalMember(owner = "client!is", name = "M", descriptor = "I")
    public static int field514;

    @OriginalMember(owner = "client!is", name = "N", descriptor = "I")
    public static int field515;

    @OriginalMember(owner = "client!is", name = "O", descriptor = "I")
    public static int field516;

    @OriginalMember(owner = "client!is", name = "Q", descriptor = "I")
    public static int field518;

    @OriginalMember(owner = "client!is", name = "L", descriptor = "Ldh;")
    public static class192 field513;

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(IIB)I", line = 3)
    public static final int method343(int arg0, int arg1, byte arg2) {
        int var3 = 122 % ((arg2 - 8) / 60);
        field511++;
        int var4 = class367.method2309(arg1 - 1, arg0 - 1, 1376312589) + class367.method2309(arg1 - 1, arg0 + 1, 1376312589) + class367.method2309(arg1 + 1, arg0 + -1, 1376312589) + class367.method2309(arg1 + 1, arg0 + 1, 1376312589);
        int var5 = class367.method2309(arg1, arg0 - 1, 1376312589) + class367.method2309(arg1, arg0 + 1, 1376312589) - (-class367.method2309(arg1 + -1, arg0, 1376312589) - class367.method2309(arg1 - -1, arg0, 1376312589));
        int var6 = class367.method2309(arg1, arg0, 1376312589);
        return var4 / 16 - (-(var5 / 8) - var6 / 4);
    }

    @OriginalMember(owner = "client!is", name = "c", descriptor = "(I)V", line = 21)
    public static void method344(int arg0) {
        if (arg0 != 9222) {
            field520 = null;
        }
        field513 = null;
        field519 = null;
        field520 = null;
        field517 = null;
    }

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(BI)V", line = 38)
    public static final void method345(byte arg0, int arg1) {
        field512++;
        int var2 = class246.field3467 - class18.field240;
        if (var2 >= 100) {
            class26.field337 = 1;
            return;
        }
        int var3 = (int) class356.field4785;
        if (var3 < (class343.field4624 >> 8)) {
            var3 = class343.field4624 >> 8;
        }
        if (class1.field3[4] && var3 < class419.field5822[4] + 128) {
            var3 = class419.field5822[4] + 128;
        }
        int var4 = (int) class332.field4483 + class312.field4239 & 0x3FFF;
        class341.method2083(var3, var4, ((var3 >> 3) * 3) + 600, 0, class431.field6044, class436.field6153, class50.method408(class343.field4623, class359.field4970.field40, class359.field4970.field44, 16) - 50, arg1);
        if (arg0 < 24) {
            return;
        }
        float var5 = 1.0F - ((float) ((100 - var2) * (100 - var2) * (100 - var2)) / 1000000.0F);
        class375.field5213 = (int) ((float) (class375.field5213 - class366.field5055) * var5 + (float) class366.field5055);
        class104.field1433 = (int) ((float) (class104.field1433 - class444.field6225) * var5 + (float) class444.field6225);
        class389.field5410 = (int) ((float) (class389.field5410 - class116.field1765) * var5 + (float) class116.field1765);
        class63.field874 = (int) ((float) (class63.field874 - class305.field4154) * var5 + (float) class305.field4154);
        int var6 = class86.field1208 - class204.field2904;
        if (var6 > 8192) {
            var6 -= 16384;
        } else if (var6 < -8192) {
            var6 += 16384;
        }
        class86.field1208 = (int) ((float) var6 * var5 + (float) class204.field2904);
        class86.field1208 &= 0x3FFF;
    }

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(III)V", line = 86)
    public static final void method346(int arg0, int arg1, int arg2) {
        field518++;
        class279 var3 = class32.method300(-74, arg2);
        int var4 = var3.field3796;
        int var5 = var3.field3800;
        int var6 = var3.field3797;
        int var7 = class194.field2802[var6 - var5];
        if (arg1 != -4022) {
            field520 = null;
        }
        if (arg0 < 0 || arg0 > var7) {
            arg0 = 0;
        }
        int var8 = var7 << var5;
        class404.method2494(var4, arg0 << var5 & var8 | ~var8 & class66.field924[var4], 0);
    }

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(B)V", line = 115)
    public static final void method347(byte arg0) {
        field515++;
        int var1 = 0;
        if (class428.field5958) {
            int var2 = var1 | 0x1;
            int var3 = var2 | 0x10;
            int var4 = var3 | 0x20;
            int var5 = var4 | 0x2;
            var1 = var5 | 0x4;
        }
        class447.method2779(0, var1);
        class393.method2439(23896, var1);
        class383.method2368(var1, 117);
        class228.method1488(var1, -30455);
        class78.method638(var1, (byte) 119);
        int var6 = 61 / ((arg0 + 8) / 62);
        class284.method1775(true, var1);
        class372.method2330(64, var1);
        class67.method540(var1, (byte) -107);
        class359.method2220(var1, (byte) 94);
        if (class98.field1383 == 10) {
            class191.method1321(28, 40);
        } else if (class98.field1383 == 30) {
            class191.method1321(25, 40);
            return;
        }
    }

    @OriginalMember(owner = "client!is", name = "d", descriptor = "(I)V", line = 153)
    public static final void method348(int arg0) {
        field516++;
        class408 var1 = class398.field5514;
        synchronized (class398.field5514) {
            class398.field5514.method2522((byte) 62);
            if (arg0 != 16383) {
                field513 = null;
            }
        }
        class408 var2 = class354.field4769;
        synchronized (class354.field4769) {
            class354.field4769.method2522((byte) 88);
        }
    }

    @OriginalMember(owner = "client!is", name = "b", descriptor = "(B)V", line = 174)
    public static final void method349(byte arg0) {
        int var1 = 89 % ((arg0 - 59) / 48);
        field514++;
        class408 var2 = class269.field3683;
        synchronized (class269.field3683) {
            class269.field3683.method2530((byte) -78);
        }
    }
}
