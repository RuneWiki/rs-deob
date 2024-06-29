import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gf")
public abstract class class8 extends class96 {

    @OriginalMember(owner = "client!gf", name = "I", descriptor = "Lna;")
    public static class26 field90 = class69.method505(")3runescape)3com)4l=", (byte) -125);

    @OriginalMember(owner = "client!gf", name = "N", descriptor = "Z")
    public static boolean field95 = true;

    @OriginalMember(owner = "client!gf", name = "S", descriptor = "[I")
    public static int[] field100 = new int[] { 0, 2, 2, 2, 1, 1, 2, 2, 1, 3, 1, 1 };

    @OriginalMember(owner = "client!gf", name = "T", descriptor = "I")
    public static int field101;

    @OriginalMember(owner = "client!gf", name = "J", descriptor = "I")
    public static int field91;

    @OriginalMember(owner = "client!gf", name = "K", descriptor = "I")
    public static int field92;

    @OriginalMember(owner = "client!gf", name = "L", descriptor = "I")
    public static int field93;

    @OriginalMember(owner = "client!gf", name = "M", descriptor = "I")
    public static int field94;

    @OriginalMember(owner = "client!gf", name = "P", descriptor = "I")
    public static int field97;

    @OriginalMember(owner = "client!gf", name = "Q", descriptor = "I")
    public static int field98;

    @OriginalMember(owner = "client!gf", name = "R", descriptor = "I")
    public static int field99;

    @OriginalMember(owner = "client!gf", name = "O", descriptor = "[[[I")
    public static int[][][] field96;

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(Lve;IIB)Lmm;", line = 24)
    public static final class256 method48(class266 arg0, int arg1, int arg2, byte arg3) {
        field93++;
        if (class196.method1317(arg0, arg1, arg2, -30901)) {
            return arg3 == 39 ? class33.method265(arg3 ^ 0x54) : (class256) null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!gf", name = "d", descriptor = "(I)V", line = 41)
    public static void method49(int arg0) {
        field96 = (int[][][]) null;
        field90 = null;
        field100 = null;
        if (arg0 != 3) {
            field94 = -108;
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(Lll;I)V", line = 53)
    public static final void method50(class156 arg0, int arg1) {
        class57.field923 = 3;
        class39.method320(96, true);
        field95 = true;
        class303.field5227 = true;
        class244.field4012 = true;
        class33.field560 = 0;
        class310.field5331 = 0;
        class22.field307 = true;
        class166.field2574 = true;
        class297.field5041 = true;
        class42.field696 = 127;
        class45.field707 = true;
        class319.field5471 = true;
        class283.field4721 = 0;
        class295.field4918 = 2;
        class268.field4435 = true;
        field97++;
        class25.field360 = true;
        class92.field1499 = 255;
        class39.field643 = true;
        class2.field17 = 0;
        class231 var2 = null;
        class263.field4311 = 127;
        if (class293.field4880 >= 96) {
            class19.method127(2);
        } else {
            class19.method127(0);
        }
        class26.field387 = arg1;
        class210.field3269 = 0;
        class316.field5411 = false;
        class59.field960 = true;
        class26.field380 = false;
        class233.field3684 = false;
        class96.field1574 = 0;
        try {
            class180 var3 = arg0.method1052("runescape", 12);
            while (var3.field2811 == 0) {
                class126.method862(1L, arg1 ^ 0x40);
            }
            if (var3.field2811 == 1) {
                var2 = (class231) var3.field2812;
                byte[] var4 = new byte[(int) var2.method1556(-1)];
                int var6;
                for (int var5 = 0; var5 < var4.length; var5 += var6) {
                    var6 = var2.method1553(var5, arg1, var4.length - var5, var4);
                    if (var6 == -1) {
                        throw new IOException("EOF");
                    }
                }
                class232.method1564(new class82(var4), -1);
            }
        } catch (Exception var10) {
        }
        try {
            if (var2 != null) {
                var2.method1555(1);
            }
        } catch (Exception var9) {
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(BII)V", line = 137)
    public static final void method51(byte arg0, int arg1, int arg2) {
        field91++;
        class165.field2566 = arg1 - class135.field2057;
        if (arg0 != 86) {
            field100 = (int[]) null;
        }
        int var3 = class165.field2566 - ((int) ((float) class66.field1033.field4967 / class229.field3640));
        int var4 = (int) ((float) class66.field1033.field4967 / class229.field3640) + class165.field2566;
        if (var3 < 0) {
            class165.field2566 = (int) ((float) class66.field1033.field4967 / class229.field3640);
        }
        class18.field253 = class9.field111 + class317.field5436 - arg2 - 1;
        int var5 = (int) ((float) class66.field1033.field4996 / class229.field3640) + class18.field253;
        int var6 = class18.field253 - (int) ((float) class66.field1033.field4996 / class229.field3640);
        if (var4 > class38.field623) {
            class165.field2566 = class38.field623 - ((int) ((float) class66.field1033.field4967 / class229.field3640));
        }
        if (var6 < 0) {
            class18.field253 = (int) ((float) class66.field1033.field4996 / class229.field3640);
        }
        if (class317.field5436 < var5) {
            class18.field253 = class317.field5436 - ((int) ((float) class66.field1033.field4996 / class229.field3640));
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(Lna;II)V", line = 178)
    public static final void method52(class26 arg0, int arg1, int arg2) {
        class120 var3 = class293.method2059(arg1 + 4, 3, arg2);
        field98++;
        var3.method833((byte) 33);
        if (arg1 != 0) {
            field94 = 112;
        }
        var3.field1878 = arg0;
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(Z)Ljava/lang/Object;")
    public abstract Object method53(boolean arg0);

    @OriginalMember(owner = "client!gf", name = "e", descriptor = "(I)Z")
    public abstract boolean method54(int arg0);
}
