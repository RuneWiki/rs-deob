import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fe")
public class class243 extends class81 {

    @OriginalMember(owner = "client!fe", name = "w", descriptor = "I")
    public int field4264;

    @OriginalMember(owner = "client!fe", name = "s", descriptor = "I")
    public int field4260;

    @OriginalMember(owner = "client!fe", name = "A", descriptor = "Lpj;")
    private static class237 field4268 = class33.method353("glow3:", 59);

    @OriginalMember(owner = "client!fe", name = "C", descriptor = "I")
    public static int field4270 = 0;

    @OriginalMember(owner = "client!fe", name = "B", descriptor = "Lpj;")
    public static class237 field4269 = field4268;

    @OriginalMember(owner = "client!fe", name = "y", descriptor = "[I")
    public static int[] field4266 = new int[] { 1, 0, 0, 0, 1, 0, 2, 1, 1, 1, 0 };

    @OriginalMember(owner = "client!fe", name = "p", descriptor = "Lpj;")
    public static class237 field4257 = field4268;

    @OriginalMember(owner = "client!fe", name = "v", descriptor = "I")
    public static int field4263 = -1;

    @OriginalMember(owner = "client!fe", name = "q", descriptor = "I")
    public static int field4258;

    @OriginalMember(owner = "client!fe", name = "t", descriptor = "I")
    public static int field4261;

    @OriginalMember(owner = "client!fe", name = "x", descriptor = "I")
    public static int field4265;

    @OriginalMember(owner = "client!fe", name = "z", descriptor = "I")
    public static int field4267;

    @OriginalMember(owner = "client!fe", name = "r", descriptor = "Lfa;")
    public static class239 field4259;

    @OriginalMember(owner = "client!fe", name = "u", descriptor = "Llh;")
    public static class274 field4262;

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(B)V")
    public static final void method1679(byte arg0) {
        if (arg0 != 11) {
            return;
        }
        field4261++;
        class94.field1672 = 0;
        int var1 = (class229.field3911.field3710 >> 7) + class235.field4087;
        int var2 = (class229.field3911.field3700 >> 7) + class27.field494;
        if (var1 >= 3053 && var1 <= 3156 && var2 >= 3056 && var2 <= 3136) {
            class94.field1672 = 1;
        }
        if (var1 >= 3072 && var1 <= 3118 && var2 >= 9492 && var2 <= 9535) {
            class94.field1672 = 1;
        }
        if (class94.field1672 == 1 && var1 >= 3139 && var1 <= 3199 && var2 >= 3008 && var2 <= 3062) {
            class94.field1672 = 0;
        }
    }

    @OriginalMember(owner = "client!fe", name = "d", descriptor = "(I)Lpj;")
    public static final class237 method1680(int arg0) {
        field4258++;
        class237 var1 = class115.field2028;
        if (class12.field212 != 0) {
            var1 = class222.field3818;
        }
        if (arg0 != -3140) {
            method1680(-30);
        }
        class237 var2 = class239.field4202;
        if (class117.field2050 != null) {
            var2 = class238.method1626(new class237[] { class218.field3789, class117.field2050 }, arg0 ^ 0xC53);
        }
        return class238.method1626(new class237[] { class128.field2246, var1, class160.field2881, class14.method130(class37.field835, (byte) 117), class81.field1523, class14.method130(class106.field1873, (byte) 117), var2, class15.field253 }, -39);
    }

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "(B)V")
    public static void method1681(byte arg0) {
        field4259 = null;
        field4262 = null;
        if (arg0 < 47) {
            field4257 = null;
        }
        field4269 = null;
        field4257 = null;
        field4268 = null;
        field4266 = null;
    }

    @OriginalMember(owner = "client!fe", name = "<init>", descriptor = "(II)V")
    public class243(int arg0, int arg1) {
        this.field4264 = arg0;
        this.field4260 = arg1;
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(II)V")
    public static final void method1682(int arg0, int arg1) {
        field4267++;
        class270 var2 = class202.method1368(arg1 - 19, arg1, arg0);
        var2.method1795(-2113);
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(IZ)V")
    public static final void method1683(int arg0, boolean arg1) {
        field4265++;
        byte var2 = 4;
        byte[][] var3 = class163.field2903;
        int var4 = var3.length;
        for (int var5 = 0; var5 < var4; var5++) {
            int var11 = (class224.field3855[var5] & 0xFF) * 64 - class27.field494;
            int var12 = (class224.field3855[var5] >> 8) * 64 - class235.field4087;
            byte[] var13 = var3[var5];
            if (var13 != null) {
                class96.method718((byte) -52);
                class220.method1463(class146.field2613, var12, (class63.field1264 - 6) * 8, class263.field4495 * 8 - 48, arg1, (byte) 69, var11, var13);
            }
        }
        for (int var6 = 0; var6 < var4; var6++) {
            int var7 = (class224.field3855[var6] >> 8) * 64 - class235.field4087;
            int var8 = (class224.field3855[var6] & 0xFF) * 64 - class27.field494;
            byte[] var9 = var3[var6];
            if (var9 == null && class63.field1264 < 800) {
                class96.method718((byte) -52);
                for (int var10 = 0; var10 < var2; var10++) {
                    class53.method473(-7936, var10, var7, 64, var8, 64);
                }
            }
        }
        if (arg0 != -408916728) {
            method1683(86, true);
        }
    }
}
