import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!um")
public class class159 extends class320 {

    @OriginalMember(owner = "client!um", name = "n", descriptor = "[B")
    public byte[] field2810;

    @OriginalMember(owner = "client!um", name = "r", descriptor = "I")
    public static int field2814 = 0;

    @OriginalMember(owner = "client!um", name = "t", descriptor = "F")
    public static float field2816;

    @OriginalMember(owner = "client!um", name = "l", descriptor = "I")
    public static int field2808;

    @OriginalMember(owner = "client!um", name = "o", descriptor = "I")
    public static int field2811;

    @OriginalMember(owner = "client!um", name = "q", descriptor = "I")
    public static int field2813;

    @OriginalMember(owner = "client!um", name = "s", descriptor = "I")
    public static int field2815;

    @OriginalMember(owner = "client!um", name = "m", descriptor = "[Lih;")
    public static class38[] field2809;

    @OriginalMember(owner = "client!um", name = "p", descriptor = "[[[I")
    public static int[][][] field2812;

    @OriginalMember(owner = "client!um", name = "<init>", descriptor = "([B)V", line = 22)
    public class159(byte[] arg0) {
        this.field2810 = arg0;
    }

    @OriginalMember(owner = "client!um", name = "b", descriptor = "(Z)V", line = 32)
    public static void method1269(boolean arg0) {
        if (!arg0) {
            field2816 = -0.468261F;
        }
        field2812 = (int[][][]) null;
        field2809 = null;
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(I[BII)Z", line = 46)
    public static final boolean method1270(int arg0, byte[] arg1, int arg2, int arg3) {
        field2811++;
        if (arg2 >= -8) {
            field2812 = (int[][][]) ((int[][][]) null);
        }
        boolean var4 = true;
        class336 var5 = new class336(arg1);
        int var6 = -1;
        label61: while (true) {
            int var7 = var5.method2347(32767);
            if (var7 == 0) {
                return var4;
            }
            int var8 = 0;
            var6 += var7;
            boolean var9 = false;
            while (true) {
                while (!var9) {
                    int var11 = var5.method2314((byte) -63);
                    if (var11 == 0) {
                        continue label61;
                    }
                    var8 += var11 - 1;
                    int var12 = var8 >> 6 & 0x3F;
                    int var13 = var8 & 0x3F;
                    int var14 = var5.method2364(-9069) >> 2;
                    int var15 = var13 + arg0;
                    int var16 = arg3 + var12;
                    if (var16 > 0 && var15 > 0 && var16 < 103 && var15 < 103) {
                        class97 var17 = class92.method798((byte) 104, var6);
                        if (var14 != 22 || class48.field735 || var17.field1571 != 0 || var17.field1575 == 1 || var17.field1509) {
                            if (!var17.method825(0)) {
                                var4 = false;
                                class288.field4602++;
                            }
                            var9 = true;
                        }
                    }
                }
                int var10 = var5.method2314((byte) -49);
                if (var10 == 0) {
                    break;
                }
                var5.method2364(-9069);
            }
        }
    }
}
