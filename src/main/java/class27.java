import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!o")
public class class27 {

    @OriginalMember(owner = "mapview!o", name = "a", descriptor = "I")
    public static int field334 = 0;

    @OriginalMember(owner = "mapview!o", name = "b", descriptor = "Lk;")
    public static class21 field335 = class14.method92((byte) 57, "Chainmail Shop");

    @OriginalMember(owner = "mapview!o", name = "d", descriptor = "Lk;")
    public static class21 field337 = class14.method92((byte) 57, "Quest Start");

    @OriginalMember(owner = "mapview!o", name = "c", descriptor = "[I")
    public static int[] field336;

    @OriginalMember(owner = "mapview!o", name = "a", descriptor = "([BI)V", line = 19)
    public static final void method174(byte[] arg0, int arg1) {
        class11 var2 = new class11(arg0);
        var2.field169 = arg0.length - 2;
        class19.field242 = var2.method70(27779);
        class19.field239 = new int[class19.field242];
        class8.field145 = new int[class19.field242];
        class26.field331 = new int[class19.field242];
        class32.field385 = new int[class19.field242];
        class28.field338 = new byte[class19.field242][];
        var2.field169 = arg0.length - class19.field242 * 8 - 7;
        class6.field136 = var2.method70(27779);
        class14.field192 = var2.method70(27779);
        int var3 = (var2.method73((byte) -97) & 0xFF) + 1;
        for (int var4 = 0; var4 < class19.field242; var4++) {
            class26.field331[var4] = var2.method70(arg1 + 27782);
        }
        for (int var5 = 0; var5 < class19.field242; var5++) {
            class32.field385[var5] = var2.method70(27779);
        }
        for (int var6 = 0; var6 < class19.field242; var6++) {
            class19.field239[var6] = var2.method70(27779);
        }
        for (int var7 = 0; var7 < class19.field242; var7++) {
            class8.field145[var7] = var2.method70(27779);
        }
        var2.field169 = arg0.length - class19.field242 * 8 - arg1 - var3 * 3 - 7;
        class11.field172 = new int[var3];
        for (int var8 = 1; var8 < var3; var8++) {
            class11.field172[var8] = var2.method75(false);
            if (class11.field172[var8] == 0) {
                class11.field172[var8] = 1;
            }
        }
        var2.field169 = 0;
        for (int var9 = 0; var9 < class19.field242; var9++) {
            int var10 = class19.field239[var9];
            int var11 = class8.field145[var9];
            int var12 = var10 * var11;
            byte[] var13 = new byte[var12];
            class28.field338[var9] = var13;
            int var14 = var2.method73((byte) -97);
            if (var14 == 0) {
                for (int var17 = 0; var17 < var12; var17++) {
                    var13[var17] = var2.method78(26035);
                }
            } else if (var14 == 1) {
                for (int var15 = 0; var15 < var10; var15++) {
                    for (int var16 = 0; var16 < var11; var16++) {
                        var13[var15 + var10 * var16] = var2.method78(26035);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "mapview!o", name = "a", descriptor = "(B)V", line = 142)
    public static void method175(byte arg0) {
        field337 = null;
        field335 = null;
        if (arg0 < 121) {
            field335 = null;
        }
        field336 = null;
    }
}
