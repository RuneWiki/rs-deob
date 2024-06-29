import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ab")
public class class3 {

    @OriginalMember(owner = "client!ab", name = "e", descriptor = "I")
    public static int field40 = (int) (Math.random() * 33.0D) - 16;

    @OriginalMember(owner = "client!ab", name = "i", descriptor = "[I")
    public static int[] field44 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @OriginalMember(owner = "client!ab", name = "c", descriptor = "I")
    public static int field38;

    @OriginalMember(owner = "client!ab", name = "d", descriptor = "I")
    public static int field39;

    @OriginalMember(owner = "client!ab", name = "f", descriptor = "I")
    public static int field41;

    @OriginalMember(owner = "client!ab", name = "g", descriptor = "I")
    public static int field42;

    @OriginalMember(owner = "client!ab", name = "h", descriptor = "I")
    public static int field43;

    @OriginalMember(owner = "client!ab", name = "j", descriptor = "I")
    public static int field45;

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "[S")
    public static short[] field37;

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "[[S")
    public static short[][] field36;

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(Leh;BLjava/awt/Component;Leh;)V")
    public static final void method17(class52 arg0, byte arg1, Component arg2, class52 arg3) {
        field45++;
        if (class81.field1575) {
            return;
        }
        class145.method929();
        byte[] var4 = arg3.method342(0, class116.field2184, (byte) -49);
        class198.field3699 = new class126(var4, arg2);
        class108.field2013 = class198.field3699.method806();
        class209.field3925 = class149.method952(class78.field1518, arg0, -11);
        class81.field1574 = class149.method952(class234.field4324, arg0, -11);
        if (arg1 != 113) {
            field40 = 6;
        }
        class218.field4039 = class149.method952(class139.field2564, arg0, -11);
        class163.field2945 = class161.method1038(class80.field1537, (byte) 5, arg0);
        class134.field2486 = class236.method1533((byte) -44, class212.field3954, arg0);
        class59.field1275 = new int[256];
        for (int var5 = 0; var5 < 64; var5++) {
            class59.field1275[var5] = var5 * 262144;
        }
        for (int var6 = 0; var6 < 64; var6++) {
            class59.field1275[var6 + 64] = var6 * 1024 + 16711680;
        }
        for (int var7 = 0; var7 < 64; var7++) {
            class59.field1275[var7 + 128] = var7 * 4 + 16776960;
        }
        for (int var8 = 0; var8 < 64; var8++) {
            class59.field1275[var8 + 192] = 16777215;
        }
        class123.field2278 = new int[256];
        for (int var9 = 0; var9 < 64; var9++) {
            class123.field2278[var9] = var9 * 1024;
        }
        for (int var10 = 0; var10 < 64; var10++) {
            class123.field2278[var10 + 64] = var10 * 4 + 65280;
        }
        for (int var11 = 0; var11 < 64; var11++) {
            class123.field2278[var11 + 128] = var11 * 262144 + 65535;
        }
        for (int var12 = 0; var12 < 64; var12++) {
            class123.field2278[var12 + 192] = 16777215;
        }
        class105.field1979 = new int[256];
        for (int var13 = 0; var13 < 64; var13++) {
            class105.field1979[var13] = var13 * 4;
        }
        for (int var14 = 0; var14 < 64; var14++) {
            class105.field1979[var14 + 64] = var14 * 262144 + 255;
        }
        for (int var15 = 0; var15 < 64; var15++) {
            class105.field1979[var15 + 128] = var15 * 1024 + 16711935;
        }
        for (int var16 = 0; var16 < 64; var16++) {
            class105.field1979[var16 + 192] = 16777215;
        }
        class129.field2355 = new int[256];
        class50.field1071 = new int[32768];
        class29.field636 = new int[32768];
        class216.method1414(null, (byte) -101);
        class223.field4121 = new int[32768];
        if (class130.field2364 == 0) {
            class189.field3523 = true;
        } else {
            class189.field3523 = false;
        }
        class232.field4278 = class232.field4290;
        class235.field4329 = 0;
        class138.field2541 = false;
        class190.field3530 = new int[32768];
        class232.field4286 = class232.field4290;
        if (class189.field3523) {
            class141.method898(2, (byte) -119);
        } else {
            class191.method1284(2, class23.field561, 255, false, 0, 0, class179.field3251);
        }
        class52.method345(false, 68);
        class81.field1575 = true;
        class36.method232((byte) 89);
        class214.field3976 = new class126(128, 254);
        class30.field666 = new class126(128, 254);
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(III)V")
    public static final void method18(int arg0, int arg1, int arg2) {
        class197 var3 = class229.field4232[arg0][arg1][arg2];
        if (var3 != null) {
            var3.field3678 = null;
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(IIZLeh;II)V")
    public static final void method19(int arg0, int arg1, boolean arg2, class52 arg3, int arg4, int arg5) {
        class237.field4361 = arg5;
        class157.field2848 = 10000;
        class178.field3235 = arg1;
        if (arg0 != 4095) {
            method20(116, 96, -92);
        }
        field43++;
        class159.field2894 = arg3;
        class233.field4303 = arg2;
        class19.field494 = arg4;
        class107.field2000 = 1;
    }

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "(III)I")
    public static final int method20(int arg0, int arg1, int arg2) {
        field38++;
        if (arg2 != -14053) {
            return 0;
        } else if (arg0 == -1) {
            return 12345678;
        } else {
            int var3 = (arg0 & 0x7F) * arg1 >> 7;
            if (var3 < 2) {
                var3 = 2;
            } else if (var3 > 126) {
                var3 = 126;
            }
            return (arg0 & 0xFF80) + var3;
        }
    }

    @OriginalMember(owner = "client!ab", name = "c", descriptor = "(III)I")
    public static final int method21(int arg0, int arg1, int arg2) {
        field42++;
        int var3 = 1;
        while (arg2 > 1) {
            if ((arg2 & 0x1) != 0) {
                var3 = arg1 * var3;
            }
            arg1 *= arg1;
            arg2 >>= 0x1;
        }
        if (arg0 != -24985) {
            method19(30, -5, false, null, -67, 112);
        }
        if (arg2 == 1) {
            return arg1 * var3;
        } else {
            return var3;
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(I)V")
    public static final void method22(int arg0) {
        int var1 = 31 % ((-arg0 - 35) / 45);
        field41++;
        Object var2 = class191.field3565;
        synchronized (class191.field3565) {
            if (class120.field2242 == 0) {
                class25.field588.method8(0, new class209(), 5);
            }
            class120.field2242 = 600;
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(B)V")
    public static void method23(byte arg0) {
        if (arg0 >= -40) {
            field36 = null;
        }
        field36 = null;
        field44 = null;
        field37 = null;
    }
}
