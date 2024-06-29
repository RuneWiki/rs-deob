import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kd")
public class class99 {

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "Lrf;")
    private static class163 field2085 = class53.method392(58, "Welcome to RuneScape");

    @OriginalMember(owner = "client!kd", name = "g", descriptor = "Lrf;")
    public static class163 field2090 = field2085;

    @OriginalMember(owner = "client!kd", name = "d", descriptor = "Lrf;")
    public static class163 field2087 = class53.method392(45, "Lade Schrifts-=tze )2 ");

    @OriginalMember(owner = "client!kd", name = "f", descriptor = "I")
    public static int field2089 = 0;

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "Lfc;")
    public static class54 field2084 = new class54(64);

    @OriginalMember(owner = "client!kd", name = "i", descriptor = "[I")
    public static int[] field2092 = new int[100];

    @OriginalMember(owner = "client!kd", name = "e", descriptor = "I")
    public static int field2088;

    @OriginalMember(owner = "client!kd", name = "h", descriptor = "I")
    public static int field2091;

    @OriginalMember(owner = "client!kd", name = "j", descriptor = "I")
    public static int field2093;

    @OriginalMember(owner = "client!kd", name = "c", descriptor = "[[[I")
    public static int[][][] field2086;

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "([BB)V")
    public static final void method679(byte[] arg0, byte arg1) {
        class52 var2 = new class52(arg0);
        field2091++;
        if (arg1 != -3) {
            method679(null, (byte) -60);
        }
        var2.field1033 = arg0.length - 2;
        class22.field386 = var2.method390((byte) 110);
        class102.field2135 = new int[class22.field386];
        class57.field1158 = new int[class22.field386];
        class129.field2686 = new int[class22.field386];
        class108.field2242 = new int[class22.field386];
        class202.field3980 = new byte[class22.field386][];
        var2.field1033 = arg0.length - class22.field386 * 8 - 7;
        class81.field1639 = var2.method390((byte) 118);
        class206.field4036 = var2.method390((byte) 90);
        int var3 = (var2.method344(255) & 0xFF) + 1;
        for (int var4 = 0; var4 < class22.field386; var4++) {
            class102.field2135[var4] = var2.method390((byte) 120);
        }
        for (int var5 = 0; var5 < class22.field386; var5++) {
            class129.field2686[var5] = var2.method390((byte) 117);
        }
        for (int var6 = 0; var6 < class22.field386; var6++) {
            class108.field2242[var6] = var2.method390((byte) 124);
        }
        for (int var7 = 0; var7 < class22.field386; var7++) {
            class57.field1158[var7] = var2.method390((byte) 96);
        }
        var2.field1033 = arg0.length - class22.field386 * 8 - (var3 - 1) * 3 - 7;
        class167.field3393 = new int[var3];
        for (int var8 = 1; var8 < var3; var8++) {
            class167.field3393[var8] = var2.method340(false);
            if (class167.field3393[var8] == 0) {
                class167.field3393[var8] = 1;
            }
        }
        var2.field1033 = 0;
        for (int var9 = 0; var9 < class22.field386; var9++) {
            int var10 = class57.field1158[var9];
            int var11 = class108.field2242[var9];
            int var12 = var10 * var11;
            byte[] var13 = new byte[var12];
            class202.field3980[var9] = var13;
            int var14 = var2.method344(255);
            if (var14 == 0) {
                for (int var17 = 0; var17 < var12; var17++) {
                    var13[var17] = var2.method353(-81);
                }
            } else if (var14 == 1) {
                for (int var15 = 0; var15 < var11; var15++) {
                    for (int var16 = 0; var16 < var10; var16++) {
                        var13[var11 * var16 + var15] = var2.method353(-121);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(Lu;Lu;ZLne;B)V")
    public static final void method680(class184 arg0, class184 arg1, boolean arg2, class126 arg3, byte arg4) {
        class108.field2258 = arg0;
        if (arg4 != 82) {
            method680(null, null, false, null, (byte) 0);
        }
        field2088++;
        class197.field3921 = arg1;
        class184.field3645 = arg2;
        class166.field3384 = class197.field3921.method1225(10, true);
        class127.field2614 = arg3;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(I)V")
    public static void method681(int arg0) {
        if (arg0 <= 45) {
            return;
        }
        field2087 = null;
        field2085 = null;
        field2086 = null;
        field2090 = null;
        field2084 = null;
        field2092 = null;
    }
}
