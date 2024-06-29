import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pda")
public class class488 {

    @OriginalMember(owner = "client!pda", name = "b", descriptor = "Lpl;")
    public static class616 field7060 = new class616(512);

    @OriginalMember(owner = "client!pda", name = "a", descriptor = "I")
    public static int field7059;

    @OriginalMember(owner = "client!pda", name = "c", descriptor = "I")
    public static int field7061;

    @OriginalMember(owner = "client!pda", name = "d", descriptor = "[[[Llo;")
    public static class114[][][] field7062;

    @OriginalMember(owner = "client!pda", name = "a", descriptor = "(ZI[Lraa;IBI)V", line = 3)
    public static final void method2968(boolean arg0, int arg1, class353[] arg2, int arg3, byte arg4, int arg5) {
        field7061++;
        if (arg4 != -76) {
            method2970((byte) -68);
        }
        for (int var6 = 0; var6 < arg2.length; var6++) {
            class353 var7 = arg2[var6];
            if (var7 != null && var7.field5202 == arg1) {
                class274.method1799((byte) 61, arg0, arg3, var7, arg5);
                class530.method3139(4, arg5, arg3, var7);
                if (var7.field5351 - var7.field5230 < var7.field5284) {
                    var7.field5284 = var7.field5351 - var7.field5230;
                }
                if ((var7.field5358 - var7.field5280) < var7.field5299) {
                    var7.field5299 = var7.field5358 - var7.field5280;
                }
                if (var7.field5284 < 0) {
                    var7.field5284 = 0;
                }
                if (var7.field5299 < 0) {
                    var7.field5299 = 0;
                }
                if (var7.field5306 == 0) {
                    class134.method1083(arg0, (byte) 61, var7);
                }
            }
        }
    }

    @OriginalMember(owner = "client!pda", name = "a", descriptor = "(Lha;IIIIIIZZ)V", line = 49)
    public static final void method2969(class544 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, boolean arg8) {
        class478.field6933 = arg0;
        class23.field228 = arg1;
        class238.field3835 = class23.field228 > 1 && class478.field6933.method320();
        class662.field9425 = arg2;
        class382.field5732 = 0x1 << class662.field9425;
        class581.field8224 = class382.field5732 >> 1;
        Math.sqrt((double) (class581.field8224 * class581.field8224 + class581.field8224 * class581.field8224));
        class386.field5782 = arg3;
        class42.field727 = arg4;
        class54.field870 = arg5;
        class155.field2405 = arg6;
        class289.field4442 = class105.method857(true);
        class751.method4185(49);
        class475.field6899 = new class114[arg3][class42.field727][class54.field870];
        class121.field1867 = new class339[arg3];
        if (arg7) {
            class487.field7049 = new int[class42.field727][class54.field870];
            class500.field7266 = new byte[class42.field727][class54.field870];
            class233.field3752 = new short[class42.field727][class54.field870];
            class576.field8160 = new class114[1][class42.field727][class54.field870];
            class152.field2374 = new class339[1];
        } else {
            class487.field7049 = null;
            class500.field7266 = null;
            class233.field3752 = null;
            class576.field8160 = null;
            class152.field2374 = null;
        }
        if (arg8) {
            class324.field4792 = new long[arg3][arg4][arg5];
            class96.field1422 = new class639[65535];
            class700.field9901 = new boolean[65535];
            class145.field2253 = 0;
        } else {
            class324.field4792 = null;
            class96.field1422 = null;
            class700.field9901 = null;
            class145.field2253 = 0;
        }
        class733.method4095(false);
        class335.field4904 = new class668[2];
        class231.field3722 = new class668[2];
        class24.field240 = new class668[2];
        class563.field7976 = new class668[10000];
        class641.field9058 = 0;
        class553.field7883 = new class668[5000];
        class8.field77 = 0;
        class81.field1166 = new class559[5000];
        class266.field4132 = 0;
        class52.field838 = new boolean[class155.field2405 + class155.field2405 + 1][class155.field2405 + class155.field2405 + 1];
        class135.field2156 = new boolean[class155.field2405 + class155.field2405 + 2][class155.field2405 + class155.field2405 + 2];
        class426.field6258 = new int[class155.field2405 + class155.field2405 + 2];
        class532.field7659 = class532.field7658;
        if (class238.field3835) {
            class314.field4726 = new boolean[arg3][class155.field2405 + class155.field2405 + 1][class155.field2405 + class155.field2405 + 1];
            class370.field5622 = new boolean[arg3][][];
            if (class147.field2305 != null) {
                class12.method55();
            }
            class147.field2305 = new class566[class23.field228];
            class478.field6933.method322(class147.field2305.length + 1);
            class478.field6933.method229(0);
            for (int var9 = 0; var9 < class147.field2305.length; var9++) {
                class147.field2305[var9] = new class566(var9 + 1, class478.field6933);
                (new Thread(class147.field2305[var9], "wr" + var9)).start();
            }
            byte var10;
            if (class23.field228 == 2) {
                var10 = 4;
                class286.field4406 = 2;
            } else if (class23.field228 == 3) {
                var10 = 6;
                class286.field4406 = 3;
            } else {
                var10 = 8;
                class286.field4406 = 4;
            }
            class222.field3605 = new class243[var10];
            for (int var11 = 0; var11 < var10; var11++) {
                class222.field3605[var11] = new class243(class3.field20[class23.field228 - 2][var11]);
            }
        } else {
            class286.field4406 = 1;
        }
        class671.field9501 = new int[class286.field4406 - 1];
        class436.field6358 = new int[class286.field4406 - 1];
    }

    @OriginalMember(owner = "client!pda", name = "a", descriptor = "(B)V", line = 168)
    public static void method2970(byte arg0) {
        field7060 = null;
        field7062 = null;
        if (arg0 != -96) {
            field7062 = null;
        }
    }

    @OriginalMember(owner = "client!pda", name = "a", descriptor = "(BILraa;)Ljava/lang/String;", line = 187)
    public static final String method2971(byte arg0, int arg1, class353 arg2) {
        field7059++;
        if (arg0 >= -95) {
            method2971((byte) 71, -119, null);
        }
        if (!client.method2735(arg2).method1864(2362, arg1) && arg2.field5305 == null) {
            return null;
        } else if (arg2.field5353 == null || arg2.field5353.length <= arg1 || arg2.field5353[arg1] == null || arg2.field5353[arg1].trim().length() == 0) {
            return class107.field1563 ? "Hidden-" + arg1 : null;
        } else {
            return arg2.field5353[arg1];
        }
    }
}
