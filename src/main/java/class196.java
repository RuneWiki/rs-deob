import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nb")
public class class196 {

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "[B")
    public static byte[] field2862;

    @OriginalMember(owner = "client!nb", name = "e", descriptor = "Lri;")
    public static class73 field2865;

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "I")
    public static int field2861;

    @OriginalMember(owner = "client!nb", name = "d", descriptor = "Lwp;")
    public static class118 field2864;

    @OriginalMember(owner = "client!nb", name = "c", descriptor = "[J")
    public static long[] field2863;

    static {
        int var0 = 0;
        field2862 = new byte[32896];
        for (int var1 = 0; var1 < 256; var1++) {
            for (int var2 = 0; var2 <= var1; var2++) {
                field2862[var0++] = (byte) ((int) (255.0D / Math.sqrt((double) ((float) (var1 * var1 + (var2 * var2 + 65535)) / 65535.0F))));
            }
        }
        field2865 = new class73(51, -1);
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(III)Lsm;", line = 8)
    public static final class185 method1340(int arg0, int arg1, int arg2) {
        class518 var3 = class108.field1553[arg0][arg1][arg2];
        return var3 == null || var3.field7550 == null ? null : var3.field7550;
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(I)V", line = 17)
    public static final void method1341(int arg0) {
        field2861++;
        class143.field2142.method817(-4);
        for (class118 var1 = (class118) class312.field4467.method816(105); var1 != null; var1 = (class118) class312.field4467.method812(103)) {
            if (var1.field1781 < 1000) {
                var1.method2049(-110);
                class143.field2142.method809(var1, false);
            }
        }
        class143.field2142.method821(-32686, class312.field4467);
        if (arg0 != -2) {
            return;
        }
        int var2 = -1;
        class320 var3 = (class320) class111.field1597.method816(arg0 ^ 0xFFFFFF93);
        if (var3 != null) {
            var2 = var3.method239(-88);
        }
        if (!class207.field2963) {
            if (var2 == 0 && (class242.field3574 == 1 && class450.field6706 > 2 || class278.method1818(arg0 + 4521))) {
                var2 = 2;
            }
            if (var2 == 2 && class450.field6706 > 0 && var3 != null) {
                if (class283.field4065 == null && class62.field940 == 0) {
                    class451.method2722(var3.method243((byte) -109), var3.method238(88), -7197);
                } else {
                    class378.field5763 = 2;
                }
            }
            if (var2 == 0 && class450.field6706 > 0) {
                class147.method968((byte) -106);
            }
            if (class283.field4065 == null && class62.field940 == 0) {
                class378.field5763 = 0;
                field2864 = null;
                return;
            }
            return;
        }
        if (var2 == -1) {
            int var4 = class54.field838.method1751(arg0 + 34);
            int var5 = class54.field838.method1749((byte) -125);
            if ((class25.field267 - 10) > var4 || var4 > (class85.field1299 + class25.field267 + 10) || class11.field148 - 10 > var5 || class11.field148 + class61.field928 + 10 < var5) {
                class207.field2963 = false;
                class83.method493((byte) 103, class25.field267, class61.field928, class11.field148, class85.field1299);
            }
        }
        if (var2 != 0) {
            return;
        }
        int var6 = class25.field267;
        int var7 = class11.field148;
        int var8 = class85.field1299;
        int var9 = var3.method243((byte) -109);
        int var10 = var3.method238(110);
        int var11 = -1;
        for (int var12 = 0; var12 < class450.field6706; var12++) {
            if (class402.field6034) {
                int var16 = var7 + ((class450.field6706 - 1 + -var12) * 16) + 33;
                if (var6 < var9 && var9 < var6 + var8 && var10 > var16 - 13 && (var16 + 4) > var10) {
                    var11 = var12;
                }
            } else {
                int var17 = (class450.field6706 - var12 - 1) * 16 + (var7 + 31);
                if (var6 < var9 && var9 < (var6 + var8) && var17 - 13 < var10 && var10 < var17 + 3) {
                    var11 = var12;
                }
            }
        }
        if (var11 != -1) {
            int var13 = 0;
            class285 var14 = new class285(class312.field4467);
            for (class118 var15 = (class118) var14.method1842((byte) -117); var15 != null; var15 = (class118) var14.method1843(127)) {
                if (var11 == var13) {
                    class37.method214(var15, var10, false, var9);
                }
                var13++;
            }
        }
        class207.field2963 = false;
        class83.method493((byte) 118, class25.field267, class61.field928, class11.field148, class85.field1299);
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(B)V", line = 172)
    public static void method1342(byte arg0) {
        field2862 = null;
        if (arg0 == -81) {
            field2864 = null;
            field2865 = null;
            field2863 = null;
        }
    }
}
