import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!of")
public class class274 {

    @OriginalMember(owner = "client!of", name = "g", descriptor = "I")
    public static int field4375 = 0;

    @OriginalMember(owner = "client!of", name = "h", descriptor = "I")
    public static int field4376 = 0;

    @OriginalMember(owner = "client!of", name = "b", descriptor = "I")
    public static int field4370;

    @OriginalMember(owner = "client!of", name = "c", descriptor = "I")
    public static int field4371;

    @OriginalMember(owner = "client!of", name = "d", descriptor = "I")
    public static int field4372;

    @OriginalMember(owner = "client!of", name = "e", descriptor = "I")
    public static int field4373;

    @OriginalMember(owner = "client!of", name = "f", descriptor = "I")
    public static int field4374;

    @OriginalMember(owner = "client!of", name = "a", descriptor = "[Led;")
    public static class186[] field4369;

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(IZ)V")
    public static final void method1842(int arg0, boolean arg1) {
        field4372++;
        if (arg0 != 27841) {
            field4375 = 56;
        }
        if (class97.field1632 != arg1) {
            class97.field1632 = arg1;
            class212.method1435((byte) 27);
        }
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(ZI)V")
    public static final void method1843(boolean arg0, int arg1) {
        field4371++;
        byte var2 = 4;
        byte[][] var3 = class249.field4024;
        if (arg1 != 1735859459) {
            field4376 = -106;
        }
        for (int var4 = 0; var4 < var2; var4++) {
            class230.method1534(false);
            for (int var5 = 0; var5 < 13; var5++) {
                for (int var6 = 0; var6 < 13; var6++) {
                    int var7 = class33.field500[var4][var5][var6];
                    if (var7 != -1) {
                        int var8 = (var7 & 0x3DF560A) >> 24;
                        if (!arg0 || var8 == 0) {
                            int var9 = var7 >> 1 & 0x3;
                            int var10 = var7 >> 3 & 0x7FF;
                            int var11 = var7 >> 14 & 0x3FF;
                            int var12 = (var11 / 8 << 8) + var10 / 8;
                            for (int var13 = 0; var13 < class230.field3653.length; var13++) {
                                if (class230.field3653[var13] == var12 && var3[var13] != null) {
                                    class25.method206(class176.field2765, var9, -6540, arg0, (var10 & 0x7) * 8, var5 * 8, (var11 & 0x7) * 8, var4, var3[var13], var8, var6 * 8);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(I)V")
    public static void method1844(int arg0) {
        if (arg0 != 29158) {
            method1842(-91, true);
        }
        field4369 = null;
    }

    @OriginalMember(owner = "client!of", name = "b", descriptor = "(I)V")
    public static final void method1845(int arg0) {
        class8.field163.method1888(arg0 + 110);
        class57.field944.method1888(109);
        if (arg0 == 8) {
            field4373++;
            class171.field2664.method1888(114);
            class161.field2504.method1888(-124);
        }
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(Lde;I)V")
    public static final void method1846(class111 arg0, int arg1) {
        field4370++;
        long var2 = 0L;
        if (arg0.field1821 == 0) {
            var2 = class237.method1630(arg0.field1814, arg0.field1824, arg0.field1816);
        }
        int var4 = 0;
        int var5 = -1;
        if (arg0.field1821 == 1) {
            var2 = class170.method1145(arg0.field1814, arg0.field1824, arg0.field1816);
        }
        if (arg0.field1821 == 2) {
            var2 = class6.method61(arg0.field1814, arg0.field1824, arg0.field1816);
        }
        int var6 = 0;
        if (arg0.field1821 == 3) {
            var2 = class243.method1680(arg0.field1814, arg0.field1824, arg0.field1816);
        }
        if (var2 != 0L) {
            var5 = Integer.MAX_VALUE & (int) (var2 >>> 32);
            var4 = ((int) var2 & 0x7D9F1) >> 14;
            var6 = ((int) var2 & 0x35315A) >> 20;
        }
        if (arg1 <= 126) {
            field4375 = 79;
        }
        arg0.field1819 = var4;
        arg0.field1822 = var5;
        arg0.field1810 = var6;
    }
}
