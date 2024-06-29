import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oa")
public class class126 {

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "J")
    public static volatile long field2702 = 0L;

    @OriginalMember(owner = "client!oa", name = "f", descriptor = "Lea;")
    public static class38 field2707 = class9.method46((byte) 112, "Bitte geben Sie Ihr Passwort ein)3");

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "I")
    public static int field2703;

    @OriginalMember(owner = "client!oa", name = "e", descriptor = "I")
    public static int field2706;

    @OriginalMember(owner = "client!oa", name = "g", descriptor = "I")
    public static int field2708;

    @OriginalMember(owner = "client!oa", name = "h", descriptor = "I")
    public static int field2709;

    @OriginalMember(owner = "client!oa", name = "d", descriptor = "Lhc;")
    public static class66 field2705;

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "[[B")
    public static byte[][] field2704;

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Z[B)V")
    public static final void method936(boolean arg0, byte[] arg1) {
        class66 var2 = new class66(arg1);
        field2708++;
        var2.field1620 = arg1.length - 2;
        class25.field509 = var2.method511(20);
        class25.field513 = new byte[class25.field509][];
        class148.field3080 = new int[class25.field509];
        class30.field605 = new int[class25.field509];
        class150.field3101 = new int[class25.field509];
        class165.field3418 = new int[class25.field509];
        var2.field1620 = arg1.length - class25.field509 * 8 - 7;
        class52.field1338 = var2.method511(-123);
        class117.field2563 = var2.method511(-123);
        int var3 = (var2.method509(120) & 0xFF) + 1;
        if (arg0) {
            field2705 = null;
        }
        for (int var4 = 0; var4 < class25.field509; var4++) {
            class150.field3101[var4] = var2.method511(-123);
        }
        for (int var5 = 0; var5 < class25.field509; var5++) {
            class148.field3080[var5] = var2.method511(-6);
        }
        for (int var6 = 0; var6 < class25.field509; var6++) {
            class30.field605[var6] = var2.method511(-6);
        }
        for (int var7 = 0; var7 < class25.field509; var7++) {
            class165.field3418[var7] = var2.method511(-121);
        }
        var2.field1620 = arg1.length + 3 - var3 * 3 - class25.field509 * 8 - 7;
        class10.field227 = new int[var3];
        for (int var8 = 1; var8 < var3; var8++) {
            class10.field227[var8] = var2.method466(-26256544);
            if (class10.field227[var8] == 0) {
                class10.field227[var8] = 1;
            }
        }
        var2.field1620 = 0;
        for (int var9 = 0; var9 < class25.field509; var9++) {
            int var10 = class30.field605[var9];
            int var11 = class165.field3418[var9];
            int var12 = var10 * var11;
            byte[] var13 = new byte[var12];
            class25.field513[var9] = var13;
            int var14 = var2.method509(125);
            if (var14 == 0) {
                for (int var15 = 0; var15 < var12; var15++) {
                    var13[var15] = var2.method513((byte) 106);
                }
            } else if (var14 == 1) {
                for (int var16 = 0; var16 < var10; var16++) {
                    for (int var17 = 0; var17 < var11; var17++) {
                        var13[var10 * var17 + var16] = var2.method513((byte) 106);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(I)V")
    public static void method937(int arg0) {
        field2705 = null;
        field2707 = null;
        field2704 = null;
        if (arg0 != -193) {
            field2702 = 36L;
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIII)I")
    public static final int method938(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 >= -120) {
            return 13;
        }
        field2706++;
        if (arg1 > 179) {
            arg2 /= 2;
        }
        if (arg1 > 192) {
            arg2 /= 2;
        }
        if (arg1 > 217) {
            arg2 /= 2;
        }
        if (arg1 > 243) {
            arg2 /= 2;
        }
        return (arg2 / 32 << 7) + (arg3 / 4 << 10) + arg1 / 2;
    }
}
