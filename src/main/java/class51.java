import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!we")
public class class51 extends class310 {

    @OriginalMember(owner = "client!we", name = "m", descriptor = "[Ljava/lang/String;")
    public static String[] field814 = new String[1000];

    @OriginalMember(owner = "client!we", name = "l", descriptor = "I")
    public static int field813 = 0;

    @OriginalMember(owner = "client!we", name = "o", descriptor = "I")
    public static int field816;

    @OriginalMember(owner = "client!we", name = "p", descriptor = "I")
    public static int field817;

    @OriginalMember(owner = "client!we", name = "n", descriptor = "Lja;")
    public static class64 field815;

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(I)V", line = 12)
    public static void method381(int arg0) {
        field815 = null;
        field814 = null;
        if (arg0 != 128) {
            field813 = 116;
        }
    }

    @OriginalMember(owner = "client!we", name = "b", descriptor = "(I)V", line = 27)
    public static final void method382(int arg0) {
        class248.field3833 &= 0x7FF;
        field816++;
        if (class143.field2254 < 128) {
            class143.field2254 = 128;
        }
        if (class143.field2254 > 383) {
            class143.field2254 = 383;
        }
        int var1 = 0;
        int var2 = class86.field1294 >> 7;
        int var3 = class316.field4927 >> 7;
        int var4 = class48.method374(class86.field1294, class316.field4927, 114, class41.field734);
        int var5 = 23 / ((arg0 + 29) / 56);
        if (var3 > 3 && var2 > 3 && var3 < 100 && var2 < 100) {
            for (int var6 = var3 - 4; var6 <= var3 + 4; var6++) {
                for (int var7 = var2 - 4; var7 <= var2 + 4; var7++) {
                    int var8 = class41.field734;
                    if (var8 < 3 && (class250.field3857[1][var6][var7] & 0x2) == 2) {
                        var8++;
                    }
                    int var9 = ((class75.field1152[var8][var6][var7] & 0xFF) * 8) + var4 - class29.field475[var8][var6][var7];
                    if (var1 < var9) {
                        var1 = var9;
                    }
                }
            }
        }
        int var10 = var1 * 192;
        if (var10 > 98048) {
            var10 = 98048;
        }
        if (var10 < 32768) {
            var10 = 32768;
        }
        if (class301.field4747 < var10) {
            class301.field4747 += (var10 - class301.field4747) / 24;
        } else if (class301.field4747 > var10) {
            class301.field4747 += (var10 - class301.field4747) / 80;
        }
    }

    @OriginalMember(owner = "client!we", name = "c", descriptor = "(I)V", line = 99)
    public static final void method383(int arg0) {
        class221.field3539.method1837(18);
        field817++;
        if (arg0 != 0) {
            field815 = (class64) null;
        }
    }
}
