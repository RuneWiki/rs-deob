import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!od")
public class class295 {

    @OriginalMember(owner = "client!od", name = "b", descriptor = "Lub;")
    public static class15 field4267 = new class15(4);

    @OriginalMember(owner = "client!od", name = "e", descriptor = "[[I")
    public static int[][] field4270 = new int[][] { { 6, 6 }, { 6, 6 }, { 6, 5, 5 }, { 5, 6, 5 }, { 5, 5, 6 }, { 6, 5, 5 }, { 5, 0, 4, 1 }, { 7, 7, 1, 2 }, { 7, 1, 2, 7 }, { 8, 9, 4, 0, 8, 9 }, { 0, 8, 9, 8, 9, 4 }, { 11, 0, 10, 11, 4, 2 }, { 6, 6 }, { 7, 7, 1, 2 }, { 7, 7, 1, 2 } };

    @OriginalMember(owner = "client!od", name = "g", descriptor = "Lpm;")
    public static class349 field4272 = new class349("Loading title screen - ", "Lade Titelbild - ", "Chargement de l'écran-titre - ", "Carregando tela título - ");

    @OriginalMember(owner = "client!od", name = "a", descriptor = "I")
    public static int field4266;

    @OriginalMember(owner = "client!od", name = "c", descriptor = "I")
    public static int field4268;

    @OriginalMember(owner = "client!od", name = "d", descriptor = "Ljava/awt/Image;")
    public static Image field4269;

    @OriginalMember(owner = "client!od", name = "f", descriptor = "[[B")
    public static byte[][] field4271;

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(Lpl;IIIII)V", line = 6)
    public static final void method1996(class390 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        arg0.field5481 = 0;
        label58: for (int var6 = arg2; var6 <= arg4; var6++) {
            label56: for (int var7 = arg3; var7 <= arg5; var7++) {
                int var8 = class115.field1487[arg1][var6][var7];
                int var9 = 0;
                while (true) {
                    label51: while (true) {
                        if (var9 > 24) {
                            continue label56;
                        }
                        int var10 = var8 >>> var9 & 0xFF;
                        if (var10 <= 0) {
                            continue label56;
                        }
                        class78 var11 = class282.field4039[var10 - 1];
                        for (int var12 = 0; var12 < arg0.field5481; var12++) {
                            if (arg0.field5487[var12] == var11) {
                                var9 += 8;
                                continue label51;
                            }
                        }
                        arg0.field5487[arg0.field5481++] = var11;
                        if (arg0.field5481 == 4) {
                            break label58;
                        }
                        var9 += 8;
                    }
                }
            }
        }
        for (int var13 = arg0.field5481; var13 < 4; var13++) {
            arg0.field5487[var13] = null;
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(IIIB)I", line = 71)
    public static final int method1997(int arg0, int arg1, int arg2, byte arg3) {
        field4268++;
        if (arg3 != -95) {
            return -109;
        }
        if (arg2 > 243) {
            arg1 >>= 0x4;
        } else if (arg2 > 217) {
            arg1 >>= 0x3;
        } else if (arg2 > 192) {
            arg1 >>= 0x2;
        } else if (arg2 > 179) {
            arg1 >>= 0x1;
        }
        return ((arg0 & 0xFF) >> 2 << 10) + ((arg1 >> 5 << 7) + (arg2 >> 1));
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(Z)V", line = 99)
    public static void method1998(boolean arg0) {
        field4270 = null;
        field4267 = null;
        field4271 = null;
        if (arg0) {
            method1999((byte) -124, (String) null);
        }
        field4272 = null;
        field4269 = null;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(BLjava/lang/String;)V", line = 121)
    public static final void method1999(byte arg0, String arg1) {
        if (arg0 >= -112) {
            method1999((byte) -40, (String) null);
        }
        if (class1.field4 == null) {
            class445.method2770(30383);
        }
        field4266++;
        String[] var2 = class190.method1362(arg1, '\n', (byte) 126);
        for (int var3 = 0; var3 < var2.length; var3++) {
            for (int var4 = class442.field6328; var4 > 0; var4--) {
                class1.field4[var4] = class1.field4[var4 - 1];
            }
            class1.field4[0] = var2[var3];
            if (class1.field4.length - 1 > class442.field6328) {
                if (class282.field4033 > 0) {
                    class282.field4033++;
                }
                class442.field6328++;
            }
        }
    }
}
