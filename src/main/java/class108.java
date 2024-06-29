import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!p")
public class class108 {

    @OriginalMember(owner = "client!p", name = "d", descriptor = "[I")
    public static int[] field1763 = new int[] { 7, 8, 9, 10, 11, 12, 13, 15 };

    @OriginalMember(owner = "client!p", name = "c", descriptor = "[[B")
    public static byte[][] field1762 = new byte[50][];

    @OriginalMember(owner = "client!p", name = "a", descriptor = "I")
    public int field1760;

    @OriginalMember(owner = "client!p", name = "b", descriptor = "I")
    public int field1761;

    @OriginalMember(owner = "client!p", name = "f", descriptor = "I")
    public int field1765;

    @OriginalMember(owner = "client!p", name = "g", descriptor = "I")
    public static int field1766;

    @OriginalMember(owner = "client!p", name = "h", descriptor = "I")
    public static int field1767;

    @OriginalMember(owner = "client!p", name = "i", descriptor = "I")
    public int field1768;

    @OriginalMember(owner = "client!p", name = "j", descriptor = "I")
    public static int field1769;

    @OriginalMember(owner = "client!p", name = "e", descriptor = "Llg;")
    public static class132 field1764;

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(Z)V", line = 8)
    public static final void method856(boolean arg0) {
        class44.field694.method2283((byte) 77);
        field1767++;
        if (!arg0) {
            class64.field933.method2283((byte) 77);
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(I)I", line = 22)
    public static final int method857(int arg0) {
        field1766++;
        if (arg0 != 2) {
            method858(37);
        }
        return class321.field5030;
    }

    @OriginalMember(owner = "client!p", name = "b", descriptor = "(I)V", line = 40)
    public static void method858(int arg0) {
        field1762 = (byte[][]) null;
        field1764 = null;
        if (arg0 != 8) {
            field1763 = (int[]) null;
        }
        field1763 = null;
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(II)V", line = 53)
    public static final void method859(int arg0, int arg1) {
        class42 var2 = class34.field521[0][arg0][arg1];
        for (int var3 = 0; var3 < 3; var3++) {
            class42 var4 = class34.field521[var3][arg0][arg1] = class34.field521[var3 + 1][arg0][arg1];
            if (var4 != null) {
                var4.field658--;
                for (int var5 = 0; var5 < var4.field672; var5++) {
                    class144 var6 = var4.field659[var5];
                    if ((var6.field2344 >> 29 & 0x3L) == 2L && var6.field2345 == arg0 && var6.field2339 == arg1) {
                        var6.field2333--;
                    }
                }
            }
        }
        if (class34.field521[0][arg0][arg1] == null) {
            class34.field521[0][arg0][arg1] = new class42(0, arg0, arg1);
        }
        class34.field521[0][arg0][arg1].field670 = var2;
        class34.field521[3][arg0][arg1] = null;
    }
}
