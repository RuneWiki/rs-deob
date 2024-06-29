import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eh")
public class class105 extends class270 {

    @OriginalMember(owner = "client!eh", name = "U", descriptor = "I")
    private int field1715 = 4096;

    @OriginalMember(owner = "client!eh", name = "W", descriptor = "I")
    private int field1717 = 4096;

    @OriginalMember(owner = "client!eh", name = "Z", descriptor = "I")
    private int field1720 = 4096;

    @OriginalMember(owner = "client!eh", name = "V", descriptor = "I")
    public static int field1716 = 1;

    @OriginalMember(owner = "client!eh", name = "T", descriptor = "I")
    public static int field1714;

    @OriginalMember(owner = "client!eh", name = "X", descriptor = "I")
    public static int field1718;

    @OriginalMember(owner = "client!eh", name = "Y", descriptor = "I")
    public static int field1719;

    @OriginalMember(owner = "client!eh", name = "ab", descriptor = "I")
    public static int field1721;

    @OriginalMember(owner = "client!eh", name = "cb", descriptor = "I")
    public static int field1723;

    @OriginalMember(owner = "client!eh", name = "bb", descriptor = "Lhi;")
    public static class26 field1722;

    @OriginalMember(owner = "client!eh", name = "db", descriptor = "Lhi;")
    public static class26 field1724;

    @OriginalMember(owner = "client!eh", name = "S", descriptor = "[Lwg;")
    public static class24[] field1713;

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(ZI)[[I", line = 6)
    public final int[][] method11(boolean arg0, int arg1) {
        field1723++;
        if (arg0) {
            this.field1717 = 10;
        }
        int[][] var3 = this.field4589.method605(arg1, 19195);
        if (this.field4589.field1320) {
            int[][] var4 = this.method1855(false, arg1, 0);
            int[] var5 = var4[1];
            int[] var6 = var4[0];
            int[] var7 = var3[0];
            int[] var8 = var4[2];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; var11 < class109.field1770; var11++) {
                int var12 = var6[var11];
                int var13 = var8[var11];
                int var14 = var5[var11];
                if (var12 == var13 && var13 == var14) {
                    var7[var11] = this.field1717 * var12 >> 12;
                    var9[var11] = this.field1715 * var13 >> 12;
                    var10[var11] = this.field1720 * var14 >> 12;
                } else {
                    var7[var11] = this.field1717;
                    var9[var11] = this.field1715;
                    var10[var11] = this.field1720;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!eh", name = "c", descriptor = "(I)V", line = 73)
    public static void method820(int arg0) {
        if (arg0 >= -15) {
            field1716 = -49;
        }
        field1713 = null;
        field1724 = null;
        field1722 = null;
    }

    @OriginalMember(owner = "client!eh", name = "<init>", descriptor = "()V", line = 86)
    public class105() {
        super(1, false);
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(Lmi;II)V", line = 100)
    public final void method8(class92 arg0, int arg1, int arg2) {
        if (arg1 == 0) {
            this.field1717 = arg0.method721(54);
        } else if (arg1 == 1) {
            this.field1715 = arg0.method721(115);
        } else if (arg1 == 2) {
            this.field1720 = arg0.method721(112);
        }
        int var5 = -123 / ((-arg2 - 8) / 53);
        field1718++;
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(ZLhi;)V", line = 136)
    public static final void method821(boolean arg0, class26 arg1) {
        field1719++;
        arg1.method153((byte) 110, class91.field1441);
        if (!arg0) {
            method820(101);
        }
    }

    @OriginalMember(owner = "client!eh", name = "d", descriptor = "(I)V", line = 155)
    public static final void method822(int arg0) {
        field1714++;
        class277 var1 = (class277) class241.field4113.method334(-18673);
        if (arg0 != 0) {
            method822(33);
        }
        while (var1 != null) {
            class194 var2 = var1.field4760;
            if (class7.field85 != var2.field3274 || var2.field3271) {
                var1.method1444((byte) 89);
            } else if (var2.field3281 <= class199.field3367) {
                var2.method1358((byte) 35, class277.field4757);
                if (var2.field3271) {
                    var1.method1444((byte) 89);
                } else {
                    class80.method618(var2.field3274, var2.field3268, var2.field3282, var2.field3279, 60, var2, 0, -1L, false);
                }
            }
            var1 = (class277) class241.field4113.method335((byte) 64);
        }
    }
}
