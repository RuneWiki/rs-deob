import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rga")
public class class220 {

    @OriginalMember(owner = "client!rga", name = "c", descriptor = "[I")
    public static int[] field3581 = new int[8];

    @OriginalMember(owner = "client!rga", name = "b", descriptor = "I")
    public static int field3580;

    @OriginalMember(owner = "client!rga", name = "d", descriptor = "I")
    public static int field3582;

    @OriginalMember(owner = "client!rga", name = "e", descriptor = "I")
    public static int field3583;

    @OriginalMember(owner = "client!rga", name = "f", descriptor = "I")
    public static int field3584;

    @OriginalMember(owner = "client!rga", name = "g", descriptor = "Lgh;")
    public static class509 field3585;

    @OriginalMember(owner = "client!rga", name = "a", descriptor = "[Lf;")
    public static class702[] field3579;

    @OriginalMember(owner = "client!rga", name = "a", descriptor = "(II)Z", line = 4)
    public static final boolean method1632(int arg0, int arg1) {
        if (arg1 <= 6) {
            field3585 = null;
        }
        field3580++;
        return arg0 == 0 || arg0 == 1 || arg0 == 2;
    }

    @OriginalMember(owner = "client!rga", name = "a", descriptor = "(I)V", line = 23)
    public static void method1633(int arg0) {
        field3581 = null;
        if (arg0 != 97) {
            method1634((byte) -62);
        }
        field3585 = null;
        field3579 = null;
    }

    @OriginalMember(owner = "client!rga", name = "a", descriptor = "(B)V", line = 55)
    public static final void method1634(byte arg0) {
        field3582++;
        if (class162.field2746 < 1024.0F) {
            class162.field2746 = 1024.0F;
        }
        if (class162.field2746 > 3072.0F) {
            class162.field2746 = 3072.0F;
        }
        while (class37.field514 >= 16384.0F) {
            class37.field514 -= 16384.0F;
        }
        while (class37.field514 < 0.0F) {
            class37.field514 += 16384.0F;
        }
        int var1 = class686.field9621 >> 9;
        int var2 = class473.field7001 >> 9;
        if (arg0 != 28) {
            return;
        }
        int var3 = class202.method1568(class686.field9621, class423.field6439, class473.field7001, 2);
        int var4 = 0;
        if (var1 > 3 && var2 > 3 && var1 < (class275.field4426 - 4) && var2 < class417.field6374 - 4) {
            for (int var5 = var1 - 4; var5 <= (var1 + 4); var5++) {
                for (int var6 = var2 - 4; var6 <= var2 + 4; var6++) {
                    int var7 = class423.field6439;
                    if (var7 < 3 && class437.method2774(true, var5, var6)) {
                        var7++;
                    }
                    int var8 = 0;
                    if (class673.field9483.field1679 != null && class673.field9483.field1679[var7] != null) {
                        var8 = (class673.field9483.field1679[var7][var5][var6] & 0xFF) * 8;
                    }
                    if (class587.field8346 != null && class587.field8346[var7] != null) {
                        int var9 = var3 + (var8 - class587.field8346[var7].method479(var6, var5, -111));
                        if (var4 < var9) {
                            var4 = var9;
                        }
                    }
                }
            }
        }
        int var10 = (var4 >> 2) * 1536;
        if (var10 > 786432) {
            var10 = 786432;
        }
        if (var10 < 262144) {
            var10 = 262144;
        }
        if (var10 > class677.field9529) {
            class677.field9529 += (var10 - class677.field9529) / 24;
        } else if (class677.field9529 > var10) {
            class677.field9529 += (var10 - class677.field9529) / 80;
            return;
        }
    }
}
