import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wv")
public abstract class class31 extends class170 {

    @OriginalMember(owner = "client!wv", name = "k", descriptor = "Z")
    public boolean field236 = false;

    @OriginalMember(owner = "client!wv", name = "m", descriptor = "Z")
    public boolean field238 = false;

    @OriginalMember(owner = "client!wv", name = "o", descriptor = "I")
    public int field240;

    @OriginalMember(owner = "client!wv", name = "r", descriptor = "I")
    public int field243;

    @OriginalMember(owner = "client!wv", name = "j", descriptor = "S")
    public short field235;

    @OriginalMember(owner = "client!wv", name = "s", descriptor = "I")
    public int field244;

    @OriginalMember(owner = "client!wv", name = "l", descriptor = "Lcea;")
    public static class180 field237 = new class180("Choose Option", "Wähl eine Option", "Choisir une option", "Selecionar opção");

    @OriginalMember(owner = "client!wv", name = "q", descriptor = "Lvj;")
    public static class373 field242 = new class373(82, -1);

    @OriginalMember(owner = "client!wv", name = "v", descriptor = "I")
    public static int field247 = 0;

    @OriginalMember(owner = "client!wv", name = "t", descriptor = "Lcea;")
    public static class180 field245 = new class180(" is already on your ignore list.", " steht bereits auf deiner Ignorieren-Liste!", " est déjà dans votre liste noire.", " já está na sua lista de ignorados.");

    @OriginalMember(owner = "client!wv", name = "n", descriptor = "I")
    public static int field239;

    @OriginalMember(owner = "client!wv", name = "p", descriptor = "I")
    public static int field241;

    @OriginalMember(owner = "client!wv", name = "u", descriptor = "I")
    public static int field246;

    @OriginalMember(owner = "client!wv", name = "d", descriptor = "(B)Ljava/lang/String;", line = 6)
    public static final String method179(byte arg0) {
        if (arg0 != -68) {
            field237 = null;
        }
        field241++;
        return class473.field6634 || class605.field8726 == null ? "" : class605.field8726.field1229;
    }

    @OriginalMember(owner = "client!wv", name = "<init>", descriptor = "(IIIIZZ)V", line = 101)
    public class31(int arg0, int arg1, int arg2, int arg3, boolean arg4, boolean arg5) {
        this.field240 = arg0;
        this.field243 = arg1;
        this.field236 = arg4;
        this.field235 = (short) arg3;
        this.field244 = arg2;
        this.field238 = arg5;
    }

    @OriginalMember(owner = "client!wv", name = "e", descriptor = "(B)V", line = 27)
    public static void method180(byte arg0) {
        field242 = null;
        field237 = null;
        if (arg0 < -20) {
            field245 = null;
        }
    }

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "(III)Lqn;", line = 42)
    public static final class56 method181(int arg0, int arg1, int arg2) {
        class349 var3 = class383.field5070[arg0][arg1][arg2];
        return var3 == null ? null : var3.field4507;
    }

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "(FFFI)I", line = 49)
    public static final int method182(float arg0, float arg1, float arg2, int arg3) {
        if (arg3 != 2) {
            method181(-28, 21, -52);
        }
        field239++;
        float var4 = arg1 < 0.0F ? -arg1 : arg1;
        float var5 = (arg2 < 0.0F) ? -arg2 : arg2;
        float var6 = arg0 < 0.0F ? -arg0 : arg0;
        if (var4 < var5 && var5 > var6) {
            return arg2 > 0.0F ? 0 : 1;
        } else if (var4 < var6 && var5 < var6) {
            return (arg0 > 0.0F) ? 2 : 3;
        } else if ((arg1 > 0.0F)) {
            return 4;
        } else {
            return 5;
        }
    }
}
