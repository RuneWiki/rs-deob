import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ig")
public class class13 extends class35 {

    @OriginalMember(owner = "client!ig", name = "i", descriptor = "S")
    public short field212;

    @OriginalMember(owner = "client!ig", name = "l", descriptor = "[[I")
    public static int[][] field215 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12, 12, 5 }, { 5, 5, 1, 1 }, { 5, 1, 1, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 12, 12, 12, 12, 12 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 3, 1, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 7, 3, 7 }, { 12, 12, 12, 12 } };

    @OriginalMember(owner = "client!ig", name = "m", descriptor = "Ljh;")
    public static class444 field216 = new class444(5000);

    @OriginalMember(owner = "client!ig", name = "p", descriptor = "I")
    public static int field219 = -1;

    @OriginalMember(owner = "client!ig", name = "q", descriptor = "Z")
    public static boolean field220 = false;

    @OriginalMember(owner = "client!ig", name = "j", descriptor = "I")
    public static int field213;

    @OriginalMember(owner = "client!ig", name = "k", descriptor = "I")
    public static int field214;

    @OriginalMember(owner = "client!ig", name = "n", descriptor = "I")
    public static int field217;

    @OriginalMember(owner = "client!ig", name = "o", descriptor = "I")
    public static int field218;

    @OriginalMember(owner = "client!ig", name = "c", descriptor = "(I)V", line = 3)
    public static void method84(int arg0) {
        if (arg0 < -18) {
            field216 = null;
            field215 = null;
        }
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(Lmb;IIIIIII)V", line = 21)
    public static final void method85(class258 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field214++;
        if (class345.field4873) {
            class196.field2868 = 32;
        } else {
            class196.field2868 = 0;
        }
        class345.field4873 = false;
        if (arg3 != 32) {
            method86((byte) -92);
        }
        if (class408.field5943 != 0) {
            if (arg5 >= arg2 && arg2 + 16 > arg5 && arg6 <= arg1 && arg6 + 16 > arg1) {
                arg0.field3900 -= 4;
                class107.method947(true, arg0);
            } else if (arg5 >= arg2 && arg5 < arg2 + 16 && (arg4 + arg6 - 16) <= arg1 && arg1 < (arg4 + arg6)) {
                arg0.field3900 += 4;
                class107.method947(true, arg0);
            } else if ((arg2 - class196.field2868) <= arg5 && arg5 < arg2 + class196.field2868 + 16 && arg6 + 16 <= arg1 && (arg4 + arg6 - 16) > arg1) {
                int var8 = (arg4 - 32) * arg4 / arg7;
                if (var8 < 8) {
                    var8 = 8;
                }
                int var9 = arg1 - (var8 / 2) - arg6 - 16;
                int var10 = arg4 - var8 - 32;
                arg0.field3900 = (arg7 - arg4) * var9 / var10;
                class107.method947(true, arg0);
                class345.field4873 = true;
            }
        }
        if (class282.field4228 == 0) {
            return;
        }
        int var11 = arg0.field3764;
        if (arg5 >= arg2 - var11 && arg6 <= arg1 && arg5 < arg2 + 16 && arg1 <= arg6 + arg4) {
            arg0.field3900 += class282.field4228 * 45;
            class107.method947(true, arg0);
            return;
        }
    }

    @OriginalMember(owner = "client!ig", name = "<init>", descriptor = "()V", line = 84)
    public class13() {
    }

    @OriginalMember(owner = "client!ig", name = "c", descriptor = "(B)Lho;", line = 89)
    public static final class359 method86(byte arg0) {
        int var1 = -69 % ((arg0 + 61) / 43);
        field217++;
        try {
            return (class359) Class.forName("th").getDeclaredConstructor().newInstance();
        } catch (Throwable var2) {
            return null;
        }
    }

    @OriginalMember(owner = "client!ig", name = "<init>", descriptor = "(S)V", line = 103)
    public class13(short arg0) {
        this.field212 = arg0;
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(ZILjava/lang/String;)V", line = 112)
    public static final void method87(boolean arg0, int arg1, String arg2) {
        field213++;
        String var3 = arg2.toLowerCase();
        if (arg1 >= -78) {
            method85((class258) null, -38, 113, -36, 35, -3, -120, 48);
        }
        short[] var4 = new short[16];
        int var5 = 0;
        int var6 = arg0 ? 32768 : 0;
        int var7 = var6 + (arg0 ? class338.field4821 : class234.field3388);
        for (int var8 = var6; var8 < var7; var8++) {
            class170 var11 = class56.method439(var8, true);
            if (var11.field2529 && var11.method1306(96).toLowerCase().indexOf(var3) != -1) {
                if (var5 >= 50) {
                    class384.field5515 = -1;
                    class380.field5385 = null;
                    return;
                }
                if (var4.length <= var5) {
                    short[] var12 = new short[var4.length * 2];
                    for (int var13 = 0; var13 < var5; var13++) {
                        var12[var13] = var4[var13];
                    }
                    var4 = var12;
                }
                var4[var5++] = (short) var8;
            }
        }
        class380.field5385 = var4;
        class279.field4190 = 0;
        class384.field5515 = var5;
        String[] var9 = new String[class384.field5515];
        for (int var10 = 0; var10 < class384.field5515; var10++) {
            var9[var10] = class56.method439(var4[var10], true).method1306(109);
        }
        class254.method1843(var9, class380.field5385, 0);
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(Lja;Lnf;III)V", line = 192)
    public static final void method88(class90 arg0, class256 arg1, int arg2, int arg3, int arg4) {
        if (arg3 < class139.field2209) {
            class168 var5 = class443.field6447[arg2][arg3 + 1][arg4];
            if (var5 != null && var5.field2501 != null && var5.field2501.method53((byte) 60)) {
                arg1.method47(0, (byte) 47, true, 128, 0, var5.field2501, arg0);
            }
        }
        if (arg4 < class139.field2209) {
            class168 var6 = class443.field6447[arg2][arg3][arg4 + 1];
            if (var6 != null && var6.field2501 != null && var6.field2501.method53((byte) 125)) {
                arg1.method47(0, (byte) 47, true, 0, 128, var6.field2501, arg0);
            }
        }
        if (arg3 < class139.field2209 && arg4 < class436.field6353) {
            class168 var7 = class443.field6447[arg2][arg3 + 1][arg4 + 1];
            if (var7 != null && var7.field2501 != null && var7.field2501.method53((byte) 86)) {
                arg1.method47(0, (byte) 47, true, 128, 128, var7.field2501, arg0);
            }
        }
        if (arg3 < class139.field2209 && arg4 > 0) {
            class168 var8 = class443.field6447[arg2][arg3 + 1][arg4 - 1];
            if (var8 != null && var8.field2501 != null && var8.field2501.method53((byte) 116)) {
                arg1.method47(0, (byte) 47, true, 128, -128, var8.field2501, arg0);
            }
        }
    }
}
