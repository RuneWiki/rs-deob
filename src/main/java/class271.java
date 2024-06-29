import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mt")
public class class271 extends class34 {

    @OriginalMember(owner = "client!mt", name = "i", descriptor = "Ljv;")
    public static class55 field3908 = new class55(10);

    @OriginalMember(owner = "client!mt", name = "q", descriptor = "[I")
    public static int[] field3916 = new int[14];

    @OriginalMember(owner = "client!mt", name = "r", descriptor = "Lpi;")
    public static class342 field3917 = new class342("Loaded sprites", "Sprites geladen.", "Sprites chargés", "Sprites carregados");

    @OriginalMember(owner = "client!mt", name = "j", descriptor = "I")
    public static int field3909;

    @OriginalMember(owner = "client!mt", name = "k", descriptor = "I")
    public static int field3910;

    @OriginalMember(owner = "client!mt", name = "l", descriptor = "I")
    public int field3911;

    @OriginalMember(owner = "client!mt", name = "m", descriptor = "I")
    public int field3912;

    @OriginalMember(owner = "client!mt", name = "n", descriptor = "I")
    public int field3913;

    @OriginalMember(owner = "client!mt", name = "o", descriptor = "I")
    public int field3914;

    @OriginalMember(owner = "client!mt", name = "t", descriptor = "I")
    public static int field3919;

    @OriginalMember(owner = "client!mt", name = "p", descriptor = "Lob;")
    public class517 field3915;

    @OriginalMember(owner = "client!mt", name = "s", descriptor = "[[B")
    public static byte[][] field3918;

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "(ZIII)V", line = 8)
    public static final void method1747(boolean arg0, int arg1, int arg2, int arg3) {
        field3910++;
        if (arg1 < 8000 || arg1 > 48000) {
            throw new IllegalArgumentException();
        }
        class256.field3725 = arg1;
        int var4 = -66 / ((arg3 - 44) / 55);
        class183.field2746 = arg2;
        class320.field4899 = arg0;
    }

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "(JIII)V", line = 26)
    public static final void method1748(long arg0, int arg1, int arg2, int arg3) {
        field3909++;
        int var5 = ((int) arg0 & 0x7D6ED) >> 14;
        if (arg3 != 6503) {
            field3917 = null;
        }
        int var6 = (int) arg0 >> 20 & 0x3;
        int var7 = Integer.MAX_VALUE & (int) (arg0 >>> 32);
        if (var5 != 10 && var5 != 11 && var5 != 22) {
            class222.method1475(true, arg1, var6, 0, 0, var5, true, arg2, 0);
            return;
        }
        class79 var8 = class319.field4807.method2874(var7, -17045);
        int var9;
        int var10;
        if (var6 == 0 || var6 == 2) {
            var9 = var8.field1345;
            var10 = var8.field1384;
        } else {
            var9 = var8.field1384;
            var10 = var8.field1345;
        }
        int var11 = var8.field1401;
        if (var6 != 0) {
            var11 = (var11 << var6 & 0xF) + (var11 >> 4 - var6);
        }
        class222.method1475(true, arg1, 0, var10, var9, 0, true, arg2, var11);
    }

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "(B)V", line = 73)
    public static void method1749(byte arg0) {
        int var1 = 93 % ((arg0 + 53) / 61);
        field3918 = null;
        field3917 = null;
        field3908 = null;
        field3916 = null;
    }
}
