import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ce")
public class class201 extends class448 {

    @OriginalMember(owner = "client!ce", name = "t", descriptor = "Lfg;")
    public static class83 field2874;

    @OriginalMember(owner = "client!ce", name = "u", descriptor = "[I")
    public static int[] field2875;

    @OriginalMember(owner = "client!ce", name = "j", descriptor = "I")
    public int field2864;

    @OriginalMember(owner = "client!ce", name = "k", descriptor = "I")
    public int field2865;

    @OriginalMember(owner = "client!ce", name = "l", descriptor = "I")
    public static int field2866;

    @OriginalMember(owner = "client!ce", name = "m", descriptor = "I")
    public int field2867;

    @OriginalMember(owner = "client!ce", name = "n", descriptor = "I")
    public int field2868;

    @OriginalMember(owner = "client!ce", name = "o", descriptor = "I")
    public int field2869;

    @OriginalMember(owner = "client!ce", name = "p", descriptor = "I")
    public int field2870;

    @OriginalMember(owner = "client!ce", name = "r", descriptor = "I")
    public static int field2872;

    @OriginalMember(owner = "client!ce", name = "s", descriptor = "Ltu;")
    public static class230 field2873;

    @OriginalMember(owner = "client!ce", name = "q", descriptor = "Ljava/lang/String;")
    public String field2871;

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(I[B)Lcl;")
    public static final class173 method1235(int arg0, byte[] arg1) {
        field2866++;
        class173 var2 = new class173();
        class365 var3 = new class365(arg1);
        var3.field5069 = var3.field5073.length - 2;
        int var4 = var3.method2062((byte) 14);
        int var5 = var3.field5073.length - var4 - 2 - 12;
        var3.field5069 = var5;
        int var6 = var3.method2056((byte) 96);
        var2.field2485 = var3.method2062((byte) 14);
        var2.field2474 = var3.method2062((byte) 14);
        var2.field2486 = var3.method2062((byte) 14);
        var2.field2479 = var3.method2062((byte) 14);
        int var7 = var3.method2099(255);
        if (var7 > 0) {
            var2.field2475 = new class159[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                int var9 = var3.method2062((byte) 14);
                class159 var10 = new class159(class420.method2513(var9, 0));
                var2.field2475[var8] = var10;
                while (var9-- > 0) {
                    int var11 = var3.method2056((byte) -109);
                    int var12 = var3.method2056((byte) -8);
                    var10.method990((long) var11, (byte) 37, new class330(var12));
                }
            }
        }
        var3.field5069 = 0;
        var2.field2477 = var3.method2066(127);
        var2.field2478 = new int[var6];
        int var13 = -33 / ((arg0 - 71) / 34);
        var2.field2482 = new int[var6];
        var2.field2481 = new String[var6];
        int var14 = 0;
        while (var3.field5069 < var5) {
            int var15 = var3.method2062((byte) 14);
            if (var15 == 3) {
                var2.field2481[var14] = var3.method2106(-1).intern();
            } else if (var15 >= 100 || var15 == 21 || var15 == 38 || var15 == 39) {
                var2.field2478[var14] = var3.method2099(255);
            } else {
                var2.field2478[var14] = var3.method2056((byte) 123);
            }
            var2.field2482[var14++] = var15;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "(I)V")
    public static void method1236(int arg0) {
        field2874 = null;
        field2873 = null;
        field2875 = null;
        if (arg0 < 88) {
            field2874 = null;
        }
    }

    static {
        new class83("You are temporarily banned from this clan channel.", "Du wurdest temporär aus diesem Chatraum verbannt.", "Vous êtes temporairement exclu de ce canal de clan.", "Você está temporariamente vetado de entrar nesse canal de clã.");
        field2874 = new class83("Loading sprites - ", "Lade Sprites - ", "Chargement des sprites - ", "Carregando sprites - ");
        field2875 = new int[8];
    }
}
