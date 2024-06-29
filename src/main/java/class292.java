import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nv")
public class class292 extends class3 {

    @OriginalMember(owner = "client!nv", name = "p", descriptor = "I")
    private int field4264;

    @OriginalMember(owner = "client!nv", name = "u", descriptor = "I")
    private int field4269;

    @OriginalMember(owner = "client!nv", name = "v", descriptor = "I")
    private int field4270;

    @OriginalMember(owner = "client!nv", name = "n", descriptor = "I")
    private int field4262;

    @OriginalMember(owner = "client!nv", name = "t", descriptor = "Lih;")
    private class503 field4268;

    @OriginalMember(owner = "client!nv", name = "m", descriptor = "I")
    private int field4261;

    @OriginalMember(owner = "client!nv", name = "r", descriptor = "I")
    private int field4266;

    @OriginalMember(owner = "client!nv", name = "k", descriptor = "[S")
    public static short[] field4259 = new short[256];

    @OriginalMember(owner = "client!nv", name = "l", descriptor = "Leh;")
    public static class246 field4260 = new class246(6, -1);

    @OriginalMember(owner = "client!nv", name = "j", descriptor = "I")
    public static int field4258;

    @OriginalMember(owner = "client!nv", name = "s", descriptor = "I")
    public static int field4267;

    @OriginalMember(owner = "client!nv", name = "o", descriptor = "Law;")
    private class55 field4263;

    @OriginalMember(owner = "client!nv", name = "q", descriptor = "[[[I")
    public static int[][][] field4265;

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(IILmn;I)V")
    public static final void method1808(int arg0, int arg1, class251 arg2, int arg3) {
        field4267++;
        if (arg1 == 256) {
            class140.field1843[arg0][arg3] = arg2;
        }
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(II)V")
    public static final void method1809(int arg0, int arg1) {
        class239 var2 = class268.field3910[0][arg0][arg1];
        for (int var3 = 0; var3 < 3; var3++) {
            class239 var4 = class268.field3910[var3][arg0][arg1] = class268.field3910[var3 + 1][arg0][arg1];
            if (var4 != null) {
                var4.field3479--;
                for (class134 var5 = var4.field3482; var5 != null; var5 = var5.field1755) {
                    class144 var6 = var5.field1761;
                    if (var6.field1911 == arg0 && var6.field1902 == arg1) {
                        var6.field1904--;
                    }
                }
            }
        }
        if (class268.field3910[0][arg0][arg1] == null) {
            class268.field3910[0][arg0][arg1] = new class239(0, arg0, arg1);
            class268.field3910[0][arg0][arg1].field3470 = 1;
        }
        class268.field3910[0][arg0][arg1].field3483 = var2;
        class268.field3910[3][arg0][arg1] = null;
    }

    @OriginalMember(owner = "client!nv", name = "d", descriptor = "(B)V")
    public static void method1810(byte arg0) {
        field4259 = null;
        if (arg0 >= -19) {
            method1808(-47, -1, null, -104);
        }
        field4260 = null;
        field4265 = null;
    }

    @OriginalMember(owner = "client!nv", name = "b", descriptor = "(I)Law;")
    public final class55 method26(int arg0) {
        field4258++;
        if (arg0 != 9907) {
            this.method26(2);
        }
        if (this.field4263 == null) {
            class479.field6675[0] = this.field4262;
            class16 var2 = this.field4268.field4246;
            class479.field6675[3] = this.field4269;
            class479.field6675[4] = this.field4270;
            class479.field6675[5] = this.field4264;
            class479.field6675[2] = this.field4261;
            class479.field6675[1] = this.field4266;
            boolean var3 = false;
            int var4 = 0;
            for (int var5 = 0; var5 < 6; var5++) {
                if (!var2.method82(class479.field6675[var5], -18226)) {
                    return null;
                }
                class222 var7 = var2.method83(class479.field6675[var5], arg0 ^ 0x26EC);
                int var8 = var7.field3186 ? 64 : 128;
                if (var7.field3193 > 0) {
                    var3 = true;
                }
                if (var8 > var4) {
                    var4 = var8;
                }
            }
            for (int var6 = 0; var6 < 6; var6++) {
                class375.field5331[var6] = var2.method81((byte) 106, var4, class479.field6675[var6], 1.0F, false, var4);
            }
            this.field4263 = new class55(this.field4268, 6407, var4, var3, class375.field5331);
        }
        return this.field4263;
    }

    @OriginalMember(owner = "client!nv", name = "<init>", descriptor = "(Lih;IIIIII)V")
    public class292(class503 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field4264 = arg6;
        this.field4269 = arg4;
        this.field4270 = arg5;
        this.field4262 = arg1;
        this.field4268 = arg0;
        this.field4261 = arg3;
        this.field4266 = arg2;
    }
}
