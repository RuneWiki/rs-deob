import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gk")
public class class277 extends class428 {

    @OriginalMember(owner = "client!gk", name = "f", descriptor = "I")
    public static int field4411 = 0;

    @OriginalMember(owner = "client!gk", name = "k", descriptor = "Z")
    public static boolean field4416 = false;

    @OriginalMember(owner = "client!gk", name = "m", descriptor = "Ljava/lang/String;")
    public static String field4418 = "Walk here";

    @OriginalMember(owner = "client!gk", name = "o", descriptor = "Z")
    public static boolean field4420 = false;

    @OriginalMember(owner = "client!gk", name = "l", descriptor = "J")
    public static volatile long field4417 = 0L;

    @OriginalMember(owner = "client!gk", name = "g", descriptor = "I")
    public static int field4412 = 2;

    @OriginalMember(owner = "client!gk", name = "h", descriptor = "I")
    public static int field4413;

    @OriginalMember(owner = "client!gk", name = "j", descriptor = "I")
    public static int field4415;

    @OriginalMember(owner = "client!gk", name = "n", descriptor = "I")
    public static int field4419;

    @OriginalMember(owner = "client!gk", name = "p", descriptor = "I")
    public static int field4421;

    @OriginalMember(owner = "client!gk", name = "q", descriptor = "I")
    public static int field4422;

    @OriginalMember(owner = "client!gk", name = "i", descriptor = "[[I")
    public static int[][] field4414;

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(ILmo;)V", line = 7)
    public static final void method1863(int arg0, class447 arg1) {
        field4421++;
        class82.field1028 = arg1;
        class263.field4240 = class82.field1028.method2758(15, 14535);
        int var2 = 13 / ((arg0 - 31) / 48);
    }

    @OriginalMember(owner = "client!gk", name = "b", descriptor = "(B)V", line = 29)
    public static final void method1864(byte arg0) {
        if (arg0 != 23) {
            return;
        }
        field4422++;
        if (class341.field5265 < 0) {
            return;
        }
        long var1 = class46.method297(arg0 ^ 0x69F7);
        class341.field5265 = (int) ((long) class341.field5265 - (var1 - class250.field4092));
        if (class341.field5265 <= 0) {
            class30.field380 = class230.field3836.field5670;
            class349.field5385 = class230.field3836.field5668;
            class271.field4349 = class230.field3836.field5658;
            class412.field6102 = class230.field3836.field5672;
            class341.field5265 = -1;
            class223.field3708 = class230.field3836.field5675;
            class246.field4038 = class230.field3836.field5662;
            class120.field1643 = class230.field3836.field5651;
            class433.field6396 = class230.field3836.field5653;
            class326.field5118 = class230.field3836.field5671;
            class101.field1406 = class230.field3836.field5654;
        } else {
            int var3 = (class341.field5265 << 8) / class367.field5565;
            int var4 = 255 - var3;
            float var5 = (float) var3 / 255.0F;
            class101.field1406 = ((class324.field5092 & 0xFF00FF) * var3 + (class230.field3836.field5654 & 0xFF00FF) * var4 & 0xFF00FF00) + ((class324.field5092 & 0xFF00) * var3 + (class230.field3836.field5654 & 0xFF00) * var4 & 0xFF0000) >>> 8;
            float var6 = 1.0F - var5;
            class433.field6396 = (class230.field3836.field5653 - class145.field2277) * var6 + class145.field2277;
            class223.field3708 = (class230.field3836.field5675 - class191.field3114) * var6 + class191.field3114;
            class246.field4038 = class133.field2074 * var3 + class230.field3836.field5662 * var4 >> 8;
            class120.field1643 = (class230.field3836.field5651 - class374.field5640) * var6 + class374.field5640;
            class326.field5118 = (class230.field3836.field5671 - class35.field426) * var6 + class35.field426;
            class30.field380 = (class230.field3836.field5670 - class452.field6569) * var6 + class452.field6569;
            class271.field4349 = (class230.field3836.field5658 - class62.field811) * var6 + class62.field811;
            class412.field6102 = ((class11.field150 & 0xFF00FF) * var3 + (class230.field3836.field5672 & 0xFF00FF) * var4 & 0xFF00FF00) + ((class11.field150 & 0xFF00) * var3 + (class230.field3836.field5672 & 0xFF00) * var4 & 0xFF0000) >>> 8;
            if (class142.field2253 != class230.field3836.field5668) {
                class349.field5385 = class296.field4710.method689(class142.field2253, class230.field3836.field5668, var6, class349.field5385);
            }
        }
        class250.field4092 = var1;
    }

    @OriginalMember(owner = "client!gk", name = "c", descriptor = "(B)V", line = 89)
    public static final void method1865(byte arg0) {
        field4415++;
        class11.field139.method2224(128, (byte) 0);
        class306.field4851++;
        class11.field139.method1312(class199.method1386((byte) -44), -106);
        int var1 = 19 / ((-arg0 - 3) / 37);
        class11.field139.method1283(8, class369.field5615);
        class11.field139.method1283(8, class430.field6324);
        class11.field139.method1312(class418.field6198, -84);
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(Z)V", line = 112)
    public static void method1866(boolean arg0) {
        field4418 = null;
        if (arg0) {
            method1868(-26, -79);
        }
        field4414 = null;
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(II)V", line = 128)
    public static final void method1867(int arg0, int arg1) {
        class84 var2 = null;
        for (int var3 = arg0; var3 < arg1; var3++) {
            class129 var4 = class181.field2961[var3];
            if (var4 != null) {
                for (int var5 = 0; var5 < class361.field5513; var5++) {
                    for (int var6 = 0; var6 < class156.field2449; var6++) {
                        var2 = var4.method777(var6, var5, var2);
                        if (var2 != null) {
                            int var7 = var6 << 7;
                            int var8 = var5 << 7;
                            for (int var9 = var3 - 1; var9 >= 0; var9--) {
                                class129 var10 = class181.field2961[var9];
                                if (var10 != null) {
                                    int var11 = var4.method779(var6, var5) - var10.method779(var6, var5);
                                    int var12 = var4.method779(var6 + 1, var5) - var10.method779(var6 + 1, var5);
                                    int var13 = var4.method779(var6 + 1, var5 + 1) - var10.method779(var6 + 1, var5 + 1);
                                    int var14 = var4.method779(var6, var5 + 1) - var10.method779(var6, var5 + 1);
                                    var10.method778(var2, var7, (var11 + var12 + var13 + var14) / 4, var8, 0, false);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!gk", name = "b", descriptor = "(II)I", line = 195)
    public static final int method1868(int arg0, int arg1) {
        return class381.field5763 == null ? 0 : class381.field5763[arg0][arg1] >>> 21 & 0x7F8;
    }
}
